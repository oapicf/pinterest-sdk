namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupUint32Criteria

module CustomNumber2Filter =

  //#region CustomNumber2Filter

  [<CLIMutable>]
  type CustomNumber2Filter = {
    [<JsonProperty(PropertyName = "CUSTOM_NUMBER_2")>]
    CUSTOMNUMBER2 : CatalogsProductGroupUint32Criteria;
  }

  //#endregion
