//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'business_access_user_summary.g.dart';

/// Metadata of the member/partner that has access to the asset.
///
/// Properties:
/// * [email] - Email of the business member/partner.
/// * [id] - Unique identifier of the business member/partner.
/// * [username] - Username of the business member/partner.
@BuiltValue()
abstract class BusinessAccessUserSummary implements Built<BusinessAccessUserSummary, BusinessAccessUserSummaryBuilder> {
  /// Email of the business member/partner.
  @BuiltValueField(wireName: r'email')
  String? get email;

  /// Unique identifier of the business member/partner.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// Username of the business member/partner.
  @BuiltValueField(wireName: r'username')
  String? get username;

  BusinessAccessUserSummary._();

  factory BusinessAccessUserSummary([void updates(BusinessAccessUserSummaryBuilder b)]) = _$BusinessAccessUserSummary;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BusinessAccessUserSummaryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BusinessAccessUserSummary> get serializer => _$BusinessAccessUserSummarySerializer();
}

class _$BusinessAccessUserSummarySerializer implements PrimitiveSerializer<BusinessAccessUserSummary> {
  @override
  final Iterable<Type> types = const [BusinessAccessUserSummary, _$BusinessAccessUserSummary];

  @override
  final String wireName = r'BusinessAccessUserSummary';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BusinessAccessUserSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.email != null) {
      yield r'email';
      yield serializers.serialize(
        object.email,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.username != null) {
      yield r'username';
      yield serializers.serialize(
        object.username,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BusinessAccessUserSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BusinessAccessUserSummaryBuilder result,
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
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.id = valueDes;
          break;
        case r'username':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.username = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BusinessAccessUserSummary deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BusinessAccessUserSummaryBuilder();
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

