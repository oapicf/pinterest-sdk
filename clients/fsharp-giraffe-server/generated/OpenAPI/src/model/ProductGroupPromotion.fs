namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CollectionsHeaderType
open OpenAPI.Model.CreativeType
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.GridClickType
open OpenAPI.Model.PreferredMediaType
open OpenAPI.Model.ProductGroupPromotionCustomizableCTAType
open OpenAPI.Model.bool option
open OpenAPI.Model.string option

module ProductGroupPromotion =

  //#region ProductGroupPromotion


  type ProductGroupPromotion = {
    AdGroupId : string;
    BidInMicroCurrency : int;
    CatalogProductGroupId : string;
    CatalogProductGroupName : string;
    CollectionsHeaderType : CollectionsHeaderType;
    CollectionsHeroDestinationUrl : string option;
    CollectionsHeroPinId : string option;
    CreativeType : CreativeType;
    CustomizableCtaType : ProductGroupPromotionCustomizableCTAType;
    Definition : string;
    GridClickType : GridClickType;
    Id : string;
    Included : bool;
    IsGenerateBackground : bool option;
    IsImageAutoResizing : bool option;
    IsMdl : bool;
    ParentId : string;
    PreferredMediaType : PreferredMediaType;
    RelativeDefinition : string;
    SelectedImageTag : string option;
    SelectedVideoTag : string option;
    SlideshowCollectionsDescription : string option;
    SlideshowCollectionsTitle : string option;
    Status : EntityStatus;
    TrackingUrl : string;
  }
  //#endregion
