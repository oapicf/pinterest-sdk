namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.QuizPinOption

module QuizPinQuestion =

  //#region QuizPinQuestion

  [<CLIMutable>]
  type QuizPinQuestion = {
    [<JsonProperty(PropertyName = "question_id")>]
    QuestionId : decimal;
    [<JsonProperty(PropertyName = "question_text")>]
    QuestionText : string;
    [<JsonProperty(PropertyName = "options")>]
    Options : QuizPinOption[];
  }

  //#endregion
