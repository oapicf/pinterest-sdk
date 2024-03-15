# CatalogsUpdatableHotelAttributes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **NullableString** | The hotel&#39;s name. | [optional] 
**Link** | Pointer to **NullableString** | Link to the product page | [optional] 
**Description** | Pointer to **NullableString** | Brief description of the hotel. | [optional] 
**Brand** | Pointer to **NullableString** | The brand to which this hotel belongs to. | [optional] 
**Latitude** | Pointer to **float32** | Latitude of the hotel. | [optional] 
**Longitude** | Pointer to **NullableFloat32** | Longitude of the hotel. | [optional] 
**Neighborhood** | Pointer to **[]string** | A list of neighborhoods where the hotel is located | [optional] 
**Address** | Pointer to [**CatalogsHotelAddress**](CatalogsHotelAddress.md) |  | [optional] 
**CustomLabel0** | Pointer to **NullableString** | Custom grouping of hotels | [optional] 
**CustomLabel1** | Pointer to **NullableString** | Custom grouping of hotels | [optional] 
**CustomLabel2** | Pointer to **NullableString** | Custom grouping of hotels | [optional] 
**CustomLabel3** | Pointer to **NullableString** | Custom grouping of hotels | [optional] 
**CustomLabel4** | Pointer to **NullableString** | Custom grouping of hotels | [optional] 
**Category** | Pointer to **NullableString** | The type of property. The category can be any type of internal description desired. | [optional] 
**BasePrice** | Pointer to **NullableString** | Base price of the hotel room per night followed by the ISO currency code | [optional] 
**SalePrice** | Pointer to **NullableString** | Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. | [optional] 
**GuestRatings** | Pointer to [**CatalogsHotelGuestRatings**](CatalogsHotelGuestRatings.md) |  | [optional] 

## Methods

### NewCatalogsUpdatableHotelAttributes

`func NewCatalogsUpdatableHotelAttributes() *CatalogsUpdatableHotelAttributes`

NewCatalogsUpdatableHotelAttributes instantiates a new CatalogsUpdatableHotelAttributes object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsUpdatableHotelAttributesWithDefaults

`func NewCatalogsUpdatableHotelAttributesWithDefaults() *CatalogsUpdatableHotelAttributes`

NewCatalogsUpdatableHotelAttributesWithDefaults instantiates a new CatalogsUpdatableHotelAttributes object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *CatalogsUpdatableHotelAttributes) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsUpdatableHotelAttributes) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsUpdatableHotelAttributes) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CatalogsUpdatableHotelAttributes) HasName() bool`

HasName returns a boolean if a field has been set.

### SetNameNil

`func (o *CatalogsUpdatableHotelAttributes) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *CatalogsUpdatableHotelAttributes) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetLink

`func (o *CatalogsUpdatableHotelAttributes) GetLink() string`

GetLink returns the Link field if non-nil, zero value otherwise.

### GetLinkOk

`func (o *CatalogsUpdatableHotelAttributes) GetLinkOk() (*string, bool)`

GetLinkOk returns a tuple with the Link field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLink

`func (o *CatalogsUpdatableHotelAttributes) SetLink(v string)`

SetLink sets Link field to given value.

### HasLink

`func (o *CatalogsUpdatableHotelAttributes) HasLink() bool`

HasLink returns a boolean if a field has been set.

### SetLinkNil

`func (o *CatalogsUpdatableHotelAttributes) SetLinkNil(b bool)`

 SetLinkNil sets the value for Link to be an explicit nil

### UnsetLink
`func (o *CatalogsUpdatableHotelAttributes) UnsetLink()`

UnsetLink ensures that no value is present for Link, not even an explicit nil
### GetDescription

