{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.UserAccount where

import           Import


-- | List following boards
--
-- Get a list of the boards a user follows. The request returns a board summary object array.
-- operationId: boardsUserFollows/list
getUserAccountFollowingBoardsR :: Handler Value
getUserAccountFollowingBoardsR = notImplemented

-- | Follow user
--
-- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Use this request, as a signed-in user, to follow another user.
-- operationId: followUser/update
postUserAccountFollowingByTextR :: Text -- ^ A valid username
                                -> Handler Value
postUserAccountFollowingByTextR username = notImplemented

-- | List followers
--
-- Get a list of your followers.
-- operationId: followers/list
getUserAccountFollowersR :: Handler Value
getUserAccountFollowersR = notImplemented

-- | List linked businesses
--
-- Get a list of your linked business accounts.
-- operationId: linkedBusinessAccounts/get
getUserAccountBusinessesR :: Handler Value
getUserAccountBusinessesR = notImplemented

-- | Unverify website
--
-- Unverifu a website verified by the signed-in user.
-- operationId: unverifyWebsite/delete
deleteUserAccountWebsitesR :: Handler Value
deleteUserAccountWebsitesR = notImplemented

-- | Get user account analytics
--
-- Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
-- operationId: userAccount/analytics
getUserAccountAnalyticsR :: Handler Value
getUserAccountAnalyticsR = notImplemented

-- | Get user account top pins analytics
--
-- Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
-- operationId: userAccount/analytics/topPins
getUserAccountAnalyticsTopPinsR :: Handler Value
getUserAccountAnalyticsTopPinsR = notImplemented

-- | Get user account top video pins analytics
--
-- Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
-- operationId: userAccount/analytics/topVideoPins
getUserAccountAnalyticsTopVideoPinsR :: Handler Value
getUserAccountAnalyticsTopVideoPinsR = notImplemented

-- | List following interests
--
-- Get a list of a user&#39;s following interests in one place.
-- operationId: userAccount/followedInterests
getUsersByTextInterestsFollowR :: Text -- ^ A valid username
                               -> Handler Value
getUsersByTextInterestsFollowR username = notImplemented

-- | Get user account
--
-- Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/reference/business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
-- operationId: userAccount/get
getUserAccountR :: Handler Value
getUserAccountR = notImplemented

-- | List following
--
-- Get a list of who a certain user follows.
-- operationId: userFollowing/get
getUserAccountFollowingR :: Handler Value
getUserAccountFollowingR = notImplemented

-- | Get user websites
--
-- Get user websites, claimed or not
-- operationId: userWebsites/get
getUserAccountWebsitesR :: Handler Value
getUserAccountWebsitesR = notImplemented

-- | Verify website
--
-- Verify a website as a signed-in user.
-- operationId: verifyWebsite/update
postUserAccountWebsitesR :: Handler Value
postUserAccountWebsitesR = notImplemented

-- | Get user verification code for website claiming
--
-- Get verification code for user to install on the website to claim it.
-- operationId: websiteVerification/get
getUserAccountWebsitesVerificationR :: Handler Value
getUserAccountWebsitesVerificationR = notImplemented
