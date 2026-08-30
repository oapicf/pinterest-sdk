//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec_list_operation.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_spec_operation_interest.g.dart';

/// TargetingSpecOperationInterest
///
/// Properties:
/// * [field] 
/// * [operation] 
/// * [values] 
@BuiltValue()
abstract class TargetingSpecOperationInterest implements Built<TargetingSpecOperationInterest, TargetingSpecOperationInterestBuilder> {
  @BuiltValueField(wireName: r'field')
  TargetingSpecOperationInterestFieldEnum get field;
  // enum fieldEnum {  INTEREST,  };

  @BuiltValueField(wireName: r'operation')
  TargetingSpecListOperation get operation;
  // enum operationEnum {  SET,  ADD,  REMOVE,  };

  @BuiltValueField(wireName: r'values')
  BuiltList<String> get values;

  TargetingSpecOperationInterest._();

  factory TargetingSpecOperationInterest([void updates(TargetingSpecOperationInterestBuilder b)]) = _$TargetingSpecOperationInterest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingSpecOperationInterestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingSpecOperationInterest> get serializer => _$TargetingSpecOperationInterestSerializer();
}

class _$TargetingSpecOperationInterestSerializer implements PrimitiveSerializer<TargetingSpecOperationInterest> {
  @override
  final Iterable<Type> types = const [TargetingSpecOperationInterest, _$TargetingSpecOperationInterest];

  @override
  final String wireName = r'TargetingSpecOperationInterest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingSpecOperationInterest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'field';
    yield serializers.serialize(
      object.field,
      specifiedType: const FullType(TargetingSpecOperationInterestFieldEnum),
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
    TargetingSpecOperationInterest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingSpecOperationInterestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'field':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingSpecOperationInterestFieldEnum),
          ) as TargetingSpecOperationInterestFieldEnum;
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
  TargetingSpecOperationInterest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingSpecOperationInterestBuilder();
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

class TargetingSpecOperationInterestFieldEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'INTEREST')
  static const TargetingSpecOperationInterestFieldEnum INTEREST = _$targetingSpecOperationInterestFieldEnum_INTEREST;

  static Serializer<TargetingSpecOperationInterestFieldEnum> get serializer => _$targetingSpecOperationInterestFieldEnumSerializer;

  const TargetingSpecOperationInterestFieldEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationInterestFieldEnum> get values => _$targetingSpecOperationInterestFieldEnumValues;
  static TargetingSpecOperationInterestFieldEnum valueOf(String name) => _$targetingSpecOperationInterestFieldEnumValueOf(name);
}

