# CatalogsFeedIngestionWarnings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR** | Pointer to **int32** | We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. | [optional] 
**ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE** | Pointer to **int32** | Additional image files are unreadable. Please upload new files to continue. | [optional] 
**ADDITIONAL_IMAGE_MALFORMED_URL** | Pointer to **int32** | Additional image files are unreadable. Please check your link and upload new files to continue. | [optional] 
**ADDITIONAL_IMAGE_FILE_NOT_FOUND** | Pointer to **int32** | Additional image files are unreadable. Please upload new files to continue. | [optional] 
**ADDITIONAL_IMAGE_INVALID_FILE** | Pointer to **int32** | Additional image files are unreadable. Please upload new files to continue. | [optional] 
**HOTEL_PRICE_HEADER_IS_PRESENT** | Pointer to **int32** | price is not a supported column. Use base_price and sale_price instead. | [optional] 

## Methods

### NewCatalogsFeedIngestionWarnings

`func NewCatalogsFeedIngestionWarnings() *CatalogsFeedIngestionWarnings`

NewCatalogsFeedIngestionWarnings instantiates a new CatalogsFeedIngestionWarnings object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsFeedIngestionWarningsWithDefaults

`func NewCatalogsFeedIngestionWarningsWithDefaults() *CatalogsFeedIngestionWarnings`

NewCatalogsFeedIngestionWarningsWithDefaults instantiates a new CatalogsFeedIngestionWarnings object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR

`func (o *CatalogsFeedIngestionWarnings) GetADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR() int32`

GetADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR returns the ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR field if non-nil, zero value otherwise.

### GetADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROROk

`func (o *CatalogsFeedIngestionWarnings) GetADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROROk() (*int32, bool)`

GetADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROROk returns a tuple with the ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR

`func (o *CatalogsFeedIngestionWarnings) SetADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR(v int32)`

SetADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR sets ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR field to given value.

### HasADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR

`func (o *CatalogsFeedIngestionWarnings) HasADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR() bool`

HasADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR returns a boolean if a field has been set.

### GetADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE

`func (o *CatalogsFeedIngestionWarnings) GetADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE() int32`

GetADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE returns the ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE field if non-nil, zero value otherwise.

### GetADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLEOk

`func (o *CatalogsFeedIngestionWarnings) GetADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLEOk() (*int32, bool)`

GetADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLEOk returns a tuple with the ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE

`func (o *CatalogsFeedIngestionWarnings) SetADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE(v int32)`

SetADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE sets ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE field to given value.

### HasADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE

`func (o *CatalogsFeedIngestionWarnings) HasADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE() bool`

HasADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE returns a boolean if a field has been set.

### GetADDITIONAL_IMAGE_MALFORMED_URL

`func (o *CatalogsFeedIngestionWarnings) GetADDITIONAL_IMAGE_MALFORMED_URL() int32`

GetADDITIONAL_IMAGE_MALFORMED_URL returns the ADDITIONAL_IMAGE_MALFORMED_URL field if non-nil, zero value otherwise.

### GetADDITIONAL_IMAGE_MALFORMED_URLOk

`func (o *CatalogsFeedIngestionWarnings) GetADDITIONAL_IMAGE_MALFORMED_URLOk() (*int32, bool)`

GetADDITIONAL_IMAGE_MALFORMED_URLOk returns a tuple with the ADDITIONAL_IMAGE_MALFORMED_URL field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetADDITIONAL_IMAGE_MALFORMED_URL

`func (o *CatalogsFeedIngestionWarnings) SetADDITIONAL_IMAGE_MALFORMED_URL(v int32)`

SetADDITIONAL_IMAGE_MALFORMED_URL sets ADDITIONAL_IMAGE_MALFORMED_URL field to given value.

### HasADDITIONAL_IMAGE_MALFORMED_URL

`func (o *CatalogsFeedIngestionWarnings) HasADDITIONAL_IMAGE_MALFORMED_URL() bool`

HasADDITIONAL_IMAGE_MALFORMED_URL returns a boolean if a field has been set.

### GetADDITIONAL_IMAGE_FILE_NOT_FOUND

