namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupUint32Criteria

module CustomNumber1Filter =

  //#region CustomNumber1Filter

  [<CLIMutable>]
  type CustomNumber1Filter = {
    [<JsonProperty(PropertyName = "CUSTOM_NUMBER_1")>]
    CUSTOMNUMBER1 : CatalogsProductGroupUint32Criteria;
  }

  //#endregion
