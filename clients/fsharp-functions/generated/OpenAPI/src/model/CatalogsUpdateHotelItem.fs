namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsUpdatableHotelAttributes

module CatalogsUpdateHotelItem =

  //#region CatalogsUpdateHotelItem

  [<CLIMutable>]
  type CatalogsUpdateHotelItem = {
    [<JsonProperty(PropertyName = "hotel_id")>]
    HotelId : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : CatalogsUpdatableHotelAttributes;
  }

  //#endregion
