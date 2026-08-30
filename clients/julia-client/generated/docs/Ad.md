# Ad


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`ad_account_id`** | **`String`** | The ID of the advertiser that this ad belongs to. | [readonly] [default to nothing]
**`ad_group_id`** | **`String`** | ID of the ad group that contains the ad. | [default to nothing]
**`android_deep_link`** | **`String`** | Deep link URL for Android devices. | [optional] [default to nothing]
**`campaign_id`** | **`String`** | ID of the ad campaign that contains this ad. | [readonly] [default to nothing]
**`carousel_android_deep_links`** | **`Vector{String}`** | Comma-separated deep links for the carousel pin on Android. | [optional] [default to nothing]
**`carousel_destination_urls`** | **`Vector{String}`** | Comma-separated destination URLs for the carousel pin to promote. | [optional] [default to nothing]
**`carousel_ios_deep_links`** | **`Vector{String}`** | Comma-separated deep links for the carousel pin on iOS. | [optional] [default to nothing]
**`carting_platform_type`** | **`Int64`** | The vendor platform type of the carting/WTB ad. | [optional] [readonly] [default to nothing]
**`carting_products`** | [**`Vector{CartingProduct}`**](CartingProduct.md) | Array of carting/WTB products for the ad. | [optional] [readonly] [default to nothing]
**`click_tracking_url`** | **`String`** | Tracking url for the ad clicks. | [optional] [default to nothing]
**`collection_items_destination_url_template`** | **`String`** | Destination URL template for all items within a collections drawer. | [optional] [default to nothing]
**`collections_header_type`** | [**`*AdCollectionsHeaderType`**](AdCollectionsHeaderType.md) |  | [optional] [default to nothing]
**`created_time`** | **`Int64`** | Pin creation time. Unix timestamp in seconds. | [optional] [readonly] [default to nothing]
**`creative_type`** | [**`*CreativeType`**](CreativeType.md) |  | [default to nothing]
**`customizable_cta_type`** | [**`*CustomizableCTAType`**](CustomizableCTAType.md) |  | [optional] [default to nothing]
**`destination_url`** | **`String`** | Destination URL. | [optional] [default to nothing]
**`disclosure_type`** | [**`*DisclosureType`**](DisclosureType.md) |  | [optional] [default to nothing]
**`disclosure_url`** | **`String`** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] [default to nothing]
**`grid_click_type`** | [**`*GridClickType`**](GridClickType.md) |  | [optional] [default to nothing]
**`id`** | **`String`** | The ID of this ad. | [default to nothing]
**`ios_deep_link`** | **`String`** | Deep link URL for iOS devices. | [optional] [default to nothing]
**`is_carting`** | **`Bool`** | Is the ad a carting/WTB ad? | [optional] [default to nothing]
**`is_collage_accepted_terms`** | **`Bool`** | Whether the advertiser has accepted the terms and conditions for collage ad. | [optional] [default to nothing]
**`is_collage_single_destination`** | **`Bool`** | Whether the collage ad has a single destination url override. | [optional] [default to nothing]
**`is_pin_deleted`** | **`Bool`** | Is original pin deleted? | [optional] [default to nothing]
**`is_removable`** | **`Bool`** | Is pin repinnable? | [optional] [default to nothing]
**`lead_form_id`** | **`String`** | Lead form ID for lead ad generation. | [optional] [default to nothing]
**`name`** | **`String`** | Name of the ad - 255 chars max. | [optional] [default to nothing]
**`pin_id`** | **`String`** | Pin ID. This field may only be updated for draft ads. | [default to nothing]
**`quiz_pin_data`** | [**`*QuizPinData`**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] [default to nothing]
**`rejected_reasons`** | [**`Vector{AdDisapprovalReasons}`**](AdDisapprovalReasons.md) | Enum reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. | [readonly] [default to nothing]
**`rejection_labels`** | **`Vector{String}`** | Text reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. | [readonly] [default to nothing]
**`review_status`** | [**`*AdReviewStatus`**](AdReviewStatus.md) | Ad review status | [readonly] [default to nothing]
**`status`** | [**`*EntityStatus`**](EntityStatus.md) |  | [optional] [default to nothing]
**`summary_status`** | [**`*PinPromotionSummaryStatus`**](PinPromotionSummaryStatus.md) | Ad summary status | [readonly] [default to nothing]
**`tracking_urls`** | [**`*TrackingUrls`**](TrackingUrls.md) |  | [optional] [default to nothing]
**`type`** | **`String`** | Always \&quot;ad\&quot;. | [readonly] [default to nothing]
**`updated_time`** | **`Int64`** | Last update time. Unix timestamp in seconds. | [optional] [readonly] [default to nothing]
**`view_tracking_url`** | **`String`** | Tracking URL for ad impressions. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


