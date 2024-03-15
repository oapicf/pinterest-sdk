# ConversionEventsUserData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ph** | Pointer to **[]string** | Sha256 hashes of user&#39;s phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. | [optional] 
**Ge** | Pointer to **[]string** | Sha256 hashes of user&#39;s gender, in lowercase. Either \&quot;f\&quot; or \&quot;m\&quot; or \&quot;n\&quot; for non-binary gender. | [optional] 
**Db** | Pointer to **[]string** | Sha256 hashes of user&#39;s date of birthday, given as year, month, and day. | [optional] 
**Ln** | Pointer to **[]string** | Sha256 hashes of user&#39;s last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. | [optional] 
**Fn** | Pointer to **[]string** | Sha256 hashes of user&#39;s first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. | [optional] 
**Ct** | Pointer to **[]string** | Sha256 hashes of user&#39;s city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). | [optional] 
**St** | Pointer to **[]string** | Sha256 hashes of user&#39;s state, given as a two-letter code in lowercase. User residency state (mostly billing). | [optional] 
**Zp** | Pointer to **[]string** | Sha256 hashes of user&#39;s zipcode, only digits. User residency zipcode (mostly billing). | [optional] 
**Country** | Pointer to **[]string** | Sha256 hashes of two-character ISO-3166 country code indicating the user&#39;s country, in lowercase. | [optional] 
**ExternalId** | Pointer to **[]string** | Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. | [optional] 
**ClickId** | Pointer to **NullableString** | The unique identifier stored in _epik cookie on your domain or &amp;epik&#x3D; query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. | [optional] 
**PartnerId** | Pointer to **NullableString** | A unique identifier of visitors&#39; information defined by third party partners. e.g RampID | [optional] 

## Methods

### NewConversionEventsUserData

`func NewConversionEventsUserData() *ConversionEventsUserData`

NewConversionEventsUserData instantiates a new ConversionEventsUserData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionEventsUserDataWithDefaults

`func NewConversionEventsUserDataWithDefaults() *ConversionEventsUserData`

NewConversionEventsUserDataWithDefaults instantiates a new ConversionEventsUserData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPh

`func (o *ConversionEventsUserData) GetPh() []string`

GetPh returns the Ph field if non-nil, zero value otherwise.

### GetPhOk

`func (o *ConversionEventsUserData) GetPhOk() (*[]string, bool)`

GetPhOk returns a tuple with the Ph field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPh

`func (o *ConversionEventsUserData) SetPh(v []string)`

SetPh sets Ph field to given value.

### HasPh

`func (o *ConversionEventsUserData) HasPh() bool`

HasPh returns a boolean if a field has been set.

### GetGe

`func (o *ConversionEventsUserData) GetGe() []string`

GetGe returns the Ge field if non-nil, zero value otherwise.

### GetGeOk

`func (o *ConversionEventsUserData) GetGeOk() (*[]string, bool)`

GetGeOk returns a tuple with the Ge field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGe

`func (o *ConversionEventsUserData) SetGe(v []string)`

SetGe sets Ge field to given value.

### HasGe

`func (o *ConversionEventsUserData) HasGe() bool`

HasGe returns a boolean if a field has been set.

### GetDb

`func (o *ConversionEventsUserData) GetDb() []string`

GetDb returns the Db field if non-nil, zero value otherwise.

### GetDbOk

`func (o *ConversionEventsUserData) GetDbOk() (*[]string, bool)`

GetDbOk returns a tuple with the Db field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDb

`func (o *ConversionEventsUserData) SetDb(v []string)`

SetDb sets Db field to given value.

### HasDb

`func (o *ConversionEventsUserData) HasDb() bool`

HasDb returns a boolean if a field has been set.

### GetLn

`func (o *ConversionEventsUserData) GetLn() []string`

GetLn returns the Ln field if non-nil, zero value otherwise.

### GetLnOk

`func (o *ConversionEventsUserData) GetLnOk() (*[]string, bool)`

GetLnOk returns a tuple with the Ln field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLn

`func (o *ConversionEventsUserData) SetLn(v []string)`

SetLn sets Ln field to given value.

### HasLn

`func (o *ConversionEventsUserData) HasLn() bool`

HasLn returns a boolean if a field has been set.

### GetFn

`func (o *ConversionEventsUserData) GetFn() []string`

GetFn returns the Fn field if non-nil, zero value otherwise.

### GetFnOk

`func (o *ConversionEventsUserData) GetFnOk() (*[]string, bool)`

GetFnOk returns a tuple with the Fn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFn

