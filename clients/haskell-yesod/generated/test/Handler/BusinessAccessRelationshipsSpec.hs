{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.BusinessAccessRelationshipsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "deleteBusinessesByTextMembersR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ BusinessesByTextMembersR "729090764583391194"
            statusIs 501

    describe "deleteBusinessesByTextPartnersR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ BusinessesByTextPartnersR "729090764583391194"
            statusIs 501

    describe "getBusinessesEmployersR" $
        it "returns 501 Not Implemented" $ do
            get BusinessesEmployersR
            statusIs 501

    describe "getBusinessesByTextMembersR" $
        it "returns 501 Not Implemented" $ do
            get $ BusinessesByTextMembersR "729090764583391194"
            statusIs 501

    describe "getBusinessesByTextPartnersR" $
        it "returns 501 Not Implemented" $ do
            get $ BusinessesByTextPartnersR "729090764583391194"
            statusIs 501

    describe "patchBusinessesByTextMembersR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ BusinessesByTextMembersR "729090764583391194"
            statusIs 501
