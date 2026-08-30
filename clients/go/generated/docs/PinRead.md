# PinRead

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AiDisclosures** | Pointer to [**AiDisclosures**](AiDisclosures.md) | AI disclosure declarations the creator has made about this Pin. | [optional] 
**BoardId** | Pointer to **string** | The board to which this Pin belongs. | [optional] 
**BoardOwner** | Pointer to [**BoardOwner**](BoardOwner.md) |  | [optional] [readonly] 
**BoardSectionId** | Pointer to **NullableString** | The board section to which this Pin belongs. | [optional] 
**CreatedAt** | Pointer to **time.Time** |  | [optional] [readonly] 
**CreativeType** | Pointer to [**NullableCreativeType**](CreativeType.md) |  | [optional] [readonly] 
**DominantColor** | Pointer to **NullableString** | Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. | [optional] 
**HasBeenPromoted** | Pointer to **bool** | Whether the Pin has been promoted or not. | [optional] [readonly] 
**Id** | **string** |  | 
**IsOwner** | Pointer to **bool** | Whether the \&quot;operation user_account\&quot; is the Pin owner. | [optional] [readonly] 
**IsProduct** | Pointer to **bool** | Whether the Pin is a product Pin. | [optional] [readonly] 
**IsStandard** | Pointer to **bool** | Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. | [optional] [readonly] 
**Media** | Pointer to [**PinMedia**](PinMedia.md) |  | [optional] [readonly] 
**ParentPinId** | Pointer to **NullableString** | The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). | [optional] 
**PinMetrics** | Pointer to **map[string]interface{}** | Pin metrics with associated time intervals if any. | [optional] [readonly] 
**AltText** | Pointer to **NullableString** |  | [optional] 
**Description** | Pointer to **NullableString** |  | [optional] 
**Link** | Pointer to **NullableString** |  | [optional] 
**Title** | Pointer to **NullableString** |  | [optional] 

## Methods

### NewPinRead

`func NewPinRead(id string, ) *PinRead`

NewPinRead instantiates a new PinRead object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPinReadWithDefaults

`func NewPinReadWithDefaults() *PinRead`

NewPinReadWithDefaults instantiates a new PinRead object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAiDisclosures

`func (o *PinRead) GetAiDisclosures() AiDisclosures`

GetAiDisclosures returns the AiDisclosures field if non-nil, zero value otherwise.

### GetAiDisclosuresOk

`func (o *PinRead) GetAiDisclosuresOk() (*AiDisclosures, bool)`

GetAiDisclosuresOk returns a tuple with the AiDisclosures field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAiDisclosures

`func (o *PinRead) SetAiDisclosures(v AiDisclosures)`

SetAiDisclosures sets AiDisclosures field to given value.

### HasAiDisclosures

`func (o *PinRead) HasAiDisclosures() bool`

HasAiDisclosures returns a boolean if a field has been set.

### GetBoardId

`func (o *PinRead) GetBoardId() string`

GetBoardId returns the BoardId field if non-nil, zero value otherwise.

### GetBoardIdOk

`func (o *PinRead) GetBoardIdOk() (*string, bool)`

GetBoardIdOk returns a tuple with the BoardId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoardId

`func (o *PinRead) SetBoardId(v string)`

SetBoardId sets BoardId field to given value.

### HasBoardId

`func (o *PinRead) HasBoardId() bool`

HasBoardId returns a boolean if a field has been set.

### GetBoardOwner

`func (o *PinRead) GetBoardOwner() BoardOwner`

GetBoardOwner returns the BoardOwner field if non-nil, zero value otherwise.

### GetBoardOwnerOk

`func (o *PinRead) GetBoardOwnerOk() (*BoardOwner, bool)`

GetBoardOwnerOk returns a tuple with the BoardOwner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoardOwner

`func (o *PinRead) SetBoardOwner(v BoardOwner)`

SetBoardOwner sets BoardOwner field to given value.

### HasBoardOwner

`func (o *PinRead) HasBoardOwner() bool`

HasBoardOwner returns a boolean if a field has been set.

### GetBoardSectionId

`func (o *PinRead) GetBoardSectionId() string`

GetBoardSectionId returns the BoardSectionId field if non-nil, zero value otherwise.

### GetBoardSectionIdOk

`func (o *PinRead) GetBoardSectionIdOk() (*string, bool)`

GetBoardSectionIdOk returns a tuple with the BoardSectionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoardSectionId

`func (o *PinRead) SetBoardSectionId(v string)`

SetBoardSectionId sets BoardSectionId field to given value.

### HasBoardSectionId

`func (o *PinRead) HasBoardSectionId() bool`

HasBoardSectionId returns a boolean if a field has been set.

