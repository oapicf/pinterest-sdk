namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeliveryMetricsResponseItemsInner =

  //#region DeliveryMetricsResponseItemsInner

  [<CLIMutable>]
  type DeliveryMetricsResponseItemsInner = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "category")>]
    Category : string;
    [<JsonProperty(PropertyName = "definition")>]
    Definition : string;
    [<JsonProperty(PropertyName = "display_name")>]
    DisplayName : string;
  }

  //#endregion
