namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AudienceDataParty
open OpenAPI.Model.AudienceRule
open OpenAPI.Model.AudienceSharingType

module AudienceCreateCustomRequest =

  //#region AudienceCreateCustomRequest


  type AudienceCreateCustomRequest = {
    AdAccountId : string;
    Name : string;
    Rule : AudienceRule;
    SharingType : AudienceSharingType;
    DataParty : AudienceDataParty;
    Category : string;
  }
  //#endregion
