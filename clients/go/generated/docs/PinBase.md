# PinBase

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

## Methods

### NewPinBase

`func NewPinBase(id string, ) *PinBase`

NewPinBase instantiates a new PinBase object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPinBaseWithDefaults

`func NewPinBaseWithDefaults() *PinBase`

NewPinBaseWithDefaults instantiates a new PinBase object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAiDisclosures

`func (o *PinBase) GetAiDisclosures() AiDisclosures`

GetAiDisclosures returns the AiDisclosures field if non-nil, zero value otherwise.

### GetAiDisclosuresOk

`func (o *PinBase) GetAiDisclosuresOk() (*AiDisclosures, bool)`

GetAiDisclosuresOk returns a tuple with the AiDisclosures field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAiDisclosures

`func (o *PinBase) SetAiDisclosures(v AiDisclosures)`

SetAiDisclosures sets AiDisclosures field to given value.

### HasAiDisclosures

`func (o *PinBase) HasAiDisclosures() bool`

HasAiDisclosures returns a boolean if a field has been set.

### GetBoardId

`func (o *PinBase) GetBoardId() string`

GetBoardId returns the BoardId field if non-nil, zero value otherwise.

### GetBoardIdOk

`func (o *PinBase) GetBoardIdOk() (*string, bool)`

GetBoardIdOk returns a tuple with the BoardId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoardId

`func (o *PinBase) SetBoardId(v string)`

SetBoardId sets BoardId field to given value.

### HasBoardId

`func (o *PinBase) HasBoardId() bool`

HasBoardId returns a boolean if a field has been set.

### GetBoardOwner

`func (o *PinBase) GetBoardOwner() BoardOwner`

GetBoardOwner returns the BoardOwner field if non-nil, zero value otherwise.

### GetBoardOwnerOk

`func (o *PinBase) GetBoardOwnerOk() (*BoardOwner, bool)`

GetBoardOwnerOk returns a tuple with the BoardOwner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoardOwner

`func (o *PinBase) SetBoardOwner(v BoardOwner)`

SetBoardOwner sets BoardOwner field to given value.

### HasBoardOwner

`func (o *PinBase) HasBoardOwner() bool`

HasBoardOwner returns a boolean if a field has been set.

### GetBoardSectionId

`func (o *PinBase) GetBoardSectionId() string`

GetBoardSectionId returns the BoardSectionId field if non-nil, zero value otherwise.

### GetBoardSectionIdOk

`func (o *PinBase) GetBoardSectionIdOk() (*string, bool)`

GetBoardSectionIdOk returns a tuple with the BoardSectionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoardSectionId

`func (o *PinBase) SetBoardSectionId(v string)`

SetBoardSectionId sets BoardSectionId field to given value.

### HasBoardSectionId

`func (o *PinBase) HasBoardSectionId() bool`

HasBoardSectionId returns a boolean if a field has been set.

### SetBoardSectionIdNil

`func (o *PinBase) SetBoardSectionIdNil(b bool)`

 SetBoardSectionIdNil sets the value for BoardSectionId to be an explicit nil

### UnsetBoardSectionId
`func (o *PinBase) UnsetBoardSectionId()`

UnsetBoardSectionId ensures that no value is present for BoardSectionId, not even an explicit nil
### GetCreatedAt

