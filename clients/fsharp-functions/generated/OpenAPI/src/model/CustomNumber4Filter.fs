namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupUint32Criteria

module CustomNumber4Filter =

  //#region CustomNumber4Filter

  [<CLIMutable>]
  type CustomNumber4Filter = {
    [<JsonProperty(PropertyName = "CUSTOM_NUMBER_4")>]
    CUSTOMNUMBER4 : CatalogsProductGroupUint32Criteria;
  }

  //#endregion
