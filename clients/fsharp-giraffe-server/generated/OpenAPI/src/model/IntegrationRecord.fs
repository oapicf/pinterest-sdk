namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.int option
open OpenAPI.Model.string option

module IntegrationRecord =

  //#region IntegrationRecord


  type IntegrationRecord = {
    AdditionalId1 : string option;
    ConnectedAdvertiserId : string option;
    ConnectedLbaId : string option;
    ConnectedMerchantId : string option;
    ConnectedTagId : string option;
    ConnectedUserId : string;
    CreatedTime : int;
    ExternalBusinessId : string option;
    Id : string;
    PartnerAccessToken : string option;
    PartnerAccessTokenExpiry : int option;
    PartnerMetadata : string option;
    PartnerPrimaryEmail : string option;
    PartnerRefreshToken : string option;
    PartnerRefreshTokenExpiry : int option;
    Scopes : string option;
    UpdatedTime : int;
  }
  //#endregion
