namespace OpenAPI
open CatalogSupplementalApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module CatalogSupplementalApiServiceInterface =

    //#region Service interface
    type ICatalogSupplementalApiService =
      abstract member CatalogsLocalInventoryItemsBatchOperate : CatalogsLocalInventoryItemsBatchOperateBodyParams -> CatalogsLocalInventoryItemsBatchOperateResult
      abstract member CatalogsLocalInventoryItemsPost : CatalogsLocalInventoryItemsPostBodyParams -> CatalogsLocalInventoryItemsPostResult
      abstract member CatalogsLocalStoresCreate : CatalogsLocalStoresCreateBodyParams -> CatalogsLocalStoresCreateResult
      abstract member CatalogsLocalStoresDelete : unit -> CatalogsLocalStoresDeleteResult
      abstract member CatalogsLocalStoresList : unit -> CatalogsLocalStoresListResult
      abstract member CatalogsLocalStoresUpdate : CatalogsLocalStoresUpdateBodyParams -> CatalogsLocalStoresUpdateResult
      abstract member CatalogsSupplementalItemsBatchGet : unit -> CatalogsSupplementalItemsBatchGetResult
    //#endregion