namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringCriteria

module CustomLabel1Filter =

  //#region CustomLabel1Filter

  [<CLIMutable>]
  type CustomLabel1Filter = {
    [<JsonProperty(PropertyName = "CUSTOM_LABEL_1")>]
    CUSTOMLABEL1 : CatalogsProductGroupMultipleStringCriteria;
  }

  //#endregion
