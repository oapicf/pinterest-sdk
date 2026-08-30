namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ProductCategoriesEngagementType

module TrendingProductCategory =

  //#region TrendingProductCategory


  type TrendingProductCategory = {
    EngagementType : ProductCategoriesEngagementType;
    PctChangeMom : int;
    PercentRelativeVolume : int;
    PinterestProductCategoryId : int;
    ProductCategory : string;
    Verticals : string[];
  }
  //#endregion
