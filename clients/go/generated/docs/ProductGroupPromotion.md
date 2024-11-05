# ProductGroupPromotion

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

## Methods

### NewProductGroupPromotion

`func NewProductGroupPromotion() *ProductGroupPromotion`

NewProductGroupPromotion instantiates a new ProductGroupPromotion object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProductGroupPromotionWithDefaults

`func NewProductGroupPromotionWithDefaults() *ProductGroupPromotion`

NewProductGroupPromotionWithDefaults instantiates a new ProductGroupPromotion object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ProductGroupPromotion) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ProductGroupPromotion) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ProductGroupPromotion) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *ProductGroupPromotion) HasId() bool`

HasId returns a boolean if a field has been set.

### GetAdGroupId

`func (o *ProductGroupPromotion) GetAdGroupId() string`

GetAdGroupId returns the AdGroupId field if non-nil, zero value otherwise.

### GetAdGroupIdOk

`func (o *ProductGroupPromotion) GetAdGroupIdOk() (*string, bool)`

GetAdGroupIdOk returns a tuple with the AdGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdGroupId

`func (o *ProductGroupPromotion) SetAdGroupId(v string)`

SetAdGroupId sets AdGroupId field to given value.

### HasAdGroupId

`func (o *ProductGroupPromotion) HasAdGroupId() bool`

HasAdGroupId returns a boolean if a field has been set.

### GetBidInMicroCurrency

`func (o *ProductGroupPromotion) GetBidInMicroCurrency() int32`

GetBidInMicroCurrency returns the BidInMicroCurrency field if non-nil, zero value otherwise.

### GetBidInMicroCurrencyOk

`func (o *ProductGroupPromotion) GetBidInMicroCurrencyOk() (*int32, bool)`

GetBidInMicroCurrencyOk returns a tuple with the BidInMicroCurrency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBidInMicroCurrency

`func (o *ProductGroupPromotion) SetBidInMicroCurrency(v int32)`

SetBidInMicroCurrency sets BidInMicroCurrency field to given value.

### HasBidInMicroCurrency

`func (o *ProductGroupPromotion) HasBidInMicroCurrency() bool`

HasBidInMicroCurrency returns a boolean if a field has been set.

### SetBidInMicroCurrencyNil

`func (o *ProductGroupPromotion) SetBidInMicroCurrencyNil(b bool)`

 SetBidInMicroCurrencyNil sets the value for BidInMicroCurrency to be an explicit nil

### UnsetBidInMicroCurrency
`func (o *ProductGroupPromotion) UnsetBidInMicroCurrency()`

UnsetBidInMicroCurrency ensures that no value is present for BidInMicroCurrency, not even an explicit nil
### GetIncluded

`func (o *ProductGroupPromotion) GetIncluded() bool`

GetIncluded returns the Included field if non-nil, zero value otherwise.

### GetIncludedOk

`func (o *ProductGroupPromotion) GetIncludedOk() (*bool, bool)`

GetIncludedOk returns a tuple with the Included field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncluded

`func (o *ProductGroupPromotion) SetIncluded(v bool)`

SetIncluded sets Included field to given value.

### HasIncluded

`func (o *ProductGroupPromotion) HasIncluded() bool`

HasIncluded returns a boolean if a field has been set.

### SetIncludedNil

`func (o *ProductGroupPromotion) SetIncludedNil(b bool)`

 SetIncludedNil sets the value for Included to be an explicit nil

### UnsetIncluded
`func (o *ProductGroupPromotion) UnsetIncluded()`

UnsetIncluded ensures that no value is present for Included, not even an explicit nil
### GetDefinition

`func (o *ProductGroupPromotion) GetDefinition() string`

GetDefinition returns the Definition field if non-nil, zero value otherwise.

### GetDefinitionOk

`func (o *ProductGroupPromotion) GetDefinitionOk() (*string, bool)`

GetDefinitionOk returns a tuple with the Definition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefinition

`func (o *ProductGroupPromotion) SetDefinition(v string)`

SetDefinition sets Definition field to given value.

### HasDefinition

`func (o *ProductGroupPromotion) HasDefinition() bool`

HasDefinition returns a boolean if a field has been set.

### SetDefinitionNil

`func (o *ProductGroupPromotion) SetDefinitionNil(b bool)`

 SetDefinitionNil sets the value for Definition to be an explicit nil

### UnsetDefinition
`func (o *ProductGroupPromotion) UnsetDefinition()`

UnsetDefinition ensures that no value is present for Definition, not even an explicit nil
### GetRelativeDefinition

`func (o *ProductGroupPromotion) GetRelativeDefinition() string`

GetRelativeDefinition returns the RelativeDefinition field if non-nil, zero value otherwise.

### GetRelativeDefinitionOk

`func (o *ProductGroupPromotion) GetRelativeDefinitionOk() (*string, bool)`

GetRelativeDefinitionOk returns a tuple with the RelativeDefinition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRelativeDefinition

`func (o *ProductGroupPromotion) SetRelativeDefinition(v string)`

SetRelativeDefinition sets RelativeDefinition field to given value.

### HasRelativeDefinition

`func (o *ProductGroupPromotion) HasRelativeDefinition() bool`

HasRelativeDefinition returns a boolean if a field has been set.

### SetRelativeDefinitionNil

`func (o *ProductGroupPromotion) SetRelativeDefinitionNil(b bool)`

 SetRelativeDefinitionNil sets the value for RelativeDefinition to be an explicit nil

### UnsetRelativeDefinition
`func (o *ProductGroupPromotion) UnsetRelativeDefinition()`

UnsetRelativeDefinition ensures that no value is present for RelativeDefinition, not even an explicit nil
### GetParentId

`func (o *ProductGroupPromotion) GetParentId() string`

GetParentId returns the ParentId field if non-nil, zero value otherwise.

### GetParentIdOk

`func (o *ProductGroupPromotion) GetParentIdOk() (*string, bool)`

GetParentIdOk returns a tuple with the ParentId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentId

`func (o *ProductGroupPromotion) SetParentId(v string)`

SetParentId sets ParentId field to given value.

### HasParentId

`func (o *ProductGroupPromotion) HasParentId() bool`

HasParentId returns a boolean if a field has been set.

### SetParentIdNil

`func (o *ProductGroupPromotion) SetParentIdNil(b bool)`

 SetParentIdNil sets the value for ParentId to be an explicit nil

### UnsetParentId
`func (o *ProductGroupPromotion) UnsetParentId()`

UnsetParentId ensures that no value is present for ParentId, not even an explicit nil
### GetSlideshowCollectionsTitle

`func (o *ProductGroupPromotion) GetSlideshowCollectionsTitle() string`

GetSlideshowCollectionsTitle returns the SlideshowCollectionsTitle field if non-nil, zero value otherwise.

### GetSlideshowCollectionsTitleOk

`func (o *ProductGroupPromotion) GetSlideshowCollectionsTitleOk() (*string, bool)`

GetSlideshowCollectionsTitleOk returns a tuple with the SlideshowCollectionsTitle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSlideshowCollectionsTitle

`func (o *ProductGroupPromotion) SetSlideshowCollectionsTitle(v string)`

SetSlideshowCollectionsTitle sets SlideshowCollectionsTitle field to given value.

### HasSlideshowCollectionsTitle

`func (o *ProductGroupPromotion) HasSlideshowCollectionsTitle() bool`

HasSlideshowCollectionsTitle returns a boolean if a field has been set.

### SetSlideshowCollectionsTitleNil

`func (o *ProductGroupPromotion) SetSlideshowCollectionsTitleNil(b bool)`

 SetSlideshowCollectionsTitleNil sets the value for SlideshowCollectionsTitle to be an explicit nil

### UnsetSlideshowCollectionsTitle
`func (o *ProductGroupPromotion) UnsetSlideshowCollectionsTitle()`

UnsetSlideshowCollectionsTitle ensures that no value is present for SlideshowCollectionsTitle, not even an explicit nil
### GetSlideshowCollectionsDescription

`func (o *ProductGroupPromotion) GetSlideshowCollectionsDescription() string`

GetSlideshowCollectionsDescription returns the SlideshowCollectionsDescription field if non-nil, zero value otherwise.

### GetSlideshowCollectionsDescriptionOk

`func (o *ProductGroupPromotion) GetSlideshowCollectionsDescriptionOk() (*string, bool)`

GetSlideshowCollectionsDescriptionOk returns a tuple with the SlideshowCollectionsDescription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSlideshowCollectionsDescription

`func (o *ProductGroupPromotion) SetSlideshowCollectionsDescription(v string)`

SetSlideshowCollectionsDescription sets SlideshowCollectionsDescription field to given value.

### HasSlideshowCollectionsDescription

`func (o *ProductGroupPromotion) HasSlideshowCollectionsDescription() bool`

HasSlideshowCollectionsDescription returns a boolean if a field has been set.

### SetSlideshowCollectionsDescriptionNil

`func (o *ProductGroupPromotion) SetSlideshowCollectionsDescriptionNil(b bool)`

 SetSlideshowCollectionsDescriptionNil sets the value for SlideshowCollectionsDescription to be an explicit nil

### UnsetSlideshowCollectionsDescription
`func (o *ProductGroupPromotion) UnsetSlideshowCollectionsDescription()`

UnsetSlideshowCollectionsDescription ensures that no value is present for SlideshowCollectionsDescription, not even an explicit nil
### GetIsMdl

`func (o *ProductGroupPromotion) GetIsMdl() bool`

GetIsMdl returns the IsMdl field if non-nil, zero value otherwise.

### GetIsMdlOk

`func (o *ProductGroupPromotion) GetIsMdlOk() (*bool, bool)`

GetIsMdlOk returns a tuple with the IsMdl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMdl

`func (o *ProductGroupPromotion) SetIsMdl(v bool)`

SetIsMdl sets IsMdl field to given value.

### HasIsMdl

`func (o *ProductGroupPromotion) HasIsMdl() bool`

HasIsMdl returns a boolean if a field has been set.

### SetIsMdlNil

`func (o *ProductGroupPromotion) SetIsMdlNil(b bool)`

 SetIsMdlNil sets the value for IsMdl to be an explicit nil

### UnsetIsMdl
`func (o *ProductGroupPromotion) UnsetIsMdl()`

UnsetIsMdl ensures that no value is present for IsMdl, not even an explicit nil
### GetStatus

`func (o *ProductGroupPromotion) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ProductGroupPromotion) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ProductGroupPromotion) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *ProductGroupPromotion) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTrackingUrl

