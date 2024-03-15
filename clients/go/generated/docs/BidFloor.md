# BidFloor

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BidFloors** | Pointer to **[]int32** | A list of bid floors in micro currency. For example, [100000, 200000] | [optional] 
**Type** | Pointer to **string** | Always the string &#39;bidfloor&#39; | [optional] [default to "bidfloor"]

## Methods

### NewBidFloor

`func NewBidFloor() *BidFloor`

NewBidFloor instantiates a new BidFloor object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBidFloorWithDefaults

`func NewBidFloorWithDefaults() *BidFloor`

NewBidFloorWithDefaults instantiates a new BidFloor object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBidFloors

`func (o *BidFloor) GetBidFloors() []int32`

GetBidFloors returns the BidFloors field if non-nil, zero value otherwise.

### GetBidFloorsOk

`func (o *BidFloor) GetBidFloorsOk() (*[]int32, bool)`

GetBidFloorsOk returns a tuple with the BidFloors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidFloors

`func (o *BidFloor) SetBidFloors(v []int32)`

SetBidFloors sets BidFloors field to given value.

### HasBidFloors

`func (o *BidFloor) HasBidFloors() bool`

HasBidFloors returns a boolean if a field has been set.

### GetType

`func (o *BidFloor) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *BidFloor) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *BidFloor) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *BidFloor) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


