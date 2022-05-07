
# Table `AdResponse_allOf`
(mapped from: AdResponseAllOf)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adGroupId** | ad_group_id | text |  | **kotlin.String** | ID of the ad group that contains the ad. |  [optional]
**androidDeepLink** | android_deep_link | text |  | **kotlin.String** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. |  [optional]
**carouselAndroidDeepLinks** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Comma-separated deep links for the carousel pin on Android. |  [optional]
**carouselDestinationUrls** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Comma-separated destination URLs for the carousel pin to promote. |  [optional]
**carouselIosDeepLinks** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Comma-separated deep links for the carousel pin on iOS. |  [optional]
**clickTrackingUrl** | click_tracking_url | text |  | **kotlin.String** | Tracking url for the ad clicks. |  [optional]
**creativeType** | creative_type | text |  | [**creative_type**](#CreativeType) | Ad creative type enum |  [optional]
**destinationUrl** | destination_url | text |  | **kotlin.String** | Destination URL. |  [optional]
**iosDeepLink** | ios_deep_link | text |  | **kotlin.String** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. |  [optional]
**isPinDeleted** | is_pin_deleted | boolean |  | **kotlin.Boolean** | Is original pin deleted? |  [optional]
**isRemovable** | is_removable | boolean |  | **kotlin.Boolean** | Is pin repinnable? |  [optional]
**name** | name | text |  | **kotlin.String** | Name of the ad - 255 chars max. |  [optional]
**pinId** | pin_id | text |  | **kotlin.String** | Pin ID. |  [optional]
**status** | status | long |  | [**EntityStatus**](EntityStatus.md) |  |  [optional] [foreignkey]
**trackingUrls** | tracking_urls | long |  | [**TrackingUrls**](TrackingUrls.md) |  |  [optional] [foreignkey]
**viewTrackingUrl** | view_tracking_url | text |  | **kotlin.String** | Tracking URL for ad impressions. |  [optional]




# **Table `AdResponseAllOfCarouselAndroidDeepLinks`**
(mapped from: AdResponseAllOfCarouselAndroidDeepLinks)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adResponseAllOf | adResponseAllOf | long | | kotlin.Long | Primary Key | *one*
carouselAndroidDeepLinks | carouselAndroidDeepLinks | text | | kotlin.String | Foreign Key | *many*



# **Table `AdResponseAllOfCarouselDestinationUrls`**
(mapped from: AdResponseAllOfCarouselDestinationUrls)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adResponseAllOf | adResponseAllOf | long | | kotlin.Long | Primary Key | *one*
carouselDestinationUrls | carouselDestinationUrls | text | | kotlin.String | Foreign Key | *many*



# **Table `AdResponseAllOfCarouselIosDeepLinks`**
(mapped from: AdResponseAllOfCarouselIosDeepLinks)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adResponseAllOf | adResponseAllOf | long | | kotlin.Long | Primary Key | *one*
carouselIosDeepLinks | carouselIosDeepLinks | text | | kotlin.String | Foreign Key | *many*














