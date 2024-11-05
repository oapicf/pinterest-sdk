# ProductGroupPromotionCreateRequestElement

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | ID of the product group promotion. | [optional] 
**AdGroupId** | Pointer to **string** | ID of the ad group the product group belongs to. | [optional] 
**BidInMicroCurrency** | Pointer to **NullableInt32** | The bid in micro currency. | [optional] 
**Included** | Pointer to **NullableBool** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] 
**Definition** | Pointer to **NullableString** | The full product group definition path | [optional] 
**RelativeDefinition** | Pointer to **NullableString** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] 
**ParentId** | Pointer to **NullableString** | The parent Product Group ID of this Product Group | [optional] 
**SlideshowCollectionsTitle** | Pointer to **NullableString** | Slideshow Collections Title | [optional] 
**SlideshowCollectionsDescription** | Pointer to **NullableString** | Slideshow Collections Description | [optional] 
**IsMdl** | Pointer to **NullableBool** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] 
**Status** | Pointer to [**EntityStatus**](EntityStatus.md) |  | [optional] 
**TrackingUrl** | Pointer to **NullableString** | Tracking template for proudct group promotions. 4000 limit | [optional] 
**CatalogProductGroupId** | Pointer to **NullableString** | ID of the catalogs product group that this product group promotion references | [optional] 
**CatalogProductGroupName** | Pointer to **NullableString** | Catalogs product group name | [optional] 
**CollectionsHeroPinId** | Pointer to **NullableString** | Hero Pin ID if this PG is promoted as a Collection | [optional] 
**CollectionsHeroDestinationUrl** | Pointer to **NullableString** | Collections Hero Destination Url | [optional] 
**GridClickType** | Pointer to [**NullableGridClickType**](GridClickType.md) |  | [optional] 
**CreativeType** | Pointer to [**CreativeType**](CreativeType.md) |  | [optional] 

## Methods

### NewProductGroupPromotionCreateRequestElement

`func NewProductGroupPromotionCreateRequestElement() *ProductGroupPromotionCreateRequestElement`

NewProductGroupPromotionCreateRequestElement instantiates a new ProductGroupPromotionCreateRequestElement object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProductGroupPromotionCreateRequestElementWithDefaults

`func NewProductGroupPromotionCreateRequestElementWithDefaults() *ProductGroupPromotionCreateRequestElement`

