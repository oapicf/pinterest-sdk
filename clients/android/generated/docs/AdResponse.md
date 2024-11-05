

# AdResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | **String** | ID of the ad group that contains the ad. |  [optional]
**androidDeepLink** | **String** | Deep link URL for Android devices. |  [optional]
**carouselAndroidDeepLinks** | **List&lt;String&gt;** | Comma-separated deep links for the carousel pin on Android. |  [optional]
**carouselDestinationUrls** | **List&lt;String&gt;** | Comma-separated destination URLs for the carousel pin to promote. |  [optional]
**carouselIosDeepLinks** | **List&lt;String&gt;** | Comma-separated deep links for the carousel pin on iOS. |  [optional]
**clickTrackingUrl** | **String** | Tracking url for the ad clicks. |  [optional]
**creativeType** | [**CreativeType**](CreativeType.md) |  |  [optional]
**destinationUrl** | **String** | Destination URL. |  [optional]
**iosDeepLink** | **String** | Deep link URL for iOS devices. |  [optional]
**isPinDeleted** | **Boolean** | Is original pin deleted? |  [optional]
**isRemovable** | **Boolean** | Is pin repinnable? |  [optional]
**name** | **String** | Name of the ad - 255 chars max. |  [optional]
**status** | [**EntityStatus**](EntityStatus.md) |  |  [optional]
**trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  |  [optional]
**viewTrackingUrl** | **String** | Tracking URL for ad impressions. |  [optional]
**leadFormId** | **String** | Lead form ID for lead ad generation. |  [optional]
**gridClickType** | [**GridClickType**](GridClickType.md) |  |  [optional]
**customizableCtaType** | [**CustomizableCtaTypeEnum**](#CustomizableCtaTypeEnum) | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) |  [optional]
**quizPinData** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. |  [optional]
**pinId** | **String** | Pin ID. |  [optional]
**adAccountId** | **String** | The ID of the advertiser that this ad belongs to. |  [optional]
**campaignId** | **String** | ID of the ad campaign that contains this ad. |  [optional]
**collectionItemsDestinationUrlTemplate** | **String** | Destination URL template for all items within a collections drawer. |  [optional]
**createdTime** | **Integer** | Pin creation time. Unix timestamp in seconds. |  [optional]
**id** | **String** | The ID of this ad. |  [optional]
**rejectedReasons** | [**List&lt;RejectedReasonsEnum&gt;**](#List&lt;RejectedReasonsEnum&gt;) | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. |  [optional]
**rejectionLabels** | **List&lt;String&gt;** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. |  [optional]
**reviewStatus** | [**ReviewStatusEnum**](#ReviewStatusEnum) | Ad review status |  [optional]
**type** | **String** | Always \&quot;ad\&quot;. |  [optional]
**updatedTime** | **Integer** | Last update time. Unix timestamp in seconds. |  [optional]
**summaryStatus** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status |  [optional]


## Enum: CustomizableCtaTypeEnum

Name | Value
---- | -----


## Enum: List&lt;RejectedReasonsEnum&gt;

Name | Value
---- | -----
HASHTAGS | &quot;HASHTAGS&quot;
PROMOTIONS_AND_PRICES | &quot;PROMOTIONS_AND_PRICES&quot;
TARGETING | &quot;TARGETING&quot;
LANDING_PAGE | &quot;LANDING_PAGE&quot;
CAPS_AND_SYMBOLS | &quot;CAPS_AND_SYMBOLS&quot;
SHOCKING | &quot;SHOCKING&quot;
WEIGHT_LOSS | &quot;WEIGHT_LOSS&quot;
PROHIBITED_PRODUCT | &quot;PROHIBITED_PRODUCT&quot;
AUTHENTICITY | &quot;AUTHENTICITY&quot;
NUDITY | &quot;NUDITY&quot;
CONFUSING_DESIGN | &quot;CONFUSING_DESIGN&quot;
URGENCY | &quot;URGENCY&quot;
RATINGS | &quot;RATINGS&quot;
APP | &quot;APP&quot;
ALCOHOL | &quot;ALCOHOL&quot;
CONTESTS | &quot;CONTESTS&quot;
POLITICAL | &quot;POLITICAL&quot;
OTHER | &quot;OTHER&quot;
IMAGE | &quot;IMAGE&quot;
NAR | &quot;NAR&quot;
INCONSISTENT | &quot;INCONSISTENT&quot;
CLICKBAIT | &quot;CLICKBAIT&quot;
NO_DESCRIPTION | &quot;NO_DESCRIPTION&quot;
LOW_QUALITY | &quot;LOW_QUALITY&quot;
EXAGGERATED_CLAIMS | &quot;EXAGGERATED_CLAIMS&quot;
PINTEREST_BRAND | &quot;PINTEREST_BRAND&quot;
ALCOHOL_NO_SALE | &quot;ALCOHOL_NO_SALE&quot;
LANDING_PAGE_SPEED | &quot;LANDING_PAGE_SPEED&quot;
LANDING_PAGE_HARDWALL | &quot;LANDING_PAGE_HARDWALL&quot;
LANDING_PAGE_BROKEN | &quot;LANDING_PAGE_BROKEN&quot;
LANDING_PAGE_QUALITY | &quot;LANDING_PAGE_QUALITY&quot;
OUT_OF_STOCK | &quot;OUT_OF_STOCK&quot;
IMAGE_LOW_QUALITY | &quot;IMAGE_LOW_QUALITY&quot;
IMAGE_BUSY | &quot;IMAGE_BUSY&quot;
IMAGE_POORLY_EDITED | &quot;IMAGE_POORLY_EDITED&quot;
IMAGE_BEFORE_AFTER | &quot;IMAGE_BEFORE_AFTER&quot;
UGC | &quot;UGC&quot;
FAKE_BUTTONS | &quot;FAKE_BUTTONS&quot;
WEAPONS | &quot;WEAPONS&quot;
SENSITIVE | &quot;SENSITIVE&quot;
UNACCEPTABLE_BUSINESS | &quot;UNACCEPTABLE_BUSINESS&quot;
SUSPICIOUS_CLAIMS | &quot;SUSPICIOUS_CLAIMS&quot;
PHARMA | &quot;PHARMA&quot;
SUSPICIOUS_SUPPLEMENTS | &quot;SUSPICIOUS_SUPPLEMENTS&quot;
ILLEGAL_RECREATIONAL_DRUG | &quot;ILLEGAL_RECREATIONAL_DRUG&quot;
LOW_QUALITY_LANDING_PAGE | &quot;LOW_QUALITY_LANDING_PAGE&quot;
RESTRICTED_HEALTHCARE | &quot;RESTRICTED_HEALTHCARE&quot;
INCONSISTENT_LANG_FR | &quot;INCONSISTENT_LANG_FR&quot;


## Enum: ReviewStatusEnum

Name | Value
---- | -----




