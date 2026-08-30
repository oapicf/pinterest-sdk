namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.KeywordCreateItem

module KeywordsCreate =

  //#region KeywordsCreate

  [<CLIMutable>]
  type KeywordsCreate = {
    [<JsonProperty(PropertyName = "keywords")>]
    Keywords : KeywordCreateItem[];
    [<JsonProperty(PropertyName = "parent_id")>]
    ParentId : string;
  }

  //#endregion
