//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/shared_audience_common.dart';
import 'package:openapi/src/model/operation_type.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'business_shared_audience.g.dart';

/// BusinessSharedAudience
///
/// Properties:
/// * [audienceId] - Unique identifier of an audience
/// * [operationType] 
/// * [recipientBusinessIds] - List of business IDs to share with or revoke from.
@BuiltValue()
abstract class BusinessSharedAudience implements SharedAudienceCommon, Built<BusinessSharedAudience, BusinessSharedAudienceBuilder> {
  /// List of business IDs to share with or revoke from.
  @BuiltValueField(wireName: r'recipient_business_ids')
  BuiltList<String> get recipientBusinessIds;

  BusinessSharedAudience._();

  factory BusinessSharedAudience([void updates(BusinessSharedAudienceBuilder b)]) = _$BusinessSharedAudience;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BusinessSharedAudienceBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BusinessSharedAudience> get serializer => _$BusinessSharedAudienceSerializer();
}

class _$BusinessSharedAudienceSerializer implements PrimitiveSerializer<BusinessSharedAudience> {
  @override
  final Iterable<Type> types = const [BusinessSharedAudience, _$BusinessSharedAudience];

  @override
  final String wireName = r'BusinessSharedAudience';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BusinessSharedAudience object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'recipient_business_ids';
    yield serializers.serialize(
      object.recipientBusinessIds,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
    if (object.operationType != null) {
      yield r'operation_type';
      yield serializers.serialize(
        object.operationType,
        specifiedType: const FullType(OperationType),
      );
    }
    if (object.audienceId != null) {
      yield r'audience_id';
      yield serializers.serialize(
        object.audienceId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BusinessSharedAudience object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BusinessSharedAudienceBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'recipient_business_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.recipientBusinessIds.replace(valueDes);
          break;
        case r'operation_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(OperationType),
          ) as OperationType;
          result.operationType = valueDes;
          break;
        case r'audience_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.audienceId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BusinessSharedAudience deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BusinessSharedAudienceBuilder();
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

