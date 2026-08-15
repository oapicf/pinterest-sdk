//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/conversion_events_user_data_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'conversion_events_user_data.g.dart';

/// Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
///
/// Properties:
/// * [clickId] - The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
/// * [clientIpAddress] - The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
/// * [clientUserAgent] - The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
/// * [country] - Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. The string should be in the UTF-8 format.
/// * [ct] - Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.
/// * [db] - Sha256 hashes of user's date of birthday, given as year, month, and day. The string should be in the UTF-8 format.
/// * [em] - Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
/// * [externalId] - Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
/// * [fn] - Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
/// * [ge] - Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. The string should be in the UTF-8 format.
/// * [hashedMaids] - Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
/// * [ln] - Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
/// * [partnerId] - A unique identifier of visitors' information defined by third party partners. e.g RampID
/// * [ph] - Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
/// * [st] - Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.
/// * [zp] - Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.
@BuiltValue()
abstract class ConversionEventsUserData implements Built<ConversionEventsUserData, ConversionEventsUserDataBuilder> {
  /// Any Of [ConversionEventsUserDataProperties]
  AnyOf get anyOf;

  ConversionEventsUserData._();

  factory ConversionEventsUserData([void updates(ConversionEventsUserDataBuilder b)]) = _$ConversionEventsUserData;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionEventsUserDataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionEventsUserData> get serializer => _$ConversionEventsUserDataSerializer();
}

class _$ConversionEventsUserDataSerializer implements PrimitiveSerializer<ConversionEventsUserData> {
  @override
  final Iterable<Type> types = const [ConversionEventsUserData, _$ConversionEventsUserData];

  @override
  final String wireName = r'ConversionEventsUserData';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionEventsUserData object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionEventsUserData object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  ConversionEventsUserData deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionEventsUserDataBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(ConversionEventsUserDataProperties), FullType(ConversionEventsUserDataProperties), FullType(ConversionEventsUserDataProperties), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

