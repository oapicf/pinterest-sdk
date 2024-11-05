namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module LeadFormCommonPolicyLinksInner =

  //#region LeadFormCommonPolicyLinksInner

  [<CLIMutable>]
  type LeadFormCommonPolicyLinksInner = {
    [<JsonProperty(PropertyName = "label")>]
    Label : string;
    [<JsonProperty(PropertyName = "link")>]
    Link : string;
  }

  //#endregion
