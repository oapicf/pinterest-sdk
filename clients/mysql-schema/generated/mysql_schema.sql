/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */

-- --------------------------------------------------------

--
-- Table structure for table `Account` generated from model 'Account'
-- User account model containing properties related to a user&#39;s account.
--

CREATE TABLE IF NOT EXISTS `Account` (
  `about` TEXT DEFAULT NULL COMMENT 'Profile about description.',
  `account_type` TEXT DEFAULT NULL COMMENT 'Type of account',
  `board_count` INT DEFAULT NULL COMMENT '  User account board count.   **Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.',
  `business_name` TEXT DEFAULT NULL,
  `follower_count` INT DEFAULT NULL COMMENT 'User account follower count.',
  `following_count` INT DEFAULT NULL COMMENT 'User account following count.',
  `id` TEXT DEFAULT NULL COMMENT 'User account ID.',
  `monthly_views` INT DEFAULT NULL COMMENT 'User account monthly views.',
  `pin_count` INT DEFAULT NULL COMMENT 'User account pin count. This includes both created and saved pins.',
  `profile_image` TEXT DEFAULT NULL,
  `username` TEXT DEFAULT NULL,
  `website_url` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='User account model containing properties related to a user&#39;s account.';

--
-- Table structure for table `AccountTemplate` generated from model 'AccountTemplate'
--

CREATE TABLE IF NOT EXISTS `AccountTemplate` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'ID of the Ad Account that owns the template',
  `ad_account_ids` JSON DEFAULT NULL COMMENT 'IDs of the Ad Accounts that have access to this template',
  `ade_columns` JSON DEFAULT NULL COMMENT 'A list of ADE columns',
  `attribution_type` TEXT DEFAULT NULL COMMENT 'Attribution type for Brand/Category/SKU reports',
  `click_window_days` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The length of the sliding window over which click conversions will be attributed',
  `columns` JSON DEFAULT NULL COMMENT 'A list of columns to be included in the report',
  `conversion_report_time_type` TEXT DEFAULT NULL COMMENT 'Conversion report time type',
  `creation_source` TEXT DEFAULT NULL COMMENT 'The surface used to create this template',
  `custom_column_ids` JSON DEFAULT NULL COMMENT 'A list of custom column IDs',
  `display_metadata` TEXT DEFAULT NULL COMMENT 'Additional metadata about this reporting template',
  `engagement_window_days` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The length of the sliding window over which engagement conversions will be attributed',
  `filters_json` TEXT DEFAULT NULL COMMENT 'A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values',
  `granularity` TEXT DEFAULT NULL,
  `id` TEXT NOT NULL COMMENT 'Template ID',
  `ingestion_sources` JSON DEFAULT NULL COMMENT 'The filter on the conversion ingestion source method for conversion metrics',
  `is_default` TINYINT(1) DEFAULT NULL COMMENT 'A boolean representing if this is the default view that loads for this template type',
  `is_deleted` TINYINT(1) DEFAULT NULL COMMENT 'A boolean that indicates if the template has been deleted',
  `is_owned_by_user` TINYINT(1) DEFAULT NULL COMMENT 'A boolean value that indicates if the user owns the template',
  `is_scheduled` TINYINT(1) DEFAULT NULL COMMENT 'A boolean value that indicates if this template has been used to create a scheduled report',
  `name` TEXT DEFAULT NULL COMMENT 'Template Name',
  `report_end_relative_days_in_past` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The number of days prior to the day the report will be delivered at which the report will end',
  `report_format` TEXT DEFAULT NULL,
  `report_level` TEXT DEFAULT NULL,
  `report_start_relative_days_in_past` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The number of days prior to the day the report will be delivered at which the report will start',
  `reporting_time_zone` TEXT DEFAULT NULL COMMENT 'Timezone for reporting data',
  `sort_by` TEXT DEFAULT NULL COMMENT 'Unified metric sort configuration',
  `type` TEXT DEFAULT NULL COMMENT 'Type of the template',
  `updated_time` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Time of last update in seconds since Unix epoch',
  `user_id` TEXT DEFAULT NULL COMMENT 'ID of the user who created the template',
  `view_window_days` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The length of the sliding window over which view conversions will be attributed'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Ad` generated from model 'Ad'
--

CREATE TABLE IF NOT EXISTS `Ad` (
  `ad_account_id` TEXT NOT NULL COMMENT 'The ID of the advertiser that this ad belongs to.',
  `ad_group_id` TEXT NOT NULL COMMENT 'ID of the ad group that contains the ad.',
  `android_deep_link` TEXT DEFAULT NULL COMMENT 'Deep link URL for Android devices.',
  `campaign_id` TEXT NOT NULL COMMENT 'ID of the ad campaign that contains this ad.',
  `carousel_android_deep_links` JSON DEFAULT NULL COMMENT 'Comma-separated deep links for the carousel pin on Android.',
  `carousel_destination_urls` JSON DEFAULT NULL COMMENT 'Comma-separated destination URLs for the carousel pin to promote.',
  `carousel_ios_deep_links` JSON DEFAULT NULL COMMENT 'Comma-separated deep links for the carousel pin on iOS.',
  `carting_platform_type` TINYINT UNSIGNED DEFAULT NULL COMMENT 'The vendor platform type of the carting/WTB ad.',
  `carting_products` JSON DEFAULT NULL COMMENT 'Array of carting/WTB products for the ad.',
  `click_tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking url for the ad clicks.',
  `collection_items_destination_url_template` TEXT DEFAULT NULL COMMENT 'Destination URL template for all items within a collections drawer.',
  `collections_header_type` TEXT DEFAULT NULL,
  `created_time` INT DEFAULT NULL COMMENT 'Pin creation time. Unix timestamp in seconds.',
  `creative_type` TEXT NOT NULL,
  `customizable_cta_type` TEXT DEFAULT NULL,
  `destination_url` TEXT DEFAULT NULL COMMENT 'Destination URL.',
  `disclosure_type` TEXT DEFAULT NULL,
  `disclosure_url` TEXT DEFAULT NULL COMMENT 'URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.',
  `grid_click_type` TEXT DEFAULT NULL,
  `id` VARCHAR(18) NOT NULL COMMENT 'The ID of this ad.',
  `ios_deep_link` TEXT DEFAULT NULL COMMENT 'Deep link URL for iOS devices.',
  `is_carting` TINYINT(1) DEFAULT NULL COMMENT 'Is the ad a carting/WTB ad?',
  `is_collage_accepted_terms` TINYINT(1) DEFAULT NULL COMMENT 'Whether the advertiser has accepted the terms and conditions for collage ad.',
  `is_collage_single_destination` TINYINT(1) DEFAULT NULL COMMENT 'Whether the collage ad has a single destination url override.',
  `is_pin_deleted` TINYINT(1) DEFAULT NULL COMMENT 'Is original pin deleted?',
  `is_removable` TINYINT(1) DEFAULT NULL COMMENT 'Is pin repinnable?',
  `lead_form_id` TEXT DEFAULT NULL COMMENT 'Lead form ID for lead ad generation.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the ad - 255 chars max.',
  `pin_id` TEXT NOT NULL COMMENT 'Pin ID. This field may only be updated for draft ads.',
  `quiz_pin_data` TEXT DEFAULT NULL COMMENT 'Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.',
  `rejected_reasons` JSON NOT NULL COMMENT 'Enum reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;.',
  `rejection_labels` JSON NOT NULL COMMENT 'Text reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;.',
  `review_status` TEXT NOT NULL COMMENT 'Ad review status',
  `status` TEXT DEFAULT NULL,
  `summary_status` TEXT NOT NULL COMMENT 'Ad summary status',
  `tracking_urls` TEXT DEFAULT NULL,
  `type` TEXT NOT NULL COMMENT 'Always \&quot;ad\&quot;.',
  `updated_time` INT DEFAULT NULL COMMENT 'Last update time. Unix timestamp in seconds.',
  `view_tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking URL for ad impressions.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdAccount` generated from model 'AdAccount'
--

CREATE TABLE IF NOT EXISTS `AdAccount` (
  `country` TEXT DEFAULT NULL,
  `created_time` INT DEFAULT NULL COMMENT ' Creation time. Unix timestamp in seconds.',
  `currency` TEXT DEFAULT NULL,
  `id` VARCHAR(18) NOT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'Ad account name.',
  `owner` TEXT DEFAULT NULL COMMENT 'Ad account owner',
  `permissions` JSON DEFAULT NULL,
  `time_zone` TEXT DEFAULT NULL COMMENT 'The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.',
  `updated_time` INT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdAccountAnalyticsItems` generated from model 'AdAccountAnalyticsItems'
--

CREATE TABLE IF NOT EXISTS `AdAccountAnalyticsItems` (
  `AD_ACCOUNT_ID` TEXT NOT NULL,
  `DATE` DATE DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ad_account_countries_get_200_response` generated from model 'adUnderscoreaccountUnderscorecountriesUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `ad_account_countries_get_200_response` (
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdAccountCreate` generated from model 'AdAccountCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `AdAccountCreate` (
  `country` TEXT DEFAULT NULL,
  `currency` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'Ad account name.',
  `owner_user_id` TEXT DEFAULT NULL COMMENT 'Advertiser&#39;s owning user ID.',
  `time_zone` TEXT DEFAULT NULL COMMENT 'The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `AdAccountOwner` generated from model 'AdAccountOwner'
--

CREATE TABLE IF NOT EXISTS `AdAccountOwner` (
  `id` TEXT DEFAULT NULL COMMENT 'The owning account&#39;s user ID.',
  `username` TEXT DEFAULT NULL COMMENT 'Public username for the user account'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdAccountToAdAccountSharedAudience` generated from model 'AdAccountToAdAccountSharedAudience'
--

CREATE TABLE IF NOT EXISTS `AdAccountToAdAccountSharedAudience` (
  `audience_id` TEXT NOT NULL COMMENT 'Unique identifier of an audience',
  `permissions` JSON DEFAULT NULL COMMENT 'Permissions granted to the recipients.',
  `recipient_account_ids` JSON NOT NULL COMMENT 'Ad account IDs to share with or revoke from (request) / that received the audience (response).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody` generated from model 'AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody'
-- Resource create or update operation model with required body fields (no OptionalProperties).
--

CREATE TABLE IF NOT EXISTS `AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody` (
  `audience_id` TEXT NOT NULL COMMENT 'Unique identifier of an audience',
  `operation_type` TEXT NOT NULL,
  `recipient_account_ids` JSON NOT NULL COMMENT 'Ad account IDs to share with or revoke from (request) / that received the audience (response).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create or update operation model with required body fields (no OptionalProperties).';

--
-- Table structure for table `AdAccountToBusinessSharedAudience` generated from model 'AdAccountToBusinessSharedAudience'
--

CREATE TABLE IF NOT EXISTS `AdAccountToBusinessSharedAudience` (
  `audience_id` TEXT NOT NULL COMMENT 'Unique identifier of an audience',
  `permissions` JSON DEFAULT NULL COMMENT 'Permissions granted to the recipients.',
  `recipient_business_ids` JSON NOT NULL COMMENT 'Business IDs to share with or revoke from (request) / that received the audience (response).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdAccountToBusinessSharedAudienceUpdateWithRequiredBody` generated from model 'AdAccountToBusinessSharedAudienceUpdateWithRequiredBody'
-- Resource create or update operation model with required body fields (no OptionalProperties).
--

CREATE TABLE IF NOT EXISTS `AdAccountToBusinessSharedAudienceUpdateWithRequiredBody` (
  `audience_id` TEXT NOT NULL COMMENT 'Unique identifier of an audience',
  `operation_type` TEXT NOT NULL,
  `recipient_business_ids` JSON NOT NULL COMMENT 'Business IDs to share with or revoke from (request) / that received the audience (response).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create or update operation model with required body fields (no OptionalProperties).';

--
-- Table structure for table `AdAccountsAudience` generated from model 'AdAccountsAudience'
--

CREATE TABLE IF NOT EXISTS `AdAccountsAudience` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Ad account ID.',
  `audience_type` TEXT DEFAULT NULL COMMENT '[Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR',
  `created_by_company_name` TEXT DEFAULT NULL COMMENT 'The company that created this audience.',
  `created_timestamp` INT DEFAULT NULL COMMENT 'Creation time. Unix timestamp in seconds.',
  `description` TEXT DEFAULT NULL COMMENT 'Audience description.',
  `id` TEXT NOT NULL COMMENT 'Audience ID.',
  `is_nca` TINYINT(1) DEFAULT NULL COMMENT 'Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.',
  `name` TEXT DEFAULT NULL COMMENT 'Audience name.',
  `rule` TEXT DEFAULT NULL,
  `size` INT DEFAULT NULL COMMENT 'Audience size.',
  `status` TEXT DEFAULT NULL COMMENT 'Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.',
  `type` TEXT DEFAULT NULL COMMENT 'Always \&quot;audience\&quot;.',
  `updated_timestamp` INT DEFAULT NULL COMMENT 'Last update time. Unix timestamp in seconds.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdAccountsAudienceCreate` generated from model 'AdAccountsAudienceCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `AdAccountsAudienceCreate` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Ad account ID.',
  `audience_type` TEXT DEFAULT NULL COMMENT '[Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR',
  `description` TEXT DEFAULT NULL COMMENT 'Audience description.',
  `name` TEXT DEFAULT NULL COMMENT 'Audience name.',
  `rule` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `AdAccountsAudienceRule` generated from model 'AdAccountsAudienceRule'
-- JSON object defining targeted audience users. Example rule formats per audience type: CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&lt;customer list ID&gt;\&quot;} ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&lt;audience ID&gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; } (Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10. The targeted audience should be this % size across Pinterest.) VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&lt;conversion tag ID&gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}} (Retention days should be 1-540. Retention applies to specific customers.) ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.example.com\&quot;], \&quot;engager_type\&quot;: 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).
--

CREATE TABLE IF NOT EXISTS `AdAccountsAudienceRule` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Ad account ID.',
  `ad_id` JSON DEFAULT NULL COMMENT 'Ad ID for engagement audience filter.',
  `campaign_id` JSON DEFAULT NULL COMMENT 'Campaign ID for engagement audience filter.',
  `country` TEXT DEFAULT NULL COMMENT 'Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;.',
  `customer_list_id` TEXT DEFAULT NULL COMMENT 'Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;.',
  `engagement_domain` JSON DEFAULT NULL COMMENT 'The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;.',
  `engagement_type` TEXT DEFAULT NULL COMMENT 'Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set.',
  `engager_type` INT DEFAULT NULL COMMENT 'Optional for ENGAGEMENT. Engager type value should be 1-2.',
  `event` TEXT DEFAULT NULL COMMENT 'A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event.',
  `event_data` TEXT DEFAULT NULL,
  `event_source` JSON DEFAULT NULL COMMENT 'Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline',
  `ingestion_source` JSON DEFAULT NULL COMMENT 'Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api',
  `objective_type` JSON DEFAULT NULL COMMENT 'Objective for engagement audience filter.',
  `percentage` INT DEFAULT NULL COMMENT 'Percentage should be 1-10. The targeted audience should be this % size across Pinterest.',
  `pin_id` JSON DEFAULT NULL COMMENT 'IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, \&quot;pin_id:\&quot;: [\&quot;34567\&quot;]',
  `prefill` TINYINT(1) DEFAULT NULL COMMENT 'Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;.',
  `retention_days` INT DEFAULT NULL COMMENT 'Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified.',
  `seed_id` JSON DEFAULT NULL COMMENT 'Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;.',
  `url` JSON DEFAULT NULL COMMENT 'Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains]. Example 1:  \&quot;url\&quot;: \&quot;http://www.myonlinestore123.com/view_item/shoe\&quot; Example 2: \&quot;url\&quot;: {\&quot;contains\&quot;: \&quot;/view_item/shoe\&quot;}',
  `visitor_source_id` TEXT DEFAULT NULL COMMENT 'The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='JSON object defining targeted audience users. Example rule formats per audience type: CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&lt;customer list ID&gt;\&quot;} ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&lt;audience ID&gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; } (Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10. The targeted audience should be this % size across Pinterest.) VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&lt;conversion tag ID&gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}} (Retention days should be 1-540. Retention applies to specific customers.) ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.example.com\&quot;], \&quot;engager_type\&quot;: 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).';

--
-- Table structure for table `AdAccountsAudienceUpdate` generated from model 'AdAccountsAudienceUpdate'
-- Resource create or update operation model.
--

CREATE TABLE IF NOT EXISTS `AdAccountsAudienceUpdate` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Ad account ID.',
  `audience_type` TEXT DEFAULT NULL COMMENT '[Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR',
  `description` TEXT DEFAULT NULL COMMENT 'Audience description.',
  `name` TEXT DEFAULT NULL COMMENT 'Audience name.',
  `operation_type` TEXT DEFAULT NULL COMMENT 'Audience operation type (update or remove). Only valid in update request body.',
  `rule` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create or update operation model.';

--
-- Table structure for table `ad_accounts_audiences_shared_accounts_list_200_response` generated from model 'adUnderscoreaccountsUnderscoreaudiencesUnderscoresharedUnderscoreaccountsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `ad_accounts_audiences_shared_accounts_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdAccountsCountry` generated from model 'AdAccountsCountry'
--

CREATE TABLE IF NOT EXISTS `AdAccountsCountry` (
  `code` TEXT NOT NULL,
  `currency` TEXT NOT NULL COMMENT 'Country currency.',
  `index` DECIMAL(20, 9) NOT NULL COMMENT 'Country index',
  `name` TEXT NOT NULL COMMENT 'Country name'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ad_accounts_list_200_response` generated from model 'adUnderscoreaccountsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `ad_accounts_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ad_accounts_subscriptions_get_list_200_response` generated from model 'adUnderscoreaccountsUnderscoresubscriptionsUnderscoregetUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `ad_accounts_subscriptions_get_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdBatchItem` generated from model 'AdBatchItem'
--

CREATE TABLE IF NOT EXISTS `AdBatchItem` (
  `data` TEXT DEFAULT NULL,
  `exceptions` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdBatchUpdate` generated from model 'AdBatchUpdate'
--

CREATE TABLE IF NOT EXISTS `AdBatchUpdate` (
  `ad_group_id` TEXT DEFAULT NULL COMMENT 'ID of the ad group that contains the ad.',
  `android_deep_link` TEXT DEFAULT NULL COMMENT 'Deep link URL for Android devices.',
  `carousel_android_deep_links` JSON DEFAULT NULL COMMENT 'Comma-separated deep links for the carousel pin on Android.',
  `carousel_destination_urls` JSON DEFAULT NULL COMMENT 'Comma-separated destination URLs for the carousel pin to promote.',
  `carousel_ios_deep_links` JSON DEFAULT NULL COMMENT 'Comma-separated deep links for the carousel pin on iOS.',
  `click_tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking url for the ad clicks.',
  `collection_items_destination_url_template` TEXT DEFAULT NULL COMMENT 'Destination URL template for all items within a collections drawer.',
  `collections_header_type` TEXT DEFAULT NULL,
  `creative_type` TEXT DEFAULT NULL,
  `customizable_cta_type` TEXT DEFAULT NULL,
  `destination_url` TEXT DEFAULT NULL COMMENT 'Destination URL.',
  `disclosure_type` TEXT DEFAULT NULL,
  `disclosure_url` TEXT DEFAULT NULL COMMENT 'URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.',
  `grid_click_type` TEXT DEFAULT NULL,
  `id` VARCHAR(18) NOT NULL COMMENT 'The ID of this ad.',
  `ios_deep_link` TEXT DEFAULT NULL COMMENT 'Deep link URL for iOS devices.',
  `is_carting` TINYINT(1) DEFAULT NULL COMMENT 'Is the ad a carting/WTB ad?',
  `is_collage_accepted_terms` TINYINT(1) DEFAULT NULL COMMENT 'Whether the advertiser has accepted the terms and conditions for collage ad.',
  `is_collage_single_destination` TINYINT(1) DEFAULT NULL COMMENT 'Whether the collage ad has a single destination url override.',
  `is_pin_deleted` TINYINT(1) DEFAULT NULL COMMENT 'Is original pin deleted?',
  `is_removable` TINYINT(1) DEFAULT NULL COMMENT 'Is pin repinnable?',
  `lead_form_id` TEXT DEFAULT NULL COMMENT 'Lead form ID for lead ad generation.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the ad - 255 chars max.',
  `pin_id` TEXT DEFAULT NULL COMMENT 'Pin ID. This field may only be updated for draft ads.',
  `quiz_pin_data` TEXT DEFAULT NULL COMMENT 'Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.',
  `status` TEXT DEFAULT NULL,
  `tracking_urls` TEXT DEFAULT NULL,
  `view_tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking URL for ad impressions.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdBatchWriteResponseModel` generated from model 'AdBatchWriteResponseModel'
--

CREATE TABLE IF NOT EXISTS `AdBatchWriteResponseModel` (
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdCreate` generated from model 'AdCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `AdCreate` (
  `ad_group_id` TEXT NOT NULL COMMENT 'ID of the ad group that contains the ad.',
  `android_deep_link` TEXT DEFAULT NULL COMMENT 'Deep link URL for Android devices.',
  `carousel_android_deep_links` JSON DEFAULT NULL COMMENT 'Comma-separated deep links for the carousel pin on Android.',
  `carousel_destination_urls` JSON DEFAULT NULL COMMENT 'Comma-separated destination URLs for the carousel pin to promote.',
  `carousel_ios_deep_links` JSON DEFAULT NULL COMMENT 'Comma-separated deep links for the carousel pin on iOS.',
  `click_tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking url for the ad clicks.',
  `collection_items_destination_url_template` TEXT DEFAULT NULL COMMENT 'Destination URL template for all items within a collections drawer.',
  `collections_header_type` TEXT DEFAULT NULL,
  `creative_type` TEXT NOT NULL,
  `customizable_cta_type` TEXT DEFAULT NULL,
  `destination_url` TEXT DEFAULT NULL COMMENT 'Destination URL.',
  `disclosure_type` TEXT DEFAULT NULL,
  `disclosure_url` TEXT DEFAULT NULL COMMENT 'URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.',
  `grid_click_type` TEXT DEFAULT NULL,
  `ios_deep_link` TEXT DEFAULT NULL COMMENT 'Deep link URL for iOS devices.',
  `is_carting` TINYINT(1) DEFAULT NULL COMMENT 'Is the ad a carting/WTB ad?',
  `is_collage_accepted_terms` TINYINT(1) DEFAULT NULL COMMENT 'Whether the advertiser has accepted the terms and conditions for collage ad.',
  `is_collage_single_destination` TINYINT(1) DEFAULT NULL COMMENT 'Whether the collage ad has a single destination url override.',
  `is_pin_deleted` TINYINT(1) DEFAULT NULL COMMENT 'Is original pin deleted?',
  `is_removable` TINYINT(1) DEFAULT NULL COMMENT 'Is pin repinnable?',
  `lead_form_id` TEXT DEFAULT NULL COMMENT 'Lead form ID for lead ad generation.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the ad - 255 chars max.',
  `pin_id` TEXT NOT NULL COMMENT 'Pin ID. This field may only be updated for draft ads.',
  `quiz_pin_data` TEXT DEFAULT NULL COMMENT 'Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.',
  `status` TEXT DEFAULT NULL,
  `tracking_urls` TEXT DEFAULT NULL,
  `view_tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking URL for ad impressions.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `AdCreateRequest` generated from model 'AdCreateRequest'
--

CREATE TABLE IF NOT EXISTS `AdCreateRequest` (
  `ad_group_id` TEXT NOT NULL COMMENT 'ID of the ad group that contains the ad.',
  `android_deep_link` TEXT DEFAULT NULL COMMENT 'Deep link URL for Android devices.',
  `carousel_android_deep_links` JSON DEFAULT NULL COMMENT 'Comma-separated deep links for the carousel pin on Android.',
  `carousel_destination_urls` JSON DEFAULT NULL COMMENT 'Comma-separated destination URLs for the carousel pin to promote.',
  `carousel_ios_deep_links` JSON DEFAULT NULL COMMENT 'Comma-separated deep links for the carousel pin on iOS.',
  `click_tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking url for the ad clicks.',
  `creative_type` TEXT NOT NULL,
  `customizable_cta_type` TEXT DEFAULT NULL,
  `destination_url` TEXT DEFAULT NULL COMMENT 'Destination URL.',
  `disclosure_type` TEXT DEFAULT NULL,
  `disclosure_url` TEXT DEFAULT NULL COMMENT 'URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.',
  `grid_click_type` TEXT DEFAULT NULL,
  `ios_deep_link` TEXT DEFAULT NULL COMMENT 'Deep link URL for iOS devices.',
  `is_carting` TINYINT(1) DEFAULT NULL COMMENT 'Is the ad a carting/WTB ad?',
  `is_pin_deleted` TINYINT(1) DEFAULT NULL COMMENT 'Is original pin deleted?',
  `is_removable` TINYINT(1) DEFAULT NULL COMMENT 'Is pin repinnable?',
  `lead_form_id` TEXT DEFAULT NULL COMMENT 'Lead form ID for lead ad generation.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the ad - 255 chars max.',
  `pin_id` TEXT NOT NULL COMMENT 'Pin ID.',
  `quiz_pin_data` JSON DEFAULT NULL COMMENT 'Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.',
  `status` TEXT DEFAULT NULL,
  `tracking_urls` JSON DEFAULT NULL,
  `view_tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking URL for ad impressions.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroup` generated from model 'AdGroup'
--

CREATE TABLE IF NOT EXISTS `AdGroup` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Advertiser ID.',
  `bid_in_micro_currency` INT DEFAULT NULL COMMENT 'Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.',
  `bid_strategy_type` TEXT DEFAULT NULL,
  `billable_event` TEXT NOT NULL,
  `budget_in_micro_currency` INT DEFAULT NULL COMMENT 'Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.',
  `campaign_id` TEXT NOT NULL COMMENT 'Campaign ID of the ad group.',
  `conversion_learning_mode_type` TEXT NOT NULL COMMENT 'oCPM learn mode',
  `created_time` INT NOT NULL COMMENT 'Ad group creation time. Unix timestamp in seconds.',
  `customer_segment_id` TEXT DEFAULT NULL COMMENT 'Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;.',
  `dca_assets` TEXT DEFAULT NULL COMMENT '[DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.',
  `end_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.',
  `ext_features` TEXT DEFAULT NULL,
  `feed_profile_id` TEXT DEFAULT NULL COMMENT 'Feed Profile ID associated to the adgroup.',
  `id` VARCHAR(18) NOT NULL COMMENT 'Ad group ID.',
  `is_creative_optimization` TINYINT(1) DEFAULT NULL COMMENT 'Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.',
  `is_local_inventory` TINYINT(1) DEFAULT NULL COMMENT 'Indicates whether the ad group should use the local inventory.',
  `lifetime_frequency_cap` INT DEFAULT NULL COMMENT 'Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field.',
  `local_inventory_radius_in_miles` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The targeting radius of the local inventory ads in miles.',
  `name` TEXT NOT NULL COMMENT 'Ad group name.',
  `optimization_goal_metadata` TEXT DEFAULT NULL COMMENT 'Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.',
  `performance_plus_campaign_settings` TEXT DEFAULT NULL COMMENT 'Pinterest Performance+ campaign settings.',
  `placement_group` TEXT DEFAULT NULL COMMENT '[Placement group](https://help.pinterest.com/en/business/article/placement-groups).',
  `placement_traffic_type` TEXT DEFAULT NULL COMMENT 'A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both',
  `promotion_application_level` TEXT DEFAULT NULL COMMENT 'Specify if the promotion is applied at ad group or item level',
  `promotion_id` TEXT COMMENT 'Promotion ID. To clear this field, set to null.',
  `promotion_ids` JSON DEFAULT NULL COMMENT 'Promotion IDs list. To clear this field, set to an empty array [].',
  `start_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.',
  `status` TEXT DEFAULT NULL COMMENT 'Ad group/entity status.',
  `summary_status` TEXT NOT NULL,
  `targeting_spec` TEXT DEFAULT NULL,
  `targeting_template_ids` JSON DEFAULT NULL COMMENT 'Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;].',
  `tracking_urls` TEXT DEFAULT NULL,
  `type` TEXT NOT NULL COMMENT 'Always \&quot;adgroup\&quot;.',
  `updated_time` INT NOT NULL COMMENT 'Ad group last update time. Unix timestamp in seconds.',
  `auto_targeting_enabled` TINYINT(1) DEFAULT NULL COMMENT 'Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting).',
  `bid_multiplier` DECIMAL(20, 9) UNSIGNED DEFAULT NULL COMMENT '[Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).',
  `budget_type` TEXT DEFAULT NULL,
  `pacing_delivery_type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupAudienceSizing` generated from model 'AdGroupAudienceSizing'
--

CREATE TABLE IF NOT EXISTS `AdGroupAudienceSizing` (
  `audience_size_lower_bound` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The lower confidence bound of the estimated potential audience size. \&quot;Potential audience size\&quot; estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.',
  `audience_size_upper_bound` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The upper confidence bound of the estimated potential audience size. \&quot;Potential audience size\&quot; estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupAudienceSizingCreate` generated from model 'AdGroupAudienceSizingCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `AdGroupAudienceSizingCreate` (
  `auto_targeting_enabled` TINYINT(1) DEFAULT true COMMENT 'Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).',
  `creative_types` JSON DEFAULT NULL COMMENT 'Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.',
  `keywords` JSON DEFAULT NULL COMMENT 'Array of keyword objects. If the keywords field is missing, all keywords will be targeted.',
  `placement_group` TEXT COMMENT '[Placement group](/docs/redoc/#section/Placement-group).',
  `product_group_ids` JSON DEFAULT NULL COMMENT 'Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.',
  `targeting_spec` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `AdGroupAudienceSizingKeyword` generated from model 'AdGroupAudienceSizingKeyword'
--

CREATE TABLE IF NOT EXISTS `AdGroupAudienceSizingKeyword` (
  `match_type` TEXT NOT NULL,
  `value` TEXT NOT NULL COMMENT 'Keyword value (120 chars max).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupBase` generated from model 'AdGroupBase'
--

CREATE TABLE IF NOT EXISTS `AdGroupBase` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Advertiser ID.',
  `bid_in_micro_currency` INT DEFAULT NULL COMMENT 'Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.',
  `bid_strategy_type` TEXT DEFAULT NULL,
  `billable_event` TEXT NOT NULL,
  `budget_in_micro_currency` INT DEFAULT NULL COMMENT 'Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.',
  `campaign_id` TEXT NOT NULL COMMENT 'Campaign ID of the ad group.',
  `conversion_learning_mode_type` TEXT NOT NULL COMMENT 'oCPM learn mode',
  `created_time` INT NOT NULL COMMENT 'Ad group creation time. Unix timestamp in seconds.',
  `customer_segment_id` TEXT DEFAULT NULL COMMENT 'Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;.',
  `dca_assets` TEXT DEFAULT NULL COMMENT '[DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.',
  `end_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.',
  `ext_features` TEXT DEFAULT NULL,
  `feed_profile_id` TEXT DEFAULT NULL COMMENT 'Feed Profile ID associated to the adgroup.',
  `id` VARCHAR(18) NOT NULL COMMENT 'Ad group ID.',
  `is_creative_optimization` TINYINT(1) DEFAULT NULL COMMENT 'Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.',
  `is_local_inventory` TINYINT(1) DEFAULT NULL COMMENT 'Indicates whether the ad group should use the local inventory.',
  `lifetime_frequency_cap` INT DEFAULT NULL COMMENT 'Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field.',
  `local_inventory_radius_in_miles` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The targeting radius of the local inventory ads in miles.',
  `name` TEXT NOT NULL COMMENT 'Ad group name.',
  `optimization_goal_metadata` TEXT DEFAULT NULL COMMENT 'Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.',
  `performance_plus_campaign_settings` TEXT DEFAULT NULL COMMENT 'Pinterest Performance+ campaign settings.',
  `placement_group` TEXT DEFAULT NULL COMMENT '[Placement group](https://help.pinterest.com/en/business/article/placement-groups).',
  `placement_traffic_type` TEXT DEFAULT NULL COMMENT 'A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both',
  `promotion_application_level` TEXT DEFAULT NULL COMMENT 'Specify if the promotion is applied at ad group or item level',
  `promotion_id` TEXT COMMENT 'Promotion ID. To clear this field, set to null.',
  `promotion_ids` JSON DEFAULT NULL COMMENT 'Promotion IDs list. To clear this field, set to an empty array [].',
  `start_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.',
  `status` TEXT DEFAULT NULL COMMENT 'Ad group/entity status.',
  `summary_status` TEXT NOT NULL,
  `targeting_spec` TEXT DEFAULT NULL,
  `targeting_template_ids` JSON DEFAULT NULL COMMENT 'Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;].',
  `tracking_urls` TEXT DEFAULT NULL,
  `type` TEXT NOT NULL COMMENT 'Always \&quot;adgroup\&quot;.',
  `updated_time` INT NOT NULL COMMENT 'Ad group last update time. Unix timestamp in seconds.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupCreate` generated from model 'AdGroupCreate'
--

CREATE TABLE IF NOT EXISTS `AdGroupCreate` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Advertiser ID.',
  `bid_in_micro_currency` INT DEFAULT NULL COMMENT 'Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.',
  `bid_strategy_type` TEXT DEFAULT NULL,
  `billable_event` TEXT NOT NULL,
  `budget_in_micro_currency` INT DEFAULT NULL COMMENT 'Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.',
  `campaign_id` TEXT NOT NULL COMMENT 'Campaign ID of the ad group.',
  `conversion_learning_mode_type` TEXT NOT NULL COMMENT 'oCPM learn mode',
  `created_time` INT NOT NULL COMMENT 'Ad group creation time. Unix timestamp in seconds.',
  `customer_segment_id` TEXT DEFAULT NULL COMMENT 'Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;.',
  `dca_assets` TEXT DEFAULT NULL COMMENT '[DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.',
  `end_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.',
  `ext_features` TEXT DEFAULT NULL,
  `feed_profile_id` TEXT DEFAULT NULL COMMENT 'Feed Profile ID associated to the adgroup.',
  `id` VARCHAR(18) NOT NULL COMMENT 'Ad group ID.',
  `is_creative_optimization` TINYINT(1) DEFAULT NULL COMMENT 'Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.',
  `is_local_inventory` TINYINT(1) DEFAULT NULL COMMENT 'Indicates whether the ad group should use the local inventory.',
  `lifetime_frequency_cap` INT DEFAULT NULL COMMENT 'Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field.',
  `local_inventory_radius_in_miles` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The targeting radius of the local inventory ads in miles.',
  `name` TEXT NOT NULL COMMENT 'Ad group name.',
  `optimization_goal_metadata` TEXT DEFAULT NULL COMMENT 'Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.',
  `performance_plus_campaign_settings` TEXT DEFAULT NULL COMMENT 'Pinterest Performance+ campaign settings.',
  `placement_group` TEXT DEFAULT NULL COMMENT '[Placement group](https://help.pinterest.com/en/business/article/placement-groups).',
  `placement_traffic_type` TEXT DEFAULT NULL COMMENT 'A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both',
  `promotion_application_level` TEXT DEFAULT NULL COMMENT 'Specify if the promotion is applied at ad group or item level',
  `promotion_id` TEXT COMMENT 'Promotion ID. To clear this field, set to null.',
  `promotion_ids` JSON DEFAULT NULL COMMENT 'Promotion IDs list. To clear this field, set to an empty array [].',
  `start_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.',
  `status` TEXT DEFAULT NULL COMMENT 'Ad group/entity status.',
  `summary_status` TEXT NOT NULL,
  `targeting_spec` TEXT DEFAULT NULL,
  `targeting_template_ids` JSON DEFAULT NULL COMMENT 'Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;].',
  `tracking_urls` TEXT DEFAULT NULL,
  `type` TEXT NOT NULL COMMENT 'Always \&quot;adgroup\&quot;.',
  `updated_time` INT NOT NULL COMMENT 'Ad group last update time. Unix timestamp in seconds.',
  `auto_targeting_enabled` TINYINT(1) DEFAULT NULL COMMENT 'Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting).',
  `bid_multiplier` DECIMAL(20, 9) UNSIGNED DEFAULT NULL COMMENT '[Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).',
  `budget_type` TEXT,
  `pacing_delivery_type` TEXT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupCreateCreate` generated from model 'AdGroupCreateCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `AdGroupCreateCreate` (
  `auto_targeting_enabled` TINYINT(1) DEFAULT NULL COMMENT 'Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting).',
  `bid_in_micro_currency` INT DEFAULT NULL COMMENT 'Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.',
  `bid_multiplier` DECIMAL(20, 9) UNSIGNED DEFAULT NULL COMMENT '[Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).',
  `bid_strategy_type` TEXT DEFAULT NULL,
  `billable_event` TEXT NOT NULL,
  `budget_in_micro_currency` INT DEFAULT NULL COMMENT 'Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.',
  `budget_type` TEXT,
  `campaign_id` TEXT NOT NULL COMMENT 'Campaign ID of the ad group.',
  `customer_segment_id` TEXT DEFAULT NULL COMMENT 'Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;.',
  `end_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.',
  `ext_features` TEXT DEFAULT NULL,
  `feed_profile_id` TEXT DEFAULT NULL COMMENT 'Feed Profile ID associated to the adgroup.',
  `is_creative_optimization` TINYINT(1) DEFAULT NULL COMMENT 'Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.',
  `is_local_inventory` TINYINT(1) DEFAULT NULL COMMENT 'Indicates whether the ad group should use the local inventory.',
  `lifetime_frequency_cap` INT DEFAULT NULL COMMENT 'Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field.',
  `local_inventory_radius_in_miles` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The targeting radius of the local inventory ads in miles.',
  `name` TEXT NOT NULL COMMENT 'Ad group name.',
  `optimization_goal_metadata` TEXT DEFAULT NULL COMMENT 'Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.',
  `pacing_delivery_type` TEXT,
  `performance_plus_campaign_settings` TEXT DEFAULT NULL COMMENT 'Pinterest Performance+ campaign settings.',
  `placement_group` TEXT DEFAULT NULL COMMENT '[Placement group](https://help.pinterest.com/en/business/article/placement-groups).',
  `placement_traffic_type` TEXT DEFAULT NULL COMMENT 'A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both',
  `promotion_application_level` TEXT DEFAULT NULL COMMENT 'Specify if the promotion is applied at ad group or item level',
  `promotion_id` TEXT COMMENT 'Promotion ID. To clear this field, set to null.',
  `promotion_ids` JSON DEFAULT NULL COMMENT 'Promotion IDs list. To clear this field, set to an empty array [].',
  `start_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.',
  `status` TEXT DEFAULT NULL COMMENT 'Ad group/entity status.',
  `targeting_spec` TEXT DEFAULT NULL,
  `targeting_template_ids` JSON DEFAULT NULL COMMENT 'Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;].',
  `tracking_urls` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `AdGroupCreateRequest` generated from model 'AdGroupCreateRequest'
--

CREATE TABLE IF NOT EXISTS `AdGroupCreateRequest` (
  `auto_targeting_enabled` TINYINT(1) DEFAULT NULL COMMENT 'Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;Pinterest Performance+ targeting\&quot;&lt;/a&gt;.',
  `bid_multiplier` DECIMAL(20, 9) UNSIGNED DEFAULT NULL COMMENT '&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;.',
  `budget_type` TEXT DEFAULT NULL,
  `pacing_delivery_type` TEXT DEFAULT NULL,
  `bid_in_micro_currency` INT DEFAULT NULL COMMENT 'Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.',
  `bid_strategy_type` TEXT DEFAULT NULL,
  `billable_event` TEXT NOT NULL,
  `budget_in_micro_currency` INT DEFAULT NULL COMMENT 'Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.',
  `campaign_id` TEXT NOT NULL COMMENT 'Campaign ID of the ad group.',
  `end_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.',
  `is_creative_optimization` TINYINT(1) DEFAULT NULL COMMENT 'Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.',
  `lifetime_frequency_cap` INT DEFAULT NULL COMMENT 'Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.',
  `name` TEXT NOT NULL COMMENT 'Ad group name.',
  `optimization_goal_metadata` JSON DEFAULT NULL COMMENT 'Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.',
  `placement_group` TEXT DEFAULT NULL COMMENT '&lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.',
  `promotion_application_level` ENUM('NONE', 'ITEM', 'AD_GROUP', 'null') DEFAULT NULL COMMENT 'Specify if the promotion is applied at ad group or item level',
  `promotion_id` TEXT COMMENT 'Promotion ID. To clear this field, set to null.',
  `promotion_ids` JSON DEFAULT NULL COMMENT 'Promotion IDs list. To clear this field, set to an empty array [].',
  `start_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.',
  `status` TEXT DEFAULT NULL COMMENT 'Ad group/entity status.',
  `targeting_spec` TEXT DEFAULT NULL,
  `targeting_template_ids` JSON DEFAULT NULL COMMENT 'Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;].',
  `tracking_urls` JSON DEFAULT NULL COMMENT 'Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - EmptyObject - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupCreateRequestAllOf1` generated from model 'AdGroupCreateRequestAllOf1'
--

CREATE TABLE IF NOT EXISTS `AdGroupCreateRequestAllOf1` (
  `auto_targeting_enabled` TINYINT(1) DEFAULT NULL COMMENT 'Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;Pinterest Performance+ targeting\&quot;&lt;/a&gt;.',
  `bid_multiplier` DECIMAL(20, 9) UNSIGNED DEFAULT NULL COMMENT '&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;.',
  `budget_type` TEXT,
  `pacing_delivery_type` TEXT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupDeliveryEstimates` generated from model 'AdGroupDeliveryEstimates'
-- Ad group configuration for delivery estimates.
--

CREATE TABLE IF NOT EXISTS `AdGroupDeliveryEstimates` (
  `auto_targeting_enabled` TINYINT(1) DEFAULT NULL,
  `creative_types` JSON DEFAULT NULL COMMENT 'Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.',
  `keywords` JSON DEFAULT NULL COMMENT 'Array of keyword objects. If the keywords field is missing, all keywords will be targeted.',
  `monthly_frequency_cap` INT UNSIGNED DEFAULT NULL COMMENT 'Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.',
  `optimization_goal_metadata` TEXT DEFAULT NULL,
  `optimization_type` TEXT DEFAULT NULL COMMENT 'Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.',
  `placement_group` TEXT DEFAULT NULL,
  `product_group_ids` JSON DEFAULT NULL COMMENT '[Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.',
  `targeting_spec` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ad group configuration for delivery estimates.';

--
-- Table structure for table `AdGroupDeliveryEstimatesKeywordsItems` generated from model 'AdGroupDeliveryEstimatesKeywordsItems'
--

CREATE TABLE IF NOT EXISTS `AdGroupDeliveryEstimatesKeywordsItems` (
  `match_type` TEXT NOT NULL,
  `value` TEXT NOT NULL COMMENT 'Keyword value (120 chars max).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupTrackingURLs` generated from model 'AdGroupTrackingURLs'
--   Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).
--

CREATE TABLE IF NOT EXISTS `AdGroupTrackingURLs` (
  `audience_verification` JSON DEFAULT NULL,
  `buyable_button` JSON DEFAULT NULL,
  `click` JSON DEFAULT NULL,
  `engagement` JSON DEFAULT NULL,
  `impression` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='  Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).';

--
-- Table structure for table `AdGroupUpdate` generated from model 'AdGroupUpdate'
--

CREATE TABLE IF NOT EXISTS `AdGroupUpdate` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Advertiser ID.',
  `bid_in_micro_currency` INT DEFAULT NULL COMMENT 'Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.',
  `bid_strategy_type` TEXT DEFAULT NULL,
  `billable_event` TEXT NOT NULL,
  `budget_in_micro_currency` INT DEFAULT NULL COMMENT 'Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.',
  `campaign_id` TEXT NOT NULL COMMENT 'Campaign ID of the ad group.',
  `conversion_learning_mode_type` TEXT NOT NULL COMMENT 'oCPM learn mode',
  `created_time` INT NOT NULL COMMENT 'Ad group creation time. Unix timestamp in seconds.',
  `customer_segment_id` TEXT DEFAULT NULL COMMENT 'Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;.',
  `dca_assets` TEXT DEFAULT NULL COMMENT '[DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.',
  `end_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.',
  `ext_features` TEXT DEFAULT NULL,
  `feed_profile_id` TEXT DEFAULT NULL COMMENT 'Feed Profile ID associated to the adgroup.',
  `id` VARCHAR(18) NOT NULL COMMENT 'Ad group ID.',
  `is_creative_optimization` TINYINT(1) DEFAULT NULL COMMENT 'Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.',
  `is_local_inventory` TINYINT(1) DEFAULT NULL COMMENT 'Indicates whether the ad group should use the local inventory.',
  `lifetime_frequency_cap` INT DEFAULT NULL COMMENT 'Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field.',
  `local_inventory_radius_in_miles` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The targeting radius of the local inventory ads in miles.',
  `name` TEXT NOT NULL COMMENT 'Ad group name.',
  `optimization_goal_metadata` TEXT DEFAULT NULL COMMENT 'Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.',
  `performance_plus_campaign_settings` TEXT DEFAULT NULL COMMENT 'Pinterest Performance+ campaign settings.',
  `placement_group` TEXT DEFAULT NULL COMMENT '[Placement group](https://help.pinterest.com/en/business/article/placement-groups).',
  `placement_traffic_type` TEXT DEFAULT NULL COMMENT 'A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both',
  `promotion_application_level` TEXT DEFAULT NULL COMMENT 'Specify if the promotion is applied at ad group or item level',
  `promotion_id` TEXT COMMENT 'Promotion ID. To clear this field, set to null.',
  `promotion_ids` JSON DEFAULT NULL COMMENT 'Promotion IDs list. To clear this field, set to an empty array [].',
  `start_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.',
  `status` TEXT DEFAULT NULL COMMENT 'Ad group/entity status.',
  `summary_status` TEXT NOT NULL,
  `targeting_spec` TEXT DEFAULT NULL,
  `targeting_template_ids` JSON DEFAULT NULL COMMENT 'Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;].',
  `tracking_urls` TEXT DEFAULT NULL,
  `type` TEXT NOT NULL COMMENT 'Always \&quot;adgroup\&quot;.',
  `updated_time` INT NOT NULL COMMENT 'Ad group last update time. Unix timestamp in seconds.',
  `auto_targeting_enabled` TINYINT(1) DEFAULT NULL COMMENT 'Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting).',
  `bid_multiplier` DECIMAL(20, 9) UNSIGNED DEFAULT NULL COMMENT '[Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).',
  `budget_type` TEXT DEFAULT NULL,
  `pacing_delivery_type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupUpdateBatchUpdate` generated from model 'AdGroupUpdateBatchUpdate'
--

CREATE TABLE IF NOT EXISTS `AdGroupUpdateBatchUpdate` (
  `auto_targeting_enabled` TINYINT(1) DEFAULT NULL COMMENT 'Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting).',
  `bid_in_micro_currency` INT DEFAULT NULL COMMENT 'Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.',
  `bid_multiplier` DECIMAL(20, 9) UNSIGNED DEFAULT NULL COMMENT '[Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).',
  `bid_strategy_type` TEXT DEFAULT NULL,
  `billable_event` TEXT DEFAULT NULL,
  `budget_in_micro_currency` INT DEFAULT NULL COMMENT 'Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.',
  `budget_type` TEXT DEFAULT NULL,
  `campaign_id` TEXT DEFAULT NULL COMMENT 'Campaign ID of the ad group.',
  `customer_segment_id` TEXT DEFAULT NULL COMMENT 'Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;.',
  `end_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.',
  `ext_features` TEXT DEFAULT NULL,
  `feed_profile_id` TEXT DEFAULT NULL COMMENT 'Feed Profile ID associated to the adgroup.',
  `id` VARCHAR(18) NOT NULL COMMENT 'Ad group ID.',
  `is_creative_optimization` TINYINT(1) DEFAULT NULL COMMENT 'Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.',
  `is_local_inventory` TINYINT(1) DEFAULT NULL COMMENT 'Indicates whether the ad group should use the local inventory.',
  `lifetime_frequency_cap` INT DEFAULT NULL COMMENT 'Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field.',
  `local_inventory_radius_in_miles` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The targeting radius of the local inventory ads in miles.',
  `name` TEXT DEFAULT NULL COMMENT 'Ad group name.',
  `optimization_goal_metadata` TEXT DEFAULT NULL COMMENT 'Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.',
  `pacing_delivery_type` TEXT DEFAULT NULL,
  `performance_plus_campaign_settings` TEXT DEFAULT NULL COMMENT 'Pinterest Performance+ campaign settings.',
  `placement_group` TEXT DEFAULT NULL COMMENT '[Placement group](https://help.pinterest.com/en/business/article/placement-groups).',
  `placement_traffic_type` TEXT DEFAULT NULL COMMENT 'A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both',
  `promotion_application_level` TEXT DEFAULT NULL COMMENT 'Specify if the promotion is applied at ad group or item level',
  `promotion_id` TEXT COMMENT 'Promotion ID. To clear this field, set to null.',
  `promotion_ids` JSON DEFAULT NULL COMMENT 'Promotion IDs list. To clear this field, set to an empty array [].',
  `start_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.',
  `status` TEXT DEFAULT NULL COMMENT 'Ad group/entity status.',
  `targeting_spec` TEXT DEFAULT NULL,
  `targeting_spec_operations` JSON DEFAULT NULL,
  `targeting_template_ids` JSON DEFAULT NULL COMMENT 'Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;].',
  `tracking_urls` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupUpdateRequest` generated from model 'AdGroupUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `AdGroupUpdateRequest` (
  `bid_multiplier` DECIMAL(20, 9) UNSIGNED DEFAULT NULL COMMENT '&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;.',
  `id` TEXT NOT NULL COMMENT 'Ad group ID.',
  `targeting_spec_operations` JSON DEFAULT NULL COMMENT '&lt;div&gt;Targeting spec operations define modifications to apply to the targeting spec.&lt;/div&gt; &lt;br /&gt; &lt;div&gt;&lt;strong&gt;NOTE:&lt;/strong&gt; The &lt;code&gt;targeting_spec&lt;/code&gt; and &lt;code&gt;targeting_spec_operations&lt;/code&gt; cannot be sent at the same time.&lt;/div&gt; &lt;br /&gt; &lt;div&gt;The supported operations are:&lt;/div&gt; &lt;ul&gt; &lt;li&gt;&lt;code&gt;SET&lt;/code&gt;: sets the field with the given values. If value is set to &lt;code&gt;null&lt;/code&gt;, the field will be removed.&lt;/li&gt; &lt;li&gt;&lt;code&gt;ADD&lt;/code&gt;: adds the given values to the field.&lt;/li&gt; &lt;li&gt;&lt;code&gt;REMOVE&lt;/code&gt;: removes the given values from the field.&lt;/li&gt; &lt;/ul&gt; &lt;div&gt;Note the following:&lt;/div&gt; &lt;ul&gt; &lt;li&gt;Same items are not added and removed at the same time.&lt;/li&gt; &lt;li&gt;For a given field, only &lt;code&gt;ADD&lt;/code&gt;/&lt;code&gt;REMOVE&lt;/code&gt; or &lt;code&gt;SET&lt;/code&gt; operations are allowed, not a mix of them.&lt;/li&gt; &lt;li&gt;Only one SET operation is allowed for a given field.&lt;/li&gt; &lt;li&gt;The &lt;code&gt;AGE_BUCKET&lt;/code&gt;, &lt;code&gt;MAXIMUM_AGE&lt;/code&gt;, &lt;code&gt;MINIMUM_AGE&lt;/code&gt; and &lt;code&gt;SHOPPING_RETARGETING&lt;/code&gt; fields only support the &lt;code&gt;SET&lt;/code&gt; operation.&lt;/li&gt; &lt;/ul&gt;',
  `auto_targeting_enabled` TINYINT(1) DEFAULT NULL COMMENT 'Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;Pinterest Performance+ targeting\&quot;&lt;/a&gt;.',
  `bid_in_micro_currency` INT DEFAULT NULL COMMENT 'Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.',
  `bid_strategy_type` TEXT DEFAULT NULL,
  `billable_event` TEXT DEFAULT NULL,
  `budget_in_micro_currency` INT DEFAULT NULL COMMENT 'Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.',
  `budget_type` TEXT DEFAULT NULL,
  `campaign_id` TEXT DEFAULT NULL COMMENT 'Campaign ID of the ad group.',
  `end_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.',
  `is_creative_optimization` TINYINT(1) DEFAULT NULL COMMENT 'Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.',
  `lifetime_frequency_cap` INT DEFAULT NULL COMMENT 'Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.',
  `name` TEXT DEFAULT NULL COMMENT 'Ad group name.',
  `optimization_goal_metadata` JSON DEFAULT NULL COMMENT 'Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.',
  `pacing_delivery_type` TEXT DEFAULT NULL,
  `placement_group` TEXT DEFAULT NULL COMMENT '&lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.',
  `promotion_application_level` ENUM('NONE', 'ITEM', 'AD_GROUP', 'null') DEFAULT NULL COMMENT 'Specify if the promotion is applied at ad group or item level',
  `promotion_id` TEXT COMMENT 'Promotion ID. To clear this field, set to null.',
  `promotion_ids` JSON DEFAULT NULL COMMENT 'Promotion IDs list. To clear this field, set to an empty array [].',
  `start_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.',
  `status` TEXT DEFAULT NULL COMMENT 'Ad group/entity status.',
  `targeting_spec` TEXT DEFAULT NULL,
  `targeting_template_ids` JSON DEFAULT NULL COMMENT 'Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;].',
  `tracking_urls` JSON DEFAULT NULL COMMENT 'Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - EmptyObject - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupUpdateRequestAllOf1` generated from model 'AdGroupUpdateRequestAllOf1'
--

CREATE TABLE IF NOT EXISTS `AdGroupUpdateRequestAllOf1` (
  `bid_multiplier` DECIMAL(20, 9) UNSIGNED DEFAULT NULL COMMENT '&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;.',
  `id` TEXT NOT NULL COMMENT 'Ad group ID.',
  `targeting_spec_operations` JSON DEFAULT NULL COMMENT '&lt;div&gt;Targeting spec operations define modifications to apply to the targeting spec.&lt;/div&gt; &lt;br /&gt; &lt;div&gt;&lt;strong&gt;NOTE:&lt;/strong&gt; The &lt;code&gt;targeting_spec&lt;/code&gt; and &lt;code&gt;targeting_spec_operations&lt;/code&gt; cannot be sent at the same time.&lt;/div&gt; &lt;br /&gt; &lt;div&gt;The supported operations are:&lt;/div&gt; &lt;ul&gt; &lt;li&gt;&lt;code&gt;SET&lt;/code&gt;: sets the field with the given values. If value is set to &lt;code&gt;null&lt;/code&gt;, the field will be removed.&lt;/li&gt; &lt;li&gt;&lt;code&gt;ADD&lt;/code&gt;: adds the given values to the field.&lt;/li&gt; &lt;li&gt;&lt;code&gt;REMOVE&lt;/code&gt;: removes the given values from the field.&lt;/li&gt; &lt;/ul&gt; &lt;div&gt;Note the following:&lt;/div&gt; &lt;ul&gt; &lt;li&gt;Same items are not added and removed at the same time.&lt;/li&gt; &lt;li&gt;For a given field, only &lt;code&gt;ADD&lt;/code&gt;/&lt;code&gt;REMOVE&lt;/code&gt; or &lt;code&gt;SET&lt;/code&gt; operations are allowed, not a mix of them.&lt;/li&gt; &lt;li&gt;Only one SET operation is allowed for a given field.&lt;/li&gt; &lt;li&gt;The &lt;code&gt;AGE_BUCKET&lt;/code&gt;, &lt;code&gt;MAXIMUM_AGE&lt;/code&gt;, &lt;code&gt;MINIMUM_AGE&lt;/code&gt; and &lt;code&gt;SHOPPING_RETARGETING&lt;/code&gt; fields only support the &lt;code&gt;SET&lt;/code&gt; operation.&lt;/li&gt; &lt;/ul&gt;'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupsAnalyticsMetrics` generated from model 'AdGroupsAnalyticsMetrics'
--

CREATE TABLE IF NOT EXISTS `AdGroupsAnalyticsMetrics` (
  `AD_GROUP_ID` TEXT DEFAULT NULL COMMENT 'The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true.',
  `DATE` DATE DEFAULT NULL COMMENT 'Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ad_groups_create_200_response` generated from model 'adUnderscoregroupsUnderscorecreateUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `ad_groups_create_200_response` (
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ad_groups_create_200_response_items_inner` generated from model 'adUnderscoregroupsUnderscorecreateUnderscore200UnderscoreresponseUnderscoreitemsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `ad_groups_create_200_response_items_inner` (
  `data` TEXT DEFAULT NULL,
  `exceptions` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ad_groups_list_200_response` generated from model 'adUnderscoregroupsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `ad_groups_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdPinAnalytics` generated from model 'AdPinAnalytics'
--

CREATE TABLE IF NOT EXISTS `AdPinAnalytics` (
  `DATE` DATE DEFAULT NULL COMMENT 'Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)',
  `PIN_ID` TEXT NOT NULL COMMENT 'The ID of the pin that the metric belongs to.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdPreviewRequest` generated from model 'AdPreviewRequest'
--

CREATE TABLE IF NOT EXISTS `AdPreviewRequest` (
  `image_url` TEXT NOT NULL COMMENT 'Image URL.',
  `promotion_id` TEXT DEFAULT NULL COMMENT 'Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.',
  `title` TEXT NOT NULL COMMENT 'Title displayed below ad.',
  `creative_type` TEXT NOT NULL COMMENT 'Ad format of the shopping ad preview.',
  `pin_id` TEXT NOT NULL COMMENT 'Pin ID.',
  `catalog_product_group_id` TEXT NOT NULL COMMENT 'Catalog Product Group Id.',
  `customizable_cta_type` TEXT DEFAULT NULL COMMENT 'Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60;',
  `hero_image_title` TEXT DEFAULT NULL COMMENT 'Title displayed below ad.',
  `hero_image_url` TEXT DEFAULT NULL COMMENT 'Hero image URL.',
  `hero_pin_id` TEXT DEFAULT NULL COMMENT 'Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.',
  `image_tag` TEXT DEFAULT NULL COMMENT 'Multi image template tag.',
  `item_id` TEXT DEFAULT NULL COMMENT 'Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.',
  `preferred_media_type` TEXT DEFAULT NULL COMMENT 'Preferred media type.',
  `show_promotion` TINYINT(1) DEFAULT NULL COMMENT 'Include promotion data in preview when available on catalog item. Defaults to false.',
  `video_tag` TEXT DEFAULT NULL COMMENT 'Multi video template tag, image_tag and video_tag are mutual exclusive.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdPreviewShopping` generated from model 'AdPreviewShopping'
-- Ad preview from a catalog product group (shopping).
--

CREATE TABLE IF NOT EXISTS `AdPreviewShopping` (
  `catalog_product_group_id` TEXT NOT NULL COMMENT 'Catalog Product Group Id.',
  `creative_type` TEXT NOT NULL COMMENT 'Ad format of the shopping ad preview.',
  `customizable_cta_type` TEXT DEFAULT NULL COMMENT 'Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60;',
  `hero_image_title` TEXT DEFAULT NULL COMMENT 'Title displayed below ad.',
  `hero_image_url` TEXT DEFAULT NULL COMMENT 'Hero image URL.',
  `hero_pin_id` TEXT DEFAULT NULL COMMENT 'Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.',
  `image_tag` TEXT DEFAULT NULL COMMENT 'Multi image template tag.',
  `item_id` TEXT DEFAULT NULL COMMENT 'Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.',
  `preferred_media_type` TEXT DEFAULT NULL COMMENT 'Preferred media type.',
  `show_promotion` TINYINT(1) DEFAULT NULL COMMENT 'Include promotion data in preview when available on catalog item. Defaults to false.',
  `video_tag` TEXT DEFAULT NULL COMMENT 'Multi video template tag, image_tag and video_tag are mutual exclusive.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ad preview from a catalog product group (shopping).';

--
-- Table structure for table `AdPreviewSourceImage` generated from model 'AdPreviewSourceImage'
-- Ad preview source from an image URL.
--

CREATE TABLE IF NOT EXISTS `AdPreviewSourceImage` (
  `image_url` TEXT NOT NULL COMMENT 'Image URL.',
  `promotion_id` TEXT DEFAULT NULL COMMENT 'Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.',
  `title` TEXT NOT NULL COMMENT 'Title displayed below ad.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ad preview source from an image URL.';

--
-- Table structure for table `AdPreviewSourcePinId` generated from model 'AdPreviewSourcePinId'
-- Ad preview source from an existing Pin.
--

CREATE TABLE IF NOT EXISTS `AdPreviewSourcePinId` (
  `creative_type` TEXT DEFAULT NULL COMMENT 'Creative type of the ad preview.',
  `pin_id` TEXT NOT NULL COMMENT 'Pin ID.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ad preview source from an existing Pin.';

--
-- Table structure for table `AdPreviewURLResponse` generated from model 'AdPreviewURLResponse'
--

CREATE TABLE IF NOT EXISTS `AdPreviewURLResponse` (
  `url` TEXT DEFAULT NULL COMMENT 'Preview URL, expires in 7 days. Can be used in an iframe. For example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/ The preview object ID/key is the last param - 74667c814dd2b19'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdUpdateRequest` generated from model 'AdUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `AdUpdateRequest` (
  `id` TEXT NOT NULL COMMENT 'The ID of this ad.',
  `pin_id` TEXT DEFAULT NULL COMMENT 'Pin ID. This field may only be updated for draft ads.',
  `ad_group_id` TEXT DEFAULT NULL COMMENT 'ID of the ad group that contains the ad.',
  `android_deep_link` TEXT DEFAULT NULL COMMENT 'Deep link URL for Android devices.',
  `carousel_android_deep_links` JSON DEFAULT NULL COMMENT 'Comma-separated deep links for the carousel pin on Android.',
  `carousel_destination_urls` JSON DEFAULT NULL COMMENT 'Comma-separated destination URLs for the carousel pin to promote.',
  `carousel_ios_deep_links` JSON DEFAULT NULL COMMENT 'Comma-separated deep links for the carousel pin on iOS.',
  `click_tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking url for the ad clicks.',
  `creative_type` TEXT DEFAULT NULL,
  `customizable_cta_type` TEXT DEFAULT NULL,
  `destination_url` TEXT DEFAULT NULL COMMENT 'Destination URL.',
  `disclosure_type` TEXT DEFAULT NULL,
  `disclosure_url` TEXT DEFAULT NULL COMMENT 'URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.',
  `grid_click_type` TEXT DEFAULT NULL,
  `ios_deep_link` TEXT DEFAULT NULL COMMENT 'Deep link URL for iOS devices.',
  `is_carting` TINYINT(1) DEFAULT NULL COMMENT 'Is the ad a carting/WTB ad?',
  `is_pin_deleted` TINYINT(1) DEFAULT NULL COMMENT 'Is original pin deleted?',
  `is_removable` TINYINT(1) DEFAULT NULL COMMENT 'Is pin repinnable?',
  `lead_form_id` TEXT DEFAULT NULL COMMENT 'Lead form ID for lead ad generation.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the ad - 255 chars max.',
  `quiz_pin_data` JSON DEFAULT NULL COMMENT 'Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.',
  `status` TEXT DEFAULT NULL,
  `tracking_urls` JSON DEFAULT NULL,
  `view_tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking URL for ad impressions.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdUpdateRequestAllOf1` generated from model 'AdUpdateRequestAllOf1'
--

CREATE TABLE IF NOT EXISTS `AdUpdateRequestAllOf1` (
  `id` TEXT NOT NULL COMMENT 'The ID of this ad.',
  `pin_id` TEXT DEFAULT NULL COMMENT 'Pin ID. This field may only be updated for draft ads.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdgroupTrackingFeatures` generated from model 'AdgroupTrackingFeatures'
--

CREATE TABLE IF NOT EXISTS `AdgroupTrackingFeatures` (
  `enabled` JSON DEFAULT NULL COMMENT 'Tracking features. To clear this field, set to null.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdsAnalytics` generated from model 'AdsAnalytics'
--

CREATE TABLE IF NOT EXISTS `AdsAnalytics` (
  `AD_ID` TEXT NOT NULL,
  `DATE` DATE DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdsAnalyticsCreateAsyncRequest` generated from model 'AdsAnalyticsCreateAsyncRequest'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequest` (
  `ad_group_ids` JSON DEFAULT NULL COMMENT 'List of ad group ids',
  `ad_group_statuses` JSON DEFAULT NULL COMMENT 'List of values for filtering',
  `ad_ids` JSON DEFAULT NULL COMMENT 'List of ad ids. This parameter is not supported for Product Item level reports.',
  `ad_statuses` JSON DEFAULT NULL COMMENT 'List of values for filtering. This parameter is not supported for Product Item level reports.',
  `attribution_types` JSON DEFAULT NULL COMMENT 'List of attribution types for the conversion report.',
  `campaign_brand_label` TEXT DEFAULT NULL COMMENT 'Campaign brand label for filtering.',
  `campaign_custom_label` TEXT DEFAULT NULL COMMENT 'Campaign custom label for filtering.',
  `campaign_ids` JSON DEFAULT NULL COMMENT 'List of campaign ids',
  `campaign_objective_types` JSON DEFAULT NULL COMMENT 'List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA.',
  `campaign_statuses` JSON DEFAULT NULL COMMENT 'List of status values for filtering',
  `click_window_days` TEXT COMMENT 'Number of days to use as the conversion attribution window for a pin click action.',
  `columns` JSON DEFAULT NULL COMMENT 'Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.',
  `combine_targeting_types` TINYINT(1) DEFAULT false COMMENT 'Determines if the targeting types included in the request should be consolidated into a single breakdown.',
  `conversion_report_time` TEXT COMMENT 'Date dimension for conversion metrics.',
  `custom_conversion_event_metrics` JSON DEFAULT NULL COMMENT 'List of advertiser-defined custom conversion event metrics to include in the report',
  `end_date` TEXT NOT NULL COMMENT 'Metric report end date (UTC). Format: YYYY-MM-DD',
  `end_hour` TINYINT UNSIGNED DEFAULT NULL COMMENT 'Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.',
  `engagement_window_days` TEXT COMMENT 'Number of days to use as the conversion attribution window for an engagement action.',
  `granularity` TEXT NOT NULL COMMENT '  TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.',
  `level` TEXT DEFAULT NULL COMMENT 'Level of the report',
  `metrics_filters` JSON DEFAULT NULL COMMENT 'List of metrics filters',
  `primary_sort` TEXT,
  `product_group_ids` JSON DEFAULT NULL COMMENT 'List of product group ids',
  `product_group_statuses` JSON DEFAULT NULL COMMENT 'List of values for filtering',
  `product_item_ids` JSON DEFAULT NULL COMMENT 'List of product item ids',
  `report_format` TEXT,
  `reporting_timezone` TEXT DEFAULT NULL COMMENT 'Specify the timezone to be applied for the reporting.',
  `start_date` TEXT NOT NULL COMMENT 'Metric report start date (UTC). Format: YYYY-MM-DD',
  `start_hour` TINYINT UNSIGNED DEFAULT NULL COMMENT 'Which hour of the start date to begin the report. Only allowed for hourly reports.',
  `targeting_types` JSON DEFAULT NULL COMMENT 'List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;.',
  `view_window_days` TEXT COMMENT 'Number of days to use as the conversion attribution window for a view action.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdsAnalyticsCreateAsyncResponse` generated from model 'AdsAnalyticsCreateAsyncResponse'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncResponse` (
  `message` TEXT DEFAULT NULL,
  `report_status` TEXT DEFAULT NULL,
  `token` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdsAnalyticsGetAsyncResponse` generated from model 'AdsAnalyticsGetAsyncResponse'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsGetAsyncResponse` (
  `report_status` TEXT DEFAULT NULL,
  `size` DECIMAL(20, 9) DEFAULT NULL,
  `url` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdsAnalyticsMetricsFilter` generated from model 'AdsAnalyticsMetricsFilter'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsMetricsFilter` (
  `field` TEXT NOT NULL,
  `operator` TEXT NOT NULL,
  `values` JSON NOT NULL COMMENT 'List of values for filtering'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdsCreditDiscountsResponse` generated from model 'AdsCreditDiscountsResponse'
--

CREATE TABLE IF NOT EXISTS `AdsCreditDiscountsResponse` (
  `active` TINYINT(1) DEFAULT NULL COMMENT 'True if the offer code is currently active.',
  `advertiser_id` TEXT DEFAULT NULL COMMENT 'Advertiser ID the offer was applied to.',
  `discountCurrency` TEXT DEFAULT NULL COMMENT 'Currency value for the discount.',
  `discountInMicroCurrency` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The discount applied in the offer&#39;s currency value.',
  `discountType` TEXT DEFAULT NULL COMMENT 'The type of discount of this credit',
  `remainingDiscountInMicroCurrency` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The credits left to spend.',
  `title` TEXT DEFAULT NULL COMMENT 'Human readable title of the offer code.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdsCreditRedeem` generated from model 'AdsCreditRedeem'
-- Ads credit redemption
--

CREATE TABLE IF NOT EXISTS `AdsCreditRedeem` (
  `errorCode` INT DEFAULT NULL COMMENT 'Error code type if error occurs',
  `errorMessage` TEXT DEFAULT NULL COMMENT 'Reason for failure',
  `success` TINYINT(1) DEFAULT NULL COMMENT 'Returns true if the offer code was successfully applied(validateOnly&#x3D;false) or can be applied(validateOnly&#x3D;true).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ads credit redemption';

--
-- Table structure for table `AdsCreditRedeemCreate` generated from model 'AdsCreditRedeemCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `AdsCreditRedeemCreate` (
  `offerCodeHash` TEXT NOT NULL COMMENT 'Takes in a SHA256 hash of the offerCode.',
  `validateOnly` TINYINT(1) NOT NULL COMMENT 'If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `ads_credits_discounts_get_200_response` generated from model 'adsUnderscorecreditsUnderscorediscountsUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `ads_credits_discounts_get_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ads_list_200_response` generated from model 'adsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `ads_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdvancedAuctionBidOptions` generated from model 'AdvancedAuctionBidOptions'
-- Object describing a retail catalog item&#39;s bid options (bid price and bid multipliers).
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionBidOptions` (
  `app_type_multipliers` TEXT DEFAULT NULL,
  `bid_in_micro_currency` BIGINT DEFAULT NULL COMMENT 'Bid price in micro currency. A value of 0 will stop distribution for this item in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. A value of &#x60;null&#x60; will fallback to the ad group&#39;s &#x60;bid_in_micro_currency&#x60;.',
  `placement_multipliers` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing a retail catalog item&#39;s bid options (bid price and bid multipliers).';

--
-- Table structure for table `AdvancedAuctionItem` generated from model 'AdvancedAuctionItem'
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItem` (
  `bid_options` TEXT NOT NULL,
  `country` TEXT NOT NULL,
  `item_id` TEXT NOT NULL COMMENT 'The catalog retail item id in the merchant namespace',
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdvancedAuctionItems` generated from model 'AdvancedAuctionItems'
-- Response object containing item bid options
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItems` (
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Response object of item bid options',
  `items` JSON DEFAULT NULL COMMENT 'Array with item bid options'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Response object containing item bid options';

--
-- Table structure for table `AdvancedAuctionItemsGetRequest` generated from model 'AdvancedAuctionItemsGetRequest'
-- Request object used to get bid options values for a batch of retail catalog items
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsGetRequest` (
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog id pertaining to the retail item',
  `items` JSON NOT NULL COMMENT 'A list of retail catalog items to fetch bid options for'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object used to get bid options values for a batch of retail catalog items';

--
-- Table structure for table `AdvancedAuctionItemsSubmitDeleteRecord` generated from model 'AdvancedAuctionItemsSubmitDeleteRecord'
-- Object describing an item bid option deletion operation
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsSubmitDeleteRecord` (
  `country` TEXT NOT NULL,
  `errors` JSON DEFAULT NULL COMMENT 'Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.',
  `item_id` TEXT NOT NULL COMMENT 'The catalog retail item id in the merchant namespace',
  `language` TEXT NOT NULL,
  `operation` ENUM('DELETE') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an item bid option deletion operation';

--
-- Table structure for table `AdvancedAuctionItemsSubmitRecord` generated from model 'AdvancedAuctionItemsSubmitRecord'
-- Object describing an item bid option operation
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsSubmitRecord` (
  `bid_options` TEXT NOT NULL,
  `country` TEXT NOT NULL,
  `errors` JSON DEFAULT NULL COMMENT 'Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.',
  `item_id` TEXT NOT NULL COMMENT 'The catalog retail item id in the merchant namespace',
  `language` TEXT NOT NULL,
  `operation` ENUM('DELETE') NOT NULL,
  `update_mask` JSON NOT NULL COMMENT 'The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an item bid option operation';

--
-- Table structure for table `AdvancedAuctionItemsSubmitRequest` generated from model 'AdvancedAuctionItemsSubmitRequest'
-- Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsSubmitRequest` (
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog id pertaining to all items',
  `items` JSON NOT NULL COMMENT 'Array of item bid option operations'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items';

--
-- Table structure for table `AdvancedAuctionItemsSubmitUpsertRecord` generated from model 'AdvancedAuctionItemsSubmitUpsertRecord'
-- Object describing an item bid option upsert operation
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsSubmitUpsertRecord` (
  `bid_options` TEXT NOT NULL,
  `country` TEXT NOT NULL,
  `errors` JSON DEFAULT NULL COMMENT 'Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.',
  `item_id` TEXT NOT NULL COMMENT 'The catalog retail item id in the merchant namespace',
  `language` TEXT NOT NULL,
  `operation` ENUM('UPSERT') NOT NULL,
  `update_mask` JSON NOT NULL COMMENT 'The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an item bid option upsert operation';

--
-- Table structure for table `AdvancedAuctionKey` generated from model 'AdvancedAuctionKey'
-- Object uniquely identifying a retail catalog item
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionKey` (
  `country` TEXT NOT NULL,
  `item_id` TEXT NOT NULL COMMENT 'The catalog retail item id in the merchant namespace',
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object uniquely identifying a retail catalog item';

--
-- Table structure for table `AdvancedAuctionOperationError` generated from model 'AdvancedAuctionOperationError'
-- Error which occurred when applying a bid options operation to a specific item.
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionOperationError` (
  `code` INT DEFAULT NULL COMMENT 'The error code for the item bid option operation validation error',
  `message` TEXT DEFAULT NULL COMMENT 'Message describing the item bid option operation validation error'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Error which occurred when applying a bid options operation to a specific item.';

--
-- Table structure for table `AdvancedAuctionProcessedItems` generated from model 'AdvancedAuctionProcessedItems'
-- Response object containing the results of an operation on an item bid option
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionProcessedItems` (
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to all items',
  `items` JSON DEFAULT NULL COMMENT 'Array of advanced auction processed items'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Response object containing the results of an operation on an item bid option';

--
-- Table structure for table `AdvertiserDefinedEvent` generated from model 'AdvertiserDefinedEvent'
-- Advertiser defined event
--

CREATE TABLE IF NOT EXISTS `AdvertiserDefinedEvent` (
  `mapped_conversion_type` TEXT DEFAULT NULL COMMENT 'Standard type mapped to ADE for optimization',
  `name` TEXT DEFAULT NULL COMMENT 'Raw string name of the event, usually logged as raw_event_name in our dataset'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Advertiser defined event';

--
-- Table structure for table `AdvertiserDefinedEventInput` generated from model 'AdvertiserDefinedEventInput'
-- Advertiser defined event input for create/update operations
--

CREATE TABLE IF NOT EXISTS `AdvertiserDefinedEventInput` (
  `mapped_conversion_type` TEXT NOT NULL COMMENT 'Pinterest standard event type to map this custom event to for campaign optimization and reporting',
  `name` TEXT NOT NULL COMMENT 'Raw string name of the event'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Advertiser defined event input for create/update operations';

--
-- Table structure for table `AdvertiserDefinedEventProcessingRecord` generated from model 'AdvertiserDefinedEventProcessingRecord'
-- Processing record for an advertiser defined event operation
--

CREATE TABLE IF NOT EXISTS `AdvertiserDefinedEventProcessingRecord` (
  `exceptions` JSON DEFAULT NULL COMMENT 'List of exception messages if the operation failed',
  `name` TEXT NOT NULL COMMENT 'Name of the advertiser defined event',
  `status` TEXT NOT NULL COMMENT 'Processing status (success or failure)'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Processing record for an advertiser defined event operation';

--
-- Table structure for table `advertiser_defined_events_create_200_response` generated from model 'advertiserUnderscoredefinedUnderscoreeventsUnderscorecreateUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `advertiser_defined_events_create_200_response` (
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdvertiserDefinedEventsCreateRequest` generated from model 'AdvertiserDefinedEventsCreateRequest'
-- Request body for creating or updating advertiser defined events
--

CREATE TABLE IF NOT EXISTS `AdvertiserDefinedEventsCreateRequest` (
  `items` JSON NOT NULL COMMENT 'List of advertiser defined events to create or update'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request body for creating or updating advertiser defined events';

--
-- Table structure for table `advertiser_defined_events_get_200_response` generated from model 'advertiserUnderscoredefinedUnderscoreeventsUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `advertiser_defined_events_get_200_response` (
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AgeBucketMultipliers` generated from model 'AgeBucketMultipliers'
-- This represents a mapping from age bucket to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified age bucket in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
--

CREATE TABLE IF NOT EXISTS `AgeBucketMultipliers` (
  `AGE_BUCKET` TEXT DEFAULT NULL COMMENT 'Age bucket identifier.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This represents a mapping from age bucket to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified age bucket in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).';

--
-- Table structure for table `AggregatedPinComment` generated from model 'AggregatedPinComment'
--

CREATE TABLE IF NOT EXISTS `AggregatedPinComment` (
  `ai_disclosures` TEXT DEFAULT NULL COMMENT 'AI disclosure declarations the creator has made about this Pin.',
  `alt_text` TEXT DEFAULT NULL,
  `board_id` TEXT DEFAULT NULL COMMENT 'The board to which this Pin belongs.',
  `board_owner` TEXT DEFAULT NULL,
  `board_section_id` TEXT DEFAULT NULL COMMENT 'The board section to which this Pin belongs.',
  `created_at` DATETIME DEFAULT NULL,
  `creative_type` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `dominant_color` TEXT DEFAULT NULL COMMENT 'Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;.',
  `has_been_promoted` TINYINT(1) DEFAULT NULL COMMENT 'Whether the Pin has been promoted or not.',
  `id` TEXT NOT NULL,
  `is_owner` TINYINT(1) DEFAULT NULL COMMENT 'Whether the \&quot;operation user_account\&quot; is the Pin owner.',
  `is_product` TINYINT(1) DEFAULT NULL COMMENT 'Whether the Pin is a product Pin.',
  `is_standard` TINYINT(1) DEFAULT NULL COMMENT 'Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.',
  `link` TEXT DEFAULT NULL,
  `media` TEXT DEFAULT NULL,
  `parent_pin_id` TEXT DEFAULT NULL COMMENT 'The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).',
  `pin_metrics` JSON DEFAULT NULL COMMENT 'Pin metrics with associated time intervals if any.',
  `title` VARCHAR(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AiDisclosures` generated from model 'AiDisclosures'
-- AI disclosure declarations the creator has made about the Pin.
--

CREATE TABLE IF NOT EXISTS `AiDisclosures` (
  `values` JSON NOT NULL COMMENT 'List of AI disclosure declarations the creator has made about this Pin.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='AI disclosure declarations the creator has made about the Pin.';

--
-- Table structure for table `AiDisclosuresUpdate` generated from model 'AiDisclosuresUpdate'
-- AI disclosure declarations the creator has made about the Pin.
--

CREATE TABLE IF NOT EXISTS `AiDisclosuresUpdate` (
  `values` JSON DEFAULT NULL COMMENT 'List of AI disclosure declarations the creator has made about this Pin.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='AI disclosure declarations the creator has made about the Pin.';

--
-- Table structure for table `AmazonConnectRequest` generated from model 'AmazonConnectRequest'
-- Request containing OTP and Amazon storefront info called by Amazon
--

CREATE TABLE IF NOT EXISTS `AmazonConnectRequest` (
  `amazon_storefront_id` TEXT DEFAULT NULL COMMENT 'The Amazon storefront id',
  `amazon_storefront_name` TEXT NOT NULL COMMENT 'The Amazon storefront name',
  `amazon_storefront_url` TEXT NOT NULL COMMENT 'The Amazon storefront url',
  `amazon_user_id` TEXT DEFAULT NULL COMMENT 'The Amazon user id',
  `is_amazon_account_linked` TINYINT(1) NOT NULL COMMENT 'The Amazon account linking status',
  `one_time_passcode` TEXT DEFAULT NULL COMMENT 'The one time passcode for Pinterest-initiated linking requests',
  `pinterest_user_id` TEXT DEFAULT NULL COMMENT 'The Pinterest user id for Amazon-initiated linking requests'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request containing OTP and Amazon storefront info called by Amazon';

--
-- Table structure for table `AmazonConnectResponse` generated from model 'AmazonConnectResponse'
--

CREATE TABLE IF NOT EXISTS `AmazonConnectResponse` (
  `message` TEXT DEFAULT NULL COMMENT 'Amazon connect response message'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AnalyticsDailyMetrics` generated from model 'AnalyticsDailyMetrics'
--

CREATE TABLE IF NOT EXISTS `AnalyticsDailyMetrics` (
  `data_status` TEXT DEFAULT NULL,
  `date` TEXT DEFAULT NULL COMMENT 'Metrics date (UTC): YYYY-MM-DD.',
  `metrics` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AnalyticsMetricsResponse` generated from model 'AnalyticsMetricsResponse'
--

CREATE TABLE IF NOT EXISTS `AnalyticsMetricsResponse` (
  `daily_metrics` JSON DEFAULT NULL COMMENT 'Array with the requested daily metric records',
  `summary_metrics` JSON DEFAULT NULL COMMENT 'The metric name and value over the requested period for each requested metric'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AppTypeMultipliers` generated from model 'AppTypeMultipliers'
-- This represents a mapping from app type targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified app type in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
--

CREATE TABLE IF NOT EXISTS `AppTypeMultipliers` (
  `APP_TYPE` TEXT DEFAULT NULL COMMENT 'App type identifier.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This represents a mapping from app type targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified app type in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).';

--
-- Table structure for table `AppsflyerAudience` generated from model 'AppsflyerAudience'
-- Request model for creating an AppsFlyer audience
--

CREATE TABLE IF NOT EXISTS `AppsflyerAudience` (
  `container_id` TEXT NOT NULL COMMENT 'The ID of the audience container',
  `name` TEXT NOT NULL COMMENT 'The name of the audience',
  `platform` TEXT NOT NULL COMMENT 'The platform of the audience'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request model for creating an AppsFlyer audience';

--
-- Table structure for table `AppsflyerAudienceCreate` generated from model 'AppsflyerAudienceCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `AppsflyerAudienceCreate` (
  `name` TEXT NOT NULL COMMENT 'The name of the audience',
  `platform` TEXT NOT NULL COMMENT 'The platform of the audience'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `AppsflyerAudienceSyncCreate` generated from model 'AppsflyerAudienceSyncCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `AppsflyerAudienceSyncCreate` (
  `container_id` TEXT NOT NULL COMMENT 'The container ID of the audience',
  `url_adid_sha256` TEXT DEFAULT NULL COMMENT 'The pre-signed URL for SHA256 hashed GAID/IDFA file',
  `url_email_sha256` TEXT DEFAULT NULL COMMENT 'The pre-signed URL for SHA256 hashed email file'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `AssetAccessRequestError` generated from model 'AssetAccessRequestError'
--

CREATE TABLE IF NOT EXISTS `AssetAccessRequestError` (
  `code` INT DEFAULT NULL COMMENT 'Error code associated with the error in requesting asset access.',
  `messages` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssetGroupBinding` generated from model 'AssetGroupBinding'
--

CREATE TABLE IF NOT EXISTS `AssetGroupBinding` (
  `ad_accounts_ids` JSON NOT NULL COMMENT 'A list of ad account IDs under the asset group',
  `asset_group_description` TEXT NOT NULL COMMENT 'Asset group description',
  `asset_group_name` TEXT NOT NULL COMMENT 'Asset Group name',
  `asset_group_types` JSON NOT NULL COMMENT 'Asset group types',
  `catalogs_ids` JSON NOT NULL COMMENT 'A list of catalog IDs under asset group',
  `created_by` TEXT NOT NULL COMMENT 'The data of the user that created the asset group.',
  `created_time` INT NOT NULL COMMENT 'The creation time of the asset group',
  `id` TEXT NOT NULL COMMENT 'Asset Group ID.',
  `owner` TEXT NOT NULL COMMENT 'The data of the business that owns the asset group.',
  `profiles_ids` JSON NOT NULL COMMENT 'A list of profile IDs under asset group',
  `updated_time` INT NOT NULL COMMENT 'The last update time of the asset group'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssetGroupDeleteError` generated from model 'AssetGroupDeleteError'
--

CREATE TABLE IF NOT EXISTS `AssetGroupDeleteError` (
  `asset_group_id` TEXT DEFAULT NULL COMMENT 'Asset group id of the exception.',
  `code` INT DEFAULT NULL COMMENT 'Error code associated with the error deleting asset group.',
  `message` TEXT DEFAULT NULL COMMENT 'Error message associated with the error deleting asset group.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssetGroupDeletion` generated from model 'AssetGroupDeletion'
--

CREATE TABLE IF NOT EXISTS `AssetGroupDeletion` (
  `deleted_asset_groups` JSON DEFAULT NULL,
  `exceptions` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssetGroupDeletionDelete` generated from model 'AssetGroupDeletionDelete'
--

CREATE TABLE IF NOT EXISTS `AssetGroupDeletionDelete` (
  `asset_groups_to_delete` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssetGroupInput` generated from model 'AssetGroupInput'
--

CREATE TABLE IF NOT EXISTS `AssetGroupInput` (
  `asset_group` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssetGroupInputCreate` generated from model 'AssetGroupInputCreate'
--

CREATE TABLE IF NOT EXISTS `AssetGroupInputCreate` (
  `asset_group` TEXT DEFAULT NULL,
  `asset_group_description` TEXT NOT NULL COMMENT 'Asset group description.',
  `asset_group_name` TEXT NOT NULL COMMENT 'Asset Group name.',
  `asset_group_types` JSON NOT NULL COMMENT 'Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssetGroupModification` generated from model 'AssetGroupModification'
--

CREATE TABLE IF NOT EXISTS `AssetGroupModification` (
  `exceptions` JSON DEFAULT NULL COMMENT 'A list of errors associated with the asset groups. Will be returned if there is an error.',
  `updated_asset_groups` JSON DEFAULT NULL COMMENT 'A list of successfully edited asset groups.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssetGroupModificationReadOrUpdate` generated from model 'AssetGroupModificationReadOrUpdate'
--

CREATE TABLE IF NOT EXISTS `AssetGroupModificationReadOrUpdate` (
  `asset_groups_to_update` JSON DEFAULT NULL COMMENT 'A list of asset groups and the data that will be used to update them.',
  `exceptions` JSON DEFAULT NULL COMMENT 'A list of errors associated with the asset groups. Will be returned if there is an error.',
  `updated_asset_groups` JSON DEFAULT NULL COMMENT 'A list of successfully edited asset groups.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssetGroupUpdateError` generated from model 'AssetGroupUpdateError'
--

CREATE TABLE IF NOT EXISTS `AssetGroupUpdateError` (
  `asset_group_id` TEXT DEFAULT NULL,
  `code` INT DEFAULT NULL,
  `message` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssetGroupUpdateItemReadOrUpdateItem` generated from model 'AssetGroupUpdateItemReadOrUpdateItem'
--

CREATE TABLE IF NOT EXISTS `AssetGroupUpdateItemReadOrUpdateItem` (
  `asset_group_id` TEXT NOT NULL COMMENT 'Unique identifier of the asset group to update.',
  `asset_group_types` JSON DEFAULT NULL COMMENT 'Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.',
  `assets_to_add` JSON DEFAULT NULL COMMENT 'A list of asset ids to add to the asset group.',
  `assets_to_remove` JSON DEFAULT NULL COMMENT 'A list of asset ids to remove from the asset group.',
  `description` TEXT DEFAULT NULL COMMENT 'Asset group description.',
  `name` TEXT DEFAULT NULL COMMENT 'Asset Group name.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssetIdPermissions` generated from model 'AssetIdPermissions'
-- An object containing the permissions a business member has on the asset.
--

CREATE TABLE IF NOT EXISTS `AssetIdPermissions` (
  `asset_group_info` TEXT DEFAULT NULL COMMENT 'An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;.',
  `asset_id` VARCHAR(20) NOT NULL COMMENT 'Unique identifier of a business asset.',
  `asset_type` TEXT NOT NULL,
  `permissions` JSON NOT NULL COMMENT 'Permission levels member or partner has on an asset.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An object containing the permissions a business member has on the asset.';

--
-- Table structure for table `AssetIdWithPermissions` generated from model 'AssetIdWithPermissions'
-- Asset ID with permission levels.
--

CREATE TABLE IF NOT EXISTS `AssetIdWithPermissions` (
  `id` VARCHAR(20) DEFAULT NULL COMMENT 'Unique identifier of a business asset.',
  `permissions` JSON DEFAULT NULL COMMENT 'Permission levels member or partner has on an asset.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Asset ID with permission levels.';

--
-- Table structure for table `AttributionWindows` generated from model 'AttributionWindows'
--

CREATE TABLE IF NOT EXISTS `AttributionWindows` (
  `click_window_days` INT DEFAULT NULL,
  `engagement_window_days` INT DEFAULT NULL,
  `view_window_days` INT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Audience` generated from model 'Audience'
--

CREATE TABLE IF NOT EXISTS `Audience` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Ad account ID.',
  `audience_type` TEXT DEFAULT NULL COMMENT '[Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR',
  `created_by_company_name` TEXT DEFAULT NULL COMMENT 'The company that created this audience.',
  `created_timestamp` INT DEFAULT NULL COMMENT 'Creation time. Unix timestamp in seconds.',
  `description` TEXT DEFAULT NULL COMMENT 'Audience description.',
  `id` TEXT DEFAULT NULL COMMENT 'Audience ID.',
  `is_nca` TINYINT(1) DEFAULT NULL COMMENT 'Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.',
  `name` TEXT DEFAULT NULL COMMENT 'Audience name.',
  `rule` TEXT DEFAULT NULL,
  `size` INT DEFAULT NULL COMMENT 'Audience size.',
  `status` TEXT DEFAULT NULL COMMENT 'Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.',
  `type` TEXT DEFAULT NULL COMMENT 'Always \&quot;audience\&quot;.',
  `updated_timestamp` INT DEFAULT NULL COMMENT 'Last update time. Unix timestamp in seconds.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AudienceCategory` generated from model 'AudienceCategory'
--

CREATE TABLE IF NOT EXISTS `AudienceCategory` (
  `id` TEXT DEFAULT NULL COMMENT 'Interest ID.',
  `index` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Interest affinity index.',
  `key` TEXT DEFAULT NULL COMMENT 'Interest unique key (same as ID).',
  `name` TEXT DEFAULT NULL COMMENT 'Interest name.',
  `ratio` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Interest&#39;s percent of category&#39;s total audience.',
  `subcategories` JSON DEFAULT NULL COMMENT 'Subcategory interest distribution'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AudienceDefinition` generated from model 'AudienceDefinition'
-- Queryable audience representation.
--

CREATE TABLE IF NOT EXISTS `AudienceDefinition` (
  `date` TEXT DEFAULT NULL COMMENT 'Generation date',
  `scope` TEXT DEFAULT NULL,
  `type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Queryable audience representation.';

--
-- Table structure for table `AudienceDemographicValue` generated from model 'AudienceDemographicValue'
-- Demographic detail for a single audience demographic
--

CREATE TABLE IF NOT EXISTS `AudienceDemographicValue` (
  `key` TEXT DEFAULT NULL COMMENT 'Unique key for demographic item',
  `name` TEXT DEFAULT NULL COMMENT 'Display name for demographic',
  `ratio` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Value of demographic item as a percent of total audience'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Demographic detail for a single audience demographic';

--
-- Table structure for table `AudienceDemographics` generated from model 'AudienceDemographics'
-- Audience demographics
--

CREATE TABLE IF NOT EXISTS `AudienceDemographics` (
  `ages` JSON DEFAULT NULL COMMENT 'Ages distribution.',
  `countries` JSON DEFAULT NULL COMMENT 'Country area distribution.',
  `devices` JSON DEFAULT NULL COMMENT 'Device usage distribution.',
  `genders` JSON DEFAULT NULL COMMENT 'Gender distribution.',
  `metros` JSON DEFAULT NULL COMMENT 'Geographic metro area distribution.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Audience demographics';

--
-- Table structure for table `AudienceInsights` generated from model 'AudienceInsights'
-- Audience interests and demographics.
--

CREATE TABLE IF NOT EXISTS `AudienceInsights` (
  `categories` JSON DEFAULT NULL COMMENT 'Category interest distribution',
  `date` TEXT DEFAULT NULL COMMENT 'Generation date',
  `demographics` TEXT DEFAULT NULL,
  `size` INT DEFAULT NULL COMMENT 'Population count.',
  `size_is_upper_bound` TINYINT(1) DEFAULT NULL COMMENT 'Indicates whether the audience size has been rounded up to the next highest upper boundary.',
  `type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Audience interests and demographics.';

--
-- Table structure for table `audience_insights_scope_and_type_get_200_response` generated from model 'audienceUnderscoreinsightsUnderscorescopeUnderscoreandUnderscoretypeUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `audience_insights_scope_and_type_get_200_response` (
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AudienceRule` generated from model 'AudienceRule'
-- JSON object defining targeted audience users. Example rule formats per audience type:  CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}  ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; } (Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10. The targeted audience should be this % size across Pinterest.)  VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}} (Retention days should be 1-540. Retention applies to specific customers.)  ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.example.com\&quot;], \&quot;engager_type\&quot;: 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).
--

CREATE TABLE IF NOT EXISTS `AudienceRule` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Ad account ID.',
  `ad_id` JSON DEFAULT NULL COMMENT 'Ad ID for engagement audience filter.',
  `campaign_id` JSON DEFAULT NULL COMMENT 'Campaign ID for engagement audience filter.',
  `country` TEXT DEFAULT NULL COMMENT 'Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;.',
  `customer_list_id` TEXT DEFAULT NULL COMMENT 'Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;.',
  `engagement_domain` JSON DEFAULT NULL COMMENT 'The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;.',
  `engagement_type` TEXT DEFAULT NULL COMMENT 'Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set.',
  `engager_type` INT DEFAULT NULL COMMENT 'Optional for ENGAGEMENT. Engager type value should be 1-2.',
  `event` TEXT DEFAULT NULL COMMENT 'A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event.',
  `event_data` TEXT DEFAULT NULL,
  `event_source` JSON DEFAULT NULL COMMENT 'Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline',
  `ingestion_source` JSON DEFAULT NULL COMMENT 'Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api',
  `objective_type` JSON DEFAULT NULL COMMENT 'Objective for engagement audience filter.',
  `percentage` INT DEFAULT NULL COMMENT 'Percentage should be 1-10. The targeted audience should be this % size across Pinterest.',
  `pin_id` JSON DEFAULT NULL COMMENT 'IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, \&quot;pin_id:\&quot;: [\&quot;34567\&quot;]',
  `prefill` TINYINT(1) DEFAULT NULL COMMENT 'Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;.',
  `retention_days` INT DEFAULT NULL COMMENT 'Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified.',
  `seed_id` JSON DEFAULT NULL COMMENT 'Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;.',
  `url` JSON DEFAULT NULL COMMENT 'Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains]. Example 1:  \&quot;url\&quot;: \&quot;http://www.myonlinestore123.com/view_item/shoe\&quot; Example 2: \&quot;url\&quot;: {\&quot;contains\&quot;: \&quot;/view_item/shoe\&quot;}',
  `visitor_source_id` TEXT DEFAULT NULL COMMENT 'The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='JSON object defining targeted audience users. Example rule formats per audience type:  CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}  ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; } (Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10. The targeted audience should be this % size across Pinterest.)  VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}} (Retention days should be 1-540. Retention applies to specific customers.)  ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.example.com\&quot;], \&quot;engager_type\&quot;: 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).';

--
-- Table structure for table `AudienceSubcategory` generated from model 'AudienceSubcategory'
--

CREATE TABLE IF NOT EXISTS `AudienceSubcategory` (
  `id` TEXT DEFAULT NULL,
  `index` DECIMAL(20, 9) DEFAULT NULL,
  `key` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL,
  `ratio` DECIMAL(20, 9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `audiences_list_200_response` generated from model 'audiencesUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `audiences_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AuthRespondInviteAction` generated from model 'AuthRespondInviteAction'
--

CREATE TABLE IF NOT EXISTS `AuthRespondInviteAction` (
  `accept_invite` TINYINT(1) NOT NULL COMMENT 'Whether the invite/request is accepted.',
  `asset_id_to_permissions` JSON DEFAULT NULL COMMENT 'An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AuthRespondInvitesBody` generated from model 'AuthRespondInvitesBody'
-- An object with a list of all the invites the user would like to respond to and the action to take.
--

CREATE TABLE IF NOT EXISTS `AuthRespondInvitesBody` (
  `invites` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An object with a list of all the invites the user would like to respond to and the action to take.';

--
-- Table structure for table `AuthRespondInvitesBodyItem` generated from model 'AuthRespondInvitesBodyItem'
--

CREATE TABLE IF NOT EXISTS `AuthRespondInvitesBodyItem` (
  `action` TEXT NOT NULL,
  `invite_id` VARCHAR(25) NOT NULL COMMENT 'Unique identifier of an invite.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AvailabilityFilter` generated from model 'AvailabilityFilter'
--

CREATE TABLE IF NOT EXISTS `AvailabilityFilter` (
  `AVAILABILITY` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BaseBusinessAssets` generated from model 'BaseBusinessAssets'
-- An object containing the permissions a business has on the asset.
--

CREATE TABLE IF NOT EXISTS `BaseBusinessAssets` (
  `asset_group_info` TEXT DEFAULT NULL COMMENT 'An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;.',
  `asset_id` VARCHAR(20) DEFAULT NULL COMMENT 'Unique identifier of a business asset.',
  `asset_type` TEXT DEFAULT NULL,
  `permissions` JSON DEFAULT NULL COMMENT 'Permission levels the requesting business has on an asset.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An object containing the permissions a business has on the asset.';

--
-- Table structure for table `BaseInviteDataResponse` generated from model 'BaseInviteDataResponse'
-- Common invite/request data returned by the business access endpoints.
--

CREATE TABLE IF NOT EXISTS `BaseInviteDataResponse` (
  `id` TEXT DEFAULT NULL COMMENT 'Unique identifier of the invite/request.',
  `invite_data` TEXT DEFAULT NULL,
  `is_received_invite` TINYINT(1) DEFAULT NULL COMMENT 'Indicates whether the invite/request was received.',
  `user` TEXT DEFAULT NULL COMMENT 'Metadata for the member/partner that was sent the invite/request.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Common invite/request data returned by the business access endpoints.';

--
-- Table structure for table `BidFloor` generated from model 'BidFloor'
-- Bid floor request and response model.
--

CREATE TABLE IF NOT EXISTS `BidFloor` (
  `bid_floors` JSON DEFAULT NULL COMMENT 'A list of bid floors in micro currency. For example, [100000, 200000]',
  `type` TEXT COMMENT 'Always the string &#39;bidfloor&#39;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Bid floor request and response model.';

--
-- Table structure for table `BidFloorCreate` generated from model 'BidFloorCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `BidFloorCreate` (
  `bid_floor_specs` JSON NOT NULL COMMENT 'List of bid floor specifications.',
  `targeting_spec` TEXT DEFAULT NULL COMMENT 'Ad group targeting specification defining the ad group target audience.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `BidFloorSpec` generated from model 'BidFloorSpec'
-- Bid floor specification for a given campaign configuration.
--

CREATE TABLE IF NOT EXISTS `BidFloorSpec` (
  `billable_event` TEXT NOT NULL COMMENT 'Ad group billable event type.',
  `countries` JSON DEFAULT NULL COMMENT 'List of ISO 3166-1 alpha-2 country codes.',
  `creative_type` TEXT DEFAULT NULL COMMENT 'Creative type for the bid floor request.',
  `currency` TEXT NOT NULL COMMENT 'Currency for the bid floor value.',
  `objective_type` TEXT DEFAULT NULL COMMENT 'Campaign objective type.',
  `optimization_goal_metadata` TEXT DEFAULT NULL COMMENT 'Optimization goal metadata.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Bid floor specification for a given campaign configuration.';

--
-- Table structure for table `BidOptionsAgeBucketMultipliers` generated from model 'BidOptionsAgeBucketMultipliers'
-- This represents a mapping from age bucket to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `BidOptionsAgeBucketMultipliers` (
  `18-24` DECIMAL(20, 9) DEFAULT NULL,
  `25-34` DECIMAL(20, 9) DEFAULT NULL,
  `35-44` DECIMAL(20, 9) DEFAULT NULL,
  `45-49` DECIMAL(20, 9) DEFAULT NULL,
  `50-54` DECIMAL(20, 9) DEFAULT NULL,
  `55-64` DECIMAL(20, 9) DEFAULT NULL,
  `65+` DECIMAL(20, 9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This represents a mapping from age bucket to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.';

--
-- Table structure for table `BidOptionsAppTypeMultipliers` generated from model 'BidOptionsAppTypeMultipliers'
-- This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `BidOptionsAppTypeMultipliers` (
  `android_mobile` DECIMAL(20, 9) DEFAULT NULL,
  `android_tablet` DECIMAL(20, 9) DEFAULT NULL,
  `ipad` DECIMAL(20, 9) DEFAULT NULL,
  `iphone` DECIMAL(20, 9) DEFAULT NULL,
  `web` DECIMAL(20, 9) DEFAULT NULL,
  `web_mobile` DECIMAL(20, 9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.';

--
-- Table structure for table `BidOptionsAudienceMultipliers` generated from model 'BidOptionsAudienceMultipliers'
-- This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `BidOptionsAudienceMultipliers` (
  `audience_id` TEXT NOT NULL,
  `multiplier` DECIMAL(20, 9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.';

--
-- Table structure for table `BidOptionsGenderMultipliers` generated from model 'BidOptionsGenderMultipliers'
-- This represents a mapping from gender targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment.  All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `BidOptionsGenderMultipliers` (
  `female` DECIMAL(20, 9) DEFAULT NULL,
  `male` DECIMAL(20, 9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This represents a mapping from gender targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment.  All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.';

--
-- Table structure for table `BidOptionsPlacementMultipliers` generated from model 'BidOptionsPlacementMultipliers'
-- This represents a mapping from placement to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `BidOptionsPlacementMultipliers` (
  `browse` DECIMAL(20, 9) DEFAULT NULL,
  `related_pins` DECIMAL(20, 9) DEFAULT NULL,
  `search` DECIMAL(20, 9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This represents a mapping from placement to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.';

--
-- Table structure for table `BillingInvoice` generated from model 'BillingInvoice'
-- A billing invoice in the advertiser account.
--

CREATE TABLE IF NOT EXISTS `BillingInvoice` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'The ID of the ad account this invoice belongs to',
  `ad_account_name` TEXT DEFAULT NULL COMMENT 'The name of the ad account this invoice belongs to',
  `amount_billed_micro_currency` INT DEFAULT NULL COMMENT 'The amount billed in this invoice. Denoted in micro currency',
  `amount_discount_micro_currency` INT DEFAULT NULL COMMENT 'The discount in this invoice. Denoted in micro currency',
  `amount_net_micro_currency` INT DEFAULT NULL COMMENT 'The net amount in this invoice. Denoted in micro currency',
  `amount_tax_micro_currency` INT DEFAULT NULL COMMENT 'The tax in this invoice. Denoted in micro currency',
  `bill_to_country` TEXT DEFAULT NULL COMMENT 'The country of the bill to address',
  `billing_period_end_date` DATE DEFAULT NULL COMMENT 'The end date of the billing period. Format: YYYY-MM-DD',
  `billing_period_start_date` DATE DEFAULT NULL COMMENT 'The start date of the billing period. Format: YYYY-MM-DD',
  `currency` TEXT DEFAULT NULL,
  `document_type` TEXT DEFAULT NULL COMMENT 'The type of the document',
  `id` TEXT DEFAULT NULL COMMENT 'Unique identifier for the billing invoice',
  `invoice_due_date` DATE DEFAULT NULL COMMENT 'The date the invoice is due. Format: YYYY-MM-DD',
  `payment_terms` TEXT DEFAULT NULL COMMENT 'The payment terms of the invoice',
  `status` TEXT DEFAULT NULL COMMENT 'The status of the invoice'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A billing invoice in the advertiser account.';

--
-- Table structure for table `BillingInvoiceDownloadResponse` generated from model 'BillingInvoiceDownloadResponse'
--

CREATE TABLE IF NOT EXISTS `BillingInvoiceDownloadResponse` (
  `download_url` TEXT DEFAULT NULL COMMENT 'The download url for the billing invoice',
  `id` TEXT DEFAULT NULL COMMENT 'The billing invoice id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `billing_invoices_get_200_response` generated from model 'billingUnderscoreinvoicesUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `billing_invoices_get_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `billing_profiles_get_200_response` generated from model 'billingUnderscoreprofilesUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `billing_profiles_get_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BillingProfilesResponse` generated from model 'BillingProfilesResponse'
--

CREATE TABLE IF NOT EXISTS `BillingProfilesResponse` (
  `advertiser_id` TEXT DEFAULT NULL COMMENT 'Advertiser ID of the billing.',
  `billing_type` TEXT DEFAULT NULL COMMENT 'Billing type of the advertiser',
  `card_type` TEXT DEFAULT NULL COMMENT 'Type of the card.',
  `id` TEXT DEFAULT NULL COMMENT 'Billing ID.',
  `payment_method_brand` TEXT DEFAULT NULL COMMENT 'Brand of the payment method.',
  `status` TEXT DEFAULT NULL COMMENT 'Status of the billing.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Board` generated from model 'Board'
--

CREATE TABLE IF NOT EXISTS `Board` (
  `board_pins_modified_at` DATETIME DEFAULT NULL COMMENT 'Date and time of last board pins modified.',
  `collaborator_count` INT UNSIGNED DEFAULT NULL COMMENT 'Count of collaborators on the board.',
  `created_at` DATETIME DEFAULT NULL COMMENT 'Date and time of board creation.',
  `description` TEXT DEFAULT NULL,
  `follower_count` INT UNSIGNED DEFAULT NULL COMMENT 'Board follower count.',
  `id` TEXT NOT NULL,
  `is_ads_only` TINYINT(1) DEFAULT false COMMENT 'If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins.',
  `media` TEXT DEFAULT NULL COMMENT 'Board media.',
  `name` TEXT NOT NULL COMMENT '    Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.',
  `owner` TEXT DEFAULT NULL,
  `pin_count` INT UNSIGNED DEFAULT NULL COMMENT 'Count of Pins on the board.',
  `privacy` TEXT COMMENT '    Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the &#x60;privacy&#x60; settng automatically becomes &#x60;PROTECTED&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BoardBase` generated from model 'BoardBase'
--

CREATE TABLE IF NOT EXISTS `BoardBase` (
  `board_pins_modified_at` DATETIME DEFAULT NULL COMMENT 'Date and time of last board pins modified.',
  `collaborator_count` INT UNSIGNED DEFAULT NULL COMMENT 'Count of collaborators on the board.',
  `created_at` DATETIME DEFAULT NULL COMMENT 'Date and time of board creation.',
  `description` TEXT DEFAULT NULL,
  `follower_count` INT UNSIGNED DEFAULT NULL COMMENT 'Board follower count.',
  `id` TEXT NOT NULL,
  `is_ads_only` TINYINT(1) DEFAULT false COMMENT 'If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins.',
  `media` TEXT DEFAULT NULL COMMENT 'Board media.',
  `name` TEXT NOT NULL COMMENT '    Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.',
  `owner` TEXT DEFAULT NULL,
  `pin_count` INT UNSIGNED DEFAULT NULL COMMENT 'Count of Pins on the board.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BoardCreate` generated from model 'BoardCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `BoardCreate` (
  `description` TEXT DEFAULT NULL,
  `is_ads_only` TINYINT(1) DEFAULT false COMMENT 'If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins.',
  `name` TEXT NOT NULL COMMENT '    Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.',
  `privacy` TEXT COMMENT '    Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the &#x60;privacy&#x60; settng automatically becomes &#x60;PROTECTED&#x60;. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `BoardMedia` generated from model 'BoardMedia'
--

CREATE TABLE IF NOT EXISTS `BoardMedia` (
  `image_cover_url` TEXT DEFAULT NULL COMMENT 'Board cover image',
  `pin_thumbnail_urls` JSON DEFAULT NULL COMMENT 'Board pin thumbnail urls.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

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
  `name` VARCHAR(180) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Sections help organize pins within a board.';

--
-- Table structure for table `BoardSectionCreate` generated from model 'BoardSectionCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `BoardSectionCreate` (
  `id` TEXT DEFAULT NULL,
  `name` VARCHAR(180) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `BoardSectionUpdateWithRequiredBody` generated from model 'BoardSectionUpdateWithRequiredBody'
-- Resource create or update operation model with required body fields (no OptionalProperties).
--

CREATE TABLE IF NOT EXISTS `BoardSectionUpdateWithRequiredBody` (
  `id` TEXT DEFAULT NULL,
  `name` VARCHAR(180) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create or update operation model with required body fields (no OptionalProperties).';

--
-- Table structure for table `board_sections_list_200_response` generated from model 'boardUnderscoresectionsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `board_sections_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BoardWithUpdatePrivacy` generated from model 'BoardWithUpdatePrivacy'
--

CREATE TABLE IF NOT EXISTS `BoardWithUpdatePrivacy` (
  `board_pins_modified_at` DATETIME DEFAULT NULL COMMENT 'Date and time of last board pins modified.',
  `collaborator_count` INT UNSIGNED DEFAULT NULL COMMENT 'Count of collaborators on the board.',
  `created_at` DATETIME DEFAULT NULL COMMENT 'Date and time of board creation.',
  `description` TEXT DEFAULT NULL,
  `follower_count` INT UNSIGNED DEFAULT NULL COMMENT 'Board follower count.',
  `id` TEXT NOT NULL,
  `is_ads_only` TINYINT(1) DEFAULT false COMMENT 'If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins.',
  `media` TEXT DEFAULT NULL COMMENT 'Board media.',
  `name` TEXT NOT NULL COMMENT '    Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.',
  `owner` TEXT DEFAULT NULL,
  `pin_count` INT UNSIGNED DEFAULT NULL COMMENT 'Count of Pins on the board.',
  `privacy` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BoardWithUpdatePrivacyUpdate` generated from model 'BoardWithUpdatePrivacyUpdate'
-- Resource create or update operation model.
--

CREATE TABLE IF NOT EXISTS `BoardWithUpdatePrivacyUpdate` (
  `description` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL COMMENT '    Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.',
  `privacy` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create or update operation model.';

--
-- Table structure for table `boards_list_200_response` generated from model 'boardsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `boards_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `boards_list_pins_200_response` generated from model 'boardsUnderscorelistUnderscorepinsUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `boards_list_pins_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BookClosed` generated from model 'BookClosed'
--

CREATE TABLE IF NOT EXISTS `BookClosed` (
  `conversion_metrics_ready` TINYINT(1) NOT NULL COMMENT 'Are conversion metrics ready?',
  `non_conversion_metrics_ready` TINYINT(1) NOT NULL COMMENT 'Are non-conversion metrics ready?'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BrandAccount` generated from model 'BrandAccount'
--

CREATE TABLE IF NOT EXISTS `BrandAccount` (
  `brand_account_id` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BrandAccountCreate` generated from model 'BrandAccountCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `BrandAccountCreate` (
  `about` TEXT DEFAULT NULL COMMENT 'Brand Account about information',
  `country` TEXT NOT NULL,
  `name` TEXT NOT NULL COMMENT 'Brand Account name',
  `profile_image` TEXT DEFAULT NULL,
  `username` TEXT NOT NULL COMMENT 'Brand Account username',
  `website` TEXT DEFAULT NULL COMMENT 'Brand Account website'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `BrandAccountProfileImage` generated from model 'BrandAccountProfileImage'
-- Base64-encoded image media source
--

CREATE TABLE IF NOT EXISTS `BrandAccountProfileImage` (
  `content_type` ENUM('image/jpeg', 'image/png') NOT NULL,
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Base64-encoded image media source';

--
-- Table structure for table `BrandAccountProfileImageUpdate` generated from model 'BrandAccountProfileImageUpdate'
-- Base64-encoded image media source
--

CREATE TABLE IF NOT EXISTS `BrandAccountProfileImageUpdate` (
  `content_type` ENUM('image/jpeg', 'image/png') DEFAULT NULL,
  `data` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Base64-encoded image media source';

--
-- Table structure for table `BrandAccountUpdate` generated from model 'BrandAccountUpdate'
-- Resource create or update operation model.
--

CREATE TABLE IF NOT EXISTS `BrandAccountUpdate` (
  `about` TEXT DEFAULT NULL COMMENT 'Brand Account about information',
  `country` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'Brand Account name',
  `profile_image` TEXT DEFAULT NULL,
  `username` TEXT DEFAULT NULL COMMENT 'Brand Account username',
  `website` TEXT DEFAULT NULL COMMENT 'Brand Account website'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create or update operation model.';

--
-- Table structure for table `BrandFilter` generated from model 'BrandFilter'
--

CREATE TABLE IF NOT EXISTS `BrandFilter` (
  `BRAND` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BulkCampaignDeliveryEstimatesItem` generated from model 'BulkCampaignDeliveryEstimatesItem'
-- Delivery estimate result for a single campaign within a bulk request.
--

CREATE TABLE IF NOT EXISTS `BulkCampaignDeliveryEstimatesItem` (
  `adgroup_audience_sizes` JSON DEFAULT NULL COMMENT 'Range audience sizes for each ad group, in the same order as the ad groups in the request.',
  `conversion_rate` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.',
  `conversion_rates` JSON DEFAULT NULL COMMENT 'Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.',
  `curves` JSON DEFAULT NULL COMMENT 'Estimated curves. Each curve will pertain to a single estimation type.',
  `derived_metrics` TEXT DEFAULT NULL,
  `errors` JSON DEFAULT NULL COMMENT 'Errors encountered during estimation for this campaign.',
  `estimate_id` TEXT DEFAULT NULL COMMENT 'UUID used to track delivery estimates when they are generated as part of a saved campaign.',
  `max_potential_spend` INT DEFAULT NULL COMMENT 'Maximum potential spend estimate.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Delivery estimate result for a single campaign within a bulk request.';

--
-- Table structure for table `BulkCampaignDeliveryEstimatesResponse` generated from model 'BulkCampaignDeliveryEstimatesResponse'
-- Bulk campaign delivery estimates response.
--

CREATE TABLE IF NOT EXISTS `BulkCampaignDeliveryEstimatesResponse` (
  `data` JSON NOT NULL COMMENT 'Per-campaign delivery estimate results, in the same order as the request.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Bulk campaign delivery estimates response.';

--
-- Table structure for table `BulkDownload` generated from model 'BulkDownload'
-- Ad entities to get in bulk request.
--

CREATE TABLE IF NOT EXISTS `BulkDownload` (
  `request_id` TEXT DEFAULT NULL COMMENT 'ID of the bulk request.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ad entities to get in bulk request.';

--
-- Table structure for table `BulkDownloadCampaignFilter` generated from model 'BulkDownloadCampaignFilter'
--

CREATE TABLE IF NOT EXISTS `BulkDownloadCampaignFilter` (
  `campaign_status` JSON DEFAULT NULL,
  `end_time` TEXT DEFAULT NULL COMMENT 'Unix UTC timestamp.',
  `name` TEXT DEFAULT NULL COMMENT 'Campaign name',
  `objective_type` JSON DEFAULT NULL,
  `start_time` TEXT DEFAULT NULL COMMENT 'Unix UTC timestamp.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BulkDownloadCreate` generated from model 'BulkDownloadCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `BulkDownloadCreate` (
  `campaign_filter` TEXT DEFAULT NULL,
  `entity_ids` JSON DEFAULT NULL COMMENT 'All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.',
  `entity_types` JSON DEFAULT NULL COMMENT 'All entity types specified will be downloaded. Fewer types result in faster downloads.',
  `output_format` TEXT,
  `updated_since` TEXT DEFAULT NULL COMMENT 'Unix UTC timestamp to retrieve all entities that have changed since this time.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `BulkJobData` generated from model 'BulkJobData'
-- Bulk request result data.
--

CREATE TABLE IF NOT EXISTS `BulkJobData` (
  `result_url` TEXT DEFAULT NULL COMMENT 'Presigned s3 file url for the bulk request result.',
  `status` TEXT NOT NULL,
  `workload_id` INT DEFAULT NULL COMMENT 'Bulk Workload Id.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Bulk request result data.';

--
-- Table structure for table `BulkUpsertRequest` generated from model 'BulkUpsertRequest'
-- Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
--

CREATE TABLE IF NOT EXISTS `BulkUpsertRequest` (
  `create` TEXT DEFAULT NULL,
  `update` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.';

--
-- Table structure for table `BulkUpsertRequestCreate` generated from model 'BulkUpsertRequestCreate'
-- Request for creation of entities in bulk.
--

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestCreate` (
  `ad_groups` JSON DEFAULT NULL,
  `ads` JSON DEFAULT NULL,
  `campaigns` JSON DEFAULT NULL,
  `catalog_product_groups` JSON DEFAULT NULL,
  `keywords` JSON DEFAULT NULL,
  `labels` JSON DEFAULT NULL,
  `product_groups` JSON DEFAULT NULL,
  `schedules` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request for creation of entities in bulk.';

--
-- Table structure for table `BulkUpsertRequestCreateCatalogProductGroupsItems` generated from model 'BulkUpsertRequestCreateCatalogProductGroupsItems'
--

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestCreateCatalogProductGroupsItems` (
  `description` TEXT DEFAULT NULL,
  `feed_id` TEXT NOT NULL COMMENT 'Catalog Feed id pertaining to the catalog product group.',
  `filters` TEXT NOT NULL,
  `is_featured` TINYINT(1) DEFAULT NULL COMMENT 'boolean indicator of whether the product group is being featured or not',
  `name` TEXT NOT NULL,
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog ID pertaining to the product group.',
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `country` TEXT DEFAULT NULL,
  `locale` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BulkUpsertRequestUpdate` generated from model 'BulkUpsertRequestUpdate'
-- Request for creation of entities in bulk.
--

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestUpdate` (
  `ad_groups` JSON DEFAULT NULL,
  `ads` JSON DEFAULT NULL,
  `campaigns` JSON DEFAULT NULL,
  `catalog_product_groups` JSON DEFAULT NULL,
  `keywords` JSON DEFAULT NULL,
  `labels` JSON DEFAULT NULL,
  `product_groups` JSON DEFAULT NULL,
  `schedules` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request for creation of entities in bulk.';

--
-- Table structure for table `BulkUpsertRequestUpdateCatalogProductGroupsItems` generated from model 'BulkUpsertRequestUpdateCatalogProductGroupsItems'
--

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestUpdateCatalogProductGroupsItems` (
  `description` TEXT DEFAULT NULL,
  `filters` TEXT DEFAULT NULL,
  `is_featured` TINYINT(1) DEFAULT NULL COMMENT 'boolean indicator of whether the product group is being featured or not',
  `name` TEXT DEFAULT NULL COMMENT 'Name of catalog product group',
  `catalog_type` ENUM('CREATIVE_ASSETS') DEFAULT NULL,
  `country` TEXT DEFAULT NULL,
  `locale` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BulkUpsertResponse` generated from model 'BulkUpsertResponse'
-- ID of the bulk request.
--

CREATE TABLE IF NOT EXISTS `BulkUpsertResponse` (
  `request_id` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='ID of the bulk request.';

--
-- Table structure for table `BusinessAccessUserSummary` generated from model 'BusinessAccessUserSummary'
-- Metadata of the member/partner that has access to the asset.
--

CREATE TABLE IF NOT EXISTS `BusinessAccessUserSummary` (
  `email` TEXT DEFAULT NULL COMMENT 'Email of the business member/partner.',
  `id` VARCHAR(20) DEFAULT NULL COMMENT 'Unique identifier of the business member/partner.',
  `username` TEXT DEFAULT NULL COMMENT 'Username of the business member/partner.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Metadata of the member/partner that has access to the asset.';

--
-- Table structure for table `business_asset_members_get_200_response` generated from model 'businessUnderscoreassetUnderscoremembersUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `business_asset_members_get_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BusinessAssets` generated from model 'BusinessAssets'
--

CREATE TABLE IF NOT EXISTS `BusinessAssets` (
  `asset_group_info` TEXT DEFAULT NULL COMMENT 'An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;.',
  `asset_id` VARCHAR(20) DEFAULT NULL COMMENT 'Unique identifier of a business asset.',
  `asset_type` TEXT DEFAULT NULL,
  `permissions` JSON DEFAULT NULL COMMENT 'Permission levels the requesting business has on an asset.',
  `catalog_info` TEXT DEFAULT NULL COMMENT 'An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals &#39;CATALOG&#39;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `business_assets_get_200_response` generated from model 'businessUnderscoreassetsUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `business_assets_get_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BusinessMemberAssetsGetResponse` generated from model 'BusinessMemberAssetsGetResponse'
-- Paginated response for business member assets with total count metadata.
--

CREATE TABLE IF NOT EXISTS `BusinessMemberAssetsGetResponse` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL,
  `total_data_count` INT NOT NULL COMMENT 'Total number of assets matching the query',
  `total_data_count_by_status` TEXT DEFAULT NULL COMMENT 'Breakdown of asset counts by entity status (ad accounts only)'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Paginated response for business member assets with total count metadata.';

--
-- Table structure for table `BusinessMemberAssetsSummary` generated from model 'BusinessMemberAssetsSummary'
-- Ad accounts and profiles the business member/partner has access to.
--

CREATE TABLE IF NOT EXISTS `BusinessMemberAssetsSummary` (
  `ad_accounts` JSON DEFAULT NULL COMMENT 'List of ad account IDs and respective permission levels.',
  `profiles` JSON DEFAULT NULL COMMENT 'List of profile IDs and respective permission levels.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ad accounts and profiles the business member/partner has access to.';

--
-- Table structure for table `BusinessMembersAssetAccessDeleteBody` generated from model 'BusinessMembersAssetAccessDeleteBody'
-- An object with a list of member asset accesses to delete.
--

CREATE TABLE IF NOT EXISTS `BusinessMembersAssetAccessDeleteBody` (
  `accesses` JSON NOT NULL COMMENT 'List of members asset access to be deleted'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An object with a list of member asset accesses to delete.';

--
-- Table structure for table `BusinessMembershipMember` generated from model 'BusinessMembershipMember'
-- A business member identified by &#x60;member_id&#x60; with their &#x60;business_role&#x60; in the business.
--

CREATE TABLE IF NOT EXISTS `BusinessMembershipMember` (
  `business_role` TEXT NOT NULL,
  `member_id` VARCHAR(25) NOT NULL COMMENT 'Unique identifier of the member.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A business member identified by &#x60;member_id&#x60; with their &#x60;business_role&#x60; in the business.';

--
-- Table structure for table `business_partner_asset_access_get_200_response` generated from model 'businessUnderscorepartnerUnderscoreassetUnderscoreaccessUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `business_partner_asset_access_get_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BusinessToAdAccountSharedAudience` generated from model 'BusinessToAdAccountSharedAudience'
--

CREATE TABLE IF NOT EXISTS `BusinessToAdAccountSharedAudience` (
  `audience_id` TEXT NOT NULL COMMENT 'Unique identifier of an audience',
  `permissions` JSON DEFAULT NULL COMMENT 'Permissions granted to the recipients.',
  `recipient_account_ids` JSON NOT NULL COMMENT 'Ad account IDs to share with or revoke from (request) / that received the audience (response).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BusinessToAdAccountSharedAudienceUpdateWithRequiredBody` generated from model 'BusinessToAdAccountSharedAudienceUpdateWithRequiredBody'
-- Resource create or update operation model with required body fields (no OptionalProperties).
--

CREATE TABLE IF NOT EXISTS `BusinessToAdAccountSharedAudienceUpdateWithRequiredBody` (
  `audience_id` TEXT NOT NULL COMMENT 'Unique identifier of an audience',
  `operation_type` TEXT NOT NULL,
  `recipient_account_ids` JSON NOT NULL COMMENT 'Ad account IDs to share with or revoke from (request) / that received the audience (response).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create or update operation model with required body fields (no OptionalProperties).';

--
-- Table structure for table `BusinessToBusinessSharedAudience` generated from model 'BusinessToBusinessSharedAudience'
--

CREATE TABLE IF NOT EXISTS `BusinessToBusinessSharedAudience` (
  `audience_id` TEXT NOT NULL COMMENT 'Unique identifier of an audience',
  `permissions` JSON DEFAULT NULL COMMENT 'Permissions granted to the recipients.',
  `recipient_business_ids` JSON NOT NULL COMMENT 'Business IDs to share with or revoke from (request) / that received the audience (response).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BusinessToBusinessSharedAudienceUpdateWithRequiredBody` generated from model 'BusinessToBusinessSharedAudienceUpdateWithRequiredBody'
-- Resource create or update operation model with required body fields (no OptionalProperties).
--

CREATE TABLE IF NOT EXISTS `BusinessToBusinessSharedAudienceUpdateWithRequiredBody` (
  `audience_id` TEXT NOT NULL COMMENT 'Unique identifier of an audience',
  `operation_type` TEXT NOT NULL,
  `recipient_business_ids` JSON NOT NULL COMMENT 'Business IDs to share with or revoke from (request) / that received the audience (response).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create or update operation model with required body fields (no OptionalProperties).';

--
-- Table structure for table `Campaign` generated from model 'Campaign'
--

CREATE TABLE IF NOT EXISTS `Campaign` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Campaign&#39;s Advertiser ID.',
  `bid_options` TEXT DEFAULT NULL COMMENT '[Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.',
  `created_time` INT DEFAULT NULL COMMENT 'Campaign creation time. Unix timestamp in seconds.',
  `daily_spend_cap` INT DEFAULT NULL COMMENT 'Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.',
  `default_ad_group_budget_in_micro_currency` INT DEFAULT NULL COMMENT 'When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.',
  `end_time` INT DEFAULT NULL COMMENT 'Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.',
  `id` VARCHAR(18) NOT NULL COMMENT 'Campaign ID, must be associated with the ad account ID provided in the path.',
  `intended_promotion_type` TEXT DEFAULT NULL,
  `is_automated_campaign` TINYINT(1) DEFAULT NULL COMMENT 'Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES',
  `is_campaign_budget_optimization` TINYINT(1) DEFAULT NULL COMMENT 'Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.',
  `is_carting` TINYINT(1) DEFAULT NULL COMMENT 'Whether the campaign contains a carting(where-to-buy link) ad.',
  `is_flexible_daily_budgets` TINYINT(1) DEFAULT NULL COMMENT 'Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.',
  `is_ltv_optimized` TINYINT(1) DEFAULT NULL COMMENT 'Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.',
  `is_performance_plus` TINYINT(1) DEFAULT NULL COMMENT 'Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)',
  `is_top_of_search` TINYINT(1) DEFAULT NULL COMMENT 'Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.',
  `lifetime_spend_cap` INT DEFAULT NULL COMMENT 'Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.',
  `name` TEXT DEFAULT NULL COMMENT 'Campaign name - 255 chars max.',
  `objective_type` TEXT NOT NULL,
  `order_line_id` TEXT DEFAULT NULL COMMENT 'Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.',
  `performance_plus_campaign_settings` TEXT DEFAULT NULL COMMENT 'Pinterest Performance+ campaign settings.',
  `start_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.',
  `status` TEXT DEFAULT NULL,
  `summary_status` TEXT DEFAULT NULL,
  `tracking_urls` TEXT DEFAULT NULL,
  `type` TEXT DEFAULT NULL COMMENT 'Always \&quot;campaign\&quot;.',
  `updated_time` INT DEFAULT NULL COMMENT 'UTC timestamp. Last update time.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CampaignAdPreview` generated from model 'CampaignAdPreview'
-- Campaign ad preview record.
--

CREATE TABLE IF NOT EXISTS `CampaignAdPreview` (
  `ad_account_id` TEXT NOT NULL COMMENT 'Advertiser ID for this preview.',
  `ad_group_id` VARCHAR(18) NOT NULL COMMENT 'Ad group ID to create a preview record for.',
  `client_id` INT DEFAULT NULL COMMENT 'Client ID that created preview.',
  `expires_at` INT NOT NULL COMMENT 'Unix timestamp in milliseconds for preview expiration.',
  `is_active` TINYINT(1) NOT NULL COMMENT 'Whether preview link is active.',
  `pin_id` INT DEFAULT NULL COMMENT 'Pin ID for pin promotion preview.',
  `pin_promotion_id` INT DEFAULT NULL COMMENT 'Pin promotion ID for this preview.',
  `promoted_product_group_id` INT DEFAULT NULL COMMENT 'Promoted product group ID for catalog previews.',
  `url` TEXT NOT NULL COMMENT 'Campaign ad preview URL.',
  `user_id` INT NOT NULL COMMENT 'User ID that created preview.',
  `uuid` TEXT NOT NULL COMMENT 'Pin promotion preview key.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Campaign ad preview record.';

--
-- Table structure for table `CampaignAdPreviewCreate` generated from model 'CampaignAdPreviewCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `CampaignAdPreviewCreate` (
  `ad_group_id` VARCHAR(18) NOT NULL COMMENT 'Ad group ID to create a preview record for.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `campaign_ad_preview_create_200_response_inner` generated from model 'campaignUnderscoreadUnderscorepreviewUnderscorecreateUnderscore200UnderscoreresponseUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `campaign_ad_preview_create_200_response_inner` (
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `campaign_ad_preview_create_200_response_inner_data` generated from model 'campaignUnderscoreadUnderscorepreviewUnderscorecreateUnderscore200UnderscoreresponseUnderscoreinnerUnderscoredata'
-- Created/updated resource on success or error details on failure
--

CREATE TABLE IF NOT EXISTS `campaign_ad_preview_create_200_response_inner_data` (
  `ad_account_id` TEXT NOT NULL COMMENT 'Advertiser ID for this preview.',
  `ad_group_id` VARCHAR(18) NOT NULL COMMENT 'Ad group ID to create a preview record for.',
  `client_id` INT DEFAULT NULL COMMENT 'Client ID that created preview.',
  `expires_at` INT NOT NULL COMMENT 'Unix timestamp in milliseconds for preview expiration.',
  `is_active` TINYINT(1) NOT NULL COMMENT 'Whether preview link is active.',
  `pin_id` INT DEFAULT NULL COMMENT 'Pin ID for pin promotion preview.',
  `pin_promotion_id` INT DEFAULT NULL COMMENT 'Pin promotion ID for this preview.',
  `promoted_product_group_id` INT DEFAULT NULL COMMENT 'Promoted product group ID for catalog previews.',
  `url` TEXT NOT NULL COMMENT 'Campaign ad preview URL.',
  `user_id` INT NOT NULL COMMENT 'User ID that created preview.',
  `uuid` TEXT NOT NULL COMMENT 'Pin promotion preview key.',
  `exceptions` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Created/updated resource on success or error details on failure';

--
-- Table structure for table `campaign_ad_preview_create_200_response_inner_data_oneOf` generated from model 'campaignUnderscoreadUnderscorepreviewUnderscorecreateUnderscore200UnderscoreresponseUnderscoreinnerUnderscoredataUnderscoreoneOf'
--

CREATE TABLE IF NOT EXISTS `campaign_ad_preview_create_200_response_inner_data_oneOf` (
  `exceptions` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `campaign_ad_preview_delete_200_response_inner` generated from model 'campaignUnderscoreadUnderscorepreviewUnderscoredeleteUnderscore200UnderscoreresponseUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `campaign_ad_preview_delete_200_response_inner` (
  `status` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `campaign_ad_preview_delete_200_response_inner_status` generated from model 'campaignUnderscoreadUnderscorepreviewUnderscoredeleteUnderscore200UnderscoreresponseUnderscoreinnerUnderscorestatus'
--

CREATE TABLE IF NOT EXISTS `campaign_ad_preview_delete_200_response_inner_status` (
  `statusCode` ENUM('204') NOT NULL,
  `code` INT NOT NULL,
  `message` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CampaignAudienceMultipliers` generated from model 'CampaignAudienceMultipliers'
-- This represents a mapping from Audience ID to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified audience in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
--

CREATE TABLE IF NOT EXISTS `CampaignAudienceMultipliers` (
  `AUDIENCE_ID` TEXT DEFAULT NULL COMMENT 'Audience ID for the multiplier.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This represents a mapping from Audience ID to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified audience in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).';

--
-- Table structure for table `CampaignBatchItem` generated from model 'CampaignBatchItem'
-- Item in a batch campaign response.
--

CREATE TABLE IF NOT EXISTS `CampaignBatchItem` (
  `data` TEXT DEFAULT NULL COMMENT 'Campaign data on success.',
  `exceptions` JSON DEFAULT NULL COMMENT 'Exceptions on failure.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Item in a batch campaign response.';

--
-- Table structure for table `CampaignBatchResponseData` generated from model 'CampaignBatchResponseData'
-- Campaign data in batch response, with all fields optional to support error cases where data may be empty.
--

CREATE TABLE IF NOT EXISTS `CampaignBatchResponseData` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Campaign&#39;s Advertiser ID.',
  `bid_options` TEXT DEFAULT NULL COMMENT '[Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.',
  `created_time` INT DEFAULT NULL COMMENT 'Campaign creation time. Unix timestamp in seconds.',
  `daily_spend_cap` INT DEFAULT NULL COMMENT 'Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.',
  `default_ad_group_budget_in_micro_currency` INT DEFAULT NULL COMMENT 'When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.',
  `end_time` INT DEFAULT NULL COMMENT 'Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.',
  `id` TEXT DEFAULT NULL COMMENT 'Campaign ID.',
  `intended_promotion_type` TEXT DEFAULT NULL,
  `is_automated_campaign` TINYINT(1) DEFAULT NULL COMMENT 'Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES',
  `is_campaign_budget_optimization` TINYINT(1) DEFAULT NULL COMMENT 'Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.',
  `is_carting` TINYINT(1) DEFAULT NULL COMMENT 'Whether the campaign contains a carting(where-to-buy link) ad.',
  `is_flexible_daily_budgets` TINYINT(1) DEFAULT NULL COMMENT 'Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.',
  `is_ltv_optimized` TINYINT(1) DEFAULT NULL COMMENT 'Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.',
  `is_performance_plus` TINYINT(1) DEFAULT NULL COMMENT 'Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)',
  `is_top_of_search` TINYINT(1) DEFAULT NULL COMMENT 'Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.',
  `lifetime_spend_cap` INT DEFAULT NULL COMMENT 'Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.',
  `name` TEXT DEFAULT NULL COMMENT 'Campaign name - 255 chars max.',
  `objective_type` TEXT DEFAULT NULL,
  `order_line_id` TEXT DEFAULT NULL COMMENT 'Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.',
  `performance_plus_campaign_settings` TEXT DEFAULT NULL COMMENT 'Pinterest Performance+ campaign settings.',
  `start_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.',
  `status` TEXT DEFAULT NULL,
  `summary_status` TEXT DEFAULT NULL,
  `tracking_urls` TEXT DEFAULT NULL,
  `type` TEXT DEFAULT NULL COMMENT 'Always \&quot;campaign\&quot;.',
  `updated_time` INT DEFAULT NULL COMMENT 'UTC timestamp. Last update time.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Campaign data in batch response, with all fields optional to support error cases where data may be empty.';

--
-- Table structure for table `CampaignBatchUpdateItem` generated from model 'CampaignBatchUpdateItem'
-- Single campaign update item with update-specific bid options.
--

CREATE TABLE IF NOT EXISTS `CampaignBatchUpdateItem` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Setting this field does nothing. The ad account ID gets set from the path parameter.',
  `app_id` TEXT DEFAULT NULL COMMENT '[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  The store ID of the mobile app for &#x60;APP_INSTALL&#x60; campaigns.',
  `app_platform` TEXT DEFAULT NULL COMMENT '[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for &#x60;APP_INSTALL&#x60; campaigns.',
  `bid_options` TEXT DEFAULT NULL COMMENT 'Object describing an update to the campaign level bid multipliers.',
  `daily_spend_cap` INT DEFAULT NULL COMMENT 'Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.',
  `default_ad_group_budget_in_micro_currency` INT DEFAULT NULL COMMENT 'Setting this field does nothing.',
  `end_time` INT DEFAULT NULL COMMENT 'Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.',
  `id` VARCHAR(18) NOT NULL COMMENT 'Campaign ID, must be associated with the ad account ID provided in the path.',
  `intended_promotion_type` TEXT DEFAULT NULL,
  `is_automated_campaign` TINYINT(1) DEFAULT NULL COMMENT 'Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES',
  `is_campaign_budget_optimization` TINYINT(1) DEFAULT NULL COMMENT 'Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.',
  `is_flexible_daily_budgets` TINYINT(1) DEFAULT NULL COMMENT 'Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.',
  `is_ltv_optimized` TINYINT(1) DEFAULT NULL COMMENT 'Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.',
  `is_performance_plus` TINYINT(1) DEFAULT NULL COMMENT 'Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)',
  `is_top_of_search` TINYINT(1) DEFAULT NULL COMMENT 'Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.',
  `lifetime_spend_cap` INT DEFAULT NULL COMMENT 'Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.',
  `name` TEXT DEFAULT NULL COMMENT 'Campaign name - 255 chars max.',
  `objective_type` TEXT DEFAULT NULL,
  `order_line_id` TEXT DEFAULT NULL COMMENT 'Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.',
  `performance_plus_campaign_settings` TEXT DEFAULT NULL COMMENT 'Pinterest Performance+ campaign settings.',
  `start_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.',
  `status` TEXT DEFAULT NULL,
  `tracking_urls` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Single campaign update item with update-specific bid options.';

--
-- Table structure for table `CampaignBatchWriteResponseModel` generated from model 'CampaignBatchWriteResponseModel'
-- Response model for batch campaign write operations.
--

CREATE TABLE IF NOT EXISTS `CampaignBatchWriteResponseModel` (
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Response model for batch campaign write operations.';

--
-- Table structure for table `CampaignBidOptions` generated from model 'CampaignBidOptions'
-- Object describing the campaign level bid multipliers.
--

CREATE TABLE IF NOT EXISTS `CampaignBidOptions` (
  `age_bucket_multipliers` TEXT DEFAULT NULL COMMENT 'Age bucket multipliers for bid adjustments.',
  `app_type_multipliers` TEXT DEFAULT NULL COMMENT 'App type multipliers for bid adjustments.',
  `audience_multipliers` TEXT DEFAULT NULL COMMENT 'Audience multipliers for bid adjustments.',
  `freq_bid_multiplier_time_window` TEXT DEFAULT NULL COMMENT 'The time window for frequency bid multipliers.',
  `frequency_multipliers` TEXT DEFAULT NULL COMMENT 'Frequency multipliers for bid adjustments.',
  `gender_multipliers` TEXT DEFAULT NULL COMMENT 'Gender multipliers for bid adjustments.',
  `placement_multipliers` TEXT DEFAULT NULL COMMENT 'Placement multipliers for bid adjustments.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing the campaign level bid multipliers.';

--
-- Table structure for table `CampaignBidOptionsCreate` generated from model 'CampaignBidOptionsCreate'
-- Object describing the campaign level bid multipliers for create operations.
--

CREATE TABLE IF NOT EXISTS `CampaignBidOptionsCreate` (
  `age_bucket_multipliers` TEXT DEFAULT NULL COMMENT 'Age bucket multipliers for bid adjustments.',
  `app_type_multipliers` TEXT DEFAULT NULL COMMENT 'App type multipliers for bid adjustments.',
  `audience_multipliers` TEXT DEFAULT NULL COMMENT 'Audience multipliers for bid adjustments.',
  `freq_bid_multiplier_time_window` TEXT DEFAULT NULL COMMENT 'The time window for frequency bid multipliers.',
  `frequency_multipliers` TEXT DEFAULT NULL COMMENT 'Frequency multipliers for bid adjustments.',
  `gender_multipliers` TEXT DEFAULT NULL COMMENT 'Gender multipliers for bid adjustments.',
  `placement_multipliers` TEXT DEFAULT NULL COMMENT 'Placement multipliers for bid adjustments.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing the campaign level bid multipliers for create operations.';

--
-- Table structure for table `CampaignBidOptionsUpdate` generated from model 'CampaignBidOptionsUpdate'
-- Object describing an update to the campaign level bid multipliers.
--

CREATE TABLE IF NOT EXISTS `CampaignBidOptionsUpdate` (
  `age_bucket_multipliers` TEXT DEFAULT NULL COMMENT 'Age bucket multipliers for bid adjustments.',
  `app_type_multipliers` TEXT DEFAULT NULL COMMENT 'App type multipliers for bid adjustments.',
  `audience_multipliers` TEXT DEFAULT NULL COMMENT 'Audience multipliers for bid adjustments.',
  `freq_bid_multiplier_time_window` TEXT DEFAULT NULL COMMENT 'The time window for frequency bid multipliers.',
  `frequency_multipliers` TEXT DEFAULT NULL COMMENT 'Frequency multipliers for bid adjustments.',
  `gender_multipliers` TEXT DEFAULT NULL COMMENT 'Gender multipliers for bid adjustments.',
  `placement_multipliers` TEXT DEFAULT NULL COMMENT 'Placement multipliers for bid adjustments.',
  `update_mask` JSON NOT NULL COMMENT 'List of fields to update. Only the fields in the list will be updated.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an update to the campaign level bid multipliers.';

--
-- Table structure for table `CampaignCreateItem` generated from model 'CampaignCreateItem'
-- Single campaign create item with create-specific defaults.
--

CREATE TABLE IF NOT EXISTS `CampaignCreateItem` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Setting this field does nothing. The ad account ID gets set from the path parameter.',
  `app_id` TEXT DEFAULT NULL COMMENT '[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  The store ID of the mobile app for &#x60;APP_INSTALL&#x60; campaigns.',
  `app_platform` TEXT DEFAULT NULL COMMENT '[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for &#x60;APP_INSTALL&#x60; campaigns.',
  `bid_options` TEXT DEFAULT NULL COMMENT '[Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.',
  `daily_spend_cap` INT DEFAULT NULL COMMENT 'Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.',
  `default_ad_group_budget_in_micro_currency` INT DEFAULT NULL COMMENT 'Setting this field does nothing.',
  `end_time` INT DEFAULT NULL COMMENT 'Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.',
  `intended_promotion_type` TEXT DEFAULT NULL,
  `is_automated_campaign` TINYINT(1) DEFAULT false COMMENT 'Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES',
  `is_campaign_budget_optimization` TINYINT(1) DEFAULT true COMMENT 'Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.',
  `is_flexible_daily_budgets` TINYINT(1) DEFAULT false COMMENT 'Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.',
  `is_ltv_optimized` TINYINT(1) DEFAULT NULL COMMENT 'Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.',
  `is_performance_plus` TINYINT(1) DEFAULT false COMMENT 'Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)',
  `is_top_of_search` TINYINT(1) DEFAULT false COMMENT 'Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.',
  `lifetime_spend_cap` INT DEFAULT NULL COMMENT 'Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.',
  `name` TEXT NOT NULL COMMENT 'Campaign name - 255 chars max.',
  `objective_type` TEXT NOT NULL,
  `order_line_id` TEXT DEFAULT NULL COMMENT 'Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.',
  `start_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.',
  `status` TEXT,
  `tracking_urls` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Single campaign create item with create-specific defaults.';

--
-- Table structure for table `CampaignCreateRequest` generated from model 'CampaignCreateRequest'
--

CREATE TABLE IF NOT EXISTS `CampaignCreateRequest` (
  `bid_options` TEXT DEFAULT NULL,
  `intended_promotion_type` TEXT DEFAULT NULL,
  `is_automated_campaign` TINYINT(1) DEFAULT NULL COMMENT 'Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES',
  `is_campaign_budget_optimization` TINYINT(1) DEFAULT NULL COMMENT 'Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.',
  `is_flexible_daily_budgets` TINYINT(1) DEFAULT NULL COMMENT 'Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.',
  `is_ltv_optimized` TINYINT(1) DEFAULT NULL COMMENT 'Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.',
  `is_performance_plus` TINYINT(1) DEFAULT false COMMENT 'Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;.',
  `is_top_of_search` TINYINT(1) DEFAULT false COMMENT '&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt;  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: &#x60;CONSIDERATION&#x60; &#x60;WEB_CONVERSION&#x60; &#x60;CATALOG_SALES&#x60;  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your &#x60;true&#x60; or &#x60;false&#x60; selection of this campaign if you &lt;a href&#x3D;\&quot;https://developer.pinterest.com/docs/api/v5/campaigns-update\&quot; target&#x3D;\&quot;blank\&quot;&gt;update it&lt;/a&gt;.',
  `objective_type` TEXT NOT NULL,
  `status` TEXT DEFAULT NULL,
  `ad_account_id` TEXT NOT NULL COMMENT 'Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.',
  `daily_spend_cap` INT DEFAULT NULL COMMENT 'Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.',
  `default_ad_group_budget_in_micro_currency` INT DEFAULT NULL COMMENT 'When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.',
  `end_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.',
  `lifetime_spend_cap` INT DEFAULT NULL COMMENT 'Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.',
  `name` TEXT NOT NULL COMMENT 'Campaign name.',
  `order_line_id` TEXT DEFAULT NULL COMMENT 'Order line ID that appears on the invoice.',
  `start_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.',
  `tracking_urls` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CampaignCreateRequestAllOf1` generated from model 'CampaignCreateRequestAllOf1'
--

CREATE TABLE IF NOT EXISTS `CampaignCreateRequestAllOf1` (
  `bid_options` TEXT DEFAULT NULL,
  `intended_promotion_type` TEXT DEFAULT NULL,
  `is_automated_campaign` TINYINT(1) DEFAULT false COMMENT 'Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES',
  `is_campaign_budget_optimization` TINYINT(1) DEFAULT true COMMENT 'Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.',
  `is_flexible_daily_budgets` TINYINT(1) DEFAULT false COMMENT 'Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.',
  `is_ltv_optimized` TINYINT(1) DEFAULT NULL COMMENT 'Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.',
  `is_performance_plus` TINYINT(1) DEFAULT false COMMENT 'Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;.',
  `is_top_of_search` TINYINT(1) DEFAULT false COMMENT '&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt;  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: &#x60;CONSIDERATION&#x60; &#x60;WEB_CONVERSION&#x60; &#x60;CATALOG_SALES&#x60;  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your &#x60;true&#x60; or &#x60;false&#x60; selection of this campaign if you &lt;a href&#x3D;\&quot;https://developer.pinterest.com/docs/api/v5/campaigns-update\&quot; target&#x3D;\&quot;blank\&quot;&gt;update it&lt;/a&gt;.',
  `objective_type` TEXT NOT NULL,
  `status` TEXT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CampaignDeliveryEstimatesCampaign` generated from model 'CampaignDeliveryEstimatesCampaign'
-- Campaign configuration for delivery estimates.
--

CREATE TABLE IF NOT EXISTS `CampaignDeliveryEstimatesCampaign` (
  `ad_groups` JSON NOT NULL,
  `budget_duration_type` TEXT NOT NULL COMMENT 'Duration type of the budget',
  `daily_spend_cap` INT DEFAULT NULL COMMENT 'Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.',
  `end_date` TEXT DEFAULT NULL COMMENT 'End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.',
  `lifetime_spend_cap` INT DEFAULT NULL COMMENT 'Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.',
  `objective_type` TEXT NOT NULL,
  `start_date` TEXT NOT NULL COMMENT 'Start date of the date range for an ad campaign, pattern YYYY-MM-DD.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Campaign configuration for delivery estimates.';

--
-- Table structure for table `CampaignDeliveryEstimatesDerivedMetrics` generated from model 'CampaignDeliveryEstimatesDerivedMetrics'
-- Derived metrics for an ad campaign.
--

CREATE TABLE IF NOT EXISTS `CampaignDeliveryEstimatesDerivedMetrics` (
  `cpc` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Estimated cost per click.',
  `cpc_lower` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Lower estimate of the cost per click.',
  `cpc_upper` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Upper estimate of the cost per click.',
  `cpm` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Estimated cost per thousand impressions.',
  `cpm_lower` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Lower estimate of cost per thousand impressions.',
  `cpm_upper` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Upper estimate of cost per thousand impressions.',
  `lifetime_frequency` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Estimated lifetime frequency.',
  `lifetime_frequency_lower` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Lower estimate of lifetime frequency.',
  `lifetime_frequency_upper` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Upper estimate of lifetime frequency.',
  `lifetime_impression` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Estimated lifetime impressions.',
  `lifetime_impression_lower` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Lower estimate of lifetime impressions.',
  `lifetime_impression_upper` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Upper estimate of lifetime impressions.',
  `lifetime_reach` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Estimated lifetime reach.',
  `lifetime_reach_lower` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Lower estimate of lifetime reach.',
  `lifetime_reach_upper` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Upper estimate of lifetime reach.',
  `weekly_click` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Estimated weekly clicks.',
  `weekly_click_lower` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Lower estimate of weekly clicks.',
  `weekly_click_upper` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Upper estimate of weekly clicks.',
  `weekly_frequency` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Estimated weekly frequency.',
  `weekly_frequency_lower` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Lower estimate of weekly frequency.',
  `weekly_frequency_upper` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Upper estimate of weekly frequency.',
  `weekly_impression` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Estimated weekly impressions.',
  `weekly_impression_lower` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Lower estimate of weekly impressions.',
  `weekly_impression_upper` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Upper estimate of weekly impressions.',
  `weekly_reach` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Estimated weekly reach.',
  `weekly_reach_lower` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Lower estimate of weekly reach.',
  `weekly_reach_upper` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Upper estimate of weekly reach.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Derived metrics for an ad campaign.';

--
-- Table structure for table `CampaignDeliveryEstimatesResponse` generated from model 'CampaignDeliveryEstimatesResponse'
-- Delivery estimates response for a campaign.
--

CREATE TABLE IF NOT EXISTS `CampaignDeliveryEstimatesResponse` (
  `curves` JSON DEFAULT NULL COMMENT 'Estimated curves. Each curve will pertain to a single estimation type.',
  `derived_metrics` TEXT DEFAULT NULL,
  `max_potential_spend` INT DEFAULT NULL COMMENT 'Maximum potential spend estimate.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Delivery estimates response for a campaign.';

--
-- Table structure for table `CampaignPlanningAdGroupAudienceSize` generated from model 'CampaignPlanningAdGroupAudienceSize'
-- Range audience size for an ad group.
--

CREATE TABLE IF NOT EXISTS `CampaignPlanningAdGroupAudienceSize` (
  `count_lower` INT UNSIGNED DEFAULT NULL COMMENT 'Lower bound of the audience size estimate.',
  `count_upper` INT UNSIGNED DEFAULT NULL COMMENT 'Upper bound of the audience size estimate.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Range audience size for an ad group.';

--
-- Table structure for table `CampaignPlanningBudgetRecommendation` generated from model 'CampaignPlanningBudgetRecommendation'
-- Budget recommendation response containing recommended budget, estimated days, and point estimations.
--

CREATE TABLE IF NOT EXISTS `CampaignPlanningBudgetRecommendation` (
  `budget_recommendation` INT DEFAULT NULL COMMENT 'The recommended budget amount.',
  `experiment_campaign_budget_recommendation` JSON DEFAULT NULL COMMENT 'List of experimental budget recommendations.',
  `lifetime_days_recommendation` INT DEFAULT NULL COMMENT 'Recommended number of days for the campaign lifetime.',
  `point_estimations` JSON DEFAULT NULL COMMENT 'List of point estimations for different budget scenarios.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Budget recommendation response containing recommended budget, estimated days, and point estimations.';

--
-- Table structure for table `CampaignPlanningBudgetRecommendationPoint` generated from model 'CampaignPlanningBudgetRecommendationPoint'
-- A point estimation containing the estimate data and estimation type for a budget recommendation.
--

CREATE TABLE IF NOT EXISTS `CampaignPlanningBudgetRecommendationPoint` (
  `estimation_type` TEXT DEFAULT NULL COMMENT 'Estimation type for this point.',
  `point_estimate` TEXT DEFAULT NULL COMMENT 'Point estimate data.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A point estimation containing the estimate data and estimation type for a budget recommendation.';

--
-- Table structure for table `CampaignPlanningConfidenceLevelAlert` generated from model 'CampaignPlanningConfidenceLevelAlert'
-- A confidence level alert for the delivery estimates provided in the response.
--

CREATE TABLE IF NOT EXISTS `CampaignPlanningConfidenceLevelAlert` (
  `description` TEXT DEFAULT NULL COMMENT 'Human-readable context for debugging. Not intended for display to end users.',
  `reason` TEXT DEFAULT NULL COMMENT 'Reason for the confidence level alert.',
  `severity` TEXT DEFAULT NULL COMMENT 'Severity of the confidence level alert.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A confidence level alert for the delivery estimates provided in the response.';

--
-- Table structure for table `CampaignPlanningConversionAttribution` generated from model 'CampaignPlanningConversionAttribution'
-- Attribution windows for a conversion event.
--

CREATE TABLE IF NOT EXISTS `CampaignPlanningConversionAttribution` (
  `click_window_days` TEXT DEFAULT NULL COMMENT 'Number of days to use as the conversion attribution window for a pin click action.',
  `engagement_window_days` TEXT DEFAULT NULL COMMENT 'Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.',
  `view_window_days` TEXT DEFAULT NULL COMMENT 'Number of days to use as the conversion attribution window for a view action.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Attribution windows for a conversion event.';

--
-- Table structure for table `CampaignPlanningConversionRate` generated from model 'CampaignPlanningConversionRate'
-- Conversion rate estimate for a specific conversion event and attribution window combination.
--

CREATE TABLE IF NOT EXISTS `CampaignPlanningConversionRate` (
  `attribution_windows` TEXT NOT NULL,
  `conversion_event` TEXT NOT NULL,
  `conversion_rate` DECIMAL(20, 9) NOT NULL COMMENT 'Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Conversion rate estimate for a specific conversion event and attribution window combination.';

--
-- Table structure for table `CampaignPlanningCurveEstimate` generated from model 'CampaignPlanningCurveEstimate'
--

CREATE TABLE IF NOT EXISTS `CampaignPlanningCurveEstimate` (
  `estimation_type` TEXT DEFAULT NULL COMMENT 'Estimation type for campaign planning estimated curve',
  `points` JSON DEFAULT NULL COMMENT 'The estimation points that make up the estimated curve.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CampaignPlanningExperimentBudgetRecommendation` generated from model 'CampaignPlanningExperimentBudgetRecommendation'
-- Experimental budget recommendation for a single experiment version.
--

CREATE TABLE IF NOT EXISTS `CampaignPlanningExperimentBudgetRecommendation` (
  `budget_recommendation` INT DEFAULT NULL COMMENT 'Recommended budget for this experiment version.',
  `lifetime_days_recommendation` INT DEFAULT NULL COMMENT 'Recommended lifetime days for this experiment.',
  `point_estimations` JSON DEFAULT NULL COMMENT 'Point estimations for this experiment version.',
  `version_id` TEXT DEFAULT NULL COMMENT 'Version identifier for the experiment.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Experimental budget recommendation for a single experiment version.';

--
-- Table structure for table `CampaignPlanningPointEstimate` generated from model 'CampaignPlanningPointEstimate'
-- A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
--

CREATE TABLE IF NOT EXISTS `CampaignPlanningPointEstimate` (
  `budget` INT NOT NULL COMMENT 'The budget value of the point.',
  `double_y` DECIMAL(20, 9) NOT NULL COMMENT 'Y value as a decimal.',
  `max_y` INT NOT NULL COMMENT 'The maximum Y value of the point.',
  `min_y` INT NOT NULL COMMENT 'The minimum Y value of the point.',
  `y` INT NOT NULL COMMENT 'The expected Y value of the point.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.';

--
-- Table structure for table `CampaignPlanningResponseError` generated from model 'CampaignPlanningResponseError'
-- Error encountered while estimating delivery for a campaign.
--

CREATE TABLE IF NOT EXISTS `CampaignPlanningResponseError` (
  `code` TEXT DEFAULT NULL,
  `message` TEXT DEFAULT NULL COMMENT 'Human-readable error message.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Error encountered while estimating delivery for a campaign.';

--
-- Table structure for table `CampaignUpdateRequest` generated from model 'CampaignUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `CampaignUpdateRequest` (
  `bid_options` TEXT DEFAULT NULL,
  `intended_promotion_type` TEXT DEFAULT NULL,
  `is_ltv_optimized` TINYINT(1) DEFAULT NULL COMMENT 'Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.',
  `is_performance_plus` TINYINT(1) DEFAULT NULL COMMENT 'Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. This field is immutable, except only for campaigns in draft status which may update this field.',
  `is_top_of_search` TINYINT(1) DEFAULT NULL COMMENT 'Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.',
  `objective_type` TEXT DEFAULT NULL,
  `ad_account_id` TEXT NOT NULL COMMENT 'Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.',
  `daily_spend_cap` INT DEFAULT NULL COMMENT 'Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.',
  `default_ad_group_budget_in_micro_currency` INT DEFAULT NULL COMMENT 'When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.',
  `end_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.',
  `id` TEXT NOT NULL COMMENT 'Campaign ID.',
  `is_automated_campaign` TINYINT(1) DEFAULT NULL COMMENT 'Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES',
  `is_campaign_budget_optimization` TINYINT(1) DEFAULT NULL COMMENT 'Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.',
  `is_flexible_daily_budgets` TINYINT(1) DEFAULT NULL COMMENT 'Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.',
  `lifetime_spend_cap` INT DEFAULT NULL COMMENT 'Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.',
  `name` TEXT DEFAULT NULL COMMENT 'Campaign name.',
  `order_line_id` TEXT DEFAULT NULL COMMENT 'Order line ID that appears on the invoice.',
  `start_time` INT DEFAULT NULL COMMENT 'Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.',
  `status` TEXT DEFAULT NULL,
  `tracking_urls` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CampaignUpdateRequestAllOf2` generated from model 'CampaignUpdateRequestAllOf2'
--

CREATE TABLE IF NOT EXISTS `CampaignUpdateRequestAllOf2` (
  `bid_options` TEXT DEFAULT NULL,
  `intended_promotion_type` TEXT DEFAULT NULL,
  `is_ltv_optimized` TINYINT(1) DEFAULT NULL COMMENT 'Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.',
  `is_performance_plus` TINYINT(1) DEFAULT NULL COMMENT 'Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. This field is immutable, except only for campaigns in draft status which may update this field.',
  `is_top_of_search` TINYINT(1) DEFAULT NULL COMMENT 'Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.',
  `objective_type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CampaignsAnalyticsMetrics` generated from model 'CampaignsAnalyticsMetrics'
--

CREATE TABLE IF NOT EXISTS `CampaignsAnalyticsMetrics` (
  `CAMPAIGN_ID` TEXT DEFAULT NULL COMMENT 'The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true.',
  `DATE` DATE DEFAULT NULL COMMENT 'Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `campaigns_list_200_response` generated from model 'campaignsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `campaigns_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CancelInviteException` generated from model 'CancelInviteException'
-- An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
--

CREATE TABLE IF NOT EXISTS `CancelInviteException` (
  `invite_id` TEXT DEFAULT NULL,
  `message` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An exception object if there is an error performing the cancellation. It will only be provided if there is an error.';

--
-- Table structure for table `CancelInviteResult` generated from model 'CancelInviteResult'
--

CREATE TABLE IF NOT EXISTS `CancelInviteResult` (
  `id` TEXT DEFAULT NULL,
  `invite_data` TEXT DEFAULT NULL,
  `is_received_invite` TINYINT(1) DEFAULT NULL,
  `user` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CancelInviteResultItem` generated from model 'CancelInviteResultItem'
--

CREATE TABLE IF NOT EXISTS `CancelInviteResultItem` (
  `exception` TEXT DEFAULT NULL,
  `invite` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CancelInviteResultUser` generated from model 'CancelInviteResultUser'
-- Metadata of the member/partner that has access to the asset.
--

CREATE TABLE IF NOT EXISTS `CancelInviteResultUser` (
  `email` TEXT DEFAULT NULL COMMENT 'Email of the business member/partner.',
  `id` VARCHAR(20) DEFAULT NULL COMMENT 'Unique identifier of the business member/partner.',
  `username` TEXT DEFAULT NULL COMMENT 'Username of the business member/partner.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Metadata of the member/partner that has access to the asset.';

--
-- Table structure for table `CancelInvitesRequest` generated from model 'CancelInvitesRequest'
-- An object with the list of invite/request ids to cancel.
--

CREATE TABLE IF NOT EXISTS `CancelInvitesRequest` (
  `invite_ids` JSON NOT NULL COMMENT 'A list of invite/request ids to cancel.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An object with the list of invite/request ids to cancel.';

--
-- Table structure for table `CancelInvitesResponse` generated from model 'CancelInvitesResponse'
--

CREATE TABLE IF NOT EXISTS `CancelInvitesResponse` (
  `items` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CarouselSlot` generated from model 'CarouselSlot'
--

CREATE TABLE IF NOT EXISTS `CarouselSlot` (
  `description` TEXT DEFAULT NULL COMMENT 'Carousel Pin slot description.',
  `link` TEXT DEFAULT NULL COMMENT 'Carousel Pin slot link.',
  `title` TEXT DEFAULT NULL COMMENT 'Carousel Pin slot title.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CartingProduct` generated from model 'CartingProduct'
--

CREATE TABLE IF NOT EXISTS `CartingProduct` (
  `carting_product_id` TEXT NOT NULL COMMENT 'the internal Pinterest carting product id (different from industry product id)',
  `display_preferred_retailers_only` TINYINT(1) DEFAULT NULL COMMENT 'Whether to display only the preferred retailers for the carting product',
  `display_product_price` TINYINT(1) DEFAULT NULL COMMENT 'Whether to display the price for the carting product',
  `preferred_retailers` JSON DEFAULT NULL COMMENT 'A sorted array of preferred retailers for the carting product',
  `randomize_preferred_retailers` TINYINT(1) DEFAULT NULL COMMENT 'Whether to randomize preferred retailers for the carting product'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CartingRetailer` generated from model 'CartingRetailer'
--

CREATE TABLE IF NOT EXISTS `CartingRetailer` (
  `retailer_id` TEXT NOT NULL COMMENT 'Unique identifier for the retailer',
  `retailer_name` TEXT NOT NULL COMMENT 'Name of the retailer'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Catalog` generated from model 'Catalog'
-- Catalog entity
--

CREATE TABLE IF NOT EXISTS `Catalog` (
  `catalog_type` TEXT NOT NULL,
  `created_at` DATETIME NOT NULL,
  `id` TEXT NOT NULL COMMENT 'ID of the catalog entity.',
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a catalog entity.',
  `updated_at` DATETIME NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Catalog entity';

--
-- Table structure for table `CatalogBinding` generated from model 'CatalogBinding'
-- Information about a catalog asset.
--

CREATE TABLE IF NOT EXISTS `CatalogBinding` (
  `catalog_type` TEXT DEFAULT NULL COMMENT 'Catalog type',
  `id` TEXT DEFAULT NULL COMMENT 'Catalog ID.',
  `name` TEXT DEFAULT NULL COMMENT 'Catalog name'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Information about a catalog asset.';

--
-- Table structure for table `CatalogCreate` generated from model 'CatalogCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `CatalogCreate` (
  `catalog_type` TEXT NOT NULL,
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a catalog entity.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `CatalogUpdate` generated from model 'CatalogUpdate'
-- Resource create or update operation model.
--

CREATE TABLE IF NOT EXISTS `CatalogUpdate` (
  `catalog_type` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'A human-friendly name associated to a catalog entity.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create or update operation model.';

--
-- Table structure for table `CatalogsAiContentDisclosure` generated from model 'CatalogsAiContentDisclosure'
-- AI content disclosure for a single asset of a catalog item.
--

CREATE TABLE IF NOT EXISTS `CatalogsAiContentDisclosure` (
  `disclosure` JSON NOT NULL COMMENT 'Disclosure labels that apply to this asset.',
  `url` TEXT NOT NULL COMMENT 'URL of the asset. Must match one of image_link, additional_image_link, or video_link.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='AI content disclosure for a single asset of a catalog item.';

--
-- Table structure for table `CatalogsAvailableFilterValues` generated from model 'CatalogsAvailableFilterValues'
-- Object holding available filter values for each filter key
--

CREATE TABLE IF NOT EXISTS `CatalogsAvailableFilterValues` (
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `filter_values` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object holding available filter values for each filter key';

--
-- Table structure for table `CatalogsBaseFilterKeys` generated from model 'CatalogsBaseFilterKeys'
-- Base filter keys shared across catalog filtering
--

CREATE TABLE IF NOT EXISTS `CatalogsBaseFilterKeys` (
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
  `MEDIA_TYPE` TEXT NOT NULL,
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
  `GOOGLE_PRODUCT_CATEGORY_0` TEXT NOT NULL,
  `CUSTOM_NUMBER_0` TEXT NOT NULL,
  `CUSTOM_NUMBER_1` TEXT NOT NULL,
  `CUSTOM_NUMBER_2` TEXT NOT NULL,
  `CUSTOM_NUMBER_3` TEXT NOT NULL,
  `CUSTOM_NUMBER_4` TEXT NOT NULL,
  `TITLE_KEYWORDS` TEXT NOT NULL,
  `PINTEREST_PRODUCT_CATEGORIES` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Base filter keys shared across catalog filtering';

--
-- Table structure for table `CatalogsBaseFiltersAllOf` generated from model 'CatalogsBaseFiltersAllOf'
--

CREATE TABLE IF NOT EXISTS `CatalogsBaseFiltersAllOf` (
  `all_of` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsBaseFiltersAnyOf` generated from model 'CatalogsBaseFiltersAnyOf'
--

CREATE TABLE IF NOT EXISTS `CatalogsBaseFiltersAnyOf` (
  `any_of` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsCreateCreativeAssetsItem` generated from model 'CatalogsCreateCreativeAssetsItem'
-- A creative assets item to be created.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreateCreativeAssetsItem` (
  `attributes` TEXT NOT NULL,
  `creative_assets_id` TEXT NOT NULL COMMENT 'The catalog creative assets id in the merchant namespace',
  `operation` ENUM('CREATE') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A creative assets item to be created.';

--
-- Table structure for table `CatalogsCreateHotelItem` generated from model 'CatalogsCreateHotelItem'
-- A hotel item to be created.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreateHotelItem` (
  `attributes` TEXT NOT NULL,
  `hotel_id` TEXT NOT NULL COMMENT 'The catalog hotel id in the merchant namespace',
  `operation` ENUM('CREATE') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A hotel item to be created.';

--
-- Table structure for table `CatalogsCreateReportResponse` generated from model 'CatalogsCreateReportResponse'
--

CREATE TABLE IF NOT EXISTS `CatalogsCreateReportResponse` (
  `token` TEXT DEFAULT NULL COMMENT 'Token to be used to get the report'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsCreateRetailItem` generated from model 'CatalogsCreateRetailItem'
-- An item to be created
--

CREATE TABLE IF NOT EXISTS `CatalogsCreateRetailItem` (
  `attributes` TEXT NOT NULL,
  `item_id` TEXT NOT NULL COMMENT 'The catalog item id in the merchant namespace',
  `operation` ENUM('CREATE') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An item to be created';

--
-- Table structure for table `CatalogsCreativeAssetsAttributes` generated from model 'CatalogsCreativeAssetsAttributes'
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsAttributes` (
  `android_deep_link` TEXT DEFAULT NULL COMMENT 'Link to the creative assets page.',
  `custom_label_0` TEXT DEFAULT NULL COMMENT 'Custom grouping of creative assets.',
  `custom_label_1` TEXT DEFAULT NULL COMMENT 'Custom grouping of creative assets.',
  `custom_label_2` TEXT DEFAULT NULL COMMENT 'Custom grouping of creative assets.',
  `custom_label_3` TEXT DEFAULT NULL COMMENT 'Custom grouping of creative assets.',
  `custom_label_4` TEXT DEFAULT NULL COMMENT 'Custom grouping of creative assets.',
  `description` TEXT DEFAULT NULL COMMENT 'Brief description of the creative assets.',
  `google_product_category` TEXT DEFAULT NULL COMMENT 'The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.',
  `ios_deep_link` TEXT DEFAULT NULL COMMENT 'IOS deep link to the creative assets page.',
  `link` TEXT DEFAULT NULL COMMENT 'Link to the creative assets page.',
  `title` TEXT DEFAULT NULL COMMENT 'The name of the creative assets.',
  `visibility` TEXT DEFAULT NULL COMMENT 'Visibility of the creative assets. Must be one of the following values (upper or lowercase): &#39;visible&#39;, &#39;hidden&#39;.',
  `ai_disclosures` JSON DEFAULT NULL COMMENT 'AI content disclosures for individual assets (image_link or video_link) on this creative assets item. Each entry declares which disclosure types apply to a single asset URL.',
  `image_link` TEXT DEFAULT NULL COMMENT 'The creative assets image.',
  `video_link` TEXT DEFAULT NULL COMMENT 'The creative assets video.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsCreativeAssetsAvailableFilterValues` generated from model 'CatalogsCreativeAssetsAvailableFilterValues'
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsAvailableFilterValues` (
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `filter_values` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsCreativeAssetsBatchItem` generated from model 'CatalogsCreativeAssetsBatchItem'
-- Creative assets batch item
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsBatchItem` (
  `attributes` TEXT NOT NULL,
  `creative_assets_id` TEXT NOT NULL COMMENT 'The catalog creative assets id in the merchant namespace',
  `operation` ENUM('DELETE') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Creative assets batch item';

--
-- Table structure for table `CatalogsCreativeAssetsBatchRequest` generated from model 'CatalogsCreativeAssetsBatchRequest'
-- Request object to update catalogs creative assets items
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsBatchRequest` (
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog',
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `country` TEXT NOT NULL,
  `items` JSON NOT NULL COMMENT 'Array with creative assets item operations',
  `language` ENUM('af-ZA', 'ar-SA', 'bg-BG', 'bn-IN', 'cs-CZ', 'da-DK', 'de', 'el-GR', 'en-AU', 'en-CA', 'en-GB', 'en-IN', 'en-US', 'es-419', 'es-AR', 'es-ES', 'es-MX', 'fi-FI', 'fr', 'fr-CA', 'he-IL', 'hi-IN', 'hr-HR', 'hu-HU', 'id-ID', 'it', 'ja', 'ko-KR', 'ms-MY', 'nb-NO', 'nl', 'pl-PL', 'pt-BR', 'pt-PT', 'ro-RO', 'ru-RU', 'sk-SK', 'sv-SE', 'te-IN', 'th-TH', 'tl-PH', 'tr', 'uk-UA', 'vi-VN', 'zh-CN', 'zh-TW', 'AM', 'AR', 'AZ', 'BG', 'BN', 'BS', 'CA', 'CS', 'DA', 'DV', 'DZ', 'DE', 'EL', 'EN', 'ES', 'ET', 'FA', 'FI', 'FR', 'HE', 'HI', 'HR', 'HU', 'HY', 'ID', 'IN', 'IS', 'IT', 'IW', 'JA', 'KA', 'KM', 'KO', 'LO', 'LT', 'LV', 'MK', 'MN', 'MS', 'MY', 'NB', 'NE', 'NL', 'false', 'PL', 'PT', 'RO', 'RU', 'SK', 'SL', 'SQ', 'SR', 'SV', 'TL', 'UK', 'VI', 'TE', 'TH', 'TR', 'XX', 'ZH') NOT NULL COMMENT 'We recommend using the CatalogsLocale values.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object to update catalogs creative assets items';

--
-- Table structure for table `CatalogsCreativeAssetsFeed` generated from model 'CatalogsCreativeAssetsFeed'
-- Catalogs Creative Asset Feed object
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFeed` (
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.',
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `created_at` DATETIME NOT NULL,
  `credentials` TEXT DEFAULT NULL,
  `default_country` TEXT NOT NULL,
  `default_currency` TEXT DEFAULT NULL,
  `default_locale` TEXT NOT NULL COMMENT 'The locale used within a feed for product descriptions.',
  `format` TEXT NOT NULL,
  `id` TEXT NOT NULL COMMENT 'ID of the feed entity.',
  `location` TEXT NOT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `status` TEXT NOT NULL,
  `updated_at` DATETIME NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Catalogs Creative Asset Feed object';

--
-- Table structure for table `CatalogsCreativeAssetsFeedsCreateRequest` generated from model 'CatalogsCreativeAssetsFeedsCreateRequest'
-- Request object for creating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFeedsCreateRequest` (
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.',
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `credentials` TEXT DEFAULT NULL,
  `default_country` TEXT NOT NULL,
  `default_currency` TEXT DEFAULT NULL,
  `default_locale` TEXT NOT NULL,
  `format` TEXT NOT NULL,
  `location` TEXT NOT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `status` TEXT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for creating a feed.';

--
-- Table structure for table `CatalogsCreativeAssetsFeedsUpdateRequest` generated from model 'CatalogsCreativeAssetsFeedsUpdateRequest'
-- Request object for updating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFeedsUpdateRequest` (
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `credentials` TEXT DEFAULT NULL,
  `default_currency` TEXT DEFAULT NULL,
  `format` TEXT DEFAULT NULL,
  `location` TEXT DEFAULT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `name` TEXT DEFAULT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for updating a feed.';

--
-- Table structure for table `CatalogsCreativeAssetsFilterValuesMap` generated from model 'CatalogsCreativeAssetsFilterValuesMap'
-- A map of filter attributes to their available values.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFilterValuesMap` (
  `custom_label_0` JSON DEFAULT NULL,
  `custom_label_1` JSON DEFAULT NULL,
  `custom_label_2` JSON DEFAULT NULL,
  `custom_label_3` JSON DEFAULT NULL,
  `custom_label_4` JSON DEFAULT NULL,
  `google_product_category_0` JSON DEFAULT NULL,
  `google_product_category_1` JSON DEFAULT NULL,
  `google_product_category_2` JSON DEFAULT NULL,
  `google_product_category_3` JSON DEFAULT NULL,
  `google_product_category_4` JSON DEFAULT NULL,
  `google_product_category_5` JSON DEFAULT NULL,
  `google_product_category_6` JSON DEFAULT NULL,
  `media_type` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A map of filter attributes to their available values.';

--
-- Table structure for table `CatalogsCreativeAssetsItemErrorResponse` generated from model 'CatalogsCreativeAssetsItemErrorResponse'
-- Object describing a creative assets item error
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsItemErrorResponse` (
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `creative_assets_id` TEXT DEFAULT NULL COMMENT 'The catalog creative assets id in the merchant namespace',
  `errors` JSON NOT NULL COMMENT 'Array with the errors for the item id requested',
  `item_response_kind` ENUM('creative_assets_item_error') NOT NULL COMMENT 'Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing a creative assets item error';

--
-- Table structure for table `CatalogsCreativeAssetsItemResponse` generated from model 'CatalogsCreativeAssetsItemResponse'
-- Object describing a creative assets item record
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsItemResponse` (
  `attributes` TEXT DEFAULT NULL,
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `creative_assets_id` TEXT DEFAULT NULL COMMENT 'The catalog creative assets id in the merchant namespace',
  `item_response_kind` ENUM('creative_assets_item') NOT NULL COMMENT 'Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.',
  `pins` JSON DEFAULT NULL COMMENT 'The pins mapped to the item'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing a creative assets item record';

--
-- Table structure for table `CatalogsCreativeAssetsItemsBatch` generated from model 'CatalogsCreativeAssetsItemsBatch'
-- Object describing the catalogs creative assets items batch
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsItemsBatch` (
  `batch_id` TEXT DEFAULT NULL COMMENT 'Id of the catalogs items batch',
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `completed_time` DATETIME DEFAULT NULL COMMENT 'Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss',
  `created_time` DATETIME DEFAULT NULL COMMENT 'Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss',
  `items` JSON DEFAULT NULL COMMENT 'Array with the catalogs items processing records part of the catalogs items batch',
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing the catalogs creative assets items batch';

--
-- Table structure for table `CatalogsCreativeAssetsItemsPostFilter` generated from model 'CatalogsCreativeAssetsItemsPostFilter'
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsItemsPostFilter` (
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog',
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `creative_assets_ids` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest` generated from model 'CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest'
-- Request object to list products for a given creative assets catalog_id and product group filter.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest` (
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog ID pertaining to the product group.',
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `filters` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object to list products for a given creative assets catalog_id and product group filter.';

--
-- Table structure for table `CatalogsCreativeAssetsProduct` generated from model 'CatalogsCreativeAssetsProduct'
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProduct` (
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `metadata` TEXT NOT NULL,
  `pin` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsCreativeAssetsProductGroup` generated from model 'CatalogsCreativeAssetsProductGroup'
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductGroup` (
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog ID pertaining to the product group.',
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `created_at` INT DEFAULT NULL COMMENT 'Unix timestamp in seconds of when catalog product group was created.',
  `description` TEXT DEFAULT NULL,
  `filters` TEXT NOT NULL,
  `id` TEXT NOT NULL COMMENT 'ID of the catalog product group.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of catalog product group',
  `updated_at` INT DEFAULT NULL COMMENT 'Unix timestamp in seconds of last time catalog product group was updated.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsCreativeAssetsProductGroupCreateRequest` generated from model 'CatalogsCreativeAssetsProductGroupCreateRequest'
-- Request object for creating a creative assets product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductGroupCreateRequest` (
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog ID pertaining to the product group.',
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `description` TEXT DEFAULT NULL,
  `filters` TEXT NOT NULL,
  `name` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for creating a creative assets product group.';

--
-- Table structure for table `CatalogsCreativeAssetsProductGroupFilterKeys` generated from model 'CatalogsCreativeAssetsProductGroupFilterKeys'
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductGroupFilterKeys` (
  `CREATIVE_ASSETS_ID` TEXT NOT NULL,
  `CUSTOM_LABEL_0` TEXT NOT NULL,
  `CUSTOM_LABEL_1` TEXT NOT NULL,
  `CUSTOM_LABEL_2` TEXT NOT NULL,
  `CUSTOM_LABEL_3` TEXT NOT NULL,
  `CUSTOM_LABEL_4` TEXT NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_6` TEXT NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_5` TEXT NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_4` TEXT NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_3` TEXT NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_2` TEXT NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_1` TEXT NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_0` TEXT NOT NULL,
  `MEDIA_TYPE` TEXT NOT NULL,
  `TITLE_KEYWORDS` TEXT NOT NULL,
  `LINK` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsCreativeAssetsProductGroupFilters` generated from model 'CatalogsCreativeAssetsProductGroupFilters'
-- Object holding a group of filters for a creative assets product group
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductGroupFilters` (
  `any_of` JSON NOT NULL,
  `all_of` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object holding a group of filters for a creative assets product group';

--
-- Table structure for table `CatalogsCreativeAssetsProductGroupFiltersAllOf` generated from model 'CatalogsCreativeAssetsProductGroupFiltersAllOf'
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductGroupFiltersAllOf` (
  `all_of` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsCreativeAssetsProductGroupFiltersAnyOf` generated from model 'CatalogsCreativeAssetsProductGroupFiltersAnyOf'
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductGroupFiltersAnyOf` (
  `any_of` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsCreativeAssetsProductGroupProductCounts` generated from model 'CatalogsCreativeAssetsProductGroupProductCounts'
-- Product counts for a Creative Assets CatalogsProductGroup
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductGroupProductCounts` (
  `app_links` DECIMAL(20, 9) UNSIGNED NOT NULL,
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `images` DECIMAL(20, 9) UNSIGNED NOT NULL,
  `total` DECIMAL(20, 9) UNSIGNED NOT NULL,
  `videos` DECIMAL(20, 9) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Product counts for a Creative Assets CatalogsProductGroup';

--
-- Table structure for table `CatalogsCreativeAssetsProductGroupUpdateRequest` generated from model 'CatalogsCreativeAssetsProductGroupUpdateRequest'
-- Request object for updating a creative assets product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductGroupUpdateRequest` (
  `catalog_type` ENUM('CREATIVE_ASSETS') DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `filters` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'Name of catalog product group'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for updating a creative assets product group.';

--
-- Table structure for table `CatalogsCreativeAssetsProductMetadata` generated from model 'CatalogsCreativeAssetsProductMetadata'
-- Creative assets product metadata entity
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductMetadata` (
  `creative_assets_id` TEXT NOT NULL COMMENT 'The user-created unique ID that represents the creative assets item.',
  `visibility` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Creative assets product metadata entity';

--
-- Table structure for table `CatalogsDeleteCreativeAssetsItem` generated from model 'CatalogsDeleteCreativeAssetsItem'
-- A creative assets item to be deleted
--

CREATE TABLE IF NOT EXISTS `CatalogsDeleteCreativeAssetsItem` (
  `creative_assets_id` TEXT NOT NULL COMMENT 'The catalog creative assets id in the merchant namespace',
  `operation` ENUM('DELETE') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A creative assets item to be deleted';

--
-- Table structure for table `CatalogsDeleteHotelItem` generated from model 'CatalogsDeleteHotelItem'
-- A hotel item to be deleted
--

CREATE TABLE IF NOT EXISTS `CatalogsDeleteHotelItem` (
  `hotel_id` TEXT NOT NULL COMMENT 'The catalog hotel id in the merchant namespace',
  `operation` ENUM('DELETE') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A hotel item to be deleted';

--
-- Table structure for table `CatalogsDeleteRetailItem` generated from model 'CatalogsDeleteRetailItem'
-- An item to be deleted
--

CREATE TABLE IF NOT EXISTS `CatalogsDeleteRetailItem` (
  `item_id` TEXT NOT NULL COMMENT 'The catalog item id in the merchant namespace',
  `last_updated_time` BIGINT DEFAULT NULL COMMENT 'The millisecond timestamp when the item was lastly modified by the merchant.',
  `operation` ENUM('DELETE') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An item to be deleted';

--
-- Table structure for table `CatalogsFeed` generated from model 'CatalogsFeed'
-- Catalogs Feed object
--

CREATE TABLE IF NOT EXISTS `CatalogsFeed` (
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `created_at` DATETIME NOT NULL,
  `credentials` TEXT DEFAULT NULL,
  `default_availability` TEXT DEFAULT NULL,
  `default_country` TEXT NOT NULL,
  `default_currency` TEXT DEFAULT NULL,
  `default_locale` TEXT NOT NULL COMMENT 'The locale used within a feed for product descriptions.',
  `format` TEXT NOT NULL,
  `id` TEXT NOT NULL COMMENT 'ID of the feed entity.',
  `location` TEXT NOT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `status` TEXT NOT NULL,
  `updated_at` DATETIME NOT NULL,
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Catalogs Feed object';

--
-- Table structure for table `CatalogsFeedCreateRequestSchema` generated from model 'CatalogsFeedCreateRequestSchema'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedCreateRequestSchema` (
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.',
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `credentials` TEXT DEFAULT NULL,
  `default_availability` TEXT DEFAULT NULL,
  `default_country` TEXT NOT NULL,
  `default_currency` TEXT DEFAULT NULL,
  `default_locale` TEXT NOT NULL,
  `format` TEXT NOT NULL,
  `location` TEXT NOT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `status` TEXT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsFeedCredentials` generated from model 'CatalogsFeedCredentials'
-- This field is **OPTIONAL**. Use this if your feed file requires username and password.
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedCredentials` (
  `password` TEXT NOT NULL COMMENT 'The required password for downloading a feed.',
  `username` TEXT NOT NULL COMMENT 'The required username for downloading a feed.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This field is **OPTIONAL**. Use this if your feed file requires username and password.';

--
-- Table structure for table `CatalogsFeedIngestion` generated from model 'CatalogsFeedIngestion'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedIngestion` (
  `created_at` DATETIME NOT NULL COMMENT 'Timestamp of the feed ingestion.',
  `feed_id` TEXT NOT NULL COMMENT 'Catalog Feed id pertaining to the feed ingestion.',
  `id` TEXT NOT NULL COMMENT 'Unique identifier of a feed ingestion.',
  `status` TEXT NOT NULL COMMENT 'Status of the feed ingestion.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsFeedIngestionDetails` generated from model 'CatalogsFeedIngestionDetails'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedIngestionDetails` (
  `errors` TEXT NOT NULL,
  `info` TEXT NOT NULL,
  `warnings` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsFeedIngestionErrors` generated from model 'CatalogsFeedIngestionErrors'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedIngestionErrors` (
  `ACCOUNT_FLAGGED` INT DEFAULT NULL COMMENT 'We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.',
  `FETCH_GOOGLE_SHEET_NOT_SHARED` INT DEFAULT NULL COMMENT 'Update your Google Sheets sharing settings to &#39;Anyone with link&#39; as a Viewer so that Pinterest can access your file.',
  `IMAGE_FILE_NOT_ACCESSIBLE` INT DEFAULT NULL COMMENT 'Image files are unreadable. Please upload new files to continue.',
  `IMAGE_FILE_NOT_FOUND` INT DEFAULT NULL COMMENT 'Image files are unreadable. Please upload new files to continue.',
  `IMAGE_INVALID_FILE` INT DEFAULT NULL COMMENT 'Image files are unreadable. Please upload new files to continue.',
  `IMAGE_LEVEL_INTERNAL_ERROR` INT DEFAULT NULL COMMENT 'We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.',
  `IMAGE_MALFORMED_URL` INT DEFAULT NULL COMMENT 'Image files are unreadable. Please check your link and upload new files to continue.',
  `LARGE_PRODUCT_COUNT_DECREASE` INT DEFAULT NULL COMMENT 'The product count has decreased by more than 99% compared to the last successful ingestion.',
  `LINE_LEVEL_INTERNAL_ERROR` INT DEFAULT NULL COMMENT 'We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsFeedIngestionInfo` generated from model 'CatalogsFeedIngestionInfo'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedIngestionInfo` (
  `IN_STOCK` INT DEFAULT NULL COMMENT 'The number of ingested products that are in stock.',
  `OUT_OF_STOCK` INT DEFAULT NULL COMMENT 'The number of ingested products that are in out of stock.',
  `PREORDER` INT DEFAULT NULL COMMENT 'The number of ingested products that are in preorder.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsFeedIngestionWarnings` generated from model 'CatalogsFeedIngestionWarnings'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedIngestionWarnings` (
  `AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_400` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_403` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_404` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_405` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_410` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_429` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_500` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_502` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_503` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_504` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_507` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_508` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_520` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_521` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_522` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_525` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR` INT DEFAULT NULL COMMENT 'We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.',
  `AD_IMAGE_DOWNLOAD_INTERNAL_ERROR` INT DEFAULT NULL COMMENT 'We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.',
  `AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD` INT DEFAULT NULL COMMENT 'We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.',
  `AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED` INT DEFAULT NULL COMMENT 'We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.',
  `AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED` INT DEFAULT NULL COMMENT 'We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.',
  `AD_IMAGE_DOWNLOAD_INVALID_FILE` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_SITE_ERROR` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_SITE_TIMEOUT` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_SSL_ERROR` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_PROCESSING_EMPTY_FILE` INT DEFAULT NULL COMMENT 'Ad image files are unreadable. Please check your link and upload new files to continue.',
  `AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL` INT DEFAULT NULL COMMENT 'Ad images must have a height larger than 75 pixels',
  `AD_IMAGE_PROCESSING_TOO_MANY_PIXELS` INT DEFAULT NULL COMMENT 'Ad images must have a maximum area (width x height) of less than 89478485 pixels',
  `AD_IMAGE_PROCESSING_TYPE_MISMATCH` INT DEFAULT NULL COMMENT 'Some ad images could not be processed due to a file type mismatch.',
  `AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL` INT DEFAULT NULL COMMENT 'Ad images must have a width larger than 75 pixels',
  `AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_400` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_403` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_404` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_405` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_410` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_429` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_500` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_502` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_503` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_504` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_507` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_508` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_520` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_521` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_522` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_525` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR` INT DEFAULT NULL COMMENT 'We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.',
  `AD_VIDEO_DOWNLOAD_INTERNAL_ERROR` INT DEFAULT NULL COMMENT 'We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.',
  `AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD` INT DEFAULT NULL COMMENT 'We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.',
  `AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED` INT DEFAULT NULL COMMENT 'We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.',
  `AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED` INT DEFAULT NULL COMMENT 'We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.',
  `AD_VIDEO_DOWNLOAD_INVALID_FILE` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_SITE_ERROR` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_SITE_TIMEOUT` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_SSL_ERROR` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_LENGTH_TOO_SHORT` INT DEFAULT NULL COMMENT 'Ad videos length is too short. Please ensure that all ad videos are at least 4 seconds long.',
  `AD_VIDEO_PROCESSING_EMPTY_FILE` INT DEFAULT NULL COMMENT 'Ad video files are unreadable. Please check your link and upload new files to continue.',
  `AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL` INT DEFAULT NULL COMMENT 'Ad videos must have a height larger than 75 pixels',
  `AD_VIDEO_PROCESSING_TOO_MANY_PIXELS` INT DEFAULT NULL COMMENT 'Ad videos must have a maximum area (width x height) of less than 89478485 pixels',
  `AD_VIDEO_PROCESSING_TYPE_MISMATCH` INT DEFAULT NULL COMMENT 'Some ad videos could not be processed due to a file type mismatch.',
  `AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL` INT DEFAULT NULL COMMENT 'Ad videos must have a width larger than 75 pixels',
  `ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE` INT DEFAULT NULL COMMENT 'Additional image files are unreadable. Please upload new files to continue.',
  `ADDITIONAL_IMAGE_FILE_NOT_FOUND` INT DEFAULT NULL COMMENT 'Additional image files are unreadable. Please upload new files to continue.',
  `ADDITIONAL_IMAGE_INVALID_FILE` INT DEFAULT NULL COMMENT 'Additional image files are unreadable. Please upload new files to continue.',
  `ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR` INT DEFAULT NULL COMMENT 'We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.',
  `ADDITIONAL_IMAGE_MALFORMED_URL` INT DEFAULT NULL COMMENT 'Additional image files are unreadable. Please check your link and upload new files to continue.',
  `FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT` INT DEFAULT NULL COMMENT 'Update your Google Sheets sharing settings from &#39;Editor&#39; to &#39;Viewer&#39;.',
  `HOTEL_PRICE_HEADER_IS_PRESENT` INT DEFAULT NULL COMMENT 'Price is not a supported column. Use base_price and sale_price instead.',
  `VIDEO_DOWNLOAD_VIDEO_TOO_SHORT` INT DEFAULT NULL COMMENT 'Video length is too short. Please ensure that the main video is at least 4 seconds long.',
  `VIDEO_FILE_NOT_ACCESSIBLE` INT DEFAULT NULL COMMENT 'Video files are unreadable. Please upload new files to continue.',
  `VIDEO_FILE_NOT_FOUND` INT DEFAULT NULL COMMENT 'Video files are unreadable. Please upload new files to continue.',
  `VIDEO_INVALID_FILE` INT DEFAULT NULL COMMENT 'Video files are unreadable. Please upload new files to continue.',
  `VIDEO_LEVEL_INTERNAL_ERROR` INT DEFAULT NULL COMMENT 'We experienced a technical difficulty and were unable to download some additional videos. The next download attempt will happen in 24 hours.',
  `VIDEO_MALFORMED_URL` INT DEFAULT NULL COMMENT 'Video files are unreadable. Please check your link and upload new files to continue.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsFeedProcessingResult` generated from model 'CatalogsFeedProcessingResult'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedProcessingResult` (
  `created_at` DATETIME NOT NULL,
  `id` TEXT NOT NULL COMMENT 'ID of the feed processing result.',
  `ingestion_details` TEXT NOT NULL,
  `product_counts` TEXT NOT NULL,
  `status` TEXT NOT NULL,
  `updated_at` DATETIME NOT NULL,
  `validation_details` TEXT NOT NULL,
  `video_counts` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsFeedProcessingSchedule` generated from model 'CatalogsFeedProcessingSchedule'
-- Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedProcessingSchedule` (
  `time` TEXT NOT NULL COMMENT 'A time in format HH:MM with leading 0 (zero)',
  `timezone` TEXT NOT NULL COMMENT 'The timezone considered for the processing schedule time.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).';

--
-- Table structure for table `CatalogsFeedProductCounts` generated from model 'CatalogsFeedProductCounts'
-- The counts can be null early in the process.
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedProductCounts` (
  `ingested` INT DEFAULT NULL COMMENT 'The number of products successfully ingested from the feed file.',
  `original` INT DEFAULT NULL COMMENT 'The number of products in the feed file.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The counts can be null early in the process.';

--
-- Table structure for table `CatalogsFeedUpdateRequestSchema` generated from model 'CatalogsFeedUpdateRequestSchema'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedUpdateRequestSchema` (
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `credentials` TEXT DEFAULT NULL,
  `default_availability` TEXT DEFAULT NULL,
  `default_currency` TEXT DEFAULT NULL,
  `format` TEXT DEFAULT NULL,
  `location` TEXT DEFAULT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `name` TEXT DEFAULT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

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
  `ADULT_INVALID` INT DEFAULT NULL COMMENT 'Some items have invalid adult values.',
  `ADWORDS_FORMAT_INVALID` INT DEFAULT NULL COMMENT 'Some adwords links contain too many characters.',
  `AVAILABILITY_INVALID` INT DEFAULT NULL COMMENT 'Some items are missing an availability value in their product metadata, those items will not be published.',
  `BLOCKLISTED_IMAGE_SIGNATURE` INT DEFAULT NULL COMMENT 'Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines.',
  `DELIMITER_ERROR` INT DEFAULT NULL COMMENT 'Your feed includes data with formatting errors.',
  `DESCRIPTION_MISSING` INT DEFAULT NULL COMMENT 'Some items are missing a description in their product metadata, those items will not be published.',
  `DUPLICATE_PRODUCTS` INT DEFAULT NULL COMMENT 'Some products are duplicated.',
  `ENCODING_ERROR` INT DEFAULT NULL COMMENT 'Your feed includes data with an unsupported encoding format.',
  `FEED_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Your feed contains too many items, some items will not be published.',
  `FEED_TOO_SMALL` INT DEFAULT NULL COMMENT 'Your feed couldn&#39;t be validated because the file doesn&#39;t contain the minimum number of lines required.',
  `FETCH_ERROR` INT DEFAULT NULL COMMENT 'Pinterest couldn&#39;t download your feed.',
  `FETCH_INACTIVE_FEED_ERROR` INT DEFAULT NULL COMMENT 'Your feed wasn&#39;t ingested because it hasn&#39;t changed in the previous 90 days.',
  `IMAGE_LINK_INVALID` INT DEFAULT NULL COMMENT 'Some image links are formatted incorrectly.',
  `IMAGE_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Some items have image_link URLs that contain too many characters, so those items will not be published.',
  `IMAGE_LINK_MISSING` INT DEFAULT NULL COMMENT 'Some items are missing an image link URL in their product metadata, those items will not be published.',
  `INTERNAL_SERVICE_ERROR` INT DEFAULT NULL COMMENT 'We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.',
  `INVALID_DOMAIN` INT DEFAULT NULL COMMENT 'Some of your product link values don&#39;t match the verified domain associated with this account.',
  `ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` INT DEFAULT NULL COMMENT 'Some items&#39; main images can&#39;t be found.',
  `ITEMID_MISSING` INT DEFAULT NULL COMMENT 'Some items are missing an item id in their product metadata, those items will not be published.',
  `LINK_FORMAT_INVALID` INT DEFAULT NULL COMMENT 'Some link values are formatted incorrectly.',
  `LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Some product links contain too many characters, those items will not be published.',
  `LIST_PRICE_INVALID` INT DEFAULT NULL COMMENT 'Some items have list price formatting errors in their product metadata, those items will not be published.',
  `MALFORMED_XML` INT DEFAULT NULL COMMENT 'Your feed couldn&#39;t be validated because the xml file is formatted incorrectly.',
  `MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED` INT DEFAULT NULL COMMENT 'Some items exceed the maximum number of items per item group, those items will not be published.',
  `NO_VERIFIED_DOMAIN` INT DEFAULT NULL COMMENT 'Your merchant domain needs to be claimed.',
  `PARSE_LINE_ERROR` INT DEFAULT NULL COMMENT 'Your feed contains formatting errors for some items.',
  `PINJOIN_CONTENT_UNSAFE` INT DEFAULT NULL COMMENT 'Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines.',
  `PRICE_CANNOT_BE_DETERMINED` INT DEFAULT NULL COMMENT 'Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.',
  `PRICE_MISSING` INT DEFAULT NULL COMMENT 'Some products are missing a price, those items will not be published.',
  `PRODUCT_LINK_MISSING` INT DEFAULT NULL COMMENT 'Some items are missing a link URL in their product metadata, those items will not be published.',
  `PRODUCT_PRICE_INVALID` INT DEFAULT NULL COMMENT 'Some items have price formatting errors in their product metadata, those items will not be published.',
  `REQUIRED_COLUMNS_MISSING` INT DEFAULT NULL COMMENT 'Your feed is missing some required column headers.',
  `TITLE_MISSING` INT DEFAULT NULL COMMENT 'Some items are missing a title in their product metadata, those items will not be published.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsFeedValidationWarnings` generated from model 'CatalogsFeedValidationWarnings'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedValidationWarnings` (
  `AD_IMAGE_0_LINK_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_0_link is duplicated with another ad image link.',
  `AD_IMAGE_0_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image link 0 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_0_LINK_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image link 0 is required because an image tag was provided.',
  `AD_IMAGE_0_LINK_WARNING` INT DEFAULT NULL COMMENT 'Ad image link 0 format is unsupported.',
  `AD_IMAGE_0_TAG_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_0_tag is duplicated with another ad image tag.',
  `AD_IMAGE_0_TAG_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image tag 0 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_0_TAG_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image tag 0 is required because an image link was provided.',
  `AD_IMAGE_10_LINK_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_10_link is duplicated with another ad image link.',
  `AD_IMAGE_10_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image link 10 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_10_LINK_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image link 10 is required because an image tag was provided.',
  `AD_IMAGE_10_LINK_WARNING` INT DEFAULT NULL COMMENT 'Ad image link 10 format is unsupported.',
  `AD_IMAGE_10_TAG_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_10_tag is duplicated with another ad image tag.',
  `AD_IMAGE_10_TAG_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image tag 10 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_10_TAG_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image tag 10 is required because an image link was provided.',
  `AD_IMAGE_11_LINK_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_11_link is duplicated with another ad image link.',
  `AD_IMAGE_11_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image link 11 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_11_LINK_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image link 11 is required because an image tag was provided.',
  `AD_IMAGE_11_LINK_WARNING` INT DEFAULT NULL COMMENT 'Ad image link 11 format is unsupported.',
  `AD_IMAGE_11_TAG_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_11_tag is duplicated with another ad image tag.',
  `AD_IMAGE_11_TAG_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image tag 11 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_11_TAG_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image tag 11 is required because an image link was provided.',
  `AD_IMAGE_12_LINK_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_12_link is duplicated with another ad image link.',
  `AD_IMAGE_12_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image link 12 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_12_LINK_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image link 12 is required because an image tag was provided.',
  `AD_IMAGE_12_LINK_WARNING` INT DEFAULT NULL COMMENT 'Ad image link 12 format is unsupported.',
  `AD_IMAGE_12_TAG_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_12_tag is duplicated with another ad image tag.',
  `AD_IMAGE_12_TAG_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image tag 12 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_12_TAG_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image tag 12 is required because an image link was provided.',
  `AD_IMAGE_13_LINK_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_13_link is duplicated with another ad image link.',
  `AD_IMAGE_13_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image link 13 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_13_LINK_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image link 13 is required because an image tag was provided.',
  `AD_IMAGE_13_LINK_WARNING` INT DEFAULT NULL COMMENT 'Ad image link 13 format is unsupported.',
  `AD_IMAGE_13_TAG_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_13_tag is duplicated with another ad image tag.',
  `AD_IMAGE_13_TAG_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image tag 13 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_13_TAG_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image tag 13 is required because an image link was provided.',
  `AD_IMAGE_14_LINK_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_14_link is duplicated with another ad image link.',
  `AD_IMAGE_14_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image link 14 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_14_LINK_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image link 14 is required because an image tag was provided.',
  `AD_IMAGE_14_LINK_WARNING` INT DEFAULT NULL COMMENT 'Ad image link 14 format is unsupported.',
  `AD_IMAGE_14_TAG_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_14_tag is duplicated with another ad image tag.',
  `AD_IMAGE_14_TAG_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image tag 14 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_14_TAG_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image tag 14 is required because an image link was provided.',
  `AD_IMAGE_15_LINK_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_15_link is duplicated with another ad image link.',
  `AD_IMAGE_15_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image link 15 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_15_LINK_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image link 15 is required because an image tag was provided.',
  `AD_IMAGE_15_LINK_WARNING` INT DEFAULT NULL COMMENT 'Ad image link 15 format is unsupported.',
  `AD_IMAGE_15_TAG_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_15_tag is duplicated with another ad image tag.',
  `AD_IMAGE_15_TAG_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image tag 15 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_15_TAG_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image tag 15 is required because an image link was provided.',
  `AD_IMAGE_16_LINK_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_16_link is duplicated with another ad image link.',
  `AD_IMAGE_16_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image link 16 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_16_LINK_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image link 16 is required because an image tag was provided.',
  `AD_IMAGE_16_LINK_WARNING` INT DEFAULT NULL COMMENT 'Ad image link 16 format is unsupported.',
  `AD_IMAGE_16_TAG_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_16_tag is duplicated with another ad image tag.',
  `AD_IMAGE_16_TAG_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image tag 16 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_16_TAG_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image tag 16 is required because an image link was provided.',
  `AD_IMAGE_17_LINK_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_17_link is duplicated with another ad image link.',
  `AD_IMAGE_17_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image link 17 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_17_LINK_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image link 17 is required because an image tag was provided.',
  `AD_IMAGE_17_LINK_WARNING` INT DEFAULT NULL COMMENT 'Ad image link 17 format is unsupported.',
  `AD_IMAGE_17_TAG_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_17_tag is duplicated with another ad image tag.',
  `AD_IMAGE_17_TAG_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image tag 17 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_17_TAG_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image tag 17 is required because an image link was provided.',
  `AD_IMAGE_18_LINK_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_18_link is duplicated with another ad image link.',
  `AD_IMAGE_18_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image link 18 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_18_LINK_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image link 18 is required because an image tag was provided.',
  `AD_IMAGE_18_LINK_WARNING` INT DEFAULT NULL COMMENT 'Ad image link 18 format is unsupported.',
  `AD_IMAGE_18_TAG_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_18_tag is duplicated with another ad image tag.',
  `AD_IMAGE_18_TAG_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image tag 18 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_18_TAG_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image tag 18 is required because an image link was provided.',
  `AD_IMAGE_19_LINK_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_19_link is duplicated with another ad image link.',
  `AD_IMAGE_19_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image link 19 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_19_LINK_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image link 19 is required because an image tag was provided.',
  `AD_IMAGE_19_LINK_WARNING` INT DEFAULT NULL COMMENT 'Ad image link 19 format is unsupported.',
  `AD_IMAGE_19_TAG_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_19_tag is duplicated with another ad image tag.',
  `AD_IMAGE_19_TAG_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image tag 19 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_19_TAG_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image tag 19 is required because an image link was provided.',
  `AD_IMAGE_1_LINK_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_1_link is duplicated with another ad image link.',
  `AD_IMAGE_1_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image link 1 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_1_LINK_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image link 1 is required because an image tag was provided.',
  `AD_IMAGE_1_LINK_WARNING` INT DEFAULT NULL COMMENT 'Ad image link 1 format is unsupported.',
  `AD_IMAGE_1_TAG_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_1_tag is duplicated with another ad image tag.',
  `AD_IMAGE_1_TAG_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image tag 1 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_1_TAG_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image tag 1 is required because an image link was provided.',
  `AD_IMAGE_2_LINK_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_2_link is duplicated with another ad image link.',
  `AD_IMAGE_2_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image link 2 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_2_LINK_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image link 2 is required because an image tag was provided.',
  `AD_IMAGE_2_LINK_WARNING` INT DEFAULT NULL COMMENT 'Ad image link 2 format is unsupported.',
  `AD_IMAGE_2_TAG_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_2_tag is duplicated with another ad image tag.',
  `AD_IMAGE_2_TAG_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image tag 2 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_2_TAG_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image tag 2 is required because an image link was provided.',
  `AD_IMAGE_3_LINK_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_3_link is duplicated with another ad image link.',
  `AD_IMAGE_3_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image link 3 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_3_LINK_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image link 3 is required because an image tag was provided.',
  `AD_IMAGE_3_LINK_WARNING` INT DEFAULT NULL COMMENT 'Ad image link 3 format is unsupported.',
  `AD_IMAGE_3_TAG_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_3_tag is duplicated with another ad image tag.',
  `AD_IMAGE_3_TAG_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image tag 3 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_3_TAG_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image tag 3 is required because an image link was provided.',
  `AD_IMAGE_4_LINK_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_4_link is duplicated with another ad image link.',
  `AD_IMAGE_4_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image link 4 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_4_LINK_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image link 4 is required because an image tag was provided.',
  `AD_IMAGE_4_LINK_WARNING` INT DEFAULT NULL COMMENT 'Ad image link 4 format is unsupported.',
  `AD_IMAGE_4_TAG_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_4_tag is duplicated with another ad image tag.',
  `AD_IMAGE_4_TAG_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image tag 4 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_4_TAG_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image tag 4 is required because an image link was provided.',
  `AD_IMAGE_5_LINK_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_5_link is duplicated with another ad image link.',
  `AD_IMAGE_5_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image link 5 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_5_LINK_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image link 5 is required because an image tag was provided.',
  `AD_IMAGE_5_LINK_WARNING` INT DEFAULT NULL COMMENT 'Ad image link 5 format is unsupported.',
  `AD_IMAGE_5_TAG_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_5_tag is duplicated with another ad image tag.',
  `AD_IMAGE_5_TAG_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image tag 5 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_5_TAG_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image tag 5 is required because an image link was provided.',
  `AD_IMAGE_6_LINK_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_6_link is duplicated with another ad image link.',
  `AD_IMAGE_6_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image link 6 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_6_LINK_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image link 6 is required because an image tag was provided.',
  `AD_IMAGE_6_LINK_WARNING` INT DEFAULT NULL COMMENT 'Ad image link 6 format is unsupported.',
  `AD_IMAGE_6_TAG_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_6_tag is duplicated with another ad image tag.',
  `AD_IMAGE_6_TAG_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image tag 6 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_6_TAG_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image tag 6 is required because an image link was provided.',
  `AD_IMAGE_7_LINK_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_7_link is duplicated with another ad image link.',
  `AD_IMAGE_7_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image link 7 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_7_LINK_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image link 7 is required because an image tag was provided.',
  `AD_IMAGE_7_LINK_WARNING` INT DEFAULT NULL COMMENT 'Ad image link 7 format is unsupported.',
  `AD_IMAGE_7_TAG_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_7_tag is duplicated with another ad image tag.',
  `AD_IMAGE_7_TAG_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image tag 7 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_7_TAG_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image tag 7 is required because an image link was provided.',
  `AD_IMAGE_8_LINK_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_8_link is duplicated with another ad image link.',
  `AD_IMAGE_8_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image link 8 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_8_LINK_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image link 8 is required because an image tag was provided.',
  `AD_IMAGE_8_LINK_WARNING` INT DEFAULT NULL COMMENT 'Ad image link 8 format is unsupported.',
  `AD_IMAGE_8_TAG_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_8_tag is duplicated with another ad image tag.',
  `AD_IMAGE_8_TAG_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image tag 8 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_8_TAG_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image tag 8 is required because an image link was provided.',
  `AD_IMAGE_9_LINK_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_9_link is duplicated with another ad image link.',
  `AD_IMAGE_9_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image link 9 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_9_LINK_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image link 9 is required because an image tag was provided.',
  `AD_IMAGE_9_LINK_WARNING` INT DEFAULT NULL COMMENT 'Ad image link 9 format is unsupported.',
  `AD_IMAGE_9_TAG_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_image_9_tag is duplicated with another ad image tag.',
  `AD_IMAGE_9_TAG_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Ad image tag 9 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_9_TAG_REQUIRED` INT DEFAULT NULL COMMENT 'Ad image tag 9 is required because an image link was provided.',
  `AD_LINK_FORMAT_WARNING` INT DEFAULT NULL COMMENT 'Some items have ad links that are formatted incorrectly.',
  `AD_LINK_SAME_AS_LINK` INT DEFAULT NULL COMMENT 'Some items have ad link URLs that are duplicates of the link URLs for those items.',
  `AD_VIDEO_0_LINK_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_video_0_link is duplicated with another ad video link.',
  `AD_VIDEO_0_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'ad_video_0_link length is too long. The maximum length is 511 characters.',
  `AD_VIDEO_0_LINK_REQUIRED` INT DEFAULT NULL COMMENT 'ad_video_0_link is required for this item because ad_video_0_tag was provided.',
  `AD_VIDEO_0_LINK_WARNING` INT DEFAULT NULL COMMENT 'ad_video_0_link is formatted incorrectly and will not be published with your items.',
  `AD_VIDEO_0_TAG_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_video_0_tag is duplicated with another ad video tag.',
  `AD_VIDEO_0_TAG_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'ad_video_0_tag length is too long. The maximum length is 511 characters.',
  `AD_VIDEO_0_TAG_REQUIRED` INT DEFAULT NULL COMMENT 'ad_video_0_tag is required because ad_video_0_link was provided.',
  `AD_VIDEO_1_LINK_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_video_1_link is duplicated with another ad video link.',
  `AD_VIDEO_1_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'ad_video_1_link length is too long. The maximum length is 511 characters.',
  `AD_VIDEO_1_LINK_REQUIRED` INT DEFAULT NULL COMMENT 'ad_video_1_link is required for this item because ad_video_1_tag was provided.',
  `AD_VIDEO_1_LINK_WARNING` INT DEFAULT NULL COMMENT 'ad_video_1_link is formatted incorrectly and will not be published with your items.',
  `AD_VIDEO_1_TAG_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_video_1_tag is duplicated with another ad video tag.',
  `AD_VIDEO_1_TAG_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'ad_video_1_tag length is too long. The maximum length is 511 characters.',
  `AD_VIDEO_1_TAG_REQUIRED` INT DEFAULT NULL COMMENT 'ad_video_1_tag is required because ad_video_1_link was provided.',
  `AD_VIDEO_2_LINK_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_video_2_link is duplicated with another ad video link.',
  `AD_VIDEO_2_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'ad_video_2_link length is too long. The maximum length is 511 characters.',
  `AD_VIDEO_2_LINK_REQUIRED` INT DEFAULT NULL COMMENT 'ad_video_2_link is required for this item because ad_video_2_tag was provided.',
  `AD_VIDEO_2_LINK_WARNING` INT DEFAULT NULL COMMENT 'ad_video_2_link is formatted incorrectly and will not be published with your items.',
  `AD_VIDEO_2_TAG_DUPLICATED` INT DEFAULT NULL COMMENT 'ad_video_2_tag is duplicated with another ad video tag.',
  `AD_VIDEO_2_TAG_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'ad_video_2_tag length is too long. The maximum length is 511 characters.',
  `AD_VIDEO_2_TAG_REQUIRED` INT DEFAULT NULL COMMENT 'ad_video_2_tag is required because ad_video_2_link was provided.',
  `ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Some items have additional_image_link URLs that contain too many characters, so those items will not be published.',
  `ADDITIONAL_IMAGE_LINK_WARNING` INT DEFAULT NULL COMMENT 'Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.',
  `ADWORDS_FORMAT_WARNING` INT DEFAULT NULL COMMENT 'Some items have adwords_redirect links that are formatted incorrectly.',
  `ADWORDS_SAME_AS_LINK` INT DEFAULT NULL COMMENT 'Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.',
  `AGE_GROUP_INVALID` INT DEFAULT NULL COMMENT 'Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.',
  `ANDROID_DEEP_LINK_INVALID` INT DEFAULT NULL COMMENT 'Some items include invalid android_deep_link.',
  `AVAILABILITY_DATE_INVALID` INT DEFAULT NULL COMMENT 'Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.',
  `COUNTRY_DOES_NOT_MAP_TO_CURRENCY` INT DEFAULT NULL COMMENT 'Some items include a currency that doesn&#39;t match the usual currency for the location where that product is sold or shipped.',
  `CUSTOM_LABEL_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Some items have custom_label values that are too long, those items will be published without that custom label.',
  `DESCRIPTION_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'The description for some items were truncated because they contain too many characters.',
  `DUPLICATE_HEADERS` INT DEFAULT NULL COMMENT 'Your feed contains duplicate headers.',
  `EXPIRATION_DATE_INVALID` INT DEFAULT NULL COMMENT 'Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.',
  `FETCH_SAME_SIGNATURE` INT DEFAULT NULL COMMENT 'Ingestion completed early because there are no changes to your feed since the last successful update.',
  `GENDER_INVALID` INT DEFAULT NULL COMMENT 'Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.',
  `GTIN_INVALID` INT DEFAULT NULL COMMENT 'Some items include incorrectly formatted GTINs.',
  `IMAGE_LINK_WARNING` INT DEFAULT NULL COMMENT 'Some items have image_link URLs that are formatted incorrectly and will not be published with those items.',
  `INCONSISTENT_CURRENCY_VALUES` INT DEFAULT NULL COMMENT 'Some items include inconsistent currencies in price fields.',
  `INDEXED_PRODUCT_COUNT_LARGE_DELTA` INT DEFAULT NULL COMMENT 'The product count has increased or decreased significantly compared to the last successful ingestion.',
  `IOS_DEEP_LINK_INVALID` INT DEFAULT NULL COMMENT 'Some items include invalid ios_deep_link values.',
  `IS_BUNDLE_INVALID` INT DEFAULT NULL COMMENT 'Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.',
  `ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE` INT DEFAULT NULL COMMENT 'Some items include additional_image_links that can&#39;t be found.',
  `LINK_FORMAT_WARNING` INT DEFAULT NULL COMMENT 'Some items have an invalid product link which contains invalid UTM tracking paramaters.',
  `MIN_AD_PRICE_INVALID` INT DEFAULT NULL COMMENT 'Some items include min_ad_price values that are formatted incorrectly.',
  `MPN_INVALID` INT DEFAULT NULL COMMENT 'Some items include incorrectly formatted MPNs.',
  `MULTIPACK_INVALID` INT DEFAULT NULL COMMENT 'Some items have invalid multipack values.',
  `OPTIONAL_CONDITION_INVALID` INT DEFAULT NULL COMMENT 'Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.',
  `OPTIONAL_CONDITION_MISSING` INT DEFAULT NULL COMMENT 'Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.',
  `OPTIONAL_PRODUCT_CATEGORY_INVALID` INT DEFAULT NULL COMMENT 'Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.',
  `OPTIONAL_PRODUCT_CATEGORY_MISSING` INT DEFAULT NULL COMMENT 'Some items are missing a google_product_category.',
  `PRODUCT_CATEGORY_DEPTH_WARNING` INT DEFAULT NULL COMMENT 'Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.',
  `PRODUCT_TYPE_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Some items have product_type values that are too long, those items will be published without that product type.',
  `SALE_DATE_INVALID` INT DEFAULT NULL COMMENT 'Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.',
  `SALES_PRICE_INVALID` INT DEFAULT NULL COMMENT 'Some items have sale price values that are higher than the original price of the item.',
  `SALES_PRICE_TOO_HIGH` INT DEFAULT NULL COMMENT 'Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.',
  `SALES_PRICE_TOO_LOW` INT DEFAULT NULL COMMENT 'Some items include sales price that is much lower than the list price.',
  `SHIPPING_HEIGHT_INVALID` INT DEFAULT NULL COMMENT 'Some items include incorrectly formatted shipping_height.',
  `SHIPPING_INVALID` INT DEFAULT NULL COMMENT 'Some items have shipping values that are formatted incorrectly.',
  `SHIPPING_WEIGHT_INVALID` INT DEFAULT NULL COMMENT 'Some items have invalid shipping_weight values.',
  `SHIPPING_WIDTH_INVALID` INT DEFAULT NULL COMMENT 'Some items include incorrectly formatted shipping_width.',
  `SIZE_SYSTEM_INVALID` INT DEFAULT NULL COMMENT 'Some items have size system values which are not one of the supported size systems.',
  `SIZE_TYPE_INVALID` INT DEFAULT NULL COMMENT 'Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.',
  `TAX_INVALID` INT DEFAULT NULL COMMENT 'Some items have tax values that are formatted incorrectly.',
  `TITLE_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'The title for some items were truncated because they contain too many characters.',
  `TOO_MANY_ADDITIONAL_IMAGE_LINKS` INT DEFAULT NULL COMMENT 'Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.',
  `UPDATED_TIME_INVALID` INT DEFAULT NULL COMMENT 'Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.',
  `UTM_SOURCE_AUTO_CORRECTED` INT DEFAULT NULL COMMENT 'Some items include utm_source values that are formatted incorrectly and have been automatically corrected.',
  `VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED` INT DEFAULT NULL COMMENT 'A video is required in the item when ad_video fields are provided.',
  `WEIGHT_UNIT_INVALID` INT DEFAULT NULL COMMENT 'Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsFeedVideoCounts` generated from model 'CatalogsFeedVideoCounts'
-- Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedVideoCounts` (
  `ingested_videos` INT DEFAULT NULL COMMENT 'The number of videos successfully ingested from the feed file.',
  `not_ingested_videos` INT DEFAULT NULL COMMENT 'The number of videos that were not ingested from the feed file.',
  `total_videos` INT DEFAULT NULL COMMENT 'The number of videos in the feed file.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.';

--
-- Table structure for table `CatalogsFeedsCreateRequest` generated from model 'CatalogsFeedsCreateRequest'
-- Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedsCreateRequest` (
  `credentials` TEXT DEFAULT NULL,
  `default_availability` TEXT DEFAULT NULL,
  `default_country` TEXT DEFAULT NULL,
  `default_currency` TEXT DEFAULT NULL,
  `default_locale` TEXT DEFAULT NULL,
  `format` TEXT NOT NULL,
  `location` TEXT NOT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `status` TEXT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.';

--
-- Table structure for table `CatalogsFeedsUpdateRequest` generated from model 'CatalogsFeedsUpdateRequest'
-- Request object for updating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedsUpdateRequest` (
  `credentials` TEXT DEFAULT NULL,
  `default_availability` TEXT DEFAULT NULL,
  `default_currency` TEXT DEFAULT NULL,
  `format` TEXT DEFAULT NULL,
  `location` TEXT DEFAULT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `name` TEXT DEFAULT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for updating a feed.';

--
-- Table structure for table `CatalogsHotelAddress` generated from model 'CatalogsHotelAddress'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelAddress` (
  `addr1` TEXT DEFAULT NULL COMMENT 'Primary street address of hotel.',
  `city` TEXT DEFAULT NULL COMMENT 'City where the hotel is located.',
  `country` TEXT DEFAULT NULL COMMENT 'Country where the hotel is located.',
  `postal_code` TEXT DEFAULT NULL COMMENT 'Required for countries with a postal code system. Postal or zip code of the hotel.',
  `region` TEXT DEFAULT NULL COMMENT 'State, county, province, where the hotel is located.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsHotelAttributes` generated from model 'CatalogsHotelAttributes'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelAttributes` (
  `address` TEXT DEFAULT NULL COMMENT 'Hotel address',
  `base_price` TEXT DEFAULT NULL COMMENT 'Base price of the hotel room per night followed by the ISO currency code',
  `brand` TEXT DEFAULT NULL COMMENT 'The brand to which this hotel belongs to.',
  `category` TEXT DEFAULT NULL COMMENT 'The type of property. The category can be any type of internal description desired.',
  `custom_label_0` TEXT DEFAULT NULL COMMENT 'Custom grouping of hotels',
  `custom_label_1` TEXT DEFAULT NULL COMMENT 'Custom grouping of hotels',
  `custom_label_2` TEXT DEFAULT NULL COMMENT 'Custom grouping of hotels',
  `custom_label_3` TEXT DEFAULT NULL COMMENT 'Custom grouping of hotels',
  `custom_label_4` TEXT DEFAULT NULL COMMENT 'Custom grouping of hotels',
  `description` TEXT DEFAULT NULL COMMENT 'Brief description of the hotel.',
  `guest_ratings` TEXT DEFAULT NULL COMMENT 'If specified, you must provide all properties',
  `latitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Latitude of the hotel.',
  `link` TEXT DEFAULT NULL COMMENT 'Link to the product page',
  `longitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Longitude of the hotel.',
  `name` TEXT DEFAULT NULL COMMENT 'The hotel&#39;s name.',
  `neighborhood` JSON DEFAULT NULL COMMENT 'A list of neighborhoods where the hotel is located',
  `sale_price` TEXT DEFAULT NULL COMMENT 'Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.',
  `additional_image_link` JSON DEFAULT NULL COMMENT '&lt;&#x3D; 2000 characters. The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.',
  `ai_disclosures` JSON DEFAULT NULL COMMENT 'AI content disclosures for individual assets (main_image.link or additional_image_link) on this hotel item. Each entry declares which disclosure types apply to a single asset URL.',
  `main_image` TEXT DEFAULT NULL COMMENT 'The main hotel image'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsHotelAvailableFilterValues` generated from model 'CatalogsHotelAvailableFilterValues'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelAvailableFilterValues` (
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `filter_values` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsHotelBatchItem` generated from model 'CatalogsHotelBatchItem'
-- Hotel batch item
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelBatchItem` (
  `attributes` TEXT NOT NULL,
  `hotel_id` TEXT NOT NULL COMMENT 'The catalog hotel id in the merchant namespace',
  `operation` ENUM('DELETE') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Hotel batch item';

--
-- Table structure for table `CatalogsHotelBatchRequest` generated from model 'CatalogsHotelBatchRequest'
-- Request object to update catalogs hotel items
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelBatchRequest` (
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog',
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `country` TEXT NOT NULL,
  `items` JSON NOT NULL COMMENT 'Array with catalogs item operations',
  `language` ENUM('af-ZA', 'ar-SA', 'bg-BG', 'bn-IN', 'cs-CZ', 'da-DK', 'de', 'el-GR', 'en-AU', 'en-CA', 'en-GB', 'en-IN', 'en-US', 'es-419', 'es-AR', 'es-ES', 'es-MX', 'fi-FI', 'fr', 'fr-CA', 'he-IL', 'hi-IN', 'hr-HR', 'hu-HU', 'id-ID', 'it', 'ja', 'ko-KR', 'ms-MY', 'nb-NO', 'nl', 'pl-PL', 'pt-BR', 'pt-PT', 'ro-RO', 'ru-RU', 'sk-SK', 'sv-SE', 'te-IN', 'th-TH', 'tl-PH', 'tr', 'uk-UA', 'vi-VN', 'zh-CN', 'zh-TW', 'AM', 'AR', 'AZ', 'BG', 'BN', 'BS', 'CA', 'CS', 'DA', 'DV', 'DZ', 'DE', 'EL', 'EN', 'ES', 'ET', 'FA', 'FI', 'FR', 'HE', 'HI', 'HR', 'HU', 'HY', 'ID', 'IN', 'IS', 'IT', 'IW', 'JA', 'KA', 'KM', 'KO', 'LO', 'LT', 'LV', 'MK', 'MN', 'MS', 'MY', 'NB', 'NE', 'NL', 'false', 'PL', 'PT', 'RO', 'RU', 'SK', 'SL', 'SQ', 'SR', 'SV', 'TL', 'UK', 'VI', 'TE', 'TH', 'TR', 'XX', 'ZH') NOT NULL COMMENT 'We recommend using the CatalogsLocale values.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object to update catalogs hotel items';

--
-- Table structure for table `CatalogsHotelFeed` generated from model 'CatalogsHotelFeed'
-- Catalogs Hotel Feed object
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelFeed` (
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.',
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `created_at` DATETIME NOT NULL,
  `credentials` TEXT DEFAULT NULL,
  `default_currency` TEXT DEFAULT NULL,
  `default_locale` TEXT NOT NULL COMMENT 'The locale used within a feed for product descriptions.',
  `format` TEXT NOT NULL,
  `id` TEXT NOT NULL COMMENT 'ID of the feed entity.',
  `location` TEXT NOT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `status` TEXT NOT NULL,
  `updated_at` DATETIME NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Catalogs Hotel Feed object';

--
-- Table structure for table `CatalogsHotelFeedsCreateRequest` generated from model 'CatalogsHotelFeedsCreateRequest'
-- Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelFeedsCreateRequest` (
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.',
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `credentials` TEXT DEFAULT NULL,
  `default_currency` TEXT DEFAULT NULL,
  `default_locale` TEXT NOT NULL,
  `format` TEXT NOT NULL,
  `location` TEXT NOT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `status` TEXT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.';

--
-- Table structure for table `CatalogsHotelFeedsUpdateRequest` generated from model 'CatalogsHotelFeedsUpdateRequest'
-- Request object for updating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelFeedsUpdateRequest` (
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `credentials` TEXT DEFAULT NULL,
  `default_currency` TEXT DEFAULT NULL,
  `format` TEXT DEFAULT NULL,
  `location` TEXT DEFAULT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `name` TEXT DEFAULT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for updating a feed.';

--
-- Table structure for table `CatalogsHotelFilterValuesMap` generated from model 'CatalogsHotelFilterValuesMap'
-- A map of filter attributes to their available values.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelFilterValuesMap` (
  `brand` JSON DEFAULT NULL,
  `custom_label_0` JSON DEFAULT NULL,
  `custom_label_1` JSON DEFAULT NULL,
  `custom_label_2` JSON DEFAULT NULL,
  `custom_label_3` JSON DEFAULT NULL,
  `custom_label_4` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A map of filter attributes to their available values.';

--
-- Table structure for table `CatalogsHotelGuestRatings` generated from model 'CatalogsHotelGuestRatings'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelGuestRatings` (
  `max_score` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Max value for the hotel rating score.',
  `number_of_reviewers` INT DEFAULT NULL COMMENT 'Total number of people who have rated this hotel.',
  `rating_system` TEXT DEFAULT NULL COMMENT 'System you use for guest reviews.',
  `score` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Your hotel&#39;s rating.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsHotelItemErrorResponse` generated from model 'CatalogsHotelItemErrorResponse'
-- Object describing a hotel item error
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelItemErrorResponse` (
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `errors` JSON NOT NULL COMMENT 'Array with the errors for the item id requested',
  `hotel_id` TEXT DEFAULT NULL COMMENT 'The catalog hotel id in the merchant namespace',
  `item_response_kind` ENUM('hotel_item_error') NOT NULL COMMENT 'Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing a hotel item error';

--
-- Table structure for table `CatalogsHotelItemResponse` generated from model 'CatalogsHotelItemResponse'
-- Object describing a hotel record
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelItemResponse` (
  `attributes` TEXT DEFAULT NULL,
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `hotel_id` TEXT DEFAULT NULL COMMENT 'The catalog hotel id in the merchant namespace',
  `item_response_kind` ENUM('hotel_item') NOT NULL COMMENT 'Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.',
  `pins` JSON DEFAULT NULL COMMENT 'The pins mapped to the item'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing a hotel record';

--
-- Table structure for table `CatalogsHotelItemsBatch` generated from model 'CatalogsHotelItemsBatch'
-- Object describing the catalogs hotel items batch. If specified, you must provide all properties.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelItemsBatch` (
  `batch_id` TEXT DEFAULT NULL COMMENT 'Id of the catalogs items batch',
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `completed_time` DATETIME DEFAULT NULL COMMENT 'Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss',
  `created_time` DATETIME DEFAULT NULL COMMENT 'Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss',
  `items` JSON DEFAULT NULL COMMENT 'Array with the catalogs items processing records part of the catalogs items batch',
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing the catalogs hotel items batch. If specified, you must provide all properties.';

--
-- Table structure for table `CatalogsHotelItemsPostFilter` generated from model 'CatalogsHotelItemsPostFilter'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelItemsPostFilter` (
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog',
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `hotel_ids` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsHotelListProductsByCatalogBasedFilterRequest` generated from model 'CatalogsHotelListProductsByCatalogBasedFilterRequest'
-- Request object to list products for a given hotel catalog_id and product group filter.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelListProductsByCatalogBasedFilterRequest` (
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog ID pertaining to the product group.',
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `filters` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object to list products for a given hotel catalog_id and product group filter.';

--
-- Table structure for table `CatalogsHotelMainImage` generated from model 'CatalogsHotelMainImage'
-- The main hotel image
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelMainImage` (
  `link` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.',
  `tag` JSON DEFAULT NULL COMMENT 'Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The main hotel image';

--
-- Table structure for table `CatalogsHotelProduct` generated from model 'CatalogsHotelProduct'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProduct` (
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `metadata` TEXT NOT NULL,
  `pin` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsHotelProductGroup` generated from model 'CatalogsHotelProductGroup'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroup` (
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog ID pertaining to the product group.',
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `created_at` INT DEFAULT NULL COMMENT 'Unix timestamp in seconds of when catalog product group was created.',
  `description` TEXT DEFAULT NULL,
  `filters` TEXT NOT NULL,
  `id` TEXT NOT NULL COMMENT 'ID of the catalog product group.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of catalog product group',
  `type` TEXT NOT NULL,
  `updated_at` INT DEFAULT NULL COMMENT 'Unix timestamp in seconds of last time catalog product group was updated.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsHotelProductGroupCreateRequest` generated from model 'CatalogsHotelProductGroupCreateRequest'
-- Request object for creating a hotel product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroupCreateRequest` (
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog ID pertaining to the product group.',
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `description` TEXT DEFAULT NULL,
  `filters` TEXT NOT NULL,
  `name` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for creating a hotel product group.';

--
-- Table structure for table `CatalogsHotelProductGroupFilterKeys` generated from model 'CatalogsHotelProductGroupFilterKeys'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroupFilterKeys` (
  `PRICE` TEXT NOT NULL,
  `HOTEL_ID` TEXT NOT NULL,
  `BRAND` TEXT NOT NULL,
  `CUSTOM_LABEL_0` TEXT NOT NULL,
  `CUSTOM_LABEL_1` TEXT NOT NULL,
  `CUSTOM_LABEL_2` TEXT NOT NULL,
  `CUSTOM_LABEL_3` TEXT NOT NULL,
  `CUSTOM_LABEL_4` TEXT NOT NULL,
  `COUNTRY` TEXT NOT NULL,
  `TITLE_KEYWORDS` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsHotelProductGroupFilters` generated from model 'CatalogsHotelProductGroupFilters'
-- Object holding a group of filters for a hotel product group
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroupFilters` (
  `any_of` JSON NOT NULL,
  `all_of` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object holding a group of filters for a hotel product group';

--
-- Table structure for table `CatalogsHotelProductGroupFiltersAllOf` generated from model 'CatalogsHotelProductGroupFiltersAllOf'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroupFiltersAllOf` (
  `all_of` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsHotelProductGroupFiltersAnyOf` generated from model 'CatalogsHotelProductGroupFiltersAnyOf'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroupFiltersAnyOf` (
  `any_of` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsHotelProductGroupProductCounts` generated from model 'CatalogsHotelProductGroupProductCounts'
-- Product counts for a Hotel CatalogsProductGroup
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroupProductCounts` (
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `total` DECIMAL(20, 9) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Product counts for a Hotel CatalogsProductGroup';

--
-- Table structure for table `CatalogsHotelProductGroupUpdateRequest` generated from model 'CatalogsHotelProductGroupUpdateRequest'
-- Request object for updating a hotel product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroupUpdateRequest` (
  `catalog_type` ENUM('HOTEL') DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `filters` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'Name of catalog product group'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for updating a hotel product group.';

--
-- Table structure for table `CatalogsHotelProductMetadata` generated from model 'CatalogsHotelProductMetadata'
-- Hotel product metadata entity
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductMetadata` (
  `hotel_id` TEXT NOT NULL COMMENT 'The user-created unique ID that represents the hotel item.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Hotel product metadata entity';

--
-- Table structure for table `CatalogsHotelReportParameters` generated from model 'CatalogsHotelReportParameters'
-- Parameters for hotel report
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelReportParameters` (
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `report` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Parameters for hotel report';

--
-- Table structure for table `CatalogsHotelReportParametersReport` generated from model 'CatalogsHotelReportParametersReport'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelReportParametersReport` (
  `feed_id` TEXT NOT NULL COMMENT 'ID of the feed entity.',
  `processing_result_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.',
  `report_type` ENUM('DISTRIBUTION_ISSUES') NOT NULL,
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a catalog. If not given, oldest catalog will be used'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsHotelReportStatsParameters` generated from model 'CatalogsHotelReportStatsParameters'
-- Parameters for hotel report
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelReportStatsParameters` (
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `report` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Parameters for hotel report';

--
-- Table structure for table `CatalogsHotelReportStatsParametersReport` generated from model 'CatalogsHotelReportStatsParametersReport'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelReportStatsParametersReport` (
  `feed_id` TEXT NOT NULL COMMENT 'ID of the feed entity.',
  `processing_result_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.',
  `report_type` ENUM('DISTRIBUTION_ISSUES') NOT NULL,
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a catalog. If not given, oldest catalog will be used'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsItemValidationDetails` generated from model 'CatalogsItemValidationDetails'
--

CREATE TABLE IF NOT EXISTS `CatalogsItemValidationDetails` (
  `attribute_name` TEXT NOT NULL COMMENT 'Attribute that has a validation issue.',
  `provided_value` TEXT NOT NULL COMMENT 'Provided value that caused the validation issue.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsItemValidationErrors` generated from model 'CatalogsItemValidationErrors'
--

CREATE TABLE IF NOT EXISTS `CatalogsItemValidationErrors` (
  `ADULT_INVALID` TEXT DEFAULT NULL COMMENT 'Item has an invalid adult value.',
  `ADWORDS_FORMAT_INVALID` TEXT DEFAULT NULL COMMENT 'Adword link contains too many characters.',
  `AVAILABILITY_INVALID` TEXT DEFAULT NULL COMMENT 'Item is missing availability value in its product metadata, this item will not be published.',
  `BLOCKLISTED_IMAGE_SIGNATURE` TEXT DEFAULT NULL COMMENT 'Item will not be published because it doesn&#39;t meet Pinterest&#39;s Merchant Guidelines.',
  `DESCRIPTION_MISSING` TEXT DEFAULT NULL COMMENT 'Item is missing description in its product metadata, this item will not be published.',
  `DUPLICATE_PRODUCTS` TEXT DEFAULT NULL COMMENT 'This product is duplicated. The duplicate entry will not be published.',
  `IMAGE_LINK_INVALID` TEXT DEFAULT NULL COMMENT 'Image link is invalid.',
  `IMAGE_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Item has image_link URL that contains too many characters, so the item will not be published.',
  `IMAGE_LINK_MISSING` TEXT DEFAULT NULL COMMENT 'Item is missing an image link URL in its product metadata, this item will not be published.',
  `INVALID_DOMAIN` TEXT DEFAULT NULL COMMENT 'Product link value doesn&#39;t match the verified domain associated with this account.',
  `ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` TEXT DEFAULT NULL COMMENT 'Main image can&#39;t be found.',
  `ITEMID_MISSING` TEXT DEFAULT NULL COMMENT 'Item is missing item id in its product metadata, this item will not be published.',
  `LINK_FORMAT_INVALID` TEXT DEFAULT NULL COMMENT 'Link is invalid.',
  `LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Product link contains too many characters, this item will not be published.',
  `LIST_PRICE_INVALID` TEXT DEFAULT NULL COMMENT 'Item has a list price formatting error, this item will not be published.',
  `MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED` TEXT DEFAULT NULL COMMENT 'Item exceed the maximum number of items per item group, this item will not be published.',
  `PARSE_LINE_ERROR` TEXT DEFAULT NULL COMMENT 'Item contains formating errors.',
  `PINJOIN_CONTENT_UNSAFE` TEXT DEFAULT NULL COMMENT 'Item will not be published because it doesn&#39;t meet Pinterest&#39;s Merchant Guidelines.',
  `PRICE_CANNOT_BE_DETERMINED` TEXT DEFAULT NULL COMMENT 'Item price cannot be determined because the price, list price, and sale price are all different.',
  `PRICE_MISSING` TEXT DEFAULT NULL COMMENT 'Product is missing a price, this item will not be published.',
  `PRODUCT_LINK_MISSING` TEXT DEFAULT NULL COMMENT 'Item is missing a link URL in its product metadata, this item will not be published.',
  `PRODUCT_PRICE_INVALID` TEXT DEFAULT NULL COMMENT 'Item has a price formatting error in its product metadata, this item will not be published.',
  `TITLE_MISSING` TEXT DEFAULT NULL COMMENT 'Item is missing title in its product metadata, this item will not be published.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsItemValidationIssues` generated from model 'CatalogsItemValidationIssues'
--

CREATE TABLE IF NOT EXISTS `CatalogsItemValidationIssues` (
  `errors` TEXT NOT NULL,
  `item_id` TEXT NOT NULL COMMENT 'The merchant-created unique ID that represents the product.',
  `item_number` INT NOT NULL COMMENT 'Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation.',
  `warnings` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsItemValidationWarnings` generated from model 'CatalogsItemValidationWarnings'
--

CREATE TABLE IF NOT EXISTS `CatalogsItemValidationWarnings` (
  `AD_IMAGE_0_LINK_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_0_link is duplicated with another ad image link.',
  `AD_IMAGE_0_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image link 0 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_0_LINK_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image link 0 is required because an image tag was provided.',
  `AD_IMAGE_0_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'Ad image link 0 format is unsupported.',
  `AD_IMAGE_0_TAG_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_0_tag is duplicated with another ad image tag.',
  `AD_IMAGE_0_TAG_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image tag 0 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_0_TAG_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image tag 0 is required because an image link was provided.',
  `AD_IMAGE_10_LINK_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_10_link is duplicated with another ad image link.',
  `AD_IMAGE_10_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image link 10 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_10_LINK_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image link 10 is required because an image tag was provided.',
  `AD_IMAGE_10_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'Ad image link 10 format is unsupported.',
  `AD_IMAGE_10_TAG_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_10_tag is duplicated with another ad image tag.',
  `AD_IMAGE_10_TAG_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image tag 10 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_10_TAG_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image tag 10 is required because an image link was provided.',
  `AD_IMAGE_11_LINK_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_11_link is duplicated with another ad image link.',
  `AD_IMAGE_11_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image link 11 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_11_LINK_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image link 11 is required because an image tag was provided.',
  `AD_IMAGE_11_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'Ad image link 11 format is unsupported.',
  `AD_IMAGE_11_TAG_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_11_tag is duplicated with another ad image tag.',
  `AD_IMAGE_11_TAG_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image tag 11 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_11_TAG_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image tag 11 is required because an image link was provided.',
  `AD_IMAGE_12_LINK_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_12_link is duplicated with another ad image link.',
  `AD_IMAGE_12_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image link 12 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_12_LINK_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image link 12 is required because an image tag was provided.',
  `AD_IMAGE_12_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'Ad image link 12 format is unsupported.',
  `AD_IMAGE_12_TAG_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_12_tag is duplicated with another ad image tag.',
  `AD_IMAGE_12_TAG_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image tag 12 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_12_TAG_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image tag 12 is required because an image link was provided.',
  `AD_IMAGE_13_LINK_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_13_link is duplicated with another ad image link.',
  `AD_IMAGE_13_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image link 13 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_13_LINK_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image link 13 is required because an image tag was provided.',
  `AD_IMAGE_13_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'Ad image link 13 format is unsupported.',
  `AD_IMAGE_13_TAG_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_13_tag is duplicated with another ad image tag.',
  `AD_IMAGE_13_TAG_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image tag 13 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_13_TAG_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image tag 13 is required because an image link was provided.',
  `AD_IMAGE_14_LINK_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_14_link is duplicated with another ad image link.',
  `AD_IMAGE_14_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image link 14 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_14_LINK_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image link 14 is required because an image tag was provided.',
  `AD_IMAGE_14_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'Ad image link 14 format is unsupported.',
  `AD_IMAGE_14_TAG_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_14_tag is duplicated with another ad image tag.',
  `AD_IMAGE_14_TAG_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image tag 14 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_14_TAG_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image tag 14 is required because an image link was provided.',
  `AD_IMAGE_15_LINK_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_15_link is duplicated with another ad image link.',
  `AD_IMAGE_15_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image link 15 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_15_LINK_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image link 15 is required because an image tag was provided.',
  `AD_IMAGE_15_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'Ad image link 15 format is unsupported.',
  `AD_IMAGE_15_TAG_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_15_tag is duplicated with another ad image tag.',
  `AD_IMAGE_15_TAG_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image tag 15 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_15_TAG_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image tag 15 is required because an image link was provided.',
  `AD_IMAGE_16_LINK_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_16_link is duplicated with another ad image link.',
  `AD_IMAGE_16_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image link 16 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_16_LINK_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image link 16 is required because an image tag was provided.',
  `AD_IMAGE_16_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'Ad image link 16 format is unsupported.',
  `AD_IMAGE_16_TAG_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_16_tag is duplicated with another ad image tag.',
  `AD_IMAGE_16_TAG_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image tag 16 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_16_TAG_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image tag 16 is required because an image link was provided.',
  `AD_IMAGE_17_LINK_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_17_link is duplicated with another ad image link.',
  `AD_IMAGE_17_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image link 17 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_17_LINK_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image link 17 is required because an image tag was provided.',
  `AD_IMAGE_17_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'Ad image link 17 format is unsupported.',
  `AD_IMAGE_17_TAG_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_17_tag is duplicated with another ad image tag.',
  `AD_IMAGE_17_TAG_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image tag 17 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_17_TAG_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image tag 17 is required because an image link was provided.',
  `AD_IMAGE_18_LINK_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_18_link is duplicated with another ad image link.',
  `AD_IMAGE_18_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image link 18 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_18_LINK_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image link 18 is required because an image tag was provided.',
  `AD_IMAGE_18_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'Ad image link 18 format is unsupported.',
  `AD_IMAGE_18_TAG_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_18_tag is duplicated with another ad image tag.',
  `AD_IMAGE_18_TAG_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image tag 18 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_18_TAG_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image tag 18 is required because an image link was provided.',
  `AD_IMAGE_19_LINK_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_19_link is duplicated with another ad image link.',
  `AD_IMAGE_19_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image link 19 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_19_LINK_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image link 19 is required because an image tag was provided.',
  `AD_IMAGE_19_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'Ad image link 19 format is unsupported.',
  `AD_IMAGE_19_TAG_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_19_tag is duplicated with another ad image tag.',
  `AD_IMAGE_19_TAG_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image tag 19 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_19_TAG_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image tag 19 is required because an image link was provided.',
  `AD_IMAGE_1_LINK_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_1_link is duplicated with another ad image link.',
  `AD_IMAGE_1_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image link 1 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_1_LINK_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image link 1 is required because an image tag was provided.',
  `AD_IMAGE_1_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'Ad image link 1 format is unsupported.',
  `AD_IMAGE_1_TAG_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_1_tag is duplicated with another ad image tag.',
  `AD_IMAGE_1_TAG_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image tag 1 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_1_TAG_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image tag 1 is required because an image link was provided.',
  `AD_IMAGE_2_LINK_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_2_link is duplicated with another ad image link.',
  `AD_IMAGE_2_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image link 2 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_2_LINK_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image link 2 is required because an image tag was provided.',
  `AD_IMAGE_2_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'Ad image link 2 format is unsupported.',
  `AD_IMAGE_2_TAG_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_2_tag is duplicated with another ad image tag.',
  `AD_IMAGE_2_TAG_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image tag 2 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_2_TAG_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image tag 2 is required because an image link was provided.',
  `AD_IMAGE_3_LINK_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_3_link is duplicated with another ad image link.',
  `AD_IMAGE_3_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image link 3 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_3_LINK_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image link 3 is required because an image tag was provided.',
  `AD_IMAGE_3_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'Ad image link 3 format is unsupported.',
  `AD_IMAGE_3_TAG_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_3_tag is duplicated with another ad image tag.',
  `AD_IMAGE_3_TAG_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image tag 3 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_3_TAG_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image tag 3 is required because an image link was provided.',
  `AD_IMAGE_4_LINK_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_4_link is duplicated with another ad image link.',
  `AD_IMAGE_4_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image link 4 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_4_LINK_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image link 4 is required because an image tag was provided.',
  `AD_IMAGE_4_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'Ad image link 4 format is unsupported.',
  `AD_IMAGE_4_TAG_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_4_tag is duplicated with another ad image tag.',
  `AD_IMAGE_4_TAG_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image tag 4 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_4_TAG_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image tag 4 is required because an image link was provided.',
  `AD_IMAGE_5_LINK_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_5_link is duplicated with another ad image link.',
  `AD_IMAGE_5_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image link 5 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_5_LINK_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image link 5 is required because an image tag was provided.',
  `AD_IMAGE_5_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'Ad image link 5 format is unsupported.',
  `AD_IMAGE_5_TAG_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_5_tag is duplicated with another ad image tag.',
  `AD_IMAGE_5_TAG_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image tag 5 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_5_TAG_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image tag 5 is required because an image link was provided.',
  `AD_IMAGE_6_LINK_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_6_link is duplicated with another ad image link.',
  `AD_IMAGE_6_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image link 6 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_6_LINK_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image link 6 is required because an image tag was provided.',
  `AD_IMAGE_6_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'Ad image link 6 format is unsupported.',
  `AD_IMAGE_6_TAG_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_6_tag is duplicated with another ad image tag.',
  `AD_IMAGE_6_TAG_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image tag 6 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_6_TAG_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image tag 6 is required because an image link was provided.',
  `AD_IMAGE_7_LINK_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_7_link is duplicated with another ad image link.',
  `AD_IMAGE_7_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image link 7 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_7_LINK_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image link 7 is required because an image tag was provided.',
  `AD_IMAGE_7_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'Ad image link 7 format is unsupported.',
  `AD_IMAGE_7_TAG_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_7_tag is duplicated with another ad image tag.',
  `AD_IMAGE_7_TAG_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image tag 7 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_7_TAG_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image tag 7 is required because an image link was provided.',
  `AD_IMAGE_8_LINK_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_8_link is duplicated with another ad image link.',
  `AD_IMAGE_8_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image link 8 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_8_LINK_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image link 8 is required because an image tag was provided.',
  `AD_IMAGE_8_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'Ad image link 8 format is unsupported.',
  `AD_IMAGE_8_TAG_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_8_tag is duplicated with another ad image tag.',
  `AD_IMAGE_8_TAG_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image tag 8 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_8_TAG_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image tag 8 is required because an image link was provided.',
  `AD_IMAGE_9_LINK_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_9_link is duplicated with another ad image link.',
  `AD_IMAGE_9_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image link 9 length is too long. The maximum length is 2047 characters.',
  `AD_IMAGE_9_LINK_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image link 9 is required because an image tag was provided.',
  `AD_IMAGE_9_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'Ad image link 9 format is unsupported.',
  `AD_IMAGE_9_TAG_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_image_9_tag is duplicated with another ad image tag.',
  `AD_IMAGE_9_TAG_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Ad image tag 9 length is too long. The maximum length is 511 characters.',
  `AD_IMAGE_9_TAG_REQUIRED` TEXT DEFAULT NULL COMMENT 'Ad image tag 9 is required because an image link was provided.',
  `AD_LINK_FORMAT_WARNING` TEXT DEFAULT NULL COMMENT 'Item has an ad link that is formatted incorrectly.',
  `AD_LINK_SAME_AS_LINK` TEXT DEFAULT NULL COMMENT 'Item has an ad link URL that is duplicate of the link URL.',
  `AD_VIDEO_0_LINK_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_video_0_link is duplicated with another ad video link.',
  `AD_VIDEO_0_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'ad_video_0_link length is too long. The maximum length is 511 characters.',
  `AD_VIDEO_0_LINK_REQUIRED` TEXT DEFAULT NULL COMMENT 'ad_video_0_link is required for this item because ad_video_0_tag was provided.',
  `AD_VIDEO_0_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'ad_video_0_link is formatted incorrectly and will not be published with your items.',
  `AD_VIDEO_0_TAG_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_video_0_tag is duplicated with another ad video tag.',
  `AD_VIDEO_0_TAG_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'ad_video_0_tag length is too long. The maximum length is 511 characters.',
  `AD_VIDEO_0_TAG_REQUIRED` TEXT DEFAULT NULL COMMENT 'ad_video_0_tag is required because ad_video_0_link was provided.',
  `AD_VIDEO_1_LINK_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_video_1_link is duplicated with another ad video link.',
  `AD_VIDEO_1_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'ad_video_1_link length is too long. The maximum length is 511 characters.',
  `AD_VIDEO_1_LINK_REQUIRED` TEXT DEFAULT NULL COMMENT 'ad_video_1_link is required for this item because ad_video_1_tag was provided.',
  `AD_VIDEO_1_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'ad_video_1_link is formatted incorrectly and will not be published with your items.',
  `AD_VIDEO_1_TAG_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_video_1_tag is duplicated with another ad video tag.',
  `AD_VIDEO_1_TAG_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'ad_video_1_tag length is too long. The maximum length is 511 characters.',
  `AD_VIDEO_1_TAG_REQUIRED` TEXT DEFAULT NULL COMMENT 'ad_video_1_tag is required because ad_video_1_link was provided.',
  `AD_VIDEO_2_LINK_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_video_2_link is duplicated with another ad video link.',
  `AD_VIDEO_2_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'ad_video_2_link length is too long. The maximum length is 511 characters.',
  `AD_VIDEO_2_LINK_REQUIRED` TEXT DEFAULT NULL COMMENT 'ad_video_2_link is required for this item because ad_video_2_tag was provided.',
  `AD_VIDEO_2_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'ad_video_2_link is formatted incorrectly and will not be published with your items.',
  `AD_VIDEO_2_TAG_DUPLICATED` TEXT DEFAULT NULL COMMENT 'ad_video_2_tag is duplicated with another ad video tag.',
  `AD_VIDEO_2_TAG_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'ad_video_2_tag length is too long. The maximum length is 511 characters.',
  `AD_VIDEO_2_TAG_REQUIRED` TEXT DEFAULT NULL COMMENT 'ad_video_2_tag is required because ad_video_2_link was provided.',
  `ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Item has an additional_image_link URL that contains too many characters, so the item will not be published.',
  `ADDITIONAL_IMAGE_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'Item has additional_image_link URLs that are formatted incorrectly and will not be published with your items.',
  `ADWORDS_FORMAT_WARNING` TEXT DEFAULT NULL COMMENT 'Item has an adwords_redirect link that is formatted incorrectly.',
  `ADWORDS_SAME_AS_LINK` TEXT DEFAULT NULL COMMENT 'Item has an adwords_redirect URL that is duplicate of the link URL.',
  `AGE_GROUP_INVALID` TEXT DEFAULT NULL COMMENT 'Item has an age group value that is formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.',
  `ANDROID_DEEP_LINK_INVALID` TEXT DEFAULT NULL COMMENT 'Item includes an invalid android_deep_link.',
  `AVAILABILITY_DATE_INVALID` TEXT DEFAULT NULL COMMENT 'Item has an availability_date value that is formatted incorrectly, this item will be published without an availability date.',
  `COUNTRY_DOES_NOT_MAP_TO_CURRENCY` TEXT DEFAULT NULL COMMENT 'Item includes a currency that doesn&#39;t match the usual currency for the location where the product is sold or shipped.',
  `CUSTOM_LABEL_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Item has a custom_label value that is too long, this item will be published without that custom label.',
  `DESCRIPTION_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'The description for this item was truncated because it contains too many characters.',
  `EXPIRATION_DATE_INVALID` TEXT DEFAULT NULL COMMENT 'Item has an expiration_date value that is formatted incorrectly, this item will be published without an expiration date.',
  `GENDER_INVALID` TEXT DEFAULT NULL COMMENT 'Item has a gender value that is formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.',
  `GTIN_INVALID` TEXT DEFAULT NULL COMMENT 'Item has a GTIN value that is formatted incorrectly.',
  `IMAGE_LINK_WARNING` TEXT DEFAULT NULL COMMENT 'Item has an image_link URL that is formatted incorrectly and will not be published.',
  `IOS_DEEP_LINK_INVALID` TEXT DEFAULT NULL COMMENT 'Item includes an invalid ios_deep_link value.',
  `IS_BUNDLE_INVALID` TEXT DEFAULT NULL COMMENT 'Item has an is_bundle value that is formatted incorrectly, this item will be published without being bundled with other products.',
  `ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE` TEXT DEFAULT NULL COMMENT 'Item includes additional_image_links that can&#39;t be found.',
  `LINK_FORMAT_WARNING` TEXT DEFAULT NULL COMMENT 'Item has an invalid product link which contains invalid UTM tracking paramaters.',
  `MIN_AD_PRICE_INVALID` TEXT DEFAULT NULL COMMENT 'Item includes a min_ad_price value that is formatted incorrectly.',
  `MPN_INVALID` TEXT DEFAULT NULL COMMENT 'Item has a MPN value that is formatted incorrectly.',
  `MULTIPACK_INVALID` TEXT DEFAULT NULL COMMENT 'Item has an invalid multipack value.',
  `OPTIONAL_CONDITION_INVALID` TEXT DEFAULT NULL COMMENT 'Item includes a condition value that is formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.',
  `OPTIONAL_CONDITION_MISSING` TEXT DEFAULT NULL COMMENT 'Item is missing condition value, which may limit visibility in recommendations, search results and shopping experiences.',
  `OPTIONAL_PRODUCT_CATEGORY_INVALID` TEXT DEFAULT NULL COMMENT 'Item includes a google_product_category value that is not formatted correctly according to the GPC taxonomy.',
  `OPTIONAL_PRODUCT_CATEGORY_MISSING` TEXT DEFAULT NULL COMMENT 'Item is missing google_product_category.',
  `PRODUCT_CATEGORY_DEPTH_WARNING` TEXT DEFAULT NULL COMMENT 'Item only has 1 or 2 levels of google_product_category value, which may limit visibility in recommendations, search results and shopping experiences.',
  `PRODUCT_TYPE_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'Item has a product_type value that is too long, this item will be published without that product type.',
  `SALE_DATE_INVALID` TEXT DEFAULT NULL COMMENT 'Item has a sale_price_effective_date value that is formatted incorrectly, this item will be published without a sale date.',
  `SALES_PRICE_INVALID` TEXT DEFAULT NULL COMMENT 'Item has an incorrectly formatted sales price.',
  `SALES_PRICE_TOO_HIGH` TEXT DEFAULT NULL COMMENT 'Item has a sale price value that is higher than the original price of the item.',
  `SALES_PRICE_TOO_LOW` TEXT DEFAULT NULL COMMENT 'Item has a sale price value that is discounted very low compared to the price.',
  `SHIPPING_HEIGHT_INVALID` TEXT DEFAULT NULL COMMENT 'Item has an incorrectly formatted shipping_height value. The value must first contain a numeric value then a valid dimension unit type.',
  `SHIPPING_INVALID` TEXT DEFAULT NULL COMMENT 'Item has a shipping value that is formatted incorrectly.',
  `SHIPPING_WEIGHT_INVALID` TEXT DEFAULT NULL COMMENT 'Item has an invalid shipping_weight value.',
  `SHIPPING_WIDTH_INVALID` TEXT DEFAULT NULL COMMENT 'Item has an incorrectly formatted shipping_width value. The value must first contain a numeric value then a valid dimension unit type.',
  `SIZE_SYSTEM_INVALID` TEXT DEFAULT NULL COMMENT 'Some items have size system values which are not one of the supported size systems.',
  `SIZE_TYPE_INVALID` TEXT DEFAULT NULL COMMENT 'Item has a size type value that is formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.',
  `TAX_INVALID` TEXT DEFAULT NULL COMMENT 'Item has a tax value that is formatted incorrectly.',
  `TITLE_LENGTH_TOO_LONG` TEXT DEFAULT NULL COMMENT 'The title for the item was truncated because it contains too many characters.',
  `TOO_MANY_ADDITIONAL_IMAGE_LINKS` TEXT DEFAULT NULL COMMENT 'Item has a additional_image_link value that exceed the limit for additional images, this item will be published without some of your images.',
  `UTM_SOURCE_AUTO_CORRECTED` TEXT DEFAULT NULL COMMENT 'Item includes an utm_source value that is formatted incorrectly and has been automatically corrected.',
  `VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED` TEXT DEFAULT NULL COMMENT 'A video is required in the item when ad_video fields are provided.',
  `WEIGHT_UNIT_INVALID` TEXT DEFAULT NULL COMMENT 'Item has a weight_unit value that is formatted incorrectly, this item will be published without a weight unit.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsItemsBatch` generated from model 'CatalogsItemsBatch'
-- Object describing the catalogs items batch
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsBatch` (
  `batch_id` TEXT DEFAULT NULL COMMENT 'Id of the catalogs items batch',
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `completed_time` DATETIME DEFAULT NULL COMMENT 'Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss',
  `created_time` DATETIME NOT NULL COMMENT 'Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss',
  `items` JSON DEFAULT NULL COMMENT 'Array with the catalogs items processing records part of the catalogs items batch',
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing the catalogs items batch';

--
-- Table structure for table `CatalogsItemsBatchPostRequest` generated from model 'CatalogsItemsBatchPostRequest'
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsBatchPostRequest` (
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog',
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `country` TEXT NOT NULL,
  `items` JSON NOT NULL COMMENT 'Array with catalogs items',
  `language` ENUM('af-ZA', 'ar-SA', 'bg-BG', 'bn-IN', 'cs-CZ', 'da-DK', 'de', 'el-GR', 'en-AU', 'en-CA', 'en-GB', 'en-IN', 'en-US', 'es-419', 'es-AR', 'es-ES', 'es-MX', 'fi-FI', 'fr', 'fr-CA', 'he-IL', 'hi-IN', 'hr-HR', 'hu-HU', 'id-ID', 'it', 'ja', 'ko-KR', 'ms-MY', 'nb-NO', 'nl', 'pl-PL', 'pt-BR', 'pt-PT', 'ro-RO', 'ru-RU', 'sk-SK', 'sv-SE', 'te-IN', 'th-TH', 'tl-PH', 'tr', 'uk-UA', 'vi-VN', 'zh-CN', 'zh-TW', 'AM', 'AR', 'AZ', 'BG', 'BN', 'BS', 'CA', 'CS', 'DA', 'DV', 'DZ', 'DE', 'EL', 'EN', 'ES', 'ET', 'FA', 'FI', 'FR', 'HE', 'HI', 'HR', 'HU', 'HY', 'ID', 'IN', 'IS', 'IT', 'IW', 'JA', 'KA', 'KM', 'KO', 'LO', 'LT', 'LV', 'MK', 'MN', 'MS', 'MY', 'NB', 'NE', 'NL', 'false', 'PL', 'PT', 'RO', 'RU', 'SK', 'SL', 'SQ', 'SR', 'SV', 'TL', 'UK', 'VI', 'TE', 'TH', 'TR', 'XX', 'ZH') NOT NULL COMMENT 'We recommend using the CatalogsLocale values.',
  `operation` ENUM('DELETE') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsItemsBatchRequest` generated from model 'CatalogsItemsBatchRequest'
-- Request object of catalogs items batch
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsBatchRequest` (
  `country` TEXT NOT NULL,
  `items` JSON NOT NULL COMMENT 'Array with catalogs items',
  `language` ENUM('af-ZA', 'ar-SA', 'bg-BG', 'bn-IN', 'cs-CZ', 'da-DK', 'de', 'el-GR', 'en-AU', 'en-CA', 'en-GB', 'en-IN', 'en-US', 'es-419', 'es-AR', 'es-ES', 'es-MX', 'fi-FI', 'fr', 'fr-CA', 'he-IL', 'hi-IN', 'hr-HR', 'hu-HU', 'id-ID', 'it', 'ja', 'ko-KR', 'ms-MY', 'nb-NO', 'nl', 'pl-PL', 'pt-BR', 'pt-PT', 'ro-RO', 'ru-RU', 'sk-SK', 'sv-SE', 'te-IN', 'th-TH', 'tl-PH', 'tr', 'uk-UA', 'vi-VN', 'zh-CN', 'zh-TW', 'AM', 'AR', 'AZ', 'BG', 'BN', 'BS', 'CA', 'CS', 'DA', 'DV', 'DZ', 'DE', 'EL', 'EN', 'ES', 'ET', 'FA', 'FI', 'FR', 'HE', 'HI', 'HR', 'HU', 'HY', 'ID', 'IN', 'IS', 'IT', 'IW', 'JA', 'KA', 'KM', 'KO', 'LO', 'LT', 'LV', 'MK', 'MN', 'MS', 'MY', 'NB', 'NE', 'NL', 'false', 'PL', 'PT', 'RO', 'RU', 'SK', 'SL', 'SQ', 'SR', 'SV', 'TL', 'UK', 'VI', 'TE', 'TH', 'TR', 'XX', 'ZH') NOT NULL COMMENT 'We recommend using the CatalogsLocale values.',
  `operation` ENUM('DELETE') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object of catalogs items batch';

--
-- Table structure for table `CatalogsItemsCreateBatchRequest` generated from model 'CatalogsItemsCreateBatchRequest'
-- Request object to create catalogs items
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsCreateBatchRequest` (
  `country` TEXT NOT NULL,
  `items` JSON NOT NULL COMMENT 'Array with catalogs items',
  `language` ENUM('af-ZA', 'ar-SA', 'bg-BG', 'bn-IN', 'cs-CZ', 'da-DK', 'de', 'el-GR', 'en-AU', 'en-CA', 'en-GB', 'en-IN', 'en-US', 'es-419', 'es-AR', 'es-ES', 'es-MX', 'fi-FI', 'fr', 'fr-CA', 'he-IL', 'hi-IN', 'hr-HR', 'hu-HU', 'id-ID', 'it', 'ja', 'ko-KR', 'ms-MY', 'nb-NO', 'nl', 'pl-PL', 'pt-BR', 'pt-PT', 'ro-RO', 'ru-RU', 'sk-SK', 'sv-SE', 'te-IN', 'th-TH', 'tl-PH', 'tr', 'uk-UA', 'vi-VN', 'zh-CN', 'zh-TW', 'AM', 'AR', 'AZ', 'BG', 'BN', 'BS', 'CA', 'CS', 'DA', 'DV', 'DZ', 'DE', 'EL', 'EN', 'ES', 'ET', 'FA', 'FI', 'FR', 'HE', 'HI', 'HR', 'HU', 'HY', 'ID', 'IN', 'IS', 'IT', 'IW', 'JA', 'KA', 'KM', 'KO', 'LO', 'LT', 'LV', 'MK', 'MN', 'MS', 'MY', 'NB', 'NE', 'NL', 'false', 'PL', 'PT', 'RO', 'RU', 'SK', 'SL', 'SQ', 'SR', 'SV', 'TL', 'UK', 'VI', 'TE', 'TH', 'TR', 'XX', 'ZH') NOT NULL COMMENT 'We recommend using the CatalogsLocale values.',
  `operation` ENUM('CREATE') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object to create catalogs items';

--
-- Table structure for table `CatalogsItemsDeleteBatchRequest` generated from model 'CatalogsItemsDeleteBatchRequest'
-- Request object to delete catalogs items
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsDeleteBatchRequest` (
  `country` TEXT NOT NULL,
  `items` JSON NOT NULL COMMENT 'Array with catalogs items',
  `language` ENUM('af-ZA', 'ar-SA', 'bg-BG', 'bn-IN', 'cs-CZ', 'da-DK', 'de', 'el-GR', 'en-AU', 'en-CA', 'en-GB', 'en-IN', 'en-US', 'es-419', 'es-AR', 'es-ES', 'es-MX', 'fi-FI', 'fr', 'fr-CA', 'he-IL', 'hi-IN', 'hr-HR', 'hu-HU', 'id-ID', 'it', 'ja', 'ko-KR', 'ms-MY', 'nb-NO', 'nl', 'pl-PL', 'pt-BR', 'pt-PT', 'ro-RO', 'ru-RU', 'sk-SK', 'sv-SE', 'te-IN', 'th-TH', 'tl-PH', 'tr', 'uk-UA', 'vi-VN', 'zh-CN', 'zh-TW', 'AM', 'AR', 'AZ', 'BG', 'BN', 'BS', 'CA', 'CS', 'DA', 'DV', 'DZ', 'DE', 'EL', 'EN', 'ES', 'ET', 'FA', 'FI', 'FR', 'HE', 'HI', 'HR', 'HU', 'HY', 'ID', 'IN', 'IS', 'IT', 'IW', 'JA', 'KA', 'KM', 'KO', 'LO', 'LT', 'LV', 'MK', 'MN', 'MS', 'MY', 'NB', 'NE', 'NL', 'false', 'PL', 'PT', 'RO', 'RU', 'SK', 'SL', 'SQ', 'SR', 'SV', 'TL', 'UK', 'VI', 'TE', 'TH', 'TR', 'XX', 'ZH') NOT NULL COMMENT 'We recommend using the CatalogsLocale values.',
  `operation` ENUM('DELETE') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object to delete catalogs items';

--
-- Table structure for table `CatalogsItemsDeleteDiscontinuedBatchRequest` generated from model 'CatalogsItemsDeleteDiscontinuedBatchRequest'
-- Request object to discontinue catalogs items
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsDeleteDiscontinuedBatchRequest` (
  `country` TEXT NOT NULL,
  `items` JSON NOT NULL COMMENT 'Array with catalogs items',
  `language` ENUM('af-ZA', 'ar-SA', 'bg-BG', 'bn-IN', 'cs-CZ', 'da-DK', 'de', 'el-GR', 'en-AU', 'en-CA', 'en-GB', 'en-IN', 'en-US', 'es-419', 'es-AR', 'es-ES', 'es-MX', 'fi-FI', 'fr', 'fr-CA', 'he-IL', 'hi-IN', 'hr-HR', 'hu-HU', 'id-ID', 'it', 'ja', 'ko-KR', 'ms-MY', 'nb-NO', 'nl', 'pl-PL', 'pt-BR', 'pt-PT', 'ro-RO', 'ru-RU', 'sk-SK', 'sv-SE', 'te-IN', 'th-TH', 'tl-PH', 'tr', 'uk-UA', 'vi-VN', 'zh-CN', 'zh-TW', 'AM', 'AR', 'AZ', 'BG', 'BN', 'BS', 'CA', 'CS', 'DA', 'DV', 'DZ', 'DE', 'EL', 'EN', 'ES', 'ET', 'FA', 'FI', 'FR', 'HE', 'HI', 'HR', 'HU', 'HY', 'ID', 'IN', 'IS', 'IT', 'IW', 'JA', 'KA', 'KM', 'KO', 'LO', 'LT', 'LV', 'MK', 'MN', 'MS', 'MY', 'NB', 'NE', 'NL', 'false', 'PL', 'PT', 'RO', 'RU', 'SK', 'SL', 'SQ', 'SR', 'SV', 'TL', 'UK', 'VI', 'TE', 'TH', 'TR', 'XX', 'ZH') NOT NULL COMMENT 'We recommend using the CatalogsLocale values.',
  `operation` ENUM('DELETE_DISCONTINUED') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object to discontinue catalogs items';

--
-- Table structure for table `CatalogsItemsPostFilters` generated from model 'CatalogsItemsPostFilters'
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsPostFilters` (
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog',
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `item_ids` JSON NOT NULL,
  `hotel_ids` JSON NOT NULL,
  `creative_assets_ids` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsItemsRequest` generated from model 'CatalogsItemsRequest'
-- Request object of catalogs items
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsRequest` (
  `country` TEXT NOT NULL,
  `filters` TEXT NOT NULL,
  `language` ENUM('af-ZA', 'ar-SA', 'bg-BG', 'bn-IN', 'cs-CZ', 'da-DK', 'de', 'el-GR', 'en-AU', 'en-CA', 'en-GB', 'en-IN', 'en-US', 'es-419', 'es-AR', 'es-ES', 'es-MX', 'fi-FI', 'fr', 'fr-CA', 'he-IL', 'hi-IN', 'hr-HR', 'hu-HU', 'id-ID', 'it', 'ja', 'ko-KR', 'ms-MY', 'nb-NO', 'nl', 'pl-PL', 'pt-BR', 'pt-PT', 'ro-RO', 'ru-RU', 'sk-SK', 'sv-SE', 'te-IN', 'th-TH', 'tl-PH', 'tr', 'uk-UA', 'vi-VN', 'zh-CN', 'zh-TW', 'AM', 'AR', 'AZ', 'BG', 'BN', 'BS', 'CA', 'CS', 'DA', 'DV', 'DZ', 'DE', 'EL', 'EN', 'ES', 'ET', 'FA', 'FI', 'FR', 'HE', 'HI', 'HR', 'HU', 'HY', 'ID', 'IN', 'IS', 'IT', 'IW', 'JA', 'KA', 'KM', 'KO', 'LO', 'LT', 'LV', 'MK', 'MN', 'MS', 'MY', 'NB', 'NE', 'NL', 'false', 'PL', 'PT', 'RO', 'RU', 'SK', 'SL', 'SQ', 'SR', 'SV', 'TL', 'UK', 'VI', 'TE', 'TH', 'TR', 'XX', 'ZH') NOT NULL COMMENT 'We recommend using the CatalogsLocale values.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object of catalogs items';

--
-- Table structure for table `CatalogsItemsUpdateBatchRequest` generated from model 'CatalogsItemsUpdateBatchRequest'
-- Request object to update catalogs items
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsUpdateBatchRequest` (
  `country` TEXT NOT NULL,
  `items` JSON NOT NULL COMMENT 'Array with catalogs items',
  `language` ENUM('af-ZA', 'ar-SA', 'bg-BG', 'bn-IN', 'cs-CZ', 'da-DK', 'de', 'el-GR', 'en-AU', 'en-CA', 'en-GB', 'en-IN', 'en-US', 'es-419', 'es-AR', 'es-ES', 'es-MX', 'fi-FI', 'fr', 'fr-CA', 'he-IL', 'hi-IN', 'hr-HR', 'hu-HU', 'id-ID', 'it', 'ja', 'ko-KR', 'ms-MY', 'nb-NO', 'nl', 'pl-PL', 'pt-BR', 'pt-PT', 'ro-RO', 'ru-RU', 'sk-SK', 'sv-SE', 'te-IN', 'th-TH', 'tl-PH', 'tr', 'uk-UA', 'vi-VN', 'zh-CN', 'zh-TW', 'AM', 'AR', 'AZ', 'BG', 'BN', 'BS', 'CA', 'CS', 'DA', 'DV', 'DZ', 'DE', 'EL', 'EN', 'ES', 'ET', 'FA', 'FI', 'FR', 'HE', 'HI', 'HR', 'HU', 'HY', 'ID', 'IN', 'IS', 'IT', 'IW', 'JA', 'KA', 'KM', 'KO', 'LO', 'LT', 'LV', 'MK', 'MN', 'MS', 'MY', 'NB', 'NE', 'NL', 'false', 'PL', 'PT', 'RO', 'RU', 'SK', 'SL', 'SQ', 'SR', 'SV', 'TL', 'UK', 'VI', 'TE', 'TH', 'TR', 'XX', 'ZH') NOT NULL COMMENT 'We recommend using the CatalogsLocale values.',
  `operation` ENUM('UPDATE') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object to update catalogs items';

--
-- Table structure for table `CatalogsItemsUpsertBatchRequest` generated from model 'CatalogsItemsUpsertBatchRequest'
-- Request object to upsert catalogs items
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsUpsertBatchRequest` (
  `country` TEXT NOT NULL,
  `items` JSON NOT NULL COMMENT 'Array with catalogs items',
  `language` ENUM('af-ZA', 'ar-SA', 'bg-BG', 'bn-IN', 'cs-CZ', 'da-DK', 'de', 'el-GR', 'en-AU', 'en-CA', 'en-GB', 'en-IN', 'en-US', 'es-419', 'es-AR', 'es-ES', 'es-MX', 'fi-FI', 'fr', 'fr-CA', 'he-IL', 'hi-IN', 'hr-HR', 'hu-HU', 'id-ID', 'it', 'ja', 'ko-KR', 'ms-MY', 'nb-NO', 'nl', 'pl-PL', 'pt-BR', 'pt-PT', 'ro-RO', 'ru-RU', 'sk-SK', 'sv-SE', 'te-IN', 'th-TH', 'tl-PH', 'tr', 'uk-UA', 'vi-VN', 'zh-CN', 'zh-TW', 'AM', 'AR', 'AZ', 'BG', 'BN', 'BS', 'CA', 'CS', 'DA', 'DV', 'DZ', 'DE', 'EL', 'EN', 'ES', 'ET', 'FA', 'FI', 'FR', 'HE', 'HI', 'HR', 'HU', 'HY', 'ID', 'IN', 'IS', 'IT', 'IW', 'JA', 'KA', 'KM', 'KO', 'LO', 'LT', 'LV', 'MK', 'MN', 'MS', 'MY', 'NB', 'NE', 'NL', 'false', 'PL', 'PT', 'RO', 'RU', 'SK', 'SL', 'SQ', 'SR', 'SV', 'TL', 'UK', 'VI', 'TE', 'TH', 'TR', 'XX', 'ZH') NOT NULL COMMENT 'We recommend using the CatalogsLocale values.',
  `operation` ENUM('UPSERT') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object to upsert catalogs items';

--
-- Table structure for table `catalogs_list_200_response` generated from model 'catalogsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `catalogs_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsListProductsByFeedBasedFilter` generated from model 'CatalogsListProductsByFeedBasedFilter'
-- Request object to list products for a given feed_id and product group filter.
--

CREATE TABLE IF NOT EXISTS `CatalogsListProductsByFeedBasedFilter` (
  `feed_id` TEXT NOT NULL COMMENT 'Catalog Feed id pertaining to the catalog product group filter.',
  `filters` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object to list products for a given feed_id and product group filter.';

--
-- Table structure for table `CatalogsListProductsByFilterRequest` generated from model 'CatalogsListProductsByFilterRequest'
-- Request object to list products for a given product group filter.
--

CREATE TABLE IF NOT EXISTS `CatalogsListProductsByFilterRequest` (
  `feed_id` TEXT NOT NULL COMMENT 'Catalog Feed id pertaining to the catalog product group filter.',
  `filters` TEXT NOT NULL,
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog ID pertaining to the product group.',
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `country` TEXT NOT NULL,
  `locale` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object to list products for a given product group filter.';

--
-- Table structure for table `catalogs_local_stores_create_200_response_inner` generated from model 'catalogsUnderscorelocalUnderscorestoresUnderscorecreateUnderscore200UnderscoreresponseUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `catalogs_local_stores_create_200_response_inner` (
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `catalogs_local_stores_create_200_response_inner_data` generated from model 'catalogsUnderscorelocalUnderscorestoresUnderscorecreateUnderscore200UnderscoreresponseUnderscoreinnerUnderscoredata'
-- Created/updated resource on success or error details on failure
--

CREATE TABLE IF NOT EXISTS `catalogs_local_stores_create_200_response_inner_data` (
  `address_primary` TEXT DEFAULT NULL COMMENT 'Primary address line of the store.',
  `address_secondary` TEXT DEFAULT NULL COMMENT 'Secondary address line of the store.',
  `city` TEXT DEFAULT NULL COMMENT 'City where the store is located.',
  `country` TEXT NOT NULL COMMENT 'Country code where the store is located.',
  `created_at` DATETIME NOT NULL COMMENT 'Creation timestamp',
  `id` TEXT NOT NULL COMMENT 'The ID of the local store.',
  `latitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Geographic latitude coordinate of the store.',
  `longitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Geographic longitude coordinate of the store.',
  `name` TEXT NOT NULL COMMENT 'The name of the local store.',
  `postal_code` TEXT DEFAULT NULL COMMENT 'Postal or ZIP code of the store.',
  `region` TEXT DEFAULT NULL COMMENT 'State or region code where the store is located.',
  `store_code` TEXT NOT NULL COMMENT 'Merchant provided code for the local store. Unique within the merchant&#39;s catalog.',
  `updated_at` DATETIME NOT NULL COMMENT 'Last update timestamp',
  `exceptions` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Created/updated resource on success or error details on failure';

--
-- Table structure for table `catalogs_local_stores_create_200_response_inner_data_oneOf` generated from model 'catalogsUnderscorelocalUnderscorestoresUnderscorecreateUnderscore200UnderscoreresponseUnderscoreinnerUnderscoredataUnderscoreoneOf'
--

CREATE TABLE IF NOT EXISTS `catalogs_local_stores_create_200_response_inner_data_oneOf` (
  `id` TEXT NOT NULL COMMENT 'The ID of the local store.',
  `exceptions` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `catalogs_local_stores_delete_200_response_inner` generated from model 'catalogsUnderscorelocalUnderscorestoresUnderscoredeleteUnderscore200UnderscoreresponseUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `catalogs_local_stores_delete_200_response_inner` (
  `id` TEXT NOT NULL COMMENT 'The ID of the local store.',
  `status` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `catalogs_local_stores_list_200_response` generated from model 'catalogsUnderscorelocalUnderscorestoresUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `catalogs_local_stores_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProduct` generated from model 'CatalogsProduct'
--

CREATE TABLE IF NOT EXISTS `CatalogsProduct` (
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `metadata` TEXT NOT NULL,
  `pin` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupCreateRequest` generated from model 'CatalogsProductGroupCreateRequest'
-- Request object for creating a product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupCreateRequest` (
  `description` TEXT DEFAULT NULL,
  `feed_id` TEXT NOT NULL COMMENT 'Catalog Feed id pertaining to the catalog product group.',
  `filters` TEXT NOT NULL,
  `is_featured` TINYINT(1) DEFAULT NULL COMMENT 'boolean indicator of whether the product group is being featured or not',
  `name` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for creating a product group.';

--
-- Table structure for table `CatalogsProductGroupCurrencyCriteria` generated from model 'CatalogsProductGroupCurrencyCriteria'
-- A currency filter. This filter cannot be negated
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupCurrencyCriteria` (
  `negated` TINYINT(1) DEFAULT NULL,
  `values` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A currency filter. This filter cannot be negated';

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
  `MEDIA_TYPE` TEXT NOT NULL,
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
  `GOOGLE_PRODUCT_CATEGORY_0` TEXT NOT NULL,
  `CUSTOM_NUMBER_0` TEXT NOT NULL,
  `CUSTOM_NUMBER_1` TEXT NOT NULL,
  `CUSTOM_NUMBER_2` TEXT NOT NULL,
  `CUSTOM_NUMBER_3` TEXT NOT NULL,
  `CUSTOM_NUMBER_4` TEXT NOT NULL,
  `TITLE_KEYWORDS` TEXT NOT NULL,
  `PINTEREST_PRODUCT_CATEGORIES` TEXT NOT NULL,
  `PRODUCT_GROUP` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupFilterOperatorTypeCriteria` generated from model 'CatalogsProductGroupFilterOperatorTypeCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFilterOperatorTypeCriteria` (
  `filter_operator_type` TEXT DEFAULT NULL,
  `negated` TINYINT(1) DEFAULT NULL,
  `values` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupFilters` generated from model 'CatalogsProductGroupFilters'
-- Object holding a group of filters for a catalog product group
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFilters` (
  `any_of` JSON NOT NULL,
  `all_of` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object holding a group of filters for a catalog product group';

--
-- Table structure for table `CatalogsProductGroupFiltersAllOf` generated from model 'CatalogsProductGroupFiltersAllOf'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersAllOf` (
  `all_of` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupFiltersAnyOf` generated from model 'CatalogsProductGroupFiltersAnyOf'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersAnyOf` (
  `any_of` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupFiltersRequest` generated from model 'CatalogsProductGroupFiltersRequest'
-- Object holding a group of filters for request on catalog product group.  This is a distinct schema. It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersRequest` (
  `any_of` JSON NOT NULL,
  `all_of` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object holding a group of filters for request on catalog product group.  This is a distinct schema. It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.';

--
-- Table structure for table `CatalogsProductGroupFiltersRequestAnyOfItems0` generated from model 'CatalogsProductGroupFiltersRequestAnyOfItems0'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersRequestAnyOfItems0` (
  `any_of` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupFiltersRequestAnyOfItems1` generated from model 'CatalogsProductGroupFiltersRequestAnyOfItems1'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersRequestAnyOfItems1` (
  `all_of` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupMultipleCountriesCriteria` generated from model 'CatalogsProductGroupMultipleCountriesCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleCountriesCriteria` (
  `negated` TINYINT(1) DEFAULT NULL,
  `values` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupMultipleGenderCriteria` generated from model 'CatalogsProductGroupMultipleGenderCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleGenderCriteria` (
  `negated` TINYINT(1) DEFAULT NULL,
  `values` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupMultipleMediaTypesCriteria` generated from model 'CatalogsProductGroupMultipleMediaTypesCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleMediaTypesCriteria` (
  `negated` TINYINT(1) DEFAULT NULL,
  `values` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupMultiplePinterestProductCategoryCriteria` generated from model 'CatalogsProductGroupMultiplePinterestProductCategoryCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultiplePinterestProductCategoryCriteria` (
  `negated` TINYINT(1) DEFAULT NULL,
  `values` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupMultipleStringCriteria` generated from model 'CatalogsProductGroupMultipleStringCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleStringCriteria` (
  `negated` TINYINT(1) DEFAULT NULL,
  `values` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupMultipleStringListCriteria` generated from model 'CatalogsProductGroupMultipleStringListCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleStringListCriteria` (
  `negated` TINYINT(1) DEFAULT NULL,
  `values` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `catalogs_product_group_pins_list_200_response` generated from model 'catalogsUnderscoreproductUnderscoregroupUnderscorepinsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `catalogs_product_group_pins_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupPricingCriteria` generated from model 'CatalogsProductGroupPricingCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupPricingCriteria` (
  `inclusion` TINYINT(1) DEFAULT true,
  `negated` TINYINT(1) DEFAULT NULL,
  `values` DECIMAL(20, 9) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupProductCountsVertical` generated from model 'CatalogsProductGroupProductCountsVertical'
-- Product counts for a CatalogsProductGroup
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupProductCountsVertical` (
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `in_stock` DECIMAL(20, 9) UNSIGNED NOT NULL,
  `out_of_stock` DECIMAL(20, 9) UNSIGNED NOT NULL,
  `preorder` DECIMAL(20, 9) UNSIGNED NOT NULL,
  `total` DECIMAL(20, 9) UNSIGNED NOT NULL,
  `videos` DECIMAL(20, 9) UNSIGNED NOT NULL,
  `app_links` DECIMAL(20, 9) UNSIGNED NOT NULL,
  `images` DECIMAL(20, 9) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Product counts for a CatalogsProductGroup';

--
-- Table structure for table `CatalogsProductGroupUint32Criteria` generated from model 'CatalogsProductGroupUint32Criteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupUint32Criteria` (
  `negated` TINYINT(1) DEFAULT NULL,
  `operator` TEXT NOT NULL,
  `value` INT UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupUpdateManyRequestItemsOneOfItems0` generated from model 'CatalogsProductGroupUpdateManyRequestItemsOneOfItems0'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupUpdateManyRequestItemsOneOfItems0` (
  `description` TEXT DEFAULT NULL,
  `filters` TEXT DEFAULT NULL,
  `is_featured` TINYINT(1) DEFAULT NULL COMMENT 'boolean indicator of whether the product group is being featured or not',
  `name` TEXT DEFAULT NULL,
  `id` TEXT NOT NULL COMMENT 'ID of the product group.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupUpdateRequest` generated from model 'CatalogsProductGroupUpdateRequest'
-- Request object for updating a product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupUpdateRequest` (
  `description` TEXT DEFAULT NULL,
  `filters` TEXT DEFAULT NULL,
  `is_featured` TINYINT(1) DEFAULT NULL COMMENT 'boolean indicator of whether the product group is being featured or not',
  `name` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for updating a product group.';

--
-- Table structure for table `CatalogsProductGroupsCreateManyRequestItems` generated from model 'CatalogsProductGroupsCreateManyRequestItems'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupsCreateManyRequestItems` (
  `description` TEXT DEFAULT NULL,
  `feed_id` TEXT NOT NULL COMMENT 'Catalog Feed id pertaining to the catalog product group.',
  `filters` TEXT NOT NULL,
  `is_featured` TINYINT(1) DEFAULT NULL COMMENT 'boolean indicator of whether the product group is being featured or not',
  `name` TEXT NOT NULL,
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog ID pertaining to the product group.',
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `country` TEXT DEFAULT NULL,
  `locale` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupsCreateRequestSchema` generated from model 'CatalogsProductGroupsCreateRequestSchema'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupsCreateRequestSchema` (
  `description` TEXT DEFAULT NULL,
  `feed_id` TEXT NOT NULL COMMENT 'Catalog Feed id pertaining to the catalog product group.',
  `filters` TEXT NOT NULL,
  `is_featured` TINYINT(1) DEFAULT NULL COMMENT 'boolean indicator of whether the product group is being featured or not',
  `name` TEXT NOT NULL,
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog ID pertaining to the product group.',
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `country` TEXT DEFAULT NULL,
  `locale` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `catalogs_product_groups_list_200_response` generated from model 'catalogsUnderscoreproductUnderscoregroupsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `catalogs_product_groups_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupsUpdateRequestSchema` generated from model 'CatalogsProductGroupsUpdateRequestSchema'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupsUpdateRequestSchema` (
  `description` TEXT DEFAULT NULL,
  `filters` TEXT DEFAULT NULL,
  `is_featured` TINYINT(1) DEFAULT NULL COMMENT 'boolean indicator of whether the product group is being featured or not',
  `name` TEXT DEFAULT NULL COMMENT 'Name of catalog product group',
  `catalog_type` ENUM('CREATIVE_ASSETS') DEFAULT NULL,
  `country` TEXT DEFAULT NULL,
  `locale` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsReport` generated from model 'CatalogsReport'
--

CREATE TABLE IF NOT EXISTS `CatalogsReport` (
  `report_status` ENUM('FINISHED', 'IN_PROGRESS') DEFAULT NULL,
  `size` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Size of the report in bytes',
  `url` TEXT DEFAULT NULL COMMENT 'URL to download the report'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsReportDistributionIssueFilter` generated from model 'CatalogsReportDistributionIssueFilter'
--

CREATE TABLE IF NOT EXISTS `CatalogsReportDistributionIssueFilter` (
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a catalog. If not given, oldest catalog will be used',
  `report_type` ENUM('DISTRIBUTION_ISSUES') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsReportDistributionStats` generated from model 'CatalogsReportDistributionStats'
--

CREATE TABLE IF NOT EXISTS `CatalogsReportDistributionStats` (
  `catalog_id` TEXT DEFAULT NULL COMMENT 'ID of the catalog entity.',
  `code` INT DEFAULT NULL COMMENT 'The event code that a diagnostics aggregated number references',
  `code_label` TEXT DEFAULT NULL COMMENT 'A human-friendly label for the event code (e.g, &#39;SPAM&#39;)',
  `ineligible_for_ads` TINYINT(1) DEFAULT NULL COMMENT 'Indicates if issue makes items ineligible for ads distribution',
  `ineligible_for_organic` TINYINT(1) DEFAULT NULL COMMENT 'Indicates if issue makes items ineligible for organic distribution',
  `message` TEXT DEFAULT NULL COMMENT 'Title message describing the diagnostic issue',
  `occurrences` INT DEFAULT NULL COMMENT 'Number of occurrences of the issue',
  `report_type` ENUM('DISTRIBUTION_ISSUES') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsReportFeedIngestionFilter` generated from model 'CatalogsReportFeedIngestionFilter'
--

CREATE TABLE IF NOT EXISTS `CatalogsReportFeedIngestionFilter` (
  `feed_id` TEXT NOT NULL COMMENT 'ID of the feed entity.',
  `processing_result_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.',
  `report_type` ENUM('FEED_INGESTION_ISSUES') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsReportFeedIngestionStats` generated from model 'CatalogsReportFeedIngestionStats'
--

CREATE TABLE IF NOT EXISTS `CatalogsReportFeedIngestionStats` (
  `catalog_id` TEXT DEFAULT NULL COMMENT 'ID of the catalog entity.',
  `code` INT DEFAULT NULL COMMENT 'The event code that a diagnostics aggregated number references',
  `code_label` TEXT DEFAULT NULL COMMENT 'A human-friendly label for the event code (e.g, &#39;AVAILABILITY_INVALID&#39;)',
  `message` TEXT DEFAULT NULL COMMENT 'Title message describing the diagnostic issue',
  `occurrences` INT DEFAULT NULL COMMENT 'Number of occurrences of the issue',
  `report_type` ENUM('FEED_INGESTION_ISSUES') DEFAULT NULL,
  `severity` ENUM('WARN', 'ERROR') DEFAULT NULL COMMENT 'An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsReportParameters` generated from model 'CatalogsReportParameters'
-- Report parameters
--

CREATE TABLE IF NOT EXISTS `CatalogsReportParameters` (
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `report` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Report parameters';

--
-- Table structure for table `CatalogsReportStats` generated from model 'CatalogsReportStats'
-- Diagnostics aggregated numbers
--

CREATE TABLE IF NOT EXISTS `CatalogsReportStats` (
  `catalog_id` TEXT DEFAULT NULL COMMENT 'ID of the catalog entity.',
  `code` INT DEFAULT NULL COMMENT 'The event code that a diagnostics aggregated number references',
  `code_label` TEXT DEFAULT NULL COMMENT 'A human-friendly label for the event code (e.g, &#39;SPAM&#39;)',
  `message` TEXT DEFAULT NULL COMMENT 'Title message describing the diagnostic issue',
  `occurrences` INT DEFAULT NULL COMMENT 'Number of occurrences of the issue',
  `report_type` ENUM('DISTRIBUTION_ISSUES') DEFAULT NULL,
  `severity` ENUM('WARN', 'ERROR') DEFAULT NULL COMMENT 'An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue',
  `ineligible_for_ads` TINYINT(1) DEFAULT NULL COMMENT 'Indicates if issue makes items ineligible for ads distribution',
  `ineligible_for_organic` TINYINT(1) DEFAULT NULL COMMENT 'Indicates if issue makes items ineligible for organic distribution'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Diagnostics aggregated numbers';

--
-- Table structure for table `CatalogsReportStatsParameters` generated from model 'CatalogsReportStatsParameters'
-- Report stats parameters
--

CREATE TABLE IF NOT EXISTS `CatalogsReportStatsParameters` (
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `report` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Report stats parameters';

--
-- Table structure for table `CatalogsRetailAvailableFilterValues` generated from model 'CatalogsRetailAvailableFilterValues'
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailAvailableFilterValues` (
  `catalog_type` ENUM('RETAIL') NOT NULL,
  `filter_values` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsRetailBatchRequest` generated from model 'CatalogsRetailBatchRequest'
-- A request object that can have multiple operations on a single retail batch
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailBatchRequest` (
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog',
  `catalog_type` ENUM('RETAIL') NOT NULL,
  `country` TEXT NOT NULL,
  `items` JSON NOT NULL COMMENT 'Array with catalogs item operations',
  `language` ENUM('af-ZA', 'ar-SA', 'bg-BG', 'bn-IN', 'cs-CZ', 'da-DK', 'de', 'el-GR', 'en-AU', 'en-CA', 'en-GB', 'en-IN', 'en-US', 'es-419', 'es-AR', 'es-ES', 'es-MX', 'fi-FI', 'fr', 'fr-CA', 'he-IL', 'hi-IN', 'hr-HR', 'hu-HU', 'id-ID', 'it', 'ja', 'ko-KR', 'ms-MY', 'nb-NO', 'nl', 'pl-PL', 'pt-BR', 'pt-PT', 'ro-RO', 'ru-RU', 'sk-SK', 'sv-SE', 'te-IN', 'th-TH', 'tl-PH', 'tr', 'uk-UA', 'vi-VN', 'zh-CN', 'zh-TW', 'AM', 'AR', 'AZ', 'BG', 'BN', 'BS', 'CA', 'CS', 'DA', 'DV', 'DZ', 'DE', 'EL', 'EN', 'ES', 'ET', 'FA', 'FI', 'FR', 'HE', 'HI', 'HR', 'HU', 'HY', 'ID', 'IN', 'IS', 'IT', 'IW', 'JA', 'KA', 'KM', 'KO', 'LO', 'LT', 'LV', 'MK', 'MN', 'MS', 'MY', 'NB', 'NE', 'NL', 'false', 'PL', 'PT', 'RO', 'RU', 'SK', 'SL', 'SQ', 'SR', 'SV', 'TL', 'UK', 'VI', 'TE', 'TH', 'TR', 'XX', 'ZH') NOT NULL COMMENT 'We recommend using the CatalogsLocale values.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A request object that can have multiple operations on a single retail batch';

--
-- Table structure for table `CatalogsRetailBatchRequestItemsItems` generated from model 'CatalogsRetailBatchRequestItemsItems'
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailBatchRequestItemsItems` (
  `attributes` TEXT NOT NULL,
  `item_id` TEXT NOT NULL COMMENT 'The catalog item id in the merchant namespace',
  `operation` ENUM('DELETE') NOT NULL,
  `update_mask` JSON DEFAULT NULL COMMENT 'The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.',
  `last_updated_time` BIGINT DEFAULT NULL COMMENT 'The millisecond timestamp when the item was lastly modified by the merchant.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsRetailFeed` generated from model 'CatalogsRetailFeed'
-- Catalogs Retail Feed object
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailFeed` (
  `catalog_type` ENUM('RETAIL') NOT NULL,
  `created_at` DATETIME NOT NULL,
  `credentials` TEXT DEFAULT NULL,
  `default_availability` TEXT DEFAULT NULL,
  `default_country` TEXT NOT NULL,
  `default_currency` TEXT DEFAULT NULL,
  `default_locale` TEXT NOT NULL COMMENT 'The locale used within a feed for product descriptions.',
  `format` TEXT NOT NULL,
  `id` TEXT NOT NULL COMMENT 'ID of the feed entity.',
  `location` TEXT NOT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `status` TEXT NOT NULL,
  `updated_at` DATETIME NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Catalogs Retail Feed object';

--
-- Table structure for table `CatalogsRetailFeedsCreateRequest` generated from model 'CatalogsRetailFeedsCreateRequest'
-- Request object for creating a retail feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailFeedsCreateRequest` (
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.',
  `catalog_type` ENUM('RETAIL') NOT NULL,
  `credentials` TEXT DEFAULT NULL,
  `default_availability` TEXT DEFAULT NULL,
  `default_country` TEXT NOT NULL,
  `default_currency` TEXT DEFAULT NULL,
  `default_locale` TEXT NOT NULL,
  `format` TEXT NOT NULL,
  `location` TEXT NOT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `status` TEXT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for creating a retail feed.';

--
-- Table structure for table `CatalogsRetailFeedsUpdateRequest` generated from model 'CatalogsRetailFeedsUpdateRequest'
-- Request object for updating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailFeedsUpdateRequest` (
  `catalog_type` ENUM('RETAIL') NOT NULL,
  `credentials` TEXT DEFAULT NULL,
  `default_availability` TEXT DEFAULT NULL,
  `default_currency` TEXT DEFAULT NULL,
  `format` TEXT DEFAULT NULL,
  `location` TEXT DEFAULT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `name` TEXT DEFAULT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for updating a feed.';

--
-- Table structure for table `CatalogsRetailFilterValuesMap` generated from model 'CatalogsRetailFilterValuesMap'
-- A map of filter attributes to their available values.
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMap` (
  `ad_image_tags` JSON DEFAULT NULL,
  `ad_video_tags` JSON DEFAULT NULL,
  `availability` JSON DEFAULT NULL,
  `brand` JSON DEFAULT NULL,
  `condition` JSON DEFAULT NULL,
  `custom_label_0` JSON DEFAULT NULL,
  `custom_label_1` JSON DEFAULT NULL,
  `custom_label_2` JSON DEFAULT NULL,
  `custom_label_3` JSON DEFAULT NULL,
  `custom_label_4` JSON DEFAULT NULL,
  `gender` JSON DEFAULT NULL,
  `google_product_category_0` JSON DEFAULT NULL,
  `google_product_category_1` JSON DEFAULT NULL,
  `google_product_category_2` JSON DEFAULT NULL,
  `google_product_category_3` JSON DEFAULT NULL,
  `google_product_category_4` JSON DEFAULT NULL,
  `google_product_category_5` JSON DEFAULT NULL,
  `google_product_category_6` JSON DEFAULT NULL,
  `media_type` JSON DEFAULT NULL,
  `product_type_0` JSON DEFAULT NULL,
  `product_type_1` JSON DEFAULT NULL,
  `product_type_2` JSON DEFAULT NULL,
  `product_type_3` JSON DEFAULT NULL,
  `product_type_4` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A map of filter attributes to their available values.';

--
-- Table structure for table `CatalogsRetailItemErrorResponse` generated from model 'CatalogsRetailItemErrorResponse'
-- Object describing a retail item error
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailItemErrorResponse` (
  `catalog_type` ENUM('RETAIL') NOT NULL,
  `errors` JSON NOT NULL COMMENT 'Array with the errors for the item id requested',
  `item_id` TEXT DEFAULT NULL COMMENT 'The catalog item id in the merchant namespace',
  `item_response_kind` ENUM('retail_item_error') NOT NULL COMMENT 'Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing a retail item error';

--
-- Table structure for table `CatalogsRetailItemResponse` generated from model 'CatalogsRetailItemResponse'
-- Object describing a retail item record
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailItemResponse` (
  `attributes` TEXT DEFAULT NULL,
  `catalog_type` ENUM('RETAIL') NOT NULL,
  `item_id` TEXT DEFAULT NULL COMMENT 'The catalog retail item id in the merchant namespace',
  `item_response_kind` ENUM('retail_item') NOT NULL COMMENT 'Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.',
  `pins` JSON DEFAULT NULL COMMENT 'The pins mapped to the item'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing a retail item record';

--
-- Table structure for table `CatalogsRetailItemsBatch` generated from model 'CatalogsRetailItemsBatch'
-- Object describing the catalogs retail items batch
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailItemsBatch` (
  `batch_id` TEXT DEFAULT NULL COMMENT 'Id of the catalogs items batch',
  `catalog_type` ENUM('RETAIL') NOT NULL,
  `completed_time` DATETIME DEFAULT NULL COMMENT 'Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss',
  `created_time` DATETIME NOT NULL COMMENT 'Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion.',
  `items` JSON DEFAULT NULL COMMENT 'Array with the catalogs items processing records part of the catalogs items batch',
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing the catalogs retail items batch';

--
-- Table structure for table `CatalogsRetailItemsPostFilter` generated from model 'CatalogsRetailItemsPostFilter'
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailItemsPostFilter` (
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog',
  `catalog_type` ENUM('RETAIL') NOT NULL,
  `item_ids` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsRetailListProductsByCatalogBasedFilterRequest` generated from model 'CatalogsRetailListProductsByCatalogBasedFilterRequest'
-- Request object to list products for a given retail catalog_id and product group filter.
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailListProductsByCatalogBasedFilterRequest` (
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog ID pertaining to the product group.',
  `catalog_type` ENUM('RETAIL') NOT NULL COMMENT 'Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.',
  `country` TEXT NOT NULL,
  `filters` TEXT NOT NULL,
  `locale` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object to list products for a given retail catalog_id and product group filter.';

--
-- Table structure for table `CatalogsRetailProduct` generated from model 'CatalogsRetailProduct'
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailProduct` (
  `catalog_type` ENUM('RETAIL') NOT NULL,
  `metadata` TEXT NOT NULL,
  `pin` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsRetailProductGroup` generated from model 'CatalogsRetailProductGroup'
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailProductGroup` (
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog ID pertaining to the product group.',
  `catalog_type` ENUM('RETAIL') NOT NULL,
  `country` TEXT DEFAULT NULL,
  `created_at` INT DEFAULT NULL COMMENT 'Unix timestamp in seconds of when catalog product group was created.',
  `description` TEXT DEFAULT NULL,
  `feed_id` TEXT NOT NULL COMMENT 'id of the catalogs feed belonging to this catalog product group',
  `filters` TEXT NOT NULL,
  `id` TEXT NOT NULL COMMENT 'ID of the catalog product group.',
  `is_featured` TINYINT(1) DEFAULT NULL COMMENT 'boolean indicator of whether the product group is being featured or not',
  `locale` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'Name of catalog product group',
  `status` TEXT DEFAULT NULL,
  `type` TEXT NOT NULL,
  `updated_at` INT DEFAULT NULL COMMENT 'Unix timestamp in seconds of last time catalog product group was updated.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsRetailProductGroupCreateRequest` generated from model 'CatalogsRetailProductGroupCreateRequest'
-- Request object for creating a product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailProductGroupCreateRequest` (
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog ID pertaining to the product group.',
  `catalog_type` ENUM('RETAIL') NOT NULL COMMENT 'Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.',
  `country` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `filters` TEXT NOT NULL,
  `locale` TEXT DEFAULT NULL,
  `name` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for creating a product group.';

--
-- Table structure for table `CatalogsRetailProductGroupProductCounts` generated from model 'CatalogsRetailProductGroupProductCounts'
-- Product counts for a Retail CatalogsProductGroup
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailProductGroupProductCounts` (
  `catalog_type` ENUM('RETAIL') NOT NULL,
  `in_stock` DECIMAL(20, 9) UNSIGNED NOT NULL,
  `out_of_stock` DECIMAL(20, 9) UNSIGNED NOT NULL,
  `preorder` DECIMAL(20, 9) UNSIGNED NOT NULL,
  `total` DECIMAL(20, 9) UNSIGNED NOT NULL,
  `videos` DECIMAL(20, 9) UNSIGNED DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Product counts for a Retail CatalogsProductGroup';

--
-- Table structure for table `CatalogsRetailProductGroupUpdateRequest` generated from model 'CatalogsRetailProductGroupUpdateRequest'
-- Request object for updating a retail product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailProductGroupUpdateRequest` (
  `catalog_type` ENUM('RETAIL') DEFAULT NULL COMMENT 'Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.',
  `country` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `filters` TEXT DEFAULT NULL,
  `locale` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'Name of catalog product group'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for updating a retail product group.';

--
-- Table structure for table `CatalogsRetailProductMetadata` generated from model 'CatalogsRetailProductMetadata'
-- Retail product metadata entity
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailProductMetadata` (
  `availability` TEXT NOT NULL,
  `currency` TEXT NOT NULL,
  `item_group_id` TEXT NOT NULL COMMENT 'The parent ID of the product.',
  `item_id` TEXT NOT NULL COMMENT 'The user-created unique ID that represents the product.',
  `price` DECIMAL(20, 9) NOT NULL COMMENT 'The price of the product.',
  `sale_price` DECIMAL(20, 9) NOT NULL COMMENT 'The discounted price of the product.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Retail product metadata entity';

--
-- Table structure for table `CatalogsRetailReportAllItemsFilter` generated from model 'CatalogsRetailReportAllItemsFilter'
-- ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailReportAllItemsFilter` (
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a catalog. If not given, oldest catalog will be used',
  `product_group_id` TEXT DEFAULT NULL COMMENT 'Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.',
  `report_type` ENUM('ALL_ITEMS') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.';

--
-- Table structure for table `CatalogsRetailReportParameters` generated from model 'CatalogsRetailReportParameters'
-- Parameters for retail report
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailReportParameters` (
  `catalog_type` ENUM('RETAIL') NOT NULL,
  `report` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Parameters for retail report';

--
-- Table structure for table `CatalogsRetailReportParametersReport` generated from model 'CatalogsRetailReportParametersReport'
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailReportParametersReport` (
  `feed_id` TEXT NOT NULL COMMENT 'ID of the feed entity.',
  `processing_result_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.',
  `report_type` ENUM('ALL_ITEMS') NOT NULL,
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a catalog. If not given, oldest catalog will be used',
  `product_group_id` TEXT DEFAULT NULL COMMENT 'Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsRetailReportStatsParameters` generated from model 'CatalogsRetailReportStatsParameters'
-- Parameters for retail report
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailReportStatsParameters` (
  `catalog_type` ENUM('RETAIL') NOT NULL,
  `report` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Parameters for retail report';

--
-- Table structure for table `CatalogsRetailReportStatsParametersReport` generated from model 'CatalogsRetailReportStatsParametersReport'
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailReportStatsParametersReport` (
  `feed_id` TEXT NOT NULL COMMENT 'ID of the feed entity.',
  `processing_result_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.',
  `report_type` ENUM('DISTRIBUTION_ISSUES') NOT NULL,
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a catalog. If not given, oldest catalog will be used'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsUpdatableCreativeAssetsAttributes` generated from model 'CatalogsUpdatableCreativeAssetsAttributes'
--

CREATE TABLE IF NOT EXISTS `CatalogsUpdatableCreativeAssetsAttributes` (
  `android_deep_link` TEXT DEFAULT NULL COMMENT 'Link to the creative assets page.',
  `custom_label_0` TEXT DEFAULT NULL COMMENT 'Custom grouping of creative assets.',
  `custom_label_1` TEXT DEFAULT NULL COMMENT 'Custom grouping of creative assets.',
  `custom_label_2` TEXT DEFAULT NULL COMMENT 'Custom grouping of creative assets.',
  `custom_label_3` TEXT DEFAULT NULL COMMENT 'Custom grouping of creative assets.',
  `custom_label_4` TEXT DEFAULT NULL COMMENT 'Custom grouping of creative assets.',
  `description` TEXT DEFAULT NULL COMMENT 'Brief description of the creative assets.',
  `google_product_category` TEXT DEFAULT NULL COMMENT 'The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.',
  `ios_deep_link` TEXT DEFAULT NULL COMMENT 'IOS deep link to the creative assets page.',
  `link` TEXT DEFAULT NULL COMMENT 'Link to the creative assets page.',
  `title` TEXT DEFAULT NULL COMMENT 'The name of the creative assets.',
  `visibility` TEXT DEFAULT NULL COMMENT 'Visibility of the creative assets. Must be one of the following values (upper or lowercase): &#39;visible&#39;, &#39;hidden&#39;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsUpdatableHotelAttributes` generated from model 'CatalogsUpdatableHotelAttributes'
--

CREATE TABLE IF NOT EXISTS `CatalogsUpdatableHotelAttributes` (
  `address` TEXT DEFAULT NULL COMMENT 'Hotel address',
  `base_price` TEXT DEFAULT NULL COMMENT 'Base price of the hotel room per night followed by the ISO currency code',
  `brand` TEXT DEFAULT NULL COMMENT 'The brand to which this hotel belongs to.',
  `category` TEXT DEFAULT NULL COMMENT 'The type of property. The category can be any type of internal description desired.',
  `custom_label_0` TEXT DEFAULT NULL COMMENT 'Custom grouping of hotels',
  `custom_label_1` TEXT DEFAULT NULL COMMENT 'Custom grouping of hotels',
  `custom_label_2` TEXT DEFAULT NULL COMMENT 'Custom grouping of hotels',
  `custom_label_3` TEXT DEFAULT NULL COMMENT 'Custom grouping of hotels',
  `custom_label_4` TEXT DEFAULT NULL COMMENT 'Custom grouping of hotels',
  `description` TEXT DEFAULT NULL COMMENT 'Brief description of the hotel.',
  `guest_ratings` TEXT DEFAULT NULL COMMENT 'If specified, you must provide all properties',
  `latitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Latitude of the hotel.',
  `link` TEXT DEFAULT NULL COMMENT 'Link to the product page',
  `longitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Longitude of the hotel.',
  `name` TEXT DEFAULT NULL COMMENT 'The hotel&#39;s name.',
  `neighborhood` JSON DEFAULT NULL COMMENT 'A list of neighborhoods where the hotel is located',
  `sale_price` TEXT DEFAULT NULL COMMENT 'Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsUpdateCreativeAssetsItem` generated from model 'CatalogsUpdateCreativeAssetsItem'
-- A creative assets item to be updated.
--

CREATE TABLE IF NOT EXISTS `CatalogsUpdateCreativeAssetsItem` (
  `attributes` TEXT NOT NULL,
  `creative_assets_id` TEXT NOT NULL COMMENT 'The catalog creative assets item id in the merchant namespace',
  `operation` ENUM('UPDATE') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A creative assets item to be updated.';

--
-- Table structure for table `CatalogsUpdateHotelItem` generated from model 'CatalogsUpdateHotelItem'
-- Object describing an hotel item batch record
--

CREATE TABLE IF NOT EXISTS `CatalogsUpdateHotelItem` (
  `attributes` TEXT NOT NULL,
  `hotel_id` TEXT NOT NULL COMMENT 'The catalog hotel item id in the merchant namespace',
  `operation` ENUM('UPDATE') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an hotel item batch record';

--
-- Table structure for table `CatalogsUpdateRetailItem` generated from model 'CatalogsUpdateRetailItem'
-- An item to be updated
--

CREATE TABLE IF NOT EXISTS `CatalogsUpdateRetailItem` (
  `attributes` TEXT NOT NULL,
  `item_id` TEXT NOT NULL COMMENT 'The catalog item id in the merchant namespace',
  `operation` ENUM('UPDATE') NOT NULL,
  `update_mask` JSON DEFAULT NULL COMMENT 'The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An item to be updated';

--
-- Table structure for table `CatalogsUpsertCreativeAssetsItem` generated from model 'CatalogsUpsertCreativeAssetsItem'
-- A creative assets item to be upserted.
--

CREATE TABLE IF NOT EXISTS `CatalogsUpsertCreativeAssetsItem` (
  `attributes` TEXT NOT NULL,
  `creative_assets_id` TEXT NOT NULL COMMENT 'The catalog creative assets id in the merchant namespace',
  `operation` ENUM('UPSERT') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A creative assets item to be upserted.';

--
-- Table structure for table `CatalogsUpsertHotelItem` generated from model 'CatalogsUpsertHotelItem'
-- A hotel item to be upserted.
--

CREATE TABLE IF NOT EXISTS `CatalogsUpsertHotelItem` (
  `attributes` TEXT NOT NULL,
  `hotel_id` TEXT NOT NULL COMMENT 'The catalog hotel id in the merchant namespace',
  `operation` ENUM('UPSERT') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A hotel item to be upserted.';

--
-- Table structure for table `CatalogsUpsertRetailItem` generated from model 'CatalogsUpsertRetailItem'
-- An item to be upserted
--

CREATE TABLE IF NOT EXISTS `CatalogsUpsertRetailItem` (
  `attributes` TEXT NOT NULL,
  `item_id` TEXT NOT NULL COMMENT 'The catalog item id in the merchant namespace',
  `operation` ENUM('UPSERT') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An item to be upserted';

--
-- Table structure for table `CatalogsVerticalBatchRequest` generated from model 'CatalogsVerticalBatchRequest'
-- A request object that can have multiple operations on a single batch
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalBatchRequest` (
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog',
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `country` TEXT NOT NULL,
  `items` JSON NOT NULL COMMENT 'Array with creative assets item operations',
  `language` ENUM('af-ZA', 'ar-SA', 'bg-BG', 'bn-IN', 'cs-CZ', 'da-DK', 'de', 'el-GR', 'en-AU', 'en-CA', 'en-GB', 'en-IN', 'en-US', 'es-419', 'es-AR', 'es-ES', 'es-MX', 'fi-FI', 'fr', 'fr-CA', 'he-IL', 'hi-IN', 'hr-HR', 'hu-HU', 'id-ID', 'it', 'ja', 'ko-KR', 'ms-MY', 'nb-NO', 'nl', 'pl-PL', 'pt-BR', 'pt-PT', 'ro-RO', 'ru-RU', 'sk-SK', 'sv-SE', 'te-IN', 'th-TH', 'tl-PH', 'tr', 'uk-UA', 'vi-VN', 'zh-CN', 'zh-TW', 'AM', 'AR', 'AZ', 'BG', 'BN', 'BS', 'CA', 'CS', 'DA', 'DV', 'DZ', 'DE', 'EL', 'EN', 'ES', 'ET', 'FA', 'FI', 'FR', 'HE', 'HI', 'HR', 'HU', 'HY', 'ID', 'IN', 'IS', 'IT', 'IW', 'JA', 'KA', 'KM', 'KO', 'LO', 'LT', 'LV', 'MK', 'MN', 'MS', 'MY', 'NB', 'NE', 'NL', 'false', 'PL', 'PT', 'RO', 'RU', 'SK', 'SL', 'SQ', 'SR', 'SV', 'TL', 'UK', 'VI', 'TE', 'TH', 'TR', 'XX', 'ZH') NOT NULL COMMENT 'We recommend using the CatalogsLocale values.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A request object that can have multiple operations on a single batch';

--
-- Table structure for table `CatalogsVerticalFeedsCreateRequest` generated from model 'CatalogsVerticalFeedsCreateRequest'
-- Request object for creating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalFeedsCreateRequest` (
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.',
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `credentials` TEXT DEFAULT NULL,
  `default_availability` TEXT DEFAULT NULL,
  `default_country` TEXT NOT NULL,
  `default_currency` TEXT DEFAULT NULL,
  `default_locale` TEXT NOT NULL,
  `format` TEXT NOT NULL,
  `location` TEXT NOT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `status` TEXT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for creating a feed.';

--
-- Table structure for table `CatalogsVerticalFeedsUpdateRequest` generated from model 'CatalogsVerticalFeedsUpdateRequest'
-- Request object for updating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalFeedsUpdateRequest` (
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `credentials` TEXT DEFAULT NULL,
  `default_availability` TEXT DEFAULT NULL,
  `default_currency` TEXT DEFAULT NULL,
  `format` TEXT DEFAULT NULL,
  `location` TEXT DEFAULT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `name` TEXT DEFAULT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for updating a feed.';

--
-- Table structure for table `CatalogsVerticalProductGroup` generated from model 'CatalogsVerticalProductGroup'
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalProductGroup` (
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog ID pertaining to the product group.',
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `country` TEXT DEFAULT NULL,
  `created_at` INT DEFAULT NULL COMMENT 'Unix timestamp in seconds of when catalog product group was created.',
  `description` TEXT DEFAULT NULL,
  `feed_id` TEXT NOT NULL COMMENT 'id of the catalogs feed belonging to this catalog product group',
  `filters` TEXT NOT NULL,
  `id` TEXT NOT NULL COMMENT 'ID of the catalog product group.',
  `is_featured` TINYINT(1) DEFAULT NULL COMMENT 'boolean indicator of whether the product group is being featured or not',
  `locale` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'Name of catalog product group',
  `status` TEXT DEFAULT NULL,
  `type` TEXT NOT NULL,
  `updated_at` INT DEFAULT NULL COMMENT 'Unix timestamp in seconds of last time catalog product group was updated.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsVerticalProductGroupCreateRequest` generated from model 'CatalogsVerticalProductGroupCreateRequest'
-- Request object for creating a catalog based product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalProductGroupCreateRequest` (
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog ID pertaining to the product group.',
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `country` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `filters` TEXT NOT NULL,
  `locale` TEXT DEFAULT NULL,
  `name` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for creating a catalog based product group.';

--
-- Table structure for table `CatalogsVerticalProductGroupUpdateRequest` generated from model 'CatalogsVerticalProductGroupUpdateRequest'
-- Request object for updating a catalog based product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalProductGroupUpdateRequest` (
  `catalog_type` ENUM('CREATIVE_ASSETS') DEFAULT NULL,
  `country` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `filters` TEXT DEFAULT NULL,
  `locale` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'Name of catalog product group'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for updating a catalog based product group.';

--
-- Table structure for table `CatalogsVerticalsListProductsByCatalogBasedFilterRequest` generated from model 'CatalogsVerticalsListProductsByCatalogBasedFilterRequest'
-- Request object to list products for a given catalog_id and product group filter.
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalsListProductsByCatalogBasedFilterRequest` (
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog ID pertaining to the product group.',
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `country` TEXT NOT NULL,
  `filters` TEXT NOT NULL,
  `locale` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object to list products for a given catalog_id and product group filter.';

--
-- Table structure for table `ConditionFilter` generated from model 'ConditionFilter'
--

CREATE TABLE IF NOT EXISTS `ConditionFilter` (
  `CONDITION` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionAccessToken` generated from model 'ConversionAccessToken'
-- A successful conversion access token response.
--

CREATE TABLE IF NOT EXISTS `ConversionAccessToken` (
  `access_token` TEXT NOT NULL,
  `token_type` TEXT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A successful conversion access token response.';

--
-- Table structure for table `ConversionApiResponseEventsItems` generated from model 'ConversionApiResponseEventsItems'
--

CREATE TABLE IF NOT EXISTS `ConversionApiResponseEventsItems` (
  `error_message` TEXT DEFAULT NULL COMMENT 'Error message containing more information about why the event failed to be processed.',
  `status` TEXT NOT NULL COMMENT 'Whether the event was processed successfully.',
  `warning_message` TEXT DEFAULT NULL COMMENT 'Warning messages about any fields in the event which are not standard. These are not critical to event processing.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionDeletionRequest` generated from model 'ConversionDeletionRequest'
-- Conversion deletion request
--

CREATE TABLE IF NOT EXISTS `ConversionDeletionRequest` (
  `created_time` DATE NOT NULL COMMENT 'Timestamp when the conversion deletion request was succesfully created.',
  `processed_time` DATE DEFAULT NULL COMMENT 'Timestamp when the conversion deletion request was processed.',
  `request_id` VARCHAR(18) NOT NULL COMMENT 'Unique identifier of the conversion deletion request',
  `status` TEXT NOT NULL COMMENT 'Represents the status of the conversion deletion request. \&quot;PENDING\&quot; or \&quot;SUBMITTED\&quot;. \&quot;PENDING\&quot; meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \&quot;SUBMITTED\&quot; meaning that the Data Deletion process has begun and can no longer be canceled.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Conversion deletion request';

--
-- Table structure for table `ConversionDeletionRequestCreate` generated from model 'ConversionDeletionRequestCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `ConversionDeletionRequestCreate` (
  `deletion_targets` TEXT NOT NULL COMMENT 'Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `ConversionDeletionRequestEPIKTargets` generated from model 'ConversionDeletionRequestEPIKTargets'
--

CREATE TABLE IF NOT EXISTS `ConversionDeletionRequestEPIKTargets` (
  `epiks` JSON NOT NULL COMMENT 'Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `conversion_deletion_request_list_200_response` generated from model 'conversionUnderscoredeletionUnderscorerequestUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `conversion_deletion_request_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionDeletionRequestTargets` generated from model 'ConversionDeletionRequestTargets'
--

CREATE TABLE IF NOT EXISTS `ConversionDeletionRequestTargets` (
  `user_emails` JSON NOT NULL COMMENT 'Array of plain text user emails.',
  `epiks` JSON NOT NULL COMMENT 'Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionDeletionRequestUserEmailTargets` generated from model 'ConversionDeletionRequestUserEmailTargets'
--

CREATE TABLE IF NOT EXISTS `ConversionDeletionRequestUserEmailTargets` (
  `user_emails` JSON NOT NULL COMMENT 'Array of plain text user emails.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionEventAppInfo` generated from model 'ConversionEventAppInfo'
-- Object containing information about the application where event occurred.
--

CREATE TABLE IF NOT EXISTS `ConversionEventAppInfo` (
  `app_id` VARCHAR(200) DEFAULT NULL COMMENT 'App ID in Google Play Store, AppStore or other stores.',
  `app_name` VARCHAR(200) DEFAULT NULL COMMENT 'Name of the app. Primarily used for Mobile Apps.',
  `app_package_name` VARCHAR(200) DEFAULT NULL COMMENT 'App package name',
  `app_store` VARCHAR(100) DEFAULT NULL COMMENT 'The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps',
  `app_version` VARCHAR(100) DEFAULT NULL COMMENT 'App version. Primarily used for mobile apps',
  `install_time` INT UNSIGNED DEFAULT NULL COMMENT 'App install time. Unix timestamp in seconds',
  `user_agent` TEXT DEFAULT NULL COMMENT 'User Agent request header. Primarily used for Web events',
  `window_height` SMALLINT UNSIGNED DEFAULT NULL COMMENT 'Inner height of the window or viewport.',
  `window_width` SMALLINT UNSIGNED DEFAULT NULL COMMENT 'Inner width of the window or viewport.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object containing information about the application where event occurred.';

--
-- Table structure for table `ConversionEventDeviceInfo` generated from model 'ConversionEventDeviceInfo'
-- Object containing information about the device where event occurred.
--

CREATE TABLE IF NOT EXISTS `ConversionEventDeviceInfo` (
  `battery_level` TINYINT UNSIGNED DEFAULT NULL COMMENT 'Battery charge level percentage',
  `brand` VARCHAR(100) DEFAULT NULL COMMENT 'Device brand',
  `carrier` VARCHAR(100) DEFAULT NULL COMMENT 'User device&#39;s mobile carrier.',
  `cpu_cores` SMALLINT UNSIGNED DEFAULT NULL COMMENT 'Number of CPU cores',
  `external_storage_free_space` MEDIUMINT UNSIGNED DEFAULT NULL COMMENT 'External storage size in GB',
  `external_storage_size` MEDIUMINT UNSIGNED DEFAULT NULL COMMENT 'External storage size in GB',
  `form_factor` TEXT DEFAULT NULL COMMENT 'Device form factor',
  `kernel_version` VARCHAR(100) DEFAULT NULL COMMENT 'Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release',
  `languages` JSON DEFAULT NULL COMMENT 'List of user installed languages. ISO 639-1 format',
  `locale` VARCHAR(35) DEFAULT NULL COMMENT 'Device locale BCP-47 format',
  `model` VARCHAR(100) DEFAULT NULL COMMENT 'Device model name',
  `network_type` TEXT DEFAULT NULL COMMENT 'Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()',
  `os_family` TEXT DEFAULT NULL COMMENT 'OS Family',
  `os_name` VARCHAR(100) DEFAULT NULL COMMENT 'Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch',
  `os_release_name` VARCHAR(100) DEFAULT NULL COMMENT 'Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin',
  `os_version` VARCHAR(100) DEFAULT NULL COMMENT 'Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04',
  `screen_density` MEDIUMINT UNSIGNED DEFAULT NULL COMMENT 'Screen density, PPI',
  `screen_height` SMALLINT UNSIGNED DEFAULT NULL COMMENT 'Screen height in pixels',
  `screen_width` SMALLINT UNSIGNED DEFAULT NULL COMMENT 'Screen width in pixels',
  `storage_free_space` MEDIUMINT UNSIGNED DEFAULT NULL COMMENT 'Internal storage size in GB',
  `storage_size` MEDIUMINT UNSIGNED DEFAULT NULL COMMENT 'Internal storage size in GB',
  `timezone` VARCHAR(40) DEFAULT NULL COMMENT 'Device timezone',
  `timezone_abbr` VARCHAR(5) DEFAULT NULL COMMENT 'Timezone abbreviation',
  `type` VARCHAR(100) DEFAULT NULL COMMENT 'Device type'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object containing information about the device where event occurred.';

--
-- Table structure for table `ConversionEventResponse` generated from model 'ConversionEventResponse'
--

CREATE TABLE IF NOT EXISTS `ConversionEventResponse` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Id of the ad account.',
  `conversion_event` TEXT DEFAULT NULL,
  `conversion_tag_id` TEXT DEFAULT NULL COMMENT 'Id of the tag.',
  `created_time` INT DEFAULT NULL COMMENT 'Creation date in epoch format.',
  `reporting_conversion_event` TEXT DEFAULT NULL COMMENT 'For advertiser-defined events, the reporting event label shown in optimization UIs.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionEvents` generated from model 'ConversionEvents'
-- Conversion events.
--

CREATE TABLE IF NOT EXISTS `ConversionEvents` (
  `events` JSON NOT NULL COMMENT 'Specific messages for each event received. The order will match the order in which the events were received in the request.',
  `num_events_processed` INT NOT NULL COMMENT 'Number of events that were successfully processed from the events.',
  `num_events_received` INT NOT NULL COMMENT 'Total number of events received in the request.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Conversion events.';

--
-- Table structure for table `ConversionEventsCreate` generated from model 'ConversionEventsCreate'
-- Conversion events.
--

CREATE TABLE IF NOT EXISTS `ConversionEventsCreate` (
  `data` JSON NOT NULL COMMENT 'A list of events (one or more) encapsulated by a data object.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Conversion events.';

--
-- Table structure for table `ConversionEventsDataItems` generated from model 'ConversionEventsDataItems'
--

CREATE TABLE IF NOT EXISTS `ConversionEventsDataItems` (
  `action_source` TEXT NOT NULL COMMENT 'The source indicating where the conversion event occurred. - &#x60;app_android&#x60; - &#x60;app_ios&#x60; - &#x60;web&#x60; - &#x60;offline&#x60;',
  `app_id` TEXT DEFAULT NULL COMMENT 'The app store app ID.',
  `app_info` TEXT DEFAULT NULL,
  `app_name` TEXT DEFAULT NULL COMMENT 'Name of the app.',
  `app_version` TEXT DEFAULT NULL COMMENT 'Version of the app.',
  `custom_data` TEXT DEFAULT NULL,
  `device_brand` TEXT DEFAULT NULL COMMENT 'Brand of the user device.',
  `device_carrier` TEXT DEFAULT NULL COMMENT 'User device&#39;s mobile carrier.',
  `device_info` TEXT DEFAULT NULL,
  `device_model` TEXT DEFAULT NULL COMMENT 'Model of the user device.',
  `device_type` TEXT DEFAULT NULL COMMENT 'Type of the user device.',
  `event_id` TEXT NOT NULL COMMENT 'A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.',
  `event_name` TEXT NOT NULL COMMENT 'The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - &#x60;add_payment_info&#x60; - &#x60;add_to_cart&#x60; - &#x60;add_to_wishlist&#x60; - &#x60;app_install&#x60; - &#x60;app_open&#x60; - &#x60;checkout&#x60; - &#x60;contact&#x60; - &#x60;custom&#x60; - &#x60;customize_product&#x60; - &#x60;find_location&#x60; - &#x60;initiate_checkout&#x60; - &#x60;lead&#x60; - &#x60;page_visit&#x60; - &#x60;schedule&#x60; - &#x60;search&#x60; - &#x60;signup&#x60; - &#x60;start_trial&#x60; - &#x60;submit_application&#x60; - &#x60;subscribe&#x60; - &#x60;view_category&#x60; - &#x60;view_content&#x60; - &#x60;watch_video&#x60;',
  `event_source_url` TEXT DEFAULT NULL COMMENT 'URL of the web conversion event.',
  `event_time` BIGINT NOT NULL COMMENT 'The time when the event happened. Unix timestamp in seconds.',
  `language` TEXT DEFAULT NULL COMMENT 'Two-character ISO-639-1 language code indicating the user&#39;s language.',
  `opt_out` TINYINT(1) DEFAULT NULL COMMENT 'When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.',
  `os_version` TEXT DEFAULT NULL COMMENT 'Version of the device operating system.',
  `partner_name` TEXT DEFAULT NULL COMMENT 'The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g &#39;ss-shopify&#39;',
  `user_data` TEXT NOT NULL COMMENT 'Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.',
  `wifi` TINYINT(1) DEFAULT NULL COMMENT 'Whether the event occurred when the user device was connected to wifi.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionEventsDataItemsCustomData` generated from model 'ConversionEventsDataItemsCustomData'
-- Object containing other custom data.
--

CREATE TABLE IF NOT EXISTS `ConversionEventsDataItemsCustomData` (
  `content_brand` TEXT DEFAULT NULL COMMENT 'The brand of the content associated with the event.',
  `content_category` TEXT DEFAULT NULL COMMENT 'The category of the content associated with the event.',
  `content_ids` JSON DEFAULT NULL COMMENT 'List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).',
  `content_name` TEXT DEFAULT NULL COMMENT 'The name of the page or product associated with the event.',
  `contents` JSON DEFAULT NULL COMMENT 'A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).',
  `currency` TEXT DEFAULT NULL COMMENT 'The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.',
  `external_measurement_id` TEXT DEFAULT NULL COMMENT 'Only use when instructed.',
  `external_measurement_vendor_id` INT DEFAULT NULL COMMENT 'Only use when instructed.',
  `np` TEXT DEFAULT NULL COMMENT 'Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.',
  `num_items` BIGINT DEFAULT NULL COMMENT 'Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).',
  `opt_out_type` TEXT DEFAULT NULL COMMENT 'Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer&#39;s guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter.',
  `order_id` TEXT DEFAULT NULL COMMENT 'The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.',
  `predicted_ltv` TEXT DEFAULT NULL COMMENT 'Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.',
  `search_string` TEXT DEFAULT NULL COMMENT 'The search string related to the user conversion event.',
  `value` TEXT DEFAULT NULL COMMENT 'Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object containing other custom data.';

--
-- Table structure for table `ConversionEventsDataItemsCustomDataContentsItems` generated from model 'ConversionEventsDataItemsCustomDataContentsItems'
--

CREATE TABLE IF NOT EXISTS `ConversionEventsDataItemsCustomDataContentsItems` (
  `id` TEXT DEFAULT NULL COMMENT 'The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).',
  `item_brand` TEXT DEFAULT NULL COMMENT 'The brand of a product.',
  `item_brand_id` VARCHAR(64) DEFAULT NULL COMMENT 'The brand ID of a product.',
  `item_category` TEXT DEFAULT NULL COMMENT 'The category of a product.',
  `item_name` TEXT DEFAULT NULL COMMENT 'The name of a product.',
  `item_price` TEXT DEFAULT NULL COMMENT 'The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).',
  `quantity` BIGINT DEFAULT NULL COMMENT 'The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionEventsUserDataProperties` generated from model 'ConversionEventsUserDataProperties'
--

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataProperties` (
  `click_id` TEXT DEFAULT NULL COMMENT 'The unique identifier stored in _epik cookie on your domain or &amp;epik&#x3D; query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.',
  `client_ip_address` TEXT DEFAULT NULL COMMENT 'The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.',
  `client_user_agent` TEXT DEFAULT NULL COMMENT 'The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.',
  `country` JSON DEFAULT NULL COMMENT 'Sha256 hashes of two-character ISO-3166 country code indicating the user&#39;s country, in lowercase. The string should be in the UTF-8 format.',
  `ct` JSON DEFAULT NULL COMMENT 'Sha256 hashes of user&#39;s city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.',
  `db` JSON DEFAULT NULL COMMENT 'Sha256 hashes of user&#39;s date of birthday, given as year, month, and day. The string should be in the UTF-8 format.',
  `em` JSON DEFAULT NULL COMMENT 'Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.',
  `external_id` JSON DEFAULT NULL COMMENT 'Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.',
  `fn` JSON DEFAULT NULL COMMENT 'Sha256 hashes of user&#39;s first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.',
  `ge` JSON DEFAULT NULL COMMENT 'Sha256 hashes of user&#39;s gender, in lowercase. Either \&quot;f\&quot; or \&quot;m\&quot; or \&quot;n\&quot; for non-binary gender. The string should be in the UTF-8 format.',
  `hashed_maids` JSON DEFAULT NULL COMMENT 'Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.',
  `ln` JSON DEFAULT NULL COMMENT 'Sha256 hashes of user&#39;s last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.',
  `partner_id` TEXT DEFAULT NULL COMMENT 'A unique identifier of visitors&#39; information defined by third party partners. e.g RampID',
  `ph` JSON DEFAULT NULL COMMENT 'Sha256 hashes of user&#39;s phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.',
  `st` JSON DEFAULT NULL COMMENT 'Sha256 hashes of user&#39;s state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.',
  `zp` JSON DEFAULT NULL COMMENT 'Sha256 hashes of user&#39;s zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionHealthSelectionItem` generated from model 'ConversionHealthSelectionItem'
-- User selection of conversion health criteria for a single feature
--

CREATE TABLE IF NOT EXISTS `ConversionHealthSelectionItem` (
  `conversionType` JSON DEFAULT NULL COMMENT 'Status for conversion types',
  `criteria` JSON DEFAULT NULL COMMENT 'Status for criteria',
  `ingestionSource` JSON DEFAULT NULL COMMENT 'Status for ingestion sources',
  `status` TEXT NOT NULL COMMENT 'Overall status for this selection item'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='User selection of conversion health criteria for a single feature';

--
-- Table structure for table `ConversionMSOTEventsCreate` generated from model 'ConversionMSOTEventsCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `ConversionMSOTEventsCreate` (
  `action_timestamps` JSON DEFAULT NULL COMMENT 'Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.',
  `ad_group_id` TEXT NOT NULL COMMENT 'The ID of the ad group that was attributed to the conversion event.',
  `attribution_model` TEXT DEFAULT NULL COMMENT 'The attribution model used to attribute the conversion event.',
  `attribution_scope` TEXT DEFAULT NULL COMMENT 'Ad event type.',
  `attribution_score` DECIMAL(20, 9) UNSIGNED DEFAULT NULL COMMENT 'Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1.',
  `campaign_id` TEXT DEFAULT NULL COMMENT 'The ID of the campaign that was attributed to the conversion event.',
  `click_window` TEXT DEFAULT NULL COMMENT 'Click window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;, &#x60;lifetime&#x60;).',
  `currency` TEXT DEFAULT NULL COMMENT 'Currency code for the &#x60;value&#x60; field, required if &#x60;value&#x60; is present. Currency Codes should be in ISO 4217 standard.',
  `event_id` TEXT NOT NULL COMMENT 'A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.',
  `event_name` TEXT NOT NULL COMMENT 'Type of user event.',
  `event_timestamp` BIGINT NOT NULL COMMENT 'The time when the event occurred. Unix timestamp in seconds.',
  `total_event_touchpoints` INT UNSIGNED DEFAULT NULL COMMENT 'Total number of ad events including other non-Pinterest ad platforms.',
  `total_events` INT UNSIGNED DEFAULT NULL COMMENT 'Deprecated: use &#x60;total_events_fractional&#x60; instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.',
  `total_events_fractional` DECIMAL(20, 9) UNSIGNED DEFAULT NULL COMMENT 'Total number of conversion events that are reported in one API call. Use this field instead of &#x60;total_events&#x60; to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).',
  `value` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Order value of the conversion event. Required if &#x60;event_name&#x60; is &#x60;add_to_cart&#x60; or &#x60;checkout&#x60;.',
  `view_window` TEXT DEFAULT NULL COMMENT 'View window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `ConversionProductReport` generated from model 'ConversionProductReport'
--

CREATE TABLE IF NOT EXISTS `ConversionProductReport` (
  `message` TEXT DEFAULT NULL COMMENT 'Message returned from the create report request',
  `report_status` TEXT DEFAULT NULL COMMENT 'Async report status',
  `size` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Size of the report in bytes',
  `token` TEXT DEFAULT NULL COMMENT 'Token returned from the create report request',
  `url` TEXT DEFAULT NULL COMMENT 'URL of the report'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionProductReportCreate` generated from model 'ConversionProductReportCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `ConversionProductReportCreate` (
  `ad_group_ids` JSON DEFAULT NULL COMMENT '  List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.',
  `campaign_ids` JSON DEFAULT NULL COMMENT '  List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.',
  `campaign_objective_types` JSON DEFAULT NULL COMMENT 'List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;].',
  `click_window_days` TEXT COMMENT 'Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.',
  `columns` JSON NOT NULL COMMENT 'Metric and entity columns',
  `conversion_product_attribution_type` TEXT COMMENT '  Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.',
  `conversion_product_breakdown` TEXT COMMENT 'Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.',
  `conversion_report_time` TEXT COMMENT 'The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.',
  `end_date` TEXT NOT NULL COMMENT '  Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.',
  `granularity` TEXT NOT NULL COMMENT 'Report granularity for time-based metric aggregation',
  `level` TEXT NOT NULL COMMENT 'Level of the report',
  `product_sku_ids` JSON DEFAULT NULL COMMENT '  List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.',
  `report_name` TEXT NOT NULL COMMENT 'Name of the conversion product report',
  `start_date` TEXT NOT NULL COMMENT '  Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.',
  `view_window_days` TEXT COMMENT 'Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `ConversionTag` generated from model 'ConversionTag'
--

CREATE TABLE IF NOT EXISTS `ConversionTag` (
  `code_snippet` TEXT DEFAULT NULL COMMENT 'Tag code snippet.',
  `configs` TEXT DEFAULT NULL,
  `enhanced_match_status` TEXT DEFAULT NULL COMMENT 'The enhanced match status of the tag',
  `id` TEXT DEFAULT NULL COMMENT 'Tag ID.',
  `last_fired_time_ms` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Time for the last event fired.',
  `name` TEXT NOT NULL COMMENT 'Conversion tag name.',
  `version` TEXT DEFAULT NULL COMMENT 'Version number.',
  `ad_account_id` TEXT NOT NULL COMMENT 'Ad account ID.',
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionTagCommon` generated from model 'ConversionTagCommon'
--

CREATE TABLE IF NOT EXISTS `ConversionTagCommon` (
  `code_snippet` TEXT DEFAULT NULL COMMENT 'Tag code snippet.',
  `configs` TEXT DEFAULT NULL,
  `enhanced_match_status` TEXT DEFAULT NULL COMMENT 'The enhanced match status of the tag',
  `id` TEXT DEFAULT NULL COMMENT 'Tag ID.',
  `last_fired_time_ms` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Time for the last event fired.',
  `name` TEXT NOT NULL COMMENT 'Conversion tag name.',
  `version` TEXT DEFAULT NULL COMMENT 'Version number.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionTagConfigs` generated from model 'ConversionTagConfigs'
--

CREATE TABLE IF NOT EXISTS `ConversionTagConfigs` (
  `aem_db_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.',
  `aem_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.',
  `aem_external_id_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.',
  `aem_fnln_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.',
  `aem_ge_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.',
  `aem_loc_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.',
  `aem_ph_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.',
  `md_frequency` DECIMAL(20, 9) DEFAULT '1' COMMENT 'Metadata ingestion frequency.',
  `no_code_capi_domains` JSON DEFAULT NULL COMMENT 'List of advertiser subdomains configured for NoCodeCAPI calls.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionTagCreate` generated from model 'ConversionTagCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `ConversionTagCreate` (
  `aem_db_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.',
  `aem_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.',
  `aem_external_id_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.',
  `aem_fnln_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.',
  `aem_ge_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.',
  `aem_loc_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.',
  `aem_ph_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.',
  `md_frequency` DECIMAL(20, 9) DEFAULT '1' COMMENT 'Metadata ingestion frequency.',
  `name` TEXT NOT NULL COMMENT 'Conversion tag name.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `ConversionTagResponse` generated from model 'ConversionTagResponse'
--

CREATE TABLE IF NOT EXISTS `ConversionTagResponse` (
  `code_snippet` TEXT DEFAULT NULL COMMENT 'Tag code snippet.',
  `configs` TEXT DEFAULT NULL,
  `enhanced_match_status` TEXT DEFAULT NULL COMMENT 'The enhanced match status of the tag',
  `id` TEXT DEFAULT NULL COMMENT 'Tag ID.',
  `last_fired_time_ms` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Time for the last event fired.',
  `name` TEXT NOT NULL COMMENT 'Conversion tag name.',
  `version` TEXT DEFAULT NULL COMMENT 'Version number.',
  `ad_account_id` TEXT NOT NULL COMMENT 'Ad account ID.',
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionTagV3GoalMetadata` generated from model 'ConversionTagV3GoalMetadata'
--

CREATE TABLE IF NOT EXISTS `ConversionTagV3GoalMetadata` (
  `attribution_windows` TEXT DEFAULT NULL,
  `conversion_event` TEXT DEFAULT NULL,
  `conversion_tag_id` TEXT DEFAULT NULL,
  `cpa_goal_value_in_micro_currency` TEXT DEFAULT NULL,
  `is_roas_optimized` TINYINT(1) DEFAULT NULL COMMENT 'Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;\&quot;CHECKOUT\&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;\&quot;AUTOMATIC_BID\&quot;&#x60;. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).',
  `reporting_event` TEXT DEFAULT NULL COMMENT 'Event name for custom or standard events mapped to an oCPM model'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `conversion_tags_list_200_response` generated from model 'conversionUnderscoretagsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `conversion_tags_list_200_response` (
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CountryFilter` generated from model 'CountryFilter'
--

CREATE TABLE IF NOT EXISTS `CountryFilter` (
  `COUNTRY` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateAssetAccessRequestBody` generated from model 'CreateAssetAccessRequestBody'
-- An object containing a list of all the asset access requests
--

CREATE TABLE IF NOT EXISTS `CreateAssetAccessRequestBody` (
  `asset_requests` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An object containing a list of all the asset access requests';

--
-- Table structure for table `CreateAssetAccessRequestItem` generated from model 'CreateAssetAccessRequestItem'
--

CREATE TABLE IF NOT EXISTS `CreateAssetAccessRequestItem` (
  `asset_id_to_permissions` JSON NOT NULL COMMENT 'An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.',
  `partner_id` TEXT NOT NULL COMMENT 'Unique identifier of a business partner to request asset access to.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateAssetAccessRequestResponse` generated from model 'CreateAssetAccessRequestResponse'
--

CREATE TABLE IF NOT EXISTS `CreateAssetAccessRequestResponse` (
  `exceptions` JSON DEFAULT NULL COMMENT 'A list of errors associated with the asset access requests. Will be returned if there is an error.',
  `invites` JSON DEFAULT NULL COMMENT 'An object mapping each partner id to the asset access request id. Only one request id is returned per partner.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateAssetInvitesRequest` generated from model 'CreateAssetInvitesRequest'
-- Request body for updating asset roles for existing invites.
--

CREATE TABLE IF NOT EXISTS `CreateAssetInvitesRequest` (
  `invites` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request body for updating asset roles for existing invites.';

--
-- Table structure for table `CreateAssetInvitesRequestItem` generated from model 'CreateAssetInvitesRequestItem'
-- Object declaring an asset role update to an invite.
--

CREATE TABLE IF NOT EXISTS `CreateAssetInvitesRequestItem` (
  `asset_id_to_permissions` JSON NOT NULL COMMENT 'An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.',
  `invite_id` TEXT NOT NULL COMMENT 'Unique identifier of an invite.',
  `invite_type` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object declaring an asset role update to an invite.';

--
-- Table structure for table `CreateInvitesResultsResponseArray` generated from model 'CreateInvitesResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `CreateInvitesResultsResponseArray` (
  `items` JSON DEFAULT NULL COMMENT 'List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateMembershipOrPartnershipInvitesBody` generated from model 'CreateMembershipOrPartnershipInvitesBody'
-- Body to be used on path to send Members or Partners Invite or Request
--

CREATE TABLE IF NOT EXISTS `CreateMembershipOrPartnershipInvitesBody` (
  `business_role` TEXT NOT NULL,
  `invite_type` TEXT NOT NULL,
  `members` JSON DEFAULT NULL COMMENT 'A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE',
  `partners` JSON DEFAULT NULL COMMENT 'A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Body to be used on path to send Members or Partners Invite or Request';

--
-- Table structure for table `CreativeAssetsIdFilter` generated from model 'CreativeAssetsIdFilter'
--

CREATE TABLE IF NOT EXISTS `CreativeAssetsIdFilter` (
  `CREATIVE_ASSETS_ID` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreativeAssetsProcessingRecord` generated from model 'CreativeAssetsProcessingRecord'
-- Object describing an item processing record
--

CREATE TABLE IF NOT EXISTS `CreativeAssetsProcessingRecord` (
  `creative_assets_id` TEXT DEFAULT NULL COMMENT 'The catalog creative assets id in the merchant namespace',
  `errors` JSON DEFAULT NULL COMMENT 'Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.',
  `status` TEXT DEFAULT NULL,
  `warnings` JSON DEFAULT NULL COMMENT 'Array with the validation warnings for the item processing record'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an item processing record';

--
-- Table structure for table `CurrencyFilter` generated from model 'CurrencyFilter'
--

CREATE TABLE IF NOT EXISTS `CurrencyFilter` (
  `CURRENCY` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CustomConversionEventMetrics` generated from model 'CustomConversionEventMetrics'
--

CREATE TABLE IF NOT EXISTS `CustomConversionEventMetrics` (
  `custom_event_metrics_type` TEXT NOT NULL,
  `custom_event_name` TEXT NOT NULL COMMENT 'Name of the advertiser-defined custom conversion event'
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
-- Table structure for table `CustomNumber0Filter` generated from model 'CustomNumber0Filter'
--

CREATE TABLE IF NOT EXISTS `CustomNumber0Filter` (
  `CUSTOM_NUMBER_0` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CustomNumber1Filter` generated from model 'CustomNumber1Filter'
--

CREATE TABLE IF NOT EXISTS `CustomNumber1Filter` (
  `CUSTOM_NUMBER_1` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CustomNumber2Filter` generated from model 'CustomNumber2Filter'
--

CREATE TABLE IF NOT EXISTS `CustomNumber2Filter` (
  `CUSTOM_NUMBER_2` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CustomNumber3Filter` generated from model 'CustomNumber3Filter'
--

CREATE TABLE IF NOT EXISTS `CustomNumber3Filter` (
  `CUSTOM_NUMBER_3` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CustomNumber4Filter` generated from model 'CustomNumber4Filter'
--

CREATE TABLE IF NOT EXISTS `CustomNumber4Filter` (
  `CUSTOM_NUMBER_4` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CustomerList` generated from model 'CustomerList'
--

CREATE TABLE IF NOT EXISTS `CustomerList` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Associated ad account ID.',
  `created_time` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Creation time. Unix timestamp in seconds.',
  `exceptions` JSON DEFAULT NULL COMMENT 'Customer list errors.',
  `id` VARCHAR(18) NOT NULL COMMENT 'Customer list ID.',
  `is_nca` TINYINT(1) DEFAULT NULL COMMENT 'Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.',
  `name` TEXT NOT NULL COMMENT 'Customer list name.',
  `num_batches` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.',
  `num_removed_user_records` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.',
  `num_uploaded_user_records` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.',
  `status` TEXT DEFAULT NULL COMMENT 'Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users.',
  `type` TEXT DEFAULT NULL COMMENT 'Always &#x60;customerlist&#x60;.',
  `updated_time` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Last update time. Unix timestamp in seconds.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CustomerListCreate` generated from model 'CustomerListCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `CustomerListCreate` (
  `is_nca` TINYINT(1) DEFAULT NULL COMMENT 'Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.',
  `list_type` TEXT COMMENT 'Type of customer list (e.g., EMAIL, IDFA, MAID).',
  `name` TEXT NOT NULL COMMENT 'Customer list name.',
  `records` TEXT DEFAULT NULL COMMENT 'Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.',
  `records_v2` JSON DEFAULT NULL COMMENT 'Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `CustomerListRecordRow` generated from model 'CustomerListRecordRow'
-- A single row in a multi-field customer list (v2 format).
--

CREATE TABLE IF NOT EXISTS `CustomerListRecordRow` (
  `email` TEXT DEFAULT NULL COMMENT 'Email address (plain or hashed with SHA1, SHA256, or MD5).',
  `external_id` TEXT DEFAULT NULL COMMENT 'External ID identifier (not hashed).',
  `hashed_phone_number` TEXT DEFAULT NULL COMMENT 'Hashed phone number (hashed with SHA1, SHA256, or MD5).',
  `hashed_pinner_id` TEXT DEFAULT NULL COMMENT 'Hashed pinner ID (hashed with SHA1, SHA256, or MD5).',
  `ip_address` TEXT DEFAULT NULL COMMENT 'IP address (not hashed).',
  `liveramp_envelope` TEXT DEFAULT NULL COMMENT 'LiveRamp envelope identifier (Base64-encoded, not hashed).',
  `maid` TEXT DEFAULT NULL COMMENT 'Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).',
  `user_agent` TEXT DEFAULT NULL COMMENT 'User agent string (not hashed).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A single row in a multi-field customer list (v2 format).';

--
-- Table structure for table `CustomerListUpdateWithRequiredBody` generated from model 'CustomerListUpdateWithRequiredBody'
-- Resource create or update operation model with required body fields (no OptionalProperties).
--

CREATE TABLE IF NOT EXISTS `CustomerListUpdateWithRequiredBody` (
  `operation_type` TEXT NOT NULL COMMENT 'Customer list update operation type (add or remove). Only valid in update request body.',
  `records` TEXT DEFAULT NULL COMMENT 'Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.',
  `records_v2` JSON DEFAULT NULL COMMENT 'Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create or update operation model with required body fields (no OptionalProperties).';

--
-- Table structure for table `CustomerListUpload` generated from model 'CustomerListUpload'
--

CREATE TABLE IF NOT EXISTS `CustomerListUpload` (
  `ad_account_id` TEXT NOT NULL COMMENT 'Advertiser ID.',
  `creation_time` INT NOT NULL COMMENT 'Customer List Upload creation_time. Epoch (seconds).',
  `customer_list_id` TEXT NOT NULL COMMENT 'ID of the customer list associated with this upload.',
  `error_counts` JSON DEFAULT NULL COMMENT 'Error counts by error code',
  `id` VARCHAR(18) NOT NULL COMMENT 'Customer List Upload ID.',
  `operation` TEXT NOT NULL,
  `record_counts` TEXT DEFAULT NULL COMMENT 'Record processing counts',
  `state` TEXT NOT NULL,
  `updated_time` INT NOT NULL COMMENT 'Customer List Upload updated_time. Epoch (seconds).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CustomerListUploadCreateRequest` generated from model 'CustomerListUploadCreateRequest'
--

CREATE TABLE IF NOT EXISTS `CustomerListUploadCreateRequest` (
  `operation` TEXT NOT NULL,
  `total_parts` TINYINT UNSIGNED NOT NULL COMMENT 'Number of parts to upload the file in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CustomerListUploadCreateResponse` generated from model 'CustomerListUploadCreateResponse'
--

CREATE TABLE IF NOT EXISTS `CustomerListUploadCreateResponse` (
  `customer_list_upload` TEXT NOT NULL COMMENT 'The Customer List Upload created.',
  `s3_multipart_upload_data` TEXT NOT NULL COMMENT 'Pre-signed upload URLs corresponding to each part of the upload.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `customer_lists_list_200_response` generated from model 'customerUnderscorelistsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `customer_lists_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CustomerSegment` generated from model 'CustomerSegment'
--

CREATE TABLE IF NOT EXISTS `CustomerSegment` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'The ID of the ad account that this customer segment belongs to.',
  `audience_ids` JSON NOT NULL COMMENT 'Audience IDs included in the customer segment.',
  `created_time` INT DEFAULT NULL COMMENT 'Customer segment created time. Unix timestamp in seconds.',
  `id` TEXT DEFAULT NULL COMMENT 'Customer segment ID.',
  `name` TEXT NOT NULL COMMENT 'Customer segment name.',
  `status` TEXT DEFAULT NULL COMMENT 'Indicates whether the customer segment is active or deleted.',
  `updated_time` INT DEFAULT NULL COMMENT 'Customer segment updated time. Unix timestamp in seconds.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CustomerSegmentCreate` generated from model 'CustomerSegmentCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `CustomerSegmentCreate` (
  `audience_ids` JSON NOT NULL COMMENT 'Audience IDs included in the customer segment.',
  `name` TEXT NOT NULL COMMENT 'Customer segment name.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `customer_segment_list_200_response` generated from model 'customerUnderscoresegmentUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `customer_segment_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CustomerSegmentUpdateRequestUpdateWithRequiredBody` generated from model 'CustomerSegmentUpdateRequestUpdateWithRequiredBody'
-- Resource create or update operation model with required body fields (no OptionalProperties).
--

CREATE TABLE IF NOT EXISTS `CustomerSegmentUpdateRequestUpdateWithRequiredBody` (
  `audience_ids` JSON DEFAULT NULL COMMENT 'Audience IDs to update the customer segment to. Only applicable for UPDATE operations.',
  `id` TEXT NOT NULL COMMENT 'Customer segment ID.',
  `operation_type` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create or update operation model with required body fields (no OptionalProperties).';

--
-- Table structure for table `delete_business_membership_200_response` generated from model 'deleteUnderscorebusinessUnderscoremembershipUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `delete_business_membership_200_response` (
  `deleted_members` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DeleteBusinessMembershipBody` generated from model 'DeleteBusinessMembershipBody'
-- List of members with role to delete.
--

CREATE TABLE IF NOT EXISTS `DeleteBusinessMembershipBody` (
  `members` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='List of members with role to delete.';

--
-- Table structure for table `DeleteBusinessMembershipMember` generated from model 'DeleteBusinessMembershipMember'
-- Single instance of a business member to be removed from the business.
--

CREATE TABLE IF NOT EXISTS `DeleteBusinessMembershipMember` (
  `business_role` TEXT NOT NULL,
  `member_id` VARCHAR(25) NOT NULL COMMENT 'Unique identifier of the member'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Single instance of a business member to be removed from the business.';

--
-- Table structure for table `DeleteBusinessPartners` generated from model 'DeleteBusinessPartners'
--

CREATE TABLE IF NOT EXISTS `DeleteBusinessPartners` (
  `deleted_partners` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DeleteBusinessPartnersDelete` generated from model 'DeleteBusinessPartnersDelete'
--

CREATE TABLE IF NOT EXISTS `DeleteBusinessPartnersDelete` (
  `partner_ids` JSON NOT NULL COMMENT 'A list of partner ids to be deleted',
  `partner_type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DeleteMemberAccessResult` generated from model 'DeleteMemberAccessResult'
-- The terminated asset access.
--

CREATE TABLE IF NOT EXISTS `DeleteMemberAccessResult` (
  `asset_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of the business asset.',
  `member_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of the business member.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The terminated asset access.';

--
-- Table structure for table `DeleteMemberAccessResultsResponseArray` generated from model 'DeleteMemberAccessResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `DeleteMemberAccessResultsResponseArray` (
  `items` JSON DEFAULT NULL COMMENT 'List of member asset permissions that were deleted.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DeleteMemberAssetAccessItem` generated from model 'DeleteMemberAssetAccessItem'
--

CREATE TABLE IF NOT EXISTS `DeleteMemberAssetAccessItem` (
  `asset_id` VARCHAR(25) NOT NULL COMMENT 'Id of the asset on which to remove member permissions.',
  `member_id` VARCHAR(25) NOT NULL COMMENT 'Unique identifier of the member on which to perform the asset permission removal'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DeletePartnerAssetAccessBody` generated from model 'DeletePartnerAssetAccessBody'
-- An object with a list of partner asset accesses to delete.
--

CREATE TABLE IF NOT EXISTS `DeletePartnerAssetAccessBody` (
  `accesses` JSON NOT NULL COMMENT 'List of partner asset accesses to delete.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An object with a list of partner asset accesses to delete.';

--
-- Table structure for table `DeletePartnerAssetAccessItem` generated from model 'DeletePartnerAssetAccessItem'
--

CREATE TABLE IF NOT EXISTS `DeletePartnerAssetAccessItem` (
  `asset_id` VARCHAR(25) NOT NULL COMMENT 'Unique identifier of the business asset.',
  `partner_id` VARCHAR(25) NOT NULL COMMENT 'Unique identifier of a business partner to update asset access to.',
  `partner_type` ENUM('INTERNAL', 'EXTERNAL') DEFAULT 'INTERNAL' COMMENT 'If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DeletePartnerAssetAccessResult` generated from model 'DeletePartnerAssetAccessResult'
-- The terminated asset access.
--

CREATE TABLE IF NOT EXISTS `DeletePartnerAssetAccessResult` (
  `asset_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a business asset.',
  `asset_type` TEXT DEFAULT NULL COMMENT 'Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.',
  `is_shared_partner` TINYINT(1) DEFAULT NULL COMMENT 'If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset. If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset.',
  `partner_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a business partner.',
  `permissions` JSON DEFAULT NULL COMMENT 'Permission levels member or partner has on an asset.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The terminated asset access.';

--
-- Table structure for table `DeletePartnerAssetAccessResultsResponseArray` generated from model 'DeletePartnerAssetAccessResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `DeletePartnerAssetAccessResultsResponseArray` (
  `items` JSON DEFAULT NULL COMMENT 'List of terminated partner asset accesses.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `delivery_metrics_get_200_response` generated from model 'deliveryUnderscoremetricsUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `delivery_metrics_get_200_response` (
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DeliveryMetricsResponseItemsItems` generated from model 'DeliveryMetricsResponseItemsItems'
--

CREATE TABLE IF NOT EXISTS `DeliveryMetricsResponseItemsItems` (
  `category` ENUM('ADS', 'ORGANIC') DEFAULT NULL COMMENT 'Category name',
  `definition` TEXT DEFAULT NULL COMMENT 'How the metric is defined.',
  `display_name` TEXT DEFAULT NULL COMMENT 'Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.',
  `name` TEXT DEFAULT NULL COMMENT 'Metric&#39;s name.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DetailedError` generated from model 'DetailedError'
-- Used for including extra details to a base error
--

CREATE TABLE IF NOT EXISTS `DetailedError` (
  `code` INT NOT NULL,
  `details` JSON NOT NULL,
  `message` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Used for including extra details to a base error';

--
-- Table structure for table `DynamicTitlesDownloadCSV` generated from model 'DynamicTitlesDownloadCSV'
--

CREATE TABLE IF NOT EXISTS `DynamicTitlesDownloadCSV` (
  `download_url` TEXT DEFAULT NULL COMMENT 'Pre-signed S3 URL to download the CSV file.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DynamicTitlesGetStatus` generated from model 'DynamicTitlesGetStatus'
--

CREATE TABLE IF NOT EXISTS `DynamicTitlesGetStatus` (
  `generated_count` INT DEFAULT NULL COMMENT 'The count of generated titles.',
  `is_ready` TINYINT(1) DEFAULT NULL COMMENT 'Whether dynamic titles have been generated and are ready to be reviewed for the ad group.',
  `reviewed_count` INT DEFAULT NULL COMMENT 'The count of advertiser reviewed titles.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DynamicTitlesProcessCSV` generated from model 'DynamicTitlesProcessCSV'
--

CREATE TABLE IF NOT EXISTS `DynamicTitlesProcessCSV` (
  `errors` JSON DEFAULT NULL COMMENT 'List of validation errors. Empty on success.',
  `status` TEXT DEFAULT NULL COMMENT 'Processing status. Present on success.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DynamicTitlesProcessCSVCreate` generated from model 'DynamicTitlesProcessCSVCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `DynamicTitlesProcessCSVCreate` (
  `request_id` TEXT NOT NULL COMMENT 'The request_id returned from the GET uploads endpoint.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `DynamicTitlesProcessCSVError` generated from model 'DynamicTitlesProcessCSVError'
--

CREATE TABLE IF NOT EXISTS `DynamicTitlesProcessCSVError` (
  `error_type` TEXT DEFAULT NULL COMMENT 'The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.',
  `row_number` INT DEFAULT NULL COMMENT 'The row number with a validation error. -1 indicates a file-level error.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DynamicTitlesUploadURL` generated from model 'DynamicTitlesUploadURL'
--

CREATE TABLE IF NOT EXISTS `DynamicTitlesUploadURL` (
  `existing_filename` TEXT DEFAULT NULL COMMENT 'If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.',
  `request_id` TEXT NOT NULL COMMENT 'Unique identifier for this upload session. Must be passed to the process endpoint.',
  `upload_url` TEXT NOT NULL COMMENT 'Pre-signed S3 PUT URL to upload the reviewed CSV file.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EntityDataChangeHistory` generated from model 'EntityDataChangeHistory'
--

CREATE TABLE IF NOT EXISTS `EntityDataChangeHistory` (
  `changed_field_id` TEXT DEFAULT NULL COMMENT 'A string identifier representing the changed field on the entity',
  `changed_field_name` TEXT DEFAULT NULL COMMENT 'The human readable name of the changed field on the entity',
  `data_type` TEXT DEFAULT NULL COMMENT 'Specifies the type of the field&#39;s data values',
  `new_data_value` TEXT DEFAULT NULL COMMENT 'A string representation of the value of the changed field, after the change',
  `old_data_value` TEXT DEFAULT NULL COMMENT 'A string representation of the value of the changed field, before the change'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EntityHistory` generated from model 'EntityHistory'
--

CREATE TABLE IF NOT EXISTS `EntityHistory` (
  `change_timestamp` INT DEFAULT NULL COMMENT 'A Unix timestamp representing the time of the change in seconds',
  `data_changes` JSON DEFAULT NULL COMMENT 'Properties associated with a particular change to an entity&#39;s data',
  `entity_id` TEXT DEFAULT NULL COMMENT 'The id of the entity that was changed',
  `entity_name` TEXT DEFAULT NULL COMMENT 'The name of the entity that was changed',
  `ldap` TEXT DEFAULT NULL COMMENT 'The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users',
  `operation` TEXT DEFAULT NULL COMMENT 'The type of operation that caused the change',
  `user_id` TEXT DEFAULT NULL COMMENT 'The id of the user who initiated the change'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EntityLabel` generated from model 'EntityLabel'
--

CREATE TABLE IF NOT EXISTS `EntityLabel` (
  `entity_id` TEXT NOT NULL COMMENT 'Entity ID to apply label to.',
  `entity_type` TEXT DEFAULT NULL,
  `label_id` TEXT NOT NULL COMMENT 'Label ID.',
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EntityLabelError` generated from model 'EntityLabelError'
--

CREATE TABLE IF NOT EXISTS `EntityLabelError` (
  `data` TEXT DEFAULT NULL,
  `error_messages` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ErrorDetail` generated from model 'ErrorDetail'
--

CREATE TABLE IF NOT EXISTS `ErrorDetail` (
  `count` INT NOT NULL COMMENT 'Number of records with this error',
  `error_code` INT NOT NULL COMMENT 'Numeric error code',
  `message` TEXT NOT NULL COMMENT 'Error message description'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EventData` generated from model 'EventData'
--     Optional for VISITOR &#x60;audience_type&#x60;.     With the Pinterest tag, you can use event data to capture event details from your website.     This object lists all the available predefined event data fields in the Pinterest tag.     You can include these event data fields as part of a VISITOR audience’s &#x60;rule&#x60;; however, you **must** specify an &#x60;event&#x60; for the &#x60;event_data&#x60; fields to be evaluated.     Besides what’s listed, you can also create your own set of &#x60;event_data&#x60; fields and define their usages or purposes according to your website needs.     However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields&#39; data.     Examples per &#x60;event&#x60; type:     &#x60;pagevisit&#x60;     \&quot;event_data\&quot;: { \&quot;page_name\&quot;: \&quot;My online store 123 | view items | shoe\&quot; }     &#x60;signup&#x60;     \&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;New release promotion\&quot; }     &#x60;checkout&#x60;     \&quot;event_data\&quot;: { \&quot;value\&quot;: 116, \&quot;order_quantity\&quot;: 2, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Pillows (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;11\&quot;, \&quot;product_price\&quot;: 48, \&quot;product_quantity\&quot;: 1 }, { \&quot;product_name\&quot;: \&quot;Pillows, Large (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;15\&quot;, \&quot;product_price\&quot;: 68, \&quot;product_quantity\&quot;: 1 } ] }     &#x60;addtocart&#x60;     \&quot;event_data\&quot;: { \&quot;value\&quot;: 499, \&quot;order_quantity\&quot;: 1, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Red leather boots\&quot;, \&quot;product_id\&quot;: \&quot;3486\&quot;, \&quot;product_category\&quot;: \&quot;shoe\&quot;, \&quot;product_variant_id\&quot;: \&quot;JB11103000\&quot;, \&quot;product_price\&quot;: 499, \&quot;product_quantity\&quot;: \&quot;1\&quot;, \&quot;product_brand\&quot;: \&quot;My brand\&quot; }]}     &#x60;watchvideo&#x60;     \&quot;event_data\&quot;: { \&quot;video_title\&quot; : \&quot;My Product Video 01\&quot; }     &#x60;lead&#x60;     \&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;Newsletter\&quot; }
--

CREATE TABLE IF NOT EXISTS `EventData` (
  `currency` TEXT DEFAULT NULL COMMENT 'Currency. For example, &#39;USD&#39;.',
  `lead_type` TEXT DEFAULT NULL COMMENT 'Promotion code. For example, &#39;Newsletter&#39;.',
  `line_items` TEXT DEFAULT NULL,
  `order_id` TEXT DEFAULT NULL COMMENT 'Order ID. For example, &#39;X-151481&#39;.',
  `order_quantity` INT DEFAULT NULL COMMENT 'Order quantity. For example, 1.',
  `page_name` TEXT DEFAULT NULL COMMENT 'Page name. For example, &#39;Our Favorite Pins on Pinterest&#39;.',
  `promo_code` TEXT DEFAULT NULL COMMENT 'Promotion code. For example, &#39;WINTER10&#39;.',
  `property` TEXT DEFAULT NULL COMMENT 'Property. For example, &#39;Athleta&#39;.',
  `search_query` TEXT DEFAULT NULL COMMENT 'Search query string. For example, &#39;boots&#39;.',
  `value` TEXT DEFAULT NULL COMMENT 'Product value. For example, &#39;199.98&#39;.',
  `video_title` TEXT DEFAULT NULL COMMENT 'Video title. For example, &#39;How to style your Parker Boots&#39;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='    Optional for VISITOR &#x60;audience_type&#x60;.     With the Pinterest tag, you can use event data to capture event details from your website.     This object lists all the available predefined event data fields in the Pinterest tag.     You can include these event data fields as part of a VISITOR audience’s &#x60;rule&#x60;; however, you **must** specify an &#x60;event&#x60; for the &#x60;event_data&#x60; fields to be evaluated.     Besides what’s listed, you can also create your own set of &#x60;event_data&#x60; fields and define their usages or purposes according to your website needs.     However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields&#39; data.     Examples per &#x60;event&#x60; type:     &#x60;pagevisit&#x60;     \&quot;event_data\&quot;: { \&quot;page_name\&quot;: \&quot;My online store 123 | view items | shoe\&quot; }     &#x60;signup&#x60;     \&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;New release promotion\&quot; }     &#x60;checkout&#x60;     \&quot;event_data\&quot;: { \&quot;value\&quot;: 116, \&quot;order_quantity\&quot;: 2, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Pillows (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;11\&quot;, \&quot;product_price\&quot;: 48, \&quot;product_quantity\&quot;: 1 }, { \&quot;product_name\&quot;: \&quot;Pillows, Large (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;15\&quot;, \&quot;product_price\&quot;: 68, \&quot;product_quantity\&quot;: 1 } ] }     &#x60;addtocart&#x60;     \&quot;event_data\&quot;: { \&quot;value\&quot;: 499, \&quot;order_quantity\&quot;: 1, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Red leather boots\&quot;, \&quot;product_id\&quot;: \&quot;3486\&quot;, \&quot;product_category\&quot;: \&quot;shoe\&quot;, \&quot;product_variant_id\&quot;: \&quot;JB11103000\&quot;, \&quot;product_price\&quot;: 499, \&quot;product_quantity\&quot;: \&quot;1\&quot;, \&quot;product_brand\&quot;: \&quot;My brand\&quot; }]}     &#x60;watchvideo&#x60;     \&quot;event_data\&quot;: { \&quot;video_title\&quot; : \&quot;My Product Video 01\&quot; }     &#x60;lead&#x60;     \&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;Newsletter\&quot; }';

--
-- Table structure for table `EventQualityScore` generated from model 'EventQualityScore'
-- Schema for GET Conversion EQS response.
--

CREATE TABLE IF NOT EXISTS `EventQualityScore` (
  `ingestion_source` TEXT NOT NULL,
  `lookback_period` TEXT NOT NULL,
  `overall_status` TEXT NOT NULL,
  `quality_components` TEXT NOT NULL,
  `source_platform` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Schema for GET Conversion EQS response.';

--
-- Table structure for table `Exception` generated from model 'Exception'
--

CREATE TABLE IF NOT EXISTS `Exception` (
  `code` INT DEFAULT NULL,
  `message` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `FeaturedTrend` generated from model 'FeaturedTrend'
-- Featured trending topics for a specific interest and market
--

CREATE TABLE IF NOT EXISTS `FeaturedTrend` (
  `interest` TEXT NOT NULL COMMENT 'The main interest category',
  `market` TEXT DEFAULT NULL COMMENT 'Market code (e.g., &#39;US&#39;, &#39;UK&#39;, etc.)',
  `trends` JSON DEFAULT NULL COMMENT 'List of trending topics within this interest category'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Featured trending topics for a specific interest and market';

--
-- Table structure for table `feed_processing_results_list_200_response` generated from model 'feedUnderscoreprocessingUnderscoreresultsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `feed_processing_results_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `feeds_list_200_response` generated from model 'feedsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `feeds_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `FollowUser` generated from model 'FollowUser'
--

CREATE TABLE IF NOT EXISTS `FollowUser` (
  `type` TEXT DEFAULT NULL COMMENT 'Always &#39;user&#39;',
  `username` TEXT DEFAULT NULL COMMENT 'Username'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `FollowUserCreate` generated from model 'FollowUserCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `FollowUserCreate` (
  `auto_follow` TINYINT(1) DEFAULT NULL COMMENT '  Whether this request comes as result of auto-follow after clicking on a link.   Follow links can be used by partners on their site or in emails.   Only selected partners can be followed this way. We verify that partner can be auto-followed.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `followers_list_200_response` generated from model 'followersUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `followers_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `FrequencyGoalMetadata` generated from model 'FrequencyGoalMetadata'
-- Frequency target can only be between 2 and 20
--

CREATE TABLE IF NOT EXISTS `FrequencyGoalMetadata` (
  `frequency` TINYINT UNSIGNED DEFAULT NULL,
  `timerange` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Frequency target can only be between 2 and 20';

--
-- Table structure for table `FrequencyMultipliers` generated from model 'FrequencyMultipliers'
-- This represents a mapping from impression count to a bid price adjustment for frequency-based bidding.  Keys are impression counts (0-10) representing how many times a user has seen the ad. Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price. A value of 0 will stop distribution for this impression count. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
--

CREATE TABLE IF NOT EXISTS `FrequencyMultipliers` (
  `IMPRESSION_COUNT` TEXT DEFAULT NULL COMMENT 'Impression count identifier.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This represents a mapping from impression count to a bid price adjustment for frequency-based bidding.  Keys are impression counts (0-10) representing how many times a user has seen the ad. Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price. A value of 0 will stop distribution for this impression count. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).';

--
-- Table structure for table `GenderDemographics` generated from model 'GenderDemographics'
-- Gender demographic distribution
--

CREATE TABLE IF NOT EXISTS `GenderDemographics` (
  `female` DECIMAL(20, 9) NOT NULL COMMENT 'Percentage of female users',
  `male` DECIMAL(20, 9) NOT NULL COMMENT 'Percentage of male users',
  `unspecified` DECIMAL(20, 9) NOT NULL COMMENT 'Percentage of users with unspecified gender'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Gender demographic distribution';

--
-- Table structure for table `GenderFilter` generated from model 'GenderFilter'
--

CREATE TABLE IF NOT EXISTS `GenderFilter` (
  `GENDER` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GenderMultipliers` generated from model 'GenderMultipliers'
-- This represents a mapping from gender targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified gender in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
--

CREATE TABLE IF NOT EXISTS `GenderMultipliers` (
  `GENDER` TEXT DEFAULT NULL COMMENT 'Gender identifier.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This represents a mapping from gender targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified gender in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).';

--
-- Table structure for table `get_business_employers_200_response` generated from model 'getUnderscorebusinessUnderscoreemployersUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `get_business_employers_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `get_invites_200_response` generated from model 'getUnderscoreinvitesUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `get_invites_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
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
-- Table structure for table `HotelIdFilter` generated from model 'HotelIdFilter'
--

CREATE TABLE IF NOT EXISTS `HotelIdFilter` (
  `HOTEL_ID` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `HotelProcessingRecord` generated from model 'HotelProcessingRecord'
-- Object describing an item processing record
--

CREATE TABLE IF NOT EXISTS `HotelProcessingRecord` (
  `errors` JSON DEFAULT NULL COMMENT 'Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.',
  `hotel_id` TEXT DEFAULT NULL COMMENT 'The catalog hotel id in the merchant namespace',
  `status` TEXT DEFAULT NULL,
  `warnings` JSON DEFAULT NULL COMMENT 'Array with the validation warnings for the item processing record'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an item processing record';

--
-- Table structure for table `ImageDetails` generated from model 'ImageDetails'
--

CREATE TABLE IF NOT EXISTS `ImageDetails` (
  `height` INT NOT NULL,
  `url` TEXT NOT NULL,
  `width` INT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ImageMetadata` generated from model 'ImageMetadata'
--

CREATE TABLE IF NOT EXISTS `ImageMetadata` (
  `description` TEXT DEFAULT NULL,
  `images` TEXT DEFAULT NULL,
  `item_type` ENUM('image') NOT NULL COMMENT 'Discriminator literal identifying this as image metadata inside a &#x60;PinMediaMetadata&#x60; payload.',
  `link` TEXT DEFAULT NULL,
  `title` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ImageSize` generated from model 'ImageSize'
--

CREATE TABLE IF NOT EXISTS `ImageSize` (
  `1200x` TEXT DEFAULT NULL,
  `150x150` TEXT DEFAULT NULL,
  `400x300` TEXT DEFAULT NULL,
  `600x` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `IneligibleProductTagErrorItem` generated from model 'IneligibleProductTagErrorItem'
-- Error item for a product tag that failed eligibility check.
--

CREATE TABLE IF NOT EXISTS `IneligibleProductTagErrorItem` (
  `error_message` TEXT NOT NULL COMMENT 'Reason why the pin is ineligible for tagging.',
  `pin_id` TEXT NOT NULL COMMENT 'Pin ID that failed eligibility check.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Error item for a product tag that failed eligibility check.';

--
-- Table structure for table `IneligibleProductTagsErrorDetails` generated from model 'IneligibleProductTagsErrorDetails'
-- Details about ineligible product tags in the request.
--

CREATE TABLE IF NOT EXISTS `IneligibleProductTagsErrorDetails` (
  `product_tags` JSON NOT NULL COMMENT 'List of product tags that failed eligibility check.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Details about ineligible product tags in the request.';

--
-- Table structure for table `InnerProductCategoriesMetricsHighlights` generated from model 'InnerProductCategoriesMetricsHighlights'
--

CREATE TABLE IF NOT EXISTS `InnerProductCategoriesMetricsHighlights` (
  `pct_change_mom` DECIMAL(20, 9) NOT NULL COMMENT 'Month-over-month percentage change'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `IntegrationLog` generated from model 'IntegrationLog'
-- Schema for log sent from an integration application.
--

CREATE TABLE IF NOT EXISTS `IntegrationLog` (
  `advertiser_id` VARCHAR(128) DEFAULT NULL,
  `app_version_number` VARCHAR(20) DEFAULT NULL COMMENT 'Version number of the integration application.',
  `client_timestamp` INT NOT NULL COMMENT 'Timestamp in milliseconds of when the log was executed at the client.',
  `error` TEXT DEFAULT NULL,
  `event_type` TEXT NOT NULL COMMENT 'Log event type',
  `external_business_id` TEXT DEFAULT NULL,
  `feed_profile_id` VARCHAR(128) DEFAULT NULL,
  `log_level` TEXT NOT NULL COMMENT 'Log level type',
  `merchant_id` VARCHAR(128) DEFAULT NULL,
  `message` TEXT DEFAULT NULL COMMENT 'Explanation of the event that occured.',
  `platform_version_number` VARCHAR(20) DEFAULT NULL COMMENT 'Version number of the platform the integration application is running on.',
  `request` TEXT DEFAULT NULL,
  `tag_id` VARCHAR(128) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Schema for log sent from an integration application.';

--
-- Table structure for table `IntegrationLogClientError` generated from model 'IntegrationLogClientError'
-- System error details included in the log sent by the client.
--

CREATE TABLE IF NOT EXISTS `IntegrationLogClientError` (
  `cause` TEXT DEFAULT NULL COMMENT 'Original cause of the error.',
  `column_number` INT DEFAULT NULL COMMENT 'Column number in the line of the file that raised the error.',
  `file_name` TEXT DEFAULT NULL COMMENT 'Filename where the error happened.',
  `line_number` INT DEFAULT NULL COMMENT 'Line number where the error happened.',
  `message` TEXT DEFAULT NULL COMMENT 'Human-readable description of the error.',
  `message_detail` TEXT DEFAULT NULL COMMENT 'More detail about the message.',
  `name` TEXT DEFAULT NULL COMMENT 'Filename where the error happened.',
  `number` INT DEFAULT NULL COMMENT 'Integer that specifies the error code.',
  `stack_trace` TEXT DEFAULT NULL COMMENT 'Stack trace of where the error happened.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='System error details included in the log sent by the client.';

--
-- Table structure for table `IntegrationLogClientRequest` generated from model 'IntegrationLogClientRequest'
-- HTTP request details included in the log sent by the client.
--

CREATE TABLE IF NOT EXISTS `IntegrationLogClientRequest` (
  `host` TEXT NOT NULL COMMENT 'HTTP request host from host header.',
  `method` TEXT NOT NULL,
  `path` TEXT NOT NULL COMMENT 'HTTP request path.',
  `request_headers` JSON DEFAULT NULL COMMENT 'HTTP request headers as key-value pairs.',
  `response_headers` JSON DEFAULT NULL COMMENT 'HTTP response headers as key-value pairs.',
  `response_status_code` INT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='HTTP request details included in the log sent by the client.';

--
-- Table structure for table `IntegrationLogsInvalidLogResponse` generated from model 'IntegrationLogsInvalidLogResponse'
-- Schema describing the response when a log has invalid fields.
--

CREATE TABLE IF NOT EXISTS `IntegrationLogsInvalidLogResponse` (
  `rejected_logs` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Schema describing the response when a log has invalid fields.';

--
-- Table structure for table `IntegrationLogsInvalidLogResponseRejectedLogsItems` generated from model 'IntegrationLogsInvalidLogResponseRejectedLogsItems'
--

CREATE TABLE IF NOT EXISTS `IntegrationLogsInvalidLogResponseRejectedLogsItems` (
  `field` TEXT NOT NULL COMMENT 'The field name containing an invalid value.',
  `log_index` INT DEFAULT NULL COMMENT 'Index of the log in the batch.',
  `reason` TEXT NOT NULL COMMENT 'The reason the value is invalid.',
  `value` TEXT NOT NULL COMMENT 'The value that is invalid.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `IntegrationLogsRequestCreate` generated from model 'IntegrationLogsRequestCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `IntegrationLogsRequestCreate` (
  `logs` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `IntegrationLogsSuccessResponse` generated from model 'IntegrationLogsSuccessResponse'
-- Response when logs are successfully processed.
--

CREATE TABLE IF NOT EXISTS `IntegrationLogsSuccessResponse` (
  `message` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Response when logs are successfully processed.';

--
-- Table structure for table `IntegrationMetadata` generated from model 'IntegrationMetadata'
-- Integration metadata
--

CREATE TABLE IF NOT EXISTS `IntegrationMetadata` (
  `additional_id_1` TEXT DEFAULT NULL,
  `connected_advertiser_id` TEXT DEFAULT NULL,
  `connected_lba_id` TEXT DEFAULT NULL,
  `connected_merchant_id` TEXT DEFAULT NULL,
  `connected_tag_id` TEXT DEFAULT NULL,
  `connected_user_id` TEXT DEFAULT NULL,
  `created_timestamp` DECIMAL(20, 9) DEFAULT NULL,
  `external_business_id` TEXT DEFAULT NULL COMMENT 'External business ID for the integration.',
  `id` TEXT DEFAULT NULL,
  `partner_access_token_expiry` DECIMAL(20, 9) DEFAULT NULL,
  `partner_metadata` TEXT DEFAULT NULL,
  `partner_refresh_token_expiry` DECIMAL(20, 9) DEFAULT NULL,
  `scopes` TEXT DEFAULT NULL,
  `updated_timestamp` DECIMAL(20, 9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Integration metadata';

--
-- Table structure for table `IntegrationMetadataCreate` generated from model 'IntegrationMetadataCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `IntegrationMetadataCreate` (
  `additional_id_1` TEXT DEFAULT NULL,
  `connected_advertiser_id` TEXT DEFAULT NULL,
  `connected_lba_id` TEXT DEFAULT NULL,
  `connected_merchant_id` TEXT DEFAULT NULL,
  `connected_tag_id` TEXT DEFAULT NULL,
  `external_business_id` TEXT DEFAULT NULL COMMENT 'External business ID for the integration.',
  `partner_access_token` TEXT DEFAULT NULL,
  `partner_access_token_expiry` DECIMAL(20, 9) DEFAULT NULL,
  `partner_metadata` TEXT DEFAULT NULL,
  `partner_primary_email` TEXT DEFAULT NULL,
  `partner_refresh_token` TEXT DEFAULT NULL,
  `partner_refresh_token_expiry` DECIMAL(20, 9) DEFAULT NULL,
  `scopes` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `IntegrationMetadataUpdate` generated from model 'IntegrationMetadataUpdate'
-- Resource create or update operation model.
--

CREATE TABLE IF NOT EXISTS `IntegrationMetadataUpdate` (
  `additional_id_1` TEXT DEFAULT NULL,
  `connected_advertiser_id` TEXT DEFAULT NULL,
  `connected_lba_id` TEXT DEFAULT NULL,
  `connected_merchant_id` TEXT DEFAULT NULL,
  `connected_tag_id` TEXT DEFAULT NULL,
  `partner_access_token` TEXT DEFAULT NULL,
  `partner_access_token_expiry` DECIMAL(20, 9) DEFAULT NULL,
  `partner_metadata` TEXT DEFAULT NULL,
  `partner_primary_email` TEXT DEFAULT NULL,
  `partner_refresh_token` TEXT DEFAULT NULL,
  `partner_refresh_token_expiry` DECIMAL(20, 9) DEFAULT NULL,
  `scopes` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create or update operation model.';

--
-- Table structure for table `IntegrationRecord` generated from model 'IntegrationRecord'
-- Integration record
--

CREATE TABLE IF NOT EXISTS `IntegrationRecord` (
  `additional_id_1` TEXT DEFAULT NULL,
  `connected_advertiser_id` TEXT DEFAULT NULL,
  `connected_lba_id` TEXT DEFAULT NULL,
  `connected_merchant_id` TEXT DEFAULT NULL,
  `connected_tag_id` TEXT DEFAULT NULL,
  `connected_user_id` TEXT DEFAULT NULL,
  `created_time` INT DEFAULT NULL,
  `external_business_id` TEXT DEFAULT NULL,
  `id` TEXT NOT NULL COMMENT 'Integration record ID.',
  `partner_access_token` TEXT DEFAULT NULL,
  `partner_access_token_expiry` INT DEFAULT NULL,
  `partner_metadata` TEXT DEFAULT NULL,
  `partner_primary_email` TEXT DEFAULT NULL,
  `partner_refresh_token` TEXT DEFAULT NULL,
  `partner_refresh_token_expiry` INT DEFAULT NULL,
  `scopes` TEXT DEFAULT NULL,
  `updated_time` INT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Integration record';

--
-- Table structure for table `integrations_get_list_200_response` generated from model 'integrationsUnderscoregetUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `integrations_get_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Interest` generated from model 'Interest'
--

CREATE TABLE IF NOT EXISTS `Interest` (
  `canonical_url` TEXT DEFAULT NULL,
  `id` TEXT DEFAULT NULL,
  `key` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `InviteActionResultItem` generated from model 'InviteActionResultItem'
-- An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).
--

CREATE TABLE IF NOT EXISTS `InviteActionResultItem` (
  `exception` TEXT DEFAULT NULL,
  `invite` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).';

--
-- Table structure for table `InviteAssetsSummary` generated from model 'InviteAssetsSummary'
-- Ad accounts and profiles the member/partner will be granted access to with this invite/request.
--

CREATE TABLE IF NOT EXISTS `InviteAssetsSummary` (
  `ad_accounts` JSON DEFAULT NULL COMMENT 'List of ad account IDs and respective permission levels that will be assigned.',
  `profiles` JSON DEFAULT NULL COMMENT 'List of profile IDs and respective permission levels that will be assigned.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ad accounts and profiles the member/partner will be granted access to with this invite/request.';

--
-- Table structure for table `InviteAssetsSummaryItem` generated from model 'InviteAssetsSummaryItem'
--

CREATE TABLE IF NOT EXISTS `InviteAssetsSummaryItem` (
  `id` TEXT DEFAULT NULL COMMENT 'Unique identifier of the asset.',
  `permissions` JSON DEFAULT NULL COMMENT 'Permission levels member or partner has on an asset.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `InviteBusinessRoleBinding` generated from model 'InviteBusinessRoleBinding'
-- An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
--

CREATE TABLE IF NOT EXISTS `InviteBusinessRoleBinding` (
  `created_by_business_id` TEXT DEFAULT NULL COMMENT 'Unique identifier for the business that created the invite/request.',
  `created_by_user_id` TEXT DEFAULT NULL COMMENT 'Unique identifier for the user that created the invite/request.',
  `id` TEXT DEFAULT NULL COMMENT 'Unique identifier of the invite/request.',
  `invite_data` TEXT DEFAULT NULL,
  `is_received_invite` TINYINT(1) DEFAULT NULL COMMENT 'Indicates whether the invite/request was received.',
  `user` TEXT DEFAULT NULL COMMENT 'Metadata for the member/partner that was sent the invite/request.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.';

--
-- Table structure for table `InviteDataResponse` generated from model 'InviteDataResponse'
-- Metadata for the invite/request.
--

CREATE TABLE IF NOT EXISTS `InviteDataResponse` (
  `invite_expiration` INT DEFAULT NULL COMMENT 'The date and time when the invite/request will expire. Returned in milliseconds.',
  `invite_status` TEXT DEFAULT NULL COMMENT 'The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.',
  `invite_type` TEXT DEFAULT NULL COMMENT 'The type of invite. - &#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. - &#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. - &#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets.',
  `last_updated_time` INT DEFAULT NULL COMMENT 'The date and time the invite/request was last updated. Returned in milliseconds.',
  `sent_at` INT DEFAULT NULL COMMENT 'The date and time the invite/request was sent/created. Returned in milliseconds.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Metadata for the invite/request.';

--
-- Table structure for table `InviteExceptionResponse` generated from model 'InviteExceptionResponse'
-- An exception object if there is an error performing the action. Will only be provided if there is an error.
--

CREATE TABLE IF NOT EXISTS `InviteExceptionResponse` (
  `code` INT DEFAULT NULL COMMENT 'Error code associated with the error in performing the action on the invite/request.',
  `invite_or_request_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of the invite/request.',
  `message` TEXT DEFAULT NULL COMMENT 'Error message associated with the error in performing the action on the invite/request.',
  `users_or_partner_ids` JSON DEFAULT NULL COMMENT 'A list of users&#39; usernames or emails OR a list of partner ids that caused the error.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An exception object if there is an error performing the action. Will only be provided if there is an error.';

--
-- Table structure for table `InviteResponse` generated from model 'InviteResponse'
-- A user&#39;s username or email OR a partner id that caused the error.
--

CREATE TABLE IF NOT EXISTS `InviteResponse` (
  `assets_summary` TEXT DEFAULT NULL,
  `business_roles` JSON DEFAULT NULL COMMENT 'The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.',
  `created_by_business` TEXT DEFAULT NULL COMMENT 'Metadata for the business that created the invite/request.',
  `created_by_user` TEXT DEFAULT NULL COMMENT 'Metadata for the user that created the invite/request.',
  `created_time` INT DEFAULT NULL COMMENT 'The time the invite/request was created. Returned in milliseconds.',
  `id` TEXT DEFAULT NULL COMMENT 'Unique identifier of the invite/request.',
  `invite_data` TEXT DEFAULT NULL,
  `is_received_invite` TINYINT(1) DEFAULT NULL COMMENT 'Indicates whether the invite/request was received.',
  `user` TEXT DEFAULT NULL COMMENT 'Metadata for the member/partner that was sent the invite/request.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A user&#39;s username or email OR a partner id that caused the error.';

--
-- Table structure for table `ItemAttributes` generated from model 'ItemAttributes'
--

CREATE TABLE IF NOT EXISTS `ItemAttributes` (
  `ad_image_0_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_0_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_10_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_10_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_11_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_11_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_12_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_12_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_13_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_13_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_14_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_14_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_15_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_15_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_16_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_16_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_17_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_17_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_18_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_18_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_19_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_19_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_1_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_1_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_2_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_2_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_3_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_3_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_4_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_4_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_5_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_5_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_6_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_6_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_7_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_7_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_8_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_8_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_9_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_9_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_link` TEXT DEFAULT NULL COMMENT 'Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking. Must begin with http:// or https://.',
  `ad_video_0_link` TEXT DEFAULT NULL COMMENT 'Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_video_0_tag` TEXT DEFAULT NULL COMMENT 'Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.',
  `ad_video_1_link` TEXT DEFAULT NULL COMMENT 'Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_video_1_tag` TEXT DEFAULT NULL COMMENT 'Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.',
  `ad_video_2_link` TEXT DEFAULT NULL COMMENT 'Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_video_2_tag` TEXT DEFAULT NULL COMMENT 'Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.',
  `adult` TINYINT(1) DEFAULT NULL COMMENT 'Set this attribute to TRUE if you&#39;re submitting items that are considered \&quot;adult\&quot;. These will not be shown on Pinterest.',
  `age_group` TEXT DEFAULT NULL COMMENT 'The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): &#39;newborn&#39;, &#39;infant&#39;, &#39;toddler&#39;, &#39;kids&#39;, or &#39;adult&#39;.',
  `android_deep_link` TEXT DEFAULT NULL COMMENT 'The deep link to the product on the Android app.',
  `availability` TEXT DEFAULT NULL COMMENT 'The availability of the product. Must be one of the following values (upper or lowercased): &#39;in stock&#39;, &#39;out of stock&#39;, &#39;preorder&#39;.',
  `average_review_rating` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Average reviews for the item. Can be a number from 1-5.',
  `brand` TEXT DEFAULT NULL COMMENT 'The brand of the product.',
  `checkout_enabled` TINYINT(1) DEFAULT NULL COMMENT 'This attribute is not supported anymore.',
  `color` TEXT DEFAULT NULL COMMENT 'The primary color of the product.',
  `condition` TEXT DEFAULT NULL COMMENT 'The condition of the product. Must be one of the following values (upper or lowercased): &#39;new&#39;, &#39;used&#39;, or &#39;refurbished&#39;.',
  `custom_label_0` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.',
  `custom_label_1` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.',
  `custom_label_2` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.',
  `custom_label_3` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.',
  `custom_label_4` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.',
  `custom_number_0` INT DEFAULT NULL COMMENT 'An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.',
  `custom_number_1` INT DEFAULT NULL COMMENT 'An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.',
  `custom_number_2` INT DEFAULT NULL COMMENT 'An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.',
  `custom_number_3` INT DEFAULT NULL COMMENT 'An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.',
  `custom_number_4` INT DEFAULT NULL COMMENT 'An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.',
  `description` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 10000 characters. The description of the product.',
  `free_shipping_label` TINYINT(1) DEFAULT NULL COMMENT 'The item is free to ship.',
  `free_shipping_limit` TEXT DEFAULT NULL COMMENT 'The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.',
  `gender` TEXT DEFAULT NULL COMMENT 'The gender associated with the product. Must be one of the following values (upper or lowercased): &#39;male&#39;, &#39;female&#39;, or &#39;unisex&#39;.',
  `google_product_category` TEXT DEFAULT NULL COMMENT 'The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.',
  `gtin` TEXT DEFAULT NULL,
  `id` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 127 characters. The user-created unique ID that represents the product. Only Unicode characters are accepted.',
  `installment_price` TEXT DEFAULT NULL COMMENT 'Installment price of the product. Expected format: &lt;payment_count&gt;:&lt;payment_amount&gt; &lt;currency&gt;',
  `ios_deep_link` TEXT DEFAULT NULL COMMENT 'The deep link to the product on the iOS app.',
  `item_group_id` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 127 characters. The parent ID of the product.',
  `last_updated_time` BIGINT DEFAULT NULL COMMENT 'The millisecond timestamp when the item was lastly modified by the merchant.',
  `link` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 511 characters. The landing page for the product.',
  `material` TEXT DEFAULT NULL COMMENT 'The material used to make the product.',
  `min_ad_price` TEXT DEFAULT NULL COMMENT 'The minimum advertised price of the product. It supports the following formats: \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.',
  `mobile_link` TEXT DEFAULT NULL COMMENT 'The mobile-optimized version of your landing page. Must begin with http:// or https://.',
  `mpn` TEXT DEFAULT NULL COMMENT 'Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.',
  `number_of_ratings` INT DEFAULT NULL COMMENT 'The number of ratings for the item.',
  `number_of_reviews` INT DEFAULT NULL COMMENT 'The number of reviews available for the item.',
  `pattern` TEXT DEFAULT NULL COMMENT 'The description of the pattern used for the product.',
  `price` TEXT DEFAULT NULL COMMENT 'The price of the product. It supports the following formats: \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.',
  `product_type` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 1000 characters. The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by \&quot; &gt; \&quot;.',
  `promotion_id` TEXT DEFAULT NULL COMMENT 'A unique identifier referencing the promotion associated with this catalog item.',
  `sale_price` TEXT DEFAULT NULL COMMENT 'The discounted price of the product. The sale_price must be lower than the price. It supports the following formats: \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;.',
  `sale_price_effective_date` TEXT DEFAULT NULL COMMENT 'Sale price effective date. Expected format: &lt;start_date&gt;/&lt;end_date&gt; (ISO 8601 format)',
  `shipping` TEXT DEFAULT NULL COMMENT 'Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.',
  `shipping_height` TEXT DEFAULT NULL COMMENT 'The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.',
  `shipping_weight` TEXT DEFAULT NULL COMMENT 'The weight of the product. Ensure there is a space between the numeric string and the metric.',
  `shipping_width` TEXT DEFAULT NULL COMMENT 'The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.',
  `size` TEXT DEFAULT NULL COMMENT 'The size of the product.',
  `size_system` TEXT DEFAULT NULL COMMENT 'Indicates the country&#39;s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): &#39;US&#39;, &#39;UK&#39;, &#39;EU&#39;, &#39;DE&#39;, &#39;FR&#39;, &#39;JP&#39;, &#39;CN&#39;, &#39;IT&#39;, &#39;BR&#39;, &#39;MEX&#39;, or &#39;AU&#39;.',
  `size_type` TEXT DEFAULT NULL COMMENT 'Additional description for the size. Must be one of the following values (upper or lowercased): &#39;regular&#39;, &#39;petite&#39;, &#39;plus&#39;, &#39;big_and_tall&#39;, or &#39;maternity&#39;.',
  `tax` TEXT DEFAULT NULL COMMENT 'Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.',
  `title` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 500 characters. The name of the product.',
  `unit_pricing_base_measure` TEXT DEFAULT NULL COMMENT 'Unit pricing base measure of the product. Expected format: &lt;base_measure&gt; &lt;unit_type&gt;',
  `unit_pricing_measure` TEXT DEFAULT NULL COMMENT 'Unit pricing total measure of the product. Expected format: &lt;total_units&gt; &lt;unit_type&gt;',
  `variant_names` JSON DEFAULT NULL COMMENT 'Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.',
  `variant_values` JSON DEFAULT NULL COMMENT 'Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.',
  `additional_image_link` JSON DEFAULT NULL COMMENT '&lt;&#x3D; 2000 characters. The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.',
  `ai_disclosures` JSON DEFAULT NULL COMMENT 'AI content disclosures for individual assets (image_link, additional_image_link, or video_link) on this item. Each entry declares which disclosure types apply to a single asset URL.',
  `image_link` JSON DEFAULT NULL COMMENT '&lt;&#x3D; 2000 characters. The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.',
  `video_link` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 2,000 characters. Hosted link to the product video. File types must be .mp4, .mov or .m4v. File size cannot exceed 2GB.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemAttributesRequest` generated from model 'ItemAttributesRequest'
--

CREATE TABLE IF NOT EXISTS `ItemAttributesRequest` (
  `ad_image_0_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_0_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_10_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_10_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_11_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_11_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_12_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_12_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_13_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_13_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_14_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_14_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_15_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_15_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_16_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_16_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_17_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_17_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_18_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_18_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_19_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_19_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_1_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_1_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_2_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_2_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_3_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_3_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_4_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_4_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_5_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_5_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_6_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_6_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_7_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_7_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_8_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_8_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_9_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_9_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_link` TEXT DEFAULT NULL COMMENT 'Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking. Must begin with http:// or https://.',
  `ad_video_0_link` TEXT DEFAULT NULL COMMENT 'Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_video_0_tag` TEXT DEFAULT NULL COMMENT 'Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.',
  `ad_video_1_link` TEXT DEFAULT NULL COMMENT 'Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_video_1_tag` TEXT DEFAULT NULL COMMENT 'Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.',
  `ad_video_2_link` TEXT DEFAULT NULL COMMENT 'Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_video_2_tag` TEXT DEFAULT NULL COMMENT 'Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.',
  `additional_image_link` JSON DEFAULT NULL COMMENT '&lt;&#x3D; 2000 characters The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.',
  `adult` TINYINT(1) DEFAULT NULL COMMENT 'Set this attribute to TRUE if you&#39;re submitting items that are considered \&quot;adult\&quot;. These will not be shown on Pinterest.',
  `age_group` TEXT DEFAULT NULL COMMENT 'The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): &#39;newborn&#39;, &#39;infant&#39;, &#39;toddler&#39;, &#39;kids&#39;, or &#39;adult&#39;.',
  `ai_disclosures` JSON DEFAULT NULL COMMENT 'AI content disclosures for individual assets (image_link, additional_image_link, or video_link) on this item. Each entry declares which disclosure types apply to a single asset URL.',
  `android_deep_link` TEXT DEFAULT NULL COMMENT 'The deep link to the product on the Android app.',
  `availability` TEXT DEFAULT NULL COMMENT 'The availability of the product. Must be one of the following values (upper or lowercased): &#39;in stock&#39;, &#39;out of stock&#39;, &#39;preorder&#39;.',
  `average_review_rating` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Average reviews for the item. Can be a number from 1-5.',
  `brand` TEXT DEFAULT NULL COMMENT 'The brand of the product.',
  `checkout_enabled` TINYINT(1) DEFAULT NULL COMMENT 'This attribute is not supported anymore.',
  `color` TEXT DEFAULT NULL COMMENT 'The primary color of the product.',
  `condition` TEXT DEFAULT NULL COMMENT 'The condition of the product. Must be one of the following values (upper or lowercased): &#39;new&#39;, &#39;used&#39;, or &#39;refurbished&#39;.',
  `custom_label_0` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.',
  `custom_label_1` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.',
  `custom_label_2` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.',
  `custom_label_3` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.',
  `custom_label_4` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.',
  `custom_number_0` INT DEFAULT NULL COMMENT 'An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.',
  `custom_number_1` INT DEFAULT NULL COMMENT 'An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.',
  `custom_number_2` INT DEFAULT NULL COMMENT 'An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.',
  `custom_number_3` INT DEFAULT NULL COMMENT 'An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.',
  `custom_number_4` INT DEFAULT NULL COMMENT 'An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.',
  `description` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 10000 characters. The description of the product.',
  `free_shipping_label` TINYINT(1) DEFAULT NULL COMMENT 'The item is free to ship.',
  `free_shipping_limit` TEXT DEFAULT NULL COMMENT 'The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.',
  `gender` TEXT DEFAULT NULL COMMENT 'The gender associated with the product. Must be one of the following values (upper or lowercased): &#39;male&#39;, &#39;female&#39;, or &#39;unisex&#39;.',
  `google_product_category` TEXT DEFAULT NULL COMMENT 'The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.',
  `gtin` TEXT DEFAULT NULL,
  `id` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 127 characters. The user-created unique ID that represents the product. Only Unicode characters are accepted.',
  `image_link` TEXT DEFAULT NULL,
  `installment_price` TEXT DEFAULT NULL COMMENT 'Installment price of the product. Expected format: &lt;payment_count&gt;:&lt;payment_amount&gt; &lt;currency&gt;',
  `ios_deep_link` TEXT DEFAULT NULL COMMENT 'The deep link to the product on the iOS app.',
  `item_group_id` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 127 characters. The parent ID of the product.',
  `last_updated_time` BIGINT DEFAULT NULL COMMENT 'The millisecond timestamp when the item was lastly modified by the merchant.',
  `link` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 511 characters. The landing page for the product.',
  `material` TEXT DEFAULT NULL COMMENT 'The material used to make the product.',
  `min_ad_price` TEXT DEFAULT NULL COMMENT 'The minimum advertised price of the product. It supports the following formats: \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.',
  `mobile_link` TEXT DEFAULT NULL COMMENT 'The mobile-optimized version of your landing page. Must begin with http:// or https://.',
  `mpn` TEXT DEFAULT NULL COMMENT 'Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.',
  `number_of_ratings` INT DEFAULT NULL COMMENT 'The number of ratings for the item.',
  `number_of_reviews` INT DEFAULT NULL COMMENT 'The number of reviews available for the item.',
  `pattern` TEXT DEFAULT NULL COMMENT 'The description of the pattern used for the product.',
  `price` TEXT DEFAULT NULL COMMENT 'The price of the product. It supports the following formats: \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.',
  `product_type` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 1000 characters. The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by \&quot; &gt; \&quot;.',
  `promotion_id` TEXT DEFAULT NULL COMMENT 'A unique identifier referencing the promotion associated with this catalog item.',
  `sale_price` TEXT DEFAULT NULL COMMENT 'The discounted price of the product. The sale_price must be lower than the price. It supports the following formats: \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;.',
  `sale_price_effective_date` TEXT DEFAULT NULL COMMENT 'Sale price effective date. Expected format: &lt;start_date&gt;/&lt;end_date&gt; (ISO 8601 format)',
  `save_pin_disabled` TINYINT(1) DEFAULT false COMMENT 'By default, product pins created from a catalog are able to be saved by Pinners. If you want to disable the save pin feature, set this attribute to true. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.',
  `shipping` TEXT DEFAULT NULL COMMENT 'Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.',
  `shipping_height` TEXT DEFAULT NULL COMMENT 'The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.',
  `shipping_weight` TEXT DEFAULT NULL COMMENT 'The weight of the product. Ensure there is a space between the numeric string and the metric.',
  `shipping_width` TEXT DEFAULT NULL COMMENT 'The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.',
  `size` TEXT DEFAULT NULL COMMENT 'The size of the product.',
  `size_system` TEXT DEFAULT NULL COMMENT 'Indicates the country&#39;s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): &#39;US&#39;, &#39;UK&#39;, &#39;EU&#39;, &#39;DE&#39;, &#39;FR&#39;, &#39;JP&#39;, &#39;CN&#39;, &#39;IT&#39;, &#39;BR&#39;, &#39;MEX&#39;, or &#39;AU&#39;.',
  `size_type` TEXT DEFAULT NULL COMMENT 'Additional description for the size. Must be one of the following values (upper or lowercased): &#39;regular&#39;, &#39;petite&#39;, &#39;plus&#39;, &#39;big_and_tall&#39;, or &#39;maternity&#39;.',
  `tax` TEXT DEFAULT NULL COMMENT 'Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.',
  `title` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 500 characters. The name of the product.',
  `unit_pricing_base_measure` TEXT DEFAULT NULL COMMENT 'Unit pricing base measure of the product. Expected format: &lt;base_measure&gt; &lt;unit_type&gt;',
  `unit_pricing_measure` TEXT DEFAULT NULL COMMENT 'Unit pricing total measure of the product. Expected format: &lt;total_units&gt; &lt;unit_type&gt;',
  `variant_names` JSON DEFAULT NULL COMMENT 'Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.',
  `variant_values` JSON DEFAULT NULL COMMENT 'Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.',
  `video_link` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 2,000 characters Hosted link to the product video. File types for linked videos must be .mp4, .mov or .m4v. File size cannot exceed 2GB.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemCreateBatchRecord` generated from model 'ItemCreateBatchRecord'
-- Object describing an item batch record to create items
--

CREATE TABLE IF NOT EXISTS `ItemCreateBatchRecord` (
  `attributes` TEXT DEFAULT NULL,
  `item_id` TEXT DEFAULT NULL COMMENT 'The catalog item id in the merchant namespace'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an item batch record to create items';

--
-- Table structure for table `ItemDeleteBatchRecord` generated from model 'ItemDeleteBatchRecord'
-- Object describing an item batch record to delete items
--

CREATE TABLE IF NOT EXISTS `ItemDeleteBatchRecord` (
  `item_id` TEXT DEFAULT NULL COMMENT 'The catalog item id in the merchant namespace'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an item batch record to delete items';

--
-- Table structure for table `ItemDeleteDiscontinuedBatchRecord` generated from model 'ItemDeleteDiscontinuedBatchRecord'
-- Object describing an item batch record to discontinue items
--

CREATE TABLE IF NOT EXISTS `ItemDeleteDiscontinuedBatchRecord` (
  `item_id` TEXT DEFAULT NULL COMMENT 'The catalog item id in the merchant namespace'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an item batch record to discontinue items';

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
-- Table structure for table `ItemIdStoreCodePair` generated from model 'ItemIdStoreCodePair'
-- A pair of item_id and store_code that uniquely identifies a local inventory item
--

CREATE TABLE IF NOT EXISTS `ItemIdStoreCodePair` (
  `item_id` TEXT NOT NULL COMMENT 'Catalog item id in the merchant namespace',
  `store_code` TEXT NOT NULL COMMENT 'Store code for the local inventory item'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A pair of item_id and store_code that uniquely identifies a local inventory item';

--
-- Table structure for table `ItemProcessingRecord` generated from model 'ItemProcessingRecord'
-- Object describing an item processing record
--

CREATE TABLE IF NOT EXISTS `ItemProcessingRecord` (
  `errors` JSON DEFAULT NULL COMMENT 'Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.',
  `item_id` TEXT DEFAULT NULL COMMENT 'The catalog item id in the merchant namespace',
  `status` TEXT DEFAULT NULL,
  `warnings` JSON DEFAULT NULL COMMENT 'Array with the validation warnings for the item processing record'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an item processing record';

--
-- Table structure for table `ItemResponse` generated from model 'ItemResponse'
-- Object describing an item record or error. Discriminated by &#x60;item_response_kind&#x60; (one unique value per leaf).
--

CREATE TABLE IF NOT EXISTS `ItemResponse` (
  `attributes` TEXT DEFAULT NULL,
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `item_id` TEXT DEFAULT NULL COMMENT 'The catalog item id in the merchant namespace',
  `item_response_kind` ENUM('creative_assets_item_error') NOT NULL COMMENT 'Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.',
  `pins` JSON DEFAULT NULL COMMENT 'The pins mapped to the item',
  `hotel_id` TEXT DEFAULT NULL COMMENT 'The catalog hotel id in the merchant namespace',
  `creative_assets_id` TEXT DEFAULT NULL COMMENT 'The catalog creative assets id in the merchant namespace',
  `errors` JSON NOT NULL COMMENT 'Array with the errors for the item id requested'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an item record or error. Discriminated by &#x60;item_response_kind&#x60; (one unique value per leaf).';

--
-- Table structure for table `ItemUpdateBatchRecord` generated from model 'ItemUpdateBatchRecord'
-- Object describing an item batch record to update items
--

CREATE TABLE IF NOT EXISTS `ItemUpdateBatchRecord` (
  `attributes` TEXT DEFAULT NULL,
  `item_id` TEXT DEFAULT NULL COMMENT 'The catalog item id in the merchant namespace',
  `update_mask` JSON DEFAULT NULL COMMENT 'The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an item batch record to update items';

--
-- Table structure for table `ItemUpsertBatchRecord` generated from model 'ItemUpsertBatchRecord'
-- Object describing an item batch record to upsert items
--

CREATE TABLE IF NOT EXISTS `ItemUpsertBatchRecord` (
  `attributes` TEXT DEFAULT NULL,
  `item_id` TEXT DEFAULT NULL COMMENT 'The catalog item id in the merchant namespace'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an item batch record to upsert items';

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
-- Table structure for table `items_issues_list_200_response` generated from model 'itemsUnderscoreissuesUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `items_issues_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `items_post_200_response` generated from model 'itemsUnderscorepostUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `items_post_200_response` (
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Keyword` generated from model 'Keyword'
--

CREATE TABLE IF NOT EXISTS `Keyword` (
  `archived` TINYINT(1) DEFAULT NULL,
  `bid` INT DEFAULT NULL COMMENT '**Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.',
  `id` TEXT NOT NULL COMMENT 'Keyword ID .',
  `match_type` TEXT NOT NULL COMMENT 'Keyword [match type](/docs/api-features/targeting-overview/)',
  `parent_id` TEXT NOT NULL COMMENT 'Keyword parent entity ID (advertiser, campaign, ad group).',
  `parent_type` TEXT DEFAULT NULL COMMENT 'Parent entity type (advertiser, campaign, ad group).',
  `type` TEXT DEFAULT NULL COMMENT 'Always keyword',
  `value` TEXT NOT NULL COMMENT 'Keyword value (120 chars max).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `KeywordCreateItem` generated from model 'KeywordCreateItem'
--

CREATE TABLE IF NOT EXISTS `KeywordCreateItem` (
  `bid` INT DEFAULT NULL COMMENT '**Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.',
  `match_type` TEXT NOT NULL COMMENT 'Keyword [match type](/docs/api-features/targeting-overview/)',
  `value` TEXT NOT NULL COMMENT 'Keyword value (120 chars max).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `KeywordError` generated from model 'KeywordError'
--

CREATE TABLE IF NOT EXISTS `KeywordError` (
  `data` TEXT DEFAULT NULL,
  `error_messages` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `KeywordInfo` generated from model 'KeywordInfo'
-- Related Keyword information of the editorial article
--

CREATE TABLE IF NOT EXISTS `KeywordInfo` (
  `name` TEXT NOT NULL COMMENT 'Keyword Name',
  `pct_growth_mom` DECIMAL(20, 9) DEFAULT NULL COMMENT 'MoM growth as a percentage, if there is no growth rate, this field is not present'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Related Keyword information of the editorial article';

--
-- Table structure for table `KeywordMetrics` generated from model 'KeywordMetrics'
-- Keyword metrics JSON
--

CREATE TABLE IF NOT EXISTS `KeywordMetrics` (
  `keyword_query_volume` TEXT DEFAULT NULL COMMENT 'Keyword&#39;s search frequency. This value is based on keyword frequency in pepsi client response'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Keyword metrics JSON';

--
-- Table structure for table `KeywordMetricsResponse` generated from model 'KeywordMetricsResponse'
--

CREATE TABLE IF NOT EXISTS `KeywordMetricsResponse` (
  `keyword` TEXT DEFAULT NULL COMMENT 'Keyword name, e.g., \&quot;keyword\&quot;:\&quot;fashion outfits\&quot;',
  `metrics` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `KeywordUpdateGenerated` generated from model 'KeywordUpdateGenerated'
--

CREATE TABLE IF NOT EXISTS `KeywordUpdateGenerated` (
  `archived` TINYINT(1) DEFAULT NULL COMMENT 'Is keyword archived?',
  `bid` INT DEFAULT NULL COMMENT '&lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.',
  `id` TEXT NOT NULL COMMENT 'Keyword ID.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `KeywordUpdateItem` generated from model 'KeywordUpdateItem'
--

CREATE TABLE IF NOT EXISTS `KeywordUpdateItem` (
  `archived` TINYINT(1) DEFAULT NULL,
  `bid` INT DEFAULT NULL COMMENT '**Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.',
  `id` TEXT NOT NULL COMMENT 'Keyword ID .'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Keywords` generated from model 'Keywords'
--

CREATE TABLE IF NOT EXISTS `Keywords` (
  `errors` JSON NOT NULL COMMENT 'Keyword error',
  `keywords` JSON NOT NULL COMMENT 'Keywords'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `KeywordsCommon` generated from model 'KeywordsCommon'
--

CREATE TABLE IF NOT EXISTS `KeywordsCommon` (
  `bid` INT DEFAULT NULL COMMENT '&lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.',
  `match_type` TEXT NOT NULL,
  `value` TEXT NOT NULL COMMENT 'Keyword value (120 chars max).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `KeywordsCreate` generated from model 'KeywordsCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `KeywordsCreate` (
  `keywords` JSON NOT NULL COMMENT 'Keywords',
  `parent_id` TEXT NOT NULL COMMENT 'Keyword data'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `keywords_get_200_response` generated from model 'keywordsUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `keywords_get_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `KeywordsMetricsArrayResponse` generated from model 'KeywordsMetricsArrayResponse'
--

CREATE TABLE IF NOT EXISTS `KeywordsMetricsArrayResponse` (
  `data` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `KeywordsRequest` generated from model 'KeywordsRequest'
--

CREATE TABLE IF NOT EXISTS `KeywordsRequest` (
  `keywords` JSON NOT NULL COMMENT 'Keyword JSON array. Each array element has 3 fields',
  `parent_id` TEXT NOT NULL COMMENT 'Keyword parent entity ID (advertiser, campaign, ad group).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `KeywordsUpdate` generated from model 'KeywordsUpdate'
-- Resource create or update operation model.
--

CREATE TABLE IF NOT EXISTS `KeywordsUpdate` (
  `keywords` JSON DEFAULT NULL COMMENT 'Keywords'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create or update operation model.';

--
-- Table structure for table `Label` generated from model 'Label'
--

CREATE TABLE IF NOT EXISTS `Label` (
  `id` TEXT NOT NULL COMMENT 'Label ID.',
  `label_type` TEXT NOT NULL,
  `status` TEXT DEFAULT NULL,
  `value` VARCHAR(100) NOT NULL COMMENT 'Label name. 100-character limit.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LabelBulkCreateRequest` generated from model 'LabelBulkCreateRequest'
--

CREATE TABLE IF NOT EXISTS `LabelBulkCreateRequest` (
  `labels` JSON NOT NULL COMMENT 'Labels that you are applying to the campaign.',
  `parent_id` TEXT NOT NULL COMMENT 'Unique identifier of the asset you are labelling. Currently, you can only label campaigns.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LabelBulkUpdateRequest` generated from model 'LabelBulkUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `LabelBulkUpdateRequest` (
  `id` TEXT NOT NULL COMMENT 'Label ID.',
  `parent_id` TEXT NOT NULL COMMENT 'Unique identifier of the asset you are labelling. Currently, you can only label campaigns.',
  `status` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LabelCreateItem` generated from model 'LabelCreateItem'
--

CREATE TABLE IF NOT EXISTS `LabelCreateItem` (
  `label_type` TEXT NOT NULL,
  `value` VARCHAR(100) NOT NULL COMMENT 'Label name. 100-character limit.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LabelCreateRequest` generated from model 'LabelCreateRequest'
--

CREATE TABLE IF NOT EXISTS `LabelCreateRequest` (
  `labels` JSON NOT NULL COMMENT 'Labels that you are applying to the campaign.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LabelError` generated from model 'LabelError'
--

CREATE TABLE IF NOT EXISTS `LabelError` (
  `data` TEXT DEFAULT NULL,
  `error_messages` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LabelErrorData` generated from model 'LabelErrorData'
--

CREATE TABLE IF NOT EXISTS `LabelErrorData` (
  `id` TEXT DEFAULT NULL COMMENT 'Label ID.',
  `label_type` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL,
  `value` VARCHAR(100) DEFAULT NULL COMMENT 'Label name. 100-character limit.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LabelUpdateItem` generated from model 'LabelUpdateItem'
--

CREATE TABLE IF NOT EXISTS `LabelUpdateItem` (
  `id` TEXT NOT NULL COMMENT 'Label ID.',
  `status` TEXT DEFAULT NULL,
  `value` VARCHAR(100) DEFAULT NULL COMMENT 'Label name. 100-character limit.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LabelUpdateRequest` generated from model 'LabelUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `LabelUpdateRequest` (
  `labels` JSON NOT NULL COMMENT 'Labels that you are applying to the campaign.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LabeledEntities` generated from model 'LabeledEntities'
--

CREATE TABLE IF NOT EXISTS `LabeledEntities` (
  `entities_labels` JSON DEFAULT NULL,
  `errors` JSON DEFAULT NULL COMMENT 'Labels that were not successfully applied.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LabeledEntitiesCreate` generated from model 'LabeledEntitiesCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `LabeledEntitiesCreate` (
  `entity_ids` JSON NOT NULL COMMENT 'Entity IDs to apply label to.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `labels_list_200_response` generated from model 'labelsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `labels_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LabelsResponse` generated from model 'LabelsResponse'
--

CREATE TABLE IF NOT EXISTS `LabelsResponse` (
  `errors` JSON DEFAULT NULL COMMENT 'Labels that were not successfully applied.',
  `labels` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LeadForm` generated from model 'LeadForm'
--

CREATE TABLE IF NOT EXISTS `LeadForm` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'The Ad Account ID that this lead form belongs to.',
  `completion_message` TEXT NOT NULL COMMENT 'A message for people who complete the form to let them know what happens next.',
  `created_time` INT DEFAULT NULL COMMENT 'Lead form creation time. Unix timestamp in seconds.',
  `disclosure_language` TEXT DEFAULT NULL COMMENT 'Additional disclosure language to be included in the lead form.',
  `has_accepted_terms` TINYINT(1) NOT NULL COMMENT 'Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO',
  `id` TEXT NOT NULL COMMENT 'The ID of this lead form',
  `name` TEXT NOT NULL COMMENT 'Internal name of the lead form.',
  `policy_links` JSON DEFAULT NULL COMMENT 'List of additional policy links to be displayed on the lead form.',
  `privacy_policy_link` TEXT NOT NULL COMMENT 'A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.',
  `questions` JSON NOT NULL COMMENT 'List of questions to be displayed on the lead form.',
  `status` TEXT DEFAULT NULL,
  `updated_time` INT DEFAULT NULL COMMENT 'Last update time. Unix timestamp in seconds.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LeadFormBatchUpdate` generated from model 'LeadFormBatchUpdate'
--

CREATE TABLE IF NOT EXISTS `LeadFormBatchUpdate` (
  `completion_message` TEXT DEFAULT NULL COMMENT 'A message for people who complete the form to let them know what happens next.',
  `disclosure_language` TEXT DEFAULT NULL COMMENT 'Additional disclosure language to be included in the lead form.',
  `has_accepted_terms` TINYINT(1) DEFAULT NULL COMMENT 'Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO',
  `id` TEXT NOT NULL COMMENT 'The ID of this lead form',
  `name` TEXT DEFAULT NULL COMMENT 'Internal name of the lead form.',
  `policy_links` JSON DEFAULT NULL COMMENT 'List of additional policy links to be displayed on the lead form.',
  `privacy_policy_link` TEXT DEFAULT NULL COMMENT 'A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.',
  `questions` JSON DEFAULT NULL COMMENT 'List of questions to be displayed on the lead form.',
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LeadFormCreate` generated from model 'LeadFormCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `LeadFormCreate` (
  `completion_message` TEXT NOT NULL COMMENT 'A message for people who complete the form to let them know what happens next.',
  `disclosure_language` TEXT DEFAULT NULL COMMENT 'Additional disclosure language to be included in the lead form.',
  `has_accepted_terms` TINYINT(1) NOT NULL COMMENT 'Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO',
  `name` TEXT NOT NULL COMMENT 'Internal name of the lead form.',
  `policy_links` JSON DEFAULT NULL COMMENT 'List of additional policy links to be displayed on the lead form.',
  `privacy_policy_link` TEXT NOT NULL COMMENT 'A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.',
  `questions` JSON NOT NULL COMMENT 'List of questions to be displayed on the lead form.',
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `LeadFormPolicyLink` generated from model 'LeadFormPolicyLink'
--

CREATE TABLE IF NOT EXISTS `LeadFormPolicyLink` (
  `label` TEXT DEFAULT NULL COMMENT 'Policy label for an additional policy link.',
  `link` TEXT DEFAULT NULL COMMENT 'Policy link for an additional policy link.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LeadFormQuestion` generated from model 'LeadFormQuestion'
--

CREATE TABLE IF NOT EXISTS `LeadFormQuestion` (
  `custom_question_field_type` TEXT DEFAULT NULL,
  `custom_question_label` TEXT DEFAULT NULL COMMENT 'Question label for a custom question.',
  `custom_question_options` JSON DEFAULT NULL COMMENT 'Question options for a custom question.',
  `question_type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LeadFormTest` generated from model 'LeadFormTest'
-- Lead form test action: submit sample answers and receive the resulting subscription id.
--

CREATE TABLE IF NOT EXISTS `LeadFormTest` (
  `subscription_id` TEXT DEFAULT NULL COMMENT 'Subscription ID.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Lead form test action: submit sample answers and receive the resulting subscription id.';

--
-- Table structure for table `LeadFormTestCreate` generated from model 'LeadFormTestCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `LeadFormTestCreate` (
  `answers` JSON NOT NULL COMMENT 'Test lead answers. Should follow the creation order.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `lead_forms_create_200_response` generated from model 'leadUnderscoreformsUnderscorecreateUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `lead_forms_create_200_response` (
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `lead_forms_create_200_response_items_inner` generated from model 'leadUnderscoreformsUnderscorecreateUnderscore200UnderscoreresponseUnderscoreitemsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `lead_forms_create_200_response_items_inner` (
  `data` TEXT DEFAULT NULL,
  `exceptions` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `lead_forms_list_200_response` generated from model 'leadUnderscoreformsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `lead_forms_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LeadSubscription` generated from model 'LeadSubscription'
--

CREATE TABLE IF NOT EXISTS `LeadSubscription` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'The Ad Account ID that this lead form belongs to.',
  `api_version` TEXT DEFAULT NULL COMMENT 'API version.',
  `created_time` INT DEFAULT NULL COMMENT 'Subscription creation time. Unix timestamp in milliseconds.',
  `cryptographic_algorithm` TEXT DEFAULT NULL COMMENT 'Lead data encryption algorithm.',
  `cryptographic_key` TEXT DEFAULT NULL COMMENT 'Base64 encoded key for client to decrypt lead data.',
  `id` TEXT DEFAULT NULL COMMENT 'Subscription ID.',
  `lead_form_id` TEXT DEFAULT NULL COMMENT 'Lead form ID.',
  `user_account_id` TEXT DEFAULT NULL COMMENT 'User account used to subscribe lead data.',
  `webhook_url` TEXT DEFAULT NULL COMMENT 'Standard HTTPS webhook URL.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LeadSubscriptionCreate` generated from model 'LeadSubscriptionCreate'
--

CREATE TABLE IF NOT EXISTS `LeadSubscriptionCreate` (
  `lead_form_id` TEXT DEFAULT NULL COMMENT 'Lead form ID.',
  `webhook_url` TEXT NOT NULL COMMENT 'Standard HTTPS webhook URL.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LeadSubscriptionPostParams` generated from model 'LeadSubscriptionPostParams'
--

CREATE TABLE IF NOT EXISTS `LeadSubscriptionPostParams` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'The Ad Account ID that this lead form belongs to.',
  `api_version` TEXT DEFAULT NULL COMMENT 'API version.',
  `created_time` INT DEFAULT NULL COMMENT 'Subscription creation time. Unix timestamp in milliseconds.',
  `cryptographic_algorithm` TEXT DEFAULT NULL COMMENT 'Lead data encryption algorithm.',
  `cryptographic_key` TEXT DEFAULT NULL COMMENT 'Base64 encoded key for client to decrypt lead data.',
  `id` TEXT DEFAULT NULL COMMENT 'Subscription ID.',
  `lead_form_id` TEXT DEFAULT NULL COMMENT 'Lead form ID.',
  `user_account_id` TEXT DEFAULT NULL COMMENT 'User account used to subscribe lead data.',
  `webhook_url` TEXT DEFAULT NULL COMMENT 'Standard HTTPS webhook URL.',
  `partner_access_token` TEXT DEFAULT NULL COMMENT 'Partner access token. Only for clients that requires authentication. We recommend to avoid this param.',
  `partner_metadata` TEXT DEFAULT NULL COMMENT 'Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.',
  `partner_refresh_token` TEXT DEFAULT NULL COMMENT 'Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LeadSubscriptionPostParamsCreate` generated from model 'LeadSubscriptionPostParamsCreate'
--

CREATE TABLE IF NOT EXISTS `LeadSubscriptionPostParamsCreate` (
  `lead_form_id` TEXT DEFAULT NULL COMMENT 'Lead form ID.',
  `webhook_url` TEXT NOT NULL COMMENT 'Standard HTTPS webhook URL.',
  `partner_access_token` TEXT DEFAULT NULL COMMENT 'Partner access token. Only for clients that requires authentication. We recommend to avoid this param.',
  `partner_metadata` TEXT DEFAULT NULL COMMENT 'Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.',
  `partner_refresh_token` TEXT DEFAULT NULL COMMENT 'Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LeadsExportResponseData` generated from model 'LeadsExportResponseData'
--

CREATE TABLE IF NOT EXISTS `LeadsExportResponseData` (
  `download_url` TEXT DEFAULT NULL,
  `export_status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LeadsExports` generated from model 'LeadsExports'
--

CREATE TABLE IF NOT EXISTS `LeadsExports` (
  `leads_export_id` TEXT DEFAULT NULL COMMENT 'ID for the leads export job.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LeadsExportsCreate` generated from model 'LeadsExportsCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `LeadsExportsCreate` (
  `ad_id` TEXT NOT NULL COMMENT 'ID for the ad collecting leads.',
  `end_date` TEXT NOT NULL COMMENT 'Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.',
  `start_date` TEXT NOT NULL COMMENT 'Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `LineItem` generated from model 'LineItem'
--

CREATE TABLE IF NOT EXISTS `LineItem` (
  `product_brand` TEXT DEFAULT NULL COMMENT 'Product brand. For example, &#39;Parker&#39;.',
  `product_category` TEXT DEFAULT NULL COMMENT 'Product category. For example, &#39;Shoes&#39;.',
  `product_id` INT DEFAULT NULL COMMENT 'Product ID. For example, 1414.',
  `product_name` TEXT DEFAULT NULL COMMENT 'Product name. For example, &#39;Parker Boots&#39;.',
  `product_price` TEXT DEFAULT NULL COMMENT 'Product price. For example, &#39;99.99&#39;.',
  `product_quantity` INT DEFAULT NULL COMMENT 'Product quantity. For example, 2.',
  `product_variant` TEXT DEFAULT NULL COMMENT 'Product variant. For example, &#39;Red&#39;.',
  `product_variant_id` TEXT DEFAULT NULL COMMENT 'Product variant ID. For example, &#39;1414-34832&#39;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LinkFilter` generated from model 'LinkFilter'
--

CREATE TABLE IF NOT EXISTS `LinkFilter` (
  `LINK` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LinkedBusiness` generated from model 'LinkedBusiness'
--

CREATE TABLE IF NOT EXISTS `LinkedBusiness` (
  `image_large_url` TEXT DEFAULT NULL COMMENT 'image_large_url',
  `image_medium_url` TEXT DEFAULT NULL COMMENT 'image_medium_url',
  `image_small_url` TEXT DEFAULT NULL COMMENT 'image_small_url',
  `image_xlarge_url` TEXT DEFAULT NULL COMMENT 'image_xlarge_url',
  `username` TEXT DEFAULT NULL COMMENT 'Username'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocalInventoryCreateOperation` generated from model 'LocalInventoryCreateOperation'
-- Create operation for local inventory item
--

CREATE TABLE IF NOT EXISTS `LocalInventoryCreateOperation` (
  `attributes` TEXT NOT NULL,
  `item_id` TEXT NOT NULL COMMENT 'Catalog item id in the merchant namespace',
  `operation` ENUM('CREATE') NOT NULL,
  `store_code` TEXT NOT NULL COMMENT 'Store code for the local inventory item'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Create operation for local inventory item';

--
-- Table structure for table `LocalInventoryDeleteOperation` generated from model 'LocalInventoryDeleteOperation'
-- Delete operation for local inventory item
--

CREATE TABLE IF NOT EXISTS `LocalInventoryDeleteOperation` (
  `item_id` TEXT NOT NULL COMMENT 'Catalog item id in the merchant namespace',
  `operation` ENUM('DELETE') NOT NULL,
  `store_code` TEXT NOT NULL COMMENT 'Store code for the local inventory item'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Delete operation for local inventory item';

--
-- Table structure for table `LocalInventoryItemResponse` generated from model 'LocalInventoryItemResponse'
-- Local inventory item response
--

CREATE TABLE IF NOT EXISTS `LocalInventoryItemResponse` (
  `ad_link` TEXT DEFAULT NULL COMMENT 'Ad link for the item',
  `availability` TEXT DEFAULT NULL COMMENT 'Availability status of the item',
  `created_at` BIGINT NOT NULL COMMENT 'The millisecond timestamp when the local inventory item was created',
  `item_id` TEXT NOT NULL COMMENT 'The catalog item id in the merchant namespace',
  `last_updated_time` BIGINT NOT NULL COMMENT 'The millisecond timestamp when the local inventory item was lastly modified by the merchant.',
  `price` TEXT DEFAULT NULL COMMENT 'The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars.',
  `sale_price` TEXT DEFAULT NULL COMMENT 'The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.',
  `store_metadata` TEXT NOT NULL COMMENT 'Store metadata for this local inventory item'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Local inventory item response';

--
-- Table structure for table `LocalInventoryItemsBatch` generated from model 'LocalInventoryItemsBatch'
-- Unified model for local inventory items batch operation
--

CREATE TABLE IF NOT EXISTS `LocalInventoryItemsBatch` (
  `batch_id` TEXT NOT NULL COMMENT 'Id of the batch operation',
  `completed_time` DATETIME DEFAULT NULL COMMENT 'Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss',
  `created_time` DATETIME NOT NULL COMMENT 'Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss',
  `operation_results` JSON NOT NULL COMMENT 'Array of operation results',
  `status` TEXT NOT NULL COMMENT 'Status of the batch: PROCESSING, COMPLETED, FAILED'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Unified model for local inventory items batch operation';

--
-- Table structure for table `LocalInventoryItemsBatchCreate` generated from model 'LocalInventoryItemsBatchCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `LocalInventoryItemsBatchCreate` (
  `operations` JSON NOT NULL COMMENT 'Array of inventory operations. Up to 1000 items per request.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `LocalInventoryItemsGet` generated from model 'LocalInventoryItemsGet'
-- Model for getting local inventory items
--

CREATE TABLE IF NOT EXISTS `LocalInventoryItemsGet` (
  `items` JSON NOT NULL COMMENT 'Array of local inventory items'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Model for getting local inventory items';

--
-- Table structure for table `LocalInventoryItemsGetCreate` generated from model 'LocalInventoryItemsGetCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `LocalInventoryItemsGetCreate` (
  `item_filters` JSON NOT NULL COMMENT 'Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `LocalInventoryOperation` generated from model 'LocalInventoryOperation'
--

CREATE TABLE IF NOT EXISTS `LocalInventoryOperation` (
  `attributes` TEXT NOT NULL,
  `item_id` TEXT NOT NULL COMMENT 'Catalog item id in the merchant namespace',
  `operation` ENUM('DELETE') NOT NULL,
  `store_code` TEXT NOT NULL COMMENT 'Store code for the local inventory item'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocalInventoryOperationResult` generated from model 'LocalInventoryOperationResult'
-- Result model for local inventory operation
--

CREATE TABLE IF NOT EXISTS `LocalInventoryOperationResult` (
  `errors` JSON DEFAULT NULL COMMENT 'Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.',
  `item_id` TEXT NOT NULL COMMENT 'Catalog item id in the merchant namespace',
  `status` TEXT NOT NULL COMMENT 'Status of the item processing record',
  `store_code` TEXT NOT NULL COMMENT 'Store code for the local inventory item',
  `supplemental_type` ENUM('LOCAL_INVENTORY') NOT NULL,
  `warnings` JSON DEFAULT NULL COMMENT 'Array with the validation warnings for the item processing record'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Result model for local inventory operation';

--
-- Table structure for table `LocalInventoryUpdateOperation` generated from model 'LocalInventoryUpdateOperation'
-- Update operation for local inventory item
--

CREATE TABLE IF NOT EXISTS `LocalInventoryUpdateOperation` (
  `attributes` TEXT NOT NULL,
  `item_id` TEXT NOT NULL COMMENT 'Catalog item id in the merchant namespace',
  `operation` ENUM('UPDATE') NOT NULL,
  `store_code` TEXT NOT NULL COMMENT 'Store code for the local inventory item'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Update operation for local inventory item';

--
-- Table structure for table `LocalInventoryUpsertOperation` generated from model 'LocalInventoryUpsertOperation'
-- Upsert operation for local inventory item
--

CREATE TABLE IF NOT EXISTS `LocalInventoryUpsertOperation` (
  `attributes` TEXT NOT NULL,
  `item_id` TEXT NOT NULL COMMENT 'Catalog item id in the merchant namespace',
  `operation` ENUM('UPSERT') NOT NULL,
  `store_code` TEXT NOT NULL COMMENT 'Store code for the local inventory item'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Upsert operation for local inventory item';

--
-- Table structure for table `LocalStore` generated from model 'LocalStore'
-- Local store entity
--

CREATE TABLE IF NOT EXISTS `LocalStore` (
  `address_primary` TEXT DEFAULT NULL COMMENT 'Primary address line of the store.',
  `address_secondary` TEXT DEFAULT NULL COMMENT 'Secondary address line of the store.',
  `city` TEXT DEFAULT NULL COMMENT 'City where the store is located.',
  `country` TEXT NOT NULL COMMENT 'Country code where the store is located.',
  `created_at` DATETIME NOT NULL COMMENT 'Creation timestamp',
  `id` TEXT NOT NULL COMMENT 'The ID of the local store.',
  `latitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Geographic latitude coordinate of the store.',
  `longitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Geographic longitude coordinate of the store.',
  `name` TEXT NOT NULL COMMENT 'The name of the local store.',
  `postal_code` TEXT DEFAULT NULL COMMENT 'Postal or ZIP code of the store.',
  `region` TEXT DEFAULT NULL COMMENT 'State or region code where the store is located.',
  `store_code` TEXT NOT NULL COMMENT 'Merchant provided code for the local store. Unique within the merchant&#39;s catalog.',
  `updated_at` DATETIME NOT NULL COMMENT 'Last update timestamp'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Local store entity';

--
-- Table structure for table `LocalStoreBatchUpdate` generated from model 'LocalStoreBatchUpdate'
--

CREATE TABLE IF NOT EXISTS `LocalStoreBatchUpdate` (
  `address_primary` TEXT DEFAULT NULL COMMENT 'Primary address line of the store.',
  `address_secondary` TEXT DEFAULT NULL COMMENT 'Secondary address line of the store.',
  `city` TEXT DEFAULT NULL COMMENT 'City where the store is located.',
  `country` TEXT DEFAULT NULL COMMENT 'Country code where the store is located.',
  `id` TEXT NOT NULL COMMENT 'The ID of the local store.',
  `latitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Geographic latitude coordinate of the store.',
  `longitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Geographic longitude coordinate of the store.',
  `name` TEXT DEFAULT NULL COMMENT 'The name of the local store.',
  `postal_code` TEXT DEFAULT NULL COMMENT 'Postal or ZIP code of the store.',
  `region` TEXT DEFAULT NULL COMMENT 'State or region code where the store is located.',
  `store_code` TEXT DEFAULT NULL COMMENT 'Merchant provided code for the local store. Unique within the merchant&#39;s catalog.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocalStoreCreate` generated from model 'LocalStoreCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `LocalStoreCreate` (
  `address_primary` TEXT DEFAULT NULL COMMENT 'Primary address line of the store.',
  `address_secondary` TEXT DEFAULT NULL COMMENT 'Secondary address line of the store.',
  `city` TEXT DEFAULT NULL COMMENT 'City where the store is located.',
  `country` TEXT NOT NULL COMMENT 'Country code where the store is located.',
  `latitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Geographic latitude coordinate of the store.',
  `longitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Geographic longitude coordinate of the store.',
  `name` TEXT NOT NULL COMMENT 'The name of the local store.',
  `postal_code` TEXT DEFAULT NULL COMMENT 'Postal or ZIP code of the store.',
  `region` TEXT DEFAULT NULL COMMENT 'State or region code where the store is located.',
  `store_code` TEXT NOT NULL COMMENT 'Merchant provided code for the local store. Unique within the merchant&#39;s catalog.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `MMMReport` generated from model 'MMMReport'
--

CREATE TABLE IF NOT EXISTS `MMMReport` (
  `message` TEXT DEFAULT NULL,
  `report_status` TEXT DEFAULT NULL,
  `size` DECIMAL(20, 9) DEFAULT NULL,
  `status` TEXT DEFAULT NULL,
  `token` TEXT DEFAULT NULL,
  `url` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MMMReportCreate` generated from model 'MMMReportCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `MMMReportCreate` (
  `advertiser_ids` JSON DEFAULT NULL COMMENT 'Advertiser IDs for multi-advertiser report',
  `columns` JSON NOT NULL COMMENT 'Metric and entity columns',
  `countries` JSON DEFAULT NULL COMMENT 'A List of countries for filtering',
  `custom_column_ids` JSON DEFAULT NULL COMMENT 'List of custom column IDs',
  `end_date` TEXT NOT NULL COMMENT 'Metric report end date (UTC). Format: YYYY-MM-DD',
  `granularity` TEXT NOT NULL COMMENT '  DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.',
  `level` TEXT NOT NULL COMMENT 'Level of the report',
  `report_name` TEXT NOT NULL COMMENT 'Name of the Marketing Mix Modeling (MMM) report',
  `start_date` TEXT NOT NULL COMMENT 'Metric report start date (UTC). Format: YYYY-MM-DD',
  `targeting_types` JSON NOT NULL COMMENT 'List of targeting types'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `MaxPriceFilter` generated from model 'MaxPriceFilter'
--

CREATE TABLE IF NOT EXISTS `MaxPriceFilter` (
  `MAX_PRICE` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Media` generated from model 'Media'
--

CREATE TABLE IF NOT EXISTS `Media` (
  `media_id` TEXT NOT NULL COMMENT 'Unique identifier for this media upload. Used to track status and for attaching during Pin creation.',
  `media_type` TEXT NOT NULL,
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `media_list_200_response` generated from model 'mediaUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `media_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MediaTypeFilter` generated from model 'MediaTypeFilter'
--

CREATE TABLE IF NOT EXISTS `MediaTypeFilter` (
  `MEDIA_TYPE` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MediaUpload` generated from model 'MediaUpload'
-- Media upload that has been registered but not uploaded/processed yet.
--

CREATE TABLE IF NOT EXISTS `MediaUpload` (
  `media_id` TEXT NOT NULL COMMENT 'Unique identifier for this media upload. Used to track status and for attaching during Pin creation.',
  `media_type` TEXT NOT NULL,
  `upload_parameters` TEXT DEFAULT NULL COMMENT 'The list of parameter key/value pairs you will need to send with your POST request to upload your media file.',
  `upload_url` TEXT DEFAULT NULL COMMENT 'The URL where you will POST your media file.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Media upload that has been registered but not uploaded/processed yet.';

--
-- Table structure for table `MediaUploadCreate` generated from model 'MediaUploadCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `MediaUploadCreate` (
  `media_type` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `MediaUploadParameters` generated from model 'MediaUploadParameters'
--

CREATE TABLE IF NOT EXISTS `MediaUploadParameters` (
  `Content-Type` TEXT DEFAULT NULL,
  `key` TEXT DEFAULT NULL,
  `policy` TEXT DEFAULT NULL,
  `x-amz-algorithm` TEXT DEFAULT NULL,
  `x-amz-credential` TEXT DEFAULT NULL,
  `x-amz-date` TEXT DEFAULT NULL,
  `x-amz-security-token` TEXT DEFAULT NULL,
  `x-amz-signature` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MetricsResponse` generated from model 'MetricsResponse'
--

CREATE TABLE IF NOT EXISTS `MetricsResponse` (
  `data` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MetricsResponseDataItems` generated from model 'MetricsResponseDataItems'
--

CREATE TABLE IF NOT EXISTS `MetricsResponseDataItems` (
  `metrics` JSON NOT NULL COMMENT 'Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).',
  `targeting_type` TEXT NOT NULL COMMENT 'The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)',
  `targeting_value` TEXT NOT NULL COMMENT 'The targeting value for this data item (e.g., &#39;christmas decor ideas&#39;, &#39;iphone&#39;, &#39;female&#39;)'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MinPriceFilter` generated from model 'MinPriceFilter'
--

CREATE TABLE IF NOT EXISTS `MinPriceFilter` (
  `MIN_PRICE` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `NotificationResponse` generated from model 'NotificationResponse'
--

CREATE TABLE IF NOT EXISTS `NotificationResponse` (
  `error_msg` TEXT DEFAULT NULL COMMENT 'error message when success is false',
  `received_at` INT DEFAULT NULL COMMENT 'Received time. Unix timestamp in seconds.',
  `success` TINYINT(1) DEFAULT NULL COMMENT 'Returns true if the notification accepted.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `NullableOptimizationGoalMetadata` generated from model 'NullableOptimizationGoalMetadata'
--

CREATE TABLE IF NOT EXISTS `NullableOptimizationGoalMetadata` (
  `conversion_tag_v3_goal_metadata` TEXT DEFAULT NULL,
  `frequency_goal_metadata` TEXT DEFAULT NULL,
  `scrollup_goal_metadata` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `OauthAccessToken` generated from model 'OauthAccessToken'
-- Describes the valid schema for possible OAuth access token requests.
--

CREATE TABLE IF NOT EXISTS `OauthAccessToken` (
  `access_token` TEXT NOT NULL,
  `expires_in` INT NOT NULL,
  `refresh_token` TEXT DEFAULT NULL,
  `refresh_token_expires_at` INT DEFAULT NULL,
  `refresh_token_expires_in` INT DEFAULT NULL,
  `response_type` TEXT DEFAULT NULL,
  `scope` TEXT DEFAULT NULL,
  `token_type` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Describes the valid schema for possible OAuth access token requests.';

--
-- Table structure for table `OptimizationGoalMetadata` generated from model 'OptimizationGoalMetadata'
--

CREATE TABLE IF NOT EXISTS `OptimizationGoalMetadata` (
  `conversion_tag_v3_goal_metadata` TEXT DEFAULT NULL,
  `frequency_goal_metadata` TEXT DEFAULT NULL,
  `scrollup_goal_metadata` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `OrderLine` generated from model 'OrderLine'
--

CREATE TABLE IF NOT EXISTS `OrderLine` (
  `ad_account_id` TEXT NOT NULL COMMENT 'Ad account ID.',
  `budget` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Order line budget in micro currency.',
  `campaign_ids` JSON NOT NULL COMMENT 'Associated List of campaign IDs.',
  `end_time` DECIMAL(20, 9) DEFAULT NULL COMMENT 'End time. Unix timestamp.',
  `id` TEXT NOT NULL COMMENT 'Order line ID.',
  `name` TEXT DEFAULT NULL COMMENT 'Order line name.',
  `paid_budget` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Order line paid budget in micro currency.',
  `paid_type` TEXT DEFAULT NULL COMMENT 'Order line paid type.',
  `purchase_order_id` TEXT DEFAULT NULL COMMENT 'Purchase order ID.',
  `start_time` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Start time. Unix timestamp.',
  `status` TEXT NOT NULL COMMENT 'Order line status.',
  `type` TEXT NOT NULL COMMENT 'Always \&quot;orderline\&quot;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `OrderLineMutationError` generated from model 'OrderLineMutationError'
--

CREATE TABLE IF NOT EXISTS `OrderLineMutationError` (
  `data` TEXT DEFAULT NULL,
  `error_messages` JSON DEFAULT NULL COMMENT 'Error messages.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `OrderLineMutationResponse` generated from model 'OrderLineMutationResponse'
--

CREATE TABLE IF NOT EXISTS `OrderLineMutationResponse` (
  `data` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `OrderLineMutationResult` generated from model 'OrderLineMutationResult'
--

CREATE TABLE IF NOT EXISTS `OrderLineMutationResult` (
  `errors` JSON DEFAULT NULL COMMENT 'Error list if update(s) fail.',
  `order_line` JSON DEFAULT NULL COMMENT 'Order Line object array.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `order_lines_list_200_response` generated from model 'orderUnderscorelinesUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `order_lines_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `page_visit_conversion_tags_get_200_response` generated from model 'pageUnderscorevisitUnderscoreconversionUnderscoretagsUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `page_visit_conversion_tags_get_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PartnerMetadata` generated from model 'PartnerMetadata'
--

CREATE TABLE IF NOT EXISTS `PartnerMetadata` (
  `subscriber_key` TEXT DEFAULT NULL COMMENT 'Text field value that uniquely identifies a subscriber.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PerformancePlusCampaignSettings` generated from model 'PerformancePlusCampaignSettings'
-- Pinterest Performance+ campaign settings.
--

CREATE TABLE IF NOT EXISTS `PerformancePlusCampaignSettings` (
  `boost_prospecting_ad_group_bid` TINYINT(1) DEFAULT NULL COMMENT 'Whether to boost prospecting ad group bid.',
  `pinner_list_exclusions` JSON DEFAULT NULL COMMENT 'List of campaign-level exclusion pinner list IDs.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pinterest Performance+ campaign settings.';

--
-- Table structure for table `Pin` generated from model 'Pin'
--

CREATE TABLE IF NOT EXISTS `Pin` (
  `ai_disclosures` TEXT DEFAULT NULL COMMENT 'AI disclosure declarations the creator has made about this Pin.',
  `board_id` TEXT DEFAULT NULL COMMENT 'The board to which this Pin belongs.',
  `board_owner` TEXT DEFAULT NULL,
  `board_section_id` TEXT DEFAULT NULL COMMENT 'The board section to which this Pin belongs.',
  `created_at` DATETIME DEFAULT NULL,
  `creative_type` TEXT DEFAULT NULL,
  `dominant_color` TEXT DEFAULT NULL COMMENT 'Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;.',
  `has_been_promoted` TINYINT(1) DEFAULT NULL COMMENT 'Whether the Pin has been promoted or not.',
  `id` TEXT NOT NULL,
  `is_owner` TINYINT(1) DEFAULT NULL COMMENT 'Whether the \&quot;operation user_account\&quot; is the Pin owner.',
  `is_product` TINYINT(1) DEFAULT NULL COMMENT 'Whether the Pin is a product Pin.',
  `is_standard` TINYINT(1) DEFAULT NULL COMMENT 'Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.',
  `media` TEXT DEFAULT NULL,
  `parent_pin_id` TEXT DEFAULT NULL COMMENT 'The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).',
  `pin_metrics` JSON DEFAULT NULL COMMENT 'Pin metrics with associated time intervals if any.',
  `alt_text` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `link` TEXT DEFAULT NULL,
  `title` VARCHAR(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PinAnalyticsDailyMetrics` generated from model 'PinAnalyticsDailyMetrics'
--

CREATE TABLE IF NOT EXISTS `PinAnalyticsDailyMetrics` (
  `data_status` TEXT DEFAULT NULL,
  `date` TEXT DEFAULT NULL COMMENT 'Metrics date (UTC): YYYY-MM-DD.',
  `metrics` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PinAnalyticsMetricsResponse` generated from model 'PinAnalyticsMetricsResponse'
--

CREATE TABLE IF NOT EXISTS `PinAnalyticsMetricsResponse` (
  `daily_metrics` JSON DEFAULT NULL COMMENT 'Array with the requested daily metric records',
  `lifetime_metrics` JSON DEFAULT NULL COMMENT 'The lifetime metric name and value.',
  `summary_metrics` JSON DEFAULT NULL COMMENT 'The metric name and value over the requested period for each requested metric'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PinBase` generated from model 'PinBase'
--

CREATE TABLE IF NOT EXISTS `PinBase` (
  `ai_disclosures` TEXT DEFAULT NULL COMMENT 'AI disclosure declarations the creator has made about this Pin.',
  `board_id` TEXT DEFAULT NULL COMMENT 'The board to which this Pin belongs.',
  `board_owner` TEXT DEFAULT NULL,
  `board_section_id` TEXT DEFAULT NULL COMMENT 'The board section to which this Pin belongs.',
  `created_at` DATETIME DEFAULT NULL,
  `creative_type` TEXT DEFAULT NULL,
  `dominant_color` TEXT DEFAULT NULL COMMENT 'Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;.',
  `has_been_promoted` TINYINT(1) DEFAULT NULL COMMENT 'Whether the Pin has been promoted or not.',
  `id` TEXT NOT NULL,
  `is_owner` TINYINT(1) DEFAULT NULL COMMENT 'Whether the \&quot;operation user_account\&quot; is the Pin owner.',
  `is_product` TINYINT(1) DEFAULT NULL COMMENT 'Whether the Pin is a product Pin.',
  `is_standard` TINYINT(1) DEFAULT NULL COMMENT 'Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.',
  `media` TEXT DEFAULT NULL,
  `parent_pin_id` TEXT DEFAULT NULL COMMENT 'The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).',
  `pin_metrics` JSON DEFAULT NULL COMMENT 'Pin metrics with associated time intervals if any.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PinCreate` generated from model 'PinCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `PinCreate` (
  `ai_disclosures` TEXT DEFAULT NULL COMMENT 'AI disclosure declarations the creator has made about this Pin.',
  `alt_text` TEXT DEFAULT NULL,
  `board_id` TEXT DEFAULT NULL COMMENT 'The board to which this Pin belongs.',
  `board_section_id` TEXT DEFAULT NULL COMMENT 'The board section to which this Pin belongs.',
  `description` TEXT DEFAULT NULL,
  `dominant_color` TEXT DEFAULT NULL COMMENT 'Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;.',
  `link` TEXT DEFAULT NULL,
  `media_source` TEXT DEFAULT NULL,
  `parent_pin_id` TEXT DEFAULT NULL COMMENT 'The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).',
  `sponsor_id` TEXT DEFAULT NULL COMMENT 'The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta.',
  `title` VARCHAR(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `PinMedia` generated from model 'PinMedia'
-- Pin media that can be an image, video, or a mix of both.
--

CREATE TABLE IF NOT EXISTS `PinMedia` (
  `images` TEXT DEFAULT NULL,
  `media_type` ENUM('multiple_mixed') NOT NULL,
  `cover_image_url` TEXT DEFAULT NULL,
  `duration` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Duration (in miliseconds). Field maybe null after creation due to video processing time.',
  `height` INT DEFAULT NULL COMMENT 'Height (in pixels). Field maybe null after creation due to video processing time.',
  `video_url` TEXT DEFAULT NULL COMMENT 'Video url (720p).  **Note:** This field is limited and not available to all apps.',
  `video_url_hls` TEXT DEFAULT NULL COMMENT 'Video url (HLS).  **Note:** This field is limited and not available to all apps.',
  `width` INT DEFAULT NULL COMMENT 'Width (in pixels). Field maybe null after creation due to video processing time.',
  `items` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin media that can be an image, video, or a mix of both.';

--
-- Table structure for table `PinMediaMetadata` generated from model 'PinMediaMetadata'
-- Per-item entry inside &#x60;PinMedia.items&#x60; for mixed image/video pins. Discriminated by &#x60;item_type&#x60;.
--

CREATE TABLE IF NOT EXISTS `PinMediaMetadata` (
  `description` TEXT DEFAULT NULL,
  `images` TEXT DEFAULT NULL,
  `item_type` ENUM('video') NOT NULL COMMENT 'Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload.',
  `link` TEXT DEFAULT NULL,
  `title` TEXT DEFAULT NULL,
  `cover_image_url` TEXT DEFAULT NULL,
  `duration` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Duration (in miliseconds). Field maybe null after creation due to video processing time.',
  `height` INT DEFAULT NULL COMMENT 'Height (in pixels). Field maybe null after creation due to video processing time.',
  `video_url` TEXT DEFAULT NULL COMMENT 'Video url (720p).  **Note:** This field is limited and not available to all apps.',
  `video_url_hls` TEXT DEFAULT NULL COMMENT 'Video url (HLS).  **Note:** This field is limited and not available to all apps.',
  `width` INT DEFAULT NULL COMMENT 'Width (in pixels). Field maybe null after creation due to video processing time.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Per-item entry inside &#x60;PinMedia.items&#x60; for mixed image/video pins. Discriminated by &#x60;item_type&#x60;.';

--
-- Table structure for table `PinMediaSource` generated from model 'PinMediaSource'
-- Pin media source that can be an image, video, or a mix of both passed in as a request.
--

CREATE TABLE IF NOT EXISTS `PinMediaSource` (
  `content_type` TEXT NOT NULL,
  `data` TEXT NOT NULL,
  `is_standard` TINYINT(1) DEFAULT true COMMENT 'Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.',
  `source_type` ENUM('pin_url') NOT NULL,
  `url` TEXT NOT NULL,
  `cover_image_content_type` TEXT DEFAULT NULL COMMENT 'Content type for cover image Base64.',
  `cover_image_data` TEXT DEFAULT NULL COMMENT 'Cover image Base64.',
  `cover_image_key_frame_time` INT UNSIGNED DEFAULT NULL COMMENT 'Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.',
  `cover_image_url` TEXT DEFAULT NULL COMMENT 'Cover image URL.',
  `media_id` TEXT NOT NULL,
  `index` INT UNSIGNED DEFAULT NULL,
  `items` JSON NOT NULL COMMENT 'Array with image objects.',
  `is_affiliate_link` TINYINT(1) DEFAULT false COMMENT 'This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin media source that can be an image, video, or a mix of both passed in as a request.';

--
-- Table structure for table `PinMediaSourceImageBase64` generated from model 'PinMediaSourceImageBase64'
-- Image Base64-based media source.
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImageBase64` (
  `content_type` TEXT NOT NULL,
  `data` TEXT NOT NULL,
  `is_standard` TINYINT(1) DEFAULT true COMMENT 'Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.',
  `source_type` ENUM('image_base64') NOT NULL COMMENT 'The source type of the media.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Image Base64-based media source.';

--
-- Table structure for table `PinMediaSourceImageURL` generated from model 'PinMediaSourceImageURL'
-- Image URL-based media source.
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImageURL` (
  `is_standard` TINYINT(1) DEFAULT true COMMENT 'Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.',
  `source_type` ENUM('image_url') NOT NULL COMMENT 'The source type of the media.',
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Image URL-based media source.';

--
-- Table structure for table `PinMediaSourceImagesBase64` generated from model 'PinMediaSourceImagesBase64'
-- Multiple Base64-based images media source
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImagesBase64` (
  `index` INT UNSIGNED DEFAULT NULL,
  `items` JSON NOT NULL COMMENT 'Array with image objects.',
  `source_type` ENUM('multiple_image_base64') NOT NULL COMMENT 'The source type of the media.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Multiple Base64-based images media source';

--
-- Table structure for table `PinMediaSourceImagesBase64Item` generated from model 'PinMediaSourceImagesBase64Item'
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImagesBase64Item` (
  `content_type` TEXT NOT NULL,
  `data` TEXT NOT NULL,
  `description` TEXT DEFAULT NULL,
  `link` TEXT DEFAULT NULL,
  `title` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PinMediaSourceImagesURL` generated from model 'PinMediaSourceImagesURL'
-- Multiple URL-based images media source
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImagesURL` (
  `index` INT UNSIGNED DEFAULT NULL,
  `items` JSON NOT NULL COMMENT 'Array with image objects.',
  `source_type` ENUM('multiple_image_urls') NOT NULL COMMENT 'The source type of the media.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Multiple URL-based images media source';

--
-- Table structure for table `PinMediaSourceImagesURLItem` generated from model 'PinMediaSourceImagesURLItem'
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImagesURLItem` (
  `description` TEXT DEFAULT NULL,
  `link` TEXT DEFAULT NULL,
  `title` TEXT DEFAULT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PinMediaSourcePinURL` generated from model 'PinMediaSourcePinURL'
-- Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
--

CREATE TABLE IF NOT EXISTS `PinMediaSourcePinURL` (
  `is_affiliate_link` TINYINT(1) DEFAULT false COMMENT 'This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.',
  `source_type` ENUM('pin_url') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.';

--
-- Table structure for table `PinMediaSourceVideoID` generated from model 'PinMediaSourceVideoID'
-- Video ID-based media source.
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceVideoID` (
  `cover_image_content_type` TEXT DEFAULT NULL COMMENT 'Content type for cover image Base64.',
  `cover_image_data` TEXT DEFAULT NULL COMMENT 'Cover image Base64.',
  `cover_image_key_frame_time` INT UNSIGNED DEFAULT NULL COMMENT 'Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.',
  `cover_image_url` TEXT DEFAULT NULL COMMENT 'Cover image URL.',
  `is_standard` TINYINT(1) DEFAULT true COMMENT 'Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.',
  `media_id` TEXT NOT NULL,
  `source_type` ENUM('video_id') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Video ID-based media source.';

--
-- Table structure for table `PinMediaWithImage` generated from model 'PinMediaWithImage'
-- Pin with image.
--

CREATE TABLE IF NOT EXISTS `PinMediaWithImage` (
  `images` TEXT DEFAULT NULL,
  `media_type` ENUM('image') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin with image.';

--
-- Table structure for table `PinMediaWithImageAndVideo` generated from model 'PinMediaWithImageAndVideo'
-- Pin with a mix of images and videos.
--

CREATE TABLE IF NOT EXISTS `PinMediaWithImageAndVideo` (
  `items` JSON DEFAULT NULL,
  `media_type` ENUM('multiple_mixed') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin with a mix of images and videos.';

--
-- Table structure for table `PinMediaWithImages` generated from model 'PinMediaWithImages'
-- Pin with multiple images.
--

CREATE TABLE IF NOT EXISTS `PinMediaWithImages` (
  `items` JSON DEFAULT NULL,
  `media_type` ENUM('multiple_images') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin with multiple images.';

--
-- Table structure for table `PinMediaWithVideo` generated from model 'PinMediaWithVideo'
-- Pin with video.
--

CREATE TABLE IF NOT EXISTS `PinMediaWithVideo` (
  `cover_image_url` TEXT DEFAULT NULL,
  `duration` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Duration (in miliseconds). Field maybe null after creation due to video processing time.',
  `height` INT DEFAULT NULL COMMENT 'Height (in pixels). Field maybe null after creation due to video processing time.',
  `images` TEXT DEFAULT NULL,
  `media_type` ENUM('video') NOT NULL,
  `video_url` TEXT DEFAULT NULL COMMENT 'Video url (720p).  **Note:** This field is limited and not available to all apps.',
  `video_url_hls` TEXT DEFAULT NULL COMMENT 'Video url (HLS).  **Note:** This field is limited and not available to all apps.',
  `width` INT DEFAULT NULL COMMENT 'Width (in pixels). Field maybe null after creation due to video processing time.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin with video.';

--
-- Table structure for table `PinMediaWithVideos` generated from model 'PinMediaWithVideos'
-- Pin with multiple videos.
--

CREATE TABLE IF NOT EXISTS `PinMediaWithVideos` (
  `items` JSON DEFAULT NULL,
  `media_type` ENUM('multiple_videos') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin with multiple videos.';

--
-- Table structure for table `PinRead` generated from model 'PinRead'
--

CREATE TABLE IF NOT EXISTS `PinRead` (
  `ai_disclosures` TEXT DEFAULT NULL COMMENT 'AI disclosure declarations the creator has made about this Pin.',
  `board_id` TEXT DEFAULT NULL COMMENT 'The board to which this Pin belongs.',
  `board_owner` TEXT DEFAULT NULL,
  `board_section_id` TEXT DEFAULT NULL COMMENT 'The board section to which this Pin belongs.',
  `created_at` DATETIME DEFAULT NULL,
  `creative_type` TEXT DEFAULT NULL,
  `dominant_color` TEXT DEFAULT NULL COMMENT 'Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;.',
  `has_been_promoted` TINYINT(1) DEFAULT NULL COMMENT 'Whether the Pin has been promoted or not.',
  `id` TEXT NOT NULL,
  `is_owner` TINYINT(1) DEFAULT NULL COMMENT 'Whether the \&quot;operation user_account\&quot; is the Pin owner.',
  `is_product` TINYINT(1) DEFAULT NULL COMMENT 'Whether the Pin is a product Pin.',
  `is_standard` TINYINT(1) DEFAULT NULL COMMENT 'Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.',
  `media` TEXT DEFAULT NULL,
  `parent_pin_id` TEXT DEFAULT NULL COMMENT 'The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).',
  `pin_metrics` JSON DEFAULT NULL COMMENT 'Pin metrics with associated time intervals if any.',
  `alt_text` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `link` TEXT DEFAULT NULL,
  `title` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PinUpdate` generated from model 'PinUpdate'
-- Resource create or update operation model.
--

CREATE TABLE IF NOT EXISTS `PinUpdate` (
  `ai_disclosures` TEXT DEFAULT NULL COMMENT 'AI disclosure declarations the creator has made about this Pin.',
  `alt_text` TEXT DEFAULT NULL,
  `board_id` TEXT DEFAULT NULL COMMENT 'The board to which this Pin belongs.',
  `board_section_id` TEXT DEFAULT NULL COMMENT 'The board section to which this Pin belongs.',
  `carousel_slots` JSON DEFAULT NULL COMMENT 'Carousel Pin slots data.',
  `description` TEXT DEFAULT NULL,
  `link` TEXT DEFAULT NULL,
  `title` VARCHAR(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create or update operation model.';

--
-- Table structure for table `pins_list_200_response` generated from model 'pinsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `pins_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PinsSaveRequestCreate` generated from model 'PinsSaveRequestCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `PinsSaveRequestCreate` (
  `board_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of the board to which the pin will be saved.',
  `board_section_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of the board section to which the pin will be saved.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `Pinterest.Lib.BatchItemException` generated from model 'PinterestPeriodLibPeriodBatchItemException'
-- Exception details for a batch operation item.
--

CREATE TABLE IF NOT EXISTS `Pinterest.Lib.BatchItemException` (
  `code` INT DEFAULT NULL,
  `message` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Exception details for a batch operation item.';

--
-- Table structure for table `Pinterest.Lib.Error` generated from model 'PinterestPeriodLibPeriodError'
-- Default error response
--

CREATE TABLE IF NOT EXISTS `Pinterest.Lib.Error` (
  `code` INT NOT NULL,
  `message` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Default error response';

--
-- Table structure for table `Pinterest.Lib.Status204` generated from model 'PinterestPeriodLibPeriodStatus204'
-- The resource was successfully deleted.
--

CREATE TABLE IF NOT EXISTS `Pinterest.Lib.Status204` (
  `statusCode` ENUM('204') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The resource was successfully deleted.';

--
-- Table structure for table `PinterestProductCategoriesFilter` generated from model 'PinterestProductCategoriesFilter'
--

CREATE TABLE IF NOT EXISTS `PinterestProductCategoriesFilter` (
  `PINTEREST_PRODUCT_CATEGORIES` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PlacementMultipliers` generated from model 'PlacementMultipliers'
-- This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
--

CREATE TABLE IF NOT EXISTS `PlacementMultipliers` (
  `PLACEMENT` TEXT DEFAULT NULL COMMENT 'Placement type identifier.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).';

--
-- Table structure for table `PredictedTimeSeries` generated from model 'PredictedTimeSeries'
--

CREATE TABLE IF NOT EXISTS `PredictedTimeSeries` (
  `date` DATE DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PriceFilter` generated from model 'PriceFilter'
--

CREATE TABLE IF NOT EXISTS `PriceFilter` (
  `PRICE` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PriceFilterPrice` generated from model 'PriceFilterPrice'
--

CREATE TABLE IF NOT EXISTS `PriceFilterPrice` (
  `currency` TEXT NOT NULL,
  `negated` TINYINT(1) DEFAULT NULL,
  `operator` TEXT NOT NULL,
  `value` DECIMAL(20, 9) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ProductCategoriesDemographic` generated from model 'ProductCategoriesDemographic'
-- Age and gender distribution who engaged with this product category in the past 3 months
--

CREATE TABLE IF NOT EXISTS `ProductCategoriesDemographic` (
  `age` JSON NOT NULL COMMENT 'Age demographic distribution',
  `gender` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Age and gender distribution who engaged with this product category in the past 3 months';

--
-- Table structure for table `ProductCategoriesMetricsHighlights` generated from model 'ProductCategoriesMetricsHighlights'
-- Key performance metrics highlights for this product category
--

CREATE TABLE IF NOT EXISTS `ProductCategoriesMetricsHighlights` (
  `engagement` TEXT DEFAULT NULL COMMENT 'Engagement metric value',
  `outbound_clicks` TEXT DEFAULT NULL COMMENT 'Number of outbound clicks',
  `pin_saves` TEXT DEFAULT NULL COMMENT 'Number of pin saves'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Key performance metrics highlights for this product category';

--
-- Table structure for table `ProductCategoryDetails` generated from model 'ProductCategoryDetails'
-- Product category details
--

CREATE TABLE IF NOT EXISTS `ProductCategoryDetails` (
  `demographics` TEXT DEFAULT NULL,
  `has_prediction` TINYINT(1) NOT NULL COMMENT '    Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.',
  `metrics_highlights` TEXT DEFAULT NULL,
  `predicted_time_series` JSON DEFAULT NULL COMMENT '    A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.',
  `product_category` TEXT NOT NULL,
  `related_searches` JSON DEFAULT NULL COMMENT 'Related search terms for this product category',
  `time_series` JSON DEFAULT NULL COMMENT 'Time series data showing trend values over time, indexed between 0 and 100'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Product category details';

--
-- Table structure for table `ProductGroupAnalyticsItems` generated from model 'ProductGroupAnalyticsItems'
--

CREATE TABLE IF NOT EXISTS `ProductGroupAnalyticsItems` (
  `DATE` DATE DEFAULT NULL COMMENT 'Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)',
  `PRODUCT_GROUP_ID` TEXT NOT NULL COMMENT 'The ID of the product group that this metrics belongs to.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ProductGroupPromotion` generated from model 'ProductGroupPromotion'
--

CREATE TABLE IF NOT EXISTS `ProductGroupPromotion` (
  `ad_group_id` TEXT DEFAULT NULL COMMENT 'ID of the ad group the product group belongs to.',
  `bid_in_micro_currency` INT DEFAULT NULL COMMENT 'The bid in micro currency.',
  `catalog_product_group_id` TEXT DEFAULT NULL COMMENT 'ID of the catalogs product group that this product group promotion references (required for create operations)',
  `catalog_product_group_name` TEXT DEFAULT NULL COMMENT 'Catalogs product group name',
  `collections_header_type` TEXT DEFAULT NULL,
  `collections_hero_destination_url` TEXT DEFAULT NULL COMMENT 'Collections Hero Destination Url',
  `collections_hero_pin_id` TEXT DEFAULT NULL COMMENT 'Hero Pin ID if this PG is promoted as a Collection',
  `creative_type` TEXT DEFAULT NULL,
  `customizable_cta_type` TEXT DEFAULT NULL,
  `definition` TEXT DEFAULT NULL COMMENT 'The full product group definition path',
  `grid_click_type` TEXT DEFAULT NULL,
  `id` TEXT DEFAULT NULL COMMENT 'ID of the product group promotion (required for update operations).',
  `included` TINYINT(1) DEFAULT NULL COMMENT 'True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.',
  `is_generate_background` TINYINT(1) DEFAULT NULL COMMENT 'Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.',
  `is_image_auto_resizing` TINYINT(1) DEFAULT NULL COMMENT 'Set to &#x60;TRUE&#x60; to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance.',
  `is_mdl` TINYINT(1) DEFAULT NULL COMMENT 'If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog',
  `parent_id` TEXT DEFAULT NULL COMMENT 'The parent Product Group ID of this Product Group',
  `preferred_media_type` TEXT DEFAULT NULL,
  `relative_definition` TEXT DEFAULT NULL COMMENT 'The definition of the product group, relative to its parent - an attribute name/value pair',
  `selected_image_tag` TEXT DEFAULT NULL COMMENT 'The ad image tag selected for the product group promotion.',
  `selected_video_tag` TEXT DEFAULT NULL COMMENT 'The ad video tag selected for the product group promotion.',
  `slideshow_collections_description` TEXT DEFAULT NULL COMMENT 'Slideshow Collections Description',
  `slideshow_collections_title` TEXT DEFAULT NULL COMMENT 'Slideshow Collections Title',
  `status` TEXT DEFAULT NULL,
  `tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking template for proudct group promotions. 4000 limit'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ProductGroupPromotionCreateRequest` generated from model 'ProductGroupPromotionCreateRequest'
--

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionCreateRequest` (
  `ad_group_id` TEXT NOT NULL COMMENT 'ID of the Ad Group the Product Group Promotion belongs to.',
  `product_group_promotion` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ProductGroupPromotionResponseItem` generated from model 'ProductGroupPromotionResponseItem'
--

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionResponseItem` (
  `data` TEXT DEFAULT NULL,
  `exceptions` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ProductGroupPromotionUpdateRequest` generated from model 'ProductGroupPromotionUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionUpdateRequest` (
  `ad_group_id` TEXT NOT NULL COMMENT 'ID of the ad group the product group belongs to.',
  `product_group_promotion` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ProductGroupPromotions` generated from model 'ProductGroupPromotions'
-- Wrapper model for ProductGroupPromotion.
--

CREATE TABLE IF NOT EXISTS `ProductGroupPromotions` (
  `items` JSON DEFAULT NULL COMMENT 'Response-only: created or updated product group promotions, or exceptions.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Wrapper model for ProductGroupPromotion.';

--
-- Table structure for table `ProductGroupPromotionsCreate` generated from model 'ProductGroupPromotionsCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionsCreate` (
  `ad_group_id` TEXT NOT NULL COMMENT 'ID of the ad group the product group promotion belongs to.',
  `product_group_promotion` JSON NOT NULL COMMENT 'List of product group promotions to create or update.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `product_group_promotions_list_200_response` generated from model 'productUnderscoregroupUnderscorepromotionsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `product_group_promotions_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ProductGroupPromotionsUpdateWithRequiredBody` generated from model 'ProductGroupPromotionsUpdateWithRequiredBody'
-- Resource create or update operation model with required body fields (no OptionalProperties).
--

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionsUpdateWithRequiredBody` (
  `ad_group_id` TEXT NOT NULL COMMENT 'ID of the ad group the product group promotion belongs to.',
  `product_group_promotion` JSON NOT NULL COMMENT 'List of product group promotions to create or update.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create or update operation model with required body fields (no OptionalProperties).';

--
-- Table structure for table `ProductGroupReferenceFilter` generated from model 'ProductGroupReferenceFilter'
--

CREATE TABLE IF NOT EXISTS `ProductGroupReferenceFilter` (
  `PRODUCT_GROUP` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ProductTagItem` generated from model 'ProductTagItem'
-- Product tag request item containing the pin_id of the product to tag.
--

CREATE TABLE IF NOT EXISTS `ProductTagItem` (
  `pin_id` TEXT NOT NULL COMMENT 'Pin ID of the product pin to tag onto the hero pin.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Product tag request item containing the pin_id of the product to tag.';

--
-- Table structure for table `ProductTagsBulkAddRequest` generated from model 'ProductTagsBulkAddRequest'
-- Request body for bulk adding product tags to a pin.
--

CREATE TABLE IF NOT EXISTS `ProductTagsBulkAddRequest` (
  `product_tags` JSON NOT NULL COMMENT 'List of product tags to add. Maximum 24 items allowed.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request body for bulk adding product tags to a pin.';

--
-- Table structure for table `ProductTagsBulkDeleteRequest` generated from model 'ProductTagsBulkDeleteRequest'
-- Request body for bulk deleting product tags from a pin.
--

CREATE TABLE IF NOT EXISTS `ProductTagsBulkDeleteRequest` (
  `product_tags` JSON NOT NULL COMMENT 'List of product tags to delete.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request body for bulk deleting product tags from a pin.';

--
-- Table structure for table `ProductTagsError` generated from model 'ProductTagsError'
-- Error response for requests containing ineligible product tags.
--

CREATE TABLE IF NOT EXISTS `ProductTagsError` (
  `code` INT NOT NULL,
  `details` TEXT DEFAULT NULL COMMENT 'Details about which product tags failed eligibility check.',
  `message` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Error response for requests containing ineligible product tags.';

--
-- Table structure for table `ProductTagsResponse` generated from model 'ProductTagsResponse'
-- Response containing a list of product tags for a pin.
--

CREATE TABLE IF NOT EXISTS `ProductTagsResponse` (
  `product_tags` JSON NOT NULL COMMENT 'List of product tags on the pin.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Response containing a list of product tags for a pin.';

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
-- Table structure for table `Promotion` generated from model 'Promotion'
--

CREATE TABLE IF NOT EXISTS `Promotion` (
  `ad_account_id` TEXT NOT NULL COMMENT 'The Ad Account ID that this promotion belongs to.',
  `discount_status` TEXT DEFAULT NULL,
  `end_time` INT DEFAULT NULL COMMENT 'Promotion end time. Unix timestamp in seconds. Independent of campaign end time.',
  `external_id` VARCHAR(64) DEFAULT NULL COMMENT 'Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.',
  `id` VARCHAR(18) NOT NULL COMMENT 'Promotion ID',
  `platform_type` TEXT DEFAULT NULL COMMENT 'The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;.',
  `promotion_code` TEXT DEFAULT NULL COMMENT 'Code that can be used to redeem a promotion.',
  `promotion_custom_id` VARCHAR(50) DEFAULT NULL COMMENT 'An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.',
  `promotion_title` TEXT NOT NULL COMMENT 'Internal name for the promotion.',
  `promotion_type` TEXT NOT NULL,
  `start_time` INT DEFAULT NULL COMMENT 'Promotion start time. Unix timestamp in seconds. Independent of campaign start time.',
  `status` TEXT DEFAULT NULL,
  `template_values` JSON DEFAULT NULL COMMENT 'List of values to be inserted in the promotion type-specific template.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PromotionArrayElement` generated from model 'PromotionArrayElement'
--

CREATE TABLE IF NOT EXISTS `PromotionArrayElement` (
  `data` TEXT DEFAULT NULL,
  `exception` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PromotionBatchUpdate` generated from model 'PromotionBatchUpdate'
--

CREATE TABLE IF NOT EXISTS `PromotionBatchUpdate` (
  `discount_status` TEXT DEFAULT NULL,
  `end_time` INT DEFAULT NULL COMMENT 'Promotion end time. Unix timestamp in seconds. Independent of campaign end time.',
  `external_id` VARCHAR(64) DEFAULT NULL COMMENT 'Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.',
  `id` VARCHAR(18) NOT NULL COMMENT 'Promotion ID',
  `platform_type` TEXT DEFAULT NULL COMMENT 'The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;.',
  `promotion_code` TEXT DEFAULT NULL COMMENT 'Code that can be used to redeem a promotion.',
  `promotion_custom_id` VARCHAR(50) DEFAULT NULL COMMENT 'An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.',
  `promotion_title` TEXT DEFAULT NULL COMMENT 'Internal name for the promotion.',
  `promotion_type` TEXT DEFAULT NULL,
  `start_time` INT DEFAULT NULL COMMENT 'Promotion start time. Unix timestamp in seconds. Independent of campaign start time.',
  `template_values` JSON DEFAULT NULL COMMENT 'List of values to be inserted in the promotion type-specific template.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PromotionCreate` generated from model 'PromotionCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `PromotionCreate` (
  `discount_status` TEXT DEFAULT NULL,
  `end_time` INT DEFAULT NULL COMMENT 'Promotion end time. Unix timestamp in seconds. Independent of campaign end time.',
  `external_id` VARCHAR(64) DEFAULT NULL COMMENT 'Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.',
  `platform_type` TEXT DEFAULT NULL COMMENT 'The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;.',
  `promotion_code` TEXT DEFAULT NULL COMMENT 'Code that can be used to redeem a promotion.',
  `promotion_custom_id` VARCHAR(50) DEFAULT NULL COMMENT 'An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.',
  `promotion_title` TEXT NOT NULL COMMENT 'Internal name for the promotion.',
  `promotion_type` TEXT NOT NULL,
  `start_time` INT DEFAULT NULL COMMENT 'Promotion start time. Unix timestamp in seconds. Independent of campaign start time.',
  `template_values` JSON DEFAULT NULL COMMENT 'List of values to be inserted in the promotion type-specific template.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `PromotionTemplateValue` generated from model 'PromotionTemplateValue'
--

CREATE TABLE IF NOT EXISTS `PromotionTemplateValue` (
  `amount` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Numeric value.',
  `currency_code` TEXT DEFAULT NULL,
  `custom_text` TEXT DEFAULT NULL COMMENT 'Custom text.',
  `percent` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Percent value.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `promotions_list_200_response` generated from model 'promotionsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `promotions_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PromotionsResponse` generated from model 'PromotionsResponse'
--

CREATE TABLE IF NOT EXISTS `PromotionsResponse` (
  `promotions` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `QualityComponentDetails` generated from model 'QualityComponentDetails'
-- Metrics for a specific event type within a quality component.
--

CREATE TABLE IF NOT EXISTS `QualityComponentDetails` (
  `coverage` DECIMAL(20, 9) NOT NULL COMMENT 'Coverage percentage for this event type.',
  `issues` JSON DEFAULT NULL COMMENT 'List of issues detected for this event type, if any.',
  `overlap` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Overlap percentage for this event type. Only populated for external_event_id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Metrics for a specific event type within a quality component.';

--
-- Table structure for table `QualityComponentIssue` generated from model 'QualityComponentIssue'
-- Details of an issue with a quality component.
--

CREATE TABLE IF NOT EXISTS `QualityComponentIssue` (
  `id` TEXT NOT NULL COMMENT 'Unique identifier for the issue check.',
  `name` TEXT NOT NULL COMMENT 'Human-readable name of the issue.',
  `reason` TEXT NOT NULL COMMENT 'Detailed reason for the issue.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Details of an issue with a quality component.';

--
-- Table structure for table `QualityComponents` generated from model 'QualityComponents'
-- Set of quality components, with each component containing a event coverage and details.
--

CREATE TABLE IF NOT EXISTS `QualityComponents` (
  `advertiser_external_id` JSON DEFAULT NULL,
  `click_id_epik` JSON DEFAULT NULL,
  `external_event_id` JSON DEFAULT NULL COMMENT 'Dedup components.',
  `hashed_email` JSON DEFAULT NULL COMMENT 'User matching identifiers.',
  `hashed_maid` JSON DEFAULT NULL,
  `ip_address` JSON DEFAULT NULL,
  `order_id` JSON DEFAULT NULL,
  `order_value` JSON DEFAULT NULL,
  `product_id` JSON DEFAULT NULL COMMENT 'Product/event metadata.',
  `source_url` JSON DEFAULT NULL,
  `user_agent` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Set of quality components, with each component containing a event coverage and details.';

--
-- Table structure for table `QuizPinData` generated from model 'QuizPinData'
-- This field includes all quiz data including questions, options, and results.
--

CREATE TABLE IF NOT EXISTS `QuizPinData` (
  `questions` JSON DEFAULT NULL,
  `results` JSON DEFAULT NULL,
  `tie_breaker_custom_result` TEXT DEFAULT NULL,
  `tie_breaker_type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This field includes all quiz data including questions, options, and results.';

--
-- Table structure for table `QuizPinOption` generated from model 'QuizPinOption'
-- This field contains multiple options to a quiz question.
--

CREATE TABLE IF NOT EXISTS `QuizPinOption` (
  `id` DECIMAL(20, 9) DEFAULT NULL,
  `text` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This field contains multiple options to a quiz question.';

--
-- Table structure for table `QuizPinQuestion` generated from model 'QuizPinQuestion'
-- A specific quiz inquiry.
--

CREATE TABLE IF NOT EXISTS `QuizPinQuestion` (
  `options` JSON DEFAULT NULL,
  `question_id` DECIMAL(20, 9) DEFAULT NULL,
  `question_text` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A specific quiz inquiry.';

--
-- Table structure for table `QuizPinResult` generated from model 'QuizPinResult'
-- The result, and link out, based on the user’s choice.
--

CREATE TABLE IF NOT EXISTS `QuizPinResult` (
  `android_deep_link` TEXT DEFAULT NULL,
  `destination_url` TEXT DEFAULT NULL,
  `ios_deep_link` TEXT DEFAULT NULL,
  `organic_pin_id` TEXT DEFAULT NULL,
  `result_id` DECIMAL(20, 9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The result, and link out, based on the user’s choice.';

--
-- Table structure for table `RecordCounts` generated from model 'RecordCounts'
--

CREATE TABLE IF NOT EXISTS `RecordCounts` (
  `invalid` INT NOT NULL COMMENT 'Number of invalid records processed',
  `processed` INT NOT NULL COMMENT 'Number of records processed',
  `valid` INT NOT NULL COMMENT 'Number of valid records processed'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RelatedTerms` generated from model 'RelatedTerms'
--

CREATE TABLE IF NOT EXISTS `RelatedTerms` (
  `id` TEXT DEFAULT NULL COMMENT 'First input term. For example, if you pass \&quot;?terms&#x3D;clothes,workout\&quot;, then id will be \&quot;clothes\&quot;',
  `related_term_count` INT DEFAULT NULL COMMENT 'Total number of related terms returned',
  `related_terms_list` JSON DEFAULT NULL COMMENT 'The id of the advertiser.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RelatedTermsRelatedTermsListItems` generated from model 'RelatedTermsRelatedTermsListItems'
--

CREATE TABLE IF NOT EXISTS `RelatedTermsRelatedTermsListItems` (
  `related_terms` JSON DEFAULT NULL,
  `term` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `reports_stats_200_response` generated from model 'reportsUnderscorestatsUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `reports_stats_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RespondToInviteResultItem` generated from model 'RespondToInviteResultItem'
--

CREATE TABLE IF NOT EXISTS `RespondToInviteResultItem` (
  `exception` TEXT DEFAULT NULL,
  `invite` TEXT DEFAULT NULL COMMENT 'An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RespondToInvitesResponseArray` generated from model 'RespondToInvitesResponseArray'
--

CREATE TABLE IF NOT EXISTS `RespondToInvitesResponseArray` (
  `items` JSON DEFAULT NULL COMMENT 'List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RetailLocalInventoryItemAttributes` generated from model 'RetailLocalInventoryItemAttributes'
-- Local inventory attributes for retail items (required fields for create/upsert)
--

CREATE TABLE IF NOT EXISTS `RetailLocalInventoryItemAttributes` (
  `ad_link` TEXT DEFAULT NULL COMMENT 'Ad link for the item',
  `availability` TEXT NOT NULL COMMENT 'Availability status of the item',
  `price` TEXT NOT NULL COMMENT 'The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars.',
  `sale_price` TEXT DEFAULT NULL COMMENT 'The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Local inventory attributes for retail items (required fields for create/upsert)';

--
-- Table structure for table `RetailLocalInventoryItemAttributesOptional` generated from model 'RetailLocalInventoryItemAttributesOptional'
-- Local inventory attributes for retail items (all fields optional for update/get)
--

CREATE TABLE IF NOT EXISTS `RetailLocalInventoryItemAttributesOptional` (
  `ad_link` TEXT DEFAULT NULL COMMENT 'Ad link for the item',
  `availability` TEXT DEFAULT NULL COMMENT 'Availability status of the item',
  `price` TEXT DEFAULT NULL COMMENT 'The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars.',
  `sale_price` TEXT DEFAULT NULL COMMENT 'The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Local inventory attributes for retail items (all fields optional for update/get)';

--
-- Table structure for table `S3FilePart` generated from model 'S3FilePart'
--

CREATE TABLE IF NOT EXISTS `S3FilePart` (
  `part_number` INT NOT NULL COMMENT 'Part number for upload.',
  `presigned_url` TEXT NOT NULL COMMENT 'Pre-signed URL.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `S3MultipartUploadData` generated from model 'S3MultipartUploadData'
--

CREATE TABLE IF NOT EXISTS `S3MultipartUploadData` (
  `file_parts` JSON DEFAULT NULL COMMENT 'Array of file parts with pre-signed URLs.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SSIOAccount` generated from model 'SSIOAccount'
-- Salesforce account details including bill-to information.
--

CREATE TABLE IF NOT EXISTS `SSIOAccount` (
  `billto_infos` JSON DEFAULT NULL COMMENT 'An array of Salesforce account information that includes address, io terms, etc.',
  `can_edit` TINYINT(1) DEFAULT NULL COMMENT 'Advertiser eligible to update order lines',
  `currency` TEXT DEFAULT NULL,
  `eligible` TINYINT(1) DEFAULT NULL COMMENT 'Advertiser eligible to create order lines',
  `error` TEXT DEFAULT NULL COMMENT 'Error indicator from Salesforce which could be \&quot;No Error\&quot;',
  `pmp_names` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Salesforce account details including bill-to information.';

--
-- Table structure for table `SSIOAccountAddress` generated from model 'SSIOAccountAddress'
-- Salesforce address information.
--

CREATE TABLE IF NOT EXISTS `SSIOAccountAddress` (
  `address_id` TEXT DEFAULT NULL COMMENT 'Salesforce id for address',
  `display` TEXT DEFAULT NULL COMMENT 'Address display',
  `order_legal_entity` TEXT DEFAULT NULL COMMENT 'Legal entity for this insertion order',
  `purpose` TEXT DEFAULT NULL COMMENT 'Purpose for which the address is used, usually Billing or Businness'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Salesforce address information.';

--
-- Table structure for table `SSIOAccountItem` generated from model 'SSIOAccountItem'
-- Salesforce account item with billing and terms information.
--

CREATE TABLE IF NOT EXISTS `SSIOAccountItem` (
  `addresses` JSON DEFAULT NULL COMMENT 'Address information that is associated with this account.',
  `id` TEXT DEFAULT NULL COMMENT 'Salesforce id for billto_info',
  `io_terms` TEXT DEFAULT NULL COMMENT 'Salesforce text for IO Terms and Conditions',
  `io_terms_id` TEXT DEFAULT NULL COMMENT 'Salesforce id for IO Terms and Conditions',
  `io_type` TEXT DEFAULT NULL COMMENT 'Insertion Order Type - Pinterest Paper or Agency Paper',
  `row_terms` TEXT DEFAULT NULL COMMENT 'Salesforce text for Rest of the World Terms and Conditions',
  `row_terms_id` TEXT DEFAULT NULL COMMENT 'Salesforce id for Rest of the World Terms and Conditions',
  `us_terms` TEXT DEFAULT NULL COMMENT 'Salesforce text for US Terms and Conditions',
  `us_terms_id` TEXT DEFAULT NULL COMMENT 'Salesforce id for US Terms and Conditions'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Salesforce account item with billing and terms information.';

--
-- Table structure for table `SSIOAccountPMPName` generated from model 'SSIOAccountPMPName'
-- Pinterest marketing partner name.
--

CREATE TABLE IF NOT EXISTS `SSIOAccountPMPName` (
  `id` TEXT DEFAULT NULL COMMENT 'Salesforce id for PMP',
  `name` TEXT DEFAULT NULL COMMENT 'Display name'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pinterest marketing partner name.';

--
-- Table structure for table `SSIOInsertionOrder` generated from model 'SSIOInsertionOrder'
-- An SSIO insertion order.
--

CREATE TABLE IF NOT EXISTS `SSIOInsertionOrder` (
  `pin_order_id` TEXT DEFAULT NULL COMMENT 'Salesforce order id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An SSIO insertion order.';

--
-- Table structure for table `SSIOInsertionOrderCreate` generated from model 'SSIOInsertionOrderCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `SSIOInsertionOrderCreate` (
  `accepted_terms_id` TEXT NOT NULL COMMENT 'The SFDC id for the terms',
  `accepted_terms_time` INT DEFAULT NULL COMMENT 'The UTC timestamp (to the nearest sec) of when terms were accepted',
  `agency_link` TEXT DEFAULT NULL COMMENT 'URL link for agency',
  `billing_contact_email` TEXT NOT NULL COMMENT 'The billing contact email',
  `billing_contact_firstname` TEXT NOT NULL COMMENT 'The billing contact first name',
  `billing_contact_lastname` TEXT NOT NULL COMMENT 'The billing contact last name',
  `billto_billing_address_id` TEXT NOT NULL COMMENT 'The bill-to billing address id',
  `billto_business_address_id` TEXT NOT NULL COMMENT 'The bill-to business address id',
  `billto_company_id` TEXT NOT NULL COMMENT 'The bill-to company id',
  `budget_amount` DECIMAL(20, 9) DEFAULT NULL COMMENT 'If Budget order line, the budget amount.',
  `currency_info` TEXT NOT NULL,
  `end_date` TEXT DEFAULT NULL COMMENT 'End date of time period. Format: YYYY-MM-DD',
  `estimated_monthly_spend` DECIMAL(20, 9) DEFAULT NULL COMMENT 'If Ongoing (perpetual) order line, the estimated monthly spend',
  `media_contact_email` TEXT NOT NULL COMMENT 'The media contact email',
  `media_contact_firstname` TEXT NOT NULL COMMENT 'The media contact first name',
  `media_contact_lastname` TEXT NOT NULL COMMENT 'The media contact last name',
  `order_line_type` TEXT NOT NULL COMMENT 'Type can be Budget or Perpetual',
  `order_name` TEXT NOT NULL COMMENT 'The order name',
  `pmp_id` TEXT NOT NULL COMMENT 'The pmp id',
  `po_number` TEXT NOT NULL COMMENT 'The po number',
  `start_date` TEXT NOT NULL COMMENT 'Starting date of time period. Format: YYYY-MM-DD',
  `user_email` TEXT DEFAULT NULL COMMENT 'The email of user submitting the insertion order'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `SSIOInsertionOrderStatus` generated from model 'SSIOInsertionOrderStatus'
-- SSIO insertion order status item in a list response.
--

CREATE TABLE IF NOT EXISTS `SSIOInsertionOrderStatus` (
  `creation_time` TEXT DEFAULT NULL COMMENT 'Salesforce insertion order creation time',
  `pin_order_id` TEXT DEFAULT NULL COMMENT 'Salesforce order id',
  `status` TEXT DEFAULT NULL COMMENT 'Salesforce insertion order status'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='SSIO insertion order status item in a list response.';

--
-- Table structure for table `SSIOInsertionOrderStatusResponse` generated from model 'SSIOInsertionOrderStatusResponse'
-- SSIO insertion order status response for a single pin order id lookup.
--

CREATE TABLE IF NOT EXISTS `SSIOInsertionOrderStatusResponse` (
  `creation_time` TEXT DEFAULT NULL COMMENT 'Salesforce insertion order creation time',
  `pin_order_id` TEXT DEFAULT NULL COMMENT 'Salesforce order id',
  `status` TEXT DEFAULT NULL COMMENT 'Salesforce insertion order status'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='SSIO insertion order status response for a single pin order id lookup.';

--
-- Table structure for table `SSIOInsertionOrderUpdate` generated from model 'SSIOInsertionOrderUpdate'
-- Resource create or update operation model.
--

CREATE TABLE IF NOT EXISTS `SSIOInsertionOrderUpdate` (
  `ads_manager_order_line_id` TEXT DEFAULT NULL COMMENT 'Ads manager OrderLineId',
  `agency_link` TEXT DEFAULT NULL COMMENT 'URL link for agency',
  `billing_contact_email` TEXT DEFAULT NULL COMMENT 'The billing contact email',
  `billing_contact_firstname` TEXT DEFAULT NULL COMMENT 'The billing contact first name',
  `billing_contact_lastname` TEXT DEFAULT NULL COMMENT 'The billing contact last name',
  `budget_amount` DECIMAL(20, 9) DEFAULT NULL COMMENT 'If Budget order line, the budget amount.',
  `end_date` TEXT DEFAULT NULL COMMENT 'End date of time period. Format: YYYY-MM-DD',
  `media_contact_email` TEXT DEFAULT NULL COMMENT 'The media contact email',
  `media_contact_firstname` TEXT DEFAULT NULL COMMENT 'The media contact first name',
  `media_contact_lastname` TEXT DEFAULT NULL COMMENT 'The media contact last name',
  `oracle_line_id` TEXT DEFAULT NULL COMMENT 'LineId in the Oracle DB',
  `po_number` TEXT DEFAULT NULL COMMENT 'The po number',
  `salesforce_order_id` TEXT DEFAULT NULL COMMENT 'OrderId in SFDC',
  `salesforce_order_line_id` TEXT DEFAULT NULL COMMENT 'OrderLineId in SFDC',
  `start_date` TEXT DEFAULT NULL COMMENT 'Starting date of time period. Format: YYYY-MM-DD',
  `user_email` TEXT DEFAULT NULL COMMENT 'The email of user submitting the insertion order'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create or update operation model.';

--
-- Table structure for table `SSIOOrderLine` generated from model 'SSIOOrderLine'
-- A Salesforce SSIO order line.
--

CREATE TABLE IF NOT EXISTS `SSIOOrderLine` (
  `accepted_terms_id` TEXT DEFAULT NULL COMMENT 'The SFDC id for the terms',
  `accepted_terms_time` TEXT DEFAULT NULL COMMENT 'The UTC timestamp (to the nearest second) when terms were accepted.',
  `ads_manager_order_line_id` TEXT DEFAULT NULL COMMENT 'Ads manager order line id',
  `agency_link` TEXT DEFAULT NULL COMMENT 'Agency link',
  `bill_to_company_name` TEXT DEFAULT NULL COMMENT 'Bill-to company name',
  `billing_contact_email` TEXT DEFAULT NULL COMMENT 'Billing contact email',
  `billing_contact_firstname` TEXT DEFAULT NULL COMMENT 'Billing contact first name',
  `billing_contact_lastname` TEXT DEFAULT NULL COMMENT 'Billing contact last name',
  `budget_amount` DECIMAL(20, 9) DEFAULT NULL COMMENT 'If budget order line, the budget amount.',
  `currency_info` TEXT DEFAULT NULL,
  `end_date` DATE DEFAULT NULL COMMENT 'End date of the order line.',
  `estimated_monthly_spend` DECIMAL(20, 9) DEFAULT NULL COMMENT 'If ongoing (perpetual) order line, the estimated monthly spend.',
  `last_modified_date_time` TEXT DEFAULT NULL COMMENT 'Last modified date.',
  `media_contact_email` TEXT DEFAULT NULL COMMENT 'Billing media email',
  `media_contact_firstname` TEXT DEFAULT NULL COMMENT 'Billing media contact first name',
  `media_contact_lastname` TEXT DEFAULT NULL COMMENT 'Billing media contact last name',
  `order_name` TEXT DEFAULT NULL COMMENT 'The order name',
  `pin_order_id` TEXT DEFAULT NULL COMMENT 'The pin order id associated with the order line in SFDC',
  `pmp_name` TEXT DEFAULT NULL COMMENT 'The Pinterest marketing partner name',
  `po_number` TEXT DEFAULT NULL COMMENT 'The PO number',
  `salesforce_order_line_id` TEXT DEFAULT NULL COMMENT 'Order line id in SFDC',
  `start_date` DATE DEFAULT NULL COMMENT 'Start date of the order line.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A Salesforce SSIO order line.';

--
-- Table structure for table `Schedule` generated from model 'Schedule'
--

CREATE TABLE IF NOT EXISTS `Schedule` (
  `delta_value` TEXT DEFAULT NULL,
  `end_timestamp` INT DEFAULT NULL COMMENT 'Schedule end time. Unix timestamp in seconds.',
  `entity_id` TEXT NOT NULL COMMENT 'entity ID.',
  `entity_type` TEXT DEFAULT NULL COMMENT 'Specify the entity_type to get summary information',
  `name` TEXT DEFAULT NULL COMMENT 'Schedule name.',
  `schedule_action` TEXT DEFAULT NULL COMMENT 'The schedule action.',
  `schedule_id` TEXT NOT NULL COMMENT 'Schedule ID.',
  `schedule_status` TEXT DEFAULT NULL COMMENT 'Schedule status.',
  `schedule_type` TEXT DEFAULT NULL COMMENT 'The schedule type.',
  `start_timestamp` INT DEFAULT NULL COMMENT 'Schedule start time. Unix timestamp in seconds.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ScheduleAgeBucketMultipliers` generated from model 'ScheduleAgeBucketMultipliers'
-- This represents a mapping from age bucket to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `ScheduleAgeBucketMultipliers` (
  `AGE_BUCKET` ENUM('18-24', '25-34', '35-44', '45-49', '50-54', '55-64', '65+') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This represents a mapping from age bucket to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.';

--
-- Table structure for table `ScheduleAppTypeMultipliers` generated from model 'ScheduleAppTypeMultipliers'
-- This represents a mapping from app type targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `ScheduleAppTypeMultipliers` (
  `APP_TYPE` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This represents a mapping from app type targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.';

--
-- Table structure for table `ScheduleAudienceMultipliers` generated from model 'ScheduleAudienceMultipliers'
-- This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `ScheduleAudienceMultipliers` (
  `AUDIENCE_ID` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.';

--
-- Table structure for table `ScheduleBatchUpdate` generated from model 'ScheduleBatchUpdate'
--

CREATE TABLE IF NOT EXISTS `ScheduleBatchUpdate` (
  `delta_value` TEXT DEFAULT NULL,
  `end_timestamp` INT DEFAULT NULL COMMENT 'Schedule end time. Unix timestamp in seconds.',
  `entity_id` TEXT DEFAULT NULL COMMENT 'entity ID.',
  `entity_type` TEXT DEFAULT NULL COMMENT 'Specify the entity_type to get summary information',
  `id` VARCHAR(18) NOT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'Schedule name.',
  `schedule_action` TEXT DEFAULT NULL COMMENT 'The schedule action.',
  `schedule_id` TEXT NOT NULL COMMENT 'Schedule ID.',
  `schedule_status` TEXT DEFAULT NULL COMMENT 'Schedule status.',
  `schedule_type` TEXT DEFAULT NULL COMMENT 'The schedule type.',
  `start_timestamp` INT DEFAULT NULL COMMENT 'Schedule start time. Unix timestamp in seconds.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ScheduleBidMultipliers` generated from model 'ScheduleBidMultipliers'
-- The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.
--

CREATE TABLE IF NOT EXISTS `ScheduleBidMultipliers` (
  `age_bucket_multipliers` TEXT DEFAULT NULL,
  `app_type_multipliers` TEXT DEFAULT NULL,
  `audience_multipliers` JSON DEFAULT NULL,
  `gender_multipliers` TEXT DEFAULT NULL,
  `placement_multipliers` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.';

--
-- Table structure for table `ScheduleBidOptions` generated from model 'ScheduleBidOptions'
-- Object describing the schedule level bid level changes.
--

CREATE TABLE IF NOT EXISTS `ScheduleBidOptions` (
  `age_bucket_multipliers` TEXT DEFAULT NULL,
  `app_type_multipliers` TEXT DEFAULT NULL,
  `audience_multipliers` TEXT DEFAULT NULL,
  `gender_multipliers` TEXT DEFAULT NULL,
  `placement_multipliers` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing the schedule level bid level changes.';

--
-- Table structure for table `ScheduleBidOptions_gender_multipliers` generated from model 'ScheduleBidOptionsUnderscoregenderUnderscoremultipliers'
-- This represents a mapping from gender targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `ScheduleBidOptions_gender_multipliers` (
  `GENDER` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This represents a mapping from gender targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.';

--
-- Table structure for table `ScheduleBidOptions_placement_multipliers` generated from model 'ScheduleBidOptionsUnderscoreplacementUnderscoremultipliers'
-- This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `ScheduleBidOptions_placement_multipliers` (
  `browse` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Browse (home-feed and related surfaces)',
  `related_pins` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Related-Pins placement',
  `search` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Search placement'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.';

--
-- Table structure for table `ScheduleCommonDeltaValue` generated from model 'ScheduleCommonDeltaValue'
--

CREATE TABLE IF NOT EXISTS `ScheduleCommonDeltaValue` (
  `age_bucket_multipliers` TEXT DEFAULT NULL,
  `app_type_multipliers` TEXT DEFAULT NULL,
  `audience_multipliers` TEXT DEFAULT NULL,
  `gender_multipliers` TEXT DEFAULT NULL,
  `placement_multipliers` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ScheduleCreate` generated from model 'ScheduleCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `ScheduleCreate` (
  `delta_value` TEXT DEFAULT NULL,
  `end_timestamp` INT DEFAULT NULL COMMENT 'Schedule end time. Unix timestamp in seconds.',
  `entity_id` TEXT NOT NULL COMMENT 'entity ID.',
  `entity_type` TEXT DEFAULT NULL COMMENT 'Specify the entity_type to get summary information',
  `name` TEXT DEFAULT NULL COMMENT 'Schedule name.',
  `schedule_action` TEXT DEFAULT NULL COMMENT 'The schedule action.',
  `schedule_status` TEXT DEFAULT NULL COMMENT 'Schedule status.',
  `schedule_type` TEXT DEFAULT NULL COMMENT 'The schedule type.',
  `start_timestamp` INT DEFAULT NULL COMMENT 'Schedule start time. Unix timestamp in seconds.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `ScheduleCreateRequest` generated from model 'ScheduleCreateRequest'
--

CREATE TABLE IF NOT EXISTS `ScheduleCreateRequest` (
  `entity_id` TEXT NOT NULL,
  `entity_type` TEXT NOT NULL COMMENT 'Entity type',
  `delta_value` TEXT NOT NULL,
  `end_timestamp` INT NOT NULL COMMENT 'Schedule end time. Unix timestamp in seconds.',
  `name` TEXT NOT NULL,
  `schedule_action` TEXT NOT NULL,
  `schedule_status` TEXT NOT NULL,
  `schedule_type` TEXT NOT NULL,
  `start_timestamp` INT NOT NULL COMMENT 'Schedule start time. Unix timestamp in seconds.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ScheduleCreateRequestAllOf1` generated from model 'ScheduleCreateRequestAllOf1'
--

CREATE TABLE IF NOT EXISTS `ScheduleCreateRequestAllOf1` (
  `entity_id` TEXT NOT NULL,
  `entity_type` TEXT NOT NULL COMMENT 'Entity type'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Schedule_delta_value` generated from model 'ScheduleUnderscoredeltaUnderscorevalue'
-- The value of the scheduled adjustment.
--

CREATE TABLE IF NOT EXISTS `Schedule_delta_value` (
  `age_bucket_multipliers` TEXT DEFAULT NULL,
  `app_type_multipliers` TEXT DEFAULT NULL,
  `audience_multipliers` JSON DEFAULT NULL,
  `gender_multipliers` TEXT DEFAULT NULL,
  `placement_multipliers` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The value of the scheduled adjustment.';

--
-- Table structure for table `ScheduleGenderMultipliers` generated from model 'ScheduleGenderMultipliers'
-- This represents a mapping from gender targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `ScheduleGenderMultipliers` (
  `GENDER` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This represents a mapping from gender targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.';

--
-- Table structure for table `SchedulePlacementMultipliers` generated from model 'SchedulePlacementMultipliers'
-- This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `SchedulePlacementMultipliers` (
  `browse` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Browse (home-feed and related surfaces)',
  `related_pins` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Related-Pins placement',
  `search` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Search placement'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.';

--
-- Table structure for table `ScheduleUpdateRequest` generated from model 'ScheduleUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `ScheduleUpdateRequest` (
  `entity_id` TEXT DEFAULT NULL,
  `entity_type` TEXT DEFAULT NULL COMMENT 'Entity type',
  `id` TEXT NOT NULL COMMENT 'Schedule ID.',
  `delta_value` TEXT DEFAULT NULL,
  `end_timestamp` INT DEFAULT NULL COMMENT 'Schedule end time. Unix timestamp in seconds.',
  `name` TEXT DEFAULT NULL,
  `schedule_action` TEXT DEFAULT NULL,
  `schedule_status` TEXT DEFAULT NULL,
  `schedule_type` TEXT DEFAULT NULL,
  `start_timestamp` INT DEFAULT NULL COMMENT 'Schedule start time. Unix timestamp in seconds.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ScheduleUpdateRequestAllOf1` generated from model 'ScheduleUpdateRequestAllOf1'
--

CREATE TABLE IF NOT EXISTS `ScheduleUpdateRequestAllOf1` (
  `entity_id` TEXT DEFAULT NULL,
  `entity_type` TEXT DEFAULT NULL COMMENT 'Entity type',
  `id` TEXT NOT NULL COMMENT 'Schedule ID.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `schedules_create_200_response_inner` generated from model 'schedulesUnderscorecreateUnderscore200UnderscoreresponseUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `schedules_create_200_response_inner` (
  `data` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `schedules_create_200_response_inner_data` generated from model 'schedulesUnderscorecreateUnderscore200UnderscoreresponseUnderscoreinnerUnderscoredata'
-- Created/updated resource on success or error details on failure
--

CREATE TABLE IF NOT EXISTS `schedules_create_200_response_inner_data` (
  `delta_value` TEXT DEFAULT NULL,
  `end_timestamp` INT DEFAULT NULL COMMENT 'Schedule end time. Unix timestamp in seconds.',
  `entity_id` TEXT NOT NULL COMMENT 'entity ID.',
  `entity_type` TEXT DEFAULT NULL COMMENT 'Specify the entity_type to get summary information',
  `name` TEXT DEFAULT NULL COMMENT 'Schedule name.',
  `schedule_action` TEXT DEFAULT NULL COMMENT 'The schedule action.',
  `schedule_id` TEXT NOT NULL COMMENT 'Schedule ID.',
  `schedule_status` TEXT DEFAULT NULL COMMENT 'Schedule status.',
  `schedule_type` TEXT DEFAULT NULL COMMENT 'The schedule type.',
  `start_timestamp` INT DEFAULT NULL COMMENT 'Schedule start time. Unix timestamp in seconds.',
  `id` VARCHAR(18) NOT NULL,
  `exceptions` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Created/updated resource on success or error details on failure';

--
-- Table structure for table `schedules_create_200_response_inner_data_oneOf` generated from model 'schedulesUnderscorecreateUnderscore200UnderscoreresponseUnderscoreinnerUnderscoredataUnderscoreoneOf'
--

CREATE TABLE IF NOT EXISTS `schedules_create_200_response_inner_data_oneOf` (
  `id` VARCHAR(18) NOT NULL,
  `schedule_id` TEXT NOT NULL COMMENT 'Schedule ID.',
  `exceptions` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `schedules_list_200_response` generated from model 'schedulesUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `schedules_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ScrollupGoalMetadata` generated from model 'ScrollupGoalMetadata'
--

CREATE TABLE IF NOT EXISTS `ScrollupGoalMetadata` (
  `scrollup_goal_value_in_micro_currency` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `search_partner_pins_200_response` generated from model 'searchUnderscorepartnerUnderscorepinsUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `search_partner_pins_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SharedAudienceAccount` generated from model 'SharedAudienceAccount'
--

CREATE TABLE IF NOT EXISTS `SharedAudienceAccount` (
  `account_id` TEXT NOT NULL COMMENT 'Account ID (ad account or business ID).',
  `account_name` TEXT NOT NULL COMMENT 'Account name.',
  `account_type` TEXT NOT NULL COMMENT 'account type',
  `shared_on_timestamp` INT NOT NULL COMMENT 'Epoch timestamp in seconds for the shared audience event'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `shared_audiences_for_business_list_200_response` generated from model 'sharedUnderscoreaudiencesUnderscoreforUnderscorebusinessUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `shared_audiences_for_business_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SingleInterestTargetingOption` generated from model 'SingleInterestTargetingOption'
--

CREATE TABLE IF NOT EXISTS `SingleInterestTargetingOption` (
  `child_interests` JSON NOT NULL,
  `id` TEXT NOT NULL,
  `level` INT NOT NULL,
  `name` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ssio_insertion_orders_status_get_by_ad_account_200_response` generated from model 'ssioUnderscoreinsertionUnderscoreordersUnderscorestatusUnderscoregetUnderscorebyUnderscoreadUnderscoreaccountUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `ssio_insertion_orders_status_get_by_ad_account_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ssio_order_lines_get_by_ad_account_200_response` generated from model 'ssioUnderscoreorderUnderscorelinesUnderscoregetUnderscorebyUnderscoreadUnderscoreaccountUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `ssio_order_lines_get_by_ad_account_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `StoreMetadata` generated from model 'StoreMetadata'
-- Store metadata for a specific store location
--

CREATE TABLE IF NOT EXISTS `StoreMetadata` (
  `geohash` TEXT DEFAULT NULL COMMENT 'Geohash of the store location',
  `latitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Geographic latitude coordinate of the store',
  `longitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Geographic longitude coordinate of the store',
  `store_code` TEXT NOT NULL COMMENT 'Merchant provided store code',
  `store_id` TEXT NOT NULL COMMENT 'Internal store code',
  `store_name` TEXT DEFAULT NULL COMMENT 'Store name'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Store metadata for a specific store location';

--
-- Table structure for table `SummaryPin` generated from model 'SummaryPin'
-- Summarized pin information
--

CREATE TABLE IF NOT EXISTS `SummaryPin` (
  `alt_text` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `id` TEXT NOT NULL,
  `link` TEXT DEFAULT NULL,
  `media` TEXT DEFAULT NULL,
  `title` VARCHAR(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Summarized pin information';

--
-- Table structure for table `SupplementalItemValidationEvent` generated from model 'SupplementalItemValidationEvent'
-- Item validation event
--

CREATE TABLE IF NOT EXISTS `SupplementalItemValidationEvent` (
  `attribute` TEXT NOT NULL COMMENT 'The item attribute referenced by the validation event eg. price, availability, ad_link',
  `code` INT NOT NULL COMMENT 'The event code that the item validation event references',
  `message` TEXT NOT NULL COMMENT 'Title message describing the item validation event'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Item validation event';

--
-- Table structure for table `SupplementalItemsBatchResponse` generated from model 'SupplementalItemsBatchResponse'
-- Response model for supplemental items batch operation
--

CREATE TABLE IF NOT EXISTS `SupplementalItemsBatchResponse` (
  `batch_id` TEXT NOT NULL COMMENT 'Id of the batch operation',
  `completed_time` DATETIME DEFAULT NULL COMMENT 'Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss',
  `created_time` DATETIME NOT NULL COMMENT 'Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss',
  `operation_results` JSON NOT NULL COMMENT 'Array of operation results',
  `status` TEXT NOT NULL COMMENT 'Status of the batch: PROCESSING, COMPLETED, FAILED'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Response model for supplemental items batch operation';

--
-- Table structure for table `SupplementalOperationResult` generated from model 'SupplementalOperationResult'
-- Result of a supplemental item operation, discriminated by supplemental_type
--

CREATE TABLE IF NOT EXISTS `SupplementalOperationResult` (
  `errors` JSON DEFAULT NULL COMMENT 'Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.',
  `item_id` TEXT NOT NULL COMMENT 'Catalog item id in the merchant namespace',
  `status` TEXT NOT NULL COMMENT 'Status of the item processing record',
  `store_code` TEXT NOT NULL COMMENT 'Store code for the local inventory item',
  `supplemental_type` ENUM('LOCAL_INVENTORY') NOT NULL,
  `warnings` JSON DEFAULT NULL COMMENT 'Array with the validation warnings for the item processing record'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Result of a supplemental item operation, discriminated by supplemental_type';

--
-- Table structure for table `SystemUserUpdateWithRequiredBody` generated from model 'SystemUserUpdateWithRequiredBody'
-- Resource create or update operation model with required body fields (no OptionalProperties).
--

CREATE TABLE IF NOT EXISTS `SystemUserUpdateWithRequiredBody` (
  `name` TEXT NOT NULL COMMENT 'New system user name'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create or update operation model with required body fields (no OptionalProperties).';

--
-- Table structure for table `TargetingSpec` generated from model 'TargetingSpec'
-- Ad group targeting specification defining the ad group target audience. For example, &#x60;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;MINIMUM_AGE\&quot;:\&quot;18\&quot;, \&quot;MAXIMUM_AGE\&quot;:\&quot;65+\&quot;}&#x60;
--

CREATE TABLE IF NOT EXISTS `TargetingSpec` (
  `AGE_BUCKET` JSON DEFAULT NULL COMMENT '**Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted.',
  `APPTYPE` JSON DEFAULT NULL COMMENT 'Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.',
  `AUDIENCE_EXCLUDE` JSON DEFAULT NULL COMMENT 'Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\&quot;2542620905475\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.',
  `AUDIENCE_INCLUDE` JSON DEFAULT NULL COMMENT 'Targeted customer list IDs. For example: [\&quot;2542620905473\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.',
  `GENDER` JSON DEFAULT NULL COMMENT 'Targeted genders. Values: [\&quot;unknown\&quot;,\&quot;male\&quot;,\&quot;female\&quot;]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.',
  `GEO` JSON DEFAULT NULL COMMENT 'Region codes or postal codes to include for targeting.&lt;br /&gt;&lt;br /&gt; Region codes represent broader geographical areas. Example: &lt;code&gt;US-CA&lt;/code&gt; is the region code for California in the United States.&lt;br /&gt;&lt;br /&gt; Postal codes represent more granular, specific areas. Example: &lt;code&gt;94103&lt;/code&gt; is a postal code for a specifc area in San Francisco, California, U.S.A.&lt;br /&gt;&lt;br /&gt; For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like &lt;code&gt;US-CA&lt;/code&gt; or a more granular postal code within that regon, such as &lt;code&gt;94103&lt;/code&gt;.&lt;br /&gt;&lt;br /&gt; You can specify multiple region codes or postal codes in an array, depending on which method you choose.&lt;br /&gt;&lt;br /&gt; Precede a region code array with the &lt;code&gt;region_codes&lt;/code&gt; key and a postal code value with the &lt;code&gt;postal_codes&lt;/code&gt; key. Examples:&lt;br /&gt;&lt;br /&gt; &lt;code&gt;\&quot;geo\&quot;: {&lt;/code&gt;&lt;br /&gt; &lt;code&gt;\&quot;region_codes\&quot;: [\&quot;US-CA\&quot;]&lt;/code&gt;&lt;br /&gt; &lt;code&gt;}&lt;/code&gt;&lt;br /&gt;&lt;br /&gt; &lt;code&gt;\&quot;geo\&quot;: {&lt;/code&gt;&lt;br /&gt; &lt;code&gt;\&quot;postal_codes\&quot;: [\&quot;94103\&quot;]&lt;/code&gt;&lt;br /&gt; &lt;code&gt;}&lt;/code&gt;&lt;br /&gt;&lt;br /&gt; For each ad group, specify at least one &lt;code&gt;GEO&lt;/code&gt; or &lt;code&gt;LOCATION&lt;/code&gt;. &lt;br /&gt;&lt;br /&gt; If you do not specifiy a &lt;code&gt;GEO&lt;/code&gt; code, only &lt;code&gt;LOCATION&lt;/code&gt; values will be targeted (See &lt;code&gt;LOCATION&lt;/code&gt; parameter in this targeting spec.).&lt;br /&gt;&lt;br /&gt; Learn how to &lt;a href&#x3D;\&quot;/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\&quot; target&#x3D;\&quot;_blank\&quot;&gt;get a current, complete list of codes&lt;/a&gt;.',
  `GEO_EXCLUDE` JSON DEFAULT NULL COMMENT 'Region codes or postal codes to exclude from the targeting inclusion area.&lt;br /&gt;&lt;br /&gt; See &lt;code&gt;GEO&lt;/code&gt; parameter in this targeting spec for rules, syntax, and other information.&lt;br /&gt;',
  `INTEREST` JSON DEFAULT NULL COMMENT 'Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.',
  `LOCALE` JSON DEFAULT NULL COMMENT '24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted.',
  `LOCATION` JSON DEFAULT NULL COMMENT 'Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.&lt;br /&gt;&lt;br /&gt; Precede country code values with the &lt;code&gt;country_codes&lt;/code&gt; key and metro code values with &lt;code&gt;metro_codes&lt;/code&gt; key. Example:&lt;br /&gt;&lt;br /&gt; &lt;code&gt;\&quot;location\&quot;: {&lt;/code&gt;&lt;br /&gt; &lt;code&gt;\&quot;country_codes\&quot;: [\&quot;US\&quot;, \&quot;CA\&quot;],&lt;/code&gt;&lt;br /&gt; &lt;code&gt;\&quot;metro_codes\&quot;: [\&quot;501\&quot;, \&quot;602\&quot;]&lt;/code&gt;&lt;br /&gt; &lt;code&gt;}&lt;/code&gt;&lt;br /&gt;&lt;br /&gt; For each ad group, specify at least one &lt;code&gt;GEO&lt;/code&gt; or &lt;code&gt;LOCATION&lt;/code&gt; code. &lt;br /&gt;&lt;br /&gt; If you do not specify a &lt;code&gt;LOCATION&lt;/code&gt; code, only &lt;code&gt;GEO&lt;/code&gt; values will be targeted (See &lt;code&gt;GEO&lt;/code&gt; parameter in this targeting spec.).&lt;br /&gt;&lt;br /&gt; Learn how to &lt;a href&#x3D;\&quot;/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\&quot; target&#x3D;\&quot;_blank\&quot;&gt;get a current, complete list of codes&lt;/a&gt;.',
  `LOCATION_EXCLUDE` JSON DEFAULT NULL COMMENT 'Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.&lt;br /&gt;&lt;br /&gt; See &lt;code&gt;LOCATION&lt;/code&gt; parameter in this targeting spec for rules, syntax, and other information.',
  `MAXIMUM_AGE` TEXT DEFAULT NULL COMMENT 'Maximum age to target (inclusive). Values: \&quot;18\&quot;, \&quot;19\&quot;, ..., \&quot;65\&quot;, \&quot;65+\&quot;. Must be used together with &#x60;MINIMUM_AGE&#x60;. Cannot be combined with &#x60;AGE_BUCKET&#x60;. If neither &#x60;MINIMUM_AGE&#x60;/&#x60;MAXIMUM_AGE&#x60; nor &#x60;AGE_BUCKET&#x60; are specified, all ages will be targeted.',
  `MINIMUM_AGE` TEXT DEFAULT NULL COMMENT 'Minimum age to target (inclusive). Values: \&quot;18\&quot;, \&quot;19\&quot;, ..., \&quot;65\&quot;. Note: 65+ is not allowed for minimum age. Must be used together with &#x60;MAXIMUM_AGE&#x60;. Cannot be combined with &#x60;AGE_BUCKET&#x60;. If neither &#x60;MINIMUM_AGE&#x60;/&#x60;MAXIMUM_AGE&#x60; nor &#x60;AGE_BUCKET&#x60; are specified, all ages will be targeted.',
  `SHOPPING_RETARGETING` JSON DEFAULT NULL COMMENT 'Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting',
  `TARGETING_STRATEGY` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ad group targeting specification defining the ad group target audience. For example, &#x60;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;MINIMUM_AGE\&quot;:\&quot;18\&quot;, \&quot;MAXIMUM_AGE\&quot;:\&quot;65+\&quot;}&#x60;';

--
-- Table structure for table `TargetingSpecOperationAgeBucket` generated from model 'TargetingSpecOperationAgeBucket'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationAgeBucket` (
  `field` ENUM('AGE_BUCKET') NOT NULL,
  `operation` ENUM('SET') NOT NULL,
  `values` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingSpecOperationAppType` generated from model 'TargetingSpecOperationAppType'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationAppType` (
  `field` ENUM('APPTYPE') NOT NULL,
  `operation` TEXT NOT NULL,
  `values` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingSpecOperationAudienceExclude` generated from model 'TargetingSpecOperationAudienceExclude'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationAudienceExclude` (
  `field` ENUM('AUDIENCE_EXCLUDE') NOT NULL,
  `operation` TEXT NOT NULL,
  `values` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingSpecOperationAudienceInclude` generated from model 'TargetingSpecOperationAudienceInclude'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationAudienceInclude` (
  `field` ENUM('AUDIENCE_INCLUDE') NOT NULL,
  `operation` TEXT NOT NULL,
  `values` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingSpecOperationGender` generated from model 'TargetingSpecOperationGender'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationGender` (
  `field` ENUM('GENDER') NOT NULL,
  `operation` TEXT NOT NULL,
  `values` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingSpecOperationGeo` generated from model 'TargetingSpecOperationGeo'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationGeo` (
  `field` ENUM('GEO') NOT NULL,
  `operation` TEXT NOT NULL,
  `values` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingSpecOperationGeoExclude` generated from model 'TargetingSpecOperationGeoExclude'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationGeoExclude` (
  `field` ENUM('GEO_EXCLUDE') NOT NULL,
  `operation` TEXT NOT NULL,
  `values` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingSpecOperationInterest` generated from model 'TargetingSpecOperationInterest'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationInterest` (
  `field` ENUM('INTEREST') NOT NULL,
  `operation` TEXT NOT NULL,
  `values` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingSpecOperationLocale` generated from model 'TargetingSpecOperationLocale'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationLocale` (
  `field` ENUM('LOCALE') NOT NULL,
  `operation` TEXT NOT NULL,
  `values` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingSpecOperationLocation` generated from model 'TargetingSpecOperationLocation'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationLocation` (
  `field` ENUM('LOCATION') NOT NULL,
  `operation` TEXT NOT NULL,
  `values` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingSpecOperationLocationExclude` generated from model 'TargetingSpecOperationLocationExclude'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationLocationExclude` (
  `field` ENUM('LOCATION_EXCLUDE') NOT NULL,
  `operation` TEXT NOT NULL,
  `values` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingSpecOperationMaximumAge` generated from model 'TargetingSpecOperationMaximumAge'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationMaximumAge` (
  `field` ENUM('MAXIMUM_AGE') NOT NULL,
  `operation` ENUM('SET') NOT NULL,
  `value` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingSpecOperationMinimumAge` generated from model 'TargetingSpecOperationMinimumAge'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationMinimumAge` (
  `field` ENUM('MINIMUM_AGE') NOT NULL,
  `operation` ENUM('SET') NOT NULL,
  `value` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingSpecOperationShoppingRetargeting` generated from model 'TargetingSpecOperationShoppingRetargeting'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationShoppingRetargeting` (
  `field` ENUM('SHOPPING_RETARGETING') NOT NULL,
  `operation` ENUM('SET') NOT NULL,
  `values` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingSpecOperations` generated from model 'TargetingSpecOperations'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperations` (
  `field` ENUM('MINIMUM_AGE') NOT NULL,
  `operation` ENUM('SET') NOT NULL,
  `values` JSON NOT NULL,
  `value` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingSpecOptimal` generated from model 'TargetingSpecOptimal'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOptimal` (
  `AGE_BUCKET` JSON DEFAULT NULL COMMENT '**Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted.',
  `APPTYPE` JSON DEFAULT NULL COMMENT 'Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.',
  `AUDIENCE_EXCLUDE` JSON DEFAULT NULL COMMENT 'Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\&quot;2542620905475\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.',
  `AUDIENCE_INCLUDE` JSON DEFAULT NULL COMMENT 'Targeted customer list IDs. For example: [\&quot;2542620905473\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.',
  `GENDER` JSON DEFAULT NULL COMMENT 'Targeted genders. Values: [\&quot;unknown\&quot;,\&quot;male\&quot;,\&quot;female\&quot;]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.',
  `GEO` JSON DEFAULT NULL COMMENT 'Region codes or postal codes to include for targeting.  Region codes represent broader geographical areas. Example: &#x60;US-CA&#x60; is the region code for California in the United States.  Postal codes represent more granular, specific areas. Example: &#x60;94103&#x60; is a postal code for a specifc area in San Francisco, California, U.S.A.  For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like &#x60;US-CA&#x60; or a more granular postal code within that regon, such as &#x60;94103&#x60;.  You can specify multiple region codes or postal codes in an array, depending on which method you choose.  Precede a region code array with the &#x60;region_codes&#x60; key and a postal code value with the &#x60;postal_codes&#x60; key. Examples:  &#x60;&#x60;&#x60; \&quot;geo\&quot;: {   \&quot;region_codes\&quot;: [\&quot;US-CA\&quot;] } &#x60;&#x60;&#x60;  &#x60;&#x60;&#x60; \&quot;geo\&quot;: {   \&quot;postal_codes\&quot;: [\&quot;94103\&quot;] } &#x60;&#x60;&#x60;  For each ad group, specify at least one &#x60;GEO&#x60; or &#x60;LOCATION&#x60;.  If you do not specifiy a &#x60;GEO&#x60; code, only &#x60;LOCATION&#x60; values will be targeted (See &#x60;LOCATION&#x60; parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones).',
  `GEO_EXCLUDE` JSON DEFAULT NULL COMMENT '[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Region codes or postal codes to exclude from the targeting inclusion area.  See &#x60;GEO&#x60; parameter in this targeting spec for rules, syntax, and other information.',
  `INTEREST` JSON DEFAULT NULL COMMENT 'Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.',
  `LOCALE` JSON DEFAULT NULL COMMENT '24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted.',
  `LOCATION` JSON DEFAULT NULL COMMENT 'Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.  Precede country code values with the &#x60;country_codes&#x60; key and metro code values with &#x60;metro_codes&#x60; key. Example:  &#x60;&#x60;&#x60; \&quot;location\&quot;: {   \&quot;country_codes\&quot;: [\&quot;US\&quot;, \&quot;CA\&quot;],   \&quot;metro_codes\&quot;: [\&quot;501\&quot;, \&quot;602\&quot;] } &#x60;&#x60;&#x60;  For each ad group, specify at least one &#x60;GEO&#x60; or &#x60;LOCATION&#x60; code.  If you do not specify a &#x60;LOCATION&#x60; code, only &#x60;GEO&#x60; values will be targeted (See &#x60;GEO&#x60; parameter in this targeting spec.).  Learn how to [get a current, complete list of codes](/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones).',
  `LOCATION_EXCLUDE` JSON DEFAULT NULL COMMENT '[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.  See &#x60;LOCATION&#x60; parameter in this targeting spec for rules, syntax, and other information.',
  `MAXIMUM_AGE` TEXT DEFAULT NULL COMMENT 'Maximum age to target (inclusive). Values: \&quot;18\&quot;, \&quot;19\&quot;, ..., \&quot;65\&quot;, \&quot;65+\&quot;. Must be used together with &#x60;MINIMUM_AGE&#x60;. Cannot be combined with &#x60;AGE_BUCKET&#x60;. If neither &#x60;MINIMUM_AGE&#x60;/&#x60;MAXIMUM_AGE&#x60; nor &#x60;AGE_BUCKET&#x60; are specified, all ages will be targeted.',
  `MINIMUM_AGE` TEXT DEFAULT NULL COMMENT 'Minimum age to target (inclusive). Values: \&quot;18\&quot;, \&quot;19\&quot;, ..., \&quot;65\&quot;. Note: 65+ is not allowed for minimum age. Must be used together with &#x60;MAXIMUM_AGE&#x60;. Cannot be combined with &#x60;AGE_BUCKET&#x60;. If neither &#x60;MINIMUM_AGE&#x60;/&#x60;MAXIMUM_AGE&#x60; nor &#x60;AGE_BUCKET&#x60; are specified, all ages will be targeted.',
  `SHOPPING_RETARGETING` JSON DEFAULT NULL COMMENT 'Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting',
  `TARGETING_STRATEGY` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingSpecShoppingRetargeting` generated from model 'TargetingSpecShoppingRetargeting'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecShoppingRetargeting` (
  `exclusion_window` INT DEFAULT NULL COMMENT 'Number of days ago to stop lookback timeframe for dynamic retargeting',
  `lookback_window` INT DEFAULT NULL COMMENT 'Number of days ago to start lookback timeframe for dynamic retargeting',
  `tag_types` JSON DEFAULT NULL COMMENT 'Event types to target for dynamic retargeting'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingTemplate` generated from model 'TargetingTemplate'
--

CREATE TABLE IF NOT EXISTS `TargetingTemplate` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'The ID of the advertiser that this targeting template belongs to.',
  `auto_targeting_enabled` TINYINT(1) DEFAULT true COMMENT 'Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting).',
  `created_time` INT DEFAULT NULL COMMENT 'Targeting template created time. Unix timestamp in seconds.',
  `id` TEXT DEFAULT NULL COMMENT 'Targeting template ID.',
  `keywords` JSON DEFAULT NULL,
  `name` TEXT NOT NULL COMMENT 'targeting template name',
  `placement_group` TEXT DEFAULT NULL,
  `sizing` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL COMMENT 'Indicate targeting template is active or Deleted',
  `targeting_attributes` TEXT NOT NULL COMMENT 'targeting profile attributes',
  `tracking_urls` TEXT DEFAULT NULL,
  `updated_time` INT DEFAULT NULL COMMENT 'Targeting template updated time.Unix timestamp in seconds.',
  `valid` TINYINT(1) DEFAULT NULL COMMENT 'Inform if the targeting template is valid (ex. would be false if has revoked audience)'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingTemplateAudienceSizing` generated from model 'TargetingTemplateAudienceSizing'
-- Gets an audience size estimate for a set of given targeting spec data. **Returns:** An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate.
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateAudienceSizing` (
  `reach_estimate` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Gets an audience size estimate for a set of given targeting spec data. **Returns:** An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate.';

--
-- Table structure for table `TargetingTemplateAudienceSizingReachEstimate` generated from model 'TargetingTemplateAudienceSizingReachEstimate'
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateAudienceSizingReachEstimate` (
  `estimate` BIGINT DEFAULT NULL,
  `lower_bound` BIGINT DEFAULT NULL,
  `upper_bound` BIGINT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingTemplateCreate` generated from model 'TargetingTemplateCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateCreate` (
  `auto_targeting_enabled` TINYINT(1) DEFAULT true COMMENT 'Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting).',
  `keywords` JSON DEFAULT NULL,
  `name` TEXT NOT NULL COMMENT 'targeting template name',
  `placement_group` TEXT DEFAULT NULL,
  `targeting_attributes` TEXT NOT NULL COMMENT 'targeting profile attributes',
  `tracking_urls` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `TargetingTemplateKeyword` generated from model 'TargetingTemplateKeyword'
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateKeyword` (
  `match_type` TEXT DEFAULT NULL,
  `value` TEXT DEFAULT NULL COMMENT 'The keyword targeting (120 chars max).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `targeting_template_list_200_response` generated from model 'targetingUnderscoretemplateUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `targeting_template_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingTemplateUpdateRequestReadOrUpdate` generated from model 'TargetingTemplateUpdateRequestReadOrUpdate'
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateUpdateRequestReadOrUpdate` (
  `id` TEXT NOT NULL COMMENT 'Targeting template ID',
  `operation_type` TEXT NOT NULL,
  `targeting_attributes` TEXT DEFAULT NULL COMMENT 'targeting profile attributes'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TemplateBasedReport` generated from model 'TemplateBasedReport'
--

CREATE TABLE IF NOT EXISTS `TemplateBasedReport` (
  `message` TEXT DEFAULT NULL,
  `report_status` TEXT NOT NULL,
  `template_id` VARCHAR(18) NOT NULL COMMENT 'Unique identifier of a template.',
  `token` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TemplateBasedReportCreate` generated from model 'TemplateBasedReportCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `TemplateBasedReportCreate` (
  `message` TEXT DEFAULT NULL,
  `report_status` TEXT NOT NULL,
  `token` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `templates_list_200_response` generated from model 'templatesUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `templates_list_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TermsOfService` generated from model 'TermsOfService'
-- The ID of the ad account.
--

CREATE TABLE IF NOT EXISTS `TermsOfService` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'The ID of the ad account.',
  `has_accepted` TINYINT(1) DEFAULT NULL COMMENT 'Whether the ad account has accepted terms of service.',
  `html` TEXT DEFAULT NULL COMMENT 'The terms of service content',
  `id` TEXT DEFAULT NULL COMMENT 'The ID of the terms of service'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The ID of the ad account.';

--
-- Table structure for table `TimeSeries` generated from model 'TimeSeries'
--

CREATE TABLE IF NOT EXISTS `TimeSeries` (
  `date` DATE DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TitleKeywordsFilter` generated from model 'TitleKeywordsFilter'
--

CREATE TABLE IF NOT EXISTS `TitleKeywordsFilter` (
  `TITLE_KEYWORDS` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TopPinsAnalyticsResponse` generated from model 'TopPinsAnalyticsResponse'
--

CREATE TABLE IF NOT EXISTS `TopPinsAnalyticsResponse` (
  `date_availability` TEXT DEFAULT NULL,
  `pins` JSON DEFAULT NULL,
  `sort_by` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TopPinsAnalyticsResponseDateAvailability` generated from model 'TopPinsAnalyticsResponseDateAvailability'
--

CREATE TABLE IF NOT EXISTS `TopPinsAnalyticsResponseDateAvailability` (
  `is_realtime` TINYINT(1) DEFAULT NULL,
  `latest_available_timestamp` DECIMAL(20, 9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TopPinsAnalyticsResponsePinsItems` generated from model 'TopPinsAnalyticsResponsePinsItems'
-- Array with metrics, status, and pin id for the requested metric
--

CREATE TABLE IF NOT EXISTS `TopPinsAnalyticsResponsePinsItems` (
  `data_status` JSON DEFAULT NULL,
  `metrics` JSON DEFAULT NULL,
  `pin_id` TEXT DEFAULT NULL COMMENT 'The pin id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Array with metrics, status, and pin id for the requested metric';

--
-- Table structure for table `TopVideoPinsAnalyticsResponse` generated from model 'TopVideoPinsAnalyticsResponse'
--

CREATE TABLE IF NOT EXISTS `TopVideoPinsAnalyticsResponse` (
  `date_availability` TEXT DEFAULT NULL,
  `pins` JSON DEFAULT NULL,
  `sort_by` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TopVideoPinsAnalyticsResponseDateAvailability` generated from model 'TopVideoPinsAnalyticsResponseDateAvailability'
--

CREATE TABLE IF NOT EXISTS `TopVideoPinsAnalyticsResponseDateAvailability` (
  `is_realtime` TINYINT(1) DEFAULT NULL,
  `latest_available_timestamp` DECIMAL(20, 9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TopVideoPinsAnalyticsResponsePinsItems` generated from model 'TopVideoPinsAnalyticsResponsePinsItems'
-- Array with metrics, status, and pin id for the requested metric
--

CREATE TABLE IF NOT EXISTS `TopVideoPinsAnalyticsResponsePinsItems` (
  `data_status` JSON DEFAULT NULL,
  `metrics` JSON DEFAULT NULL,
  `pin_id` TEXT DEFAULT NULL COMMENT 'The pin id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Array with metrics, status, and pin id for the requested metric';

--
-- Table structure for table `TotalCountByEntityStatus` generated from model 'TotalCountByEntityStatus'
-- Breakdown of asset counts by entity status.
--

CREATE TABLE IF NOT EXISTS `TotalCountByEntityStatus` (
  `ACTIVE` INT DEFAULT NULL COMMENT 'Count of ACTIVE assets',
  `ARCHIVED` INT DEFAULT NULL COMMENT 'Count of ARCHIVED assets',
  `PAUSED` INT DEFAULT NULL COMMENT 'Count of PAUSED assets'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Breakdown of asset counts by entity status.';

--
-- Table structure for table `TrackingUrls` generated from model 'TrackingUrls'
--   Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).
--

CREATE TABLE IF NOT EXISTS `TrackingUrls` (
  `audience_verification` JSON DEFAULT NULL,
  `buyable_button` JSON DEFAULT NULL,
  `click` JSON DEFAULT NULL,
  `engagement` JSON DEFAULT NULL,
  `impression` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='  Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).';

--
-- Table structure for table `TrendingKeyword` generated from model 'TrendingKeyword'
--

CREATE TABLE IF NOT EXISTS `TrendingKeyword` (
  `demographics` TEXT DEFAULT NULL,
  `has_prediction` TINYINT(1) DEFAULT NULL COMMENT 'Indicates whether the keyword has a prediction available for the next 90 days. This field is only applicable when &#x60;include_prediction&#x60; query parameter is set to &#x60;true&#x60;. By default, the value is &#x60;false&#x60; and no prediction data is included in the response.',
  `keyword` TEXT DEFAULT NULL COMMENT 'The keyword that is trending.',
  `pct_growth_mom` INT DEFAULT NULL COMMENT 'The month-over-month percent change in search volume for this keyword. For example, a value of \&quot;400\&quot; would represent a 400% increase in searches in the last 30 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced &gt; 10000% month-over-month growth.',
  `pct_growth_wow` INT DEFAULT NULL COMMENT 'The week-over-week percent change in search volume for this keyword. For example, a value of \&quot;50\&quot; would represent a 50% increase in searches in the last seven days compared to the week prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced &gt; 10000% week-over-week growth.',
  `pct_growth_yoy` INT DEFAULT NULL COMMENT 'The year-over-year percent change in search volume for this keyword. For example, a value of \&quot;-5\&quot; would represent a 5% decrease in searches in the last 365 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced &gt; 10000% year-over-year growth.',
  `predicted_time_series` TEXT DEFAULT NULL COMMENT 'A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months. These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword. Similar to the historical &#x60;time_series&#x60;, normalization is applied independently to the predicted time series of each keyword, but the &#x60;normalize_against_group&#x60; query parameter can be used in cases where you wish to compare relative predicted volume between keywords.  **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of &#x60;2024-01-07&#x60; would include predicted searches for the week ending on &#x60;2024-01-07&#x60;.',
  `time_series` TEXT DEFAULT NULL COMMENT 'A sequence of weekly observations of the relative search volume for this keyword over the past year. These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the &#x60;normalize_against_group&#x60; query parameter can be used in cases where you wish to compare relative volume between keywords.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of &#x60;2023-10-31&#x60; would include searches that happened between &#x60;2023-10-25&#x60; and &#x60;2023-10-31&#x60;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TrendingKeywordDemographics` generated from model 'TrendingKeywordDemographics'
-- A mapping of demographic dimensions (e.g. \&quot;gender\&quot;, \&quot;age\&quot;) to their category distributions. For each dimension: Key: The category (e.g., \&quot;female\&quot;, \&quot;18-24\&quot;). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when &#x60;include_demographics&#x60; query parameter is set to &#x60;true&#x60;.
--

CREATE TABLE IF NOT EXISTS `TrendingKeywordDemographics` (
  `age_distribution` TEXT DEFAULT NULL,
  `gender_distribution` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A mapping of demographic dimensions (e.g. \&quot;gender\&quot;, \&quot;age\&quot;) to their category distributions. For each dimension: Key: The category (e.g., \&quot;female\&quot;, \&quot;18-24\&quot;). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when &#x60;include_demographics&#x60; query parameter is set to &#x60;true&#x60;.';

--
-- Table structure for table `TrendingKeywordsResponse` generated from model 'TrendingKeywordsResponse'
--

CREATE TABLE IF NOT EXISTS `TrendingKeywordsResponse` (
  `trends` JSON DEFAULT NULL COMMENT 'The top trending keywords for the specified trend type in the requested region. Results are ordered, with the first element in the array representing the #1 top trend.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TrendingPin` generated from model 'TrendingPin'
-- Pin image data for trending topics
--

CREATE TABLE IF NOT EXISTS `TrendingPin` (
  `color` TEXT NOT NULL COMMENT 'Dominant color of the pin image in hex format',
  `height` INT NOT NULL COMMENT 'Height of the pin image in pixels',
  `id` TEXT NOT NULL COMMENT 'Unique identifier for the pin',
  `src` TEXT NOT NULL COMMENT 'URL of the pin image',
  `vertical_offset` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom.',
  `width` INT NOT NULL COMMENT 'Width of the pin image in pixels'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin image data for trending topics';

--
-- Table structure for table `TrendingProductCategory` generated from model 'TrendingProductCategory'
-- Trending shopping product category
--

CREATE TABLE IF NOT EXISTS `TrendingProductCategory` (
  `engagement_type` TEXT NOT NULL COMMENT 'Engagement type',
  `pct_change_mom` INT NOT NULL COMMENT 'Month-over-month change percentage',
  `percent_relative_volume` INT NOT NULL COMMENT 'Relative volume percentage',
  `pinterest_product_category_id` INT NOT NULL COMMENT 'Pinterest Product Category Id',
  `product_category` TEXT NOT NULL COMMENT 'Product Category Name',
  `verticals` JSON DEFAULT NULL COMMENT 'Vertical name associated with the product category'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Trending shopping product category';

--
-- Table structure for table `TrendingTopic` generated from model 'TrendingTopic'
-- Individual trending topic within an interest category
--

CREATE TABLE IF NOT EXISTS `TrendingTopic` (
  `description` TEXT NOT NULL COMMENT 'Description of the trending topic',
  `id` TEXT NOT NULL COMMENT 'Unique identifier for the trending topic',
  `percent_growth_mom` INT DEFAULT NULL COMMENT 'Month-over-month growth percentage',
  `pins` JSON NOT NULL COMMENT 'Array of pin images related to this trend (up to 6)',
  `related_interests` JSON NOT NULL COMMENT 'List of related interest categories',
  `related_searches` JSON NOT NULL COMMENT 'List of related search terms',
  `time_series` JSON NOT NULL COMMENT 'Time series data showing trend values over time, with dates as keys and values as numeric',
  `title` TEXT NOT NULL COMMENT 'Title of the trending topic'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Individual trending topic within an interest category';

--
-- Table structure for table `TrendsAgeDistribution` generated from model 'TrendsAgeDistribution'
-- This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
--

CREATE TABLE IF NOT EXISTS `TrendsAgeDistribution` (
  `age_distribution` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.';

--
-- Table structure for table `TrendsEditorial` generated from model 'TrendsEditorial'
-- Information of the published editorial article.
--

CREATE TABLE IF NOT EXISTS `TrendsEditorial` (
  `board_url` TEXT NOT NULL COMMENT 'URL of the editorial board',
  `description` TEXT NOT NULL COMMENT 'Description of the editorial article',
  `interests` JSON NOT NULL COMMENT 'List of interests related to the editorial article',
  `pins_url` JSON NOT NULL COMMENT 'URL of the pins related to the editorial article',
  `related_keywords` JSON NOT NULL COMMENT 'List of keywords related to the editorial article',
  `title` TEXT NOT NULL COMMENT 'Title of the editorial article'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Information of the published editorial article.';

--
-- Table structure for table `TrendsGenderDistribution` generated from model 'TrendsGenderDistribution'
-- This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
--

CREATE TABLE IF NOT EXISTS `TrendsGenderDistribution` (
  `gender_distribution` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.';

--
-- Table structure for table `UpdatableItemAttributes` generated from model 'UpdatableItemAttributes'
--

CREATE TABLE IF NOT EXISTS `UpdatableItemAttributes` (
  `ad_image_0_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_0_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_10_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_10_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_11_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_11_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_12_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_12_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_13_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_13_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_14_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_14_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_15_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_15_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_16_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_16_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_17_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_17_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_18_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_18_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_19_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_19_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_1_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_1_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_2_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_2_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_3_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_3_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_4_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_4_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_5_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_5_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_6_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_6_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_7_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_7_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_8_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_8_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_image_9_link` TEXT DEFAULT NULL COMMENT 'Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_image_9_tag` TEXT DEFAULT NULL COMMENT 'Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.',
  `ad_link` TEXT DEFAULT NULL COMMENT 'Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking. Must begin with http:// or https://.',
  `ad_video_0_link` TEXT DEFAULT NULL COMMENT 'Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_video_0_tag` TEXT DEFAULT NULL COMMENT 'Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.',
  `ad_video_1_link` TEXT DEFAULT NULL COMMENT 'Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_video_1_tag` TEXT DEFAULT NULL COMMENT 'Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.',
  `ad_video_2_link` TEXT DEFAULT NULL COMMENT 'Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://',
  `ad_video_2_tag` TEXT DEFAULT NULL COMMENT 'Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.',
  `adult` TINYINT(1) DEFAULT NULL COMMENT 'Set this attribute to TRUE if you&#39;re submitting items that are considered \&quot;adult\&quot;. These will not be shown on Pinterest.',
  `age_group` TEXT DEFAULT NULL COMMENT 'The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): &#39;newborn&#39;, &#39;infant&#39;, &#39;toddler&#39;, &#39;kids&#39;, or &#39;adult&#39;.',
  `android_deep_link` TEXT DEFAULT NULL COMMENT 'The deep link to the product on the Android app.',
  `availability` TEXT DEFAULT NULL COMMENT 'The availability of the product. Must be one of the following values (upper or lowercased): &#39;in stock&#39;, &#39;out of stock&#39;, &#39;preorder&#39;.',
  `average_review_rating` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Average reviews for the item. Can be a number from 1-5.',
  `brand` TEXT DEFAULT NULL COMMENT 'The brand of the product.',
  `checkout_enabled` TINYINT(1) DEFAULT NULL COMMENT 'This attribute is not supported anymore.',
  `color` TEXT DEFAULT NULL COMMENT 'The primary color of the product.',
  `condition` TEXT DEFAULT NULL COMMENT 'The condition of the product. Must be one of the following values (upper or lowercased): &#39;new&#39;, &#39;used&#39;, or &#39;refurbished&#39;.',
  `custom_label_0` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.',
  `custom_label_1` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.',
  `custom_label_2` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.',
  `custom_label_3` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.',
  `custom_label_4` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.',
  `custom_number_0` INT DEFAULT NULL COMMENT 'An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.',
  `custom_number_1` INT DEFAULT NULL COMMENT 'An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.',
  `custom_number_2` INT DEFAULT NULL COMMENT 'An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.',
  `custom_number_3` INT DEFAULT NULL COMMENT 'An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.',
  `custom_number_4` INT DEFAULT NULL COMMENT 'An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.',
  `description` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 10000 characters. The description of the product.',
  `free_shipping_label` TINYINT(1) DEFAULT NULL COMMENT 'The item is free to ship.',
  `free_shipping_limit` TEXT DEFAULT NULL COMMENT 'The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.',
  `gender` TEXT DEFAULT NULL COMMENT 'The gender associated with the product. Must be one of the following values (upper or lowercased): &#39;male&#39;, &#39;female&#39;, or &#39;unisex&#39;.',
  `google_product_category` TEXT DEFAULT NULL COMMENT 'The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.',
  `gtin` TEXT DEFAULT NULL,
  `id` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 127 characters. The user-created unique ID that represents the product. Only Unicode characters are accepted.',
  `installment_price` TEXT DEFAULT NULL COMMENT 'Installment price of the product. Expected format: &lt;payment_count&gt;:&lt;payment_amount&gt; &lt;currency&gt;',
  `ios_deep_link` TEXT DEFAULT NULL COMMENT 'The deep link to the product on the iOS app.',
  `item_group_id` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 127 characters. The parent ID of the product.',
  `last_updated_time` BIGINT DEFAULT NULL COMMENT 'The millisecond timestamp when the item was lastly modified by the merchant.',
  `link` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 511 characters. The landing page for the product.',
  `material` TEXT DEFAULT NULL COMMENT 'The material used to make the product.',
  `min_ad_price` TEXT DEFAULT NULL COMMENT 'The minimum advertised price of the product. It supports the following formats: \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.',
  `mobile_link` TEXT DEFAULT NULL COMMENT 'The mobile-optimized version of your landing page. Must begin with http:// or https://.',
  `mpn` TEXT DEFAULT NULL COMMENT 'Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.',
  `number_of_ratings` INT DEFAULT NULL COMMENT 'The number of ratings for the item.',
  `number_of_reviews` INT DEFAULT NULL COMMENT 'The number of reviews available for the item.',
  `pattern` TEXT DEFAULT NULL COMMENT 'The description of the pattern used for the product.',
  `price` TEXT DEFAULT NULL COMMENT 'The price of the product. It supports the following formats: \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.',
  `product_type` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 1000 characters. The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by \&quot; &gt; \&quot;.',
  `promotion_id` TEXT DEFAULT NULL COMMENT 'A unique identifier referencing the promotion associated with this catalog item.',
  `sale_price` TEXT DEFAULT NULL COMMENT 'The discounted price of the product. The sale_price must be lower than the price. It supports the following formats: \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;.',
  `sale_price_effective_date` TEXT DEFAULT NULL COMMENT 'Sale price effective date. Expected format: &lt;start_date&gt;/&lt;end_date&gt; (ISO 8601 format)',
  `shipping` TEXT DEFAULT NULL COMMENT 'Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.',
  `shipping_height` TEXT DEFAULT NULL COMMENT 'The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.',
  `shipping_weight` TEXT DEFAULT NULL COMMENT 'The weight of the product. Ensure there is a space between the numeric string and the metric.',
  `shipping_width` TEXT DEFAULT NULL COMMENT 'The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.',
  `size` TEXT DEFAULT NULL COMMENT 'The size of the product.',
  `size_system` TEXT DEFAULT NULL COMMENT 'Indicates the country&#39;s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): &#39;US&#39;, &#39;UK&#39;, &#39;EU&#39;, &#39;DE&#39;, &#39;FR&#39;, &#39;JP&#39;, &#39;CN&#39;, &#39;IT&#39;, &#39;BR&#39;, &#39;MEX&#39;, or &#39;AU&#39;.',
  `size_type` TEXT DEFAULT NULL COMMENT 'Additional description for the size. Must be one of the following values (upper or lowercased): &#39;regular&#39;, &#39;petite&#39;, &#39;plus&#39;, &#39;big_and_tall&#39;, or &#39;maternity&#39;.',
  `tax` TEXT DEFAULT NULL COMMENT 'Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.',
  `title` TEXT DEFAULT NULL COMMENT '&lt;&#x3D; 500 characters. The name of the product.',
  `unit_pricing_base_measure` TEXT DEFAULT NULL COMMENT 'Unit pricing base measure of the product. Expected format: &lt;base_measure&gt; &lt;unit_type&gt;',
  `unit_pricing_measure` TEXT DEFAULT NULL COMMENT 'Unit pricing total measure of the product. Expected format: &lt;total_units&gt; &lt;unit_type&gt;',
  `variant_names` JSON DEFAULT NULL COMMENT 'Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.',
  `variant_values` JSON DEFAULT NULL COMMENT 'Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdateBusinessMembershipsResponse` generated from model 'UpdateBusinessMembershipsResponse'
--

CREATE TABLE IF NOT EXISTS `UpdateBusinessMembershipsResponse` (
  `items` JSON DEFAULT NULL COMMENT 'List of members with updated business access role.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdateInvitesResultsResponseArray` generated from model 'UpdateInvitesResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `UpdateInvitesResultsResponseArray` (
  `items` JSON DEFAULT NULL COMMENT 'List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdateMemberAssetAccessBody` generated from model 'UpdateMemberAssetAccessBody'
-- An object with a list of all the new member asset accesses.
--

CREATE TABLE IF NOT EXISTS `UpdateMemberAssetAccessBody` (
  `accesses` JSON NOT NULL COMMENT 'List of member asset accesses to assign or update.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An object with a list of all the new member asset accesses.';

--
-- Table structure for table `UpdateMemberAssetAccessItem` generated from model 'UpdateMemberAssetAccessItem'
--

CREATE TABLE IF NOT EXISTS `UpdateMemberAssetAccessItem` (
  `asset_id` VARCHAR(25) NOT NULL COMMENT 'Id of the asset to update.',
  `member_id` VARCHAR(25) NOT NULL COMMENT 'Unique identifier of the member on which to perform the update',
  `permissions` JSON NOT NULL COMMENT 'A non-empty array of permissions to assign to the member.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdateMemberAssetResultItem` generated from model 'UpdateMemberAssetResultItem'
--

CREATE TABLE IF NOT EXISTS `UpdateMemberAssetResultItem` (
  `response` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdateMemberAssetsResultsResponseArray` generated from model 'UpdateMemberAssetsResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `UpdateMemberAssetsResultsResponseArray` (
  `items` JSON DEFAULT NULL COMMENT 'List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdatePartnerAssetAccessBody` generated from model 'UpdatePartnerAssetAccessBody'
-- An object with a list of partner asset accesses to assign or update.
--

CREATE TABLE IF NOT EXISTS `UpdatePartnerAssetAccessBody` (
  `accesses` JSON NOT NULL COMMENT 'List of partner asset accesses to assign or update.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An object with a list of partner asset accesses to assign or update.';

--
-- Table structure for table `UpdatePartnerAssetAccessItem` generated from model 'UpdatePartnerAssetAccessItem'
--

CREATE TABLE IF NOT EXISTS `UpdatePartnerAssetAccessItem` (
  `asset_id` VARCHAR(25) NOT NULL COMMENT 'Unique identifier of the business asset.',
  `partner_id` VARCHAR(25) NOT NULL COMMENT 'Unique identifier of a business partner to update asset access to.',
  `permissions` JSON NOT NULL COMMENT 'A non-empty array of permissions to assign to the partner.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdatePartnerAssetsResult` generated from model 'UpdatePartnerAssetsResult'
-- An object containing the permissions a business partner has on the asset.
--

CREATE TABLE IF NOT EXISTS `UpdatePartnerAssetsResult` (
  `asset_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a business asset.',
  `asset_type` TEXT DEFAULT NULL,
  `partner_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a business partner.',
  `permissions` JSON DEFAULT NULL COMMENT 'Permission levels member or partner has on an asset.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An object containing the permissions a business partner has on the asset.';

--
-- Table structure for table `UpdatePartnerAssetsResultsResponseArray` generated from model 'UpdatePartnerAssetsResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `UpdatePartnerAssetsResultsResponseArray` (
  `items` JSON DEFAULT NULL COMMENT 'List of assigned/updated partner asset access.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `user_account_followed_interests_200_response` generated from model 'userUnderscoreaccountUnderscorefollowedUnderscoreinterestsUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `user_account_followed_interests_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UserBusinessRoleBinding` generated from model 'UserBusinessRoleBinding'
--

CREATE TABLE IF NOT EXISTS `UserBusinessRoleBinding` (
  `assets_summary` TEXT DEFAULT NULL COMMENT 'Ad accounts and profiles the business member/partner has access to.',
  `business_roles` JSON DEFAULT NULL COMMENT 'The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.',
  `created_by_business` TEXT DEFAULT NULL COMMENT 'Metadata for the business that created the business relationship.',
  `created_by_user` TEXT DEFAULT NULL COMMENT 'Metadata for the user that created the business relationship.',
  `created_time` INT DEFAULT NULL COMMENT 'The time the business relationship was created. Returned in milliseconds.',
  `id` TEXT DEFAULT NULL COMMENT 'Unique identifier of the business member/business partner/employer.',
  `is_shared_partner` TINYINT(1) DEFAULT NULL COMMENT 'This field is only relevant when business_role&#x3D;\&quot;PARTNER\&quot;. If is_shared_partner&#x3D;FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. If is_shared_partner&#x3D;TRUE, you can access the partner&#39;s business asset. If assets_summary is not empty, the assets listed are the partner&#39;s business assets you have access to.',
  `user` TEXT DEFAULT NULL COMMENT 'Metadata for the business member/business partner/employer.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UserSingleAssetBinding` generated from model 'UserSingleAssetBinding'
-- An object containing the permissions a business member/partner has on the asset.
--

CREATE TABLE IF NOT EXISTS `UserSingleAssetBinding` (
  `permissions` JSON DEFAULT NULL COMMENT 'Permission levels member or partner has on an asset.',
  `user` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An object containing the permissions a business member/partner has on the asset.';

--
-- Table structure for table `UserWebsite` generated from model 'UserWebsite'
--

CREATE TABLE IF NOT EXISTS `UserWebsite` (
  `status` TEXT DEFAULT NULL COMMENT 'Status of the verification process',
  `verified_at` TEXT DEFAULT NULL COMMENT 'UTC timestamp when the verification happened - sometimes missing',
  `website` TEXT DEFAULT NULL COMMENT 'Website with path or domain only'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UserWebsiteCreate` generated from model 'UserWebsiteCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `UserWebsiteCreate` (
  `verification_method` TEXT COMMENT 'Method used to verify website ownership.',
  `website` TEXT DEFAULT NULL COMMENT 'Website with path or domain only'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Resource create operation model.';

--
-- Table structure for table `UserWebsiteVerification` generated from model 'UserWebsiteVerification'
--

CREATE TABLE IF NOT EXISTS `UserWebsiteVerification` (
  `dns_txt_record` TEXT DEFAULT NULL COMMENT 'DNS TXT record to check against for the website to be claimed',
  `file_content` TEXT DEFAULT NULL COMMENT 'A full html file to upload to the website in order for it to be claimed',
  `filename` TEXT DEFAULT NULL COMMENT 'File expected to find on the website being claimed',
  `metatag` TEXT DEFAULT NULL COMMENT 'Metatag the verification process searchs for the website to be claimed',
  `verification_code` TEXT DEFAULT NULL COMMENT 'Code to check against the user claiming the website'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `user_websites_get_200_response` generated from model 'userUnderscorewebsitesUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `user_websites_get_200_response` (
  `bookmark` TEXT DEFAULT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UsersForIndividualAssetResponse` generated from model 'UsersForIndividualAssetResponse'
-- An object containing the permissions a business member has on the asset.
--

CREATE TABLE IF NOT EXISTS `UsersForIndividualAssetResponse` (
  `asset_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a business asset.',
  `member_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of the business member with asset access.',
  `permissions` JSON DEFAULT NULL COMMENT 'Permission levels member or partner has on an asset.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An object containing the permissions a business member has on the asset.';

--
-- Table structure for table `VideoMetadataWithItemType` generated from model 'VideoMetadataWithItemType'
--

CREATE TABLE IF NOT EXISTS `VideoMetadataWithItemType` (
  `cover_image_url` TEXT DEFAULT NULL,
  `duration` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Duration (in miliseconds). Field maybe null after creation due to video processing time.',
  `height` INT DEFAULT NULL COMMENT 'Height (in pixels). Field maybe null after creation due to video processing time.',
  `item_type` ENUM('video') NOT NULL COMMENT 'Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload.',
  `video_url` TEXT DEFAULT NULL COMMENT 'Video url (720p).  **Note:** This field is limited and not available to all apps.',
  `video_url_hls` TEXT DEFAULT NULL COMMENT 'Video url (HLS).  **Note:** This field is limited and not available to all apps.',
  `width` INT DEFAULT NULL COMMENT 'Width (in pixels). Field maybe null after creation due to video processing time.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


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
