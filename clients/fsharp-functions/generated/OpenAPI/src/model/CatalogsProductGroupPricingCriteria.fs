namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsProductGroupPricingCriteria =

  //#region CatalogsProductGroupPricingCriteria

  [<CLIMutable>]
  type CatalogsProductGroupPricingCriteria = {
    [<JsonProperty(PropertyName = "inclusion")>]
    Inclusion : bool;
    [<JsonProperty(PropertyName = "values")>]
    Values : decimal;
    [<JsonProperty(PropertyName = "negated")>]
    Negated : bool;
  }

  //#endregion
