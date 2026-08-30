# CustomerSegmentUpdateRequestUpdateWithRequiredBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceIds** | Pointer to **[]string** | Audience IDs to update the customer segment to. Only applicable for UPDATE operations. | [optional] 
**Id** | **string** | Customer segment ID. | 
**OperationType** | [**AudienceUpdateOperationType**](AudienceUpdateOperationType.md) |  | 

## Methods

### NewCustomerSegmentUpdateRequestUpdateWithRequiredBody

`func NewCustomerSegmentUpdateRequestUpdateWithRequiredBody(id string, operationType AudienceUpdateOperationType, ) *CustomerSegmentUpdateRequestUpdateWithRequiredBody`

NewCustomerSegmentUpdateRequestUpdateWithRequiredBody instantiates a new CustomerSegmentUpdateRequestUpdateWithRequiredBody object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCustomerSegmentUpdateRequestUpdateWithRequiredBodyWithDefaults

`func NewCustomerSegmentUpdateRequestUpdateWithRequiredBodyWithDefaults() *CustomerSegmentUpdateRequestUpdateWithRequiredBody`

NewCustomerSegmentUpdateRequestUpdateWithRequiredBodyWithDefaults instantiates a new CustomerSegmentUpdateRequestUpdateWithRequiredBody object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAudienceIds

`func (o *CustomerSegmentUpdateRequestUpdateWithRequiredBody) GetAudienceIds() []string`

GetAudienceIds returns the AudienceIds field if non-nil, zero value otherwise.

### GetAudienceIdsOk

`func (o *CustomerSegmentUpdateRequestUpdateWithRequiredBody) GetAudienceIdsOk() (*[]string, bool)`

GetAudienceIdsOk returns a tuple with the AudienceIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudienceIds

`func (o *CustomerSegmentUpdateRequestUpdateWithRequiredBody) SetAudienceIds(v []string)`

SetAudienceIds sets AudienceIds field to given value.

### HasAudienceIds

`func (o *CustomerSegmentUpdateRequestUpdateWithRequiredBody) HasAudienceIds() bool`

HasAudienceIds returns a boolean if a field has been set.

### GetId

`func (o *CustomerSegmentUpdateRequestUpdateWithRequiredBody) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CustomerSegmentUpdateRequestUpdateWithRequiredBody) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CustomerSegmentUpdateRequestUpdateWithRequiredBody) SetId(v string)`

SetId sets Id field to given value.


### GetOperationType

`func (o *CustomerSegmentUpdateRequestUpdateWithRequiredBody) GetOperationType() AudienceUpdateOperationType`

GetOperationType returns the OperationType field if non-nil, zero value otherwise.

### GetOperationTypeOk

`func (o *CustomerSegmentUpdateRequestUpdateWithRequiredBody) GetOperationTypeOk() (*AudienceUpdateOperationType, bool)`

GetOperationTypeOk returns a tuple with the OperationType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperationType

`func (o *CustomerSegmentUpdateRequestUpdateWithRequiredBody) SetOperationType(v AudienceUpdateOperationType)`

SetOperationType sets OperationType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


