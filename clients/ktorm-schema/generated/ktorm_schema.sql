

-- --------------------------------------------------------------------------
-- Table structure for table `Account` generated from model 'account'
--

CREATE TABLE IF NOT EXISTS `Account` (
  `account_type` text /*Type of account*/,
  `id` text PRIMARY KEY /*User account ID.*/,
  `profile_image` text,
  `website_url` text,
  `username` text,
  `about` text /*Profile about description.*/,
  `business_name` text,
  `board_count` int /*User account board count.&lt;br/&gt;**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.*/,
  `pin_count` int /*User account pin count. This includes both created and saved pins.*/,
  `follower_count` int /*User account follower count.*/,
  `following_count` int /*User account following count.*/,
  `monthly_views` int /*User account monthly views.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccount` generated from model 'adAccount'
--

CREATE TABLE IF NOT EXISTS `AdAccount` (
  `id` text PRIMARY KEY,
  `name` text,
  `owner` long,
  `country` long,
  `currency` long,
  `created_time` int /*Creation time. Unix timestamp in seconds.*/,
  `updated_time` int /*Last update time. Unix timestamp in seconds.*/
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
-- Table structure for table `AdAccountCreateRequest` generated from model 'adAccountCreateRequest'
--

CREATE TABLE IF NOT EXISTS `AdAccountCreateRequest` (
  `country` long,
  `name` text /*Ad Account name.*/,
  `owner_user_id` text /*Advertiser&#39;s owning user ID.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountCreateSubscriptionRequest` generated from model 'adAccountCreateSubscriptionRequest'
--

CREATE TABLE IF NOT EXISTS `AdAccountCreateSubscriptionRequest` (
  `webhook_url` text NOT NULL /*Standard HTTPS webhook URL.*/,
  `lead_form_id` text /*Lead form ID.*/,
  `partner_access_token` text /*Partner access token. Only for clients that requires authentication. We recommend to avoid this param.*/,
  `partner_refresh_token` text /*Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountCreateSubscriptionResponse` generated from model 'adAccountCreateSubscriptionResponse'
--

CREATE TABLE IF NOT EXISTS `AdAccountCreateSubscriptionResponse` (
  `id` text PRIMARY KEY /*Subscription ID.*/,
  `cryptographic_key` text /*Base64 encoded key for client to decrypt lead data.*/,
  `cryptographic_algorithm` text /*Lead data encryption algorithm.*/,
  `created_time` int /*Subscription creation time. Unix timestamp in milliseconds.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountGetSubscriptionResponse` generated from model 'adAccountGetSubscriptionResponse'
--

CREATE TABLE IF NOT EXISTS `AdAccountGetSubscriptionResponse` (
  `lead_form_id` text /*Lead form ID.*/,
  `webhook_url` text /*Standard HTTPS webhook URL.*/,
  `id` text PRIMARY KEY /*Subscription ID.*/,
  `user_account_id` text /*User account used to subscribe lead data.*/,
  `ad_account_id` text /*The Ad Account ID that this lead form belongs to.*/,
  `api_version` text /*API version.*/,
  `cryptographic_key` text /*Base64 encoded key for client to decrypt lead data.*/,
  `cryptographic_algorithm` text /*Lead data encryption algorithm.*/,
  `created_time` int /*Lead form creation time. Unix timestamp in milliseconds.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Ad_account_owner` generated from model 'adAccountOwner'
--

CREATE TABLE IF NOT EXISTS `Ad_account_owner` (
  `username` text /*Public username for the user account*/,
  `id` text PRIMARY KEY /*The owning account&#39;s user ID.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ad_accounts_catalogs_product_groups_list_200_response` generated from model 'adAccountsCatalogsProductGroupsList200Response'
--

CREATE TABLE IF NOT EXISTS `ad_accounts_catalogs_product_groups_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdAccountsCatalogsProductGroupsList200ResponseCatalogProductGroup` generated from model 'AdAccountsCatalogsProductGroupsList200ResponseCatalogProductGroup'

CREATE TABLE IF NOT EXISTS `AdAccountsCatalogsProductGroupsList200ResponseCatalogProductGroup` (
  `adAccountsCatalogsProductGroupsList200Response` long NOT NULL
  `catalogProductGroup` long NOT NULL
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
-- Table structure for table `AdAccountsSubscriptionsGetList200ResponseAdAccountGetSubscriptionResponse` generated from model 'AdAccountsSubscriptionsGetList200ResponseAdAccountGetSubscriptionResponse'

CREATE TABLE IF NOT EXISTS `AdAccountsSubscriptionsGetList200ResponseAdAccountGetSubscriptionResponse` (
  `adAccountsSubscriptionsGetList200Response` long NOT NULL
  `adAccountGetSubscriptionResponse` long NOT NULL
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
  `android_deep_link` text /*Deep link URL for Android devices. Not currently available. Using this field will generate an error.*/,
  `click_tracking_url` text /*Tracking url for the ad clicks.*/,
  `creative_type` long,
  `destination_url` text /*Destination URL.*/,
  `ios_deep_link` text /*Deep link URL for iOS devices. Not currently available. Using this field will generate an error.*/,
  `is_pin_deleted` boolean /*Is original pin deleted?*/,
  `is_removable` boolean /*Is pin repinnable?*/,
  `name` text /*Name of the ad - 255 chars max.*/,
  `status` long,
  `tracking_urls` long,
  `view_tracking_url` text /*Tracking URL for ad impressions.*/,
  `lead_form_id` text /*Lead form ID for lead ad generation.*/,
  `grid_click_type` long,
  `customizable_cta_type` text /*Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)*/,
  `quiz_pin_data` long
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
-- Table structure for table `AdCommon_quiz_pin_data` generated from model 'adCommonQuizPinData'
-- Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
--

CREATE TABLE IF NOT EXISTS `AdCommon_quiz_pin_data` (
);  /*Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.*/

-- --------------------------------------------------------------------------
-- Table structure for table `AdCommonQuizPinDataQuizPinQuestion` generated from model 'AdCommonQuizPinDataQuizPinQuestion'

CREATE TABLE IF NOT EXISTS `AdCommonQuizPinDataQuizPinQuestion` (
  `adCommonQuizPinData` long NOT NULL
  `quizPinQuestion` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdCommonQuizPinDataQuizPinResult` generated from model 'AdCommonQuizPinDataQuizPinResult'

CREATE TABLE IF NOT EXISTS `AdCommonQuizPinDataQuizPinResult` (
  `adCommonQuizPinData` long NOT NULL
  `quizPinResult` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdCommon_tracking_urls` generated from model 'adCommonTrackingUrls'
--

CREATE TABLE IF NOT EXISTS `AdCommon_tracking_urls` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdCommonTrackingUrlsImpression` generated from model 'AdCommonTrackingUrlsImpression'

CREATE TABLE IF NOT EXISTS `AdCommonTrackingUrlsImpression` (
  `adCommonTrackingUrls` long NOT NULL
  `impression` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdCommonTrackingUrlsClick` generated from model 'AdCommonTrackingUrlsClick'

CREATE TABLE IF NOT EXISTS `AdCommonTrackingUrlsClick` (
  `adCommonTrackingUrls` long NOT NULL
  `click` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdCommonTrackingUrlsEngagement` generated from model 'AdCommonTrackingUrlsEngagement'

CREATE TABLE IF NOT EXISTS `AdCommonTrackingUrlsEngagement` (
  `adCommonTrackingUrls` long NOT NULL
  `engagement` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdCommonTrackingUrlsBuyableButton` generated from model 'AdCommonTrackingUrlsBuyableButton'

CREATE TABLE IF NOT EXISTS `AdCommonTrackingUrlsBuyableButton` (
  `adCommonTrackingUrls` long NOT NULL
  `buyableButton` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdCommonTrackingUrlsAudienceVerification` generated from model 'AdCommonTrackingUrlsAudienceVerification'

CREATE TABLE IF NOT EXISTS `AdCommonTrackingUrlsAudienceVerification` (
  `adCommonTrackingUrls` long NOT NULL
  `audienceVerification` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdCreateRequest` generated from model 'adCreateRequest'
--

CREATE TABLE IF NOT EXISTS `AdCreateRequest` (
  `ad_group_id` text NOT NULL /*ID of the ad group that contains the ad.*/,
  `creative_type` long NOT NULL,
  `pin_id` text NOT NULL /*Pin ID.*/,
  `android_deep_link` text /*Deep link URL for Android devices. Not currently available. Using this field will generate an error.*/,
  `click_tracking_url` text /*Tracking url for the ad clicks.*/,
  `destination_url` text /*Destination URL.*/,
  `ios_deep_link` text /*Deep link URL for iOS devices. Not currently available. Using this field will generate an error.*/,
  `is_pin_deleted` boolean /*Is original pin deleted?*/,
  `is_removable` boolean /*Is pin repinnable?*/,
  `name` text /*Name of the ad - 255 chars max.*/,
  `status` long,
  `tracking_urls` long,
  `view_tracking_url` text /*Tracking URL for ad impressions.*/,
  `lead_form_id` text /*Lead form ID for lead ad generation.*/,
  `grid_click_type` long,
  `customizable_cta_type` text /*Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)*/,
  `quiz_pin_data` long
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
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.*/,
  `placement_group` long /*&lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.*/,
  `targeting_spec` long,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupAudienceSizingRequestCreativeTypes` generated from model 'AdGroupAudienceSizingRequestCreativeTypes'

CREATE TABLE IF NOT EXISTS `AdGroupAudienceSizingRequestCreativeTypes` (
  `adGroupAudienceSizingRequest` long NOT NULL
  `creativeTypes` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupAudienceSizingRequestProductGroupIds` generated from model 'AdGroupAudienceSizingRequestProductGroupIds'

CREATE TABLE IF NOT EXISTS `AdGroupAudienceSizingRequestProductGroupIds` (
  `adGroupAudienceSizingRequest` long NOT NULL
  `productGroupIds` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupAudienceSizingRequestAdGroupAudienceSizingRequestKeywordsInner` generated from model 'AdGroupAudienceSizingRequestAdGroupAudienceSizingRequestKeywordsInner'

CREATE TABLE IF NOT EXISTS `AdGroupAudienceSizingRequestAdGroupAudienceSizingRequestKeywordsInner` (
  `adGroupAudienceSizingRequest` long NOT NULL
  `adGroupAudienceSizingRequestKeywordsInner` long NOT NULL
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
  `name` text /*Ad group name.*/,
  `status` long /*Ad group/entity status.*/,
  `budget_in_micro_currency` int /*Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.*/,
  `bid_in_micro_currency` int /*Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.*/,
  `optimization_goal_metadata` long,
  `budget_type` long,
  `start_time` int /*Ad group start time. Unix timestamp in seconds. Defaults to current time.*/,
  `end_time` int /*Ad group end time. Unix timestamp in seconds.*/,
  `targeting_spec` long,
  `lifetime_frequency_cap` int /*Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.*/,
  `tracking_urls` long,
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.*/,
  `placement_group` long /*&lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.*/,
  `pacing_delivery_type` long,
  `campaign_id` text /*Campaign ID of the ad group.*/,
  `billable_event` long,
  `bid_strategy_type` text /*Bid strategy type*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupCommon_optimization_goal_metadata` generated from model 'adGroupCommonOptimizationGoalMetadata'
-- Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.
--

CREATE TABLE IF NOT EXISTS `AdGroupCommon_optimization_goal_metadata` (
  `conversion_tag_v3_goal_metadata` long,
  `frequency_goal_metadata` long,
  `scrollup_goal_metadata` long
);  /*Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;.*/


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupCommon_tracking_urls` generated from model 'adGroupCommonTrackingUrls'
-- Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
--

CREATE TABLE IF NOT EXISTS `AdGroupCommon_tracking_urls` (
);  /*Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.*/

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupCommonTrackingUrlsImpression` generated from model 'AdGroupCommonTrackingUrlsImpression'

CREATE TABLE IF NOT EXISTS `AdGroupCommonTrackingUrlsImpression` (
  `adGroupCommonTrackingUrls` long NOT NULL
  `impression` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupCommonTrackingUrlsClick` generated from model 'AdGroupCommonTrackingUrlsClick'

CREATE TABLE IF NOT EXISTS `AdGroupCommonTrackingUrlsClick` (
  `adGroupCommonTrackingUrls` long NOT NULL
  `click` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupCommonTrackingUrlsEngagement` generated from model 'AdGroupCommonTrackingUrlsEngagement'

CREATE TABLE IF NOT EXISTS `AdGroupCommonTrackingUrlsEngagement` (
  `adGroupCommonTrackingUrls` long NOT NULL
  `engagement` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupCommonTrackingUrlsBuyableButton` generated from model 'AdGroupCommonTrackingUrlsBuyableButton'

CREATE TABLE IF NOT EXISTS `AdGroupCommonTrackingUrlsBuyableButton` (
  `adGroupCommonTrackingUrls` long NOT NULL
  `buyableButton` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupCommonTrackingUrlsAudienceVerification` generated from model 'AdGroupCommonTrackingUrlsAudienceVerification'

CREATE TABLE IF NOT EXISTS `AdGroupCommonTrackingUrlsAudienceVerification` (
  `adGroupCommonTrackingUrls` long NOT NULL
  `audienceVerification` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupCreateRequest` generated from model 'adGroupCreateRequest'
--

CREATE TABLE IF NOT EXISTS `AdGroupCreateRequest` (
  `name` text NOT NULL /*Ad group name.*/,
  `campaign_id` text NOT NULL /*Campaign ID of the ad group.*/,
  `billable_event` long NOT NULL,
  `status` long /*Ad group/entity status.*/,
  `budget_in_micro_currency` int /*Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.*/,
  `bid_in_micro_currency` int /*Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.*/,
  `optimization_goal_metadata` long,
  `budget_type` long,
  `start_time` int /*Ad group start time. Unix timestamp in seconds. Defaults to current time.*/,
  `end_time` int /*Ad group end time. Unix timestamp in seconds.*/,
  `targeting_spec` long,
  `lifetime_frequency_cap` int /*Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.*/,
  `tracking_urls` long,
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group.Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.*/,
  `placement_group` long /*&lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.*/,
  `pacing_delivery_type` long,
  `bid_strategy_type` text /*Bid strategy type*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupResponse` generated from model 'adGroupResponse'
--

CREATE TABLE IF NOT EXISTS `AdGroupResponse` (
  `name` text /*Ad group name.*/,
  `status` long /*Ad group/entity status.*/,
  `budget_in_micro_currency` int /*Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.*/,
  `bid_in_micro_currency` int /*Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.*/,
  `optimization_goal_metadata` long,
  `budget_type` long,
  `start_time` int /*Ad group start time. Unix timestamp in seconds. Defaults to current time.*/,
  `end_time` int /*Ad group end time. Unix timestamp in seconds.*/,
  `targeting_spec` long,
  `lifetime_frequency_cap` int /*Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.*/,
  `tracking_urls` long,
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.*/,
  `placement_group` long /*&lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.*/,
  `pacing_delivery_type` long,
  `campaign_id` text /*Campaign ID of the ad group.*/,
  `billable_event` long,
  `bid_strategy_type` text /*Bid strategy type*/,
  `id` text PRIMARY KEY /*Ad group ID.*/,
  `ad_account_id` text /*Advertiser ID.*/,
  `created_time` int /*Ad group creation time. Unix timestamp in seconds.*/,
  `updated_time` int /*Ad group last update time. Unix timestamp in seconds.*/,
  `type` text /*Always \&quot;adgroup\&quot;.*/,
  `conversion_learning_mode_type` text /*oCPM learn mode*/,
  `summary_status` long /*Ad group summary status.*/,
  `feed_profile_id` text /*Feed Profile ID associated to the adgroup.*/,
  `dca_assets` blob /*[DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupUpdateRequest` generated from model 'adGroupUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `AdGroupUpdateRequest` (
  `id` text NOT NULL PRIMARY KEY /*Ad group ID.*/,
  `name` text /*Ad group name.*/,
  `status` long /*Ad group/entity status.*/,
  `budget_in_micro_currency` int /*Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.*/,
  `bid_in_micro_currency` int /*Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.*/,
  `optimization_goal_metadata` long,
  `budget_type` long,
  `start_time` int /*Ad group start time. Unix timestamp in seconds. Defaults to current time.*/,
  `end_time` int /*Ad group end time. Unix timestamp in seconds.*/,
  `targeting_spec` long,
  `lifetime_frequency_cap` int /*Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.*/,
  `tracking_urls` long,
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.*/,
  `placement_group` long /*&lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;.*/,
  `pacing_delivery_type` long,
  `campaign_id` text /*Campaign ID of the ad group.*/,
  `billable_event` long,
  `bid_strategy_type` text /*Bid strategy type*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupsAnalyticsResponse_inner` generated from model 'adGroupsAnalyticsResponseInner'
--

CREATE TABLE IF NOT EXISTS `AdGroupsAnalyticsResponse_inner` (
  `AD_GROUP_ID` text NOT NULL /*The ID of the ad group that this metrics belongs to.*/,
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
  `pin_id` text NOT NULL /*Pin ID.*/
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
  `android_deep_link` text /*Deep link URL for Android devices. Not currently available. Using this field will generate an error.*/,
  `click_tracking_url` text /*Tracking url for the ad clicks.*/,
  `creative_type` long,
  `destination_url` text /*Destination URL.*/,
  `ios_deep_link` text /*Deep link URL for iOS devices. Not currently available. Using this field will generate an error.*/,
  `is_pin_deleted` boolean /*Is original pin deleted?*/,
  `is_removable` boolean /*Is pin repinnable?*/,
  `name` text /*Name of the ad - 255 chars max.*/,
  `status` long,
  `tracking_urls` long,
  `view_tracking_url` text /*Tracking URL for ad impressions.*/,
  `lead_form_id` text /*Lead form ID for lead ad generation.*/,
  `grid_click_type` long,
  `customizable_cta_type` text /*Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)*/,
  `quiz_pin_data` long,
  `pin_id` text /*Pin ID.*/,
  `ad_account_id` text /*The ID of the advertiser that this ad belongs to.*/,
  `campaign_id` text /*ID of the ad campaign that contains this ad.*/,
  `collection_items_destination_url_template` text /*Destination URL template for all items within a collections drawer.*/,
  `created_time` int /*Pin creation time. Unix timestamp in seconds.*/,
  `id` text PRIMARY KEY /*The ID of this ad.*/,
  `review_status` text /*Ad review status*/,
  `type` text /*Always \&quot;ad\&quot;.*/,
  `updated_time` int /*Last update time. Unix timestamp in seconds.*/,
  `summary_status` long /*Ad summary status*/
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
  `android_deep_link` text /*Deep link URL for Android devices. Not currently available. Using this field will generate an error.*/,
  `click_tracking_url` text /*Tracking url for the ad clicks.*/,
  `creative_type` long,
  `destination_url` text /*Destination URL.*/,
  `ios_deep_link` text /*Deep link URL for iOS devices. Not currently available. Using this field will generate an error.*/,
  `is_pin_deleted` boolean /*Is original pin deleted?*/,
  `is_removable` boolean /*Is pin repinnable?*/,
  `name` text /*Name of the ad - 255 chars max.*/,
  `status` long,
  `tracking_urls` long,
  `view_tracking_url` text /*Tracking URL for ad impressions.*/,
  `lead_form_id` text /*Lead form ID for lead ad generation.*/,
  `grid_click_type` long,
  `customizable_cta_type` text /*Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)*/,
  `quiz_pin_data` long,
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
  `start_date` text NOT NULL /*Metric report start date (UTC). Format: YYYY-MM-DD*/,
  `end_date` text NOT NULL /*Metric report end date (UTC). Format: YYYY-MM-DD*/,
  `granularity` long NOT NULL /*TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly*/,
  `level` long NOT NULL /*Level of the report*/,
  `click_window_days` long /*Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.*/,
  `engagement_window_days` long /*Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.*/,
  `view_window_days` long /*Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.*/,
  `conversion_report_time` long /*The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.*/,
  `report_format` long /*Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0.*/
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
-- Table structure for table `AdsAnalyticsCreateAsyncRequestAdsAnalyticsTargetingType` generated from model 'AdsAnalyticsCreateAsyncRequestAdsAnalyticsTargetingType'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestAdsAnalyticsTargetingType` (
  `adsAnalyticsCreateAsyncRequest` long NOT NULL
  `adsAnalyticsTargetingType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequestAdsAnalyticsMetricsFilter` generated from model 'AdsAnalyticsCreateAsyncRequestAdsAnalyticsMetricsFilter'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestAdsAnalyticsMetricsFilter` (
  `adsAnalyticsCreateAsyncRequest` long NOT NULL
  `adsAnalyticsMetricsFilter` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncResponse` generated from model 'adsAnalyticsCreateAsyncResponse'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncResponse` (
  `report_status` long,
  `token` text,
  `message` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsGetAsyncResponse` generated from model 'adsAnalyticsGetAsyncResponse'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsGetAsyncResponse` (
  `report_status` long,
  `url` text,
  `size` decimal
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
  `discountType` text /*The type of discount of this credit*/,
  `discountInMicroCurrency` decimal /*The discount applied in the offer’s currency value.*/,
  `discountCurrency` text /*Currency value for the discount.*/,
  `title` text /*Human readable title of the offer code.*/,
  `remainingDiscountInMicroCurrency` decimal /*The credits left to spend.*/
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
  `success` boolean /*Returns true if the offer code was successfully applied(validateOnly&#x3D;false) or can be applied(validateOnly&#x3D;true).*/,
  `errorCode` int /*Error code type if error occurs*/,
  `errorMessage` text /*Reason for failure*/
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
  `summary_metrics` blob /*The metric name and value over the requested period for each requested metric*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AnalyticsMetricsResponseAnalyticsDailyMetrics` generated from model 'AnalyticsMetricsResponseAnalyticsDailyMetrics'

CREATE TABLE IF NOT EXISTS `AnalyticsMetricsResponseAnalyticsDailyMetrics` (
  `analyticsMetricsResponse` long NOT NULL
  `analyticsDailyMetrics` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `Audience` generated from model 'audience'
--

CREATE TABLE IF NOT EXISTS `Audience` (
  `ad_account_id` text /*Ad account ID.*/,
  `id` text PRIMARY KEY /*Audience ID.*/,
  `name` text /*Audience name.*/,
  `audience_type` text /*&lt;a href&#x3D;\&quot;/docs/reference/glossary/#Audience Types\&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR*/,
  `description` text /*Audience description.*/,
  `rule` long,
  `size` int /*Audience size.*/,
  `status` text /*Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.*/,
  `type` text /*Always \&quot;audience\&quot;.*/,
  `created_timestamp` int /*Creation time. Unix timestamp in seconds.*/,
  `updated_timestamp` int /*Last update time. Unix timestamp in seconds.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AudienceCategory` generated from model 'audienceCategory'
--

CREATE TABLE IF NOT EXISTS `AudienceCategory` (
  `key` text /*Interest unique key (same as ID).*/,
  `name` text /*Interest name.*/,
  `ratio` decimal /*Interest&#39;s percent of category&#39;s total audience.*/,
  `index` decimal /*Interest affinity index.*/,
  `id` text PRIMARY KEY /*Interest ID.*/,
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
-- Table structure for table `AudienceCreateCustomRequest` generated from model 'audienceCreateCustomRequest'
--

CREATE TABLE IF NOT EXISTS `AudienceCreateCustomRequest` (
  `name` text NOT NULL /*Audience name.*/,
  `rule` long NOT NULL,
  `sharing_type` long NOT NULL,
  `data_party` long NOT NULL,
  `ad_account_id` text /*Ad account ID.*/,
  `category` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AudienceCreateRequest` generated from model 'audienceCreateRequest'
--

CREATE TABLE IF NOT EXISTS `AudienceCreateRequest` (
  `name` text NOT NULL /*Audience name.*/,
  `rule` long NOT NULL,
  `audience_type` long NOT NULL,
  `ad_account_id` text /*Ad account ID.*/,
  `description` text /*Audience description.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AudienceDefinition` generated from model 'audienceDefinition'
-- Queryable audience representation.
--

CREATE TABLE IF NOT EXISTS `AudienceDefinition` (
  `date` text /*Generation date*/,
  `type` text /*Generated audience type to request.*/,
  `scope` text /*Generated audience scope to request.*/
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
  `key` text,
  `name` text,
  `ratio` decimal,
  `index` decimal,
  `id` text PRIMARY KEY
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AudienceInsightsResponse` generated from model 'audienceInsightsResponse'
-- Audience interests and demographics.
--

CREATE TABLE IF NOT EXISTS `AudienceInsightsResponse` (
  `demographics` long,
  `type` long,
  `date` text /*Generation date*/,
  `size` int /*Population count.*/,
  `size_is_upper_bound` boolean /*Indicates whether the audience size has been rounded up to the next highest upper boundary.*/
);  /*Audience interests and demographics.*/

-- --------------------------------------------------------------------------
-- Table structure for table `AudienceInsightsResponseAudienceCategory` generated from model 'AudienceInsightsResponseAudienceCategory'

CREATE TABLE IF NOT EXISTS `AudienceInsightsResponseAudienceCategory` (
  `audienceInsightsResponse` long NOT NULL
  `audienceCategory` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AudienceRule` generated from model 'audienceRule'
-- JSON object defining targeted audience users. Example rule formats per audience type:&lt;br&gt;CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}&lt;br&gt;ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; }&lt;br&gt;(Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10.&lt;br&gt;The targeted audience should be this % size across Pinterest.)&lt;br&gt;VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}}&lt;br&gt;(Retention days should be 1-540. Retention applies to specific customers.)&lt;br&gt;ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.entomi.com\&quot;], \&quot;engager_type\&quot;: 1}&lt;br&gt;For more details on engagement audiences, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/adtech_ads_v4/#section/November-2021\&quot; target&#x3D;\&quot;_blank\&quot;&gt;November 2021 changelog&lt;/a&gt;.
--

CREATE TABLE IF NOT EXISTS `AudienceRule` (
  `country` text /*Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;.*/,
  `customer_list_id` text /*Customer list ID. For CUSTOMER_LIST &#x60;audience_type&#x60;.*/,
  `engagement_type` text /*Engagement type enum. Optional for ENGAGEMENT &#x60;audience_type&#x60;. Supported values are &#x60;click&#x60;, &#x60;save&#x60;, &#x60;closeup&#x60;, &#x60;comment&#x60; and &#x60;like&#x60;. All engagements are included if this field is not set. */,
  `event` text /*A Pinterest tag event. Optional for VISITOR &#x60;audience_type&#x60;. Possible values are &#x60;pagevisit&#x60;, &#x60;signup&#x60;, &#x60;checkout&#x60;, &#x60;viewcategory&#x60;, &#x60;search&#x60;, &#x60;addtocart&#x60;, &#x60;watchvideo&#x60;, &#x60;lead&#x60;, and &#x60;custom&#x60;. This field also accepts a partner-defined Pinterest tag event.*/,
  `event_data` long,
  `percentage` int /*Percentage should be 1-10. The targeted audience should be this % size across Pinterest.*/,
  `prefill` boolean /*Optional for VISITOR &#x60;audience_type&#x60;. If &#x60;true&#x60;, the specified rule on existing engagement data is applied to pre-populate the audience. If &#x60;false&#x60;, the audience is empty at creation time. The default is &#x60;true&#x60;.*/,
  `retention_days` int /*Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR &#x60;audience_type&#x60;. Accepted range is 1-540. Defaults to 180 if not specified.*/,
  `visitor_source_id` text /*The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR &#x60;audience_type&#x60;.*/,
  `event_source` blob /*Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: web, mobile, offline*/,
  `ingestion_source` blob /*Optional for VISITOR. You can use it as a {&#39;&#x3D;&#39;: [value]}. Supported values are: tag, mmp, file_upload, conversions_api*/,
  `engager_type` int /*Optional for ENGAGEMENT. Engager type value should be 1-2.*/,
  `ad_account_id` text /*Ad account ID.*/
);  /*JSON object defining targeted audience users. Example rule formats per audience type:&lt;br&gt;CUSTOMER_LIST: { \&quot;customer_list_id\&quot;: \&quot;&amp;lt;customer list ID&amp;gt;\&quot;}&lt;br&gt;ACTALIKE: { \&quot;seed_id\&quot;: [\&quot;&amp;lt;audience ID&amp;gt;\&quot;], \&quot;country\&quot;: \&quot;US\&quot;, \&quot;percentage\&quot;: \&quot;10\&quot; }&lt;br&gt;(Valid countries include: \&quot;US\&quot;, \&quot;CA\&quot;, and \&quot;GB\&quot;. Percentage should be 1-10.&lt;br&gt;The targeted audience should be this % size across Pinterest.)&lt;br&gt;VISITOR: { \&quot;visitor_source_id\&quot;: [\&quot;&amp;lt;conversion tag ID&amp;gt;\&quot;], \&quot;retention_days\&quot;: \&quot;180\&quot;, \&quot;event_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;web\&quot;, \&quot;mobile\&quot;]}, \&quot;ingestion_source\&quot;: {\&quot;&#x3D;\&quot;: [\&quot;tag\&quot;]}}&lt;br&gt;(Retention days should be 1-540. Retention applies to specific customers.)&lt;br&gt;ENGAGEMENT: {\&quot;engagement_domain\&quot;: [\&quot;www.entomi.com\&quot;], \&quot;engager_type\&quot;: 1}&lt;br&gt;For more details on engagement audiences, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/adtech_ads_v4/#section/November-2021\&quot; target&#x3D;\&quot;_blank\&quot;&gt;November 2021 changelog&lt;/a&gt;.*/

-- --------------------------------------------------------------------------
-- Table structure for table `AudienceRuleEngagementDomain` generated from model 'AudienceRuleEngagementDomain'

CREATE TABLE IF NOT EXISTS `AudienceRuleEngagementDomain` (
  `audienceRule` long NOT NULL
  `engagementDomain` text NOT NULL
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
-- Table structure for table `AudienceRuleCampaignId` generated from model 'AudienceRuleCampaignId'

CREATE TABLE IF NOT EXISTS `AudienceRuleCampaignId` (
  `audienceRule` long NOT NULL
  `campaignId` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AudienceRuleAdId` generated from model 'AudienceRuleAdId'

CREATE TABLE IF NOT EXISTS `AudienceRuleAdId` (
  `audienceRule` long NOT NULL
  `adId` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AudienceRuleObjectiveType` generated from model 'AudienceRuleObjectiveType'

CREATE TABLE IF NOT EXISTS `AudienceRuleObjectiveType` (
  `audienceRule` long NOT NULL
  `objectiveType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AudienceSubcategory` generated from model 'audienceSubcategory'
--

CREATE TABLE IF NOT EXISTS `AudienceSubcategory` (
  `key` text /*Interest unique key (same as ID).*/,
  `name` text /*Subinterest name.*/,
  `ratio` decimal /*Subinterest&#39;s percent of category&#39;s total audience.*/,
  `index` decimal /*Subinterest affinity index.*/,
  `id` text PRIMARY KEY /*Subinterest ID.*/
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
-- Table structure for table `AvailabilityFilter` generated from model 'availabilityFilter'
--

CREATE TABLE IF NOT EXISTS `AvailabilityFilter` (
  `AVAILABILITY` long NOT NULL
); 


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
  `currency` long NOT NULL,
  `billable_event` long NOT NULL,
  `objective_type` long,
  `optimization_goal_metadata` long,
  `creative_type` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BidFloorSpecCountry` generated from model 'BidFloorSpecCountry'

CREATE TABLE IF NOT EXISTS `BidFloorSpecCountry` (
  `bidFloorSpec` long NOT NULL
  `country` long NOT NULL
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
  `id` text PRIMARY KEY /*Billing ID.*/,
  `card_type` text /*Type of the card.*/,
  `status` text /*Status of the billing.*/,
  `advertiser_id` text /*Advertiser ID of the billing.*/,
  `payment_method_brand` text /*Brand of the payment method.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Board` generated from model 'board'
-- Board
--

CREATE TABLE IF NOT EXISTS `Board` (
  `name` text NOT NULL,
  `id` text PRIMARY KEY,
  `created_at` datetime /*Date and time of board creation.*/,
  `board_pins_modified_at` datetime /*Date and time of last board pins modified.*/,
  `description` text,
  `collaborator_count` int UNSIGNED /*Count of collaborators on the board.*/,
  `pin_count` int UNSIGNED /*Count of pins on the board.*/,
  `follower_count` int UNSIGNED /*Board follower count.*/,
  `media` long,
  `owner` long,
  `privacy` text /*Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt;*/
);  /*Board*/


-- --------------------------------------------------------------------------
-- Table structure for table `Board_media` generated from model 'boardMedia'
-- Board media.
--

CREATE TABLE IF NOT EXISTS `Board_media` (
  `image_cover_url` text /*Board cover image.*/,
);  /*Board media.*/

-- --------------------------------------------------------------------------
-- Table structure for table `BoardMediaPinThumbnailUrls` generated from model 'BoardMediaPinThumbnailUrls'

CREATE TABLE IF NOT EXISTS `BoardMediaPinThumbnailUrls` (
  `boardMedia` long NOT NULL
  `pinThumbnailUrls` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `Board_owner` generated from model 'boardOwner'
--

CREATE TABLE IF NOT EXISTS `Board_owner` (
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
-- Table structure for table `BoardUpdate` generated from model 'boardUpdate'
-- Board fields for updates
--

CREATE TABLE IF NOT EXISTS `BoardUpdate` (
  `name` text,
  `description` text,
  `privacy` text
);  /*Board fields for updates*/


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
  `updated_since` text /*Unix UTC timestamp to retrieve all entities that have changed since this time.*/,
  `campaign_filter` long,
  `output_format` long
);  /*Ad entities to get in bulk request.*/

-- --------------------------------------------------------------------------
-- Table structure for table `BulkDownloadRequestBulkEntityType` generated from model 'BulkDownloadRequestBulkEntityType'

CREATE TABLE IF NOT EXISTS `BulkDownloadRequestBulkEntityType` (
  `bulkDownloadRequest` long NOT NULL
  `bulkEntityType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkDownloadRequestEntityIds` generated from model 'BulkDownloadRequestEntityIds'

CREATE TABLE IF NOT EXISTS `BulkDownloadRequestEntityIds` (
  `bulkDownloadRequest` long NOT NULL
  `entityIds` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BulkDownloadRequest_campaign_filter` generated from model 'bulkDownloadRequestCampaignFilter'
--

CREATE TABLE IF NOT EXISTS `BulkDownloadRequest_campaign_filter` (
  `start_time` text /*Unix UTC timestamp.*/,
  `end_time` text /*Unix UTC timestamp.*/,
  `name` text /*Campaign name*/,
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
-- Table structure for table `BulkUpsertRequestCreateCampaignCreateRequest` generated from model 'BulkUpsertRequestCreateCampaignCreateRequest'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestCreateCampaignCreateRequest` (
  `bulkUpsertRequestCreate` long NOT NULL
  `campaignCreateRequest` long NOT NULL
);

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
-- Table structure for table `BulkUpsertRequestCreateProductGroupPromotionCreateRequest` generated from model 'BulkUpsertRequestCreateProductGroupPromotionCreateRequest'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestCreateProductGroupPromotionCreateRequest` (
  `bulkUpsertRequestCreate` long NOT NULL
  `productGroupPromotionCreateRequest` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestCreateKeywordsRequest` generated from model 'BulkUpsertRequestCreateKeywordsRequest'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestCreateKeywordsRequest` (
  `bulkUpsertRequestCreate` long NOT NULL
  `keywordsRequest` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestUpdate` generated from model 'bulkUpsertRequestUpdate'
-- Request for creation of entities in bulk.
--

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestUpdate` (
);  /*Request for creation of entities in bulk.*/

-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestUpdateCampaignUpdateRequest` generated from model 'BulkUpsertRequestUpdateCampaignUpdateRequest'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestUpdateCampaignUpdateRequest` (
  `bulkUpsertRequestUpdate` long NOT NULL
  `campaignUpdateRequest` long NOT NULL
);

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
-- Table structure for table `BulkUpsertRequestUpdateProductGroupPromotionUpdateRequest` generated from model 'BulkUpsertRequestUpdateProductGroupPromotionUpdateRequest'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestUpdateProductGroupPromotionUpdateRequest` (
  `bulkUpsertRequestUpdate` long NOT NULL
  `productGroupPromotionUpdateRequest` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BulkUpsertRequestUpdateKeywordUpdate` generated from model 'BulkUpsertRequestUpdateKeywordUpdate'

CREATE TABLE IF NOT EXISTS `BulkUpsertRequestUpdateKeywordUpdate` (
  `bulkUpsertRequestUpdate` long NOT NULL
  `keywordUpdate` long NOT NULL
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
  `status` long,
  `result_url` text
);  /*ID of the bulk request.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignCommon` generated from model 'campaignCommon'
-- Campaign Data
--

CREATE TABLE IF NOT EXISTS `CampaignCommon` (
  `ad_account_id` text /*Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.*/,
  `name` text /*Campaign name.*/,
  `status` long,
  `lifetime_spend_cap` int /*Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.*/,
  `daily_spend_cap` int /*Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.*/,
  `order_line_id` text /*Order line ID that appears on the invoice.*/,
  `tracking_urls` long,
  `start_time` int /*Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.*/,
  `end_time` int /*Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.*/,
  `summary_status` long
);  /*Campaign Data*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignCreateCommon` generated from model 'campaignCreateCommon'
--

CREATE TABLE IF NOT EXISTS `CampaignCreateCommon` (
  `ad_account_id` text /*Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.*/,
  `name` text /*Campaign name.*/,
  `status` long,
  `lifetime_spend_cap` int /*Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.*/,
  `daily_spend_cap` int /*Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.*/,
  `order_line_id` text /*Order line ID that appears on the invoice.*/,
  `tracking_urls` long,
  `start_time` int /*Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.*/,
  `end_time` int /*Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.*/,
  `summary_status` long,
  `is_flexible_daily_budgets` boolean /*Determine if a campaign has flexible daily budgets setup.*/,
  `default_ad_group_budget_in_micro_currency` int /*When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.*/,
  `is_automated_campaign` boolean /*Specifies whether the campaign was created in the automated campaign flow*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignCreateRequest` generated from model 'campaignCreateRequest'
--

CREATE TABLE IF NOT EXISTS `CampaignCreateRequest` (
  `ad_account_id` text NOT NULL /*Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.*/,
  `name` text NOT NULL /*Campaign name.*/,
  `objective_type` long NOT NULL,
  `status` long,
  `lifetime_spend_cap` int /*Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.*/,
  `daily_spend_cap` int /*Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.*/,
  `order_line_id` text /*Order line ID that appears on the invoice.*/,
  `tracking_urls` long,
  `start_time` int /*Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.*/,
  `end_time` int /*Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.*/,
  `summary_status` long,
  `is_flexible_daily_budgets` boolean /*Determine if a campaign has flexible daily budgets setup.*/,
  `default_ad_group_budget_in_micro_currency` int /*When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.*/,
  `is_automated_campaign` boolean /*Specifies whether the campaign was created in the automated campaign flow*/
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
  `name` text /*Campaign name.*/,
  `status` long,
  `lifetime_spend_cap` int /*Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.*/,
  `daily_spend_cap` int /*Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.*/,
  `order_line_id` text /*Order line ID that appears on the invoice.*/,
  `tracking_urls` long,
  `start_time` int /*Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.*/,
  `end_time` int /*Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.*/,
  `summary_status` long,
  `is_flexible_daily_budgets` boolean /*Determines if a campaign has flexible daily budgets setup.*/,
  `default_ad_group_budget_in_micro_currency` int /*When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.*/,
  `is_automated_campaign` boolean /*Specifies whether the campaign was created in the automated campaign flow*/,
  `id` text PRIMARY KEY /*Campaign ID.*/,
  `objective_type` long,
  `created_time` int /*Campaign creation time. Unix timestamp in seconds.*/,
  `updated_time` int /*UTC timestamp. Last update time.*/,
  `type` text /*Always \&quot;campaign\&quot;.*/,
  `is_campaign_budget_optimization` boolean /*Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.*/
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
-- Table structure for table `CampaignResponse` generated from model 'campaignResponse'
--

CREATE TABLE IF NOT EXISTS `CampaignResponse` (
  `id` text PRIMARY KEY /*Campaign ID.*/,
  `ad_account_id` text /*Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.*/,
  `name` text /*Campaign name.*/,
  `status` long,
  `lifetime_spend_cap` int /*Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.*/,
  `daily_spend_cap` int /*Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.*/,
  `order_line_id` text /*Order line ID that appears on the invoice.*/,
  `tracking_urls` long,
  `start_time` int /*Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.*/,
  `end_time` int /*Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.*/,
  `summary_status` long,
  `objective_type` long,
  `created_time` int /*Campaign creation time. Unix timestamp in seconds.*/,
  `updated_time` int /*UTC timestamp. Last update time.*/,
  `type` text /*Always \&quot;campaign\&quot;.*/,
  `is_flexible_daily_budgets` boolean /*Determines if a campaign has flexible daily budgets setup.*/,
  `is_campaign_budget_optimization` boolean /*Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignUpdateRequest` generated from model 'campaignUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `CampaignUpdateRequest` (
  `id` text NOT NULL PRIMARY KEY /*Campaign ID.*/,
  `ad_account_id` text NOT NULL /*Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.*/,
  `name` text /*Campaign name.*/,
  `status` long,
  `lifetime_spend_cap` int /*Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.*/,
  `daily_spend_cap` int /*Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.*/,
  `order_line_id` text /*Order line ID that appears on the invoice.*/,
  `tracking_urls` long,
  `start_time` int /*Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.*/,
  `end_time` int /*Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.*/,
  `summary_status` long,
  `is_flexible_daily_budgets` boolean /*Determine if a campaign has flexible daily budgets setup.*/,
  `default_ad_group_budget_in_micro_currency` int /*When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.*/,
  `is_automated_campaign` boolean /*Specifies whether the campaign was created in the automated campaign flow*/,
  `is_campaign_budget_optimization` boolean /*Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.*/,
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
  `CAMPAIGN_ID` text NOT NULL /*The ID of the campaing that this metrics belongs to.*/,
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
-- Table structure for table `Catalog` generated from model 'catalog'
-- Catalog entity
--

CREATE TABLE IF NOT EXISTS `Catalog` (
  `id` text NOT NULL PRIMARY KEY /*ID of the catalog entity.*/,
  `name` text NOT NULL /*A human-friendly name associated to a catalog entity.*/,
  `catalog_type` long NOT NULL,
  `created_at` datetime,
  `updated_at` datetime
);  /*Catalog entity*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogProductGroup` generated from model 'catalogProductGroup'
-- non-promoted catalog product group entity
--

CREATE TABLE IF NOT EXISTS `CatalogProductGroup` (
  `id` text PRIMARY KEY /*ID of the catalog product group.*/,
  `merchant_id` text /*Merchant ID pertaining to the owner of the catalog product group.*/,
  `name` text /*Name of catalog product group*/,
  `filters` blob /*Object holding a list of filters*/,
  `filter_v2` blob /*Object holding a list of filters*/,
  `type` long,
  `status` long,
  `feed_profile_id` text /*id of the feed profile belonging to this catalog product group*/,
  `created_at` int /*Unix timestamp in seconds of when catalog product group was created.*/,
  `last_update` int /*Unix timestamp in seconds of last time catalog product group was updated.*/,
  `product_count` int /*Amount of products in the catalog product group*/,
  `featured_position` int /*index of the featured position of the catalog product group*/
);  /*non-promoted catalog product group entity*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreateHotelItem` generated from model 'catalogsCreateHotelItem'
-- A hotel item to be created.
--

CREATE TABLE IF NOT EXISTS `CatalogsCreateHotelItem` (
  `hotel_id` text NOT NULL /*The catalog hotel id in the merchant namespace*/,
  `operation` text NOT NULL,
  `attributes` long NOT NULL
);  /*A hotel item to be created.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsCreateRetailItem` generated from model 'catalogsCreateRetailItem'
-- An item to be created
--

CREATE TABLE IF NOT EXISTS `CatalogsCreateRetailItem` (
  `item_id` text NOT NULL /*The catalog item id in the merchant namespace*/,
  `operation` text NOT NULL,
  `attributes` long NOT NULL
);  /*An item to be created*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsDbItem` generated from model 'catalogsDbItem'
--

CREATE TABLE IF NOT EXISTS `CatalogsDbItem` (
  `created_at` datetime,
  `id` text PRIMARY KEY,
  `updated_at` datetime
); 


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
  `operation` text NOT NULL
);  /*An item to be deleted*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeed` generated from model 'catalogsFeed'
-- Catalogs Feed object
--

CREATE TABLE IF NOT EXISTS `CatalogsFeed` (
  `name` text NOT NULL /*A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.*/,
  `format` long NOT NULL,
  `catalog_type` long NOT NULL,
  `credentials` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `preferred_processing_schedule` long NOT NULL,
  `status` long NOT NULL,
  `default_currency` long NOT NULL,
  `default_locale` text NOT NULL /*The locale used within a feed for product descriptions.*/,
  `default_country` long NOT NULL,
  `default_availability` long NOT NULL,
  `catalog_id` text NOT NULL /*Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.*/,
  `created_at` datetime,
  `id` text PRIMARY KEY,
  `updated_at` datetime
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
  `LINE_LEVEL_INTERNAL_ERROR` int /*We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.*/,
  `LARGE_PRODUCT_COUNT_DECREASE` int /*The product count has decreased by more than 99% compared to the last successful ingestion.*/,
  `ACCOUNT_FLAGGED` int /*We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.*/,
  `IMAGE_LEVEL_INTERNAL_ERROR` int /*We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.*/,
  `IMAGE_FILE_NOT_ACCESSIBLE` int /*Image files are unreadable. Please upload new files to continue.*/,
  `IMAGE_MALFORMED_URL` int /*Image files are unreadable. Please check your link and upload new files to continue.*/,
  `IMAGE_FILE_NOT_FOUND` int /*Image files are unreadable. Please upload new files to continue.*/,
  `IMAGE_INVALID_FILE` int /*Image files are unreadable. Please upload new files to continue.*/
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
  `ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR` int /*We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.*/,
  `ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE` int /*Additional image files are unreadable. Please upload new files to continue.*/,
  `ADDITIONAL_IMAGE_MALFORMED_URL` int /*Additional image files are unreadable. Please check your link and upload new files to continue.*/,
  `ADDITIONAL_IMAGE_FILE_NOT_FOUND` int /*Additional image files are unreadable. Please upload new files to continue.*/,
  `ADDITIONAL_IMAGE_INVALID_FILE` int /*Additional image files are unreadable. Please upload new files to continue.*/,
  `HOTEL_PRICE_HEADER_IS_PRESENT` int /*price is not a supported column. Use base_price and sale_price instead.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedProcessingResult` generated from model 'catalogsFeedProcessingResult'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedProcessingResult` (
  `ingestion_details` long NOT NULL,
  `status` long NOT NULL,
  `product_counts` long NOT NULL,
  `validation_details` long NOT NULL,
  `created_at` datetime,
  `id` text PRIMARY KEY,
  `updated_at` datetime
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
  `original` int /*The number of products in the feed file.*/,
  `ingested` int /*The number of products successfully ingested from the feed file.*/
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
  `FETCH_ERROR` int /*Pinterest couldn&#39;t download your feed.*/,
  `FETCH_INACTIVE_FEED_ERROR` int /*Your feed wasn&#39;t ingested because it hasn’t changed in the previous 90 days.*/,
  `ENCODING_ERROR` int /*Your feed includes data with an unsupported encoding format.*/,
  `DELIMITER_ERROR` int /*Your feed includes data with formatting errors.*/,
  `REQUIRED_COLUMNS_MISSING` int /*Your feed is missing some required column headers.*/,
  `DUPLICATE_PRODUCTS` int /*Some products are duplicated.*/,
  `IMAGE_LINK_INVALID` int /*Some image links are formatted incorrectly.*/,
  `ITEMID_MISSING` int /*Some items are missing an item id in their product metadata, those items will not be published.*/,
  `TITLE_MISSING` int /*Some items are missing a title in their product metadata, those items will not be published.*/,
  `DESCRIPTION_MISSING` int /*Some items are missing a description in their product metadata, those items will not be published.*/,
  `PRODUCT_LINK_MISSING` int /*Some items are missing a link URL in their product metadata, those items will not be published.*/,
  `IMAGE_LINK_MISSING` int /*Some items are missing an image link URL in their product metadata, those items will not be published.*/,
  `AVAILABILITY_INVALID` int /*Some items are missing an availability value in their product metadata, those items will not be published.*/,
  `PRODUCT_PRICE_INVALID` int /*Some items have price formatting errors in their product metadata, those items will not be published.*/,
  `LINK_FORMAT_INVALID` int /*Some link values are formatted incorrectly.*/,
  `PARSE_LINE_ERROR` int /*Your feed contains formatting errors for some items.*/,
  `ADWORDS_FORMAT_INVALID` int /*Some adwords links contain too many characters.*/,
  `INTERNAL_SERVICE_ERROR` int /*We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.*/,
  `NO_VERIFIED_DOMAIN` int /*Your merchant domain needs to be claimed.*/,
  `ADULT_INVALID` int /*Some items have invalid adult values.*/,
  `IMAGE_LINK_LENGTH_TOO_LONG` int /*Some items have image_link URLs that contain too many characters, so those items will not be published.*/,
  `INVALID_DOMAIN` int /*Some of your product link values don&#39;t match the verified domain associated with this account.*/,
  `FEED_LENGTH_TOO_LONG` int /*Your feed contains too many items, some items will not be published.*/,
  `LINK_LENGTH_TOO_LONG` int /*Some product links contain too many characters, those items will not be published.*/,
  `MALFORMED_XML` int /*Your feed couldn&#39;t be validated because the xml file is formatted incorrectly.*/,
  `PRICE_MISSING` int /*Some products are missing a price, those items will not be published.*/,
  `FEED_TOO_SMALL` int /*Your feed couldn&#39;t be validated because the file doesn&#39;t contain the minimum number of lines required.*/,
  `MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED` int /*Some items exceed the maximum number of items per item group, those items will not be published.*/,
  `ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` int /*Some items&#39; main images can&#39;t be found.*/,
  `PINJOIN_CONTENT_UNSAFE` int /*Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines.*/,
  `BLOCKLISTED_IMAGE_SIGNATURE` int /*Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines.*/,
  `LIST_PRICE_INVALID` int /*Some items have list price formatting errors in their product metadata, those items will not be published.*/,
  `PRICE_CANNOT_BE_DETERMINED` int /*Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedValidationWarnings` generated from model 'catalogsFeedValidationWarnings'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedValidationWarnings` (
  `AD_LINK_FORMAT_WARNING` int /*Some items have ad links that are formatted incorrectly.*/,
  `AD_LINK_SAME_AS_LINK` int /*Some items have ad link URLs that are duplicates of the link URLs for those items.*/,
  `TITLE_LENGTH_TOO_LONG` int /*The title for some items were truncated because they contain too many characters.*/,
  `DESCRIPTION_LENGTH_TOO_LONG` int /*The description for some items were truncated because they contain too many characters.*/,
  `GENDER_INVALID` int /*Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.*/,
  `AGE_GROUP_INVALID` int /*Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.*/,
  `SIZE_TYPE_INVALID` int /*Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.*/,
  `SIZE_SYSTEM_INVALID` int /*Some items have size system values which are not one of the supported size systems.*/,
  `LINK_FORMAT_WARNING` int /*Some items have an invalid product link which contains invalid UTM tracking paramaters.*/,
  `SALES_PRICE_INVALID` int /*Some items have sale price values that are higher than the original price of the item.*/,
  `PRODUCT_CATEGORY_DEPTH_WARNING` int /*Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.*/,
  `ADWORDS_FORMAT_WARNING` int /*Some items have adwords_redirect links that are formatted incorrectly.*/,
  `ADWORDS_SAME_AS_LINK` int /*Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.*/,
  `DUPLICATE_HEADERS` int /*Your feed contains duplicate headers.*/,
  `FETCH_SAME_SIGNATURE` int /*Ingestion completed early because there are no changes to your feed since the last successful update.*/,
  `ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG` int /*Some items have additional_image_link URLs that contain too many characters, so those items will not be published.*/,
  `ADDITIONAL_IMAGE_LINK_WARNING` int /*Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.*/,
  `IMAGE_LINK_WARNING` int /*Some items have image_link URLs that are formatted incorrectly and will not be published with those items.*/,
  `SHIPPING_INVALID` int /*Some items have shipping values that are formatted incorrectly.*/,
  `TAX_INVALID` int /*Some items have tax values that are formatted incorrectly.*/,
  `SHIPPING_WEIGHT_INVALID` int /*Some items have invalid shipping_weight values.*/,
  `EXPIRATION_DATE_INVALID` int /*Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.*/,
  `AVAILABILITY_DATE_INVALID` int /*Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.*/,
  `SALE_DATE_INVALID` int /*Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.*/,
  `WEIGHT_UNIT_INVALID` int /*Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.*/,
  `IS_BUNDLE_INVALID` int /*Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.*/,
  `UPDATED_TIME_INVALID` int /*Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.*/,
  `CUSTOM_LABEL_LENGTH_TOO_LONG` int /*Some items have custom_label values that are too long, those items will be published without that custom label.*/,
  `PRODUCT_TYPE_LENGTH_TOO_LONG` int /*Some items have product_type values that are too long, those items will be published without that product type.*/,
  `TOO_MANY_ADDITIONAL_IMAGE_LINKS` int /*Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.*/,
  `MULTIPACK_INVALID` int /*Some items have invalid multipack values.*/,
  `INDEXED_PRODUCT_COUNT_LARGE_DELTA` int /*The product count has increased or decreased significantly compared to the last successful ingestion.*/,
  `ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE` int /*Some items include additional_image_links that can&#39;t be found.*/,
  `OPTIONAL_PRODUCT_CATEGORY_MISSING` int /*Some items are missing a google_product_category.*/,
  `OPTIONAL_PRODUCT_CATEGORY_INVALID` int /*Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.*/,
  `OPTIONAL_CONDITION_MISSING` int /*Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.*/,
  `OPTIONAL_CONDITION_INVALID` int /*Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.*/,
  `IOS_DEEP_LINK_INVALID` int /*Some items include invalid ios_deep_link values.*/,
  `ANDROID_DEEP_LINK_INVALID` int /*Some items include invalid android_deep_link.*/,
  `UTM_SOURCE_AUTO_CORRECTED` int /*Some items include utm_source values that are formatted incorrectly and have been automatically corrected.*/,
  `COUNTRY_DOES_NOT_MAP_TO_CURRENCY` int /*Some items include a currency that doesn&#39;t match the usual currency for the location where that product is sold or shipped.*/,
  `MIN_AD_PRICE_INVALID` int /*Some items include min_ad_price values that are formatted incorrectly.*/,
  `GTIN_INVALID` int /*Some items include incorrectly formatted GTINs.*/,
  `INCONSISTENT_CURRENCY_VALUES` int /*Some items include inconsistent currencies in price fields.*/,
  `SALES_PRICE_TOO_LOW` int /*Some items include sales price that is much lower than the list price.*/,
  `SHIPPING_WIDTH_INVALID` int /*Some items include incorrectly formatted shipping_width.*/,
  `SHIPPING_HEIGHT_INVALID` int /*Some items include incorrectly formatted shipping_height.*/,
  `SALES_PRICE_TOO_HIGH` int /*Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.*/,
  `MPN_INVALID` int /*Some items include incorrectly formatted MPNs.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedsCreateRequest` generated from model 'catalogsFeedsCreateRequest'
-- Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedsCreateRequest` (
  `name` text NOT NULL /*A human-friendly name associated to a given feed.*/,
  `format` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `default_currency` long,
  `default_locale` long,
  `credentials` long,
  `preferred_processing_schedule` long,
  `default_country` long,
  `default_availability` long
);  /*Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedsUpdateRequest` generated from model 'catalogsFeedsUpdateRequest'
-- Request object for updating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedsUpdateRequest` (
  `default_availability` long,
  `default_currency` long,
  `name` text /*A human-friendly name associated to a given feed.*/,
  `format` long,
  `credentials` long,
  `location` text /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `preferred_processing_schedule` long,
  `status` long
);  /*Request object for updating a feed.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelAddress` generated from model 'catalogsHotelAddress'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelAddress` (
  `addr1` text /*Primary street address of hotel.*/,
  `city` text /*City where the hotel is located.*/,
  `region` text /*State, county, province, where the hotel is located.*/,
  `country` text /*Country where the hotel is located.*/,
  `postal_code` text /*Required for countries with a postal code system. Postal or zip code of the hotel.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelAttributes` generated from model 'catalogsHotelAttributes'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelAttributes` (
  `name` text /*The hotel&#39;s name.*/,
  `link` text /*Link to the product page*/,
  `description` text /*Brief description of the hotel.*/,
  `brand` text /*The brand to which this hotel belongs to.*/,
  `latitude` decimal /*Latitude of the hotel.*/,
  `longitude` decimal /*Longitude of the hotel.*/,
  `address` long,
  `custom_label_0` text /*Custom grouping of hotels*/,
  `custom_label_1` text /*Custom grouping of hotels*/,
  `custom_label_2` text /*Custom grouping of hotels*/,
  `custom_label_3` text /*Custom grouping of hotels*/,
  `custom_label_4` text /*Custom grouping of hotels*/,
  `category` text /*The type of property. The category can be any type of internal description desired.*/,
  `base_price` text /*Base price of the hotel room per night followed by the ISO currency code*/,
  `sale_price` text /*Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.*/,
  `guest_ratings` long,
  `main_image` long,
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
-- Table structure for table `CatalogsHotelBatchItem` generated from model 'catalogsHotelBatchItem'
-- Hotel batch item
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelBatchItem` (
  `hotel_id` text NOT NULL /*The catalog hotel id in the merchant namespace*/,
  `operation` text NOT NULL,
  `attributes` long NOT NULL
);  /*Hotel batch item*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelBatchRequest` generated from model 'catalogsHotelBatchRequest'
-- Request object to update catalogs hotel items
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelBatchRequest` (
  `catalog_type` long NOT NULL,
  `country` long NOT NULL,
  `language` long NOT NULL,
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
  `name` text NOT NULL /*A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.*/,
  `format` long NOT NULL,
  `catalog_type` long NOT NULL,
  `credentials` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `preferred_processing_schedule` long NOT NULL,
  `status` long NOT NULL,
  `default_currency` long NOT NULL,
  `default_locale` text NOT NULL /*The locale used within a feed for product descriptions.*/,
  `catalog_id` text NOT NULL /*Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.*/,
  `created_at` datetime,
  `id` text PRIMARY KEY,
  `updated_at` datetime
);  /*Catalogs Hotel Feed object*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelFeedsCreateRequest` generated from model 'catalogsHotelFeedsCreateRequest'
-- Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelFeedsCreateRequest` (
  `name` text NOT NULL /*A human-friendly name associated to a given feed.*/,
  `format` long NOT NULL,
  `default_locale` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `catalog_type` long NOT NULL,
  `default_currency` long,
  `credentials` long,
  `preferred_processing_schedule` long,
  `catalog_id` text /*Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.*/
);  /*Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelFeedsUpdateRequest` generated from model 'catalogsHotelFeedsUpdateRequest'
-- Request object for updating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelFeedsUpdateRequest` (
  `catalog_type` long NOT NULL,
  `default_currency` long,
  `name` text /*A human-friendly name associated to a given feed.*/,
  `format` long,
  `credentials` long,
  `location` text /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `preferred_processing_schedule` long,
  `status` long
);  /*Request object for updating a feed.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelGuestRatings` generated from model 'catalogsHotelGuestRatings'
-- If specified, you must provide all properties
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelGuestRatings` (
  `score` decimal /*Your hotel&#39;s rating.*/,
  `number_of_reviewers` int /*Total number of people who have rated this hotel.*/,
  `max_score` decimal /*Max value for the hotel rating score.*/,
  `rating_system` text /*System you use for guest reviews.*/
);  /*If specified, you must provide all properties*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelItemErrorResponse` generated from model 'catalogsHotelItemErrorResponse'
-- Object describing a hotel item error
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelItemErrorResponse` (
  `catalog_type` long NOT NULL,
  `hotel_id` text /*The catalog hotel id in the merchant namespace*/,
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
  `hotel_id` text /*The catalog hotel id in the merchant namespace*/,
  `attributes` long
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
  `created_time` datetime /*Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD*/,
  `completed_time` datetime /*Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD*/,
  `status` long,
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
-- Table structure for table `CatalogsHotelProductGroup` generated from model 'catalogsHotelProductGroup'
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroup` (
  `catalog_type` text NOT NULL,
  `id` text NOT NULL PRIMARY KEY /*ID of the hotel product group.*/,
  `filters` long NOT NULL,
  `catalog_id` text NOT NULL,
  `name` text /*Name of hotel product group*/,
  `description` text,
  `created_at` int /*Unix timestamp in seconds of when catalog product group was created.*/,
  `updated_at` int /*Unix timestamp in seconds of last time catalog product group was updated.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsHotelProductGroupCreateRequest` generated from model 'catalogsHotelProductGroupCreateRequest'
-- Request object for creating a hotel product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroupCreateRequest` (
  `catalog_type` text NOT NULL,
  `name` text NOT NULL,
  `filters` long NOT NULL,
  `catalog_id` text NOT NULL /*Catalog id pertaining to the hotel product group.*/,
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
  `COUNTRY` long NOT NULL
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
-- Table structure for table `CatalogsHotelProductGroupUpdateRequest` generated from model 'catalogsHotelProductGroupUpdateRequest'
-- Request object for updating a hotel product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsHotelProductGroupUpdateRequest` (
  `catalog_type` text,
  `name` text,
  `description` text,
  `filters` long
);  /*Request object for updating a hotel product group.*/


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
  `ITEMID_MISSING` long,
  `ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE` long,
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
  `item_number` int NOT NULL /*Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation.*/,
  `item_id` text NOT NULL /*The merchant-created unique ID that represents the product.*/,
  `errors` long NOT NULL,
  `warnings` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemValidationWarnings` generated from model 'catalogsItemValidationWarnings'
--

CREATE TABLE IF NOT EXISTS `CatalogsItemValidationWarnings` (
  `AD_LINK_FORMAT_WARNING` long,
  `AD_LINK_SAME_AS_LINK` long,
  `ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG` long,
  `ADDITIONAL_IMAGE_LINK_WARNING` long,
  `ADWORDS_FORMAT_WARNING` long,
  `ADWORDS_SAME_AS_LINK` long,
  `AGE_GROUP_INVALID` long,
  `SIZE_SYSTEM_INVALID` long,
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
  `SALES_PRICE_INVALID` long,
  `SALES_PRICE_TOO_LOW` long,
  `SALES_PRICE_TOO_HIGH` long,
  `SALE_DATE_INVALID` long,
  `SHIPPING_INVALID` long,
  `SHIPPING_HEIGHT_INVALID` long,
  `SHIPPING_WEIGHT_INVALID` long,
  `SHIPPING_WIDTH_INVALID` long,
  `SIZE_TYPE_INVALID` long,
  `TAX_INVALID` long,
  `TITLE_LENGTH_TOO_LONG` long,
  `TOO_MANY_ADDITIONAL_IMAGE_LINKS` long,
  `UTM_SOURCE_AUTO_CORRECTED` long,
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
  `batch_id` text /*Id of the catalogs items batch*/,
  `created_time` datetime /*Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD*/,
  `completed_time` datetime /*Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD*/,
  `status` long,
);  /*Object describing the catalogs items batch*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsBatchHotelProcessingRecord` generated from model 'CatalogsItemsBatchHotelProcessingRecord'

CREATE TABLE IF NOT EXISTS `CatalogsItemsBatchHotelProcessingRecord` (
  `catalogsItemsBatch` long NOT NULL
  `hotelProcessingRecord` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsBatchRequest` generated from model 'catalogsItemsBatchRequest'
-- Request object of catalogs items batch
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsBatchRequest` (
  `country` long NOT NULL,
  `language` long NOT NULL,
  `operation` long NOT NULL,
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
  `language` long NOT NULL,
  `operation` long NOT NULL,
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
  `language` long NOT NULL,
  `operation` long NOT NULL,
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
  `language` long NOT NULL,
  `operation` long NOT NULL,
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
  `catalog_id` text /*Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog*/
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
-- Table structure for table `CatalogsItemsUpdateBatchRequest` generated from model 'catalogsItemsUpdateBatchRequest'
-- Request object to update catalogs items
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsUpdateBatchRequest` (
  `country` long NOT NULL,
  `language` long NOT NULL,
  `operation` long NOT NULL,
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
  `language` long NOT NULL,
  `operation` long NOT NULL,
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
-- Table structure for table `CatalogsListProductsByFilterRequest` generated from model 'catalogsListProductsByFilterRequest'
-- Request object to list products for a given product group filter.
--

CREATE TABLE IF NOT EXISTS `CatalogsListProductsByFilterRequest` (
  `feed_id` text NOT NULL /*Catalog Feed id pertaining to the catalog product group filter.*/,
  `filters` long NOT NULL
);  /*Request object to list products for a given product group filter.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsListProductsByFilterRequest_oneOf` generated from model 'catalogsListProductsByFilterRequestOneOf'
-- Request object to list products for a given feed_id and product group filter.
--

CREATE TABLE IF NOT EXISTS `CatalogsListProductsByFilterRequest_oneOf` (
  `feed_id` text NOT NULL /*Catalog Feed id pertaining to the catalog product group filter.*/,
  `filters` long NOT NULL
);  /*Request object to list products for a given feed_id and product group filter.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProduct` generated from model 'catalogsProduct'
--

CREATE TABLE IF NOT EXISTS `CatalogsProduct` (
  `metadata` long NOT NULL,
  `pin` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroup` generated from model 'catalogsProductGroup'
-- catalog product group entity
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroup` (
  `id` text NOT NULL PRIMARY KEY /*ID of the catalog product group.*/,
  `filters` long NOT NULL,
  `feed_id` text NOT NULL /*id of the catalogs feed belonging to this catalog product group*/,
  `name` text /*Name of catalog product group*/,
  `description` text,
  `is_featured` boolean /*boolean indicator of whether the product group is being featured or not*/,
  `type` long,
  `status` long,
  `created_at` int /*Unix timestamp in seconds of when catalog product group was created.*/,
  `updated_at` int /*Unix timestamp in seconds of last time catalog product group was updated.*/,
  `catalog_type` text
);  /*catalog product group entity*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupCreateRequest` generated from model 'catalogsProductGroupCreateRequest'
-- Request object for creating a product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupCreateRequest` (
  `name` text NOT NULL,
  `filters` long NOT NULL,
  `feed_id` text NOT NULL /*Catalog Feed id pertaining to the catalog product group.*/,
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
  `GOOGLE_PRODUCT_CATEGORY_0` long NOT NULL
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
-- Table structure for table `CatalogsProductGroupFiltersRequest_anyOf` generated from model 'catalogsProductGroupFiltersRequestAnyOf'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersRequest_anyOf` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupFiltersRequestAnyOfCatalogsProductGroupFilterKeys` generated from model 'CatalogsProductGroupFiltersRequestAnyOfCatalogsProductGroupFilterKeys'

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersRequestAnyOfCatalogsProductGroupFilterKeys` (
  `catalogsProductGroupFiltersRequestAnyOf` long NOT NULL
  `catalogsProductGroupFilterKeys` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupFiltersRequest_anyOf_1` generated from model 'catalogsProductGroupFiltersRequestAnyOf1'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersRequest_anyOf_1` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupFiltersRequestAnyOf1CatalogsProductGroupFilterKeys` generated from model 'CatalogsProductGroupFiltersRequestAnyOf1CatalogsProductGroupFilterKeys'

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupFiltersRequestAnyOf1CatalogsProductGroupFilterKeys` (
  `catalogsProductGroupFiltersRequestAnyOf1` long NOT NULL
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
  `operator` text NOT NULL,
  `value` decimal NOT NULL,
  `currency` long NOT NULL,
  `negated` boolean
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupProductCounts` generated from model 'catalogsProductGroupProductCounts'
-- Product counts for a CatalogsProductGroup
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupProductCounts` (
  `in_stock` decimal NOT NULL,
  `out_of_stock` decimal NOT NULL,
  `preorder` decimal NOT NULL,
  `total` decimal NOT NULL
);  /*Product counts for a CatalogsProductGroup*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupUpdateRequest` generated from model 'catalogsProductGroupUpdateRequest'
-- Request object for updating a product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupUpdateRequest` (
  `name` text,
  `description` text,
  `is_featured` boolean /*boolean indicator of whether the product group is being featured or not*/,
  `filters` long
);  /*Request object for updating a product group.*/


-- --------------------------------------------------------------------------
-- Table structure for table `catalogs_product_groups_create_201_response` generated from model 'catalogsProductGroupsCreate201Response'
--

CREATE TABLE IF NOT EXISTS `catalogs_product_groups_create_201_response` (
  `id` text NOT NULL PRIMARY KEY /*ID of the catalog product group.*/,
  `filters` long NOT NULL,
  `feed_id` text NOT NULL /*id of the catalogs feed belonging to this catalog product group*/,
  `catalog_id` text NOT NULL,
  `name` text /*Name of catalog product group*/,
  `description` text,
  `is_featured` boolean /*boolean indicator of whether the product group is being featured or not*/,
  `type` long,
  `status` long,
  `created_at` int /*Unix timestamp in seconds of when catalog product group was created.*/,
  `updated_at` int /*Unix timestamp in seconds of last time catalog product group was updated.*/,
  `catalog_type` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `catalogs_product_groups_create_request` generated from model 'catalogsProductGroupsCreateRequest'
--

CREATE TABLE IF NOT EXISTS `catalogs_product_groups_create_request` (
  `name` text NOT NULL,
  `filters` long NOT NULL,
  `feed_id` text NOT NULL /*Catalog Feed id pertaining to the catalog product group.*/,
  `catalog_type` text NOT NULL,
  `catalog_id` text NOT NULL /*Catalog id pertaining to the hotel product group.*/,
  `description` text,
  `is_featured` boolean /*boolean indicator of whether the product group is being featured or not*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `catalogs_product_groups_list_200_response` generated from model 'catalogsProductGroupsList200Response'
--

CREATE TABLE IF NOT EXISTS `catalogs_product_groups_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupsList200ResponseCatalogsProductGroupsList200ResponseAllOfItemsInner` generated from model 'CatalogsProductGroupsList200ResponseCatalogsProductGroupsList200ResponseAllOfItemsInner'

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupsList200ResponseCatalogsProductGroupsList200ResponseAllOfItemsInner` (
  `catalogsProductGroupsList200Response` long NOT NULL
  `catalogsProductGroupsList200ResponseAllOfItemsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `catalogs_product_groups_list_200_response_allOf_items_inner` generated from model 'catalogsProductGroupsList200ResponseAllOfItemsInner'
--

CREATE TABLE IF NOT EXISTS `catalogs_product_groups_list_200_response_allOf_items_inner` (
  `id` text NOT NULL PRIMARY KEY /*ID of the catalog product group.*/,
  `filters` long NOT NULL,
  `feed_id` text NOT NULL /*id of the catalogs feed belonging to this catalog product group*/,
  `catalog_id` text NOT NULL,
  `name` text /*Name of catalog product group*/,
  `description` text,
  `is_featured` boolean /*boolean indicator of whether the product group is being featured or not*/,
  `type` long,
  `status` long,
  `created_at` int /*Unix timestamp in seconds of when catalog product group was created.*/,
  `updated_at` int /*Unix timestamp in seconds of last time catalog product group was updated.*/,
  `catalog_type` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `catalogs_product_groups_update_request` generated from model 'catalogsProductGroupsUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `catalogs_product_groups_update_request` (
  `name` text,
  `description` text,
  `is_featured` boolean /*boolean indicator of whether the product group is being featured or not*/,
  `filters` long,
  `catalog_type` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductMetadata` generated from model 'catalogsProductMetadata'
-- Product metadata entity
--

CREATE TABLE IF NOT EXISTS `CatalogsProductMetadata` (
  `item_id` text NOT NULL /*The user-created unique ID that represents the product.*/,
  `item_group_id` text NOT NULL /*The parent ID of the product.*/,
  `availability` long NOT NULL,
  `price` decimal NOT NULL /*The price of the product.*/,
  `sale_price` decimal NOT NULL /*The discounted price of the product.*/,
  `currency` long NOT NULL
);  /*Product metadata entity*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailBatchRequest` generated from model 'catalogsRetailBatchRequest'
-- A request object that can have multiple operations on a single retail batch
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailBatchRequest` (
  `catalog_type` long NOT NULL,
  `country` long NOT NULL,
  `language` long NOT NULL,
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
  `item_id` text NOT NULL /*The catalog item id in the merchant namespace*/,
  `operation` text NOT NULL,
  `attributes` long NOT NULL,
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
  `name` text NOT NULL /*A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.*/,
  `format` long NOT NULL,
  `catalog_type` long NOT NULL,
  `credentials` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `preferred_processing_schedule` long NOT NULL,
  `status` long NOT NULL,
  `default_currency` long NOT NULL,
  `default_locale` text NOT NULL /*The locale used within a feed for product descriptions.*/,
  `default_country` long NOT NULL,
  `default_availability` long NOT NULL,
  `created_at` datetime,
  `id` text PRIMARY KEY,
  `updated_at` datetime
);  /*Catalogs Retail Feed object*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFeedsCreateRequest` generated from model 'catalogsRetailFeedsCreateRequest'
-- Request object for creating a retail feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailFeedsCreateRequest` (
  `name` text NOT NULL /*A human-friendly name associated to a given feed.*/,
  `format` long NOT NULL,
  `default_locale` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `catalog_type` long NOT NULL,
  `default_country` long NOT NULL,
  `default_currency` long,
  `credentials` long,
  `preferred_processing_schedule` long,
  `default_availability` long
);  /*Request object for creating a retail feed.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailFeedsUpdateRequest` generated from model 'catalogsRetailFeedsUpdateRequest'
-- Request object for updating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailFeedsUpdateRequest` (
  `catalog_type` long NOT NULL,
  `default_currency` long,
  `name` text /*A human-friendly name associated to a given feed.*/,
  `format` long,
  `credentials` long,
  `location` text /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `preferred_processing_schedule` long,
  `status` long,
  `default_availability` long
);  /*Request object for updating a feed.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsRetailItemErrorResponse` generated from model 'catalogsRetailItemErrorResponse'
-- Object describing a retail item error
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailItemErrorResponse` (
  `catalog_type` long NOT NULL,
  `item_id` text /*The catalog item id in the merchant namespace*/,
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
  `item_id` text /*The catalog retail item id in the merchant namespace*/,
  `attributes` long
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
  `batch_id` text /*Id of the catalogs items batch*/,
  `created_time` datetime /*Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD*/,
  `completed_time` datetime /*Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD*/,
  `status` long,
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
-- Table structure for table `CatalogsRetailProductGroup` generated from model 'catalogsRetailProductGroup'
--

CREATE TABLE IF NOT EXISTS `CatalogsRetailProductGroup` (
  `catalog_type` text NOT NULL,
  `id` text NOT NULL PRIMARY KEY /*ID of the catalog product group.*/,
  `filters` long NOT NULL,
  `feed_id` text NOT NULL,
  `name` text /*Name of catalog product group*/,
  `description` text,
  `is_featured` boolean /*boolean indicator of whether the product group is being featured or not*/,
  `type` long,
  `status` long,
  `created_at` int /*Unix timestamp in seconds of when catalog product group was created.*/,
  `updated_at` int /*Unix timestamp in seconds of last time catalog product group was updated.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsUpdatableHotelAttributes` generated from model 'catalogsUpdatableHotelAttributes'
--

CREATE TABLE IF NOT EXISTS `CatalogsUpdatableHotelAttributes` (
  `name` text /*The hotel&#39;s name.*/,
  `link` text /*Link to the product page*/,
  `description` text /*Brief description of the hotel.*/,
  `brand` text /*The brand to which this hotel belongs to.*/,
  `latitude` decimal /*Latitude of the hotel.*/,
  `longitude` decimal /*Longitude of the hotel.*/,
  `address` long,
  `custom_label_0` text /*Custom grouping of hotels*/,
  `custom_label_1` text /*Custom grouping of hotels*/,
  `custom_label_2` text /*Custom grouping of hotels*/,
  `custom_label_3` text /*Custom grouping of hotels*/,
  `custom_label_4` text /*Custom grouping of hotels*/,
  `category` text /*The type of property. The category can be any type of internal description desired.*/,
  `base_price` text /*Base price of the hotel room per night followed by the ISO currency code*/,
  `sale_price` text /*Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.*/,
  `guest_ratings` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsUpdatableHotelAttributesNeighborhood` generated from model 'CatalogsUpdatableHotelAttributesNeighborhood'

CREATE TABLE IF NOT EXISTS `CatalogsUpdatableHotelAttributesNeighborhood` (
  `catalogsUpdatableHotelAttributes` long NOT NULL
  `neighborhood` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsUpdateHotelItem` generated from model 'catalogsUpdateHotelItem'
-- Object describing an hotel item batch record
--

CREATE TABLE IF NOT EXISTS `CatalogsUpdateHotelItem` (
  `hotel_id` text NOT NULL /*The catalog hotel item id in the merchant namespace*/,
  `operation` text NOT NULL,
  `attributes` long NOT NULL
);  /*Object describing an hotel item batch record*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsUpdateRetailItem` generated from model 'catalogsUpdateRetailItem'
-- An item to be updated
--

CREATE TABLE IF NOT EXISTS `CatalogsUpdateRetailItem` (
  `item_id` text NOT NULL /*The catalog item id in the merchant namespace*/,
  `operation` text NOT NULL,
  `attributes` long NOT NULL,
);  /*An item to be updated*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsUpdateRetailItemUpdateMaskFieldType` generated from model 'CatalogsUpdateRetailItemUpdateMaskFieldType'

CREATE TABLE IF NOT EXISTS `CatalogsUpdateRetailItemUpdateMaskFieldType` (
  `catalogsUpdateRetailItem` long NOT NULL
  `updateMaskFieldType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsUpsertHotelItem` generated from model 'catalogsUpsertHotelItem'
-- A hotel item to be upserted.
--

CREATE TABLE IF NOT EXISTS `CatalogsUpsertHotelItem` (
  `hotel_id` text NOT NULL /*The catalog hotel id in the merchant namespace*/,
  `operation` text NOT NULL,
  `attributes` long NOT NULL
);  /*A hotel item to be upserted.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsUpsertRetailItem` generated from model 'catalogsUpsertRetailItem'
-- An item to be upserted
--

CREATE TABLE IF NOT EXISTS `CatalogsUpsertRetailItem` (
  `item_id` text NOT NULL /*The catalog item id in the merchant namespace*/,
  `operation` text NOT NULL,
  `attributes` long NOT NULL
);  /*An item to be upserted*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsVerticalBatchRequest` generated from model 'catalogsVerticalBatchRequest'
-- A request object that can have multiple operations on a single batch
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalBatchRequest` (
  `catalog_type` long NOT NULL,
  `country` long NOT NULL,
  `language` long NOT NULL,
  `catalog_id` text /*Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog*/
);  /*A request object that can have multiple operations on a single batch*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsVerticalBatchRequestCatalogsHotelBatchItem` generated from model 'CatalogsVerticalBatchRequestCatalogsHotelBatchItem'

CREATE TABLE IF NOT EXISTS `CatalogsVerticalBatchRequestCatalogsHotelBatchItem` (
  `catalogsVerticalBatchRequest` long NOT NULL
  `catalogsHotelBatchItem` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsVerticalFeedsCreateRequest` generated from model 'catalogsVerticalFeedsCreateRequest'
-- Request object for creating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalFeedsCreateRequest` (
  `name` text NOT NULL /*A human-friendly name associated to a given feed.*/,
  `format` long NOT NULL,
  `default_locale` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `catalog_type` long NOT NULL,
  `default_country` long NOT NULL,
  `default_currency` long,
  `credentials` long,
  `preferred_processing_schedule` long,
  `default_availability` long,
  `catalog_id` text /*Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.*/
);  /*Request object for creating a feed.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsVerticalFeedsUpdateRequest` generated from model 'catalogsVerticalFeedsUpdateRequest'
-- Request object for updating a feed.
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalFeedsUpdateRequest` (
  `catalog_type` long NOT NULL,
  `default_currency` long,
  `name` text /*A human-friendly name associated to a given feed.*/,
  `format` long,
  `credentials` long,
  `location` text /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `preferred_processing_schedule` long,
  `status` long,
  `default_availability` long
);  /*Request object for updating a feed.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsVerticalProductGroup` generated from model 'catalogsVerticalProductGroup'
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalProductGroup` (
  `catalog_type` text NOT NULL,
  `id` text NOT NULL PRIMARY KEY /*ID of the catalog product group.*/,
  `filters` long NOT NULL,
  `catalog_id` text NOT NULL,
  `feed_id` text NOT NULL,
  `name` text /*Name of catalog product group*/,
  `description` text,
  `created_at` int /*Unix timestamp in seconds of when catalog product group was created.*/,
  `updated_at` int /*Unix timestamp in seconds of last time catalog product group was updated.*/,
  `is_featured` boolean /*boolean indicator of whether the product group is being featured or not*/,
  `type` long,
  `status` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsVerticalProductGroupCreateRequest` generated from model 'catalogsVerticalProductGroupCreateRequest'
-- Request object for creating a hotel product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalProductGroupCreateRequest` (
  `catalog_type` text NOT NULL,
  `name` text NOT NULL,
  `filters` long NOT NULL,
  `catalog_id` text NOT NULL /*Catalog id pertaining to the hotel product group.*/,
  `description` text
);  /*Request object for creating a hotel product group.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsVerticalProductGroupUpdateRequest` generated from model 'catalogsVerticalProductGroupUpdateRequest'
-- Request object for updating a hotel product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsVerticalProductGroupUpdateRequest` (
  `catalog_type` text,
  `name` text,
  `description` text,
  `filters` long
);  /*Request object for updating a hotel product group.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ConditionFilter` generated from model 'conditionFilter'
--

CREATE TABLE IF NOT EXISTS `ConditionFilter` (
  `CONDITION` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionApiResponse` generated from model 'conversionApiResponse'
-- Schema describing the object in the response, which contains information about the events that were received and processed.
--

CREATE TABLE IF NOT EXISTS `ConversionApiResponse` (
  `num_events_received` int NOT NULL /*Total number of events received in the request.*/,
  `num_events_processed` int NOT NULL /*Number of events that were successfully processed from the events.*/,
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
-- Table structure for table `ConversionEventResponse` generated from model 'conversionEventResponse'
--

CREATE TABLE IF NOT EXISTS `ConversionEventResponse` (
  `conversion_event` long,
  `conversion_tag_id` text /*Id of the tag.*/,
  `ad_account_id` text /*Id of the ad account.*/,
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
  `event_name` text NOT NULL /*The type of the user event. Please use the right event_name otherwise the event won’t be accepted and show up correctly in reports. &lt;li&gt;&lt;code&gt;add_to_cart&lt;/code&gt; &lt;li&gt;&lt;code&gt;checkout&lt;/code&gt; &lt;li&gt;&lt;code&gt;custom&lt;/code&gt; &lt;li&gt;&lt;code&gt;lead&lt;/code&gt; &lt;li&gt;&lt;code&gt;page_visit&lt;/code&gt; &lt;li&gt;&lt;code&gt;search&lt;/code&gt; &lt;li&gt;&lt;code&gt;signup&lt;/code&gt; &lt;li&gt;&lt;code&gt;view_category&lt;/code&gt; &lt;li&gt;&lt;code&gt;watch_video&lt;/code&gt;*/,
  `action_source` text NOT NULL /*The source indicating where the conversion event occurred. &lt;li&gt;&lt;code&gt;app_android&lt;/code&gt; &lt;li&gt;&lt;code&gt;app_ios&lt;/code&gt; &lt;li&gt;&lt;code&gt;web&lt;/code&gt; &lt;li&gt;&lt;code&gt;offline&lt;/code&gt;*/,
  `event_time` long NOT NULL /*The time when the event happened. Unix timestamp in seconds.*/,
  `event_id` text NOT NULL /*A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.*/,
  `user_data` long NOT NULL,
  `event_source_url` text /*URL of the web conversion event.*/,
  `opt_out` boolean /*When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.*/,
  `partner_name` text /*The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g ‘ss-shopify’*/,
  `custom_data` long,
  `app_id` text /*The app store app ID.*/,
  `app_name` text /*Name of the app.*/,
  `app_version` text /*Version of the app.*/,
  `device_brand` text /*Brand of the user device.*/,
  `device_carrier` text /*User device&#39;s mobile carrier.*/,
  `device_model` text /*Model of the user device.*/,
  `device_type` text /*Type of the user device.*/,
  `os_version` text /*Version of the device operating system.*/,
  `wifi` boolean /*Whether the event occurred when the user device was connected to wifi.*/,
  `language` text /*Two-character ISO-639-1 language code indicating the user&#39;s language.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEvents_data_inner_custom_data` generated from model 'conversionEventsDataInnerCustomData'
-- Object containing other custom data.
--

CREATE TABLE IF NOT EXISTS `ConversionEvents_data_inner_custom_data` (
  `currency` text /*The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.*/,
  `value` text /*Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.*/,
  `content_name` text /*The name of the page or product associated with the event.*/,
  `content_category` text /*The category of the content associated with the event.*/,
  `content_brand` text /*The brand of the content associated with the event.*/,
  `num_items` long /*Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).*/,
  `order_id` text /*The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.*/,
  `search_string` text /*The search string related to the user conversion event.*/,
  `opt_out_type` text /*Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/limited-data-processing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Help Center&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/conversions/conversion-management/#Understanding%20Limited%20Data%20Processing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;dev site&lt;/a&gt; for specific opt_out_type set up.*/,
  `np` text /*Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.*/
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
  `item_price` text /*The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).*/,
  `quantity` long /*The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section).*/,
  `item_name` text /*The name of a product.*/,
  `item_category` text /*The category of a product.*/,
  `item_brand` text /*The brand of a product.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionEventsUserData` generated from model 'conversionEventsUserData'
-- Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
--

CREATE TABLE IF NOT EXISTS `ConversionEventsUserData` (
);  /*Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionTagCommon` generated from model 'conversionTagCommon'
--

CREATE TABLE IF NOT EXISTS `ConversionTagCommon` (
  `ad_account_id` text /*Ad account ID.*/,
  `code_snippet` text /*Tag code snippet.*/,
  `enhanced_match_status` long,
  `id` text PRIMARY KEY /*Tag ID.*/,
  `last_fired_time_ms` decimal /*Time for the last event fired.*/,
  `name` text /*Conversion tag name.*/,
  `status` long,
  `version` text /*Version number.*/,
  `configs` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionTagConfigs` generated from model 'conversionTagConfigs'
--

CREATE TABLE IF NOT EXISTS `ConversionTagConfigs` (
  `aem_enabled` boolean /*Whether Automatic Enhanced Match email is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.*/,
  `md_frequency` decimal /*Metadata ingestion frequency.*/,
  `aem_fnln_enabled` boolean /*Whether Automatic Enhanced Match name is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.*/,
  `aem_ph_enabled` boolean /*Whether Automatic Enhanced Match phone is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.*/,
  `aem_ge_enabled` boolean /*Whether Automatic Enhanced Match gender is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.*/,
  `aem_db_enabled` boolean /*Whether Automatic Enhanced Match birthdate is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.*/,
  `aem_loc_enabled` boolean /*Whether Automatic Enhanced Match location is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionTagCreate` generated from model 'conversionTagCreate'
--

CREATE TABLE IF NOT EXISTS `ConversionTagCreate` (
  `aem_enabled` boolean /*Whether Automatic Enhanced Match email is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.*/,
  `md_frequency` decimal /*Metadata ingestion frequency.*/,
  `aem_fnln_enabled` boolean /*Whether Automatic Enhanced Match name is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.*/,
  `aem_ph_enabled` boolean /*Whether Automatic Enhanced Match phone is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.*/,
  `aem_ge_enabled` boolean /*Whether Automatic Enhanced Match gender is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.*/,
  `aem_db_enabled` boolean /*Whether Automatic Enhanced Match birthdate is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.*/,
  `aem_loc_enabled` boolean /*Whether Automatic Enhanced Match location is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionTagListResponse` generated from model 'conversionTagListResponse'
--

CREATE TABLE IF NOT EXISTS `ConversionTagListResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ConversionTagListResponseConversionTagResponse` generated from model 'ConversionTagListResponseConversionTagResponse'

CREATE TABLE IF NOT EXISTS `ConversionTagListResponseConversionTagResponse` (
  `conversionTagListResponse` long NOT NULL
  `conversionTagResponse` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ConversionTagResponse` generated from model 'conversionTagResponse'
--

CREATE TABLE IF NOT EXISTS `ConversionTagResponse` (
  `ad_account_id` text /*Ad account ID.*/,
  `code_snippet` text /*Tag code snippet.*/,
  `enhanced_match_status` long,
  `id` text PRIMARY KEY /*Tag ID.*/,
  `last_fired_time_ms` decimal /*Time for the last event fired.*/,
  `name` text /*Conversion tag name.*/,
  `status` long,
  `version` text /*Version number.*/,
  `configs` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CountryFilter` generated from model 'countryFilter'
--

CREATE TABLE IF NOT EXISTS `CountryFilter` (
  `COUNTRY` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CreateMMMReportRequest` generated from model 'createMMMReportRequest'
--

CREATE TABLE IF NOT EXISTS `CreateMMMReportRequest` (
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
  `report_status` long,
  `token` text,
  `message` text,
  `status` text
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
-- Table structure for table `CustomerList` generated from model 'customerList'
--

CREATE TABLE IF NOT EXISTS `CustomerList` (
  `ad_account_id` text /*Associated ad account ID.*/,
  `created_time` decimal /*Creation time. Unix timestamp in seconds.*/,
  `id` text PRIMARY KEY /*Customer list ID.*/,
  `name` text /*Customer list name.*/,
  `num_batches` decimal /*Total number of list updates.  List creation counts as one batch. Each &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.*/,
  `num_removed_user_records` decimal /*Number of removed user records. In a &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call, this counter increases even if the user is not found in the list.*/,
  `num_uploaded_user_records` decimal /*Number of uploaded user records. In an &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append API&lt;/a&gt; call, this counter increases even if the uploaded user is already in the list.*/,
  `status` text /*Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.*/,
  `type` text /*Always \&quot;customerlist\&quot;.*/,
  `updated_time` decimal /*Last update time. Unix timestamp in seconds.*/,
  `exceptions` blob /*Customer list errors*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CustomerListRequest` generated from model 'customerListRequest'
--

CREATE TABLE IF NOT EXISTS `CustomerListRequest` (
  `name` text NOT NULL /*Customer list name.*/,
  `records` text NOT NULL /*Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.*/,
  `list_type` long,
  `exceptions` blob /*Customer list errors.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CustomerListUpdateRequest` generated from model 'customerListUpdateRequest'
--

CREATE TABLE IF NOT EXISTS `CustomerListUpdateRequest` (
  `records` text NOT NULL /*Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.*/,
  `operation_type` long NOT NULL,
  `exceptions` long
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
  `name` text /*Metric&#39;s name.*/,
  `category` text /*Category name*/,
  `definition` text /*How the metric is defined.*/,
  `display_name` text /*Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `DetailedError` generated from model 'detailedError'
-- Used for including extra details to a base error
--

CREATE TABLE IF NOT EXISTS `DetailedError` (
  `code` int NOT NULL,
  `message` text NOT NULL,
  `details` blob NOT NULL
);  /*Used for including extra details to a base error*/


-- --------------------------------------------------------------------------
-- Table structure for table `Error` generated from model 'error'
--

CREATE TABLE IF NOT EXISTS `Error` (
  `code` int NOT NULL,
  `message` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Exception` generated from model 'exception'
--

CREATE TABLE IF NOT EXISTS `Exception` (
  `code` int /*Exception error code.*/,
  `message` text /*Exception message.*/
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
  `name` text NOT NULL /*A human-friendly name associated to a given feed.*/,
  `format` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `catalog_type` long NOT NULL,
  `default_currency` long,
  `default_locale` long,
  `credentials` long,
  `preferred_processing_schedule` long,
  `default_country` long,
  `default_availability` long,
  `catalog_id` text /*Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.*/
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
  `default_currency` long,
  `name` text /*A human-friendly name associated to a given feed.*/,
  `format` long,
  `credentials` long,
  `location` text /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `preferred_processing_schedule` long,
  `status` long,
  `default_availability` long
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
-- Table structure for table `GenderFilter` generated from model 'genderFilter'
--

CREATE TABLE IF NOT EXISTS `GenderFilter` (
  `GENDER` long NOT NULL
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
  `url` text,
  `size` decimal
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
  `status` long
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
  `width` int UNSIGNED NOT NULL,
  `height` int UNSIGNED NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ImageMetadata` generated from model 'imageMetadata'
--

CREATE TABLE IF NOT EXISTS `ImageMetadata` (
  `item_type` text,
  `title` text,
  `description` text,
  `link` text,
  `images` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ImageMetadata_images` generated from model 'imageMetadataImages'
--

CREATE TABLE IF NOT EXISTS `ImageMetadata_images` (
  `150x150` long,
  `400x300` long,
  `600x` long,
  `1200x` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `IntegrationLog` generated from model 'integrationLog'
-- Schema for log sent from an integration application.
--

CREATE TABLE IF NOT EXISTS `IntegrationLog` (
  `client_timestamp` int NOT NULL /*Timestamp in milliseconds of when the log was executed at the client.*/,
  `event_type` text NOT NULL /*Log event type*/,
  `log_level` text NOT NULL /*Log level type*/,
  `external_business_id` text,
  `advertiser_id` text,
  `merchant_id` text,
  `tag_id` text,
  `feed_profile_id` text,
  `message` text /*Explanation of the event that occured.*/,
  `app_version_number` text /*Version number of the integration application.*/,
  `platform_version_number` text /*Version number of the platform the integration application is running on.*/,
  `error` long,
  `request` long
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
  `method` text NOT NULL,
  `host` text NOT NULL /*HTTP request host from host header.*/,
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
  `value` text NOT NULL /*The value that is invalid.*/,
  `reason` text NOT NULL /*The reason the value is invalid.*/,
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
  `id` text PRIMARY KEY,
  `external_business_id` text,
  `connected_merchant_id` text,
  `connected_user_id` text,
  `connected_advertiser_id` text,
  `connected_lba_id` text,
  `connected_tag_id` text,
  `partner_access_token_expiry` decimal,
  `partner_refresh_token_expiry` decimal,
  `scopes` text,
  `created_timestamp` decimal,
  `updated_timestamp` decimal,
  `additional_id_1` text,
  `partner_metadata` text
);  /*Integration metadata*/


-- --------------------------------------------------------------------------
-- Table structure for table `IntegrationRecord` generated from model 'integrationRecord'
-- Integration record
--

CREATE TABLE IF NOT EXISTS `IntegrationRecord` (
  `id` text PRIMARY KEY,
  `external_business_id` text,
  `connected_merchant_id` text,
  `connected_user_id` text,
  `connected_advertiser_id` text,
  `connected_lba_id` text,
  `connected_tag_id` text,
  `partner_access_token` text,
  `partner_refresh_token` text,
  `partner_primary_email` text,
  `partner_access_token_expiry` int,
  `partner_refresh_token_expiry` int,
  `scopes` text,
  `partner_metadata` text,
  `additional_id_1` text,
  `created_time` int,
  `updated_time` int
);  /*Integration record*/


-- --------------------------------------------------------------------------
-- Table structure for table `IntegrationRequest` generated from model 'integrationRequest'
-- Schema used for creating the integration metadata.
--

CREATE TABLE IF NOT EXISTS `IntegrationRequest` (
  `external_business_id` text /*External business ID for the integration.*/,
  `connected_merchant_id` text,
  `connected_advertiser_id` text,
  `connected_lba_id` text,
  `connected_tag_id` text,
  `partner_access_token` text,
  `partner_refresh_token` text,
  `partner_primary_email` text,
  `partner_access_token_expiry` int,
  `partner_refresh_token_expiry` int,
  `scopes` text,
  `additional_id_1` text,
  `partner_metadata` text
);  /*Schema used for creating the integration metadata.*/


-- --------------------------------------------------------------------------
-- Table structure for table `IntegrationRequestPatch` generated from model 'integrationRequestPatch'
-- Schema used for updating the integration metadata.
--

CREATE TABLE IF NOT EXISTS `IntegrationRequestPatch` (
  `connected_merchant_id` text,
  `connected_advertiser_id` text,
  `connected_lba_id` text,
  `connected_tag_id` text,
  `partner_access_token` text,
  `partner_refresh_token` text,
  `partner_primary_email` text,
  `partner_access_token_expiry` decimal,
  `partner_refresh_token_expiry` decimal,
  `scopes` text,
  `additional_id_1` text,
  `partner_metadata` text
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
-- Table structure for table `Interest` generated from model 'interest'
--

CREATE TABLE IF NOT EXISTS `Interest` (
  `canonical_url` text,
  `id` text PRIMARY KEY,
  `key` text,
  `name` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributes` generated from model 'itemAttributes'
--

CREATE TABLE IF NOT EXISTS `ItemAttributes` (
  `ad_link` text /*Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.*/,
  `adult` boolean /*Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest.*/,
  `age_group` text /*The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.*/,
  `availability` text /*The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.*/,
  `average_review_rating` decimal /*Average reviews for the item. Can be a number from 1-5.*/,
  `brand` text /*The brand of the product.*/,
  `checkout_enabled` boolean /*This attribute is not supported anymore.*/,
  `color` text /*The primary color of the product.*/,
  `condition` text /*The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.*/,
  `custom_label_0` text /*&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `custom_label_1` text /*&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `custom_label_2` text /*&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `custom_label_3` text /*&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `custom_label_4` text /*&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `description` text /*&lt;p&gt;&lt;&#x3D; 10000 characters&lt;/p&gt; &lt;p&gt;The description of the product.&lt;/p&gt;*/,
  `free_shipping_label` boolean /*The item is free to ship.*/,
  `free_shipping_limit` text /*The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.*/,
  `gender` text /*The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.*/,
  `google_product_category` text /*The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.*/,
  `gtin` int /*The unique universal product identifier.*/,
  `id` text PRIMARY KEY /*&lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The user-created unique ID that represents the product. Only Unicode characters are accepted.&lt;/p&gt;*/,
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
  `sale_price` text /*The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars.*/,
  `shipping` text /*Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.*/,
  `shipping_height` text /*The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.*/,
  `shipping_weight` text /*The weight of the product. Ensure there is a space between the numeric string and the metric.*/,
  `shipping_width` text /*The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.*/,
  `size` text /*The size of the product.*/,
  `size_system` text /*Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.*/,
  `size_type` text /*Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.*/,
  `tax` text /*Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.*/,
  `title` text /*&lt;p&gt;&lt;&#x3D; 500 characters&lt;/p&gt; &lt;p&gt;The name of the product.&lt;/p&gt;*/,
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
-- Table structure for table `ItemBatchRecord` generated from model 'itemBatchRecord'
-- Object describing an item batch record
--

CREATE TABLE IF NOT EXISTS `ItemBatchRecord` (
  `item_id` text /*The catalog item id in the merchant namespace*/,
  `attributes` long,
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
  `item_id` text /*The catalog item id in the merchant namespace*/,
  `attributes` long
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
  `status` long
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
-- Object describing an item record
--

CREATE TABLE IF NOT EXISTS `ItemResponse` (
  `catalog_type` long NOT NULL,
  `item_id` text /*The catalog item id in the merchant namespace*/,
  `attributes` long,
  `hotel_id` text /*The catalog hotel id in the merchant namespace*/,
);  /*Object describing an item record*/

-- --------------------------------------------------------------------------
-- Table structure for table `ItemResponsePin` generated from model 'ItemResponsePin'

CREATE TABLE IF NOT EXISTS `ItemResponsePin` (
  `itemResponse` long NOT NULL
  `pin` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemResponseItemValidationEvent` generated from model 'ItemResponseItemValidationEvent'

CREATE TABLE IF NOT EXISTS `ItemResponseItemValidationEvent` (
  `itemResponse` long NOT NULL
  `itemValidationEvent` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ItemResponse_anyOf` generated from model 'itemResponseAnyOf'
--

CREATE TABLE IF NOT EXISTS `ItemResponse_anyOf` (
  `catalog_type` long NOT NULL,
  `item_id` text /*The catalog retail item id in the merchant namespace*/,
  `attributes` long,
  `hotel_id` text /*The catalog hotel id in the merchant namespace*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ItemResponseAnyOfPin` generated from model 'ItemResponseAnyOfPin'

CREATE TABLE IF NOT EXISTS `ItemResponseAnyOfPin` (
  `itemResponseAnyOf` long NOT NULL
  `pin` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ItemResponse_anyOf_1` generated from model 'itemResponseAnyOf1'
--

CREATE TABLE IF NOT EXISTS `ItemResponse_anyOf_1` (
  `catalog_type` long NOT NULL,
  `item_id` text /*The catalog item id in the merchant namespace*/,
  `hotel_id` text /*The catalog hotel id in the merchant namespace*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ItemResponseAnyOf1ItemValidationEvent` generated from model 'ItemResponseAnyOf1ItemValidationEvent'

CREATE TABLE IF NOT EXISTS `ItemResponseAnyOf1ItemValidationEvent` (
  `itemResponseAnyOf1` long NOT NULL
  `itemValidationEvent` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ItemUpdateBatchRecord` generated from model 'itemUpdateBatchRecord'
-- Object describing an item batch record to update items
--

CREATE TABLE IF NOT EXISTS `ItemUpdateBatchRecord` (
  `item_id` text /*The catalog item id in the merchant namespace*/,
  `attributes` long,
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
  `item_id` text /*The catalog item id in the merchant namespace*/,
  `attributes` long
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
  `catalog_type` long NOT NULL,
  `country` long NOT NULL,
  `language` long NOT NULL,
  `operation` long NOT NULL,
  `catalog_id` text /*Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog*/
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
  `bid` int /*Keyword custom bid in microcurrency - null if inherited from parent ad group.*/
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
  `avg_cpc_in_micro_currency` decimal /*Average cost per click*/,
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
  `bid` int UNSIGNED /*Keyword custom bid in microcurrency - null if inherited from parent ad group.*/
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
  `bid` int /*Keyword custom bid in microcurrency - null if inherited from parent ad group.*/
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
-- Table structure for table `LeadFormCommon` generated from model 'leadFormCommon'
-- Creation fields
--

CREATE TABLE IF NOT EXISTS `LeadFormCommon` (
  `name` text /*Internal name of the lead form.*/,
  `privacy_policy_link` text /*A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.*/,
  `has_accepted_terms` boolean /*Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.*/,
  `completion_message` text /*A message for people who complete the form to let them know what happens next.*/,
  `status` long,
  `disclosure_language` text /*Additional disclosure language to be included in the lead form.*/,
);  /*Creation fields*/

-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormCommonLeadFormQuestion` generated from model 'LeadFormCommonLeadFormQuestion'

CREATE TABLE IF NOT EXISTS `LeadFormCommonLeadFormQuestion` (
  `leadFormCommon` long NOT NULL
  `leadFormQuestion` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LeadFormQuestion` generated from model 'leadFormQuestion'
--

CREATE TABLE IF NOT EXISTS `LeadFormQuestion` (
  `question_type` long,
  `custom_question_field_type` long,
  `custom_question_label` text /*Question label for a custom question.*/,
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
  `name` text /*Internal name of the lead form.*/,
  `privacy_policy_link` text /*A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.*/,
  `has_accepted_terms` boolean /*Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.*/,
  `completion_message` text /*A message for people who complete the form to let them know what happens next.*/,
  `status` long,
  `disclosure_language` text /*Additional disclosure language to be included in the lead form.*/,
  `id` text PRIMARY KEY /*The ID of this lead form*/,
  `ad_account_id` text /*The Ad Account ID that this lead form belongs to.*/,
  `created_time` int /*Lead form creation time. Unix timestamp in seconds.*/,
  `updated_time` int /*Last update time. Unix timestamp in seconds.*/
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
-- Table structure for table `LineItem` generated from model 'lineItem'
--

CREATE TABLE IF NOT EXISTS `LineItem` (
  `product_brand` text /*Product brand. For example, \&quot;Parker\&quot;.*/,
  `product_category` text /*Product category. For example, \&quot;Shoes\&quot;.*/,
  `product_id` int /*Product ID. For example, 1414.*/,
  `product_name` text /*Product name. For example, \&quot;Parker Boots\&quot;.*/,
  `product_price` text /*Product price. For example, \&quot;99.99\&quot;.*/,
  `product_quantity` int /*Product quantity. For example, 2.*/,
  `product_variant` text /*Product variant. For example, \&quot;Red\&quot;.*/,
  `product_variant_id` text /*Product variant ID. For example, \&quot;1414-34832\&quot;.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LinkedBusiness` generated from model 'linkedBusiness'
--

CREATE TABLE IF NOT EXISTS `LinkedBusiness` (
  `username` text /*Username*/,
  `image_small_url` text /*image_small_url*/,
  `image_medium_url` text /*image_medium_url*/,
  `image_large_url` text /*image_large_url*/,
  `image_xlarge_url` text /*image_xlarge_url*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MaxPriceFilter` generated from model 'maxPriceFilter'
--

CREATE TABLE IF NOT EXISTS `MaxPriceFilter` (
  `MAX_PRICE` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `media_list_200_response` generated from model 'mediaList200Response'
--

CREATE TABLE IF NOT EXISTS `media_list_200_response` (
  `bookmark` text
); 

-- --------------------------------------------------------------------------
-- Table structure for table `MediaList200ResponseMediaUploadDetails` generated from model 'MediaList200ResponseMediaUploadDetails'

CREATE TABLE IF NOT EXISTS `MediaList200ResponseMediaUploadDetails` (
  `mediaList200Response` long NOT NULL
  `mediaUploadDetails` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MediaUpload` generated from model 'mediaUpload'
-- Media upload that has been registered but not uploaded/processed yet.
--

CREATE TABLE IF NOT EXISTS `MediaUpload` (
  `media_id` text /*Unique identifier for this media upload. Used to track status and for attaching during Pin creation.*/,
  `media_type` long,
  `upload_url` text /*The URL where you will POST your media file.*/,
  `upload_parameters` long
);  /*Media upload that has been registered but not uploaded/processed yet.*/


-- --------------------------------------------------------------------------
-- Table structure for table `MediaUpload_allOf_upload_parameters` generated from model 'mediaUploadAllOfUploadParameters'
-- The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
--

CREATE TABLE IF NOT EXISTS `MediaUpload_allOf_upload_parameters` (
  `xamzdate` text,
  `xamzsignature` text,
  `xamzsecuritytoken` text,
  `xamzalgorithm` text,
  `key` text,
  `policy` text,
  `xamzcredential` text,
  `ContentType` text
);  /*The list of parameter key/value pairs you will need to send with your POST request to upload your media file.*/


-- --------------------------------------------------------------------------
-- Table structure for table `MediaUploadDetails` generated from model 'mediaUploadDetails'
-- Media upload details
--

CREATE TABLE IF NOT EXISTS `MediaUploadDetails` (
  `media_id` text,
  `media_type` long,
  `status` long
);  /*Media upload details*/


-- --------------------------------------------------------------------------
-- Table structure for table `MediaUploadRequest` generated from model 'mediaUploadRequest'
-- Media upload request
--

CREATE TABLE IF NOT EXISTS `MediaUploadRequest` (
  `media_type` long NOT NULL
);  /*Media upload request*/


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
-- Table structure for table `OauthAccessTokenRequestCode` generated from model 'oauthAccessTokenRequestCode'
-- A request to exchange an authorization code for an access token.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenRequestCode` (
  `grant_type` text NOT NULL,
  `code` text NOT NULL,
  `redirect_uri` text NOT NULL
);  /*A request to exchange an authorization code for an access token.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OauthAccessTokenRequestRefresh` generated from model 'oauthAccessTokenRequestRefresh'
-- A request to exchange a refresh token for a new access token.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenRequestRefresh` (
  `grant_type` text NOT NULL,
  `refresh_token` text NOT NULL,
  `scope` text,
  `refresh_on` boolean /*Setting this field to &lt;code&gt;true&lt;/code&gt; will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \&quot;everlasting_refresh\&quot;.*/
);  /*A request to exchange a refresh token for a new access token.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OauthAccessTokenResponse` generated from model 'oauthAccessTokenResponse'
-- A successful OAuth access token response.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenResponse` (
  `access_token` text NOT NULL,
  `token_type` text NOT NULL,
  `expires_in` int NOT NULL,
  `scope` text NOT NULL,
  `response_type` text
);  /*A successful OAuth access token response.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OauthAccessTokenResponseCode` generated from model 'oauthAccessTokenResponseCode'
-- A successful OAuth access token response for the authorization code flow.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenResponseCode` (
  `access_token` text NOT NULL,
  `token_type` text NOT NULL,
  `expires_in` int NOT NULL,
  `scope` text NOT NULL,
  `refresh_token` text NOT NULL,
  `refresh_token_expires_in` int NOT NULL,
  `response_type` text
);  /*A successful OAuth access token response for the authorization code flow.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OauthAccessTokenResponseEverlastingRefresh` generated from model 'oauthAccessTokenResponseEverlastingRefresh'
-- A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenResponseEverlastingRefresh` (
  `access_token` text NOT NULL,
  `token_type` text NOT NULL,
  `expires_in` int NOT NULL,
  `scope` text NOT NULL,
  `refresh_token` text NOT NULL,
  `refresh_token_expires_in` int NOT NULL,
  `refresh_token_expires_at` int NOT NULL,
  `response_type` text
);  /*A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OauthAccessTokenResponseIntegrationRefresh` generated from model 'oauthAccessTokenResponseIntegrationRefresh'
-- A successful OAuth access token response for the refresh token flow, with an added refresh token.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenResponseIntegrationRefresh` (
  `access_token` text NOT NULL,
  `token_type` text NOT NULL,
  `expires_in` int NOT NULL,
  `scope` text NOT NULL,
  `refresh_token` text NOT NULL,
  `refresh_token_expires_in` int NOT NULL,
  `response_type` text
);  /*A successful OAuth access token response for the refresh token flow, with an added refresh token.*/


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
  `is_roas_optimized` boolean /*Ad group is ROAS optimized*/,
  `learning_mode_type` text /*Conversion learning model type*/
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
  `frequency` int,
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
  `id` text PRIMARY KEY /*Order line ID.*/,
  `type` text /*Always \&quot;orderline\&quot;.*/,
  `ad_account_id` text /*Ad account ID.*/,
  `purchase_order_id` text /*Purchase order ID.*/,
  `start_time` decimal /*Start time. Unix timestamp.*/,
  `end_time` decimal /*End time. Unix timestamp.*/,
  `budget` decimal /*Order line budget in micro currency.*/,
  `paid_budget` decimal /*Order line paid budget in micro currency.*/,
  `status` long /*Order line status.*/,
  `name` text /*Order line name.*/,
  `paid_type` long /*Order line paid type.*/
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
  `id` text PRIMARY KEY /*Order line ID.*/,
  `type` text /*Always \&quot;orderline\&quot;.*/,
  `ad_account_id` text /*Ad account ID.*/,
  `purchase_order_id` text /*Purchase order ID.*/,
  `start_time` decimal /*Start time. Unix timestamp.*/,
  `end_time` decimal /*End time. Unix timestamp.*/,
  `budget` decimal /*Order line budget in micro currency.*/,
  `paid_budget` decimal /*Order line paid budget in micro currency.*/,
  `status` long /*Order line status.*/,
  `name` text /*Order line name.*/,
  `paid_type` long /*Order line paid type.*/
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
-- Pin
--

CREATE TABLE IF NOT EXISTS `Pin` (
  `id` text PRIMARY KEY,
  `created_at` datetime,
  `link` text,
  `title` text,
  `description` text,
  `dominant_color` text /*Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;.*/,
  `alt_text` text,
  `creative_type` long,
  `board_id` text /*The board to which this Pin belongs.*/,
  `board_section_id` text /*The board section to which this Pin belongs.*/,
  `board_owner` long,
  `is_owner` boolean /*Whether the \&quot;operation user_account\&quot; is the Pin owner.*/,
  `media` long,
  `media_source` long,
  `parent_pin_id` text /*The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;.*/,
  `is_standard` boolean /*Whether the Pin is standard or not. See documentation on &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/content/update/\&quot;&gt;Changes to Pin creation&lt;/a&gt; for more information.*/,
  `has_been_promoted` boolean /*Whether the Pin has been promoted or not.*/,
  `note` text /*Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;.*/,
  `pin_metrics` blob /*Pin metrics with associated time intervals if any.*/
);  /*Pin*/


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
-- Pin
--

CREATE TABLE IF NOT EXISTS `PinCreate` (
  `id` text PRIMARY KEY,
  `created_at` datetime,
  `link` text,
  `title` text,
  `description` text,
  `dominant_color` text /*Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;.*/,
  `alt_text` text,
  `board_id` text /*The board to which this Pin belongs.*/,
  `board_section_id` text /*The board section to which this Pin belongs.*/,
  `board_owner` long,
  `media` long,
  `media_source` long,
  `parent_pin_id` text /*The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;.*/,
  `note` text /*Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;.*/
);  /*Pin*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinMedia` generated from model 'pinMedia'
-- Pin media objects.
--

CREATE TABLE IF NOT EXISTS `PinMedia` (
  `media_type` text
);  /*Pin media objects.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaMetadata` generated from model 'pinMediaMetadata'
--

CREATE TABLE IF NOT EXISTS `PinMediaMetadata` (
  `item_type` text,
  `title` text,
  `description` text,
  `link` text,
  `images` long,
  `cover_image_url` text,
  `video_url` text /*Video url (720p). &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is limited and not available to all apps.*/,
  `duration` decimal /*Duration (in milliseconds)*/,
  `height` int /*Height (in pixels)*/,
  `width` int /*Width (in pixels)*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSource` generated from model 'pinMediaSource'
-- Pin media source.
--

CREATE TABLE IF NOT EXISTS `PinMediaSource` (
  `source_type` text NOT NULL,
  `content_type` text NOT NULL,
  `data` text NOT NULL,
  `url` text NOT NULL,
  `media_id` text NOT NULL,
  `is_standard` boolean /*Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.*/,
  `cover_image_url` text /*Cover image url.*/,
  `cover_image_content_type` text /*Content type for cover image Base64.*/,
  `cover_image_data` text /*Cover image Base64.*/,
  `index` int UNSIGNED,
  `is_affiliate_link` boolean /*This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.*/
);  /*Pin media source.*/

-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSourcePinMediaSourceImagesURLItemsInner` generated from model 'PinMediaSourcePinMediaSourceImagesURLItemsInner'

CREATE TABLE IF NOT EXISTS `PinMediaSourcePinMediaSourceImagesURLItemsInner` (
  `pinMediaSource` long NOT NULL
  `pinMediaSourceImagesURLItemsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSourceImageBase64` generated from model 'pinMediaSourceImageBase64'
-- Base64-encoded image media source
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImageBase64` (
  `source_type` text NOT NULL,
  `content_type` text NOT NULL,
  `data` text NOT NULL,
  `is_standard` boolean /*Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.*/
);  /*Base64-encoded image media source*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSourceImageURL` generated from model 'pinMediaSourceImageURL'
-- Image URL-based media source
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImageURL` (
  `source_type` text NOT NULL,
  `url` text NOT NULL,
  `is_standard` boolean /*Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.*/
);  /*Image URL-based media source*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSourceImagesBase64` generated from model 'pinMediaSourceImagesBase64'
-- Multiple Base64-encoded images media source
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImagesBase64` (
  `source_type` text,
  `index` int UNSIGNED
);  /*Multiple Base64-encoded images media source*/

-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSourceImagesBase64PinMediaSourceImagesBase64ItemsInner` generated from model 'PinMediaSourceImagesBase64PinMediaSourceImagesBase64ItemsInner'

CREATE TABLE IF NOT EXISTS `PinMediaSourceImagesBase64PinMediaSourceImagesBase64ItemsInner` (
  `pinMediaSourceImagesBase64` long NOT NULL
  `pinMediaSourceImagesBase64ItemsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSourceImagesBase64_items_inner` generated from model 'pinMediaSourceImagesBase64ItemsInner'
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImagesBase64_items_inner` (
  `content_type` text NOT NULL,
  `data` text NOT NULL /*Image to upload as base64 string.*/,
  `title` text,
  `description` text,
  `link` text /*Destination link for the image.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSourceImagesURL` generated from model 'pinMediaSourceImagesURL'
-- Multiple images urls-based media source
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImagesURL` (
  `source_type` text,
  `index` int UNSIGNED
);  /*Multiple images urls-based media source*/

-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSourceImagesURLPinMediaSourceImagesURLItemsInner` generated from model 'PinMediaSourceImagesURLPinMediaSourceImagesURLItemsInner'

CREATE TABLE IF NOT EXISTS `PinMediaSourceImagesURLPinMediaSourceImagesURLItemsInner` (
  `pinMediaSourceImagesURL` long NOT NULL
  `pinMediaSourceImagesURLItemsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSourceImagesURL_items_inner` generated from model 'pinMediaSourceImagesURLItemsInner'
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImagesURL_items_inner` (
  `url` text NOT NULL /*URL of image to upload.*/,
  `title` text,
  `description` text,
  `link` text /*Destination link for the image.*/
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
-- Video ID-based media source
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceVideoID` (
  `source_type` text NOT NULL,
  `media_id` text NOT NULL,
  `cover_image_url` text /*Cover image url.*/,
  `cover_image_content_type` text /*Content type for cover image Base64.*/,
  `cover_image_data` text /*Cover image Base64.*/,
  `is_standard` boolean /*Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.*/
);  /*Video ID-based media source*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaWithImage` generated from model 'pinMediaWithImage'
-- Pin with image.
--

CREATE TABLE IF NOT EXISTS `PinMediaWithImage` (
  `media_type` text,
  `images` long
);  /*Pin with image.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaWithImageAndVideo` generated from model 'pinMediaWithImageAndVideo'
-- Pin with a mix of images and videos.
--

CREATE TABLE IF NOT EXISTS `PinMediaWithImageAndVideo` (
  `media_type` text,
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
  `media_type` text,
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
  `media_type` text,
  `images` long,
  `cover_image_url` text,
  `video_url` text /*Video url (720p). &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is limited and not available to all apps.*/,
  `duration` decimal /*Duration (in milliseconds)*/,
  `height` int /*Height (in pixels)*/,
  `width` int /*Width (in pixels)*/
);  /*Pin with video.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaWithVideos` generated from model 'pinMediaWithVideos'
-- Pin with multiple videos.
--

CREATE TABLE IF NOT EXISTS `PinMediaWithVideos` (
  `media_type` text,
);  /*Pin with multiple videos.*/

-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaWithVideosVideoMetadata` generated from model 'PinMediaWithVideosVideoMetadata'

CREATE TABLE IF NOT EXISTS `PinMediaWithVideosVideoMetadata` (
  `pinMediaWithVideos` long NOT NULL
  `videoMetadata` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PinUpdate` generated from model 'pinUpdate'
-- Pin fields for updates
--

CREATE TABLE IF NOT EXISTS `PinUpdate` (
  `alt_text` text /*Pin&#39;s alternative text.*/,
  `board_id` text /*The id of the board to move the Pin onto.*/,
  `board_section_id` text /*&lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/create-a-board-section\&quot;&gt;Board section&lt;/a&gt; ID.*/,
  `description` text /*Pin description - 800 characters maximum.*/,
  `link` text /*URL viewer is taken to when they click pin.*/,
  `title` text /*The native pin title that creators explicitly prefer to display.*/,
  `note` text /*Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;.*/
);  /*Pin fields for updates*/

-- --------------------------------------------------------------------------
-- Table structure for table `PinUpdatePinUpdateCarouselSlotsInner` generated from model 'PinUpdatePinUpdateCarouselSlotsInner'

CREATE TABLE IF NOT EXISTS `PinUpdatePinUpdateCarouselSlotsInner` (
  `pinUpdate` long NOT NULL
  `pinUpdateCarouselSlotsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PinUpdate_carousel_slots_inner` generated from model 'pinUpdateCarouselSlotsInner'
--

CREATE TABLE IF NOT EXISTS `PinUpdate_carousel_slots_inner` (
  `title` text /*Carousel Pin slot title.*/,
  `description` text /*Carousel Pin slot description.*/,
  `link` text /*Carousel Pin slot link.*/
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
-- Table structure for table `PinterestTagEventData` generated from model 'pinterestTagEventData'
-- Optional for VISITOR &#x60;audience_type&#x60;. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’s &#x60;rule&#x60;; however, you **must** specify an &#x60;event&#x60; for the &#x60;event_data&#x60; fields to be evaluated. Besides what’s listed, you can also create your own set of &#x60;event_data&#x60; fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields&#39; data.&lt;br&gt;Examples per &#x60;event&#x60; type:&lt;br&gt;&#x60;pagevisit&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;page_name\&quot;: \&quot;My online store 123 | view items | shoe\&quot; }&lt;br&gt;&#x60;signup&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;New release promotion\&quot; }&lt;br&gt;&#x60;checkout&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 116, \&quot;order_quantity\&quot;: 2, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Pillows (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;11\&quot;, \&quot;product_price\&quot;: 48, \&quot;product_quantity\&quot;: 1 }, { \&quot;product_name\&quot;: \&quot;Pillows, Large (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;15\&quot;, \&quot;product_price\&quot;: 68, \&quot;product_quantity\&quot;: 1 } ] }&lt;br&gt;&#x60;addtocart&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 499, \&quot;order_quantity\&quot;: 1, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Red leather boots\&quot;, \&quot;product_id\&quot;: \&quot;3486\&quot;, \&quot;product_category\&quot;: \&quot;shoe\&quot;, \&quot;product_variant_id\&quot;: \&quot;JB11103000\&quot;, \&quot;product_price\&quot;: 499, \&quot;product_quantity\&quot;: \&quot;1\&quot;, \&quot;product_brand\&quot;: \&quot;My brand\&quot; }]}&lt;br&gt;&#x60;watchvideo&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;video_title\&quot;: \&quot;My Product Video 01\&quot; }&lt;br&gt;&#x60;lead&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;Newsletter\&quot; }
--

CREATE TABLE IF NOT EXISTS `PinterestTagEventData` (
  `currency` long,
  `lead_type` text /*Promotion code. For example, \&quot;Newsletter\&quot;.*/,
  `line_items` long,
  `order_id` text /*Order ID. For example, \&quot;X-151481\&quot;.*/,
  `order_quantity` int /*Order quantity. For example, 1.*/,
  `page_name` text /*Page name. For example, \&quot;Our Favorite Pins on Pinterest\&quot;.*/,
  `promo_code` text /*Promotion code. For example, \&quot;WINTER10\&quot;.*/,
  `property` text /*Property. For example, \&quot;Athleta\&quot;.*/,
  `search_query` text /*Search query string. For example, \&quot;boots\&quot;.*/,
  `value` text /*Product value. For example, \&quot;199.98\&quot;*/,
  `video_title` text /*Video title. For example, \&quot;How to style your Parker Boots\&quot;.*/
);  /*Optional for VISITOR &#x60;audience_type&#x60;. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’s &#x60;rule&#x60;; however, you **must** specify an &#x60;event&#x60; for the &#x60;event_data&#x60; fields to be evaluated. Besides what’s listed, you can also create your own set of &#x60;event_data&#x60; fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields&#39; data.&lt;br&gt;Examples per &#x60;event&#x60; type:&lt;br&gt;&#x60;pagevisit&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;page_name\&quot;: \&quot;My online store 123 | view items | shoe\&quot; }&lt;br&gt;&#x60;signup&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;New release promotion\&quot; }&lt;br&gt;&#x60;checkout&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 116, \&quot;order_quantity\&quot;: 2, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Pillows (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;11\&quot;, \&quot;product_price\&quot;: 48, \&quot;product_quantity\&quot;: 1 }, { \&quot;product_name\&quot;: \&quot;Pillows, Large (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;15\&quot;, \&quot;product_price\&quot;: 68, \&quot;product_quantity\&quot;: 1 } ] }&lt;br&gt;&#x60;addtocart&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 499, \&quot;order_quantity\&quot;: 1, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Red leather boots\&quot;, \&quot;product_id\&quot;: \&quot;3486\&quot;, \&quot;product_category\&quot;: \&quot;shoe\&quot;, \&quot;product_variant_id\&quot;: \&quot;JB11103000\&quot;, \&quot;product_price\&quot;: 499, \&quot;product_quantity\&quot;: \&quot;1\&quot;, \&quot;product_brand\&quot;: \&quot;My brand\&quot; }]}&lt;br&gt;&#x60;watchvideo&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;video_title\&quot;: \&quot;My Product Video 01\&quot; }&lt;br&gt;&#x60;lead&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;Newsletter\&quot; }*/


-- --------------------------------------------------------------------------
-- Table structure for table `PriceFilter` generated from model 'priceFilter'
--

CREATE TABLE IF NOT EXISTS `PriceFilter` (
  `PRICE` long NOT NULL
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
  `id` text PRIMARY KEY /*ID of the product group promotion.*/,
  `ad_group_id` text /*ID of the ad group the product group belongs to.*/,
  `bid_in_micro_currency` int /*The bid in micro currency.*/,
  `included` boolean /*True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.*/,
  `definition` text /*The full product group definition path*/,
  `relative_definition` text /*The definition of the product group, relative to its parent - an attribute name/value pair*/,
  `parent_id` text /*The parent Product Group ID of this Product Group*/,
  `slideshow_collections_title` text /*Slideshow Collections Title*/,
  `slideshow_collections_description` text /*Slideshow Collections Description*/,
  `is_mdl` boolean /*If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog*/,
  `status` long,
  `tracking_url` text /*Tracking template for proudct group promotions. 4000 limit*/,
  `catalog_product_group_id` text /*ID of the catalogs product group that this product group promotion references*/,
  `catalog_product_group_name` text /*Catalogs product group name*/,
  `creative_type` long,
  `collections_hero_pin_id` text /*Hero Pin ID if this PG is promoted as a Collection*/,
  `collections_hero_destination_url` text /*Collections Hero Destination Url*/,
  `grid_click_type` long
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
-- Table structure for table `ProductGroupPromotionsList200ResponseProductGroupPromotionResponseItem` generated from model 'ProductGroupPromotionsList200ResponseProductGroupPromotionResponseItem'

CREATE TABLE IF NOT EXISTS `ProductGroupPromotionsList200ResponseProductGroupPromotionResponseItem` (
  `productGroupPromotionsList200Response` long NOT NULL
  `productGroupPromotionResponseItem` long NOT NULL
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
-- Table structure for table `QuizPinData` generated from model 'quizPinData'
-- This field includes all quiz data including questions, options, and results.
--

CREATE TABLE IF NOT EXISTS `QuizPinData` (
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
  `question_text` text,
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
  `organic_pin_id` text,
  `android_deep_link` text,
  `ios_deep_link` text,
  `destination_url` text,
  `result_id` decimal
);  /*The result, and link out, based on the user’s choice.*/


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
  `term` text,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `RelatedTermsRelatedTermsListInnerRelatedTerms` generated from model 'RelatedTermsRelatedTermsListInnerRelatedTerms'

CREATE TABLE IF NOT EXISTS `RelatedTermsRelatedTermsListInnerRelatedTerms` (
  `relatedTermsRelatedTermsListInner` long NOT NULL
  `relatedTerms` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOAccountAddress` generated from model 'ssIOAccountAddress'
--

CREATE TABLE IF NOT EXISTS `SSIOAccountAddress` (
  `display` text /*Address display*/,
  `purpose` text /*Purpose for which the address is used, usually Billing or Businness*/,
  `address_id` text /*Salesforce id for address*/,
  `order_legal_entity` text /*Legal entity for this insertion order*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOAccountItem` generated from model 'ssIOAccountItem'
--

CREATE TABLE IF NOT EXISTS `SSIOAccountItem` (
  `id` text PRIMARY KEY /*Salesforce id for billto_info*/,
  `io_terms_id` text /*Salesforce id for IO Terms and Conditions*/,
  `io_terms` text /*Salesforce text for IO Terms and Conditions*/,
  `us_terms_id` text /*Salesforce id for US Terms and Conditions*/,
  `us_terms` text /*Salesforce text for US Terms and Conditions*/,
  `row_terms_id` text /*Salesforce id for Rest of the World Terms and Conditions*/,
  `row_terms` text /*Salesforce text for Rest of the World Terms and Conditions*/,
  `io_type` text /*Insertion Order Type - Pinterest Paper or Agency Paper*/,
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
  `name` text /*Display name*/,
  `id` text PRIMARY KEY /*Salesforce id for PMP*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOAccountResponse` generated from model 'ssIOAccountResponse'
--

CREATE TABLE IF NOT EXISTS `SSIOAccountResponse` (
  `eligible` boolean /*Advertiser eligible to create order lines*/,
  `can_edit` boolean /*Advertiser eligible to update order lines*/,
  `currency` text,
  `error` text /*Error indicator from Salesforce which could be \&quot;No Error\&quot;*/
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
  `start_date` text NOT NULL /*Starting date of time period. Format: YYYY-MM-DD*/,
  `po_number` text NOT NULL /*The po number*/,
  `billing_contact_firstname` text NOT NULL /*The billing contact first name*/,
  `billing_contact_lastname` text NOT NULL /*The billing contact last name*/,
  `billing_contact_email` text NOT NULL /*The billing contact email*/,
  `media_contact_firstname` text NOT NULL /*The media contact first name*/,
  `media_contact_lastname` text NOT NULL /*The media contact last name*/,
  `media_contact_email` text NOT NULL /*The media contact email*/,
  `pmp_id` text NOT NULL /*The pmp id*/,
  `order_name` text NOT NULL /*The order name*/,
  `order_line_type` text NOT NULL /*Type can be Budget or Perpetual*/,
  `accepted_terms_id` text NOT NULL /*The SFDC id for the terms*/,
  `billto_company_id` text NOT NULL /*The bill-to company id*/,
  `billto_business_address_id` text NOT NULL /*The bill-to business address id*/,
  `billto_billing_address_id` text NOT NULL /*The bill-to billing address id*/,
  `currency_info` long NOT NULL,
  `end_date` text /*End date of time period. Format: YYYY-MM-DD*/,
  `budget_amount` decimal /*If Budget order line, the budget amount.*/,
  `agency_link` text /*URL link for agency*/,
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
  `start_date` text /*Starting date of time period. Format: YYYY-MM-DD*/,
  `end_date` text /*End date of time period. Format: YYYY-MM-DD*/,
  `po_number` text /*The po number*/,
  `budget_amount` decimal /*If Budget order line, the budget amount.*/,
  `billing_contact_firstname` text /*The billing contact first name*/,
  `billing_contact_lastname` text /*The billing contact last name*/,
  `billing_contact_email` text /*The billing contact email*/,
  `media_contact_firstname` text /*The media contact first name*/,
  `media_contact_lastname` text /*The media contact last name*/,
  `media_contact_email` text /*The media contact email*/,
  `agency_link` text /*URL link for agency*/,
  `user_email` text /*The email of user submitting the insertion order*/,
  `oracle_line_id` text /*LineId in the Oracle DB*/,
  `salesforce_order_id` text /*OrderId in SFDC*/,
  `salesforce_order_line_id` text /*OrderLineId in SFDC*/,
  `ads_manager_order_line_id` text /*Ads manager OrderLineId*/
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
  `start_date` text /*Starting date of time period. Format: YYYY-MM-DD*/,
  `end_date` text /*End date of time period. Format: YYYY-MM-DD*/,
  `po_number` text /*The po number*/,
  `budget_amount` decimal /*If Budget order line, the budget amount.*/,
  `billing_contact_firstname` text /*The billing contact first name*/,
  `billing_contact_lastname` text /*The billing contact last name*/,
  `billing_contact_email` text /*The billing contact email*/,
  `media_contact_firstname` text /*The media contact first name*/,
  `media_contact_lastname` text /*The media contact last name*/,
  `media_contact_email` text /*The media contact email*/,
  `agency_link` text /*URL link for agency*/,
  `user_email` text /*The email of user submitting the insertion order*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOInsertionOrderStatus` generated from model 'ssIOInsertionOrderStatus'
--

CREATE TABLE IF NOT EXISTS `SSIOInsertionOrderStatus` (
  `pin_order_id` text /*Salesforce order id*/,
  `status` text /*Salesforce insertion order status*/,
  `creation_time` text /*Salesforce insertion order creation time*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOInsertionOrderStatusResponse` generated from model 'ssIOInsertionOrderStatusResponse'
--

CREATE TABLE IF NOT EXISTS `SSIOInsertionOrderStatusResponse` (
  `pin_order_id` text /*Salesforce order id*/,
  `status` text /*Salesforce insertion order status*/,
  `creation_time` text /*Salesforce insertion order creation time*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SSIOOrderLine` generated from model 'ssIOOrderLine'
--

CREATE TABLE IF NOT EXISTS `SSIOOrderLine` (
  `salesforce_order_line_id` text /*OrderLineId in SFDC*/,
  `ads_manager_order_line_id` text /*Ads manager OrderLineId*/,
  `pin_order_id` text /*The pin order id associated with the order line in SFDC*/,
  `last_modified_date_time` text /*Last modified date.*/,
  `start_date` date /*Start date of the order line.*/,
  `end_date` date /*End date of the order line.*/,
  `bill_to_company_name` text /*Bill To Company name*/,
  `billing_contact_firstname` text /*Billing contact first name*/,
  `billing_contact_lastname` text /*Billing contact last name*/,
  `billing_contact_email` text /*Billing contact email*/,
  `media_contact_email` text /*Billing media email*/,
  `media_contact_firstname` text /*Billing contact first name*/,
  `media_contact_lastname` text /*Billing contact first name*/,
  `currency_info` long,
  `agency_link` text /*Agency link*/,
  `po_number` text /*The po number*/,
  `order_name` text /*The order name*/,
  `pmp_name` text /*The Pinterest marketing partner name*/,
  `accepted_terms_id` text /*The SFDC id for the terms*/,
  `accepted_terms_time` text /*The UTC timestamp (to the nearest sec) of when terms were accepted*/,
  `budget_amount` decimal /*If Budget order line, the budget amount.*/,
  `estimated_monthly_spend` decimal /*If Ongoing (perpetual) order line, the estimated monthly spend*/
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
-- Table structure for table `SingleInterestTargetingOptionResponse` generated from model 'singleInterestTargetingOptionResponse'
--

CREATE TABLE IF NOT EXISTS `SingleInterestTargetingOptionResponse` (
  `id` text PRIMARY KEY,
  `name` text,
  `level` int
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
  `media` long,
  `alt_text` text,
  `link` text,
  `title` text,
  `description` text
);  /*Summarized pin information*/


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpec` generated from model 'targetingSpec'
-- Ad group targeting specification defining the ad group target audience. For example, {\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}
--

CREATE TABLE IF NOT EXISTS `TargetingSpec` (
);  /*Ad group targeting specification defining the ad group target audience. For example, {\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}*/

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecAGEBUCKET` generated from model 'TargetingSpecAGEBUCKET'

CREATE TABLE IF NOT EXISTS `TargetingSpecAGEBUCKET` (
  `targetingSpec` long NOT NULL
  `aGEBUCKET` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecAPPTYPE` generated from model 'TargetingSpecAPPTYPE'

CREATE TABLE IF NOT EXISTS `TargetingSpecAPPTYPE` (
  `targetingSpec` long NOT NULL
  `aPPTYPE` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecAUDIENCEEXCLUDE` generated from model 'TargetingSpecAUDIENCEEXCLUDE'

CREATE TABLE IF NOT EXISTS `TargetingSpecAUDIENCEEXCLUDE` (
  `targetingSpec` long NOT NULL
  `aUDIENCEEXCLUDE` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecAuDIENCEINCLUDEQuote` generated from model 'TargetingSpecAuDIENCEINCLUDEQuote'

CREATE TABLE IF NOT EXISTS `TargetingSpecAuDIENCEINCLUDEQuote` (
  `targetingSpec` long NOT NULL
  `auDIENCEINCLUDEQuote` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecGENDER` generated from model 'TargetingSpecGENDER'

CREATE TABLE IF NOT EXISTS `TargetingSpecGENDER` (
  `targetingSpec` long NOT NULL
  `gENDER` text NOT NULL
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
-- Table structure for table `TargetingSpecTargetingSpecSHOPPINGRETARGETING` generated from model 'TargetingSpecTargetingSpecSHOPPINGRETARGETING'

CREATE TABLE IF NOT EXISTS `TargetingSpecTargetingSpecSHOPPINGRETARGETING` (
  `targetingSpec` long NOT NULL
  `targetingSpecSHOPPINGRETARGETING` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecTARGETINGSTRATEGY` generated from model 'TargetingSpecTARGETINGSTRATEGY'

CREATE TABLE IF NOT EXISTS `TargetingSpecTARGETINGSTRATEGY` (
  `targetingSpec` long NOT NULL
  `tARGETINGSTRATEGY` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpec_SHOPPING_RETARGETING` generated from model 'targetingSpecSHOPPINGRETARGETING'
--

CREATE TABLE IF NOT EXISTS `TargetingSpec_SHOPPING_RETARGETING` (
  `lookback_window` int /*Number of days ago to start lookback timeframe for dynamic retargeting*/,
  `exclusion_window` int /*Number of days ago to stop lookback timeframe for dynamic retargeting*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingSpecSHOPPINGRETARGETINGTagTypes` generated from model 'TargetingSpecSHOPPINGRETARGETINGTagTypes'

CREATE TABLE IF NOT EXISTS `TargetingSpecSHOPPINGRETARGETINGTagTypes` (
  `targetingSpecSHOPPINGRETARGETING` long NOT NULL
  `tagTypes` int NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TargetingTypeFilter` generated from model 'targetingTypeFilter'
--

CREATE TABLE IF NOT EXISTS `TargetingTypeFilter` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TargetingTypeFilterAdsAnalyticsTargetingType` generated from model 'TargetingTypeFilterAdsAnalyticsTargetingType'

CREATE TABLE IF NOT EXISTS `TargetingTypeFilterAdsAnalyticsTargetingType` (
  `targetingTypeFilter` long NOT NULL
  `adsAnalyticsTargetingType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TemplateResponse` generated from model 'templateResponse'
-- Template fields
--

CREATE TABLE IF NOT EXISTS `TemplateResponse` (
  `id` text PRIMARY KEY /*Template ID*/,
  `ad_account_id` text /*ID of the Ad Account that owns the template*/,
  `user_id` text /*ID of the user who created the template*/,
  `name` text /*Template Name*/,
  `report_start_relative_days_in_past` decimal /*The number of days prior to the day the report will be delivered at which the report will start*/,
  `report_end_relative_days_in_past` decimal /*The number of days prior to the day the report will be delivered at which the report will end*/,
  `date_range` long,
  `report_level` long,
  `report_format` long,
  `granularity` long,
  `view_window_days` decimal /*The length of the sliding window over which view conversions will be attributed*/,
  `click_window_days` decimal /*The length of the sliding window over which click conversions will be attributed*/,
  `engagement_window_days` decimal /*The length of the sliding window over which engagement conversions will be attributed*/,
  `conversion_report_time_type` text /*Conversion report time type*/,
  `filters_json` text /*A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:&lt;br&gt; \&quot;field\&quot;: The column name&lt;br&gt; \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]&lt;br&gt; \&quot;value\&quot;: A single value or a list of values*/,
  `is_owned_by_user` boolean /*A boolean value that indicates if the user owns the template*/,
  `is_scheduled` boolean /*A boolean value that indicates if this template has been used to create a scheduled report*/,
  `creation_source` text /*The surface used to create this template*/,
  `is_deleted` boolean /*A boolean that indicates if the template has been deleted*/,
  `updated_time` decimal /*Time of last update in seconds since Unix epoch*/,
  `type` text /*Reporting template type*/,
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
  `dynamic_date_range` long,
  `relative_date_range` long,
  `absolute_date_range` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TemplateResponse_date_range_absolute_date_range` generated from model 'templateResponseDateRangeAbsoluteDateRange'
-- The absolute date range of the template
--

CREATE TABLE IF NOT EXISTS `TemplateResponse_date_range_absolute_date_range` (
  `type` text /*The date range type*/,
  `start_date` decimal /*The start date of the date range*/,
  `end_date` decimal /*The end date of the date range*/
);  /*The absolute date range of the template*/


-- --------------------------------------------------------------------------
-- Table structure for table `TemplateResponse_date_range_dynamic_date_range` generated from model 'templateResponseDateRangeDynamicDateRange'
-- The dynamic date range of the template
--

CREATE TABLE IF NOT EXISTS `TemplateResponse_date_range_dynamic_date_range` (
  `type` text /*The date range type*/,
  `range` text /*The dynamic range type*/
);  /*The dynamic date range of the template*/


-- --------------------------------------------------------------------------
-- Table structure for table `TemplateResponse_date_range_relative_date_range` generated from model 'templateResponseDateRangeRelativeDateRange'
-- The relative date range of the template
--

CREATE TABLE IF NOT EXISTS `TemplateResponse_date_range_relative_date_range` (
  `type` text /*The date range type*/,
  `start_days_in_past` decimal /*The start date of the date range*/,
  `end_days_in_past` decimal /*The end date of the date range*/
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
  `id` text PRIMARY KEY /*The ID of the terms of service*/,
  `html` text /*The terms of service content*/,
  `has_accepted` boolean /*Whether the ad account has accepted terms of service.*/,
  `ad_account_id` text /*The ID of the ad account.*/
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
  `latest_available_timestamp` decimal,
  `is_realtime` boolean
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TopPinsAnalyticsResponse_pins_inner` generated from model 'topPinsAnalyticsResponsePinsInner'
-- Array with metrics, status, and pin id for the requested metric
--

CREATE TABLE IF NOT EXISTS `TopPinsAnalyticsResponse_pins_inner` (
  `metrics` blob /*The metric name and daily value for each requested metric*/,
  `data_status` blob,
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
  `metrics` blob /*The metric name and daily value for each requested metric*/,
  `data_status` blob,
  `pin_id` text /*The pin id*/
);  /*Array with metrics, status, and pin id for the requested metric*/


-- --------------------------------------------------------------------------
-- Table structure for table `TrackingUrls` generated from model 'trackingUrls'
-- Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
--

CREATE TABLE IF NOT EXISTS `TrackingUrls` (
);  /*Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.*/

-- --------------------------------------------------------------------------
-- Table structure for table `TrackingUrlsImpression` generated from model 'TrackingUrlsImpression'

CREATE TABLE IF NOT EXISTS `TrackingUrlsImpression` (
  `trackingUrls` long NOT NULL
  `impression` text NOT NULL
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
-- Table structure for table `TrackingUrlsBuyableButton` generated from model 'TrackingUrlsBuyableButton'

CREATE TABLE IF NOT EXISTS `TrackingUrlsBuyableButton` (
  `trackingUrls` long NOT NULL
  `buyableButton` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TrackingUrlsAudienceVerification` generated from model 'TrackingUrlsAudienceVerification'

CREATE TABLE IF NOT EXISTS `TrackingUrlsAudienceVerification` (
  `trackingUrls` long NOT NULL
  `audienceVerification` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TrendingKeywordsResponse` generated from model 'trendingKeywordsResponse'
--

CREATE TABLE IF NOT EXISTS `TrendingKeywordsResponse` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TrendingKeywordsResponseTrendingKeywordsResponseTrendsInner` generated from model 'TrendingKeywordsResponseTrendingKeywordsResponseTrendsInner'

CREATE TABLE IF NOT EXISTS `TrendingKeywordsResponseTrendingKeywordsResponseTrendsInner` (
  `trendingKeywordsResponse` long NOT NULL
  `trendingKeywordsResponseTrendsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TrendingKeywordsResponse_trends_inner` generated from model 'trendingKeywordsResponseTrendsInner'
--

CREATE TABLE IF NOT EXISTS `TrendingKeywordsResponse_trends_inner` (
  `keyword` text /*The keyword that is trending.*/,
  `pct_growth_wow` int /*The week-over-week percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;50\&quot; would represent a 50% increase in searches in the last seven days compared to the week prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% week-over-week growth.*/,
  `pct_growth_mom` int /*The month-over-month percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;400\&quot; would represent a 400% increase in searches in the last 30 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% month-over-month growth.*/,
  `pct_growth_yoy` int /*The year-over-year percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;-5\&quot; would represent a 5% decrease in searches in the last 365 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% year-over-year growth.*/,
  `time_series` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TrendingKeywordsResponse_trends_inner_time_series` generated from model 'trendingKeywordsResponseTrendsInnerTimeSeries'
-- A sequence of weekly observations of the relative search volume for this keyword over the past year.&lt;br /&gt; These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the &#x60;normalize_against_group&#x60; query parameter can be used in cases where you wish to compare relative volume between keywords.&lt;br /&gt; **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week.  For example, a value of &#x60;2023-10-31&#x60; would include searches that happened between &#x60;2023-10-25&#x60; and &#x60;2023-10-31&#x60;.
--

CREATE TABLE IF NOT EXISTS `TrendingKeywordsResponse_trends_inner_time_series` (
  `date` date
);  /*A sequence of weekly observations of the relative search volume for this keyword over the past year.&lt;br /&gt; These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the &#x60;normalize_against_group&#x60; query parameter can be used in cases where you wish to compare relative volume between keywords.&lt;br /&gt; **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week.  For example, a value of &#x60;2023-10-31&#x60; would include searches that happened between &#x60;2023-10-25&#x60; and &#x60;2023-10-31&#x60;.*/


-- --------------------------------------------------------------------------
-- Table structure for table `UpdatableItemAttributes` generated from model 'updatableItemAttributes'
--

CREATE TABLE IF NOT EXISTS `UpdatableItemAttributes` (
  `ad_link` text /*Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.*/,
  `adult` boolean /*Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest.*/,
  `age_group` text /*The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.*/,
  `availability` text /*The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.*/,
  `average_review_rating` decimal /*Average reviews for the item. Can be a number from 1-5.*/,
  `brand` text /*The brand of the product.*/,
  `checkout_enabled` boolean /*This attribute is not supported anymore.*/,
  `color` text /*The primary color of the product.*/,
  `condition` text /*The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.*/,
  `custom_label_0` text /*&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `custom_label_1` text /*&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `custom_label_2` text /*&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `custom_label_3` text /*&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `custom_label_4` text /*&lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;*/,
  `description` text /*&lt;p&gt;&lt;&#x3D; 10000 characters&lt;/p&gt; &lt;p&gt;The description of the product.&lt;/p&gt;*/,
  `free_shipping_label` boolean /*The item is free to ship.*/,
  `free_shipping_limit` text /*The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.*/,
  `gender` text /*The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.*/,
  `google_product_category` text /*The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.*/,
  `gtin` int /*The unique universal product identifier.*/,
  `id` text PRIMARY KEY /*&lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The user-created unique ID that represents the product. Only Unicode characters are accepted.&lt;/p&gt;*/,
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
  `sale_price` text /*The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars.*/,
  `shipping` text /*Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.*/,
  `shipping_height` text /*The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.*/,
  `shipping_weight` text /*The weight of the product. Ensure there is a space between the numeric string and the metric.*/,
  `shipping_width` text /*The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.*/,
  `size` text /*The size of the product.*/,
  `size_system` text /*Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.*/,
  `size_type` text /*Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.*/,
  `tax` text /*Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.*/,
  `title` text /*&lt;p&gt;&lt;&#x3D; 500 characters&lt;/p&gt; &lt;p&gt;The name of the product.&lt;/p&gt;*/,
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
-- Table structure for table `UserSummary` generated from model 'userSummary'
--

CREATE TABLE IF NOT EXISTS `UserSummary` (
  `username` text /*Username*/,
  `type` text /*Always \&quot;user\&quot;*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `UserWebsiteSummary` generated from model 'userWebsiteSummary'
--

CREATE TABLE IF NOT EXISTS `UserWebsiteSummary` (
  `website` text /*Website with path or domain only*/,
  `status` text /*Status of the verification process*/,
  `verified_at` text /*UTC timestamp when the verification happened - sometimes missing*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `UserWebsiteVerificationCode` generated from model 'userWebsiteVerificationCode'
--

CREATE TABLE IF NOT EXISTS `UserWebsiteVerificationCode` (
  `verification_code` text /*Code to check against the user claiming the website*/,
  `dns_txt_record` text /*DNS TXT record to check against for the website to be claimed*/,
  `metatag` text /*Metatag the verification process searchs for the website to be claimed*/,
  `filename` text /*File expected to find on the website being claimed*/,
  `file_content` text /*A full html file to upload to the website in order for it to be claimed*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `UserWebsiteVerifyRequest` generated from model 'userWebsiteVerifyRequest'
-- User website verification request
--

CREATE TABLE IF NOT EXISTS `UserWebsiteVerifyRequest` (
  `website` text,
  `verification_method` text
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
-- Table structure for table `VideoMetadata` generated from model 'videoMetadata'
--

CREATE TABLE IF NOT EXISTS `VideoMetadata` (
  `item_type` text,
  `cover_image_url` text,
  `video_url` text /*Video url (720p). &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is limited and not available to all apps.*/,
  `duration` decimal /*Duration (in milliseconds)*/,
  `height` int /*Height (in pixels)*/,
  `width` int /*Width (in pixels)*/
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
