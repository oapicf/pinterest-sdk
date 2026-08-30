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
    public partial class UserAccountApi
    { 
        [FunctionName("UserAccountApi_BoardsUserFollowsList")]
        public async Task<ActionResult<BoardsList200Response>> _BoardsUserFollowsList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5user_account/following/boards")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("BoardsUserFollowsList");
            return method != null
                ? (await ((Task<BoardsList200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UserAccountApi_FollowUserUpdate")]
        public async Task<ActionResult<FollowUser>> _FollowUserUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5user_account/following/{username}")]HttpRequest req, ExecutionContext context, [RegularExpression("(?!^\\d+$)^.+$")]string username)
        {
            var method = this.GetType().GetMethod("FollowUserUpdate");
            return method != null
                ? (await ((Task<FollowUser>)method.Invoke(this, new object[] { req, context, username })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UserAccountApi_FollowersList")]
        public async Task<ActionResult<FollowersList200Response>> _FollowersList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5user_account/followers")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("FollowersList");
            return method != null
                ? (await ((Task<FollowersList200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UserAccountApi_LinkedBusinessAccountsGet")]
        public async Task<ActionResult<List<LinkedBusiness>>> _LinkedBusinessAccountsGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5user_account/businesses")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("LinkedBusinessAccountsGet");
            return method != null
                ? (await ((Task<List<LinkedBusiness>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UserAccountApi_UnverifyWebsiteDelete")]
        public async Task<ActionResult<UserWebsite>> _UnverifyWebsiteDelete([HttpTrigger(AuthorizationLevel.Anonymous, "Delete", Route = "v5user_account/websites")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UnverifyWebsiteDelete");
            return method != null
                ? (await ((Task<UserWebsite>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UserAccountApi_UserAccountAnalytics")]
        public async Task<ActionResult<Dictionary<string, AnalyticsMetricsResponse>>> _UserAccountAnalytics([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5user_account/analytics")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UserAccountAnalytics");
            return method != null
                ? (await ((Task<Dictionary<string, AnalyticsMetricsResponse>>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UserAccountApi_UserAccountAnalyticsTopPins")]
        public async Task<ActionResult<TopPinsAnalyticsResponse>> _UserAccountAnalyticsTopPins([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5user_account/analytics/top_pins")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UserAccountAnalyticsTopPins");
            return method != null
                ? (await ((Task<TopPinsAnalyticsResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UserAccountApi_UserAccountAnalyticsTopVideoPins")]
        public async Task<ActionResult<TopVideoPinsAnalyticsResponse>> _UserAccountAnalyticsTopVideoPins([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5user_account/analytics/top_video_pins")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UserAccountAnalyticsTopVideoPins");
            return method != null
                ? (await ((Task<TopVideoPinsAnalyticsResponse>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UserAccountApi_UserAccountFollowedInterests")]
        public async Task<ActionResult<UserAccountFollowedInterests200Response>> _UserAccountFollowedInterests([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5users/{username}/interests/follow")]HttpRequest req, ExecutionContext context, [RegularExpression("(?!^\\d+$)^.+$")]string username)
        {
            var method = this.GetType().GetMethod("UserAccountFollowedInterests");
            return method != null
                ? (await ((Task<UserAccountFollowedInterests200Response>)method.Invoke(this, new object[] { req, context, username })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UserAccountApi_UserAccountGet")]
        public async Task<ActionResult<Account>> _UserAccountGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5user_account")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UserAccountGet");
            return method != null
                ? (await ((Task<Account>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UserAccountApi_UserFollowingGet")]
        public async Task<ActionResult<FollowersList200Response>> _UserFollowingGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5user_account/following")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UserFollowingGet");
            return method != null
                ? (await ((Task<FollowersList200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UserAccountApi_UserWebsitesGet")]
        public async Task<ActionResult<UserWebsitesGet200Response>> _UserWebsitesGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5user_account/websites")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("UserWebsitesGet");
            return method != null
                ? (await ((Task<UserWebsitesGet200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UserAccountApi_VerifyWebsiteUpdate")]
        public async Task<ActionResult<UserWebsite>> _VerifyWebsiteUpdate([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "v5user_account/websites")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("VerifyWebsiteUpdate");
            return method != null
                ? (await ((Task<UserWebsite>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UserAccountApi_WebsiteVerificationGet")]
        public async Task<ActionResult<UserWebsiteVerification>> _WebsiteVerificationGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v5user_account/websites/verification")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("WebsiteVerificationGet");
            return method != null
                ? (await ((Task<UserWebsiteVerification>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
