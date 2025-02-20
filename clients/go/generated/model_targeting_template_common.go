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

// checks if the TargetingTemplateCommon type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &TargetingTemplateCommon{}

// TargetingTemplateCommon struct for TargetingTemplateCommon
type TargetingTemplateCommon struct {
	// targeting template name
	Name *string `json:"name,omitempty"`
	// Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
	AutoTargetingEnabled *bool `json:"auto_targeting_enabled,omitempty"`
	TargetingAttributes *TargetingSpec `json:"targeting_attributes,omitempty"`
	PlacementGroup *PlacementGroupType `json:"placement_group,omitempty"`
	Keywords []TargetingTemplateKeyword `json:"keywords,omitempty"`
	TrackingUrls NullableTrackingUrls `json:"tracking_urls,omitempty"`
}

// NewTargetingTemplateCommon instantiates a new TargetingTemplateCommon object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewTargetingTemplateCommon() *TargetingTemplateCommon {
	this := TargetingTemplateCommon{}
	var autoTargetingEnabled bool = true
	this.AutoTargetingEnabled = &autoTargetingEnabled
	var placementGroup PlacementGroupType = ALL
	this.PlacementGroup = &placementGroup
	return &this
}

// NewTargetingTemplateCommonWithDefaults instantiates a new TargetingTemplateCommon object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewTargetingTemplateCommonWithDefaults() *TargetingTemplateCommon {
	this := TargetingTemplateCommon{}
	var autoTargetingEnabled bool = true
	this.AutoTargetingEnabled = &autoTargetingEnabled
	var placementGroup PlacementGroupType = ALL
	this.PlacementGroup = &placementGroup
	return &this
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *TargetingTemplateCommon) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TargetingTemplateCommon) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *TargetingTemplateCommon) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *TargetingTemplateCommon) SetName(v string) {
	o.Name = &v
}

// GetAutoTargetingEnabled returns the AutoTargetingEnabled field value if set, zero value otherwise.
func (o *TargetingTemplateCommon) GetAutoTargetingEnabled() bool {
	if o == nil || IsNil(o.AutoTargetingEnabled) {
		var ret bool
		return ret
	}
	return *o.AutoTargetingEnabled
}

// GetAutoTargetingEnabledOk returns a tuple with the AutoTargetingEnabled field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TargetingTemplateCommon) GetAutoTargetingEnabledOk() (*bool, bool) {
	if o == nil || IsNil(o.AutoTargetingEnabled) {
		return nil, false
	}
	return o.AutoTargetingEnabled, true
}

// HasAutoTargetingEnabled returns a boolean if a field has been set.
func (o *TargetingTemplateCommon) HasAutoTargetingEnabled() bool {
	if o != nil && !IsNil(o.AutoTargetingEnabled) {
		return true
	}

	return false
}

// SetAutoTargetingEnabled gets a reference to the given bool and assigns it to the AutoTargetingEnabled field.
func (o *TargetingTemplateCommon) SetAutoTargetingEnabled(v bool) {
	o.AutoTargetingEnabled = &v
}

// GetTargetingAttributes returns the TargetingAttributes field value if set, zero value otherwise.
func (o *TargetingTemplateCommon) GetTargetingAttributes() TargetingSpec {
	if o == nil || IsNil(o.TargetingAttributes) {
		var ret TargetingSpec
		return ret
	}
	return *o.TargetingAttributes
}

// GetTargetingAttributesOk returns a tuple with the TargetingAttributes field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TargetingTemplateCommon) GetTargetingAttributesOk() (*TargetingSpec, bool) {
	if o == nil || IsNil(o.TargetingAttributes) {
		return nil, false
	}
	return o.TargetingAttributes, true
}

// HasTargetingAttributes returns a boolean if a field has been set.
func (o *TargetingTemplateCommon) HasTargetingAttributes() bool {
	if o != nil && !IsNil(o.TargetingAttributes) {
		return true
	}

	return false
}

// SetTargetingAttributes gets a reference to the given TargetingSpec and assigns it to the TargetingAttributes field.
func (o *TargetingTemplateCommon) SetTargetingAttributes(v TargetingSpec) {
	o.TargetingAttributes = &v
}

// GetPlacementGroup returns the PlacementGroup field value if set, zero value otherwise.
func (o *TargetingTemplateCommon) GetPlacementGroup() PlacementGroupType {
	if o == nil || IsNil(o.PlacementGroup) {
		var ret PlacementGroupType
		return ret
	}
	return *o.PlacementGroup
}

// GetPlacementGroupOk returns a tuple with the PlacementGroup field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TargetingTemplateCommon) GetPlacementGroupOk() (*PlacementGroupType, bool) {
	if o == nil || IsNil(o.PlacementGroup) {
		return nil, false
	}
	return o.PlacementGroup, true
}

