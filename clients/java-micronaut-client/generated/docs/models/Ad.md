

# Ad

The class is defined in **[Ad.java](../../src/main/java/org/openapitools/model/Ad.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | `String` | The ID of the advertiser that this ad belongs to. |  [readonly property]
**adGroupId** | `String` | ID of the ad group that contains the ad. | 
**androidDeepLink** | `String` | Deep link URL for Android devices. |  [optional property]
**campaignId** | `String` | ID of the ad campaign that contains this ad. |  [readonly property]
**carouselAndroidDeepLinks** | `List&lt;String&gt;` | Comma-separated deep links for the carousel pin on Android. |  [optional property]
**carouselDestinationUrls** | `List&lt;String&gt;` | Comma-separated destination URLs for the carousel pin to promote. |  [optional property]
**carouselIosDeepLinks** | `List&lt;String&gt;` | Comma-separated deep links for the carousel pin on iOS. |  [optional property]
**cartingPlatformType** | `Integer` | The vendor platform type of the carting/WTB ad. |  [optional property] [readonly property]
**cartingProducts** | [`List&lt;CartingProduct&gt;`](CartingProduct.md) | Array of carting/WTB products for the ad. |  [optional property] [readonly property]
**clickTrackingUrl** | `String` | Tracking url for the ad clicks. |  [optional property]
**collectionItemsDestinationUrlTemplate** | `String` | Destination URL template for all items within a collections drawer. |  [optional property]
**collectionsHeaderType** | `AdCollectionsHeaderType` |  |  [optional property]
**createdTime** | `Integer` | Pin creation time. Unix timestamp in seconds. |  [optional property] [readonly property]
**creativeType** | `CreativeType` |  | 
**customizableCtaType** | `CustomizableCTAType` |  |  [optional property]
**destinationUrl** | `String` | Destination URL. |  [optional property]
**disclosureType** | `DisclosureType` |  |  [optional property]
**disclosureUrl** | `String` | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. |  [optional property]
**gridClickType** | `GridClickType` |  |  [optional property]
**id** | `String` | The ID of this ad. | 
**iosDeepLink** | `String` | Deep link URL for iOS devices. |  [optional property]
**isCarting** | `Boolean` | Is the ad a carting/WTB ad? |  [optional property]
**isCollageAcceptedTerms** | `Boolean` | Whether the advertiser has accepted the terms and conditions for collage ad. |  [optional property]
**isCollageSingleDestination** | `Boolean` | Whether the collage ad has a single destination url override. |  [optional property]
**isPinDeleted** | `Boolean` | Is original pin deleted? |  [optional property]
**isRemovable** | `Boolean` | Is pin repinnable? |  [optional property]
**leadFormId** | `String` | Lead form ID for lead ad generation. |  [optional property]
**name** | `String` | Name of the ad - 255 chars max. |  [optional property]
**pinId** | `String` | Pin ID. This field may only be updated for draft ads. | 
**quizPinData** | [`QuizPinData`](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. |  [optional property]
**rejectedReasons** | `List&lt;AdDisapprovalReasons&gt;` | Enum reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. |  [readonly property]
**rejectionLabels** | `List&lt;String&gt;` | Text reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. |  [readonly property]
**reviewStatus** | `AdReviewStatus` | Ad review status |  [readonly property]
**status** | `EntityStatus` |  |  [optional property]
**summaryStatus** | `PinPromotionSummaryStatus` | Ad summary status |  [readonly property]
**trackingUrls** | [`TrackingUrls`](TrackingUrls.md) |  |  [optional property]
**type** | `String` | Always \&quot;ad\&quot;. |  [readonly property]
**updatedTime** | `Integer` | Last update time. Unix timestamp in seconds. |  [optional property] [readonly property]
**viewTrackingUrl** | `String` | Tracking URL for ad impressions. |  [optional property]









































