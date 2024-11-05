namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreativeType
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.GridClickType
open OpenAPI.Model.bool option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module ProductGroupPromotionResponseElement =

  //#region ProductGroupPromotionResponseElement

  [<CLIMutable>]
  type ProductGroupPromotionResponseElement = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "ad_group_id")>]
    AdGroupId : string;
    [<JsonProperty(PropertyName = "bid_in_micro_currency")>]
    BidInMicroCurrency : int option;
    [<JsonProperty(PropertyName = "included")>]
    Included : bool option;
    [<JsonProperty(PropertyName = "definition")>]
    Definition : string option;
    [<JsonProperty(PropertyName = "relative_definition")>]
    RelativeDefinition : string option;
    [<JsonProperty(PropertyName = "parent_id")>]
    ParentId : string option;
    [<JsonProperty(PropertyName = "slideshow_collections_title")>]
    SlideshowCollectionsTitle : string option;
    [<JsonProperty(PropertyName = "slideshow_collections_description")>]
    SlideshowCollectionsDescription : string option;
    [<JsonProperty(PropertyName = "is_mdl")>]
    IsMdl : bool option;
    [<JsonProperty(PropertyName = "status")>]
    Status : EntityStatus;
    [<JsonProperty(PropertyName = "tracking_url")>]
    TrackingUrl : string option;
    [<JsonProperty(PropertyName = "catalog_product_group_id")>]
    CatalogProductGroupId : string option;
    [<JsonProperty(PropertyName = "catalog_product_group_name")>]
    CatalogProductGroupName : string option;
    [<JsonProperty(PropertyName = "collections_hero_pin_id")>]
    CollectionsHeroPinId : string option;
    [<JsonProperty(PropertyName = "collections_hero_destination_url")>]
    CollectionsHeroDestinationUrl : string option;
    [<JsonProperty(PropertyName = "grid_click_type")>]
    GridClickType : GridClickType;
    [<JsonProperty(PropertyName = "creative_type")>]
    CreativeType : CreativeType;
  }

  //#endregion
