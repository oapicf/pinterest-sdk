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
 * OpenAPIAdvancedAuctionOperationError
 *
 * Error which occurred when applying a bid options operation to a specific item.
 */
class OPENAPI_API OpenAPIAdvancedAuctionOperationError : public Model
{
public:
    virtual ~OpenAPIAdvancedAuctionOperationError() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The error code for the item bid option operation validation error */
	TOptional<int32> Code;
	/* Message describing the item bid option operation validation error */
	TOptional<FString> Message;
};

}
