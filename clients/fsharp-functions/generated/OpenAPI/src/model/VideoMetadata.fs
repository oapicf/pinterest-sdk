namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module VideoMetadata =

  //#region VideoMetadata

  [<CLIMutable>]
  type VideoMetadata = {
    [<JsonProperty(PropertyName = "item_type")>]
    ItemType : string;
    [<JsonProperty(PropertyName = "cover_image_url")>]
    CoverImageUrl : string;
    [<JsonProperty(PropertyName = "video_url")>]
    VideoUrl : string option;
    [<JsonProperty(PropertyName = "duration")>]
    Duration : decimal;
    [<JsonProperty(PropertyName = "height")>]
    Height : int;
    [<JsonProperty(PropertyName = "width")>]
    Width : int;
  }

  //#endregion
