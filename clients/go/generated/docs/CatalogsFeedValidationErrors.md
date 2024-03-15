# CatalogsFeedValidationErrors

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FETCH_ERROR** | Pointer to **int32** | Pinterest couldn&#39;t download your feed. | [optional] 
**FETCH_INACTIVE_FEED_ERROR** | Pointer to **int32** | Your feed wasn&#39;t ingested because it hasn’t changed in the previous 90 days. | [optional] 
**ENCODING_ERROR** | Pointer to **int32** | Your feed includes data with an unsupported encoding format. | [optional] 
**DELIMITER_ERROR** | Pointer to **int32** | Your feed includes data with formatting errors. | [optional] 
**REQUIRED_COLUMNS_MISSING** | Pointer to **int32** | Your feed is missing some required column headers. | [optional] 
**DUPLICATE_PRODUCTS** | Pointer to **int32** | Some products are duplicated. | [optional] 
**IMAGE_LINK_INVALID** | Pointer to **int32** | Some image links are formatted incorrectly. | [optional] 
**ITEMID_MISSING** | Pointer to **int32** | Some items are missing an item id in their product metadata, those items will not be published. | [optional] 
**TITLE_MISSING** | Pointer to **int32** | Some items are missing a title in their product metadata, those items will not be published. | [optional] 
**DESCRIPTION_MISSING** | Pointer to **int32** | Some items are missing a description in their product metadata, those items will not be published. | [optional] 
**PRODUCT_LINK_MISSING** | Pointer to **int32** | Some items are missing a link URL in their product metadata, those items will not be published. | [optional] 
**IMAGE_LINK_MISSING** | Pointer to **int32** | Some items are missing an image link URL in their product metadata, those items will not be published. | [optional] 
**AVAILABILITY_INVALID** | Pointer to **int32** | Some items are missing an availability value in their product metadata, those items will not be published. | [optional] 
**PRODUCT_PRICE_INVALID** | Pointer to **int32** | Some items have price formatting errors in their product metadata, those items will not be published. | [optional] 
**LINK_FORMAT_INVALID** | Pointer to **int32** | Some link values are formatted incorrectly. | [optional] 
**PARSE_LINE_ERROR** | Pointer to **int32** | Your feed contains formatting errors for some items. | [optional] 
**ADWORDS_FORMAT_INVALID** | Pointer to **int32** | Some adwords links contain too many characters. | [optional] 
**INTERNAL_SERVICE_ERROR** | Pointer to **int32** | We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours. | [optional] 
**NO_VERIFIED_DOMAIN** | Pointer to **int32** | Your merchant domain needs to be claimed. | [optional] 
**ADULT_INVALID** | Pointer to **int32** | Some items have invalid adult values. | [optional] 
**IMAGE_LINK_LENGTH_TOO_LONG** | Pointer to **int32** | Some items have image_link URLs that contain too many characters, so those items will not be published. | [optional] 
**INVALID_DOMAIN** | Pointer to **int32** | Some of your product link values don&#39;t match the verified domain associated with this account. | [optional] 
**FEED_LENGTH_TOO_LONG** | Pointer to **int32** | Your feed contains too many items, some items will not be published. | [optional] 
**LINK_LENGTH_TOO_LONG** | Pointer to **int32** | Some product links contain too many characters, those items will not be published. | [optional] 
**MALFORMED_XML** | Pointer to **int32** | Your feed couldn&#39;t be validated because the xml file is formatted incorrectly. | [optional] 
**PRICE_MISSING** | Pointer to **int32** | Some products are missing a price, those items will not be published. | [optional] 
**FEED_TOO_SMALL** | Pointer to **int32** | Your feed couldn&#39;t be validated because the file doesn&#39;t contain the minimum number of lines required. | [optional] 
**MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED** | Pointer to **int32** | Some items exceed the maximum number of items per item group, those items will not be published. | [optional] 
**ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE** | Pointer to **int32** | Some items&#39; main images can&#39;t be found. | [optional] 
**PINJOIN_CONTENT_UNSAFE** | Pointer to **int32** | Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] 
**BLOCKLISTED_IMAGE_SIGNATURE** | Pointer to **int32** | Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] 
**LIST_PRICE_INVALID** | Pointer to **int32** | Some items have list price formatting errors in their product metadata, those items will not be published. | [optional] 
**PRICE_CANNOT_BE_DETERMINED** | Pointer to **int32** | Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published. | [optional] 

## Methods

### NewCatalogsFeedValidationErrors

`func NewCatalogsFeedValidationErrors() *CatalogsFeedValidationErrors`

NewCatalogsFeedValidationErrors instantiates a new CatalogsFeedValidationErrors object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsFeedValidationErrorsWithDefaults

`func NewCatalogsFeedValidationErrorsWithDefaults() *CatalogsFeedValidationErrors`

