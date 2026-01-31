# UserWebsiteSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **str** | Status of the verification process | [optional] 
**verified_at** | **str** | UTC timestamp when the verification happened - sometimes missing | [optional] 
**website** | **str** | Website with path or domain only | [optional] 

## Example

```python
from pinterestsdk.models.user_website_summary import UserWebsiteSummary

# TODO update the JSON string below
json = "{}"
# create an instance of UserWebsiteSummary from a JSON string
user_website_summary_instance = UserWebsiteSummary.from_json(json)
# print the JSON string representation of the object
print(UserWebsiteSummary.to_json())

# convert the object into a dict
user_website_summary_dict = user_website_summary_instance.to_dict()
# create an instance of UserWebsiteSummary from a dict
user_website_summary_from_dict = UserWebsiteSummary.from_dict(user_website_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


