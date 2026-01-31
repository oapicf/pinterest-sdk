# BoardWithUpdatePrivacyUpdate

Resource create or update operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **string** |  | [optional] [default to undefined]
**name** | **string** |      Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | [optional] [default to undefined]
**privacy** | [**BoardUpdatePrivacy**](BoardUpdatePrivacy.md) |  | [optional] [default to undefined]

## Example

```typescript
import { BoardWithUpdatePrivacyUpdate } from './api';

const instance: BoardWithUpdatePrivacyUpdate = {
    description,
    name,
    privacy,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
