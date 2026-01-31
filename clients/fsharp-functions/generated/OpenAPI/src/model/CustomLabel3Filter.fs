namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupFilterOperatorTypeCriteria

module CustomLabel3Filter =

  //#region CustomLabel3Filter

  [<CLIMutable>]
  type CustomLabel3Filter = {
    [<JsonProperty(PropertyName = "CUSTOM_LABEL_3")>]
    CUSTOMLABEL3 : CatalogsProductGroupFilterOperatorTypeCriteria;
  }

  //#endregion
