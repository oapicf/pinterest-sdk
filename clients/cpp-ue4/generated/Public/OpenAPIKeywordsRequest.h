/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * OpenAPI spec version: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"
#include "OpenAPIKeywordsCommon.h"

namespace OpenAPI
{

/*
 * OpenAPIKeywordsRequest
 *
 * 
 */
class OPENAPI_API OpenAPIKeywordsRequest : public Model
{
public:
    virtual ~OpenAPIKeywordsRequest() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Keyword JSON array. Each array element has 3 fields */
	TArray<OpenAPIKeywordsCommon> Keywords;
	/* Keyword parent entity ID (advertiser, campaign, ad group). */
	FString ParentId;
};

}