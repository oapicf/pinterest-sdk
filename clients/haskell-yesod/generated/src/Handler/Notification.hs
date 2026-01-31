{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Notification where

import           Import


-- | Receive notifications from external partners.
--
-- Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests&#39; systems. This API is gated and you need to request access to this feature.
-- operationId: notification/post
postNotificationsR :: Handler Value
postNotificationsR = notImplemented
