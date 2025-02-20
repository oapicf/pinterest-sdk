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
#include "OpenAPIInviteAssetsSummaryAdAccountsInner.h"
#include "OpenAPIInviteAssetsSummaryProfilesInner.h"

namespace OpenAPI
{

/*
 * OpenAPIInviteAssetsSummary
 *
 * Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 */
class OPENAPI_API OpenAPIInviteAssetsSummary : public Model
{
public:
    virtual ~OpenAPIInviteAssetsSummary() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* List of ad account IDs and respective permission levels that will be assigned. */
	TOptional<TArray<OpenAPIInviteAssetsSummaryAdAccountsInner>> AdAccounts;
	/* List of profile IDs and respective permission levels that will be assigned. */
	TOptional<TArray<OpenAPIInviteAssetsSummaryProfilesInner>> Profiles;
};

}
