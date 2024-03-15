namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.KeywordsCommon

module KeywordsRequest =

  //#region KeywordsRequest

  [<CLIMutable>]
  type KeywordsRequest = {
    [<JsonProperty(PropertyName = "keywords")>]
    Keywords : KeywordsCommon[];
    [<JsonProperty(PropertyName = "parent_id")>]
    ParentId : string;
  }

  //#endregion
