//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_spec_operation_minimum_age.g.dart';

/// TargetingSpecOperationMinimumAge
///
/// Properties:
/// * [field] 
/// * [operation] 
/// * [value] 
@BuiltValue()
abstract class TargetingSpecOperationMinimumAge implements Built<TargetingSpecOperationMinimumAge, TargetingSpecOperationMinimumAgeBuilder> {
  @BuiltValueField(wireName: r'field')
  TargetingSpecOperationMinimumAgeFieldEnum get field;
  // enum fieldEnum {  MINIMUM_AGE,  };

  @BuiltValueField(wireName: r'operation')
  TargetingSpecOperationMinimumAgeOperationEnum get operation;
  // enum operationEnum {  SET,  };

  @BuiltValueField(wireName: r'value')
  String? get value;

  TargetingSpecOperationMinimumAge._();

  factory TargetingSpecOperationMinimumAge([void updates(TargetingSpecOperationMinimumAgeBuilder b)]) = _$TargetingSpecOperationMinimumAge;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingSpecOperationMinimumAgeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingSpecOperationMinimumAge> get serializer => _$TargetingSpecOperationMinimumAgeSerializer();
}

class _$TargetingSpecOperationMinimumAgeSerializer implements PrimitiveSerializer<TargetingSpecOperationMinimumAge> {
  @override
  final Iterable<Type> types = const [TargetingSpecOperationMinimumAge, _$TargetingSpecOperationMinimumAge];

  @override
  final String wireName = r'TargetingSpecOperationMinimumAge';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingSpecOperationMinimumAge object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'field';
    yield serializers.serialize(
      object.field,
      specifiedType: const FullType(TargetingSpecOperationMinimumAgeFieldEnum),
    );
    yield r'operation';
    yield serializers.serialize(
      object.operation,
      specifiedType: const FullType(TargetingSpecOperationMinimumAgeOperationEnum),
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
    TargetingSpecOperationMinimumAge object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingSpecOperationMinimumAgeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'field':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingSpecOperationMinimumAgeFieldEnum),
          ) as TargetingSpecOperationMinimumAgeFieldEnum;
          result.field = valueDes;
          break;
        case r'operation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingSpecOperationMinimumAgeOperationEnum),
          ) as TargetingSpecOperationMinimumAgeOperationEnum;
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
  TargetingSpecOperationMinimumAge deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingSpecOperationMinimumAgeBuilder();
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

class TargetingSpecOperationMinimumAgeFieldEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'MINIMUM_AGE')
  static const TargetingSpecOperationMinimumAgeFieldEnum MINIMUM_AGE = _$targetingSpecOperationMinimumAgeFieldEnum_MINIMUM_AGE;

  static Serializer<TargetingSpecOperationMinimumAgeFieldEnum> get serializer => _$targetingSpecOperationMinimumAgeFieldEnumSerializer;

  const TargetingSpecOperationMinimumAgeFieldEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationMinimumAgeFieldEnum> get values => _$targetingSpecOperationMinimumAgeFieldEnumValues;
  static TargetingSpecOperationMinimumAgeFieldEnum valueOf(String name) => _$targetingSpecOperationMinimumAgeFieldEnumValueOf(name);
}

class TargetingSpecOperationMinimumAgeOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'SET')
  static const TargetingSpecOperationMinimumAgeOperationEnum SET = _$targetingSpecOperationMinimumAgeOperationEnum_SET;

  static Serializer<TargetingSpecOperationMinimumAgeOperationEnum> get serializer => _$targetingSpecOperationMinimumAgeOperationEnumSerializer;

  const TargetingSpecOperationMinimumAgeOperationEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationMinimumAgeOperationEnum> get values => _$targetingSpecOperationMinimumAgeOperationEnumValues;
  static TargetingSpecOperationMinimumAgeOperationEnum valueOf(String name) => _$targetingSpecOperationMinimumAgeOperationEnumValueOf(name);
}

