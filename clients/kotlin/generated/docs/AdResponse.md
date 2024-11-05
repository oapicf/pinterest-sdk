
# AdResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **adGroupId** | **kotlin.String** | ID of the ad group that contains the ad. |  [optional] |
| **androidDeepLink** | **kotlin.String** | Deep link URL for Android devices. |  [optional] |
| **carouselAndroidDeepLinks** | **kotlin.collections.List&lt;kotlin.String&gt;** | Comma-separated deep links for the carousel pin on Android. |  [optional] |
| **carouselDestinationUrls** | **kotlin.collections.List&lt;kotlin.String&gt;** | Comma-separated destination URLs for the carousel pin to promote. |  [optional] |
| **carouselIosDeepLinks** | **kotlin.collections.List&lt;kotlin.String&gt;** | Comma-separated deep links for the carousel pin on iOS. |  [optional] |
| **clickTrackingUrl** | **kotlin.String** | Tracking url for the ad clicks. |  [optional] |
| **creativeType** | [**CreativeType**](CreativeType.md) |  |  [optional] |
| **destinationUrl** | **kotlin.String** | Destination URL. |  [optional] |
| **iosDeepLink** | **kotlin.String** | Deep link URL for iOS devices. |  [optional] |
| **isPinDeleted** | **kotlin.Boolean** | Is original pin deleted? |  [optional] |
| **isRemovable** | **kotlin.Boolean** | Is pin repinnable? |  [optional] |
| **name** | **kotlin.String** | Name of the ad - 255 chars max. |  [optional] |
| **status** | [**EntityStatus**](EntityStatus.md) |  |  [optional] |
| **trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  |  [optional] |
| **viewTrackingUrl** | **kotlin.String** | Tracking URL for ad impressions. |  [optional] |
| **leadFormId** | **kotlin.String** | Lead form ID for lead ad generation. |  [optional] |
| **gridClickType** | [**GridClickType**](GridClickType.md) |  |  [optional] |
| **customizableCtaType** | [**inline**](#CustomizableCtaType) | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) |  [optional] |
| **quizPinData** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. |  [optional] |
| **pinId** | **kotlin.String** | Pin ID. |  [optional] |
| **adAccountId** | **kotlin.String** | The ID of the advertiser that this ad belongs to. |  [optional] |
| **campaignId** | **kotlin.String** | ID of the ad campaign that contains this ad. |  [optional] |
| **collectionItemsDestinationUrlTemplate** | **kotlin.String** | Destination URL template for all items within a collections drawer. |  [optional] |
| **createdTime** | **kotlin.Int** | Pin creation time. Unix timestamp in seconds. |  [optional] |
| **id** | **kotlin.String** | The ID of this ad. |  [optional] |
| **rejectedReasons** | [**inline**](#kotlin.collections.List&lt;RejectedReasons&gt;) | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. |  [optional] |
| **rejectionLabels** | **kotlin.collections.List&lt;kotlin.String&gt;** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. |  [optional] |
| **reviewStatus** | [**inline**](#ReviewStatus) | Ad review status |  [optional] |
| **type** | **kotlin.String** | Always \&quot;ad\&quot;. |  [optional] |
| **updatedTime** | **kotlin.Int** | Last update time. Unix timestamp in seconds. |  [optional] |
| **summaryStatus** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status |  [optional] |


<a id="CustomizableCtaType"></a>
## Enum: customizable_cta_type
| Name | Value |
| ---- | ----- |
| customizableCtaType | GET_OFFER, LEARN_MORE, ORDER_NOW, SHOP_NOW, SIGN_UP, SUBSCRIBE, BUY_NOW, CONTACT_US, GET_QUOTE, VISIT_SITE, APPLY_NOW, BOOK_NOW, REQUEST_DEMO, REGISTER_NOW, FIND_A_DEALER, ADD_TO_CART, WATCH_NOW, READ_MORE,  |


<a id="kotlin.collections.List<RejectedReasons>"></a>
## Enum: rejected_reasons
| Name | Value |
| ---- | ----- |
| rejectedReasons | HASHTAGS, PROMOTIONS_AND_PRICES, TARGETING, LANDING_PAGE, CAPS_AND_SYMBOLS, SHOCKING, WEIGHT_LOSS, PROHIBITED_PRODUCT, AUTHENTICITY, NUDITY, CONFUSING_DESIGN, URGENCY, RATINGS, APP, ALCOHOL, CONTESTS, POLITICAL, OTHER, IMAGE, NAR, INCONSISTENT, CLICKBAIT, NO_DESCRIPTION, LOW_QUALITY, EXAGGERATED_CLAIMS, PINTEREST_BRAND, ALCOHOL_NO_SALE, LANDING_PAGE_SPEED, LANDING_PAGE_HARDWALL, LANDING_PAGE_BROKEN, LANDING_PAGE_QUALITY, OUT_OF_STOCK, IMAGE_LOW_QUALITY, IMAGE_BUSY, IMAGE_POORLY_EDITED, IMAGE_BEFORE_AFTER, UGC, FAKE_BUTTONS, WEAPONS, SENSITIVE, UNACCEPTABLE_BUSINESS, SUSPICIOUS_CLAIMS, PHARMA, SUSPICIOUS_SUPPLEMENTS, ILLEGAL_RECREATIONAL_DRUG, LOW_QUALITY_LANDING_PAGE, RESTRICTED_HEALTHCARE, INCONSISTENT_LANG_FR |


<a id="ReviewStatus"></a>
## Enum: review_status
| Name | Value |
| ---- | ----- |
| reviewStatus | OTHER, PENDING, REJECTED, APPROVED |



