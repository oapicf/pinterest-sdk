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

// checks if the LeadFormResponse type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &LeadFormResponse{}

// LeadFormResponse struct for LeadFormResponse
type LeadFormResponse struct {
	// Internal name of the lead form.
	Name NullableString `json:"name,omitempty"`
	// A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
	PrivacyPolicyLink NullableString `json:"privacy_policy_link,omitempty"`
	// Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO
	HasAcceptedTerms *bool `json:"has_accepted_terms,omitempty"`
	// A message for people who complete the form to let them know what happens next.
	CompletionMessage NullableString `json:"completion_message,omitempty"`
	Status *LeadFormStatus `json:"status,omitempty"`
	// Additional disclosure language to be included in the lead form.
	DisclosureLanguage NullableString `json:"disclosure_language,omitempty"`
	// List of questions to be displayed on the lead form.
	Questions []LeadFormQuestion `json:"questions,omitempty"`
	// List of additional policy links to be displayed on the lead form.
	PolicyLinks []LeadFormCommonPolicyLinksInner `json:"policy_links,omitempty"`
	// The ID of this lead form
	Id *string `json:"id,omitempty" validate:"regexp=^\\\\d+$"`
	// The Ad Account ID that this lead form belongs to.
	AdAccountId *string `json:"ad_account_id,omitempty" validate:"regexp=^\\\\d+$"`
	// Lead form creation time. Unix timestamp in seconds.
	CreatedTime *int32 `json:"created_time,omitempty"`
	// Last update time. Unix timestamp in seconds.
	UpdatedTime *int32 `json:"updated_time,omitempty"`
}

// NewLeadFormResponse instantiates a new LeadFormResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewLeadFormResponse() *LeadFormResponse {
	this := LeadFormResponse{}
	return &this
}

// NewLeadFormResponseWithDefaults instantiates a new LeadFormResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewLeadFormResponseWithDefaults() *LeadFormResponse {
	this := LeadFormResponse{}
	return &this
}

// GetName returns the Name field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *LeadFormResponse) GetName() string {
	if o == nil || IsNil(o.Name.Get()) {
		var ret string
		return ret
	}
	return *o.Name.Get()
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *LeadFormResponse) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Name.Get(), o.Name.IsSet()
}

// HasName returns a boolean if a field has been set.
func (o *LeadFormResponse) HasName() bool {
	if o != nil && o.Name.IsSet() {
		return true
	}

	return false
}

// SetName gets a reference to the given NullableString and assigns it to the Name field.
func (o *LeadFormResponse) SetName(v string) {
	o.Name.Set(&v)
}
// SetNameNil sets the value for Name to be an explicit nil
func (o *LeadFormResponse) SetNameNil() {
	o.Name.Set(nil)
}

// UnsetName ensures that no value is present for Name, not even an explicit nil
func (o *LeadFormResponse) UnsetName() {
	o.Name.Unset()
}

// GetPrivacyPolicyLink returns the PrivacyPolicyLink field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *LeadFormResponse) GetPrivacyPolicyLink() string {
	if o == nil || IsNil(o.PrivacyPolicyLink.Get()) {
		var ret string
		return ret
	}
	return *o.PrivacyPolicyLink.Get()
}

// GetPrivacyPolicyLinkOk returns a tuple with the PrivacyPolicyLink field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *LeadFormResponse) GetPrivacyPolicyLinkOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.PrivacyPolicyLink.Get(), o.PrivacyPolicyLink.IsSet()
}

// HasPrivacyPolicyLink returns a boolean if a field has been set.
func (o *LeadFormResponse) HasPrivacyPolicyLink() bool {
	if o != nil && o.PrivacyPolicyLink.IsSet() {
		return true
	}

	return false
}

// SetPrivacyPolicyLink gets a reference to the given NullableString and assigns it to the PrivacyPolicyLink field.
func (o *LeadFormResponse) SetPrivacyPolicyLink(v string) {
	o.PrivacyPolicyLink.Set(&v)
}
// SetPrivacyPolicyLinkNil sets the value for PrivacyPolicyLink to be an explicit nil
func (o *LeadFormResponse) SetPrivacyPolicyLinkNil() {
	o.PrivacyPolicyLink.Set(nil)
}

