--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeedIngestionErrors' definition.
--


--
-- SELECT template for table `CatalogsFeedIngestionErrors`
--
SELECT `LINE_LEVEL_INTERNAL_ERROR`, `LARGE_PRODUCT_COUNT_DECREASE`, `ACCOUNT_FLAGGED`, `IMAGE_LEVEL_INTERNAL_ERROR`, `IMAGE_FILE_NOT_ACCESSIBLE`, `IMAGE_MALFORMED_URL`, `IMAGE_FILE_NOT_FOUND`, `IMAGE_INVALID_FILE` FROM `CatalogsFeedIngestionErrors` WHERE 1;

--
-- INSERT template for table `CatalogsFeedIngestionErrors`
--
INSERT INTO `CatalogsFeedIngestionErrors`(`LINE_LEVEL_INTERNAL_ERROR`, `LARGE_PRODUCT_COUNT_DECREASE`, `ACCOUNT_FLAGGED`, `IMAGE_LEVEL_INTERNAL_ERROR`, `IMAGE_FILE_NOT_ACCESSIBLE`, `IMAGE_MALFORMED_URL`, `IMAGE_FILE_NOT_FOUND`, `IMAGE_INVALID_FILE`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsFeedIngestionErrors`
--
UPDATE `CatalogsFeedIngestionErrors` SET `LINE_LEVEL_INTERNAL_ERROR` = ?, `LARGE_PRODUCT_COUNT_DECREASE` = ?, `ACCOUNT_FLAGGED` = ?, `IMAGE_LEVEL_INTERNAL_ERROR` = ?, `IMAGE_FILE_NOT_ACCESSIBLE` = ?, `IMAGE_MALFORMED_URL` = ?, `IMAGE_FILE_NOT_FOUND` = ?, `IMAGE_INVALID_FILE` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeedIngestionErrors`
--
DELETE FROM `CatalogsFeedIngestionErrors` WHERE 0;

