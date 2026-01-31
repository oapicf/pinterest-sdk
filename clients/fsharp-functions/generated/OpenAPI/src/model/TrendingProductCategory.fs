namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ProductCategoriesEngagementType
open OpenAPI.Model.VerticalProductCategory

module TrendingProductCategory =

  //#region TrendingProductCategory

  [<CLIMutable>]
  type TrendingProductCategory = {
    [<JsonProperty(PropertyName = "engagement_type")>]
    EngagementType : ProductCategoriesEngagementType;
    [<JsonProperty(PropertyName = "pct_change_mom")>]
    PctChangeMom : int;
    [<JsonProperty(PropertyName = "percent_relative_volume")>]
    PercentRelativeVolume : int;
    [<JsonProperty(PropertyName = "product_category")>]
    ProductCategory : string;
    [<JsonProperty(PropertyName = "verticals")>]
    Verticals : VerticalProductCategory[];
  }

  //#endregion
