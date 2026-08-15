//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audience_rule.dart';
import 'package:openapi/src/model/audience_update_operation_type.dart';
import 'package:openapi/src/model/audience_common.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience_update_request.g.dart';

/// AudienceUpdateRequest
///
/// Properties:
/// * [adAccountId] - Ad account ID.
/// * [name] - Audience name.
/// * [rule] 
/// * [description] - Audience description.
/// * [operationType] 
@BuiltValue()
abstract class AudienceUpdateRequest implements AudienceCommon, Built<AudienceUpdateRequest, AudienceUpdateRequestBuilder> {
  /// Audience description.
  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'operation_type')
  AudienceUpdateOperationType? get operationType;
  // enum operationTypeEnum {  UPDATE,  REMOVE,  };

  AudienceUpdateRequest._();

  factory AudienceUpdateRequest([void updates(AudienceUpdateRequestBuilder b)]) = _$AudienceUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AudienceUpdateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AudienceUpdateRequest> get serializer => _$AudienceUpdateRequestSerializer();
}

class _$AudienceUpdateRequestSerializer implements PrimitiveSerializer<AudienceUpdateRequest> {
  @override
  final Iterable<Type> types = const [AudienceUpdateRequest, _$AudienceUpdateRequest];

  @override
  final String wireName = r'AudienceUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AudienceUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.rule != null) {
      yield r'rule';
      yield serializers.serialize(
        object.rule,
        specifiedType: const FullType(AudienceRule),
      );
    }
    if (object.operationType != null) {
      yield r'operation_type';
      yield serializers.serialize(
        object.operationType,
        specifiedType: const FullType(AudienceUpdateOperationType),
      );
    }
    if (object.adAccountId != null) {
      yield r'ad_account_id';
      yield serializers.serialize(
        object.adAccountId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AudienceUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AudienceUpdateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.description = valueDes;
          break;
        case r'rule':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AudienceRule),
          ) as AudienceRule;
          result.rule.replace(valueDes);
          break;
        case r'operation_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AudienceUpdateOperationType),
          ) as AudienceUpdateOperationType;
          result.operationType = valueDes;
          break;
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adAccountId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AudienceUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AudienceUpdateRequestBuilder();
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

