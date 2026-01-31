namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType
open System.Collections.Generic

module ProductGroupAnalyticsResponseInner =

  //#region ProductGroupAnalyticsResponseInner

  [<CLIMutable>]
  type ProductGroupAnalyticsResponseInner = {
    [<JsonProperty(PropertyName = "DATE")>]
    DATE : DateTime;
    [<JsonProperty(PropertyName = "PRODUCT_GROUP_ID")>]
    PRODUCT_GROUP_ID : string;
  }

  //#endregion
