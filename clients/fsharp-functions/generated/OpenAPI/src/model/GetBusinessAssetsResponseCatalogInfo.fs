namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GetBusinessAssetsResponseCatalogInfo =

  //#region GetBusinessAssetsResponseCatalogInfo

  [<CLIMutable>]
  type GetBusinessAssetsResponseCatalogInfo = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
