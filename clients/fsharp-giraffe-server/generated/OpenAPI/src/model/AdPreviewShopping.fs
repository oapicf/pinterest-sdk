namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdShoppingPreviewCreativeType
open OpenAPI.Model.BasePreferredMediaType
open OpenAPI.Model.CustomizableCTAType

module AdPreviewShopping =

  //#region AdPreviewShopping


  type AdPreviewShopping = {
    CatalogProductGroupId : string;
    CreativeType : AdShoppingPreviewCreativeType;
    CustomizableCtaType : CustomizableCTAType;
    HeroImageTitle : string;
    HeroImageUrl : string;
    HeroPinId : string;
    ImageTag : string;
    ItemId : string;
    PreferredMediaType : BasePreferredMediaType;
    ShowPromotion : bool;
    VideoTag : string;
  }
  //#endregion
