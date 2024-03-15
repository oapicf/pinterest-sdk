

# AdCommon

Creation fields

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | **String** | ID of the ad group that contains the ad. |  [optional]
**androidDeepLink** | **String** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. |  [optional]
**carouselAndroidDeepLinks** | **Seq&lt;String&gt;** | Comma-separated deep links for the carousel pin on Android. |  [optional]
**carouselDestinationUrls** | **Seq&lt;String&gt;** | Comma-separated destination URLs for the carousel pin to promote. |  [optional]
**carouselIosDeepLinks** | **Seq&lt;String&gt;** | Comma-separated deep links for the carousel pin on iOS. |  [optional]
**clickTrackingUrl** | **String** | Tracking url for the ad clicks. |  [optional]
**creativeType** | **CreativeType** |  |  [optional]
**destinationUrl** | **String** | Destination URL. |  [optional]
**iosDeepLink** | **String** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. |  [optional]
**isPinDeleted** | **Boolean** | Is original pin deleted? |  [optional]
**isRemovable** | **Boolean** | Is pin repinnable? |  [optional]
**name** | **String** | Name of the ad - 255 chars max. |  [optional]
**status** | **EntityStatus** |  |  [optional]
**trackingUrls** | [**AdCommonTrackingUrls**](AdCommonTrackingUrls.md) |  |  [optional]
**viewTrackingUrl** | **String** | Tracking URL for ad impressions. |  [optional]
**leadFormId** | **String** | Lead form ID for lead ad generation. |  [optional]
**gridClickType** | **GridClickType** |  |  [optional]
**customizableCtaType** | [**CustomizableCtaType**](#CustomizableCtaType) | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) |  [optional]
**quizPinData** | [**AdCommonQuizPinData**](AdCommonQuizPinData.md) |  |  [optional]


## Enum: CustomizableCtaType
Allowed values: [GET_OFFER, LEARN_MORE, ORDER_NOW, SHOP_NOW, SIGN_UP, SUBSCRIBE, BUY_NOW, CONTACT_US, GET_QUOTE, VISIT_WEBSITE, APPLY_NOW, BOOK_NOW, REQUEST_DEMO, REGISTER_NOW, FIND_A_DEALER, ADD_TO_CART, WATCH_NOW, READ_MORE, ]




