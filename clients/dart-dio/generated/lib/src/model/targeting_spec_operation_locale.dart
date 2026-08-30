//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec_list_operation.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_spec_operation_locale.g.dart';

/// TargetingSpecOperationLocale
///
/// Properties:
/// * [field] 
/// * [operation] 
/// * [values] 
@BuiltValue()
abstract class TargetingSpecOperationLocale implements Built<TargetingSpecOperationLocale, TargetingSpecOperationLocaleBuilder> {
  @BuiltValueField(wireName: r'field')
  TargetingSpecOperationLocaleFieldEnum get field;
  // enum fieldEnum {  LOCALE,  };

  @BuiltValueField(wireName: r'operation')
  TargetingSpecListOperation get operation;
  // enum operationEnum {  SET,  ADD,  REMOVE,  };

  @BuiltValueField(wireName: r'values')
  BuiltList<String> get values;

  TargetingSpecOperationLocale._();

  factory TargetingSpecOperationLocale([void updates(TargetingSpecOperationLocaleBuilder b)]) = _$TargetingSpecOperationLocale;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingSpecOperationLocaleBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingSpecOperationLocale> get serializer => _$TargetingSpecOperationLocaleSerializer();
}

class _$TargetingSpecOperationLocaleSerializer implements PrimitiveSerializer<TargetingSpecOperationLocale> {
  @override
  final Iterable<Type> types = const [TargetingSpecOperationLocale, _$TargetingSpecOperationLocale];

  @override
  final String wireName = r'TargetingSpecOperationLocale';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingSpecOperationLocale object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'field';
    yield serializers.serialize(
      object.field,
      specifiedType: const FullType(TargetingSpecOperationLocaleFieldEnum),
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
    TargetingSpecOperationLocale object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingSpecOperationLocaleBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'field':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingSpecOperationLocaleFieldEnum),
          ) as TargetingSpecOperationLocaleFieldEnum;
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
  TargetingSpecOperationLocale deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingSpecOperationLocaleBuilder();
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

class TargetingSpecOperationLocaleFieldEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'LOCALE')
  static const TargetingSpecOperationLocaleFieldEnum LOCALE = _$targetingSpecOperationLocaleFieldEnum_LOCALE;

  static Serializer<TargetingSpecOperationLocaleFieldEnum> get serializer => _$targetingSpecOperationLocaleFieldEnumSerializer;

  const TargetingSpecOperationLocaleFieldEnum._(String name): super(name);

  static BuiltSet<TargetingSpecOperationLocaleFieldEnum> get values => _$targetingSpecOperationLocaleFieldEnumValues;
  static TargetingSpecOperationLocaleFieldEnum valueOf(String name) => _$targetingSpecOperationLocaleFieldEnumValueOf(name);
}

