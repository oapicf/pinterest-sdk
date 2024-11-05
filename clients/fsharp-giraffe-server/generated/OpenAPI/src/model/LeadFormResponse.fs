namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LeadFormCommonPolicyLinksInner
open OpenAPI.Model.LeadFormQuestion
open OpenAPI.Model.LeadFormStatus
open OpenAPI.Model.string option

module LeadFormResponse =

  //#region LeadFormResponse


  type LeadFormResponse = {
    Name : string option;
    PrivacyPolicyLink : string option;
    HasAcceptedTerms : bool;
    CompletionMessage : string option;
    Status : LeadFormStatus;
    DisclosureLanguage : string option;
    Questions : LeadFormQuestion[];
    PolicyLinks : LeadFormCommonPolicyLinksInner[];
    Id : string;
    AdAccountId : string;
    CreatedTime : int;
    UpdatedTime : int;
  }
  //#endregion
