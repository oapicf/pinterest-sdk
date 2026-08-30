namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemAvailability
open OpenAPI.Model.StoreMetadata

module LocalInventoryItemResponse =

  //#region LocalInventoryItemResponse

  [<CLIMutable>]
  type LocalInventoryItemResponse = {
    [<JsonProperty(PropertyName = "ad_link")>]
    AdLink : string;
    [<JsonProperty(PropertyName = "availability")>]
    Availability : ItemAvailability;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : int64;
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "last_updated_time")>]
    LastUpdatedTime : int64;
    [<JsonProperty(PropertyName = "price")>]
    Price : string;
    [<JsonProperty(PropertyName = "sale_price")>]
    SalePrice : string;
    [<JsonProperty(PropertyName = "store_metadata")>]
    StoreMetadata : StoreMetadata;
  }

  //#endregion
