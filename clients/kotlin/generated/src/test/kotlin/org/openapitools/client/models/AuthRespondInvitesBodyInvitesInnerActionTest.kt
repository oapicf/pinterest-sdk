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

import org.openapitools.client.models.AuthRespondInvitesBodyInvitesInnerAction
import org.openapitools.client.models.Permissions

class AuthRespondInvitesBodyInvitesInnerActionTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of AuthRespondInvitesBodyInvitesInnerAction
        //val modelInstance = AuthRespondInvitesBodyInvitesInnerAction()

        // to test the property `acceptInvite` - Whether the invite/request is accepted.
        should("test acceptInvite") {
            // uncomment below to test the property
            //modelInstance.acceptInvite shouldBe ("TODO")
        }

        // to test the property `assetIdToPermissions` - An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
        should("test assetIdToPermissions") {
            // uncomment below to test the property
            //modelInstance.assetIdToPermissions shouldBe ("TODO")
        }

    }
}
