# ConversionEventsUserDataProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClickId** | Pointer to **NullableString** | The unique identifier stored in _epik cookie on your domain or &amp;epik&#x3D; query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. | [optional] 
**ClientIpAddress** | Pointer to **string** | The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | [optional] 
**ClientUserAgent** | Pointer to **string** | The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. | [optional] 
**Country** | Pointer to **[]string** | Sha256 hashes of two-character ISO-3166 country code indicating the user&#39;s country, in lowercase. The string should be in the UTF-8 format. | [optional] 
**Ct** | Pointer to **[]string** | Sha256 hashes of user&#39;s city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format. | [optional] 
**Db** | Pointer to **[]string** | Sha256 hashes of user&#39;s date of birthday, given as year, month, and day. The string should be in the UTF-8 format. | [optional] 
**Em** | Pointer to **[]string** | Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] 
**ExternalId** | Pointer to **[]string** | Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] 
**Fn** | Pointer to **[]string** | Sha256 hashes of user&#39;s first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] 
**Ge** | Pointer to **[]string** | Sha256 hashes of user&#39;s gender, in lowercase. Either \&quot;f\&quot; or \&quot;m\&quot; or \&quot;n\&quot; for non-binary gender. The string should be in the UTF-8 format. | [optional] 
**HashedMaids** | Pointer to **[]string** | Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] 
**Ln** | Pointer to **[]string** | Sha256 hashes of user&#39;s last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] 
**PartnerId** | Pointer to **NullableString** | A unique identifier of visitors&#39; information defined by third party partners. e.g RampID | [optional] 
**Ph** | Pointer to **[]string** | Sha256 hashes of user&#39;s phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. | [optional] 
**St** | Pointer to **[]string** | Sha256 hashes of user&#39;s state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format. | [optional] 
**Zp** | Pointer to **[]string** | Sha256 hashes of user&#39;s zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format. | [optional] 

## Methods

### NewConversionEventsUserDataProperties

`func NewConversionEventsUserDataProperties() *ConversionEventsUserDataProperties`

NewConversionEventsUserDataProperties instantiates a new ConversionEventsUserDataProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionEventsUserDataPropertiesWithDefaults

`func NewConversionEventsUserDataPropertiesWithDefaults() *ConversionEventsUserDataProperties`

NewConversionEventsUserDataPropertiesWithDefaults instantiates a new ConversionEventsUserDataProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetClickId

`func (o *ConversionEventsUserDataProperties) GetClickId() string`

GetClickId returns the ClickId field if non-nil, zero value otherwise.

### GetClickIdOk

`func (o *ConversionEventsUserDataProperties) GetClickIdOk() (*string, bool)`

GetClickIdOk returns a tuple with the ClickId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClickId

`func (o *ConversionEventsUserDataProperties) SetClickId(v string)`

SetClickId sets ClickId field to given value.

### HasClickId

`func (o *ConversionEventsUserDataProperties) HasClickId() bool`

HasClickId returns a boolean if a field has been set.

### SetClickIdNil

`func (o *ConversionEventsUserDataProperties) SetClickIdNil(b bool)`

 SetClickIdNil sets the value for ClickId to be an explicit nil

### UnsetClickId
`func (o *ConversionEventsUserDataProperties) UnsetClickId()`

UnsetClickId ensures that no value is present for ClickId, not even an explicit nil
### GetClientIpAddress

`func (o *ConversionEventsUserDataProperties) GetClientIpAddress() string`

GetClientIpAddress returns the ClientIpAddress field if non-nil, zero value otherwise.

### GetClientIpAddressOk

`func (o *ConversionEventsUserDataProperties) GetClientIpAddressOk() (*string, bool)`

GetClientIpAddressOk returns a tuple with the ClientIpAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientIpAddress

`func (o *ConversionEventsUserDataProperties) SetClientIpAddress(v string)`

SetClientIpAddress sets ClientIpAddress field to given value.

### HasClientIpAddress

`func (o *ConversionEventsUserDataProperties) HasClientIpAddress() bool`

HasClientIpAddress returns a boolean if a field has been set.

### GetClientUserAgent

`func (o *ConversionEventsUserDataProperties) GetClientUserAgent() string`

GetClientUserAgent returns the ClientUserAgent field if non-nil, zero value otherwise.

