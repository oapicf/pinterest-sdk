namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.QuizPinOption

module QuizPinQuestion =

  //#region QuizPinQuestion


  type QuizPinQuestion = {
    Options : QuizPinOption[];
    QuestionId : decimal;
    QuestionText : string;
  }
  //#endregion
