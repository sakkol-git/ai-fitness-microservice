CREATE TABLE users (
                       id UUID PRIMARY KEY,

                       email VARCHAR(255) NOT NULL UNIQUE,
                       password VARCHAR(255) NOT NULL,

                       first_name VARCHAR(255),
                       last_name VARCHAR(255),

                       role VARCHAR(50) NOT NULL DEFAULT 'USER',

                       create_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                       update_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE INDEX idx_users_email ON users(email);
CREATE INDEX idx_users_role ON users(role);