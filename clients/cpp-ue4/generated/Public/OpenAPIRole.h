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
 * OpenAPIRole
 *
 * An internal role type used on business access, EMPLOYEE, ADMIN.
 */
class OPENAPI_API OpenAPIRole : public Model
{
public:
    virtual ~OpenAPIRole() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	enum class Values
	{
		Unknown,
		Owner,
		Admin,
		Analyst,
		SosReader,
		FinanceManager,
		AudienceManager,
		CampaignManager,
		CatalogsManager,
		RestrictedOwner,
		ProfileManager,
		ProfilePublisher,
		ResourcePinnerListOwner,
		ResourcePinnerListReader,
		BizPinnerListSharer,
		ResourceConversionTagsReader,
  	};

	Values Value;

	static FString EnumToString(const Values& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, Values& EnumValue);
};

}