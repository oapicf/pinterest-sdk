namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.KeywordCreateItem

module KeywordsCreate =

  //#region KeywordsCreate


  type KeywordsCreate = {
    Keywords : KeywordCreateItem[];
    ParentId : string;
  }
  //#endregion
