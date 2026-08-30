# AdUpdateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The ID of this ad. | 
**pin_id** | **str** | Pin ID. This field may only be updated for draft ads. | [optional] 
**ad_group_id** | **str** | ID of the ad group that contains the ad. | [optional] 
**android_deep_link** | **str** | Deep link URL for Android devices. | [optional] 
**carousel_android_deep_links** | **List[str]** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carousel_destination_urls** | **List[str]** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carousel_ios_deep_links** | **List[str]** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**click_tracking_url** | **str** | Tracking url for the ad clicks. | [optional] 
**creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] 
**customizable_cta_type** | [**CustomizableCTAType**](CustomizableCTAType.md) |  | [optional] 
**destination_url** | **str** | Destination URL. | [optional] 
**disclosure_type** | [**DisclosureType**](DisclosureType.md) |  | [optional] 
**disclosure_url** | **str** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] 
**grid_click_type** | [**GridClickType**](GridClickType.md) |  | [optional] 
**ios_deep_link** | **str** | Deep link URL for iOS devices. | [optional] 
**is_carting** | **bool** | Is the ad a carting/WTB ad? | [optional] 
**is_pin_deleted** | **bool** | Is original pin deleted? | [optional] 
**is_removable** | **bool** | Is pin repinnable? | [optional] 
**lead_form_id** | **str** | Lead form ID for lead ad generation. | [optional] 
**name** | **str** | Name of the ad - 255 chars max. | [optional] 
**quiz_pin_data** | **object** | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**tracking_urls** | **object** |  | [optional] 
**view_tracking_url** | **str** | Tracking URL for ad impressions. | [optional] 

## Example

```python
from pinterestsdk.models.ad_update_request import AdUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AdUpdateRequest from a JSON string
ad_update_request_instance = AdUpdateRequest.from_json(json)
# print the JSON string representation of the object
print(AdUpdateRequest.to_json())

# convert the object into a dict
ad_update_request_dict = ad_update_request_instance.to_dict()
# create an instance of AdUpdateRequest from a dict
ad_update_request_from_dict = AdUpdateRequest.from_dict(ad_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


