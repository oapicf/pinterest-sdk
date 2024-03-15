{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.ProductGroupsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getAdAccountsByTextProductGroupsCatalogsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextProductGroupsCatalogsR "adAccountId_example"
            statusIs 501