NewCatalogsFeedValidationErrorsWithDefaults instantiates a new CatalogsFeedValidationErrors object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFETCH_ERROR

`func (o *CatalogsFeedValidationErrors) GetFETCH_ERROR() int32`

GetFETCH_ERROR returns the FETCH_ERROR field if non-nil, zero value otherwise.

### GetFETCH_ERROROk

`func (o *CatalogsFeedValidationErrors) GetFETCH_ERROROk() (*int32, bool)`

GetFETCH_ERROROk returns a tuple with the FETCH_ERROR field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFETCH_ERROR

`func (o *CatalogsFeedValidationErrors) SetFETCH_ERROR(v int32)`

SetFETCH_ERROR sets FETCH_ERROR field to given value.

### HasFETCH_ERROR

`func (o *CatalogsFeedValidationErrors) HasFETCH_ERROR() bool`

HasFETCH_ERROR returns a boolean if a field has been set.

### GetFETCH_INACTIVE_FEED_ERROR

`func (o *CatalogsFeedValidationErrors) GetFETCH_INACTIVE_FEED_ERROR() int32`

GetFETCH_INACTIVE_FEED_ERROR returns the FETCH_INACTIVE_FEED_ERROR field if non-nil, zero value otherwise.

### GetFETCH_INACTIVE_FEED_ERROROk

`func (o *CatalogsFeedValidationErrors) GetFETCH_INACTIVE_FEED_ERROROk() (*int32, bool)`

GetFETCH_INACTIVE_FEED_ERROROk returns a tuple with the FETCH_INACTIVE_FEED_ERROR field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFETCH_INACTIVE_FEED_ERROR

`func (o *CatalogsFeedValidationErrors) SetFETCH_INACTIVE_FEED_ERROR(v int32)`

SetFETCH_INACTIVE_FEED_ERROR sets FETCH_INACTIVE_FEED_ERROR field to given value.

### HasFETCH_INACTIVE_FEED_ERROR

`func (o *CatalogsFeedValidationErrors) HasFETCH_INACTIVE_FEED_ERROR() bool`

HasFETCH_INACTIVE_FEED_ERROR returns a boolean if a field has been set.

### GetENCODING_ERROR

`func (o *CatalogsFeedValidationErrors) GetENCODING_ERROR() int32`

GetENCODING_ERROR returns the ENCODING_ERROR field if non-nil, zero value otherwise.

### GetENCODING_ERROROk

`func (o *CatalogsFeedValidationErrors) GetENCODING_ERROROk() (*int32, bool)`

GetENCODING_ERROROk returns a tuple with the ENCODING_ERROR field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetENCODING_ERROR

`func (o *CatalogsFeedValidationErrors) SetENCODING_ERROR(v int32)`

SetENCODING_ERROR sets ENCODING_ERROR field to given value.

### HasENCODING_ERROR

`func (o *CatalogsFeedValidationErrors) HasENCODING_ERROR() bool`

HasENCODING_ERROR returns a boolean if a field has been set.

### GetDELIMITER_ERROR

`func (o *CatalogsFeedValidationErrors) GetDELIMITER_ERROR() int32`

GetDELIMITER_ERROR returns the DELIMITER_ERROR field if non-nil, zero value otherwise.

### GetDELIMITER_ERROROk

`func (o *CatalogsFeedValidationErrors) GetDELIMITER_ERROROk() (*int32, bool)`

GetDELIMITER_ERROROk returns a tuple with the DELIMITER_ERROR field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDELIMITER_ERROR

`func (o *CatalogsFeedValidationErrors) SetDELIMITER_ERROR(v int32)`

SetDELIMITER_ERROR sets DELIMITER_ERROR field to given value.

### HasDELIMITER_ERROR

`func (o *CatalogsFeedValidationErrors) HasDELIMITER_ERROR() bool`

HasDELIMITER_ERROR returns a boolean if a field has been set.

### GetREQUIRED_COLUMNS_MISSING

`func (o *CatalogsFeedValidationErrors) GetREQUIRED_COLUMNS_MISSING() int32`

GetREQUIRED_COLUMNS_MISSING returns the REQUIRED_COLUMNS_MISSING field if non-nil, zero value otherwise.

### GetREQUIRED_COLUMNS_MISSINGOk

`func (o *CatalogsFeedValidationErrors) GetREQUIRED_COLUMNS_MISSINGOk() (*int32, bool)`

GetREQUIRED_COLUMNS_MISSINGOk returns a tuple with the REQUIRED_COLUMNS_MISSING field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetREQUIRED_COLUMNS_MISSING

`func (o *CatalogsFeedValidationErrors) SetREQUIRED_COLUMNS_MISSING(v int32)`

SetREQUIRED_COLUMNS_MISSING sets REQUIRED_COLUMNS_MISSING field to given value.

### HasREQUIRED_COLUMNS_MISSING

