//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec_app_type.dart';
import 'package:openapi/src/model/targeting_spec_list_operation.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_spec_operation_app_type.g.dart';

/// TargetingSpecOperationAppType
///
/// Properties:
/// * [field] 
/// * [operation] 
/// * [values] 
@BuiltValue()
abstract class TargetingSpecOperationAppType implements Built<TargetingSpecOperationAppType, TargetingSpecOperationAppTypeBuilder> {
  @BuiltValueField(wireName: r'field')
  TargetingSpecOperationAppTypeFieldEnum get field;
  // enum fieldEnum {  APPTYPE,  };

  @BuiltValueField(wireName: r'operation')
  TargetingSpecListOperation get operation;
  // enum operationEnum {  SET,  ADD,  REMOVE,  };

  @BuiltValueField(wireName: r'values')
  BuiltList<TargetingSpecAppType> get values;

  TargetingSpecOperationAppType._();

  factory TargetingSpecOperationAppType([void updates(TargetingSpecOperationAppTypeBuilder b)]) = _$TargetingSpecOperationAppType;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingSpecOperationAppTypeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingSpecOperationAppType> get serializer => _$TargetingSpecOperationAppTypeSerializer();
}

class _$TargetingSpecOperationAppTypeSerializer implements PrimitiveSerializer<TargetingSpecOperationAppType> {
  @override
  final Iterable<Type> types = const [TargetingSpecOperationAppType, _$TargetingSpecOperationAppType];

  @override
  final String wireName = r'TargetingSpecOperationAppType';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingSpecOperationAppType object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'field';
    yield serializers.serialize(
      object.field,
      specifiedType: const FullType(TargetingSpecOperationAppTypeFieldEnum),
    );
    yield r'operation';
    yield serializers.serialize(
      object.operation,
      specifiedType: const FullType(TargetingSpecListOperation),
    );
    yield r'values';
    yield serializers.serialize(
      object.values,
      specifiedType: const FullType(BuiltList, [FullType(TargetingSpecAppType)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    TargetingSpecOperationAppType object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingSpecOperationAppTypeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'field':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingSpecOperationAppTypeFieldEnum),
          ) as TargetingSpecOperationAppTypeFieldEnum;
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
            specifiedType: const FullType(BuiltList, [FullType(TargetingSpecAppType)]),
          ) as BuiltList<TargetingSpecAppType>;
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
  TargetingSpecOperationAppType deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingSpecOperationAppTypeBuilder();
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

class TargetingSpecOperationAppTypeFieldEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'APPTYPE')
  static const TargetingSpecOperationAppTypeFieldEnum APPTYPE = _$targetingSpecOperationAppTypeFieldEnum_APPTYPE;

  static Serializer<TargetingSpecOperationAppTypeFieldEnum> get serializer => _$targetingSpecOperationAppTypeFieldEnumSerializer;

  const TargetingSpecOperationAppTypeFieldEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationAppTypeFieldEnum> get values => _$targetingSpecOperationAppTypeFieldEnumValues;
  static TargetingSpecOperationAppTypeFieldEnum valueOf(String name) => _$targetingSpecOperationAppTypeFieldEnumValueOf(name);
}

