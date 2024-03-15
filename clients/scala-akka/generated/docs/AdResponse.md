

# AdResponse


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
**pinId** | **String** | Pin ID. |  [optional]
**adAccountId** | **String** | The ID of the advertiser that this ad belongs to. |  [optional]
**campaignId** | **String** | ID of the ad campaign that contains this ad. |  [optional]
**collectionItemsDestinationUrlTemplate** | **String** | Destination URL template for all items within a collections drawer. |  [optional]
**createdTime** | **Int** | Pin creation time. Unix timestamp in seconds. |  [optional]
**id** | **String** | The ID of this ad. |  [optional]
**rejectedReasons** | [**Seq[RejectedReasons]**](#Seq[RejectedReasons]) | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. |  [optional]
**rejectionLabels** | **Seq&lt;String&gt;** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. |  [optional]
**reviewStatus** | [**ReviewStatus**](#ReviewStatus) | Ad review status |  [optional]
**`type`** | **String** | Always \&quot;ad\&quot;. |  [optional]
**updatedTime** | **Int** | Last update time. Unix timestamp in seconds. |  [optional]
**summaryStatus** | **PinPromotionSummaryStatus** | Ad summary status |  [optional]


## Enum: CustomizableCtaType
Allowed values: [GET_OFFER, LEARN_MORE, ORDER_NOW, SHOP_NOW, SIGN_UP, SUBSCRIBE, BUY_NOW, CONTACT_US, GET_QUOTE, VISIT_WEBSITE, APPLY_NOW, BOOK_NOW, REQUEST_DEMO, REGISTER_NOW, FIND_A_DEALER, ADD_TO_CART, WATCH_NOW, READ_MORE, ]



## Enum: Seq[RejectedReasons]
Allowed values: [HASHTAGS, PROMOTIONS_AND_PRICES, TARGETING, LANDING_PAGE, CAPS_AND_SYMBOLS, SHOCKING, WEIGHT_LOSS, PROHIBITED_PRODUCT, AUTHENTICITY, NUDITY, CONFUSING_DESIGN, URGENCY, RATINGS, APP, ALCOHOL, CONTESTS, POLITICAL, OTHER, IMAGE, NAR, INCONSISTENT, CLICKBAIT, NO_DESCRIPTION, LOW_QUALITY, EXAGGERATED_CLAIMS, PINTEREST_BRAND, ALCOHOL_NO_SALE, LANDING_PAGE_SPEED, LANDING_PAGE_HARDWALL, LANDING_PAGE_BROKEN, LANDING_PAGE_QUALITY, OUT_OF_STOCK, IMAGE_LOW_QUALITY, IMAGE_BUSY, IMAGE_POORLY_EDITED, IMAGE_BEFORE_AFTER, UGC, FAKE_BUTTONS, WEAPONS, SENSITIVE, UNACCEPTABLE_BUSINESS, SUSPICIOUS_CLAIMS, PHARMA, SUSPICIOUS_SUPPLEMENTS, ILLEGAL_RECREATIONAL_DRUG, LOW_QUALITY_LANDING_PAGE, RESTRICTED_HEALTHCARE, INCONSISTENT_LANG_FR]



## Enum: ReviewStatus
Allowed values: [OTHER, PENDING, REJECTED, APPROVED]




