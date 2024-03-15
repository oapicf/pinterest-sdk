
# Table `CatalogsFeedIngestionWarnings`
(mapped from: CatalogsFeedIngestionWarnings)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR** | ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR | int |  | **kotlin.Int** | We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. |  [optional]
**ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE** | ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE | int |  | **kotlin.Int** | Additional image files are unreadable. Please upload new files to continue. |  [optional]
**ADDITIONAL_IMAGE_MALFORMED_URL** | ADDITIONAL_IMAGE_MALFORMED_URL | int |  | **kotlin.Int** | Additional image files are unreadable. Please check your link and upload new files to continue. |  [optional]
**ADDITIONAL_IMAGE_FILE_NOT_FOUND** | ADDITIONAL_IMAGE_FILE_NOT_FOUND | int |  | **kotlin.Int** | Additional image files are unreadable. Please upload new files to continue. |  [optional]
**ADDITIONAL_IMAGE_INVALID_FILE** | ADDITIONAL_IMAGE_INVALID_FILE | int |  | **kotlin.Int** | Additional image files are unreadable. Please upload new files to continue. |  [optional]
**HOTEL_PRICE_HEADER_IS_PRESENT** | HOTEL_PRICE_HEADER_IS_PRESENT | int |  | **kotlin.Int** | price is not a supported column. Use base_price and sale_price instead. |  [optional]








