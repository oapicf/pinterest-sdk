namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module IntegrationRequestPatch =

  //#region IntegrationRequestPatch

  [<CLIMutable>]
  type IntegrationRequestPatch = {
    [<JsonProperty(PropertyName = "connected_merchant_id")>]
    ConnectedMerchantId : string;
    [<JsonProperty(PropertyName = "connected_advertiser_id")>]
    ConnectedAdvertiserId : string;
    [<JsonProperty(PropertyName = "connected_lba_id")>]
    ConnectedLbaId : string;
    [<JsonProperty(PropertyName = "connected_tag_id")>]
    ConnectedTagId : string;
    [<JsonProperty(PropertyName = "partner_access_token")>]
    PartnerAccessToken : string;
    [<JsonProperty(PropertyName = "partner_refresh_token")>]
    PartnerRefreshToken : string;
    [<JsonProperty(PropertyName = "partner_primary_email")>]
    PartnerPrimaryEmail : string;
    [<JsonProperty(PropertyName = "partner_access_token_expiry")>]
    PartnerAccessTokenExpiry : decimal;
    [<JsonProperty(PropertyName = "partner_refresh_token_expiry")>]
    PartnerRefreshTokenExpiry : decimal;
    [<JsonProperty(PropertyName = "scopes")>]
    Scopes : string;
    [<JsonProperty(PropertyName = "additional_id_1")>]
    AdditionalId1 : string;
    [<JsonProperty(PropertyName = "partner_metadata")>]
    PartnerMetadata : string;
  }

  //#endregion
