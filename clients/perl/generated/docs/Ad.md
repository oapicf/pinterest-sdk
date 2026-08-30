# WWW::OpenAPIClient::Object::Ad

## Load the model package
```perl
use WWW::OpenAPIClient::Object::Ad;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | The ID of the advertiser that this ad belongs to. | [readonly] 
**ad_group_id** | **string** | ID of the ad group that contains the ad. | 
**android_deep_link** | **string** | Deep link URL for Android devices. | [optional] 
**campaign_id** | **string** | ID of the ad campaign that contains this ad. | [readonly] 
**carousel_android_deep_links** | **ARRAY[string]** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carousel_destination_urls** | **ARRAY[string]** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carousel_ios_deep_links** | **ARRAY[string]** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**carting_platform_type** | **int** | The vendor platform type of the carting/WTB ad. | [optional] [readonly] 
**carting_products** | [**ARRAY[CartingProduct]**](CartingProduct.md) | Array of carting/WTB products for the ad. | [optional] [readonly] 
**click_tracking_url** | **string** | Tracking url for the ad clicks. | [optional] 
**collection_items_destination_url_template** | **string** | Destination URL template for all items within a collections drawer. | [optional] 
**collections_header_type** | [**AdCollectionsHeaderType**](AdCollectionsHeaderType.md) |  | [optional] 
**created_time** | **int** | Pin creation time. Unix timestamp in seconds. | [optional] [readonly] 
**creative_type** | [**CreativeType**](CreativeType.md) |  | 
**customizable_cta_type** | [**CustomizableCTAType**](CustomizableCTAType.md) |  | [optional] 
**destination_url** | **string** | Destination URL. | [optional] 
**disclosure_type** | [**DisclosureType**](DisclosureType.md) |  | [optional] 
**disclosure_url** | **string** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] 
**grid_click_type** | [**GridClickType**](GridClickType.md) |  | [optional] 
**id** | **string** | The ID of this ad. | 
**ios_deep_link** | **string** | Deep link URL for iOS devices. | [optional] 
**is_carting** | **boolean** | Is the ad a carting/WTB ad? | [optional] 
**is_collage_accepted_terms** | **boolean** | Whether the advertiser has accepted the terms and conditions for collage ad. | [optional] 
**is_collage_single_destination** | **boolean** | Whether the collage ad has a single destination url override. | [optional] 
**is_pin_deleted** | **boolean** | Is original pin deleted? | [optional] 
**is_removable** | **boolean** | Is pin repinnable? | [optional] 
**lead_form_id** | **string** | Lead form ID for lead ad generation. | [optional] 
**name** | **string** | Name of the ad - 255 chars max. | [optional] 
**pin_id** | **string** | Pin ID. This field may only be updated for draft ads. | 
**quiz_pin_data** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] 
**rejected_reasons** | [**ARRAY[AdDisapprovalReasons]**](AdDisapprovalReasons.md) | Enum reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. | [readonly] 
**rejection_labels** | **ARRAY[string]** | Text reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. | [readonly] 
**review_status** | [**AdReviewStatus**](AdReviewStatus.md) | Ad review status | [readonly] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**summary_status** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [readonly] 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**type** | **string** | Always \&quot;ad\&quot;. | [readonly] 
**updated_time** | **int** | Last update time. Unix timestamp in seconds. | [optional] [readonly] 
**view_tracking_url** | **string** | Tracking URL for ad impressions. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


