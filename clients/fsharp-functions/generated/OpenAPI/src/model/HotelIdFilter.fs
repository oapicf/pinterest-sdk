namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringCriteria

module HotelIdFilter =

  //#region HotelIdFilter

  [<CLIMutable>]
  type HotelIdFilter = {
    [<JsonProperty(PropertyName = "HOTEL_ID")>]
    HOTEL_ID : CatalogsProductGroupMultipleStringCriteria;
  }

  //#endregion
