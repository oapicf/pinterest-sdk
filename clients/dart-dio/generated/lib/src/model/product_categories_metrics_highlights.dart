//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/inner_product_categories_metrics_highlights.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_categories_metrics_highlights.g.dart';

/// Key performance metrics highlights for this product category
///
/// Properties:
/// * [engagement] - Engagement metric value
/// * [outboundClicks] - Number of outbound clicks
/// * [pinSaves] - Number of pin saves
@BuiltValue()
abstract class ProductCategoriesMetricsHighlights implements Built<ProductCategoriesMetricsHighlights, ProductCategoriesMetricsHighlightsBuilder> {
  /// Engagement metric value
  @BuiltValueField(wireName: r'engagement')
  InnerProductCategoriesMetricsHighlights? get engagement;

  /// Number of outbound clicks
  @BuiltValueField(wireName: r'outbound_clicks')
  InnerProductCategoriesMetricsHighlights? get outboundClicks;

  /// Number of pin saves
  @BuiltValueField(wireName: r'pin_saves')
  InnerProductCategoriesMetricsHighlights? get pinSaves;

  ProductCategoriesMetricsHighlights._();

  factory ProductCategoriesMetricsHighlights([void updates(ProductCategoriesMetricsHighlightsBuilder b)]) = _$ProductCategoriesMetricsHighlights;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProductCategoriesMetricsHighlightsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProductCategoriesMetricsHighlights> get serializer => _$ProductCategoriesMetricsHighlightsSerializer();
}

class _$ProductCategoriesMetricsHighlightsSerializer implements PrimitiveSerializer<ProductCategoriesMetricsHighlights> {
  @override
  final Iterable<Type> types = const [ProductCategoriesMetricsHighlights, _$ProductCategoriesMetricsHighlights];

  @override
  final String wireName = r'ProductCategoriesMetricsHighlights';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProductCategoriesMetricsHighlights object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.engagement != null) {
      yield r'engagement';
      yield serializers.serialize(
        object.engagement,
        specifiedType: const FullType(InnerProductCategoriesMetricsHighlights),
      );
    }
    if (object.outboundClicks != null) {
      yield r'outbound_clicks';
      yield serializers.serialize(
        object.outboundClicks,
        specifiedType: const FullType(InnerProductCategoriesMetricsHighlights),
      );
    }
    if (object.pinSaves != null) {
      yield r'pin_saves';
      yield serializers.serialize(
        object.pinSaves,
        specifiedType: const FullType(InnerProductCategoriesMetricsHighlights),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ProductCategoriesMetricsHighlights object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProductCategoriesMetricsHighlightsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'engagement':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(InnerProductCategoriesMetricsHighlights),
          ) as InnerProductCategoriesMetricsHighlights;
          result.engagement.replace(valueDes);
          break;
        case r'outbound_clicks':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(InnerProductCategoriesMetricsHighlights),
          ) as InnerProductCategoriesMetricsHighlights;
          result.outboundClicks.replace(valueDes);
          break;
        case r'pin_saves':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(InnerProductCategoriesMetricsHighlights),
          ) as InnerProductCategoriesMetricsHighlights;
          result.pinSaves.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProductCategoriesMetricsHighlights deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProductCategoriesMetricsHighlightsBuilder();
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

