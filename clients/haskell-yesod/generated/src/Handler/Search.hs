{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Search where

import           Import


-- | Search pins by a given search term
--
-- **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get the top 10 Pins by a given search term.
-- operationId: searchPartnerPins
getSearchPartnerPinsR :: Handler Value
getSearchPartnerPinsR = notImplemented

-- | Search user&#39;s boards
--
-- Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.
-- operationId: searchUserBoards/get
getSearchBoardsR :: Handler Value
getSearchBoardsR = notImplemented

-- | Search user&#39;s Pins
--
-- Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.
-- operationId: searchUserPins/list
getSearchPinsR :: Handler Value
getSearchPinsR = notImplemented
