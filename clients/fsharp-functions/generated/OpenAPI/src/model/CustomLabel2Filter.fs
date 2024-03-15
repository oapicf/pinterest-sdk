namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringCriteria

module CustomLabel2Filter =

  //#region CustomLabel2Filter

  [<CLIMutable>]
  type CustomLabel2Filter = {
    [<JsonProperty(PropertyName = "CUSTOM_LABEL_2")>]
    CUSTOMLABEL2 : CatalogsProductGroupMultipleStringCriteria;
  }

  //#endregion
