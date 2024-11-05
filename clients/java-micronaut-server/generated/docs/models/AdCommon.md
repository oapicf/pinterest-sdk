

# AdCommon

Creation fields

The class is defined in **[AdCommon.java](../../src/main/java/org/openapitools/model/AdCommon.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | `String` | ID of the ad group that contains the ad. |  [optional property]
**androidDeepLink** | `String` | Deep link URL for Android devices. |  [optional property]
**carouselAndroidDeepLinks** | `List&lt;String&gt;` | Comma-separated deep links for the carousel pin on Android. |  [optional property]
**carouselDestinationUrls** | `List&lt;String&gt;` | Comma-separated destination URLs for the carousel pin to promote. |  [optional property]
**carouselIosDeepLinks** | `List&lt;String&gt;` | Comma-separated deep links for the carousel pin on iOS. |  [optional property]
**clickTrackingUrl** | `String` | Tracking url for the ad clicks. |  [optional property]
**creativeType** | `CreativeType` |  |  [optional property]
**destinationUrl** | `String` | Destination URL. |  [optional property]
**iosDeepLink** | `String` | Deep link URL for iOS devices. |  [optional property]
**isPinDeleted** | `Boolean` | Is original pin deleted? |  [optional property]
**isRemovable** | `Boolean` | Is pin repinnable? |  [optional property]
**name** | `String` | Name of the ad - 255 chars max. |  [optional property]
**status** | `EntityStatus` |  |  [optional property]
**trackingUrls** | [`TrackingUrls`](TrackingUrls.md) |  |  [optional property]
**viewTrackingUrl** | `String` | Tracking URL for ad impressions. |  [optional property]
**leadFormId** | `String` | Lead form ID for lead ad generation. |  [optional property]
**gridClickType** | `GridClickType` |  |  [optional property]
**customizableCtaType** | [**CustomizableCtaTypeEnum**](#CustomizableCtaTypeEnum) | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) |  [optional property]
**quizPinData** | [`QuizPinData`](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. |  [optional property]


















## CustomizableCtaTypeEnum

Name | Value
---- | -----
GET_OFFER | `"GET_OFFER"`
LEARN_MORE | `"LEARN_MORE"`
ORDER_NOW | `"ORDER_NOW"`
SHOP_NOW | `"SHOP_NOW"`
SIGN_UP | `"SIGN_UP"`
SUBSCRIBE | `"SUBSCRIBE"`
BUY_NOW | `"BUY_NOW"`
CONTACT_US | `"CONTACT_US"`
GET_QUOTE | `"GET_QUOTE"`
VISIT_SITE | `"VISIT_SITE"`
APPLY_NOW | `"APPLY_NOW"`
BOOK_NOW | `"BOOK_NOW"`
REQUEST_DEMO | `"REQUEST_DEMO"`
REGISTER_NOW | `"REGISTER_NOW"`
FIND_A_DEALER | `"FIND_A_DEALER"`
ADD_TO_CART | `"ADD_TO_CART"`
WATCH_NOW | `"WATCH_NOW"`
READ_MORE | `"READ_MORE"`