`func (o *CatalogsFeedValidationErrors) HasREQUIRED_COLUMNS_MISSING() bool`

HasREQUIRED_COLUMNS_MISSING returns a boolean if a field has been set.

### GetDUPLICATE_PRODUCTS

`func (o *CatalogsFeedValidationErrors) GetDUPLICATE_PRODUCTS() int32`

GetDUPLICATE_PRODUCTS returns the DUPLICATE_PRODUCTS field if non-nil, zero value otherwise.

### GetDUPLICATE_PRODUCTSOk

`func (o *CatalogsFeedValidationErrors) GetDUPLICATE_PRODUCTSOk() (*int32, bool)`

GetDUPLICATE_PRODUCTSOk returns a tuple with the DUPLICATE_PRODUCTS field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDUPLICATE_PRODUCTS

`func (o *CatalogsFeedValidationErrors) SetDUPLICATE_PRODUCTS(v int32)`

SetDUPLICATE_PRODUCTS sets DUPLICATE_PRODUCTS field to given value.

### HasDUPLICATE_PRODUCTS

`func (o *CatalogsFeedValidationErrors) HasDUPLICATE_PRODUCTS() bool`

HasDUPLICATE_PRODUCTS returns a boolean if a field has been set.

### GetIMAGE_LINK_INVALID

`func (o *CatalogsFeedValidationErrors) GetIMAGE_LINK_INVALID() int32`

GetIMAGE_LINK_INVALID returns the IMAGE_LINK_INVALID field if non-nil, zero value otherwise.

### GetIMAGE_LINK_INVALIDOk

`func (o *CatalogsFeedValidationErrors) GetIMAGE_LINK_INVALIDOk() (*int32, bool)`

GetIMAGE_LINK_INVALIDOk returns a tuple with the IMAGE_LINK_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIMAGE_LINK_INVALID

`func (o *CatalogsFeedValidationErrors) SetIMAGE_LINK_INVALID(v int32)`

SetIMAGE_LINK_INVALID sets IMAGE_LINK_INVALID field to given value.

### HasIMAGE_LINK_INVALID

`func (o *CatalogsFeedValidationErrors) HasIMAGE_LINK_INVALID() bool`

HasIMAGE_LINK_INVALID returns a boolean if a field has been set.

### GetITEMID_MISSING

`func (o *CatalogsFeedValidationErrors) GetITEMID_MISSING() int32`

GetITEMID_MISSING returns the ITEMID_MISSING field if non-nil, zero value otherwise.

### GetITEMID_MISSINGOk

`func (o *CatalogsFeedValidationErrors) GetITEMID_MISSINGOk() (*int32, bool)`

GetITEMID_MISSINGOk returns a tuple with the ITEMID_MISSING field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetITEMID_MISSING

`func (o *CatalogsFeedValidationErrors) SetITEMID_MISSING(v int32)`

SetITEMID_MISSING sets ITEMID_MISSING field to given value.

### HasITEMID_MISSING

`func (o *CatalogsFeedValidationErrors) HasITEMID_MISSING() bool`

HasITEMID_MISSING returns a boolean if a field has been set.

### GetTITLE_MISSING

`func (o *CatalogsFeedValidationErrors) GetTITLE_MISSING() int32`

GetTITLE_MISSING returns the TITLE_MISSING field if non-nil, zero value otherwise.

### GetTITLE_MISSINGOk

`func (o *CatalogsFeedValidationErrors) GetTITLE_MISSINGOk() (*int32, bool)`

GetTITLE_MISSINGOk returns a tuple with the TITLE_MISSING field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTITLE_MISSING

`func (o *CatalogsFeedValidationErrors) SetTITLE_MISSING(v int32)`

SetTITLE_MISSING sets TITLE_MISSING field to given value.

### HasTITLE_MISSING

`func (o *CatalogsFeedValidationErrors) HasTITLE_MISSING() bool`

HasTITLE_MISSING returns a boolean if a field has been set.

### GetDESCRIPTION_MISSING

`func (o *CatalogsFeedValidationErrors) GetDESCRIPTION_MISSING() int32`

GetDESCRIPTION_MISSING returns the DESCRIPTION_MISSING field if non-nil, zero value otherwise.

### GetDESCRIPTION_MISSINGOk

`func (o *CatalogsFeedValidationErrors) GetDESCRIPTION_MISSINGOk() (*int32, bool)`

GetDESCRIPTION_MISSINGOk returns a tuple with the DESCRIPTION_MISSING field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDESCRIPTION_MISSING

`func (o *CatalogsFeedValidationErrors) SetDESCRIPTION_MISSING(v int32)`

SetDESCRIPTION_MISSING sets DESCRIPTION_MISSING field to given value.

### HasDESCRIPTION_MISSING

`func (o *CatalogsFeedValidationErrors) HasDESCRIPTION_MISSING() bool`

