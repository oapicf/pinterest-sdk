namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupFilterOperatorTypeCriteria

module CustomLabel4Filter =

  //#region CustomLabel4Filter

  [<CLIMutable>]
  type CustomLabel4Filter = {
    [<JsonProperty(PropertyName = "CUSTOM_LABEL_4")>]
    CUSTOMLABEL4 : CatalogsProductGroupFilterOperatorTypeCriteria;
  }

  //#endregion
