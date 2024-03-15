namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.int option

module KeywordUpdate =

  //#region KeywordUpdate


  type KeywordUpdate = {
    Id : string;
    Archived : bool;
    Bid : int option;
  }
  //#endregion
