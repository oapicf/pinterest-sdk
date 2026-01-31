
# AdCreateRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **adGroupId** | **kotlin.String** | ID of the ad group that contains the ad. |  |
| **creativeType** | [**CreativeType**](CreativeType.md) |  |  |
| **pinId** | **kotlin.String** | Pin ID. |  |
| **androidDeepLink** | **kotlin.String** | Deep link URL for Android devices. |  [optional] |
| **carouselAndroidDeepLinks** | **kotlin.collections.List&lt;kotlin.String&gt;** | Comma-separated deep links for the carousel pin on Android. |  [optional] |
| **carouselDestinationUrls** | **kotlin.collections.List&lt;kotlin.String&gt;** | Comma-separated destination URLs for the carousel pin to promote. |  [optional] |
| **carouselIosDeepLinks** | **kotlin.collections.List&lt;kotlin.String&gt;** | Comma-separated deep links for the carousel pin on iOS. |  [optional] |
| **clickTrackingUrl** | **kotlin.String** | Tracking url for the ad clicks. |  [optional] |
| **customizableCtaType** | [**CustomizableCTAType**](CustomizableCTAType.md) |  |  [optional] |
| **destinationUrl** | **kotlin.String** | Destination URL. |  [optional] |
| **disclosureType** | [**DisclosureType**](DisclosureType.md) |  |  [optional] |
| **disclosureUrl** | **kotlin.String** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. |  [optional] |
| **gridClickType** | [**GridClickType**](GridClickType.md) |  |  [optional] |
| **iosDeepLink** | **kotlin.String** | Deep link URL for iOS devices. |  [optional] |
| **isPinDeleted** | **kotlin.Boolean** | Is original pin deleted? |  [optional] |
| **isRemovable** | **kotlin.Boolean** | Is pin repinnable? |  [optional] |
| **leadFormId** | **kotlin.String** | Lead form ID for lead ad generation. |  [optional] |
| **name** | **kotlin.String** | Name of the ad - 255 chars max. |  [optional] |
| **quizPinData** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. |  [optional] |
| **status** | [**EntityStatus**](EntityStatus.md) |  |  [optional] |
| **trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  |  [optional] |
| **viewTrackingUrl** | **kotlin.String** | Tracking URL for ad impressions. |  [optional] |



