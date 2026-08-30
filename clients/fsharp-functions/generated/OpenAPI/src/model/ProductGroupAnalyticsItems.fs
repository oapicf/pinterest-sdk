namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ProductGroupAnalyticsItems =

  //#region ProductGroupAnalyticsItems

  [<CLIMutable>]
  type ProductGroupAnalyticsItems = {
    [<JsonProperty(PropertyName = "DATE")>]
    DATE : DateTime;
    [<JsonProperty(PropertyName = "PRODUCT_GROUP_ID")>]
    PRODUCT_GROUP_ID : string;
  }

  //#endregion
