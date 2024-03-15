# OrderLine

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | Order line ID. | [optional] 
**Type** | Pointer to **string** | Always \&quot;orderline\&quot;. | [optional] 
**AdAccountId** | Pointer to **string** | Ad account ID. | [optional] 
**PurchaseOrderId** | Pointer to **NullableString** | Purchase order ID. | [optional] 
**StartTime** | Pointer to **float32** | Start time. Unix timestamp. | [optional] 
**EndTime** | Pointer to **NullableFloat32** | End time. Unix timestamp. | [optional] 
**Budget** | Pointer to **NullableFloat32** | Order line budget in micro currency. | [optional] 
**PaidBudget** | Pointer to **NullableFloat32** | Order line paid budget in micro currency. | [optional] 
**Status** | Pointer to [**OrderLineStatus**](OrderLineStatus.md) | Order line status. | [optional] 
**Name** | Pointer to **NullableString** | Order line name. | [optional] 
**PaidType** | Pointer to [**NullableOrderLinePaidType**](OrderLinePaidType.md) | Order line paid type. | [optional] 
**CampaignIds** | **[]string** | Associated List of campaign IDs. | 

## Methods

### NewOrderLine

`func NewOrderLine(campaignIds []string, ) *OrderLine`

NewOrderLine instantiates a new OrderLine object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderLineWithDefaults

`func NewOrderLineWithDefaults() *OrderLine`

NewOrderLineWithDefaults instantiates a new OrderLine object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *OrderLine) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *OrderLine) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *OrderLine) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *OrderLine) HasId() bool`

HasId returns a boolean if a field has been set.

### GetType

`func (o *OrderLine) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *OrderLine) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *OrderLine) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *OrderLine) HasType() bool`

HasType returns a boolean if a field has been set.

### GetAdAccountId

`func (o *OrderLine) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *OrderLine) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *OrderLine) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *OrderLine) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetPurchaseOrderId

`func (o *OrderLine) GetPurchaseOrderId() string`

GetPurchaseOrderId returns the PurchaseOrderId field if non-nil, zero value otherwise.

### GetPurchaseOrderIdOk

`func (o *OrderLine) GetPurchaseOrderIdOk() (*string, bool)`

GetPurchaseOrderIdOk returns a tuple with the PurchaseOrderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurchaseOrderId

`func (o *OrderLine) SetPurchaseOrderId(v string)`

SetPurchaseOrderId sets PurchaseOrderId field to given value.

### HasPurchaseOrderId

`func (o *OrderLine) HasPurchaseOrderId() bool`

HasPurchaseOrderId returns a boolean if a field has been set.

### SetPurchaseOrderIdNil

`func (o *OrderLine) SetPurchaseOrderIdNil(b bool)`

 SetPurchaseOrderIdNil sets the value for PurchaseOrderId to be an explicit nil

### UnsetPurchaseOrderId
`func (o *OrderLine) UnsetPurchaseOrderId()`

UnsetPurchaseOrderId ensures that no value is present for PurchaseOrderId, not even an explicit nil
### GetStartTime

`func (o *OrderLine) GetStartTime() float32`

GetStartTime returns the StartTime field if non-nil, zero value otherwise.

### GetStartTimeOk

`func (o *OrderLine) GetStartTimeOk() (*float32, bool)`

GetStartTimeOk returns a tuple with the StartTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTime

`func (o *OrderLine) SetStartTime(v float32)`

SetStartTime sets StartTime field to given value.

### HasStartTime

`func (o *OrderLine) HasStartTime() bool`

HasStartTime returns a boolean if a field has been set.

### GetEndTime

`func (o *OrderLine) GetEndTime() float32`

GetEndTime returns the EndTime field if non-nil, zero value otherwise.

### GetEndTimeOk

`func (o *OrderLine) GetEndTimeOk() (*float32, bool)`

GetEndTimeOk returns a tuple with the EndTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTime

`func (o *OrderLine) SetEndTime(v float32)`

SetEndTime sets EndTime field to given value.

### HasEndTime

`func (o *OrderLine) HasEndTime() bool`

