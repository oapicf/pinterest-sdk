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
#include "OpenAPIAudienceDemographicValue.h"

namespace OpenAPI
{

/*
 * OpenAPIAudienceDemographics
 *
 * Audience demographics
 */
class OPENAPI_API OpenAPIAudienceDemographics : public Model
{
public:
    virtual ~OpenAPIAudienceDemographics() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Ages distribution. */
	TOptional<TArray<OpenAPIAudienceDemographicValue>> Ages;
	/* Gender distribution. */
	TOptional<TArray<OpenAPIAudienceDemographicValue>> Genders;
	/* Device usage distribution. */
	TOptional<TArray<OpenAPIAudienceDemographicValue>> Devices;
	/* Geographic metro area distribution. */
	TOptional<TArray<OpenAPIAudienceDemographicValue>> Metros;
	/* Country area distribution. */
	TOptional<TArray<OpenAPIAudienceDemographicValue>> Countries;
};

}
