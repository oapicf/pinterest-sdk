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

import org.openapitools.client.models.SSIOCreateInsertionOrderRequest
import org.openapitools.client.models.Currency

class SSIOCreateInsertionOrderRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of SSIOCreateInsertionOrderRequest
        //val modelInstance = SSIOCreateInsertionOrderRequest()

        // to test the property `startDate` - Starting date of time period. Format: YYYY-MM-DD
        should("test startDate") {
            // uncomment below to test the property
            //modelInstance.startDate shouldBe ("TODO")
        }

        // to test the property `poNumber` - The po number
        should("test poNumber") {
            // uncomment below to test the property
            //modelInstance.poNumber shouldBe ("TODO")
        }

        // to test the property `billingContactFirstname` - The billing contact first name
        should("test billingContactFirstname") {
            // uncomment below to test the property
            //modelInstance.billingContactFirstname shouldBe ("TODO")
        }

        // to test the property `billingContactLastname` - The billing contact last name
        should("test billingContactLastname") {
            // uncomment below to test the property
            //modelInstance.billingContactLastname shouldBe ("TODO")
        }

        // to test the property `billingContactEmail` - The billing contact email
        should("test billingContactEmail") {
            // uncomment below to test the property
            //modelInstance.billingContactEmail shouldBe ("TODO")
        }

        // to test the property `mediaContactFirstname` - The media contact first name
        should("test mediaContactFirstname") {
            // uncomment below to test the property
            //modelInstance.mediaContactFirstname shouldBe ("TODO")
        }

        // to test the property `mediaContactLastname` - The media contact last name
        should("test mediaContactLastname") {
            // uncomment below to test the property
            //modelInstance.mediaContactLastname shouldBe ("TODO")
        }

        // to test the property `mediaContactEmail` - The media contact email
        should("test mediaContactEmail") {
            // uncomment below to test the property
            //modelInstance.mediaContactEmail shouldBe ("TODO")
        }

        // to test the property `pmpId` - The pmp id
        should("test pmpId") {
            // uncomment below to test the property
            //modelInstance.pmpId shouldBe ("TODO")
        }

        // to test the property `orderName` - The order name
        should("test orderName") {
            // uncomment below to test the property
            //modelInstance.orderName shouldBe ("TODO")
        }

        // to test the property `orderLineType` - Type can be Budget or Perpetual
        should("test orderLineType") {
            // uncomment below to test the property
            //modelInstance.orderLineType shouldBe ("TODO")
        }

        // to test the property `acceptedTermsId` - The SFDC id for the terms
        should("test acceptedTermsId") {
            // uncomment below to test the property
            //modelInstance.acceptedTermsId shouldBe ("TODO")
        }

        // to test the property `billtoCompanyId` - The bill-to company id
        should("test billtoCompanyId") {
            // uncomment below to test the property
            //modelInstance.billtoCompanyId shouldBe ("TODO")
        }

        // to test the property `billtoBusinessAddressId` - The bill-to business address id
        should("test billtoBusinessAddressId") {
            // uncomment below to test the property
            //modelInstance.billtoBusinessAddressId shouldBe ("TODO")
        }

        // to test the property `billtoBillingAddressId` - The bill-to billing address id
        should("test billtoBillingAddressId") {
            // uncomment below to test the property
            //modelInstance.billtoBillingAddressId shouldBe ("TODO")
        }

        // to test the property `currencyInfo`
        should("test currencyInfo") {
            // uncomment below to test the property
            //modelInstance.currencyInfo shouldBe ("TODO")
        }

        // to test the property `endDate` - End date of time period. Format: YYYY-MM-DD
        should("test endDate") {
            // uncomment below to test the property
            //modelInstance.endDate shouldBe ("TODO")
        }

        // to test the property `budgetAmount` - If Budget order line, the budget amount.
        should("test budgetAmount") {
            // uncomment below to test the property
            //modelInstance.budgetAmount shouldBe ("TODO")
        }

        // to test the property `agencyLink` - URL link for agency
        should("test agencyLink") {
            // uncomment below to test the property
            //modelInstance.agencyLink shouldBe ("TODO")
        }

        // to test the property `userEmail` - The email of user submitting the insertion order
        should("test userEmail") {
            // uncomment below to test the property
            //modelInstance.userEmail shouldBe ("TODO")
        }

        // to test the property `acceptedTermsTime` - The UTC timestamp (to the nearest sec) of when terms were accepted
        should("test acceptedTermsTime") {
            // uncomment below to test the property
            //modelInstance.acceptedTermsTime shouldBe ("TODO")
        }

        // to test the property `estimatedMonthlySpend` - If Ongoing (perpetual) order line, the estimated monthly spend
        should("test estimatedMonthlySpend") {
            // uncomment below to test the property
            //modelInstance.estimatedMonthlySpend shouldBe ("TODO")
        }

    }
}