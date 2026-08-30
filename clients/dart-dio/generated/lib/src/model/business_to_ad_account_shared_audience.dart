//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/role.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'business_to_ad_account_shared_audience.g.dart';

/// BusinessToAdAccountSharedAudience
///
/// Properties:
/// * [audienceId] - Unique identifier of an audience
/// * [permissions] - Permissions granted to the recipients.
/// * [recipientAccountIds] - Ad account IDs to share with or revoke from (request) / that received the audience (response).
@BuiltValue()
abstract class BusinessToAdAccountSharedAudience implements Built<BusinessToAdAccountSharedAudience, BusinessToAdAccountSharedAudienceBuilder> {
  /// Unique identifier of an audience
  @BuiltValueField(wireName: r'audience_id')
  String get audienceId;

  /// Permissions granted to the recipients.
  @BuiltValueField(wireName: r'permissions')
  BuiltList<Role>? get permissions;

  /// Ad account IDs to share with or revoke from (request) / that received the audience (response).
  @BuiltValueField(wireName: r'recipient_account_ids')
  BuiltList<String> get recipientAccountIds;

  BusinessToAdAccountSharedAudience._();

  factory BusinessToAdAccountSharedAudience([void updates(BusinessToAdAccountSharedAudienceBuilder b)]) = _$BusinessToAdAccountSharedAudience;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BusinessToAdAccountSharedAudienceBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BusinessToAdAccountSharedAudience> get serializer => _$BusinessToAdAccountSharedAudienceSerializer();
}

class _$BusinessToAdAccountSharedAudienceSerializer implements PrimitiveSerializer<BusinessToAdAccountSharedAudience> {
  @override
  final Iterable<Type> types = const [BusinessToAdAccountSharedAudience, _$BusinessToAdAccountSharedAudience];

  @override
  final String wireName = r'BusinessToAdAccountSharedAudience';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BusinessToAdAccountSharedAudience object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'audience_id';
    yield serializers.serialize(
      object.audienceId,
      specifiedType: const FullType(String),
    );
    if (object.permissions != null) {
      yield r'permissions';
      yield serializers.serialize(
        object.permissions,
        specifiedType: const FullType(BuiltList, [FullType(Role)]),
      );
    }
    yield r'recipient_account_ids';
    yield serializers.serialize(
      object.recipientAccountIds,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BusinessToAdAccountSharedAudience object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BusinessToAdAccountSharedAudienceBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'audience_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.audienceId = valueDes;
          break;
        case r'permissions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(Role)]),
          ) as BuiltList<Role>?;
          if (valueDes == null) continue;
          result.permissions.replace(valueDes);
          break;
        case r'recipient_account_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.recipientAccountIds.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BusinessToAdAccountSharedAudience deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BusinessToAdAccountSharedAudienceBuilder();
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

