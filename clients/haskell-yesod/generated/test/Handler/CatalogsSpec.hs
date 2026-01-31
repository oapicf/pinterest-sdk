{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.CatalogsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getCatalogsAvailableFilterValuesR" $
        it "returns 501 Not Implemented" $ do
            get CatalogsAvailableFilterValuesR
            statusIs 501

    describe "postCatalogsR" $
        it "returns 501 Not Implemented" $ do
            post CatalogsR
            statusIs 501

    describe "getCatalogsR" $
        it "returns 501 Not Implemented" $ do
            get CatalogsR
            statusIs 501
