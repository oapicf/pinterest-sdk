namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsHotelMainImage =

  //#region CatalogsHotelMainImage

  [<CLIMutable>]
  type CatalogsHotelMainImage = {
    [<JsonProperty(PropertyName = "link")>]
    Link : string;
    [<JsonProperty(PropertyName = "tag")>]
    Tag : string[];
  }

  //#endregion
