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
#include "OpenAPIGetBusinessAssetsResponse.h"

namespace OpenAPI
{

/*
 * OpenAPIBusinessAssetsGet200Response
 *
 * 
 */
class OPENAPI_API OpenAPIBusinessAssetsGet200Response : public Model
{
public:
    virtual ~OpenAPIBusinessAssetsGet200Response() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* List of assets the requesting business has access to. */
	TArray<OpenAPIGetBusinessAssetsResponse> Items;
	TOptional<FString> Bookmark;
};

}
