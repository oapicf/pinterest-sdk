namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module VideoMetadataWithItemType =

  //#region VideoMetadataWithItemType

  [<CLIMutable>]
  type VideoMetadataWithItemType = {
    [<JsonProperty(PropertyName = "cover_image_url")>]
    CoverImageUrl : string;
    [<JsonProperty(PropertyName = "duration")>]
    Duration : decimal option;
    [<JsonProperty(PropertyName = "height")>]
    Height : int option;
    [<JsonProperty(PropertyName = "item_type")>]
    ItemType : string;
    [<JsonProperty(PropertyName = "video_url")>]
    VideoUrl : string option;
    [<JsonProperty(PropertyName = "video_url_hls")>]
    VideoUrlHls : string option;
    [<JsonProperty(PropertyName = "width")>]
    Width : int option;
  }

  //#endregion
