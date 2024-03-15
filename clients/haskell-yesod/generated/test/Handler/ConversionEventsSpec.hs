{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ConversionEventsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postAdAccountsByTextEventsR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextEventsR "adAccountId_example"
            statusIs 501
