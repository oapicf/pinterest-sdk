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
#include "OpenAPIUserSummary.h"

namespace OpenAPI
{

/*
 * OpenAPIFollowersList200Response
 *
 * 
 */
class OPENAPI_API OpenAPIFollowersList200Response : public Model
{
public:
    virtual ~OpenAPIFollowersList200Response() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TArray<OpenAPIUserSummary> Items;
	TOptional<FString> Bookmark;
};

}