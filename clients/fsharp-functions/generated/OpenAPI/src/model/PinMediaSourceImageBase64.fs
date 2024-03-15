namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PinMediaSourceImageBase64 =

  //#region PinMediaSourceImageBase64

  [<CLIMutable>]
  type PinMediaSourceImageBase64 = {
    [<JsonProperty(PropertyName = "source_type")>]
    SourceType : string;
    [<JsonProperty(PropertyName = "content_type")>]
    ContentType : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : string;
    [<JsonProperty(PropertyName = "is_standard")>]
    IsStandard : bool;
  }

  //#endregion
