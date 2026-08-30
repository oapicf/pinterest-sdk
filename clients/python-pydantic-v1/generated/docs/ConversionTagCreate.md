# ConversionTagCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aem_db_enabled** | **bool** | Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional] [default to False]
**aem_enabled** | **bool** | Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional] [default to False]
**aem_external_id_enabled** | **bool** | Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional] [default to False]
**aem_fnln_enabled** | **bool** | Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional] [default to False]
**aem_ge_enabled** | **bool** | Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional] [default to False]
**aem_loc_enabled** | **bool** | Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional] [default to False]
**aem_ph_enabled** | **bool** | Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional] [default to False]
**md_frequency** | **float** | Metadata ingestion frequency. | [optional] [default to 1]
**name** | **str** | Conversion tag name. | 

## Example

```python
from openapi_client.models.conversion_tag_create import ConversionTagCreate

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionTagCreate from a JSON string
conversion_tag_create_instance = ConversionTagCreate.from_json(json)
# print the JSON string representation of the object
print ConversionTagCreate.to_json()

# convert the object into a dict
conversion_tag_create_dict = conversion_tag_create_instance.to_dict()
# create an instance of ConversionTagCreate from a dict
conversion_tag_create_from_dict = ConversionTagCreate.from_dict(conversion_tag_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


