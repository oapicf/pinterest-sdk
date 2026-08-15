//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/role.dart';
import 'package:openapi/src/model/shared_audience_response_common.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'shared_audience_response.g.dart';

/// SharedAudienceResponse
///
/// Properties:
/// * [audienceId] - Audience ID that was shared
/// * [permissions] 
/// * [recipientAccountIds] - Account IDs that received the audience
@BuiltValue()
abstract class SharedAudienceResponse implements SharedAudienceResponseCommon, Built<SharedAudienceResponse, SharedAudienceResponseBuilder> {
  /// Account IDs that received the audience
  @BuiltValueField(wireName: r'recipient_account_ids')
  BuiltList<String>? get recipientAccountIds;

  SharedAudienceResponse._();

  factory SharedAudienceResponse([void updates(SharedAudienceResponseBuilder b)]) = _$SharedAudienceResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SharedAudienceResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SharedAudienceResponse> get serializer => _$SharedAudienceResponseSerializer();
}

class _$SharedAudienceResponseSerializer implements PrimitiveSerializer<SharedAudienceResponse> {
  @override
  final Iterable<Type> types = const [SharedAudienceResponse, _$SharedAudienceResponse];

  @override
  final String wireName = r'SharedAudienceResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SharedAudienceResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.recipientAccountIds != null) {
      yield r'recipient_account_ids';
      yield serializers.serialize(
        object.recipientAccountIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.permissions != null) {
      yield r'permissions';
      yield serializers.serialize(
        object.permissions,
        specifiedType: const FullType(BuiltList, [FullType(Role)]),
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
    SharedAudienceResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SharedAudienceResponseBuilder result,
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
        case r'permissions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(Role)]),
          ) as BuiltList<Role>;
          result.permissions.replace(valueDes);
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
  SharedAudienceResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SharedAudienceResponseBuilder();
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

