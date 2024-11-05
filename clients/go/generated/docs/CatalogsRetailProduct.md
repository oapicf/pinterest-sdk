# CatalogsRetailProduct

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** |  | 
**Metadata** | [**CatalogsRetailProductMetadata**](CatalogsRetailProductMetadata.md) |  | 
**Pin** | [**NullablePin**](Pin.md) |  | 

## Methods

### NewCatalogsRetailProduct

`func NewCatalogsRetailProduct(catalogType string, metadata CatalogsRetailProductMetadata, pin NullablePin, ) *CatalogsRetailProduct`

NewCatalogsRetailProduct instantiates a new CatalogsRetailProduct object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsRetailProductWithDefaults

`func NewCatalogsRetailProductWithDefaults() *CatalogsRetailProduct`

NewCatalogsRetailProductWithDefaults instantiates a new CatalogsRetailProduct object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogType

`func (o *CatalogsRetailProduct) GetCatalogType() string`

GetCatalogType returns the CatalogType field if non-nil, zero value otherwise.

### GetCatalogTypeOk

`func (o *CatalogsRetailProduct) GetCatalogTypeOk() (*string, bool)`

GetCatalogTypeOk returns a tuple with the CatalogType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogType

`func (o *CatalogsRetailProduct) SetCatalogType(v string)`

SetCatalogType sets CatalogType field to given value.


### GetMetadata

`func (o *CatalogsRetailProduct) GetMetadata() CatalogsRetailProductMetadata`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *CatalogsRetailProduct) GetMetadataOk() (*CatalogsRetailProductMetadata, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *CatalogsRetailProduct) SetMetadata(v CatalogsRetailProductMetadata)`

SetMetadata sets Metadata field to given value.


### GetPin

`func (o *CatalogsRetailProduct) GetPin() Pin`

GetPin returns the Pin field if non-nil, zero value otherwise.

### GetPinOk

`func (o *CatalogsRetailProduct) GetPinOk() (*Pin, bool)`

GetPinOk returns a tuple with the Pin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPin

`func (o *CatalogsRetailProduct) SetPin(v Pin)`

SetPin sets Pin field to given value.


### SetPinNil

`func (o *CatalogsRetailProduct) SetPinNil(b bool)`

 SetPinNil sets the value for Pin to be an explicit nil

### UnsetPin
`func (o *CatalogsRetailProduct) UnsetPin()`

UnsetPin ensures that no value is present for Pin, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


