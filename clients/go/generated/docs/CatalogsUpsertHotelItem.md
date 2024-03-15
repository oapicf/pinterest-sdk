# CatalogsUpsertHotelItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HotelId** | **string** | The catalog hotel id in the merchant namespace | 
**Operation** | **string** |  | 
**Attributes** | [**CatalogsHotelAttributes**](CatalogsHotelAttributes.md) |  | 

## Methods

### NewCatalogsUpsertHotelItem

`func NewCatalogsUpsertHotelItem(hotelId string, operation string, attributes CatalogsHotelAttributes, ) *CatalogsUpsertHotelItem`

NewCatalogsUpsertHotelItem instantiates a new CatalogsUpsertHotelItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsUpsertHotelItemWithDefaults

`func NewCatalogsUpsertHotelItemWithDefaults() *CatalogsUpsertHotelItem`

NewCatalogsUpsertHotelItemWithDefaults instantiates a new CatalogsUpsertHotelItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetHotelId

`func (o *CatalogsUpsertHotelItem) GetHotelId() string`

GetHotelId returns the HotelId field if non-nil, zero value otherwise.

### GetHotelIdOk

`func (o *CatalogsUpsertHotelItem) GetHotelIdOk() (*string, bool)`

GetHotelIdOk returns a tuple with the HotelId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHotelId

`func (o *CatalogsUpsertHotelItem) SetHotelId(v string)`

SetHotelId sets HotelId field to given value.


### GetOperation

`func (o *CatalogsUpsertHotelItem) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *CatalogsUpsertHotelItem) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *CatalogsUpsertHotelItem) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetAttributes

`func (o *CatalogsUpsertHotelItem) GetAttributes() CatalogsHotelAttributes`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *CatalogsUpsertHotelItem) GetAttributesOk() (*CatalogsHotelAttributes, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *CatalogsUpsertHotelItem) SetAttributes(v CatalogsHotelAttributes)`

SetAttributes sets Attributes field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


