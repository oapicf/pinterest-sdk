

-- --------------------------------------------------------------------------
-- Table structure for table `Account` generated from model 'account'
--

CREATE TABLE IF NOT EXISTS `Account` (
  `about` text /*Profile about description.*/,
  `account_type` text /*Type of account*/,
  `board_count` int /*User account board count.&lt;br/&gt;**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.*/,
  `business_name` text,
  `follower_count` int /*User account follower count.*/,
  `following_count` int /*User account following count.*/,
  `id` text PRIMARY KEY /*User account ID.*/,
  `monthly_views` int /*User account monthly views.*/,
  `pin_count` int /*User account pin count. This includes both created and saved pins.*/,
  `profile_image` text,
  `username` text,
  `website_url` text
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
  `updated_time` int
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountBusinessAccessRole` generated from model 'AdAccountBusinessAccessRole'

CREATE TABLE IF NOT EXISTS `AdAccountBusinessAccessRole` (
  `adAccount` long NOT NULL
  `businessAccessRole` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountAnalyticsResponse_inner` generated from model 'adAccountAnalyticsResponseInner'
--

CREATE TABLE IF NOT EXISTS `AdAccountAnalyticsResponse_inner` (
  `AD_ACCOUNT_ID` text NOT NULL /*The ID of the advertiser that this metrics belongs to.*/,
  `DATE` date /*Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountCreate` generated from model 'adAccountCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `AdAccountCreate` (
  `country` long,
  `currency` long,
  `name` text /*Ad account name.*/,
  `owner_user_id` text /*Advertiser&#39;s owning user ID.*/
);  /*Resource create operation model.*/


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountCreateSubscriptionRequest` generated from model 'adAccountCreateSubscriptionRequest'
--

CREATE TABLE IF NOT EXISTS `AdAccountCreateSubscriptionRequest` (
  `webhook_url` text NOT NULL /*Standard HTTPS webhook URL.*/,
  `lead_form_id` text /*Lead form ID.*/,
  `partner_access_token` text /*Partner access token. Only for clients that requires authentication. We recommend to avoid this param.*/,
  `partner_metadata` long,
  `partner_refresh_token` text /*Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountCreateSubscriptionRequest_partner_metadata` generated from model 'adAccountCreateSubscriptionRequestPartnerMetadata'
-- Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
--

CREATE TABLE IF NOT EXISTS `AdAccountCreateSubscriptionRequest_partner_metadata` (
  `subscriber_key` text /*Text field value that uniquely identifies a subscriber.*/
);  /*Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.*/


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountCreateSubscriptionResponse` generated from model 'adAccountCreateSubscriptionResponse'
--

CREATE TABLE IF NOT EXISTS `AdAccountCreateSubscriptionResponse` (
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
-- Table structure for table `AdAccountGetSubscriptionResponse` generated from model 'adAccountGetSubscriptionResponse'
--

CREATE TABLE IF NOT EXISTS `AdAccountGetSubscriptionResponse` (
  `lead_form_id` text /*Lead form ID.*/,
  `webhook_url` text /*Standard HTTPS webhook URL.*/,
  `ad_account_id` text /*The Ad Account ID that this lead form belongs to.*/,
  `api_version` text /*API version.*/,
  `created_time` int /*Lead subscription creation time. Unix timestamp in milliseconds.*/,
  `cryptographic_algorithm` text /*Lead data encryption algorithm.*/,
  `cryptographic_key` text /*Base64 encoded key for client to decrypt lead data.*/,
  `id` text PRIMARY KEY /*Subscription ID.*/,
  `user_account_id` text /*User account used to subscribe lead data.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountOwner` generated from model 'adAccountOwner'
--

CREATE TABLE IF NOT EXISTS `AdAccountOwner` (
  `id` text PRIMARY KEY /*The owning account&#39;s user ID.*/,
  `username` text /*Public username for the user account*/
); 


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
-- Table structure for table `AdAccountsCountryResponse` generated from model 'adAccountsCountryResponse'
--

CREATE TABLE IF NOT EXISTS `AdAccountsCountryResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountsCountryResponseAdAccountsCountryResponseData` generated from model 'AdAccountsCountryResponseAdAccountsCountryResponseData'

CREATE TABLE IF NOT EXISTS `AdAccountsCountryResponseAdAccountsCountryResponseData` (
  `adAccountsCountryResponse` long NOT NULL
  `adAccountsCountryResponseData` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountsCountryResponseData` generated from model 'adAccountsCountryResponseData'
--

CREATE TABLE IF NOT EXISTS `AdAccountsCountryResponseData` (
  `code` long,
  `currency` text /*Country currency.*/,
  `index` decimal /*Country index*/,
  `name` text /*Country name*/
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
-- Table structure for table `AdArrayResponse` generated from model 'adArrayResponse'
--

CREATE TABLE IF NOT EXISTS `AdArrayResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdArrayResponseAdArrayResponseElement` generated from model 'AdArrayResponseAdArrayResponseElement'

CREATE TABLE IF NOT EXISTS `AdArrayResponseAdArrayResponseElement` (
  `adArrayResponse` long NOT NULL
  `adArrayResponseElement` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdArrayResponseElement` generated from model 'adArrayResponseElement'
--

CREATE TABLE IF NOT EXISTS `AdArrayResponseElement` (
  `data` long,
  `exceptions` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdCommon` generated from model 'adCommon'
-- Creation fields
--

CREATE TABLE IF NOT EXISTS `AdCommon` (
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
  `is_pin_deleted` boolean /*Is original pin deleted?*/,
  `is_removable` boolean /*Is pin repinnable?*/,
  `lead_form_id` text /*Lead form ID for lead ad generation.*/,
  `name` text /*Name of the ad - 255 chars max.*/,
  `quiz_pin_data` long /*Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.*/,
  `status` long,
  `tracking_urls` long,
  `view_tracking_url` text /*Tracking URL for ad impressions.*/
);  /*Creation fields*/

-- --------------------------------------------------------------------------
-- Table structure for table `AdCommonCarouselAndroidDeepLinks` generated from model 'AdCommonCarouselAndroidDeepLinks'

CREATE TABLE IF NOT EXISTS `AdCommonCarouselAndroidDeepLinks` (
  `adCommon` long NOT NULL
  `carouselAndroidDeepLinks` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdCommonCarouselDestinationUrls` generated from model 'AdCommonCarouselDestinationUrls'

CREATE TABLE IF NOT EXISTS `AdCommonCarouselDestinationUrls` (
  `adCommon` long NOT NULL
  `carouselDestinationUrls` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdCommonCarouselIosDeepLinks` generated from model 'AdCommonCarouselIosDeepLinks'

CREATE TABLE IF NOT EXISTS `AdCommonCarouselIosDeepLinks` (
  `adCommon` long NOT NULL
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
  `is_pin_deleted` boolean /*Is original pin deleted?*/,
  `is_removable` boolean /*Is pin repinnable?*/,
  `lead_form_id` text /*Lead form ID for lead ad generation.*/,
  `name` text /*Name of the ad - 255 chars max.*/,
  `quiz_pin_data` long /*Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.*/,
  `status` long,
  `tracking_urls` long,
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
-- Table structure for table `AdGroupArrayResponse` generated from model 'adGroupArrayResponse'
--

CREATE TABLE IF NOT EXISTS `AdGroupArrayResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupArrayResponseAdGroupArrayResponseElement` generated from model 'AdGroupArrayResponseAdGroupArrayResponseElement'

CREATE TABLE IF NOT EXISTS `AdGroupArrayResponseAdGroupArrayResponseElement` (
  `adGroupArrayResponse` long NOT NULL
  `adGroupArrayResponseElement` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupArrayResponseElement` generated from model 'adGroupArrayResponseElement'
--

CREATE TABLE IF NOT EXISTS `AdGroupArrayResponseElement` (
  `data` long,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupArrayResponseElementException` generated from model 'AdGroupArrayResponseElementException'

CREATE TABLE IF NOT EXISTS `AdGroupArrayResponseElementException` (
  `adGroupArrayResponseElement` long NOT NULL
  `exception` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupAudienceSizingRequest` generated from model 'adGroupAudienceSizingRequest'
--

CREATE TABLE IF NOT EXISTS `AdGroupAudienceSizingRequest` (
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;Pinterest Performance+ targeting\&quot;&lt;/a&gt;.*/,
  `placement_group` long /*&lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.*/,
  `targeting_spec` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupAudienceSizingRequestCreativeTypes` generated from model 'AdGroupAudienceSizingRequestCreativeTypes'

CREATE TABLE IF NOT EXISTS `AdGroupAudienceSizingRequestCreativeTypes` (
  `adGroupAudienceSizingRequest` long NOT NULL
  `creativeTypes` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupAudienceSizingRequestAdGroupAudienceSizingRequestKeywordsInner` generated from model 'AdGroupAudienceSizingRequestAdGroupAudienceSizingRequestKeywordsInner'

CREATE TABLE IF NOT EXISTS `AdGroupAudienceSizingRequestAdGroupAudienceSizingRequestKeywordsInner` (
  `adGroupAudienceSizingRequest` long NOT NULL
  `adGroupAudienceSizingRequestKeywordsInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupAudienceSizingRequestProductGroupIds` generated from model 'AdGroupAudienceSizingRequestProductGroupIds'

CREATE TABLE IF NOT EXISTS `AdGroupAudienceSizingRequestProductGroupIds` (
  `adGroupAudienceSizingRequest` long NOT NULL
  `productGroupIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupAudienceSizingRequest_keywords_inner` generated from model 'adGroupAudienceSizingRequestKeywordsInner'
--

CREATE TABLE IF NOT EXISTS `AdGroupAudienceSizingRequest_keywords_inner` (
  `match_type` long NOT NULL,
  `value` text NOT NULL /*Keyword value (120 chars max).*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupAudienceSizingResponse` generated from model 'adGroupAudienceSizingResponse'
--

CREATE TABLE IF NOT EXISTS `AdGroupAudienceSizingResponse` (
  `audience_size_lower_bound` decimal /*The lower confidence bound of the estimated potential audience size. \&quot;Potential audience size\&quot; estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.*/,
  `audience_size_upper_bound` decimal /*The upper confidence bound of the estimated potential audience size. \&quot;Potential audience size\&quot; estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupCommon` generated from model 'adGroupCommon'
--

CREATE TABLE IF NOT EXISTS `AdGroupCommon` (
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;Pinterest Performance+ targeting\&quot;&lt;/a&gt;.*/,
  `bid_in_micro_currency` int /*Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.*/,
  `bid_strategy_type` text /*Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \&quot;Pinterest Performance+ bidding\&quot;.*/,
  `billable_event` long,
  `budget_in_micro_currency` int /*Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.*/,
  `budget_type` long,
  `campaign_id` text /*Campaign ID of the ad group.*/,
  `end_time` int /*Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.*/,
  `is_creative_optimization` boolean /*Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.*/,
  `lifetime_frequency_cap` int /*Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.*/,
  `name` text /*Ad group name.*/,
  `optimization_goal_metadata` long /*Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.*/,
  `pacing_delivery_type` long,
  `placement_group` long /*&lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.*/,
  `promotion_application_level` text /*Specify if the promotion is applied at ad group or item level*/,
  `promotion_id` text /*Promotion ID. To clear this field, set to null.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.*/,
  `status` long /*Ad group/entity status.*/,
  `targeting_spec` long,
  `tracking_urls` long /*Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupCommonTargetingTemplateIds` generated from model 'AdGroupCommonTargetingTemplateIds'

CREATE TABLE IF NOT EXISTS `AdGroupCommonTargetingTemplateIds` (
  `adGroupCommon` long NOT NULL
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
  `bid_in_micro_currency` int /*Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.*/,
  `bid_strategy_type` text /*Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \&quot;Pinterest Performance+ bidding\&quot;.*/,
  `budget_in_micro_currency` int /*Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.*/,
  `budget_type` long,
  `end_time` int /*Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.*/,
  `is_creative_optimization` boolean /*Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.*/,
  `lifetime_frequency_cap` int /*Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.*/,
  `optimization_goal_metadata` long /*Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.*/,
  `pacing_delivery_type` long,
  `placement_group` long /*&lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.*/,
  `promotion_application_level` text /*Specify if the promotion is applied at ad group or item level*/,
  `promotion_id` text /*Promotion ID. To clear this field, set to null.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.*/,
  `status` long /*Ad group/entity status.*/,
  `targeting_spec` long,
  `tracking_urls` long /*Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.*/,
  `bid_multiplier` decimal /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupCreateRequestTargetingTemplateIds` generated from model 'AdGroupCreateRequestTargetingTemplateIds'

CREATE TABLE IF NOT EXISTS `AdGroupCreateRequestTargetingTemplateIds` (
  `adGroupCreateRequest` long NOT NULL
  `targetingTemplateIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupIdFilter` generated from model 'adGroupIdFilter'
--

CREATE TABLE IF NOT EXISTS `AdGroupIdFilter` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupIdFilterAdGroupIds` generated from model 'AdGroupIdFilterAdGroupIds'

CREATE TABLE IF NOT EXISTS `AdGroupIdFilterAdGroupIds` (
  `adGroupIdFilter` long NOT NULL
  `adGroupIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupResponse` generated from model 'adGroupResponse'
--

CREATE TABLE IF NOT EXISTS `AdGroupResponse` (
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;Pinterest Performance+ targeting\&quot;&lt;/a&gt;.*/,
  `bid_in_micro_currency` int /*Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.*/,
  `bid_strategy_type` text /*Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \&quot;Pinterest Performance+ bidding\&quot;.*/,
  `billable_event` long,
  `budget_in_micro_currency` int /*Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.*/,
  `budget_type` long,
  `campaign_id` text /*Campaign ID of the ad group.*/,
  `end_time` int /*Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.*/,
  `is_creative_optimization` boolean /*Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.*/,
  `lifetime_frequency_cap` int /*Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.*/,
  `name` text /*Ad group name.*/,
  `optimization_goal_metadata` long /*Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.*/,
  `pacing_delivery_type` long,
  `placement_group` long /*&lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.*/,
  `promotion_application_level` text /*Specify if the promotion is applied at ad group or item level*/,
  `promotion_id` text /*Promotion ID. To clear this field, set to null.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.*/,
  `status` long /*Ad group/entity status.*/,
  `targeting_spec` long,
  `tracking_urls` long /*Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.*/,
  `ad_account_id` text /*Advertiser ID.*/,
  `bid_multiplier` decimal /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;.*/,
  `conversion_learning_mode_type` text /*oCPM learn mode*/,
  `created_time` int /*Ad group creation time. Unix timestamp in seconds.*/,
  `dca_assets` blob /*[DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.*/,
  `feed_profile_id` text /*Feed Profile ID associated to the adgroup.*/,
  `id` text PRIMARY KEY /*Ad group ID.*/,
  `summary_status` long /*Ad group summary status.*/,
  `type` text /*Always \&quot;adgroup\&quot;.*/,
  `updated_time` int /*Ad group last update time. Unix timestamp in seconds.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupResponseTargetingTemplateIds` generated from model 'AdGroupResponseTargetingTemplateIds'

CREATE TABLE IF NOT EXISTS `AdGroupResponseTargetingTemplateIds` (
  `adGroupResponse` long NOT NULL
  `targetingTemplateIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupUpdateRequest` generated from model 'adGroupUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `AdGroupUpdateRequest` (
  `id` text NOT NULL PRIMARY KEY /*Ad group ID.*/,
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;Pinterest Performance+ targeting\&quot;&lt;/a&gt;.*/,
  `bid_in_micro_currency` int /*Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.*/,
  `bid_strategy_type` text /*Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \&quot;Pinterest Performance+ bidding\&quot;.*/,
  `billable_event` long,
  `budget_in_micro_currency` int /*Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.*/,
  `budget_type` long,
  `campaign_id` text /*Campaign ID of the ad group.*/,
  `end_time` int /*Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.*/,
  `is_creative_optimization` boolean /*Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.*/,
  `lifetime_frequency_cap` int /*Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.*/,
  `name` text /*Ad group name.*/,
  `optimization_goal_metadata` long /*Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.*/,
  `pacing_delivery_type` long,
  `placement_group` long /*&lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.*/,
  `promotion_application_level` text /*Specify if the promotion is applied at ad group or item level*/,
  `promotion_id` text /*Promotion ID. To clear this field, set to null.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-ads/#step-2-create-an-ad-group\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling ads&lt;/a&gt;. For certain organizations (&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.*/,
  `status` long /*Ad group/entity status.*/,
  `targeting_spec` long,
  `tracking_urls` long /*Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.*/,
  `bid_multiplier` decimal /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupUpdateRequestTargetingTemplateIds` generated from model 'AdGroupUpdateRequestTargetingTemplateIds'

CREATE TABLE IF NOT EXISTS `AdGroupUpdateRequestTargetingTemplateIds` (
  `adGroupUpdateRequest` long NOT NULL
  `targetingTemplateIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupsAnalyticsResponse_inner` generated from model 'adGroupsAnalyticsResponseInner'
--

CREATE TABLE IF NOT EXISTS `AdGroupsAnalyticsResponse_inner` (
  `AD_GROUP_ID` text /*The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true.*/,
  `DATE` date /*Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ad_groups_list_200_response` generated from model 'adGroupsList200Response'
--

CREATE TABLE IF NOT EXISTS `ad_groups_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupsList200ResponseAdGroupResponse` generated from model 'AdGroupsList200ResponseAdGroupResponse'

CREATE TABLE IF NOT EXISTS `AdGroupsList200ResponseAdGroupResponse` (
  `adGroupsList200Response` long NOT NULL
  `adGroupResponse` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdPinAnalytics` generated from model 'adPinAnalytics'
--

CREATE TABLE IF NOT EXISTS `AdPinAnalytics` (
  `PIN_ID` text NOT NULL /*The ID of the pin that the metric belongs to.*/,
  `DATE` date /*Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdPinId` generated from model 'adPinId'
--

CREATE TABLE IF NOT EXISTS `AdPinId` (
  `pin_id` text /*Pin ID.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdPreviewCreateFromImage` generated from model 'adPreviewCreateFromImage'
--

CREATE TABLE IF NOT EXISTS `AdPreviewCreateFromImage` (
  `image_url` text NOT NULL /*Image URL.*/,
  `title` text NOT NULL /*Title displayed below ad.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdPreviewCreateFromPin` generated from model 'adPreviewCreateFromPin'
--

CREATE TABLE IF NOT EXISTS `AdPreviewCreateFromPin` (
  `pin_id` text NOT NULL /*Pin ID.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdPreviewRequest` generated from model 'adPreviewRequest'
--

CREATE TABLE IF NOT EXISTS `AdPreviewRequest` (
  `image_url` text NOT NULL /*Image URL.*/,
  `title` text NOT NULL /*Title displayed below ad.*/,
  `pin_id` text NOT NULL /*Pin ID.*/,
  `catalog_product_group_id` text NOT NULL /*Catalog Product Group Id.*/,
  `creative_type` text NOT NULL /*Ad format of the shopping ad preview.*/,
  `customizable_cta_type` long /*Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60;*/,
  `hero_image_title` text /*Title displayed below ad.*/,
  `hero_image_url` text /*Hero image URL.*/,
  `hero_pin_id` text /*Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.*/,
  `image_tag` text /*Multi image template tag.*/,
  `item_id` text /*Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.*/,
  `preferred_media_type` text /*Preferred media type.*/,
  `video_tag` text /*Multi video template tag, image_tag and video_tag are mutual exclusive.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdPreviewShopping` generated from model 'adPreviewShopping'
--

CREATE TABLE IF NOT EXISTS `AdPreviewShopping` (
  `catalog_product_group_id` text NOT NULL /*Catalog Product Group Id.*/,
  `creative_type` text NOT NULL /*Ad format of the shopping ad preview.*/,
  `customizable_cta_type` long /*Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60;*/,
  `hero_image_title` text /*Title displayed below ad.*/,
  `hero_image_url` text /*Hero image URL.*/,
  `hero_pin_id` text /*Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.*/,
  `image_tag` text /*Multi image template tag.*/,
  `item_id` text /*Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.*/,
  `preferred_media_type` text /*Preferred media type.*/,
  `video_tag` text /*Multi video template tag, image_tag and video_tag are mutual exclusive.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdPreviewURLResponse` generated from model 'adPreviewURLResponse'
--

CREATE TABLE IF NOT EXISTS `AdPreviewURLResponse` (
  `url` text /*&#39;Preview URL, expires in 7 days. Can be used in an iframe. For example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/ The preview object ID/key is the last param - 74667c814dd2b19&#39;*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdResponse` generated from model 'adResponse'
--

CREATE TABLE IF NOT EXISTS `AdResponse` (
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
  `is_pin_deleted` boolean /*Is original pin deleted?*/,
  `is_removable` boolean /*Is pin repinnable?*/,
  `lead_form_id` text /*Lead form ID for lead ad generation.*/,
  `name` text /*Name of the ad - 255 chars max.*/,
  `quiz_pin_data` long /*Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.*/,
  `status` long,
  `tracking_urls` long,
  `view_tracking_url` text /*Tracking URL for ad impressions.*/,
  `pin_id` text /*Pin ID.*/,
  `ad_account_id` text /*The ID of the advertiser that this ad belongs to.*/,
  `campaign_id` text /*ID of the ad campaign that contains this ad.*/,
  `collection_items_destination_url_template` text /*Destination URL template for all items within a collections drawer.*/,
  `created_time` int /*Pin creation time. Unix timestamp in seconds.*/,
  `id` text PRIMARY KEY /*The ID of this ad.*/,
  `review_status` text /*Ad review status*/,
  `summary_status` long /*Ad summary status*/,
  `type` text /*Always \&quot;ad\&quot;.*/,
  `updated_time` int /*Last update time. Unix timestamp in seconds.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdResponseCarouselAndroidDeepLinks` generated from model 'AdResponseCarouselAndroidDeepLinks'

CREATE TABLE IF NOT EXISTS `AdResponseCarouselAndroidDeepLinks` (
  `adResponse` long NOT NULL
  `carouselAndroidDeepLinks` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdResponseCarouselDestinationUrls` generated from model 'AdResponseCarouselDestinationUrls'

CREATE TABLE IF NOT EXISTS `AdResponseCarouselDestinationUrls` (
  `adResponse` long NOT NULL
  `carouselDestinationUrls` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdResponseCarouselIosDeepLinks` generated from model 'AdResponseCarouselIosDeepLinks'

CREATE TABLE IF NOT EXISTS `AdResponseCarouselIosDeepLinks` (
  `adResponse` long NOT NULL
  `carouselIosDeepLinks` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdResponseRejectedReasons` generated from model 'AdResponseRejectedReasons'

CREATE TABLE IF NOT EXISTS `AdResponseRejectedReasons` (
  `adResponse` long NOT NULL
  `rejectedReasons` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdResponseRejectionLabels` generated from model 'AdResponseRejectionLabels'

CREATE TABLE IF NOT EXISTS `AdResponseRejectionLabels` (
  `adResponse` long NOT NULL
  `rejectionLabels` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdUpdateRequest` generated from model 'adUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `AdUpdateRequest` (
  `id` text NOT NULL PRIMARY KEY /*The ID of this ad.*/,
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
  `is_pin_deleted` boolean /*Is original pin deleted?*/,
  `is_removable` boolean /*Is pin repinnable?*/,
  `lead_form_id` text /*Lead form ID for lead ad generation.*/,
  `name` text /*Name of the ad - 255 chars max.*/,
  `quiz_pin_data` long /*Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.*/,
  `status` long,
  `tracking_urls` long,
  `view_tracking_url` text /*Tracking URL for ad impressions.*/,
  `pin_id` text /*Pin ID. This field may only be updated for draft ads.*/
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
-- Table structure for table `AdsAnalyticsCreateAsyncRequest` generated from model 'adsAnalyticsCreateAsyncRequest'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequest` (
  `end_date` text NOT NULL /*Metric report end date (UTC). Format: YYYY-MM-DD*/,
  `granularity` long NOT NULL /*TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly*/,
  `start_date` text NOT NULL /*Metric report start date (UTC). Format: YYYY-MM-DD*/,
  `level` long NOT NULL /*Level of the report*/,
  `click_window_days` long /*Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.*/,
  `conversion_report_time` long /*The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.*/,
  `engagement_window_days` long /*Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.*/,
  `view_window_days` long /*Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.*/,
  `campaign_brand_label` text /*Campaign brand label for filtering.*/,
  `combine_targeting_types` boolean /*Determines if the targeting types included in the request should be consolidated into a single breakdown. For example, when combine_targeting_types is set to true, if GENDER and COUNTRY are targeting types in the request, the response will have a targeting type of GENDER_AND_COUNTRY and targeting values such as female&amp;US. This feature is currently in BETA and is not available to all users.*/,
  `end_hour` int UNSIGNED /*Which hour of the end date to stop the report (inclusive). For example, with an end_date of &#39;2020-01-01&#39; and end_hour of &#39;15&#39;, the report will contain metrics up to &#39;2020-01-01 14:59:59&#39;. The entire day will be included if no end hour is provided. Only allowed for hourly reports.*/,
  `primary_sort` text /*Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests.*/,
  `report_format` long /*Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0.*/,
  `reporting_timezone` long /*Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.*/,
  `start_hour` int UNSIGNED /*Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequestReportingColumnAsync` generated from model 'AdsAnalyticsCreateAsyncRequestReportingColumnAsync'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestReportingColumnAsync` (
  `adsAnalyticsCreateAsyncRequest` long NOT NULL
  `reportingColumnAsync` long NOT NULL
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
-- Table structure for table `AdsAnalyticsCreateAsyncRequestCampaignSummaryStatus` generated from model 'AdsAnalyticsCreateAsyncRequestCampaignSummaryStatus'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestCampaignSummaryStatus` (
  `adsAnalyticsCreateAsyncRequest` long NOT NULL
  `campaignSummaryStatus` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequestObjectiveType` generated from model 'AdsAnalyticsCreateAsyncRequestObjectiveType'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestObjectiveType` (
  `adsAnalyticsCreateAsyncRequest` long NOT NULL
  `objectiveType` long NOT NULL
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
-- Table structure for table `AdsAnalyticsCreateAsyncRequestTargetingTypes` generated from model 'AdsAnalyticsCreateAsyncRequestTargetingTypes'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestTargetingTypes` (
  `adsAnalyticsCreateAsyncRequest` long NOT NULL
  `targetingTypes` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequestAdsAnalyticsMetricsFilter` generated from model 'AdsAnalyticsCreateAsyncRequestAdsAnalyticsMetricsFilter'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestAdsAnalyticsMetricsFilter` (
  `adsAnalyticsCreateAsyncRequest` long NOT NULL
  `adsAnalyticsMetricsFilter` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequestAdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics` generated from model 'AdsAnalyticsCreateAsyncRequestAdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestAdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics` (
  `adsAnalyticsCreateAsyncRequest` long NOT NULL
  `adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics` generated from model 'adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics` (
  `custom_event_metrics_type` text NOT NULL /*Metrics for custom defined conversion event.*/,
  `custom_event_name` text NOT NULL /*Name of the advertiser-defined custom conversion event*/
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
-- Table structure for table `AdsAnalyticsResponse_inner` generated from model 'adsAnalyticsResponseInner'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsResponse_inner` (
  `AD_ID` text NOT NULL /*The ID of the ad that this metrics belongs to.*/,
  `DATE` date /*Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdsCreditDiscountsResponse` generated from model 'adsCreditDiscountsResponse'
--

CREATE TABLE IF NOT EXISTS `AdsCreditDiscountsResponse` (
  `active` boolean /*True if the offer code is currently active.*/,
  `advertiser_id` text /*Advertiser ID the offer was applied to.*/,
  `discountCurrency` text /*Currency value for the discount.*/,
  `discountInMicroCurrency` decimal /*The discount applied in the offer’s currency value.*/,
  `discountType` text /*The type of discount of this credit*/,
  `remainingDiscountInMicroCurrency` decimal /*The credits left to spend.*/,
  `title` text /*Human readable title of the offer code.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdsCreditRedeemRequest` generated from model 'adsCreditRedeemRequest'
--

CREATE TABLE IF NOT EXISTS `AdsCreditRedeemRequest` (
  `offerCodeHash` text NOT NULL /*Takes in a SHA256 hash of the offerCode.*/,
  `validateOnly` boolean NOT NULL /*If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdsCreditRedeemResponse` generated from model 'adsCreditRedeemResponse'
--

CREATE TABLE IF NOT EXISTS `AdsCreditRedeemResponse` (
  `errorCode` int /*Error code type if error occurs*/,
  `errorMessage` text /*Reason for failure*/,
  `success` boolean /*Returns true if the offer code was successfully applied(validateOnly&#x3D;false) or can be applied(validateOnly&#x3D;true).*/
); 


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
-- Table structure for table `AdsList200ResponseAdResponse` generated from model 'AdsList200ResponseAdResponse'

CREATE TABLE IF NOT EXISTS `AdsList200ResponseAdResponse` (
  `adsList200Response` long NOT NULL
  `adResponse` long NOT NULL
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
  `country` long NOT NULL,
  `item_id` text NOT NULL /*The catalog retail item id in the merchant namespace*/,
  `language` long NOT NULL,
  `bid_options` long NOT NULL
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
-- Table structure for table `AdvancedAuctionItemsGetRecord` generated from model 'advancedAuctionItemsGetRecord'
-- Object uniquely identifying a retail catalog item
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsGetRecord` (
  `country` long NOT NULL,
  `item_id` text NOT NULL /*The catalog retail item id in the merchant namespace*/,
  `language` long NOT NULL
);  /*Object uniquely identifying a retail catalog item*/


-- --------------------------------------------------------------------------
-- Table structure for table `AdvancedAuctionItemsGetRequest` generated from model 'advancedAuctionItemsGetRequest'
-- Request object used to get bid options values for a batch of retail catalog items
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsGetRequest` (
  `catalog_id` text NOT NULL /*Catalog id pertaining to the retail item*/,
);  /*Request object used to get bid options values for a batch of retail catalog items*/

-- --------------------------------------------------------------------------
-- Table structure for table `AdvancedAuctionItemsGetRequestAdvancedAuctionItemsGetRecord` generated from model 'AdvancedAuctionItemsGetRequestAdvancedAuctionItemsGetRecord'

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsGetRequestAdvancedAuctionItemsGetRecord` (
  `advancedAuctionItemsGetRequest` long NOT NULL
  `advancedAuctionItemsGetRecord` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdvancedAuctionItemsSubmitDeleteRecord` generated from model 'advancedAuctionItemsSubmitDeleteRecord'
-- Object describing an item bid option deletion operation
--

CREATE TABLE IF NOT EXISTS `AdvancedAuctionItemsSubmitDeleteRecord` (
  `country` long NOT NULL,
  `item_id` text NOT NULL /*The catalog retail item id in the merchant namespace*/,
  `language` long NOT NULL,
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
  `country` long NOT NULL,
  `item_id` text NOT NULL /*The catalog retail item id in the merchant namespace*/,
  `language` long NOT NULL,
  `bid_options` long NOT NULL,
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
  `country` long NOT NULL,
  `item_id` text NOT NULL /*The catalog retail item id in the merchant namespace*/,
  `language` long NOT NULL,
  `bid_options` long NOT NULL,
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
--

CREATE TABLE IF NOT EXISTS `AdvertiserDefinedEvent` (
  `name` text /*raw string name of the event, usually logged as raw_event_name in our dataset*/,
  `mapped_conversion_type` text /*standard type mapped to ADE for optimization*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdvertiserDefinedEventsResponse` generated from model 'advertiserDefinedEventsResponse'
--

CREATE TABLE IF NOT EXISTS `AdvertiserDefinedEventsResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdvertiserDefinedEventsResponseAdvertiserDefinedEvent` generated from model 'AdvertiserDefinedEventsResponseAdvertiserDefinedEvent'

CREATE TABLE IF NOT EXISTS `AdvertiserDefinedEventsResponseAdvertiserDefinedEvent` (
  `advertiserDefinedEventsResponse` long NOT NULL
  `advertiserDefinedEvent` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `all_of` generated from model 'allOf'
--

CREATE TABLE IF NOT EXISTS `all_of` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AllOfCatalogsProductGroupFilterKeys` generated from model 'AllOfCatalogsProductGroupFilterKeys'

CREATE TABLE IF NOT EXISTS `AllOfCatalogsProductGroupFilterKeys` (
  `allOf` long NOT NULL
  `catalogsProductGroupFilterKeys` long NOT NULL
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
-- Table structure for table `AnalyticsDailyMetrics` generated from model 'analyticsDailyMetrics'
--

CREATE TABLE IF NOT EXISTS `AnalyticsDailyMetrics` (
  `data_status` long,
  `date` text /*Metrics date (UTC): YYYY-MM-DD.*/,
  `metrics` blob /*The metric name and daily value for each requested metric*/
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
-- Table structure for table `any_of` generated from model 'anyOf'
--

CREATE TABLE IF NOT EXISTS `any_of` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AnyOfCatalogsProductGroupFilterKeys` generated from model 'AnyOfCatalogsProductGroupFilterKeys'

CREATE TABLE IF NOT EXISTS `AnyOfCatalogsProductGroupFilterKeys` (
  `anyOf` long NOT NULL
  `catalogsProductGroupFilterKeys` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AppTypeMultipliers` generated from model 'appTypeMultipliers'
-- This represents a mapping from app type targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified app type in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
--

CREATE TABLE IF NOT EXISTS `AppTypeMultipliers` (
  `APP_TYPE` text
);  /*This represents a mapping from app type targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified app type in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).*/


-- --------------------------------------------------------------------------
-- Table structure for table `AssetGroupBinding` generated from model 'assetGroupBinding'
--

CREATE TABLE IF NOT EXISTS `AssetGroupBinding` (
  `asset_group_description` text /*Asset group description*/,
  `asset_group_name` text /*Asset Group name*/,
  `created_by` long /*The data of the user that created the asset group.*/,
  `created_time` int /*The creation time of the asset group*/,
  `id` text PRIMARY KEY /*Asset Group ID.*/,
  `owner` long /*The data of the business that owns the asset group.*/,
  `updated_time` int /*The last update time of the asset group*/
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
-- Table structure for table `AssetIdPermissions` generated from model 'assetIdPermissions'
-- An object containing the permissions a business member has on the asset.
--

CREATE TABLE IF NOT EXISTS `AssetIdPermissions` (
  `asset_group_info` long,
  `asset_id` text /*Unique identifier of a business asset.*/,
  `asset_type` text /*Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.*/,
);  /*An object containing the permissions a business member has on the asset.*/

-- --------------------------------------------------------------------------
-- Table structure for table `AssetIdPermissionsPermissions` generated from model 'AssetIdPermissionsPermissions'

CREATE TABLE IF NOT EXISTS `AssetIdPermissionsPermissions` (
  `assetIdPermissions` long NOT NULL
  `permissions` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `Audience` generated from model 'audience'
--

CREATE TABLE IF NOT EXISTS `Audience` (
  `ad_account_id` text /*Ad account ID.*/,
  `audience_type` text /*&lt;a href&#x3D;\&quot;/docs/reference/glossary/#Audience Types\&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR*/,
  `created_by_company_name` text /*The company that created this audience.*/,
  `created_timestamp` int /*Creation time. Unix timestamp in seconds.*/,
  `description` text /*Audience description.*/,
  `id` text PRIMARY KEY /*Audience ID.*/,
  `name` text /*Audience name.*/,
  `rule` long,
  `size` int /*Audience size.*/,
  `status` text /*Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.*/,
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
-- Table structure for table `AudienceCommon` generated from model 'audienceCommon'
--

CREATE TABLE IF NOT EXISTS `AudienceCommon` (
  `ad_account_id` text /*Ad account ID.*/,
  `name` text /*Audience name.*/,
  `rule` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AudienceCreateRequest` generated from model 'audienceCreateRequest'
--

CREATE TABLE IF NOT EXISTS `AudienceCreateRequest` (
  `name` text NOT NULL /*Audience name.*/,
  `rule` long NOT NULL,
  `audience_type` long NOT NULL /*&lt;a href&#x3D;\&quot;/docs/reference/glossary/#Audience Types\&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR. Values are case-sensitive.*/,
  `ad_account_id` text /*Ad account ID.*/,
  `description` text /*Audience description.*/
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
-- Table structure for table `AudienceDefinitionResponse` generated from model 'audienceDefinitionResponse'
--

CREATE TABLE IF NOT EXISTS `AudienceDefinitionResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AudienceDefinitionResponseAudienceDefinition` generated from model 'AudienceDefinitionResponseAudienceDefinition'

CREATE TABLE IF NOT EXISTS `AudienceDefinitionResponseAudienceDefinition` (
  `audienceDefinitionResponse` long NOT NULL
  `audienceDefinition` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AudienceDefinitionScope` generated from model 'audienceDefinitionScope'
-- Generated audience scope to request.
--

CREATE TABLE IF NOT EXISTS `AudienceDefinitionScope` (
  `scope` text
);  /*Generated audience scope to request.*/


-- --------------------------------------------------------------------------
-- Table structure for table `AudienceDefinitionType` generated from model 'audienceDefinitionType'
-- Generated audience type to request.
--

CREATE TABLE IF NOT EXISTS `AudienceDefinitionType` (
  `scope` text
);  /*Generated audience type to request.*/


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
-- Table structure for table `AudienceInsightCategoryArrayResponse` generated from model 'audienceInsightCategoryArrayResponse'
--

CREATE TABLE IF NOT EXISTS `AudienceInsightCategoryArrayResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AudienceInsightCategoryArrayResponseAudienceInsightCategoryCommon` generated from model 'AudienceInsightCategoryArrayResponseAudienceInsightCategoryCommon'

CREATE TABLE IF NOT EXISTS `AudienceInsightCategoryArrayResponseAudienceInsightCategoryCommon` (
  `audienceInsightCategoryArrayResponse` long NOT NULL
  `audienceInsightCategoryCommon` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AudienceInsightCategoryCommon` generated from model 'audienceInsightCategoryCommon'
--

CREATE TABLE IF NOT EXISTS `AudienceInsightCategoryCommon` (
  `id` text PRIMARY KEY,
  `index` decimal,
  `key` text,
  `name` text,
  `ratio` decimal
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AudienceInsightsResponse` generated from model 'audienceInsightsResponse'
-- Audience interests and demographics.
--

CREATE TABLE IF NOT EXISTS `AudienceInsightsResponse` (
  `date` text /*Generation date*/,
  `demographics` long,
  `size` int /*Population count.*/,
  `size_is_upper_bound` boolean /*Indicates whether the audience size has been rounded up to the next highest upper boundary.*/,
  `type` long
);  /*Audience interests and demographics.*/

-- --------------------------------------------------------------------------
-- Table structure for table `AudienceInsightsResponseAudienceCategory` generated from model 'AudienceInsightsResponseAudienceCategory'

CREATE TABLE IF NOT EXISTS `AudienceInsightsResponseAudienceCategory` (
  `audienceInsightsResponse` long NOT NULL
  `audienceCategory` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AudienceRule` generated from model 'audienceRule'
-- JSON object defining targeted audience users. Example rule formats per audience type:&lt;br&gt;CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}&lt;br&gt;ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; }&lt;br&gt;(Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10.&lt;br&gt;The targeted audience should be this % size across Pinterest.)&lt;br&gt;VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}}&lt;br&gt;(Retention days should be 1-540. Retention applies to specific customers.)&lt;br&gt;ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.example.com\&quot;], \&quot;engager_type\&quot;: 1}&lt;br&gt;Learn more about &lt;a href&#x3D;\&quot;/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience\&quot; target&#x3D;\&quot;_blank\&quot;&gt;engagement audiences&lt;/a&gt;.
--

CREATE TABLE IF NOT EXISTS `AudienceRule` (
  `ad_account_id` text /*Ad account ID.*/,
  `country` text /*Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;.*/,
  `customer_list_id` text /*Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;.*/,
  `engagement_type` text /*Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set. */,
  `engager_type` int /*Optional for ENGAGEMENT. Engager type value should be 1-2.*/,
  `event` text /*A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event.*/,
  `event_data` long,
  `event_source` blob /*Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline*/,
  `ingestion_source` blob /*Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api*/,
  `percentage` int /*Percentage should be 1-10. The targeted audience should be this % size across Pinterest.*/,
  `prefill` boolean /*Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;.*/,
  `retention_days` int /*Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified.*/,
  `visitor_source_id` text /*The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;.*/
);  /*JSON object defining targeted audience users. Example rule formats per audience type:&lt;br&gt;CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}&lt;br&gt;ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; }&lt;br&gt;(Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10.&lt;br&gt;The targeted audience should be this % size across Pinterest.)&lt;br&gt;VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}}&lt;br&gt;(Retention days should be 1-540. Retention applies to specific customers.)&lt;br&gt;ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.example.com\&quot;], \&quot;engager_type\&quot;: 1}&lt;br&gt;Learn more about &lt;a href&#x3D;\&quot;/docs/work-with-targets-and-audiences/create-audiences/#engagement-audience\&quot; target&#x3D;\&quot;_blank\&quot;&gt;engagement audiences&lt;/a&gt;.*/

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
  `id` text PRIMARY KEY /*Subinterest ID.*/,
  `index` decimal /*Subinterest affinity index.*/,
  `key` text /*Interest unique key (same as ID).*/,
  `name` text /*Subinterest name.*/,
  `ratio` decimal /*Subinterest&#39;s percent of category&#39;s total audience.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AudienceUpdateRequest` generated from model 'audienceUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `AudienceUpdateRequest` (
  `ad_account_id` text /*Ad account ID.*/,
  `name` text /*Audience name.*/,
  `rule` long,
  `description` text /*Audience description.*/,
  `operation_type` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `audiences_list_200_response` generated from model 'audiencesList200Response'
--

CREATE TABLE IF NOT EXISTS `audiences_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AudiencesList200ResponseAudience` generated from model 'AudiencesList200ResponseAudience'

CREATE TABLE IF NOT EXISTS `AudiencesList200ResponseAudience` (
  `audiencesList200Response` long NOT NULL
  `audience` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AuthRespondInvitesBody` generated from model 'authRespondInvitesBody'
-- An object with a list of all the invites the user would like to respond to and the action to take.
--

CREATE TABLE IF NOT EXISTS `AuthRespondInvitesBody` (
);  /*An object with a list of all the invites the user would like to respond to and the action to take.*/

-- --------------------------------------------------------------------------
-- Table structure for table `AuthRespondInvitesBodyAuthRespondInvitesBodyInvitesInner` generated from model 'AuthRespondInvitesBodyAuthRespondInvitesBodyInvitesInner'

CREATE TABLE IF NOT EXISTS `AuthRespondInvitesBodyAuthRespondInvitesBodyInvitesInner` (
  `authRespondInvitesBody` long NOT NULL
  `authRespondInvitesBodyInvitesInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AuthRespondInvitesBody_invites_inner` generated from model 'authRespondInvitesBodyInvitesInner'
--

CREATE TABLE IF NOT EXISTS `AuthRespondInvitesBody_invites_inner` (
  `action` long NOT NULL,
  `invite_id` text NOT NULL /*Unique identifier of an invite.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AuthRespondInvitesBody_invites_inner_action` generated from model 'authRespondInvitesBodyInvitesInnerAction'
--

CREATE TABLE IF NOT EXISTS `AuthRespondInvitesBody_invites_inner_action` (
  `accept_invite` boolean NOT NULL /*Whether the invite/request is accepted.*/,
  `asset_id_to_permissions` blob /*An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. */
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AvailabilityFilter` generated from model 'availabilityFilter'
--

CREATE TABLE IF NOT EXISTS `AvailabilityFilter` (
  `AVAILABILITY` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BaseInviteDataResponse` generated from model 'baseInviteDataResponse'
--

CREATE TABLE IF NOT EXISTS `BaseInviteDataResponse` (
  `id` text PRIMARY KEY /*Unique identifier of the invite/request.*/,
  `invite_data` long,
  `is_received_invite` boolean /*Indicates whether the invite/request was received.*/,
  `user` long /*Metadata for the member/partner that was sent the invite/request.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BaseInviteDataResponse_invite_data` generated from model 'baseInviteDataResponseInviteData'
-- Metadata for the invite/request.
--

CREATE TABLE IF NOT EXISTS `BaseInviteDataResponse_invite_data` (
  `invite_expiration` int /*The date and time when the invite/request will expire. Returned in milliseconds.*/,
  `invite_status` text /*The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.*/,
  `invite_type` text /*The type of invite. &lt;br&gt;&#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. &lt;br&gt;&#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. &lt;br&gt;&#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets.*/,
  `last_updated_time` int /*The date and time the invite/request was last updated. Returned in milliseconds.*/,
  `sent_at` int /*The date and time the invite/request was sent/created. Returned in milliseconds.*/
);  /*Metadata for the invite/request.*/


-- --------------------------------------------------------------------------
-- Table structure for table `BidFloor` generated from model 'bidFloor'
--

CREATE TABLE IF NOT EXISTS `BidFloor` (
  `type` text /*Always the string &#39;bidfloor&#39;*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BidFloorBidFloors` generated from model 'BidFloorBidFloors'

CREATE TABLE IF NOT EXISTS `BidFloorBidFloors` (
  `bidFloor` long NOT NULL
  `bidFloors` int NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BidFloorRequest` generated from model 'bidFloorRequest'
--

CREATE TABLE IF NOT EXISTS `BidFloorRequest` (
  `targeting_spec` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BidFloorRequestBidFloorSpec` generated from model 'BidFloorRequestBidFloorSpec'

CREATE TABLE IF NOT EXISTS `BidFloorRequestBidFloorSpec` (
  `bidFloorRequest` long NOT NULL
  `bidFloorSpec` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BidFloorSpec` generated from model 'bidFloorSpec'
--

CREATE TABLE IF NOT EXISTS `BidFloorSpec` (
  `billable_event` long NOT NULL,
  `currency` long NOT NULL,
  `creative_type` long,
  `objective_type` long,
  `optimization_goal_metadata` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BidFloorSpecCountry` generated from model 'BidFloorSpecCountry'

CREATE TABLE IF NOT EXISTS `BidFloorSpecCountry` (
  `bidFloorSpec` long NOT NULL
  `country` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BillingInvoiceDownloadResponse` generated from model 'billingInvoiceDownloadResponse'
--

CREATE TABLE IF NOT EXISTS `BillingInvoiceDownloadResponse` (
  `download_url` text /*The download url for the billing invoice*/,
  `id` text PRIMARY KEY /*The billing invoice id*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BillingInvoiceResponse` generated from model 'billingInvoiceResponse'
--

CREATE TABLE IF NOT EXISTS `BillingInvoiceResponse` (
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
  `document_type` text /*The type of the document*/,
  `id` text PRIMARY KEY /*Unique identifier for the billing invoice*/,
  `invoice_due_date` date /*The date the invoice is due. Format: YYYY-MM-DD*/,
  `payment_terms` text /*The payment terms of the invoice*/,
  `status` text /*The status of the invoice*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `billing_invoices_get_200_response` generated from model 'billingInvoicesGet200Response'
--

CREATE TABLE IF NOT EXISTS `billing_invoices_get_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BillingInvoicesGet200ResponseBillingInvoiceResponse` generated from model 'BillingInvoicesGet200ResponseBillingInvoiceResponse'

CREATE TABLE IF NOT EXISTS `BillingInvoicesGet200ResponseBillingInvoiceResponse` (
  `billingInvoicesGet200Response` long NOT NULL
  `billingInvoiceResponse` long NOT NULL
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
  `billing_type` text /*Billing type of the advertiser*/,
  `card_type` text /*Type of the card.*/,
  `id` text PRIMARY KEY /*Billing ID.*/,
  `payment_method_brand` text /*Brand of the payment method.*/,
  `status` text /*Status of the billing.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Board` generated from model 'board'
--

CREATE TABLE IF NOT EXISTS `Board` (
  `id` text NOT NULL PRIMARY KEY,
  `name` text NOT NULL /*     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.*/,
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
  `name` text NOT NULL /*     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.*/,
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
  `name` text NOT NULL /*     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.*/,
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
  `name` text NOT NULL /*     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.*/,
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
  `name` text /*     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.*/,
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
-- Table structure for table `BoardsListPins200ResponsePin` generated from model 'BoardsListPins200ResponsePin'

CREATE TABLE IF NOT EXISTS `BoardsListPins200ResponsePin` (
  `boardsListPins200Response` long NOT NULL
  `pin` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `boards_user_follows_list_200_response` generated from model 'boardsUserFollowsList200Response'
--

CREATE TABLE IF NOT EXISTS `boards_user_follows_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BoardsUserFollowsList200ResponseBoard` generated from model 'BoardsUserFollowsList200ResponseBoard'

CREATE TABLE IF NOT EXISTS `BoardsUserFollowsList200ResponseBoard` (
  `boardsUserFollowsList200Response` long NOT NULL
  `board` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BookClosedResponse` generated from model 'bookClosedResponse'
-- Creation fields
--

CREATE TABLE IF NOT EXISTS `BookClosedResponse` (
  `conversion_metrics_ready` boolean /*Are conversion metrics ready?*/,
  `non_conversion_metrics_ready` boolean /*Are non-conversion metrics ready?*/
);  /*Creation fields*/


-- --------------------------------------------------------------------------
-- Table structure for table `brand_accounts_create_200_response` generated from model 'brandAccountsCreate200Response'
--

CREATE TABLE IF NOT EXISTS `brand_accounts_create_200_response` (
  `brand_account_id` text /*id of the newly created brand account*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `brand_accounts_create_request` generated from model 'brandAccountsCreateRequest'
--

CREATE TABLE IF NOT EXISTS `brand_accounts_create_request` (
  `name` text NOT NULL /*Brand Account name*/,
  `username` text NOT NULL /*Brand Account username*/,
  `country` long NOT NULL,
  `about` text /*Brand Account about information*/,
  `website` text /*Brand Account website*/,
  `profile_image` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `brand_accounts_update_request` generated from model 'brandAccountsUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `brand_accounts_update_request` (
  `name` text /*Brand Account name*/,
  `username` text /*Brand Account username*/,
  `country` long,
  `about` text /*Brand Account about information*/,
  `website` text /*Brand Account website*/,
  `profile_image` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BrandFilter` generated from model 'brandFilter'
--

CREATE TABLE IF NOT EXISTS `BrandFilter` (
  `BRAND` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BulkDownloadRequest` generated from model 'bulkDownloadRequest'
-- Ad entities to get in bulk request.
--

CREATE TABLE IF NOT EXISTS `BulkDownloadRequest` (
  `campaign_filter` long,
  `output_format` long,
  `updated_since` text /*Unix UTC timestamp to retrieve all entities that have changed since this time.*/
);  /*Ad entities to get in bulk request.*/

-- --------------------------------------------------------------------------
-- Table structure for table `BulkDownloadRequestEntityIds` generated from model 'BulkDownloadRequestEntityIds'

CREATE TABLE IF NOT EXISTS `BulkDownloadRequestEntityIds` (
  `bulkDownloadRequest` long NOT NULL
  `entityIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkDownloadRequestBulkEntityType` generated from model 'BulkDownloadRequestBulkEntityType'

CREATE TABLE IF NOT EXISTS `BulkDownloadRequestBulkEntityType` (
  `bulkDownloadRequest` long NOT NULL
  `bulkEntityType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BulkDownloadRequest_campaign_filter` generated from model 'bulkDownloadRequestCampaignFilter'
--

CREATE TABLE IF NOT EXISTS `BulkDownloadRequest_campaign_filter` (
  `end_time` text /*Unix UTC timestamp.*/,
  `name` text /*Campaign name*/,
  `start_time` text /*Unix UTC timestamp.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BulkDownloadRequestCampaignFilterCampaignSummaryStatus` generated from model 'BulkDownloadRequestCampaignFilterCampaignSummaryStatus'

CREATE TABLE IF NOT EXISTS `BulkDownloadRequestCampaignFilterCampaignSummaryStatus` (
  `bulkDownloadRequestCampaignFilter` long NOT NULL
  `campaignSummaryStatus` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkDownloadRequestCampaignFilterObjectiveType` generated from model 'BulkDownloadRequestCampaignFilterObjectiveType'

CREATE TABLE IF NOT EXISTS `BulkDownloadRequestCampaignFilterObjectiveType` (
  `bulkDownloadRequestCampaignFilter` long NOT NULL
  `objectiveType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BulkDownloadResponse` generated from model 'bulkDownloadResponse'
--

CREATE TABLE IF NOT EXISTS `BulkDownloadResponse` (
  `request_id` text /*ID of the bulk request.*/
); 


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
-- Table structure for table `BulkUpsertRequestCreateMultipleProductGroupsInner` generated from model 'BulkUpsertRequestCreateMultipleProductGroupsInner'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestCreateMultipleProductGroupsInner` (
  `bulkUpsertRequestCreate` long NOT NULL
  `multipleProductGroupsInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestCreateKeywordsRequest` generated from model 'BulkUpsertRequestCreateKeywordsRequest'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestCreateKeywordsRequest` (
  `bulkUpsertRequestCreate` long NOT NULL
  `keywordsRequest` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestCreateLabelCreateRequest` generated from model 'BulkUpsertRequestCreateLabelCreateRequest'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestCreateLabelCreateRequest` (
  `bulkUpsertRequestCreate` long NOT NULL
  `labelCreateRequest` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestCreateProductGroupPromotionCreateRequest` generated from model 'BulkUpsertRequestCreateProductGroupPromotionCreateRequest'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestCreateProductGroupPromotionCreateRequest` (
  `bulkUpsertRequestCreate` long NOT NULL
  `productGroupPromotionCreateRequest` long NOT NULL
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
-- Table structure for table `BulkUpsertRequestUpdateCatalogsProductGroupsUpdateRequest` generated from model 'BulkUpsertRequestUpdateCatalogsProductGroupsUpdateRequest'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestUpdateCatalogsProductGroupsUpdateRequest` (
  `bulkUpsertRequestUpdate` long NOT NULL
  `catalogsProductGroupsUpdateRequest` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestUpdateKeywordUpdate` generated from model 'BulkUpsertRequestUpdateKeywordUpdate'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestUpdateKeywordUpdate` (
  `bulkUpsertRequestUpdate` long NOT NULL
  `keywordUpdate` long NOT NULL
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
-- Table structure for table `BulkUpsertResponse` generated from model 'bulkUpsertResponse'
-- ID of the bulk request.
--

CREATE TABLE IF NOT EXISTS `BulkUpsertResponse` (
  `request_id` text
);  /*ID of the bulk request.*/


-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertStatusResponse` generated from model 'bulkUpsertStatusResponse'
-- ID of the bulk request.
--

CREATE TABLE IF NOT EXISTS `BulkUpsertStatusResponse` (
  `result_url` text,
  `status` long
);  /*ID of the bulk request.*/


-- --------------------------------------------------------------------------
-- Table structure for table `BusinessAccessError` generated from model 'businessAccessError'
--

CREATE TABLE IF NOT EXISTS `BusinessAccessError` (
  `code` int NOT NULL,
  `message` text NOT NULL
); 


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
-- Table structure for table `business_asset_partners_get_200_response` generated from model 'businessAssetPartnersGet200Response'
--

CREATE TABLE IF NOT EXISTS `business_asset_partners_get_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessAssetPartnersGet200ResponseUserSingleAssetBinding` generated from model 'BusinessAssetPartnersGet200ResponseUserSingleAssetBinding'

CREATE TABLE IF NOT EXISTS `BusinessAssetPartnersGet200ResponseUserSingleAssetBinding` (
  `businessAssetPartnersGet200Response` long NOT NULL
  `userSingleAssetBinding` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `business_assets_get_200_response` generated from model 'businessAssetsGet200Response'
--

CREATE TABLE IF NOT EXISTS `business_assets_get_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessAssetsGet200ResponseGetBusinessAssetsResponse` generated from model 'BusinessAssetsGet200ResponseGetBusinessAssetsResponse'

CREATE TABLE IF NOT EXISTS `BusinessAssetsGet200ResponseGetBusinessAssetsResponse` (
  `businessAssetsGet200Response` long NOT NULL
  `getBusinessAssetsResponse` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `business_member_assets_get_200_response` generated from model 'businessMemberAssetsGet200Response'
--

CREATE TABLE IF NOT EXISTS `business_member_assets_get_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessMemberAssetsGet200ResponseAssetIdPermissions` generated from model 'BusinessMemberAssetsGet200ResponseAssetIdPermissions'

CREATE TABLE IF NOT EXISTS `BusinessMemberAssetsGet200ResponseAssetIdPermissions` (
  `businessMemberAssetsGet200Response` long NOT NULL
  `assetIdPermissions` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BusinessMemberAssetsSummary` generated from model 'businessMemberAssetsSummary'
-- Ad accounts and profiles the business member/partner has access to.
--

CREATE TABLE IF NOT EXISTS `BusinessMemberAssetsSummary` (
);  /*Ad accounts and profiles the business member/partner has access to.*/

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessMemberAssetsSummaryBusinessMemberAssetsSummaryAdAccountsInner` generated from model 'BusinessMemberAssetsSummaryBusinessMemberAssetsSummaryAdAccountsInner'

CREATE TABLE IF NOT EXISTS `BusinessMemberAssetsSummaryBusinessMemberAssetsSummaryAdAccountsInner` (
  `businessMemberAssetsSummary` long NOT NULL
  `businessMemberAssetsSummaryAdAccountsInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessMemberAssetsSummaryBusinessMemberAssetsSummaryProfilesInner` generated from model 'BusinessMemberAssetsSummaryBusinessMemberAssetsSummaryProfilesInner'

CREATE TABLE IF NOT EXISTS `BusinessMemberAssetsSummaryBusinessMemberAssetsSummaryProfilesInner` (
  `businessMemberAssetsSummary` long NOT NULL
  `businessMemberAssetsSummaryProfilesInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BusinessMemberAssetsSummary_ad_accounts_inner` generated from model 'businessMemberAssetsSummaryAdAccountsInner'
--

CREATE TABLE IF NOT EXISTS `BusinessMemberAssetsSummary_ad_accounts_inner` (
  `id` text PRIMARY KEY /*Unique identifier of a business ad account.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessMemberAssetsSummaryAdAccountsInnerPermissions` generated from model 'BusinessMemberAssetsSummaryAdAccountsInnerPermissions'

CREATE TABLE IF NOT EXISTS `BusinessMemberAssetsSummaryAdAccountsInnerPermissions` (
  `businessMemberAssetsSummaryAdAccountsInner` long NOT NULL
  `permissions` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BusinessMemberAssetsSummary_profiles_inner` generated from model 'businessMemberAssetsSummaryProfilesInner'
--

CREATE TABLE IF NOT EXISTS `BusinessMemberAssetsSummary_profiles_inner` (
  `id` text PRIMARY KEY /*Unique identifier of a business profile.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessMemberAssetsSummaryProfilesInnerPermissions` generated from model 'BusinessMemberAssetsSummaryProfilesInnerPermissions'

CREATE TABLE IF NOT EXISTS `BusinessMemberAssetsSummaryProfilesInnerPermissions` (
  `businessMemberAssetsSummaryProfilesInner` long NOT NULL
  `permissions` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `business_members_asset_access_delete_request` generated from model 'businessMembersAssetAccessDeleteRequest'
--

CREATE TABLE IF NOT EXISTS `business_members_asset_access_delete_request` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessMembersAssetAccessDeleteRequestBusinessMembersAssetAccessDeleteRequestAccessesInner` generated from model 'BusinessMembersAssetAccessDeleteRequestBusinessMembersAssetAccessDeleteRequestAccessesInner'

CREATE TABLE IF NOT EXISTS `BusinessMembersAssetAccessDeleteRequestBusinessMembersAssetAccessDeleteRequestAccessesInner` (
  `businessMembersAssetAccessDeleteRequest` long NOT NULL
  `businessMembersAssetAccessDeleteRequestAccessesInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `business_members_asset_access_delete_request_accesses_inner` generated from model 'businessMembersAssetAccessDeleteRequestAccessesInner'
--

CREATE TABLE IF NOT EXISTS `business_members_asset_access_delete_request_accesses_inner` (
  `asset_id` text NOT NULL /*Id of the asset on which to remove member permissions.*/,
  `member_id` text NOT NULL /*Unique identifier of the member on which to perform the asset permission removal*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `business_partner_asset_access_get_200_response` generated from model 'businessPartnerAssetAccessGet200Response'
--

CREATE TABLE IF NOT EXISTS `business_partner_asset_access_get_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessPartnerAssetAccessGet200ResponseGetPartnerAssetsResponse` generated from model 'BusinessPartnerAssetAccessGet200ResponseGetPartnerAssetsResponse'

CREATE TABLE IF NOT EXISTS `BusinessPartnerAssetAccessGet200ResponseGetPartnerAssetsResponse` (
  `businessPartnerAssetAccessGet200Response` long NOT NULL
  `getPartnerAssetsResponse` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BusinessSharedAudience` generated from model 'businessSharedAudience'
--

CREATE TABLE IF NOT EXISTS `BusinessSharedAudience` (
  `audience_id` text NOT NULL /*Unique identifier of an audience*/,
  `operation_type` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessSharedAudienceRecipientBusinessIds` generated from model 'BusinessSharedAudienceRecipientBusinessIds'

CREATE TABLE IF NOT EXISTS `BusinessSharedAudienceRecipientBusinessIds` (
  `businessSharedAudience` long NOT NULL
  `recipientBusinessIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BusinessSharedAudienceResponse` generated from model 'businessSharedAudienceResponse'
--

CREATE TABLE IF NOT EXISTS `BusinessSharedAudienceResponse` (
  `audience_id` text /*Audience ID that was shared*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessSharedAudienceResponseRole` generated from model 'BusinessSharedAudienceResponseRole'

CREATE TABLE IF NOT EXISTS `BusinessSharedAudienceResponseRole` (
  `businessSharedAudienceResponse` long NOT NULL
  `role` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BusinessSharedAudienceResponseRecipientBusinessIds` generated from model 'BusinessSharedAudienceResponseRecipientBusinessIds'

CREATE TABLE IF NOT EXISTS `BusinessSharedAudienceResponseRecipientBusinessIds` (
  `businessSharedAudienceResponse` long NOT NULL
  `recipientBusinessIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignAudienceMultipliers` generated from model 'campaignAudienceMultipliers'
-- This represents a mapping from Audience ID to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified audience in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
--

CREATE TABLE IF NOT EXISTS `CampaignAudienceMultipliers` (
  `AUDIENCE_ID` text
);  /*This represents a mapping from Audience ID to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified audience in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignBidOptions` generated from model 'campaignBidOptions'
-- Object describing the campaign level bid multipliers.
--

CREATE TABLE IF NOT EXISTS `CampaignBidOptions` (
  `app_type_multipliers` long,
  `audience_multipliers` long,
  `placement_multipliers` long
);  /*Object describing the campaign level bid multipliers.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignBidOptionsCreate` generated from model 'campaignBidOptionsCreate'
-- Object describing the campaign level bid multipliers.
--

CREATE TABLE IF NOT EXISTS `CampaignBidOptionsCreate` (
  `app_type_multipliers` long,
  `audience_multipliers` long,
  `placement_multipliers` long
);  /*Object describing the campaign level bid multipliers.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignBidOptionsUpdate` generated from model 'campaignBidOptionsUpdate'
-- Object describing an update to the campaign level bid multipliers.
--

CREATE TABLE IF NOT EXISTS `CampaignBidOptionsUpdate` (
  `app_type_multipliers` long,
  `audience_multipliers` long,
  `placement_multipliers` long
);  /*Object describing an update to the campaign level bid multipliers.*/

-- --------------------------------------------------------------------------
-- Table structure for table `CampaignBidOptionsUpdateUpdateMask` generated from model 'CampaignBidOptionsUpdateUpdateMask'

CREATE TABLE IF NOT EXISTS `CampaignBidOptionsUpdateUpdateMask` (
  `campaignBidOptionsUpdate` long NOT NULL
  `updateMask` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignCommon` generated from model 'campaignCommon'
-- Campaign Data
--

CREATE TABLE IF NOT EXISTS `CampaignCommon` (
  `ad_account_id` text /*Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.*/,
  `daily_spend_cap` int /*Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.*/,
  `end_time` int /*Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `is_automated_campaign` boolean /*Specifies whether the campaign was created in the automated campaign flow*/,
  `is_flexible_daily_budgets` boolean /*Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;.*/,
  `lifetime_spend_cap` int /*Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.*/,
  `name` text /*Campaign name.*/,
  `order_line_id` text /*Order line ID that appears on the invoice.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `status` long,
  `tracking_urls` long
);  /*Campaign Data*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignCreateCommon` generated from model 'campaignCreateCommon'
--

CREATE TABLE IF NOT EXISTS `CampaignCreateCommon` (
  `ad_account_id` text /*Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.*/,
  `daily_spend_cap` int /*Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.*/,
  `end_time` int /*Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `is_automated_campaign` boolean /*Specifies whether the campaign was created in the automated campaign flow*/,
  `is_flexible_daily_budgets` boolean /*Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;.*/,
  `lifetime_spend_cap` int /*Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.*/,
  `name` text /*Campaign name.*/,
  `order_line_id` text /*Order line ID that appears on the invoice.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `status` long,
  `tracking_urls` long,
  `default_ad_group_budget_in_micro_currency` int /*When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.*/,
  `is_campaign_budget_optimization` boolean /*Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignCreateRequest` generated from model 'campaignCreateRequest'
--

CREATE TABLE IF NOT EXISTS `CampaignCreateRequest` (
  `ad_account_id` text NOT NULL /*Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.*/,
  `name` text NOT NULL /*Campaign name.*/,
  `objective_type` long NOT NULL,
  `daily_spend_cap` int /*Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.*/,
  `end_time` int /*Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `is_automated_campaign` boolean /*Specifies whether the campaign was created in the automated campaign flow*/,
  `is_flexible_daily_budgets` boolean /*Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;.*/,
  `lifetime_spend_cap` int /*Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.*/,
  `order_line_id` text /*Order line ID that appears on the invoice.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `status` long,
  `tracking_urls` long,
  `default_ad_group_budget_in_micro_currency` int /*When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.*/,
  `is_campaign_budget_optimization` boolean /*Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.*/,
  `bid_options` long,
  `is_performance_plus` boolean /*Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignCreateResponse` generated from model 'campaignCreateResponse'
--

CREATE TABLE IF NOT EXISTS `CampaignCreateResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CampaignCreateResponseCampaignCreateResponseItem` generated from model 'CampaignCreateResponseCampaignCreateResponseItem'

CREATE TABLE IF NOT EXISTS `CampaignCreateResponseCampaignCreateResponseItem` (
  `campaignCreateResponse` long NOT NULL
  `campaignCreateResponseItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignCreateResponseData` generated from model 'campaignCreateResponseData'
--

CREATE TABLE IF NOT EXISTS `CampaignCreateResponseData` (
  `ad_account_id` text /*Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.*/,
  `daily_spend_cap` int /*Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.*/,
  `end_time` int /*Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `is_automated_campaign` boolean /*Specifies whether the campaign was created in the automated campaign flow*/,
  `is_flexible_daily_budgets` boolean /*Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;.*/,
  `lifetime_spend_cap` int /*Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.*/,
  `name` text /*Campaign name.*/,
  `order_line_id` text /*Order line ID that appears on the invoice.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `status` long,
  `tracking_urls` long,
  `default_ad_group_budget_in_micro_currency` int /*When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.*/,
  `is_campaign_budget_optimization` boolean /*Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.*/,
  `id` text PRIMARY KEY /*Campaign ID.*/,
  `bid_options` long,
  `created_time` int /*Campaign creation time. Unix timestamp in seconds.*/,
  `is_performance_plus` boolean /*Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;.*/,
  `objective_type` long,
  `summary_status` long,
  `type` text /*Always \&quot;campaign\&quot;.*/,
  `updated_time` int /*UTC timestamp. Last update time.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignCreateResponseItem` generated from model 'campaignCreateResponseItem'
--

CREATE TABLE IF NOT EXISTS `CampaignCreateResponseItem` (
  `data` long,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CampaignCreateResponseItemException` generated from model 'CampaignCreateResponseItemException'

CREATE TABLE IF NOT EXISTS `CampaignCreateResponseItemException` (
  `campaignCreateResponseItem` long NOT NULL
  `exception` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignId` generated from model 'campaignId'
--

CREATE TABLE IF NOT EXISTS `CampaignId` (
  `id` text PRIMARY KEY /*Campaign ID.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignIdFilter` generated from model 'campaignIdFilter'
--

CREATE TABLE IF NOT EXISTS `CampaignIdFilter` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CampaignIdFilterCampaignIds` generated from model 'CampaignIdFilterCampaignIds'

CREATE TABLE IF NOT EXISTS `CampaignIdFilterCampaignIds` (
  `campaignIdFilter` long NOT NULL
  `campaignIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignObjectivesFilter` generated from model 'campaignObjectivesFilter'
--

CREATE TABLE IF NOT EXISTS `CampaignObjectivesFilter` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CampaignObjectivesFilterObjectiveType` generated from model 'CampaignObjectivesFilterObjectiveType'

CREATE TABLE IF NOT EXISTS `CampaignObjectivesFilterObjectiveType` (
  `campaignObjectivesFilter` long NOT NULL
  `objectiveType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignResponse` generated from model 'campaignResponse'
--

CREATE TABLE IF NOT EXISTS `CampaignResponse` (
  `id` text PRIMARY KEY /*Campaign ID.*/,
  `ad_account_id` text /*Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.*/,
  `daily_spend_cap` int /*Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.*/,
  `end_time` int /*Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `is_automated_campaign` boolean /*Specifies whether the campaign was created in the automated campaign flow*/,
  `is_flexible_daily_budgets` boolean /*Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;.*/,
  `lifetime_spend_cap` int /*Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.*/,
  `name` text /*Campaign name.*/,
  `order_line_id` text /*Order line ID that appears on the invoice.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `status` long,
  `tracking_urls` long,
  `bid_options` long,
  `created_time` int /*Campaign creation time. Unix timestamp in seconds.*/,
  `is_campaign_budget_optimization` boolean /*Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.*/,
  `is_performance_plus` boolean /*Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;.*/,
  `objective_type` long,
  `summary_status` long,
  `type` text /*Always \&quot;campaign\&quot;.*/,
  `updated_time` int /*UTC timestamp. Last update time.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignUpdateRequest` generated from model 'campaignUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `CampaignUpdateRequest` (
  `id` text NOT NULL PRIMARY KEY /*Campaign ID.*/,
  `ad_account_id` text NOT NULL /*Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.*/,
  `daily_spend_cap` int /*Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.*/,
  `end_time` int /*Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `is_automated_campaign` boolean /*Specifies whether the campaign was created in the automated campaign flow*/,
  `is_flexible_daily_budgets` boolean /*Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;.*/,
  `lifetime_spend_cap` int /*Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.*/,
  `name` text /*Campaign name.*/,
  `order_line_id` text /*Order line ID that appears on the invoice.*/,
  `start_time` int /*Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.*/,
  `status` long,
  `tracking_urls` long,
  `default_ad_group_budget_in_micro_currency` int /*When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.*/,
  `is_campaign_budget_optimization` boolean /*Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.*/,
  `bid_options` long,
  `is_performance_plus` boolean /*Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. This field is immutable, except only for campaigns in draft status which may update this field.*/,
  `objective_type` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignUpdateResponse` generated from model 'campaignUpdateResponse'
--

CREATE TABLE IF NOT EXISTS `CampaignUpdateResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CampaignUpdateResponseCampaignCreateResponseItem` generated from model 'CampaignUpdateResponseCampaignCreateResponseItem'

CREATE TABLE IF NOT EXISTS `CampaignUpdateResponseCampaignCreateResponseItem` (
  `campaignUpdateResponse` long NOT NULL
  `campaignCreateResponseItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignsAnalyticsResponse_inner` generated from model 'campaignsAnalyticsResponseInner'
--

CREATE TABLE IF NOT EXISTS `CampaignsAnalyticsResponse_inner` (
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
-- Table structure for table `CampaignsList200ResponseCampaignResponse` generated from model 'CampaignsList200ResponseCampaignResponse'

CREATE TABLE IF NOT EXISTS `CampaignsList200ResponseCampaignResponse` (
  `campaignsList200Response` long NOT NULL
  `campaignResponse` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CancelInvitesBody` generated from model 'cancelInvitesBody'
-- Request body used to cancel invites
--

CREATE TABLE IF NOT EXISTS `CancelInvitesBody` (
);  /*Request body used to cancel invites*/

-- --------------------------------------------------------------------------
-- Table structure for table `CancelInvitesBodyInviteIds` generated from model 'CancelInvitesBodyInviteIds'

CREATE TABLE IF NOT EXISTS `CancelInvitesBodyInviteIds` (
  `cancelInvitesBody` long NOT NULL
  `inviteIds` text NOT NULL
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
-- Table structure for table `Catalog` generated from model 'catalog'
-- Catalog entity
--

CREATE TABLE IF NOT EXISTS `Catalog` (
  `created_at` datetime NOT NULL,
  `id` text NOT NULL PRIMARY KEY /*ID of the catalog entity.*/,
  `updated_at` datetime NOT NULL,
  `catalog_type` long NOT NULL,
  `name` text NOT NULL /*A human-friendly name associated to a catalog entity.*/
);  /*Catalog entity*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsAvailableFilterValues` generated from model 'catalogsAvailableFilterValues'
-- Object holding available filter values for each filter key
--

CREATE TABLE IF NOT EXISTS `CatalogsAvailableFilterValues` (
  `catalog_type` text NOT NULL,
  `filter_values` long NOT NULL
);  /*Object holding available filter values for each filter key*/


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
-- Table structure for table `CatalogsCreateRequest` generated from model 'catalogsCreateRequest'
-- Request object for creating a catalog.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreateRequest` (
  `catalog_type` long NOT NULL,
  `name` text NOT NULL /*A human-friendly name associated to a given catalog.*/
);  /*Request object for creating a catalog.*/


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
  `visibility` text /*Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.*/,
  `image_link` text /*The creative assets image.*/,
  `video_link` text /*The creative assets video.*/
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
  `created_at` datetime NOT NULL,
  `id` text NOT NULL PRIMARY KEY,
  `updated_at` datetime NOT NULL,
  `catalog_id` text NOT NULL /*Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.*/,
  `catalog_type` long NOT NULL,
  `credentials` long NOT NULL,
  `default_country` long NOT NULL,
  `default_currency` long NOT NULL,
  `default_locale` text NOT NULL /*The locale used within a feed for product descriptions.*/,
  `format` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text NOT NULL /*A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.*/,
  `preferred_processing_schedule` long NOT NULL,
  `status` long NOT NULL
);  /*Catalogs Creative Asset Feed object*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsFeedsCreateRequest` generated from model 'catalogsCreativeAssetsFeedsCreateRequest'
-- Request object for creating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsFeedsCreateRequest` (
  `catalog_type` long NOT NULL,
  `default_country` long NOT NULL,
  `default_locale` long NOT NULL,
  `format` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text NOT NULL /*A human-friendly name associated to a given feed.*/,
  `catalog_id` text /*Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.*/,
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
  `catalog_type` long NOT NULL,
  `credentials` long,
  `default_currency` long,
  `format` long,
  `location` text /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text /*A human-friendly name associated to a given feed.*/,
  `preferred_processing_schedule` long,
  `status` long
);  /*Request object for updating a feed.*/


-- --------------------------------------------------------------------------
-- Table structure for table `catalogs_creative_assets_filter_values_map` generated from model 'catalogsCreativeAssetsFilterValuesMap'
-- A map of filter attributes to their available values.
--

CREATE TABLE IF NOT EXISTS `catalogs_creative_assets_filter_values_map` (
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
  `mediaType` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsItemErrorResponse` generated from model 'catalogsCreativeAssetsItemErrorResponse'
-- Object describing a creative assets item error
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsItemErrorResponse` (
  `catalog_type` long NOT NULL,
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
-- Object describing a hotel record
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsItemResponse` (
  `catalog_type` long NOT NULL,
  `attributes` long,
  `creative_assets_id` text /*The catalog creative assets id in the merchant namespace*/,
);  /*Object describing a hotel record*/

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
  `catalog_type` long NOT NULL,
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
-- Table structure for table `CatalogsCreativeAssetsItemsFilter` generated from model 'catalogsCreativeAssetsItemsFilter'
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsItemsFilter` (
  `catalog_type` text NOT NULL,
  `catalog_id` text /*Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsItemsFilterCreativeAssetsIds` generated from model 'CatalogsCreativeAssetsItemsFilterCreativeAssetsIds'

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsItemsFilterCreativeAssetsIds` (
  `catalogsCreativeAssetsItemsFilter` long NOT NULL
  `creativeAssetsIds` text NOT NULL
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
  `catalog_id` text NOT NULL /*Catalog id pertaining to the creative assets product group.*/,
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
  `catalog_id` text NOT NULL /*Catalog id pertaining to the creative assets product group.*/,
  `catalog_type` text NOT NULL,
  `filters` long NOT NULL,
  `id` text NOT NULL PRIMARY KEY /*ID of the creative assets product group.*/,
  `created_at` int /*Unix timestamp in seconds of when catalog product group was created.*/,
  `description` text,
  `name` text /*Name of creative assets product group*/,
  `updated_at` int /*Unix timestamp in seconds of last time catalog product group was updated.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreativeAssetsProductGroupCreateRequest` generated from model 'catalogsCreativeAssetsProductGroupCreateRequest'
-- Request object for creating a creative assets product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreativeAssetsProductGroupCreateRequest` (
  `catalog_id` text NOT NULL /*Catalog id pertaining to the creative assets product group.*/,
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
  `TITLE_KEYWORDS` long NOT NULL
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
  `catalog_type` text NOT NULL,
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
  `name` text
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
-- Table structure for table `CatalogsDbItem` generated from model 'catalogsDbItem'
--

CREATE TABLE IF NOT EXISTS `CatalogsDbItem` (
  `created_at` datetime NOT NULL,
  `id` text NOT NULL PRIMARY KEY,
  `updated_at` datetime NOT NULL
); 


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
  `created_at` datetime NOT NULL,
  `id` text NOT NULL PRIMARY KEY,
  `updated_at` datetime NOT NULL,
  `catalog_type` long NOT NULL,
  `credentials` long NOT NULL,
  `default_availability` long NOT NULL,
  `default_country` long NOT NULL,
  `default_currency` long NOT NULL,
  `default_locale` text NOT NULL /*The locale used within a feed for product descriptions.*/,
  `format` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text NOT NULL /*A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.*/,
  `preferred_processing_schedule` long NOT NULL,
  `status` long NOT NULL,
  `catalog_id` text NOT NULL /*Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.*/
);  /*Catalogs Feed object*/


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
  `created_at` datetime NOT NULL,
  `feed_id` text NOT NULL,
  `id` text NOT NULL PRIMARY KEY,
  `status` long NOT NULL
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
  `id` text NOT NULL PRIMARY KEY,
  `updated_at` datetime NOT NULL,
  `ingestion_details` long NOT NULL,
  `product_counts` long NOT NULL,
  `status` long NOT NULL,
  `validation_details` long NOT NULL,
  `video_counts` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedProcessingSchedule` generated from model 'catalogsFeedProcessingSchedule'
-- Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedProcessingSchedule` (
  `time` text NOT NULL /*A time in format HH:MM with leading 0 (zero)*/,
  `timezone` text NOT NULL /*The timezone considered for the processing schedule time.*/
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
  `FETCH_INACTIVE_FEED_ERROR` int /*Your feed wasn&#39;t ingested because it hasn’t changed in the previous 90 days.*/,
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
  `address` long,
  `base_price` text /*Base price of the hotel room per night followed by the ISO currency code*/,
  `brand` text /*The brand to which this hotel belongs to.*/,
  `category` text /*The type of property. The category can be any type of internal description desired.*/,
  `custom_label_0` text /*Custom grouping of hotels*/,
  `custom_label_1` text /*Custom grouping of hotels*/,
  `custom_label_2` text /*Custom grouping of hotels*/,
  `custom_label_3` text /*Custom grouping of hotels*/,
  `custom_label_4` text /*Custom grouping of hotels*/,
  `description` text /*Brief description of the hotel.*/,
  `guest_ratings` long,
  `latitude` decimal /*Latitude of the hotel.*/,
  `link` text /*Link to the product page*/,
  `longitude` decimal /*Longitude of the hotel.*/,
  `name` text /*The hotel&#39;s name.*/,
  `sale_price` text /*Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.*/,
  `main_image` long
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
-- Table structure for table `CatalogsHotelAttributes_allOf_main_image` generated from model 'catalogsHotelAttributesAllOfMainImage'
-- The main hotel image
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelAttributes_allOf_main_image` (
  `link` text /*&lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.&lt;/p&gt;*/,
);  /*The main hotel image*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelAttributesAllOfMainImageTag` generated from model 'CatalogsHotelAttributesAllOfMainImageTag'

CREATE TABLE IF NOT EXISTS `CatalogsHotelAttributesAllOfMainImageTag` (
  `catalogsHotelAttributesAllOfMainImage` long NOT NULL
  `tag` text NOT NULL
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
  `created_at` datetime NOT NULL,
  `id` text NOT NULL PRIMARY KEY,
  `updated_at` datetime NOT NULL,
  `catalog_id` text NOT NULL /*Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.*/,
  `catalog_type` long NOT NULL,
  `credentials` long NOT NULL,
  `default_currency` long NOT NULL,
  `default_locale` text NOT NULL /*The locale used within a feed for product descriptions.*/,
  `format` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text NOT NULL /*A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.*/,
  `preferred_processing_schedule` long NOT NULL,
  `status` long NOT NULL
);  /*Catalogs Hotel Feed object*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelFeedsCreateRequest` generated from model 'catalogsHotelFeedsCreateRequest'
-- Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelFeedsCreateRequest` (
  `catalog_type` long NOT NULL,
  `default_locale` long NOT NULL,
  `format` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text NOT NULL /*A human-friendly name associated to a given feed.*/,
  `catalog_id` text /*Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.*/,
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
  `catalog_type` long NOT NULL,
  `credentials` long,
  `default_currency` long,
  `format` long,
  `location` text /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text /*A human-friendly name associated to a given feed.*/,
  `preferred_processing_schedule` long,
  `status` long
);  /*Request object for updating a feed.*/


-- --------------------------------------------------------------------------
-- Table structure for table `catalogs_hotel_filter_values_map` generated from model 'catalogsHotelFilterValuesMap'
-- A map of filter attributes to their available values.
--

CREATE TABLE IF NOT EXISTS `catalogs_hotel_filter_values_map` (
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
-- If specified, you must provide all properties
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelGuestRatings` (
  `max_score` decimal /*Max value for the hotel rating score.*/,
  `number_of_reviewers` int /*Total number of people who have rated this hotel.*/,
  `rating_system` text /*System you use for guest reviews.*/,
  `score` decimal /*Your hotel&#39;s rating.*/
);  /*If specified, you must provide all properties*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelItemErrorResponse` generated from model 'catalogsHotelItemErrorResponse'
-- Object describing a hotel item error
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelItemErrorResponse` (
  `catalog_type` long NOT NULL,
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
  `catalog_type` long NOT NULL,
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
-- Object describing the catalogs hotel items batch
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelItemsBatch` (
  `catalog_type` long NOT NULL,
  `batch_id` text /*Id of the catalogs items batch*/,
  `completed_time` datetime /*Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss*/,
  `created_time` datetime /*Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss*/,
  `status` long
);  /*Object describing the catalogs hotel items batch*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelItemsBatchHotelProcessingRecord` generated from model 'CatalogsHotelItemsBatchHotelProcessingRecord'

CREATE TABLE IF NOT EXISTS `CatalogsHotelItemsBatchHotelProcessingRecord` (
  `catalogsHotelItemsBatch` long NOT NULL
  `hotelProcessingRecord` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelItemsFilter` generated from model 'catalogsHotelItemsFilter'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelItemsFilter` (
  `catalog_type` text NOT NULL,
  `catalog_id` text /*Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelItemsFilterHotelIds` generated from model 'CatalogsHotelItemsFilterHotelIds'

CREATE TABLE IF NOT EXISTS `CatalogsHotelItemsFilterHotelIds` (
  `catalogsHotelItemsFilter` long NOT NULL
  `hotelIds` text NOT NULL
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
  `catalog_id` text NOT NULL /*Catalog id pertaining to the hotel product group.*/,
  `catalog_type` text NOT NULL,
  `filters` long NOT NULL
);  /*Request object to list products for a given hotel catalog_id and product group filter.*/


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
  `catalog_id` text NOT NULL /*Catalog id pertaining to the hotel product group.*/,
  `catalog_type` text NOT NULL,
  `filters` long NOT NULL,
  `id` text NOT NULL PRIMARY KEY /*ID of the hotel product group.*/,
  `type` long NOT NULL,
  `created_at` int /*Unix timestamp in seconds of when catalog product group was created.*/,
  `description` text,
  `name` text /*Name of hotel product group*/,
  `updated_at` int /*Unix timestamp in seconds of last time catalog product group was updated.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelProductGroupCreateRequest` generated from model 'catalogsHotelProductGroupCreateRequest'
-- Request object for creating a hotel product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroupCreateRequest` (
  `catalog_id` text NOT NULL /*Catalog id pertaining to the hotel product group.*/,
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
  `name` text
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
-- Table structure for table `CatalogsHotelReportParameters_report` generated from model 'catalogsHotelReportParametersReport'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelReportParameters_report` (
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
-- Table structure for table `CatalogsHotelReportStatsParameters_report` generated from model 'catalogsHotelReportStatsParametersReport'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelReportStatsParameters_report` (
  `feed_id` text NOT NULL /*ID of the feed entity.*/,
  `report_type` text NOT NULL,
  `processing_result_id` text /*Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.*/,
  `catalog_id` text /*Unique identifier of a catalog. If not given, oldest catalog will be used*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemValidationDetails` generated from model 'catalogsItemValidationDetails'
--

CREATE TABLE IF NOT EXISTS `CatalogsItemValidationDetails` (
  `attribute_name` long NOT NULL,
  `provided_value` text NOT NULL /*Provided value that caused the validation issue.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemValidationErrors` generated from model 'catalogsItemValidationErrors'
--

CREATE TABLE IF NOT EXISTS `CatalogsItemValidationErrors` (
  `ADULT_INVALID` long,
  `ADWORDS_FORMAT_INVALID` long,
  `AVAILABILITY_INVALID` long,
  `BLOCKLISTED_IMAGE_SIGNATURE` long,
  `DESCRIPTION_MISSING` long,
  `DUPLICATE_PRODUCTS` long,
  `IMAGE_LINK_INVALID` long,
  `IMAGE_LINK_LENGTH_TOO_LONG` long,
  `IMAGE_LINK_MISSING` long,
  `INVALID_DOMAIN` long,
  `ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` long,
  `ITEMID_MISSING` long,
  `LINK_FORMAT_INVALID` long,
  `LINK_LENGTH_TOO_LONG` long,
  `LIST_PRICE_INVALID` long,
  `MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED` long,
  `PARSE_LINE_ERROR` long,
  `PINJOIN_CONTENT_UNSAFE` long,
  `PRICE_CANNOT_BE_DETERMINED` long,
  `PRICE_MISSING` long,
  `PRODUCT_LINK_MISSING` long,
  `PRODUCT_PRICE_INVALID` long,
  `TITLE_MISSING` long
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
  `AD_IMAGE_0_LINK_DUPLICATED` long,
  `AD_IMAGE_0_LINK_LENGTH_TOO_LONG` long,
  `AD_IMAGE_0_LINK_REQUIRED` long,
  `AD_IMAGE_0_LINK_WARNING` long,
  `AD_IMAGE_0_TAG_DUPLICATED` long,
  `AD_IMAGE_0_TAG_LENGTH_TOO_LONG` long,
  `AD_IMAGE_0_TAG_REQUIRED` long,
  `AD_IMAGE_10_LINK_DUPLICATED` long,
  `AD_IMAGE_10_LINK_LENGTH_TOO_LONG` long,
  `AD_IMAGE_10_LINK_REQUIRED` long,
  `AD_IMAGE_10_LINK_WARNING` long,
  `AD_IMAGE_10_TAG_DUPLICATED` long,
  `AD_IMAGE_10_TAG_LENGTH_TOO_LONG` long,
  `AD_IMAGE_10_TAG_REQUIRED` long,
  `AD_IMAGE_11_LINK_DUPLICATED` long,
  `AD_IMAGE_11_LINK_LENGTH_TOO_LONG` long,
  `AD_IMAGE_11_LINK_REQUIRED` long,
  `AD_IMAGE_11_LINK_WARNING` long,
  `AD_IMAGE_11_TAG_DUPLICATED` long,
  `AD_IMAGE_11_TAG_LENGTH_TOO_LONG` long,
  `AD_IMAGE_11_TAG_REQUIRED` long,
  `AD_IMAGE_12_LINK_DUPLICATED` long,
  `AD_IMAGE_12_LINK_LENGTH_TOO_LONG` long,
  `AD_IMAGE_12_LINK_REQUIRED` long,
  `AD_IMAGE_12_LINK_WARNING` long,
  `AD_IMAGE_12_TAG_DUPLICATED` long,
  `AD_IMAGE_12_TAG_LENGTH_TOO_LONG` long,
  `AD_IMAGE_12_TAG_REQUIRED` long,
  `AD_IMAGE_13_LINK_DUPLICATED` long,
  `AD_IMAGE_13_LINK_LENGTH_TOO_LONG` long,
  `AD_IMAGE_13_LINK_REQUIRED` long,
  `AD_IMAGE_13_LINK_WARNING` long,
  `AD_IMAGE_13_TAG_DUPLICATED` long,
  `AD_IMAGE_13_TAG_LENGTH_TOO_LONG` long,
  `AD_IMAGE_13_TAG_REQUIRED` long,
  `AD_IMAGE_14_LINK_DUPLICATED` long,
  `AD_IMAGE_14_LINK_LENGTH_TOO_LONG` long,
  `AD_IMAGE_14_LINK_REQUIRED` long,
  `AD_IMAGE_14_LINK_WARNING` long,
  `AD_IMAGE_14_TAG_DUPLICATED` long,
  `AD_IMAGE_14_TAG_LENGTH_TOO_LONG` long,
  `AD_IMAGE_14_TAG_REQUIRED` long,
  `AD_IMAGE_15_LINK_DUPLICATED` long,
  `AD_IMAGE_15_LINK_LENGTH_TOO_LONG` long,
  `AD_IMAGE_15_LINK_REQUIRED` long,
  `AD_IMAGE_15_LINK_WARNING` long,
  `AD_IMAGE_15_TAG_DUPLICATED` long,
  `AD_IMAGE_15_TAG_LENGTH_TOO_LONG` long,
  `AD_IMAGE_15_TAG_REQUIRED` long,
  `AD_IMAGE_16_LINK_DUPLICATED` long,
  `AD_IMAGE_16_LINK_LENGTH_TOO_LONG` long,
  `AD_IMAGE_16_LINK_REQUIRED` long,
  `AD_IMAGE_16_LINK_WARNING` long,
  `AD_IMAGE_16_TAG_DUPLICATED` long,
  `AD_IMAGE_16_TAG_LENGTH_TOO_LONG` long,
  `AD_IMAGE_16_TAG_REQUIRED` long,
  `AD_IMAGE_17_LINK_DUPLICATED` long,
  `AD_IMAGE_17_LINK_LENGTH_TOO_LONG` long,
  `AD_IMAGE_17_LINK_REQUIRED` long,
  `AD_IMAGE_17_LINK_WARNING` long,
  `AD_IMAGE_17_TAG_DUPLICATED` long,
  `AD_IMAGE_17_TAG_LENGTH_TOO_LONG` long,
  `AD_IMAGE_17_TAG_REQUIRED` long,
  `AD_IMAGE_18_LINK_DUPLICATED` long,
  `AD_IMAGE_18_LINK_LENGTH_TOO_LONG` long,
  `AD_IMAGE_18_LINK_REQUIRED` long,
  `AD_IMAGE_18_LINK_WARNING` long,
  `AD_IMAGE_18_TAG_DUPLICATED` long,
  `AD_IMAGE_18_TAG_LENGTH_TOO_LONG` long,
  `AD_IMAGE_18_TAG_REQUIRED` long,
  `AD_IMAGE_19_LINK_DUPLICATED` long,
  `AD_IMAGE_19_LINK_LENGTH_TOO_LONG` long,
  `AD_IMAGE_19_LINK_REQUIRED` long,
  `AD_IMAGE_19_LINK_WARNING` long,
  `AD_IMAGE_19_TAG_DUPLICATED` long,
  `AD_IMAGE_19_TAG_LENGTH_TOO_LONG` long,
  `AD_IMAGE_19_TAG_REQUIRED` long,
  `AD_IMAGE_1_LINK_DUPLICATED` long,
  `AD_IMAGE_1_LINK_LENGTH_TOO_LONG` long,
  `AD_IMAGE_1_LINK_REQUIRED` long,
  `AD_IMAGE_1_LINK_WARNING` long,
  `AD_IMAGE_1_TAG_DUPLICATED` long,
  `AD_IMAGE_1_TAG_LENGTH_TOO_LONG` long,
  `AD_IMAGE_1_TAG_REQUIRED` long,
  `AD_IMAGE_2_LINK_DUPLICATED` long,
  `AD_IMAGE_2_LINK_LENGTH_TOO_LONG` long,
  `AD_IMAGE_2_LINK_REQUIRED` long,
  `AD_IMAGE_2_LINK_WARNING` long,
  `AD_IMAGE_2_TAG_DUPLICATED` long,
  `AD_IMAGE_2_TAG_LENGTH_TOO_LONG` long,
  `AD_IMAGE_2_TAG_REQUIRED` long,
  `AD_IMAGE_3_LINK_DUPLICATED` long,
  `AD_IMAGE_3_LINK_LENGTH_TOO_LONG` long,
  `AD_IMAGE_3_LINK_REQUIRED` long,
  `AD_IMAGE_3_LINK_WARNING` long,
  `AD_IMAGE_3_TAG_DUPLICATED` long,
  `AD_IMAGE_3_TAG_LENGTH_TOO_LONG` long,
  `AD_IMAGE_3_TAG_REQUIRED` long,
  `AD_IMAGE_4_LINK_DUPLICATED` long,
  `AD_IMAGE_4_LINK_LENGTH_TOO_LONG` long,
  `AD_IMAGE_4_LINK_REQUIRED` long,
  `AD_IMAGE_4_LINK_WARNING` long,
  `AD_IMAGE_4_TAG_DUPLICATED` long,
  `AD_IMAGE_4_TAG_LENGTH_TOO_LONG` long,
  `AD_IMAGE_4_TAG_REQUIRED` long,
  `AD_IMAGE_5_LINK_DUPLICATED` long,
  `AD_IMAGE_5_LINK_LENGTH_TOO_LONG` long,
  `AD_IMAGE_5_LINK_REQUIRED` long,
  `AD_IMAGE_5_LINK_WARNING` long,
  `AD_IMAGE_5_TAG_DUPLICATED` long,
  `AD_IMAGE_5_TAG_LENGTH_TOO_LONG` long,
  `AD_IMAGE_5_TAG_REQUIRED` long,
  `AD_IMAGE_6_LINK_DUPLICATED` long,
  `AD_IMAGE_6_LINK_LENGTH_TOO_LONG` long,
  `AD_IMAGE_6_LINK_REQUIRED` long,
  `AD_IMAGE_6_LINK_WARNING` long,
  `AD_IMAGE_6_TAG_DUPLICATED` long,
  `AD_IMAGE_6_TAG_LENGTH_TOO_LONG` long,
  `AD_IMAGE_6_TAG_REQUIRED` long,
  `AD_IMAGE_7_LINK_DUPLICATED` long,
  `AD_IMAGE_7_LINK_LENGTH_TOO_LONG` long,
  `AD_IMAGE_7_LINK_REQUIRED` long,
  `AD_IMAGE_7_LINK_WARNING` long,
  `AD_IMAGE_7_TAG_DUPLICATED` long,
  `AD_IMAGE_7_TAG_LENGTH_TOO_LONG` long,
  `AD_IMAGE_7_TAG_REQUIRED` long,
  `AD_IMAGE_8_LINK_DUPLICATED` long,
  `AD_IMAGE_8_LINK_LENGTH_TOO_LONG` long,
  `AD_IMAGE_8_LINK_REQUIRED` long,
  `AD_IMAGE_8_LINK_WARNING` long,
  `AD_IMAGE_8_TAG_DUPLICATED` long,
  `AD_IMAGE_8_TAG_LENGTH_TOO_LONG` long,
  `AD_IMAGE_8_TAG_REQUIRED` long,
  `AD_IMAGE_9_LINK_DUPLICATED` long,
  `AD_IMAGE_9_LINK_LENGTH_TOO_LONG` long,
  `AD_IMAGE_9_LINK_REQUIRED` long,
  `AD_IMAGE_9_LINK_WARNING` long,
  `AD_IMAGE_9_TAG_DUPLICATED` long,
  `AD_IMAGE_9_TAG_LENGTH_TOO_LONG` long,
  `AD_IMAGE_9_TAG_REQUIRED` long,
  `AD_LINK_FORMAT_WARNING` long,
  `AD_LINK_SAME_AS_LINK` long,
  `AD_VIDEO_0_LINK_DUPLICATED` long,
  `AD_VIDEO_0_LINK_LENGTH_TOO_LONG` long,
  `AD_VIDEO_0_LINK_REQUIRED` long,
  `AD_VIDEO_0_LINK_WARNING` long,
  `AD_VIDEO_0_TAG_DUPLICATED` long,
  `AD_VIDEO_0_TAG_LENGTH_TOO_LONG` long,
  `AD_VIDEO_0_TAG_REQUIRED` long,
  `AD_VIDEO_1_LINK_DUPLICATED` long,
  `AD_VIDEO_1_LINK_LENGTH_TOO_LONG` long,
  `AD_VIDEO_1_LINK_REQUIRED` long,
  `AD_VIDEO_1_LINK_WARNING` long,
  `AD_VIDEO_1_TAG_DUPLICATED` long,
  `AD_VIDEO_1_TAG_LENGTH_TOO_LONG` long,
  `AD_VIDEO_1_TAG_REQUIRED` long,
  `AD_VIDEO_2_LINK_DUPLICATED` long,
  `AD_VIDEO_2_LINK_LENGTH_TOO_LONG` long,
  `AD_VIDEO_2_LINK_REQUIRED` long,
  `AD_VIDEO_2_LINK_WARNING` long,
  `AD_VIDEO_2_TAG_DUPLICATED` long,
  `AD_VIDEO_2_TAG_LENGTH_TOO_LONG` long,
  `AD_VIDEO_2_TAG_REQUIRED` long,
  `ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG` long,
  `ADDITIONAL_IMAGE_LINK_WARNING` long,
  `ADWORDS_FORMAT_WARNING` long,
  `ADWORDS_SAME_AS_LINK` long,
  `AGE_GROUP_INVALID` long,
  `ANDROID_DEEP_LINK_INVALID` long,
  `AVAILABILITY_DATE_INVALID` long,
  `COUNTRY_DOES_NOT_MAP_TO_CURRENCY` long,
  `CUSTOM_LABEL_LENGTH_TOO_LONG` long,
  `DESCRIPTION_LENGTH_TOO_LONG` long,
  `EXPIRATION_DATE_INVALID` long,
  `GENDER_INVALID` long,
  `GTIN_INVALID` long,
  `IMAGE_LINK_WARNING` long,
  `IOS_DEEP_LINK_INVALID` long,
  `IS_BUNDLE_INVALID` long,
  `ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE` long,
  `LINK_FORMAT_WARNING` long,
  `MIN_AD_PRICE_INVALID` long,
  `MPN_INVALID` long,
  `MULTIPACK_INVALID` long,
  `OPTIONAL_CONDITION_INVALID` long,
  `OPTIONAL_CONDITION_MISSING` long,
  `OPTIONAL_PRODUCT_CATEGORY_INVALID` long,
  `OPTIONAL_PRODUCT_CATEGORY_MISSING` long,
  `PRODUCT_CATEGORY_DEPTH_WARNING` long,
  `PRODUCT_TYPE_LENGTH_TOO_LONG` long,
  `SALE_DATE_INVALID` long,
  `SALES_PRICE_INVALID` long,
  `SALES_PRICE_TOO_HIGH` long,
  `SALES_PRICE_TOO_LOW` long,
  `SHIPPING_HEIGHT_INVALID` long,
  `SHIPPING_INVALID` long,
  `SHIPPING_WEIGHT_INVALID` long,
  `SHIPPING_WIDTH_INVALID` long,
  `SIZE_SYSTEM_INVALID` long,
  `SIZE_TYPE_INVALID` long,
  `TAX_INVALID` long,
  `TITLE_LENGTH_TOO_LONG` long,
  `TOO_MANY_ADDITIONAL_IMAGE_LINKS` long,
  `UTM_SOURCE_AUTO_CORRECTED` long,
  `VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED` long,
  `WEIGHT_UNIT_INVALID` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItems` generated from model 'catalogsItems'
-- Response object of catalogs items
--

CREATE TABLE IF NOT EXISTS `CatalogsItems` (
);  /*Response object of catalogs items*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsItemResponse` generated from model 'CatalogsItemsItemResponse'

CREATE TABLE IF NOT EXISTS `CatalogsItemsItemResponse` (
  `catalogsItems` long NOT NULL
  `itemResponse` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsBatch` generated from model 'catalogsItemsBatch'
-- Object describing the catalogs items batch
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsBatch` (
  `catalog_type` long NOT NULL,
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
-- Table structure for table `CatalogsItemsBatchRequest` generated from model 'catalogsItemsBatchRequest'
-- Request object of catalogs items batch
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsBatchRequest` (
  `country` long NOT NULL,
  `language` text NOT NULL /*We recommend using the CatalogsLocale values.*/,
  `operation` long NOT NULL
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
  `operation` long NOT NULL
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
  `operation` long NOT NULL
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
  `operation` long NOT NULL
);  /*Request object to discontinue catalogs items*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsDeleteDiscontinuedBatchRequestItemDeleteDiscontinuedBatchRecord` generated from model 'CatalogsItemsDeleteDiscontinuedBatchRequestItemDeleteDiscontinuedBatchRecord'

CREATE TABLE IF NOT EXISTS `CatalogsItemsDeleteDiscontinuedBatchRequestItemDeleteDiscontinuedBatchRecord` (
  `catalogsItemsDeleteDiscontinuedBatchRequest` long NOT NULL
  `itemDeleteDiscontinuedBatchRecord` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsFilters` generated from model 'catalogsItemsFilters'
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsFilters` (
  `catalog_type` text NOT NULL,
  `catalog_id` text /*Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsFiltersItemIds` generated from model 'CatalogsItemsFiltersItemIds'

CREATE TABLE IF NOT EXISTS `CatalogsItemsFiltersItemIds` (
  `catalogsItemsFilters` long NOT NULL
  `itemIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsFiltersHotelIds` generated from model 'CatalogsItemsFiltersHotelIds'

CREATE TABLE IF NOT EXISTS `CatalogsItemsFiltersHotelIds` (
  `catalogsItemsFilters` long NOT NULL
  `hotelIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsFiltersCreativeAssetsIds` generated from model 'CatalogsItemsFiltersCreativeAssetsIds'

CREATE TABLE IF NOT EXISTS `CatalogsItemsFiltersCreativeAssetsIds` (
  `catalogsItemsFilters` long NOT NULL
  `creativeAssetsIds` text NOT NULL
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
  `operation` long NOT NULL
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
  `operation` long NOT NULL
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
  `catalog_id` text NOT NULL /*Catalog id pertaining to the creative assets product group.*/,
  `catalog_type` text NOT NULL,
  `country` long NOT NULL,
  `locale` long NOT NULL
);  /*Request object to list products for a given product group filter.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProduct` generated from model 'catalogsProduct'
-- Catalogs product for all verticals
--

CREATE TABLE IF NOT EXISTS `CatalogsProduct` (
  `catalog_type` text NOT NULL,
  `metadata` long NOT NULL,
  `pin` long NOT NULL
);  /*Catalogs product for all verticals*/


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
  `PRODUCT_GROUP` long NOT NULL,
  `CUSTOM_NUMBER_0` long NOT NULL,
  `CUSTOM_NUMBER_1` long NOT NULL,
  `CUSTOM_NUMBER_2` long NOT NULL,
  `CUSTOM_NUMBER_3` long NOT NULL,
  `CUSTOM_NUMBER_4` long NOT NULL,
  `TITLE_KEYWORDS` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupFilterOperatorTypeCriteria` generated from model 'catalogsProductGroupFilterOperatorTypeCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFilterOperatorTypeCriteria` (
  `filter_operator_type` text,
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
-- Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersRequest` (
);  /*Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.*/

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
-- Table structure for table `catalogs_product_group_pricing_currency_criteria` generated from model 'catalogsProductGroupPricingCurrencyCriteria'
--

CREATE TABLE IF NOT EXISTS `catalogs_product_group_pricing_currency_criteria` (
  `currency` long NOT NULL,
  `operator` text NOT NULL,
  `value` decimal NOT NULL,
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
  `videos` decimal NOT NULL
);  /*Product counts for a CatalogsProductGroup*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupUint32Criteria` generated from model 'catalogsProductGroupUint32Criteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupUint32Criteria` (
  `operator` text NOT NULL,
  `value` int UNSIGNED NOT NULL,
  `negated` boolean
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
-- Table structure for table `catalogs_product_groups_update_request` generated from model 'catalogsProductGroupsUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `catalogs_product_groups_update_request` (
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
-- Table structure for table `CatalogsReportAllItemsFilter` generated from model 'catalogsReportAllItemsFilter'
--

CREATE TABLE IF NOT EXISTS `CatalogsReportAllItemsFilter` (
  `report_type` text NOT NULL,
  `catalog_id` text /*Unique identifier of a catalog. If not given, oldest catalog will be used*/
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
  `report_type` text NOT NULL,
  `catalog_id` text /*ID of the catalog entity.*/,
  `code` int /*The event code that a diagnostics aggregated number references*/,
  `code_label` text /*A human-friendly label for the event code (e.g, &#39;SPAM&#39;)*/,
  `message` text /*Title message describing the diagnostic issue*/,
  `occurrences` int /*Number of occurrences of the issue*/,
  `severity` text /*An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue*/,
  `ineligible_for_ads` boolean /*Indicates if issue makes items ineligible for ads distribution*/,
  `ineligible_for_organic` boolean /*Indicates if issue makes items ineligible for organic distribution*/
);  /*Diagnostics aggregated numbers*/


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
-- Table structure for table `CatalogsRetailBatchRequestCatalogsRetailBatchRequestItemsInner` generated from model 'CatalogsRetailBatchRequestCatalogsRetailBatchRequestItemsInner'

CREATE TABLE IF NOT EXISTS `CatalogsRetailBatchRequestCatalogsRetailBatchRequestItemsInner` (
  `catalogsRetailBatchRequest` long NOT NULL
  `catalogsRetailBatchRequestItemsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailBatchRequest_items_inner` generated from model 'catalogsRetailBatchRequestItemsInner'
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailBatchRequest_items_inner` (
  `attributes` long NOT NULL,
  `item_id` text NOT NULL /*The catalog item id in the merchant namespace*/,
  `operation` text NOT NULL,
  `last_updated_time` long /*The millisecond timestamp when the item was lastly modified by the merchant.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailBatchRequestItemsInnerUpdateMaskFieldType` generated from model 'CatalogsRetailBatchRequestItemsInnerUpdateMaskFieldType'

CREATE TABLE IF NOT EXISTS `CatalogsRetailBatchRequestItemsInnerUpdateMaskFieldType` (
  `catalogsRetailBatchRequestItemsInner` long NOT NULL
  `updateMaskFieldType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFeed` generated from model 'catalogsRetailFeed'
-- Catalogs Retail Feed object
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailFeed` (
  `created_at` datetime NOT NULL,
  `id` text NOT NULL PRIMARY KEY,
  `updated_at` datetime NOT NULL,
  `catalog_type` long NOT NULL,
  `credentials` long NOT NULL,
  `default_availability` long NOT NULL,
  `default_country` long NOT NULL,
  `default_currency` long NOT NULL,
  `default_locale` text NOT NULL /*The locale used within a feed for product descriptions.*/,
  `format` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text NOT NULL /*A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.*/,
  `preferred_processing_schedule` long NOT NULL,
  `status` long NOT NULL
);  /*Catalogs Retail Feed object*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFeedsCreateRequest` generated from model 'catalogsRetailFeedsCreateRequest'
-- Request object for creating a retail feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailFeedsCreateRequest` (
  `catalog_type` long NOT NULL,
  `default_country` long NOT NULL,
  `default_locale` long NOT NULL,
  `format` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text NOT NULL /*A human-friendly name associated to a given feed.*/,
  `catalog_id` text /*Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. Currently, this field has no effect.*/,
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
  `catalog_type` long NOT NULL,
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
-- Table structure for table `catalogs_retail_filter_values_map` generated from model 'catalogsRetailFilterValuesMap'
-- A map of filter attributes to their available values.
--

CREATE TABLE IF NOT EXISTS `catalogs_retail_filter_values_map` (
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
-- Table structure for table `CatalogsRetailFilterValuesMapAvailability` generated from model 'CatalogsRetailFilterValuesMapAvailability'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapAvailability` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `availability` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapBrand` generated from model 'CatalogsRetailFilterValuesMapBrand'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapBrand` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `brand` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFilterValuesMapCondition` generated from model 'CatalogsRetailFilterValuesMapCondition'

CREATE TABLE IF NOT EXISTS `CatalogsRetailFilterValuesMapCondition` (
  `catalogsRetailFilterValuesMap` long NOT NULL
  `condition` text NOT NULL
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
  `gender` text NOT NULL
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
  `mediaType` text NOT NULL
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
  `catalog_type` long NOT NULL,
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
  `catalog_type` long NOT NULL,
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
  `catalog_type` long NOT NULL,
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
-- Table structure for table `CatalogsRetailItemsFilter` generated from model 'catalogsRetailItemsFilter'
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailItemsFilter` (
  `catalog_type` text NOT NULL,
  `catalog_id` text /*Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailItemsFilterItemIds` generated from model 'CatalogsRetailItemsFilterItemIds'

CREATE TABLE IF NOT EXISTS `CatalogsRetailItemsFilterItemIds` (
  `catalogsRetailItemsFilter` long NOT NULL
  `itemIds` text NOT NULL
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
  `catalog_id` text NOT NULL /*Catalog id pertaining to the retail product group.*/,
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
  `catalog_id` text NOT NULL /*Catalog id pertaining to the retail product group.*/,
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
  `catalog_id` text NOT NULL /*Catalog id pertaining to the retail product group.*/,
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
  `name` text
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
-- Table structure for table `CatalogsRetailReportParameters` generated from model 'catalogsRetailReportParameters'
-- Parameters for retail report
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailReportParameters` (
  `catalog_type` text NOT NULL,
  `report` long NOT NULL
);  /*Parameters for retail report*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailReportStatsParameters` generated from model 'catalogsRetailReportStatsParameters'
-- Parameters for retail report
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailReportStatsParameters` (
  `catalog_type` text NOT NULL,
  `report` long NOT NULL
);  /*Parameters for retail report*/


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
  `visibility` text /*Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsUpdatableHotelAttributes` generated from model 'catalogsUpdatableHotelAttributes'
--

CREATE TABLE IF NOT EXISTS `CatalogsUpdatableHotelAttributes` (
  `address` long,
  `base_price` text /*Base price of the hotel room per night followed by the ISO currency code*/,
  `brand` text /*The brand to which this hotel belongs to.*/,
  `category` text /*The type of property. The category can be any type of internal description desired.*/,
  `custom_label_0` text /*Custom grouping of hotels*/,
  `custom_label_1` text /*Custom grouping of hotels*/,
  `custom_label_2` text /*Custom grouping of hotels*/,
  `custom_label_3` text /*Custom grouping of hotels*/,
  `custom_label_4` text /*Custom grouping of hotels*/,
  `description` text /*Brief description of the hotel.*/,
  `guest_ratings` long,
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
  `catalog_type` long NOT NULL,
  `default_country` long NOT NULL,
  `default_locale` long NOT NULL,
  `format` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text NOT NULL /*A human-friendly name associated to a given feed.*/,
  `catalog_id` text /*Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.*/,
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
  `catalog_type` long NOT NULL,
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
  `catalog_id` text NOT NULL /*Catalog id pertaining to the creative assets product group.*/,
  `catalog_type` text NOT NULL,
  `feed_id` text NOT NULL /*id of the catalogs feed belonging to this catalog product group*/,
  `filters` long NOT NULL,
  `id` text NOT NULL PRIMARY KEY /*ID of the creative assets product group.*/,
  `type` long NOT NULL,
  `country` text,
  `created_at` int /*Unix timestamp in seconds of when catalog product group was created.*/,
  `description` text,
  `is_featured` boolean /*boolean indicator of whether the product group is being featured or not*/,
  `locale` text,
  `name` text /*Name of creative assets product group*/,
  `status` long,
  `updated_at` int /*Unix timestamp in seconds of last time catalog product group was updated.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsVerticalProductGroupCreateRequest` generated from model 'catalogsVerticalProductGroupCreateRequest'
-- Request object for creating a catalog based product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalProductGroupCreateRequest` (
  `catalog_id` text NOT NULL /*Catalog id pertaining to the creative assets product group.*/,
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
  `name` text
);  /*Request object for updating a catalog based product group.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsVerticalsListProductsByCatalogBasedFilterRequest` generated from model 'catalogsVerticalsListProductsByCatalogBasedFilterRequest'
-- Request object to list products for a given catalog_id and product group filter.
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalsListProductsByCatalogBasedFilterRequest` (
  `catalog_id` text NOT NULL /*Catalog id pertaining to the creative assets product group.*/,
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
-- Table structure for table `ConversionAccessTokenResponse` generated from model 'conversionAccessTokenResponse'
-- A successful conversion access token response.
--

CREATE TABLE IF NOT EXISTS `ConversionAccessTokenResponse` (
  `access_token` text NOT NULL,
  `token_type` text
);  /*A successful conversion access token response.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionApiResponse` generated from model 'conversionApiResponse'
-- Schema describing the object in the response, which contains information about the events that were received and processed.
--

CREATE TABLE IF NOT EXISTS `ConversionApiResponse` (
  `num_events_processed` int NOT NULL /*Number of events that were successfully processed from the events.*/,
  `num_events_received` int NOT NULL /*Total number of events received in the request.*/
);  /*Schema describing the object in the response, which contains information about the events that were received and processed.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionApiResponseConversionApiResponseEventsInner` generated from model 'ConversionApiResponseConversionApiResponseEventsInner'

CREATE TABLE IF NOT EXISTS `ConversionApiResponseConversionApiResponseEventsInner` (
  `conversionApiResponse` long NOT NULL
  `conversionApiResponseEventsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionApiResponse_events_inner` generated from model 'conversionApiResponseEventsInner'
--

CREATE TABLE IF NOT EXISTS `ConversionApiResponse_events_inner` (
  `status` text NOT NULL /*Whether the event was processed successfully.*/,
  `error_message` text /*Error message containing more information about why the event failed to be processed.*/,
  `warning_message` text /*Warning messages about any fields in the event which are not standard. These are not critical to event processing.*/
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
  `form_factor` text /*Device form factor*/,
  `kernel_version` text /*Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release*/,
  `locale` text /*Device locale BCP-47 format*/,
  `model` text /*Device model name*/,
  `network_type` text /*Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()*/,
  `os_family` text /*OS Family*/,
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
  `created_time` int /*Creation date in epoch format.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEvents` generated from model 'conversionEvents'
-- A list of events (one or more) encapsulated by a data object.
--

CREATE TABLE IF NOT EXISTS `ConversionEvents` (
);  /*A list of events (one or more) encapsulated by a data object.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsConversionEventsDataInner` generated from model 'ConversionEventsConversionEventsDataInner'

CREATE TABLE IF NOT EXISTS `ConversionEventsConversionEventsDataInner` (
  `conversionEvents` long NOT NULL
  `conversionEventsDataInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEvents_data_inner` generated from model 'conversionEventsDataInner'
--

CREATE TABLE IF NOT EXISTS `ConversionEvents_data_inner` (
  `action_source` text NOT NULL /*&lt;p&gt;The source indicating where the conversion event occurred.&lt;/p&gt; - &#x60;app_android&#x60; - &#x60;app_ios&#x60; - &#x60;web&#x60; - &#x60;offline&#x60;*/,
  `event_id` text NOT NULL /*A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.*/,
  `event_name` text NOT NULL /*&lt;p&gt;The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.&lt;/p&gt;  - &#x60;add_payment_info&#x60; - &#x60;add_to_cart&#x60; - &#x60;add_to_wishlist&#x60; - &#x60;app_install&#x60; - &#x60;checkout&#x60; - &#x60;custom&#x60; - &#x60;initiate_checkout&#x60; - &#x60;lead&#x60; - &#x60;page_visit&#x60; - &#x60;search&#x60; - &#x60;signup&#x60; - &#x60;subscribe&#x60; - &#x60;view_category&#x60; - &#x60;view_content&#x60; - &#x60;watch_video&#x60;*/,
  `event_time` long NOT NULL /*The time when the event happened. Unix timestamp in seconds.*/,
  `user_data` long NOT NULL,
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
  `partner_name` text /*The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g ‘ss-shopify’*/,
  `wifi` boolean /*Whether the event occurred when the user device was connected to wifi.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEvents_data_inner_custom_data` generated from model 'conversionEventsDataInnerCustomData'
-- Object containing other custom data.
--

CREATE TABLE IF NOT EXISTS `ConversionEvents_data_inner_custom_data` (
  `content_brand` text /*The brand of the content associated with the event.*/,
  `content_category` text /*The category of the content associated with the event.*/,
  `content_name` text /*The name of the page or product associated with the event.*/,
  `currency` text /*The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.*/,
  `external_measurement_id` text /*Only use when instructed.*/,
  `external_measurement_vendor_id` int /*Only use when instructed.*/,
  `np` text /*Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.*/,
  `num_items` long /*Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).*/,
  `opt_out_type` text /*Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/limited-data-processing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;limited data processing&lt;/a&gt; and the developer&#39;s guide for &lt;a href&#x3D;\&quot;/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events\&quot; target&#x3D;\&quot;_blank\&quot;&gt;tracking conversion events&lt;/a&gt; for help with using this parameter.*/,
  `order_id` text /*The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.*/,
  `predicted_ltv` text /*Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.*/,
  `search_string` text /*The search string related to the user conversion event.*/,
  `value` text /*Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.*/
);  /*Object containing other custom data.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsDataInnerCustomDataContentIds` generated from model 'ConversionEventsDataInnerCustomDataContentIds'

CREATE TABLE IF NOT EXISTS `ConversionEventsDataInnerCustomDataContentIds` (
  `conversionEventsDataInnerCustomData` long NOT NULL
  `contentIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsDataInnerCustomDataConversionEventsDataInnerCustomDataContentsInner` generated from model 'ConversionEventsDataInnerCustomDataConversionEventsDataInnerCustomDataContentsInner'

CREATE TABLE IF NOT EXISTS `ConversionEventsDataInnerCustomDataConversionEventsDataInnerCustomDataContentsInner` (
  `conversionEventsDataInnerCustomData` long NOT NULL
  `conversionEventsDataInnerCustomDataContentsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEvents_data_inner_custom_data_contents_inner` generated from model 'conversionEventsDataInnerCustomDataContentsInner'
--

CREATE TABLE IF NOT EXISTS `ConversionEvents_data_inner_custom_data_contents_inner` (
  `id` text PRIMARY KEY /*The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).*/,
  `item_brand` text /*The brand of a product.*/,
  `item_category` text /*The category of a product.*/,
  `item_name` text /*The name of a product.*/,
  `item_price` text /*The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).*/,
  `quantity` long /*The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserData` generated from model 'conversionEventsUserData'
-- Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
--

CREATE TABLE IF NOT EXISTS `ConversionEventsUserData` (
  `click_id` text /*The unique identifier stored in _epik cookie on your domain or &amp;epik&#x3D; query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.*/,
  `client_ip_address` text /*The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.*/,
  `client_user_agent` text /*The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.*/,
  `partner_id` text /*A unique identifier of visitors&#39; information defined by third party partners. e.g RampID*/,
);  /*Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataCountry` generated from model 'ConversionEventsUserDataCountry'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataCountry` (
  `conversionEventsUserData` long NOT NULL
  `country` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataCt` generated from model 'ConversionEventsUserDataCt'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataCt` (
  `conversionEventsUserData` long NOT NULL
  `ct` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataDb` generated from model 'ConversionEventsUserDataDb'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataDb` (
  `conversionEventsUserData` long NOT NULL
  `db` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataEm` generated from model 'ConversionEventsUserDataEm'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataEm` (
  `conversionEventsUserData` long NOT NULL
  `em` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataExternalId` generated from model 'ConversionEventsUserDataExternalId'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataExternalId` (
  `conversionEventsUserData` long NOT NULL
  `externalId` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataFn` generated from model 'ConversionEventsUserDataFn'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataFn` (
  `conversionEventsUserData` long NOT NULL
  `fn` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataGe` generated from model 'ConversionEventsUserDataGe'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataGe` (
  `conversionEventsUserData` long NOT NULL
  `ge` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataHashedMaids` generated from model 'ConversionEventsUserDataHashedMaids'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataHashedMaids` (
  `conversionEventsUserData` long NOT NULL
  `hashedMaids` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataLn` generated from model 'ConversionEventsUserDataLn'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataLn` (
  `conversionEventsUserData` long NOT NULL
  `ln` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataPh` generated from model 'ConversionEventsUserDataPh'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataPh` (
  `conversionEventsUserData` long NOT NULL
  `ph` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataSt` generated from model 'ConversionEventsUserDataSt'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataSt` (
  `conversionEventsUserData` long NOT NULL
  `st` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserDataZp` generated from model 'ConversionEventsUserDataZp'

CREATE TABLE IF NOT EXISTS `ConversionEventsUserDataZp` (
  `conversionEventsUserData` long NOT NULL
  `zp` text NOT NULL
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
-- Table structure for table `ConversionMSOTEvents` generated from model 'conversionMSOTEvents'
-- Object containing the MSOT conversion events.
--

CREATE TABLE IF NOT EXISTS `ConversionMSOTEvents` (
  `ad_group_id` text NOT NULL /*The ID of the ad group that was attributed to the conversion event.*/,
  `attribution_scope` text NOT NULL /*Ad event type.*/,
  `event_id` text NOT NULL /*A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.*/,
  `event_name` text NOT NULL /*Type of user event.*/,
  `event_timestamp` long NOT NULL /*The time when the event occurred. Unix timestamp in seconds.*/,
  `attribution_model` text /*The attribution model used to attribute the conversion event.*/,
  `attribution_score` double /*Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1.*/,
  `campaign_id` text /*The ID of the campaign that was attributed to the conversion event.*/,
  `currency` long,
  `total_event_touchpoints` int UNSIGNED /*Total number of ad events including other non-Pinterest ad platforms.*/,
  `total_events` int UNSIGNED /*Total number of conversion events that are reported in one API call. &lt;p&gt;If you are sending one API request for one attributed conversion event then this value should be 1.&lt;/p&gt; &lt;p&gt;If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.&lt;/p&gt;*/,
  `value` double /*Order value of the conversion event. Required if &lt;code&gt;event_name&lt;/code&gt; is &#39;add_to_cart&#39; or &#39;checkout&#39;.*/
);  /*Object containing the MSOT conversion events.*/

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionMSOTEventsActionTimestamps` generated from model 'ConversionMSOTEventsActionTimestamps'

CREATE TABLE IF NOT EXISTS `ConversionMSOTEventsActionTimestamps` (
  `conversionMSOTEvents` long NOT NULL
  `actionTimestamps` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionProductReportRequest` generated from model 'conversionProductReportRequest'
-- Request for a brand, category, SKU report
--

CREATE TABLE IF NOT EXISTS `ConversionProductReportRequest` (
  `end_date` text NOT NULL /*Metric report end date (UTC). Format: YYYY-MM-DD.&lt;br&gt; A max of 1 year is allowed between the start and end date for reports.*/,
  `granularity` text NOT NULL /*TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; WEEK - metrics are broken down weekly.&lt;br&gt; MONTH - metrics are broken down monthly.*/,
  `level` text NOT NULL /*Level of the report*/,
  `report_name` text NOT NULL /*Name of the conversion product report.*/,
  `start_date` text NOT NULL /*Metric report start date (UTC). Format: YYYY-MM-DD.&lt;br&gt; Start date must be after 2024-03-16. 7 day minimum time window for report is required.*/,
  `click_window_days` long /*Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.*/,
  `conversion_product_attribution_type` text,
  `conversion_product_breakdown` text,
  `conversion_report_time` long /*The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.*/,
  `view_window_days` long /*Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; day.*/
);  /*Request for a brand, category, SKU report*/

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionProductReportRequestConversionProductReportingColumn` generated from model 'ConversionProductReportRequestConversionProductReportingColumn'

CREATE TABLE IF NOT EXISTS `ConversionProductReportRequestConversionProductReportingColumn` (
  `conversionProductReportRequest` long NOT NULL
  `conversionProductReportingColumn` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionProductReportRequestAdGroupIds` generated from model 'ConversionProductReportRequestAdGroupIds'

CREATE TABLE IF NOT EXISTS `ConversionProductReportRequestAdGroupIds` (
  `conversionProductReportRequest` long NOT NULL
  `adGroupIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionProductReportRequestCampaignIds` generated from model 'ConversionProductReportRequestCampaignIds'

CREATE TABLE IF NOT EXISTS `ConversionProductReportRequestCampaignIds` (
  `conversionProductReportRequest` long NOT NULL
  `campaignIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionProductReportRequestObjectiveType` generated from model 'ConversionProductReportRequestObjectiveType'

CREATE TABLE IF NOT EXISTS `ConversionProductReportRequestObjectiveType` (
  `conversionProductReportRequest` long NOT NULL
  `objectiveType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionProductReportRequestProductSkuIds` generated from model 'ConversionProductReportRequestProductSkuIds'

CREATE TABLE IF NOT EXISTS `ConversionProductReportRequestProductSkuIds` (
  `conversionProductReportRequest` long NOT NULL
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
-- Table structure for table `ConversionTagListResponse` generated from model 'conversionTagListResponse'
--

CREATE TABLE IF NOT EXISTS `ConversionTagListResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionTagListResponseConversionTag` generated from model 'ConversionTagListResponseConversionTag'

CREATE TABLE IF NOT EXISTS `ConversionTagListResponseConversionTag` (
  `conversionTagListResponse` long NOT NULL
  `conversionTag` long NOT NULL
);


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
-- Table structure for table `CreateAssetAccessRequestBodyCreateAssetAccessRequestBodyAssetRequestsInner` generated from model 'CreateAssetAccessRequestBodyCreateAssetAccessRequestBodyAssetRequestsInner'

CREATE TABLE IF NOT EXISTS `CreateAssetAccessRequestBodyCreateAssetAccessRequestBodyAssetRequestsInner` (
  `createAssetAccessRequestBody` long NOT NULL
  `createAssetAccessRequestBodyAssetRequestsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateAssetAccessRequestBody_asset_requests_inner` generated from model 'createAssetAccessRequestBodyAssetRequestsInner'
--

CREATE TABLE IF NOT EXISTS `CreateAssetAccessRequestBody_asset_requests_inner` (
  `asset_id_to_permissions` blob NOT NULL /*An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. */,
  `partner_id` text NOT NULL /*Unique identifier of a business partner to request asset access to.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CreateAssetAccessRequestErrorMessage_inner` generated from model 'createAssetAccessRequestErrorMessageInner'
--

CREATE TABLE IF NOT EXISTS `CreateAssetAccessRequestErrorMessage_inner` (
  `code` int /*Error code associated with the error in requesting asset access.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CreateAssetAccessRequestErrorMessageInnerMessages` generated from model 'CreateAssetAccessRequestErrorMessageInnerMessages'

CREATE TABLE IF NOT EXISTS `CreateAssetAccessRequestErrorMessageInnerMessages` (
  `createAssetAccessRequestErrorMessageInner` long NOT NULL
  `messages` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateAssetAccessRequestResponse` generated from model 'createAssetAccessRequestResponse'
--

CREATE TABLE IF NOT EXISTS `CreateAssetAccessRequestResponse` (
  `invites` blob
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CreateAssetAccessRequestResponseCreateAssetAccessRequestErrorMessageInner` generated from model 'CreateAssetAccessRequestResponseCreateAssetAccessRequestErrorMessageInner'

CREATE TABLE IF NOT EXISTS `CreateAssetAccessRequestResponseCreateAssetAccessRequestErrorMessageInner` (
  `createAssetAccessRequestResponse` long NOT NULL
  `createAssetAccessRequestErrorMessageInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateAssetGroupBody` generated from model 'createAssetGroupBody'
--

CREATE TABLE IF NOT EXISTS `CreateAssetGroupBody` (
  `asset_group_description` text NOT NULL /*Asset group description*/,
  `asset_group_name` text NOT NULL /*Asset Group name*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CreateAssetGroupBodyAssetGroupType` generated from model 'CreateAssetGroupBodyAssetGroupType'

CREATE TABLE IF NOT EXISTS `CreateAssetGroupBodyAssetGroupType` (
  `createAssetGroupBody` long NOT NULL
  `assetGroupType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateAssetGroupResponse` generated from model 'createAssetGroupResponse'
--

CREATE TABLE IF NOT EXISTS `CreateAssetGroupResponse` (
  `asset_group` long
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
  `asset_id_to_permissions` blob NOT NULL /*An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. */,
  `invite_id` text NOT NULL /*Unique identifier of an invite.*/,
  `invite_type` long NOT NULL
);  /*Object declaring an asset role update to an invite.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CreateInvitesResultsResponseArray` generated from model 'createInvitesResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `CreateInvitesResultsResponseArray` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CreateInvitesResultsResponseArrayCreateInvitesResultsResponseArrayItemsInner` generated from model 'CreateInvitesResultsResponseArrayCreateInvitesResultsResponseArrayItemsInner'

CREATE TABLE IF NOT EXISTS `CreateInvitesResultsResponseArrayCreateInvitesResultsResponseArrayItemsInner` (
  `createInvitesResultsResponseArray` long NOT NULL
  `createInvitesResultsResponseArrayItemsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateInvitesResultsResponseArray_items_inner` generated from model 'createInvitesResultsResponseArrayItemsInner'
--

CREATE TABLE IF NOT EXISTS `CreateInvitesResultsResponseArray_items_inner` (
  `exception` long,
  `invite` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CreateInvitesResultsResponseArray_items_inner_invite` generated from model 'createInvitesResultsResponseArrayItemsInnerInvite'
-- An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.
--

CREATE TABLE IF NOT EXISTS `CreateInvitesResultsResponseArray_items_inner_invite` (
  `id` text PRIMARY KEY /*Unique identifier of the invite/request.*/,
  `user` long /*Metadata for the member/partner that was sent the invite/request.*/
);  /*An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CreateMMMReportRequest` generated from model 'createMMMReportRequest'
--

CREATE TABLE IF NOT EXISTS `CreateMMMReportRequest` (
  `end_date` text NOT NULL /*Metric report end date (UTC). Format: YYYY-MM-DD*/,
  `granularity` text NOT NULL /*DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly.*/,
  `level` text NOT NULL /*Level of the report*/,
  `report_name` text NOT NULL /*Name of the Marketing Mix Modeling (MMM) report*/,
  `start_date` text NOT NULL /*Metric report start date (UTC). Format: YYYY-MM-DD*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CreateMMMReportRequestMMMReportingColumn` generated from model 'CreateMMMReportRequestMMMReportingColumn'

CREATE TABLE IF NOT EXISTS `CreateMMMReportRequestMMMReportingColumn` (
  `createMMMReportRequest` long NOT NULL
  `mMMReportingColumn` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CreateMMMReportRequestMMMReportingTargetingType` generated from model 'CreateMMMReportRequestMMMReportingTargetingType'

CREATE TABLE IF NOT EXISTS `CreateMMMReportRequestMMMReportingTargetingType` (
  `createMMMReportRequest` long NOT NULL
  `mMMReportingTargetingType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CreateMMMReportRequestTargetingAdvertiserCountry` generated from model 'CreateMMMReportRequestTargetingAdvertiserCountry'

CREATE TABLE IF NOT EXISTS `CreateMMMReportRequestTargetingAdvertiserCountry` (
  `createMMMReportRequest` long NOT NULL
  `targetingAdvertiserCountry` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CreateMMMReportResponse` generated from model 'createMMMReportResponse'
--

CREATE TABLE IF NOT EXISTS `CreateMMMReportResponse` (
  `code` decimal,
  `data` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CreateMMMReportResponseData` generated from model 'createMMMReportResponseData'
--

CREATE TABLE IF NOT EXISTS `CreateMMMReportResponseData` (
  `message` text,
  `report_status` long,
  `status` text,
  `token` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CreateMembershipOrPartnershipInvitesBody` generated from model 'createMembershipOrPartnershipInvitesBody'
-- Body to be used on path to send Members or Partners Invite or Request
--

CREATE TABLE IF NOT EXISTS `CreateMembershipOrPartnershipInvitesBody` (
  `business_role` text NOT NULL /*The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.*/,
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
  `ad_account_id` text /*Associated ad account ID.*/,
  `created_time` decimal /*Creation time. Unix timestamp in seconds.*/,
  `exceptions` blob /*Customer list errors*/,
  `id` text PRIMARY KEY /*Customer list ID.*/,
  `name` text /*Customer list name.*/,
  `num_batches` decimal /*Total number of list updates.  List creation counts as one batch. Each &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.*/,
  `num_removed_user_records` decimal /*Number of removed user records. In a &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call, this counter increases even if the user is not found in the list.*/,
  `num_uploaded_user_records` decimal /*Number of uploaded user records. In an &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append API&lt;/a&gt; call, this counter increases even if the uploaded user is already in the list.*/,
  `status` text /*Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.*/,
  `type` text /*Always \&quot;customerlist\&quot;.*/,
  `updated_time` decimal /*Last update time. Unix timestamp in seconds.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CustomerListRequest` generated from model 'customerListRequest'
--

CREATE TABLE IF NOT EXISTS `CustomerListRequest` (
  `name` text NOT NULL /*Customer list name.*/,
  `records` text NOT NULL /*Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.*/,
  `list_type` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CustomerListUpdateRequest` generated from model 'customerListUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `CustomerListUpdateRequest` (
  `operation_type` long NOT NULL,
  `records` text NOT NULL /*Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.*/
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
  `state` text NOT NULL /*Workload processing state*/,
  `updated_time` int NOT NULL /*Customer List Upload updated_time. Epoch (seconds).*/,
  `record_counts` long
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
  `customer_list_upload` long NOT NULL,
  `s3_multipart_upload_data` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CustomerListUploadResponse` generated from model 'customerListUploadResponse'
--

CREATE TABLE IF NOT EXISTS `CustomerListUploadResponse` (
  `ad_account_id` text NOT NULL /*Advertiser ID.*/,
  `creation_time` int NOT NULL /*Customer List Upload creation_time. Epoch (seconds).*/,
  `customer_list_id` text NOT NULL /*ID of the customer list associated with this upload.*/,
  `id` text NOT NULL PRIMARY KEY /*Customer List Upload ID.*/,
  `operation` long NOT NULL,
  `state` text NOT NULL /*Workload processing state*/,
  `updated_time` int NOT NULL /*Customer List Upload updated_time. Epoch (seconds).*/,
  `record_counts` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CustomerListUploadResponseErrorDetail` generated from model 'CustomerListUploadResponseErrorDetail'

CREATE TABLE IF NOT EXISTS `CustomerListUploadResponseErrorDetail` (
  `customerListUploadResponse` long NOT NULL
  `errorDetail` long NOT NULL
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
-- Table structure for table `DeleteAssetGroupBody` generated from model 'deleteAssetGroupBody'
-- Request body used to delete asset groups
--

CREATE TABLE IF NOT EXISTS `DeleteAssetGroupBody` (
);  /*Request body used to delete asset groups*/

-- --------------------------------------------------------------------------
-- Table structure for table `DeleteAssetGroupBodyAssetGroupsToDelete` generated from model 'DeleteAssetGroupBodyAssetGroupsToDelete'

CREATE TABLE IF NOT EXISTS `DeleteAssetGroupBodyAssetGroupsToDelete` (
  `deleteAssetGroupBody` long NOT NULL
  `assetGroupsToDelete` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteAssetGroupResponse` generated from model 'deleteAssetGroupResponse'
--

CREATE TABLE IF NOT EXISTS `DeleteAssetGroupResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `DeleteAssetGroupResponseDeletedAssetGroups` generated from model 'DeleteAssetGroupResponseDeletedAssetGroups'

CREATE TABLE IF NOT EXISTS `DeleteAssetGroupResponseDeletedAssetGroups` (
  `deleteAssetGroupResponse` long NOT NULL
  `deletedAssetGroups` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `DeleteAssetGroupResponseDeleteAssetGroupResponseExceptionsInner` generated from model 'DeleteAssetGroupResponseDeleteAssetGroupResponseExceptionsInner'

CREATE TABLE IF NOT EXISTS `DeleteAssetGroupResponseDeleteAssetGroupResponseExceptionsInner` (
  `deleteAssetGroupResponse` long NOT NULL
  `deleteAssetGroupResponseExceptionsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteAssetGroupResponse_exceptions_inner` generated from model 'deleteAssetGroupResponseExceptionsInner'
--

CREATE TABLE IF NOT EXISTS `DeleteAssetGroupResponse_exceptions_inner` (
  `asset_group_id` text /*Asset group id of the exception.*/,
  `code` int /*Error code associated with the error deleting asset group.*/,
  `message` text /*Error message associated with the error deleting asset group.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteInvitesResultsResponseArray` generated from model 'deleteInvitesResultsResponseArray'
-- Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id
--

CREATE TABLE IF NOT EXISTS `DeleteInvitesResultsResponseArray` (
);  /*Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id*/

-- --------------------------------------------------------------------------
-- Table structure for table `DeleteInvitesResultsResponseArrayDeleteInvitesResultsResponseArrayItemsInner` generated from model 'DeleteInvitesResultsResponseArrayDeleteInvitesResultsResponseArrayItemsInner'

CREATE TABLE IF NOT EXISTS `DeleteInvitesResultsResponseArrayDeleteInvitesResultsResponseArrayItemsInner` (
  `deleteInvitesResultsResponseArray` long NOT NULL
  `deleteInvitesResultsResponseArrayItemsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteInvitesResultsResponseArray_items_inner` generated from model 'deleteInvitesResultsResponseArrayItemsInner'
--

CREATE TABLE IF NOT EXISTS `DeleteInvitesResultsResponseArray_items_inner` (
  `exception` long,
  `invite` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `DeleteInvitesResultsResponseArray_items_inner_exception` generated from model 'deleteInvitesResultsResponseArrayItemsInnerException'
-- An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
--

CREATE TABLE IF NOT EXISTS `DeleteInvitesResultsResponseArray_items_inner_exception` (
  `invite_id` text /*Unique identifier of an invite.*/,
  `message` text /*Error message associated with the error in performing the action on the invite/request.*/
);  /*An exception object if there is an error performing the cancellation. It will only be provided if there is an error.*/


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
-- Table structure for table `DeletePartnerAssetAccessBody` generated from model 'deletePartnerAssetAccessBody'
--

CREATE TABLE IF NOT EXISTS `DeletePartnerAssetAccessBody` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `DeletePartnerAssetAccessBodyDeletePartnerAssetAccessBodyAccessesInner` generated from model 'DeletePartnerAssetAccessBodyDeletePartnerAssetAccessBodyAccessesInner'

CREATE TABLE IF NOT EXISTS `DeletePartnerAssetAccessBodyDeletePartnerAssetAccessBodyAccessesInner` (
  `deletePartnerAssetAccessBody` long NOT NULL
  `deletePartnerAssetAccessBodyAccessesInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeletePartnerAssetAccessBody_accesses_inner` generated from model 'deletePartnerAssetAccessBodyAccessesInner'
--

CREATE TABLE IF NOT EXISTS `DeletePartnerAssetAccessBody_accesses_inner` (
  `asset_id` text NOT NULL /*Unique identifier of the business asset.*/,
  `partner_id` text NOT NULL /*Unique identifier of a business partner to update asset access to.*/,
  `partner_type` text /*If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `DeletePartnerAssetsResult` generated from model 'deletePartnerAssetsResult'
-- The terminated asset access.
--

CREATE TABLE IF NOT EXISTS `DeletePartnerAssetsResult` (
  `asset_id` text /*Unique identifier of a business asset.*/,
  `asset_type` text /*Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.*/,
  `is_shared_partner` boolean /*If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset.&lt;br&gt; If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset.*/,
  `partner_id` text /*Unique identifier of a business partner.*/,
);  /*The terminated asset access.*/

-- --------------------------------------------------------------------------
-- Table structure for table `DeletePartnerAssetsResultPermissions` generated from model 'DeletePartnerAssetsResultPermissions'

CREATE TABLE IF NOT EXISTS `DeletePartnerAssetsResultPermissions` (
  `deletePartnerAssetsResult` long NOT NULL
  `permissions` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeletePartnerAssetsResultsResponseArray` generated from model 'deletePartnerAssetsResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `DeletePartnerAssetsResultsResponseArray` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `DeletePartnerAssetsResultsResponseArrayDeletePartnerAssetsResult` generated from model 'DeletePartnerAssetsResultsResponseArrayDeletePartnerAssetsResult'

CREATE TABLE IF NOT EXISTS `DeletePartnerAssetsResultsResponseArrayDeletePartnerAssetsResult` (
  `deletePartnerAssetsResultsResponseArray` long NOT NULL
  `deletePartnerAssetsResult` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeletePartnersRequest` generated from model 'deletePartnersRequest'
--

CREATE TABLE IF NOT EXISTS `DeletePartnersRequest` (
  `partner_type` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `DeletePartnersRequestPartnerIds` generated from model 'DeletePartnersRequestPartnerIds'

CREATE TABLE IF NOT EXISTS `DeletePartnersRequestPartnerIds` (
  `deletePartnersRequest` long NOT NULL
  `partnerIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeletePartnersResponse` generated from model 'deletePartnersResponse'
-- An object with a list of partners that were deleted.
--

CREATE TABLE IF NOT EXISTS `DeletePartnersResponse` (
);  /*An object with a list of partners that were deleted.*/

-- --------------------------------------------------------------------------
-- Table structure for table `DeletePartnersResponseDeletedPartners` generated from model 'DeletePartnersResponseDeletedPartners'

CREATE TABLE IF NOT EXISTS `DeletePartnersResponseDeletedPartners` (
  `deletePartnersResponse` long NOT NULL
  `deletedPartners` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeletedMembersResponse` generated from model 'deletedMembersResponse'
-- An object with a list of members that were deleted.
--

CREATE TABLE IF NOT EXISTS `DeletedMembersResponse` (
);  /*An object with a list of members that were deleted.*/

-- --------------------------------------------------------------------------
-- Table structure for table `DeletedMembersResponseDeletedMembers` generated from model 'DeletedMembersResponseDeletedMembers'

CREATE TABLE IF NOT EXISTS `DeletedMembersResponseDeletedMembers` (
  `deletedMembersResponse` long NOT NULL
  `deletedMembers` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeliveryMetricsResponse` generated from model 'deliveryMetricsResponse'
--

CREATE TABLE IF NOT EXISTS `DeliveryMetricsResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `DeliveryMetricsResponseDeliveryMetricsResponseItemsInner` generated from model 'DeliveryMetricsResponseDeliveryMetricsResponseItemsInner'

CREATE TABLE IF NOT EXISTS `DeliveryMetricsResponseDeliveryMetricsResponseItemsInner` (
  `deliveryMetricsResponse` long NOT NULL
  `deliveryMetricsResponseItemsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `DeliveryMetricsResponse_items_inner` generated from model 'deliveryMetricsResponseItemsInner'
--

CREATE TABLE IF NOT EXISTS `DeliveryMetricsResponse_items_inner` (
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
-- Table structure for table `Error` generated from model 'error'
--

CREATE TABLE IF NOT EXISTS `Error` (
  `code` int NOT NULL,
  `message` text NOT NULL
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
--     Optional for VISITOR &#x60;audience_type&#x60;.     With the Pinterest tag, you can use event data to capture event details from your website.     This object lists all the available predefined event data fields in the Pinterest tag.     You can include these event data fields as part of a VISITOR audience’s &#x60;rule&#x60;; however, you **must** specify an &#x60;event&#x60; for the &#x60;event_data&#x60; fields to be evaluated.     Besides what’s listed, you can also create your own set of &#x60;event_data&#x60; fields and define their usages or purposes according to your website needs.     However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields&#39; data.     Examples per &#x60;event&#x60; type:     &#x60;pagevisit&#x60;     \&quot;event_data\&quot;: { \&quot;page_name\&quot;: \&quot;My online store 123 | view items | shoe\&quot; }     &#x60;signup&#x60;     \&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;New release promotion\&quot; }     &#x60;checkout&#x60;     \&quot;event_data\&quot;: { \&quot;value\&quot;: 116, \&quot;order_quantity\&quot;: 2, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Pillows (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;11\&quot;, \&quot;product_price\&quot;: 48, \&quot;product_quantity\&quot;: 1 }, { \&quot;product_name\&quot;: \&quot;Pillows, Large (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;15\&quot;, \&quot;product_price\&quot;: 68, \&quot;product_quantity\&quot;: 1 } ] }     &#x60;addtocart&#x60;     \&quot;event_data\&quot;: { \&quot;value\&quot;: 499, \&quot;order_quantity\&quot;: 1, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Red leather boots\&quot;, \&quot;product_id\&quot;: \&quot;3486\&quot;, \&quot;product_category\&quot;: \&quot;shoe\&quot;, \&quot;product_variant_id\&quot;: \&quot;JB11103000\&quot;, \&quot;product_price\&quot;: 499, \&quot;product_quantity\&quot;: \&quot;1\&quot;, \&quot;product_brand\&quot;: \&quot;My brand\&quot; }]}     &#x60;watchvideo&#x60;     \&quot;event_data\&quot;: { \&quot;video_title\&quot;: \&quot;My Product Video 01\&quot; }     &#x60;lead&#x60;     \&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;Newsletter\&quot; }
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
);  /*    Optional for VISITOR &#x60;audience_type&#x60;.     With the Pinterest tag, you can use event data to capture event details from your website.     This object lists all the available predefined event data fields in the Pinterest tag.     You can include these event data fields as part of a VISITOR audience’s &#x60;rule&#x60;; however, you **must** specify an &#x60;event&#x60; for the &#x60;event_data&#x60; fields to be evaluated.     Besides what’s listed, you can also create your own set of &#x60;event_data&#x60; fields and define their usages or purposes according to your website needs.     However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields&#39; data.     Examples per &#x60;event&#x60; type:     &#x60;pagevisit&#x60;     \&quot;event_data\&quot;: { \&quot;page_name\&quot;: \&quot;My online store 123 | view items | shoe\&quot; }     &#x60;signup&#x60;     \&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;New release promotion\&quot; }     &#x60;checkout&#x60;     \&quot;event_data\&quot;: { \&quot;value\&quot;: 116, \&quot;order_quantity\&quot;: 2, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Pillows (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;11\&quot;, \&quot;product_price\&quot;: 48, \&quot;product_quantity\&quot;: 1 }, { \&quot;product_name\&quot;: \&quot;Pillows, Large (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;15\&quot;, \&quot;product_price\&quot;: 68, \&quot;product_quantity\&quot;: 1 } ] }     &#x60;addtocart&#x60;     \&quot;event_data\&quot;: { \&quot;value\&quot;: 499, \&quot;order_quantity\&quot;: 1, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Red leather boots\&quot;, \&quot;product_id\&quot;: \&quot;3486\&quot;, \&quot;product_category\&quot;: \&quot;shoe\&quot;, \&quot;product_variant_id\&quot;: \&quot;JB11103000\&quot;, \&quot;product_price\&quot;: 499, \&quot;product_quantity\&quot;: \&quot;1\&quot;, \&quot;product_brand\&quot;: \&quot;My brand\&quot; }]}     &#x60;watchvideo&#x60;     \&quot;event_data\&quot;: { \&quot;video_title\&quot;: \&quot;My Product Video 01\&quot; }     &#x60;lead&#x60;     \&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;Newsletter\&quot; }*/


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
  `code` int /*Exception error code.*/,
  `message` text /*Exception message.*/
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
-- Table structure for table `feeds_create_request` generated from model 'feedsCreateRequest'
--

CREATE TABLE IF NOT EXISTS `feeds_create_request` (
  `catalog_type` long NOT NULL,
  `format` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `name` text NOT NULL /*A human-friendly name associated to a given feed.*/,
  `catalog_id` text /*Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.*/,
  `credentials` long,
  `default_availability` long,
  `default_country` long,
  `default_currency` long,
  `default_locale` long,
  `preferred_processing_schedule` long,
  `status` long
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
-- Table structure for table `feeds_update_request` generated from model 'feedsUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `feeds_update_request` (
  `catalog_type` long NOT NULL,
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
-- Table structure for table `FollowUserRequest` generated from model 'followUserRequest'
--

CREATE TABLE IF NOT EXISTS `FollowUserRequest` (
  `auto_follow` boolean /*Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `followers_list_200_response` generated from model 'followersList200Response'
--

CREATE TABLE IF NOT EXISTS `followers_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `FollowersList200ResponseUserSummary` generated from model 'FollowersList200ResponseUserSummary'

CREATE TABLE IF NOT EXISTS `FollowersList200ResponseUserSummary` (
  `followersList200Response` long NOT NULL
  `userSummary` long NOT NULL
);


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
-- Table structure for table `GetBusinessAssetsResponse` generated from model 'getBusinessAssetsResponse'
-- An object containing the permissions a business has on the asset.
--

CREATE TABLE IF NOT EXISTS `GetBusinessAssetsResponse` (
  `asset_group_info` long,
  `asset_id` text /*Unique identifier of a business asset.*/,
  `asset_type` text /*Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.*/,
  `catalog_info` long
);  /*An object containing the permissions a business has on the asset.*/


-- --------------------------------------------------------------------------
-- Table structure for table `GetBusinessAssetsResponse_catalog_info` generated from model 'getBusinessAssetsResponseCatalogInfo'
-- An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals &#39;CATALOG&#39;.
--

CREATE TABLE IF NOT EXISTS `GetBusinessAssetsResponse_catalog_info` (
  `catalog_type` text /*Catalog type*/,
  `id` text PRIMARY KEY /*Catalog ID.*/,
  `name` text /*Catalog name*/
);  /*An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals &#39;CATALOG&#39;.*/


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
-- Table structure for table `get_business_members_200_response` generated from model 'getBusinessMembers200Response'
--

CREATE TABLE IF NOT EXISTS `get_business_members_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `GetBusinessMembers200ResponseUserBusinessRoleBinding` generated from model 'GetBusinessMembers200ResponseUserBusinessRoleBinding'

CREATE TABLE IF NOT EXISTS `GetBusinessMembers200ResponseUserBusinessRoleBinding` (
  `getBusinessMembers200Response` long NOT NULL
  `userBusinessRoleBinding` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `get_business_partners_200_response` generated from model 'getBusinessPartners200Response'
--

CREATE TABLE IF NOT EXISTS `get_business_partners_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `GetBusinessPartners200ResponseUserBusinessRoleBinding` generated from model 'GetBusinessPartners200ResponseUserBusinessRoleBinding'

CREATE TABLE IF NOT EXISTS `GetBusinessPartners200ResponseUserBusinessRoleBinding` (
  `getBusinessPartners200Response` long NOT NULL
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
-- Table structure for table `GetMMMReportResponse` generated from model 'getMMMReportResponse'
--

CREATE TABLE IF NOT EXISTS `GetMMMReportResponse` (
  `code` decimal,
  `data` long,
  `message` text,
  `status` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetMMMReportResponseData` generated from model 'getMMMReportResponseData'
--

CREATE TABLE IF NOT EXISTS `GetMMMReportResponseData` (
  `report_status` text,
  `size` decimal,
  `url` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GetPartnerAssetsResponse` generated from model 'getPartnerAssetsResponse'
-- An object containing the permissions a you/your business partner has on the asset.
--

CREATE TABLE IF NOT EXISTS `GetPartnerAssetsResponse` (
  `asset_group_info` long,
  `asset_id` text /*Unique identifier of a business asset.*/,
  `asset_type` text /*Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.*/,
);  /*An object containing the permissions a you/your business partner has on the asset.*/

-- --------------------------------------------------------------------------
-- Table structure for table `GetPartnerAssetsResponsePermissions` generated from model 'GetPartnerAssetsResponsePermissions'

CREATE TABLE IF NOT EXISTS `GetPartnerAssetsResponsePermissions` (
  `getPartnerAssetsResponse` long NOT NULL
  `permissions` text NOT NULL
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
-- Table structure for table `Image_Base64` generated from model 'imageBase64'
-- Base64-encoded image media source
--

CREATE TABLE IF NOT EXISTS `Image_Base64` (
  `content_type` text NOT NULL,
  `data` text NOT NULL
);  /*Base64-encoded image media source*/


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
  `description` text,
  `images` long,
  `item_type` text,
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
  `event_type` text NOT NULL /*Log event type*/,
  `log_level` text NOT NULL /*Log level type*/,
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
  `method` text NOT NULL,
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
-- Table structure for table `IntegrationLogsInvalidLogResponseIntegrationLogsInvalidLogResponseRejectedLogsInner` generated from model 'IntegrationLogsInvalidLogResponseIntegrationLogsInvalidLogResponseRejectedLogsInner'

CREATE TABLE IF NOT EXISTS `IntegrationLogsInvalidLogResponseIntegrationLogsInvalidLogResponseRejectedLogsInner` (
  `integrationLogsInvalidLogResponse` long NOT NULL
  `integrationLogsInvalidLogResponseRejectedLogsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `IntegrationLogsInvalidLogResponse_rejected_logs_inner` generated from model 'integrationLogsInvalidLogResponseRejectedLogsInner'
--

CREATE TABLE IF NOT EXISTS `IntegrationLogsInvalidLogResponse_rejected_logs_inner` (
  `field` text NOT NULL /*The field name containing an invalid value.*/,
  `reason` text NOT NULL /*The reason the value is invalid.*/,
  `value` text NOT NULL /*The value that is invalid.*/,
  `log_index` int /*Index of the log in the batch.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `IntegrationLogsRequest` generated from model 'integrationLogsRequest'
-- Batch of logs sent from an integration application.
--

CREATE TABLE IF NOT EXISTS `IntegrationLogsRequest` (
);  /*Batch of logs sent from an integration application.*/

-- --------------------------------------------------------------------------
-- Table structure for table `IntegrationLogsRequestIntegrationLog` generated from model 'IntegrationLogsRequestIntegrationLog'

CREATE TABLE IF NOT EXISTS `IntegrationLogsRequestIntegrationLog` (
  `integrationLogsRequest` long NOT NULL
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
  `external_business_id` text,
  `id` text PRIMARY KEY,
  `partner_access_token_expiry` decimal,
  `partner_metadata` text,
  `partner_refresh_token_expiry` decimal,
  `scopes` text,
  `updated_timestamp` decimal
);  /*Integration metadata*/


-- --------------------------------------------------------------------------
-- Table structure for table `IntegrationRecord` generated from model 'integrationRecord'
-- Integration record
--

CREATE TABLE IF NOT EXISTS `IntegrationRecord` (
  `additional_id_1` text,
  `connected_advertiser_id` text,
  `connected_lba_id` text,
  `connected_merchant_id` text,
  `connected_tag_id` text,
  `connected_user_id` text,
  `created_time` int,
  `external_business_id` text,
  `id` text PRIMARY KEY,
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
-- Table structure for table `IntegrationRequest` generated from model 'integrationRequest'
-- Schema used for creating the integration metadata.
--

CREATE TABLE IF NOT EXISTS `IntegrationRequest` (
  `additional_id_1` text,
  `connected_advertiser_id` text,
  `connected_lba_id` text,
  `connected_merchant_id` text,
  `connected_tag_id` text,
  `external_business_id` text /*External business ID for the integration.*/,
  `partner_access_token` text,
  `partner_access_token_expiry` int,
  `partner_metadata` text,
  `partner_primary_email` text,
  `partner_refresh_token` text,
  `partner_refresh_token_expiry` int,
  `scopes` text
);  /*Schema used for creating the integration metadata.*/


-- --------------------------------------------------------------------------
-- Table structure for table `IntegrationRequestPatch` generated from model 'integrationRequestPatch'
-- Schema used for updating the integration metadata.
--

CREATE TABLE IF NOT EXISTS `IntegrationRequestPatch` (
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
);  /*Schema used for updating the integration metadata.*/


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
-- Table structure for table `integrations_logs_post_400_response` generated from model 'integrationsLogsPost400Response'
--

CREATE TABLE IF NOT EXISTS `integrations_logs_post_400_response` (
  `code` int NOT NULL,
  `message` text NOT NULL,
  `details` blob NOT NULL
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
-- Table structure for table `InviteAssetsSummary` generated from model 'inviteAssetsSummary'
-- Ad accounts and profiles the member/partner will be granted access to with this invite/request.
--

CREATE TABLE IF NOT EXISTS `InviteAssetsSummary` (
);  /*Ad accounts and profiles the member/partner will be granted access to with this invite/request.*/

-- --------------------------------------------------------------------------
-- Table structure for table `InviteAssetsSummaryInviteAssetsSummaryAdAccountsInner` generated from model 'InviteAssetsSummaryInviteAssetsSummaryAdAccountsInner'

CREATE TABLE IF NOT EXISTS `InviteAssetsSummaryInviteAssetsSummaryAdAccountsInner` (
  `inviteAssetsSummary` long NOT NULL
  `inviteAssetsSummaryAdAccountsInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `InviteAssetsSummaryInviteAssetsSummaryProfilesInner` generated from model 'InviteAssetsSummaryInviteAssetsSummaryProfilesInner'

CREATE TABLE IF NOT EXISTS `InviteAssetsSummaryInviteAssetsSummaryProfilesInner` (
  `inviteAssetsSummary` long NOT NULL
  `inviteAssetsSummaryProfilesInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `InviteAssetsSummary_ad_accounts_inner` generated from model 'inviteAssetsSummaryAdAccountsInner'
--

CREATE TABLE IF NOT EXISTS `InviteAssetsSummary_ad_accounts_inner` (
  `id` text PRIMARY KEY /*Unique identifier of a business ad account.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `InviteAssetsSummaryAdAccountsInnerPermissions` generated from model 'InviteAssetsSummaryAdAccountsInnerPermissions'

CREATE TABLE IF NOT EXISTS `InviteAssetsSummaryAdAccountsInnerPermissions` (
  `inviteAssetsSummaryAdAccountsInner` long NOT NULL
  `permissions` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `InviteAssetsSummary_profiles_inner` generated from model 'inviteAssetsSummaryProfilesInner'
--

CREATE TABLE IF NOT EXISTS `InviteAssetsSummary_profiles_inner` (
  `id` text PRIMARY KEY /*Unique identifier of a business profile.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `InviteAssetsSummaryProfilesInnerPermissions` generated from model 'InviteAssetsSummaryProfilesInnerPermissions'

CREATE TABLE IF NOT EXISTS `InviteAssetsSummaryProfilesInnerPermissions` (
  `inviteAssetsSummaryProfilesInner` long NOT NULL
  `permissions` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `InviteBusinessRoleBinding` generated from model 'inviteBusinessRoleBinding'
--

CREATE TABLE IF NOT EXISTS `InviteBusinessRoleBinding` (
  `id` text PRIMARY KEY /*Unique identifier of the invite/request.*/,
  `invite_data` long,
  `is_received_invite` boolean /*Indicates whether the invite/request was received.*/,
  `user` blob /*Metadata for the user that updated the invite/request.*/,
  `created_by_business_id` text /*Unique identifier for the business that created the invite/request.*/,
  `created_by_user_id` text /*Unique identifier for the user that created the invite/request.*/
); 


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
--

CREATE TABLE IF NOT EXISTS `InviteResponse` (
  `id` text PRIMARY KEY /*Unique identifier of the invite/request.*/,
  `invite_data` long,
  `is_received_invite` boolean /*Indicates whether the invite/request was received.*/,
  `user` long /*Metadata for the member/partner that was sent the invite/request.*/,
  `assets_summary` long,
  `created_by_business` blob /*Metadata for the business that created the invite/request.*/,
  `created_by_user` blob /*Metadata for the user that created the invite/request.*/,
  `created_time` int /*The time the invite/request was created. Returned in milliseconds.*/
); 

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
  `ad_image_0_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_0_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_10_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_10_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_11_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_11_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_12_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_12_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_13_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_13_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_14_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_14_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_15_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_15_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_16_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_16_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_17_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_17_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_18_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_18_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_19_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_19_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_1_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_1_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_2_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_2_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_3_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_3_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_4_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_4_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_5_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_5_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_6_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_6_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_7_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_7_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_8_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_8_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_9_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_9_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_link` text /*Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.*/,
  `ad_video_0_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad video link that supplements main video for shopping campaigns.&lt;/p&gt; &lt;p&gt;Video format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size between 75 x 75 and 9450 x 9450&lt;/li&gt;   &lt;li&gt;File size smaller than 2 GB&lt;/li&gt;   &lt;li&gt;Time span between 4 seconds and 15 minutes&lt;/li&gt;   &lt;li&gt;Accepted formats: .MP4, .MOV, .M4V&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder videos in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_video_0_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.&lt;/p&gt;*/,
  `ad_video_1_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad video link that supplements main video for shopping campaigns.&lt;/p&gt; &lt;p&gt;Video format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size between 75 x 75 and 9450 x 9450&lt;/li&gt;   &lt;li&gt;File size smaller than 2 GB&lt;/li&gt;   &lt;li&gt;Time span between 4 seconds and 15 minutes&lt;/li&gt;   &lt;li&gt;Accepted formats: .MP4, .MOV, .M4V&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder videos in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_video_1_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.&lt;/p&gt;*/,
  `ad_video_2_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad video link that supplements main video for shopping campaigns.&lt;/p&gt; &lt;p&gt;Video format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size between 75 x 75 and 9450 x 9450&lt;/li&gt;   &lt;li&gt;File size smaller than 2 GB&lt;/li&gt;   &lt;li&gt;Time span between 4 seconds and 15 minutes&lt;/li&gt;   &lt;li&gt;Accepted formats: .MP4, .MOV, .M4V&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder videos in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_video_2_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.&lt;/p&gt;*/,
  `adult` boolean /*Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest.*/,
  `age_group` text /*The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.*/,
  `android_deep_link` text /*The deep link to the product on the Android app.*/,
  `availability` text /*The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.*/,
  `average_review_rating` decimal /*Average reviews for the item. Can be a number from 1-5.*/,
  `brand` text /*The brand of the product.*/,
  `checkout_enabled` boolean /*This attribute is not supported anymore.*/,
  `color` text /*The primary color of the product.*/,
  `condition` text /*The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.*/,
  `custom_label_0` text /*&lt;p&gt;&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `custom_label_1` text /*&lt;p&gt;&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `custom_label_2` text /*&lt;p&gt;&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `custom_label_3` text /*&lt;p&gt;&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `custom_label_4` text /*&lt;p&gt;&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `custom_number_0` int /*an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_1` int /*an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_2` int /*an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_3` int /*an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_4` int /*an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `description` text /*&lt;p&gt;&lt;&#x3D; 10000 characters&lt;/p&gt; &lt;p&gt;The description of the product.&lt;/p&gt;*/,
  `free_shipping_label` boolean /*The item is free to ship.*/,
  `free_shipping_limit` text /*The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.*/,
  `gender` text /*The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.*/,
  `google_product_category` text /*The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.*/,
  `gtin` long,
  `id` text PRIMARY KEY /*&lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The user-created unique ID that represents the product. Only Unicode characters are accepted.&lt;/p&gt;*/,
  `installment_price` text /*Installment price of the product. This data will only be shown to pinners in the enabled countries. Expected format: &lt;payment_count&gt;:&lt;payment_amount&gt; &lt;currency&gt;*/,
  `ios_deep_link` text /*The deep link to the product on the iOS app.*/,
  `item_group_id` text /*&lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The parent ID of the product.&lt;/p&gt;*/,
  `last_updated_time` long /*The millisecond timestamp when the item was lastly modified by the merchant.*/,
  `link` text /*&lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;The landing page for the product.&lt;/p&gt;*/,
  `material` text /*The material used to make the product.*/,
  `min_ad_price` text /*The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.*/,
  `mobile_link` text /*The mobile-optimized version of your landing page. Must begin with http:// or https://.*/,
  `mpn` text /*Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.*/,
  `number_of_ratings` int /*The number of ratings for the item.*/,
  `number_of_reviews` int /*The number of reviews available for the item.*/,
  `pattern` text /*The description of the pattern used for the product.*/,
  `price` text /*The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.*/,
  `product_type` text /*&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.&lt;/p&gt;*/,
  `promotion_id` text /*A unique identifier referencing the promotion associated with this catalog item.*/,
  `sale_price` text /*The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars.*/,
  `sale_price_effective_date` text /*Sale price effective date. Expected format: &lt;start_date&gt;/&lt;end_date&gt; (ISO 8601 format)*/,
  `shipping` text /*Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.*/,
  `shipping_height` text /*The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.*/,
  `shipping_weight` text /*The weight of the product. Ensure there is a space between the numeric string and the metric.*/,
  `shipping_width` text /*The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.*/,
  `size` text /*The size of the product.*/,
  `size_system` text /*Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.*/,
  `size_type` text /*Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.*/,
  `tax` text /*Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.*/,
  `title` text /*&lt;p&gt;&lt;&#x3D; 500 characters&lt;/p&gt; &lt;p&gt;The name of the product.&lt;/p&gt;*/,
  `unit_pricing_base_measure` text /*Unit pricing base measure of the product. This data will only be shown to pinners in the enabled countries. Expected format: &lt;base_measure&gt; &lt;unit_type&gt;*/,
  `unit_pricing_measure` text /*Unit pricing total measure of the product. This data will only be shown to pinners in the enabled countries. Expected format: &lt;total_units&gt; &lt;unit_type&gt;*/,
  `video_link` text /*&lt;p&gt;&lt;&#x3D; 2,000 characters&lt;/p&gt; &lt;p&gt;Hosted link to the product video.&lt;/p&gt; &lt;p&gt;File types for linked videos must be .mp4, .mov or .m4v.&lt;/p&gt; &lt;p&gt;File size cannot exceed 2GB.&lt;/p&gt;*/
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
-- Table structure for table `ItemAttributesImageLink` generated from model 'ItemAttributesImageLink'

CREATE TABLE IF NOT EXISTS `ItemAttributesImageLink` (
  `itemAttributes` long NOT NULL
  `imageLink` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributesRequest` generated from model 'itemAttributesRequest'
--

CREATE TABLE IF NOT EXISTS `ItemAttributesRequest` (
  `ad_image_0_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_0_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_10_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_10_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_11_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_11_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_12_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_12_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_13_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_13_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_14_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_14_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_15_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_15_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_16_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_16_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_17_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_17_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_18_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_18_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_19_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_19_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_1_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_1_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_2_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_2_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_3_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_3_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_4_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_4_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_5_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_5_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_6_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_6_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_7_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_7_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_8_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_8_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_9_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_9_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_link` text /*Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.*/,
  `ad_video_0_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad video link that supplements main video for shopping campaigns.&lt;/p&gt; &lt;p&gt;Video format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size between 75 x 75 and 9450 x 9450&lt;/li&gt;   &lt;li&gt;File size smaller than 2 GB&lt;/li&gt;   &lt;li&gt;Time span between 4 seconds and 15 minutes&lt;/li&gt;   &lt;li&gt;Accepted formats: .MP4, .MOV, .M4V&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder videos in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_video_0_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.&lt;/p&gt;*/,
  `ad_video_1_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad video link that supplements main video for shopping campaigns.&lt;/p&gt; &lt;p&gt;Video format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size between 75 x 75 and 9450 x 9450&lt;/li&gt;   &lt;li&gt;File size smaller than 2 GB&lt;/li&gt;   &lt;li&gt;Time span between 4 seconds and 15 minutes&lt;/li&gt;   &lt;li&gt;Accepted formats: .MP4, .MOV, .M4V&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder videos in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_video_1_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.&lt;/p&gt;*/,
  `ad_video_2_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad video link that supplements main video for shopping campaigns.&lt;/p&gt; &lt;p&gt;Video format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size between 75 x 75 and 9450 x 9450&lt;/li&gt;   &lt;li&gt;File size smaller than 2 GB&lt;/li&gt;   &lt;li&gt;Time span between 4 seconds and 15 minutes&lt;/li&gt;   &lt;li&gt;Accepted formats: .MP4, .MOV, .M4V&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder videos in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_video_2_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.&lt;/p&gt;*/,
  `adult` boolean /*Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest.*/,
  `age_group` text /*The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.*/,
  `android_deep_link` text /*The deep link to the product on the Android app.*/,
  `availability` text /*The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.*/,
  `average_review_rating` decimal /*Average reviews for the item. Can be a number from 1-5.*/,
  `brand` text /*The brand of the product.*/,
  `checkout_enabled` boolean /*This attribute is not supported anymore.*/,
  `color` text /*The primary color of the product.*/,
  `condition` text /*The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.*/,
  `custom_label_0` text /*&lt;p&gt;&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `custom_label_1` text /*&lt;p&gt;&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `custom_label_2` text /*&lt;p&gt;&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `custom_label_3` text /*&lt;p&gt;&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `custom_label_4` text /*&lt;p&gt;&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `custom_number_0` int /*an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_1` int /*an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_2` int /*an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_3` int /*an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_4` int /*an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `description` text /*&lt;p&gt;&lt;&#x3D; 10000 characters&lt;/p&gt; &lt;p&gt;The description of the product.&lt;/p&gt;*/,
  `free_shipping_label` boolean /*The item is free to ship.*/,
  `free_shipping_limit` text /*The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.*/,
  `gender` text /*The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.*/,
  `google_product_category` text /*The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.*/,
  `gtin` long,
  `id` text PRIMARY KEY /*&lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The user-created unique ID that represents the product. Only Unicode characters are accepted.&lt;/p&gt;*/,
  `installment_price` text /*Installment price of the product. This data will only be shown to pinners in the enabled countries. Expected format: &lt;payment_count&gt;:&lt;payment_amount&gt; &lt;currency&gt;*/,
  `ios_deep_link` text /*The deep link to the product on the iOS app.*/,
  `item_group_id` text /*&lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The parent ID of the product.&lt;/p&gt;*/,
  `last_updated_time` long /*The millisecond timestamp when the item was lastly modified by the merchant.*/,
  `link` text /*&lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;The landing page for the product.&lt;/p&gt;*/,
  `material` text /*The material used to make the product.*/,
  `min_ad_price` text /*The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.*/,
  `mobile_link` text /*The mobile-optimized version of your landing page. Must begin with http:// or https://.*/,
  `mpn` text /*Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.*/,
  `number_of_ratings` int /*The number of ratings for the item.*/,
  `number_of_reviews` int /*The number of reviews available for the item.*/,
  `pattern` text /*The description of the pattern used for the product.*/,
  `price` text /*The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.*/,
  `product_type` text /*&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.&lt;/p&gt;*/,
  `promotion_id` text /*A unique identifier referencing the promotion associated with this catalog item.*/,
  `sale_price` text /*The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars.*/,
  `sale_price_effective_date` text /*Sale price effective date. Expected format: &lt;start_date&gt;/&lt;end_date&gt; (ISO 8601 format)*/,
  `shipping` text /*Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.*/,
  `shipping_height` text /*The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.*/,
  `shipping_weight` text /*The weight of the product. Ensure there is a space between the numeric string and the metric.*/,
  `shipping_width` text /*The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.*/,
  `size` text /*The size of the product.*/,
  `size_system` text /*Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.*/,
  `size_type` text /*Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.*/,
  `tax` text /*Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.*/,
  `title` text /*&lt;p&gt;&lt;&#x3D; 500 characters&lt;/p&gt; &lt;p&gt;The name of the product.&lt;/p&gt;*/,
  `unit_pricing_base_measure` text /*Unit pricing base measure of the product. This data will only be shown to pinners in the enabled countries. Expected format: &lt;base_measure&gt; &lt;unit_type&gt;*/,
  `unit_pricing_measure` text /*Unit pricing total measure of the product. This data will only be shown to pinners in the enabled countries. Expected format: &lt;total_units&gt; &lt;unit_type&gt;*/,
  `image_link` long,
  `save_pin_disabled` boolean /*By default, product pins created from a catalog are able to be saved by Pinners. If you want to disable the save pin feature, set this attribute to true. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.*/,
  `video_link` text /*&lt;p&gt;&lt;&#x3D; 2,000 characters&lt;/p&gt; &lt;p&gt;Hosted link to the product video.&lt;/p&gt; &lt;p&gt;File types for linked videos must be .mp4, .mov or .m4v.&lt;/p&gt; &lt;p&gt;File size cannot exceed 2GB.&lt;/p&gt;*/
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
-- Table structure for table `ItemAttributesRequestAdditionalImageLink` generated from model 'ItemAttributesRequestAdditionalImageLink'

CREATE TABLE IF NOT EXISTS `ItemAttributesRequestAdditionalImageLink` (
  `itemAttributesRequest` long NOT NULL
  `additionalImageLink` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ItemBatchRecord` generated from model 'itemBatchRecord'
-- Object describing an item batch record
--

CREATE TABLE IF NOT EXISTS `ItemBatchRecord` (
  `attributes` long,
  `item_id` text /*The catalog item id in the merchant namespace*/,
);  /*Object describing an item batch record*/

-- --------------------------------------------------------------------------
-- Table structure for table `ItemBatchRecordUpdateMaskFieldType` generated from model 'ItemBatchRecordUpdateMaskFieldType'

CREATE TABLE IF NOT EXISTS `ItemBatchRecordUpdateMaskFieldType` (
  `itemBatchRecord` long NOT NULL
  `updateMaskFieldType` long NOT NULL
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
-- Object describing an item record or error
--

CREATE TABLE IF NOT EXISTS `ItemResponse` (
  `catalog_type` long NOT NULL,
  `attributes` long,
  `item_id` text /*The catalog item id in the merchant namespace*/,
  `hotel_id` text /*The catalog hotel id in the merchant namespace*/,
  `creative_assets_id` text /*The catalog creative assets id in the merchant namespace*/
);  /*Object describing an item record or error*/

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
-- Table structure for table `ItemResponse_oneOf` generated from model 'itemResponseOneOf'
-- Successful item response
--

CREATE TABLE IF NOT EXISTS `ItemResponse_oneOf` (
  `catalog_type` long NOT NULL,
  `attributes` long,
  `item_id` text /*The catalog retail item id in the merchant namespace*/,
  `hotel_id` text /*The catalog hotel id in the merchant namespace*/,
  `creative_assets_id` text /*The catalog creative assets id in the merchant namespace*/
);  /*Successful item response*/

-- --------------------------------------------------------------------------
-- Table structure for table `ItemResponseOneOfPin` generated from model 'ItemResponseOneOfPin'

CREATE TABLE IF NOT EXISTS `ItemResponseOneOfPin` (
  `itemResponseOneOf` long NOT NULL
  `pin` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ItemResponse_oneOf_1` generated from model 'itemResponseOneOf1'
-- Error item response
--

CREATE TABLE IF NOT EXISTS `ItemResponse_oneOf_1` (
  `catalog_type` long NOT NULL,
  `item_id` text /*The catalog item id in the merchant namespace*/,
  `hotel_id` text /*The catalog hotel id in the merchant namespace*/,
  `creative_assets_id` text /*The catalog creative assets id in the merchant namespace*/
);  /*Error item response*/

-- --------------------------------------------------------------------------
-- Table structure for table `ItemResponseOneOf1ItemValidationEvent` generated from model 'ItemResponseOneOf1ItemValidationEvent'

CREATE TABLE IF NOT EXISTS `ItemResponseOneOf1ItemValidationEvent` (
  `itemResponseOneOf1` long NOT NULL
  `itemValidationEvent` long NOT NULL
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
-- Table structure for table `items_batch_post_request` generated from model 'itemsBatchPostRequest'
--

CREATE TABLE IF NOT EXISTS `items_batch_post_request` (
  `catalog_type` text NOT NULL,
  `country` long NOT NULL,
  `language` text NOT NULL /*We recommend using the CatalogsLocale values.*/,
  `operation` long NOT NULL,
  `catalog_id` text /*Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ItemsBatchPostRequestItemDeleteBatchRecord` generated from model 'ItemsBatchPostRequestItemDeleteBatchRecord'

CREATE TABLE IF NOT EXISTS `ItemsBatchPostRequestItemDeleteBatchRecord` (
  `itemsBatchPostRequest` long NOT NULL
  `itemDeleteBatchRecord` long NOT NULL
);


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
-- Table structure for table `Keyword` generated from model 'keyword'
--

CREATE TABLE IF NOT EXISTS `Keyword` (
  `match_type` long NOT NULL,
  `value` text NOT NULL /*Keyword value (120 chars max).*/,
  `bid` int /*&lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.*/,
  `archived` boolean,
  `id` text PRIMARY KEY /*Keyword ID .*/,
  `parent_id` text /*Keyword parent entity ID (advertiser, campaign, ad group).*/,
  `parent_type` text /*Parent entity type*/,
  `type` text /*Always keyword*/
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
-- Table structure for table `KeywordUpdate` generated from model 'keywordUpdate'
--

CREATE TABLE IF NOT EXISTS `KeywordUpdate` (
  `id` text NOT NULL PRIMARY KEY /*Keyword ID.*/,
  `archived` boolean /*Is keyword archived?*/,
  `bid` int /*&lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `KeywordUpdateBody` generated from model 'keywordUpdateBody'
--

CREATE TABLE IF NOT EXISTS `KeywordUpdateBody` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `KeywordUpdateBodyKeywordUpdate` generated from model 'KeywordUpdateBodyKeywordUpdate'

CREATE TABLE IF NOT EXISTS `KeywordUpdateBodyKeywordUpdate` (
  `keywordUpdateBody` long NOT NULL
  `keywordUpdate` long NOT NULL
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
-- Table structure for table `KeywordsResponse` generated from model 'keywordsResponse'
--

CREATE TABLE IF NOT EXISTS `KeywordsResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `KeywordsResponseKeywordError` generated from model 'KeywordsResponseKeywordError'

CREATE TABLE IF NOT EXISTS `KeywordsResponseKeywordError` (
  `keywordsResponse` long NOT NULL
  `keywordError` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `KeywordsResponseKeyword` generated from model 'KeywordsResponseKeyword'

CREATE TABLE IF NOT EXISTS `KeywordsResponseKeyword` (
  `keywordsResponse` long NOT NULL
  `keyword` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `Label` generated from model 'label'
--

CREATE TABLE IF NOT EXISTS `Label` (
  `id` text PRIMARY KEY /*Label ID.*/,
  `label_type` long,
  `parent_id` text /*Label parent entity ID.*/,
  `parent_type` text /*Label parent entity type.*/,
  `status` long,
  `value` text /*Label name.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LabelBulkUpdateRequest` generated from model 'labelBulkUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `LabelBulkUpdateRequest` (
  `id` text NOT NULL PRIMARY KEY /*Label ID.*/,
  `status` text /*Set status to &#x60;ARCHIVED&#x60; to remove the label from the parent entity.*/,
  `value` text /*&lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; value field will be deprecated. Label name. 100-character limit.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LabelCreateRequest` generated from model 'labelCreateRequest'
--

CREATE TABLE IF NOT EXISTS `LabelCreateRequest` (
  `parent_id` text NOT NULL /*Unique identifier of the asset you are labelling. Currently, you can only label campaigns.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LabelCreateRequestLabelCreateRequestLabelsInner` generated from model 'LabelCreateRequestLabelCreateRequestLabelsInner'

CREATE TABLE IF NOT EXISTS `LabelCreateRequestLabelCreateRequestLabelsInner` (
  `labelCreateRequest` long NOT NULL
  `labelCreateRequestLabelsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LabelCreateRequest_labels_inner` generated from model 'labelCreateRequestLabelsInner'
--

CREATE TABLE IF NOT EXISTS `LabelCreateRequest_labels_inner` (
  `label_type` long NOT NULL,
  `value` text NOT NULL /*Label name. 100-character limit.*/
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
-- Table structure for table `LabelUpdateRequest` generated from model 'labelUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `LabelUpdateRequest` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LabelUpdateRequestLabelUpdateRequestLabelsInner` generated from model 'LabelUpdateRequestLabelUpdateRequestLabelsInner'

CREATE TABLE IF NOT EXISTS `LabelUpdateRequestLabelUpdateRequestLabelsInner` (
  `labelUpdateRequest` long NOT NULL
  `labelUpdateRequestLabelsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LabelUpdateRequest_labels_inner` generated from model 'labelUpdateRequestLabelsInner'
--

CREATE TABLE IF NOT EXISTS `LabelUpdateRequest_labels_inner` (
  `id` text NOT NULL PRIMARY KEY /*Label ID.*/,
  `status` long,
  `value` text /*Label name. 100-character limit.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `labels_list_200_response` generated from model 'labelsList200Response'
--

CREATE TABLE IF NOT EXISTS `labels_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LabelsList200ResponseLabelsResponse` generated from model 'LabelsList200ResponseLabelsResponse'

CREATE TABLE IF NOT EXISTS `LabelsList200ResponseLabelsResponse` (
  `labelsList200Response` long NOT NULL
  `labelsResponse` long NOT NULL
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
-- Table structure for table `LeadFormArrayResponse` generated from model 'leadFormArrayResponse'
--

CREATE TABLE IF NOT EXISTS `LeadFormArrayResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormArrayResponseLeadFormArrayResponseItemsInner` generated from model 'LeadFormArrayResponseLeadFormArrayResponseItemsInner'

CREATE TABLE IF NOT EXISTS `LeadFormArrayResponseLeadFormArrayResponseItemsInner` (
  `leadFormArrayResponse` long NOT NULL
  `leadFormArrayResponseItemsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormArrayResponse_items_inner` generated from model 'leadFormArrayResponseItemsInner'
--

CREATE TABLE IF NOT EXISTS `LeadFormArrayResponse_items_inner` (
  `data` long,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormArrayResponseItemsInnerException` generated from model 'LeadFormArrayResponseItemsInnerException'

CREATE TABLE IF NOT EXISTS `LeadFormArrayResponseItemsInnerException` (
  `leadFormArrayResponseItemsInner` long NOT NULL
  `exception` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormCommon` generated from model 'leadFormCommon'
-- Creation fields
--

CREATE TABLE IF NOT EXISTS `LeadFormCommon` (
  `completion_message` text /*A message for people who complete the form to let them know what happens next.*/,
  `disclosure_language` text /*Additional disclosure language to be included in the lead form.*/,
  `has_accepted_terms` boolean /*Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO*/,
  `name` text /*Internal name of the lead form.*/,
  `privacy_policy_link` text /*A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.*/,
  `status` long
);  /*Creation fields*/

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormCommonLeadFormCommonPolicyLinksInner` generated from model 'LeadFormCommonLeadFormCommonPolicyLinksInner'

CREATE TABLE IF NOT EXISTS `LeadFormCommonLeadFormCommonPolicyLinksInner` (
  `leadFormCommon` long NOT NULL
  `leadFormCommonPolicyLinksInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormCommonLeadFormQuestion` generated from model 'LeadFormCommonLeadFormQuestion'

CREATE TABLE IF NOT EXISTS `LeadFormCommonLeadFormQuestion` (
  `leadFormCommon` long NOT NULL
  `leadFormQuestion` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormCommon_policy_links_inner` generated from model 'leadFormCommonPolicyLinksInner'
--

CREATE TABLE IF NOT EXISTS `LeadFormCommon_policy_links_inner` (
  `label` text /*Policy label for an additional policy link.*/,
  `link` text /*Policy link for an additional policy link.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormCreateRequest` generated from model 'leadFormCreateRequest'
--

CREATE TABLE IF NOT EXISTS `LeadFormCreateRequest` (
  `completion_message` text /*A message for people who complete the form to let them know what happens next.*/,
  `disclosure_language` text /*Additional disclosure language to be included in the lead form.*/,
  `has_accepted_terms` boolean /*Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO*/,
  `name` text /*Internal name of the lead form.*/,
  `privacy_policy_link` text /*A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.*/,
  `status` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormCreateRequestLeadFormCommonPolicyLinksInner` generated from model 'LeadFormCreateRequestLeadFormCommonPolicyLinksInner'

CREATE TABLE IF NOT EXISTS `LeadFormCreateRequestLeadFormCommonPolicyLinksInner` (
  `leadFormCreateRequest` long NOT NULL
  `leadFormCommonPolicyLinksInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormCreateRequestLeadFormQuestion` generated from model 'LeadFormCreateRequestLeadFormQuestion'

CREATE TABLE IF NOT EXISTS `LeadFormCreateRequestLeadFormQuestion` (
  `leadFormCreateRequest` long NOT NULL
  `leadFormQuestion` long NOT NULL
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
-- Table structure for table `LeadFormResponse` generated from model 'leadFormResponse'
--

CREATE TABLE IF NOT EXISTS `LeadFormResponse` (
  `completion_message` text /*A message for people who complete the form to let them know what happens next.*/,
  `disclosure_language` text /*Additional disclosure language to be included in the lead form.*/,
  `has_accepted_terms` boolean /*Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO*/,
  `name` text /*Internal name of the lead form.*/,
  `privacy_policy_link` text /*A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.*/,
  `status` long,
  `ad_account_id` text /*The Ad Account ID that this lead form belongs to.*/,
  `created_time` int /*Lead form creation time. Unix timestamp in seconds.*/,
  `id` text PRIMARY KEY /*The ID of this lead form*/,
  `updated_time` int /*Last update time. Unix timestamp in seconds.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormResponseLeadFormCommonPolicyLinksInner` generated from model 'LeadFormResponseLeadFormCommonPolicyLinksInner'

CREATE TABLE IF NOT EXISTS `LeadFormResponseLeadFormCommonPolicyLinksInner` (
  `leadFormResponse` long NOT NULL
  `leadFormCommonPolicyLinksInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormResponseLeadFormQuestion` generated from model 'LeadFormResponseLeadFormQuestion'

CREATE TABLE IF NOT EXISTS `LeadFormResponseLeadFormQuestion` (
  `leadFormResponse` long NOT NULL
  `leadFormQuestion` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormTestRequest` generated from model 'leadFormTestRequest'
-- Request to create test data for lead data test API.
--

CREATE TABLE IF NOT EXISTS `LeadFormTestRequest` (
);  /*Request to create test data for lead data test API.*/

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormTestRequestAnswers` generated from model 'LeadFormTestRequestAnswers'

CREATE TABLE IF NOT EXISTS `LeadFormTestRequestAnswers` (
  `leadFormTestRequest` long NOT NULL
  `answers` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormTestResponse` generated from model 'leadFormTestResponse'
-- Response for lead data test API.
--

CREATE TABLE IF NOT EXISTS `LeadFormTestResponse` (
  `subscription_id` text /*Subscription ID.*/
);  /*Response for lead data test API.*/


-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormUpdateRequest` generated from model 'leadFormUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `LeadFormUpdateRequest` (
  `id` text NOT NULL PRIMARY KEY /*The ID of this lead form to be updated*/,
  `completion_message` text /*A message for people who complete the form to let them know what happens next.*/,
  `disclosure_language` text /*Additional disclosure language to be included in the lead form.*/,
  `has_accepted_terms` boolean /*Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO*/,
  `name` text /*Internal name of the lead form.*/,
  `privacy_policy_link` text /*A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.*/,
  `status` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormUpdateRequestLeadFormCommonPolicyLinksInner` generated from model 'LeadFormUpdateRequestLeadFormCommonPolicyLinksInner'

CREATE TABLE IF NOT EXISTS `LeadFormUpdateRequestLeadFormCommonPolicyLinksInner` (
  `leadFormUpdateRequest` long NOT NULL
  `leadFormCommonPolicyLinksInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormUpdateRequestLeadFormQuestion` generated from model 'LeadFormUpdateRequestLeadFormQuestion'

CREATE TABLE IF NOT EXISTS `LeadFormUpdateRequestLeadFormQuestion` (
  `leadFormUpdateRequest` long NOT NULL
  `leadFormQuestion` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `lead_forms_list_200_response` generated from model 'leadFormsList200Response'
--

CREATE TABLE IF NOT EXISTS `lead_forms_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormsList200ResponseLeadFormResponse` generated from model 'LeadFormsList200ResponseLeadFormResponse'

CREATE TABLE IF NOT EXISTS `LeadFormsList200ResponseLeadFormResponse` (
  `leadFormsList200Response` long NOT NULL
  `leadFormResponse` long NOT NULL
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
-- Table structure for table `LeadSubscriptionPostParamsCreate` generated from model 'leadSubscriptionPostParamsCreate'
--

CREATE TABLE IF NOT EXISTS `LeadSubscriptionPostParamsCreate` (
  `webhook_url` text NOT NULL /*Standard HTTPS webhook URL.*/,
  `lead_form_id` text /*Lead form ID.*/,
  `partner_access_token` text /*Partner access token. Only for clients that requires authentication. We recommend to avoid this param.*/,
  `partner_metadata` long,
  `partner_refresh_token` text /*Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LeadSubscriptionPostParamsCreate_allOf_partner_metadata` generated from model 'leadSubscriptionPostParamsCreateAllOfPartnerMetadata'
-- Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
--

CREATE TABLE IF NOT EXISTS `LeadSubscriptionPostParamsCreate_allOf_partner_metadata` (
  `subscriber_key` text /*Text field value that uniquely identifies a subscriber.*/
);  /*Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.*/


-- --------------------------------------------------------------------------
-- Table structure for table `LeadsExportCreateRequest` generated from model 'leadsExportCreateRequest'
--

CREATE TABLE IF NOT EXISTS `LeadsExportCreateRequest` (
  `ad_id` text NOT NULL /*ID for the ad collecting leads*/,
  `end_date` text NOT NULL /*Export leads collected on and before end date (UTC). Format: YYYY-MM-DD*/,
  `start_date` text NOT NULL /*Export leads collected on and after start date (UTC). Format: YYYY-MM-DD*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LeadsExportCreateResponse` generated from model 'leadsExportCreateResponse'
--

CREATE TABLE IF NOT EXISTS `LeadsExportCreateResponse` (
  `leads_export_id` text /*ID for the leads export job*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LeadsExportResponseData` generated from model 'leadsExportResponseData'
--

CREATE TABLE IF NOT EXISTS `LeadsExportResponseData` (
  `download_url` text,
  `export_status` long
); 


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
-- Table structure for table `LocalStoreUpdate` generated from model 'localStoreUpdate'
--

CREATE TABLE IF NOT EXISTS `LocalStoreUpdate` (
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
-- Table structure for table `MembersToDeleteBody` generated from model 'membersToDeleteBody'
--

CREATE TABLE IF NOT EXISTS `MembersToDeleteBody` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `MembersToDeleteBodyMembersToDeleteBodyMembersInner` generated from model 'MembersToDeleteBodyMembersToDeleteBodyMembersInner'

CREATE TABLE IF NOT EXISTS `MembersToDeleteBodyMembersToDeleteBodyMembersInner` (
  `membersToDeleteBody` long NOT NULL
  `membersToDeleteBodyMembersInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MembersToDeleteBody_members_inner` generated from model 'membersToDeleteBodyMembersInner'
--

CREATE TABLE IF NOT EXISTS `MembersToDeleteBody_members_inner` (
  `business_role` long NOT NULL,
  `member_id` text NOT NULL /*Unique identifier of the member*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MetricsResponse` generated from model 'metricsResponse'
--

CREATE TABLE IF NOT EXISTS `MetricsResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `MetricsResponseData` generated from model 'MetricsResponseData'

CREATE TABLE IF NOT EXISTS `MetricsResponseData` (
  `metricsResponse` long NOT NULL
  `data` blob NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MinPriceFilter` generated from model 'minPriceFilter'
--

CREATE TABLE IF NOT EXISTS `MinPriceFilter` (
  `MIN_PRICE` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `multiple_product_groups_inner` generated from model 'multipleProductGroupsInner'
--

CREATE TABLE IF NOT EXISTS `multiple_product_groups_inner` (
  `feed_id` text NOT NULL /*Catalog Feed id pertaining to the catalog product group.*/,
  `filters` long NOT NULL,
  `name` text NOT NULL,
  `catalog_id` text NOT NULL /*Catalog id pertaining to the creative assets product group.*/,
  `catalog_type` text NOT NULL,
  `description` text,
  `is_featured` boolean /*boolean indicator of whether the product group is being featured or not*/,
  `country` long,
  `locale` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `NotificationResponse` generated from model 'notificationResponse'
--

CREATE TABLE IF NOT EXISTS `NotificationResponse` (
  `success` boolean /*Returns true if the notification accepted.*/,
  `received_at` int /*Received time. Unix timestamp in seconds.*/,
  `error_msg` text /*error message when success is false*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `OauthAccessTokenRequestClientCredentials` generated from model 'oauthAccessTokenRequestClientCredentials'
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenRequestClientCredentials` (
  `scope` text NOT NULL,
  `grant_type` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `OauthAccessTokenRequestCode` generated from model 'oauthAccessTokenRequestCode'
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenRequestCode` (
  `code` text NOT NULL,
  `redirect_uri` text NOT NULL,
  `grant_type` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `OauthAccessTokenRequestRefresh` generated from model 'oauthAccessTokenRequestRefresh'
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenRequestRefresh` (
  `refresh_token` text NOT NULL,
  `grant_type` text NOT NULL,
  `scope` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `OauthAccessTokenResponse` generated from model 'oauthAccessTokenResponse'
-- A successful OAuth access token response.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenResponse` (
  `access_token` text NOT NULL,
  `expires_in` int NOT NULL,
  `scope` text NOT NULL,
  `token_type` text NOT NULL,
  `response_type` text
);  /*A successful OAuth access token response.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OauthAccessTokenResponseClientCredentials` generated from model 'oauthAccessTokenResponseClientCredentials'
-- A successful OAuth client token response for the client token flow.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenResponseClientCredentials` (
  `access_token` text NOT NULL,
  `expires_in` int NOT NULL,
  `scope` text NOT NULL,
  `token_type` text NOT NULL,
  `response_type` text
);  /*A successful OAuth client token response for the client token flow.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OauthAccessTokenResponseCode` generated from model 'oauthAccessTokenResponseCode'
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenResponseCode` (
  `access_token` text NOT NULL,
  `expires_in` int NOT NULL,
  `scope` text NOT NULL,
  `token_type` text NOT NULL,
  `refresh_token` text,
  `refresh_token_expires_at` int,
  `refresh_token_expires_in` int,
  `response_type` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `OauthAccessTokenResponseIntegrationRefresh` generated from model 'oauthAccessTokenResponseIntegrationRefresh'
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenResponseIntegrationRefresh` (
  `refresh_token` text NOT NULL,
  `refresh_token_expires_in` int NOT NULL,
  `access_token` text NOT NULL,
  `expires_in` int NOT NULL,
  `scope` text NOT NULL,
  `token_type` text NOT NULL,
  `response_type` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `OauthAccessTokenResponseRefresh` generated from model 'oauthAccessTokenResponseRefresh'
-- A successful OAuth access token response for the refresh token flow.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenResponseRefresh` (
  `access_token` text NOT NULL,
  `expires_in` int NOT NULL,
  `scope` text NOT NULL,
  `token_type` text NOT NULL,
  `refresh_token` text NOT NULL,
  `refresh_token_expires_at` int NOT NULL,
  `refresh_token_expires_in` int NOT NULL,
  `response_type` text
);  /*A successful OAuth access token response for the refresh token flow.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OptimizationGoalMetadata` generated from model 'optimizationGoalMetadata'
--

CREATE TABLE IF NOT EXISTS `OptimizationGoalMetadata` (
  `conversion_tag_v3_goal_metadata` long,
  `frequency_goal_metadata` long,
  `scrollup_goal_metadata` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata` generated from model 'optimizationGoalMetadataConversionTagV3GoalMetadata'
--

CREATE TABLE IF NOT EXISTS `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata` (
  `attribution_windows` long,
  `conversion_event` text,
  `conversion_tag_id` text,
  `cpa_goal_value_in_micro_currency` text,
  `is_roas_optimized` boolean /*Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;\&quot;CHECKOUT\&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;\&quot;AUTOMATIC_BID\&quot;&#x60;. &lt;br&gt;This parameter is not enabled for all advertisers. &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\&quot;&gt;Learn more&lt;/a&gt;.*/,
  `learning_mode_type` text /*Conversion learning model type*/,
  `reporting_event` text /*Event name for custom or standard events mapped to an oCPM model*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows` generated from model 'optimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows'
--

CREATE TABLE IF NOT EXISTS `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows` (
  `click_window_days` int,
  `engagement_window_days` int,
  `view_window_days` int
); 


-- --------------------------------------------------------------------------
-- Table structure for table `OptimizationGoalMetadata_frequency_goal_metadata` generated from model 'optimizationGoalMetadataFrequencyGoalMetadata'
--

CREATE TABLE IF NOT EXISTS `OptimizationGoalMetadata_frequency_goal_metadata` (
  `frequency` int UNSIGNED /*Frequency target can only be between 2 and 20*/,
  `timerange` text /*User entity counts time range*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `OptimizationGoalMetadata_scrollup_goal_metadata` generated from model 'optimizationGoalMetadataScrollupGoalMetadata'
--

CREATE TABLE IF NOT EXISTS `OptimizationGoalMetadata_scrollup_goal_metadata` (
  `scrollup_goal_value_in_micro_currency` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `OrderLine` generated from model 'orderLine'
--

CREATE TABLE IF NOT EXISTS `OrderLine` (
  `ad_account_id` text /*Ad account ID.*/,
  `budget` decimal /*Order line budget in micro currency.*/,
  `end_time` decimal /*End time. Unix timestamp.*/,
  `id` text PRIMARY KEY /*Order line ID.*/,
  `name` text /*Order line name.*/,
  `paid_budget` decimal /*Order line paid budget in micro currency.*/,
  `paid_type` long /*Order line paid type.*/,
  `purchase_order_id` text /*Purchase order ID.*/,
  `start_time` decimal /*Start time. Unix timestamp.*/,
  `status` long /*Order line status.*/,
  `type` text /*Always \&quot;orderline\&quot;.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `OrderLineCampaignIds` generated from model 'OrderLineCampaignIds'

CREATE TABLE IF NOT EXISTS `OrderLineCampaignIds` (
  `orderLine` long NOT NULL
  `campaignIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OrderLineError` generated from model 'orderLineError'
--

CREATE TABLE IF NOT EXISTS `OrderLineError` (
  `data` long,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `OrderLineErrorErrorMessages` generated from model 'OrderLineErrorErrorMessages'

CREATE TABLE IF NOT EXISTS `OrderLineErrorErrorMessages` (
  `orderLineError` long NOT NULL
  `errorMessages` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OrderLineResponse` generated from model 'orderLineResponse'
--

CREATE TABLE IF NOT EXISTS `OrderLineResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `OrderLineResponseOrderLineError` generated from model 'OrderLineResponseOrderLineError'

CREATE TABLE IF NOT EXISTS `OrderLineResponseOrderLineError` (
  `orderLineResponse` long NOT NULL
  `orderLineError` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `OrderLineResponseOrderLine` generated from model 'OrderLineResponseOrderLine'

CREATE TABLE IF NOT EXISTS `OrderLineResponseOrderLine` (
  `orderLineResponse` long NOT NULL
  `orderLine` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `OrderLineSingleResponse` generated from model 'orderLineSingleResponse'
--

CREATE TABLE IF NOT EXISTS `OrderLineSingleResponse` (
  `data` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `OrderLines` generated from model 'orderLines'
-- Order Line
--

CREATE TABLE IF NOT EXISTS `OrderLines` (
  `ad_account_id` text /*Ad account ID.*/,
  `budget` decimal /*Order line budget in micro currency.*/,
  `end_time` decimal /*End time. Unix timestamp.*/,
  `id` text PRIMARY KEY /*Order line ID.*/,
  `name` text /*Order line name.*/,
  `paid_budget` decimal /*Order line paid budget in micro currency.*/,
  `paid_type` long /*Order line paid type.*/,
  `purchase_order_id` text /*Purchase order ID.*/,
  `start_time` decimal /*Start time. Unix timestamp.*/,
  `status` long /*Order line status.*/,
  `type` text /*Always \&quot;orderline\&quot;.*/
);  /*Order Line*/


-- --------------------------------------------------------------------------
-- Table structure for table `OrderLinesArrayResponse` generated from model 'orderLinesArrayResponse'
--

CREATE TABLE IF NOT EXISTS `OrderLinesArrayResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `OrderLinesArrayResponseOrderLines` generated from model 'OrderLinesArrayResponseOrderLines'

CREATE TABLE IF NOT EXISTS `OrderLinesArrayResponseOrderLines` (
  `orderLinesArrayResponse` long NOT NULL
  `orderLines` long NOT NULL
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
-- Table structure for table `Paginated` generated from model 'paginated'
--

CREATE TABLE IF NOT EXISTS `Paginated` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedItems` generated from model 'PaginatedItems'

CREATE TABLE IF NOT EXISTS `PaginatedItems` (
  `paginated` long NOT NULL
  `items` blob NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `Pin` generated from model 'pin'
-- Pin model containing properties related to a Pinterest Pin.
--

CREATE TABLE IF NOT EXISTS `Pin` (
  `id` text NOT NULL PRIMARY KEY,
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
  `is_standard` boolean /*Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.*/,
  `link` text,
  `media` long,
  `parent_pin_id` text /*The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).*/,
  `pin_metrics` blob /*Pin metrics with associated time intervals if any.*/,
  `title` text
);  /*Pin model containing properties related to a Pinterest Pin.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinAnalyticsMetricsResponse` generated from model 'pinAnalyticsMetricsResponse'
--

CREATE TABLE IF NOT EXISTS `PinAnalyticsMetricsResponse` (
  `lifetime_metrics` blob /*The lifetime metric name and value.*/,
  `summary_metrics` blob /*The metric name and value over the requested period for each requested metric*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PinAnalyticsMetricsResponsePinAnalyticsMetricsResponseDailyMetricsInner` generated from model 'PinAnalyticsMetricsResponsePinAnalyticsMetricsResponseDailyMetricsInner'

CREATE TABLE IF NOT EXISTS `PinAnalyticsMetricsResponsePinAnalyticsMetricsResponseDailyMetricsInner` (
  `pinAnalyticsMetricsResponse` long NOT NULL
  `pinAnalyticsMetricsResponseDailyMetricsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PinAnalyticsMetricsResponse_daily_metrics_inner` generated from model 'pinAnalyticsMetricsResponseDailyMetricsInner'
--

CREATE TABLE IF NOT EXISTS `PinAnalyticsMetricsResponse_daily_metrics_inner` (
  `data_status` long,
  `date` text /*Metrics date (UTC): YYYY-MM-DD.*/,
  `metrics` blob /*The metric name and daily value for each requested metric*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PinCreate` generated from model 'pinCreate'
-- Resource create operation model.
--

CREATE TABLE IF NOT EXISTS `PinCreate` (
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
--

CREATE TABLE IF NOT EXISTS `PinMediaMetadata` (
  `description` text,
  `images` long,
  `item_type` text,
  `link` text,
  `title` text,
  `cover_image_url` text,
  `duration` decimal /*Duration (in miliseconds). Field maybe null after creation due to video processing time.*/,
  `height` int /*Height (in pixels). Field maybe null after creation due to video processing time.*/,
  `video_url` text /*Video url (720p).  **Note:** This field is limited and not available to all apps.*/,
  `width` int /*Width (in pixels). Field maybe null after creation due to video processing time.*/
); 


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
-- Table structure for table `PinUpdate` generated from model 'pinUpdate'
-- Resource create or update operation model.
--

CREATE TABLE IF NOT EXISTS `PinUpdate` (
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
-- Table structure for table `pins_save_request` generated from model 'pinsSaveRequest'
--

CREATE TABLE IF NOT EXISTS `pins_save_request` (
  `board_id` text /*Unique identifier of the board to which the pin will be saved.*/,
  `board_section_id` text /*Unique identifier of the board section to which the pin will be saved.*/
); 


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
-- Table structure for table `PlacementMultipliers` generated from model 'placementMultipliers'
-- This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
--

CREATE TABLE IF NOT EXISTS `PlacementMultipliers` (
  `PLACEMENT` text
);  /*This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).*/


-- --------------------------------------------------------------------------
-- Table structure for table `PredictedTimeSeries` generated from model 'predictedTimeSeries'
-- A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.&lt;br /&gt; These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword. Similar to the historical &#x60;time_series&#x60;, normalization is applied independently to the predicted time series of each keyword, but the &#x60;normalize_against_group&#x60; query parameter can be used in cases where you wish to compare relative predicted volume between keywords.&lt;br /&gt; **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.&lt;br /&gt; **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of &#x60;2024-01-07&#x60; would include predicted searches for the week ending on &#x60;2024-01-07&#x60;.
--

CREATE TABLE IF NOT EXISTS `PredictedTimeSeries` (
  `date` date
);  /*A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.&lt;br /&gt; These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword. Similar to the historical &#x60;time_series&#x60;, normalization is applied independently to the predicted time series of each keyword, but the &#x60;normalize_against_group&#x60; query parameter can be used in cases where you wish to compare relative predicted volume between keywords.&lt;br /&gt; **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.&lt;br /&gt; **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of &#x60;2024-01-07&#x60; would include predicted searches for the week ending on &#x60;2024-01-07&#x60;.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PriceFilter` generated from model 'priceFilter'
--

CREATE TABLE IF NOT EXISTS `PriceFilter` (
  `PRICE` long NOT NULL
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
  `has_prediction` boolean NOT NULL /*     Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.*/,
  `product_category` long NOT NULL,
  `demographics` long,
  `metrics_highlights` long,
  `predicted_time_series` blob /*     A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.*/,
  `time_series` blob /*Time series data showing trend values over time, indexed between 0 and 100*/
);  /*Product category details*/

-- --------------------------------------------------------------------------
-- Table structure for table `ProductCategoryDetailsRelatedSearches` generated from model 'ProductCategoryDetailsRelatedSearches'

CREATE TABLE IF NOT EXISTS `ProductCategoryDetailsRelatedSearches` (
  `productCategoryDetails` long NOT NULL
  `relatedSearches` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ProductGroupAnalyticsResponse_inner` generated from model 'productGroupAnalyticsResponseInner'
--

CREATE TABLE IF NOT EXISTS `ProductGroupAnalyticsResponse_inner` (
  `PRODUCT_GROUP_ID` text NOT NULL /*The ID of the product group that this metrics belongs to.*/,
  `DATE` date /*Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ProductGroupPromotion` generated from model 'productGroupPromotion'
--

CREATE TABLE IF NOT EXISTS `ProductGroupPromotion` (
  `ad_group_id` text /*ID of the ad group the product group belongs to.*/,
  `bid_in_micro_currency` int /*The bid in micro currency.*/,
  `catalog_product_group_id` text /*ID of the catalogs product group that this product group promotion references*/,
  `catalog_product_group_name` text /*Catalogs product group name*/,
  `collections_header_type` text /*Collections ad header type*/,
  `collections_hero_destination_url` text /*Collections Hero Destination Url*/,
  `collections_hero_pin_id` text /*Hero Pin ID if this PG is promoted as a Collection*/,
  `creative_type` long,
  `customizable_cta_type` text /*Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE*/,
  `definition` text /*The full product group definition path*/,
  `grid_click_type` long,
  `id` text PRIMARY KEY /*ID of the product group promotion.*/,
  `included` boolean /*True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.*/,
  `is_generate_background` boolean /*Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.*/,
  `is_mdl` boolean /*If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog*/,
  `parent_id` text /*The parent Product Group ID of this Product Group*/,
  `preferred_media_type` text /*Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.*/,
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
-- Table structure for table `ProductGroupPromotionResponse` generated from model 'productGroupPromotionResponse'
--

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ProductGroupPromotionResponseProductGroupPromotionResponseItem` generated from model 'ProductGroupPromotionResponseProductGroupPromotionResponseItem'

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionResponseProductGroupPromotionResponseItem` (
  `productGroupPromotionResponse` long NOT NULL
  `productGroupPromotionResponseItem` long NOT NULL
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
-- Table structure for table `ProductGroupReferenceFilter` generated from model 'productGroupReferenceFilter'
--

CREATE TABLE IF NOT EXISTS `ProductGroupReferenceFilter` (
  `PRODUCT_GROUP` long NOT NULL
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
-- Table structure for table `PromotionArrayElement` generated from model 'promotionArrayElement'
--

CREATE TABLE IF NOT EXISTS `PromotionArrayElement` (
  `data` long,
  `exception` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PromotionCommon` generated from model 'promotionCommon'
--

CREATE TABLE IF NOT EXISTS `PromotionCommon` (
  `discount_status` text /*Discount status based on the current time and start and end time of discount*/,
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
-- Table structure for table `PromotionCommonPromotionTemplateValue` generated from model 'PromotionCommonPromotionTemplateValue'

CREATE TABLE IF NOT EXISTS `PromotionCommonPromotionTemplateValue` (
  `promotionCommon` long NOT NULL
  `promotionTemplateValue` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PromotionCreateRequest` generated from model 'promotionCreateRequest'
--

CREATE TABLE IF NOT EXISTS `PromotionCreateRequest` (
  `promotion_title` text NOT NULL /*Internal name for the promotion.*/,
  `promotion_type` long NOT NULL,
  `discount_status` text /*Discount status based on the current time and start and end time of discount*/,
  `end_time` int /*Promotion end time. Unix timestamp in seconds. Independent of campaign end time.*/,
  `external_id` text /*Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.*/,
  `platform_type` text /*The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;.*/,
  `promotion_code` text /*Code that can be used to redeem a promotion.*/,
  `promotion_custom_id` text /*An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.*/,
  `start_time` int /*Promotion start time. Unix timestamp in seconds. Independent of campaign start time.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PromotionCreateRequestPromotionTemplateValue` generated from model 'PromotionCreateRequestPromotionTemplateValue'

CREATE TABLE IF NOT EXISTS `PromotionCreateRequestPromotionTemplateValue` (
  `promotionCreateRequest` long NOT NULL
  `promotionTemplateValue` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PromotionResponse` generated from model 'promotionResponse'
--

CREATE TABLE IF NOT EXISTS `PromotionResponse` (
  `discount_status` text /*Discount status based on the current time and start and end time of discount*/,
  `end_time` int /*Promotion end time. Unix timestamp in seconds. Independent of campaign end time.*/,
  `external_id` text /*Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.*/,
  `platform_type` text /*The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;.*/,
  `promotion_code` text /*Code that can be used to redeem a promotion.*/,
  `promotion_custom_id` text /*An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.*/,
  `promotion_title` text /*Internal name for the promotion.*/,
  `promotion_type` long,
  `start_time` int /*Promotion start time. Unix timestamp in seconds. Independent of campaign start time.*/,
  `ad_account_id` text /*The Ad Account ID that this promotion belongs to.*/,
  `id` text PRIMARY KEY /*Promotion ID*/,
  `status` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PromotionResponsePromotionTemplateValue` generated from model 'PromotionResponsePromotionTemplateValue'

CREATE TABLE IF NOT EXISTS `PromotionResponsePromotionTemplateValue` (
  `promotionResponse` long NOT NULL
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
-- Table structure for table `PromotionUpdateRequest` generated from model 'promotionUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `PromotionUpdateRequest` (
  `id` text NOT NULL PRIMARY KEY /*Promotion ID*/,
  `discount_status` text /*Discount status based on the current time and start and end time of discount*/,
  `end_time` int /*Promotion end time. Unix timestamp in seconds. Independent of campaign end time.*/,
  `external_id` text /*Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.*/,
  `platform_type` text /*The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;.*/,
  `promotion_code` text /*Code that can be used to redeem a promotion.*/,
  `promotion_custom_id` text /*An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.*/,
  `promotion_title` text /*Internal name for the promotion.*/,
  `promotion_type` long,
  `start_time` int /*Promotion start time. Unix timestamp in seconds. Independent of campaign start time.*/,
  `status` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PromotionUpdateRequestPromotionTemplateValue` generated from model 'PromotionUpdateRequestPromotionTemplateValue'

CREATE TABLE IF NOT EXISTS `PromotionUpdateRequestPromotionTemplateValue` (
  `promotionUpdateRequest` long NOT NULL
  `promotionTemplateValue` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `promotions_list_200_response` generated from model 'promotionsList200Response'
--

CREATE TABLE IF NOT EXISTS `promotions_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PromotionsList200ResponsePromotionResponse` generated from model 'PromotionsList200ResponsePromotionResponse'

CREATE TABLE IF NOT EXISTS `PromotionsList200ResponsePromotionResponse` (
  `promotionsList200Response` long NOT NULL
  `promotionResponse` long NOT NULL
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
  `tie_breaker_type` text /*Quiz ad tie breaker type, default is RANDOM*/
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
--  This field contains multiple options to a quiz question.
--

CREATE TABLE IF NOT EXISTS `QuizPinOption` (
  `id` decimal PRIMARY KEY AUTOINCREMENT,
  `text` text
);  /* This field contains multiple options to a quiz question.*/


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
-- Record processing counts
--

CREATE TABLE IF NOT EXISTS `RecordCounts` (
  `invalid` int NOT NULL /*Number of invalid records processed*/,
  `processed` int NOT NULL /*Number of records processed*/,
  `valid` int NOT NULL /*Number of valid records processed*/
);  /*Record processing counts*/


-- --------------------------------------------------------------------------
-- Table structure for table `RelatedTerms` generated from model 'relatedTerms'
--

CREATE TABLE IF NOT EXISTS `RelatedTerms` (
  `id` text PRIMARY KEY /*First input term. For example, if you pass \&quot;?terms&#x3D;clothes,workout\&quot;, then id will be \&quot;clothes\&quot;*/,
  `related_term_count` int /*Total number of related terms returned*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `RelatedTermsRelatedTermsRelatedTermsListInner` generated from model 'RelatedTermsRelatedTermsRelatedTermsListInner'

CREATE TABLE IF NOT EXISTS `RelatedTermsRelatedTermsRelatedTermsListInner` (
  `relatedTerms` long NOT NULL
  `relatedTermsRelatedTermsListInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `RelatedTerms_related_terms_list_inner` generated from model 'relatedTermsRelatedTermsListInner'
--

CREATE TABLE IF NOT EXISTS `RelatedTerms_related_terms_list_inner` (
  `term` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `RelatedTermsRelatedTermsListInnerRelatedTerms` generated from model 'RelatedTermsRelatedTermsListInnerRelatedTerms'

CREATE TABLE IF NOT EXISTS `RelatedTermsRelatedTermsListInnerRelatedTerms` (
  `relatedTermsRelatedTermsListInner` long NOT NULL
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
-- Table structure for table `reports_stats_parameters_parameter` generated from model 'reportsStatsParametersParameter'
-- Report stats parameters
--

CREATE TABLE IF NOT EXISTS `reports_stats_parameters_parameter` (
  `catalog_type` text NOT NULL,
  `report` long NOT NULL
);  /*Report stats parameters*/


-- --------------------------------------------------------------------------
-- Table structure for table `RespondToInvitesResponseArray` generated from model 'respondToInvitesResponseArray'
--

CREATE TABLE IF NOT EXISTS `RespondToInvitesResponseArray` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `RespondToInvitesResponseArrayRespondToInvitesResponseArrayItemsInner` generated from model 'RespondToInvitesResponseArrayRespondToInvitesResponseArrayItemsInner'

CREATE TABLE IF NOT EXISTS `RespondToInvitesResponseArrayRespondToInvitesResponseArrayItemsInner` (
  `respondToInvitesResponseArray` long NOT NULL
  `respondToInvitesResponseArrayItemsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `RespondToInvitesResponseArray_items_inner` generated from model 'respondToInvitesResponseArrayItemsInner'
--

CREATE TABLE IF NOT EXISTS `RespondToInvitesResponseArray_items_inner` (
  `exception` long,
  `invite` long
); 


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
-- Table structure for table `SSIOAccountAddress` generated from model 'ssIOAccountAddress'
--

CREATE TABLE IF NOT EXISTS `SSIOAccountAddress` (
  `address_id` text /*Salesforce id for address*/,
  `display` text /*Address display*/,
  `order_legal_entity` text /*Legal entity for this insertion order*/,
  `purpose` text /*Purpose for which the address is used, usually Billing or Businness*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOAccountItem` generated from model 'ssIOAccountItem'
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
); 

-- --------------------------------------------------------------------------
-- Table structure for table `SSIOAccountItemSSIOAccountAddress` generated from model 'SSIOAccountItemSSIOAccountAddress'

CREATE TABLE IF NOT EXISTS `SSIOAccountItemSSIOAccountAddress` (
  `sSIOAccountItem` long NOT NULL
  `sSIOAccountAddress` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOAccountPMPName` generated from model 'ssIOAccountPMPName'
--

CREATE TABLE IF NOT EXISTS `SSIOAccountPMPName` (
  `id` text PRIMARY KEY /*Salesforce id for PMP*/,
  `name` text /*Display name*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOAccountResponse` generated from model 'ssIOAccountResponse'
--

CREATE TABLE IF NOT EXISTS `SSIOAccountResponse` (
  `can_edit` boolean /*Advertiser eligible to update order lines*/,
  `currency` text,
  `eligible` boolean /*Advertiser eligible to create order lines*/,
  `error` text /*Error indicator from Salesforce which could be \&quot;No Error\&quot;*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `SSIOAccountResponseSSIOAccountItem` generated from model 'SSIOAccountResponseSSIOAccountItem'

CREATE TABLE IF NOT EXISTS `SSIOAccountResponseSSIOAccountItem` (
  `sSIOAccountResponse` long NOT NULL
  `sSIOAccountItem` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `SSIOAccountResponseSSIOAccountPMPName` generated from model 'SSIOAccountResponseSSIOAccountPMPName'

CREATE TABLE IF NOT EXISTS `SSIOAccountResponseSSIOAccountPMPName` (
  `sSIOAccountResponse` long NOT NULL
  `sSIOAccountPMPName` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOCreateInsertionOrderRequest` generated from model 'ssIOCreateInsertionOrderRequest'
--

CREATE TABLE IF NOT EXISTS `SSIOCreateInsertionOrderRequest` (
  `billing_contact_email` text NOT NULL /*The billing contact email*/,
  `billing_contact_firstname` text NOT NULL /*The billing contact first name*/,
  `billing_contact_lastname` text NOT NULL /*The billing contact last name*/,
  `media_contact_email` text NOT NULL /*The media contact email*/,
  `media_contact_firstname` text NOT NULL /*The media contact first name*/,
  `media_contact_lastname` text NOT NULL /*The media contact last name*/,
  `po_number` text NOT NULL /*The po number*/,
  `start_date` text NOT NULL /*Starting date of time period. Format: YYYY-MM-DD*/,
  `accepted_terms_id` text NOT NULL /*The SFDC id for the terms*/,
  `billto_billing_address_id` text NOT NULL /*The bill-to billing address id*/,
  `billto_business_address_id` text NOT NULL /*The bill-to business address id*/,
  `billto_company_id` text NOT NULL /*The bill-to company id*/,
  `currency_info` long NOT NULL,
  `order_line_type` text NOT NULL /*Type can be Budget or Perpetual*/,
  `order_name` text NOT NULL /*The order name*/,
  `pmp_id` text NOT NULL /*The pmp id*/,
  `agency_link` text /*URL link for agency*/,
  `budget_amount` decimal /*If Budget order line, the budget amount.*/,
  `end_date` text /*End date of time period. Format: YYYY-MM-DD*/,
  `user_email` text /*The email of user submitting the insertion order*/,
  `accepted_terms_time` int /*The UTC timestamp (to the nearest sec) of when terms were accepted*/,
  `estimated_monthly_spend` decimal /*If Ongoing (perpetual) order line, the estimated monthly spend*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOCreateInsertionOrderResponse` generated from model 'ssIOCreateInsertionOrderResponse'
--

CREATE TABLE IF NOT EXISTS `SSIOCreateInsertionOrderResponse` (
  `pin_order_id` text /*Salesforce order id*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOEditInsertionOrderRequest` generated from model 'ssIOEditInsertionOrderRequest'
--

CREATE TABLE IF NOT EXISTS `SSIOEditInsertionOrderRequest` (
  `agency_link` text /*URL link for agency*/,
  `billing_contact_email` text /*The billing contact email*/,
  `billing_contact_firstname` text /*The billing contact first name*/,
  `billing_contact_lastname` text /*The billing contact last name*/,
  `budget_amount` decimal /*If Budget order line, the budget amount.*/,
  `end_date` text /*End date of time period. Format: YYYY-MM-DD*/,
  `media_contact_email` text /*The media contact email*/,
  `media_contact_firstname` text /*The media contact first name*/,
  `media_contact_lastname` text /*The media contact last name*/,
  `po_number` text /*The po number*/,
  `start_date` text /*Starting date of time period. Format: YYYY-MM-DD*/,
  `user_email` text /*The email of user submitting the insertion order*/,
  `ads_manager_order_line_id` text /*Ads manager OrderLineId*/,
  `oracle_line_id` text /*LineId in the Oracle DB*/,
  `salesforce_order_id` text /*OrderId in SFDC*/,
  `salesforce_order_line_id` text /*OrderLineId in SFDC*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOEditInsertionOrderResponse` generated from model 'ssIOEditInsertionOrderResponse'
--

CREATE TABLE IF NOT EXISTS `SSIOEditInsertionOrderResponse` (
  `pin_order_id` text /*Salesforce order id*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOInsertionOrderCommon` generated from model 'ssIOInsertionOrderCommon'
--

CREATE TABLE IF NOT EXISTS `SSIOInsertionOrderCommon` (
  `agency_link` text /*URL link for agency*/,
  `billing_contact_email` text /*The billing contact email*/,
  `billing_contact_firstname` text /*The billing contact first name*/,
  `billing_contact_lastname` text /*The billing contact last name*/,
  `budget_amount` decimal /*If Budget order line, the budget amount.*/,
  `end_date` text /*End date of time period. Format: YYYY-MM-DD*/,
  `media_contact_email` text /*The media contact email*/,
  `media_contact_firstname` text /*The media contact first name*/,
  `media_contact_lastname` text /*The media contact last name*/,
  `po_number` text /*The po number*/,
  `start_date` text /*Starting date of time period. Format: YYYY-MM-DD*/,
  `user_email` text /*The email of user submitting the insertion order*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOInsertionOrderStatus` generated from model 'ssIOInsertionOrderStatus'
--

CREATE TABLE IF NOT EXISTS `SSIOInsertionOrderStatus` (
  `creation_time` text /*Salesforce insertion order creation time*/,
  `pin_order_id` text /*Salesforce order id*/,
  `status` text /*Salesforce insertion order status*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOInsertionOrderStatusResponse` generated from model 'ssIOInsertionOrderStatusResponse'
--

CREATE TABLE IF NOT EXISTS `SSIOInsertionOrderStatusResponse` (
  `creation_time` text /*Salesforce insertion order creation time*/,
  `pin_order_id` text /*Salesforce order id*/,
  `status` text /*Salesforce insertion order status*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOOrderLine` generated from model 'ssIOOrderLine'
--

CREATE TABLE IF NOT EXISTS `SSIOOrderLine` (
  `accepted_terms_id` text /*The SFDC id for the terms*/,
  `accepted_terms_time` text /*The UTC timestamp (to the nearest sec) of when terms were accepted*/,
  `ads_manager_order_line_id` text /*Ads manager OrderLineId*/,
  `agency_link` text /*Agency link*/,
  `bill_to_company_name` text /*Bill To Company name*/,
  `billing_contact_email` text /*Billing contact email*/,
  `billing_contact_firstname` text /*Billing contact first name*/,
  `billing_contact_lastname` text /*Billing contact last name*/,
  `budget_amount` decimal /*If Budget order line, the budget amount.*/,
  `currency_info` long,
  `end_date` date /*End date of the order line.*/,
  `estimated_monthly_spend` decimal /*If Ongoing (perpetual) order line, the estimated monthly spend*/,
  `last_modified_date_time` text /*Last modified date.*/,
  `media_contact_email` text /*Billing media email*/,
  `media_contact_firstname` text /*Billing contact first name*/,
  `media_contact_lastname` text /*Billing contact first name*/,
  `order_name` text /*The order name*/,
  `pin_order_id` text /*The pin order id associated with the order line in SFDC*/,
  `pmp_name` text /*The Pinterest marketing partner name*/,
  `po_number` text /*The po number*/,
  `salesforce_order_line_id` text /*OrderLineId in SFDC*/,
  `start_date` date /*Start date of the order line.*/
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
-- Table structure for table `search_user_boards_get_200_response` generated from model 'searchUserBoardsGet200Response'
--

CREATE TABLE IF NOT EXISTS `search_user_boards_get_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `SearchUserBoardsGet200ResponseBoard` generated from model 'SearchUserBoardsGet200ResponseBoard'

CREATE TABLE IF NOT EXISTS `SearchUserBoardsGet200ResponseBoard` (
  `searchUserBoardsGet200Response` long NOT NULL
  `board` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `search_user_pins_list_200_response` generated from model 'searchUserPinsList200Response'
--

CREATE TABLE IF NOT EXISTS `search_user_pins_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `SearchUserPinsList200ResponsePin` generated from model 'SearchUserPinsList200ResponsePin'

CREATE TABLE IF NOT EXISTS `SearchUserPinsList200ResponsePin` (
  `searchUserPinsList200Response` long NOT NULL
  `pin` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SharedAudience` generated from model 'sharedAudience'
--

CREATE TABLE IF NOT EXISTS `SharedAudience` (
  `audience_id` text NOT NULL /*Unique identifier of an audience*/,
  `operation_type` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `SharedAudienceRecipientAccountIds` generated from model 'SharedAudienceRecipientAccountIds'

CREATE TABLE IF NOT EXISTS `SharedAudienceRecipientAccountIds` (
  `sharedAudience` long NOT NULL
  `recipientAccountIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SharedAudienceAccount` generated from model 'sharedAudienceAccount'
--

CREATE TABLE IF NOT EXISTS `SharedAudienceAccount` (
  `account_id` text NOT NULL /*Account ID (ad account or business ID).*/,
  `account_name` text NOT NULL /*Account name.*/,
  `account_type` text NOT NULL /*account type*/,
  `shared_on_timestamp` int NOT NULL /*Epoch timestamp in seconds for the shared audience event*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SharedAudienceCommon` generated from model 'sharedAudienceCommon'
--

CREATE TABLE IF NOT EXISTS `SharedAudienceCommon` (
  `audience_id` text /*Unique identifier of an audience*/,
  `operation_type` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SharedAudienceResponse` generated from model 'sharedAudienceResponse'
--

CREATE TABLE IF NOT EXISTS `SharedAudienceResponse` (
  `audience_id` text /*Audience ID that was shared*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `SharedAudienceResponseRole` generated from model 'SharedAudienceResponseRole'

CREATE TABLE IF NOT EXISTS `SharedAudienceResponseRole` (
  `sharedAudienceResponse` long NOT NULL
  `role` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `SharedAudienceResponseRecipientAccountIds` generated from model 'SharedAudienceResponseRecipientAccountIds'

CREATE TABLE IF NOT EXISTS `SharedAudienceResponseRecipientAccountIds` (
  `sharedAudienceResponse` long NOT NULL
  `recipientAccountIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SharedAudienceResponseCommon` generated from model 'sharedAudienceResponseCommon'
--

CREATE TABLE IF NOT EXISTS `SharedAudienceResponseCommon` (
  `audience_id` text /*Audience ID that was shared*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `SharedAudienceResponseCommonRole` generated from model 'SharedAudienceResponseCommonRole'

CREATE TABLE IF NOT EXISTS `SharedAudienceResponseCommonRole` (
  `sharedAudienceResponseCommon` long NOT NULL
  `role` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SingleInterestTargetingOptionResponse` generated from model 'singleInterestTargetingOptionResponse'
--

CREATE TABLE IF NOT EXISTS `SingleInterestTargetingOptionResponse` (
  `id` text PRIMARY KEY,
  `level` int,
  `name` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `SingleInterestTargetingOptionResponseChildInterests` generated from model 'SingleInterestTargetingOptionResponseChildInterests'

CREATE TABLE IF NOT EXISTS `SingleInterestTargetingOptionResponseChildInterests` (
  `singleInterestTargetingOptionResponse` long NOT NULL
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
-- Table structure for table `SummaryPin` generated from model 'summaryPin'
-- Summarized pin information
--

CREATE TABLE IF NOT EXISTS `SummaryPin` (
  `alt_text` text,
  `description` text,
  `id` text PRIMARY KEY,
  `link` text,
  `media` long,
  `title` text
);  /*Summarized pin information*/


-- --------------------------------------------------------------------------
-- Table structure for table `system_user_update_request` generated from model 'systemUserUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `system_user_update_request` (
  `name` text NOT NULL /*New system user name*/
); 


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
  `operation` text NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationAppTypeTargetingSpecAppType` generated from model 'TargetingSpecOperationAppTypeTargetingSpecAppType'

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationAppTypeTargetingSpecAppType` (
  `targetingSpecOperationAppType` long NOT NULL
  `targetingSpecAppType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationGender` generated from model 'targetingSpecOperationGender'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationGender` (
  `field` text NOT NULL,
  `operation` text NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationGenderTargetingSpecGender` generated from model 'TargetingSpecOperationGenderTargetingSpecGender'

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationGenderTargetingSpecGender` (
  `targetingSpecOperationGender` long NOT NULL
  `targetingSpecGender` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationList` generated from model 'targetingSpecOperationList'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationList` (
  `field` text NOT NULL,
  `operation` text NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationListPropertyValues` generated from model 'TargetingSpecOperationListPropertyValues'

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationListPropertyValues` (
  `targetingSpecOperationList` long NOT NULL
  `propertyValues` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecOperationMinMaxAge` generated from model 'targetingSpecOperationMinMaxAge'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationMinMaxAge` (
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
-- Table structure for table `TargetingSpecOperationString` generated from model 'targetingSpecOperationString'
--

CREATE TABLE IF NOT EXISTS `TargetingSpecOperationString` (
  `field` text NOT NULL,
  `operation` text NOT NULL,
  `value` text NOT NULL
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
-- Table structure for table `TargetingTemplateAudienceSizing` generated from model 'targetingTemplateAudienceSizing'
-- Gets an audience size estimate for a set of given targeting spec data. &lt;p&gt;Returns:&lt;/p&gt; An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate. 
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateAudienceSizing` (
  `reach_estimate` long
);  /*Gets an audience size estimate for a set of given targeting spec data. &lt;p&gt;Returns:&lt;/p&gt; An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate. */


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingTemplateAudienceSizing_reach_estimate` generated from model 'targetingTemplateAudienceSizingReachEstimate'
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateAudienceSizing_reach_estimate` (
  `estimate` long,
  `lower_bound` long,
  `upper_bound` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingTemplateCommon` generated from model 'targetingTemplateCommon'
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateCommon` (
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.*/,
  `name` text /*targeting template name*/,
  `placement_group` long,
  `targeting_attributes` long,
  `tracking_urls` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingTemplateCommonTargetingTemplateKeyword` generated from model 'TargetingTemplateCommonTargetingTemplateKeyword'

CREATE TABLE IF NOT EXISTS `TargetingTemplateCommonTargetingTemplateKeyword` (
  `targetingTemplateCommon` long NOT NULL
  `targetingTemplateKeyword` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingTemplateCreate` generated from model 'targetingTemplateCreate'
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateCreate` (
  `name` text NOT NULL /*Name of targeting template.*/,
  `targeting_attributes` long NOT NULL,
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.*/,
  `placement_group` long,
  `tracking_urls` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingTemplateCreateTargetingTemplateKeyword` generated from model 'TargetingTemplateCreateTargetingTemplateKeyword'

CREATE TABLE IF NOT EXISTS `TargetingTemplateCreateTargetingTemplateKeyword` (
  `targetingTemplateCreate` long NOT NULL
  `targetingTemplateKeyword` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingTemplateGetResponseData` generated from model 'targetingTemplateGetResponseData'
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateGetResponseData` (
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.*/,
  `name` text /*targeting template name*/,
  `placement_group` long,
  `targeting_attributes` long,
  `tracking_urls` long,
  `ad_account_id` text /*The ID of the advertiser that this targeting template belongs to.*/,
  `created_time` int /*Targeting template created time. Unix timestamp in seconds.*/,
  `id` text PRIMARY KEY /*Targeting template ID.*/,
  `sizing` long,
  `status` text /*Indicate targeting template is active or Deleted*/,
  `updated_time` int /*Targeting template updated time.Unix timestamp in seconds.*/,
  `valid` boolean /*Inform if the targeting template is valid (ex. would be false if has revoked audience)*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingTemplateGetResponseDataTargetingTemplateKeyword` generated from model 'TargetingTemplateGetResponseDataTargetingTemplateKeyword'

CREATE TABLE IF NOT EXISTS `TargetingTemplateGetResponseDataTargetingTemplateKeyword` (
  `targetingTemplateGetResponseData` long NOT NULL
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
-- Table structure for table `TargetingTemplateList200ResponseTargetingTemplateGetResponseData` generated from model 'TargetingTemplateList200ResponseTargetingTemplateGetResponseData'

CREATE TABLE IF NOT EXISTS `TargetingTemplateList200ResponseTargetingTemplateGetResponseData` (
  `targetingTemplateList200Response` long NOT NULL
  `targetingTemplateGetResponseData` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingTemplateResponseData` generated from model 'targetingTemplateResponseData'
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateResponseData` (
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.*/,
  `name` text /*targeting template name*/,
  `placement_group` long,
  `targeting_attributes` long,
  `tracking_urls` long,
  `ad_account_id` text /*The ID of the advertiser that this targeting template belongs to.*/,
  `created_time` int /*Targeting template created time. Unix timestamp in seconds.*/,
  `id` text PRIMARY KEY /*Targeting template ID.*/,
  `sizing` long,
  `status` text /*Indicate targeting template is active or Deleted*/,
  `updated_time` int /*Targeting template updated time.Unix timestamp in seconds.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingTemplateResponseDataTargetingTemplateKeyword` generated from model 'TargetingTemplateResponseDataTargetingTemplateKeyword'

CREATE TABLE IF NOT EXISTS `TargetingTemplateResponseDataTargetingTemplateKeyword` (
  `targetingTemplateResponseData` long NOT NULL
  `targetingTemplateKeyword` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingTemplateUpdateRequest` generated from model 'targetingTemplateUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `TargetingTemplateUpdateRequest` (
  `id` text NOT NULL PRIMARY KEY /*Targeting template ID*/,
  `operation_type` text NOT NULL,
  `targeting_attributes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingTypeFilter` generated from model 'targetingTypeFilter'
--

CREATE TABLE IF NOT EXISTS `TargetingTypeFilter` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingTypeFilterTargetingTypes` generated from model 'TargetingTypeFilterTargetingTypes'

CREATE TABLE IF NOT EXISTS `TargetingTypeFilterTargetingTypes` (
  `targetingTypeFilter` long NOT NULL
  `targetingTypes` text NOT NULL
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
-- Table structure for table `TemplateResponse` generated from model 'templateResponse'
-- Template fields
--

CREATE TABLE IF NOT EXISTS `TemplateResponse` (
  `ad_account_id` text /*ID of the Ad Account that owns the template*/,
  `click_window_days` decimal /*The length of the sliding window over which click conversions will be attributed*/,
  `conversion_report_time_type` text /*Conversion report time type*/,
  `creation_source` text /*The surface used to create this template*/,
  `date_range` long,
  `engagement_window_days` decimal /*The length of the sliding window over which engagement conversions will be attributed*/,
  `filters_json` text /*A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:&lt;br&gt; \&quot;field\&quot;: The column name&lt;br&gt; \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]&lt;br&gt; \&quot;value\&quot;: A single value or a list of values*/,
  `granularity` long,
  `id` text PRIMARY KEY /*Template ID*/,
  `is_deleted` boolean /*A boolean that indicates if the template has been deleted*/,
  `is_owned_by_user` boolean /*A boolean value that indicates if the user owns the template*/,
  `is_scheduled` boolean /*A boolean value that indicates if this template has been used to create a scheduled report*/,
  `name` text /*Template Name*/,
  `report_end_relative_days_in_past` decimal /*The number of days prior to the day the report will be delivered at which the report will end*/,
  `report_format` long,
  `report_level` long,
  `report_start_relative_days_in_past` decimal /*The number of days prior to the day the report will be delivered at which the report will start*/,
  `type` text /*Reporting template type*/,
  `updated_time` decimal /*Time of last update in seconds since Unix epoch*/,
  `user_id` text /*ID of the user who created the template*/,
  `view_window_days` decimal /*The length of the sliding window over which view conversions will be attributed*/
);  /*Template fields*/

-- --------------------------------------------------------------------------
-- Table structure for table `TemplateResponseAdAccountIds` generated from model 'TemplateResponseAdAccountIds'

CREATE TABLE IF NOT EXISTS `TemplateResponseAdAccountIds` (
  `templateResponse` long NOT NULL
  `adAccountIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TemplateResponseColumns` generated from model 'TemplateResponseColumns'

CREATE TABLE IF NOT EXISTS `TemplateResponseColumns` (
  `templateResponse` long NOT NULL
  `columns` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TemplateResponseCustomColumnIds` generated from model 'TemplateResponseCustomColumnIds'

CREATE TABLE IF NOT EXISTS `TemplateResponseCustomColumnIds` (
  `templateResponse` long NOT NULL
  `customColumnIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TemplateResponseIngestionSources` generated from model 'TemplateResponseIngestionSources'

CREATE TABLE IF NOT EXISTS `TemplateResponseIngestionSources` (
  `templateResponse` long NOT NULL
  `ingestionSources` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TemplateResponse_date_range` generated from model 'templateResponseDateRange'
--

CREATE TABLE IF NOT EXISTS `TemplateResponse_date_range` (
  `absolute_date_range` long,
  `dynamic_date_range` long,
  `relative_date_range` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TemplateResponse_date_range_absolute_date_range` generated from model 'templateResponseDateRangeAbsoluteDateRange'
-- The absolute date range of the template
--

CREATE TABLE IF NOT EXISTS `TemplateResponse_date_range_absolute_date_range` (
  `end_date` decimal /*The end date of the date range*/,
  `start_date` decimal /*The start date of the date range*/,
  `type` text /*The date range type*/
);  /*The absolute date range of the template*/


-- --------------------------------------------------------------------------
-- Table structure for table `TemplateResponse_date_range_dynamic_date_range` generated from model 'templateResponseDateRangeDynamicDateRange'
-- The dynamic date range of the template
--

CREATE TABLE IF NOT EXISTS `TemplateResponse_date_range_dynamic_date_range` (
  `range` text /*The dynamic range type*/,
  `type` text /*The date range type*/
);  /*The dynamic date range of the template*/


-- --------------------------------------------------------------------------
-- Table structure for table `TemplateResponse_date_range_relative_date_range` generated from model 'templateResponseDateRangeRelativeDateRange'
-- The relative date range of the template
--

CREATE TABLE IF NOT EXISTS `TemplateResponse_date_range_relative_date_range` (
  `end_days_in_past` decimal /*The end date of the date range*/,
  `start_days_in_past` decimal /*The start date of the date range*/,
  `type` text /*The date range type*/
);  /*The relative date range of the template*/


-- --------------------------------------------------------------------------
-- Table structure for table `templates_list_200_response` generated from model 'templatesList200Response'
--

CREATE TABLE IF NOT EXISTS `templates_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TemplatesList200ResponseTemplateResponse` generated from model 'TemplatesList200ResponseTemplateResponse'

CREATE TABLE IF NOT EXISTS `TemplatesList200ResponseTemplateResponse` (
  `templatesList200Response` long NOT NULL
  `templateResponse` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TermsOfService` generated from model 'termsOfService'
--

CREATE TABLE IF NOT EXISTS `TermsOfService` (
  `ad_account_id` text /*The ID of the ad account.*/,
  `has_accepted` boolean /*Whether the ad account has accepted terms of service.*/,
  `html` text /*The terms of service content*/,
  `id` text PRIMARY KEY /*The ID of the terms of service*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TimeSeries` generated from model 'timeSeries'
-- A sequence of weekly observations of the relative search volume for this keyword over the past year.&lt;br /&gt; These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the &#x60;normalize_against_group&#x60; query parameter can be used in cases where you wish to compare relative volume between keywords.&lt;br /&gt; **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week.  For example, a value of &#x60;2023-10-31&#x60; would include searches that happened between &#x60;2023-10-25&#x60; and &#x60;2023-10-31&#x60;.
--

CREATE TABLE IF NOT EXISTS `TimeSeries` (
  `date` date
);  /*A sequence of weekly observations of the relative search volume for this keyword over the past year.&lt;br /&gt; These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the &#x60;normalize_against_group&#x60; query parameter can be used in cases where you wish to compare relative volume between keywords.&lt;br /&gt; **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week.  For example, a value of &#x60;2023-10-31&#x60; would include searches that happened between &#x60;2023-10-25&#x60; and &#x60;2023-10-31&#x60;.*/


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
  `sort_by` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TopPinsAnalyticsResponseTopPinsAnalyticsResponsePinsInner` generated from model 'TopPinsAnalyticsResponseTopPinsAnalyticsResponsePinsInner'

CREATE TABLE IF NOT EXISTS `TopPinsAnalyticsResponseTopPinsAnalyticsResponsePinsInner` (
  `topPinsAnalyticsResponse` long NOT NULL
  `topPinsAnalyticsResponsePinsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TopPinsAnalyticsResponse_date_availability` generated from model 'topPinsAnalyticsResponseDateAvailability'
--

CREATE TABLE IF NOT EXISTS `TopPinsAnalyticsResponse_date_availability` (
  `is_realtime` boolean,
  `latest_available_timestamp` decimal
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TopPinsAnalyticsResponse_pins_inner` generated from model 'topPinsAnalyticsResponsePinsInner'
-- Array with metrics, status, and pin id for the requested metric
--

CREATE TABLE IF NOT EXISTS `TopPinsAnalyticsResponse_pins_inner` (
  `data_status` blob,
  `metrics` blob /*The metric name and daily value for each requested metric*/,
  `pin_id` text /*The pin id*/
);  /*Array with metrics, status, and pin id for the requested metric*/


-- --------------------------------------------------------------------------
-- Table structure for table `TopVideoPinsAnalyticsResponse` generated from model 'topVideoPinsAnalyticsResponse'
--

CREATE TABLE IF NOT EXISTS `TopVideoPinsAnalyticsResponse` (
  `date_availability` long,
  `sort_by` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TopVideoPinsAnalyticsResponseTopVideoPinsAnalyticsResponsePinsInner` generated from model 'TopVideoPinsAnalyticsResponseTopVideoPinsAnalyticsResponsePinsInner'

CREATE TABLE IF NOT EXISTS `TopVideoPinsAnalyticsResponseTopVideoPinsAnalyticsResponsePinsInner` (
  `topVideoPinsAnalyticsResponse` long NOT NULL
  `topVideoPinsAnalyticsResponsePinsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TopVideoPinsAnalyticsResponse_pins_inner` generated from model 'topVideoPinsAnalyticsResponsePinsInner'
-- Array with metrics, status, and pin id for the requested metric
--

CREATE TABLE IF NOT EXISTS `TopVideoPinsAnalyticsResponse_pins_inner` (
  `data_status` blob,
  `metrics` blob /*The metric name and daily value for each requested metric*/,
  `pin_id` text /*The pin id*/
);  /*Array with metrics, status, and pin id for the requested metric*/


-- --------------------------------------------------------------------------
-- Table structure for table `TrackingUrls` generated from model 'trackingUrls'
-- Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
--

CREATE TABLE IF NOT EXISTS `TrackingUrls` (
);  /*Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.*/

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
  `has_prediction` boolean /*Indicates whether the keyword has a prediction available for the next 90 days.&lt;br /&gt; This field is only applicable when &#x60;include_prediction&#x60; query parameter is set to &#x60;true&#x60;. &lt;br /&gt; By default, the value is &#x60;false&#x60; and no prediction data is included in the response.*/,
  `keyword` text /*The keyword that is trending.*/,
  `pct_growth_mom` int /*The month-over-month percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;400\&quot; would represent a 400% increase in searches in the last 30 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% month-over-month growth.*/,
  `pct_growth_wow` int /*The week-over-week percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;50\&quot; would represent a 50% increase in searches in the last seven days compared to the week prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% week-over-week growth.*/,
  `pct_growth_yoy` int /*The year-over-year percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;-5\&quot; would represent a 5% decrease in searches in the last 365 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% year-over-year growth.*/,
  `predicted_time_series` long,
  `time_series` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TrendingKeyword_demographics` generated from model 'trendingKeywordDemographics'
-- A mapping of demographic dimensions (e.g. \&quot;gender\&quot;, \&quot;age\&quot;) to their category distributions. &lt;br /&gt; For each dimension: &lt;br /&gt;   - Key: The category (e.g., \&quot;female\&quot;, \&quot;18-24\&quot;). &lt;br /&gt;   - Value: The proportion of search volume (e.g., 0.12 for 12%). &lt;br /&gt;     Values less than 0.05 are set to 0.04 for privacy. &lt;br /&gt;     The sum for all categories in a dimension will approximately equal 1. &lt;br /&gt;     Only applicable when &#x60;include_demographics&#x60; query parameter is set to &#x60;true&#x60;.
--

CREATE TABLE IF NOT EXISTS `TrendingKeyword_demographics` (
  `age_distribution` long,
  `gender_distribution` long
);  /*A mapping of demographic dimensions (e.g. \&quot;gender\&quot;, \&quot;age\&quot;) to their category distributions. &lt;br /&gt; For each dimension: &lt;br /&gt;   - Key: The category (e.g., \&quot;female\&quot;, \&quot;18-24\&quot;). &lt;br /&gt;   - Value: The proportion of search volume (e.g., 0.12 for 12%). &lt;br /&gt;     Values less than 0.05 are set to 0.04 for privacy. &lt;br /&gt;     The sum for all categories in a dimension will approximately equal 1. &lt;br /&gt;     Only applicable when &#x60;include_demographics&#x60; query parameter is set to &#x60;true&#x60;.*/


-- --------------------------------------------------------------------------
-- Table structure for table `TrendingKeyword_demographics_age_distribution` generated from model 'trendingKeywordDemographicsAgeDistribution'
-- This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
--

CREATE TABLE IF NOT EXISTS `TrendingKeyword_demographics_age_distribution` (
  `age_distribution` text
);  /*This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.*/


-- --------------------------------------------------------------------------
-- Table structure for table `TrendingKeyword_demographics_gender_distribution` generated from model 'trendingKeywordDemographicsGenderDistribution'
-- This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
--

CREATE TABLE IF NOT EXISTS `TrendingKeyword_demographics_gender_distribution` (
  `gender_distribution` text
);  /*This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.*/


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
  `height` int NOT NULL /*Height of the pin image in pixels*/,
  `id` text NOT NULL PRIMARY KEY /*Unique identifier for the pin*/,
  `src` text NOT NULL /*URL of the pin image*/,
  `width` int NOT NULL /*Width of the pin image in pixels*/
);  /*Pin image data for trending topics*/


-- --------------------------------------------------------------------------
-- Table structure for table `TrendingProductCategory` generated from model 'trendingProductCategory'
-- Trending shopping product category
--

CREATE TABLE IF NOT EXISTS `TrendingProductCategory` (
  `engagement_type` long NOT NULL /*Engagement type*/,
  `pct_change_mom` int NOT NULL /*Month-over-month change percentage*/,
  `percent_relative_volume` int NOT NULL /*Relative volume percentage*/,
  `product_category` text NOT NULL /*Product Category Name*/,
);  /*Trending shopping product category*/

-- --------------------------------------------------------------------------
-- Table structure for table `TrendingProductCategoryVerticalProductCategory` generated from model 'TrendingProductCategoryVerticalProductCategory'

CREATE TABLE IF NOT EXISTS `TrendingProductCategoryVerticalProductCategory` (
  `trendingProductCategory` long NOT NULL
  `verticalProductCategory` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TrendingTopic` generated from model 'trendingTopic'
-- Individual trending topic within an interest category
--

CREATE TABLE IF NOT EXISTS `TrendingTopic` (
  `description` text NOT NULL /*Description of the trending topic*/,
  `percent_growth_mom` int NOT NULL /*Month-over-month growth percentage*/,
  `time_series` blob NOT NULL /*Time series data showing trend values over time, with dates as keys and values as numeric*/,
  `title` text NOT NULL /*Title of the trending topic*/
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
-- Table structure for table `UpdatableItemAttributes` generated from model 'updatableItemAttributes'
--

CREATE TABLE IF NOT EXISTS `UpdatableItemAttributes` (
  `ad_image_0_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_0_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_10_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_10_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_11_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_11_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_12_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_12_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_13_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_13_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_14_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_14_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_15_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_15_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_16_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_16_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_17_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_17_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_18_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_18_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_19_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_19_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_1_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_1_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_2_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_2_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_3_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_3_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_4_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_4_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_5_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_5_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_6_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_6_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_7_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_7_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_8_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_8_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_image_9_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad image link that supplements main image for shopping campaigns.&lt;/p&gt; &lt;p&gt;Image format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size at least 75 x 75&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder images in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_image_9_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.&lt;/p&gt;*/,
  `ad_link` text /*Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.*/,
  `ad_video_0_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad video link that supplements main video for shopping campaigns.&lt;/p&gt; &lt;p&gt;Video format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size between 75 x 75 and 9450 x 9450&lt;/li&gt;   &lt;li&gt;File size smaller than 2 GB&lt;/li&gt;   &lt;li&gt;Time span between 4 seconds and 15 minutes&lt;/li&gt;   &lt;li&gt;Accepted formats: .MP4, .MOV, .M4V&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder videos in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_video_0_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.&lt;/p&gt;*/,
  `ad_video_1_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad video link that supplements main video for shopping campaigns.&lt;/p&gt; &lt;p&gt;Video format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size between 75 x 75 and 9450 x 9450&lt;/li&gt;   &lt;li&gt;File size smaller than 2 GB&lt;/li&gt;   &lt;li&gt;Time span between 4 seconds and 15 minutes&lt;/li&gt;   &lt;li&gt;Accepted formats: .MP4, .MOV, .M4V&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder videos in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_video_1_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.&lt;/p&gt;*/,
  `ad_video_2_link` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;Ad video link that supplements main video for shopping campaigns.&lt;/p&gt; &lt;p&gt;Video format:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Pixel size between 75 x 75 and 9450 x 9450&lt;/li&gt;   &lt;li&gt;File size smaller than 2 GB&lt;/li&gt;   &lt;li&gt;Time span between 4 seconds and 15 minutes&lt;/li&gt;   &lt;li&gt;Accepted formats: .MP4, .MOV, .M4V&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Link guidelines:&lt;/p&gt; &lt;ul&gt;   &lt;li&gt;Include extension in file name&lt;/li&gt;   &lt;li&gt;Do not include template or placeholder videos in link&lt;/li&gt;   &lt;li&gt;Make URL accessible to Pinterest user-agent&lt;/li&gt;   &lt;li&gt;Must start with http:// or https://&lt;/li&gt; &lt;/ul&gt;*/,
  `ad_video_2_tag` text /*&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt; &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.&lt;/p&gt;*/,
  `adult` boolean /*Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest.*/,
  `age_group` text /*The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.*/,
  `android_deep_link` text /*The deep link to the product on the Android app.*/,
  `availability` text /*The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.*/,
  `average_review_rating` decimal /*Average reviews for the item. Can be a number from 1-5.*/,
  `brand` text /*The brand of the product.*/,
  `checkout_enabled` boolean /*This attribute is not supported anymore.*/,
  `color` text /*The primary color of the product.*/,
  `condition` text /*The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.*/,
  `custom_label_0` text /*&lt;p&gt;&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `custom_label_1` text /*&lt;p&gt;&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `custom_label_2` text /*&lt;p&gt;&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `custom_label_3` text /*&lt;p&gt;&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `custom_label_4` text /*&lt;p&gt;&lt;&#x3D; 511 characters for retail and creative asset catalogs, &lt;&#x3D; 127 characters for hotel catalogs&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `custom_number_0` int /*an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_1` int /*an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_2` int /*an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_3` int /*an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `custom_number_4` int /*an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.*/,
  `description` text /*&lt;p&gt;&lt;&#x3D; 10000 characters&lt;/p&gt; &lt;p&gt;The description of the product.&lt;/p&gt;*/,
  `free_shipping_label` boolean /*The item is free to ship.*/,
  `free_shipping_limit` text /*The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.*/,
  `gender` text /*The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.*/,
  `google_product_category` text /*The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.*/,
  `gtin` long,
  `id` text PRIMARY KEY /*&lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The user-created unique ID that represents the product. Only Unicode characters are accepted.&lt;/p&gt;*/,
  `installment_price` text /*Installment price of the product. This data will only be shown to pinners in the enabled countries. Expected format: &lt;payment_count&gt;:&lt;payment_amount&gt; &lt;currency&gt;*/,
  `ios_deep_link` text /*The deep link to the product on the iOS app.*/,
  `item_group_id` text /*&lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The parent ID of the product.&lt;/p&gt;*/,
  `last_updated_time` long /*The millisecond timestamp when the item was lastly modified by the merchant.*/,
  `link` text /*&lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;The landing page for the product.&lt;/p&gt;*/,
  `material` text /*The material used to make the product.*/,
  `min_ad_price` text /*The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.*/,
  `mobile_link` text /*The mobile-optimized version of your landing page. Must begin with http:// or https://.*/,
  `mpn` text /*Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.*/,
  `number_of_ratings` int /*The number of ratings for the item.*/,
  `number_of_reviews` int /*The number of reviews available for the item.*/,
  `pattern` text /*The description of the pattern used for the product.*/,
  `price` text /*The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.*/,
  `product_type` text /*&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.&lt;/p&gt;*/,
  `promotion_id` text /*A unique identifier referencing the promotion associated with this catalog item.*/,
  `sale_price` text /*The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars.*/,
  `sale_price_effective_date` text /*Sale price effective date. Expected format: &lt;start_date&gt;/&lt;end_date&gt; (ISO 8601 format)*/,
  `shipping` text /*Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.*/,
  `shipping_height` text /*The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.*/,
  `shipping_weight` text /*The weight of the product. Ensure there is a space between the numeric string and the metric.*/,
  `shipping_width` text /*The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.*/,
  `size` text /*The size of the product.*/,
  `size_system` text /*Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.*/,
  `size_type` text /*Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.*/,
  `tax` text /*Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.*/,
  `title` text /*&lt;p&gt;&lt;&#x3D; 500 characters&lt;/p&gt; &lt;p&gt;The name of the product.&lt;/p&gt;*/,
  `unit_pricing_base_measure` text /*Unit pricing base measure of the product. This data will only be shown to pinners in the enabled countries. Expected format: &lt;base_measure&gt; &lt;unit_type&gt;*/,
  `unit_pricing_measure` text /*Unit pricing total measure of the product. This data will only be shown to pinners in the enabled countries. Expected format: &lt;total_units&gt; &lt;unit_type&gt;*/,
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
-- Table structure for table `UpdateAssetGroupBody` generated from model 'updateAssetGroupBody'
--

CREATE TABLE IF NOT EXISTS `UpdateAssetGroupBody` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateAssetGroupBodyUpdateAssetGroupBodyAssetGroupsToUpdateInner` generated from model 'UpdateAssetGroupBodyUpdateAssetGroupBodyAssetGroupsToUpdateInner'

CREATE TABLE IF NOT EXISTS `UpdateAssetGroupBodyUpdateAssetGroupBodyAssetGroupsToUpdateInner` (
  `updateAssetGroupBody` long NOT NULL
  `updateAssetGroupBodyAssetGroupsToUpdateInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateAssetGroupBody_asset_groups_to_update_inner` generated from model 'updateAssetGroupBodyAssetGroupsToUpdateInner'
--

CREATE TABLE IF NOT EXISTS `UpdateAssetGroupBody_asset_groups_to_update_inner` (
  `asset_group_id` text NOT NULL /*Unique identifier of the asset group to update.*/,
  `description` text /*Asset group description*/,
  `name` text /*Asset Group name*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetGroupType` generated from model 'UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetGroupType'

CREATE TABLE IF NOT EXISTS `UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetGroupType` (
  `updateAssetGroupBodyAssetGroupsToUpdateInner` long NOT NULL
  `assetGroupType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetsToAdd` generated from model 'UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetsToAdd'

CREATE TABLE IF NOT EXISTS `UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetsToAdd` (
  `updateAssetGroupBodyAssetGroupsToUpdateInner` long NOT NULL
  `assetsToAdd` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetsToRemove` generated from model 'UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetsToRemove'

CREATE TABLE IF NOT EXISTS `UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetsToRemove` (
  `updateAssetGroupBodyAssetGroupsToUpdateInner` long NOT NULL
  `assetsToRemove` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateAssetGroupResponse` generated from model 'updateAssetGroupResponse'
--

CREATE TABLE IF NOT EXISTS `UpdateAssetGroupResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateAssetGroupResponseUpdateAssetGroupResponseExceptionsInner` generated from model 'UpdateAssetGroupResponseUpdateAssetGroupResponseExceptionsInner'

CREATE TABLE IF NOT EXISTS `UpdateAssetGroupResponseUpdateAssetGroupResponseExceptionsInner` (
  `updateAssetGroupResponse` long NOT NULL
  `updateAssetGroupResponseExceptionsInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateAssetGroupResponseAssetGroupBinding` generated from model 'UpdateAssetGroupResponseAssetGroupBinding'

CREATE TABLE IF NOT EXISTS `UpdateAssetGroupResponseAssetGroupBinding` (
  `updateAssetGroupResponse` long NOT NULL
  `assetGroupBinding` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateAssetGroupResponse_exceptions_inner` generated from model 'updateAssetGroupResponseExceptionsInner'
--

CREATE TABLE IF NOT EXISTS `UpdateAssetGroupResponse_exceptions_inner` (
  `asset_group_id` text /*Asset group id of the exception.*/,
  `code` int /*Error code associated with the error editing asset group.*/,
  `message` text /*Error message associated with the error editing asset group.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateInvitesResultsResponseArray` generated from model 'updateInvitesResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `UpdateInvitesResultsResponseArray` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateInvitesResultsResponseArrayUpdateInvitesResultsResponseArrayItemsInner` generated from model 'UpdateInvitesResultsResponseArrayUpdateInvitesResultsResponseArrayItemsInner'

CREATE TABLE IF NOT EXISTS `UpdateInvitesResultsResponseArrayUpdateInvitesResultsResponseArrayItemsInner` (
  `updateInvitesResultsResponseArray` long NOT NULL
  `updateInvitesResultsResponseArrayItemsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateInvitesResultsResponseArray_items_inner` generated from model 'updateInvitesResultsResponseArrayItemsInner'
--

CREATE TABLE IF NOT EXISTS `UpdateInvitesResultsResponseArray_items_inner` (
  `exception` long,
  `invite` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMemberAssetAccessBody` generated from model 'updateMemberAssetAccessBody'
-- An object with a list of all the new accesses.
--

CREATE TABLE IF NOT EXISTS `UpdateMemberAssetAccessBody` (
);  /*An object with a list of all the new accesses.*/

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMemberAssetAccessBodyUpdateMemberAssetAccessBodyAccessesInner` generated from model 'UpdateMemberAssetAccessBodyUpdateMemberAssetAccessBodyAccessesInner'

CREATE TABLE IF NOT EXISTS `UpdateMemberAssetAccessBodyUpdateMemberAssetAccessBodyAccessesInner` (
  `updateMemberAssetAccessBody` long NOT NULL
  `updateMemberAssetAccessBodyAccessesInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMemberAssetAccessBody_accesses_inner` generated from model 'updateMemberAssetAccessBodyAccessesInner'
--

CREATE TABLE IF NOT EXISTS `UpdateMemberAssetAccessBody_accesses_inner` (
  `asset_id` text NOT NULL /*Id of the asset to update.*/,
  `member_id` text NOT NULL /*Unique identifier of the member on which to perform the update*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMemberAssetAccessBodyAccessesInnerPermissions` generated from model 'UpdateMemberAssetAccessBodyAccessesInnerPermissions'

CREATE TABLE IF NOT EXISTS `UpdateMemberAssetAccessBodyAccessesInnerPermissions` (
  `updateMemberAssetAccessBodyAccessesInner` long NOT NULL
  `permissions` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMemberAssetsResultsResponseArray` generated from model 'updateMemberAssetsResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `UpdateMemberAssetsResultsResponseArray` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMemberAssetsResultsResponseArrayUpdateMemberAssetsResultsResponseArrayItemsInner` generated from model 'UpdateMemberAssetsResultsResponseArrayUpdateMemberAssetsResultsResponseArrayItemsInner'

CREATE TABLE IF NOT EXISTS `UpdateMemberAssetsResultsResponseArrayUpdateMemberAssetsResultsResponseArrayItemsInner` (
  `updateMemberAssetsResultsResponseArray` long NOT NULL
  `updateMemberAssetsResultsResponseArrayItemsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMemberAssetsResultsResponseArray_items_inner` generated from model 'updateMemberAssetsResultsResponseArrayItemsInner'
--

CREATE TABLE IF NOT EXISTS `UpdateMemberAssetsResultsResponseArray_items_inner` (
  `response` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMemberBusinessRoleBody` generated from model 'updateMemberBusinessRoleBody'
-- Single instance of a business member to have its role updated
--

CREATE TABLE IF NOT EXISTS `UpdateMemberBusinessRoleBody` (
  `business_role` long NOT NULL,
  `member_id` text NOT NULL /*Unique identifier of the member*/
);  /*Single instance of a business member to have its role updated*/


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMemberResult` generated from model 'updateMemberResult'
--

CREATE TABLE IF NOT EXISTS `UpdateMemberResult` (
  `business_role` text /*The access level a member has to the business. Values are case-sensitive. &lt;br&gt; - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. &lt;br&gt; - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.*/,
  `member_id` text /*Unique identifier of the business member.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMemberResultsResponseArray` generated from model 'updateMemberResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `UpdateMemberResultsResponseArray` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UpdateMemberResultsResponseArrayUpdateMemberResult` generated from model 'UpdateMemberResultsResponseArrayUpdateMemberResult'

CREATE TABLE IF NOT EXISTS `UpdateMemberResultsResponseArrayUpdateMemberResult` (
  `updateMemberResultsResponseArray` long NOT NULL
  `updateMemberResult` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePartnerAssetAccessBody` generated from model 'updatePartnerAssetAccessBody'
--

CREATE TABLE IF NOT EXISTS `UpdatePartnerAssetAccessBody` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePartnerAssetAccessBodyUpdatePartnerAssetAccessBodyAccessesInner` generated from model 'UpdatePartnerAssetAccessBodyUpdatePartnerAssetAccessBodyAccessesInner'

CREATE TABLE IF NOT EXISTS `UpdatePartnerAssetAccessBodyUpdatePartnerAssetAccessBodyAccessesInner` (
  `updatePartnerAssetAccessBody` long NOT NULL
  `updatePartnerAssetAccessBodyAccessesInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePartnerAssetAccessBody_accesses_inner` generated from model 'updatePartnerAssetAccessBodyAccessesInner'
--

CREATE TABLE IF NOT EXISTS `UpdatePartnerAssetAccessBody_accesses_inner` (
  `asset_id` text NOT NULL /*Unique identifier of the business asset.*/,
  `partner_id` text NOT NULL /*Unique identifier of a business partner to update asset access to.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePartnerAssetAccessBodyAccessesInnerPermissions` generated from model 'UpdatePartnerAssetAccessBodyAccessesInnerPermissions'

CREATE TABLE IF NOT EXISTS `UpdatePartnerAssetAccessBodyAccessesInnerPermissions` (
  `updatePartnerAssetAccessBodyAccessesInner` long NOT NULL
  `permissions` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePartnerAssetsResult` generated from model 'updatePartnerAssetsResult'
-- An object containing the permissions a business partner has on the asset.
--

CREATE TABLE IF NOT EXISTS `UpdatePartnerAssetsResult` (
  `asset_id` text /*Unique identifier of a business asset.*/,
  `asset_type` text /*Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.*/,
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
-- Table structure for table `UpdatePartnerResultsResponseArray` generated from model 'updatePartnerResultsResponseArray'
--

CREATE TABLE IF NOT EXISTS `UpdatePartnerResultsResponseArray` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePartnerResultsResponseArrayUpdatePartnerResultsResponseArrayItemsInner` generated from model 'UpdatePartnerResultsResponseArrayUpdatePartnerResultsResponseArrayItemsInner'

CREATE TABLE IF NOT EXISTS `UpdatePartnerResultsResponseArrayUpdatePartnerResultsResponseArrayItemsInner` (
  `updatePartnerResultsResponseArray` long NOT NULL
  `updatePartnerResultsResponseArrayItemsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `UpdatePartnerResultsResponseArray_items_inner` generated from model 'updatePartnerResultsResponseArrayItemsInner'
--

CREATE TABLE IF NOT EXISTS `UpdatePartnerResultsResponseArray_items_inner` (
  `exception` long,
  `member_or_partner_id` text
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
  `assets_summary` long,
  `created_by_business` long /*Metadata for the business that created the business relationship.*/,
  `created_by_user` long /*Metadata for the user that created the business relationship.*/,
  `created_time` int /*The time the business relationship was created. Returned in milliseconds.*/,
  `id` text PRIMARY KEY /*Unique identifier of the business member/business partner/employer.*/,
  `is_shared_partner` boolean /*This field is only relevant when business_role&#x3D;\&quot;PARTNER\&quot;. &lt;br&gt;If is_shared_partner&#x3D;FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. &lt;br&gt;If is_shared_partner&#x3D;TRUE, you can access the partner&#39;s business asset. If assets_summary is not empty, the assets listed are the partner&#39;s business assets you have access to.*/,
  `user` long /*Metadata for the business member/business partner/employer.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UserBusinessRoleBindingBusinessRoles` generated from model 'UserBusinessRoleBindingBusinessRoles'

CREATE TABLE IF NOT EXISTS `UserBusinessRoleBindingBusinessRoles` (
  `userBusinessRoleBinding` long NOT NULL
  `businessRoles` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `user_following_get_200_response` generated from model 'userFollowingGet200Response'
--

CREATE TABLE IF NOT EXISTS `user_following_get_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UserFollowingGet200ResponseUserSummary` generated from model 'UserFollowingGet200ResponseUserSummary'

CREATE TABLE IF NOT EXISTS `UserFollowingGet200ResponseUserSummary` (
  `userFollowingGet200Response` long NOT NULL
  `userSummary` long NOT NULL
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
-- Table structure for table `UserSummary` generated from model 'userSummary'
--

CREATE TABLE IF NOT EXISTS `UserSummary` (
  `type` text /*Always \&quot;user\&quot;*/,
  `username` text /*Username*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `UserWebsiteSummary` generated from model 'userWebsiteSummary'
--

CREATE TABLE IF NOT EXISTS `UserWebsiteSummary` (
  `status` text /*Status of the verification process*/,
  `verified_at` text /*UTC timestamp when the verification happened - sometimes missing*/,
  `website` text /*Website with path or domain only*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `UserWebsiteVerificationCode` generated from model 'userWebsiteVerificationCode'
--

CREATE TABLE IF NOT EXISTS `UserWebsiteVerificationCode` (
  `dns_txt_record` text /*DNS TXT record to check against for the website to be claimed*/,
  `file_content` text /*A full html file to upload to the website in order for it to be claimed*/,
  `filename` text /*File expected to find on the website being claimed*/,
  `metatag` text /*Metatag the verification process searchs for the website to be claimed*/,
  `verification_code` text /*Code to check against the user claiming the website*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `UserWebsiteVerifyRequest` generated from model 'userWebsiteVerifyRequest'
-- User website verification request
--

CREATE TABLE IF NOT EXISTS `UserWebsiteVerifyRequest` (
  `verification_method` text,
  `website` text
);  /*User website verification request*/


-- --------------------------------------------------------------------------
-- Table structure for table `user_websites_get_200_response` generated from model 'userWebsitesGet200Response'
--

CREATE TABLE IF NOT EXISTS `user_websites_get_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `UserWebsitesGet200ResponseUserWebsiteSummary` generated from model 'UserWebsitesGet200ResponseUserWebsiteSummary'

CREATE TABLE IF NOT EXISTS `UserWebsitesGet200ResponseUserWebsiteSummary` (
  `userWebsitesGet200Response` long NOT NULL
  `userWebsiteSummary` long NOT NULL
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
  `cover_image_url` text,
  `duration` decimal /*Duration (in miliseconds). Field maybe null after creation due to video processing time.*/,
  `height` int /*Height (in pixels). Field maybe null after creation due to video processing time.*/,
  `item_type` text,
  `video_url` text /*Video url (720p).  **Note:** This field is limited and not available to all apps.*/,
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
