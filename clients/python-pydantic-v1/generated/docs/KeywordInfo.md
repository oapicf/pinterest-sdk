# KeywordInfo

Related Keyword information of the editorial article

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Keyword Name | 
**pct_growth_mom** | **float** | MoM growth as a percentage, if there is no growth rate, this field is not present | [optional] 

## Example

```python
from openapi_client.models.keyword_info import KeywordInfo

# TODO update the JSON string below
json = "{}"
# create an instance of KeywordInfo from a JSON string
keyword_info_instance = KeywordInfo.from_json(json)
# print the JSON string representation of the object
print KeywordInfo.to_json()

# convert the object into a dict
keyword_info_dict = keyword_info_instance.to_dict()
# create an instance of KeywordInfo from a dict
keyword_info_from_dict = KeywordInfo.from_dict(keyword_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