NewProductGroupPromotionCreateRequestElementWithDefaults instantiates a new ProductGroupPromotionCreateRequestElement object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ProductGroupPromotionCreateRequestElement) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ProductGroupPromotionCreateRequestElement) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ProductGroupPromotionCreateRequestElement) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *ProductGroupPromotionCreateRequestElement) HasId() bool`

HasId returns a boolean if a field has been set.

### GetAdGroupId

`func (o *ProductGroupPromotionCreateRequestElement) GetAdGroupId() string`

GetAdGroupId returns the AdGroupId field if non-nil, zero value otherwise.

### GetAdGroupIdOk

`func (o *ProductGroupPromotionCreateRequestElement) GetAdGroupIdOk() (*string, bool)`

GetAdGroupIdOk returns a tuple with the AdGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdGroupId

`func (o *ProductGroupPromotionCreateRequestElement) SetAdGroupId(v string)`

SetAdGroupId sets AdGroupId field to given value.

### HasAdGroupId

`func (o *ProductGroupPromotionCreateRequestElement) HasAdGroupId() bool`

HasAdGroupId returns a boolean if a field has been set.

### GetBidInMicroCurrency

`func (o *ProductGroupPromotionCreateRequestElement) GetBidInMicroCurrency() int32`

GetBidInMicroCurrency returns the BidInMicroCurrency field if non-nil, zero value otherwise.

### GetBidInMicroCurrencyOk

`func (o *ProductGroupPromotionCreateRequestElement) GetBidInMicroCurrencyOk() (*int32, bool)`

GetBidInMicroCurrencyOk returns a tuple with the BidInMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidInMicroCurrency

`func (o *ProductGroupPromotionCreateRequestElement) SetBidInMicroCurrency(v int32)`

SetBidInMicroCurrency sets BidInMicroCurrency field to given value.

### HasBidInMicroCurrency

`func (o *ProductGroupPromotionCreateRequestElement) HasBidInMicroCurrency() bool`

HasBidInMicroCurrency returns a boolean if a field has been set.

### SetBidInMicroCurrencyNil

`func (o *ProductGroupPromotionCreateRequestElement) SetBidInMicroCurrencyNil(b bool)`

 SetBidInMicroCurrencyNil sets the value for BidInMicroCurrency to be an explicit nil

### UnsetBidInMicroCurrency
`func (o *ProductGroupPromotionCreateRequestElement) UnsetBidInMicroCurrency()`

UnsetBidInMicroCurrency ensures that no value is present for BidInMicroCurrency, not even an explicit nil
### GetIncluded

`func (o *ProductGroupPromotionCreateRequestElement) GetIncluded() bool`

GetIncluded returns the Included field if non-nil, zero value otherwise.

### GetIncludedOk

`func (o *ProductGroupPromotionCreateRequestElement) GetIncludedOk() (*bool, bool)`

GetIncludedOk returns a tuple with the Included field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncluded

`func (o *ProductGroupPromotionCreateRequestElement) SetIncluded(v bool)`

SetIncluded sets Included field to given value.

### HasIncluded

`func (o *ProductGroupPromotionCreateRequestElement) HasIncluded() bool`

HasIncluded returns a boolean if a field has been set.

### SetIncludedNil

`func (o *ProductGroupPromotionCreateRequestElement) SetIncludedNil(b bool)`

 SetIncludedNil sets the value for Included to be an explicit nil

### UnsetIncluded
`func (o *ProductGroupPromotionCreateRequestElement) UnsetIncluded()`

UnsetIncluded ensures that no value is present for Included, not even an explicit nil
### GetDefinition

`func (o *ProductGroupPromotionCreateRequestElement) GetDefinition() string`

GetDefinition returns the Definition field if non-nil, zero value otherwise.

### GetDefinitionOk

`func (o *ProductGroupPromotionCreateRequestElement) GetDefinitionOk() (*string, bool)`

GetDefinitionOk returns a tuple with the Definition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefinition

`func (o *ProductGroupPromotionCreateRequestElement) SetDefinition(v string)`

SetDefinition sets Definition field to given value.

### HasDefinition

`func (o *ProductGroupPromotionCreateRequestElement) HasDefinition() bool`

HasDefinition returns a boolean if a field has been set.

### SetDefinitionNil

`func (o *ProductGroupPromotionCreateRequestElement) SetDefinitionNil(b bool)`

 SetDefinitionNil sets the value for Definition to be an explicit nil

### UnsetDefinition
`func (o *ProductGroupPromotionCreateRequestElement) UnsetDefinition()`

UnsetDefinition ensures that no value is present for Definition, not even an explicit nil
### GetRelativeDefinition

`func (o *ProductGroupPromotionCreateRequestElement) GetRelativeDefinition() string`

GetRelativeDefinition returns the RelativeDefinition field if non-nil, zero value otherwise.

### GetRelativeDefinitionOk

`func (o *ProductGroupPromotionCreateRequestElement) GetRelativeDefinitionOk() (*string, bool)`

GetRelativeDefinitionOk returns a tuple with the RelativeDefinition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRelativeDefinition

`func (o *ProductGroupPromotionCreateRequestElement) SetRelativeDefinition(v string)`

SetRelativeDefinition sets RelativeDefinition field to given value.

### HasRelativeDefinition

`func (o *ProductGroupPromotionCreateRequestElement) HasRelativeDefinition() bool`

HasRelativeDefinition returns a boolean if a field has been set.

### SetRelativeDefinitionNil

`func (o *ProductGroupPromotionCreateRequestElement) SetRelativeDefinitionNil(b bool)`

 SetRelativeDefinitionNil sets the value for RelativeDefinition to be an explicit nil

### UnsetRelativeDefinition
`func (o *ProductGroupPromotionCreateRequestElement) UnsetRelativeDefinition()`

UnsetRelativeDefinition ensures that no value is present for RelativeDefinition, not even an explicit nil
### GetParentId

`func (o *ProductGroupPromotionCreateRequestElement) GetParentId() string`

GetParentId returns the ParentId field if non-nil, zero value otherwise.

### GetParentIdOk

`func (o *ProductGroupPromotionCreateRequestElement) GetParentIdOk() (*string, bool)`

GetParentIdOk returns a tuple with the ParentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentId

`func (o *ProductGroupPromotionCreateRequestElement) SetParentId(v string)`

SetParentId sets ParentId field to given value.

### HasParentId

`func (o *ProductGroupPromotionCreateRequestElement) HasParentId() bool`

HasParentId returns a boolean if a field has been set.

### SetParentIdNil

`func (o *ProductGroupPromotionCreateRequestElement) SetParentIdNil(b bool)`

 SetParentIdNil sets the value for ParentId to be an explicit nil

### UnsetParentId
`func (o *ProductGroupPromotionCreateRequestElement) UnsetParentId()`

UnsetParentId ensures that no value is present for ParentId, not even an explicit nil
### GetSlideshowCollectionsTitle

`func (o *ProductGroupPromotionCreateRequestElement) GetSlideshowCollectionsTitle() string`

GetSlideshowCollectionsTitle returns the SlideshowCollectionsTitle field if non-nil, zero value otherwise.

### GetSlideshowCollectionsTitleOk

`func (o *ProductGroupPromotionCreateRequestElement) GetSlideshowCollectionsTitleOk() (*string, bool)`

GetSlideshowCollectionsTitleOk returns a tuple with the SlideshowCollectionsTitle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSlideshowCollectionsTitle

`func (o *ProductGroupPromotionCreateRequestElement) SetSlideshowCollectionsTitle(v string)`

SetSlideshowCollectionsTitle sets SlideshowCollectionsTitle field to given value.

### HasSlideshowCollectionsTitle

`func (o *ProductGroupPromotionCreateRequestElement) HasSlideshowCollectionsTitle() bool`

HasSlideshowCollectionsTitle returns a boolean if a field has been set.

### SetSlideshowCollectionsTitleNil

`func (o *ProductGroupPromotionCreateRequestElement) SetSlideshowCollectionsTitleNil(b bool)`

 SetSlideshowCollectionsTitleNil sets the value for SlideshowCollectionsTitle to be an explicit nil

### UnsetSlideshowCollectionsTitle
`func (o *ProductGroupPromotionCreateRequestElement) UnsetSlideshowCollectionsTitle()`

UnsetSlideshowCollectionsTitle ensures that no value is present for SlideshowCollectionsTitle, not even an explicit nil
### GetSlideshowCollectionsDescription

`func (o *ProductGroupPromotionCreateRequestElement) GetSlideshowCollectionsDescription() string`

GetSlideshowCollectionsDescription returns the SlideshowCollectionsDescription field if non-nil, zero value otherwise.

### GetSlideshowCollectionsDescriptionOk

`func (o *ProductGroupPromotionCreateRequestElement) GetSlideshowCollectionsDescriptionOk() (*string, bool)`

GetSlideshowCollectionsDescriptionOk returns a tuple with the SlideshowCollectionsDescription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSlideshowCollectionsDescription

`func (o *ProductGroupPromotionCreateRequestElement) SetSlideshowCollectionsDescription(v string)`

SetSlideshowCollectionsDescription sets SlideshowCollectionsDescription field to given value.

### HasSlideshowCollectionsDescription

`func (o *ProductGroupPromotionCreateRequestElement) HasSlideshowCollectionsDescription() bool`

HasSlideshowCollectionsDescription returns a boolean if a field has been set.

### SetSlideshowCollectionsDescriptionNil

`func (o *ProductGroupPromotionCreateRequestElement) SetSlideshowCollectionsDescriptionNil(b bool)`

 SetSlideshowCollectionsDescriptionNil sets the value for SlideshowCollectionsDescription to be an explicit nil

### UnsetSlideshowCollectionsDescription
`func (o *ProductGroupPromotionCreateRequestElement) UnsetSlideshowCollectionsDescription()`

UnsetSlideshowCollectionsDescription ensures that no value is present for SlideshowCollectionsDescription, not even an explicit nil
### GetIsMdl

`func (o *ProductGroupPromotionCreateRequestElement) GetIsMdl() bool`

GetIsMdl returns the IsMdl field if non-nil, zero value otherwise.

### GetIsMdlOk

`func (o *ProductGroupPromotionCreateRequestElement) GetIsMdlOk() (*bool, bool)`

GetIsMdlOk returns a tuple with the IsMdl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMdl

`func (o *ProductGroupPromotionCreateRequestElement) SetIsMdl(v bool)`

SetIsMdl sets IsMdl field to given value.

### HasIsMdl

`func (o *ProductGroupPromotionCreateRequestElement) HasIsMdl() bool`

HasIsMdl returns a boolean if a field has been set.

### SetIsMdlNil

`func (o *ProductGroupPromotionCreateRequestElement) SetIsMdlNil(b bool)`

 SetIsMdlNil sets the value for IsMdl to be an explicit nil

### UnsetIsMdl
`func (o *ProductGroupPromotionCreateRequestElement) UnsetIsMdl()`

UnsetIsMdl ensures that no value is present for IsMdl, not even an explicit nil
### GetStatus

`func (o *ProductGroupPromotionCreateRequestElement) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ProductGroupPromotionCreateRequestElement) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ProductGroupPromotionCreateRequestElement) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *ProductGroupPromotionCreateRequestElement) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTrackingUrl

