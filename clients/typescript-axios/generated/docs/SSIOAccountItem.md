# SSIOAccountItem

Salesforce account item with billing and terms information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addresses** | [**Array&lt;SSIOAccountAddress&gt;**](SSIOAccountAddress.md) | Address information that is associated with this account. | [optional] [default to undefined]
**id** | **string** | Salesforce id for billto_info | [optional] [default to undefined]
**io_terms** | **string** | Salesforce text for IO Terms and Conditions | [optional] [default to undefined]
**io_terms_id** | **string** | Salesforce id for IO Terms and Conditions | [optional] [default to undefined]
**io_type** | **string** | Insertion Order Type - Pinterest Paper or Agency Paper | [optional] [default to undefined]
**row_terms** | **string** | Salesforce text for Rest of the World Terms and Conditions | [optional] [default to undefined]
**row_terms_id** | **string** | Salesforce id for Rest of the World Terms and Conditions | [optional] [default to undefined]
**us_terms** | **string** | Salesforce text for US Terms and Conditions | [optional] [default to undefined]
**us_terms_id** | **string** | Salesforce id for US Terms and Conditions | [optional] [default to undefined]

## Example

```typescript
import { SSIOAccountItem } from './api';

const instance: SSIOAccountItem = {
    addresses,
    id,
    io_terms,
    io_terms_id,
    io_type,
    row_terms,
    row_terms_id,
    us_terms,
    us_terms_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