// UnsetPrivacyPolicyLink ensures that no value is present for PrivacyPolicyLink, not even an explicit nil
func (o *LeadFormResponse) UnsetPrivacyPolicyLink() {
	o.PrivacyPolicyLink.Unset()
}

// GetHasAcceptedTerms returns the HasAcceptedTerms field value if set, zero value otherwise.
func (o *LeadFormResponse) GetHasAcceptedTerms() bool {
	if o == nil || IsNil(o.HasAcceptedTerms) {
		var ret bool
		return ret
	}
	return *o.HasAcceptedTerms
}

// GetHasAcceptedTermsOk returns a tuple with the HasAcceptedTerms field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LeadFormResponse) GetHasAcceptedTermsOk() (*bool, bool) {
	if o == nil || IsNil(o.HasAcceptedTerms) {
		return nil, false
	}
	return o.HasAcceptedTerms, true
}

// HasHasAcceptedTerms returns a boolean if a field has been set.
func (o *LeadFormResponse) HasHasAcceptedTerms() bool {
	if o != nil && !IsNil(o.HasAcceptedTerms) {
		return true
	}

	return false
}

// SetHasAcceptedTerms gets a reference to the given bool and assigns it to the HasAcceptedTerms field.
func (o *LeadFormResponse) SetHasAcceptedTerms(v bool) {
	o.HasAcceptedTerms = &v
}

// GetCompletionMessage returns the CompletionMessage field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *LeadFormResponse) GetCompletionMessage() string {
	if o == nil || IsNil(o.CompletionMessage.Get()) {
		var ret string
		return ret
	}
	return *o.CompletionMessage.Get()
}

// GetCompletionMessageOk returns a tuple with the CompletionMessage field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *LeadFormResponse) GetCompletionMessageOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CompletionMessage.Get(), o.CompletionMessage.IsSet()
}

// HasCompletionMessage returns a boolean if a field has been set.
func (o *LeadFormResponse) HasCompletionMessage() bool {
	if o != nil && o.CompletionMessage.IsSet() {
		return true
	}

	return false
}

// SetCompletionMessage gets a reference to the given NullableString and assigns it to the CompletionMessage field.
func (o *LeadFormResponse) SetCompletionMessage(v string) {
	o.CompletionMessage.Set(&v)
}
// SetCompletionMessageNil sets the value for CompletionMessage to be an explicit nil
func (o *LeadFormResponse) SetCompletionMessageNil() {
	o.CompletionMessage.Set(nil)
}

// UnsetCompletionMessage ensures that no value is present for CompletionMessage, not even an explicit nil
func (o *LeadFormResponse) UnsetCompletionMessage() {
	o.CompletionMessage.Unset()
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *LeadFormResponse) GetStatus() LeadFormStatus {
	if o == nil || IsNil(o.Status) {
		var ret LeadFormStatus
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LeadFormResponse) GetStatusOk() (*LeadFormStatus, bool) {
	if o == nil || IsNil(o.Status) {
		return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *LeadFormResponse) HasStatus() bool {
	if o != nil && !IsNil(o.Status) {
		return true
	}

	return false
}

// SetStatus gets a reference to the given LeadFormStatus and assigns it to the Status field.
func (o *LeadFormResponse) SetStatus(v LeadFormStatus) {
	o.Status = &v
}

// GetDisclosureLanguage returns the DisclosureLanguage field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *LeadFormResponse) GetDisclosureLanguage() string {
	if o == nil || IsNil(o.DisclosureLanguage.Get()) {
		var ret string
		return ret
	}
	return *o.DisclosureLanguage.Get()
}

// GetDisclosureLanguageOk returns a tuple with the DisclosureLanguage field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *LeadFormResponse) GetDisclosureLanguageOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.DisclosureLanguage.Get(), o.DisclosureLanguage.IsSet()
}

