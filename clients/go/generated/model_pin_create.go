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
)

// checks if the PinCreate type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &PinCreate{}

// PinCreate Pin
type PinCreate struct {
	Id *string `json:"id,omitempty" validate:"regexp=^\\\\d+$"`
	CreatedAt *time.Time `json:"created_at,omitempty"`
	Link NullableString `json:"link,omitempty"`
	Title NullableString `json:"title,omitempty"`
	Description NullableString `json:"description,omitempty"`
	// Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
	DominantColor NullableString `json:"dominant_color,omitempty"`
	AltText NullableString `json:"alt_text,omitempty"`
	// The board to which this Pin belongs.
	BoardId *string `json:"board_id,omitempty" validate:"regexp=^\\\\d+$"`
	// The board section to which this Pin belongs.
	BoardSectionId NullableString `json:"board_section_id,omitempty" validate:"regexp=^\\\\d+$"`
	BoardOwner *BoardOwner `json:"board_owner,omitempty"`
	Media *PinMedia `json:"media,omitempty"`
	MediaSource *PinMediaSource `json:"media_source,omitempty"`
	// The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
	ParentPinId NullableString `json:"parent_pin_id,omitempty" validate:"regexp=^\\\\d+$"`
	// Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
	Note NullableString `json:"note,omitempty"`
}

// NewPinCreate instantiates a new PinCreate object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPinCreate() *PinCreate {
	this := PinCreate{}
	return &this
}

// NewPinCreateWithDefaults instantiates a new PinCreate object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPinCreateWithDefaults() *PinCreate {
	this := PinCreate{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *PinCreate) GetId() string {
	if o == nil || IsNil(o.Id) {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PinCreate) GetIdOk() (*string, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *PinCreate) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
func (o *PinCreate) SetId(v string) {
	o.Id = &v
}

// GetCreatedAt returns the CreatedAt field value if set, zero value otherwise.
func (o *PinCreate) GetCreatedAt() time.Time {
	if o == nil || IsNil(o.CreatedAt) {
		var ret time.Time
		return ret
	}
	return *o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PinCreate) GetCreatedAtOk() (*time.Time, bool) {
	if o == nil || IsNil(o.CreatedAt) {
		return nil, false
	}
	return o.CreatedAt, true
}

// HasCreatedAt returns a boolean if a field has been set.
func (o *PinCreate) HasCreatedAt() bool {
	if o != nil && !IsNil(o.CreatedAt) {
		return true
	}

	return false
}

// SetCreatedAt gets a reference to the given time.Time and assigns it to the CreatedAt field.
func (o *PinCreate) SetCreatedAt(v time.Time) {
	o.CreatedAt = &v
}

// GetLink returns the Link field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PinCreate) GetLink() string {
	if o == nil || IsNil(o.Link.Get()) {
		var ret string
		return ret
	}
	return *o.Link.Get()
}

// GetLinkOk returns a tuple with the Link field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PinCreate) GetLinkOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Link.Get(), o.Link.IsSet()
}

// HasLink returns a boolean if a field has been set.
func (o *PinCreate) HasLink() bool {
	if o != nil && o.Link.IsSet() {
		return true
	}

	return false
}

// SetLink gets a reference to the given NullableString and assigns it to the Link field.
func (o *PinCreate) SetLink(v string) {
	o.Link.Set(&v)
}
// SetLinkNil sets the value for Link to be an explicit nil
func (o *PinCreate) SetLinkNil() {
	o.Link.Set(nil)
}

// UnsetLink ensures that no value is present for Link, not even an explicit nil
func (o *PinCreate) UnsetLink() {
	o.Link.Unset()
}

// GetTitle returns the Title field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PinCreate) GetTitle() string {
	if o == nil || IsNil(o.Title.Get()) {
		var ret string
		return ret
	}
	return *o.Title.Get()
}

// GetTitleOk returns a tuple with the Title field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PinCreate) GetTitleOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Title.Get(), o.Title.IsSet()
}

// HasTitle returns a boolean if a field has been set.
func (o *PinCreate) HasTitle() bool {
	if o != nil && o.Title.IsSet() {
		return true
	}

	return false
}

