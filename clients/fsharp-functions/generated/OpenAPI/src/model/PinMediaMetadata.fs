namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ImageMetadata
open OpenAPI.Model.ImageMetadataImages
open OpenAPI.Model.VideoMetadata
open OpenAPI.Model.string option

module PinMediaMetadata =

  //#region PinMediaMetadata

  [<CLIMutable>]
  type PinMediaMetadata = {
    [<JsonProperty(PropertyName = "item_type")>]
    ItemType : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string option;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "link")>]
    Link : string option;
    [<JsonProperty(PropertyName = "images")>]
    Images : ImageMetadataImages;
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
