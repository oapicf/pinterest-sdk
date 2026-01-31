{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Oauth where

import           Import


-- | Generate OAuth access token for conversion API
--
-- Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.
-- operationId: oauth/conversionToken
postOauthConversionTokenR :: Handler Value
postOauthConversionTokenR = notImplemented

-- | Generate OAuth access token
--
-- Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for &lt;a href&#x3D;&#39;/docs/getting-started/set-up-authentication-and-authorization/&#39; target&#x3D;&#39;blank&#39;&gt;requesting and refreshing tokens&lt;/a&gt;.  &lt;strong&gt;Note:&lt;/strong&gt; If your app was created &lt;strong&gt;before September 25, 2025&lt;/strong&gt;, make sure to set the &lt;code&gt;continuous_refresh&lt;/code&gt; parameter to &lt;code&gt;true&lt;/code&gt; to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use &lt;a href&#x3D;&#39;/docs/developer-tools/token-debugger/&#39; target&#x3D;&#39;blank&#39;&gt;Token Debugger&lt;/a&gt; to validate and inspect your access token.
-- operationId: oauth/token
postOauthTokenR :: Handler Value
postOauthTokenR = notImplemented

-- | Revoke a token
--
-- Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.
-- operationId: token/revoke
postOauthTokenRevokeR :: Handler Value
postOauthTokenRevokeR = notImplemented
