# AdsCreditRedeemCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_code_hash** | **str** | Takes in a SHA256 hash of the offerCode. | 
**validate_only** | **bool** | If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account | 

## Example

```python
from openapi_client.models.ads_credit_redeem_create import AdsCreditRedeemCreate

# TODO update the JSON string below
json = "{}"
# create an instance of AdsCreditRedeemCreate from a JSON string
ads_credit_redeem_create_instance = AdsCreditRedeemCreate.from_json(json)
# print the JSON string representation of the object
print AdsCreditRedeemCreate.to_json()

# convert the object into a dict
ads_credit_redeem_create_dict = ads_credit_redeem_create_instance.to_dict()
# create an instance of AdsCreditRedeemCreate from a dict
ads_credit_redeem_create_from_dict = AdsCreditRedeemCreate.from_dict(ads_credit_redeem_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


