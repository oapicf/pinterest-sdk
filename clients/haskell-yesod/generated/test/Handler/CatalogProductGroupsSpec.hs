{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.CatalogProductGroupsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getCatalogsProductGroupsByTextProductsR" $
        it "returns 501 Not Implemented" $ do
            get $ CatalogsProductGroupsByTextProductsR "productGroupId_example"
            statusIs 501

    describe "postCatalogsProductGroupsR" $
        it "returns 501 Not Implemented" $ do
            post CatalogsProductGroupsR
            statusIs 501

    describe "postCatalogsProductGroupsMultipleR" $
        it "returns 501 Not Implemented" $ do
            post CatalogsProductGroupsMultipleR
            statusIs 501

    describe "deleteCatalogsProductGroupsByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ CatalogsProductGroupsByTextR "productGroupId_example"
            statusIs 501

    describe "deleteCatalogsProductGroupsMultipleR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" CatalogsProductGroupsMultipleR
            statusIs 501

    describe "getCatalogsProductGroupsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ CatalogsProductGroupsByTextR "productGroupId_example"
            statusIs 501

    describe "getCatalogsProductGroupsR" $
        it "returns 501 Not Implemented" $ do
            get CatalogsProductGroupsR
            statusIs 501

    describe "getCatalogsProductGroupsByTextProductCountsR" $
        it "returns 501 Not Implemented" $ do
            get $ CatalogsProductGroupsByTextProductCountsR "productGroupId_example"
            statusIs 501

    describe "patchCatalogsProductGroupsByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ CatalogsProductGroupsByTextR "productGroupId_example"
            statusIs 501

    describe "postCatalogsProductsGetByProductGroupFiltersR" $
        it "returns 501 Not Implemented" $ do
            post CatalogsProductsGetByProductGroupFiltersR
            statusIs 501
