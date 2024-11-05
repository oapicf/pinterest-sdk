namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.MatchTypeResponse
open OpenAPI.Model.int option

module Keyword =

  //#region Keyword


  type Keyword = {
    Bid : int option;
    MatchType : MatchTypeResponse;
    Value : string;
    Archived : bool;
    Id : string;
    ParentId : string;
    ParentType : string;
    Type : string;
  }
  //#endregion
