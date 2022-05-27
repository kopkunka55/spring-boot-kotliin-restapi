\c amazon

CREATE SCHEMA devschema;

CREATE EXTENSION "uuid-ossp";

CREATE ROLE dev WITH LOGIN PASSWORD 'password';

GRANT ALL PRIVILEGES ON SCHEMA devschema TO dev;