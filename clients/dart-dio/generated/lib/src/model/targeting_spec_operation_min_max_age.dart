//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec_operation_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_spec_operation_min_max_age.g.dart';

/// TargetingSpecOperationMinMaxAge
///
/// Properties:
/// * [field] 
/// * [operation] 
/// * [value] 
@BuiltValue()
abstract class TargetingSpecOperationMinMaxAge implements TargetingSpecOperationString, Built<TargetingSpecOperationMinMaxAge, TargetingSpecOperationMinMaxAgeBuilder> {
  TargetingSpecOperationMinMaxAge._();

  factory TargetingSpecOperationMinMaxAge([void updates(TargetingSpecOperationMinMaxAgeBuilder b)]) = _$TargetingSpecOperationMinMaxAge;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingSpecOperationMinMaxAgeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingSpecOperationMinMaxAge> get serializer => _$TargetingSpecOperationMinMaxAgeSerializer();
}

class _$TargetingSpecOperationMinMaxAgeSerializer implements PrimitiveSerializer<TargetingSpecOperationMinMaxAge> {
  @override
  final Iterable<Type> types = const [TargetingSpecOperationMinMaxAge, _$TargetingSpecOperationMinMaxAge];

  @override
  final String wireName = r'TargetingSpecOperationMinMaxAge';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingSpecOperationMinMaxAge object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'field';
    yield serializers.serialize(
      object.field,
      specifiedType: const FullType(String),
    );
    yield r'operation';
    yield serializers.serialize(
      object.operation,
      specifiedType: const FullType(TargetingSpecOperationStringOperationEnum),
    );
    yield r'value';
    yield object.value == null ? null : serializers.serialize(
      object.value,
      specifiedType: const FullType.nullable(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    TargetingSpecOperationMinMaxAge object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingSpecOperationMinMaxAgeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'field':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.field = valueDes;
          break;
        case r'operation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingSpecOperationStringOperationEnum),
          ) as TargetingSpecOperationStringOperationEnum;
          result.operation = valueDes;
          break;
        case r'value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.value = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TargetingSpecOperationMinMaxAge deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingSpecOperationMinMaxAgeBuilder();
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

class TargetingSpecOperationMinMaxAgeFieldEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'MINIMUM_AGE')
  static const TargetingSpecOperationMinMaxAgeFieldEnum MINIMUM_AGE = _$targetingSpecOperationMinMaxAgeFieldEnum_MINIMUM_AGE;
  @BuiltValueEnumConst(wireName: r'MAXIMUM_AGE')
  static const TargetingSpecOperationMinMaxAgeFieldEnum MAXIMUM_AGE = _$targetingSpecOperationMinMaxAgeFieldEnum_MAXIMUM_AGE;

  static Serializer<TargetingSpecOperationMinMaxAgeFieldEnum> get serializer => _$targetingSpecOperationMinMaxAgeFieldEnumSerializer;

  const TargetingSpecOperationMinMaxAgeFieldEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationMinMaxAgeFieldEnum> get values => _$targetingSpecOperationMinMaxAgeFieldEnumValues;
  static TargetingSpecOperationMinMaxAgeFieldEnum valueOf(String name) => _$targetingSpecOperationMinMaxAgeFieldEnumValueOf(name);
}

class TargetingSpecOperationMinMaxAgeOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'SET')
  static const TargetingSpecOperationMinMaxAgeOperationEnum SET = _$targetingSpecOperationMinMaxAgeOperationEnum_SET;

  static Serializer<TargetingSpecOperationMinMaxAgeOperationEnum> get serializer => _$targetingSpecOperationMinMaxAgeOperationEnumSerializer;

  const TargetingSpecOperationMinMaxAgeOperationEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationMinMaxAgeOperationEnum> get values => _$targetingSpecOperationMinMaxAgeOperationEnumValues;
  static TargetingSpecOperationMinMaxAgeOperationEnum valueOf(String name) => _$targetingSpecOperationMinMaxAgeOperationEnumValueOf(name);
}

