# AdsCreditRedeemResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errorCode** | **number** | Error code type if error occurs | [optional] [default to undefined]
**errorMessage** | **string** | Reason for failure | [optional] [default to undefined]
**success** | **boolean** | Returns true if the offer code was successfully applied(validateOnly&#x3D;false) or can be applied(validateOnly&#x3D;true). | [optional] [default to undefined]

## Example

```typescript
import { AdsCreditRedeemResponse } from './api';

const instance: AdsCreditRedeemResponse = {
    errorCode,
    errorMessage,
    success,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
