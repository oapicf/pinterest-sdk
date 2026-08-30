//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/targeting_spec_age_bucket.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_spec_operation_age_bucket.g.dart';

/// TargetingSpecOperationAgeBucket
///
/// Properties:
/// * [field] 
/// * [operation] 
/// * [values] 
@BuiltValue()
abstract class TargetingSpecOperationAgeBucket implements Built<TargetingSpecOperationAgeBucket, TargetingSpecOperationAgeBucketBuilder> {
  @BuiltValueField(wireName: r'field')
  TargetingSpecOperationAgeBucketFieldEnum get field;
  // enum fieldEnum {  AGE_BUCKET,  };

  @BuiltValueField(wireName: r'operation')
  TargetingSpecOperationAgeBucketOperationEnum get operation;
  // enum operationEnum {  SET,  };

  @BuiltValueField(wireName: r'values')
  BuiltList<TargetingSpecAgeBucket> get values;

  TargetingSpecOperationAgeBucket._();

  factory TargetingSpecOperationAgeBucket([void updates(TargetingSpecOperationAgeBucketBuilder b)]) = _$TargetingSpecOperationAgeBucket;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingSpecOperationAgeBucketBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingSpecOperationAgeBucket> get serializer => _$TargetingSpecOperationAgeBucketSerializer();
}

class _$TargetingSpecOperationAgeBucketSerializer implements PrimitiveSerializer<TargetingSpecOperationAgeBucket> {
  @override
  final Iterable<Type> types = const [TargetingSpecOperationAgeBucket, _$TargetingSpecOperationAgeBucket];

  @override
  final String wireName = r'TargetingSpecOperationAgeBucket';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingSpecOperationAgeBucket object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'field';
    yield serializers.serialize(
      object.field,
      specifiedType: const FullType(TargetingSpecOperationAgeBucketFieldEnum),
    );
    yield r'operation';
    yield serializers.serialize(
      object.operation,
      specifiedType: const FullType(TargetingSpecOperationAgeBucketOperationEnum),
    );
    yield r'values';
    yield serializers.serialize(
      object.values,
      specifiedType: const FullType(BuiltList, [FullType(TargetingSpecAgeBucket)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    TargetingSpecOperationAgeBucket object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingSpecOperationAgeBucketBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'field':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingSpecOperationAgeBucketFieldEnum),
          ) as TargetingSpecOperationAgeBucketFieldEnum;
          result.field = valueDes;
          break;
        case r'operation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingSpecOperationAgeBucketOperationEnum),
          ) as TargetingSpecOperationAgeBucketOperationEnum;
          result.operation = valueDes;
          break;
        case r'values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(TargetingSpecAgeBucket)]),
          ) as BuiltList<TargetingSpecAgeBucket>;
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
  TargetingSpecOperationAgeBucket deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingSpecOperationAgeBucketBuilder();
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

class TargetingSpecOperationAgeBucketFieldEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'AGE_BUCKET')
  static const TargetingSpecOperationAgeBucketFieldEnum AGE_BUCKET = _$targetingSpecOperationAgeBucketFieldEnum_AGE_BUCKET;

  static Serializer<TargetingSpecOperationAgeBucketFieldEnum> get serializer => _$targetingSpecOperationAgeBucketFieldEnumSerializer;

  const TargetingSpecOperationAgeBucketFieldEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationAgeBucketFieldEnum> get values => _$targetingSpecOperationAgeBucketFieldEnumValues;
  static TargetingSpecOperationAgeBucketFieldEnum valueOf(String name) => _$targetingSpecOperationAgeBucketFieldEnumValueOf(name);
}

class TargetingSpecOperationAgeBucketOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'SET')
  static const TargetingSpecOperationAgeBucketOperationEnum SET = _$targetingSpecOperationAgeBucketOperationEnum_SET;

  static Serializer<TargetingSpecOperationAgeBucketOperationEnum> get serializer => _$targetingSpecOperationAgeBucketOperationEnumSerializer;

  const TargetingSpecOperationAgeBucketOperationEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationAgeBucketOperationEnum> get values => _$targetingSpecOperationAgeBucketOperationEnumValues;
  static TargetingSpecOperationAgeBucketOperationEnum valueOf(String name) => _$targetingSpecOperationAgeBucketOperationEnumValueOf(name);
}

