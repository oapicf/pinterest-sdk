namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.KeywordUpdateItem

module KeywordsUpdate =

  //#region KeywordsUpdate

  [<CLIMutable>]
  type KeywordsUpdate = {
    [<JsonProperty(PropertyName = "keywords")>]
    Keywords : KeywordUpdateItem[];
  }

  //#endregion
