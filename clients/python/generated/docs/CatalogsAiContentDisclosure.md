# CatalogsAiContentDisclosure

AI content disclosure for a single asset of a catalog item.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disclosure** | [**List[CatalogsAiContentDisclosureLabel]**](CatalogsAiContentDisclosureLabel.md) | Disclosure labels that apply to this asset. | 
**url** | **str** | URL of the asset. Must match one of image_link, additional_image_link, or video_link. | 

## Example

```python
from pinterestsdk.models.catalogs_ai_content_disclosure import CatalogsAiContentDisclosure

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsAiContentDisclosure from a JSON string
catalogs_ai_content_disclosure_instance = CatalogsAiContentDisclosure.from_json(json)
# print the JSON string representation of the object
print(CatalogsAiContentDisclosure.to_json())

# convert the object into a dict
catalogs_ai_content_disclosure_dict = catalogs_ai_content_disclosure_instance.to_dict()
# create an instance of CatalogsAiContentDisclosure from a dict
catalogs_ai_content_disclosure_from_dict = CatalogsAiContentDisclosure.from_dict(catalogs_ai_content_disclosure_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


