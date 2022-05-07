# CatalogsFeedValidationWarnings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TitleLengthTooLong** | Pointer to **int32** |  | [optional] 
**DescriptionLengthTooLong** | Pointer to **int32** |  | [optional] 
**GenderInvalid** | Pointer to **int32** |  | [optional] 
**AgeGroupInvalid** | Pointer to **int32** |  | [optional] 
**SizeTypeInvalid** | Pointer to **int32** |  | [optional] 
**LinkFormatWarning** | Pointer to **int32** |  | [optional] 
**DuplicateProducts** | Pointer to **int32** |  | [optional] 
**DuplicateLinks** | Pointer to **int32** |  | [optional] 
**SalesPriceInvalid** | Pointer to **int32** |  | [optional] 
**ProductCategoryDepthWarning** | Pointer to **int32** |  | [optional] 
**AdwordsSameAsLink** | Pointer to **int32** |  | [optional] 
**DuplicateHeaders** | Pointer to **int32** |  | [optional] 
**FetchSameSignature** | Pointer to **int32** |  | [optional] 
**AdwordsFormatWarning** | Pointer to **int32** |  | [optional] 
**AdditionalImageLinkWarning** | Pointer to **int32** |  | [optional] 
**ImageLinkWarning** | Pointer to **int32** |  | [optional] 
**ShippingInvalid** | Pointer to **int32** |  | [optional] 
**TaxInvalid** | Pointer to **int32** |  | [optional] 
**ShippingWeightInvalid** | Pointer to **int32** |  | [optional] 
**ExpirationDateInvalid** | Pointer to **int32** |  | [optional] 
**AvailabilityDateInvalid** | Pointer to **int32** |  | [optional] 
**SaleDateInvalid** | Pointer to **int32** |  | [optional] 
**WeightUnitInvalid** | Pointer to **int32** |  | [optional] 
**IsBundleInvalid** | Pointer to **int32** |  | [optional] 
**UpdatedTimeInvalid** | Pointer to **int32** |  | [optional] 
**CustomLabelLengthTooLong** | Pointer to **int32** |  | [optional] 
**ProductTypeLengthTooLong** | Pointer to **int32** |  | [optional] 
**TooManyAdditionalImageLinks** | Pointer to **int32** |  | [optional] 
**MultipackInvalid** | Pointer to **int32** |  | [optional] 
**IndexedProductCountLargeDelta** | Pointer to **int32** |  | [optional] 
**ItemAdditionalImageDownloadFailure** | Pointer to **int32** |  | [optional] 
**OptionalProductCategoryMissing** | Pointer to **int32** |  | [optional] 
**OptionalProductCategoryInvalid** | Pointer to **int32** |  | [optional] 
**OptionalConditionMissing** | Pointer to **int32** |  | [optional] 
**OptionalConditionInvalid** | Pointer to **int32** |  | [optional] 
**IosDeepLinkInvalid** | Pointer to **int32** |  | [optional] 
**AndroidDeepLinkInvalid** | Pointer to **int32** |  | [optional] 
**AvailabilityNormalized** | Pointer to **int32** |  | [optional] 
**ConditionNormalized** | Pointer to **int32** |  | [optional] 
**GenderNormalized** | Pointer to **int32** |  | [optional] 
**SizeTypeNormalized** | Pointer to **int32** |  | [optional] 
**AgeGroupNormalized** | Pointer to **int32** |  | [optional] 
**UtmSourceAutoCorrected** | Pointer to **int32** |  | [optional] 
**CountryDoesNotMapToCurrency** | Pointer to **int32** |  | [optional] 
**MinAdPriceInvalid** | Pointer to **int32** |  | [optional] 

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

### GetTitleLengthTooLong

`func (o *CatalogsFeedValidationWarnings) GetTitleLengthTooLong() int32`

GetTitleLengthTooLong returns the TitleLengthTooLong field if non-nil, zero value otherwise.

### GetTitleLengthTooLongOk

`func (o *CatalogsFeedValidationWarnings) GetTitleLengthTooLongOk() (*int32, bool)`

GetTitleLengthTooLongOk returns a tuple with the TitleLengthTooLong field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitleLengthTooLong

`func (o *CatalogsFeedValidationWarnings) SetTitleLengthTooLong(v int32)`

SetTitleLengthTooLong sets TitleLengthTooLong field to given value.

### HasTitleLengthTooLong

`func (o *CatalogsFeedValidationWarnings) HasTitleLengthTooLong() bool`

HasTitleLengthTooLong returns a boolean if a field has been set.

### GetDescriptionLengthTooLong

`func (o *CatalogsFeedValidationWarnings) GetDescriptionLengthTooLong() int32`

GetDescriptionLengthTooLong returns the DescriptionLengthTooLong field if non-nil, zero value otherwise.

### GetDescriptionLengthTooLongOk

`func (o *CatalogsFeedValidationWarnings) GetDescriptionLengthTooLongOk() (*int32, bool)`

GetDescriptionLengthTooLongOk returns a tuple with the DescriptionLengthTooLong field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptionLengthTooLong

`func (o *CatalogsFeedValidationWarnings) SetDescriptionLengthTooLong(v int32)`

SetDescriptionLengthTooLong sets DescriptionLengthTooLong field to given value.

### HasDescriptionLengthTooLong

`func (o *CatalogsFeedValidationWarnings) HasDescriptionLengthTooLong() bool`

HasDescriptionLengthTooLong returns a boolean if a field has been set.

### GetGenderInvalid

