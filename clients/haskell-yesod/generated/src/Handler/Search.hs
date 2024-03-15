{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Search where

import           Import


-- | Search pins by a given search term
--
-- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get the top 10 Pins by a given search term.
-- operationId: searchPartnerPins
getSearchPartnerPinsR :: Handler Value
getSearchPartnerPinsR = notImplemented

-- | Search user&#39;s boards
--
-- Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/reference/business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
-- operationId: searchUserBoards/get
getSearchBoardsR :: Handler Value
getSearchBoardsR = notImplemented

-- | Search user&#39;s Pins
--
-- Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/reference/business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
-- operationId: searchUserPins/list
getSearchPinsR :: Handler Value
getSearchPinsR = notImplemented
