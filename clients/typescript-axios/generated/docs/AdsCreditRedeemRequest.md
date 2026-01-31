# AdsCreditRedeemRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerCodeHash** | **string** | Takes in a SHA256 hash of the offerCode. | [default to undefined]
**validateOnly** | **boolean** | If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account | [default to undefined]

## Example

```typescript
import { AdsCreditRedeemRequest } from './api';

const instance: AdsCreditRedeemRequest = {
    offerCodeHash,
    validateOnly,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
