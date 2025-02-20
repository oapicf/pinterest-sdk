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

// checks if the BulkUpsertRequestUpdate type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &BulkUpsertRequestUpdate{}

// BulkUpsertRequestUpdate Request for creation of entities in bulk.
type BulkUpsertRequestUpdate struct {
	Campaigns []CampaignUpdateRequest `json:"campaigns,omitempty"`
	AdGroups []AdGroupUpdateRequest `json:"ad_groups,omitempty"`
	Ads []AdUpdateRequest `json:"ads,omitempty"`
	ProductGroups []ProductGroupPromotionUpdateRequest `json:"product_groups,omitempty"`
	Keywords []KeywordUpdate `json:"keywords,omitempty"`
}

// NewBulkUpsertRequestUpdate instantiates a new BulkUpsertRequestUpdate object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBulkUpsertRequestUpdate() *BulkUpsertRequestUpdate {
	this := BulkUpsertRequestUpdate{}
	return &this
}

// NewBulkUpsertRequestUpdateWithDefaults instantiates a new BulkUpsertRequestUpdate object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBulkUpsertRequestUpdateWithDefaults() *BulkUpsertRequestUpdate {
	this := BulkUpsertRequestUpdate{}
	return &this
}

// GetCampaigns returns the Campaigns field value if set, zero value otherwise.
func (o *BulkUpsertRequestUpdate) GetCampaigns() []CampaignUpdateRequest {
	if o == nil || IsNil(o.Campaigns) {
		var ret []CampaignUpdateRequest
		return ret
	}
	return o.Campaigns
}

// GetCampaignsOk returns a tuple with the Campaigns field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BulkUpsertRequestUpdate) GetCampaignsOk() ([]CampaignUpdateRequest, bool) {
	if o == nil || IsNil(o.Campaigns) {
		return nil, false
	}
	return o.Campaigns, true
}

// HasCampaigns returns a boolean if a field has been set.
func (o *BulkUpsertRequestUpdate) HasCampaigns() bool {
	if o != nil && !IsNil(o.Campaigns) {
		return true
	}

	return false
}

// SetCampaigns gets a reference to the given []CampaignUpdateRequest and assigns it to the Campaigns field.
func (o *BulkUpsertRequestUpdate) SetCampaigns(v []CampaignUpdateRequest) {
	o.Campaigns = v
}

// GetAdGroups returns the AdGroups field value if set, zero value otherwise.
func (o *BulkUpsertRequestUpdate) GetAdGroups() []AdGroupUpdateRequest {
	if o == nil || IsNil(o.AdGroups) {
		var ret []AdGroupUpdateRequest
		return ret
	}
	return o.AdGroups
}

// GetAdGroupsOk returns a tuple with the AdGroups field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BulkUpsertRequestUpdate) GetAdGroupsOk() ([]AdGroupUpdateRequest, bool) {
	if o == nil || IsNil(o.AdGroups) {
		return nil, false
	}
	return o.AdGroups, true
}

// HasAdGroups returns a boolean if a field has been set.
func (o *BulkUpsertRequestUpdate) HasAdGroups() bool {
	if o != nil && !IsNil(o.AdGroups) {
		return true
	}

	return false
}

// SetAdGroups gets a reference to the given []AdGroupUpdateRequest and assigns it to the AdGroups field.
func (o *BulkUpsertRequestUpdate) SetAdGroups(v []AdGroupUpdateRequest) {
	o.AdGroups = v
}

// GetAds returns the Ads field value if set, zero value otherwise.
func (o *BulkUpsertRequestUpdate) GetAds() []AdUpdateRequest {
	if o == nil || IsNil(o.Ads) {
		var ret []AdUpdateRequest
		return ret
	}
	return o.Ads
}

// GetAdsOk returns a tuple with the Ads field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BulkUpsertRequestUpdate) GetAdsOk() ([]AdUpdateRequest, bool) {
	if o == nil || IsNil(o.Ads) {
		return nil, false
	}
	return o.Ads, true
}

