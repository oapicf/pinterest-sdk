namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PartnerMetadata
open OpenAPI.Model.string option

module LeadSubscriptionPostParams =

  //#region LeadSubscriptionPostParams


  type LeadSubscriptionPostParams = {
    AdAccountId : string;
    ApiVersion : string;
    CreatedTime : int;
    CryptographicAlgorithm : string option;
    CryptographicKey : string option;
    Id : string;
    LeadFormId : string option;
    UserAccountId : string;
    WebhookUrl : string;
    PartnerAccessToken : string;
    PartnerMetadata : PartnerMetadata;
    PartnerRefreshToken : string;
  }
  //#endregion
