# ad_create_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **char \*** | ID of the ad group that contains the ad. | 
**android_deep_link** | **char \*** | Deep link URL for Android devices. | [optional] 
**carousel_android_deep_links** | **list_t \*** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carousel_destination_urls** | **list_t \*** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carousel_ios_deep_links** | **list_t \*** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**click_tracking_url** | **char \*** | Tracking url for the ad clicks. | [optional] 
**collection_items_destination_url_template** | **char \*** | Destination URL template for all items within a collections drawer. | [optional] 
**collections_header_type** | **ad_collections_header_type_t \*** |  | [optional] 
**creative_type** | **creative_type_t \*** |  | 
**customizable_cta_type** | **customizable_cta_type_t \*** |  | [optional] 
**destination_url** | **char \*** | Destination URL. | [optional] 
**disclosure_type** | **disclosure_type_t \*** |  | [optional] 
**disclosure_url** | **char \*** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] 
**grid_click_type** | **grid_click_type_t \*** |  | [optional] 
**ios_deep_link** | **char \*** | Deep link URL for iOS devices. | [optional] 
**is_carting** | **int** | Is the ad a carting/WTB ad? | [optional] 
**is_collage_accepted_terms** | **int** | Whether the advertiser has accepted the terms and conditions for collage ad. | [optional] 
**is_collage_single_destination** | **int** | Whether the collage ad has a single destination url override. | [optional] 
**is_pin_deleted** | **int** | Is original pin deleted? | [optional] 
**is_removable** | **int** | Is pin repinnable? | [optional] 
**lead_form_id** | **char \*** | Lead form ID for lead ad generation. | [optional] 
**name** | **char \*** | Name of the ad - 255 chars max. | [optional] 
**pin_id** | **char \*** | Pin ID. This field may only be updated for draft ads. | 
**quiz_pin_data** | [**quiz_pin_data_t**](quiz_pin_data.md) \* | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] 
**status** | **entity_status_t \*** |  | [optional] 
**tracking_urls** | [**tracking_urls_t**](tracking_urls.md) \* |  | [optional] 
**view_tracking_url** | **char \*** | Tracking URL for ad impressions. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


