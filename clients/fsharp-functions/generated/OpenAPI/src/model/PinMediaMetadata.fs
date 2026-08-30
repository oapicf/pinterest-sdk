namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ImageMetadata
open OpenAPI.Model.ImageSize
open OpenAPI.Model.VideoMetadataWithItemType
open OpenAPI.Model.decimal option
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module PinMediaMetadata =

  //#region PinMediaMetadata

  [<CLIMutable>]
  type PinMediaMetadata = {
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "images")>]
    Images : ImageSize;
    [<JsonProperty(PropertyName = "item_type")>]
    ItemType : string;
    [<JsonProperty(PropertyName = "link")>]
    Link : string option;
    [<JsonProperty(PropertyName = "title")>]
    Title : string option;
    [<JsonProperty(PropertyName = "cover_image_url")>]
    CoverImageUrl : string;
    [<JsonProperty(PropertyName = "duration")>]
    Duration : decimal option;
    [<JsonProperty(PropertyName = "height")>]
    Height : int option;
    [<JsonProperty(PropertyName = "video_url")>]
    VideoUrl : string option;
    [<JsonProperty(PropertyName = "video_url_hls")>]
    VideoUrlHls : string option;
    [<JsonProperty(PropertyName = "width")>]
    Width : int option;
  }

  //#endregion