// SetTitle gets a reference to the given NullableString and assigns it to the Title field.
func (o *PinCreate) SetTitle(v string) {
	o.Title.Set(&v)
}
// SetTitleNil sets the value for Title to be an explicit nil
func (o *PinCreate) SetTitleNil() {
	o.Title.Set(nil)
}

// UnsetTitle ensures that no value is present for Title, not even an explicit nil
func (o *PinCreate) UnsetTitle() {
	o.Title.Unset()
}

// GetDescription returns the Description field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PinCreate) GetDescription() string {
	if o == nil || IsNil(o.Description.Get()) {
		var ret string
		return ret
	}
	return *o.Description.Get()
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PinCreate) GetDescriptionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Description.Get(), o.Description.IsSet()
}

// HasDescription returns a boolean if a field has been set.
func (o *PinCreate) HasDescription() bool {
	if o != nil && o.Description.IsSet() {
		return true
	}

	return false
}

// SetDescription gets a reference to the given NullableString and assigns it to the Description field.
func (o *PinCreate) SetDescription(v string) {
	o.Description.Set(&v)
}
// SetDescriptionNil sets the value for Description to be an explicit nil
func (o *PinCreate) SetDescriptionNil() {
	o.Description.Set(nil)
}

// UnsetDescription ensures that no value is present for Description, not even an explicit nil
func (o *PinCreate) UnsetDescription() {
	o.Description.Unset()
}

// GetDominantColor returns the DominantColor field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PinCreate) GetDominantColor() string {
	if o == nil || IsNil(o.DominantColor.Get()) {
		var ret string
		return ret
	}
	return *o.DominantColor.Get()
}

// GetDominantColorOk returns a tuple with the DominantColor field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PinCreate) GetDominantColorOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.DominantColor.Get(), o.DominantColor.IsSet()
}

// HasDominantColor returns a boolean if a field has been set.
func (o *PinCreate) HasDominantColor() bool {
	if o != nil && o.DominantColor.IsSet() {
		return true
	}

	return false
}

// SetDominantColor gets a reference to the given NullableString and assigns it to the DominantColor field.
func (o *PinCreate) SetDominantColor(v string) {
	o.DominantColor.Set(&v)
}
// SetDominantColorNil sets the value for DominantColor to be an explicit nil
func (o *PinCreate) SetDominantColorNil() {
	o.DominantColor.Set(nil)
}

// UnsetDominantColor ensures that no value is present for DominantColor, not even an explicit nil
func (o *PinCreate) UnsetDominantColor() {
	o.DominantColor.Unset()
}

// GetAltText returns the AltText field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PinCreate) GetAltText() string {
	if o == nil || IsNil(o.AltText.Get()) {
		var ret string
		return ret
	}
	return *o.AltText.Get()
}

// GetAltTextOk returns a tuple with the AltText field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PinCreate) GetAltTextOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.AltText.Get(), o.AltText.IsSet()
}

// HasAltText returns a boolean if a field has been set.
func (o *PinCreate) HasAltText() bool {
	if o != nil && o.AltText.IsSet() {
		return true
	}

	return false
}

// SetAltText gets a reference to the given NullableString and assigns it to the AltText field.
func (o *PinCreate) SetAltText(v string) {
	o.AltText.Set(&v)
}
// SetAltTextNil sets the value for AltText to be an explicit nil
func (o *PinCreate) SetAltTextNil() {
	o.AltText.Set(nil)
}

// UnsetAltText ensures that no value is present for AltText, not even an explicit nil
func (o *PinCreate) UnsetAltText() {
	o.AltText.Unset()
}

// GetBoardId returns the BoardId field value if set, zero value otherwise.
func (o *PinCreate) GetBoardId() string {
	if o == nil || IsNil(o.BoardId) {
		var ret string
		return ret
	}
	return *o.BoardId
}

// GetBoardIdOk returns a tuple with the BoardId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PinCreate) GetBoardIdOk() (*string, bool) {
	if o == nil || IsNil(o.BoardId) {
		return nil, false
	}
	return o.BoardId, true
}

// HasBoardId returns a boolean if a field has been set.
func (o *PinCreate) HasBoardId() bool {
	if o != nil && !IsNil(o.BoardId) {
		return true
	}

	return false
}