`func (o *CatalogsFeedValidationWarnings) GetGenderInvalid() int32`

GetGenderInvalid returns the GenderInvalid field if non-nil, zero value otherwise.

### GetGenderInvalidOk

`func (o *CatalogsFeedValidationWarnings) GetGenderInvalidOk() (*int32, bool)`

GetGenderInvalidOk returns a tuple with the GenderInvalid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGenderInvalid

`func (o *CatalogsFeedValidationWarnings) SetGenderInvalid(v int32)`

SetGenderInvalid sets GenderInvalid field to given value.

### HasGenderInvalid

`func (o *CatalogsFeedValidationWarnings) HasGenderInvalid() bool`

HasGenderInvalid returns a boolean if a field has been set.

### GetAgeGroupInvalid

`func (o *CatalogsFeedValidationWarnings) GetAgeGroupInvalid() int32`

GetAgeGroupInvalid returns the AgeGroupInvalid field if non-nil, zero value otherwise.

### GetAgeGroupInvalidOk

`func (o *CatalogsFeedValidationWarnings) GetAgeGroupInvalidOk() (*int32, bool)`

GetAgeGroupInvalidOk returns a tuple with the AgeGroupInvalid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAgeGroupInvalid

`func (o *CatalogsFeedValidationWarnings) SetAgeGroupInvalid(v int32)`

SetAgeGroupInvalid sets AgeGroupInvalid field to given value.

### HasAgeGroupInvalid

`func (o *CatalogsFeedValidationWarnings) HasAgeGroupInvalid() bool`

HasAgeGroupInvalid returns a boolean if a field has been set.

### GetSizeTypeInvalid

`func (o *CatalogsFeedValidationWarnings) GetSizeTypeInvalid() int32`

GetSizeTypeInvalid returns the SizeTypeInvalid field if non-nil, zero value otherwise.

### GetSizeTypeInvalidOk

`func (o *CatalogsFeedValidationWarnings) GetSizeTypeInvalidOk() (*int32, bool)`

GetSizeTypeInvalidOk returns a tuple with the SizeTypeInvalid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSizeTypeInvalid

`func (o *CatalogsFeedValidationWarnings) SetSizeTypeInvalid(v int32)`

SetSizeTypeInvalid sets SizeTypeInvalid field to given value.

### HasSizeTypeInvalid

`func (o *CatalogsFeedValidationWarnings) HasSizeTypeInvalid() bool`

HasSizeTypeInvalid returns a boolean if a field has been set.

### GetLinkFormatWarning

`func (o *CatalogsFeedValidationWarnings) GetLinkFormatWarning() int32`

GetLinkFormatWarning returns the LinkFormatWarning field if non-nil, zero value otherwise.

### GetLinkFormatWarningOk

`func (o *CatalogsFeedValidationWarnings) GetLinkFormatWarningOk() (*int32, bool)`

GetLinkFormatWarningOk returns a tuple with the LinkFormatWarning field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLinkFormatWarning

`func (o *CatalogsFeedValidationWarnings) SetLinkFormatWarning(v int32)`

SetLinkFormatWarning sets LinkFormatWarning field to given value.

### HasLinkFormatWarning

`func (o *CatalogsFeedValidationWarnings) HasLinkFormatWarning() bool`

HasLinkFormatWarning returns a boolean if a field has been set.

### GetDuplicateProducts

`func (o *CatalogsFeedValidationWarnings) GetDuplicateProducts() int32`

GetDuplicateProducts returns the DuplicateProducts field if non-nil, zero value otherwise.

### GetDuplicateProductsOk

`func (o *CatalogsFeedValidationWarnings) GetDuplicateProductsOk() (*int32, bool)`

GetDuplicateProductsOk returns a tuple with the DuplicateProducts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuplicateProducts

`func (o *CatalogsFeedValidationWarnings) SetDuplicateProducts(v int32)`

SetDuplicateProducts sets DuplicateProducts field to given value.

### HasDuplicateProducts

`func (o *CatalogsFeedValidationWarnings) HasDuplicateProducts() bool`

HasDuplicateProducts returns a boolean if a field has been set.

### GetDuplicateLinks

`func (o *CatalogsFeedValidationWarnings) GetDuplicateLinks() int32`

GetDuplicateLinks returns the DuplicateLinks field if non-nil, zero value otherwise.

### GetDuplicateLinksOk

`func (o *CatalogsFeedValidationWarnings) GetDuplicateLinksOk() (*int32, bool)`

GetDuplicateLinksOk returns a tuple with the DuplicateLinks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuplicateLinks

`func (o *CatalogsFeedValidationWarnings) SetDuplicateLinks(v int32)`

SetDuplicateLinks sets DuplicateLinks field to given value.

### HasDuplicateLinks

`func (o *CatalogsFeedValidationWarnings) HasDuplicateLinks() bool`

HasDuplicateLinks returns a boolean if a field has been set.

### GetSalesPriceInvalid

`func (o *CatalogsFeedValidationWarnings) GetSalesPriceInvalid() int32`

GetSalesPriceInvalid returns the SalesPriceInvalid field if non-nil, zero value otherwise.

### GetSalesPriceInvalidOk

`func (o *CatalogsFeedValidationWarnings) GetSalesPriceInvalidOk() (*int32, bool)`

GetSalesPriceInvalidOk returns a tuple with the SalesPriceInvalid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSalesPriceInvalid

`func (o *CatalogsFeedValidationWarnings) SetSalesPriceInvalid(v int32)`

