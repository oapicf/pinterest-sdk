# PinCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** |  | [optional] [readonly] 
**CreatedAt** | Pointer to **time.Time** |  | [optional] [readonly] 
**Link** | Pointer to **NullableString** |  | [optional] 
**Title** | Pointer to **NullableString** |  | [optional] 
**Description** | Pointer to **NullableString** |  | [optional] 
**DominantColor** | Pointer to **NullableString** | Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;. | [optional] 
**AltText** | Pointer to **NullableString** |  | [optional] 
**BoardId** | Pointer to **string** | The board to which this Pin belongs. | [optional] 
**BoardSectionId** | Pointer to **NullableString** | The board section to which this Pin belongs. | [optional] 
**BoardOwner** | Pointer to [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**Media** | Pointer to [**PinMedia**](PinMedia.md) |  | [optional] [readonly] 
**MediaSource** | Pointer to [**PinMediaSource**](PinMediaSource.md) |  | [optional] 
**ParentPinId** | Pointer to **NullableString** | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 
**Note** | Pointer to **NullableString** | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 

## Methods

### NewPinCreate

`func NewPinCreate() *PinCreate`

NewPinCreate instantiates a new PinCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPinCreateWithDefaults

`func NewPinCreateWithDefaults() *PinCreate`

NewPinCreateWithDefaults instantiates a new PinCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *PinCreate) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *PinCreate) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *PinCreate) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *PinCreate) HasId() bool`

HasId returns a boolean if a field has been set.

### GetCreatedAt

`func (o *PinCreate) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *PinCreate) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *PinCreate) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *PinCreate) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetLink

`func (o *PinCreate) GetLink() string`

GetLink returns the Link field if non-nil, zero value otherwise.

### GetLinkOk

`func (o *PinCreate) GetLinkOk() (*string, bool)`

GetLinkOk returns a tuple with the Link field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLink

`func (o *PinCreate) SetLink(v string)`

SetLink sets Link field to given value.

### HasLink

`func (o *PinCreate) HasLink() bool`

HasLink returns a boolean if a field has been set.

### SetLinkNil

`func (o *PinCreate) SetLinkNil(b bool)`

 SetLinkNil sets the value for Link to be an explicit nil

### UnsetLink
`func (o *PinCreate) UnsetLink()`

UnsetLink ensures that no value is present for Link, not even an explicit nil
### GetTitle

`func (o *PinCreate) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *PinCreate) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *PinCreate) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *PinCreate) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### SetTitleNil

`func (o *PinCreate) SetTitleNil(b bool)`

 SetTitleNil sets the value for Title to be an explicit nil

### UnsetTitle
`func (o *PinCreate) UnsetTitle()`

UnsetTitle ensures that no value is present for Title, not even an explicit nil
### GetDescription

`func (o *PinCreate) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *PinCreate) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *PinCreate) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *PinCreate) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *PinCreate) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *PinCreate) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetDominantColor

`func (o *PinCreate) GetDominantColor() string`

GetDominantColor returns the DominantColor field if non-nil, zero value otherwise.

### GetDominantColorOk

`func (o *PinCreate) GetDominantColorOk() (*string, bool)`

GetDominantColorOk returns a tuple with the DominantColor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDominantColor

`func (o *PinCreate) SetDominantColor(v string)`

SetDominantColor sets DominantColor field to given value.

### HasDominantColor

`func (o *PinCreate) HasDominantColor() bool`

HasDominantColor returns a boolean if a field has been set.

### SetDominantColorNil

`func (o *PinCreate) SetDominantColorNil(b bool)`

 SetDominantColorNil sets the value for DominantColor to be an explicit nil

### UnsetDominantColor
`func (o *PinCreate) UnsetDominantColor()`

UnsetDominantColor ensures that no value is present for DominantColor, not even an explicit nil
### GetAltText

`func (o *PinCreate) GetAltText() string`

GetAltText returns the AltText field if non-nil, zero value otherwise.

### GetAltTextOk

`func (o *PinCreate) GetAltTextOk() (*string, bool)`

GetAltTextOk returns a tuple with the AltText field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAltText

`func (o *PinCreate) SetAltText(v string)`

SetAltText sets AltText field to given value.

### HasAltText

`func (o *PinCreate) HasAltText() bool`

HasAltText returns a boolean if a field has been set.

### SetAltTextNil

`func (o *PinCreate) SetAltTextNil(b bool)`

 SetAltTextNil sets the value for AltText to be an explicit nil

### UnsetAltText
`func (o *PinCreate) UnsetAltText()`

UnsetAltText ensures that no value is present for AltText, not even an explicit nil
### GetBoardId

`func (o *PinCreate) GetBoardId() string`

GetBoardId returns the BoardId field if non-nil, zero value otherwise.

### GetBoardIdOk

`func (o *PinCreate) GetBoardIdOk() (*string, bool)`

