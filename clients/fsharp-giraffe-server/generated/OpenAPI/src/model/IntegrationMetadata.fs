namespace OpenAPI.Model

open System
open System.Collections.Generic

module IntegrationMetadata =

  //#region IntegrationMetadata


  type IntegrationMetadata = {
    AdditionalId1 : string;
    ConnectedAdvertiserId : string;
    ConnectedLbaId : string;
    ConnectedMerchantId : string;
    ConnectedTagId : string;
    ConnectedUserId : string;
    CreatedTimestamp : decimal;
    ExternalBusinessId : string;
    Id : string;
    PartnerAccessTokenExpiry : decimal;
    PartnerMetadata : string;
    PartnerRefreshTokenExpiry : decimal;
    Scopes : string;
    UpdatedTimestamp : decimal;
  }
  //#endregion
