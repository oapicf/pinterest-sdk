# CatalogsFeedValidationWarnings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AD_LINK_FORMAT_WARNING** | Pointer to **int32** | Some items have ad links that are formatted incorrectly. | [optional] 
**AD_LINK_SAME_AS_LINK** | Pointer to **int32** | Some items have ad link URLs that are duplicates of the link URLs for those items. | [optional] 
**TITLE_LENGTH_TOO_LONG** | Pointer to **int32** | The title for some items were truncated because they contain too many characters. | [optional] 
**DESCRIPTION_LENGTH_TOO_LONG** | Pointer to **int32** | The description for some items were truncated because they contain too many characters. | [optional] 
**GENDER_INVALID** | Pointer to **int32** | Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] 
**AGE_GROUP_INVALID** | Pointer to **int32** | Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] 
**SIZE_TYPE_INVALID** | Pointer to **int32** | Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] 
**SIZE_SYSTEM_INVALID** | Pointer to **int32** | Some items have size system values which are not one of the supported size systems. | [optional] 
**LINK_FORMAT_WARNING** | Pointer to **int32** | Some items have an invalid product link which contains invalid UTM tracking paramaters. | [optional] 
**SALES_PRICE_INVALID** | Pointer to **int32** | Some items have sale price values that are higher than the original price of the item. | [optional] 
**PRODUCT_CATEGORY_DEPTH_WARNING** | Pointer to **int32** | Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences. | [optional] 
**ADWORDS_FORMAT_WARNING** | Pointer to **int32** | Some items have adwords_redirect links that are formatted incorrectly. | [optional] 
**ADWORDS_SAME_AS_LINK** | Pointer to **int32** | Some items have adwords_redirect URLs that are duplicates of the link URLs for those items. | [optional] 
**DUPLICATE_HEADERS** | Pointer to **int32** | Your feed contains duplicate headers. | [optional] 
**FETCH_SAME_SIGNATURE** | Pointer to **int32** | Ingestion completed early because there are no changes to your feed since the last successful update. | [optional] 
**ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG** | Pointer to **int32** | Some items have additional_image_link URLs that contain too many characters, so those items will not be published. | [optional] 
**ADDITIONAL_IMAGE_LINK_WARNING** | Pointer to **int32** | Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items. | [optional] 
**IMAGE_LINK_WARNING** | Pointer to **int32** | Some items have image_link URLs that are formatted incorrectly and will not be published with those items. | [optional] 
**SHIPPING_INVALID** | Pointer to **int32** | Some items have shipping values that are formatted incorrectly. | [optional] 
**TAX_INVALID** | Pointer to **int32** | Some items have tax values that are formatted incorrectly. | [optional] 
**SHIPPING_WEIGHT_INVALID** | Pointer to **int32** | Some items have invalid shipping_weight values. | [optional] 
**EXPIRATION_DATE_INVALID** | Pointer to **int32** | Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date. | [optional] 
**AVAILABILITY_DATE_INVALID** | Pointer to **int32** | Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date. | [optional] 
**SALE_DATE_INVALID** | Pointer to **int32** | Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date. | [optional] 
**WEIGHT_UNIT_INVALID** | Pointer to **int32** | Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit. | [optional] 
**IS_BUNDLE_INVALID** | Pointer to **int32** | Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products. | [optional] 
**UPDATED_TIME_INVALID** | Pointer to **int32** | Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time. | [optional] 
**CUSTOM_LABEL_LENGTH_TOO_LONG** | Pointer to **int32** | Some items have custom_label values that are too long, those items will be published without that custom label. | [optional] 
**PRODUCT_TYPE_LENGTH_TOO_LONG** | Pointer to **int32** | Some items have product_type values that are too long, those items will be published without that product type. | [optional] 
**TOO_MANY_ADDITIONAL_IMAGE_LINKS** | Pointer to **int32** | Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images. | [optional] 
**MULTIPACK_INVALID** | Pointer to **int32** | Some items have invalid multipack values. | [optional] 
**INDEXED_PRODUCT_COUNT_LARGE_DELTA** | Pointer to **int32** | The product count has increased or decreased significantly compared to the last successful ingestion. | [optional] 
**ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE** | Pointer to **int32** | Some items include additional_image_links that can&#39;t be found. | [optional] 
**OPTIONAL_PRODUCT_CATEGORY_MISSING** | Pointer to **int32** | Some items are missing a google_product_category. | [optional] 
**OPTIONAL_PRODUCT_CATEGORY_INVALID** | Pointer to **int32** | Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy. | [optional] 
**OPTIONAL_CONDITION_MISSING** | Pointer to **int32** | Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences. | [optional] 
**OPTIONAL_CONDITION_INVALID** | Pointer to **int32** | Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] 
**IOS_DEEP_LINK_INVALID** | Pointer to **int32** | Some items include invalid ios_deep_link values. | [optional] 
**ANDROID_DEEP_LINK_INVALID** | Pointer to **int32** | Some items include invalid android_deep_link. | [optional] 
**UTM_SOURCE_AUTO_CORRECTED** | Pointer to **int32** | Some items include utm_source values that are formatted incorrectly and have been automatically corrected. | [optional] 
**COUNTRY_DOES_NOT_MAP_TO_CURRENCY** | Pointer to **int32** | Some items include a currency that doesn&#39;t match the usual currency for the location where that product is sold or shipped. | [optional] 
**MIN_AD_PRICE_INVALID** | Pointer to **int32** | Some items include min_ad_price values that are formatted incorrectly. | [optional] 
**GTIN_INVALID** | Pointer to **int32** | Some items include incorrectly formatted GTINs. | [optional] 
**INCONSISTENT_CURRENCY_VALUES** | Pointer to **int32** | Some items include inconsistent currencies in price fields. | [optional] 
**SALES_PRICE_TOO_LOW** | Pointer to **int32** | Some items include sales price that is much lower than the list price. | [optional] 
**SHIPPING_WIDTH_INVALID** | Pointer to **int32** | Some items include incorrectly formatted shipping_width. | [optional] 
**SHIPPING_HEIGHT_INVALID** | Pointer to **int32** | Some items include incorrectly formatted shipping_height. | [optional] 
**SALES_PRICE_TOO_HIGH** | Pointer to **int32** | Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price. | [optional] 
**MPN_INVALID** | Pointer to **int32** | Some items include incorrectly formatted MPNs. | [optional] 

## Methods

### NewCatalogsFeedValidationWarnings

`func NewCatalogsFeedValidationWarnings() *CatalogsFeedValidationWarnings`

NewCatalogsFeedValidationWarnings instantiates a new CatalogsFeedValidationWarnings object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsFeedValidationWarningsWithDefaults

`func NewCatalogsFeedValidationWarningsWithDefaults() *CatalogsFeedValidationWarnings`

NewCatalogsFeedValidationWarningsWithDefaults instantiates a new CatalogsFeedValidationWarnings object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAD_LINK_FORMAT_WARNING

`func (o *CatalogsFeedValidationWarnings) GetAD_LINK_FORMAT_WARNING() int32`

GetAD_LINK_FORMAT_WARNING returns the AD_LINK_FORMAT_WARNING field if non-nil, zero value otherwise.

### GetAD_LINK_FORMAT_WARNINGOk

`func (o *CatalogsFeedValidationWarnings) GetAD_LINK_FORMAT_WARNINGOk() (*int32, bool)`

