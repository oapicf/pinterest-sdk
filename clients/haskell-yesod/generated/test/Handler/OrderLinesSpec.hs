{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.OrderLinesSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getAdAccountsByTextOrderLinesByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextOrderLinesByTextR "orderLineId_example" "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextOrderLinesR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextOrderLinesR "adAccountId_example"
            statusIs 501
