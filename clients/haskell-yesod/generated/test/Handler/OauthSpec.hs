{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.OauthSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postOauthTokenR" $
        it "returns 501 Not Implemented" $ do
            post OauthTokenR
            statusIs 501
