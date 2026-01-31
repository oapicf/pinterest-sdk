namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LeadFormCommonPolicyLinksInner
open OpenAPI.Model.LeadFormQuestion
open OpenAPI.Model.LeadFormStatus
open OpenAPI.Model.string option

module LeadFormCreateRequest =

  //#region LeadFormCreateRequest


  type LeadFormCreateRequest = {
    CompletionMessage : string option;
    DisclosureLanguage : string option;
    HasAcceptedTerms : bool;
    Name : string option;
    PolicyLinks : LeadFormCommonPolicyLinksInner[];
    PrivacyPolicyLink : string option;
    Questions : LeadFormQuestion[];
    Status : LeadFormStatus;
  }
  //#endregion
