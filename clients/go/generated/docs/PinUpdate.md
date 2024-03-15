# PinUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AltText** | Pointer to **NullableString** | Pin&#39;s alternative text. | [optional] 
**BoardId** | Pointer to **NullableString** | The id of the board to move the Pin onto. | [optional] 
**BoardSectionId** | Pointer to **NullableString** | &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/create-a-board-section\&quot;&gt;Board section&lt;/a&gt; ID. | [optional] 
**Description** | Pointer to **NullableString** | Pin description - 800 characters maximum. | [optional] 
**Link** | Pointer to **NullableString** | URL viewer is taken to when they click pin. | [optional] 
**Title** | Pointer to **NullableString** | The native pin title that creators explicitly prefer to display. | [optional] 
**CarouselSlots** | Pointer to [**[]PinUpdateCarouselSlotsInner**](PinUpdateCarouselSlotsInner.md) | Carousel Pin slots data. | [optional] 
**Note** | Pointer to **NullableString** | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 

## Methods

### NewPinUpdate

`func NewPinUpdate() *PinUpdate`

NewPinUpdate instantiates a new PinUpdate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPinUpdateWithDefaults

`func NewPinUpdateWithDefaults() *PinUpdate`

NewPinUpdateWithDefaults instantiates a new PinUpdate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAltText

`func (o *PinUpdate) GetAltText() string`

GetAltText returns the AltText field if non-nil, zero value otherwise.

### GetAltTextOk

`func (o *PinUpdate) GetAltTextOk() (*string, bool)`

GetAltTextOk returns a tuple with the AltText field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAltText

`func (o *PinUpdate) SetAltText(v string)`

SetAltText sets AltText field to given value.

### HasAltText

`func (o *PinUpdate) HasAltText() bool`

HasAltText returns a boolean if a field has been set.

### SetAltTextNil

`func (o *PinUpdate) SetAltTextNil(b bool)`

 SetAltTextNil sets the value for AltText to be an explicit nil

### UnsetAltText
`func (o *PinUpdate) UnsetAltText()`

UnsetAltText ensures that no value is present for AltText, not even an explicit nil
### GetBoardId

`func (o *PinUpdate) GetBoardId() string`

GetBoardId returns the BoardId field if non-nil, zero value otherwise.

### GetBoardIdOk

`func (o *PinUpdate) GetBoardIdOk() (*string, bool)`

GetBoardIdOk returns a tuple with the BoardId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoardId

`func (o *PinUpdate) SetBoardId(v string)`

SetBoardId sets BoardId field to given value.

### HasBoardId

`func (o *PinUpdate) HasBoardId() bool`

HasBoardId returns a boolean if a field has been set.

### SetBoardIdNil

`func (o *PinUpdate) SetBoardIdNil(b bool)`

 SetBoardIdNil sets the value for BoardId to be an explicit nil

### UnsetBoardId
`func (o *PinUpdate) UnsetBoardId()`

UnsetBoardId ensures that no value is present for BoardId, not even an explicit nil
### GetBoardSectionId

`func (o *PinUpdate) GetBoardSectionId() string`

GetBoardSectionId returns the BoardSectionId field if non-nil, zero value otherwise.

### GetBoardSectionIdOk

`func (o *PinUpdate) GetBoardSectionIdOk() (*string, bool)`

GetBoardSectionIdOk returns a tuple with the BoardSectionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoardSectionId

`func (o *PinUpdate) SetBoardSectionId(v string)`

SetBoardSectionId sets BoardSectionId field to given value.

### HasBoardSectionId

`func (o *PinUpdate) HasBoardSectionId() bool`

HasBoardSectionId returns a boolean if a field has been set.

### SetBoardSectionIdNil

`func (o *PinUpdate) SetBoardSectionIdNil(b bool)`

 SetBoardSectionIdNil sets the value for BoardSectionId to be an explicit nil

### UnsetBoardSectionId
`func (o *PinUpdate) UnsetBoardSectionId()`

UnsetBoardSectionId ensures that no value is present for BoardSectionId, not even an explicit nil
### GetDescription

`func (o *PinUpdate) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *PinUpdate) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *PinUpdate) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *PinUpdate) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *PinUpdate) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *PinUpdate) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetLink

`func (o *PinUpdate) GetLink() string`

GetLink returns the Link field if non-nil, zero value otherwise.

### GetLinkOk

`func (o *PinUpdate) GetLinkOk() (*string, bool)`

GetLinkOk returns a tuple with the Link field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLink

`func (o *PinUpdate) SetLink(v string)`

SetLink sets Link field to given value.

### HasLink

`func (o *PinUpdate) HasLink() bool`

HasLink returns a boolean if a field has been set.

### SetLinkNil

`func (o *PinUpdate) SetLinkNil(b bool)`

 SetLinkNil sets the value for Link to be an explicit nil

### UnsetLink
`func (o *PinUpdate) UnsetLink()`

UnsetLink ensures that no value is present for Link, not even an explicit nil
### GetTitle

`func (o *PinUpdate) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *PinUpdate) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *PinUpdate) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *PinUpdate) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### SetTitleNil

`func (o *PinUpdate) SetTitleNil(b bool)`

 SetTitleNil sets the value for Title to be an explicit nil

### UnsetTitle
`func (o *PinUpdate) UnsetTitle()`

UnsetTitle ensures that no value is present for Title, not even an explicit nil
### GetCarouselSlots

`func (o *PinUpdate) GetCarouselSlots() []PinUpdateCarouselSlotsInner`

GetCarouselSlots returns the CarouselSlots field if non-nil, zero value otherwise.

### GetCarouselSlotsOk

`func (o *PinUpdate) GetCarouselSlotsOk() (*[]PinUpdateCarouselSlotsInner, bool)`

GetCarouselSlotsOk returns a tuple with the CarouselSlots field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCarouselSlots

`func (o *PinUpdate) SetCarouselSlots(v []PinUpdateCarouselSlotsInner)`

SetCarouselSlots sets CarouselSlots field to given value.

### HasCarouselSlots

`func (o *PinUpdate) HasCarouselSlots() bool`

HasCarouselSlots returns a boolean if a field has been set.

### GetNote

`func (o *PinUpdate) GetNote() string`

GetNote returns the Note field if non-nil, zero value otherwise.

### GetNoteOk

`func (o *PinUpdate) GetNoteOk() (*string, bool)`

GetNoteOk returns a tuple with the Note field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNote

`func (o *PinUpdate) SetNote(v string)`

SetNote sets Note field to given value.

### HasNote

`func (o *PinUpdate) HasNote() bool`

HasNote returns a boolean if a field has been set.

### SetNoteNil

`func (o *PinUpdate) SetNoteNil(b bool)`

 SetNoteNil sets the value for Note to be an explicit nil

### UnsetNote
`func (o *PinUpdate) UnsetNote()`

UnsetNote ensures that no value is present for Note, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


