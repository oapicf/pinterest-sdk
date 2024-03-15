# CatalogsHotelAttributes

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
**MainImage** | Pointer to [**CatalogsHotelAttributesAllOfMainImage**](CatalogsHotelAttributesAllOfMainImage.md) |  | [optional] 
**AdditionalImageLink** | Pointer to **[]string** | &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.&lt;/p&gt; | [optional] 

## Methods

### NewCatalogsHotelAttributes

`func NewCatalogsHotelAttributes() *CatalogsHotelAttributes`

NewCatalogsHotelAttributes instantiates a new CatalogsHotelAttributes object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsHotelAttributesWithDefaults

`func NewCatalogsHotelAttributesWithDefaults() *CatalogsHotelAttributes`

NewCatalogsHotelAttributesWithDefaults instantiates a new CatalogsHotelAttributes object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *CatalogsHotelAttributes) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsHotelAttributes) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsHotelAttributes) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CatalogsHotelAttributes) HasName() bool`

HasName returns a boolean if a field has been set.

### SetNameNil

`func (o *CatalogsHotelAttributes) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *CatalogsHotelAttributes) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetLink

`func (o *CatalogsHotelAttributes) GetLink() string`

GetLink returns the Link field if non-nil, zero value otherwise.

### GetLinkOk

`func (o *CatalogsHotelAttributes) GetLinkOk() (*string, bool)`

GetLinkOk returns a tuple with the Link field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLink

`func (o *CatalogsHotelAttributes) SetLink(v string)`

SetLink sets Link field to given value.

### HasLink

`func (o *CatalogsHotelAttributes) HasLink() bool`

HasLink returns a boolean if a field has been set.

### SetLinkNil

`func (o *CatalogsHotelAttributes) SetLinkNil(b bool)`

 SetLinkNil sets the value for Link to be an explicit nil

### UnsetLink
`func (o *CatalogsHotelAttributes) UnsetLink()`

UnsetLink ensures that no value is present for Link, not even an explicit nil
### GetDescription

`func (o *CatalogsHotelAttributes) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CatalogsHotelAttributes) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CatalogsHotelAttributes) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CatalogsHotelAttributes) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *CatalogsHotelAttributes) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *CatalogsHotelAttributes) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetBrand

`func (o *CatalogsHotelAttributes) GetBrand() string`

GetBrand returns the Brand field if non-nil, zero value otherwise.

### GetBrandOk

`func (o *CatalogsHotelAttributes) GetBrandOk() (*string, bool)`

GetBrandOk returns a tuple with the Brand field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBrand

`func (o *CatalogsHotelAttributes) SetBrand(v string)`

SetBrand sets Brand field to given value.

### HasBrand

`func (o *CatalogsHotelAttributes) HasBrand() bool`

HasBrand returns a boolean if a field has been set.

### SetBrandNil

`func (o *CatalogsHotelAttributes) SetBrandNil(b bool)`

 SetBrandNil sets the value for Brand to be an explicit nil

### UnsetBrand
`func (o *CatalogsHotelAttributes) UnsetBrand()`

UnsetBrand ensures that no value is present for Brand, not even an explicit nil
### GetLatitude

`func (o *CatalogsHotelAttributes) GetLatitude() float32`

GetLatitude returns the Latitude field if non-nil, zero value otherwise.

### GetLatitudeOk

`func (o *CatalogsHotelAttributes) GetLatitudeOk() (*float32, bool)`

GetLatitudeOk returns a tuple with the Latitude field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatitude

`func (o *CatalogsHotelAttributes) SetLatitude(v float32)`

SetLatitude sets Latitude field to given value.

### HasLatitude

`func (o *CatalogsHotelAttributes) HasLatitude() bool`

HasLatitude returns a boolean if a field has been set.

### GetLongitude

`func (o *CatalogsHotelAttributes) GetLongitude() float32`

GetLongitude returns the Longitude field if non-nil, zero value otherwise.

### GetLongitudeOk

`func (o *CatalogsHotelAttributes) GetLongitudeOk() (*float32, bool)`

GetLongitudeOk returns a tuple with the Longitude field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLongitude

`func (o *CatalogsHotelAttributes) SetLongitude(v float32)`

SetLongitude sets Longitude field to given value.

### HasLongitude

`func (o *CatalogsHotelAttributes) HasLongitude() bool`

HasLongitude returns a boolean if a field has been set.

### SetLongitudeNil

`func (o *CatalogsHotelAttributes) SetLongitudeNil(b bool)`

 SetLongitudeNil sets the value for Longitude to be an explicit nil

### UnsetLongitude
`func (o *CatalogsHotelAttributes) UnsetLongitude()`

UnsetLongitude ensures that no value is present for Longitude, not even an explicit nil
### GetNeighborhood

`func (o *CatalogsHotelAttributes) GetNeighborhood() []string`

GetNeighborhood returns the Neighborhood field if non-nil, zero value otherwise.

### GetNeighborhoodOk

`func (o *CatalogsHotelAttributes) GetNeighborhoodOk() (*[]string, bool)`

GetNeighborhoodOk returns a tuple with the Neighborhood field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNeighborhood

`func (o *CatalogsHotelAttributes) SetNeighborhood(v []string)`

SetNeighborhood sets Neighborhood field to given value.

### HasNeighborhood

`func (o *CatalogsHotelAttributes) HasNeighborhood() bool`

HasNeighborhood returns a boolean if a field has been set.

### SetNeighborhoodNil

`func (o *CatalogsHotelAttributes) SetNeighborhoodNil(b bool)`

 SetNeighborhoodNil sets the value for Neighborhood to be an explicit nil

### UnsetNeighborhood
`func (o *CatalogsHotelAttributes) UnsetNeighborhood()`

UnsetNeighborhood ensures that no value is present for Neighborhood, not even an explicit nil
### GetAddress

`func (o *CatalogsHotelAttributes) GetAddress() CatalogsHotelAddress`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *CatalogsHotelAttributes) GetAddressOk() (*CatalogsHotelAddress, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *CatalogsHotelAttributes) SetAddress(v CatalogsHotelAddress)`

