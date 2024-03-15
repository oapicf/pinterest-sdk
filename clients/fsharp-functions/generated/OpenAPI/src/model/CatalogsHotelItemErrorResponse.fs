namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.ItemValidationEvent

module CatalogsHotelItemErrorResponse =

  //#region CatalogsHotelItemErrorResponse

  [<CLIMutable>]
  type CatalogsHotelItemErrorResponse = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : CatalogsType;
    [<JsonProperty(PropertyName = "hotel_id")>]
    HotelId : string;
    [<JsonProperty(PropertyName = "errors")>]
    Errors : ItemValidationEvent[];
  }

  //#endregion
