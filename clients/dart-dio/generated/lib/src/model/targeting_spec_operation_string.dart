//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_spec_operation_string.g.dart';

/// TargetingSpecOperationString
///
/// Properties:
/// * [field] 
/// * [operation] 
/// * [value] 
@BuiltValue(instantiable: false)
abstract class TargetingSpecOperationString  {
  @BuiltValueField(wireName: r'field')
  String get field;

  @BuiltValueField(wireName: r'operation')
  TargetingSpecOperationStringOperationEnum get operation;
  // enum operationEnum {  SET,  };

  @BuiltValueField(wireName: r'value')
  String? get value;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingSpecOperationString> get serializer => _$TargetingSpecOperationStringSerializer();
}

class _$TargetingSpecOperationStringSerializer implements PrimitiveSerializer<TargetingSpecOperationString> {
  @override
  final Iterable<Type> types = const [TargetingSpecOperationString];

  @override
  final String wireName = r'TargetingSpecOperationString';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingSpecOperationString object, {
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
    TargetingSpecOperationString object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  TargetingSpecOperationString deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($TargetingSpecOperationString)) as $TargetingSpecOperationString;
  }
}

/// a concrete implementation of [TargetingSpecOperationString], since [TargetingSpecOperationString] is not instantiable
@BuiltValue(instantiable: true)
abstract class $TargetingSpecOperationString implements TargetingSpecOperationString, Built<$TargetingSpecOperationString, $TargetingSpecOperationStringBuilder> {
  $TargetingSpecOperationString._();

  factory $TargetingSpecOperationString([void Function($TargetingSpecOperationStringBuilder)? updates]) = _$$TargetingSpecOperationString;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($TargetingSpecOperationStringBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$TargetingSpecOperationString> get serializer => _$$TargetingSpecOperationStringSerializer();
}

class _$$TargetingSpecOperationStringSerializer implements PrimitiveSerializer<$TargetingSpecOperationString> {
  @override
  final Iterable<Type> types = const [$TargetingSpecOperationString, _$$TargetingSpecOperationString];

  @override
  final String wireName = r'$TargetingSpecOperationString';

  @override
  Object serialize(
    Serializers serializers,
    $TargetingSpecOperationString object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(TargetingSpecOperationString))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingSpecOperationStringBuilder result,
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
  $TargetingSpecOperationString deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $TargetingSpecOperationStringBuilder();
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

class TargetingSpecOperationStringOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'SET')
  static const TargetingSpecOperationStringOperationEnum SET = _$targetingSpecOperationStringOperationEnum_SET;

  static Serializer<TargetingSpecOperationStringOperationEnum> get serializer => _$targetingSpecOperationStringOperationEnumSerializer;

  const TargetingSpecOperationStringOperationEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationStringOperationEnum> get values => _$targetingSpecOperationStringOperationEnumValues;
  static TargetingSpecOperationStringOperationEnum valueOf(String name) => _$targetingSpecOperationStringOperationEnumValueOf(name);
}

