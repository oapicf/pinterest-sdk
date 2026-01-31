namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PinterestLibStatus204 =

  //#region PinterestLibStatus204

  [<CLIMutable>]
  type PinterestLibStatus204 = {
    [<JsonProperty(PropertyName = "statusCode")>]
    StatusCode : decimal;
  }

  //#endregion
