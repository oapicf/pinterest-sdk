namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LeadFormPolicyLink
open OpenAPI.Model.LeadFormQuestion
open OpenAPI.Model.LeadFormStatus
open OpenAPI.Model.string option

module LeadFormCreate =

  //#region LeadFormCreate


  type LeadFormCreate = {
    CompletionMessage : string option;
    DisclosureLanguage : string option;
    HasAcceptedTerms : bool;
    Name : string option;
    PolicyLinks : LeadFormPolicyLink[];
    PrivacyPolicyLink : string option;
    Questions : LeadFormQuestion[];
    Status : LeadFormStatus;
  }
  //#endregion
