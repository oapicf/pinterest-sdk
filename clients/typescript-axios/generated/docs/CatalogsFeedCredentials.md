# CatalogsFeedCredentials

This field is **OPTIONAL**. Use this if your feed file requires username and password.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**password** | **string** | The required password for downloading a feed. | [default to undefined]
**username** | **string** | The required username for downloading a feed. | [default to undefined]

## Example

```typescript
import { CatalogsFeedCredentials } from './api';

const instance: CatalogsFeedCredentials = {
    password,
    username,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
