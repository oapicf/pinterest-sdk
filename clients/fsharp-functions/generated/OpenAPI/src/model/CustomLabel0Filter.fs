namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringCriteria

module CustomLabel0Filter =

  //#region CustomLabel0Filter

  [<CLIMutable>]
  type CustomLabel0Filter = {
    [<JsonProperty(PropertyName = "CUSTOM_LABEL_0")>]
    CUSTOMLABEL0 : CatalogsProductGroupMultipleStringCriteria;
  }

  //#endregion
