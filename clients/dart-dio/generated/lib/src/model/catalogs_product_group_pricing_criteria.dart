//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_product_group_pricing_criteria.g.dart';

/// CatalogsProductGroupPricingCriteria
///
/// Properties:
/// * [inclusion] 
/// * [negated] 
/// * [values] 
@BuiltValue()
abstract class CatalogsProductGroupPricingCriteria implements Built<CatalogsProductGroupPricingCriteria, CatalogsProductGroupPricingCriteriaBuilder> {
  @BuiltValueField(wireName: r'inclusion')
  bool? get inclusion;

  @BuiltValueField(wireName: r'negated')
  bool? get negated;

  @BuiltValueField(wireName: r'values')
  num get values;

  CatalogsProductGroupPricingCriteria._();

  factory CatalogsProductGroupPricingCriteria([void updates(CatalogsProductGroupPricingCriteriaBuilder b)]) = _$CatalogsProductGroupPricingCriteria;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupPricingCriteriaBuilder b) => b
      ..inclusion = true;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupPricingCriteria> get serializer => _$CatalogsProductGroupPricingCriteriaSerializer();
}

class _$CatalogsProductGroupPricingCriteriaSerializer implements PrimitiveSerializer<CatalogsProductGroupPricingCriteria> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupPricingCriteria, _$CatalogsProductGroupPricingCriteria];

  @override
  final String wireName = r'CatalogsProductGroupPricingCriteria';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupPricingCriteria object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.inclusion != null) {
      yield r'inclusion';
      yield serializers.serialize(
        object.inclusion,
        specifiedType: const FullType(bool),
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
      specifiedType: const FullType(num),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupPricingCriteria object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsProductGroupPricingCriteriaBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'inclusion':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.inclusion = valueDes;
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
            specifiedType: const FullType(num),
          ) as num;
          result.values = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsProductGroupPricingCriteria deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupPricingCriteriaBuilder();
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