`func (o *ConversionEventsUserData) SetFn(v []string)`

SetFn sets Fn field to given value.

### HasFn

`func (o *ConversionEventsUserData) HasFn() bool`

HasFn returns a boolean if a field has been set.

### GetCt

`func (o *ConversionEventsUserData) GetCt() []string`

GetCt returns the Ct field if non-nil, zero value otherwise.

### GetCtOk

`func (o *ConversionEventsUserData) GetCtOk() (*[]string, bool)`

GetCtOk returns a tuple with the Ct field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCt

`func (o *ConversionEventsUserData) SetCt(v []string)`

SetCt sets Ct field to given value.

### HasCt

`func (o *ConversionEventsUserData) HasCt() bool`

HasCt returns a boolean if a field has been set.

### GetSt

`func (o *ConversionEventsUserData) GetSt() []string`

GetSt returns the St field if non-nil, zero value otherwise.

### GetStOk

`func (o *ConversionEventsUserData) GetStOk() (*[]string, bool)`

GetStOk returns a tuple with the St field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSt

`func (o *ConversionEventsUserData) SetSt(v []string)`

SetSt sets St field to given value.

### HasSt

`func (o *ConversionEventsUserData) HasSt() bool`

HasSt returns a boolean if a field has been set.

### GetZp

`func (o *ConversionEventsUserData) GetZp() []string`

GetZp returns the Zp field if non-nil, zero value otherwise.

### GetZpOk

`func (o *ConversionEventsUserData) GetZpOk() (*[]string, bool)`

GetZpOk returns a tuple with the Zp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetZp

`func (o *ConversionEventsUserData) SetZp(v []string)`

SetZp sets Zp field to given value.

### HasZp

`func (o *ConversionEventsUserData) HasZp() bool`

HasZp returns a boolean if a field has been set.

### GetCountry

`func (o *ConversionEventsUserData) GetCountry() []string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *ConversionEventsUserData) GetCountryOk() (*[]string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *ConversionEventsUserData) SetCountry(v []string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *ConversionEventsUserData) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetExternalId

`func (o *ConversionEventsUserData) GetExternalId() []string`

GetExternalId returns the ExternalId field if non-nil, zero value otherwise.

### GetExternalIdOk

`func (o *ConversionEventsUserData) GetExternalIdOk() (*[]string, bool)`

GetExternalIdOk returns a tuple with the ExternalId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalId

`func (o *ConversionEventsUserData) SetExternalId(v []string)`

SetExternalId sets ExternalId field to given value.

### HasExternalId

`func (o *ConversionEventsUserData) HasExternalId() bool`

HasExternalId returns a boolean if a field has been set.

### GetClickId

`func (o *ConversionEventsUserData) GetClickId() string`

GetClickId returns the ClickId field if non-nil, zero value otherwise.

### GetClickIdOk

`func (o *ConversionEventsUserData) GetClickIdOk() (*string, bool)`

GetClickIdOk returns a tuple with the ClickId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClickId

`func (o *ConversionEventsUserData) SetClickId(v string)`

SetClickId sets ClickId field to given value.

### HasClickId

`func (o *ConversionEventsUserData) HasClickId() bool`

HasClickId returns a boolean if a field has been set.

### SetClickIdNil

`func (o *ConversionEventsUserData) SetClickIdNil(b bool)`

 SetClickIdNil sets the value for ClickId to be an explicit nil

### UnsetClickId
`func (o *ConversionEventsUserData) UnsetClickId()`

UnsetClickId ensures that no value is present for ClickId, not even an explicit nil
### GetPartnerId

`func (o *ConversionEventsUserData) GetPartnerId() string`

GetPartnerId returns the PartnerId field if non-nil, zero value otherwise.

### GetPartnerIdOk

`func (o *ConversionEventsUserData) GetPartnerIdOk() (*string, bool)`

GetPartnerIdOk returns a tuple with the PartnerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerId

`func (o *ConversionEventsUserData) SetPartnerId(v string)`

SetPartnerId sets PartnerId field to given value.

### HasPartnerId

`func (o *ConversionEventsUserData) HasPartnerId() bool`

HasPartnerId returns a boolean if a field has been set.

### SetPartnerIdNil

`func (o *ConversionEventsUserData) SetPartnerIdNil(b bool)`

 SetPartnerIdNil sets the value for PartnerId to be an explicit nil

### UnsetPartnerId
`func (o *ConversionEventsUserData) UnsetPartnerId()`

UnsetPartnerId ensures that no value is present for PartnerId, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


