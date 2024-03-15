namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PinMediaSourceVideoID =

  //#region PinMediaSourceVideoID

  [<CLIMutable>]
  type PinMediaSourceVideoID = {
    [<JsonProperty(PropertyName = "source_type")>]
    SourceType : string;
    [<JsonProperty(PropertyName = "cover_image_url")>]
    CoverImageUrl : string;
    [<JsonProperty(PropertyName = "cover_image_content_type")>]
    CoverImageContentType : string;
    [<JsonProperty(PropertyName = "cover_image_data")>]
    CoverImageData : string;
    [<JsonProperty(PropertyName = "media_id")>]
    MediaId : string;
    [<JsonProperty(PropertyName = "is_standard")>]
    IsStandard : bool;
  }

  //#endregion