`func (o *ProductGroupPromotionCreateRequestElement) GetTrackingUrl() string`

GetTrackingUrl returns the TrackingUrl field if non-nil, zero value otherwise.

### GetTrackingUrlOk

`func (o *ProductGroupPromotionCreateRequestElement) GetTrackingUrlOk() (*string, bool)`

GetTrackingUrlOk returns a tuple with the TrackingUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrl

`func (o *ProductGroupPromotionCreateRequestElement) SetTrackingUrl(v string)`

SetTrackingUrl sets TrackingUrl field to given value.

### HasTrackingUrl

`func (o *ProductGroupPromotionCreateRequestElement) HasTrackingUrl() bool`

HasTrackingUrl returns a boolean if a field has been set.

### SetTrackingUrlNil

`func (o *ProductGroupPromotionCreateRequestElement) SetTrackingUrlNil(b bool)`

 SetTrackingUrlNil sets the value for TrackingUrl to be an explicit nil

### UnsetTrackingUrl
`func (o *ProductGroupPromotionCreateRequestElement) UnsetTrackingUrl()`

UnsetTrackingUrl ensures that no value is present for TrackingUrl, not even an explicit nil
### GetCatalogProductGroupId

`func (o *ProductGroupPromotionCreateRequestElement) GetCatalogProductGroupId() string`

