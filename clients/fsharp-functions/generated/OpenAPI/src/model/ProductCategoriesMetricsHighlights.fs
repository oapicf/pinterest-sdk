namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.InnerProductCategoriesMetricsHighlights

module ProductCategoriesMetricsHighlights =

  //#region ProductCategoriesMetricsHighlights

  [<CLIMutable>]
  type ProductCategoriesMetricsHighlights = {
    [<JsonProperty(PropertyName = "engagement")>]
    Engagement : InnerProductCategoriesMetricsHighlights;
    [<JsonProperty(PropertyName = "outbound_clicks")>]
    OutboundClicks : InnerProductCategoriesMetricsHighlights;
    [<JsonProperty(PropertyName = "pin_saves")>]
    PinSaves : InnerProductCategoriesMetricsHighlights;
  }

  //#endregion