### SetBoardSectionIdNil

`func (o *PinRead) SetBoardSectionIdNil(b bool)`

 SetBoardSectionIdNil sets the value for BoardSectionId to be an explicit nil

### UnsetBoardSectionId
`func (o *PinRead) UnsetBoardSectionId()`

UnsetBoardSectionId ensures that no value is present for BoardSectionId, not even an explicit nil
### GetCreatedAt

`func (o *PinRead) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *PinRead) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *PinRead) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *PinRead) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetCreativeType

`func (o *PinRead) GetCreativeType() CreativeType`

GetCreativeType returns the CreativeType field if non-nil, zero value otherwise.

### GetCreativeTypeOk

`func (o *PinRead) GetCreativeTypeOk() (*CreativeType, bool)`

GetCreativeTypeOk returns a tuple with the CreativeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeType

`func (o *PinRead) SetCreativeType(v CreativeType)`

SetCreativeType sets CreativeType field to given value.

### HasCreativeType

`func (o *PinRead) HasCreativeType() bool`

HasCreativeType returns a boolean if a field has been set.

### SetCreativeTypeNil

`func (o *PinRead) SetCreativeTypeNil(b bool)`

 SetCreativeTypeNil sets the value for CreativeType to be an explicit nil

### UnsetCreativeType
`func (o *PinRead) UnsetCreativeType()`

UnsetCreativeType ensures that no value is present for CreativeType, not even an explicit nil
### GetDominantColor

`func (o *PinRead) GetDominantColor() string`

GetDominantColor returns the DominantColor field if non-nil, zero value otherwise.

### GetDominantColorOk

`func (o *PinRead) GetDominantColorOk() (*string, bool)`

GetDominantColorOk returns a tuple with the DominantColor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDominantColor

`func (o *PinRead) SetDominantColor(v string)`

SetDominantColor sets DominantColor field to given value.

### HasDominantColor

`func (o *PinRead) HasDominantColor() bool`

HasDominantColor returns a boolean if a field has been set.

### SetDominantColorNil

`func (o *PinRead) SetDominantColorNil(b bool)`

 SetDominantColorNil sets the value for DominantColor to be an explicit nil

### UnsetDominantColor
`func (o *PinRead) UnsetDominantColor()`

UnsetDominantColor ensures that no value is present for DominantColor, not even an explicit nil
### GetHasBeenPromoted

`func (o *PinRead) GetHasBeenPromoted() bool`

GetHasBeenPromoted returns the HasBeenPromoted field if non-nil, zero value otherwise.

### GetHasBeenPromotedOk

`func (o *PinRead) GetHasBeenPromotedOk() (*bool, bool)`

GetHasBeenPromotedOk returns a tuple with the HasBeenPromoted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasBeenPromoted

`func (o *PinRead) SetHasBeenPromoted(v bool)`

SetHasBeenPromoted sets HasBeenPromoted field to given value.

### HasHasBeenPromoted

`func (o *PinRead) HasHasBeenPromoted() bool`

HasHasBeenPromoted returns a boolean if a field has been set.

### GetId

`func (o *PinRead) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *PinRead) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *PinRead) SetId(v string)`

SetId sets Id field to given value.


### GetIsOwner

`func (o *PinRead) GetIsOwner() bool`

GetIsOwner returns the IsOwner field if non-nil, zero value otherwise.

### GetIsOwnerOk

`func (o *PinRead) GetIsOwnerOk() (*bool, bool)`

GetIsOwnerOk returns a tuple with the IsOwner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOwner

`func (o *PinRead) SetIsOwner(v bool)`

SetIsOwner sets IsOwner field to given value.

### HasIsOwner

`func (o *PinRead) HasIsOwner() bool`

HasIsOwner returns a boolean if a field has been set.

### GetIsProduct

`func (o *PinRead) GetIsProduct() bool`

GetIsProduct returns the IsProduct field if non-nil, zero value otherwise.

### GetIsProductOk

`func (o *PinRead) GetIsProductOk() (*bool, bool)`

GetIsProductOk returns a tuple with the IsProduct field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsProduct

`func (o *PinRead) SetIsProduct(v bool)`

SetIsProduct sets IsProduct field to given value.

### HasIsProduct

`func (o *PinRead) HasIsProduct() bool`

HasIsProduct returns a boolean if a field has been set.

### GetIsStandard

`func (o *PinRead) GetIsStandard() bool`

GetIsStandard returns the IsStandard field if non-nil, zero value otherwise.

### GetIsStandardOk

`func (o *PinRead) GetIsStandardOk() (*bool, bool)`

GetIsStandardOk returns a tuple with the IsStandard field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsStandard

`func (o *PinRead) SetIsStandard(v bool)`

SetIsStandard sets IsStandard field to given value.

### HasIsStandard

`func (o *PinRead) HasIsStandard() bool`

HasIsStandard returns a boolean if a field has been set.

### GetMedia

`func (o *PinRead) GetMedia() PinMedia`

GetMedia returns the Media field if non-nil, zero value otherwise.

### GetMediaOk

`func (o *PinRead) GetMediaOk() (*PinMedia, bool)`

GetMediaOk returns a tuple with the Media field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMedia

`func (o *PinRead) SetMedia(v PinMedia)`

SetMedia sets Media field to given value.

### HasMedia

`func (o *PinRead) HasMedia() bool`

HasMedia returns a boolean if a field has been set.

### GetParentPinId

`func (o *PinRead) GetParentPinId() string`

GetParentPinId returns the ParentPinId field if non-nil, zero value otherwise.

### GetParentPinIdOk

`func (o *PinRead) GetParentPinIdOk() (*string, bool)`

GetParentPinIdOk returns a tuple with the ParentPinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentPinId

`func (o *PinRead) SetParentPinId(v string)`

SetParentPinId sets ParentPinId field to given value.

### HasParentPinId

`func (o *PinRead) HasParentPinId() bool`

HasParentPinId returns a boolean if a field has been set.

### SetParentPinIdNil

`func (o *PinRead) SetParentPinIdNil(b bool)`

 SetParentPinIdNil sets the value for ParentPinId to be an explicit nil

### UnsetParentPinId
`func (o *PinRead) UnsetParentPinId()`

UnsetParentPinId ensures that no value is present for ParentPinId, not even an explicit nil
### GetPinMetrics

`func (o *PinRead) GetPinMetrics() map[string]interface{}`

GetPinMetrics returns the PinMetrics field if non-nil, zero value otherwise.

### GetPinMetricsOk

`func (o *PinRead) GetPinMetricsOk() (*map[string]interface{}, bool)`

GetPinMetricsOk returns a tuple with the PinMetrics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinMetrics

`func (o *PinRead) SetPinMetrics(v map[string]interface{})`

SetPinMetrics sets PinMetrics field to given value.

### HasPinMetrics

`func (o *PinRead) HasPinMetrics() bool`

HasPinMetrics returns a boolean if a field has been set.

### SetPinMetricsNil

`func (o *PinRead) SetPinMetricsNil(b bool)`

 SetPinMetricsNil sets the value for PinMetrics to be an explicit nil

### UnsetPinMetrics
`func (o *PinRead) UnsetPinMetrics()`

UnsetPinMetrics ensures that no value is present for PinMetrics, not even an explicit nil
### GetAltText

`func (o *PinRead) GetAltText() string`

GetAltText returns the AltText field if non-nil, zero value otherwise.

### GetAltTextOk

`func (o *PinRead) GetAltTextOk() (*string, bool)`

GetAltTextOk returns a tuple with the AltText field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAltText

`func (o *PinRead) SetAltText(v string)`

SetAltText sets AltText field to given value.

### HasAltText

`func (o *PinRead) HasAltText() bool`

HasAltText returns a boolean if a field has been set.

### SetAltTextNil

`func (o *PinRead) SetAltTextNil(b bool)`

 SetAltTextNil sets the value for AltText to be an explicit nil

### UnsetAltText
`func (o *PinRead) UnsetAltText()`

UnsetAltText ensures that no value is present for AltText, not even an explicit nil
### GetDescription

`func (o *PinRead) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *PinRead) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *PinRead) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *PinRead) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *PinRead) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *PinRead) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetLink

`func (o *PinRead) GetLink() string`

GetLink returns the Link field if non-nil, zero value otherwise.

### GetLinkOk

`func (o *PinRead) GetLinkOk() (*string, bool)`

GetLinkOk returns a tuple with the Link field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLink

`func (o *PinRead) SetLink(v string)`

SetLink sets Link field to given value.

### HasLink

`func (o *PinRead) HasLink() bool`

HasLink returns a boolean if a field has been set.

### SetLinkNil

`func (o *PinRead) SetLinkNil(b bool)`

 SetLinkNil sets the value for Link to be an explicit nil

### UnsetLink
`func (o *PinRead) UnsetLink()`

UnsetLink ensures that no value is present for Link, not even an explicit nil
### GetTitle

`func (o *PinRead) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *PinRead) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *PinRead) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *PinRead) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### SetTitleNil

`func (o *PinRead) SetTitleNil(b bool)`

 SetTitleNil sets the value for Title to be an explicit nil

### UnsetTitle
`func (o *PinRead) UnsetTitle()`

UnsetTitle ensures that no value is present for Title, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