`func (o *ProductGroupPromotion) GetTrackingUrl() string`

GetTrackingUrl returns the TrackingUrl field if non-nil, zero value otherwise.

### GetTrackingUrlOk

`func (o *ProductGroupPromotion) GetTrackingUrlOk() (*string, bool)`

GetTrackingUrlOk returns a tuple with the TrackingUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrl

`func (o *ProductGroupPromotion) SetTrackingUrl(v string)`

SetTrackingUrl sets TrackingUrl field to given value.

### HasTrackingUrl

`func (o *ProductGroupPromotion) HasTrackingUrl() bool`

HasTrackingUrl returns a boolean if a field has been set.

### SetTrackingUrlNil

`func (o *ProductGroupPromotion) SetTrackingUrlNil(b bool)`

 SetTrackingUrlNil sets the value for TrackingUrl to be an explicit nil

### UnsetTrackingUrl
`func (o *ProductGroupPromotion) UnsetTrackingUrl()`

UnsetTrackingUrl ensures that no value is present for TrackingUrl, not even an explicit nil
### GetCatalogProductGroupId

`func (o *ProductGroupPromotion) GetCatalogProductGroupId() string`

GetCatalogProductGroupId returns the CatalogProductGroupId field if non-nil, zero value otherwise.

### GetCatalogProductGroupIdOk

