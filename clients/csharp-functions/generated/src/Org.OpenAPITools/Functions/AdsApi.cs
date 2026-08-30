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
    public partial class AdsApi
    { 
        [FunctionName("AdsApi_AdPreviewsCreate")]
        public async Task<ActionResult<AdPreviewURLResponse>> _AdPreviewsCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/ad_previews")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdPreviewsCreate");
            return method != null
                ? (await ((Task<AdPreviewURLResponse>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdsApi_AdTargetingAnalyticsGet")]
        public async Task<ActionResult<MetricsResponse>> _AdTargetingAnalyticsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/ads/targeting_analytics")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdTargetingAnalyticsGet");
            return method != null
                ? (await ((Task<MetricsResponse>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdsApi_AdsAnalytics")]
        public async Task<ActionResult<List<AdsAnalytics>>> _AdsAnalytics([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/ads/analytics")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdsAnalytics");
            return method != null
                ? (await ((Task<List<AdsAnalytics>>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdsApi_AdsCreate")]
        public async Task<ActionResult<AdBatchWriteResponseModel>> _AdsCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/ads")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdsCreate");
            return method != null
                ? (await ((Task<AdBatchWriteResponseModel>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdsApi_AdsGet")]
        public async Task<ActionResult<Ad>> _AdsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/ads/{ad_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adId, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdsGet");
            return method != null
                ? (await ((Task<Ad>)method.Invoke(this, new object[] { req, context, adId, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdsApi_AdsList")]
        public async Task<ActionResult<AdsList200Response>> _AdsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/ads")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdsList");
            return method != null
                ? (await ((Task<AdsList200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdsApi_AdsUpdate")]
        public async Task<ActionResult<AdBatchWriteResponseModel>> _AdsUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5ad_accounts/{ad_account_id}/ads")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdsUpdate");
            return method != null
                ? (await ((Task<AdBatchWriteResponseModel>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdsApi_CampaignAdPreviewCreate")]
        public async Task<ActionResult<List<CampaignAdPreviewCreate200ResponseInner>>> _CampaignAdPreviewCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/campaign_ad_preview")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("CampaignAdPreviewCreate");
            return method != null
                ? (await ((Task<List<CampaignAdPreviewCreate200ResponseInner>>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdsApi_CampaignAdPreviewDelete")]
        public async Task<ActionResult<List<CampaignAdPreviewDelete200ResponseInner>>> _CampaignAdPreviewDelete([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v5ad_accounts/{ad_account_id}/campaign_ad_preview")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("CampaignAdPreviewDelete");
            return method != null
                ? (await ((Task<List<CampaignAdPreviewDelete200ResponseInner>>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("AdsApi_CampaignAdPreviewRead")]
        public async Task<ActionResult<List<CampaignAdPreview>>> _CampaignAdPreviewRead([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/campaign_ad_preview")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("CampaignAdPreviewRead");
            return method != null
                ? (await ((Task<List<CampaignAdPreview>>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