GetAD_LINK_FORMAT_WARNINGOk returns a tuple with the AD_LINK_FORMAT_WARNING field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAD_LINK_FORMAT_WARNING

`func (o *CatalogsFeedValidationWarnings) SetAD_LINK_FORMAT_WARNING(v int32)`

SetAD_LINK_FORMAT_WARNING sets AD_LINK_FORMAT_WARNING field to given value.

### HasAD_LINK_FORMAT_WARNING

`func (o *CatalogsFeedValidationWarnings) HasAD_LINK_FORMAT_WARNING() bool`

HasAD_LINK_FORMAT_WARNING returns a boolean if a field has been set.

### GetAD_LINK_SAME_AS_LINK

`func (o *CatalogsFeedValidationWarnings) GetAD_LINK_SAME_AS_LINK() int32`

GetAD_LINK_SAME_AS_LINK returns the AD_LINK_SAME_AS_LINK field if non-nil, zero value otherwise.

### GetAD_LINK_SAME_AS_LINKOk

`func (o *CatalogsFeedValidationWarnings) GetAD_LINK_SAME_AS_LINKOk() (*int32, bool)`

GetAD_LINK_SAME_AS_LINKOk returns a tuple with the AD_LINK_SAME_AS_LINK field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAD_LINK_SAME_AS_LINK

`func (o *CatalogsFeedValidationWarnings) SetAD_LINK_SAME_AS_LINK(v int32)`

SetAD_LINK_SAME_AS_LINK sets AD_LINK_SAME_AS_LINK field to given value.

### HasAD_LINK_SAME_AS_LINK

`func (o *CatalogsFeedValidationWarnings) HasAD_LINK_SAME_AS_LINK() bool`

HasAD_LINK_SAME_AS_LINK returns a boolean if a field has been set.

### GetTITLE_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationWarnings) GetTITLE_LENGTH_TOO_LONG() int32`

GetTITLE_LENGTH_TOO_LONG returns the TITLE_LENGTH_TOO_LONG field if non-nil, zero value otherwise.

### GetTITLE_LENGTH_TOO_LONGOk

`func (o *CatalogsFeedValidationWarnings) GetTITLE_LENGTH_TOO_LONGOk() (*int32, bool)`

GetTITLE_LENGTH_TOO_LONGOk returns a tuple with the TITLE_LENGTH_TOO_LONG field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTITLE_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationWarnings) SetTITLE_LENGTH_TOO_LONG(v int32)`

SetTITLE_LENGTH_TOO_LONG sets TITLE_LENGTH_TOO_LONG field to given value.

### HasTITLE_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationWarnings) HasTITLE_LENGTH_TOO_LONG() bool`

HasTITLE_LENGTH_TOO_LONG returns a boolean if a field has been set.

### GetDESCRIPTION_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationWarnings) GetDESCRIPTION_LENGTH_TOO_LONG() int32`

GetDESCRIPTION_LENGTH_TOO_LONG returns the DESCRIPTION_LENGTH_TOO_LONG field if non-nil, zero value otherwise.

### GetDESCRIPTION_LENGTH_TOO_LONGOk

`func (o *CatalogsFeedValidationWarnings) GetDESCRIPTION_LENGTH_TOO_LONGOk() (*int32, bool)`

GetDESCRIPTION_LENGTH_TOO_LONGOk returns a tuple with the DESCRIPTION_LENGTH_TOO_LONG field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDESCRIPTION_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationWarnings) SetDESCRIPTION_LENGTH_TOO_LONG(v int32)`

SetDESCRIPTION_LENGTH_TOO_LONG sets DESCRIPTION_LENGTH_TOO_LONG field to given value.

### HasDESCRIPTION_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationWarnings) HasDESCRIPTION_LENGTH_TOO_LONG() bool`

HasDESCRIPTION_LENGTH_TOO_LONG returns a boolean if a field has been set.

### GetGENDER_INVALID

`func (o *CatalogsFeedValidationWarnings) GetGENDER_INVALID() int32`

GetGENDER_INVALID returns the GENDER_INVALID field if non-nil, zero value otherwise.

### GetGENDER_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetGENDER_INVALIDOk() (*int32, bool)`

GetGENDER_INVALIDOk returns a tuple with the GENDER_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGENDER_INVALID

`func (o *CatalogsFeedValidationWarnings) SetGENDER_INVALID(v int32)`

SetGENDER_INVALID sets GENDER_INVALID field to given value.

### HasGENDER_INVALID

`func (o *CatalogsFeedValidationWarnings) HasGENDER_INVALID() bool`

HasGENDER_INVALID returns a boolean if a field has been set.

### GetAGE_GROUP_INVALID

`func (o *CatalogsFeedValidationWarnings) GetAGE_GROUP_INVALID() int32`

GetAGE_GROUP_INVALID returns the AGE_GROUP_INVALID field if non-nil, zero value otherwise.

### GetAGE_GROUP_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetAGE_GROUP_INVALIDOk() (*int32, bool)`

GetAGE_GROUP_INVALIDOk returns a tuple with the AGE_GROUP_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAGE_GROUP_INVALID

`func (o *CatalogsFeedValidationWarnings) SetAGE_GROUP_INVALID(v int32)`

SetAGE_GROUP_INVALID sets AGE_GROUP_INVALID field to given value.

### HasAGE_GROUP_INVALID

`func (o *CatalogsFeedValidationWarnings) HasAGE_GROUP_INVALID() bool`

HasAGE_GROUP_INVALID returns a boolean if a field has been set.

### GetSIZE_TYPE_INVALID

`func (o *CatalogsFeedValidationWarnings) GetSIZE_TYPE_INVALID() int32`

GetSIZE_TYPE_INVALID returns the SIZE_TYPE_INVALID field if non-nil, zero value otherwise.

### GetSIZE_TYPE_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetSIZE_TYPE_INVALIDOk() (*int32, bool)`

GetSIZE_TYPE_INVALIDOk returns a tuple with the SIZE_TYPE_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSIZE_TYPE_INVALID

`func (o *CatalogsFeedValidationWarnings) SetSIZE_TYPE_INVALID(v int32)`

SetSIZE_TYPE_INVALID sets SIZE_TYPE_INVALID field to given value.

### HasSIZE_TYPE_INVALID

`func (o *CatalogsFeedValidationWarnings) HasSIZE_TYPE_INVALID() bool`

HasSIZE_TYPE_INVALID returns a boolean if a field has been set.

### GetSIZE_SYSTEM_INVALID

`func (o *CatalogsFeedValidationWarnings) GetSIZE_SYSTEM_INVALID() int32`

GetSIZE_SYSTEM_INVALID returns the SIZE_SYSTEM_INVALID field if non-nil, zero value otherwise.

### GetSIZE_SYSTEM_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetSIZE_SYSTEM_INVALIDOk() (*int32, bool)`

GetSIZE_SYSTEM_INVALIDOk returns a tuple with the SIZE_SYSTEM_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSIZE_SYSTEM_INVALID

`func (o *CatalogsFeedValidationWarnings) SetSIZE_SYSTEM_INVALID(v int32)`

SetSIZE_SYSTEM_INVALID sets SIZE_SYSTEM_INVALID field to given value.

### HasSIZE_SYSTEM_INVALID

`func (o *CatalogsFeedValidationWarnings) HasSIZE_SYSTEM_INVALID() bool`

