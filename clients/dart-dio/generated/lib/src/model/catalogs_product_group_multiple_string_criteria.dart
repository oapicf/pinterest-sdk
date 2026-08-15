//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_product_group_multiple_string_criteria.g.dart';

/// CatalogsProductGroupMultipleStringCriteria
///
/// Properties:
/// * [negated] 
/// * [values] 
@BuiltValue()
abstract class CatalogsProductGroupMultipleStringCriteria implements Built<CatalogsProductGroupMultipleStringCriteria, CatalogsProductGroupMultipleStringCriteriaBuilder> {
  @BuiltValueField(wireName: r'negated')
  bool? get negated;

  @BuiltValueField(wireName: r'values')
  BuiltList<String> get values;

  CatalogsProductGroupMultipleStringCriteria._();

  factory CatalogsProductGroupMultipleStringCriteria([void updates(CatalogsProductGroupMultipleStringCriteriaBuilder b)]) = _$CatalogsProductGroupMultipleStringCriteria;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupMultipleStringCriteriaBuilder b) => b
      ..negated = false;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupMultipleStringCriteria> get serializer => _$CatalogsProductGroupMultipleStringCriteriaSerializer();
}

class _$CatalogsProductGroupMultipleStringCriteriaSerializer implements PrimitiveSerializer<CatalogsProductGroupMultipleStringCriteria> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupMultipleStringCriteria, _$CatalogsProductGroupMultipleStringCriteria];

  @override
  final String wireName = r'CatalogsProductGroupMultipleStringCriteria';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupMultipleStringCriteria object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.negated != null) {
      yield r'negated';
      yield serializers.serialize(
        object.negated,
        specifiedType: const FullType(bool),
      );
    }
    yield r'values';
    yield serializers.serialize(
      object.values,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupMultipleStringCriteria object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsProductGroupMultipleStringCriteriaBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'negated':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.negated = valueDes;
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
  CatalogsProductGroupMultipleStringCriteria deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupMultipleStringCriteriaBuilder();
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

