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

#include "OpenAPICatalogsHotelGuestRatings.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPICatalogsHotelGuestRatings::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Score.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("score")); WriteJsonValue(Writer, Score.GetValue());
	}
	if (NumberOfReviewers.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("number_of_reviewers")); WriteJsonValue(Writer, NumberOfReviewers.GetValue());
	}
	if (MaxScore.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("max_score")); WriteJsonValue(Writer, MaxScore.GetValue());
	}
	if (RatingSystem.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("rating_system")); WriteJsonValue(Writer, RatingSystem.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPICatalogsHotelGuestRatings::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("score"), Score);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("number_of_reviewers"), NumberOfReviewers);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("max_score"), MaxScore);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("rating_system"), RatingSystem);

	return ParseSuccess;
}

}