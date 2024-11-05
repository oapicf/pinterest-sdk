
# AdCommon

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **adGroupId** | **kotlin.String** | ID of the ad group that contains the ad. |  [optional] |
| **androidDeepLink** | **kotlin.String** | Deep link URL for Android devices. |  [optional] |
| **carouselAndroidDeepLinks** | **kotlin.collections.List&lt;kotlin.String&gt;** | Comma-separated deep links for the carousel pin on Android. |  [optional] |
| **carouselDestinationUrls** | **kotlin.collections.List&lt;kotlin.String&gt;** | Comma-separated destination URLs for the carousel pin to promote. |  [optional] |
| **carouselIosDeepLinks** | **kotlin.collections.List&lt;kotlin.String&gt;** | Comma-separated deep links for the carousel pin on iOS. |  [optional] |
| **clickTrackingUrl** | **kotlin.String** | Tracking url for the ad clicks. |  [optional] |
| **creativeType** | [**CreativeType**](CreativeType.md) |  |  [optional] |
| **destinationUrl** | **kotlin.String** | Destination URL. |  [optional] |
| **iosDeepLink** | **kotlin.String** | Deep link URL for iOS devices. |  [optional] |
| **isPinDeleted** | **kotlin.Boolean** | Is original pin deleted? |  [optional] |
| **isRemovable** | **kotlin.Boolean** | Is pin repinnable? |  [optional] |
| **name** | **kotlin.String** | Name of the ad - 255 chars max. |  [optional] |
| **status** | [**EntityStatus**](EntityStatus.md) |  |  [optional] |
| **trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  |  [optional] |
| **viewTrackingUrl** | **kotlin.String** | Tracking URL for ad impressions. |  [optional] |
| **leadFormId** | **kotlin.String** | Lead form ID for lead ad generation. |  [optional] |
| **gridClickType** | [**GridClickType**](GridClickType.md) |  |  [optional] |
| **customizableCtaType** | [**inline**](#CustomizableCtaType) | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) |  [optional] |
| **quizPinData** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. |  [optional] |


<a id="CustomizableCtaType"></a>
## Enum: customizable_cta_type
| Name | Value |
| ---- | ----- |
| customizableCtaType | GET_OFFER, LEARN_MORE, ORDER_NOW, SHOP_NOW, SIGN_UP, SUBSCRIBE, BUY_NOW, CONTACT_US, GET_QUOTE, VISIT_SITE, APPLY_NOW, BOOK_NOW, REQUEST_DEMO, REGISTER_NOW, FIND_A_DEALER, ADD_TO_CART, WATCH_NOW, READ_MORE,  |



