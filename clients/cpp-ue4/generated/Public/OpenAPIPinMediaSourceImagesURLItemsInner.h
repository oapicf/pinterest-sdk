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
 * OpenAPIPinMediaSourceImagesURLItemsInner
 *
 * 
 */
class OPENAPI_API OpenAPIPinMediaSourceImagesURLItemsInner : public Model
{
public:
    virtual ~OpenAPIPinMediaSourceImagesURLItemsInner() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<FString> Title;
	TOptional<FString> Description;
	/* Destination link for the image. */
	TOptional<FString> Link;
	/* URL of image to upload. */
	FString Url;
};

}