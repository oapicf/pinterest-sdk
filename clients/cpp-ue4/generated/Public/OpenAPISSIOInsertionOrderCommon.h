/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * OpenAPI spec version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"

namespace OpenAPI
{

/*
 * OpenAPISSIOInsertionOrderCommon
 *
 * 
 */
class OPENAPI_API OpenAPISSIOInsertionOrderCommon : public Model
{
public:
    virtual ~OpenAPISSIOInsertionOrderCommon() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Starting date of time period. Format: YYYY-MM-DD */
	TOptional<FString> StartDate;
	/* End date of time period. Format: YYYY-MM-DD */
	TOptional<FString> EndDate;
	/* The po number */
	TOptional<FString> PoNumber;
	/* If Budget order line, the budget amount. */
	TOptional<double> BudgetAmount;
	/* The billing contact first name */
	TOptional<FString> BillingContactFirstname;
	/* The billing contact last name */
	TOptional<FString> BillingContactLastname;
	/* The billing contact email */
	TOptional<FString> BillingContactEmail;
	/* The media contact first name */
	TOptional<FString> MediaContactFirstname;
	/* The media contact last name */
	TOptional<FString> MediaContactLastname;
	/* The media contact email */
	TOptional<FString> MediaContactEmail;
	/* URL link for agency */
	TOptional<FString> AgencyLink;
	/* The email of user submitting the insertion order */
	TOptional<FString> UserEmail;
};

}
