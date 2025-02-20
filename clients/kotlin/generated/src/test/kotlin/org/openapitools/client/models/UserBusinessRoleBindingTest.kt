/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.models.UserBusinessRoleBinding
import org.openapitools.client.models.BusinessAccessUserSummary
import org.openapitools.client.models.BusinessMemberAssetsSummary

class UserBusinessRoleBindingTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UserBusinessRoleBinding
        //val modelInstance = UserBusinessRoleBinding()

        // to test the property `assetsSummary`
        should("test assetsSummary") {
            // uncomment below to test the property
            //modelInstance.assetsSummary shouldBe ("TODO")
        }

        // to test the property `businessRoles` - The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
        should("test businessRoles") {
            // uncomment below to test the property
            //modelInstance.businessRoles shouldBe ("TODO")
        }

        // to test the property `createdByBusiness` - Metadata for the business that created the business relationship.
        should("test createdByBusiness") {
            // uncomment below to test the property
            //modelInstance.createdByBusiness shouldBe ("TODO")
        }

        // to test the property `createdByUser` - Metadata for the user that created the business relationship.
        should("test createdByUser") {
            // uncomment below to test the property
            //modelInstance.createdByUser shouldBe ("TODO")
        }

        // to test the property `createdTime` - The time the business relationship was created. Returned in milliseconds.
        should("test createdTime") {
            // uncomment below to test the property
            //modelInstance.createdTime shouldBe ("TODO")
        }

        // to test the property `id` - Unique identifier of the business member/business partner/employer.
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `isSharedPartner` - This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to.
        should("test isSharedPartner") {
            // uncomment below to test the property
            //modelInstance.isSharedPartner shouldBe ("TODO")
        }

        // to test the property `user` - Metadata for the business member/business partner/employer.
        should("test user") {
            // uncomment below to test the property
            //modelInstance.user shouldBe ("TODO")
        }

    }
}
