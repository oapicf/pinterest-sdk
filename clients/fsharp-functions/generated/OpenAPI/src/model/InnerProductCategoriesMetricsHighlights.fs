namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module InnerProductCategoriesMetricsHighlights =

  //#region InnerProductCategoriesMetricsHighlights

  [<CLIMutable>]
  type InnerProductCategoriesMetricsHighlights = {
    [<JsonProperty(PropertyName = "pct_change_mom")>]
    PctChangeMom : decimal;
  }

  //#endregion
