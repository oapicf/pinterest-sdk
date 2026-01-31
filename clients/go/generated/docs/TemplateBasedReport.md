# TemplateBasedReport

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | Pointer to **string** |  | [optional] 
**ReportStatus** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  | 
**TemplateId** | **string** | Unique identifier of a template. | 
**Token** | Pointer to **string** |  | [optional] 

## Methods

### NewTemplateBasedReport

`func NewTemplateBasedReport(reportStatus BulkReportingJobStatus, templateId string, ) *TemplateBasedReport`

NewTemplateBasedReport instantiates a new TemplateBasedReport object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTemplateBasedReportWithDefaults

`func NewTemplateBasedReportWithDefaults() *TemplateBasedReport`

NewTemplateBasedReportWithDefaults instantiates a new TemplateBasedReport object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessage

`func (o *TemplateBasedReport) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *TemplateBasedReport) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *TemplateBasedReport) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *TemplateBasedReport) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetReportStatus

`func (o *TemplateBasedReport) GetReportStatus() BulkReportingJobStatus`

GetReportStatus returns the ReportStatus field if non-nil, zero value otherwise.

### GetReportStatusOk

`func (o *TemplateBasedReport) GetReportStatusOk() (*BulkReportingJobStatus, bool)`

GetReportStatusOk returns a tuple with the ReportStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportStatus

`func (o *TemplateBasedReport) SetReportStatus(v BulkReportingJobStatus)`

SetReportStatus sets ReportStatus field to given value.


### GetTemplateId

`func (o *TemplateBasedReport) GetTemplateId() string`

GetTemplateId returns the TemplateId field if non-nil, zero value otherwise.

### GetTemplateIdOk

`func (o *TemplateBasedReport) GetTemplateIdOk() (*string, bool)`

GetTemplateIdOk returns a tuple with the TemplateId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTemplateId

`func (o *TemplateBasedReport) SetTemplateId(v string)`

SetTemplateId sets TemplateId field to given value.


### GetToken

`func (o *TemplateBasedReport) GetToken() string`

GetToken returns the Token field if non-nil, zero value otherwise.

### GetTokenOk

`func (o *TemplateBasedReport) GetTokenOk() (*string, bool)`

GetTokenOk returns a tuple with the Token field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToken

`func (o *TemplateBasedReport) SetToken(v string)`

SetToken sets Token field to given value.

### HasToken

`func (o *TemplateBasedReport) HasToken() bool`

HasToken returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


