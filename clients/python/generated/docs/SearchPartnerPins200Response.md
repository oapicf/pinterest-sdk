# SearchPartnerPins200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[SummaryPin]**](SummaryPin.md) |  | 

## Example

```python
from pinterestsdk.models.search_partner_pins200_response import SearchPartnerPins200Response

# TODO update the JSON string below
json = "{}"
# create an instance of SearchPartnerPins200Response from a JSON string
search_partner_pins200_response_instance = SearchPartnerPins200Response.from_json(json)
# print the JSON string representation of the object
print(SearchPartnerPins200Response.to_json())

# convert the object into a dict
search_partner_pins200_response_dict = search_partner_pins200_response_instance.to_dict()
# create an instance of SearchPartnerPins200Response from a dict
search_partner_pins200_response_from_dict = SearchPartnerPins200Response.from_dict(search_partner_pins200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


