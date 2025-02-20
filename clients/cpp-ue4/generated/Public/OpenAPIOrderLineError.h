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

namespace OpenAPI
{

/*
 * OpenAPIOrderLineError
 *
 * 
 */
class OPENAPI_API OpenAPIOrderLineError : public Model
{
public:
    virtual ~OpenAPIOrderLineError() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<OpenAPIOrderLine> Data;
	TOptional<TArray<FString>> ErrorMessages;
};

}
