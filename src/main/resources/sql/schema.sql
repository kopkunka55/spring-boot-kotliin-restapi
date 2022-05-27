CREATE TABLE IF NOT EXISTS devschema.product (
    product_id uuid PRIMARY KEY DEFAULT uuid_generate_v4(),
    product_name VARCHAR (50) NOT NULL,
    stock INT DEFAULT 0,
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);