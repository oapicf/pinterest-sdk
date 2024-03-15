--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOInsertionOrderCommon' definition.
--


--
-- SELECT template for table `SSIOInsertionOrderCommon`
--
SELECT `start_date`, `end_date`, `po_number`, `budget_amount`, `billing_contact_firstname`, `billing_contact_lastname`, `billing_contact_email`, `media_contact_firstname`, `media_contact_lastname`, `media_contact_email`, `agency_link`, `user_email` FROM `SSIOInsertionOrderCommon` WHERE 1;

--
-- INSERT template for table `SSIOInsertionOrderCommon`
--
INSERT INTO `SSIOInsertionOrderCommon`(`start_date`, `end_date`, `po_number`, `budget_amount`, `billing_contact_firstname`, `billing_contact_lastname`, `billing_contact_email`, `media_contact_firstname`, `media_contact_lastname`, `media_contact_email`, `agency_link`, `user_email`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SSIOInsertionOrderCommon`
--
UPDATE `SSIOInsertionOrderCommon` SET `start_date` = ?, `end_date` = ?, `po_number` = ?, `budget_amount` = ?, `billing_contact_firstname` = ?, `billing_contact_lastname` = ?, `billing_contact_email` = ?, `media_contact_firstname` = ?, `media_contact_lastname` = ?, `media_contact_email` = ?, `agency_link` = ?, `user_email` = ? WHERE 1;

--
-- DELETE template for table `SSIOInsertionOrderCommon`
--
DELETE FROM `SSIOInsertionOrderCommon` WHERE 0;

