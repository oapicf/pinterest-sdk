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
    public partial class CampaignsApi
    { 
        [FunctionName("CampaignsApi_AdPinsAnalytics")]
        public async Task<ActionResult<List<AdPinAnalytics>>> _AdPinsAnalytics([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/pins/analytics")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdPinsAnalytics");
            return method != null
                ? (await ((Task<List<AdPinAnalytics>>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CampaignsApi_CampaignTargetingAnalyticsGet")]
        public async Task<ActionResult<MetricsResponse>> _CampaignTargetingAnalyticsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/campaigns/targeting_analytics")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("CampaignTargetingAnalyticsGet");
            return method != null
                ? (await ((Task<MetricsResponse>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CampaignsApi_CampaignsAnalytics")]
        public async Task<ActionResult<List<CampaignsAnalyticsMetrics>>> _CampaignsAnalytics([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/campaigns/analytics")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("CampaignsAnalytics");
            return method != null
                ? (await ((Task<List<CampaignsAnalyticsMetrics>>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CampaignsApi_CampaignsCreate")]
        public async Task<ActionResult<CampaignBatchWriteResponseModel>> _CampaignsCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/campaigns")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("CampaignsCreate");
            return method != null
                ? (await ((Task<CampaignBatchWriteResponseModel>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CampaignsApi_CampaignsGet")]
        public async Task<ActionResult<Campaign>> _CampaignsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/campaigns/{campaign_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string campaignId, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("CampaignsGet");
            return method != null
                ? (await ((Task<Campaign>)method.Invoke(this, new object[] { req, context, campaignId, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CampaignsApi_CampaignsList")]
        public async Task<ActionResult<CampaignsList200Response>> _CampaignsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/campaigns")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("CampaignsList");
            return method != null
                ? (await ((Task<CampaignsList200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CampaignsApi_CampaignsUpdate")]
        public async Task<ActionResult<CampaignBatchWriteResponseModel>> _CampaignsUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5ad_accounts/{ad_account_id}/campaigns")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("CampaignsUpdate");
            return method != null
                ? (await ((Task<CampaignBatchWriteResponseModel>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("CampaignsApi_GetCampaignDeliveryEstimates")]
        public async Task<ActionResult<CampaignDeliveryEstimatesResponse>> _GetCampaignDeliveryEstimates([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/campaigns/delivery_estimates")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("GetCampaignDeliveryEstimates");
            return method != null
                ? (await ((Task<CampaignDeliveryEstimatesResponse>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