### GetClientUserAgentOk

`func (o *ConversionEventsUserDataProperties) GetClientUserAgentOk() (*string, bool)`

GetClientUserAgentOk returns a tuple with the ClientUserAgent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientUserAgent

`func (o *ConversionEventsUserDataProperties) SetClientUserAgent(v string)`

SetClientUserAgent sets ClientUserAgent field to given value.

### HasClientUserAgent

`func (o *ConversionEventsUserDataProperties) HasClientUserAgent() bool`

HasClientUserAgent returns a boolean if a field has been set.

### GetCountry

`func (o *ConversionEventsUserDataProperties) GetCountry() []string`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *ConversionEventsUserDataProperties) GetCountryOk() (*[]string, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *ConversionEventsUserDataProperties) SetCountry(v []string)`

SetCountry sets Country field to given value.

### HasCountry

`func (o *ConversionEventsUserDataProperties) HasCountry() bool`

HasCountry returns a boolean if a field has been set.

### GetCt

`func (o *ConversionEventsUserDataProperties) GetCt() []string`

GetCt returns the Ct field if non-nil, zero value otherwise.

### GetCtOk

`func (o *ConversionEventsUserDataProperties) GetCtOk() (*[]string, bool)`

GetCtOk returns a tuple with the Ct field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCt

`func (o *ConversionEventsUserDataProperties) SetCt(v []string)`

SetCt sets Ct field to given value.

### HasCt

`func (o *ConversionEventsUserDataProperties) HasCt() bool`

HasCt returns a boolean if a field has been set.

### GetDb

`func (o *ConversionEventsUserDataProperties) GetDb() []string`

GetDb returns the Db field if non-nil, zero value otherwise.

### GetDbOk

`func (o *ConversionEventsUserDataProperties) GetDbOk() (*[]string, bool)`

GetDbOk returns a tuple with the Db field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDb

`func (o *ConversionEventsUserDataProperties) SetDb(v []string)`

SetDb sets Db field to given value.

### HasDb

`func (o *ConversionEventsUserDataProperties) HasDb() bool`

HasDb returns a boolean if a field has been set.

### GetEm

`func (o *ConversionEventsUserDataProperties) GetEm() []string`

GetEm returns the Em field if non-nil, zero value otherwise.

### GetEmOk

`func (o *ConversionEventsUserDataProperties) GetEmOk() (*[]string, bool)`

GetEmOk returns a tuple with the Em field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEm

`func (o *ConversionEventsUserDataProperties) SetEm(v []string)`

SetEm sets Em field to given value.

### HasEm

`func (o *ConversionEventsUserDataProperties) HasEm() bool`

HasEm returns a boolean if a field has been set.

### GetExternalId

`func (o *ConversionEventsUserDataProperties) GetExternalId() []string`

GetExternalId returns the ExternalId field if non-nil, zero value otherwise.

### GetExternalIdOk

`func (o *ConversionEventsUserDataProperties) GetExternalIdOk() (*[]string, bool)`

GetExternalIdOk returns a tuple with the ExternalId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalId

`func (o *ConversionEventsUserDataProperties) SetExternalId(v []string)`

SetExternalId sets ExternalId field to given value.

### HasExternalId

`func (o *ConversionEventsUserDataProperties) HasExternalId() bool`

HasExternalId returns a boolean if a field has been set.

### GetFn

`func (o *ConversionEventsUserDataProperties) GetFn() []string`

GetFn returns the Fn field if non-nil, zero value otherwise.

### GetFnOk

`func (o *ConversionEventsUserDataProperties) GetFnOk() (*[]string, bool)`

GetFnOk returns a tuple with the Fn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFn

`func (o *ConversionEventsUserDataProperties) SetFn(v []string)`

SetFn sets Fn field to given value.

### HasFn

`func (o *ConversionEventsUserDataProperties) HasFn() bool`

HasFn returns a boolean if a field has been set.

### GetGe

`func (o *ConversionEventsUserDataProperties) GetGe() []string`

GetGe returns the Ge field if non-nil, zero value otherwise.

### GetGeOk

`func (o *ConversionEventsUserDataProperties) GetGeOk() (*[]string, bool)`

GetGeOk returns a tuple with the Ge field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGe

`func (o *ConversionEventsUserDataProperties) SetGe(v []string)`

SetGe sets Ge field to given value.

### HasGe

`func (o *ConversionEventsUserDataProperties) HasGe() bool`

HasGe returns a boolean if a field has been set.

### GetHashedMaids

`func (o *ConversionEventsUserDataProperties) GetHashedMaids() []string`

GetHashedMaids returns the HashedMaids field if non-nil, zero value otherwise.

### GetHashedMaidsOk

`func (o *ConversionEventsUserDataProperties) GetHashedMaidsOk() (*[]string, bool)`

GetHashedMaidsOk returns a tuple with the HashedMaids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHashedMaids

`func (o *ConversionEventsUserDataProperties) SetHashedMaids(v []string)`

SetHashedMaids sets HashedMaids field to given value.

### HasHashedMaids

`func (o *ConversionEventsUserDataProperties) HasHashedMaids() bool`

HasHashedMaids returns a boolean if a field has been set.

### GetLn

`func (o *ConversionEventsUserDataProperties) GetLn() []string`

GetLn returns the Ln field if non-nil, zero value otherwise.

### GetLnOk

`func (o *ConversionEventsUserDataProperties) GetLnOk() (*[]string, bool)`

GetLnOk returns a tuple with the Ln field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLn

`func (o *ConversionEventsUserDataProperties) SetLn(v []string)`

SetLn sets Ln field to given value.

### HasLn

`func (o *ConversionEventsUserDataProperties) HasLn() bool`

HasLn returns a boolean if a field has been set.

### GetPartnerId

`func (o *ConversionEventsUserDataProperties) GetPartnerId() string`

GetPartnerId returns the PartnerId field if non-nil, zero value otherwise.

### GetPartnerIdOk

`func (o *ConversionEventsUserDataProperties) GetPartnerIdOk() (*string, bool)`

GetPartnerIdOk returns a tuple with the PartnerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerId

`func (o *ConversionEventsUserDataProperties) SetPartnerId(v string)`

SetPartnerId sets PartnerId field to given value.

### HasPartnerId

`func (o *ConversionEventsUserDataProperties) HasPartnerId() bool`

HasPartnerId returns a boolean if a field has been set.

### SetPartnerIdNil

`func (o *ConversionEventsUserDataProperties) SetPartnerIdNil(b bool)`

 SetPartnerIdNil sets the value for PartnerId to be an explicit nil

### UnsetPartnerId
`func (o *ConversionEventsUserDataProperties) UnsetPartnerId()`

UnsetPartnerId ensures that no value is present for PartnerId, not even an explicit nil
### GetPh

`func (o *ConversionEventsUserDataProperties) GetPh() []string`

GetPh returns the Ph field if non-nil, zero value otherwise.

### GetPhOk

`func (o *ConversionEventsUserDataProperties) GetPhOk() (*[]string, bool)`

GetPhOk returns a tuple with the Ph field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPh

`func (o *ConversionEventsUserDataProperties) SetPh(v []string)`

SetPh sets Ph field to given value.

### HasPh

`func (o *ConversionEventsUserDataProperties) HasPh() bool`

HasPh returns a boolean if a field has been set.

### GetSt

`func (o *ConversionEventsUserDataProperties) GetSt() []string`

GetSt returns the St field if non-nil, zero value otherwise.

### GetStOk

`func (o *ConversionEventsUserDataProperties) GetStOk() (*[]string, bool)`

GetStOk returns a tuple with the St field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSt

`func (o *ConversionEventsUserDataProperties) SetSt(v []string)`

SetSt sets St field to given value.

### HasSt

`func (o *ConversionEventsUserDataProperties) HasSt() bool`

HasSt returns a boolean if a field has been set.

### GetZp

`func (o *ConversionEventsUserDataProperties) GetZp() []string`

GetZp returns the Zp field if non-nil, zero value otherwise.

### GetZpOk

`func (o *ConversionEventsUserDataProperties) GetZpOk() (*[]string, bool)`

GetZpOk returns a tuple with the Zp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetZp

`func (o *ConversionEventsUserDataProperties) SetZp(v []string)`

SetZp sets Zp field to given value.

### HasZp

`func (o *ConversionEventsUserDataProperties) HasZp() bool`

HasZp returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


