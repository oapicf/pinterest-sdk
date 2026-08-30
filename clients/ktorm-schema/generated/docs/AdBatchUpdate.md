
# Table `AdBatchUpdate`
(mapped from: AdBatchUpdate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | The ID of this ad. | 
**adGroupId** | ad_group_id | text |  | **kotlin.String** | ID of the ad group that contains the ad. |  [optional]
**androidDeepLink** | android_deep_link | text |  | **kotlin.String** | Deep link URL for Android devices. |  [optional]
**carouselAndroidDeepLinks** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Comma-separated deep links for the carousel pin on Android. |  [optional]
**carouselDestinationUrls** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Comma-separated destination URLs for the carousel pin to promote. |  [optional]
**carouselIosDeepLinks** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Comma-separated deep links for the carousel pin on iOS. |  [optional]
**clickTrackingUrl** | click_tracking_url | text |  | **kotlin.String** | Tracking url for the ad clicks. |  [optional]
**collectionItemsDestinationUrlTemplate** | collection_items_destination_url_template | text |  | **kotlin.String** | Destination URL template for all items within a collections drawer. |  [optional]
**collectionsHeaderType** | collections_header_type | long |  | [**AdCollectionsHeaderType**](AdCollectionsHeaderType.md) |  |  [optional] [foreignkey]
**creativeType** | creative_type | long |  | [**CreativeType**](CreativeType.md) |  |  [optional] [foreignkey]
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
**pinId** | pin_id | text |  | **kotlin.String** | Pin ID. This field may only be updated for draft ads. |  [optional]
**quizPinData** | quiz_pin_data | long |  | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. |  [optional] [foreignkey]
**status** | status | long |  | [**EntityStatus**](EntityStatus.md) |  |  [optional] [foreignkey]
**trackingUrls** | tracking_urls | long |  | [**TrackingUrls**](TrackingUrls.md) |  |  [optional] [foreignkey]
**viewTrackingUrl** | view_tracking_url | text |  | **kotlin.String** | Tracking URL for ad impressions. |  [optional]





# **Table `AdBatchUpdateCarouselAndroidDeepLinks`**
(mapped from: AdBatchUpdateCarouselAndroidDeepLinks)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adBatchUpdate | adBatchUpdate | long | | kotlin.Long | Primary Key | *one*
carouselAndroidDeepLinks | carouselAndroidDeepLinks | text | | kotlin.String | Foreign Key | *many*



# **Table `AdBatchUpdateCarouselDestinationUrls`**
(mapped from: AdBatchUpdateCarouselDestinationUrls)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adBatchUpdate | adBatchUpdate | long | | kotlin.Long | Primary Key | *one*
carouselDestinationUrls | carouselDestinationUrls | text | | kotlin.String | Foreign Key | *many*



# **Table `AdBatchUpdateCarouselIosDeepLinks`**
(mapped from: AdBatchUpdateCarouselIosDeepLinks)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adBatchUpdate | adBatchUpdate | long | | kotlin.Long | Primary Key | *one*
carouselIosDeepLinks | carouselIosDeepLinks | text | | kotlin.String | Foreign Key | *many*

























