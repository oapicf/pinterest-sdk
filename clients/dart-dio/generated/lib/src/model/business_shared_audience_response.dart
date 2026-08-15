//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/role.dart';
import 'package:openapi/src/model/shared_audience_response_common.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'business_shared_audience_response.g.dart';

/// BusinessSharedAudienceResponse
///
/// Properties:
/// * [audienceId] - Audience ID that was shared
/// * [permissions] 
/// * [recipientBusinessIds] - Business IDs that received the audience
@BuiltValue()
abstract class BusinessSharedAudienceResponse implements SharedAudienceResponseCommon, Built<BusinessSharedAudienceResponse, BusinessSharedAudienceResponseBuilder> {
  /// Business IDs that received the audience
  @BuiltValueField(wireName: r'recipient_business_ids')
  BuiltList<String>? get recipientBusinessIds;

  BusinessSharedAudienceResponse._();

  factory BusinessSharedAudienceResponse([void updates(BusinessSharedAudienceResponseBuilder b)]) = _$BusinessSharedAudienceResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BusinessSharedAudienceResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BusinessSharedAudienceResponse> get serializer => _$BusinessSharedAudienceResponseSerializer();
}

class _$BusinessSharedAudienceResponseSerializer implements PrimitiveSerializer<BusinessSharedAudienceResponse> {
  @override
  final Iterable<Type> types = const [BusinessSharedAudienceResponse, _$BusinessSharedAudienceResponse];

  @override
  final String wireName = r'BusinessSharedAudienceResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BusinessSharedAudienceResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.recipientBusinessIds != null) {
      yield r'recipient_business_ids';
      yield serializers.serialize(
        object.recipientBusinessIds,
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
    BusinessSharedAudienceResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BusinessSharedAudienceResponseBuilder result,
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
  BusinessSharedAudienceResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BusinessSharedAudienceResponseBuilder();
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

