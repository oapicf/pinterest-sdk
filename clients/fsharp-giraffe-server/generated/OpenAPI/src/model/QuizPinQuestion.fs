namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.QuizPinOption

module QuizPinQuestion =

  //#region QuizPinQuestion


  type QuizPinQuestion = {
    QuestionId : decimal;
    QuestionText : string;
    Options : QuizPinOption[];
  }
  //#endregion
