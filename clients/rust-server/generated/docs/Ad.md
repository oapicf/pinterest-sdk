# Ad

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **String** | The ID of the advertiser that this ad belongs to. | [readonly] 
**ad_group_id** | **String** | ID of the ad group that contains the ad. | 
**android_deep_link** | **swagger::Nullable<String>** | Deep link URL for Android devices. | [optional] [default to None]
**campaign_id** | **String** | ID of the ad campaign that contains this ad. | [readonly] 
**carousel_android_deep_links** | **swagger::Nullable<Vec<String>>** | Comma-separated deep links for the carousel pin on Android. | [optional] [default to None]
**carousel_destination_urls** | **swagger::Nullable<Vec<String>>** | Comma-separated destination URLs for the carousel pin to promote. | [optional] [default to None]
**carousel_ios_deep_links** | **swagger::Nullable<Vec<String>>** | Comma-separated deep links for the carousel pin on iOS. | [optional] [default to None]
**carting_platform_type** | **u8** | The vendor platform type of the carting/WTB ad. | [optional] [readonly] [default to None]
**carting_products** | [**Vec<models::CartingProduct>**](CartingProduct.md) | Array of carting/WTB products for the ad. | [optional] [readonly] [default to None]
**click_tracking_url** | **swagger::Nullable<String>** | Tracking url for the ad clicks. | [optional] [default to None]
**collection_items_destination_url_template** | **swagger::Nullable<String>** | Destination URL template for all items within a collections drawer. | [optional] [default to None]
**collections_header_type** | [***swagger::Nullable<models::AdCollectionsHeaderType>**](AdCollectionsHeaderType.md) |  | [optional] [default to None]
**created_time** | **i32** | Pin creation time. Unix timestamp in seconds. | [optional] [readonly] [default to None]
**creative_type** | [***models::CreativeType**](CreativeType.md) |  | 
**customizable_cta_type** | [***swagger::Nullable<models::CustomizableCtaType>**](CustomizableCTAType.md) |  | [optional] [default to None]
**destination_url** | **swagger::Nullable<String>** | Destination URL. | [optional] [default to None]
**disclosure_type** | [***swagger::Nullable<models::DisclosureType>**](DisclosureType.md) |  | [optional] [default to None]
**disclosure_url** | **swagger::Nullable<String>** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] [default to None]
**grid_click_type** | [***swagger::Nullable<models::GridClickType>**](GridClickType.md) |  | [optional] [default to None]
**id** | **String** | The ID of this ad. | 
**ios_deep_link** | **swagger::Nullable<String>** | Deep link URL for iOS devices. | [optional] [default to None]
**is_carting** | **bool** | Is the ad a carting/WTB ad? | [optional] [default to None]
**is_collage_accepted_terms** | **bool** | Whether the advertiser has accepted the terms and conditions for collage ad. | [optional] [default to None]
**is_collage_single_destination** | **bool** | Whether the collage ad has a single destination url override. | [optional] [default to None]
**is_pin_deleted** | **bool** | Is original pin deleted? | [optional] [default to None]
**is_removable** | **bool** | Is pin repinnable? | [optional] [default to None]
**lead_form_id** | **swagger::Nullable<String>** | Lead form ID for lead ad generation. | [optional] [default to None]
**name** | **swagger::Nullable<String>** | Name of the ad - 255 chars max. | [optional] [default to None]
**pin_id** | **String** | Pin ID. This field may only be updated for draft ads. | 
**quiz_pin_data** | [***swagger::Nullable<models::QuizPinData>**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] [default to None]
**rejected_reasons** | [**Vec<models::AdDisapprovalReasons>**](AdDisapprovalReasons.md) | Enum reason why the pin was rejected. Returned if `review_status` is \"REJECTED\". | [readonly] 
**rejection_labels** | **Vec<String>** | Text reason why the pin was rejected. Returned if `review_status` is \"REJECTED\". | [readonly] 
**review_status** | [***models::AdReviewStatus**](AdReviewStatus.md) | Ad review status | [readonly] 
**status** | [***models::EntityStatus**](EntityStatus.md) |  | [optional] [default to None]
**summary_status** | [***models::PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [readonly] 
**tracking_urls** | [***swagger::Nullable<models::TrackingUrls>**](TrackingUrls.md) |  | [optional] [default to None]
**r#type** | **String** | Always \"ad\". | [readonly] 
**updated_time** | **i32** | Last update time. Unix timestamp in seconds. | [optional] [readonly] [default to None]
**view_tracking_url** | **swagger::Nullable<String>** | Tracking URL for ad impressions. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


