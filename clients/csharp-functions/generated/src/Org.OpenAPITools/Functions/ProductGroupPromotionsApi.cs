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
    public partial class ProductGroupPromotionsApi
    { 
        [FunctionName("ProductGroupPromotionsApi_ProductGroupPromotionsCreate")]
        public async Task<ActionResult<ProductGroupPromotions>> _ProductGroupPromotionsCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/product_group_promotions")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("ProductGroupPromotionsCreate");
            return method != null
                ? (await ((Task<ProductGroupPromotions>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProductGroupPromotionsApi_ProductGroupPromotionsGet")]
        public async Task<ActionResult<ProductGroupPromotion>> _ProductGroupPromotionsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId, [RegularExpression("^\\d+$")] [MaxLength(18)]string productGroupPromotionId)
        {
            var method = this.GetType().GetMethod("ProductGroupPromotionsGet");
            return method != null
                ? (await ((Task<ProductGroupPromotion>)method.Invoke(this, new object[] { req, context, adAccountId, productGroupPromotionId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProductGroupPromotionsApi_ProductGroupPromotionsList")]
        public async Task<ActionResult<ProductGroupPromotionsList200Response>> _ProductGroupPromotionsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/product_group_promotions")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("ProductGroupPromotionsList");
            return method != null
                ? (await ((Task<ProductGroupPromotionsList200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProductGroupPromotionsApi_ProductGroupPromotionsUpdate")]
        public async Task<ActionResult<ProductGroupPromotions>> _ProductGroupPromotionsUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5ad_accounts/{ad_account_id}/product_group_promotions")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("ProductGroupPromotionsUpdate");
            return method != null
                ? (await ((Task<ProductGroupPromotions>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ProductGroupPromotionsApi_ProductGroupsAnalytics")]
        public async Task<ActionResult<List<ProductGroupAnalyticsItems>>> _ProductGroupsAnalytics([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/product_groups/analytics")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("ProductGroupsAnalytics");
            return method != null
                ? (await ((Task<List<ProductGroupAnalyticsItems>>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
