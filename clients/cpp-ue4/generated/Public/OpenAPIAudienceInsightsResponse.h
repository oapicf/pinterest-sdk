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
#include "OpenAPIAudienceCategory.h"
#include "OpenAPIAudienceDemographics.h"
#include "OpenAPIAudienceInsightType.h"

namespace OpenAPI
{

/*
 * OpenAPIAudienceInsightsResponse
 *
 * Audience interests and demographics.
 */
class OPENAPI_API OpenAPIAudienceInsightsResponse : public Model
{
public:
    virtual ~OpenAPIAudienceInsightsResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Category interest distribution */
	TOptional<TArray<OpenAPIAudienceCategory>> Categories;
	TOptional<OpenAPIAudienceDemographics> Demographics;
	TOptional<OpenAPIAudienceInsightType> Type;
	/* Generation date */
	TOptional<FString> Date;
	/* Population count. */
	TOptional<int32> Size;
	/* Indicates whether the audience size has been rounded up to the next highest upper boundary. */
	TOptional<bool> SizeIsUpperBound;
};

}