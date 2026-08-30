namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.KeywordInfo

module TrendsEditorial =

  //#region TrendsEditorial


  type TrendsEditorial = {
    BoardUrl : string;
    Description : string;
    Interests : string[];
    PinsUrl : string[];
    RelatedKeywords : KeywordInfo[];
    Title : string;
  }
  //#endregion
