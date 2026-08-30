{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.CatalogSupplementalSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postCatalogsByTextLocalInventoryItemsQueryR" $
        it "returns 501 Not Implemented" $ do
            post $ CatalogsByTextLocalInventoryItemsQueryR "catalogId_example"
            statusIs 501

    describe "postCatalogsByTextLocalInventoryItemsBatchR" $
        it "returns 501 Not Implemented" $ do
            post $ CatalogsByTextLocalInventoryItemsBatchR "catalogId_example"
            statusIs 501

    describe "postCatalogsByTextLocalStoresR" $
        it "returns 501 Not Implemented" $ do
            post $ CatalogsByTextLocalStoresR "catalogId_example"
            statusIs 501

    describe "deleteCatalogsByTextLocalStoresR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ CatalogsByTextLocalStoresR "catalogId_example"
            statusIs 501

    describe "getCatalogsByTextLocalStoresR" $
        it "returns 501 Not Implemented" $ do
            get $ CatalogsByTextLocalStoresR "catalogId_example"
            statusIs 501

    describe "patchCatalogsByTextLocalStoresR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ CatalogsByTextLocalStoresR "catalogId_example"
            statusIs 501

    describe "getCatalogsByTextSupplementalItemsBatchByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ CatalogsByTextSupplementalItemsBatchByTextR "catalogId_example" "batchId_example"
            statusIs 501
