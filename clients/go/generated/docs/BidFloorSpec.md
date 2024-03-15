# BidFloorSpec

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Countries** | Pointer to [**[]Country**](Country.md) |  | [optional] 
**Currency** | [**Currency**](Currency.md) |  | 
**ObjectiveType** | Pointer to [**ObjectiveType**](ObjectiveType.md) |  | [optional] 
**BillableEvent** | [**ActionType**](ActionType.md) |  | 
**OptimizationGoalMetadata** | Pointer to [**OptimizationGoalMetadata**](OptimizationGoalMetadata.md) |  | [optional] 
**CreativeType** | Pointer to [**CreativeType**](CreativeType.md) |  | [optional] 

## Methods

### NewBidFloorSpec

`func NewBidFloorSpec(currency Currency, billableEvent ActionType, ) *BidFloorSpec`

NewBidFloorSpec instantiates a new BidFloorSpec object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBidFloorSpecWithDefaults

`func NewBidFloorSpecWithDefaults() *BidFloorSpec`

NewBidFloorSpecWithDefaults instantiates a new BidFloorSpec object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCountries

`func (o *BidFloorSpec) GetCountries() []Country`

GetCountries returns the Countries field if non-nil, zero value otherwise.

### GetCountriesOk

`func (o *BidFloorSpec) GetCountriesOk() (*[]Country, bool)`

GetCountriesOk returns a tuple with the Countries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountries

`func (o *BidFloorSpec) SetCountries(v []Country)`

SetCountries sets Countries field to given value.

### HasCountries

`func (o *BidFloorSpec) HasCountries() bool`

HasCountries returns a boolean if a field has been set.

### GetCurrency

`func (o *BidFloorSpec) GetCurrency() Currency`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *BidFloorSpec) GetCurrencyOk() (*Currency, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *BidFloorSpec) SetCurrency(v Currency)`

SetCurrency sets Currency field to given value.


### GetObjectiveType

`func (o *BidFloorSpec) GetObjectiveType() ObjectiveType`

GetObjectiveType returns the ObjectiveType field if non-nil, zero value otherwise.

### GetObjectiveTypeOk

`func (o *BidFloorSpec) GetObjectiveTypeOk() (*ObjectiveType, bool)`

GetObjectiveTypeOk returns a tuple with the ObjectiveType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObjectiveType

`func (o *BidFloorSpec) SetObjectiveType(v ObjectiveType)`

SetObjectiveType sets ObjectiveType field to given value.

### HasObjectiveType

`func (o *BidFloorSpec) HasObjectiveType() bool`

HasObjectiveType returns a boolean if a field has been set.

### GetBillableEvent

`func (o *BidFloorSpec) GetBillableEvent() ActionType`

GetBillableEvent returns the BillableEvent field if non-nil, zero value otherwise.

### GetBillableEventOk

`func (o *BidFloorSpec) GetBillableEventOk() (*ActionType, bool)`

GetBillableEventOk returns a tuple with the BillableEvent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillableEvent

`func (o *BidFloorSpec) SetBillableEvent(v ActionType)`

SetBillableEvent sets BillableEvent field to given value.


### GetOptimizationGoalMetadata

`func (o *BidFloorSpec) GetOptimizationGoalMetadata() OptimizationGoalMetadata`

GetOptimizationGoalMetadata returns the OptimizationGoalMetadata field if non-nil, zero value otherwise.

### GetOptimizationGoalMetadataOk

`func (o *BidFloorSpec) GetOptimizationGoalMetadataOk() (*OptimizationGoalMetadata, bool)`

GetOptimizationGoalMetadataOk returns a tuple with the OptimizationGoalMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptimizationGoalMetadata

`func (o *BidFloorSpec) SetOptimizationGoalMetadata(v OptimizationGoalMetadata)`

SetOptimizationGoalMetadata sets OptimizationGoalMetadata field to given value.

### HasOptimizationGoalMetadata

`func (o *BidFloorSpec) HasOptimizationGoalMetadata() bool`

HasOptimizationGoalMetadata returns a boolean if a field has been set.

### GetCreativeType

`func (o *BidFloorSpec) GetCreativeType() CreativeType`

GetCreativeType returns the CreativeType field if non-nil, zero value otherwise.

### GetCreativeTypeOk

`func (o *BidFloorSpec) GetCreativeTypeOk() (*CreativeType, bool)`

GetCreativeTypeOk returns a tuple with the CreativeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeType

`func (o *BidFloorSpec) SetCreativeType(v CreativeType)`

SetCreativeType sets CreativeType field to given value.

### HasCreativeType

`func (o *BidFloorSpec) HasCreativeType() bool`

HasCreativeType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


