# OAIAdCommon

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | **NSString*** | ID of the ad group that contains the ad. | [optional] 
**androidDeepLink** | **NSString*** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional] 
**carouselAndroidDeepLinks** | **NSArray&lt;NSString*&gt;*** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carouselDestinationUrls** | **NSArray&lt;NSString*&gt;*** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carouselIosDeepLinks** | **NSArray&lt;NSString*&gt;*** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**clickTrackingUrl** | **NSString*** | Tracking url for the ad clicks. | [optional] 
**creativeType** | [**OAICreativeType***](OAICreativeType.md) |  | [optional] 
**destinationUrl** | **NSString*** | Destination URL. | [optional] 
**iosDeepLink** | **NSString*** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional] 
**isPinDeleted** | **NSNumber*** | Is original pin deleted? | [optional] 
**isRemovable** | **NSNumber*** | Is pin repinnable? | [optional] 
**name** | **NSString*** | Name of the ad - 255 chars max. | [optional] 
**status** | [**OAIEntityStatus***](OAIEntityStatus.md) |  | [optional] 
**trackingUrls** | [**OAIAdCommonTrackingUrls***](OAIAdCommonTrackingUrls.md) |  | [optional] 
**viewTrackingUrl** | **NSString*** | Tracking URL for ad impressions. | [optional] 
**leadFormId** | **NSString*** | Lead form ID for lead ad generation. | [optional] 
**gridClickType** | [**OAIGridClickType***](OAIGridClickType.md) |  | [optional] 
**customizableCtaType** | **NSString*** | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) | [optional] 
**quizPinData** | [**OAIAdCommonQuizPinData***](OAIAdCommonQuizPinData.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


