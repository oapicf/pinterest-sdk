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
    public partial class AudiencesApi
    { 
        [FunctionName("AudiencesApi_AudiencesCreate")]
        public async Task<ActionResult<AdAccountsAudience>> _AudiencesCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/audiences")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AudiencesCreate");
            return method != null
                ? (await ((Task<AdAccountsAudience>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AudiencesApi_AudiencesGet")]
        public async Task<ActionResult<AdAccountsAudience>> _AudiencesGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/audiences/{audience_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string audienceId, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AudiencesGet");
            return method != null
                ? (await ((Task<AdAccountsAudience>)method.Invoke(this, new object[] { req, context, audienceId, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AudiencesApi_AudiencesList")]
        public async Task<ActionResult<AudiencesList200Response>> _AudiencesList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/audiences")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AudiencesList");
            return method != null
                ? (await ((Task<AudiencesList200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AudiencesApi_AudiencesUpdate")]
        public async Task<ActionResult<AdAccountsAudience>> _AudiencesUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5ad_accounts/{ad_account_id}/audiences/{audience_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string audienceId, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AudiencesUpdate");
            return method != null
                ? (await ((Task<AdAccountsAudience>)method.Invoke(this, new object[] { req, context, audienceId, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
