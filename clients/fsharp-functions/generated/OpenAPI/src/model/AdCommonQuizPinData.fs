namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.QuizPinQuestion
open OpenAPI.Model.QuizPinResult

module AdCommonQuizPinData =

  //#region AdCommonQuizPinData

  [<CLIMutable>]
  type AdCommonQuizPinData = {
    [<JsonProperty(PropertyName = "questions")>]
    Questions : QuizPinQuestion[];
    [<JsonProperty(PropertyName = "results")>]
    Results : QuizPinResult[];
  }

  //#endregion