HasEndTime returns a boolean if a field has been set.

### SetEndTimeNil

`func (o *OrderLine) SetEndTimeNil(b bool)`

 SetEndTimeNil sets the value for EndTime to be an explicit nil

### UnsetEndTime
`func (o *OrderLine) UnsetEndTime()`

UnsetEndTime ensures that no value is present for EndTime, not even an explicit nil
### GetBudget

`func (o *OrderLine) GetBudget() float32`

GetBudget returns the Budget field if non-nil, zero value otherwise.

### GetBudgetOk

`func (o *OrderLine) GetBudgetOk() (*float32, bool)`

GetBudgetOk returns a tuple with the Budget field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBudget

`func (o *OrderLine) SetBudget(v float32)`

SetBudget sets Budget field to given value.

### HasBudget

`func (o *OrderLine) HasBudget() bool`

HasBudget returns a boolean if a field has been set.

### SetBudgetNil

`func (o *OrderLine) SetBudgetNil(b bool)`

 SetBudgetNil sets the value for Budget to be an explicit nil

### UnsetBudget
`func (o *OrderLine) UnsetBudget()`

UnsetBudget ensures that no value is present for Budget, not even an explicit nil
### GetPaidBudget

`func (o *OrderLine) GetPaidBudget() float32`

GetPaidBudget returns the PaidBudget field if non-nil, zero value otherwise.

### GetPaidBudgetOk

`func (o *OrderLine) GetPaidBudgetOk() (*float32, bool)`

GetPaidBudgetOk returns a tuple with the PaidBudget field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaidBudget

`func (o *OrderLine) SetPaidBudget(v float32)`

SetPaidBudget sets PaidBudget field to given value.

### HasPaidBudget

`func (o *OrderLine) HasPaidBudget() bool`

HasPaidBudget returns a boolean if a field has been set.

### SetPaidBudgetNil

`func (o *OrderLine) SetPaidBudgetNil(b bool)`

 SetPaidBudgetNil sets the value for PaidBudget to be an explicit nil

### UnsetPaidBudget
`func (o *OrderLine) UnsetPaidBudget()`

UnsetPaidBudget ensures that no value is present for PaidBudget, not even an explicit nil
### GetStatus

`func (o *OrderLine) GetStatus() OrderLineStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *OrderLine) GetStatusOk() (*OrderLineStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *OrderLine) SetStatus(v OrderLineStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *OrderLine) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetName

`func (o *OrderLine) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *OrderLine) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *OrderLine) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *OrderLine) HasName() bool`

HasName returns a boolean if a field has been set.

### SetNameNil

`func (o *OrderLine) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *OrderLine) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetPaidType

`func (o *OrderLine) GetPaidType() OrderLinePaidType`

GetPaidType returns the PaidType field if non-nil, zero value otherwise.

### GetPaidTypeOk

`func (o *OrderLine) GetPaidTypeOk() (*OrderLinePaidType, bool)`

GetPaidTypeOk returns a tuple with the PaidType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaidType

`func (o *OrderLine) SetPaidType(v OrderLinePaidType)`

SetPaidType sets PaidType field to given value.

### HasPaidType

`func (o *OrderLine) HasPaidType() bool`

HasPaidType returns a boolean if a field has been set.

### SetPaidTypeNil

`func (o *OrderLine) SetPaidTypeNil(b bool)`

 SetPaidTypeNil sets the value for PaidType to be an explicit nil

### UnsetPaidType
`func (o *OrderLine) UnsetPaidType()`

UnsetPaidType ensures that no value is present for PaidType, not even an explicit nil
### GetCampaignIds

`func (o *OrderLine) GetCampaignIds() []string`

GetCampaignIds returns the CampaignIds field if non-nil, zero value otherwise.

### GetCampaignIdsOk

`func (o *OrderLine) GetCampaignIdsOk() (*[]string, bool)`

GetCampaignIdsOk returns a tuple with the CampaignIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignIds

`func (o *OrderLine) SetCampaignIds(v []string)`

SetCampaignIds sets CampaignIds field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


