//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/gender.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_product_group_multiple_gender_criteria.g.dart';

/// CatalogsProductGroupMultipleGenderCriteria
///
/// Properties:
/// * [negated] 
/// * [values] 
@BuiltValue()
abstract class CatalogsProductGroupMultipleGenderCriteria implements Built<CatalogsProductGroupMultipleGenderCriteria, CatalogsProductGroupMultipleGenderCriteriaBuilder> {
  @BuiltValueField(wireName: r'negated')
  bool? get negated;

  @BuiltValueField(wireName: r'values')
  BuiltList<Gender> get values;

  CatalogsProductGroupMultipleGenderCriteria._();

  factory CatalogsProductGroupMultipleGenderCriteria([void updates(CatalogsProductGroupMultipleGenderCriteriaBuilder b)]) = _$CatalogsProductGroupMultipleGenderCriteria;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupMultipleGenderCriteriaBuilder b) => b
      ..negated = false;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupMultipleGenderCriteria> get serializer => _$CatalogsProductGroupMultipleGenderCriteriaSerializer();
}

class _$CatalogsProductGroupMultipleGenderCriteriaSerializer implements PrimitiveSerializer<CatalogsProductGroupMultipleGenderCriteria> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupMultipleGenderCriteria, _$CatalogsProductGroupMultipleGenderCriteria];

  @override
  final String wireName = r'CatalogsProductGroupMultipleGenderCriteria';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupMultipleGenderCriteria object, {
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
      specifiedType: const FullType(BuiltList, [FullType(Gender)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupMultipleGenderCriteria object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsProductGroupMultipleGenderCriteriaBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(Gender)]),
          ) as BuiltList<Gender>;
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
  CatalogsProductGroupMultipleGenderCriteria deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupMultipleGenderCriteriaBuilder();
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

