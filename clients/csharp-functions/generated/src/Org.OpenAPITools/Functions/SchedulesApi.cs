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
    public partial class SchedulesApi
    { 
        [FunctionName("SchedulesApi_SchedulesCreate")]
        public async Task<ActionResult<List<SchedulesCreate200ResponseInner>>> _SchedulesCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/schedules")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("SchedulesCreate");
            return method != null
                ? (await ((Task<List<SchedulesCreate200ResponseInner>>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SchedulesApi_SchedulesList")]
        public async Task<ActionResult<SchedulesList200Response>> _SchedulesList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/schedules")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("SchedulesList");
            return method != null
                ? (await ((Task<SchedulesList200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("SchedulesApi_SchedulesUpdate")]
        public async Task<ActionResult<List<SchedulesCreate200ResponseInner>>> _SchedulesUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5ad_accounts/{ad_account_id}/schedules")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("SchedulesUpdate");
            return method != null
                ? (await ((Task<List<SchedulesCreate200ResponseInner>>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
