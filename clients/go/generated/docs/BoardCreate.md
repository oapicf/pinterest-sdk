# BoardCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | Pointer to **NullableString** |  | [optional] 
**IsAdsOnly** | Pointer to **bool** | If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. | [optional] [default to false]
**Name** | **string** |      Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | 
**Privacy** | Pointer to [**BoardPrivacy**](BoardPrivacy.md) |     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the &#x60;privacy&#x60; settng automatically becomes &#x60;PROTECTED&#x60;.  | [optional] [default to PUBLIC]

## Methods

### NewBoardCreate

`func NewBoardCreate(name string, ) *BoardCreate`

NewBoardCreate instantiates a new BoardCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBoardCreateWithDefaults

`func NewBoardCreateWithDefaults() *BoardCreate`

NewBoardCreateWithDefaults instantiates a new BoardCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *BoardCreate) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *BoardCreate) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *BoardCreate) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *BoardCreate) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *BoardCreate) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *BoardCreate) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetIsAdsOnly

`func (o *BoardCreate) GetIsAdsOnly() bool`

GetIsAdsOnly returns the IsAdsOnly field if non-nil, zero value otherwise.

### GetIsAdsOnlyOk

`func (o *BoardCreate) GetIsAdsOnlyOk() (*bool, bool)`

GetIsAdsOnlyOk returns a tuple with the IsAdsOnly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsAdsOnly

`func (o *BoardCreate) SetIsAdsOnly(v bool)`

SetIsAdsOnly sets IsAdsOnly field to given value.

### HasIsAdsOnly

`func (o *BoardCreate) HasIsAdsOnly() bool`

HasIsAdsOnly returns a boolean if a field has been set.

### GetName

`func (o *BoardCreate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *BoardCreate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *BoardCreate) SetName(v string)`

SetName sets Name field to given value.


### GetPrivacy

`func (o *BoardCreate) GetPrivacy() BoardPrivacy`

GetPrivacy returns the Privacy field if non-nil, zero value otherwise.

### GetPrivacyOk

`func (o *BoardCreate) GetPrivacyOk() (*BoardPrivacy, bool)`

GetPrivacyOk returns a tuple with the Privacy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrivacy

`func (o *BoardCreate) SetPrivacy(v BoardPrivacy)`

SetPrivacy sets Privacy field to given value.

### HasPrivacy

`func (o *BoardCreate) HasPrivacy() bool`

HasPrivacy returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


