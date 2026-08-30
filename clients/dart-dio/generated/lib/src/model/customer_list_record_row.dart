//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'customer_list_record_row.g.dart';

/// A single row in a multi-field customer list (v2 format).
///
/// Properties:
/// * [email] - Email address (plain or hashed with SHA1, SHA256, or MD5).
/// * [externalId] - External ID identifier (not hashed).
/// * [hashedPhoneNumber] - Hashed phone number (hashed with SHA1, SHA256, or MD5).
/// * [hashedPinnerId] - Hashed pinner ID (hashed with SHA1, SHA256, or MD5).
/// * [ipAddress] - IP address (not hashed).
/// * [liverampEnvelope] - LiveRamp envelope identifier (Base64-encoded, not hashed).
/// * [maid] - Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).
/// * [userAgent] - User agent string (not hashed).
@BuiltValue()
abstract class CustomerListRecordRow implements Built<CustomerListRecordRow, CustomerListRecordRowBuilder> {
  /// Email address (plain or hashed with SHA1, SHA256, or MD5).
  @BuiltValueField(wireName: r'email')
  String? get email;

  /// External ID identifier (not hashed).
  @BuiltValueField(wireName: r'external_id')
  String? get externalId;

  /// Hashed phone number (hashed with SHA1, SHA256, or MD5).
  @BuiltValueField(wireName: r'hashed_phone_number')
  String? get hashedPhoneNumber;

  /// Hashed pinner ID (hashed with SHA1, SHA256, or MD5).
  @BuiltValueField(wireName: r'hashed_pinner_id')
  String? get hashedPinnerId;

  /// IP address (not hashed).
  @BuiltValueField(wireName: r'ip_address')
  String? get ipAddress;

  /// LiveRamp envelope identifier (Base64-encoded, not hashed).
  @BuiltValueField(wireName: r'liveramp_envelope')
  String? get liverampEnvelope;

  /// Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).
  @BuiltValueField(wireName: r'maid')
  String? get maid;

  /// User agent string (not hashed).
  @BuiltValueField(wireName: r'user_agent')
  String? get userAgent;

  CustomerListRecordRow._();

  factory CustomerListRecordRow([void updates(CustomerListRecordRowBuilder b)]) = _$CustomerListRecordRow;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomerListRecordRowBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomerListRecordRow> get serializer => _$CustomerListRecordRowSerializer();
}

class _$CustomerListRecordRowSerializer implements PrimitiveSerializer<CustomerListRecordRow> {
  @override
  final Iterable<Type> types = const [CustomerListRecordRow, _$CustomerListRecordRow];

  @override
  final String wireName = r'CustomerListRecordRow';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomerListRecordRow object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.email != null) {
      yield r'email';
      yield serializers.serialize(
        object.email,
        specifiedType: const FullType(String),
      );
    }
    if (object.externalId != null) {
      yield r'external_id';
      yield serializers.serialize(
        object.externalId,
        specifiedType: const FullType(String),
      );
    }
    if (object.hashedPhoneNumber != null) {
      yield r'hashed_phone_number';
      yield serializers.serialize(
        object.hashedPhoneNumber,
        specifiedType: const FullType(String),
      );
    }
    if (object.hashedPinnerId != null) {
      yield r'hashed_pinner_id';
      yield serializers.serialize(
        object.hashedPinnerId,
        specifiedType: const FullType(String),
      );
    }
    if (object.ipAddress != null) {
      yield r'ip_address';
      yield serializers.serialize(
        object.ipAddress,
        specifiedType: const FullType(String),
      );
    }
    if (object.liverampEnvelope != null) {
      yield r'liveramp_envelope';
      yield serializers.serialize(
        object.liverampEnvelope,
        specifiedType: const FullType(String),
      );
    }
    if (object.maid != null) {
      yield r'maid';
      yield serializers.serialize(
        object.maid,
        specifiedType: const FullType(String),
      );
    }
    if (object.userAgent != null) {
      yield r'user_agent';
      yield serializers.serialize(
        object.userAgent,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CustomerListRecordRow object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomerListRecordRowBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.email = valueDes;
          break;
        case r'external_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.externalId = valueDes;
          break;
        case r'hashed_phone_number':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.hashedPhoneNumber = valueDes;
          break;
        case r'hashed_pinner_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.hashedPinnerId = valueDes;
          break;
        case r'ip_address':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.ipAddress = valueDes;
          break;
        case r'liveramp_envelope':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.liverampEnvelope = valueDes;
          break;
        case r'maid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.maid = valueDes;
          break;
        case r'user_agent':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.userAgent = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CustomerListRecordRow deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomerListRecordRowBuilder();
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

