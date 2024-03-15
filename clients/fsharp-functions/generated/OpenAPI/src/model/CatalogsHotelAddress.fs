namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsHotelAddress =

  //#region CatalogsHotelAddress

  [<CLIMutable>]
  type CatalogsHotelAddress = {
    [<JsonProperty(PropertyName = "addr1")>]
    Addr1 : string;
    [<JsonProperty(PropertyName = "city")>]
    City : string;
    [<JsonProperty(PropertyName = "region")>]
    Region : string;
    [<JsonProperty(PropertyName = "country")>]
    Country : string;
    [<JsonProperty(PropertyName = "postal_code")>]
    PostalCode : string;
  }

  //#endregion
