# AudienceCreateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **str** | Ad account ID. | [optional] 
**name** | **str** | Audience name. | 
**rule** | [**AudienceRule**](AudienceRule.md) |  | 
**audience_type** | [**AudienceType**](AudienceType.md) | &lt;a href&#x3D;\&quot;/docs/reference/glossary/#Audience Types\&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR. Values are case-sensitive. | 
**description** | **str** | Audience description. | [optional] 

## Example

```python
from pinterestsdk.models.audience_create_request import AudienceCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AudienceCreateRequest from a JSON string
audience_create_request_instance = AudienceCreateRequest.from_json(json)
# print the JSON string representation of the object
print(AudienceCreateRequest.to_json())

# convert the object into a dict
audience_create_request_dict = audience_create_request_instance.to_dict()
# create an instance of AudienceCreateRequest from a dict
audience_create_request_from_dict = AudienceCreateRequest.from_dict(audience_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


