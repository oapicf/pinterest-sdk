//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec_list_operation.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_spec_operation_location_exclude.g.dart';

/// TargetingSpecOperationLocationExclude
///
/// Properties:
/// * [field] 
/// * [operation] 
/// * [values] 
@BuiltValue()
abstract class TargetingSpecOperationLocationExclude implements Built<TargetingSpecOperationLocationExclude, TargetingSpecOperationLocationExcludeBuilder> {
  @BuiltValueField(wireName: r'field')
  TargetingSpecOperationLocationExcludeFieldEnum get field;
  // enum fieldEnum {  LOCATION_EXCLUDE,  };

  @BuiltValueField(wireName: r'operation')
  TargetingSpecListOperation get operation;
  // enum operationEnum {  SET,  ADD,  REMOVE,  };

  @BuiltValueField(wireName: r'values')
  BuiltList<String> get values;

  TargetingSpecOperationLocationExclude._();

  factory TargetingSpecOperationLocationExclude([void updates(TargetingSpecOperationLocationExcludeBuilder b)]) = _$TargetingSpecOperationLocationExclude;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingSpecOperationLocationExcludeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingSpecOperationLocationExclude> get serializer => _$TargetingSpecOperationLocationExcludeSerializer();
}

class _$TargetingSpecOperationLocationExcludeSerializer implements PrimitiveSerializer<TargetingSpecOperationLocationExclude> {
  @override
  final Iterable<Type> types = const [TargetingSpecOperationLocationExclude, _$TargetingSpecOperationLocationExclude];

  @override
  final String wireName = r'TargetingSpecOperationLocationExclude';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingSpecOperationLocationExclude object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'field';
    yield serializers.serialize(
      object.field,
      specifiedType: const FullType(TargetingSpecOperationLocationExcludeFieldEnum),
    );
    yield r'operation';
    yield serializers.serialize(
      object.operation,
      specifiedType: const FullType(TargetingSpecListOperation),
    );
    yield r'values';
    yield serializers.serialize(
      object.values,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    TargetingSpecOperationLocationExclude object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingSpecOperationLocationExcludeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'field':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingSpecOperationLocationExcludeFieldEnum),
          ) as TargetingSpecOperationLocationExcludeFieldEnum;
          result.field = valueDes;
          break;
        case r'operation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingSpecListOperation),
          ) as TargetingSpecListOperation;
          result.operation = valueDes;
          break;
        case r'values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
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
  TargetingSpecOperationLocationExclude deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingSpecOperationLocationExcludeBuilder();
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

class TargetingSpecOperationLocationExcludeFieldEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'LOCATION_EXCLUDE')
  static const TargetingSpecOperationLocationExcludeFieldEnum LOCATION_EXCLUDE = _$targetingSpecOperationLocationExcludeFieldEnum_LOCATION_EXCLUDE;

  static Serializer<TargetingSpecOperationLocationExcludeFieldEnum> get serializer => _$targetingSpecOperationLocationExcludeFieldEnumSerializer;

  const TargetingSpecOperationLocationExcludeFieldEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationLocationExcludeFieldEnum> get values => _$targetingSpecOperationLocationExcludeFieldEnumValues;
  static TargetingSpecOperationLocationExcludeFieldEnum valueOf(String name) => _$targetingSpecOperationLocationExcludeFieldEnumValueOf(name);
}

