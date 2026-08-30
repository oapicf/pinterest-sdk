# AdAccountCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | Pointer to [**Country**](Country.md) |  | [optional] 
**Currency** | Pointer to [**Currency**](Currency.md) |  | [optional] 
**Name** | Pointer to **string** | Ad account name. | [optional] 
**OwnerUserId** | Pointer to **string** | Advertiser&#39;s owning user ID. | [optional] 
**TimeZone** | Pointer to **string** | The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. | [optional] 

## Methods

### NewAdAccountCreate

`func NewAdAccountCreate() *AdAccountCreate`

NewAdAccountCreate instantiates a new AdAccountCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdAccountCreateWithDefaults

`func NewAdAccountCreateWithDefaults() *AdAccountCreate`

NewAdAccountCreateWithDefaults instantiates a new AdAccountCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCountry

`func (o *AdAccountCreate) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *AdAccountCreate) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *AdAccountCreate) SetCountry(v Country)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *AdAccountCreate) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetCurrency

`func (o *AdAccountCreate) GetCurrency() Currency`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *AdAccountCreate) GetCurrencyOk() (*Currency, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *AdAccountCreate) SetCurrency(v Currency)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *AdAccountCreate) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetName

`func (o *AdAccountCreate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AdAccountCreate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AdAccountCreate) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *AdAccountCreate) HasName() bool`

HasName returns a boolean if a field has been set.

### GetOwnerUserId

`func (o *AdAccountCreate) GetOwnerUserId() string`

GetOwnerUserId returns the OwnerUserId field if non-nil, zero value otherwise.

### GetOwnerUserIdOk

`func (o *AdAccountCreate) GetOwnerUserIdOk() (*string, bool)`

GetOwnerUserIdOk returns a tuple with the OwnerUserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOwnerUserId

`func (o *AdAccountCreate) SetOwnerUserId(v string)`

SetOwnerUserId sets OwnerUserId field to given value.

### HasOwnerUserId

`func (o *AdAccountCreate) HasOwnerUserId() bool`

HasOwnerUserId returns a boolean if a field has been set.

### GetTimeZone

`func (o *AdAccountCreate) GetTimeZone() string`

GetTimeZone returns the TimeZone field if non-nil, zero value otherwise.

### GetTimeZoneOk

`func (o *AdAccountCreate) GetTimeZoneOk() (*string, bool)`

GetTimeZoneOk returns a tuple with the TimeZone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeZone

`func (o *AdAccountCreate) SetTimeZone(v string)`

SetTimeZone sets TimeZone field to given value.

### HasTimeZone

`func (o *AdAccountCreate) HasTimeZone() bool`

HasTimeZone returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


