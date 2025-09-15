CREATE TABLE users
(
    id       BIGSERIAL PRIMARY KEY,
    email    VARCHAR(64) UNIQUE NOT NULL,
    password VARCHAR(128)       NOT NULL,
    nickname VARCHAR(64)        NOT NULL
);

CREATE TABLE posts
(
    id      SERIAL PRIMARY KEY,
    content VARCHAR(256) NOT NULL,
    user_id BIGINT REFERENCES users (id)
);