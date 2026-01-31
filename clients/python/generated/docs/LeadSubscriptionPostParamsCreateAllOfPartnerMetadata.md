# LeadSubscriptionPostParamsCreateAllOfPartnerMetadata

Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subscriber_key** | **str** | Text field value that uniquely identifies a subscriber. | [optional] 

## Example

```python
from pinterestsdk.models.lead_subscription_post_params_create_all_of_partner_metadata import LeadSubscriptionPostParamsCreateAllOfPartnerMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of LeadSubscriptionPostParamsCreateAllOfPartnerMetadata from a JSON string
lead_subscription_post_params_create_all_of_partner_metadata_instance = LeadSubscriptionPostParamsCreateAllOfPartnerMetadata.from_json(json)
# print the JSON string representation of the object
print(LeadSubscriptionPostParamsCreateAllOfPartnerMetadata.to_json())

# convert the object into a dict
lead_subscription_post_params_create_all_of_partner_metadata_dict = lead_subscription_post_params_create_all_of_partner_metadata_instance.to_dict()
# create an instance of LeadSubscriptionPostParamsCreateAllOfPartnerMetadata from a dict
lead_subscription_post_params_create_all_of_partner_metadata_from_dict = LeadSubscriptionPostParamsCreateAllOfPartnerMetadata.from_dict(lead_subscription_post_params_create_all_of_partner_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


