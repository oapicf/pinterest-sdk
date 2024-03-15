# AdCommon

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | **string** | ID of the ad group that contains the ad. | [optional] 
**androidDeepLink** | **string** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional] 
**carouselAndroidDeepLinks** | **string** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carouselDestinationUrls** | **string** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carouselIosDeepLinks** | **string** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**clickTrackingUrl** | **string** | Tracking url for the ad clicks. | [optional] 
**creativeType** | [**OpenAPI\Server\Model\CreativeType**](CreativeType.md) |  | [optional] 
**destinationUrl** | **string** | Destination URL. | [optional] 
**iosDeepLink** | **string** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional] 
**isPinDeleted** | **bool** | Is original pin deleted? | [optional] 
**isRemovable** | **bool** | Is pin repinnable? | [optional] 
**name** | **string** | Name of the ad - 255 chars max. | [optional] 
**status** | [**OpenAPI\Server\Model\EntityStatus**](EntityStatus.md) |  | [optional] 
**trackingUrls** | [**OpenAPI\Server\Model\AdCommonTrackingUrls**](AdCommonTrackingUrls.md) |  | [optional] 
**viewTrackingUrl** | **string** | Tracking URL for ad impressions. | [optional] 
**leadFormId** | **string** | Lead form ID for lead ad generation. | [optional] 
**gridClickType** | [**OpenAPI\Server\Model\GridClickType**](GridClickType.md) |  | [optional] 
**customizableCtaType** | **string** | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) | [optional] 
**quizPinData** | [**OpenAPI\Server\Model\AdCommonQuizPinData**](AdCommonQuizPinData.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


