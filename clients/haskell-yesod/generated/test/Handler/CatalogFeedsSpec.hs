{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.CatalogFeedsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getCatalogsFeedsByTextProcessingResultsR" $
        it "returns 501 Not Implemented" $ do
            get $ CatalogsFeedsByTextProcessingResultsR "feedId_example"
            statusIs 501

    describe "postCatalogsFeedsR" $
        it "returns 501 Not Implemented" $ do
            post CatalogsFeedsR
            statusIs 501

    describe "deleteCatalogsFeedsByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ CatalogsFeedsByTextR "feedId_example"
            statusIs 501

    describe "getCatalogsFeedsByTextR" $
        it "returns 501 Not Implemented" $ do
            get $ CatalogsFeedsByTextR "feedId_example"
            statusIs 501

    describe "postCatalogsFeedsByTextIngestR" $
        it "returns 501 Not Implemented" $ do
            post $ CatalogsFeedsByTextIngestR "feedId_example"
            statusIs 501

    describe "getCatalogsFeedsR" $
        it "returns 501 Not Implemented" $ do
            get CatalogsFeedsR
            statusIs 501

    describe "patchCatalogsFeedsByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ CatalogsFeedsByTextR "feedId_example"
            statusIs 501

    describe "getCatalogsProcessingResultsByTextItemIssuesR" $
        it "returns 501 Not Implemented" $ do
            get $ CatalogsProcessingResultsByTextItemIssuesR "5224831246441439241"
            statusIs 501
