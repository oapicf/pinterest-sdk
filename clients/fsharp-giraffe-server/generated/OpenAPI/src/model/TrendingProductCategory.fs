namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ProductCategoriesEngagementType
open OpenAPI.Model.VerticalProductCategory

module TrendingProductCategory =

  //#region TrendingProductCategory


  type TrendingProductCategory = {
    EngagementType : ProductCategoriesEngagementType;
    PctChangeMom : int;
    PercentRelativeVolume : int;
    ProductCategory : string;
    Verticals : VerticalProductCategory[];
  }
  //#endregion
