# AdsCreditRedeem

Ads credit redemption

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errorCode** | **number** | Error code type if error occurs | [optional] [readonly] [default to undefined]
**errorMessage** | **string** | Reason for failure | [optional] [readonly] [default to undefined]
**success** | **boolean** | Returns true if the offer code was successfully applied(validateOnly&#x3D;false) or can be applied(validateOnly&#x3D;true). | [optional] [readonly] [default to undefined]

## Example

```typescript
import { AdsCreditRedeem } from './api';

const instance: AdsCreditRedeem = {
    errorCode,
    errorMessage,
    success,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
