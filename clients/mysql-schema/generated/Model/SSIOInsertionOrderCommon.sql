--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOInsertionOrderCommon' definition.
--


--
-- SELECT template for table `SSIOInsertionOrderCommon`
--
SELECT `agency_link`, `billing_contact_email`, `billing_contact_firstname`, `billing_contact_lastname`, `budget_amount`, `end_date`, `media_contact_email`, `media_contact_firstname`, `media_contact_lastname`, `po_number`, `start_date`, `user_email` FROM `SSIOInsertionOrderCommon` WHERE 1;

--
-- INSERT template for table `SSIOInsertionOrderCommon`
--
INSERT INTO `SSIOInsertionOrderCommon`(`agency_link`, `billing_contact_email`, `billing_contact_firstname`, `billing_contact_lastname`, `budget_amount`, `end_date`, `media_contact_email`, `media_contact_firstname`, `media_contact_lastname`, `po_number`, `start_date`, `user_email`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SSIOInsertionOrderCommon`
--
UPDATE `SSIOInsertionOrderCommon` SET `agency_link` = ?, `billing_contact_email` = ?, `billing_contact_firstname` = ?, `billing_contact_lastname` = ?, `budget_amount` = ?, `end_date` = ?, `media_contact_email` = ?, `media_contact_firstname` = ?, `media_contact_lastname` = ?, `po_number` = ?, `start_date` = ?, `user_email` = ? WHERE 1;

--
-- DELETE template for table `SSIOInsertionOrderCommon`
--
DELETE FROM `SSIOInsertionOrderCommon` WHERE 0;

