namespace OpenAPI.Model

open System
open System.Collections.Generic

module IntegrationMetadataCreate =

  //#region IntegrationMetadataCreate


  type IntegrationMetadataCreate = {
    AdditionalId1 : string;
    ConnectedAdvertiserId : string;
    ConnectedLbaId : string;
    ConnectedMerchantId : string;
    ConnectedTagId : string;
    ExternalBusinessId : string;
    PartnerAccessToken : string;
    PartnerAccessTokenExpiry : decimal;
    PartnerMetadata : string;
    PartnerPrimaryEmail : string;
    PartnerRefreshToken : string;
    PartnerRefreshTokenExpiry : decimal;
    Scopes : string;
  }
  //#endregion