// HasPlacementGroup returns a boolean if a field has been set.
func (o *TargetingTemplateCommon) HasPlacementGroup() bool {
	if o != nil && !IsNil(o.PlacementGroup) {
		return true
	}

	return false
}

// SetPlacementGroup gets a reference to the given PlacementGroupType and assigns it to the PlacementGroup field.
func (o *TargetingTemplateCommon) SetPlacementGroup(v PlacementGroupType) {
	o.PlacementGroup = &v
}

// GetKeywords returns the Keywords field value if set, zero value otherwise.
func (o *TargetingTemplateCommon) GetKeywords() []TargetingTemplateKeyword {
	if o == nil || IsNil(o.Keywords) {
		var ret []TargetingTemplateKeyword
		return ret
	}
	return o.Keywords
}

// GetKeywordsOk returns a tuple with the Keywords field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *TargetingTemplateCommon) GetKeywordsOk() ([]TargetingTemplateKeyword, bool) {
	if o == nil || IsNil(o.Keywords) {
		return nil, false
	}
	return o.Keywords, true
}

// HasKeywords returns a boolean if a field has been set.
func (o *TargetingTemplateCommon) HasKeywords() bool {
	if o != nil && !IsNil(o.Keywords) {
		return true
	}

	return false
}

// SetKeywords gets a reference to the given []TargetingTemplateKeyword and assigns it to the Keywords field.
func (o *TargetingTemplateCommon) SetKeywords(v []TargetingTemplateKeyword) {
	o.Keywords = v
}

// GetTrackingUrls returns the TrackingUrls field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *TargetingTemplateCommon) GetTrackingUrls() TrackingUrls {
	if o == nil || IsNil(o.TrackingUrls.Get()) {
		var ret TrackingUrls
		return ret
	}
	return *o.TrackingUrls.Get()
}

// GetTrackingUrlsOk returns a tuple with the TrackingUrls field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *TargetingTemplateCommon) GetTrackingUrlsOk() (*TrackingUrls, bool) {
	if o == nil {
		return nil, false
	}
	return o.TrackingUrls.Get(), o.TrackingUrls.IsSet()
}

// HasTrackingUrls returns a boolean if a field has been set.
func (o *TargetingTemplateCommon) HasTrackingUrls() bool {
	if o != nil && o.TrackingUrls.IsSet() {
		return true
	}

	return false
}

// SetTrackingUrls gets a reference to the given NullableTrackingUrls and assigns it to the TrackingUrls field.
func (o *TargetingTemplateCommon) SetTrackingUrls(v TrackingUrls) {
	o.TrackingUrls.Set(&v)
}
// SetTrackingUrlsNil sets the value for TrackingUrls to be an explicit nil
func (o *TargetingTemplateCommon) SetTrackingUrlsNil() {
	o.TrackingUrls.Set(nil)
}

// UnsetTrackingUrls ensures that no value is present for TrackingUrls, not even an explicit nil
func (o *TargetingTemplateCommon) UnsetTrackingUrls() {
	o.TrackingUrls.Unset()
}

func (o TargetingTemplateCommon) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o TargetingTemplateCommon) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.AutoTargetingEnabled) {
		toSerialize["auto_targeting_enabled"] = o.AutoTargetingEnabled
	}
	if !IsNil(o.TargetingAttributes) {
		toSerialize["targeting_attributes"] = o.TargetingAttributes
	}
	if !IsNil(o.PlacementGroup) {
		toSerialize["placement_group"] = o.PlacementGroup
	}
	if !IsNil(o.Keywords) {
		toSerialize["keywords"] = o.Keywords
	}
	if o.TrackingUrls.IsSet() {
		toSerialize["tracking_urls"] = o.TrackingUrls.Get()
	}
	return toSerialize, nil
}

type NullableTargetingTemplateCommon struct {
	value *TargetingTemplateCommon
	isSet bool
}

func (v NullableTargetingTemplateCommon) Get() *TargetingTemplateCommon {
	return v.value
}

func (v *NullableTargetingTemplateCommon) Set(val *TargetingTemplateCommon) {
	v.value = val
	v.isSet = true
}

func (v NullableTargetingTemplateCommon) IsSet() bool {
	return v.isSet
}

func (v *NullableTargetingTemplateCommon) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTargetingTemplateCommon(val *TargetingTemplateCommon) *NullableTargetingTemplateCommon {
	return &NullableTargetingTemplateCommon{value: val, isSet: true}
}

func (v NullableTargetingTemplateCommon) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTargetingTemplateCommon) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


