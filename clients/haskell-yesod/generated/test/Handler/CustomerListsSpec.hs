{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.CustomerListsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postAdAccountsByTextCustomerListsR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextCustomerListsR "adAccountId_example"
            statusIs 501

    describe "getAdAccountsByTextCustomerListsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextCustomerListsByTextR "adAccountId_example" "customerListId_example"
            statusIs 501

    describe "getAdAccountsByTextCustomerListsR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextCustomerListsR "adAccountId_example"
            statusIs 501

    describe "patchAdAccountsByTextCustomerListsByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ AdAccountsByTextCustomerListsByTextR "adAccountId_example" "customerListId_example"
            statusIs 501
