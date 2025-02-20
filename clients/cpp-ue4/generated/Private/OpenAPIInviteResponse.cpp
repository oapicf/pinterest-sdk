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

#include "OpenAPIInviteResponse.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIInviteResponse::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (AssetsSummary.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("assets_summary")); WriteJsonValue(Writer, AssetsSummary.GetValue());
	}
	if (BusinessRoles.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("business_roles")); WriteJsonValue(Writer, BusinessRoles.GetValue());
	}
	if (CreatedByBusiness.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("created_by_business")); WriteJsonValue(Writer, CreatedByBusiness.GetValue());
	}
	if (CreatedByUser.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("created_by_user")); WriteJsonValue(Writer, CreatedByUser.GetValue());
	}
	if (CreatedTime.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("created_time")); WriteJsonValue(Writer, CreatedTime.GetValue());
	}
	if (Id.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id.GetValue());
	}
	if (InviteData.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("invite_data")); WriteJsonValue(Writer, InviteData.GetValue());
	}
	if (IsReceivedInvite.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("is_received_invite")); WriteJsonValue(Writer, IsReceivedInvite.GetValue());
	}
	if (User.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("user")); WriteJsonValue(Writer, User.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIInviteResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("assets_summary"), AssetsSummary);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("business_roles"), BusinessRoles);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("created_by_business"), CreatedByBusiness);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("created_by_user"), CreatedByUser);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("created_time"), CreatedTime);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("invite_data"), InviteData);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("is_received_invite"), IsReceivedInvite);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("user"), User);

	return ParseSuccess;
}

}