HasDESCRIPTION_MISSING returns a boolean if a field has been set.

### GetPRODUCT_LINK_MISSING

`func (o *CatalogsFeedValidationErrors) GetPRODUCT_LINK_MISSING() int32`

GetPRODUCT_LINK_MISSING returns the PRODUCT_LINK_MISSING field if non-nil, zero value otherwise.

### GetPRODUCT_LINK_MISSINGOk

`func (o *CatalogsFeedValidationErrors) GetPRODUCT_LINK_MISSINGOk() (*int32, bool)`

GetPRODUCT_LINK_MISSINGOk returns a tuple with the PRODUCT_LINK_MISSING field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPRODUCT_LINK_MISSING

`func (o *CatalogsFeedValidationErrors) SetPRODUCT_LINK_MISSING(v int32)`

SetPRODUCT_LINK_MISSING sets PRODUCT_LINK_MISSING field to given value.

### HasPRODUCT_LINK_MISSING

`func (o *CatalogsFeedValidationErrors) HasPRODUCT_LINK_MISSING() bool`

HasPRODUCT_LINK_MISSING returns a boolean if a field has been set.

### GetIMAGE_LINK_MISSING

`func (o *CatalogsFeedValidationErrors) GetIMAGE_LINK_MISSING() int32`

GetIMAGE_LINK_MISSING returns the IMAGE_LINK_MISSING field if non-nil, zero value otherwise.

### GetIMAGE_LINK_MISSINGOk

`func (o *CatalogsFeedValidationErrors) GetIMAGE_LINK_MISSINGOk() (*int32, bool)`

GetIMAGE_LINK_MISSINGOk returns a tuple with the IMAGE_LINK_MISSING field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIMAGE_LINK_MISSING

`func (o *CatalogsFeedValidationErrors) SetIMAGE_LINK_MISSING(v int32)`

SetIMAGE_LINK_MISSING sets IMAGE_LINK_MISSING field to given value.

### HasIMAGE_LINK_MISSING

`func (o *CatalogsFeedValidationErrors) HasIMAGE_LINK_MISSING() bool`

HasIMAGE_LINK_MISSING returns a boolean if a field has been set.

### GetAVAILABILITY_INVALID

`func (o *CatalogsFeedValidationErrors) GetAVAILABILITY_INVALID() int32`

GetAVAILABILITY_INVALID returns the AVAILABILITY_INVALID field if non-nil, zero value otherwise.

### GetAVAILABILITY_INVALIDOk

`func (o *CatalogsFeedValidationErrors) GetAVAILABILITY_INVALIDOk() (*int32, bool)`

GetAVAILABILITY_INVALIDOk returns a tuple with the AVAILABILITY_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAVAILABILITY_INVALID

`func (o *CatalogsFeedValidationErrors) SetAVAILABILITY_INVALID(v int32)`

SetAVAILABILITY_INVALID sets AVAILABILITY_INVALID field to given value.

### HasAVAILABILITY_INVALID

`func (o *CatalogsFeedValidationErrors) HasAVAILABILITY_INVALID() bool`

HasAVAILABILITY_INVALID returns a boolean if a field has been set.

### GetPRODUCT_PRICE_INVALID

`func (o *CatalogsFeedValidationErrors) GetPRODUCT_PRICE_INVALID() int32`

GetPRODUCT_PRICE_INVALID returns the PRODUCT_PRICE_INVALID field if non-nil, zero value otherwise.

### GetPRODUCT_PRICE_INVALIDOk

`func (o *CatalogsFeedValidationErrors) GetPRODUCT_PRICE_INVALIDOk() (*int32, bool)`

GetPRODUCT_PRICE_INVALIDOk returns a tuple with the PRODUCT_PRICE_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPRODUCT_PRICE_INVALID

`func (o *CatalogsFeedValidationErrors) SetPRODUCT_PRICE_INVALID(v int32)`

SetPRODUCT_PRICE_INVALID sets PRODUCT_PRICE_INVALID field to given value.

### HasPRODUCT_PRICE_INVALID

`func (o *CatalogsFeedValidationErrors) HasPRODUCT_PRICE_INVALID() bool`

HasPRODUCT_PRICE_INVALID returns a boolean if a field has been set.

### GetLINK_FORMAT_INVALID

`func (o *CatalogsFeedValidationErrors) GetLINK_FORMAT_INVALID() int32`

GetLINK_FORMAT_INVALID returns the LINK_FORMAT_INVALID field if non-nil, zero value otherwise.

### GetLINK_FORMAT_INVALIDOk

`func (o *CatalogsFeedValidationErrors) GetLINK_FORMAT_INVALIDOk() (*int32, bool)`

GetLINK_FORMAT_INVALIDOk returns a tuple with the LINK_FORMAT_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLINK_FORMAT_INVALID

