namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsFeedVideoCounts =

  //#region CatalogsFeedVideoCounts

  [<CLIMutable>]
  type CatalogsFeedVideoCounts = {
    [<JsonProperty(PropertyName = "ingested_videos")>]
    IngestedVideos : int;
    [<JsonProperty(PropertyName = "not_ingested_videos")>]
    NotIngestedVideos : int;
    [<JsonProperty(PropertyName = "total_videos")>]
    TotalVideos : int;
  }

  //#endregion
