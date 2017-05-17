
create database projetopoown2;

use projetopoown2;

-- -----------------------------------------------------
#Tabela ENDEREÇO
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS endereco(
  `cod_endereco` INT NOT NULL AUTO_INCREMENT,
  `rua` VARCHAR(45) NOT NULL,
  `logradouro` VARCHAR(45) NULL,
  `cep` INT NOT NULL,
  `bairro` VARCHAR(45) NOT NULL,
  `cidade` VARCHAR(45) NOT NULL,
  `numero` VARCHAR(45) NOT NULL,
  `complemento` VARCHAR(45) NULL,
  `estado` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`cod_endereco`))
ENGINE = InnoDB;



-- -----------------------------------------------------
#Tabela Supermercado
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS sp (
  `cod_sp` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(60) NOT NULL,
  `endereco_cod_endereco` INT NOT NULL,
  PRIMARY KEY (`cod_sp`, `endereco_cod_endereco`),
  UNIQUE INDEX `nome_UNIQUE` (`nome` ASC),
  UNIQUE INDEX `cod_sp_UNIQUE` (`cod_sp` ASC),
  INDEX `fk_sp_endereco_idx` (`endereco_cod_endereco` ASC),
  CONSTRAINT `fk_sp_endereco`
    FOREIGN KEY (`endereco_cod_endereco`)
    REFERENCES `endereco` (`cod_endereco`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
#Tabela MARCA
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS marca (
  `cod_marca` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`cod_marca`));

-- -----------------------------------------------------
#Tabela PRODUTO
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS produto (
  `cod_produto` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `cod_barras` INT NOT NULL,
  `kg` DOUBLE NULL,
  `marca_cod_marca` INT NOT NULL,
  PRIMARY KEY (`cod_produto`, `marca_cod_marca`),
  UNIQUE INDEX `cod_produto_UNIQUE` (`cod_produto` ASC),
  INDEX `fk_produto_marca1_idx` (`marca_cod_marca` ASC),
  CONSTRAINT `fk_produto_marca1`
    FOREIGN KEY (`marca_cod_marca`)
    REFERENCES `marca` (`cod_marca`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
#Tabela PRODUTO_DO_SP
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS produto_do_sp (
  `produto_cod_produto` INT NOT NULL,
  `produto_marca_cod_marca` INT NOT NULL,
  `sp_cod_sp` INT NOT NULL,
  `sp_endereco_cod_endereco` INT NOT NULL,
  PRIMARY KEY (`produto_cod_produto`, `produto_marca_cod_marca`, `sp_cod_sp`, `sp_endereco_cod_endereco`),
  INDEX `fk_produto_has_sp_sp1_idx` (`sp_cod_sp` ASC, `sp_endereco_cod_endereco` ASC),
  INDEX `fk_produto_has_sp_produto1_idx` (`produto_cod_produto` ASC, `produto_marca_cod_marca` ASC),
  CONSTRAINT `fk_produto_has_sp_produto1`
    FOREIGN KEY (`produto_cod_produto` , `produto_marca_cod_marca`)
    REFERENCES `produto` (`cod_produto` , `marca_cod_marca`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_produto_has_sp_sp1`
    FOREIGN KEY (`sp_cod_sp` , `sp_endereco_cod_endereco`)
    REFERENCES `sp` (`cod_sp` , `endereco_cod_endereco`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);



select * from produto;

