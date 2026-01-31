# ConversionHealthSelectionItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ConversionType** | Pointer to **map[string]interface{}** | Status for conversion types | [optional] 
**Criteria** | Pointer to **map[string]interface{}** | Status for criteria | [optional] 
**IngestionSource** | Pointer to **map[string]interface{}** | Status for ingestion sources | [optional] 
**Status** | **interface{}** | Overall status for this selection item | 

## Methods

### NewConversionHealthSelectionItem

`func NewConversionHealthSelectionItem(status interface{}, ) *ConversionHealthSelectionItem`

NewConversionHealthSelectionItem instantiates a new ConversionHealthSelectionItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionHealthSelectionItemWithDefaults

`func NewConversionHealthSelectionItemWithDefaults() *ConversionHealthSelectionItem`

NewConversionHealthSelectionItemWithDefaults instantiates a new ConversionHealthSelectionItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetConversionType

`func (o *ConversionHealthSelectionItem) GetConversionType() map[string]interface{}`

GetConversionType returns the ConversionType field if non-nil, zero value otherwise.

### GetConversionTypeOk

`func (o *ConversionHealthSelectionItem) GetConversionTypeOk() (*map[string]interface{}, bool)`

GetConversionTypeOk returns a tuple with the ConversionType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionType

`func (o *ConversionHealthSelectionItem) SetConversionType(v map[string]interface{})`

SetConversionType sets ConversionType field to given value.

### HasConversionType

`func (o *ConversionHealthSelectionItem) HasConversionType() bool`

HasConversionType returns a boolean if a field has been set.

### GetCriteria

`func (o *ConversionHealthSelectionItem) GetCriteria() map[string]interface{}`

GetCriteria returns the Criteria field if non-nil, zero value otherwise.

### GetCriteriaOk

`func (o *ConversionHealthSelectionItem) GetCriteriaOk() (*map[string]interface{}, bool)`

GetCriteriaOk returns a tuple with the Criteria field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCriteria

`func (o *ConversionHealthSelectionItem) SetCriteria(v map[string]interface{})`

SetCriteria sets Criteria field to given value.

### HasCriteria

`func (o *ConversionHealthSelectionItem) HasCriteria() bool`

HasCriteria returns a boolean if a field has been set.

### GetIngestionSource

`func (o *ConversionHealthSelectionItem) GetIngestionSource() map[string]interface{}`

GetIngestionSource returns the IngestionSource field if non-nil, zero value otherwise.

### GetIngestionSourceOk

`func (o *ConversionHealthSelectionItem) GetIngestionSourceOk() (*map[string]interface{}, bool)`

GetIngestionSourceOk returns a tuple with the IngestionSource field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIngestionSource

`func (o *ConversionHealthSelectionItem) SetIngestionSource(v map[string]interface{})`

SetIngestionSource sets IngestionSource field to given value.

### HasIngestionSource

`func (o *ConversionHealthSelectionItem) HasIngestionSource() bool`

HasIngestionSource returns a boolean if a field has been set.

### GetStatus

`func (o *ConversionHealthSelectionItem) GetStatus() interface{}`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ConversionHealthSelectionItem) GetStatusOk() (*interface{}, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ConversionHealthSelectionItem) SetStatus(v interface{})`

SetStatus sets Status field to given value.


### SetStatusNil

`func (o *ConversionHealthSelectionItem) SetStatusNil(b bool)`

 SetStatusNil sets the value for Status to be an explicit nil

### UnsetStatus
`func (o *ConversionHealthSelectionItem) UnsetStatus()`

UnsetStatus ensures that no value is present for Status, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


