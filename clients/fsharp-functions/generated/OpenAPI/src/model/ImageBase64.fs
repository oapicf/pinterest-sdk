namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ImageBase64 =

  //#region ImageBase64

  [<CLIMutable>]
  type ImageBase64 = {
    [<JsonProperty(PropertyName = "content_type")>]
    ContentType : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : string;
  }

  //#endregion