// HasDisclosureLanguage returns a boolean if a field has been set.
func (o *LeadFormResponse) HasDisclosureLanguage() bool {
	if o != nil && o.DisclosureLanguage.IsSet() {
		return true
	}

	return false
}

// SetDisclosureLanguage gets a reference to the given NullableString and assigns it to the DisclosureLanguage field.
func (o *LeadFormResponse) SetDisclosureLanguage(v string) {
	o.DisclosureLanguage.Set(&v)
}
// SetDisclosureLanguageNil sets the value for DisclosureLanguage to be an explicit nil
func (o *LeadFormResponse) SetDisclosureLanguageNil() {
	o.DisclosureLanguage.Set(nil)
}

// UnsetDisclosureLanguage ensures that no value is present for DisclosureLanguage, not even an explicit nil
func (o *LeadFormResponse) UnsetDisclosureLanguage() {
	o.DisclosureLanguage.Unset()
}

// GetQuestions returns the Questions field value if set, zero value otherwise.
func (o *LeadFormResponse) GetQuestions() []LeadFormQuestion {
	if o == nil || IsNil(o.Questions) {
		var ret []LeadFormQuestion
		return ret
	}
	return o.Questions
}

// GetQuestionsOk returns a tuple with the Questions field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LeadFormResponse) GetQuestionsOk() ([]LeadFormQuestion, bool) {
	if o == nil || IsNil(o.Questions) {
		return nil, false
	}
	return o.Questions, true
}

// HasQuestions returns a boolean if a field has been set.
func (o *LeadFormResponse) HasQuestions() bool {
	if o != nil && !IsNil(o.Questions) {
		return true
	}

	return false
}

// SetQuestions gets a reference to the given []LeadFormQuestion and assigns it to the Questions field.
func (o *LeadFormResponse) SetQuestions(v []LeadFormQuestion) {
	o.Questions = v
}

// GetPolicyLinks returns the PolicyLinks field value if set, zero value otherwise.
func (o *LeadFormResponse) GetPolicyLinks() []LeadFormCommonPolicyLinksInner {
	if o == nil || IsNil(o.PolicyLinks) {
		var ret []LeadFormCommonPolicyLinksInner
		return ret
	}
	return o.PolicyLinks
}

// GetPolicyLinksOk returns a tuple with the PolicyLinks field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LeadFormResponse) GetPolicyLinksOk() ([]LeadFormCommonPolicyLinksInner, bool) {
	if o == nil || IsNil(o.PolicyLinks) {
		return nil, false
	}
	return o.PolicyLinks, true
}

// HasPolicyLinks returns a boolean if a field has been set.
func (o *LeadFormResponse) HasPolicyLinks() bool {
	if o != nil && !IsNil(o.PolicyLinks) {
		return true
	}

	return false
}

// SetPolicyLinks gets a reference to the given []LeadFormCommonPolicyLinksInner and assigns it to the PolicyLinks field.
func (o *LeadFormResponse) SetPolicyLinks(v []LeadFormCommonPolicyLinksInner) {
	o.PolicyLinks = v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *LeadFormResponse) GetId() string {
	if o == nil || IsNil(o.Id) {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LeadFormResponse) GetIdOk() (*string, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *LeadFormResponse) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
func (o *LeadFormResponse) SetId(v string) {
	o.Id = &v
}

// GetAdAccountId returns the AdAccountId field value if set, zero value otherwise.
func (o *LeadFormResponse) GetAdAccountId() string {
	if o == nil || IsNil(o.AdAccountId) {
		var ret string
		return ret
	}
	return *o.AdAccountId
}

// GetAdAccountIdOk returns a tuple with the AdAccountId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LeadFormResponse) GetAdAccountIdOk() (*string, bool) {
	if o == nil || IsNil(o.AdAccountId) {
		return nil, false
	}
	return o.AdAccountId, true
}

// HasAdAccountId returns a boolean if a field has been set.
func (o *LeadFormResponse) HasAdAccountId() bool {
	if o != nil && !IsNil(o.AdAccountId) {
		return true
	}

	return false
}

