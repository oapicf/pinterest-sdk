# BillingProfilesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdvertiserId** | Pointer to **string** | Advertiser ID of the billing. | [optional] 
**BillingType** | Pointer to [**BillingType**](BillingType.md) | Billing type of the advertiser | [optional] 
**CardType** | Pointer to [**BillingProfileCardType**](BillingProfileCardType.md) | Type of the card. | [optional] 
**Id** | Pointer to **string** | Billing ID. | [optional] 
**PaymentMethodBrand** | Pointer to [**BillingProfilePaymentMethodBrand**](BillingProfilePaymentMethodBrand.md) | Brand of the payment method. | [optional] 
**Status** | Pointer to [**BillingProfileStatus**](BillingProfileStatus.md) | Status of the billing. | [optional] 

## Methods

### NewBillingProfilesResponse

`func NewBillingProfilesResponse() *BillingProfilesResponse`

NewBillingProfilesResponse instantiates a new BillingProfilesResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBillingProfilesResponseWithDefaults

`func NewBillingProfilesResponseWithDefaults() *BillingProfilesResponse`

NewBillingProfilesResponseWithDefaults instantiates a new BillingProfilesResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdvertiserId

`func (o *BillingProfilesResponse) GetAdvertiserId() string`

GetAdvertiserId returns the AdvertiserId field if non-nil, zero value otherwise.

### GetAdvertiserIdOk

`func (o *BillingProfilesResponse) GetAdvertiserIdOk() (*string, bool)`

GetAdvertiserIdOk returns a tuple with the AdvertiserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdvertiserId

`func (o *BillingProfilesResponse) SetAdvertiserId(v string)`

SetAdvertiserId sets AdvertiserId field to given value.

### HasAdvertiserId

`func (o *BillingProfilesResponse) HasAdvertiserId() bool`

HasAdvertiserId returns a boolean if a field has been set.

### GetBillingType

`func (o *BillingProfilesResponse) GetBillingType() BillingType`

GetBillingType returns the BillingType field if non-nil, zero value otherwise.

### GetBillingTypeOk

`func (o *BillingProfilesResponse) GetBillingTypeOk() (*BillingType, bool)`

GetBillingTypeOk returns a tuple with the BillingType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillingType

`func (o *BillingProfilesResponse) SetBillingType(v BillingType)`

SetBillingType sets BillingType field to given value.

### HasBillingType

`func (o *BillingProfilesResponse) HasBillingType() bool`

HasBillingType returns a boolean if a field has been set.

### GetCardType

`func (o *BillingProfilesResponse) GetCardType() BillingProfileCardType`

GetCardType returns the CardType field if non-nil, zero value otherwise.

### GetCardTypeOk

`func (o *BillingProfilesResponse) GetCardTypeOk() (*BillingProfileCardType, bool)`

GetCardTypeOk returns a tuple with the CardType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCardType

`func (o *BillingProfilesResponse) SetCardType(v BillingProfileCardType)`

SetCardType sets CardType field to given value.

### HasCardType

`func (o *BillingProfilesResponse) HasCardType() bool`

HasCardType returns a boolean if a field has been set.

### GetId

`func (o *BillingProfilesResponse) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *BillingProfilesResponse) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *BillingProfilesResponse) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *BillingProfilesResponse) HasId() bool`

HasId returns a boolean if a field has been set.

### GetPaymentMethodBrand

`func (o *BillingProfilesResponse) GetPaymentMethodBrand() BillingProfilePaymentMethodBrand`

GetPaymentMethodBrand returns the PaymentMethodBrand field if non-nil, zero value otherwise.

### GetPaymentMethodBrandOk

`func (o *BillingProfilesResponse) GetPaymentMethodBrandOk() (*BillingProfilePaymentMethodBrand, bool)`

GetPaymentMethodBrandOk returns a tuple with the PaymentMethodBrand field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaymentMethodBrand

`func (o *BillingProfilesResponse) SetPaymentMethodBrand(v BillingProfilePaymentMethodBrand)`

SetPaymentMethodBrand sets PaymentMethodBrand field to given value.

### HasPaymentMethodBrand

`func (o *BillingProfilesResponse) HasPaymentMethodBrand() bool`

HasPaymentMethodBrand returns a boolean if a field has been set.

### GetStatus

`func (o *BillingProfilesResponse) GetStatus() BillingProfileStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *BillingProfilesResponse) GetStatusOk() (*BillingProfileStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *BillingProfilesResponse) SetStatus(v BillingProfileStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *BillingProfilesResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


