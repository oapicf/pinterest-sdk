namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Board
open OpenAPI.Model.EntityStatus

module CatalogProductGroup =

  //#region CatalogProductGroup

  [<CLIMutable>]
  type CatalogProductGroup = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "merchant_id")>]
    MerchantId : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "filters")>]
    Filters : obj;
    [<JsonProperty(PropertyName = "filter_v2")>]
    FilterV2 : obj;
    [<JsonProperty(PropertyName = "type")>]
    Type : Board;
    [<JsonProperty(PropertyName = "status")>]
    Status : EntityStatus;
    [<JsonProperty(PropertyName = "feed_profile_id")>]
    FeedProfileId : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int;
    [<JsonProperty(PropertyName = "last_update")>]
    LastUpdate : int;
    [<JsonProperty(PropertyName = "product_count")>]
    ProductCount : int;
    [<JsonProperty(PropertyName = "featured_position")>]
    FeaturedPosition : int;
  }

  //#endregion
