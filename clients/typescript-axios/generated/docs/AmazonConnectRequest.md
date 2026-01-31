# AmazonConnectRequest

Request containing OTP and Amazon storefront info called by Amazon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amazon_storefront_id** | **string** | The Amazon storefront id | [optional] [default to undefined]
**amazon_storefront_name** | **string** | The Amazon storefront name | [default to undefined]
**amazon_storefront_url** | **string** | The Amazon storefront url | [default to undefined]
**amazon_user_id** | **string** | The Amazon user id | [optional] [default to undefined]
**is_amazon_account_linked** | **boolean** | The Amazon account linking status | [default to undefined]
**one_time_passcode** | **string** | The one time passcode for Pinterest-initiated linking requests | [optional] [default to undefined]
**pinterest_user_id** | **string** | The Pinterest user id for Amazon-initiated linking requests | [optional] [default to undefined]

## Example

```typescript
import { AmazonConnectRequest } from './api';

const instance: AmazonConnectRequest = {
    amazon_storefront_id,
    amazon_storefront_name,
    amazon_storefront_url,
    amazon_user_id,
    is_amazon_account_linked,
    one_time_passcode,
    pinterest_user_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
