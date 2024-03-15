namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Keyword
open OpenAPI.Model.KeywordError

module KeywordsResponse =

  //#region KeywordsResponse


  type KeywordsResponse = {
    Errors : KeywordError[];
    Keywords : Keyword[];
  }
  //#endregion
