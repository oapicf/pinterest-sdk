namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PinterestLibError

module CatalogsLocalStoresCreate200ResponseInnerDataOneOf =

  //#region CatalogsLocalStoresCreate200ResponseInnerDataOneOf

  [<CLIMutable>]
  type CatalogsLocalStoresCreate200ResponseInnerDataOneOf = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "exceptions")>]
    Exceptions : PinterestLibError;
  }

  //#endregion