SetSalesPriceInvalid sets SalesPriceInvalid field to given value.

### HasSalesPriceInvalid

`func (o *CatalogsFeedValidationWarnings) HasSalesPriceInvalid() bool`

HasSalesPriceInvalid returns a boolean if a field has been set.

### GetProductCategoryDepthWarning

`func (o *CatalogsFeedValidationWarnings) GetProductCategoryDepthWarning() int32`

GetProductCategoryDepthWarning returns the ProductCategoryDepthWarning field if non-nil, zero value otherwise.

### GetProductCategoryDepthWarningOk

`func (o *CatalogsFeedValidationWarnings) GetProductCategoryDepthWarningOk() (*int32, bool)`

GetProductCategoryDepthWarningOk returns a tuple with the ProductCategoryDepthWarning field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductCategoryDepthWarning

`func (o *CatalogsFeedValidationWarnings) SetProductCategoryDepthWarning(v int32)`

SetProductCategoryDepthWarning sets ProductCategoryDepthWarning field to given value.

### HasProductCategoryDepthWarning

`func (o *CatalogsFeedValidationWarnings) HasProductCategoryDepthWarning() bool`

HasProductCategoryDepthWarning returns a boolean if a field has been set.

### GetAdwordsSameAsLink

`func (o *CatalogsFeedValidationWarnings) GetAdwordsSameAsLink() int32`

GetAdwordsSameAsLink returns the AdwordsSameAsLink field if non-nil, zero value otherwise.

### GetAdwordsSameAsLinkOk

`func (o *CatalogsFeedValidationWarnings) GetAdwordsSameAsLinkOk() (*int32, bool)`

GetAdwordsSameAsLinkOk returns a tuple with the AdwordsSameAsLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdwordsSameAsLink

`func (o *CatalogsFeedValidationWarnings) SetAdwordsSameAsLink(v int32)`

SetAdwordsSameAsLink sets AdwordsSameAsLink field to given value.

### HasAdwordsSameAsLink

`func (o *CatalogsFeedValidationWarnings) HasAdwordsSameAsLink() bool`

HasAdwordsSameAsLink returns a boolean if a field has been set.

### GetDuplicateHeaders

`func (o *CatalogsFeedValidationWarnings) GetDuplicateHeaders() int32`

GetDuplicateHeaders returns the DuplicateHeaders field if non-nil, zero value otherwise.

### GetDuplicateHeadersOk

`func (o *CatalogsFeedValidationWarnings) GetDuplicateHeadersOk() (*int32, bool)`

GetDuplicateHeadersOk returns a tuple with the DuplicateHeaders field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuplicateHeaders

`func (o *CatalogsFeedValidationWarnings) SetDuplicateHeaders(v int32)`

SetDuplicateHeaders sets DuplicateHeaders field to given value.

### HasDuplicateHeaders

`func (o *CatalogsFeedValidationWarnings) HasDuplicateHeaders() bool`

HasDuplicateHeaders returns a boolean if a field has been set.

### GetFetchSameSignature

`func (o *CatalogsFeedValidationWarnings) GetFetchSameSignature() int32`

GetFetchSameSignature returns the FetchSameSignature field if non-nil, zero value otherwise.

### GetFetchSameSignatureOk

`func (o *CatalogsFeedValidationWarnings) GetFetchSameSignatureOk() (*int32, bool)`

GetFetchSameSignatureOk returns a tuple with the FetchSameSignature field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFetchSameSignature

`func (o *CatalogsFeedValidationWarnings) SetFetchSameSignature(v int32)`

SetFetchSameSignature sets FetchSameSignature field to given value.

### HasFetchSameSignature

`func (o *CatalogsFeedValidationWarnings) HasFetchSameSignature() bool`

HasFetchSameSignature returns a boolean if a field has been set.

### GetAdwordsFormatWarning

`func (o *CatalogsFeedValidationWarnings) GetAdwordsFormatWarning() int32`

GetAdwordsFormatWarning returns the AdwordsFormatWarning field if non-nil, zero value otherwise.

### GetAdwordsFormatWarningOk

`func (o *CatalogsFeedValidationWarnings) GetAdwordsFormatWarningOk() (*int32, bool)`

GetAdwordsFormatWarningOk returns a tuple with the AdwordsFormatWarning field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdwordsFormatWarning

`func (o *CatalogsFeedValidationWarnings) SetAdwordsFormatWarning(v int32)`

SetAdwordsFormatWarning sets AdwordsFormatWarning field to given value.

### HasAdwordsFormatWarning

`func (o *CatalogsFeedValidationWarnings) HasAdwordsFormatWarning() bool`

HasAdwordsFormatWarning returns a boolean if a field has been set.

### GetAdditionalImageLinkWarning

`func (o *CatalogsFeedValidationWarnings) GetAdditionalImageLinkWarning() int32`

GetAdditionalImageLinkWarning returns the AdditionalImageLinkWarning field if non-nil, zero value otherwise.

### GetAdditionalImageLinkWarningOk

`func (o *CatalogsFeedValidationWarnings) GetAdditionalImageLinkWarningOk() (*int32, bool)`

GetAdditionalImageLinkWarningOk returns a tuple with the AdditionalImageLinkWarning field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdditionalImageLinkWarning

`func (o *CatalogsFeedValidationWarnings) SetAdditionalImageLinkWarning(v int32)`

SetAdditionalImageLinkWarning sets AdditionalImageLinkWarning field to given value.

### HasAdditionalImageLinkWarning

