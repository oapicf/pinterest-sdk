//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec_operation_list.dart';
import 'package:openapi/src/model/targeting_spec_shopping_retargeting.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_spec_operation_shopping_retargeting.g.dart';

/// TargetingSpecOperationShoppingRetargeting
///
/// Properties:
/// * [field] 
/// * [operation] 
/// * [values] 
@BuiltValue()
abstract class TargetingSpecOperationShoppingRetargeting implements TargetingSpecOperationList, Built<TargetingSpecOperationShoppingRetargeting, TargetingSpecOperationShoppingRetargetingBuilder> {
  TargetingSpecOperationShoppingRetargeting._();

  factory TargetingSpecOperationShoppingRetargeting([void updates(TargetingSpecOperationShoppingRetargetingBuilder b)]) = _$TargetingSpecOperationShoppingRetargeting;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingSpecOperationShoppingRetargetingBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingSpecOperationShoppingRetargeting> get serializer => _$TargetingSpecOperationShoppingRetargetingSerializer();
}

class _$TargetingSpecOperationShoppingRetargetingSerializer implements PrimitiveSerializer<TargetingSpecOperationShoppingRetargeting> {
  @override
  final Iterable<Type> types = const [TargetingSpecOperationShoppingRetargeting, _$TargetingSpecOperationShoppingRetargeting];

  @override
  final String wireName = r'TargetingSpecOperationShoppingRetargeting';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingSpecOperationShoppingRetargeting object, {
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
    TargetingSpecOperationShoppingRetargeting object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingSpecOperationShoppingRetargetingBuilder result,
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
  TargetingSpecOperationShoppingRetargeting deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingSpecOperationShoppingRetargetingBuilder();
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

class TargetingSpecOperationShoppingRetargetingFieldEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'SHOPPING_RETARGETING')
  static const TargetingSpecOperationShoppingRetargetingFieldEnum SHOPPING_RETARGETING = _$targetingSpecOperationShoppingRetargetingFieldEnum_SHOPPING_RETARGETING;

  static Serializer<TargetingSpecOperationShoppingRetargetingFieldEnum> get serializer => _$targetingSpecOperationShoppingRetargetingFieldEnumSerializer;

  const TargetingSpecOperationShoppingRetargetingFieldEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationShoppingRetargetingFieldEnum> get values => _$targetingSpecOperationShoppingRetargetingFieldEnumValues;
  static TargetingSpecOperationShoppingRetargetingFieldEnum valueOf(String name) => _$targetingSpecOperationShoppingRetargetingFieldEnumValueOf(name);
}

class TargetingSpecOperationShoppingRetargetingOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'SET')
  static const TargetingSpecOperationShoppingRetargetingOperationEnum SET = _$targetingSpecOperationShoppingRetargetingOperationEnum_SET;

  static Serializer<TargetingSpecOperationShoppingRetargetingOperationEnum> get serializer => _$targetingSpecOperationShoppingRetargetingOperationEnumSerializer;

  const TargetingSpecOperationShoppingRetargetingOperationEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationShoppingRetargetingOperationEnum> get values => _$targetingSpecOperationShoppingRetargetingOperationEnumValues;
  static TargetingSpecOperationShoppingRetargetingOperationEnum valueOf(String name) => _$targetingSpecOperationShoppingRetargetingOperationEnumValueOf(name);
}

