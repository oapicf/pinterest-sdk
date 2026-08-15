//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec_operation_list.dart';
import 'package:openapi/src/model/targeting_spec_gender.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_spec_operation_gender.g.dart';

/// TargetingSpecOperationGender
///
/// Properties:
/// * [field] 
/// * [operation] 
/// * [values] 
@BuiltValue()
abstract class TargetingSpecOperationGender implements TargetingSpecOperationList, Built<TargetingSpecOperationGender, TargetingSpecOperationGenderBuilder> {
  TargetingSpecOperationGender._();

  factory TargetingSpecOperationGender([void updates(TargetingSpecOperationGenderBuilder b)]) = _$TargetingSpecOperationGender;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingSpecOperationGenderBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingSpecOperationGender> get serializer => _$TargetingSpecOperationGenderSerializer();
}

class _$TargetingSpecOperationGenderSerializer implements PrimitiveSerializer<TargetingSpecOperationGender> {
  @override
  final Iterable<Type> types = const [TargetingSpecOperationGender, _$TargetingSpecOperationGender];

  @override
  final String wireName = r'TargetingSpecOperationGender';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingSpecOperationGender object, {
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
      specifiedType: const FullType(TargetingSpecOperationListOperationEnum),
    );
    yield r'values';
    yield object.values == null ? null : serializers.serialize(
      object.values,
      specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    TargetingSpecOperationGender object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingSpecOperationGenderBuilder result,
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
            specifiedType: const FullType(TargetingSpecOperationListOperationEnum),
          ) as TargetingSpecOperationListOperationEnum;
          result.operation = valueDes;
          break;
        case r'values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.values.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TargetingSpecOperationGender deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingSpecOperationGenderBuilder();
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

class TargetingSpecOperationGenderFieldEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'GENDER')
  static const TargetingSpecOperationGenderFieldEnum GENDER = _$targetingSpecOperationGenderFieldEnum_GENDER;

  static Serializer<TargetingSpecOperationGenderFieldEnum> get serializer => _$targetingSpecOperationGenderFieldEnumSerializer;

  const TargetingSpecOperationGenderFieldEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationGenderFieldEnum> get values => _$targetingSpecOperationGenderFieldEnumValues;
  static TargetingSpecOperationGenderFieldEnum valueOf(String name) => _$targetingSpecOperationGenderFieldEnumValueOf(name);
}

class TargetingSpecOperationGenderOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'SET')
  static const TargetingSpecOperationGenderOperationEnum SET = _$targetingSpecOperationGenderOperationEnum_SET;
  @BuiltValueEnumConst(wireName: r'ADD')
  static const TargetingSpecOperationGenderOperationEnum ADD = _$targetingSpecOperationGenderOperationEnum_ADD;
  @BuiltValueEnumConst(wireName: r'REMOVE')
  static const TargetingSpecOperationGenderOperationEnum REMOVE = _$targetingSpecOperationGenderOperationEnum_REMOVE;

  static Serializer<TargetingSpecOperationGenderOperationEnum> get serializer => _$targetingSpecOperationGenderOperationEnumSerializer;

  const TargetingSpecOperationGenderOperationEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationGenderOperationEnum> get values => _$targetingSpecOperationGenderOperationEnumValues;
  static TargetingSpecOperationGenderOperationEnum valueOf(String name) => _$targetingSpecOperationGenderOperationEnumValueOf(name);
}

