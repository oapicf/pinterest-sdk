namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LeadFormCommonPolicyLinksInner
open OpenAPI.Model.LeadFormQuestion
open OpenAPI.Model.LeadFormStatus
open OpenAPI.Model.string option

module LeadFormCommon =

  //#region LeadFormCommon

  [<CLIMutable>]
  type LeadFormCommon = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string option;
    [<JsonProperty(PropertyName = "privacy_policy_link")>]
    PrivacyPolicyLink : string option;
    [<JsonProperty(PropertyName = "has_accepted_terms")>]
    HasAcceptedTerms : bool;
    [<JsonProperty(PropertyName = "completion_message")>]
    CompletionMessage : string option;
    [<JsonProperty(PropertyName = "status")>]
    Status : LeadFormStatus;
    [<JsonProperty(PropertyName = "disclosure_language")>]
    DisclosureLanguage : string option;
    [<JsonProperty(PropertyName = "questions")>]
    Questions : LeadFormQuestion[];
    [<JsonProperty(PropertyName = "policy_links")>]
    PolicyLinks : LeadFormCommonPolicyLinksInner[];
  }

  //#endregion
