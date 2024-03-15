namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.QuizPinQuestion
open OpenAPI.Model.QuizPinResult

module AdCommonQuizPinData =

  //#region AdCommonQuizPinData


  type AdCommon_quiz_pin_data = {
    Questions : QuizPinQuestion[];
    Results : QuizPinResult[];
  }
  //#endregion
