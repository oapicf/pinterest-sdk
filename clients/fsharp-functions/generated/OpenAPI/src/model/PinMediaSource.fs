namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PinMediaSourceImageBase64
open OpenAPI.Model.PinMediaSourceImageURL
open OpenAPI.Model.PinMediaSourceVideoID

module PinMediaSource =

  //#region PinMediaSource

  [<CLIMutable>]
  type PinMediaSource = {
    [<JsonProperty(PropertyName = "source_type")>]
    SourceType : string;
    [<JsonProperty(PropertyName = "content_type")>]
    ContentType : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
    [<JsonProperty(PropertyName = "cover_image_url")>]
    CoverImageUrl : string;
    [<JsonProperty(PropertyName = "media_id")>]
    MediaId : string;
  }

  //#endregion
