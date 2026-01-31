namespace OpenAPI.Model

open System
open System.Collections.Generic

module QuizPinResult =

  //#region QuizPinResult


  type QuizPinResult = {
    AndroidDeepLink : string;
    DestinationUrl : string;
    IosDeepLink : string;
    OrganicPinId : string;
    ResultId : decimal;
  }
  //#endregion
