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
)

// checks if the AudienceUpdateRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &AudienceUpdateRequest{}

// AudienceUpdateRequest struct for AudienceUpdateRequest
type AudienceUpdateRequest struct {
	// Ad account ID.
	AdAccountId *string `json:"ad_account_id,omitempty" validate:"regexp=^\\\\d+$"`
	// Audience name.
	Name *string `json:"name,omitempty"`
	Rule *AudienceRule `json:"rule,omitempty"`
	// Audience description.
	Description *string `json:"description,omitempty"`
	OperationType *AudienceUpdateOperationType `json:"operation_type,omitempty"`
}

// NewAudienceUpdateRequest instantiates a new AudienceUpdateRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAudienceUpdateRequest() *AudienceUpdateRequest {
	this := AudienceUpdateRequest{}
	var operationType AudienceUpdateOperationType = UPDATE
	this.OperationType = &operationType
	return &this
}

// NewAudienceUpdateRequestWithDefaults instantiates a new AudienceUpdateRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAudienceUpdateRequestWithDefaults() *AudienceUpdateRequest {
	this := AudienceUpdateRequest{}
	var operationType AudienceUpdateOperationType = UPDATE
	this.OperationType = &operationType
	return &this
}

// GetAdAccountId returns the AdAccountId field value if set, zero value otherwise.
func (o *AudienceUpdateRequest) GetAdAccountId() string {
	if o == nil || IsNil(o.AdAccountId) {
		var ret string
		return ret
	}
	return *o.AdAccountId
}

// GetAdAccountIdOk returns a tuple with the AdAccountId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AudienceUpdateRequest) GetAdAccountIdOk() (*string, bool) {
	if o == nil || IsNil(o.AdAccountId) {
		return nil, false
	}
	return o.AdAccountId, true
}

// HasAdAccountId returns a boolean if a field has been set.
func (o *AudienceUpdateRequest) HasAdAccountId() bool {
	if o != nil && !IsNil(o.AdAccountId) {
		return true
	}

	return false
}

// SetAdAccountId gets a reference to the given string and assigns it to the AdAccountId field.
func (o *AudienceUpdateRequest) SetAdAccountId(v string) {
	o.AdAccountId = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *AudienceUpdateRequest) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AudienceUpdateRequest) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *AudienceUpdateRequest) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *AudienceUpdateRequest) SetName(v string) {
	o.Name = &v
}

// GetRule returns the Rule field value if set, zero value otherwise.
func (o *AudienceUpdateRequest) GetRule() AudienceRule {
	if o == nil || IsNil(o.Rule) {
		var ret AudienceRule
		return ret
	}
	return *o.Rule
}

// GetRuleOk returns a tuple with the Rule field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AudienceUpdateRequest) GetRuleOk() (*AudienceRule, bool) {
	if o == nil || IsNil(o.Rule) {
		return nil, false
	}
	return o.Rule, true
}

// HasRule returns a boolean if a field has been set.
func (o *AudienceUpdateRequest) HasRule() bool {
	if o != nil && !IsNil(o.Rule) {
		return true
	}

	return false
}

// SetRule gets a reference to the given AudienceRule and assigns it to the Rule field.
func (o *AudienceUpdateRequest) SetRule(v AudienceRule) {
	o.Rule = &v
}

// GetDescription returns the Description field value if set, zero value otherwise.
func (o *AudienceUpdateRequest) GetDescription() string {
	if o == nil || IsNil(o.Description) {
		var ret string
		return ret
	}
	return *o.Description
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AudienceUpdateRequest) GetDescriptionOk() (*string, bool) {
	if o == nil || IsNil(o.Description) {
		return nil, false
	}
	return o.Description, true
}

// HasDescription returns a boolean if a field has been set.
func (o *AudienceUpdateRequest) HasDescription() bool {
	if o != nil && !IsNil(o.Description) {
		return true
	}

	return false
}

// SetDescription gets a reference to the given string and assigns it to the Description field.
func (o *AudienceUpdateRequest) SetDescription(v string) {
	o.Description = &v
}

// GetOperationType returns the OperationType field value if set, zero value otherwise.
func (o *AudienceUpdateRequest) GetOperationType() AudienceUpdateOperationType {
	if o == nil || IsNil(o.OperationType) {
		var ret AudienceUpdateOperationType
		return ret
	}
	return *o.OperationType
}

// GetOperationTypeOk returns a tuple with the OperationType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AudienceUpdateRequest) GetOperationTypeOk() (*AudienceUpdateOperationType, bool) {
	if o == nil || IsNil(o.OperationType) {
		return nil, false
	}
	return o.OperationType, true
}

// HasOperationType returns a boolean if a field has been set.
func (o *AudienceUpdateRequest) HasOperationType() bool {
	if o != nil && !IsNil(o.OperationType) {
		return true
	}

	return false
}

// SetOperationType gets a reference to the given AudienceUpdateOperationType and assigns it to the OperationType field.
func (o *AudienceUpdateRequest) SetOperationType(v AudienceUpdateOperationType) {
	o.OperationType = &v
}

func (o AudienceUpdateRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o AudienceUpdateRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.AdAccountId) {
		toSerialize["ad_account_id"] = o.AdAccountId
	}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.Rule) {
		toSerialize["rule"] = o.Rule
	}
	if !IsNil(o.Description) {
		toSerialize["description"] = o.Description
	}
	if !IsNil(o.OperationType) {
		toSerialize["operation_type"] = o.OperationType
	}
	return toSerialize, nil
}

type NullableAudienceUpdateRequest struct {
	value *AudienceUpdateRequest
	isSet bool
}

func (v NullableAudienceUpdateRequest) Get() *AudienceUpdateRequest {
	return v.value
}

func (v *NullableAudienceUpdateRequest) Set(val *AudienceUpdateRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableAudienceUpdateRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableAudienceUpdateRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAudienceUpdateRequest(val *AudienceUpdateRequest) *NullableAudienceUpdateRequest {
	return &NullableAudienceUpdateRequest{value: val, isSet: true}
}

func (v NullableAudienceUpdateRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAudienceUpdateRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


