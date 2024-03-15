namespace OpenAPI.Model

open System
open System.Collections.Generic

module QuizPinResult =

  //#region QuizPinResult


  type QuizPinResult = {
    OrganicPinId : string;
    AndroidDeepLink : string;
    IosDeepLink : string;
    DestinationUrl : string;
    ResultId : decimal;
  }
  //#endregion