// SetBoardId gets a reference to the given string and assigns it to the BoardId field.
func (o *PinCreate) SetBoardId(v string) {
	o.BoardId = &v
}

// GetBoardSectionId returns the BoardSectionId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PinCreate) GetBoardSectionId() string {
	if o == nil || IsNil(o.BoardSectionId.Get()) {
		var ret string
		return ret
	}
	return *o.BoardSectionId.Get()
}

// GetBoardSectionIdOk returns a tuple with the BoardSectionId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PinCreate) GetBoardSectionIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.BoardSectionId.Get(), o.BoardSectionId.IsSet()
}

// HasBoardSectionId returns a boolean if a field has been set.
func (o *PinCreate) HasBoardSectionId() bool {
	if o != nil && o.BoardSectionId.IsSet() {
		return true
	}

	return false
}

// SetBoardSectionId gets a reference to the given NullableString and assigns it to the BoardSectionId field.
func (o *PinCreate) SetBoardSectionId(v string) {
	o.BoardSectionId.Set(&v)
}
// SetBoardSectionIdNil sets the value for BoardSectionId to be an explicit nil
func (o *PinCreate) SetBoardSectionIdNil() {
	o.BoardSectionId.Set(nil)
}

// UnsetBoardSectionId ensures that no value is present for BoardSectionId, not even an explicit nil
func (o *PinCreate) UnsetBoardSectionId() {
	o.BoardSectionId.Unset()
}

// GetBoardOwner returns the BoardOwner field value if set, zero value otherwise.
func (o *PinCreate) GetBoardOwner() BoardOwner {
	if o == nil || IsNil(o.BoardOwner) {
		var ret BoardOwner
		return ret
	}
	return *o.BoardOwner
}

// GetBoardOwnerOk returns a tuple with the BoardOwner field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PinCreate) GetBoardOwnerOk() (*BoardOwner, bool) {
	if o == nil || IsNil(o.BoardOwner) {
		return nil, false
	}
	return o.BoardOwner, true
}

// HasBoardOwner returns a boolean if a field has been set.
func (o *PinCreate) HasBoardOwner() bool {
	if o != nil && !IsNil(o.BoardOwner) {
		return true
	}

	return false
}

// SetBoardOwner gets a reference to the given BoardOwner and assigns it to the BoardOwner field.
func (o *PinCreate) SetBoardOwner(v BoardOwner) {
	o.BoardOwner = &v
}

// GetMedia returns the Media field value if set, zero value otherwise.
func (o *PinCreate) GetMedia() PinMedia {
	if o == nil || IsNil(o.Media) {
		var ret PinMedia
		return ret
	}
	return *o.Media
}

// GetMediaOk returns a tuple with the Media field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PinCreate) GetMediaOk() (*PinMedia, bool) {
	if o == nil || IsNil(o.Media) {
		return nil, false
	}
	return o.Media, true
}

// HasMedia returns a boolean if a field has been set.
func (o *PinCreate) HasMedia() bool {
	if o != nil && !IsNil(o.Media) {
		return true
	}

	return false
}

// SetMedia gets a reference to the given PinMedia and assigns it to the Media field.
func (o *PinCreate) SetMedia(v PinMedia) {
	o.Media = &v
}

// GetMediaSource returns the MediaSource field value if set, zero value otherwise.
func (o *PinCreate) GetMediaSource() PinMediaSource {
	if o == nil || IsNil(o.MediaSource) {
		var ret PinMediaSource
		return ret
	}
	return *o.MediaSource
}

// GetMediaSourceOk returns a tuple with the MediaSource field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PinCreate) GetMediaSourceOk() (*PinMediaSource, bool) {
	if o == nil || IsNil(o.MediaSource) {
		return nil, false
	}
	return o.MediaSource, true
}

// HasMediaSource returns a boolean if a field has been set.
func (o *PinCreate) HasMediaSource() bool {
	if o != nil && !IsNil(o.MediaSource) {
		return true
	}

	return false
}

// SetMediaSource gets a reference to the given PinMediaSource and assigns it to the MediaSource field.
func (o *PinCreate) SetMediaSource(v PinMediaSource) {
	o.MediaSource = &v
}

