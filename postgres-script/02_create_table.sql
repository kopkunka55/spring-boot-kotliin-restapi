\c amazon

CREATE TABLE devschema.product (
    product_id uuid PRIMARY KEY DEFAULT uuid_generate_v4(),
    product_name VARCHAR (50) NOT NULL,
    stock INT DEFAULT 0,
    created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

GRANT ALL PRIVILEGES ON devschema.product TO dev;

INSERT INTO devschema.product (product_name) VALUES
    ('Mac Book Air 2020'),
    ('Kotlin Book'),
    ('Tesla Car');