namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module KeywordInfo =

  //#region KeywordInfo

  [<CLIMutable>]
  type KeywordInfo = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "pct_growth_mom")>]
    PctGrowthMom : decimal;
  }

  //#endregion
