namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MatchTypeResponse
open OpenAPI.Model.int option

module KeywordsCommon =

  //#region KeywordsCommon


  type KeywordsCommon = {
    Bid : int option;
    MatchType : MatchTypeResponse;
    Value : string;
  }
  //#endregion
