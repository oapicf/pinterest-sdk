

# AdUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | **String** | ID of the ad group that contains the ad. |  [optional]
**androidDeepLink** | **String** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. |  [optional]
**carouselAndroidDeepLinks** | **List&lt;String&gt;** | Comma-separated deep links for the carousel pin on Android. |  [optional]
**carouselDestinationUrls** | **List&lt;String&gt;** | Comma-separated destination URLs for the carousel pin to promote. |  [optional]
**carouselIosDeepLinks** | **List&lt;String&gt;** | Comma-separated deep links for the carousel pin on iOS. |  [optional]
**clickTrackingUrl** | **String** | Tracking url for the ad clicks. |  [optional]
**creativeType** | [**CreativeType**](CreativeType.md) |  |  [optional]
**destinationUrl** | **String** | Destination URL. |  [optional]
**iosDeepLink** | **String** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. |  [optional]
**isPinDeleted** | **Boolean** | Is original pin deleted? |  [optional]
**isRemovable** | **Boolean** | Is pin repinnable? |  [optional]
**name** | **String** | Name of the ad - 255 chars max. |  [optional]
**status** | [**EntityStatus**](EntityStatus.md) |  |  [optional]
**trackingUrls** | [**AdCommonTrackingUrls**](AdCommonTrackingUrls.md) |  |  [optional]
**viewTrackingUrl** | **String** | Tracking URL for ad impressions. |  [optional]
**leadFormId** | **String** | Lead form ID for lead ad generation. |  [optional]
**gridClickType** | [**GridClickType**](GridClickType.md) |  |  [optional]
**customizableCtaType** | [**CustomizableCtaTypeEnum**](#CustomizableCtaTypeEnum) | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) |  [optional]
**quizPinData** | [**AdCommonQuizPinData**](AdCommonQuizPinData.md) |  |  [optional]
**id** | **String** | The ID of this ad. | 
**pinId** | **String** | Pin ID. This field may only be updated for draft ads. |  [optional]


## Enum: CustomizableCtaTypeEnum

Name | Value
---- | -----




