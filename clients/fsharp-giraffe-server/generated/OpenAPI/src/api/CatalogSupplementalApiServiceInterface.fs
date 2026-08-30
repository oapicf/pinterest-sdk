namespace OpenAPI
open CatalogSupplementalApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module CatalogSupplementalApiServiceInterface =

    //#region Service interface
    type ICatalogSupplementalApiService =
      abstract member CatalogsLocalInventoryItemsBatchOperate:HttpContext -> CatalogsLocalInventoryItemsBatchOperateArgs->CatalogsLocalInventoryItemsBatchOperateResult
      abstract member CatalogsLocalInventoryItemsPost:HttpContext -> CatalogsLocalInventoryItemsPostArgs->CatalogsLocalInventoryItemsPostResult
      abstract member CatalogsLocalStoresCreate:HttpContext -> CatalogsLocalStoresCreateArgs->CatalogsLocalStoresCreateResult
      abstract member CatalogsLocalStoresDelete:HttpContext -> CatalogsLocalStoresDeleteArgs->CatalogsLocalStoresDeleteResult
      abstract member CatalogsLocalStoresList:HttpContext -> CatalogsLocalStoresListArgs->CatalogsLocalStoresListResult
      abstract member CatalogsLocalStoresUpdate:HttpContext -> CatalogsLocalStoresUpdateArgs->CatalogsLocalStoresUpdateResult
      abstract member CatalogsSupplementalItemsBatchGet:HttpContext -> CatalogsSupplementalItemsBatchGetArgs->CatalogsSupplementalItemsBatchGetResult
    //#endregion