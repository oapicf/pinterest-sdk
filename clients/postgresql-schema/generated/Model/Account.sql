--
-- "Pinterest REST API"
-- Prepared SQL queries for 'Account' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'account'
--
SELECT about, account_type, board_count, business_name, follower_count, following_count, "id", monthly_views, pin_count, profile_image, username, website_url FROM account WHERE 1=1;

--
-- INSERT template for table 'account'
--
INSERT INTO account (about, account_type, board_count, business_name, follower_count, following_count, "id", monthly_views, pin_count, profile_image, username, website_url) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'account'
--
UPDATE account SET about = ?, account_type = ?, board_count = ?, business_name = ?, follower_count = ?, following_count = ?, "id" = ?, monthly_views = ?, pin_count = ?, profile_image = ?, username = ?, website_url = ? WHERE 1=2;

--
-- DELETE template for table 'account'
--
DELETE FROM account WHERE 1=2;

