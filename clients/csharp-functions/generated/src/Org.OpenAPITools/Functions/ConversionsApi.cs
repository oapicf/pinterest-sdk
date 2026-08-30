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
    public partial class ConversionsApi
    { 
        [FunctionName("ConversionsApi_AdvertiserDefinedEventsCreate")]
        public async Task<ActionResult<AdvertiserDefinedEventsCreate200Response>> _AdvertiserDefinedEventsCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/advertiser_defined_events")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdvertiserDefinedEventsCreate");
            return method != null
                ? (await ((Task<AdvertiserDefinedEventsCreate200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConversionsApi_AdvertiserDefinedEventsDelete")]
        public async Task<ActionResult<AdvertiserDefinedEventsCreate200Response>> _AdvertiserDefinedEventsDelete([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v5ad_accounts/{ad_account_id}/advertiser_defined_events")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdvertiserDefinedEventsDelete");
            return method != null
                ? (await ((Task<AdvertiserDefinedEventsCreate200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConversionsApi_AdvertiserDefinedEventsGet")]
        public async Task<ActionResult<AdvertiserDefinedEventsGet200Response>> _AdvertiserDefinedEventsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/advertiser_defined_events")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdvertiserDefinedEventsGet");
            return method != null
                ? (await ((Task<AdvertiserDefinedEventsGet200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConversionsApi_AdvertiserDefinedEventsUpdate")]
        public async Task<ActionResult<AdvertiserDefinedEventsCreate200Response>> _AdvertiserDefinedEventsUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5ad_accounts/{ad_account_id}/advertiser_defined_events")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdvertiserDefinedEventsUpdate");
            return method != null
                ? (await ((Task<AdvertiserDefinedEventsCreate200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
