# Org.OpenAPITools.Model.AdCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupId** | **string** | ID of the ad group that contains the ad. | 
**AndroidDeepLink** | **string** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional] 
**CarouselAndroidDeepLinks** | **List&lt;string&gt;** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**CarouselDestinationUrls** | **List&lt;string&gt;** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**CarouselIosDeepLinks** | **List&lt;string&gt;** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**ClickTrackingUrl** | **string** | Tracking url for the ad clicks. | [optional] 
**CreativeType** | **CreativeType** |  | 
**DestinationUrl** | **string** | Destination URL. | [optional] 
**IosDeepLink** | **string** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional] 
**IsPinDeleted** | **bool** | Is original pin deleted? | [optional] 
**IsRemovable** | **bool** | Is pin repinnable? | [optional] 
**Name** | **string** | Name of the ad - 255 chars max. | [optional] 
**Status** | **EntityStatus** |  | [optional] 
**TrackingUrls** | [**AdCommonTrackingUrls**](AdCommonTrackingUrls.md) |  | [optional] 
**ViewTrackingUrl** | **string** | Tracking URL for ad impressions. | [optional] 
**LeadFormId** | **string** | Lead form ID for lead ad generation. | [optional] 
**GridClickType** | **GridClickType** |  | [optional] 
**CustomizableCtaType** | **string** | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) | [optional] 
**QuizPinData** | [**AdCommonQuizPinData**](AdCommonQuizPinData.md) |  | [optional] 
**PinId** | **string** | Pin ID. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