// HasAds returns a boolean if a field has been set.
func (o *BulkUpsertRequestUpdate) HasAds() bool {
	if o != nil && !IsNil(o.Ads) {
		return true
	}

	return false
}

// SetAds gets a reference to the given []AdUpdateRequest and assigns it to the Ads field.
func (o *BulkUpsertRequestUpdate) SetAds(v []AdUpdateRequest) {
	o.Ads = v
}

// GetProductGroups returns the ProductGroups field value if set, zero value otherwise.
func (o *BulkUpsertRequestUpdate) GetProductGroups() []ProductGroupPromotionUpdateRequest {
	if o == nil || IsNil(o.ProductGroups) {
		var ret []ProductGroupPromotionUpdateRequest
		return ret
	}
	return o.ProductGroups
}

// GetProductGroupsOk returns a tuple with the ProductGroups field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BulkUpsertRequestUpdate) GetProductGroupsOk() ([]ProductGroupPromotionUpdateRequest, bool) {
	if o == nil || IsNil(o.ProductGroups) {
		return nil, false
	}
	return o.ProductGroups, true
}

// HasProductGroups returns a boolean if a field has been set.
func (o *BulkUpsertRequestUpdate) HasProductGroups() bool {
	if o != nil && !IsNil(o.ProductGroups) {
		return true
	}

	return false
}

// SetProductGroups gets a reference to the given []ProductGroupPromotionUpdateRequest and assigns it to the ProductGroups field.
func (o *BulkUpsertRequestUpdate) SetProductGroups(v []ProductGroupPromotionUpdateRequest) {
	o.ProductGroups = v
}

// GetKeywords returns the Keywords field value if set, zero value otherwise.
func (o *BulkUpsertRequestUpdate) GetKeywords() []KeywordUpdate {
	if o == nil || IsNil(o.Keywords) {
		var ret []KeywordUpdate
		return ret
	}
	return o.Keywords
}

// GetKeywordsOk returns a tuple with the Keywords field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BulkUpsertRequestUpdate) GetKeywordsOk() ([]KeywordUpdate, bool) {
	if o == nil || IsNil(o.Keywords) {
		return nil, false
	}
	return o.Keywords, true
}

// HasKeywords returns a boolean if a field has been set.
func (o *BulkUpsertRequestUpdate) HasKeywords() bool {
	if o != nil && !IsNil(o.Keywords) {
		return true
	}

	return false
}

// SetKeywords gets a reference to the given []KeywordUpdate and assigns it to the Keywords field.
func (o *BulkUpsertRequestUpdate) SetKeywords(v []KeywordUpdate) {
	o.Keywords = v
}

func (o BulkUpsertRequestUpdate) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o BulkUpsertRequestUpdate) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Campaigns) {
		toSerialize["campaigns"] = o.Campaigns
	}
	if !IsNil(o.AdGroups) {
		toSerialize["ad_groups"] = o.AdGroups
	}
	if !IsNil(o.Ads) {
		toSerialize["ads"] = o.Ads
	}
	if !IsNil(o.ProductGroups) {
		toSerialize["product_groups"] = o.ProductGroups
	}
	if !IsNil(o.Keywords) {
		toSerialize["keywords"] = o.Keywords
	}
	return toSerialize, nil
}

type NullableBulkUpsertRequestUpdate struct {
	value *BulkUpsertRequestUpdate
	isSet bool
}

func (v NullableBulkUpsertRequestUpdate) Get() *BulkUpsertRequestUpdate {
	return v.value
}

func (v *NullableBulkUpsertRequestUpdate) Set(val *BulkUpsertRequestUpdate) {
	v.value = val
	v.isSet = true
}

func (v NullableBulkUpsertRequestUpdate) IsSet() bool {
	return v.isSet
}

func (v *NullableBulkUpsertRequestUpdate) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBulkUpsertRequestUpdate(val *BulkUpsertRequestUpdate) *NullableBulkUpsertRequestUpdate {
	return &NullableBulkUpsertRequestUpdate{value: val, isSet: true}
}

func (v NullableBulkUpsertRequestUpdate) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBulkUpsertRequestUpdate) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


