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
    public partial class OrderLinesApi
    { 
        [FunctionName("OrderLinesApi_OrderLinesGet")]
        public async Task<ActionResult<OrderLine>> _OrderLinesGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/order_lines/{order_line_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")]string orderLineId, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("OrderLinesGet");
            return method != null
                ? (await ((Task<OrderLine>)method.Invoke(this, new object[] { req, context, orderLineId, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("OrderLinesApi_OrderLinesList")]
        public async Task<ActionResult<OrderLinesList200Response>> _OrderLinesList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/order_lines")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("OrderLinesList");
            return method != null
                ? (await ((Task<OrderLinesList200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
