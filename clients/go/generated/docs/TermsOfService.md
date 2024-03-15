# TermsOfService

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | The ID of the terms of service | [optional] 
**Html** | Pointer to **NullableString** | The terms of service content | [optional] 
**HasAccepted** | Pointer to **bool** | Whether the ad account has accepted terms of service. | [optional] 
**AdAccountId** | Pointer to **string** | The ID of the ad account. | [optional] 

## Methods

### NewTermsOfService

`func NewTermsOfService() *TermsOfService`

NewTermsOfService instantiates a new TermsOfService object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTermsOfServiceWithDefaults

`func NewTermsOfServiceWithDefaults() *TermsOfService`

NewTermsOfServiceWithDefaults instantiates a new TermsOfService object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *TermsOfService) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *TermsOfService) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *TermsOfService) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *TermsOfService) HasId() bool`

HasId returns a boolean if a field has been set.

### GetHtml

`func (o *TermsOfService) GetHtml() string`

GetHtml returns the Html field if non-nil, zero value otherwise.

### GetHtmlOk

`func (o *TermsOfService) GetHtmlOk() (*string, bool)`

GetHtmlOk returns a tuple with the Html field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHtml

`func (o *TermsOfService) SetHtml(v string)`

SetHtml sets Html field to given value.

### HasHtml

`func (o *TermsOfService) HasHtml() bool`

HasHtml returns a boolean if a field has been set.

### SetHtmlNil

`func (o *TermsOfService) SetHtmlNil(b bool)`

 SetHtmlNil sets the value for Html to be an explicit nil

### UnsetHtml
`func (o *TermsOfService) UnsetHtml()`

UnsetHtml ensures that no value is present for Html, not even an explicit nil
### GetHasAccepted

`func (o *TermsOfService) GetHasAccepted() bool`

GetHasAccepted returns the HasAccepted field if non-nil, zero value otherwise.

### GetHasAcceptedOk

`func (o *TermsOfService) GetHasAcceptedOk() (*bool, bool)`

GetHasAcceptedOk returns a tuple with the HasAccepted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasAccepted

`func (o *TermsOfService) SetHasAccepted(v bool)`

SetHasAccepted sets HasAccepted field to given value.

### HasHasAccepted

`func (o *TermsOfService) HasHasAccepted() bool`

HasHasAccepted returns a boolean if a field has been set.

### GetAdAccountId

`func (o *TermsOfService) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *TermsOfService) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *TermsOfService) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *TermsOfService) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


