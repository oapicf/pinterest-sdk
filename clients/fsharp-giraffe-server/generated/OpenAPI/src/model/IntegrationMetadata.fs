namespace OpenAPI.Model

open System
open System.Collections.Generic

module IntegrationMetadata =

  //#region IntegrationMetadata


  type IntegrationMetadata = {
    Id : string;
    ExternalBusinessId : string;
    ConnectedMerchantId : string;
    ConnectedUserId : string;
    ConnectedAdvertiserId : string;
    ConnectedLbaId : string;
    ConnectedTagId : string;
    PartnerAccessTokenExpiry : decimal;
    PartnerRefreshTokenExpiry : decimal;
    Scopes : string;
    CreatedTimestamp : decimal;
    UpdatedTimestamp : decimal;
    AdditionalId1 : string;
    PartnerMetadata : string;
  }
  //#endregion
