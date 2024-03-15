namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdPreviewURLResponse =

  //#region AdPreviewURLResponse

  [<CLIMutable>]
  type AdPreviewURLResponse = {
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
