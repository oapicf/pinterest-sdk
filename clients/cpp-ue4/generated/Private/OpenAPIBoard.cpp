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

#include "OpenAPIBoard.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIBoard::PrivacyEnum& Value)
{
	switch (Value)
	{
	case OpenAPIBoard::PrivacyEnum::_Public:
		return TEXT("PUBLIC");
	case OpenAPIBoard::PrivacyEnum::_Protected:
		return TEXT("PROTECTED");
	case OpenAPIBoard::PrivacyEnum::Secret:
		return TEXT("SECRET");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIBoard::PrivacyEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIBoard::EnumToString(const OpenAPIBoard::PrivacyEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIBoard::PrivacyEnum& Value)
{
	static TMap<FString, OpenAPIBoard::PrivacyEnum> StringToEnum = { 
		{ TEXT("PUBLIC"), OpenAPIBoard::PrivacyEnum::_Public },
		{ TEXT("PROTECTED"), OpenAPIBoard::PrivacyEnum::_Protected },
		{ TEXT("SECRET"), OpenAPIBoard::PrivacyEnum::Secret }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIBoard::EnumFromString(const FString& EnumAsString, OpenAPIBoard::PrivacyEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIBoard::PrivacyEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIBoard::PrivacyEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIBoard::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Id.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id.GetValue());
	}
	if (CreatedAt.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("created_at")); WriteJsonValue(Writer, CreatedAt.GetValue());
	}
	if (BoardPinsModifiedAt.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("board_pins_modified_at")); WriteJsonValue(Writer, BoardPinsModifiedAt.GetValue());
	}
	Writer->WriteIdentifierPrefix(TEXT("name")); WriteJsonValue(Writer, Name);
	if (Description.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("description")); WriteJsonValue(Writer, Description.GetValue());
	}
	if (CollaboratorCount.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("collaborator_count")); WriteJsonValue(Writer, CollaboratorCount.GetValue());
	}
	if (PinCount.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("pin_count")); WriteJsonValue(Writer, PinCount.GetValue());
	}
	if (FollowerCount.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("follower_count")); WriteJsonValue(Writer, FollowerCount.GetValue());
	}
	if (Media.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("media")); WriteJsonValue(Writer, Media.GetValue());
	}
	if (Owner.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("owner")); WriteJsonValue(Writer, Owner.GetValue());
	}
	if (Privacy.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("privacy")); WriteJsonValue(Writer, Privacy.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIBoard::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("created_at"), CreatedAt);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("board_pins_modified_at"), BoardPinsModifiedAt);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("name"), Name);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("description"), Description);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("collaborator_count"), CollaboratorCount);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("pin_count"), PinCount);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("follower_count"), FollowerCount);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("media"), Media);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("owner"), Owner);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("privacy"), Privacy);

	return ParseSuccess;
}

}
