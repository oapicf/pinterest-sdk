# ConversionProductReport

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | Pointer to **string** | Message returned from the create report request | [optional] [readonly] 
**ReportStatus** | Pointer to [**BulkReportingJobStatus**](BulkReportingJobStatus.md) | Async report status | [optional] [readonly] 
**Size** | Pointer to **float32** | Size of the report in bytes | [optional] [readonly] 
**Token** | Pointer to **string** | Token returned from the create report request | [optional] [readonly] 
**Url** | Pointer to **string** | URL of the report | [optional] [readonly] 

## Methods

### NewConversionProductReport

`func NewConversionProductReport() *ConversionProductReport`

NewConversionProductReport instantiates a new ConversionProductReport object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionProductReportWithDefaults

`func NewConversionProductReportWithDefaults() *ConversionProductReport`

NewConversionProductReportWithDefaults instantiates a new ConversionProductReport object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessage

`func (o *ConversionProductReport) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ConversionProductReport) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ConversionProductReport) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *ConversionProductReport) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetReportStatus

`func (o *ConversionProductReport) GetReportStatus() BulkReportingJobStatus`

GetReportStatus returns the ReportStatus field if non-nil, zero value otherwise.

### GetReportStatusOk

`func (o *ConversionProductReport) GetReportStatusOk() (*BulkReportingJobStatus, bool)`

GetReportStatusOk returns a tuple with the ReportStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportStatus

`func (o *ConversionProductReport) SetReportStatus(v BulkReportingJobStatus)`

SetReportStatus sets ReportStatus field to given value.

### HasReportStatus

`func (o *ConversionProductReport) HasReportStatus() bool`

HasReportStatus returns a boolean if a field has been set.

### GetSize

`func (o *ConversionProductReport) GetSize() float32`

GetSize returns the Size field if non-nil, zero value otherwise.

### GetSizeOk

`func (o *ConversionProductReport) GetSizeOk() (*float32, bool)`

GetSizeOk returns a tuple with the Size field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSize

`func (o *ConversionProductReport) SetSize(v float32)`

SetSize sets Size field to given value.

### HasSize

`func (o *ConversionProductReport) HasSize() bool`

HasSize returns a boolean if a field has been set.

### GetToken

`func (o *ConversionProductReport) GetToken() string`

GetToken returns the Token field if non-nil, zero value otherwise.

### GetTokenOk

`func (o *ConversionProductReport) GetTokenOk() (*string, bool)`

GetTokenOk returns a tuple with the Token field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetToken

`func (o *ConversionProductReport) SetToken(v string)`

SetToken sets Token field to given value.

### HasToken

`func (o *ConversionProductReport) HasToken() bool`

HasToken returns a boolean if a field has been set.

### GetUrl

`func (o *ConversionProductReport) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *ConversionProductReport) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *ConversionProductReport) SetUrl(v string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *ConversionProductReport) HasUrl() bool`

HasUrl returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


