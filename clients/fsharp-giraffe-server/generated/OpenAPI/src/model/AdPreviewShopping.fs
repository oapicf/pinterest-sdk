namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CustomizableCTAType

module AdPreviewShopping =

  //#region AdPreviewShopping

  //#region enums
  type CreativeTypeEnum = SHOPPINGEnum of string  |  CAROUSELEnum of string  |  COLLECTIONEnum of string  |  REGULAREnum of string  
  //#endregion
  //#region enums
  type PreferredMediaTypeEnum = VIDEOEnum of string  |  IMAGEEnum of string  
  //#endregion

  type AdPreviewShopping = {
    CatalogProductGroupId : string;
    CreativeType : CreativeTypeEnum;
    CustomizableCtaType : CustomizableCTAType;
    HeroImageTitle : string;
    HeroImageUrl : string;
    HeroPinId : string;
    ImageTag : string;
    ItemId : string;
    PreferredMediaType : PreferredMediaTypeEnum;
    VideoTag : string;
  }
  //#endregion
