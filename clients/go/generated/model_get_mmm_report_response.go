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

// checks if the GetMMMReportResponse type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &GetMMMReportResponse{}

// GetMMMReportResponse struct for GetMMMReportResponse
type GetMMMReportResponse struct {
	Code *float32 `json:"code,omitempty"`
	Data *GetMMMReportResponseData `json:"data,omitempty"`
	Message *string `json:"message,omitempty"`
	Status *string `json:"status,omitempty"`
}

// NewGetMMMReportResponse instantiates a new GetMMMReportResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetMMMReportResponse() *GetMMMReportResponse {
	this := GetMMMReportResponse{}
	return &this
}

// NewGetMMMReportResponseWithDefaults instantiates a new GetMMMReportResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetMMMReportResponseWithDefaults() *GetMMMReportResponse {
	this := GetMMMReportResponse{}
	return &this
}

// GetCode returns the Code field value if set, zero value otherwise.
func (o *GetMMMReportResponse) GetCode() float32 {
	if o == nil || IsNil(o.Code) {
		var ret float32
		return ret
	}
	return *o.Code
}

// GetCodeOk returns a tuple with the Code field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetMMMReportResponse) GetCodeOk() (*float32, bool) {
	if o == nil || IsNil(o.Code) {
		return nil, false
	}
	return o.Code, true
}

// HasCode returns a boolean if a field has been set.
func (o *GetMMMReportResponse) HasCode() bool {
	if o != nil && !IsNil(o.Code) {
		return true
	}

	return false
}

// SetCode gets a reference to the given float32 and assigns it to the Code field.
func (o *GetMMMReportResponse) SetCode(v float32) {
	o.Code = &v
}

// GetData returns the Data field value if set, zero value otherwise.
func (o *GetMMMReportResponse) GetData() GetMMMReportResponseData {
	if o == nil || IsNil(o.Data) {
		var ret GetMMMReportResponseData
		return ret
	}
	return *o.Data
}

// GetDataOk returns a tuple with the Data field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetMMMReportResponse) GetDataOk() (*GetMMMReportResponseData, bool) {
	if o == nil || IsNil(o.Data) {
		return nil, false
	}
	return o.Data, true
}

// HasData returns a boolean if a field has been set.
func (o *GetMMMReportResponse) HasData() bool {
	if o != nil && !IsNil(o.Data) {
		return true
	}

	return false
}

// SetData gets a reference to the given GetMMMReportResponseData and assigns it to the Data field.
func (o *GetMMMReportResponse) SetData(v GetMMMReportResponseData) {
	o.Data = &v
}

// GetMessage returns the Message field value if set, zero value otherwise.
func (o *GetMMMReportResponse) GetMessage() string {
	if o == nil || IsNil(o.Message) {
		var ret string
		return ret
	}
	return *o.Message
}

// GetMessageOk returns a tuple with the Message field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetMMMReportResponse) GetMessageOk() (*string, bool) {
	if o == nil || IsNil(o.Message) {
		return nil, false
	}
	return o.Message, true
}

// HasMessage returns a boolean if a field has been set.
func (o *GetMMMReportResponse) HasMessage() bool {
	if o != nil && !IsNil(o.Message) {
		return true
	}

	return false
}

// SetMessage gets a reference to the given string and assigns it to the Message field.
func (o *GetMMMReportResponse) SetMessage(v string) {
	o.Message = &v
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *GetMMMReportResponse) GetStatus() string {
	if o == nil || IsNil(o.Status) {
		var ret string
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetMMMReportResponse) GetStatusOk() (*string, bool) {
	if o == nil || IsNil(o.Status) {
		return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *GetMMMReportResponse) HasStatus() bool {
	if o != nil && !IsNil(o.Status) {
		return true
	}

	return false
}

// SetStatus gets a reference to the given string and assigns it to the Status field.
func (o *GetMMMReportResponse) SetStatus(v string) {
	o.Status = &v
}

func (o GetMMMReportResponse) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o GetMMMReportResponse) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Code) {
		toSerialize["code"] = o.Code
	}
	if !IsNil(o.Data) {
		toSerialize["data"] = o.Data
	}
	if !IsNil(o.Message) {
		toSerialize["message"] = o.Message
	}
	if !IsNil(o.Status) {
		toSerialize["status"] = o.Status
	}
	return toSerialize, nil
}

type NullableGetMMMReportResponse struct {
	value *GetMMMReportResponse
	isSet bool
}

func (v NullableGetMMMReportResponse) Get() *GetMMMReportResponse {
	return v.value
}

func (v *NullableGetMMMReportResponse) Set(val *GetMMMReportResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableGetMMMReportResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableGetMMMReportResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetMMMReportResponse(val *GetMMMReportResponse) *NullableGetMMMReportResponse {
	return &NullableGetMMMReportResponse{value: val, isSet: true}
}

func (v NullableGetMMMReportResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetMMMReportResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


