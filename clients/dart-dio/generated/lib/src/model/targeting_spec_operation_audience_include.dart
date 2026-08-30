//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec_list_operation.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_spec_operation_audience_include.g.dart';

/// TargetingSpecOperationAudienceInclude
///
/// Properties:
/// * [field] 
/// * [operation] 
/// * [values] 
@BuiltValue()
abstract class TargetingSpecOperationAudienceInclude implements Built<TargetingSpecOperationAudienceInclude, TargetingSpecOperationAudienceIncludeBuilder> {
  @BuiltValueField(wireName: r'field')
  TargetingSpecOperationAudienceIncludeFieldEnum get field;
  // enum fieldEnum {  AUDIENCE_INCLUDE,  };

  @BuiltValueField(wireName: r'operation')
  TargetingSpecListOperation get operation;
  // enum operationEnum {  SET,  ADD,  REMOVE,  };

  @BuiltValueField(wireName: r'values')
  BuiltList<String> get values;

  TargetingSpecOperationAudienceInclude._();

  factory TargetingSpecOperationAudienceInclude([void updates(TargetingSpecOperationAudienceIncludeBuilder b)]) = _$TargetingSpecOperationAudienceInclude;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingSpecOperationAudienceIncludeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingSpecOperationAudienceInclude> get serializer => _$TargetingSpecOperationAudienceIncludeSerializer();
}

class _$TargetingSpecOperationAudienceIncludeSerializer implements PrimitiveSerializer<TargetingSpecOperationAudienceInclude> {
  @override
  final Iterable<Type> types = const [TargetingSpecOperationAudienceInclude, _$TargetingSpecOperationAudienceInclude];

  @override
  final String wireName = r'TargetingSpecOperationAudienceInclude';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingSpecOperationAudienceInclude object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'field';
    yield serializers.serialize(
      object.field,
      specifiedType: const FullType(TargetingSpecOperationAudienceIncludeFieldEnum),
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
    TargetingSpecOperationAudienceInclude object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingSpecOperationAudienceIncludeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'field':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingSpecOperationAudienceIncludeFieldEnum),
          ) as TargetingSpecOperationAudienceIncludeFieldEnum;
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
  TargetingSpecOperationAudienceInclude deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingSpecOperationAudienceIncludeBuilder();
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

class TargetingSpecOperationAudienceIncludeFieldEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'AUDIENCE_INCLUDE')
  static const TargetingSpecOperationAudienceIncludeFieldEnum AUDIENCE_INCLUDE = _$targetingSpecOperationAudienceIncludeFieldEnum_AUDIENCE_INCLUDE;

  static Serializer<TargetingSpecOperationAudienceIncludeFieldEnum> get serializer => _$targetingSpecOperationAudienceIncludeFieldEnumSerializer;

  const TargetingSpecOperationAudienceIncludeFieldEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationAudienceIncludeFieldEnum> get values => _$targetingSpecOperationAudienceIncludeFieldEnumValues;
  static TargetingSpecOperationAudienceIncludeFieldEnum valueOf(String name) => _$targetingSpecOperationAudienceIncludeFieldEnumValueOf(name);
}

