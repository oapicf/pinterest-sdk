# Pin

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** |  | [optional] [readonly] 
**CreatedAt** | Pointer to **time.Time** |  | [optional] [readonly] 
**Link** | Pointer to **NullableString** |  | [optional] 
**Title** | Pointer to **NullableString** |  | [optional] 
**Description** | Pointer to **NullableString** |  | [optional] 
**AltText** | Pointer to **NullableString** |  | [optional] 
**BoardId** | Pointer to **string** | The board to which this Pin belongs. | [optional] 
**BoardSectionId** | Pointer to **NullableString** | The board section to which this Pin belongs. | [optional] 
**BoardOwner** | Pointer to [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**Media** | Pointer to [**PinMedia**](PinMedia.md) |  | [optional] [readonly] 
**MediaSource** | Pointer to [**PinMediaSource**](PinMediaSource.md) |  | [optional] 

## Methods

### NewPin

`func NewPin() *Pin`

NewPin instantiates a new Pin object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPinWithDefaults

`func NewPinWithDefaults() *Pin`

NewPinWithDefaults instantiates a new Pin object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Pin) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Pin) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Pin) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *Pin) HasId() bool`

HasId returns a boolean if a field has been set.

### GetCreatedAt

`func (o *Pin) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *Pin) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *Pin) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *Pin) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetLink

`func (o *Pin) GetLink() string`

GetLink returns the Link field if non-nil, zero value otherwise.

### GetLinkOk

`func (o *Pin) GetLinkOk() (*string, bool)`

GetLinkOk returns a tuple with the Link field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLink

`func (o *Pin) SetLink(v string)`

SetLink sets Link field to given value.

### HasLink

`func (o *Pin) HasLink() bool`

HasLink returns a boolean if a field has been set.

### SetLinkNil

`func (o *Pin) SetLinkNil(b bool)`

 SetLinkNil sets the value for Link to be an explicit nil

### UnsetLink
`func (o *Pin) UnsetLink()`

UnsetLink ensures that no value is present for Link, not even an explicit nil
### GetTitle

`func (o *Pin) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *Pin) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *Pin) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *Pin) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### SetTitleNil

`func (o *Pin) SetTitleNil(b bool)`

 SetTitleNil sets the value for Title to be an explicit nil

### UnsetTitle
`func (o *Pin) UnsetTitle()`

UnsetTitle ensures that no value is present for Title, not even an explicit nil
### GetDescription

`func (o *Pin) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *Pin) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *Pin) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *Pin) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *Pin) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *Pin) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetAltText

`func (o *Pin) GetAltText() string`

GetAltText returns the AltText field if non-nil, zero value otherwise.

### GetAltTextOk

`func (o *Pin) GetAltTextOk() (*string, bool)`

GetAltTextOk returns a tuple with the AltText field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAltText

`func (o *Pin) SetAltText(v string)`

SetAltText sets AltText field to given value.

### HasAltText

`func (o *Pin) HasAltText() bool`

HasAltText returns a boolean if a field has been set.

### SetAltTextNil

`func (o *Pin) SetAltTextNil(b bool)`

 SetAltTextNil sets the value for AltText to be an explicit nil

### UnsetAltText
`func (o *Pin) UnsetAltText()`

UnsetAltText ensures that no value is present for AltText, not even an explicit nil
### GetBoardId

`func (o *Pin) GetBoardId() string`

GetBoardId returns the BoardId field if non-nil, zero value otherwise.

### GetBoardIdOk

`func (o *Pin) GetBoardIdOk() (*string, bool)`

GetBoardIdOk returns a tuple with the BoardId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoardId

`func (o *Pin) SetBoardId(v string)`

SetBoardId sets BoardId field to given value.

### HasBoardId

`func (o *Pin) HasBoardId() bool`

HasBoardId returns a boolean if a field has been set.

### GetBoardSectionId

`func (o *Pin) GetBoardSectionId() string`

GetBoardSectionId returns the BoardSectionId field if non-nil, zero value otherwise.

### GetBoardSectionIdOk

`func (o *Pin) GetBoardSectionIdOk() (*string, bool)`

GetBoardSectionIdOk returns a tuple with the BoardSectionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoardSectionId

`func (o *Pin) SetBoardSectionId(v string)`

SetBoardSectionId sets BoardSectionId field to given value.

### HasBoardSectionId

`func (o *Pin) HasBoardSectionId() bool`

HasBoardSectionId returns a boolean if a field has been set.

### SetBoardSectionIdNil

`func (o *Pin) SetBoardSectionIdNil(b bool)`

 SetBoardSectionIdNil sets the value for BoardSectionId to be an explicit nil

### UnsetBoardSectionId
`func (o *Pin) UnsetBoardSectionId()`

UnsetBoardSectionId ensures that no value is present for BoardSectionId, not even an explicit nil
### GetBoardOwner

`func (o *Pin) GetBoardOwner() BoardOwner`

GetBoardOwner returns the BoardOwner field if non-nil, zero value otherwise.

### GetBoardOwnerOk

`func (o *Pin) GetBoardOwnerOk() (*BoardOwner, bool)`

GetBoardOwnerOk returns a tuple with the BoardOwner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoardOwner

`func (o *Pin) SetBoardOwner(v BoardOwner)`

SetBoardOwner sets BoardOwner field to given value.

### HasBoardOwner

`func (o *Pin) HasBoardOwner() bool`

HasBoardOwner returns a boolean if a field has been set.

### GetMedia

`func (o *Pin) GetMedia() PinMedia`

GetMedia returns the Media field if non-nil, zero value otherwise.

### GetMediaOk

`func (o *Pin) GetMediaOk() (*PinMedia, bool)`

GetMediaOk returns a tuple with the Media field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMedia

`func (o *Pin) SetMedia(v PinMedia)`

SetMedia sets Media field to given value.

### HasMedia

`func (o *Pin) HasMedia() bool`

HasMedia returns a boolean if a field has been set.

### GetMediaSource

`func (o *Pin) GetMediaSource() PinMediaSource`

GetMediaSource returns the MediaSource field if non-nil, zero value otherwise.

### GetMediaSourceOk

`func (o *Pin) GetMediaSourceOk() (*PinMediaSource, bool)`

GetMediaSourceOk returns a tuple with the MediaSource field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaSource

`func (o *Pin) SetMediaSource(v PinMediaSource)`

SetMediaSource sets MediaSource field to given value.

### HasMediaSource

`func (o *Pin) HasMediaSource() bool`

HasMediaSource returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


