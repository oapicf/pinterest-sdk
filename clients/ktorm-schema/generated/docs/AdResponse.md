
# Table `AdResponse`
(mapped from: AdResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adGroupId** | ad_group_id | text |  | **kotlin.String** | ID of the ad group that contains the ad. |  [optional]
**androidDeepLink** | android_deep_link | text |  | **kotlin.String** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. |  [optional]
**carouselAndroidDeepLinks** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Comma-separated deep links for the carousel pin on Android. |  [optional]
**carouselDestinationUrls** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Comma-separated destination URLs for the carousel pin to promote. |  [optional]
**carouselIosDeepLinks** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Comma-separated deep links for the carousel pin on iOS. |  [optional]
**clickTrackingUrl** | click_tracking_url | text |  | **kotlin.String** | Tracking url for the ad clicks. |  [optional]
**creativeType** | creative_type | long |  | [**CreativeType**](CreativeType.md) |  |  [optional] [foreignkey]
**destinationUrl** | destination_url | text |  | **kotlin.String** | Destination URL. |  [optional]
**iosDeepLink** | ios_deep_link | text |  | **kotlin.String** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. |  [optional]
**isPinDeleted** | is_pin_deleted | boolean |  | **kotlin.Boolean** | Is original pin deleted? |  [optional]
**isRemovable** | is_removable | boolean |  | **kotlin.Boolean** | Is pin repinnable? |  [optional]
**name** | name | text |  | **kotlin.String** | Name of the ad - 255 chars max. |  [optional]
**status** | status | long |  | [**EntityStatus**](EntityStatus.md) |  |  [optional] [foreignkey]
**trackingUrls** | tracking_urls | long |  | [**AdCommonTrackingUrls**](AdCommonTrackingUrls.md) |  |  [optional] [foreignkey]
**viewTrackingUrl** | view_tracking_url | text |  | **kotlin.String** | Tracking URL for ad impressions. |  [optional]
**leadFormId** | lead_form_id | text |  | **kotlin.String** | Lead form ID for lead ad generation. |  [optional]
**gridClickType** | grid_click_type | long |  | [**GridClickType**](GridClickType.md) |  |  [optional] [foreignkey]
**customizableCtaType** | customizable_cta_type | text |  | [**customizable_cta_type**](#CustomizableCtaType) | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) |  [optional]
**quizPinData** | quiz_pin_data | long |  | [**AdCommonQuizPinData**](AdCommonQuizPinData.md) |  |  [optional] [foreignkey]
**pinId** | pin_id | text |  | **kotlin.String** | Pin ID. |  [optional]
**adAccountId** | ad_account_id | text |  | **kotlin.String** | The ID of the advertiser that this ad belongs to. |  [optional]
**campaignId** | campaign_id | text |  | **kotlin.String** | ID of the ad campaign that contains this ad. |  [optional]
**collectionItemsDestinationUrlTemplate** | collection_items_destination_url_template | text |  | **kotlin.String** | Destination URL template for all items within a collections drawer. |  [optional]
**createdTime** | created_time | int |  | **kotlin.Int** | Pin creation time. Unix timestamp in seconds. |  [optional]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | The ID of this ad. |  [optional]
**rejectedReasons** | `One-To-Many` | `----` | `----`  | [**rejected_reasons**](#kotlin.Array&lt;RejectedReasons&gt;) | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. |  [optional]
**rejectionLabels** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. |  [optional]
**reviewStatus** | review_status | text |  | [**review_status**](#ReviewStatus) | Ad review status |  [optional]
**type** | type | text |  | **kotlin.String** | Always \&quot;ad\&quot;. |  [optional]
**updatedTime** | updated_time | int |  | **kotlin.Int** | Last update time. Unix timestamp in seconds. |  [optional]
**summaryStatus** | summary_status | long |  | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status |  [optional] [foreignkey]




# **Table `AdResponseCarouselAndroidDeepLinks`**
(mapped from: AdResponseCarouselAndroidDeepLinks)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adResponse | adResponse | long | | kotlin.Long | Primary Key | *one*
carouselAndroidDeepLinks | carouselAndroidDeepLinks | text | | kotlin.String | Foreign Key | *many*



# **Table `AdResponseCarouselDestinationUrls`**
(mapped from: AdResponseCarouselDestinationUrls)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adResponse | adResponse | long | | kotlin.Long | Primary Key | *one*
carouselDestinationUrls | carouselDestinationUrls | text | | kotlin.String | Foreign Key | *many*



# **Table `AdResponseCarouselIosDeepLinks`**
(mapped from: AdResponseCarouselIosDeepLinks)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adResponse | adResponse | long | | kotlin.Long | Primary Key | *one*
carouselIosDeepLinks | carouselIosDeepLinks | text | | kotlin.String | Foreign Key | *many*























# **Table `AdResponseRejectedReasons`**
(mapped from: AdResponseRejectedReasons)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adResponse | adResponse | long | | kotlin.Long | Primary Key | *one*
rejectedReasons | rejectedReasons | text | | kotlin.String | Foreign Key | *many*



# **Table `AdResponseRejectionLabels`**
(mapped from: AdResponseRejectionLabels)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adResponse | adResponse | long | | kotlin.Long | Primary Key | *one*
rejectionLabels | rejectionLabels | text | | kotlin.String | Foreign Key | *many*







