# CatalogsReportDistributionStats

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportType** | Pointer to **string** |  | [optional] 
**CatalogId** | Pointer to **string** | ID of the catalog entity. | [optional] 
**Code** | Pointer to **int32** | The event code that a diagnostics aggregated number references | [optional] 
**CodeLabel** | Pointer to **string** | A human-friendly label for the event code (e.g, &#39;SPAM&#39;) | [optional] 
**Message** | Pointer to **string** | Title message describing the diagnostic issue | [optional] 
**Occurrences** | Pointer to **int32** | Number of occurrences of the issue | [optional] 
**IneligibleForAds** | Pointer to **bool** | Indicates if issue makes items ineligible for ads distribution | [optional] 
**IneligibleForOrganic** | Pointer to **bool** | Indicates if issue makes items ineligible for organic distribution | [optional] 

## Methods

### NewCatalogsReportDistributionStats

`func NewCatalogsReportDistributionStats() *CatalogsReportDistributionStats`

NewCatalogsReportDistributionStats instantiates a new CatalogsReportDistributionStats object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsReportDistributionStatsWithDefaults

`func NewCatalogsReportDistributionStatsWithDefaults() *CatalogsReportDistributionStats`

NewCatalogsReportDistributionStatsWithDefaults instantiates a new CatalogsReportDistributionStats object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetReportType

`func (o *CatalogsReportDistributionStats) GetReportType() string`

GetReportType returns the ReportType field if non-nil, zero value otherwise.

### GetReportTypeOk

`func (o *CatalogsReportDistributionStats) GetReportTypeOk() (*string, bool)`

GetReportTypeOk returns a tuple with the ReportType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportType

`func (o *CatalogsReportDistributionStats) SetReportType(v string)`

SetReportType sets ReportType field to given value.

### HasReportType

`func (o *CatalogsReportDistributionStats) HasReportType() bool`

HasReportType returns a boolean if a field has been set.

### GetCatalogId

`func (o *CatalogsReportDistributionStats) GetCatalogId() string`

GetCatalogId returns the CatalogId field if non-nil, zero value otherwise.

### GetCatalogIdOk

`func (o *CatalogsReportDistributionStats) GetCatalogIdOk() (*string, bool)`

GetCatalogIdOk returns a tuple with the CatalogId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogId

`func (o *CatalogsReportDistributionStats) SetCatalogId(v string)`

SetCatalogId sets CatalogId field to given value.

### HasCatalogId

`func (o *CatalogsReportDistributionStats) HasCatalogId() bool`

HasCatalogId returns a boolean if a field has been set.

### GetCode

`func (o *CatalogsReportDistributionStats) GetCode() int32`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *CatalogsReportDistributionStats) GetCodeOk() (*int32, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *CatalogsReportDistributionStats) SetCode(v int32)`

SetCode sets Code field to given value.

### HasCode

`func (o *CatalogsReportDistributionStats) HasCode() bool`

HasCode returns a boolean if a field has been set.

### GetCodeLabel

`func (o *CatalogsReportDistributionStats) GetCodeLabel() string`

GetCodeLabel returns the CodeLabel field if non-nil, zero value otherwise.

### GetCodeLabelOk

`func (o *CatalogsReportDistributionStats) GetCodeLabelOk() (*string, bool)`

GetCodeLabelOk returns a tuple with the CodeLabel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCodeLabel

`func (o *CatalogsReportDistributionStats) SetCodeLabel(v string)`

SetCodeLabel sets CodeLabel field to given value.

### HasCodeLabel

`func (o *CatalogsReportDistributionStats) HasCodeLabel() bool`

HasCodeLabel returns a boolean if a field has been set.

### GetMessage

`func (o *CatalogsReportDistributionStats) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *CatalogsReportDistributionStats) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *CatalogsReportDistributionStats) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *CatalogsReportDistributionStats) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetOccurrences

`func (o *CatalogsReportDistributionStats) GetOccurrences() int32`

GetOccurrences returns the Occurrences field if non-nil, zero value otherwise.

### GetOccurrencesOk

`func (o *CatalogsReportDistributionStats) GetOccurrencesOk() (*int32, bool)`

GetOccurrencesOk returns a tuple with the Occurrences field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOccurrences

`func (o *CatalogsReportDistributionStats) SetOccurrences(v int32)`

SetOccurrences sets Occurrences field to given value.

### HasOccurrences

`func (o *CatalogsReportDistributionStats) HasOccurrences() bool`

HasOccurrences returns a boolean if a field has been set.

### GetIneligibleForAds

`func (o *CatalogsReportDistributionStats) GetIneligibleForAds() bool`

GetIneligibleForAds returns the IneligibleForAds field if non-nil, zero value otherwise.

### GetIneligibleForAdsOk

`func (o *CatalogsReportDistributionStats) GetIneligibleForAdsOk() (*bool, bool)`

GetIneligibleForAdsOk returns a tuple with the IneligibleForAds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIneligibleForAds

`func (o *CatalogsReportDistributionStats) SetIneligibleForAds(v bool)`

SetIneligibleForAds sets IneligibleForAds field to given value.

### HasIneligibleForAds

`func (o *CatalogsReportDistributionStats) HasIneligibleForAds() bool`

HasIneligibleForAds returns a boolean if a field has been set.

### GetIneligibleForOrganic

`func (o *CatalogsReportDistributionStats) GetIneligibleForOrganic() bool`

GetIneligibleForOrganic returns the IneligibleForOrganic field if non-nil, zero value otherwise.

### GetIneligibleForOrganicOk

`func (o *CatalogsReportDistributionStats) GetIneligibleForOrganicOk() (*bool, bool)`

GetIneligibleForOrganicOk returns a tuple with the IneligibleForOrganic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIneligibleForOrganic

`func (o *CatalogsReportDistributionStats) SetIneligibleForOrganic(v bool)`

SetIneligibleForOrganic sets IneligibleForOrganic field to given value.

### HasIneligibleForOrganic

`func (o *CatalogsReportDistributionStats) HasIneligibleForOrganic() bool`

HasIneligibleForOrganic returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


