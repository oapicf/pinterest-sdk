# PartnerMetadata


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subscriber_key** | **str** | Text field value that uniquely identifies a subscriber. | [optional] 

## Example

```python
from pinterestsdk.models.partner_metadata import PartnerMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of PartnerMetadata from a JSON string
partner_metadata_instance = PartnerMetadata.from_json(json)
# print the JSON string representation of the object
print(PartnerMetadata.to_json())

# convert the object into a dict
partner_metadata_dict = partner_metadata_instance.to_dict()
# create an instance of PartnerMetadata from a dict
partner_metadata_from_dict = PartnerMetadata.from_dict(partner_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


