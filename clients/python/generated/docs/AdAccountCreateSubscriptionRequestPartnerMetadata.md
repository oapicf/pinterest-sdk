# AdAccountCreateSubscriptionRequestPartnerMetadata

Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subscriber_key** | **str** | Text field value that uniquely identifies a subscriber. | [optional] 

## Example

```python
from pinterestsdk.models.ad_account_create_subscription_request_partner_metadata import AdAccountCreateSubscriptionRequestPartnerMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccountCreateSubscriptionRequestPartnerMetadata from a JSON string
ad_account_create_subscription_request_partner_metadata_instance = AdAccountCreateSubscriptionRequestPartnerMetadata.from_json(json)
# print the JSON string representation of the object
print(AdAccountCreateSubscriptionRequestPartnerMetadata.to_json())

# convert the object into a dict
ad_account_create_subscription_request_partner_metadata_dict = ad_account_create_subscription_request_partner_metadata_instance.to_dict()
# create an instance of AdAccountCreateSubscriptionRequestPartnerMetadata from a dict
ad_account_create_subscription_request_partner_metadata_from_dict = AdAccountCreateSubscriptionRequestPartnerMetadata.from_dict(ad_account_create_subscription_request_partner_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


