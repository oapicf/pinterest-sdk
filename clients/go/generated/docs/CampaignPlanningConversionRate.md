# CampaignPlanningConversionRate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AttributionWindows** | [**CampaignPlanningConversionAttribution**](CampaignPlanningConversionAttribution.md) |  | 
**ConversionEvent** | [**CampaignPlanningConversionEvent**](CampaignPlanningConversionEvent.md) |  | 
**ConversionRate** | **float32** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads. | 

## Methods

### NewCampaignPlanningConversionRate

`func NewCampaignPlanningConversionRate(attributionWindows CampaignPlanningConversionAttribution, conversionEvent CampaignPlanningConversionEvent, conversionRate float32, ) *CampaignPlanningConversionRate`

NewCampaignPlanningConversionRate instantiates a new CampaignPlanningConversionRate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignPlanningConversionRateWithDefaults

`func NewCampaignPlanningConversionRateWithDefaults() *CampaignPlanningConversionRate`

NewCampaignPlanningConversionRateWithDefaults instantiates a new CampaignPlanningConversionRate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttributionWindows

`func (o *CampaignPlanningConversionRate) GetAttributionWindows() CampaignPlanningConversionAttribution`

GetAttributionWindows returns the AttributionWindows field if non-nil, zero value otherwise.

### GetAttributionWindowsOk

`func (o *CampaignPlanningConversionRate) GetAttributionWindowsOk() (*CampaignPlanningConversionAttribution, bool)`

GetAttributionWindowsOk returns a tuple with the AttributionWindows field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributionWindows

`func (o *CampaignPlanningConversionRate) SetAttributionWindows(v CampaignPlanningConversionAttribution)`

SetAttributionWindows sets AttributionWindows field to given value.


### GetConversionEvent

`func (o *CampaignPlanningConversionRate) GetConversionEvent() CampaignPlanningConversionEvent`

GetConversionEvent returns the ConversionEvent field if non-nil, zero value otherwise.

### GetConversionEventOk

`func (o *CampaignPlanningConversionRate) GetConversionEventOk() (*CampaignPlanningConversionEvent, bool)`

GetConversionEventOk returns a tuple with the ConversionEvent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionEvent

`func (o *CampaignPlanningConversionRate) SetConversionEvent(v CampaignPlanningConversionEvent)`

SetConversionEvent sets ConversionEvent field to given value.


### GetConversionRate

`func (o *CampaignPlanningConversionRate) GetConversionRate() float32`

GetConversionRate returns the ConversionRate field if non-nil, zero value otherwise.

### GetConversionRateOk

`func (o *CampaignPlanningConversionRate) GetConversionRateOk() (*float32, bool)`

GetConversionRateOk returns a tuple with the ConversionRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversionRate

`func (o *CampaignPlanningConversionRate) SetConversionRate(v float32)`

SetConversionRate sets ConversionRate field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


