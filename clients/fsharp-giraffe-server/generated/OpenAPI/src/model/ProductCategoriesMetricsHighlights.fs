namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.InnerProductCategoriesMetricsHighlights

module ProductCategoriesMetricsHighlights =

  //#region ProductCategoriesMetricsHighlights


  type ProductCategoriesMetricsHighlights = {
    Engagement : InnerProductCategoriesMetricsHighlights;
    OutboundClicks : InnerProductCategoriesMetricsHighlights;
    PinSaves : InnerProductCategoriesMetricsHighlights;
  }
  //#endregion
