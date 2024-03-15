# CreateMMMReportResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportStatus** | Pointer to [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  | [optional] 
**Token** | Pointer to **string** |  | [optional] 
**Message** | Pointer to **NullableString** |  | [optional] 
**Status** | Pointer to **string** |  | [optional] 

## Methods

### NewCreateMMMReportResponseData

`func NewCreateMMMReportResponseData() *CreateMMMReportResponseData`

NewCreateMMMReportResponseData instantiates a new CreateMMMReportResponseData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCreateMMMReportResponseDataWithDefaults

`func NewCreateMMMReportResponseDataWithDefaults() *CreateMMMReportResponseData`

NewCreateMMMReportResponseDataWithDefaults instantiates a new CreateMMMReportResponseData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetReportStatus

`func (o *CreateMMMReportResponseData) GetReportStatus() BulkReportingJobStatus`

GetReportStatus returns the ReportStatus field if non-nil, zero value otherwise.

### GetReportStatusOk

`func (o *CreateMMMReportResponseData) GetReportStatusOk() (*BulkReportingJobStatus, bool)`

GetReportStatusOk returns a tuple with the ReportStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportStatus

`func (o *CreateMMMReportResponseData) SetReportStatus(v BulkReportingJobStatus)`

SetReportStatus sets ReportStatus field to given value.

### HasReportStatus

`func (o *CreateMMMReportResponseData) HasReportStatus() bool`

HasReportStatus returns a boolean if a field has been set.

### GetToken

`func (o *CreateMMMReportResponseData) GetToken() string`

GetToken returns the Token field if non-nil, zero value otherwise.

### GetTokenOk

`func (o *CreateMMMReportResponseData) GetTokenOk() (*string, bool)`

GetTokenOk returns a tuple with the Token field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToken

`func (o *CreateMMMReportResponseData) SetToken(v string)`

SetToken sets Token field to given value.

### HasToken

`func (o *CreateMMMReportResponseData) HasToken() bool`

HasToken returns a boolean if a field has been set.

### GetMessage

`func (o *CreateMMMReportResponseData) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *CreateMMMReportResponseData) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *CreateMMMReportResponseData) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *CreateMMMReportResponseData) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### SetMessageNil

`func (o *CreateMMMReportResponseData) SetMessageNil(b bool)`

 SetMessageNil sets the value for Message to be an explicit nil

### UnsetMessage
`func (o *CreateMMMReportResponseData) UnsetMessage()`

UnsetMessage ensures that no value is present for Message, not even an explicit nil
### GetStatus

`func (o *CreateMMMReportResponseData) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CreateMMMReportResponseData) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CreateMMMReportResponseData) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CreateMMMReportResponseData) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


