namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module QuizPinOption =

  //#region QuizPinOption

  [<CLIMutable>]
  type QuizPinOption = {
    [<JsonProperty(PropertyName = "id")>]
    Id : decimal;
    [<JsonProperty(PropertyName = "text")>]
    Text : string;
  }

  //#endregion
