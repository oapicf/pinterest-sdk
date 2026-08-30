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
    public partial class ProductTagsApi
    { 
        [FunctionName("ProductTagsApi_ProductTagsBulkAdd")]
        public async Task<ActionResult<ProductTagsResponse>> _ProductTagsBulkAdd([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5pins/{pin_id}/product_tags")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string pinId)
        {
            var method = this.GetType().GetMethod("ProductTagsBulkAdd");
            return method != null
                ? (await ((Task<ProductTagsResponse>)method.Invoke(this, new object[] { req, context, pinId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProductTagsApi_ProductTagsBulkDelete")]
        public async Task<ActionResult<>> _ProductTagsBulkDelete([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5pins/{pin_id}/product_tags/bulk-delete")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string pinId)
        {
            var method = this.GetType().GetMethod("ProductTagsBulkDelete");
            return method != null
                ? (await ((Task<>)method.Invoke(this, new object[] { req, context, pinId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProductTagsApi_ProductTagsList")]
        public async Task<ActionResult<ProductTagsResponse>> _ProductTagsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5pins/{pin_id}/product_tags")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string pinId)
        {
            var method = this.GetType().GetMethod("ProductTagsList");
            return method != null
                ? (await ((Task<ProductTagsResponse>)method.Invoke(this, new object[] { req, context, pinId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
