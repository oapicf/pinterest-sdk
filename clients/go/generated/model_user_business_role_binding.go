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

// checks if the UserBusinessRoleBinding type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &UserBusinessRoleBinding{}

// UserBusinessRoleBinding struct for UserBusinessRoleBinding
type UserBusinessRoleBinding struct {
	AssetsSummary NullableBusinessMemberAssetsSummary `json:"assets_summary,omitempty"`
	// The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
	BusinessRoles []string `json:"business_roles,omitempty"`
	// Metadata for the business that created the business relationship.
	CreatedByBusiness NullableBusinessAccessUserSummary `json:"created_by_business,omitempty"`
	// Metadata for the user that created the business relationship.
	CreatedByUser NullableBusinessAccessUserSummary `json:"created_by_user,omitempty"`
	// The time the business relationship was created. Returned in milliseconds.
	CreatedTime NullableInt32 `json:"created_time,omitempty"`
	// Unique identifier of the business member/business partner/employer.
	Id *string `json:"id,omitempty" validate:"regexp=^\\\\d+$"`
	// This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to.
	IsSharedPartner *bool `json:"is_shared_partner,omitempty"`
	// Metadata for the business member/business partner/employer.
	User NullableBusinessAccessUserSummary `json:"user,omitempty"`
}

// NewUserBusinessRoleBinding instantiates a new UserBusinessRoleBinding object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUserBusinessRoleBinding() *UserBusinessRoleBinding {
	this := UserBusinessRoleBinding{}
	return &this
}

// NewUserBusinessRoleBindingWithDefaults instantiates a new UserBusinessRoleBinding object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUserBusinessRoleBindingWithDefaults() *UserBusinessRoleBinding {
	this := UserBusinessRoleBinding{}
	return &this
}

// GetAssetsSummary returns the AssetsSummary field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UserBusinessRoleBinding) GetAssetsSummary() BusinessMemberAssetsSummary {
	if o == nil || IsNil(o.AssetsSummary.Get()) {
		var ret BusinessMemberAssetsSummary
		return ret
	}
	return *o.AssetsSummary.Get()
}

// GetAssetsSummaryOk returns a tuple with the AssetsSummary field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UserBusinessRoleBinding) GetAssetsSummaryOk() (*BusinessMemberAssetsSummary, bool) {
	if o == nil {
		return nil, false
	}
	return o.AssetsSummary.Get(), o.AssetsSummary.IsSet()
}

// HasAssetsSummary returns a boolean if a field has been set.
func (o *UserBusinessRoleBinding) HasAssetsSummary() bool {
	if o != nil && o.AssetsSummary.IsSet() {
		return true
	}

	return false
}

// SetAssetsSummary gets a reference to the given NullableBusinessMemberAssetsSummary and assigns it to the AssetsSummary field.
func (o *UserBusinessRoleBinding) SetAssetsSummary(v BusinessMemberAssetsSummary) {
	o.AssetsSummary.Set(&v)
}
// SetAssetsSummaryNil sets the value for AssetsSummary to be an explicit nil
func (o *UserBusinessRoleBinding) SetAssetsSummaryNil() {
	o.AssetsSummary.Set(nil)
}

// UnsetAssetsSummary ensures that no value is present for AssetsSummary, not even an explicit nil
func (o *UserBusinessRoleBinding) UnsetAssetsSummary() {
	o.AssetsSummary.Unset()
}

// GetBusinessRoles returns the BusinessRoles field value if set, zero value otherwise.
func (o *UserBusinessRoleBinding) GetBusinessRoles() []string {
	if o == nil || IsNil(o.BusinessRoles) {
		var ret []string
		return ret
	}
	return o.BusinessRoles
}

// GetBusinessRolesOk returns a tuple with the BusinessRoles field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserBusinessRoleBinding) GetBusinessRolesOk() ([]string, bool) {
	if o == nil || IsNil(o.BusinessRoles) {
		return nil, false
	}
	return o.BusinessRoles, true
}

// HasBusinessRoles returns a boolean if a field has been set.
func (o *UserBusinessRoleBinding) HasBusinessRoles() bool {
	if o != nil && !IsNil(o.BusinessRoles) {
		return true
	}

	return false
}

// SetBusinessRoles gets a reference to the given []string and assigns it to the BusinessRoles field.
func (o *UserBusinessRoleBinding) SetBusinessRoles(v []string) {
	o.BusinessRoles = v
}

