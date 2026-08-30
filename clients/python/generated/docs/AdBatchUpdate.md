# AdBatchUpdate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **str** | ID of the ad group that contains the ad. | [optional] 
**android_deep_link** | **str** | Deep link URL for Android devices. | [optional] 
**carousel_android_deep_links** | **List[str]** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carousel_destination_urls** | **List[str]** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carousel_ios_deep_links** | **List[str]** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**click_tracking_url** | **str** | Tracking url for the ad clicks. | [optional] 
**collection_items_destination_url_template** | **str** | Destination URL template for all items within a collections drawer. | [optional] 
**collections_header_type** | [**AdCollectionsHeaderType**](AdCollectionsHeaderType.md) |  | [optional] 
**creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] 
**customizable_cta_type** | [**CustomizableCTAType**](CustomizableCTAType.md) |  | [optional] 
**destination_url** | **str** | Destination URL. | [optional] 
**disclosure_type** | [**DisclosureType**](DisclosureType.md) |  | [optional] 
**disclosure_url** | **str** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] 
**grid_click_type** | [**GridClickType**](GridClickType.md) |  | [optional] 
**id** | **str** | The ID of this ad. | 
**ios_deep_link** | **str** | Deep link URL for iOS devices. | [optional] 
**is_carting** | **bool** | Is the ad a carting/WTB ad? | [optional] 
**is_collage_accepted_terms** | **bool** | Whether the advertiser has accepted the terms and conditions for collage ad. | [optional] 
**is_collage_single_destination** | **bool** | Whether the collage ad has a single destination url override. | [optional] 
**is_pin_deleted** | **bool** | Is original pin deleted? | [optional] 
**is_removable** | **bool** | Is pin repinnable? | [optional] 
**lead_form_id** | **str** | Lead form ID for lead ad generation. | [optional] 
**name** | **str** | Name of the ad - 255 chars max. | [optional] 
**pin_id** | **str** | Pin ID. This field may only be updated for draft ads. | [optional] 
**quiz_pin_data** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**view_tracking_url** | **str** | Tracking URL for ad impressions. | [optional] 

## Example

```python
from pinterestsdk.models.ad_batch_update import AdBatchUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of AdBatchUpdate from a JSON string
ad_batch_update_instance = AdBatchUpdate.from_json(json)
# print the JSON string representation of the object
print(AdBatchUpdate.to_json())

# convert the object into a dict
ad_batch_update_dict = ad_batch_update_instance.to_dict()
# create an instance of AdBatchUpdate from a dict
ad_batch_update_from_dict = AdBatchUpdate.from_dict(ad_batch_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


