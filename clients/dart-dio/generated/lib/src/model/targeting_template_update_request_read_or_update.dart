//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audience_update_operation_type.dart';
import 'package:openapi/src/model/targeting_spec_optimal.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_template_update_request_read_or_update.g.dart';

/// TargetingTemplateUpdateRequestReadOrUpdate
///
/// Properties:
/// * [id] - Targeting template ID
/// * [operationType] 
/// * [targetingAttributes] - targeting profile attributes
@BuiltValue()
abstract class TargetingTemplateUpdateRequestReadOrUpdate implements Built<TargetingTemplateUpdateRequestReadOrUpdate, TargetingTemplateUpdateRequestReadOrUpdateBuilder> {
  /// Targeting template ID
  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'operation_type')
  AudienceUpdateOperationType get operationType;
  // enum operationTypeEnum {  UPDATE,  REMOVE,  };

  /// targeting profile attributes
  @BuiltValueField(wireName: r'targeting_attributes')
  TargetingSpecOptimal? get targetingAttributes;

  TargetingTemplateUpdateRequestReadOrUpdate._();

  factory TargetingTemplateUpdateRequestReadOrUpdate([void updates(TargetingTemplateUpdateRequestReadOrUpdateBuilder b)]) = _$TargetingTemplateUpdateRequestReadOrUpdate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingTemplateUpdateRequestReadOrUpdateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingTemplateUpdateRequestReadOrUpdate> get serializer => _$TargetingTemplateUpdateRequestReadOrUpdateSerializer();
}

class _$TargetingTemplateUpdateRequestReadOrUpdateSerializer implements PrimitiveSerializer<TargetingTemplateUpdateRequestReadOrUpdate> {
  @override
  final Iterable<Type> types = const [TargetingTemplateUpdateRequestReadOrUpdate, _$TargetingTemplateUpdateRequestReadOrUpdate];

  @override
  final String wireName = r'TargetingTemplateUpdateRequestReadOrUpdate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingTemplateUpdateRequestReadOrUpdate object, {
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
      specifiedType: const FullType(AudienceUpdateOperationType),
    );
    if (object.targetingAttributes != null) {
      yield r'targeting_attributes';
      yield serializers.serialize(
        object.targetingAttributes,
        specifiedType: const FullType(TargetingSpecOptimal),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TargetingTemplateUpdateRequestReadOrUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingTemplateUpdateRequestReadOrUpdateBuilder result,
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
            specifiedType: const FullType(AudienceUpdateOperationType),
          ) as AudienceUpdateOperationType;
          result.operationType = valueDes;
          break;
        case r'targeting_attributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TargetingSpecOptimal),
          ) as TargetingSpecOptimal?;
          if (valueDes == null) continue;
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
  TargetingTemplateUpdateRequestReadOrUpdate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingTemplateUpdateRequestReadOrUpdateBuilder();
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

