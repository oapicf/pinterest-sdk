namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Keyword
open OpenAPI.Model.KeywordError

module Keywords =

  //#region Keywords


  type Keywords = {
    Errors : KeywordError[];
    _Keywords : Keyword[];
  }
  //#endregion
