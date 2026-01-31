# AdsCreditRedeemRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_code_hash** | **str** | Takes in a SHA256 hash of the offerCode. | 
**validate_only** | **bool** | If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account | 

## Example

```python
from pinterestsdk.models.ads_credit_redeem_request import AdsCreditRedeemRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AdsCreditRedeemRequest from a JSON string
ads_credit_redeem_request_instance = AdsCreditRedeemRequest.from_json(json)
# print the JSON string representation of the object
print(AdsCreditRedeemRequest.to_json())

# convert the object into a dict
ads_credit_redeem_request_dict = ads_credit_redeem_request_instance.to_dict()
# create an instance of AdsCreditRedeemRequest from a dict
ads_credit_redeem_request_from_dict = AdsCreditRedeemRequest.from_dict(ads_credit_redeem_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


