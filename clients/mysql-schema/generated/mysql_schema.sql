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
  `id` TEXT DEFAULT NULL COMMENT 'User account ID.',
  `profile_image` TEXT DEFAULT NULL,
  `website_url` TEXT DEFAULT NULL,
  `username` TEXT DEFAULT NULL,
  `about` TEXT DEFAULT NULL COMMENT 'Profile about description.',
  `business_name` TEXT DEFAULT NULL,
  `board_count` INT DEFAULT NULL COMMENT 'User account board count.&lt;br/&gt;**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.',
  `pin_count` INT DEFAULT NULL COMMENT 'User account pin count. This includes both created and saved pins.',
  `follower_count` INT DEFAULT NULL COMMENT 'User account follower count.',
  `following_count` INT DEFAULT NULL COMMENT 'User account following count.',
  `monthly_views` INT DEFAULT NULL COMMENT 'User account monthly views.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdAccount` generated from model 'AdAccount'
--

CREATE TABLE IF NOT EXISTS `AdAccount` (
  `id` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL,
  `owner` TEXT DEFAULT NULL,
  `country` TEXT DEFAULT NULL,
  `currency` TEXT DEFAULT NULL,
  `permissions` JSON DEFAULT NULL,
  `created_time` INT DEFAULT NULL COMMENT 'Creation time. Unix timestamp in seconds.',
  `updated_time` INT DEFAULT NULL COMMENT 'Last update time. Unix timestamp in seconds.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdAccountAnalyticsResponse_inner` generated from model 'AdAccountAnalyticsResponseUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `AdAccountAnalyticsResponse_inner` (
  `AD_ACCOUNT_ID` TEXT NOT NULL COMMENT 'The ID of the advertiser that this metrics belongs to.',
  `DATE` DATE DEFAULT NULL COMMENT 'Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdAccountCreateRequest` generated from model 'AdAccountCreateRequest'
--

CREATE TABLE IF NOT EXISTS `AdAccountCreateRequest` (
  `country` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'Ad Account name.',
  `owner_user_id` TEXT DEFAULT NULL COMMENT 'Advertiser&#39;s owning user ID.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdAccountCreateSubscriptionRequest` generated from model 'AdAccountCreateSubscriptionRequest'
--

CREATE TABLE IF NOT EXISTS `AdAccountCreateSubscriptionRequest` (
  `webhook_url` TEXT NOT NULL COMMENT 'Standard HTTPS webhook URL.',
  `lead_form_id` TEXT DEFAULT NULL COMMENT 'Lead form ID.',
  `partner_access_token` TEXT DEFAULT NULL COMMENT 'Partner access token. Only for clients that requires authentication. We recommend to avoid this param.',
  `partner_refresh_token` TEXT DEFAULT NULL COMMENT 'Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.',
  `partner_metadata` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdAccountCreateSubscriptionRequest_partner_metadata` generated from model 'AdAccountCreateSubscriptionRequestUnderscorepartnerUnderscoremetadata'
-- Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
--

CREATE TABLE IF NOT EXISTS `AdAccountCreateSubscriptionRequest_partner_metadata` (
  `subscriber_key` TEXT DEFAULT NULL COMMENT 'Text field value that uniquely identifies a subscriber.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.';

--
-- Table structure for table `AdAccountCreateSubscriptionResponse` generated from model 'AdAccountCreateSubscriptionResponse'
--

CREATE TABLE IF NOT EXISTS `AdAccountCreateSubscriptionResponse` (
  `id` TEXT DEFAULT NULL COMMENT 'Subscription ID.',
  `cryptographic_key` TEXT DEFAULT NULL COMMENT 'Base64 encoded key for client to decrypt lead data.',
  `cryptographic_algorithm` TEXT DEFAULT NULL COMMENT 'Lead data encryption algorithm.',
  `created_time` INT DEFAULT NULL COMMENT 'Subscription creation time. Unix timestamp in milliseconds.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdAccountGetSubscriptionResponse` generated from model 'AdAccountGetSubscriptionResponse'
--

CREATE TABLE IF NOT EXISTS `AdAccountGetSubscriptionResponse` (
  `lead_form_id` TEXT DEFAULT NULL COMMENT 'Lead form ID.',
  `webhook_url` TEXT DEFAULT NULL COMMENT 'Standard HTTPS webhook URL.',
  `id` TEXT DEFAULT NULL COMMENT 'Subscription ID.',
  `user_account_id` TEXT DEFAULT NULL COMMENT 'User account used to subscribe lead data.',
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'The Ad Account ID that this lead form belongs to.',
  `api_version` TEXT DEFAULT NULL COMMENT 'API version.',
  `cryptographic_key` TEXT DEFAULT NULL COMMENT 'Base64 encoded key for client to decrypt lead data.',
  `cryptographic_algorithm` TEXT DEFAULT NULL COMMENT 'Lead data encryption algorithm.',
  `created_time` INT DEFAULT NULL COMMENT 'Lead form creation time. Unix timestamp in milliseconds.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Ad_account_owner` generated from model 'AdUnderscoreaccountUnderscoreowner'
--

CREATE TABLE IF NOT EXISTS `Ad_account_owner` (
  `username` TEXT DEFAULT NULL COMMENT 'Public username for the user account',
  `id` TEXT DEFAULT NULL COMMENT 'The owning account&#39;s user ID.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ad_accounts_audiences_shared_accounts_list_200_response` generated from model 'adUnderscoreaccountsUnderscoreaudiencesUnderscoresharedUnderscoreaccountsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `ad_accounts_audiences_shared_accounts_list_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdAccountsCountryResponse` generated from model 'AdAccountsCountryResponse'
--

CREATE TABLE IF NOT EXISTS `AdAccountsCountryResponse` (
  `items` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdAccountsCountryResponseData` generated from model 'AdAccountsCountryResponseData'
--

CREATE TABLE IF NOT EXISTS `AdAccountsCountryResponseData` (
  `code` TEXT DEFAULT NULL,
  `currency` TEXT DEFAULT NULL COMMENT 'Country currency.',
  `index` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Country index',
  `name` TEXT DEFAULT NULL COMMENT 'Country name'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ad_accounts_list_200_response` generated from model 'adUnderscoreaccountsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `ad_accounts_list_200_response` (
  `items` JSON NOT NULL COMMENT 'Ad accounts',
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ad_accounts_subscriptions_get_list_200_response` generated from model 'adUnderscoreaccountsUnderscoresubscriptionsUnderscoregetUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `ad_accounts_subscriptions_get_list_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdArrayResponse` generated from model 'AdArrayResponse'
--

CREATE TABLE IF NOT EXISTS `AdArrayResponse` (
  `items` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdArrayResponseElement` generated from model 'AdArrayResponseElement'
--

CREATE TABLE IF NOT EXISTS `AdArrayResponseElement` (
  `data` TEXT DEFAULT NULL,
  `exceptions` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdCommon` generated from model 'AdCommon'
-- Creation fields
--

CREATE TABLE IF NOT EXISTS `AdCommon` (
  `ad_group_id` TEXT DEFAULT NULL COMMENT 'ID of the ad group that contains the ad.',
  `android_deep_link` TEXT DEFAULT NULL COMMENT 'Deep link URL for Android devices.',
  `carousel_android_deep_links` JSON DEFAULT NULL COMMENT 'Comma-separated deep links for the carousel pin on Android.',
  `carousel_destination_urls` JSON DEFAULT NULL COMMENT 'Comma-separated destination URLs for the carousel pin to promote.',
  `carousel_ios_deep_links` JSON DEFAULT NULL COMMENT 'Comma-separated deep links for the carousel pin on iOS.',
  `click_tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking url for the ad clicks.',
  `creative_type` TEXT DEFAULT NULL,
  `destination_url` TEXT DEFAULT NULL COMMENT 'Destination URL.',
  `ios_deep_link` TEXT DEFAULT NULL COMMENT 'Deep link URL for iOS devices.',
  `is_pin_deleted` TINYINT(1) DEFAULT NULL COMMENT 'Is original pin deleted?',
  `is_removable` TINYINT(1) DEFAULT NULL COMMENT 'Is pin repinnable?',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the ad - 255 chars max.',
  `status` TEXT DEFAULT NULL,
  `tracking_urls` TEXT DEFAULT NULL,
  `view_tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking URL for ad impressions.',
  `lead_form_id` TEXT DEFAULT NULL COMMENT 'Lead form ID for lead ad generation.',
  `grid_click_type` TEXT DEFAULT NULL,
  `customizable_cta_type` ENUM('GET_OFFER', 'LEARN_MORE', 'ORDER_NOW', 'SHOP_NOW', 'SIGN_UP', 'SUBSCRIBE', 'BUY_NOW', 'CONTACT_US', 'GET_QUOTE', 'VISIT_SITE', 'APPLY_NOW', 'BOOK_NOW', 'REQUEST_DEMO', 'REGISTER_NOW', 'FIND_A_DEALER', 'ADD_TO_CART', 'WATCH_NOW', 'READ_MORE', 'null') DEFAULT NULL COMMENT 'Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)',
  `quiz_pin_data` TEXT DEFAULT NULL COMMENT 'Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Creation fields';

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
  `destination_url` TEXT DEFAULT NULL COMMENT 'Destination URL.',
  `ios_deep_link` TEXT DEFAULT NULL COMMENT 'Deep link URL for iOS devices.',
  `is_pin_deleted` TINYINT(1) DEFAULT NULL COMMENT 'Is original pin deleted?',
  `is_removable` TINYINT(1) DEFAULT NULL COMMENT 'Is pin repinnable?',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the ad - 255 chars max.',
  `status` TEXT DEFAULT NULL,
  `tracking_urls` TEXT DEFAULT NULL,
  `view_tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking URL for ad impressions.',
  `lead_form_id` TEXT DEFAULT NULL COMMENT 'Lead form ID for lead ad generation.',
  `grid_click_type` TEXT DEFAULT NULL,
  `customizable_cta_type` ENUM('GET_OFFER', 'LEARN_MORE', 'ORDER_NOW', 'SHOP_NOW', 'SIGN_UP', 'SUBSCRIBE', 'BUY_NOW', 'CONTACT_US', 'GET_QUOTE', 'VISIT_SITE', 'APPLY_NOW', 'BOOK_NOW', 'REQUEST_DEMO', 'REGISTER_NOW', 'FIND_A_DEALER', 'ADD_TO_CART', 'WATCH_NOW', 'READ_MORE', 'null') DEFAULT NULL COMMENT 'Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)',
  `quiz_pin_data` TEXT DEFAULT NULL COMMENT 'Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.',
  `pin_id` TEXT NOT NULL COMMENT 'Pin ID.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupArrayResponse` generated from model 'AdGroupArrayResponse'
--

CREATE TABLE IF NOT EXISTS `AdGroupArrayResponse` (
  `items` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupArrayResponseElement` generated from model 'AdGroupArrayResponseElement'
--

CREATE TABLE IF NOT EXISTS `AdGroupArrayResponseElement` (
  `data` TEXT DEFAULT NULL,
  `exceptions` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupAudienceSizingRequest` generated from model 'AdGroupAudienceSizingRequest'
--

CREATE TABLE IF NOT EXISTS `AdGroupAudienceSizingRequest` (
  `auto_targeting_enabled` TINYINT(1) DEFAULT true COMMENT 'Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.',
  `placement_group` TEXT COMMENT '&lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.',
  `creative_types` JSON DEFAULT NULL COMMENT 'Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.',
  `targeting_spec` TEXT DEFAULT NULL,
  `product_group_ids` JSON DEFAULT NULL COMMENT 'Targeted product group IDs. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This can only be combined with shopping/catalog sales campaigns. For more information, &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/shopping-ads#section-14571\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt;. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.',
  `keywords` JSON DEFAULT NULL COMMENT 'Array of keyword objects. If the keywords field is missing, all keywords will be targeted.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupAudienceSizingRequest_keywords_inner` generated from model 'AdGroupAudienceSizingRequestUnderscorekeywordsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `AdGroupAudienceSizingRequest_keywords_inner` (
  `match_type` TEXT NOT NULL,
  `value` TEXT NOT NULL COMMENT 'Keyword value (120 chars max).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupAudienceSizingResponse` generated from model 'AdGroupAudienceSizingResponse'
--

CREATE TABLE IF NOT EXISTS `AdGroupAudienceSizingResponse` (
  `audience_size_lower_bound` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The lower confidence bound of the estimated potential audience size. \&quot;Potential audience size\&quot; estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.',
  `audience_size_upper_bound` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The upper confidence bound of the estimated potential audience size. \&quot;Potential audience size\&quot; estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupCommon` generated from model 'AdGroupCommon'
--

CREATE TABLE IF NOT EXISTS `AdGroupCommon` (
  `name` TEXT DEFAULT NULL COMMENT 'Ad group name.',
  `status` TEXT DEFAULT NULL COMMENT 'Ad group/entity status.',
  `budget_in_micro_currency` INT DEFAULT NULL COMMENT 'Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.',
  `bid_in_micro_currency` INT DEFAULT NULL COMMENT 'Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.',
  `optimization_goal_metadata` TEXT DEFAULT NULL COMMENT 'Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.',
  `budget_type` TEXT DEFAULT NULL,
  `start_time` INT DEFAULT NULL COMMENT 'Ad group start time. Unix timestamp in seconds. Defaults to current time.',
  `end_time` INT DEFAULT NULL COMMENT 'Ad group end time. Unix timestamp in seconds.',
  `targeting_spec` TEXT DEFAULT NULL,
  `lifetime_frequency_cap` INT DEFAULT NULL COMMENT 'Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.',
  `tracking_urls` TEXT DEFAULT NULL COMMENT 'Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.',
  `auto_targeting_enabled` TINYINT(1) DEFAULT NULL COMMENT 'Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.',
  `placement_group` TEXT DEFAULT NULL COMMENT '&lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.',
  `pacing_delivery_type` TEXT DEFAULT NULL,
  `campaign_id` TEXT DEFAULT NULL COMMENT 'Campaign ID of the ad group.',
  `billable_event` TEXT DEFAULT NULL,
  `bid_strategy_type` ENUM('AUTOMATIC_BID', 'MAX_BID', 'TARGET_AVG', 'null') DEFAULT NULL COMMENT 'Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID.',
  `targeting_template_ids` JSON DEFAULT NULL COMMENT 'Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;].'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupCreateRequest` generated from model 'AdGroupCreateRequest'
--

CREATE TABLE IF NOT EXISTS `AdGroupCreateRequest` (
  `name` TEXT NOT NULL COMMENT 'Ad group name.',
  `status` TEXT DEFAULT NULL COMMENT 'Ad group/entity status.',
  `budget_in_micro_currency` INT DEFAULT NULL COMMENT 'Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.',
  `bid_in_micro_currency` INT DEFAULT NULL COMMENT 'Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.',
  `optimization_goal_metadata` TEXT DEFAULT NULL COMMENT 'Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.',
  `budget_type` TEXT,
  `start_time` INT DEFAULT NULL COMMENT 'Ad group start time. Unix timestamp in seconds. Defaults to current time.',
  `end_time` INT DEFAULT NULL COMMENT 'Ad group end time. Unix timestamp in seconds.',
  `targeting_spec` TEXT DEFAULT NULL,
  `lifetime_frequency_cap` INT DEFAULT NULL COMMENT 'Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.',
  `tracking_urls` TEXT DEFAULT NULL COMMENT 'Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.',
  `auto_targeting_enabled` TINYINT(1) DEFAULT NULL COMMENT 'Enable auto-targeting for ad group.Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.',
  `placement_group` TEXT DEFAULT NULL COMMENT '&lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.',
  `pacing_delivery_type` TEXT,
  `campaign_id` TEXT NOT NULL COMMENT 'Campaign ID of the ad group.',
  `billable_event` TEXT NOT NULL,
  `bid_strategy_type` ENUM('AUTOMATIC_BID', 'MAX_BID', 'TARGET_AVG', 'null') DEFAULT NULL COMMENT 'Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID.',
  `targeting_template_ids` JSON DEFAULT NULL COMMENT 'Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;].'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupResponse` generated from model 'AdGroupResponse'
--

CREATE TABLE IF NOT EXISTS `AdGroupResponse` (
  `name` TEXT DEFAULT NULL COMMENT 'Ad group name.',
  `status` TEXT DEFAULT NULL COMMENT 'Ad group/entity status.',
  `budget_in_micro_currency` INT DEFAULT NULL COMMENT 'Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.',
  `bid_in_micro_currency` INT DEFAULT NULL COMMENT 'Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.',
  `optimization_goal_metadata` TEXT DEFAULT NULL COMMENT 'Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.',
  `budget_type` TEXT DEFAULT NULL,
  `start_time` INT DEFAULT NULL COMMENT 'Ad group start time. Unix timestamp in seconds. Defaults to current time.',
  `end_time` INT DEFAULT NULL COMMENT 'Ad group end time. Unix timestamp in seconds.',
  `targeting_spec` TEXT DEFAULT NULL,
  `lifetime_frequency_cap` INT DEFAULT NULL COMMENT 'Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.',
  `tracking_urls` TEXT DEFAULT NULL COMMENT 'Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.',
  `auto_targeting_enabled` TINYINT(1) DEFAULT NULL COMMENT 'Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.',
  `placement_group` TEXT DEFAULT NULL COMMENT '&lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.',
  `pacing_delivery_type` TEXT DEFAULT NULL,
  `campaign_id` TEXT DEFAULT NULL COMMENT 'Campaign ID of the ad group.',
  `billable_event` TEXT DEFAULT NULL,
  `bid_strategy_type` ENUM('AUTOMATIC_BID', 'MAX_BID', 'TARGET_AVG', 'null') DEFAULT NULL COMMENT 'Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID.',
  `targeting_template_ids` JSON DEFAULT NULL COMMENT 'Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;].',
  `id` TEXT DEFAULT NULL COMMENT 'Ad group ID.',
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Advertiser ID.',
  `created_time` INT DEFAULT NULL COMMENT 'Ad group creation time. Unix timestamp in seconds.',
  `updated_time` INT DEFAULT NULL COMMENT 'Ad group last update time. Unix timestamp in seconds.',
  `type` TEXT COMMENT 'Always \&quot;adgroup\&quot;.',
  `conversion_learning_mode_type` ENUM('NOT_ACTIVE', 'ACTIVE', 'null') DEFAULT NULL COMMENT 'oCPM learn mode',
  `summary_status` TEXT DEFAULT NULL COMMENT 'Ad group summary status.',
  `feed_profile_id` TEXT DEFAULT NULL COMMENT 'Feed Profile ID associated to the adgroup.',
  `dca_assets` TEXT DEFAULT NULL COMMENT '[DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupUpdateRequest` generated from model 'AdGroupUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `AdGroupUpdateRequest` (
  `name` TEXT DEFAULT NULL COMMENT 'Ad group name.',
  `status` TEXT DEFAULT NULL COMMENT 'Ad group/entity status.',
  `budget_in_micro_currency` INT DEFAULT NULL COMMENT 'Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.',
  `bid_in_micro_currency` INT DEFAULT NULL COMMENT 'Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.',
  `optimization_goal_metadata` TEXT DEFAULT NULL COMMENT 'Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.',
  `budget_type` TEXT DEFAULT NULL,
  `start_time` INT DEFAULT NULL COMMENT 'Ad group start time. Unix timestamp in seconds. Defaults to current time.',
  `end_time` INT DEFAULT NULL COMMENT 'Ad group end time. Unix timestamp in seconds.',
  `targeting_spec` TEXT DEFAULT NULL,
  `lifetime_frequency_cap` INT DEFAULT NULL COMMENT 'Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.',
  `tracking_urls` TEXT DEFAULT NULL COMMENT 'Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.',
  `auto_targeting_enabled` TINYINT(1) DEFAULT NULL COMMENT 'Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.',
  `placement_group` TEXT DEFAULT NULL COMMENT '&lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.',
  `pacing_delivery_type` TEXT DEFAULT NULL,
  `campaign_id` TEXT DEFAULT NULL COMMENT 'Campaign ID of the ad group.',
  `billable_event` TEXT DEFAULT NULL,
  `bid_strategy_type` ENUM('AUTOMATIC_BID', 'MAX_BID', 'TARGET_AVG', 'null') DEFAULT NULL COMMENT 'Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID.',
  `targeting_template_ids` JSON DEFAULT NULL COMMENT 'Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;].',
  `id` TEXT NOT NULL COMMENT 'Ad group ID.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdGroupsAnalyticsResponse_inner` generated from model 'AdGroupsAnalyticsResponseUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `AdGroupsAnalyticsResponse_inner` (
  `AD_GROUP_ID` TEXT NOT NULL COMMENT 'The ID of the ad group that this metrics belongs to.',
  `DATE` DATE DEFAULT NULL COMMENT 'Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ad_groups_list_200_response` generated from model 'adUnderscoregroupsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `ad_groups_list_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdPinId` generated from model 'AdPinId'
--

CREATE TABLE IF NOT EXISTS `AdPinId` (
  `pin_id` TEXT DEFAULT NULL COMMENT 'Pin ID.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdPreviewCreateFromImage` generated from model 'AdPreviewCreateFromImage'
--

CREATE TABLE IF NOT EXISTS `AdPreviewCreateFromImage` (
  `image_url` TEXT NOT NULL COMMENT 'Image URL.',
  `title` TEXT NOT NULL COMMENT 'Title displayed below ad.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdPreviewCreateFromPin` generated from model 'AdPreviewCreateFromPin'
--

CREATE TABLE IF NOT EXISTS `AdPreviewCreateFromPin` (
  `pin_id` TEXT NOT NULL COMMENT 'Pin ID.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdPreviewRequest` generated from model 'AdPreviewRequest'
--

CREATE TABLE IF NOT EXISTS `AdPreviewRequest` (
  `image_url` TEXT NOT NULL COMMENT 'Image URL.',
  `title` TEXT NOT NULL COMMENT 'Title displayed below ad.',
  `pin_id` TEXT NOT NULL COMMENT 'Pin ID.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdPreviewURLResponse` generated from model 'AdPreviewURLResponse'
--

CREATE TABLE IF NOT EXISTS `AdPreviewURLResponse` (
  `url` TEXT DEFAULT NULL COMMENT '&#39;Preview URL, expires in 7 days. Can be used in an iframe. For example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/ The preview object ID/key is the last param - 74667c814dd2b19&#39;'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdResponse` generated from model 'AdResponse'
--

CREATE TABLE IF NOT EXISTS `AdResponse` (
  `ad_group_id` TEXT DEFAULT NULL COMMENT 'ID of the ad group that contains the ad.',
  `android_deep_link` TEXT DEFAULT NULL COMMENT 'Deep link URL for Android devices.',
  `carousel_android_deep_links` JSON DEFAULT NULL COMMENT 'Comma-separated deep links for the carousel pin on Android.',
  `carousel_destination_urls` JSON DEFAULT NULL COMMENT 'Comma-separated destination URLs for the carousel pin to promote.',
  `carousel_ios_deep_links` JSON DEFAULT NULL COMMENT 'Comma-separated deep links for the carousel pin on iOS.',
  `click_tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking url for the ad clicks.',
  `creative_type` TEXT DEFAULT NULL,
  `destination_url` TEXT DEFAULT NULL COMMENT 'Destination URL.',
  `ios_deep_link` TEXT DEFAULT NULL COMMENT 'Deep link URL for iOS devices.',
  `is_pin_deleted` TINYINT(1) DEFAULT NULL COMMENT 'Is original pin deleted?',
  `is_removable` TINYINT(1) DEFAULT NULL COMMENT 'Is pin repinnable?',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the ad - 255 chars max.',
  `status` TEXT DEFAULT NULL,
  `tracking_urls` TEXT DEFAULT NULL,
  `view_tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking URL for ad impressions.',
  `lead_form_id` TEXT DEFAULT NULL COMMENT 'Lead form ID for lead ad generation.',
  `grid_click_type` TEXT DEFAULT NULL,
  `customizable_cta_type` ENUM('GET_OFFER', 'LEARN_MORE', 'ORDER_NOW', 'SHOP_NOW', 'SIGN_UP', 'SUBSCRIBE', 'BUY_NOW', 'CONTACT_US', 'GET_QUOTE', 'VISIT_SITE', 'APPLY_NOW', 'BOOK_NOW', 'REQUEST_DEMO', 'REGISTER_NOW', 'FIND_A_DEALER', 'ADD_TO_CART', 'WATCH_NOW', 'READ_MORE', 'null') DEFAULT NULL COMMENT 'Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)',
  `quiz_pin_data` TEXT DEFAULT NULL COMMENT 'Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.',
  `pin_id` TEXT DEFAULT NULL COMMENT 'Pin ID.',
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
-- Table structure for table `AdUpdateRequest` generated from model 'AdUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `AdUpdateRequest` (
  `ad_group_id` TEXT DEFAULT NULL COMMENT 'ID of the ad group that contains the ad.',
  `android_deep_link` TEXT DEFAULT NULL COMMENT 'Deep link URL for Android devices.',
  `carousel_android_deep_links` JSON DEFAULT NULL COMMENT 'Comma-separated deep links for the carousel pin on Android.',
  `carousel_destination_urls` JSON DEFAULT NULL COMMENT 'Comma-separated destination URLs for the carousel pin to promote.',
  `carousel_ios_deep_links` JSON DEFAULT NULL COMMENT 'Comma-separated deep links for the carousel pin on iOS.',
  `click_tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking url for the ad clicks.',
  `creative_type` TEXT DEFAULT NULL,
  `destination_url` TEXT DEFAULT NULL COMMENT 'Destination URL.',
  `ios_deep_link` TEXT DEFAULT NULL COMMENT 'Deep link URL for iOS devices.',
  `is_pin_deleted` TINYINT(1) DEFAULT NULL COMMENT 'Is original pin deleted?',
  `is_removable` TINYINT(1) DEFAULT NULL COMMENT 'Is pin repinnable?',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the ad - 255 chars max.',
  `status` TEXT DEFAULT NULL,
  `tracking_urls` TEXT DEFAULT NULL,
  `view_tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking URL for ad impressions.',
  `lead_form_id` TEXT DEFAULT NULL COMMENT 'Lead form ID for lead ad generation.',
  `grid_click_type` TEXT DEFAULT NULL,
  `customizable_cta_type` ENUM('GET_OFFER', 'LEARN_MORE', 'ORDER_NOW', 'SHOP_NOW', 'SIGN_UP', 'SUBSCRIBE', 'BUY_NOW', 'CONTACT_US', 'GET_QUOTE', 'VISIT_SITE', 'APPLY_NOW', 'BOOK_NOW', 'REQUEST_DEMO', 'REGISTER_NOW', 'FIND_A_DEALER', 'ADD_TO_CART', 'WATCH_NOW', 'READ_MORE', 'null') DEFAULT NULL COMMENT 'Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)',
  `quiz_pin_data` TEXT DEFAULT NULL COMMENT 'Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.',
  `id` TEXT NOT NULL COMMENT 'The ID of this ad.',
  `pin_id` TEXT DEFAULT NULL COMMENT 'Pin ID. This field may only be updated for draft ads.'
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
  `campaign_ids` JSON DEFAULT NULL COMMENT 'List of campaign ids',
  `campaign_statuses` JSON DEFAULT NULL COMMENT 'List of status values for filtering',
  `campaign_objective_types` JSON DEFAULT NULL COMMENT 'List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] in BETA.',
  `ad_group_ids` JSON DEFAULT NULL COMMENT 'List of ad group ids',
  `ad_group_statuses` JSON DEFAULT NULL COMMENT 'List of values for filtering',
  `ad_ids` JSON DEFAULT NULL COMMENT 'List of ad ids [This parameter is no supported for Product Item Level Reports]',
  `ad_statuses` JSON DEFAULT NULL COMMENT 'List of values for filtering [This parameter is not supported for Product Item Level Reports]',
  `product_group_ids` JSON DEFAULT NULL COMMENT 'List of product group ids',
  `product_group_statuses` JSON DEFAULT NULL COMMENT 'List of values for filtering',
  `product_item_ids` JSON DEFAULT NULL COMMENT 'List of product item ids',
  `targeting_types` JSON DEFAULT NULL COMMENT 'List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users.',
  `metrics_filters` JSON DEFAULT NULL COMMENT 'List of metrics filters',
  `columns` JSON NOT NULL COMMENT 'Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports.',
  `level` TEXT NOT NULL COMMENT 'Level of the report',
  `report_format` TEXT COMMENT 'Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0.',
  `primary_sort` ENUM('BY_ID', 'BY_DATE') DEFAULT NULL COMMENT 'Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests.',
  `start_hour` TINYINT UNSIGNED DEFAULT NULL COMMENT 'Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports.',
  `end_hour` TINYINT UNSIGNED DEFAULT NULL COMMENT 'Which hour of the end date to stop the report (inclusive). For example, with an end_date of &#39;2020-01-01&#39; and end_hour of &#39;15&#39;, the report will contain metrics up to &#39;2020-01-01 14:59:59&#39;. The entire day will be included if no end hour is provided. Only allowed for hourly reports.'
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
  `field` TEXT NOT NULL,
  `operator` TEXT NOT NULL,
  `values` JSON NOT NULL COMMENT 'List of values for filtering'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdsAnalyticsResponse_inner` generated from model 'AdsAnalyticsResponseUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsResponse_inner` (
  `AD_ID` TEXT NOT NULL COMMENT 'The ID of the ad that this metrics belongs to.',
  `DATE` DATE DEFAULT NULL COMMENT 'Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdsCreditDiscountsResponse` generated from model 'AdsCreditDiscountsResponse'
--

CREATE TABLE IF NOT EXISTS `AdsCreditDiscountsResponse` (
  `active` TINYINT(1) DEFAULT NULL COMMENT 'True if the offer code is currently active.',
  `advertiser_id` TEXT DEFAULT NULL COMMENT 'Advertiser ID the offer was applied to.',
  `discountType` ENUM('COUPON', 'CREDIT', 'COUPON_APPLIED', 'CREDIT_APPLIED', 'MARKETING_OFFER_CREDIT', 'MARKETING_OFFER_CREDIT_APPLIED', 'GOODWILL_CREDIT', 'GOODWILL_CREDIT_APPLIED', 'INTERNAL_CREDIT', 'INTERNAL_CREDIT_APPLIED', 'PREPAID_CREDIT', 'PREPAID_CREDIT_APPLIED', 'SALES_INCENTIVE_CREDIT', 'SALES_INCENTIVE_CREDIT_APPLIED', 'CREDIT_EXPIRED', 'FUTURE_CREDIT', 'REFERRAL_CREDIT', 'INVOICE_SALES_INCENTIVE_CREDIT', 'INVOICE_SALES_INCENTIVE_CREDIT_APPLIED', 'PREPAID_CREDIT_REFUND', 'null') DEFAULT NULL COMMENT 'The type of discount of this credit',
  `discountInMicroCurrency` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The discount applied in the offer’s currency value.',
  `discountCurrency` TEXT DEFAULT NULL COMMENT 'Currency value for the discount.',
  `title` TEXT DEFAULT NULL COMMENT 'Human readable title of the offer code.',
  `remainingDiscountInMicroCurrency` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The credits left to spend.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdsCreditRedeemRequest` generated from model 'AdsCreditRedeemRequest'
--

CREATE TABLE IF NOT EXISTS `AdsCreditRedeemRequest` (
  `offerCodeHash` TEXT NOT NULL COMMENT 'Takes in a SHA256 hash of the offerCode.',
  `validateOnly` TINYINT(1) NOT NULL COMMENT 'If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdsCreditRedeemResponse` generated from model 'AdsCreditRedeemResponse'
--

CREATE TABLE IF NOT EXISTS `AdsCreditRedeemResponse` (
  `success` TINYINT(1) DEFAULT NULL COMMENT 'Returns true if the offer code was successfully applied(validateOnly&#x3D;false) or can be applied(validateOnly&#x3D;true).',
  `errorCode` INT DEFAULT NULL COMMENT 'Error code type if error occurs',
  `errorMessage` TEXT DEFAULT NULL COMMENT 'Reason for failure'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ads_credits_discounts_get_200_response` generated from model 'adsUnderscorecreditsUnderscorediscountsUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `ads_credits_discounts_get_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ads_list_200_response` generated from model 'adsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `ads_list_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AdvancedAuctionBidOptions` generated from model 'AdvancedAuctionBidOptions'
-- Object describing a retail catalog item&#39;s bid options (bid price and bid multipliers).
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionBidOptions` (
  `bid_in_micro_currency` BIGINT DEFAULT NULL COMMENT 'Bid price in micro currency. A value of 0 will stop distribution for this item in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. A value of &#x60;null&#x60; will fallback to the ad group&#39;s &#x60;bid_in_micro_currency&#x60;.',
  `app_type_multipliers` TEXT DEFAULT NULL,
  `placement_multipliers` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing a retail catalog item&#39;s bid options (bid price and bid multipliers).';

--
-- Table structure for table `AdvancedAuctionItem` generated from model 'AdvancedAuctionItem'
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItem` (
  `item_id` TEXT NOT NULL COMMENT 'The catalog retail item id in the merchant namespace',
  `country` TEXT NOT NULL,
  `language` TEXT NOT NULL,
  `bid_options` TEXT NOT NULL
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
-- Table structure for table `AdvancedAuctionItemsGetRecord` generated from model 'AdvancedAuctionItemsGetRecord'
-- Object uniquely identifying a retail catalog item
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsGetRecord` (
  `item_id` TEXT NOT NULL COMMENT 'The catalog retail item id in the merchant namespace',
  `country` TEXT NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object uniquely identifying a retail catalog item';

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
  `item_id` TEXT NOT NULL COMMENT 'The catalog retail item id in the merchant namespace',
  `country` TEXT NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an item bid option deletion operation';

--
-- Table structure for table `AdvancedAuctionItemsSubmitRecord` generated from model 'AdvancedAuctionItemsSubmitRecord'
-- Object describing an item bid option operation
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsSubmitRecord` (
  `operation` TEXT NOT NULL,
  `item_id` TEXT NOT NULL COMMENT 'The catalog retail item id in the merchant namespace',
  `country` TEXT NOT NULL,
  `language` TEXT NOT NULL,
  `bid_options` TEXT NOT NULL,
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
  `item_id` TEXT NOT NULL COMMENT 'The catalog retail item id in the merchant namespace',
  `country` TEXT NOT NULL,
  `language` TEXT NOT NULL,
  `bid_options` TEXT NOT NULL,
  `update_mask` JSON NOT NULL COMMENT 'The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an item bid option upsert operation';

--
-- Table structure for table `AdvancedAuctionKey` generated from model 'AdvancedAuctionKey'
-- Object uniquely identifying a retail catalog item
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionKey` (
  `item_id` TEXT NOT NULL COMMENT 'The catalog retail item id in the merchant namespace',
  `country` TEXT NOT NULL,
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
-- Table structure for table `AdvancedAuctionProcessedItem` generated from model 'AdvancedAuctionProcessedItem'
-- Object describing the result of an operation on an item bid option
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionProcessedItem` (
  `operation` TEXT NOT NULL,
  `item_id` TEXT NOT NULL COMMENT 'The catalog retail item id in the merchant namespace',
  `country` TEXT NOT NULL,
  `language` TEXT NOT NULL,
  `bid_options` TEXT NOT NULL,
  `update_mask` JSON NOT NULL COMMENT 'The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;.',
  `errors` JSON DEFAULT NULL COMMENT 'Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing the result of an operation on an item bid option';

--
-- Table structure for table `AdvancedAuctionProcessedItems` generated from model 'AdvancedAuctionProcessedItems'
-- Response object containing the results of an operation on an item bid option
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionProcessedItems` (
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to all items',
  `items` JSON DEFAULT NULL COMMENT 'Array of advanced auction processed items'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Response object containing the results of an operation on an item bid option';

--
-- Table structure for table `AnalyticsDailyMetrics` generated from model 'AnalyticsDailyMetrics'
--

CREATE TABLE IF NOT EXISTS `AnalyticsDailyMetrics` (
  `data_status` TEXT DEFAULT NULL,
  `date` TEXT DEFAULT NULL COMMENT 'Metrics date (UTC): YYYY-MM-DD.',
  `metrics` JSON DEFAULT NULL COMMENT 'The metric name and daily value for each requested metric'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AnalyticsMetricsResponse` generated from model 'AnalyticsMetricsResponse'
--

CREATE TABLE IF NOT EXISTS `AnalyticsMetricsResponse` (
  `summary_metrics` JSON DEFAULT NULL COMMENT 'The metric name and value over the requested period for each requested metric',
  `daily_metrics` JSON DEFAULT NULL COMMENT 'Array with the requested daily metric records'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AppTypeMultipliers` generated from model 'AppTypeMultipliers'
-- This represents a mapping from app type targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified app type in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
--

CREATE TABLE IF NOT EXISTS `AppTypeMultipliers` (
  `APP_TYPE` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This represents a mapping from app type targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified app type in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).';

--
-- Table structure for table `AssetGroupBinding` generated from model 'AssetGroupBinding'
--

CREATE TABLE IF NOT EXISTS `AssetGroupBinding` (
  `id` TEXT DEFAULT NULL COMMENT 'Asset Group ID.',
  `asset_group_name` TEXT DEFAULT NULL COMMENT 'Asset Group name',
  `asset_group_description` TEXT DEFAULT NULL COMMENT 'Asset group description',
  `asset_group_types` JSON DEFAULT NULL COMMENT 'Asset group types',
  `ad_accounts_ids` JSON DEFAULT NULL COMMENT 'A list of ad account IDs under the asset group',
  `profiles_ids` JSON DEFAULT NULL COMMENT 'A list of profile IDs under asset group',
  `created_time` INT DEFAULT NULL COMMENT 'The creation time of the asset group',
  `updated_time` INT DEFAULT NULL COMMENT 'The last update time of the asset group',
  `owner` TEXT DEFAULT NULL COMMENT 'The data of the business that owns the asset group.',
  `created_by` TEXT DEFAULT NULL COMMENT 'The data of the user that created the asset group.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssetIdPermissions` generated from model 'AssetIdPermissions'
-- An object containing the permissions a business member has on the asset.
--

CREATE TABLE IF NOT EXISTS `AssetIdPermissions` (
  `asset_id` VARCHAR(20) DEFAULT NULL COMMENT 'Unique identifier of a business asset.',
  `asset_type` TEXT DEFAULT NULL COMMENT 'Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.',
  `permissions` JSON DEFAULT NULL COMMENT 'Permission levels member or partner has on an asset.',
  `asset_group_info` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An object containing the permissions a business member has on the asset.';

--
-- Table structure for table `Audience` generated from model 'Audience'
--

CREATE TABLE IF NOT EXISTS `Audience` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Ad account ID.',
  `id` TEXT DEFAULT NULL COMMENT 'Audience ID.',
  `name` TEXT DEFAULT NULL COMMENT 'Audience name.',
  `audience_type` TEXT DEFAULT NULL COMMENT '&lt;a href&#x3D;\&quot;/docs/reference/glossary/#Audience Types\&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR',
  `description` TEXT DEFAULT NULL COMMENT 'Audience description.',
  `rule` TEXT DEFAULT NULL,
  `size` INT DEFAULT NULL COMMENT 'Audience size.',
  `status` TEXT DEFAULT NULL COMMENT 'Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.',
  `type` TEXT DEFAULT NULL COMMENT 'Always \&quot;audience\&quot;.',
  `created_timestamp` INT DEFAULT NULL COMMENT 'Creation time. Unix timestamp in seconds.',
  `updated_timestamp` INT DEFAULT NULL COMMENT 'Last update time. Unix timestamp in seconds.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AudienceCategory` generated from model 'AudienceCategory'
--

CREATE TABLE IF NOT EXISTS `AudienceCategory` (
  `key` TEXT DEFAULT NULL COMMENT 'Interest unique key (same as ID).',
  `name` TEXT DEFAULT NULL COMMENT 'Interest name.',
  `ratio` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Interest&#39;s percent of category&#39;s total audience.',
  `index` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Interest affinity index.',
  `id` TEXT DEFAULT NULL COMMENT 'Interest ID.',
  `subcategories` JSON DEFAULT NULL COMMENT 'Subcategory interest distribution'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AudienceCommon` generated from model 'AudienceCommon'
--

CREATE TABLE IF NOT EXISTS `AudienceCommon` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Ad account ID.',
  `name` TEXT DEFAULT NULL COMMENT 'Audience name.',
  `rule` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AudienceCreateCustomRequest` generated from model 'AudienceCreateCustomRequest'
--

CREATE TABLE IF NOT EXISTS `AudienceCreateCustomRequest` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Ad account ID.',
  `name` TEXT NOT NULL COMMENT 'Audience name.',
  `rule` TEXT NOT NULL,
  `sharing_type` TEXT NOT NULL,
  `data_party` TEXT NOT NULL,
  `category` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AudienceCreateRequest` generated from model 'AudienceCreateRequest'
--

CREATE TABLE IF NOT EXISTS `AudienceCreateRequest` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Ad account ID.',
  `name` TEXT NOT NULL COMMENT 'Audience name.',
  `rule` TEXT NOT NULL,
  `description` TEXT DEFAULT NULL COMMENT 'Audience description.',
  `audience_type` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AudienceDefinition` generated from model 'AudienceDefinition'
-- Queryable audience representation.
--

CREATE TABLE IF NOT EXISTS `AudienceDefinition` (
  `date` TEXT DEFAULT NULL COMMENT 'Generation date',
  `type` TEXT DEFAULT NULL COMMENT 'Generated audience type to request.',
  `scope` TEXT DEFAULT NULL COMMENT 'Generated audience scope to request.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Queryable audience representation.';

--
-- Table structure for table `AudienceDefinitionResponse` generated from model 'AudienceDefinitionResponse'
--

CREATE TABLE IF NOT EXISTS `AudienceDefinitionResponse` (
  `items` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

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
  `genders` JSON DEFAULT NULL COMMENT 'Gender distribution.',
  `devices` JSON DEFAULT NULL COMMENT 'Device usage distribution.',
  `metros` JSON DEFAULT NULL COMMENT 'Geographic metro area distribution.',
  `countries` JSON DEFAULT NULL COMMENT 'Country area distribution.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Audience demographics';

--
-- Table structure for table `AudienceInsightCategoryArrayResponse` generated from model 'AudienceInsightCategoryArrayResponse'
--

CREATE TABLE IF NOT EXISTS `AudienceInsightCategoryArrayResponse` (
  `items` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AudienceInsightCategoryCommon` generated from model 'AudienceInsightCategoryCommon'
--

CREATE TABLE IF NOT EXISTS `AudienceInsightCategoryCommon` (
  `key` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL,
  `ratio` DECIMAL(20, 9) DEFAULT NULL,
  `index` DECIMAL(20, 9) DEFAULT NULL,
  `id` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AudienceInsightsResponse` generated from model 'AudienceInsightsResponse'
-- Audience interests and demographics.
--

CREATE TABLE IF NOT EXISTS `AudienceInsightsResponse` (
  `categories` JSON DEFAULT NULL COMMENT 'Category interest distribution',
  `demographics` TEXT DEFAULT NULL,
  `type` TEXT DEFAULT NULL,
  `date` TEXT DEFAULT NULL COMMENT 'Generation date',
  `size` INT DEFAULT NULL COMMENT 'Population count.',
  `size_is_upper_bound` TINYINT(1) DEFAULT NULL COMMENT 'Indicates whether the audience size has been rounded up to the next highest upper boundary.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Audience interests and demographics.';

--
-- Table structure for table `AudienceRule` generated from model 'AudienceRule'
-- JSON object defining targeted audience users. Example rule formats per audience type:&lt;br&gt;CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}&lt;br&gt;ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; }&lt;br&gt;(Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10.&lt;br&gt;The targeted audience should be this % size across Pinterest.)&lt;br&gt;VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}}&lt;br&gt;(Retention days should be 1-540. Retention applies to specific customers.)&lt;br&gt;ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.entomi.com\&quot;], \&quot;engager_type\&quot;: 1}&lt;br&gt;For more details on engagement audiences, see &lt;a href&#x3D;\&quot;/docs/redoc/adtech_ads_v4/#section/November-2021\&quot; target&#x3D;\&quot;_blank\&quot;&gt;November 2021 changelog&lt;/a&gt;.
--

CREATE TABLE IF NOT EXISTS `AudienceRule` (
  `country` TEXT DEFAULT NULL COMMENT 'Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;.',
  `customer_list_id` TEXT DEFAULT NULL COMMENT 'Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;.',
  `engagement_domain` JSON DEFAULT NULL COMMENT 'The audience account&#39;s verified domain. **Required** for ENGAGEMENT &#x60;audience_type&#x60;.',
  `engagement_type` TEXT DEFAULT NULL COMMENT 'Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set. ',
  `event` TEXT DEFAULT NULL COMMENT 'A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event.',
  `event_data` TEXT DEFAULT NULL,
  `percentage` INT DEFAULT NULL COMMENT 'Percentage should be 1-10. The targeted audience should be this % size across Pinterest.',
  `pin_id` JSON DEFAULT NULL COMMENT 'IDs of engaged organic pins. Optional for ENGAGEMENT &#x60;audience_type&#x60;. For example, \&quot;pin_id:\&quot;: [\&quot;34567\&quot;]',
  `prefill` TINYINT(1) DEFAULT NULL COMMENT 'Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;.',
  `retention_days` INT DEFAULT NULL COMMENT 'Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified.',
  `seed_id` JSON DEFAULT NULL COMMENT 'Audience ID(s). For ACTALIKE &#x60;audience_type&#x60;. ',
  `url` JSON DEFAULT NULL COMMENT 'Optional for ENGAGEMENT or VISITOR &#x60;audience_type&#x60;. For ENGAGEMENT, it is the engaged pin&#39;s URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ &#x3D;, !&#x3D;, contains, not_contains].&lt;br&gt;Example 1:  \&quot;url\&quot;: \&quot;http://www.myonlinestore123.com/view_item/shoe\&quot;&lt;br&gt;Example 2: \&quot;url\&quot;: {\&quot;contains\&quot;: \&quot;/view_item/shoe\&quot;}',
  `visitor_source_id` TEXT DEFAULT NULL COMMENT 'The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;.',
  `event_source` JSON DEFAULT NULL COMMENT 'Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline',
  `ingestion_source` JSON DEFAULT NULL COMMENT 'Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api',
  `engager_type` INT DEFAULT NULL COMMENT 'Optional for ENGAGEMENT. Engager type value should be 1-2.',
  `campaign_id` JSON DEFAULT NULL COMMENT 'Campaign ID for engagement audience filter.',
  `ad_id` JSON DEFAULT NULL COMMENT 'Ad ID for engagement audience filter.',
  `objective_type` JSON DEFAULT NULL COMMENT 'Objective for engagement audience filter.',
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Ad account ID.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='JSON object defining targeted audience users. Example rule formats per audience type:&lt;br&gt;CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}&lt;br&gt;ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; }&lt;br&gt;(Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10.&lt;br&gt;The targeted audience should be this % size across Pinterest.)&lt;br&gt;VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}}&lt;br&gt;(Retention days should be 1-540. Retention applies to specific customers.)&lt;br&gt;ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.entomi.com\&quot;], \&quot;engager_type\&quot;: 1}&lt;br&gt;For more details on engagement audiences, see &lt;a href&#x3D;\&quot;/docs/redoc/adtech_ads_v4/#section/November-2021\&quot; target&#x3D;\&quot;_blank\&quot;&gt;November 2021 changelog&lt;/a&gt;.';

--
-- Table structure for table `AudienceSubcategory` generated from model 'AudienceSubcategory'
--

CREATE TABLE IF NOT EXISTS `AudienceSubcategory` (
  `key` TEXT DEFAULT NULL COMMENT 'Interest unique key (same as ID).',
  `name` TEXT DEFAULT NULL COMMENT 'Subinterest name.',
  `ratio` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Subinterest&#39;s percent of category&#39;s total audience.',
  `index` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Subinterest affinity index.',
  `id` TEXT DEFAULT NULL COMMENT 'Subinterest ID.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AudienceUpdateRequest` generated from model 'AudienceUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `AudienceUpdateRequest` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Ad account ID.',
  `name` TEXT DEFAULT NULL COMMENT 'Audience name.',
  `rule` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL COMMENT 'Audience description.',
  `operation_type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `audiences_list_200_response` generated from model 'audiencesUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `audiences_list_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AuthRespondInvitesBody` generated from model 'AuthRespondInvitesBody'
-- An object with a list of all the invites the user would like to respond to and the action to take.
--

CREATE TABLE IF NOT EXISTS `AuthRespondInvitesBody` (
  `invites` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An object with a list of all the invites the user would like to respond to and the action to take.';

--
-- Table structure for table `AuthRespondInvitesBody_invites_inner` generated from model 'AuthRespondInvitesBodyUnderscoreinvitesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `AuthRespondInvitesBody_invites_inner` (
  `action` TEXT NOT NULL,
  `invite_id` VARCHAR(25) NOT NULL COMMENT 'Unique identifier of an invite.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AuthRespondInvitesBody_invites_inner_action` generated from model 'AuthRespondInvitesBodyUnderscoreinvitesUnderscoreinnerUnderscoreaction'
--

CREATE TABLE IF NOT EXISTS `AuthRespondInvitesBody_invites_inner_action` (
  `accept_invite` TINYINT(1) NOT NULL COMMENT 'Whether the invite/request is accepted.',
  `asset_id_to_permissions` JSON DEFAULT NULL COMMENT 'An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AvailabilityFilter` generated from model 'AvailabilityFilter'
--

CREATE TABLE IF NOT EXISTS `AvailabilityFilter` (
  `AVAILABILITY` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BaseInviteDataResponse` generated from model 'BaseInviteDataResponse'
--

CREATE TABLE IF NOT EXISTS `BaseInviteDataResponse` (
  `id` TEXT DEFAULT NULL COMMENT 'Unique identifier of the invite/request.',
  `invite_data` TEXT DEFAULT NULL,
  `is_received_invite` TINYINT(1) DEFAULT NULL COMMENT 'Indicates whether the invite/request was received.',
  `user` TEXT DEFAULT NULL COMMENT 'Metadata for the member/partner that was sent the invite/request.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BaseInviteDataResponse_invite_data` generated from model 'BaseInviteDataResponseUnderscoreinviteUnderscoredata'
-- Metadata for the invite/request.
--

CREATE TABLE IF NOT EXISTS `BaseInviteDataResponse_invite_data` (
  `invite_expiration` INT DEFAULT NULL COMMENT 'The date and time when the invite/request will expire. Returned in milliseconds.',
  `invite_status` TEXT DEFAULT NULL COMMENT 'The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.',
  `invite_type` TEXT DEFAULT NULL COMMENT 'The type of invite. &lt;br&gt;&#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. &lt;br&gt;&#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. &lt;br&gt;&#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets.',
  `last_updated_time` INT DEFAULT NULL COMMENT 'The date and time the invite/request was last updated. Returned in milliseconds.',
  `sent_at` INT DEFAULT NULL COMMENT 'The date and time the invite/request was sent/created. Returned in milliseconds.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Metadata for the invite/request.';

--
-- Table structure for table `BidFloor` generated from model 'BidFloor'
--

CREATE TABLE IF NOT EXISTS `BidFloor` (
  `bid_floors` JSON DEFAULT NULL COMMENT 'A list of bid floors in micro currency. For example, [100000, 200000]',
  `type` TEXT COMMENT 'Always the string &#39;bidfloor&#39;'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BidFloorRequest` generated from model 'BidFloorRequest'
--

CREATE TABLE IF NOT EXISTS `BidFloorRequest` (
  `bid_floor_specs` JSON NOT NULL,
  `targeting_spec` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BidFloorSpec` generated from model 'BidFloorSpec'
--

CREATE TABLE IF NOT EXISTS `BidFloorSpec` (
  `countries` JSON DEFAULT NULL,
  `currency` TEXT NOT NULL,
  `objective_type` TEXT DEFAULT NULL,
  `billable_event` TEXT NOT NULL,
  `optimization_goal_metadata` TEXT DEFAULT NULL,
  `creative_type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `billing_profiles_get_200_response` generated from model 'billingUnderscoreprofilesUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `billing_profiles_get_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BillingProfilesResponse` generated from model 'BillingProfilesResponse'
--

CREATE TABLE IF NOT EXISTS `BillingProfilesResponse` (
  `id` TEXT DEFAULT NULL COMMENT 'Billing ID.',
  `card_type` ENUM('UNKNOWN', 'VISA', 'MASTERCARD', 'AMERICAN_EXPRESS', 'DISCOVER', 'ELO') DEFAULT NULL COMMENT 'Type of the card.',
  `status` ENUM('UNSPECIFIED', 'VALID', 'INVALID', 'PENDING', 'DELETED', 'SECONDARY', 'PENDING_SECONDARY') DEFAULT NULL COMMENT 'Status of the billing.',
  `advertiser_id` TEXT DEFAULT NULL COMMENT 'Advertiser ID of the billing.',
  `payment_method_brand` ENUM('UNKNOWN', 'VISA', 'MASTERCARD', 'AMERICAN_EXPRESS', 'DISCOVER', 'SOFORT', 'DINERS_CLUB', 'ELO', 'CARTE_BANCAIRE') DEFAULT NULL COMMENT 'Brand of the payment method.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Board` generated from model 'Board'
-- Board
--

CREATE TABLE IF NOT EXISTS `Board` (
  `id` TEXT DEFAULT NULL,
  `created_at` DATETIME DEFAULT NULL COMMENT 'Date and time of board creation.',
  `board_pins_modified_at` DATETIME DEFAULT NULL COMMENT 'Date and time of last board pins modified.',
  `name` TEXT NOT NULL,
  `description` TEXT DEFAULT NULL,
  `collaborator_count` INT UNSIGNED DEFAULT NULL COMMENT 'Count of collaborators on the board.',
  `pin_count` INT UNSIGNED DEFAULT NULL COMMENT 'Count of pins on the board.',
  `follower_count` INT UNSIGNED DEFAULT NULL COMMENT 'Board follower count.',
  `media` TEXT DEFAULT NULL,
  `owner` TEXT DEFAULT NULL,
  `privacy` ENUM('PUBLIC', 'PROTECTED', 'SECRET') DEFAULT 'PUBLIC' COMMENT 'Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt;'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Board';

--
-- Table structure for table `Board_media` generated from model 'BoardUnderscoremedia'
-- Board media.
--

CREATE TABLE IF NOT EXISTS `Board_media` (
  `image_cover_url` TEXT DEFAULT NULL COMMENT 'Board cover image.',
  `pin_thumbnail_urls` JSON DEFAULT NULL COMMENT 'Board pin thumbnail urls.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Board media.';

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
-- Table structure for table `board_sections_list_200_response` generated from model 'boardUnderscoresectionsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `board_sections_list_200_response` (
  `items` JSON NOT NULL COMMENT 'Board sections',
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

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
-- Table structure for table `boards_list_200_response` generated from model 'boardsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `boards_list_200_response` (
  `items` JSON NOT NULL COMMENT 'Boards',
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `boards_list_pins_200_response` generated from model 'boardsUnderscorelistUnderscorepinsUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `boards_list_pins_200_response` (
  `items` JSON NOT NULL COMMENT 'Pins',
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `boards_user_follows_list_200_response` generated from model 'boardsUnderscoreuserUnderscorefollowsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `boards_user_follows_list_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BookClosedResponse` generated from model 'BookClosedResponse'
-- Creation fields
--

CREATE TABLE IF NOT EXISTS `BookClosedResponse` (
  `conversion_metrics_ready` TINYINT(1) DEFAULT NULL COMMENT 'Are conversion metrics ready?',
  `non_conversion_metrics_ready` TINYINT(1) DEFAULT NULL COMMENT 'Are non-conversion metrics ready?'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Creation fields';

--
-- Table structure for table `BrandFilter` generated from model 'BrandFilter'
--

CREATE TABLE IF NOT EXISTS `BrandFilter` (
  `BRAND` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BulkDownloadRequest` generated from model 'BulkDownloadRequest'
-- Ad entities to get in bulk request.
--

CREATE TABLE IF NOT EXISTS `BulkDownloadRequest` (
  `entity_types` JSON DEFAULT NULL COMMENT 'All entity types specified will be downloaded. Fewer types result in faster downloads.',
  `entity_ids` JSON DEFAULT NULL COMMENT 'All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.',
  `updated_since` TEXT DEFAULT NULL COMMENT 'Unix UTC timestamp to retrieve all entities that have changed since this time.',
  `campaign_filter` TEXT DEFAULT NULL,
  `output_format` TEXT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ad entities to get in bulk request.';

--
-- Table structure for table `BulkDownloadRequest_campaign_filter` generated from model 'BulkDownloadRequestUnderscorecampaignUnderscorefilter'
--

CREATE TABLE IF NOT EXISTS `BulkDownloadRequest_campaign_filter` (
  `start_time` TEXT DEFAULT NULL COMMENT 'Unix UTC timestamp.',
  `end_time` TEXT DEFAULT NULL COMMENT 'Unix UTC timestamp.',
  `name` TEXT DEFAULT NULL COMMENT 'Campaign name',
  `campaign_status` JSON DEFAULT NULL,
  `objective_type` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BulkDownloadResponse` generated from model 'BulkDownloadResponse'
--

CREATE TABLE IF NOT EXISTS `BulkDownloadResponse` (
  `request_id` TEXT DEFAULT NULL COMMENT 'ID of the bulk request.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

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
  `campaigns` JSON DEFAULT NULL,
  `ad_groups` JSON DEFAULT NULL,
  `ads` JSON DEFAULT NULL,
  `product_groups` JSON DEFAULT NULL,
  `keywords` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request for creation of entities in bulk.';

--
-- Table structure for table `BulkUpsertRequestUpdate` generated from model 'BulkUpsertRequestUpdate'
-- Request for creation of entities in bulk.
--

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestUpdate` (
  `campaigns` JSON DEFAULT NULL,
  `ad_groups` JSON DEFAULT NULL,
  `ads` JSON DEFAULT NULL,
  `product_groups` JSON DEFAULT NULL,
  `keywords` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request for creation of entities in bulk.';

--
-- Table structure for table `BulkUpsertResponse` generated from model 'BulkUpsertResponse'
-- ID of the bulk request.
--

CREATE TABLE IF NOT EXISTS `BulkUpsertResponse` (
  `request_id` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='ID of the bulk request.';

--
-- Table structure for table `BulkUpsertStatusResponse` generated from model 'BulkUpsertStatusResponse'
-- ID of the bulk request.
--

CREATE TABLE IF NOT EXISTS `BulkUpsertStatusResponse` (
  `status` TEXT DEFAULT NULL,
  `result_url` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='ID of the bulk request.';

--
-- Table structure for table `BusinessAccessError` generated from model 'BusinessAccessError'
--

CREATE TABLE IF NOT EXISTS `BusinessAccessError` (
  `code` INT NOT NULL,
  `message` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

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
  `items` JSON NOT NULL COMMENT 'List of members with permissions to the asset.',
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `business_asset_partners_get_200_response` generated from model 'businessUnderscoreassetUnderscorepartnersUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `business_asset_partners_get_200_response` (
  `items` JSON NOT NULL COMMENT 'List of partners with permissions to the asset.',
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `business_assets_get_200_response` generated from model 'businessUnderscoreassetsUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `business_assets_get_200_response` (
  `items` JSON NOT NULL COMMENT 'List of assets the requesting business has access to.',
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `business_member_assets_get_200_response` generated from model 'businessUnderscorememberUnderscoreassetsUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `business_member_assets_get_200_response` (
  `items` JSON NOT NULL COMMENT 'List asset permissions the given member was granted.',
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BusinessMemberAssetsSummary` generated from model 'BusinessMemberAssetsSummary'
-- Ad accounts and profiles the business member/partner has access to.
--

CREATE TABLE IF NOT EXISTS `BusinessMemberAssetsSummary` (
  `ad_accounts` JSON DEFAULT NULL COMMENT 'List of ad account IDs and respective permission levels.',
  `profiles` JSON DEFAULT NULL COMMENT 'List of profile IDs and respective permission levels.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ad accounts and profiles the business member/partner has access to.';

--
-- Table structure for table `BusinessMemberAssetsSummary_ad_accounts_inner` generated from model 'BusinessMemberAssetsSummaryUnderscoreadUnderscoreaccountsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `BusinessMemberAssetsSummary_ad_accounts_inner` (
  `id` VARCHAR(20) DEFAULT NULL COMMENT 'Unique identifier of a business ad account.',
  `permissions` JSON DEFAULT NULL COMMENT 'Permission levels member or partner has on an asset.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BusinessMemberAssetsSummary_profiles_inner` generated from model 'BusinessMemberAssetsSummaryUnderscoreprofilesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `BusinessMemberAssetsSummary_profiles_inner` (
  `id` VARCHAR(20) DEFAULT NULL COMMENT 'Unique identifier of a business profile.',
  `permissions` JSON DEFAULT NULL COMMENT 'Permission levels member or partner has on an asset.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `business_members_asset_access_delete_request` generated from model 'businessUnderscoremembersUnderscoreassetUnderscoreaccessUnderscoredeleteUnderscorerequest'
--

CREATE TABLE IF NOT EXISTS `business_members_asset_access_delete_request` (
  `accesses` JSON NOT NULL COMMENT 'List of members asset access to be deleted'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `business_members_asset_access_delete_request_accesses_inner` generated from model 'businessUnderscoremembersUnderscoreassetUnderscoreaccessUnderscoredeleteUnderscorerequestUnderscoreaccessesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `business_members_asset_access_delete_request_accesses_inner` (
  `asset_id` VARCHAR(25) NOT NULL COMMENT 'Id of the asset on which to remove member permissions.',
  `member_id` VARCHAR(25) NOT NULL COMMENT 'Unique identifier of the member on which to perform the asset permission removal'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `business_partner_asset_access_get_200_response` generated from model 'businessUnderscorepartnerUnderscoreassetUnderscoreaccessUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `business_partner_asset_access_get_200_response` (
  `items` JSON NOT NULL COMMENT 'List assets on which you granted access to your partner or assets on which your partner has granted you access.',
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BusinessSharedAudience` generated from model 'BusinessSharedAudience'
--

CREATE TABLE IF NOT EXISTS `BusinessSharedAudience` (
  `audience_id` TEXT NOT NULL COMMENT 'Unique identifier of an audience',
  `operation_type` TEXT NOT NULL,
  `recipient_business_ids` JSON NOT NULL COMMENT 'List of business IDs to share with or revoke from.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BusinessSharedAudienceResponse` generated from model 'BusinessSharedAudienceResponse'
--

CREATE TABLE IF NOT EXISTS `BusinessSharedAudienceResponse` (
  `audience_id` TEXT DEFAULT NULL COMMENT 'Audience ID that was shared',
  `permissions` JSON DEFAULT NULL,
  `recipient_business_ids` JSON DEFAULT NULL COMMENT 'Business IDs that received the audience'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CampaignCommon` generated from model 'CampaignCommon'
-- Campaign Data
--

CREATE TABLE IF NOT EXISTS `CampaignCommon` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.',
  `name` TEXT DEFAULT NULL COMMENT 'Campaign name.',
  `status` TEXT DEFAULT NULL,
  `lifetime_spend_cap` INT DEFAULT NULL COMMENT 'Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.',
  `daily_spend_cap` INT DEFAULT NULL COMMENT 'Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.',
  `order_line_id` TEXT DEFAULT NULL COMMENT 'Order line ID that appears on the invoice.',
  `tracking_urls` TEXT DEFAULT NULL,
  `start_time` INT DEFAULT NULL COMMENT 'Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.',
  `end_time` INT DEFAULT NULL COMMENT 'Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.',
  `is_flexible_daily_budgets` TINYINT(1) DEFAULT NULL COMMENT 'Determine if a campaign has flexible daily budgets setup.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Campaign Data';

--
-- Table structure for table `CampaignCreateCommon` generated from model 'CampaignCreateCommon'
--

CREATE TABLE IF NOT EXISTS `CampaignCreateCommon` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.',
  `name` TEXT DEFAULT NULL COMMENT 'Campaign name.',
  `status` TEXT DEFAULT NULL,
  `lifetime_spend_cap` INT DEFAULT NULL COMMENT 'Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.',
  `daily_spend_cap` INT DEFAULT NULL COMMENT 'Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.',
  `order_line_id` TEXT DEFAULT NULL COMMENT 'Order line ID that appears on the invoice.',
  `tracking_urls` TEXT DEFAULT NULL,
  `start_time` INT DEFAULT NULL COMMENT 'Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.',
  `end_time` INT DEFAULT NULL COMMENT 'Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.',
  `is_flexible_daily_budgets` TINYINT(1) DEFAULT NULL COMMENT 'Determine if a campaign has flexible daily budgets setup.',
  `default_ad_group_budget_in_micro_currency` INT DEFAULT NULL COMMENT 'When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.',
  `is_automated_campaign` TINYINT(1) DEFAULT NULL COMMENT 'Specifies whether the campaign was created in the automated campaign flow'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CampaignCreateRequest` generated from model 'CampaignCreateRequest'
--

CREATE TABLE IF NOT EXISTS `CampaignCreateRequest` (
  `ad_account_id` TEXT NOT NULL COMMENT 'Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.',
  `name` TEXT NOT NULL COMMENT 'Campaign name.',
  `status` TEXT,
  `lifetime_spend_cap` INT DEFAULT NULL COMMENT 'Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.',
  `daily_spend_cap` INT DEFAULT NULL COMMENT 'Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.',
  `order_line_id` TEXT DEFAULT NULL COMMENT 'Order line ID that appears on the invoice.',
  `tracking_urls` TEXT DEFAULT NULL,
  `start_time` INT DEFAULT NULL COMMENT 'Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.',
  `end_time` INT DEFAULT NULL COMMENT 'Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.',
  `is_flexible_daily_budgets` TINYINT(1) DEFAULT false COMMENT 'Determine if a campaign has flexible daily budgets setup.',
  `default_ad_group_budget_in_micro_currency` INT DEFAULT NULL COMMENT 'When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.',
  `is_automated_campaign` TINYINT(1) DEFAULT false COMMENT 'Specifies whether the campaign was created in the automated campaign flow',
  `objective_type` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CampaignCreateResponse` generated from model 'CampaignCreateResponse'
--

CREATE TABLE IF NOT EXISTS `CampaignCreateResponse` (
  `items` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CampaignCreateResponseData` generated from model 'CampaignCreateResponseData'
--

CREATE TABLE IF NOT EXISTS `CampaignCreateResponseData` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.',
  `name` TEXT DEFAULT NULL COMMENT 'Campaign name.',
  `status` TEXT DEFAULT NULL,
  `lifetime_spend_cap` INT DEFAULT NULL COMMENT 'Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.',
  `daily_spend_cap` INT DEFAULT NULL COMMENT 'Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.',
  `order_line_id` TEXT DEFAULT NULL COMMENT 'Order line ID that appears on the invoice.',
  `tracking_urls` TEXT DEFAULT NULL,
  `start_time` INT DEFAULT NULL COMMENT 'Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.',
  `end_time` INT DEFAULT NULL COMMENT 'Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.',
  `is_flexible_daily_budgets` TINYINT(1) DEFAULT NULL COMMENT 'Determine if a campaign has flexible daily budgets setup.',
  `default_ad_group_budget_in_micro_currency` INT DEFAULT NULL COMMENT 'When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.',
  `is_automated_campaign` TINYINT(1) DEFAULT NULL COMMENT 'Specifies whether the campaign was created in the automated campaign flow',
  `id` TEXT DEFAULT NULL COMMENT 'Campaign ID.',
  `objective_type` TEXT DEFAULT NULL,
  `created_time` INT DEFAULT NULL COMMENT 'Campaign creation time. Unix timestamp in seconds.',
  `updated_time` INT DEFAULT NULL COMMENT 'UTC timestamp. Last update time.',
  `type` TEXT DEFAULT NULL COMMENT 'Always \&quot;campaign\&quot;.',
  `is_campaign_budget_optimization` TINYINT(1) DEFAULT NULL COMMENT 'Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.',
  `summary_status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CampaignCreateResponseItem` generated from model 'CampaignCreateResponseItem'
--

CREATE TABLE IF NOT EXISTS `CampaignCreateResponseItem` (
  `data` TEXT DEFAULT NULL,
  `exceptions` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CampaignId` generated from model 'CampaignId'
--

CREATE TABLE IF NOT EXISTS `CampaignId` (
  `id` TEXT DEFAULT NULL COMMENT 'Campaign ID.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CampaignResponse` generated from model 'CampaignResponse'
--

CREATE TABLE IF NOT EXISTS `CampaignResponse` (
  `id` TEXT DEFAULT NULL COMMENT 'Campaign ID.',
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.',
  `name` TEXT DEFAULT NULL COMMENT 'Campaign name.',
  `status` TEXT DEFAULT NULL,
  `lifetime_spend_cap` INT DEFAULT NULL COMMENT 'Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.',
  `daily_spend_cap` INT DEFAULT NULL COMMENT 'Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.',
  `order_line_id` TEXT DEFAULT NULL COMMENT 'Order line ID that appears on the invoice.',
  `tracking_urls` TEXT DEFAULT NULL,
  `start_time` INT DEFAULT NULL COMMENT 'Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.',
  `end_time` INT DEFAULT NULL COMMENT 'Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.',
  `is_flexible_daily_budgets` TINYINT(1) DEFAULT NULL COMMENT 'Determine if a campaign has flexible daily budgets setup.',
  `objective_type` TEXT DEFAULT NULL,
  `created_time` INT DEFAULT NULL COMMENT 'Campaign creation time. Unix timestamp in seconds.',
  `updated_time` INT DEFAULT NULL COMMENT 'UTC timestamp. Last update time.',
  `type` TEXT DEFAULT NULL COMMENT 'Always \&quot;campaign\&quot;.',
  `is_campaign_budget_optimization` TINYINT(1) DEFAULT NULL COMMENT 'Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.',
  `summary_status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CampaignUpdateRequest` generated from model 'CampaignUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `CampaignUpdateRequest` (
  `id` TEXT NOT NULL COMMENT 'Campaign ID.',
  `ad_account_id` TEXT NOT NULL COMMENT 'Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.',
  `name` TEXT DEFAULT NULL COMMENT 'Campaign name.',
  `status` TEXT DEFAULT NULL,
  `lifetime_spend_cap` INT DEFAULT NULL COMMENT 'Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.',
  `daily_spend_cap` INT DEFAULT NULL COMMENT 'Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.',
  `order_line_id` TEXT DEFAULT NULL COMMENT 'Order line ID that appears on the invoice.',
  `tracking_urls` TEXT DEFAULT NULL,
  `start_time` INT DEFAULT NULL COMMENT 'Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.',
  `end_time` INT DEFAULT NULL COMMENT 'Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.',
  `is_flexible_daily_budgets` TINYINT(1) DEFAULT NULL COMMENT 'Determine if a campaign has flexible daily budgets setup.',
  `default_ad_group_budget_in_micro_currency` INT DEFAULT NULL COMMENT 'When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.',
  `is_automated_campaign` TINYINT(1) DEFAULT NULL COMMENT 'Specifies whether the campaign was created in the automated campaign flow',
  `is_campaign_budget_optimization` TINYINT(1) DEFAULT NULL COMMENT 'Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.',
  `objective_type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CampaignUpdateResponse` generated from model 'CampaignUpdateResponse'
--

CREATE TABLE IF NOT EXISTS `CampaignUpdateResponse` (
  `items` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CampaignsAnalyticsResponse_inner` generated from model 'CampaignsAnalyticsResponseUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `CampaignsAnalyticsResponse_inner` (
  `CAMPAIGN_ID` TEXT NOT NULL COMMENT 'The ID of the campaing that this metrics belongs to.',
  `DATE` DATE DEFAULT NULL COMMENT 'Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `campaigns_list_200_response` generated from model 'campaignsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `campaigns_list_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CancelInvitesBody` generated from model 'CancelInvitesBody'
-- Request body used to cancel invites
--

CREATE TABLE IF NOT EXISTS `CancelInvitesBody` (
  `invite_ids` JSON NOT NULL COMMENT 'List of invite/request ids to be cancelled'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request body used to cancel invites';

--
-- Table structure for table `Catalog` generated from model 'Catalog'
-- Catalog entity
--

CREATE TABLE IF NOT EXISTS `Catalog` (
  `created_at` DATETIME NOT NULL,
  `id` TEXT NOT NULL COMMENT 'ID of the catalog entity.',
  `updated_at` DATETIME NOT NULL,
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a catalog entity.',
  `catalog_type` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Catalog entity';

--
-- Table structure for table `CatalogsCreateCreativeAssetsItem` generated from model 'CatalogsCreateCreativeAssetsItem'
-- A creative assets item to be created.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreateCreativeAssetsItem` (
  `creative_assets_id` TEXT NOT NULL COMMENT 'The catalog creative assets id in the merchant namespace',
  `operation` ENUM('CREATE') NOT NULL,
  `attributes` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A creative assets item to be created.';

--
-- Table structure for table `CatalogsCreateHotelItem` generated from model 'CatalogsCreateHotelItem'
-- A hotel item to be created.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreateHotelItem` (
  `hotel_id` TEXT NOT NULL COMMENT 'The catalog hotel id in the merchant namespace',
  `operation` ENUM('CREATE') NOT NULL,
  `attributes` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A hotel item to be created.';

--
-- Table structure for table `CatalogsCreateReportResponse` generated from model 'CatalogsCreateReportResponse'
--

CREATE TABLE IF NOT EXISTS `CatalogsCreateReportResponse` (
  `token` TEXT DEFAULT NULL COMMENT 'Token to be used to get the report'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsCreateRequest` generated from model 'CatalogsCreateRequest'
-- Request object for creating a catalog.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreateRequest` (
  `catalog_type` ENUM('HOTEL') NOT NULL COMMENT 'Type of the catalog entity.',
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given catalog.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for creating a catalog.';

--
-- Table structure for table `CatalogsCreateRetailItem` generated from model 'CatalogsCreateRetailItem'
-- An item to be created
--

CREATE TABLE IF NOT EXISTS `CatalogsCreateRetailItem` (
  `item_id` TEXT NOT NULL COMMENT 'The catalog item id in the merchant namespace',
  `operation` ENUM('CREATE') NOT NULL,
  `attributes` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An item to be created';

--
-- Table structure for table `CatalogsCreativeAssetsAttributes` generated from model 'CatalogsCreativeAssetsAttributes'
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsAttributes` (
  `title` TEXT DEFAULT NULL COMMENT 'The name of the creative assets.',
  `description` TEXT DEFAULT NULL COMMENT 'Brief description of the creative assets.',
  `link` TEXT DEFAULT NULL COMMENT 'Link to the creative assets page.',
  `ios_deep_link` TEXT DEFAULT NULL COMMENT 'IOS deep link to the creative assets page.',
  `android_deep_link` TEXT DEFAULT NULL COMMENT 'Link to the creative assets page.',
  `google_product_category` TEXT DEFAULT NULL COMMENT 'The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.',
  `custom_label_0` TEXT DEFAULT NULL COMMENT 'Custom grouping of creative assets.',
  `custom_label_1` TEXT DEFAULT NULL COMMENT 'Custom grouping of creative assets.',
  `custom_label_2` TEXT DEFAULT NULL COMMENT 'Custom grouping of creative assets.',
  `custom_label_3` TEXT DEFAULT NULL COMMENT 'Custom grouping of creative assets.',
  `custom_label_4` TEXT DEFAULT NULL COMMENT 'Custom grouping of creative assets.',
  `visibility` TEXT DEFAULT NULL COMMENT 'Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.',
  `image_link` TEXT DEFAULT NULL COMMENT 'The creative assets image.',
  `video_link` TEXT DEFAULT NULL COMMENT 'The creative assets video.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsCreativeAssetsBatchItem` generated from model 'CatalogsCreativeAssetsBatchItem'
-- Creative assets batch item
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsBatchItem` (
  `creative_assets_id` TEXT NOT NULL COMMENT 'The catalog creative assets id in the merchant namespace',
  `operation` ENUM('DELETE') NOT NULL,
  `attributes` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Creative assets batch item';

--
-- Table structure for table `CatalogsCreativeAssetsBatchRequest` generated from model 'CatalogsCreativeAssetsBatchRequest'
-- Request object to update catalogs creative assets items
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsBatchRequest` (
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `country` TEXT NOT NULL,
  `language` TEXT NOT NULL,
  `items` JSON NOT NULL COMMENT 'Array with creative assets item operations',
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object to update catalogs creative assets items';

--
-- Table structure for table `CatalogsCreativeAssetsFeed` generated from model 'CatalogsCreativeAssetsFeed'
-- Catalogs Creative Asset Feed object
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFeed` (
  `created_at` DATETIME NOT NULL,
  `id` TEXT NOT NULL,
  `updated_at` DATETIME NOT NULL,
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.',
  `format` TEXT NOT NULL,
  `catalog_type` TEXT NOT NULL,
  `credentials` TEXT NOT NULL,
  `location` TEXT NOT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `preferred_processing_schedule` TEXT NOT NULL,
  `status` TEXT NOT NULL,
  `default_currency` TEXT NOT NULL,
  `default_locale` TEXT NOT NULL COMMENT 'The locale used within a feed for product descriptions.',
  `default_country` TEXT NOT NULL,
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Catalogs Creative Asset Feed object';

--
-- Table structure for table `CatalogsCreativeAssetsFeedsCreateRequest` generated from model 'CatalogsCreativeAssetsFeedsCreateRequest'
-- Request object for creating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFeedsCreateRequest` (
  `default_currency` TEXT DEFAULT NULL,
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `format` TEXT NOT NULL,
  `default_locale` TEXT NOT NULL,
  `default_country` TEXT NOT NULL,
  `credentials` TEXT DEFAULT NULL,
  `location` TEXT NOT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `catalog_type` TEXT NOT NULL,
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.',
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for creating a feed.';

--
-- Table structure for table `CatalogsCreativeAssetsFeedsUpdateRequest` generated from model 'CatalogsCreativeAssetsFeedsUpdateRequest'
-- Request object for updating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFeedsUpdateRequest` (
  `default_currency` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `format` TEXT DEFAULT NULL,
  `credentials` TEXT DEFAULT NULL,
  `location` TEXT DEFAULT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL,
  `catalog_type` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for updating a feed.';

--
-- Table structure for table `CatalogsCreativeAssetsItemErrorResponse` generated from model 'CatalogsCreativeAssetsItemErrorResponse'
-- Object describing a creative assets item error
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsItemErrorResponse` (
  `catalog_type` TEXT NOT NULL,
  `creative_assets_id` TEXT DEFAULT NULL COMMENT 'The catalog creative assets id in the merchant namespace',
  `errors` JSON DEFAULT NULL COMMENT 'Array with the errors for the item id requested'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing a creative assets item error';

--
-- Table structure for table `CatalogsCreativeAssetsItemResponse` generated from model 'CatalogsCreativeAssetsItemResponse'
-- Object describing a hotel record
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsItemResponse` (
  `catalog_type` TEXT NOT NULL,
  `creative_assets_id` TEXT DEFAULT NULL COMMENT 'The catalog creative assets id in the merchant namespace',
  `pins` JSON DEFAULT NULL COMMENT 'The pins mapped to the item',
  `attributes` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing a hotel record';

--
-- Table structure for table `CatalogsCreativeAssetsItemsBatch` generated from model 'CatalogsCreativeAssetsItemsBatch'
-- Object describing the catalogs creative assets items batch
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsItemsBatch` (
  `batch_id` TEXT DEFAULT NULL COMMENT 'Id of the catalogs items batch',
  `created_time` DATETIME DEFAULT NULL COMMENT 'Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss',
  `completed_time` DATETIME DEFAULT NULL COMMENT 'Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss',
  `status` TEXT DEFAULT NULL,
  `catalog_type` TEXT NOT NULL,
  `items` JSON DEFAULT NULL COMMENT 'Array with the catalogs items processing records part of the catalogs items batch'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing the catalogs creative assets items batch';

--
-- Table structure for table `CatalogsCreativeAssetsItemsFilter` generated from model 'CatalogsCreativeAssetsItemsFilter'
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsItemsFilter` (
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `creative_assets_ids` JSON NOT NULL,
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsCreativeAssetsItemsPostFilter` generated from model 'CatalogsCreativeAssetsItemsPostFilter'
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsItemsPostFilter` (
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `creative_assets_ids` JSON NOT NULL,
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest` generated from model 'CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest'
-- Request object to list products for a given creative assets catalog_id and product group filter.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest` (
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog id pertaining to the creative assets product group.',
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
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `id` TEXT NOT NULL COMMENT 'ID of the creative assets product group.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of creative assets product group',
  `description` TEXT DEFAULT NULL,
  `filters` TEXT NOT NULL,
  `created_at` INT DEFAULT NULL COMMENT 'Unix timestamp in seconds of when catalog product group was created.',
  `updated_at` INT DEFAULT NULL COMMENT 'Unix timestamp in seconds of last time catalog product group was updated.',
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog id pertaining to the creative assets product group.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsCreativeAssetsProductGroupCreateRequest` generated from model 'CatalogsCreativeAssetsProductGroupCreateRequest'
-- Request object for creating a creative assets product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductGroupCreateRequest` (
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `name` TEXT NOT NULL,
  `description` TEXT DEFAULT NULL,
  `filters` TEXT NOT NULL,
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog id pertaining to the creative assets product group.'
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
  `MEDIA_TYPE` TEXT NOT NULL
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
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `total` DECIMAL(20, 9) UNSIGNED NOT NULL,
  `videos` DECIMAL(20, 9) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Product counts for a Creative Assets CatalogsProductGroup';

--
-- Table structure for table `CatalogsCreativeAssetsProductGroupUpdateRequest` generated from model 'CatalogsCreativeAssetsProductGroupUpdateRequest'
-- Request object for updating a creative assets product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductGroupUpdateRequest` (
  `catalog_type` ENUM('CREATIVE_ASSETS') DEFAULT NULL,
  `name` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `filters` TEXT DEFAULT NULL
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
-- Table structure for table `CatalogsDbItem` generated from model 'CatalogsDbItem'
--

CREATE TABLE IF NOT EXISTS `CatalogsDbItem` (
  `created_at` DATETIME NOT NULL,
  `id` TEXT NOT NULL,
  `updated_at` DATETIME NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

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
  `operation` ENUM('DELETE') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An item to be deleted';

--
-- Table structure for table `CatalogsFeed` generated from model 'CatalogsFeed'
-- Catalogs Feed object
--

CREATE TABLE IF NOT EXISTS `CatalogsFeed` (
  `created_at` DATETIME NOT NULL,
  `id` TEXT NOT NULL,
  `updated_at` DATETIME NOT NULL,
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.',
  `format` TEXT NOT NULL,
  `catalog_type` TEXT NOT NULL,
  `credentials` TEXT NOT NULL,
  `location` TEXT NOT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `preferred_processing_schedule` TEXT NOT NULL,
  `status` TEXT NOT NULL,
  `default_currency` TEXT NOT NULL,
  `default_locale` TEXT NOT NULL COMMENT 'The locale used within a feed for product descriptions.',
  `default_country` TEXT NOT NULL,
  `default_availability` TEXT NOT NULL,
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Catalogs Feed object';

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
  `id` TEXT NOT NULL,
  `feed_id` TEXT NOT NULL,
  `created_at` DATETIME NOT NULL,
  `status` TEXT NOT NULL
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
  `LINE_LEVEL_INTERNAL_ERROR` INT DEFAULT NULL COMMENT 'We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.',
  `LARGE_PRODUCT_COUNT_DECREASE` ENUM('1') DEFAULT NULL COMMENT 'The product count has decreased by more than 99% compared to the last successful ingestion.',
  `ACCOUNT_FLAGGED` INT DEFAULT NULL COMMENT 'We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.',
  `IMAGE_LEVEL_INTERNAL_ERROR` INT DEFAULT NULL COMMENT 'We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.',
  `IMAGE_FILE_NOT_ACCESSIBLE` INT DEFAULT NULL COMMENT 'Image files are unreadable. Please upload new files to continue.',
  `IMAGE_MALFORMED_URL` INT DEFAULT NULL COMMENT 'Image files are unreadable. Please check your link and upload new files to continue.',
  `IMAGE_FILE_NOT_FOUND` INT DEFAULT NULL COMMENT 'Image files are unreadable. Please upload new files to continue.',
  `IMAGE_INVALID_FILE` INT DEFAULT NULL COMMENT 'Image files are unreadable. Please upload new files to continue.'
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
  `ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR` INT DEFAULT NULL COMMENT 'We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.',
  `ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE` INT DEFAULT NULL COMMENT 'Additional image files are unreadable. Please upload new files to continue.',
  `ADDITIONAL_IMAGE_MALFORMED_URL` INT DEFAULT NULL COMMENT 'Additional image files are unreadable. Please check your link and upload new files to continue.',
  `ADDITIONAL_IMAGE_FILE_NOT_FOUND` INT DEFAULT NULL COMMENT 'Additional image files are unreadable. Please upload new files to continue.',
  `ADDITIONAL_IMAGE_INVALID_FILE` INT DEFAULT NULL COMMENT 'Additional image files are unreadable. Please upload new files to continue.',
  `HOTEL_PRICE_HEADER_IS_PRESENT` INT DEFAULT NULL COMMENT 'price is not a supported column. Use base_price and sale_price instead.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsFeedProcessingResult` generated from model 'CatalogsFeedProcessingResult'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedProcessingResult` (
  `created_at` DATETIME NOT NULL,
  `id` TEXT NOT NULL,
  `updated_at` DATETIME NOT NULL,
  `ingestion_details` TEXT NOT NULL,
  `status` TEXT NOT NULL,
  `product_counts` TEXT NOT NULL,
  `validation_details` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsFeedProcessingSchedule` generated from model 'CatalogsFeedProcessingSchedule'
-- Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedProcessingSchedule` (
  `time` TEXT NOT NULL COMMENT 'A time in format HH:MM with leading 0 (zero)',
  `timezone` ENUM('Africa/Abidjan', 'Africa/Accra', 'Africa/Algiers', 'Africa/Bissau', 'Africa/Cairo', 'Africa/Casablanca', 'Africa/Ceuta', 'Africa/El_Aaiun', 'Africa/Johannesburg', 'Africa/Juba', 'Africa/Khartoum', 'Africa/Lagos', 'Africa/Maputo', 'Africa/Monrovia', 'Africa/Nairobi', 'Africa/Ndjamena', 'Africa/Sao_Tome', 'Africa/Tripoli', 'Africa/Tunis', 'Africa/Windhoek', 'America/Adak', 'America/Anchorage', 'America/Araguaina', 'America/Argentina/Buenos_Aires', 'America/Argentina/Catamarca', 'America/Argentina/Cordoba', 'America/Argentina/Jujuy', 'America/Argentina/La_Rioja', 'America/Argentina/Mendoza', 'America/Argentina/Rio_Gallegos', 'America/Argentina/Salta', 'America/Argentina/San_Juan', 'America/Argentina/San_Luis', 'America/Argentina/Tucuman', 'America/Argentina/Ushuaia', 'America/Asuncion', 'America/Atikokan', 'America/Bahia', 'America/Bahia_Banderas', 'America/Barbados', 'America/Belem', 'America/Belize', 'America/Blanc-Sablon', 'America/Boa_Vista', 'America/Bogota', 'America/Boise', 'America/Cambridge_Bay', 'America/Campo_Grande', 'America/Cancun', 'America/Caracas', 'America/Cayenne', 'America/Chicago', 'America/Chihuahua', 'America/Costa_Rica', 'America/Creston', 'America/Cuiaba', 'America/Curacao', 'America/Danmarkshavn', 'America/Dawson', 'America/Dawson_Creek', 'America/Denver', 'America/Detroit', 'America/Edmonton', 'America/Eirunepe', 'America/El_Salvador', 'America/Fort_Nelson', 'America/Fortaleza', 'America/Glace_Bay', 'America/Goose_Bay', 'America/Grand_Turk', 'America/Guatemala', 'America/Guayaquil', 'America/Guyana', 'America/Halifax', 'America/Havana', 'America/Hermosillo', 'America/Indiana/Indianapolis', 'America/Indiana/Knox', 'America/Indiana/Marengo', 'America/Indiana/Petersburg', 'America/Indiana/Tell_City', 'America/Indiana/Vevay', 'America/Indiana/Vincennes', 'America/Indiana/Winamac', 'America/Inuvik', 'America/Iqaluit', 'America/Jamaica', 'America/Juneau', 'America/Kentucky/Louisville', 'America/Kentucky/Monticello', 'America/La_Paz', 'America/Lima', 'America/Los_Angeles', 'America/Maceio', 'America/Managua', 'America/Manaus', 'America/Martinique', 'America/Matamoros', 'America/Mazatlan', 'America/Menominee', 'America/Merida', 'America/Metlakatla', 'America/Mexico_City', 'America/Miquelon', 'America/Moncton', 'America/Monterrey', 'America/Montevideo', 'America/Nassau', 'America/New_York', 'America/Nipigon', 'America/Nome', 'America/Noronha', 'America/North_Dakota/Beulah', 'America/North_Dakota/Center', 'America/North_Dakota/New_Salem', 'America/Nuuk', 'America/Ojinaga', 'America/Panama', 'America/Pangnirtung', 'America/Paramaribo', 'America/Phoenix', 'America/Port-au-Prince', 'America/Port_of_Spain', 'America/Porto_Velho', 'America/Puerto_Rico', 'America/Punta_Arenas', 'America/Rainy_River', 'America/Rankin_Inlet', 'America/Recife', 'America/Regina', 'America/Resolute', 'America/Rio_Branco', 'America/Santarem', 'America/Santiago', 'America/Santo_Domingo', 'America/Sao_Paulo', 'America/Scoresbysund', 'America/Sitka', 'America/St_Johns', 'America/Swift_Current', 'America/Tegucigalpa', 'America/Thule', 'America/Thunder_Bay', 'America/Tijuana', 'America/Toronto', 'America/Vancouver', 'America/Whitehorse', 'America/Winnipeg', 'America/Yakutat', 'America/Yellowknife', 'Antarctica/Casey', 'Antarctica/Davis', 'Antarctica/DumontDUrville', 'Antarctica/Macquarie', 'Antarctica/Mawson', 'Antarctica/Palmer', 'Antarctica/Rothera', 'Antarctica/Syowa', 'Antarctica/Troll', 'Antarctica/Vostok', 'Asia/Almaty', 'Asia/Amman', 'Asia/Anadyr', 'Asia/Aqtau', 'Asia/Aqtobe', 'Asia/Ashgabat', 'Asia/Atyrau', 'Asia/Baghdad', 'Asia/Baku', 'Asia/Bangkok', 'Asia/Barnaul', 'Asia/Beirut', 'Asia/Bishkek', 'Asia/Brunei', 'Asia/Chita', 'Asia/Choibalsan', 'Asia/Colombo', 'Asia/Damascus', 'Asia/Dhaka', 'Asia/Dili', 'Asia/Dubai', 'Asia/Dushanbe', 'Asia/Famagusta', 'Asia/Gaza', 'Asia/Hebron', 'Asia/Ho_Chi_Minh', 'Asia/Hong_Kong', 'Asia/Hovd', 'Asia/Irkutsk', 'Asia/Jakarta', 'Asia/Jayapura', 'Asia/Jerusalem', 'Asia/Kabul', 'Asia/Kamchatka', 'Asia/Karachi', 'Asia/Kathmandu', 'Asia/Khandyga', 'Asia/Kolkata', 'Asia/Krasnoyarsk', 'Asia/Kuala_Lumpur', 'Asia/Kuching', 'Asia/Macau', 'Asia/Magadan', 'Asia/Makassar', 'Asia/Manila', 'Asia/Nicosia', 'Asia/Novokuznetsk', 'Asia/Novosibirsk', 'Asia/Omsk', 'Asia/Oral', 'Asia/Pontianak', 'Asia/Pyongyang', 'Asia/Qatar', 'Asia/Qostanay', 'Asia/Qyzylorda', 'Asia/Riyadh', 'Asia/Sakhalin', 'Asia/Samarkand', 'Asia/Seoul', 'Asia/Shanghai', 'Asia/Singapore', 'Asia/Srednekolymsk', 'Asia/Taipei', 'Asia/Tashkent', 'Asia/Tbilisi', 'Asia/Tehran', 'Asia/Thimphu', 'Asia/Tokyo', 'Asia/Tomsk', 'Asia/Ulaanbaatar', 'Asia/Urumqi', 'Asia/Ust-Nera', 'Asia/Vladivostok', 'Asia/Yakutsk', 'Asia/Yangon', 'Asia/Yekaterinburg', 'Asia/Yerevan', 'Atlantic/Azores', 'Atlantic/Bermuda', 'Atlantic/Canary', 'Atlantic/Cape_Verde', 'Atlantic/Faroe', 'Atlantic/Madeira', 'Atlantic/Reykjavik', 'Atlantic/South_Georgia', 'Atlantic/Stanley', 'Australia/Adelaide', 'Australia/Brisbane', 'Australia/Broken_Hill', 'Australia/Currie', 'Australia/Darwin', 'Australia/Eucla', 'Australia/Hobart', 'Australia/Lindeman', 'Australia/Lord_Howe', 'Australia/Melbourne', 'Australia/Perth', 'Australia/Sydney', 'CET', 'CST6CDT', 'EET', 'EST', 'EST5EDT', 'Etc/GMT', 'Etc/GMT+1', 'Etc/GMT+10', 'Etc/GMT+11', 'Etc/GMT+12', 'Etc/GMT+2', 'Etc/GMT+3', 'Etc/GMT+4', 'Etc/GMT+5', 'Etc/GMT+6', 'Etc/GMT+7', 'Etc/GMT+8', 'Etc/GMT+9', 'Etc/GMT-1', 'Etc/GMT-10', 'Etc/GMT-11', 'Etc/GMT-12', 'Etc/GMT-13', 'Etc/GMT-14', 'Etc/GMT-2', 'Etc/GMT-3', 'Etc/GMT-4', 'Etc/GMT-5', 'Etc/GMT-6', 'Etc/GMT-7', 'Etc/GMT-8', 'Etc/GMT-9', 'Etc/UTC', 'Europe/Amsterdam', 'Europe/Andorra', 'Europe/Astrakhan', 'Europe/Athens', 'Europe/Belgrade', 'Europe/Berlin', 'Europe/Brussels', 'Europe/Bucharest', 'Europe/Budapest', 'Europe/Chisinau', 'Europe/Copenhagen', 'Europe/Dublin', 'Europe/Gibraltar', 'Europe/Helsinki', 'Europe/Istanbul', 'Europe/Kaliningrad', 'Europe/Kiev', 'Europe/Kirov', 'Europe/Lisbon', 'Europe/London', 'Europe/Luxembourg', 'Europe/Madrid', 'Europe/Malta', 'Europe/Minsk', 'Europe/Monaco', 'Europe/Moscow', 'Europe/Oslo', 'Europe/Paris', 'Europe/Prague', 'Europe/Riga', 'Europe/Rome', 'Europe/Samara', 'Europe/Saratov', 'Europe/Simferopol', 'Europe/Sofia', 'Europe/Stockholm', 'Europe/Tallinn', 'Europe/Tirane', 'Europe/Ulyanovsk', 'Europe/Uzhgorod', 'Europe/Vienna', 'Europe/Vilnius', 'Europe/Volgograd', 'Europe/Warsaw', 'Europe/Zaporozhye', 'Europe/Zurich', 'HST', 'Indian/Chagos', 'Indian/Christmas', 'Indian/Cocos', 'Indian/Kerguelen', 'Indian/Mahe', 'Indian/Maldives', 'Indian/Mauritius', 'Indian/Reunion', 'MET', 'MST', 'MST7MDT', 'PST8PDT', 'Pacific/Apia', 'Pacific/Auckland', 'Pacific/Bougainville', 'Pacific/Chatham', 'Pacific/Chuuk', 'Pacific/Easter', 'Pacific/Efate', 'Pacific/Enderbury', 'Pacific/Fakaofo', 'Pacific/Fiji', 'Pacific/Funafuti', 'Pacific/Galapagos', 'Pacific/Gambier', 'Pacific/Guadalcanal', 'Pacific/Guam', 'Pacific/Honolulu', 'Pacific/Kiritimati', 'Pacific/Kosrae', 'Pacific/Kwajalein', 'Pacific/Majuro', 'Pacific/Marquesas', 'Pacific/Nauru', 'Pacific/Niue', 'Pacific/Norfolk', 'Pacific/Noumea', 'Pacific/Pago_Pago', 'Pacific/Palau', 'Pacific/Pitcairn', 'Pacific/Pohnpei', 'Pacific/Port_Moresby', 'Pacific/Rarotonga', 'Pacific/Tahiti', 'Pacific/Tarawa', 'Pacific/Tongatapu', 'Pacific/Wake', 'Pacific/Wallis', 'WET', 'null') NOT NULL COMMENT 'The timezone considered for the processing schedule time.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).';

--
-- Table structure for table `CatalogsFeedProductCounts` generated from model 'CatalogsFeedProductCounts'
-- The counts can be null early in the process.
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedProductCounts` (
  `original` INT DEFAULT NULL COMMENT 'The number of products in the feed file.',
  `ingested` INT DEFAULT NULL COMMENT 'The number of products successfully ingested from the feed file.'
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
  `FETCH_ERROR` INT DEFAULT NULL COMMENT 'Pinterest couldn&#39;t download your feed.',
  `FETCH_INACTIVE_FEED_ERROR` INT DEFAULT NULL COMMENT 'Your feed wasn&#39;t ingested because it hasn’t changed in the previous 90 days.',
  `ENCODING_ERROR` INT DEFAULT NULL COMMENT 'Your feed includes data with an unsupported encoding format.',
  `DELIMITER_ERROR` INT DEFAULT NULL COMMENT 'Your feed includes data with formatting errors.',
  `REQUIRED_COLUMNS_MISSING` INT DEFAULT NULL COMMENT 'Your feed is missing some required column headers.',
  `DUPLICATE_PRODUCTS` INT DEFAULT NULL COMMENT 'Some products are duplicated.',
  `IMAGE_LINK_INVALID` INT DEFAULT NULL COMMENT 'Some image links are formatted incorrectly.',
  `ITEMID_MISSING` INT DEFAULT NULL COMMENT 'Some items are missing an item id in their product metadata, those items will not be published.',
  `TITLE_MISSING` INT DEFAULT NULL COMMENT 'Some items are missing a title in their product metadata, those items will not be published.',
  `DESCRIPTION_MISSING` INT DEFAULT NULL COMMENT 'Some items are missing a description in their product metadata, those items will not be published.',
  `PRODUCT_LINK_MISSING` INT DEFAULT NULL COMMENT 'Some items are missing a link URL in their product metadata, those items will not be published.',
  `IMAGE_LINK_MISSING` INT DEFAULT NULL COMMENT 'Some items are missing an image link URL in their product metadata, those items will not be published.',
  `AVAILABILITY_INVALID` INT DEFAULT NULL COMMENT 'Some items are missing an availability value in their product metadata, those items will not be published.',
  `PRODUCT_PRICE_INVALID` INT DEFAULT NULL COMMENT 'Some items have price formatting errors in their product metadata, those items will not be published.',
  `LINK_FORMAT_INVALID` INT DEFAULT NULL COMMENT 'Some link values are formatted incorrectly.',
  `PARSE_LINE_ERROR` INT DEFAULT NULL COMMENT 'Your feed contains formatting errors for some items.',
  `ADWORDS_FORMAT_INVALID` INT DEFAULT NULL COMMENT 'Some adwords links contain too many characters.',
  `INTERNAL_SERVICE_ERROR` INT DEFAULT NULL COMMENT 'We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.',
  `NO_VERIFIED_DOMAIN` INT DEFAULT NULL COMMENT 'Your merchant domain needs to be claimed.',
  `ADULT_INVALID` INT DEFAULT NULL COMMENT 'Some items have invalid adult values.',
  `IMAGE_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Some items have image_link URLs that contain too many characters, so those items will not be published.',
  `INVALID_DOMAIN` INT DEFAULT NULL COMMENT 'Some of your product link values don&#39;t match the verified domain associated with this account.',
  `FEED_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Your feed contains too many items, some items will not be published.',
  `LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Some product links contain too many characters, those items will not be published.',
  `MALFORMED_XML` INT DEFAULT NULL COMMENT 'Your feed couldn&#39;t be validated because the xml file is formatted incorrectly.',
  `PRICE_MISSING` INT DEFAULT NULL COMMENT 'Some products are missing a price, those items will not be published.',
  `FEED_TOO_SMALL` INT DEFAULT NULL COMMENT 'Your feed couldn&#39;t be validated because the file doesn&#39;t contain the minimum number of lines required.',
  `MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED` INT DEFAULT NULL COMMENT 'Some items exceed the maximum number of items per item group, those items will not be published.',
  `ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` INT DEFAULT NULL COMMENT 'Some items&#39; main images can&#39;t be found.',
  `PINJOIN_CONTENT_UNSAFE` INT DEFAULT NULL COMMENT 'Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines.',
  `BLOCKLISTED_IMAGE_SIGNATURE` INT DEFAULT NULL COMMENT 'Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines.',
  `LIST_PRICE_INVALID` INT DEFAULT NULL COMMENT 'Some items have list price formatting errors in their product metadata, those items will not be published.',
  `PRICE_CANNOT_BE_DETERMINED` INT DEFAULT NULL COMMENT 'Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsFeedValidationWarnings` generated from model 'CatalogsFeedValidationWarnings'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedValidationWarnings` (
  `AD_LINK_FORMAT_WARNING` INT DEFAULT NULL COMMENT 'Some items have ad links that are formatted incorrectly.',
  `AD_LINK_SAME_AS_LINK` INT DEFAULT NULL COMMENT 'Some items have ad link URLs that are duplicates of the link URLs for those items.',
  `TITLE_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'The title for some items were truncated because they contain too many characters.',
  `DESCRIPTION_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'The description for some items were truncated because they contain too many characters.',
  `GENDER_INVALID` INT DEFAULT NULL COMMENT 'Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.',
  `AGE_GROUP_INVALID` INT DEFAULT NULL COMMENT 'Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.',
  `SIZE_TYPE_INVALID` INT DEFAULT NULL COMMENT 'Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.',
  `SIZE_SYSTEM_INVALID` INT DEFAULT NULL COMMENT 'Some items have size system values which are not one of the supported size systems.',
  `LINK_FORMAT_WARNING` INT DEFAULT NULL COMMENT 'Some items have an invalid product link which contains invalid UTM tracking paramaters.',
  `SALES_PRICE_INVALID` INT DEFAULT NULL COMMENT 'Some items have sale price values that are higher than the original price of the item.',
  `PRODUCT_CATEGORY_DEPTH_WARNING` INT DEFAULT NULL COMMENT 'Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.',
  `ADWORDS_FORMAT_WARNING` INT DEFAULT NULL COMMENT 'Some items have adwords_redirect links that are formatted incorrectly.',
  `ADWORDS_SAME_AS_LINK` INT DEFAULT NULL COMMENT 'Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.',
  `DUPLICATE_HEADERS` INT DEFAULT NULL COMMENT 'Your feed contains duplicate headers.',
  `FETCH_SAME_SIGNATURE` ENUM('1') DEFAULT NULL COMMENT 'Ingestion completed early because there are no changes to your feed since the last successful update.',
  `ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Some items have additional_image_link URLs that contain too many characters, so those items will not be published.',
  `ADDITIONAL_IMAGE_LINK_WARNING` INT DEFAULT NULL COMMENT 'Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.',
  `IMAGE_LINK_WARNING` INT DEFAULT NULL COMMENT 'Some items have image_link URLs that are formatted incorrectly and will not be published with those items.',
  `SHIPPING_INVALID` INT DEFAULT NULL COMMENT 'Some items have shipping values that are formatted incorrectly.',
  `TAX_INVALID` INT DEFAULT NULL COMMENT 'Some items have tax values that are formatted incorrectly.',
  `SHIPPING_WEIGHT_INVALID` INT DEFAULT NULL COMMENT 'Some items have invalid shipping_weight values.',
  `EXPIRATION_DATE_INVALID` INT DEFAULT NULL COMMENT 'Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.',
  `AVAILABILITY_DATE_INVALID` INT DEFAULT NULL COMMENT 'Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.',
  `SALE_DATE_INVALID` INT DEFAULT NULL COMMENT 'Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.',
  `WEIGHT_UNIT_INVALID` INT DEFAULT NULL COMMENT 'Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.',
  `IS_BUNDLE_INVALID` INT DEFAULT NULL COMMENT 'Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.',
  `UPDATED_TIME_INVALID` INT DEFAULT NULL COMMENT 'Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.',
  `CUSTOM_LABEL_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Some items have custom_label values that are too long, those items will be published without that custom label.',
  `PRODUCT_TYPE_LENGTH_TOO_LONG` INT DEFAULT NULL COMMENT 'Some items have product_type values that are too long, those items will be published without that product type.',
  `TOO_MANY_ADDITIONAL_IMAGE_LINKS` INT DEFAULT NULL COMMENT 'Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.',
  `MULTIPACK_INVALID` INT DEFAULT NULL COMMENT 'Some items have invalid multipack values.',
  `INDEXED_PRODUCT_COUNT_LARGE_DELTA` INT DEFAULT NULL COMMENT 'The product count has increased or decreased significantly compared to the last successful ingestion.',
  `ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE` INT DEFAULT NULL COMMENT 'Some items include additional_image_links that can&#39;t be found.',
  `OPTIONAL_PRODUCT_CATEGORY_MISSING` INT DEFAULT NULL COMMENT 'Some items are missing a google_product_category.',
  `OPTIONAL_PRODUCT_CATEGORY_INVALID` INT DEFAULT NULL COMMENT 'Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.',
  `OPTIONAL_CONDITION_MISSING` INT DEFAULT NULL COMMENT 'Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.',
  `OPTIONAL_CONDITION_INVALID` INT DEFAULT NULL COMMENT 'Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.',
  `IOS_DEEP_LINK_INVALID` INT DEFAULT NULL COMMENT 'Some items include invalid ios_deep_link values.',
  `ANDROID_DEEP_LINK_INVALID` INT DEFAULT NULL COMMENT 'Some items include invalid android_deep_link.',
  `UTM_SOURCE_AUTO_CORRECTED` INT DEFAULT NULL COMMENT 'Some items include utm_source values that are formatted incorrectly and have been automatically corrected.',
  `COUNTRY_DOES_NOT_MAP_TO_CURRENCY` INT DEFAULT NULL COMMENT 'Some items include a currency that doesn&#39;t match the usual currency for the location where that product is sold or shipped.',
  `MIN_AD_PRICE_INVALID` INT DEFAULT NULL COMMENT 'Some items include min_ad_price values that are formatted incorrectly.',
  `GTIN_INVALID` INT DEFAULT NULL COMMENT 'Some items include incorrectly formatted GTINs.',
  `INCONSISTENT_CURRENCY_VALUES` INT DEFAULT NULL COMMENT 'Some items include inconsistent currencies in price fields.',
  `SALES_PRICE_TOO_LOW` INT DEFAULT NULL COMMENT 'Some items include sales price that is much lower than the list price.',
  `SHIPPING_WIDTH_INVALID` INT DEFAULT NULL COMMENT 'Some items include incorrectly formatted shipping_width.',
  `SHIPPING_HEIGHT_INVALID` INT DEFAULT NULL COMMENT 'Some items include incorrectly formatted shipping_height.',
  `SALES_PRICE_TOO_HIGH` INT DEFAULT NULL COMMENT 'Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.',
  `MPN_INVALID` INT DEFAULT NULL COMMENT 'Some items include incorrectly formatted MPNs.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsFeedsCreateRequest` generated from model 'CatalogsFeedsCreateRequest'
-- Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedsCreateRequest` (
  `default_currency` TEXT DEFAULT NULL,
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `format` TEXT NOT NULL,
  `default_locale` TEXT DEFAULT NULL,
  `credentials` TEXT DEFAULT NULL,
  `location` TEXT NOT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `default_country` TEXT DEFAULT NULL,
  `default_availability` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL
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
-- Table structure for table `CatalogsHotelAddress` generated from model 'CatalogsHotelAddress'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelAddress` (
  `addr1` TEXT DEFAULT NULL COMMENT 'Primary street address of hotel.',
  `city` TEXT DEFAULT NULL COMMENT 'City where the hotel is located.',
  `region` TEXT DEFAULT NULL COMMENT 'State, county, province, where the hotel is located.',
  `country` TEXT DEFAULT NULL COMMENT 'Country where the hotel is located.',
  `postal_code` TEXT DEFAULT NULL COMMENT 'Required for countries with a postal code system. Postal or zip code of the hotel.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsHotelAttributes` generated from model 'CatalogsHotelAttributes'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelAttributes` (
  `name` TEXT DEFAULT NULL COMMENT 'The hotel&#39;s name.',
  `link` TEXT DEFAULT NULL COMMENT 'Link to the product page',
  `description` TEXT DEFAULT NULL COMMENT 'Brief description of the hotel.',
  `brand` TEXT DEFAULT NULL COMMENT 'The brand to which this hotel belongs to.',
  `latitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Latitude of the hotel.',
  `longitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Longitude of the hotel.',
  `neighborhood` JSON DEFAULT NULL COMMENT 'A list of neighborhoods where the hotel is located',
  `address` TEXT DEFAULT NULL,
  `custom_label_0` TEXT DEFAULT NULL COMMENT 'Custom grouping of hotels',
  `custom_label_1` TEXT DEFAULT NULL COMMENT 'Custom grouping of hotels',
  `custom_label_2` TEXT DEFAULT NULL COMMENT 'Custom grouping of hotels',
  `custom_label_3` TEXT DEFAULT NULL COMMENT 'Custom grouping of hotels',
  `custom_label_4` TEXT DEFAULT NULL COMMENT 'Custom grouping of hotels',
  `category` TEXT DEFAULT NULL COMMENT 'The type of property. The category can be any type of internal description desired.',
  `base_price` TEXT DEFAULT NULL COMMENT 'Base price of the hotel room per night followed by the ISO currency code',
  `sale_price` TEXT DEFAULT NULL COMMENT 'Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.',
  `guest_ratings` TEXT DEFAULT NULL,
  `main_image` TEXT DEFAULT NULL,
  `additional_image_link` JSON DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.&lt;/p&gt;'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsHotelAttributes_allOf_main_image` generated from model 'CatalogsHotelAttributesUnderscoreallOfUnderscoremainUnderscoreimage'
-- The main hotel image
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelAttributes_allOf_main_image` (
  `link` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.&lt;/p&gt;',
  `tag` JSON DEFAULT NULL COMMENT 'Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The main hotel image';

--
-- Table structure for table `CatalogsHotelBatchItem` generated from model 'CatalogsHotelBatchItem'
-- Hotel batch item
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelBatchItem` (
  `hotel_id` TEXT NOT NULL COMMENT 'The catalog hotel id in the merchant namespace',
  `operation` ENUM('DELETE') NOT NULL,
  `attributes` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Hotel batch item';

--
-- Table structure for table `CatalogsHotelBatchRequest` generated from model 'CatalogsHotelBatchRequest'
-- Request object to update catalogs hotel items
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelBatchRequest` (
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `country` TEXT NOT NULL,
  `language` TEXT NOT NULL,
  `items` JSON NOT NULL COMMENT 'Array with catalogs item operations',
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object to update catalogs hotel items';

--
-- Table structure for table `CatalogsHotelFeed` generated from model 'CatalogsHotelFeed'
-- Catalogs Hotel Feed object
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelFeed` (
  `created_at` DATETIME NOT NULL,
  `id` TEXT NOT NULL,
  `updated_at` DATETIME NOT NULL,
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.',
  `format` TEXT NOT NULL,
  `catalog_type` TEXT NOT NULL,
  `credentials` TEXT NOT NULL,
  `location` TEXT NOT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `preferred_processing_schedule` TEXT NOT NULL,
  `status` TEXT NOT NULL,
  `default_currency` TEXT NOT NULL,
  `default_locale` TEXT NOT NULL COMMENT 'The locale used within a feed for product descriptions.',
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Catalogs Hotel Feed object';

--
-- Table structure for table `CatalogsHotelFeedsCreateRequest` generated from model 'CatalogsHotelFeedsCreateRequest'
-- Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelFeedsCreateRequest` (
  `default_currency` TEXT DEFAULT NULL,
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `format` TEXT NOT NULL,
  `default_locale` TEXT NOT NULL,
  `credentials` TEXT DEFAULT NULL,
  `location` TEXT NOT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `catalog_type` TEXT NOT NULL,
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.',
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.';

--
-- Table structure for table `CatalogsHotelFeedsUpdateRequest` generated from model 'CatalogsHotelFeedsUpdateRequest'
-- Request object for updating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelFeedsUpdateRequest` (
  `default_currency` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `format` TEXT DEFAULT NULL,
  `credentials` TEXT DEFAULT NULL,
  `location` TEXT DEFAULT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL,
  `catalog_type` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for updating a feed.';

--
-- Table structure for table `CatalogsHotelGuestRatings` generated from model 'CatalogsHotelGuestRatings'
-- If specified, you must provide all properties
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelGuestRatings` (
  `score` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Your hotel&#39;s rating.',
  `number_of_reviewers` INT DEFAULT NULL COMMENT 'Total number of people who have rated this hotel.',
  `max_score` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Max value for the hotel rating score.',
  `rating_system` TEXT DEFAULT NULL COMMENT 'System you use for guest reviews.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='If specified, you must provide all properties';

--
-- Table structure for table `CatalogsHotelItemErrorResponse` generated from model 'CatalogsHotelItemErrorResponse'
-- Object describing a hotel item error
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelItemErrorResponse` (
  `catalog_type` TEXT NOT NULL,
  `hotel_id` TEXT DEFAULT NULL COMMENT 'The catalog hotel id in the merchant namespace',
  `errors` JSON DEFAULT NULL COMMENT 'Array with the errors for the item id requested'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing a hotel item error';

--
-- Table structure for table `CatalogsHotelItemResponse` generated from model 'CatalogsHotelItemResponse'
-- Object describing a hotel record
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelItemResponse` (
  `catalog_type` TEXT NOT NULL,
  `hotel_id` TEXT DEFAULT NULL COMMENT 'The catalog hotel id in the merchant namespace',
  `pins` JSON DEFAULT NULL COMMENT 'The pins mapped to the item',
  `attributes` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing a hotel record';

--
-- Table structure for table `CatalogsHotelItemsBatch` generated from model 'CatalogsHotelItemsBatch'
-- Object describing the catalogs hotel items batch
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelItemsBatch` (
  `batch_id` TEXT DEFAULT NULL COMMENT 'Id of the catalogs items batch',
  `created_time` DATETIME DEFAULT NULL COMMENT 'Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss',
  `completed_time` DATETIME DEFAULT NULL COMMENT 'Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss',
  `status` TEXT DEFAULT NULL,
  `catalog_type` TEXT NOT NULL,
  `items` JSON DEFAULT NULL COMMENT 'Array with the catalogs items processing records part of the catalogs items batch'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing the catalogs hotel items batch';

--
-- Table structure for table `CatalogsHotelItemsFilter` generated from model 'CatalogsHotelItemsFilter'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelItemsFilter` (
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `hotel_ids` JSON NOT NULL,
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsHotelItemsPostFilter` generated from model 'CatalogsHotelItemsPostFilter'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelItemsPostFilter` (
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `hotel_ids` JSON NOT NULL,
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsHotelListProductsByCatalogBasedFilterRequest` generated from model 'CatalogsHotelListProductsByCatalogBasedFilterRequest'
-- Request object to list products for a given hotel catalog_id and product group filter.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelListProductsByCatalogBasedFilterRequest` (
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog id pertaining to the hotel product group.',
  `filters` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object to list products for a given hotel catalog_id and product group filter.';

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
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `id` TEXT NOT NULL COMMENT 'ID of the hotel product group.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of hotel product group',
  `description` TEXT DEFAULT NULL,
  `filters` TEXT NOT NULL,
  `created_at` INT DEFAULT NULL COMMENT 'Unix timestamp in seconds of when catalog product group was created.',
  `updated_at` INT DEFAULT NULL COMMENT 'Unix timestamp in seconds of last time catalog product group was updated.',
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog id pertaining to the hotel product group.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsHotelProductGroupCreateRequest` generated from model 'CatalogsHotelProductGroupCreateRequest'
-- Request object for creating a hotel product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroupCreateRequest` (
  `catalog_type` ENUM('HOTEL') NOT NULL,
  `name` TEXT NOT NULL,
  `description` TEXT DEFAULT NULL,
  `filters` TEXT NOT NULL,
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog id pertaining to the hotel product group.'
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
  `COUNTRY` TEXT NOT NULL
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
  `name` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `filters` TEXT DEFAULT NULL
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
-- Table structure for table `CatalogsHotelReportParameters_report` generated from model 'CatalogsHotelReportParametersUnderscorereport'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelReportParameters_report` (
  `report_type` ENUM('FEED_INGESTION_ISSUES', 'DISTRIBUTION_ISSUES') DEFAULT NULL,
  `feed_id` TEXT NOT NULL COMMENT 'ID of the feed entity.',
  `processing_result_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.',
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a catalog. If not given, oldest catalog will be used'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsItemValidationDetails` generated from model 'CatalogsItemValidationDetails'
--

CREATE TABLE IF NOT EXISTS `CatalogsItemValidationDetails` (
  `attribute_name` TEXT NOT NULL,
  `provided_value` TEXT NOT NULL COMMENT 'Provided value that caused the validation issue.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsItemValidationErrors` generated from model 'CatalogsItemValidationErrors'
--

CREATE TABLE IF NOT EXISTS `CatalogsItemValidationErrors` (
  `ADULT_INVALID` TEXT DEFAULT NULL,
  `ADWORDS_FORMAT_INVALID` TEXT DEFAULT NULL,
  `AVAILABILITY_INVALID` TEXT DEFAULT NULL,
  `BLOCKLISTED_IMAGE_SIGNATURE` TEXT DEFAULT NULL,
  `DESCRIPTION_MISSING` TEXT DEFAULT NULL,
  `DUPLICATE_PRODUCTS` TEXT DEFAULT NULL,
  `IMAGE_LINK_INVALID` TEXT DEFAULT NULL,
  `IMAGE_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL,
  `IMAGE_LINK_MISSING` TEXT DEFAULT NULL,
  `INVALID_DOMAIN` TEXT DEFAULT NULL,
  `ITEMID_MISSING` TEXT DEFAULT NULL,
  `ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` TEXT DEFAULT NULL,
  `LINK_FORMAT_INVALID` TEXT DEFAULT NULL,
  `LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL,
  `LIST_PRICE_INVALID` TEXT DEFAULT NULL,
  `MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED` TEXT DEFAULT NULL,
  `PARSE_LINE_ERROR` TEXT DEFAULT NULL,
  `PINJOIN_CONTENT_UNSAFE` TEXT DEFAULT NULL,
  `PRICE_CANNOT_BE_DETERMINED` TEXT DEFAULT NULL,
  `PRICE_MISSING` TEXT DEFAULT NULL,
  `PRODUCT_LINK_MISSING` TEXT DEFAULT NULL,
  `PRODUCT_PRICE_INVALID` TEXT DEFAULT NULL,
  `TITLE_MISSING` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsItemValidationIssues` generated from model 'CatalogsItemValidationIssues'
--

CREATE TABLE IF NOT EXISTS `CatalogsItemValidationIssues` (
  `item_number` INT NOT NULL COMMENT 'Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation.',
  `item_id` TEXT NOT NULL COMMENT 'The merchant-created unique ID that represents the product.',
  `errors` TEXT NOT NULL,
  `warnings` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsItemValidationWarnings` generated from model 'CatalogsItemValidationWarnings'
--

CREATE TABLE IF NOT EXISTS `CatalogsItemValidationWarnings` (
  `AD_LINK_FORMAT_WARNING` TEXT DEFAULT NULL,
  `AD_LINK_SAME_AS_LINK` TEXT DEFAULT NULL,
  `ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG` TEXT DEFAULT NULL,
  `ADDITIONAL_IMAGE_LINK_WARNING` TEXT DEFAULT NULL,
  `ADWORDS_FORMAT_WARNING` TEXT DEFAULT NULL,
  `ADWORDS_SAME_AS_LINK` TEXT DEFAULT NULL,
  `AGE_GROUP_INVALID` TEXT DEFAULT NULL,
  `SIZE_SYSTEM_INVALID` TEXT DEFAULT NULL,
  `ANDROID_DEEP_LINK_INVALID` TEXT DEFAULT NULL,
  `AVAILABILITY_DATE_INVALID` TEXT DEFAULT NULL,
  `COUNTRY_DOES_NOT_MAP_TO_CURRENCY` TEXT DEFAULT NULL,
  `CUSTOM_LABEL_LENGTH_TOO_LONG` TEXT DEFAULT NULL,
  `DESCRIPTION_LENGTH_TOO_LONG` TEXT DEFAULT NULL,
  `EXPIRATION_DATE_INVALID` TEXT DEFAULT NULL,
  `GENDER_INVALID` TEXT DEFAULT NULL,
  `GTIN_INVALID` TEXT DEFAULT NULL,
  `IMAGE_LINK_WARNING` TEXT DEFAULT NULL,
  `IOS_DEEP_LINK_INVALID` TEXT DEFAULT NULL,
  `IS_BUNDLE_INVALID` TEXT DEFAULT NULL,
  `ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE` TEXT DEFAULT NULL,
  `LINK_FORMAT_WARNING` TEXT DEFAULT NULL,
  `MIN_AD_PRICE_INVALID` TEXT DEFAULT NULL,
  `MPN_INVALID` TEXT DEFAULT NULL,
  `MULTIPACK_INVALID` TEXT DEFAULT NULL,
  `OPTIONAL_CONDITION_INVALID` TEXT DEFAULT NULL,
  `OPTIONAL_CONDITION_MISSING` TEXT DEFAULT NULL,
  `OPTIONAL_PRODUCT_CATEGORY_INVALID` TEXT DEFAULT NULL,
  `OPTIONAL_PRODUCT_CATEGORY_MISSING` TEXT DEFAULT NULL,
  `PRODUCT_CATEGORY_DEPTH_WARNING` TEXT DEFAULT NULL,
  `PRODUCT_TYPE_LENGTH_TOO_LONG` TEXT DEFAULT NULL,
  `SALES_PRICE_INVALID` TEXT DEFAULT NULL,
  `SALES_PRICE_TOO_LOW` TEXT DEFAULT NULL,
  `SALES_PRICE_TOO_HIGH` TEXT DEFAULT NULL,
  `SALE_DATE_INVALID` TEXT DEFAULT NULL,
  `SHIPPING_INVALID` TEXT DEFAULT NULL,
  `SHIPPING_HEIGHT_INVALID` TEXT DEFAULT NULL,
  `SHIPPING_WEIGHT_INVALID` TEXT DEFAULT NULL,
  `SHIPPING_WIDTH_INVALID` TEXT DEFAULT NULL,
  `SIZE_TYPE_INVALID` TEXT DEFAULT NULL,
  `TAX_INVALID` TEXT DEFAULT NULL,
  `TITLE_LENGTH_TOO_LONG` TEXT DEFAULT NULL,
  `TOO_MANY_ADDITIONAL_IMAGE_LINKS` TEXT DEFAULT NULL,
  `UTM_SOURCE_AUTO_CORRECTED` TEXT DEFAULT NULL,
  `WEIGHT_UNIT_INVALID` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

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
  `catalog_type` TEXT NOT NULL,
  `batch_id` TEXT DEFAULT NULL COMMENT 'Id of the catalogs items batch',
  `created_time` DATETIME DEFAULT NULL COMMENT 'Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss',
  `completed_time` DATETIME DEFAULT NULL COMMENT 'Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss',
  `status` TEXT DEFAULT NULL,
  `items` JSON DEFAULT NULL COMMENT 'Array with the catalogs items processing records part of the catalogs items batch'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing the catalogs items batch';

--
-- Table structure for table `CatalogsItemsBatchRequest` generated from model 'CatalogsItemsBatchRequest'
-- Request object of catalogs items batch
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsBatchRequest` (
  `country` TEXT NOT NULL,
  `language` TEXT NOT NULL,
  `operation` TEXT NOT NULL,
  `items` JSON NOT NULL COMMENT 'Array with catalogs items'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object of catalogs items batch';

--
-- Table structure for table `CatalogsItemsCreateBatchRequest` generated from model 'CatalogsItemsCreateBatchRequest'
-- Request object to create catalogs items
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsCreateBatchRequest` (
  `country` TEXT NOT NULL,
  `language` TEXT NOT NULL,
  `operation` TEXT NOT NULL,
  `items` JSON NOT NULL COMMENT 'Array with catalogs items'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object to create catalogs items';

--
-- Table structure for table `CatalogsItemsDeleteBatchRequest` generated from model 'CatalogsItemsDeleteBatchRequest'
-- Request object to delete catalogs items
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsDeleteBatchRequest` (
  `country` TEXT NOT NULL,
  `language` TEXT NOT NULL,
  `operation` TEXT NOT NULL,
  `items` JSON NOT NULL COMMENT 'Array with catalogs items'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object to delete catalogs items';

--
-- Table structure for table `CatalogsItemsDeleteDiscontinuedBatchRequest` generated from model 'CatalogsItemsDeleteDiscontinuedBatchRequest'
-- Request object to discontinue catalogs items
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsDeleteDiscontinuedBatchRequest` (
  `country` TEXT NOT NULL,
  `language` TEXT NOT NULL,
  `operation` TEXT NOT NULL,
  `items` JSON NOT NULL COMMENT 'Array with catalogs items'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object to discontinue catalogs items';

--
-- Table structure for table `CatalogsItemsFilters` generated from model 'CatalogsItemsFilters'
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsFilters` (
  `catalog_type` TEXT NOT NULL,
  `item_ids` JSON NOT NULL,
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog',
  `hotel_ids` JSON NOT NULL,
  `creative_assets_ids` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsItemsPostFilters` generated from model 'CatalogsItemsPostFilters'
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsPostFilters` (
  `catalog_type` TEXT NOT NULL,
  `item_ids` JSON NOT NULL,
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog',
  `hotel_ids` JSON NOT NULL,
  `creative_assets_ids` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsItemsRequest` generated from model 'CatalogsItemsRequest'
-- Request object of catalogs items
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsRequest` (
  `country` TEXT NOT NULL,
  `language` TEXT NOT NULL,
  `filters` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object of catalogs items';

--
-- Table structure for table `CatalogsItemsUpdateBatchRequest` generated from model 'CatalogsItemsUpdateBatchRequest'
-- Request object to update catalogs items
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsUpdateBatchRequest` (
  `country` TEXT NOT NULL,
  `language` TEXT NOT NULL,
  `operation` TEXT NOT NULL,
  `items` JSON NOT NULL COMMENT 'Array with catalogs items'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object to update catalogs items';

--
-- Table structure for table `CatalogsItemsUpsertBatchRequest` generated from model 'CatalogsItemsUpsertBatchRequest'
-- Request object to upsert catalogs items
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsUpsertBatchRequest` (
  `country` TEXT NOT NULL,
  `language` TEXT NOT NULL,
  `operation` TEXT NOT NULL,
  `items` JSON NOT NULL COMMENT 'Array with catalogs items'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object to upsert catalogs items';

--
-- Table structure for table `catalogs_list_200_response` generated from model 'catalogsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `catalogs_list_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
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
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog id pertaining to the creative assets product group.',
  `country` TEXT NOT NULL,
  `locale` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object to list products for a given product group filter.';

--
-- Table structure for table `CatalogsProduct` generated from model 'CatalogsProduct'
-- Catalogs product for all verticals
--

CREATE TABLE IF NOT EXISTS `CatalogsProduct` (
  `catalog_type` TEXT NOT NULL,
  `metadata` TEXT NOT NULL,
  `pin` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Catalogs product for all verticals';

--
-- Table structure for table `CatalogsProductGroupCreateRequest` generated from model 'CatalogsProductGroupCreateRequest'
-- Request object for creating a product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupCreateRequest` (
  `name` TEXT NOT NULL,
  `description` TEXT DEFAULT NULL,
  `is_featured` TINYINT(1) DEFAULT false COMMENT 'boolean indicator of whether the product group is being featured or not',
  `filters` TEXT NOT NULL,
  `feed_id` TEXT NOT NULL COMMENT 'Catalog Feed id pertaining to the catalog product group.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for creating a product group.';

--
-- Table structure for table `CatalogsProductGroupCurrencyCriteria` generated from model 'CatalogsProductGroupCurrencyCriteria'
-- A currency filter. This filter cannot be negated
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupCurrencyCriteria` (
  `values` TEXT NOT NULL,
  `negated` TINYINT(1) DEFAULT false
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
  `PRODUCT_GROUP` TEXT NOT NULL
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
-- Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersRequest` (
  `any_of` JSON NOT NULL,
  `all_of` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.';

--
-- Table structure for table `CatalogsProductGroupFiltersRequest_anyOf` generated from model 'CatalogsProductGroupFiltersRequestUnderscoreanyOf'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersRequest_anyOf` (
  `any_of` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupFiltersRequest_anyOf_1` generated from model 'CatalogsProductGroupFiltersRequestUnderscoreanyOfUnderscore1'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersRequest_anyOf_1` (
  `all_of` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupMultipleCountriesCriteria` generated from model 'CatalogsProductGroupMultipleCountriesCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleCountriesCriteria` (
  `values` JSON NOT NULL,
  `negated` TINYINT(1) DEFAULT false
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupMultipleGenderCriteria` generated from model 'CatalogsProductGroupMultipleGenderCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleGenderCriteria` (
  `values` JSON NOT NULL,
  `negated` TINYINT(1) DEFAULT false
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupMultipleMediaTypesCriteria` generated from model 'CatalogsProductGroupMultipleMediaTypesCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleMediaTypesCriteria` (
  `values` JSON NOT NULL,
  `negated` TINYINT(1) DEFAULT false
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupMultipleStringCriteria` generated from model 'CatalogsProductGroupMultipleStringCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleStringCriteria` (
  `values` JSON NOT NULL,
  `negated` TINYINT(1) DEFAULT false
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupMultipleStringListCriteria` generated from model 'CatalogsProductGroupMultipleStringListCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleStringListCriteria` (
  `values` JSON NOT NULL,
  `negated` TINYINT(1) DEFAULT false
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `catalogs_product_group_pins_list_200_response` generated from model 'catalogsUnderscoreproductUnderscoregroupUnderscorepinsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `catalogs_product_group_pins_list_200_response` (
  `items` JSON NOT NULL COMMENT 'Pins',
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupPricingCriteria` generated from model 'CatalogsProductGroupPricingCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupPricingCriteria` (
  `inclusion` TINYINT(1) DEFAULT true,
  `values` DECIMAL(20, 9) UNSIGNED NOT NULL,
  `negated` TINYINT(1) DEFAULT false
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `catalogs_product_group_pricing_currency_criteria` generated from model 'catalogsUnderscoreproductUnderscoregroupUnderscorepricingUnderscorecurrencyUnderscorecriteria'
--

CREATE TABLE IF NOT EXISTS `catalogs_product_group_pricing_currency_criteria` (
  `operator` ENUM('GREATER_THAN', 'GREATER_THAN_OR_EQUALS', 'LESS_THAN', 'LESS_THAN_OR_EQUALS') NOT NULL,
  `value` DECIMAL(20, 9) UNSIGNED NOT NULL,
  `currency` TEXT NOT NULL,
  `negated` TINYINT(1) DEFAULT false
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsProductGroupProductCountsVertical` generated from model 'CatalogsProductGroupProductCountsVertical'
-- Product counts for a CatalogsProductGroup
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupProductCountsVertical` (
  `catalog_type` TEXT NOT NULL,
  `in_stock` DECIMAL(20, 9) UNSIGNED NOT NULL,
  `out_of_stock` DECIMAL(20, 9) UNSIGNED NOT NULL,
  `preorder` DECIMAL(20, 9) UNSIGNED NOT NULL,
  `total` DECIMAL(20, 9) UNSIGNED NOT NULL,
  `videos` DECIMAL(20, 9) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Product counts for a CatalogsProductGroup';

--
-- Table structure for table `CatalogsProductGroupUpdateRequest` generated from model 'CatalogsProductGroupUpdateRequest'
-- Request object for updating a product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupUpdateRequest` (
  `name` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `is_featured` TINYINT(1) DEFAULT NULL COMMENT 'boolean indicator of whether the product group is being featured or not',
  `filters` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for updating a product group.';

--
-- Table structure for table `catalogs_product_groups_list_200_response` generated from model 'catalogsUnderscoreproductUnderscoregroupsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `catalogs_product_groups_list_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `catalogs_product_groups_update_request` generated from model 'catalogsUnderscoreproductUnderscoregroupsUnderscoreupdateUnderscorerequest'
--

CREATE TABLE IF NOT EXISTS `catalogs_product_groups_update_request` (
  `name` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `is_featured` TINYINT(1) DEFAULT NULL COMMENT 'boolean indicator of whether the product group is being featured or not',
  `filters` TEXT DEFAULT NULL,
  `catalog_type` ENUM('CREATIVE_ASSETS') DEFAULT NULL,
  `country` TEXT DEFAULT NULL,
  `locale` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsReport` generated from model 'CatalogsReport'
--

CREATE TABLE IF NOT EXISTS `CatalogsReport` (
  `report_status` ENUM('FINISHED', 'IN_PROGRESS') DEFAULT NULL,
  `url` TEXT DEFAULT NULL COMMENT 'URL to download the report',
  `size` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Size of the report in bytes'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsReportDistributionIssueFilter` generated from model 'CatalogsReportDistributionIssueFilter'
--

CREATE TABLE IF NOT EXISTS `CatalogsReportDistributionIssueFilter` (
  `report_type` ENUM('DISTRIBUTION_ISSUES') NOT NULL,
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a catalog. If not given, oldest catalog will be used'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsReportDistributionStats` generated from model 'CatalogsReportDistributionStats'
--

CREATE TABLE IF NOT EXISTS `CatalogsReportDistributionStats` (
  `report_type` ENUM('DISTRIBUTION_ISSUES') DEFAULT NULL,
  `catalog_id` TEXT DEFAULT NULL COMMENT 'ID of the catalog entity.',
  `code` INT DEFAULT NULL COMMENT 'The event code that a diagnostics aggregated number references',
  `code_label` TEXT DEFAULT NULL COMMENT 'A human-friendly label for the event code (e.g, &#39;SPAM&#39;)',
  `message` TEXT DEFAULT NULL COMMENT 'Title message describing the diagnostic issue',
  `occurrences` INT DEFAULT NULL COMMENT 'Number of occurrences of the issue',
  `ineligible_for_ads` TINYINT(1) DEFAULT NULL COMMENT 'Indicates if issue makes items ineligible for ads distribution',
  `ineligible_for_organic` TINYINT(1) DEFAULT NULL COMMENT 'Indicates if issue makes items ineligible for organic distribution'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsReportFeedIngestionFilter` generated from model 'CatalogsReportFeedIngestionFilter'
--

CREATE TABLE IF NOT EXISTS `CatalogsReportFeedIngestionFilter` (
  `report_type` ENUM('FEED_INGESTION_ISSUES') NOT NULL,
  `feed_id` TEXT NOT NULL COMMENT 'ID of the feed entity.',
  `processing_result_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsReportFeedIngestionStats` generated from model 'CatalogsReportFeedIngestionStats'
--

CREATE TABLE IF NOT EXISTS `CatalogsReportFeedIngestionStats` (
  `report_type` ENUM('FEED_INGESTION_ISSUES') DEFAULT NULL,
  `catalog_id` TEXT DEFAULT NULL COMMENT 'ID of the catalog entity.',
  `code` INT DEFAULT NULL COMMENT 'The event code that a diagnostics aggregated number references',
  `code_label` TEXT DEFAULT NULL COMMENT 'A human-friendly label for the event code (e.g, &#39;AVAILABILITY_INVALID&#39;)',
  `message` TEXT DEFAULT NULL COMMENT 'Title message describing the diagnostic issue',
  `occurrences` INT DEFAULT NULL COMMENT 'Number of occurrences of the issue',
  `severity` ENUM('WARN', 'ERROR') DEFAULT NULL COMMENT 'An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsReportParameters` generated from model 'CatalogsReportParameters'
-- Report parameters
--

CREATE TABLE IF NOT EXISTS `CatalogsReportParameters` (
  `catalog_type` TEXT NOT NULL,
  `report` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Report parameters';

--
-- Table structure for table `CatalogsReportStats` generated from model 'CatalogsReportStats'
-- Diagnostics aggregated numbers
--

CREATE TABLE IF NOT EXISTS `CatalogsReportStats` (
  `report_type` ENUM('FEED_INGESTION_ISSUES', 'DISTRIBUTION_ISSUES') NOT NULL,
  `catalog_id` TEXT DEFAULT NULL COMMENT 'ID of the catalog entity.',
  `code` INT DEFAULT NULL COMMENT 'The event code that a diagnostics aggregated number references',
  `code_label` TEXT DEFAULT NULL COMMENT 'A human-friendly label for the event code (e.g, &#39;SPAM&#39;)',
  `message` TEXT DEFAULT NULL COMMENT 'Title message describing the diagnostic issue',
  `occurrences` INT DEFAULT NULL COMMENT 'Number of occurrences of the issue',
  `severity` ENUM('WARN', 'ERROR') DEFAULT NULL COMMENT 'An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue',
  `ineligible_for_ads` TINYINT(1) DEFAULT NULL COMMENT 'Indicates if issue makes items ineligible for ads distribution',
  `ineligible_for_organic` TINYINT(1) DEFAULT NULL COMMENT 'Indicates if issue makes items ineligible for organic distribution'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Diagnostics aggregated numbers';

--
-- Table structure for table `CatalogsRetailBatchRequest` generated from model 'CatalogsRetailBatchRequest'
-- A request object that can have multiple operations on a single retail batch
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailBatchRequest` (
  `catalog_type` ENUM('RETAIL') NOT NULL,
  `country` TEXT NOT NULL,
  `language` TEXT NOT NULL,
  `items` JSON NOT NULL COMMENT 'Array with catalogs item operations'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A request object that can have multiple operations on a single retail batch';

--
-- Table structure for table `CatalogsRetailBatchRequest_items_inner` generated from model 'CatalogsRetailBatchRequestUnderscoreitemsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailBatchRequest_items_inner` (
  `item_id` TEXT NOT NULL COMMENT 'The catalog item id in the merchant namespace',
  `operation` ENUM('DELETE') NOT NULL,
  `attributes` TEXT NOT NULL,
  `update_mask` JSON DEFAULT NULL COMMENT 'The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsRetailFeed` generated from model 'CatalogsRetailFeed'
-- Catalogs Retail Feed object
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailFeed` (
  `created_at` DATETIME NOT NULL,
  `id` TEXT NOT NULL,
  `updated_at` DATETIME NOT NULL,
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.',
  `format` TEXT NOT NULL,
  `catalog_type` TEXT NOT NULL,
  `credentials` TEXT NOT NULL,
  `location` TEXT NOT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `preferred_processing_schedule` TEXT NOT NULL,
  `status` TEXT NOT NULL,
  `default_currency` TEXT NOT NULL,
  `default_locale` TEXT NOT NULL COMMENT 'The locale used within a feed for product descriptions.',
  `default_country` TEXT NOT NULL,
  `default_availability` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Catalogs Retail Feed object';

--
-- Table structure for table `CatalogsRetailFeedsCreateRequest` generated from model 'CatalogsRetailFeedsCreateRequest'
-- Request object for creating a retail feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailFeedsCreateRequest` (
  `default_currency` TEXT DEFAULT NULL,
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `format` TEXT NOT NULL,
  `default_locale` TEXT NOT NULL,
  `credentials` TEXT DEFAULT NULL,
  `location` TEXT NOT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `catalog_type` TEXT NOT NULL,
  `default_country` TEXT NOT NULL,
  `default_availability` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for creating a retail feed.';

--
-- Table structure for table `CatalogsRetailFeedsUpdateRequest` generated from model 'CatalogsRetailFeedsUpdateRequest'
-- Request object for updating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailFeedsUpdateRequest` (
  `default_currency` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `format` TEXT DEFAULT NULL,
  `credentials` TEXT DEFAULT NULL,
  `location` TEXT DEFAULT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL,
  `catalog_type` TEXT NOT NULL,
  `default_availability` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for updating a feed.';

--
-- Table structure for table `CatalogsRetailItemErrorResponse` generated from model 'CatalogsRetailItemErrorResponse'
-- Object describing a retail item error
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailItemErrorResponse` (
  `catalog_type` TEXT NOT NULL,
  `item_id` TEXT DEFAULT NULL COMMENT 'The catalog item id in the merchant namespace',
  `errors` JSON DEFAULT NULL COMMENT 'Array with the errors for the item id requested'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing a retail item error';

--
-- Table structure for table `CatalogsRetailItemResponse` generated from model 'CatalogsRetailItemResponse'
-- Object describing a retail item record
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailItemResponse` (
  `catalog_type` TEXT NOT NULL,
  `item_id` TEXT DEFAULT NULL COMMENT 'The catalog retail item id in the merchant namespace',
  `pins` JSON DEFAULT NULL COMMENT 'The pins mapped to the item',
  `attributes` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing a retail item record';

--
-- Table structure for table `CatalogsRetailItemsBatch` generated from model 'CatalogsRetailItemsBatch'
-- Object describing the catalogs retail items batch
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailItemsBatch` (
  `batch_id` TEXT DEFAULT NULL COMMENT 'Id of the catalogs items batch',
  `created_time` DATETIME DEFAULT NULL COMMENT 'Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss',
  `completed_time` DATETIME DEFAULT NULL COMMENT 'Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss',
  `status` TEXT DEFAULT NULL,
  `catalog_type` TEXT NOT NULL,
  `items` JSON DEFAULT NULL COMMENT 'Array with the catalogs items processing records part of the catalogs items batch'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing the catalogs retail items batch';

--
-- Table structure for table `CatalogsRetailItemsFilter` generated from model 'CatalogsRetailItemsFilter'
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailItemsFilter` (
  `catalog_type` ENUM('RETAIL') NOT NULL,
  `item_ids` JSON NOT NULL,
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsRetailItemsPostFilter` generated from model 'CatalogsRetailItemsPostFilter'
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailItemsPostFilter` (
  `catalog_type` ENUM('RETAIL') NOT NULL,
  `item_ids` JSON NOT NULL,
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsRetailListProductsByCatalogBasedFilterRequest` generated from model 'CatalogsRetailListProductsByCatalogBasedFilterRequest'
-- Request object to list products for a given retail catalog_id and product group filter.
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailListProductsByCatalogBasedFilterRequest` (
  `catalog_type` ENUM('RETAIL') NOT NULL COMMENT 'Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.',
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog id pertaining to the retail product group.',
  `filters` TEXT NOT NULL,
  `country` TEXT NOT NULL,
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
  `catalog_type` ENUM('RETAIL') NOT NULL,
  `id` TEXT NOT NULL COMMENT 'ID of the catalog product group.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of catalog product group',
  `description` TEXT DEFAULT NULL,
  `filters` TEXT NOT NULL,
  `is_featured` TINYINT(1) DEFAULT NULL COMMENT 'boolean indicator of whether the product group is being featured or not',
  `type` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL,
  `created_at` INT DEFAULT NULL COMMENT 'Unix timestamp in seconds of when catalog product group was created.',
  `updated_at` INT DEFAULT NULL COMMENT 'Unix timestamp in seconds of last time catalog product group was updated.',
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog id pertaining to the retail product group.',
  `feed_id` TEXT NOT NULL COMMENT 'id of the catalogs feed belonging to this catalog product group',
  `country` TEXT DEFAULT NULL,
  `locale` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsRetailProductGroupCreateRequest` generated from model 'CatalogsRetailProductGroupCreateRequest'
-- Request object for creating a product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailProductGroupCreateRequest` (
  `catalog_type` ENUM('RETAIL') NOT NULL COMMENT 'Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.',
  `name` TEXT NOT NULL,
  `description` TEXT DEFAULT NULL,
  `filters` TEXT NOT NULL,
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog id pertaining to the retail product group.',
  `country` TEXT NOT NULL,
  `locale` TEXT NOT NULL
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
  `name` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `filters` TEXT DEFAULT NULL,
  `country` TEXT DEFAULT NULL,
  `locale` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for updating a retail product group.';

--
-- Table structure for table `CatalogsRetailProductMetadata` generated from model 'CatalogsRetailProductMetadata'
-- Retail product metadata entity
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailProductMetadata` (
  `item_id` TEXT NOT NULL COMMENT 'The user-created unique ID that represents the product.',
  `item_group_id` TEXT NOT NULL COMMENT 'The parent ID of the product.',
  `availability` TEXT NOT NULL,
  `price` DECIMAL(20, 9) NOT NULL COMMENT 'The price of the product.',
  `sale_price` DECIMAL(20, 9) NOT NULL COMMENT 'The discounted price of the product.',
  `currency` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Retail product metadata entity';

--
-- Table structure for table `CatalogsRetailReportParameters` generated from model 'CatalogsRetailReportParameters'
-- Parameters for retail report
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailReportParameters` (
  `catalog_type` ENUM('RETAIL') NOT NULL,
  `report` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Parameters for retail report';

--
-- Table structure for table `CatalogsUpdatableCreativeAssetsAttributes` generated from model 'CatalogsUpdatableCreativeAssetsAttributes'
--

CREATE TABLE IF NOT EXISTS `CatalogsUpdatableCreativeAssetsAttributes` (
  `title` TEXT DEFAULT NULL COMMENT 'The name of the creative assets.',
  `description` TEXT DEFAULT NULL COMMENT 'Brief description of the creative assets.',
  `link` TEXT DEFAULT NULL COMMENT 'Link to the creative assets page.',
  `ios_deep_link` TEXT DEFAULT NULL COMMENT 'IOS deep link to the creative assets page.',
  `android_deep_link` TEXT DEFAULT NULL COMMENT 'Link to the creative assets page.',
  `google_product_category` TEXT DEFAULT NULL COMMENT 'The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.',
  `custom_label_0` TEXT DEFAULT NULL COMMENT 'Custom grouping of creative assets.',
  `custom_label_1` TEXT DEFAULT NULL COMMENT 'Custom grouping of creative assets.',
  `custom_label_2` TEXT DEFAULT NULL COMMENT 'Custom grouping of creative assets.',
  `custom_label_3` TEXT DEFAULT NULL COMMENT 'Custom grouping of creative assets.',
  `custom_label_4` TEXT DEFAULT NULL COMMENT 'Custom grouping of creative assets.',
  `visibility` TEXT DEFAULT NULL COMMENT 'Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsUpdatableHotelAttributes` generated from model 'CatalogsUpdatableHotelAttributes'
--

CREATE TABLE IF NOT EXISTS `CatalogsUpdatableHotelAttributes` (
  `name` TEXT DEFAULT NULL COMMENT 'The hotel&#39;s name.',
  `link` TEXT DEFAULT NULL COMMENT 'Link to the product page',
  `description` TEXT DEFAULT NULL COMMENT 'Brief description of the hotel.',
  `brand` TEXT DEFAULT NULL COMMENT 'The brand to which this hotel belongs to.',
  `latitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Latitude of the hotel.',
  `longitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Longitude of the hotel.',
  `neighborhood` JSON DEFAULT NULL COMMENT 'A list of neighborhoods where the hotel is located',
  `address` TEXT DEFAULT NULL,
  `custom_label_0` TEXT DEFAULT NULL COMMENT 'Custom grouping of hotels',
  `custom_label_1` TEXT DEFAULT NULL COMMENT 'Custom grouping of hotels',
  `custom_label_2` TEXT DEFAULT NULL COMMENT 'Custom grouping of hotels',
  `custom_label_3` TEXT DEFAULT NULL COMMENT 'Custom grouping of hotels',
  `custom_label_4` TEXT DEFAULT NULL COMMENT 'Custom grouping of hotels',
  `category` TEXT DEFAULT NULL COMMENT 'The type of property. The category can be any type of internal description desired.',
  `base_price` TEXT DEFAULT NULL COMMENT 'Base price of the hotel room per night followed by the ISO currency code',
  `sale_price` TEXT DEFAULT NULL COMMENT 'Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.',
  `guest_ratings` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsUpdateCreativeAssetsItem` generated from model 'CatalogsUpdateCreativeAssetsItem'
-- A creative assets item to be updated.
--

CREATE TABLE IF NOT EXISTS `CatalogsUpdateCreativeAssetsItem` (
  `creative_assets_id` TEXT NOT NULL COMMENT 'The catalog creative assets item id in the merchant namespace',
  `operation` ENUM('UPDATE') NOT NULL,
  `attributes` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A creative assets item to be updated.';

--
-- Table structure for table `CatalogsUpdateHotelItem` generated from model 'CatalogsUpdateHotelItem'
-- Object describing an hotel item batch record
--

CREATE TABLE IF NOT EXISTS `CatalogsUpdateHotelItem` (
  `hotel_id` TEXT NOT NULL COMMENT 'The catalog hotel item id in the merchant namespace',
  `operation` ENUM('UPDATE') NOT NULL,
  `attributes` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an hotel item batch record';

--
-- Table structure for table `CatalogsUpdateRetailItem` generated from model 'CatalogsUpdateRetailItem'
-- An item to be updated
--

CREATE TABLE IF NOT EXISTS `CatalogsUpdateRetailItem` (
  `item_id` TEXT NOT NULL COMMENT 'The catalog item id in the merchant namespace',
  `operation` ENUM('UPDATE') NOT NULL,
  `attributes` TEXT NOT NULL,
  `update_mask` JSON DEFAULT NULL COMMENT 'The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An item to be updated';

--
-- Table structure for table `CatalogsUpsertCreativeAssetsItem` generated from model 'CatalogsUpsertCreativeAssetsItem'
-- A creative assets item to be upserted.
--

CREATE TABLE IF NOT EXISTS `CatalogsUpsertCreativeAssetsItem` (
  `creative_assets_id` TEXT NOT NULL COMMENT 'The catalog creative assets id in the merchant namespace',
  `operation` ENUM('UPSERT') NOT NULL,
  `attributes` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A creative assets item to be upserted.';

--
-- Table structure for table `CatalogsUpsertHotelItem` generated from model 'CatalogsUpsertHotelItem'
-- A hotel item to be upserted.
--

CREATE TABLE IF NOT EXISTS `CatalogsUpsertHotelItem` (
  `hotel_id` TEXT NOT NULL COMMENT 'The catalog hotel id in the merchant namespace',
  `operation` ENUM('UPSERT') NOT NULL,
  `attributes` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A hotel item to be upserted.';

--
-- Table structure for table `CatalogsUpsertRetailItem` generated from model 'CatalogsUpsertRetailItem'
-- An item to be upserted
--

CREATE TABLE IF NOT EXISTS `CatalogsUpsertRetailItem` (
  `item_id` TEXT NOT NULL COMMENT 'The catalog item id in the merchant namespace',
  `operation` ENUM('UPSERT') NOT NULL,
  `attributes` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An item to be upserted';

--
-- Table structure for table `CatalogsVerticalBatchRequest` generated from model 'CatalogsVerticalBatchRequest'
-- A request object that can have multiple operations on a single batch
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalBatchRequest` (
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `country` TEXT NOT NULL,
  `language` TEXT NOT NULL,
  `items` JSON NOT NULL COMMENT 'Array with creative assets item operations',
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A request object that can have multiple operations on a single batch';

--
-- Table structure for table `CatalogsVerticalFeedsCreateRequest` generated from model 'CatalogsVerticalFeedsCreateRequest'
-- Request object for creating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalFeedsCreateRequest` (
  `default_currency` TEXT DEFAULT NULL,
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `format` TEXT NOT NULL,
  `default_locale` TEXT NOT NULL,
  `credentials` TEXT DEFAULT NULL,
  `location` TEXT NOT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `catalog_type` TEXT NOT NULL,
  `default_country` TEXT NOT NULL,
  `default_availability` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL,
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for creating a feed.';

--
-- Table structure for table `CatalogsVerticalFeedsUpdateRequest` generated from model 'CatalogsVerticalFeedsUpdateRequest'
-- Request object for updating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalFeedsUpdateRequest` (
  `default_currency` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `format` TEXT DEFAULT NULL,
  `credentials` TEXT DEFAULT NULL,
  `location` TEXT DEFAULT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL,
  `catalog_type` TEXT NOT NULL,
  `default_availability` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for updating a feed.';

--
-- Table structure for table `CatalogsVerticalProductGroup` generated from model 'CatalogsVerticalProductGroup'
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalProductGroup` (
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `id` TEXT NOT NULL COMMENT 'ID of the creative assets product group.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of creative assets product group',
  `description` TEXT DEFAULT NULL,
  `filters` TEXT NOT NULL,
  `is_featured` TINYINT(1) DEFAULT NULL COMMENT 'boolean indicator of whether the product group is being featured or not',
  `type` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL,
  `created_at` INT DEFAULT NULL COMMENT 'Unix timestamp in seconds of when catalog product group was created.',
  `updated_at` INT DEFAULT NULL COMMENT 'Unix timestamp in seconds of last time catalog product group was updated.',
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog id pertaining to the creative assets product group.',
  `feed_id` TEXT NOT NULL COMMENT 'id of the catalogs feed belonging to this catalog product group',
  `country` TEXT DEFAULT NULL,
  `locale` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CatalogsVerticalProductGroupCreateRequest` generated from model 'CatalogsVerticalProductGroupCreateRequest'
-- Request object for creating a catalog based product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalProductGroupCreateRequest` (
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `name` TEXT NOT NULL,
  `description` TEXT DEFAULT NULL,
  `filters` TEXT NOT NULL,
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog id pertaining to the creative assets product group.',
  `country` TEXT NOT NULL,
  `locale` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for creating a catalog based product group.';

--
-- Table structure for table `CatalogsVerticalProductGroupUpdateRequest` generated from model 'CatalogsVerticalProductGroupUpdateRequest'
-- Request object for updating a catalog based product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalProductGroupUpdateRequest` (
  `catalog_type` ENUM('CREATIVE_ASSETS') DEFAULT NULL,
  `name` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `filters` TEXT DEFAULT NULL,
  `country` TEXT DEFAULT NULL,
  `locale` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object for updating a catalog based product group.';

--
-- Table structure for table `CatalogsVerticalsListProductsByCatalogBasedFilterRequest` generated from model 'CatalogsVerticalsListProductsByCatalogBasedFilterRequest'
-- Request object to list products for a given catalog_id and product group filter.
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalsListProductsByCatalogBasedFilterRequest` (
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog id pertaining to the creative assets product group.',
  `filters` TEXT NOT NULL,
  `country` TEXT NOT NULL,
  `locale` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request object to list products for a given catalog_id and product group filter.';

--
-- Table structure for table `ConditionFilter` generated from model 'ConditionFilter'
--

CREATE TABLE IF NOT EXISTS `ConditionFilter` (
  `CONDITION` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionApiResponse` generated from model 'ConversionApiResponse'
-- Schema describing the object in the response, which contains information about the events that were received and processed.
--

CREATE TABLE IF NOT EXISTS `ConversionApiResponse` (
  `num_events_received` INT NOT NULL COMMENT 'Total number of events received in the request.',
  `num_events_processed` INT NOT NULL COMMENT 'Number of events that were successfully processed from the events.',
  `events` JSON NOT NULL COMMENT 'Specific messages for each event received. The order will match the order in which the events were received in the request.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Schema describing the object in the response, which contains information about the events that were received and processed.';

--
-- Table structure for table `ConversionApiResponse_events_inner` generated from model 'ConversionApiResponseUnderscoreeventsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `ConversionApiResponse_events_inner` (
  `status` ENUM('failed', 'processed') NOT NULL COMMENT 'Whether the event was processed successfully.',
  `error_message` TEXT DEFAULT NULL COMMENT 'Error message containing more information about why the event failed to be processed.',
  `warning_message` TEXT DEFAULT NULL COMMENT 'Warning messages about any fields in the event which are not standard. These are not critical to event processing.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionEventResponse` generated from model 'ConversionEventResponse'
--

CREATE TABLE IF NOT EXISTS `ConversionEventResponse` (
  `conversion_event` TEXT DEFAULT NULL,
  `conversion_tag_id` TEXT DEFAULT NULL COMMENT 'Id of the tag.',
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Id of the ad account.',
  `created_time` INT DEFAULT NULL COMMENT 'Creation date in epoch format.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionEvents` generated from model 'ConversionEvents'
-- A list of events (one or more) encapsulated by a data object.
--

CREATE TABLE IF NOT EXISTS `ConversionEvents` (
  `data` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A list of events (one or more) encapsulated by a data object.';

--
-- Table structure for table `ConversionEvents_data_inner` generated from model 'ConversionEventsUnderscoredataUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `ConversionEvents_data_inner` (
  `event_name` TEXT NOT NULL COMMENT '&lt;p&gt;The type of the user event. Please use the right event_name otherwise the event won&#39;t be accepted and show up correctly in reports.   &lt;ul&gt;   &lt;li&gt;&lt;code&gt;add_to_cart&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;checkout&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;custom&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;lead&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;page_visit&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;search&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;signup&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;view_category&lt;/code&gt;&lt;/li&gt;   &lt;li&gt;&lt;code&gt;watch_video&lt;/code&gt;&lt;/li&gt;   &lt;/ul&gt; &lt;/p&gt; ',
  `action_source` TEXT NOT NULL COMMENT '&lt;p&gt;   The source indicating where the conversion event occurred.   &lt;ul&gt;     &lt;li&gt;&lt;code&gt;app_android&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;app_ios&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;web&lt;/code&gt;&lt;/li&gt;     &lt;li&gt;&lt;code&gt;offline&lt;/code&gt;&lt;/li&gt;   &lt;/ul&gt; &lt;/p&gt; ',
  `event_time` BIGINT NOT NULL COMMENT 'The time when the event happened. Unix timestamp in seconds.',
  `event_id` TEXT NOT NULL COMMENT 'A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.',
  `event_source_url` TEXT DEFAULT NULL COMMENT 'URL of the web conversion event.',
  `opt_out` TINYINT(1) DEFAULT NULL COMMENT 'When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.',
  `partner_name` TEXT DEFAULT NULL COMMENT 'The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g ‘ss-shopify’',
  `user_data` TEXT NOT NULL,
  `custom_data` TEXT DEFAULT NULL,
  `app_id` TEXT DEFAULT NULL COMMENT 'The app store app ID.',
  `app_name` TEXT DEFAULT NULL COMMENT 'Name of the app.',
  `app_version` TEXT DEFAULT NULL COMMENT 'Version of the app.',
  `device_brand` TEXT DEFAULT NULL COMMENT 'Brand of the user device.',
  `device_carrier` TEXT DEFAULT NULL COMMENT 'User device&#39;s mobile carrier.',
  `device_model` TEXT DEFAULT NULL COMMENT 'Model of the user device.',
  `device_type` TEXT DEFAULT NULL COMMENT 'Type of the user device.',
  `os_version` TEXT DEFAULT NULL COMMENT 'Version of the device operating system.',
  `wifi` TINYINT(1) DEFAULT NULL COMMENT 'Whether the event occurred when the user device was connected to wifi.',
  `language` TEXT DEFAULT NULL COMMENT 'Two-character ISO-639-1 language code indicating the user&#39;s language.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionEvents_data_inner_custom_data` generated from model 'ConversionEventsUnderscoredataUnderscoreinnerUnderscorecustomUnderscoredata'
-- Object containing other custom data.
--

CREATE TABLE IF NOT EXISTS `ConversionEvents_data_inner_custom_data` (
  `currency` TEXT DEFAULT NULL COMMENT 'The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.',
  `value` TEXT DEFAULT NULL COMMENT 'Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.',
  `content_ids` JSON DEFAULT NULL COMMENT 'List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).',
  `content_name` TEXT DEFAULT NULL COMMENT 'The name of the page or product associated with the event.',
  `content_category` TEXT DEFAULT NULL COMMENT 'The category of the content associated with the event.',
  `content_brand` TEXT DEFAULT NULL COMMENT 'The brand of the content associated with the event.',
  `contents` JSON DEFAULT NULL COMMENT 'A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).',
  `num_items` BIGINT DEFAULT NULL COMMENT 'Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).',
  `order_id` TEXT DEFAULT NULL COMMENT 'The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.',
  `search_string` TEXT DEFAULT NULL COMMENT 'The search string related to the user conversion event.',
  `opt_out_type` TEXT DEFAULT NULL COMMENT 'Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/limited-data-processing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Help Center&lt;/a&gt; and &lt;a href&#x3D;\&quot;/docs/api-features/conversion-overview/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;dev site&lt;/a&gt; for specific opt_out_type set up.',
  `np` TEXT DEFAULT NULL COMMENT 'Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object containing other custom data.';

--
-- Table structure for table `ConversionEvents_data_inner_custom_data_contents_inner` generated from model 'ConversionEventsUnderscoredataUnderscoreinnerUnderscorecustomUnderscoredataUnderscorecontentsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `ConversionEvents_data_inner_custom_data_contents_inner` (
  `id` TEXT DEFAULT NULL COMMENT 'The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).',
  `item_price` TEXT DEFAULT NULL COMMENT 'The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).',
  `quantity` BIGINT DEFAULT NULL COMMENT 'The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).',
  `item_name` TEXT DEFAULT NULL COMMENT 'The name of a product.',
  `item_category` TEXT DEFAULT NULL COMMENT 'The category of a product.',
  `item_brand` TEXT DEFAULT NULL COMMENT 'The brand of a product.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionEventsUserData` generated from model 'ConversionEventsUserData'
-- Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
--

CREATE TABLE IF NOT EXISTS `ConversionEventsUserData` (
  `ph` JSON DEFAULT NULL COMMENT 'Sha256 hashes of user&#39;s phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.',
  `ge` JSON DEFAULT NULL COMMENT 'Sha256 hashes of user&#39;s gender, in lowercase. Either \&quot;f\&quot; or \&quot;m\&quot; or \&quot;n\&quot; for non-binary gender. The string should be in the UTF-8 format.',
  `db` JSON DEFAULT NULL COMMENT 'Sha256 hashes of user&#39;s date of birthday, given as year, month, and day. The string should be in the UTF-8 format.',
  `ln` JSON DEFAULT NULL COMMENT 'Sha256 hashes of user&#39;s last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.',
  `fn` JSON DEFAULT NULL COMMENT 'Sha256 hashes of user&#39;s first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.',
  `ct` JSON DEFAULT NULL COMMENT 'Sha256 hashes of user&#39;s city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.',
  `st` JSON DEFAULT NULL COMMENT 'Sha256 hashes of user&#39;s state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.',
  `zp` JSON DEFAULT NULL COMMENT 'Sha256 hashes of user&#39;s zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.',
  `country` JSON DEFAULT NULL COMMENT 'Sha256 hashes of two-character ISO-3166 country code indicating the user&#39;s country, in lowercase. The string should be in the UTF-8 format.',
  `external_id` JSON DEFAULT NULL COMMENT 'Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.',
  `click_id` TEXT DEFAULT NULL COMMENT 'The unique identifier stored in _epik cookie on your domain or &amp;epik&#x3D; query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.',
  `partner_id` TEXT DEFAULT NULL COMMENT 'A unique identifier of visitors&#39; information defined by third party partners. e.g RampID',
  `em` JSON NOT NULL COMMENT 'Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.',
  `hashed_maids` JSON NOT NULL COMMENT 'Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.',
  `client_ip_address` TEXT NOT NULL COMMENT 'The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.',
  `client_user_agent` TEXT NOT NULL COMMENT 'The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.';

--
-- Table structure for table `ConversionEventsUserData_anyOf` generated from model 'ConversionEventsUserDataUnderscoreanyOf'
--

CREATE TABLE IF NOT EXISTS `ConversionEventsUserData_anyOf` (
  `em` JSON NOT NULL COMMENT 'Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.',
  `hashed_maids` JSON DEFAULT NULL COMMENT 'Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.',
  `client_ip_address` TEXT DEFAULT NULL COMMENT 'The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.',
  `client_user_agent` TEXT DEFAULT NULL COMMENT 'The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionEventsUserData_anyOf_1` generated from model 'ConversionEventsUserDataUnderscoreanyOfUnderscore1'
--

CREATE TABLE IF NOT EXISTS `ConversionEventsUserData_anyOf_1` (
  `em` JSON DEFAULT NULL COMMENT 'Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.',
  `hashed_maids` JSON NOT NULL COMMENT 'Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.',
  `client_ip_address` TEXT DEFAULT NULL COMMENT 'The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.',
  `client_user_agent` TEXT DEFAULT NULL COMMENT 'The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionEventsUserData_anyOf_2` generated from model 'ConversionEventsUserDataUnderscoreanyOfUnderscore2'
--

CREATE TABLE IF NOT EXISTS `ConversionEventsUserData_anyOf_2` (
  `em` JSON DEFAULT NULL COMMENT 'Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.',
  `hashed_maids` JSON DEFAULT NULL COMMENT 'Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.',
  `client_ip_address` TEXT NOT NULL COMMENT 'The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.',
  `client_user_agent` TEXT NOT NULL COMMENT 'The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionTagCommon` generated from model 'ConversionTagCommon'
--

CREATE TABLE IF NOT EXISTS `ConversionTagCommon` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Ad account ID.',
  `code_snippet` TEXT DEFAULT NULL COMMENT 'Tag code snippet.',
  `enhanced_match_status` TEXT DEFAULT NULL,
  `id` TEXT DEFAULT NULL COMMENT 'Tag ID.',
  `last_fired_time_ms` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Time for the last event fired.',
  `name` TEXT DEFAULT NULL COMMENT 'Conversion tag name.',
  `status` TEXT DEFAULT NULL,
  `version` TEXT DEFAULT NULL COMMENT 'Version number.',
  `configs` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionTagConfigs` generated from model 'ConversionTagConfigs'
--

CREATE TABLE IF NOT EXISTS `ConversionTagConfigs` (
  `aem_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match email is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.',
  `md_frequency` DECIMAL(20, 9) DEFAULT '1' COMMENT 'Metadata ingestion frequency.',
  `aem_fnln_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match name is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.',
  `aem_ph_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match phone is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.',
  `aem_ge_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match gender is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.',
  `aem_db_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match birthdate is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.',
  `aem_loc_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match location is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionTagCreate` generated from model 'ConversionTagCreate'
--

CREATE TABLE IF NOT EXISTS `ConversionTagCreate` (
  `name` TEXT NOT NULL COMMENT 'Conversion tag name.',
  `aem_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match email is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.',
  `md_frequency` DECIMAL(20, 9) DEFAULT '1' COMMENT 'Metadata ingestion frequency.',
  `aem_fnln_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match name is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.',
  `aem_ph_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match phone is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.',
  `aem_ge_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match gender is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.',
  `aem_db_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match birthdate is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.',
  `aem_loc_enabled` TINYINT(1) DEFAULT false COMMENT 'Whether Automatic Enhanced Match location is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionTagListResponse` generated from model 'ConversionTagListResponse'
--

CREATE TABLE IF NOT EXISTS `ConversionTagListResponse` (
  `items` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ConversionTagResponse` generated from model 'ConversionTagResponse'
--

CREATE TABLE IF NOT EXISTS `ConversionTagResponse` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Ad account ID.',
  `code_snippet` TEXT DEFAULT NULL COMMENT 'Tag code snippet.',
  `enhanced_match_status` TEXT DEFAULT NULL,
  `id` TEXT DEFAULT NULL COMMENT 'Tag ID.',
  `last_fired_time_ms` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Time for the last event fired.',
  `name` TEXT DEFAULT NULL COMMENT 'Conversion tag name.',
  `status` TEXT DEFAULT NULL,
  `version` TEXT DEFAULT NULL COMMENT 'Version number.',
  `configs` TEXT DEFAULT NULL
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
-- Table structure for table `CreateAssetAccessRequestBody_asset_requests_inner` generated from model 'CreateAssetAccessRequestBodyUnderscoreassetUnderscorerequestsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `CreateAssetAccessRequestBody_asset_requests_inner` (
  `partner_id` TEXT NOT NULL COMMENT 'Unique identifier of a business partner to request asset access to.',
  `asset_id_to_permissions` JSON NOT NULL COMMENT 'An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateAssetAccessRequestErrorMessage_inner` generated from model 'CreateAssetAccessRequestErrorMessageUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `CreateAssetAccessRequestErrorMessage_inner` (
  `code` INT DEFAULT NULL COMMENT 'Error code associated with the error in requesting asset access.',
  `messages` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateAssetAccessRequestResponse` generated from model 'CreateAssetAccessRequestResponse'
--

CREATE TABLE IF NOT EXISTS `CreateAssetAccessRequestResponse` (
  `exceptions` JSON DEFAULT NULL COMMENT 'A list of errors associated with the asset access requests. Will be returned if there is an error.',
  `invites` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateAssetGroupBody` generated from model 'CreateAssetGroupBody'
--

CREATE TABLE IF NOT EXISTS `CreateAssetGroupBody` (
  `asset_group_name` TEXT NOT NULL COMMENT 'Asset Group name',
  `asset_group_description` TEXT NOT NULL COMMENT 'Asset group description',
  `asset_group_types` JSON NOT NULL COMMENT 'Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateAssetGroupResponse` generated from model 'CreateAssetGroupResponse'
--

CREATE TABLE IF NOT EXISTS `CreateAssetGroupResponse` (
  `asset_group` TEXT DEFAULT NULL
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
  `invite_id` TEXT NOT NULL COMMENT 'Unique identifier of an invite.',
  `invite_type` TEXT NOT NULL,
  `asset_id_to_permissions` JSON NOT NULL COMMENT 'An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. '
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object declaring an asset role update to an invite.';

--
-- Table structure for table `CreateInvitesResultsResponseArray` generated from model 'CreateInvitesResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `CreateInvitesResultsResponseArray` (
  `items` JSON DEFAULT NULL COMMENT 'List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateInvitesResultsResponseArray_items_inner` generated from model 'CreateInvitesResultsResponseArrayUnderscoreitemsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `CreateInvitesResultsResponseArray_items_inner` (
  `exception` TEXT DEFAULT NULL,
  `invite` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateInvitesResultsResponseArray_items_inner_invite` generated from model 'CreateInvitesResultsResponseArrayUnderscoreitemsUnderscoreinnerUnderscoreinvite'
-- An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.
--

CREATE TABLE IF NOT EXISTS `CreateInvitesResultsResponseArray_items_inner_invite` (
  `id` TEXT DEFAULT NULL COMMENT 'Unique identifier of the invite/request.',
  `user` TEXT DEFAULT NULL COMMENT 'Metadata for the member/partner that was sent the invite/request.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.';

--
-- Table structure for table `CreateMMMReportRequest` generated from model 'CreateMMMReportRequest'
--

CREATE TABLE IF NOT EXISTS `CreateMMMReportRequest` (
  `report_name` TEXT NOT NULL COMMENT 'Name of the Marketing Mix Modeling (MMM) report',
  `start_date` TEXT NOT NULL COMMENT 'Metric report start date (UTC). Format: YYYY-MM-DD',
  `end_date` TEXT NOT NULL COMMENT 'Metric report end date (UTC). Format: YYYY-MM-DD',
  `granularity` ENUM('DAY', 'WEEK') NOT NULL COMMENT 'DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly.',
  `level` ENUM('CAMPAIGN_TARGETING', 'AD_GROUP_TARGETING') NOT NULL COMMENT 'Level of the report',
  `targeting_types` JSON NOT NULL COMMENT 'List of targeting types',
  `columns` JSON NOT NULL COMMENT 'Metric and entity columns',
  `countries` JSON DEFAULT NULL COMMENT 'A List of countries for filtering'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateMMMReportResponse` generated from model 'CreateMMMReportResponse'
--

CREATE TABLE IF NOT EXISTS `CreateMMMReportResponse` (
  `code` DECIMAL(20, 9) DEFAULT NULL,
  `data` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateMMMReportResponseData` generated from model 'CreateMMMReportResponseData'
--

CREATE TABLE IF NOT EXISTS `CreateMMMReportResponseData` (
  `report_status` TEXT DEFAULT NULL,
  `token` TEXT DEFAULT NULL,
  `message` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CreateMembershipOrPartnershipInvitesBody` generated from model 'CreateMembershipOrPartnershipInvitesBody'
-- Body to be used on path to send Members or Partners Invite or Request
--

CREATE TABLE IF NOT EXISTS `CreateMembershipOrPartnershipInvitesBody` (
  `business_role` ENUM('EMPLOYEE', 'BIZ_ADMIN', 'PARTNER') NOT NULL COMMENT 'The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.',
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
  `warnings` JSON DEFAULT NULL COMMENT 'Array with the validation warnings for the item processing record',
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an item processing record';

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
-- Table structure for table `CustomerList` generated from model 'CustomerList'
--

CREATE TABLE IF NOT EXISTS `CustomerList` (
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Associated ad account ID.',
  `created_time` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Creation time. Unix timestamp in seconds.',
  `id` TEXT DEFAULT NULL COMMENT 'Customer list ID.',
  `name` TEXT DEFAULT NULL COMMENT 'Customer list name.',
  `num_batches` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Total number of list updates.  List creation counts as one batch. Each &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.',
  `num_removed_user_records` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Number of removed user records. In a &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call, this counter increases even if the user is not found in the list.',
  `num_uploaded_user_records` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Number of uploaded user records. In an &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append API&lt;/a&gt; call, this counter increases even if the uploaded user is already in the list.',
  `status` ENUM('PROCESSING', 'READY', 'TOO_SMALL', 'UPLOADING') DEFAULT NULL COMMENT 'Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.',
  `type` TEXT DEFAULT NULL COMMENT 'Always \&quot;customerlist\&quot;.',
  `updated_time` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Last update time. Unix timestamp in seconds.',
  `exceptions` JSON DEFAULT NULL COMMENT 'Customer list errors'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CustomerListRequest` generated from model 'CustomerListRequest'
--

CREATE TABLE IF NOT EXISTS `CustomerListRequest` (
  `name` TEXT NOT NULL COMMENT 'Customer list name.',
  `records` TEXT NOT NULL COMMENT 'Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.',
  `list_type` TEXT,
  `exceptions` JSON DEFAULT NULL COMMENT 'Customer list errors.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CustomerListUpdateRequest` generated from model 'CustomerListUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `CustomerListUpdateRequest` (
  `records` TEXT NOT NULL COMMENT 'Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.',
  `operation_type` TEXT NOT NULL,
  `exceptions` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `customer_lists_list_200_response` generated from model 'customerUnderscorelistsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `customer_lists_list_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DeleteAssetGroupBody` generated from model 'DeleteAssetGroupBody'
-- Request body used to delete asset groups
--

CREATE TABLE IF NOT EXISTS `DeleteAssetGroupBody` (
  `asset_groups_to_delete` JSON NOT NULL COMMENT 'List of ids of asset groups to be deleted'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request body used to delete asset groups';

--
-- Table structure for table `DeleteAssetGroupResponse` generated from model 'DeleteAssetGroupResponse'
--

CREATE TABLE IF NOT EXISTS `DeleteAssetGroupResponse` (
  `deleted_asset_groups` JSON DEFAULT NULL COMMENT 'A list of ids of successfully deleted asset groups.',
  `exceptions` JSON DEFAULT NULL COMMENT 'A list of errors associated with the asset groups. Will be returned if there is an error.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DeleteAssetGroupResponse_exceptions_inner` generated from model 'DeleteAssetGroupResponseUnderscoreexceptionsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `DeleteAssetGroupResponse_exceptions_inner` (
  `code` INT DEFAULT NULL COMMENT 'Error code associated with the error deleting asset group.',
  `message` TEXT DEFAULT NULL COMMENT 'Error message associated with the error deleting asset group.',
  `asset_group_id` TEXT DEFAULT NULL COMMENT 'Asset group id of the exception.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DeleteInvitesResultsResponseArray` generated from model 'DeleteInvitesResultsResponseArray'
-- Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id
--

CREATE TABLE IF NOT EXISTS `DeleteInvitesResultsResponseArray` (
  `items` JSON DEFAULT NULL COMMENT 'List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id';

--
-- Table structure for table `DeleteInvitesResultsResponseArray_items_inner` generated from model 'DeleteInvitesResultsResponseArrayUnderscoreitemsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `DeleteInvitesResultsResponseArray_items_inner` (
  `exception` TEXT DEFAULT NULL,
  `invite` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DeleteInvitesResultsResponseArray_items_inner_exception` generated from model 'DeleteInvitesResultsResponseArrayUnderscoreitemsUnderscoreinnerUnderscoreexception'
-- An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
--

CREATE TABLE IF NOT EXISTS `DeleteInvitesResultsResponseArray_items_inner_exception` (
  `invite_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of an invite.',
  `message` TEXT DEFAULT NULL COMMENT 'Error message associated with the error in performing the action on the invite/request.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An exception object if there is an error performing the cancellation. It will only be provided if there is an error.';

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
-- Table structure for table `DeletePartnerAssetAccessBody` generated from model 'DeletePartnerAssetAccessBody'
--

CREATE TABLE IF NOT EXISTS `DeletePartnerAssetAccessBody` (
  `accesses` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DeletePartnerAssetAccessBody_accesses_inner` generated from model 'DeletePartnerAssetAccessBodyUnderscoreaccessesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `DeletePartnerAssetAccessBody_accesses_inner` (
  `partner_id` VARCHAR(25) NOT NULL COMMENT 'Unique identifier of a business partner to update asset access to.',
  `asset_id` VARCHAR(25) NOT NULL COMMENT 'Unique identifier of the business asset.',
  `partner_type` ENUM('INTERNAL', 'EXTERNAL') DEFAULT 'INTERNAL' COMMENT 'If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DeletePartnerAssetsResult` generated from model 'DeletePartnerAssetsResult'
-- The terminated asset access.
--

CREATE TABLE IF NOT EXISTS `DeletePartnerAssetsResult` (
  `asset_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a business asset.',
  `asset_type` TEXT DEFAULT NULL COMMENT 'Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.',
  `permissions` JSON DEFAULT NULL COMMENT 'Permission levels member or partner has on an asset.',
  `is_shared_partner` TINYINT(1) DEFAULT NULL COMMENT 'If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset.&lt;br&gt; If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset.',
  `partner_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a business partner.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The terminated asset access.';

--
-- Table structure for table `DeletePartnerAssetsResultsResponseArray` generated from model 'DeletePartnerAssetsResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `DeletePartnerAssetsResultsResponseArray` (
  `items` JSON DEFAULT NULL COMMENT 'List of terminated asset access.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DeletePartnersRequest` generated from model 'DeletePartnersRequest'
--

CREATE TABLE IF NOT EXISTS `DeletePartnersRequest` (
  `partner_ids` JSON NOT NULL,
  `partner_type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DeletePartnersResponse` generated from model 'DeletePartnersResponse'
-- An object with a list of partners that were deleted.
--

CREATE TABLE IF NOT EXISTS `DeletePartnersResponse` (
  `deleted_partners` JSON DEFAULT NULL COMMENT 'List of partners whose business partnership have been terminated.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An object with a list of partners that were deleted.';

--
-- Table structure for table `DeletedMembersResponse` generated from model 'DeletedMembersResponse'
-- An object with a list of members that were deleted.
--

CREATE TABLE IF NOT EXISTS `DeletedMembersResponse` (
  `deleted_members` JSON DEFAULT NULL COMMENT 'List of members whose business membership have been terminated.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An object with a list of members that were deleted.';

--
-- Table structure for table `DeliveryMetricsResponse` generated from model 'DeliveryMetricsResponse'
--

CREATE TABLE IF NOT EXISTS `DeliveryMetricsResponse` (
  `items` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DeliveryMetricsResponse_items_inner` generated from model 'DeliveryMetricsResponseUnderscoreitemsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `DeliveryMetricsResponse_items_inner` (
  `name` TEXT DEFAULT NULL COMMENT 'Metric&#39;s name.',
  `category` ENUM('ADS', 'ORGANIC') DEFAULT NULL COMMENT 'Category name',
  `definition` TEXT DEFAULT NULL COMMENT 'How the metric is defined.',
  `display_name` TEXT DEFAULT NULL COMMENT 'Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DetailedError` generated from model 'DetailedError'
-- Used for including extra details to a base error
--

CREATE TABLE IF NOT EXISTS `DetailedError` (
  `code` INT NOT NULL,
  `message` TEXT NOT NULL,
  `details` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Used for including extra details to a base error';

--
-- Table structure for table `Error` generated from model 'Error'
--

CREATE TABLE IF NOT EXISTS `Error` (
  `code` INT NOT NULL,
  `message` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Exception` generated from model 'Exception'
--

CREATE TABLE IF NOT EXISTS `Exception` (
  `code` INT DEFAULT NULL COMMENT 'Exception error code.',
  `message` TEXT DEFAULT NULL COMMENT 'Exception message.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `feed_processing_results_list_200_response` generated from model 'feedUnderscoreprocessingUnderscoreresultsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `feed_processing_results_list_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `feeds_create_request` generated from model 'feedsUnderscorecreateUnderscorerequest'
--

CREATE TABLE IF NOT EXISTS `feeds_create_request` (
  `default_currency` TEXT DEFAULT NULL,
  `name` TEXT NOT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `format` TEXT NOT NULL,
  `default_locale` TEXT NOT NULL,
  `credentials` TEXT DEFAULT NULL,
  `location` TEXT NOT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `catalog_type` TEXT NOT NULL,
  `default_country` TEXT NOT NULL,
  `default_availability` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL,
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `feeds_list_200_response` generated from model 'feedsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `feeds_list_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `feeds_update_request` generated from model 'feedsUnderscoreupdateUnderscorerequest'
--

CREATE TABLE IF NOT EXISTS `feeds_update_request` (
  `default_currency` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'A human-friendly name associated to a given feed.',
  `format` TEXT DEFAULT NULL,
  `credentials` TEXT DEFAULT NULL,
  `location` TEXT DEFAULT NULL COMMENT 'The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.',
  `preferred_processing_schedule` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL,
  `catalog_type` TEXT NOT NULL,
  `default_availability` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `FollowUserRequest` generated from model 'FollowUserRequest'
--

CREATE TABLE IF NOT EXISTS `FollowUserRequest` (
  `auto_follow` TINYINT(1) DEFAULT false COMMENT 'Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `followers_list_200_response` generated from model 'followersUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `followers_list_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GenderFilter` generated from model 'GenderFilter'
--

CREATE TABLE IF NOT EXISTS `GenderFilter` (
  `GENDER` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetBusinessAssetsResponse` generated from model 'GetBusinessAssetsResponse'
-- An object containing the permissions a business has on the asset.
--

CREATE TABLE IF NOT EXISTS `GetBusinessAssetsResponse` (
  `asset_id` VARCHAR(20) DEFAULT NULL COMMENT 'Unique identifier of a business asset.',
  `asset_type` TEXT DEFAULT NULL COMMENT 'Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.',
  `asset_group_info` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An object containing the permissions a business has on the asset.';

--
-- Table structure for table `get_business_employers_200_response` generated from model 'getUnderscorebusinessUnderscoreemployersUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `get_business_employers_200_response` (
  `items` JSON NOT NULL COMMENT 'List of employers.',
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `get_business_members_200_response` generated from model 'getUnderscorebusinessUnderscoremembersUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `get_business_members_200_response` (
  `items` JSON NOT NULL COMMENT 'List of business members.',
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `get_business_partners_200_response` generated from model 'getUnderscorebusinessUnderscorepartnersUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `get_business_partners_200_response` (
  `items` JSON NOT NULL COMMENT 'List of business partners.',
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `get_invites_200_response` generated from model 'getUnderscoreinvitesUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `get_invites_200_response` (
  `items` JSON NOT NULL COMMENT 'List of invite and request data.',
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetMMMReportResponse` generated from model 'GetMMMReportResponse'
--

CREATE TABLE IF NOT EXISTS `GetMMMReportResponse` (
  `code` DECIMAL(20, 9) DEFAULT NULL,
  `data` TEXT DEFAULT NULL,
  `message` TEXT DEFAULT NULL,
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetMMMReportResponseData` generated from model 'GetMMMReportResponseData'
--

CREATE TABLE IF NOT EXISTS `GetMMMReportResponseData` (
  `report_status` ENUM('DOES_NOT_EXIST', 'FINISHED', 'IN_PROGRESS', 'EXPIRED', 'FAILED', 'CANCELLED') DEFAULT NULL,
  `url` TEXT DEFAULT NULL,
  `size` DECIMAL(20, 9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GetPartnerAssetsResponse` generated from model 'GetPartnerAssetsResponse'
-- An object containing the permissions a you/your business partner has on the asset.
--

CREATE TABLE IF NOT EXISTS `GetPartnerAssetsResponse` (
  `asset_id` VARCHAR(20) DEFAULT NULL COMMENT 'Unique identifier of a business asset.',
  `asset_type` TEXT DEFAULT NULL COMMENT 'Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.',
  `permissions` JSON DEFAULT NULL COMMENT 'The permissions you or your partner has on the asset. If partner_type&#x3D;INTERNAL, the permission levels are for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the permission levels are for the access you have to the partner&#39;s business asset.',
  `asset_group_info` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An object containing the permissions a you/your business partner has on the asset.';

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
  `hotel_id` TEXT DEFAULT NULL COMMENT 'The catalog hotel id in the merchant namespace',
  `errors` JSON DEFAULT NULL COMMENT 'Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.',
  `warnings` JSON DEFAULT NULL COMMENT 'Array with the validation warnings for the item processing record',
  `status` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an item processing record';

--
-- Table structure for table `ImageDetails` generated from model 'ImageDetails'
--

CREATE TABLE IF NOT EXISTS `ImageDetails` (
  `width` INT UNSIGNED NOT NULL,
  `height` INT UNSIGNED NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ImageMetadata` generated from model 'ImageMetadata'
--

CREATE TABLE IF NOT EXISTS `ImageMetadata` (
  `item_type` TEXT DEFAULT NULL,
  `title` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `link` TEXT DEFAULT NULL,
  `images` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ImageMetadata_images` generated from model 'ImageMetadataUnderscoreimages'
--

CREATE TABLE IF NOT EXISTS `ImageMetadata_images` (
  `150x150` TEXT DEFAULT NULL,
  `400x300` TEXT DEFAULT NULL,
  `600x` TEXT DEFAULT NULL,
  `1200x` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `IntegrationLog` generated from model 'IntegrationLog'
-- Schema for log sent from an integration application.
--

CREATE TABLE IF NOT EXISTS `IntegrationLog` (
  `client_timestamp` INT NOT NULL COMMENT 'Timestamp in milliseconds of when the log was executed at the client.',
  `event_type` ENUM('APP', 'API') NOT NULL COMMENT 'Log event type',
  `log_level` ENUM('INFO', 'WARN', 'ERROR') NOT NULL COMMENT 'Log level type',
  `external_business_id` TEXT DEFAULT NULL,
  `advertiser_id` VARCHAR(128) DEFAULT NULL,
  `merchant_id` VARCHAR(128) DEFAULT NULL,
  `tag_id` VARCHAR(128) DEFAULT NULL,
  `feed_profile_id` VARCHAR(128) DEFAULT NULL,
  `message` TEXT DEFAULT NULL COMMENT 'Explanation of the event that occured.',
  `app_version_number` VARCHAR(20) DEFAULT NULL COMMENT 'Version number of the integration application.',
  `platform_version_number` VARCHAR(20) DEFAULT NULL COMMENT 'Version number of the platform the integration application is running on.',
  `error` TEXT DEFAULT NULL,
  `request` TEXT DEFAULT NULL
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
  `method` ENUM('GET', 'HEAD', 'POST', 'PUT', 'DELETE', 'CONNECT', 'OPTIONS', 'TRACE', 'PATCH') NOT NULL,
  `host` TEXT NOT NULL COMMENT 'HTTP request host from host header.',
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
-- Table structure for table `IntegrationLogsInvalidLogResponse_rejected_logs_inner` generated from model 'IntegrationLogsInvalidLogResponseUnderscorerejectedUnderscorelogsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `IntegrationLogsInvalidLogResponse_rejected_logs_inner` (
  `log_index` INT DEFAULT NULL COMMENT 'Index of the log in the batch.',
  `field` TEXT NOT NULL COMMENT 'The field name containing an invalid value.',
  `value` TEXT NOT NULL COMMENT 'The value that is invalid.',
  `reason` TEXT NOT NULL COMMENT 'The reason the value is invalid.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `IntegrationLogsRequest` generated from model 'IntegrationLogsRequest'
-- Batch of logs sent from an integration application.
--

CREATE TABLE IF NOT EXISTS `IntegrationLogsRequest` (
  `logs` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Batch of logs sent from an integration application.';

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
  `id` TEXT DEFAULT NULL,
  `external_business_id` TEXT DEFAULT NULL,
  `connected_merchant_id` TEXT DEFAULT NULL,
  `connected_user_id` TEXT DEFAULT NULL,
  `connected_advertiser_id` TEXT DEFAULT NULL,
  `connected_lba_id` TEXT DEFAULT NULL,
  `connected_tag_id` TEXT DEFAULT NULL,
  `partner_access_token_expiry` DECIMAL(20, 9) DEFAULT NULL,
  `partner_refresh_token_expiry` DECIMAL(20, 9) DEFAULT NULL,
  `scopes` TEXT DEFAULT NULL,
  `created_timestamp` DECIMAL(20, 9) DEFAULT NULL,
  `updated_timestamp` DECIMAL(20, 9) DEFAULT NULL,
  `additional_id_1` TEXT DEFAULT NULL,
  `partner_metadata` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Integration metadata';

--
-- Table structure for table `IntegrationRecord` generated from model 'IntegrationRecord'
-- Integration record
--

CREATE TABLE IF NOT EXISTS `IntegrationRecord` (
  `id` TEXT DEFAULT NULL,
  `external_business_id` TEXT DEFAULT NULL,
  `connected_merchant_id` TEXT DEFAULT NULL,
  `connected_user_id` TEXT DEFAULT NULL,
  `connected_advertiser_id` TEXT DEFAULT NULL,
  `connected_lba_id` TEXT DEFAULT NULL,
  `connected_tag_id` TEXT DEFAULT NULL,
  `partner_access_token` TEXT DEFAULT NULL,
  `partner_refresh_token` TEXT DEFAULT NULL,
  `partner_primary_email` TEXT DEFAULT NULL,
  `partner_access_token_expiry` INT DEFAULT NULL,
  `partner_refresh_token_expiry` INT DEFAULT NULL,
  `scopes` TEXT DEFAULT NULL,
  `partner_metadata` TEXT DEFAULT NULL,
  `additional_id_1` TEXT DEFAULT NULL,
  `created_time` INT DEFAULT NULL,
  `updated_time` INT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Integration record';

--
-- Table structure for table `IntegrationRequest` generated from model 'IntegrationRequest'
-- Schema used for creating the integration metadata.
--

CREATE TABLE IF NOT EXISTS `IntegrationRequest` (
  `external_business_id` TEXT DEFAULT NULL COMMENT 'External business ID for the integration.',
  `connected_merchant_id` TEXT DEFAULT NULL,
  `connected_advertiser_id` TEXT DEFAULT NULL,
  `connected_lba_id` TEXT DEFAULT NULL,
  `connected_tag_id` TEXT DEFAULT NULL,
  `partner_access_token` TEXT DEFAULT NULL,
  `partner_refresh_token` TEXT DEFAULT NULL,
  `partner_primary_email` TEXT DEFAULT NULL,
  `partner_access_token_expiry` INT DEFAULT NULL,
  `partner_refresh_token_expiry` INT DEFAULT NULL,
  `scopes` TEXT DEFAULT NULL,
  `additional_id_1` TEXT DEFAULT NULL,
  `partner_metadata` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Schema used for creating the integration metadata.';

--
-- Table structure for table `IntegrationRequestPatch` generated from model 'IntegrationRequestPatch'
-- Schema used for updating the integration metadata.
--

CREATE TABLE IF NOT EXISTS `IntegrationRequestPatch` (
  `connected_merchant_id` TEXT DEFAULT NULL,
  `connected_advertiser_id` TEXT DEFAULT NULL,
  `connected_lba_id` TEXT DEFAULT NULL,
  `connected_tag_id` TEXT DEFAULT NULL,
  `partner_access_token` TEXT DEFAULT NULL,
  `partner_refresh_token` TEXT DEFAULT NULL,
  `partner_primary_email` TEXT DEFAULT NULL,
  `partner_access_token_expiry` DECIMAL(20, 9) DEFAULT NULL,
  `partner_refresh_token_expiry` DECIMAL(20, 9) DEFAULT NULL,
  `scopes` TEXT DEFAULT NULL,
  `additional_id_1` TEXT DEFAULT NULL,
  `partner_metadata` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Schema used for updating the integration metadata.';

--
-- Table structure for table `integrations_get_list_200_response` generated from model 'integrationsUnderscoregetUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `integrations_get_list_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
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
-- Table structure for table `InviteAssetsSummary` generated from model 'InviteAssetsSummary'
-- Ad accounts and profiles the member/partner will be granted access to with this invite/request.
--

CREATE TABLE IF NOT EXISTS `InviteAssetsSummary` (
  `ad_accounts` JSON DEFAULT NULL COMMENT 'List of ad account IDs and respective permission levels that will be assigned.',
  `profiles` JSON DEFAULT NULL COMMENT 'List of profile IDs and respective permission levels that will be assigned.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ad accounts and profiles the member/partner will be granted access to with this invite/request.';

--
-- Table structure for table `InviteAssetsSummary_ad_accounts_inner` generated from model 'InviteAssetsSummaryUnderscoreadUnderscoreaccountsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `InviteAssetsSummary_ad_accounts_inner` (
  `id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a business ad account.',
  `permissions` JSON DEFAULT NULL COMMENT 'Permission levels member or partner has on an asset.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `InviteAssetsSummary_profiles_inner` generated from model 'InviteAssetsSummaryUnderscoreprofilesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `InviteAssetsSummary_profiles_inner` (
  `id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a business profile.',
  `permissions` JSON DEFAULT NULL COMMENT 'Permission levels member or partner has on an asset.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `InviteBusinessRoleBinding` generated from model 'InviteBusinessRoleBinding'
-- An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
--

CREATE TABLE IF NOT EXISTS `InviteBusinessRoleBinding` (
  `created_by_business_id` TEXT DEFAULT NULL COMMENT 'Unique identifier for the business that created the invite/request.',
  `created_by_user_id` TEXT DEFAULT NULL COMMENT 'Unique identifier for the user that created the invite/request.',
  `user` TEXT DEFAULT NULL COMMENT 'Metadata for the user that updated the invite/request.',
  `id` TEXT DEFAULT NULL COMMENT 'Unique identifier of the invite/request.',
  `invite_data` TEXT DEFAULT NULL,
  `is_received_invite` TINYINT(1) DEFAULT NULL COMMENT 'Indicates whether the invite/request was received.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.';

--
-- Table structure for table `InviteExceptionResponse` generated from model 'InviteExceptionResponse'
-- An exception object if there is an error performing the action. Will only be provided if there is an error.
--

CREATE TABLE IF NOT EXISTS `InviteExceptionResponse` (
  `invite_or_request_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of the invite/request.',
  `code` INT DEFAULT NULL COMMENT 'Error code associated with the error in performing the action on the invite/request.',
  `message` TEXT DEFAULT NULL COMMENT 'Error message associated with the error in performing the action on the invite/request.',
  `users_or_partner_ids` JSON DEFAULT NULL COMMENT 'A list of users&#39; usernames or emails OR a list of partner ids that caused the error.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An exception object if there is an error performing the action. Will only be provided if there is an error.';

--
-- Table structure for table `InviteResponse` generated from model 'InviteResponse'
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemAttributes` generated from model 'ItemAttributes'
--

CREATE TABLE IF NOT EXISTS `ItemAttributes` (
  `ad_link` TEXT DEFAULT NULL COMMENT 'Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.',
  `adult` TINYINT(1) DEFAULT NULL COMMENT 'Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest.',
  `age_group` TEXT DEFAULT NULL COMMENT 'The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’ , ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.',
  `availability` TEXT DEFAULT NULL COMMENT 'The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’ , ‘preorder’.',
  `average_review_rating` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Average reviews for the item. Can be a number from 1-5.',
  `brand` TEXT DEFAULT NULL COMMENT 'The brand of the product.',
  `checkout_enabled` TINYINT(1) DEFAULT NULL COMMENT 'This attribute is not supported anymore.',
  `color` TEXT DEFAULT NULL COMMENT 'The primary color of the product.',
  `condition` TEXT DEFAULT NULL COMMENT 'The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.',
  `custom_label_0` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;',
  `custom_label_1` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;',
  `custom_label_2` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;',
  `custom_label_3` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;',
  `custom_label_4` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;',
  `description` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 10000 characters&lt;/p&gt; &lt;p&gt;The description of the product.&lt;/p&gt;',
  `free_shipping_label` TINYINT(1) DEFAULT NULL COMMENT 'The item is free to ship.',
  `free_shipping_limit` TEXT DEFAULT NULL COMMENT 'The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.',
  `gender` TEXT DEFAULT NULL COMMENT 'The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’ , or ‘unisex’.',
  `google_product_category` TEXT DEFAULT NULL COMMENT 'The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.',
  `gtin` INT DEFAULT NULL COMMENT 'The unique universal product identifier.',
  `id` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The user-created unique ID that represents the product. Only Unicode characters are accepted.&lt;/p&gt;',
  `item_group_id` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The parent ID of the product.&lt;/p&gt;',
  `last_updated_time` BIGINT DEFAULT NULL COMMENT 'The millisecond timestamp when the item was lastly modified by the merchant.',
  `link` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;The landing page for the product.&lt;/p&gt;',
  `material` TEXT DEFAULT NULL COMMENT 'The material used to make the product.',
  `min_ad_price` TEXT DEFAULT NULL COMMENT 'The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.',
  `mobile_link` TEXT DEFAULT NULL COMMENT 'The mobile-optimized version of your landing page. Must begin with http:// or https://.',
  `mpn` TEXT DEFAULT NULL COMMENT 'Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.',
  `number_of_ratings` INT DEFAULT NULL COMMENT 'The number of ratings for the item.',
  `number_of_reviews` INT DEFAULT NULL COMMENT 'The number of reviews available for the item.',
  `pattern` TEXT DEFAULT NULL COMMENT 'The description of the pattern used for the product.',
  `price` TEXT DEFAULT NULL COMMENT 'The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.',
  `product_type` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.&lt;/p&gt;',
  `sale_price` TEXT DEFAULT NULL COMMENT 'The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars.',
  `shipping` TEXT DEFAULT NULL COMMENT 'Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.',
  `shipping_height` TEXT DEFAULT NULL COMMENT 'The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.',
  `shipping_weight` TEXT DEFAULT NULL COMMENT 'The weight of the product. Ensure there is a space between the numeric string and the metric.',
  `shipping_width` TEXT DEFAULT NULL COMMENT 'The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.',
  `size` TEXT DEFAULT NULL COMMENT 'The size of the product.',
  `size_system` TEXT DEFAULT NULL COMMENT 'Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’ , ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘ BR’, ‘MEX’, or ‘AU’.',
  `size_type` TEXT DEFAULT NULL COMMENT 'Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’ , ‘plus’, ‘big_and_tall’, or ‘maternity’.',
  `tax` TEXT DEFAULT NULL COMMENT 'Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.',
  `title` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 500 characters&lt;/p&gt; &lt;p&gt;The name of the product.&lt;/p&gt;',
  `variant_names` JSON DEFAULT NULL COMMENT 'Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.',
  `variant_values` JSON DEFAULT NULL COMMENT 'Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.',
  `additional_image_link` JSON DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.&lt;/p&gt;',
  `image_link` JSON DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.&lt;/p&gt;',
  `video_link` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 2,000 characters&lt;/p&gt; &lt;p&gt;Hosted link to the product video.&lt;/p&gt; &lt;p&gt;File types for linked videos must be .mp4, .mov or .m4v.&lt;/p&gt; &lt;p&gt;File size cannot exceed 2GB.&lt;/p&gt;'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemAttributesRequest` generated from model 'ItemAttributesRequest'
--

CREATE TABLE IF NOT EXISTS `ItemAttributesRequest` (
  `ad_link` TEXT DEFAULT NULL COMMENT 'Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.',
  `adult` TINYINT(1) DEFAULT NULL COMMENT 'Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest.',
  `age_group` TEXT DEFAULT NULL COMMENT 'The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’ , ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.',
  `availability` TEXT DEFAULT NULL COMMENT 'The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’ , ‘preorder’.',
  `average_review_rating` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Average reviews for the item. Can be a number from 1-5.',
  `brand` TEXT DEFAULT NULL COMMENT 'The brand of the product.',
  `checkout_enabled` TINYINT(1) DEFAULT NULL COMMENT 'This attribute is not supported anymore.',
  `color` TEXT DEFAULT NULL COMMENT 'The primary color of the product.',
  `condition` TEXT DEFAULT NULL COMMENT 'The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.',
  `custom_label_0` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;',
  `custom_label_1` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;',
  `custom_label_2` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;',
  `custom_label_3` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;',
  `custom_label_4` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;',
  `description` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 10000 characters&lt;/p&gt; &lt;p&gt;The description of the product.&lt;/p&gt;',
  `free_shipping_label` TINYINT(1) DEFAULT NULL COMMENT 'The item is free to ship.',
  `free_shipping_limit` TEXT DEFAULT NULL COMMENT 'The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.',
  `gender` TEXT DEFAULT NULL COMMENT 'The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’ , or ‘unisex’.',
  `google_product_category` TEXT DEFAULT NULL COMMENT 'The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.',
  `gtin` INT DEFAULT NULL COMMENT 'The unique universal product identifier.',
  `id` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The user-created unique ID that represents the product. Only Unicode characters are accepted.&lt;/p&gt;',
  `item_group_id` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The parent ID of the product.&lt;/p&gt;',
  `last_updated_time` BIGINT DEFAULT NULL COMMENT 'The millisecond timestamp when the item was lastly modified by the merchant.',
  `link` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;The landing page for the product.&lt;/p&gt;',
  `material` TEXT DEFAULT NULL COMMENT 'The material used to make the product.',
  `min_ad_price` TEXT DEFAULT NULL COMMENT 'The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.',
  `mobile_link` TEXT DEFAULT NULL COMMENT 'The mobile-optimized version of your landing page. Must begin with http:// or https://.',
  `mpn` TEXT DEFAULT NULL COMMENT 'Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.',
  `number_of_ratings` INT DEFAULT NULL COMMENT 'The number of ratings for the item.',
  `number_of_reviews` INT DEFAULT NULL COMMENT 'The number of reviews available for the item.',
  `pattern` TEXT DEFAULT NULL COMMENT 'The description of the pattern used for the product.',
  `price` TEXT DEFAULT NULL COMMENT 'The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.',
  `product_type` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.&lt;/p&gt;',
  `sale_price` TEXT DEFAULT NULL COMMENT 'The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars.',
  `shipping` TEXT DEFAULT NULL COMMENT 'Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.',
  `shipping_height` TEXT DEFAULT NULL COMMENT 'The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.',
  `shipping_weight` TEXT DEFAULT NULL COMMENT 'The weight of the product. Ensure there is a space between the numeric string and the metric.',
  `shipping_width` TEXT DEFAULT NULL COMMENT 'The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.',
  `size` TEXT DEFAULT NULL COMMENT 'The size of the product.',
  `size_system` TEXT DEFAULT NULL COMMENT 'Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’ , ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘ BR’, ‘MEX’, or ‘AU’.',
  `size_type` TEXT DEFAULT NULL COMMENT 'Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’ , ‘plus’, ‘big_and_tall’, or ‘maternity’.',
  `tax` TEXT DEFAULT NULL COMMENT 'Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.',
  `title` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 500 characters&lt;/p&gt; &lt;p&gt;The name of the product.&lt;/p&gt;',
  `variant_names` JSON DEFAULT NULL COMMENT 'Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.',
  `variant_values` JSON DEFAULT NULL COMMENT 'Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.',
  `additional_image_link` JSON DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.&lt;/p&gt;',
  `image_link` TEXT DEFAULT NULL,
  `video_link` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 2,000 characters&lt;/p&gt; &lt;p&gt;Hosted link to the product video.&lt;/p&gt; &lt;p&gt;File types for linked videos must be .mp4, .mov or .m4v.&lt;/p&gt; &lt;p&gt;File size cannot exceed 2GB.&lt;/p&gt;'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemBatchRecord` generated from model 'ItemBatchRecord'
-- Object describing an item batch record
--

CREATE TABLE IF NOT EXISTS `ItemBatchRecord` (
  `item_id` TEXT DEFAULT NULL COMMENT 'The catalog item id in the merchant namespace',
  `attributes` TEXT DEFAULT NULL,
  `update_mask` JSON DEFAULT NULL COMMENT 'The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an item batch record';

--
-- Table structure for table `ItemCreateBatchRecord` generated from model 'ItemCreateBatchRecord'
-- Object describing an item batch record to create items
--

CREATE TABLE IF NOT EXISTS `ItemCreateBatchRecord` (
  `item_id` TEXT DEFAULT NULL COMMENT 'The catalog item id in the merchant namespace',
  `attributes` TEXT DEFAULT NULL
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
-- Table structure for table `ItemResponse` generated from model 'ItemResponse'
-- Object describing an item record
--

CREATE TABLE IF NOT EXISTS `ItemResponse` (
  `catalog_type` TEXT NOT NULL,
  `item_id` TEXT DEFAULT NULL COMMENT 'The catalog item id in the merchant namespace',
  `pins` JSON DEFAULT NULL COMMENT 'The pins mapped to the item',
  `attributes` TEXT DEFAULT NULL,
  `hotel_id` TEXT DEFAULT NULL COMMENT 'The catalog hotel id in the merchant namespace',
  `creative_assets_id` TEXT DEFAULT NULL COMMENT 'The catalog creative assets id in the merchant namespace',
  `errors` JSON DEFAULT NULL COMMENT 'Array with the errors for the item id requested'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an item record';

--
-- Table structure for table `ItemResponse_anyOf` generated from model 'ItemResponseUnderscoreanyOf'
--

CREATE TABLE IF NOT EXISTS `ItemResponse_anyOf` (
  `catalog_type` TEXT NOT NULL,
  `item_id` TEXT DEFAULT NULL COMMENT 'The catalog retail item id in the merchant namespace',
  `pins` JSON DEFAULT NULL COMMENT 'The pins mapped to the item',
  `attributes` TEXT DEFAULT NULL,
  `hotel_id` TEXT DEFAULT NULL COMMENT 'The catalog hotel id in the merchant namespace',
  `creative_assets_id` TEXT DEFAULT NULL COMMENT 'The catalog creative assets id in the merchant namespace'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemResponse_anyOf_1` generated from model 'ItemResponseUnderscoreanyOfUnderscore1'
--

CREATE TABLE IF NOT EXISTS `ItemResponse_anyOf_1` (
  `catalog_type` TEXT NOT NULL,
  `item_id` TEXT DEFAULT NULL COMMENT 'The catalog item id in the merchant namespace',
  `errors` JSON DEFAULT NULL COMMENT 'Array with the errors for the item id requested',
  `hotel_id` TEXT DEFAULT NULL COMMENT 'The catalog hotel id in the merchant namespace',
  `creative_assets_id` TEXT DEFAULT NULL COMMENT 'The catalog creative assets id in the merchant namespace'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemUpdateBatchRecord` generated from model 'ItemUpdateBatchRecord'
-- Object describing an item batch record to update items
--

CREATE TABLE IF NOT EXISTS `ItemUpdateBatchRecord` (
  `item_id` TEXT DEFAULT NULL COMMENT 'The catalog item id in the merchant namespace',
  `attributes` TEXT DEFAULT NULL,
  `update_mask` JSON DEFAULT NULL COMMENT 'The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Object describing an item batch record to update items';

--
-- Table structure for table `ItemUpsertBatchRecord` generated from model 'ItemUpsertBatchRecord'
-- Object describing an item batch record to upsert items
--

CREATE TABLE IF NOT EXISTS `ItemUpsertBatchRecord` (
  `item_id` TEXT DEFAULT NULL COMMENT 'The catalog item id in the merchant namespace',
  `attributes` TEXT DEFAULT NULL
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
-- Table structure for table `items_batch_post_request` generated from model 'itemsUnderscorebatchUnderscorepostUnderscorerequest'
--

CREATE TABLE IF NOT EXISTS `items_batch_post_request` (
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `country` TEXT NOT NULL,
  `language` TEXT NOT NULL,
  `items` JSON NOT NULL COMMENT 'Array with catalogs items',
  `catalog_id` TEXT DEFAULT NULL COMMENT 'Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog',
  `operation` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `items_issues_list_200_response` generated from model 'itemsUnderscoreissuesUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `items_issues_list_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Keyword` generated from model 'Keyword'
--

CREATE TABLE IF NOT EXISTS `Keyword` (
  `bid` INT DEFAULT NULL COMMENT '&lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.',
  `match_type` TEXT NOT NULL,
  `value` TEXT NOT NULL COMMENT 'Keyword value (120 chars max).',
  `archived` TINYINT(1) DEFAULT NULL,
  `id` TEXT DEFAULT NULL COMMENT 'Keyword ID .',
  `parent_id` TEXT DEFAULT NULL COMMENT 'Keyword parent entity ID (advertiser, campaign, ad group).',
  `parent_type` TEXT DEFAULT NULL COMMENT 'Parent entity type',
  `type` TEXT DEFAULT NULL COMMENT 'Always keyword'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `KeywordError` generated from model 'KeywordError'
--

CREATE TABLE IF NOT EXISTS `KeywordError` (
  `data` TEXT DEFAULT NULL,
  `error_messages` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `KeywordMetrics` generated from model 'KeywordMetrics'
-- Keyword metrics JSON
--

CREATE TABLE IF NOT EXISTS `KeywordMetrics` (
  `avg_cpc_in_micro_currency` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Average cost per click',
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
-- Table structure for table `KeywordUpdate` generated from model 'KeywordUpdate'
--

CREATE TABLE IF NOT EXISTS `KeywordUpdate` (
  `id` TEXT NOT NULL COMMENT 'Keyword ID.',
  `archived` TINYINT(1) DEFAULT NULL COMMENT 'Is keyword archived?',
  `bid` INT DEFAULT NULL COMMENT '&lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `KeywordUpdateBody` generated from model 'KeywordUpdateBody'
--

CREATE TABLE IF NOT EXISTS `KeywordUpdateBody` (
  `keywords` JSON NOT NULL COMMENT 'Keywords to update. Object array. Each object has 2 possible fields:&lt;br&gt;1. \&quot;id\&quot;: (required) keyword ID&lt;br&gt;2. \&quot;archived\&quot;: boolean. Should keyword be archived?&lt;br&gt;For example: [{\&quot;id\&quot;:\&quot;2886610576653\&quot;, \&quot;archived\&quot;: false}, {\&quot;id\&quot;:\&quot;2886610576654\&quot;,  \&quot;archived\&quot;: true}, ...]'
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
-- Table structure for table `keywords_get_200_response` generated from model 'keywordsUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `keywords_get_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
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
-- Table structure for table `KeywordsResponse` generated from model 'KeywordsResponse'
--

CREATE TABLE IF NOT EXISTS `KeywordsResponse` (
  `errors` JSON DEFAULT NULL,
  `keywords` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LeadFormArrayResponse` generated from model 'LeadFormArrayResponse'
--

CREATE TABLE IF NOT EXISTS `LeadFormArrayResponse` (
  `items` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LeadFormArrayResponse_items_inner` generated from model 'LeadFormArrayResponseUnderscoreitemsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `LeadFormArrayResponse_items_inner` (
  `data` TEXT DEFAULT NULL,
  `exceptions` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LeadFormCommon` generated from model 'LeadFormCommon'
-- Creation fields
--

CREATE TABLE IF NOT EXISTS `LeadFormCommon` (
  `name` TEXT DEFAULT NULL COMMENT 'Internal name of the lead form.',
  `privacy_policy_link` TEXT DEFAULT NULL COMMENT 'A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.',
  `has_accepted_terms` TINYINT(1) DEFAULT NULL COMMENT 'Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO',
  `completion_message` TEXT DEFAULT NULL COMMENT 'A message for people who complete the form to let them know what happens next.',
  `status` TEXT DEFAULT NULL,
  `disclosure_language` TEXT DEFAULT NULL COMMENT 'Additional disclosure language to be included in the lead form.',
  `questions` JSON DEFAULT NULL COMMENT 'List of questions to be displayed on the lead form.',
  `policy_links` JSON DEFAULT NULL COMMENT 'List of additional policy links to be displayed on the lead form.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Creation fields';

--
-- Table structure for table `LeadFormCommon_policy_links_inner` generated from model 'LeadFormCommonUnderscorepolicyUnderscorelinksUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `LeadFormCommon_policy_links_inner` (
  `label` TEXT DEFAULT NULL COMMENT 'Policy label for an additional policy link.',
  `link` TEXT DEFAULT NULL COMMENT 'Policy link for an additional policy link.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LeadFormCreateRequest` generated from model 'LeadFormCreateRequest'
--

CREATE TABLE IF NOT EXISTS `LeadFormCreateRequest` (
  `name` TEXT NOT NULL COMMENT 'Internal name of the lead form.',
  `privacy_policy_link` TEXT NOT NULL COMMENT 'A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.',
  `has_accepted_terms` TINYINT(1) NOT NULL COMMENT 'Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO',
  `completion_message` TEXT NOT NULL COMMENT 'A message for people who complete the form to let them know what happens next.',
  `status` TEXT DEFAULT NULL,
  `disclosure_language` TEXT DEFAULT NULL COMMENT 'Additional disclosure language to be included in the lead form.',
  `questions` JSON NOT NULL COMMENT 'List of questions to be displayed on the lead form.',
  `policy_links` JSON DEFAULT NULL COMMENT 'List of additional policy links to be displayed on the lead form.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LeadFormQuestion` generated from model 'LeadFormQuestion'
--

CREATE TABLE IF NOT EXISTS `LeadFormQuestion` (
  `question_type` TEXT DEFAULT NULL,
  `custom_question_field_type` TEXT DEFAULT NULL,
  `custom_question_label` TEXT DEFAULT NULL COMMENT 'Question label for a custom question.',
  `custom_question_options` JSON DEFAULT NULL COMMENT 'Question options for a custom question.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LeadFormResponse` generated from model 'LeadFormResponse'
--

CREATE TABLE IF NOT EXISTS `LeadFormResponse` (
  `name` TEXT DEFAULT NULL COMMENT 'Internal name of the lead form.',
  `privacy_policy_link` TEXT DEFAULT NULL COMMENT 'A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.',
  `has_accepted_terms` TINYINT(1) DEFAULT NULL COMMENT 'Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO',
  `completion_message` TEXT DEFAULT NULL COMMENT 'A message for people who complete the form to let them know what happens next.',
  `status` TEXT DEFAULT NULL,
  `disclosure_language` TEXT DEFAULT NULL COMMENT 'Additional disclosure language to be included in the lead form.',
  `questions` JSON DEFAULT NULL COMMENT 'List of questions to be displayed on the lead form.',
  `policy_links` JSON DEFAULT NULL COMMENT 'List of additional policy links to be displayed on the lead form.',
  `id` TEXT DEFAULT NULL COMMENT 'The ID of this lead form',
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'The Ad Account ID that this lead form belongs to.',
  `created_time` INT DEFAULT NULL COMMENT 'Lead form creation time. Unix timestamp in seconds.',
  `updated_time` INT DEFAULT NULL COMMENT 'Last update time. Unix timestamp in seconds.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LeadFormTestRequest` generated from model 'LeadFormTestRequest'
-- Request to create test data for lead data test API.
--

CREATE TABLE IF NOT EXISTS `LeadFormTestRequest` (
  `answers` JSON NOT NULL COMMENT 'Test lead answers. Should follow the creation order.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Request to create test data for lead data test API.';

--
-- Table structure for table `LeadFormTestResponse` generated from model 'LeadFormTestResponse'
-- Response for lead data test API.
--

CREATE TABLE IF NOT EXISTS `LeadFormTestResponse` (
  `subscription_id` TEXT DEFAULT NULL COMMENT 'Subscription ID.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Response for lead data test API.';

--
-- Table structure for table `LeadFormUpdateRequest` generated from model 'LeadFormUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `LeadFormUpdateRequest` (
  `name` TEXT DEFAULT NULL COMMENT 'Internal name of the lead form.',
  `privacy_policy_link` TEXT DEFAULT NULL COMMENT 'A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.',
  `has_accepted_terms` TINYINT(1) DEFAULT NULL COMMENT 'Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO',
  `completion_message` TEXT DEFAULT NULL COMMENT 'A message for people who complete the form to let them know what happens next.',
  `status` TEXT DEFAULT NULL,
  `disclosure_language` TEXT DEFAULT NULL COMMENT 'Additional disclosure language to be included in the lead form.',
  `questions` JSON DEFAULT NULL COMMENT 'List of questions to be displayed on the lead form.',
  `policy_links` JSON DEFAULT NULL COMMENT 'List of additional policy links to be displayed on the lead form.',
  `id` TEXT NOT NULL COMMENT 'The ID of this lead form to be updated'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `lead_forms_list_200_response` generated from model 'leadUnderscoreformsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `lead_forms_list_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LeadsExportCreateRequest` generated from model 'LeadsExportCreateRequest'
--

CREATE TABLE IF NOT EXISTS `LeadsExportCreateRequest` (
  `start_date` TEXT NOT NULL COMMENT 'Export leads collected on and after start date (UTC). Format: YYYY-MM-DD',
  `end_date` TEXT NOT NULL COMMENT 'Export leads collected on and before end date (UTC). Format: YYYY-MM-DD',
  `ad_id` TEXT NOT NULL COMMENT 'ID for the ad collecting leads'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LeadsExportCreateResponse` generated from model 'LeadsExportCreateResponse'
--

CREATE TABLE IF NOT EXISTS `LeadsExportCreateResponse` (
  `leads_export_id` TEXT DEFAULT NULL COMMENT 'ID for the leads export job'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LeadsExportResponseData` generated from model 'LeadsExportResponseData'
--

CREATE TABLE IF NOT EXISTS `LeadsExportResponseData` (
  `export_status` TEXT DEFAULT NULL,
  `download_url` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LineItem` generated from model 'LineItem'
--

CREATE TABLE IF NOT EXISTS `LineItem` (
  `product_brand` TEXT DEFAULT NULL COMMENT 'Product brand. For example, \&quot;Parker\&quot;.',
  `product_category` TEXT DEFAULT NULL COMMENT 'Product category. For example, \&quot;Shoes\&quot;.',
  `product_id` INT DEFAULT NULL COMMENT 'Product ID. For example, 1414.',
  `product_name` TEXT DEFAULT NULL COMMENT 'Product name. For example, \&quot;Parker Boots\&quot;.',
  `product_price` TEXT DEFAULT NULL COMMENT 'Product price. For example, \&quot;99.99\&quot;.',
  `product_quantity` INT DEFAULT NULL COMMENT 'Product quantity. For example, 2.',
  `product_variant` TEXT DEFAULT NULL COMMENT 'Product variant. For example, \&quot;Red\&quot;.',
  `product_variant_id` TEXT DEFAULT NULL COMMENT 'Product variant ID. For example, \&quot;1414-34832\&quot;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LinkedBusiness` generated from model 'LinkedBusiness'
--

CREATE TABLE IF NOT EXISTS `LinkedBusiness` (
  `username` TEXT DEFAULT NULL COMMENT 'Username',
  `image_small_url` TEXT DEFAULT NULL COMMENT 'image_small_url',
  `image_medium_url` TEXT DEFAULT NULL COMMENT 'image_medium_url',
  `image_large_url` TEXT DEFAULT NULL COMMENT 'image_large_url',
  `image_xlarge_url` TEXT DEFAULT NULL COMMENT 'image_xlarge_url'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MaxPriceFilter` generated from model 'MaxPriceFilter'
--

CREATE TABLE IF NOT EXISTS `MaxPriceFilter` (
  `MAX_PRICE` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `media_list_200_response` generated from model 'mediaUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `media_list_200_response` (
  `items` JSON NOT NULL COMMENT 'Media',
  `bookmark` TEXT DEFAULT NULL
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
  `media_id` TEXT DEFAULT NULL COMMENT 'Unique identifier for this media upload. Used to track status and for attaching during Pin creation.',
  `media_type` TEXT DEFAULT NULL,
  `upload_url` TEXT DEFAULT NULL COMMENT 'The URL where you will POST your media file.',
  `upload_parameters` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Media upload that has been registered but not uploaded/processed yet.';

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
-- Table structure for table `MembersToDeleteBody` generated from model 'MembersToDeleteBody'
--

CREATE TABLE IF NOT EXISTS `MembersToDeleteBody` (
  `members` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MembersToDeleteBody_members_inner` generated from model 'MembersToDeleteBodyUnderscoremembersUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `MembersToDeleteBody_members_inner` (
  `member_id` VARCHAR(25) NOT NULL COMMENT 'Unique identifier of the member',
  `business_role` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MetricsResponse` generated from model 'MetricsResponse'
--

CREATE TABLE IF NOT EXISTS `MetricsResponse` (
  `data` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MinPriceFilter` generated from model 'MinPriceFilter'
--

CREATE TABLE IF NOT EXISTS `MinPriceFilter` (
  `MIN_PRICE` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `multiple_product_groups_inner` generated from model 'multipleUnderscoreproductUnderscoregroupsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `multiple_product_groups_inner` (
  `name` TEXT NOT NULL,
  `description` TEXT DEFAULT NULL,
  `is_featured` TINYINT(1) DEFAULT false COMMENT 'boolean indicator of whether the product group is being featured or not',
  `filters` TEXT NOT NULL,
  `feed_id` TEXT NOT NULL COMMENT 'Catalog Feed id pertaining to the catalog product group.',
  `catalog_type` ENUM('CREATIVE_ASSETS') NOT NULL,
  `catalog_id` TEXT NOT NULL COMMENT 'Catalog id pertaining to the creative assets product group.',
  `country` TEXT NOT NULL,
  `locale` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `OauthAccessTokenRequestClientCredentials` generated from model 'OauthAccessTokenRequestClientCredentials'
-- A request to receive a client token.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenRequestClientCredentials` (
  `grant_type` ENUM('authorization_code', 'refresh_token', 'client_credentials') NOT NULL,
  `scope` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A request to receive a client token.';

--
-- Table structure for table `OauthAccessTokenRequestCode` generated from model 'OauthAccessTokenRequestCode'
-- A request to exchange an authorization code for an access token.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenRequestCode` (
  `grant_type` ENUM('authorization_code', 'refresh_token', 'client_credentials') NOT NULL,
  `code` TEXT NOT NULL,
  `redirect_uri` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A request to exchange an authorization code for an access token.';

--
-- Table structure for table `OauthAccessTokenRequestRefresh` generated from model 'OauthAccessTokenRequestRefresh'
-- A request to exchange a refresh token for a new access token.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenRequestRefresh` (
  `grant_type` ENUM('authorization_code', 'refresh_token', 'client_credentials') NOT NULL,
  `refresh_token` TEXT NOT NULL,
  `scope` TEXT DEFAULT NULL,
  `refresh_on` TINYINT(1) DEFAULT NULL COMMENT 'Setting this field to &lt;code&gt;true&lt;/code&gt; will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \&quot;everlasting_refresh\&quot;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A request to exchange a refresh token for a new access token.';

--
-- Table structure for table `OauthAccessTokenResponse` generated from model 'OauthAccessTokenResponse'
-- A successful OAuth access token response.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenResponse` (
  `response_type` ENUM('authorization_code', 'refresh_token', 'client_credentials') DEFAULT NULL,
  `access_token` TEXT NOT NULL,
  `token_type` TEXT NOT NULL,
  `expires_in` INT NOT NULL,
  `scope` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A successful OAuth access token response.';

--
-- Table structure for table `OauthAccessTokenResponseClientCredentials` generated from model 'OauthAccessTokenResponseClientCredentials'
-- A successful OAuth client token response for the client token flow.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenResponseClientCredentials` (
  `response_type` ENUM('authorization_code', 'refresh_token', 'client_credentials') DEFAULT NULL,
  `access_token` TEXT NOT NULL,
  `token_type` TEXT NOT NULL,
  `expires_in` INT NOT NULL,
  `scope` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A successful OAuth client token response for the client token flow.';

--
-- Table structure for table `OauthAccessTokenResponseCode` generated from model 'OauthAccessTokenResponseCode'
-- A successful OAuth access token response for the authorization code flow.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenResponseCode` (
  `response_type` ENUM('authorization_code', 'refresh_token', 'client_credentials') DEFAULT NULL,
  `access_token` TEXT NOT NULL,
  `token_type` TEXT NOT NULL,
  `expires_in` INT NOT NULL,
  `scope` TEXT NOT NULL,
  `refresh_token` TEXT NOT NULL,
  `refresh_token_expires_in` INT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A successful OAuth access token response for the authorization code flow.';

--
-- Table structure for table `OauthAccessTokenResponseEverlastingRefresh` generated from model 'OauthAccessTokenResponseEverlastingRefresh'
-- A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenResponseEverlastingRefresh` (
  `response_type` ENUM('authorization_code', 'refresh_token', 'client_credentials') DEFAULT NULL,
  `access_token` TEXT NOT NULL,
  `token_type` TEXT NOT NULL,
  `expires_in` INT NOT NULL,
  `scope` TEXT NOT NULL,
  `refresh_token` TEXT NOT NULL,
  `refresh_token_expires_in` INT NOT NULL,
  `refresh_token_expires_at` INT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.';

--
-- Table structure for table `OauthAccessTokenResponseIntegrationRefresh` generated from model 'OauthAccessTokenResponseIntegrationRefresh'
-- A successful OAuth access token response for the refresh token flow, with an added refresh token.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenResponseIntegrationRefresh` (
  `response_type` ENUM('authorization_code', 'refresh_token', 'client_credentials') DEFAULT NULL,
  `access_token` TEXT NOT NULL,
  `token_type` TEXT NOT NULL,
  `expires_in` INT NOT NULL,
  `scope` TEXT NOT NULL,
  `refresh_token` TEXT NOT NULL,
  `refresh_token_expires_in` INT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A successful OAuth access token response for the refresh token flow, with an added refresh token.';

--
-- Table structure for table `OauthAccessTokenResponseRefresh` generated from model 'OauthAccessTokenResponseRefresh'
-- A successful OAuth access token response for the refresh token flow.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenResponseRefresh` (
  `response_type` ENUM('authorization_code', 'refresh_token', 'client_credentials') DEFAULT NULL,
  `access_token` TEXT NOT NULL,
  `token_type` TEXT NOT NULL,
  `expires_in` INT NOT NULL,
  `scope` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A successful OAuth access token response for the refresh token flow.';

--
-- Table structure for table `OptimizationGoalMetadata` generated from model 'OptimizationGoalMetadata'
--

CREATE TABLE IF NOT EXISTS `OptimizationGoalMetadata` (
  `conversion_tag_v3_goal_metadata` TEXT DEFAULT NULL,
  `frequency_goal_metadata` TEXT DEFAULT NULL,
  `scrollup_goal_metadata` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata` generated from model 'OptimizationGoalMetadataUnderscoreconversionUnderscoretagUnderscorev3UnderscoregoalUnderscoremetadata'
--

CREATE TABLE IF NOT EXISTS `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata` (
  `attribution_windows` TEXT DEFAULT NULL,
  `conversion_event` ENUM('PAGE_VISIT', 'SIGNUP', 'CHECKOUT', 'CUSTOM', 'VIEW_CATEGORY', 'SEARCH', 'ADD_TO_CART', 'WATCH_VIDEO', 'LEAD', 'APP_INSTALL') DEFAULT NULL,
  `conversion_tag_id` TEXT DEFAULT NULL,
  `cpa_goal_value_in_micro_currency` TEXT DEFAULT NULL,
  `is_roas_optimized` TINYINT(1) DEFAULT NULL COMMENT 'ROAS optimization is not supported',
  `learning_mode_type` ENUM('NOT_ACTIVE', 'ACTIVE', 'null') DEFAULT NULL COMMENT 'Conversion learning model type'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribu` generated from model 'OptimizationGoalMetadataUnderscoreconversionUnderscoretagUnderscorev3UnderscoregoalUnderscoremetadataUnderscoreattributionUnderscorewindows'
--

CREATE TABLE IF NOT EXISTS `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribu` (
  `click_window_days` INT DEFAULT NULL,
  `engagement_window_days` INT DEFAULT NULL,
  `view_window_days` INT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `OptimizationGoalMetadata_frequency_goal_metadata` generated from model 'OptimizationGoalMetadataUnderscorefrequencyUnderscoregoalUnderscoremetadata'
--

CREATE TABLE IF NOT EXISTS `OptimizationGoalMetadata_frequency_goal_metadata` (
  `frequency` INT DEFAULT NULL,
  `timerange` ENUM('THIRTY_DAY', 'DAY', 'SEVEN_DAY', 'TWENTY_MINUTE', 'TEN_MINUTE', 'TWENTY_FOUR_HOUR') DEFAULT NULL COMMENT 'User entity counts time range'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `OptimizationGoalMetadata_scrollup_goal_metadata` generated from model 'OptimizationGoalMetadataUnderscorescrollupUnderscoregoalUnderscoremetadata'
--

CREATE TABLE IF NOT EXISTS `OptimizationGoalMetadata_scrollup_goal_metadata` (
  `scrollup_goal_value_in_micro_currency` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `OrderLine` generated from model 'OrderLine'
--

CREATE TABLE IF NOT EXISTS `OrderLine` (
  `id` TEXT DEFAULT NULL COMMENT 'Order line ID.',
  `type` TEXT DEFAULT NULL COMMENT 'Always \&quot;orderline\&quot;.',
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Ad account ID.',
  `purchase_order_id` TEXT DEFAULT NULL COMMENT 'Purchase order ID.',
  `start_time` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Start time. Unix timestamp.',
  `end_time` DECIMAL(20, 9) DEFAULT NULL COMMENT 'End time. Unix timestamp.',
  `budget` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Order line budget in micro currency.',
  `paid_budget` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Order line paid budget in micro currency.',
  `status` TEXT DEFAULT NULL COMMENT 'Order line status.',
  `name` TEXT DEFAULT NULL COMMENT 'Order line name.',
  `paid_type` TEXT DEFAULT NULL COMMENT 'Order line paid type.',
  `campaign_ids` JSON NOT NULL COMMENT 'Associated List of campaign IDs.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `OrderLineError` generated from model 'OrderLineError'
--

CREATE TABLE IF NOT EXISTS `OrderLineError` (
  `data` TEXT DEFAULT NULL,
  `error_messages` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `OrderLineResponse` generated from model 'OrderLineResponse'
--

CREATE TABLE IF NOT EXISTS `OrderLineResponse` (
  `errors` JSON DEFAULT NULL COMMENT 'Error list if update(s) fail.',
  `order_line` JSON DEFAULT NULL COMMENT 'Order Line object array.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `OrderLineSingleResponse` generated from model 'OrderLineSingleResponse'
--

CREATE TABLE IF NOT EXISTS `OrderLineSingleResponse` (
  `data` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `OrderLines` generated from model 'OrderLines'
-- Order Line
--

CREATE TABLE IF NOT EXISTS `OrderLines` (
  `id` TEXT DEFAULT NULL COMMENT 'Order line ID.',
  `type` TEXT DEFAULT NULL COMMENT 'Always \&quot;orderline\&quot;.',
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'Ad account ID.',
  `purchase_order_id` TEXT DEFAULT NULL COMMENT 'Purchase order ID.',
  `start_time` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Start time. Unix timestamp.',
  `end_time` DECIMAL(20, 9) DEFAULT NULL COMMENT 'End time. Unix timestamp.',
  `budget` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Order line budget in micro currency.',
  `paid_budget` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Order line paid budget in micro currency.',
  `status` TEXT DEFAULT NULL COMMENT 'Order line status.',
  `name` TEXT DEFAULT NULL COMMENT 'Order line name.',
  `paid_type` TEXT DEFAULT NULL COMMENT 'Order line paid type.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Order Line';

--
-- Table structure for table `OrderLinesArrayResponse` generated from model 'OrderLinesArrayResponse'
--

CREATE TABLE IF NOT EXISTS `OrderLinesArrayResponse` (
  `items` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `order_lines_list_200_response` generated from model 'orderUnderscorelinesUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `order_lines_list_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `page_visit_conversion_tags_get_200_response` generated from model 'pageUnderscorevisitUnderscoreconversionUnderscoretagsUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `page_visit_conversion_tags_get_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

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
  `dominant_color` TEXT DEFAULT NULL COMMENT 'Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;.',
  `alt_text` TEXT DEFAULT NULL,
  `creative_type` TEXT DEFAULT NULL,
  `board_id` TEXT DEFAULT NULL COMMENT 'The board to which this Pin belongs.',
  `board_section_id` TEXT DEFAULT NULL COMMENT 'The board section to which this Pin belongs.',
  `board_owner` TEXT DEFAULT NULL,
  `is_owner` TINYINT(1) DEFAULT NULL COMMENT 'Whether the \&quot;operation user_account\&quot; is the Pin owner.',
  `media` TEXT DEFAULT NULL,
  `media_source` TEXT DEFAULT NULL,
  `parent_pin_id` TEXT DEFAULT NULL COMMENT 'The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;.',
  `is_standard` TINYINT(1) DEFAULT NULL COMMENT 'Whether the Pin is standard or not. See documentation on &lt;a href&#x3D;\&quot;/docs/api-features/content-overview/\&quot;&gt;Changes to Pin creation&lt;/a&gt; for more information.',
  `has_been_promoted` TINYINT(1) DEFAULT NULL COMMENT 'Whether the Pin has been promoted or not.',
  `note` TEXT DEFAULT NULL COMMENT 'Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;.',
  `pin_metrics` JSON DEFAULT NULL COMMENT 'Pin metrics with associated time intervals if any.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin';

--
-- Table structure for table `PinAnalyticsMetricsResponse` generated from model 'PinAnalyticsMetricsResponse'
--

CREATE TABLE IF NOT EXISTS `PinAnalyticsMetricsResponse` (
  `lifetime_metrics` JSON DEFAULT NULL COMMENT 'The lifetime metric name and value.',
  `daily_metrics` JSON DEFAULT NULL COMMENT 'Array with the requested daily metric records',
  `summary_metrics` JSON DEFAULT NULL COMMENT 'The metric name and value over the requested period for each requested metric'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PinAnalyticsMetricsResponse_daily_metrics_inner` generated from model 'PinAnalyticsMetricsResponseUnderscoredailyUnderscoremetricsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `PinAnalyticsMetricsResponse_daily_metrics_inner` (
  `data_status` TEXT DEFAULT NULL,
  `date` TEXT DEFAULT NULL COMMENT 'Metrics date (UTC): YYYY-MM-DD.',
  `metrics` JSON DEFAULT NULL COMMENT 'The metric name and daily value for each requested metric'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PinCreate` generated from model 'PinCreate'
-- Pin
--

CREATE TABLE IF NOT EXISTS `PinCreate` (
  `id` TEXT DEFAULT NULL,
  `created_at` DATETIME DEFAULT NULL,
  `link` TEXT DEFAULT NULL,
  `title` VARCHAR(100) DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `dominant_color` TEXT DEFAULT NULL COMMENT 'Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;.',
  `alt_text` TEXT DEFAULT NULL,
  `board_id` TEXT DEFAULT NULL COMMENT 'The board to which this Pin belongs.',
  `board_section_id` TEXT DEFAULT NULL COMMENT 'The board section to which this Pin belongs.',
  `board_owner` TEXT DEFAULT NULL,
  `media` TEXT DEFAULT NULL,
  `media_source` TEXT DEFAULT NULL,
  `parent_pin_id` TEXT DEFAULT NULL COMMENT 'The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;.',
  `note` TEXT DEFAULT NULL COMMENT 'Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin';

--
-- Table structure for table `PinMedia` generated from model 'PinMedia'
-- Pin media objects.
--

CREATE TABLE IF NOT EXISTS `PinMedia` (
  `media_type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin media objects.';

--
-- Table structure for table `PinMediaMetadata` generated from model 'PinMediaMetadata'
--

CREATE TABLE IF NOT EXISTS `PinMediaMetadata` (
  `item_type` TEXT DEFAULT NULL,
  `title` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `link` TEXT DEFAULT NULL,
  `images` TEXT DEFAULT NULL,
  `cover_image_url` TEXT DEFAULT NULL,
  `video_url` TEXT DEFAULT NULL COMMENT 'Video url (720p). &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is limited and not available to all apps.',
  `duration` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Duration (in milliseconds)',
  `height` INT DEFAULT NULL COMMENT 'Height (in pixels)',
  `width` INT DEFAULT NULL COMMENT 'Width (in pixels)'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PinMediaSource` generated from model 'PinMediaSource'
-- Pin media source.
--

CREATE TABLE IF NOT EXISTS `PinMediaSource` (
  `source_type` ENUM('pin_url') NOT NULL,
  `content_type` ENUM('image/jpeg', 'image/png') NOT NULL,
  `data` TEXT NOT NULL,
  `is_standard` TINYINT(1) DEFAULT true COMMENT 'Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.',
  `url` TEXT NOT NULL,
  `cover_image_url` TEXT DEFAULT NULL COMMENT 'Cover image url.',
  `cover_image_content_type` ENUM('image/jpeg', 'image/png') DEFAULT NULL COMMENT 'Content type for cover image Base64.',
  `cover_image_data` TEXT DEFAULT NULL COMMENT 'Cover image Base64.',
  `media_id` TEXT NOT NULL,
  `items` JSON NOT NULL COMMENT 'Array with image objects.',
  `index` INT UNSIGNED DEFAULT NULL,
  `is_affiliate_link` TINYINT(1) DEFAULT false COMMENT 'This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin media source.';

--
-- Table structure for table `PinMediaSourceImageBase64` generated from model 'PinMediaSourceImageBase64'
-- Base64-encoded image media source
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImageBase64` (
  `source_type` ENUM('image_base64') NOT NULL,
  `content_type` ENUM('image/jpeg', 'image/png') NOT NULL,
  `data` TEXT NOT NULL,
  `is_standard` TINYINT(1) DEFAULT true COMMENT 'Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Base64-encoded image media source';

--
-- Table structure for table `PinMediaSourceImageURL` generated from model 'PinMediaSourceImageURL'
-- Image URL-based media source
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImageURL` (
  `source_type` ENUM('image_url') NOT NULL,
  `url` TEXT NOT NULL,
  `is_standard` TINYINT(1) DEFAULT true COMMENT 'Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Image URL-based media source';

--
-- Table structure for table `PinMediaSourceImagesBase64` generated from model 'PinMediaSourceImagesBase64'
-- Multiple Base64-encoded images media source
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImagesBase64` (
  `source_type` ENUM('multiple_image_base64') DEFAULT NULL,
  `items` JSON NOT NULL COMMENT 'Array with image objects.',
  `index` INT UNSIGNED DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Multiple Base64-encoded images media source';

--
-- Table structure for table `PinMediaSourceImagesBase64_items_inner` generated from model 'PinMediaSourceImagesBase64UnderscoreitemsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImagesBase64_items_inner` (
  `title` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `link` TEXT DEFAULT NULL COMMENT 'Destination link for the image.',
  `content_type` ENUM('image/jpeg', 'image/png') NOT NULL,
  `data` TEXT NOT NULL COMMENT 'Image to upload as base64 string.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PinMediaSourceImagesURL` generated from model 'PinMediaSourceImagesURL'
-- Multiple images urls-based media source
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImagesURL` (
  `source_type` ENUM('multiple_image_urls') DEFAULT NULL,
  `items` JSON NOT NULL COMMENT 'Array with image objects.',
  `index` INT UNSIGNED DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Multiple images urls-based media source';

--
-- Table structure for table `PinMediaSourceImagesURL_items_inner` generated from model 'PinMediaSourceImagesURLUnderscoreitemsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImagesURL_items_inner` (
  `title` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL,
  `link` TEXT DEFAULT NULL COMMENT 'Destination link for the image.',
  `url` TEXT NOT NULL COMMENT 'URL of image to upload.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PinMediaSourcePinURL` generated from model 'PinMediaSourcePinURL'
-- Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
--

CREATE TABLE IF NOT EXISTS `PinMediaSourcePinURL` (
  `source_type` ENUM('pin_url') NOT NULL,
  `is_affiliate_link` TINYINT(1) DEFAULT false COMMENT 'This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.';

--
-- Table structure for table `PinMediaSourceVideoID` generated from model 'PinMediaSourceVideoID'
-- Video ID-based media source
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceVideoID` (
  `source_type` ENUM('video_id') NOT NULL,
  `cover_image_url` TEXT DEFAULT NULL COMMENT 'Cover image url.',
  `cover_image_content_type` ENUM('image/jpeg', 'image/png') DEFAULT NULL COMMENT 'Content type for cover image Base64.',
  `cover_image_data` TEXT DEFAULT NULL COMMENT 'Cover image Base64.',
  `media_id` TEXT NOT NULL,
  `is_standard` TINYINT(1) DEFAULT true COMMENT 'Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Video ID-based media source';

--
-- Table structure for table `PinMediaWithImage` generated from model 'PinMediaWithImage'
-- Pin with image.
--

CREATE TABLE IF NOT EXISTS `PinMediaWithImage` (
  `media_type` TEXT DEFAULT NULL,
  `images` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin with image.';

--
-- Table structure for table `PinMediaWithImage_allOf_images` generated from model 'PinMediaWithImageUnderscoreallOfUnderscoreimages'
--

CREATE TABLE IF NOT EXISTS `PinMediaWithImage_allOf_images` (
  `150x150` JSON DEFAULT NULL,
  `400x300` JSON DEFAULT NULL,
  `600x` JSON DEFAULT NULL,
  `1200x` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PinMediaWithImageAndVideo` generated from model 'PinMediaWithImageAndVideo'
-- Pin with a mix of images and videos.
--

CREATE TABLE IF NOT EXISTS `PinMediaWithImageAndVideo` (
  `media_type` TEXT DEFAULT NULL,
  `items` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin with a mix of images and videos.';

--
-- Table structure for table `PinMediaWithImages` generated from model 'PinMediaWithImages'
-- Pin with multiple images.
--

CREATE TABLE IF NOT EXISTS `PinMediaWithImages` (
  `media_type` TEXT DEFAULT NULL,
  `items` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin with multiple images.';

--
-- Table structure for table `PinMediaWithVideo` generated from model 'PinMediaWithVideo'
-- Pin with video.
--

CREATE TABLE IF NOT EXISTS `PinMediaWithVideo` (
  `media_type` TEXT DEFAULT NULL,
  `images` TEXT DEFAULT NULL,
  `cover_image_url` TEXT DEFAULT NULL,
  `video_url` TEXT DEFAULT NULL COMMENT 'Video url (720p). &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is limited and not available to all apps.',
  `duration` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Duration (in milliseconds)',
  `height` INT DEFAULT NULL COMMENT 'Height (in pixels)',
  `width` INT DEFAULT NULL COMMENT 'Width (in pixels)'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin with video.';

--
-- Table structure for table `PinMediaWithVideos` generated from model 'PinMediaWithVideos'
-- Pin with multiple videos.
--

CREATE TABLE IF NOT EXISTS `PinMediaWithVideos` (
  `media_type` TEXT DEFAULT NULL,
  `items` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin with multiple videos.';

--
-- Table structure for table `PinUpdate` generated from model 'PinUpdate'
-- Pin fields for updates
--

CREATE TABLE IF NOT EXISTS `PinUpdate` (
  `alt_text` TEXT DEFAULT NULL COMMENT 'Pin&#39;s alternative text.',
  `board_id` TEXT DEFAULT NULL COMMENT 'The id of the board to move the Pin onto.',
  `board_section_id` TEXT DEFAULT NULL COMMENT '&lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/create-a-board-section\&quot;&gt;Board section&lt;/a&gt; ID.',
  `description` TEXT DEFAULT NULL COMMENT 'Pin description - 800 characters maximum.',
  `link` TEXT DEFAULT NULL COMMENT 'URL viewer is taken to when they click pin.',
  `title` VARCHAR(100) DEFAULT NULL COMMENT 'The native pin title that creators explicitly prefer to display.',
  `carousel_slots` JSON DEFAULT NULL COMMENT 'Carousel Pin slots data.',
  `note` TEXT DEFAULT NULL COMMENT 'Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Pin fields for updates';

--
-- Table structure for table `PinUpdate_carousel_slots_inner` generated from model 'PinUpdateUnderscorecarouselUnderscoreslotsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `PinUpdate_carousel_slots_inner` (
  `title` TEXT DEFAULT NULL COMMENT 'Carousel Pin slot title.',
  `description` TEXT DEFAULT NULL COMMENT 'Carousel Pin slot description.',
  `link` TEXT DEFAULT NULL COMMENT 'Carousel Pin slot link.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `pins_list_200_response` generated from model 'pinsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `pins_list_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `pins_save_request` generated from model 'pinsUnderscoresaveUnderscorerequest'
--

CREATE TABLE IF NOT EXISTS `pins_save_request` (
  `board_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of the board to which the pin will be saved.',
  `board_section_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of the board section to which the pin will be saved.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PinterestTagEventData` generated from model 'PinterestTagEventData'
-- Optional for VISITOR &#x60;audience_type&#x60;. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’ s &#x60;rule&#x60;; however, you **must** specify an &#x60;event&#x60; for the &#x60;event_data&#x60; fields to be evaluated. Besides what’s listed, you can also create your own set of &#x60;event_data&#x60; fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields&#39; data.&lt;br&gt;Examples per &#x60;event&#x60; type:&lt;br&gt;&#x60;pagevisit&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;page_name\&quot;: \&quot;My online store 123 | view items | shoe\&quot; }&lt;br&gt;&#x60;signup&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;New release promotion\&quot; }&lt;br&gt;&#x60;checkout&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 116, \&quot;order_quantity\&quot;: 2, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Pillows (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;11\&quot;, \&quot;product_price\&quot;: 48, \&quot;product_quantity\&quot;: 1 }, { \&quot;product_name\&quot;: \&quot;Pillows, Large (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;15\&quot;, \&quot;product_price\&quot;: 68, \&quot;product_quantity\&quot;: 1 } ] }&lt;br&gt;&#x60;addtocart&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 499, \&quot;order_quantity\&quot;: 1, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Red leather boots\&quot;, \&quot;product_id\&quot;: \&quot;3486\&quot;, \&quot;product_category\&quot;: \&quot;shoe\&quot;, \&quot;product_variant_id\&quot;: \&quot;JB11103000\&quot;, \&quot;product_price\&quot;: 499, \&quot;product_quantity\&quot;: \&quot;1\&quot; , \&quot;product_brand\&quot;: \&quot;My brand\&quot; }]}&lt;br&gt;&#x60;watchvideo&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;video_title\&quot;: \&quot;My Product Video 01\&quot; }&lt;br&gt;&#x60;lead&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;Newsletter\&quot; }
--

CREATE TABLE IF NOT EXISTS `PinterestTagEventData` (
  `currency` TEXT DEFAULT NULL,
  `lead_type` TEXT DEFAULT NULL COMMENT 'Promotion code. For example, \&quot;Newsletter\&quot;.',
  `line_items` TEXT DEFAULT NULL,
  `order_id` TEXT DEFAULT NULL COMMENT 'Order ID. For example, \&quot;X-151481\&quot;.',
  `order_quantity` INT DEFAULT NULL COMMENT 'Order quantity. For example, 1.',
  `page_name` TEXT DEFAULT NULL COMMENT 'Page name. For example, \&quot;Our Favorite Pins on Pinterest\&quot;.',
  `promo_code` TEXT DEFAULT NULL COMMENT 'Promotion code. For example, \&quot;WINTER10\&quot;.',
  `property` TEXT DEFAULT NULL COMMENT 'Property. For example, \&quot;Athleta\&quot;.',
  `search_query` TEXT DEFAULT NULL COMMENT 'Search query string. For example, \&quot;boots\&quot;.',
  `value` TEXT DEFAULT NULL COMMENT 'Product value. For example, \&quot;199.98\&quot;',
  `video_title` TEXT DEFAULT NULL COMMENT 'Video title. For example, \&quot;How to style your Parker Boots\&quot;.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Optional for VISITOR &#x60;audience_type&#x60;. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’ s &#x60;rule&#x60;; however, you **must** specify an &#x60;event&#x60; for the &#x60;event_data&#x60; fields to be evaluated. Besides what’s listed, you can also create your own set of &#x60;event_data&#x60; fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields&#39; data.&lt;br&gt;Examples per &#x60;event&#x60; type:&lt;br&gt;&#x60;pagevisit&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;page_name\&quot;: \&quot;My online store 123 | view items | shoe\&quot; }&lt;br&gt;&#x60;signup&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;New release promotion\&quot; }&lt;br&gt;&#x60;checkout&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 116, \&quot;order_quantity\&quot;: 2, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Pillows (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;11\&quot;, \&quot;product_price\&quot;: 48, \&quot;product_quantity\&quot;: 1 }, { \&quot;product_name\&quot;: \&quot;Pillows, Large (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;15\&quot;, \&quot;product_price\&quot;: 68, \&quot;product_quantity\&quot;: 1 } ] }&lt;br&gt;&#x60;addtocart&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 499, \&quot;order_quantity\&quot;: 1, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Red leather boots\&quot;, \&quot;product_id\&quot;: \&quot;3486\&quot;, \&quot;product_category\&quot;: \&quot;shoe\&quot;, \&quot;product_variant_id\&quot;: \&quot;JB11103000\&quot;, \&quot;product_price\&quot;: 499, \&quot;product_quantity\&quot;: \&quot;1\&quot; , \&quot;product_brand\&quot;: \&quot;My brand\&quot; }]}&lt;br&gt;&#x60;watchvideo&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;video_title\&quot;: \&quot;My Product Video 01\&quot; }&lt;br&gt;&#x60;lead&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;Newsletter\&quot; }';

--
-- Table structure for table `PlacementMultipliers` generated from model 'PlacementMultipliers'
-- This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
--

CREATE TABLE IF NOT EXISTS `PlacementMultipliers` (
  `PLACEMENT` ENUM('SEARCH', 'BROWSE') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).';

--
-- Table structure for table `PriceFilter` generated from model 'PriceFilter'
--

CREATE TABLE IF NOT EXISTS `PriceFilter` (
  `PRICE` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ProductGroupAnalyticsResponse_inner` generated from model 'ProductGroupAnalyticsResponseUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `ProductGroupAnalyticsResponse_inner` (
  `PRODUCT_GROUP_ID` TEXT NOT NULL COMMENT 'The ID of the product group that this metrics belongs to.',
  `DATE` DATE DEFAULT NULL COMMENT 'Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ProductGroupPromotion` generated from model 'ProductGroupPromotion'
--

CREATE TABLE IF NOT EXISTS `ProductGroupPromotion` (
  `id` TEXT DEFAULT NULL COMMENT 'ID of the product group promotion.',
  `ad_group_id` TEXT DEFAULT NULL COMMENT 'ID of the ad group the product group belongs to.',
  `bid_in_micro_currency` INT DEFAULT NULL COMMENT 'The bid in micro currency.',
  `included` TINYINT(1) DEFAULT NULL COMMENT 'True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.',
  `definition` TEXT DEFAULT NULL COMMENT 'The full product group definition path',
  `relative_definition` TEXT DEFAULT NULL COMMENT 'The definition of the product group, relative to its parent - an attribute name/value pair',
  `parent_id` TEXT DEFAULT NULL COMMENT 'The parent Product Group ID of this Product Group',
  `slideshow_collections_title` TEXT DEFAULT NULL COMMENT 'Slideshow Collections Title',
  `slideshow_collections_description` TEXT DEFAULT NULL COMMENT 'Slideshow Collections Description',
  `is_mdl` TINYINT(1) DEFAULT NULL COMMENT 'If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog',
  `status` TEXT DEFAULT NULL,
  `tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking template for proudct group promotions. 4000 limit',
  `catalog_product_group_id` TEXT DEFAULT NULL COMMENT 'ID of the catalogs product group that this product group promotion references',
  `catalog_product_group_name` TEXT DEFAULT NULL COMMENT 'Catalogs product group name',
  `collections_hero_pin_id` TEXT DEFAULT NULL COMMENT 'Hero Pin ID if this PG is promoted as a Collection',
  `collections_hero_destination_url` TEXT DEFAULT NULL COMMENT 'Collections Hero Destination Url',
  `grid_click_type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ProductGroupPromotionCreateRequest` generated from model 'ProductGroupPromotionCreateRequest'
--

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionCreateRequest` (
  `ad_group_id` TEXT NOT NULL COMMENT 'ID of the Ad Group the Product Group Promotion belongs to.',
  `product_group_promotion` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ProductGroupPromotionCreateRequestElement` generated from model 'ProductGroupPromotionCreateRequestElement'
--

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionCreateRequestElement` (
  `id` TEXT DEFAULT NULL COMMENT 'ID of the product group promotion.',
  `ad_group_id` TEXT DEFAULT NULL COMMENT 'ID of the ad group the product group belongs to.',
  `bid_in_micro_currency` INT DEFAULT NULL COMMENT 'The bid in micro currency.',
  `included` TINYINT(1) DEFAULT NULL COMMENT 'True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.',
  `definition` TEXT DEFAULT NULL COMMENT 'The full product group definition path',
  `relative_definition` TEXT DEFAULT NULL COMMENT 'The definition of the product group, relative to its parent - an attribute name/value pair',
  `parent_id` TEXT DEFAULT NULL COMMENT 'The parent Product Group ID of this Product Group',
  `slideshow_collections_title` TEXT DEFAULT NULL COMMENT 'Slideshow Collections Title',
  `slideshow_collections_description` TEXT DEFAULT NULL COMMENT 'Slideshow Collections Description',
  `is_mdl` TINYINT(1) DEFAULT NULL COMMENT 'If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog',
  `status` TEXT DEFAULT NULL,
  `tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking template for proudct group promotions. 4000 limit',
  `catalog_product_group_id` TEXT DEFAULT NULL COMMENT 'ID of the catalogs product group that this product group promotion references',
  `catalog_product_group_name` TEXT DEFAULT NULL COMMENT 'Catalogs product group name',
  `collections_hero_pin_id` TEXT DEFAULT NULL COMMENT 'Hero Pin ID if this PG is promoted as a Collection',
  `collections_hero_destination_url` TEXT DEFAULT NULL COMMENT 'Collections Hero Destination Url',
  `grid_click_type` TEXT DEFAULT NULL,
  `creative_type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ProductGroupPromotionResponse` generated from model 'ProductGroupPromotionResponse'
--

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionResponse` (
  `items` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ProductGroupPromotionResponseElement` generated from model 'ProductGroupPromotionResponseElement'
--

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionResponseElement` (
  `id` TEXT DEFAULT NULL COMMENT 'ID of the product group promotion.',
  `ad_group_id` TEXT DEFAULT NULL COMMENT 'ID of the ad group the product group belongs to.',
  `bid_in_micro_currency` INT DEFAULT NULL COMMENT 'The bid in micro currency.',
  `included` TINYINT(1) DEFAULT NULL COMMENT 'True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.',
  `definition` TEXT DEFAULT NULL COMMENT 'The full product group definition path',
  `relative_definition` TEXT DEFAULT NULL COMMENT 'The definition of the product group, relative to its parent - an attribute name/value pair',
  `parent_id` TEXT DEFAULT NULL COMMENT 'The parent Product Group ID of this Product Group',
  `slideshow_collections_title` TEXT DEFAULT NULL COMMENT 'Slideshow Collections Title',
  `slideshow_collections_description` TEXT DEFAULT NULL COMMENT 'Slideshow Collections Description',
  `is_mdl` TINYINT(1) DEFAULT NULL COMMENT 'If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog',
  `status` TEXT DEFAULT NULL,
  `tracking_url` TEXT DEFAULT NULL COMMENT 'Tracking template for proudct group promotions. 4000 limit',
  `catalog_product_group_id` TEXT DEFAULT NULL COMMENT 'ID of the catalogs product group that this product group promotion references',
  `catalog_product_group_name` TEXT DEFAULT NULL COMMENT 'Catalogs product group name',
  `collections_hero_pin_id` TEXT DEFAULT NULL COMMENT 'Hero Pin ID if this PG is promoted as a Collection',
  `collections_hero_destination_url` TEXT DEFAULT NULL COMMENT 'Collections Hero Destination Url',
  `grid_click_type` TEXT DEFAULT NULL,
  `creative_type` TEXT DEFAULT NULL
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
-- Table structure for table `product_group_promotions_list_200_response` generated from model 'productUnderscoregroupUnderscorepromotionsUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `product_group_promotions_list_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ProductGroupReferenceFilter` generated from model 'ProductGroupReferenceFilter'
--

CREATE TABLE IF NOT EXISTS `ProductGroupReferenceFilter` (
  `PRODUCT_GROUP` TEXT NOT NULL
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
-- Table structure for table `QuizPinData` generated from model 'QuizPinData'
-- This field includes all quiz data including questions, options, and results.
--

CREATE TABLE IF NOT EXISTS `QuizPinData` (
  `questions` JSON DEFAULT NULL,
  `results` JSON DEFAULT NULL,
  `tie_breaker_type` ENUM('RANDOM', 'CUSTOM') DEFAULT NULL COMMENT 'Quiz ad tie breaker type, default is RANDOM',
  `tie_breaker_custom_result` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='This field includes all quiz data including questions, options, and results.';

--
-- Table structure for table `QuizPinOption` generated from model 'QuizPinOption'
--  This field contains multiple options to a quiz question.
--

CREATE TABLE IF NOT EXISTS `QuizPinOption` (
  `id` DECIMAL(20, 9) DEFAULT NULL,
  `text` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT=' This field contains multiple options to a quiz question.';

--
-- Table structure for table `QuizPinQuestion` generated from model 'QuizPinQuestion'
-- A specific quiz inquiry.
--

CREATE TABLE IF NOT EXISTS `QuizPinQuestion` (
  `question_id` DECIMAL(20, 9) DEFAULT NULL,
  `question_text` TEXT DEFAULT NULL,
  `options` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A specific quiz inquiry.';

--
-- Table structure for table `QuizPinResult` generated from model 'QuizPinResult'
-- The result, and link out, based on the user’s choice.
--

CREATE TABLE IF NOT EXISTS `QuizPinResult` (
  `organic_pin_id` TEXT DEFAULT NULL,
  `android_deep_link` TEXT DEFAULT NULL,
  `ios_deep_link` TEXT DEFAULT NULL,
  `destination_url` TEXT DEFAULT NULL,
  `result_id` DECIMAL(20, 9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The result, and link out, based on the user’s choice.';

--
-- Table structure for table `RelatedTerms` generated from model 'RelatedTerms'
--

CREATE TABLE IF NOT EXISTS `RelatedTerms` (
  `id` TEXT DEFAULT NULL COMMENT 'First input term. For example, if you pass \&quot;?terms&#x3D;clothes,workout\&quot;, then id will be \&quot;clothes\&quot;',
  `related_term_count` INT DEFAULT NULL COMMENT 'Total number of related terms returned',
  `related_terms_list` JSON DEFAULT NULL COMMENT 'The id of the advertiser.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RelatedTerms_related_terms_list_inner` generated from model 'RelatedTermsUnderscorerelatedUnderscoretermsUnderscorelistUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `RelatedTerms_related_terms_list_inner` (
  `term` TEXT DEFAULT NULL,
  `related_terms` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `reports_stats_200_response` generated from model 'reportsUnderscorestatsUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `reports_stats_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RespondToInvitesResponseArray` generated from model 'RespondToInvitesResponseArray'
--

CREATE TABLE IF NOT EXISTS `RespondToInvitesResponseArray` (
  `items` JSON DEFAULT NULL COMMENT 'List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RespondToInvitesResponseArray_items_inner` generated from model 'RespondToInvitesResponseArrayUnderscoreitemsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `RespondToInvitesResponseArray_items_inner` (
  `exception` TEXT DEFAULT NULL,
  `invite` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SSIOAccountAddress` generated from model 'SSIOAccountAddress'
--

CREATE TABLE IF NOT EXISTS `SSIOAccountAddress` (
  `display` TEXT DEFAULT NULL COMMENT 'Address display',
  `purpose` TEXT DEFAULT NULL COMMENT 'Purpose for which the address is used, usually Billing or Businness',
  `address_id` TEXT DEFAULT NULL COMMENT 'Salesforce id for address',
  `order_legal_entity` TEXT DEFAULT NULL COMMENT 'Legal entity for this insertion order'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SSIOAccountItem` generated from model 'SSIOAccountItem'
--

CREATE TABLE IF NOT EXISTS `SSIOAccountItem` (
  `id` TEXT DEFAULT NULL COMMENT 'Salesforce id for billto_info',
  `io_terms_id` TEXT DEFAULT NULL COMMENT 'Salesforce id for IO Terms and Conditions',
  `io_terms` TEXT DEFAULT NULL COMMENT 'Salesforce text for IO Terms and Conditions',
  `us_terms_id` TEXT DEFAULT NULL COMMENT 'Salesforce id for US Terms and Conditions',
  `us_terms` TEXT DEFAULT NULL COMMENT 'Salesforce text for US Terms and Conditions',
  `row_terms_id` TEXT DEFAULT NULL COMMENT 'Salesforce id for Rest of the World Terms and Conditions',
  `row_terms` TEXT DEFAULT NULL COMMENT 'Salesforce text for Rest of the World Terms and Conditions',
  `io_type` TEXT DEFAULT NULL COMMENT 'Insertion Order Type - Pinterest Paper or Agency Paper',
  `addresses` JSON DEFAULT NULL COMMENT 'Address information that is associated with this account.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SSIOAccountPMPName` generated from model 'SSIOAccountPMPName'
--

CREATE TABLE IF NOT EXISTS `SSIOAccountPMPName` (
  `name` TEXT DEFAULT NULL COMMENT 'Display name',
  `id` TEXT DEFAULT NULL COMMENT 'Salesforce id for PMP'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SSIOAccountResponse` generated from model 'SSIOAccountResponse'
--

CREATE TABLE IF NOT EXISTS `SSIOAccountResponse` (
  `eligible` TINYINT(1) DEFAULT NULL COMMENT 'Advertiser eligible to create order lines',
  `can_edit` TINYINT(1) DEFAULT NULL COMMENT 'Advertiser eligible to update order lines',
  `billto_infos` JSON DEFAULT NULL COMMENT 'An array of Salesforce account information that includes address, io terms, etc.',
  `currency` TEXT DEFAULT NULL,
  `pmp_names` JSON DEFAULT NULL,
  `error` TEXT DEFAULT NULL COMMENT 'Error indicator from Salesforce which could be \&quot;No Error\&quot;'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SSIOCreateInsertionOrderRequest` generated from model 'SSIOCreateInsertionOrderRequest'
--

CREATE TABLE IF NOT EXISTS `SSIOCreateInsertionOrderRequest` (
  `start_date` TEXT NOT NULL COMMENT 'Starting date of time period. Format: YYYY-MM-DD',
  `end_date` TEXT DEFAULT NULL COMMENT 'End date of time period. Format: YYYY-MM-DD',
  `po_number` TEXT NOT NULL COMMENT 'The po number',
  `budget_amount` DECIMAL(20, 9) DEFAULT NULL COMMENT 'If Budget order line, the budget amount.',
  `billing_contact_firstname` TEXT NOT NULL COMMENT 'The billing contact first name',
  `billing_contact_lastname` TEXT NOT NULL COMMENT 'The billing contact last name',
  `billing_contact_email` TEXT NOT NULL COMMENT 'The billing contact email',
  `media_contact_firstname` TEXT NOT NULL COMMENT 'The media contact first name',
  `media_contact_lastname` TEXT NOT NULL COMMENT 'The media contact last name',
  `media_contact_email` TEXT NOT NULL COMMENT 'The media contact email',
  `agency_link` TEXT DEFAULT NULL COMMENT 'URL link for agency',
  `user_email` TEXT DEFAULT NULL COMMENT 'The email of user submitting the insertion order',
  `accepted_terms_time` INT DEFAULT NULL COMMENT 'The UTC timestamp (to the nearest sec) of when terms were accepted',
  `pmp_id` TEXT NOT NULL COMMENT 'The pmp id',
  `order_name` TEXT NOT NULL COMMENT 'The order name',
  `order_line_type` ENUM('BUDGET', 'PERPETUALS') NOT NULL COMMENT 'Type can be Budget or Perpetual',
  `accepted_terms_id` TEXT NOT NULL COMMENT 'The SFDC id for the terms',
  `billto_company_id` TEXT NOT NULL COMMENT 'The bill-to company id',
  `billto_business_address_id` TEXT NOT NULL COMMENT 'The bill-to business address id',
  `billto_billing_address_id` TEXT NOT NULL COMMENT 'The bill-to billing address id',
  `estimated_monthly_spend` DECIMAL(20, 9) DEFAULT NULL COMMENT 'If Ongoing (perpetual) order line, the estimated monthly spend',
  `currency_info` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SSIOCreateInsertionOrderResponse` generated from model 'SSIOCreateInsertionOrderResponse'
--

CREATE TABLE IF NOT EXISTS `SSIOCreateInsertionOrderResponse` (
  `pin_order_id` TEXT DEFAULT NULL COMMENT 'Salesforce order id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SSIOEditInsertionOrderRequest` generated from model 'SSIOEditInsertionOrderRequest'
--

CREATE TABLE IF NOT EXISTS `SSIOEditInsertionOrderRequest` (
  `start_date` TEXT DEFAULT NULL COMMENT 'Starting date of time period. Format: YYYY-MM-DD',
  `end_date` TEXT DEFAULT NULL COMMENT 'End date of time period. Format: YYYY-MM-DD',
  `po_number` TEXT DEFAULT NULL COMMENT 'The po number',
  `budget_amount` DECIMAL(20, 9) DEFAULT NULL COMMENT 'If Budget order line, the budget amount.',
  `billing_contact_firstname` TEXT DEFAULT NULL COMMENT 'The billing contact first name',
  `billing_contact_lastname` TEXT DEFAULT NULL COMMENT 'The billing contact last name',
  `billing_contact_email` TEXT DEFAULT NULL COMMENT 'The billing contact email',
  `media_contact_firstname` TEXT DEFAULT NULL COMMENT 'The media contact first name',
  `media_contact_lastname` TEXT DEFAULT NULL COMMENT 'The media contact last name',
  `media_contact_email` TEXT DEFAULT NULL COMMENT 'The media contact email',
  `agency_link` TEXT DEFAULT NULL COMMENT 'URL link for agency',
  `user_email` TEXT DEFAULT NULL COMMENT 'The email of user submitting the insertion order',
  `oracle_line_id` TEXT DEFAULT NULL COMMENT 'LineId in the Oracle DB',
  `salesforce_order_id` TEXT DEFAULT NULL COMMENT 'OrderId in SFDC',
  `salesforce_order_line_id` TEXT DEFAULT NULL COMMENT 'OrderLineId in SFDC',
  `ads_manager_order_line_id` TEXT DEFAULT NULL COMMENT 'Ads manager OrderLineId'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SSIOEditInsertionOrderResponse` generated from model 'SSIOEditInsertionOrderResponse'
--

CREATE TABLE IF NOT EXISTS `SSIOEditInsertionOrderResponse` (
  `pin_order_id` TEXT DEFAULT NULL COMMENT 'Salesforce order id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SSIOInsertionOrderCommon` generated from model 'SSIOInsertionOrderCommon'
--

CREATE TABLE IF NOT EXISTS `SSIOInsertionOrderCommon` (
  `start_date` TEXT DEFAULT NULL COMMENT 'Starting date of time period. Format: YYYY-MM-DD',
  `end_date` TEXT DEFAULT NULL COMMENT 'End date of time period. Format: YYYY-MM-DD',
  `po_number` TEXT DEFAULT NULL COMMENT 'The po number',
  `budget_amount` DECIMAL(20, 9) DEFAULT NULL COMMENT 'If Budget order line, the budget amount.',
  `billing_contact_firstname` TEXT DEFAULT NULL COMMENT 'The billing contact first name',
  `billing_contact_lastname` TEXT DEFAULT NULL COMMENT 'The billing contact last name',
  `billing_contact_email` TEXT DEFAULT NULL COMMENT 'The billing contact email',
  `media_contact_firstname` TEXT DEFAULT NULL COMMENT 'The media contact first name',
  `media_contact_lastname` TEXT DEFAULT NULL COMMENT 'The media contact last name',
  `media_contact_email` TEXT DEFAULT NULL COMMENT 'The media contact email',
  `agency_link` TEXT DEFAULT NULL COMMENT 'URL link for agency',
  `user_email` TEXT DEFAULT NULL COMMENT 'The email of user submitting the insertion order'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SSIOInsertionOrderStatus` generated from model 'SSIOInsertionOrderStatus'
--

CREATE TABLE IF NOT EXISTS `SSIOInsertionOrderStatus` (
  `pin_order_id` TEXT DEFAULT NULL COMMENT 'Salesforce order id',
  `status` TEXT DEFAULT NULL COMMENT 'Salesforce insertion order status',
  `creation_time` TEXT DEFAULT NULL COMMENT 'Salesforce insertion order creation time'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SSIOInsertionOrderStatusResponse` generated from model 'SSIOInsertionOrderStatusResponse'
--

CREATE TABLE IF NOT EXISTS `SSIOInsertionOrderStatusResponse` (
  `pin_order_id` TEXT DEFAULT NULL COMMENT 'Salesforce order id',
  `status` TEXT DEFAULT NULL COMMENT 'Salesforce insertion order status',
  `creation_time` TEXT DEFAULT NULL COMMENT 'Salesforce insertion order creation time'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SSIOOrderLine` generated from model 'SSIOOrderLine'
--

CREATE TABLE IF NOT EXISTS `SSIOOrderLine` (
  `salesforce_order_line_id` TEXT DEFAULT NULL COMMENT 'OrderLineId in SFDC',
  `ads_manager_order_line_id` TEXT DEFAULT NULL COMMENT 'Ads manager OrderLineId',
  `pin_order_id` TEXT DEFAULT NULL COMMENT 'The pin order id associated with the order line in SFDC',
  `last_modified_date_time` TEXT DEFAULT NULL COMMENT 'Last modified date.',
  `start_date` DATE DEFAULT NULL COMMENT 'Start date of the order line.',
  `end_date` DATE DEFAULT NULL COMMENT 'End date of the order line.',
  `bill_to_company_name` TEXT DEFAULT NULL COMMENT 'Bill To Company name',
  `billing_contact_firstname` TEXT DEFAULT NULL COMMENT 'Billing contact first name',
  `billing_contact_lastname` TEXT DEFAULT NULL COMMENT 'Billing contact last name',
  `billing_contact_email` TEXT DEFAULT NULL COMMENT 'Billing contact email',
  `media_contact_email` TEXT DEFAULT NULL COMMENT 'Billing media email',
  `media_contact_firstname` TEXT DEFAULT NULL COMMENT 'Billing contact first name',
  `media_contact_lastname` TEXT DEFAULT NULL COMMENT 'Billing contact first name',
  `currency_info` TEXT DEFAULT NULL,
  `agency_link` TEXT DEFAULT NULL COMMENT 'Agency link',
  `po_number` TEXT DEFAULT NULL COMMENT 'The po number',
  `order_name` TEXT DEFAULT NULL COMMENT 'The order name',
  `pmp_name` TEXT DEFAULT NULL COMMENT 'The Pinterest marketing partner name',
  `accepted_terms_id` TEXT DEFAULT NULL COMMENT 'The SFDC id for the terms',
  `accepted_terms_time` TEXT DEFAULT NULL COMMENT 'The UTC timestamp (to the nearest sec) of when terms were accepted',
  `budget_amount` DECIMAL(20, 9) DEFAULT NULL COMMENT 'If Budget order line, the budget amount.',
  `estimated_monthly_spend` DECIMAL(20, 9) DEFAULT NULL COMMENT 'If Ongoing (perpetual) order line, the estimated monthly spend'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `search_partner_pins_200_response` generated from model 'searchUnderscorepartnerUnderscorepinsUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `search_partner_pins_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `search_user_boards_get_200_response` generated from model 'searchUnderscoreuserUnderscoreboardsUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `search_user_boards_get_200_response` (
  `items` JSON NOT NULL COMMENT 'items',
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SharedAudience` generated from model 'SharedAudience'
--

CREATE TABLE IF NOT EXISTS `SharedAudience` (
  `audience_id` TEXT NOT NULL COMMENT 'Unique identifier of an audience',
  `operation_type` TEXT NOT NULL,
  `recipient_account_ids` JSON NOT NULL COMMENT 'List of ad account IDs to share with or revoke from.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SharedAudienceAccount` generated from model 'SharedAudienceAccount'
--

CREATE TABLE IF NOT EXISTS `SharedAudienceAccount` (
  `account_id` TEXT NOT NULL COMMENT 'Account ID (ad account or business ID).',
  `account_name` TEXT NOT NULL COMMENT 'Account name.',
  `account_type` ENUM('AD_ACCOUNT', 'BUSINESS_ACCOUNT') NOT NULL COMMENT 'account type',
  `shared_on_timestamp` INT NOT NULL COMMENT 'Epoch timestamp in seconds for the shared audience event'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SharedAudienceCommon` generated from model 'SharedAudienceCommon'
--

CREATE TABLE IF NOT EXISTS `SharedAudienceCommon` (
  `audience_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of an audience',
  `operation_type` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SharedAudienceResponse` generated from model 'SharedAudienceResponse'
--

CREATE TABLE IF NOT EXISTS `SharedAudienceResponse` (
  `audience_id` TEXT DEFAULT NULL COMMENT 'Audience ID that was shared',
  `permissions` JSON DEFAULT NULL,
  `recipient_account_ids` JSON DEFAULT NULL COMMENT 'Account IDs that received the audience'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SharedAudienceResponseCommon` generated from model 'SharedAudienceResponseCommon'
--

CREATE TABLE IF NOT EXISTS `SharedAudienceResponseCommon` (
  `audience_id` TEXT DEFAULT NULL COMMENT 'Audience ID that was shared',
  `permissions` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SingleInterestTargetingOptionResponse` generated from model 'SingleInterestTargetingOptionResponse'
--

CREATE TABLE IF NOT EXISTS `SingleInterestTargetingOptionResponse` (
  `id` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL,
  `child_interests` JSON DEFAULT NULL,
  `level` INT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ssio_insertion_orders_status_get_by_ad_account_200_response` generated from model 'ssioUnderscoreinsertionUnderscoreordersUnderscorestatusUnderscoregetUnderscorebyUnderscoreadUnderscoreaccountUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `ssio_insertion_orders_status_get_by_ad_account_200_response` (
  `items` JSON NOT NULL COMMENT 'Insertion orders status by ad acount id',
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ssio_order_lines_get_by_ad_account_200_response` generated from model 'ssioUnderscoreorderUnderscorelinesUnderscoregetUnderscorebyUnderscoreadUnderscoreaccountUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `ssio_order_lines_get_by_ad_account_200_response` (
  `items` JSON NOT NULL COMMENT 'SSIO order lines by ad acount id',
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SummaryPin` generated from model 'SummaryPin'
-- Summarized pin information
--

CREATE TABLE IF NOT EXISTS `SummaryPin` (
  `media` TEXT DEFAULT NULL,
  `alt_text` TEXT DEFAULT NULL,
  `link` TEXT DEFAULT NULL,
  `title` TEXT DEFAULT NULL,
  `description` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Summarized pin information';

--
-- Table structure for table `TargetingSpec` generated from model 'TargetingSpec'
-- Ad group targeting specification defining the ad group target audience. For example, &#x60;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}&#x60;
--

CREATE TABLE IF NOT EXISTS `TargetingSpec` (
  `AGE_BUCKET` JSON DEFAULT NULL COMMENT 'Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.',
  `APPTYPE` JSON DEFAULT NULL COMMENT 'Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.',
  `AUDIENCE_EXCLUDE` JSON DEFAULT NULL COMMENT 'Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\&quot;2542620905475\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.',
  `AUDIENCE_INCLUDE` JSON DEFAULT NULL COMMENT 'Targeted customer list IDs. For example: [\&quot;2542620905473\&quot;]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.',
  `GENDER` JSON DEFAULT NULL COMMENT 'Targeted genders. Values: [\&quot;unknown\&quot;,\&quot;male\&quot;,\&quot;female\&quot;]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.',
  `GEO` JSON DEFAULT NULL COMMENT 'Location region codes, e.g., \&quot;BE-VOV\&quot; (East Flanders, Belgium) For complete list, &lt;a href&#x3D;\&quot;https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\&quot; target&#x3D;\&quot;_blank\&quot;&gt;click here&lt;/a&gt; or postal codes, e.g., \&quot;US-94107\&quot;. Use either region codes or postal codes but not both. At least one of LOCATION or GEO must be specified. If the GEO field is missing, then only LOCATION values will be targeted (see LOCATION field below).',
  `INTEREST` JSON DEFAULT NULL COMMENT 'Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.',
  `LOCALE` JSON DEFAULT NULL COMMENT '24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be targeted, only english non-sublanguage will be targeted**.',
  `LOCATION` JSON DEFAULT NULL COMMENT '22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\&quot;US\&quot;, \&quot;807\&quot;]). For complete list, click here. Location-Country and Location-Metro codes apply. At least one of LOCATION or GEO must be specified. If the LOCATION field is missing, then only GEO values will be targeted (see GEO field above).',
  `SHOPPING_RETARGETING` JSON DEFAULT NULL COMMENT 'Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting',
  `TARGETING_STRATEGY` JSON DEFAULT NULL COMMENT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Ad group targeting specification defining the ad group target audience. For example, &#x60;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}&#x60;';

--
-- Table structure for table `TargetingSpec_SHOPPING_RETARGETING` generated from model 'TargetingSpecUnderscoreSHOPPINGUnderscoreRETARGETING'
--

CREATE TABLE IF NOT EXISTS `TargetingSpec_SHOPPING_RETARGETING` (
  `lookback_window` INT DEFAULT NULL COMMENT 'Number of days ago to start lookback timeframe for dynamic retargeting',
  `tag_types` JSON DEFAULT NULL COMMENT 'Event types to target for dynamic retargeting',
  `exclusion_window` INT DEFAULT NULL COMMENT 'Number of days ago to stop lookback timeframe for dynamic retargeting'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingTemplateAudienceSizing` generated from model 'TargetingTemplateAudienceSizing'
-- Gets an audience size estimate for a set of given targeting spec data. &lt;p&gt;Returns:&lt;/p&gt; An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate. 
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateAudienceSizing` (
  `reach_estimate` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Gets an audience size estimate for a set of given targeting spec data. &lt;p&gt;Returns:&lt;/p&gt; An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate. ';

--
-- Table structure for table `TargetingTemplateAudienceSizing_reach_estimate` generated from model 'TargetingTemplateAudienceSizingUnderscorereachUnderscoreestimate'
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateAudienceSizing_reach_estimate` (
  `estimate` BIGINT DEFAULT NULL,
  `lower_bound` BIGINT DEFAULT NULL,
  `upper_bound` BIGINT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingTemplateCommon` generated from model 'TargetingTemplateCommon'
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateCommon` (
  `name` TEXT DEFAULT NULL COMMENT 'targeting template name',
  `auto_targeting_enabled` TINYINT(1) DEFAULT true COMMENT 'Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.',
  `targeting_attributes` TEXT DEFAULT NULL,
  `placement_group` TEXT DEFAULT NULL,
  `keywords` JSON DEFAULT NULL,
  `tracking_urls` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingTemplateCreate` generated from model 'TargetingTemplateCreate'
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateCreate` (
  `name` TEXT NOT NULL COMMENT 'Name of targeting template.',
  `auto_targeting_enabled` TINYINT(1) DEFAULT true COMMENT 'Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.',
  `targeting_attributes` TEXT NOT NULL,
  `placement_group` TEXT DEFAULT NULL,
  `keywords` JSON DEFAULT NULL,
  `tracking_urls` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingTemplateGetResponseData` generated from model 'TargetingTemplateGetResponseData'
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateGetResponseData` (
  `name` TEXT DEFAULT NULL COMMENT 'targeting template name',
  `auto_targeting_enabled` TINYINT(1) DEFAULT true COMMENT 'Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.',
  `targeting_attributes` TEXT DEFAULT NULL,
  `placement_group` TEXT DEFAULT NULL,
  `keywords` JSON DEFAULT NULL,
  `tracking_urls` TEXT DEFAULT NULL,
  `id` TEXT DEFAULT NULL COMMENT 'Targeting template ID.',
  `created_time` INT DEFAULT NULL COMMENT 'Targeting template created time. Unix timestamp in seconds.',
  `updated_time` INT DEFAULT NULL COMMENT 'Targeting template updated time.Unix timestamp in seconds.',
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'The ID of the advertiser that this targeting template belongs to.',
  `status` ENUM('ACTIVE', 'DELETED') DEFAULT 'ACTIVE' COMMENT 'Indicate targeting template is active or Deleted',
  `sizing` TEXT DEFAULT NULL,
  `valid` TINYINT(1) DEFAULT NULL COMMENT 'Inform if the targeting template is valid (ex. would be false if has revoked audience)'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

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
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingTemplateResponseData` generated from model 'TargetingTemplateResponseData'
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateResponseData` (
  `name` TEXT DEFAULT NULL COMMENT 'targeting template name',
  `auto_targeting_enabled` TINYINT(1) DEFAULT true COMMENT 'Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.',
  `targeting_attributes` TEXT DEFAULT NULL,
  `placement_group` TEXT DEFAULT NULL,
  `keywords` JSON DEFAULT NULL,
  `tracking_urls` TEXT DEFAULT NULL,
  `id` TEXT DEFAULT NULL COMMENT 'Targeting template ID.',
  `created_time` INT DEFAULT NULL COMMENT 'Targeting template created time. Unix timestamp in seconds.',
  `updated_time` INT DEFAULT NULL COMMENT 'Targeting template updated time.Unix timestamp in seconds.',
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'The ID of the advertiser that this targeting template belongs to.',
  `status` ENUM('ACTIVE', 'DELETED') DEFAULT 'ACTIVE' COMMENT 'Indicate targeting template is active or Deleted',
  `sizing` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingTemplateUpdateRequest` generated from model 'TargetingTemplateUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateUpdateRequest` (
  `operation_type` ENUM('REMOVE') NOT NULL,
  `id` TEXT NOT NULL COMMENT 'Targeting template ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TargetingTypeFilter` generated from model 'TargetingTypeFilter'
--

CREATE TABLE IF NOT EXISTS `TargetingTypeFilter` (
  `targeting_types` JSON DEFAULT NULL COMMENT 'List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TemplateResponse` generated from model 'TemplateResponse'
-- Template fields
--

CREATE TABLE IF NOT EXISTS `TemplateResponse` (
  `id` TEXT DEFAULT NULL COMMENT 'Template ID',
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'ID of the Ad Account that owns the template',
  `ad_account_ids` JSON DEFAULT NULL COMMENT 'IDs of the Ad Accounts that have access to this template',
  `user_id` TEXT DEFAULT NULL COMMENT 'ID of the user who created the template',
  `name` TEXT DEFAULT NULL COMMENT 'Template Name',
  `report_start_relative_days_in_past` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The number of days prior to the day the report will be delivered at which the report will start',
  `report_end_relative_days_in_past` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The number of days prior to the day the report will be delivered at which the report will end',
  `date_range` TEXT DEFAULT NULL,
  `report_level` TEXT DEFAULT NULL,
  `report_format` TEXT DEFAULT NULL,
  `columns` JSON DEFAULT NULL COMMENT 'A list of columns to be included in the report',
  `granularity` TEXT DEFAULT NULL,
  `view_window_days` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The length of the sliding window over which view conversions will be attributed',
  `click_window_days` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The length of the sliding window over which click conversions will be attributed',
  `engagement_window_days` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The length of the sliding window over which engagement conversions will be attributed',
  `conversion_report_time_type` ENUM('TIME_OF_AD_ACTION', 'TIME_OF_CONVERSION') DEFAULT NULL COMMENT 'Conversion report time type',
  `filters_json` TEXT DEFAULT NULL COMMENT 'A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:&lt;br&gt; \&quot;field\&quot;: The column name&lt;br&gt; \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]&lt;br&gt; \&quot;value\&quot;: A single value or a list of values',
  `is_owned_by_user` TINYINT(1) DEFAULT NULL COMMENT 'A boolean value that indicates if the user owns the template',
  `is_scheduled` TINYINT(1) DEFAULT NULL COMMENT 'A boolean value that indicates if this template has been used to create a scheduled report',
  `creation_source` ENUM('ADS_API', 'ADS_MANAGER_REPORTING_PAGE', 'ADS_MANAGER_REPORT_BUILDER') DEFAULT NULL COMMENT 'The surface used to create this template',
  `is_deleted` TINYINT(1) DEFAULT NULL COMMENT 'A boolean that indicates if the template has been deleted',
  `updated_time` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Time of last update in seconds since Unix epoch',
  `custom_column_ids` JSON DEFAULT NULL COMMENT 'A list of custom column IDs',
  `type` ENUM('UNSPECIFIED', 'BULK', 'OVERVIEW', 'TABLE') DEFAULT NULL COMMENT 'Reporting template type',
  `ingestion_sources` JSON DEFAULT NULL COMMENT 'The filter on the conversion ingestion source method for conversion metrics'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Template fields';

--
-- Table structure for table `TemplateResponse_date_range` generated from model 'TemplateResponseUnderscoredateUnderscorerange'
--

CREATE TABLE IF NOT EXISTS `TemplateResponse_date_range` (
  `dynamic_date_range` TEXT DEFAULT NULL,
  `relative_date_range` TEXT DEFAULT NULL,
  `absolute_date_range` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TemplateResponse_date_range_absolute_date_range` generated from model 'TemplateResponseUnderscoredateUnderscorerangeUnderscoreabsoluteUnderscoredateUnderscorerange'
-- The absolute date range of the template
--

CREATE TABLE IF NOT EXISTS `TemplateResponse_date_range_absolute_date_range` (
  `type` TEXT DEFAULT NULL COMMENT 'The date range type',
  `start_date` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The start date of the date range',
  `end_date` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The end date of the date range'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The absolute date range of the template';

--
-- Table structure for table `TemplateResponse_date_range_dynamic_date_range` generated from model 'TemplateResponseUnderscoredateUnderscorerangeUnderscoredynamicUnderscoredateUnderscorerange'
-- The dynamic date range of the template
--

CREATE TABLE IF NOT EXISTS `TemplateResponse_date_range_dynamic_date_range` (
  `type` TEXT DEFAULT NULL COMMENT 'The date range type',
  `range` ENUM('YEAR_TO_DATE', 'QUARTER_TO_DATE', 'MONTH_TO_DATE', 'LAST_MONTH') DEFAULT NULL COMMENT 'The dynamic range type'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The dynamic date range of the template';

--
-- Table structure for table `TemplateResponse_date_range_relative_date_range` generated from model 'TemplateResponseUnderscoredateUnderscorerangeUnderscorerelativeUnderscoredateUnderscorerange'
-- The relative date range of the template
--

CREATE TABLE IF NOT EXISTS `TemplateResponse_date_range_relative_date_range` (
  `type` TEXT DEFAULT NULL COMMENT 'The date range type',
  `start_days_in_past` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The start date of the date range',
  `end_days_in_past` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The end date of the date range'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The relative date range of the template';

--
-- Table structure for table `templates_list_200_response` generated from model 'templatesUnderscorelistUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `templates_list_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TermsOfService` generated from model 'TermsOfService'
--

CREATE TABLE IF NOT EXISTS `TermsOfService` (
  `id` TEXT DEFAULT NULL COMMENT 'The ID of the terms of service',
  `html` TEXT DEFAULT NULL COMMENT 'The terms of service content',
  `has_accepted` TINYINT(1) DEFAULT NULL COMMENT 'Whether the ad account has accepted terms of service.',
  `ad_account_id` TEXT DEFAULT NULL COMMENT 'The ID of the ad account.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TopPinsAnalyticsResponse` generated from model 'TopPinsAnalyticsResponse'
--

CREATE TABLE IF NOT EXISTS `TopPinsAnalyticsResponse` (
  `date_availability` TEXT DEFAULT NULL,
  `pins` JSON DEFAULT NULL,
  `sort_by` ENUM('ENGAGEMENT', 'SAVE', 'IMPRESSION', 'OUTBOUND_CLICK', 'PIN_CLICK') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TopPinsAnalyticsResponse_date_availability` generated from model 'TopPinsAnalyticsResponseUnderscoredateUnderscoreavailability'
--

CREATE TABLE IF NOT EXISTS `TopPinsAnalyticsResponse_date_availability` (
  `latest_available_timestamp` DECIMAL(20, 9) DEFAULT NULL,
  `is_realtime` TINYINT(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TopPinsAnalyticsResponse_pins_inner` generated from model 'TopPinsAnalyticsResponseUnderscorepinsUnderscoreinner'
-- Array with metrics, status, and pin id for the requested metric
--

CREATE TABLE IF NOT EXISTS `TopPinsAnalyticsResponse_pins_inner` (
  `metrics` JSON DEFAULT NULL COMMENT 'The metric name and daily value for each requested metric',
  `data_status` JSON DEFAULT NULL,
  `pin_id` TEXT DEFAULT NULL COMMENT 'The pin id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Array with metrics, status, and pin id for the requested metric';

--
-- Table structure for table `TopVideoPinsAnalyticsResponse` generated from model 'TopVideoPinsAnalyticsResponse'
--

CREATE TABLE IF NOT EXISTS `TopVideoPinsAnalyticsResponse` (
  `date_availability` TEXT DEFAULT NULL,
  `pins` JSON DEFAULT NULL,
  `sort_by` ENUM('SAVE', 'IMPRESSION', 'OUTBOUND_CLICK', 'VIDEO_MRC_VIEW', 'VIDEO_AVG_WATCH_TIME', 'VIDEO_V50_WATCH_TIME', 'QUARTILE_95_PERCENT_VIEW', 'VIDEO_10S_VIEW', 'VIDEO_START') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TopVideoPinsAnalyticsResponse_pins_inner` generated from model 'TopVideoPinsAnalyticsResponseUnderscorepinsUnderscoreinner'
-- Array with metrics, status, and pin id for the requested metric
--

CREATE TABLE IF NOT EXISTS `TopVideoPinsAnalyticsResponse_pins_inner` (
  `metrics` JSON DEFAULT NULL COMMENT 'The metric name and daily value for each requested metric',
  `data_status` JSON DEFAULT NULL,
  `pin_id` TEXT DEFAULT NULL COMMENT 'The pin id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Array with metrics, status, and pin id for the requested metric';

--
-- Table structure for table `TrackingUrls` generated from model 'TrackingUrls'
-- Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
--

CREATE TABLE IF NOT EXISTS `TrackingUrls` (
  `impression` JSON DEFAULT NULL,
  `click` JSON DEFAULT NULL,
  `engagement` JSON DEFAULT NULL,
  `buyable_button` JSON DEFAULT NULL,
  `audience_verification` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.';

--
-- Table structure for table `TrendingKeywordsResponse` generated from model 'TrendingKeywordsResponse'
--

CREATE TABLE IF NOT EXISTS `TrendingKeywordsResponse` (
  `trends` JSON DEFAULT NULL COMMENT 'The top trending keywords for the specified trend type in the requested region.&lt;br /&gt; Results are ordered, with the first element in the array representing the #1 top trend.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TrendingKeywordsResponse_trends_inner` generated from model 'TrendingKeywordsResponseUnderscoretrendsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `TrendingKeywordsResponse_trends_inner` (
  `keyword` TEXT DEFAULT NULL COMMENT 'The keyword that is trending.',
  `pct_growth_wow` INT DEFAULT NULL COMMENT 'The week-over-week percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;50\&quot; would represent a 50% increase in searches in the last seven days compared to the week prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% week-over-week growth.',
  `pct_growth_mom` INT DEFAULT NULL COMMENT 'The month-over-month percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;400\&quot; would represent a 400% increase in searches in the last 30 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% month-over-month growth.',
  `pct_growth_yoy` INT DEFAULT NULL COMMENT 'The year-over-year percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;-5\&quot; would represent a 5% decrease in searches in the last 365 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% year-over-year growth.',
  `time_series` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TrendingKeywordsResponse_trends_inner_time_series` generated from model 'TrendingKeywordsResponseUnderscoretrendsUnderscoreinnerUnderscoretimeUnderscoreseries'
-- A sequence of weekly observations of the relative search volume for this keyword over the past year.&lt;br /&gt; These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the &#x60;normalize_against_group&#x60; query parameter can be used in cases where you wish to compare relative volume between keywords.&lt;br /&gt; **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week.  For example, a value of &#x60;2023-10-31&#x60; would include searches that happened between &#x60;2023-10-25&#x60; and &#x60;2023-10-31&#x60;.
--

CREATE TABLE IF NOT EXISTS `TrendingKeywordsResponse_trends_inner_time_series` (
  `date` DATE DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A sequence of weekly observations of the relative search volume for this keyword over the past year.&lt;br /&gt; These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the &#x60;normalize_against_group&#x60; query parameter can be used in cases where you wish to compare relative volume between keywords.&lt;br /&gt; **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week.  For example, a value of &#x60;2023-10-31&#x60; would include searches that happened between &#x60;2023-10-25&#x60; and &#x60;2023-10-31&#x60;.';

--
-- Table structure for table `UpdatableItemAttributes` generated from model 'UpdatableItemAttributes'
--

CREATE TABLE IF NOT EXISTS `UpdatableItemAttributes` (
  `ad_link` TEXT DEFAULT NULL COMMENT 'Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.',
  `adult` TINYINT(1) DEFAULT NULL COMMENT 'Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest.',
  `age_group` TEXT DEFAULT NULL COMMENT 'The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’ , ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.',
  `availability` TEXT DEFAULT NULL COMMENT 'The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’ , ‘preorder’.',
  `average_review_rating` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Average reviews for the item. Can be a number from 1-5.',
  `brand` TEXT DEFAULT NULL COMMENT 'The brand of the product.',
  `checkout_enabled` TINYINT(1) DEFAULT NULL COMMENT 'This attribute is not supported anymore.',
  `color` TEXT DEFAULT NULL COMMENT 'The primary color of the product.',
  `condition` TEXT DEFAULT NULL COMMENT 'The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.',
  `custom_label_0` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;',
  `custom_label_1` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;',
  `custom_label_2` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;',
  `custom_label_3` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;',
  `custom_label_4` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;',
  `description` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 10000 characters&lt;/p&gt; &lt;p&gt;The description of the product.&lt;/p&gt;',
  `free_shipping_label` TINYINT(1) DEFAULT NULL COMMENT 'The item is free to ship.',
  `free_shipping_limit` TEXT DEFAULT NULL COMMENT 'The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.',
  `gender` TEXT DEFAULT NULL COMMENT 'The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’ , or ‘unisex’.',
  `google_product_category` TEXT DEFAULT NULL COMMENT 'The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.',
  `gtin` INT DEFAULT NULL COMMENT 'The unique universal product identifier.',
  `id` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The user-created unique ID that represents the product. Only Unicode characters are accepted.&lt;/p&gt;',
  `item_group_id` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The parent ID of the product.&lt;/p&gt;',
  `last_updated_time` BIGINT DEFAULT NULL COMMENT 'The millisecond timestamp when the item was lastly modified by the merchant.',
  `link` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;The landing page for the product.&lt;/p&gt;',
  `material` TEXT DEFAULT NULL COMMENT 'The material used to make the product.',
  `min_ad_price` TEXT DEFAULT NULL COMMENT 'The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.',
  `mobile_link` TEXT DEFAULT NULL COMMENT 'The mobile-optimized version of your landing page. Must begin with http:// or https://.',
  `mpn` TEXT DEFAULT NULL COMMENT 'Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.',
  `number_of_ratings` INT DEFAULT NULL COMMENT 'The number of ratings for the item.',
  `number_of_reviews` INT DEFAULT NULL COMMENT 'The number of reviews available for the item.',
  `pattern` TEXT DEFAULT NULL COMMENT 'The description of the pattern used for the product.',
  `price` TEXT DEFAULT NULL COMMENT 'The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.',
  `product_type` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.&lt;/p&gt;',
  `sale_price` TEXT DEFAULT NULL COMMENT 'The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars.',
  `shipping` TEXT DEFAULT NULL COMMENT 'Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.',
  `shipping_height` TEXT DEFAULT NULL COMMENT 'The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.',
  `shipping_weight` TEXT DEFAULT NULL COMMENT 'The weight of the product. Ensure there is a space between the numeric string and the metric.',
  `shipping_width` TEXT DEFAULT NULL COMMENT 'The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.',
  `size` TEXT DEFAULT NULL COMMENT 'The size of the product.',
  `size_system` TEXT DEFAULT NULL COMMENT 'Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’ , ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘ BR’, ‘MEX’, or ‘AU’.',
  `size_type` TEXT DEFAULT NULL COMMENT 'Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’ , ‘plus’, ‘big_and_tall’, or ‘maternity’.',
  `tax` TEXT DEFAULT NULL COMMENT 'Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.',
  `title` TEXT DEFAULT NULL COMMENT '&lt;p&gt;&lt;&#x3D; 500 characters&lt;/p&gt; &lt;p&gt;The name of the product.&lt;/p&gt;',
  `variant_names` JSON DEFAULT NULL COMMENT 'Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.',
  `variant_values` JSON DEFAULT NULL COMMENT 'Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdateAssetGroupBody` generated from model 'UpdateAssetGroupBody'
--

CREATE TABLE IF NOT EXISTS `UpdateAssetGroupBody` (
  `asset_groups_to_update` JSON DEFAULT NULL COMMENT 'A list of asset groups and the data that will be used to update them.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdateAssetGroupBody_asset_groups_to_update_inner` generated from model 'UpdateAssetGroupBodyUnderscoreassetUnderscoregroupsUnderscoretoUnderscoreupdateUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `UpdateAssetGroupBody_asset_groups_to_update_inner` (
  `asset_group_id` TEXT NOT NULL COMMENT 'Unique identifier of the asset group to update.',
  `name` TEXT DEFAULT NULL COMMENT 'Asset Group name',
  `description` TEXT DEFAULT NULL COMMENT 'Asset group description',
  `asset_group_types` JSON DEFAULT NULL COMMENT 'Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.',
  `assets_to_add` JSON DEFAULT NULL COMMENT 'A list of asset ids to add to the asset group.',
  `assets_to_remove` JSON DEFAULT NULL COMMENT 'A list of asset ids to remove from the asset group.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdateAssetGroupResponse` generated from model 'UpdateAssetGroupResponse'
--

CREATE TABLE IF NOT EXISTS `UpdateAssetGroupResponse` (
  `updated_asset_groups` JSON DEFAULT NULL COMMENT 'A list of successfully edited asset groups.',
  `exceptions` JSON DEFAULT NULL COMMENT 'A list of errors associated with the asset groups. Will be returned if there is an error.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdateAssetGroupResponse_exceptions_inner` generated from model 'UpdateAssetGroupResponseUnderscoreexceptionsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `UpdateAssetGroupResponse_exceptions_inner` (
  `code` INT DEFAULT NULL COMMENT 'Error code associated with the error editing asset group.',
  `message` TEXT DEFAULT NULL COMMENT 'Error message associated with the error editing asset group.',
  `asset_group_id` TEXT DEFAULT NULL COMMENT 'Asset group id of the exception.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdateInvitesResultsResponseArray` generated from model 'UpdateInvitesResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `UpdateInvitesResultsResponseArray` (
  `items` JSON DEFAULT NULL COMMENT 'List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdateInvitesResultsResponseArray_items_inner` generated from model 'UpdateInvitesResultsResponseArrayUnderscoreitemsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `UpdateInvitesResultsResponseArray_items_inner` (
  `exception` TEXT DEFAULT NULL,
  `invite` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdateMemberAssetAccessBody` generated from model 'UpdateMemberAssetAccessBody'
-- An object with a list of all the new accesses.
--

CREATE TABLE IF NOT EXISTS `UpdateMemberAssetAccessBody` (
  `accesses` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='An object with a list of all the new accesses.';

--
-- Table structure for table `UpdateMemberAssetAccessBody_accesses_inner` generated from model 'UpdateMemberAssetAccessBodyUnderscoreaccessesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `UpdateMemberAssetAccessBody_accesses_inner` (
  `asset_id` VARCHAR(25) NOT NULL COMMENT 'Id of the asset to update.',
  `member_id` VARCHAR(25) NOT NULL COMMENT 'Unique identifier of the member on which to perform the update',
  `permissions` JSON NOT NULL COMMENT 'A non-empty array of permissions to assign to the member.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdateMemberAssetsResultsResponseArray` generated from model 'UpdateMemberAssetsResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `UpdateMemberAssetsResultsResponseArray` (
  `items` JSON DEFAULT NULL COMMENT 'List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdateMemberAssetsResultsResponseArray_items_inner` generated from model 'UpdateMemberAssetsResultsResponseArrayUnderscoreitemsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `UpdateMemberAssetsResultsResponseArray_items_inner` (
  `response` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdateMemberBusinessRoleBody` generated from model 'UpdateMemberBusinessRoleBody'
-- Single instance of a business member to have its role updated
--

CREATE TABLE IF NOT EXISTS `UpdateMemberBusinessRoleBody` (
  `business_role` TEXT NOT NULL,
  `member_id` VARCHAR(25) NOT NULL COMMENT 'Unique identifier of the member'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Single instance of a business member to have its role updated';

--
-- Table structure for table `UpdateMemberResult` generated from model 'UpdateMemberResult'
--

CREATE TABLE IF NOT EXISTS `UpdateMemberResult` (
  `business_role` TEXT DEFAULT NULL COMMENT 'The access level a member has to the business. Values are case-sensitive. &lt;br&gt; - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. &lt;br&gt; - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.',
  `member_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of the business member.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdateMemberResultsResponseArray` generated from model 'UpdateMemberResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `UpdateMemberResultsResponseArray` (
  `items` JSON DEFAULT NULL COMMENT 'List of members with updated business access role.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdatePartnerAssetAccessBody` generated from model 'UpdatePartnerAssetAccessBody'
--

CREATE TABLE IF NOT EXISTS `UpdatePartnerAssetAccessBody` (
  `accesses` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdatePartnerAssetAccessBody_accesses_inner` generated from model 'UpdatePartnerAssetAccessBodyUnderscoreaccessesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `UpdatePartnerAssetAccessBody_accesses_inner` (
  `partner_id` VARCHAR(25) NOT NULL COMMENT 'Unique identifier of a business partner to update asset access to.',
  `asset_id` VARCHAR(25) NOT NULL COMMENT 'Unique identifier of the business asset.',
  `permissions` JSON NOT NULL COMMENT 'A non-empty array of permissions to assign to the partner.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdatePartnerAssetsResult` generated from model 'UpdatePartnerAssetsResult'
-- An object containing the permissions a business partner has on the asset.
--

CREATE TABLE IF NOT EXISTS `UpdatePartnerAssetsResult` (
  `asset_id` TEXT DEFAULT NULL COMMENT 'Unique identifier of a business asset.',
  `asset_type` TEXT DEFAULT NULL COMMENT 'Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.',
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
-- Table structure for table `UpdatePartnerResultsResponseArray` generated from model 'UpdatePartnerResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `UpdatePartnerResultsResponseArray` (
  `items` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UpdatePartnerResultsResponseArray_items_inner` generated from model 'UpdatePartnerResultsResponseArrayUnderscoreitemsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `UpdatePartnerResultsResponseArray_items_inner` (
  `exception` TEXT DEFAULT NULL,
  `member_or_partner_id` VARCHAR(18) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `user_account_followed_interests_200_response` generated from model 'userUnderscoreaccountUnderscorefollowedUnderscoreinterestsUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `user_account_followed_interests_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UserBusinessRoleBinding` generated from model 'UserBusinessRoleBinding'
--

CREATE TABLE IF NOT EXISTS `UserBusinessRoleBinding` (
  `assets_summary` TEXT DEFAULT NULL,
  `business_roles` JSON DEFAULT NULL COMMENT 'The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.',
  `created_by_business` TEXT DEFAULT NULL COMMENT 'Metadata for the business that created the business relationship.',
  `created_by_user` TEXT DEFAULT NULL COMMENT 'Metadata for the user that created the business relationship.',
  `created_time` INT DEFAULT NULL COMMENT 'The time the business relationship was created. Returned in milliseconds.',
  `id` TEXT DEFAULT NULL COMMENT 'Unique identifier of the business member/business partner/employer.',
  `is_shared_partner` TINYINT(1) DEFAULT NULL COMMENT 'This field is only relevant when business_role&#x3D;\&quot;PARTNER\&quot;. &lt;br&gt;If is_shared_partner&#x3D;FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. &lt;br&gt;If is_shared_partner&#x3D;TRUE, you can access the partner&#39;s business asset. If assets_summary is not empty, the assets listed are the partner&#39;s business assets you have access to.',
  `user` TEXT DEFAULT NULL COMMENT 'Metadata for the business member/business partner/employer.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `user_following_get_200_response` generated from model 'userUnderscorefollowingUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `user_following_get_200_response` (
  `items` JSON NOT NULL COMMENT 'Users',
  `bookmark` TEXT DEFAULT NULL
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
-- Table structure for table `UserSummary` generated from model 'UserSummary'
--

CREATE TABLE IF NOT EXISTS `UserSummary` (
  `username` TEXT DEFAULT NULL COMMENT 'Username',
  `type` TEXT DEFAULT NULL COMMENT 'Always \&quot;user\&quot;'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UserWebsiteSummary` generated from model 'UserWebsiteSummary'
--

CREATE TABLE IF NOT EXISTS `UserWebsiteSummary` (
  `website` TEXT DEFAULT NULL COMMENT 'Website with path or domain only',
  `status` TEXT DEFAULT NULL COMMENT 'Status of the verification process',
  `verified_at` TEXT DEFAULT NULL COMMENT 'UTC timestamp when the verification happened - sometimes missing'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UserWebsiteVerificationCode` generated from model 'UserWebsiteVerificationCode'
--

CREATE TABLE IF NOT EXISTS `UserWebsiteVerificationCode` (
  `verification_code` TEXT DEFAULT NULL COMMENT 'Code to check against the user claiming the website',
  `dns_txt_record` TEXT DEFAULT NULL COMMENT 'DNS TXT record to check against for the website to be claimed',
  `metatag` TEXT DEFAULT NULL COMMENT 'Metatag the verification process searchs for the website to be claimed',
  `filename` TEXT DEFAULT NULL COMMENT 'File expected to find on the website being claimed',
  `file_content` TEXT DEFAULT NULL COMMENT 'A full html file to upload to the website in order for it to be claimed'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UserWebsiteVerifyRequest` generated from model 'UserWebsiteVerifyRequest'
-- User website verification request
--

CREATE TABLE IF NOT EXISTS `UserWebsiteVerifyRequest` (
  `website` TEXT DEFAULT NULL,
  `verification_method` ENUM('FILENAME', 'METATAG', 'DNSTXT') DEFAULT 'METATAG'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='User website verification request';

--
-- Table structure for table `user_websites_get_200_response` generated from model 'userUnderscorewebsitesUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `user_websites_get_200_response` (
  `items` JSON NOT NULL,
  `bookmark` TEXT DEFAULT NULL
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
-- Table structure for table `VideoMetadata` generated from model 'VideoMetadata'
--

CREATE TABLE IF NOT EXISTS `VideoMetadata` (
  `item_type` TEXT DEFAULT NULL,
  `cover_image_url` TEXT DEFAULT NULL,
  `video_url` TEXT DEFAULT NULL COMMENT 'Video url (720p). &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is limited and not available to all apps.',
  `duration` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Duration (in milliseconds)',
  `height` INT DEFAULT NULL COMMENT 'Height (in pixels)',
  `width` INT DEFAULT NULL COMMENT 'Width (in pixels)'
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
