//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_pricing_currency_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'price_filter.g.dart';

/// PriceFilter
///
/// Properties:
/// * [PRICE] 
@BuiltValue()
abstract class PriceFilter implements Built<PriceFilter, PriceFilterBuilder> {
  @BuiltValueField(wireName: r'PRICE')
  CatalogsProductGroupPricingCurrencyCriteria get PRICE;

  PriceFilter._();

  factory PriceFilter([void updates(PriceFilterBuilder b)]) = _$PriceFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PriceFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PriceFilter> get serializer => _$PriceFilterSerializer();
}

class _$PriceFilterSerializer implements PrimitiveSerializer<PriceFilter> {
  @override
  final Iterable<Type> types = const [PriceFilter, _$PriceFilter];

  @override
  final String wireName = r'PriceFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PriceFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'PRICE';
    yield serializers.serialize(
      object.PRICE,
      specifiedType: const FullType(CatalogsProductGroupPricingCurrencyCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PriceFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PriceFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'PRICE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupPricingCurrencyCriteria),
          ) as CatalogsProductGroupPricingCurrencyCriteria;
          result.PRICE.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PriceFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PriceFilterBuilder();
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

