namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsHotelAttributes

module CatalogsUpsertHotelItem =

  //#region CatalogsUpsertHotelItem

  [<CLIMutable>]
  type CatalogsUpsertHotelItem = {
    [<JsonProperty(PropertyName = "hotel_id")>]
    HotelId : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : CatalogsHotelAttributes;
  }

  //#endregion
