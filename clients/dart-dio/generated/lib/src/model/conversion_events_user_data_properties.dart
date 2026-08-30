//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_events_user_data_properties.g.dart';

/// ConversionEventsUserDataProperties
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
abstract class ConversionEventsUserDataProperties implements Built<ConversionEventsUserDataProperties, ConversionEventsUserDataPropertiesBuilder> {
  /// The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
  @BuiltValueField(wireName: r'click_id')
  String? get clickId;

  /// The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
  @BuiltValueField(wireName: r'client_ip_address')
  String? get clientIpAddress;

  /// The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
  @BuiltValueField(wireName: r'client_user_agent')
  String? get clientUserAgent;

  /// Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. The string should be in the UTF-8 format.
  @BuiltValueField(wireName: r'country')
  BuiltList<String>? get country;

  /// Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format.
  @BuiltValueField(wireName: r'ct')
  BuiltList<String>? get ct;

  /// Sha256 hashes of user's date of birthday, given as year, month, and day. The string should be in the UTF-8 format.
  @BuiltValueField(wireName: r'db')
  BuiltList<String>? get db;

  /// Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
  @BuiltValueField(wireName: r'em')
  BuiltList<String>? get em;

  /// Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
  @BuiltValueField(wireName: r'external_id')
  BuiltList<String>? get externalId;

  /// Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
  @BuiltValueField(wireName: r'fn')
  BuiltList<String>? get fn;

  /// Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. The string should be in the UTF-8 format.
  @BuiltValueField(wireName: r'ge')
  BuiltList<String>? get ge;

  /// Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
  @BuiltValueField(wireName: r'hashed_maids')
  BuiltList<String>? get hashedMaids;

  /// Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
  @BuiltValueField(wireName: r'ln')
  BuiltList<String>? get ln;

  /// A unique identifier of visitors' information defined by third party partners. e.g RampID
  @BuiltValueField(wireName: r'partner_id')
  String? get partnerId;

  /// Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
  @BuiltValueField(wireName: r'ph')
  BuiltList<String>? get ph;

  /// Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format.
  @BuiltValueField(wireName: r'st')
  BuiltList<String>? get st;

  /// Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format.
  @BuiltValueField(wireName: r'zp')
  BuiltList<String>? get zp;

  ConversionEventsUserDataProperties._();

  factory ConversionEventsUserDataProperties([void updates(ConversionEventsUserDataPropertiesBuilder b)]) = _$ConversionEventsUserDataProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionEventsUserDataPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionEventsUserDataProperties> get serializer => _$ConversionEventsUserDataPropertiesSerializer();
}

class _$ConversionEventsUserDataPropertiesSerializer implements PrimitiveSerializer<ConversionEventsUserDataProperties> {
  @override
  final Iterable<Type> types = const [ConversionEventsUserDataProperties, _$ConversionEventsUserDataProperties];

  @override
  final String wireName = r'ConversionEventsUserDataProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionEventsUserDataProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.clickId != null) {
      yield r'click_id';
      yield serializers.serialize(
        object.clickId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.clientIpAddress != null) {
      yield r'client_ip_address';
      yield serializers.serialize(
        object.clientIpAddress,
        specifiedType: const FullType(String),
      );
    }
    if (object.clientUserAgent != null) {
      yield r'client_user_agent';
      yield serializers.serialize(
        object.clientUserAgent,
        specifiedType: const FullType(String),
      );
    }
    if (object.country != null) {
      yield r'country';
      yield serializers.serialize(
        object.country,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.ct != null) {
      yield r'ct';
      yield serializers.serialize(
        object.ct,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.db != null) {
      yield r'db';
      yield serializers.serialize(
        object.db,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.em != null) {
      yield r'em';
      yield serializers.serialize(
        object.em,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.externalId != null) {
      yield r'external_id';
      yield serializers.serialize(
        object.externalId,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.fn != null) {
      yield r'fn';
      yield serializers.serialize(
        object.fn,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.ge != null) {
      yield r'ge';
      yield serializers.serialize(
        object.ge,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.hashedMaids != null) {
      yield r'hashed_maids';
      yield serializers.serialize(
        object.hashedMaids,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.ln != null) {
      yield r'ln';
      yield serializers.serialize(
        object.ln,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.partnerId != null) {
      yield r'partner_id';
      yield serializers.serialize(
        object.partnerId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.ph != null) {
      yield r'ph';
      yield serializers.serialize(
        object.ph,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.st != null) {
      yield r'st';
      yield serializers.serialize(
        object.st,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.zp != null) {
      yield r'zp';
      yield serializers.serialize(
        object.zp,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionEventsUserDataProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionEventsUserDataPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'click_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.clickId = valueDes;
          break;
        case r'client_ip_address':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.clientIpAddress = valueDes;
          break;
        case r'client_user_agent':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.clientUserAgent = valueDes;
          break;
        case r'country':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.country.replace(valueDes);
          break;
        case r'ct':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.ct.replace(valueDes);
          break;
        case r'db':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.db.replace(valueDes);
          break;
        case r'em':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.em.replace(valueDes);
          break;
        case r'external_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.externalId.replace(valueDes);
          break;
        case r'fn':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.fn.replace(valueDes);
          break;
        case r'ge':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.ge.replace(valueDes);
          break;
        case r'hashed_maids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.hashedMaids.replace(valueDes);
          break;
        case r'ln':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.ln.replace(valueDes);
          break;
        case r'partner_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.partnerId = valueDes;
          break;
        case r'ph':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.ph.replace(valueDes);
          break;
        case r'st':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.st.replace(valueDes);
          break;
        case r'zp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.zp.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ConversionEventsUserDataProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionEventsUserDataPropertiesBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

