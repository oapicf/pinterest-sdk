# AdResponseAllOf1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | Pointer to **string** | The ID of the advertiser that this ad belongs to. | [optional] 
**CampaignId** | Pointer to **string** | ID of the ad campaign that contains this ad. | [optional] 
**CollectionItemsDestinationUrlTemplate** | Pointer to **NullableString** | Destination URL template for all items within a collections drawer. | [optional] 
**CreatedTime** | Pointer to **int32** | Pin creation time. Unix timestamp in seconds. | [optional] 
**Id** | Pointer to **string** | The ID of this ad. | [optional] 
**RejectedReasons** | Pointer to **[]string** | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**RejectionLabels** | Pointer to **[]string** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**ReviewStatus** | Pointer to **string** | Ad review status | [optional] 
**Type** | Pointer to **string** | Always \&quot;ad\&quot;. | [optional] 
**UpdatedTime** | Pointer to **int32** | Last update time. Unix timestamp in seconds. | [optional] 
**SummaryStatus** | Pointer to [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [optional] 

## Methods

### NewAdResponseAllOf1

`func NewAdResponseAllOf1() *AdResponseAllOf1`

NewAdResponseAllOf1 instantiates a new AdResponseAllOf1 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdResponseAllOf1WithDefaults

`func NewAdResponseAllOf1WithDefaults() *AdResponseAllOf1`

NewAdResponseAllOf1WithDefaults instantiates a new AdResponseAllOf1 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *AdResponseAllOf1) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *AdResponseAllOf1) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *AdResponseAllOf1) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *AdResponseAllOf1) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetCampaignId

`func (o *AdResponseAllOf1) GetCampaignId() string`

GetCampaignId returns the CampaignId field if non-nil, zero value otherwise.

### GetCampaignIdOk

`func (o *AdResponseAllOf1) GetCampaignIdOk() (*string, bool)`

GetCampaignIdOk returns a tuple with the CampaignId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignId

`func (o *AdResponseAllOf1) SetCampaignId(v string)`

SetCampaignId sets CampaignId field to given value.

### HasCampaignId

`func (o *AdResponseAllOf1) HasCampaignId() bool`

HasCampaignId returns a boolean if a field has been set.

### GetCollectionItemsDestinationUrlTemplate

`func (o *AdResponseAllOf1) GetCollectionItemsDestinationUrlTemplate() string`

GetCollectionItemsDestinationUrlTemplate returns the CollectionItemsDestinationUrlTemplate field if non-nil, zero value otherwise.

### GetCollectionItemsDestinationUrlTemplateOk

`func (o *AdResponseAllOf1) GetCollectionItemsDestinationUrlTemplateOk() (*string, bool)`

GetCollectionItemsDestinationUrlTemplateOk returns a tuple with the CollectionItemsDestinationUrlTemplate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCollectionItemsDestinationUrlTemplate

`func (o *AdResponseAllOf1) SetCollectionItemsDestinationUrlTemplate(v string)`

SetCollectionItemsDestinationUrlTemplate sets CollectionItemsDestinationUrlTemplate field to given value.

### HasCollectionItemsDestinationUrlTemplate

`func (o *AdResponseAllOf1) HasCollectionItemsDestinationUrlTemplate() bool`

HasCollectionItemsDestinationUrlTemplate returns a boolean if a field has been set.

### SetCollectionItemsDestinationUrlTemplateNil

`func (o *AdResponseAllOf1) SetCollectionItemsDestinationUrlTemplateNil(b bool)`

 SetCollectionItemsDestinationUrlTemplateNil sets the value for CollectionItemsDestinationUrlTemplate to be an explicit nil

### UnsetCollectionItemsDestinationUrlTemplate
`func (o *AdResponseAllOf1) UnsetCollectionItemsDestinationUrlTemplate()`

UnsetCollectionItemsDestinationUrlTemplate ensures that no value is present for CollectionItemsDestinationUrlTemplate, not even an explicit nil
### GetCreatedTime

