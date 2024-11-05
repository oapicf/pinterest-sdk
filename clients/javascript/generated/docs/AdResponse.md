# PinterestSdk.AdResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | **String** | ID of the ad group that contains the ad. | [optional] 
**androidDeepLink** | **String** | Deep link URL for Android devices. | [optional] 
**carouselAndroidDeepLinks** | **[String]** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carouselDestinationUrls** | **[String]** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carouselIosDeepLinks** | **[String]** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**clickTrackingUrl** | **String** | Tracking url for the ad clicks. | [optional] 
**creativeType** | [**CreativeType**](CreativeType.md) |  | [optional] 
**destinationUrl** | **String** | Destination URL. | [optional] 
**iosDeepLink** | **String** | Deep link URL for iOS devices. | [optional] 
**isPinDeleted** | **Boolean** | Is original pin deleted? | [optional] 
**isRemovable** | **Boolean** | Is pin repinnable? | [optional] 
**name** | **String** | Name of the ad - 255 chars max. | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**viewTrackingUrl** | **String** | Tracking URL for ad impressions. | [optional] 
**leadFormId** | **String** | Lead form ID for lead ad generation. | [optional] 
**gridClickType** | [**GridClickType**](GridClickType.md) |  | [optional] 
**customizableCtaType** | **String** | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) | [optional] 
**quizPinData** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] 
**pinId** | **String** | Pin ID. | [optional] 
**adAccountId** | **String** | The ID of the advertiser that this ad belongs to. | [optional] 
**campaignId** | **String** | ID of the ad campaign that contains this ad. | [optional] 
**collectionItemsDestinationUrlTemplate** | **String** | Destination URL template for all items within a collections drawer. | [optional] 
**createdTime** | **Number** | Pin creation time. Unix timestamp in seconds. | [optional] 
**id** | **String** | The ID of this ad. | [optional] 
**rejectedReasons** | **[String]** | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**rejectionLabels** | **[String]** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**reviewStatus** | **String** | Ad review status | [optional] 
**type** | **String** | Always \&quot;ad\&quot;. | [optional] 
**updatedTime** | **Number** | Last update time. Unix timestamp in seconds. | [optional] 
**summaryStatus** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [optional] 



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

* `VISIT_SITE` (value: `"VISIT_SITE"`)

* `APPLY_NOW` (value: `"APPLY_NOW"`)

* `BOOK_NOW` (value: `"BOOK_NOW"`)

* `REQUEST_DEMO` (value: `"REQUEST_DEMO"`)

* `REGISTER_NOW` (value: `"REGISTER_NOW"`)

* `FIND_A_DEALER` (value: `"FIND_A_DEALER"`)

* `ADD_TO_CART` (value: `"ADD_TO_CART"`)

* `WATCH_NOW` (value: `"WATCH_NOW"`)

* `READ_MORE` (value: `"READ_MORE"`)





## Enum: [RejectedReasonsEnum]


* `HASHTAGS` (value: `"HASHTAGS"`)

* `PROMOTIONS_AND_PRICES` (value: `"PROMOTIONS_AND_PRICES"`)

* `TARGETING` (value: `"TARGETING"`)

* `LANDING_PAGE` (value: `"LANDING_PAGE"`)

* `CAPS_AND_SYMBOLS` (value: `"CAPS_AND_SYMBOLS"`)

* `SHOCKING` (value: `"SHOCKING"`)

* `WEIGHT_LOSS` (value: `"WEIGHT_LOSS"`)

* `PROHIBITED_PRODUCT` (value: `"PROHIBITED_PRODUCT"`)

* `AUTHENTICITY` (value: `"AUTHENTICITY"`)

* `NUDITY` (value: `"NUDITY"`)

* `CONFUSING_DESIGN` (value: `"CONFUSING_DESIGN"`)

* `URGENCY` (value: `"URGENCY"`)

* `RATINGS` (value: `"RATINGS"`)

* `APP` (value: `"APP"`)

* `ALCOHOL` (value: `"ALCOHOL"`)

* `CONTESTS` (value: `"CONTESTS"`)

* `POLITICAL` (value: `"POLITICAL"`)

* `OTHER` (value: `"OTHER"`)

* `IMAGE` (value: `"IMAGE"`)

* `NAR` (value: `"NAR"`)

* `INCONSISTENT` (value: `"INCONSISTENT"`)

* `CLICKBAIT` (value: `"CLICKBAIT"`)

* `NO_DESCRIPTION` (value: `"NO_DESCRIPTION"`)

* `LOW_QUALITY` (value: `"LOW_QUALITY"`)

* `EXAGGERATED_CLAIMS` (value: `"EXAGGERATED_CLAIMS"`)

* `PINTEREST_BRAND` (value: `"PINTEREST_BRAND"`)

* `ALCOHOL_NO_SALE` (value: `"ALCOHOL_NO_SALE"`)

* `LANDING_PAGE_SPEED` (value: `"LANDING_PAGE_SPEED"`)

* `LANDING_PAGE_HARDWALL` (value: `"LANDING_PAGE_HARDWALL"`)

* `LANDING_PAGE_BROKEN` (value: `"LANDING_PAGE_BROKEN"`)

* `LANDING_PAGE_QUALITY` (value: `"LANDING_PAGE_QUALITY"`)

* `OUT_OF_STOCK` (value: `"OUT_OF_STOCK"`)

* `IMAGE_LOW_QUALITY` (value: `"IMAGE_LOW_QUALITY"`)

* `IMAGE_BUSY` (value: `"IMAGE_BUSY"`)

* `IMAGE_POORLY_EDITED` (value: `"IMAGE_POORLY_EDITED"`)

* `IMAGE_BEFORE_AFTER` (value: `"IMAGE_BEFORE_AFTER"`)

* `UGC` (value: `"UGC"`)

* `FAKE_BUTTONS` (value: `"FAKE_BUTTONS"`)

* `WEAPONS` (value: `"WEAPONS"`)

* `SENSITIVE` (value: `"SENSITIVE"`)

* `UNACCEPTABLE_BUSINESS` (value: `"UNACCEPTABLE_BUSINESS"`)

* `SUSPICIOUS_CLAIMS` (value: `"SUSPICIOUS_CLAIMS"`)

* `PHARMA` (value: `"PHARMA"`)

* `SUSPICIOUS_SUPPLEMENTS` (value: `"SUSPICIOUS_SUPPLEMENTS"`)

* `ILLEGAL_RECREATIONAL_DRUG` (value: `"ILLEGAL_RECREATIONAL_DRUG"`)

* `LOW_QUALITY_LANDING_PAGE` (value: `"LOW_QUALITY_LANDING_PAGE"`)

* `RESTRICTED_HEALTHCARE` (value: `"RESTRICTED_HEALTHCARE"`)

* `INCONSISTENT_LANG_FR` (value: `"INCONSISTENT_LANG_FR"`)





## Enum: ReviewStatusEnum


* `OTHER` (value: `"OTHER"`)

* `PENDING` (value: `"PENDING"`)

* `REJECTED` (value: `"REJECTED"`)

* `APPROVED` (value: `"APPROVED"`)




