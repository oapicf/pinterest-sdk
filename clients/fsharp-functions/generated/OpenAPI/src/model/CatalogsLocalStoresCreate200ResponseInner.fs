namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsLocalStoresCreate200ResponseInnerData

module CatalogsLocalStoresCreate200ResponseInner =

  //#region CatalogsLocalStoresCreate200ResponseInner

  [<CLIMutable>]
  type CatalogsLocalStoresCreate200ResponseInner = {
    [<JsonProperty(PropertyName = "data")>]
    Data : CatalogsLocalStoresCreate200ResponseInnerData;
  }

  //#endregion
