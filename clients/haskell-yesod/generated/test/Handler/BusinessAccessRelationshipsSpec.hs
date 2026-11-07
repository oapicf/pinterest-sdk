{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.BusinessAccessRelationshipsSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "postBusinessAccessBusinessHierarchyByTextBrandAccountsR" $
        it "returns 501 Not Implemented" $ do
            post $ BusinessAccessBusinessHierarchyByTextBrandAccountsR "businessHierarchyId_example"
            statusIs 501

    describe "patchBusinessAccessBusinessHierarchyByTextBrandAccountsByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ BusinessAccessBusinessHierarchyByTextBrandAccountsByTextR "brandAccountId_example" "businessHierarchyId_example"
            statusIs 501

    describe "deleteBusinessesByTextMembersR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ BusinessesByTextMembersR "businessId_example"
            statusIs 501

    describe "deleteBusinessesByTextPartnersR" $
        it "returns 501 Not Implemented" $ do
            performMethod "DELETE" $ BusinessesByTextPartnersR "businessId_example"
            statusIs 501

    describe "getBusinessesEmployersR" $
        it "returns 501 Not Implemented" $ do
            get BusinessesEmployersR
            statusIs 501

    describe "getBusinessesByTextMembersR" $
        it "returns 501 Not Implemented" $ do
            get $ BusinessesByTextMembersR "businessId_example"
            statusIs 501

    describe "getBusinessesByTextPartnersR" $
        it "returns 501 Not Implemented" $ do
            get $ BusinessesByTextPartnersR "businessId_example"
            statusIs 501

    describe "patchBusinessesByTextSystemUsersByTextR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ BusinessesByTextSystemUsersByTextR "businessId_example" "systemUserId_example"
            statusIs 501

    describe "patchBusinessesByTextMembersR" $
        it "returns 501 Not Implemented" $ do
            performMethod "PATCH" $ BusinessesByTextMembersR "businessId_example"
            statusIs 501
