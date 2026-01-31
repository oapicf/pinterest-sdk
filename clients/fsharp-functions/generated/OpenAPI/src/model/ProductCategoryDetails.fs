namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ProductCategoriesDemographic
open OpenAPI.Model.ProductCategoriesMetricsHighlights
open OpenAPI.Model.ProductCategoryEnum
open System.Collections.Generic

module ProductCategoryDetails =

  //#region ProductCategoryDetails

  [<CLIMutable>]
  type ProductCategoryDetails = {
    [<JsonProperty(PropertyName = "demographics")>]
    Demographics : ProductCategoriesDemographic;
    [<JsonProperty(PropertyName = "has_prediction")>]
    HasPrediction : bool;
    [<JsonProperty(PropertyName = "metrics_highlights")>]
    MetricsHighlights : ProductCategoriesMetricsHighlights;
    [<JsonProperty(PropertyName = "predicted_time_series")>]
    PredictedTimeSeries : IDictionary<string, decimal>;
    [<JsonProperty(PropertyName = "product_category")>]
    ProductCategory : ProductCategoryEnum;
    [<JsonProperty(PropertyName = "related_searches")>]
    RelatedSearches : string[];
    [<JsonProperty(PropertyName = "time_series")>]
    TimeSeries : IDictionary<string, decimal>;
  }

  //#endregion