HasSIZE_SYSTEM_INVALID returns a boolean if a field has been set.

### GetLINK_FORMAT_WARNING

`func (o *CatalogsFeedValidationWarnings) GetLINK_FORMAT_WARNING() int32`

GetLINK_FORMAT_WARNING returns the LINK_FORMAT_WARNING field if non-nil, zero value otherwise.

### GetLINK_FORMAT_WARNINGOk

`func (o *CatalogsFeedValidationWarnings) GetLINK_FORMAT_WARNINGOk() (*int32, bool)`

GetLINK_FORMAT_WARNINGOk returns a tuple with the LINK_FORMAT_WARNING field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLINK_FORMAT_WARNING

`func (o *CatalogsFeedValidationWarnings) SetLINK_FORMAT_WARNING(v int32)`

SetLINK_FORMAT_WARNING sets LINK_FORMAT_WARNING field to given value.

### HasLINK_FORMAT_WARNING

`func (o *CatalogsFeedValidationWarnings) HasLINK_FORMAT_WARNING() bool`

HasLINK_FORMAT_WARNING returns a boolean if a field has been set.

### GetSALES_PRICE_INVALID

`func (o *CatalogsFeedValidationWarnings) GetSALES_PRICE_INVALID() int32`

GetSALES_PRICE_INVALID returns the SALES_PRICE_INVALID field if non-nil, zero value otherwise.

### GetSALES_PRICE_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetSALES_PRICE_INVALIDOk() (*int32, bool)`

GetSALES_PRICE_INVALIDOk returns a tuple with the SALES_PRICE_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSALES_PRICE_INVALID

`func (o *CatalogsFeedValidationWarnings) SetSALES_PRICE_INVALID(v int32)`

SetSALES_PRICE_INVALID sets SALES_PRICE_INVALID field to given value.

### HasSALES_PRICE_INVALID

`func (o *CatalogsFeedValidationWarnings) HasSALES_PRICE_INVALID() bool`

HasSALES_PRICE_INVALID returns a boolean if a field has been set.

### GetPRODUCT_CATEGORY_DEPTH_WARNING

`func (o *CatalogsFeedValidationWarnings) GetPRODUCT_CATEGORY_DEPTH_WARNING() int32`

GetPRODUCT_CATEGORY_DEPTH_WARNING returns the PRODUCT_CATEGORY_DEPTH_WARNING field if non-nil, zero value otherwise.

### GetPRODUCT_CATEGORY_DEPTH_WARNINGOk

`func (o *CatalogsFeedValidationWarnings) GetPRODUCT_CATEGORY_DEPTH_WARNINGOk() (*int32, bool)`

GetPRODUCT_CATEGORY_DEPTH_WARNINGOk returns a tuple with the PRODUCT_CATEGORY_DEPTH_WARNING field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPRODUCT_CATEGORY_DEPTH_WARNING

`func (o *CatalogsFeedValidationWarnings) SetPRODUCT_CATEGORY_DEPTH_WARNING(v int32)`

SetPRODUCT_CATEGORY_DEPTH_WARNING sets PRODUCT_CATEGORY_DEPTH_WARNING field to given value.

### HasPRODUCT_CATEGORY_DEPTH_WARNING

`func (o *CatalogsFeedValidationWarnings) HasPRODUCT_CATEGORY_DEPTH_WARNING() bool`

HasPRODUCT_CATEGORY_DEPTH_WARNING returns a boolean if a field has been set.

### GetADWORDS_FORMAT_WARNING

`func (o *CatalogsFeedValidationWarnings) GetADWORDS_FORMAT_WARNING() int32`

GetADWORDS_FORMAT_WARNING returns the ADWORDS_FORMAT_WARNING field if non-nil, zero value otherwise.

### GetADWORDS_FORMAT_WARNINGOk

`func (o *CatalogsFeedValidationWarnings) GetADWORDS_FORMAT_WARNINGOk() (*int32, bool)`

GetADWORDS_FORMAT_WARNINGOk returns a tuple with the ADWORDS_FORMAT_WARNING field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetADWORDS_FORMAT_WARNING

`func (o *CatalogsFeedValidationWarnings) SetADWORDS_FORMAT_WARNING(v int32)`

SetADWORDS_FORMAT_WARNING sets ADWORDS_FORMAT_WARNING field to given value.

### HasADWORDS_FORMAT_WARNING

`func (o *CatalogsFeedValidationWarnings) HasADWORDS_FORMAT_WARNING() bool`

HasADWORDS_FORMAT_WARNING returns a boolean if a field has been set.

### GetADWORDS_SAME_AS_LINK

`func (o *CatalogsFeedValidationWarnings) GetADWORDS_SAME_AS_LINK() int32`

GetADWORDS_SAME_AS_LINK returns the ADWORDS_SAME_AS_LINK field if non-nil, zero value otherwise.

### GetADWORDS_SAME_AS_LINKOk

`func (o *CatalogsFeedValidationWarnings) GetADWORDS_SAME_AS_LINKOk() (*int32, bool)`

GetADWORDS_SAME_AS_LINKOk returns a tuple with the ADWORDS_SAME_AS_LINK field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetADWORDS_SAME_AS_LINK

`func (o *CatalogsFeedValidationWarnings) SetADWORDS_SAME_AS_LINK(v int32)`

SetADWORDS_SAME_AS_LINK sets ADWORDS_SAME_AS_LINK field to given value.

### HasADWORDS_SAME_AS_LINK

`func (o *CatalogsFeedValidationWarnings) HasADWORDS_SAME_AS_LINK() bool`

HasADWORDS_SAME_AS_LINK returns a boolean if a field has been set.

### GetDUPLICATE_HEADERS

`func (o *CatalogsFeedValidationWarnings) GetDUPLICATE_HEADERS() int32`

GetDUPLICATE_HEADERS returns the DUPLICATE_HEADERS field if non-nil, zero value otherwise.

### GetDUPLICATE_HEADERSOk

`func (o *CatalogsFeedValidationWarnings) GetDUPLICATE_HEADERSOk() (*int32, bool)`

GetDUPLICATE_HEADERSOk returns a tuple with the DUPLICATE_HEADERS field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDUPLICATE_HEADERS

`func (o *CatalogsFeedValidationWarnings) SetDUPLICATE_HEADERS(v int32)`

SetDUPLICATE_HEADERS sets DUPLICATE_HEADERS field to given value.

### HasDUPLICATE_HEADERS

`func (o *CatalogsFeedValidationWarnings) HasDUPLICATE_HEADERS() bool`

HasDUPLICATE_HEADERS returns a boolean if a field has been set.

### GetFETCH_SAME_SIGNATURE

`func (o *CatalogsFeedValidationWarnings) GetFETCH_SAME_SIGNATURE() int32`

GetFETCH_SAME_SIGNATURE returns the FETCH_SAME_SIGNATURE field if non-nil, zero value otherwise.

### GetFETCH_SAME_SIGNATUREOk

`func (o *CatalogsFeedValidationWarnings) GetFETCH_SAME_SIGNATUREOk() (*int32, bool)`

GetFETCH_SAME_SIGNATUREOk returns a tuple with the FETCH_SAME_SIGNATURE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFETCH_SAME_SIGNATURE

`func (o *CatalogsFeedValidationWarnings) SetFETCH_SAME_SIGNATURE(v int32)`

SetFETCH_SAME_SIGNATURE sets FETCH_SAME_SIGNATURE field to given value.

