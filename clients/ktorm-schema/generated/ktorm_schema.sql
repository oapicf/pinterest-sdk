

-- --------------------------------------------------------------------------
-- Table structure for table `Account` generated from model 'account'
-- User account model containing properties related to a user&#39;s account.
--

CREATE TABLE IF NOT EXISTS `Account` (
  `about` text /*Profile about description.*/,
  `account_type` long /*Type of account*/,
  `board_count` int /*  User account board count.   **Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.*/,
  `business_name` text,
  `follower_count` int /*User account follower count.*/,
  `following_count` int /*User account following count.*/,
  `id` text PRIMARY KEY /*User account ID.*/,
  `monthly_views` int /*User account monthly views.*/,
  `pin_count` int /*User account pin count. This includes both created and saved pins.*/,
  `profile_image` text,
  `username` text,
  `website_url` text
);  /*User account model containing properties related to a user&#39;s account.*/


-- --------------------------------------------------------------------------
-- Table structure for table `AccountTemplate` generated from model 'accountTemplate'
--

CREATE TABLE IF NOT EXISTS `AccountTemplate` (
  `id` text NOT NULL PRIMARY KEY /*Template ID*/,
  `ad_account_id` text /*ID of the Ad Account that owns the template*/,
  `attribution_type` blob /*Attribution type for Brand/Category/SKU reports*/,
  `click_window_days` decimal /*The length of the sliding window over which click conversions will be attributed*/,
  `conversion_report_time_type` long /*Conversion report time type*/,
  `creation_source` long /*The surface used to create this template*/,
  `display_metadata` text /*Additional metadata about this reporting template*/,
  `engagement_window_days` decimal /*The length of the sliding window over which engagement conversions will be attributed*/,
  `filters_json` text /*A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values*/,
  `granularity` long,
  `is_default` boolean /*A boolean representing if this is the default view that loads for this template type*/,
  `is_deleted` boolean /*A boolean that indicates if the template has been deleted*/,
  `is_owned_by_user` boolean /*A boolean value that indicates if the user owns the template*/,
  `is_scheduled` boolean /*A boolean value that indicates if this template has been used to create a scheduled report*/,
  `name` text /*Template Name*/,
  `report_end_relative_days_in_past` decimal /*The number of days prior to the day the report will be delivered at which the report will end*/,
  `report_format` long,
  `report_level` long,
  `report_start_relative_days_in_past` decimal /*The number of days prior to the day the report will be delivered at which the report will start*/,
  `reporting_time_zone` long /*Timezone for reporting data*/,
  `sort_by` blob /*Unified metric sort configuration*/,
  `type` text /*Type of the template*/,
  `updated_time` decimal /*Time of last update in seconds since Unix epoch*/,
  `user_id` text /*ID of the user who created the template*/,
  `view_window_days` decimal /*The length of the sliding window over which view conversions will be attributed*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AccountTemplateAdAccountIds` generated from model 'AccountTemplateAdAccountIds'

CREATE TABLE IF NOT EXISTS `AccountTemplateAdAccountIds` (
  `accountTemplate` long NOT NULL
  `adAccountIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AccountTemplateAdeColumns` generated from model 'AccountTemplateAdeColumns'

CREATE TABLE IF NOT EXISTS `AccountTemplateAdeColumns` (
  `accountTemplate` long NOT NULL
  `adeColumns` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AccountTemplateReportingColumn` generated from model 'AccountTemplateReportingColumn'

CREATE TABLE IF NOT EXISTS `AccountTemplateReportingColumn` (
  `accountTemplate` long NOT NULL
  `reportingColumn` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AccountTemplateCustomColumnIds` generated from model 'AccountTemplateCustomColumnIds'

CREATE TABLE IF NOT EXISTS `AccountTemplateCustomColumnIds` (
  `accountTemplate` long NOT NULL
  `customColumnIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AccountTemplateIngestionSource` generated from model 'AccountTemplateIngestionSource'

CREATE TABLE IF NOT EXISTS `AccountTemplateIngestionSource` (
  `accountTemplate` long NOT NULL
  `ingestionSource` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `Ad` generated from model 'ad'
--

CREATE TABLE IF NOT EXISTS `Ad` (
  `ad_account_id` text NOT NULL /*The ID of the advertiser that this ad belongs to.*/,
  `ad_group_id` text NOT NULL /*ID of the ad group that contains the ad.*/,
  `campaign_id` text NOT NULL /*ID of the ad campaign that contains this ad.*/,
  `creative_type` long NOT NULL,
  `id` text NOT NULL PRIMARY KEY /*The ID of this ad.*/,
  `pin_id` text NOT NULL /*Pin ID. This field may only be updated for draft ads.*/,
  `review_status` long NOT NULL /*Ad review status*/,
  `summary_status` long NOT NULL /*Ad summary status*/,
  `type` text NOT NULL /*Always \&quot;ad\&quot;.*/,
  `android_deep_link` text /*Deep link URL for Android devices.*/,
  `carting_platform_type` int UNSIGNED /*The vendor platform type of the carting/WTB ad.*/,
  `click_tracking_url` text /*Tracking url for the ad clicks.*/,
  `collection_items_destination_url_template` text /*Destination URL template for all items within a collections drawer.*/,
  `collections_header_type` long,
  `created_time` int /*Pin creation time. Unix timestamp in seconds.*/,
  `customizable_cta_type` long,
  `destination_url` text /*Destination URL.*/,
  `disclosure_type` long,
  `disclosure_url` text /*URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.*/,
  `grid_click_type` long,
  `ios_deep_link` text /*Deep link URL for iOS devices.*/,
  `is_carting` boolean /*Is the ad a carting/WTB ad?*/,
  `is_collage_accepted_terms` boolean /*Whether the advertiser has accepted the terms and conditions for collage ad.*/,
  `is_collage_single_destination` boolean /*Whether the collage ad has a single destination url override.*/,
  `is_pin_deleted` boolean /*Is original pin deleted?*/,
  `is_removable` boolean /*Is pin repinnable?*/,
  `lead_form_id` text /*Lead form ID for lead ad generation.*/,
  `name` text /*Name of the ad - 255 chars max.*/,
  `quiz_pin_data` long /*Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.*/,
  `status` long,
  `tracking_urls` long,
  `updated_time` int /*Last update time. Unix timestamp in seconds.*/,
  `view_tracking_url` text /*Tracking URL for ad impressions.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdAdDisapprovalReasons` generated from model 'AdAdDisapprovalReasons'

CREATE TABLE IF NOT EXISTS `AdAdDisapprovalReasons` (
  `ad` long NOT NULL
  `adDisapprovalReasons` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdRejectionLabels` generated from model 'AdRejectionLabels'

CREATE TABLE IF NOT EXISTS `AdRejectionLabels` (
  `ad` long NOT NULL
  `rejectionLabels` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdCarouselAndroidDeepLinks` generated from model 'AdCarouselAndroidDeepLinks'

CREATE TABLE IF NOT EXISTS `AdCarouselAndroidDeepLinks` (
  `ad` long NOT NULL
  `carouselAndroidDeepLinks` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdCarouselDestinationUrls` generated from model 'AdCarouselDestinationUrls'

CREATE TABLE IF NOT EXISTS `AdCarouselDestinationUrls` (
  `ad` long NOT NULL
  `carouselDestinationUrls` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdCarouselIosDeepLinks` generated from model 'AdCarouselIosDeepLinks'

CREATE TABLE IF NOT EXISTS `AdCarouselIosDeepLinks` (
  `ad` long NOT NULL
  `carouselIosDeepLinks` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdCartingProduct` generated from model 'AdCartingProduct'

CREATE TABLE IF NOT EXISTS `AdCartingProduct` (
  `ad` long NOT NULL
  `cartingProduct` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccount` generated from model 'adAccount'
--

CREATE TABLE IF NOT EXISTS `AdAccount` (
  `id` text NOT NULL PRIMARY KEY,
  `country` long,
  `created_time` int /* Creation time. Unix timestamp in seconds.*/,
  `currency` long,
  `name` text /*Ad account name.*/,
  `owner` long /*Ad account owner*/,
  `time_zone` text /*The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.*/,
  `updated_time` int
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountBusinessAccessRole` generated from model 'AdAccountBusinessAccessRole'

CREATE TABLE IF NOT EXISTS `AdAccountBusinessAccessRole` (
  `adAccount` long NOT NULL
  `businessAccessRole` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountAnalyticsItems` generated from model 'adAccountAnalyticsItems'
--

CREATE TABLE IF NOT EXISTS `AdAccountAnalyticsItems` (
  `AD_ACCOUNT_ID` text NOT NULL,
  `DATE` date
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ad_account_countries_get_200_response` generated from model 'adAccountCountriesGet200Response'
--

CREATE TABLE IF NOT EXISTS `ad_account_countries_get_200_response` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountCountriesGet200ResponseAdAccountsCountry` generated from model 'AdAccountCountriesGet200ResponseAdAccountsCountry'

CREATE TABLE IF NOT EXISTS `AdAccountCountriesGet200ResponseAdAccountsCountry` (
  `adAccountCountriesGet200Response` long NOT NULL
  `adAccountsCountry` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountCreate` generated from model 'adAccountCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `AdAccountCreate` (
  `country` long,
  `currency` long,
  `name` text /*Ad account name.*/,
  `owner_user_id` text /*Advertiser&#39;s owning user ID.*/,
  `time_zone` text /*The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.*/
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountOwner` generated from model 'adAccountOwner'
--

CREATE TABLE IF NOT EXISTS `AdAccountOwner` (
  `id` text PRIMARY KEY /*The owning account&#39;s user ID.*/,
  `username` text /*Public username for the user account*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountToAdAccountSharedAudience` generated from model 'adAccountToAdAccountSharedAudience'
--

CREATE TABLE IF NOT EXISTS `AdAccountToAdAccountSharedAudience` (
  `audience_id` text NOT NULL /*Unique identifier of an audience*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountToAdAccountSharedAudienceRecipientAccountIds` generated from model 'AdAccountToAdAccountSharedAudienceRecipientAccountIds'

CREATE TABLE IF NOT EXISTS `AdAccountToAdAccountSharedAudienceRecipientAccountIds` (
  `adAccountToAdAccountSharedAudience` long NOT NULL
  `recipientAccountIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountToAdAccountSharedAudienceRole` generated from model 'AdAccountToAdAccountSharedAudienceRole'

CREATE TABLE IF NOT EXISTS `AdAccountToAdAccountSharedAudienceRole` (
  `adAccountToAdAccountSharedAudience` long NOT NULL
  `role` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody` generated from model 'adAccountToAdAccountSharedAudienceUpdateWithRequiredBody'
-- Resource create or update operation model with required body fields (no OptionalProperties).
--

CREATE TABLE IF NOT EXISTS `AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody` (
  `audience_id` text NOT NULL /*Unique identifier of an audience*/,
  `operation_type` long NOT NULL,
);  /*Resource create or update operation model with required body fields (no OptionalProperties).*/

-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountToAdAccountSharedAudienceUpdateWithRequiredBodyRecipientAccountIds` generated from model 'AdAccountToAdAccountSharedAudienceUpdateWithRequiredBodyRecipientAccountIds'

CREATE TABLE IF NOT EXISTS `AdAccountToAdAccountSharedAudienceUpdateWithRequiredBodyRecipientAccountIds` (
  `adAccountToAdAccountSharedAudienceUpdateWithRequiredBody` long NOT NULL
  `recipientAccountIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountToBusinessSharedAudience` generated from model 'adAccountToBusinessSharedAudience'
--

CREATE TABLE IF NOT EXISTS `AdAccountToBusinessSharedAudience` (
  `audience_id` text NOT NULL /*Unique identifier of an audience*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountToBusinessSharedAudienceRecipientBusinessIds` generated from model 'AdAccountToBusinessSharedAudienceRecipientBusinessIds'

CREATE TABLE IF NOT EXISTS `AdAccountToBusinessSharedAudienceRecipientBusinessIds` (
  `adAccountToBusinessSharedAudience` long NOT NULL
  `recipientBusinessIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountToBusinessSharedAudienceRole` generated from model 'AdAccountToBusinessSharedAudienceRole'

CREATE TABLE IF NOT EXISTS `AdAccountToBusinessSharedAudienceRole` (
  `adAccountToBusinessSharedAudience` long NOT NULL
  `role` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountToBusinessSharedAudienceUpdateWithRequiredBody` generated from model 'adAccountToBusinessSharedAudienceUpdateWithRequiredBody'
-- Resource create or update operation model with required body fields (no OptionalProperties).
--

CREATE TABLE IF NOT EXISTS `AdAccountToBusinessSharedAudienceUpdateWithRequiredBody` (
  `audience_id` text NOT NULL /*Unique identifier of an audience*/,
  `operation_type` long NOT NULL,
);  /*Resource create or update operation model with required body fields (no OptionalProperties).*/

-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountToBusinessSharedAudienceUpdateWithRequiredBodyRecipientBusinessIds` generated from model 'AdAccountToBusinessSharedAudienceUpdateWithRequiredBodyRecipientBusinessIds'

CREATE TABLE IF NOT EXISTS `AdAccountToBusinessSharedAudienceUpdateWithRequiredBodyRecipientBusinessIds` (
  `adAccountToBusinessSharedAudienceUpdateWithRequiredBody` long NOT NULL
  `recipientBusinessIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountsAudience` generated from model 'adAccountsAudience'
--

CREATE TABLE IF NOT EXISTS `AdAccountsAudience` (
  `id` text NOT NULL PRIMARY KEY /*Audience ID.*/,
  `ad_account_id` text /*Ad account ID.*/,
  `audience_type` long /*[Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR*/,
  `created_by_company_name` text /*The company that created this audience.*/,
  `created_timestamp` int /*Creation time. Unix timestamp in seconds.*/,
  `description` text /*Audience description.*/,
  `is_nca` boolean /*Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.*/,
  `name` text /*Audience name.*/,
  `rule` long,
  `size` int /*Audience size.*/,
  `status` long /*Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.*/,
  `type` text /*Always \&quot;audience\&quot;.*/,
  `updated_timestamp` int /*Last update time. Unix timestamp in seconds.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountsAudienceCreate` generated from model 'adAccountsAudienceCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `AdAccountsAudienceCreate` (
  `ad_account_id` text /*Ad account ID.*/,
  `audience_type` long /*[Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR*/,
  `description` text /*Audience description.*/,
  `name` text /*Audience name.*/,
  `rule` long
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountsAudienceRule` generated from model 'adAccountsAudienceRule'
-- JSON object defining targeted audience users. Example rule formats per audience type: CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&lt;customer list ID&gt;\&quot;} ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&lt;audience ID&gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; } (Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10. The targeted audience should be this % size across Pinterest.) VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&lt;conversion tag ID&gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}} (Retention days should be 1-540. Retention applies to specific customers.) ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.example.com\&quot;], \&quot;engager_type\&quot;: 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).
--

CREATE TABLE IF NOT EXISTS `AdAccountsAudienceRule` (
  `ad_account_id` text /*Ad account ID.*/,
  `country` text /*Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;.*/,
  `customer_list_id` text /*Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;.*/,
  `engagement_type` text /*Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set.*/,
  `engager_type` int /*Optional for ENGAGEMENT. Engager type value should be 1-2.*/,
  `event` text /*A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event.*/,
  `event_data` long,
  `event_source` blob /*Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline*/,
  `ingestion_source` blob /*Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api*/,
  `percentage` int /*Percentage should be 1-10. The targeted audience should be this % size across Pinterest.*/,
  `prefill` boolean /*Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;.*/,
  `retention_days` int /*Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified.*/,
  `visitor_source_id` text /*The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;.*/
);  /*JSON object defining targeted audience users. Example rule formats per audience type: CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&lt;customer list ID&gt;\&quot;} ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&lt;audience ID&gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; } (Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10. The targeted audience should be this % size across Pinterest.) VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&lt;conversion tag ID&gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}} (Retention days should be 1-540. Retention applies to specific customers.) ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.example.com\&quot;], \&quot;engager_type\&quot;: 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).*/

-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountsAudienceRuleAdId` generated from model 'AdAccountsAudienceRuleAdId'

CREATE TABLE IF NOT EXISTS `AdAccountsAudienceRuleAdId` (
  `adAccountsAudienceRule` long NOT NULL
  `adId` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountsAudienceRuleCampaignId` generated from model 'AdAccountsAudienceRuleCampaignId'

CREATE TABLE IF NOT EXISTS `AdAccountsAudienceRuleCampaignId` (
  `adAccountsAudienceRule` long NOT NULL
  `campaignId` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountsAudienceRuleEngagementDomain` generated from model 'AdAccountsAudienceRuleEngagementDomain'

CREATE TABLE IF NOT EXISTS `AdAccountsAudienceRuleEngagementDomain` (
  `adAccountsAudienceRule` long NOT NULL
  `engagementDomain` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountsAudienceRuleAudienceObjectiveType` generated from model 'AdAccountsAudienceRuleAudienceObjectiveType'

CREATE TABLE IF NOT EXISTS `AdAccountsAudienceRuleAudienceObjectiveType` (
  `adAccountsAudienceRule` long NOT NULL
  `audienceObjectiveType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountsAudienceRulePinId` generated from model 'AdAccountsAudienceRulePinId'

CREATE TABLE IF NOT EXISTS `AdAccountsAudienceRulePinId` (
  `adAccountsAudienceRule` long NOT NULL
  `pinId` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountsAudienceRuleSeedId` generated from model 'AdAccountsAudienceRuleSeedId'

CREATE TABLE IF NOT EXISTS `AdAccountsAudienceRuleSeedId` (
  `adAccountsAudienceRule` long NOT NULL
  `seedId` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountsAudienceRuleUrl` generated from model 'AdAccountsAudienceRuleUrl'

CREATE TABLE IF NOT EXISTS `AdAccountsAudienceRuleUrl` (
  `adAccountsAudienceRule` long NOT NULL
  `url` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountsAudienceUpdate` generated from model 'adAccountsAudienceUpdate'
-- Resource create or update operation model.
--

CREATE TABLE IF NOT EXISTS `AdAccountsAudienceUpdate` (
  `ad_account_id` text /*Ad account ID.*/,
  `audience_type` long /*[Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR*/,
  `description` text /*Audience description.*/,
  `name` text /*Audience name.*/,
  `operation_type` long /*Audience operation type (update or remove). Only valid in update request body.*/,
  `rule` long
);  /*Resource create or update operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ad_accounts_audiences_shared_accounts_list_200_response` generated from model 'adAccountsAudiencesSharedAccountsList200Response'
--

CREATE TABLE IF NOT EXISTS `ad_accounts_audiences_shared_accounts_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountsAudiencesSharedAccountsList200ResponseSharedAudienceAccount` generated from model 'AdAccountsAudiencesSharedAccountsList200ResponseSharedAudienceAccount'

CREATE TABLE IF NOT EXISTS `AdAccountsAudiencesSharedAccountsList200ResponseSharedAudienceAccount` (
  `adAccountsAudiencesSharedAccountsList200Response` long NOT NULL
  `sharedAudienceAccount` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountsCountry` generated from model 'adAccountsCountry'
--

CREATE TABLE IF NOT EXISTS `AdAccountsCountry` (
  `code` long NOT NULL,
  `currency` text NOT NULL /*Country currency.*/,
  `index` decimal NOT NULL /*Country index*/,
  `name` text NOT NULL /*Country name*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ad_accounts_list_200_response` generated from model 'adAccountsList200Response'
--

CREATE TABLE IF NOT EXISTS `ad_accounts_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountsList200ResponseAdAccount` generated from model 'AdAccountsList200ResponseAdAccount'

CREATE TABLE IF NOT EXISTS `AdAccountsList200ResponseAdAccount` (
  `adAccountsList200Response` long NOT NULL
  `adAccount` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ad_accounts_subscriptions_get_list_200_response` generated from model 'adAccountsSubscriptionsGetList200Response'
--

CREATE TABLE IF NOT EXISTS `ad_accounts_subscriptions_get_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountsSubscriptionsGetList200ResponseLeadSubscription` generated from model 'AdAccountsSubscriptionsGetList200ResponseLeadSubscription'

CREATE TABLE IF NOT EXISTS `AdAccountsSubscriptionsGetList200ResponseLeadSubscription` (
  `adAccountsSubscriptionsGetList200Response` long NOT NULL
  `leadSubscription` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdBatchItem` generated from model 'adBatchItem'
--

CREATE TABLE IF NOT EXISTS `AdBatchItem` (
  `data` long,
  `exceptions` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdBatchUpdate` generated from model 'adBatchUpdate'
--

CREATE TABLE IF NOT EXISTS `AdBatchUpdate` (
  `id` text NOT NULL PRIMARY KEY /*The ID of this ad.*/,
  `ad_group_id` text /*ID of the ad group that contains the ad.*/,
  `android_deep_link` text /*Deep link URL for Android devices.*/,
  `click_tracking_url` text /*Tracking url for the ad clicks.*/,
  `collection_items_destination_url_template` text /*Destination URL template for all items within a collections drawer.*/,
  `collections_header_type` long,
  `creative_type` long,
  `customizable_cta_type` long,
  `destination_url` text /*Destination URL.*/,
  `disclosure_type` long,
  `disclosure_url` text /*URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.*/,
  `grid_click_type` long,
  `ios_deep_link` text /*Deep link URL for iOS devices.*/,
  `is_carting` boolean /*Is the ad a carting/WTB ad?*/,
  `is_collage_accepted_terms` boolean /*Whether the advertiser has accepted the terms and conditions for collage ad.*/,
  `is_collage_single_destination` boolean /*Whether the collage ad has a single destination url override.*/,
  `is_pin_deleted` boolean /*Is original pin deleted?*/,
  `is_removable` boolean /*Is pin repinnable?*/,
  `lead_form_id` text /*Lead form ID for lead ad generation.*/,
  `name` text /*Name of the ad - 255 chars max.*/,
  `pin_id` text /*Pin ID. This field may only be updated for draft ads.*/,
  `quiz_pin_data` long /*Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.*/,
  `status` long,
  `tracking_urls` long,
  `view_tracking_url` text /*Tracking URL for ad impressions.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdBatchUpdateCarouselAndroidDeepLinks` generated from model 'AdBatchUpdateCarouselAndroidDeepLinks'

CREATE TABLE IF NOT EXISTS `AdBatchUpdateCarouselAndroidDeepLinks` (
  `adBatchUpdate` long NOT NULL
  `carouselAndroidDeepLinks` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdBatchUpdateCarouselDestinationUrls` generated from model 'AdBatchUpdateCarouselDestinationUrls'

CREATE TABLE IF NOT EXISTS `AdBatchUpdateCarouselDestinationUrls` (
  `adBatchUpdate` long NOT NULL
  `carouselDestinationUrls` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdBatchUpdateCarouselIosDeepLinks` generated from model 'AdBatchUpdateCarouselIosDeepLinks'

CREATE TABLE IF NOT EXISTS `AdBatchUpdateCarouselIosDeepLinks` (
  `adBatchUpdate` long NOT NULL
  `carouselIosDeepLinks` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdBatchWriteResponseModel` generated from model 'adBatchWriteResponseModel'
--

CREATE TABLE IF NOT EXISTS `AdBatchWriteResponseModel` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdBatchWriteResponseModelAdBatchItem` generated from model 'AdBatchWriteResponseModelAdBatchItem'

CREATE TABLE IF NOT EXISTS `AdBatchWriteResponseModelAdBatchItem` (
  `adBatchWriteResponseModel` long NOT NULL
  `adBatchItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdCreate` generated from model 'adCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `AdCreate` (
  `ad_group_id` text NOT NULL /*ID of the ad group that contains the ad.*/,
  `creative_type` long NOT NULL,
  `pin_id` text NOT NULL /*Pin ID. This field may only be updated for draft ads.*/,
  `android_deep_link` text /*Deep link URL for Android devices.*/,
  `click_tracking_url` text /*Tracking url for the ad clicks.*/,
  `collection_items_destination_url_template` text /*Destination URL template for all items within a collections drawer.*/,
  `collections_header_type` long,
  `customizable_cta_type` long,
  `destination_url` text /*Destination URL.*/,
  `disclosure_type` long,
  `disclosure_url` text /*URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.*/,
  `grid_click_type` long,
  `ios_deep_link` text /*Deep link URL for iOS devices.*/,
  `is_carting` boolean /*Is the ad a carting/WTB ad?*/,
  `is_collage_accepted_terms` boolean /*Whether the advertiser has accepted the terms and conditions for collage ad.*/,
  `is_collage_single_destination` boolean /*Whether the collage ad has a single destination url override.*/,
  `is_pin_deleted` boolean /*Is original pin deleted?*/,
  `is_removable` boolean /*Is pin repinnable?*/,
  `lead_form_id` text /*Lead form ID for lead ad generation.*/,
  `name` text /*Name of the ad - 255 chars max.*/,
  `quiz_pin_data` long /*Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.*/,
  `status` long,
  `tracking_urls` long,
  `view_tracking_url` text /*Tracking URL for ad impressions.*/
);  /*Resource create operation model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `AdCreateCarouselAndroidDeepLinks` generated from model 'AdCreateCarouselAndroidDeepLinks'

CREATE TABLE IF NOT EXISTS `AdCreateCarouselAndroidDeepLinks` (
  `adCreate` long NOT NULL
  `carouselAndroidDeepLinks` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdCreateCarouselDestinationUrls` generated from model 'AdCreateCarouselDestinationUrls'

CREATE TABLE IF NOT EXISTS `AdCreateCarouselDestinationUrls` (
  `adCreate` long NOT NULL
  `carouselDestinationUrls` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdCreateCarouselIosDeepLinks` generated from model 'AdCreateCarouselIosDeepLinks'

CREATE TABLE IF NOT EXISTS `AdCreateCarouselIosDeepLinks` (
  `adCreate` long NOT NULL
  `carouselIosDeepLinks` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdCreateRequest` generated from model 'adCreateRequest'
--

CREATE TABLE IF NOT EXISTS `AdCreateRequest` (
  `ad_group_id` text NOT NULL /*ID of the ad group that contains the ad.*/,
  `creative_type` long NOT NULL,
  `pin_id` text NOT NULL /*Pin ID.*/,
  `android_deep_link` text /*Deep link URL for Android devices.*/,
  `click_tracking_url` text /*Tracking url for the ad clicks.*/,
  `customizable_cta_type` long,
  `destination_url` text /*Destination URL.*/,
  `disclosure_type` long,
  `disclosure_url` text /*URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.*/,
  `grid_click_type` long,
  `ios_deep_link` text /*Deep link URL for iOS devices.*/,
  `is_carting` boolean /*Is the ad a carting/WTB ad?*/,
  `is_pin_deleted` boolean /*Is original pin deleted?*/,
  `is_removable` boolean /*Is pin repinnable?*/,
  `lead_form_id` text /*Lead form ID for lead ad generation.*/,
  `name` text /*Name of the ad - 255 chars max.*/,
  `quiz_pin_data` blob /*Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.*/,
  `status` long,
  `tracking_urls` blob,
  `view_tracking_url` text /*Tracking URL for ad impressions.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdCreateRequestCarouselAndroidDeepLinks` generated from model 'AdCreateRequestCarouselAndroidDeepLinks'

CREATE TABLE IF NOT EXISTS `AdCreateRequestCarouselAndroidDeepLinks` (
  `adCreateRequest` long NOT NULL
  `carouselAndroidDeepLinks` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdCreateRequestCarouselDestinationUrls` generated from model 'AdCreateRequestCarouselDestinationUrls'

CREATE TABLE IF NOT EXISTS `AdCreateRequestCarouselDestinationUrls` (
  `adCreateRequest` long NOT NULL
  `carouselDestinationUrls` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdCreateRequestCarouselIosDeepLinks` generated from model 'AdCreateRequestCarouselIosDeepLinks'

CREATE TABLE IF NOT EXISTS `AdCreateRequestCarouselIosDeepLinks` (
  `adCreateRequest` long NOT NULL
  `carouselIosDeepLinks` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroup` generated from model 'adGroup'
--

CREATE TABLE IF NOT EXISTS `AdGroup` (
  `billable_event` long NOT NULL,
  `campaign_id` text NOT NULL /*Campaign ID of the ad group.*/,
  `conversion_learning_mode_type` long NOT NULL /*oCPM learn mode*/,
  `created_time` int NOT NULL /*Ad group creation time. Unix timestamp in seconds.*/,
  `id` text NOT NULL PRIMARY KEY /*Ad group ID.*/,
  `name` text NOT NULL /*Ad group name.*/,
  `summary_status` long NOT NULL,
  `type` text NOT NULL /*Always \&quot;adgroup\&quot;.*/,
  `updated_time` int NOT NULL /*Ad group last update time. Unix timestamp in seconds.*/,
  `ad_account_id` text /*Advertiser ID.*/,
  `bid_in_micro_currency` int /*Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.*/,
  `bid_strategy_type` long,
  `budget_in_micro_currency` int /*Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.*/,
  `customer_segment_id` text /*Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;.*/,
  `dca_assets` blob /*[DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.*/,
  `end_time` int /*Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.*/,
  `ext_features` long,
  `feed_profile_id` text /*Feed Profile ID associated to the adgroup.*/,
  `is_creative_optimization` boolean /*Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.*/,
  `is_local_inventory` boolean /*Indicates whether the ad group should use the local inventory.*/,
  `lifetime_frequency_cap` int /*Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field.*/,
  `local_inventory_radius_in_miles` decimal /*The targeting radius of the local inventory ads in miles.*/,
  `optimization_goal_metadata` long /*Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.*/,
  `performance_plus_campaign_settings` long /*Pinterest Performance+ campaign settings.*/,
  `placement_group` long /*[Placement group](https://help.pinterest.com/en/business/article/placement-groups).*/,
  `placement_traffic_type` long /*A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both*/,
  `promotion_application_level` long /*Specify if the promotion is applied at ad group or item level*/,
  `promotion_id` text /*Promotion ID. To clear this field, set to null.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.*/,
  `status` long /*Ad group/entity status.*/,
  `targeting_spec` long,
  `tracking_urls` long,
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting).*/,
  `bid_multiplier` decimal /*[Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).*/,
  `budget_type` long,
  `pacing_delivery_type` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupPromotionIds` generated from model 'AdGroupPromotionIds'

CREATE TABLE IF NOT EXISTS `AdGroupPromotionIds` (
  `adGroup` long NOT NULL
  `promotionIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupTargetingTemplateIds` generated from model 'AdGroupTargetingTemplateIds'

CREATE TABLE IF NOT EXISTS `AdGroupTargetingTemplateIds` (
  `adGroup` long NOT NULL
  `targetingTemplateIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupAudienceSizing` generated from model 'adGroupAudienceSizing'
--

CREATE TABLE IF NOT EXISTS `AdGroupAudienceSizing` (
  `audience_size_lower_bound` decimal /*The lower confidence bound of the estimated potential audience size. \&quot;Potential audience size\&quot; estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.*/,
  `audience_size_upper_bound` decimal /*The upper confidence bound of the estimated potential audience size. \&quot;Potential audience size\&quot; estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupAudienceSizingCreate` generated from model 'adGroupAudienceSizingCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `AdGroupAudienceSizingCreate` (
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).*/,
  `placement_group` long /*[Placement group](/docs/redoc/#section/Placement-group).*/,
  `targeting_spec` long
);  /*Resource create operation model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupAudienceSizingCreateAdGroupAudienceSizingCreativeTypes` generated from model 'AdGroupAudienceSizingCreateAdGroupAudienceSizingCreativeTypes'

CREATE TABLE IF NOT EXISTS `AdGroupAudienceSizingCreateAdGroupAudienceSizingCreativeTypes` (
  `adGroupAudienceSizingCreate` long NOT NULL
  `adGroupAudienceSizingCreativeTypes` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupAudienceSizingCreateAdGroupAudienceSizingKeyword` generated from model 'AdGroupAudienceSizingCreateAdGroupAudienceSizingKeyword'

CREATE TABLE IF NOT EXISTS `AdGroupAudienceSizingCreateAdGroupAudienceSizingKeyword` (
  `adGroupAudienceSizingCreate` long NOT NULL
  `adGroupAudienceSizingKeyword` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupAudienceSizingCreateProductGroupIds` generated from model 'AdGroupAudienceSizingCreateProductGroupIds'

CREATE TABLE IF NOT EXISTS `AdGroupAudienceSizingCreateProductGroupIds` (
  `adGroupAudienceSizingCreate` long NOT NULL
  `productGroupIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupAudienceSizingKeyword` generated from model 'adGroupAudienceSizingKeyword'
--

CREATE TABLE IF NOT EXISTS `AdGroupAudienceSizingKeyword` (
  `match_type` long NOT NULL,
  `value` text NOT NULL /*Keyword value (120 chars max).*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupBase` generated from model 'adGroupBase'
--

CREATE TABLE IF NOT EXISTS `AdGroupBase` (
  `billable_event` long NOT NULL,
  `campaign_id` text NOT NULL /*Campaign ID of the ad group.*/,
  `conversion_learning_mode_type` long NOT NULL /*oCPM learn mode*/,
  `created_time` int NOT NULL /*Ad group creation time. Unix timestamp in seconds.*/,
  `id` text NOT NULL PRIMARY KEY /*Ad group ID.*/,
  `name` text NOT NULL /*Ad group name.*/,
  `summary_status` long NOT NULL,
  `type` text NOT NULL /*Always \&quot;adgroup\&quot;.*/,
  `updated_time` int NOT NULL /*Ad group last update time. Unix timestamp in seconds.*/,
  `ad_account_id` text /*Advertiser ID.*/,
  `bid_in_micro_currency` int /*Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.*/,
  `bid_strategy_type` long,
  `budget_in_micro_currency` int /*Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.*/,
  `customer_segment_id` text /*Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;.*/,
  `dca_assets` blob /*[DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.*/,
  `end_time` int /*Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.*/,
  `ext_features` long,
  `feed_profile_id` text /*Feed Profile ID associated to the adgroup.*/,
  `is_creative_optimization` boolean /*Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.*/,
  `is_local_inventory` boolean /*Indicates whether the ad group should use the local inventory.*/,
  `lifetime_frequency_cap` int /*Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field.*/,
  `local_inventory_radius_in_miles` decimal /*The targeting radius of the local inventory ads in miles.*/,
  `optimization_goal_metadata` long /*Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.*/,
  `performance_plus_campaign_settings` long /*Pinterest Performance+ campaign settings.*/,
  `placement_group` long /*[Placement group](https://help.pinterest.com/en/business/article/placement-groups).*/,
  `placement_traffic_type` long /*A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both*/,
  `promotion_application_level` long /*Specify if the promotion is applied at ad group or item level*/,
  `promotion_id` text /*Promotion ID. To clear this field, set to null.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.*/,
  `status` long /*Ad group/entity status.*/,
  `targeting_spec` long,
  `tracking_urls` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupBasePromotionIds` generated from model 'AdGroupBasePromotionIds'

CREATE TABLE IF NOT EXISTS `AdGroupBasePromotionIds` (
  `adGroupBase` long NOT NULL
  `promotionIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupBaseTargetingTemplateIds` generated from model 'AdGroupBaseTargetingTemplateIds'

CREATE TABLE IF NOT EXISTS `AdGroupBaseTargetingTemplateIds` (
  `adGroupBase` long NOT NULL
  `targetingTemplateIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupCreate` generated from model 'adGroupCreate'
--

CREATE TABLE IF NOT EXISTS `AdGroupCreate` (
  `billable_event` long NOT NULL,
  `campaign_id` text NOT NULL /*Campaign ID of the ad group.*/,
  `conversion_learning_mode_type` long NOT NULL /*oCPM learn mode*/,
  `created_time` int NOT NULL /*Ad group creation time. Unix timestamp in seconds.*/,
  `id` text NOT NULL PRIMARY KEY /*Ad group ID.*/,
  `name` text NOT NULL /*Ad group name.*/,
  `summary_status` long NOT NULL,
  `type` text NOT NULL /*Always \&quot;adgroup\&quot;.*/,
  `updated_time` int NOT NULL /*Ad group last update time. Unix timestamp in seconds.*/,
  `ad_account_id` text /*Advertiser ID.*/,
  `bid_in_micro_currency` int /*Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.*/,
  `bid_strategy_type` long,
  `budget_in_micro_currency` int /*Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.*/,
  `customer_segment_id` text /*Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;.*/,
  `dca_assets` blob /*[DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.*/,
  `end_time` int /*Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.*/,
  `ext_features` long,
  `feed_profile_id` text /*Feed Profile ID associated to the adgroup.*/,
  `is_creative_optimization` boolean /*Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.*/,
  `is_local_inventory` boolean /*Indicates whether the ad group should use the local inventory.*/,
  `lifetime_frequency_cap` int /*Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field.*/,
  `local_inventory_radius_in_miles` decimal /*The targeting radius of the local inventory ads in miles.*/,
  `optimization_goal_metadata` long /*Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.*/,
  `performance_plus_campaign_settings` long /*Pinterest Performance+ campaign settings.*/,
  `placement_group` long /*[Placement group](https://help.pinterest.com/en/business/article/placement-groups).*/,
  `placement_traffic_type` long /*A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both*/,
  `promotion_application_level` long /*Specify if the promotion is applied at ad group or item level*/,
  `promotion_id` text /*Promotion ID. To clear this field, set to null.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.*/,
  `status` long /*Ad group/entity status.*/,
  `targeting_spec` long,
  `tracking_urls` long,
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting).*/,
  `bid_multiplier` decimal /*[Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).*/,
  `budget_type` long,
  `pacing_delivery_type` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupCreatePromotionIds` generated from model 'AdGroupCreatePromotionIds'

CREATE TABLE IF NOT EXISTS `AdGroupCreatePromotionIds` (
  `adGroupCreate` long NOT NULL
  `promotionIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupCreateTargetingTemplateIds` generated from model 'AdGroupCreateTargetingTemplateIds'

CREATE TABLE IF NOT EXISTS `AdGroupCreateTargetingTemplateIds` (
  `adGroupCreate` long NOT NULL
  `targetingTemplateIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupCreateCreate` generated from model 'adGroupCreateCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `AdGroupCreateCreate` (
  `billable_event` long NOT NULL,
  `campaign_id` text NOT NULL /*Campaign ID of the ad group.*/,
  `name` text NOT NULL /*Ad group name.*/,
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting).*/,
  `bid_in_micro_currency` int /*Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.*/,
  `bid_multiplier` decimal /*[Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).*/,
  `bid_strategy_type` long,
  `budget_in_micro_currency` int /*Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.*/,
  `budget_type` long,
  `customer_segment_id` text /*Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;.*/,
  `end_time` int /*Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.*/,
  `ext_features` long,
  `feed_profile_id` text /*Feed Profile ID associated to the adgroup.*/,
  `is_creative_optimization` boolean /*Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.*/,
  `is_local_inventory` boolean /*Indicates whether the ad group should use the local inventory.*/,
  `lifetime_frequency_cap` int /*Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field.*/,
  `local_inventory_radius_in_miles` decimal /*The targeting radius of the local inventory ads in miles.*/,
  `optimization_goal_metadata` long /*Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.*/,
  `pacing_delivery_type` long,
  `performance_plus_campaign_settings` long /*Pinterest Performance+ campaign settings.*/,
  `placement_group` long /*[Placement group](https://help.pinterest.com/en/business/article/placement-groups).*/,
  `placement_traffic_type` long /*A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both*/,
  `promotion_application_level` long /*Specify if the promotion is applied at ad group or item level*/,
  `promotion_id` text /*Promotion ID. To clear this field, set to null.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.*/,
  `status` long /*Ad group/entity status.*/,
  `targeting_spec` long,
  `tracking_urls` long
);  /*Resource create operation model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupCreateCreatePromotionIds` generated from model 'AdGroupCreateCreatePromotionIds'

CREATE TABLE IF NOT EXISTS `AdGroupCreateCreatePromotionIds` (
  `adGroupCreateCreate` long NOT NULL
  `promotionIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupCreateCreateTargetingTemplateIds` generated from model 'AdGroupCreateCreateTargetingTemplateIds'

CREATE TABLE IF NOT EXISTS `AdGroupCreateCreateTargetingTemplateIds` (
  `adGroupCreateCreate` long NOT NULL
  `targetingTemplateIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupCreateRequest` generated from model 'adGroupCreateRequest'
--

CREATE TABLE IF NOT EXISTS `AdGroupCreateRequest` (
  `billable_event` long NOT NULL,
  `campaign_id` text NOT NULL /*Campaign ID of the ad group.*/,
  `name` text NOT NULL /*Ad group name.*/,
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;Pinterest Performance+ targeting\&quot;&lt;/a&gt;.*/,
  `bid_multiplier` decimal /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;.*/,
  `budget_type` long,
  `pacing_delivery_type` long,
  `bid_in_micro_currency` int /*Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.*/,
  `bid_strategy_type` long,
  `budget_in_micro_currency` int /*Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.*/,
  `end_time` int /*Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.*/,
  `is_creative_optimization` boolean /*Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.*/,
  `lifetime_frequency_cap` int /*Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.*/,
  `optimization_goal_metadata` blob /*Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.*/,
  `placement_group` long /*&lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.*/,
  `promotion_application_level` text /*Specify if the promotion is applied at ad group or item level*/,
  `promotion_id` text /*Promotion ID. To clear this field, set to null.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.*/,
  `status` long /*Ad group/entity status.*/,
  `targeting_spec` long,
  `tracking_urls` blob /*Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - EmptyObject - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupCreateRequestPromotionIds` generated from model 'AdGroupCreateRequestPromotionIds'

CREATE TABLE IF NOT EXISTS `AdGroupCreateRequestPromotionIds` (
  `adGroupCreateRequest` long NOT NULL
  `promotionIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupCreateRequestTargetingTemplateIds` generated from model 'AdGroupCreateRequestTargetingTemplateIds'

CREATE TABLE IF NOT EXISTS `AdGroupCreateRequestTargetingTemplateIds` (
  `adGroupCreateRequest` long NOT NULL
  `targetingTemplateIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupCreateRequestAllOf1` generated from model 'adGroupCreateRequestAllOf1'
--

CREATE TABLE IF NOT EXISTS `AdGroupCreateRequestAllOf1` (
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;Pinterest Performance+ targeting\&quot;&lt;/a&gt;.*/,
  `bid_multiplier` decimal /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;.*/,
  `budget_type` long,
  `pacing_delivery_type` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupDeliveryEstimates` generated from model 'adGroupDeliveryEstimates'
-- Ad group configuration for delivery estimates.
--

CREATE TABLE IF NOT EXISTS `AdGroupDeliveryEstimates` (
  `auto_targeting_enabled` boolean,
  `monthly_frequency_cap` int UNSIGNED /*Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.*/,
  `optimization_goal_metadata` long,
  `optimization_type` long /*Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.*/,
  `placement_group` long,
  `targeting_spec` long
);  /*Ad group configuration for delivery estimates.*/

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupDeliveryEstimatesAdGroupAudienceSizingCreativeTypes` generated from model 'AdGroupDeliveryEstimatesAdGroupAudienceSizingCreativeTypes'

CREATE TABLE IF NOT EXISTS `AdGroupDeliveryEstimatesAdGroupAudienceSizingCreativeTypes` (
  `adGroupDeliveryEstimates` long NOT NULL
  `adGroupAudienceSizingCreativeTypes` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupDeliveryEstimatesAdGroupDeliveryEstimatesKeywordsItems` generated from model 'AdGroupDeliveryEstimatesAdGroupDeliveryEstimatesKeywordsItems'

CREATE TABLE IF NOT EXISTS `AdGroupDeliveryEstimatesAdGroupDeliveryEstimatesKeywordsItems` (
  `adGroupDeliveryEstimates` long NOT NULL
  `adGroupDeliveryEstimatesKeywordsItems` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupDeliveryEstimatesProductGroupIds` generated from model 'AdGroupDeliveryEstimatesProductGroupIds'

CREATE TABLE IF NOT EXISTS `AdGroupDeliveryEstimatesProductGroupIds` (
  `adGroupDeliveryEstimates` long NOT NULL
  `productGroupIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupDeliveryEstimatesKeywordsItems` generated from model 'adGroupDeliveryEstimatesKeywordsItems'
--

CREATE TABLE IF NOT EXISTS `AdGroupDeliveryEstimatesKeywordsItems` (
  `match_type` long NOT NULL,
  `value` text NOT NULL /*Keyword value (120 chars max).*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupTrackingURLs` generated from model 'adGroupTrackingURLs'
--   Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).
--

CREATE TABLE IF NOT EXISTS `AdGroupTrackingURLs` (
);  /*  Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).*/

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupTrackingURLsAudienceVerification` generated from model 'AdGroupTrackingURLsAudienceVerification'

CREATE TABLE IF NOT EXISTS `AdGroupTrackingURLsAudienceVerification` (
  `adGroupTrackingURLs` long NOT NULL
  `audienceVerification` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupTrackingURLsBuyableButton` generated from model 'AdGroupTrackingURLsBuyableButton'

CREATE TABLE IF NOT EXISTS `AdGroupTrackingURLsBuyableButton` (
  `adGroupTrackingURLs` long NOT NULL
  `buyableButton` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupTrackingURLsClick` generated from model 'AdGroupTrackingURLsClick'

CREATE TABLE IF NOT EXISTS `AdGroupTrackingURLsClick` (
  `adGroupTrackingURLs` long NOT NULL
  `click` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupTrackingURLsEngagement` generated from model 'AdGroupTrackingURLsEngagement'

CREATE TABLE IF NOT EXISTS `AdGroupTrackingURLsEngagement` (
  `adGroupTrackingURLs` long NOT NULL
  `engagement` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupTrackingURLsImpression` generated from model 'AdGroupTrackingURLsImpression'

CREATE TABLE IF NOT EXISTS `AdGroupTrackingURLsImpression` (
  `adGroupTrackingURLs` long NOT NULL
  `impression` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupUpdate` generated from model 'adGroupUpdate'
--

CREATE TABLE IF NOT EXISTS `AdGroupUpdate` (
  `billable_event` long NOT NULL,
  `campaign_id` text NOT NULL /*Campaign ID of the ad group.*/,
  `conversion_learning_mode_type` long NOT NULL /*oCPM learn mode*/,
  `created_time` int NOT NULL /*Ad group creation time. Unix timestamp in seconds.*/,
  `id` text NOT NULL PRIMARY KEY /*Ad group ID.*/,
  `name` text NOT NULL /*Ad group name.*/,
  `summary_status` long NOT NULL,
  `type` text NOT NULL /*Always \&quot;adgroup\&quot;.*/,
  `updated_time` int NOT NULL /*Ad group last update time. Unix timestamp in seconds.*/,
  `ad_account_id` text /*Advertiser ID.*/,
  `bid_in_micro_currency` int /*Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.*/,
  `bid_strategy_type` long,
  `budget_in_micro_currency` int /*Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.*/,
  `customer_segment_id` text /*Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;.*/,
  `dca_assets` blob /*[DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.*/,
  `end_time` int /*Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.*/,
  `ext_features` long,
  `feed_profile_id` text /*Feed Profile ID associated to the adgroup.*/,
  `is_creative_optimization` boolean /*Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.*/,
  `is_local_inventory` boolean /*Indicates whether the ad group should use the local inventory.*/,
  `lifetime_frequency_cap` int /*Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field.*/,
  `local_inventory_radius_in_miles` decimal /*The targeting radius of the local inventory ads in miles.*/,
  `optimization_goal_metadata` long /*Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.*/,
  `performance_plus_campaign_settings` long /*Pinterest Performance+ campaign settings.*/,
  `placement_group` long /*[Placement group](https://help.pinterest.com/en/business/article/placement-groups).*/,
  `placement_traffic_type` long /*A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both*/,
  `promotion_application_level` long /*Specify if the promotion is applied at ad group or item level*/,
  `promotion_id` text /*Promotion ID. To clear this field, set to null.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.*/,
  `status` long /*Ad group/entity status.*/,
  `targeting_spec` long,
  `tracking_urls` long,
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting).*/,
  `bid_multiplier` decimal /*[Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).*/,
  `budget_type` long,
  `pacing_delivery_type` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupUpdatePromotionIds` generated from model 'AdGroupUpdatePromotionIds'

CREATE TABLE IF NOT EXISTS `AdGroupUpdatePromotionIds` (
  `adGroupUpdate` long NOT NULL
  `promotionIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupUpdateTargetingTemplateIds` generated from model 'AdGroupUpdateTargetingTemplateIds'

CREATE TABLE IF NOT EXISTS `AdGroupUpdateTargetingTemplateIds` (
  `adGroupUpdate` long NOT NULL
  `targetingTemplateIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupUpdateBatchUpdate` generated from model 'adGroupUpdateBatchUpdate'
--

CREATE TABLE IF NOT EXISTS `AdGroupUpdateBatchUpdate` (
  `id` text NOT NULL PRIMARY KEY /*Ad group ID.*/,
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting).*/,
  `bid_in_micro_currency` int /*Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.*/,
  `bid_multiplier` decimal /*[Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).*/,
  `bid_strategy_type` long,
  `billable_event` long,
  `budget_in_micro_currency` int /*Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.*/,
  `budget_type` long,
  `campaign_id` text /*Campaign ID of the ad group.*/,
  `customer_segment_id` text /*Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;.*/,
  `end_time` int /*Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.*/,
  `ext_features` long,
  `feed_profile_id` text /*Feed Profile ID associated to the adgroup.*/,
  `is_creative_optimization` boolean /*Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.*/,
  `is_local_inventory` boolean /*Indicates whether the ad group should use the local inventory.*/,
  `lifetime_frequency_cap` int /*Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field.*/,
  `local_inventory_radius_in_miles` decimal /*The targeting radius of the local inventory ads in miles.*/,
  `name` text /*Ad group name.*/,
  `optimization_goal_metadata` long /*Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.*/,
  `pacing_delivery_type` long,
  `performance_plus_campaign_settings` long /*Pinterest Performance+ campaign settings.*/,
  `placement_group` long /*[Placement group](https://help.pinterest.com/en/business/article/placement-groups).*/,
  `placement_traffic_type` long /*A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both*/,
  `promotion_application_level` long /*Specify if the promotion is applied at ad group or item level*/,
  `promotion_id` text /*Promotion ID. To clear this field, set to null.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.*/,
  `status` long /*Ad group/entity status.*/,
  `targeting_spec` long,
  `tracking_urls` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupUpdateBatchUpdatePromotionIds` generated from model 'AdGroupUpdateBatchUpdatePromotionIds'

CREATE TABLE IF NOT EXISTS `AdGroupUpdateBatchUpdatePromotionIds` (
  `adGroupUpdateBatchUpdate` long NOT NULL
  `promotionIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupUpdateBatchUpdateTargetingSpecOperations` generated from model 'AdGroupUpdateBatchUpdateTargetingSpecOperations'

CREATE TABLE IF NOT EXISTS `AdGroupUpdateBatchUpdateTargetingSpecOperations` (
  `adGroupUpdateBatchUpdate` long NOT NULL
  `targetingSpecOperations` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupUpdateBatchUpdateTargetingTemplateIds` generated from model 'AdGroupUpdateBatchUpdateTargetingTemplateIds'

CREATE TABLE IF NOT EXISTS `AdGroupUpdateBatchUpdateTargetingTemplateIds` (
  `adGroupUpdateBatchUpdate` long NOT NULL
  `targetingTemplateIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupUpdateRequest` generated from model 'adGroupUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `AdGroupUpdateRequest` (
  `id` text NOT NULL PRIMARY KEY /*Ad group ID.*/,
  `bid_multiplier` decimal /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;.*/,
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;Pinterest Performance+ targeting\&quot;&lt;/a&gt;.*/,
  `bid_in_micro_currency` int /*Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.*/,
  `bid_strategy_type` long,
  `billable_event` long,
  `budget_in_micro_currency` int /*Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.*/,
  `budget_type` long,
  `campaign_id` text /*Campaign ID of the ad group.*/,
  `end_time` int /*Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.*/,
  `is_creative_optimization` boolean /*Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.*/,
  `lifetime_frequency_cap` int /*Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.*/,
  `name` text /*Ad group name.*/,
  `optimization_goal_metadata` blob /*Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.*/,
  `pacing_delivery_type` long,
  `placement_group` long /*&lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.*/,
  `promotion_application_level` text /*Specify if the promotion is applied at ad group or item level*/,
  `promotion_id` text /*Promotion ID. To clear this field, set to null.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.*/,
  `status` long /*Ad group/entity status.*/,
  `targeting_spec` long,
  `tracking_urls` blob /*Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - EmptyObject - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupUpdateRequestTargetingSpecOperations` generated from model 'AdGroupUpdateRequestTargetingSpecOperations'

CREATE TABLE IF NOT EXISTS `AdGroupUpdateRequestTargetingSpecOperations` (
  `adGroupUpdateRequest` long NOT NULL
  `targetingSpecOperations` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupUpdateRequestPromotionIds` generated from model 'AdGroupUpdateRequestPromotionIds'

CREATE TABLE IF NOT EXISTS `AdGroupUpdateRequestPromotionIds` (
  `adGroupUpdateRequest` long NOT NULL
  `promotionIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupUpdateRequestTargetingTemplateIds` generated from model 'AdGroupUpdateRequestTargetingTemplateIds'

CREATE TABLE IF NOT EXISTS `AdGroupUpdateRequestTargetingTemplateIds` (
  `adGroupUpdateRequest` long NOT NULL
  `targetingTemplateIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupUpdateRequestAllOf1` generated from model 'adGroupUpdateRequestAllOf1'
--

CREATE TABLE IF NOT EXISTS `AdGroupUpdateRequestAllOf1` (
  `id` text NOT NULL PRIMARY KEY /*Ad group ID.*/,
  `bid_multiplier` decimal /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupUpdateRequestAllOf1TargetingSpecOperations` generated from model 'AdGroupUpdateRequestAllOf1TargetingSpecOperations'

CREATE TABLE IF NOT EXISTS `AdGroupUpdateRequestAllOf1TargetingSpecOperations` (
  `adGroupUpdateRequestAllOf1` long NOT NULL
  `targetingSpecOperations` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupsAnalyticsMetrics` generated from model 'adGroupsAnalyticsMetrics'
--

CREATE TABLE IF NOT EXISTS `AdGroupsAnalyticsMetrics` (
  `AD_GROUP_ID` text /*The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true.*/,
  `DATE` date /*Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ad_groups_create_200_response` generated from model 'adGroupsCreate200Response'
--

CREATE TABLE IF NOT EXISTS `ad_groups_create_200_response` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupsCreate200ResponseAdGroupsCreate200ResponseItemsInner` generated from model 'AdGroupsCreate200ResponseAdGroupsCreate200ResponseItemsInner'

CREATE TABLE IF NOT EXISTS `AdGroupsCreate200ResponseAdGroupsCreate200ResponseItemsInner` (
  `adGroupsCreate200Response` long NOT NULL
  `adGroupsCreate200ResponseItemsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ad_groups_create_200_response_items_inner` generated from model 'adGroupsCreate200ResponseItemsInner'
--

CREATE TABLE IF NOT EXISTS `ad_groups_create_200_response_items_inner` (
  `data` long,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupsCreate200ResponseItemsInnerPinterestLibBatchItemException` generated from model 'AdGroupsCreate200ResponseItemsInnerPinterestLibBatchItemException'

CREATE TABLE IF NOT EXISTS `AdGroupsCreate200ResponseItemsInnerPinterestLibBatchItemException` (
  `adGroupsCreate200ResponseItemsInner` long NOT NULL
  `pinterestLibBatchItemException` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ad_groups_list_200_response` generated from model 'adGroupsList200Response'
--

CREATE TABLE IF NOT EXISTS `ad_groups_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupsList200ResponseAdGroup` generated from model 'AdGroupsList200ResponseAdGroup'

CREATE TABLE IF NOT EXISTS `AdGroupsList200ResponseAdGroup` (
  `adGroupsList200Response` long NOT NULL
  `adGroup` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdPinAnalytics` generated from model 'adPinAnalytics'
--

CREATE TABLE IF NOT EXISTS `AdPinAnalytics` (
  `PIN_ID` text NOT NULL /*The ID of the pin that the metric belongs to.*/,
  `DATE` date /*Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdPreviewRequest` generated from model 'adPreviewRequest'
--

CREATE TABLE IF NOT EXISTS `AdPreviewRequest` (
  `image_url` text NOT NULL /*Image URL.*/,
  `title` text NOT NULL /*Title displayed below ad.*/,
  `creative_type` long NOT NULL /*Ad format of the shopping ad preview.*/,
  `pin_id` text NOT NULL /*Pin ID.*/,
  `catalog_product_group_id` text NOT NULL /*Catalog Product Group Id.*/,
  `promotion_id` text /*Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.*/,
  `customizable_cta_type` long /*Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60;*/,
  `hero_image_title` text /*Title displayed below ad.*/,
  `hero_image_url` text /*Hero image URL.*/,
  `hero_pin_id` text /*Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.*/,
  `image_tag` text /*Multi image template tag.*/,
  `item_id` text /*Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.*/,
  `preferred_media_type` long /*Preferred media type.*/,
  `show_promotion` boolean /*Include promotion data in preview when available on catalog item. Defaults to false.*/,
  `video_tag` text /*Multi video template tag, image_tag and video_tag are mutual exclusive.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdPreviewShopping` generated from model 'adPreviewShopping'
-- Ad preview from a catalog product group (shopping).
--

CREATE TABLE IF NOT EXISTS `AdPreviewShopping` (
  `catalog_product_group_id` text NOT NULL /*Catalog Product Group Id.*/,
  `creative_type` long NOT NULL /*Ad format of the shopping ad preview.*/,
  `customizable_cta_type` long /*Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60;*/,
  `hero_image_title` text /*Title displayed below ad.*/,
  `hero_image_url` text /*Hero image URL.*/,
  `hero_pin_id` text /*Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.*/,
  `image_tag` text /*Multi image template tag.*/,
  `item_id` text /*Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.*/,
  `preferred_media_type` long /*Preferred media type.*/,
  `show_promotion` boolean /*Include promotion data in preview when available on catalog item. Defaults to false.*/,
  `video_tag` text /*Multi video template tag, image_tag and video_tag are mutual exclusive.*/
);  /*Ad preview from a catalog product group (shopping).*/


-- --------------------------------------------------------------------------
-- Table structure for table `AdPreviewSourceImage` generated from model 'adPreviewSourceImage'
-- Ad preview source from an image URL.
--

CREATE TABLE IF NOT EXISTS `AdPreviewSourceImage` (
  `image_url` text NOT NULL /*Image URL.*/,
  `title` text NOT NULL /*Title displayed below ad.*/,
  `promotion_id` text /*Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.*/
);  /*Ad preview source from an image URL.*/


-- --------------------------------------------------------------------------
-- Table structure for table `AdPreviewSourcePinId` generated from model 'adPreviewSourcePinId'
-- Ad preview source from an existing Pin.
--

CREATE TABLE IF NOT EXISTS `AdPreviewSourcePinId` (
  `pin_id` text NOT NULL /*Pin ID.*/,
  `creative_type` long /*Creative type of the ad preview.*/
);  /*Ad preview source from an existing Pin.*/


-- --------------------------------------------------------------------------
-- Table structure for table `AdPreviewURLResponse` generated from model 'adPreviewURLResponse'
--

CREATE TABLE IF NOT EXISTS `AdPreviewURLResponse` (
  `url` text /*Preview URL, expires in 7 days. Can be used in an iframe. For example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/ The preview object ID/key is the last param - 74667c814dd2b19*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdUpdateRequest` generated from model 'adUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `AdUpdateRequest` (
  `id` text NOT NULL PRIMARY KEY /*The ID of this ad.*/,
  `pin_id` text /*Pin ID. This field may only be updated for draft ads.*/,
  `ad_group_id` text /*ID of the ad group that contains the ad.*/,
  `android_deep_link` text /*Deep link URL for Android devices.*/,
  `click_tracking_url` text /*Tracking url for the ad clicks.*/,
  `creative_type` long,
  `customizable_cta_type` long,
  `destination_url` text /*Destination URL.*/,
  `disclosure_type` long,
  `disclosure_url` text /*URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.*/,
  `grid_click_type` long,
  `ios_deep_link` text /*Deep link URL for iOS devices.*/,
  `is_carting` boolean /*Is the ad a carting/WTB ad?*/,
  `is_pin_deleted` boolean /*Is original pin deleted?*/,
  `is_removable` boolean /*Is pin repinnable?*/,
  `lead_form_id` text /*Lead form ID for lead ad generation.*/,
  `name` text /*Name of the ad - 255 chars max.*/,
  `quiz_pin_data` blob /*Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.*/,
  `status` long,
  `tracking_urls` blob,
  `view_tracking_url` text /*Tracking URL for ad impressions.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdUpdateRequestCarouselAndroidDeepLinks` generated from model 'AdUpdateRequestCarouselAndroidDeepLinks'

CREATE TABLE IF NOT EXISTS `AdUpdateRequestCarouselAndroidDeepLinks` (
  `adUpdateRequest` long NOT NULL
  `carouselAndroidDeepLinks` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdUpdateRequestCarouselDestinationUrls` generated from model 'AdUpdateRequestCarouselDestinationUrls'

CREATE TABLE IF NOT EXISTS `AdUpdateRequestCarouselDestinationUrls` (
  `adUpdateRequest` long NOT NULL
  `carouselDestinationUrls` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdUpdateRequestCarouselIosDeepLinks` generated from model 'AdUpdateRequestCarouselIosDeepLinks'

CREATE TABLE IF NOT EXISTS `AdUpdateRequestCarouselIosDeepLinks` (
  `adUpdateRequest` long NOT NULL
  `carouselIosDeepLinks` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdUpdateRequestAllOf1` generated from model 'adUpdateRequestAllOf1'
--

CREATE TABLE IF NOT EXISTS `AdUpdateRequestAllOf1` (
  `id` text NOT NULL PRIMARY KEY /*The ID of this ad.*/,
  `pin_id` text /*Pin ID. This field may only be updated for draft ads.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdgroupTrackingFeatures` generated from model 'adgroupTrackingFeatures'
--

CREATE TABLE IF NOT EXISTS `AdgroupTrackingFeatures` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdgroupTrackingFeaturesAdgroupTrackingFeatureType` generated from model 'AdgroupTrackingFeaturesAdgroupTrackingFeatureType'

CREATE TABLE IF NOT EXISTS `AdgroupTrackingFeaturesAdgroupTrackingFeatureType` (
  `adgroupTrackingFeatures` long NOT NULL
  `adgroupTrackingFeatureType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalytics` generated from model 'adsAnalytics'
--

CREATE TABLE IF NOT EXISTS `AdsAnalytics` (
  `AD_ID` text NOT NULL,
  `DATE` date
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequest` generated from model 'adsAnalyticsCreateAsyncRequest'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequest` (
  `end_date` text NOT NULL /*Metric report end date (UTC). Format: YYYY-MM-DD*/,
  `granularity` long NOT NULL /*  TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.*/,
  `start_date` text NOT NULL /*Metric report start date (UTC). Format: YYYY-MM-DD*/,
  `campaign_brand_label` text /*Campaign brand label for filtering.*/,
  `campaign_custom_label` text /*Campaign custom label for filtering.*/,
  `click_window_days` long /*Number of days to use as the conversion attribution window for a pin click action.*/,
  `combine_targeting_types` boolean /*Determines if the targeting types included in the request should be consolidated into a single breakdown.*/,
  `conversion_report_time` long /*Date dimension for conversion metrics.*/,
  `end_hour` int UNSIGNED /*Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.*/,
  `engagement_window_days` long /*Number of days to use as the conversion attribution window for an engagement action.*/,
  `level` long /*Level of the report*/,
  `primary_sort` long,
  `report_format` long,
  `reporting_timezone` long /*Specify the timezone to be applied for the reporting.*/,
  `start_hour` int UNSIGNED /*Which hour of the start date to begin the report. Only allowed for hourly reports.*/,
  `view_window_days` long /*Number of days to use as the conversion attribution window for a view action.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequestAdGroupIds` generated from model 'AdsAnalyticsCreateAsyncRequestAdGroupIds'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestAdGroupIds` (
  `adsAnalyticsCreateAsyncRequest` long NOT NULL
  `adGroupIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequestAdGroupSummaryStatus` generated from model 'AdsAnalyticsCreateAsyncRequestAdGroupSummaryStatus'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestAdGroupSummaryStatus` (
  `adsAnalyticsCreateAsyncRequest` long NOT NULL
  `adGroupSummaryStatus` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequestAdIds` generated from model 'AdsAnalyticsCreateAsyncRequestAdIds'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestAdIds` (
  `adsAnalyticsCreateAsyncRequest` long NOT NULL
  `adIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequestPinPromotionSummaryStatus` generated from model 'AdsAnalyticsCreateAsyncRequestPinPromotionSummaryStatus'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestPinPromotionSummaryStatus` (
  `adsAnalyticsCreateAsyncRequest` long NOT NULL
  `pinPromotionSummaryStatus` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequestConversionReportAttributionType` generated from model 'AdsAnalyticsCreateAsyncRequestConversionReportAttributionType'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestConversionReportAttributionType` (
  `adsAnalyticsCreateAsyncRequest` long NOT NULL
  `conversionReportAttributionType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequestCampaignIds` generated from model 'AdsAnalyticsCreateAsyncRequestCampaignIds'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestCampaignIds` (
  `adsAnalyticsCreateAsyncRequest` long NOT NULL
  `campaignIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequestCampaignObjectiveType` generated from model 'AdsAnalyticsCreateAsyncRequestCampaignObjectiveType'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestCampaignObjectiveType` (
  `adsAnalyticsCreateAsyncRequest` long NOT NULL
  `campaignObjectiveType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequestCampaignSummaryStatus` generated from model 'AdsAnalyticsCreateAsyncRequestCampaignSummaryStatus'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestCampaignSummaryStatus` (
  `adsAnalyticsCreateAsyncRequest` long NOT NULL
  `campaignSummaryStatus` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequestReportingColumnAsync` generated from model 'AdsAnalyticsCreateAsyncRequestReportingColumnAsync'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestReportingColumnAsync` (
  `adsAnalyticsCreateAsyncRequest` long NOT NULL
  `reportingColumnAsync` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequestCustomConversionEventMetrics` generated from model 'AdsAnalyticsCreateAsyncRequestCustomConversionEventMetrics'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestCustomConversionEventMetrics` (
  `adsAnalyticsCreateAsyncRequest` long NOT NULL
  `customConversionEventMetrics` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequestAdsAnalyticsMetricsFilter` generated from model 'AdsAnalyticsCreateAsyncRequestAdsAnalyticsMetricsFilter'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestAdsAnalyticsMetricsFilter` (
  `adsAnalyticsCreateAsyncRequest` long NOT NULL
  `adsAnalyticsMetricsFilter` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequestProductGroupIds` generated from model 'AdsAnalyticsCreateAsyncRequestProductGroupIds'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestProductGroupIds` (
  `adsAnalyticsCreateAsyncRequest` long NOT NULL
  `productGroupIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequestProductGroupSummaryStatus` generated from model 'AdsAnalyticsCreateAsyncRequestProductGroupSummaryStatus'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestProductGroupSummaryStatus` (
  `adsAnalyticsCreateAsyncRequest` long NOT NULL
  `productGroupSummaryStatus` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequestProductItemIds` generated from model 'AdsAnalyticsCreateAsyncRequestProductItemIds'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestProductItemIds` (
  `adsAnalyticsCreateAsyncRequest` long NOT NULL
  `productItemIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequestAdAdsAnalyticsAsyncTargetingTypes` generated from model 'AdsAnalyticsCreateAsyncRequestAdAdsAnalyticsAsyncTargetingTypes'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestAdAdsAnalyticsAsyncTargetingTypes` (
  `adsAnalyticsCreateAsyncRequest` long NOT NULL
  `adAdsAnalyticsAsyncTargetingTypes` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncResponse` generated from model 'adsAnalyticsCreateAsyncResponse'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncResponse` (
  `message` text,
  `report_status` long,
  `token` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsGetAsyncResponse` generated from model 'adsAnalyticsGetAsyncResponse'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsGetAsyncResponse` (
  `report_status` long,
  `size` decimal,
  `url` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsMetricsFilter` generated from model 'adsAnalyticsMetricsFilter'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsMetricsFilter` (
  `field` long NOT NULL,
  `operator` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsMetricsFilterPropertyValues` generated from model 'AdsAnalyticsMetricsFilterPropertyValues'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsMetricsFilterPropertyValues` (
  `adsAnalyticsMetricsFilter` long NOT NULL
  `propertyValues` decimal NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdsCreditDiscountsResponse` generated from model 'adsCreditDiscountsResponse'
--

CREATE TABLE IF NOT EXISTS `AdsCreditDiscountsResponse` (
  `active` boolean /*True if the offer code is currently active.*/,
  `advertiser_id` text /*Advertiser ID the offer was applied to.*/,
  `discountCurrency` text /*Currency value for the discount.*/,
  `discountInMicroCurrency` decimal /*The discount applied in the offer&#39;s currency value.*/,
  `discountType` long /*The type of discount of this credit*/,
  `remainingDiscountInMicroCurrency` decimal /*The credits left to spend.*/,
  `title` text /*Human readable title of the offer code.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdsCreditRedeem` generated from model 'adsCreditRedeem'
-- Ads credit redemption
--

CREATE TABLE IF NOT EXISTS `AdsCreditRedeem` (
  `errorCode` int /*Error code type if error occurs*/,
  `errorMessage` text /*Reason for failure*/,
  `success` boolean /*Returns true if the offer code was successfully applied(validateOnly&#x3D;false) or can be applied(validateOnly&#x3D;true).*/
);  /*Ads credit redemption*/


-- --------------------------------------------------------------------------
-- Table structure for table `AdsCreditRedeemCreate` generated from model 'adsCreditRedeemCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `AdsCreditRedeemCreate` (
  `offerCodeHash` text NOT NULL /*Takes in a SHA256 hash of the offerCode.*/,
  `validateOnly` boolean NOT NULL /*If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account*/
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ads_credits_discounts_get_200_response` generated from model 'adsCreditsDiscountsGet200Response'
--

CREATE TABLE IF NOT EXISTS `ads_credits_discounts_get_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdsCreditsDiscountsGet200ResponseAdsCreditDiscountsResponse` generated from model 'AdsCreditsDiscountsGet200ResponseAdsCreditDiscountsResponse'

CREATE TABLE IF NOT EXISTS `AdsCreditsDiscountsGet200ResponseAdsCreditDiscountsResponse` (
  `adsCreditsDiscountsGet200Response` long NOT NULL
  `adsCreditDiscountsResponse` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ads_list_200_response` generated from model 'adsList200Response'
--

CREATE TABLE IF NOT EXISTS `ads_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdsList200ResponseAd` generated from model 'AdsList200ResponseAd'

CREATE TABLE IF NOT EXISTS `AdsList200ResponseAd` (
  `adsList200Response` long NOT NULL
  `ad` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdvancedAuctionBidOptions` generated from model 'advancedAuctionBidOptions'
-- Object describing a retail catalog item&#39;s bid options (bid price and bid multipliers).
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionBidOptions` (
  `app_type_multipliers` long,
  `bid_in_micro_currency` long /*Bid price in micro currency. A value of 0 will stop distribution for this item in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. A value of &#x60;null&#x60; will fallback to the ad group&#39;s &#x60;bid_in_micro_currency&#x60;.*/,
  `placement_multipliers` long
);  /*Object describing a retail catalog item&#39;s bid options (bid price and bid multipliers).*/


-- --------------------------------------------------------------------------
-- Table structure for table `AdvancedAuctionItem` generated from model 'advancedAuctionItem'
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItem` (
  `bid_options` long NOT NULL,
  `country` long NOT NULL,
  `item_id` text NOT NULL /*The catalog retail item id in the merchant namespace*/,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdvancedAuctionItems` generated from model 'advancedAuctionItems'
-- Response object containing item bid options
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItems` (
  `catalog_id` text /*Response object of item bid options*/,
);  /*Response object containing item bid options*/

-- --------------------------------------------------------------------------
-- Table structure for table `AdvancedAuctionItemsAdvancedAuctionItem` generated from model 'AdvancedAuctionItemsAdvancedAuctionItem'

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsAdvancedAuctionItem` (
  `advancedAuctionItems` long NOT NULL
  `advancedAuctionItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdvancedAuctionItemsGetRequest` generated from model 'advancedAuctionItemsGetRequest'
-- Request object used to get bid options values for a batch of retail catalog items
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsGetRequest` (
  `catalog_id` text NOT NULL /*Catalog id pertaining to the retail item*/,
);  /*Request object used to get bid options values for a batch of retail catalog items*/

-- --------------------------------------------------------------------------
-- Table structure for table `AdvancedAuctionItemsGetRequestAdvancedAuctionKey` generated from model 'AdvancedAuctionItemsGetRequestAdvancedAuctionKey'

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsGetRequestAdvancedAuctionKey` (
  `advancedAuctionItemsGetRequest` long NOT NULL
  `advancedAuctionKey` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdvancedAuctionItemsSubmitDeleteRecord` generated from model 'advancedAuctionItemsSubmitDeleteRecord'
-- Object describing an item bid option deletion operation
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsSubmitDeleteRecord` (
  `country` long NOT NULL,
  `item_id` text NOT NULL /*The catalog retail item id in the merchant namespace*/,
  `language` long NOT NULL,
  `operation` text NOT NULL,
);  /*Object describing an item bid option deletion operation*/

-- --------------------------------------------------------------------------
-- Table structure for table `AdvancedAuctionItemsSubmitDeleteRecordAdvancedAuctionOperationError` generated from model 'AdvancedAuctionItemsSubmitDeleteRecordAdvancedAuctionOperationError'

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsSubmitDeleteRecordAdvancedAuctionOperationError` (
  `advancedAuctionItemsSubmitDeleteRecord` long NOT NULL
  `advancedAuctionOperationError` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdvancedAuctionItemsSubmitRecord` generated from model 'advancedAuctionItemsSubmitRecord'
-- Object describing an item bid option operation
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsSubmitRecord` (
  `bid_options` long NOT NULL,
  `country` long NOT NULL,
  `item_id` text NOT NULL /*The catalog retail item id in the merchant namespace*/,
  `language` long NOT NULL,
  `operation` text NOT NULL,
);  /*Object describing an item bid option operation*/

-- --------------------------------------------------------------------------
-- Table structure for table `AdvancedAuctionItemsSubmitRecordUpdateMaskBidOptionField` generated from model 'AdvancedAuctionItemsSubmitRecordUpdateMaskBidOptionField'

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsSubmitRecordUpdateMaskBidOptionField` (
  `advancedAuctionItemsSubmitRecord` long NOT NULL
  `updateMaskBidOptionField` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdvancedAuctionItemsSubmitRecordAdvancedAuctionOperationError` generated from model 'AdvancedAuctionItemsSubmitRecordAdvancedAuctionOperationError'

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsSubmitRecordAdvancedAuctionOperationError` (
  `advancedAuctionItemsSubmitRecord` long NOT NULL
  `advancedAuctionOperationError` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdvancedAuctionItemsSubmitRequest` generated from model 'advancedAuctionItemsSubmitRequest'
-- Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsSubmitRequest` (
  `catalog_id` text NOT NULL /*Catalog id pertaining to all items*/,
);  /*Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items*/

-- --------------------------------------------------------------------------
-- Table structure for table `AdvancedAuctionItemsSubmitRequestAdvancedAuctionItemsSubmitRecord` generated from model 'AdvancedAuctionItemsSubmitRequestAdvancedAuctionItemsSubmitRecord'

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsSubmitRequestAdvancedAuctionItemsSubmitRecord` (
  `advancedAuctionItemsSubmitRequest` long NOT NULL
  `advancedAuctionItemsSubmitRecord` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdvancedAuctionItemsSubmitUpsertRecord` generated from model 'advancedAuctionItemsSubmitUpsertRecord'
-- Object describing an item bid option upsert operation
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsSubmitUpsertRecord` (
  `bid_options` long NOT NULL,
  `country` long NOT NULL,
  `item_id` text NOT NULL /*The catalog retail item id in the merchant namespace*/,
  `language` long NOT NULL,
  `operation` text NOT NULL,
);  /*Object describing an item bid option upsert operation*/

-- --------------------------------------------------------------------------
-- Table structure for table `AdvancedAuctionItemsSubmitUpsertRecordUpdateMaskBidOptionField` generated from model 'AdvancedAuctionItemsSubmitUpsertRecordUpdateMaskBidOptionField'

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsSubmitUpsertRecordUpdateMaskBidOptionField` (
  `advancedAuctionItemsSubmitUpsertRecord` long NOT NULL
  `updateMaskBidOptionField` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdvancedAuctionItemsSubmitUpsertRecordAdvancedAuctionOperationError` generated from model 'AdvancedAuctionItemsSubmitUpsertRecordAdvancedAuctionOperationError'

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsSubmitUpsertRecordAdvancedAuctionOperationError` (
  `advancedAuctionItemsSubmitUpsertRecord` long NOT NULL
  `advancedAuctionOperationError` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdvancedAuctionKey` generated from model 'advancedAuctionKey'
-- Object uniquely identifying a retail catalog item
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionKey` (
  `country` long NOT NULL,
  `item_id` text NOT NULL /*The catalog retail item id in the merchant namespace*/,
  `language` long NOT NULL
);  /*Object uniquely identifying a retail catalog item*/


-- --------------------------------------------------------------------------
-- Table structure for table `AdvancedAuctionOperationError` generated from model 'advancedAuctionOperationError'
-- Error which occurred when applying a bid options operation to a specific item.
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionOperationError` (
  `code` int /*The error code for the item bid option operation validation error*/,
  `message` text /*Message describing the item bid option operation validation error*/
);  /*Error which occurred when applying a bid options operation to a specific item.*/


-- --------------------------------------------------------------------------
-- Table structure for table `AdvancedAuctionProcessedItems` generated from model 'advancedAuctionProcessedItems'
-- Response object containing the results of an operation on an item bid option
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionProcessedItems` (
  `catalog_id` text /*Catalog id pertaining to all items*/,
);  /*Response object containing the results of an operation on an item bid option*/

-- --------------------------------------------------------------------------
-- Table structure for table `AdvancedAuctionProcessedItemsAdvancedAuctionItemsSubmitRecord` generated from model 'AdvancedAuctionProcessedItemsAdvancedAuctionItemsSubmitRecord'

CREATE TABLE IF NOT EXISTS `AdvancedAuctionProcessedItemsAdvancedAuctionItemsSubmitRecord` (
  `advancedAuctionProcessedItems` long NOT NULL
  `advancedAuctionItemsSubmitRecord` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdvertiserDefinedEvent` generated from model 'advertiserDefinedEvent'
-- Advertiser defined event
--

CREATE TABLE IF NOT EXISTS `AdvertiserDefinedEvent` (
  `mapped_conversion_type` long /*Standard type mapped to ADE for optimization*/,
  `name` text /*Raw string name of the event, usually logged as raw_event_name in our dataset*/
);  /*Advertiser defined event*/


-- --------------------------------------------------------------------------
-- Table structure for table `AdvertiserDefinedEventInput` generated from model 'advertiserDefinedEventInput'
-- Advertiser defined event input for create/update operations
--

CREATE TABLE IF NOT EXISTS `AdvertiserDefinedEventInput` (
  `mapped_conversion_type` long NOT NULL /*Pinterest standard event type to map this custom event to for campaign optimization and reporting*/,
  `name` text NOT NULL /*Raw string name of the event*/
);  /*Advertiser defined event input for create/update operations*/


-- --------------------------------------------------------------------------
-- Table structure for table `AdvertiserDefinedEventProcessingRecord` generated from model 'advertiserDefinedEventProcessingRecord'
-- Processing record for an advertiser defined event operation
--

CREATE TABLE IF NOT EXISTS `AdvertiserDefinedEventProcessingRecord` (
  `name` text NOT NULL /*Name of the advertiser defined event*/,
  `status` text NOT NULL /*Processing status (success or failure)*/,
);  /*Processing record for an advertiser defined event operation*/

-- --------------------------------------------------------------------------
-- Table structure for table `AdvertiserDefinedEventProcessingRecordExceptions` generated from model 'AdvertiserDefinedEventProcessingRecordExceptions'

CREATE TABLE IF NOT EXISTS `AdvertiserDefinedEventProcessingRecordExceptions` (
  `advertiserDefinedEventProcessingRecord` long NOT NULL
  `exceptions` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `advertiser_defined_events_create_200_response` generated from model 'advertiserDefinedEventsCreate200Response'
--

CREATE TABLE IF NOT EXISTS `advertiser_defined_events_create_200_response` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdvertiserDefinedEventsCreate200ResponseAdvertiserDefinedEventProcessingRecord` generated from model 'AdvertiserDefinedEventsCreate200ResponseAdvertiserDefinedEventProcessingRecord'

CREATE TABLE IF NOT EXISTS `AdvertiserDefinedEventsCreate200ResponseAdvertiserDefinedEventProcessingRecord` (
  `advertiserDefinedEventsCreate200Response` long NOT NULL
  `advertiserDefinedEventProcessingRecord` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdvertiserDefinedEventsCreateRequest` generated from model 'advertiserDefinedEventsCreateRequest'
-- Request body for creating or updating advertiser defined events
--

CREATE TABLE IF NOT EXISTS `AdvertiserDefinedEventsCreateRequest` (
);  /*Request body for creating or updating advertiser defined events*/

-- --------------------------------------------------------------------------
-- Table structure for table `AdvertiserDefinedEventsCreateRequestAdvertiserDefinedEventInput` generated from model 'AdvertiserDefinedEventsCreateRequestAdvertiserDefinedEventInput'

CREATE TABLE IF NOT EXISTS `AdvertiserDefinedEventsCreateRequestAdvertiserDefinedEventInput` (
  `advertiserDefinedEventsCreateRequest` long NOT NULL
  `advertiserDefinedEventInput` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `advertiser_defined_events_get_200_response` generated from model 'advertiserDefinedEventsGet200Response'
--

CREATE TABLE IF NOT EXISTS `advertiser_defined_events_get_200_response` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdvertiserDefinedEventsGet200ResponseAdvertiserDefinedEvent` generated from model 'AdvertiserDefinedEventsGet200ResponseAdvertiserDefinedEvent'

CREATE TABLE IF NOT EXISTS `AdvertiserDefinedEventsGet200ResponseAdvertiserDefinedEvent` (
  `advertiserDefinedEventsGet200Response` long NOT NULL
  `advertiserDefinedEvent` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AgeBucketMultipliers` generated from model 'ageBucketMultipliers'
-- This represents a mapping from age bucket to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified age bucket in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
--

CREATE TABLE IF NOT EXISTS `AgeBucketMultipliers` (
  `AGE_BUCKET` long /*Age bucket identifier.*/
);  /*This represents a mapping from age bucket to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified age bucket in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).*/


-- --------------------------------------------------------------------------
-- Table structure for table `AggregatedPinComment` generated from model 'aggregatedPinComment'
--

CREATE TABLE IF NOT EXISTS `AggregatedPinComment` (
  `id` text NOT NULL PRIMARY KEY,
  `ai_disclosures` long /*AI disclosure declarations the creator has made about this Pin.*/,
  `alt_text` text,
  `board_id` text /*The board to which this Pin belongs.*/,
  `board_owner` long,
  `board_section_id` text /*The board section to which this Pin belongs.*/,
  `created_at` datetime,
  `creative_type` long,
  `description` text,
  `dominant_color` text /*Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;.*/,
  `has_been_promoted` boolean /*Whether the Pin has been promoted or not.*/,
  `is_owner` boolean /*Whether the \&quot;operation user_account\&quot; is the Pin owner.*/,
  `is_product` boolean /*Whether the Pin is a product Pin.*/,
  `is_standard` boolean /*Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.*/,
  `link` text,
  `media` long,
  `parent_pin_id` text /*The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).*/,
  `pin_metrics` blob /*Pin metrics with associated time intervals if any.*/,
  `title` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AiDisclosures` generated from model 'aiDisclosures'
-- AI disclosure declarations the creator has made about the Pin.
--

CREATE TABLE IF NOT EXISTS `AiDisclosures` (
);  /*AI disclosure declarations the creator has made about the Pin.*/

-- --------------------------------------------------------------------------
-- Table structure for table `AiDisclosuresAiDisclosureItem` generated from model 'AiDisclosuresAiDisclosureItem'

CREATE TABLE IF NOT EXISTS `AiDisclosuresAiDisclosureItem` (
  `aiDisclosures` long NOT NULL
  `aiDisclosureItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AiDisclosuresUpdate` generated from model 'aiDisclosuresUpdate'
-- AI disclosure declarations the creator has made about the Pin.
--

CREATE TABLE IF NOT EXISTS `AiDisclosuresUpdate` (
);  /*AI disclosure declarations the creator has made about the Pin.*/

-- --------------------------------------------------------------------------
-- Table structure for table `AiDisclosuresUpdateAiDisclosureItem` generated from model 'AiDisclosuresUpdateAiDisclosureItem'

CREATE TABLE IF NOT EXISTS `AiDisclosuresUpdateAiDisclosureItem` (
  `aiDisclosuresUpdate` long NOT NULL
  `aiDisclosureItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AmazonConnectRequest` generated from model 'amazonConnectRequest'
-- Request containing OTP and Amazon storefront info called by Amazon
--

CREATE TABLE IF NOT EXISTS `AmazonConnectRequest` (
  `amazon_storefront_name` text NOT NULL /*The Amazon storefront name*/,
  `amazon_storefront_url` text NOT NULL /*The Amazon storefront url*/,
  `is_amazon_account_linked` boolean NOT NULL /*The Amazon account linking status*/,
  `amazon_storefront_id` text /*The Amazon storefront id*/,
  `amazon_user_id` text /*The Amazon user id*/,
  `one_time_passcode` text /*The one time passcode for Pinterest-initiated linking requests*/,
  `pinterest_user_id` text /*The Pinterest user id for Amazon-initiated linking requests*/
);  /*Request containing OTP and Amazon storefront info called by Amazon*/


-- --------------------------------------------------------------------------
-- Table structure for table `AmazonConnectResponse` generated from model 'amazonConnectResponse'
--

CREATE TABLE IF NOT EXISTS `AmazonConnectResponse` (
  `message` text /*Amazon connect response message*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AnalyticsDailyMetrics` generated from model 'analyticsDailyMetrics'
--

CREATE TABLE IF NOT EXISTS `AnalyticsDailyMetrics` (
  `data_status` long,
  `date` text /*Metrics date (UTC): YYYY-MM-DD.*/,
  `metrics` blob
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AnalyticsMetricsResponse` generated from model 'analyticsMetricsResponse'
--

CREATE TABLE IF NOT EXISTS `AnalyticsMetricsResponse` (
  `summary_metrics` blob /*The metric name and value over the requested period for each requested metric*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AnalyticsMetricsResponseAnalyticsDailyMetrics` generated from model 'AnalyticsMetricsResponseAnalyticsDailyMetrics'

CREATE TABLE IF NOT EXISTS `AnalyticsMetricsResponseAnalyticsDailyMetrics` (
  `analyticsMetricsResponse` long NOT NULL
  `analyticsDailyMetrics` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AppTypeMultipliers` generated from model 'appTypeMultipliers'
-- This represents a mapping from app type targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified app type in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
--

CREATE TABLE IF NOT EXISTS `AppTypeMultipliers` (
  `APP_TYPE` long /*App type identifier.*/
);  /*This represents a mapping from app type targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified app type in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).*/


-- --------------------------------------------------------------------------
-- Table structure for table `AppsflyerAudience` generated from model 'appsflyerAudience'
-- Request model for creating an AppsFlyer audience
--

CREATE TABLE IF NOT EXISTS `AppsflyerAudience` (
  `container_id` text NOT NULL /*The ID of the audience container*/,
  `name` text NOT NULL /*The name of the audience*/,
  `platform` long NOT NULL /*The platform of the audience*/
);  /*Request model for creating an AppsFlyer audience*/


-- --------------------------------------------------------------------------
-- Table structure for table `AppsflyerAudienceCreate` generated from model 'appsflyerAudienceCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `AppsflyerAudienceCreate` (
  `name` text NOT NULL /*The name of the audience*/,
  `platform` long NOT NULL /*The platform of the audience*/
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `AppsflyerAudienceSyncCreate` generated from model 'appsflyerAudienceSyncCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `AppsflyerAudienceSyncCreate` (
  `container_id` text NOT NULL /*The container ID of the audience*/,
  `url_adid_sha256` text /*The pre-signed URL for SHA256 hashed GAID/IDFA file*/,
  `url_email_sha256` text /*The pre-signed URL for SHA256 hashed email file*/
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `AssetAccessRequestError` generated from model 'assetAccessRequestError'
--

CREATE TABLE IF NOT EXISTS `AssetAccessRequestError` (
  `code` int /*Error code associated with the error in requesting asset access.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AssetAccessRequestErrorMessages` generated from model 'AssetAccessRequestErrorMessages'

CREATE TABLE IF NOT EXISTS `AssetAccessRequestErrorMessages` (
  `assetAccessRequestError` long NOT NULL
  `messages` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupBinding` generated from model 'assetGroupBinding'
--

CREATE TABLE IF NOT EXISTS `AssetGroupBinding` (
  `asset_group_description` text NOT NULL /*Asset group description*/,
  `asset_group_name` text NOT NULL /*Asset Group name*/,
  `created_by` long NOT NULL /*The data of the user that created the asset group.*/,
  `created_time` int NOT NULL /*The creation time of the asset group*/,
  `id` text NOT NULL PRIMARY KEY /*Asset Group ID.*/,
  `owner` long NOT NULL /*The data of the business that owns the asset group.*/,
  `updated_time` int NOT NULL /*The last update time of the asset group*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupBindingAdAccountsIds` generated from model 'AssetGroupBindingAdAccountsIds'

CREATE TABLE IF NOT EXISTS `AssetGroupBindingAdAccountsIds` (
  `assetGroupBinding` long NOT NULL
  `adAccountsIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupBindingAssetGroupTypes` generated from model 'AssetGroupBindingAssetGroupTypes'

CREATE TABLE IF NOT EXISTS `AssetGroupBindingAssetGroupTypes` (
  `assetGroupBinding` long NOT NULL
  `assetGroupTypes` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupBindingCatalogsIds` generated from model 'AssetGroupBindingCatalogsIds'

CREATE TABLE IF NOT EXISTS `AssetGroupBindingCatalogsIds` (
  `assetGroupBinding` long NOT NULL
  `catalogsIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupBindingProfilesIds` generated from model 'AssetGroupBindingProfilesIds'

CREATE TABLE IF NOT EXISTS `AssetGroupBindingProfilesIds` (
  `assetGroupBinding` long NOT NULL
  `profilesIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupDeleteError` generated from model 'assetGroupDeleteError'
--

CREATE TABLE IF NOT EXISTS `AssetGroupDeleteError` (
  `asset_group_id` text /*Asset group id of the exception.*/,
  `code` int /*Error code associated with the error deleting asset group.*/,
  `message` text /*Error message associated with the error deleting asset group.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupDeletion` generated from model 'assetGroupDeletion'
--

CREATE TABLE IF NOT EXISTS `AssetGroupDeletion` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupDeletionDeletedAssetGroups` generated from model 'AssetGroupDeletionDeletedAssetGroups'

CREATE TABLE IF NOT EXISTS `AssetGroupDeletionDeletedAssetGroups` (
  `assetGroupDeletion` long NOT NULL
  `deletedAssetGroups` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupDeletionAssetGroupDeleteError` generated from model 'AssetGroupDeletionAssetGroupDeleteError'

CREATE TABLE IF NOT EXISTS `AssetGroupDeletionAssetGroupDeleteError` (
  `assetGroupDeletion` long NOT NULL
  `assetGroupDeleteError` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupDeletionDelete` generated from model 'assetGroupDeletionDelete'
--

CREATE TABLE IF NOT EXISTS `AssetGroupDeletionDelete` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupDeletionDeleteAssetGroupsToDelete` generated from model 'AssetGroupDeletionDeleteAssetGroupsToDelete'

CREATE TABLE IF NOT EXISTS `AssetGroupDeletionDeleteAssetGroupsToDelete` (
  `assetGroupDeletionDelete` long NOT NULL
  `assetGroupsToDelete` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupInput` generated from model 'assetGroupInput'
--

CREATE TABLE IF NOT EXISTS `AssetGroupInput` (
  `asset_group` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupInputCreate` generated from model 'assetGroupInputCreate'
--

CREATE TABLE IF NOT EXISTS `AssetGroupInputCreate` (
  `asset_group_description` text NOT NULL /*Asset group description.*/,
  `asset_group_name` text NOT NULL /*Asset Group name.*/,
  `asset_group` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupInputCreateAssetGroupType` generated from model 'AssetGroupInputCreateAssetGroupType'

CREATE TABLE IF NOT EXISTS `AssetGroupInputCreateAssetGroupType` (
  `assetGroupInputCreate` long NOT NULL
  `assetGroupType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupModification` generated from model 'assetGroupModification'
--

CREATE TABLE IF NOT EXISTS `AssetGroupModification` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupModificationAssetGroupUpdateError` generated from model 'AssetGroupModificationAssetGroupUpdateError'

CREATE TABLE IF NOT EXISTS `AssetGroupModificationAssetGroupUpdateError` (
  `assetGroupModification` long NOT NULL
  `assetGroupUpdateError` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupModificationAssetGroupBinding` generated from model 'AssetGroupModificationAssetGroupBinding'

CREATE TABLE IF NOT EXISTS `AssetGroupModificationAssetGroupBinding` (
  `assetGroupModification` long NOT NULL
  `assetGroupBinding` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupModificationReadOrUpdate` generated from model 'assetGroupModificationReadOrUpdate'
--

CREATE TABLE IF NOT EXISTS `AssetGroupModificationReadOrUpdate` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupModificationReadOrUpdateAssetGroupUpdateItemReadOrUpdateItem` generated from model 'AssetGroupModificationReadOrUpdateAssetGroupUpdateItemReadOrUpdateItem'

CREATE TABLE IF NOT EXISTS `AssetGroupModificationReadOrUpdateAssetGroupUpdateItemReadOrUpdateItem` (
  `assetGroupModificationReadOrUpdate` long NOT NULL
  `assetGroupUpdateItemReadOrUpdateItem` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupModificationReadOrUpdateAssetGroupUpdateError` generated from model 'AssetGroupModificationReadOrUpdateAssetGroupUpdateError'

CREATE TABLE IF NOT EXISTS `AssetGroupModificationReadOrUpdateAssetGroupUpdateError` (
  `assetGroupModificationReadOrUpdate` long NOT NULL
  `assetGroupUpdateError` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupModificationReadOrUpdateAssetGroupBinding` generated from model 'AssetGroupModificationReadOrUpdateAssetGroupBinding'

CREATE TABLE IF NOT EXISTS `AssetGroupModificationReadOrUpdateAssetGroupBinding` (
  `assetGroupModificationReadOrUpdate` long NOT NULL
  `assetGroupBinding` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupUpdateError` generated from model 'assetGroupUpdateError'
--

CREATE TABLE IF NOT EXISTS `AssetGroupUpdateError` (
  `asset_group_id` text,
  `code` int,
  `message` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupUpdateItemReadOrUpdateItem` generated from model 'assetGroupUpdateItemReadOrUpdateItem'
--

CREATE TABLE IF NOT EXISTS `AssetGroupUpdateItemReadOrUpdateItem` (
  `asset_group_id` text NOT NULL /*Unique identifier of the asset group to update.*/,
  `description` text /*Asset group description.*/,
  `name` text /*Asset Group name.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupUpdateItemReadOrUpdateItemAssetGroupType` generated from model 'AssetGroupUpdateItemReadOrUpdateItemAssetGroupType'

CREATE TABLE IF NOT EXISTS `AssetGroupUpdateItemReadOrUpdateItemAssetGroupType` (
  `assetGroupUpdateItemReadOrUpdateItem` long NOT NULL
  `assetGroupType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupUpdateItemReadOrUpdateItemAssetsToAdd` generated from model 'AssetGroupUpdateItemReadOrUpdateItemAssetsToAdd'

CREATE TABLE IF NOT EXISTS `AssetGroupUpdateItemReadOrUpdateItemAssetsToAdd` (
  `assetGroupUpdateItemReadOrUpdateItem` long NOT NULL
  `assetsToAdd` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupUpdateItemReadOrUpdateItemAssetsToRemove` generated from model 'AssetGroupUpdateItemReadOrUpdateItemAssetsToRemove'

CREATE TABLE IF NOT EXISTS `AssetGroupUpdateItemReadOrUpdateItemAssetsToRemove` (
  `assetGroupUpdateItemReadOrUpdateItem` long NOT NULL
  `assetsToRemove` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AssetIdPermissions` generated from model 'assetIdPermissions'
-- An object containing the permissions a business member has on the asset.
--

CREATE TABLE IF NOT EXISTS `AssetIdPermissions` (
  `asset_id` text NOT NULL /*Unique identifier of a business asset.*/,
  `asset_type` long NOT NULL,
  `asset_group_info` long /*An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;.*/
);  /*An object containing the permissions a business member has on the asset.*/

-- --------------------------------------------------------------------------
-- Table structure for table `AssetIdPermissionsPermissions` generated from model 'AssetIdPermissionsPermissions'

CREATE TABLE IF NOT EXISTS `AssetIdPermissionsPermissions` (
  `assetIdPermissions` long NOT NULL
  `permissions` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AssetIdWithPermissions` generated from model 'assetIdWithPermissions'
-- Asset ID with permission levels.
--

CREATE TABLE IF NOT EXISTS `AssetIdWithPermissions` (
  `id` text PRIMARY KEY /*Unique identifier of a business asset.*/,
);  /*Asset ID with permission levels.*/

-- --------------------------------------------------------------------------
-- Table structure for table `AssetIdWithPermissionsPermissions` generated from model 'AssetIdWithPermissionsPermissions'

CREATE TABLE IF NOT EXISTS `AssetIdWithPermissionsPermissions` (
  `assetIdWithPermissions` long NOT NULL
  `permissions` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AttributionWindows` generated from model 'attributionWindows'
--

CREATE TABLE IF NOT EXISTS `AttributionWindows` (
  `click_window_days` int,
  `engagement_window_days` int,
  `view_window_days` int
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Audience` generated from model 'audience'
--

CREATE TABLE IF NOT EXISTS `Audience` (
  `ad_account_id` text /*Ad account ID.*/,
  `audience_type` long /*[Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR*/,
  `created_by_company_name` text /*The company that created this audience.*/,
  `created_timestamp` int /*Creation time. Unix timestamp in seconds.*/,
  `description` text /*Audience description.*/,
  `id` text PRIMARY KEY /*Audience ID.*/,
  `is_nca` boolean /*Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.*/,
  `name` text /*Audience name.*/,
  `rule` long,
  `size` int /*Audience size.*/,
  `status` long /*Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.*/,
  `type` text /*Always \&quot;audience\&quot;.*/,
  `updated_timestamp` int /*Last update time. Unix timestamp in seconds.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AudienceCategory` generated from model 'audienceCategory'
--

CREATE TABLE IF NOT EXISTS `AudienceCategory` (
  `id` text PRIMARY KEY /*Interest ID.*/,
  `index` decimal /*Interest affinity index.*/,
  `key` text /*Interest unique key (same as ID).*/,
  `name` text /*Interest name.*/,
  `ratio` decimal /*Interest&#39;s percent of category&#39;s total audience.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AudienceCategoryAudienceSubcategory` generated from model 'AudienceCategoryAudienceSubcategory'

CREATE TABLE IF NOT EXISTS `AudienceCategoryAudienceSubcategory` (
  `audienceCategory` long NOT NULL
  `audienceSubcategory` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AudienceDefinition` generated from model 'audienceDefinition'
-- Queryable audience representation.
--

CREATE TABLE IF NOT EXISTS `AudienceDefinition` (
  `date` text /*Generation date*/,
  `scope` text,
  `type` text
);  /*Queryable audience representation.*/


-- --------------------------------------------------------------------------
-- Table structure for table `AudienceDemographicValue` generated from model 'audienceDemographicValue'
-- Demographic detail for a single audience demographic
--

CREATE TABLE IF NOT EXISTS `AudienceDemographicValue` (
  `key` text /*Unique key for demographic item*/,
  `name` text /*Display name for demographic*/,
  `ratio` decimal /*Value of demographic item as a percent of total audience*/
);  /*Demographic detail for a single audience demographic*/


-- --------------------------------------------------------------------------
-- Table structure for table `AudienceDemographics` generated from model 'audienceDemographics'
-- Audience demographics
--

CREATE TABLE IF NOT EXISTS `AudienceDemographics` (
);  /*Audience demographics*/

-- --------------------------------------------------------------------------
-- Table structure for table `AudienceDemographicsAudienceDemographicValue` generated from model 'AudienceDemographicsAudienceDemographicValue'

CREATE TABLE IF NOT EXISTS `AudienceDemographicsAudienceDemographicValue` (
  `audienceDemographics` long NOT NULL
  `audienceDemographicValue` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AudienceDemographicsAudienceDemographicValue` generated from model 'AudienceDemographicsAudienceDemographicValue'

CREATE TABLE IF NOT EXISTS `AudienceDemographicsAudienceDemographicValue` (
  `audienceDemographics` long NOT NULL
  `audienceDemographicValue` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AudienceDemographicsAudienceDemographicValue` generated from model 'AudienceDemographicsAudienceDemographicValue'

CREATE TABLE IF NOT EXISTS `AudienceDemographicsAudienceDemographicValue` (
  `audienceDemographics` long NOT NULL
  `audienceDemographicValue` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AudienceDemographicsAudienceDemographicValue` generated from model 'AudienceDemographicsAudienceDemographicValue'

CREATE TABLE IF NOT EXISTS `AudienceDemographicsAudienceDemographicValue` (
  `audienceDemographics` long NOT NULL
  `audienceDemographicValue` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AudienceDemographicsAudienceDemographicValue` generated from model 'AudienceDemographicsAudienceDemographicValue'

CREATE TABLE IF NOT EXISTS `AudienceDemographicsAudienceDemographicValue` (
  `audienceDemographics` long NOT NULL
  `audienceDemographicValue` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AudienceInsights` generated from model 'audienceInsights'
-- Audience interests and demographics.
--

CREATE TABLE IF NOT EXISTS `AudienceInsights` (
  `date` text /*Generation date*/,
  `demographics` long,
  `size` int /*Population count.*/,
  `size_is_upper_bound` boolean /*Indicates whether the audience size has been rounded up to the next highest upper boundary.*/,
  `type` long
);  /*Audience interests and demographics.*/

-- --------------------------------------------------------------------------
-- Table structure for table `AudienceInsightsAudienceCategory` generated from model 'AudienceInsightsAudienceCategory'

CREATE TABLE IF NOT EXISTS `AudienceInsightsAudienceCategory` (
  `audienceInsights` long NOT NULL
  `audienceCategory` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `audience_insights_scope_and_type_get_200_response` generated from model 'audienceInsightsScopeAndTypeGet200Response'
--

CREATE TABLE IF NOT EXISTS `audience_insights_scope_and_type_get_200_response` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AudienceInsightsScopeAndTypeGet200ResponseAudienceDefinition` generated from model 'AudienceInsightsScopeAndTypeGet200ResponseAudienceDefinition'

CREATE TABLE IF NOT EXISTS `AudienceInsightsScopeAndTypeGet200ResponseAudienceDefinition` (
  `audienceInsightsScopeAndTypeGet200Response` long NOT NULL
  `audienceDefinition` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AudienceRule` generated from model 'audienceRule'
-- JSON object defining targeted audience users. Example rule formats per audience type:  CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}  ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; } (Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10. The targeted audience should be this % size across Pinterest.)  VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}} (Retention days should be 1-540. Retention applies to specific customers.)  ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.example.com\&quot;], \&quot;engager_type\&quot;: 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).
--

CREATE TABLE IF NOT EXISTS `AudienceRule` (
  `ad_account_id` text /*Ad account ID.*/,
  `country` text /*Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;.*/,
  `customer_list_id` text /*Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;.*/,
  `engagement_type` text /*Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set.*/,
  `engager_type` int /*Optional for ENGAGEMENT. Engager type value should be 1-2.*/,
  `event` text /*A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event.*/,
  `event_data` long,
  `event_source` blob /*Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline*/,
  `ingestion_source` blob /*Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api*/,
  `percentage` int /*Percentage should be 1-10. The targeted audience should be this % size across Pinterest.*/,
  `prefill` boolean /*Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;.*/,
  `retention_days` int /*Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified.*/,
  `visitor_source_id` text /*The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;.*/
);  /*JSON object defining targeted audience users. Example rule formats per audience type:  CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}  ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; } (Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10. The targeted audience should be this % size across Pinterest.)  VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}} (Retention days should be 1-540. Retention applies to specific customers.)  ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.example.com\&quot;], \&quot;engager_type\&quot;: 1} Learn more about [engagement audiences](/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience).*/

-- --------------------------------------------------------------------------
-- Table structure for table `AudienceRuleAdId` generated from model 'AudienceRuleAdId'

CREATE TABLE IF NOT EXISTS `AudienceRuleAdId` (
  `audienceRule` long NOT NULL
  `adId` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AudienceRuleCampaignId` generated from model 'AudienceRuleCampaignId'

CREATE TABLE IF NOT EXISTS `AudienceRuleCampaignId` (
  `audienceRule` long NOT NULL
  `campaignId` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AudienceRuleEngagementDomain` generated from model 'AudienceRuleEngagementDomain'

CREATE TABLE IF NOT EXISTS `AudienceRuleEngagementDomain` (
  `audienceRule` long NOT NULL
  `engagementDomain` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AudienceRuleObjectiveType` generated from model 'AudienceRuleObjectiveType'

CREATE TABLE IF NOT EXISTS `AudienceRuleObjectiveType` (
  `audienceRule` long NOT NULL
  `objectiveType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AudienceRulePinId` generated from model 'AudienceRulePinId'

CREATE TABLE IF NOT EXISTS `AudienceRulePinId` (
  `audienceRule` long NOT NULL
  `pinId` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AudienceRuleSeedId` generated from model 'AudienceRuleSeedId'

CREATE TABLE IF NOT EXISTS `AudienceRuleSeedId` (
  `audienceRule` long NOT NULL
  `seedId` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AudienceRuleUrl` generated from model 'AudienceRuleUrl'

CREATE TABLE IF NOT EXISTS `AudienceRuleUrl` (
  `audienceRule` long NOT NULL
  `url` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AudienceSubcategory` generated from model 'audienceSubcategory'
--

CREATE TABLE IF NOT EXISTS `AudienceSubcategory` (
  `id` text PRIMARY KEY,
  `index` decimal,
  `key` text,
  `name` text,
  `ratio` decimal
); 


-- --------------------------------------------------------------------------
-- Table structure for table `audiences_list_200_response` generated from model 'audiencesList200Response'
--

CREATE TABLE IF NOT EXISTS `audiences_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AudiencesList200ResponseAdAccountsAudience` generated from model 'AudiencesList200ResponseAdAccountsAudience'

CREATE TABLE IF NOT EXISTS `AudiencesList200ResponseAdAccountsAudience` (
  `audiencesList200Response` long NOT NULL
  `adAccountsAudience` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AuthRespondInviteAction` generated from model 'authRespondInviteAction'
--

CREATE TABLE IF NOT EXISTS `AuthRespondInviteAction` (
  `accept_invite` boolean NOT NULL /*Whether the invite/request is accepted.*/,
  `asset_id_to_permissions` blob /*An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AuthRespondInvitesBody` generated from model 'authRespondInvitesBody'
-- An object with a list of all the invites the user would like to respond to and the action to take.
--

CREATE TABLE IF NOT EXISTS `AuthRespondInvitesBody` (
);  /*An object with a list of all the invites the user would like to respond to and the action to take.*/

-- --------------------------------------------------------------------------
-- Table structure for table `AuthRespondInvitesBodyAuthRespondInvitesBodyItem` generated from model 'AuthRespondInvitesBodyAuthRespondInvitesBodyItem'

CREATE TABLE IF NOT EXISTS `AuthRespondInvitesBodyAuthRespondInvitesBodyItem` (
  `authRespondInvitesBody` long NOT NULL
  `authRespondInvitesBodyItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AuthRespondInvitesBodyItem` generated from model 'authRespondInvitesBodyItem'
--

CREATE TABLE IF NOT EXISTS `AuthRespondInvitesBodyItem` (
  `action` long NOT NULL,
  `invite_id` text NOT NULL /*Unique identifier of an invite.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AvailabilityFilter` generated from model 'availabilityFilter'
--

CREATE TABLE IF NOT EXISTS `AvailabilityFilter` (
  `AVAILABILITY` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BaseBusinessAssets` generated from model 'baseBusinessAssets'
-- An object containing the permissions a business has on the asset.
--

CREATE TABLE IF NOT EXISTS `BaseBusinessAssets` (
  `asset_group_info` long /*An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;.*/,
  `asset_id` text /*Unique identifier of a business asset.*/,
  `asset_type` long,
);  /*An object containing the permissions a business has on the asset.*/

-- --------------------------------------------------------------------------
-- Table structure for table `BaseBusinessAssetsPermissions` generated from model 'BaseBusinessAssetsPermissions'

CREATE TABLE IF NOT EXISTS `BaseBusinessAssetsPermissions` (
  `baseBusinessAssets` long NOT NULL
  `permissions` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BaseInviteDataResponse` generated from model 'baseInviteDataResponse'
-- Common invite/request data returned by the business access endpoints.
--

CREATE TABLE IF NOT EXISTS `BaseInviteDataResponse` (
  `id` text PRIMARY KEY /*Unique identifier of the invite/request.*/,
  `invite_data` long,
  `is_received_invite` boolean /*Indicates whether the invite/request was received.*/,
  `user` long /*Metadata for the member/partner that was sent the invite/request.*/
);  /*Common invite/request data returned by the business access endpoints.*/


-- --------------------------------------------------------------------------
-- Table structure for table `BidFloor` generated from model 'bidFloor'
-- Bid floor request and response model.
--

CREATE TABLE IF NOT EXISTS `BidFloor` (
  `type` text /*Always the string &#39;bidfloor&#39;.*/
);  /*Bid floor request and response model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `BidFloorBidFloors` generated from model 'BidFloorBidFloors'

CREATE TABLE IF NOT EXISTS `BidFloorBidFloors` (
  `bidFloor` long NOT NULL
  `bidFloors` int NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BidFloorCreate` generated from model 'bidFloorCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `BidFloorCreate` (
  `targeting_spec` long /*Ad group targeting specification defining the ad group target audience.*/
);  /*Resource create operation model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `BidFloorCreateBidFloorSpec` generated from model 'BidFloorCreateBidFloorSpec'

CREATE TABLE IF NOT EXISTS `BidFloorCreateBidFloorSpec` (
  `bidFloorCreate` long NOT NULL
  `bidFloorSpec` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BidFloorSpec` generated from model 'bidFloorSpec'
-- Bid floor specification for a given campaign configuration.
--

CREATE TABLE IF NOT EXISTS `BidFloorSpec` (
  `billable_event` long NOT NULL /*Ad group billable event type.*/,
  `currency` long NOT NULL /*Currency for the bid floor value.*/,
  `creative_type` long /*Creative type for the bid floor request.*/,
  `objective_type` long /*Campaign objective type.*/,
  `optimization_goal_metadata` long /*Optimization goal metadata.*/
);  /*Bid floor specification for a given campaign configuration.*/

-- --------------------------------------------------------------------------
-- Table structure for table `BidFloorSpecCountry` generated from model 'BidFloorSpecCountry'

CREATE TABLE IF NOT EXISTS `BidFloorSpecCountry` (
  `bidFloorSpec` long NOT NULL
  `country` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BidOptionsAgeBucketMultipliers` generated from model 'bidOptionsAgeBucketMultipliers'
-- This represents a mapping from age bucket to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `BidOptionsAgeBucketMultipliers` (
  `_1824` decimal,
  `_2534` decimal,
  `_3544` decimal,
  `_4549` decimal,
  `_5054` decimal,
  `_5564` decimal,
  `_65` decimal
);  /*This represents a mapping from age bucket to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.*/


-- --------------------------------------------------------------------------
-- Table structure for table `BidOptionsAppTypeMultipliers` generated from model 'bidOptionsAppTypeMultipliers'
-- This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `BidOptionsAppTypeMultipliers` (
  `android_mobile` decimal,
  `android_tablet` decimal,
  `ipad` decimal,
  `iphone` decimal,
  `web` decimal,
  `web_mobile` decimal
);  /*This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.*/


-- --------------------------------------------------------------------------
-- Table structure for table `BidOptionsAudienceMultipliers` generated from model 'bidOptionsAudienceMultipliers'
-- This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `BidOptionsAudienceMultipliers` (
  `audience_id` text NOT NULL,
  `multiplier` decimal NOT NULL
);  /*This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.*/


-- --------------------------------------------------------------------------
-- Table structure for table `BidOptionsGenderMultipliers` generated from model 'bidOptionsGenderMultipliers'
-- This represents a mapping from gender targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment.  All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `BidOptionsGenderMultipliers` (
  `female` decimal,
  `male` decimal
);  /*This represents a mapping from gender targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment.  All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.*/


-- --------------------------------------------------------------------------
-- Table structure for table `BidOptionsPlacementMultipliers` generated from model 'bidOptionsPlacementMultipliers'
-- This represents a mapping from placement to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `BidOptionsPlacementMultipliers` (
  `browse` decimal,
  `related_pins` decimal,
  `search` decimal
);  /*This represents a mapping from placement to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.*/


-- --------------------------------------------------------------------------
-- Table structure for table `BillingInvoice` generated from model 'billingInvoice'
-- A billing invoice in the advertiser account.
--

CREATE TABLE IF NOT EXISTS `BillingInvoice` (
  `ad_account_id` text /*The ID of the ad account this invoice belongs to*/,
  `ad_account_name` text /*The name of the ad account this invoice belongs to*/,
  `amount_billed_micro_currency` int /*The amount billed in this invoice. Denoted in micro currency*/,
  `amount_discount_micro_currency` int /*The discount in this invoice. Denoted in micro currency*/,
  `amount_net_micro_currency` int /*The net amount in this invoice. Denoted in micro currency*/,
  `amount_tax_micro_currency` int /*The tax in this invoice. Denoted in micro currency*/,
  `bill_to_country` text /*The country of the bill to address*/,
  `billing_period_end_date` date /*The end date of the billing period. Format: YYYY-MM-DD*/,
  `billing_period_start_date` date /*The start date of the billing period. Format: YYYY-MM-DD*/,
  `currency` long,
  `document_type` long /*The type of the document*/,
  `id` text PRIMARY KEY /*Unique identifier for the billing invoice*/,
  `invoice_due_date` date /*The date the invoice is due. Format: YYYY-MM-DD*/,
  `payment_terms` text /*The payment terms of the invoice*/,
  `status` long /*The status of the invoice*/
);  /*A billing invoice in the advertiser account.*/


-- --------------------------------------------------------------------------
-- Table structure for table `BillingInvoiceDownloadResponse` generated from model 'billingInvoiceDownloadResponse'
--

CREATE TABLE IF NOT EXISTS `BillingInvoiceDownloadResponse` (
  `download_url` text /*The download url for the billing invoice*/,
  `id` text PRIMARY KEY /*The billing invoice id*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `billing_invoices_get_200_response` generated from model 'billingInvoicesGet200Response'
--

CREATE TABLE IF NOT EXISTS `billing_invoices_get_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BillingInvoicesGet200ResponseBillingInvoice` generated from model 'BillingInvoicesGet200ResponseBillingInvoice'

CREATE TABLE IF NOT EXISTS `BillingInvoicesGet200ResponseBillingInvoice` (
  `billingInvoicesGet200Response` long NOT NULL
  `billingInvoice` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `billing_profiles_get_200_response` generated from model 'billingProfilesGet200Response'
--

CREATE TABLE IF NOT EXISTS `billing_profiles_get_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BillingProfilesGet200ResponseBillingProfilesResponse` generated from model 'BillingProfilesGet200ResponseBillingProfilesResponse'

CREATE TABLE IF NOT EXISTS `BillingProfilesGet200ResponseBillingProfilesResponse` (
  `billingProfilesGet200Response` long NOT NULL
  `billingProfilesResponse` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BillingProfilesResponse` generated from model 'billingProfilesResponse'
--

CREATE TABLE IF NOT EXISTS `BillingProfilesResponse` (
  `advertiser_id` text /*Advertiser ID of the billing.*/,
  `billing_type` long /*Billing type of the advertiser*/,
  `card_type` long /*Type of the card.*/,
  `id` text PRIMARY KEY /*Billing ID.*/,
  `payment_method_brand` long /*Brand of the payment method.*/,
  `status` long /*Status of the billing.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Board` generated from model 'board'
--

CREATE TABLE IF NOT EXISTS `Board` (
  `id` text NOT NULL PRIMARY KEY,
  `name` text NOT NULL /*    Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.*/,
  `board_pins_modified_at` datetime /*Date and time of last board pins modified.*/,
  `collaborator_count` int UNSIGNED /*Count of collaborators on the board.*/,
  `created_at` datetime /*Date and time of board creation.*/,
  `description` text,
  `follower_count` int UNSIGNED /*Board follower count.*/,
  `is_ads_only` boolean /*If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins.*/,
  `media` long /*Board media.*/,
  `owner` long,
  `pin_count` int UNSIGNED /*Count of Pins on the board.*/,
  `privacy` long /*    Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the &#x60;privacy&#x60; settng automatically becomes &#x60;PROTECTED&#x60;. */
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BoardBase` generated from model 'boardBase'
--

CREATE TABLE IF NOT EXISTS `BoardBase` (
  `id` text NOT NULL PRIMARY KEY,
  `name` text NOT NULL /*    Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.*/,
  `board_pins_modified_at` datetime /*Date and time of last board pins modified.*/,
  `collaborator_count` int UNSIGNED /*Count of collaborators on the board.*/,
  `created_at` datetime /*Date and time of board creation.*/,
  `description` text,
  `follower_count` int UNSIGNED /*Board follower count.*/,
  `is_ads_only` boolean /*If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins.*/,
  `media` long /*Board media.*/,
  `owner` long,
  `pin_count` int UNSIGNED /*Count of Pins on the board.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BoardCreate` generated from model 'boardCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `BoardCreate` (
  `name` text NOT NULL /*    Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.*/,
  `description` text,
  `is_ads_only` boolean /*If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins.*/,
  `privacy` long /*    Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the &#x60;privacy&#x60; settng automatically becomes &#x60;PROTECTED&#x60;. */
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `BoardMedia` generated from model 'boardMedia'
--

CREATE TABLE IF NOT EXISTS `BoardMedia` (
  `image_cover_url` text /*Board cover image*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BoardMediaPinThumbnailUrls` generated from model 'BoardMediaPinThumbnailUrls'

CREATE TABLE IF NOT EXISTS `BoardMediaPinThumbnailUrls` (
  `boardMedia` long NOT NULL
  `pinThumbnailUrls` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BoardOwner` generated from model 'boardOwner'
--

CREATE TABLE IF NOT EXISTS `BoardOwner` (
  `username` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BoardSection` generated from model 'boardSection'
-- Sections help organize pins within a board.
--

CREATE TABLE IF NOT EXISTS `BoardSection` (
  `name` text NOT NULL,
  `id` text PRIMARY KEY
);  /*Sections help organize pins within a board.*/


-- --------------------------------------------------------------------------
-- Table structure for table `BoardSectionCreate` generated from model 'boardSectionCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `BoardSectionCreate` (
  `name` text NOT NULL,
  `id` text PRIMARY KEY
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `BoardSectionUpdateWithRequiredBody` generated from model 'boardSectionUpdateWithRequiredBody'
-- Resource create or update operation model with required body fields (no OptionalProperties).
--

CREATE TABLE IF NOT EXISTS `BoardSectionUpdateWithRequiredBody` (
  `name` text NOT NULL,
  `id` text PRIMARY KEY
);  /*Resource create or update operation model with required body fields (no OptionalProperties).*/


-- --------------------------------------------------------------------------
-- Table structure for table `board_sections_list_200_response` generated from model 'boardSectionsList200Response'
--

CREATE TABLE IF NOT EXISTS `board_sections_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BoardSectionsList200ResponseBoardSection` generated from model 'BoardSectionsList200ResponseBoardSection'

CREATE TABLE IF NOT EXISTS `BoardSectionsList200ResponseBoardSection` (
  `boardSectionsList200Response` long NOT NULL
  `boardSection` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BoardWithUpdatePrivacy` generated from model 'boardWithUpdatePrivacy'
--

CREATE TABLE IF NOT EXISTS `BoardWithUpdatePrivacy` (
  `id` text NOT NULL PRIMARY KEY,
  `name` text NOT NULL /*    Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.*/,
  `board_pins_modified_at` datetime /*Date and time of last board pins modified.*/,
  `collaborator_count` int UNSIGNED /*Count of collaborators on the board.*/,
  `created_at` datetime /*Date and time of board creation.*/,
  `description` text,
  `follower_count` int UNSIGNED /*Board follower count.*/,
  `is_ads_only` boolean /*If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins.*/,
  `media` long /*Board media.*/,
  `owner` long,
  `pin_count` int UNSIGNED /*Count of Pins on the board.*/,
  `privacy` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BoardWithUpdatePrivacyUpdate` generated from model 'boardWithUpdatePrivacyUpdate'
-- Resource create or update operation model.
--

CREATE TABLE IF NOT EXISTS `BoardWithUpdatePrivacyUpdate` (
  `description` text,
  `name` text /*    Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.*/,
  `privacy` long
);  /*Resource create or update operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `boards_list_200_response` generated from model 'boardsList200Response'
--

CREATE TABLE IF NOT EXISTS `boards_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BoardsList200ResponseBoard` generated from model 'BoardsList200ResponseBoard'

CREATE TABLE IF NOT EXISTS `BoardsList200ResponseBoard` (
  `boardsList200Response` long NOT NULL
  `board` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `boards_list_pins_200_response` generated from model 'boardsListPins200Response'
--

CREATE TABLE IF NOT EXISTS `boards_list_pins_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BoardsListPins200ResponsePinRead` generated from model 'BoardsListPins200ResponsePinRead'

CREATE TABLE IF NOT EXISTS `BoardsListPins200ResponsePinRead` (
  `boardsListPins200Response` long NOT NULL
  `pinRead` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BookClosed` generated from model 'bookClosed'
--

CREATE TABLE IF NOT EXISTS `BookClosed` (
  `conversion_metrics_ready` boolean NOT NULL /*Are conversion metrics ready?*/,
  `non_conversion_metrics_ready` boolean NOT NULL /*Are non-conversion metrics ready?*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BrandAccount` generated from model 'brandAccount'
--

CREATE TABLE IF NOT EXISTS `BrandAccount` (
  `brand_account_id` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BrandAccountCreate` generated from model 'brandAccountCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `BrandAccountCreate` (
  `country` long NOT NULL,
  `name` text NOT NULL /*Brand Account name*/,
  `username` text NOT NULL /*Brand Account username*/,
  `about` text /*Brand Account about information*/,
  `profile_image` long,
  `website` text /*Brand Account website*/
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `BrandAccountProfileImage` generated from model 'brandAccountProfileImage'
-- Base64-encoded image media source
--

CREATE TABLE IF NOT EXISTS `BrandAccountProfileImage` (
  `content_type` text NOT NULL,
  `data` text NOT NULL
);  /*Base64-encoded image media source*/


-- --------------------------------------------------------------------------
-- Table structure for table `BrandAccountProfileImageUpdate` generated from model 'brandAccountProfileImageUpdate'
-- Base64-encoded image media source
--

CREATE TABLE IF NOT EXISTS `BrandAccountProfileImageUpdate` (
  `content_type` text,
  `data` text
);  /*Base64-encoded image media source*/


-- --------------------------------------------------------------------------
-- Table structure for table `BrandAccountUpdate` generated from model 'brandAccountUpdate'
-- Resource create or update operation model.
--

CREATE TABLE IF NOT EXISTS `BrandAccountUpdate` (
  `about` text /*Brand Account about information*/,
  `country` long,
  `name` text /*Brand Account name*/,
  `profile_image` long,
  `username` text /*Brand Account username*/,
  `website` text /*Brand Account website*/
);  /*Resource create or update operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `BrandFilter` generated from model 'brandFilter'
--

CREATE TABLE IF NOT EXISTS `BrandFilter` (
  `BRAND` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BulkCampaignDeliveryEstimatesItem` generated from model 'bulkCampaignDeliveryEstimatesItem'
-- Delivery estimate result for a single campaign within a bulk request.
--

CREATE TABLE IF NOT EXISTS `BulkCampaignDeliveryEstimatesItem` (
  `conversion_rate` float /*Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.*/,
  `derived_metrics` long,
  `estimate_id` text /*UUID used to track delivery estimates when they are generated as part of a saved campaign.*/,
  `max_potential_spend` int /*Maximum potential spend estimate.*/
);  /*Delivery estimate result for a single campaign within a bulk request.*/

-- --------------------------------------------------------------------------
-- Table structure for table `BulkCampaignDeliveryEstimatesItemCampaignPlanningAdGroupAudienceSize` generated from model 'BulkCampaignDeliveryEstimatesItemCampaignPlanningAdGroupAudienceSize'

CREATE TABLE IF NOT EXISTS `BulkCampaignDeliveryEstimatesItemCampaignPlanningAdGroupAudienceSize` (
  `bulkCampaignDeliveryEstimatesItem` long NOT NULL
  `campaignPlanningAdGroupAudienceSize` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkCampaignDeliveryEstimatesItemCampaignPlanningConversionRate` generated from model 'BulkCampaignDeliveryEstimatesItemCampaignPlanningConversionRate'

CREATE TABLE IF NOT EXISTS `BulkCampaignDeliveryEstimatesItemCampaignPlanningConversionRate` (
  `bulkCampaignDeliveryEstimatesItem` long NOT NULL
  `campaignPlanningConversionRate` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkCampaignDeliveryEstimatesItemCampaignPlanningCurveEstimate` generated from model 'BulkCampaignDeliveryEstimatesItemCampaignPlanningCurveEstimate'

CREATE TABLE IF NOT EXISTS `BulkCampaignDeliveryEstimatesItemCampaignPlanningCurveEstimate` (
  `bulkCampaignDeliveryEstimatesItem` long NOT NULL
  `campaignPlanningCurveEstimate` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkCampaignDeliveryEstimatesItemCampaignPlanningResponseError` generated from model 'BulkCampaignDeliveryEstimatesItemCampaignPlanningResponseError'

CREATE TABLE IF NOT EXISTS `BulkCampaignDeliveryEstimatesItemCampaignPlanningResponseError` (
  `bulkCampaignDeliveryEstimatesItem` long NOT NULL
  `campaignPlanningResponseError` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BulkCampaignDeliveryEstimatesResponse` generated from model 'bulkCampaignDeliveryEstimatesResponse'
-- Bulk campaign delivery estimates response.
--

CREATE TABLE IF NOT EXISTS `BulkCampaignDeliveryEstimatesResponse` (
);  /*Bulk campaign delivery estimates response.*/

-- --------------------------------------------------------------------------
-- Table structure for table `BulkCampaignDeliveryEstimatesResponseBulkCampaignDeliveryEstimatesItem` generated from model 'BulkCampaignDeliveryEstimatesResponseBulkCampaignDeliveryEstimatesItem'

CREATE TABLE IF NOT EXISTS `BulkCampaignDeliveryEstimatesResponseBulkCampaignDeliveryEstimatesItem` (
  `bulkCampaignDeliveryEstimatesResponse` long NOT NULL
  `bulkCampaignDeliveryEstimatesItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BulkDownload` generated from model 'bulkDownload'
-- Ad entities to get in bulk request.
--

CREATE TABLE IF NOT EXISTS `BulkDownload` (
  `request_id` text /*ID of the bulk request.*/
);  /*Ad entities to get in bulk request.*/


-- --------------------------------------------------------------------------
-- Table structure for table `BulkDownloadCampaignFilter` generated from model 'bulkDownloadCampaignFilter'
--

CREATE TABLE IF NOT EXISTS `BulkDownloadCampaignFilter` (
  `end_time` text /*Unix UTC timestamp.*/,
  `name` text /*Campaign name*/,
  `start_time` text /*Unix UTC timestamp.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BulkDownloadCampaignFilterSummaryStatus` generated from model 'BulkDownloadCampaignFilterSummaryStatus'

CREATE TABLE IF NOT EXISTS `BulkDownloadCampaignFilterSummaryStatus` (
  `bulkDownloadCampaignFilter` long NOT NULL
  `summaryStatus` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkDownloadCampaignFilterConversionObjectiveType` generated from model 'BulkDownloadCampaignFilterConversionObjectiveType'

CREATE TABLE IF NOT EXISTS `BulkDownloadCampaignFilterConversionObjectiveType` (
  `bulkDownloadCampaignFilter` long NOT NULL
  `conversionObjectiveType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BulkDownloadCreate` generated from model 'bulkDownloadCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `BulkDownloadCreate` (
  `campaign_filter` long,
  `output_format` long,
  `updated_since` text /*Unix UTC timestamp to retrieve all entities that have changed since this time.*/
);  /*Resource create operation model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `BulkDownloadCreateEntityIds` generated from model 'BulkDownloadCreateEntityIds'

CREATE TABLE IF NOT EXISTS `BulkDownloadCreateEntityIds` (
  `bulkDownloadCreate` long NOT NULL
  `entityIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkDownloadCreateBulkEntityType` generated from model 'BulkDownloadCreateBulkEntityType'

CREATE TABLE IF NOT EXISTS `BulkDownloadCreateBulkEntityType` (
  `bulkDownloadCreate` long NOT NULL
  `bulkEntityType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BulkJobData` generated from model 'bulkJobData'
-- Bulk request result data.
--

CREATE TABLE IF NOT EXISTS `BulkJobData` (
  `status` long NOT NULL,
  `result_url` text /*Presigned s3 file url for the bulk request result.*/,
  `workload_id` int /*Bulk Workload Id.*/
);  /*Bulk request result data.*/


-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequest` generated from model 'bulkUpsertRequest'
-- Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
--

CREATE TABLE IF NOT EXISTS `BulkUpsertRequest` (
  `create` long,
  `update` long
);  /*Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.*/


-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestCreate` generated from model 'bulkUpsertRequestCreate'
-- Request for creation of entities in bulk.
--

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestCreate` (
);  /*Request for creation of entities in bulk.*/

-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestCreateAdGroupCreateRequest` generated from model 'BulkUpsertRequestCreateAdGroupCreateRequest'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestCreateAdGroupCreateRequest` (
  `bulkUpsertRequestCreate` long NOT NULL
  `adGroupCreateRequest` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestCreateAdCreateRequest` generated from model 'BulkUpsertRequestCreateAdCreateRequest'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestCreateAdCreateRequest` (
  `bulkUpsertRequestCreate` long NOT NULL
  `adCreateRequest` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestCreateCampaignCreateRequest` generated from model 'BulkUpsertRequestCreateCampaignCreateRequest'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestCreateCampaignCreateRequest` (
  `bulkUpsertRequestCreate` long NOT NULL
  `campaignCreateRequest` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestCreateBulkUpsertRequestCreateCatalogProductGroupsItems` generated from model 'BulkUpsertRequestCreateBulkUpsertRequestCreateCatalogProductGroupsItems'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestCreateBulkUpsertRequestCreateCatalogProductGroupsItems` (
  `bulkUpsertRequestCreate` long NOT NULL
  `bulkUpsertRequestCreateCatalogProductGroupsItems` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestCreateKeywordsRequest` generated from model 'BulkUpsertRequestCreateKeywordsRequest'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestCreateKeywordsRequest` (
  `bulkUpsertRequestCreate` long NOT NULL
  `keywordsRequest` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestCreateLabelBulkCreateRequest` generated from model 'BulkUpsertRequestCreateLabelBulkCreateRequest'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestCreateLabelBulkCreateRequest` (
  `bulkUpsertRequestCreate` long NOT NULL
  `labelBulkCreateRequest` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestCreateProductGroupPromotionCreateRequest` generated from model 'BulkUpsertRequestCreateProductGroupPromotionCreateRequest'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestCreateProductGroupPromotionCreateRequest` (
  `bulkUpsertRequestCreate` long NOT NULL
  `productGroupPromotionCreateRequest` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestCreateScheduleCreateRequest` generated from model 'BulkUpsertRequestCreateScheduleCreateRequest'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestCreateScheduleCreateRequest` (
  `bulkUpsertRequestCreate` long NOT NULL
  `scheduleCreateRequest` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestCreateCatalogProductGroupsItems` generated from model 'bulkUpsertRequestCreateCatalogProductGroupsItems'
--

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestCreateCatalogProductGroupsItems` (
  `feed_id` text NOT NULL /*Catalog Feed id pertaining to the catalog product group.*/,
  `filters` long NOT NULL,
  `name` text NOT NULL,
  `catalog_id` text NOT NULL /*Catalog ID pertaining to the product group.*/,
  `catalog_type` text NOT NULL,
  `description` text,
  `is_featured` boolean /*boolean indicator of whether the product group is being featured or not*/,
  `country` long,
  `locale` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestUpdate` generated from model 'bulkUpsertRequestUpdate'
-- Request for creation of entities in bulk.
--

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestUpdate` (
);  /*Request for creation of entities in bulk.*/

-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestUpdateAdGroupUpdateRequest` generated from model 'BulkUpsertRequestUpdateAdGroupUpdateRequest'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestUpdateAdGroupUpdateRequest` (
  `bulkUpsertRequestUpdate` long NOT NULL
  `adGroupUpdateRequest` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestUpdateAdUpdateRequest` generated from model 'BulkUpsertRequestUpdateAdUpdateRequest'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestUpdateAdUpdateRequest` (
  `bulkUpsertRequestUpdate` long NOT NULL
  `adUpdateRequest` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestUpdateCampaignUpdateRequest` generated from model 'BulkUpsertRequestUpdateCampaignUpdateRequest'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestUpdateCampaignUpdateRequest` (
  `bulkUpsertRequestUpdate` long NOT NULL
  `campaignUpdateRequest` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestUpdateBulkUpsertRequestUpdateCatalogProductGroupsItems` generated from model 'BulkUpsertRequestUpdateBulkUpsertRequestUpdateCatalogProductGroupsItems'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestUpdateBulkUpsertRequestUpdateCatalogProductGroupsItems` (
  `bulkUpsertRequestUpdate` long NOT NULL
  `bulkUpsertRequestUpdateCatalogProductGroupsItems` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestUpdateKeywordUpdateGenerated` generated from model 'BulkUpsertRequestUpdateKeywordUpdateGenerated'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestUpdateKeywordUpdateGenerated` (
  `bulkUpsertRequestUpdate` long NOT NULL
  `keywordUpdateGenerated` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestUpdateLabelBulkUpdateRequest` generated from model 'BulkUpsertRequestUpdateLabelBulkUpdateRequest'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestUpdateLabelBulkUpdateRequest` (
  `bulkUpsertRequestUpdate` long NOT NULL
  `labelBulkUpdateRequest` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestUpdateProductGroupPromotionUpdateRequest` generated from model 'BulkUpsertRequestUpdateProductGroupPromotionUpdateRequest'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestUpdateProductGroupPromotionUpdateRequest` (
  `bulkUpsertRequestUpdate` long NOT NULL
  `productGroupPromotionUpdateRequest` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestUpdateScheduleUpdateRequest` generated from model 'BulkUpsertRequestUpdateScheduleUpdateRequest'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestUpdateScheduleUpdateRequest` (
  `bulkUpsertRequestUpdate` long NOT NULL
  `scheduleUpdateRequest` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestUpdateCatalogProductGroupsItems` generated from model 'bulkUpsertRequestUpdateCatalogProductGroupsItems'
--

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestUpdateCatalogProductGroupsItems` (
  `description` text,
  `filters` long,
  `is_featured` boolean /*boolean indicator of whether the product group is being featured or not*/,
  `name` text,
  `catalog_type` text,
  `country` long,
  `locale` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertResponse` generated from model 'bulkUpsertResponse'
-- ID of the bulk request.
--

CREATE TABLE IF NOT EXISTS `BulkUpsertResponse` (
  `request_id` text
);  /*ID of the bulk request.*/


-- --------------------------------------------------------------------------
-- Table structure for table `BusinessAccessUserSummary` generated from model 'businessAccessUserSummary'
-- Metadata of the member/partner that has access to the asset.
--

CREATE TABLE IF NOT EXISTS `BusinessAccessUserSummary` (
  `email` text /*Email of the business member/partner.*/,
  `id` text PRIMARY KEY /*Unique identifier of the business member/partner.*/,
  `username` text /*Username of the business member/partner.*/
);  /*Metadata of the member/partner that has access to the asset.*/


-- --------------------------------------------------------------------------
-- Table structure for table `business_asset_members_get_200_response` generated from model 'businessAssetMembersGet200Response'
--

CREATE TABLE IF NOT EXISTS `business_asset_members_get_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessAssetMembersGet200ResponseUserSingleAssetBinding` generated from model 'BusinessAssetMembersGet200ResponseUserSingleAssetBinding'

CREATE TABLE IF NOT EXISTS `BusinessAssetMembersGet200ResponseUserSingleAssetBinding` (
  `businessAssetMembersGet200Response` long NOT NULL
  `userSingleAssetBinding` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BusinessAssets` generated from model 'businessAssets'
--

CREATE TABLE IF NOT EXISTS `BusinessAssets` (
  `asset_group_info` long /*An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;.*/,
  `asset_id` text /*Unique identifier of a business asset.*/,
  `asset_type` long,
  `catalog_info` long /*An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals &#39;CATALOG&#39;.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessAssetsPermissions` generated from model 'BusinessAssetsPermissions'

CREATE TABLE IF NOT EXISTS `BusinessAssetsPermissions` (
  `businessAssets` long NOT NULL
  `permissions` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `business_assets_get_200_response` generated from model 'businessAssetsGet200Response'
--

CREATE TABLE IF NOT EXISTS `business_assets_get_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessAssetsGet200ResponseBusinessAssets` generated from model 'BusinessAssetsGet200ResponseBusinessAssets'

CREATE TABLE IF NOT EXISTS `BusinessAssetsGet200ResponseBusinessAssets` (
  `businessAssetsGet200Response` long NOT NULL
  `businessAssets` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BusinessMemberAssetsGetResponse` generated from model 'businessMemberAssetsGetResponse'
-- Paginated response for business member assets with total count metadata.
--

CREATE TABLE IF NOT EXISTS `BusinessMemberAssetsGetResponse` (
  `total_data_count` int NOT NULL /*Total number of assets matching the query*/,
  `bookmark` text,
  `total_data_count_by_status` long /*Breakdown of asset counts by entity status (ad accounts only)*/
);  /*Paginated response for business member assets with total count metadata.*/

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessMemberAssetsGetResponseAssetIdPermissions` generated from model 'BusinessMemberAssetsGetResponseAssetIdPermissions'

CREATE TABLE IF NOT EXISTS `BusinessMemberAssetsGetResponseAssetIdPermissions` (
  `businessMemberAssetsGetResponse` long NOT NULL
  `assetIdPermissions` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BusinessMemberAssetsSummary` generated from model 'businessMemberAssetsSummary'
-- Ad accounts and profiles the business member/partner has access to.
--

CREATE TABLE IF NOT EXISTS `BusinessMemberAssetsSummary` (
);  /*Ad accounts and profiles the business member/partner has access to.*/

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessMemberAssetsSummaryAssetIdWithPermissions` generated from model 'BusinessMemberAssetsSummaryAssetIdWithPermissions'

CREATE TABLE IF NOT EXISTS `BusinessMemberAssetsSummaryAssetIdWithPermissions` (
  `businessMemberAssetsSummary` long NOT NULL
  `assetIdWithPermissions` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessMemberAssetsSummaryAssetIdWithPermissions` generated from model 'BusinessMemberAssetsSummaryAssetIdWithPermissions'

CREATE TABLE IF NOT EXISTS `BusinessMemberAssetsSummaryAssetIdWithPermissions` (
  `businessMemberAssetsSummary` long NOT NULL
  `assetIdWithPermissions` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BusinessMembersAssetAccessDeleteBody` generated from model 'businessMembersAssetAccessDeleteBody'
-- An object with a list of member asset accesses to delete.
--

CREATE TABLE IF NOT EXISTS `BusinessMembersAssetAccessDeleteBody` (
);  /*An object with a list of member asset accesses to delete.*/

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessMembersAssetAccessDeleteBodyDeleteMemberAssetAccessItem` generated from model 'BusinessMembersAssetAccessDeleteBodyDeleteMemberAssetAccessItem'

CREATE TABLE IF NOT EXISTS `BusinessMembersAssetAccessDeleteBodyDeleteMemberAssetAccessItem` (
  `businessMembersAssetAccessDeleteBody` long NOT NULL
  `deleteMemberAssetAccessItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BusinessMembershipMember` generated from model 'businessMembershipMember'
-- A business member identified by &#x60;member_id&#x60; with their &#x60;business_role&#x60; in the business.
--

CREATE TABLE IF NOT EXISTS `BusinessMembershipMember` (
  `business_role` long NOT NULL,
  `member_id` text NOT NULL /*Unique identifier of the member.*/
);  /*A business member identified by &#x60;member_id&#x60; with their &#x60;business_role&#x60; in the business.*/


-- --------------------------------------------------------------------------
-- Table structure for table `business_partner_asset_access_get_200_response` generated from model 'businessPartnerAssetAccessGet200Response'
--

CREATE TABLE IF NOT EXISTS `business_partner_asset_access_get_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessPartnerAssetAccessGet200ResponseBaseBusinessAssets` generated from model 'BusinessPartnerAssetAccessGet200ResponseBaseBusinessAssets'

CREATE TABLE IF NOT EXISTS `BusinessPartnerAssetAccessGet200ResponseBaseBusinessAssets` (
  `businessPartnerAssetAccessGet200Response` long NOT NULL
  `baseBusinessAssets` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BusinessToAdAccountSharedAudience` generated from model 'businessToAdAccountSharedAudience'
--

CREATE TABLE IF NOT EXISTS `BusinessToAdAccountSharedAudience` (
  `audience_id` text NOT NULL /*Unique identifier of an audience*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessToAdAccountSharedAudienceRecipientAccountIds` generated from model 'BusinessToAdAccountSharedAudienceRecipientAccountIds'

CREATE TABLE IF NOT EXISTS `BusinessToAdAccountSharedAudienceRecipientAccountIds` (
  `businessToAdAccountSharedAudience` long NOT NULL
  `recipientAccountIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessToAdAccountSharedAudienceRole` generated from model 'BusinessToAdAccountSharedAudienceRole'

CREATE TABLE IF NOT EXISTS `BusinessToAdAccountSharedAudienceRole` (
  `businessToAdAccountSharedAudience` long NOT NULL
  `role` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BusinessToAdAccountSharedAudienceUpdateWithRequiredBody` generated from model 'businessToAdAccountSharedAudienceUpdateWithRequiredBody'
-- Resource create or update operation model with required body fields (no OptionalProperties).
--

CREATE TABLE IF NOT EXISTS `BusinessToAdAccountSharedAudienceUpdateWithRequiredBody` (
  `audience_id` text NOT NULL /*Unique identifier of an audience*/,
  `operation_type` long NOT NULL,
);  /*Resource create or update operation model with required body fields (no OptionalProperties).*/

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessToAdAccountSharedAudienceUpdateWithRequiredBodyRecipientAccountIds` generated from model 'BusinessToAdAccountSharedAudienceUpdateWithRequiredBodyRecipientAccountIds'

CREATE TABLE IF NOT EXISTS `BusinessToAdAccountSharedAudienceUpdateWithRequiredBodyRecipientAccountIds` (
  `businessToAdAccountSharedAudienceUpdateWithRequiredBody` long NOT NULL
  `recipientAccountIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BusinessToBusinessSharedAudience` generated from model 'businessToBusinessSharedAudience'
--

CREATE TABLE IF NOT EXISTS `BusinessToBusinessSharedAudience` (
  `audience_id` text NOT NULL /*Unique identifier of an audience*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessToBusinessSharedAudienceRecipientBusinessIds` generated from model 'BusinessToBusinessSharedAudienceRecipientBusinessIds'

CREATE TABLE IF NOT EXISTS `BusinessToBusinessSharedAudienceRecipientBusinessIds` (
  `businessToBusinessSharedAudience` long NOT NULL
  `recipientBusinessIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessToBusinessSharedAudienceRole` generated from model 'BusinessToBusinessSharedAudienceRole'

CREATE TABLE IF NOT EXISTS `BusinessToBusinessSharedAudienceRole` (
  `businessToBusinessSharedAudience` long NOT NULL
  `role` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BusinessToBusinessSharedAudienceUpdateWithRequiredBody` generated from model 'businessToBusinessSharedAudienceUpdateWithRequiredBody'
-- Resource create or update operation model with required body fields (no OptionalProperties).
--

CREATE TABLE IF NOT EXISTS `BusinessToBusinessSharedAudienceUpdateWithRequiredBody` (
  `audience_id` text NOT NULL /*Unique identifier of an audience*/,
  `operation_type` long NOT NULL,
);  /*Resource create or update operation model with required body fields (no OptionalProperties).*/

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessToBusinessSharedAudienceUpdateWithRequiredBodyRecipientBusinessIds` generated from model 'BusinessToBusinessSharedAudienceUpdateWithRequiredBodyRecipientBusinessIds'

CREATE TABLE IF NOT EXISTS `BusinessToBusinessSharedAudienceUpdateWithRequiredBodyRecipientBusinessIds` (
  `businessToBusinessSharedAudienceUpdateWithRequiredBody` long NOT NULL
  `recipientBusinessIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `Campaign` generated from model 'campaign'
--

CREATE TABLE IF NOT EXISTS `Campaign` (
  `id` text NOT NULL PRIMARY KEY /*Campaign ID, must be associated with the ad account ID provided in the path.*/,
  `objective_type` long NOT NULL,
  `ad_account_id` text /*Campaign&#39;s Advertiser ID.*/,
  `bid_options` long /*[Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.*/,
  `created_time` int /*Campaign creation time. Unix timestamp in seconds.*/,
  `daily_spend_cap` int /*Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.*/,
  `default_ad_group_budget_in_micro_currency` int /*When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.*/,
  `end_time` int /*Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `intended_promotion_type` long,
  `is_automated_campaign` boolean /*Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES*/,
  `is_campaign_budget_optimization` boolean /*Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.*/,
  `is_carting` boolean /*Whether the campaign contains a carting(where-to-buy link) ad.*/,
  `is_flexible_daily_budgets` boolean /*Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.*/,
  `is_ltv_optimized` boolean /*Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.*/,
  `is_performance_plus` boolean /*Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)*/,
  `is_top_of_search` boolean /*Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.*/,
  `lifetime_spend_cap` int /*Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.*/,
  `name` text /*Campaign name - 255 chars max.*/,
  `order_line_id` text /*Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.*/,
  `performance_plus_campaign_settings` long /*Pinterest Performance+ campaign settings.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `status` long,
  `summary_status` long,
  `tracking_urls` long,
  `type` text /*Always \&quot;campaign\&quot;.*/,
  `updated_time` int /*UTC timestamp. Last update time.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignAdPreview` generated from model 'campaignAdPreview'
-- Campaign ad preview record.
--

CREATE TABLE IF NOT EXISTS `CampaignAdPreview` (
  `ad_account_id` text NOT NULL /*Advertiser ID for this preview.*/,
  `ad_group_id` text NOT NULL /*Ad group ID to create a preview record for.*/,
  `expires_at` int NOT NULL /*Unix timestamp in milliseconds for preview expiration.*/,
  `is_active` boolean NOT NULL /*Whether preview link is active.*/,
  `url` text NOT NULL /*Campaign ad preview URL.*/,
  `user_id` int NOT NULL /*User ID that created preview.*/,
  `uuid` text NOT NULL /*Pin promotion preview key.*/,
  `client_id` int /*Client ID that created preview.*/,
  `pin_id` int /*Pin ID for pin promotion preview.*/,
  `pin_promotion_id` int /*Pin promotion ID for this preview.*/,
  `promoted_product_group_id` int /*Promoted product group ID for catalog previews.*/
);  /*Campaign ad preview record.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignAdPreviewCreate` generated from model 'campaignAdPreviewCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `CampaignAdPreviewCreate` (
  `ad_group_id` text NOT NULL /*Ad group ID to create a preview record for.*/
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `campaign_ad_preview_create_200_response_inner` generated from model 'campaignAdPreviewCreate200ResponseInner'
--

CREATE TABLE IF NOT EXISTS `campaign_ad_preview_create_200_response_inner` (
  `data` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `campaign_ad_preview_create_200_response_inner_data` generated from model 'campaignAdPreviewCreate200ResponseInnerData'
-- Created/updated resource on success or error details on failure
--

CREATE TABLE IF NOT EXISTS `campaign_ad_preview_create_200_response_inner_data` (
  `ad_account_id` text NOT NULL /*Advertiser ID for this preview.*/,
  `ad_group_id` text NOT NULL /*Ad group ID to create a preview record for.*/,
  `expires_at` int NOT NULL /*Unix timestamp in milliseconds for preview expiration.*/,
  `is_active` boolean NOT NULL /*Whether preview link is active.*/,
  `url` text NOT NULL /*Campaign ad preview URL.*/,
  `user_id` int NOT NULL /*User ID that created preview.*/,
  `uuid` text NOT NULL /*Pin promotion preview key.*/,
  `exceptions` long NOT NULL,
  `client_id` int /*Client ID that created preview.*/,
  `pin_id` int /*Pin ID for pin promotion preview.*/,
  `pin_promotion_id` int /*Pin promotion ID for this preview.*/,
  `promoted_product_group_id` int /*Promoted product group ID for catalog previews.*/
);  /*Created/updated resource on success or error details on failure*/


-- --------------------------------------------------------------------------
-- Table structure for table `campaign_ad_preview_create_200_response_inner_data_oneOf` generated from model 'campaignAdPreviewCreate200ResponseInnerDataOneOf'
--

CREATE TABLE IF NOT EXISTS `campaign_ad_preview_create_200_response_inner_data_oneOf` (
  `exceptions` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `campaign_ad_preview_delete_200_response_inner` generated from model 'campaignAdPreviewDelete200ResponseInner'
--

CREATE TABLE IF NOT EXISTS `campaign_ad_preview_delete_200_response_inner` (
  `status` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `campaign_ad_preview_delete_200_response_inner_status` generated from model 'campaignAdPreviewDelete200ResponseInnerStatus'
--

CREATE TABLE IF NOT EXISTS `campaign_ad_preview_delete_200_response_inner_status` (
  `statusCode` decimal NOT NULL,
  `code` int NOT NULL,
  `message` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignAudienceMultipliers` generated from model 'campaignAudienceMultipliers'
-- This represents a mapping from Audience ID to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified audience in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
--

CREATE TABLE IF NOT EXISTS `CampaignAudienceMultipliers` (
  `AUDIENCE_ID` text /*Audience ID for the multiplier.*/
);  /*This represents a mapping from Audience ID to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified audience in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignBatchItem` generated from model 'campaignBatchItem'
-- Item in a batch campaign response.
--

CREATE TABLE IF NOT EXISTS `CampaignBatchItem` (
  `data` long /*Campaign data on success.*/,
);  /*Item in a batch campaign response.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CampaignBatchItemException` generated from model 'CampaignBatchItemException'

CREATE TABLE IF NOT EXISTS `CampaignBatchItemException` (
  `campaignBatchItem` long NOT NULL
  `exception` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignBatchResponseData` generated from model 'campaignBatchResponseData'
-- Campaign data in batch response, with all fields optional to support error cases where data may be empty.
--

CREATE TABLE IF NOT EXISTS `CampaignBatchResponseData` (
  `ad_account_id` text /*Campaign&#39;s Advertiser ID.*/,
  `bid_options` long /*[Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.*/,
  `created_time` int /*Campaign creation time. Unix timestamp in seconds.*/,
  `daily_spend_cap` int /*Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.*/,
  `default_ad_group_budget_in_micro_currency` int /*When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.*/,
  `end_time` int /*Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `id` text PRIMARY KEY /*Campaign ID.*/,
  `intended_promotion_type` long,
  `is_automated_campaign` boolean /*Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES*/,
  `is_campaign_budget_optimization` boolean /*Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.*/,
  `is_carting` boolean /*Whether the campaign contains a carting(where-to-buy link) ad.*/,
  `is_flexible_daily_budgets` boolean /*Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.*/,
  `is_ltv_optimized` boolean /*Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.*/,
  `is_performance_plus` boolean /*Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)*/,
  `is_top_of_search` boolean /*Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.*/,
  `lifetime_spend_cap` int /*Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.*/,
  `name` text /*Campaign name - 255 chars max.*/,
  `objective_type` long,
  `order_line_id` text /*Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.*/,
  `performance_plus_campaign_settings` long /*Pinterest Performance+ campaign settings.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `status` long,
  `summary_status` long,
  `tracking_urls` long,
  `type` text /*Always \&quot;campaign\&quot;.*/,
  `updated_time` int /*UTC timestamp. Last update time.*/
);  /*Campaign data in batch response, with all fields optional to support error cases where data may be empty.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignBatchUpdateItem` generated from model 'campaignBatchUpdateItem'
-- Single campaign update item with update-specific bid options.
--

CREATE TABLE IF NOT EXISTS `CampaignBatchUpdateItem` (
  `id` text NOT NULL PRIMARY KEY /*Campaign ID, must be associated with the ad account ID provided in the path.*/,
  `ad_account_id` text /*Setting this field does nothing. The ad account ID gets set from the path parameter.*/,
  `app_id` text /*[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  The store ID of the mobile app for &#x60;APP_INSTALL&#x60; campaigns.*/,
  `app_platform` long /*[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for &#x60;APP_INSTALL&#x60; campaigns.*/,
  `bid_options` long /*Object describing an update to the campaign level bid multipliers.*/,
  `daily_spend_cap` int /*Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.*/,
  `default_ad_group_budget_in_micro_currency` int /*Setting this field does nothing.*/,
  `end_time` int /*Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `intended_promotion_type` long,
  `is_automated_campaign` boolean /*Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES*/,
  `is_campaign_budget_optimization` boolean /*Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.*/,
  `is_flexible_daily_budgets` boolean /*Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.*/,
  `is_ltv_optimized` boolean /*Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.*/,
  `is_performance_plus` boolean /*Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)*/,
  `is_top_of_search` boolean /*Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.*/,
  `lifetime_spend_cap` int /*Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.*/,
  `name` text /*Campaign name - 255 chars max.*/,
  `objective_type` long,
  `order_line_id` text /*Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.*/,
  `performance_plus_campaign_settings` long /*Pinterest Performance+ campaign settings.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `status` long,
  `tracking_urls` long
);  /*Single campaign update item with update-specific bid options.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignBatchWriteResponseModel` generated from model 'campaignBatchWriteResponseModel'
-- Response model for batch campaign write operations.
--

CREATE TABLE IF NOT EXISTS `CampaignBatchWriteResponseModel` (
);  /*Response model for batch campaign write operations.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CampaignBatchWriteResponseModelCampaignBatchItem` generated from model 'CampaignBatchWriteResponseModelCampaignBatchItem'

CREATE TABLE IF NOT EXISTS `CampaignBatchWriteResponseModelCampaignBatchItem` (
  `campaignBatchWriteResponseModel` long NOT NULL
  `campaignBatchItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignBidOptions` generated from model 'campaignBidOptions'
-- Object describing the campaign level bid multipliers.
--

CREATE TABLE IF NOT EXISTS `CampaignBidOptions` (
  `age_bucket_multipliers` long /*Age bucket multipliers for bid adjustments.*/,
  `app_type_multipliers` long /*App type multipliers for bid adjustments.*/,
  `audience_multipliers` long /*Audience multipliers for bid adjustments.*/,
  `freq_bid_multiplier_time_window` long /*The time window for frequency bid multipliers.*/,
  `frequency_multipliers` long /*Frequency multipliers for bid adjustments.*/,
  `gender_multipliers` long /*Gender multipliers for bid adjustments.*/,
  `placement_multipliers` long /*Placement multipliers for bid adjustments.*/
);  /*Object describing the campaign level bid multipliers.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignBidOptionsCreate` generated from model 'campaignBidOptionsCreate'
-- Object describing the campaign level bid multipliers for create operations.
--

CREATE TABLE IF NOT EXISTS `CampaignBidOptionsCreate` (
  `age_bucket_multipliers` long /*Age bucket multipliers for bid adjustments.*/,
  `app_type_multipliers` long /*App type multipliers for bid adjustments.*/,
  `audience_multipliers` long /*Audience multipliers for bid adjustments.*/,
  `freq_bid_multiplier_time_window` long /*The time window for frequency bid multipliers.*/,
  `frequency_multipliers` long /*Frequency multipliers for bid adjustments.*/,
  `gender_multipliers` long /*Gender multipliers for bid adjustments.*/,
  `placement_multipliers` long /*Placement multipliers for bid adjustments.*/
);  /*Object describing the campaign level bid multipliers for create operations.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignBidOptionsUpdate` generated from model 'campaignBidOptionsUpdate'
-- Object describing an update to the campaign level bid multipliers.
--

CREATE TABLE IF NOT EXISTS `CampaignBidOptionsUpdate` (
  `age_bucket_multipliers` long /*Age bucket multipliers for bid adjustments.*/,
  `app_type_multipliers` long /*App type multipliers for bid adjustments.*/,
  `audience_multipliers` long /*Audience multipliers for bid adjustments.*/,
  `freq_bid_multiplier_time_window` long /*The time window for frequency bid multipliers.*/,
  `frequency_multipliers` long /*Frequency multipliers for bid adjustments.*/,
  `gender_multipliers` long /*Gender multipliers for bid adjustments.*/,
  `placement_multipliers` long /*Placement multipliers for bid adjustments.*/
);  /*Object describing an update to the campaign level bid multipliers.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CampaignBidOptionsUpdateCampaignBidOptionsUpdateMaskItems` generated from model 'CampaignBidOptionsUpdateCampaignBidOptionsUpdateMaskItems'

CREATE TABLE IF NOT EXISTS `CampaignBidOptionsUpdateCampaignBidOptionsUpdateMaskItems` (
  `campaignBidOptionsUpdate` long NOT NULL
  `campaignBidOptionsUpdateMaskItems` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignCreateItem` generated from model 'campaignCreateItem'
-- Single campaign create item with create-specific defaults.
--

CREATE TABLE IF NOT EXISTS `CampaignCreateItem` (
  `name` text NOT NULL /*Campaign name - 255 chars max.*/,
  `objective_type` long NOT NULL,
  `ad_account_id` text /*Setting this field does nothing. The ad account ID gets set from the path parameter.*/,
  `app_id` text /*[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  The store ID of the mobile app for &#x60;APP_INSTALL&#x60; campaigns.*/,
  `app_platform` long /*[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for &#x60;APP_INSTALL&#x60; campaigns.*/,
  `bid_options` long /*[Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.*/,
  `daily_spend_cap` int /*Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.*/,
  `default_ad_group_budget_in_micro_currency` int /*Setting this field does nothing.*/,
  `end_time` int /*Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `intended_promotion_type` long,
  `is_automated_campaign` boolean /*Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES*/,
  `is_campaign_budget_optimization` boolean /*Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.*/,
  `is_flexible_daily_budgets` boolean /*Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.*/,
  `is_ltv_optimized` boolean /*Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.*/,
  `is_performance_plus` boolean /*Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)*/,
  `is_top_of_search` boolean /*Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.*/,
  `lifetime_spend_cap` int /*Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.*/,
  `order_line_id` text /*Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `status` long,
  `tracking_urls` long
);  /*Single campaign create item with create-specific defaults.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignCreateRequest` generated from model 'campaignCreateRequest'
--

CREATE TABLE IF NOT EXISTS `CampaignCreateRequest` (
  `objective_type` long NOT NULL,
  `ad_account_id` text NOT NULL /*Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.*/,
  `name` text NOT NULL /*Campaign name.*/,
  `bid_options` long,
  `intended_promotion_type` long,
  `is_automated_campaign` boolean /*Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES*/,
  `is_campaign_budget_optimization` boolean /*Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.*/,
  `is_flexible_daily_budgets` boolean /*Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.*/,
  `is_ltv_optimized` boolean /*Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.*/,
  `is_performance_plus` boolean /*Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;.*/,
  `is_top_of_search` boolean /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt;  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: &#x60;CONSIDERATION&#x60; &#x60;WEB_CONVERSION&#x60; &#x60;CATALOG_SALES&#x60;  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your &#x60;true&#x60; or &#x60;false&#x60; selection of this campaign if you &lt;a href&#x3D;\&quot;https://developer.pinterest.com/docs/api/v5/campaigns-update\&quot; target&#x3D;\&quot;blank\&quot;&gt;update it&lt;/a&gt;.*/,
  `status` long,
  `daily_spend_cap` int /*Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.*/,
  `default_ad_group_budget_in_micro_currency` int /*When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.*/,
  `end_time` int /*Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `lifetime_spend_cap` int /*Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.*/,
  `order_line_id` text /*Order line ID that appears on the invoice.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `tracking_urls` blob
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignCreateRequestAllOf1` generated from model 'campaignCreateRequestAllOf1'
--

CREATE TABLE IF NOT EXISTS `CampaignCreateRequestAllOf1` (
  `objective_type` long NOT NULL,
  `bid_options` long,
  `intended_promotion_type` long,
  `is_automated_campaign` boolean /*Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES*/,
  `is_campaign_budget_optimization` boolean /*Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.*/,
  `is_flexible_daily_budgets` boolean /*Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.*/,
  `is_ltv_optimized` boolean /*Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.*/,
  `is_performance_plus` boolean /*Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;.*/,
  `is_top_of_search` boolean /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt;  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: &#x60;CONSIDERATION&#x60; &#x60;WEB_CONVERSION&#x60; &#x60;CATALOG_SALES&#x60;  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your &#x60;true&#x60; or &#x60;false&#x60; selection of this campaign if you &lt;a href&#x3D;\&quot;https://developer.pinterest.com/docs/api/v5/campaigns-update\&quot; target&#x3D;\&quot;blank\&quot;&gt;update it&lt;/a&gt;.*/,
  `status` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignDeliveryEstimatesCampaign` generated from model 'campaignDeliveryEstimatesCampaign'
-- Campaign configuration for delivery estimates.
--

CREATE TABLE IF NOT EXISTS `CampaignDeliveryEstimatesCampaign` (
  `budget_duration_type` long NOT NULL /*Duration type of the budget*/,
  `objective_type` long NOT NULL,
  `start_date` text NOT NULL /*Start date of the date range for an ad campaign, pattern YYYY-MM-DD.*/,
  `daily_spend_cap` int /*Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.*/,
  `end_date` text /*End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.*/,
  `lifetime_spend_cap` int /*Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.*/
);  /*Campaign configuration for delivery estimates.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CampaignDeliveryEstimatesCampaignAdGroupDeliveryEstimates` generated from model 'CampaignDeliveryEstimatesCampaignAdGroupDeliveryEstimates'

CREATE TABLE IF NOT EXISTS `CampaignDeliveryEstimatesCampaignAdGroupDeliveryEstimates` (
  `campaignDeliveryEstimatesCampaign` long NOT NULL
  `adGroupDeliveryEstimates` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignDeliveryEstimatesDerivedMetrics` generated from model 'campaignDeliveryEstimatesDerivedMetrics'
-- Derived metrics for an ad campaign.
--

CREATE TABLE IF NOT EXISTS `CampaignDeliveryEstimatesDerivedMetrics` (
  `cpc` float /*Estimated cost per click.*/,
  `cpc_lower` float /*Lower estimate of the cost per click.*/,
  `cpc_upper` float /*Upper estimate of the cost per click.*/,
  `cpm` float /*Estimated cost per thousand impressions.*/,
  `cpm_lower` float /*Lower estimate of cost per thousand impressions.*/,
  `cpm_upper` float /*Upper estimate of cost per thousand impressions.*/,
  `lifetime_frequency` float /*Estimated lifetime frequency.*/,
  `lifetime_frequency_lower` float /*Lower estimate of lifetime frequency.*/,
  `lifetime_frequency_upper` float /*Upper estimate of lifetime frequency.*/,
  `lifetime_impression` float /*Estimated lifetime impressions.*/,
  `lifetime_impression_lower` float /*Lower estimate of lifetime impressions.*/,
  `lifetime_impression_upper` float /*Upper estimate of lifetime impressions.*/,
  `lifetime_reach` float /*Estimated lifetime reach.*/,
  `lifetime_reach_lower` float /*Lower estimate of lifetime reach.*/,
  `lifetime_reach_upper` float /*Upper estimate of lifetime reach.*/,
  `weekly_click` float /*Estimated weekly clicks.*/,
  `weekly_click_lower` float /*Lower estimate of weekly clicks.*/,
  `weekly_click_upper` float /*Upper estimate of weekly clicks.*/,
  `weekly_frequency` float /*Estimated weekly frequency.*/,
  `weekly_frequency_lower` float /*Lower estimate of weekly frequency.*/,
  `weekly_frequency_upper` float /*Upper estimate of weekly frequency.*/,
  `weekly_impression` float /*Estimated weekly impressions.*/,
  `weekly_impression_lower` float /*Lower estimate of weekly impressions.*/,
  `weekly_impression_upper` float /*Upper estimate of weekly impressions.*/,
  `weekly_reach` float /*Estimated weekly reach.*/,
  `weekly_reach_lower` float /*Lower estimate of weekly reach.*/,
  `weekly_reach_upper` float /*Upper estimate of weekly reach.*/
);  /*Derived metrics for an ad campaign.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignDeliveryEstimatesResponse` generated from model 'campaignDeliveryEstimatesResponse'
-- Delivery estimates response for a campaign.
--

CREATE TABLE IF NOT EXISTS `CampaignDeliveryEstimatesResponse` (
  `derived_metrics` long,
  `max_potential_spend` int /*Maximum potential spend estimate.*/
);  /*Delivery estimates response for a campaign.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CampaignDeliveryEstimatesResponseCampaignPlanningCurveEstimate` generated from model 'CampaignDeliveryEstimatesResponseCampaignPlanningCurveEstimate'

CREATE TABLE IF NOT EXISTS `CampaignDeliveryEstimatesResponseCampaignPlanningCurveEstimate` (
  `campaignDeliveryEstimatesResponse` long NOT NULL
  `campaignPlanningCurveEstimate` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignPlanningAdGroupAudienceSize` generated from model 'campaignPlanningAdGroupAudienceSize'
-- Range audience size for an ad group.
--

CREATE TABLE IF NOT EXISTS `CampaignPlanningAdGroupAudienceSize` (
  `count_lower` int UNSIGNED /*Lower bound of the audience size estimate.*/,
  `count_upper` int UNSIGNED /*Upper bound of the audience size estimate.*/
);  /*Range audience size for an ad group.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignPlanningBudgetRecommendation` generated from model 'campaignPlanningBudgetRecommendation'
-- Budget recommendation response containing recommended budget, estimated days, and point estimations.
--

CREATE TABLE IF NOT EXISTS `CampaignPlanningBudgetRecommendation` (
  `budget_recommendation` int /*The recommended budget amount.*/,
  `lifetime_days_recommendation` int /*Recommended number of days for the campaign lifetime.*/,
);  /*Budget recommendation response containing recommended budget, estimated days, and point estimations.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CampaignPlanningBudgetRecommendationCampaignPlanningExperimentBudgetRecommendation` generated from model 'CampaignPlanningBudgetRecommendationCampaignPlanningExperimentBudgetRecommendation'

CREATE TABLE IF NOT EXISTS `CampaignPlanningBudgetRecommendationCampaignPlanningExperimentBudgetRecommendation` (
  `campaignPlanningBudgetRecommendation` long NOT NULL
  `campaignPlanningExperimentBudgetRecommendation` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CampaignPlanningBudgetRecommendationCampaignPlanningBudgetRecommendationPoint` generated from model 'CampaignPlanningBudgetRecommendationCampaignPlanningBudgetRecommendationPoint'

CREATE TABLE IF NOT EXISTS `CampaignPlanningBudgetRecommendationCampaignPlanningBudgetRecommendationPoint` (
  `campaignPlanningBudgetRecommendation` long NOT NULL
  `campaignPlanningBudgetRecommendationPoint` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignPlanningBudgetRecommendationPoint` generated from model 'campaignPlanningBudgetRecommendationPoint'
-- A point estimation containing the estimate data and estimation type for a budget recommendation.
--

CREATE TABLE IF NOT EXISTS `CampaignPlanningBudgetRecommendationPoint` (
  `estimation_type` long /*Estimation type for this point.*/,
  `point_estimate` long /*Point estimate data.*/
);  /*A point estimation containing the estimate data and estimation type for a budget recommendation.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignPlanningConfidenceLevelAlert` generated from model 'campaignPlanningConfidenceLevelAlert'
-- A confidence level alert for the delivery estimates provided in the response.
--

CREATE TABLE IF NOT EXISTS `CampaignPlanningConfidenceLevelAlert` (
  `description` text /*Human-readable context for debugging. Not intended for display to end users.*/,
  `reason` long /*Reason for the confidence level alert.*/,
  `severity` long /*Severity of the confidence level alert.*/
);  /*A confidence level alert for the delivery estimates provided in the response.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignPlanningConversionAttribution` generated from model 'campaignPlanningConversionAttribution'
-- Attribution windows for a conversion event.
--

CREATE TABLE IF NOT EXISTS `CampaignPlanningConversionAttribution` (
  `click_window_days` long /*Number of days to use as the conversion attribution window for a pin click action.*/,
  `engagement_window_days` long /*Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.*/,
  `view_window_days` long /*Number of days to use as the conversion attribution window for a view action.*/
);  /*Attribution windows for a conversion event.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignPlanningConversionRate` generated from model 'campaignPlanningConversionRate'
-- Conversion rate estimate for a specific conversion event and attribution window combination.
--

CREATE TABLE IF NOT EXISTS `CampaignPlanningConversionRate` (
  `attribution_windows` long NOT NULL,
  `conversion_event` long NOT NULL,
  `conversion_rate` float NOT NULL /*Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.*/
);  /*Conversion rate estimate for a specific conversion event and attribution window combination.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignPlanningCurveEstimate` generated from model 'campaignPlanningCurveEstimate'
--

CREATE TABLE IF NOT EXISTS `CampaignPlanningCurveEstimate` (
  `estimation_type` long /*Estimation type for campaign planning estimated curve*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CampaignPlanningCurveEstimateCampaignPlanningPointEstimate` generated from model 'CampaignPlanningCurveEstimateCampaignPlanningPointEstimate'

CREATE TABLE IF NOT EXISTS `CampaignPlanningCurveEstimateCampaignPlanningPointEstimate` (
  `campaignPlanningCurveEstimate` long NOT NULL
  `campaignPlanningPointEstimate` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignPlanningExperimentBudgetRecommendation` generated from model 'campaignPlanningExperimentBudgetRecommendation'
-- Experimental budget recommendation for a single experiment version.
--

CREATE TABLE IF NOT EXISTS `CampaignPlanningExperimentBudgetRecommendation` (
  `budget_recommendation` int /*Recommended budget for this experiment version.*/,
  `lifetime_days_recommendation` int /*Recommended lifetime days for this experiment.*/,
  `version_id` text /*Version identifier for the experiment.*/
);  /*Experimental budget recommendation for a single experiment version.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CampaignPlanningExperimentBudgetRecommendationCampaignPlanningBudgetRecommendationPoint` generated from model 'CampaignPlanningExperimentBudgetRecommendationCampaignPlanningBudgetRecommendationPoint'

CREATE TABLE IF NOT EXISTS `CampaignPlanningExperimentBudgetRecommendationCampaignPlanningBudgetRecommendationPoint` (
  `campaignPlanningExperimentBudgetRecommendation` long NOT NULL
  `campaignPlanningBudgetRecommendationPoint` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignPlanningPointEstimate` generated from model 'campaignPlanningPointEstimate'
-- A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
--

CREATE TABLE IF NOT EXISTS `CampaignPlanningPointEstimate` (
  `budget` int NOT NULL /*The budget value of the point.*/,
  `double_y` double NOT NULL /*Y value as a decimal.*/,
  `max_y` int NOT NULL /*The maximum Y value of the point.*/,
  `min_y` int NOT NULL /*The minimum Y value of the point.*/,
  `y` int NOT NULL /*The expected Y value of the point.*/
);  /*A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignPlanningResponseError` generated from model 'campaignPlanningResponseError'
-- Error encountered while estimating delivery for a campaign.
--

CREATE TABLE IF NOT EXISTS `CampaignPlanningResponseError` (
  `code` long,
  `message` text /*Human-readable error message.*/
);  /*Error encountered while estimating delivery for a campaign.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignUpdateRequest` generated from model 'campaignUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `CampaignUpdateRequest` (
  `ad_account_id` text NOT NULL /*Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.*/,
  `id` text NOT NULL PRIMARY KEY /*Campaign ID.*/,
  `bid_options` long,
  `intended_promotion_type` long,
  `is_ltv_optimized` boolean /*Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.*/,
  `is_performance_plus` boolean /*Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. This field is immutable, except only for campaigns in draft status which may update this field.*/,
  `is_top_of_search` boolean /*Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.*/,
  `objective_type` long,
  `daily_spend_cap` int /*Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.*/,
  `default_ad_group_budget_in_micro_currency` int /*When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.*/,
  `end_time` int /*Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `is_automated_campaign` boolean /*Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES*/,
  `is_campaign_budget_optimization` boolean /*Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.*/,
  `is_flexible_daily_budgets` boolean /*Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.*/,
  `lifetime_spend_cap` int /*Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.*/,
  `name` text /*Campaign name.*/,
  `order_line_id` text /*Order line ID that appears on the invoice.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `status` long,
  `tracking_urls` blob
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignUpdateRequestAllOf2` generated from model 'campaignUpdateRequestAllOf2'
--

CREATE TABLE IF NOT EXISTS `CampaignUpdateRequestAllOf2` (
  `bid_options` long,
  `intended_promotion_type` long,
  `is_ltv_optimized` boolean /*Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.*/,
  `is_performance_plus` boolean /*Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. This field is immutable, except only for campaigns in draft status which may update this field.*/,
  `is_top_of_search` boolean /*Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.*/,
  `objective_type` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignsAnalyticsMetrics` generated from model 'campaignsAnalyticsMetrics'
--

CREATE TABLE IF NOT EXISTS `CampaignsAnalyticsMetrics` (
  `CAMPAIGN_ID` text /*The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true.*/,
  `DATE` date /*Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `campaigns_list_200_response` generated from model 'campaignsList200Response'
--

CREATE TABLE IF NOT EXISTS `campaigns_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CampaignsList200ResponseCampaign` generated from model 'CampaignsList200ResponseCampaign'

CREATE TABLE IF NOT EXISTS `CampaignsList200ResponseCampaign` (
  `campaignsList200Response` long NOT NULL
  `campaign` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CancelInviteException` generated from model 'cancelInviteException'
-- An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
--

CREATE TABLE IF NOT EXISTS `CancelInviteException` (
  `invite_id` text,
  `message` text
);  /*An exception object if there is an error performing the cancellation. It will only be provided if there is an error.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CancelInviteResult` generated from model 'cancelInviteResult'
--

CREATE TABLE IF NOT EXISTS `CancelInviteResult` (
  `id` text PRIMARY KEY,
  `invite_data` long,
  `is_received_invite` boolean,
  `user` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CancelInviteResultItem` generated from model 'cancelInviteResultItem'
--

CREATE TABLE IF NOT EXISTS `CancelInviteResultItem` (
  `exception` long,
  `invite` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CancelInviteResultUser` generated from model 'cancelInviteResultUser'
-- Metadata of the member/partner that has access to the asset.
--

CREATE TABLE IF NOT EXISTS `CancelInviteResultUser` (
  `email` text /*Email of the business member/partner.*/,
  `id` text PRIMARY KEY /*Unique identifier of the business member/partner.*/,
  `username` text /*Username of the business member/partner.*/
);  /*Metadata of the member/partner that has access to the asset.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CancelInvitesRequest` generated from model 'cancelInvitesRequest'
-- An object with the list of invite/request ids to cancel.
--

CREATE TABLE IF NOT EXISTS `CancelInvitesRequest` (
);  /*An object with the list of invite/request ids to cancel.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CancelInvitesRequestInviteIds` generated from model 'CancelInvitesRequestInviteIds'

CREATE TABLE IF NOT EXISTS `CancelInvitesRequestInviteIds` (
  `cancelInvitesRequest` long NOT NULL
  `inviteIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CancelInvitesResponse` generated from model 'cancelInvitesResponse'
--

CREATE TABLE IF NOT EXISTS `CancelInvitesResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CancelInvitesResponseCancelInviteResultItem` generated from model 'CancelInvitesResponseCancelInviteResultItem'

CREATE TABLE IF NOT EXISTS `CancelInvitesResponseCancelInviteResultItem` (
  `cancelInvitesResponse` long NOT NULL
  `cancelInviteResultItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CarouselSlot` generated from model 'carouselSlot'
--

CREATE TABLE IF NOT EXISTS `CarouselSlot` (
  `description` text /*Carousel Pin slot description.*/,
  `link` text /*Carousel Pin slot link.*/,
  `title` text /*Carousel Pin slot title.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CartingProduct` generated from model 'cartingProduct'
--

CREATE TABLE IF NOT EXISTS `CartingProduct` (
  `carting_product_id` text NOT NULL /*the internal Pinterest carting product id (different from industry product id)*/,
  `display_preferred_retailers_only` boolean /*Whether to display only the preferred retailers for the carting product*/,
  `display_product_price` boolean /*Whether to display the price for the carting product*/,
  `randomize_preferred_retailers` boolean /*Whether to randomize preferred retailers for the carting product*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CartingProductCartingRetailer` generated from model 'CartingProductCartingRetailer'

CREATE TABLE IF NOT EXISTS `CartingProductCartingRetailer` (
  `cartingProduct` long NOT NULL
  `cartingRetailer` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CartingRetailer` generated from model 'cartingRetailer'
--

CREATE TABLE IF NOT EXISTS `CartingRetailer` (
  `retailer_id` text NOT NULL /*Unique identifier for the retailer*/,
  `retailer_name` text NOT NULL /*Name of the retailer*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Catalog` generated from model 'catalog'
-- Catalog entity
--

CREATE TABLE IF NOT EXISTS `Catalog` (
  `catalog_type` long NOT NULL,
  `created_at` datetime NOT NULL,
  `id` text NOT NULL PRIMARY KEY /*ID of the catalog entity.*/,
  `name` text NOT NULL /*A human-friendly name associated to a catalog entity.*/,
  `updated_at` datetime NOT NULL
);  /*Catalog entity*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogBinding` generated from model 'catalogBinding'
-- Information about a catalog asset.
--

CREATE TABLE IF NOT EXISTS `CatalogBinding` (
  `catalog_type` text /*Catalog type*/,
  `id` text PRIMARY KEY /*Catalog ID.*/,
  `name` text /*Catalog name*/
);  /*Information about a catalog asset.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogCreate` generated from model 'catalogCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `CatalogCreate` (
  `catalog_type` long NOT NULL,
  `name` text NOT NULL /*A human-friendly name associated to a catalog entity.*/
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogUpdate` generated from model 'catalogUpdate'
-- Resource create or update operation model.
--

CREATE TABLE IF NOT EXISTS `CatalogUpdate` (
  `catalog_type` long,
  `name` text /*A human-friendly name associated to a catalog entity.*/
);  /*Resource create or update operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsAiContentDisclosure` generated from model 'catalogsAiContentDisclosure'
-- AI content disclosure for a single asset of a catalog item.
--

CREATE TABLE IF NOT EXISTS `CatalogsAiContentDisclosure` (
  `url` text NOT NULL /*URL of the asset. Must match one of image_link, additional_image_link, or video_link.*/
);  /*AI content disclosure for a single asset of a catalog item.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsAiContentDisclosureCatalogsAiContentDisclosureLabel` generated from model 'CatalogsAiContentDisclosureCatalogsAiContentDisclosureLabel'

CREATE TABLE IF NOT EXISTS `CatalogsAiContentDisclosureCatalogsAiContentDisclosureLabel` (
  `catalogsAiContentDisclosure` long NOT NULL
  `catalogsAiContentDisclosureLabel` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsAvailableFilterValues` generated from model 'catalogsAvailableFilterValues'
-- Object holding available filter values for each filter key
--

CREATE TABLE IF NOT EXISTS `CatalogsAvailableFilterValues` (
  `catalog_type` text NOT NULL,
  `filter_values` long NOT NULL
);  /*Object holding available filter values for each filter key*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsBaseFilterKeys` generated from model 'catalogsBaseFilterKeys'
-- Base filter keys shared across catalog filtering
--

CREATE TABLE IF NOT EXISTS `CatalogsBaseFilterKeys` (
  `MIN_PRICE` long NOT NULL,
  `MAX_PRICE` long NOT NULL,
  `CURRENCY` long NOT NULL,
  `ITEM_ID` long NOT NULL,
  `AVAILABILITY` long NOT NULL,
  `BRAND` long NOT NULL,
  `CONDITION` long NOT NULL,
  `CUSTOM_LABEL_0` long NOT NULL,
  `CUSTOM_LABEL_1` long NOT NULL,
  `CUSTOM_LABEL_2` long NOT NULL,
  `CUSTOM_LABEL_3` long NOT NULL,
  `CUSTOM_LABEL_4` long NOT NULL,
  `ITEM_GROUP_ID` long NOT NULL,
  `GENDER` long NOT NULL,
  `MEDIA_TYPE` long NOT NULL,
  `PRODUCT_TYPE_4` long NOT NULL,
  `PRODUCT_TYPE_3` long NOT NULL,
  `PRODUCT_TYPE_2` long NOT NULL,
  `PRODUCT_TYPE_1` long NOT NULL,
  `PRODUCT_TYPE_0` long NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_6` long NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_5` long NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_4` long NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_3` long NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_2` long NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_1` long NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_0` long NOT NULL,
  `CUSTOM_NUMBER_0` long NOT NULL,
  `CUSTOM_NUMBER_1` long NOT NULL,
  `CUSTOM_NUMBER_2` long NOT NULL,
  `CUSTOM_NUMBER_3` long NOT NULL,
  `CUSTOM_NUMBER_4` long NOT NULL,
  `TITLE_KEYWORDS` long NOT NULL,
  `PINTEREST_PRODUCT_CATEGORIES` long NOT NULL
);  /*Base filter keys shared across catalog filtering*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsBaseFiltersAllOf` generated from model 'catalogsBaseFiltersAllOf'
--

CREATE TABLE IF NOT EXISTS `CatalogsBaseFiltersAllOf` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsBaseFiltersAllOfCatalogsBaseFilterKeys` generated from model 'CatalogsBaseFiltersAllOfCatalogsBaseFilterKeys'

CREATE TABLE IF NOT EXISTS `CatalogsBaseFiltersAllOfCatalogsBaseFilterKeys` (
  `catalogsBaseFiltersAllOf` long NOT NULL
  `catalogsBaseFilterKeys` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsBaseFiltersAnyOf` generated from model 'catalogsBaseFiltersAnyOf'
--

CREATE TABLE IF NOT EXISTS `CatalogsBaseFiltersAnyOf` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsBaseFiltersAnyOfCatalogsBaseFilterKeys` generated from model 'CatalogsBaseFiltersAnyOfCatalogsBaseFilterKeys'

CREATE TABLE IF NOT EXISTS `CatalogsBaseFiltersAnyOfCatalogsBaseFilterKeys` (
  `catalogsBaseFiltersAnyOf` long NOT NULL
  `catalogsBaseFilterKeys` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreateCreativeAssetsItem` generated from model 'catalogsCreateCreativeAssetsItem'
-- A creative assets item to be created.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreateCreativeAssetsItem` (
  `attributes` long NOT NULL,
  `creative_assets_id` text NOT NULL /*The catalog creative assets id in the merchant namespace*/,
  `operation` text NOT NULL
);  /*A creative assets item to be created.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreateHotelItem` generated from model 'catalogsCreateHotelItem'
-- A hotel item to be created.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreateHotelItem` (
  `attributes` long NOT NULL,
  `hotel_id` text NOT NULL /*The catalog hotel id in the merchant namespace*/,
  `operation` text NOT NULL
);  /*A hotel item to be created.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreateReportResponse` generated from model 'catalogsCreateReportResponse'
--

CREATE TABLE IF NOT EXISTS `CatalogsCreateReportResponse` (
  `token` text /*Token to be used to get the report*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreateRetailItem` generated from model 'catalogsCreateRetailItem'
-- An item to be created
--

CREATE TABLE IF NOT EXISTS `CatalogsCreateRetailItem` (
  `attributes` long NOT NULL,
  `item_id` text NOT NULL /*The catalog item id in the merchant namespace*/,
  `operation` text NOT NULL
);  /*An item to be created*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsAttributes` generated from model 'catalogsCreativeAssetsAttributes'
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsAttributes` (
  `android_deep_link` text /*Link to the creative assets page.*/,
  `custom_label_0` text /*Custom grouping of creative assets.*/,
  `custom_label_1` text /*Custom grouping of creative assets.*/,
  `custom_label_2` text /*Custom grouping of creative assets.*/,
  `custom_label_3` text /*Custom grouping of creative assets.*/,
  `custom_label_4` text /*Custom grouping of creative assets.*/,
  `description` text /*Brief description of the creative assets.*/,
  `google_product_category` text /*The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.*/,
  `ios_deep_link` text /*IOS deep link to the creative assets page.*/,
  `link` text /*Link to the creative assets page.*/,
  `title` text /*The name of the creative assets.*/,
  `visibility` text /*Visibility of the creative assets. Must be one of the following values (upper or lowercase): &#39;visible&#39;, &#39;hidden&#39;.*/,
  `image_link` text /*The creative assets image.*/,
  `video_link` text /*The creative assets video.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsAttributesCatalogsAiContentDisclosure` generated from model 'CatalogsCreativeAssetsAttributesCatalogsAiContentDisclosure'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsAttributesCatalogsAiContentDisclosure` (
  `catalogsCreativeAssetsAttributes` long NOT NULL
  `catalogsAiContentDisclosure` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsAvailableFilterValues` generated from model 'catalogsCreativeAssetsAvailableFilterValues'
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsAvailableFilterValues` (
  `catalog_type` text NOT NULL,
  `filter_values` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsBatchItem` generated from model 'catalogsCreativeAssetsBatchItem'
-- Creative assets batch item
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsBatchItem` (
  `attributes` long NOT NULL,
  `creative_assets_id` text NOT NULL /*The catalog creative assets id in the merchant namespace*/,
  `operation` text NOT NULL
);  /*Creative assets batch item*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsBatchRequest` generated from model 'catalogsCreativeAssetsBatchRequest'
-- Request object to update catalogs creative assets items
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsBatchRequest` (
  `catalog_type` text NOT NULL,
  `country` long NOT NULL,
  `language` text NOT NULL /*We recommend using the CatalogsLocale values.*/,
  `catalog_id` text /*Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog*/
);  /*Request object to update catalogs creative assets items*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsBatchRequestCatalogsCreativeAssetsBatchItem` generated from model 'CatalogsCreativeAssetsBatchRequestCatalogsCreativeAssetsBatchItem'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsBatchRequestCatalogsCreativeAssetsBatchItem` (
  `catalogsCreativeAssetsBatchRequest` long NOT NULL
  `catalogsCreativeAssetsBatchItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsFeed` generated from model 'catalogsCreativeAssetsFeed'
-- Catalogs Creative Asset Feed object
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFeed` (
  `catalog_id` text NOT NULL /*Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.*/,
  `catalog_type` text NOT NULL,
  `created_at` datetime NOT NULL,
  `default_country` long NOT NULL,
  `default_locale` text NOT NULL /*The locale used within a feed for product descriptions.*/,
  `format` long NOT NULL,
  `id` text NOT NULL PRIMARY KEY /*ID of the feed entity.*/,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text NOT NULL /*A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.*/,
  `status` long NOT NULL,
  `updated_at` datetime NOT NULL,
  `credentials` long,
  `default_currency` long,
  `preferred_processing_schedule` long
);  /*Catalogs Creative Asset Feed object*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsFeedsCreateRequest` generated from model 'catalogsCreativeAssetsFeedsCreateRequest'
-- Request object for creating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFeedsCreateRequest` (
  `catalog_type` text NOT NULL,
  `default_country` long NOT NULL,
  `default_locale` long NOT NULL,
  `format` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text NOT NULL /*A human-friendly name associated to a given feed.*/,
  `catalog_id` text /*Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.*/,
  `credentials` long,
  `default_currency` long,
  `preferred_processing_schedule` long,
  `status` long
);  /*Request object for creating a feed.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsFeedsUpdateRequest` generated from model 'catalogsCreativeAssetsFeedsUpdateRequest'
-- Request object for updating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFeedsUpdateRequest` (
  `catalog_type` text NOT NULL,
  `credentials` long,
  `default_currency` long,
  `format` long,
  `location` text /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text /*A human-friendly name associated to a given feed.*/,
  `preferred_processing_schedule` long,
  `status` long
);  /*Request object for updating a feed.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsFilterValuesMap` generated from model 'catalogsCreativeAssetsFilterValuesMap'
-- A map of filter attributes to their available values.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFilterValuesMap` (
);  /*A map of filter attributes to their available values.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsFilterValuesMapCustomLabel0` generated from model 'CatalogsCreativeAssetsFilterValuesMapCustomLabel0'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFilterValuesMapCustomLabel0` (
  `catalogsCreativeAssetsFilterValuesMap` long NOT NULL
  `customLabel0` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsFilterValuesMapCustomLabel1` generated from model 'CatalogsCreativeAssetsFilterValuesMapCustomLabel1'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFilterValuesMapCustomLabel1` (
  `catalogsCreativeAssetsFilterValuesMap` long NOT NULL
  `customLabel1` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsFilterValuesMapCustomLabel2` generated from model 'CatalogsCreativeAssetsFilterValuesMapCustomLabel2'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFilterValuesMapCustomLabel2` (
  `catalogsCreativeAssetsFilterValuesMap` long NOT NULL
  `customLabel2` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsFilterValuesMapCustomLabel3` generated from model 'CatalogsCreativeAssetsFilterValuesMapCustomLabel3'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFilterValuesMapCustomLabel3` (
  `catalogsCreativeAssetsFilterValuesMap` long NOT NULL
  `customLabel3` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsFilterValuesMapCustomLabel4` generated from model 'CatalogsCreativeAssetsFilterValuesMapCustomLabel4'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFilterValuesMapCustomLabel4` (
  `catalogsCreativeAssetsFilterValuesMap` long NOT NULL
  `customLabel4` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsFilterValuesMapGoogleProductCategory0` generated from model 'CatalogsCreativeAssetsFilterValuesMapGoogleProductCategory0'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFilterValuesMapGoogleProductCategory0` (
  `catalogsCreativeAssetsFilterValuesMap` long NOT NULL
  `googleProductCategory0` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsFilterValuesMapGoogleProductCategory1` generated from model 'CatalogsCreativeAssetsFilterValuesMapGoogleProductCategory1'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFilterValuesMapGoogleProductCategory1` (
  `catalogsCreativeAssetsFilterValuesMap` long NOT NULL
  `googleProductCategory1` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsFilterValuesMapGoogleProductCategory2` generated from model 'CatalogsCreativeAssetsFilterValuesMapGoogleProductCategory2'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFilterValuesMapGoogleProductCategory2` (
  `catalogsCreativeAssetsFilterValuesMap` long NOT NULL
  `googleProductCategory2` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsFilterValuesMapGoogleProductCategory3` generated from model 'CatalogsCreativeAssetsFilterValuesMapGoogleProductCategory3'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFilterValuesMapGoogleProductCategory3` (
  `catalogsCreativeAssetsFilterValuesMap` long NOT NULL
  `googleProductCategory3` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsFilterValuesMapGoogleProductCategory4` generated from model 'CatalogsCreativeAssetsFilterValuesMapGoogleProductCategory4'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFilterValuesMapGoogleProductCategory4` (
  `catalogsCreativeAssetsFilterValuesMap` long NOT NULL
  `googleProductCategory4` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsFilterValuesMapGoogleProductCategory5` generated from model 'CatalogsCreativeAssetsFilterValuesMapGoogleProductCategory5'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFilterValuesMapGoogleProductCategory5` (
  `catalogsCreativeAssetsFilterValuesMap` long NOT NULL
  `googleProductCategory5` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsFilterValuesMapGoogleProductCategory6` generated from model 'CatalogsCreativeAssetsFilterValuesMapGoogleProductCategory6'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFilterValuesMapGoogleProductCategory6` (
  `catalogsCreativeAssetsFilterValuesMap` long NOT NULL
  `googleProductCategory6` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsFilterValuesMapMediaType` generated from model 'CatalogsCreativeAssetsFilterValuesMapMediaType'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFilterValuesMapMediaType` (
  `catalogsCreativeAssetsFilterValuesMap` long NOT NULL
  `mediaType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsItemErrorResponse` generated from model 'catalogsCreativeAssetsItemErrorResponse'
-- Object describing a creative assets item error
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsItemErrorResponse` (
  `catalog_type` text NOT NULL,
  `item_response_kind` text NOT NULL /*Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.*/,
  `creative_assets_id` text /*The catalog creative assets id in the merchant namespace*/
);  /*Object describing a creative assets item error*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsItemErrorResponseItemValidationEvent` generated from model 'CatalogsCreativeAssetsItemErrorResponseItemValidationEvent'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsItemErrorResponseItemValidationEvent` (
  `catalogsCreativeAssetsItemErrorResponse` long NOT NULL
  `itemValidationEvent` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsItemResponse` generated from model 'catalogsCreativeAssetsItemResponse'
-- Object describing a creative assets item record
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsItemResponse` (
  `catalog_type` text NOT NULL,
  `item_response_kind` text NOT NULL /*Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.*/,
  `attributes` long,
  `creative_assets_id` text /*The catalog creative assets id in the merchant namespace*/,
);  /*Object describing a creative assets item record*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsItemResponsePin` generated from model 'CatalogsCreativeAssetsItemResponsePin'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsItemResponsePin` (
  `catalogsCreativeAssetsItemResponse` long NOT NULL
  `pin` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsItemsBatch` generated from model 'catalogsCreativeAssetsItemsBatch'
-- Object describing the catalogs creative assets items batch
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsItemsBatch` (
  `catalog_type` text NOT NULL,
  `batch_id` text /*Id of the catalogs items batch*/,
  `completed_time` datetime /*Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss*/,
  `created_time` datetime /*Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss*/,
  `status` long
);  /*Object describing the catalogs creative assets items batch*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsItemsBatchCreativeAssetsProcessingRecord` generated from model 'CatalogsCreativeAssetsItemsBatchCreativeAssetsProcessingRecord'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsItemsBatchCreativeAssetsProcessingRecord` (
  `catalogsCreativeAssetsItemsBatch` long NOT NULL
  `creativeAssetsProcessingRecord` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsItemsPostFilter` generated from model 'catalogsCreativeAssetsItemsPostFilter'
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsItemsPostFilter` (
  `catalog_type` text NOT NULL,
  `catalog_id` text /*Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsItemsPostFilterCreativeAssetsIds` generated from model 'CatalogsCreativeAssetsItemsPostFilterCreativeAssetsIds'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsItemsPostFilterCreativeAssetsIds` (
  `catalogsCreativeAssetsItemsPostFilter` long NOT NULL
  `creativeAssetsIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest` generated from model 'catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest'
-- Request object to list products for a given creative assets catalog_id and product group filter.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest` (
  `catalog_id` text NOT NULL /*Catalog ID pertaining to the product group.*/,
  `catalog_type` text NOT NULL,
  `filters` long NOT NULL
);  /*Request object to list products for a given creative assets catalog_id and product group filter.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsProduct` generated from model 'catalogsCreativeAssetsProduct'
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProduct` (
  `catalog_type` text NOT NULL,
  `metadata` long NOT NULL,
  `pin` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsProductGroup` generated from model 'catalogsCreativeAssetsProductGroup'
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductGroup` (
  `catalog_id` text NOT NULL /*Catalog ID pertaining to the product group.*/,
  `catalog_type` text NOT NULL,
  `filters` long NOT NULL,
  `id` text NOT NULL PRIMARY KEY /*ID of the catalog product group.*/,
  `created_at` int /*Unix timestamp in seconds of when catalog product group was created.*/,
  `description` text,
  `name` text /*Name of catalog product group*/,
  `updated_at` int /*Unix timestamp in seconds of last time catalog product group was updated.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsProductGroupCreateRequest` generated from model 'catalogsCreativeAssetsProductGroupCreateRequest'
-- Request object for creating a creative assets product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductGroupCreateRequest` (
  `catalog_id` text NOT NULL /*Catalog ID pertaining to the product group.*/,
  `catalog_type` text NOT NULL,
  `filters` long NOT NULL,
  `name` text NOT NULL,
  `description` text
);  /*Request object for creating a creative assets product group.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsProductGroupFilterKeys` generated from model 'catalogsCreativeAssetsProductGroupFilterKeys'
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductGroupFilterKeys` (
  `CREATIVE_ASSETS_ID` long NOT NULL,
  `CUSTOM_LABEL_0` long NOT NULL,
  `CUSTOM_LABEL_1` long NOT NULL,
  `CUSTOM_LABEL_2` long NOT NULL,
  `CUSTOM_LABEL_3` long NOT NULL,
  `CUSTOM_LABEL_4` long NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_6` long NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_5` long NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_4` long NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_3` long NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_2` long NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_1` long NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_0` long NOT NULL,
  `MEDIA_TYPE` long NOT NULL,
  `TITLE_KEYWORDS` long NOT NULL,
  `LINK` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsProductGroupFilters` generated from model 'catalogsCreativeAssetsProductGroupFilters'
-- Object holding a group of filters for a creative assets product group
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductGroupFilters` (
);  /*Object holding a group of filters for a creative assets product group*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsProductGroupFiltersCatalogsCreativeAssetsProductGroupFilterKeys` generated from model 'CatalogsCreativeAssetsProductGroupFiltersCatalogsCreativeAssetsProductGroupFilterKeys'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductGroupFiltersCatalogsCreativeAssetsProductGroupFilterKeys` (
  `catalogsCreativeAssetsProductGroupFilters` long NOT NULL
  `catalogsCreativeAssetsProductGroupFilterKeys` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsProductGroupFiltersCatalogsCreativeAssetsProductGroupFilterKeys` generated from model 'CatalogsCreativeAssetsProductGroupFiltersCatalogsCreativeAssetsProductGroupFilterKeys'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductGroupFiltersCatalogsCreativeAssetsProductGroupFilterKeys` (
  `catalogsCreativeAssetsProductGroupFilters` long NOT NULL
  `catalogsCreativeAssetsProductGroupFilterKeys` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsProductGroupFiltersAllOf` generated from model 'catalogsCreativeAssetsProductGroupFiltersAllOf'
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductGroupFiltersAllOf` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsProductGroupFiltersAllOfCatalogsCreativeAssetsProductGroupFilterKeys` generated from model 'CatalogsCreativeAssetsProductGroupFiltersAllOfCatalogsCreativeAssetsProductGroupFilterKeys'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductGroupFiltersAllOfCatalogsCreativeAssetsProductGroupFilterKeys` (
  `catalogsCreativeAssetsProductGroupFiltersAllOf` long NOT NULL
  `catalogsCreativeAssetsProductGroupFilterKeys` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsProductGroupFiltersAnyOf` generated from model 'catalogsCreativeAssetsProductGroupFiltersAnyOf'
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductGroupFiltersAnyOf` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsProductGroupFiltersAnyOfCatalogsCreativeAssetsProductGroupFilterKeys` generated from model 'CatalogsCreativeAssetsProductGroupFiltersAnyOfCatalogsCreativeAssetsProductGroupFilterKeys'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductGroupFiltersAnyOfCatalogsCreativeAssetsProductGroupFilterKeys` (
  `catalogsCreativeAssetsProductGroupFiltersAnyOf` long NOT NULL
  `catalogsCreativeAssetsProductGroupFilterKeys` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsProductGroupProductCounts` generated from model 'catalogsCreativeAssetsProductGroupProductCounts'
-- Product counts for a Creative Assets CatalogsProductGroup
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductGroupProductCounts` (
  `app_links` decimal NOT NULL,
  `catalog_type` text NOT NULL,
  `images` decimal NOT NULL,
  `total` decimal NOT NULL,
  `videos` decimal NOT NULL
);  /*Product counts for a Creative Assets CatalogsProductGroup*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsProductGroupUpdateRequest` generated from model 'catalogsCreativeAssetsProductGroupUpdateRequest'
-- Request object for updating a creative assets product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductGroupUpdateRequest` (
  `catalog_type` text,
  `description` text,
  `filters` long,
  `name` text /*Name of catalog product group*/
);  /*Request object for updating a creative assets product group.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsProductMetadata` generated from model 'catalogsCreativeAssetsProductMetadata'
-- Creative assets product metadata entity
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductMetadata` (
  `creative_assets_id` text NOT NULL /*The user-created unique ID that represents the creative assets item.*/,
  `visibility` long NOT NULL
);  /*Creative assets product metadata entity*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsDeleteCreativeAssetsItem` generated from model 'catalogsDeleteCreativeAssetsItem'
-- A creative assets item to be deleted
--

CREATE TABLE IF NOT EXISTS `CatalogsDeleteCreativeAssetsItem` (
  `creative_assets_id` text NOT NULL /*The catalog creative assets id in the merchant namespace*/,
  `operation` text NOT NULL
);  /*A creative assets item to be deleted*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsDeleteHotelItem` generated from model 'catalogsDeleteHotelItem'
-- A hotel item to be deleted
--

CREATE TABLE IF NOT EXISTS `CatalogsDeleteHotelItem` (
  `hotel_id` text NOT NULL /*The catalog hotel id in the merchant namespace*/,
  `operation` text NOT NULL
);  /*A hotel item to be deleted*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsDeleteRetailItem` generated from model 'catalogsDeleteRetailItem'
-- An item to be deleted
--

CREATE TABLE IF NOT EXISTS `CatalogsDeleteRetailItem` (
  `item_id` text NOT NULL /*The catalog item id in the merchant namespace*/,
  `operation` text NOT NULL,
  `last_updated_time` long /*The millisecond timestamp when the item was lastly modified by the merchant.*/
);  /*An item to be deleted*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeed` generated from model 'catalogsFeed'
-- Catalogs Feed object
--

CREATE TABLE IF NOT EXISTS `CatalogsFeed` (
  `catalog_type` text NOT NULL,
  `created_at` datetime NOT NULL,
  `default_country` long NOT NULL,
  `default_locale` text NOT NULL /*The locale used within a feed for product descriptions.*/,
  `format` long NOT NULL,
  `id` text NOT NULL PRIMARY KEY /*ID of the feed entity.*/,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text NOT NULL /*A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.*/,
  `status` long NOT NULL,
  `updated_at` datetime NOT NULL,
  `catalog_id` text NOT NULL /*Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.*/,
  `credentials` long,
  `default_availability` long,
  `default_currency` long,
  `preferred_processing_schedule` long
);  /*Catalogs Feed object*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedCreateRequestSchema` generated from model 'catalogsFeedCreateRequestSchema'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedCreateRequestSchema` (
  `catalog_type` text NOT NULL,
  `format` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text NOT NULL /*A human-friendly name associated to a given feed.*/,
  `catalog_id` text /*Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.*/,
  `credentials` long,
  `default_availability` long,
  `default_country` long,
  `default_currency` long,
  `default_locale` long,
  `preferred_processing_schedule` long,
  `status` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedCredentials` generated from model 'catalogsFeedCredentials'
-- This field is **OPTIONAL**. Use this if your feed file requires username and password.
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedCredentials` (
  `password` text NOT NULL /*The required password for downloading a feed.*/,
  `username` text NOT NULL /*The required username for downloading a feed.*/
);  /*This field is **OPTIONAL**. Use this if your feed file requires username and password.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedIngestion` generated from model 'catalogsFeedIngestion'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedIngestion` (
  `created_at` datetime NOT NULL /*Timestamp of the feed ingestion.*/,
  `feed_id` text NOT NULL /*Catalog Feed id pertaining to the feed ingestion.*/,
  `id` text NOT NULL PRIMARY KEY /*Unique identifier of a feed ingestion.*/,
  `status` long NOT NULL /*Status of the feed ingestion.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedIngestionDetails` generated from model 'catalogsFeedIngestionDetails'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedIngestionDetails` (
  `errors` long NOT NULL,
  `info` long NOT NULL,
  `warnings` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedIngestionErrors` generated from model 'catalogsFeedIngestionErrors'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedIngestionErrors` (
  `ACCOUNT_FLAGGED` int /*We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.*/,
  `FETCH_GOOGLE_SHEET_NOT_SHARED` int /*Update your Google Sheets sharing settings to &#39;Anyone with link&#39; as a Viewer so that Pinterest can access your file.*/,
  `IMAGE_FILE_NOT_ACCESSIBLE` int /*Image files are unreadable. Please upload new files to continue.*/,
  `IMAGE_FILE_NOT_FOUND` int /*Image files are unreadable. Please upload new files to continue.*/,
  `IMAGE_INVALID_FILE` int /*Image files are unreadable. Please upload new files to continue.*/,
  `IMAGE_LEVEL_INTERNAL_ERROR` int /*We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.*/,
  `IMAGE_MALFORMED_URL` int /*Image files are unreadable. Please check your link and upload new files to continue.*/,
  `LARGE_PRODUCT_COUNT_DECREASE` int /*The product count has decreased by more than 99% compared to the last successful ingestion.*/,
  `LINE_LEVEL_INTERNAL_ERROR` int /*We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedIngestionInfo` generated from model 'catalogsFeedIngestionInfo'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedIngestionInfo` (
  `IN_STOCK` int /*The number of ingested products that are in stock.*/,
  `OUT_OF_STOCK` int /*The number of ingested products that are in out of stock.*/,
  `PREORDER` int /*The number of ingested products that are in preorder.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedIngestionWarnings` generated from model 'catalogsFeedIngestionWarnings'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedIngestionWarnings` (
  `AD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_FILE_NOT_FOUND` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_400` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_403` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_404` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_405` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_410` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_429` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_500` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_502` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_503` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_504` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_507` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_508` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_520` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_521` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_522` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_HTTP_STATUS_525` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR` int /*We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.*/,
  `AD_IMAGE_DOWNLOAD_INTERNAL_ERROR` int /*We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.*/,
  `AD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD` int /*We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.*/,
  `AD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED` int /*We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.*/,
  `AD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED` int /*We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.*/,
  `AD_IMAGE_DOWNLOAD_INVALID_FILE` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_SITE_ERROR` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_SITE_TIMEOUT` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_SSL_ERROR` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_PROCESSING_EMPTY_FILE` int /*Ad image files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL` int /*Ad images must have a height larger than 75 pixels*/,
  `AD_IMAGE_PROCESSING_TOO_MANY_PIXELS` int /*Ad images must have a maximum area (width x height) of less than 89478485 pixels*/,
  `AD_IMAGE_PROCESSING_TYPE_MISMATCH` int /*Some ad images could not be processed due to a file type mismatch.*/,
  `AD_IMAGE_PROCESSING_WIDTH_TOO_SMALL` int /*Ad images must have a width larger than 75 pixels*/,
  `AD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_FILE_NOT_FOUND` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_400` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_403` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_404` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_405` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_410` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_429` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_500` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_502` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_503` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_504` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_507` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_508` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_520` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_521` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_522` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_HTTP_STATUS_525` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR` int /*We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.*/,
  `AD_VIDEO_DOWNLOAD_INTERNAL_ERROR` int /*We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.*/,
  `AD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD` int /*We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.*/,
  `AD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED` int /*We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.*/,
  `AD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED` int /*We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.*/,
  `AD_VIDEO_DOWNLOAD_INVALID_FILE` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_SITE_ERROR` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_SITE_TIMEOUT` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_SSL_ERROR` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_LENGTH_TOO_SHORT` int /*Ad videos length is too short. Please ensure that all ad videos are at least 4 seconds long.*/,
  `AD_VIDEO_PROCESSING_EMPTY_FILE` int /*Ad video files are unreadable. Please check your link and upload new files to continue.*/,
  `AD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL` int /*Ad videos must have a height larger than 75 pixels*/,
  `AD_VIDEO_PROCESSING_TOO_MANY_PIXELS` int /*Ad videos must have a maximum area (width x height) of less than 89478485 pixels*/,
  `AD_VIDEO_PROCESSING_TYPE_MISMATCH` int /*Some ad videos could not be processed due to a file type mismatch.*/,
  `AD_VIDEO_PROCESSING_WIDTH_TOO_SMALL` int /*Ad videos must have a width larger than 75 pixels*/,
  `ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE` int /*Additional image files are unreadable. Please upload new files to continue.*/,
  `ADDITIONAL_IMAGE_FILE_NOT_FOUND` int /*Additional image files are unreadable. Please upload new files to continue.*/,
  `ADDITIONAL_IMAGE_INVALID_FILE` int /*Additional image files are unreadable. Please upload new files to continue.*/,
  `ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR` int /*We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.*/,
  `ADDITIONAL_IMAGE_MALFORMED_URL` int /*Additional image files are unreadable. Please check your link and upload new files to continue.*/,
  `FETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT` int /*Update your Google Sheets sharing settings from &#39;Editor&#39; to &#39;Viewer&#39;.*/,
  `HOTEL_PRICE_HEADER_IS_PRESENT` int /*Price is not a supported column. Use base_price and sale_price instead.*/,
  `VIDEO_DOWNLOAD_VIDEO_TOO_SHORT` int /*Video length is too short. Please ensure that the main video is at least 4 seconds long.*/,
  `VIDEO_FILE_NOT_ACCESSIBLE` int /*Video files are unreadable. Please upload new files to continue.*/,
  `VIDEO_FILE_NOT_FOUND` int /*Video files are unreadable. Please upload new files to continue.*/,
  `VIDEO_INVALID_FILE` int /*Video files are unreadable. Please upload new files to continue.*/,
  `VIDEO_LEVEL_INTERNAL_ERROR` int /*We experienced a technical difficulty and were unable to download some additional videos. The next download attempt will happen in 24 hours.*/,
  `VIDEO_MALFORMED_URL` int /*Video files are unreadable. Please check your link and upload new files to continue.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedProcessingResult` generated from model 'catalogsFeedProcessingResult'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedProcessingResult` (
  `created_at` datetime NOT NULL,
  `id` text NOT NULL PRIMARY KEY /*ID of the feed processing result.*/,
  `ingestion_details` long NOT NULL,
  `product_counts` long NOT NULL,
  `status` long NOT NULL,
  `updated_at` datetime NOT NULL,
  `validation_details` long NOT NULL,
  `video_counts` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedProcessingSchedule` generated from model 'catalogsFeedProcessingSchedule'
-- Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedProcessingSchedule` (
  `time` text NOT NULL /*A time in format HH:MM with leading 0 (zero)*/,
  `timezone` long NOT NULL /*The timezone considered for the processing schedule time.*/
);  /*Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedProductCounts` generated from model 'catalogsFeedProductCounts'
-- The counts can be null early in the process.
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedProductCounts` (
  `ingested` int /*The number of products successfully ingested from the feed file.*/,
  `original` int /*The number of products in the feed file.*/
);  /*The counts can be null early in the process.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedUpdateRequestSchema` generated from model 'catalogsFeedUpdateRequestSchema'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedUpdateRequestSchema` (
  `catalog_type` text NOT NULL,
  `credentials` long,
  `default_availability` long,
  `default_currency` long,
  `format` long,
  `location` text /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text /*A human-friendly name associated to a given feed.*/,
  `preferred_processing_schedule` long,
  `status` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedValidationDetails` generated from model 'catalogsFeedValidationDetails'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedValidationDetails` (
  `errors` long NOT NULL,
  `warnings` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedValidationErrors` generated from model 'catalogsFeedValidationErrors'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedValidationErrors` (
  `ADULT_INVALID` int /*Some items have invalid adult values.*/,
  `ADWORDS_FORMAT_INVALID` int /*Some adwords links contain too many characters.*/,
  `AVAILABILITY_INVALID` int /*Some items are missing an availability value in their product metadata, those items will not be published.*/,
  `BLOCKLISTED_IMAGE_SIGNATURE` int /*Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines.*/,
  `DELIMITER_ERROR` int /*Your feed includes data with formatting errors.*/,
  `DESCRIPTION_MISSING` int /*Some items are missing a description in their product metadata, those items will not be published.*/,
  `DUPLICATE_PRODUCTS` int /*Some products are duplicated.*/,
  `ENCODING_ERROR` int /*Your feed includes data with an unsupported encoding format.*/,
  `FEED_LENGTH_TOO_LONG` int /*Your feed contains too many items, some items will not be published.*/,
  `FEED_TOO_SMALL` int /*Your feed couldn&#39;t be validated because the file doesn&#39;t contain the minimum number of lines required.*/,
  `FETCH_ERROR` int /*Pinterest couldn&#39;t download your feed.*/,
  `FETCH_INACTIVE_FEED_ERROR` int /*Your feed wasn&#39;t ingested because it hasn&#39;t changed in the previous 90 days.*/,
  `IMAGE_LINK_INVALID` int /*Some image links are formatted incorrectly.*/,
  `IMAGE_LINK_LENGTH_TOO_LONG` int /*Some items have image_link URLs that contain too many characters, so those items will not be published.*/,
  `IMAGE_LINK_MISSING` int /*Some items are missing an image link URL in their product metadata, those items will not be published.*/,
  `INTERNAL_SERVICE_ERROR` int /*We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.*/,
  `INVALID_DOMAIN` int /*Some of your product link values don&#39;t match the verified domain associated with this account.*/,
  `ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` int /*Some items&#39; main images can&#39;t be found.*/,
  `ITEMID_MISSING` int /*Some items are missing an item id in their product metadata, those items will not be published.*/,
  `LINK_FORMAT_INVALID` int /*Some link values are formatted incorrectly.*/,
  `LINK_LENGTH_TOO_LONG` int /*Some product links contain too many characters, those items will not be published.*/,
  `LIST_PRICE_INVALID` int /*Some items have list price formatting errors in their product metadata, those items will not be published.*/,
  `MALFORMED_XML` int /*Your feed couldn&#39;t be validated because the xml file is formatted incorrectly.*/,
  `MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED` int /*Some items exceed the maximum number of items per item group, those items will not be published.*/,
  `NO_VERIFIED_DOMAIN` int /*Your merchant domain needs to be claimed.*/,
  `PARSE_LINE_ERROR` int /*Your feed contains formatting errors for some items.*/,
  `PINJOIN_CONTENT_UNSAFE` int /*Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines.*/,
  `PRICE_CANNOT_BE_DETERMINED` int /*Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.*/,
  `PRICE_MISSING` int /*Some products are missing a price, those items will not be published.*/,
  `PRODUCT_LINK_MISSING` int /*Some items are missing a link URL in their product metadata, those items will not be published.*/,
  `PRODUCT_PRICE_INVALID` int /*Some items have price formatting errors in their product metadata, those items will not be published.*/,
  `REQUIRED_COLUMNS_MISSING` int /*Your feed is missing some required column headers.*/,
  `TITLE_MISSING` int /*Some items are missing a title in their product metadata, those items will not be published.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedValidationWarnings` generated from model 'catalogsFeedValidationWarnings'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedValidationWarnings` (
  `AD_IMAGE_0_LINK_DUPLICATED` int /*ad_image_0_link is duplicated with another ad image link.*/,
  `AD_IMAGE_0_LINK_LENGTH_TOO_LONG` int /*Ad image link 0 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_0_LINK_REQUIRED` int /*Ad image link 0 is required because an image tag was provided.*/,
  `AD_IMAGE_0_LINK_WARNING` int /*Ad image link 0 format is unsupported.*/,
  `AD_IMAGE_0_TAG_DUPLICATED` int /*ad_image_0_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_0_TAG_LENGTH_TOO_LONG` int /*Ad image tag 0 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_0_TAG_REQUIRED` int /*Ad image tag 0 is required because an image link was provided.*/,
  `AD_IMAGE_10_LINK_DUPLICATED` int /*ad_image_10_link is duplicated with another ad image link.*/,
  `AD_IMAGE_10_LINK_LENGTH_TOO_LONG` int /*Ad image link 10 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_10_LINK_REQUIRED` int /*Ad image link 10 is required because an image tag was provided.*/,
  `AD_IMAGE_10_LINK_WARNING` int /*Ad image link 10 format is unsupported.*/,
  `AD_IMAGE_10_TAG_DUPLICATED` int /*ad_image_10_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_10_TAG_LENGTH_TOO_LONG` int /*Ad image tag 10 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_10_TAG_REQUIRED` int /*Ad image tag 10 is required because an image link was provided.*/,
  `AD_IMAGE_11_LINK_DUPLICATED` int /*ad_image_11_link is duplicated with another ad image link.*/,
  `AD_IMAGE_11_LINK_LENGTH_TOO_LONG` int /*Ad image link 11 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_11_LINK_REQUIRED` int /*Ad image link 11 is required because an image tag was provided.*/,
  `AD_IMAGE_11_LINK_WARNING` int /*Ad image link 11 format is unsupported.*/,
  `AD_IMAGE_11_TAG_DUPLICATED` int /*ad_image_11_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_11_TAG_LENGTH_TOO_LONG` int /*Ad image tag 11 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_11_TAG_REQUIRED` int /*Ad image tag 11 is required because an image link was provided.*/,
  `AD_IMAGE_12_LINK_DUPLICATED` int /*ad_image_12_link is duplicated with another ad image link.*/,
  `AD_IMAGE_12_LINK_LENGTH_TOO_LONG` int /*Ad image link 12 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_12_LINK_REQUIRED` int /*Ad image link 12 is required because an image tag was provided.*/,
  `AD_IMAGE_12_LINK_WARNING` int /*Ad image link 12 format is unsupported.*/,
  `AD_IMAGE_12_TAG_DUPLICATED` int /*ad_image_12_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_12_TAG_LENGTH_TOO_LONG` int /*Ad image tag 12 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_12_TAG_REQUIRED` int /*Ad image tag 12 is required because an image link was provided.*/,
  `AD_IMAGE_13_LINK_DUPLICATED` int /*ad_image_13_link is duplicated with another ad image link.*/,
  `AD_IMAGE_13_LINK_LENGTH_TOO_LONG` int /*Ad image link 13 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_13_LINK_REQUIRED` int /*Ad image link 13 is required because an image tag was provided.*/,
  `AD_IMAGE_13_LINK_WARNING` int /*Ad image link 13 format is unsupported.*/,
  `AD_IMAGE_13_TAG_DUPLICATED` int /*ad_image_13_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_13_TAG_LENGTH_TOO_LONG` int /*Ad image tag 13 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_13_TAG_REQUIRED` int /*Ad image tag 13 is required because an image link was provided.*/,
  `AD_IMAGE_14_LINK_DUPLICATED` int /*ad_image_14_link is duplicated with another ad image link.*/,
  `AD_IMAGE_14_LINK_LENGTH_TOO_LONG` int /*Ad image link 14 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_14_LINK_REQUIRED` int /*Ad image link 14 is required because an image tag was provided.*/,
  `AD_IMAGE_14_LINK_WARNING` int /*Ad image link 14 format is unsupported.*/,
  `AD_IMAGE_14_TAG_DUPLICATED` int /*ad_image_14_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_14_TAG_LENGTH_TOO_LONG` int /*Ad image tag 14 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_14_TAG_REQUIRED` int /*Ad image tag 14 is required because an image link was provided.*/,
  `AD_IMAGE_15_LINK_DUPLICATED` int /*ad_image_15_link is duplicated with another ad image link.*/,
  `AD_IMAGE_15_LINK_LENGTH_TOO_LONG` int /*Ad image link 15 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_15_LINK_REQUIRED` int /*Ad image link 15 is required because an image tag was provided.*/,
  `AD_IMAGE_15_LINK_WARNING` int /*Ad image link 15 format is unsupported.*/,
  `AD_IMAGE_15_TAG_DUPLICATED` int /*ad_image_15_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_15_TAG_LENGTH_TOO_LONG` int /*Ad image tag 15 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_15_TAG_REQUIRED` int /*Ad image tag 15 is required because an image link was provided.*/,
  `AD_IMAGE_16_LINK_DUPLICATED` int /*ad_image_16_link is duplicated with another ad image link.*/,
  `AD_IMAGE_16_LINK_LENGTH_TOO_LONG` int /*Ad image link 16 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_16_LINK_REQUIRED` int /*Ad image link 16 is required because an image tag was provided.*/,
  `AD_IMAGE_16_LINK_WARNING` int /*Ad image link 16 format is unsupported.*/,
  `AD_IMAGE_16_TAG_DUPLICATED` int /*ad_image_16_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_16_TAG_LENGTH_TOO_LONG` int /*Ad image tag 16 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_16_TAG_REQUIRED` int /*Ad image tag 16 is required because an image link was provided.*/,
  `AD_IMAGE_17_LINK_DUPLICATED` int /*ad_image_17_link is duplicated with another ad image link.*/,
  `AD_IMAGE_17_LINK_LENGTH_TOO_LONG` int /*Ad image link 17 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_17_LINK_REQUIRED` int /*Ad image link 17 is required because an image tag was provided.*/,
  `AD_IMAGE_17_LINK_WARNING` int /*Ad image link 17 format is unsupported.*/,
  `AD_IMAGE_17_TAG_DUPLICATED` int /*ad_image_17_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_17_TAG_LENGTH_TOO_LONG` int /*Ad image tag 17 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_17_TAG_REQUIRED` int /*Ad image tag 17 is required because an image link was provided.*/,
  `AD_IMAGE_18_LINK_DUPLICATED` int /*ad_image_18_link is duplicated with another ad image link.*/,
  `AD_IMAGE_18_LINK_LENGTH_TOO_LONG` int /*Ad image link 18 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_18_LINK_REQUIRED` int /*Ad image link 18 is required because an image tag was provided.*/,
  `AD_IMAGE_18_LINK_WARNING` int /*Ad image link 18 format is unsupported.*/,
  `AD_IMAGE_18_TAG_DUPLICATED` int /*ad_image_18_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_18_TAG_LENGTH_TOO_LONG` int /*Ad image tag 18 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_18_TAG_REQUIRED` int /*Ad image tag 18 is required because an image link was provided.*/,
  `AD_IMAGE_19_LINK_DUPLICATED` int /*ad_image_19_link is duplicated with another ad image link.*/,
  `AD_IMAGE_19_LINK_LENGTH_TOO_LONG` int /*Ad image link 19 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_19_LINK_REQUIRED` int /*Ad image link 19 is required because an image tag was provided.*/,
  `AD_IMAGE_19_LINK_WARNING` int /*Ad image link 19 format is unsupported.*/,
  `AD_IMAGE_19_TAG_DUPLICATED` int /*ad_image_19_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_19_TAG_LENGTH_TOO_LONG` int /*Ad image tag 19 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_19_TAG_REQUIRED` int /*Ad image tag 19 is required because an image link was provided.*/,
  `AD_IMAGE_1_LINK_DUPLICATED` int /*ad_image_1_link is duplicated with another ad image link.*/,
  `AD_IMAGE_1_LINK_LENGTH_TOO_LONG` int /*Ad image link 1 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_1_LINK_REQUIRED` int /*Ad image link 1 is required because an image tag was provided.*/,
  `AD_IMAGE_1_LINK_WARNING` int /*Ad image link 1 format is unsupported.*/,
  `AD_IMAGE_1_TAG_DUPLICATED` int /*ad_image_1_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_1_TAG_LENGTH_TOO_LONG` int /*Ad image tag 1 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_1_TAG_REQUIRED` int /*Ad image tag 1 is required because an image link was provided.*/,
  `AD_IMAGE_2_LINK_DUPLICATED` int /*ad_image_2_link is duplicated with another ad image link.*/,
  `AD_IMAGE_2_LINK_LENGTH_TOO_LONG` int /*Ad image link 2 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_2_LINK_REQUIRED` int /*Ad image link 2 is required because an image tag was provided.*/,
  `AD_IMAGE_2_LINK_WARNING` int /*Ad image link 2 format is unsupported.*/,
  `AD_IMAGE_2_TAG_DUPLICATED` int /*ad_image_2_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_2_TAG_LENGTH_TOO_LONG` int /*Ad image tag 2 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_2_TAG_REQUIRED` int /*Ad image tag 2 is required because an image link was provided.*/,
  `AD_IMAGE_3_LINK_DUPLICATED` int /*ad_image_3_link is duplicated with another ad image link.*/,
  `AD_IMAGE_3_LINK_LENGTH_TOO_LONG` int /*Ad image link 3 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_3_LINK_REQUIRED` int /*Ad image link 3 is required because an image tag was provided.*/,
  `AD_IMAGE_3_LINK_WARNING` int /*Ad image link 3 format is unsupported.*/,
  `AD_IMAGE_3_TAG_DUPLICATED` int /*ad_image_3_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_3_TAG_LENGTH_TOO_LONG` int /*Ad image tag 3 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_3_TAG_REQUIRED` int /*Ad image tag 3 is required because an image link was provided.*/,
  `AD_IMAGE_4_LINK_DUPLICATED` int /*ad_image_4_link is duplicated with another ad image link.*/,
  `AD_IMAGE_4_LINK_LENGTH_TOO_LONG` int /*Ad image link 4 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_4_LINK_REQUIRED` int /*Ad image link 4 is required because an image tag was provided.*/,
  `AD_IMAGE_4_LINK_WARNING` int /*Ad image link 4 format is unsupported.*/,
  `AD_IMAGE_4_TAG_DUPLICATED` int /*ad_image_4_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_4_TAG_LENGTH_TOO_LONG` int /*Ad image tag 4 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_4_TAG_REQUIRED` int /*Ad image tag 4 is required because an image link was provided.*/,
  `AD_IMAGE_5_LINK_DUPLICATED` int /*ad_image_5_link is duplicated with another ad image link.*/,
  `AD_IMAGE_5_LINK_LENGTH_TOO_LONG` int /*Ad image link 5 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_5_LINK_REQUIRED` int /*Ad image link 5 is required because an image tag was provided.*/,
  `AD_IMAGE_5_LINK_WARNING` int /*Ad image link 5 format is unsupported.*/,
  `AD_IMAGE_5_TAG_DUPLICATED` int /*ad_image_5_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_5_TAG_LENGTH_TOO_LONG` int /*Ad image tag 5 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_5_TAG_REQUIRED` int /*Ad image tag 5 is required because an image link was provided.*/,
  `AD_IMAGE_6_LINK_DUPLICATED` int /*ad_image_6_link is duplicated with another ad image link.*/,
  `AD_IMAGE_6_LINK_LENGTH_TOO_LONG` int /*Ad image link 6 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_6_LINK_REQUIRED` int /*Ad image link 6 is required because an image tag was provided.*/,
  `AD_IMAGE_6_LINK_WARNING` int /*Ad image link 6 format is unsupported.*/,
  `AD_IMAGE_6_TAG_DUPLICATED` int /*ad_image_6_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_6_TAG_LENGTH_TOO_LONG` int /*Ad image tag 6 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_6_TAG_REQUIRED` int /*Ad image tag 6 is required because an image link was provided.*/,
  `AD_IMAGE_7_LINK_DUPLICATED` int /*ad_image_7_link is duplicated with another ad image link.*/,
  `AD_IMAGE_7_LINK_LENGTH_TOO_LONG` int /*Ad image link 7 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_7_LINK_REQUIRED` int /*Ad image link 7 is required because an image tag was provided.*/,
  `AD_IMAGE_7_LINK_WARNING` int /*Ad image link 7 format is unsupported.*/,
  `AD_IMAGE_7_TAG_DUPLICATED` int /*ad_image_7_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_7_TAG_LENGTH_TOO_LONG` int /*Ad image tag 7 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_7_TAG_REQUIRED` int /*Ad image tag 7 is required because an image link was provided.*/,
  `AD_IMAGE_8_LINK_DUPLICATED` int /*ad_image_8_link is duplicated with another ad image link.*/,
  `AD_IMAGE_8_LINK_LENGTH_TOO_LONG` int /*Ad image link 8 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_8_LINK_REQUIRED` int /*Ad image link 8 is required because an image tag was provided.*/,
  `AD_IMAGE_8_LINK_WARNING` int /*Ad image link 8 format is unsupported.*/,
  `AD_IMAGE_8_TAG_DUPLICATED` int /*ad_image_8_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_8_TAG_LENGTH_TOO_LONG` int /*Ad image tag 8 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_8_TAG_REQUIRED` int /*Ad image tag 8 is required because an image link was provided.*/,
  `AD_IMAGE_9_LINK_DUPLICATED` int /*ad_image_9_link is duplicated with another ad image link.*/,
  `AD_IMAGE_9_LINK_LENGTH_TOO_LONG` int /*Ad image link 9 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_9_LINK_REQUIRED` int /*Ad image link 9 is required because an image tag was provided.*/,
  `AD_IMAGE_9_LINK_WARNING` int /*Ad image link 9 format is unsupported.*/,
  `AD_IMAGE_9_TAG_DUPLICATED` int /*ad_image_9_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_9_TAG_LENGTH_TOO_LONG` int /*Ad image tag 9 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_9_TAG_REQUIRED` int /*Ad image tag 9 is required because an image link was provided.*/,
  `AD_LINK_FORMAT_WARNING` int /*Some items have ad links that are formatted incorrectly.*/,
  `AD_LINK_SAME_AS_LINK` int /*Some items have ad link URLs that are duplicates of the link URLs for those items.*/,
  `AD_VIDEO_0_LINK_DUPLICATED` int /*ad_video_0_link is duplicated with another ad video link.*/,
  `AD_VIDEO_0_LINK_LENGTH_TOO_LONG` int /*ad_video_0_link length is too long. The maximum length is 511 characters.*/,
  `AD_VIDEO_0_LINK_REQUIRED` int /*ad_video_0_link is required for this item because ad_video_0_tag was provided.*/,
  `AD_VIDEO_0_LINK_WARNING` int /*ad_video_0_link is formatted incorrectly and will not be published with your items.*/,
  `AD_VIDEO_0_TAG_DUPLICATED` int /*ad_video_0_tag is duplicated with another ad video tag.*/,
  `AD_VIDEO_0_TAG_LENGTH_TOO_LONG` int /*ad_video_0_tag length is too long. The maximum length is 511 characters.*/,
  `AD_VIDEO_0_TAG_REQUIRED` int /*ad_video_0_tag is required because ad_video_0_link was provided.*/,
  `AD_VIDEO_1_LINK_DUPLICATED` int /*ad_video_1_link is duplicated with another ad video link.*/,
  `AD_VIDEO_1_LINK_LENGTH_TOO_LONG` int /*ad_video_1_link length is too long. The maximum length is 511 characters.*/,
  `AD_VIDEO_1_LINK_REQUIRED` int /*ad_video_1_link is required for this item because ad_video_1_tag was provided.*/,
  `AD_VIDEO_1_LINK_WARNING` int /*ad_video_1_link is formatted incorrectly and will not be published with your items.*/,
  `AD_VIDEO_1_TAG_DUPLICATED` int /*ad_video_1_tag is duplicated with another ad video tag.*/,
  `AD_VIDEO_1_TAG_LENGTH_TOO_LONG` int /*ad_video_1_tag length is too long. The maximum length is 511 characters.*/,
  `AD_VIDEO_1_TAG_REQUIRED` int /*ad_video_1_tag is required because ad_video_1_link was provided.*/,
  `AD_VIDEO_2_LINK_DUPLICATED` int /*ad_video_2_link is duplicated with another ad video link.*/,
  `AD_VIDEO_2_LINK_LENGTH_TOO_LONG` int /*ad_video_2_link length is too long. The maximum length is 511 characters.*/,
  `AD_VIDEO_2_LINK_REQUIRED` int /*ad_video_2_link is required for this item because ad_video_2_tag was provided.*/,
  `AD_VIDEO_2_LINK_WARNING` int /*ad_video_2_link is formatted incorrectly and will not be published with your items.*/,
  `AD_VIDEO_2_TAG_DUPLICATED` int /*ad_video_2_tag is duplicated with another ad video tag.*/,
  `AD_VIDEO_2_TAG_LENGTH_TOO_LONG` int /*ad_video_2_tag length is too long. The maximum length is 511 characters.*/,
  `AD_VIDEO_2_TAG_REQUIRED` int /*ad_video_2_tag is required because ad_video_2_link was provided.*/,
  `ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG` int /*Some items have additional_image_link URLs that contain too many characters, so those items will not be published.*/,
  `ADDITIONAL_IMAGE_LINK_WARNING` int /*Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.*/,
  `ADWORDS_FORMAT_WARNING` int /*Some items have adwords_redirect links that are formatted incorrectly.*/,
  `ADWORDS_SAME_AS_LINK` int /*Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.*/,
  `AGE_GROUP_INVALID` int /*Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.*/,
  `ANDROID_DEEP_LINK_INVALID` int /*Some items include invalid android_deep_link.*/,
  `AVAILABILITY_DATE_INVALID` int /*Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.*/,
  `COUNTRY_DOES_NOT_MAP_TO_CURRENCY` int /*Some items include a currency that doesn&#39;t match the usual currency for the location where that product is sold or shipped.*/,
  `CUSTOM_LABEL_LENGTH_TOO_LONG` int /*Some items have custom_label values that are too long, those items will be published without that custom label.*/,
  `DESCRIPTION_LENGTH_TOO_LONG` int /*The description for some items were truncated because they contain too many characters.*/,
  `DUPLICATE_HEADERS` int /*Your feed contains duplicate headers.*/,
  `EXPIRATION_DATE_INVALID` int /*Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.*/,
  `FETCH_SAME_SIGNATURE` int /*Ingestion completed early because there are no changes to your feed since the last successful update.*/,
  `GENDER_INVALID` int /*Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.*/,
  `GTIN_INVALID` int /*Some items include incorrectly formatted GTINs.*/,
  `IMAGE_LINK_WARNING` int /*Some items have image_link URLs that are formatted incorrectly and will not be published with those items.*/,
  `INCONSISTENT_CURRENCY_VALUES` int /*Some items include inconsistent currencies in price fields.*/,
  `INDEXED_PRODUCT_COUNT_LARGE_DELTA` int /*The product count has increased or decreased significantly compared to the last successful ingestion.*/,
  `IOS_DEEP_LINK_INVALID` int /*Some items include invalid ios_deep_link values.*/,
  `IS_BUNDLE_INVALID` int /*Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.*/,
  `ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE` int /*Some items include additional_image_links that can&#39;t be found.*/,
  `LINK_FORMAT_WARNING` int /*Some items have an invalid product link which contains invalid UTM tracking paramaters.*/,
  `MIN_AD_PRICE_INVALID` int /*Some items include min_ad_price values that are formatted incorrectly.*/,
  `MPN_INVALID` int /*Some items include incorrectly formatted MPNs.*/,
  `MULTIPACK_INVALID` int /*Some items have invalid multipack values.*/,
  `OPTIONAL_CONDITION_INVALID` int /*Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.*/,
  `OPTIONAL_CONDITION_MISSING` int /*Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.*/,
  `OPTIONAL_PRODUCT_CATEGORY_INVALID` int /*Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.*/,
  `OPTIONAL_PRODUCT_CATEGORY_MISSING` int /*Some items are missing a google_product_category.*/,
  `PRODUCT_CATEGORY_DEPTH_WARNING` int /*Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.*/,
  `PRODUCT_TYPE_LENGTH_TOO_LONG` int /*Some items have product_type values that are too long, those items will be published without that product type.*/,
  `SALE_DATE_INVALID` int /*Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.*/,
  `SALES_PRICE_INVALID` int /*Some items have sale price values that are higher than the original price of the item.*/,
  `SALES_PRICE_TOO_HIGH` int /*Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.*/,
  `SALES_PRICE_TOO_LOW` int /*Some items include sales price that is much lower than the list price.*/,
  `SHIPPING_HEIGHT_INVALID` int /*Some items include incorrectly formatted shipping_height.*/,
  `SHIPPING_INVALID` int /*Some items have shipping values that are formatted incorrectly.*/,
  `SHIPPING_WEIGHT_INVALID` int /*Some items have invalid shipping_weight values.*/,
  `SHIPPING_WIDTH_INVALID` int /*Some items include incorrectly formatted shipping_width.*/,
  `SIZE_SYSTEM_INVALID` int /*Some items have size system values which are not one of the supported size systems.*/,
  `SIZE_TYPE_INVALID` int /*Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.*/,
  `TAX_INVALID` int /*Some items have tax values that are formatted incorrectly.*/,
  `TITLE_LENGTH_TOO_LONG` int /*The title for some items were truncated because they contain too many characters.*/,
  `TOO_MANY_ADDITIONAL_IMAGE_LINKS` int /*Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.*/,
  `UPDATED_TIME_INVALID` int /*Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.*/,
  `UTM_SOURCE_AUTO_CORRECTED` int /*Some items include utm_source values that are formatted incorrectly and have been automatically corrected.*/,
  `VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED` int /*A video is required in the item when ad_video fields are provided.*/,
  `WEIGHT_UNIT_INVALID` int /*Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedVideoCounts` generated from model 'catalogsFeedVideoCounts'
-- Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedVideoCounts` (
  `ingested_videos` int /*The number of videos successfully ingested from the feed file.*/,
  `not_ingested_videos` int /*The number of videos that were not ingested from the feed file.*/,
  `total_videos` int /*The number of videos in the feed file.*/
);  /*Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedsCreateRequest` generated from model 'catalogsFeedsCreateRequest'
-- Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedsCreateRequest` (
  `format` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text NOT NULL /*A human-friendly name associated to a given feed.*/,
  `credentials` long,
  `default_availability` long,
  `default_country` long,
  `default_currency` long,
  `default_locale` long,
  `preferred_processing_schedule` long,
  `status` long
);  /*Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedsUpdateRequest` generated from model 'catalogsFeedsUpdateRequest'
-- Request object for updating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedsUpdateRequest` (
  `credentials` long,
  `default_availability` long,
  `default_currency` long,
  `format` long,
  `location` text /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text /*A human-friendly name associated to a given feed.*/,
  `preferred_processing_schedule` long,
  `status` long
);  /*Request object for updating a feed.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelAddress` generated from model 'catalogsHotelAddress'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelAddress` (
  `addr1` text /*Primary street address of hotel.*/,
  `city` text /*City where the hotel is located.*/,
  `country` text /*Country where the hotel is located.*/,
  `postal_code` text /*Required for countries with a postal code system. Postal or zip code of the hotel.*/,
  `region` text /*State, county, province, where the hotel is located.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelAttributes` generated from model 'catalogsHotelAttributes'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelAttributes` (
  `address` long /*Hotel address*/,
  `base_price` text /*Base price of the hotel room per night followed by the ISO currency code*/,
  `brand` text /*The brand to which this hotel belongs to.*/,
  `category` text /*The type of property. The category can be any type of internal description desired.*/,
  `custom_label_0` text /*Custom grouping of hotels*/,
  `custom_label_1` text /*Custom grouping of hotels*/,
  `custom_label_2` text /*Custom grouping of hotels*/,
  `custom_label_3` text /*Custom grouping of hotels*/,
  `custom_label_4` text /*Custom grouping of hotels*/,
  `description` text /*Brief description of the hotel.*/,
  `guest_ratings` long /*If specified, you must provide all properties*/,
  `latitude` decimal /*Latitude of the hotel.*/,
  `link` text /*Link to the product page*/,
  `longitude` decimal /*Longitude of the hotel.*/,
  `name` text /*The hotel&#39;s name.*/,
  `sale_price` text /*Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.*/,
  `main_image` long /*The main hotel image*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelAttributesNeighborhood` generated from model 'CatalogsHotelAttributesNeighborhood'

CREATE TABLE IF NOT EXISTS `CatalogsHotelAttributesNeighborhood` (
  `catalogsHotelAttributes` long NOT NULL
  `neighborhood` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelAttributesAdditionalImageLink` generated from model 'CatalogsHotelAttributesAdditionalImageLink'

CREATE TABLE IF NOT EXISTS `CatalogsHotelAttributesAdditionalImageLink` (
  `catalogsHotelAttributes` long NOT NULL
  `additionalImageLink` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelAttributesCatalogsAiContentDisclosure` generated from model 'CatalogsHotelAttributesCatalogsAiContentDisclosure'

CREATE TABLE IF NOT EXISTS `CatalogsHotelAttributesCatalogsAiContentDisclosure` (
  `catalogsHotelAttributes` long NOT NULL
  `catalogsAiContentDisclosure` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelAvailableFilterValues` generated from model 'catalogsHotelAvailableFilterValues'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelAvailableFilterValues` (
  `catalog_type` text NOT NULL,
  `filter_values` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelBatchItem` generated from model 'catalogsHotelBatchItem'
-- Hotel batch item
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelBatchItem` (
  `attributes` long NOT NULL,
  `hotel_id` text NOT NULL /*The catalog hotel id in the merchant namespace*/,
  `operation` text NOT NULL
);  /*Hotel batch item*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelBatchRequest` generated from model 'catalogsHotelBatchRequest'
-- Request object to update catalogs hotel items
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelBatchRequest` (
  `catalog_type` text NOT NULL,
  `country` long NOT NULL,
  `language` text NOT NULL /*We recommend using the CatalogsLocale values.*/,
  `catalog_id` text /*Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog*/
);  /*Request object to update catalogs hotel items*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelBatchRequestCatalogsHotelBatchItem` generated from model 'CatalogsHotelBatchRequestCatalogsHotelBatchItem'

CREATE TABLE IF NOT EXISTS `CatalogsHotelBatchRequestCatalogsHotelBatchItem` (
  `catalogsHotelBatchRequest` long NOT NULL
  `catalogsHotelBatchItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelFeed` generated from model 'catalogsHotelFeed'
-- Catalogs Hotel Feed object
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelFeed` (
  `catalog_id` text NOT NULL /*Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.*/,
  `catalog_type` text NOT NULL,
  `created_at` datetime NOT NULL,
  `default_locale` text NOT NULL /*The locale used within a feed for product descriptions.*/,
  `format` long NOT NULL,
  `id` text NOT NULL PRIMARY KEY /*ID of the feed entity.*/,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text NOT NULL /*A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.*/,
  `status` long NOT NULL,
  `updated_at` datetime NOT NULL,
  `credentials` long,
  `default_currency` long,
  `preferred_processing_schedule` long
);  /*Catalogs Hotel Feed object*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelFeedsCreateRequest` generated from model 'catalogsHotelFeedsCreateRequest'
-- Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelFeedsCreateRequest` (
  `catalog_type` text NOT NULL,
  `default_locale` long NOT NULL,
  `format` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text NOT NULL /*A human-friendly name associated to a given feed.*/,
  `catalog_id` text /*Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.*/,
  `credentials` long,
  `default_currency` long,
  `preferred_processing_schedule` long,
  `status` long
);  /*Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelFeedsUpdateRequest` generated from model 'catalogsHotelFeedsUpdateRequest'
-- Request object for updating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelFeedsUpdateRequest` (
  `catalog_type` text NOT NULL,
  `credentials` long,
  `default_currency` long,
  `format` long,
  `location` text /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text /*A human-friendly name associated to a given feed.*/,
  `preferred_processing_schedule` long,
  `status` long
);  /*Request object for updating a feed.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelFilterValuesMap` generated from model 'catalogsHotelFilterValuesMap'
-- A map of filter attributes to their available values.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelFilterValuesMap` (
);  /*A map of filter attributes to their available values.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelFilterValuesMapBrand` generated from model 'CatalogsHotelFilterValuesMapBrand'

CREATE TABLE IF NOT EXISTS `CatalogsHotelFilterValuesMapBrand` (
  `catalogsHotelFilterValuesMap` long NOT NULL
  `brand` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelFilterValuesMapCustomLabel0` generated from model 'CatalogsHotelFilterValuesMapCustomLabel0'

CREATE TABLE IF NOT EXISTS `CatalogsHotelFilterValuesMapCustomLabel0` (
  `catalogsHotelFilterValuesMap` long NOT NULL
  `customLabel0` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelFilterValuesMapCustomLabel1` generated from model 'CatalogsHotelFilterValuesMapCustomLabel1'

CREATE TABLE IF NOT EXISTS `CatalogsHotelFilterValuesMapCustomLabel1` (
  `catalogsHotelFilterValuesMap` long NOT NULL
  `customLabel1` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelFilterValuesMapCustomLabel2` generated from model 'CatalogsHotelFilterValuesMapCustomLabel2'

CREATE TABLE IF NOT EXISTS `CatalogsHotelFilterValuesMapCustomLabel2` (
  `catalogsHotelFilterValuesMap` long NOT NULL
  `customLabel2` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelFilterValuesMapCustomLabel3` generated from model 'CatalogsHotelFilterValuesMapCustomLabel3'

CREATE TABLE IF NOT EXISTS `CatalogsHotelFilterValuesMapCustomLabel3` (
  `catalogsHotelFilterValuesMap` long NOT NULL
  `customLabel3` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelFilterValuesMapCustomLabel4` generated from model 'CatalogsHotelFilterValuesMapCustomLabel4'

CREATE TABLE IF NOT EXISTS `CatalogsHotelFilterValuesMapCustomLabel4` (
  `catalogsHotelFilterValuesMap` long NOT NULL
  `customLabel4` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelGuestRatings` generated from model 'catalogsHotelGuestRatings'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelGuestRatings` (
  `max_score` decimal /*Max value for the hotel rating score.*/,
  `number_of_reviewers` int /*Total number of people who have rated this hotel.*/,
  `rating_system` text /*System you use for guest reviews.*/,
  `score` decimal /*Your hotel&#39;s rating.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelItemErrorResponse` generated from model 'catalogsHotelItemErrorResponse'
-- Object describing a hotel item error
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelItemErrorResponse` (
  `catalog_type` text NOT NULL,
  `item_response_kind` text NOT NULL /*Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.*/,
  `hotel_id` text /*The catalog hotel id in the merchant namespace*/
);  /*Object describing a hotel item error*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelItemErrorResponseItemValidationEvent` generated from model 'CatalogsHotelItemErrorResponseItemValidationEvent'

CREATE TABLE IF NOT EXISTS `CatalogsHotelItemErrorResponseItemValidationEvent` (
  `catalogsHotelItemErrorResponse` long NOT NULL
  `itemValidationEvent` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelItemResponse` generated from model 'catalogsHotelItemResponse'
-- Object describing a hotel record
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelItemResponse` (
  `catalog_type` text NOT NULL,
  `item_response_kind` text NOT NULL /*Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.*/,
  `attributes` long,
  `hotel_id` text /*The catalog hotel id in the merchant namespace*/,
);  /*Object describing a hotel record*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelItemResponsePin` generated from model 'CatalogsHotelItemResponsePin'

CREATE TABLE IF NOT EXISTS `CatalogsHotelItemResponsePin` (
  `catalogsHotelItemResponse` long NOT NULL
  `pin` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelItemsBatch` generated from model 'catalogsHotelItemsBatch'
-- Object describing the catalogs hotel items batch. If specified, you must provide all properties.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelItemsBatch` (
  `catalog_type` text NOT NULL,
  `batch_id` text /*Id of the catalogs items batch*/,
  `completed_time` datetime /*Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss*/,
  `created_time` datetime /*Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss*/,
  `status` long
);  /*Object describing the catalogs hotel items batch. If specified, you must provide all properties.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelItemsBatchHotelProcessingRecord` generated from model 'CatalogsHotelItemsBatchHotelProcessingRecord'

CREATE TABLE IF NOT EXISTS `CatalogsHotelItemsBatchHotelProcessingRecord` (
  `catalogsHotelItemsBatch` long NOT NULL
  `hotelProcessingRecord` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelItemsPostFilter` generated from model 'catalogsHotelItemsPostFilter'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelItemsPostFilter` (
  `catalog_type` text NOT NULL,
  `catalog_id` text /*Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelItemsPostFilterHotelIds` generated from model 'CatalogsHotelItemsPostFilterHotelIds'

CREATE TABLE IF NOT EXISTS `CatalogsHotelItemsPostFilterHotelIds` (
  `catalogsHotelItemsPostFilter` long NOT NULL
  `hotelIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelListProductsByCatalogBasedFilterRequest` generated from model 'catalogsHotelListProductsByCatalogBasedFilterRequest'
-- Request object to list products for a given hotel catalog_id and product group filter.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelListProductsByCatalogBasedFilterRequest` (
  `catalog_id` text NOT NULL /*Catalog ID pertaining to the product group.*/,
  `catalog_type` text NOT NULL,
  `filters` long NOT NULL
);  /*Request object to list products for a given hotel catalog_id and product group filter.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelMainImage` generated from model 'catalogsHotelMainImage'
-- The main hotel image
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelMainImage` (
  `link` text /*&lt;&#x3D; 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.*/,
);  /*The main hotel image*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelMainImageTag` generated from model 'CatalogsHotelMainImageTag'

CREATE TABLE IF NOT EXISTS `CatalogsHotelMainImageTag` (
  `catalogsHotelMainImage` long NOT NULL
  `tag` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelProduct` generated from model 'catalogsHotelProduct'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProduct` (
  `catalog_type` text NOT NULL,
  `metadata` long NOT NULL,
  `pin` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelProductGroup` generated from model 'catalogsHotelProductGroup'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroup` (
  `catalog_id` text NOT NULL /*Catalog ID pertaining to the product group.*/,
  `catalog_type` text NOT NULL,
  `filters` long NOT NULL,
  `id` text NOT NULL PRIMARY KEY /*ID of the catalog product group.*/,
  `type` long NOT NULL,
  `created_at` int /*Unix timestamp in seconds of when catalog product group was created.*/,
  `description` text,
  `name` text /*Name of catalog product group*/,
  `updated_at` int /*Unix timestamp in seconds of last time catalog product group was updated.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelProductGroupCreateRequest` generated from model 'catalogsHotelProductGroupCreateRequest'
-- Request object for creating a hotel product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroupCreateRequest` (
  `catalog_id` text NOT NULL /*Catalog ID pertaining to the product group.*/,
  `catalog_type` text NOT NULL,
  `filters` long NOT NULL,
  `name` text NOT NULL,
  `description` text
);  /*Request object for creating a hotel product group.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelProductGroupFilterKeys` generated from model 'catalogsHotelProductGroupFilterKeys'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroupFilterKeys` (
  `PRICE` long NOT NULL,
  `HOTEL_ID` long NOT NULL,
  `BRAND` long NOT NULL,
  `CUSTOM_LABEL_0` long NOT NULL,
  `CUSTOM_LABEL_1` long NOT NULL,
  `CUSTOM_LABEL_2` long NOT NULL,
  `CUSTOM_LABEL_3` long NOT NULL,
  `CUSTOM_LABEL_4` long NOT NULL,
  `COUNTRY` long NOT NULL,
  `TITLE_KEYWORDS` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelProductGroupFilters` generated from model 'catalogsHotelProductGroupFilters'
-- Object holding a group of filters for a hotel product group
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroupFilters` (
);  /*Object holding a group of filters for a hotel product group*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelProductGroupFiltersCatalogsHotelProductGroupFilterKeys` generated from model 'CatalogsHotelProductGroupFiltersCatalogsHotelProductGroupFilterKeys'

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroupFiltersCatalogsHotelProductGroupFilterKeys` (
  `catalogsHotelProductGroupFilters` long NOT NULL
  `catalogsHotelProductGroupFilterKeys` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelProductGroupFiltersCatalogsHotelProductGroupFilterKeys` generated from model 'CatalogsHotelProductGroupFiltersCatalogsHotelProductGroupFilterKeys'

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroupFiltersCatalogsHotelProductGroupFilterKeys` (
  `catalogsHotelProductGroupFilters` long NOT NULL
  `catalogsHotelProductGroupFilterKeys` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelProductGroupFiltersAllOf` generated from model 'catalogsHotelProductGroupFiltersAllOf'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroupFiltersAllOf` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelProductGroupFiltersAllOfCatalogsHotelProductGroupFilterKeys` generated from model 'CatalogsHotelProductGroupFiltersAllOfCatalogsHotelProductGroupFilterKeys'

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroupFiltersAllOfCatalogsHotelProductGroupFilterKeys` (
  `catalogsHotelProductGroupFiltersAllOf` long NOT NULL
  `catalogsHotelProductGroupFilterKeys` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelProductGroupFiltersAnyOf` generated from model 'catalogsHotelProductGroupFiltersAnyOf'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroupFiltersAnyOf` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelProductGroupFiltersAnyOfCatalogsHotelProductGroupFilterKeys` generated from model 'CatalogsHotelProductGroupFiltersAnyOfCatalogsHotelProductGroupFilterKeys'

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroupFiltersAnyOfCatalogsHotelProductGroupFilterKeys` (
  `catalogsHotelProductGroupFiltersAnyOf` long NOT NULL
  `catalogsHotelProductGroupFilterKeys` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelProductGroupProductCounts` generated from model 'catalogsHotelProductGroupProductCounts'
-- Product counts for a Hotel CatalogsProductGroup
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroupProductCounts` (
  `catalog_type` text NOT NULL,
  `total` decimal NOT NULL
);  /*Product counts for a Hotel CatalogsProductGroup*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelProductGroupUpdateRequest` generated from model 'catalogsHotelProductGroupUpdateRequest'
-- Request object for updating a hotel product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroupUpdateRequest` (
  `catalog_type` text,
  `description` text,
  `filters` long,
  `name` text /*Name of catalog product group*/
);  /*Request object for updating a hotel product group.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelProductMetadata` generated from model 'catalogsHotelProductMetadata'
-- Hotel product metadata entity
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductMetadata` (
  `hotel_id` text NOT NULL /*The user-created unique ID that represents the hotel item.*/
);  /*Hotel product metadata entity*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelReportParameters` generated from model 'catalogsHotelReportParameters'
-- Parameters for hotel report
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelReportParameters` (
  `catalog_type` text NOT NULL,
  `report` long NOT NULL
);  /*Parameters for hotel report*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelReportParametersReport` generated from model 'catalogsHotelReportParametersReport'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelReportParametersReport` (
  `feed_id` text NOT NULL /*ID of the feed entity.*/,
  `report_type` text NOT NULL,
  `processing_result_id` text /*Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.*/,
  `catalog_id` text /*Unique identifier of a catalog. If not given, oldest catalog will be used*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelReportStatsParameters` generated from model 'catalogsHotelReportStatsParameters'
-- Parameters for hotel report
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelReportStatsParameters` (
  `catalog_type` text NOT NULL,
  `report` long NOT NULL
);  /*Parameters for hotel report*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelReportStatsParametersReport` generated from model 'catalogsHotelReportStatsParametersReport'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelReportStatsParametersReport` (
  `feed_id` text NOT NULL /*ID of the feed entity.*/,
  `report_type` text NOT NULL,
  `processing_result_id` text /*Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.*/,
  `catalog_id` text /*Unique identifier of a catalog. If not given, oldest catalog will be used*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemValidationDetails` generated from model 'catalogsItemValidationDetails'
--

CREATE TABLE IF NOT EXISTS `CatalogsItemValidationDetails` (
  `attribute_name` long NOT NULL /*Attribute that has a validation issue.*/,
  `provided_value` text NOT NULL /*Provided value that caused the validation issue.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemValidationErrors` generated from model 'catalogsItemValidationErrors'
--

CREATE TABLE IF NOT EXISTS `CatalogsItemValidationErrors` (
  `ADULT_INVALID` long /*Item has an invalid adult value.*/,
  `ADWORDS_FORMAT_INVALID` long /*Adword link contains too many characters.*/,
  `AVAILABILITY_INVALID` long /*Item is missing availability value in its product metadata, this item will not be published.*/,
  `BLOCKLISTED_IMAGE_SIGNATURE` long /*Item will not be published because it doesn&#39;t meet Pinterest&#39;s Merchant Guidelines.*/,
  `DESCRIPTION_MISSING` long /*Item is missing description in its product metadata, this item will not be published.*/,
  `DUPLICATE_PRODUCTS` long /*This product is duplicated. The duplicate entry will not be published.*/,
  `IMAGE_LINK_INVALID` long /*Image link is invalid.*/,
  `IMAGE_LINK_LENGTH_TOO_LONG` long /*Item has image_link URL that contains too many characters, so the item will not be published.*/,
  `IMAGE_LINK_MISSING` long /*Item is missing an image link URL in its product metadata, this item will not be published.*/,
  `INVALID_DOMAIN` long /*Product link value doesn&#39;t match the verified domain associated with this account.*/,
  `ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` long /*Main image can&#39;t be found.*/,
  `ITEMID_MISSING` long /*Item is missing item id in its product metadata, this item will not be published.*/,
  `LINK_FORMAT_INVALID` long /*Link is invalid.*/,
  `LINK_LENGTH_TOO_LONG` long /*Product link contains too many characters, this item will not be published.*/,
  `LIST_PRICE_INVALID` long /*Item has a list price formatting error, this item will not be published.*/,
  `MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED` long /*Item exceed the maximum number of items per item group, this item will not be published.*/,
  `PARSE_LINE_ERROR` long /*Item contains formating errors.*/,
  `PINJOIN_CONTENT_UNSAFE` long /*Item will not be published because it doesn&#39;t meet Pinterest&#39;s Merchant Guidelines.*/,
  `PRICE_CANNOT_BE_DETERMINED` long /*Item price cannot be determined because the price, list price, and sale price are all different.*/,
  `PRICE_MISSING` long /*Product is missing a price, this item will not be published.*/,
  `PRODUCT_LINK_MISSING` long /*Item is missing a link URL in its product metadata, this item will not be published.*/,
  `PRODUCT_PRICE_INVALID` long /*Item has a price formatting error in its product metadata, this item will not be published.*/,
  `TITLE_MISSING` long /*Item is missing title in its product metadata, this item will not be published.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemValidationIssues` generated from model 'catalogsItemValidationIssues'
--

CREATE TABLE IF NOT EXISTS `CatalogsItemValidationIssues` (
  `errors` long NOT NULL,
  `item_id` text NOT NULL /*The merchant-created unique ID that represents the product.*/,
  `item_number` int NOT NULL /*Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation.*/,
  `warnings` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemValidationWarnings` generated from model 'catalogsItemValidationWarnings'
--

CREATE TABLE IF NOT EXISTS `CatalogsItemValidationWarnings` (
  `AD_IMAGE_0_LINK_DUPLICATED` long /*ad_image_0_link is duplicated with another ad image link.*/,
  `AD_IMAGE_0_LINK_LENGTH_TOO_LONG` long /*Ad image link 0 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_0_LINK_REQUIRED` long /*Ad image link 0 is required because an image tag was provided.*/,
  `AD_IMAGE_0_LINK_WARNING` long /*Ad image link 0 format is unsupported.*/,
  `AD_IMAGE_0_TAG_DUPLICATED` long /*ad_image_0_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_0_TAG_LENGTH_TOO_LONG` long /*Ad image tag 0 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_0_TAG_REQUIRED` long /*Ad image tag 0 is required because an image link was provided.*/,
  `AD_IMAGE_10_LINK_DUPLICATED` long /*ad_image_10_link is duplicated with another ad image link.*/,
  `AD_IMAGE_10_LINK_LENGTH_TOO_LONG` long /*Ad image link 10 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_10_LINK_REQUIRED` long /*Ad image link 10 is required because an image tag was provided.*/,
  `AD_IMAGE_10_LINK_WARNING` long /*Ad image link 10 format is unsupported.*/,
  `AD_IMAGE_10_TAG_DUPLICATED` long /*ad_image_10_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_10_TAG_LENGTH_TOO_LONG` long /*Ad image tag 10 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_10_TAG_REQUIRED` long /*Ad image tag 10 is required because an image link was provided.*/,
  `AD_IMAGE_11_LINK_DUPLICATED` long /*ad_image_11_link is duplicated with another ad image link.*/,
  `AD_IMAGE_11_LINK_LENGTH_TOO_LONG` long /*Ad image link 11 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_11_LINK_REQUIRED` long /*Ad image link 11 is required because an image tag was provided.*/,
  `AD_IMAGE_11_LINK_WARNING` long /*Ad image link 11 format is unsupported.*/,
  `AD_IMAGE_11_TAG_DUPLICATED` long /*ad_image_11_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_11_TAG_LENGTH_TOO_LONG` long /*Ad image tag 11 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_11_TAG_REQUIRED` long /*Ad image tag 11 is required because an image link was provided.*/,
  `AD_IMAGE_12_LINK_DUPLICATED` long /*ad_image_12_link is duplicated with another ad image link.*/,
  `AD_IMAGE_12_LINK_LENGTH_TOO_LONG` long /*Ad image link 12 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_12_LINK_REQUIRED` long /*Ad image link 12 is required because an image tag was provided.*/,
  `AD_IMAGE_12_LINK_WARNING` long /*Ad image link 12 format is unsupported.*/,
  `AD_IMAGE_12_TAG_DUPLICATED` long /*ad_image_12_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_12_TAG_LENGTH_TOO_LONG` long /*Ad image tag 12 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_12_TAG_REQUIRED` long /*Ad image tag 12 is required because an image link was provided.*/,
  `AD_IMAGE_13_LINK_DUPLICATED` long /*ad_image_13_link is duplicated with another ad image link.*/,
  `AD_IMAGE_13_LINK_LENGTH_TOO_LONG` long /*Ad image link 13 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_13_LINK_REQUIRED` long /*Ad image link 13 is required because an image tag was provided.*/,
  `AD_IMAGE_13_LINK_WARNING` long /*Ad image link 13 format is unsupported.*/,
  `AD_IMAGE_13_TAG_DUPLICATED` long /*ad_image_13_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_13_TAG_LENGTH_TOO_LONG` long /*Ad image tag 13 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_13_TAG_REQUIRED` long /*Ad image tag 13 is required because an image link was provided.*/,
  `AD_IMAGE_14_LINK_DUPLICATED` long /*ad_image_14_link is duplicated with another ad image link.*/,
  `AD_IMAGE_14_LINK_LENGTH_TOO_LONG` long /*Ad image link 14 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_14_LINK_REQUIRED` long /*Ad image link 14 is required because an image tag was provided.*/,
  `AD_IMAGE_14_LINK_WARNING` long /*Ad image link 14 format is unsupported.*/,
  `AD_IMAGE_14_TAG_DUPLICATED` long /*ad_image_14_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_14_TAG_LENGTH_TOO_LONG` long /*Ad image tag 14 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_14_TAG_REQUIRED` long /*Ad image tag 14 is required because an image link was provided.*/,
  `AD_IMAGE_15_LINK_DUPLICATED` long /*ad_image_15_link is duplicated with another ad image link.*/,
  `AD_IMAGE_15_LINK_LENGTH_TOO_LONG` long /*Ad image link 15 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_15_LINK_REQUIRED` long /*Ad image link 15 is required because an image tag was provided.*/,
  `AD_IMAGE_15_LINK_WARNING` long /*Ad image link 15 format is unsupported.*/,
  `AD_IMAGE_15_TAG_DUPLICATED` long /*ad_image_15_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_15_TAG_LENGTH_TOO_LONG` long /*Ad image tag 15 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_15_TAG_REQUIRED` long /*Ad image tag 15 is required because an image link was provided.*/,
  `AD_IMAGE_16_LINK_DUPLICATED` long /*ad_image_16_link is duplicated with another ad image link.*/,
  `AD_IMAGE_16_LINK_LENGTH_TOO_LONG` long /*Ad image link 16 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_16_LINK_REQUIRED` long /*Ad image link 16 is required because an image tag was provided.*/,
  `AD_IMAGE_16_LINK_WARNING` long /*Ad image link 16 format is unsupported.*/,
  `AD_IMAGE_16_TAG_DUPLICATED` long /*ad_image_16_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_16_TAG_LENGTH_TOO_LONG` long /*Ad image tag 16 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_16_TAG_REQUIRED` long /*Ad image tag 16 is required because an image link was provided.*/,
  `AD_IMAGE_17_LINK_DUPLICATED` long /*ad_image_17_link is duplicated with another ad image link.*/,
  `AD_IMAGE_17_LINK_LENGTH_TOO_LONG` long /*Ad image link 17 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_17_LINK_REQUIRED` long /*Ad image link 17 is required because an image tag was provided.*/,
  `AD_IMAGE_17_LINK_WARNING` long /*Ad image link 17 format is unsupported.*/,
  `AD_IMAGE_17_TAG_DUPLICATED` long /*ad_image_17_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_17_TAG_LENGTH_TOO_LONG` long /*Ad image tag 17 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_17_TAG_REQUIRED` long /*Ad image tag 17 is required because an image link was provided.*/,
  `AD_IMAGE_18_LINK_DUPLICATED` long /*ad_image_18_link is duplicated with another ad image link.*/,
  `AD_IMAGE_18_LINK_LENGTH_TOO_LONG` long /*Ad image link 18 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_18_LINK_REQUIRED` long /*Ad image link 18 is required because an image tag was provided.*/,
  `AD_IMAGE_18_LINK_WARNING` long /*Ad image link 18 format is unsupported.*/,
  `AD_IMAGE_18_TAG_DUPLICATED` long /*ad_image_18_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_18_TAG_LENGTH_TOO_LONG` long /*Ad image tag 18 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_18_TAG_REQUIRED` long /*Ad image tag 18 is required because an image link was provided.*/,
  `AD_IMAGE_19_LINK_DUPLICATED` long /*ad_image_19_link is duplicated with another ad image link.*/,
  `AD_IMAGE_19_LINK_LENGTH_TOO_LONG` long /*Ad image link 19 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_19_LINK_REQUIRED` long /*Ad image link 19 is required because an image tag was provided.*/,
  `AD_IMAGE_19_LINK_WARNING` long /*Ad image link 19 format is unsupported.*/,
  `AD_IMAGE_19_TAG_DUPLICATED` long /*ad_image_19_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_19_TAG_LENGTH_TOO_LONG` long /*Ad image tag 19 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_19_TAG_REQUIRED` long /*Ad image tag 19 is required because an image link was provided.*/,
  `AD_IMAGE_1_LINK_DUPLICATED` long /*ad_image_1_link is duplicated with another ad image link.*/,
  `AD_IMAGE_1_LINK_LENGTH_TOO_LONG` long /*Ad image link 1 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_1_LINK_REQUIRED` long /*Ad image link 1 is required because an image tag was provided.*/,
  `AD_IMAGE_1_LINK_WARNING` long /*Ad image link 1 format is unsupported.*/,
  `AD_IMAGE_1_TAG_DUPLICATED` long /*ad_image_1_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_1_TAG_LENGTH_TOO_LONG` long /*Ad image tag 1 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_1_TAG_REQUIRED` long /*Ad image tag 1 is required because an image link was provided.*/,
  `AD_IMAGE_2_LINK_DUPLICATED` long /*ad_image_2_link is duplicated with another ad image link.*/,
  `AD_IMAGE_2_LINK_LENGTH_TOO_LONG` long /*Ad image link 2 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_2_LINK_REQUIRED` long /*Ad image link 2 is required because an image tag was provided.*/,
  `AD_IMAGE_2_LINK_WARNING` long /*Ad image link 2 format is unsupported.*/,
  `AD_IMAGE_2_TAG_DUPLICATED` long /*ad_image_2_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_2_TAG_LENGTH_TOO_LONG` long /*Ad image tag 2 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_2_TAG_REQUIRED` long /*Ad image tag 2 is required because an image link was provided.*/,
  `AD_IMAGE_3_LINK_DUPLICATED` long /*ad_image_3_link is duplicated with another ad image link.*/,
  `AD_IMAGE_3_LINK_LENGTH_TOO_LONG` long /*Ad image link 3 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_3_LINK_REQUIRED` long /*Ad image link 3 is required because an image tag was provided.*/,
  `AD_IMAGE_3_LINK_WARNING` long /*Ad image link 3 format is unsupported.*/,
  `AD_IMAGE_3_TAG_DUPLICATED` long /*ad_image_3_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_3_TAG_LENGTH_TOO_LONG` long /*Ad image tag 3 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_3_TAG_REQUIRED` long /*Ad image tag 3 is required because an image link was provided.*/,
  `AD_IMAGE_4_LINK_DUPLICATED` long /*ad_image_4_link is duplicated with another ad image link.*/,
  `AD_IMAGE_4_LINK_LENGTH_TOO_LONG` long /*Ad image link 4 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_4_LINK_REQUIRED` long /*Ad image link 4 is required because an image tag was provided.*/,
  `AD_IMAGE_4_LINK_WARNING` long /*Ad image link 4 format is unsupported.*/,
  `AD_IMAGE_4_TAG_DUPLICATED` long /*ad_image_4_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_4_TAG_LENGTH_TOO_LONG` long /*Ad image tag 4 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_4_TAG_REQUIRED` long /*Ad image tag 4 is required because an image link was provided.*/,
  `AD_IMAGE_5_LINK_DUPLICATED` long /*ad_image_5_link is duplicated with another ad image link.*/,
  `AD_IMAGE_5_LINK_LENGTH_TOO_LONG` long /*Ad image link 5 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_5_LINK_REQUIRED` long /*Ad image link 5 is required because an image tag was provided.*/,
  `AD_IMAGE_5_LINK_WARNING` long /*Ad image link 5 format is unsupported.*/,
  `AD_IMAGE_5_TAG_DUPLICATED` long /*ad_image_5_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_5_TAG_LENGTH_TOO_LONG` long /*Ad image tag 5 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_5_TAG_REQUIRED` long /*Ad image tag 5 is required because an image link was provided.*/,
  `AD_IMAGE_6_LINK_DUPLICATED` long /*ad_image_6_link is duplicated with another ad image link.*/,
  `AD_IMAGE_6_LINK_LENGTH_TOO_LONG` long /*Ad image link 6 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_6_LINK_REQUIRED` long /*Ad image link 6 is required because an image tag was provided.*/,
  `AD_IMAGE_6_LINK_WARNING` long /*Ad image link 6 format is unsupported.*/,
  `AD_IMAGE_6_TAG_DUPLICATED` long /*ad_image_6_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_6_TAG_LENGTH_TOO_LONG` long /*Ad image tag 6 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_6_TAG_REQUIRED` long /*Ad image tag 6 is required because an image link was provided.*/,
  `AD_IMAGE_7_LINK_DUPLICATED` long /*ad_image_7_link is duplicated with another ad image link.*/,
  `AD_IMAGE_7_LINK_LENGTH_TOO_LONG` long /*Ad image link 7 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_7_LINK_REQUIRED` long /*Ad image link 7 is required because an image tag was provided.*/,
  `AD_IMAGE_7_LINK_WARNING` long /*Ad image link 7 format is unsupported.*/,
  `AD_IMAGE_7_TAG_DUPLICATED` long /*ad_image_7_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_7_TAG_LENGTH_TOO_LONG` long /*Ad image tag 7 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_7_TAG_REQUIRED` long /*Ad image tag 7 is required because an image link was provided.*/,
  `AD_IMAGE_8_LINK_DUPLICATED` long /*ad_image_8_link is duplicated with another ad image link.*/,
  `AD_IMAGE_8_LINK_LENGTH_TOO_LONG` long /*Ad image link 8 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_8_LINK_REQUIRED` long /*Ad image link 8 is required because an image tag was provided.*/,
  `AD_IMAGE_8_LINK_WARNING` long /*Ad image link 8 format is unsupported.*/,
  `AD_IMAGE_8_TAG_DUPLICATED` long /*ad_image_8_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_8_TAG_LENGTH_TOO_LONG` long /*Ad image tag 8 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_8_TAG_REQUIRED` long /*Ad image tag 8 is required because an image link was provided.*/,
  `AD_IMAGE_9_LINK_DUPLICATED` long /*ad_image_9_link is duplicated with another ad image link.*/,
  `AD_IMAGE_9_LINK_LENGTH_TOO_LONG` long /*Ad image link 9 length is too long. The maximum length is 2047 characters.*/,
  `AD_IMAGE_9_LINK_REQUIRED` long /*Ad image link 9 is required because an image tag was provided.*/,
  `AD_IMAGE_9_LINK_WARNING` long /*Ad image link 9 format is unsupported.*/,
  `AD_IMAGE_9_TAG_DUPLICATED` long /*ad_image_9_tag is duplicated with another ad image tag.*/,
  `AD_IMAGE_9_TAG_LENGTH_TOO_LONG` long /*Ad image tag 9 length is too long. The maximum length is 511 characters.*/,
  `AD_IMAGE_9_TAG_REQUIRED` long /*Ad image tag 9 is required because an image link was provided.*/,
  `AD_LINK_FORMAT_WARNING` long /*Item has an ad link that is formatted incorrectly.*/,
  `AD_LINK_SAME_AS_LINK` long /*Item has an ad link URL that is duplicate of the link URL.*/,
  `AD_VIDEO_0_LINK_DUPLICATED` long /*ad_video_0_link is duplicated with another ad video link.*/,
  `AD_VIDEO_0_LINK_LENGTH_TOO_LONG` long /*ad_video_0_link length is too long. The maximum length is 511 characters.*/,
  `AD_VIDEO_0_LINK_REQUIRED` long /*ad_video_0_link is required for this item because ad_video_0_tag was provided.*/,
  `AD_VIDEO_0_LINK_WARNING` long /*ad_video_0_link is formatted incorrectly and will not be published with your items.*/,
  `AD_VIDEO_0_TAG_DUPLICATED` long /*ad_video_0_tag is duplicated with another ad video tag.*/,
  `AD_VIDEO_0_TAG_LENGTH_TOO_LONG` long /*ad_video_0_tag length is too long. The maximum length is 511 characters.*/,
  `AD_VIDEO_0_TAG_REQUIRED` long /*ad_video_0_tag is required because ad_video_0_link was provided.*/,
  `AD_VIDEO_1_LINK_DUPLICATED` long /*ad_video_1_link is duplicated with another ad video link.*/,
  `AD_VIDEO_1_LINK_LENGTH_TOO_LONG` long /*ad_video_1_link length is too long. The maximum length is 511 characters.*/,
  `AD_VIDEO_1_LINK_REQUIRED` long /*ad_video_1_link is required for this item because ad_video_1_tag was provided.*/,
  `AD_VIDEO_1_LINK_WARNING` long /*ad_video_1_link is formatted incorrectly and will not be published with your items.*/,
  `AD_VIDEO_1_TAG_DUPLICATED` long /*ad_video_1_tag is duplicated with another ad video tag.*/,
  `AD_VIDEO_1_TAG_LENGTH_TOO_LONG` long /*ad_video_1_tag length is too long. The maximum length is 511 characters.*/,
  `AD_VIDEO_1_TAG_REQUIRED` long /*ad_video_1_tag is required because ad_video_1_link was provided.*/,
  `AD_VIDEO_2_LINK_DUPLICATED` long /*ad_video_2_link is duplicated with another ad video link.*/,
  `AD_VIDEO_2_LINK_LENGTH_TOO_LONG` long /*ad_video_2_link length is too long. The maximum length is 511 characters.*/,
  `AD_VIDEO_2_LINK_REQUIRED` long /*ad_video_2_link is required for this item because ad_video_2_tag was provided.*/,
  `AD_VIDEO_2_LINK_WARNING` long /*ad_video_2_link is formatted incorrectly and will not be published with your items.*/,
  `AD_VIDEO_2_TAG_DUPLICATED` long /*ad_video_2_tag is duplicated with another ad video tag.*/,
  `AD_VIDEO_2_TAG_LENGTH_TOO_LONG` long /*ad_video_2_tag length is too long. The maximum length is 511 characters.*/,
  `AD_VIDEO_2_TAG_REQUIRED` long /*ad_video_2_tag is required because ad_video_2_link was provided.*/,
  `ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG` long /*Item has an additional_image_link URL that contains too many characters, so the item will not be published.*/,
  `ADDITIONAL_IMAGE_LINK_WARNING` long /*Item has additional_image_link URLs that are formatted incorrectly and will not be published with your items.*/,
  `ADWORDS_FORMAT_WARNING` long /*Item has an adwords_redirect link that is formatted incorrectly.*/,
  `ADWORDS_SAME_AS_LINK` long /*Item has an adwords_redirect URL that is duplicate of the link URL.*/,
  `AGE_GROUP_INVALID` long /*Item has an age group value that is formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.*/,
  `ANDROID_DEEP_LINK_INVALID` long /*Item includes an invalid android_deep_link.*/,
  `AVAILABILITY_DATE_INVALID` long /*Item has an availability_date value that is formatted incorrectly, this item will be published without an availability date.*/,
  `COUNTRY_DOES_NOT_MAP_TO_CURRENCY` long /*Item includes a currency that doesn&#39;t match the usual currency for the location where the product is sold or shipped.*/,
  `CUSTOM_LABEL_LENGTH_TOO_LONG` long /*Item has a custom_label value that is too long, this item will be published without that custom label.*/,
  `DESCRIPTION_LENGTH_TOO_LONG` long /*The description for this item was truncated because it contains too many characters.*/,
  `EXPIRATION_DATE_INVALID` long /*Item has an expiration_date value that is formatted incorrectly, this item will be published without an expiration date.*/,
  `GENDER_INVALID` long /*Item has a gender value that is formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.*/,
  `GTIN_INVALID` long /*Item has a GTIN value that is formatted incorrectly.*/,
  `IMAGE_LINK_WARNING` long /*Item has an image_link URL that is formatted incorrectly and will not be published.*/,
  `IOS_DEEP_LINK_INVALID` long /*Item includes an invalid ios_deep_link value.*/,
  `IS_BUNDLE_INVALID` long /*Item has an is_bundle value that is formatted incorrectly, this item will be published without being bundled with other products.*/,
  `ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE` long /*Item includes additional_image_links that can&#39;t be found.*/,
  `LINK_FORMAT_WARNING` long /*Item has an invalid product link which contains invalid UTM tracking paramaters.*/,
  `MIN_AD_PRICE_INVALID` long /*Item includes a min_ad_price value that is formatted incorrectly.*/,
  `MPN_INVALID` long /*Item has a MPN value that is formatted incorrectly.*/,
  `MULTIPACK_INVALID` long /*Item has an invalid multipack value.*/,
  `OPTIONAL_CONDITION_INVALID` long /*Item includes a condition value that is formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.*/,
  `OPTIONAL_CONDITION_MISSING` long /*Item is missing condition value, which may limit visibility in recommendations, search results and shopping experiences.*/,
  `OPTIONAL_PRODUCT_CATEGORY_INVALID` long /*Item includes a google_product_category value that is not formatted correctly according to the GPC taxonomy.*/,
  `OPTIONAL_PRODUCT_CATEGORY_MISSING` long /*Item is missing google_product_category.*/,
  `PRODUCT_CATEGORY_DEPTH_WARNING` long /*Item only has 1 or 2 levels of google_product_category value, which may limit visibility in recommendations, search results and shopping experiences.*/,
  `PRODUCT_TYPE_LENGTH_TOO_LONG` long /*Item has a product_type value that is too long, this item will be published without that product type.*/,
  `SALE_DATE_INVALID` long /*Item has a sale_price_effective_date value that is formatted incorrectly, this item will be published without a sale date.*/,
  `SALES_PRICE_INVALID` long /*Item has an incorrectly formatted sales price.*/,
  `SALES_PRICE_TOO_HIGH` long /*Item has a sale price value that is higher than the original price of the item.*/,
  `SALES_PRICE_TOO_LOW` long /*Item has a sale price value that is discounted very low compared to the price.*/,
  `SHIPPING_HEIGHT_INVALID` long /*Item has an incorrectly formatted shipping_height value. The value must first contain a numeric value then a valid dimension unit type.*/,
  `SHIPPING_INVALID` long /*Item has a shipping value that is formatted incorrectly.*/,
  `SHIPPING_WEIGHT_INVALID` long /*Item has an invalid shipping_weight value.*/,
  `SHIPPING_WIDTH_INVALID` long /*Item has an incorrectly formatted shipping_width value. The value must first contain a numeric value then a valid dimension unit type.*/,
  `SIZE_SYSTEM_INVALID` long /*Some items have size system values which are not one of the supported size systems.*/,
  `SIZE_TYPE_INVALID` long /*Item has a size type value that is formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.*/,
  `TAX_INVALID` long /*Item has a tax value that is formatted incorrectly.*/,
  `TITLE_LENGTH_TOO_LONG` long /*The title for the item was truncated because it contains too many characters.*/,
  `TOO_MANY_ADDITIONAL_IMAGE_LINKS` long /*Item has a additional_image_link value that exceed the limit for additional images, this item will be published without some of your images.*/,
  `UTM_SOURCE_AUTO_CORRECTED` long /*Item includes an utm_source value that is formatted incorrectly and has been automatically corrected.*/,
  `VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED` long /*A video is required in the item when ad_video fields are provided.*/,
  `WEIGHT_UNIT_INVALID` long /*Item has a weight_unit value that is formatted incorrectly, this item will be published without a weight unit.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsBatch` generated from model 'catalogsItemsBatch'
-- Object describing the catalogs items batch
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsBatch` (
  `catalog_type` text NOT NULL,
  `created_time` datetime NOT NULL /*Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss*/,
  `batch_id` text /*Id of the catalogs items batch*/,
  `completed_time` datetime /*Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss*/,
  `status` long
);  /*Object describing the catalogs items batch*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsBatchCreativeAssetsProcessingRecord` generated from model 'CatalogsItemsBatchCreativeAssetsProcessingRecord'

CREATE TABLE IF NOT EXISTS `CatalogsItemsBatchCreativeAssetsProcessingRecord` (
  `catalogsItemsBatch` long NOT NULL
  `creativeAssetsProcessingRecord` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsBatchPostRequest` generated from model 'catalogsItemsBatchPostRequest'
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsBatchPostRequest` (
  `catalog_type` text NOT NULL,
  `country` long NOT NULL,
  `language` text NOT NULL /*We recommend using the CatalogsLocale values.*/,
  `operation` text NOT NULL,
  `catalog_id` text /*Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsBatchPostRequestItemDeleteBatchRecord` generated from model 'CatalogsItemsBatchPostRequestItemDeleteBatchRecord'

CREATE TABLE IF NOT EXISTS `CatalogsItemsBatchPostRequestItemDeleteBatchRecord` (
  `catalogsItemsBatchPostRequest` long NOT NULL
  `itemDeleteBatchRecord` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsBatchRequest` generated from model 'catalogsItemsBatchRequest'
-- Request object of catalogs items batch
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsBatchRequest` (
  `country` long NOT NULL,
  `language` text NOT NULL /*We recommend using the CatalogsLocale values.*/,
  `operation` text NOT NULL
);  /*Request object of catalogs items batch*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsBatchRequestItemDeleteBatchRecord` generated from model 'CatalogsItemsBatchRequestItemDeleteBatchRecord'

CREATE TABLE IF NOT EXISTS `CatalogsItemsBatchRequestItemDeleteBatchRecord` (
  `catalogsItemsBatchRequest` long NOT NULL
  `itemDeleteBatchRecord` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsCreateBatchRequest` generated from model 'catalogsItemsCreateBatchRequest'
-- Request object to create catalogs items
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsCreateBatchRequest` (
  `country` long NOT NULL,
  `language` text NOT NULL /*We recommend using the CatalogsLocale values.*/,
  `operation` text NOT NULL
);  /*Request object to create catalogs items*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsCreateBatchRequestItemCreateBatchRecord` generated from model 'CatalogsItemsCreateBatchRequestItemCreateBatchRecord'

CREATE TABLE IF NOT EXISTS `CatalogsItemsCreateBatchRequestItemCreateBatchRecord` (
  `catalogsItemsCreateBatchRequest` long NOT NULL
  `itemCreateBatchRecord` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsDeleteBatchRequest` generated from model 'catalogsItemsDeleteBatchRequest'
-- Request object to delete catalogs items
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsDeleteBatchRequest` (
  `country` long NOT NULL,
  `language` text NOT NULL /*We recommend using the CatalogsLocale values.*/,
  `operation` text NOT NULL
);  /*Request object to delete catalogs items*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsDeleteBatchRequestItemDeleteBatchRecord` generated from model 'CatalogsItemsDeleteBatchRequestItemDeleteBatchRecord'

CREATE TABLE IF NOT EXISTS `CatalogsItemsDeleteBatchRequestItemDeleteBatchRecord` (
  `catalogsItemsDeleteBatchRequest` long NOT NULL
  `itemDeleteBatchRecord` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsDeleteDiscontinuedBatchRequest` generated from model 'catalogsItemsDeleteDiscontinuedBatchRequest'
-- Request object to discontinue catalogs items
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsDeleteDiscontinuedBatchRequest` (
  `country` long NOT NULL,
  `language` text NOT NULL /*We recommend using the CatalogsLocale values.*/,
  `operation` text NOT NULL
);  /*Request object to discontinue catalogs items*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsDeleteDiscontinuedBatchRequestItemDeleteDiscontinuedBatchRecord` generated from model 'CatalogsItemsDeleteDiscontinuedBatchRequestItemDeleteDiscontinuedBatchRecord'

CREATE TABLE IF NOT EXISTS `CatalogsItemsDeleteDiscontinuedBatchRequestItemDeleteDiscontinuedBatchRecord` (
  `catalogsItemsDeleteDiscontinuedBatchRequest` long NOT NULL
  `itemDeleteDiscontinuedBatchRecord` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsPostFilters` generated from model 'catalogsItemsPostFilters'
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsPostFilters` (
  `catalog_type` text NOT NULL,
  `catalog_id` text /*Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsPostFiltersItemIds` generated from model 'CatalogsItemsPostFiltersItemIds'

CREATE TABLE IF NOT EXISTS `CatalogsItemsPostFiltersItemIds` (
  `catalogsItemsPostFilters` long NOT NULL
  `itemIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsPostFiltersHotelIds` generated from model 'CatalogsItemsPostFiltersHotelIds'

CREATE TABLE IF NOT EXISTS `CatalogsItemsPostFiltersHotelIds` (
  `catalogsItemsPostFilters` long NOT NULL
  `hotelIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsPostFiltersCreativeAssetsIds` generated from model 'CatalogsItemsPostFiltersCreativeAssetsIds'

CREATE TABLE IF NOT EXISTS `CatalogsItemsPostFiltersCreativeAssetsIds` (
  `catalogsItemsPostFilters` long NOT NULL
  `creativeAssetsIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsRequest` generated from model 'catalogsItemsRequest'
-- Request object of catalogs items
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsRequest` (
  `country` long NOT NULL,
  `filters` long NOT NULL,
  `language` text NOT NULL /*We recommend using the CatalogsLocale values.*/
);  /*Request object of catalogs items*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsUpdateBatchRequest` generated from model 'catalogsItemsUpdateBatchRequest'
-- Request object to update catalogs items
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsUpdateBatchRequest` (
  `country` long NOT NULL,
  `language` text NOT NULL /*We recommend using the CatalogsLocale values.*/,
  `operation` text NOT NULL
);  /*Request object to update catalogs items*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsUpdateBatchRequestItemUpdateBatchRecord` generated from model 'CatalogsItemsUpdateBatchRequestItemUpdateBatchRecord'

CREATE TABLE IF NOT EXISTS `CatalogsItemsUpdateBatchRequestItemUpdateBatchRecord` (
  `catalogsItemsUpdateBatchRequest` long NOT NULL
  `itemUpdateBatchRecord` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsUpsertBatchRequest` generated from model 'catalogsItemsUpsertBatchRequest'
-- Request object to upsert catalogs items
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsUpsertBatchRequest` (
  `country` long NOT NULL,
  `language` text NOT NULL /*We recommend using the CatalogsLocale values.*/,
  `operation` text NOT NULL
);  /*Request object to upsert catalogs items*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsUpsertBatchRequestItemUpsertBatchRecord` generated from model 'CatalogsItemsUpsertBatchRequestItemUpsertBatchRecord'

CREATE TABLE IF NOT EXISTS `CatalogsItemsUpsertBatchRequestItemUpsertBatchRecord` (
  `catalogsItemsUpsertBatchRequest` long NOT NULL
  `itemUpsertBatchRecord` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `catalogs_list_200_response` generated from model 'catalogsList200Response'
--

CREATE TABLE IF NOT EXISTS `catalogs_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsList200ResponseCatalog` generated from model 'CatalogsList200ResponseCatalog'

CREATE TABLE IF NOT EXISTS `CatalogsList200ResponseCatalog` (
  `catalogsList200Response` long NOT NULL
  `catalog` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsListProductsByFeedBasedFilter` generated from model 'catalogsListProductsByFeedBasedFilter'
-- Request object to list products for a given feed_id and product group filter.
--

CREATE TABLE IF NOT EXISTS `CatalogsListProductsByFeedBasedFilter` (
  `feed_id` text NOT NULL /*Catalog Feed id pertaining to the catalog product group filter.*/,
  `filters` long NOT NULL
);  /*Request object to list products for a given feed_id and product group filter.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsListProductsByFilterRequest` generated from model 'catalogsListProductsByFilterRequest'
-- Request object to list products for a given product group filter.
--

CREATE TABLE IF NOT EXISTS `CatalogsListProductsByFilterRequest` (
  `feed_id` text NOT NULL /*Catalog Feed id pertaining to the catalog product group filter.*/,
  `filters` long NOT NULL,
  `catalog_id` text NOT NULL /*Catalog ID pertaining to the product group.*/,
  `catalog_type` text NOT NULL,
  `country` long NOT NULL,
  `locale` long NOT NULL
);  /*Request object to list products for a given product group filter.*/


-- --------------------------------------------------------------------------
-- Table structure for table `catalogs_local_stores_create_200_response_inner` generated from model 'catalogsLocalStoresCreate200ResponseInner'
--

CREATE TABLE IF NOT EXISTS `catalogs_local_stores_create_200_response_inner` (
  `data` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `catalogs_local_stores_create_200_response_inner_data` generated from model 'catalogsLocalStoresCreate200ResponseInnerData'
-- Created/updated resource on success or error details on failure
--

CREATE TABLE IF NOT EXISTS `catalogs_local_stores_create_200_response_inner_data` (
  `country` long NOT NULL /*Country code where the store is located.*/,
  `created_at` datetime NOT NULL /*Creation timestamp*/,
  `id` text NOT NULL PRIMARY KEY /*The ID of the local store.*/,
  `name` text NOT NULL /*The name of the local store.*/,
  `store_code` text NOT NULL /*Merchant provided code for the local store. Unique within the merchant&#39;s catalog.*/,
  `updated_at` datetime NOT NULL /*Last update timestamp*/,
  `exceptions` long NOT NULL,
  `address_primary` text /*Primary address line of the store.*/,
  `address_secondary` text /*Secondary address line of the store.*/,
  `city` text /*City where the store is located.*/,
  `latitude` float /*Geographic latitude coordinate of the store.*/,
  `longitude` float /*Geographic longitude coordinate of the store.*/,
  `postal_code` text /*Postal or ZIP code of the store.*/,
  `region` text /*State or region code where the store is located.*/
);  /*Created/updated resource on success or error details on failure*/


-- --------------------------------------------------------------------------
-- Table structure for table `catalogs_local_stores_create_200_response_inner_data_oneOf` generated from model 'catalogsLocalStoresCreate200ResponseInnerDataOneOf'
--

CREATE TABLE IF NOT EXISTS `catalogs_local_stores_create_200_response_inner_data_oneOf` (
  `id` text NOT NULL PRIMARY KEY /*The ID of the local store.*/,
  `exceptions` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `catalogs_local_stores_delete_200_response_inner` generated from model 'catalogsLocalStoresDelete200ResponseInner'
--

CREATE TABLE IF NOT EXISTS `catalogs_local_stores_delete_200_response_inner` (
  `id` text NOT NULL PRIMARY KEY /*The ID of the local store.*/,
  `status` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `catalogs_local_stores_list_200_response` generated from model 'catalogsLocalStoresList200Response'
--

CREATE TABLE IF NOT EXISTS `catalogs_local_stores_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsLocalStoresList200ResponseLocalStore` generated from model 'CatalogsLocalStoresList200ResponseLocalStore'

CREATE TABLE IF NOT EXISTS `CatalogsLocalStoresList200ResponseLocalStore` (
  `catalogsLocalStoresList200Response` long NOT NULL
  `localStore` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProduct` generated from model 'catalogsProduct'
--

CREATE TABLE IF NOT EXISTS `CatalogsProduct` (
  `catalog_type` text NOT NULL,
  `metadata` long NOT NULL,
  `pin` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupCreateRequest` generated from model 'catalogsProductGroupCreateRequest'
-- Request object for creating a product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupCreateRequest` (
  `feed_id` text NOT NULL /*Catalog Feed id pertaining to the catalog product group.*/,
  `filters` long NOT NULL,
  `name` text NOT NULL,
  `description` text,
  `is_featured` boolean /*boolean indicator of whether the product group is being featured or not*/
);  /*Request object for creating a product group.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupCurrencyCriteria` generated from model 'catalogsProductGroupCurrencyCriteria'
-- A currency filter. This filter cannot be negated
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupCurrencyCriteria` (
  `values` long NOT NULL,
  `negated` boolean
);  /*A currency filter. This filter cannot be negated*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupFilterKeys` generated from model 'catalogsProductGroupFilterKeys'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFilterKeys` (
  `MIN_PRICE` long NOT NULL,
  `MAX_PRICE` long NOT NULL,
  `CURRENCY` long NOT NULL,
  `ITEM_ID` long NOT NULL,
  `AVAILABILITY` long NOT NULL,
  `BRAND` long NOT NULL,
  `CONDITION` long NOT NULL,
  `CUSTOM_LABEL_0` long NOT NULL,
  `CUSTOM_LABEL_1` long NOT NULL,
  `CUSTOM_LABEL_2` long NOT NULL,
  `CUSTOM_LABEL_3` long NOT NULL,
  `CUSTOM_LABEL_4` long NOT NULL,
  `ITEM_GROUP_ID` long NOT NULL,
  `GENDER` long NOT NULL,
  `MEDIA_TYPE` long NOT NULL,
  `PRODUCT_TYPE_4` long NOT NULL,
  `PRODUCT_TYPE_3` long NOT NULL,
  `PRODUCT_TYPE_2` long NOT NULL,
  `PRODUCT_TYPE_1` long NOT NULL,
  `PRODUCT_TYPE_0` long NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_6` long NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_5` long NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_4` long NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_3` long NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_2` long NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_1` long NOT NULL,
  `GOOGLE_PRODUCT_CATEGORY_0` long NOT NULL,
  `CUSTOM_NUMBER_0` long NOT NULL,
  `CUSTOM_NUMBER_1` long NOT NULL,
  `CUSTOM_NUMBER_2` long NOT NULL,
  `CUSTOM_NUMBER_3` long NOT NULL,
  `CUSTOM_NUMBER_4` long NOT NULL,
  `TITLE_KEYWORDS` long NOT NULL,
  `PINTEREST_PRODUCT_CATEGORIES` long NOT NULL,
  `PRODUCT_GROUP` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupFilterOperatorTypeCriteria` generated from model 'catalogsProductGroupFilterOperatorTypeCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFilterOperatorTypeCriteria` (
  `filter_operator_type` long,
  `negated` boolean
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupFilterOperatorTypeCriteriaPropertyValues` generated from model 'CatalogsProductGroupFilterOperatorTypeCriteriaPropertyValues'

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFilterOperatorTypeCriteriaPropertyValues` (
  `catalogsProductGroupFilterOperatorTypeCriteria` long NOT NULL
  `propertyValues` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupFilters` generated from model 'catalogsProductGroupFilters'
-- Object holding a group of filters for a catalog product group
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFilters` (
);  /*Object holding a group of filters for a catalog product group*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupFiltersCatalogsProductGroupFilterKeys` generated from model 'CatalogsProductGroupFiltersCatalogsProductGroupFilterKeys'

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersCatalogsProductGroupFilterKeys` (
  `catalogsProductGroupFilters` long NOT NULL
  `catalogsProductGroupFilterKeys` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupFiltersCatalogsProductGroupFilterKeys` generated from model 'CatalogsProductGroupFiltersCatalogsProductGroupFilterKeys'

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersCatalogsProductGroupFilterKeys` (
  `catalogsProductGroupFilters` long NOT NULL
  `catalogsProductGroupFilterKeys` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupFiltersAllOf` generated from model 'catalogsProductGroupFiltersAllOf'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersAllOf` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupFiltersAllOfCatalogsProductGroupFilterKeys` generated from model 'CatalogsProductGroupFiltersAllOfCatalogsProductGroupFilterKeys'

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersAllOfCatalogsProductGroupFilterKeys` (
  `catalogsProductGroupFiltersAllOf` long NOT NULL
  `catalogsProductGroupFilterKeys` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupFiltersAnyOf` generated from model 'catalogsProductGroupFiltersAnyOf'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersAnyOf` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupFiltersAnyOfCatalogsProductGroupFilterKeys` generated from model 'CatalogsProductGroupFiltersAnyOfCatalogsProductGroupFilterKeys'

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersAnyOfCatalogsProductGroupFilterKeys` (
  `catalogsProductGroupFiltersAnyOf` long NOT NULL
  `catalogsProductGroupFilterKeys` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupFiltersRequest` generated from model 'catalogsProductGroupFiltersRequest'
-- Object holding a group of filters for request on catalog product group.  This is a distinct schema. It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersRequest` (
);  /*Object holding a group of filters for request on catalog product group.  This is a distinct schema. It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupFiltersRequestCatalogsProductGroupFilterKeys` generated from model 'CatalogsProductGroupFiltersRequestCatalogsProductGroupFilterKeys'

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersRequestCatalogsProductGroupFilterKeys` (
  `catalogsProductGroupFiltersRequest` long NOT NULL
  `catalogsProductGroupFilterKeys` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupFiltersRequestCatalogsProductGroupFilterKeys` generated from model 'CatalogsProductGroupFiltersRequestCatalogsProductGroupFilterKeys'

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersRequestCatalogsProductGroupFilterKeys` (
  `catalogsProductGroupFiltersRequest` long NOT NULL
  `catalogsProductGroupFilterKeys` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupFiltersRequestAnyOfItems0` generated from model 'catalogsProductGroupFiltersRequestAnyOfItems0'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersRequestAnyOfItems0` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupFiltersRequestAnyOfItems0CatalogsProductGroupFilterKeys` generated from model 'CatalogsProductGroupFiltersRequestAnyOfItems0CatalogsProductGroupFilterKeys'

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersRequestAnyOfItems0CatalogsProductGroupFilterKeys` (
  `catalogsProductGroupFiltersRequestAnyOfItems0` long NOT NULL
  `catalogsProductGroupFilterKeys` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupFiltersRequestAnyOfItems1` generated from model 'catalogsProductGroupFiltersRequestAnyOfItems1'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersRequestAnyOfItems1` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupFiltersRequestAnyOfItems1CatalogsProductGroupFilterKeys` generated from model 'CatalogsProductGroupFiltersRequestAnyOfItems1CatalogsProductGroupFilterKeys'

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersRequestAnyOfItems1CatalogsProductGroupFilterKeys` (
  `catalogsProductGroupFiltersRequestAnyOfItems1` long NOT NULL
  `catalogsProductGroupFilterKeys` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupMultipleCountriesCriteria` generated from model 'catalogsProductGroupMultipleCountriesCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleCountriesCriteria` (
  `negated` boolean
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupMultipleCountriesCriteriaCountry` generated from model 'CatalogsProductGroupMultipleCountriesCriteriaCountry'

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleCountriesCriteriaCountry` (
  `catalogsProductGroupMultipleCountriesCriteria` long NOT NULL
  `country` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupMultipleGenderCriteria` generated from model 'catalogsProductGroupMultipleGenderCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleGenderCriteria` (
  `negated` boolean
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupMultipleGenderCriteriaGender` generated from model 'CatalogsProductGroupMultipleGenderCriteriaGender'

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleGenderCriteriaGender` (
  `catalogsProductGroupMultipleGenderCriteria` long NOT NULL
  `gender` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupMultipleMediaTypesCriteria` generated from model 'catalogsProductGroupMultipleMediaTypesCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleMediaTypesCriteria` (
  `negated` boolean
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupMultipleMediaTypesCriteriaMediaType` generated from model 'CatalogsProductGroupMultipleMediaTypesCriteriaMediaType'

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleMediaTypesCriteriaMediaType` (
  `catalogsProductGroupMultipleMediaTypesCriteria` long NOT NULL
  `mediaType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupMultiplePinterestProductCategoryCriteria` generated from model 'catalogsProductGroupMultiplePinterestProductCategoryCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultiplePinterestProductCategoryCriteria` (
  `negated` boolean
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupMultiplePinterestProductCategoryCriteriaProductCategoryEnum` generated from model 'CatalogsProductGroupMultiplePinterestProductCategoryCriteriaProductCategoryEnum'

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultiplePinterestProductCategoryCriteriaProductCategoryEnum` (
  `catalogsProductGroupMultiplePinterestProductCategoryCriteria` long NOT NULL
  `productCategoryEnum` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupMultipleStringCriteria` generated from model 'catalogsProductGroupMultipleStringCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleStringCriteria` (
  `negated` boolean
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupMultipleStringCriteriaPropertyValues` generated from model 'CatalogsProductGroupMultipleStringCriteriaPropertyValues'

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleStringCriteriaPropertyValues` (
  `catalogsProductGroupMultipleStringCriteria` long NOT NULL
  `propertyValues` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupMultipleStringListCriteria` generated from model 'catalogsProductGroupMultipleStringListCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleStringListCriteria` (
  `negated` boolean
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupMultipleStringListCriteriaPropertyValues` generated from model 'CatalogsProductGroupMultipleStringListCriteriaPropertyValues'

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleStringListCriteriaPropertyValues` (
  `catalogsProductGroupMultipleStringListCriteria` long NOT NULL
  `propertyValues` blob NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `catalogs_product_group_pins_list_200_response` generated from model 'catalogsProductGroupPinsList200Response'
--

CREATE TABLE IF NOT EXISTS `catalogs_product_group_pins_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupPinsList200ResponseCatalogsProduct` generated from model 'CatalogsProductGroupPinsList200ResponseCatalogsProduct'

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupPinsList200ResponseCatalogsProduct` (
  `catalogsProductGroupPinsList200Response` long NOT NULL
  `catalogsProduct` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupPricingCriteria` generated from model 'catalogsProductGroupPricingCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupPricingCriteria` (
  `values` decimal NOT NULL,
  `inclusion` boolean,
  `negated` boolean
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupProductCountsVertical` generated from model 'catalogsProductGroupProductCountsVertical'
-- Product counts for a CatalogsProductGroup
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupProductCountsVertical` (
  `catalog_type` text NOT NULL,
  `in_stock` decimal NOT NULL,
  `out_of_stock` decimal NOT NULL,
  `preorder` decimal NOT NULL,
  `total` decimal NOT NULL,
  `videos` decimal NOT NULL,
  `app_links` decimal NOT NULL,
  `images` decimal NOT NULL
);  /*Product counts for a CatalogsProductGroup*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupUint32Criteria` generated from model 'catalogsProductGroupUint32Criteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupUint32Criteria` (
  `operator` long NOT NULL,
  `value` int UNSIGNED NOT NULL,
  `negated` boolean
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupUpdateManyRequestItemsOneOfItems0` generated from model 'catalogsProductGroupUpdateManyRequestItemsOneOfItems0'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupUpdateManyRequestItemsOneOfItems0` (
  `id` text NOT NULL PRIMARY KEY /*ID of the product group.*/,
  `description` text,
  `filters` long,
  `is_featured` boolean /*boolean indicator of whether the product group is being featured or not*/,
  `name` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupUpdateRequest` generated from model 'catalogsProductGroupUpdateRequest'
-- Request object for updating a product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupUpdateRequest` (
  `description` text,
  `filters` long,
  `is_featured` boolean /*boolean indicator of whether the product group is being featured or not*/,
  `name` text
);  /*Request object for updating a product group.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupsCreateManyRequestItems` generated from model 'catalogsProductGroupsCreateManyRequestItems'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupsCreateManyRequestItems` (
  `feed_id` text NOT NULL /*Catalog Feed id pertaining to the catalog product group.*/,
  `filters` long NOT NULL,
  `name` text NOT NULL,
  `catalog_id` text NOT NULL /*Catalog ID pertaining to the product group.*/,
  `catalog_type` text NOT NULL,
  `description` text,
  `is_featured` boolean /*boolean indicator of whether the product group is being featured or not*/,
  `country` long,
  `locale` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupsCreateRequestSchema` generated from model 'catalogsProductGroupsCreateRequestSchema'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupsCreateRequestSchema` (
  `feed_id` text NOT NULL /*Catalog Feed id pertaining to the catalog product group.*/,
  `filters` long NOT NULL,
  `name` text NOT NULL,
  `catalog_id` text NOT NULL /*Catalog ID pertaining to the product group.*/,
  `catalog_type` text NOT NULL,
  `description` text,
  `is_featured` boolean /*boolean indicator of whether the product group is being featured or not*/,
  `country` long,
  `locale` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `catalogs_product_groups_list_200_response` generated from model 'catalogsProductGroupsList200Response'
--

CREATE TABLE IF NOT EXISTS `catalogs_product_groups_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupsList200ResponseCatalogsVerticalProductGroup` generated from model 'CatalogsProductGroupsList200ResponseCatalogsVerticalProductGroup'

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupsList200ResponseCatalogsVerticalProductGroup` (
  `catalogsProductGroupsList200Response` long NOT NULL
  `catalogsVerticalProductGroup` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupsUpdateRequestSchema` generated from model 'catalogsProductGroupsUpdateRequestSchema'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupsUpdateRequestSchema` (
  `description` text,
  `filters` long,
  `is_featured` boolean /*boolean indicator of whether the product group is being featured or not*/,
  `name` text,
  `catalog_type` text,
  `country` long,
  `locale` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsReport` generated from model 'catalogsReport'
--

CREATE TABLE IF NOT EXISTS `CatalogsReport` (
  `report_status` text,
  `size` decimal /*Size of the report in bytes*/,
  `url` text /*URL to download the report*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsReportDistributionIssueFilter` generated from model 'catalogsReportDistributionIssueFilter'
--

CREATE TABLE IF NOT EXISTS `CatalogsReportDistributionIssueFilter` (
  `report_type` text NOT NULL,
  `catalog_id` text /*Unique identifier of a catalog. If not given, oldest catalog will be used*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsReportDistributionStats` generated from model 'catalogsReportDistributionStats'
--

CREATE TABLE IF NOT EXISTS `CatalogsReportDistributionStats` (
  `catalog_id` text /*ID of the catalog entity.*/,
  `code` int /*The event code that a diagnostics aggregated number references*/,
  `code_label` text /*A human-friendly label for the event code (e.g, &#39;SPAM&#39;)*/,
  `ineligible_for_ads` boolean /*Indicates if issue makes items ineligible for ads distribution*/,
  `ineligible_for_organic` boolean /*Indicates if issue makes items ineligible for organic distribution*/,
  `message` text /*Title message describing the diagnostic issue*/,
  `occurrences` int /*Number of occurrences of the issue*/,
  `report_type` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsReportFeedIngestionFilter` generated from model 'catalogsReportFeedIngestionFilter'
--

CREATE TABLE IF NOT EXISTS `CatalogsReportFeedIngestionFilter` (
  `feed_id` text NOT NULL /*ID of the feed entity.*/,
  `report_type` text NOT NULL,
  `processing_result_id` text /*Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsReportFeedIngestionStats` generated from model 'catalogsReportFeedIngestionStats'
--

CREATE TABLE IF NOT EXISTS `CatalogsReportFeedIngestionStats` (
  `catalog_id` text /*ID of the catalog entity.*/,
  `code` int /*The event code that a diagnostics aggregated number references*/,
  `code_label` text /*A human-friendly label for the event code (e.g, &#39;AVAILABILITY_INVALID&#39;)*/,
  `message` text /*Title message describing the diagnostic issue*/,
  `occurrences` int /*Number of occurrences of the issue*/,
  `report_type` text,
  `severity` text /*An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsReportParameters` generated from model 'catalogsReportParameters'
-- Report parameters
--

CREATE TABLE IF NOT EXISTS `CatalogsReportParameters` (
  `catalog_type` text NOT NULL,
  `report` long NOT NULL
);  /*Report parameters*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsReportStats` generated from model 'catalogsReportStats'
-- Diagnostics aggregated numbers
--

CREATE TABLE IF NOT EXISTS `CatalogsReportStats` (
  `catalog_id` text /*ID of the catalog entity.*/,
  `code` int /*The event code that a diagnostics aggregated number references*/,
  `code_label` text /*A human-friendly label for the event code (e.g, &#39;SPAM&#39;)*/,
  `message` text /*Title message describing the diagnostic issue*/,
  `occurrences` int /*Number of occurrences of the issue*/,
  `report_type` text,
  `severity` text /*An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue*/,
  `ineligible_for_ads` boolean /*Indicates if issue makes items ineligible for ads distribution*/,
  `ineligible_for_organic` boolean /*Indicates if issue makes items ineligible for organic distribution*/
);  /*Diagnostics aggregated numbers*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsReportStatsParameters` generated from model 'catalogsReportStatsParameters'
-- Report stats parameters
--

CREATE TABLE IF NOT EXISTS `CatalogsReportStatsParameters` (
  `catalog_type` text NOT NULL,
  `report` long NOT NULL
);  /*Report stats parameters*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailAvailableFilterValues` generated from model 'catalogsRetailAvailableFilterValues'
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailAvailableFilterValues` (
  `catalog_type` text NOT NULL,
  `filter_values` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailBatchRequest` generated from model 'catalogsRetailBatchRequest'
-- A request object that can have multiple operations on a single retail batch
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailBatchRequest` (
  `catalog_type` text NOT NULL,
  `country` long NOT NULL,
  `language` text NOT NULL /*We recommend using the CatalogsLocale values.*/,
  `catalog_id` text /*Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog*/
);  /*A request object that can have multiple operations on a single retail batch*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailBatchRequestCatalogsRetailBatchRequestItemsItems` generated from model 'CatalogsRetailBatchRequestCatalogsRetailBatchRequestItemsItems'

CREATE TABLE IF NOT EXISTS `CatalogsRetailBatchRequestCatalogsRetailBatchRequestItemsItems` (
  `catalogsRetailBatchRequest` long NOT NULL
  `catalogsRetailBatchRequestItemsItems` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailBatchRequestItemsItems` generated from model 'catalogsRetailBatchRequestItemsItems'
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailBatchRequestItemsItems` (
  `attributes` long NOT NULL,
  `item_id` text NOT NULL /*The catalog item id in the merchant namespace*/,
  `operation` text NOT NULL,
  `last_updated_time` long /*The millisecond timestamp when the item was lastly modified by the merchant.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailBatchRequestItemsItemsUpdateMaskFieldType` generated from model 'CatalogsRetailBatchRequestItemsItemsUpdateMaskFieldType'

CREATE TABLE IF NOT EXISTS `CatalogsRetailBatchRequestItemsItemsUpdateMaskFieldType` (
  `catalogsRetailBatchRequestItemsItems` long NOT NULL
  `updateMaskFieldType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFeed` generated from model 'catalogsRetailFeed'
-- Catalogs Retail Feed object
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailFeed` (
  `catalog_type` text NOT NULL,
  `created_at` datetime NOT NULL,
  `default_country` long NOT NULL,
  `default_locale` text NOT NULL /*The locale used within a feed for product descriptions.*/,
  `format` long NOT NULL,
  `id` text NOT NULL PRIMARY KEY /*ID of the feed entity.*/,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text NOT NULL /*A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.*/,
  `status` long NOT NULL,
  `updated_at` datetime NOT NULL,
  `credentials` long,
  `default_availability` long,
  `default_currency` long,
  `preferred_processing_schedule` long
);  /*Catalogs Retail Feed object*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFeedsCreateRequest` generated from model 'catalogsRetailFeedsCreateRequest'
-- Request object for creating a retail feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailFeedsCreateRequest` (
  `catalog_type` text NOT NULL,
  `default_country` long NOT NULL,
  `default_locale` long NOT NULL,
  `format` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text NOT NULL /*A human-friendly name associated to a given feed.*/,
  `catalog_id` text /*Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.*/,
  `credentials` long,
  `default_availability` long,
  `default_currency` long,
  `preferred_processing_schedule` long,
  `status` long
);  /*Request object for creating a retail feed.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFeedsUpdateRequest` generated from model 'catalogsRetailFeedsUpdateRequest'
-- Request object for updating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailFeedsUpdateRequest` (
  `catalog_type` text NOT NULL,
  `credentials` long,
  `default_availability` long,
  `default_currency` long,
  `format` long,
  `location` text /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text /*A human-friendly name associated to a given feed.*/,
  `preferred_processing_schedule` long,
  `status` long
);  /*Request object for updating a feed.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMap` generated from model 'catalogsRetailFilterValuesMap'
-- A map of filter attributes to their available values.
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMap` (
);  /*A map of filter attributes to their available values.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapAdImageTags` generated from model 'CatalogsRetailFilterValuesMapAdImageTags'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapAdImageTags` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `adImageTags` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapAdVideoTags` generated from model 'CatalogsRetailFilterValuesMapAdVideoTags'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapAdVideoTags` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `adVideoTags` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapProductAvailability` generated from model 'CatalogsRetailFilterValuesMapProductAvailability'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapProductAvailability` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `productAvailability` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapBrand` generated from model 'CatalogsRetailFilterValuesMapBrand'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapBrand` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `brand` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapProductCondition` generated from model 'CatalogsRetailFilterValuesMapProductCondition'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapProductCondition` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `productCondition` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapCustomLabel0` generated from model 'CatalogsRetailFilterValuesMapCustomLabel0'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapCustomLabel0` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `customLabel0` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapCustomLabel1` generated from model 'CatalogsRetailFilterValuesMapCustomLabel1'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapCustomLabel1` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `customLabel1` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapCustomLabel2` generated from model 'CatalogsRetailFilterValuesMapCustomLabel2'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapCustomLabel2` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `customLabel2` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapCustomLabel3` generated from model 'CatalogsRetailFilterValuesMapCustomLabel3'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapCustomLabel3` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `customLabel3` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapCustomLabel4` generated from model 'CatalogsRetailFilterValuesMapCustomLabel4'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapCustomLabel4` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `customLabel4` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapGender` generated from model 'CatalogsRetailFilterValuesMapGender'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapGender` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `gender` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapGoogleProductCategory0` generated from model 'CatalogsRetailFilterValuesMapGoogleProductCategory0'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapGoogleProductCategory0` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `googleProductCategory0` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapGoogleProductCategory1` generated from model 'CatalogsRetailFilterValuesMapGoogleProductCategory1'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapGoogleProductCategory1` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `googleProductCategory1` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapGoogleProductCategory2` generated from model 'CatalogsRetailFilterValuesMapGoogleProductCategory2'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapGoogleProductCategory2` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `googleProductCategory2` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapGoogleProductCategory3` generated from model 'CatalogsRetailFilterValuesMapGoogleProductCategory3'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapGoogleProductCategory3` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `googleProductCategory3` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapGoogleProductCategory4` generated from model 'CatalogsRetailFilterValuesMapGoogleProductCategory4'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapGoogleProductCategory4` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `googleProductCategory4` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapGoogleProductCategory5` generated from model 'CatalogsRetailFilterValuesMapGoogleProductCategory5'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapGoogleProductCategory5` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `googleProductCategory5` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapGoogleProductCategory6` generated from model 'CatalogsRetailFilterValuesMapGoogleProductCategory6'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapGoogleProductCategory6` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `googleProductCategory6` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapMediaType` generated from model 'CatalogsRetailFilterValuesMapMediaType'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapMediaType` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `mediaType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapProductType0` generated from model 'CatalogsRetailFilterValuesMapProductType0'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapProductType0` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `productType0` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapProductType1` generated from model 'CatalogsRetailFilterValuesMapProductType1'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapProductType1` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `productType1` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapProductType2` generated from model 'CatalogsRetailFilterValuesMapProductType2'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapProductType2` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `productType2` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapProductType3` generated from model 'CatalogsRetailFilterValuesMapProductType3'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapProductType3` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `productType3` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapProductType4` generated from model 'CatalogsRetailFilterValuesMapProductType4'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapProductType4` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `productType4` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailItemErrorResponse` generated from model 'catalogsRetailItemErrorResponse'
-- Object describing a retail item error
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailItemErrorResponse` (
  `catalog_type` text NOT NULL,
  `item_response_kind` text NOT NULL /*Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.*/,
  `item_id` text /*The catalog item id in the merchant namespace*/
);  /*Object describing a retail item error*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailItemErrorResponseItemValidationEvent` generated from model 'CatalogsRetailItemErrorResponseItemValidationEvent'

CREATE TABLE IF NOT EXISTS `CatalogsRetailItemErrorResponseItemValidationEvent` (
  `catalogsRetailItemErrorResponse` long NOT NULL
  `itemValidationEvent` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailItemResponse` generated from model 'catalogsRetailItemResponse'
-- Object describing a retail item record
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailItemResponse` (
  `catalog_type` text NOT NULL,
  `item_response_kind` text NOT NULL /*Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.*/,
  `attributes` long,
  `item_id` text /*The catalog retail item id in the merchant namespace*/,
);  /*Object describing a retail item record*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailItemResponsePin` generated from model 'CatalogsRetailItemResponsePin'

CREATE TABLE IF NOT EXISTS `CatalogsRetailItemResponsePin` (
  `catalogsRetailItemResponse` long NOT NULL
  `pin` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailItemsBatch` generated from model 'catalogsRetailItemsBatch'
-- Object describing the catalogs retail items batch
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailItemsBatch` (
  `catalog_type` text NOT NULL,
  `created_time` datetime NOT NULL /*Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion.*/,
  `batch_id` text /*Id of the catalogs items batch*/,
  `completed_time` datetime /*Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss*/,
  `status` long
);  /*Object describing the catalogs retail items batch*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailItemsBatchItemProcessingRecord` generated from model 'CatalogsRetailItemsBatchItemProcessingRecord'

CREATE TABLE IF NOT EXISTS `CatalogsRetailItemsBatchItemProcessingRecord` (
  `catalogsRetailItemsBatch` long NOT NULL
  `itemProcessingRecord` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailItemsPostFilter` generated from model 'catalogsRetailItemsPostFilter'
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailItemsPostFilter` (
  `catalog_type` text NOT NULL,
  `catalog_id` text /*Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailItemsPostFilterItemIds` generated from model 'CatalogsRetailItemsPostFilterItemIds'

CREATE TABLE IF NOT EXISTS `CatalogsRetailItemsPostFilterItemIds` (
  `catalogsRetailItemsPostFilter` long NOT NULL
  `itemIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailListProductsByCatalogBasedFilterRequest` generated from model 'catalogsRetailListProductsByCatalogBasedFilterRequest'
-- Request object to list products for a given retail catalog_id and product group filter.
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailListProductsByCatalogBasedFilterRequest` (
  `catalog_id` text NOT NULL /*Catalog ID pertaining to the product group.*/,
  `catalog_type` text NOT NULL /*Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.*/,
  `country` long NOT NULL,
  `filters` long NOT NULL,
  `locale` long NOT NULL
);  /*Request object to list products for a given retail catalog_id and product group filter.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailProduct` generated from model 'catalogsRetailProduct'
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailProduct` (
  `catalog_type` text NOT NULL,
  `metadata` long NOT NULL,
  `pin` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailProductGroup` generated from model 'catalogsRetailProductGroup'
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailProductGroup` (
  `catalog_id` text NOT NULL /*Catalog ID pertaining to the product group.*/,
  `catalog_type` text NOT NULL,
  `feed_id` text NOT NULL /*id of the catalogs feed belonging to this catalog product group*/,
  `filters` long NOT NULL,
  `id` text NOT NULL PRIMARY KEY /*ID of the catalog product group.*/,
  `type` long NOT NULL,
  `country` text,
  `created_at` int /*Unix timestamp in seconds of when catalog product group was created.*/,
  `description` text,
  `is_featured` boolean /*boolean indicator of whether the product group is being featured or not*/,
  `locale` text,
  `name` text /*Name of catalog product group*/,
  `status` long,
  `updated_at` int /*Unix timestamp in seconds of last time catalog product group was updated.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailProductGroupCreateRequest` generated from model 'catalogsRetailProductGroupCreateRequest'
-- Request object for creating a product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailProductGroupCreateRequest` (
  `catalog_id` text NOT NULL /*Catalog ID pertaining to the product group.*/,
  `catalog_type` text NOT NULL /*Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.*/,
  `filters` long NOT NULL,
  `name` text NOT NULL,
  `country` long,
  `description` text,
  `locale` long
);  /*Request object for creating a product group.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailProductGroupProductCounts` generated from model 'catalogsRetailProductGroupProductCounts'
-- Product counts for a Retail CatalogsProductGroup
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailProductGroupProductCounts` (
  `catalog_type` text NOT NULL,
  `in_stock` decimal NOT NULL,
  `out_of_stock` decimal NOT NULL,
  `preorder` decimal NOT NULL,
  `total` decimal NOT NULL,
  `videos` decimal
);  /*Product counts for a Retail CatalogsProductGroup*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailProductGroupUpdateRequest` generated from model 'catalogsRetailProductGroupUpdateRequest'
-- Request object for updating a retail product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailProductGroupUpdateRequest` (
  `catalog_type` text /*Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.*/,
  `country` long,
  `description` text,
  `filters` long,
  `locale` long,
  `name` text /*Name of catalog product group*/
);  /*Request object for updating a retail product group.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailProductMetadata` generated from model 'catalogsRetailProductMetadata'
-- Retail product metadata entity
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailProductMetadata` (
  `availability` long NOT NULL,
  `currency` long NOT NULL,
  `item_group_id` text NOT NULL /*The parent ID of the product.*/,
  `item_id` text NOT NULL /*The user-created unique ID that represents the product.*/,
  `price` decimal NOT NULL /*The price of the product.*/,
  `sale_price` decimal NOT NULL /*The discounted price of the product.*/
);  /*Retail product metadata entity*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailReportAllItemsFilter` generated from model 'catalogsRetailReportAllItemsFilter'
-- ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailReportAllItemsFilter` (
  `report_type` text NOT NULL,
  `catalog_id` text /*Unique identifier of a catalog. If not given, oldest catalog will be used*/,
  `product_group_id` text /*Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.*/
);  /*ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailReportParameters` generated from model 'catalogsRetailReportParameters'
-- Parameters for retail report
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailReportParameters` (
  `catalog_type` text NOT NULL,
  `report` long NOT NULL
);  /*Parameters for retail report*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailReportParametersReport` generated from model 'catalogsRetailReportParametersReport'
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailReportParametersReport` (
  `feed_id` text NOT NULL /*ID of the feed entity.*/,
  `report_type` text NOT NULL,
  `processing_result_id` text /*Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.*/,
  `catalog_id` text /*Unique identifier of a catalog. If not given, oldest catalog will be used*/,
  `product_group_id` text /*Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailReportStatsParameters` generated from model 'catalogsRetailReportStatsParameters'
-- Parameters for retail report
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailReportStatsParameters` (
  `catalog_type` text NOT NULL,
  `report` long NOT NULL
);  /*Parameters for retail report*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailReportStatsParametersReport` generated from model 'catalogsRetailReportStatsParametersReport'
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailReportStatsParametersReport` (
  `feed_id` text NOT NULL /*ID of the feed entity.*/,
  `report_type` text NOT NULL,
  `processing_result_id` text /*Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.*/,
  `catalog_id` text /*Unique identifier of a catalog. If not given, oldest catalog will be used*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsUpdatableCreativeAssetsAttributes` generated from model 'catalogsUpdatableCreativeAssetsAttributes'
--

CREATE TABLE IF NOT EXISTS `CatalogsUpdatableCreativeAssetsAttributes` (
  `android_deep_link` text /*Link to the creative assets page.*/,
  `custom_label_0` text /*Custom grouping of creative assets.*/,
  `custom_label_1` text /*Custom grouping of creative assets.*/,
  `custom_label_2` text /*Custom grouping of creative assets.*/,
  `custom_label_3` text /*Custom grouping of creative assets.*/,
  `custom_label_4` text /*Custom grouping of creative assets.*/,
  `description` text /*Brief description of the creative assets.*/,
  `google_product_category` text /*The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.*/,
  `ios_deep_link` text /*IOS deep link to the creative assets page.*/,
  `link` text /*Link to the creative assets page.*/,
  `title` text /*The name of the creative assets.*/,
  `visibility` text /*Visibility of the creative assets. Must be one of the following values (upper or lowercase): &#39;visible&#39;, &#39;hidden&#39;.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsUpdatableHotelAttributes` generated from model 'catalogsUpdatableHotelAttributes'
--

CREATE TABLE IF NOT EXISTS `CatalogsUpdatableHotelAttributes` (
  `address` long /*Hotel address*/,
  `base_price` text /*Base price of the hotel room per night followed by the ISO currency code*/,
  `brand` text /*The brand to which this hotel belongs to.*/,
  `category` text /*The type of property. The category can be any type of internal description desired.*/,
  `custom_label_0` text /*Custom grouping of hotels*/,
  `custom_label_1` text /*Custom grouping of hotels*/,
  `custom_label_2` text /*Custom grouping of hotels*/,
  `custom_label_3` text /*Custom grouping of hotels*/,
  `custom_label_4` text /*Custom grouping of hotels*/,
  `description` text /*Brief description of the hotel.*/,
  `guest_ratings` long /*If specified, you must provide all properties*/,
  `latitude` decimal /*Latitude of the hotel.*/,
  `link` text /*Link to the product page*/,
  `longitude` decimal /*Longitude of the hotel.*/,
  `name` text /*The hotel&#39;s name.*/,
  `sale_price` text /*Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsUpdatableHotelAttributesNeighborhood` generated from model 'CatalogsUpdatableHotelAttributesNeighborhood'

CREATE TABLE IF NOT EXISTS `CatalogsUpdatableHotelAttributesNeighborhood` (
  `catalogsUpdatableHotelAttributes` long NOT NULL
  `neighborhood` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsUpdateCreativeAssetsItem` generated from model 'catalogsUpdateCreativeAssetsItem'
-- A creative assets item to be updated.
--

CREATE TABLE IF NOT EXISTS `CatalogsUpdateCreativeAssetsItem` (
  `attributes` long NOT NULL,
  `creative_assets_id` text NOT NULL /*The catalog creative assets item id in the merchant namespace*/,
  `operation` text NOT NULL
);  /*A creative assets item to be updated.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsUpdateHotelItem` generated from model 'catalogsUpdateHotelItem'
-- Object describing an hotel item batch record
--

CREATE TABLE IF NOT EXISTS `CatalogsUpdateHotelItem` (
  `attributes` long NOT NULL,
  `hotel_id` text NOT NULL /*The catalog hotel item id in the merchant namespace*/,
  `operation` text NOT NULL
);  /*Object describing an hotel item batch record*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsUpdateRetailItem` generated from model 'catalogsUpdateRetailItem'
-- An item to be updated
--

CREATE TABLE IF NOT EXISTS `CatalogsUpdateRetailItem` (
  `attributes` long NOT NULL,
  `item_id` text NOT NULL /*The catalog item id in the merchant namespace*/,
  `operation` text NOT NULL,
);  /*An item to be updated*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsUpdateRetailItemUpdateMaskFieldType` generated from model 'CatalogsUpdateRetailItemUpdateMaskFieldType'

CREATE TABLE IF NOT EXISTS `CatalogsUpdateRetailItemUpdateMaskFieldType` (
  `catalogsUpdateRetailItem` long NOT NULL
  `updateMaskFieldType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsUpsertCreativeAssetsItem` generated from model 'catalogsUpsertCreativeAssetsItem'
-- A creative assets item to be upserted.
--

CREATE TABLE IF NOT EXISTS `CatalogsUpsertCreativeAssetsItem` (
  `attributes` long NOT NULL,
  `creative_assets_id` text NOT NULL /*The catalog creative assets id in the merchant namespace*/,
  `operation` text NOT NULL
);  /*A creative assets item to be upserted.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsUpsertHotelItem` generated from model 'catalogsUpsertHotelItem'
-- A hotel item to be upserted.
--

CREATE TABLE IF NOT EXISTS `CatalogsUpsertHotelItem` (
  `attributes` long NOT NULL,
  `hotel_id` text NOT NULL /*The catalog hotel id in the merchant namespace*/,
  `operation` text NOT NULL
);  /*A hotel item to be upserted.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsUpsertRetailItem` generated from model 'catalogsUpsertRetailItem'
-- An item to be upserted
--

CREATE TABLE IF NOT EXISTS `CatalogsUpsertRetailItem` (
  `attributes` long NOT NULL,
  `item_id` text NOT NULL /*The catalog item id in the merchant namespace*/,
  `operation` text NOT NULL
);  /*An item to be upserted*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsVerticalBatchRequest` generated from model 'catalogsVerticalBatchRequest'
-- A request object that can have multiple operations on a single batch
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalBatchRequest` (
  `catalog_type` text NOT NULL,
  `country` long NOT NULL,
  `language` text NOT NULL /*We recommend using the CatalogsLocale values.*/,
  `catalog_id` text /*Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog*/
);  /*A request object that can have multiple operations on a single batch*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsVerticalBatchRequestCatalogsCreativeAssetsBatchItem` generated from model 'CatalogsVerticalBatchRequestCatalogsCreativeAssetsBatchItem'

CREATE TABLE IF NOT EXISTS `CatalogsVerticalBatchRequestCatalogsCreativeAssetsBatchItem` (
  `catalogsVerticalBatchRequest` long NOT NULL
  `catalogsCreativeAssetsBatchItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsVerticalFeedsCreateRequest` generated from model 'catalogsVerticalFeedsCreateRequest'
-- Request object for creating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalFeedsCreateRequest` (
  `catalog_type` text NOT NULL,
  `default_country` long NOT NULL,
  `default_locale` long NOT NULL,
  `format` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text NOT NULL /*A human-friendly name associated to a given feed.*/,
  `catalog_id` text /*Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.*/,
  `credentials` long,
  `default_availability` long,
  `default_currency` long,
  `preferred_processing_schedule` long,
  `status` long
);  /*Request object for creating a feed.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsVerticalFeedsUpdateRequest` generated from model 'catalogsVerticalFeedsUpdateRequest'
-- Request object for updating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalFeedsUpdateRequest` (
  `catalog_type` text NOT NULL,
  `credentials` long,
  `default_availability` long,
  `default_currency` long,
  `format` long,
  `location` text /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text /*A human-friendly name associated to a given feed.*/,
  `preferred_processing_schedule` long,
  `status` long
);  /*Request object for updating a feed.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsVerticalProductGroup` generated from model 'catalogsVerticalProductGroup'
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalProductGroup` (
  `catalog_id` text NOT NULL /*Catalog ID pertaining to the product group.*/,
  `catalog_type` text NOT NULL,
  `feed_id` text NOT NULL /*id of the catalogs feed belonging to this catalog product group*/,
  `filters` long NOT NULL,
  `id` text NOT NULL PRIMARY KEY /*ID of the catalog product group.*/,
  `type` long NOT NULL,
  `country` text,
  `created_at` int /*Unix timestamp in seconds of when catalog product group was created.*/,
  `description` text,
  `is_featured` boolean /*boolean indicator of whether the product group is being featured or not*/,
  `locale` text,
  `name` text /*Name of catalog product group*/,
  `status` long,
  `updated_at` int /*Unix timestamp in seconds of last time catalog product group was updated.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsVerticalProductGroupCreateRequest` generated from model 'catalogsVerticalProductGroupCreateRequest'
-- Request object for creating a catalog based product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalProductGroupCreateRequest` (
  `catalog_id` text NOT NULL /*Catalog ID pertaining to the product group.*/,
  `catalog_type` text NOT NULL,
  `filters` long NOT NULL,
  `name` text NOT NULL,
  `country` long,
  `description` text,
  `locale` long
);  /*Request object for creating a catalog based product group.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsVerticalProductGroupUpdateRequest` generated from model 'catalogsVerticalProductGroupUpdateRequest'
-- Request object for updating a catalog based product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalProductGroupUpdateRequest` (
  `catalog_type` text,
  `country` long,
  `description` text,
  `filters` long,
  `locale` long,
  `name` text /*Name of catalog product group*/
);  /*Request object for updating a catalog based product group.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsVerticalsListProductsByCatalogBasedFilterRequest` generated from model 'catalogsVerticalsListProductsByCatalogBasedFilterRequest'
-- Request object to list products for a given catalog_id and product group filter.
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalsListProductsByCatalogBasedFilterRequest` (
  `catalog_id` text NOT NULL /*Catalog ID pertaining to the product group.*/,
  `catalog_type` text NOT NULL,
  `country` long NOT NULL,
  `filters` long NOT NULL,
  `locale` long NOT NULL
);  /*Request object to list products for a given catalog_id and product group filter.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ConditionFilter` generated from model 'conditionFilter'
--

CREATE TABLE IF NOT EXISTS `ConditionFilter` (
  `CONDITION` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionAccessToken` generated from model 'conversionAccessToken'
-- A successful conversion access token response.
--

CREATE TABLE IF NOT EXISTS `ConversionAccessToken` (
  `access_token` text NOT NULL,
  `token_type` text
);  /*A successful conversion access token response.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionApiResponseEventsItems` generated from model 'conversionApiResponseEventsItems'
--

CREATE TABLE IF NOT EXISTS `ConversionApiResponseEventsItems` (
  `status` long NOT NULL /*Whether the event was processed successfully.*/,
  `error_message` text /*Error message containing more information about why the event failed to be processed.*/,
  `warning_message` text /*Warning messages about any fields in the event which are not standard. These are not critical to event processing.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionDeletionRequest` generated from model 'conversionDeletionRequest'
-- Conversion deletion request
--

CREATE TABLE IF NOT EXISTS `ConversionDeletionRequest` (
  `created_time` date NOT NULL /*Timestamp when the conversion deletion request was succesfully created.*/,
  `request_id` text NOT NULL /*Unique identifier of the conversion deletion request*/,
  `status` long NOT NULL /*Represents the status of the conversion deletion request. \&quot;PENDING\&quot; or \&quot;SUBMITTED\&quot;. \&quot;PENDING\&quot; meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \&quot;SUBMITTED\&quot; meaning that the Data Deletion process has begun and can no longer be canceled.*/,
  `processed_time` date /*Timestamp when the conversion deletion request was processed.*/
);  /*Conversion deletion request*/


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionDeletionRequestCreate` generated from model 'conversionDeletionRequestCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `ConversionDeletionRequestCreate` (
  `deletion_targets` long NOT NULL /*Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.*/
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionDeletionRequestEPIKTargets` generated from model 'conversionDeletionRequestEPIKTargets'
--

CREATE TABLE IF NOT EXISTS `ConversionDeletionRequestEPIKTargets` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionDeletionRequestEPIKTargetsEpiks` generated from model 'ConversionDeletionRequestEPIKTargetsEpiks'

CREATE TABLE IF NOT EXISTS `ConversionDeletionRequestEPIKTargetsEpiks` (
  `conversionDeletionRequestEPIKTargets` long NOT NULL
  `epiks` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `conversion_deletion_request_list_200_response` generated from model 'conversionDeletionRequestList200Response'
--

CREATE TABLE IF NOT EXISTS `conversion_deletion_request_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionDeletionRequestList200ResponseConversionDeletionRequest` generated from model 'ConversionDeletionRequestList200ResponseConversionDeletionRequest'

CREATE TABLE IF NOT EXISTS `ConversionDeletionRequestList200ResponseConversionDeletionRequest` (
  `conversionDeletionRequestList200Response` long NOT NULL
  `conversionDeletionRequest` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionDeletionRequestTargets` generated from model 'conversionDeletionRequestTargets'
--

CREATE TABLE IF NOT EXISTS `ConversionDeletionRequestTargets` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionDeletionRequestTargetsUserEmails` generated from model 'ConversionDeletionRequestTargetsUserEmails'

CREATE TABLE IF NOT EXISTS `ConversionDeletionRequestTargetsUserEmails` (
  `conversionDeletionRequestTargets` long NOT NULL
  `userEmails` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionDeletionRequestTargetsEpiks` generated from model 'ConversionDeletionRequestTargetsEpiks'

CREATE TABLE IF NOT EXISTS `ConversionDeletionRequestTargetsEpiks` (
  `conversionDeletionRequestTargets` long NOT NULL
  `epiks` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionDeletionRequestUserEmailTargets` generated from model 'conversionDeletionRequestUserEmailTargets'
--

CREATE TABLE IF NOT EXISTS `ConversionDeletionRequestUserEmailTargets` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionDeletionRequestUserEmailTargetsUserEmails` generated from model 'ConversionDeletionRequestUserEmailTargetsUserEmails'

CREATE TABLE IF NOT EXISTS `ConversionDeletionRequestUserEmailTargetsUserEmails` (
  `conversionDeletionRequestUserEmailTargets` long NOT NULL
  `userEmails` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventAppInfo` generated from model 'conversionEventAppInfo'
-- Object containing information about the application where event occurred.
--

CREATE TABLE IF NOT EXISTS `ConversionEventAppInfo` (
  `app_id` text /*App ID in Google Play Store, AppStore or other stores.*/,
  `app_name` text /*Name of the app. Primarily used for Mobile Apps.*/,
  `app_package_name` text /*App package name*/,
  `app_store` text /*The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps*/,
  `app_version` text /*App version. Primarily used for mobile apps*/,
  `install_time` int UNSIGNED /*App install time. Unix timestamp in seconds*/,
  `user_agent` text /*User Agent request header. Primarily used for Web events*/,
  `window_height` int UNSIGNED /*Inner height of the window or viewport.*/,
  `window_width` int UNSIGNED /*Inner width of the window or viewport.*/
);  /*Object containing information about the application where event occurred.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventDeviceInfo` generated from model 'conversionEventDeviceInfo'
-- Object containing information about the device where event occurred.
--

CREATE TABLE IF NOT EXISTS `ConversionEventDeviceInfo` (
  `battery_level` int UNSIGNED /*Battery charge level percentage*/,
  `brand` text /*Device brand*/,
  `carrier` text /*User device&#39;s mobile carrier.*/,
  `cpu_cores` int UNSIGNED /*Number of CPU cores*/,
  `external_storage_free_space` int UNSIGNED /*External storage size in GB*/,
  `external_storage_size` int UNSIGNED /*External storage size in GB*/,
  `form_factor` long /*Device form factor*/,
  `kernel_version` text /*Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release*/,
  `locale` text /*Device locale BCP-47 format*/,
  `model` text /*Device model name*/,
  `network_type` long /*Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()*/,
  `os_family` long /*OS Family*/,
  `os_name` text /*Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch*/,
  `os_release_name` text /*Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin*/,
  `os_version` text /*Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04*/,
  `screen_density` int UNSIGNED /*Screen density, PPI*/,
  `screen_height` int UNSIGNED /*Screen height in pixels*/,
  `screen_width` int UNSIGNED /*Screen width in pixels*/,
  `storage_free_space` int UNSIGNED /*Internal storage size in GB*/,
  `storage_size` int UNSIGNED /*Internal storage size in GB*/,
  `timezone` text /*Device timezone*/,
  `timezone_abbr` text /*Timezone abbreviation*/,
  `type` text /*Device type*/
);  /*Object containing information about the device where event occurred.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventDeviceInfoLanguages` generated from model 'ConversionEventDeviceInfoLanguages'

CREATE TABLE IF NOT EXISTS `ConversionEventDeviceInfoLanguages` (
  `conversionEventDeviceInfo` long NOT NULL
  `languages` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventResponse` generated from model 'conversionEventResponse'
--

CREATE TABLE IF NOT EXISTS `ConversionEventResponse` (
  `ad_account_id` text /*Id of the ad account.*/,
  `conversion_event` long,
  `conversion_tag_id` text /*Id of the tag.*/,
  `created_time` int /*Creation date in epoch format.*/,
  `reporting_conversion_event` text /*For advertiser-defined events, the reporting event label shown in optimization UIs.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEvents` generated from model 'conversionEvents'
-- Conversion events.
--

CREATE TABLE IF NOT EXISTS `ConversionEvents` (
  `num_events_processed` int NOT NULL /*Number of events that were successfully processed from the events.*/,
  `num_events_received` int NOT NULL /*Total number of events received in the request.*/
);  /*Conversion events.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsConversionApiResponseEventsItems` generated from model 'ConversionEventsConversionApiResponseEventsItems'

CREATE TABLE IF NOT EXISTS `ConversionEventsConversionApiResponseEventsItems` (
  `conversionEvents` long NOT NULL
  `conversionApiResponseEventsItems` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsCreate` generated from model 'conversionEventsCreate'
-- Conversion events.
--

CREATE TABLE IF NOT EXISTS `ConversionEventsCreate` (
);  /*Conversion events.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsCreateConversionEventsDataItems` generated from model 'ConversionEventsCreateConversionEventsDataItems'

CREATE TABLE IF NOT EXISTS `ConversionEventsCreateConversionEventsDataItems` (
  `conversionEventsCreate` long NOT NULL
  `conversionEventsDataItems` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsDataItems` generated from model 'conversionEventsDataItems'
--

CREATE TABLE IF NOT EXISTS `ConversionEventsDataItems` (
  `action_source` text NOT NULL /*The source indicating where the conversion event occurred. - &#x60;app_android&#x60; - &#x60;app_ios&#x60; - &#x60;web&#x60; - &#x60;offline&#x60;*/,
  `event_id` text NOT NULL /*A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.*/,
  `event_name` text NOT NULL /*The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - &#x60;add_payment_info&#x60; - &#x60;add_to_cart&#x60; - &#x60;add_to_wishlist&#x60; - &#x60;app_install&#x60; - &#x60;app_open&#x60; - &#x60;checkout&#x60; - &#x60;contact&#x60; - &#x60;custom&#x60; - &#x60;customize_product&#x60; - &#x60;find_location&#x60; - &#x60;initiate_checkout&#x60; - &#x60;lead&#x60; - &#x60;page_visit&#x60; - &#x60;schedule&#x60; - &#x60;search&#x60; - &#x60;signup&#x60; - &#x60;start_trial&#x60; - &#x60;submit_application&#x60; - &#x60;subscribe&#x60; - &#x60;view_category&#x60; - &#x60;view_content&#x60; - &#x60;watch_video&#x60;*/,
  `event_time` long NOT NULL /*The time when the event happened. Unix timestamp in seconds.*/,
  `user_data` long NOT NULL /*Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.*/,
  `app_id` text /*The app store app ID.*/,
  `app_info` long,
  `app_name` text /*Name of the app.*/,
  `app_version` text /*Version of the app.*/,
  `custom_data` long,
  `device_brand` text /*Brand of the user device.*/,
  `device_carrier` text /*User device&#39;s mobile carrier.*/,
  `device_info` long,
  `device_model` text /*Model of the user device.*/,
  `device_type` text /*Type of the user device.*/,
  `event_source_url` text /*URL of the web conversion event.*/,
  `language` text /*Two-character ISO-639-1 language code indicating the user&#39;s language.*/,
  `opt_out` boolean /*When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.*/,
  `os_version` text /*Version of the device operating system.*/,
  `partner_name` text /*The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g &#39;ss-shopify&#39;*/,
  `wifi` boolean /*Whether the event occurred when the user device was connected to wifi.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsDataItemsCustomData` generated from model 'conversionEventsDataItemsCustomData'
-- Object containing other custom data.
--

CREATE TABLE IF NOT EXISTS `ConversionEventsDataItemsCustomData` (
  `content_brand` text /*The brand of the content associated with the event.*/,
  `content_category` text /*The category of the content associated with the event.*/,
  `content_name` text /*The name of the page or product associated with the event.*/,
  `currency` text /*The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.*/,
  `external_measurement_id` text /*Only use when instructed.*/,
  `external_measurement_vendor_id` int /*Only use when instructed.*/,
  `np` text /*Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.*/,
  `num_items` long /*Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).*/,
  `opt_out_type` text /*Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer&#39;s guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter.*/,
  `order_id` text /*The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.*/,
  `predicted_ltv` text /*Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.*/,
  `search_string` text /*The search string related to the user conversion event.*/,
  `value` text /*Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.*/
);  /*Object containing other custom data.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsDataItemsCustomDataContentIds` generated from model 'ConversionEventsDataItemsCustomDataContentIds'

CREATE TABLE IF NOT EXISTS `ConversionEventsDataItemsCustomDataContentIds` (
  `conversionEventsDataItemsCustomData` long NOT NULL
  `contentIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsDataItemsCustomDataConversionEventsDataItemsCustomDataContentsItems` generated from model 'ConversionEventsDataItemsCustomDataConversionEventsDataItemsCustomDataContentsItems'

CREATE TABLE IF NOT EXISTS `ConversionEventsDataItemsCustomDataConversionEventsDataItemsCustomDataContentsItems` (
  `conversionEventsDataItemsCustomData` long NOT NULL
  `conversionEventsDataItemsCustomDataContentsItems` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsDataItemsCustomDataContentsItems` generated from model 'conversionEventsDataItemsCustomDataContentsItems'
--

CREATE TABLE IF NOT EXISTS `ConversionEventsDataItemsCustomDataContentsItems` (
  `id` text PRIMARY KEY /*The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).*/,
  `item_brand` text /*The brand of a product.*/,
  `item_brand_id` text /*The brand ID of a product.*/,
  `item_category` text /*The category of a product.*/,
  `item_name` text /*The name of a product.*/,
  `item_price` text /*The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).*/,
  `quantity` long /*The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataProperties` generated from model 'conversionEventsUserDataProperties'
--

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataProperties` (
  `click_id` text /*The unique identifier stored in _epik cookie on your domain or &amp;epik&#x3D; query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.*/,
  `client_ip_address` text /*The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.*/,
  `client_user_agent` text /*The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.*/,
  `partner_id` text /*A unique identifier of visitors&#39; information defined by third party partners. e.g RampID*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataPropertiesCountry` generated from model 'ConversionEventsUserDataPropertiesCountry'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataPropertiesCountry` (
  `conversionEventsUserDataProperties` long NOT NULL
  `country` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataPropertiesCt` generated from model 'ConversionEventsUserDataPropertiesCt'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataPropertiesCt` (
  `conversionEventsUserDataProperties` long NOT NULL
  `ct` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataPropertiesDb` generated from model 'ConversionEventsUserDataPropertiesDb'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataPropertiesDb` (
  `conversionEventsUserDataProperties` long NOT NULL
  `db` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataPropertiesEm` generated from model 'ConversionEventsUserDataPropertiesEm'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataPropertiesEm` (
  `conversionEventsUserDataProperties` long NOT NULL
  `em` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataPropertiesExternalId` generated from model 'ConversionEventsUserDataPropertiesExternalId'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataPropertiesExternalId` (
  `conversionEventsUserDataProperties` long NOT NULL
  `externalId` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataPropertiesFn` generated from model 'ConversionEventsUserDataPropertiesFn'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataPropertiesFn` (
  `conversionEventsUserDataProperties` long NOT NULL
  `fn` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataPropertiesGe` generated from model 'ConversionEventsUserDataPropertiesGe'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataPropertiesGe` (
  `conversionEventsUserDataProperties` long NOT NULL
  `ge` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataPropertiesHashedMaids` generated from model 'ConversionEventsUserDataPropertiesHashedMaids'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataPropertiesHashedMaids` (
  `conversionEventsUserDataProperties` long NOT NULL
  `hashedMaids` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataPropertiesLn` generated from model 'ConversionEventsUserDataPropertiesLn'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataPropertiesLn` (
  `conversionEventsUserDataProperties` long NOT NULL
  `ln` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataPropertiesPh` generated from model 'ConversionEventsUserDataPropertiesPh'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataPropertiesPh` (
  `conversionEventsUserDataProperties` long NOT NULL
  `ph` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataPropertiesSt` generated from model 'ConversionEventsUserDataPropertiesSt'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataPropertiesSt` (
  `conversionEventsUserDataProperties` long NOT NULL
  `st` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataPropertiesZp` generated from model 'ConversionEventsUserDataPropertiesZp'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataPropertiesZp` (
  `conversionEventsUserDataProperties` long NOT NULL
  `zp` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionHealthSelectionItem` generated from model 'conversionHealthSelectionItem'
-- User selection of conversion health criteria for a single feature
--

CREATE TABLE IF NOT EXISTS `ConversionHealthSelectionItem` (
  `status` blob NOT NULL /*Overall status for this selection item*/,
  `conversionType` blob /*Status for conversion types*/,
  `criteria` blob /*Status for criteria*/,
  `ingestionSource` blob /*Status for ingestion sources*/
);  /*User selection of conversion health criteria for a single feature*/


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionMSOTEventsCreate` generated from model 'conversionMSOTEventsCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `ConversionMSOTEventsCreate` (
  `ad_group_id` text NOT NULL /*The ID of the ad group that was attributed to the conversion event.*/,
  `event_id` text NOT NULL /*A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.*/,
  `event_name` long NOT NULL /*Type of user event.*/,
  `event_timestamp` long NOT NULL /*The time when the event occurred. Unix timestamp in seconds.*/,
  `attribution_model` long /*The attribution model used to attribute the conversion event.*/,
  `attribution_scope` long /*Ad event type.*/,
  `attribution_score` double /*Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1.*/,
  `campaign_id` text /*The ID of the campaign that was attributed to the conversion event.*/,
  `click_window` text /*Click window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;, &#x60;lifetime&#x60;).*/,
  `currency` long /*Currency code for the &#x60;value&#x60; field, required if &#x60;value&#x60; is present. Currency Codes should be in ISO 4217 standard.*/,
  `total_event_touchpoints` int UNSIGNED /*Total number of ad events including other non-Pinterest ad platforms.*/,
  `total_events` int UNSIGNED /*Deprecated: use &#x60;total_events_fractional&#x60; instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.*/,
  `total_events_fractional` double /*Total number of conversion events that are reported in one API call. Use this field instead of &#x60;total_events&#x60; to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).*/,
  `value` double /*Order value of the conversion event. Required if &#x60;event_name&#x60; is &#x60;add_to_cart&#x60; or &#x60;checkout&#x60;.*/,
  `view_window` text /*View window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;).*/
);  /*Resource create operation model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionMSOTEventsCreateActionTimestamps` generated from model 'ConversionMSOTEventsCreateActionTimestamps'

CREATE TABLE IF NOT EXISTS `ConversionMSOTEventsCreateActionTimestamps` (
  `conversionMSOTEventsCreate` long NOT NULL
  `actionTimestamps` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionProductReport` generated from model 'conversionProductReport'
--

CREATE TABLE IF NOT EXISTS `ConversionProductReport` (
  `message` text /*Message returned from the create report request*/,
  `report_status` long /*Async report status*/,
  `size` decimal /*Size of the report in bytes*/,
  `token` text /*Token returned from the create report request*/,
  `url` text /*URL of the report*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionProductReportCreate` generated from model 'conversionProductReportCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `ConversionProductReportCreate` (
  `end_date` text NOT NULL /*  Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.*/,
  `granularity` long NOT NULL /*Report granularity for time-based metric aggregation*/,
  `level` long NOT NULL /*Level of the report*/,
  `report_name` text NOT NULL /*Name of the conversion product report*/,
  `start_date` text NOT NULL /*  Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.*/,
  `click_window_days` long /*Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.*/,
  `conversion_product_attribution_type` long /*  Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.*/,
  `conversion_product_breakdown` long /*Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.*/,
  `conversion_report_time` long /*The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.*/,
  `view_window_days` long /*Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.*/
);  /*Resource create operation model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionProductReportCreateConversionProductReportingColumn` generated from model 'ConversionProductReportCreateConversionProductReportingColumn'

CREATE TABLE IF NOT EXISTS `ConversionProductReportCreateConversionProductReportingColumn` (
  `conversionProductReportCreate` long NOT NULL
  `conversionProductReportingColumn` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionProductReportCreateAdGroupIds` generated from model 'ConversionProductReportCreateAdGroupIds'

CREATE TABLE IF NOT EXISTS `ConversionProductReportCreateAdGroupIds` (
  `conversionProductReportCreate` long NOT NULL
  `adGroupIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionProductReportCreateCampaignIds` generated from model 'ConversionProductReportCreateCampaignIds'

CREATE TABLE IF NOT EXISTS `ConversionProductReportCreateCampaignIds` (
  `conversionProductReportCreate` long NOT NULL
  `campaignIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionProductReportCreateConversionObjectiveType` generated from model 'ConversionProductReportCreateConversionObjectiveType'

CREATE TABLE IF NOT EXISTS `ConversionProductReportCreateConversionObjectiveType` (
  `conversionProductReportCreate` long NOT NULL
  `conversionObjectiveType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionProductReportCreateProductSkuIds` generated from model 'ConversionProductReportCreateProductSkuIds'

CREATE TABLE IF NOT EXISTS `ConversionProductReportCreateProductSkuIds` (
  `conversionProductReportCreate` long NOT NULL
  `productSkuIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionTag` generated from model 'conversionTag'
--

CREATE TABLE IF NOT EXISTS `ConversionTag` (
  `name` text NOT NULL /*Conversion tag name.*/,
  `ad_account_id` text NOT NULL /*Ad account ID.*/,
  `code_snippet` text /*Tag code snippet.*/,
  `configs` long,
  `enhanced_match_status` long /*The enhanced match status of the tag*/,
  `id` text PRIMARY KEY /*Tag ID.*/,
  `last_fired_time_ms` decimal /*Time for the last event fired.*/,
  `version` text /*Version number.*/,
  `status` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionTagCommon` generated from model 'conversionTagCommon'
--

CREATE TABLE IF NOT EXISTS `ConversionTagCommon` (
  `name` text NOT NULL /*Conversion tag name.*/,
  `code_snippet` text /*Tag code snippet.*/,
  `configs` long,
  `enhanced_match_status` long /*The enhanced match status of the tag*/,
  `id` text PRIMARY KEY /*Tag ID.*/,
  `last_fired_time_ms` decimal /*Time for the last event fired.*/,
  `version` text /*Version number.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionTagConfigs` generated from model 'conversionTagConfigs'
--

CREATE TABLE IF NOT EXISTS `ConversionTagConfigs` (
  `aem_db_enabled` boolean /*Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.*/,
  `aem_enabled` boolean /*Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.*/,
  `aem_external_id_enabled` boolean /*Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.*/,
  `aem_fnln_enabled` boolean /*Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.*/,
  `aem_ge_enabled` boolean /*Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.*/,
  `aem_loc_enabled` boolean /*Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.*/,
  `aem_ph_enabled` boolean /*Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.*/,
  `md_frequency` decimal /*Metadata ingestion frequency.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionTagConfigsNoCodeCapiDomains` generated from model 'ConversionTagConfigsNoCodeCapiDomains'

CREATE TABLE IF NOT EXISTS `ConversionTagConfigsNoCodeCapiDomains` (
  `conversionTagConfigs` long NOT NULL
  `noCodeCapiDomains` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionTagCreate` generated from model 'conversionTagCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `ConversionTagCreate` (
  `name` text NOT NULL /*Conversion tag name.*/,
  `aem_db_enabled` boolean /*Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.*/,
  `aem_enabled` boolean /*Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.*/,
  `aem_external_id_enabled` boolean /*Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.*/,
  `aem_fnln_enabled` boolean /*Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.*/,
  `aem_ge_enabled` boolean /*Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.*/,
  `aem_loc_enabled` boolean /*Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.*/,
  `aem_ph_enabled` boolean /*Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.*/,
  `md_frequency` decimal /*Metadata ingestion frequency.*/
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionTagResponse` generated from model 'conversionTagResponse'
--

CREATE TABLE IF NOT EXISTS `ConversionTagResponse` (
  `name` text NOT NULL /*Conversion tag name.*/,
  `ad_account_id` text NOT NULL /*Ad account ID.*/,
  `code_snippet` text /*Tag code snippet.*/,
  `configs` long,
  `enhanced_match_status` long /*The enhanced match status of the tag*/,
  `id` text PRIMARY KEY /*Tag ID.*/,
  `last_fired_time_ms` decimal /*Time for the last event fired.*/,
  `version` text /*Version number.*/,
  `status` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionTagV3GoalMetadata` generated from model 'conversionTagV3GoalMetadata'
--

CREATE TABLE IF NOT EXISTS `ConversionTagV3GoalMetadata` (
  `attribution_windows` long,
  `conversion_event` long,
  `conversion_tag_id` text,
  `cpa_goal_value_in_micro_currency` text,
  `is_roas_optimized` boolean /*Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;\&quot;CHECKOUT\&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;\&quot;AUTOMATIC_BID\&quot;&#x60;. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).*/,
  `reporting_event` text /*Event name for custom or standard events mapped to an oCPM model*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `conversion_tags_list_200_response` generated from model 'conversionTagsList200Response'
--

CREATE TABLE IF NOT EXISTS `conversion_tags_list_200_response` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionTagsList200ResponseConversionTag` generated from model 'ConversionTagsList200ResponseConversionTag'

CREATE TABLE IF NOT EXISTS `ConversionTagsList200ResponseConversionTag` (
  `conversionTagsList200Response` long NOT NULL
  `conversionTag` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CountryFilter` generated from model 'countryFilter'
--

CREATE TABLE IF NOT EXISTS `CountryFilter` (
  `COUNTRY` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CreateAssetAccessRequestBody` generated from model 'createAssetAccessRequestBody'
-- An object containing a list of all the asset access requests
--

CREATE TABLE IF NOT EXISTS `CreateAssetAccessRequestBody` (
);  /*An object containing a list of all the asset access requests*/

-- --------------------------------------------------------------------------
-- Table structure for table `CreateAssetAccessRequestBodyCreateAssetAccessRequestItem` generated from model 'CreateAssetAccessRequestBodyCreateAssetAccessRequestItem'

CREATE TABLE IF NOT EXISTS `CreateAssetAccessRequestBodyCreateAssetAccessRequestItem` (
  `createAssetAccessRequestBody` long NOT NULL
  `createAssetAccessRequestItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateAssetAccessRequestItem` generated from model 'createAssetAccessRequestItem'
--

CREATE TABLE IF NOT EXISTS `CreateAssetAccessRequestItem` (
  `asset_id_to_permissions` blob NOT NULL /*An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.*/,
  `partner_id` text NOT NULL /*Unique identifier of a business partner to request asset access to.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CreateAssetAccessRequestResponse` generated from model 'createAssetAccessRequestResponse'
--

CREATE TABLE IF NOT EXISTS `CreateAssetAccessRequestResponse` (
  `invites` blob /*An object mapping each partner id to the asset access request id. Only one request id is returned per partner.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CreateAssetAccessRequestResponseAssetAccessRequestError` generated from model 'CreateAssetAccessRequestResponseAssetAccessRequestError'

CREATE TABLE IF NOT EXISTS `CreateAssetAccessRequestResponseAssetAccessRequestError` (
  `createAssetAccessRequestResponse` long NOT NULL
  `assetAccessRequestError` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateAssetInvitesRequest` generated from model 'createAssetInvitesRequest'
-- Request body for updating asset roles for existing invites.
--

CREATE TABLE IF NOT EXISTS `CreateAssetInvitesRequest` (
);  /*Request body for updating asset roles for existing invites.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CreateAssetInvitesRequestCreateAssetInvitesRequestItem` generated from model 'CreateAssetInvitesRequestCreateAssetInvitesRequestItem'

CREATE TABLE IF NOT EXISTS `CreateAssetInvitesRequestCreateAssetInvitesRequestItem` (
  `createAssetInvitesRequest` long NOT NULL
  `createAssetInvitesRequestItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateAssetInvitesRequestItem` generated from model 'createAssetInvitesRequestItem'
-- Object declaring an asset role update to an invite.
--

CREATE TABLE IF NOT EXISTS `CreateAssetInvitesRequestItem` (
  `asset_id_to_permissions` blob NOT NULL /*An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.*/,
  `invite_id` text NOT NULL /*Unique identifier of an invite.*/,
  `invite_type` long NOT NULL
);  /*Object declaring an asset role update to an invite.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CreateInvitesResultsResponseArray` generated from model 'createInvitesResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `CreateInvitesResultsResponseArray` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CreateInvitesResultsResponseArrayInviteActionResultItem` generated from model 'CreateInvitesResultsResponseArrayInviteActionResultItem'

CREATE TABLE IF NOT EXISTS `CreateInvitesResultsResponseArrayInviteActionResultItem` (
  `createInvitesResultsResponseArray` long NOT NULL
  `inviteActionResultItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateMembershipOrPartnershipInvitesBody` generated from model 'createMembershipOrPartnershipInvitesBody'
-- Body to be used on path to send Members or Partners Invite or Request
--

CREATE TABLE IF NOT EXISTS `CreateMembershipOrPartnershipInvitesBody` (
  `business_role` long NOT NULL,
  `invite_type` long NOT NULL,
);  /*Body to be used on path to send Members or Partners Invite or Request*/

-- --------------------------------------------------------------------------
-- Table structure for table `CreateMembershipOrPartnershipInvitesBodyMembers` generated from model 'CreateMembershipOrPartnershipInvitesBodyMembers'

CREATE TABLE IF NOT EXISTS `CreateMembershipOrPartnershipInvitesBodyMembers` (
  `createMembershipOrPartnershipInvitesBody` long NOT NULL
  `members` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CreateMembershipOrPartnershipInvitesBodyPartners` generated from model 'CreateMembershipOrPartnershipInvitesBodyPartners'

CREATE TABLE IF NOT EXISTS `CreateMembershipOrPartnershipInvitesBodyPartners` (
  `createMembershipOrPartnershipInvitesBody` long NOT NULL
  `partners` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreativeAssetsIdFilter` generated from model 'creativeAssetsIdFilter'
--

CREATE TABLE IF NOT EXISTS `CreativeAssetsIdFilter` (
  `CREATIVE_ASSETS_ID` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CreativeAssetsProcessingRecord` generated from model 'creativeAssetsProcessingRecord'
-- Object describing an item processing record
--

CREATE TABLE IF NOT EXISTS `CreativeAssetsProcessingRecord` (
  `creative_assets_id` text /*The catalog creative assets id in the merchant namespace*/,
  `status` long,
);  /*Object describing an item processing record*/

-- --------------------------------------------------------------------------
-- Table structure for table `CreativeAssetsProcessingRecordItemValidationEvent` generated from model 'CreativeAssetsProcessingRecordItemValidationEvent'

CREATE TABLE IF NOT EXISTS `CreativeAssetsProcessingRecordItemValidationEvent` (
  `creativeAssetsProcessingRecord` long NOT NULL
  `itemValidationEvent` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CreativeAssetsProcessingRecordItemValidationEvent` generated from model 'CreativeAssetsProcessingRecordItemValidationEvent'

CREATE TABLE IF NOT EXISTS `CreativeAssetsProcessingRecordItemValidationEvent` (
  `creativeAssetsProcessingRecord` long NOT NULL
  `itemValidationEvent` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CurrencyFilter` generated from model 'currencyFilter'
--

CREATE TABLE IF NOT EXISTS `CurrencyFilter` (
  `CURRENCY` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CustomConversionEventMetrics` generated from model 'customConversionEventMetrics'
--

CREATE TABLE IF NOT EXISTS `CustomConversionEventMetrics` (
  `custom_event_metrics_type` long NOT NULL,
  `custom_event_name` text NOT NULL /*Name of the advertiser-defined custom conversion event*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CustomLabel0Filter` generated from model 'customLabel0Filter'
--

CREATE TABLE IF NOT EXISTS `CustomLabel0Filter` (
  `CUSTOM_LABEL_0` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CustomLabel1Filter` generated from model 'customLabel1Filter'
--

CREATE TABLE IF NOT EXISTS `CustomLabel1Filter` (
  `CUSTOM_LABEL_1` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CustomLabel2Filter` generated from model 'customLabel2Filter'
--

CREATE TABLE IF NOT EXISTS `CustomLabel2Filter` (
  `CUSTOM_LABEL_2` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CustomLabel3Filter` generated from model 'customLabel3Filter'
--

CREATE TABLE IF NOT EXISTS `CustomLabel3Filter` (
  `CUSTOM_LABEL_3` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CustomLabel4Filter` generated from model 'customLabel4Filter'
--

CREATE TABLE IF NOT EXISTS `CustomLabel4Filter` (
  `CUSTOM_LABEL_4` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CustomNumber0Filter` generated from model 'customNumber0Filter'
--

CREATE TABLE IF NOT EXISTS `CustomNumber0Filter` (
  `CUSTOM_NUMBER_0` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CustomNumber1Filter` generated from model 'customNumber1Filter'
--

CREATE TABLE IF NOT EXISTS `CustomNumber1Filter` (
  `CUSTOM_NUMBER_1` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CustomNumber2Filter` generated from model 'customNumber2Filter'
--

CREATE TABLE IF NOT EXISTS `CustomNumber2Filter` (
  `CUSTOM_NUMBER_2` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CustomNumber3Filter` generated from model 'customNumber3Filter'
--

CREATE TABLE IF NOT EXISTS `CustomNumber3Filter` (
  `CUSTOM_NUMBER_3` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CustomNumber4Filter` generated from model 'customNumber4Filter'
--

CREATE TABLE IF NOT EXISTS `CustomNumber4Filter` (
  `CUSTOM_NUMBER_4` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CustomerList` generated from model 'customerList'
--

CREATE TABLE IF NOT EXISTS `CustomerList` (
  `id` text NOT NULL PRIMARY KEY /*Customer list ID.*/,
  `name` text NOT NULL /*Customer list name.*/,
  `ad_account_id` text /*Associated ad account ID.*/,
  `created_time` decimal /*Creation time. Unix timestamp in seconds.*/,
  `exceptions` blob /*Customer list errors.*/,
  `is_nca` boolean /*Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.*/,
  `num_batches` decimal /*Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.*/,
  `num_removed_user_records` decimal /*Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.*/,
  `num_uploaded_user_records` decimal /*Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.*/,
  `status` long /*Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users.*/,
  `type` text /*Always &#x60;customerlist&#x60;.*/,
  `updated_time` decimal /*Last update time. Unix timestamp in seconds.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CustomerListCreate` generated from model 'customerListCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `CustomerListCreate` (
  `name` text NOT NULL /*Customer list name.*/,
  `is_nca` boolean /*Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.*/,
  `list_type` long /*Type of customer list (e.g., EMAIL, IDFA, MAID).*/,
  `records` text /*Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.*/,
);  /*Resource create operation model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CustomerListCreateCustomerListRecordRow` generated from model 'CustomerListCreateCustomerListRecordRow'

CREATE TABLE IF NOT EXISTS `CustomerListCreateCustomerListRecordRow` (
  `customerListCreate` long NOT NULL
  `customerListRecordRow` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CustomerListRecordRow` generated from model 'customerListRecordRow'
-- A single row in a multi-field customer list (v2 format).
--

CREATE TABLE IF NOT EXISTS `CustomerListRecordRow` (
  `email` text /*Email address (plain or hashed with SHA1, SHA256, or MD5).*/,
  `external_id` text /*External ID identifier (not hashed).*/,
  `hashed_phone_number` text /*Hashed phone number (hashed with SHA1, SHA256, or MD5).*/,
  `hashed_pinner_id` text /*Hashed pinner ID (hashed with SHA1, SHA256, or MD5).*/,
  `ip_address` text /*IP address (not hashed).*/,
  `liveramp_envelope` text /*LiveRamp envelope identifier (Base64-encoded, not hashed).*/,
  `maid` text /*Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).*/,
  `user_agent` text /*User agent string (not hashed).*/
);  /*A single row in a multi-field customer list (v2 format).*/


-- --------------------------------------------------------------------------
-- Table structure for table `CustomerListUpdateWithRequiredBody` generated from model 'customerListUpdateWithRequiredBody'
-- Resource create or update operation model with required body fields (no OptionalProperties).
--

CREATE TABLE IF NOT EXISTS `CustomerListUpdateWithRequiredBody` (
  `operation_type` long NOT NULL /*Customer list update operation type (add or remove). Only valid in update request body.*/,
  `records` text /*Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.*/,
);  /*Resource create or update operation model with required body fields (no OptionalProperties).*/

-- --------------------------------------------------------------------------
-- Table structure for table `CustomerListUpdateWithRequiredBodyCustomerListRecordRow` generated from model 'CustomerListUpdateWithRequiredBodyCustomerListRecordRow'

CREATE TABLE IF NOT EXISTS `CustomerListUpdateWithRequiredBodyCustomerListRecordRow` (
  `customerListUpdateWithRequiredBody` long NOT NULL
  `customerListRecordRow` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CustomerListUpload` generated from model 'customerListUpload'
--

CREATE TABLE IF NOT EXISTS `CustomerListUpload` (
  `ad_account_id` text NOT NULL /*Advertiser ID.*/,
  `creation_time` int NOT NULL /*Customer List Upload creation_time. Epoch (seconds).*/,
  `customer_list_id` text NOT NULL /*ID of the customer list associated with this upload.*/,
  `id` text NOT NULL PRIMARY KEY /*Customer List Upload ID.*/,
  `operation` long NOT NULL,
  `state` long NOT NULL,
  `updated_time` int NOT NULL /*Customer List Upload updated_time. Epoch (seconds).*/,
  `record_counts` long /*Record processing counts*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CustomerListUploadErrorDetail` generated from model 'CustomerListUploadErrorDetail'

CREATE TABLE IF NOT EXISTS `CustomerListUploadErrorDetail` (
  `customerListUpload` long NOT NULL
  `errorDetail` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CustomerListUploadCreateRequest` generated from model 'customerListUploadCreateRequest'
--

CREATE TABLE IF NOT EXISTS `CustomerListUploadCreateRequest` (
  `operation` long NOT NULL,
  `total_parts` int UNSIGNED NOT NULL /*Number of parts to upload the file in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CustomerListUploadCreateResponse` generated from model 'customerListUploadCreateResponse'
--

CREATE TABLE IF NOT EXISTS `CustomerListUploadCreateResponse` (
  `customer_list_upload` long NOT NULL /*The Customer List Upload created.*/,
  `s3_multipart_upload_data` long NOT NULL /*Pre-signed upload URLs corresponding to each part of the upload.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `customer_lists_list_200_response` generated from model 'customerListsList200Response'
--

CREATE TABLE IF NOT EXISTS `customer_lists_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CustomerListsList200ResponseCustomerList` generated from model 'CustomerListsList200ResponseCustomerList'

CREATE TABLE IF NOT EXISTS `CustomerListsList200ResponseCustomerList` (
  `customerListsList200Response` long NOT NULL
  `customerList` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CustomerSegment` generated from model 'customerSegment'
--

CREATE TABLE IF NOT EXISTS `CustomerSegment` (
  `name` text NOT NULL /*Customer segment name.*/,
  `ad_account_id` text /*The ID of the ad account that this customer segment belongs to.*/,
  `created_time` int /*Customer segment created time. Unix timestamp in seconds.*/,
  `id` text PRIMARY KEY /*Customer segment ID.*/,
  `status` long /*Indicates whether the customer segment is active or deleted.*/,
  `updated_time` int /*Customer segment updated time. Unix timestamp in seconds.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CustomerSegmentAudienceIds` generated from model 'CustomerSegmentAudienceIds'

CREATE TABLE IF NOT EXISTS `CustomerSegmentAudienceIds` (
  `customerSegment` long NOT NULL
  `audienceIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CustomerSegmentCreate` generated from model 'customerSegmentCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `CustomerSegmentCreate` (
  `name` text NOT NULL /*Customer segment name.*/
);  /*Resource create operation model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CustomerSegmentCreateAudienceIds` generated from model 'CustomerSegmentCreateAudienceIds'

CREATE TABLE IF NOT EXISTS `CustomerSegmentCreateAudienceIds` (
  `customerSegmentCreate` long NOT NULL
  `audienceIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `customer_segment_list_200_response` generated from model 'customerSegmentList200Response'
--

CREATE TABLE IF NOT EXISTS `customer_segment_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CustomerSegmentList200ResponseCustomerSegment` generated from model 'CustomerSegmentList200ResponseCustomerSegment'

CREATE TABLE IF NOT EXISTS `CustomerSegmentList200ResponseCustomerSegment` (
  `customerSegmentList200Response` long NOT NULL
  `customerSegment` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CustomerSegmentUpdateRequestUpdateWithRequiredBody` generated from model 'customerSegmentUpdateRequestUpdateWithRequiredBody'
-- Resource create or update operation model with required body fields (no OptionalProperties).
--

CREATE TABLE IF NOT EXISTS `CustomerSegmentUpdateRequestUpdateWithRequiredBody` (
  `id` text NOT NULL PRIMARY KEY /*Customer segment ID.*/,
  `operation_type` long NOT NULL,
);  /*Resource create or update operation model with required body fields (no OptionalProperties).*/

-- --------------------------------------------------------------------------
-- Table structure for table `CustomerSegmentUpdateRequestUpdateWithRequiredBodyAudienceIds` generated from model 'CustomerSegmentUpdateRequestUpdateWithRequiredBodyAudienceIds'

CREATE TABLE IF NOT EXISTS `CustomerSegmentUpdateRequestUpdateWithRequiredBodyAudienceIds` (
  `customerSegmentUpdateRequestUpdateWithRequiredBody` long NOT NULL
  `audienceIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `delete_business_membership_200_response` generated from model 'deleteBusinessMembership200Response'
--

CREATE TABLE IF NOT EXISTS `delete_business_membership_200_response` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `DeleteBusinessMembership200ResponseDeletedMembers` generated from model 'DeleteBusinessMembership200ResponseDeletedMembers'

CREATE TABLE IF NOT EXISTS `DeleteBusinessMembership200ResponseDeletedMembers` (
  `deleteBusinessMembership200Response` long NOT NULL
  `deletedMembers` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteBusinessMembershipBody` generated from model 'deleteBusinessMembershipBody'
-- List of members with role to delete.
--

CREATE TABLE IF NOT EXISTS `DeleteBusinessMembershipBody` (
);  /*List of members with role to delete.*/

-- --------------------------------------------------------------------------
-- Table structure for table `DeleteBusinessMembershipBodyDeleteBusinessMembershipMember` generated from model 'DeleteBusinessMembershipBodyDeleteBusinessMembershipMember'

CREATE TABLE IF NOT EXISTS `DeleteBusinessMembershipBodyDeleteBusinessMembershipMember` (
  `deleteBusinessMembershipBody` long NOT NULL
  `deleteBusinessMembershipMember` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteBusinessMembershipMember` generated from model 'deleteBusinessMembershipMember'
-- Single instance of a business member to be removed from the business.
--

CREATE TABLE IF NOT EXISTS `DeleteBusinessMembershipMember` (
  `business_role` long NOT NULL,
  `member_id` text NOT NULL /*Unique identifier of the member*/
);  /*Single instance of a business member to be removed from the business.*/


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteBusinessPartners` generated from model 'deleteBusinessPartners'
--

CREATE TABLE IF NOT EXISTS `DeleteBusinessPartners` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `DeleteBusinessPartnersDeletedPartners` generated from model 'DeleteBusinessPartnersDeletedPartners'

CREATE TABLE IF NOT EXISTS `DeleteBusinessPartnersDeletedPartners` (
  `deleteBusinessPartners` long NOT NULL
  `deletedPartners` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteBusinessPartnersDelete` generated from model 'deleteBusinessPartnersDelete'
--

CREATE TABLE IF NOT EXISTS `DeleteBusinessPartnersDelete` (
  `partner_type` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `DeleteBusinessPartnersDeletePartnerIds` generated from model 'DeleteBusinessPartnersDeletePartnerIds'

CREATE TABLE IF NOT EXISTS `DeleteBusinessPartnersDeletePartnerIds` (
  `deleteBusinessPartnersDelete` long NOT NULL
  `partnerIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteMemberAccessResult` generated from model 'deleteMemberAccessResult'
-- The terminated asset access.
--

CREATE TABLE IF NOT EXISTS `DeleteMemberAccessResult` (
  `asset_id` text /*Unique identifier of the business asset.*/,
  `member_id` text /*Unique identifier of the business member.*/
);  /*The terminated asset access.*/


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteMemberAccessResultsResponseArray` generated from model 'deleteMemberAccessResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `DeleteMemberAccessResultsResponseArray` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `DeleteMemberAccessResultsResponseArrayDeleteMemberAccessResult` generated from model 'DeleteMemberAccessResultsResponseArrayDeleteMemberAccessResult'

CREATE TABLE IF NOT EXISTS `DeleteMemberAccessResultsResponseArrayDeleteMemberAccessResult` (
  `deleteMemberAccessResultsResponseArray` long NOT NULL
  `deleteMemberAccessResult` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteMemberAssetAccessItem` generated from model 'deleteMemberAssetAccessItem'
--

CREATE TABLE IF NOT EXISTS `DeleteMemberAssetAccessItem` (
  `asset_id` text NOT NULL /*Id of the asset on which to remove member permissions.*/,
  `member_id` text NOT NULL /*Unique identifier of the member on which to perform the asset permission removal*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `DeletePartnerAssetAccessBody` generated from model 'deletePartnerAssetAccessBody'
-- An object with a list of partner asset accesses to delete.
--

CREATE TABLE IF NOT EXISTS `DeletePartnerAssetAccessBody` (
);  /*An object with a list of partner asset accesses to delete.*/

-- --------------------------------------------------------------------------
-- Table structure for table `DeletePartnerAssetAccessBodyDeletePartnerAssetAccessItem` generated from model 'DeletePartnerAssetAccessBodyDeletePartnerAssetAccessItem'

CREATE TABLE IF NOT EXISTS `DeletePartnerAssetAccessBodyDeletePartnerAssetAccessItem` (
  `deletePartnerAssetAccessBody` long NOT NULL
  `deletePartnerAssetAccessItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeletePartnerAssetAccessItem` generated from model 'deletePartnerAssetAccessItem'
--

CREATE TABLE IF NOT EXISTS `DeletePartnerAssetAccessItem` (
  `asset_id` text NOT NULL /*Unique identifier of the business asset.*/,
  `partner_id` text NOT NULL /*Unique identifier of a business partner to update asset access to.*/,
  `partner_type` text /*If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `DeletePartnerAssetAccessResult` generated from model 'deletePartnerAssetAccessResult'
-- The terminated asset access.
--

CREATE TABLE IF NOT EXISTS `DeletePartnerAssetAccessResult` (
  `asset_id` text /*Unique identifier of a business asset.*/,
  `asset_type` text /*Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.*/,
  `is_shared_partner` boolean /*If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset. If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset.*/,
  `partner_id` text /*Unique identifier of a business partner.*/,
);  /*The terminated asset access.*/

-- --------------------------------------------------------------------------
-- Table structure for table `DeletePartnerAssetAccessResultPermissions` generated from model 'DeletePartnerAssetAccessResultPermissions'

CREATE TABLE IF NOT EXISTS `DeletePartnerAssetAccessResultPermissions` (
  `deletePartnerAssetAccessResult` long NOT NULL
  `permissions` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeletePartnerAssetAccessResultsResponseArray` generated from model 'deletePartnerAssetAccessResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `DeletePartnerAssetAccessResultsResponseArray` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `DeletePartnerAssetAccessResultsResponseArrayDeletePartnerAssetAccessResult` generated from model 'DeletePartnerAssetAccessResultsResponseArrayDeletePartnerAssetAccessResult'

CREATE TABLE IF NOT EXISTS `DeletePartnerAssetAccessResultsResponseArrayDeletePartnerAssetAccessResult` (
  `deletePartnerAssetAccessResultsResponseArray` long NOT NULL
  `deletePartnerAssetAccessResult` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `delivery_metrics_get_200_response` generated from model 'deliveryMetricsGet200Response'
--

CREATE TABLE IF NOT EXISTS `delivery_metrics_get_200_response` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `DeliveryMetricsGet200ResponseDeliveryMetricsResponseItemsItems` generated from model 'DeliveryMetricsGet200ResponseDeliveryMetricsResponseItemsItems'

CREATE TABLE IF NOT EXISTS `DeliveryMetricsGet200ResponseDeliveryMetricsResponseItemsItems` (
  `deliveryMetricsGet200Response` long NOT NULL
  `deliveryMetricsResponseItemsItems` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeliveryMetricsResponseItemsItems` generated from model 'deliveryMetricsResponseItemsItems'
--

CREATE TABLE IF NOT EXISTS `DeliveryMetricsResponseItemsItems` (
  `category` text /*Category name*/,
  `definition` text /*How the metric is defined.*/,
  `display_name` text /*Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.*/,
  `name` text /*Metric&#39;s name.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `DetailedError` generated from model 'detailedError'
-- Used for including extra details to a base error
--

CREATE TABLE IF NOT EXISTS `DetailedError` (
  `code` int NOT NULL,
  `details` blob NOT NULL,
  `message` text NOT NULL
);  /*Used for including extra details to a base error*/


-- --------------------------------------------------------------------------
-- Table structure for table `DynamicTitlesDownloadCSV` generated from model 'dynamicTitlesDownloadCSV'
--

CREATE TABLE IF NOT EXISTS `DynamicTitlesDownloadCSV` (
  `download_url` text /*Pre-signed S3 URL to download the CSV file.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `DynamicTitlesGetStatus` generated from model 'dynamicTitlesGetStatus'
--

CREATE TABLE IF NOT EXISTS `DynamicTitlesGetStatus` (
  `generated_count` int /*The count of generated titles.*/,
  `is_ready` boolean /*Whether dynamic titles have been generated and are ready to be reviewed for the ad group.*/,
  `reviewed_count` int /*The count of advertiser reviewed titles.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `DynamicTitlesProcessCSV` generated from model 'dynamicTitlesProcessCSV'
--

CREATE TABLE IF NOT EXISTS `DynamicTitlesProcessCSV` (
  `status` text /*Processing status. Present on success.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `DynamicTitlesProcessCSVDynamicTitlesProcessCSVError` generated from model 'DynamicTitlesProcessCSVDynamicTitlesProcessCSVError'

CREATE TABLE IF NOT EXISTS `DynamicTitlesProcessCSVDynamicTitlesProcessCSVError` (
  `dynamicTitlesProcessCSV` long NOT NULL
  `dynamicTitlesProcessCSVError` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DynamicTitlesProcessCSVCreate` generated from model 'dynamicTitlesProcessCSVCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `DynamicTitlesProcessCSVCreate` (
  `request_id` text NOT NULL /*The request_id returned from the GET uploads endpoint.*/
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `DynamicTitlesProcessCSVError` generated from model 'dynamicTitlesProcessCSVError'
--

CREATE TABLE IF NOT EXISTS `DynamicTitlesProcessCSVError` (
  `error_type` text /*The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED.*/,
  `row_number` int /*The row number with a validation error. -1 indicates a file-level error.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `DynamicTitlesUploadURL` generated from model 'dynamicTitlesUploadURL'
--

CREATE TABLE IF NOT EXISTS `DynamicTitlesUploadURL` (
  `request_id` text NOT NULL /*Unique identifier for this upload session. Must be passed to the process endpoint.*/,
  `upload_url` text NOT NULL /*Pre-signed S3 PUT URL to upload the reviewed CSV file.*/,
  `existing_filename` text /*If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EntityDataChangeHistory` generated from model 'entityDataChangeHistory'
--

CREATE TABLE IF NOT EXISTS `EntityDataChangeHistory` (
  `changed_field_id` text /*A string identifier representing the changed field on the entity*/,
  `changed_field_name` text /*The human readable name of the changed field on the entity*/,
  `data_type` long /*Specifies the type of the field&#39;s data values*/,
  `new_data_value` text /*A string representation of the value of the changed field, after the change*/,
  `old_data_value` text /*A string representation of the value of the changed field, before the change*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EntityHistory` generated from model 'entityHistory'
--

CREATE TABLE IF NOT EXISTS `EntityHistory` (
  `change_timestamp` int /*A Unix timestamp representing the time of the change in seconds*/,
  `entity_id` text /*The id of the entity that was changed*/,
  `entity_name` text /*The name of the entity that was changed*/,
  `ldap` text /*The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users*/,
  `operation` long /*The type of operation that caused the change*/,
  `user_id` text /*The id of the user who initiated the change*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `EntityHistoryEntityDataChangeHistory` generated from model 'EntityHistoryEntityDataChangeHistory'

CREATE TABLE IF NOT EXISTS `EntityHistoryEntityDataChangeHistory` (
  `entityHistory` long NOT NULL
  `entityDataChangeHistory` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `EntityLabel` generated from model 'entityLabel'
--

CREATE TABLE IF NOT EXISTS `EntityLabel` (
  `entity_id` text NOT NULL /*Entity ID to apply label to.*/,
  `label_id` text NOT NULL /*Label ID.*/,
  `entity_type` long,
  `status` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EntityLabelError` generated from model 'entityLabelError'
--

CREATE TABLE IF NOT EXISTS `EntityLabelError` (
  `data` long,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `EntityLabelErrorErrorMessages` generated from model 'EntityLabelErrorErrorMessages'

CREATE TABLE IF NOT EXISTS `EntityLabelErrorErrorMessages` (
  `entityLabelError` long NOT NULL
  `errorMessages` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ErrorDetail` generated from model 'errorDetail'
--

CREATE TABLE IF NOT EXISTS `ErrorDetail` (
  `count` int NOT NULL /*Number of records with this error*/,
  `error_code` int NOT NULL /*Numeric error code*/,
  `message` text NOT NULL /*Error message description*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EventData` generated from model 'eventData'
--     Optional for VISITOR &#x60;audience_type&#x60;.     With the Pinterest tag, you can use event data to capture event details from your website.     This object lists all the available predefined event data fields in the Pinterest tag.     You can include these event data fields as part of a VISITOR audience’s &#x60;rule&#x60;; however, you **must** specify an &#x60;event&#x60; for the &#x60;event_data&#x60; fields to be evaluated.     Besides what’s listed, you can also create your own set of &#x60;event_data&#x60; fields and define their usages or purposes according to your website needs.     However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields&#39; data.     Examples per &#x60;event&#x60; type:     &#x60;pagevisit&#x60;     \&quot;event_data\&quot;: { \&quot;page_name\&quot;: \&quot;My online store 123 | view items | shoe\&quot; }     &#x60;signup&#x60;     \&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;New release promotion\&quot; }     &#x60;checkout&#x60;     \&quot;event_data\&quot;: { \&quot;value\&quot;: 116, \&quot;order_quantity\&quot;: 2, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Pillows (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;11\&quot;, \&quot;product_price\&quot;: 48, \&quot;product_quantity\&quot;: 1 }, { \&quot;product_name\&quot;: \&quot;Pillows, Large (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;15\&quot;, \&quot;product_price\&quot;: 68, \&quot;product_quantity\&quot;: 1 } ] }     &#x60;addtocart&#x60;     \&quot;event_data\&quot;: { \&quot;value\&quot;: 499, \&quot;order_quantity\&quot;: 1, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Red leather boots\&quot;, \&quot;product_id\&quot;: \&quot;3486\&quot;, \&quot;product_category\&quot;: \&quot;shoe\&quot;, \&quot;product_variant_id\&quot;: \&quot;JB11103000\&quot;, \&quot;product_price\&quot;: 499, \&quot;product_quantity\&quot;: \&quot;1\&quot;, \&quot;product_brand\&quot;: \&quot;My brand\&quot; }]}     &#x60;watchvideo&#x60;     \&quot;event_data\&quot;: { \&quot;video_title\&quot; : \&quot;My Product Video 01\&quot; }     &#x60;lead&#x60;     \&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;Newsletter\&quot; }
--

CREATE TABLE IF NOT EXISTS `EventData` (
  `currency` long /*Currency. For example, &#39;USD&#39;.*/,
  `lead_type` text /*Promotion code. For example, &#39;Newsletter&#39;.*/,
  `line_items` long,
  `order_id` text /*Order ID. For example, &#39;X-151481&#39;.*/,
  `order_quantity` int /*Order quantity. For example, 1.*/,
  `page_name` text /*Page name. For example, &#39;Our Favorite Pins on Pinterest&#39;.*/,
  `promo_code` text /*Promotion code. For example, &#39;WINTER10&#39;.*/,
  `property` text /*Property. For example, &#39;Athleta&#39;.*/,
  `search_query` text /*Search query string. For example, &#39;boots&#39;.*/,
  `value` text /*Product value. For example, &#39;199.98&#39;.*/,
  `video_title` text /*Video title. For example, &#39;How to style your Parker Boots&#39;.*/
);  /*    Optional for VISITOR &#x60;audience_type&#x60;.     With the Pinterest tag, you can use event data to capture event details from your website.     This object lists all the available predefined event data fields in the Pinterest tag.     You can include these event data fields as part of a VISITOR audience’s &#x60;rule&#x60;; however, you **must** specify an &#x60;event&#x60; for the &#x60;event_data&#x60; fields to be evaluated.     Besides what’s listed, you can also create your own set of &#x60;event_data&#x60; fields and define their usages or purposes according to your website needs.     However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields&#39; data.     Examples per &#x60;event&#x60; type:     &#x60;pagevisit&#x60;     \&quot;event_data\&quot;: { \&quot;page_name\&quot;: \&quot;My online store 123 | view items | shoe\&quot; }     &#x60;signup&#x60;     \&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;New release promotion\&quot; }     &#x60;checkout&#x60;     \&quot;event_data\&quot;: { \&quot;value\&quot;: 116, \&quot;order_quantity\&quot;: 2, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Pillows (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;11\&quot;, \&quot;product_price\&quot;: 48, \&quot;product_quantity\&quot;: 1 }, { \&quot;product_name\&quot;: \&quot;Pillows, Large (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;15\&quot;, \&quot;product_price\&quot;: 68, \&quot;product_quantity\&quot;: 1 } ] }     &#x60;addtocart&#x60;     \&quot;event_data\&quot;: { \&quot;value\&quot;: 499, \&quot;order_quantity\&quot;: 1, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Red leather boots\&quot;, \&quot;product_id\&quot;: \&quot;3486\&quot;, \&quot;product_category\&quot;: \&quot;shoe\&quot;, \&quot;product_variant_id\&quot;: \&quot;JB11103000\&quot;, \&quot;product_price\&quot;: 499, \&quot;product_quantity\&quot;: \&quot;1\&quot;, \&quot;product_brand\&quot;: \&quot;My brand\&quot; }]}     &#x60;watchvideo&#x60;     \&quot;event_data\&quot;: { \&quot;video_title\&quot; : \&quot;My Product Video 01\&quot; }     &#x60;lead&#x60;     \&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;Newsletter\&quot; }*/


-- --------------------------------------------------------------------------
-- Table structure for table `EventQualityScore` generated from model 'eventQualityScore'
-- Schema for GET Conversion EQS response.
--

CREATE TABLE IF NOT EXISTS `EventQualityScore` (
  `ingestion_source` long NOT NULL,
  `lookback_period` long NOT NULL,
  `overall_status` long NOT NULL,
  `quality_components` long NOT NULL,
  `source_platform` long NOT NULL
);  /*Schema for GET Conversion EQS response.*/


-- --------------------------------------------------------------------------
-- Table structure for table `Exception` generated from model 'exception'
--

CREATE TABLE IF NOT EXISTS `Exception` (
  `message` text NOT NULL,
  `code` int
); 


-- --------------------------------------------------------------------------
-- Table structure for table `FeaturedTrend` generated from model 'featuredTrend'
-- Featured trending topics for a specific interest and market
--

CREATE TABLE IF NOT EXISTS `FeaturedTrend` (
  `interest` long NOT NULL /*The main interest category*/,
  `market` long /*Market code (e.g., &#39;US&#39;, &#39;UK&#39;, etc.)*/,
);  /*Featured trending topics for a specific interest and market*/

-- --------------------------------------------------------------------------
-- Table structure for table `FeaturedTrendTrendingTopic` generated from model 'FeaturedTrendTrendingTopic'

CREATE TABLE IF NOT EXISTS `FeaturedTrendTrendingTopic` (
  `featuredTrend` long NOT NULL
  `trendingTopic` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `feed_processing_results_list_200_response` generated from model 'feedProcessingResultsList200Response'
--

CREATE TABLE IF NOT EXISTS `feed_processing_results_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `FeedProcessingResultsList200ResponseCatalogsFeedProcessingResult` generated from model 'FeedProcessingResultsList200ResponseCatalogsFeedProcessingResult'

CREATE TABLE IF NOT EXISTS `FeedProcessingResultsList200ResponseCatalogsFeedProcessingResult` (
  `feedProcessingResultsList200Response` long NOT NULL
  `catalogsFeedProcessingResult` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `feeds_list_200_response` generated from model 'feedsList200Response'
--

CREATE TABLE IF NOT EXISTS `feeds_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `FeedsList200ResponseCatalogsFeed` generated from model 'FeedsList200ResponseCatalogsFeed'

CREATE TABLE IF NOT EXISTS `FeedsList200ResponseCatalogsFeed` (
  `feedsList200Response` long NOT NULL
  `catalogsFeed` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `FollowUser` generated from model 'followUser'
--

CREATE TABLE IF NOT EXISTS `FollowUser` (
  `type` text /*Always &#39;user&#39;*/,
  `username` text /*Username*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `FollowUserCreate` generated from model 'followUserCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `FollowUserCreate` (
  `auto_follow` boolean /*  Whether this request comes as result of auto-follow after clicking on a link.   Follow links can be used by partners on their site or in emails.   Only selected partners can be followed this way. We verify that partner can be auto-followed.*/
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `followers_list_200_response` generated from model 'followersList200Response'
--

CREATE TABLE IF NOT EXISTS `followers_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `FollowersList200ResponseFollowUser` generated from model 'FollowersList200ResponseFollowUser'

CREATE TABLE IF NOT EXISTS `FollowersList200ResponseFollowUser` (
  `followersList200Response` long NOT NULL
  `followUser` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `FrequencyGoalMetadata` generated from model 'frequencyGoalMetadata'
-- Frequency target can only be between 2 and 20
--

CREATE TABLE IF NOT EXISTS `FrequencyGoalMetadata` (
  `frequency` int UNSIGNED,
  `timerange` long
);  /*Frequency target can only be between 2 and 20*/


-- --------------------------------------------------------------------------
-- Table structure for table `FrequencyMultipliers` generated from model 'frequencyMultipliers'
-- This represents a mapping from impression count to a bid price adjustment for frequency-based bidding.  Keys are impression counts (0-10) representing how many times a user has seen the ad. Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price. A value of 0 will stop distribution for this impression count. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
--

CREATE TABLE IF NOT EXISTS `FrequencyMultipliers` (
  `IMPRESSION_COUNT` text /*Impression count identifier.*/
);  /*This represents a mapping from impression count to a bid price adjustment for frequency-based bidding.  Keys are impression counts (0-10) representing how many times a user has seen the ad. Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price. A value of 0 will stop distribution for this impression count. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).*/


-- --------------------------------------------------------------------------
-- Table structure for table `GenderDemographics` generated from model 'genderDemographics'
-- Gender demographic distribution
--

CREATE TABLE IF NOT EXISTS `GenderDemographics` (
  `female` decimal NOT NULL /*Percentage of female users*/,
  `male` decimal NOT NULL /*Percentage of male users*/,
  `unspecified` decimal NOT NULL /*Percentage of users with unspecified gender*/
);  /*Gender demographic distribution*/


-- --------------------------------------------------------------------------
-- Table structure for table `GenderFilter` generated from model 'genderFilter'
--

CREATE TABLE IF NOT EXISTS `GenderFilter` (
  `GENDER` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GenderMultipliers` generated from model 'genderMultipliers'
-- This represents a mapping from gender targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified gender in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
--

CREATE TABLE IF NOT EXISTS `GenderMultipliers` (
  `GENDER` long /*Gender identifier.*/
);  /*This represents a mapping from gender targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified gender in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).*/


-- --------------------------------------------------------------------------
-- Table structure for table `get_business_employers_200_response` generated from model 'getBusinessEmployers200Response'
--

CREATE TABLE IF NOT EXISTS `get_business_employers_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `GetBusinessEmployers200ResponseUserBusinessRoleBinding` generated from model 'GetBusinessEmployers200ResponseUserBusinessRoleBinding'

CREATE TABLE IF NOT EXISTS `GetBusinessEmployers200ResponseUserBusinessRoleBinding` (
  `getBusinessEmployers200Response` long NOT NULL
  `userBusinessRoleBinding` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `get_invites_200_response` generated from model 'getInvites200Response'
--

CREATE TABLE IF NOT EXISTS `get_invites_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `GetInvites200ResponseInviteResponse` generated from model 'GetInvites200ResponseInviteResponse'

CREATE TABLE IF NOT EXISTS `GetInvites200ResponseInviteResponse` (
  `getInvites200Response` long NOT NULL
  `inviteResponse` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GoogleProductCategory0Filter` generated from model 'googleProductCategory0Filter'
--

CREATE TABLE IF NOT EXISTS `GoogleProductCategory0Filter` (
  `GOOGLE_PRODUCT_CATEGORY_0` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GoogleProductCategory1Filter` generated from model 'googleProductCategory1Filter'
--

CREATE TABLE IF NOT EXISTS `GoogleProductCategory1Filter` (
  `GOOGLE_PRODUCT_CATEGORY_1` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GoogleProductCategory2Filter` generated from model 'googleProductCategory2Filter'
--

CREATE TABLE IF NOT EXISTS `GoogleProductCategory2Filter` (
  `GOOGLE_PRODUCT_CATEGORY_2` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GoogleProductCategory3Filter` generated from model 'googleProductCategory3Filter'
--

CREATE TABLE IF NOT EXISTS `GoogleProductCategory3Filter` (
  `GOOGLE_PRODUCT_CATEGORY_3` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GoogleProductCategory4Filter` generated from model 'googleProductCategory4Filter'
--

CREATE TABLE IF NOT EXISTS `GoogleProductCategory4Filter` (
  `GOOGLE_PRODUCT_CATEGORY_4` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GoogleProductCategory5Filter` generated from model 'googleProductCategory5Filter'
--

CREATE TABLE IF NOT EXISTS `GoogleProductCategory5Filter` (
  `GOOGLE_PRODUCT_CATEGORY_5` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GoogleProductCategory6Filter` generated from model 'googleProductCategory6Filter'
--

CREATE TABLE IF NOT EXISTS `GoogleProductCategory6Filter` (
  `GOOGLE_PRODUCT_CATEGORY_6` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `HotelIdFilter` generated from model 'hotelIdFilter'
--

CREATE TABLE IF NOT EXISTS `HotelIdFilter` (
  `HOTEL_ID` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `HotelProcessingRecord` generated from model 'hotelProcessingRecord'
-- Object describing an item processing record
--

CREATE TABLE IF NOT EXISTS `HotelProcessingRecord` (
  `hotel_id` text /*The catalog hotel id in the merchant namespace*/,
  `status` long,
);  /*Object describing an item processing record*/

-- --------------------------------------------------------------------------
-- Table structure for table `HotelProcessingRecordItemValidationEvent` generated from model 'HotelProcessingRecordItemValidationEvent'

CREATE TABLE IF NOT EXISTS `HotelProcessingRecordItemValidationEvent` (
  `hotelProcessingRecord` long NOT NULL
  `itemValidationEvent` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `HotelProcessingRecordItemValidationEvent` generated from model 'HotelProcessingRecordItemValidationEvent'

CREATE TABLE IF NOT EXISTS `HotelProcessingRecordItemValidationEvent` (
  `hotelProcessingRecord` long NOT NULL
  `itemValidationEvent` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ImageDetails` generated from model 'imageDetails'
--

CREATE TABLE IF NOT EXISTS `ImageDetails` (
  `height` int NOT NULL,
  `url` text NOT NULL,
  `width` int NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ImageMetadata` generated from model 'imageMetadata'
--

CREATE TABLE IF NOT EXISTS `ImageMetadata` (
  `item_type` text NOT NULL /*Discriminator literal identifying this as image metadata inside a &#x60;PinMediaMetadata&#x60; payload.*/,
  `description` text,
  `images` long,
  `link` text,
  `title` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ImageSize` generated from model 'imageSize'
--

CREATE TABLE IF NOT EXISTS `ImageSize` (
  `1200x` long,
  `150x150` long,
  `400x300` long,
  `600x` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `IneligibleProductTagErrorItem` generated from model 'ineligibleProductTagErrorItem'
-- Error item for a product tag that failed eligibility check.
--

CREATE TABLE IF NOT EXISTS `IneligibleProductTagErrorItem` (
  `error_message` long NOT NULL /*Reason why the pin is ineligible for tagging.*/,
  `pin_id` text NOT NULL /*Pin ID that failed eligibility check.*/
);  /*Error item for a product tag that failed eligibility check.*/


-- --------------------------------------------------------------------------
-- Table structure for table `IneligibleProductTagsErrorDetails` generated from model 'ineligibleProductTagsErrorDetails'
-- Details about ineligible product tags in the request.
--

CREATE TABLE IF NOT EXISTS `IneligibleProductTagsErrorDetails` (
);  /*Details about ineligible product tags in the request.*/

-- --------------------------------------------------------------------------
-- Table structure for table `IneligibleProductTagsErrorDetailsIneligibleProductTagErrorItem` generated from model 'IneligibleProductTagsErrorDetailsIneligibleProductTagErrorItem'

CREATE TABLE IF NOT EXISTS `IneligibleProductTagsErrorDetailsIneligibleProductTagErrorItem` (
  `ineligibleProductTagsErrorDetails` long NOT NULL
  `ineligibleProductTagErrorItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `InnerProductCategoriesMetricsHighlights` generated from model 'innerProductCategoriesMetricsHighlights'
--

CREATE TABLE IF NOT EXISTS `InnerProductCategoriesMetricsHighlights` (
  `pct_change_mom` decimal NOT NULL /*Month-over-month percentage change*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `IntegrationLog` generated from model 'integrationLog'
-- Schema for log sent from an integration application.
--

CREATE TABLE IF NOT EXISTS `IntegrationLog` (
  `client_timestamp` int NOT NULL /*Timestamp in milliseconds of when the log was executed at the client.*/,
  `event_type` long NOT NULL /*Log event type*/,
  `log_level` long NOT NULL /*Log level type*/,
  `advertiser_id` text,
  `app_version_number` text /*Version number of the integration application.*/,
  `error` long,
  `external_business_id` text,
  `feed_profile_id` text,
  `merchant_id` text,
  `message` text /*Explanation of the event that occured.*/,
  `platform_version_number` text /*Version number of the platform the integration application is running on.*/,
  `request` long,
  `tag_id` text
);  /*Schema for log sent from an integration application.*/


-- --------------------------------------------------------------------------
-- Table structure for table `IntegrationLogClientError` generated from model 'integrationLogClientError'
-- System error details included in the log sent by the client.
--

CREATE TABLE IF NOT EXISTS `IntegrationLogClientError` (
  `cause` text /*Original cause of the error.*/,
  `column_number` int /*Column number in the line of the file that raised the error.*/,
  `file_name` text /*Filename where the error happened.*/,
  `line_number` int /*Line number where the error happened.*/,
  `message` text /*Human-readable description of the error.*/,
  `message_detail` text /*More detail about the message.*/,
  `name` text /*Filename where the error happened.*/,
  `number` int /*Integer that specifies the error code.*/,
  `stack_trace` text /*Stack trace of where the error happened.*/
);  /*System error details included in the log sent by the client.*/


-- --------------------------------------------------------------------------
-- Table structure for table `IntegrationLogClientRequest` generated from model 'integrationLogClientRequest'
-- HTTP request details included in the log sent by the client.
--

CREATE TABLE IF NOT EXISTS `IntegrationLogClientRequest` (
  `host` text NOT NULL /*HTTP request host from host header.*/,
  `method` long NOT NULL,
  `path` text NOT NULL /*HTTP request path.*/,
  `request_headers` blob /*HTTP request headers as key-value pairs.*/,
  `response_headers` blob /*HTTP response headers as key-value pairs.*/,
  `response_status_code` int
);  /*HTTP request details included in the log sent by the client.*/


-- --------------------------------------------------------------------------
-- Table structure for table `IntegrationLogsInvalidLogResponse` generated from model 'integrationLogsInvalidLogResponse'
-- Schema describing the response when a log has invalid fields.
--

CREATE TABLE IF NOT EXISTS `IntegrationLogsInvalidLogResponse` (
);  /*Schema describing the response when a log has invalid fields.*/

-- --------------------------------------------------------------------------
-- Table structure for table `IntegrationLogsInvalidLogResponseIntegrationLogsInvalidLogResponseRejectedLogsItems` generated from model 'IntegrationLogsInvalidLogResponseIntegrationLogsInvalidLogResponseRejectedLogsItems'

CREATE TABLE IF NOT EXISTS `IntegrationLogsInvalidLogResponseIntegrationLogsInvalidLogResponseRejectedLogsItems` (
  `integrationLogsInvalidLogResponse` long NOT NULL
  `integrationLogsInvalidLogResponseRejectedLogsItems` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `IntegrationLogsInvalidLogResponseRejectedLogsItems` generated from model 'integrationLogsInvalidLogResponseRejectedLogsItems'
--

CREATE TABLE IF NOT EXISTS `IntegrationLogsInvalidLogResponseRejectedLogsItems` (
  `field` text NOT NULL /*The field name containing an invalid value.*/,
  `reason` text NOT NULL /*The reason the value is invalid.*/,
  `value` text NOT NULL /*The value that is invalid.*/,
  `log_index` int /*Index of the log in the batch.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `IntegrationLogsRequestCreate` generated from model 'integrationLogsRequestCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `IntegrationLogsRequestCreate` (
);  /*Resource create operation model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `IntegrationLogsRequestCreateIntegrationLog` generated from model 'IntegrationLogsRequestCreateIntegrationLog'

CREATE TABLE IF NOT EXISTS `IntegrationLogsRequestCreateIntegrationLog` (
  `integrationLogsRequestCreate` long NOT NULL
  `integrationLog` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `IntegrationLogsSuccessResponse` generated from model 'integrationLogsSuccessResponse'
-- Response when logs are successfully processed.
--

CREATE TABLE IF NOT EXISTS `IntegrationLogsSuccessResponse` (
  `message` text
);  /*Response when logs are successfully processed.*/


-- --------------------------------------------------------------------------
-- Table structure for table `IntegrationMetadata` generated from model 'integrationMetadata'
-- Integration metadata
--

CREATE TABLE IF NOT EXISTS `IntegrationMetadata` (
  `additional_id_1` text,
  `connected_advertiser_id` text,
  `connected_lba_id` text,
  `connected_merchant_id` text,
  `connected_tag_id` text,
  `connected_user_id` text,
  `created_timestamp` decimal,
  `external_business_id` text /*External business ID for the integration.*/,
  `id` text PRIMARY KEY,
  `partner_access_token_expiry` decimal,
  `partner_metadata` text,
  `partner_refresh_token_expiry` decimal,
  `scopes` text,
  `updated_timestamp` decimal
);  /*Integration metadata*/


-- --------------------------------------------------------------------------
-- Table structure for table `IntegrationMetadataCreate` generated from model 'integrationMetadataCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `IntegrationMetadataCreate` (
  `additional_id_1` text,
  `connected_advertiser_id` text,
  `connected_lba_id` text,
  `connected_merchant_id` text,
  `connected_tag_id` text,
  `external_business_id` text /*External business ID for the integration.*/,
  `partner_access_token` text,
  `partner_access_token_expiry` decimal,
  `partner_metadata` text,
  `partner_primary_email` text,
  `partner_refresh_token` text,
  `partner_refresh_token_expiry` decimal,
  `scopes` text
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `IntegrationMetadataUpdate` generated from model 'integrationMetadataUpdate'
-- Resource create or update operation model.
--

CREATE TABLE IF NOT EXISTS `IntegrationMetadataUpdate` (
  `additional_id_1` text,
  `connected_advertiser_id` text,
  `connected_lba_id` text,
  `connected_merchant_id` text,
  `connected_tag_id` text,
  `partner_access_token` text,
  `partner_access_token_expiry` decimal,
  `partner_metadata` text,
  `partner_primary_email` text,
  `partner_refresh_token` text,
  `partner_refresh_token_expiry` decimal,
  `scopes` text
);  /*Resource create or update operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `IntegrationRecord` generated from model 'integrationRecord'
-- Integration record
--

CREATE TABLE IF NOT EXISTS `IntegrationRecord` (
  `id` text NOT NULL PRIMARY KEY /*Integration record ID.*/,
  `additional_id_1` text,
  `connected_advertiser_id` text,
  `connected_lba_id` text,
  `connected_merchant_id` text,
  `connected_tag_id` text,
  `connected_user_id` text,
  `created_time` int,
  `external_business_id` text,
  `partner_access_token` text,
  `partner_access_token_expiry` int,
  `partner_metadata` text,
  `partner_primary_email` text,
  `partner_refresh_token` text,
  `partner_refresh_token_expiry` int,
  `scopes` text,
  `updated_time` int
);  /*Integration record*/


-- --------------------------------------------------------------------------
-- Table structure for table `integrations_get_list_200_response` generated from model 'integrationsGetList200Response'
--

CREATE TABLE IF NOT EXISTS `integrations_get_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `IntegrationsGetList200ResponseIntegrationRecord` generated from model 'IntegrationsGetList200ResponseIntegrationRecord'

CREATE TABLE IF NOT EXISTS `IntegrationsGetList200ResponseIntegrationRecord` (
  `integrationsGetList200Response` long NOT NULL
  `integrationRecord` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `Interest` generated from model 'interest'
--

CREATE TABLE IF NOT EXISTS `Interest` (
  `canonical_url` text,
  `id` text PRIMARY KEY,
  `key` text,
  `name` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `InviteActionResultItem` generated from model 'inviteActionResultItem'
-- An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).
--

CREATE TABLE IF NOT EXISTS `InviteActionResultItem` (
  `exception` long,
  `invite` long
);  /*An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).*/


-- --------------------------------------------------------------------------
-- Table structure for table `InviteAssetsSummary` generated from model 'inviteAssetsSummary'
-- Ad accounts and profiles the member/partner will be granted access to with this invite/request.
--

CREATE TABLE IF NOT EXISTS `InviteAssetsSummary` (
);  /*Ad accounts and profiles the member/partner will be granted access to with this invite/request.*/

-- --------------------------------------------------------------------------
-- Table structure for table `InviteAssetsSummaryInviteAssetsSummaryItem` generated from model 'InviteAssetsSummaryInviteAssetsSummaryItem'

CREATE TABLE IF NOT EXISTS `InviteAssetsSummaryInviteAssetsSummaryItem` (
  `inviteAssetsSummary` long NOT NULL
  `inviteAssetsSummaryItem` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `InviteAssetsSummaryInviteAssetsSummaryItem` generated from model 'InviteAssetsSummaryInviteAssetsSummaryItem'

CREATE TABLE IF NOT EXISTS `InviteAssetsSummaryInviteAssetsSummaryItem` (
  `inviteAssetsSummary` long NOT NULL
  `inviteAssetsSummaryItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `InviteAssetsSummaryItem` generated from model 'inviteAssetsSummaryItem'
--

CREATE TABLE IF NOT EXISTS `InviteAssetsSummaryItem` (
  `id` text PRIMARY KEY /*Unique identifier of the asset.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `InviteAssetsSummaryItemPermissions` generated from model 'InviteAssetsSummaryItemPermissions'

CREATE TABLE IF NOT EXISTS `InviteAssetsSummaryItemPermissions` (
  `inviteAssetsSummaryItem` long NOT NULL
  `permissions` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `InviteBusinessRoleBinding` generated from model 'inviteBusinessRoleBinding'
-- An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
--

CREATE TABLE IF NOT EXISTS `InviteBusinessRoleBinding` (
  `created_by_business_id` text /*Unique identifier for the business that created the invite/request.*/,
  `created_by_user_id` text /*Unique identifier for the user that created the invite/request.*/,
  `id` text PRIMARY KEY /*Unique identifier of the invite/request.*/,
  `invite_data` long,
  `is_received_invite` boolean /*Indicates whether the invite/request was received.*/,
  `user` long /*Metadata for the member/partner that was sent the invite/request.*/
);  /*An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.*/


-- --------------------------------------------------------------------------
-- Table structure for table `InviteDataResponse` generated from model 'inviteDataResponse'
-- Metadata for the invite/request.
--

CREATE TABLE IF NOT EXISTS `InviteDataResponse` (
  `invite_expiration` int /*The date and time when the invite/request will expire. Returned in milliseconds.*/,
  `invite_status` text /*The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.*/,
  `invite_type` text /*The type of invite. - &#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. - &#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. - &#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets.*/,
  `last_updated_time` int /*The date and time the invite/request was last updated. Returned in milliseconds.*/,
  `sent_at` int /*The date and time the invite/request was sent/created. Returned in milliseconds.*/
);  /*Metadata for the invite/request.*/


-- --------------------------------------------------------------------------
-- Table structure for table `InviteExceptionResponse` generated from model 'inviteExceptionResponse'
-- An exception object if there is an error performing the action. Will only be provided if there is an error.
--

CREATE TABLE IF NOT EXISTS `InviteExceptionResponse` (
  `code` int /*Error code associated with the error in performing the action on the invite/request.*/,
  `invite_or_request_id` text /*Unique identifier of the invite/request.*/,
  `message` text /*Error message associated with the error in performing the action on the invite/request.*/,
);  /*An exception object if there is an error performing the action. Will only be provided if there is an error.*/

-- --------------------------------------------------------------------------
-- Table structure for table `InviteExceptionResponseUsersOrPartnerIds` generated from model 'InviteExceptionResponseUsersOrPartnerIds'

CREATE TABLE IF NOT EXISTS `InviteExceptionResponseUsersOrPartnerIds` (
  `inviteExceptionResponse` long NOT NULL
  `usersOrPartnerIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `InviteResponse` generated from model 'inviteResponse'
-- A user&#39;s username or email OR a partner id that caused the error.
--

CREATE TABLE IF NOT EXISTS `InviteResponse` (
  `assets_summary` long,
  `created_by_business` long /*Metadata for the business that created the invite/request.*/,
  `created_by_user` long /*Metadata for the user that created the invite/request.*/,
  `created_time` int /*The time the invite/request was created. Returned in milliseconds.*/,
  `id` text PRIMARY KEY /*Unique identifier of the invite/request.*/,
  `invite_data` long,
  `is_received_invite` boolean /*Indicates whether the invite/request was received.*/,
  `user` long /*Metadata for the member/partner that was sent the invite/request.*/
);  /*A user&#39;s username or email OR a partner id that caused the error.*/

-- --------------------------------------------------------------------------
-- Table structure for table `InviteResponseBusinessRoles` generated from model 'InviteResponseBusinessRoles'

CREATE TABLE IF NOT EXISTS `InviteResponseBusinessRoles` (
  `inviteResponse` long NOT NULL
  `businessRoles` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributes` generated from model 'itemAttributes'
--

CREATE TABLE IF NOT EXISTS `ItemAttributes` (
  `ad_image_0_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_0_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_10_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_10_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_11_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_11_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_12_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_12_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_13_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_13_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_14_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_14_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_15_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_15_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_16_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_16_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_17_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_17_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_18_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_18_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_19_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_19_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_1_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_1_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_2_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_2_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_3_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_3_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_4_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_4_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_5_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_5_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_6_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_6_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_7_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_7_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_8_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_8_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_9_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_9_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_link` text /*Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking. Must begin with http:// or https://.*/,
  `ad_video_0_link` text /*Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_video_0_tag` text /*Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.*/,
  `ad_video_1_link` text /*Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_video_1_tag` text /*Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.*/,
  `ad_video_2_link` text /*Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_video_2_tag` text /*Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.*/,
  `adult` boolean /*Set this attribute to TRUE if you&#39;re submitting items that are considered \&quot;adult\&quot;. These will not be shown on Pinterest.*/,
  `age_group` text /*The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): &#39;newborn&#39;, &#39;infant&#39;, &#39;toddler&#39;, &#39;kids&#39;, or &#39;adult&#39;.*/,
  `android_deep_link` text /*The deep link to the product on the Android app.*/,
  `availability` text /*The availability of the product. Must be one of the following values (upper or lowercased): &#39;in stock&#39;, &#39;out of stock&#39;, &#39;preorder&#39;.*/,
  `average_review_rating` decimal /*Average reviews for the item. Can be a number from 1-5.*/,
  `brand` text /*The brand of the product.*/,
  `checkout_enabled` boolean /*This attribute is not supported anymore.*/,
  `color` text /*The primary color of the product.*/,
  `condition` text /*The condition of the product. Must be one of the following values (upper or lowercased): &#39;new&#39;, &#39;used&#39;, or &#39;refurbished&#39;.*/,
  `custom_label_0` text /*&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.*/,
  `custom_label_1` text /*&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.*/,
  `custom_label_2` text /*&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.*/,
  `custom_label_3` text /*&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.*/,
  `custom_label_4` text /*&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.*/,
  `custom_number_0` int /*An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_1` int /*An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_2` int /*An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_3` int /*An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_4` int /*An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `description` text /*&lt;&#x3D; 10000 characters. The description of the product.*/,
  `free_shipping_label` boolean /*The item is free to ship.*/,
  `free_shipping_limit` text /*The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.*/,
  `gender` text /*The gender associated with the product. Must be one of the following values (upper or lowercased): &#39;male&#39;, &#39;female&#39;, or &#39;unisex&#39;.*/,
  `google_product_category` text /*The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.*/,
  `gtin` long,
  `id` text PRIMARY KEY /*&lt;&#x3D; 127 characters. The user-created unique ID that represents the product. Only Unicode characters are accepted.*/,
  `installment_price` text /*Installment price of the product. Expected format: &lt;payment_count&gt;:&lt;payment_amount&gt; &lt;currency&gt;*/,
  `ios_deep_link` text /*The deep link to the product on the iOS app.*/,
  `item_group_id` text /*&lt;&#x3D; 127 characters. The parent ID of the product.*/,
  `last_updated_time` long /*The millisecond timestamp when the item was lastly modified by the merchant.*/,
  `link` text /*&lt;&#x3D; 511 characters. The landing page for the product.*/,
  `material` text /*The material used to make the product.*/,
  `min_ad_price` text /*The minimum advertised price of the product. It supports the following formats: \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.*/,
  `mobile_link` text /*The mobile-optimized version of your landing page. Must begin with http:// or https://.*/,
  `mpn` text /*Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.*/,
  `number_of_ratings` int /*The number of ratings for the item.*/,
  `number_of_reviews` int /*The number of reviews available for the item.*/,
  `pattern` text /*The description of the pattern used for the product.*/,
  `price` text /*The price of the product. It supports the following formats: \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.*/,
  `product_type` text /*&lt;&#x3D; 1000 characters. The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by \&quot; &gt; \&quot;.*/,
  `promotion_id` text /*A unique identifier referencing the promotion associated with this catalog item.*/,
  `sale_price` text /*The discounted price of the product. The sale_price must be lower than the price. It supports the following formats: \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;.*/,
  `sale_price_effective_date` text /*Sale price effective date. Expected format: &lt;start_date&gt;/&lt;end_date&gt; (ISO 8601 format)*/,
  `shipping` text /*Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.*/,
  `shipping_height` text /*The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.*/,
  `shipping_weight` text /*The weight of the product. Ensure there is a space between the numeric string and the metric.*/,
  `shipping_width` text /*The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.*/,
  `size` text /*The size of the product.*/,
  `size_system` text /*Indicates the country&#39;s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): &#39;US&#39;, &#39;UK&#39;, &#39;EU&#39;, &#39;DE&#39;, &#39;FR&#39;, &#39;JP&#39;, &#39;CN&#39;, &#39;IT&#39;, &#39;BR&#39;, &#39;MEX&#39;, or &#39;AU&#39;.*/,
  `size_type` text /*Additional description for the size. Must be one of the following values (upper or lowercased): &#39;regular&#39;, &#39;petite&#39;, &#39;plus&#39;, &#39;big_and_tall&#39;, or &#39;maternity&#39;.*/,
  `tax` text /*Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.*/,
  `title` text /*&lt;&#x3D; 500 characters. The name of the product.*/,
  `unit_pricing_base_measure` text /*Unit pricing base measure of the product. Expected format: &lt;base_measure&gt; &lt;unit_type&gt;*/,
  `unit_pricing_measure` text /*Unit pricing total measure of the product. Expected format: &lt;total_units&gt; &lt;unit_type&gt;*/,
  `video_link` text /*&lt;&#x3D; 2,000 characters. Hosted link to the product video. File types must be .mp4, .mov or .m4v. File size cannot exceed 2GB.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributesVariantNames` generated from model 'ItemAttributesVariantNames'

CREATE TABLE IF NOT EXISTS `ItemAttributesVariantNames` (
  `itemAttributes` long NOT NULL
  `variantNames` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributesVariantValues` generated from model 'ItemAttributesVariantValues'

CREATE TABLE IF NOT EXISTS `ItemAttributesVariantValues` (
  `itemAttributes` long NOT NULL
  `variantValues` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributesAdditionalImageLink` generated from model 'ItemAttributesAdditionalImageLink'

CREATE TABLE IF NOT EXISTS `ItemAttributesAdditionalImageLink` (
  `itemAttributes` long NOT NULL
  `additionalImageLink` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributesCatalogsAiContentDisclosure` generated from model 'ItemAttributesCatalogsAiContentDisclosure'

CREATE TABLE IF NOT EXISTS `ItemAttributesCatalogsAiContentDisclosure` (
  `itemAttributes` long NOT NULL
  `catalogsAiContentDisclosure` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributesImageLink` generated from model 'ItemAttributesImageLink'

CREATE TABLE IF NOT EXISTS `ItemAttributesImageLink` (
  `itemAttributes` long NOT NULL
  `imageLink` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributesRequest` generated from model 'itemAttributesRequest'
--

CREATE TABLE IF NOT EXISTS `ItemAttributesRequest` (
  `ad_image_0_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_0_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_10_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_10_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_11_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_11_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_12_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_12_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_13_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_13_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_14_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_14_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_15_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_15_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_16_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_16_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_17_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_17_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_18_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_18_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_19_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_19_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_1_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_1_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_2_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_2_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_3_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_3_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_4_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_4_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_5_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_5_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_6_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_6_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_7_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_7_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_8_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_8_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_9_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_9_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_link` text /*Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking. Must begin with http:// or https://.*/,
  `ad_video_0_link` text /*Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_video_0_tag` text /*Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.*/,
  `ad_video_1_link` text /*Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_video_1_tag` text /*Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.*/,
  `ad_video_2_link` text /*Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_video_2_tag` text /*Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.*/,
  `adult` boolean /*Set this attribute to TRUE if you&#39;re submitting items that are considered \&quot;adult\&quot;. These will not be shown on Pinterest.*/,
  `age_group` text /*The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): &#39;newborn&#39;, &#39;infant&#39;, &#39;toddler&#39;, &#39;kids&#39;, or &#39;adult&#39;.*/,
  `android_deep_link` text /*The deep link to the product on the Android app.*/,
  `availability` text /*The availability of the product. Must be one of the following values (upper or lowercased): &#39;in stock&#39;, &#39;out of stock&#39;, &#39;preorder&#39;.*/,
  `average_review_rating` decimal /*Average reviews for the item. Can be a number from 1-5.*/,
  `brand` text /*The brand of the product.*/,
  `checkout_enabled` boolean /*This attribute is not supported anymore.*/,
  `color` text /*The primary color of the product.*/,
  `condition` text /*The condition of the product. Must be one of the following values (upper or lowercased): &#39;new&#39;, &#39;used&#39;, or &#39;refurbished&#39;.*/,
  `custom_label_0` text /*&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.*/,
  `custom_label_1` text /*&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.*/,
  `custom_label_2` text /*&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.*/,
  `custom_label_3` text /*&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.*/,
  `custom_label_4` text /*&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.*/,
  `custom_number_0` int /*An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_1` int /*An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_2` int /*An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_3` int /*An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_4` int /*An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `description` text /*&lt;&#x3D; 10000 characters. The description of the product.*/,
  `free_shipping_label` boolean /*The item is free to ship.*/,
  `free_shipping_limit` text /*The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.*/,
  `gender` text /*The gender associated with the product. Must be one of the following values (upper or lowercased): &#39;male&#39;, &#39;female&#39;, or &#39;unisex&#39;.*/,
  `google_product_category` text /*The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.*/,
  `gtin` long,
  `id` text PRIMARY KEY /*&lt;&#x3D; 127 characters. The user-created unique ID that represents the product. Only Unicode characters are accepted.*/,
  `image_link` long,
  `installment_price` text /*Installment price of the product. Expected format: &lt;payment_count&gt;:&lt;payment_amount&gt; &lt;currency&gt;*/,
  `ios_deep_link` text /*The deep link to the product on the iOS app.*/,
  `item_group_id` text /*&lt;&#x3D; 127 characters. The parent ID of the product.*/,
  `last_updated_time` long /*The millisecond timestamp when the item was lastly modified by the merchant.*/,
  `link` text /*&lt;&#x3D; 511 characters. The landing page for the product.*/,
  `material` text /*The material used to make the product.*/,
  `min_ad_price` text /*The minimum advertised price of the product. It supports the following formats: \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.*/,
  `mobile_link` text /*The mobile-optimized version of your landing page. Must begin with http:// or https://.*/,
  `mpn` text /*Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.*/,
  `number_of_ratings` int /*The number of ratings for the item.*/,
  `number_of_reviews` int /*The number of reviews available for the item.*/,
  `pattern` text /*The description of the pattern used for the product.*/,
  `price` text /*The price of the product. It supports the following formats: \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.*/,
  `product_type` text /*&lt;&#x3D; 1000 characters. The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by \&quot; &gt; \&quot;.*/,
  `promotion_id` text /*A unique identifier referencing the promotion associated with this catalog item.*/,
  `sale_price` text /*The discounted price of the product. The sale_price must be lower than the price. It supports the following formats: \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;.*/,
  `sale_price_effective_date` text /*Sale price effective date. Expected format: &lt;start_date&gt;/&lt;end_date&gt; (ISO 8601 format)*/,
  `save_pin_disabled` boolean /*By default, product pins created from a catalog are able to be saved by Pinners. If you want to disable the save pin feature, set this attribute to true. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.*/,
  `shipping` text /*Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.*/,
  `shipping_height` text /*The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.*/,
  `shipping_weight` text /*The weight of the product. Ensure there is a space between the numeric string and the metric.*/,
  `shipping_width` text /*The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.*/,
  `size` text /*The size of the product.*/,
  `size_system` text /*Indicates the country&#39;s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): &#39;US&#39;, &#39;UK&#39;, &#39;EU&#39;, &#39;DE&#39;, &#39;FR&#39;, &#39;JP&#39;, &#39;CN&#39;, &#39;IT&#39;, &#39;BR&#39;, &#39;MEX&#39;, or &#39;AU&#39;.*/,
  `size_type` text /*Additional description for the size. Must be one of the following values (upper or lowercased): &#39;regular&#39;, &#39;petite&#39;, &#39;plus&#39;, &#39;big_and_tall&#39;, or &#39;maternity&#39;.*/,
  `tax` text /*Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.*/,
  `title` text /*&lt;&#x3D; 500 characters. The name of the product.*/,
  `unit_pricing_base_measure` text /*Unit pricing base measure of the product. Expected format: &lt;base_measure&gt; &lt;unit_type&gt;*/,
  `unit_pricing_measure` text /*Unit pricing total measure of the product. Expected format: &lt;total_units&gt; &lt;unit_type&gt;*/,
  `video_link` text /*&lt;&#x3D; 2,000 characters Hosted link to the product video. File types for linked videos must be .mp4, .mov or .m4v. File size cannot exceed 2GB.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributesRequestAdditionalImageLink` generated from model 'ItemAttributesRequestAdditionalImageLink'

CREATE TABLE IF NOT EXISTS `ItemAttributesRequestAdditionalImageLink` (
  `itemAttributesRequest` long NOT NULL
  `additionalImageLink` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributesRequestCatalogsAiContentDisclosure` generated from model 'ItemAttributesRequestCatalogsAiContentDisclosure'

CREATE TABLE IF NOT EXISTS `ItemAttributesRequestCatalogsAiContentDisclosure` (
  `itemAttributesRequest` long NOT NULL
  `catalogsAiContentDisclosure` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributesRequestVariantNames` generated from model 'ItemAttributesRequestVariantNames'

CREATE TABLE IF NOT EXISTS `ItemAttributesRequestVariantNames` (
  `itemAttributesRequest` long NOT NULL
  `variantNames` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributesRequestVariantValues` generated from model 'ItemAttributesRequestVariantValues'

CREATE TABLE IF NOT EXISTS `ItemAttributesRequestVariantValues` (
  `itemAttributesRequest` long NOT NULL
  `variantValues` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ItemCreateBatchRecord` generated from model 'itemCreateBatchRecord'
-- Object describing an item batch record to create items
--

CREATE TABLE IF NOT EXISTS `ItemCreateBatchRecord` (
  `attributes` long,
  `item_id` text /*The catalog item id in the merchant namespace*/
);  /*Object describing an item batch record to create items*/


-- --------------------------------------------------------------------------
-- Table structure for table `ItemDeleteBatchRecord` generated from model 'itemDeleteBatchRecord'
-- Object describing an item batch record to delete items
--

CREATE TABLE IF NOT EXISTS `ItemDeleteBatchRecord` (
  `item_id` text /*The catalog item id in the merchant namespace*/
);  /*Object describing an item batch record to delete items*/


-- --------------------------------------------------------------------------
-- Table structure for table `ItemDeleteDiscontinuedBatchRecord` generated from model 'itemDeleteDiscontinuedBatchRecord'
-- Object describing an item batch record to discontinue items
--

CREATE TABLE IF NOT EXISTS `ItemDeleteDiscontinuedBatchRecord` (
  `item_id` text /*The catalog item id in the merchant namespace*/
);  /*Object describing an item batch record to discontinue items*/


-- --------------------------------------------------------------------------
-- Table structure for table `ItemGroupIdFilter` generated from model 'itemGroupIdFilter'
--

CREATE TABLE IF NOT EXISTS `ItemGroupIdFilter` (
  `ITEM_GROUP_ID` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemIdFilter` generated from model 'itemIdFilter'
--

CREATE TABLE IF NOT EXISTS `ItemIdFilter` (
  `ITEM_ID` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemIdStoreCodePair` generated from model 'itemIdStoreCodePair'
-- A pair of item_id and store_code that uniquely identifies a local inventory item
--

CREATE TABLE IF NOT EXISTS `ItemIdStoreCodePair` (
  `item_id` text NOT NULL /*Catalog item id in the merchant namespace*/,
  `store_code` text NOT NULL /*Store code for the local inventory item*/
);  /*A pair of item_id and store_code that uniquely identifies a local inventory item*/


-- --------------------------------------------------------------------------
-- Table structure for table `ItemProcessingRecord` generated from model 'itemProcessingRecord'
-- Object describing an item processing record
--

CREATE TABLE IF NOT EXISTS `ItemProcessingRecord` (
  `item_id` text /*The catalog item id in the merchant namespace*/,
  `status` long,
);  /*Object describing an item processing record*/

-- --------------------------------------------------------------------------
-- Table structure for table `ItemProcessingRecordItemValidationEvent` generated from model 'ItemProcessingRecordItemValidationEvent'

CREATE TABLE IF NOT EXISTS `ItemProcessingRecordItemValidationEvent` (
  `itemProcessingRecord` long NOT NULL
  `itemValidationEvent` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemProcessingRecordItemValidationEvent` generated from model 'ItemProcessingRecordItemValidationEvent'

CREATE TABLE IF NOT EXISTS `ItemProcessingRecordItemValidationEvent` (
  `itemProcessingRecord` long NOT NULL
  `itemValidationEvent` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ItemResponse` generated from model 'itemResponse'
-- Object describing an item record or error. Discriminated by &#x60;item_response_kind&#x60; (one unique value per leaf).
--

CREATE TABLE IF NOT EXISTS `ItemResponse` (
  `catalog_type` text NOT NULL,
  `item_response_kind` text NOT NULL /*Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.*/,
  `attributes` long,
  `item_id` text /*The catalog item id in the merchant namespace*/,
  `hotel_id` text /*The catalog hotel id in the merchant namespace*/,
  `creative_assets_id` text /*The catalog creative assets id in the merchant namespace*/
);  /*Object describing an item record or error. Discriminated by &#x60;item_response_kind&#x60; (one unique value per leaf).*/

-- --------------------------------------------------------------------------
-- Table structure for table `ItemResponseItemValidationEvent` generated from model 'ItemResponseItemValidationEvent'

CREATE TABLE IF NOT EXISTS `ItemResponseItemValidationEvent` (
  `itemResponse` long NOT NULL
  `itemValidationEvent` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemResponsePin` generated from model 'ItemResponsePin'

CREATE TABLE IF NOT EXISTS `ItemResponsePin` (
  `itemResponse` long NOT NULL
  `pin` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ItemUpdateBatchRecord` generated from model 'itemUpdateBatchRecord'
-- Object describing an item batch record to update items
--

CREATE TABLE IF NOT EXISTS `ItemUpdateBatchRecord` (
  `attributes` long,
  `item_id` text /*The catalog item id in the merchant namespace*/,
);  /*Object describing an item batch record to update items*/

-- --------------------------------------------------------------------------
-- Table structure for table `ItemUpdateBatchRecordUpdateMaskFieldType` generated from model 'ItemUpdateBatchRecordUpdateMaskFieldType'

CREATE TABLE IF NOT EXISTS `ItemUpdateBatchRecordUpdateMaskFieldType` (
  `itemUpdateBatchRecord` long NOT NULL
  `updateMaskFieldType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ItemUpsertBatchRecord` generated from model 'itemUpsertBatchRecord'
-- Object describing an item batch record to upsert items
--

CREATE TABLE IF NOT EXISTS `ItemUpsertBatchRecord` (
  `attributes` long,
  `item_id` text /*The catalog item id in the merchant namespace*/
);  /*Object describing an item batch record to upsert items*/


-- --------------------------------------------------------------------------
-- Table structure for table `ItemValidationEvent` generated from model 'itemValidationEvent'
-- Object describing an item validation event
--

CREATE TABLE IF NOT EXISTS `ItemValidationEvent` (
  `attribute` text /*The attribute that the item validation event references*/,
  `code` int /*The event code that the item validation event references*/,
  `message` text /*Title message describing the item validation event*/
);  /*Object describing an item validation event*/


-- --------------------------------------------------------------------------
-- Table structure for table `items_issues_list_200_response` generated from model 'itemsIssuesList200Response'
--

CREATE TABLE IF NOT EXISTS `items_issues_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ItemsIssuesList200ResponseCatalogsItemValidationIssues` generated from model 'ItemsIssuesList200ResponseCatalogsItemValidationIssues'

CREATE TABLE IF NOT EXISTS `ItemsIssuesList200ResponseCatalogsItemValidationIssues` (
  `itemsIssuesList200Response` long NOT NULL
  `catalogsItemValidationIssues` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `items_post_200_response` generated from model 'itemsPost200Response'
--

CREATE TABLE IF NOT EXISTS `items_post_200_response` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ItemsPost200ResponseItemResponse` generated from model 'ItemsPost200ResponseItemResponse'

CREATE TABLE IF NOT EXISTS `ItemsPost200ResponseItemResponse` (
  `itemsPost200Response` long NOT NULL
  `itemResponse` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `Keyword` generated from model 'keyword'
--

CREATE TABLE IF NOT EXISTS `Keyword` (
  `id` text NOT NULL PRIMARY KEY /*Keyword ID .*/,
  `match_type` long NOT NULL /*Keyword [match type](/docs/api-features/targeting-overview/)*/,
  `parent_id` text NOT NULL /*Keyword parent entity ID (advertiser, campaign, ad group).*/,
  `value` text NOT NULL /*Keyword value (120 chars max).*/,
  `archived` boolean,
  `bid` int /***Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.*/,
  `parent_type` text /*Parent entity type (advertiser, campaign, ad group).*/,
  `type` text /*Always keyword*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `KeywordCreateItem` generated from model 'keywordCreateItem'
--

CREATE TABLE IF NOT EXISTS `KeywordCreateItem` (
  `match_type` long NOT NULL /*Keyword [match type](/docs/api-features/targeting-overview/)*/,
  `value` text NOT NULL /*Keyword value (120 chars max).*/,
  `bid` int /***Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `KeywordError` generated from model 'keywordError'
--

CREATE TABLE IF NOT EXISTS `KeywordError` (
  `data` long,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `KeywordErrorErrorMessages` generated from model 'KeywordErrorErrorMessages'

CREATE TABLE IF NOT EXISTS `KeywordErrorErrorMessages` (
  `keywordError` long NOT NULL
  `errorMessages` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `KeywordInfo` generated from model 'keywordInfo'
-- Related Keyword information of the editorial article
--

CREATE TABLE IF NOT EXISTS `KeywordInfo` (
  `name` text NOT NULL /*Keyword Name*/,
  `pct_growth_mom` decimal /*MoM growth as a percentage, if there is no growth rate, this field is not present*/
);  /*Related Keyword information of the editorial article*/


-- --------------------------------------------------------------------------
-- Table structure for table `KeywordMetrics` generated from model 'keywordMetrics'
-- Keyword metrics JSON
--

CREATE TABLE IF NOT EXISTS `KeywordMetrics` (
  `keyword_query_volume` text /*Keyword&#39;s search frequency. This value is based on keyword frequency in pepsi client response*/
);  /*Keyword metrics JSON*/


-- --------------------------------------------------------------------------
-- Table structure for table `KeywordMetricsResponse` generated from model 'keywordMetricsResponse'
--

CREATE TABLE IF NOT EXISTS `KeywordMetricsResponse` (
  `keyword` text /*Keyword name, e.g., \&quot;keyword\&quot;:\&quot;fashion outfits\&quot;*/,
  `metrics` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `KeywordUpdateGenerated` generated from model 'keywordUpdateGenerated'
--

CREATE TABLE IF NOT EXISTS `KeywordUpdateGenerated` (
  `id` text NOT NULL PRIMARY KEY /*Keyword ID.*/,
  `archived` boolean /*Is keyword archived?*/,
  `bid` int /*&lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `KeywordUpdateItem` generated from model 'keywordUpdateItem'
--

CREATE TABLE IF NOT EXISTS `KeywordUpdateItem` (
  `id` text NOT NULL PRIMARY KEY /*Keyword ID .*/,
  `archived` boolean,
  `bid` int /***Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Keywords` generated from model 'keywords'
--

CREATE TABLE IF NOT EXISTS `Keywords` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `KeywordsKeywordError` generated from model 'KeywordsKeywordError'

CREATE TABLE IF NOT EXISTS `KeywordsKeywordError` (
  `keywords` long NOT NULL
  `keywordError` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `KeywordsKeyword` generated from model 'KeywordsKeyword'

CREATE TABLE IF NOT EXISTS `KeywordsKeyword` (
  `keywords` long NOT NULL
  `keyword` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `KeywordsCommon` generated from model 'keywordsCommon'
--

CREATE TABLE IF NOT EXISTS `KeywordsCommon` (
  `match_type` long NOT NULL,
  `value` text NOT NULL /*Keyword value (120 chars max).*/,
  `bid` int /*&lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `KeywordsCreate` generated from model 'keywordsCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `KeywordsCreate` (
  `parent_id` text NOT NULL /*Keyword data*/
);  /*Resource create operation model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `KeywordsCreateKeywordCreateItem` generated from model 'KeywordsCreateKeywordCreateItem'

CREATE TABLE IF NOT EXISTS `KeywordsCreateKeywordCreateItem` (
  `keywordsCreate` long NOT NULL
  `keywordCreateItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `keywords_get_200_response` generated from model 'keywordsGet200Response'
--

CREATE TABLE IF NOT EXISTS `keywords_get_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `KeywordsGet200ResponseKeyword` generated from model 'KeywordsGet200ResponseKeyword'

CREATE TABLE IF NOT EXISTS `KeywordsGet200ResponseKeyword` (
  `keywordsGet200Response` long NOT NULL
  `keyword` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `KeywordsMetricsArrayResponse` generated from model 'keywordsMetricsArrayResponse'
--

CREATE TABLE IF NOT EXISTS `KeywordsMetricsArrayResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `KeywordsMetricsArrayResponseKeywordMetricsResponse` generated from model 'KeywordsMetricsArrayResponseKeywordMetricsResponse'

CREATE TABLE IF NOT EXISTS `KeywordsMetricsArrayResponseKeywordMetricsResponse` (
  `keywordsMetricsArrayResponse` long NOT NULL
  `keywordMetricsResponse` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `KeywordsRequest` generated from model 'keywordsRequest'
--

CREATE TABLE IF NOT EXISTS `KeywordsRequest` (
  `parent_id` text NOT NULL /*Keyword parent entity ID (advertiser, campaign, ad group).*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `KeywordsRequestKeywordsCommon` generated from model 'KeywordsRequestKeywordsCommon'

CREATE TABLE IF NOT EXISTS `KeywordsRequestKeywordsCommon` (
  `keywordsRequest` long NOT NULL
  `keywordsCommon` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `KeywordsUpdate` generated from model 'keywordsUpdate'
-- Resource create or update operation model.
--

CREATE TABLE IF NOT EXISTS `KeywordsUpdate` (
);  /*Resource create or update operation model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `KeywordsUpdateKeywordUpdateItem` generated from model 'KeywordsUpdateKeywordUpdateItem'

CREATE TABLE IF NOT EXISTS `KeywordsUpdateKeywordUpdateItem` (
  `keywordsUpdate` long NOT NULL
  `keywordUpdateItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `Label` generated from model 'label'
--

CREATE TABLE IF NOT EXISTS `Label` (
  `id` text NOT NULL PRIMARY KEY /*Label ID.*/,
  `label_type` long NOT NULL,
  `value` text NOT NULL /*Label name. 100-character limit.*/,
  `status` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LabelBulkCreateRequest` generated from model 'labelBulkCreateRequest'
--

CREATE TABLE IF NOT EXISTS `LabelBulkCreateRequest` (
  `parent_id` text NOT NULL /*Unique identifier of the asset you are labelling. Currently, you can only label campaigns.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LabelBulkCreateRequestLabelCreateItem` generated from model 'LabelBulkCreateRequestLabelCreateItem'

CREATE TABLE IF NOT EXISTS `LabelBulkCreateRequestLabelCreateItem` (
  `labelBulkCreateRequest` long NOT NULL
  `labelCreateItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LabelBulkUpdateRequest` generated from model 'labelBulkUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `LabelBulkUpdateRequest` (
  `id` text NOT NULL PRIMARY KEY /*Label ID.*/,
  `parent_id` text NOT NULL /*Unique identifier of the asset you are labelling. Currently, you can only label campaigns.*/,
  `status` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LabelCreateItem` generated from model 'labelCreateItem'
--

CREATE TABLE IF NOT EXISTS `LabelCreateItem` (
  `label_type` long NOT NULL,
  `value` text NOT NULL /*Label name. 100-character limit.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LabelCreateRequest` generated from model 'labelCreateRequest'
--

CREATE TABLE IF NOT EXISTS `LabelCreateRequest` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LabelCreateRequestLabelCreateItem` generated from model 'LabelCreateRequestLabelCreateItem'

CREATE TABLE IF NOT EXISTS `LabelCreateRequestLabelCreateItem` (
  `labelCreateRequest` long NOT NULL
  `labelCreateItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LabelError` generated from model 'labelError'
--

CREATE TABLE IF NOT EXISTS `LabelError` (
  `data` long,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LabelErrorErrorMessages` generated from model 'LabelErrorErrorMessages'

CREATE TABLE IF NOT EXISTS `LabelErrorErrorMessages` (
  `labelError` long NOT NULL
  `errorMessages` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LabelErrorData` generated from model 'labelErrorData'
--

CREATE TABLE IF NOT EXISTS `LabelErrorData` (
  `id` text PRIMARY KEY /*Label ID.*/,
  `label_type` long,
  `status` long,
  `value` text /*Label name. 100-character limit.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LabelUpdateItem` generated from model 'labelUpdateItem'
--

CREATE TABLE IF NOT EXISTS `LabelUpdateItem` (
  `id` text NOT NULL PRIMARY KEY /*Label ID.*/,
  `status` long,
  `value` text /*Label name. 100-character limit.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LabelUpdateRequest` generated from model 'labelUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `LabelUpdateRequest` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LabelUpdateRequestLabelUpdateItem` generated from model 'LabelUpdateRequestLabelUpdateItem'

CREATE TABLE IF NOT EXISTS `LabelUpdateRequestLabelUpdateItem` (
  `labelUpdateRequest` long NOT NULL
  `labelUpdateItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LabeledEntities` generated from model 'labeledEntities'
--

CREATE TABLE IF NOT EXISTS `LabeledEntities` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LabeledEntitiesEntityLabel` generated from model 'LabeledEntitiesEntityLabel'

CREATE TABLE IF NOT EXISTS `LabeledEntitiesEntityLabel` (
  `labeledEntities` long NOT NULL
  `entityLabel` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `LabeledEntitiesEntityLabelError` generated from model 'LabeledEntitiesEntityLabelError'

CREATE TABLE IF NOT EXISTS `LabeledEntitiesEntityLabelError` (
  `labeledEntities` long NOT NULL
  `entityLabelError` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LabeledEntitiesCreate` generated from model 'labeledEntitiesCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `LabeledEntitiesCreate` (
);  /*Resource create operation model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `LabeledEntitiesCreateEntityIds` generated from model 'LabeledEntitiesCreateEntityIds'

CREATE TABLE IF NOT EXISTS `LabeledEntitiesCreateEntityIds` (
  `labeledEntitiesCreate` long NOT NULL
  `entityIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `labels_list_200_response` generated from model 'labelsList200Response'
--

CREATE TABLE IF NOT EXISTS `labels_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LabelsList200ResponseLabel` generated from model 'LabelsList200ResponseLabel'

CREATE TABLE IF NOT EXISTS `LabelsList200ResponseLabel` (
  `labelsList200Response` long NOT NULL
  `label` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LabelsResponse` generated from model 'labelsResponse'
--

CREATE TABLE IF NOT EXISTS `LabelsResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LabelsResponseLabelError` generated from model 'LabelsResponseLabelError'

CREATE TABLE IF NOT EXISTS `LabelsResponseLabelError` (
  `labelsResponse` long NOT NULL
  `labelError` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `LabelsResponseLabel` generated from model 'LabelsResponseLabel'

CREATE TABLE IF NOT EXISTS `LabelsResponseLabel` (
  `labelsResponse` long NOT NULL
  `label` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LeadForm` generated from model 'leadForm'
--

CREATE TABLE IF NOT EXISTS `LeadForm` (
  `completion_message` text NOT NULL /*A message for people who complete the form to let them know what happens next.*/,
  `has_accepted_terms` boolean NOT NULL /*Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO*/,
  `id` text NOT NULL PRIMARY KEY /*The ID of this lead form*/,
  `name` text NOT NULL /*Internal name of the lead form.*/,
  `privacy_policy_link` text NOT NULL /*A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.*/,
  `ad_account_id` text /*The Ad Account ID that this lead form belongs to.*/,
  `created_time` int /*Lead form creation time. Unix timestamp in seconds.*/,
  `disclosure_language` text /*Additional disclosure language to be included in the lead form.*/,
  `status` long,
  `updated_time` int /*Last update time. Unix timestamp in seconds.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormLeadFormQuestion` generated from model 'LeadFormLeadFormQuestion'

CREATE TABLE IF NOT EXISTS `LeadFormLeadFormQuestion` (
  `leadForm` long NOT NULL
  `leadFormQuestion` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormLeadFormPolicyLink` generated from model 'LeadFormLeadFormPolicyLink'

CREATE TABLE IF NOT EXISTS `LeadFormLeadFormPolicyLink` (
  `leadForm` long NOT NULL
  `leadFormPolicyLink` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormBatchUpdate` generated from model 'leadFormBatchUpdate'
--

CREATE TABLE IF NOT EXISTS `LeadFormBatchUpdate` (
  `id` text NOT NULL PRIMARY KEY /*The ID of this lead form*/,
  `completion_message` text /*A message for people who complete the form to let them know what happens next.*/,
  `disclosure_language` text /*Additional disclosure language to be included in the lead form.*/,
  `has_accepted_terms` boolean /*Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO*/,
  `name` text /*Internal name of the lead form.*/,
  `privacy_policy_link` text /*A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.*/,
  `status` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormBatchUpdateLeadFormPolicyLink` generated from model 'LeadFormBatchUpdateLeadFormPolicyLink'

CREATE TABLE IF NOT EXISTS `LeadFormBatchUpdateLeadFormPolicyLink` (
  `leadFormBatchUpdate` long NOT NULL
  `leadFormPolicyLink` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormBatchUpdateLeadFormQuestion` generated from model 'LeadFormBatchUpdateLeadFormQuestion'

CREATE TABLE IF NOT EXISTS `LeadFormBatchUpdateLeadFormQuestion` (
  `leadFormBatchUpdate` long NOT NULL
  `leadFormQuestion` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormCreate` generated from model 'leadFormCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `LeadFormCreate` (
  `completion_message` text NOT NULL /*A message for people who complete the form to let them know what happens next.*/,
  `has_accepted_terms` boolean NOT NULL /*Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO*/,
  `name` text NOT NULL /*Internal name of the lead form.*/,
  `privacy_policy_link` text NOT NULL /*A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.*/,
  `disclosure_language` text /*Additional disclosure language to be included in the lead form.*/,
  `status` long
);  /*Resource create operation model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormCreateLeadFormQuestion` generated from model 'LeadFormCreateLeadFormQuestion'

CREATE TABLE IF NOT EXISTS `LeadFormCreateLeadFormQuestion` (
  `leadFormCreate` long NOT NULL
  `leadFormQuestion` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormCreateLeadFormPolicyLink` generated from model 'LeadFormCreateLeadFormPolicyLink'

CREATE TABLE IF NOT EXISTS `LeadFormCreateLeadFormPolicyLink` (
  `leadFormCreate` long NOT NULL
  `leadFormPolicyLink` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormPolicyLink` generated from model 'leadFormPolicyLink'
--

CREATE TABLE IF NOT EXISTS `LeadFormPolicyLink` (
  `label` text /*Policy label for an additional policy link.*/,
  `link` text /*Policy link for an additional policy link.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormQuestion` generated from model 'leadFormQuestion'
--

CREATE TABLE IF NOT EXISTS `LeadFormQuestion` (
  `custom_question_field_type` long,
  `custom_question_label` text /*Question label for a custom question.*/,
  `question_type` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormQuestionCustomQuestionOptions` generated from model 'LeadFormQuestionCustomQuestionOptions'

CREATE TABLE IF NOT EXISTS `LeadFormQuestionCustomQuestionOptions` (
  `leadFormQuestion` long NOT NULL
  `customQuestionOptions` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormTest` generated from model 'leadFormTest'
-- Lead form test action: submit sample answers and receive the resulting subscription id.
--

CREATE TABLE IF NOT EXISTS `LeadFormTest` (
  `subscription_id` text /*Subscription ID.*/
);  /*Lead form test action: submit sample answers and receive the resulting subscription id.*/


-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormTestCreate` generated from model 'leadFormTestCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `LeadFormTestCreate` (
);  /*Resource create operation model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormTestCreateAnswers` generated from model 'LeadFormTestCreateAnswers'

CREATE TABLE IF NOT EXISTS `LeadFormTestCreateAnswers` (
  `leadFormTestCreate` long NOT NULL
  `answers` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `lead_forms_create_200_response` generated from model 'leadFormsCreate200Response'
--

CREATE TABLE IF NOT EXISTS `lead_forms_create_200_response` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormsCreate200ResponseLeadFormsCreate200ResponseItemsInner` generated from model 'LeadFormsCreate200ResponseLeadFormsCreate200ResponseItemsInner'

CREATE TABLE IF NOT EXISTS `LeadFormsCreate200ResponseLeadFormsCreate200ResponseItemsInner` (
  `leadFormsCreate200Response` long NOT NULL
  `leadFormsCreate200ResponseItemsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `lead_forms_create_200_response_items_inner` generated from model 'leadFormsCreate200ResponseItemsInner'
--

CREATE TABLE IF NOT EXISTS `lead_forms_create_200_response_items_inner` (
  `data` long,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormsCreate200ResponseItemsInnerPinterestLibBatchItemException` generated from model 'LeadFormsCreate200ResponseItemsInnerPinterestLibBatchItemException'

CREATE TABLE IF NOT EXISTS `LeadFormsCreate200ResponseItemsInnerPinterestLibBatchItemException` (
  `leadFormsCreate200ResponseItemsInner` long NOT NULL
  `pinterestLibBatchItemException` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `lead_forms_list_200_response` generated from model 'leadFormsList200Response'
--

CREATE TABLE IF NOT EXISTS `lead_forms_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormsList200ResponseLeadForm` generated from model 'LeadFormsList200ResponseLeadForm'

CREATE TABLE IF NOT EXISTS `LeadFormsList200ResponseLeadForm` (
  `leadFormsList200Response` long NOT NULL
  `leadForm` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LeadSubscription` generated from model 'leadSubscription'
--

CREATE TABLE IF NOT EXISTS `LeadSubscription` (
  `ad_account_id` text /*The Ad Account ID that this lead form belongs to.*/,
  `api_version` text /*API version.*/,
  `created_time` int /*Subscription creation time. Unix timestamp in milliseconds.*/,
  `cryptographic_algorithm` text /*Lead data encryption algorithm.*/,
  `cryptographic_key` text /*Base64 encoded key for client to decrypt lead data.*/,
  `id` text PRIMARY KEY /*Subscription ID.*/,
  `lead_form_id` text /*Lead form ID.*/,
  `user_account_id` text /*User account used to subscribe lead data.*/,
  `webhook_url` text /*Standard HTTPS webhook URL.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LeadSubscriptionCreate` generated from model 'leadSubscriptionCreate'
--

CREATE TABLE IF NOT EXISTS `LeadSubscriptionCreate` (
  `webhook_url` text NOT NULL /*Standard HTTPS webhook URL.*/,
  `lead_form_id` text /*Lead form ID.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LeadSubscriptionPostParams` generated from model 'leadSubscriptionPostParams'
--

CREATE TABLE IF NOT EXISTS `LeadSubscriptionPostParams` (
  `ad_account_id` text /*The Ad Account ID that this lead form belongs to.*/,
  `api_version` text /*API version.*/,
  `created_time` int /*Subscription creation time. Unix timestamp in milliseconds.*/,
  `cryptographic_algorithm` text /*Lead data encryption algorithm.*/,
  `cryptographic_key` text /*Base64 encoded key for client to decrypt lead data.*/,
  `id` text PRIMARY KEY /*Subscription ID.*/,
  `lead_form_id` text /*Lead form ID.*/,
  `user_account_id` text /*User account used to subscribe lead data.*/,
  `webhook_url` text /*Standard HTTPS webhook URL.*/,
  `partner_access_token` text /*Partner access token. Only for clients that requires authentication. We recommend to avoid this param.*/,
  `partner_metadata` long /*Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.*/,
  `partner_refresh_token` text /*Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LeadSubscriptionPostParamsCreate` generated from model 'leadSubscriptionPostParamsCreate'
--

CREATE TABLE IF NOT EXISTS `LeadSubscriptionPostParamsCreate` (
  `webhook_url` text NOT NULL /*Standard HTTPS webhook URL.*/,
  `lead_form_id` text /*Lead form ID.*/,
  `partner_access_token` text /*Partner access token. Only for clients that requires authentication. We recommend to avoid this param.*/,
  `partner_metadata` long /*Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.*/,
  `partner_refresh_token` text /*Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LeadsExportResponseData` generated from model 'leadsExportResponseData'
--

CREATE TABLE IF NOT EXISTS `LeadsExportResponseData` (
  `download_url` text,
  `export_status` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LeadsExports` generated from model 'leadsExports'
--

CREATE TABLE IF NOT EXISTS `LeadsExports` (
  `leads_export_id` text /*ID for the leads export job.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LeadsExportsCreate` generated from model 'leadsExportsCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `LeadsExportsCreate` (
  `ad_id` text NOT NULL /*ID for the ad collecting leads.*/,
  `end_date` text NOT NULL /*Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.*/,
  `start_date` text NOT NULL /*Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.*/
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `LineItem` generated from model 'lineItem'
--

CREATE TABLE IF NOT EXISTS `LineItem` (
  `product_brand` text /*Product brand. For example, &#39;Parker&#39;.*/,
  `product_category` text /*Product category. For example, &#39;Shoes&#39;.*/,
  `product_id` int /*Product ID. For example, 1414.*/,
  `product_name` text /*Product name. For example, &#39;Parker Boots&#39;.*/,
  `product_price` text /*Product price. For example, &#39;99.99&#39;.*/,
  `product_quantity` int /*Product quantity. For example, 2.*/,
  `product_variant` text /*Product variant. For example, &#39;Red&#39;.*/,
  `product_variant_id` text /*Product variant ID. For example, &#39;1414-34832&#39;.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LinkFilter` generated from model 'linkFilter'
--

CREATE TABLE IF NOT EXISTS `LinkFilter` (
  `LINK` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LinkedBusiness` generated from model 'linkedBusiness'
--

CREATE TABLE IF NOT EXISTS `LinkedBusiness` (
  `image_large_url` text /*image_large_url*/,
  `image_medium_url` text /*image_medium_url*/,
  `image_small_url` text /*image_small_url*/,
  `image_xlarge_url` text /*image_xlarge_url*/,
  `username` text /*Username*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LocalInventoryCreateOperation` generated from model 'localInventoryCreateOperation'
-- Create operation for local inventory item
--

CREATE TABLE IF NOT EXISTS `LocalInventoryCreateOperation` (
  `attributes` long NOT NULL,
  `item_id` text NOT NULL /*Catalog item id in the merchant namespace*/,
  `operation` text NOT NULL,
  `store_code` text NOT NULL /*Store code for the local inventory item*/
);  /*Create operation for local inventory item*/


-- --------------------------------------------------------------------------
-- Table structure for table `LocalInventoryDeleteOperation` generated from model 'localInventoryDeleteOperation'
-- Delete operation for local inventory item
--

CREATE TABLE IF NOT EXISTS `LocalInventoryDeleteOperation` (
  `item_id` text NOT NULL /*Catalog item id in the merchant namespace*/,
  `operation` text NOT NULL,
  `store_code` text NOT NULL /*Store code for the local inventory item*/
);  /*Delete operation for local inventory item*/


-- --------------------------------------------------------------------------
-- Table structure for table `LocalInventoryItemResponse` generated from model 'localInventoryItemResponse'
-- Local inventory item response
--

CREATE TABLE IF NOT EXISTS `LocalInventoryItemResponse` (
  `created_at` long NOT NULL /*The millisecond timestamp when the local inventory item was created*/,
  `item_id` text NOT NULL /*The catalog item id in the merchant namespace*/,
  `last_updated_time` long NOT NULL /*The millisecond timestamp when the local inventory item was lastly modified by the merchant.*/,
  `store_metadata` long NOT NULL /*Store metadata for this local inventory item*/,
  `ad_link` text /*Ad link for the item*/,
  `availability` long /*Availability status of the item*/,
  `price` text /*The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars.*/,
  `sale_price` text /*The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.*/
);  /*Local inventory item response*/


-- --------------------------------------------------------------------------
-- Table structure for table `LocalInventoryItemsBatch` generated from model 'localInventoryItemsBatch'
-- Unified model for local inventory items batch operation
--

CREATE TABLE IF NOT EXISTS `LocalInventoryItemsBatch` (
  `batch_id` text NOT NULL /*Id of the batch operation*/,
  `created_time` datetime NOT NULL /*Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss*/,
  `status` long NOT NULL /*Status of the batch: PROCESSING, COMPLETED, FAILED*/,
  `completed_time` datetime /*Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss*/
);  /*Unified model for local inventory items batch operation*/

-- --------------------------------------------------------------------------
-- Table structure for table `LocalInventoryItemsBatchSupplementalOperationResult` generated from model 'LocalInventoryItemsBatchSupplementalOperationResult'

CREATE TABLE IF NOT EXISTS `LocalInventoryItemsBatchSupplementalOperationResult` (
  `localInventoryItemsBatch` long NOT NULL
  `supplementalOperationResult` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LocalInventoryItemsBatchCreate` generated from model 'localInventoryItemsBatchCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `LocalInventoryItemsBatchCreate` (
);  /*Resource create operation model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `LocalInventoryItemsBatchCreateLocalInventoryOperation` generated from model 'LocalInventoryItemsBatchCreateLocalInventoryOperation'

CREATE TABLE IF NOT EXISTS `LocalInventoryItemsBatchCreateLocalInventoryOperation` (
  `localInventoryItemsBatchCreate` long NOT NULL
  `localInventoryOperation` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LocalInventoryItemsGet` generated from model 'localInventoryItemsGet'
-- Model for getting local inventory items
--

CREATE TABLE IF NOT EXISTS `LocalInventoryItemsGet` (
);  /*Model for getting local inventory items*/

-- --------------------------------------------------------------------------
-- Table structure for table `LocalInventoryItemsGetLocalInventoryItemResponse` generated from model 'LocalInventoryItemsGetLocalInventoryItemResponse'

CREATE TABLE IF NOT EXISTS `LocalInventoryItemsGetLocalInventoryItemResponse` (
  `localInventoryItemsGet` long NOT NULL
  `localInventoryItemResponse` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LocalInventoryItemsGetCreate` generated from model 'localInventoryItemsGetCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `LocalInventoryItemsGetCreate` (
);  /*Resource create operation model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `LocalInventoryItemsGetCreateItemIdStoreCodePair` generated from model 'LocalInventoryItemsGetCreateItemIdStoreCodePair'

CREATE TABLE IF NOT EXISTS `LocalInventoryItemsGetCreateItemIdStoreCodePair` (
  `localInventoryItemsGetCreate` long NOT NULL
  `itemIdStoreCodePair` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LocalInventoryOperation` generated from model 'localInventoryOperation'
--

CREATE TABLE IF NOT EXISTS `LocalInventoryOperation` (
  `attributes` long NOT NULL,
  `item_id` text NOT NULL /*Catalog item id in the merchant namespace*/,
  `operation` text NOT NULL,
  `store_code` text NOT NULL /*Store code for the local inventory item*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LocalInventoryOperationResult` generated from model 'localInventoryOperationResult'
-- Result model for local inventory operation
--

CREATE TABLE IF NOT EXISTS `LocalInventoryOperationResult` (
  `item_id` text NOT NULL /*Catalog item id in the merchant namespace*/,
  `status` long NOT NULL /*Status of the item processing record*/,
  `store_code` text NOT NULL /*Store code for the local inventory item*/,
  `supplemental_type` text NOT NULL,
);  /*Result model for local inventory operation*/

-- --------------------------------------------------------------------------
-- Table structure for table `LocalInventoryOperationResultSupplementalItemValidationEvent` generated from model 'LocalInventoryOperationResultSupplementalItemValidationEvent'

CREATE TABLE IF NOT EXISTS `LocalInventoryOperationResultSupplementalItemValidationEvent` (
  `localInventoryOperationResult` long NOT NULL
  `supplementalItemValidationEvent` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `LocalInventoryOperationResultSupplementalItemValidationEvent` generated from model 'LocalInventoryOperationResultSupplementalItemValidationEvent'

CREATE TABLE IF NOT EXISTS `LocalInventoryOperationResultSupplementalItemValidationEvent` (
  `localInventoryOperationResult` long NOT NULL
  `supplementalItemValidationEvent` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LocalInventoryUpdateOperation` generated from model 'localInventoryUpdateOperation'
-- Update operation for local inventory item
--

CREATE TABLE IF NOT EXISTS `LocalInventoryUpdateOperation` (
  `attributes` long NOT NULL,
  `item_id` text NOT NULL /*Catalog item id in the merchant namespace*/,
  `operation` text NOT NULL,
  `store_code` text NOT NULL /*Store code for the local inventory item*/
);  /*Update operation for local inventory item*/


-- --------------------------------------------------------------------------
-- Table structure for table `LocalInventoryUpsertOperation` generated from model 'localInventoryUpsertOperation'
-- Upsert operation for local inventory item
--

CREATE TABLE IF NOT EXISTS `LocalInventoryUpsertOperation` (
  `attributes` long NOT NULL,
  `item_id` text NOT NULL /*Catalog item id in the merchant namespace*/,
  `operation` text NOT NULL,
  `store_code` text NOT NULL /*Store code for the local inventory item*/
);  /*Upsert operation for local inventory item*/


-- --------------------------------------------------------------------------
-- Table structure for table `LocalStore` generated from model 'localStore'
-- Local store entity
--

CREATE TABLE IF NOT EXISTS `LocalStore` (
  `country` long NOT NULL /*Country code where the store is located.*/,
  `created_at` datetime NOT NULL /*Creation timestamp*/,
  `id` text NOT NULL PRIMARY KEY /*The ID of the local store.*/,
  `name` text NOT NULL /*The name of the local store.*/,
  `store_code` text NOT NULL /*Merchant provided code for the local store. Unique within the merchant&#39;s catalog.*/,
  `updated_at` datetime NOT NULL /*Last update timestamp*/,
  `address_primary` text /*Primary address line of the store.*/,
  `address_secondary` text /*Secondary address line of the store.*/,
  `city` text /*City where the store is located.*/,
  `latitude` float /*Geographic latitude coordinate of the store.*/,
  `longitude` float /*Geographic longitude coordinate of the store.*/,
  `postal_code` text /*Postal or ZIP code of the store.*/,
  `region` text /*State or region code where the store is located.*/
);  /*Local store entity*/


-- --------------------------------------------------------------------------
-- Table structure for table `LocalStoreBatchUpdate` generated from model 'localStoreBatchUpdate'
--

CREATE TABLE IF NOT EXISTS `LocalStoreBatchUpdate` (
  `id` text NOT NULL PRIMARY KEY /*The ID of the local store.*/,
  `address_primary` text /*Primary address line of the store.*/,
  `address_secondary` text /*Secondary address line of the store.*/,
  `city` text /*City where the store is located.*/,
  `country` long /*Country code where the store is located.*/,
  `latitude` float /*Geographic latitude coordinate of the store.*/,
  `longitude` float /*Geographic longitude coordinate of the store.*/,
  `name` text /*The name of the local store.*/,
  `postal_code` text /*Postal or ZIP code of the store.*/,
  `region` text /*State or region code where the store is located.*/,
  `store_code` text /*Merchant provided code for the local store. Unique within the merchant&#39;s catalog.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LocalStoreCreate` generated from model 'localStoreCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `LocalStoreCreate` (
  `country` long NOT NULL /*Country code where the store is located.*/,
  `name` text NOT NULL /*The name of the local store.*/,
  `store_code` text NOT NULL /*Merchant provided code for the local store. Unique within the merchant&#39;s catalog.*/,
  `address_primary` text /*Primary address line of the store.*/,
  `address_secondary` text /*Secondary address line of the store.*/,
  `city` text /*City where the store is located.*/,
  `latitude` float /*Geographic latitude coordinate of the store.*/,
  `longitude` float /*Geographic longitude coordinate of the store.*/,
  `postal_code` text /*Postal or ZIP code of the store.*/,
  `region` text /*State or region code where the store is located.*/
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `MMMReport` generated from model 'mmMReport'
--

CREATE TABLE IF NOT EXISTS `MMMReport` (
  `message` text,
  `report_status` long,
  `size` decimal,
  `status` text,
  `token` text,
  `url` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MMMReportCreate` generated from model 'mmMReportCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `MMMReportCreate` (
  `end_date` text NOT NULL /*Metric report end date (UTC). Format: YYYY-MM-DD*/,
  `granularity` long NOT NULL /*  DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.*/,
  `level` long NOT NULL /*Level of the report*/,
  `report_name` text NOT NULL /*Name of the Marketing Mix Modeling (MMM) report*/,
  `start_date` text NOT NULL /*Metric report start date (UTC). Format: YYYY-MM-DD*/,
);  /*Resource create operation model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `MMMReportCreateMMMReportingColumn` generated from model 'MMMReportCreateMMMReportingColumn'

CREATE TABLE IF NOT EXISTS `MMMReportCreateMMMReportingColumn` (
  `mMMReportCreate` long NOT NULL
  `mMMReportingColumn` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MMMReportCreateMMMReportingTargetingType` generated from model 'MMMReportCreateMMMReportingTargetingType'

CREATE TABLE IF NOT EXISTS `MMMReportCreateMMMReportingTargetingType` (
  `mMMReportCreate` long NOT NULL
  `mMMReportingTargetingType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MMMReportCreateAdvertiserIds` generated from model 'MMMReportCreateAdvertiserIds'

CREATE TABLE IF NOT EXISTS `MMMReportCreateAdvertiserIds` (
  `mMMReportCreate` long NOT NULL
  `advertiserIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MMMReportCreateTargetingAdvertiserCountry` generated from model 'MMMReportCreateTargetingAdvertiserCountry'

CREATE TABLE IF NOT EXISTS `MMMReportCreateTargetingAdvertiserCountry` (
  `mMMReportCreate` long NOT NULL
  `targetingAdvertiserCountry` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MMMReportCreateCustomColumnIds` generated from model 'MMMReportCreateCustomColumnIds'

CREATE TABLE IF NOT EXISTS `MMMReportCreateCustomColumnIds` (
  `mMMReportCreate` long NOT NULL
  `customColumnIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MaxPriceFilter` generated from model 'maxPriceFilter'
--

CREATE TABLE IF NOT EXISTS `MaxPriceFilter` (
  `MAX_PRICE` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Media` generated from model 'media'
--

CREATE TABLE IF NOT EXISTS `Media` (
  `media_id` text NOT NULL /*Unique identifier for this media upload. Used to track status and for attaching during Pin creation.*/,
  `media_type` long NOT NULL,
  `status` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `media_list_200_response` generated from model 'mediaList200Response'
--

CREATE TABLE IF NOT EXISTS `media_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `MediaList200ResponseMedia` generated from model 'MediaList200ResponseMedia'

CREATE TABLE IF NOT EXISTS `MediaList200ResponseMedia` (
  `mediaList200Response` long NOT NULL
  `media` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MediaTypeFilter` generated from model 'mediaTypeFilter'
--

CREATE TABLE IF NOT EXISTS `MediaTypeFilter` (
  `MEDIA_TYPE` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MediaUpload` generated from model 'mediaUpload'
-- Media upload that has been registered but not uploaded/processed yet.
--

CREATE TABLE IF NOT EXISTS `MediaUpload` (
  `media_id` text NOT NULL /*Unique identifier for this media upload. Used to track status and for attaching during Pin creation.*/,
  `media_type` long NOT NULL,
  `upload_parameters` long /*The list of parameter key/value pairs you will need to send with your POST request to upload your media file.*/,
  `upload_url` text /*The URL where you will POST your media file.*/
);  /*Media upload that has been registered but not uploaded/processed yet.*/


-- --------------------------------------------------------------------------
-- Table structure for table `MediaUploadCreate` generated from model 'mediaUploadCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `MediaUploadCreate` (
  `media_type` long NOT NULL
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `MediaUploadParameters` generated from model 'mediaUploadParameters'
--

CREATE TABLE IF NOT EXISTS `MediaUploadParameters` (
  `ContentType` text,
  `key` text,
  `policy` text,
  `xamzalgorithm` text,
  `xamzcredential` text,
  `xamzdate` text,
  `xamzsecuritytoken` text,
  `xamzsignature` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MetricsResponse` generated from model 'metricsResponse'
--

CREATE TABLE IF NOT EXISTS `MetricsResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `MetricsResponseMetricsResponseDataItems` generated from model 'MetricsResponseMetricsResponseDataItems'

CREATE TABLE IF NOT EXISTS `MetricsResponseMetricsResponseDataItems` (
  `metricsResponse` long NOT NULL
  `metricsResponseDataItems` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MetricsResponseDataItems` generated from model 'metricsResponseDataItems'
--

CREATE TABLE IF NOT EXISTS `MetricsResponseDataItems` (
  `metrics` blob NOT NULL /*Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).*/,
  `targeting_type` text NOT NULL /*The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)*/,
  `targeting_value` text NOT NULL /*The targeting value for this data item (e.g., &#39;christmas decor ideas&#39;, &#39;iphone&#39;, &#39;female&#39;)*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MinPriceFilter` generated from model 'minPriceFilter'
--

CREATE TABLE IF NOT EXISTS `MinPriceFilter` (
  `MIN_PRICE` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `NotificationResponse` generated from model 'notificationResponse'
--

CREATE TABLE IF NOT EXISTS `NotificationResponse` (
  `error_msg` text /*error message when success is false*/,
  `received_at` int /*Received time. Unix timestamp in seconds.*/,
  `success` boolean /*Returns true if the notification accepted.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `NullableOptimizationGoalMetadata` generated from model 'nullableOptimizationGoalMetadata'
--

CREATE TABLE IF NOT EXISTS `NullableOptimizationGoalMetadata` (
  `conversion_tag_v3_goal_metadata` long,
  `frequency_goal_metadata` long,
  `scrollup_goal_metadata` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `OauthAccessToken` generated from model 'oauthAccessToken'
-- Describes the valid schema for possible OAuth access token requests.
--

CREATE TABLE IF NOT EXISTS `OauthAccessToken` (
  `access_token` text NOT NULL,
  `expires_in` int NOT NULL,
  `token_type` text NOT NULL,
  `refresh_token` text,
  `refresh_token_expires_at` int,
  `refresh_token_expires_in` int,
  `response_type` long,
  `scope` text
);  /*Describes the valid schema for possible OAuth access token requests.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OptimizationGoalMetadata` generated from model 'optimizationGoalMetadata'
--

CREATE TABLE IF NOT EXISTS `OptimizationGoalMetadata` (
  `conversion_tag_v3_goal_metadata` long,
  `frequency_goal_metadata` long,
  `scrollup_goal_metadata` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `OrderLine` generated from model 'orderLine'
--

CREATE TABLE IF NOT EXISTS `OrderLine` (
  `ad_account_id` text NOT NULL /*Ad account ID.*/,
  `id` text NOT NULL PRIMARY KEY /*Order line ID.*/,
  `status` long NOT NULL /*Order line status.*/,
  `type` text NOT NULL /*Always \&quot;orderline\&quot;.*/,
  `budget` decimal /*Order line budget in micro currency.*/,
  `end_time` decimal /*End time. Unix timestamp.*/,
  `name` text /*Order line name.*/,
  `paid_budget` decimal /*Order line paid budget in micro currency.*/,
  `paid_type` long /*Order line paid type.*/,
  `purchase_order_id` text /*Purchase order ID.*/,
  `start_time` decimal /*Start time. Unix timestamp.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `OrderLineCampaignIds` generated from model 'OrderLineCampaignIds'

CREATE TABLE IF NOT EXISTS `OrderLineCampaignIds` (
  `orderLine` long NOT NULL
  `campaignIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OrderLineMutationError` generated from model 'orderLineMutationError'
--

CREATE TABLE IF NOT EXISTS `OrderLineMutationError` (
  `data` long,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `OrderLineMutationErrorErrorMessages` generated from model 'OrderLineMutationErrorErrorMessages'

CREATE TABLE IF NOT EXISTS `OrderLineMutationErrorErrorMessages` (
  `orderLineMutationError` long NOT NULL
  `errorMessages` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OrderLineMutationResponse` generated from model 'orderLineMutationResponse'
--

CREATE TABLE IF NOT EXISTS `OrderLineMutationResponse` (
  `data` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `OrderLineMutationResult` generated from model 'orderLineMutationResult'
--

CREATE TABLE IF NOT EXISTS `OrderLineMutationResult` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `OrderLineMutationResultOrderLineMutationError` generated from model 'OrderLineMutationResultOrderLineMutationError'

CREATE TABLE IF NOT EXISTS `OrderLineMutationResultOrderLineMutationError` (
  `orderLineMutationResult` long NOT NULL
  `orderLineMutationError` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `OrderLineMutationResultOrderLine` generated from model 'OrderLineMutationResultOrderLine'

CREATE TABLE IF NOT EXISTS `OrderLineMutationResultOrderLine` (
  `orderLineMutationResult` long NOT NULL
  `orderLine` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `order_lines_list_200_response` generated from model 'orderLinesList200Response'
--

CREATE TABLE IF NOT EXISTS `order_lines_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `OrderLinesList200ResponseOrderLine` generated from model 'OrderLinesList200ResponseOrderLine'

CREATE TABLE IF NOT EXISTS `OrderLinesList200ResponseOrderLine` (
  `orderLinesList200Response` long NOT NULL
  `orderLine` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `page_visit_conversion_tags_get_200_response` generated from model 'pageVisitConversionTagsGet200Response'
--

CREATE TABLE IF NOT EXISTS `page_visit_conversion_tags_get_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PageVisitConversionTagsGet200ResponseConversionEventResponse` generated from model 'PageVisitConversionTagsGet200ResponseConversionEventResponse'

CREATE TABLE IF NOT EXISTS `PageVisitConversionTagsGet200ResponseConversionEventResponse` (
  `pageVisitConversionTagsGet200Response` long NOT NULL
  `conversionEventResponse` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PartnerMetadata` generated from model 'partnerMetadata'
--

CREATE TABLE IF NOT EXISTS `PartnerMetadata` (
  `subscriber_key` text /*Text field value that uniquely identifies a subscriber.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PerformancePlusCampaignSettings` generated from model 'performancePlusCampaignSettings'
-- Pinterest Performance+ campaign settings.
--

CREATE TABLE IF NOT EXISTS `PerformancePlusCampaignSettings` (
  `boost_prospecting_ad_group_bid` boolean /*Whether to boost prospecting ad group bid.*/,
);  /*Pinterest Performance+ campaign settings.*/

-- --------------------------------------------------------------------------
-- Table structure for table `PerformancePlusCampaignSettingsPinnerListExclusions` generated from model 'PerformancePlusCampaignSettingsPinnerListExclusions'

CREATE TABLE IF NOT EXISTS `PerformancePlusCampaignSettingsPinnerListExclusions` (
  `performancePlusCampaignSettings` long NOT NULL
  `pinnerListExclusions` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `Pin` generated from model 'pin'
--

CREATE TABLE IF NOT EXISTS `Pin` (
  `id` text NOT NULL PRIMARY KEY,
  `ai_disclosures` long /*AI disclosure declarations the creator has made about this Pin.*/,
  `board_id` text /*The board to which this Pin belongs.*/,
  `board_owner` long,
  `board_section_id` text /*The board section to which this Pin belongs.*/,
  `created_at` datetime,
  `creative_type` long,
  `dominant_color` text /*Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;.*/,
  `has_been_promoted` boolean /*Whether the Pin has been promoted or not.*/,
  `is_owner` boolean /*Whether the \&quot;operation user_account\&quot; is the Pin owner.*/,
  `is_product` boolean /*Whether the Pin is a product Pin.*/,
  `is_standard` boolean /*Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.*/,
  `media` long,
  `parent_pin_id` text /*The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).*/,
  `pin_metrics` blob /*Pin metrics with associated time intervals if any.*/,
  `alt_text` text,
  `description` text,
  `link` text,
  `title` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PinAnalyticsDailyMetrics` generated from model 'pinAnalyticsDailyMetrics'
--

CREATE TABLE IF NOT EXISTS `PinAnalyticsDailyMetrics` (
  `data_status` long,
  `date` text /*Metrics date (UTC): YYYY-MM-DD.*/,
  `metrics` blob
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PinAnalyticsMetricsResponse` generated from model 'pinAnalyticsMetricsResponse'
--

CREATE TABLE IF NOT EXISTS `PinAnalyticsMetricsResponse` (
  `lifetime_metrics` blob /*The lifetime metric name and value.*/,
  `summary_metrics` blob /*The metric name and value over the requested period for each requested metric*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PinAnalyticsMetricsResponsePinAnalyticsDailyMetrics` generated from model 'PinAnalyticsMetricsResponsePinAnalyticsDailyMetrics'

CREATE TABLE IF NOT EXISTS `PinAnalyticsMetricsResponsePinAnalyticsDailyMetrics` (
  `pinAnalyticsMetricsResponse` long NOT NULL
  `pinAnalyticsDailyMetrics` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PinBase` generated from model 'pinBase'
--

CREATE TABLE IF NOT EXISTS `PinBase` (
  `id` text NOT NULL PRIMARY KEY,
  `ai_disclosures` long /*AI disclosure declarations the creator has made about this Pin.*/,
  `board_id` text /*The board to which this Pin belongs.*/,
  `board_owner` long,
  `board_section_id` text /*The board section to which this Pin belongs.*/,
  `created_at` datetime,
  `creative_type` long,
  `dominant_color` text /*Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;.*/,
  `has_been_promoted` boolean /*Whether the Pin has been promoted or not.*/,
  `is_owner` boolean /*Whether the \&quot;operation user_account\&quot; is the Pin owner.*/,
  `is_product` boolean /*Whether the Pin is a product Pin.*/,
  `is_standard` boolean /*Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.*/,
  `media` long,
  `parent_pin_id` text /*The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).*/,
  `pin_metrics` blob /*Pin metrics with associated time intervals if any.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PinCreate` generated from model 'pinCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `PinCreate` (
  `ai_disclosures` long /*AI disclosure declarations the creator has made about this Pin.*/,
  `alt_text` text,
  `board_id` text /*The board to which this Pin belongs.*/,
  `board_section_id` text /*The board section to which this Pin belongs.*/,
  `description` text,
  `dominant_color` text /*Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;.*/,
  `link` text,
  `media_source` long,
  `parent_pin_id` text /*The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).*/,
  `sponsor_id` text /*The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta.*/,
  `title` text
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinMedia` generated from model 'pinMedia'
-- Pin media that can be an image, video, or a mix of both.
--

CREATE TABLE IF NOT EXISTS `PinMedia` (
  `media_type` text NOT NULL,
  `images` long,
  `cover_image_url` text,
  `duration` decimal /*Duration (in miliseconds). Field maybe null after creation due to video processing time.*/,
  `height` int /*Height (in pixels). Field maybe null after creation due to video processing time.*/,
  `video_url` text /*Video url (720p).  **Note:** This field is limited and not available to all apps.*/,
  `video_url_hls` text /*Video url (HLS).  **Note:** This field is limited and not available to all apps.*/,
  `width` int /*Width (in pixels). Field maybe null after creation due to video processing time.*/,
);  /*Pin media that can be an image, video, or a mix of both.*/

-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaPinMediaMetadata` generated from model 'PinMediaPinMediaMetadata'

CREATE TABLE IF NOT EXISTS `PinMediaPinMediaMetadata` (
  `pinMedia` long NOT NULL
  `pinMediaMetadata` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaMetadata` generated from model 'pinMediaMetadata'
-- Per-item entry inside &#x60;PinMedia.items&#x60; for mixed image/video pins. Discriminated by &#x60;item_type&#x60;.
--

CREATE TABLE IF NOT EXISTS `PinMediaMetadata` (
  `item_type` text NOT NULL /*Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload.*/,
  `description` text,
  `images` long,
  `link` text,
  `title` text,
  `cover_image_url` text,
  `duration` decimal /*Duration (in miliseconds). Field maybe null after creation due to video processing time.*/,
  `height` int /*Height (in pixels). Field maybe null after creation due to video processing time.*/,
  `video_url` text /*Video url (720p).  **Note:** This field is limited and not available to all apps.*/,
  `video_url_hls` text /*Video url (HLS).  **Note:** This field is limited and not available to all apps.*/,
  `width` int /*Width (in pixels). Field maybe null after creation due to video processing time.*/
);  /*Per-item entry inside &#x60;PinMedia.items&#x60; for mixed image/video pins. Discriminated by &#x60;item_type&#x60;.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSource` generated from model 'pinMediaSource'
-- Pin media source that can be an image, video, or a mix of both passed in as a request.
--

CREATE TABLE IF NOT EXISTS `PinMediaSource` (
  `content_type` long NOT NULL,
  `data` text NOT NULL,
  `source_type` text NOT NULL,
  `url` text NOT NULL,
  `media_id` text NOT NULL,
  `is_standard` boolean /*Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.*/,
  `cover_image_content_type` long /*Content type for cover image Base64.*/,
  `cover_image_data` text /*Cover image Base64.*/,
  `cover_image_key_frame_time` int UNSIGNED /*Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.*/,
  `cover_image_url` text /*Cover image URL.*/,
  `index` int UNSIGNED,
  `is_affiliate_link` boolean /*This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.*/
);  /*Pin media source that can be an image, video, or a mix of both passed in as a request.*/

-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSourcePinMediaSourceImagesURLItem` generated from model 'PinMediaSourcePinMediaSourceImagesURLItem'

CREATE TABLE IF NOT EXISTS `PinMediaSourcePinMediaSourceImagesURLItem` (
  `pinMediaSource` long NOT NULL
  `pinMediaSourceImagesURLItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSourceImageBase64` generated from model 'pinMediaSourceImageBase64'
-- Image Base64-based media source.
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImageBase64` (
  `content_type` long NOT NULL,
  `data` text NOT NULL,
  `source_type` text NOT NULL /*The source type of the media.*/,
  `is_standard` boolean /*Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.*/
);  /*Image Base64-based media source.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSourceImageURL` generated from model 'pinMediaSourceImageURL'
-- Image URL-based media source.
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImageURL` (
  `source_type` text NOT NULL /*The source type of the media.*/,
  `url` text NOT NULL,
  `is_standard` boolean /*Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.*/
);  /*Image URL-based media source.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSourceImagesBase64` generated from model 'pinMediaSourceImagesBase64'
-- Multiple Base64-based images media source
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImagesBase64` (
  `source_type` text NOT NULL /*The source type of the media.*/,
  `index` int UNSIGNED
);  /*Multiple Base64-based images media source*/

-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSourceImagesBase64PinMediaSourceImagesBase64Item` generated from model 'PinMediaSourceImagesBase64PinMediaSourceImagesBase64Item'

CREATE TABLE IF NOT EXISTS `PinMediaSourceImagesBase64PinMediaSourceImagesBase64Item` (
  `pinMediaSourceImagesBase64` long NOT NULL
  `pinMediaSourceImagesBase64Item` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSourceImagesBase64Item` generated from model 'pinMediaSourceImagesBase64Item'
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImagesBase64Item` (
  `content_type` long NOT NULL,
  `data` text NOT NULL,
  `description` text,
  `link` text,
  `title` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSourceImagesURL` generated from model 'pinMediaSourceImagesURL'
-- Multiple URL-based images media source
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImagesURL` (
  `source_type` text NOT NULL /*The source type of the media.*/,
  `index` int UNSIGNED
);  /*Multiple URL-based images media source*/

-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSourceImagesURLPinMediaSourceImagesURLItem` generated from model 'PinMediaSourceImagesURLPinMediaSourceImagesURLItem'

CREATE TABLE IF NOT EXISTS `PinMediaSourceImagesURLPinMediaSourceImagesURLItem` (
  `pinMediaSourceImagesURL` long NOT NULL
  `pinMediaSourceImagesURLItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSourceImagesURLItem` generated from model 'pinMediaSourceImagesURLItem'
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImagesURLItem` (
  `url` text NOT NULL,
  `description` text,
  `link` text,
  `title` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSourcePinURL` generated from model 'pinMediaSourcePinURL'
-- Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
--

CREATE TABLE IF NOT EXISTS `PinMediaSourcePinURL` (
  `source_type` text NOT NULL,
  `is_affiliate_link` boolean /*This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.*/
);  /*Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSourceVideoID` generated from model 'pinMediaSourceVideoID'
-- Video ID-based media source.
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceVideoID` (
  `media_id` text NOT NULL,
  `source_type` text NOT NULL,
  `cover_image_content_type` long /*Content type for cover image Base64.*/,
  `cover_image_data` text /*Cover image Base64.*/,
  `cover_image_key_frame_time` int UNSIGNED /*Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.*/,
  `cover_image_url` text /*Cover image URL.*/,
  `is_standard` boolean /*Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.*/
);  /*Video ID-based media source.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaWithImage` generated from model 'pinMediaWithImage'
-- Pin with image.
--

CREATE TABLE IF NOT EXISTS `PinMediaWithImage` (
  `media_type` text NOT NULL,
  `images` long
);  /*Pin with image.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaWithImageAndVideo` generated from model 'pinMediaWithImageAndVideo'
-- Pin with a mix of images and videos.
--

CREATE TABLE IF NOT EXISTS `PinMediaWithImageAndVideo` (
  `media_type` text NOT NULL,
);  /*Pin with a mix of images and videos.*/

-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaWithImageAndVideoPinMediaMetadata` generated from model 'PinMediaWithImageAndVideoPinMediaMetadata'

CREATE TABLE IF NOT EXISTS `PinMediaWithImageAndVideoPinMediaMetadata` (
  `pinMediaWithImageAndVideo` long NOT NULL
  `pinMediaMetadata` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaWithImages` generated from model 'pinMediaWithImages'
-- Pin with multiple images.
--

CREATE TABLE IF NOT EXISTS `PinMediaWithImages` (
  `media_type` text NOT NULL,
);  /*Pin with multiple images.*/

-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaWithImagesImageMetadata` generated from model 'PinMediaWithImagesImageMetadata'

CREATE TABLE IF NOT EXISTS `PinMediaWithImagesImageMetadata` (
  `pinMediaWithImages` long NOT NULL
  `imageMetadata` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaWithVideo` generated from model 'pinMediaWithVideo'
-- Pin with video.
--

CREATE TABLE IF NOT EXISTS `PinMediaWithVideo` (
  `media_type` text NOT NULL,
  `cover_image_url` text,
  `duration` decimal /*Duration (in miliseconds). Field maybe null after creation due to video processing time.*/,
  `height` int /*Height (in pixels). Field maybe null after creation due to video processing time.*/,
  `images` long,
  `video_url` text /*Video url (720p).  **Note:** This field is limited and not available to all apps.*/,
  `video_url_hls` text /*Video url (HLS).  **Note:** This field is limited and not available to all apps.*/,
  `width` int /*Width (in pixels). Field maybe null after creation due to video processing time.*/
);  /*Pin with video.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaWithVideos` generated from model 'pinMediaWithVideos'
-- Pin with multiple videos.
--

CREATE TABLE IF NOT EXISTS `PinMediaWithVideos` (
  `media_type` text NOT NULL,
);  /*Pin with multiple videos.*/

-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaWithVideosVideoMetadataWithItemType` generated from model 'PinMediaWithVideosVideoMetadataWithItemType'

CREATE TABLE IF NOT EXISTS `PinMediaWithVideosVideoMetadataWithItemType` (
  `pinMediaWithVideos` long NOT NULL
  `videoMetadataWithItemType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PinRead` generated from model 'pinRead'
--

CREATE TABLE IF NOT EXISTS `PinRead` (
  `id` text NOT NULL PRIMARY KEY,
  `ai_disclosures` long /*AI disclosure declarations the creator has made about this Pin.*/,
  `board_id` text /*The board to which this Pin belongs.*/,
  `board_owner` long,
  `board_section_id` text /*The board section to which this Pin belongs.*/,
  `created_at` datetime,
  `creative_type` long,
  `dominant_color` text /*Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;.*/,
  `has_been_promoted` boolean /*Whether the Pin has been promoted or not.*/,
  `is_owner` boolean /*Whether the \&quot;operation user_account\&quot; is the Pin owner.*/,
  `is_product` boolean /*Whether the Pin is a product Pin.*/,
  `is_standard` boolean /*Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.*/,
  `media` long,
  `parent_pin_id` text /*The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).*/,
  `pin_metrics` blob /*Pin metrics with associated time intervals if any.*/,
  `alt_text` text,
  `description` text,
  `link` text,
  `title` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PinUpdate` generated from model 'pinUpdate'
-- Resource create or update operation model.
--

CREATE TABLE IF NOT EXISTS `PinUpdate` (
  `ai_disclosures` long /*AI disclosure declarations the creator has made about this Pin.*/,
  `alt_text` text,
  `board_id` text /*The board to which this Pin belongs.*/,
  `board_section_id` text /*The board section to which this Pin belongs.*/,
  `description` text,
  `link` text,
  `title` text
);  /*Resource create or update operation model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `PinUpdateCarouselSlot` generated from model 'PinUpdateCarouselSlot'

CREATE TABLE IF NOT EXISTS `PinUpdateCarouselSlot` (
  `pinUpdate` long NOT NULL
  `carouselSlot` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `pins_list_200_response` generated from model 'pinsList200Response'
--

CREATE TABLE IF NOT EXISTS `pins_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PinsList200ResponsePin` generated from model 'PinsList200ResponsePin'

CREATE TABLE IF NOT EXISTS `PinsList200ResponsePin` (
  `pinsList200Response` long NOT NULL
  `pin` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PinsSaveRequestCreate` generated from model 'pinsSaveRequestCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `PinsSaveRequestCreate` (
  `board_id` text /*Unique identifier of the board to which the pin will be saved.*/,
  `board_section_id` text /*Unique identifier of the board section to which the pin will be saved.*/
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinterestLibBatchItemException` generated from model 'pinterestLibBatchItemException'
-- Exception details for a batch operation item.
--

CREATE TABLE IF NOT EXISTS `PinterestLibBatchItemException` (
  `message` text NOT NULL,
  `code` int
);  /*Exception details for a batch operation item.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinterestLibError` generated from model 'pinterestLibError'
-- Default error response
--

CREATE TABLE IF NOT EXISTS `PinterestLibError` (
  `code` int NOT NULL,
  `message` text NOT NULL
);  /*Default error response*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinterestLibStatus204` generated from model 'pinterestLibStatus204'
-- The resource was successfully deleted.
--

CREATE TABLE IF NOT EXISTS `PinterestLibStatus204` (
  `statusCode` decimal NOT NULL
);  /*The resource was successfully deleted.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinterestProductCategoriesFilter` generated from model 'pinterestProductCategoriesFilter'
--

CREATE TABLE IF NOT EXISTS `PinterestProductCategoriesFilter` (
  `PINTEREST_PRODUCT_CATEGORIES` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PlacementMultipliers` generated from model 'placementMultipliers'
-- This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
--

CREATE TABLE IF NOT EXISTS `PlacementMultipliers` (
  `PLACEMENT` long /*Placement type identifier.*/
);  /*This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).*/


-- --------------------------------------------------------------------------
-- Table structure for table `PredictedTimeSeries` generated from model 'predictedTimeSeries'
--

CREATE TABLE IF NOT EXISTS `PredictedTimeSeries` (
  `date` date
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PriceFilter` generated from model 'priceFilter'
--

CREATE TABLE IF NOT EXISTS `PriceFilter` (
  `PRICE` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PriceFilterPrice` generated from model 'priceFilterPrice'
--

CREATE TABLE IF NOT EXISTS `PriceFilterPrice` (
  `currency` long NOT NULL,
  `operator` long NOT NULL,
  `value` decimal NOT NULL,
  `negated` boolean
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ProductCategoriesDemographic` generated from model 'productCategoriesDemographic'
-- Age and gender distribution who engaged with this product category in the past 3 months
--

CREATE TABLE IF NOT EXISTS `ProductCategoriesDemographic` (
  `age` blob NOT NULL /*Age demographic distribution*/,
  `gender` long NOT NULL
);  /*Age and gender distribution who engaged with this product category in the past 3 months*/


-- --------------------------------------------------------------------------
-- Table structure for table `ProductCategoriesMetricsHighlights` generated from model 'productCategoriesMetricsHighlights'
-- Key performance metrics highlights for this product category
--

CREATE TABLE IF NOT EXISTS `ProductCategoriesMetricsHighlights` (
  `engagement` long /*Engagement metric value*/,
  `outbound_clicks` long /*Number of outbound clicks*/,
  `pin_saves` long /*Number of pin saves*/
);  /*Key performance metrics highlights for this product category*/


-- --------------------------------------------------------------------------
-- Table structure for table `ProductCategoryDetails` generated from model 'productCategoryDetails'
-- Product category details
--

CREATE TABLE IF NOT EXISTS `ProductCategoryDetails` (
  `has_prediction` boolean NOT NULL /*    Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.*/,
  `product_category` long NOT NULL,
  `demographics` long,
  `metrics_highlights` long,
  `predicted_time_series` blob /*    A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.*/,
  `time_series` blob /*Time series data showing trend values over time, indexed between 0 and 100*/
);  /*Product category details*/

-- --------------------------------------------------------------------------
-- Table structure for table `ProductCategoryDetailsRelatedSearches` generated from model 'ProductCategoryDetailsRelatedSearches'

CREATE TABLE IF NOT EXISTS `ProductCategoryDetailsRelatedSearches` (
  `productCategoryDetails` long NOT NULL
  `relatedSearches` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ProductGroupAnalyticsItems` generated from model 'productGroupAnalyticsItems'
--

CREATE TABLE IF NOT EXISTS `ProductGroupAnalyticsItems` (
  `PRODUCT_GROUP_ID` text NOT NULL /*The ID of the product group that this metrics belongs to.*/,
  `DATE` date /*Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ProductGroupPromotion` generated from model 'productGroupPromotion'
--

CREATE TABLE IF NOT EXISTS `ProductGroupPromotion` (
  `ad_group_id` text /*ID of the ad group the product group belongs to.*/,
  `bid_in_micro_currency` int /*The bid in micro currency.*/,
  `catalog_product_group_id` text /*ID of the catalogs product group that this product group promotion references (required for create operations)*/,
  `catalog_product_group_name` text /*Catalogs product group name*/,
  `collections_header_type` long,
  `collections_hero_destination_url` text /*Collections Hero Destination Url*/,
  `collections_hero_pin_id` text /*Hero Pin ID if this PG is promoted as a Collection*/,
  `creative_type` long,
  `customizable_cta_type` long,
  `definition` text /*The full product group definition path*/,
  `grid_click_type` long,
  `id` text PRIMARY KEY /*ID of the product group promotion (required for update operations).*/,
  `included` boolean /*True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.*/,
  `is_generate_background` boolean /*Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.*/,
  `is_image_auto_resizing` boolean /*Set to &#x60;TRUE&#x60; to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance.*/,
  `is_mdl` boolean /*If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog*/,
  `parent_id` text /*The parent Product Group ID of this Product Group*/,
  `preferred_media_type` long,
  `relative_definition` text /*The definition of the product group, relative to its parent - an attribute name/value pair*/,
  `selected_image_tag` text /*The ad image tag selected for the product group promotion.*/,
  `selected_video_tag` text /*The ad video tag selected for the product group promotion.*/,
  `slideshow_collections_description` text /*Slideshow Collections Description*/,
  `slideshow_collections_title` text /*Slideshow Collections Title*/,
  `status` long,
  `tracking_url` text /*Tracking template for proudct group promotions. 4000 limit*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ProductGroupPromotionCreateRequest` generated from model 'productGroupPromotionCreateRequest'
--

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionCreateRequest` (
  `ad_group_id` text NOT NULL /*ID of the Ad Group the Product Group Promotion belongs to.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ProductGroupPromotionCreateRequestProductGroupPromotion` generated from model 'ProductGroupPromotionCreateRequestProductGroupPromotion'

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionCreateRequestProductGroupPromotion` (
  `productGroupPromotionCreateRequest` long NOT NULL
  `productGroupPromotion` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ProductGroupPromotionResponseItem` generated from model 'productGroupPromotionResponseItem'
--

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionResponseItem` (
  `data` long,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ProductGroupPromotionResponseItemException` generated from model 'ProductGroupPromotionResponseItemException'

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionResponseItemException` (
  `productGroupPromotionResponseItem` long NOT NULL
  `exception` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ProductGroupPromotionUpdateRequest` generated from model 'productGroupPromotionUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionUpdateRequest` (
  `ad_group_id` text NOT NULL /*ID of the ad group the product group belongs to.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ProductGroupPromotionUpdateRequestProductGroupPromotion` generated from model 'ProductGroupPromotionUpdateRequestProductGroupPromotion'

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionUpdateRequestProductGroupPromotion` (
  `productGroupPromotionUpdateRequest` long NOT NULL
  `productGroupPromotion` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ProductGroupPromotions` generated from model 'productGroupPromotions'
-- Wrapper model for ProductGroupPromotion.
--

CREATE TABLE IF NOT EXISTS `ProductGroupPromotions` (
);  /*Wrapper model for ProductGroupPromotion.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ProductGroupPromotionsProductGroupPromotionResponseItem` generated from model 'ProductGroupPromotionsProductGroupPromotionResponseItem'

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionsProductGroupPromotionResponseItem` (
  `productGroupPromotions` long NOT NULL
  `productGroupPromotionResponseItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ProductGroupPromotionsCreate` generated from model 'productGroupPromotionsCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionsCreate` (
  `ad_group_id` text NOT NULL /*ID of the ad group the product group promotion belongs to.*/,
);  /*Resource create operation model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ProductGroupPromotionsCreateProductGroupPromotion` generated from model 'ProductGroupPromotionsCreateProductGroupPromotion'

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionsCreateProductGroupPromotion` (
  `productGroupPromotionsCreate` long NOT NULL
  `productGroupPromotion` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `product_group_promotions_list_200_response` generated from model 'productGroupPromotionsList200Response'
--

CREATE TABLE IF NOT EXISTS `product_group_promotions_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ProductGroupPromotionsList200ResponseProductGroupPromotion` generated from model 'ProductGroupPromotionsList200ResponseProductGroupPromotion'

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionsList200ResponseProductGroupPromotion` (
  `productGroupPromotionsList200Response` long NOT NULL
  `productGroupPromotion` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ProductGroupPromotionsUpdateWithRequiredBody` generated from model 'productGroupPromotionsUpdateWithRequiredBody'
-- Resource create or update operation model with required body fields (no OptionalProperties).
--

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionsUpdateWithRequiredBody` (
  `ad_group_id` text NOT NULL /*ID of the ad group the product group promotion belongs to.*/,
);  /*Resource create or update operation model with required body fields (no OptionalProperties).*/

-- --------------------------------------------------------------------------
-- Table structure for table `ProductGroupPromotionsUpdateWithRequiredBodyProductGroupPromotion` generated from model 'ProductGroupPromotionsUpdateWithRequiredBodyProductGroupPromotion'

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionsUpdateWithRequiredBodyProductGroupPromotion` (
  `productGroupPromotionsUpdateWithRequiredBody` long NOT NULL
  `productGroupPromotion` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ProductGroupReferenceFilter` generated from model 'productGroupReferenceFilter'
--

CREATE TABLE IF NOT EXISTS `ProductGroupReferenceFilter` (
  `PRODUCT_GROUP` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ProductTagItem` generated from model 'productTagItem'
-- Product tag request item containing the pin_id of the product to tag.
--

CREATE TABLE IF NOT EXISTS `ProductTagItem` (
  `pin_id` text NOT NULL /*Pin ID of the product pin to tag onto the hero pin.*/
);  /*Product tag request item containing the pin_id of the product to tag.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ProductTagsBulkAddRequest` generated from model 'productTagsBulkAddRequest'
-- Request body for bulk adding product tags to a pin.
--

CREATE TABLE IF NOT EXISTS `ProductTagsBulkAddRequest` (
);  /*Request body for bulk adding product tags to a pin.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ProductTagsBulkAddRequestProductTagItem` generated from model 'ProductTagsBulkAddRequestProductTagItem'

CREATE TABLE IF NOT EXISTS `ProductTagsBulkAddRequestProductTagItem` (
  `productTagsBulkAddRequest` long NOT NULL
  `productTagItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ProductTagsBulkDeleteRequest` generated from model 'productTagsBulkDeleteRequest'
-- Request body for bulk deleting product tags from a pin.
--

CREATE TABLE IF NOT EXISTS `ProductTagsBulkDeleteRequest` (
);  /*Request body for bulk deleting product tags from a pin.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ProductTagsBulkDeleteRequestProductTagItem` generated from model 'ProductTagsBulkDeleteRequestProductTagItem'

CREATE TABLE IF NOT EXISTS `ProductTagsBulkDeleteRequestProductTagItem` (
  `productTagsBulkDeleteRequest` long NOT NULL
  `productTagItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ProductTagsError` generated from model 'productTagsError'
-- Error response for requests containing ineligible product tags.
--

CREATE TABLE IF NOT EXISTS `ProductTagsError` (
  `code` int NOT NULL,
  `message` text NOT NULL,
  `details` long /*Details about which product tags failed eligibility check.*/
);  /*Error response for requests containing ineligible product tags.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ProductTagsResponse` generated from model 'productTagsResponse'
-- Response containing a list of product tags for a pin.
--

CREATE TABLE IF NOT EXISTS `ProductTagsResponse` (
);  /*Response containing a list of product tags for a pin.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ProductTagsResponseProductTagItem` generated from model 'ProductTagsResponseProductTagItem'

CREATE TABLE IF NOT EXISTS `ProductTagsResponseProductTagItem` (
  `productTagsResponse` long NOT NULL
  `productTagItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ProductType0Filter` generated from model 'productType0Filter'
--

CREATE TABLE IF NOT EXISTS `ProductType0Filter` (
  `PRODUCT_TYPE_0` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ProductType1Filter` generated from model 'productType1Filter'
--

CREATE TABLE IF NOT EXISTS `ProductType1Filter` (
  `PRODUCT_TYPE_1` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ProductType2Filter` generated from model 'productType2Filter'
--

CREATE TABLE IF NOT EXISTS `ProductType2Filter` (
  `PRODUCT_TYPE_2` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ProductType3Filter` generated from model 'productType3Filter'
--

CREATE TABLE IF NOT EXISTS `ProductType3Filter` (
  `PRODUCT_TYPE_3` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ProductType4Filter` generated from model 'productType4Filter'
--

CREATE TABLE IF NOT EXISTS `ProductType4Filter` (
  `PRODUCT_TYPE_4` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Promotion` generated from model 'promotion'
--

CREATE TABLE IF NOT EXISTS `Promotion` (
  `ad_account_id` text NOT NULL /*The Ad Account ID that this promotion belongs to.*/,
  `id` text NOT NULL PRIMARY KEY /*Promotion ID*/,
  `promotion_title` text NOT NULL /*Internal name for the promotion.*/,
  `promotion_type` long NOT NULL,
  `discount_status` long,
  `end_time` int /*Promotion end time. Unix timestamp in seconds. Independent of campaign end time.*/,
  `external_id` text /*Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.*/,
  `platform_type` text /*The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;.*/,
  `promotion_code` text /*Code that can be used to redeem a promotion.*/,
  `promotion_custom_id` text /*An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.*/,
  `start_time` int /*Promotion start time. Unix timestamp in seconds. Independent of campaign start time.*/,
  `status` long,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PromotionPromotionTemplateValue` generated from model 'PromotionPromotionTemplateValue'

CREATE TABLE IF NOT EXISTS `PromotionPromotionTemplateValue` (
  `promotion` long NOT NULL
  `promotionTemplateValue` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PromotionArrayElement` generated from model 'promotionArrayElement'
--

CREATE TABLE IF NOT EXISTS `PromotionArrayElement` (
  `data` long,
  `exception` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PromotionBatchUpdate` generated from model 'promotionBatchUpdate'
--

CREATE TABLE IF NOT EXISTS `PromotionBatchUpdate` (
  `id` text NOT NULL PRIMARY KEY /*Promotion ID*/,
  `discount_status` long,
  `end_time` int /*Promotion end time. Unix timestamp in seconds. Independent of campaign end time.*/,
  `external_id` text /*Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.*/,
  `platform_type` text /*The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;.*/,
  `promotion_code` text /*Code that can be used to redeem a promotion.*/,
  `promotion_custom_id` text /*An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.*/,
  `promotion_title` text /*Internal name for the promotion.*/,
  `promotion_type` long,
  `start_time` int /*Promotion start time. Unix timestamp in seconds. Independent of campaign start time.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PromotionBatchUpdatePromotionTemplateValue` generated from model 'PromotionBatchUpdatePromotionTemplateValue'

CREATE TABLE IF NOT EXISTS `PromotionBatchUpdatePromotionTemplateValue` (
  `promotionBatchUpdate` long NOT NULL
  `promotionTemplateValue` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PromotionCreate` generated from model 'promotionCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `PromotionCreate` (
  `promotion_title` text NOT NULL /*Internal name for the promotion.*/,
  `promotion_type` long NOT NULL,
  `discount_status` long,
  `end_time` int /*Promotion end time. Unix timestamp in seconds. Independent of campaign end time.*/,
  `external_id` text /*Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.*/,
  `platform_type` text /*The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;.*/,
  `promotion_code` text /*Code that can be used to redeem a promotion.*/,
  `promotion_custom_id` text /*An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.*/,
  `start_time` int /*Promotion start time. Unix timestamp in seconds. Independent of campaign start time.*/,
);  /*Resource create operation model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `PromotionCreatePromotionTemplateValue` generated from model 'PromotionCreatePromotionTemplateValue'

CREATE TABLE IF NOT EXISTS `PromotionCreatePromotionTemplateValue` (
  `promotionCreate` long NOT NULL
  `promotionTemplateValue` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PromotionTemplateValue` generated from model 'promotionTemplateValue'
--

CREATE TABLE IF NOT EXISTS `PromotionTemplateValue` (
  `amount` decimal /*Numeric value.*/,
  `currency_code` long,
  `custom_text` text /*Custom text.*/,
  `percent` decimal /*Percent value.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `promotions_list_200_response` generated from model 'promotionsList200Response'
--

CREATE TABLE IF NOT EXISTS `promotions_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PromotionsList200ResponsePromotion` generated from model 'PromotionsList200ResponsePromotion'

CREATE TABLE IF NOT EXISTS `PromotionsList200ResponsePromotion` (
  `promotionsList200Response` long NOT NULL
  `promotion` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PromotionsResponse` generated from model 'promotionsResponse'
--

CREATE TABLE IF NOT EXISTS `PromotionsResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PromotionsResponsePromotionArrayElement` generated from model 'PromotionsResponsePromotionArrayElement'

CREATE TABLE IF NOT EXISTS `PromotionsResponsePromotionArrayElement` (
  `promotionsResponse` long NOT NULL
  `promotionArrayElement` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `QualityComponentDetails` generated from model 'qualityComponentDetails'
-- Metrics for a specific event type within a quality component.
--

CREATE TABLE IF NOT EXISTS `QualityComponentDetails` (
  `coverage` decimal NOT NULL /*Coverage percentage for this event type.*/,
  `overlap` decimal /*Overlap percentage for this event type. Only populated for external_event_id*/
);  /*Metrics for a specific event type within a quality component.*/

-- --------------------------------------------------------------------------
-- Table structure for table `QualityComponentDetailsQualityComponentIssue` generated from model 'QualityComponentDetailsQualityComponentIssue'

CREATE TABLE IF NOT EXISTS `QualityComponentDetailsQualityComponentIssue` (
  `qualityComponentDetails` long NOT NULL
  `qualityComponentIssue` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `QualityComponentIssue` generated from model 'qualityComponentIssue'
-- Details of an issue with a quality component.
--

CREATE TABLE IF NOT EXISTS `QualityComponentIssue` (
  `id` text NOT NULL PRIMARY KEY /*Unique identifier for the issue check.*/,
  `name` text NOT NULL /*Human-readable name of the issue.*/,
  `reason` text NOT NULL /*Detailed reason for the issue.*/
);  /*Details of an issue with a quality component.*/


-- --------------------------------------------------------------------------
-- Table structure for table `QualityComponents` generated from model 'qualityComponents'
-- Set of quality components, with each component containing a event coverage and details.
--

CREATE TABLE IF NOT EXISTS `QualityComponents` (
  `advertiser_external_id` blob,
  `click_id_epik` blob,
  `external_event_id` blob /*Dedup components.*/,
  `hashed_email` blob /*User matching identifiers.*/,
  `hashed_maid` blob,
  `ip_address` blob,
  `order_id` blob,
  `order_value` blob,
  `product_id` blob /*Product/event metadata.*/,
  `source_url` blob,
  `user_agent` blob
);  /*Set of quality components, with each component containing a event coverage and details.*/


-- --------------------------------------------------------------------------
-- Table structure for table `QuizPinData` generated from model 'quizPinData'
-- This field includes all quiz data including questions, options, and results.
--

CREATE TABLE IF NOT EXISTS `QuizPinData` (
  `tie_breaker_custom_result` long,
  `tie_breaker_type` long
);  /*This field includes all quiz data including questions, options, and results.*/

-- --------------------------------------------------------------------------
-- Table structure for table `QuizPinDataQuizPinQuestion` generated from model 'QuizPinDataQuizPinQuestion'

CREATE TABLE IF NOT EXISTS `QuizPinDataQuizPinQuestion` (
  `quizPinData` long NOT NULL
  `quizPinQuestion` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `QuizPinDataQuizPinResult` generated from model 'QuizPinDataQuizPinResult'

CREATE TABLE IF NOT EXISTS `QuizPinDataQuizPinResult` (
  `quizPinData` long NOT NULL
  `quizPinResult` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `QuizPinOption` generated from model 'quizPinOption'
-- This field contains multiple options to a quiz question.
--

CREATE TABLE IF NOT EXISTS `QuizPinOption` (
  `id` decimal PRIMARY KEY AUTOINCREMENT,
  `text` text
);  /*This field contains multiple options to a quiz question.*/


-- --------------------------------------------------------------------------
-- Table structure for table `QuizPinQuestion` generated from model 'quizPinQuestion'
-- A specific quiz inquiry.
--

CREATE TABLE IF NOT EXISTS `QuizPinQuestion` (
  `question_id` decimal,
  `question_text` text
);  /*A specific quiz inquiry.*/

-- --------------------------------------------------------------------------
-- Table structure for table `QuizPinQuestionQuizPinOption` generated from model 'QuizPinQuestionQuizPinOption'

CREATE TABLE IF NOT EXISTS `QuizPinQuestionQuizPinOption` (
  `quizPinQuestion` long NOT NULL
  `quizPinOption` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `QuizPinResult` generated from model 'quizPinResult'
-- The result, and link out, based on the user’s choice.
--

CREATE TABLE IF NOT EXISTS `QuizPinResult` (
  `android_deep_link` text,
  `destination_url` text,
  `ios_deep_link` text,
  `organic_pin_id` text,
  `result_id` decimal
);  /*The result, and link out, based on the user’s choice.*/


-- --------------------------------------------------------------------------
-- Table structure for table `RecordCounts` generated from model 'recordCounts'
--

CREATE TABLE IF NOT EXISTS `RecordCounts` (
  `invalid` int NOT NULL /*Number of invalid records processed*/,
  `processed` int NOT NULL /*Number of records processed*/,
  `valid` int NOT NULL /*Number of valid records processed*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RelatedTerms` generated from model 'relatedTerms'
--

CREATE TABLE IF NOT EXISTS `RelatedTerms` (
  `id` text PRIMARY KEY /*First input term. For example, if you pass \&quot;?terms&#x3D;clothes,workout\&quot;, then id will be \&quot;clothes\&quot;*/,
  `related_term_count` int /*Total number of related terms returned*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `RelatedTermsRelatedTermsRelatedTermsListItems` generated from model 'RelatedTermsRelatedTermsRelatedTermsListItems'

CREATE TABLE IF NOT EXISTS `RelatedTermsRelatedTermsRelatedTermsListItems` (
  `relatedTerms` long NOT NULL
  `relatedTermsRelatedTermsListItems` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `RelatedTermsRelatedTermsListItems` generated from model 'relatedTermsRelatedTermsListItems'
--

CREATE TABLE IF NOT EXISTS `RelatedTermsRelatedTermsListItems` (
  `term` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `RelatedTermsRelatedTermsListItemsRelatedTerms` generated from model 'RelatedTermsRelatedTermsListItemsRelatedTerms'

CREATE TABLE IF NOT EXISTS `RelatedTermsRelatedTermsListItemsRelatedTerms` (
  `relatedTermsRelatedTermsListItems` long NOT NULL
  `relatedTerms` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `reports_stats_200_response` generated from model 'reportsStats200Response'
--

CREATE TABLE IF NOT EXISTS `reports_stats_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ReportsStats200ResponseCatalogsReportStats` generated from model 'ReportsStats200ResponseCatalogsReportStats'

CREATE TABLE IF NOT EXISTS `ReportsStats200ResponseCatalogsReportStats` (
  `reportsStats200Response` long NOT NULL
  `catalogsReportStats` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `RespondToInviteResultItem` generated from model 'respondToInviteResultItem'
--

CREATE TABLE IF NOT EXISTS `RespondToInviteResultItem` (
  `exception` long,
  `invite` long /*An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RespondToInvitesResponseArray` generated from model 'respondToInvitesResponseArray'
--

CREATE TABLE IF NOT EXISTS `RespondToInvitesResponseArray` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `RespondToInvitesResponseArrayRespondToInviteResultItem` generated from model 'RespondToInvitesResponseArrayRespondToInviteResultItem'

CREATE TABLE IF NOT EXISTS `RespondToInvitesResponseArrayRespondToInviteResultItem` (
  `respondToInvitesResponseArray` long NOT NULL
  `respondToInviteResultItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `RetailLocalInventoryItemAttributes` generated from model 'retailLocalInventoryItemAttributes'
-- Local inventory attributes for retail items (required fields for create/upsert)
--

CREATE TABLE IF NOT EXISTS `RetailLocalInventoryItemAttributes` (
  `availability` long NOT NULL /*Availability status of the item*/,
  `price` text NOT NULL /*The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars.*/,
  `ad_link` text /*Ad link for the item*/,
  `sale_price` text /*The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.*/
);  /*Local inventory attributes for retail items (required fields for create/upsert)*/


-- --------------------------------------------------------------------------
-- Table structure for table `RetailLocalInventoryItemAttributesOptional` generated from model 'retailLocalInventoryItemAttributesOptional'
-- Local inventory attributes for retail items (all fields optional for update/get)
--

CREATE TABLE IF NOT EXISTS `RetailLocalInventoryItemAttributesOptional` (
  `ad_link` text /*Ad link for the item*/,
  `availability` long /*Availability status of the item*/,
  `price` text /*The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars.*/,
  `sale_price` text /*The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.*/
);  /*Local inventory attributes for retail items (all fields optional for update/get)*/


-- --------------------------------------------------------------------------
-- Table structure for table `S3FilePart` generated from model 's3FilePart'
--

CREATE TABLE IF NOT EXISTS `S3FilePart` (
  `part_number` int NOT NULL /*Part number for upload.*/,
  `presigned_url` text NOT NULL /*Pre-signed URL.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `S3MultipartUploadData` generated from model 's3MultipartUploadData'
--

CREATE TABLE IF NOT EXISTS `S3MultipartUploadData` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `S3MultipartUploadDataS3FilePart` generated from model 'S3MultipartUploadDataS3FilePart'

CREATE TABLE IF NOT EXISTS `S3MultipartUploadDataS3FilePart` (
  `s3MultipartUploadData` long NOT NULL
  `s3FilePart` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOAccount` generated from model 'ssIOAccount'
-- Salesforce account details including bill-to information.
--

CREATE TABLE IF NOT EXISTS `SSIOAccount` (
  `can_edit` boolean /*Advertiser eligible to update order lines*/,
  `currency` text,
  `eligible` boolean /*Advertiser eligible to create order lines*/,
  `error` text /*Error indicator from Salesforce which could be \&quot;No Error\&quot;*/,
);  /*Salesforce account details including bill-to information.*/

-- --------------------------------------------------------------------------
-- Table structure for table `SSIOAccountSSIOAccountItem` generated from model 'SSIOAccountSSIOAccountItem'

CREATE TABLE IF NOT EXISTS `SSIOAccountSSIOAccountItem` (
  `sSIOAccount` long NOT NULL
  `sSIOAccountItem` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `SSIOAccountSSIOAccountPMPName` generated from model 'SSIOAccountSSIOAccountPMPName'

CREATE TABLE IF NOT EXISTS `SSIOAccountSSIOAccountPMPName` (
  `sSIOAccount` long NOT NULL
  `sSIOAccountPMPName` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOAccountAddress` generated from model 'ssIOAccountAddress'
-- Salesforce address information.
--

CREATE TABLE IF NOT EXISTS `SSIOAccountAddress` (
  `address_id` text /*Salesforce id for address*/,
  `display` text /*Address display*/,
  `order_legal_entity` text /*Legal entity for this insertion order*/,
  `purpose` text /*Purpose for which the address is used, usually Billing or Businness*/
);  /*Salesforce address information.*/


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOAccountItem` generated from model 'ssIOAccountItem'
-- Salesforce account item with billing and terms information.
--

CREATE TABLE IF NOT EXISTS `SSIOAccountItem` (
  `id` text PRIMARY KEY /*Salesforce id for billto_info*/,
  `io_terms` text /*Salesforce text for IO Terms and Conditions*/,
  `io_terms_id` text /*Salesforce id for IO Terms and Conditions*/,
  `io_type` text /*Insertion Order Type - Pinterest Paper or Agency Paper*/,
  `row_terms` text /*Salesforce text for Rest of the World Terms and Conditions*/,
  `row_terms_id` text /*Salesforce id for Rest of the World Terms and Conditions*/,
  `us_terms` text /*Salesforce text for US Terms and Conditions*/,
  `us_terms_id` text /*Salesforce id for US Terms and Conditions*/
);  /*Salesforce account item with billing and terms information.*/

-- --------------------------------------------------------------------------
-- Table structure for table `SSIOAccountItemSSIOAccountAddress` generated from model 'SSIOAccountItemSSIOAccountAddress'

CREATE TABLE IF NOT EXISTS `SSIOAccountItemSSIOAccountAddress` (
  `sSIOAccountItem` long NOT NULL
  `sSIOAccountAddress` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOAccountPMPName` generated from model 'ssIOAccountPMPName'
-- Pinterest marketing partner name.
--

CREATE TABLE IF NOT EXISTS `SSIOAccountPMPName` (
  `id` text PRIMARY KEY /*Salesforce id for PMP*/,
  `name` text /*Display name*/
);  /*Pinterest marketing partner name.*/


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOInsertionOrder` generated from model 'ssIOInsertionOrder'
-- An SSIO insertion order.
--

CREATE TABLE IF NOT EXISTS `SSIOInsertionOrder` (
  `pin_order_id` text /*Salesforce order id*/
);  /*An SSIO insertion order.*/


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOInsertionOrderCreate` generated from model 'ssIOInsertionOrderCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `SSIOInsertionOrderCreate` (
  `accepted_terms_id` text NOT NULL /*The SFDC id for the terms*/,
  `billing_contact_email` text NOT NULL /*The billing contact email*/,
  `billing_contact_firstname` text NOT NULL /*The billing contact first name*/,
  `billing_contact_lastname` text NOT NULL /*The billing contact last name*/,
  `billto_billing_address_id` text NOT NULL /*The bill-to billing address id*/,
  `billto_business_address_id` text NOT NULL /*The bill-to business address id*/,
  `billto_company_id` text NOT NULL /*The bill-to company id*/,
  `currency_info` long NOT NULL,
  `media_contact_email` text NOT NULL /*The media contact email*/,
  `media_contact_firstname` text NOT NULL /*The media contact first name*/,
  `media_contact_lastname` text NOT NULL /*The media contact last name*/,
  `order_line_type` long NOT NULL /*Type can be Budget or Perpetual*/,
  `order_name` text NOT NULL /*The order name*/,
  `pmp_id` text NOT NULL /*The pmp id*/,
  `po_number` text NOT NULL /*The po number*/,
  `start_date` text NOT NULL /*Starting date of time period. Format: YYYY-MM-DD*/,
  `accepted_terms_time` int /*The UTC timestamp (to the nearest sec) of when terms were accepted*/,
  `agency_link` text /*URL link for agency*/,
  `budget_amount` double /*If Budget order line, the budget amount.*/,
  `end_date` text /*End date of time period. Format: YYYY-MM-DD*/,
  `estimated_monthly_spend` double /*If Ongoing (perpetual) order line, the estimated monthly spend*/,
  `user_email` text /*The email of user submitting the insertion order*/
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOInsertionOrderStatus` generated from model 'ssIOInsertionOrderStatus'
-- SSIO insertion order status item in a list response.
--

CREATE TABLE IF NOT EXISTS `SSIOInsertionOrderStatus` (
  `creation_time` text /*Salesforce insertion order creation time*/,
  `pin_order_id` text /*Salesforce order id*/,
  `status` text /*Salesforce insertion order status*/
);  /*SSIO insertion order status item in a list response.*/


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOInsertionOrderStatusResponse` generated from model 'ssIOInsertionOrderStatusResponse'
-- SSIO insertion order status response for a single pin order id lookup.
--

CREATE TABLE IF NOT EXISTS `SSIOInsertionOrderStatusResponse` (
  `creation_time` text /*Salesforce insertion order creation time*/,
  `pin_order_id` text /*Salesforce order id*/,
  `status` text /*Salesforce insertion order status*/
);  /*SSIO insertion order status response for a single pin order id lookup.*/


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOInsertionOrderUpdate` generated from model 'ssIOInsertionOrderUpdate'
-- Resource create or update operation model.
--

CREATE TABLE IF NOT EXISTS `SSIOInsertionOrderUpdate` (
  `ads_manager_order_line_id` text /*Ads manager OrderLineId*/,
  `agency_link` text /*URL link for agency*/,
  `billing_contact_email` text /*The billing contact email*/,
  `billing_contact_firstname` text /*The billing contact first name*/,
  `billing_contact_lastname` text /*The billing contact last name*/,
  `budget_amount` double /*If Budget order line, the budget amount.*/,
  `end_date` text /*End date of time period. Format: YYYY-MM-DD*/,
  `media_contact_email` text /*The media contact email*/,
  `media_contact_firstname` text /*The media contact first name*/,
  `media_contact_lastname` text /*The media contact last name*/,
  `oracle_line_id` text /*LineId in the Oracle DB*/,
  `po_number` text /*The po number*/,
  `salesforce_order_id` text /*OrderId in SFDC*/,
  `salesforce_order_line_id` text /*OrderLineId in SFDC*/,
  `start_date` text /*Starting date of time period. Format: YYYY-MM-DD*/,
  `user_email` text /*The email of user submitting the insertion order*/
);  /*Resource create or update operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOOrderLine` generated from model 'ssIOOrderLine'
-- A Salesforce SSIO order line.
--

CREATE TABLE IF NOT EXISTS `SSIOOrderLine` (
  `accepted_terms_id` text /*The SFDC id for the terms*/,
  `accepted_terms_time` text /*The UTC timestamp (to the nearest second) when terms were accepted.*/,
  `ads_manager_order_line_id` text /*Ads manager order line id*/,
  `agency_link` text /*Agency link*/,
  `bill_to_company_name` text /*Bill-to company name*/,
  `billing_contact_email` text /*Billing contact email*/,
  `billing_contact_firstname` text /*Billing contact first name*/,
  `billing_contact_lastname` text /*Billing contact last name*/,
  `budget_amount` decimal /*If budget order line, the budget amount.*/,
  `currency_info` long,
  `end_date` date /*End date of the order line.*/,
  `estimated_monthly_spend` decimal /*If ongoing (perpetual) order line, the estimated monthly spend.*/,
  `last_modified_date_time` text /*Last modified date.*/,
  `media_contact_email` text /*Billing media email*/,
  `media_contact_firstname` text /*Billing media contact first name*/,
  `media_contact_lastname` text /*Billing media contact last name*/,
  `order_name` text /*The order name*/,
  `pin_order_id` text /*The pin order id associated with the order line in SFDC*/,
  `pmp_name` text /*The Pinterest marketing partner name*/,
  `po_number` text /*The PO number*/,
  `salesforce_order_line_id` text /*Order line id in SFDC*/,
  `start_date` date /*Start date of the order line.*/
);  /*A Salesforce SSIO order line.*/


-- --------------------------------------------------------------------------
-- Table structure for table `Schedule` generated from model 'schedule'
--

CREATE TABLE IF NOT EXISTS `Schedule` (
  `entity_id` text NOT NULL /*entity ID.*/,
  `schedule_id` text NOT NULL /*Schedule ID.*/,
  `delta_value` long,
  `end_timestamp` int /*Schedule end time. Unix timestamp in seconds.*/,
  `entity_type` long /*Specify the entity_type to get summary information*/,
  `name` text /*Schedule name.*/,
  `schedule_action` long /*The schedule action.*/,
  `schedule_status` long /*Schedule status.*/,
  `schedule_type` long /*The schedule type.*/,
  `start_timestamp` int /*Schedule start time. Unix timestamp in seconds.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ScheduleAgeBucketMultipliers` generated from model 'scheduleAgeBucketMultipliers'
-- This represents a mapping from age bucket to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `ScheduleAgeBucketMultipliers` (
  `AGE_BUCKET` text
);  /*This represents a mapping from age bucket to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ScheduleAppTypeMultipliers` generated from model 'scheduleAppTypeMultipliers'
-- This represents a mapping from app type targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `ScheduleAppTypeMultipliers` (
  `APP_TYPE` long
);  /*This represents a mapping from app type targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ScheduleAudienceMultipliers` generated from model 'scheduleAudienceMultipliers'
-- This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `ScheduleAudienceMultipliers` (
  `AUDIENCE_ID` text
);  /*This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ScheduleBatchUpdate` generated from model 'scheduleBatchUpdate'
--

CREATE TABLE IF NOT EXISTS `ScheduleBatchUpdate` (
  `id` text NOT NULL PRIMARY KEY,
  `schedule_id` text NOT NULL /*Schedule ID.*/,
  `delta_value` long,
  `end_timestamp` int /*Schedule end time. Unix timestamp in seconds.*/,
  `entity_id` text /*entity ID.*/,
  `entity_type` long /*Specify the entity_type to get summary information*/,
  `name` text /*Schedule name.*/,
  `schedule_action` long /*The schedule action.*/,
  `schedule_status` long /*Schedule status.*/,
  `schedule_type` long /*The schedule type.*/,
  `start_timestamp` int /*Schedule start time. Unix timestamp in seconds.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ScheduleBidMultipliers` generated from model 'scheduleBidMultipliers'
-- The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.
--

CREATE TABLE IF NOT EXISTS `ScheduleBidMultipliers` (
  `age_bucket_multipliers` long,
  `app_type_multipliers` long,
  `gender_multipliers` long,
  `placement_multipliers` long
);  /*The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ScheduleBidMultipliersBidOptionsAudienceMultipliers` generated from model 'ScheduleBidMultipliersBidOptionsAudienceMultipliers'

CREATE TABLE IF NOT EXISTS `ScheduleBidMultipliersBidOptionsAudienceMultipliers` (
  `scheduleBidMultipliers` long NOT NULL
  `bidOptionsAudienceMultipliers` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ScheduleBidOptions` generated from model 'scheduleBidOptions'
-- Object describing the schedule level bid level changes.
--

CREATE TABLE IF NOT EXISTS `ScheduleBidOptions` (
  `age_bucket_multipliers` long,
  `app_type_multipliers` long,
  `audience_multipliers` long,
  `gender_multipliers` long,
  `placement_multipliers` long
);  /*Object describing the schedule level bid level changes.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ScheduleBidOptions_gender_multipliers` generated from model 'scheduleBidOptionsGenderMultipliers'
-- This represents a mapping from gender targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `ScheduleBidOptions_gender_multipliers` (
  `GENDER` long
);  /*This represents a mapping from gender targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ScheduleBidOptions_placement_multipliers` generated from model 'scheduleBidOptionsPlacementMultipliers'
-- This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `ScheduleBidOptions_placement_multipliers` (
  `browse` double /*Browse (home-feed and related surfaces)*/,
  `related_pins` double /*Related-Pins placement*/,
  `search` double /*Search placement*/
);  /*This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ScheduleCommonDeltaValue` generated from model 'scheduleCommonDeltaValue'
--

CREATE TABLE IF NOT EXISTS `ScheduleCommonDeltaValue` (
  `age_bucket_multipliers` long,
  `app_type_multipliers` long,
  `audience_multipliers` long,
  `gender_multipliers` long,
  `placement_multipliers` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ScheduleCreate` generated from model 'scheduleCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `ScheduleCreate` (
  `entity_id` text NOT NULL /*entity ID.*/,
  `delta_value` long,
  `end_timestamp` int /*Schedule end time. Unix timestamp in seconds.*/,
  `entity_type` long /*Specify the entity_type to get summary information*/,
  `name` text /*Schedule name.*/,
  `schedule_action` long /*The schedule action.*/,
  `schedule_status` long /*Schedule status.*/,
  `schedule_type` long /*The schedule type.*/,
  `start_timestamp` int /*Schedule start time. Unix timestamp in seconds.*/
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ScheduleCreateRequest` generated from model 'scheduleCreateRequest'
--

CREATE TABLE IF NOT EXISTS `ScheduleCreateRequest` (
  `entity_id` text NOT NULL,
  `entity_type` text NOT NULL /*Entity type*/,
  `delta_value` long NOT NULL,
  `end_timestamp` int NOT NULL /*Schedule end time. Unix timestamp in seconds.*/,
  `name` text NOT NULL,
  `schedule_action` long NOT NULL,
  `schedule_status` long NOT NULL,
  `schedule_type` long NOT NULL,
  `start_timestamp` int NOT NULL /*Schedule start time. Unix timestamp in seconds.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ScheduleCreateRequestAllOf1` generated from model 'scheduleCreateRequestAllOf1'
--

CREATE TABLE IF NOT EXISTS `ScheduleCreateRequestAllOf1` (
  `entity_id` text NOT NULL,
  `entity_type` text NOT NULL /*Entity type*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Schedule_delta_value` generated from model 'scheduleDeltaValue'
-- The value of the scheduled adjustment.
--

CREATE TABLE IF NOT EXISTS `Schedule_delta_value` (
  `age_bucket_multipliers` long,
  `app_type_multipliers` long,
  `gender_multipliers` long,
  `placement_multipliers` long
);  /*The value of the scheduled adjustment.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ScheduleDeltaValueBidOptionsAudienceMultipliers` generated from model 'ScheduleDeltaValueBidOptionsAudienceMultipliers'

CREATE TABLE IF NOT EXISTS `ScheduleDeltaValueBidOptionsAudienceMultipliers` (
  `scheduleDeltaValue` long NOT NULL
  `bidOptionsAudienceMultipliers` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ScheduleGenderMultipliers` generated from model 'scheduleGenderMultipliers'
-- This represents a mapping from gender targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `ScheduleGenderMultipliers` (
  `GENDER` long
);  /*This represents a mapping from gender targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.*/


-- --------------------------------------------------------------------------
-- Table structure for table `SchedulePlacementMultipliers` generated from model 'schedulePlacementMultipliers'
-- This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
--

CREATE TABLE IF NOT EXISTS `SchedulePlacementMultipliers` (
  `browse` double /*Browse (home-feed and related surfaces)*/,
  `related_pins` double /*Related-Pins placement*/,
  `search` double /*Search placement*/
);  /*This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ScheduleUpdateRequest` generated from model 'scheduleUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `ScheduleUpdateRequest` (
  `id` text NOT NULL PRIMARY KEY /*Schedule ID.*/,
  `entity_id` text,
  `entity_type` text /*Entity type*/,
  `delta_value` long,
  `end_timestamp` int /*Schedule end time. Unix timestamp in seconds.*/,
  `name` text,
  `schedule_action` long,
  `schedule_status` long,
  `schedule_type` long,
  `start_timestamp` int /*Schedule start time. Unix timestamp in seconds.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ScheduleUpdateRequestAllOf1` generated from model 'scheduleUpdateRequestAllOf1'
--

CREATE TABLE IF NOT EXISTS `ScheduleUpdateRequestAllOf1` (
  `id` text NOT NULL PRIMARY KEY /*Schedule ID.*/,
  `entity_id` text,
  `entity_type` text /*Entity type*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `schedules_create_200_response_inner` generated from model 'schedulesCreate200ResponseInner'
--

CREATE TABLE IF NOT EXISTS `schedules_create_200_response_inner` (
  `data` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `schedules_create_200_response_inner_data` generated from model 'schedulesCreate200ResponseInnerData'
-- Created/updated resource on success or error details on failure
--

CREATE TABLE IF NOT EXISTS `schedules_create_200_response_inner_data` (
  `entity_id` text NOT NULL /*entity ID.*/,
  `schedule_id` text NOT NULL /*Schedule ID.*/,
  `id` text NOT NULL PRIMARY KEY,
  `exceptions` long NOT NULL,
  `delta_value` long,
  `end_timestamp` int /*Schedule end time. Unix timestamp in seconds.*/,
  `entity_type` long /*Specify the entity_type to get summary information*/,
  `name` text /*Schedule name.*/,
  `schedule_action` long /*The schedule action.*/,
  `schedule_status` long /*Schedule status.*/,
  `schedule_type` long /*The schedule type.*/,
  `start_timestamp` int /*Schedule start time. Unix timestamp in seconds.*/
);  /*Created/updated resource on success or error details on failure*/


-- --------------------------------------------------------------------------
-- Table structure for table `schedules_create_200_response_inner_data_oneOf` generated from model 'schedulesCreate200ResponseInnerDataOneOf'
--

CREATE TABLE IF NOT EXISTS `schedules_create_200_response_inner_data_oneOf` (
  `id` text NOT NULL PRIMARY KEY,
  `schedule_id` text NOT NULL /*Schedule ID.*/,
  `exceptions` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `schedules_list_200_response` generated from model 'schedulesList200Response'
--

CREATE TABLE IF NOT EXISTS `schedules_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `SchedulesList200ResponseSchedule` generated from model 'SchedulesList200ResponseSchedule'

CREATE TABLE IF NOT EXISTS `SchedulesList200ResponseSchedule` (
  `schedulesList200Response` long NOT NULL
  `schedule` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ScrollupGoalMetadata` generated from model 'scrollupGoalMetadata'
--

CREATE TABLE IF NOT EXISTS `ScrollupGoalMetadata` (
  `scrollup_goal_value_in_micro_currency` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `search_partner_pins_200_response` generated from model 'searchPartnerPins200Response'
--

CREATE TABLE IF NOT EXISTS `search_partner_pins_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `SearchPartnerPins200ResponseSummaryPin` generated from model 'SearchPartnerPins200ResponseSummaryPin'

CREATE TABLE IF NOT EXISTS `SearchPartnerPins200ResponseSummaryPin` (
  `searchPartnerPins200Response` long NOT NULL
  `summaryPin` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SharedAudienceAccount` generated from model 'sharedAudienceAccount'
--

CREATE TABLE IF NOT EXISTS `SharedAudienceAccount` (
  `account_id` text NOT NULL /*Account ID (ad account or business ID).*/,
  `account_name` text NOT NULL /*Account name.*/,
  `account_type` long NOT NULL /*account type*/,
  `shared_on_timestamp` int NOT NULL /*Epoch timestamp in seconds for the shared audience event*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `shared_audiences_for_business_list_200_response` generated from model 'sharedAudiencesForBusinessList200Response'
--

CREATE TABLE IF NOT EXISTS `shared_audiences_for_business_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `SharedAudiencesForBusinessList200ResponseAudience` generated from model 'SharedAudiencesForBusinessList200ResponseAudience'

CREATE TABLE IF NOT EXISTS `SharedAudiencesForBusinessList200ResponseAudience` (
  `sharedAudiencesForBusinessList200Response` long NOT NULL
  `audience` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SingleInterestTargetingOption` generated from model 'singleInterestTargetingOption'
--

CREATE TABLE IF NOT EXISTS `SingleInterestTargetingOption` (
  `id` text NOT NULL PRIMARY KEY,
  `level` int NOT NULL,
  `name` text NOT NULL
); 

-- --------------------------------------------------------------------------
-- Table structure for table `SingleInterestTargetingOptionChildInterests` generated from model 'SingleInterestTargetingOptionChildInterests'

CREATE TABLE IF NOT EXISTS `SingleInterestTargetingOptionChildInterests` (
  `singleInterestTargetingOption` long NOT NULL
  `childInterests` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ssio_insertion_orders_status_get_by_ad_account_200_response` generated from model 'ssioInsertionOrdersStatusGetByAdAccount200Response'
--

CREATE TABLE IF NOT EXISTS `ssio_insertion_orders_status_get_by_ad_account_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `SsioInsertionOrdersStatusGetByAdAccount200ResponseSSIOInsertionOrderStatus` generated from model 'SsioInsertionOrdersStatusGetByAdAccount200ResponseSSIOInsertionOrderStatus'

CREATE TABLE IF NOT EXISTS `SsioInsertionOrdersStatusGetByAdAccount200ResponseSSIOInsertionOrderStatus` (
  `ssioInsertionOrdersStatusGetByAdAccount200Response` long NOT NULL
  `sSIOInsertionOrderStatus` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ssio_order_lines_get_by_ad_account_200_response` generated from model 'ssioOrderLinesGetByAdAccount200Response'
--

CREATE TABLE IF NOT EXISTS `ssio_order_lines_get_by_ad_account_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `SsioOrderLinesGetByAdAccount200ResponseSSIOOrderLine` generated from model 'SsioOrderLinesGetByAdAccount200ResponseSSIOOrderLine'

CREATE TABLE IF NOT EXISTS `SsioOrderLinesGetByAdAccount200ResponseSSIOOrderLine` (
  `ssioOrderLinesGetByAdAccount200Response` long NOT NULL
  `sSIOOrderLine` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `StoreMetadata` generated from model 'storeMetadata'
-- Store metadata for a specific store location
--

CREATE TABLE IF NOT EXISTS `StoreMetadata` (
  `store_code` text NOT NULL /*Merchant provided store code*/,
  `store_id` text NOT NULL /*Internal store code*/,
  `geohash` text /*Geohash of the store location*/,
  `latitude` double /*Geographic latitude coordinate of the store*/,
  `longitude` double /*Geographic longitude coordinate of the store*/,
  `store_name` text /*Store name*/
);  /*Store metadata for a specific store location*/


-- --------------------------------------------------------------------------
-- Table structure for table `SummaryPin` generated from model 'summaryPin'
-- Summarized pin information
--

CREATE TABLE IF NOT EXISTS `SummaryPin` (
  `id` text NOT NULL PRIMARY KEY,
  `alt_text` text,
  `description` text,
  `link` text,
  `media` long,
  `title` text
);  /*Summarized pin information*/


-- --------------------------------------------------------------------------
-- Table structure for table `SupplementalItemValidationEvent` generated from model 'supplementalItemValidationEvent'
-- Item validation event
--

CREATE TABLE IF NOT EXISTS `SupplementalItemValidationEvent` (
  `attribute` text NOT NULL /*The item attribute referenced by the validation event eg. price, availability, ad_link*/,
  `code` int NOT NULL /*The event code that the item validation event references*/,
  `message` text NOT NULL /*Title message describing the item validation event*/
);  /*Item validation event*/


-- --------------------------------------------------------------------------
-- Table structure for table `SupplementalItemsBatchResponse` generated from model 'supplementalItemsBatchResponse'
-- Response model for supplemental items batch operation
--

CREATE TABLE IF NOT EXISTS `SupplementalItemsBatchResponse` (
  `batch_id` text NOT NULL /*Id of the batch operation*/,
  `created_time` datetime NOT NULL /*Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss*/,
  `status` long NOT NULL /*Status of the batch: PROCESSING, COMPLETED, FAILED*/,
  `completed_time` datetime /*Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss*/
);  /*Response model for supplemental items batch operation*/

-- --------------------------------------------------------------------------
-- Table structure for table `SupplementalItemsBatchResponseSupplementalOperationResult` generated from model 'SupplementalItemsBatchResponseSupplementalOperationResult'

CREATE TABLE IF NOT EXISTS `SupplementalItemsBatchResponseSupplementalOperationResult` (
  `supplementalItemsBatchResponse` long NOT NULL
  `supplementalOperationResult` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SupplementalOperationResult` generated from model 'supplementalOperationResult'
-- Result of a supplemental item operation, discriminated by supplemental_type
--

CREATE TABLE IF NOT EXISTS `SupplementalOperationResult` (
  `item_id` text NOT NULL /*Catalog item id in the merchant namespace*/,
  `status` long NOT NULL /*Status of the item processing record*/,
  `store_code` text NOT NULL /*Store code for the local inventory item*/,
  `supplemental_type` text NOT NULL,
);  /*Result of a supplemental item operation, discriminated by supplemental_type*/

-- --------------------------------------------------------------------------
-- Table structure for table `SupplementalOperationResultSupplementalItemValidationEvent` generated from model 'SupplementalOperationResultSupplementalItemValidationEvent'

CREATE TABLE IF NOT EXISTS `SupplementalOperationResultSupplementalItemValidationEvent` (
  `supplementalOperationResult` long NOT NULL
  `supplementalItemValidationEvent` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `SupplementalOperationResultSupplementalItemValidationEvent` generated from model 'SupplementalOperationResultSupplementalItemValidationEvent'

CREATE TABLE IF NOT EXISTS `SupplementalOperationResultSupplementalItemValidationEvent` (
  `supplementalOperationResult` long NOT NULL
  `supplementalItemValidationEvent` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SystemUserUpdateWithRequiredBody` generated from model 'systemUserUpdateWithRequiredBody'
-- Resource create or update operation model with required body fields (no OptionalProperties).
--

CREATE TABLE IF NOT EXISTS `SystemUserUpdateWithRequiredBody` (
  `name` text NOT NULL /*New system user name*/
);  /*Resource create or update operation model with required body fields (no OptionalProperties).*/


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpec` generated from model 'targetingSpec'
-- Ad group targeting specification defining the ad group target audience. For example, &#x60;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;MINIMUM_AGE\&quot;:\&quot;18\&quot;, \&quot;MAXIMUM_AGE\&quot;:\&quot;65+\&quot;}&#x60;
--

CREATE TABLE IF NOT EXISTS `TargetingSpec` (
  `MAXIMUM_AGE` text /*Maximum age to target (inclusive). Values: \&quot;18\&quot;, \&quot;19\&quot;, ..., \&quot;65\&quot;, \&quot;65+\&quot;. Must be used together with &#x60;MINIMUM_AGE&#x60;. Cannot be combined with &#x60;AGE_BUCKET&#x60;. If neither &#x60;MINIMUM_AGE&#x60;/&#x60;MAXIMUM_AGE&#x60; nor &#x60;AGE_BUCKET&#x60; are specified, all ages will be targeted.*/,
  `MINIMUM_AGE` text /*Minimum age to target (inclusive). Values: \&quot;18\&quot;, \&quot;19\&quot;, ..., \&quot;65\&quot;. Note: 65+ is not allowed for minimum age. Must be used together with &#x60;MAXIMUM_AGE&#x60;. Cannot be combined with &#x60;AGE_BUCKET&#x60;. If neither &#x60;MINIMUM_AGE&#x60;/&#x60;MAXIMUM_AGE&#x60; nor &#x60;AGE_BUCKET&#x60; are specified, all ages will be targeted.*/,
);  /*Ad group targeting specification defining the ad group target audience. For example, &#x60;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;MINIMUM_AGE\&quot;:\&quot;18\&quot;, \&quot;MAXIMUM_AGE\&quot;:\&quot;65+\&quot;}&#x60;*/

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecTargetingSpecAgeBucket` generated from model 'TargetingSpecTargetingSpecAgeBucket'

CREATE TABLE IF NOT EXISTS `TargetingSpecTargetingSpecAgeBucket` (
  `targetingSpec` long NOT NULL
  `targetingSpecAgeBucket` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecTargetingSpecAppType` generated from model 'TargetingSpecTargetingSpecAppType'

CREATE TABLE IF NOT EXISTS `TargetingSpecTargetingSpecAppType` (
  `targetingSpec` long NOT NULL
  `targetingSpecAppType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecAUDIENCEEXCLUDE` generated from model 'TargetingSpecAUDIENCEEXCLUDE'

CREATE TABLE IF NOT EXISTS `TargetingSpecAUDIENCEEXCLUDE` (
  `targetingSpec` long NOT NULL
  `aUDIENCEEXCLUDE` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecAUDIENCEINCLUDE` generated from model 'TargetingSpecAUDIENCEINCLUDE'

CREATE TABLE IF NOT EXISTS `TargetingSpecAUDIENCEINCLUDE` (
  `targetingSpec` long NOT NULL
  `aUDIENCEINCLUDE` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecTargetingSpecGender` generated from model 'TargetingSpecTargetingSpecGender'

CREATE TABLE IF NOT EXISTS `TargetingSpecTargetingSpecGender` (
  `targetingSpec` long NOT NULL
  `targetingSpecGender` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecGEO` generated from model 'TargetingSpecGEO'

CREATE TABLE IF NOT EXISTS `TargetingSpecGEO` (
  `targetingSpec` long NOT NULL
  `gEO` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecGEOEXCLUDE` generated from model 'TargetingSpecGEOEXCLUDE'

CREATE TABLE IF NOT EXISTS `TargetingSpecGEOEXCLUDE` (
  `targetingSpec` long NOT NULL
  `gEOEXCLUDE` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecINTEREST` generated from model 'TargetingSpecINTEREST'

CREATE TABLE IF NOT EXISTS `TargetingSpecINTEREST` (
  `targetingSpec` long NOT NULL
  `iNTEREST` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecLOCALE` generated from model 'TargetingSpecLOCALE'

CREATE TABLE IF NOT EXISTS `TargetingSpecLOCALE` (
  `targetingSpec` long NOT NULL
  `lOCALE` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecLOCATION` generated from model 'TargetingSpecLOCATION'

CREATE TABLE IF NOT EXISTS `TargetingSpecLOCATION` (
  `targetingSpec` long NOT NULL
  `lOCATION` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecLOCATIONEXCLUDE` generated from model 'TargetingSpecLOCATIONEXCLUDE'

CREATE TABLE IF NOT EXISTS `TargetingSpecLOCATIONEXCLUDE` (
  `targetingSpec` long NOT NULL
  `lOCATIONEXCLUDE` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecTargetingSpecShoppingRetargeting` generated from model 'TargetingSpecTargetingSpecShoppingRetargeting'

CREATE TABLE IF NOT EXISTS `TargetingSpecTargetingSpecShoppingRetargeting` (
  `targetingSpec` long NOT NULL
  `targetingSpecShoppingRetargeting` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecTARGETINGSTRATEGY` generated from model 'TargetingSpecTARGETINGSTRATEGY'

CREATE TABLE IF NOT EXISTS `TargetingSpecTARGETINGSTRATEGY` (
  `targetingSpec` long NOT NULL
  `tARGETINGSTRATEGY` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationAgeBucket` generated from model 'targetingSpecOperationAgeBucket'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationAgeBucket` (
  `field` text NOT NULL,
  `operation` text NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationAgeBucketTargetingSpecAgeBucket` generated from model 'TargetingSpecOperationAgeBucketTargetingSpecAgeBucket'

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationAgeBucketTargetingSpecAgeBucket` (
  `targetingSpecOperationAgeBucket` long NOT NULL
  `targetingSpecAgeBucket` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationAppType` generated from model 'targetingSpecOperationAppType'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationAppType` (
  `field` text NOT NULL,
  `operation` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationAppTypeTargetingSpecAppType` generated from model 'TargetingSpecOperationAppTypeTargetingSpecAppType'

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationAppTypeTargetingSpecAppType` (
  `targetingSpecOperationAppType` long NOT NULL
  `targetingSpecAppType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationAudienceExclude` generated from model 'targetingSpecOperationAudienceExclude'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationAudienceExclude` (
  `field` text NOT NULL,
  `operation` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationAudienceExcludePropertyValues` generated from model 'TargetingSpecOperationAudienceExcludePropertyValues'

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationAudienceExcludePropertyValues` (
  `targetingSpecOperationAudienceExclude` long NOT NULL
  `propertyValues` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationAudienceInclude` generated from model 'targetingSpecOperationAudienceInclude'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationAudienceInclude` (
  `field` text NOT NULL,
  `operation` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationAudienceIncludePropertyValues` generated from model 'TargetingSpecOperationAudienceIncludePropertyValues'

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationAudienceIncludePropertyValues` (
  `targetingSpecOperationAudienceInclude` long NOT NULL
  `propertyValues` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationGender` generated from model 'targetingSpecOperationGender'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationGender` (
  `field` text NOT NULL,
  `operation` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationGenderTargetingSpecGender` generated from model 'TargetingSpecOperationGenderTargetingSpecGender'

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationGenderTargetingSpecGender` (
  `targetingSpecOperationGender` long NOT NULL
  `targetingSpecGender` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationGeo` generated from model 'targetingSpecOperationGeo'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationGeo` (
  `field` text NOT NULL,
  `operation` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationGeoPropertyValues` generated from model 'TargetingSpecOperationGeoPropertyValues'

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationGeoPropertyValues` (
  `targetingSpecOperationGeo` long NOT NULL
  `propertyValues` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationGeoExclude` generated from model 'targetingSpecOperationGeoExclude'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationGeoExclude` (
  `field` text NOT NULL,
  `operation` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationGeoExcludePropertyValues` generated from model 'TargetingSpecOperationGeoExcludePropertyValues'

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationGeoExcludePropertyValues` (
  `targetingSpecOperationGeoExclude` long NOT NULL
  `propertyValues` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationInterest` generated from model 'targetingSpecOperationInterest'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationInterest` (
  `field` text NOT NULL,
  `operation` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationInterestPropertyValues` generated from model 'TargetingSpecOperationInterestPropertyValues'

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationInterestPropertyValues` (
  `targetingSpecOperationInterest` long NOT NULL
  `propertyValues` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationLocale` generated from model 'targetingSpecOperationLocale'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationLocale` (
  `field` text NOT NULL,
  `operation` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationLocalePropertyValues` generated from model 'TargetingSpecOperationLocalePropertyValues'

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationLocalePropertyValues` (
  `targetingSpecOperationLocale` long NOT NULL
  `propertyValues` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationLocation` generated from model 'targetingSpecOperationLocation'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationLocation` (
  `field` text NOT NULL,
  `operation` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationLocationPropertyValues` generated from model 'TargetingSpecOperationLocationPropertyValues'

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationLocationPropertyValues` (
  `targetingSpecOperationLocation` long NOT NULL
  `propertyValues` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationLocationExclude` generated from model 'targetingSpecOperationLocationExclude'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationLocationExclude` (
  `field` text NOT NULL,
  `operation` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationLocationExcludePropertyValues` generated from model 'TargetingSpecOperationLocationExcludePropertyValues'

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationLocationExcludePropertyValues` (
  `targetingSpecOperationLocationExclude` long NOT NULL
  `propertyValues` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationMaximumAge` generated from model 'targetingSpecOperationMaximumAge'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationMaximumAge` (
  `field` text NOT NULL,
  `operation` text NOT NULL,
  `value` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationMinimumAge` generated from model 'targetingSpecOperationMinimumAge'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationMinimumAge` (
  `field` text NOT NULL,
  `operation` text NOT NULL,
  `value` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationShoppingRetargeting` generated from model 'targetingSpecOperationShoppingRetargeting'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationShoppingRetargeting` (
  `field` text NOT NULL,
  `operation` text NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationShoppingRetargetingTargetingSpecShoppingRetargeting` generated from model 'TargetingSpecOperationShoppingRetargetingTargetingSpecShoppingRetargeting'

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationShoppingRetargetingTargetingSpecShoppingRetargeting` (
  `targetingSpecOperationShoppingRetargeting` long NOT NULL
  `targetingSpecShoppingRetargeting` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperations` generated from model 'targetingSpecOperations'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperations` (
  `field` text NOT NULL,
  `operation` text NOT NULL,
  `value` text NOT NULL
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationsTargetingSpecShoppingRetargeting` generated from model 'TargetingSpecOperationsTargetingSpecShoppingRetargeting'

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationsTargetingSpecShoppingRetargeting` (
  `targetingSpecOperations` long NOT NULL
  `targetingSpecShoppingRetargeting` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOptimal` generated from model 'targetingSpecOptimal'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOptimal` (
  `MAXIMUM_AGE` text /*Maximum age to target (inclusive). Values: \&quot;18\&quot;, \&quot;19\&quot;, ..., \&quot;65\&quot;, \&quot;65+\&quot;. Must be used together with &#x60;MINIMUM_AGE&#x60;. Cannot be combined with &#x60;AGE_BUCKET&#x60;. If neither &#x60;MINIMUM_AGE&#x60;/&#x60;MAXIMUM_AGE&#x60; nor &#x60;AGE_BUCKET&#x60; are specified, all ages will be targeted.*/,
  `MINIMUM_AGE` text /*Minimum age to target (inclusive). Values: \&quot;18\&quot;, \&quot;19\&quot;, ..., \&quot;65\&quot;. Note: 65+ is not allowed for minimum age. Must be used together with &#x60;MAXIMUM_AGE&#x60;. Cannot be combined with &#x60;AGE_BUCKET&#x60;. If neither &#x60;MINIMUM_AGE&#x60;/&#x60;MAXIMUM_AGE&#x60; nor &#x60;AGE_BUCKET&#x60; are specified, all ages will be targeted.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOptimalTargetingSpecAgeBucket` generated from model 'TargetingSpecOptimalTargetingSpecAgeBucket'

CREATE TABLE IF NOT EXISTS `TargetingSpecOptimalTargetingSpecAgeBucket` (
  `targetingSpecOptimal` long NOT NULL
  `targetingSpecAgeBucket` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOptimalTargetingSpecAppType` generated from model 'TargetingSpecOptimalTargetingSpecAppType'

CREATE TABLE IF NOT EXISTS `TargetingSpecOptimalTargetingSpecAppType` (
  `targetingSpecOptimal` long NOT NULL
  `targetingSpecAppType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOptimalAUDIENCEEXCLUDE` generated from model 'TargetingSpecOptimalAUDIENCEEXCLUDE'

CREATE TABLE IF NOT EXISTS `TargetingSpecOptimalAUDIENCEEXCLUDE` (
  `targetingSpecOptimal` long NOT NULL
  `aUDIENCEEXCLUDE` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOptimalAUDIENCEINCLUDE` generated from model 'TargetingSpecOptimalAUDIENCEINCLUDE'

CREATE TABLE IF NOT EXISTS `TargetingSpecOptimalAUDIENCEINCLUDE` (
  `targetingSpecOptimal` long NOT NULL
  `aUDIENCEINCLUDE` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOptimalTargetingSpecGender` generated from model 'TargetingSpecOptimalTargetingSpecGender'

CREATE TABLE IF NOT EXISTS `TargetingSpecOptimalTargetingSpecGender` (
  `targetingSpecOptimal` long NOT NULL
  `targetingSpecGender` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOptimalGEO` generated from model 'TargetingSpecOptimalGEO'

CREATE TABLE IF NOT EXISTS `TargetingSpecOptimalGEO` (
  `targetingSpecOptimal` long NOT NULL
  `gEO` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOptimalGEOEXCLUDE` generated from model 'TargetingSpecOptimalGEOEXCLUDE'

CREATE TABLE IF NOT EXISTS `TargetingSpecOptimalGEOEXCLUDE` (
  `targetingSpecOptimal` long NOT NULL
  `gEOEXCLUDE` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOptimalINTEREST` generated from model 'TargetingSpecOptimalINTEREST'

CREATE TABLE IF NOT EXISTS `TargetingSpecOptimalINTEREST` (
  `targetingSpecOptimal` long NOT NULL
  `iNTEREST` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOptimalLOCALE` generated from model 'TargetingSpecOptimalLOCALE'

CREATE TABLE IF NOT EXISTS `TargetingSpecOptimalLOCALE` (
  `targetingSpecOptimal` long NOT NULL
  `lOCALE` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOptimalLOCATION` generated from model 'TargetingSpecOptimalLOCATION'

CREATE TABLE IF NOT EXISTS `TargetingSpecOptimalLOCATION` (
  `targetingSpecOptimal` long NOT NULL
  `lOCATION` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOptimalLOCATIONEXCLUDE` generated from model 'TargetingSpecOptimalLOCATIONEXCLUDE'

CREATE TABLE IF NOT EXISTS `TargetingSpecOptimalLOCATIONEXCLUDE` (
  `targetingSpecOptimal` long NOT NULL
  `lOCATIONEXCLUDE` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOptimalTargetingSpecShoppingRetargeting` generated from model 'TargetingSpecOptimalTargetingSpecShoppingRetargeting'

CREATE TABLE IF NOT EXISTS `TargetingSpecOptimalTargetingSpecShoppingRetargeting` (
  `targetingSpecOptimal` long NOT NULL
  `targetingSpecShoppingRetargeting` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOptimalTargetingStrategy` generated from model 'TargetingSpecOptimalTargetingStrategy'

CREATE TABLE IF NOT EXISTS `TargetingSpecOptimalTargetingStrategy` (
  `targetingSpecOptimal` long NOT NULL
  `targetingStrategy` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecShoppingRetargeting` generated from model 'targetingSpecShoppingRetargeting'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecShoppingRetargeting` (
  `exclusion_window` int /*Number of days ago to stop lookback timeframe for dynamic retargeting*/,
  `lookback_window` int /*Number of days ago to start lookback timeframe for dynamic retargeting*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecShoppingRetargetingTagTypes` generated from model 'TargetingSpecShoppingRetargetingTagTypes'

CREATE TABLE IF NOT EXISTS `TargetingSpecShoppingRetargetingTagTypes` (
  `targetingSpecShoppingRetargeting` long NOT NULL
  `tagTypes` int NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingTemplate` generated from model 'targetingTemplate'
--

CREATE TABLE IF NOT EXISTS `TargetingTemplate` (
  `name` text NOT NULL /*targeting template name*/,
  `targeting_attributes` long NOT NULL /*targeting profile attributes*/,
  `ad_account_id` text /*The ID of the advertiser that this targeting template belongs to.*/,
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting).*/,
  `created_time` int /*Targeting template created time. Unix timestamp in seconds.*/,
  `id` text PRIMARY KEY /*Targeting template ID.*/,
  `placement_group` long,
  `sizing` long,
  `status` long /*Indicate targeting template is active or Deleted*/,
  `tracking_urls` long,
  `updated_time` int /*Targeting template updated time.Unix timestamp in seconds.*/,
  `valid` boolean /*Inform if the targeting template is valid (ex. would be false if has revoked audience)*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingTemplateTargetingTemplateKeyword` generated from model 'TargetingTemplateTargetingTemplateKeyword'

CREATE TABLE IF NOT EXISTS `TargetingTemplateTargetingTemplateKeyword` (
  `targetingTemplate` long NOT NULL
  `targetingTemplateKeyword` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingTemplateAudienceSizing` generated from model 'targetingTemplateAudienceSizing'
-- Gets an audience size estimate for a set of given targeting spec data. **Returns:** An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate.
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateAudienceSizing` (
  `reach_estimate` long
);  /*Gets an audience size estimate for a set of given targeting spec data. **Returns:** An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate.*/


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingTemplateAudienceSizingReachEstimate` generated from model 'targetingTemplateAudienceSizingReachEstimate'
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateAudienceSizingReachEstimate` (
  `estimate` long,
  `lower_bound` long,
  `upper_bound` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingTemplateCreate` generated from model 'targetingTemplateCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateCreate` (
  `name` text NOT NULL /*targeting template name*/,
  `targeting_attributes` long NOT NULL /*targeting profile attributes*/,
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting).*/,
  `placement_group` long,
  `tracking_urls` long
);  /*Resource create operation model.*/

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingTemplateCreateTargetingTemplateKeyword` generated from model 'TargetingTemplateCreateTargetingTemplateKeyword'

CREATE TABLE IF NOT EXISTS `TargetingTemplateCreateTargetingTemplateKeyword` (
  `targetingTemplateCreate` long NOT NULL
  `targetingTemplateKeyword` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingTemplateKeyword` generated from model 'targetingTemplateKeyword'
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateKeyword` (
  `match_type` long,
  `value` text /*The keyword targeting (120 chars max).*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `targeting_template_list_200_response` generated from model 'targetingTemplateList200Response'
--

CREATE TABLE IF NOT EXISTS `targeting_template_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingTemplateList200ResponseTargetingTemplate` generated from model 'TargetingTemplateList200ResponseTargetingTemplate'

CREATE TABLE IF NOT EXISTS `TargetingTemplateList200ResponseTargetingTemplate` (
  `targetingTemplateList200Response` long NOT NULL
  `targetingTemplate` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingTemplateUpdateRequestReadOrUpdate` generated from model 'targetingTemplateUpdateRequestReadOrUpdate'
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateUpdateRequestReadOrUpdate` (
  `id` text NOT NULL PRIMARY KEY /*Targeting template ID*/,
  `operation_type` long NOT NULL,
  `targeting_attributes` long /*targeting profile attributes*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TemplateBasedReport` generated from model 'templateBasedReport'
--

CREATE TABLE IF NOT EXISTS `TemplateBasedReport` (
  `report_status` long NOT NULL,
  `template_id` text NOT NULL /*Unique identifier of a template.*/,
  `message` text,
  `token` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TemplateBasedReportCreate` generated from model 'templateBasedReportCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `TemplateBasedReportCreate` (
  `report_status` long NOT NULL,
  `message` text,
  `token` text
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `templates_list_200_response` generated from model 'templatesList200Response'
--

CREATE TABLE IF NOT EXISTS `templates_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TemplatesList200ResponseAccountTemplate` generated from model 'TemplatesList200ResponseAccountTemplate'

CREATE TABLE IF NOT EXISTS `TemplatesList200ResponseAccountTemplate` (
  `templatesList200Response` long NOT NULL
  `accountTemplate` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TermsOfService` generated from model 'termsOfService'
-- The ID of the ad account.
--

CREATE TABLE IF NOT EXISTS `TermsOfService` (
  `ad_account_id` text /*The ID of the ad account.*/,
  `has_accepted` boolean /*Whether the ad account has accepted terms of service.*/,
  `html` text /*The terms of service content*/,
  `id` text PRIMARY KEY /*The ID of the terms of service*/
);  /*The ID of the ad account.*/


-- --------------------------------------------------------------------------
-- Table structure for table `TimeSeries` generated from model 'timeSeries'
--

CREATE TABLE IF NOT EXISTS `TimeSeries` (
  `date` date
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TitleKeywordsFilter` generated from model 'titleKeywordsFilter'
--

CREATE TABLE IF NOT EXISTS `TitleKeywordsFilter` (
  `TITLE_KEYWORDS` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TopPinsAnalyticsResponse` generated from model 'topPinsAnalyticsResponse'
--

CREATE TABLE IF NOT EXISTS `TopPinsAnalyticsResponse` (
  `date_availability` long,
  `sort_by` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TopPinsAnalyticsResponseTopPinsAnalyticsResponsePinsItems` generated from model 'TopPinsAnalyticsResponseTopPinsAnalyticsResponsePinsItems'

CREATE TABLE IF NOT EXISTS `TopPinsAnalyticsResponseTopPinsAnalyticsResponsePinsItems` (
  `topPinsAnalyticsResponse` long NOT NULL
  `topPinsAnalyticsResponsePinsItems` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TopPinsAnalyticsResponseDateAvailability` generated from model 'topPinsAnalyticsResponseDateAvailability'
--

CREATE TABLE IF NOT EXISTS `TopPinsAnalyticsResponseDateAvailability` (
  `is_realtime` boolean,
  `latest_available_timestamp` decimal
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TopPinsAnalyticsResponsePinsItems` generated from model 'topPinsAnalyticsResponsePinsItems'
-- Array with metrics, status, and pin id for the requested metric
--

CREATE TABLE IF NOT EXISTS `TopPinsAnalyticsResponsePinsItems` (
  `data_status` blob,
  `metrics` blob,
  `pin_id` text /*The pin id*/
);  /*Array with metrics, status, and pin id for the requested metric*/


-- --------------------------------------------------------------------------
-- Table structure for table `TopVideoPinsAnalyticsResponse` generated from model 'topVideoPinsAnalyticsResponse'
--

CREATE TABLE IF NOT EXISTS `TopVideoPinsAnalyticsResponse` (
  `date_availability` long,
  `sort_by` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TopVideoPinsAnalyticsResponseTopVideoPinsAnalyticsResponsePinsItems` generated from model 'TopVideoPinsAnalyticsResponseTopVideoPinsAnalyticsResponsePinsItems'

CREATE TABLE IF NOT EXISTS `TopVideoPinsAnalyticsResponseTopVideoPinsAnalyticsResponsePinsItems` (
  `topVideoPinsAnalyticsResponse` long NOT NULL
  `topVideoPinsAnalyticsResponsePinsItems` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TopVideoPinsAnalyticsResponseDateAvailability` generated from model 'topVideoPinsAnalyticsResponseDateAvailability'
--

CREATE TABLE IF NOT EXISTS `TopVideoPinsAnalyticsResponseDateAvailability` (
  `is_realtime` boolean,
  `latest_available_timestamp` decimal
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TopVideoPinsAnalyticsResponsePinsItems` generated from model 'topVideoPinsAnalyticsResponsePinsItems'
-- Array with metrics, status, and pin id for the requested metric
--

CREATE TABLE IF NOT EXISTS `TopVideoPinsAnalyticsResponsePinsItems` (
  `data_status` blob,
  `metrics` blob,
  `pin_id` text /*The pin id*/
);  /*Array with metrics, status, and pin id for the requested metric*/


-- --------------------------------------------------------------------------
-- Table structure for table `TotalCountByEntityStatus` generated from model 'totalCountByEntityStatus'
-- Breakdown of asset counts by entity status.
--

CREATE TABLE IF NOT EXISTS `TotalCountByEntityStatus` (
  `ACTIVE` int /*Count of ACTIVE assets*/,
  `ARCHIVED` int /*Count of ARCHIVED assets*/,
  `PAUSED` int /*Count of PAUSED assets*/
);  /*Breakdown of asset counts by entity status.*/


-- --------------------------------------------------------------------------
-- Table structure for table `TrackingUrls` generated from model 'trackingUrls'
--   Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).
--

CREATE TABLE IF NOT EXISTS `TrackingUrls` (
);  /*  Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).*/

-- --------------------------------------------------------------------------
-- Table structure for table `TrackingUrlsAudienceVerification` generated from model 'TrackingUrlsAudienceVerification'

CREATE TABLE IF NOT EXISTS `TrackingUrlsAudienceVerification` (
  `trackingUrls` long NOT NULL
  `audienceVerification` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TrackingUrlsBuyableButton` generated from model 'TrackingUrlsBuyableButton'

CREATE TABLE IF NOT EXISTS `TrackingUrlsBuyableButton` (
  `trackingUrls` long NOT NULL
  `buyableButton` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TrackingUrlsClick` generated from model 'TrackingUrlsClick'

CREATE TABLE IF NOT EXISTS `TrackingUrlsClick` (
  `trackingUrls` long NOT NULL
  `click` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TrackingUrlsEngagement` generated from model 'TrackingUrlsEngagement'

CREATE TABLE IF NOT EXISTS `TrackingUrlsEngagement` (
  `trackingUrls` long NOT NULL
  `engagement` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TrackingUrlsImpression` generated from model 'TrackingUrlsImpression'

CREATE TABLE IF NOT EXISTS `TrackingUrlsImpression` (
  `trackingUrls` long NOT NULL
  `impression` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TrendingKeyword` generated from model 'trendingKeyword'
--

CREATE TABLE IF NOT EXISTS `TrendingKeyword` (
  `demographics` long,
  `has_prediction` boolean /*Indicates whether the keyword has a prediction available for the next 90 days. This field is only applicable when &#x60;include_prediction&#x60; query parameter is set to &#x60;true&#x60;. By default, the value is &#x60;false&#x60; and no prediction data is included in the response.*/,
  `keyword` text /*The keyword that is trending.*/,
  `pct_growth_mom` int /*The month-over-month percent change in search volume for this keyword. For example, a value of \&quot;400\&quot; would represent a 400% increase in searches in the last 30 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced &gt; 10000% month-over-month growth.*/,
  `pct_growth_wow` int /*The week-over-week percent change in search volume for this keyword. For example, a value of \&quot;50\&quot; would represent a 50% increase in searches in the last seven days compared to the week prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced &gt; 10000% week-over-week growth.*/,
  `pct_growth_yoy` int /*The year-over-year percent change in search volume for this keyword. For example, a value of \&quot;-5\&quot; would represent a 5% decrease in searches in the last 365 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced &gt; 10000% year-over-year growth.*/,
  `predicted_time_series` long /*A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months. These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword. Similar to the historical &#x60;time_series&#x60;, normalization is applied independently to the predicted time series of each keyword, but the &#x60;normalize_against_group&#x60; query parameter can be used in cases where you wish to compare relative predicted volume between keywords.  **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of &#x60;2024-01-07&#x60; would include predicted searches for the week ending on &#x60;2024-01-07&#x60;.*/,
  `time_series` long /*A sequence of weekly observations of the relative search volume for this keyword over the past year. These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the &#x60;normalize_against_group&#x60; query parameter can be used in cases where you wish to compare relative volume between keywords.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of &#x60;2023-10-31&#x60; would include searches that happened between &#x60;2023-10-25&#x60; and &#x60;2023-10-31&#x60;.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TrendingKeywordDemographics` generated from model 'trendingKeywordDemographics'
-- A mapping of demographic dimensions (e.g. \&quot;gender\&quot;, \&quot;age\&quot;) to their category distributions. For each dimension: Key: The category (e.g., \&quot;female\&quot;, \&quot;18-24\&quot;). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when &#x60;include_demographics&#x60; query parameter is set to &#x60;true&#x60;.
--

CREATE TABLE IF NOT EXISTS `TrendingKeywordDemographics` (
  `age_distribution` long,
  `gender_distribution` long
);  /*A mapping of demographic dimensions (e.g. \&quot;gender\&quot;, \&quot;age\&quot;) to their category distributions. For each dimension: Key: The category (e.g., \&quot;female\&quot;, \&quot;18-24\&quot;). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when &#x60;include_demographics&#x60; query parameter is set to &#x60;true&#x60;.*/


-- --------------------------------------------------------------------------
-- Table structure for table `TrendingKeywordsResponse` generated from model 'trendingKeywordsResponse'
--

CREATE TABLE IF NOT EXISTS `TrendingKeywordsResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TrendingKeywordsResponseTrendingKeyword` generated from model 'TrendingKeywordsResponseTrendingKeyword'

CREATE TABLE IF NOT EXISTS `TrendingKeywordsResponseTrendingKeyword` (
  `trendingKeywordsResponse` long NOT NULL
  `trendingKeyword` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TrendingPin` generated from model 'trendingPin'
-- Pin image data for trending topics
--

CREATE TABLE IF NOT EXISTS `TrendingPin` (
  `color` text NOT NULL /*Dominant color of the pin image in hex format*/,
  `height` int NOT NULL /*Height of the pin image in pixels*/,
  `id` text NOT NULL PRIMARY KEY /*Unique identifier for the pin*/,
  `src` text NOT NULL /*URL of the pin image*/,
  `width` int NOT NULL /*Width of the pin image in pixels*/,
  `vertical_offset` double /*The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom.*/
);  /*Pin image data for trending topics*/


-- --------------------------------------------------------------------------
-- Table structure for table `TrendingProductCategory` generated from model 'trendingProductCategory'
-- Trending shopping product category
--

CREATE TABLE IF NOT EXISTS `TrendingProductCategory` (
  `engagement_type` long NOT NULL /*Engagement type*/,
  `pct_change_mom` int NOT NULL /*Month-over-month change percentage*/,
  `percent_relative_volume` int NOT NULL /*Relative volume percentage*/,
  `pinterest_product_category_id` int NOT NULL /*Pinterest Product Category Id*/,
  `product_category` text NOT NULL /*Product Category Name*/,
);  /*Trending shopping product category*/

-- --------------------------------------------------------------------------
-- Table structure for table `TrendingProductCategoryVerticals` generated from model 'TrendingProductCategoryVerticals'

CREATE TABLE IF NOT EXISTS `TrendingProductCategoryVerticals` (
  `trendingProductCategory` long NOT NULL
  `verticals` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TrendingTopic` generated from model 'trendingTopic'
-- Individual trending topic within an interest category
--

CREATE TABLE IF NOT EXISTS `TrendingTopic` (
  `description` text NOT NULL /*Description of the trending topic*/,
  `id` text NOT NULL PRIMARY KEY /*Unique identifier for the trending topic*/,
  `time_series` blob NOT NULL /*Time series data showing trend values over time, with dates as keys and values as numeric*/,
  `title` text NOT NULL /*Title of the trending topic*/,
  `percent_growth_mom` int /*Month-over-month growth percentage*/
);  /*Individual trending topic within an interest category*/

-- --------------------------------------------------------------------------
-- Table structure for table `TrendingTopicTrendingPin` generated from model 'TrendingTopicTrendingPin'

CREATE TABLE IF NOT EXISTS `TrendingTopicTrendingPin` (
  `trendingTopic` long NOT NULL
  `trendingPin` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TrendingTopicRelatedInterests` generated from model 'TrendingTopicRelatedInterests'

CREATE TABLE IF NOT EXISTS `TrendingTopicRelatedInterests` (
  `trendingTopic` long NOT NULL
  `relatedInterests` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TrendingTopicRelatedSearches` generated from model 'TrendingTopicRelatedSearches'

CREATE TABLE IF NOT EXISTS `TrendingTopicRelatedSearches` (
  `trendingTopic` long NOT NULL
  `relatedSearches` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TrendsAgeDistribution` generated from model 'trendsAgeDistribution'
-- This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
--

CREATE TABLE IF NOT EXISTS `TrendsAgeDistribution` (
  `age_distribution` long
);  /*This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.*/


-- --------------------------------------------------------------------------
-- Table structure for table `TrendsEditorial` generated from model 'trendsEditorial'
-- Information of the published editorial article.
--

CREATE TABLE IF NOT EXISTS `TrendsEditorial` (
  `board_url` text NOT NULL /*URL of the editorial board*/,
  `description` text NOT NULL /*Description of the editorial article*/,
  `title` text NOT NULL /*Title of the editorial article*/
);  /*Information of the published editorial article.*/

-- --------------------------------------------------------------------------
-- Table structure for table `TrendsEditorialInterests` generated from model 'TrendsEditorialInterests'

CREATE TABLE IF NOT EXISTS `TrendsEditorialInterests` (
  `trendsEditorial` long NOT NULL
  `interests` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TrendsEditorialPinsUrl` generated from model 'TrendsEditorialPinsUrl'

CREATE TABLE IF NOT EXISTS `TrendsEditorialPinsUrl` (
  `trendsEditorial` long NOT NULL
  `pinsUrl` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TrendsEditorialKeywordInfo` generated from model 'TrendsEditorialKeywordInfo'

CREATE TABLE IF NOT EXISTS `TrendsEditorialKeywordInfo` (
  `trendsEditorial` long NOT NULL
  `keywordInfo` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TrendsGenderDistribution` generated from model 'trendsGenderDistribution'
-- This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
--

CREATE TABLE IF NOT EXISTS `TrendsGenderDistribution` (
  `gender_distribution` long
);  /*This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.*/


-- --------------------------------------------------------------------------
-- Table structure for table `UpdatableItemAttributes` generated from model 'updatableItemAttributes'
--

CREATE TABLE IF NOT EXISTS `UpdatableItemAttributes` (
  `ad_image_0_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_0_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_10_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_10_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_11_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_11_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_12_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_12_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_13_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_13_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_14_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_14_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_15_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_15_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_16_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_16_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_17_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_17_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_18_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_18_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_19_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_19_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_1_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_1_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_2_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_2_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_3_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_3_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_4_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_4_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_5_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_5_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_6_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_6_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_7_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_7_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_8_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_8_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_image_9_link` text /*Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_image_9_tag` text /*Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.*/,
  `ad_link` text /*Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking. Must begin with http:// or https://.*/,
  `ad_video_0_link` text /*Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_video_0_tag` text /*Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.*/,
  `ad_video_1_link` text /*Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_video_1_tag` text /*Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.*/,
  `ad_video_2_link` text /*Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://*/,
  `ad_video_2_tag` text /*Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.*/,
  `adult` boolean /*Set this attribute to TRUE if you&#39;re submitting items that are considered \&quot;adult\&quot;. These will not be shown on Pinterest.*/,
  `age_group` text /*The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): &#39;newborn&#39;, &#39;infant&#39;, &#39;toddler&#39;, &#39;kids&#39;, or &#39;adult&#39;.*/,
  `android_deep_link` text /*The deep link to the product on the Android app.*/,
  `availability` text /*The availability of the product. Must be one of the following values (upper or lowercased): &#39;in stock&#39;, &#39;out of stock&#39;, &#39;preorder&#39;.*/,
  `average_review_rating` decimal /*Average reviews for the item. Can be a number from 1-5.*/,
  `brand` text /*The brand of the product.*/,
  `checkout_enabled` boolean /*This attribute is not supported anymore.*/,
  `color` text /*The primary color of the product.*/,
  `condition` text /*The condition of the product. Must be one of the following values (upper or lowercased): &#39;new&#39;, &#39;used&#39;, or &#39;refurbished&#39;.*/,
  `custom_label_0` text /*&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.*/,
  `custom_label_1` text /*&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.*/,
  `custom_label_2` text /*&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.*/,
  `custom_label_3` text /*&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.*/,
  `custom_label_4` text /*&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs. Custom grouping of products.*/,
  `custom_number_0` int /*An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_1` int /*An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_2` int /*An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_3` int /*An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_4` int /*An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `description` text /*&lt;&#x3D; 10000 characters. The description of the product.*/,
  `free_shipping_label` boolean /*The item is free to ship.*/,
  `free_shipping_limit` text /*The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.*/,
  `gender` text /*The gender associated with the product. Must be one of the following values (upper or lowercased): &#39;male&#39;, &#39;female&#39;, or &#39;unisex&#39;.*/,
  `google_product_category` text /*The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.*/,
  `gtin` long,
  `id` text PRIMARY KEY /*&lt;&#x3D; 127 characters. The user-created unique ID that represents the product. Only Unicode characters are accepted.*/,
  `installment_price` text /*Installment price of the product. Expected format: &lt;payment_count&gt;:&lt;payment_amount&gt; &lt;currency&gt;*/,
  `ios_deep_link` text /*The deep link to the product on the iOS app.*/,
  `item_group_id` text /*&lt;&#x3D; 127 characters. The parent ID of the product.*/,
  `last_updated_time` long /*The millisecond timestamp when the item was lastly modified by the merchant.*/,
  `link` text /*&lt;&#x3D; 511 characters. The landing page for the product.*/,
  `material` text /*The material used to make the product.*/,
  `min_ad_price` text /*The minimum advertised price of the product. It supports the following formats: \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.*/,
  `mobile_link` text /*The mobile-optimized version of your landing page. Must begin with http:// or https://.*/,
  `mpn` text /*Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.*/,
  `number_of_ratings` int /*The number of ratings for the item.*/,
  `number_of_reviews` int /*The number of reviews available for the item.*/,
  `pattern` text /*The description of the pattern used for the product.*/,
  `price` text /*The price of the product. It supports the following formats: \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.*/,
  `product_type` text /*&lt;&#x3D; 1000 characters. The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by \&quot; &gt; \&quot;.*/,
  `promotion_id` text /*A unique identifier referencing the promotion associated with this catalog item.*/,
  `sale_price` text /*The discounted price of the product. The sale_price must be lower than the price. It supports the following formats: \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;.*/,
  `sale_price_effective_date` text /*Sale price effective date. Expected format: &lt;start_date&gt;/&lt;end_date&gt; (ISO 8601 format)*/,
  `shipping` text /*Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.*/,
  `shipping_height` text /*The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.*/,
  `shipping_weight` text /*The weight of the product. Ensure there is a space between the numeric string and the metric.*/,
  `shipping_width` text /*The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.*/,
  `size` text /*The size of the product.*/,
  `size_system` text /*Indicates the country&#39;s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): &#39;US&#39;, &#39;UK&#39;, &#39;EU&#39;, &#39;DE&#39;, &#39;FR&#39;, &#39;JP&#39;, &#39;CN&#39;, &#39;IT&#39;, &#39;BR&#39;, &#39;MEX&#39;, or &#39;AU&#39;.*/,
  `size_type` text /*Additional description for the size. Must be one of the following values (upper or lowercased): &#39;regular&#39;, &#39;petite&#39;, &#39;plus&#39;, &#39;big_and_tall&#39;, or &#39;maternity&#39;.*/,
  `tax` text /*Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.*/,
  `title` text /*&lt;&#x3D; 500 characters. The name of the product.*/,
  `unit_pricing_base_measure` text /*Unit pricing base measure of the product. Expected format: &lt;base_measure&gt; &lt;unit_type&gt;*/,
  `unit_pricing_measure` text /*Unit pricing total measure of the product. Expected format: &lt;total_units&gt; &lt;unit_type&gt;*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UpdatableItemAttributesVariantNames` generated from model 'UpdatableItemAttributesVariantNames'

CREATE TABLE IF NOT EXISTS `UpdatableItemAttributesVariantNames` (
  `updatableItemAttributes` long NOT NULL
  `variantNames` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `UpdatableItemAttributesVariantValues` generated from model 'UpdatableItemAttributesVariantValues'

CREATE TABLE IF NOT EXISTS `UpdatableItemAttributesVariantValues` (
  `updatableItemAttributes` long NOT NULL
  `variantValues` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateBusinessMembershipsResponse` generated from model 'updateBusinessMembershipsResponse'
--

CREATE TABLE IF NOT EXISTS `UpdateBusinessMembershipsResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateBusinessMembershipsResponseBusinessMembershipMember` generated from model 'UpdateBusinessMembershipsResponseBusinessMembershipMember'

CREATE TABLE IF NOT EXISTS `UpdateBusinessMembershipsResponseBusinessMembershipMember` (
  `updateBusinessMembershipsResponse` long NOT NULL
  `businessMembershipMember` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateInvitesResultsResponseArray` generated from model 'updateInvitesResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `UpdateInvitesResultsResponseArray` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateInvitesResultsResponseArrayInviteActionResultItem` generated from model 'UpdateInvitesResultsResponseArrayInviteActionResultItem'

CREATE TABLE IF NOT EXISTS `UpdateInvitesResultsResponseArrayInviteActionResultItem` (
  `updateInvitesResultsResponseArray` long NOT NULL
  `inviteActionResultItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMemberAssetAccessBody` generated from model 'updateMemberAssetAccessBody'
-- An object with a list of all the new member asset accesses.
--

CREATE TABLE IF NOT EXISTS `UpdateMemberAssetAccessBody` (
);  /*An object with a list of all the new member asset accesses.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMemberAssetAccessBodyUpdateMemberAssetAccessItem` generated from model 'UpdateMemberAssetAccessBodyUpdateMemberAssetAccessItem'

CREATE TABLE IF NOT EXISTS `UpdateMemberAssetAccessBodyUpdateMemberAssetAccessItem` (
  `updateMemberAssetAccessBody` long NOT NULL
  `updateMemberAssetAccessItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMemberAssetAccessItem` generated from model 'updateMemberAssetAccessItem'
--

CREATE TABLE IF NOT EXISTS `UpdateMemberAssetAccessItem` (
  `asset_id` text NOT NULL /*Id of the asset to update.*/,
  `member_id` text NOT NULL /*Unique identifier of the member on which to perform the update*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMemberAssetAccessItemPermissions` generated from model 'UpdateMemberAssetAccessItemPermissions'

CREATE TABLE IF NOT EXISTS `UpdateMemberAssetAccessItemPermissions` (
  `updateMemberAssetAccessItem` long NOT NULL
  `permissions` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMemberAssetResultItem` generated from model 'updateMemberAssetResultItem'
--

CREATE TABLE IF NOT EXISTS `UpdateMemberAssetResultItem` (
  `response` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMemberAssetsResultsResponseArray` generated from model 'updateMemberAssetsResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `UpdateMemberAssetsResultsResponseArray` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMemberAssetsResultsResponseArrayUpdateMemberAssetResultItem` generated from model 'UpdateMemberAssetsResultsResponseArrayUpdateMemberAssetResultItem'

CREATE TABLE IF NOT EXISTS `UpdateMemberAssetsResultsResponseArrayUpdateMemberAssetResultItem` (
  `updateMemberAssetsResultsResponseArray` long NOT NULL
  `updateMemberAssetResultItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePartnerAssetAccessBody` generated from model 'updatePartnerAssetAccessBody'
-- An object with a list of partner asset accesses to assign or update.
--

CREATE TABLE IF NOT EXISTS `UpdatePartnerAssetAccessBody` (
);  /*An object with a list of partner asset accesses to assign or update.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePartnerAssetAccessBodyUpdatePartnerAssetAccessItem` generated from model 'UpdatePartnerAssetAccessBodyUpdatePartnerAssetAccessItem'

CREATE TABLE IF NOT EXISTS `UpdatePartnerAssetAccessBodyUpdatePartnerAssetAccessItem` (
  `updatePartnerAssetAccessBody` long NOT NULL
  `updatePartnerAssetAccessItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePartnerAssetAccessItem` generated from model 'updatePartnerAssetAccessItem'
--

CREATE TABLE IF NOT EXISTS `UpdatePartnerAssetAccessItem` (
  `asset_id` text NOT NULL /*Unique identifier of the business asset.*/,
  `partner_id` text NOT NULL /*Unique identifier of a business partner to update asset access to.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePartnerAssetAccessItemPermissions` generated from model 'UpdatePartnerAssetAccessItemPermissions'

CREATE TABLE IF NOT EXISTS `UpdatePartnerAssetAccessItemPermissions` (
  `updatePartnerAssetAccessItem` long NOT NULL
  `permissions` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePartnerAssetsResult` generated from model 'updatePartnerAssetsResult'
-- An object containing the permissions a business partner has on the asset.
--

CREATE TABLE IF NOT EXISTS `UpdatePartnerAssetsResult` (
  `asset_id` text /*Unique identifier of a business asset.*/,
  `asset_type` long,
  `partner_id` text /*Unique identifier of a business partner.*/,
);  /*An object containing the permissions a business partner has on the asset.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePartnerAssetsResultPermissions` generated from model 'UpdatePartnerAssetsResultPermissions'

CREATE TABLE IF NOT EXISTS `UpdatePartnerAssetsResultPermissions` (
  `updatePartnerAssetsResult` long NOT NULL
  `permissions` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePartnerAssetsResultsResponseArray` generated from model 'updatePartnerAssetsResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `UpdatePartnerAssetsResultsResponseArray` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePartnerAssetsResultsResponseArrayUpdatePartnerAssetsResult` generated from model 'UpdatePartnerAssetsResultsResponseArrayUpdatePartnerAssetsResult'

CREATE TABLE IF NOT EXISTS `UpdatePartnerAssetsResultsResponseArrayUpdatePartnerAssetsResult` (
  `updatePartnerAssetsResultsResponseArray` long NOT NULL
  `updatePartnerAssetsResult` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `user_account_followed_interests_200_response` generated from model 'userAccountFollowedInterests200Response'
--

CREATE TABLE IF NOT EXISTS `user_account_followed_interests_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UserAccountFollowedInterests200ResponseInterest` generated from model 'UserAccountFollowedInterests200ResponseInterest'

CREATE TABLE IF NOT EXISTS `UserAccountFollowedInterests200ResponseInterest` (
  `userAccountFollowedInterests200Response` long NOT NULL
  `interest` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UserBusinessRoleBinding` generated from model 'userBusinessRoleBinding'
--

CREATE TABLE IF NOT EXISTS `UserBusinessRoleBinding` (
  `assets_summary` long /*Ad accounts and profiles the business member/partner has access to.*/,
  `created_by_business` long /*Metadata for the business that created the business relationship.*/,
  `created_by_user` long /*Metadata for the user that created the business relationship.*/,
  `created_time` int /*The time the business relationship was created. Returned in milliseconds.*/,
  `id` text PRIMARY KEY /*Unique identifier of the business member/business partner/employer.*/,
  `is_shared_partner` boolean /*This field is only relevant when business_role&#x3D;\&quot;PARTNER\&quot;. If is_shared_partner&#x3D;FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. If is_shared_partner&#x3D;TRUE, you can access the partner&#39;s business asset. If assets_summary is not empty, the assets listed are the partner&#39;s business assets you have access to.*/,
  `user` long /*Metadata for the business member/business partner/employer.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UserBusinessRoleBindingBusinessRoles` generated from model 'UserBusinessRoleBindingBusinessRoles'

CREATE TABLE IF NOT EXISTS `UserBusinessRoleBindingBusinessRoles` (
  `userBusinessRoleBinding` long NOT NULL
  `businessRoles` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UserSingleAssetBinding` generated from model 'userSingleAssetBinding'
-- An object containing the permissions a business member/partner has on the asset.
--

CREATE TABLE IF NOT EXISTS `UserSingleAssetBinding` (
  `user` long
);  /*An object containing the permissions a business member/partner has on the asset.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UserSingleAssetBindingPermissions` generated from model 'UserSingleAssetBindingPermissions'

CREATE TABLE IF NOT EXISTS `UserSingleAssetBindingPermissions` (
  `userSingleAssetBinding` long NOT NULL
  `permissions` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UserWebsite` generated from model 'userWebsite'
--

CREATE TABLE IF NOT EXISTS `UserWebsite` (
  `status` text /*Status of the verification process*/,
  `verified_at` text /*UTC timestamp when the verification happened - sometimes missing*/,
  `website` text /*Website with path or domain only*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `UserWebsiteCreate` generated from model 'userWebsiteCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `UserWebsiteCreate` (
  `verification_method` long /*Method used to verify website ownership.*/,
  `website` text /*Website with path or domain only*/
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `UserWebsiteVerification` generated from model 'userWebsiteVerification'
--

CREATE TABLE IF NOT EXISTS `UserWebsiteVerification` (
  `dns_txt_record` text /*DNS TXT record to check against for the website to be claimed*/,
  `file_content` text /*A full html file to upload to the website in order for it to be claimed*/,
  `filename` text /*File expected to find on the website being claimed*/,
  `metatag` text /*Metatag the verification process searchs for the website to be claimed*/,
  `verification_code` text /*Code to check against the user claiming the website*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `user_websites_get_200_response` generated from model 'userWebsitesGet200Response'
--

CREATE TABLE IF NOT EXISTS `user_websites_get_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UserWebsitesGet200ResponseUserWebsite` generated from model 'UserWebsitesGet200ResponseUserWebsite'

CREATE TABLE IF NOT EXISTS `UserWebsitesGet200ResponseUserWebsite` (
  `userWebsitesGet200Response` long NOT NULL
  `userWebsite` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UsersForIndividualAssetResponse` generated from model 'usersForIndividualAssetResponse'
-- An object containing the permissions a business member has on the asset.
--

CREATE TABLE IF NOT EXISTS `UsersForIndividualAssetResponse` (
  `asset_id` text /*Unique identifier of a business asset.*/,
  `member_id` text /*Unique identifier of the business member with asset access.*/,
);  /*An object containing the permissions a business member has on the asset.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UsersForIndividualAssetResponsePermissions` generated from model 'UsersForIndividualAssetResponsePermissions'

CREATE TABLE IF NOT EXISTS `UsersForIndividualAssetResponsePermissions` (
  `usersForIndividualAssetResponse` long NOT NULL
  `permissions` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `VideoMetadataWithItemType` generated from model 'videoMetadataWithItemType'
--

CREATE TABLE IF NOT EXISTS `VideoMetadataWithItemType` (
  `item_type` text NOT NULL /*Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload.*/,
  `cover_image_url` text,
  `duration` decimal /*Duration (in miliseconds). Field maybe null after creation due to video processing time.*/,
  `height` int /*Height (in pixels). Field maybe null after creation due to video processing time.*/,
  `video_url` text /*Video url (720p).  **Note:** This field is limited and not available to all apps.*/,
  `video_url_hls` text /*Video url (HLS).  **Note:** This field is limited and not available to all apps.*/,
  `width` int /*Width (in pixels). Field maybe null after creation due to video processing time.*/
); 


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
);

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
);

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
);

--
-- Table structure for table `oauth_refresh_tokens`
--
CREATE TABLE IF NOT EXISTS `oauth_refresh_tokens` (
  `refresh_token`       VARCHAR(40)    NOT NULL,
  `client_id`           VARCHAR(80)    DEFAULT NULL,
  `user_id`             VARCHAR(80)    DEFAULT NULL,
  `expires`             TIMESTAMP      DEFAULT CURRENT_TIMESTAMP,
  `scope`               VARCHAR(4000)  DEFAULT NULL,
  PRIMARY KEY (`refresh_token`)
);

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
);

--
-- Table structure for table `oauth_scopes`
--
CREATE TABLE IF NOT EXISTS `oauth_scopes` (
  `scope`               VARCHAR(80)  NOT NULL,
  `is_default`          TINYINT(1)   DEFAULT NULL,
  PRIMARY KEY (`scope`)
);

--
-- Table structure for table `oauth_jwt`
--
CREATE TABLE IF NOT EXISTS `oauth_jwt` (
  `client_id`           VARCHAR(80)    NOT NULL,
  `subject`             VARCHAR(80)    DEFAULT NULL,
  `public_key`          VARCHAR(2000)  NOT NULL
);

--
-- Table structure for table `oauth_jti`
--
CREATE TABLE IF NOT EXISTS `oauth_jti` (
  `issuer`              VARCHAR(80)    NOT NULL,
  `subject`             VARCHAR(80)    DEFAULT NULL,
  `audience`            VARCHAR(80)    DEFAULT NULL,
  `expires`             TIMESTAMP      NOT NULL,
  `jti`                 VARCHAR(2000)  NOT NULL
);

--
-- Table structure for table `oauth_public_keys`
--
CREATE TABLE IF NOT EXISTS `oauth_public_keys` (
  `client_id`            VARCHAR(80)    DEFAULT NULL,
  `public_key`           VARCHAR(2000)  DEFAULT NULL,
  `private_key`          VARCHAR(2000)  DEFAULT NULL,
  `encryption_algorithm` VARCHAR(100)   DEFAULT 'RS256'
);

--
-- Table structure for table `_db_version`
--
CREATE TABLE IF NOT EXISTS `_db_version` (
  `version`    LONG    DEFAULT 1
);
