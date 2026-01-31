# BusinessAccessUserSummary

Metadata of the member/partner that has access to the asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **str** | Email of the business member/partner. | [optional] 
**id** | **str** | Unique identifier of the business member/partner. | [optional] 
**username** | **str** | Username of the business member/partner. | [optional] 

## Example

```python
from pinterestsdk.models.business_access_user_summary import BusinessAccessUserSummary

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessAccessUserSummary from a JSON string
business_access_user_summary_instance = BusinessAccessUserSummary.from_json(json)
# print the JSON string representation of the object
print(BusinessAccessUserSummary.to_json())

# convert the object into a dict
business_access_user_summary_dict = business_access_user_summary_instance.to_dict()
# create an instance of BusinessAccessUserSummary from a dict
business_access_user_summary_from_dict = BusinessAccessUserSummary.from_dict(business_access_user_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