### HasFETCH_SAME_SIGNATURE

`func (o *CatalogsFeedValidationWarnings) HasFETCH_SAME_SIGNATURE() bool`

HasFETCH_SAME_SIGNATURE returns a boolean if a field has been set.

### GetADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationWarnings) GetADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG() int32`

GetADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG returns the ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG field if non-nil, zero value otherwise.

### GetADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONGOk

`func (o *CatalogsFeedValidationWarnings) GetADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONGOk() (*int32, bool)`

GetADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONGOk returns a tuple with the ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationWarnings) SetADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG(v int32)`

SetADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG sets ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG field to given value.

### HasADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationWarnings) HasADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG() bool`

HasADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG returns a boolean if a field has been set.

### GetADDITIONAL_IMAGE_LINK_WARNING

`func (o *CatalogsFeedValidationWarnings) GetADDITIONAL_IMAGE_LINK_WARNING() int32`

GetADDITIONAL_IMAGE_LINK_WARNING returns the ADDITIONAL_IMAGE_LINK_WARNING field if non-nil, zero value otherwise.

### GetADDITIONAL_IMAGE_LINK_WARNINGOk

`func (o *CatalogsFeedValidationWarnings) GetADDITIONAL_IMAGE_LINK_WARNINGOk() (*int32, bool)`

GetADDITIONAL_IMAGE_LINK_WARNINGOk returns a tuple with the ADDITIONAL_IMAGE_LINK_WARNING field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetADDITIONAL_IMAGE_LINK_WARNING

`func (o *CatalogsFeedValidationWarnings) SetADDITIONAL_IMAGE_LINK_WARNING(v int32)`

SetADDITIONAL_IMAGE_LINK_WARNING sets ADDITIONAL_IMAGE_LINK_WARNING field to given value.

### HasADDITIONAL_IMAGE_LINK_WARNING

`func (o *CatalogsFeedValidationWarnings) HasADDITIONAL_IMAGE_LINK_WARNING() bool`

HasADDITIONAL_IMAGE_LINK_WARNING returns a boolean if a field has been set.

### GetIMAGE_LINK_WARNING

`func (o *CatalogsFeedValidationWarnings) GetIMAGE_LINK_WARNING() int32`

GetIMAGE_LINK_WARNING returns the IMAGE_LINK_WARNING field if non-nil, zero value otherwise.

### GetIMAGE_LINK_WARNINGOk

`func (o *CatalogsFeedValidationWarnings) GetIMAGE_LINK_WARNINGOk() (*int32, bool)`

GetIMAGE_LINK_WARNINGOk returns a tuple with the IMAGE_LINK_WARNING field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIMAGE_LINK_WARNING

`func (o *CatalogsFeedValidationWarnings) SetIMAGE_LINK_WARNING(v int32)`

SetIMAGE_LINK_WARNING sets IMAGE_LINK_WARNING field to given value.

### HasIMAGE_LINK_WARNING

`func (o *CatalogsFeedValidationWarnings) HasIMAGE_LINK_WARNING() bool`

HasIMAGE_LINK_WARNING returns a boolean if a field has been set.

### GetSHIPPING_INVALID

`func (o *CatalogsFeedValidationWarnings) GetSHIPPING_INVALID() int32`

GetSHIPPING_INVALID returns the SHIPPING_INVALID field if non-nil, zero value otherwise.

### GetSHIPPING_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetSHIPPING_INVALIDOk() (*int32, bool)`

GetSHIPPING_INVALIDOk returns a tuple with the SHIPPING_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSHIPPING_INVALID

`func (o *CatalogsFeedValidationWarnings) SetSHIPPING_INVALID(v int32)`

SetSHIPPING_INVALID sets SHIPPING_INVALID field to given value.

### HasSHIPPING_INVALID

`func (o *CatalogsFeedValidationWarnings) HasSHIPPING_INVALID() bool`

HasSHIPPING_INVALID returns a boolean if a field has been set.

### GetTAX_INVALID

`func (o *CatalogsFeedValidationWarnings) GetTAX_INVALID() int32`

GetTAX_INVALID returns the TAX_INVALID field if non-nil, zero value otherwise.

### GetTAX_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetTAX_INVALIDOk() (*int32, bool)`

GetTAX_INVALIDOk returns a tuple with the TAX_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTAX_INVALID

`func (o *CatalogsFeedValidationWarnings) SetTAX_INVALID(v int32)`

SetTAX_INVALID sets TAX_INVALID field to given value.

### HasTAX_INVALID

`func (o *CatalogsFeedValidationWarnings) HasTAX_INVALID() bool`

HasTAX_INVALID returns a boolean if a field has been set.

### GetSHIPPING_WEIGHT_INVALID

`func (o *CatalogsFeedValidationWarnings) GetSHIPPING_WEIGHT_INVALID() int32`

GetSHIPPING_WEIGHT_INVALID returns the SHIPPING_WEIGHT_INVALID field if non-nil, zero value otherwise.

### GetSHIPPING_WEIGHT_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetSHIPPING_WEIGHT_INVALIDOk() (*int32, bool)`

GetSHIPPING_WEIGHT_INVALIDOk returns a tuple with the SHIPPING_WEIGHT_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSHIPPING_WEIGHT_INVALID

`func (o *CatalogsFeedValidationWarnings) SetSHIPPING_WEIGHT_INVALID(v int32)`

SetSHIPPING_WEIGHT_INVALID sets SHIPPING_WEIGHT_INVALID field to given value.

### HasSHIPPING_WEIGHT_INVALID

`func (o *CatalogsFeedValidationWarnings) HasSHIPPING_WEIGHT_INVALID() bool`

HasSHIPPING_WEIGHT_INVALID returns a boolean if a field has been set.

### GetEXPIRATION_DATE_INVALID

`func (o *CatalogsFeedValidationWarnings) GetEXPIRATION_DATE_INVALID() int32`

GetEXPIRATION_DATE_INVALID returns the EXPIRATION_DATE_INVALID field if non-nil, zero value otherwise.

### GetEXPIRATION_DATE_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetEXPIRATION_DATE_INVALIDOk() (*int32, bool)`

GetEXPIRATION_DATE_INVALIDOk returns a tuple with the EXPIRATION_DATE_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEXPIRATION_DATE_INVALID

`func (o *CatalogsFeedValidationWarnings) SetEXPIRATION_DATE_INVALID(v int32)`

SetEXPIRATION_DATE_INVALID sets EXPIRATION_DATE_INVALID field to given value.

### HasEXPIRATION_DATE_INVALID

`func (o *CatalogsFeedValidationWarnings) HasEXPIRATION_DATE_INVALID() bool`

HasEXPIRATION_DATE_INVALID returns a boolean if a field has been set.

### GetAVAILABILITY_DATE_INVALID

`func (o *CatalogsFeedValidationWarnings) GetAVAILABILITY_DATE_INVALID() int32`

GetAVAILABILITY_DATE_INVALID returns the AVAILABILITY_DATE_INVALID field if non-nil, zero value otherwise.

### GetAVAILABILITY_DATE_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetAVAILABILITY_DATE_INVALIDOk() (*int32, bool)`

GetAVAILABILITY_DATE_INVALIDOk returns a tuple with the AVAILABILITY_DATE_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAVAILABILITY_DATE_INVALID

