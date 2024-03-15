namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.IntegrationRecord
open OpenAPI.Model.string option

module IntegrationsGetList200Response =

  //#region IntegrationsGetList200Response


  type integrations_get_list_200_response = {
    Items : IntegrationRecord[];
    Bookmark : string option;
  }
  //#endregion