`func (o *CatalogsFeedValidationWarnings) HasAdditionalImageLinkWarning() bool`

HasAdditionalImageLinkWarning returns a boolean if a field has been set.

### GetImageLinkWarning

`func (o *CatalogsFeedValidationWarnings) GetImageLinkWarning() int32`

GetImageLinkWarning returns the ImageLinkWarning field if non-nil, zero value otherwise.

### GetImageLinkWarningOk

`func (o *CatalogsFeedValidationWarnings) GetImageLinkWarningOk() (*int32, bool)`

GetImageLinkWarningOk returns a tuple with the ImageLinkWarning field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageLinkWarning

`func (o *CatalogsFeedValidationWarnings) SetImageLinkWarning(v int32)`

SetImageLinkWarning sets ImageLinkWarning field to given value.

### HasImageLinkWarning

`func (o *CatalogsFeedValidationWarnings) HasImageLinkWarning() bool`

HasImageLinkWarning returns a boolean if a field has been set.

### GetShippingInvalid

`func (o *CatalogsFeedValidationWarnings) GetShippingInvalid() int32`

GetShippingInvalid returns the ShippingInvalid field if non-nil, zero value otherwise.

### GetShippingInvalidOk

`func (o *CatalogsFeedValidationWarnings) GetShippingInvalidOk() (*int32, bool)`

GetShippingInvalidOk returns a tuple with the ShippingInvalid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShippingInvalid

`func (o *CatalogsFeedValidationWarnings) SetShippingInvalid(v int32)`

SetShippingInvalid sets ShippingInvalid field to given value.

### HasShippingInvalid

`func (o *CatalogsFeedValidationWarnings) HasShippingInvalid() bool`

HasShippingInvalid returns a boolean if a field has been set.

### GetTaxInvalid

`func (o *CatalogsFeedValidationWarnings) GetTaxInvalid() int32`

GetTaxInvalid returns the TaxInvalid field if non-nil, zero value otherwise.

### GetTaxInvalidOk

`func (o *CatalogsFeedValidationWarnings) GetTaxInvalidOk() (*int32, bool)`

GetTaxInvalidOk returns a tuple with the TaxInvalid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTaxInvalid

`func (o *CatalogsFeedValidationWarnings) SetTaxInvalid(v int32)`

SetTaxInvalid sets TaxInvalid field to given value.

### HasTaxInvalid

`func (o *CatalogsFeedValidationWarnings) HasTaxInvalid() bool`

HasTaxInvalid returns a boolean if a field has been set.

### GetShippingWeightInvalid

`func (o *CatalogsFeedValidationWarnings) GetShippingWeightInvalid() int32`

GetShippingWeightInvalid returns the ShippingWeightInvalid field if non-nil, zero value otherwise.

### GetShippingWeightInvalidOk

`func (o *CatalogsFeedValidationWarnings) GetShippingWeightInvalidOk() (*int32, bool)`

GetShippingWeightInvalidOk returns a tuple with the ShippingWeightInvalid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShippingWeightInvalid

`func (o *CatalogsFeedValidationWarnings) SetShippingWeightInvalid(v int32)`

SetShippingWeightInvalid sets ShippingWeightInvalid field to given value.

### HasShippingWeightInvalid

`func (o *CatalogsFeedValidationWarnings) HasShippingWeightInvalid() bool`

HasShippingWeightInvalid returns a boolean if a field has been set.

### GetExpirationDateInvalid

`func (o *CatalogsFeedValidationWarnings) GetExpirationDateInvalid() int32`

GetExpirationDateInvalid returns the ExpirationDateInvalid field if non-nil, zero value otherwise.

### GetExpirationDateInvalidOk

`func (o *CatalogsFeedValidationWarnings) GetExpirationDateInvalidOk() (*int32, bool)`

GetExpirationDateInvalidOk returns a tuple with the ExpirationDateInvalid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpirationDateInvalid

`func (o *CatalogsFeedValidationWarnings) SetExpirationDateInvalid(v int32)`

SetExpirationDateInvalid sets ExpirationDateInvalid field to given value.

### HasExpirationDateInvalid

`func (o *CatalogsFeedValidationWarnings) HasExpirationDateInvalid() bool`

HasExpirationDateInvalid returns a boolean if a field has been set.

### GetAvailabilityDateInvalid

`func (o *CatalogsFeedValidationWarnings) GetAvailabilityDateInvalid() int32`

GetAvailabilityDateInvalid returns the AvailabilityDateInvalid field if non-nil, zero value otherwise.

### GetAvailabilityDateInvalidOk

`func (o *CatalogsFeedValidationWarnings) GetAvailabilityDateInvalidOk() (*int32, bool)`

GetAvailabilityDateInvalidOk returns a tuple with the AvailabilityDateInvalid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailabilityDateInvalid

`func (o *CatalogsFeedValidationWarnings) SetAvailabilityDateInvalid(v int32)`

SetAvailabilityDateInvalid sets AvailabilityDateInvalid field to given value.

### HasAvailabilityDateInvalid

`func (o *CatalogsFeedValidationWarnings) HasAvailabilityDateInvalid() bool`

HasAvailabilityDateInvalid returns a boolean if a field has been set.

### GetSaleDateInvalid

`func (o *CatalogsFeedValidationWarnings) GetSaleDateInvalid() int32`

GetSaleDateInvalid returns the SaleDateInvalid field if non-nil, zero value otherwise.

### GetSaleDateInvalidOk