`func (o *CatalogsFeedValidationWarnings) SetAVAILABILITY_DATE_INVALID(v int32)`

SetAVAILABILITY_DATE_INVALID sets AVAILABILITY_DATE_INVALID field to given value.

### HasAVAILABILITY_DATE_INVALID

`func (o *CatalogsFeedValidationWarnings) HasAVAILABILITY_DATE_INVALID() bool`

HasAVAILABILITY_DATE_INVALID returns a boolean if a field has been set.

### GetSALE_DATE_INVALID

`func (o *CatalogsFeedValidationWarnings) GetSALE_DATE_INVALID() int32`

GetSALE_DATE_INVALID returns the SALE_DATE_INVALID field if non-nil, zero value otherwise.

### GetSALE_DATE_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetSALE_DATE_INVALIDOk() (*int32, bool)`

GetSALE_DATE_INVALIDOk returns a tuple with the SALE_DATE_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSALE_DATE_INVALID

`func (o *CatalogsFeedValidationWarnings) SetSALE_DATE_INVALID(v int32)`

SetSALE_DATE_INVALID sets SALE_DATE_INVALID field to given value.

### HasSALE_DATE_INVALID

`func (o *CatalogsFeedValidationWarnings) HasSALE_DATE_INVALID() bool`

HasSALE_DATE_INVALID returns a boolean if a field has been set.

### GetWEIGHT_UNIT_INVALID

`func (o *CatalogsFeedValidationWarnings) GetWEIGHT_UNIT_INVALID() int32`

GetWEIGHT_UNIT_INVALID returns the WEIGHT_UNIT_INVALID field if non-nil, zero value otherwise.

### GetWEIGHT_UNIT_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetWEIGHT_UNIT_INVALIDOk() (*int32, bool)`

GetWEIGHT_UNIT_INVALIDOk returns a tuple with the WEIGHT_UNIT_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWEIGHT_UNIT_INVALID

`func (o *CatalogsFeedValidationWarnings) SetWEIGHT_UNIT_INVALID(v int32)`

SetWEIGHT_UNIT_INVALID sets WEIGHT_UNIT_INVALID field to given value.

### HasWEIGHT_UNIT_INVALID

`func (o *CatalogsFeedValidationWarnings) HasWEIGHT_UNIT_INVALID() bool`

HasWEIGHT_UNIT_INVALID returns a boolean if a field has been set.

### GetIS_BUNDLE_INVALID

`func (o *CatalogsFeedValidationWarnings) GetIS_BUNDLE_INVALID() int32`

GetIS_BUNDLE_INVALID returns the IS_BUNDLE_INVALID field if non-nil, zero value otherwise.

### GetIS_BUNDLE_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetIS_BUNDLE_INVALIDOk() (*int32, bool)`

GetIS_BUNDLE_INVALIDOk returns a tuple with the IS_BUNDLE_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIS_BUNDLE_INVALID

`func (o *CatalogsFeedValidationWarnings) SetIS_BUNDLE_INVALID(v int32)`

SetIS_BUNDLE_INVALID sets IS_BUNDLE_INVALID field to given value.

### HasIS_BUNDLE_INVALID

`func (o *CatalogsFeedValidationWarnings) HasIS_BUNDLE_INVALID() bool`

HasIS_BUNDLE_INVALID returns a boolean if a field has been set.

### GetUPDATED_TIME_INVALID

`func (o *CatalogsFeedValidationWarnings) GetUPDATED_TIME_INVALID() int32`

GetUPDATED_TIME_INVALID returns the UPDATED_TIME_INVALID field if non-nil, zero value otherwise.

### GetUPDATED_TIME_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetUPDATED_TIME_INVALIDOk() (*int32, bool)`

GetUPDATED_TIME_INVALIDOk returns a tuple with the UPDATED_TIME_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUPDATED_TIME_INVALID

`func (o *CatalogsFeedValidationWarnings) SetUPDATED_TIME_INVALID(v int32)`

SetUPDATED_TIME_INVALID sets UPDATED_TIME_INVALID field to given value.

### HasUPDATED_TIME_INVALID

`func (o *CatalogsFeedValidationWarnings) HasUPDATED_TIME_INVALID() bool`

HasUPDATED_TIME_INVALID returns a boolean if a field has been set.

### GetCUSTOM_LABEL_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationWarnings) GetCUSTOM_LABEL_LENGTH_TOO_LONG() int32`

GetCUSTOM_LABEL_LENGTH_TOO_LONG returns the CUSTOM_LABEL_LENGTH_TOO_LONG field if non-nil, zero value otherwise.

### GetCUSTOM_LABEL_LENGTH_TOO_LONGOk

`func (o *CatalogsFeedValidationWarnings) GetCUSTOM_LABEL_LENGTH_TOO_LONGOk() (*int32, bool)`

GetCUSTOM_LABEL_LENGTH_TOO_LONGOk returns a tuple with the CUSTOM_LABEL_LENGTH_TOO_LONG field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCUSTOM_LABEL_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationWarnings) SetCUSTOM_LABEL_LENGTH_TOO_LONG(v int32)`

SetCUSTOM_LABEL_LENGTH_TOO_LONG sets CUSTOM_LABEL_LENGTH_TOO_LONG field to given value.

### HasCUSTOM_LABEL_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationWarnings) HasCUSTOM_LABEL_LENGTH_TOO_LONG() bool`

HasCUSTOM_LABEL_LENGTH_TOO_LONG returns a boolean if a field has been set.

### GetPRODUCT_TYPE_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationWarnings) GetPRODUCT_TYPE_LENGTH_TOO_LONG() int32`

GetPRODUCT_TYPE_LENGTH_TOO_LONG returns the PRODUCT_TYPE_LENGTH_TOO_LONG field if non-nil, zero value otherwise.

### GetPRODUCT_TYPE_LENGTH_TOO_LONGOk

`func (o *CatalogsFeedValidationWarnings) GetPRODUCT_TYPE_LENGTH_TOO_LONGOk() (*int32, bool)`

GetPRODUCT_TYPE_LENGTH_TOO_LONGOk returns a tuple with the PRODUCT_TYPE_LENGTH_TOO_LONG field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPRODUCT_TYPE_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationWarnings) SetPRODUCT_TYPE_LENGTH_TOO_LONG(v int32)`

SetPRODUCT_TYPE_LENGTH_TOO_LONG sets PRODUCT_TYPE_LENGTH_TOO_LONG field to given value.

### HasPRODUCT_TYPE_LENGTH_TOO_LONG

`func (o *CatalogsFeedValidationWarnings) HasPRODUCT_TYPE_LENGTH_TOO_LONG() bool`

HasPRODUCT_TYPE_LENGTH_TOO_LONG returns a boolean if a field has been set.

### GetTOO_MANY_ADDITIONAL_IMAGE_LINKS

`func (o *CatalogsFeedValidationWarnings) GetTOO_MANY_ADDITIONAL_IMAGE_LINKS() int32`

GetTOO_MANY_ADDITIONAL_IMAGE_LINKS returns the TOO_MANY_ADDITIONAL_IMAGE_LINKS field if non-nil, zero value otherwise.

### GetTOO_MANY_ADDITIONAL_IMAGE_LINKSOk

`func (o *CatalogsFeedValidationWarnings) GetTOO_MANY_ADDITIONAL_IMAGE_LINKSOk() (*int32, bool)`

GetTOO_MANY_ADDITIONAL_IMAGE_LINKSOk returns a tuple with the TOO_MANY_ADDITIONAL_IMAGE_LINKS field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTOO_MANY_ADDITIONAL_IMAGE_LINKS

`func (o *CatalogsFeedValidationWarnings) SetTOO_MANY_ADDITIONAL_IMAGE_LINKS(v int32)`

SetTOO_MANY_ADDITIONAL_IMAGE_LINKS sets TOO_MANY_ADDITIONAL_IMAGE_LINKS field to given value.

### HasTOO_MANY_ADDITIONAL_IMAGE_LINKS

`func (o *CatalogsFeedValidationWarnings) HasTOO_MANY_ADDITIONAL_IMAGE_LINKS() bool`

HasTOO_MANY_ADDITIONAL_IMAGE_LINKS returns a boolean if a field has been set.

### GetMULTIPACK_INVALID

`func (o *CatalogsFeedValidationWarnings) GetMULTIPACK_INVALID() int32`

GetMULTIPACK_INVALID returns the MULTIPACK_INVALID field if non-nil, zero value otherwise.

### GetMULTIPACK_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetMULTIPACK_INVALIDOk() (*int32, bool)`

