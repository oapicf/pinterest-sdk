//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/filter_operator_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_product_group_filter_operator_type_criteria.g.dart';

/// CatalogsProductGroupFilterOperatorTypeCriteria
///
/// Properties:
/// * [filterOperatorType] 
/// * [negated] 
/// * [values] 
@BuiltValue()
abstract class CatalogsProductGroupFilterOperatorTypeCriteria implements Built<CatalogsProductGroupFilterOperatorTypeCriteria, CatalogsProductGroupFilterOperatorTypeCriteriaBuilder> {
  @BuiltValueField(wireName: r'filter_operator_type')
  FilterOperatorType? get filterOperatorType;
  // enum filterOperatorTypeEnum {  IS,  CONTAINS,  };

  @BuiltValueField(wireName: r'negated')
  bool? get negated;

  @BuiltValueField(wireName: r'values')
  BuiltList<String> get values;

  CatalogsProductGroupFilterOperatorTypeCriteria._();

  factory CatalogsProductGroupFilterOperatorTypeCriteria([void updates(CatalogsProductGroupFilterOperatorTypeCriteriaBuilder b)]) = _$CatalogsProductGroupFilterOperatorTypeCriteria;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupFilterOperatorTypeCriteriaBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupFilterOperatorTypeCriteria> get serializer => _$CatalogsProductGroupFilterOperatorTypeCriteriaSerializer();
}

class _$CatalogsProductGroupFilterOperatorTypeCriteriaSerializer implements PrimitiveSerializer<CatalogsProductGroupFilterOperatorTypeCriteria> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupFilterOperatorTypeCriteria, _$CatalogsProductGroupFilterOperatorTypeCriteria];

  @override
  final String wireName = r'CatalogsProductGroupFilterOperatorTypeCriteria';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupFilterOperatorTypeCriteria object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.filterOperatorType != null) {
      yield r'filter_operator_type';
      yield serializers.serialize(
        object.filterOperatorType,
        specifiedType: const FullType(FilterOperatorType),
      );
    }
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
    CatalogsProductGroupFilterOperatorTypeCriteria object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsProductGroupFilterOperatorTypeCriteriaBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'filter_operator_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(FilterOperatorType),
          ) as FilterOperatorType?;
          if (valueDes == null) continue;
          result.filterOperatorType = valueDes;
          break;
        case r'negated':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
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
  CatalogsProductGroupFilterOperatorTypeCriteria deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupFilterOperatorTypeCriteriaBuilder();
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

