namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CreativeType
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.GridClickType
open OpenAPI.Model.bool option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module ProductGroupPromotion =

  //#region ProductGroupPromotion

  //#region enums
  type CollectionsHeaderTypeEnum = SHOPTHISCOLLECTIONEnum of string option  |  EXPLORETHISCOLLECTIONEnum of string option  |  NOHEADEREnum of string option  |  ONSALEEnum of string option  |  GETDEALEnum of string option  
  //#endregion
  //#region enums
  type CustomizableCtaTypeEnum = SHOPNOWEnum of string option  |  BOOKNOWEnum of string option  |  ONSALEEnum of string option  |  GETDEALEnum of string option  |  BUYONLINEPICKUPINSTOREEnum of string option  
  //#endregion
  //#region enums
  type PreferredMediaTypeEnum = VIDEOEnum of string option  |  IMAGEEnum of string option  
  //#endregion

  type ProductGroupPromotion = {
    AdGroupId : string;
    BidInMicroCurrency : int option;
    CatalogProductGroupId : string option;
    CatalogProductGroupName : string option;
    CollectionsHeaderType : CollectionsHeaderTypeEnum;
    CollectionsHeroDestinationUrl : string option;
    CollectionsHeroPinId : string option;
    CreativeType : CreativeType;
    CustomizableCtaType : CustomizableCtaTypeEnum;
    Definition : string option;
    GridClickType : GridClickType;
    Id : string;
    Included : bool option;
    IsGenerateBackground : bool option;
    IsMdl : bool option;
    ParentId : string option;
    PreferredMediaType : PreferredMediaTypeEnum;
    RelativeDefinition : string option;
    SelectedImageTag : string option;
    SelectedVideoTag : string option;
    SlideshowCollectionsDescription : string option;
    SlideshowCollectionsTitle : string option;
    Status : EntityStatus;
    TrackingUrl : string option;
  }
  //#endregion
