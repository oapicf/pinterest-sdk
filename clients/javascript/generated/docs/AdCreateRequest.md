# PinterestSdk.AdCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | **String** | ID of the ad group that contains the ad. | 
**androidDeepLink** | **String** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional] 
**carouselAndroidDeepLinks** | **[String]** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carouselDestinationUrls** | **[String]** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carouselIosDeepLinks** | **[String]** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**clickTrackingUrl** | **String** | Tracking url for the ad clicks. | [optional] 
**creativeType** | [**CreativeType**](CreativeType.md) |  | 
**destinationUrl** | **String** | Destination URL. | [optional] 
**iosDeepLink** | **String** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional] 
**isPinDeleted** | **Boolean** | Is original pin deleted? | [optional] 
**isRemovable** | **Boolean** | Is pin repinnable? | [optional] 
**name** | **String** | Name of the ad - 255 chars max. | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**trackingUrls** | [**AdCommonTrackingUrls**](AdCommonTrackingUrls.md) |  | [optional] 
**viewTrackingUrl** | **String** | Tracking URL for ad impressions. | [optional] 
**leadFormId** | **String** | Lead form ID for lead ad generation. | [optional] 
**gridClickType** | [**GridClickType**](GridClickType.md) |  | [optional] 
**customizableCtaType** | **String** | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) | [optional] 
**quizPinData** | [**AdCommonQuizPinData**](AdCommonQuizPinData.md) |  | [optional] 
**pinId** | **String** | Pin ID. | 



## Enum: CustomizableCtaTypeEnum


* `GET_OFFER` (value: `"GET_OFFER"`)

* `LEARN_MORE` (value: `"LEARN_MORE"`)

* `ORDER_NOW` (value: `"ORDER_NOW"`)

* `SHOP_NOW` (value: `"SHOP_NOW"`)

* `SIGN_UP` (value: `"SIGN_UP"`)

* `SUBSCRIBE` (value: `"SUBSCRIBE"`)

* `BUY_NOW` (value: `"BUY_NOW"`)

* `CONTACT_US` (value: `"CONTACT_US"`)

* `GET_QUOTE` (value: `"GET_QUOTE"`)

* `VISIT_WEBSITE` (value: `"VISIT_WEBSITE"`)

* `APPLY_NOW` (value: `"APPLY_NOW"`)

* `BOOK_NOW` (value: `"BOOK_NOW"`)

* `REQUEST_DEMO` (value: `"REQUEST_DEMO"`)

* `REGISTER_NOW` (value: `"REGISTER_NOW"`)

* `FIND_A_DEALER` (value: `"FIND_A_DEALER"`)

* `ADD_TO_CART` (value: `"ADD_TO_CART"`)

* `WATCH_NOW` (value: `"WATCH_NOW"`)

* `READ_MORE` (value: `"READ_MORE"`)

* `null` (value: `"null"`)




