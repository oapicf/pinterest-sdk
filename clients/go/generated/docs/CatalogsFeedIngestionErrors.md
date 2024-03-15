# CatalogsFeedIngestionErrors

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LINE_LEVEL_INTERNAL_ERROR** | Pointer to **int32** | We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. | [optional] 
**LARGE_PRODUCT_COUNT_DECREASE** | Pointer to **int32** | The product count has decreased by more than 99% compared to the last successful ingestion. | [optional] 
**ACCOUNT_FLAGGED** | Pointer to **int32** | We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. | [optional] 
**IMAGE_LEVEL_INTERNAL_ERROR** | Pointer to **int32** | We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours. | [optional] 
**IMAGE_FILE_NOT_ACCESSIBLE** | Pointer to **int32** | Image files are unreadable. Please upload new files to continue. | [optional] 
**IMAGE_MALFORMED_URL** | Pointer to **int32** | Image files are unreadable. Please check your link and upload new files to continue. | [optional] 
**IMAGE_FILE_NOT_FOUND** | Pointer to **int32** | Image files are unreadable. Please upload new files to continue. | [optional] 
**IMAGE_INVALID_FILE** | Pointer to **int32** | Image files are unreadable. Please upload new files to continue. | [optional] 

## Methods

### NewCatalogsFeedIngestionErrors

`func NewCatalogsFeedIngestionErrors() *CatalogsFeedIngestionErrors`

NewCatalogsFeedIngestionErrors instantiates a new CatalogsFeedIngestionErrors object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsFeedIngestionErrorsWithDefaults

`func NewCatalogsFeedIngestionErrorsWithDefaults() *CatalogsFeedIngestionErrors`

NewCatalogsFeedIngestionErrorsWithDefaults instantiates a new CatalogsFeedIngestionErrors object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLINE_LEVEL_INTERNAL_ERROR

`func (o *CatalogsFeedIngestionErrors) GetLINE_LEVEL_INTERNAL_ERROR() int32`

GetLINE_LEVEL_INTERNAL_ERROR returns the LINE_LEVEL_INTERNAL_ERROR field if non-nil, zero value otherwise.

### GetLINE_LEVEL_INTERNAL_ERROROk

`func (o *CatalogsFeedIngestionErrors) GetLINE_LEVEL_INTERNAL_ERROROk() (*int32, bool)`

GetLINE_LEVEL_INTERNAL_ERROROk returns a tuple with the LINE_LEVEL_INTERNAL_ERROR field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLINE_LEVEL_INTERNAL_ERROR

`func (o *CatalogsFeedIngestionErrors) SetLINE_LEVEL_INTERNAL_ERROR(v int32)`

SetLINE_LEVEL_INTERNAL_ERROR sets LINE_LEVEL_INTERNAL_ERROR field to given value.

### HasLINE_LEVEL_INTERNAL_ERROR

`func (o *CatalogsFeedIngestionErrors) HasLINE_LEVEL_INTERNAL_ERROR() bool`

HasLINE_LEVEL_INTERNAL_ERROR returns a boolean if a field has been set.

### GetLARGE_PRODUCT_COUNT_DECREASE

`func (o *CatalogsFeedIngestionErrors) GetLARGE_PRODUCT_COUNT_DECREASE() int32`

GetLARGE_PRODUCT_COUNT_DECREASE returns the LARGE_PRODUCT_COUNT_DECREASE field if non-nil, zero value otherwise.

### GetLARGE_PRODUCT_COUNT_DECREASEOk

`func (o *CatalogsFeedIngestionErrors) GetLARGE_PRODUCT_COUNT_DECREASEOk() (*int32, bool)`

GetLARGE_PRODUCT_COUNT_DECREASEOk returns a tuple with the LARGE_PRODUCT_COUNT_DECREASE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLARGE_PRODUCT_COUNT_DECREASE

`func (o *CatalogsFeedIngestionErrors) SetLARGE_PRODUCT_COUNT_DECREASE(v int32)`

SetLARGE_PRODUCT_COUNT_DECREASE sets LARGE_PRODUCT_COUNT_DECREASE field to given value.

### HasLARGE_PRODUCT_COUNT_DECREASE

`func (o *CatalogsFeedIngestionErrors) HasLARGE_PRODUCT_COUNT_DECREASE() bool`

HasLARGE_PRODUCT_COUNT_DECREASE returns a boolean if a field has been set.

### GetACCOUNT_FLAGGED

`func (o *CatalogsFeedIngestionErrors) GetACCOUNT_FLAGGED() int32`

GetACCOUNT_FLAGGED returns the ACCOUNT_FLAGGED field if non-nil, zero value otherwise.

### GetACCOUNT_FLAGGEDOk

`func (o *CatalogsFeedIngestionErrors) GetACCOUNT_FLAGGEDOk() (*int32, bool)`

GetACCOUNT_FLAGGEDOk returns a tuple with the ACCOUNT_FLAGGED field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetACCOUNT_FLAGGED

`func (o *CatalogsFeedIngestionErrors) SetACCOUNT_FLAGGED(v int32)`

SetACCOUNT_FLAGGED sets ACCOUNT_FLAGGED field to given value.

### HasACCOUNT_FLAGGED

`func (o *CatalogsFeedIngestionErrors) HasACCOUNT_FLAGGED() bool`

HasACCOUNT_FLAGGED returns a boolean if a field has been set.

### GetIMAGE_LEVEL_INTERNAL_ERROR

`func (o *CatalogsFeedIngestionErrors) GetIMAGE_LEVEL_INTERNAL_ERROR() int32`

GetIMAGE_LEVEL_INTERNAL_ERROR returns the IMAGE_LEVEL_INTERNAL_ERROR field if non-nil, zero value otherwise.

