namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.QuizPinQuestion
open OpenAPI.Model.QuizPinResult

module QuizPinData =

  //#region QuizPinData

  //#region enums
  type TieBreakerTypeEnum = RANDOMEnum of string  |  CUSTOMEnum of string  
  //#endregion

  type QuizPinData = {
    Questions : QuizPinQuestion[];
    Results : QuizPinResult[];
    TieBreakerType : TieBreakerTypeEnum;
    TieBreakerCustomResult : QuizPinResult;
  }
  //#endregion
