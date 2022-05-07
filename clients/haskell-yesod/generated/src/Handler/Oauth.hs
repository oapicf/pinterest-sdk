{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Oauth where

import           Import


-- | Generate OAuth access token
--
-- Generate an OAuth access token by using an authorization code or a refresh token.  See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Authentication&#39;&gt;Authentication&lt;/a&gt; for more.
-- operationId: oauth/token
postOauthTokenR :: Handler Value
postOauthTokenR = notImplemented
