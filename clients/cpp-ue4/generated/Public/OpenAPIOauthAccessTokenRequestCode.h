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
 * OpenAPIOauthAccessTokenRequestCode
 *
 * A request to exchange an authorization code for an access token.
 */
class OPENAPI_API OpenAPIOauthAccessTokenRequestCode : public Model
{
public:
    virtual ~OpenAPIOauthAccessTokenRequestCode() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	enum class GrantTypeEnum
	{
		AuthorizationCode,
		RefreshToken,
		ClientCredentials,
  	};

	static FString EnumToString(const GrantTypeEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, GrantTypeEnum& EnumValue);
	GrantTypeEnum GrantType;
	FString Code;
	FString RedirectUri;
};

}