// GetParentPinId returns the ParentPinId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PinCreate) GetParentPinId() string {
	if o == nil || IsNil(o.ParentPinId.Get()) {
		var ret string
		return ret
	}
	return *o.ParentPinId.Get()
}

// GetParentPinIdOk returns a tuple with the ParentPinId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PinCreate) GetParentPinIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.ParentPinId.Get(), o.ParentPinId.IsSet()
}

// HasParentPinId returns a boolean if a field has been set.
func (o *PinCreate) HasParentPinId() bool {
	if o != nil && o.ParentPinId.IsSet() {
		return true
	}

	return false
}

// SetParentPinId gets a reference to the given NullableString and assigns it to the ParentPinId field.
func (o *PinCreate) SetParentPinId(v string) {
	o.ParentPinId.Set(&v)
}
// SetParentPinIdNil sets the value for ParentPinId to be an explicit nil
func (o *PinCreate) SetParentPinIdNil() {
	o.ParentPinId.Set(nil)
}

// UnsetParentPinId ensures that no value is present for ParentPinId, not even an explicit nil
func (o *PinCreate) UnsetParentPinId() {
	o.ParentPinId.Unset()
}

// GetNote returns the Note field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PinCreate) GetNote() string {
	if o == nil || IsNil(o.Note.Get()) {
		var ret string
		return ret
	}
	return *o.Note.Get()
}

// GetNoteOk returns a tuple with the Note field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PinCreate) GetNoteOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Note.Get(), o.Note.IsSet()
}

// HasNote returns a boolean if a field has been set.
func (o *PinCreate) HasNote() bool {
	if o != nil && o.Note.IsSet() {
		return true
	}

	return false
}

// SetNote gets a reference to the given NullableString and assigns it to the Note field.
func (o *PinCreate) SetNote(v string) {
	o.Note.Set(&v)
}
// SetNoteNil sets the value for Note to be an explicit nil
func (o *PinCreate) SetNoteNil() {
	o.Note.Set(nil)
}

// UnsetNote ensures that no value is present for Note, not even an explicit nil
func (o *PinCreate) UnsetNote() {
	o.Note.Unset()
}

func (o PinCreate) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o PinCreate) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.CreatedAt) {
		toSerialize["created_at"] = o.CreatedAt
	}
	if o.Link.IsSet() {
		toSerialize["link"] = o.Link.Get()
	}
	if o.Title.IsSet() {
		toSerialize["title"] = o.Title.Get()
	}
	if o.Description.IsSet() {
		toSerialize["description"] = o.Description.Get()
	}
	if o.DominantColor.IsSet() {
		toSerialize["dominant_color"] = o.DominantColor.Get()
	}
	if o.AltText.IsSet() {
		toSerialize["alt_text"] = o.AltText.Get()
	}
	if !IsNil(o.BoardId) {
		toSerialize["board_id"] = o.BoardId
	}
	if o.BoardSectionId.IsSet() {
		toSerialize["board_section_id"] = o.BoardSectionId.Get()
	}
	if !IsNil(o.BoardOwner) {
		toSerialize["board_owner"] = o.BoardOwner
	}
	if !IsNil(o.Media) {
		toSerialize["media"] = o.Media
	}
	if !IsNil(o.MediaSource) {
		toSerialize["media_source"] = o.MediaSource
	}
	if o.ParentPinId.IsSet() {
		toSerialize["parent_pin_id"] = o.ParentPinId.Get()
	}
	if o.Note.IsSet() {
		toSerialize["note"] = o.Note.Get()
	}
	return toSerialize, nil
}

type NullablePinCreate struct {
	value *PinCreate
	isSet bool
}

func (v NullablePinCreate) Get() *PinCreate {
	return v.value
}

func (v *NullablePinCreate) Set(val *PinCreate) {
	v.value = val
	v.isSet = true
}

func (v NullablePinCreate) IsSet() bool {
	return v.isSet
}

func (v *NullablePinCreate) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePinCreate(val *PinCreate) *NullablePinCreate {
	return &NullablePinCreate{value: val, isSet: true}
}

func (v NullablePinCreate) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePinCreate) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


