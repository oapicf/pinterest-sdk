# TemplateBasedReportCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | Pointer to **string** |  | [optional] 
**ReportStatus** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  | 
**Token** | Pointer to **string** |  | [optional] 

## Methods

### NewTemplateBasedReportCreate

`func NewTemplateBasedReportCreate(reportStatus BulkReportingJobStatus, ) *TemplateBasedReportCreate`

NewTemplateBasedReportCreate instantiates a new TemplateBasedReportCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTemplateBasedReportCreateWithDefaults

`func NewTemplateBasedReportCreateWithDefaults() *TemplateBasedReportCreate`

NewTemplateBasedReportCreateWithDefaults instantiates a new TemplateBasedReportCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessage

`func (o *TemplateBasedReportCreate) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *TemplateBasedReportCreate) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *TemplateBasedReportCreate) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *TemplateBasedReportCreate) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetReportStatus

`func (o *TemplateBasedReportCreate) GetReportStatus() BulkReportingJobStatus`

GetReportStatus returns the ReportStatus field if non-nil, zero value otherwise.

### GetReportStatusOk

`func (o *TemplateBasedReportCreate) GetReportStatusOk() (*BulkReportingJobStatus, bool)`

GetReportStatusOk returns a tuple with the ReportStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportStatus

`func (o *TemplateBasedReportCreate) SetReportStatus(v BulkReportingJobStatus)`

SetReportStatus sets ReportStatus field to given value.


### GetToken

`func (o *TemplateBasedReportCreate) GetToken() string`

GetToken returns the Token field if non-nil, zero value otherwise.

### GetTokenOk

`func (o *TemplateBasedReportCreate) GetTokenOk() (*string, bool)`

GetTokenOk returns a tuple with the Token field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToken

`func (o *TemplateBasedReportCreate) SetToken(v string)`

SetToken sets Token field to given value.

### HasToken

`func (o *TemplateBasedReportCreate) HasToken() bool`

HasToken returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


