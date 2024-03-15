# CampaignsAnalyticsResponseInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CAMPAIGN_ID** | **string** | The ID of the campaing that this metrics belongs to. | 
**DATE** | Pointer to **string** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] 

## Methods

### NewCampaignsAnalyticsResponseInner

`func NewCampaignsAnalyticsResponseInner(cAMPAIGNID string, ) *CampaignsAnalyticsResponseInner`

NewCampaignsAnalyticsResponseInner instantiates a new CampaignsAnalyticsResponseInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignsAnalyticsResponseInnerWithDefaults

`func NewCampaignsAnalyticsResponseInnerWithDefaults() *CampaignsAnalyticsResponseInner`

NewCampaignsAnalyticsResponseInnerWithDefaults instantiates a new CampaignsAnalyticsResponseInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCAMPAIGN_ID

`func (o *CampaignsAnalyticsResponseInner) GetCAMPAIGN_ID() string`

GetCAMPAIGN_ID returns the CAMPAIGN_ID field if non-nil, zero value otherwise.

### GetCAMPAIGN_IDOk

`func (o *CampaignsAnalyticsResponseInner) GetCAMPAIGN_IDOk() (*string, bool)`

GetCAMPAIGN_IDOk returns a tuple with the CAMPAIGN_ID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCAMPAIGN_ID

`func (o *CampaignsAnalyticsResponseInner) SetCAMPAIGN_ID(v string)`

SetCAMPAIGN_ID sets CAMPAIGN_ID field to given value.


### GetDATE

`func (o *CampaignsAnalyticsResponseInner) GetDATE() string`

GetDATE returns the DATE field if non-nil, zero value otherwise.

### GetDATEOk

`func (o *CampaignsAnalyticsResponseInner) GetDATEOk() (*string, bool)`

GetDATEOk returns a tuple with the DATE field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDATE

`func (o *CampaignsAnalyticsResponseInner) SetDATE(v string)`

SetDATE sets DATE field to given value.

### HasDATE

`func (o *CampaignsAnalyticsResponseInner) HasDATE() bool`

HasDATE returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


