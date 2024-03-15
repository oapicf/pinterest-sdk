namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Keyword

module KeywordError =

  //#region KeywordError

  [<CLIMutable>]
  type KeywordError = {
    [<JsonProperty(PropertyName = "data")>]
    Data : Keyword;
    [<JsonProperty(PropertyName = "error_messages")>]
    ErrorMessages : string[];
  }

  //#endregion
