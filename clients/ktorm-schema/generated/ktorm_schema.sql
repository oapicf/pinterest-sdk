

-- --------------------------------------------------------------------------
-- Table structure for table `Account` generated from model 'account'
--

CREATE TABLE IF NOT EXISTS `Account` (
  `account_type` text /*Type of account*/,
  `profile_image` text,
  `website_url` text,
  `username` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdAccount` generated from model 'adAccount'
--

CREATE TABLE IF NOT EXISTS `AdAccount` (
  `id` text PRIMARY KEY,
  `name` text,
  `owner` long,
  `country` long,
  `currency` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Ad_account_owner` generated from model 'adAccountOwner'
--

CREATE TABLE IF NOT EXISTS `Ad_account_owner` (
  `username` text /*Public username for the user account*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupResponse` generated from model 'adGroupResponse'
--

CREATE TABLE IF NOT EXISTS `AdGroupResponse` (
  `name` text /*Ad group name.*/,
  `status` long /*Ad group/entity status.*/,
  `budget_in_micro_currency` int /*Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.*/,
  `bid_in_micro_currency` int /*Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.*/,
  `budget_type` text /*Budget type. If DAILY, an ad group&#39;s daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group &#x60;start_time&#x60; and &#x60;end_time&#x60; range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.*/,
  `start_time` int /*Ad group start time. Unix timestamp in seconds. Defaults to current time.*/,
  `end_time` int /*Ad group end time. Unix timestamp in seconds.*/,
  `targeting_spec` blob /*Ad group targeting specification defining the ad group target audience. For example, &#39;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}&#39;*/,
  `lifetime_frequency_cap` int /*Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\\\&quot;/docs/redoc/#section/Billable-event\\\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.*/,
  `tracking_urls` long /*Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.*/,
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.*/,
  `placement_group` long /*&lt;a href&#x3D;\\\&quot;/docs/redoc/#section/Placement-group\\\&quot;&gt;Placement group&lt;/a&gt;.*/,
  `pacing_delivery_type` long /*Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day.*/,
  `conversion_learning_mode_type` text /*oCPM learn mode*/,
  `summary_status` long /*Ad group summary status.*/,
  `feed_profile_id` text /*Feed Profile ID associated to the adgroup.*/,
  `campaign_id` text /*Campaign ID of the ad group.*/,
  `billable_event` long,
  `id` text PRIMARY KEY /*Ad group ID.*/,
  `type` text /*Always \&quot;adgroup\&quot;.*/,
  `ad_account_id` text /*Advertiser ID.*/,
  `created_time` int /*Ad group creation time. Unix timestamp in seconds.*/,
  `updated_time` int /*Ad group last update time. Unix timestamp in seconds.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupResponse_allOf` generated from model 'adGroupResponseAllOf'
--

CREATE TABLE IF NOT EXISTS `AdGroupResponse_allOf` (
  `name` text /*Ad group name.*/,
  `status` long /*Ad group/entity status.*/,
  `budget_in_micro_currency` int /*Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.*/,
  `bid_in_micro_currency` int /*Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.*/,
  `budget_type` text /*Budget type. If DAILY, an ad group&#39;s daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group &#x60;start_time&#x60; and &#x60;end_time&#x60; range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome.*/,
  `start_time` int /*Ad group start time. Unix timestamp in seconds. Defaults to current time.*/,
  `end_time` int /*Ad group end time. Unix timestamp in seconds.*/,
  `targeting_spec` blob /*Ad group targeting specification defining the ad group target audience. For example, &#39;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}&#39;*/,
  `lifetime_frequency_cap` int /*Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\\\&quot;/docs/redoc/#section/Billable-event\\\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field.*/,
  `tracking_urls` long /*Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.*/,
  `auto_targeting_enabled` boolean /*Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.*/,
  `placement_group` long /*&lt;a href&#x3D;\\\&quot;/docs/redoc/#section/Placement-group\\\&quot;&gt;Placement group&lt;/a&gt;.*/,
  `pacing_delivery_type` long /*Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day.*/,
  `conversion_learning_mode_type` text /*oCPM learn mode*/,
  `summary_status` long /*Ad group summary status.*/,
  `feed_profile_id` text /*Feed Profile ID associated to the adgroup.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdGroupResponse_allOf_1` generated from model 'adGroupResponseAllOf1'
--

CREATE TABLE IF NOT EXISTS `AdGroupResponse_allOf_1` (
  `campaign_id` text /*Campaign ID of the ad group.*/,
  `billable_event` long,
  `id` text PRIMARY KEY /*Ad group ID.*/,
  `type` text /*Always \&quot;adgroup\&quot;.*/,
  `ad_account_id` text /*Advertiser ID.*/,
  `created_time` int /*Ad group creation time. Unix timestamp in seconds.*/,
  `updated_time` int /*Ad group last update time. Unix timestamp in seconds.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdResponse` generated from model 'adResponse'
--

CREATE TABLE IF NOT EXISTS `AdResponse` (
  `ad_group_id` text /*ID of the ad group that contains the ad.*/,
  `android_deep_link` text /*Deep link URL for Android devices. Not currently available. Using this field will generate an error.*/,
  `click_tracking_url` text /*Tracking url for the ad clicks.*/,
  `creative_type` text /*Ad creative type enum*/,
  `destination_url` text /*Destination URL.*/,
  `ios_deep_link` text /*Deep link URL for iOS devices. Not currently available. Using this field will generate an error.*/,
  `is_pin_deleted` boolean /*Is original pin deleted?*/,
  `is_removable` boolean /*Is pin repinnable?*/,
  `name` text /*Name of the ad - 255 chars max.*/,
  `pin_id` text /*Pin ID.*/,
  `status` long,
  `tracking_urls` long,
  `view_tracking_url` text /*Tracking URL for ad impressions.*/,
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
-- Table structure for table `AdResponse_allOf` generated from model 'adResponseAllOf'
-- Creation fields
--

CREATE TABLE IF NOT EXISTS `AdResponse_allOf` (
  `ad_group_id` text /*ID of the ad group that contains the ad.*/,
  `android_deep_link` text /*Deep link URL for Android devices. Not currently available. Using this field will generate an error.*/,
  `click_tracking_url` text /*Tracking url for the ad clicks.*/,
  `creative_type` text /*Ad creative type enum*/,
  `destination_url` text /*Destination URL.*/,
  `ios_deep_link` text /*Deep link URL for iOS devices. Not currently available. Using this field will generate an error.*/,
  `is_pin_deleted` boolean /*Is original pin deleted?*/,
  `is_removable` boolean /*Is pin repinnable?*/,
  `name` text /*Name of the ad - 255 chars max.*/,
  `pin_id` text /*Pin ID.*/,
  `status` long,
  `tracking_urls` long,
  `view_tracking_url` text /*Tracking URL for ad impressions.*/
);  /*Creation fields*/

-- --------------------------------------------------------------------------
-- Table structure for table `AdResponseAllOfCarouselAndroidDeepLinks` generated from model 'AdResponseAllOfCarouselAndroidDeepLinks'

CREATE TABLE IF NOT EXISTS `AdResponseAllOfCarouselAndroidDeepLinks` (
  `adResponseAllOf` long NOT NULL
  `carouselAndroidDeepLinks` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdResponseAllOfCarouselDestinationUrls` generated from model 'AdResponseAllOfCarouselDestinationUrls'

CREATE TABLE IF NOT EXISTS `AdResponseAllOfCarouselDestinationUrls` (
  `adResponseAllOf` long NOT NULL
  `carouselDestinationUrls` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdResponseAllOfCarouselIosDeepLinks` generated from model 'AdResponseAllOfCarouselIosDeepLinks'

CREATE TABLE IF NOT EXISTS `AdResponseAllOfCarouselIosDeepLinks` (
  `adResponseAllOf` long NOT NULL
  `carouselIosDeepLinks` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdResponse_allOf_1` generated from model 'adResponseAllOf1'
--

CREATE TABLE IF NOT EXISTS `AdResponse_allOf_1` (
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
-- Table structure for table `AdResponseAllOf1RejectedReasons` generated from model 'AdResponseAllOf1RejectedReasons'

CREATE TABLE IF NOT EXISTS `AdResponseAllOf1RejectedReasons` (
  `adResponseAllOf1` long NOT NULL
  `rejectedReasons` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AdResponseAllOf1RejectionLabels` generated from model 'AdResponseAllOf1RejectionLabels'

CREATE TABLE IF NOT EXISTS `AdResponseAllOf1RejectionLabels` (
  `adResponseAllOf1` long NOT NULL
  `rejectionLabels` text NOT NULL
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
  `report_format` long /*Specification for formatting report data*/,
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
-- Table structure for table `AdsAnalyticsCreateAsyncRequest_allOf` generated from model 'adsAnalyticsCreateAsyncRequestAllOf'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequest_allOf` (
  `start_date` text NOT NULL /*Metric report start date (UTC). Format: YYYY-MM-DD*/,
  `end_date` text NOT NULL /*Metric report end date (UTC). Format: YYYY-MM-DD*/,
  `granularity` long NOT NULL /*TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly*/,
  `click_window_days` long /*Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.*/,
  `engagement_window_days` long /*Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.*/,
  `view_window_days` long /*Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.*/,
  `conversion_report_time` long /*The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequestAllOfConversionReportAttributionType` generated from model 'AdsAnalyticsCreateAsyncRequestAllOfConversionReportAttributionType'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestAllOfConversionReportAttributionType` (
  `adsAnalyticsCreateAsyncRequestAllOf` long NOT NULL
  `conversionReportAttributionType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequest_allOf_1` generated from model 'adsAnalyticsCreateAsyncRequestAllOf1'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequest_allOf_1` (
  `level` long NOT NULL /*Level of the report*/,
  `report_format` long /*Specification for formatting report data*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncRequestAllOf1ReportingColumnAsync` generated from model 'AdsAnalyticsCreateAsyncRequestAllOf1ReportingColumnAsync'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncRequestAllOf1ReportingColumnAsync` (
  `adsAnalyticsCreateAsyncRequestAllOf1` long NOT NULL
  `reportingColumnAsync` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsCreateAsyncResponse` generated from model 'adsAnalyticsCreateAsyncResponse'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsCreateAsyncResponse` (
  `report_status` text,
  `token` text,
  `message` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsGetAsyncResponse` generated from model 'adsAnalyticsGetAsyncResponse'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsGetAsyncResponse` (
  `report_status` text,
  `url` text,
  `size` decimal
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsMetricsFilter` generated from model 'adsAnalyticsMetricsFilter'
--

CREATE TABLE IF NOT EXISTS `AdsAnalyticsMetricsFilter` (
  `field` long,
  `operator` long,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AdsAnalyticsMetricsFilterPropertyValues` generated from model 'AdsAnalyticsMetricsFilterPropertyValues'

CREATE TABLE IF NOT EXISTS `AdsAnalyticsMetricsFilterPropertyValues` (
  `adsAnalyticsMetricsFilter` long NOT NULL
  `propertyValues` decimal NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AnalyticsMetricsResponse` generated from model 'analyticsMetricsResponse'
--

CREATE TABLE IF NOT EXISTS `AnalyticsMetricsResponse` (
  `summary_metrics` blob /*The metric name and value over the requested period for each requested metric*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AnalyticsMetricsResponseAnalyticsMetricsResponseDailyMetrics` generated from model 'AnalyticsMetricsResponseAnalyticsMetricsResponseDailyMetrics'

CREATE TABLE IF NOT EXISTS `AnalyticsMetricsResponseAnalyticsMetricsResponseDailyMetrics` (
  `analyticsMetricsResponse` long NOT NULL
  `analyticsMetricsResponseDailyMetrics` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AnalyticsMetricsResponse_daily_metrics` generated from model 'analyticsMetricsResponseDailyMetrics'
--

CREATE TABLE IF NOT EXISTS `AnalyticsMetricsResponse_daily_metrics` (
  `data_status` text /*Metrics availablity, e.g., \&quot;READY\&quot;.*/,
  `date` text /*Metrics date (UTC): YYYY-MM-DD.*/,
  `metrics` blob /*The metric name and daily value for each requested metric*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AvailabilityFilter` generated from model 'availabilityFilter'
--

CREATE TABLE IF NOT EXISTS `AvailabilityFilter` (
  `AVAILABILITY` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Board` generated from model 'board'
-- Board
--

CREATE TABLE IF NOT EXISTS `Board` (
  `name` text NOT NULL,
  `id` text PRIMARY KEY,
  `description` text,
  `owner` long,
  `privacy` text /*Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt;*/
);  /*Board*/


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
  `id` text PRIMARY KEY,
  `name` text
);  /*Sections help organize pins within a board.*/


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
-- Table structure for table `BrandFilter` generated from model 'brandFilter'
--

CREATE TABLE IF NOT EXISTS `BrandFilter` (
  `BRAND` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignCommon` generated from model 'campaignCommon'
-- Campaign Data
--

CREATE TABLE IF NOT EXISTS `CampaignCommon` (
  `ad_account_id` text NOT NULL /*Campaign&#39;s Advertiser ID.*/,
  `name` text /*Campaign name.*/,
  `status` long,
  `lifetime_spend_cap` int /*Campaign total spending cap.*/,
  `daily_spend_cap` int /*Campaign daily spending cap.*/,
  `order_line_id` text /*Order line ID that appears on the invoice.*/,
  `tracking_urls` long,
  `start_time` int /*Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.*/,
  `end_time` int /*Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.*/
);  /*Campaign Data*/


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignResponse` generated from model 'campaignResponse'
--

CREATE TABLE IF NOT EXISTS `CampaignResponse` (
  `id` text NOT NULL PRIMARY KEY /*Campaign ID.*/,
  `ad_account_id` text NOT NULL /*Campaign&#39;s Advertiser ID.*/,
  `name` text /*Campaign name.*/,
  `status` long,
  `lifetime_spend_cap` int /*Campaign total spending cap.*/,
  `daily_spend_cap` int /*Campaign daily spending cap.*/,
  `order_line_id` text /*Order line ID that appears on the invoice.*/,
  `tracking_urls` long,
  `start_time` int /*Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.*/,
  `end_time` int /*Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.*/,
  `objective_type` long,
  `created_time` int /*Campaign creation time. Unix timestamp in seconds.*/,
  `updated_time` int /*UTC timestamp. Last update time.*/,
  `type` text /*Always \&quot;campaign\&quot;.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignResponse_allOf` generated from model 'campaignResponseAllOf'
--

CREATE TABLE IF NOT EXISTS `CampaignResponse_allOf` (
  `id` text NOT NULL PRIMARY KEY /*Campaign ID.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CampaignResponse_allOf_1` generated from model 'campaignResponseAllOf1'
--

CREATE TABLE IF NOT EXISTS `CampaignResponse_allOf_1` (
  `objective_type` long,
  `created_time` int /*Campaign creation time. Unix timestamp in seconds.*/,
  `updated_time` int /*UTC timestamp. Last update time.*/,
  `type` text /*Always \&quot;campaign\&quot;.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsDbItem` generated from model 'catalogsDbItem'
--

CREATE TABLE IF NOT EXISTS `CatalogsDbItem` (
  `created_at` datetime,
  `id` text PRIMARY KEY,
  `updated_at` datetime
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeed` generated from model 'catalogsFeed'
-- Catalogs Catalogs Feed object
--

CREATE TABLE IF NOT EXISTS `CatalogsFeed` (
  `default_country` long NOT NULL,
  `default_availability` long NOT NULL,
  `default_currency` long NOT NULL,
  `name` text NOT NULL /*A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.*/,
  `format` long NOT NULL,
  `default_locale` text NOT NULL /*The locale used within a feed for product descriptions.*/,
  `credentials` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `preferred_processing_schedule` long NOT NULL,
  `status` long NOT NULL,
  `created_at` datetime,
  `id` text PRIMARY KEY,
  `updated_at` datetime
);  /*Catalogs Catalogs Feed object*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedCredentials` generated from model 'catalogsFeedCredentials'
-- Use this if your feed file requires username and password.
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedCredentials` (
  `password` text NOT NULL /*The required password for downloading a feed.*/,
  `username` text NOT NULL /*The required username for downloading a feed.*/
);  /*Use this if your feed file requires username and password.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedIngestionDetails` generated from model 'catalogsFeedIngestionDetails'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedIngestionDetails` (
  `errors` long NOT NULL,
  `info` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedIngestionErrors` generated from model 'catalogsFeedIngestionErrors'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedIngestionErrors` (
  `image_download_error` int,
  `image_download_connection_timeout` int,
  `image_format_unrecognize` int,
  `line_level_internal_error` int,
  `large_product_count_decrease` int
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedIngestionInfo` generated from model 'catalogsFeedIngestionInfo'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedIngestionInfo` (
  `in_stock` int,
  `out_of_stock` int,
  `preorder` int
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
-- Table structure for table `catalogs_feed_processing_result_fields` generated from model 'catalogsFeedProcessingResultFields'
--

CREATE TABLE IF NOT EXISTS `catalogs_feed_processing_result_fields` (
  `ingestion_details` long NOT NULL,
  `status` long NOT NULL,
  `product_counts` long NOT NULL,
  `validation_details` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedProcessingSchedule` generated from model 'catalogsFeedProcessingSchedule'
-- Optional daily processing schedule. Use this to configure the preferred time for processing a feed (otherwise random).
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedProcessingSchedule` (
  `time` text NOT NULL /*A time in format HH:MM with leading 0 (zero)*/,
  `timezone` text NOT NULL /*The timezone considered for the processing schedule time.*/
);  /*Optional daily processing schedule. Use this to configure the preferred time for processing a feed (otherwise random).*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedProductCounts` generated from model 'catalogsFeedProductCounts'
-- The counts can be null early in the process.
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedProductCounts` (
  `original` int /*The number of products in the feed file*/
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
  `fetch_error` int,
  `fetch_inactive_feed_error` int,
  `encoding_error` int,
  `delimiter_error` int,
  `required_columns_missing` int,
  `image_link_invalid` int,
  `itemid_missing` int,
  `title_missing` int,
  `description_missing` int,
  `product_category_invalid` int,
  `product_link_missing` int,
  `image_link_missing` int,
  `availability_invalid` int,
  `product_price_invalid` int,
  `link_format_invalid` int,
  `parse_line_error` int,
  `adwords_format_invalid` int,
  `product_category_missing` int,
  `internal_service_error` int,
  `no_verified_domain` int,
  `adult_invalid` int,
  `invalid_domain` int,
  `feed_length_too_long` int,
  `link_length_too_long` int,
  `malformed_xml` int,
  `redirect_invalid` int,
  `price_missing` int,
  `feed_too_small` int,
  `condition_invalid` int,
  `shopify_no_products` int,
  `max_items_per_item_group_exceeded` int,
  `item_main_image_download_failure` int,
  `pinjoin_content_unsafe` int,
  `blocklisted_image_signature` int
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedValidationWarnings` generated from model 'catalogsFeedValidationWarnings'
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedValidationWarnings` (
  `title_length_too_long` int,
  `description_length_too_long` int,
  `gender_invalid` int,
  `age_group_invalid` int,
  `size_type_invalid` int,
  `link_format_warning` int,
  `duplicate_products` int,
  `duplicate_links` int,
  `sales_price_invalid` int,
  `product_category_depth_warning` int,
  `adwords_same_as_link` int,
  `duplicate_headers` int,
  `fetch_same_signature` int,
  `adwords_format_warning` int,
  `additional_image_link_warning` int,
  `image_link_warning` int,
  `shipping_invalid` int,
  `tax_invalid` int,
  `shipping_weight_invalid` int,
  `expiration_date_invalid` int,
  `availability_date_invalid` int,
  `sale_date_invalid` int,
  `weight_unit_invalid` int,
  `is_bundle_invalid` int,
  `updated_time_invalid` int,
  `custom_label_length_too_long` int,
  `product_type_length_too_long` int,
  `too_many_additional_image_links` int,
  `multipack_invalid` int,
  `indexed_product_count_large_delta` int,
  `item_additional_image_download_failure` int,
  `optional_product_category_missing` int,
  `optional_product_category_invalid` int,
  `optional_condition_missing` int,
  `optional_condition_invalid` int,
  `ios_deep_link_invalid` int,
  `android_deep_link_invalid` int,
  `availability_normalized` int,
  `condition_normalized` int,
  `gender_normalized` int,
  `size_type_normalized` int,
  `age_group_normalized` int,
  `utm_source_auto_corrected` int,
  `country_does_not_map_to_currency` int,
  `min_ad_price_invalid` int
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsFeedsCreateRequest` generated from model 'catalogsFeedsCreateRequest'
-- Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
--

CREATE TABLE IF NOT EXISTS `CatalogsFeedsCreateRequest` (
  `name` text NOT NULL /*A human-friendly name associated to a given feed.*/,
  `format` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `default_country` long,
  `default_availability` long,
  `default_currency` long,
  `default_locale` text /*The locale used within a feed for product descriptions.*/,
  `credentials` long,
  `preferred_processing_schedule` long
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
-- Table structure for table `CatalogsItems` generated from model 'catalogsItems'
-- Response object of catalogs items
--

CREATE TABLE IF NOT EXISTS `CatalogsItems` (
);  /*Response object of catalogs items*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsItemBatchRecord` generated from model 'CatalogsItemsItemBatchRecord'

CREATE TABLE IF NOT EXISTS `CatalogsItemsItemBatchRecord` (
  `catalogsItems` long NOT NULL
  `itemBatchRecord` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsBatch` generated from model 'catalogsItemsBatch'
-- Object describing the catalogs items batch
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsBatch` (
  `batch_id` text /*Id of the catalogs items batch*/,
  `created_time` datetime /*Time of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD*/,
  `completed_time` datetime /*Time of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ssTZD*/,
  `status` long
);  /*Object describing the catalogs items batch*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsBatchItemProcessingRecord` generated from model 'CatalogsItemsBatchItemProcessingRecord'

CREATE TABLE IF NOT EXISTS `CatalogsItemsBatchItemProcessingRecord` (
  `catalogsItemsBatch` long NOT NULL
  `itemProcessingRecord` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsBatchRequest` generated from model 'catalogsItemsBatchRequest'
-- Request object of catalogs items batch
--

CREATE TABLE IF NOT EXISTS `CatalogsItemsBatchRequest` (
  `country` long,
  `language` long,
  `operation` long,
);  /*Request object of catalogs items batch*/

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsItemsBatchRequestItemBatchRecord` generated from model 'CatalogsItemsBatchRequestItemBatchRecord'

CREATE TABLE IF NOT EXISTS `CatalogsItemsBatchRequestItemBatchRecord` (
  `catalogsItemsBatchRequest` long NOT NULL
  `itemBatchRecord` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroup` generated from model 'catalogsProductGroup'
-- catalog product group entity
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroup` (
  `id` text NOT NULL PRIMARY KEY /*ID of the catalog product group.*/,
  `filters` long NOT NULL,
  `name` text /*Name of catalog product group*/,
  `description` text,
  `type` long,
  `status` long,
  `feed_id` text /*id of the catalogs feed belonging to this catalog product group*/,
  `created_at` int /*Unix timestamp in seconds of when catalog product group was created.*/,
  `updated_at` int /*Unix timestamp in seconds of last time catalog product group was updated.*/
);  /*catalog product group entity*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupCreateRequest` generated from model 'catalogsProductGroupCreateRequest'
-- Request object for creating a product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupCreateRequest` (
  `feed_id` text NOT NULL /*Catalog Feed id pertaining to the catalog product group.*/,
  `name` text NOT NULL,
  `filters` long NOT NULL,
  `description` text
);  /*Request object for creating a product group.*/


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupCurrencyCriteria` generated from model 'catalogsProductGroupCurrencyCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupCurrencyCriteria` (
  `values` long NOT NULL,
  `negated` boolean NOT NULL
); 


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
-- Table structure for table `CatalogsProductGroupMultipleStringCriteria` generated from model 'catalogsProductGroupMultipleStringCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleStringCriteria` (
  `negated` boolean NOT NULL
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
  `negated` boolean NOT NULL
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupMultipleStringListCriteriaPropertyValues` generated from model 'CatalogsProductGroupMultipleStringListCriteriaPropertyValues'

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupMultipleStringListCriteriaPropertyValues` (
  `catalogsProductGroupMultipleStringListCriteria` long NOT NULL
  `propertyValues` blob NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupPricingCriteria` generated from model 'catalogsProductGroupPricingCriteria'
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupPricingCriteria` (
  `inclusion` boolean NOT NULL,
  `values` decimal NOT NULL,
  `negated` boolean NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CatalogsProductGroupUpdateRequest` generated from model 'catalogsProductGroupUpdateRequest'
-- Request object for updating a product group.
--

CREATE TABLE IF NOT EXISTS `CatalogsProductGroupUpdateRequest` (
  `feed_id` text NOT NULL /*Catalog Feed id pertaining to the catalog product group.*/,
  `name` text NOT NULL,
  `filters` long NOT NULL,
  `description` text
);  /*Request object for updating a product group.*/


-- --------------------------------------------------------------------------
-- Table structure for table `ConditionFilter` generated from model 'conditionFilter'
--

CREATE TABLE IF NOT EXISTS `ConditionFilter` (
  `CONDITION` long NOT NULL
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
-- Table structure for table `Error` generated from model 'error'
--

CREATE TABLE IF NOT EXISTS `Error` (
  `code` int NOT NULL,
  `message` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `feed_fields` generated from model 'feedFields'
--

CREATE TABLE IF NOT EXISTS `feed_fields` (
  `default_country` long NOT NULL,
  `default_availability` long NOT NULL,
  `default_currency` long NOT NULL,
  `name` text NOT NULL /*A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.*/,
  `format` long NOT NULL,
  `default_locale` text NOT NULL /*The locale used within a feed for product descriptions.*/,
  `credentials` long NOT NULL,
  `location` text NOT NULL /*The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.*/,
  `preferred_processing_schedule` long NOT NULL,
  `status` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GenderFilter` generated from model 'genderFilter'
--

CREATE TABLE IF NOT EXISTS `GenderFilter` (
  `GENDER` long NOT NULL
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
-- Table structure for table `ImageDetails` generated from model 'imageDetails'
--

CREATE TABLE IF NOT EXISTS `ImageDetails` (
  `width` int UNSIGNED NOT NULL,
  `height` int UNSIGNED NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributes` generated from model 'itemAttributes'
--

CREATE TABLE IF NOT EXISTS `ItemAttributes` (
  `ad_link` text /*Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.*/,
  `adult` boolean /*Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest.*/,
  `age_group` text /*The age group to apply a demographic range to the product. Must be one of the following values: ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, ‘adult’.*/,
  `availability` text /*The availability of the product. Must be one of the following values: ‘in stock’, ‘out of stock’, ‘preorder’.*/,
  `average_review_rating` decimal /*Average reviews for the item. Can be a number from 1-5.*/,
  `brand` text /*The brand of the product.*/,
  `color` text /*The primary color of the product.*/,
  `condition` text /*The condition of the product. Must be one of the following values: ‘new’, ‘used’, ‘refurbished’.*/,
  `custom_label_0` text /*Custom grouping of products.*/,
  `custom_label_1` text /*Custom grouping of products.*/,
  `custom_label_2` text /*Custom grouping of products.*/,
  `custom_label_3` text /*Custom grouping of products.*/,
  `custom_label_4` text /*Custom grouping of products.*/,
  `description` text /*The description of the product.*/,
  `free_shipping_label` boolean /*The item is free to ship.*/,
  `free_shipping_limit` text /*The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.*/,
  `gender` text /*The gender associated with the product. Must be one of the following values: ‘male’, ‘female’, ‘unisex’.*/,
  `google_product_category` text /*The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.*/,
  `gtin` int /*The unique universal product identifier.*/,
  `id` text PRIMARY KEY /*The user-created unique ID that represents the product. Only Unicode characters are accepted.*/,
  `item_group_id` text /*The parent ID of the product.*/,
  `last_updated_time` long /*The millisecond timestamp when the item was lastly modified by the merchant.*/,
  `link` text /*The landing page for the product.*/,
  `material` text /*The material used to make the product.*/,
  `min_ad_price` text /*The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.*/,
  `mobile_link` text /*The mobile-optimized version of your landing page. Must begin with http:// or https://.*/,
  `mpn` text /*Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.*/,
  `number_of_ratings` int /*The number of ratings for the item.*/,
  `number_of_reviews` int /*The number of reviews available for the item.*/,
  `pattern` text /*The description of the pattern used for the product.*/,
  `price` text /*The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.*/,
  `product_type` text /*The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.*/,
  `sale_price` text /*The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars.*/,
  `shipping` text /*Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.*/,
  `shipping_height` text /*The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.*/,
  `shipping_weight` text /*The weight of the product. Ensure there is a space between the numeric string and the metric.*/,
  `shipping_width` text /*The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.*/,
  `size` text /*The size of the product.*/,
  `size_system` text /*Indicates the country’s sizing system in which you are submitting your product.*/,
  `size_type` text /*Additional description for the size. Must be one of the following values: ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, ‘maternity’.*/,
  `tax` text /*Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.*/,
  `title` text /*The name of the product.*/
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
  `attributes` long
);  /*Object describing an item batch record*/


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
-- Table structure for table `ItemValidationEvent` generated from model 'itemValidationEvent'
-- Object describing an item validation event
--

CREATE TABLE IF NOT EXISTS `ItemValidationEvent` (
  `attribute` text /*The attribute that the item validation event references*/,
  `code` int /*The event code that the item validation event references*/,
  `message` text /*Title message describing the item validation event*/
);  /*Object describing an item validation event*/


-- --------------------------------------------------------------------------
-- Table structure for table `MaxPriceFilter` generated from model 'maxPriceFilter'
--

CREATE TABLE IF NOT EXISTS `MaxPriceFilter` (
  `MAX_PRICE` long NOT NULL
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
-- Table structure for table `MediaUpload_allOf` generated from model 'mediaUploadAllOf'
--

CREATE TABLE IF NOT EXISTS `MediaUpload_allOf` (
  `media_id` text /*Unique identifier for this media upload. Used to track status and for attaching during Pin creation.*/,
  `media_type` long,
  `upload_url` text /*The URL where you will POST your media file.*/,
  `upload_parameters` long
); 


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
-- Table structure for table `OauthAccessTokenRequestCode_allOf` generated from model 'oauthAccessTokenRequestCodeAllOf'
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenRequestCode_allOf` (
  `code` text NOT NULL,
  `redirect_uri` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `OauthAccessTokenRequestRefresh` generated from model 'oauthAccessTokenRequestRefresh'
-- A request to exchange a refresh token for a new access token.
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenRequestRefresh` (
  `grant_type` text NOT NULL,
  `refresh_token` text NOT NULL,
  `scope` text
);  /*A request to exchange a refresh token for a new access token.*/


-- --------------------------------------------------------------------------
-- Table structure for table `OauthAccessTokenRequestRefresh_allOf` generated from model 'oauthAccessTokenRequestRefreshAllOf'
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenRequestRefresh_allOf` (
  `refresh_token` text NOT NULL,
  `scope` text
); 


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
-- Table structure for table `OauthAccessTokenResponseCode_allOf` generated from model 'oauthAccessTokenResponseCodeAllOf'
--

CREATE TABLE IF NOT EXISTS `OauthAccessTokenResponseCode_allOf` (
  `refresh_token` text NOT NULL,
  `refresh_token_expires_in` int NOT NULL
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
  `alt_text` text,
  `board_id` text /*The board to which this Pin belongs.*/,
  `board_section_id` text /*The board section to which this Pin belongs.*/,
  `board_owner` long,
  `media` long,
  `media_source` long
);  /*Pin*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinMedia` generated from model 'pinMedia'
-- Pin media objects.
--

CREATE TABLE IF NOT EXISTS `PinMedia` (
  `media_type` text
);  /*Pin media objects.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSource` generated from model 'pinMediaSource'
-- Pin media source.
--

CREATE TABLE IF NOT EXISTS `PinMediaSource` (
  `source_type` text NOT NULL,
  `content_type` text NOT NULL,
  `data` text NOT NULL,
  `url` text NOT NULL,
  `cover_image_url` text NOT NULL,
  `media_id` text NOT NULL
);  /*Pin media source.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSourceImageBase64` generated from model 'pinMediaSourceImageBase64'
-- Base64-encoded image media source
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImageBase64` (
  `source_type` text NOT NULL,
  `content_type` text NOT NULL,
  `data` text NOT NULL
);  /*Base64-encoded image media source*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSourceImageURL` generated from model 'pinMediaSourceImageURL'
-- Image URL-based media source
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceImageURL` (
  `source_type` text NOT NULL,
  `url` text NOT NULL
);  /*Image URL-based media source*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaSourceVideoID` generated from model 'pinMediaSourceVideoID'
-- Video ID-based media source
--

CREATE TABLE IF NOT EXISTS `PinMediaSourceVideoID` (
  `source_type` text NOT NULL,
  `cover_image_url` text NOT NULL,
  `media_id` text NOT NULL
);  /*Video ID-based media source*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaWithImage` generated from model 'pinMediaWithImage'
-- Pin with image.
--

CREATE TABLE IF NOT EXISTS `PinMediaWithImage` (
  `images` blob,
  `media_type` text
);  /*Pin with image.*/


-- --------------------------------------------------------------------------
-- Table structure for table `PinMediaWithImage_allOf` generated from model 'pinMediaWithImageAllOf'
--

CREATE TABLE IF NOT EXISTS `PinMediaWithImage_allOf` (
  `images` blob
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
-- Table structure for table `TrackingUrls` generated from model 'trackingUrls'
-- Third-party tracking URLs. Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.
--

CREATE TABLE IF NOT EXISTS `TrackingUrls` (
);  /*Third-party tracking URLs. Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;.*/

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
