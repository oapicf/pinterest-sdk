--
-- Pinterest REST API.
-- Prepared SQL queries for 'BidOptionsAppTypeMultipliers' definition.
--


--
-- SELECT template for table `BidOptionsAppTypeMultipliers`
--
SELECT `android_mobile`, `android_tablet`, `ipad`, `iphone`, `web`, `web_mobile` FROM `BidOptionsAppTypeMultipliers` WHERE 1;

--
-- INSERT template for table `BidOptionsAppTypeMultipliers`
--
INSERT INTO `BidOptionsAppTypeMultipliers`(`android_mobile`, `android_tablet`, `ipad`, `iphone`, `web`, `web_mobile`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BidOptionsAppTypeMultipliers`
--
UPDATE `BidOptionsAppTypeMultipliers` SET `android_mobile` = ?, `android_tablet` = ?, `ipad` = ?, `iphone` = ?, `web` = ?, `web_mobile` = ? WHERE 1;

--
-- DELETE template for table `BidOptionsAppTypeMultipliers`
--
DELETE FROM `BidOptionsAppTypeMultipliers` WHERE 0;