GetMULTIPACK_INVALIDOk returns a tuple with the MULTIPACK_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMULTIPACK_INVALID

`func (o *CatalogsFeedValidationWarnings) SetMULTIPACK_INVALID(v int32)`

SetMULTIPACK_INVALID sets MULTIPACK_INVALID field to given value.

### HasMULTIPACK_INVALID

`func (o *CatalogsFeedValidationWarnings) HasMULTIPACK_INVALID() bool`

HasMULTIPACK_INVALID returns a boolean if a field has been set.

### GetINDEXED_PRODUCT_COUNT_LARGE_DELTA

`func (o *CatalogsFeedValidationWarnings) GetINDEXED_PRODUCT_COUNT_LARGE_DELTA() int32`

GetINDEXED_PRODUCT_COUNT_LARGE_DELTA returns the INDEXED_PRODUCT_COUNT_LARGE_DELTA field if non-nil, zero value otherwise.

### GetINDEXED_PRODUCT_COUNT_LARGE_DELTAOk

`func (o *CatalogsFeedValidationWarnings) GetINDEXED_PRODUCT_COUNT_LARGE_DELTAOk() (*int32, bool)`

GetINDEXED_PRODUCT_COUNT_LARGE_DELTAOk returns a tuple with the INDEXED_PRODUCT_COUNT_LARGE_DELTA field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetINDEXED_PRODUCT_COUNT_LARGE_DELTA

`func (o *CatalogsFeedValidationWarnings) SetINDEXED_PRODUCT_COUNT_LARGE_DELTA(v int32)`

SetINDEXED_PRODUCT_COUNT_LARGE_DELTA sets INDEXED_PRODUCT_COUNT_LARGE_DELTA field to given value.

### HasINDEXED_PRODUCT_COUNT_LARGE_DELTA

`func (o *CatalogsFeedValidationWarnings) HasINDEXED_PRODUCT_COUNT_LARGE_DELTA() bool`

HasINDEXED_PRODUCT_COUNT_LARGE_DELTA returns a boolean if a field has been set.

### GetITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE

`func (o *CatalogsFeedValidationWarnings) GetITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE() int32`

GetITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE returns the ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE field if non-nil, zero value otherwise.

### GetITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILUREOk

`func (o *CatalogsFeedValidationWarnings) GetITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILUREOk() (*int32, bool)`

GetITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILUREOk returns a tuple with the ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE

`func (o *CatalogsFeedValidationWarnings) SetITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE(v int32)`

SetITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE sets ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE field to given value.

### HasITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE

`func (o *CatalogsFeedValidationWarnings) HasITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE() bool`

HasITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE returns a boolean if a field has been set.

### GetOPTIONAL_PRODUCT_CATEGORY_MISSING

`func (o *CatalogsFeedValidationWarnings) GetOPTIONAL_PRODUCT_CATEGORY_MISSING() int32`

GetOPTIONAL_PRODUCT_CATEGORY_MISSING returns the OPTIONAL_PRODUCT_CATEGORY_MISSING field if non-nil, zero value otherwise.

### GetOPTIONAL_PRODUCT_CATEGORY_MISSINGOk

`func (o *CatalogsFeedValidationWarnings) GetOPTIONAL_PRODUCT_CATEGORY_MISSINGOk() (*int32, bool)`

GetOPTIONAL_PRODUCT_CATEGORY_MISSINGOk returns a tuple with the OPTIONAL_PRODUCT_CATEGORY_MISSING field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOPTIONAL_PRODUCT_CATEGORY_MISSING

`func (o *CatalogsFeedValidationWarnings) SetOPTIONAL_PRODUCT_CATEGORY_MISSING(v int32)`

SetOPTIONAL_PRODUCT_CATEGORY_MISSING sets OPTIONAL_PRODUCT_CATEGORY_MISSING field to given value.

### HasOPTIONAL_PRODUCT_CATEGORY_MISSING

`func (o *CatalogsFeedValidationWarnings) HasOPTIONAL_PRODUCT_CATEGORY_MISSING() bool`

HasOPTIONAL_PRODUCT_CATEGORY_MISSING returns a boolean if a field has been set.

### GetOPTIONAL_PRODUCT_CATEGORY_INVALID

`func (o *CatalogsFeedValidationWarnings) GetOPTIONAL_PRODUCT_CATEGORY_INVALID() int32`

GetOPTIONAL_PRODUCT_CATEGORY_INVALID returns the OPTIONAL_PRODUCT_CATEGORY_INVALID field if non-nil, zero value otherwise.

### GetOPTIONAL_PRODUCT_CATEGORY_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetOPTIONAL_PRODUCT_CATEGORY_INVALIDOk() (*int32, bool)`

GetOPTIONAL_PRODUCT_CATEGORY_INVALIDOk returns a tuple with the OPTIONAL_PRODUCT_CATEGORY_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOPTIONAL_PRODUCT_CATEGORY_INVALID

`func (o *CatalogsFeedValidationWarnings) SetOPTIONAL_PRODUCT_CATEGORY_INVALID(v int32)`

SetOPTIONAL_PRODUCT_CATEGORY_INVALID sets OPTIONAL_PRODUCT_CATEGORY_INVALID field to given value.

### HasOPTIONAL_PRODUCT_CATEGORY_INVALID

`func (o *CatalogsFeedValidationWarnings) HasOPTIONAL_PRODUCT_CATEGORY_INVALID() bool`

HasOPTIONAL_PRODUCT_CATEGORY_INVALID returns a boolean if a field has been set.

### GetOPTIONAL_CONDITION_MISSING

`func (o *CatalogsFeedValidationWarnings) GetOPTIONAL_CONDITION_MISSING() int32`

GetOPTIONAL_CONDITION_MISSING returns the OPTIONAL_CONDITION_MISSING field if non-nil, zero value otherwise.

### GetOPTIONAL_CONDITION_MISSINGOk

`func (o *CatalogsFeedValidationWarnings) GetOPTIONAL_CONDITION_MISSINGOk() (*int32, bool)`

GetOPTIONAL_CONDITION_MISSINGOk returns a tuple with the OPTIONAL_CONDITION_MISSING field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOPTIONAL_CONDITION_MISSING

