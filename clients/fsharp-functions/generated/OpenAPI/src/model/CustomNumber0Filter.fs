namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupUint32Criteria

module CustomNumber0Filter =

  //#region CustomNumber0Filter

  [<CLIMutable>]
  type CustomNumber0Filter = {
    [<JsonProperty(PropertyName = "CUSTOM_NUMBER_0")>]
    CUSTOMNUMBER0 : CatalogsProductGroupUint32Criteria;
  }

  //#endregion