`func (o *ProductGroupPromotion) GetCatalogProductGroupIdOk() (*string, bool)`

GetCatalogProductGroupIdOk returns a tuple with the CatalogProductGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogProductGroupId

`func (o *ProductGroupPromotion) SetCatalogProductGroupId(v string)`

SetCatalogProductGroupId sets CatalogProductGroupId field to given value.

### HasCatalogProductGroupId

`func (o *ProductGroupPromotion) HasCatalogProductGroupId() bool`

HasCatalogProductGroupId returns a boolean if a field has been set.

### SetCatalogProductGroupIdNil

`func (o *ProductGroupPromotion) SetCatalogProductGroupIdNil(b bool)`

 SetCatalogProductGroupIdNil sets the value for CatalogProductGroupId to be an explicit nil

### UnsetCatalogProductGroupId
`func (o *ProductGroupPromotion) UnsetCatalogProductGroupId()`

UnsetCatalogProductGroupId ensures that no value is present for CatalogProductGroupId, not even an explicit nil
### GetCatalogProductGroupName

`func (o *ProductGroupPromotion) GetCatalogProductGroupName() string`

GetCatalogProductGroupName returns the CatalogProductGroupName field if non-nil, zero value otherwise.

### GetCatalogProductGroupNameOk

`func (o *ProductGroupPromotion) GetCatalogProductGroupNameOk() (*string, bool)`

GetCatalogProductGroupNameOk returns a tuple with the CatalogProductGroupName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogProductGroupName

`func (o *ProductGroupPromotion) SetCatalogProductGroupName(v string)`

SetCatalogProductGroupName sets CatalogProductGroupName field to given value.

### HasCatalogProductGroupName

