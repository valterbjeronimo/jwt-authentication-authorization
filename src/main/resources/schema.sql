CREATE TABLE IF NOT EXISTS tb_roles (
    role_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS tb_users (
    user_id CHAR(36) PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS tb_tweets (
    tweet_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id CHAR(36),
    content TEXT NOT NULL,
    creation_timestamp TIMESTAMP,
    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES tb_users(user_id)
);

CREATE TABLE IF NOT EXISTS tb_users_roles (
    user_id CHAR(36),
    role_id BIGINT,
    PRIMARY KEY (user_id, role_id),
    CONSTRAINT fk_user_role FOREIGN KEY (user_id) REFERENCES tb_users(user_id),
    CONSTRAINT fk_role_user FOREIGN KEY (role_id) REFERENCES tb_roles(role_id)
);
