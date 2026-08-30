//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/numeric_filter_operator_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_product_group_uint32_criteria.g.dart';

/// CatalogsProductGroupUint32Criteria
///
/// Properties:
/// * [negated] 
/// * [operator_] 
/// * [value] 
@BuiltValue()
abstract class CatalogsProductGroupUint32Criteria implements Built<CatalogsProductGroupUint32Criteria, CatalogsProductGroupUint32CriteriaBuilder> {
  @BuiltValueField(wireName: r'negated')
  bool? get negated;

  @BuiltValueField(wireName: r'operator')
  NumericFilterOperatorType get operator_;
  // enum operator_Enum {  GREATER_THAN,  GREATER_THAN_OR_EQUALS,  LESS_THAN,  LESS_THAN_OR_EQUALS,  };

  @BuiltValueField(wireName: r'value')
  int get value;

  CatalogsProductGroupUint32Criteria._();

  factory CatalogsProductGroupUint32Criteria([void updates(CatalogsProductGroupUint32CriteriaBuilder b)]) = _$CatalogsProductGroupUint32Criteria;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupUint32CriteriaBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupUint32Criteria> get serializer => _$CatalogsProductGroupUint32CriteriaSerializer();
}

class _$CatalogsProductGroupUint32CriteriaSerializer implements PrimitiveSerializer<CatalogsProductGroupUint32Criteria> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupUint32Criteria, _$CatalogsProductGroupUint32Criteria];

  @override
  final String wireName = r'CatalogsProductGroupUint32Criteria';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupUint32Criteria object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.negated != null) {
      yield r'negated';
      yield serializers.serialize(
        object.negated,
        specifiedType: const FullType(bool),
      );
    }
    yield r'operator';
    yield serializers.serialize(
      object.operator_,
      specifiedType: const FullType(NumericFilterOperatorType),
    );
    yield r'value';
    yield serializers.serialize(
      object.value,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupUint32Criteria object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsProductGroupUint32CriteriaBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'negated':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.negated = valueDes;
          break;
        case r'operator':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(NumericFilterOperatorType),
          ) as NumericFilterOperatorType;
          result.operator_ = valueDes;
          break;
        case r'value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.value = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsProductGroupUint32Criteria deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupUint32CriteriaBuilder();
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

