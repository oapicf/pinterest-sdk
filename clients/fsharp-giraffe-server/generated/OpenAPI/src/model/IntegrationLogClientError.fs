namespace OpenAPI.Model

open System
open System.Collections.Generic

module IntegrationLogClientError =

  //#region IntegrationLogClientError


  type IntegrationLogClientError = {
    Cause : string;
    ColumnNumber : int;
    FileName : string;
    LineNumber : int;
    Message : string;
    MessageDetail : string;
    Name : string;
    Number : int;
    StackTrace : string;
  }
  //#endregion
