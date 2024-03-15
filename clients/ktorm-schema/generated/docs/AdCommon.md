
# Table `AdCommon`
(mapped from: AdCommon)

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




# **Table `AdCommonCarouselAndroidDeepLinks`**
(mapped from: AdCommonCarouselAndroidDeepLinks)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adCommon | adCommon | long | | kotlin.Long | Primary Key | *one*
carouselAndroidDeepLinks | carouselAndroidDeepLinks | text | | kotlin.String | Foreign Key | *many*



# **Table `AdCommonCarouselDestinationUrls`**
(mapped from: AdCommonCarouselDestinationUrls)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adCommon | adCommon | long | | kotlin.Long | Primary Key | *one*
carouselDestinationUrls | carouselDestinationUrls | text | | kotlin.String | Foreign Key | *many*



# **Table `AdCommonCarouselIosDeepLinks`**
(mapped from: AdCommonCarouselIosDeepLinks)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adCommon | adCommon | long | | kotlin.Long | Primary Key | *one*
carouselIosDeepLinks | carouselIosDeepLinks | text | | kotlin.String | Foreign Key | *many*

