`func (o *CatalogsFeedValidationWarnings) GetSaleDateInvalidOk() (*int32, bool)`

GetSaleDateInvalidOk returns a tuple with the SaleDateInvalid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSaleDateInvalid

`func (o *CatalogsFeedValidationWarnings) SetSaleDateInvalid(v int32)`

SetSaleDateInvalid sets SaleDateInvalid field to given value.

### HasSaleDateInvalid

`func (o *CatalogsFeedValidationWarnings) HasSaleDateInvalid() bool`

HasSaleDateInvalid returns a boolean if a field has been set.

### GetWeightUnitInvalid

`func (o *CatalogsFeedValidationWarnings) GetWeightUnitInvalid() int32`

GetWeightUnitInvalid returns the WeightUnitInvalid field if non-nil, zero value otherwise.

### GetWeightUnitInvalidOk

`func (o *CatalogsFeedValidationWarnings) GetWeightUnitInvalidOk() (*int32, bool)`

GetWeightUnitInvalidOk returns a tuple with the WeightUnitInvalid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWeightUnitInvalid

`func (o *CatalogsFeedValidationWarnings) SetWeightUnitInvalid(v int32)`

SetWeightUnitInvalid sets WeightUnitInvalid field to given value.

### HasWeightUnitInvalid

`func (o *CatalogsFeedValidationWarnings) HasWeightUnitInvalid() bool`

HasWeightUnitInvalid returns a boolean if a field has been set.

### GetIsBundleInvalid

`func (o *CatalogsFeedValidationWarnings) GetIsBundleInvalid() int32`

GetIsBundleInvalid returns the IsBundleInvalid field if non-nil, zero value otherwise.

### GetIsBundleInvalidOk

`func (o *CatalogsFeedValidationWarnings) GetIsBundleInvalidOk() (*int32, bool)`

GetIsBundleInvalidOk returns a tuple with the IsBundleInvalid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsBundleInvalid

`func (o *CatalogsFeedValidationWarnings) SetIsBundleInvalid(v int32)`

SetIsBundleInvalid sets IsBundleInvalid field to given value.

### HasIsBundleInvalid

`func (o *CatalogsFeedValidationWarnings) HasIsBundleInvalid() bool`

HasIsBundleInvalid returns a boolean if a field has been set.

### GetUpdatedTimeInvalid

`func (o *CatalogsFeedValidationWarnings) GetUpdatedTimeInvalid() int32`

GetUpdatedTimeInvalid returns the UpdatedTimeInvalid field if non-nil, zero value otherwise.

### GetUpdatedTimeInvalidOk

`func (o *CatalogsFeedValidationWarnings) GetUpdatedTimeInvalidOk() (*int32, bool)`

GetUpdatedTimeInvalidOk returns a tuple with the UpdatedTimeInvalid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTimeInvalid

`func (o *CatalogsFeedValidationWarnings) SetUpdatedTimeInvalid(v int32)`

SetUpdatedTimeInvalid sets UpdatedTimeInvalid field to given value.

### HasUpdatedTimeInvalid

`func (o *CatalogsFeedValidationWarnings) HasUpdatedTimeInvalid() bool`

HasUpdatedTimeInvalid returns a boolean if a field has been set.

### GetCustomLabelLengthTooLong

`func (o *CatalogsFeedValidationWarnings) GetCustomLabelLengthTooLong() int32`

GetCustomLabelLengthTooLong returns the CustomLabelLengthTooLong field if non-nil, zero value otherwise.

### GetCustomLabelLengthTooLongOk

`func (o *CatalogsFeedValidationWarnings) GetCustomLabelLengthTooLongOk() (*int32, bool)`

GetCustomLabelLengthTooLongOk returns a tuple with the CustomLabelLengthTooLong field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabelLengthTooLong

`func (o *CatalogsFeedValidationWarnings) SetCustomLabelLengthTooLong(v int32)`

SetCustomLabelLengthTooLong sets CustomLabelLengthTooLong field to given value.

### HasCustomLabelLengthTooLong

`func (o *CatalogsFeedValidationWarnings) HasCustomLabelLengthTooLong() bool`

HasCustomLabelLengthTooLong returns a boolean if a field has been set.

### GetProductTypeLengthTooLong

`func (o *CatalogsFeedValidationWarnings) GetProductTypeLengthTooLong() int32`

GetProductTypeLengthTooLong returns the ProductTypeLengthTooLong field if non-nil, zero value otherwise.

### GetProductTypeLengthTooLongOk

`func (o *CatalogsFeedValidationWarnings) GetProductTypeLengthTooLongOk() (*int32, bool)`

GetProductTypeLengthTooLongOk returns a tuple with the ProductTypeLengthTooLong field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductTypeLengthTooLong

`func (o *CatalogsFeedValidationWarnings) SetProductTypeLengthTooLong(v int32)`

SetProductTypeLengthTooLong sets ProductTypeLengthTooLong field to given value.

### HasProductTypeLengthTooLong

`func (o *CatalogsFeedValidationWarnings) HasProductTypeLengthTooLong() bool`

HasProductTypeLengthTooLong returns a boolean if a field has been set.

### GetTooManyAdditionalImageLinks

`func (o *CatalogsFeedValidationWarnings) GetTooManyAdditionalImageLinks() int32`

GetTooManyAdditionalImageLinks returns the TooManyAdditionalImageLinks field if non-nil, zero value otherwise.

### GetTooManyAdditionalImageLinksOk

