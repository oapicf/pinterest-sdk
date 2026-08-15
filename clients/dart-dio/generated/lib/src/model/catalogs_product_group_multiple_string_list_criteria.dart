//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_product_group_multiple_string_list_criteria.g.dart';

/// CatalogsProductGroupMultipleStringListCriteria
///
/// Properties:
/// * [negated] 
/// * [values] 
@BuiltValue()
abstract class CatalogsProductGroupMultipleStringListCriteria implements Built<CatalogsProductGroupMultipleStringListCriteria, CatalogsProductGroupMultipleStringListCriteriaBuilder> {
  @BuiltValueField(wireName: r'negated')
  bool? get negated;

  @BuiltValueField(wireName: r'values')
  BuiltList<BuiltList<String>> get values;

  CatalogsProductGroupMultipleStringListCriteria._();

  factory CatalogsProductGroupMultipleStringListCriteria([void updates(CatalogsProductGroupMultipleStringListCriteriaBuilder b)]) = _$CatalogsProductGroupMultipleStringListCriteria;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupMultipleStringListCriteriaBuilder b) => b
      ..negated = false;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupMultipleStringListCriteria> get serializer => _$CatalogsProductGroupMultipleStringListCriteriaSerializer();
}

class _$CatalogsProductGroupMultipleStringListCriteriaSerializer implements PrimitiveSerializer<CatalogsProductGroupMultipleStringListCriteria> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupMultipleStringListCriteria, _$CatalogsProductGroupMultipleStringListCriteria];

  @override
  final String wireName = r'CatalogsProductGroupMultipleStringListCriteria';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupMultipleStringListCriteria object, {
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
      specifiedType: const FullType(BuiltList, [FullType(BuiltList, [FullType(String)])]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupMultipleStringListCriteria object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsProductGroupMultipleStringListCriteriaBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(BuiltList, [FullType(String)])]),
          ) as BuiltList<BuiltList<String>>;
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
  CatalogsProductGroupMultipleStringListCriteria deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupMultipleStringListCriteriaBuilder();
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

