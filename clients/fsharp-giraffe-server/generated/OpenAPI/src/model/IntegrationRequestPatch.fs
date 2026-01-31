namespace OpenAPI.Model

open System
open System.Collections.Generic

module IntegrationRequestPatch =

  //#region IntegrationRequestPatch


  type IntegrationRequestPatch = {
    AdditionalId1 : string;
    ConnectedAdvertiserId : string;
    ConnectedLbaId : string;
    ConnectedMerchantId : string;
    ConnectedTagId : string;
    PartnerAccessToken : string;
    PartnerAccessTokenExpiry : decimal;
    PartnerMetadata : string;
    PartnerPrimaryEmail : string;
    PartnerRefreshToken : string;
    PartnerRefreshTokenExpiry : decimal;
    Scopes : string;
  }
  //#endregion
