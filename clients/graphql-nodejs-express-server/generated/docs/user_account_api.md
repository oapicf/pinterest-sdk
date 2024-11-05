# user_account_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BoardsUserFollowsList**](user_account_api.md#BoardsUserFollowsList) | **GET** /user_account/following/boards | List following boards
[**FollowUserUpdate**](user_account_api.md#FollowUserUpdate) | **POST** /user_account/following/{username} | Follow user
[**FollowersList**](user_account_api.md#FollowersList) | **GET** /user_account/followers | List followers
[**LinkedBusinessAccountsGet**](user_account_api.md#LinkedBusinessAccountsGet) | **GET** /user_account/businesses | List linked businesses
[**UnverifyWebsiteDelete**](user_account_api.md#UnverifyWebsiteDelete) | **DELETE** /user_account/websites | Unverify website
[**UserAccountAnalytics**](user_account_api.md#UserAccountAnalytics) | **GET** /user_account/analytics | Get user account analytics
[**UserAccountAnalyticsTopPins**](user_account_api.md#UserAccountAnalyticsTopPins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics
[**UserAccountAnalyticsTopVideoPins**](user_account_api.md#UserAccountAnalyticsTopVideoPins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics
[**UserAccountFollowedInterests**](user_account_api.md#UserAccountFollowedInterests) | **GET** /users/{username}/interests/follow | List following interests
[**UserAccountGet**](user_account_api.md#UserAccountGet) | **GET** /user_account | Get user account
[**UserFollowingGet**](user_account_api.md#UserFollowingGet) | **GET** /user_account/following | List following
[**UserWebsitesGet**](user_account_api.md#UserWebsitesGet) | **GET** /user_account/websites | Get user websites
[**VerifyWebsiteUpdate**](user_account_api.md#VerifyWebsiteUpdate) | **POST** /user_account/websites | Verify website
[**WebsiteVerificationGet**](user_account_api.md#WebsiteVerificationGet) | **GET** /user_account/websites/verification | Get user verification code for website claiming


<a name="BoardsUserFollowsList"></a>
# **BoardsUserFollowsList**
> BoardsUserFollowsList200Response BoardsUserFollowsList(bookmark, pageSize, explicitFollowing, adAccountId)

List following boards

Get a list of the boards a user follows. The request returns a board summary object array.
<a name="FollowUserUpdate"></a>
# **FollowUserUpdate**
> UserSummary FollowUserUpdate(username, followUserRequest)

Follow user

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Use this request, as a signed-in user, to follow another user.
<a name="FollowersList"></a>
# **FollowersList**
> FollowersList200Response FollowersList(bookmark, pageSize)

List followers

Get a list of your followers.
<a name="LinkedBusinessAccountsGet"></a>
# **LinkedBusinessAccountsGet**
> LinkedBusiness LinkedBusinessAccountsGet()

List linked businesses

Get a list of your linked business accounts.
<a name="UnverifyWebsiteDelete"></a>
# **UnverifyWebsiteDelete**
> UnverifyWebsiteDelete(website)

Unverify website

Unverifu a website verified by the signed-in user.
<a name="UserAccountAnalytics"></a>
# **UserAccountAnalytics**
> AnalyticsMetricsResponse UserAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, splitField, adAccountId)

Get user account analytics

Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
<a name="UserAccountAnalyticsTopPins"></a>
# **UserAccountAnalyticsTopPins**
> TopPinsAnalyticsResponse UserAccountAnalyticsTopPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId)

Get user account top pins analytics

Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
<a name="UserAccountAnalyticsTopVideoPins"></a>
# **UserAccountAnalyticsTopVideoPins**
> TopVideoPinsAnalyticsResponse UserAccountAnalyticsTopVideoPins(startDate, endDate, sortBy, fromClaimedContent, pinFormat, appTypes, contentType, source, metricTypes, numOfPins, createdInLastNDays, adAccountId)

Get user account top video pins analytics

Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
<a name="UserAccountFollowedInterests"></a>
# **UserAccountFollowedInterests**
> UserAccountFollowedInterests200Response UserAccountFollowedInterests(username, bookmark, pageSize)

List following interests

Get a list of a user&#39;s following interests in one place.
<a name="UserAccountGet"></a>
# **UserAccountGet**
> Account UserAccountGet(adAccountId)

Get user account

Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
<a name="UserFollowingGet"></a>
# **UserFollowingGet**
> UserFollowingGet200Response UserFollowingGet(bookmark, pageSize, feedType, explicitFollowing, adAccountId)

List following

Get a list of who a certain user follows.
<a name="UserWebsitesGet"></a>
# **UserWebsitesGet**
> UserWebsitesGet200Response UserWebsitesGet(bookmark, pageSize)

Get user websites

Get user websites, claimed or not
<a name="VerifyWebsiteUpdate"></a>
# **VerifyWebsiteUpdate**
> UserWebsiteSummary VerifyWebsiteUpdate(userWebsiteVerifyRequest, adAccountId)

Verify website

Verify a website as a signed-in user.
<a name="WebsiteVerificationGet"></a>
# **WebsiteVerificationGet**
> UserWebsiteVerificationCode WebsiteVerificationGet(adAccountId)

Get user verification code for website claiming

Get verification code for user to install on the website to claim it.
