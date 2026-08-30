# AmazonConnectRequest

Request containing OTP and Amazon storefront info called by Amazon

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amazon_storefront_id** | **str** | The Amazon storefront id | [optional] 
**amazon_storefront_name** | **str** | The Amazon storefront name | 
**amazon_storefront_url** | **str** | The Amazon storefront url | 
**amazon_user_id** | **str** | The Amazon user id | [optional] 
**is_amazon_account_linked** | **bool** | The Amazon account linking status | 
**one_time_passcode** | **str** | The one time passcode for Pinterest-initiated linking requests | [optional] 
**pinterest_user_id** | **str** | The Pinterest user id for Amazon-initiated linking requests | [optional] 

## Example

```python
from openapi_client.models.amazon_connect_request import AmazonConnectRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AmazonConnectRequest from a JSON string
amazon_connect_request_instance = AmazonConnectRequest.from_json(json)
# print the JSON string representation of the object
print AmazonConnectRequest.to_json()

# convert the object into a dict
amazon_connect_request_dict = amazon_connect_request_instance.to_dict()
# create an instance of AmazonConnectRequest from a dict
amazon_connect_request_from_dict = AmazonConnectRequest.from_dict(amazon_connect_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


