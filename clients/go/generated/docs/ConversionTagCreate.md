# ConversionTagCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Conversion tag name. | 
**AemEnabled** | Pointer to **NullableBool** | Whether Automatic Enhanced Match email is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information. | [optional] [default to false]
**MdFrequency** | Pointer to **NullableFloat32** | Metadata ingestion frequency. | [optional] [default to 1]
**AemFnlnEnabled** | Pointer to **NullableBool** | Whether Automatic Enhanced Match name is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information. | [optional] [default to false]
**AemPhEnabled** | Pointer to **NullableBool** | Whether Automatic Enhanced Match phone is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information. | [optional] [default to false]
**AemGeEnabled** | Pointer to **NullableBool** | Whether Automatic Enhanced Match gender is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information. | [optional] [default to false]
**AemDbEnabled** | Pointer to **NullableBool** | Whether Automatic Enhanced Match birthdate is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information. | [optional] [default to false]
**AemLocEnabled** | Pointer to **NullableBool** | Whether Automatic Enhanced Match location is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information. | [optional] [default to false]

## Methods

### NewConversionTagCreate

`func NewConversionTagCreate(name string, ) *ConversionTagCreate`

NewConversionTagCreate instantiates a new ConversionTagCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversionTagCreateWithDefaults

`func NewConversionTagCreateWithDefaults() *ConversionTagCreate`

