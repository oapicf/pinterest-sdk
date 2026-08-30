namespace OpenAPI.Model

open System
open System.Collections.Generic

module IntegrationMetadataUpdate =

  //#region IntegrationMetadataUpdate


  type IntegrationMetadataUpdate = {
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
