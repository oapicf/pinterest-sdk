namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AudienceDataParty
open OpenAPI.Model.AudienceRule
open OpenAPI.Model.AudienceSharingType

module AudienceCreateCustomRequest =

  //#region AudienceCreateCustomRequest

  [<CLIMutable>]
  type AudienceCreateCustomRequest = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "rule")>]
    Rule : AudienceRule;
    [<JsonProperty(PropertyName = "sharing_type")>]
    SharingType : AudienceSharingType;
    [<JsonProperty(PropertyName = "data_party")>]
    DataParty : AudienceDataParty;
    [<JsonProperty(PropertyName = "category")>]
    Category : string;
  }

  //#endregion
