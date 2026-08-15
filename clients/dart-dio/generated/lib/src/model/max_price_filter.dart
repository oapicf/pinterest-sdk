//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_pricing_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'max_price_filter.g.dart';

/// MaxPriceFilter
///
/// Properties:
/// * [MAX_PRICE] 
@BuiltValue()
abstract class MaxPriceFilter implements Built<MaxPriceFilter, MaxPriceFilterBuilder> {
  @BuiltValueField(wireName: r'MAX_PRICE')
  CatalogsProductGroupPricingCriteria get MAX_PRICE;

  MaxPriceFilter._();

  factory MaxPriceFilter([void updates(MaxPriceFilterBuilder b)]) = _$MaxPriceFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MaxPriceFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MaxPriceFilter> get serializer => _$MaxPriceFilterSerializer();
}

class _$MaxPriceFilterSerializer implements PrimitiveSerializer<MaxPriceFilter> {
  @override
  final Iterable<Type> types = const [MaxPriceFilter, _$MaxPriceFilter];

  @override
  final String wireName = r'MaxPriceFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MaxPriceFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'MAX_PRICE';
    yield serializers.serialize(
      object.MAX_PRICE,
      specifiedType: const FullType(CatalogsProductGroupPricingCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MaxPriceFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MaxPriceFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'MAX_PRICE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupPricingCriteria),
          ) as CatalogsProductGroupPricingCriteria;
          result.MAX_PRICE = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MaxPriceFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MaxPriceFilterBuilder();
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

