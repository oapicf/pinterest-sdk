/*
Pinterest REST API

Pinterest's REST API

API version: 5.14.0
Contact: blah+oapicf@cliffano.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
	"bytes"
	"fmt"
)

// checks if the OrderLine type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &OrderLine{}

// OrderLine struct for OrderLine
type OrderLine struct {
	// Order line ID.
	Id *string `json:"id,omitempty" validate:"regexp=^\\\\d+$"`
	// Always \"orderline\".
	Type *string `json:"type,omitempty"`
	// Ad account ID.
	AdAccountId *string `json:"ad_account_id,omitempty"`
	// Purchase order ID.
	PurchaseOrderId NullableString `json:"purchase_order_id,omitempty"`
	// Start time. Unix timestamp.
	StartTime *float32 `json:"start_time,omitempty"`
	// End time. Unix timestamp.
	EndTime NullableFloat32 `json:"end_time,omitempty"`
	// Order line budget in micro currency.
	Budget NullableFloat32 `json:"budget,omitempty"`
	// Order line paid budget in micro currency.
	PaidBudget NullableFloat32 `json:"paid_budget,omitempty"`
	// Order line status.
	Status *OrderLineStatus `json:"status,omitempty"`
	// Order line name.
	Name NullableString `json:"name,omitempty"`
	// Order line paid type.
	PaidType NullableOrderLinePaidType `json:"paid_type,omitempty"`
	// Associated List of campaign IDs.
	CampaignIds []string `json:"campaign_ids"`
}

type _OrderLine OrderLine

// NewOrderLine instantiates a new OrderLine object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewOrderLine(campaignIds []string) *OrderLine {
	this := OrderLine{}
	this.CampaignIds = campaignIds
	return &this
}

// NewOrderLineWithDefaults instantiates a new OrderLine object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewOrderLineWithDefaults() *OrderLine {
	this := OrderLine{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *OrderLine) GetId() string {
	if o == nil || IsNil(o.Id) {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OrderLine) GetIdOk() (*string, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *OrderLine) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
func (o *OrderLine) SetId(v string) {
	o.Id = &v
}

// GetType returns the Type field value if set, zero value otherwise.
func (o *OrderLine) GetType() string {
	if o == nil || IsNil(o.Type) {
		var ret string
		return ret
	}
	return *o.Type
}

// GetTypeOk returns a tuple with the Type field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OrderLine) GetTypeOk() (*string, bool) {
	if o == nil || IsNil(o.Type) {
		return nil, false
	}
	return o.Type, true
}

// HasType returns a boolean if a field has been set.
func (o *OrderLine) HasType() bool {
	if o != nil && !IsNil(o.Type) {
		return true
	}

	return false
}

// SetType gets a reference to the given string and assigns it to the Type field.
func (o *OrderLine) SetType(v string) {
	o.Type = &v
}

// GetAdAccountId returns the AdAccountId field value if set, zero value otherwise.
func (o *OrderLine) GetAdAccountId() string {
	if o == nil || IsNil(o.AdAccountId) {
		var ret string
		return ret
	}
	return *o.AdAccountId
}

// GetAdAccountIdOk returns a tuple with the AdAccountId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OrderLine) GetAdAccountIdOk() (*string, bool) {
	if o == nil || IsNil(o.AdAccountId) {
		return nil, false
	}
	return o.AdAccountId, true
}

// HasAdAccountId returns a boolean if a field has been set.
func (o *OrderLine) HasAdAccountId() bool {
	if o != nil && !IsNil(o.AdAccountId) {
		return true
	}

	return false
}

// SetAdAccountId gets a reference to the given string and assigns it to the AdAccountId field.
func (o *OrderLine) SetAdAccountId(v string) {
	o.AdAccountId = &v
}

// GetPurchaseOrderId returns the PurchaseOrderId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *OrderLine) GetPurchaseOrderId() string {
	if o == nil || IsNil(o.PurchaseOrderId.Get()) {
		var ret string
		return ret
	}
	return *o.PurchaseOrderId.Get()
}

// GetPurchaseOrderIdOk returns a tuple with the PurchaseOrderId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *OrderLine) GetPurchaseOrderIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.PurchaseOrderId.Get(), o.PurchaseOrderId.IsSet()
}

// HasPurchaseOrderId returns a boolean if a field has been set.
func (o *OrderLine) HasPurchaseOrderId() bool {
	if o != nil && o.PurchaseOrderId.IsSet() {
		return true
	}

	return false
}

// SetPurchaseOrderId gets a reference to the given NullableString and assigns it to the PurchaseOrderId field.
func (o *OrderLine) SetPurchaseOrderId(v string) {
	o.PurchaseOrderId.Set(&v)
}
// SetPurchaseOrderIdNil sets the value for PurchaseOrderId to be an explicit nil
func (o *OrderLine) SetPurchaseOrderIdNil() {
	o.PurchaseOrderId.Set(nil)
}

// UnsetPurchaseOrderId ensures that no value is present for PurchaseOrderId, not even an explicit nil
func (o *OrderLine) UnsetPurchaseOrderId() {
	o.PurchaseOrderId.Unset()
}

// GetStartTime returns the StartTime field value if set, zero value otherwise.
func (o *OrderLine) GetStartTime() float32 {
	if o == nil || IsNil(o.StartTime) {
		var ret float32
		return ret
	}
	return *o.StartTime
}

// GetStartTimeOk returns a tuple with the StartTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OrderLine) GetStartTimeOk() (*float32, bool) {
	if o == nil || IsNil(o.StartTime) {
		return nil, false
	}
	return o.StartTime, true
}

// HasStartTime returns a boolean if a field has been set.
func (o *OrderLine) HasStartTime() bool {
	if o != nil && !IsNil(o.StartTime) {
		return true
	}

	return false
}

// SetStartTime gets a reference to the given float32 and assigns it to the StartTime field.
func (o *OrderLine) SetStartTime(v float32) {
	o.StartTime = &v
}

// GetEndTime returns the EndTime field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *OrderLine) GetEndTime() float32 {
	if o == nil || IsNil(o.EndTime.Get()) {
		var ret float32
		return ret
	}
	return *o.EndTime.Get()
}

// GetEndTimeOk returns a tuple with the EndTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *OrderLine) GetEndTimeOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return o.EndTime.Get(), o.EndTime.IsSet()
}

// HasEndTime returns a boolean if a field has been set.
func (o *OrderLine) HasEndTime() bool {
	if o != nil && o.EndTime.IsSet() {
		return true
	}

	return false
}

// SetEndTime gets a reference to the given NullableFloat32 and assigns it to the EndTime field.
func (o *OrderLine) SetEndTime(v float32) {
	o.EndTime.Set(&v)
}
// SetEndTimeNil sets the value for EndTime to be an explicit nil
func (o *OrderLine) SetEndTimeNil() {
	o.EndTime.Set(nil)
}

// UnsetEndTime ensures that no value is present for EndTime, not even an explicit nil
func (o *OrderLine) UnsetEndTime() {
	o.EndTime.Unset()
}

// GetBudget returns the Budget field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *OrderLine) GetBudget() float32 {
	if o == nil || IsNil(o.Budget.Get()) {
		var ret float32
		return ret
	}
	return *o.Budget.Get()
}

// GetBudgetOk returns a tuple with the Budget field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *OrderLine) GetBudgetOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return o.Budget.Get(), o.Budget.IsSet()
}

// HasBudget returns a boolean if a field has been set.
func (o *OrderLine) HasBudget() bool {
	if o != nil && o.Budget.IsSet() {
		return true
	}

	return false
}

// SetBudget gets a reference to the given NullableFloat32 and assigns it to the Budget field.
func (o *OrderLine) SetBudget(v float32) {
	o.Budget.Set(&v)
}
// SetBudgetNil sets the value for Budget to be an explicit nil
func (o *OrderLine) SetBudgetNil() {
	o.Budget.Set(nil)
}

// UnsetBudget ensures that no value is present for Budget, not even an explicit nil
func (o *OrderLine) UnsetBudget() {
	o.Budget.Unset()
}

// GetPaidBudget returns the PaidBudget field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *OrderLine) GetPaidBudget() float32 {
	if o == nil || IsNil(o.PaidBudget.Get()) {
		var ret float32
		return ret
	}
	return *o.PaidBudget.Get()
}

// GetPaidBudgetOk returns a tuple with the PaidBudget field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *OrderLine) GetPaidBudgetOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return o.PaidBudget.Get(), o.PaidBudget.IsSet()
}

// HasPaidBudget returns a boolean if a field has been set.
func (o *OrderLine) HasPaidBudget() bool {
	if o != nil && o.PaidBudget.IsSet() {
		return true
	}

	return false
}

// SetPaidBudget gets a reference to the given NullableFloat32 and assigns it to the PaidBudget field.
func (o *OrderLine) SetPaidBudget(v float32) {
	o.PaidBudget.Set(&v)
}
// SetPaidBudgetNil sets the value for PaidBudget to be an explicit nil
func (o *OrderLine) SetPaidBudgetNil() {
	o.PaidBudget.Set(nil)
}

// UnsetPaidBudget ensures that no value is present for PaidBudget, not even an explicit nil
func (o *OrderLine) UnsetPaidBudget() {
	o.PaidBudget.Unset()
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *OrderLine) GetStatus() OrderLineStatus {
	if o == nil || IsNil(o.Status) {
		var ret OrderLineStatus
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OrderLine) GetStatusOk() (*OrderLineStatus, bool) {
	if o == nil || IsNil(o.Status) {
		return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *OrderLine) HasStatus() bool {
	if o != nil && !IsNil(o.Status) {
		return true
	}

	return false
}

// SetStatus gets a reference to the given OrderLineStatus and assigns it to the Status field.
func (o *OrderLine) SetStatus(v OrderLineStatus) {
	o.Status = &v
}

// GetName returns the Name field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *OrderLine) GetName() string {
	if o == nil || IsNil(o.Name.Get()) {
		var ret string
		return ret
	}
	return *o.Name.Get()
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *OrderLine) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Name.Get(), o.Name.IsSet()
}

// HasName returns a boolean if a field has been set.
func (o *OrderLine) HasName() bool {
	if o != nil && o.Name.IsSet() {
		return true
	}

	return false
}

// SetName gets a reference to the given NullableString and assigns it to the Name field.
func (o *OrderLine) SetName(v string) {
	o.Name.Set(&v)
}
// SetNameNil sets the value for Name to be an explicit nil
func (o *OrderLine) SetNameNil() {
	o.Name.Set(nil)
}

// UnsetName ensures that no value is present for Name, not even an explicit nil
func (o *OrderLine) UnsetName() {
	o.Name.Unset()
}

// GetPaidType returns the PaidType field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *OrderLine) GetPaidType() OrderLinePaidType {
	if o == nil || IsNil(o.PaidType.Get()) {
		var ret OrderLinePaidType
		return ret
	}
	return *o.PaidType.Get()
}

// GetPaidTypeOk returns a tuple with the PaidType field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *OrderLine) GetPaidTypeOk() (*OrderLinePaidType, bool) {
	if o == nil {
		return nil, false
	}
	return o.PaidType.Get(), o.PaidType.IsSet()
}

// HasPaidType returns a boolean if a field has been set.
func (o *OrderLine) HasPaidType() bool {
	if o != nil && o.PaidType.IsSet() {
		return true
	}

	return false
}

// SetPaidType gets a reference to the given NullableOrderLinePaidType and assigns it to the PaidType field.
func (o *OrderLine) SetPaidType(v OrderLinePaidType) {
	o.PaidType.Set(&v)
}
// SetPaidTypeNil sets the value for PaidType to be an explicit nil
func (o *OrderLine) SetPaidTypeNil() {
	o.PaidType.Set(nil)
}

// UnsetPaidType ensures that no value is present for PaidType, not even an explicit nil
func (o *OrderLine) UnsetPaidType() {
	o.PaidType.Unset()
}

// GetCampaignIds returns the CampaignIds field value
func (o *OrderLine) GetCampaignIds() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.CampaignIds
}

// GetCampaignIdsOk returns a tuple with the CampaignIds field value
// and a boolean to check if the value has been set.
func (o *OrderLine) GetCampaignIdsOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CampaignIds, true
}

// SetCampaignIds sets field value
func (o *OrderLine) SetCampaignIds(v []string) {
	o.CampaignIds = v
}

func (o OrderLine) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o OrderLine) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.Type) {
		toSerialize["type"] = o.Type
	}
	if !IsNil(o.AdAccountId) {
		toSerialize["ad_account_id"] = o.AdAccountId
	}
	if o.PurchaseOrderId.IsSet() {
		toSerialize["purchase_order_id"] = o.PurchaseOrderId.Get()
	}
	if !IsNil(o.StartTime) {
		toSerialize["start_time"] = o.StartTime
	}
	if o.EndTime.IsSet() {
		toSerialize["end_time"] = o.EndTime.Get()
	}
	if o.Budget.IsSet() {
		toSerialize["budget"] = o.Budget.Get()
	}
	if o.PaidBudget.IsSet() {
		toSerialize["paid_budget"] = o.PaidBudget.Get()
	}
	if !IsNil(o.Status) {
		toSerialize["status"] = o.Status
	}
	if o.Name.IsSet() {
		toSerialize["name"] = o.Name.Get()
	}
	if o.PaidType.IsSet() {
		toSerialize["paid_type"] = o.PaidType.Get()
	}
	toSerialize["campaign_ids"] = o.CampaignIds
	return toSerialize, nil
}

func (o *OrderLine) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"campaign_ids",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varOrderLine := _OrderLine{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varOrderLine)

	if err != nil {
		return err
	}

	*o = OrderLine(varOrderLine)

	return err
}

type NullableOrderLine struct {
	value *OrderLine
	isSet bool
}

func (v NullableOrderLine) Get() *OrderLine {
	return v.value
}

func (v *NullableOrderLine) Set(val *OrderLine) {
	v.value = val
	v.isSet = true
}

func (v NullableOrderLine) IsSet() bool {
	return v.isSet
}

func (v *NullableOrderLine) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOrderLine(val *OrderLine) *NullableOrderLine {
	return &NullableOrderLine{value: val, isSet: true}
}

func (v NullableOrderLine) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOrderLine) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


