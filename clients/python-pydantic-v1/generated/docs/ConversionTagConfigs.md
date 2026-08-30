# ConversionTagConfigs


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
**no_code_capi_domains** | **List[str]** | List of advertiser subdomains configured for NoCodeCAPI calls. | [optional] 

## Example

```python
from openapi_client.models.conversion_tag_configs import ConversionTagConfigs

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionTagConfigs from a JSON string
conversion_tag_configs_instance = ConversionTagConfigs.from_json(json)
# print the JSON string representation of the object
print ConversionTagConfigs.to_json()

# convert the object into a dict
conversion_tag_configs_dict = conversion_tag_configs_instance.to_dict()
# create an instance of ConversionTagConfigs from a dict
conversion_tag_configs_from_dict = ConversionTagConfigs.from_dict(conversion_tag_configs_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