SetAddress sets Address field to given value.

### HasAddress

`func (o *CatalogsHotelAttributes) HasAddress() bool`

HasAddress returns a boolean if a field has been set.

### GetCustomLabel0

`func (o *CatalogsHotelAttributes) GetCustomLabel0() string`

GetCustomLabel0 returns the CustomLabel0 field if non-nil, zero value otherwise.

### GetCustomLabel0Ok

`func (o *CatalogsHotelAttributes) GetCustomLabel0Ok() (*string, bool)`

GetCustomLabel0Ok returns a tuple with the CustomLabel0 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel0

`func (o *CatalogsHotelAttributes) SetCustomLabel0(v string)`

SetCustomLabel0 sets CustomLabel0 field to given value.

### HasCustomLabel0

`func (o *CatalogsHotelAttributes) HasCustomLabel0() bool`

HasCustomLabel0 returns a boolean if a field has been set.

### SetCustomLabel0Nil

`func (o *CatalogsHotelAttributes) SetCustomLabel0Nil(b bool)`

 SetCustomLabel0Nil sets the value for CustomLabel0 to be an explicit nil

### UnsetCustomLabel0
`func (o *CatalogsHotelAttributes) UnsetCustomLabel0()`

UnsetCustomLabel0 ensures that no value is present for CustomLabel0, not even an explicit nil
### GetCustomLabel1

`func (o *CatalogsHotelAttributes) GetCustomLabel1() string`

GetCustomLabel1 returns the CustomLabel1 field if non-nil, zero value otherwise.

### GetCustomLabel1Ok

`func (o *CatalogsHotelAttributes) GetCustomLabel1Ok() (*string, bool)`

GetCustomLabel1Ok returns a tuple with the CustomLabel1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel1

`func (o *CatalogsHotelAttributes) SetCustomLabel1(v string)`

SetCustomLabel1 sets CustomLabel1 field to given value.

### HasCustomLabel1

`func (o *CatalogsHotelAttributes) HasCustomLabel1() bool`

HasCustomLabel1 returns a boolean if a field has been set.

### SetCustomLabel1Nil

`func (o *CatalogsHotelAttributes) SetCustomLabel1Nil(b bool)`

 SetCustomLabel1Nil sets the value for CustomLabel1 to be an explicit nil

### UnsetCustomLabel1
`func (o *CatalogsHotelAttributes) UnsetCustomLabel1()`

UnsetCustomLabel1 ensures that no value is present for CustomLabel1, not even an explicit nil
### GetCustomLabel2

`func (o *CatalogsHotelAttributes) GetCustomLabel2() string`

GetCustomLabel2 returns the CustomLabel2 field if non-nil, zero value otherwise.

### GetCustomLabel2Ok

`func (o *CatalogsHotelAttributes) GetCustomLabel2Ok() (*string, bool)`

