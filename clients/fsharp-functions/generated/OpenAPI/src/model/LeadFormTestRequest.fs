namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module LeadFormTestRequest =

  //#region LeadFormTestRequest

  [<CLIMutable>]
  type LeadFormTestRequest = {
    [<JsonProperty(PropertyName = "answers")>]
    Answers : string[];
  }

  //#endregion
