# LeadFormQuestion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**QuestionType** | Pointer to [**LeadFormQuestionType**](LeadFormQuestionType.md) |  | [optional] 
**CustomQuestionFieldType** | Pointer to [**NullableLeadFormQuestionFieldType**](LeadFormQuestionFieldType.md) |  | [optional] 
**CustomQuestionLabel** | Pointer to **NullableString** | Question label for a custom question. | [optional] 
**CustomQuestionOptions** | Pointer to **[]string** | Question options for a custom question. | [optional] 

## Methods

### NewLeadFormQuestion

`func NewLeadFormQuestion() *LeadFormQuestion`

NewLeadFormQuestion instantiates a new LeadFormQuestion object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLeadFormQuestionWithDefaults

`func NewLeadFormQuestionWithDefaults() *LeadFormQuestion`

NewLeadFormQuestionWithDefaults instantiates a new LeadFormQuestion object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetQuestionType

`func (o *LeadFormQuestion) GetQuestionType() LeadFormQuestionType`

GetQuestionType returns the QuestionType field if non-nil, zero value otherwise.

### GetQuestionTypeOk

`func (o *LeadFormQuestion) GetQuestionTypeOk() (*LeadFormQuestionType, bool)`

GetQuestionTypeOk returns a tuple with the QuestionType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuestionType

`func (o *LeadFormQuestion) SetQuestionType(v LeadFormQuestionType)`

SetQuestionType sets QuestionType field to given value.

### HasQuestionType

`func (o *LeadFormQuestion) HasQuestionType() bool`

HasQuestionType returns a boolean if a field has been set.

### GetCustomQuestionFieldType

`func (o *LeadFormQuestion) GetCustomQuestionFieldType() LeadFormQuestionFieldType`

GetCustomQuestionFieldType returns the CustomQuestionFieldType field if non-nil, zero value otherwise.

### GetCustomQuestionFieldTypeOk

`func (o *LeadFormQuestion) GetCustomQuestionFieldTypeOk() (*LeadFormQuestionFieldType, bool)`

GetCustomQuestionFieldTypeOk returns a tuple with the CustomQuestionFieldType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomQuestionFieldType

`func (o *LeadFormQuestion) SetCustomQuestionFieldType(v LeadFormQuestionFieldType)`

SetCustomQuestionFieldType sets CustomQuestionFieldType field to given value.

### HasCustomQuestionFieldType

`func (o *LeadFormQuestion) HasCustomQuestionFieldType() bool`

HasCustomQuestionFieldType returns a boolean if a field has been set.

### SetCustomQuestionFieldTypeNil

`func (o *LeadFormQuestion) SetCustomQuestionFieldTypeNil(b bool)`

 SetCustomQuestionFieldTypeNil sets the value for CustomQuestionFieldType to be an explicit nil

### UnsetCustomQuestionFieldType
`func (o *LeadFormQuestion) UnsetCustomQuestionFieldType()`

UnsetCustomQuestionFieldType ensures that no value is present for CustomQuestionFieldType, not even an explicit nil
### GetCustomQuestionLabel

`func (o *LeadFormQuestion) GetCustomQuestionLabel() string`

GetCustomQuestionLabel returns the CustomQuestionLabel field if non-nil, zero value otherwise.

### GetCustomQuestionLabelOk

`func (o *LeadFormQuestion) GetCustomQuestionLabelOk() (*string, bool)`

GetCustomQuestionLabelOk returns a tuple with the CustomQuestionLabel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomQuestionLabel

`func (o *LeadFormQuestion) SetCustomQuestionLabel(v string)`

SetCustomQuestionLabel sets CustomQuestionLabel field to given value.

### HasCustomQuestionLabel

`func (o *LeadFormQuestion) HasCustomQuestionLabel() bool`

HasCustomQuestionLabel returns a boolean if a field has been set.

### SetCustomQuestionLabelNil

`func (o *LeadFormQuestion) SetCustomQuestionLabelNil(b bool)`

 SetCustomQuestionLabelNil sets the value for CustomQuestionLabel to be an explicit nil

### UnsetCustomQuestionLabel
`func (o *LeadFormQuestion) UnsetCustomQuestionLabel()`

UnsetCustomQuestionLabel ensures that no value is present for CustomQuestionLabel, not even an explicit nil
### GetCustomQuestionOptions

`func (o *LeadFormQuestion) GetCustomQuestionOptions() []string`

GetCustomQuestionOptions returns the CustomQuestionOptions field if non-nil, zero value otherwise.

### GetCustomQuestionOptionsOk

`func (o *LeadFormQuestion) GetCustomQuestionOptionsOk() (*[]string, bool)`

GetCustomQuestionOptionsOk returns a tuple with the CustomQuestionOptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomQuestionOptions

`func (o *LeadFormQuestion) SetCustomQuestionOptions(v []string)`

SetCustomQuestionOptions sets CustomQuestionOptions field to given value.

### HasCustomQuestionOptions

`func (o *LeadFormQuestion) HasCustomQuestionOptions() bool`

HasCustomQuestionOptions returns a boolean if a field has been set.

### SetCustomQuestionOptionsNil

`func (o *LeadFormQuestion) SetCustomQuestionOptionsNil(b bool)`

 SetCustomQuestionOptionsNil sets the value for CustomQuestionOptions to be an explicit nil

### UnsetCustomQuestionOptions
`func (o *LeadFormQuestion) UnsetCustomQuestionOptions()`

UnsetCustomQuestionOptions ensures that no value is present for CustomQuestionOptions, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


