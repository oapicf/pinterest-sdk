# CatalogsReportFeedIngestionStats

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportType** | Pointer to **string** |  | [optional] 
**CatalogId** | Pointer to **string** | ID of the catalog entity. | [optional] 
**Code** | Pointer to **int32** | The event code that a diagnostics aggregated number references | [optional] 
**CodeLabel** | Pointer to **string** | A human-friendly label for the event code (e.g, &#39;AVAILABILITY_INVALID&#39;) | [optional] 
**Message** | Pointer to **string** | Title message describing the diagnostic issue | [optional] 
**Occurrences** | Pointer to **int32** | Number of occurrences of the issue | [optional] 
**Severity** | Pointer to **string** | An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue | [optional] 

## Methods

### NewCatalogsReportFeedIngestionStats

`func NewCatalogsReportFeedIngestionStats() *CatalogsReportFeedIngestionStats`

NewCatalogsReportFeedIngestionStats instantiates a new CatalogsReportFeedIngestionStats object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsReportFeedIngestionStatsWithDefaults

`func NewCatalogsReportFeedIngestionStatsWithDefaults() *CatalogsReportFeedIngestionStats`

NewCatalogsReportFeedIngestionStatsWithDefaults instantiates a new CatalogsReportFeedIngestionStats object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetReportType

`func (o *CatalogsReportFeedIngestionStats) GetReportType() string`

GetReportType returns the ReportType field if non-nil, zero value otherwise.

### GetReportTypeOk

`func (o *CatalogsReportFeedIngestionStats) GetReportTypeOk() (*string, bool)`

GetReportTypeOk returns a tuple with the ReportType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportType

`func (o *CatalogsReportFeedIngestionStats) SetReportType(v string)`

SetReportType sets ReportType field to given value.

### HasReportType

`func (o *CatalogsReportFeedIngestionStats) HasReportType() bool`

HasReportType returns a boolean if a field has been set.

### GetCatalogId

`func (o *CatalogsReportFeedIngestionStats) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsReportFeedIngestionStats) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsReportFeedIngestionStats) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.

### HasCatalogId

`func (o *CatalogsReportFeedIngestionStats) HasCatalogId() bool`

HasCatalogId returns a boolean if a field has been set.

### GetCode

`func (o *CatalogsReportFeedIngestionStats) GetCode() int32`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *CatalogsReportFeedIngestionStats) GetCodeOk() (*int32, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *CatalogsReportFeedIngestionStats) SetCode(v int32)`

SetCode sets Code field to given value.

### HasCode

`func (o *CatalogsReportFeedIngestionStats) HasCode() bool`

HasCode returns a boolean if a field has been set.

### GetCodeLabel

`func (o *CatalogsReportFeedIngestionStats) GetCodeLabel() string`

GetCodeLabel returns the CodeLabel field if non-nil, zero value otherwise.

### GetCodeLabelOk

`func (o *CatalogsReportFeedIngestionStats) GetCodeLabelOk() (*string, bool)`

GetCodeLabelOk returns a tuple with the CodeLabel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCodeLabel

`func (o *CatalogsReportFeedIngestionStats) SetCodeLabel(v string)`

SetCodeLabel sets CodeLabel field to given value.

### HasCodeLabel

`func (o *CatalogsReportFeedIngestionStats) HasCodeLabel() bool`

HasCodeLabel returns a boolean if a field has been set.

### GetMessage

`func (o *CatalogsReportFeedIngestionStats) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *CatalogsReportFeedIngestionStats) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *CatalogsReportFeedIngestionStats) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *CatalogsReportFeedIngestionStats) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetOccurrences

`func (o *CatalogsReportFeedIngestionStats) GetOccurrences() int32`

GetOccurrences returns the Occurrences field if non-nil, zero value otherwise.

### GetOccurrencesOk

`func (o *CatalogsReportFeedIngestionStats) GetOccurrencesOk() (*int32, bool)`

GetOccurrencesOk returns a tuple with the Occurrences field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOccurrences

`func (o *CatalogsReportFeedIngestionStats) SetOccurrences(v int32)`

SetOccurrences sets Occurrences field to given value.

### HasOccurrences

`func (o *CatalogsReportFeedIngestionStats) HasOccurrences() bool`

HasOccurrences returns a boolean if a field has been set.

### GetSeverity

`func (o *CatalogsReportFeedIngestionStats) GetSeverity() string`

GetSeverity returns the Severity field if non-nil, zero value otherwise.

### GetSeverityOk

`func (o *CatalogsReportFeedIngestionStats) GetSeverityOk() (*string, bool)`

GetSeverityOk returns a tuple with the Severity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSeverity

`func (o *CatalogsReportFeedIngestionStats) SetSeverity(v string)`

SetSeverity sets Severity field to given value.

### HasSeverity

`func (o *CatalogsReportFeedIngestionStats) HasSeverity() bool`

HasSeverity returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


