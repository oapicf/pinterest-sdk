# AdGroupAudienceSizingResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceSizeLowerBound** | Pointer to **float32** | The lower confidence bound of the estimated potential audience size. \&quot;Potential audience size\&quot; estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. | [optional] 
**AudienceSizeUpperBound** | Pointer to **float32** | The upper confidence bound of the estimated potential audience size. \&quot;Potential audience size\&quot; estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments. | [optional] 

## Methods

### NewAdGroupAudienceSizingResponse

`func NewAdGroupAudienceSizingResponse() *AdGroupAudienceSizingResponse`

NewAdGroupAudienceSizingResponse instantiates a new AdGroupAudienceSizingResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdGroupAudienceSizingResponseWithDefaults

`func NewAdGroupAudienceSizingResponseWithDefaults() *AdGroupAudienceSizingResponse`

NewAdGroupAudienceSizingResponseWithDefaults instantiates a new AdGroupAudienceSizingResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAudienceSizeLowerBound

`func (o *AdGroupAudienceSizingResponse) GetAudienceSizeLowerBound() float32`

GetAudienceSizeLowerBound returns the AudienceSizeLowerBound field if non-nil, zero value otherwise.

### GetAudienceSizeLowerBoundOk

`func (o *AdGroupAudienceSizingResponse) GetAudienceSizeLowerBoundOk() (*float32, bool)`

GetAudienceSizeLowerBoundOk returns a tuple with the AudienceSizeLowerBound field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudienceSizeLowerBound

`func (o *AdGroupAudienceSizingResponse) SetAudienceSizeLowerBound(v float32)`

SetAudienceSizeLowerBound sets AudienceSizeLowerBound field to given value.

### HasAudienceSizeLowerBound

`func (o *AdGroupAudienceSizingResponse) HasAudienceSizeLowerBound() bool`

HasAudienceSizeLowerBound returns a boolean if a field has been set.

### GetAudienceSizeUpperBound

`func (o *AdGroupAudienceSizingResponse) GetAudienceSizeUpperBound() float32`

GetAudienceSizeUpperBound returns the AudienceSizeUpperBound field if non-nil, zero value otherwise.

### GetAudienceSizeUpperBoundOk

`func (o *AdGroupAudienceSizingResponse) GetAudienceSizeUpperBoundOk() (*float32, bool)`

GetAudienceSizeUpperBoundOk returns a tuple with the AudienceSizeUpperBound field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudienceSizeUpperBound

`func (o *AdGroupAudienceSizingResponse) SetAudienceSizeUpperBound(v float32)`

SetAudienceSizeUpperBound sets AudienceSizeUpperBound field to given value.

### HasAudienceSizeUpperBound

`func (o *AdGroupAudienceSizingResponse) HasAudienceSizeUpperBound() bool`

HasAudienceSizeUpperBound returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


