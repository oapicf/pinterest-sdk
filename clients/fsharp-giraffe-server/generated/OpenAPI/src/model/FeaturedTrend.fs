namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.InterestsEnum
open OpenAPI.Model.ProductCategoryRegion
open OpenAPI.Model.TrendingTopic

module FeaturedTrend =

  //#region FeaturedTrend


  type FeaturedTrend = {
    Interest : InterestsEnum;
    Market : ProductCategoryRegion;
    Trends : TrendingTopic[];
  }
  //#endregion