NewConversionTagCreateWithDefaults instantiates a new ConversionTagCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *ConversionTagCreate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ConversionTagCreate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ConversionTagCreate) SetName(v string)`

SetName sets Name field to given value.


### GetAemEnabled

`func (o *ConversionTagCreate) GetAemEnabled() bool`

GetAemEnabled returns the AemEnabled field if non-nil, zero value otherwise.

### GetAemEnabledOk

`func (o *ConversionTagCreate) GetAemEnabledOk() (*bool, bool)`

GetAemEnabledOk returns a tuple with the AemEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAemEnabled

`func (o *ConversionTagCreate) SetAemEnabled(v bool)`

SetAemEnabled sets AemEnabled field to given value.

### HasAemEnabled

`func (o *ConversionTagCreate) HasAemEnabled() bool`

HasAemEnabled returns a boolean if a field has been set.

### SetAemEnabledNil

`func (o *ConversionTagCreate) SetAemEnabledNil(b bool)`

 SetAemEnabledNil sets the value for AemEnabled to be an explicit nil

### UnsetAemEnabled
`func (o *ConversionTagCreate) UnsetAemEnabled()`

UnsetAemEnabled ensures that no value is present for AemEnabled, not even an explicit nil
### GetMdFrequency

`func (o *ConversionTagCreate) GetMdFrequency() float32`

GetMdFrequency returns the MdFrequency field if non-nil, zero value otherwise.

### GetMdFrequencyOk

`func (o *ConversionTagCreate) GetMdFrequencyOk() (*float32, bool)`

GetMdFrequencyOk returns a tuple with the MdFrequency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMdFrequency

`func (o *ConversionTagCreate) SetMdFrequency(v float32)`

SetMdFrequency sets MdFrequency field to given value.

### HasMdFrequency

`func (o *ConversionTagCreate) HasMdFrequency() bool`

HasMdFrequency returns a boolean if a field has been set.

### SetMdFrequencyNil

`func (o *ConversionTagCreate) SetMdFrequencyNil(b bool)`

 SetMdFrequencyNil sets the value for MdFrequency to be an explicit nil

### UnsetMdFrequency
`func (o *ConversionTagCreate) UnsetMdFrequency()`

UnsetMdFrequency ensures that no value is present for MdFrequency, not even an explicit nil
### GetAemFnlnEnabled

`func (o *ConversionTagCreate) GetAemFnlnEnabled() bool`

GetAemFnlnEnabled returns the AemFnlnEnabled field if non-nil, zero value otherwise.

### GetAemFnlnEnabledOk

`func (o *ConversionTagCreate) GetAemFnlnEnabledOk() (*bool, bool)`

GetAemFnlnEnabledOk returns a tuple with the AemFnlnEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAemFnlnEnabled

`func (o *ConversionTagCreate) SetAemFnlnEnabled(v bool)`

SetAemFnlnEnabled sets AemFnlnEnabled field to given value.

### HasAemFnlnEnabled

`func (o *ConversionTagCreate) HasAemFnlnEnabled() bool`

HasAemFnlnEnabled returns a boolean if a field has been set.

### SetAemFnlnEnabledNil

`func (o *ConversionTagCreate) SetAemFnlnEnabledNil(b bool)`

 SetAemFnlnEnabledNil sets the value for AemFnlnEnabled to be an explicit nil

### UnsetAemFnlnEnabled
`func (o *ConversionTagCreate) UnsetAemFnlnEnabled()`

UnsetAemFnlnEnabled ensures that no value is present for AemFnlnEnabled, not even an explicit nil
### GetAemPhEnabled

`func (o *ConversionTagCreate) GetAemPhEnabled() bool`

GetAemPhEnabled returns the AemPhEnabled field if non-nil, zero value otherwise.

### GetAemPhEnabledOk

`func (o *ConversionTagCreate) GetAemPhEnabledOk() (*bool, bool)`

GetAemPhEnabledOk returns a tuple with the AemPhEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAemPhEnabled

`func (o *ConversionTagCreate) SetAemPhEnabled(v bool)`

SetAemPhEnabled sets AemPhEnabled field to given value.

### HasAemPhEnabled

`func (o *ConversionTagCreate) HasAemPhEnabled() bool`

HasAemPhEnabled returns a boolean if a field has been set.

### SetAemPhEnabledNil

`func (o *ConversionTagCreate) SetAemPhEnabledNil(b bool)`

 SetAemPhEnabledNil sets the value for AemPhEnabled to be an explicit nil

### UnsetAemPhEnabled
`func (o *ConversionTagCreate) UnsetAemPhEnabled()`

UnsetAemPhEnabled ensures that no value is present for AemPhEnabled, not even an explicit nil
### GetAemGeEnabled

`func (o *ConversionTagCreate) GetAemGeEnabled() bool`

GetAemGeEnabled returns the AemGeEnabled field if non-nil, zero value otherwise.

### GetAemGeEnabledOk

`func (o *ConversionTagCreate) GetAemGeEnabledOk() (*bool, bool)`

GetAemGeEnabledOk returns a tuple with the AemGeEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAemGeEnabled

`func (o *ConversionTagCreate) SetAemGeEnabled(v bool)`

SetAemGeEnabled sets AemGeEnabled field to given value.

### HasAemGeEnabled

`func (o *ConversionTagCreate) HasAemGeEnabled() bool`

HasAemGeEnabled returns a boolean if a field has been set.

### SetAemGeEnabledNil

`func (o *ConversionTagCreate) SetAemGeEnabledNil(b bool)`

 SetAemGeEnabledNil sets the value for AemGeEnabled to be an explicit nil

### UnsetAemGeEnabled
`func (o *ConversionTagCreate) UnsetAemGeEnabled()`

UnsetAemGeEnabled ensures that no value is present for AemGeEnabled, not even an explicit nil
### GetAemDbEnabled

`func (o *ConversionTagCreate) GetAemDbEnabled() bool`

GetAemDbEnabled returns the AemDbEnabled field if non-nil, zero value otherwise.

### GetAemDbEnabledOk

`func (o *ConversionTagCreate) GetAemDbEnabledOk() (*bool, bool)`

GetAemDbEnabledOk returns a tuple with the AemDbEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAemDbEnabled

`func (o *ConversionTagCreate) SetAemDbEnabled(v bool)`

SetAemDbEnabled sets AemDbEnabled field to given value.

### HasAemDbEnabled

`func (o *ConversionTagCreate) HasAemDbEnabled() bool`

HasAemDbEnabled returns a boolean if a field has been set.

### SetAemDbEnabledNil

`func (o *ConversionTagCreate) SetAemDbEnabledNil(b bool)`

 SetAemDbEnabledNil sets the value for AemDbEnabled to be an explicit nil

### UnsetAemDbEnabled
`func (o *ConversionTagCreate) UnsetAemDbEnabled()`

UnsetAemDbEnabled ensures that no value is present for AemDbEnabled, not even an explicit nil
### GetAemLocEnabled

`func (o *ConversionTagCreate) GetAemLocEnabled() bool`

GetAemLocEnabled returns the AemLocEnabled field if non-nil, zero value otherwise.

### GetAemLocEnabledOk

`func (o *ConversionTagCreate) GetAemLocEnabledOk() (*bool, bool)`

GetAemLocEnabledOk returns a tuple with the AemLocEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAemLocEnabled

`func (o *ConversionTagCreate) SetAemLocEnabled(v bool)`

SetAemLocEnabled sets AemLocEnabled field to given value.

### HasAemLocEnabled

`func (o *ConversionTagCreate) HasAemLocEnabled() bool`

HasAemLocEnabled returns a boolean if a field has been set.

### SetAemLocEnabledNil

`func (o *ConversionTagCreate) SetAemLocEnabledNil(b bool)`

 SetAemLocEnabledNil sets the value for AemLocEnabled to be an explicit nil

### UnsetAemLocEnabled
`func (o *ConversionTagCreate) UnsetAemLocEnabled()`

UnsetAemLocEnabled ensures that no value is present for AemLocEnabled, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


