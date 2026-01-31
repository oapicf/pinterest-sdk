# QualityComponents

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdvertiserExternalId** | Pointer to [**map[string]QualityComponentDetails**](QualityComponentDetails.md) |  | [optional] 
**ClickIdEpik** | Pointer to [**map[string]QualityComponentDetails**](QualityComponentDetails.md) |  | [optional] 
**ExternalEventId** | Pointer to [**map[string]QualityComponentDetails**](QualityComponentDetails.md) | Dedup components. | [optional] 
**HashedEmail** | Pointer to [**map[string]QualityComponentDetails**](QualityComponentDetails.md) | User matching identifiers. | [optional] 
**HashedMaid** | Pointer to [**map[string]QualityComponentDetails**](QualityComponentDetails.md) |  | [optional] 
**IpAddress** | Pointer to [**map[string]QualityComponentDetails**](QualityComponentDetails.md) |  | [optional] 
**OrderId** | Pointer to [**map[string]QualityComponentDetails**](QualityComponentDetails.md) |  | [optional] 
**OrderValue** | Pointer to [**map[string]QualityComponentDetails**](QualityComponentDetails.md) |  | [optional] 
**ProductId** | Pointer to [**map[string]QualityComponentDetails**](QualityComponentDetails.md) | Product/event metadata. | [optional] 
**SourceUrl** | Pointer to [**map[string]QualityComponentDetails**](QualityComponentDetails.md) |  | [optional] 
**UserAgent** | Pointer to [**map[string]QualityComponentDetails**](QualityComponentDetails.md) |  | [optional] 

## Methods

### NewQualityComponents

`func NewQualityComponents() *QualityComponents`

NewQualityComponents instantiates a new QualityComponents object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQualityComponentsWithDefaults

`func NewQualityComponentsWithDefaults() *QualityComponents`

NewQualityComponentsWithDefaults instantiates a new QualityComponents object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdvertiserExternalId

`func (o *QualityComponents) GetAdvertiserExternalId() map[string]QualityComponentDetails`

GetAdvertiserExternalId returns the AdvertiserExternalId field if non-nil, zero value otherwise.

### GetAdvertiserExternalIdOk

`func (o *QualityComponents) GetAdvertiserExternalIdOk() (*map[string]QualityComponentDetails, bool)`

GetAdvertiserExternalIdOk returns a tuple with the AdvertiserExternalId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdvertiserExternalId

`func (o *QualityComponents) SetAdvertiserExternalId(v map[string]QualityComponentDetails)`

SetAdvertiserExternalId sets AdvertiserExternalId field to given value.

### HasAdvertiserExternalId

`func (o *QualityComponents) HasAdvertiserExternalId() bool`

HasAdvertiserExternalId returns a boolean if a field has been set.

### GetClickIdEpik

`func (o *QualityComponents) GetClickIdEpik() map[string]QualityComponentDetails`

GetClickIdEpik returns the ClickIdEpik field if non-nil, zero value otherwise.

### GetClickIdEpikOk

`func (o *QualityComponents) GetClickIdEpikOk() (*map[string]QualityComponentDetails, bool)`

GetClickIdEpikOk returns a tuple with the ClickIdEpik field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClickIdEpik

`func (o *QualityComponents) SetClickIdEpik(v map[string]QualityComponentDetails)`

SetClickIdEpik sets ClickIdEpik field to given value.

### HasClickIdEpik

`func (o *QualityComponents) HasClickIdEpik() bool`

HasClickIdEpik returns a boolean if a field has been set.

### GetExternalEventId

`func (o *QualityComponents) GetExternalEventId() map[string]QualityComponentDetails`

GetExternalEventId returns the ExternalEventId field if non-nil, zero value otherwise.

### GetExternalEventIdOk

`func (o *QualityComponents) GetExternalEventIdOk() (*map[string]QualityComponentDetails, bool)`

GetExternalEventIdOk returns a tuple with the ExternalEventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalEventId

`func (o *QualityComponents) SetExternalEventId(v map[string]QualityComponentDetails)`

SetExternalEventId sets ExternalEventId field to given value.

### HasExternalEventId

`func (o *QualityComponents) HasExternalEventId() bool`

HasExternalEventId returns a boolean if a field has been set.

### GetHashedEmail

`func (o *QualityComponents) GetHashedEmail() map[string]QualityComponentDetails`

GetHashedEmail returns the HashedEmail field if non-nil, zero value otherwise.

### GetHashedEmailOk

`func (o *QualityComponents) GetHashedEmailOk() (*map[string]QualityComponentDetails, bool)`

GetHashedEmailOk returns a tuple with the HashedEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHashedEmail

`func (o *QualityComponents) SetHashedEmail(v map[string]QualityComponentDetails)`

SetHashedEmail sets HashedEmail field to given value.

