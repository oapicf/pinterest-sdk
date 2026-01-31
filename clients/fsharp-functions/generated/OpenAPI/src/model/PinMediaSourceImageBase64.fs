namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ContentType

module PinMediaSourceImageBase64 =

  //#region PinMediaSourceImageBase64

  [<CLIMutable>]
  type PinMediaSourceImageBase64 = {
    [<JsonProperty(PropertyName = "content_type")>]
    ContentType : ContentType;
    [<JsonProperty(PropertyName = "data")>]
    Data : string;
    [<JsonProperty(PropertyName = "is_standard")>]
    IsStandard : bool;
    [<JsonProperty(PropertyName = "source_type")>]
    SourceType : string;
  }

  //#endregion
