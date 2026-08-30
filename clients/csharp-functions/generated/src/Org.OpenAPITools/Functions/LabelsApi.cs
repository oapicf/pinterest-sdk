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
    public partial class LabelsApi
    { 
        [FunctionName("LabelsApi_LabelsApply")]
        public async Task<ActionResult<LabeledEntities>> _LabelsApply([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/labels/{label_id}/apply")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId, string labelId)
        {
            var method = this.GetType().GetMethod("LabelsApply");
            return method != null
                ? (await ((Task<LabeledEntities>)method.Invoke(this, new object[] { req, context, adAccountId, labelId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LabelsApi_LabelsCreate")]
        public async Task<ActionResult<LabelsResponse>> _LabelsCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/labels")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("LabelsCreate");
            return method != null
                ? (await ((Task<LabelsResponse>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LabelsApi_LabelsList")]
        public async Task<ActionResult<LabelsList200Response>> _LabelsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/labels")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("LabelsList");
            return method != null
                ? (await ((Task<LabelsList200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LabelsApi_LabelsRemove")]
        public async Task<ActionResult<LabeledEntities>> _LabelsRemove([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/labels/{label_id}/remove")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId, string labelId)
        {
            var method = this.GetType().GetMethod("LabelsRemove");
            return method != null
                ? (await ((Task<LabeledEntities>)method.Invoke(this, new object[] { req, context, adAccountId, labelId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LabelsApi_LabelsUpdate")]
        public async Task<ActionResult<LabelsResponse>> _LabelsUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5ad_accounts/{ad_account_id}/labels")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("LabelsUpdate");
            return method != null
                ? (await ((Task<LabelsResponse>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
