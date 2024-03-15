namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ImageMetadataImages
open OpenAPI.Model.PinMedia
open OpenAPI.Model.string option

module PinMediaWithVideo =

  //#region PinMediaWithVideo

  [<CLIMutable>]
  type PinMediaWithVideo = {
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
