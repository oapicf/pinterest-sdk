
# Table `Ad`
(mapped from: Ad)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adAccountId** | ad_account_id | text NOT NULL |  | **kotlin.String** | The ID of the advertiser that this ad belongs to. |  [readonly]
**adGroupId** | ad_group_id | text NOT NULL |  | **kotlin.String** | ID of the ad group that contains the ad. | 
**campaignId** | campaign_id | text NOT NULL |  | **kotlin.String** | ID of the ad campaign that contains this ad. |  [readonly]
**creativeType** | creative_type | long NOT NULL |  | [**CreativeType**](CreativeType.md) |  |  [foreignkey]
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | The ID of this ad. | 
**pinId** | pin_id | text NOT NULL |  | **kotlin.String** | Pin ID. This field may only be updated for draft ads. | 
**rejectedReasons** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdDisapprovalReasons&gt;**](AdDisapprovalReasons.md) | Enum reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. |  [readonly]
**rejectionLabels** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Text reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. |  [readonly]
**reviewStatus** | review_status | long NOT NULL |  | [**AdReviewStatus**](AdReviewStatus.md) | Ad review status |  [readonly] [foreignkey]
**summaryStatus** | summary_status | long NOT NULL |  | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status |  [readonly] [foreignkey]
**type** | type | text NOT NULL |  | **kotlin.String** | Always \&quot;ad\&quot;. |  [readonly]
**androidDeepLink** | android_deep_link | text |  | **kotlin.String** | Deep link URL for Android devices. |  [optional]
**carouselAndroidDeepLinks** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Comma-separated deep links for the carousel pin on Android. |  [optional]
**carouselDestinationUrls** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Comma-separated destination URLs for the carousel pin to promote. |  [optional]
**carouselIosDeepLinks** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Comma-separated deep links for the carousel pin on iOS. |  [optional]
**cartingPlatformType** | carting_platform_type | int UNSIGNED |  | **kotlin.Int** | The vendor platform type of the carting/WTB ad. |  [optional] [readonly]
**cartingProducts** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CartingProduct&gt;**](CartingProduct.md) | Array of carting/WTB products for the ad. |  [optional] [readonly]
**clickTrackingUrl** | click_tracking_url | text |  | **kotlin.String** | Tracking url for the ad clicks. |  [optional]
**collectionItemsDestinationUrlTemplate** | collection_items_destination_url_template | text |  | **kotlin.String** | Destination URL template for all items within a collections drawer. |  [optional]
**collectionsHeaderType** | collections_header_type | long |  | [**AdCollectionsHeaderType**](AdCollectionsHeaderType.md) |  |  [optional] [foreignkey]
**createdTime** | created_time | int |  | **kotlin.Int** | Pin creation time. Unix timestamp in seconds. |  [optional] [readonly]
**customizableCtaType** | customizable_cta_type | long |  | [**CustomizableCTAType**](CustomizableCTAType.md) |  |  [optional] [foreignkey]
**destinationUrl** | destination_url | text |  | **kotlin.String** | Destination URL. |  [optional]
**disclosureType** | disclosure_type | long |  | [**DisclosureType**](DisclosureType.md) |  |  [optional] [foreignkey]
**disclosureUrl** | disclosure_url | text |  | **kotlin.String** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. |  [optional]
**gridClickType** | grid_click_type | long |  | [**GridClickType**](GridClickType.md) |  |  [optional] [foreignkey]
**iosDeepLink** | ios_deep_link | text |  | **kotlin.String** | Deep link URL for iOS devices. |  [optional]
**isCarting** | is_carting | boolean |  | **kotlin.Boolean** | Is the ad a carting/WTB ad? |  [optional]
**isCollageAcceptedTerms** | is_collage_accepted_terms | boolean |  | **kotlin.Boolean** | Whether the advertiser has accepted the terms and conditions for collage ad. |  [optional]
**isCollageSingleDestination** | is_collage_single_destination | boolean |  | **kotlin.Boolean** | Whether the collage ad has a single destination url override. |  [optional]
**isPinDeleted** | is_pin_deleted | boolean |  | **kotlin.Boolean** | Is original pin deleted? |  [optional]
**isRemovable** | is_removable | boolean |  | **kotlin.Boolean** | Is pin repinnable? |  [optional]
**leadFormId** | lead_form_id | text |  | **kotlin.String** | Lead form ID for lead ad generation. |  [optional]
**name** | name | text |  | **kotlin.String** | Name of the ad - 255 chars max. |  [optional]
**quizPinData** | quiz_pin_data | long |  | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. |  [optional] [foreignkey]
**status** | status | long |  | [**EntityStatus**](EntityStatus.md) |  |  [optional] [foreignkey]
**trackingUrls** | tracking_urls | long |  | [**TrackingUrls**](TrackingUrls.md) |  |  [optional] [foreignkey]
**updatedTime** | updated_time | int |  | **kotlin.Int** | Last update time. Unix timestamp in seconds. |  [optional] [readonly]
**viewTrackingUrl** | view_tracking_url | text |  | **kotlin.String** | Tracking URL for ad impressions. |  [optional]








# **Table `AdAdDisapprovalReasons`**
(mapped from: AdAdDisapprovalReasons)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
ad | ad | long | | kotlin.Long | Primary Key | *one*
adDisapprovalReasons | adDisapprovalReasons | long | | kotlin.Long | Foreign Key | *many*



# **Table `AdRejectionLabels`**
(mapped from: AdRejectionLabels)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
ad | ad | long | | kotlin.Long | Primary Key | *one*
rejectionLabels | rejectionLabels | text | | kotlin.String | Foreign Key | *many*







# **Table `AdCarouselAndroidDeepLinks`**
(mapped from: AdCarouselAndroidDeepLinks)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
ad | ad | long | | kotlin.Long | Primary Key | *one*
carouselAndroidDeepLinks | carouselAndroidDeepLinks | text | | kotlin.String | Foreign Key | *many*



# **Table `AdCarouselDestinationUrls`**
(mapped from: AdCarouselDestinationUrls)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
ad | ad | long | | kotlin.Long | Primary Key | *one*
carouselDestinationUrls | carouselDestinationUrls | text | | kotlin.String | Foreign Key | *many*



# **Table `AdCarouselIosDeepLinks`**
(mapped from: AdCarouselIosDeepLinks)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
ad | ad | long | | kotlin.Long | Primary Key | *one*
carouselIosDeepLinks | carouselIosDeepLinks | text | | kotlin.String | Foreign Key | *many*




# **Table `AdCartingProduct`**
(mapped from: AdCartingProduct)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
ad | ad | long | | kotlin.Long | Primary Key | *one*
cartingProduct | cartingProduct | long | | kotlin.Long | Foreign Key | *many*

