// GetCreatedByBusiness returns the CreatedByBusiness field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UserBusinessRoleBinding) GetCreatedByBusiness() BusinessAccessUserSummary {
	if o == nil || IsNil(o.CreatedByBusiness.Get()) {
		var ret BusinessAccessUserSummary
		return ret
	}
	return *o.CreatedByBusiness.Get()
}

// GetCreatedByBusinessOk returns a tuple with the CreatedByBusiness field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UserBusinessRoleBinding) GetCreatedByBusinessOk() (*BusinessAccessUserSummary, bool) {
	if o == nil {
		return nil, false
	}
	return o.CreatedByBusiness.Get(), o.CreatedByBusiness.IsSet()
}

// HasCreatedByBusiness returns a boolean if a field has been set.
func (o *UserBusinessRoleBinding) HasCreatedByBusiness() bool {
	if o != nil && o.CreatedByBusiness.IsSet() {
		return true
	}

	return false
}

// SetCreatedByBusiness gets a reference to the given NullableBusinessAccessUserSummary and assigns it to the CreatedByBusiness field.
func (o *UserBusinessRoleBinding) SetCreatedByBusiness(v BusinessAccessUserSummary) {
	o.CreatedByBusiness.Set(&v)
}
// SetCreatedByBusinessNil sets the value for CreatedByBusiness to be an explicit nil
func (o *UserBusinessRoleBinding) SetCreatedByBusinessNil() {
	o.CreatedByBusiness.Set(nil)
}

// UnsetCreatedByBusiness ensures that no value is present for CreatedByBusiness, not even an explicit nil
func (o *UserBusinessRoleBinding) UnsetCreatedByBusiness() {
	o.CreatedByBusiness.Unset()
}

// GetCreatedByUser returns the CreatedByUser field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UserBusinessRoleBinding) GetCreatedByUser() BusinessAccessUserSummary {
	if o == nil || IsNil(o.CreatedByUser.Get()) {
		var ret BusinessAccessUserSummary
		return ret
	}
	return *o.CreatedByUser.Get()
}

// GetCreatedByUserOk returns a tuple with the CreatedByUser field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UserBusinessRoleBinding) GetCreatedByUserOk() (*BusinessAccessUserSummary, bool) {
	if o == nil {
		return nil, false
	}
	return o.CreatedByUser.Get(), o.CreatedByUser.IsSet()
}

// HasCreatedByUser returns a boolean if a field has been set.
func (o *UserBusinessRoleBinding) HasCreatedByUser() bool {
	if o != nil && o.CreatedByUser.IsSet() {
		return true
	}

	return false
}

// SetCreatedByUser gets a reference to the given NullableBusinessAccessUserSummary and assigns it to the CreatedByUser field.
func (o *UserBusinessRoleBinding) SetCreatedByUser(v BusinessAccessUserSummary) {
	o.CreatedByUser.Set(&v)
}
// SetCreatedByUserNil sets the value for CreatedByUser to be an explicit nil
func (o *UserBusinessRoleBinding) SetCreatedByUserNil() {
	o.CreatedByUser.Set(nil)
}

// UnsetCreatedByUser ensures that no value is present for CreatedByUser, not even an explicit nil
func (o *UserBusinessRoleBinding) UnsetCreatedByUser() {
	o.CreatedByUser.Unset()
}

// GetCreatedTime returns the CreatedTime field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UserBusinessRoleBinding) GetCreatedTime() int32 {
	if o == nil || IsNil(o.CreatedTime.Get()) {
		var ret int32
		return ret
	}
	return *o.CreatedTime.Get()
}

// GetCreatedTimeOk returns a tuple with the CreatedTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UserBusinessRoleBinding) GetCreatedTimeOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.CreatedTime.Get(), o.CreatedTime.IsSet()
}

// HasCreatedTime returns a boolean if a field has been set.
func (o *UserBusinessRoleBinding) HasCreatedTime() bool {
	if o != nil && o.CreatedTime.IsSet() {
		return true
	}

	return false
}

// SetCreatedTime gets a reference to the given NullableInt32 and assigns it to the CreatedTime field.
func (o *UserBusinessRoleBinding) SetCreatedTime(v int32) {
	o.CreatedTime.Set(&v)
}
// SetCreatedTimeNil sets the value for CreatedTime to be an explicit nil
func (o *UserBusinessRoleBinding) SetCreatedTimeNil() {
	o.CreatedTime.Set(nil)
}

