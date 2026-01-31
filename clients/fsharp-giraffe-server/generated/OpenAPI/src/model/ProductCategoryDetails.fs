namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ProductCategoriesDemographic
open OpenAPI.Model.ProductCategoriesMetricsHighlights
open OpenAPI.Model.ProductCategoryEnum
open System.Collections.Generic

module ProductCategoryDetails =

  //#region ProductCategoryDetails


  type ProductCategoryDetails = {
    Demographics : ProductCategoriesDemographic;
    HasPrediction : bool;
    MetricsHighlights : ProductCategoriesMetricsHighlights;
    PredictedTimeSeries : IDictionary<string, decimal>;
    ProductCategory : ProductCategoryEnum;
    RelatedSearches : string[];
    TimeSeries : IDictionary<string, decimal>;
  }
  //#endregion