### GetIMAGE_LEVEL_INTERNAL_ERROROk

`func (o *CatalogsFeedIngestionErrors) GetIMAGE_LEVEL_INTERNAL_ERROROk() (*int32, bool)`

GetIMAGE_LEVEL_INTERNAL_ERROROk returns a tuple with the IMAGE_LEVEL_INTERNAL_ERROR field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIMAGE_LEVEL_INTERNAL_ERROR

`func (o *CatalogsFeedIngestionErrors) SetIMAGE_LEVEL_INTERNAL_ERROR(v int32)`

SetIMAGE_LEVEL_INTERNAL_ERROR sets IMAGE_LEVEL_INTERNAL_ERROR field to given value.

### HasIMAGE_LEVEL_INTERNAL_ERROR

`func (o *CatalogsFeedIngestionErrors) HasIMAGE_LEVEL_INTERNAL_ERROR() bool`

HasIMAGE_LEVEL_INTERNAL_ERROR returns a boolean if a field has been set.

### GetIMAGE_FILE_NOT_ACCESSIBLE

`func (o *CatalogsFeedIngestionErrors) GetIMAGE_FILE_NOT_ACCESSIBLE() int32`

GetIMAGE_FILE_NOT_ACCESSIBLE returns the IMAGE_FILE_NOT_ACCESSIBLE field if non-nil, zero value otherwise.

### GetIMAGE_FILE_NOT_ACCESSIBLEOk

`func (o *CatalogsFeedIngestionErrors) GetIMAGE_FILE_NOT_ACCESSIBLEOk() (*int32, bool)`

GetIMAGE_FILE_NOT_ACCESSIBLEOk returns a tuple with the IMAGE_FILE_NOT_ACCESSIBLE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIMAGE_FILE_NOT_ACCESSIBLE

`func (o *CatalogsFeedIngestionErrors) SetIMAGE_FILE_NOT_ACCESSIBLE(v int32)`

SetIMAGE_FILE_NOT_ACCESSIBLE sets IMAGE_FILE_NOT_ACCESSIBLE field to given value.

### HasIMAGE_FILE_NOT_ACCESSIBLE

`func (o *CatalogsFeedIngestionErrors) HasIMAGE_FILE_NOT_ACCESSIBLE() bool`

HasIMAGE_FILE_NOT_ACCESSIBLE returns a boolean if a field has been set.

### GetIMAGE_MALFORMED_URL

`func (o *CatalogsFeedIngestionErrors) GetIMAGE_MALFORMED_URL() int32`

GetIMAGE_MALFORMED_URL returns the IMAGE_MALFORMED_URL field if non-nil, zero value otherwise.

### GetIMAGE_MALFORMED_URLOk

`func (o *CatalogsFeedIngestionErrors) GetIMAGE_MALFORMED_URLOk() (*int32, bool)`

GetIMAGE_MALFORMED_URLOk returns a tuple with the IMAGE_MALFORMED_URL field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIMAGE_MALFORMED_URL

`func (o *CatalogsFeedIngestionErrors) SetIMAGE_MALFORMED_URL(v int32)`

SetIMAGE_MALFORMED_URL sets IMAGE_MALFORMED_URL field to given value.

### HasIMAGE_MALFORMED_URL

`func (o *CatalogsFeedIngestionErrors) HasIMAGE_MALFORMED_URL() bool`

HasIMAGE_MALFORMED_URL returns a boolean if a field has been set.

### GetIMAGE_FILE_NOT_FOUND

`func (o *CatalogsFeedIngestionErrors) GetIMAGE_FILE_NOT_FOUND() int32`

GetIMAGE_FILE_NOT_FOUND returns the IMAGE_FILE_NOT_FOUND field if non-nil, zero value otherwise.

### GetIMAGE_FILE_NOT_FOUNDOk

`func (o *CatalogsFeedIngestionErrors) GetIMAGE_FILE_NOT_FOUNDOk() (*int32, bool)`

GetIMAGE_FILE_NOT_FOUNDOk returns a tuple with the IMAGE_FILE_NOT_FOUND field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIMAGE_FILE_NOT_FOUND

`func (o *CatalogsFeedIngestionErrors) SetIMAGE_FILE_NOT_FOUND(v int32)`

SetIMAGE_FILE_NOT_FOUND sets IMAGE_FILE_NOT_FOUND field to given value.

### HasIMAGE_FILE_NOT_FOUND

`func (o *CatalogsFeedIngestionErrors) HasIMAGE_FILE_NOT_FOUND() bool`

HasIMAGE_FILE_NOT_FOUND returns a boolean if a field has been set.

### GetIMAGE_INVALID_FILE

`func (o *CatalogsFeedIngestionErrors) GetIMAGE_INVALID_FILE() int32`

GetIMAGE_INVALID_FILE returns the IMAGE_INVALID_FILE field if non-nil, zero value otherwise.

### GetIMAGE_INVALID_FILEOk

`func (o *CatalogsFeedIngestionErrors) GetIMAGE_INVALID_FILEOk() (*int32, bool)`

GetIMAGE_INVALID_FILEOk returns a tuple with the IMAGE_INVALID_FILE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIMAGE_INVALID_FILE

`func (o *CatalogsFeedIngestionErrors) SetIMAGE_INVALID_FILE(v int32)`

SetIMAGE_INVALID_FILE sets IMAGE_INVALID_FILE field to given value.

### HasIMAGE_INVALID_FILE

`func (o *CatalogsFeedIngestionErrors) HasIMAGE_INVALID_FILE() bool`

HasIMAGE_INVALID_FILE returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