`func (o *CatalogsFeedValidationWarnings) SetOPTIONAL_CONDITION_MISSING(v int32)`

SetOPTIONAL_CONDITION_MISSING sets OPTIONAL_CONDITION_MISSING field to given value.

### HasOPTIONAL_CONDITION_MISSING

`func (o *CatalogsFeedValidationWarnings) HasOPTIONAL_CONDITION_MISSING() bool`

HasOPTIONAL_CONDITION_MISSING returns a boolean if a field has been set.

### GetOPTIONAL_CONDITION_INVALID

`func (o *CatalogsFeedValidationWarnings) GetOPTIONAL_CONDITION_INVALID() int32`

GetOPTIONAL_CONDITION_INVALID returns the OPTIONAL_CONDITION_INVALID field if non-nil, zero value otherwise.

### GetOPTIONAL_CONDITION_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetOPTIONAL_CONDITION_INVALIDOk() (*int32, bool)`

GetOPTIONAL_CONDITION_INVALIDOk returns a tuple with the OPTIONAL_CONDITION_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOPTIONAL_CONDITION_INVALID

`func (o *CatalogsFeedValidationWarnings) SetOPTIONAL_CONDITION_INVALID(v int32)`

SetOPTIONAL_CONDITION_INVALID sets OPTIONAL_CONDITION_INVALID field to given value.

### HasOPTIONAL_CONDITION_INVALID

`func (o *CatalogsFeedValidationWarnings) HasOPTIONAL_CONDITION_INVALID() bool`

HasOPTIONAL_CONDITION_INVALID returns a boolean if a field has been set.

### GetIOS_DEEP_LINK_INVALID

`func (o *CatalogsFeedValidationWarnings) GetIOS_DEEP_LINK_INVALID() int32`

GetIOS_DEEP_LINK_INVALID returns the IOS_DEEP_LINK_INVALID field if non-nil, zero value otherwise.

### GetIOS_DEEP_LINK_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetIOS_DEEP_LINK_INVALIDOk() (*int32, bool)`

GetIOS_DEEP_LINK_INVALIDOk returns a tuple with the IOS_DEEP_LINK_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIOS_DEEP_LINK_INVALID

`func (o *CatalogsFeedValidationWarnings) SetIOS_DEEP_LINK_INVALID(v int32)`

SetIOS_DEEP_LINK_INVALID sets IOS_DEEP_LINK_INVALID field to given value.

### HasIOS_DEEP_LINK_INVALID

`func (o *CatalogsFeedValidationWarnings) HasIOS_DEEP_LINK_INVALID() bool`

HasIOS_DEEP_LINK_INVALID returns a boolean if a field has been set.

### GetANDROID_DEEP_LINK_INVALID

`func (o *CatalogsFeedValidationWarnings) GetANDROID_DEEP_LINK_INVALID() int32`

GetANDROID_DEEP_LINK_INVALID returns the ANDROID_DEEP_LINK_INVALID field if non-nil, zero value otherwise.

### GetANDROID_DEEP_LINK_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetANDROID_DEEP_LINK_INVALIDOk() (*int32, bool)`

GetANDROID_DEEP_LINK_INVALIDOk returns a tuple with the ANDROID_DEEP_LINK_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetANDROID_DEEP_LINK_INVALID

`func (o *CatalogsFeedValidationWarnings) SetANDROID_DEEP_LINK_INVALID(v int32)`

SetANDROID_DEEP_LINK_INVALID sets ANDROID_DEEP_LINK_INVALID field to given value.

### HasANDROID_DEEP_LINK_INVALID

`func (o *CatalogsFeedValidationWarnings) HasANDROID_DEEP_LINK_INVALID() bool`

HasANDROID_DEEP_LINK_INVALID returns a boolean if a field has been set.

### GetUTM_SOURCE_AUTO_CORRECTED

`func (o *CatalogsFeedValidationWarnings) GetUTM_SOURCE_AUTO_CORRECTED() int32`

GetUTM_SOURCE_AUTO_CORRECTED returns the UTM_SOURCE_AUTO_CORRECTED field if non-nil, zero value otherwise.

### GetUTM_SOURCE_AUTO_CORRECTEDOk

`func (o *CatalogsFeedValidationWarnings) GetUTM_SOURCE_AUTO_CORRECTEDOk() (*int32, bool)`

GetUTM_SOURCE_AUTO_CORRECTEDOk returns a tuple with the UTM_SOURCE_AUTO_CORRECTED field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUTM_SOURCE_AUTO_CORRECTED

`func (o *CatalogsFeedValidationWarnings) SetUTM_SOURCE_AUTO_CORRECTED(v int32)`

SetUTM_SOURCE_AUTO_CORRECTED sets UTM_SOURCE_AUTO_CORRECTED field to given value.

### HasUTM_SOURCE_AUTO_CORRECTED

`func (o *CatalogsFeedValidationWarnings) HasUTM_SOURCE_AUTO_CORRECTED() bool`

HasUTM_SOURCE_AUTO_CORRECTED returns a boolean if a field has been set.

### GetCOUNTRY_DOES_NOT_MAP_TO_CURRENCY

`func (o *CatalogsFeedValidationWarnings) GetCOUNTRY_DOES_NOT_MAP_TO_CURRENCY() int32`

GetCOUNTRY_DOES_NOT_MAP_TO_CURRENCY returns the COUNTRY_DOES_NOT_MAP_TO_CURRENCY field if non-nil, zero value otherwise.

### GetCOUNTRY_DOES_NOT_MAP_TO_CURRENCYOk

`func (o *CatalogsFeedValidationWarnings) GetCOUNTRY_DOES_NOT_MAP_TO_CURRENCYOk() (*int32, bool)`

GetCOUNTRY_DOES_NOT_MAP_TO_CURRENCYOk returns a tuple with the COUNTRY_DOES_NOT_MAP_TO_CURRENCY field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCOUNTRY_DOES_NOT_MAP_TO_CURRENCY

`func (o *CatalogsFeedValidationWarnings) SetCOUNTRY_DOES_NOT_MAP_TO_CURRENCY(v int32)`

SetCOUNTRY_DOES_NOT_MAP_TO_CURRENCY sets COUNTRY_DOES_NOT_MAP_TO_CURRENCY field to given value.

### HasCOUNTRY_DOES_NOT_MAP_TO_CURRENCY

`func (o *CatalogsFeedValidationWarnings) HasCOUNTRY_DOES_NOT_MAP_TO_CURRENCY() bool`

HasCOUNTRY_DOES_NOT_MAP_TO_CURRENCY returns a boolean if a field has been set.

### GetMIN_AD_PRICE_INVALID

`func (o *CatalogsFeedValidationWarnings) GetMIN_AD_PRICE_INVALID() int32`

GetMIN_AD_PRICE_INVALID returns the MIN_AD_PRICE_INVALID field if non-nil, zero value otherwise.

### GetMIN_AD_PRICE_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetMIN_AD_PRICE_INVALIDOk() (*int32, bool)`

GetMIN_AD_PRICE_INVALIDOk returns a tuple with the MIN_AD_PRICE_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMIN_AD_PRICE_INVALID

`func (o *CatalogsFeedValidationWarnings) SetMIN_AD_PRICE_INVALID(v int32)`

SetMIN_AD_PRICE_INVALID sets MIN_AD_PRICE_INVALID field to given value.

