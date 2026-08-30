//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_spec_operation_maximum_age.g.dart';

/// TargetingSpecOperationMaximumAge
///
/// Properties:
/// * [field] 
/// * [operation] 
/// * [value] 
@BuiltValue()
abstract class TargetingSpecOperationMaximumAge implements Built<TargetingSpecOperationMaximumAge, TargetingSpecOperationMaximumAgeBuilder> {
  @BuiltValueField(wireName: r'field')
  TargetingSpecOperationMaximumAgeFieldEnum get field;
  // enum fieldEnum {  MAXIMUM_AGE,  };

  @BuiltValueField(wireName: r'operation')
  TargetingSpecOperationMaximumAgeOperationEnum get operation;
  // enum operationEnum {  SET,  };

  @BuiltValueField(wireName: r'value')
  String? get value;

  TargetingSpecOperationMaximumAge._();

  factory TargetingSpecOperationMaximumAge([void updates(TargetingSpecOperationMaximumAgeBuilder b)]) = _$TargetingSpecOperationMaximumAge;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingSpecOperationMaximumAgeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingSpecOperationMaximumAge> get serializer => _$TargetingSpecOperationMaximumAgeSerializer();
}

class _$TargetingSpecOperationMaximumAgeSerializer implements PrimitiveSerializer<TargetingSpecOperationMaximumAge> {
  @override
  final Iterable<Type> types = const [TargetingSpecOperationMaximumAge, _$TargetingSpecOperationMaximumAge];

  @override
  final String wireName = r'TargetingSpecOperationMaximumAge';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingSpecOperationMaximumAge object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'field';
    yield serializers.serialize(
      object.field,
      specifiedType: const FullType(TargetingSpecOperationMaximumAgeFieldEnum),
    );
    yield r'operation';
    yield serializers.serialize(
      object.operation,
      specifiedType: const FullType(TargetingSpecOperationMaximumAgeOperationEnum),
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
    TargetingSpecOperationMaximumAge object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingSpecOperationMaximumAgeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'field':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingSpecOperationMaximumAgeFieldEnum),
          ) as TargetingSpecOperationMaximumAgeFieldEnum;
          result.field = valueDes;
          break;
        case r'operation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingSpecOperationMaximumAgeOperationEnum),
          ) as TargetingSpecOperationMaximumAgeOperationEnum;
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
  TargetingSpecOperationMaximumAge deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingSpecOperationMaximumAgeBuilder();
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

class TargetingSpecOperationMaximumAgeFieldEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'MAXIMUM_AGE')
  static const TargetingSpecOperationMaximumAgeFieldEnum MAXIMUM_AGE = _$targetingSpecOperationMaximumAgeFieldEnum_MAXIMUM_AGE;

  static Serializer<TargetingSpecOperationMaximumAgeFieldEnum> get serializer => _$targetingSpecOperationMaximumAgeFieldEnumSerializer;

  const TargetingSpecOperationMaximumAgeFieldEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationMaximumAgeFieldEnum> get values => _$targetingSpecOperationMaximumAgeFieldEnumValues;
  static TargetingSpecOperationMaximumAgeFieldEnum valueOf(String name) => _$targetingSpecOperationMaximumAgeFieldEnumValueOf(name);
}

class TargetingSpecOperationMaximumAgeOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'SET')
  static const TargetingSpecOperationMaximumAgeOperationEnum SET = _$targetingSpecOperationMaximumAgeOperationEnum_SET;

  static Serializer<TargetingSpecOperationMaximumAgeOperationEnum> get serializer => _$targetingSpecOperationMaximumAgeOperationEnumSerializer;

  const TargetingSpecOperationMaximumAgeOperationEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationMaximumAgeOperationEnum> get values => _$targetingSpecOperationMaximumAgeOperationEnumValues;
  static TargetingSpecOperationMaximumAgeOperationEnum valueOf(String name) => _$targetingSpecOperationMaximumAgeOperationEnumValueOf(name);
}

