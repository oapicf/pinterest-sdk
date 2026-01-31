# CatalogsFeedIngestionWarnings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR** | **number** | We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. | [optional] [default to undefined]
**ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE** | **number** | Additional image files are unreadable. Please upload new files to continue. | [optional] [default to undefined]
**ADDITIONAL_IMAGE_MALFORMED_URL** | **number** | Additional image files are unreadable. Please check your link and upload new files to continue. | [optional] [default to undefined]
**ADDITIONAL_IMAGE_FILE_NOT_FOUND** | **number** | Additional image files are unreadable. Please upload new files to continue. | [optional] [default to undefined]
**ADDITIONAL_IMAGE_INVALID_FILE** | **number** | Additional image files are unreadable. Please upload new files to continue. | [optional] [default to undefined]
**HOTEL_PRICE_HEADER_IS_PRESENT** | **number** | price is not a supported column. Use base_price and sale_price instead. | [optional] [default to undefined]

## Example

```typescript
import { CatalogsFeedIngestionWarnings } from './api';

const instance: CatalogsFeedIngestionWarnings = {
    ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR,
    ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE,
    ADDITIONAL_IMAGE_MALFORMED_URL,
    ADDITIONAL_IMAGE_FILE_NOT_FOUND,
    ADDITIONAL_IMAGE_INVALID_FILE,
    HOTEL_PRICE_HEADER_IS_PRESENT,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
