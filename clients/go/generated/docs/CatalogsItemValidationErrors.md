# CatalogsItemValidationErrors

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ADULT_INVALID** | Pointer to [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**ADWORDS_FORMAT_INVALID** | Pointer to [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**AVAILABILITY_INVALID** | Pointer to [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**BLOCKLISTED_IMAGE_SIGNATURE** | Pointer to [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**DESCRIPTION_MISSING** | Pointer to [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**DUPLICATE_PRODUCTS** | Pointer to [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**IMAGE_LINK_INVALID** | Pointer to [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**IMAGE_LINK_LENGTH_TOO_LONG** | Pointer to [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**IMAGE_LINK_MISSING** | Pointer to [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**INVALID_DOMAIN** | Pointer to [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**ITEMID_MISSING** | Pointer to [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE** | Pointer to [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**LINK_FORMAT_INVALID** | Pointer to [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**LINK_LENGTH_TOO_LONG** | Pointer to [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**LIST_PRICE_INVALID** | Pointer to [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED** | Pointer to [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**PARSE_LINE_ERROR** | Pointer to [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**PINJOIN_CONTENT_UNSAFE** | Pointer to [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**PRICE_CANNOT_BE_DETERMINED** | Pointer to [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**PRICE_MISSING** | Pointer to [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**PRODUCT_LINK_MISSING** | Pointer to [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**PRODUCT_PRICE_INVALID** | Pointer to [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**TITLE_MISSING** | Pointer to [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 

## Methods

### NewCatalogsItemValidationErrors

`func NewCatalogsItemValidationErrors() *CatalogsItemValidationErrors`

NewCatalogsItemValidationErrors instantiates a new CatalogsItemValidationErrors object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsItemValidationErrorsWithDefaults

`func NewCatalogsItemValidationErrorsWithDefaults() *CatalogsItemValidationErrors`

NewCatalogsItemValidationErrorsWithDefaults instantiates a new CatalogsItemValidationErrors object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetADULT_INVALID

`func (o *CatalogsItemValidationErrors) GetADULT_INVALID() CatalogsItemValidationDetails`

GetADULT_INVALID returns the ADULT_INVALID field if non-nil, zero value otherwise.

### GetADULT_INVALIDOk

`func (o *CatalogsItemValidationErrors) GetADULT_INVALIDOk() (*CatalogsItemValidationDetails, bool)`

GetADULT_INVALIDOk returns a tuple with the ADULT_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetADULT_INVALID

`func (o *CatalogsItemValidationErrors) SetADULT_INVALID(v CatalogsItemValidationDetails)`

SetADULT_INVALID sets ADULT_INVALID field to given value.

### HasADULT_INVALID

`func (o *CatalogsItemValidationErrors) HasADULT_INVALID() bool`

HasADULT_INVALID returns a boolean if a field has been set.

### GetADWORDS_FORMAT_INVALID

`func (o *CatalogsItemValidationErrors) GetADWORDS_FORMAT_INVALID() CatalogsItemValidationDetails`

GetADWORDS_FORMAT_INVALID returns the ADWORDS_FORMAT_INVALID field if non-nil, zero value otherwise.

### GetADWORDS_FORMAT_INVALIDOk

`func (o *CatalogsItemValidationErrors) GetADWORDS_FORMAT_INVALIDOk() (*CatalogsItemValidationDetails, bool)`

GetADWORDS_FORMAT_INVALIDOk returns a tuple with the ADWORDS_FORMAT_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetADWORDS_FORMAT_INVALID

`func (o *CatalogsItemValidationErrors) SetADWORDS_FORMAT_INVALID(v CatalogsItemValidationDetails)`

SetADWORDS_FORMAT_INVALID sets ADWORDS_FORMAT_INVALID field to given value.

### HasADWORDS_FORMAT_INVALID

`func (o *CatalogsItemValidationErrors) HasADWORDS_FORMAT_INVALID() bool`

HasADWORDS_FORMAT_INVALID returns a boolean if a field has been set.

### GetAVAILABILITY_INVALID

`func (o *CatalogsItemValidationErrors) GetAVAILABILITY_INVALID() CatalogsItemValidationDetails`

GetAVAILABILITY_INVALID returns the AVAILABILITY_INVALID field if non-nil, zero value otherwise.

### GetAVAILABILITY_INVALIDOk

`func (o *CatalogsItemValidationErrors) GetAVAILABILITY_INVALIDOk() (*CatalogsItemValidationDetails, bool)`

GetAVAILABILITY_INVALIDOk returns a tuple with the AVAILABILITY_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAVAILABILITY_INVALID

`func (o *CatalogsItemValidationErrors) SetAVAILABILITY_INVALID(v CatalogsItemValidationDetails)`

SetAVAILABILITY_INVALID sets AVAILABILITY_INVALID field to given value.

### HasAVAILABILITY_INVALID

`func (o *CatalogsItemValidationErrors) HasAVAILABILITY_INVALID() bool`

HasAVAILABILITY_INVALID returns a boolean if a field has been set.

### GetBLOCKLISTED_IMAGE_SIGNATURE

`func (o *CatalogsItemValidationErrors) GetBLOCKLISTED_IMAGE_SIGNATURE() CatalogsItemValidationDetails`

GetBLOCKLISTED_IMAGE_SIGNATURE returns the BLOCKLISTED_IMAGE_SIGNATURE field if non-nil, zero value otherwise.

### GetBLOCKLISTED_IMAGE_SIGNATUREOk

`func (o *CatalogsItemValidationErrors) GetBLOCKLISTED_IMAGE_SIGNATUREOk() (*CatalogsItemValidationDetails, bool)`

GetBLOCKLISTED_IMAGE_SIGNATUREOk returns a tuple with the BLOCKLISTED_IMAGE_SIGNATURE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBLOCKLISTED_IMAGE_SIGNATURE

`func (o *CatalogsItemValidationErrors) SetBLOCKLISTED_IMAGE_SIGNATURE(v CatalogsItemValidationDetails)`

SetBLOCKLISTED_IMAGE_SIGNATURE sets BLOCKLISTED_IMAGE_SIGNATURE field to given value.

### HasBLOCKLISTED_IMAGE_SIGNATURE

`func (o *CatalogsItemValidationErrors) HasBLOCKLISTED_IMAGE_SIGNATURE() bool`

HasBLOCKLISTED_IMAGE_SIGNATURE returns a boolean if a field has been set.

### GetDESCRIPTION_MISSING

`func (o *CatalogsItemValidationErrors) GetDESCRIPTION_MISSING() CatalogsItemValidationDetails`

GetDESCRIPTION_MISSING returns the DESCRIPTION_MISSING field if non-nil, zero value otherwise.

### GetDESCRIPTION_MISSINGOk

`func (o *CatalogsItemValidationErrors) GetDESCRIPTION_MISSINGOk() (*CatalogsItemValidationDetails, bool)`

GetDESCRIPTION_MISSINGOk returns a tuple with the DESCRIPTION_MISSING field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDESCRIPTION_MISSING

`func (o *CatalogsItemValidationErrors) SetDESCRIPTION_MISSING(v CatalogsItemValidationDetails)`

SetDESCRIPTION_MISSING sets DESCRIPTION_MISSING field to given value.

### HasDESCRIPTION_MISSING

`func (o *CatalogsItemValidationErrors) HasDESCRIPTION_MISSING() bool`

HasDESCRIPTION_MISSING returns a boolean if a field has been set.

### GetDUPLICATE_PRODUCTS

`func (o *CatalogsItemValidationErrors) GetDUPLICATE_PRODUCTS() CatalogsItemValidationDetails`

GetDUPLICATE_PRODUCTS returns the DUPLICATE_PRODUCTS field if non-nil, zero value otherwise.

### GetDUPLICATE_PRODUCTSOk

`func (o *CatalogsItemValidationErrors) GetDUPLICATE_PRODUCTSOk() (*CatalogsItemValidationDetails, bool)`

GetDUPLICATE_PRODUCTSOk returns a tuple with the DUPLICATE_PRODUCTS field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDUPLICATE_PRODUCTS

`func (o *CatalogsItemValidationErrors) SetDUPLICATE_PRODUCTS(v CatalogsItemValidationDetails)`

SetDUPLICATE_PRODUCTS sets DUPLICATE_PRODUCTS field to given value.

### HasDUPLICATE_PRODUCTS

`func (o *CatalogsItemValidationErrors) HasDUPLICATE_PRODUCTS() bool`

HasDUPLICATE_PRODUCTS returns a boolean if a field has been set.

### GetIMAGE_LINK_INVALID

`func (o *CatalogsItemValidationErrors) GetIMAGE_LINK_INVALID() CatalogsItemValidationDetails`

GetIMAGE_LINK_INVALID returns the IMAGE_LINK_INVALID field if non-nil, zero value otherwise.

### GetIMAGE_LINK_INVALIDOk

`func (o *CatalogsItemValidationErrors) GetIMAGE_LINK_INVALIDOk() (*CatalogsItemValidationDetails, bool)`

GetIMAGE_LINK_INVALIDOk returns a tuple with the IMAGE_LINK_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIMAGE_LINK_INVALID

`func (o *CatalogsItemValidationErrors) SetIMAGE_LINK_INVALID(v CatalogsItemValidationDetails)`

SetIMAGE_LINK_INVALID sets IMAGE_LINK_INVALID field to given value.

### HasIMAGE_LINK_INVALID

`func (o *CatalogsItemValidationErrors) HasIMAGE_LINK_INVALID() bool`

HasIMAGE_LINK_INVALID returns a boolean if a field has been set.

### GetIMAGE_LINK_LENGTH_TOO_LONG

`func (o *CatalogsItemValidationErrors) GetIMAGE_LINK_LENGTH_TOO_LONG() CatalogsItemValidationDetails`

GetIMAGE_LINK_LENGTH_TOO_LONG returns the IMAGE_LINK_LENGTH_TOO_LONG field if non-nil, zero value otherwise.

### GetIMAGE_LINK_LENGTH_TOO_LONGOk

`func (o *CatalogsItemValidationErrors) GetIMAGE_LINK_LENGTH_TOO_LONGOk() (*CatalogsItemValidationDetails, bool)`

GetIMAGE_LINK_LENGTH_TOO_LONGOk returns a tuple with the IMAGE_LINK_LENGTH_TOO_LONG field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIMAGE_LINK_LENGTH_TOO_LONG

`func (o *CatalogsItemValidationErrors) SetIMAGE_LINK_LENGTH_TOO_LONG(v CatalogsItemValidationDetails)`

SetIMAGE_LINK_LENGTH_TOO_LONG sets IMAGE_LINK_LENGTH_TOO_LONG field to given value.

### HasIMAGE_LINK_LENGTH_TOO_LONG

`func (o *CatalogsItemValidationErrors) HasIMAGE_LINK_LENGTH_TOO_LONG() bool`

HasIMAGE_LINK_LENGTH_TOO_LONG returns a boolean if a field has been set.

### GetIMAGE_LINK_MISSING

`func (o *CatalogsItemValidationErrors) GetIMAGE_LINK_MISSING() CatalogsItemValidationDetails`

GetIMAGE_LINK_MISSING returns the IMAGE_LINK_MISSING field if non-nil, zero value otherwise.

### GetIMAGE_LINK_MISSINGOk

`func (o *CatalogsItemValidationErrors) GetIMAGE_LINK_MISSINGOk() (*CatalogsItemValidationDetails, bool)`

GetIMAGE_LINK_MISSINGOk returns a tuple with the IMAGE_LINK_MISSING field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIMAGE_LINK_MISSING

`func (o *CatalogsItemValidationErrors) SetIMAGE_LINK_MISSING(v CatalogsItemValidationDetails)`

SetIMAGE_LINK_MISSING sets IMAGE_LINK_MISSING field to given value.

### HasIMAGE_LINK_MISSING

`func (o *CatalogsItemValidationErrors) HasIMAGE_LINK_MISSING() bool`

HasIMAGE_LINK_MISSING returns a boolean if a field has been set.

### GetINVALID_DOMAIN

`func (o *CatalogsItemValidationErrors) GetINVALID_DOMAIN() CatalogsItemValidationDetails`

GetINVALID_DOMAIN returns the INVALID_DOMAIN field if non-nil, zero value otherwise.

### GetINVALID_DOMAINOk

`func (o *CatalogsItemValidationErrors) GetINVALID_DOMAINOk() (*CatalogsItemValidationDetails, bool)`

GetINVALID_DOMAINOk returns a tuple with the INVALID_DOMAIN field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetINVALID_DOMAIN

`func (o *CatalogsItemValidationErrors) SetINVALID_DOMAIN(v CatalogsItemValidationDetails)`

SetINVALID_DOMAIN sets INVALID_DOMAIN field to given value.

### HasINVALID_DOMAIN

`func (o *CatalogsItemValidationErrors) HasINVALID_DOMAIN() bool`

HasINVALID_DOMAIN returns a boolean if a field has been set.

### GetITEMID_MISSING

`func (o *CatalogsItemValidationErrors) GetITEMID_MISSING() CatalogsItemValidationDetails`

GetITEMID_MISSING returns the ITEMID_MISSING field if non-nil, zero value otherwise.

### GetITEMID_MISSINGOk

`func (o *CatalogsItemValidationErrors) GetITEMID_MISSINGOk() (*CatalogsItemValidationDetails, bool)`

GetITEMID_MISSINGOk returns a tuple with the ITEMID_MISSING field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetITEMID_MISSING

`func (o *CatalogsItemValidationErrors) SetITEMID_MISSING(v CatalogsItemValidationDetails)`

SetITEMID_MISSING sets ITEMID_MISSING field to given value.

### HasITEMID_MISSING

`func (o *CatalogsItemValidationErrors) HasITEMID_MISSING() bool`

HasITEMID_MISSING returns a boolean if a field has been set.

### GetITEM_MAIN_IMAGE_DOWNLOAD_FAILURE

`func (o *CatalogsItemValidationErrors) GetITEM_MAIN_IMAGE_DOWNLOAD_FAILURE() CatalogsItemValidationDetails`

GetITEM_MAIN_IMAGE_DOWNLOAD_FAILURE returns the ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE field if non-nil, zero value otherwise.

### GetITEM_MAIN_IMAGE_DOWNLOAD_FAILUREOk

`func (o *CatalogsItemValidationErrors) GetITEM_MAIN_IMAGE_DOWNLOAD_FAILUREOk() (*CatalogsItemValidationDetails, bool)`

GetITEM_MAIN_IMAGE_DOWNLOAD_FAILUREOk returns a tuple with the ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetITEM_MAIN_IMAGE_DOWNLOAD_FAILURE

`func (o *CatalogsItemValidationErrors) SetITEM_MAIN_IMAGE_DOWNLOAD_FAILURE(v CatalogsItemValidationDetails)`

SetITEM_MAIN_IMAGE_DOWNLOAD_FAILURE sets ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE field to given value.

### HasITEM_MAIN_IMAGE_DOWNLOAD_FAILURE

`func (o *CatalogsItemValidationErrors) HasITEM_MAIN_IMAGE_DOWNLOAD_FAILURE() bool`

HasITEM_MAIN_IMAGE_DOWNLOAD_FAILURE returns a boolean if a field has been set.

### GetLINK_FORMAT_INVALID

`func (o *CatalogsItemValidationErrors) GetLINK_FORMAT_INVALID() CatalogsItemValidationDetails`

GetLINK_FORMAT_INVALID returns the LINK_FORMAT_INVALID field if non-nil, zero value otherwise.

### GetLINK_FORMAT_INVALIDOk

`func (o *CatalogsItemValidationErrors) GetLINK_FORMAT_INVALIDOk() (*CatalogsItemValidationDetails, bool)`

GetLINK_FORMAT_INVALIDOk returns a tuple with the LINK_FORMAT_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLINK_FORMAT_INVALID

`func (o *CatalogsItemValidationErrors) SetLINK_FORMAT_INVALID(v CatalogsItemValidationDetails)`

SetLINK_FORMAT_INVALID sets LINK_FORMAT_INVALID field to given value.

### HasLINK_FORMAT_INVALID

`func (o *CatalogsItemValidationErrors) HasLINK_FORMAT_INVALID() bool`

HasLINK_FORMAT_INVALID returns a boolean if a field has been set.

### GetLINK_LENGTH_TOO_LONG

`func (o *CatalogsItemValidationErrors) GetLINK_LENGTH_TOO_LONG() CatalogsItemValidationDetails`

GetLINK_LENGTH_TOO_LONG returns the LINK_LENGTH_TOO_LONG field if non-nil, zero value otherwise.

### GetLINK_LENGTH_TOO_LONGOk

`func (o *CatalogsItemValidationErrors) GetLINK_LENGTH_TOO_LONGOk() (*CatalogsItemValidationDetails, bool)`

GetLINK_LENGTH_TOO_LONGOk returns a tuple with the LINK_LENGTH_TOO_LONG field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLINK_LENGTH_TOO_LONG

`func (o *CatalogsItemValidationErrors) SetLINK_LENGTH_TOO_LONG(v CatalogsItemValidationDetails)`

SetLINK_LENGTH_TOO_LONG sets LINK_LENGTH_TOO_LONG field to given value.

### HasLINK_LENGTH_TOO_LONG

`func (o *CatalogsItemValidationErrors) HasLINK_LENGTH_TOO_LONG() bool`

HasLINK_LENGTH_TOO_LONG returns a boolean if a field has been set.

### GetLIST_PRICE_INVALID

`func (o *CatalogsItemValidationErrors) GetLIST_PRICE_INVALID() CatalogsItemValidationDetails`

GetLIST_PRICE_INVALID returns the LIST_PRICE_INVALID field if non-nil, zero value otherwise.

### GetLIST_PRICE_INVALIDOk

`func (o *CatalogsItemValidationErrors) GetLIST_PRICE_INVALIDOk() (*CatalogsItemValidationDetails, bool)`

GetLIST_PRICE_INVALIDOk returns a tuple with the LIST_PRICE_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLIST_PRICE_INVALID

`func (o *CatalogsItemValidationErrors) SetLIST_PRICE_INVALID(v CatalogsItemValidationDetails)`

SetLIST_PRICE_INVALID sets LIST_PRICE_INVALID field to given value.

### HasLIST_PRICE_INVALID

`func (o *CatalogsItemValidationErrors) HasLIST_PRICE_INVALID() bool`

HasLIST_PRICE_INVALID returns a boolean if a field has been set.

### GetMAX_ITEMS_PER_ITEM_GROUP_EXCEEDED

`func (o *CatalogsItemValidationErrors) GetMAX_ITEMS_PER_ITEM_GROUP_EXCEEDED() CatalogsItemValidationDetails`

GetMAX_ITEMS_PER_ITEM_GROUP_EXCEEDED returns the MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED field if non-nil, zero value otherwise.

### GetMAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDOk

`func (o *CatalogsItemValidationErrors) GetMAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDOk() (*CatalogsItemValidationDetails, bool)`

GetMAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDOk returns a tuple with the MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMAX_ITEMS_PER_ITEM_GROUP_EXCEEDED

`func (o *CatalogsItemValidationErrors) SetMAX_ITEMS_PER_ITEM_GROUP_EXCEEDED(v CatalogsItemValidationDetails)`

SetMAX_ITEMS_PER_ITEM_GROUP_EXCEEDED sets MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED field to given value.

### HasMAX_ITEMS_PER_ITEM_GROUP_EXCEEDED

`func (o *CatalogsItemValidationErrors) HasMAX_ITEMS_PER_ITEM_GROUP_EXCEEDED() bool`

HasMAX_ITEMS_PER_ITEM_GROUP_EXCEEDED returns a boolean if a field has been set.

### GetPARSE_LINE_ERROR

`func (o *CatalogsItemValidationErrors) GetPARSE_LINE_ERROR() CatalogsItemValidationDetails`

GetPARSE_LINE_ERROR returns the PARSE_LINE_ERROR field if non-nil, zero value otherwise.

### GetPARSE_LINE_ERROROk

`func (o *CatalogsItemValidationErrors) GetPARSE_LINE_ERROROk() (*CatalogsItemValidationDetails, bool)`

GetPARSE_LINE_ERROROk returns a tuple with the PARSE_LINE_ERROR field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPARSE_LINE_ERROR

`func (o *CatalogsItemValidationErrors) SetPARSE_LINE_ERROR(v CatalogsItemValidationDetails)`

SetPARSE_LINE_ERROR sets PARSE_LINE_ERROR field to given value.

### HasPARSE_LINE_ERROR

`func (o *CatalogsItemValidationErrors) HasPARSE_LINE_ERROR() bool`

HasPARSE_LINE_ERROR returns a boolean if a field has been set.

### GetPINJOIN_CONTENT_UNSAFE

`func (o *CatalogsItemValidationErrors) GetPINJOIN_CONTENT_UNSAFE() CatalogsItemValidationDetails`

GetPINJOIN_CONTENT_UNSAFE returns the PINJOIN_CONTENT_UNSAFE field if non-nil, zero value otherwise.

### GetPINJOIN_CONTENT_UNSAFEOk

`func (o *CatalogsItemValidationErrors) GetPINJOIN_CONTENT_UNSAFEOk() (*CatalogsItemValidationDetails, bool)`

GetPINJOIN_CONTENT_UNSAFEOk returns a tuple with the PINJOIN_CONTENT_UNSAFE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPINJOIN_CONTENT_UNSAFE

`func (o *CatalogsItemValidationErrors) SetPINJOIN_CONTENT_UNSAFE(v CatalogsItemValidationDetails)`

SetPINJOIN_CONTENT_UNSAFE sets PINJOIN_CONTENT_UNSAFE field to given value.

### HasPINJOIN_CONTENT_UNSAFE

`func (o *CatalogsItemValidationErrors) HasPINJOIN_CONTENT_UNSAFE() bool`

HasPINJOIN_CONTENT_UNSAFE returns a boolean if a field has been set.

### GetPRICE_CANNOT_BE_DETERMINED

`func (o *CatalogsItemValidationErrors) GetPRICE_CANNOT_BE_DETERMINED() CatalogsItemValidationDetails`

GetPRICE_CANNOT_BE_DETERMINED returns the PRICE_CANNOT_BE_DETERMINED field if non-nil, zero value otherwise.

### GetPRICE_CANNOT_BE_DETERMINEDOk

`func (o *CatalogsItemValidationErrors) GetPRICE_CANNOT_BE_DETERMINEDOk() (*CatalogsItemValidationDetails, bool)`

GetPRICE_CANNOT_BE_DETERMINEDOk returns a tuple with the PRICE_CANNOT_BE_DETERMINED field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPRICE_CANNOT_BE_DETERMINED

`func (o *CatalogsItemValidationErrors) SetPRICE_CANNOT_BE_DETERMINED(v CatalogsItemValidationDetails)`

SetPRICE_CANNOT_BE_DETERMINED sets PRICE_CANNOT_BE_DETERMINED field to given value.

### HasPRICE_CANNOT_BE_DETERMINED

`func (o *CatalogsItemValidationErrors) HasPRICE_CANNOT_BE_DETERMINED() bool`

HasPRICE_CANNOT_BE_DETERMINED returns a boolean if a field has been set.

### GetPRICE_MISSING

`func (o *CatalogsItemValidationErrors) GetPRICE_MISSING() CatalogsItemValidationDetails`

GetPRICE_MISSING returns the PRICE_MISSING field if non-nil, zero value otherwise.

### GetPRICE_MISSINGOk

`func (o *CatalogsItemValidationErrors) GetPRICE_MISSINGOk() (*CatalogsItemValidationDetails, bool)`

GetPRICE_MISSINGOk returns a tuple with the PRICE_MISSING field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPRICE_MISSING

`func (o *CatalogsItemValidationErrors) SetPRICE_MISSING(v CatalogsItemValidationDetails)`

SetPRICE_MISSING sets PRICE_MISSING field to given value.

### HasPRICE_MISSING

`func (o *CatalogsItemValidationErrors) HasPRICE_MISSING() bool`

HasPRICE_MISSING returns a boolean if a field has been set.

### GetPRODUCT_LINK_MISSING

`func (o *CatalogsItemValidationErrors) GetPRODUCT_LINK_MISSING() CatalogsItemValidationDetails`

GetPRODUCT_LINK_MISSING returns the PRODUCT_LINK_MISSING field if non-nil, zero value otherwise.

### GetPRODUCT_LINK_MISSINGOk

`func (o *CatalogsItemValidationErrors) GetPRODUCT_LINK_MISSINGOk() (*CatalogsItemValidationDetails, bool)`

GetPRODUCT_LINK_MISSINGOk returns a tuple with the PRODUCT_LINK_MISSING field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPRODUCT_LINK_MISSING

`func (o *CatalogsItemValidationErrors) SetPRODUCT_LINK_MISSING(v CatalogsItemValidationDetails)`

SetPRODUCT_LINK_MISSING sets PRODUCT_LINK_MISSING field to given value.

### HasPRODUCT_LINK_MISSING

`func (o *CatalogsItemValidationErrors) HasPRODUCT_LINK_MISSING() bool`

HasPRODUCT_LINK_MISSING returns a boolean if a field has been set.

### GetPRODUCT_PRICE_INVALID

`func (o *CatalogsItemValidationErrors) GetPRODUCT_PRICE_INVALID() CatalogsItemValidationDetails`

GetPRODUCT_PRICE_INVALID returns the PRODUCT_PRICE_INVALID field if non-nil, zero value otherwise.

### GetPRODUCT_PRICE_INVALIDOk

`func (o *CatalogsItemValidationErrors) GetPRODUCT_PRICE_INVALIDOk() (*CatalogsItemValidationDetails, bool)`

GetPRODUCT_PRICE_INVALIDOk returns a tuple with the PRODUCT_PRICE_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPRODUCT_PRICE_INVALID

`func (o *CatalogsItemValidationErrors) SetPRODUCT_PRICE_INVALID(v CatalogsItemValidationDetails)`

SetPRODUCT_PRICE_INVALID sets PRODUCT_PRICE_INVALID field to given value.

### HasPRODUCT_PRICE_INVALID

`func (o *CatalogsItemValidationErrors) HasPRODUCT_PRICE_INVALID() bool`

HasPRODUCT_PRICE_INVALID returns a boolean if a field has been set.

### GetTITLE_MISSING

`func (o *CatalogsItemValidationErrors) GetTITLE_MISSING() CatalogsItemValidationDetails`

GetTITLE_MISSING returns the TITLE_MISSING field if non-nil, zero value otherwise.

### GetTITLE_MISSINGOk

`func (o *CatalogsItemValidationErrors) GetTITLE_MISSINGOk() (*CatalogsItemValidationDetails, bool)`

GetTITLE_MISSINGOk returns a tuple with the TITLE_MISSING field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTITLE_MISSING

`func (o *CatalogsItemValidationErrors) SetTITLE_MISSING(v CatalogsItemValidationDetails)`

SetTITLE_MISSING sets TITLE_MISSING field to given value.

### HasTITLE_MISSING

`func (o *CatalogsItemValidationErrors) HasTITLE_MISSING() bool`

HasTITLE_MISSING returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


