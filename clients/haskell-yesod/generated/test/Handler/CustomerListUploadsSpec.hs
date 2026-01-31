{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.CustomerListUploadsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postAdAccountsByTextCustomerListsByTextUploadsR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextCustomerListsByTextUploadsR "adAccountId_example" "customerListId_example"
            statusIs 501

    describe "getAdAccountsByTextCustomerListsByTextUploadsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ AdAccountsByTextCustomerListsByTextUploadsByTextR "adAccountId_example" "customerListId_example" "customerListUploadId_example"
            statusIs 501

    describe "postAdAccountsByTextCustomerListsByTextUploadsByTextRunR" $
        it "returns 501 Not Implemented" $ do
            post $ AdAccountsByTextCustomerListsByTextUploadsByTextRunR "adAccountId_example" "customerListId_example" "customerListUploadId_example"
            statusIs 501
