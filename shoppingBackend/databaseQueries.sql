CREATE TABLE category(
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(50) NULL,
  description VARCHAR(255) NULL,
  image_url VARCHAR(50) NULL,
  is_active BOOLEAN,
  CONSTRAINT pk_category_id PRIMARY KEY (id));
