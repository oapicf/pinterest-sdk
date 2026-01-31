# CatalogsFeedIngestionErrors


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LINE_LEVEL_INTERNAL_ERROR** | **number** | We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. | [optional] [default to undefined]
**LARGE_PRODUCT_COUNT_DECREASE** | **number** | The product count has decreased by more than 99% compared to the last successful ingestion. | [optional] [default to undefined]
**ACCOUNT_FLAGGED** | **number** | We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. | [optional] [default to undefined]
**IMAGE_LEVEL_INTERNAL_ERROR** | **number** | We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours. | [optional] [default to undefined]
**IMAGE_FILE_NOT_ACCESSIBLE** | **number** | Image files are unreadable. Please upload new files to continue. | [optional] [default to undefined]
**IMAGE_MALFORMED_URL** | **number** | Image files are unreadable. Please check your link and upload new files to continue. | [optional] [default to undefined]
**IMAGE_FILE_NOT_FOUND** | **number** | Image files are unreadable. Please upload new files to continue. | [optional] [default to undefined]
**IMAGE_INVALID_FILE** | **number** | Image files are unreadable. Please upload new files to continue. | [optional] [default to undefined]

## Example

```typescript
import { CatalogsFeedIngestionErrors } from './api';

const instance: CatalogsFeedIngestionErrors = {
    LINE_LEVEL_INTERNAL_ERROR,
    LARGE_PRODUCT_COUNT_DECREASE,
    ACCOUNT_FLAGGED,
    IMAGE_LEVEL_INTERNAL_ERROR,
    IMAGE_FILE_NOT_ACCESSIBLE,
    IMAGE_MALFORMED_URL,
    IMAGE_FILE_NOT_FOUND,
    IMAGE_INVALID_FILE,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
