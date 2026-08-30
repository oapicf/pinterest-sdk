using System.IO;
using System.Net;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Azure.WebJobs;
using Microsoft.Azure.WebJobs.Extensions.Http;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Attributes;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Enums;
using Microsoft.Extensions.Logging;
using Microsoft.OpenApi.Models;
using Newtonsoft.Json;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Functions
{ 
    public partial class CatalogSupplementalApi
    { 
        [FunctionName("CatalogSupplementalApi_CatalogsLocalInventoryItemsBatchOperate")]
        public async Task<ActionResult<SupplementalItemsBatchResponse>> _CatalogsLocalInventoryItemsBatchOperate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5catalogs/{catalog_id}/local_inventory_items/batch")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(19)]string catalogId)
        {
            var method = this.GetType().GetMethod("CatalogsLocalInventoryItemsBatchOperate");
            return method != null
                ? (await ((Task<SupplementalItemsBatchResponse>)method.Invoke(this, new object[] { req, context, catalogId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogSupplementalApi_CatalogsLocalInventoryItemsPost")]
        public async Task<ActionResult<LocalInventoryItemsGet>> _CatalogsLocalInventoryItemsPost([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5catalogs/{catalog_id}/local_inventory_items/query")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(19)]string catalogId)
        {
            var method = this.GetType().GetMethod("CatalogsLocalInventoryItemsPost");
            return method != null
                ? (await ((Task<LocalInventoryItemsGet>)method.Invoke(this, new object[] { req, context, catalogId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogSupplementalApi_CatalogsLocalStoresCreate")]
        public async Task<ActionResult<List<CatalogsLocalStoresCreate200ResponseInner>>> _CatalogsLocalStoresCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5catalogs/{catalog_id}/local_stores")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(19)]string catalogId)
        {
            var method = this.GetType().GetMethod("CatalogsLocalStoresCreate");
            return method != null
                ? (await ((Task<List<CatalogsLocalStoresCreate200ResponseInner>>)method.Invoke(this, new object[] { req, context, catalogId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogSupplementalApi_CatalogsLocalStoresDelete")]
        public async Task<ActionResult<List<CatalogsLocalStoresDelete200ResponseInner>>> _CatalogsLocalStoresDelete([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v5catalogs/{catalog_id}/local_stores")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(19)]string catalogId)
        {
            var method = this.GetType().GetMethod("CatalogsLocalStoresDelete");
            return method != null
                ? (await ((Task<List<CatalogsLocalStoresDelete200ResponseInner>>)method.Invoke(this, new object[] { req, context, catalogId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogSupplementalApi_CatalogsLocalStoresList")]
        public async Task<ActionResult<CatalogsLocalStoresList200Response>> _CatalogsLocalStoresList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5catalogs/{catalog_id}/local_stores")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(19)]string catalogId)
        {
            var method = this.GetType().GetMethod("CatalogsLocalStoresList");
            return method != null
                ? (await ((Task<CatalogsLocalStoresList200Response>)method.Invoke(this, new object[] { req, context, catalogId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogSupplementalApi_CatalogsLocalStoresUpdate")]
        public async Task<ActionResult<List<CatalogsLocalStoresCreate200ResponseInner>>> _CatalogsLocalStoresUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5catalogs/{catalog_id}/local_stores")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(19)]string catalogId)
        {
            var method = this.GetType().GetMethod("CatalogsLocalStoresUpdate");
            return method != null
                ? (await ((Task<List<CatalogsLocalStoresCreate200ResponseInner>>)method.Invoke(this, new object[] { req, context, catalogId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogSupplementalApi_CatalogsSupplementalItemsBatchGet")]
        public async Task<ActionResult<SupplementalItemsBatchResponse>> _CatalogsSupplementalItemsBatchGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5catalogs/{catalog_id}/supplemental_items/batch/{batch_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(19)]string catalogId, [RegularExpression("^\\d+$")]string batchId)
        {
            var method = this.GetType().GetMethod("CatalogsSupplementalItemsBatchGet");
            return method != null
                ? (await ((Task<SupplementalItemsBatchResponse>)method.Invoke(this, new object[] { req, context, catalogId, batchId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