// SetAdAccountId gets a reference to the given string and assigns it to the AdAccountId field.
func (o *LeadFormResponse) SetAdAccountId(v string) {
	o.AdAccountId = &v
}

// GetCreatedTime returns the CreatedTime field value if set, zero value otherwise.
func (o *LeadFormResponse) GetCreatedTime() int32 {
	if o == nil || IsNil(o.CreatedTime) {
		var ret int32
		return ret
	}
	return *o.CreatedTime
}

// GetCreatedTimeOk returns a tuple with the CreatedTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LeadFormResponse) GetCreatedTimeOk() (*int32, bool) {
	if o == nil || IsNil(o.CreatedTime) {
		return nil, false
	}
	return o.CreatedTime, true
}

// HasCreatedTime returns a boolean if a field has been set.
func (o *LeadFormResponse) HasCreatedTime() bool {
	if o != nil && !IsNil(o.CreatedTime) {
		return true
	}

	return false
}

// SetCreatedTime gets a reference to the given int32 and assigns it to the CreatedTime field.
func (o *LeadFormResponse) SetCreatedTime(v int32) {
	o.CreatedTime = &v
}

// GetUpdatedTime returns the UpdatedTime field value if set, zero value otherwise.
func (o *LeadFormResponse) GetUpdatedTime() int32 {
	if o == nil || IsNil(o.UpdatedTime) {
		var ret int32
		return ret
	}
	return *o.UpdatedTime
}

// GetUpdatedTimeOk returns a tuple with the UpdatedTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LeadFormResponse) GetUpdatedTimeOk() (*int32, bool) {
	if o == nil || IsNil(o.UpdatedTime) {
		return nil, false
	}
	return o.UpdatedTime, true
}

// HasUpdatedTime returns a boolean if a field has been set.
func (o *LeadFormResponse) HasUpdatedTime() bool {
	if o != nil && !IsNil(o.UpdatedTime) {
		return true
	}

	return false
}

// SetUpdatedTime gets a reference to the given int32 and assigns it to the UpdatedTime field.
func (o *LeadFormResponse) SetUpdatedTime(v int32) {
	o.UpdatedTime = &v
}

func (o LeadFormResponse) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o LeadFormResponse) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if o.Name.IsSet() {
		toSerialize["name"] = o.Name.Get()
	}
	if o.PrivacyPolicyLink.IsSet() {
		toSerialize["privacy_policy_link"] = o.PrivacyPolicyLink.Get()
	}
	if !IsNil(o.HasAcceptedTerms) {
		toSerialize["has_accepted_terms"] = o.HasAcceptedTerms
	}
	if o.CompletionMessage.IsSet() {
		toSerialize["completion_message"] = o.CompletionMessage.Get()
	}
	if !IsNil(o.Status) {
		toSerialize["status"] = o.Status
	}
	if o.DisclosureLanguage.IsSet() {
		toSerialize["disclosure_language"] = o.DisclosureLanguage.Get()
	}
	if !IsNil(o.Questions) {
		toSerialize["questions"] = o.Questions
	}
	if !IsNil(o.PolicyLinks) {
		toSerialize["policy_links"] = o.PolicyLinks
	}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.AdAccountId) {
		toSerialize["ad_account_id"] = o.AdAccountId
	}
	if !IsNil(o.CreatedTime) {
		toSerialize["created_time"] = o.CreatedTime
	}
	if !IsNil(o.UpdatedTime) {
		toSerialize["updated_time"] = o.UpdatedTime
	}
	return toSerialize, nil
}

type NullableLeadFormResponse struct {
	value *LeadFormResponse
	isSet bool
}

func (v NullableLeadFormResponse) Get() *LeadFormResponse {
	return v.value
}

func (v *NullableLeadFormResponse) Set(val *LeadFormResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableLeadFormResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableLeadFormResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableLeadFormResponse(val *LeadFormResponse) *NullableLeadFormResponse {
	return &NullableLeadFormResponse{value: val, isSet: true}
}

func (v NullableLeadFormResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableLeadFormResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


