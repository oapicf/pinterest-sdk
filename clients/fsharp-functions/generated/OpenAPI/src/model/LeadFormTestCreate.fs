namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module LeadFormTestCreate =

  //#region LeadFormTestCreate

  [<CLIMutable>]
  type LeadFormTestCreate = {
    [<JsonProperty(PropertyName = "answers")>]
    Answers : string[];
  }

  //#endregion
