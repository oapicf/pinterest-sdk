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

#include "OpenAPICatalogsVerticalFeedsUpdateRequest.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPICatalogsVerticalFeedsUpdateRequest::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (DefaultCurrency.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("default_currency")); WriteJsonValue(Writer, DefaultCurrency.GetValue());
	}
	if (Name.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("name")); WriteJsonValue(Writer, Name.GetValue());
	}
	if (Format.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("format")); WriteJsonValue(Writer, Format.GetValue());
	}
	if (Credentials.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("credentials")); WriteJsonValue(Writer, Credentials.GetValue());
	}
	if (Location.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("location")); WriteJsonValue(Writer, Location.GetValue());
	}
	if (PreferredProcessingSchedule.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("preferred_processing_schedule")); WriteJsonValue(Writer, PreferredProcessingSchedule.GetValue());
	}
	if (Status.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("status")); WriteJsonValue(Writer, Status.GetValue());
	}
	Writer->WriteIdentifierPrefix(TEXT("catalog_type")); WriteJsonValue(Writer, CatalogType);
	if (DefaultAvailability.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("default_availability")); WriteJsonValue(Writer, DefaultAvailability.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPICatalogsVerticalFeedsUpdateRequest::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("default_currency"), DefaultCurrency);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("name"), Name);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("format"), Format);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("credentials"), Credentials);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("location"), Location);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("preferred_processing_schedule"), PreferredProcessingSchedule);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("status"), Status);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("catalog_type"), CatalogType);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("default_availability"), DefaultAvailability);

	return ParseSuccess;
}

}