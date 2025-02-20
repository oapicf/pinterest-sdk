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
#include "OpenAPIOrderLine.h"
#include "OpenAPIOrderLineError.h"

namespace OpenAPI
{

/*
 * OpenAPIOrderLineResponse
 *
 * 
 */
class OPENAPI_API OpenAPIOrderLineResponse : public Model
{
public:
    virtual ~OpenAPIOrderLineResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Error list if update(s) fail. */
	TOptional<TArray<OpenAPIOrderLineError>> Errors;
	/* Order Line object array. */
	TOptional<TArray<OpenAPIOrderLine>> OrderLine;
};

}