`func (o *CatalogsFeedValidationErrors) SetLINK_FORMAT_INVALID(v int32)`

SetLINK_FORMAT_INVALID sets LINK_FORMAT_INVALID field to given value.

### HasLINK_FORMAT_INVALID

`func (o *CatalogsFeedValidationErrors) HasLINK_FORMAT_INVALID() bool`

HasLINK_FORMAT_INVALID returns a boolean if a field has been set.

### GetPARSE_LINE_ERROR

`func (o *CatalogsFeedValidationErrors) GetPARSE_LINE_ERROR() int32`

GetPARSE_LINE_ERROR returns the PARSE_LINE_ERROR field if non-nil, zero value otherwise.

### GetPARSE_LINE_ERROROk

`func (o *CatalogsFeedValidationErrors) GetPARSE_LINE_ERROROk() (*int32, bool)`

GetPARSE_LINE_ERROROk returns a tuple with the PARSE_LINE_ERROR field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPARSE_LINE_ERROR

`func (o *CatalogsFeedValidationErrors) SetPARSE_LINE_ERROR(v int32)`

SetPARSE_LINE_ERROR sets PARSE_LINE_ERROR field to given value.

### HasPARSE_LINE_ERROR

`func (o *CatalogsFeedValidationErrors) HasPARSE_LINE_ERROR() bool`

HasPARSE_LINE_ERROR returns a boolean if a field has been set.

### GetADWORDS_FORMAT_INVALID

`func (o *CatalogsFeedValidationErrors) GetADWORDS_FORMAT_INVALID() int32`

GetADWORDS_FORMAT_INVALID returns the ADWORDS_FORMAT_INVALID field if non-nil, zero value otherwise.

### GetADWORDS_FORMAT_INVALIDOk

`func (o *CatalogsFeedValidationErrors) GetADWORDS_FORMAT_INVALIDOk() (*int32, bool)`

GetADWORDS_FORMAT_INVALIDOk returns a tuple with the ADWORDS_FORMAT_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetADWORDS_FORMAT_INVALID

`func (o *CatalogsFeedValidationErrors) SetADWORDS_FORMAT_INVALID(v int32)`

SetADWORDS_FORMAT_INVALID sets ADWORDS_FORMAT_INVALID field to given value.

### HasADWORDS_FORMAT_INVALID

`func (o *CatalogsFeedValidationErrors) HasADWORDS_FORMAT_INVALID() bool`

HasADWORDS_FORMAT_INVALID returns a boolean if a field has been set.

### GetINTERNAL_SERVICE_ERROR

`func (o *CatalogsFeedValidationErrors) GetINTERNAL_SERVICE_ERROR() int32`

GetINTERNAL_SERVICE_ERROR returns the INTERNAL_SERVICE_ERROR field if non-nil, zero value otherwise.

### GetINTERNAL_SERVICE_ERROROk

`func (o *CatalogsFeedValidationErrors) GetINTERNAL_SERVICE_ERROROk() (*int32, bool)`

GetINTERNAL_SERVICE_ERROROk returns a tuple with the INTERNAL_SERVICE_ERROR field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetINTERNAL_SERVICE_ERROR

`func (o *CatalogsFeedValidationErrors) SetINTERNAL_SERVICE_ERROR(v int32)`

SetINTERNAL_SERVICE_ERROR sets INTERNAL_SERVICE_ERROR field to given value.

### HasINTERNAL_SERVICE_ERROR

`func (o *CatalogsFeedValidationErrors) HasINTERNAL_SERVICE_ERROR() bool`

HasINTERNAL_SERVICE_ERROR returns a boolean if a field has been set.

### GetNO_VERIFIED_DOMAIN

`func (o *CatalogsFeedValidationErrors) GetNO_VERIFIED_DOMAIN() int32`

GetNO_VERIFIED_DOMAIN returns the NO_VERIFIED_DOMAIN field if non-nil, zero value otherwise.

### GetNO_VERIFIED_DOMAINOk

`func (o *CatalogsFeedValidationErrors) GetNO_VERIFIED_DOMAINOk() (*int32, bool)`

GetNO_VERIFIED_DOMAINOk returns a tuple with the NO_VERIFIED_DOMAIN field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNO_VERIFIED_DOMAIN

`func (o *CatalogsFeedValidationErrors) SetNO_VERIFIED_DOMAIN(v int32)`

SetNO_VERIFIED_DOMAIN sets NO_VERIFIED_DOMAIN field to given value.

### HasNO_VERIFIED_DOMAIN

`func (o *CatalogsFeedValidationErrors) HasNO_VERIFIED_DOMAIN() bool`

HasNO_VERIFIED_DOMAIN returns a boolean if a field has been set.

### GetADULT_INVALID

`func (o *CatalogsFeedValidationErrors) GetADULT_INVALID() int32`

GetADULT_INVALID returns the ADULT_INVALID field if non-nil, zero value otherwise.

