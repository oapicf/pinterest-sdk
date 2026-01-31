namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.InterestsEnum
open OpenAPI.Model.ProductCategoryRegion
open OpenAPI.Model.TrendingTopic

module FeaturedTrend =

  //#region FeaturedTrend

  [<CLIMutable>]
  type FeaturedTrend = {
    [<JsonProperty(PropertyName = "interest")>]
    Interest : InterestsEnum;
    [<JsonProperty(PropertyName = "market")>]
    Market : ProductCategoryRegion;
    [<JsonProperty(PropertyName = "trends")>]
    Trends : TrendingTopic[];
  }

  //#endregion
