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
    public partial class ConversionDeletionRequestsApi
    { 
        [FunctionName("ConversionDeletionRequestsApi_ConversionDeletionRequestCreate")]
        public async Task<ActionResult<ConversionDeletionRequest>> _ConversionDeletionRequestCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/conversion_deletion_requests")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("ConversionDeletionRequestCreate");
            return method != null
                ? (await ((Task<ConversionDeletionRequest>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConversionDeletionRequestsApi_ConversionDeletionRequestDelete")]
        public async Task<ActionResult<ConversionDeletionRequest>> _ConversionDeletionRequestDelete([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v5ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string requestId, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("ConversionDeletionRequestDelete");
            return method != null
                ? (await ((Task<ConversionDeletionRequest>)method.Invoke(this, new object[] { req, context, requestId, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConversionDeletionRequestsApi_ConversionDeletionRequestGet")]
        public async Task<ActionResult<ConversionDeletionRequest>> _ConversionDeletionRequestGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string requestId, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("ConversionDeletionRequestGet");
            return method != null
                ? (await ((Task<ConversionDeletionRequest>)method.Invoke(this, new object[] { req, context, requestId, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConversionDeletionRequestsApi_ConversionDeletionRequestList")]
        public async Task<ActionResult<ConversionDeletionRequestList200Response>> _ConversionDeletionRequestList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/conversion_deletion_requests")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("ConversionDeletionRequestList");
            return method != null
                ? (await ((Task<ConversionDeletionRequestList200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
