--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccountCreateRequest' definition.
--


--
-- SELECT template for table `AdAccountCreateRequest`
--
SELECT `country`, `name`, `owner_user_id` FROM `AdAccountCreateRequest` WHERE 1;

--
-- INSERT template for table `AdAccountCreateRequest`
--
INSERT INTO `AdAccountCreateRequest`(`country`, `name`, `owner_user_id`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AdAccountCreateRequest`
--
UPDATE `AdAccountCreateRequest` SET `country` = ?, `name` = ?, `owner_user_id` = ? WHERE 1;

--
-- DELETE template for table `AdAccountCreateRequest`
--
DELETE FROM `AdAccountCreateRequest` WHERE 0;

