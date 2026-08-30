//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec_list_operation.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_spec_operation_location.g.dart';

/// TargetingSpecOperationLocation
///
/// Properties:
/// * [field] 
/// * [operation] 
/// * [values] 
@BuiltValue()
abstract class TargetingSpecOperationLocation implements Built<TargetingSpecOperationLocation, TargetingSpecOperationLocationBuilder> {
  @BuiltValueField(wireName: r'field')
  TargetingSpecOperationLocationFieldEnum get field;
  // enum fieldEnum {  LOCATION,  };

  @BuiltValueField(wireName: r'operation')
  TargetingSpecListOperation get operation;
  // enum operationEnum {  SET,  ADD,  REMOVE,  };

  @BuiltValueField(wireName: r'values')
  BuiltList<String> get values;

  TargetingSpecOperationLocation._();

  factory TargetingSpecOperationLocation([void updates(TargetingSpecOperationLocationBuilder b)]) = _$TargetingSpecOperationLocation;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingSpecOperationLocationBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingSpecOperationLocation> get serializer => _$TargetingSpecOperationLocationSerializer();
}

class _$TargetingSpecOperationLocationSerializer implements PrimitiveSerializer<TargetingSpecOperationLocation> {
  @override
  final Iterable<Type> types = const [TargetingSpecOperationLocation, _$TargetingSpecOperationLocation];

  @override
  final String wireName = r'TargetingSpecOperationLocation';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingSpecOperationLocation object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'field';
    yield serializers.serialize(
      object.field,
      specifiedType: const FullType(TargetingSpecOperationLocationFieldEnum),
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
    TargetingSpecOperationLocation object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingSpecOperationLocationBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'field':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingSpecOperationLocationFieldEnum),
          ) as TargetingSpecOperationLocationFieldEnum;
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
  TargetingSpecOperationLocation deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingSpecOperationLocationBuilder();
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

class TargetingSpecOperationLocationFieldEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'LOCATION')
  static const TargetingSpecOperationLocationFieldEnum LOCATION = _$targetingSpecOperationLocationFieldEnum_LOCATION;

  static Serializer<TargetingSpecOperationLocationFieldEnum> get serializer => _$targetingSpecOperationLocationFieldEnumSerializer;

  const TargetingSpecOperationLocationFieldEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationLocationFieldEnum> get values => _$targetingSpecOperationLocationFieldEnumValues;
  static TargetingSpecOperationLocationFieldEnum valueOf(String name) => _$targetingSpecOperationLocationFieldEnumValueOf(name);
}

