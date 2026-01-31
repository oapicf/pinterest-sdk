namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupUint32Criteria

module CustomNumber3Filter =

  //#region CustomNumber3Filter

  [<CLIMutable>]
  type CustomNumber3Filter = {
    [<JsonProperty(PropertyName = "CUSTOM_NUMBER_3")>]
    CUSTOMNUMBER3 : CatalogsProductGroupUint32Criteria;
  }

  //#endregion