`func (o *CatalogsUpdatableHotelAttributes) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CatalogsUpdatableHotelAttributes) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CatalogsUpdatableHotelAttributes) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CatalogsUpdatableHotelAttributes) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *CatalogsUpdatableHotelAttributes) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *CatalogsUpdatableHotelAttributes) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetBrand

`func (o *CatalogsUpdatableHotelAttributes) GetBrand() string`

GetBrand returns the Brand field if non-nil, zero value otherwise.

### GetBrandOk

`func (o *CatalogsUpdatableHotelAttributes) GetBrandOk() (*string, bool)`

GetBrandOk returns a tuple with the Brand field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBrand

`func (o *CatalogsUpdatableHotelAttributes) SetBrand(v string)`

SetBrand sets Brand field to given value.

### HasBrand

`func (o *CatalogsUpdatableHotelAttributes) HasBrand() bool`

HasBrand returns a boolean if a field has been set.

### SetBrandNil

`func (o *CatalogsUpdatableHotelAttributes) SetBrandNil(b bool)`

 SetBrandNil sets the value for Brand to be an explicit nil

### UnsetBrand
`func (o *CatalogsUpdatableHotelAttributes) UnsetBrand()`

UnsetBrand ensures that no value is present for Brand, not even an explicit nil
### GetLatitude

`func (o *CatalogsUpdatableHotelAttributes) GetLatitude() float32`

GetLatitude returns the Latitude field if non-nil, zero value otherwise.

### GetLatitudeOk

`func (o *CatalogsUpdatableHotelAttributes) GetLatitudeOk() (*float32, bool)`

GetLatitudeOk returns a tuple with the Latitude field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatitude

`func (o *CatalogsUpdatableHotelAttributes) SetLatitude(v float32)`

SetLatitude sets Latitude field to given value.

### HasLatitude

`func (o *CatalogsUpdatableHotelAttributes) HasLatitude() bool`

HasLatitude returns a boolean if a field has been set.

### GetLongitude

`func (o *CatalogsUpdatableHotelAttributes) GetLongitude() float32`

GetLongitude returns the Longitude field if non-nil, zero value otherwise.

### GetLongitudeOk

`func (o *CatalogsUpdatableHotelAttributes) GetLongitudeOk() (*float32, bool)`

GetLongitudeOk returns a tuple with the Longitude field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLongitude

`func (o *CatalogsUpdatableHotelAttributes) SetLongitude(v float32)`

SetLongitude sets Longitude field to given value.

### HasLongitude

`func (o *CatalogsUpdatableHotelAttributes) HasLongitude() bool`

HasLongitude returns a boolean if a field has been set.

### SetLongitudeNil

`func (o *CatalogsUpdatableHotelAttributes) SetLongitudeNil(b bool)`

 SetLongitudeNil sets the value for Longitude to be an explicit nil

### UnsetLongitude
`func (o *CatalogsUpdatableHotelAttributes) UnsetLongitude()`

UnsetLongitude ensures that no value is present for Longitude, not even an explicit nil
### GetNeighborhood

`func (o *CatalogsUpdatableHotelAttributes) GetNeighborhood() []string`

GetNeighborhood returns the Neighborhood field if non-nil, zero value otherwise.

### GetNeighborhoodOk

`func (o *CatalogsUpdatableHotelAttributes) GetNeighborhoodOk() (*[]string, bool)`

GetNeighborhoodOk returns a tuple with the Neighborhood field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNeighborhood

`func (o *CatalogsUpdatableHotelAttributes) SetNeighborhood(v []string)`

SetNeighborhood sets Neighborhood field to given value.

### HasNeighborhood

`func (o *CatalogsUpdatableHotelAttributes) HasNeighborhood() bool`

HasNeighborhood returns a boolean if a field has been set.

### SetNeighborhoodNil

`func (o *CatalogsUpdatableHotelAttributes) SetNeighborhoodNil(b bool)`

 SetNeighborhoodNil sets the value for Neighborhood to be an explicit nil

### UnsetNeighborhood
`func (o *CatalogsUpdatableHotelAttributes) UnsetNeighborhood()`

UnsetNeighborhood ensures that no value is present for Neighborhood, not even an explicit nil
### GetAddress

`func (o *CatalogsUpdatableHotelAttributes) GetAddress() CatalogsHotelAddress`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *CatalogsUpdatableHotelAttributes) GetAddressOk() (*CatalogsHotelAddress, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *CatalogsUpdatableHotelAttributes) SetAddress(v CatalogsHotelAddress)`

SetAddress sets Address field to given value.

### HasAddress

`func (o *CatalogsUpdatableHotelAttributes) HasAddress() bool`

HasAddress returns a boolean if a field has been set.

### GetCustomLabel0

`func (o *CatalogsUpdatableHotelAttributes) GetCustomLabel0() string`

GetCustomLabel0 returns the CustomLabel0 field if non-nil, zero value otherwise.

### GetCustomLabel0Ok

`func (o *CatalogsUpdatableHotelAttributes) GetCustomLabel0Ok() (*string, bool)`

GetCustomLabel0Ok returns a tuple with the CustomLabel0 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel0

`func (o *CatalogsUpdatableHotelAttributes) SetCustomLabel0(v string)`

SetCustomLabel0 sets CustomLabel0 field to given value.

### HasCustomLabel0

`func (o *CatalogsUpdatableHotelAttributes) HasCustomLabel0() bool`

HasCustomLabel0 returns a boolean if a field has been set.

### SetCustomLabel0Nil

