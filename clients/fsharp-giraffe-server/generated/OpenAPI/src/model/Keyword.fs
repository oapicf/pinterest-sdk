namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MatchType
open OpenAPI.Model.int option

module Keyword =

  //#region Keyword


  type Keyword = {
    Archived : bool;
    Bid : int option;
    Id : string;
    MatchType : MatchType;
    ParentId : string;
    ParentType : string;
    Type : string;
    Value : string;
  }
  //#endregion
