/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * OpenAPI spec version: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"
#include "OpenAPICurrency.h"

namespace OpenAPI
{

/*
 * OpenAPISSIOOrderLine
 *
 * 
 */
class OPENAPI_API OpenAPISSIOOrderLine : public Model
{
public:
    virtual ~OpenAPISSIOOrderLine() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* OrderLineId in SFDC */
	TOptional<FString> SalesforceOrderLineId;
	/* Ads manager OrderLineId */
	TOptional<FString> AdsManagerOrderLineId;
	/* The pin order id associated with the order line in SFDC */
	TOptional<FString> PinOrderId;
	/* Last modified date. */
	TOptional<FString> LastModifiedDateTime;
	/* Start date of the order line. */
	TOptional<FDateTime> StartDate;
	/* End date of the order line. */
	TOptional<FDateTime> EndDate;
	/* Bill To Company name */
	TOptional<FString> BillToCompanyName;
	/* Billing contact first name */
	TOptional<FString> BillingContactFirstname;
	/* Billing contact last name */
	TOptional<FString> BillingContactLastname;
	/* Billing contact email */
	TOptional<FString> BillingContactEmail;
	/* Billing media email */
	TOptional<FString> MediaContactEmail;
	/* Billing contact first name */
	TOptional<FString> MediaContactFirstname;
	/* Billing contact first name */
	TOptional<FString> MediaContactLastname;
	TOptional<OpenAPICurrency> CurrencyInfo;
	/* Agency link */
	TOptional<FString> AgencyLink;
	/* The po number */
	TOptional<FString> PoNumber;
	/* The order name */
	TOptional<FString> OrderName;
	/* The Pinterest marketing partner name */
	TOptional<FString> PmpName;
	/* The SFDC id for the terms */
	TOptional<FString> AcceptedTermsId;
	/* The UTC timestamp (to the nearest sec) of when terms were accepted */
	TOptional<FString> AcceptedTermsTime;
	/* If Budget order line, the budget amount. */
	TOptional<double> BudgetAmount;
	/* If Ongoing (perpetual) order line, the estimated monthly spend */
	TOptional<double> EstimatedMonthlySpend;
};

}