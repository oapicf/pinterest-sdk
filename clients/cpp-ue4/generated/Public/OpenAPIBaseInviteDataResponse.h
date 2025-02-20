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
#include "OpenAPIBaseInviteDataResponseInviteData.h"
#include "OpenAPIBusinessAccessUserSummary.h"

namespace OpenAPI
{

/*
 * OpenAPIBaseInviteDataResponse
 *
 * 
 */
class OPENAPI_API OpenAPIBaseInviteDataResponse : public Model
{
public:
    virtual ~OpenAPIBaseInviteDataResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Unique identifier of the invite/request. */
	TOptional<FString> Id;
	TOptional<OpenAPIBaseInviteDataResponseInviteData> InviteData;
	/* Indicates whether the invite/request was received. */
	TOptional<bool> IsReceivedInvite;
	/* Metadata for the member/partner that was sent the invite/request. */
	TOptional<OpenAPIBusinessAccessUserSummary> User;
};

}
