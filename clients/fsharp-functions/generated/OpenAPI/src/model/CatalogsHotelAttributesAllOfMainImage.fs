namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsHotelAttributesAllOfMainImage =

  //#region CatalogsHotelAttributesAllOfMainImage

  [<CLIMutable>]
  type CatalogsHotelAttributesAllOfMainImage = {
    [<JsonProperty(PropertyName = "link")>]
    Link : string;
    [<JsonProperty(PropertyName = "tag")>]
    Tag : string[];
  }

  //#endregion
