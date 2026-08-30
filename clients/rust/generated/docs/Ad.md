# Ad

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **String** | The ID of the advertiser that this ad belongs to. | [readonly]
**ad_group_id** | **String** | ID of the ad group that contains the ad. | 
**android_deep_link** | Option<**String**> | Deep link URL for Android devices. | [optional]
**campaign_id** | **String** | ID of the ad campaign that contains this ad. | [readonly]
**carousel_android_deep_links** | Option<**Vec<String>**> | Comma-separated deep links for the carousel pin on Android. | [optional]
**carousel_destination_urls** | Option<**Vec<String>**> | Comma-separated destination URLs for the carousel pin to promote. | [optional]
**carousel_ios_deep_links** | Option<**Vec<String>**> | Comma-separated deep links for the carousel pin on iOS. | [optional]
**carting_platform_type** | Option<**i32**> | The vendor platform type of the carting/WTB ad. | [optional][readonly]
**carting_products** | Option<[**Vec<models::CartingProduct>**](CartingProduct.md)> | Array of carting/WTB products for the ad. | [optional][readonly]
**click_tracking_url** | Option<**String**> | Tracking url for the ad clicks. | [optional]
**collection_items_destination_url_template** | Option<**String**> | Destination URL template for all items within a collections drawer. | [optional]
**collections_header_type** | Option<[**models::AdCollectionsHeaderType**](AdCollectionsHeaderType.md)> |  | [optional]
**created_time** | Option<**i32**> | Pin creation time. Unix timestamp in seconds. | [optional][readonly]
**creative_type** | [**models::CreativeType**](CreativeType.md) |  | 
**customizable_cta_type** | Option<[**models::CustomizableCtaType**](CustomizableCTAType.md)> |  | [optional]
**destination_url** | Option<**String**> | Destination URL. | [optional]
**disclosure_type** | Option<[**models::DisclosureType**](DisclosureType.md)> |  | [optional]
**disclosure_url** | Option<**String**> | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional]
**grid_click_type** | Option<[**models::GridClickType**](GridClickType.md)> |  | [optional]
**id** | **String** | The ID of this ad. | 
**ios_deep_link** | Option<**String**> | Deep link URL for iOS devices. | [optional]
**is_carting** | Option<**bool**> | Is the ad a carting/WTB ad? | [optional]
**is_collage_accepted_terms** | Option<**bool**> | Whether the advertiser has accepted the terms and conditions for collage ad. | [optional]
**is_collage_single_destination** | Option<**bool**> | Whether the collage ad has a single destination url override. | [optional]
**is_pin_deleted** | Option<**bool**> | Is original pin deleted? | [optional]
**is_removable** | Option<**bool**> | Is pin repinnable? | [optional]
**lead_form_id** | Option<**String**> | Lead form ID for lead ad generation. | [optional]
**name** | Option<**String**> | Name of the ad - 255 chars max. | [optional]
**pin_id** | **String** | Pin ID. This field may only be updated for draft ads. | 
**quiz_pin_data** | Option<[**models::QuizPinData**](QuizPinData.md)> | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional]
**rejected_reasons** | [**Vec<models::AdDisapprovalReasons>**](AdDisapprovalReasons.md) | Enum reason why the pin was rejected. Returned if `review_status` is \"REJECTED\". | [readonly]
**rejection_labels** | **Vec<String>** | Text reason why the pin was rejected. Returned if `review_status` is \"REJECTED\". | [readonly]
**review_status** | [**models::AdReviewStatus**](AdReviewStatus.md) | Ad review status | [readonly]
**status** | Option<[**models::EntityStatus**](EntityStatus.md)> |  | [optional]
**summary_status** | [**models::PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [readonly]
**tracking_urls** | Option<[**models::TrackingUrls**](TrackingUrls.md)> |  | [optional]
**r#type** | **String** | Always \"ad\". | [readonly]
**updated_time** | Option<**i32**> | Last update time. Unix timestamp in seconds. | [optional][readonly]
**view_tracking_url** | Option<**String**> | Tracking URL for ad impressions. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