### GetADULT_INVALIDOk

`func (o *CatalogsFeedValidationErrors) GetADULT_INVALIDOk() (*int32, bool)`

GetADULT_INVALIDOk returns a tuple with the ADULT_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetADULT_INVALID

`func (o *CatalogsFeedValidationErrors) SetADULT_INVALID(v int32)`

SetADULT_INVALID sets ADULT_INVALID field to given value.

### HasADULT_INVALID

`func (o *CatalogsFeedValidationErrors) HasADULT_INVALID() bool`

HasADULT_INVALID returns a boolean if a field has been set.

### GetIMAGE_LINK_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationErrors) GetIMAGE_LINK_LENGTH_TOO_LONG() int32`

GetIMAGE_LINK_LENGTH_TOO_LONG returns the IMAGE_LINK_LENGTH_TOO_LONG field if non-nil, zero value otherwise.

### GetIMAGE_LINK_LENGTH_TOO_LONGOk

`func (o *CatalogsFeedValidationErrors) GetIMAGE_LINK_LENGTH_TOO_LONGOk() (*int32, bool)`

GetIMAGE_LINK_LENGTH_TOO_LONGOk returns a tuple with the IMAGE_LINK_LENGTH_TOO_LONG field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIMAGE_LINK_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationErrors) SetIMAGE_LINK_LENGTH_TOO_LONG(v int32)`

SetIMAGE_LINK_LENGTH_TOO_LONG sets IMAGE_LINK_LENGTH_TOO_LONG field to given value.

### HasIMAGE_LINK_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationErrors) HasIMAGE_LINK_LENGTH_TOO_LONG() bool`

HasIMAGE_LINK_LENGTH_TOO_LONG returns a boolean if a field has been set.

### GetINVALID_DOMAIN

`func (o *CatalogsFeedValidationErrors) GetINVALID_DOMAIN() int32`

GetINVALID_DOMAIN returns the INVALID_DOMAIN field if non-nil, zero value otherwise.

### GetINVALID_DOMAINOk

`func (o *CatalogsFeedValidationErrors) GetINVALID_DOMAINOk() (*int32, bool)`

GetINVALID_DOMAINOk returns a tuple with the INVALID_DOMAIN field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetINVALID_DOMAIN

`func (o *CatalogsFeedValidationErrors) SetINVALID_DOMAIN(v int32)`

SetINVALID_DOMAIN sets INVALID_DOMAIN field to given value.

### HasINVALID_DOMAIN

`func (o *CatalogsFeedValidationErrors) HasINVALID_DOMAIN() bool`

HasINVALID_DOMAIN returns a boolean if a field has been set.

### GetFEED_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationErrors) GetFEED_LENGTH_TOO_LONG() int32`

GetFEED_LENGTH_TOO_LONG returns the FEED_LENGTH_TOO_LONG field if non-nil, zero value otherwise.

### GetFEED_LENGTH_TOO_LONGOk

`func (o *CatalogsFeedValidationErrors) GetFEED_LENGTH_TOO_LONGOk() (*int32, bool)`

GetFEED_LENGTH_TOO_LONGOk returns a tuple with the FEED_LENGTH_TOO_LONG field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFEED_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationErrors) SetFEED_LENGTH_TOO_LONG(v int32)`

SetFEED_LENGTH_TOO_LONG sets FEED_LENGTH_TOO_LONG field to given value.

### HasFEED_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationErrors) HasFEED_LENGTH_TOO_LONG() bool`

HasFEED_LENGTH_TOO_LONG returns a boolean if a field has been set.

### GetLINK_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationErrors) GetLINK_LENGTH_TOO_LONG() int32`

GetLINK_LENGTH_TOO_LONG returns the LINK_LENGTH_TOO_LONG field if non-nil, zero value otherwise.

### GetLINK_LENGTH_TOO_LONGOk

`func (o *CatalogsFeedValidationErrors) GetLINK_LENGTH_TOO_LONGOk() (*int32, bool)`

GetLINK_LENGTH_TOO_LONGOk returns a tuple with the LINK_LENGTH_TOO_LONG field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLINK_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationErrors) SetLINK_LENGTH_TOO_LONG(v int32)`

SetLINK_LENGTH_TOO_LONG sets LINK_LENGTH_TOO_LONG field to given value.

### HasLINK_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationErrors) HasLINK_LENGTH_TOO_LONG() bool`

HasLINK_LENGTH_TOO_LONG returns a boolean if a field has been set.

### GetMALFORMED_XML

`func (o *CatalogsFeedValidationErrors) GetMALFORMED_XML() int32`

GetMALFORMED_XML returns the MALFORMED_XML field if non-nil, zero value otherwise.

### GetMALFORMED_XMLOk

`func (o *CatalogsFeedValidationErrors) GetMALFORMED_XMLOk() (*int32, bool)`

