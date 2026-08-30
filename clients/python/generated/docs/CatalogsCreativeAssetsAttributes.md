# CatalogsCreativeAssetsAttributes


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**android_deep_link** | **str** | Link to the creative assets page. | [optional] 
**custom_label_0** | **str** | Custom grouping of creative assets. | [optional] 
**custom_label_1** | **str** | Custom grouping of creative assets. | [optional] 
**custom_label_2** | **str** | Custom grouping of creative assets. | [optional] 
**custom_label_3** | **str** | Custom grouping of creative assets. | [optional] 
**custom_label_4** | **str** | Custom grouping of creative assets. | [optional] 
**description** | **str** | Brief description of the creative assets. | [optional] 
**google_product_category** | **str** | The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. | [optional] 
**ios_deep_link** | **str** | IOS deep link to the creative assets page. | [optional] 
**link** | **str** | Link to the creative assets page. | [optional] 
**title** | **str** | The name of the creative assets. | [optional] 
**visibility** | **str** | Visibility of the creative assets. Must be one of the following values (upper or lowercase): &#39;visible&#39;, &#39;hidden&#39;. | [optional] 
**ai_disclosures** | [**List[CatalogsAiContentDisclosure]**](CatalogsAiContentDisclosure.md) | AI content disclosures for individual assets (image_link or video_link) on this creative assets item. Each entry declares which disclosure types apply to a single asset URL. | [optional] 
**image_link** | **str** | The creative assets image. | [optional] 
**video_link** | **str** | The creative assets video. | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_creative_assets_attributes import CatalogsCreativeAssetsAttributes

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreativeAssetsAttributes from a JSON string
catalogs_creative_assets_attributes_instance = CatalogsCreativeAssetsAttributes.from_json(json)
# print the JSON string representation of the object
print(CatalogsCreativeAssetsAttributes.to_json())

# convert the object into a dict
catalogs_creative_assets_attributes_dict = catalogs_creative_assets_attributes_instance.to_dict()
# create an instance of CatalogsCreativeAssetsAttributes from a dict
catalogs_creative_assets_attributes_from_dict = CatalogsCreativeAssetsAttributes.from_dict(catalogs_creative_assets_attributes_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


