//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/role.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_account_to_business_shared_audience.g.dart';

/// AdAccountToBusinessSharedAudience
///
/// Properties:
/// * [audienceId] - Unique identifier of an audience
/// * [permissions] - Permissions granted to the recipients.
/// * [recipientBusinessIds] - Business IDs to share with or revoke from (request) / that received the audience (response).
@BuiltValue()
abstract class AdAccountToBusinessSharedAudience implements Built<AdAccountToBusinessSharedAudience, AdAccountToBusinessSharedAudienceBuilder> {
  /// Unique identifier of an audience
  @BuiltValueField(wireName: r'audience_id')
  String get audienceId;

  /// Permissions granted to the recipients.
  @BuiltValueField(wireName: r'permissions')
  BuiltList<Role>? get permissions;

  /// Business IDs to share with or revoke from (request) / that received the audience (response).
  @BuiltValueField(wireName: r'recipient_business_ids')
  BuiltList<String> get recipientBusinessIds;

  AdAccountToBusinessSharedAudience._();

  factory AdAccountToBusinessSharedAudience([void updates(AdAccountToBusinessSharedAudienceBuilder b)]) = _$AdAccountToBusinessSharedAudience;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdAccountToBusinessSharedAudienceBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdAccountToBusinessSharedAudience> get serializer => _$AdAccountToBusinessSharedAudienceSerializer();
}

class _$AdAccountToBusinessSharedAudienceSerializer implements PrimitiveSerializer<AdAccountToBusinessSharedAudience> {
  @override
  final Iterable<Type> types = const [AdAccountToBusinessSharedAudience, _$AdAccountToBusinessSharedAudience];

  @override
  final String wireName = r'AdAccountToBusinessSharedAudience';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdAccountToBusinessSharedAudience object, {
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
    yield r'recipient_business_ids';
    yield serializers.serialize(
      object.recipientBusinessIds,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdAccountToBusinessSharedAudience object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdAccountToBusinessSharedAudienceBuilder result,
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
        case r'recipient_business_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.recipientBusinessIds.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdAccountToBusinessSharedAudience deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdAccountToBusinessSharedAudienceBuilder();
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

