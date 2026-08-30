# AD

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | [**STRING_32**](STRING_32.md) | The ID of the advertiser that this ad belongs to. | [readonly] [default to null]
**ad_group_id** | [**STRING_32**](STRING_32.md) | ID of the ad group that contains the ad. | [default to null]
**android_deep_link** | [**STRING_32**](STRING_32.md) | Deep link URL for Android devices. | [optional] [default to null]
**campaign_id** | [**STRING_32**](STRING_32.md) | ID of the ad campaign that contains this ad. | [readonly] [default to null]
**carousel_android_deep_links** | [**LIST [STRING_32]**](STRING_32.md) | Comma-separated deep links for the carousel pin on Android. | [optional] [default to null]
**carousel_destination_urls** | [**LIST [STRING_32]**](STRING_32.md) | Comma-separated destination URLs for the carousel pin to promote. | [optional] [default to null]
**carousel_ios_deep_links** | [**LIST [STRING_32]**](STRING_32.md) | Comma-separated deep links for the carousel pin on iOS. | [optional] [default to null]
**carting_platform_type** | **INTEGER_32** | The vendor platform type of the carting/WTB ad. | [optional] [readonly] [default to null]
**carting_products** | [**LIST [CARTING_PRODUCT]**](CartingProduct.md) | Array of carting/WTB products for the ad. | [optional] [readonly] [default to null]
**click_tracking_url** | [**STRING_32**](STRING_32.md) | Tracking url for the ad clicks. | [optional] [default to null]
**collection_items_destination_url_template** | [**STRING_32**](STRING_32.md) | Destination URL template for all items within a collections drawer. | [optional] [default to null]
**collections_header_type** | [**AD_COLLECTIONS_HEADER_TYPE**](AdCollectionsHeaderType.md) |  | [optional] [default to null]
**created_time** | **INTEGER_32** | Pin creation time. Unix timestamp in seconds. | [optional] [readonly] [default to null]
**creative_type** | [**CREATIVE_TYPE**](CreativeType.md) |  | [default to null]
**customizable_cta_type** | [**CUSTOMIZABLE_CTA_TYPE**](CustomizableCTAType.md) |  | [optional] [default to null]
**destination_url** | [**STRING_32**](STRING_32.md) | Destination URL. | [optional] [default to null]
**disclosure_type** | [**DISCLOSURE_TYPE**](DisclosureType.md) |  | [optional] [default to null]
**disclosure_url** | [**STRING_32**](STRING_32.md) | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] [default to null]
**grid_click_type** | [**GRID_CLICK_TYPE**](GridClickType.md) |  | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) | The ID of this ad. | [default to null]
**ios_deep_link** | [**STRING_32**](STRING_32.md) | Deep link URL for iOS devices. | [optional] [default to null]
**is_carting** | **BOOLEAN** | Is the ad a carting/WTB ad? | [optional] [default to null]
**is_collage_accepted_terms** | **BOOLEAN** | Whether the advertiser has accepted the terms and conditions for collage ad. | [optional] [default to null]
**is_collage_single_destination** | **BOOLEAN** | Whether the collage ad has a single destination url override. | [optional] [default to null]
**is_pin_deleted** | **BOOLEAN** | Is original pin deleted? | [optional] [default to null]
**is_removable** | **BOOLEAN** | Is pin repinnable? | [optional] [default to null]
**lead_form_id** | [**STRING_32**](STRING_32.md) | Lead form ID for lead ad generation. | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | Name of the ad - 255 chars max. | [optional] [default to null]
**pin_id** | [**STRING_32**](STRING_32.md) | Pin ID. This field may only be updated for draft ads. | [default to null]
**quiz_pin_data** | [**QUIZ_PIN_DATA**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] [default to null]
**rejected_reasons** | [**LIST [AD_DISAPPROVAL_REASONS]**](AdDisapprovalReasons.md) | Enum reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. | [readonly] [default to null]
**rejection_labels** | [**LIST [STRING_32]**](STRING_32.md) | Text reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. | [readonly] [default to null]
**review_status** | [**AD_REVIEW_STATUS**](AdReviewStatus.md) | Ad review status | [readonly] [default to null]
**status** | [**ENTITY_STATUS**](EntityStatus.md) |  | [optional] [default to null]
**summary_status** | [**PIN_PROMOTION_SUMMARY_STATUS**](PinPromotionSummaryStatus.md) | Ad summary status | [readonly] [default to null]
**tracking_urls** | [**TRACKING_URLS**](TrackingUrls.md) |  | [optional] [default to null]
**type** | [**STRING_32**](STRING_32.md) | Always \&quot;ad\&quot;. | [readonly] [default to null]
**updated_time** | **INTEGER_32** | Last update time. Unix timestamp in seconds. | [optional] [readonly] [default to null]
**view_tracking_url** | [**STRING_32**](STRING_32.md) | Tracking URL for ad impressions. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


