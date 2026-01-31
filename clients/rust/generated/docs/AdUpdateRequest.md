# AdUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | Option<**String**> | ID of the ad group that contains the ad. | [optional]
**android_deep_link** | Option<**String**> | Deep link URL for Android devices. | [optional]
**carousel_android_deep_links** | Option<**Vec<String>**> | Comma-separated deep links for the carousel pin on Android. | [optional]
**carousel_destination_urls** | Option<**Vec<String>**> | Comma-separated destination URLs for the carousel pin to promote. | [optional]
**carousel_ios_deep_links** | Option<**Vec<String>**> | Comma-separated deep links for the carousel pin on iOS. | [optional]
**click_tracking_url** | Option<**String**> | Tracking url for the ad clicks. | [optional]
**creative_type** | Option<[**models::CreativeType**](CreativeType.md)> |  | [optional]
**customizable_cta_type** | Option<[**models::CustomizableCtaType**](CustomizableCTAType.md)> |  | [optional]
**destination_url** | Option<**String**> | Destination URL. | [optional]
**disclosure_type** | Option<[**models::DisclosureType**](DisclosureType.md)> |  | [optional]
**disclosure_url** | Option<**String**> | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional]
**grid_click_type** | Option<[**models::GridClickType**](GridClickType.md)> |  | [optional]
**ios_deep_link** | Option<**String**> | Deep link URL for iOS devices. | [optional]
**is_pin_deleted** | Option<**bool**> | Is original pin deleted? | [optional]
**is_removable** | Option<**bool**> | Is pin repinnable? | [optional]
**lead_form_id** | Option<**String**> | Lead form ID for lead ad generation. | [optional]
**name** | Option<**String**> | Name of the ad - 255 chars max. | [optional]
**quiz_pin_data** | Option<[**models::QuizPinData**](QuizPinData.md)> | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional]
**status** | Option<[**models::EntityStatus**](EntityStatus.md)> |  | [optional]
**tracking_urls** | Option<[**models::TrackingUrls**](TrackingUrls.md)> |  | [optional]
**view_tracking_url** | Option<**String**> | Tracking URL for ad impressions. | [optional]
**id** | **String** | The ID of this ad. | 
**pin_id** | Option<**String**> | Pin ID. This field may only be updated for draft ads. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


