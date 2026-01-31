namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ContentType

module PinMediaSourceVideoID =

  //#region PinMediaSourceVideoID

  [<CLIMutable>]
  type PinMediaSourceVideoID = {
    [<JsonProperty(PropertyName = "cover_image_content_type")>]
    CoverImageContentType : ContentType;
    [<JsonProperty(PropertyName = "cover_image_data")>]
    CoverImageData : string;
    [<JsonProperty(PropertyName = "cover_image_key_frame_time")>]
    CoverImageKeyFrameTime : int;
    [<JsonProperty(PropertyName = "cover_image_url")>]
    CoverImageUrl : string;
    [<JsonProperty(PropertyName = "is_standard")>]
    IsStandard : bool;
    [<JsonProperty(PropertyName = "media_id")>]
    MediaId : string;
    [<JsonProperty(PropertyName = "source_type")>]
    SourceType : string;
  }

  //#endregion
