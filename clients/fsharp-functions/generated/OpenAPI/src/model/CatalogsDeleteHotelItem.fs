namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsDeleteHotelItem =

  //#region CatalogsDeleteHotelItem

  [<CLIMutable>]
  type CatalogsDeleteHotelItem = {
    [<JsonProperty(PropertyName = "hotel_id")>]
    HotelId : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
  }

  //#endregion
