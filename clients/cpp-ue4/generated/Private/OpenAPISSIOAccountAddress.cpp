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

#include "OpenAPISSIOAccountAddress.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPISSIOAccountAddress::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Display.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("display")); WriteJsonValue(Writer, Display.GetValue());
	}
	if (Purpose.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("purpose")); WriteJsonValue(Writer, Purpose.GetValue());
	}
	if (AddressId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("address_id")); WriteJsonValue(Writer, AddressId.GetValue());
	}
	if (OrderLegalEntity.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("order_legal_entity")); WriteJsonValue(Writer, OrderLegalEntity.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPISSIOAccountAddress::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("display"), Display);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("purpose"), Purpose);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("address_id"), AddressId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("order_legal_entity"), OrderLegalEntity);

	return ParseSuccess;
}

}
