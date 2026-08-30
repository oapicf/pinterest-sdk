# AdsCreditRedeem

Ads credit redemption

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error_code** | **int** | Error code type if error occurs | [optional] [readonly] 
**error_message** | **str** | Reason for failure | [optional] [readonly] 
**success** | **bool** | Returns true if the offer code was successfully applied(validateOnly&#x3D;false) or can be applied(validateOnly&#x3D;true). | [optional] [readonly] 

## Example

```python
from pinterestsdk.models.ads_credit_redeem import AdsCreditRedeem

# TODO update the JSON string below
json = "{}"
# create an instance of AdsCreditRedeem from a JSON string
ads_credit_redeem_instance = AdsCreditRedeem.from_json(json)
# print the JSON string representation of the object
print(AdsCreditRedeem.to_json())

# convert the object into a dict
ads_credit_redeem_dict = ads_credit_redeem_instance.to_dict()
# create an instance of AdsCreditRedeem from a dict
ads_credit_redeem_from_dict = AdsCreditRedeem.from_dict(ads_credit_redeem_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