`func (o *CatalogsFeedValidationWarnings) GetTooManyAdditionalImageLinksOk() (*int32, bool)`

GetTooManyAdditionalImageLinksOk returns a tuple with the TooManyAdditionalImageLinks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTooManyAdditionalImageLinks

`func (o *CatalogsFeedValidationWarnings) SetTooManyAdditionalImageLinks(v int32)`

SetTooManyAdditionalImageLinks sets TooManyAdditionalImageLinks field to given value.

### HasTooManyAdditionalImageLinks

`func (o *CatalogsFeedValidationWarnings) HasTooManyAdditionalImageLinks() bool`

HasTooManyAdditionalImageLinks returns a boolean if a field has been set.

### GetMultipackInvalid

`func (o *CatalogsFeedValidationWarnings) GetMultipackInvalid() int32`

GetMultipackInvalid returns the MultipackInvalid field if non-nil, zero value otherwise.

### GetMultipackInvalidOk

`func (o *CatalogsFeedValidationWarnings) GetMultipackInvalidOk() (*int32, bool)`

GetMultipackInvalidOk returns a tuple with the MultipackInvalid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMultipackInvalid

`func (o *CatalogsFeedValidationWarnings) SetMultipackInvalid(v int32)`

SetMultipackInvalid sets MultipackInvalid field to given value.

### HasMultipackInvalid

`func (o *CatalogsFeedValidationWarnings) HasMultipackInvalid() bool`

HasMultipackInvalid returns a boolean if a field has been set.

### GetIndexedProductCountLargeDelta

`func (o *CatalogsFeedValidationWarnings) GetIndexedProductCountLargeDelta() int32`

GetIndexedProductCountLargeDelta returns the IndexedProductCountLargeDelta field if non-nil, zero value otherwise.

### GetIndexedProductCountLargeDeltaOk

`func (o *CatalogsFeedValidationWarnings) GetIndexedProductCountLargeDeltaOk() (*int32, bool)`

GetIndexedProductCountLargeDeltaOk returns a tuple with the IndexedProductCountLargeDelta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndexedProductCountLargeDelta

`func (o *CatalogsFeedValidationWarnings) SetIndexedProductCountLargeDelta(v int32)`

SetIndexedProductCountLargeDelta sets IndexedProductCountLargeDelta field to given value.

### HasIndexedProductCountLargeDelta

`func (o *CatalogsFeedValidationWarnings) HasIndexedProductCountLargeDelta() bool`

HasIndexedProductCountLargeDelta returns a boolean if a field has been set.

### GetItemAdditionalImageDownloadFailure

`func (o *CatalogsFeedValidationWarnings) GetItemAdditionalImageDownloadFailure() int32`

GetItemAdditionalImageDownloadFailure returns the ItemAdditionalImageDownloadFailure field if non-nil, zero value otherwise.

### GetItemAdditionalImageDownloadFailureOk

`func (o *CatalogsFeedValidationWarnings) GetItemAdditionalImageDownloadFailureOk() (*int32, bool)`

GetItemAdditionalImageDownloadFailureOk returns a tuple with the ItemAdditionalImageDownloadFailure field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemAdditionalImageDownloadFailure

`func (o *CatalogsFeedValidationWarnings) SetItemAdditionalImageDownloadFailure(v int32)`

SetItemAdditionalImageDownloadFailure sets ItemAdditionalImageDownloadFailure field to given value.

### HasItemAdditionalImageDownloadFailure

`func (o *CatalogsFeedValidationWarnings) HasItemAdditionalImageDownloadFailure() bool`

HasItemAdditionalImageDownloadFailure returns a boolean if a field has been set.

### GetOptionalProductCategoryMissing

`func (o *CatalogsFeedValidationWarnings) GetOptionalProductCategoryMissing() int32`

GetOptionalProductCategoryMissing returns the OptionalProductCategoryMissing field if non-nil, zero value otherwise.

### GetOptionalProductCategoryMissingOk

`func (o *CatalogsFeedValidationWarnings) GetOptionalProductCategoryMissingOk() (*int32, bool)`

GetOptionalProductCategoryMissingOk returns a tuple with the OptionalProductCategoryMissing field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptionalProductCategoryMissing

`func (o *CatalogsFeedValidationWarnings) SetOptionalProductCategoryMissing(v int32)`

SetOptionalProductCategoryMissing sets OptionalProductCategoryMissing field to given value.

### HasOptionalProductCategoryMissing

`func (o *CatalogsFeedValidationWarnings) HasOptionalProductCategoryMissing() bool`

HasOptionalProductCategoryMissing returns a boolean if a field has been set.

### GetOptionalProductCategoryInvalid

`func (o *CatalogsFeedValidationWarnings) GetOptionalProductCategoryInvalid() int32`

GetOptionalProductCategoryInvalid returns the OptionalProductCategoryInvalid field if non-nil, zero value otherwise.

### GetOptionalProductCategoryInvalidOk

`func (o *CatalogsFeedValidationWarnings) GetOptionalProductCategoryInvalidOk() (*int32, bool)`

GetOptionalProductCategoryInvalidOk returns a tuple with the OptionalProductCategoryInvalid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptionalProductCategoryInvalid

`func (o *CatalogsFeedValidationWarnings) SetOptionalProductCategoryInvalid(v int32)`

SetOptionalProductCategoryInvalid sets OptionalProductCategoryInvalid field to given value.

### HasOptionalProductCategoryInvalid

`func (o *CatalogsFeedValidationWarnings) HasOptionalProductCategoryInvalid() bool`

