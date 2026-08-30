# AdCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **String** | ID of the ad group that contains the ad. | 
**android_deep_link** | **swagger::Nullable<String>** | Deep link URL for Android devices. | [optional] [default to None]
**carousel_android_deep_links** | **swagger::Nullable<Vec<String>>** | Comma-separated deep links for the carousel pin on Android. | [optional] [default to None]
**carousel_destination_urls** | **swagger::Nullable<Vec<String>>** | Comma-separated destination URLs for the carousel pin to promote. | [optional] [default to None]
**carousel_ios_deep_links** | **swagger::Nullable<Vec<String>>** | Comma-separated deep links for the carousel pin on iOS. | [optional] [default to None]
**click_tracking_url** | **swagger::Nullable<String>** | Tracking url for the ad clicks. | [optional] [default to None]
**creative_type** | [***models::CreativeType**](CreativeType.md) |  | 
**customizable_cta_type** | [***swagger::Nullable<models::CustomizableCtaType>**](CustomizableCTAType.md) |  | [optional] [default to None]
**destination_url** | **swagger::Nullable<String>** | Destination URL. | [optional] [default to None]
**disclosure_type** | [***swagger::Nullable<models::DisclosureType>**](DisclosureType.md) |  | [optional] [default to None]
**disclosure_url** | **swagger::Nullable<String>** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] [default to None]
**grid_click_type** | [***swagger::Nullable<models::GridClickType>**](GridClickType.md) |  | [optional] [default to None]
**ios_deep_link** | **swagger::Nullable<String>** | Deep link URL for iOS devices. | [optional] [default to None]
**is_carting** | **bool** | Is the ad a carting/WTB ad? | [optional] [default to None]
**is_pin_deleted** | **bool** | Is original pin deleted? | [optional] [default to None]
**is_removable** | **bool** | Is pin repinnable? | [optional] [default to None]
**lead_form_id** | **swagger::Nullable<String>** | Lead form ID for lead ad generation. | [optional] [default to None]
**name** | **swagger::Nullable<String>** | Name of the ad - 255 chars max. | [optional] [default to None]
**pin_id** | **String** | Pin ID. | 
**quiz_pin_data** | [***serde_json::Value**](.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] [default to None]
**status** | [***models::EntityStatus**](EntityStatus.md) |  | [optional] [default to None]
**tracking_urls** | [***serde_json::Value**](.md) |  | [optional] [default to None]
**view_tracking_url** | **swagger::Nullable<String>** | Tracking URL for ad impressions. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


