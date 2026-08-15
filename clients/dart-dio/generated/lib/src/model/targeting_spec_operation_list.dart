//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_spec_operation_list.g.dart';

/// TargetingSpecOperationList
///
/// Properties:
/// * [field] 
/// * [operation] 
/// * [values] 
@BuiltValue(instantiable: false)
abstract class TargetingSpecOperationList  {
  @BuiltValueField(wireName: r'field')
  String get field;

  @BuiltValueField(wireName: r'operation')
  TargetingSpecOperationListOperationEnum get operation;
  // enum operationEnum {  SET,  ADD,  REMOVE,  };

  @BuiltValueField(wireName: r'values')
  BuiltList<String>? get values;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingSpecOperationList> get serializer => _$TargetingSpecOperationListSerializer();
}

class _$TargetingSpecOperationListSerializer implements PrimitiveSerializer<TargetingSpecOperationList> {
  @override
  final Iterable<Type> types = const [TargetingSpecOperationList];

  @override
  final String wireName = r'TargetingSpecOperationList';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingSpecOperationList object, {
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
    TargetingSpecOperationList object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  TargetingSpecOperationList deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($TargetingSpecOperationList)) as $TargetingSpecOperationList;
  }
}

/// a concrete implementation of [TargetingSpecOperationList], since [TargetingSpecOperationList] is not instantiable
@BuiltValue(instantiable: true)
abstract class $TargetingSpecOperationList implements TargetingSpecOperationList, Built<$TargetingSpecOperationList, $TargetingSpecOperationListBuilder> {
  $TargetingSpecOperationList._();

  factory $TargetingSpecOperationList([void Function($TargetingSpecOperationListBuilder)? updates]) = _$$TargetingSpecOperationList;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($TargetingSpecOperationListBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$TargetingSpecOperationList> get serializer => _$$TargetingSpecOperationListSerializer();
}

class _$$TargetingSpecOperationListSerializer implements PrimitiveSerializer<$TargetingSpecOperationList> {
  @override
  final Iterable<Type> types = const [$TargetingSpecOperationList, _$$TargetingSpecOperationList];

  @override
  final String wireName = r'$TargetingSpecOperationList';

  @override
  Object serialize(
    Serializers serializers,
    $TargetingSpecOperationList object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(TargetingSpecOperationList))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingSpecOperationListBuilder result,
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
  $TargetingSpecOperationList deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $TargetingSpecOperationListBuilder();
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

class TargetingSpecOperationListOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'SET')
  static const TargetingSpecOperationListOperationEnum SET = _$targetingSpecOperationListOperationEnum_SET;
  @BuiltValueEnumConst(wireName: r'ADD')
  static const TargetingSpecOperationListOperationEnum ADD = _$targetingSpecOperationListOperationEnum_ADD;
  @BuiltValueEnumConst(wireName: r'REMOVE')
  static const TargetingSpecOperationListOperationEnum REMOVE = _$targetingSpecOperationListOperationEnum_REMOVE;

  static Serializer<TargetingSpecOperationListOperationEnum> get serializer => _$targetingSpecOperationListOperationEnumSerializer;

  const TargetingSpecOperationListOperationEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationListOperationEnum> get values => _$targetingSpecOperationListOperationEnumValues;
  static TargetingSpecOperationListOperationEnum valueOf(String name) => _$targetingSpecOperationListOperationEnumValueOf(name);
}

