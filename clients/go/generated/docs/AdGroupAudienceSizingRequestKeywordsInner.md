# AdGroupAudienceSizingRequestKeywordsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MatchType** | [**NullableMatchTypeResponse**](MatchTypeResponse.md) |  | 
**Value** | **string** | Keyword value (120 chars max). | 

## Methods

### NewAdGroupAudienceSizingRequestKeywordsInner

`func NewAdGroupAudienceSizingRequestKeywordsInner(matchType NullableMatchTypeResponse, value string, ) *AdGroupAudienceSizingRequestKeywordsInner`

NewAdGroupAudienceSizingRequestKeywordsInner instantiates a new AdGroupAudienceSizingRequestKeywordsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdGroupAudienceSizingRequestKeywordsInnerWithDefaults

`func NewAdGroupAudienceSizingRequestKeywordsInnerWithDefaults() *AdGroupAudienceSizingRequestKeywordsInner`

NewAdGroupAudienceSizingRequestKeywordsInnerWithDefaults instantiates a new AdGroupAudienceSizingRequestKeywordsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMatchType

`func (o *AdGroupAudienceSizingRequestKeywordsInner) GetMatchType() MatchTypeResponse`

GetMatchType returns the MatchType field if non-nil, zero value otherwise.

### GetMatchTypeOk

`func (o *AdGroupAudienceSizingRequestKeywordsInner) GetMatchTypeOk() (*MatchTypeResponse, bool)`

GetMatchTypeOk returns a tuple with the MatchType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMatchType

`func (o *AdGroupAudienceSizingRequestKeywordsInner) SetMatchType(v MatchTypeResponse)`

SetMatchType sets MatchType field to given value.


### SetMatchTypeNil

`func (o *AdGroupAudienceSizingRequestKeywordsInner) SetMatchTypeNil(b bool)`

 SetMatchTypeNil sets the value for MatchType to be an explicit nil

### UnsetMatchType
`func (o *AdGroupAudienceSizingRequestKeywordsInner) UnsetMatchType()`

UnsetMatchType ensures that no value is present for MatchType, not even an explicit nil
### GetValue

`func (o *AdGroupAudienceSizingRequestKeywordsInner) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *AdGroupAudienceSizingRequestKeywordsInner) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *AdGroupAudienceSizingRequestKeywordsInner) SetValue(v string)`

SetValue sets Value field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


