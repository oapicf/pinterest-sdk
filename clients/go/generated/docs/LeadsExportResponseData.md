# LeadsExportResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ExportStatus** | Pointer to [**LeadsExportStatus**](LeadsExportStatus.md) |  | [optional] 
**DownloadUrl** | Pointer to **NullableString** |  | [optional] 

## Methods

### NewLeadsExportResponseData

`func NewLeadsExportResponseData() *LeadsExportResponseData`

NewLeadsExportResponseData instantiates a new LeadsExportResponseData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLeadsExportResponseDataWithDefaults

`func NewLeadsExportResponseDataWithDefaults() *LeadsExportResponseData`

NewLeadsExportResponseDataWithDefaults instantiates a new LeadsExportResponseData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetExportStatus

`func (o *LeadsExportResponseData) GetExportStatus() LeadsExportStatus`

GetExportStatus returns the ExportStatus field if non-nil, zero value otherwise.

### GetExportStatusOk

`func (o *LeadsExportResponseData) GetExportStatusOk() (*LeadsExportStatus, bool)`

GetExportStatusOk returns a tuple with the ExportStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExportStatus

`func (o *LeadsExportResponseData) SetExportStatus(v LeadsExportStatus)`

SetExportStatus sets ExportStatus field to given value.

### HasExportStatus

`func (o *LeadsExportResponseData) HasExportStatus() bool`

HasExportStatus returns a boolean if a field has been set.

### GetDownloadUrl

`func (o *LeadsExportResponseData) GetDownloadUrl() string`

GetDownloadUrl returns the DownloadUrl field if non-nil, zero value otherwise.

### GetDownloadUrlOk

`func (o *LeadsExportResponseData) GetDownloadUrlOk() (*string, bool)`

GetDownloadUrlOk returns a tuple with the DownloadUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDownloadUrl

`func (o *LeadsExportResponseData) SetDownloadUrl(v string)`

SetDownloadUrl sets DownloadUrl field to given value.

### HasDownloadUrl

`func (o *LeadsExportResponseData) HasDownloadUrl() bool`

HasDownloadUrl returns a boolean if a field has been set.

### SetDownloadUrlNil

`func (o *LeadsExportResponseData) SetDownloadUrlNil(b bool)`

 SetDownloadUrlNil sets the value for DownloadUrl to be an explicit nil

### UnsetDownloadUrl
`func (o *LeadsExportResponseData) UnsetDownloadUrl()`

UnsetDownloadUrl ensures that no value is present for DownloadUrl, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


