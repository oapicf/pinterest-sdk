namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsDbItem =

  //#region CatalogsDbItem

  [<CLIMutable>]
  type CatalogsDbItem = {
    [<JsonProperty(PropertyName = "created_at")>]
    CreatedAt : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "updated_at")>]
    UpdatedAt : Nullable<DateTime>;
  }

  //#endregion
