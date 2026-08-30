# CustomerSegment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | Pointer to **string** | The ID of the ad account that this customer segment belongs to. | [optional] [readonly] 
**AudienceIds** | **[]string** | Audience IDs included in the customer segment. | 
**CreatedTime** | Pointer to **int32** | Customer segment created time. Unix timestamp in seconds. | [optional] [readonly] 
**Id** | Pointer to **string** | Customer segment ID. | [optional] [readonly] 
**Name** | **string** | Customer segment name. | 
**Status** | Pointer to [**TargetingTemplateStatus**](TargetingTemplateStatus.md) | Indicates whether the customer segment is active or deleted. | [optional] [readonly] 
**UpdatedTime** | Pointer to **int32** | Customer segment updated time. Unix timestamp in seconds. | [optional] [readonly] 

## Methods

### NewCustomerSegment

`func NewCustomerSegment(audienceIds []string, name string, ) *CustomerSegment`

NewCustomerSegment instantiates a new CustomerSegment object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCustomerSegmentWithDefaults

`func NewCustomerSegmentWithDefaults() *CustomerSegment`

NewCustomerSegmentWithDefaults instantiates a new CustomerSegment object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *CustomerSegment) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *CustomerSegment) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *CustomerSegment) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *CustomerSegment) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetAudienceIds

`func (o *CustomerSegment) GetAudienceIds() []string`

GetAudienceIds returns the AudienceIds field if non-nil, zero value otherwise.

### GetAudienceIdsOk

`func (o *CustomerSegment) GetAudienceIdsOk() (*[]string, bool)`

GetAudienceIdsOk returns a tuple with the AudienceIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudienceIds

`func (o *CustomerSegment) SetAudienceIds(v []string)`

SetAudienceIds sets AudienceIds field to given value.


### GetCreatedTime

`func (o *CustomerSegment) GetCreatedTime() int32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *CustomerSegment) GetCreatedTimeOk() (*int32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *CustomerSegment) SetCreatedTime(v int32)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *CustomerSegment) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### GetId

`func (o *CustomerSegment) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CustomerSegment) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CustomerSegment) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *CustomerSegment) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *CustomerSegment) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CustomerSegment) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CustomerSegment) SetName(v string)`

SetName sets Name field to given value.


### GetStatus

`func (o *CustomerSegment) GetStatus() TargetingTemplateStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CustomerSegment) GetStatusOk() (*TargetingTemplateStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CustomerSegment) SetStatus(v TargetingTemplateStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CustomerSegment) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetUpdatedTime

`func (o *CustomerSegment) GetUpdatedTime() int32`

GetUpdatedTime returns the UpdatedTime field if non-nil, zero value otherwise.

### GetUpdatedTimeOk

`func (o *CustomerSegment) GetUpdatedTimeOk() (*int32, bool)`

GetUpdatedTimeOk returns a tuple with the UpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTime

`func (o *CustomerSegment) SetUpdatedTime(v int32)`

SetUpdatedTime sets UpdatedTime field to given value.

### HasUpdatedTime

`func (o *CustomerSegment) HasUpdatedTime() bool`

HasUpdatedTime returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


