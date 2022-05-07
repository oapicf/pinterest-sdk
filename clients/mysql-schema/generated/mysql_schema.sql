/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */

-- --------------------------------------------------------

--
-- Table structure for table `Account` generated from model 'Account'
--

CREATE TABLE IF NOT EXISTS `Account` (
  `account_type` ENUM('PINNER', 'BUSINESS') DEFAULT NULL COMMENT 'Type of account',
  `profile_image` TEXT DEFAULT NULL,
  `website_url` TEXT DEFAULT NULL,
  `username` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdAccount` generated from model 'AdAccount'
--

CREATE TABLE IF NOT EXISTS `AdAccount` (
  `id` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL,
  `owner` TEXT DEFAULT NULL,
  `country` TEXT DEFAULT NULL,
  `currency` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Ad_account_owner` generated from model 'AdUnderscoreaccountUnderscoreowner'
--

CREATE TABLE IF NOT EXISTS `Ad_account_owner` (
  `username` TEXT DEFAULT NULL COMMENT 'Public username for the user account'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupResponse` generated from model 'AdGroupResponse'
--

CREATE TABLE IF NOT EXISTS `AdGroupResponse` (
  `name` TEXT DEFAULT NULL COMMENT 'Ad group name.',
  `status` TEXT DEFAULT NULL COMMENT 'Ad group/entity status.',
  `budget_in_micro_currency` INT DEFAULT NULL COMMENT 'Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.',
  `bid_in_micro_currency` INT DEFAULT NULL COMMENT 'Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.',
  `budget_type` ENUM('DAILY', 'LIFETIME', 'CBO_ADGROUP') DEFAULT NULL COMMENT 'Budget type. If DAILY, an ad group&#39;s daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group &#x60;start_time&#x60; and &#x60;end_time&#x60; range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.',
  `start_time` INT DEFAULT NULL COMMENT 'Ad group start time. Unix timestamp in seconds. Defaults to current time.',
  `end_time` INT DEFAULT NULL COMMENT 'Ad group end time. Unix timestamp in seconds.',
  `targeting_spec` JSON DEFAULT NULL COMMENT 'Ad group targeting specification defining the ad group target audience. For example, &#39;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}&#39;',
  `lifetime_frequency_cap` INT DEFAULT NULL COMMENT 'Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\\\&quot;/docs/redoc/#section/Billable-event\\\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.',
  `tracking_urls` TEXT DEFAULT NULL COMMENT 'Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.',
  `auto_targeting_enabled` TINYINT(1) DEFAULT NULL COMMENT 'Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.',
  `placement_group` TEXT DEFAULT NULL COMMENT '&lt;a href&#x3D;\\\&quot;/docs/redoc/#section/Placement-group\\\&quot;&gt;Placement group&lt;/a&gt;.',
  `pacing_delivery_type` TEXT DEFAULT NULL COMMENT 'Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day.',
  `conversion_learning_mode_type` ENUM('NOT_ACTIVE', 'ACTIVE', 'null') DEFAULT NULL COMMENT 'oCPM learn mode',
  `summary_status` TEXT DEFAULT NULL COMMENT 'Ad group summary status.',
  `feed_profile_id` TEXT DEFAULT NULL COMMENT 'Feed Profile ID associated to the adgroup.',
  `campaign_id` TEXT DEFAULT NULL COMMENT 'Campaign ID of the ad group.',
  `billable_event` TEXT DEFAULT NULL,
  `id` TEXT DEFAULT NULL COMMENT 'Ad group ID.',
  `type` TEXT DEFAULT NULL COMMENT 'Always \&quot;adgroup\&quot;.',
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Advertiser ID.',
  `created_time` INT DEFAULT NULL COMMENT 'Ad group creation time. Unix timestamp in seconds.',
  `updated_time` INT DEFAULT NULL COMMENT 'Ad group last update time. Unix timestamp in seconds.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupResponse_allOf` generated from model 'AdGroupResponseUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `AdGroupResponse_allOf` (
  `name` TEXT DEFAULT NULL COMMENT 'Ad group name.',
  `status` TEXT DEFAULT NULL COMMENT 'Ad group/entity status.',
  `budget_in_micro_currency` INT DEFAULT NULL COMMENT 'Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.',
  `bid_in_micro_currency` INT DEFAULT NULL COMMENT 'Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.',
  `budget_type` ENUM('DAILY', 'LIFETIME', 'CBO_ADGROUP') DEFAULT NULL COMMENT 'Budget type. If DAILY, an ad group&#39;s daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group &#x60;start_time&#x60; and &#x60;end_time&#x60; range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.',
  `start_time` INT DEFAULT NULL COMMENT 'Ad group start time. Unix timestamp in seconds. Defaults to current time.',
  `end_time` INT DEFAULT NULL COMMENT 'Ad group end time. Unix timestamp in seconds.',
  `targeting_spec` JSON DEFAULT NULL COMMENT 'Ad group targeting specification defining the ad group target audience. For example, &#39;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}&#39;',
  `lifetime_frequency_cap` INT DEFAULT NULL COMMENT 'Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\\\&quot;/docs/redoc/#section/Billable-event\\\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.',
  `tracking_urls` TEXT DEFAULT NULL COMMENT 'Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.',
  `auto_targeting_enabled` TINYINT(1) DEFAULT NULL COMMENT 'Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.',
  `placement_group` TEXT DEFAULT NULL COMMENT '&lt;a href&#x3D;\\\&quot;/docs/redoc/#section/Placement-group\\\&quot;&gt;Placement group&lt;/a&gt;.',
  `pacing_delivery_type` TEXT DEFAULT NULL COMMENT 'Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day.',
  `conversion_learning_mode_type` ENUM('NOT_ACTIVE', 'ACTIVE', 'null') DEFAULT NULL COMMENT 'oCPM learn mode',
  `summary_status` TEXT DEFAULT NULL COMMENT 'Ad group summary status.',
  `feed_profile_id` TEXT DEFAULT NULL COMMENT 'Feed Profile ID associated to the adgroup.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupResponse_allOf_1` generated from model 'AdGroupResponseUnderscoreallOfUnderscore1'
--

CREATE TABLE IF NOT EXISTS `AdGroupResponse_allOf_1` (
  `campaign_id` TEXT DEFAULT NULL COMMENT 'Campaign ID of the ad group.',
  `billable_event` TEXT DEFAULT NULL,
  `id` TEXT DEFAULT NULL COMMENT 'Ad group ID.',
  `type` TEXT DEFAULT NULL COMMENT 'Always \&quot;adgroup\&quot;.',
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Advertiser ID.',
  `created_time` INT DEFAULT NULL COMMENT 'Ad group creation time. Unix timestamp in seconds.',
  `updated_time` INT DEFAULT NULL COMMENT 'Ad group last update time. Unix timestamp in seconds.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdResponse` generated from model 'AdResponse'
--

CREATE TABLE IF NOT EXISTS `AdResponse` (
  `ad_group_id` TEXT DEFAULT NULL COMMENT 'ID of the ad group that contains the ad.',
  `android_deep_link` TEXT DEFAULT NULL COMMENT 'Deep link URL for Android devices. Not currently available. Using this field will generate an error.',
  `carousel_android_deep_links` JSON DEFAULT NULL COMMENT 'Comma-separated deep links for the carousel pin on Android.',
  `carousel_destination_urls` JSON DEFAULT NULL COMMENT 'Comma-separated destination URLs for the carousel pin to promote.',
  `carousel_ios_deep_links` JSON DEFAULT NULL COMMENT 'Comma-separated deep links for the carousel pin on iOS.',
  `click_tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking url for the ad clicks.',
  `creative_type` ENUM('REGULAR', 'VIDEO', 'SHOPPING', 'CAROUSEL', 'MAX_VIDEO', 'SHOP_THE_PIN', 'STORY') DEFAULT NULL COMMENT 'Ad creative type enum',
  `destination_url` TEXT DEFAULT NULL COMMENT 'Destination URL.',
  `ios_deep_link` TEXT DEFAULT NULL COMMENT 'Deep link URL for iOS devices. Not currently available. Using this field will generate an error.',
  `is_pin_deleted` TINYINT(1) DEFAULT NULL COMMENT 'Is original pin deleted?',
  `is_removable` TINYINT(1) DEFAULT NULL COMMENT 'Is pin repinnable?',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the ad - 255 chars max.',
  `pin_id` TEXT DEFAULT NULL COMMENT 'Pin ID.',
  `status` TEXT DEFAULT NULL,
  `tracking_urls` TEXT DEFAULT NULL,
  `view_tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking URL for ad impressions.',
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'The ID of the advertiser that this ad belongs to.',
  `campaign_id` TEXT DEFAULT NULL COMMENT 'ID of the ad campaign that contains this ad.',
  `collection_items_destination_url_template` TEXT DEFAULT NULL COMMENT 'Destination URL template for all items within a collections drawer.',
  `created_time` INT DEFAULT NULL COMMENT 'Pin creation time. Unix timestamp in seconds.',
  `id` TEXT DEFAULT NULL COMMENT 'The ID of this ad.',
  `rejected_reasons` JSON DEFAULT NULL COMMENT 'Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;.',
  `rejection_labels` JSON DEFAULT NULL COMMENT 'Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;.',
  `review_status` ENUM('OTHER', 'PENDING', 'REJECTED', 'APPROVED') DEFAULT NULL COMMENT 'Ad review status',
  `type` TEXT DEFAULT NULL COMMENT 'Always \&quot;ad\&quot;.',
  `updated_time` INT DEFAULT NULL COMMENT 'Last update time. Unix timestamp in seconds.',
  `summary_status` TEXT DEFAULT NULL COMMENT 'Ad summary status'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdResponse_allOf` generated from model 'AdResponseUnderscoreallOf'
-- Creation fields
--

CREATE TABLE IF NOT EXISTS `AdResponse_allOf` (
  `ad_group_id` TEXT DEFAULT NULL COMMENT 'ID of the ad group that contains the ad.',
  `android_deep_link` TEXT DEFAULT NULL COMMENT 'Deep link URL for Android devices. Not currently available. Using this field will generate an error.',
  `carousel_android_deep_links` JSON DEFAULT NULL COMMENT 'Comma-separated deep links for the carousel pin on Android.',
  `carousel_destination_urls` JSON DEFAULT NULL COMMENT 'Comma-separated destination URLs for the carousel pin to promote.',
  `carousel_ios_deep_links` JSON DEFAULT NULL COMMENT 'Comma-separated deep links for the carousel pin on iOS.',
  `click_tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking url for the ad clicks.',
  `creative_type` ENUM('REGULAR', 'VIDEO', 'SHOPPING', 'CAROUSEL', 'MAX_VIDEO', 'SHOP_THE_PIN', 'STORY') DEFAULT NULL COMMENT 'Ad creative type enum',
  `destination_url` TEXT DEFAULT NULL COMMENT 'Destination URL.',
  `ios_deep_link` TEXT DEFAULT NULL COMMENT 'Deep link URL for iOS devices. Not currently available. Using this field will generate an error.',
  `is_pin_deleted` TINYINT(1) DEFAULT NULL COMMENT 'Is original pin deleted?',
  `is_removable` TINYINT(1) DEFAULT NULL COMMENT 'Is pin repinnable?',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the ad - 255 chars max.',
  `pin_id` TEXT DEFAULT NULL COMMENT 'Pin ID.',
  `status` TEXT DEFAULT NULL,
  `tracking_urls` TEXT DEFAULT NULL,
  `view_tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking URL for ad impressions.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Creation fields';

--
-- Table structure for table `AdResponse_allOf_1` generated from model 'AdResponseUnderscoreallOfUnderscore1'
--

CREATE TABLE IF NOT EXISTS `AdResponse_allOf_1` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'The ID of the advertiser that this ad belongs to.',
  `campaign_id` TEXT DEFAULT NULL COMMENT 'ID of the ad campaign that contains this ad.',
  `collection_items_destination_url_template` TEXT DEFAULT NULL COMMENT 'Destination URL template for all items within a collections drawer.',
  `created_time` INT DEFAULT NULL COMMENT 'Pin creation time. Unix timestamp in seconds.',
  `id` TEXT DEFAULT NULL COMMENT 'The ID of this ad.',
  `rejected_reasons` JSON DEFAULT NULL COMMENT 'Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;.',
  `rejection_labels` JSON DEFAULT NULL COMMENT 'Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;.',
  `review_status` ENUM('OTHER', 'PENDING', 'REJECTED', 'APPROVED') DEFAULT NULL COMMENT 'Ad review status',
  `type` TEXT DEFAULT NULL COMMENT 'Always \&quot;ad\&quot;.',
  `updated_time` INT DEFAULT NULL COMMENT 'Last update time. Unix timestamp in seconds.',
  `summary_status` TEXT DEFAULT NULL COMMENT 'Ad summary status'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdsAnalyticsCreateAsyncRequest` generated from model 'AdsAnalyticsCreateAsyncRequest'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequest` (
  `start_date` TEXT NOT NULL COMMENT 'Metric report start date (UTC). Format: YYYY-MM-DD',
  `end_date` TEXT NOT NULL COMMENT 'Metric report end date (UTC). Format: YYYY-MM-DD',
  `granularity` TEXT NOT NULL COMMENT 'TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly',
  `click_window_days` TEXT COMMENT 'Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.',
  `engagement_window_days` TEXT COMMENT 'Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.',
  `view_window_days` TEXT COMMENT 'Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.',
  `conversion_report_time` TEXT COMMENT 'The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.',
  `attribution_types` JSON DEFAULT NULL COMMENT 'List of types of attribution for the conversion report',
  `columns` JSON NOT NULL COMMENT 'Metric and entity columns',
  `level` TEXT NOT NULL COMMENT 'Level of the report',
  `report_format` TEXT COMMENT 'Specification for formatting report data',
  `campaign_ids` JSON DEFAULT NULL COMMENT 'List of campaign ids',
  `campaign_statuses` JSON DEFAULT NULL COMMENT 'List of status values for filtering',
  `campaign_objective_types` JSON DEFAULT NULL COMMENT 'List of values for filtering',
  `ad_group_ids` JSON DEFAULT NULL COMMENT 'List of ad group ids',
  `ad_group_statuses` JSON DEFAULT NULL COMMENT 'List of values for filtering',
  `ad_ids` JSON DEFAULT NULL COMMENT 'List of ad ids',
  `ad_statuses` JSON DEFAULT NULL COMMENT 'List of values for filtering',
  `product_group_ids` JSON DEFAULT NULL COMMENT 'List of product group ids',
  `product_group_statuses` JSON DEFAULT NULL COMMENT 'List of values for filtering',
  `product_item_ids` JSON DEFAULT NULL COMMENT 'List of product item ids',
  `targeting_types` JSON DEFAULT NULL COMMENT 'List of targeting types',
  `metrics_filters` JSON DEFAULT NULL COMMENT 'List of metrics filters'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdsAnalyticsCreateAsyncRequest_allOf` generated from model 'AdsAnalyticsCreateAsyncRequestUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequest_allOf` (
  `start_date` TEXT NOT NULL COMMENT 'Metric report start date (UTC). Format: YYYY-MM-DD',
  `end_date` TEXT NOT NULL COMMENT 'Metric report end date (UTC). Format: YYYY-MM-DD',
  `granularity` TEXT NOT NULL COMMENT 'TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly',
  `click_window_days` TEXT COMMENT 'Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.',
  `engagement_window_days` TEXT COMMENT 'Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.',
  `view_window_days` TEXT COMMENT 'Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.',
  `conversion_report_time` TEXT COMMENT 'The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.',
  `attribution_types` JSON DEFAULT NULL COMMENT 'List of types of attribution for the conversion report'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdsAnalyticsCreateAsyncRequest_allOf_1` generated from model 'AdsAnalyticsCreateAsyncRequestUnderscoreallOfUnderscore1'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequest_allOf_1` (
  `columns` JSON NOT NULL COMMENT 'Metric and entity columns',
  `level` TEXT NOT NULL COMMENT 'Level of the report',
  `report_format` TEXT COMMENT 'Specification for formatting report data'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdsAnalyticsCreateAsyncResponse` generated from model 'AdsAnalyticsCreateAsyncResponse'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncResponse` (
  `report_status` TEXT DEFAULT NULL,
  `token` TEXT DEFAULT NULL,
  `message` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdsAnalyticsGetAsyncResponse` generated from model 'AdsAnalyticsGetAsyncResponse'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsGetAsyncResponse` (
  `report_status` TEXT DEFAULT NULL,
  `url` TEXT DEFAULT NULL,
  `size` DECIMAL(20, 9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdsAnalyticsMetricsFilter` generated from model 'AdsAnalyticsMetricsFilter'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsMetricsFilter` (
  `field` TEXT DEFAULT NULL,
  `operator` TEXT DEFAULT NULL,
  `values` JSON DEFAULT NULL COMMENT 'List of values for filtering'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AnalyticsMetricsResponse` generated from model 'AnalyticsMetricsResponse'
--

CREATE TABLE IF NOT EXISTS `AnalyticsMetricsResponse` (
  `daily_metrics` JSON DEFAULT NULL COMMENT 'Array with the requested daily metric records',
  `summary_metrics` JSON DEFAULT NULL COMMENT 'The metric name and value over the requested period for each requested metric'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AnalyticsMetricsResponse_daily_metrics` generated from model 'AnalyticsMetricsResponseUnderscoredailyUnderscoremetrics'
--

CREATE TABLE IF NOT EXISTS `AnalyticsMetricsResponse_daily_metrics` (
  `data_status` ENUM('PROCESSING', 'READY', 'ESTIMATE', 'BEFORE_BUSINESS_CREATED', 'BEFORE_DATA_RETENTION_PERIOD', 'BEFORE_PIN_DATA_RETENTION_PERIOD', 'BEFORE_METRIC_START_DATE', 'BEFORE_CORE_METRIC_START_DATE', 'BEFORE_PIN_FORMAT_METRIC_START_DATE', 'BEFORE_AUDIENCE_METRIC_START_DATE', 'BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE', 'BEFORE_VIDEO_METRIC_START_DATE', 'BEFORE_CONVERSION_METRIC_START_DATE', 'PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD', 'IN_BAD_TAG_DATE', 'BEFORE_PUBLISHED_METRIC_START_DATE', 'BEFORE_ASSIST_METRIC_START_DATE', 'BEFORE_PIN_CREATED', 'BEFORE_ACCOUNT_CLAIMED', 'BEFORE_DEMOGRAPHIC_FILTERS_START_DATE', 'AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD', 'AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD', 'BEFORE_PRODUCT_GROUP_FILTER_START_DATE') DEFAULT NULL COMMENT 'Metrics availablity, e.g., \&quot;READY\&quot;.',
  `date` TEXT DEFAULT NULL COMMENT 'Metrics date (UTC): YYYY-MM-DD.',
  `metrics` JSON DEFAULT NULL COMMENT 'The metric name and daily value for each requested metric'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AvailabilityFilter` generated from model 'AvailabilityFilter'
--

CREATE TABLE IF NOT EXISTS `AvailabilityFilter` (
  `AVAILABILITY` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Board` generated from model 'Board'
-- Board
--

CREATE TABLE IF NOT EXISTS `Board` (
  `id` TEXT DEFAULT NULL,
  `name` TEXT NOT NULL,
  `description` TEXT DEFAULT NULL,
  `owner` TEXT DEFAULT NULL,
  `privacy` ENUM('PUBLIC', 'PROTECTED', 'SECRET') DEFAULT 'PUBLIC' COMMENT 'Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt;'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Board';

--
-- Table structure for table `BoardOwner` generated from model 'BoardOwner'
--

CREATE TABLE IF NOT EXISTS `BoardOwner` (
  `username` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BoardSection` generated from model 'BoardSection'
-- Sections help organize pins within a board.
--

CREATE TABLE IF NOT EXISTS `BoardSection` (
  `id` TEXT DEFAULT NULL,
  `name` VARCHAR(180) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Sections help organize pins within a board.';

--
-- Table structure for table `BoardUpdate` generated from model 'BoardUpdate'
-- Board fields for updates
--

CREATE TABLE IF NOT EXISTS `BoardUpdate` (
  `name` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `privacy` ENUM('PUBLIC', 'SECRET') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Board fields for updates';

--
-- Table structure for table `BrandFilter` generated from model 'BrandFilter'
--

CREATE TABLE IF NOT EXISTS `BrandFilter` (
  `BRAND` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CampaignCommon` generated from model 'CampaignCommon'
-- Campaign Data
--

CREATE TABLE IF NOT EXISTS `CampaignCommon` (
  `ad_account_id` TEXT NOT NULL COMMENT 'Campaign&#39;s Advertiser ID.',
  `name` TEXT DEFAULT NULL COMMENT 'Campaign name.',
  `status` TEXT,
  `lifetime_spend_cap` INT DEFAULT NULL COMMENT 'Campaign total spending cap.',
  `daily_spend_cap` INT DEFAULT NULL COMMENT 'Campaign daily spending cap.',
  `order_line_id` TEXT DEFAULT NULL COMMENT 'Order line ID that appears on the invoice.',
  `tracking_urls` TEXT DEFAULT NULL,
  `start_time` INT DEFAULT NULL COMMENT 'Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.',
  `end_time` INT DEFAULT NULL COMMENT 'Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Campaign Data';

--
-- Table structure for table `CampaignResponse` generated from model 'CampaignResponse'
--

CREATE TABLE IF NOT EXISTS `CampaignResponse` (
  `id` TEXT NOT NULL COMMENT 'Campaign ID.',
  `ad_account_id` TEXT NOT NULL COMMENT 'Campaign&#39;s Advertiser ID.',
  `name` TEXT DEFAULT NULL COMMENT 'Campaign name.',
  `status` TEXT,
  `lifetime_spend_cap` INT DEFAULT NULL COMMENT 'Campaign total spending cap.',
  `daily_spend_cap` INT DEFAULT NULL COMMENT 'Campaign daily spending cap.',
  `order_line_id` TEXT DEFAULT NULL COMMENT 'Order line ID that appears on the invoice.',
  `tracking_urls` TEXT DEFAULT NULL,
  `start_time` INT DEFAULT NULL COMMENT 'Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.',
  `end_time` INT DEFAULT NULL COMMENT 'Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.',
  `objective_type` TEXT DEFAULT NULL,
  `created_time` INT DEFAULT NULL COMMENT 'Campaign creation time. Unix timestamp in seconds.',
  `updated_time` INT DEFAULT NULL COMMENT 'UTC timestamp. Last update time.',
  `type` TEXT DEFAULT NULL COMMENT 'Always \&quot;campaign\&quot;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CampaignResponse_allOf` generated from model 'CampaignResponseUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `CampaignResponse_allOf` (
  `id` TEXT NOT NULL COMMENT 'Campaign ID.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CampaignResponse_allOf_1` generated from model 'CampaignResponseUnderscoreallOfUnderscore1'
--

CREATE TABLE IF NOT EXISTS `CampaignResponse_allOf_1` (
  `objective_type` TEXT DEFAULT NULL,
  `created_time` INT DEFAULT NULL COMMENT 'Campaign creation time. Unix timestamp in seconds.',
  `updated_time` INT DEFAULT NULL COMMENT 'UTC timestamp. Last update time.',
  `type` TEXT DEFAULT NULL COMMENT 'Always \&quot;campaign\&quot;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsDbItem` generated from model 'CatalogsDbItem'
--

CREATE TABLE IF NOT EXISTS `CatalogsDbItem` (
  `created_at` DATETIME DEFAULT NULL,
  `id` TEXT DEFAULT NULL,
  `updated_at` DATETIME DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsFeed` generated from model 'CatalogsFeed'
-- Catalogs Catalogs Feed object
--

CREATE TABLE IF NOT EXISTS `CatalogsFeed` (
  `created_at` DATETIME DEFAULT NULL,
  `id` TEXT DEFAULT NULL,
  `updated_at` DATETIME DEFAULT NULL,
  `default_country` TEXT NOT NULL,
  `default_availability` TEXT NOT NULL,
  `default_currency` TEXT NOT NULL,
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.',
  `format` TEXT NOT NULL,
  `default_locale` TEXT NOT NULL COMMENT 'The locale used within a feed for product descriptions.',
  `credentials` TEXT NOT NULL,
  `location` TEXT NOT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `preferred_processing_schedule` TEXT NOT NULL,
  `status` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Catalogs Catalogs Feed object';

--
-- Table structure for table `CatalogsFeedCredentials` generated from model 'CatalogsFeedCredentials'
-- Use this if your feed file requires username and password.
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedCredentials` (
  `password` TEXT NOT NULL COMMENT 'The required password for downloading a feed.',
  `username` TEXT NOT NULL COMMENT 'The required username for downloading a feed.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Use this if your feed file requires username and password.';

--
-- Table structure for table `CatalogsFeedIngestionDetails` generated from model 'CatalogsFeedIngestionDetails'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedIngestionDetails` (
  `errors` TEXT NOT NULL,
  `info` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsFeedIngestionErrors` generated from model 'CatalogsFeedIngestionErrors'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedIngestionErrors` (
  `image_download_error` INT DEFAULT NULL,
  `image_download_connection_timeout` INT DEFAULT NULL,
  `image_format_unrecognize` INT DEFAULT NULL,
  `line_level_internal_error` INT DEFAULT NULL,
  `large_product_count_decrease` ENUM('1') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsFeedIngestionInfo` generated from model 'CatalogsFeedIngestionInfo'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedIngestionInfo` (
  `in_stock` INT DEFAULT NULL,
  `out_of_stock` INT DEFAULT NULL,
  `preorder` INT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsFeedProcessingResult` generated from model 'CatalogsFeedProcessingResult'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedProcessingResult` (
  `created_at` DATETIME DEFAULT NULL,
  `id` TEXT DEFAULT NULL,
  `updated_at` DATETIME DEFAULT NULL,
  `ingestion_details` TEXT NOT NULL,
  `status` TEXT NOT NULL,
  `product_counts` TEXT NOT NULL,
  `validation_details` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `catalogs_feed_processing_result_fields` generated from model 'catalogsUnderscorefeedUnderscoreprocessingUnderscoreresultUnderscorefields'
--

CREATE TABLE IF NOT EXISTS `catalogs_feed_processing_result_fields` (
  `ingestion_details` TEXT NOT NULL,
  `status` TEXT NOT NULL,
  `product_counts` TEXT NOT NULL,
  `validation_details` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsFeedProcessingSchedule` generated from model 'CatalogsFeedProcessingSchedule'
-- Optional daily processing schedule. Use this to configure the preferred time for processing a feed (otherwise random).
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedProcessingSchedule` (
  `time` TEXT NOT NULL COMMENT 'A time in format HH:MM with leading 0 (zero)',
  `timezone` ENUM('Africa/Abidjan', 'Africa/Accra', 'Africa/Algiers', 'Africa/Bissau', 'Africa/Cairo', 'Africa/Casablanca', 'Africa/Ceuta', 'Africa/El_Aaiun', 'Africa/Johannesburg', 'Africa/Juba', 'Africa/Khartoum', 'Africa/Lagos', 'Africa/Maputo', 'Africa/Monrovia', 'Africa/Nairobi', 'Africa/Ndjamena', 'Africa/Sao_Tome', 'Africa/Tripoli', 'Africa/Tunis', 'Africa/Windhoek', 'America/Adak', 'America/Anchorage', 'America/Araguaina', 'America/Argentina/Buenos_Aires', 'America/Argentina/Catamarca', 'America/Argentina/Cordoba', 'America/Argentina/Jujuy', 'America/Argentina/La_Rioja', 'America/Argentina/Mendoza', 'America/Argentina/Rio_Gallegos', 'America/Argentina/Salta', 'America/Argentina/San_Juan', 'America/Argentina/San_Luis', 'America/Argentina/Tucuman', 'America/Argentina/Ushuaia', 'America/Asuncion', 'America/Atikokan', 'America/Bahia', 'America/Bahia_Banderas', 'America/Barbados', 'America/Belem', 'America/Belize', 'America/Blanc-Sablon', 'America/Boa_Vista', 'America/Bogota', 'America/Boise', 'America/Cambridge_Bay', 'America/Campo_Grande', 'America/Cancun', 'America/Caracas', 'America/Cayenne', 'America/Chicago', 'America/Chihuahua', 'America/Costa_Rica', 'America/Creston', 'America/Cuiaba', 'America/Curacao', 'America/Danmarkshavn', 'America/Dawson', 'America/Dawson_Creek', 'America/Denver', 'America/Detroit', 'America/Edmonton', 'America/Eirunepe', 'America/El_Salvador', 'America/Fort_Nelson', 'America/Fortaleza', 'America/Glace_Bay', 'America/Goose_Bay', 'America/Grand_Turk', 'America/Guatemala', 'America/Guayaquil', 'America/Guyana', 'America/Halifax', 'America/Havana', 'America/Hermosillo', 'America/Indiana/Indianapolis', 'America/Indiana/Knox', 'America/Indiana/Marengo', 'America/Indiana/Petersburg', 'America/Indiana/Tell_City', 'America/Indiana/Vevay', 'America/Indiana/Vincennes', 'America/Indiana/Winamac', 'America/Inuvik', 'America/Iqaluit', 'America/Jamaica', 'America/Juneau', 'America/Kentucky/Louisville', 'America/Kentucky/Monticello', 'America/La_Paz', 'America/Lima', 'America/Los_Angeles', 'America/Maceio', 'America/Managua', 'America/Manaus', 'America/Martinique', 'America/Matamoros', 'America/Mazatlan', 'America/Menominee', 'America/Merida', 'America/Metlakatla', 'America/Mexico_City', 'America/Miquelon', 'America/Moncton', 'America/Monterrey', 'America/Montevideo', 'America/Nassau', 'America/New_York', 'America/Nipigon', 'America/Nome', 'America/Noronha', 'America/North_Dakota/Beulah', 'America/North_Dakota/Center', 'America/North_Dakota/New_Salem', 'America/Nuuk', 'America/Ojinaga', 'America/Panama', 'America/Pangnirtung', 'America/Paramaribo', 'America/Phoenix', 'America/Port-au-Prince', 'America/Port_of_Spain', 'America/Porto_Velho', 'America/Puerto_Rico', 'America/Punta_Arenas', 'America/Rainy_River', 'America/Rankin_Inlet', 'America/Recife', 'America/Regina', 'America/Resolute', 'America/Rio_Branco', 'America/Santarem', 'America/Santiago', 'America/Santo_Domingo', 'America/Sao_Paulo', 'America/Scoresbysund', 'America/Sitka', 'America/St_Johns', 'America/Swift_Current', 'America/Tegucigalpa', 'America/Thule', 'America/Thunder_Bay', 'America/Tijuana', 'America/Toronto', 'America/Vancouver', 'America/Whitehorse', 'America/Winnipeg', 'America/Yakutat', 'America/Yellowknife', 'Antarctica/Casey', 'Antarctica/Davis', 'Antarctica/DumontDUrville', 'Antarctica/Macquarie', 'Antarctica/Mawson', 'Antarctica/Palmer', 'Antarctica/Rothera', 'Antarctica/Syowa', 'Antarctica/Troll', 'Antarctica/Vostok', 'Asia/Almaty', 'Asia/Amman', 'Asia/Anadyr', 'Asia/Aqtau', 'Asia/Aqtobe', 'Asia/Ashgabat', 'Asia/Atyrau', 'Asia/Baghdad', 'Asia/Baku', 'Asia/Bangkok', 'Asia/Barnaul', 'Asia/Beirut', 'Asia/Bishkek', 'Asia/Brunei', 'Asia/Chita', 'Asia/Choibalsan', 'Asia/Colombo', 'Asia/Damascus', 'Asia/Dhaka', 'Asia/Dili', 'Asia/Dubai', 'Asia/Dushanbe', 'Asia/Famagusta', 'Asia/Gaza', 'Asia/Hebron', 'Asia/Ho_Chi_Minh', 'Asia/Hong_Kong', 'Asia/Hovd', 'Asia/Irkutsk', 'Asia/Jakarta', 'Asia/Jayapura', 'Asia/Jerusalem', 'Asia/Kabul', 'Asia/Kamchatka', 'Asia/Karachi', 'Asia/Kathmandu', 'Asia/Khandyga', 'Asia/Kolkata', 'Asia/Krasnoyarsk', 'Asia/Kuala_Lumpur', 'Asia/Kuching', 'Asia/Macau', 'Asia/Magadan', 'Asia/Makassar', 'Asia/Manila', 'Asia/Nicosia', 'Asia/Novokuznetsk', 'Asia/Novosibirsk', 'Asia/Omsk', 'Asia/Oral', 'Asia/Pontianak', 'Asia/Pyongyang', 'Asia/Qatar', 'Asia/Qostanay', 'Asia/Qyzylorda', 'Asia/Riyadh', 'Asia/Sakhalin', 'Asia/Samarkand', 'Asia/Seoul', 'Asia/Shanghai', 'Asia/Singapore', 'Asia/Srednekolymsk', 'Asia/Taipei', 'Asia/Tashkent', 'Asia/Tbilisi', 'Asia/Tehran', 'Asia/Thimphu', 'Asia/Tokyo', 'Asia/Tomsk', 'Asia/Ulaanbaatar', 'Asia/Urumqi', 'Asia/Ust-Nera', 'Asia/Vladivostok', 'Asia/Yakutsk', 'Asia/Yangon', 'Asia/Yekaterinburg', 'Asia/Yerevan', 'Atlantic/Azores', 'Atlantic/Bermuda', 'Atlantic/Canary', 'Atlantic/Cape_Verde', 'Atlantic/Faroe', 'Atlantic/Madeira', 'Atlantic/Reykjavik', 'Atlantic/South_Georgia', 'Atlantic/Stanley', 'Australia/Adelaide', 'Australia/Brisbane', 'Australia/Broken_Hill', 'Australia/Currie', 'Australia/Darwin', 'Australia/Eucla', 'Australia/Hobart', 'Australia/Lindeman', 'Australia/Lord_Howe', 'Australia/Melbourne', 'Australia/Perth', 'Australia/Sydney', 'CET', 'CST6CDT', 'EET', 'EST', 'EST5EDT', 'Etc/GMT', 'Etc/GMT+1', 'Etc/GMT+10', 'Etc/GMT+11', 'Etc/GMT+12', 'Etc/GMT+2', 'Etc/GMT+3', 'Etc/GMT+4', 'Etc/GMT+5', 'Etc/GMT+6', 'Etc/GMT+7', 'Etc/GMT+8', 'Etc/GMT+9', 'Etc/GMT-1', 'Etc/GMT-10', 'Etc/GMT-11', 'Etc/GMT-12', 'Etc/GMT-13', 'Etc/GMT-14', 'Etc/GMT-2', 'Etc/GMT-3', 'Etc/GMT-4', 'Etc/GMT-5', 'Etc/GMT-6', 'Etc/GMT-7', 'Etc/GMT-8', 'Etc/GMT-9', 'Etc/UTC', 'Europe/Amsterdam', 'Europe/Andorra', 'Europe/Astrakhan', 'Europe/Athens', 'Europe/Belgrade', 'Europe/Berlin', 'Europe/Brussels', 'Europe/Bucharest', 'Europe/Budapest', 'Europe/Chisinau', 'Europe/Copenhagen', 'Europe/Dublin', 'Europe/Gibraltar', 'Europe/Helsinki', 'Europe/Istanbul', 'Europe/Kaliningrad', 'Europe/Kiev', 'Europe/Kirov', 'Europe/Lisbon', 'Europe/London', 'Europe/Luxembourg', 'Europe/Madrid', 'Europe/Malta', 'Europe/Minsk', 'Europe/Monaco', 'Europe/Moscow', 'Europe/Oslo', 'Europe/Paris', 'Europe/Prague', 'Europe/Riga', 'Europe/Rome', 'Europe/Samara', 'Europe/Saratov', 'Europe/Simferopol', 'Europe/Sofia', 'Europe/Stockholm', 'Europe/Tallinn', 'Europe/Tirane', 'Europe/Ulyanovsk', 'Europe/Uzhgorod', 'Europe/Vienna', 'Europe/Vilnius', 'Europe/Volgograd', 'Europe/Warsaw', 'Europe/Zaporozhye', 'Europe/Zurich', 'HST', 'Indian/Chagos', 'Indian/Christmas', 'Indian/Cocos', 'Indian/Kerguelen', 'Indian/Mahe', 'Indian/Maldives', 'Indian/Mauritius', 'Indian/Reunion', 'MET', 'MST', 'MST7MDT', 'PST8PDT', 'Pacific/Apia', 'Pacific/Auckland', 'Pacific/Bougainville', 'Pacific/Chatham', 'Pacific/Chuuk', 'Pacific/Easter', 'Pacific/Efate', 'Pacific/Enderbury', 'Pacific/Fakaofo', 'Pacific/Fiji', 'Pacific/Funafuti', 'Pacific/Galapagos', 'Pacific/Gambier', 'Pacific/Guadalcanal', 'Pacific/Guam', 'Pacific/Honolulu', 'Pacific/Kiritimati', 'Pacific/Kosrae', 'Pacific/Kwajalein', 'Pacific/Majuro', 'Pacific/Marquesas', 'Pacific/Nauru', 'Pacific/Niue', 'Pacific/Norfolk', 'Pacific/Noumea', 'Pacific/Pago_Pago', 'Pacific/Palau', 'Pacific/Pitcairn', 'Pacific/Pohnpei', 'Pacific/Port_Moresby', 'Pacific/Rarotonga', 'Pacific/Tahiti', 'Pacific/Tarawa', 'Pacific/Tongatapu', 'Pacific/Wake', 'Pacific/Wallis', 'WET', 'null') NOT NULL COMMENT 'The timezone considered for the processing schedule time.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Optional daily processing schedule. Use this to configure the preferred time for processing a feed (otherwise random).';

--
-- Table structure for table `CatalogsFeedProductCounts` generated from model 'CatalogsFeedProductCounts'
-- The counts can be null early in the process.
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedProductCounts` (
  `original` INT DEFAULT NULL COMMENT 'The number of products in the feed file'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The counts can be null early in the process.';

--
-- Table structure for table `CatalogsFeedValidationDetails` generated from model 'CatalogsFeedValidationDetails'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedValidationDetails` (
  `errors` TEXT NOT NULL,
  `warnings` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsFeedValidationErrors` generated from model 'CatalogsFeedValidationErrors'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedValidationErrors` (
  `fetch_error` INT DEFAULT NULL,
  `fetch_inactive_feed_error` INT DEFAULT NULL,
  `encoding_error` INT DEFAULT NULL,
  `delimiter_error` INT DEFAULT NULL,
  `required_columns_missing` INT DEFAULT NULL,
  `image_link_invalid` INT DEFAULT NULL,
  `itemid_missing` INT DEFAULT NULL,
  `title_missing` INT DEFAULT NULL,
  `description_missing` INT DEFAULT NULL,
  `product_category_invalid` INT DEFAULT NULL,
  `product_link_missing` INT DEFAULT NULL,
  `image_link_missing` INT DEFAULT NULL,
  `availability_invalid` INT DEFAULT NULL,
  `product_price_invalid` INT DEFAULT NULL,
  `link_format_invalid` INT DEFAULT NULL,
  `parse_line_error` INT DEFAULT NULL,
  `adwords_format_invalid` INT DEFAULT NULL,
  `product_category_missing` INT DEFAULT NULL,
  `internal_service_error` INT DEFAULT NULL,
  `no_verified_domain` INT DEFAULT NULL,
  `adult_invalid` INT DEFAULT NULL,
  `invalid_domain` INT DEFAULT NULL,
  `feed_length_too_long` INT DEFAULT NULL,
  `link_length_too_long` INT DEFAULT NULL,
  `malformed_xml` INT DEFAULT NULL,
  `redirect_invalid` INT DEFAULT NULL,
  `price_missing` INT DEFAULT NULL,
  `feed_too_small` INT DEFAULT NULL,
  `condition_invalid` INT DEFAULT NULL,
  `shopify_no_products` INT DEFAULT NULL,
  `max_items_per_item_group_exceeded` INT DEFAULT NULL,
  `item_main_image_download_failure` INT DEFAULT NULL,
  `pinjoin_content_unsafe` INT DEFAULT NULL,
  `blocklisted_image_signature` INT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsFeedValidationWarnings` generated from model 'CatalogsFeedValidationWarnings'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedValidationWarnings` (
  `title_length_too_long` INT DEFAULT NULL,
  `description_length_too_long` INT DEFAULT NULL,
  `gender_invalid` INT DEFAULT NULL,
  `age_group_invalid` INT DEFAULT NULL,
  `size_type_invalid` INT DEFAULT NULL,
  `link_format_warning` INT DEFAULT NULL,
  `duplicate_products` INT DEFAULT NULL,
  `duplicate_links` INT DEFAULT NULL,
  `sales_price_invalid` INT DEFAULT NULL,
  `product_category_depth_warning` INT DEFAULT NULL,
  `adwords_same_as_link` INT DEFAULT NULL,
  `duplicate_headers` INT DEFAULT NULL,
  `fetch_same_signature` INT DEFAULT NULL,
  `adwords_format_warning` INT DEFAULT NULL,
  `additional_image_link_warning` INT DEFAULT NULL,
  `image_link_warning` INT DEFAULT NULL,
  `shipping_invalid` INT DEFAULT NULL,
  `tax_invalid` INT DEFAULT NULL,
  `shipping_weight_invalid` INT DEFAULT NULL,
  `expiration_date_invalid` INT DEFAULT NULL,
  `availability_date_invalid` INT DEFAULT NULL,
  `sale_date_invalid` INT DEFAULT NULL,
  `weight_unit_invalid` INT DEFAULT NULL,
  `is_bundle_invalid` INT DEFAULT NULL,
  `updated_time_invalid` INT DEFAULT NULL,
  `custom_label_length_too_long` INT DEFAULT NULL,
  `product_type_length_too_long` INT DEFAULT NULL,
  `too_many_additional_image_links` INT DEFAULT NULL,
  `multipack_invalid` INT DEFAULT NULL,
  `indexed_product_count_large_delta` INT DEFAULT NULL,
  `item_additional_image_download_failure` INT DEFAULT NULL,
  `optional_product_category_missing` INT DEFAULT NULL,
  `optional_product_category_invalid` INT DEFAULT NULL,
  `optional_condition_missing` INT DEFAULT NULL,
  `optional_condition_invalid` INT DEFAULT NULL,
  `ios_deep_link_invalid` INT DEFAULT NULL,
  `android_deep_link_invalid` INT DEFAULT NULL,
  `availability_normalized` INT DEFAULT NULL,
  `condition_normalized` INT DEFAULT NULL,
  `gender_normalized` INT DEFAULT NULL,
  `size_type_normalized` INT DEFAULT NULL,
  `age_group_normalized` INT DEFAULT NULL,
  `utm_source_auto_corrected` INT DEFAULT NULL,
  `country_does_not_map_to_currency` INT DEFAULT NULL,
  `min_ad_price_invalid` INT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsFeedsCreateRequest` generated from model 'CatalogsFeedsCreateRequest'
-- Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedsCreateRequest` (
  `default_country` TEXT DEFAULT NULL,
  `default_availability` TEXT DEFAULT NULL,
  `default_currency` TEXT DEFAULT NULL,
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `format` TEXT NOT NULL,
  `default_locale` TEXT DEFAULT NULL COMMENT 'The locale used within a feed for product descriptions.',
  `credentials` TEXT DEFAULT NULL,
  `location` TEXT NOT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `preferred_processing_schedule` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.';

--
-- Table structure for table `CatalogsFeedsUpdateRequest` generated from model 'CatalogsFeedsUpdateRequest'
-- Request object for updating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedsUpdateRequest` (
  `default_availability` TEXT DEFAULT NULL,
  `default_currency` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `format` TEXT DEFAULT NULL,
  `credentials` TEXT DEFAULT NULL,
  `location` TEXT DEFAULT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for updating a feed.';

--
-- Table structure for table `CatalogsItems` generated from model 'CatalogsItems'
-- Response object of catalogs items
--

CREATE TABLE IF NOT EXISTS `CatalogsItems` (
  `items` JSON DEFAULT NULL COMMENT 'Array with catalogs items'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Response object of catalogs items';

--
-- Table structure for table `CatalogsItemsBatch` generated from model 'CatalogsItemsBatch'
-- Object describing the catalogs items batch
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsBatch` (
  `items` JSON DEFAULT NULL COMMENT 'Array with the catalogs items processing records part of the catalogs items batch',
  `batch_id` TEXT DEFAULT NULL COMMENT 'Id of the catalogs items batch',
  `created_time` DATETIME DEFAULT NULL COMMENT 'Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD',
  `completed_time` DATETIME DEFAULT NULL COMMENT 'Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD',
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing the catalogs items batch';

--
-- Table structure for table `CatalogsItemsBatchRequest` generated from model 'CatalogsItemsBatchRequest'
-- Request object of catalogs items batch
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsBatchRequest` (
  `country` TEXT DEFAULT NULL,
  `language` TEXT DEFAULT NULL,
  `operation` TEXT DEFAULT NULL,
  `items` JSON DEFAULT NULL COMMENT 'Array with catalogs items'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object of catalogs items batch';

--
-- Table structure for table `CatalogsProductGroup` generated from model 'CatalogsProductGroup'
-- catalog product group entity
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroup` (
  `id` TEXT NOT NULL COMMENT 'ID of the catalog product group.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of catalog product group',
  `description` TEXT DEFAULT NULL,
  `filters` TEXT NOT NULL,
  `type` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL,
  `feed_id` TEXT DEFAULT NULL COMMENT 'id of the catalogs feed belonging to this catalog product group',
  `created_at` INT DEFAULT NULL COMMENT 'Unix timestamp in seconds of when catalog product group was created.',
  `updated_at` INT DEFAULT NULL COMMENT 'Unix timestamp in seconds of last time catalog product group was updated.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='catalog product group entity';

--
-- Table structure for table `CatalogsProductGroupCreateRequest` generated from model 'CatalogsProductGroupCreateRequest'
-- Request object for creating a product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupCreateRequest` (
  `feed_id` TEXT NOT NULL COMMENT 'Catalog Feed id pertaining to the catalog product group.',
  `name` TEXT NOT NULL,
  `description` TEXT DEFAULT NULL,
  `filters` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for creating a product group.';

--
-- Table structure for table `CatalogsProductGroupCurrencyCriteria` generated from model 'CatalogsProductGroupCurrencyCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupCurrencyCriteria` (
  `values` TEXT NOT NULL,
  `negated` TINYINT(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupFilterKeys` generated from model 'CatalogsProductGroupFilterKeys'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFilterKeys` (
  `MIN_PRICE` TEXT NOT NULL,
  `MAX_PRICE` TEXT NOT NULL,
  `CURRENCY` TEXT NOT NULL,
  `ITEM_ID` TEXT NOT NULL,
  `AVAILABILITY` TEXT NOT NULL,
  `BRAND` TEXT NOT NULL,
  `CONDITION` TEXT NOT NULL,
  `CUSTOM_LABEL_0` TEXT NOT NULL,
  `CUSTOM_LABEL_1` TEXT NOT NULL,
  `CUSTOM_LABEL_2` TEXT NOT NULL,
  `CUSTOM_LABEL_3` TEXT NOT NULL,
  `CUSTOM_LABEL_4` TEXT NOT NULL,
  `ITEM_GROUP_ID` TEXT NOT NULL,
  `GENDER` TEXT NOT NULL,
  `PRODUCT_TYPE_4` TEXT NOT NULL,
  `PRODUCT_TYPE_3` TEXT NOT NULL,
  `PRODUCT_TYPE_2` TEXT NOT NULL,
  `PRODUCT_TYPE_1` TEXT NOT NULL,
  `PRODUCT_TYPE_0` TEXT NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_6` TEXT NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_5` TEXT NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_4` TEXT NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_3` TEXT NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_2` TEXT NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_1` TEXT NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_0` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupFilters` generated from model 'CatalogsProductGroupFilters'
-- Object holding a group of filters for a catalog product group
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFilters` (
  `any_of` JSON DEFAULT NULL,
  `all_of` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object holding a group of filters for a catalog product group';

--
-- Table structure for table `CatalogsProductGroupFiltersAllOf` generated from model 'CatalogsProductGroupFiltersAllOf'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersAllOf` (
  `all_of` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupFiltersAnyOf` generated from model 'CatalogsProductGroupFiltersAnyOf'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersAnyOf` (
  `any_of` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupMultipleStringCriteria` generated from model 'CatalogsProductGroupMultipleStringCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleStringCriteria` (
  `values` JSON NOT NULL,
  `negated` TINYINT(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupMultipleStringListCriteria` generated from model 'CatalogsProductGroupMultipleStringListCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleStringListCriteria` (
  `values` JSON NOT NULL,
  `negated` TINYINT(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupPricingCriteria` generated from model 'CatalogsProductGroupPricingCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupPricingCriteria` (
  `inclusion` TINYINT(1) NOT NULL,
  `values` DECIMAL(20, 9) NOT NULL,
  `negated` TINYINT(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupUpdateRequest` generated from model 'CatalogsProductGroupUpdateRequest'
-- Request object for updating a product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupUpdateRequest` (
  `feed_id` TEXT NOT NULL COMMENT 'Catalog Feed id pertaining to the catalog product group.',
  `name` TEXT NOT NULL,
  `description` TEXT DEFAULT NULL,
  `filters` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for updating a product group.';

--
-- Table structure for table `ConditionFilter` generated from model 'ConditionFilter'
--

CREATE TABLE IF NOT EXISTS `ConditionFilter` (
  `CONDITION` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CurrencyFilter` generated from model 'CurrencyFilter'
--

CREATE TABLE IF NOT EXISTS `CurrencyFilter` (
  `CURRENCY` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CustomLabel0Filter` generated from model 'CustomLabel0Filter'
--

CREATE TABLE IF NOT EXISTS `CustomLabel0Filter` (
  `CUSTOM_LABEL_0` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CustomLabel1Filter` generated from model 'CustomLabel1Filter'
--

CREATE TABLE IF NOT EXISTS `CustomLabel1Filter` (
  `CUSTOM_LABEL_1` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CustomLabel2Filter` generated from model 'CustomLabel2Filter'
--

CREATE TABLE IF NOT EXISTS `CustomLabel2Filter` (
  `CUSTOM_LABEL_2` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CustomLabel3Filter` generated from model 'CustomLabel3Filter'
--

CREATE TABLE IF NOT EXISTS `CustomLabel3Filter` (
  `CUSTOM_LABEL_3` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CustomLabel4Filter` generated from model 'CustomLabel4Filter'
--

CREATE TABLE IF NOT EXISTS `CustomLabel4Filter` (
  `CUSTOM_LABEL_4` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Error` generated from model 'Error'
--

CREATE TABLE IF NOT EXISTS `Error` (
  `code` INT NOT NULL,
  `message` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `feed_fields` generated from model 'feedUnderscorefields'
--

CREATE TABLE IF NOT EXISTS `feed_fields` (
  `default_country` TEXT NOT NULL,
  `default_availability` TEXT NOT NULL,
  `default_currency` TEXT NOT NULL,
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.',
  `format` TEXT NOT NULL,
  `default_locale` TEXT NOT NULL COMMENT 'The locale used within a feed for product descriptions.',
  `credentials` TEXT NOT NULL,
  `location` TEXT NOT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `preferred_processing_schedule` TEXT NOT NULL,
  `status` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GenderFilter` generated from model 'GenderFilter'
--

CREATE TABLE IF NOT EXISTS `GenderFilter` (
  `GENDER` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GoogleProductCategory0Filter` generated from model 'GoogleProductCategory0Filter'
--

CREATE TABLE IF NOT EXISTS `GoogleProductCategory0Filter` (
  `GOOGLE_PRODUCT_CATEGORY_0` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GoogleProductCategory1Filter` generated from model 'GoogleProductCategory1Filter'
--

CREATE TABLE IF NOT EXISTS `GoogleProductCategory1Filter` (
  `GOOGLE_PRODUCT_CATEGORY_1` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GoogleProductCategory2Filter` generated from model 'GoogleProductCategory2Filter'
--

CREATE TABLE IF NOT EXISTS `GoogleProductCategory2Filter` (
  `GOOGLE_PRODUCT_CATEGORY_2` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GoogleProductCategory3Filter` generated from model 'GoogleProductCategory3Filter'
--

CREATE TABLE IF NOT EXISTS `GoogleProductCategory3Filter` (
  `GOOGLE_PRODUCT_CATEGORY_3` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GoogleProductCategory4Filter` generated from model 'GoogleProductCategory4Filter'
--

CREATE TABLE IF NOT EXISTS `GoogleProductCategory4Filter` (
  `GOOGLE_PRODUCT_CATEGORY_4` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GoogleProductCategory5Filter` generated from model 'GoogleProductCategory5Filter'
--

CREATE TABLE IF NOT EXISTS `GoogleProductCategory5Filter` (
  `GOOGLE_PRODUCT_CATEGORY_5` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GoogleProductCategory6Filter` generated from model 'GoogleProductCategory6Filter'
--

CREATE TABLE IF NOT EXISTS `GoogleProductCategory6Filter` (
  `GOOGLE_PRODUCT_CATEGORY_6` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ImageDetails` generated from model 'ImageDetails'
--

CREATE TABLE IF NOT EXISTS `ImageDetails` (
  `width` INT UNSIGNED NOT NULL,
  `height` INT UNSIGNED NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemAttributes` generated from model 'ItemAttributes'
--

CREATE TABLE IF NOT EXISTS `ItemAttributes` (
  `ad_link` TEXT DEFAULT NULL COMMENT 'Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.',
  `additional_image_link` JSON DEFAULT NULL COMMENT 'The links to additional images for your product. Up to five additional images can be used to show a product from different angles or to show different stages. Separate each additional image with a comma. We recommend enclosing the whole string with quotes. Must begin with http:// or https://',
  `adult` TINYINT(1) DEFAULT NULL COMMENT 'Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest.',
  `age_group` TEXT DEFAULT NULL COMMENT 'The age group to apply a demographic range to the product. Must be one of the following values: ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, ‘adult’.',
  `availability` TEXT DEFAULT NULL COMMENT 'The availability of the product. Must be one of the following values: ‘in stock’, ‘out of stock’, ‘preorder’.',
  `average_review_rating` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Average reviews for the item. Can be a number from 1-5.',
  `brand` TEXT DEFAULT NULL COMMENT 'The brand of the product.',
  `color` TEXT DEFAULT NULL COMMENT 'The primary color of the product.',
  `condition` TEXT DEFAULT NULL COMMENT 'The condition of the product. Must be one of the following values: ‘new’, ‘used’, ‘refurbished’.',
  `custom_label_0` TEXT DEFAULT NULL COMMENT 'Custom grouping of products.',
  `custom_label_1` TEXT DEFAULT NULL COMMENT 'Custom grouping of products.',
  `custom_label_2` TEXT DEFAULT NULL COMMENT 'Custom grouping of products.',
  `custom_label_3` TEXT DEFAULT NULL COMMENT 'Custom grouping of products.',
  `custom_label_4` TEXT DEFAULT NULL COMMENT 'Custom grouping of products.',
  `description` TEXT DEFAULT NULL COMMENT 'The description of the product.',
  `free_shipping_label` TINYINT(1) DEFAULT NULL COMMENT 'The item is free to ship.',
  `free_shipping_limit` TEXT DEFAULT NULL COMMENT 'The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.',
  `gender` TEXT DEFAULT NULL COMMENT 'The gender associated with the product. Must be one of the following values: ‘male’, ‘female’, ‘unisex’.',
  `google_product_category` TEXT DEFAULT NULL COMMENT 'The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.',
  `gtin` INT DEFAULT NULL COMMENT 'The unique universal product identifier.',
  `id` VARCHAR(127) DEFAULT NULL COMMENT 'The user-created unique ID that represents the product. Only Unicode characters are accepted.',
  `image_link` JSON DEFAULT NULL COMMENT 'The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://',
  `item_group_id` VARCHAR(127) DEFAULT NULL COMMENT 'The parent ID of the product.',
  `last_updated_time` BIGINT DEFAULT NULL COMMENT 'The millisecond timestamp when the item was lastly modified by the merchant.',
  `link` TEXT DEFAULT NULL COMMENT 'The landing page for the product.',
  `material` TEXT DEFAULT NULL COMMENT 'The material used to make the product.',
  `min_ad_price` TEXT DEFAULT NULL COMMENT 'The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.',
  `mobile_link` TEXT DEFAULT NULL COMMENT 'The mobile-optimized version of your landing page. Must begin with http:// or https://.',
  `mpn` TEXT DEFAULT NULL COMMENT 'Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.',
  `number_of_ratings` INT DEFAULT NULL COMMENT 'The number of ratings for the item.',
  `number_of_reviews` INT DEFAULT NULL COMMENT 'The number of reviews available for the item.',
  `pattern` TEXT DEFAULT NULL COMMENT 'The description of the pattern used for the product.',
  `price` TEXT DEFAULT NULL COMMENT 'The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.',
  `product_type` TEXT DEFAULT NULL COMMENT 'The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.',
  `sale_price` TEXT DEFAULT NULL COMMENT 'The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars.',
  `shipping` TEXT DEFAULT NULL COMMENT 'Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.',
  `shipping_height` TEXT DEFAULT NULL COMMENT 'The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.',
  `shipping_weight` TEXT DEFAULT NULL COMMENT 'The weight of the product. Ensure there is a space between the numeric string and the metric.',
  `shipping_width` TEXT DEFAULT NULL COMMENT 'The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.',
  `size` TEXT DEFAULT NULL COMMENT 'The size of the product.',
  `size_system` TEXT DEFAULT NULL COMMENT 'Indicates the country’s sizing system in which you are submitting your product.',
  `size_type` TEXT DEFAULT NULL COMMENT 'Additional description for the size. Must be one of the following values: ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, ‘maternity’.',
  `tax` TEXT DEFAULT NULL COMMENT 'Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.',
  `title` TEXT DEFAULT NULL COMMENT 'The name of the product.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemBatchRecord` generated from model 'ItemBatchRecord'
-- Object describing an item batch record
--

CREATE TABLE IF NOT EXISTS `ItemBatchRecord` (
  `item_id` TEXT DEFAULT NULL COMMENT 'The catalog item id in the merchant namespace',
  `attributes` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an item batch record';

--
-- Table structure for table `ItemGroupIdFilter` generated from model 'ItemGroupIdFilter'
--

CREATE TABLE IF NOT EXISTS `ItemGroupIdFilter` (
  `ITEM_GROUP_ID` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemIdFilter` generated from model 'ItemIdFilter'
--

CREATE TABLE IF NOT EXISTS `ItemIdFilter` (
  `ITEM_ID` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemProcessingRecord` generated from model 'ItemProcessingRecord'
-- Object describing an item processing record
--

CREATE TABLE IF NOT EXISTS `ItemProcessingRecord` (
  `item_id` TEXT DEFAULT NULL COMMENT 'The catalog item id in the merchant namespace',
  `errors` JSON DEFAULT NULL COMMENT 'Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.',
  `warnings` JSON DEFAULT NULL COMMENT 'Array with the validation warnings for the item processing record',
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an item processing record';

--
-- Table structure for table `ItemValidationEvent` generated from model 'ItemValidationEvent'
-- Object describing an item validation event
--

CREATE TABLE IF NOT EXISTS `ItemValidationEvent` (
  `attribute` TEXT DEFAULT NULL COMMENT 'The attribute that the item validation event references',
  `code` INT DEFAULT NULL COMMENT 'The event code that the item validation event references',
  `message` TEXT DEFAULT NULL COMMENT 'Title message describing the item validation event'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an item validation event';

--
-- Table structure for table `MaxPriceFilter` generated from model 'MaxPriceFilter'
--

CREATE TABLE IF NOT EXISTS `MaxPriceFilter` (
  `MAX_PRICE` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MediaUpload` generated from model 'MediaUpload'
-- Media upload that has been registered but not uploaded/processed yet.
--

CREATE TABLE IF NOT EXISTS `MediaUpload` (
  `media_id` TEXT DEFAULT NULL COMMENT 'Unique identifier for this media upload. Used to track status and for attaching during Pin creation.',
  `media_type` TEXT DEFAULT NULL,
  `upload_url` TEXT DEFAULT NULL COMMENT 'The URL where you will POST your media file.',
  `upload_parameters` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Media upload that has been registered but not uploaded/processed yet.';

--
-- Table structure for table `MediaUpload_allOf` generated from model 'MediaUploadUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `MediaUpload_allOf` (
  `media_id` TEXT DEFAULT NULL COMMENT 'Unique identifier for this media upload. Used to track status and for attaching during Pin creation.',
  `media_type` TEXT DEFAULT NULL,
  `upload_url` TEXT DEFAULT NULL COMMENT 'The URL where you will POST your media file.',
  `upload_parameters` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MediaUpload_allOf_upload_parameters` generated from model 'MediaUploadUnderscoreallOfUnderscoreuploadUnderscoreparameters'
-- The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
--

CREATE TABLE IF NOT EXISTS `MediaUpload_allOf_upload_parameters` (
  `x-amz-date` TEXT DEFAULT NULL,
  `x-amz-signature` TEXT DEFAULT NULL,
  `x-amz-security-token` TEXT DEFAULT NULL,
  `x-amz-algorithm` TEXT DEFAULT NULL,
  `key` TEXT DEFAULT NULL,
  `policy` TEXT DEFAULT NULL,
  `x-amz-credential` TEXT DEFAULT NULL,
  `Content-Type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The list of parameter key/value pairs you will need to send with your POST request to upload your media file.';

--
-- Table structure for table `MediaUploadDetails` generated from model 'MediaUploadDetails'
-- Media upload details
--

CREATE TABLE IF NOT EXISTS `MediaUploadDetails` (
  `media_id` TEXT DEFAULT NULL,
  `media_type` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Media upload details';

--
-- Table structure for table `MediaUploadRequest` generated from model 'MediaUploadRequest'
-- Media upload request
--

CREATE TABLE IF NOT EXISTS `MediaUploadRequest` (
  `media_type` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Media upload request';

--
-- Table structure for table `MinPriceFilter` generated from model 'MinPriceFilter'
--

CREATE TABLE IF NOT EXISTS `MinPriceFilter` (
  `MIN_PRICE` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `OauthAccessTokenRequestCode` generated from model 'OauthAccessTokenRequestCode'
-- A request to exchange an authorization code for an access token.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenRequestCode` (
  `grant_type` ENUM('authorization_code', 'refresh_token') NOT NULL,
  `code` TEXT NOT NULL,
  `redirect_uri` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A request to exchange an authorization code for an access token.';

--
-- Table structure for table `OauthAccessTokenRequestCode_allOf` generated from model 'OauthAccessTokenRequestCodeUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenRequestCode_allOf` (
  `code` TEXT NOT NULL,
  `redirect_uri` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `OauthAccessTokenRequestRefresh` generated from model 'OauthAccessTokenRequestRefresh'
-- A request to exchange a refresh token for a new access token.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenRequestRefresh` (
  `grant_type` ENUM('authorization_code', 'refresh_token') NOT NULL,
  `refresh_token` TEXT NOT NULL,
  `scope` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A request to exchange a refresh token for a new access token.';

--
-- Table structure for table `OauthAccessTokenRequestRefresh_allOf` generated from model 'OauthAccessTokenRequestRefreshUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenRequestRefresh_allOf` (
  `refresh_token` TEXT NOT NULL,
  `scope` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `OauthAccessTokenResponse` generated from model 'OauthAccessTokenResponse'
-- A successful OAuth access token response.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenResponse` (
  `response_type` ENUM('authorization_code', 'refresh_token') DEFAULT NULL,
  `access_token` TEXT NOT NULL,
  `token_type` TEXT NOT NULL,
  `expires_in` INT NOT NULL,
  `scope` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A successful OAuth access token response.';

--
-- Table structure for table `OauthAccessTokenResponseCode` generated from model 'OauthAccessTokenResponseCode'
-- A successful OAuth access token response for the authorization code flow.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenResponseCode` (
  `response_type` ENUM('authorization_code', 'refresh_token') DEFAULT NULL,
  `access_token` TEXT NOT NULL,
  `token_type` TEXT NOT NULL,
  `expires_in` INT NOT NULL,
  `scope` TEXT NOT NULL,
  `refresh_token` TEXT NOT NULL,
  `refresh_token_expires_in` INT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A successful OAuth access token response for the authorization code flow.';

--
-- Table structure for table `OauthAccessTokenResponseCode_allOf` generated from model 'OauthAccessTokenResponseCodeUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenResponseCode_allOf` (
  `refresh_token` TEXT NOT NULL,
  `refresh_token_expires_in` INT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `OauthAccessTokenResponseRefresh` generated from model 'OauthAccessTokenResponseRefresh'
-- A successful OAuth access token response for the refresh token flow.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenResponseRefresh` (
  `response_type` ENUM('authorization_code', 'refresh_token') DEFAULT NULL,
  `access_token` TEXT NOT NULL,
  `token_type` TEXT NOT NULL,
  `expires_in` INT NOT NULL,
  `scope` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A successful OAuth access token response for the refresh token flow.';

--
-- Table structure for table `Paginated` generated from model 'Paginated'
--

CREATE TABLE IF NOT EXISTS `Paginated` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Pin` generated from model 'Pin'
-- Pin
--

CREATE TABLE IF NOT EXISTS `Pin` (
  `id` TEXT DEFAULT NULL,
  `created_at` DATETIME DEFAULT NULL,
  `link` TEXT DEFAULT NULL,
  `title` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `alt_text` TEXT DEFAULT NULL,
  `board_id` TEXT DEFAULT NULL COMMENT 'The board to which this Pin belongs.',
  `board_section_id` TEXT DEFAULT NULL COMMENT 'The board section to which this Pin belongs.',
  `board_owner` TEXT DEFAULT NULL,
  `media` TEXT DEFAULT NULL,
  `media_source` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin';

--
-- Table structure for table `PinMedia` generated from model 'PinMedia'
-- Pin media objects.
--

CREATE TABLE IF NOT EXISTS `PinMedia` (
  `media_type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin media objects.';

--
-- Table structure for table `PinMediaSource` generated from model 'PinMediaSource'
-- Pin media source.
--

CREATE TABLE IF NOT EXISTS `PinMediaSource` (
  `source_type` ENUM('video_id') NOT NULL,
  `content_type` ENUM('image/jpeg', 'image/png') NOT NULL,
  `data` TEXT NOT NULL,
  `url` TEXT NOT NULL,
  `cover_image_url` TEXT NOT NULL,
  `media_id` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin media source.';

--
-- Table structure for table `PinMediaSourceImageBase64` generated from model 'PinMediaSourceImageBase64'
-- Base64-encoded image media source
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImageBase64` (
  `source_type` ENUM('image_base64') NOT NULL,
  `content_type` ENUM('image/jpeg', 'image/png') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Base64-encoded image media source';

--
-- Table structure for table `PinMediaSourceImageURL` generated from model 'PinMediaSourceImageURL'
-- Image URL-based media source
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImageURL` (
  `source_type` ENUM('image_url') NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Image URL-based media source';

--
-- Table structure for table `PinMediaSourceVideoID` generated from model 'PinMediaSourceVideoID'
-- Video ID-based media source
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceVideoID` (
  `source_type` ENUM('video_id') NOT NULL,
  `cover_image_url` TEXT NOT NULL,
  `media_id` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Video ID-based media source';

--
-- Table structure for table `PinMediaWithImage` generated from model 'PinMediaWithImage'
-- Pin with image.
--

CREATE TABLE IF NOT EXISTS `PinMediaWithImage` (
  `images` JSON DEFAULT NULL,
  `media_type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin with image.';

--
-- Table structure for table `PinMediaWithImage_allOf` generated from model 'PinMediaWithImageUnderscoreallOf'
--

CREATE TABLE IF NOT EXISTS `PinMediaWithImage_allOf` (
  `images` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ProductType0Filter` generated from model 'ProductType0Filter'
--

CREATE TABLE IF NOT EXISTS `ProductType0Filter` (
  `PRODUCT_TYPE_0` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ProductType1Filter` generated from model 'ProductType1Filter'
--

CREATE TABLE IF NOT EXISTS `ProductType1Filter` (
  `PRODUCT_TYPE_1` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ProductType2Filter` generated from model 'ProductType2Filter'
--

CREATE TABLE IF NOT EXISTS `ProductType2Filter` (
  `PRODUCT_TYPE_2` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ProductType3Filter` generated from model 'ProductType3Filter'
--

CREATE TABLE IF NOT EXISTS `ProductType3Filter` (
  `PRODUCT_TYPE_3` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ProductType4Filter` generated from model 'ProductType4Filter'
--

CREATE TABLE IF NOT EXISTS `ProductType4Filter` (
  `PRODUCT_TYPE_4` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingTypeFilter` generated from model 'TargetingTypeFilter'
--

CREATE TABLE IF NOT EXISTS `TargetingTypeFilter` (
  `targeting_types` JSON DEFAULT NULL COMMENT 'List of targeting types'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TrackingUrls` generated from model 'TrackingUrls'
-- Third-party tracking URLs. Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
--

CREATE TABLE IF NOT EXISTS `TrackingUrls` (
  `impression` JSON DEFAULT NULL,
  `click` JSON DEFAULT NULL,
  `engagement` JSON DEFAULT NULL,
  `buyable_button` JSON DEFAULT NULL,
  `audience_verification` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Third-party tracking URLs. Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.';


--
-- OAuth2 framework tables
-- Thanks to https://github.com/dsquier/oauth2-server-php-mysql repo
--

--
-- Table structure for table `oauth_clients`
--
CREATE TABLE IF NOT EXISTS `oauth_clients` (
  `client_id`            VARCHAR(80)    NOT NULL,
  `client_secret`        VARCHAR(80)    DEFAULT NULL,
  `redirect_uri`         VARCHAR(2000)  DEFAULT NULL,
  `grant_types`          VARCHAR(80)    DEFAULT NULL,
  `scope`                VARCHAR(4000)  DEFAULT NULL,
  `user_id`              VARCHAR(80)    DEFAULT NULL,
  PRIMARY KEY (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `oauth_access_tokens`
--
CREATE TABLE IF NOT EXISTS `oauth_access_tokens` (
  `access_token`         VARCHAR(40)    NOT NULL,
  `client_id`            VARCHAR(80)    DEFAULT NULL,
  `user_id`              VARCHAR(80)    DEFAULT NULL,
  `expires`              TIMESTAMP      NOT NULL,
  `scope`                VARCHAR(4000)  DEFAULT NULL,
  PRIMARY KEY (`access_token`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `oauth_authorization_codes`
--
CREATE TABLE IF NOT EXISTS `oauth_authorization_codes` (
  `authorization_code`  VARCHAR(40)    NOT NULL,
  `client_id`           VARCHAR(80)    DEFAULT NULL,
  `user_id`             VARCHAR(80)    DEFAULT NULL,
  `redirect_uri`        VARCHAR(2000)  NOT NULL,
  `expires`             TIMESTAMP      NOT NULL,
  `scope`               VARCHAR(4000)  DEFAULT NULL,
  `id_token`            VARCHAR(1000)  DEFAULT NULL,
  PRIMARY KEY (`authorization_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `oauth_refresh_tokens`
--
CREATE TABLE IF NOT EXISTS `oauth_refresh_tokens` (
  `refresh_token`       VARCHAR(40)    NOT NULL,
  `client_id`           VARCHAR(80)    DEFAULT NULL,
  `user_id`             VARCHAR(80)    DEFAULT NULL,
  `expires`             TIMESTAMP      on update CURRENT_TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `scope`               VARCHAR(4000)  DEFAULT NULL,
  PRIMARY KEY (`refresh_token`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `oauth_users`
--
CREATE TABLE IF NOT EXISTS `oauth_users` (
  `username`            VARCHAR(80)    DEFAULT NULL,
  `password`            VARCHAR(255)   DEFAULT NULL,
  `first_name`          VARCHAR(80)    DEFAULT NULL,
  `last_name`           VARCHAR(80)    DEFAULT NULL,
  `email`               VARCHAR(2000)  DEFAULT NULL,
  `email_verified`      TINYINT(1)     DEFAULT NULL,
  `scope`               VARCHAR(4000)  DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `oauth_scopes`
--
CREATE TABLE IF NOT EXISTS `oauth_scopes` (
  `scope`               VARCHAR(80)  NOT NULL,
  `is_default`          TINYINT(1)   DEFAULT NULL,
  PRIMARY KEY (`scope`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `oauth_jwt`
--
CREATE TABLE IF NOT EXISTS `oauth_jwt` (
  `client_id`           VARCHAR(80)    NOT NULL,
  `subject`             VARCHAR(80)    DEFAULT NULL,
  `public_key`          VARCHAR(2000)  NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `oauth_jti`
--
CREATE TABLE IF NOT EXISTS `oauth_jti` (
  `issuer`              VARCHAR(80)    NOT NULL,
  `subject`             VARCHAR(80)    DEFAULT NULL,
  `audience`            VARCHAR(80)    DEFAULT NULL,
  `expires`             TIMESTAMP      NOT NULL,
  `jti`                 VARCHAR(2000)  NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `oauth_public_keys`
--
CREATE TABLE IF NOT EXISTS `oauth_public_keys` (
  `client_id`            VARCHAR(80)    DEFAULT NULL,
  `public_key`           VARCHAR(2000)  DEFAULT NULL,
  `private_key`          VARCHAR(2000)  DEFAULT NULL,
  `encryption_algorithm` VARCHAR(100)   DEFAULT 'RS256'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
