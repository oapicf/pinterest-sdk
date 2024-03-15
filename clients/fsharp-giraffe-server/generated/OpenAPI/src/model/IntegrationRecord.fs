namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module IntegrationRecord =

  //#region IntegrationRecord


  type IntegrationRecord = {
    Id : string;
    ExternalBusinessId : string option;
    ConnectedMerchantId : string option;
    ConnectedUserId : string;
    ConnectedAdvertiserId : string option;
    ConnectedLbaId : string option;
    ConnectedTagId : string option;
    PartnerAccessToken : string option;
    PartnerRefreshToken : string option;
    PartnerPrimaryEmail : string option;
    PartnerAccessTokenExpiry : int option;
    PartnerRefreshTokenExpiry : int option;
    Scopes : string option;
    PartnerMetadata : string option;
    AdditionalId1 : string option;
    CreatedTime : int;
    UpdatedTime : int;
  }
  //#endregion