`func (o *CatalogsFeedIngestionWarnings) GetADDITIONAL_IMAGE_FILE_NOT_FOUND() int32`

GetADDITIONAL_IMAGE_FILE_NOT_FOUND returns the ADDITIONAL_IMAGE_FILE_NOT_FOUND field if non-nil, zero value otherwise.

### GetADDITIONAL_IMAGE_FILE_NOT_FOUNDOk

`func (o *CatalogsFeedIngestionWarnings) GetADDITIONAL_IMAGE_FILE_NOT_FOUNDOk() (*int32, bool)`

GetADDITIONAL_IMAGE_FILE_NOT_FOUNDOk returns a tuple with the ADDITIONAL_IMAGE_FILE_NOT_FOUND field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetADDITIONAL_IMAGE_FILE_NOT_FOUND

`func (o *CatalogsFeedIngestionWarnings) SetADDITIONAL_IMAGE_FILE_NOT_FOUND(v int32)`

SetADDITIONAL_IMAGE_FILE_NOT_FOUND sets ADDITIONAL_IMAGE_FILE_NOT_FOUND field to given value.

### HasADDITIONAL_IMAGE_FILE_NOT_FOUND

`func (o *CatalogsFeedIngestionWarnings) HasADDITIONAL_IMAGE_FILE_NOT_FOUND() bool`

HasADDITIONAL_IMAGE_FILE_NOT_FOUND returns a boolean if a field has been set.

### GetADDITIONAL_IMAGE_INVALID_FILE

`func (o *CatalogsFeedIngestionWarnings) GetADDITIONAL_IMAGE_INVALID_FILE() int32`

GetADDITIONAL_IMAGE_INVALID_FILE returns the ADDITIONAL_IMAGE_INVALID_FILE field if non-nil, zero value otherwise.

### GetADDITIONAL_IMAGE_INVALID_FILEOk

`func (o *CatalogsFeedIngestionWarnings) GetADDITIONAL_IMAGE_INVALID_FILEOk() (*int32, bool)`

GetADDITIONAL_IMAGE_INVALID_FILEOk returns a tuple with the ADDITIONAL_IMAGE_INVALID_FILE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetADDITIONAL_IMAGE_INVALID_FILE

`func (o *CatalogsFeedIngestionWarnings) SetADDITIONAL_IMAGE_INVALID_FILE(v int32)`

SetADDITIONAL_IMAGE_INVALID_FILE sets ADDITIONAL_IMAGE_INVALID_FILE field to given value.

### HasADDITIONAL_IMAGE_INVALID_FILE

`func (o *CatalogsFeedIngestionWarnings) HasADDITIONAL_IMAGE_INVALID_FILE() bool`

HasADDITIONAL_IMAGE_INVALID_FILE returns a boolean if a field has been set.

### GetHOTEL_PRICE_HEADER_IS_PRESENT

`func (o *CatalogsFeedIngestionWarnings) GetHOTEL_PRICE_HEADER_IS_PRESENT() int32`

GetHOTEL_PRICE_HEADER_IS_PRESENT returns the HOTEL_PRICE_HEADER_IS_PRESENT field if non-nil, zero value otherwise.

### GetHOTEL_PRICE_HEADER_IS_PRESENTOk

`func (o *CatalogsFeedIngestionWarnings) GetHOTEL_PRICE_HEADER_IS_PRESENTOk() (*int32, bool)`

GetHOTEL_PRICE_HEADER_IS_PRESENTOk returns a tuple with the HOTEL_PRICE_HEADER_IS_PRESENT field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHOTEL_PRICE_HEADER_IS_PRESENT

`func (o *CatalogsFeedIngestionWarnings) SetHOTEL_PRICE_HEADER_IS_PRESENT(v int32)`

SetHOTEL_PRICE_HEADER_IS_PRESENT sets HOTEL_PRICE_HEADER_IS_PRESENT field to given value.

### HasHOTEL_PRICE_HEADER_IS_PRESENT

`func (o *CatalogsFeedIngestionWarnings) HasHOTEL_PRICE_HEADER_IS_PRESENT() bool`

HasHOTEL_PRICE_HEADER_IS_PRESENT returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