GetMALFORMED_XMLOk returns a tuple with the MALFORMED_XML field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMALFORMED_XML

`func (o *CatalogsFeedValidationErrors) SetMALFORMED_XML(v int32)`

SetMALFORMED_XML sets MALFORMED_XML field to given value.

### HasMALFORMED_XML

`func (o *CatalogsFeedValidationErrors) HasMALFORMED_XML() bool`

HasMALFORMED_XML returns a boolean if a field has been set.

### GetPRICE_MISSING

`func (o *CatalogsFeedValidationErrors) GetPRICE_MISSING() int32`

GetPRICE_MISSING returns the PRICE_MISSING field if non-nil, zero value otherwise.

### GetPRICE_MISSINGOk

`func (o *CatalogsFeedValidationErrors) GetPRICE_MISSINGOk() (*int32, bool)`

GetPRICE_MISSINGOk returns a tuple with the PRICE_MISSING field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPRICE_MISSING

`func (o *CatalogsFeedValidationErrors) SetPRICE_MISSING(v int32)`

SetPRICE_MISSING sets PRICE_MISSING field to given value.

### HasPRICE_MISSING

`func (o *CatalogsFeedValidationErrors) HasPRICE_MISSING() bool`

HasPRICE_MISSING returns a boolean if a field has been set.

### GetFEED_TOO_SMALL

`func (o *CatalogsFeedValidationErrors) GetFEED_TOO_SMALL() int32`

GetFEED_TOO_SMALL returns the FEED_TOO_SMALL field if non-nil, zero value otherwise.

### GetFEED_TOO_SMALLOk

`func (o *CatalogsFeedValidationErrors) GetFEED_TOO_SMALLOk() (*int32, bool)`

GetFEED_TOO_SMALLOk returns a tuple with the FEED_TOO_SMALL field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFEED_TOO_SMALL

`func (o *CatalogsFeedValidationErrors) SetFEED_TOO_SMALL(v int32)`

SetFEED_TOO_SMALL sets FEED_TOO_SMALL field to given value.

### HasFEED_TOO_SMALL

`func (o *CatalogsFeedValidationErrors) HasFEED_TOO_SMALL() bool`

HasFEED_TOO_SMALL returns a boolean if a field has been set.

### GetMAX_ITEMS_PER_ITEM_GROUP_EXCEEDED

`func (o *CatalogsFeedValidationErrors) GetMAX_ITEMS_PER_ITEM_GROUP_EXCEEDED() int32`

GetMAX_ITEMS_PER_ITEM_GROUP_EXCEEDED returns the MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED field if non-nil, zero value otherwise.

### GetMAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDOk

`func (o *CatalogsFeedValidationErrors) GetMAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDOk() (*int32, bool)`

GetMAX_ITEMS_PER_ITEM_GROUP_EXCEEDEDOk returns a tuple with the MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMAX_ITEMS_PER_ITEM_GROUP_EXCEEDED

`func (o *CatalogsFeedValidationErrors) SetMAX_ITEMS_PER_ITEM_GROUP_EXCEEDED(v int32)`

SetMAX_ITEMS_PER_ITEM_GROUP_EXCEEDED sets MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED field to given value.

### HasMAX_ITEMS_PER_ITEM_GROUP_EXCEEDED

`func (o *CatalogsFeedValidationErrors) HasMAX_ITEMS_PER_ITEM_GROUP_EXCEEDED() bool`

HasMAX_ITEMS_PER_ITEM_GROUP_EXCEEDED returns a boolean if a field has been set.

### GetITEM_MAIN_IMAGE_DOWNLOAD_FAILURE

`func (o *CatalogsFeedValidationErrors) GetITEM_MAIN_IMAGE_DOWNLOAD_FAILURE() int32`

GetITEM_MAIN_IMAGE_DOWNLOAD_FAILURE returns the ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE field if non-nil, zero value otherwise.

### GetITEM_MAIN_IMAGE_DOWNLOAD_FAILUREOk

`func (o *CatalogsFeedValidationErrors) GetITEM_MAIN_IMAGE_DOWNLOAD_FAILUREOk() (*int32, bool)`

GetITEM_MAIN_IMAGE_DOWNLOAD_FAILUREOk returns a tuple with the ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetITEM_MAIN_IMAGE_DOWNLOAD_FAILURE

`func (o *CatalogsFeedValidationErrors) SetITEM_MAIN_IMAGE_DOWNLOAD_FAILURE(v int32)`

SetITEM_MAIN_IMAGE_DOWNLOAD_FAILURE sets ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE field to given value.

### HasITEM_MAIN_IMAGE_DOWNLOAD_FAILURE

`func (o *CatalogsFeedValidationErrors) HasITEM_MAIN_IMAGE_DOWNLOAD_FAILURE() bool`

