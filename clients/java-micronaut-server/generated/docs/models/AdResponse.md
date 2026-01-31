

# AdResponse

The class is defined in **[AdResponse.java](../../src/main/java/org/openapitools/model/AdResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | `String` | ID of the ad group that contains the ad. |  [optional property]
**androidDeepLink** | `String` | Deep link URL for Android devices. |  [optional property]
**carouselAndroidDeepLinks** | `List&lt;String&gt;` | Comma-separated deep links for the carousel pin on Android. |  [optional property]
**carouselDestinationUrls** | `List&lt;String&gt;` | Comma-separated destination URLs for the carousel pin to promote. |  [optional property]
**carouselIosDeepLinks** | `List&lt;String&gt;` | Comma-separated deep links for the carousel pin on iOS. |  [optional property]
**clickTrackingUrl** | `String` | Tracking url for the ad clicks. |  [optional property]
**creativeType** | `CreativeType` |  |  [optional property]
**customizableCtaType** | `CustomizableCTAType` |  |  [optional property]
**destinationUrl** | `String` | Destination URL. |  [optional property]
**disclosureType** | `DisclosureType` |  |  [optional property]
**disclosureUrl** | `String` | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. |  [optional property]
**gridClickType** | `GridClickType` |  |  [optional property]
**iosDeepLink** | `String` | Deep link URL for iOS devices. |  [optional property]
**isPinDeleted** | `Boolean` | Is original pin deleted? |  [optional property]
**isRemovable** | `Boolean` | Is pin repinnable? |  [optional property]
**leadFormId** | `String` | Lead form ID for lead ad generation. |  [optional property]
**name** | `String` | Name of the ad - 255 chars max. |  [optional property]
**quizPinData** | [`QuizPinData`](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. |  [optional property]
**status** | `EntityStatus` |  |  [optional property]
**trackingUrls** | [`TrackingUrls`](TrackingUrls.md) |  |  [optional property]
**viewTrackingUrl** | `String` | Tracking URL for ad impressions. |  [optional property]
**pinId** | `String` | Pin ID. |  [optional property]
**adAccountId** | `String` | The ID of the advertiser that this ad belongs to. |  [optional property]
**campaignId** | `String` | ID of the ad campaign that contains this ad. |  [optional property]
**collectionItemsDestinationUrlTemplate** | `String` | Destination URL template for all items within a collections drawer. |  [optional property]
**createdTime** | `Integer` | Pin creation time. Unix timestamp in seconds. |  [optional property]
**id** | `String` | The ID of this ad. |  [optional property]
**rejectedReasons** | [**List&lt;RejectedReasonsEnum&gt;**](#List&lt;RejectedReasonsEnum&gt;) | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. |  [optional property]
**rejectionLabels** | `List&lt;String&gt;` | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. |  [optional property]
**reviewStatus** | [**ReviewStatusEnum**](#ReviewStatusEnum) | Ad review status |  [optional property]
**summaryStatus** | `PinPromotionSummaryStatus` | Ad summary status |  [optional property]
**type** | `String` | Always \&quot;ad\&quot;. |  [optional property]
**updatedTime** | `Integer` | Last update time. Unix timestamp in seconds. |  [optional property]




























## List&lt;RejectedReasonsEnum&gt;

Name | Value
---- | -----
HASHTAGS | `"HASHTAGS"`
PROMOTIONS_AND_PRICES | `"PROMOTIONS_AND_PRICES"`
TARGETING | `"TARGETING"`
LANDING_PAGE | `"LANDING_PAGE"`
CAPS_AND_SYMBOLS | `"CAPS_AND_SYMBOLS"`
SHOCKING | `"SHOCKING"`
WEIGHT_LOSS | `"WEIGHT_LOSS"`
PROHIBITED_PRODUCT | `"PROHIBITED_PRODUCT"`
AUTHENTICITY | `"AUTHENTICITY"`
NUDITY | `"NUDITY"`
CONFUSING_DESIGN | `"CONFUSING_DESIGN"`
URGENCY | `"URGENCY"`
RATINGS | `"RATINGS"`
APP | `"APP"`
ALCOHOL | `"ALCOHOL"`
CONTESTS | `"CONTESTS"`
POLITICAL | `"POLITICAL"`
OTHER | `"OTHER"`
IMAGE | `"IMAGE"`
NAR | `"NAR"`
INCONSISTENT | `"INCONSISTENT"`
CLICKBAIT | `"CLICKBAIT"`
NO_DESCRIPTION | `"NO_DESCRIPTION"`
LOW_QUALITY | `"LOW_QUALITY"`
EXAGGERATED_CLAIMS | `"EXAGGERATED_CLAIMS"`
PINTEREST_BRAND | `"PINTEREST_BRAND"`
ALCOHOL_NO_SALE | `"ALCOHOL_NO_SALE"`
LANDING_PAGE_SPEED | `"LANDING_PAGE_SPEED"`
LANDING_PAGE_HARDWALL | `"LANDING_PAGE_HARDWALL"`
LANDING_PAGE_BROKEN | `"LANDING_PAGE_BROKEN"`
LANDING_PAGE_QUALITY | `"LANDING_PAGE_QUALITY"`
OUT_OF_STOCK | `"OUT_OF_STOCK"`
IMAGE_LOW_QUALITY | `"IMAGE_LOW_QUALITY"`
IMAGE_BUSY | `"IMAGE_BUSY"`
IMAGE_POORLY_EDITED | `"IMAGE_POORLY_EDITED"`
IMAGE_BEFORE_AFTER | `"IMAGE_BEFORE_AFTER"`
UGC | `"UGC"`
FAKE_BUTTONS | `"FAKE_BUTTONS"`
WEAPONS | `"WEAPONS"`
SENSITIVE | `"SENSITIVE"`
UNACCEPTABLE_BUSINESS | `"UNACCEPTABLE_BUSINESS"`
SUSPICIOUS_CLAIMS | `"SUSPICIOUS_CLAIMS"`
PHARMA | `"PHARMA"`
SUSPICIOUS_SUPPLEMENTS | `"SUSPICIOUS_SUPPLEMENTS"`
ILLEGAL_RECREATIONAL_DRUG | `"ILLEGAL_RECREATIONAL_DRUG"`
LOW_QUALITY_LANDING_PAGE | `"LOW_QUALITY_LANDING_PAGE"`
RESTRICTED_HEALTHCARE | `"RESTRICTED_HEALTHCARE"`
INCONSISTENT_LANG_FR | `"INCONSISTENT_LANG_FR"`


## ReviewStatusEnum

Name | Value
---- | -----
OTHER | `"OTHER"`
PENDING | `"PENDING"`
REJECTED | `"REJECTED"`
APPROVED | `"APPROVED"`





