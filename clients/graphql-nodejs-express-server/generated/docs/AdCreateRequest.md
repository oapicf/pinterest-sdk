# AdCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | **String!** | ID of the ad group that contains the ad. | [default to null]
**androidDeepLink** | **String** | Deep link URL for Android devices. | [optional] [default to null]
**carouselAndroidDeepLinks** | **String!** | Comma-separated deep links for the carousel pin on Android. | [optional] [default to null]
**carouselDestinationUrls** | **String!** | Comma-separated destination URLs for the carousel pin to promote. | [optional] [default to null]
**carouselIosDeepLinks** | **String!** | Comma-separated deep links for the carousel pin on iOS. | [optional] [default to null]
**clickTrackingUrl** | **String** | Tracking url for the ad clicks. | [optional] [default to null]
**creativeType** | [***CreativeType**](CreativeType.md) |  | [default to null]
**destinationUrl** | **String** | Destination URL. | [optional] [default to null]
**iosDeepLink** | **String** | Deep link URL for iOS devices. | [optional] [default to null]
**isPinDeleted** | **Boolean!** | Is original pin deleted? | [optional] [default to null]
**isRemovable** | **Boolean!** | Is pin repinnable? | [optional] [default to null]
**name** | **String** | Name of the ad - 255 chars max. | [optional] [default to null]
**status** | [***EntityStatus**](EntityStatus.md) |  | [optional] [default to null]
**trackingUrls** | [***TrackingUrls**](TrackingUrls.md) |  | [optional] [default to null]
**viewTrackingUrl** | **String** | Tracking URL for ad impressions. | [optional] [default to null]
**leadFormId** | **String** | Lead form ID for lead ad generation. | [optional] [default to null]
**gridClickType** | [***GridClickType**](GridClickType.md) |  | [optional] [default to null]
**customizableCtaType** | **String** | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) | [optional] [default to null]
**quizPinData** | [***QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] [default to null]
**pinId** | **String!** | Pin ID. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


