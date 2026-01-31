{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ConversionsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getAdAccountsByTextAdvertiserDefinedEventsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextAdvertiserDefinedEventsR "adAccountId_example"
            statusIs 501
