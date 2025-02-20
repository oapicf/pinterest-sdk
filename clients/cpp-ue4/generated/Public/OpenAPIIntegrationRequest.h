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
 * OpenAPIIntegrationRequest
 *
 * Schema used for creating the integration metadata.
 */
class OPENAPI_API OpenAPIIntegrationRequest : public Model
{
public:
    virtual ~OpenAPIIntegrationRequest() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* External business ID for the integration. */
	TOptional<FString> ExternalBusinessId;
	TOptional<FString> ConnectedMerchantId;
	TOptional<FString> ConnectedAdvertiserId;
	TOptional<FString> ConnectedLbaId;
	TOptional<FString> ConnectedTagId;
	TOptional<FString> PartnerAccessToken;
	TOptional<FString> PartnerRefreshToken;
	TOptional<FString> PartnerPrimaryEmail;
	TOptional<int32> PartnerAccessTokenExpiry;
	TOptional<int32> PartnerRefreshTokenExpiry;
	TOptional<FString> Scopes;
	TOptional<FString> AdditionalId1;
	TOptional<FString> PartnerMetadata;
};

}
