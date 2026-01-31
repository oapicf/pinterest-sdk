# EventQualityScore

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IngestionSource** | [**IngestionSourceOptions**](IngestionSourceOptions.md) |  | 
**LookbackPeriod** | [**LookbackPeriodOptions**](LookbackPeriodOptions.md) |  | 
**OverallStatus** | [**OverallStatusOptions**](OverallStatusOptions.md) |  | 
**QualityComponents** | [**QualityComponents**](QualityComponents.md) |  | 
**SourcePlatform** | [**SourcePlatformOptions**](SourcePlatformOptions.md) |  | 

## Methods

### NewEventQualityScore

`func NewEventQualityScore(ingestionSource IngestionSourceOptions, lookbackPeriod LookbackPeriodOptions, overallStatus OverallStatusOptions, qualityComponents QualityComponents, sourcePlatform SourcePlatformOptions, ) *EventQualityScore`

NewEventQualityScore instantiates a new EventQualityScore object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEventQualityScoreWithDefaults

`func NewEventQualityScoreWithDefaults() *EventQualityScore`

NewEventQualityScoreWithDefaults instantiates a new EventQualityScore object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIngestionSource

`func (o *EventQualityScore) GetIngestionSource() IngestionSourceOptions`

GetIngestionSource returns the IngestionSource field if non-nil, zero value otherwise.

### GetIngestionSourceOk

`func (o *EventQualityScore) GetIngestionSourceOk() (*IngestionSourceOptions, bool)`

GetIngestionSourceOk returns a tuple with the IngestionSource field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIngestionSource

`func (o *EventQualityScore) SetIngestionSource(v IngestionSourceOptions)`

SetIngestionSource sets IngestionSource field to given value.


### GetLookbackPeriod

`func (o *EventQualityScore) GetLookbackPeriod() LookbackPeriodOptions`

GetLookbackPeriod returns the LookbackPeriod field if non-nil, zero value otherwise.

### GetLookbackPeriodOk

`func (o *EventQualityScore) GetLookbackPeriodOk() (*LookbackPeriodOptions, bool)`

GetLookbackPeriodOk returns a tuple with the LookbackPeriod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLookbackPeriod

`func (o *EventQualityScore) SetLookbackPeriod(v LookbackPeriodOptions)`

SetLookbackPeriod sets LookbackPeriod field to given value.


### GetOverallStatus

`func (o *EventQualityScore) GetOverallStatus() OverallStatusOptions`

GetOverallStatus returns the OverallStatus field if non-nil, zero value otherwise.

### GetOverallStatusOk

`func (o *EventQualityScore) GetOverallStatusOk() (*OverallStatusOptions, bool)`

GetOverallStatusOk returns a tuple with the OverallStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverallStatus

`func (o *EventQualityScore) SetOverallStatus(v OverallStatusOptions)`

SetOverallStatus sets OverallStatus field to given value.


### GetQualityComponents

`func (o *EventQualityScore) GetQualityComponents() QualityComponents`

GetQualityComponents returns the QualityComponents field if non-nil, zero value otherwise.

### GetQualityComponentsOk

`func (o *EventQualityScore) GetQualityComponentsOk() (*QualityComponents, bool)`

GetQualityComponentsOk returns a tuple with the QualityComponents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQualityComponents

`func (o *EventQualityScore) SetQualityComponents(v QualityComponents)`

SetQualityComponents sets QualityComponents field to given value.


### GetSourcePlatform

`func (o *EventQualityScore) GetSourcePlatform() SourcePlatformOptions`

GetSourcePlatform returns the SourcePlatform field if non-nil, zero value otherwise.

### GetSourcePlatformOk

`func (o *EventQualityScore) GetSourcePlatformOk() (*SourcePlatformOptions, bool)`

GetSourcePlatformOk returns a tuple with the SourcePlatform field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourcePlatform

`func (o *EventQualityScore) SetSourcePlatform(v SourcePlatformOptions)`

SetSourcePlatform sets SourcePlatform field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


