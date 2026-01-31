# openapi::AmazonConnectRequest

Request containing OTP and Amazon storefront info called by Amazon

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amazon_storefront_id** | **character** | The Amazon storefront id | [optional] 
**amazon_storefront_name** | **character** | The Amazon storefront name | 
**amazon_storefront_url** | **character** | The Amazon storefront url | 
**amazon_user_id** | **character** | The Amazon user id | [optional] 
**is_amazon_account_linked** | **character** | The Amazon account linking status | 
**one_time_passcode** | **character** | The one time passcode for Pinterest-initiated linking requests | [optional] 
**pinterest_user_id** | **character** | The Pinterest user id for Amazon-initiated linking requests | [optional] [Pattern: ^\\d+$] 