GetBoardIdOk returns a tuple with the BoardId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoardId

`func (o *PinCreate) SetBoardId(v string)`

SetBoardId sets BoardId field to given value.

### HasBoardId

`func (o *PinCreate) HasBoardId() bool`

HasBoardId returns a boolean if a field has been set.

### GetBoardSectionId

`func (o *PinCreate) GetBoardSectionId() string`

GetBoardSectionId returns the BoardSectionId field if non-nil, zero value otherwise.

### GetBoardSectionIdOk

`func (o *PinCreate) GetBoardSectionIdOk() (*string, bool)`

GetBoardSectionIdOk returns a tuple with the BoardSectionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoardSectionId

`func (o *PinCreate) SetBoardSectionId(v string)`

SetBoardSectionId sets BoardSectionId field to given value.

### HasBoardSectionId

`func (o *PinCreate) HasBoardSectionId() bool`

HasBoardSectionId returns a boolean if a field has been set.

### SetBoardSectionIdNil

`func (o *PinCreate) SetBoardSectionIdNil(b bool)`

 SetBoardSectionIdNil sets the value for BoardSectionId to be an explicit nil

### UnsetBoardSectionId
`func (o *PinCreate) UnsetBoardSectionId()`

UnsetBoardSectionId ensures that no value is present for BoardSectionId, not even an explicit nil
### GetBoardOwner

`func (o *PinCreate) GetBoardOwner() BoardOwner`

GetBoardOwner returns the BoardOwner field if non-nil, zero value otherwise.

### GetBoardOwnerOk

`func (o *PinCreate) GetBoardOwnerOk() (*BoardOwner, bool)`

GetBoardOwnerOk returns a tuple with the BoardOwner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoardOwner

`func (o *PinCreate) SetBoardOwner(v BoardOwner)`

SetBoardOwner sets BoardOwner field to given value.

### HasBoardOwner

`func (o *PinCreate) HasBoardOwner() bool`

HasBoardOwner returns a boolean if a field has been set.

### GetMedia

`func (o *PinCreate) GetMedia() PinMedia`

GetMedia returns the Media field if non-nil, zero value otherwise.

### GetMediaOk

`func (o *PinCreate) GetMediaOk() (*PinMedia, bool)`

GetMediaOk returns a tuple with the Media field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMedia

`func (o *PinCreate) SetMedia(v PinMedia)`

SetMedia sets Media field to given value.

### HasMedia

`func (o *PinCreate) HasMedia() bool`

HasMedia returns a boolean if a field has been set.

### GetMediaSource

`func (o *PinCreate) GetMediaSource() PinMediaSource`

GetMediaSource returns the MediaSource field if non-nil, zero value otherwise.

### GetMediaSourceOk

`func (o *PinCreate) GetMediaSourceOk() (*PinMediaSource, bool)`

GetMediaSourceOk returns a tuple with the MediaSource field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaSource

`func (o *PinCreate) SetMediaSource(v PinMediaSource)`

SetMediaSource sets MediaSource field to given value.

### HasMediaSource

`func (o *PinCreate) HasMediaSource() bool`

HasMediaSource returns a boolean if a field has been set.

### GetParentPinId

`func (o *PinCreate) GetParentPinId() string`

GetParentPinId returns the ParentPinId field if non-nil, zero value otherwise.

### GetParentPinIdOk

`func (o *PinCreate) GetParentPinIdOk() (*string, bool)`

GetParentPinIdOk returns a tuple with the ParentPinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentPinId

`func (o *PinCreate) SetParentPinId(v string)`

SetParentPinId sets ParentPinId field to given value.

### HasParentPinId

`func (o *PinCreate) HasParentPinId() bool`

HasParentPinId returns a boolean if a field has been set.

### SetParentPinIdNil

`func (o *PinCreate) SetParentPinIdNil(b bool)`

 SetParentPinIdNil sets the value for ParentPinId to be an explicit nil

### UnsetParentPinId
`func (o *PinCreate) UnsetParentPinId()`

UnsetParentPinId ensures that no value is present for ParentPinId, not even an explicit nil
### GetNote

`func (o *PinCreate) GetNote() string`

GetNote returns the Note field if non-nil, zero value otherwise.

### GetNoteOk

`func (o *PinCreate) GetNoteOk() (*string, bool)`

GetNoteOk returns a tuple with the Note field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNote

`func (o *PinCreate) SetNote(v string)`

SetNote sets Note field to given value.

### HasNote

`func (o *PinCreate) HasNote() bool`

HasNote returns a boolean if a field has been set.

### SetNoteNil

`func (o *PinCreate) SetNoteNil(b bool)`

 SetNoteNil sets the value for Note to be an explicit nil

### UnsetNote
`func (o *PinCreate) UnsetNote()`

UnsetNote ensures that no value is present for Note, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


