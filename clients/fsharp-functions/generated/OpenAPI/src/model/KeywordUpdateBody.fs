namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.KeywordUpdate

module KeywordUpdateBody =

  //#region KeywordUpdateBody

  [<CLIMutable>]
  type KeywordUpdateBody = {
    [<JsonProperty(PropertyName = "keywords")>]
    Keywords : KeywordUpdate[];
  }

  //#endregion
