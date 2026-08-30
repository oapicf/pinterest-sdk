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
    public partial class LeadAdsApi
    { 
        [FunctionName("LeadAdsApi_AdAccountsSubscriptionsDelById")]
        public async Task<ActionResult<LeadSubscription>> _AdAccountsSubscriptionsDelById([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v5ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId, [RegularExpression("^\\d+$")]string subscriptionId)
        {
            var method = this.GetType().GetMethod("AdAccountsSubscriptionsDelById");
            return method != null
                ? (await ((Task<LeadSubscription>)method.Invoke(this, new object[] { req, context, adAccountId, subscriptionId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LeadAdsApi_AdAccountsSubscriptionsGetById")]
        public async Task<ActionResult<LeadSubscription>> _AdAccountsSubscriptionsGetById([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId, [RegularExpression("^\\d+$")]string subscriptionId)
        {
            var method = this.GetType().GetMethod("AdAccountsSubscriptionsGetById");
            return method != null
                ? (await ((Task<LeadSubscription>)method.Invoke(this, new object[] { req, context, adAccountId, subscriptionId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LeadAdsApi_AdAccountsSubscriptionsGetList")]
        public async Task<ActionResult<AdAccountsSubscriptionsGetList200Response>> _AdAccountsSubscriptionsGetList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/leads/subscriptions")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdAccountsSubscriptionsGetList");
            return method != null
                ? (await ((Task<AdAccountsSubscriptionsGetList200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("LeadAdsApi_AdAccountsSubscriptionsPost")]
        public async Task<ActionResult<LeadSubscription>> _AdAccountsSubscriptionsPost([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/leads/subscriptions")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdAccountsSubscriptionsPost");
            return method != null
                ? (await ((Task<LeadSubscription>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
