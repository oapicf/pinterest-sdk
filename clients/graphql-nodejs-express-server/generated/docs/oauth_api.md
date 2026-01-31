# oauth_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OauthConversionToken**](oauth_api.md#OauthConversionToken) | **POST** /oauth/conversion_token | Generate OAuth access token for conversion API
[**OauthToken**](oauth_api.md#OauthToken) | **POST** /oauth/token | Generate OAuth access token
[**TokenRevoke**](oauth_api.md#TokenRevoke) | **POST** /oauth/token/revoke | Revoke a token


<a name="OauthConversionToken"></a>
# **OauthConversionToken**
> ConversionAccessTokenResponse OauthConversionToken()

Generate OAuth access token for conversion API

Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
<a name="OauthToken"></a>
# **OauthToken**
> OauthAccessTokenResponse OauthToken(grantType)

Generate OAuth access token

Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for &lt;a href&#x3D;&#39;/docs/getting-started/set-up-authentication-and-authorization/&#39; target&#x3D;&#39;blank&#39;&gt;requesting and refreshing tokens&lt;/a&gt;.  &lt;strong&gt;Note:&lt;/strong&gt; If your app was created &lt;strong&gt;before September 25, 2025&lt;/strong&gt;, make sure to set the &lt;code&gt;continuous_refresh&lt;/code&gt; parameter to &lt;code&gt;true&lt;/code&gt; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use &lt;a href&#x3D;&#39;/docs/developer-tools/token-debugger/&#39; target&#x3D;&#39;blank&#39;&gt;Token Debugger&lt;/a&gt; to validate and inspect your access token.
<a name="TokenRevoke"></a>
# **TokenRevoke**
> TokenRevoke(token, tokenTypeHint)

Revoke a token

Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