`func (o *CatalogsUpdatableHotelAttributes) SetCustomLabel0Nil(b bool)`

 SetCustomLabel0Nil sets the value for CustomLabel0 to be an explicit nil

### UnsetCustomLabel0
`func (o *CatalogsUpdatableHotelAttributes) UnsetCustomLabel0()`

UnsetCustomLabel0 ensures that no value is present for CustomLabel0, not even an explicit nil
### GetCustomLabel1

`func (o *CatalogsUpdatableHotelAttributes) GetCustomLabel1() string`

GetCustomLabel1 returns the CustomLabel1 field if non-nil, zero value otherwise.

### GetCustomLabel1Ok

`func (o *CatalogsUpdatableHotelAttributes) GetCustomLabel1Ok() (*string, bool)`

GetCustomLabel1Ok returns a tuple with the CustomLabel1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel1

`func (o *CatalogsUpdatableHotelAttributes) SetCustomLabel1(v string)`

SetCustomLabel1 sets CustomLabel1 field to given value.

### HasCustomLabel1

`func (o *CatalogsUpdatableHotelAttributes) HasCustomLabel1() bool`

HasCustomLabel1 returns a boolean if a field has been set.

### SetCustomLabel1Nil

`func (o *CatalogsUpdatableHotelAttributes) SetCustomLabel1Nil(b bool)`

 SetCustomLabel1Nil sets the value for CustomLabel1 to be an explicit nil

### UnsetCustomLabel1
`func (o *CatalogsUpdatableHotelAttributes) UnsetCustomLabel1()`

UnsetCustomLabel1 ensures that no value is present for CustomLabel1, not even an explicit nil
### GetCustomLabel2

`func (o *CatalogsUpdatableHotelAttributes) GetCustomLabel2() string`

GetCustomLabel2 returns the CustomLabel2 field if non-nil, zero value otherwise.

### GetCustomLabel2Ok

`func (o *CatalogsUpdatableHotelAttributes) GetCustomLabel2Ok() (*string, bool)`

GetCustomLabel2Ok returns a tuple with the CustomLabel2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel2

`func (o *CatalogsUpdatableHotelAttributes) SetCustomLabel2(v string)`

SetCustomLabel2 sets CustomLabel2 field to given value.

### HasCustomLabel2

`func (o *CatalogsUpdatableHotelAttributes) HasCustomLabel2() bool`

HasCustomLabel2 returns a boolean if a field has been set.

### SetCustomLabel2Nil

`func (o *CatalogsUpdatableHotelAttributes) SetCustomLabel2Nil(b bool)`

 SetCustomLabel2Nil sets the value for CustomLabel2 to be an explicit nil

### UnsetCustomLabel2
`func (o *CatalogsUpdatableHotelAttributes) UnsetCustomLabel2()`

UnsetCustomLabel2 ensures that no value is present for CustomLabel2, not even an explicit nil
### GetCustomLabel3

`func (o *CatalogsUpdatableHotelAttributes) GetCustomLabel3() string`

GetCustomLabel3 returns the CustomLabel3 field if non-nil, zero value otherwise.

### GetCustomLabel3Ok

`func (o *CatalogsUpdatableHotelAttributes) GetCustomLabel3Ok() (*string, bool)`

GetCustomLabel3Ok returns a tuple with the CustomLabel3 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel3

`func (o *CatalogsUpdatableHotelAttributes) SetCustomLabel3(v string)`

SetCustomLabel3 sets CustomLabel3 field to given value.

### HasCustomLabel3

`func (o *CatalogsUpdatableHotelAttributes) HasCustomLabel3() bool`

HasCustomLabel3 returns a boolean if a field has been set.

### SetCustomLabel3Nil

`func (o *CatalogsUpdatableHotelAttributes) SetCustomLabel3Nil(b bool)`

 SetCustomLabel3Nil sets the value for CustomLabel3 to be an explicit nil

### UnsetCustomLabel3
`func (o *CatalogsUpdatableHotelAttributes) UnsetCustomLabel3()`

UnsetCustomLabel3 ensures that no value is present for CustomLabel3, not even an explicit nil
### GetCustomLabel4

`func (o *CatalogsUpdatableHotelAttributes) GetCustomLabel4() string`

GetCustomLabel4 returns the CustomLabel4 field if non-nil, zero value otherwise.

### GetCustomLabel4Ok

`func (o *CatalogsUpdatableHotelAttributes) GetCustomLabel4Ok() (*string, bool)`

GetCustomLabel4Ok returns a tuple with the CustomLabel4 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel4

`func (o *CatalogsUpdatableHotelAttributes) SetCustomLabel4(v string)`

SetCustomLabel4 sets CustomLabel4 field to given value.

