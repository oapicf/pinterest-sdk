namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MatchTypeResponse
open OpenAPI.Model.int option

module Keyword =

  //#region Keyword


  type Keyword = {
    Archived : bool;
    Id : string;
    ParentId : string;
    ParentType : string;
    Type : string;
    Bid : int option;
    MatchType : MatchTypeResponse;
    Value : string;
  }
  //#endregion
