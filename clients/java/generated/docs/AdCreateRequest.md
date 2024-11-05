

# AdCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adGroupId** | **String** | ID of the ad group that contains the ad. |  |
|**androidDeepLink** | **String** | Deep link URL for Android devices. |  [optional] |
|**carouselAndroidDeepLinks** | **List&lt;String&gt;** | Comma-separated deep links for the carousel pin on Android. |  [optional] |
|**carouselDestinationUrls** | **List&lt;String&gt;** | Comma-separated destination URLs for the carousel pin to promote. |  [optional] |
|**carouselIosDeepLinks** | **List&lt;String&gt;** | Comma-separated deep links for the carousel pin on iOS. |  [optional] |
|**clickTrackingUrl** | **String** | Tracking url for the ad clicks. |  [optional] |
|**creativeType** | **CreativeType** |  |  |
|**destinationUrl** | **String** | Destination URL. |  [optional] |
|**iosDeepLink** | **String** | Deep link URL for iOS devices. |  [optional] |
|**isPinDeleted** | **Boolean** | Is original pin deleted? |  [optional] |
|**isRemovable** | **Boolean** | Is pin repinnable? |  [optional] |
|**name** | **String** | Name of the ad - 255 chars max. |  [optional] |
|**status** | **EntityStatus** |  |  [optional] |
|**trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  |  [optional] |
|**viewTrackingUrl** | **String** | Tracking URL for ad impressions. |  [optional] |
|**leadFormId** | **String** | Lead form ID for lead ad generation. |  [optional] |
|**gridClickType** | **GridClickType** |  |  [optional] |
|**customizableCtaType** | [**CustomizableCtaTypeEnum**](#CustomizableCtaTypeEnum) | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) |  [optional] |
|**quizPinData** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. |  [optional] |
|**pinId** | **String** | Pin ID. |  |



## Enum: CustomizableCtaTypeEnum

| Name | Value |
|---- | -----|
| GET_OFFER | &quot;GET_OFFER&quot; |
| LEARN_MORE | &quot;LEARN_MORE&quot; |
| ORDER_NOW | &quot;ORDER_NOW&quot; |
| SHOP_NOW | &quot;SHOP_NOW&quot; |
| SIGN_UP | &quot;SIGN_UP&quot; |
| SUBSCRIBE | &quot;SUBSCRIBE&quot; |
| BUY_NOW | &quot;BUY_NOW&quot; |
| CONTACT_US | &quot;CONTACT_US&quot; |
| GET_QUOTE | &quot;GET_QUOTE&quot; |
| VISIT_SITE | &quot;VISIT_SITE&quot; |
| APPLY_NOW | &quot;APPLY_NOW&quot; |
| BOOK_NOW | &quot;BOOK_NOW&quot; |
| REQUEST_DEMO | &quot;REQUEST_DEMO&quot; |
| REGISTER_NOW | &quot;REGISTER_NOW&quot; |
| FIND_A_DEALER | &quot;FIND_A_DEALER&quot; |
| ADD_TO_CART | &quot;ADD_TO_CART&quot; |
| WATCH_NOW | &quot;WATCH_NOW&quot; |
| READ_MORE | &quot;READ_MORE&quot; |



