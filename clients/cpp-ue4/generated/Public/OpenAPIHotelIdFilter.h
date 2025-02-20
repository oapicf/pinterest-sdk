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
#include "OpenAPICatalogsProductGroupMultipleStringCriteria.h"

namespace OpenAPI
{

/*
 * OpenAPIHotelIdFilter
 *
 * 
 */
class OPENAPI_API OpenAPIHotelIdFilter : public Model
{
public:
    virtual ~OpenAPIHotelIdFilter() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	OpenAPICatalogsProductGroupMultipleStringCriteria HotelId;
};

}
