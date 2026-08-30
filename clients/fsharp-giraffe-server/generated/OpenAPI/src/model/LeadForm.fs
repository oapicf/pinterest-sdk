namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.LeadFormPolicyLink
open OpenAPI.Model.LeadFormQuestion
open OpenAPI.Model.LeadFormStatus
open OpenAPI.Model.string option

module LeadForm =

  //#region LeadForm


  type LeadForm = {
    AdAccountId : string;
    CompletionMessage : string option;
    CreatedTime : int;
    DisclosureLanguage : string option;
    HasAcceptedTerms : bool;
    Id : string;
    Name : string option;
    PolicyLinks : LeadFormPolicyLink[];
    PrivacyPolicyLink : string option;
    Questions : LeadFormQuestion[];
    Status : LeadFormStatus;
    UpdatedTime : int;
  }
  //#endregion
