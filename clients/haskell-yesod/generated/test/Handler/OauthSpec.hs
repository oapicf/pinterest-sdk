{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.OauthSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postOauthConversionTokenR" $
        it "returns 501 Not Implemented" $ do
            post OauthConversionTokenR
            statusIs 501

    describe "postOauthTokenR" $
        it "returns 501 Not Implemented" $ do
            post OauthTokenR
            statusIs 501

    describe "postOauthTokenRevokeR" $
        it "returns 501 Not Implemented" $ do
            post OauthTokenRevokeR
            statusIs 501
