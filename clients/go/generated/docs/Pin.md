# Pin

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
**CreativeType** | Pointer to [**NullableCreativeType**](CreativeType.md) |  | [optional] [readonly] 
**BoardId** | Pointer to **string** | The board to which this Pin belongs. | [optional] 
**BoardSectionId** | Pointer to **NullableString** | The board section to which this Pin belongs. | [optional] 
**BoardOwner** | Pointer to [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**IsOwner** | Pointer to **bool** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [readonly] 
**Media** | Pointer to [**PinMedia**](PinMedia.md) |  | [optional] [readonly] 
**MediaSource** | Pointer to [**PinMediaSource**](PinMediaSource.md) |  | [optional] 
**ParentPinId** | Pointer to **NullableString** | The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 
**IsStandard** | Pointer to **bool** | Whether the Pin is standard or not. See documentation on &lt;a href&#x3D;\&quot;/docs/api-features/content-overview/\&quot;&gt;Changes to Pin creation&lt;/a&gt; for more information. | [optional] 
**HasBeenPromoted** | Pointer to **bool** | Whether the Pin has been promoted or not. | [optional] [readonly] 
**Note** | Pointer to **NullableString** | Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 
**PinMetrics** | Pointer to **map[string]interface{}** | Pin metrics with associated time intervals if any. | [optional] 

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
### GetDominantColor

`func (o *Pin) GetDominantColor() string`

GetDominantColor returns the DominantColor field if non-nil, zero value otherwise.

### GetDominantColorOk

`func (o *Pin) GetDominantColorOk() (*string, bool)`

GetDominantColorOk returns a tuple with the DominantColor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDominantColor

`func (o *Pin) SetDominantColor(v string)`

SetDominantColor sets DominantColor field to given value.

### HasDominantColor

`func (o *Pin) HasDominantColor() bool`

HasDominantColor returns a boolean if a field has been set.

### SetDominantColorNil

`func (o *Pin) SetDominantColorNil(b bool)`

 SetDominantColorNil sets the value for DominantColor to be an explicit nil

### UnsetDominantColor
`func (o *Pin) UnsetDominantColor()`

UnsetDominantColor ensures that no value is present for DominantColor, not even an explicit nil
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
### GetCreativeType

`func (o *Pin) GetCreativeType() CreativeType`

GetCreativeType returns the CreativeType field if non-nil, zero value otherwise.

### GetCreativeTypeOk

`func (o *Pin) GetCreativeTypeOk() (*CreativeType, bool)`

GetCreativeTypeOk returns a tuple with the CreativeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeType

`func (o *Pin) SetCreativeType(v CreativeType)`

SetCreativeType sets CreativeType field to given value.

### HasCreativeType

`func (o *Pin) HasCreativeType() bool`

HasCreativeType returns a boolean if a field has been set.

### SetCreativeTypeNil

`func (o *Pin) SetCreativeTypeNil(b bool)`

 SetCreativeTypeNil sets the value for CreativeType to be an explicit nil

### UnsetCreativeType
`func (o *Pin) UnsetCreativeType()`

UnsetCreativeType ensures that no value is present for CreativeType, not even an explicit nil
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

### GetIsOwner

`func (o *Pin) GetIsOwner() bool`

GetIsOwner returns the IsOwner field if non-nil, zero value otherwise.

### GetIsOwnerOk

`func (o *Pin) GetIsOwnerOk() (*bool, bool)`

GetIsOwnerOk returns a tuple with the IsOwner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOwner

`func (o *Pin) SetIsOwner(v bool)`

SetIsOwner sets IsOwner field to given value.

### HasIsOwner

`func (o *Pin) HasIsOwner() bool`

HasIsOwner returns a boolean if a field has been set.

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

### GetParentPinId

`func (o *Pin) GetParentPinId() string`

GetParentPinId returns the ParentPinId field if non-nil, zero value otherwise.

### GetParentPinIdOk

`func (o *Pin) GetParentPinIdOk() (*string, bool)`

GetParentPinIdOk returns a tuple with the ParentPinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentPinId

`func (o *Pin) SetParentPinId(v string)`

SetParentPinId sets ParentPinId field to given value.

### HasParentPinId

`func (o *Pin) HasParentPinId() bool`

HasParentPinId returns a boolean if a field has been set.

### SetParentPinIdNil

`func (o *Pin) SetParentPinIdNil(b bool)`

 SetParentPinIdNil sets the value for ParentPinId to be an explicit nil

### UnsetParentPinId
`func (o *Pin) UnsetParentPinId()`

UnsetParentPinId ensures that no value is present for ParentPinId, not even an explicit nil
### GetIsStandard

`func (o *Pin) GetIsStandard() bool`

GetIsStandard returns the IsStandard field if non-nil, zero value otherwise.

### GetIsStandardOk

`func (o *Pin) GetIsStandardOk() (*bool, bool)`

GetIsStandardOk returns a tuple with the IsStandard field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsStandard

`func (o *Pin) SetIsStandard(v bool)`

SetIsStandard sets IsStandard field to given value.

### HasIsStandard

`func (o *Pin) HasIsStandard() bool`

HasIsStandard returns a boolean if a field has been set.

### GetHasBeenPromoted

`func (o *Pin) GetHasBeenPromoted() bool`

GetHasBeenPromoted returns the HasBeenPromoted field if non-nil, zero value otherwise.

### GetHasBeenPromotedOk

`func (o *Pin) GetHasBeenPromotedOk() (*bool, bool)`

GetHasBeenPromotedOk returns a tuple with the HasBeenPromoted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasBeenPromoted

`func (o *Pin) SetHasBeenPromoted(v bool)`

SetHasBeenPromoted sets HasBeenPromoted field to given value.

### HasHasBeenPromoted

`func (o *Pin) HasHasBeenPromoted() bool`

HasHasBeenPromoted returns a boolean if a field has been set.

### GetNote

`func (o *Pin) GetNote() string`

GetNote returns the Note field if non-nil, zero value otherwise.

### GetNoteOk

`func (o *Pin) GetNoteOk() (*string, bool)`

GetNoteOk returns a tuple with the Note field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNote

`func (o *Pin) SetNote(v string)`

SetNote sets Note field to given value.

### HasNote

`func (o *Pin) HasNote() bool`

HasNote returns a boolean if a field has been set.

### SetNoteNil

`func (o *Pin) SetNoteNil(b bool)`

 SetNoteNil sets the value for Note to be an explicit nil

### UnsetNote
`func (o *Pin) UnsetNote()`

UnsetNote ensures that no value is present for Note, not even an explicit nil
### GetPinMetrics

`func (o *Pin) GetPinMetrics() map[string]interface{}`

GetPinMetrics returns the PinMetrics field if non-nil, zero value otherwise.

### GetPinMetricsOk

`func (o *Pin) GetPinMetricsOk() (*map[string]interface{}, bool)`

GetPinMetricsOk returns a tuple with the PinMetrics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinMetrics

`func (o *Pin) SetPinMetrics(v map[string]interface{})`

SetPinMetrics sets PinMetrics field to given value.

### HasPinMetrics

`func (o *Pin) HasPinMetrics() bool`

HasPinMetrics returns a boolean if a field has been set.

### SetPinMetricsNil

`func (o *Pin) SetPinMetricsNil(b bool)`

 SetPinMetricsNil sets the value for PinMetrics to be an explicit nil

### UnsetPinMetrics
`func (o *Pin) UnsetPinMetrics()`

UnsetPinMetrics ensures that no value is present for PinMetrics, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


