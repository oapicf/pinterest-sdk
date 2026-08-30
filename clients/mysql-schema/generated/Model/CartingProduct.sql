--
-- Pinterest REST API.
-- Prepared SQL queries for 'CartingProduct' definition.
--


--
-- SELECT template for table `CartingProduct`
--
SELECT `carting_product_id`, `display_preferred_retailers_only`, `display_product_price`, `preferred_retailers`, `randomize_preferred_retailers` FROM `CartingProduct` WHERE 1;

--
-- INSERT template for table `CartingProduct`
--
INSERT INTO `CartingProduct`(`carting_product_id`, `display_preferred_retailers_only`, `display_product_price`, `preferred_retailers`, `randomize_preferred_retailers`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CartingProduct`
--
UPDATE `CartingProduct` SET `carting_product_id` = ?, `display_preferred_retailers_only` = ?, `display_product_price` = ?, `preferred_retailers` = ?, `randomize_preferred_retailers` = ? WHERE 1;

--
-- DELETE template for table `CartingProduct`
--
DELETE FROM `CartingProduct` WHERE 0;

