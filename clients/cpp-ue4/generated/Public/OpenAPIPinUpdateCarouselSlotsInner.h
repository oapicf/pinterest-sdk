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
 * OpenAPIPinUpdateCarouselSlotsInner
 *
 * 
 */
class OPENAPI_API OpenAPIPinUpdateCarouselSlotsInner : public Model
{
public:
    virtual ~OpenAPIPinUpdateCarouselSlotsInner() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Carousel Pin slot title. */
	TOptional<FString> Title;
	/* Carousel Pin slot description. */
	TOptional<FString> Description;
	/* Carousel Pin slot link. */
	TOptional<FString> Link;
};

}
