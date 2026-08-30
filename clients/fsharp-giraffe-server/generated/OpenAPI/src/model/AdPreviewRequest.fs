namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdPreviewShopping
open OpenAPI.Model.AdPreviewSourceImage
open OpenAPI.Model.AdPreviewSourcePinId
open OpenAPI.Model.AdShoppingPreviewCreativeType
open OpenAPI.Model.BasePreferredMediaType
open OpenAPI.Model.CustomizableCTAType

module AdPreviewRequest =

  //#region AdPreviewRequest


  type AdPreviewRequest = {
    ImageUrl : string;
    PromotionId : string;
    Title : string;
    CreativeType : AdShoppingPreviewCreativeType;
    PinId : string;
    CatalogProductGroupId : string;
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
