namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.QuizPinQuestion
open OpenAPI.Model.QuizPinResult

module QuizPinData =

  //#region QuizPinData

  [<CLIMutable>]
  type QuizPinData = {
    [<JsonProperty(PropertyName = "questions")>]
    Questions : QuizPinQuestion[];
    [<JsonProperty(PropertyName = "results")>]
    Results : QuizPinResult[];
  }

  //#endregion
