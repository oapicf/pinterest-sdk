namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsHotelProductMetadata =

  //#region CatalogsHotelProductMetadata

  [<CLIMutable>]
  type CatalogsHotelProductMetadata = {
    [<JsonProperty(PropertyName = "hotel_id")>]
    HotelId : string;
  }

  //#endregion
