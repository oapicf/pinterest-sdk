namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Keyword
open OpenAPI.Model.string option

module KeywordsGet200Response =

  //#region KeywordsGet200Response


  type keywords_get_200_response = {
    Items : Keyword[];
    Bookmark : string option;
  }
  //#endregion
