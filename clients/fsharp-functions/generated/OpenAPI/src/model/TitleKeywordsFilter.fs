namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringCriteria

module TitleKeywordsFilter =

  //#region TitleKeywordsFilter

  [<CLIMutable>]
  type TitleKeywordsFilter = {
    [<JsonProperty(PropertyName = "TITLE_KEYWORDS")>]
    TITLE_KEYWORDS : CatalogsProductGroupMultipleStringCriteria;
  }

  //#endregion
