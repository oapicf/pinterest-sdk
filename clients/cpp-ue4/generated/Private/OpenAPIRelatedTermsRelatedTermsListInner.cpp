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

#include "OpenAPIRelatedTermsRelatedTermsListInner.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIRelatedTermsRelatedTermsListInner::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Term.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("term")); WriteJsonValue(Writer, Term.GetValue());
	}
	if (RelatedTerms.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("related_terms")); WriteJsonValue(Writer, RelatedTerms.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIRelatedTermsRelatedTermsListInner::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("term"), Term);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("related_terms"), RelatedTerms);

	return ParseSuccess;
}

}
