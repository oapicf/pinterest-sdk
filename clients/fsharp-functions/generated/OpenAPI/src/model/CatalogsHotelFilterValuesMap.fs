namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsHotelFilterValuesMap =

  //#region CatalogsHotelFilterValuesMap

  [<CLIMutable>]
  type CatalogsHotelFilterValuesMap = {
    [<JsonProperty(PropertyName = "brand")>]
    Brand : string[];
    [<JsonProperty(PropertyName = "custom_label_0")>]
    CustomLabel0 : string[];
    [<JsonProperty(PropertyName = "custom_label_1")>]
    CustomLabel1 : string[];
    [<JsonProperty(PropertyName = "custom_label_2")>]
    CustomLabel2 : string[];
    [<JsonProperty(PropertyName = "custom_label_3")>]
    CustomLabel3 : string[];
    [<JsonProperty(PropertyName = "custom_label_4")>]
    CustomLabel4 : string[];
  }

  //#endregion
