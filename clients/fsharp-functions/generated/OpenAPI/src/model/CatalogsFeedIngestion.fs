namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsFeedProcessingStatus

module CatalogsFeedIngestion =

  //#region CatalogsFeedIngestion

  [<CLIMutable>]
  type CatalogsFeedIngestion = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "feed_id")>]
    FeedId : string;
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : DateTime;
    [<JsonProperty(PropertyName = "status")>]
    Status : CatalogsFeedProcessingStatus;
  }

  //#endregion