GetCustomLabel2Ok returns a tuple with the CustomLabel2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel2

`func (o *CatalogsHotelAttributes) SetCustomLabel2(v string)`

SetCustomLabel2 sets CustomLabel2 field to given value.

### HasCustomLabel2

`func (o *CatalogsHotelAttributes) HasCustomLabel2() bool`

HasCustomLabel2 returns a boolean if a field has been set.

### SetCustomLabel2Nil

`func (o *CatalogsHotelAttributes) SetCustomLabel2Nil(b bool)`

 SetCustomLabel2Nil sets the value for CustomLabel2 to be an explicit nil

### UnsetCustomLabel2
`func (o *CatalogsHotelAttributes) UnsetCustomLabel2()`

UnsetCustomLabel2 ensures that no value is present for CustomLabel2, not even an explicit nil
### GetCustomLabel3

`func (o *CatalogsHotelAttributes) GetCustomLabel3() string`

GetCustomLabel3 returns the CustomLabel3 field if non-nil, zero value otherwise.

### GetCustomLabel3Ok

`func (o *CatalogsHotelAttributes) GetCustomLabel3Ok() (*string, bool)`

GetCustomLabel3Ok returns a tuple with the CustomLabel3 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel3

`func (o *CatalogsHotelAttributes) SetCustomLabel3(v string)`

SetCustomLabel3 sets CustomLabel3 field to given value.

### HasCustomLabel3

`func (o *CatalogsHotelAttributes) HasCustomLabel3() bool`

HasCustomLabel3 returns a boolean if a field has been set.

### SetCustomLabel3Nil

`func (o *CatalogsHotelAttributes) SetCustomLabel3Nil(b bool)`

 SetCustomLabel3Nil sets the value for CustomLabel3 to be an explicit nil

### UnsetCustomLabel3
`func (o *CatalogsHotelAttributes) UnsetCustomLabel3()`

UnsetCustomLabel3 ensures that no value is present for CustomLabel3, not even an explicit nil
### GetCustomLabel4

`func (o *CatalogsHotelAttributes) GetCustomLabel4() string`

GetCustomLabel4 returns the CustomLabel4 field if non-nil, zero value otherwise.

### GetCustomLabel4Ok

`func (o *CatalogsHotelAttributes) GetCustomLabel4Ok() (*string, bool)`

GetCustomLabel4Ok returns a tuple with the CustomLabel4 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel4

`func (o *CatalogsHotelAttributes) SetCustomLabel4(v string)`

SetCustomLabel4 sets CustomLabel4 field to given value.

### HasCustomLabel4

`func (o *CatalogsHotelAttributes) HasCustomLabel4() bool`

HasCustomLabel4 returns a boolean if a field has been set.

### SetCustomLabel4Nil

`func (o *CatalogsHotelAttributes) SetCustomLabel4Nil(b bool)`

 SetCustomLabel4Nil sets the value for CustomLabel4 to be an explicit nil

### UnsetCustomLabel4
`func (o *CatalogsHotelAttributes) UnsetCustomLabel4()`

UnsetCustomLabel4 ensures that no value is present for CustomLabel4, not even an explicit nil
### GetCategory

`func (o *CatalogsHotelAttributes) GetCategory() string`

GetCategory returns the Category field if non-nil, zero value otherwise.

### GetCategoryOk

`func (o *CatalogsHotelAttributes) GetCategoryOk() (*string, bool)`

GetCategoryOk returns a tuple with the Category field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategory

`func (o *CatalogsHotelAttributes) SetCategory(v string)`

SetCategory sets Category field to given value.

### HasCategory

`func (o *CatalogsHotelAttributes) HasCategory() bool`

HasCategory returns a boolean if a field has been set.

### SetCategoryNil

`func (o *CatalogsHotelAttributes) SetCategoryNil(b bool)`

 SetCategoryNil sets the value for Category to be an explicit nil

### UnsetCategory
`func (o *CatalogsHotelAttributes) UnsetCategory()`

UnsetCategory ensures that no value is present for Category, not even an explicit nil
### GetBasePrice

`func (o *CatalogsHotelAttributes) GetBasePrice() string`

GetBasePrice returns the BasePrice field if non-nil, zero value otherwise.

### GetBasePriceOk

`func (o *CatalogsHotelAttributes) GetBasePriceOk() (*string, bool)`

GetBasePriceOk returns a tuple with the BasePrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBasePrice

