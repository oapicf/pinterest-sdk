namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module LeadFormPolicyLink =

  //#region LeadFormPolicyLink

  [<CLIMutable>]
  type LeadFormPolicyLink = {
    [<JsonProperty(PropertyName = "label")>]
    Label : string;
    [<JsonProperty(PropertyName = "link")>]
    Link : string;
  }

  //#endregion