`func (o *AdResponseAllOf1) GetCreatedTime() int32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *AdResponseAllOf1) GetCreatedTimeOk() (*int32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *AdResponseAllOf1) SetCreatedTime(v int32)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *AdResponseAllOf1) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### GetId

`func (o *AdResponseAllOf1) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AdResponseAllOf1) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AdResponseAllOf1) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *AdResponseAllOf1) HasId() bool`

HasId returns a boolean if a field has been set.

### GetRejectedReasons

`func (o *AdResponseAllOf1) GetRejectedReasons() []string`

GetRejectedReasons returns the RejectedReasons field if non-nil, zero value otherwise.

### GetRejectedReasonsOk

`func (o *AdResponseAllOf1) GetRejectedReasonsOk() (*[]string, bool)`

GetRejectedReasonsOk returns a tuple with the RejectedReasons field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRejectedReasons

`func (o *AdResponseAllOf1) SetRejectedReasons(v []string)`

SetRejectedReasons sets RejectedReasons field to given value.

### HasRejectedReasons

`func (o *AdResponseAllOf1) HasRejectedReasons() bool`

HasRejectedReasons returns a boolean if a field has been set.

### GetRejectionLabels

`func (o *AdResponseAllOf1) GetRejectionLabels() []string`

GetRejectionLabels returns the RejectionLabels field if non-nil, zero value otherwise.

### GetRejectionLabelsOk

`func (o *AdResponseAllOf1) GetRejectionLabelsOk() (*[]string, bool)`

GetRejectionLabelsOk returns a tuple with the RejectionLabels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRejectionLabels

`func (o *AdResponseAllOf1) SetRejectionLabels(v []string)`

SetRejectionLabels sets RejectionLabels field to given value.

### HasRejectionLabels

`func (o *AdResponseAllOf1) HasRejectionLabels() bool`

HasRejectionLabels returns a boolean if a field has been set.

### GetReviewStatus

`func (o *AdResponseAllOf1) GetReviewStatus() string`

GetReviewStatus returns the ReviewStatus field if non-nil, zero value otherwise.

### GetReviewStatusOk

`func (o *AdResponseAllOf1) GetReviewStatusOk() (*string, bool)`

GetReviewStatusOk returns a tuple with the ReviewStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReviewStatus

`func (o *AdResponseAllOf1) SetReviewStatus(v string)`

SetReviewStatus sets ReviewStatus field to given value.

### HasReviewStatus

`func (o *AdResponseAllOf1) HasReviewStatus() bool`

HasReviewStatus returns a boolean if a field has been set.

### GetType

`func (o *AdResponseAllOf1) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *AdResponseAllOf1) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *AdResponseAllOf1) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *AdResponseAllOf1) HasType() bool`

HasType returns a boolean if a field has been set.

### GetUpdatedTime

`func (o *AdResponseAllOf1) GetUpdatedTime() int32`

GetUpdatedTime returns the UpdatedTime field if non-nil, zero value otherwise.

### GetUpdatedTimeOk

`func (o *AdResponseAllOf1) GetUpdatedTimeOk() (*int32, bool)`

GetUpdatedTimeOk returns a tuple with the UpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTime

`func (o *AdResponseAllOf1) SetUpdatedTime(v int32)`

SetUpdatedTime sets UpdatedTime field to given value.

### HasUpdatedTime

`func (o *AdResponseAllOf1) HasUpdatedTime() bool`

HasUpdatedTime returns a boolean if a field has been set.

### GetSummaryStatus

`func (o *AdResponseAllOf1) GetSummaryStatus() PinPromotionSummaryStatus`

GetSummaryStatus returns the SummaryStatus field if non-nil, zero value otherwise.

### GetSummaryStatusOk

`func (o *AdResponseAllOf1) GetSummaryStatusOk() (*PinPromotionSummaryStatus, bool)`

GetSummaryStatusOk returns a tuple with the SummaryStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummaryStatus

`func (o *AdResponseAllOf1) SetSummaryStatus(v PinPromotionSummaryStatus)`

SetSummaryStatus sets SummaryStatus field to given value.

### HasSummaryStatus

`func (o *AdResponseAllOf1) HasSummaryStatus() bool`

HasSummaryStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


