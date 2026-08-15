//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/country.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_product_group_multiple_countries_criteria.g.dart';

/// CatalogsProductGroupMultipleCountriesCriteria
///
/// Properties:
/// * [negated] 
/// * [values] 
@BuiltValue()
abstract class CatalogsProductGroupMultipleCountriesCriteria implements Built<CatalogsProductGroupMultipleCountriesCriteria, CatalogsProductGroupMultipleCountriesCriteriaBuilder> {
  @BuiltValueField(wireName: r'negated')
  bool? get negated;

  @BuiltValueField(wireName: r'values')
  BuiltList<Country> get values;

  CatalogsProductGroupMultipleCountriesCriteria._();

  factory CatalogsProductGroupMultipleCountriesCriteria([void updates(CatalogsProductGroupMultipleCountriesCriteriaBuilder b)]) = _$CatalogsProductGroupMultipleCountriesCriteria;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupMultipleCountriesCriteriaBuilder b) => b
      ..negated = false;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupMultipleCountriesCriteria> get serializer => _$CatalogsProductGroupMultipleCountriesCriteriaSerializer();
}

class _$CatalogsProductGroupMultipleCountriesCriteriaSerializer implements PrimitiveSerializer<CatalogsProductGroupMultipleCountriesCriteria> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupMultipleCountriesCriteria, _$CatalogsProductGroupMultipleCountriesCriteria];

  @override
  final String wireName = r'CatalogsProductGroupMultipleCountriesCriteria';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupMultipleCountriesCriteria object, {
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
      specifiedType: const FullType(BuiltList, [FullType(Country)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupMultipleCountriesCriteria object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsProductGroupMultipleCountriesCriteriaBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(Country)]),
          ) as BuiltList<Country>;
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
  CatalogsProductGroupMultipleCountriesCriteria deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupMultipleCountriesCriteriaBuilder();
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

