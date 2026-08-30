# AdsCreditRedeemCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferCodeHash** | **string** | Takes in a SHA256 hash of the offerCode. | 
**ValidateOnly** | **bool** | If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account | 

## Methods

### NewAdsCreditRedeemCreate

`func NewAdsCreditRedeemCreate(offerCodeHash string, validateOnly bool, ) *AdsCreditRedeemCreate`

NewAdsCreditRedeemCreate instantiates a new AdsCreditRedeemCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdsCreditRedeemCreateWithDefaults

`func NewAdsCreditRedeemCreateWithDefaults() *AdsCreditRedeemCreate`

NewAdsCreditRedeemCreateWithDefaults instantiates a new AdsCreditRedeemCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOfferCodeHash

`func (o *AdsCreditRedeemCreate) GetOfferCodeHash() string`

GetOfferCodeHash returns the OfferCodeHash field if non-nil, zero value otherwise.

### GetOfferCodeHashOk

`func (o *AdsCreditRedeemCreate) GetOfferCodeHashOk() (*string, bool)`

GetOfferCodeHashOk returns a tuple with the OfferCodeHash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfferCodeHash

`func (o *AdsCreditRedeemCreate) SetOfferCodeHash(v string)`

SetOfferCodeHash sets OfferCodeHash field to given value.


### GetValidateOnly

`func (o *AdsCreditRedeemCreate) GetValidateOnly() bool`

GetValidateOnly returns the ValidateOnly field if non-nil, zero value otherwise.

### GetValidateOnlyOk

`func (o *AdsCreditRedeemCreate) GetValidateOnlyOk() (*bool, bool)`

GetValidateOnlyOk returns a tuple with the ValidateOnly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidateOnly

`func (o *AdsCreditRedeemCreate) SetValidateOnly(v bool)`

SetValidateOnly sets ValidateOnly field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


