//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec_list_operation.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_spec_operation_geo_exclude.g.dart';

/// TargetingSpecOperationGeoExclude
///
/// Properties:
/// * [field] 
/// * [operation] 
/// * [values] 
@BuiltValue()
abstract class TargetingSpecOperationGeoExclude implements Built<TargetingSpecOperationGeoExclude, TargetingSpecOperationGeoExcludeBuilder> {
  @BuiltValueField(wireName: r'field')
  TargetingSpecOperationGeoExcludeFieldEnum get field;
  // enum fieldEnum {  GEO_EXCLUDE,  };

  @BuiltValueField(wireName: r'operation')
  TargetingSpecListOperation get operation;
  // enum operationEnum {  SET,  ADD,  REMOVE,  };

  @BuiltValueField(wireName: r'values')
  BuiltList<String> get values;

  TargetingSpecOperationGeoExclude._();

  factory TargetingSpecOperationGeoExclude([void updates(TargetingSpecOperationGeoExcludeBuilder b)]) = _$TargetingSpecOperationGeoExclude;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingSpecOperationGeoExcludeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingSpecOperationGeoExclude> get serializer => _$TargetingSpecOperationGeoExcludeSerializer();
}

class _$TargetingSpecOperationGeoExcludeSerializer implements PrimitiveSerializer<TargetingSpecOperationGeoExclude> {
  @override
  final Iterable<Type> types = const [TargetingSpecOperationGeoExclude, _$TargetingSpecOperationGeoExclude];

  @override
  final String wireName = r'TargetingSpecOperationGeoExclude';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingSpecOperationGeoExclude object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'field';
    yield serializers.serialize(
      object.field,
      specifiedType: const FullType(TargetingSpecOperationGeoExcludeFieldEnum),
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
    TargetingSpecOperationGeoExclude object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingSpecOperationGeoExcludeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'field':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingSpecOperationGeoExcludeFieldEnum),
          ) as TargetingSpecOperationGeoExcludeFieldEnum;
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
  TargetingSpecOperationGeoExclude deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingSpecOperationGeoExcludeBuilder();
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

class TargetingSpecOperationGeoExcludeFieldEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'GEO_EXCLUDE')
  static const TargetingSpecOperationGeoExcludeFieldEnum GEO_EXCLUDE = _$targetingSpecOperationGeoExcludeFieldEnum_GEO_EXCLUDE;

  static Serializer<TargetingSpecOperationGeoExcludeFieldEnum> get serializer => _$targetingSpecOperationGeoExcludeFieldEnumSerializer;

  const TargetingSpecOperationGeoExcludeFieldEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationGeoExcludeFieldEnum> get values => _$targetingSpecOperationGeoExcludeFieldEnumValues;
  static TargetingSpecOperationGeoExcludeFieldEnum valueOf(String name) => _$targetingSpecOperationGeoExcludeFieldEnumValueOf(name);
}

