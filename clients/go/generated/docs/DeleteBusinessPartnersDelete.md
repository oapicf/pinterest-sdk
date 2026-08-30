# DeleteBusinessPartnersDelete

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PartnerIds** | **[]string** | A list of partner ids to be deleted | 
**PartnerType** | Pointer to [**NullableNullablePartnerType**](NullablePartnerType.md) |  | [optional] 

## Methods

### NewDeleteBusinessPartnersDelete

`func NewDeleteBusinessPartnersDelete(partnerIds []string, ) *DeleteBusinessPartnersDelete`

NewDeleteBusinessPartnersDelete instantiates a new DeleteBusinessPartnersDelete object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDeleteBusinessPartnersDeleteWithDefaults

`func NewDeleteBusinessPartnersDeleteWithDefaults() *DeleteBusinessPartnersDelete`

NewDeleteBusinessPartnersDeleteWithDefaults instantiates a new DeleteBusinessPartnersDelete object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPartnerIds

`func (o *DeleteBusinessPartnersDelete) GetPartnerIds() []string`

GetPartnerIds returns the PartnerIds field if non-nil, zero value otherwise.

### GetPartnerIdsOk

`func (o *DeleteBusinessPartnersDelete) GetPartnerIdsOk() (*[]string, bool)`

GetPartnerIdsOk returns a tuple with the PartnerIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerIds

`func (o *DeleteBusinessPartnersDelete) SetPartnerIds(v []string)`

SetPartnerIds sets PartnerIds field to given value.


### GetPartnerType

`func (o *DeleteBusinessPartnersDelete) GetPartnerType() NullablePartnerType`

GetPartnerType returns the PartnerType field if non-nil, zero value otherwise.

### GetPartnerTypeOk

`func (o *DeleteBusinessPartnersDelete) GetPartnerTypeOk() (*NullablePartnerType, bool)`

GetPartnerTypeOk returns a tuple with the PartnerType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerType

`func (o *DeleteBusinessPartnersDelete) SetPartnerType(v NullablePartnerType)`

SetPartnerType sets PartnerType field to given value.

### HasPartnerType

`func (o *DeleteBusinessPartnersDelete) HasPartnerType() bool`

HasPartnerType returns a boolean if a field has been set.

### SetPartnerTypeNil

`func (o *DeleteBusinessPartnersDelete) SetPartnerTypeNil(b bool)`

 SetPartnerTypeNil sets the value for PartnerType to be an explicit nil

### UnsetPartnerType
`func (o *DeleteBusinessPartnersDelete) UnsetPartnerType()`

UnsetPartnerType ensures that no value is present for PartnerType, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


