# BidFloorCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BidFloorSpecs** | [**[]BidFloorSpec**](BidFloorSpec.md) | List of bid floor specifications. | 
**TargetingSpec** | Pointer to [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | Ad group targeting specification defining the ad group target audience. | [optional] 

## Methods

### NewBidFloorCreate

`func NewBidFloorCreate(bidFloorSpecs []BidFloorSpec, ) *BidFloorCreate`

NewBidFloorCreate instantiates a new BidFloorCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBidFloorCreateWithDefaults

`func NewBidFloorCreateWithDefaults() *BidFloorCreate`

NewBidFloorCreateWithDefaults instantiates a new BidFloorCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBidFloorSpecs

`func (o *BidFloorCreate) GetBidFloorSpecs() []BidFloorSpec`

GetBidFloorSpecs returns the BidFloorSpecs field if non-nil, zero value otherwise.

### GetBidFloorSpecsOk

`func (o *BidFloorCreate) GetBidFloorSpecsOk() (*[]BidFloorSpec, bool)`

GetBidFloorSpecsOk returns a tuple with the BidFloorSpecs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidFloorSpecs

`func (o *BidFloorCreate) SetBidFloorSpecs(v []BidFloorSpec)`

SetBidFloorSpecs sets BidFloorSpecs field to given value.


### GetTargetingSpec

`func (o *BidFloorCreate) GetTargetingSpec() TargetingSpecOptimal`

GetTargetingSpec returns the TargetingSpec field if non-nil, zero value otherwise.

### GetTargetingSpecOk

`func (o *BidFloorCreate) GetTargetingSpecOk() (*TargetingSpecOptimal, bool)`

GetTargetingSpecOk returns a tuple with the TargetingSpec field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetingSpec

`func (o *BidFloorCreate) SetTargetingSpec(v TargetingSpecOptimal)`

SetTargetingSpec sets TargetingSpec field to given value.

### HasTargetingSpec

`func (o *BidFloorCreate) HasTargetingSpec() bool`

HasTargetingSpec returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


