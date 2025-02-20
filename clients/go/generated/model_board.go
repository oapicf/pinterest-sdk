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
	"time"
	"bytes"
	"fmt"
)

// checks if the Board type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Board{}

// Board Board
type Board struct {
	Id *string `json:"id,omitempty"`
	// Date and time of board creation.
	CreatedAt *time.Time `json:"created_at,omitempty"`
	// Date and time of last board pins modified.
	BoardPinsModifiedAt *time.Time `json:"board_pins_modified_at,omitempty"`
	Name string `json:"name"`
	Description NullableString `json:"description,omitempty"`
	// Count of collaborators on the board.
	CollaboratorCount *int32 `json:"collaborator_count,omitempty"`
	// Count of pins on the board.
	PinCount *int32 `json:"pin_count,omitempty"`
	// Board follower count.
	FollowerCount *int32 `json:"follower_count,omitempty"`
	Media *BoardMedia `json:"media,omitempty"`
	Owner *BoardOwner `json:"owner,omitempty"`
	// Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
	Privacy *string `json:"privacy,omitempty"`
}

type _Board Board

// NewBoard instantiates a new Board object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBoard(name string) *Board {
	this := Board{}
	this.Name = name
	var privacy string = "PUBLIC"
	this.Privacy = &privacy
	return &this
}

// NewBoardWithDefaults instantiates a new Board object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBoardWithDefaults() *Board {
	this := Board{}
	var privacy string = "PUBLIC"
	this.Privacy = &privacy
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *Board) GetId() string {
	if o == nil || IsNil(o.Id) {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Board) GetIdOk() (*string, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *Board) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
func (o *Board) SetId(v string) {
	o.Id = &v
}

// GetCreatedAt returns the CreatedAt field value if set, zero value otherwise.
func (o *Board) GetCreatedAt() time.Time {
	if o == nil || IsNil(o.CreatedAt) {
		var ret time.Time
		return ret
	}
	return *o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Board) GetCreatedAtOk() (*time.Time, bool) {
	if o == nil || IsNil(o.CreatedAt) {
		return nil, false
	}
	return o.CreatedAt, true
}

// HasCreatedAt returns a boolean if a field has been set.
func (o *Board) HasCreatedAt() bool {
	if o != nil && !IsNil(o.CreatedAt) {
		return true
	}

	return false
}

// SetCreatedAt gets a reference to the given time.Time and assigns it to the CreatedAt field.
func (o *Board) SetCreatedAt(v time.Time) {
	o.CreatedAt = &v
}

// GetBoardPinsModifiedAt returns the BoardPinsModifiedAt field value if set, zero value otherwise.
func (o *Board) GetBoardPinsModifiedAt() time.Time {
	if o == nil || IsNil(o.BoardPinsModifiedAt) {
		var ret time.Time
		return ret
	}
	return *o.BoardPinsModifiedAt
}

// GetBoardPinsModifiedAtOk returns a tuple with the BoardPinsModifiedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Board) GetBoardPinsModifiedAtOk() (*time.Time, bool) {
	if o == nil || IsNil(o.BoardPinsModifiedAt) {
		return nil, false
	}
	return o.BoardPinsModifiedAt, true
}

// HasBoardPinsModifiedAt returns a boolean if a field has been set.
func (o *Board) HasBoardPinsModifiedAt() bool {
	if o != nil && !IsNil(o.BoardPinsModifiedAt) {
		return true
	}

	return false
}

// SetBoardPinsModifiedAt gets a reference to the given time.Time and assigns it to the BoardPinsModifiedAt field.
func (o *Board) SetBoardPinsModifiedAt(v time.Time) {
	o.BoardPinsModifiedAt = &v
}

// GetName returns the Name field value
func (o *Board) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *Board) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *Board) SetName(v string) {
	o.Name = v
}

// GetDescription returns the Description field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *Board) GetDescription() string {
	if o == nil || IsNil(o.Description.Get()) {
		var ret string
		return ret
	}
	return *o.Description.Get()
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *Board) GetDescriptionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Description.Get(), o.Description.IsSet()
}

// HasDescription returns a boolean if a field has been set.
func (o *Board) HasDescription() bool {
	if o != nil && o.Description.IsSet() {
		return true
	}

	return false
}

// SetDescription gets a reference to the given NullableString and assigns it to the Description field.
func (o *Board) SetDescription(v string) {
	o.Description.Set(&v)
}
// SetDescriptionNil sets the value for Description to be an explicit nil
func (o *Board) SetDescriptionNil() {
	o.Description.Set(nil)
}

// UnsetDescription ensures that no value is present for Description, not even an explicit nil
func (o *Board) UnsetDescription() {
	o.Description.Unset()
}

// GetCollaboratorCount returns the CollaboratorCount field value if set, zero value otherwise.
func (o *Board) GetCollaboratorCount() int32 {
	if o == nil || IsNil(o.CollaboratorCount) {
		var ret int32
		return ret
	}
	return *o.CollaboratorCount
}

// GetCollaboratorCountOk returns a tuple with the CollaboratorCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Board) GetCollaboratorCountOk() (*int32, bool) {
	if o == nil || IsNil(o.CollaboratorCount) {
		return nil, false
	}
	return o.CollaboratorCount, true
}

// HasCollaboratorCount returns a boolean if a field has been set.
func (o *Board) HasCollaboratorCount() bool {
	if o != nil && !IsNil(o.CollaboratorCount) {
		return true
	}

	return false
}

// SetCollaboratorCount gets a reference to the given int32 and assigns it to the CollaboratorCount field.
func (o *Board) SetCollaboratorCount(v int32) {
	o.CollaboratorCount = &v
}

