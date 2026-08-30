namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MatchType
open OpenAPI.Model.int option

module KeywordCreateItem =

  //#region KeywordCreateItem


  type KeywordCreateItem = {
    Bid : int option;
    MatchType : MatchType;
    Value : string;
  }
  //#endregion