HasOptionalProductCategoryInvalid returns a boolean if a field has been set.

### GetOptionalConditionMissing

`func (o *CatalogsFeedValidationWarnings) GetOptionalConditionMissing() int32`

GetOptionalConditionMissing returns the OptionalConditionMissing field if non-nil, zero value otherwise.

### GetOptionalConditionMissingOk

`func (o *CatalogsFeedValidationWarnings) GetOptionalConditionMissingOk() (*int32, bool)`

GetOptionalConditionMissingOk returns a tuple with the OptionalConditionMissing field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptionalConditionMissing

`func (o *CatalogsFeedValidationWarnings) SetOptionalConditionMissing(v int32)`

SetOptionalConditionMissing sets OptionalConditionMissing field to given value.

### HasOptionalConditionMissing

`func (o *CatalogsFeedValidationWarnings) HasOptionalConditionMissing() bool`

HasOptionalConditionMissing returns a boolean if a field has been set.

### GetOptionalConditionInvalid

`func (o *CatalogsFeedValidationWarnings) GetOptionalConditionInvalid() int32`

GetOptionalConditionInvalid returns the OptionalConditionInvalid field if non-nil, zero value otherwise.

### GetOptionalConditionInvalidOk

`func (o *CatalogsFeedValidationWarnings) GetOptionalConditionInvalidOk() (*int32, bool)`

GetOptionalConditionInvalidOk returns a tuple with the OptionalConditionInvalid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptionalConditionInvalid

`func (o *CatalogsFeedValidationWarnings) SetOptionalConditionInvalid(v int32)`

SetOptionalConditionInvalid sets OptionalConditionInvalid field to given value.

### HasOptionalConditionInvalid

`func (o *CatalogsFeedValidationWarnings) HasOptionalConditionInvalid() bool`

HasOptionalConditionInvalid returns a boolean if a field has been set.

### GetIosDeepLinkInvalid

`func (o *CatalogsFeedValidationWarnings) GetIosDeepLinkInvalid() int32`

GetIosDeepLinkInvalid returns the IosDeepLinkInvalid field if non-nil, zero value otherwise.

### GetIosDeepLinkInvalidOk

`func (o *CatalogsFeedValidationWarnings) GetIosDeepLinkInvalidOk() (*int32, bool)`

GetIosDeepLinkInvalidOk returns a tuple with the IosDeepLinkInvalid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIosDeepLinkInvalid

`func (o *CatalogsFeedValidationWarnings) SetIosDeepLinkInvalid(v int32)`

SetIosDeepLinkInvalid sets IosDeepLinkInvalid field to given value.

### HasIosDeepLinkInvalid

`func (o *CatalogsFeedValidationWarnings) HasIosDeepLinkInvalid() bool`

HasIosDeepLinkInvalid returns a boolean if a field has been set.

### GetAndroidDeepLinkInvalid

`func (o *CatalogsFeedValidationWarnings) GetAndroidDeepLinkInvalid() int32`

GetAndroidDeepLinkInvalid returns the AndroidDeepLinkInvalid field if non-nil, zero value otherwise.

### GetAndroidDeepLinkInvalidOk

`func (o *CatalogsFeedValidationWarnings) GetAndroidDeepLinkInvalidOk() (*int32, bool)`

GetAndroidDeepLinkInvalidOk returns a tuple with the AndroidDeepLinkInvalid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAndroidDeepLinkInvalid

`func (o *CatalogsFeedValidationWarnings) SetAndroidDeepLinkInvalid(v int32)`

SetAndroidDeepLinkInvalid sets AndroidDeepLinkInvalid field to given value.

### HasAndroidDeepLinkInvalid

`func (o *CatalogsFeedValidationWarnings) HasAndroidDeepLinkInvalid() bool`

HasAndroidDeepLinkInvalid returns a boolean if a field has been set.

### GetAvailabilityNormalized

`func (o *CatalogsFeedValidationWarnings) GetAvailabilityNormalized() int32`

GetAvailabilityNormalized returns the AvailabilityNormalized field if non-nil, zero value otherwise.

### GetAvailabilityNormalizedOk

`func (o *CatalogsFeedValidationWarnings) GetAvailabilityNormalizedOk() (*int32, bool)`

GetAvailabilityNormalizedOk returns a tuple with the AvailabilityNormalized field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailabilityNormalized

`func (o *CatalogsFeedValidationWarnings) SetAvailabilityNormalized(v int32)`

SetAvailabilityNormalized sets AvailabilityNormalized field to given value.

### HasAvailabilityNormalized

`func (o *CatalogsFeedValidationWarnings) HasAvailabilityNormalized() bool`

HasAvailabilityNormalized returns a boolean if a field has been set.

### GetConditionNormalized

`func (o *CatalogsFeedValidationWarnings) GetConditionNormalized() int32`

GetConditionNormalized returns the ConditionNormalized field if non-nil, zero value otherwise.

### GetConditionNormalizedOk

`func (o *CatalogsFeedValidationWarnings) GetConditionNormalizedOk() (*int32, bool)`

GetConditionNormalizedOk returns a tuple with the ConditionNormalized field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConditionNormalized

`func (o *CatalogsFeedValidationWarnings) SetConditionNormalized(v int32)`

SetConditionNormalized sets ConditionNormalized field to given value.

### HasConditionNormalized

`func (o *CatalogsFeedValidationWarnings) HasConditionNormalized() bool`

HasConditionNormalized returns a boolean if a field has been set.

