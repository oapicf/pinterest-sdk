# AppsflyerAudience

Request model for creating an AppsFlyer audience

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**container_id** | **string** | The ID of the audience container | [readonly] [default to undefined]
**name** | **string** | The name of the audience | [default to undefined]
**platform** | [**AppsflyerPlatform**](AppsflyerPlatform.md) | The platform of the audience | [default to undefined]

## Example

```typescript
import { AppsflyerAudience } from './api';

const instance: AppsflyerAudience = {
    container_id,
    name,
    platform,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
