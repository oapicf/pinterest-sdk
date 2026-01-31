# QualityComponentIssue

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Unique identifier for the issue check. | 
**Name** | **string** | Human-readable name of the issue. | 
**Reason** | **string** | Detailed reason for the issue. | 

## Methods

### NewQualityComponentIssue

`func NewQualityComponentIssue(id string, name string, reason string, ) *QualityComponentIssue`

NewQualityComponentIssue instantiates a new QualityComponentIssue object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQualityComponentIssueWithDefaults

`func NewQualityComponentIssueWithDefaults() *QualityComponentIssue`

NewQualityComponentIssueWithDefaults instantiates a new QualityComponentIssue object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *QualityComponentIssue) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *QualityComponentIssue) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *QualityComponentIssue) SetId(v string)`

SetId sets Id field to given value.


### GetName

`func (o *QualityComponentIssue) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *QualityComponentIssue) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *QualityComponentIssue) SetName(v string)`

SetName sets Name field to given value.


### GetReason

`func (o *QualityComponentIssue) GetReason() string`

GetReason returns the Reason field if non-nil, zero value otherwise.

### GetReasonOk

`func (o *QualityComponentIssue) GetReasonOk() (*string, bool)`

GetReasonOk returns a tuple with the Reason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReason

`func (o *QualityComponentIssue) SetReason(v string)`

SetReason sets Reason field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