// GetPinCount returns the PinCount field value if set, zero value otherwise.
func (o *Board) GetPinCount() int32 {
	if o == nil || IsNil(o.PinCount) {
		var ret int32
		return ret
	}
	return *o.PinCount
}

// GetPinCountOk returns a tuple with the PinCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Board) GetPinCountOk() (*int32, bool) {
	if o == nil || IsNil(o.PinCount) {
		return nil, false
	}
	return o.PinCount, true
}

// HasPinCount returns a boolean if a field has been set.
func (o *Board) HasPinCount() bool {
	if o != nil && !IsNil(o.PinCount) {
		return true
	}

	return false
}

// SetPinCount gets a reference to the given int32 and assigns it to the PinCount field.
func (o *Board) SetPinCount(v int32) {
	o.PinCount = &v
}

// GetFollowerCount returns the FollowerCount field value if set, zero value otherwise.
func (o *Board) GetFollowerCount() int32 {
	if o == nil || IsNil(o.FollowerCount) {
		var ret int32
		return ret
	}
	return *o.FollowerCount
}

// GetFollowerCountOk returns a tuple with the FollowerCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Board) GetFollowerCountOk() (*int32, bool) {
	if o == nil || IsNil(o.FollowerCount) {
		return nil, false
	}
	return o.FollowerCount, true
}

// HasFollowerCount returns a boolean if a field has been set.
func (o *Board) HasFollowerCount() bool {
	if o != nil && !IsNil(o.FollowerCount) {
		return true
	}

	return false
}

// SetFollowerCount gets a reference to the given int32 and assigns it to the FollowerCount field.
func (o *Board) SetFollowerCount(v int32) {
	o.FollowerCount = &v
}

// GetMedia returns the Media field value if set, zero value otherwise.
func (o *Board) GetMedia() BoardMedia {
	if o == nil || IsNil(o.Media) {
		var ret BoardMedia
		return ret
	}
	return *o.Media
}

// GetMediaOk returns a tuple with the Media field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Board) GetMediaOk() (*BoardMedia, bool) {
	if o == nil || IsNil(o.Media) {
		return nil, false
	}
	return o.Media, true
}

// HasMedia returns a boolean if a field has been set.
func (o *Board) HasMedia() bool {
	if o != nil && !IsNil(o.Media) {
		return true
	}

	return false
}

// SetMedia gets a reference to the given BoardMedia and assigns it to the Media field.
func (o *Board) SetMedia(v BoardMedia) {
	o.Media = &v
}

// GetOwner returns the Owner field value if set, zero value otherwise.
func (o *Board) GetOwner() BoardOwner {
	if o == nil || IsNil(o.Owner) {
		var ret BoardOwner
		return ret
	}
	return *o.Owner
}

// GetOwnerOk returns a tuple with the Owner field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Board) GetOwnerOk() (*BoardOwner, bool) {
	if o == nil || IsNil(o.Owner) {
		return nil, false
	}
	return o.Owner, true
}

// HasOwner returns a boolean if a field has been set.
func (o *Board) HasOwner() bool {
	if o != nil && !IsNil(o.Owner) {
		return true
	}

	return false
}

// SetOwner gets a reference to the given BoardOwner and assigns it to the Owner field.
func (o *Board) SetOwner(v BoardOwner) {
	o.Owner = &v
}

// GetPrivacy returns the Privacy field value if set, zero value otherwise.
func (o *Board) GetPrivacy() string {
	if o == nil || IsNil(o.Privacy) {
		var ret string
		return ret
	}
	return *o.Privacy
}

// GetPrivacyOk returns a tuple with the Privacy field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Board) GetPrivacyOk() (*string, bool) {
	if o == nil || IsNil(o.Privacy) {
		return nil, false
	}
	return o.Privacy, true
}

// HasPrivacy returns a boolean if a field has been set.
func (o *Board) HasPrivacy() bool {
	if o != nil && !IsNil(o.Privacy) {
		return true
	}

	return false
}

// SetPrivacy gets a reference to the given string and assigns it to the Privacy field.
func (o *Board) SetPrivacy(v string) {
	o.Privacy = &v
}

func (o Board) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Board) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.CreatedAt) {
		toSerialize["created_at"] = o.CreatedAt
	}
	if !IsNil(o.BoardPinsModifiedAt) {
		toSerialize["board_pins_modified_at"] = o.BoardPinsModifiedAt
	}
	toSerialize["name"] = o.Name
	if o.Description.IsSet() {
		toSerialize["description"] = o.Description.Get()
	}
	if !IsNil(o.CollaboratorCount) {
		toSerialize["collaborator_count"] = o.CollaboratorCount
	}
	if !IsNil(o.PinCount) {
		toSerialize["pin_count"] = o.PinCount
	}
	if !IsNil(o.FollowerCount) {
		toSerialize["follower_count"] = o.FollowerCount
	}
	if !IsNil(o.Media) {
		toSerialize["media"] = o.Media
	}
	if !IsNil(o.Owner) {
		toSerialize["owner"] = o.Owner
	}
	if !IsNil(o.Privacy) {
		toSerialize["privacy"] = o.Privacy
	}
	return toSerialize, nil
}

func (o *Board) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"name",
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

	varBoard := _Board{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varBoard)

	if err != nil {
		return err
	}

	*o = Board(varBoard)

	return err
}

type NullableBoard struct {
	value *Board
	isSet bool
}

func (v NullableBoard) Get() *Board {
	return v.value
}

func (v *NullableBoard) Set(val *Board) {
	v.value = val
	v.isSet = true
}

func (v NullableBoard) IsSet() bool {
	return v.isSet
}

func (v *NullableBoard) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBoard(val *Board) *NullableBoard {
	return &NullableBoard{value: val, isSet: true}
}

func (v NullableBoard) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBoard) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


