--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadFormArrayResponse_items_inner' definition.
--


--
-- SELECT template for table `LeadFormArrayResponse_items_inner`
--
SELECT `data`, `exceptions` FROM `LeadFormArrayResponse_items_inner` WHERE 1;

--
-- INSERT template for table `LeadFormArrayResponse_items_inner`
--
INSERT INTO `LeadFormArrayResponse_items_inner`(`data`, `exceptions`) VALUES (?, ?);

--
-- UPDATE template for table `LeadFormArrayResponse_items_inner`
--
UPDATE `LeadFormArrayResponse_items_inner` SET `data` = ?, `exceptions` = ? WHERE 1;

--
-- DELETE template for table `LeadFormArrayResponse_items_inner`
--
DELETE FROM `LeadFormArrayResponse_items_inner` WHERE 0;

