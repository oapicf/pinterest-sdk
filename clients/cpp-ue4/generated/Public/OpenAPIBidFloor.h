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
 * OpenAPIBidFloor
 *
 * 
 */
class OPENAPI_API OpenAPIBidFloor : public Model
{
public:
    virtual ~OpenAPIBidFloor() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* A list of bid floors in micro currency. For example, [100000, 200000] */
	TOptional<TArray<int32>> BidFloors;
	/* Always the string 'bidfloor' */
	TOptional<FString> Type;
};

}