### GetGenderNormalized

`func (o *CatalogsFeedValidationWarnings) GetGenderNormalized() int32`

GetGenderNormalized returns the GenderNormalized field if non-nil, zero value otherwise.

### GetGenderNormalizedOk

`func (o *CatalogsFeedValidationWarnings) GetGenderNormalizedOk() (*int32, bool)`

GetGenderNormalizedOk returns a tuple with the GenderNormalized field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGenderNormalized

`func (o *CatalogsFeedValidationWarnings) SetGenderNormalized(v int32)`

SetGenderNormalized sets GenderNormalized field to given value.

### HasGenderNormalized

`func (o *CatalogsFeedValidationWarnings) HasGenderNormalized() bool`

HasGenderNormalized returns a boolean if a field has been set.

### GetSizeTypeNormalized

`func (o *CatalogsFeedValidationWarnings) GetSizeTypeNormalized() int32`

GetSizeTypeNormalized returns the SizeTypeNormalized field if non-nil, zero value otherwise.

### GetSizeTypeNormalizedOk

`func (o *CatalogsFeedValidationWarnings) GetSizeTypeNormalizedOk() (*int32, bool)`

GetSizeTypeNormalizedOk returns a tuple with the SizeTypeNormalized field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSizeTypeNormalized

`func (o *CatalogsFeedValidationWarnings) SetSizeTypeNormalized(v int32)`

SetSizeTypeNormalized sets SizeTypeNormalized field to given value.

### HasSizeTypeNormalized

`func (o *CatalogsFeedValidationWarnings) HasSizeTypeNormalized() bool`

HasSizeTypeNormalized returns a boolean if a field has been set.

### GetAgeGroupNormalized

`func (o *CatalogsFeedValidationWarnings) GetAgeGroupNormalized() int32`

GetAgeGroupNormalized returns the AgeGroupNormalized field if non-nil, zero value otherwise.

### GetAgeGroupNormalizedOk

`func (o *CatalogsFeedValidationWarnings) GetAgeGroupNormalizedOk() (*int32, bool)`

GetAgeGroupNormalizedOk returns a tuple with the AgeGroupNormalized field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAgeGroupNormalized

`func (o *CatalogsFeedValidationWarnings) SetAgeGroupNormalized(v int32)`

SetAgeGroupNormalized sets AgeGroupNormalized field to given value.

### HasAgeGroupNormalized

`func (o *CatalogsFeedValidationWarnings) HasAgeGroupNormalized() bool`

HasAgeGroupNormalized returns a boolean if a field has been set.

### GetUtmSourceAutoCorrected

`func (o *CatalogsFeedValidationWarnings) GetUtmSourceAutoCorrected() int32`

GetUtmSourceAutoCorrected returns the UtmSourceAutoCorrected field if non-nil, zero value otherwise.

### GetUtmSourceAutoCorrectedOk

`func (o *CatalogsFeedValidationWarnings) GetUtmSourceAutoCorrectedOk() (*int32, bool)`

GetUtmSourceAutoCorrectedOk returns a tuple with the UtmSourceAutoCorrected field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUtmSourceAutoCorrected

`func (o *CatalogsFeedValidationWarnings) SetUtmSourceAutoCorrected(v int32)`

SetUtmSourceAutoCorrected sets UtmSourceAutoCorrected field to given value.

### HasUtmSourceAutoCorrected

`func (o *CatalogsFeedValidationWarnings) HasUtmSourceAutoCorrected() bool`

HasUtmSourceAutoCorrected returns a boolean if a field has been set.

### GetCountryDoesNotMapToCurrency

`func (o *CatalogsFeedValidationWarnings) GetCountryDoesNotMapToCurrency() int32`

GetCountryDoesNotMapToCurrency returns the CountryDoesNotMapToCurrency field if non-nil, zero value otherwise.

### GetCountryDoesNotMapToCurrencyOk

`func (o *CatalogsFeedValidationWarnings) GetCountryDoesNotMapToCurrencyOk() (*int32, bool)`

GetCountryDoesNotMapToCurrencyOk returns a tuple with the CountryDoesNotMapToCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountryDoesNotMapToCurrency

`func (o *CatalogsFeedValidationWarnings) SetCountryDoesNotMapToCurrency(v int32)`

SetCountryDoesNotMapToCurrency sets CountryDoesNotMapToCurrency field to given value.

### HasCountryDoesNotMapToCurrency

`func (o *CatalogsFeedValidationWarnings) HasCountryDoesNotMapToCurrency() bool`

HasCountryDoesNotMapToCurrency returns a boolean if a field has been set.

### GetMinAdPriceInvalid

`func (o *CatalogsFeedValidationWarnings) GetMinAdPriceInvalid() int32`

GetMinAdPriceInvalid returns the MinAdPriceInvalid field if non-nil, zero value otherwise.

### GetMinAdPriceInvalidOk

`func (o *CatalogsFeedValidationWarnings) GetMinAdPriceInvalidOk() (*int32, bool)`

GetMinAdPriceInvalidOk returns a tuple with the MinAdPriceInvalid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinAdPriceInvalid

`func (o *CatalogsFeedValidationWarnings) SetMinAdPriceInvalid(v int32)`

SetMinAdPriceInvalid sets MinAdPriceInvalid field to given value.

### HasMinAdPriceInvalid

`func (o *CatalogsFeedValidationWarnings) HasMinAdPriceInvalid() bool`

HasMinAdPriceInvalid returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


