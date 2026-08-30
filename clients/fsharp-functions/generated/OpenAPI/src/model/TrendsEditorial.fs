namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.KeywordInfo

module TrendsEditorial =

  //#region TrendsEditorial

  [<CLIMutable>]
  type TrendsEditorial = {
    [<JsonProperty(PropertyName = "board_url")>]
    BoardUrl : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "interests")>]
    Interests : string[];
    [<JsonProperty(PropertyName = "pins_url")>]
    PinsUrl : string[];
    [<JsonProperty(PropertyName = "related_keywords")>]
    RelatedKeywords : KeywordInfo[];
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
  }

  //#endregion
