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
    public partial class BillingApi
    { 
        [FunctionName("BillingApi_AdsCreditRedeem")]
        public async Task<ActionResult<AdsCreditRedeem>> _AdsCreditRedeem([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/ads_credit/redeem")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdsCreditRedeem");
            return method != null
                ? (await ((Task<AdsCreditRedeem>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BillingApi_AdsCreditsDiscountsGet")]
        public async Task<ActionResult<AdsCreditsDiscountsGet200Response>> _AdsCreditsDiscountsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/ads_credit/discounts")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("AdsCreditsDiscountsGet");
            return method != null
                ? (await ((Task<AdsCreditsDiscountsGet200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BillingApi_BillingInvoiceDownloadGet")]
        public async Task<ActionResult<BillingInvoiceDownloadResponse>> _BillingInvoiceDownloadGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId, [RegularExpression("^\\d+$")] [MaxLength(18)]string billingInvoiceId)
        {
            var method = this.GetType().GetMethod("BillingInvoiceDownloadGet");
            return method != null
                ? (await ((Task<BillingInvoiceDownloadResponse>)method.Invoke(this, new object[] { req, context, adAccountId, billingInvoiceId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BillingApi_BillingInvoicesGet")]
        public async Task<ActionResult<BillingInvoicesGet200Response>> _BillingInvoicesGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/billing_invoices")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("BillingInvoicesGet");
            return method != null
                ? (await ((Task<BillingInvoicesGet200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BillingApi_BillingProfilesGet")]
        public async Task<ActionResult<BillingProfilesGet200Response>> _BillingProfilesGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/billing_profiles")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("BillingProfilesGet");
            return method != null
                ? (await ((Task<BillingProfilesGet200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BillingApi_SsioAccountsGet")]
        public async Task<ActionResult<SSIOAccount>> _SsioAccountsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/ssio/accounts")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("SsioAccountsGet");
            return method != null
                ? (await ((Task<SSIOAccount>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BillingApi_SsioInsertionOrderCreate")]
        public async Task<ActionResult<SSIOInsertionOrder>> _SsioInsertionOrderCreate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5ad_accounts/{ad_account_id}/ssio/insertion_orders")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("SsioInsertionOrderCreate");
            return method != null
                ? (await ((Task<SSIOInsertionOrder>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BillingApi_SsioInsertionOrderEdit")]
        public async Task<ActionResult<SSIOInsertionOrder>> _SsioInsertionOrderEdit([HttpTrigger(AuthorizationLevel.Anonymous, "Patch", Route = "v5ad_accounts/{ad_account_id}/ssio/insertion_orders")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("SsioInsertionOrderEdit");
            return method != null
                ? (await ((Task<SSIOInsertionOrder>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BillingApi_SsioInsertionOrdersStatusGetByAdAccount")]
        public async Task<ActionResult<SsioInsertionOrdersStatusGetByAdAccount200Response>> _SsioInsertionOrdersStatusGetByAdAccount([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/ssio/insertion_orders/status")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("SsioInsertionOrdersStatusGetByAdAccount");
            return method != null
                ? (await ((Task<SsioInsertionOrdersStatusGetByAdAccount200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BillingApi_SsioInsertionOrdersStatusGetByPinOrderId")]
        public async Task<ActionResult<SSIOInsertionOrderStatusResponse>> _SsioInsertionOrdersStatusGetByPinOrderId([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId, string pinOrderId)
        {
            var method = this.GetType().GetMethod("SsioInsertionOrdersStatusGetByPinOrderId");
            return method != null
                ? (await ((Task<SSIOInsertionOrderStatusResponse>)method.Invoke(this, new object[] { req, context, adAccountId, pinOrderId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("BillingApi_SsioOrderLinesGetByAdAccount")]
        public async Task<ActionResult<SsioOrderLinesGetByAdAccount200Response>> _SsioOrderLinesGetByAdAccount([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5ad_accounts/{ad_account_id}/ssio/order_lines")]HttpRequest req, ExecutionContext context, [RegularExpression("^\\d+$")] [MaxLength(18)]string adAccountId)
        {
            var method = this.GetType().GetMethod("SsioOrderLinesGetByAdAccount");
            return method != null
                ? (await ((Task<SsioOrderLinesGetByAdAccount200Response>)method.Invoke(this, new object[] { req, context, adAccountId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
