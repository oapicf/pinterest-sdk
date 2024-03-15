namespace OpenAPI.Model

open System
open System.Collections.Generic

module IntegrationRequestPatch =

  //#region IntegrationRequestPatch


  type IntegrationRequestPatch = {
    ConnectedMerchantId : string;
    ConnectedAdvertiserId : string;
    ConnectedLbaId : string;
    ConnectedTagId : string;
    PartnerAccessToken : string;
    PartnerRefreshToken : string;
    PartnerPrimaryEmail : string;
    PartnerAccessTokenExpiry : decimal;
    PartnerRefreshTokenExpiry : decimal;
    Scopes : string;
    AdditionalId1 : string;
    PartnerMetadata : string;
  }
  //#endregion
