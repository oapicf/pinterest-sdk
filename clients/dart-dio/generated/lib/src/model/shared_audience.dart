//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/shared_audience_common.dart';
import 'package:openapi/src/model/operation_type.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'shared_audience.g.dart';

/// SharedAudience
///
/// Properties:
/// * [audienceId] - Unique identifier of an audience
/// * [operationType] 
/// * [recipientAccountIds] - List of ad account IDs to share with or revoke from.
@BuiltValue()
abstract class SharedAudience implements SharedAudienceCommon, Built<SharedAudience, SharedAudienceBuilder> {
  /// List of ad account IDs to share with or revoke from.
  @BuiltValueField(wireName: r'recipient_account_ids')
  BuiltList<String> get recipientAccountIds;

  SharedAudience._();

  factory SharedAudience([void updates(SharedAudienceBuilder b)]) = _$SharedAudience;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SharedAudienceBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SharedAudience> get serializer => _$SharedAudienceSerializer();
}

class _$SharedAudienceSerializer implements PrimitiveSerializer<SharedAudience> {
  @override
  final Iterable<Type> types = const [SharedAudience, _$SharedAudience];

  @override
  final String wireName = r'SharedAudience';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SharedAudience object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'recipient_account_ids';
    yield serializers.serialize(
      object.recipientAccountIds,
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
    SharedAudience object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SharedAudienceBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'recipient_account_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.recipientAccountIds.replace(valueDes);
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
  SharedAudience deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SharedAudienceBuilder();
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