// UnsetCreatedTime ensures that no value is present for CreatedTime, not even an explicit nil
func (o *UserBusinessRoleBinding) UnsetCreatedTime() {
	o.CreatedTime.Unset()
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *UserBusinessRoleBinding) GetId() string {
	if o == nil || IsNil(o.Id) {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserBusinessRoleBinding) GetIdOk() (*string, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *UserBusinessRoleBinding) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
func (o *UserBusinessRoleBinding) SetId(v string) {
	o.Id = &v
}

// GetIsSharedPartner returns the IsSharedPartner field value if set, zero value otherwise.
func (o *UserBusinessRoleBinding) GetIsSharedPartner() bool {
	if o == nil || IsNil(o.IsSharedPartner) {
		var ret bool
		return ret
	}
	return *o.IsSharedPartner
}

// GetIsSharedPartnerOk returns a tuple with the IsSharedPartner field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UserBusinessRoleBinding) GetIsSharedPartnerOk() (*bool, bool) {
	if o == nil || IsNil(o.IsSharedPartner) {
		return nil, false
	}
	return o.IsSharedPartner, true
}

// HasIsSharedPartner returns a boolean if a field has been set.
func (o *UserBusinessRoleBinding) HasIsSharedPartner() bool {
	if o != nil && !IsNil(o.IsSharedPartner) {
		return true
	}

	return false
}

// SetIsSharedPartner gets a reference to the given bool and assigns it to the IsSharedPartner field.
func (o *UserBusinessRoleBinding) SetIsSharedPartner(v bool) {
	o.IsSharedPartner = &v
}

// GetUser returns the User field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UserBusinessRoleBinding) GetUser() BusinessAccessUserSummary {
	if o == nil || IsNil(o.User.Get()) {
		var ret BusinessAccessUserSummary
		return ret
	}
	return *o.User.Get()
}

// GetUserOk returns a tuple with the User field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UserBusinessRoleBinding) GetUserOk() (*BusinessAccessUserSummary, bool) {
	if o == nil {
		return nil, false
	}
	return o.User.Get(), o.User.IsSet()
}

// HasUser returns a boolean if a field has been set.
func (o *UserBusinessRoleBinding) HasUser() bool {
	if o != nil && o.User.IsSet() {
		return true
	}

	return false
}

// SetUser gets a reference to the given NullableBusinessAccessUserSummary and assigns it to the User field.
func (o *UserBusinessRoleBinding) SetUser(v BusinessAccessUserSummary) {
	o.User.Set(&v)
}
// SetUserNil sets the value for User to be an explicit nil
func (o *UserBusinessRoleBinding) SetUserNil() {
	o.User.Set(nil)
}

// UnsetUser ensures that no value is present for User, not even an explicit nil
func (o *UserBusinessRoleBinding) UnsetUser() {
	o.User.Unset()
}

func (o UserBusinessRoleBinding) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o UserBusinessRoleBinding) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if o.AssetsSummary.IsSet() {
		toSerialize["assets_summary"] = o.AssetsSummary.Get()
	}
	if !IsNil(o.BusinessRoles) {
		toSerialize["business_roles"] = o.BusinessRoles
	}
	if o.CreatedByBusiness.IsSet() {
		toSerialize["created_by_business"] = o.CreatedByBusiness.Get()
	}
	if o.CreatedByUser.IsSet() {
		toSerialize["created_by_user"] = o.CreatedByUser.Get()
	}
	if o.CreatedTime.IsSet() {
		toSerialize["created_time"] = o.CreatedTime.Get()
	}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.IsSharedPartner) {
		toSerialize["is_shared_partner"] = o.IsSharedPartner
	}
	if o.User.IsSet() {
		toSerialize["user"] = o.User.Get()
	}
	return toSerialize, nil
}

type NullableUserBusinessRoleBinding struct {
	value *UserBusinessRoleBinding
	isSet bool
}

func (v NullableUserBusinessRoleBinding) Get() *UserBusinessRoleBinding {
	return v.value
}

func (v *NullableUserBusinessRoleBinding) Set(val *UserBusinessRoleBinding) {
	v.value = val
	v.isSet = true
}

func (v NullableUserBusinessRoleBinding) IsSet() bool {
	return v.isSet
}

func (v *NullableUserBusinessRoleBinding) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUserBusinessRoleBinding(val *UserBusinessRoleBinding) *NullableUserBusinessRoleBinding {
	return &NullableUserBusinessRoleBinding{value: val, isSet: true}
}

func (v NullableUserBusinessRoleBinding) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUserBusinessRoleBinding) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


