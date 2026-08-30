namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.QuizPinQuestion
open OpenAPI.Model.QuizPinResult
open OpenAPI.Model.TieBreakerType

module QuizPinData =

  //#region QuizPinData


  type QuizPinData = {
    Questions : QuizPinQuestion[];
    Results : QuizPinResult[];
    TieBreakerCustomResult : QuizPinResult;
    TieBreakerType : TieBreakerType;
  }
  //#endregion
