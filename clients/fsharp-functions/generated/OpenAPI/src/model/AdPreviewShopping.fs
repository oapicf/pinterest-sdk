namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CustomizableCTAType

module AdPreviewShopping =

  //#region AdPreviewShopping

  [<CLIMutable>]
  type AdPreviewShopping = {
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
