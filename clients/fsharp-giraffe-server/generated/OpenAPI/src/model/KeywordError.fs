namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Keyword

module KeywordError =

  //#region KeywordError


  type KeywordError = {
    Data : Keyword;
    ErrorMessages : string[];
  }
  //#endregion