### HasHashedEmail

`func (o *QualityComponents) HasHashedEmail() bool`

HasHashedEmail returns a boolean if a field has been set.

### GetHashedMaid

`func (o *QualityComponents) GetHashedMaid() map[string]QualityComponentDetails`

GetHashedMaid returns the HashedMaid field if non-nil, zero value otherwise.

### GetHashedMaidOk

`func (o *QualityComponents) GetHashedMaidOk() (*map[string]QualityComponentDetails, bool)`

GetHashedMaidOk returns a tuple with the HashedMaid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHashedMaid

`func (o *QualityComponents) SetHashedMaid(v map[string]QualityComponentDetails)`

SetHashedMaid sets HashedMaid field to given value.

### HasHashedMaid

`func (o *QualityComponents) HasHashedMaid() bool`

HasHashedMaid returns a boolean if a field has been set.

### GetIpAddress

`func (o *QualityComponents) GetIpAddress() map[string]QualityComponentDetails`

GetIpAddress returns the IpAddress field if non-nil, zero value otherwise.

### GetIpAddressOk

`func (o *QualityComponents) GetIpAddressOk() (*map[string]QualityComponentDetails, bool)`

GetIpAddressOk returns a tuple with the IpAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIpAddress

`func (o *QualityComponents) SetIpAddress(v map[string]QualityComponentDetails)`

SetIpAddress sets IpAddress field to given value.

### HasIpAddress

`func (o *QualityComponents) HasIpAddress() bool`

HasIpAddress returns a boolean if a field has been set.

### GetOrderId

`func (o *QualityComponents) GetOrderId() map[string]QualityComponentDetails`

GetOrderId returns the OrderId field if non-nil, zero value otherwise.

### GetOrderIdOk

`func (o *QualityComponents) GetOrderIdOk() (*map[string]QualityComponentDetails, bool)`

GetOrderIdOk returns a tuple with the OrderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderId

`func (o *QualityComponents) SetOrderId(v map[string]QualityComponentDetails)`

SetOrderId sets OrderId field to given value.

### HasOrderId

`func (o *QualityComponents) HasOrderId() bool`

HasOrderId returns a boolean if a field has been set.

### GetOrderValue

`func (o *QualityComponents) GetOrderValue() map[string]QualityComponentDetails`

GetOrderValue returns the OrderValue field if non-nil, zero value otherwise.

### GetOrderValueOk

`func (o *QualityComponents) GetOrderValueOk() (*map[string]QualityComponentDetails, bool)`

GetOrderValueOk returns a tuple with the OrderValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderValue

`func (o *QualityComponents) SetOrderValue(v map[string]QualityComponentDetails)`

SetOrderValue sets OrderValue field to given value.

### HasOrderValue

`func (o *QualityComponents) HasOrderValue() bool`

HasOrderValue returns a boolean if a field has been set.

### GetProductId

`func (o *QualityComponents) GetProductId() map[string]QualityComponentDetails`

GetProductId returns the ProductId field if non-nil, zero value otherwise.

### GetProductIdOk

`func (o *QualityComponents) GetProductIdOk() (*map[string]QualityComponentDetails, bool)`

GetProductIdOk returns a tuple with the ProductId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductId

`func (o *QualityComponents) SetProductId(v map[string]QualityComponentDetails)`

SetProductId sets ProductId field to given value.

### HasProductId

`func (o *QualityComponents) HasProductId() bool`

HasProductId returns a boolean if a field has been set.

### GetSourceUrl

`func (o *QualityComponents) GetSourceUrl() map[string]QualityComponentDetails`

GetSourceUrl returns the SourceUrl field if non-nil, zero value otherwise.

### GetSourceUrlOk

`func (o *QualityComponents) GetSourceUrlOk() (*map[string]QualityComponentDetails, bool)`

GetSourceUrlOk returns a tuple with the SourceUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceUrl

`func (o *QualityComponents) SetSourceUrl(v map[string]QualityComponentDetails)`

SetSourceUrl sets SourceUrl field to given value.

### HasSourceUrl

`func (o *QualityComponents) HasSourceUrl() bool`

HasSourceUrl returns a boolean if a field has been set.

### GetUserAgent

`func (o *QualityComponents) GetUserAgent() map[string]QualityComponentDetails`

GetUserAgent returns the UserAgent field if non-nil, zero value otherwise.

### GetUserAgentOk

`func (o *QualityComponents) GetUserAgentOk() (*map[string]QualityComponentDetails, bool)`

GetUserAgentOk returns a tuple with the UserAgent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserAgent

`func (o *QualityComponents) SetUserAgent(v map[string]QualityComponentDetails)`

SetUserAgent sets UserAgent field to given value.

### HasUserAgent

`func (o *QualityComponents) HasUserAgent() bool`

HasUserAgent returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