`func (o *ProductGroupPromotion) HasCatalogProductGroupName() bool`

HasCatalogProductGroupName returns a boolean if a field has been set.

### SetCatalogProductGroupNameNil

`func (o *ProductGroupPromotion) SetCatalogProductGroupNameNil(b bool)`

 SetCatalogProductGroupNameNil sets the value for CatalogProductGroupName to be an explicit nil

### UnsetCatalogProductGroupName
`func (o *ProductGroupPromotion) UnsetCatalogProductGroupName()`

UnsetCatalogProductGroupName ensures that no value is present for CatalogProductGroupName, not even an explicit nil
### GetCollectionsHeroPinId

`func (o *ProductGroupPromotion) GetCollectionsHeroPinId() string`

GetCollectionsHeroPinId returns the CollectionsHeroPinId field if non-nil, zero value otherwise.

### GetCollectionsHeroPinIdOk

`func (o *ProductGroupPromotion) GetCollectionsHeroPinIdOk() (*string, bool)`

GetCollectionsHeroPinIdOk returns a tuple with the CollectionsHeroPinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCollectionsHeroPinId

`func (o *ProductGroupPromotion) SetCollectionsHeroPinId(v string)`

SetCollectionsHeroPinId sets CollectionsHeroPinId field to given value.

### HasCollectionsHeroPinId

`func (o *ProductGroupPromotion) HasCollectionsHeroPinId() bool`

HasCollectionsHeroPinId returns a boolean if a field has been set.

### SetCollectionsHeroPinIdNil

`func (o *ProductGroupPromotion) SetCollectionsHeroPinIdNil(b bool)`

 SetCollectionsHeroPinIdNil sets the value for CollectionsHeroPinId to be an explicit nil

### UnsetCollectionsHeroPinId
`func (o *ProductGroupPromotion) UnsetCollectionsHeroPinId()`

UnsetCollectionsHeroPinId ensures that no value is present for CollectionsHeroPinId, not even an explicit nil
### GetCollectionsHeroDestinationUrl

`func (o *ProductGroupPromotion) GetCollectionsHeroDestinationUrl() string`

GetCollectionsHeroDestinationUrl returns the CollectionsHeroDestinationUrl field if non-nil, zero value otherwise.

### GetCollectionsHeroDestinationUrlOk

`func (o *ProductGroupPromotion) GetCollectionsHeroDestinationUrlOk() (*string, bool)`

GetCollectionsHeroDestinationUrlOk returns a tuple with the CollectionsHeroDestinationUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCollectionsHeroDestinationUrl

`func (o *ProductGroupPromotion) SetCollectionsHeroDestinationUrl(v string)`

SetCollectionsHeroDestinationUrl sets CollectionsHeroDestinationUrl field to given value.

### HasCollectionsHeroDestinationUrl

`func (o *ProductGroupPromotion) HasCollectionsHeroDestinationUrl() bool`

HasCollectionsHeroDestinationUrl returns a boolean if a field has been set.

### SetCollectionsHeroDestinationUrlNil

`func (o *ProductGroupPromotion) SetCollectionsHeroDestinationUrlNil(b bool)`

 SetCollectionsHeroDestinationUrlNil sets the value for CollectionsHeroDestinationUrl to be an explicit nil

### UnsetCollectionsHeroDestinationUrl
`func (o *ProductGroupPromotion) UnsetCollectionsHeroDestinationUrl()`

UnsetCollectionsHeroDestinationUrl ensures that no value is present for CollectionsHeroDestinationUrl, not even an explicit nil
### GetGridClickType

`func (o *ProductGroupPromotion) GetGridClickType() GridClickType`

GetGridClickType returns the GridClickType field if non-nil, zero value otherwise.

### GetGridClickTypeOk

`func (o *ProductGroupPromotion) GetGridClickTypeOk() (*GridClickType, bool)`

GetGridClickTypeOk returns a tuple with the GridClickType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGridClickType

`func (o *ProductGroupPromotion) SetGridClickType(v GridClickType)`

SetGridClickType sets GridClickType field to given value.

### HasGridClickType

`func (o *ProductGroupPromotion) HasGridClickType() bool`

HasGridClickType returns a boolean if a field has been set.

### SetGridClickTypeNil

`func (o *ProductGroupPromotion) SetGridClickTypeNil(b bool)`

 SetGridClickTypeNil sets the value for GridClickType to be an explicit nil

### UnsetGridClickType
`func (o *ProductGroupPromotion) UnsetGridClickType()`

UnsetGridClickType ensures that no value is present for GridClickType, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