GetCatalogProductGroupId returns the CatalogProductGroupId field if non-nil, zero value otherwise.

### GetCatalogProductGroupIdOk

`func (o *ProductGroupPromotionCreateRequestElement) GetCatalogProductGroupIdOk() (*string, bool)`

GetCatalogProductGroupIdOk returns a tuple with the CatalogProductGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogProductGroupId

`func (o *ProductGroupPromotionCreateRequestElement) SetCatalogProductGroupId(v string)`

SetCatalogProductGroupId sets CatalogProductGroupId field to given value.

### HasCatalogProductGroupId

`func (o *ProductGroupPromotionCreateRequestElement) HasCatalogProductGroupId() bool`

HasCatalogProductGroupId returns a boolean if a field has been set.

### SetCatalogProductGroupIdNil

`func (o *ProductGroupPromotionCreateRequestElement) SetCatalogProductGroupIdNil(b bool)`

 SetCatalogProductGroupIdNil sets the value for CatalogProductGroupId to be an explicit nil

### UnsetCatalogProductGroupId
`func (o *ProductGroupPromotionCreateRequestElement) UnsetCatalogProductGroupId()`

UnsetCatalogProductGroupId ensures that no value is present for CatalogProductGroupId, not even an explicit nil
### GetCatalogProductGroupName

`func (o *ProductGroupPromotionCreateRequestElement) GetCatalogProductGroupName() string`

GetCatalogProductGroupName returns the CatalogProductGroupName field if non-nil, zero value otherwise.

### GetCatalogProductGroupNameOk

`func (o *ProductGroupPromotionCreateRequestElement) GetCatalogProductGroupNameOk() (*string, bool)`

GetCatalogProductGroupNameOk returns a tuple with the CatalogProductGroupName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogProductGroupName

`func (o *ProductGroupPromotionCreateRequestElement) SetCatalogProductGroupName(v string)`

SetCatalogProductGroupName sets CatalogProductGroupName field to given value.

### HasCatalogProductGroupName

`func (o *ProductGroupPromotionCreateRequestElement) HasCatalogProductGroupName() bool`

HasCatalogProductGroupName returns a boolean if a field has been set.

### SetCatalogProductGroupNameNil

`func (o *ProductGroupPromotionCreateRequestElement) SetCatalogProductGroupNameNil(b bool)`

 SetCatalogProductGroupNameNil sets the value for CatalogProductGroupName to be an explicit nil

### UnsetCatalogProductGroupName
`func (o *ProductGroupPromotionCreateRequestElement) UnsetCatalogProductGroupName()`

UnsetCatalogProductGroupName ensures that no value is present for CatalogProductGroupName, not even an explicit nil
### GetCollectionsHeroPinId

`func (o *ProductGroupPromotionCreateRequestElement) GetCollectionsHeroPinId() string`

GetCollectionsHeroPinId returns the CollectionsHeroPinId field if non-nil, zero value otherwise.

### GetCollectionsHeroPinIdOk

`func (o *ProductGroupPromotionCreateRequestElement) GetCollectionsHeroPinIdOk() (*string, bool)`