`func (o *PinBase) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *PinBase) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *PinBase) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *PinBase) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetCreativeType

`func (o *PinBase) GetCreativeType() CreativeType`

GetCreativeType returns the CreativeType field if non-nil, zero value otherwise.

### GetCreativeTypeOk

`func (o *PinBase) GetCreativeTypeOk() (*CreativeType, bool)`

GetCreativeTypeOk returns a tuple with the CreativeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeType

`func (o *PinBase) SetCreativeType(v CreativeType)`

SetCreativeType sets CreativeType field to given value.

### HasCreativeType

`func (o *PinBase) HasCreativeType() bool`

HasCreativeType returns a boolean if a field has been set.

### SetCreativeTypeNil

`func (o *PinBase) SetCreativeTypeNil(b bool)`

 SetCreativeTypeNil sets the value for CreativeType to be an explicit nil

### UnsetCreativeType
`func (o *PinBase) UnsetCreativeType()`

UnsetCreativeType ensures that no value is present for CreativeType, not even an explicit nil
### GetDominantColor

`func (o *PinBase) GetDominantColor() string`

GetDominantColor returns the DominantColor field if non-nil, zero value otherwise.

### GetDominantColorOk

`func (o *PinBase) GetDominantColorOk() (*string, bool)`

GetDominantColorOk returns a tuple with the DominantColor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDominantColor

`func (o *PinBase) SetDominantColor(v string)`

SetDominantColor sets DominantColor field to given value.

### HasDominantColor

`func (o *PinBase) HasDominantColor() bool`

HasDominantColor returns a boolean if a field has been set.

### SetDominantColorNil

`func (o *PinBase) SetDominantColorNil(b bool)`

 SetDominantColorNil sets the value for DominantColor to be an explicit nil

### UnsetDominantColor
`func (o *PinBase) UnsetDominantColor()`

UnsetDominantColor ensures that no value is present for DominantColor, not even an explicit nil
### GetHasBeenPromoted

`func (o *PinBase) GetHasBeenPromoted() bool`

GetHasBeenPromoted returns the HasBeenPromoted field if non-nil, zero value otherwise.

### GetHasBeenPromotedOk

`func (o *PinBase) GetHasBeenPromotedOk() (*bool, bool)`

GetHasBeenPromotedOk returns a tuple with the HasBeenPromoted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasBeenPromoted

`func (o *PinBase) SetHasBeenPromoted(v bool)`

SetHasBeenPromoted sets HasBeenPromoted field to given value.

### HasHasBeenPromoted

`func (o *PinBase) HasHasBeenPromoted() bool`

HasHasBeenPromoted returns a boolean if a field has been set.

### GetId

`func (o *PinBase) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *PinBase) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *PinBase) SetId(v string)`

SetId sets Id field to given value.


### GetIsOwner

`func (o *PinBase) GetIsOwner() bool`

GetIsOwner returns the IsOwner field if non-nil, zero value otherwise.

### GetIsOwnerOk

`func (o *PinBase) GetIsOwnerOk() (*bool, bool)`

GetIsOwnerOk returns a tuple with the IsOwner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOwner

`func (o *PinBase) SetIsOwner(v bool)`

SetIsOwner sets IsOwner field to given value.

### HasIsOwner

`func (o *PinBase) HasIsOwner() bool`

HasIsOwner returns a boolean if a field has been set.

### GetIsProduct

`func (o *PinBase) GetIsProduct() bool`

GetIsProduct returns the IsProduct field if non-nil, zero value otherwise.

### GetIsProductOk

`func (o *PinBase) GetIsProductOk() (*bool, bool)`

GetIsProductOk returns a tuple with the IsProduct field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsProduct

`func (o *PinBase) SetIsProduct(v bool)`

SetIsProduct sets IsProduct field to given value.

### HasIsProduct

`func (o *PinBase) HasIsProduct() bool`

HasIsProduct returns a boolean if a field has been set.

### GetIsStandard

`func (o *PinBase) GetIsStandard() bool`

GetIsStandard returns the IsStandard field if non-nil, zero value otherwise.

### GetIsStandardOk

`func (o *PinBase) GetIsStandardOk() (*bool, bool)`

GetIsStandardOk returns a tuple with the IsStandard field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsStandard

`func (o *PinBase) SetIsStandard(v bool)`

SetIsStandard sets IsStandard field to given value.

### HasIsStandard

`func (o *PinBase) HasIsStandard() bool`

HasIsStandard returns a boolean if a field has been set.

### GetMedia

`func (o *PinBase) GetMedia() PinMedia`

GetMedia returns the Media field if non-nil, zero value otherwise.

### GetMediaOk

`func (o *PinBase) GetMediaOk() (*PinMedia, bool)`

GetMediaOk returns a tuple with the Media field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMedia

`func (o *PinBase) SetMedia(v PinMedia)`

SetMedia sets Media field to given value.

### HasMedia

`func (o *PinBase) HasMedia() bool`

HasMedia returns a boolean if a field has been set.

### GetParentPinId

`func (o *PinBase) GetParentPinId() string`

GetParentPinId returns the ParentPinId field if non-nil, zero value otherwise.

### GetParentPinIdOk

`func (o *PinBase) GetParentPinIdOk() (*string, bool)`

GetParentPinIdOk returns a tuple with the ParentPinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentPinId

`func (o *PinBase) SetParentPinId(v string)`

SetParentPinId sets ParentPinId field to given value.

### HasParentPinId

`func (o *PinBase) HasParentPinId() bool`

HasParentPinId returns a boolean if a field has been set.

### SetParentPinIdNil

`func (o *PinBase) SetParentPinIdNil(b bool)`

 SetParentPinIdNil sets the value for ParentPinId to be an explicit nil

### UnsetParentPinId
`func (o *PinBase) UnsetParentPinId()`

UnsetParentPinId ensures that no value is present for ParentPinId, not even an explicit nil
### GetPinMetrics

`func (o *PinBase) GetPinMetrics() map[string]interface{}`

GetPinMetrics returns the PinMetrics field if non-nil, zero value otherwise.

### GetPinMetricsOk

`func (o *PinBase) GetPinMetricsOk() (*map[string]interface{}, bool)`

GetPinMetricsOk returns a tuple with the PinMetrics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinMetrics

`func (o *PinBase) SetPinMetrics(v map[string]interface{})`

SetPinMetrics sets PinMetrics field to given value.

### HasPinMetrics

`func (o *PinBase) HasPinMetrics() bool`

HasPinMetrics returns a boolean if a field has been set.

### SetPinMetricsNil

`func (o *PinBase) SetPinMetricsNil(b bool)`

 SetPinMetricsNil sets the value for PinMetrics to be an explicit nil

### UnsetPinMetrics
`func (o *PinBase) UnsetPinMetrics()`

UnsetPinMetrics ensures that no value is present for PinMetrics, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