### HasCustomLabel4

`func (o *CatalogsUpdatableHotelAttributes) HasCustomLabel4() bool`

HasCustomLabel4 returns a boolean if a field has been set.

### SetCustomLabel4Nil

`func (o *CatalogsUpdatableHotelAttributes) SetCustomLabel4Nil(b bool)`

 SetCustomLabel4Nil sets the value for CustomLabel4 to be an explicit nil

### UnsetCustomLabel4
`func (o *CatalogsUpdatableHotelAttributes) UnsetCustomLabel4()`

UnsetCustomLabel4 ensures that no value is present for CustomLabel4, not even an explicit nil
### GetCategory

`func (o *CatalogsUpdatableHotelAttributes) GetCategory() string`

GetCategory returns the Category field if non-nil, zero value otherwise.

### GetCategoryOk

`func (o *CatalogsUpdatableHotelAttributes) GetCategoryOk() (*string, bool)`

GetCategoryOk returns a tuple with the Category field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategory

`func (o *CatalogsUpdatableHotelAttributes) SetCategory(v string)`

SetCategory sets Category field to given value.

### HasCategory

`func (o *CatalogsUpdatableHotelAttributes) HasCategory() bool`

HasCategory returns a boolean if a field has been set.

### SetCategoryNil

`func (o *CatalogsUpdatableHotelAttributes) SetCategoryNil(b bool)`

 SetCategoryNil sets the value for Category to be an explicit nil

### UnsetCategory
`func (o *CatalogsUpdatableHotelAttributes) UnsetCategory()`

UnsetCategory ensures that no value is present for Category, not even an explicit nil
### GetBasePrice

`func (o *CatalogsUpdatableHotelAttributes) GetBasePrice() string`

GetBasePrice returns the BasePrice field if non-nil, zero value otherwise.

### GetBasePriceOk

`func (o *CatalogsUpdatableHotelAttributes) GetBasePriceOk() (*string, bool)`

GetBasePriceOk returns a tuple with the BasePrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBasePrice

`func (o *CatalogsUpdatableHotelAttributes) SetBasePrice(v string)`

SetBasePrice sets BasePrice field to given value.

### HasBasePrice

`func (o *CatalogsUpdatableHotelAttributes) HasBasePrice() bool`

HasBasePrice returns a boolean if a field has been set.

### SetBasePriceNil

`func (o *CatalogsUpdatableHotelAttributes) SetBasePriceNil(b bool)`

 SetBasePriceNil sets the value for BasePrice to be an explicit nil

### UnsetBasePrice
`func (o *CatalogsUpdatableHotelAttributes) UnsetBasePrice()`

UnsetBasePrice ensures that no value is present for BasePrice, not even an explicit nil
### GetSalePrice

`func (o *CatalogsUpdatableHotelAttributes) GetSalePrice() string`

GetSalePrice returns the SalePrice field if non-nil, zero value otherwise.

### GetSalePriceOk

`func (o *CatalogsUpdatableHotelAttributes) GetSalePriceOk() (*string, bool)`

GetSalePriceOk returns a tuple with the SalePrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSalePrice

`func (o *CatalogsUpdatableHotelAttributes) SetSalePrice(v string)`

SetSalePrice sets SalePrice field to given value.

### HasSalePrice

`func (o *CatalogsUpdatableHotelAttributes) HasSalePrice() bool`

HasSalePrice returns a boolean if a field has been set.

### SetSalePriceNil

`func (o *CatalogsUpdatableHotelAttributes) SetSalePriceNil(b bool)`

 SetSalePriceNil sets the value for SalePrice to be an explicit nil

### UnsetSalePrice
`func (o *CatalogsUpdatableHotelAttributes) UnsetSalePrice()`

UnsetSalePrice ensures that no value is present for SalePrice, not even an explicit nil
### GetGuestRatings

`func (o *CatalogsUpdatableHotelAttributes) GetGuestRatings() CatalogsHotelGuestRatings`

GetGuestRatings returns the GuestRatings field if non-nil, zero value otherwise.

### GetGuestRatingsOk

`func (o *CatalogsUpdatableHotelAttributes) GetGuestRatingsOk() (*CatalogsHotelGuestRatings, bool)`

GetGuestRatingsOk returns a tuple with the GuestRatings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuestRatings

`func (o *CatalogsUpdatableHotelAttributes) SetGuestRatings(v CatalogsHotelGuestRatings)`

SetGuestRatings sets GuestRatings field to given value.

### HasGuestRatings

`func (o *CatalogsUpdatableHotelAttributes) HasGuestRatings() bool`

HasGuestRatings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


