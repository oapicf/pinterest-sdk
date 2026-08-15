//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_template_update_request.g.dart';

/// TargetingTemplateUpdateRequest
///
/// Properties:
/// * [id] - Targeting template ID
/// * [operationType] 
/// * [targetingAttributes] 
@BuiltValue()
abstract class TargetingTemplateUpdateRequest implements Built<TargetingTemplateUpdateRequest, TargetingTemplateUpdateRequestBuilder> {
  /// Targeting template ID
  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'operation_type')
  TargetingTemplateUpdateRequestOperationTypeEnum get operationType;
  // enum operationTypeEnum {  REMOVE,  UPDATE,  };

  @BuiltValueField(wireName: r'targeting_attributes')
  TargetingSpec? get targetingAttributes;

  TargetingTemplateUpdateRequest._();

  factory TargetingTemplateUpdateRequest([void updates(TargetingTemplateUpdateRequestBuilder b)]) = _$TargetingTemplateUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingTemplateUpdateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingTemplateUpdateRequest> get serializer => _$TargetingTemplateUpdateRequestSerializer();
}

class _$TargetingTemplateUpdateRequestSerializer implements PrimitiveSerializer<TargetingTemplateUpdateRequest> {
  @override
  final Iterable<Type> types = const [TargetingTemplateUpdateRequest, _$TargetingTemplateUpdateRequest];

  @override
  final String wireName = r'TargetingTemplateUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingTemplateUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'operation_type';
    yield serializers.serialize(
      object.operationType,
      specifiedType: const FullType(TargetingTemplateUpdateRequestOperationTypeEnum),
    );
    if (object.targetingAttributes != null) {
      yield r'targeting_attributes';
      yield serializers.serialize(
        object.targetingAttributes,
        specifiedType: const FullType(TargetingSpec),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TargetingTemplateUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingTemplateUpdateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'operation_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingTemplateUpdateRequestOperationTypeEnum),
          ) as TargetingTemplateUpdateRequestOperationTypeEnum;
          result.operationType = valueDes;
          break;
        case r'targeting_attributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingSpec),
          ) as TargetingSpec;
          result.targetingAttributes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TargetingTemplateUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingTemplateUpdateRequestBuilder();
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

class TargetingTemplateUpdateRequestOperationTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'REMOVE')
  static const TargetingTemplateUpdateRequestOperationTypeEnum REMOVE = _$targetingTemplateUpdateRequestOperationTypeEnum_REMOVE;
  @BuiltValueEnumConst(wireName: r'UPDATE')
  static const TargetingTemplateUpdateRequestOperationTypeEnum UPDATE = _$targetingTemplateUpdateRequestOperationTypeEnum_UPDATE;

  static Serializer<TargetingTemplateUpdateRequestOperationTypeEnum> get serializer => _$targetingTemplateUpdateRequestOperationTypeEnumSerializer;

  const TargetingTemplateUpdateRequestOperationTypeEnum._(String name): super(name);

  static BuiltSet<TargetingTemplateUpdateRequestOperationTypeEnum> get values => _$targetingTemplateUpdateRequestOperationTypeEnumValues;
  static TargetingTemplateUpdateRequestOperationTypeEnum valueOf(String name) => _$targetingTemplateUpdateRequestOperationTypeEnumValueOf(name);
}

