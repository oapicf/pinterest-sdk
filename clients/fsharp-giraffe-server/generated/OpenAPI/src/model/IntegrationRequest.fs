namespace OpenAPI.Model

open System
open System.Collections.Generic

module IntegrationRequest =

  //#region IntegrationRequest


  type IntegrationRequest = {
    AdditionalId1 : string;
    ConnectedAdvertiserId : string;
    ConnectedLbaId : string;
    ConnectedMerchantId : string;
    ConnectedTagId : string;
    ExternalBusinessId : string;
    PartnerAccessToken : string;
    PartnerAccessTokenExpiry : int;
    PartnerMetadata : string;
    PartnerPrimaryEmail : string;
    PartnerRefreshToken : string;
    PartnerRefreshTokenExpiry : int;
    Scopes : string;
  }
  //#endregion
