# CustomerSegmentCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceIds** | **[]string** | Audience IDs included in the customer segment. | 
**Name** | **string** | Customer segment name. | 

## Methods

### NewCustomerSegmentCreate

`func NewCustomerSegmentCreate(audienceIds []string, name string, ) *CustomerSegmentCreate`

NewCustomerSegmentCreate instantiates a new CustomerSegmentCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCustomerSegmentCreateWithDefaults

`func NewCustomerSegmentCreateWithDefaults() *CustomerSegmentCreate`

NewCustomerSegmentCreateWithDefaults instantiates a new CustomerSegmentCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAudienceIds

`func (o *CustomerSegmentCreate) GetAudienceIds() []string`

GetAudienceIds returns the AudienceIds field if non-nil, zero value otherwise.

### GetAudienceIdsOk

`func (o *CustomerSegmentCreate) GetAudienceIdsOk() (*[]string, bool)`

GetAudienceIdsOk returns a tuple with the AudienceIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudienceIds

`func (o *CustomerSegmentCreate) SetAudienceIds(v []string)`

SetAudienceIds sets AudienceIds field to given value.


### GetName

`func (o *CustomerSegmentCreate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CustomerSegmentCreate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CustomerSegmentCreate) SetName(v string)`

SetName sets Name field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


