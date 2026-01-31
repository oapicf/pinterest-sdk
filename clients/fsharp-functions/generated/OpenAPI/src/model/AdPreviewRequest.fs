namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdPreviewCreateFromImage
open OpenAPI.Model.AdPreviewCreateFromPin
open OpenAPI.Model.AdPreviewShopping
open OpenAPI.Model.CustomizableCTAType

module AdPreviewRequest =

  //#region AdPreviewRequest

  [<CLIMutable>]
  type AdPreviewRequest = {
    [<JsonProperty(PropertyName = "image_url")>]
    ImageUrl : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "pin_id")>]
    PinId : string;
    [<JsonProperty(PropertyName = "catalog_product_group_id")>]
    CatalogProductGroupId : string;
    [<JsonProperty(PropertyName = "creative_type")>]
    CreativeType : string;
    [<JsonProperty(PropertyName = "customizable_cta_type")>]
    CustomizableCtaType : CustomizableCTAType;
    [<JsonProperty(PropertyName = "hero_image_title")>]
    HeroImageTitle : string;
    [<JsonProperty(PropertyName = "hero_image_url")>]
    HeroImageUrl : string;
    [<JsonProperty(PropertyName = "hero_pin_id")>]
    HeroPinId : string;
    [<JsonProperty(PropertyName = "image_tag")>]
    ImageTag : string;
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "preferred_media_type")>]
    PreferredMediaType : string;
    [<JsonProperty(PropertyName = "video_tag")>]
    VideoTag : string;
  }

  //#endregion
