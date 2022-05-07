{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.UserAccountSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getUserAccountAnalyticsR" $
        it "returns 501 Not Implemented" $ do
            get UserAccountAnalyticsR
            statusIs 501

    describe "getUserAccountR" $
        it "returns 501 Not Implemented" $ do
            get UserAccountR
            statusIs 501
