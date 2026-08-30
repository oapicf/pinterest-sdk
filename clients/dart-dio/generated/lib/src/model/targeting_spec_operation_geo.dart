//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec_list_operation.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_spec_operation_geo.g.dart';

/// TargetingSpecOperationGeo
///
/// Properties:
/// * [field] 
/// * [operation] 
/// * [values] 
@BuiltValue()
abstract class TargetingSpecOperationGeo implements Built<TargetingSpecOperationGeo, TargetingSpecOperationGeoBuilder> {
  @BuiltValueField(wireName: r'field')
  TargetingSpecOperationGeoFieldEnum get field;
  // enum fieldEnum {  GEO,  };

  @BuiltValueField(wireName: r'operation')
  TargetingSpecListOperation get operation;
  // enum operationEnum {  SET,  ADD,  REMOVE,  };

  @BuiltValueField(wireName: r'values')
  BuiltList<String> get values;

  TargetingSpecOperationGeo._();

  factory TargetingSpecOperationGeo([void updates(TargetingSpecOperationGeoBuilder b)]) = _$TargetingSpecOperationGeo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingSpecOperationGeoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingSpecOperationGeo> get serializer => _$TargetingSpecOperationGeoSerializer();
}

class _$TargetingSpecOperationGeoSerializer implements PrimitiveSerializer<TargetingSpecOperationGeo> {
  @override
  final Iterable<Type> types = const [TargetingSpecOperationGeo, _$TargetingSpecOperationGeo];

  @override
  final String wireName = r'TargetingSpecOperationGeo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingSpecOperationGeo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'field';
    yield serializers.serialize(
      object.field,
      specifiedType: const FullType(TargetingSpecOperationGeoFieldEnum),
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
    TargetingSpecOperationGeo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingSpecOperationGeoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'field':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingSpecOperationGeoFieldEnum),
          ) as TargetingSpecOperationGeoFieldEnum;
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
  TargetingSpecOperationGeo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingSpecOperationGeoBuilder();
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

class TargetingSpecOperationGeoFieldEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'GEO')
  static const TargetingSpecOperationGeoFieldEnum GEO = _$targetingSpecOperationGeoFieldEnum_GEO;

  static Serializer<TargetingSpecOperationGeoFieldEnum> get serializer => _$targetingSpecOperationGeoFieldEnumSerializer;

  const TargetingSpecOperationGeoFieldEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationGeoFieldEnum> get values => _$targetingSpecOperationGeoFieldEnumValues;
  static TargetingSpecOperationGeoFieldEnum valueOf(String name) => _$targetingSpecOperationGeoFieldEnumValueOf(name);
}

