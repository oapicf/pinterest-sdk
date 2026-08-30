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
    public partial class CatalogItemsApi
    { 
        [FunctionName("CatalogItemsApi_ItemsBatchGet")]
        public async Task<ActionResult<CatalogsItemsBatch>> _ItemsBatchGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5catalogs/items/batch/{batch_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string batchId)
        {
            var method = this.GetType().GetMethod("ItemsBatchGet");
            return method != null
                ? (await ((Task<CatalogsItemsBatch>)method.Invoke(this, new object[] { req, context, batchId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogItemsApi_ItemsBatchPost")]
        public async Task<ActionResult<CatalogsItemsBatch>> _ItemsBatchPost([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5catalogs/items/batch")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ItemsBatchPost");
            return method != null
                ? (await ((Task<CatalogsItemsBatch>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CatalogItemsApi_ItemsPost")]
        public async Task<ActionResult<ItemsPost200Response>> _ItemsPost([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5catalogs/items")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ItemsPost");
            return method != null
                ? (await ((Task<ItemsPost200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
