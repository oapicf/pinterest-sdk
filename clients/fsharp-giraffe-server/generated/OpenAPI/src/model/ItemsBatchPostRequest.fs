namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BatchOperation
open OpenAPI.Model.CatalogsItemsBatchRequest
open OpenAPI.Model.CatalogsItemsRequestLanguage
open OpenAPI.Model.CatalogsVerticalBatchRequest
open OpenAPI.Model.Country
open OpenAPI.Model.ItemDeleteBatchRecord

module ItemsBatchPostRequest =

  //#region ItemsBatchPostRequest


  type items_batch_post_request = {
    Country : Country;
    Language : CatalogsItemsRequestLanguage;
    Operation : BatchOperation;
    Items : ItemDeleteBatchRecord[];
  }
  //#endregion
