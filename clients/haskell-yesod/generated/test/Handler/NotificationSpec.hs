{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.NotificationSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postNotificationsR" $
        it "returns 501 Not Implemented" $ do
            post NotificationsR
            statusIs 501
