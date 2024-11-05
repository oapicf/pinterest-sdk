# CatalogsReport

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportStatus** | Pointer to **string** |  | [optional] 
**Url** | Pointer to **NullableString** | URL to download the report | [optional] 
**Size** | Pointer to **NullableFloat32** | Size of the report in bytes | [optional] 

## Methods

### NewCatalogsReport

`func NewCatalogsReport() *CatalogsReport`

NewCatalogsReport instantiates a new CatalogsReport object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsReportWithDefaults

`func NewCatalogsReportWithDefaults() *CatalogsReport`

NewCatalogsReportWithDefaults instantiates a new CatalogsReport object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetReportStatus

`func (o *CatalogsReport) GetReportStatus() string`

GetReportStatus returns the ReportStatus field if non-nil, zero value otherwise.

### GetReportStatusOk

`func (o *CatalogsReport) GetReportStatusOk() (*string, bool)`

GetReportStatusOk returns a tuple with the ReportStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportStatus

`func (o *CatalogsReport) SetReportStatus(v string)`

SetReportStatus sets ReportStatus field to given value.

### HasReportStatus

`func (o *CatalogsReport) HasReportStatus() bool`

HasReportStatus returns a boolean if a field has been set.

### GetUrl

`func (o *CatalogsReport) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *CatalogsReport) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *CatalogsReport) SetUrl(v string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *CatalogsReport) HasUrl() bool`

HasUrl returns a boolean if a field has been set.

### SetUrlNil

`func (o *CatalogsReport) SetUrlNil(b bool)`

 SetUrlNil sets the value for Url to be an explicit nil

### UnsetUrl
`func (o *CatalogsReport) UnsetUrl()`

UnsetUrl ensures that no value is present for Url, not even an explicit nil
### GetSize

`func (o *CatalogsReport) GetSize() float32`

GetSize returns the Size field if non-nil, zero value otherwise.

### GetSizeOk

`func (o *CatalogsReport) GetSizeOk() (*float32, bool)`

GetSizeOk returns a tuple with the Size field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSize

`func (o *CatalogsReport) SetSize(v float32)`

SetSize sets Size field to given value.

### HasSize

`func (o *CatalogsReport) HasSize() bool`

HasSize returns a boolean if a field has been set.

### SetSizeNil

`func (o *CatalogsReport) SetSizeNil(b bool)`

 SetSizeNil sets the value for Size to be an explicit nil

### UnsetSize
`func (o *CatalogsReport) UnsetSize()`

UnsetSize ensures that no value is present for Size, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