GetCollectionsHeroPinIdOk returns a tuple with the CollectionsHeroPinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCollectionsHeroPinId

`func (o *ProductGroupPromotionCreateRequestElement) SetCollectionsHeroPinId(v string)`

SetCollectionsHeroPinId sets CollectionsHeroPinId field to given value.

### HasCollectionsHeroPinId

`func (o *ProductGroupPromotionCreateRequestElement) HasCollectionsHeroPinId() bool`

HasCollectionsHeroPinId returns a boolean if a field has been set.

### SetCollectionsHeroPinIdNil

`func (o *ProductGroupPromotionCreateRequestElement) SetCollectionsHeroPinIdNil(b bool)`

 SetCollectionsHeroPinIdNil sets the value for CollectionsHeroPinId to be an explicit nil

### UnsetCollectionsHeroPinId
`func (o *ProductGroupPromotionCreateRequestElement) UnsetCollectionsHeroPinId()`

UnsetCollectionsHeroPinId ensures that no value is present for CollectionsHeroPinId, not even an explicit nil
### GetCollectionsHeroDestinationUrl

`func (o *ProductGroupPromotionCreateRequestElement) GetCollectionsHeroDestinationUrl() string`

GetCollectionsHeroDestinationUrl returns the CollectionsHeroDestinationUrl field if non-nil, zero value otherwise.

### GetCollectionsHeroDestinationUrlOk

`func (o *ProductGroupPromotionCreateRequestElement) GetCollectionsHeroDestinationUrlOk() (*string, bool)`

GetCollectionsHeroDestinationUrlOk returns a tuple with the CollectionsHeroDestinationUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCollectionsHeroDestinationUrl

`func (o *ProductGroupPromotionCreateRequestElement) SetCollectionsHeroDestinationUrl(v string)`

SetCollectionsHeroDestinationUrl sets CollectionsHeroDestinationUrl field to given value.

### HasCollectionsHeroDestinationUrl

`func (o *ProductGroupPromotionCreateRequestElement) HasCollectionsHeroDestinationUrl() bool`

HasCollectionsHeroDestinationUrl returns a boolean if a field has been set.

### SetCollectionsHeroDestinationUrlNil

`func (o *ProductGroupPromotionCreateRequestElement) SetCollectionsHeroDestinationUrlNil(b bool)`

 SetCollectionsHeroDestinationUrlNil sets the value for CollectionsHeroDestinationUrl to be an explicit nil

### UnsetCollectionsHeroDestinationUrl
`func (o *ProductGroupPromotionCreateRequestElement) UnsetCollectionsHeroDestinationUrl()`

UnsetCollectionsHeroDestinationUrl ensures that no value is present for CollectionsHeroDestinationUrl, not even an explicit nil
### GetGridClickType

`func (o *ProductGroupPromotionCreateRequestElement) GetGridClickType() GridClickType`

GetGridClickType returns the GridClickType field if non-nil, zero value otherwise.

### GetGridClickTypeOk

`func (o *ProductGroupPromotionCreateRequestElement) GetGridClickTypeOk() (*GridClickType, bool)`

GetGridClickTypeOk returns a tuple with the GridClickType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGridClickType

`func (o *ProductGroupPromotionCreateRequestElement) SetGridClickType(v GridClickType)`

SetGridClickType sets GridClickType field to given value.

### HasGridClickType

`func (o *ProductGroupPromotionCreateRequestElement) HasGridClickType() bool`

HasGridClickType returns a boolean if a field has been set.

### SetGridClickTypeNil

`func (o *ProductGroupPromotionCreateRequestElement) SetGridClickTypeNil(b bool)`

 SetGridClickTypeNil sets the value for GridClickType to be an explicit nil

### UnsetGridClickType
`func (o *ProductGroupPromotionCreateRequestElement) UnsetGridClickType()`

UnsetGridClickType ensures that no value is present for GridClickType, not even an explicit nil
### GetCreativeType

`func (o *ProductGroupPromotionCreateRequestElement) GetCreativeType() CreativeType`

GetCreativeType returns the CreativeType field if non-nil, zero value otherwise.

### GetCreativeTypeOk

`func (o *ProductGroupPromotionCreateRequestElement) GetCreativeTypeOk() (*CreativeType, bool)`

GetCreativeTypeOk returns a tuple with the CreativeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeType

`func (o *ProductGroupPromotionCreateRequestElement) SetCreativeType(v CreativeType)`

SetCreativeType sets CreativeType field to given value.

### HasCreativeType

`func (o *ProductGroupPromotionCreateRequestElement) HasCreativeType() bool`

HasCreativeType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