### HasMIN_AD_PRICE_INVALID

`func (o *CatalogsFeedValidationWarnings) HasMIN_AD_PRICE_INVALID() bool`

HasMIN_AD_PRICE_INVALID returns a boolean if a field has been set.

### GetGTIN_INVALID

`func (o *CatalogsFeedValidationWarnings) GetGTIN_INVALID() int32`

GetGTIN_INVALID returns the GTIN_INVALID field if non-nil, zero value otherwise.

### GetGTIN_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetGTIN_INVALIDOk() (*int32, bool)`

GetGTIN_INVALIDOk returns a tuple with the GTIN_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGTIN_INVALID

`func (o *CatalogsFeedValidationWarnings) SetGTIN_INVALID(v int32)`

SetGTIN_INVALID sets GTIN_INVALID field to given value.

### HasGTIN_INVALID

`func (o *CatalogsFeedValidationWarnings) HasGTIN_INVALID() bool`

HasGTIN_INVALID returns a boolean if a field has been set.

### GetINCONSISTENT_CURRENCY_VALUES

`func (o *CatalogsFeedValidationWarnings) GetINCONSISTENT_CURRENCY_VALUES() int32`

GetINCONSISTENT_CURRENCY_VALUES returns the INCONSISTENT_CURRENCY_VALUES field if non-nil, zero value otherwise.

### GetINCONSISTENT_CURRENCY_VALUESOk

`func (o *CatalogsFeedValidationWarnings) GetINCONSISTENT_CURRENCY_VALUESOk() (*int32, bool)`

GetINCONSISTENT_CURRENCY_VALUESOk returns a tuple with the INCONSISTENT_CURRENCY_VALUES field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetINCONSISTENT_CURRENCY_VALUES

`func (o *CatalogsFeedValidationWarnings) SetINCONSISTENT_CURRENCY_VALUES(v int32)`

SetINCONSISTENT_CURRENCY_VALUES sets INCONSISTENT_CURRENCY_VALUES field to given value.

### HasINCONSISTENT_CURRENCY_VALUES

`func (o *CatalogsFeedValidationWarnings) HasINCONSISTENT_CURRENCY_VALUES() bool`

HasINCONSISTENT_CURRENCY_VALUES returns a boolean if a field has been set.

### GetSALES_PRICE_TOO_LOW

`func (o *CatalogsFeedValidationWarnings) GetSALES_PRICE_TOO_LOW() int32`

GetSALES_PRICE_TOO_LOW returns the SALES_PRICE_TOO_LOW field if non-nil, zero value otherwise.

### GetSALES_PRICE_TOO_LOWOk

`func (o *CatalogsFeedValidationWarnings) GetSALES_PRICE_TOO_LOWOk() (*int32, bool)`

GetSALES_PRICE_TOO_LOWOk returns a tuple with the SALES_PRICE_TOO_LOW field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSALES_PRICE_TOO_LOW

`func (o *CatalogsFeedValidationWarnings) SetSALES_PRICE_TOO_LOW(v int32)`

SetSALES_PRICE_TOO_LOW sets SALES_PRICE_TOO_LOW field to given value.

### HasSALES_PRICE_TOO_LOW

`func (o *CatalogsFeedValidationWarnings) HasSALES_PRICE_TOO_LOW() bool`

HasSALES_PRICE_TOO_LOW returns a boolean if a field has been set.

### GetSHIPPING_WIDTH_INVALID

`func (o *CatalogsFeedValidationWarnings) GetSHIPPING_WIDTH_INVALID() int32`

GetSHIPPING_WIDTH_INVALID returns the SHIPPING_WIDTH_INVALID field if non-nil, zero value otherwise.

### GetSHIPPING_WIDTH_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetSHIPPING_WIDTH_INVALIDOk() (*int32, bool)`

GetSHIPPING_WIDTH_INVALIDOk returns a tuple with the SHIPPING_WIDTH_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSHIPPING_WIDTH_INVALID

`func (o *CatalogsFeedValidationWarnings) SetSHIPPING_WIDTH_INVALID(v int32)`

SetSHIPPING_WIDTH_INVALID sets SHIPPING_WIDTH_INVALID field to given value.

### HasSHIPPING_WIDTH_INVALID

`func (o *CatalogsFeedValidationWarnings) HasSHIPPING_WIDTH_INVALID() bool`

HasSHIPPING_WIDTH_INVALID returns a boolean if a field has been set.

### GetSHIPPING_HEIGHT_INVALID

`func (o *CatalogsFeedValidationWarnings) GetSHIPPING_HEIGHT_INVALID() int32`

GetSHIPPING_HEIGHT_INVALID returns the SHIPPING_HEIGHT_INVALID field if non-nil, zero value otherwise.

### GetSHIPPING_HEIGHT_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetSHIPPING_HEIGHT_INVALIDOk() (*int32, bool)`

GetSHIPPING_HEIGHT_INVALIDOk returns a tuple with the SHIPPING_HEIGHT_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSHIPPING_HEIGHT_INVALID

`func (o *CatalogsFeedValidationWarnings) SetSHIPPING_HEIGHT_INVALID(v int32)`

SetSHIPPING_HEIGHT_INVALID sets SHIPPING_HEIGHT_INVALID field to given value.

### HasSHIPPING_HEIGHT_INVALID

`func (o *CatalogsFeedValidationWarnings) HasSHIPPING_HEIGHT_INVALID() bool`

HasSHIPPING_HEIGHT_INVALID returns a boolean if a field has been set.

### GetSALES_PRICE_TOO_HIGH

`func (o *CatalogsFeedValidationWarnings) GetSALES_PRICE_TOO_HIGH() int32`

GetSALES_PRICE_TOO_HIGH returns the SALES_PRICE_TOO_HIGH field if non-nil, zero value otherwise.

### GetSALES_PRICE_TOO_HIGHOk

`func (o *CatalogsFeedValidationWarnings) GetSALES_PRICE_TOO_HIGHOk() (*int32, bool)`

GetSALES_PRICE_TOO_HIGHOk returns a tuple with the SALES_PRICE_TOO_HIGH field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSALES_PRICE_TOO_HIGH

`func (o *CatalogsFeedValidationWarnings) SetSALES_PRICE_TOO_HIGH(v int32)`

SetSALES_PRICE_TOO_HIGH sets SALES_PRICE_TOO_HIGH field to given value.

### HasSALES_PRICE_TOO_HIGH

`func (o *CatalogsFeedValidationWarnings) HasSALES_PRICE_TOO_HIGH() bool`

HasSALES_PRICE_TOO_HIGH returns a boolean if a field has been set.

### GetMPN_INVALID

`func (o *CatalogsFeedValidationWarnings) GetMPN_INVALID() int32`

GetMPN_INVALID returns the MPN_INVALID field if non-nil, zero value otherwise.

### GetMPN_INVALIDOk

`func (o *CatalogsFeedValidationWarnings) GetMPN_INVALIDOk() (*int32, bool)`

GetMPN_INVALIDOk returns a tuple with the MPN_INVALID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMPN_INVALID

`func (o *CatalogsFeedValidationWarnings) SetMPN_INVALID(v int32)`

SetMPN_INVALID sets MPN_INVALID field to given value.

### HasMPN_INVALID

`func (o *CatalogsFeedValidationWarnings) HasMPN_INVALID() bool`

HasMPN_INVALID returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


