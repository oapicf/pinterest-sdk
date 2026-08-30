namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeliveryMetricsResponseItemsItems =

  //#region DeliveryMetricsResponseItemsItems

  [<CLIMutable>]
  type DeliveryMetricsResponseItemsItems = {
    [<JsonProperty(PropertyName = "category")>]
    Category : string;
    [<JsonProperty(PropertyName = "definition")>]
    Definition : string;
    [<JsonProperty(PropertyName = "display_name")>]
    DisplayName : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
