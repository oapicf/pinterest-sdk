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
 * OpenAPIRelatedTermsRelatedTermsListInner
 *
 * 
 */
class OPENAPI_API OpenAPIRelatedTermsRelatedTermsListInner : public Model
{
public:
    virtual ~OpenAPIRelatedTermsRelatedTermsListInner() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<FString> Term;
	TOptional<TArray<FString>> RelatedTerms;
};

}
