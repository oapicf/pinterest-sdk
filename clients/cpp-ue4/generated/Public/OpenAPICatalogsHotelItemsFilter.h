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
 * OpenAPICatalogsHotelItemsFilter
 *
 * 
 */
class OPENAPI_API OpenAPICatalogsHotelItemsFilter : public Model
{
public:
    virtual ~OpenAPICatalogsHotelItemsFilter() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	enum class CatalogTypeEnum
	{
		Hotel,
  	};

	static FString EnumToString(const CatalogTypeEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, CatalogTypeEnum& EnumValue);
	CatalogTypeEnum CatalogType;
	TArray<FString> HotelIds;
	/* Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog */
	TOptional<FString> CatalogId;
};

}