HasITEM_MAIN_IMAGE_DOWNLOAD_FAILURE returns a boolean if a field has been set.

### GetPINJOIN_CONTENT_UNSAFE

`func (o *CatalogsFeedValidationErrors) GetPINJOIN_CONTENT_UNSAFE() int32`

GetPINJOIN_CONTENT_UNSAFE returns the PINJOIN_CONTENT_UNSAFE field if non-nil, zero value otherwise.

### GetPINJOIN_CONTENT_UNSAFEOk

`func (o *CatalogsFeedValidationErrors) GetPINJOIN_CONTENT_UNSAFEOk() (*int32, bool)`

GetPINJOIN_CONTENT_UNSAFEOk returns a tuple with the PINJOIN_CONTENT_UNSAFE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPINJOIN_CONTENT_UNSAFE

`func (o *CatalogsFeedValidationErrors) SetPINJOIN_CONTENT_UNSAFE(v int32)`

SetPINJOIN_CONTENT_UNSAFE sets PINJOIN_CONTENT_UNSAFE field to given value.

### HasPINJOIN_CONTENT_UNSAFE

`func (o *CatalogsFeedValidationErrors) HasPINJOIN_CONTENT_UNSAFE() bool`

HasPINJOIN_CONTENT_UNSAFE returns a boolean if a field has been set.

### GetBLOCKLISTED_IMAGE_SIGNATURE

`func (o *CatalogsFeedValidationErrors) GetBLOCKLISTED_IMAGE_SIGNATURE() int32`

GetBLOCKLISTED_IMAGE_SIGNATURE returns the BLOCKLISTED_IMAGE_SIGNATURE field if non-nil, zero value otherwise.

### GetBLOCKLISTED_IMAGE_SIGNATUREOk

`func (o *CatalogsFeedValidationErrors) GetBLOCKLISTED_IMAGE_SIGNATUREOk() (*int32, bool)`

GetBLOCKLISTED_IMAGE_SIGNATUREOk returns a tuple with the BLOCKLISTED_IMAGE_SIGNATURE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBLOCKLISTED_IMAGE_SIGNATURE

`func (o *CatalogsFeedValidationErrors) SetBLOCKLISTED_IMAGE_SIGNATURE(v int32)`

SetBLOCKLISTED_IMAGE_SIGNATURE sets BLOCKLISTED_IMAGE_SIGNATURE field to given value.

### HasBLOCKLISTED_IMAGE_SIGNATURE

`func (o *CatalogsFeedValidationErrors) HasBLOCKLISTED_IMAGE_SIGNATURE() bool`

HasBLOCKLISTED_IMAGE_SIGNATURE returns a boolean if a field has been set.

### GetLIST_PRICE_INVALID

`func (o *CatalogsFeedValidationErrors) GetLIST_PRICE_INVALID() int32`

GetLIST_PRICE_INVALID returns the LIST_PRICE_INVALID field if non-nil, zero value otherwise.

### GetLIST_PRICE_INVALIDOk

`func (o *CatalogsFeedValidationErrors) GetLIST_PRICE_INVALIDOk() (*int32, bool)`

GetLIST_PRICE_INVALIDOk returns a tuple with the LIST_PRICE_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLIST_PRICE_INVALID

`func (o *CatalogsFeedValidationErrors) SetLIST_PRICE_INVALID(v int32)`

SetLIST_PRICE_INVALID sets LIST_PRICE_INVALID field to given value.

### HasLIST_PRICE_INVALID

`func (o *CatalogsFeedValidationErrors) HasLIST_PRICE_INVALID() bool`

HasLIST_PRICE_INVALID returns a boolean if a field has been set.

### GetPRICE_CANNOT_BE_DETERMINED

`func (o *CatalogsFeedValidationErrors) GetPRICE_CANNOT_BE_DETERMINED() int32`

GetPRICE_CANNOT_BE_DETERMINED returns the PRICE_CANNOT_BE_DETERMINED field if non-nil, zero value otherwise.

### GetPRICE_CANNOT_BE_DETERMINEDOk

`func (o *CatalogsFeedValidationErrors) GetPRICE_CANNOT_BE_DETERMINEDOk() (*int32, bool)`

GetPRICE_CANNOT_BE_DETERMINEDOk returns a tuple with the PRICE_CANNOT_BE_DETERMINED field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPRICE_CANNOT_BE_DETERMINED

`func (o *CatalogsFeedValidationErrors) SetPRICE_CANNOT_BE_DETERMINED(v int32)`

SetPRICE_CANNOT_BE_DETERMINED sets PRICE_CANNOT_BE_DETERMINED field to given value.

### HasPRICE_CANNOT_BE_DETERMINED

`func (o *CatalogsFeedValidationErrors) HasPRICE_CANNOT_BE_DETERMINED() bool`

HasPRICE_CANNOT_BE_DETERMINED returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


