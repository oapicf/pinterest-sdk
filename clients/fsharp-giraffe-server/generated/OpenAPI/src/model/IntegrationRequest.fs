namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.string option

module IntegrationRequest =

  //#region IntegrationRequest


  type IntegrationRequest = {
    ExternalBusinessId : string option;
    ConnectedMerchantId : string;
    ConnectedAdvertiserId : string;
    ConnectedLbaId : string;
    ConnectedTagId : string;
    PartnerAccessToken : string;
    PartnerRefreshToken : string;
    PartnerPrimaryEmail : string;
    PartnerAccessTokenExpiry : int;
    PartnerRefreshTokenExpiry : int;
    Scopes : string;
    AdditionalId1 : string;
    PartnerMetadata : string;
  }
  //#endregion
