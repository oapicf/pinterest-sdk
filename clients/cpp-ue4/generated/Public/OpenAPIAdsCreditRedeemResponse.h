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

namespace OpenAPI
{

/*
 * OpenAPIAdsCreditRedeemResponse
 *
 * 
 */
class OPENAPI_API OpenAPIAdsCreditRedeemResponse : public Model
{
public:
    virtual ~OpenAPIAdsCreditRedeemResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true). */
	TOptional<bool> Success;
	/* Error code type if error occurs */
	TOptional<int32> ErrorCode;
	/* Reason for failure */
	TOptional<FString> ErrorMessage;
};

}