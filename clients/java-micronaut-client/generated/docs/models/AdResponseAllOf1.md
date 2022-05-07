

# AdResponseAllOf1

The class is defined in **[AdResponseAllOf1.java](../../src/main/java/org/openapitools/model/AdResponseAllOf1.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | `String` | The ID of the advertiser that this ad belongs to. |  [optional property]
**campaignId** | `String` | ID of the ad campaign that contains this ad. |  [optional property]
**collectionItemsDestinationUrlTemplate** | `String` | Destination URL template for all items within a collections drawer. |  [optional property]
**createdTime** | `Integer` | Pin creation time. Unix timestamp in seconds. |  [optional property]
**id** | `String` | The ID of this ad. |  [optional property]
**rejectedReasons** | [**List&lt;RejectedReasonsEnum&gt;**](#List&lt;RejectedReasonsEnum&gt;) | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. |  [optional property]
**rejectionLabels** | `List&lt;String&gt;` | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. |  [optional property]
**reviewStatus** | [**ReviewStatusEnum**](#ReviewStatusEnum) | Ad review status |  [optional property]
**type** | `String` | Always \&quot;ad\&quot;. |  [optional property]
**updatedTime** | `Integer` | Last update time. Unix timestamp in seconds. |  [optional property]
**summaryStatus** | [`PinPromotionSummaryStatus`](PinPromotionSummaryStatus.md) | Ad summary status |  [optional property]






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





