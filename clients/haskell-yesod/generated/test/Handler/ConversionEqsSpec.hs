{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ConversionEqsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getAdAccountsByTextConversionEqsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextConversionEqsR "adAccountId_example"
            statusIs 501
