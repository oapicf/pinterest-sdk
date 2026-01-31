# AdsCreditRedeemResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error_code** | **int** | Error code type if error occurs | [optional] 
**error_message** | **str** | Reason for failure | [optional] 
**success** | **bool** | Returns true if the offer code was successfully applied(validateOnly&#x3D;false) or can be applied(validateOnly&#x3D;true). | [optional] 

## Example

```python
from pinterestsdk.models.ads_credit_redeem_response import AdsCreditRedeemResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AdsCreditRedeemResponse from a JSON string
ads_credit_redeem_response_instance = AdsCreditRedeemResponse.from_json(json)
# print the JSON string representation of the object
print(AdsCreditRedeemResponse.to_json())

# convert the object into a dict
ads_credit_redeem_response_dict = ads_credit_redeem_response_instance.to_dict()
# create an instance of AdsCreditRedeemResponse from a dict
ads_credit_redeem_response_from_dict = AdsCreditRedeemResponse.from_dict(ads_credit_redeem_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


