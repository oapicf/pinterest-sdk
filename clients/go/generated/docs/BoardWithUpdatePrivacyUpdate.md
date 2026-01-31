# BoardWithUpdatePrivacyUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | Pointer to **NullableString** |  | [optional] 
**Name** | Pointer to **string** |      Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. | [optional] 
**Privacy** | Pointer to [**BoardUpdatePrivacy**](BoardUpdatePrivacy.md) |  | [optional] 

## Methods

### NewBoardWithUpdatePrivacyUpdate

`func NewBoardWithUpdatePrivacyUpdate() *BoardWithUpdatePrivacyUpdate`

NewBoardWithUpdatePrivacyUpdate instantiates a new BoardWithUpdatePrivacyUpdate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBoardWithUpdatePrivacyUpdateWithDefaults

`func NewBoardWithUpdatePrivacyUpdateWithDefaults() *BoardWithUpdatePrivacyUpdate`

NewBoardWithUpdatePrivacyUpdateWithDefaults instantiates a new BoardWithUpdatePrivacyUpdate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *BoardWithUpdatePrivacyUpdate) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *BoardWithUpdatePrivacyUpdate) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *BoardWithUpdatePrivacyUpdate) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *BoardWithUpdatePrivacyUpdate) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *BoardWithUpdatePrivacyUpdate) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *BoardWithUpdatePrivacyUpdate) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetName

`func (o *BoardWithUpdatePrivacyUpdate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *BoardWithUpdatePrivacyUpdate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *BoardWithUpdatePrivacyUpdate) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *BoardWithUpdatePrivacyUpdate) HasName() bool`

HasName returns a boolean if a field has been set.

### GetPrivacy

`func (o *BoardWithUpdatePrivacyUpdate) GetPrivacy() BoardUpdatePrivacy`

GetPrivacy returns the Privacy field if non-nil, zero value otherwise.

### GetPrivacyOk

`func (o *BoardWithUpdatePrivacyUpdate) GetPrivacyOk() (*BoardUpdatePrivacy, bool)`

GetPrivacyOk returns a tuple with the Privacy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrivacy

`func (o *BoardWithUpdatePrivacyUpdate) SetPrivacy(v BoardUpdatePrivacy)`

SetPrivacy sets Privacy field to given value.

### HasPrivacy

`func (o *BoardWithUpdatePrivacyUpdate) HasPrivacy() bool`

HasPrivacy returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