`func (o *CatalogsHotelAttributes) SetBasePrice(v string)`

SetBasePrice sets BasePrice field to given value.

### HasBasePrice

`func (o *CatalogsHotelAttributes) HasBasePrice() bool`

HasBasePrice returns a boolean if a field has been set.

### SetBasePriceNil

`func (o *CatalogsHotelAttributes) SetBasePriceNil(b bool)`

 SetBasePriceNil sets the value for BasePrice to be an explicit nil

### UnsetBasePrice
`func (o *CatalogsHotelAttributes) UnsetBasePrice()`

UnsetBasePrice ensures that no value is present for BasePrice, not even an explicit nil
### GetSalePrice

`func (o *CatalogsHotelAttributes) GetSalePrice() string`

GetSalePrice returns the SalePrice field if non-nil, zero value otherwise.

### GetSalePriceOk

`func (o *CatalogsHotelAttributes) GetSalePriceOk() (*string, bool)`

GetSalePriceOk returns a tuple with the SalePrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSalePrice

`func (o *CatalogsHotelAttributes) SetSalePrice(v string)`

SetSalePrice sets SalePrice field to given value.

### HasSalePrice

`func (o *CatalogsHotelAttributes) HasSalePrice() bool`

HasSalePrice returns a boolean if a field has been set.

### SetSalePriceNil

`func (o *CatalogsHotelAttributes) SetSalePriceNil(b bool)`

 SetSalePriceNil sets the value for SalePrice to be an explicit nil

### UnsetSalePrice
`func (o *CatalogsHotelAttributes) UnsetSalePrice()`

UnsetSalePrice ensures that no value is present for SalePrice, not even an explicit nil
### GetGuestRatings

`func (o *CatalogsHotelAttributes) GetGuestRatings() CatalogsHotelGuestRatings`

GetGuestRatings returns the GuestRatings field if non-nil, zero value otherwise.

### GetGuestRatingsOk

`func (o *CatalogsHotelAttributes) GetGuestRatingsOk() (*CatalogsHotelGuestRatings, bool)`

GetGuestRatingsOk returns a tuple with the GuestRatings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuestRatings

`func (o *CatalogsHotelAttributes) SetGuestRatings(v CatalogsHotelGuestRatings)`

SetGuestRatings sets GuestRatings field to given value.

### HasGuestRatings

`func (o *CatalogsHotelAttributes) HasGuestRatings() bool`

HasGuestRatings returns a boolean if a field has been set.

### GetMainImage

`func (o *CatalogsHotelAttributes) GetMainImage() CatalogsHotelAttributesAllOfMainImage`

GetMainImage returns the MainImage field if non-nil, zero value otherwise.

### GetMainImageOk

`func (o *CatalogsHotelAttributes) GetMainImageOk() (*CatalogsHotelAttributesAllOfMainImage, bool)`

GetMainImageOk returns a tuple with the MainImage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMainImage

`func (o *CatalogsHotelAttributes) SetMainImage(v CatalogsHotelAttributesAllOfMainImage)`

SetMainImage sets MainImage field to given value.

### HasMainImage

`func (o *CatalogsHotelAttributes) HasMainImage() bool`

HasMainImage returns a boolean if a field has been set.

### GetAdditionalImageLink

`func (o *CatalogsHotelAttributes) GetAdditionalImageLink() []string`

GetAdditionalImageLink returns the AdditionalImageLink field if non-nil, zero value otherwise.

### GetAdditionalImageLinkOk

`func (o *CatalogsHotelAttributes) GetAdditionalImageLinkOk() (*[]string, bool)`

GetAdditionalImageLinkOk returns a tuple with the AdditionalImageLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdditionalImageLink

`func (o *CatalogsHotelAttributes) SetAdditionalImageLink(v []string)`

SetAdditionalImageLink sets AdditionalImageLink field to given value.

### HasAdditionalImageLink

`func (o *CatalogsHotelAttributes) HasAdditionalImageLink() bool`

HasAdditionalImageLink returns a boolean if a field has been set.

### SetAdditionalImageLinkNil

`func (o *CatalogsHotelAttributes) SetAdditionalImageLinkNil(b bool)`

 SetAdditionalImageLinkNil sets the value for AdditionalImageLink to be an explicit nil

### UnsetAdditionalImageLink
`func (o *CatalogsHotelAttributes) UnsetAdditionalImageLink()`

UnsetAdditionalImageLink ensures that no value is present for AdditionalImageLink, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


