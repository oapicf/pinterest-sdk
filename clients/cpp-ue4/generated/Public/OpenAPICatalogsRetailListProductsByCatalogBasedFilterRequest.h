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
#include "OpenAPICatalogsLocale.h"
#include "OpenAPICatalogsProductGroupFilters.h"
#include "OpenAPICountry.h"

namespace OpenAPI
{

/*
 * OpenAPICatalogsRetailListProductsByCatalogBasedFilterRequest
 *
 * Request object to list products for a given retail catalog_id and product group filter.
 */
class OPENAPI_API OpenAPICatalogsRetailListProductsByCatalogBasedFilterRequest : public Model
{
public:
    virtual ~OpenAPICatalogsRetailListProductsByCatalogBasedFilterRequest() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	enum class CatalogTypeEnum
	{
		Retail,
  	};

	static FString EnumToString(const CatalogTypeEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, CatalogTypeEnum& EnumValue);
	/* Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. */
	CatalogTypeEnum CatalogType;
	/* Catalog id pertaining to the retail product group. */
	FString CatalogId;
	OpenAPICatalogsProductGroupFilters Filters;
	OpenAPICountry Country;
	OpenAPICatalogsLocale Locale;
};

}
