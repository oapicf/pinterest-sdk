# SSIOAccountResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eligible** | **boolean** | Advertiser eligible to create order lines | [optional] [default to undefined]
**can_edit** | **boolean** | Advertiser eligible to update order lines | [optional] [default to undefined]
**billto_infos** | [**Array&lt;SSIOAccountItem&gt;**](SSIOAccountItem.md) | An array of Salesforce account information that includes address, io terms, etc. | [optional] [default to undefined]
**currency** | **string** |  | [optional] [default to undefined]
**pmp_names** | [**Array&lt;SSIOAccountPMPName&gt;**](SSIOAccountPMPName.md) |  | [optional] [default to undefined]
**error** | **string** | Error indicator from Salesforce which could be \&quot;No Error\&quot; | [optional] [default to undefined]

## Example

```typescript
import { SSIOAccountResponse } from './api';

const instance: SSIOAccountResponse = {
    eligible,
    can_edit,
    billto_infos,
    currency,
    pmp_names,
    error,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
