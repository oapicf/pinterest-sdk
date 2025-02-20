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

#include "OpenAPIUpdateMemberBusinessRoleBody.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIUpdateMemberBusinessRoleBody::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("business_role")); WriteJsonValue(Writer, BusinessRole);
	Writer->WriteIdentifierPrefix(TEXT("member_id")); WriteJsonValue(Writer, MemberId);
	Writer->WriteObjectEnd();
}

bool OpenAPIUpdateMemberBusinessRoleBody::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("business_role"), BusinessRole);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("member_id"), MemberId);

	return ParseSuccess;
}

}
