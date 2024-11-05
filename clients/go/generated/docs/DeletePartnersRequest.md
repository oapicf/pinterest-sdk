# DeletePartnersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PartnerIds** | **[]string** |  | 
**PartnerType** | Pointer to **NullableString** |  | [optional] 

## Methods

### NewDeletePartnersRequest

`func NewDeletePartnersRequest(partnerIds []string, ) *DeletePartnersRequest`

NewDeletePartnersRequest instantiates a new DeletePartnersRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDeletePartnersRequestWithDefaults

`func NewDeletePartnersRequestWithDefaults() *DeletePartnersRequest`

NewDeletePartnersRequestWithDefaults instantiates a new DeletePartnersRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPartnerIds

`func (o *DeletePartnersRequest) GetPartnerIds() []string`

GetPartnerIds returns the PartnerIds field if non-nil, zero value otherwise.

### GetPartnerIdsOk

`func (o *DeletePartnersRequest) GetPartnerIdsOk() (*[]string, bool)`

GetPartnerIdsOk returns a tuple with the PartnerIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerIds

`func (o *DeletePartnersRequest) SetPartnerIds(v []string)`

SetPartnerIds sets PartnerIds field to given value.


### GetPartnerType

`func (o *DeletePartnersRequest) GetPartnerType() string`

GetPartnerType returns the PartnerType field if non-nil, zero value otherwise.

### GetPartnerTypeOk

`func (o *DeletePartnersRequest) GetPartnerTypeOk() (*string, bool)`

GetPartnerTypeOk returns a tuple with the PartnerType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerType

`func (o *DeletePartnersRequest) SetPartnerType(v string)`

SetPartnerType sets PartnerType field to given value.

### HasPartnerType

`func (o *DeletePartnersRequest) HasPartnerType() bool`

HasPartnerType returns a boolean if a field has been set.

### SetPartnerTypeNil

`func (o *DeletePartnersRequest) SetPartnerTypeNil(b bool)`

 SetPartnerTypeNil sets the value for PartnerType to be an explicit nil

### UnsetPartnerType
`func (o *DeletePartnersRequest) UnsetPartnerType()`

UnsetPartnerType ensures that no value is present for PartnerType, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


