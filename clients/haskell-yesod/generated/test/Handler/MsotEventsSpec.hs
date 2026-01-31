{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.MsotEventsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postAdAccountsByTextMsotEventsR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextMsotEventsR "adAccountId_example"
            statusIs 501
