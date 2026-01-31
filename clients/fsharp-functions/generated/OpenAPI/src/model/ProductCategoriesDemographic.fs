namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.GenderDemographics
open System.Collections.Generic

module ProductCategoriesDemographic =

  //#region ProductCategoriesDemographic

  [<CLIMutable>]
  type ProductCategoriesDemographic = {
    [<JsonProperty(PropertyName = "age")>]
    Age : IDictionary<string, decimal>;
    [<JsonProperty(PropertyName = "gender")>]
    Gender : GenderDemographics;
  }

  //#endregion
