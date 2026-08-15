//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'inner_product_categories_metrics_highlights.g.dart';

/// InnerProductCategoriesMetricsHighlights
///
/// Properties:
/// * [pctChangeMom] - Month-over-month percentage change
@BuiltValue()
abstract class InnerProductCategoriesMetricsHighlights implements Built<InnerProductCategoriesMetricsHighlights, InnerProductCategoriesMetricsHighlightsBuilder> {
  /// Month-over-month percentage change
  @BuiltValueField(wireName: r'pct_change_mom')
  num get pctChangeMom;

  InnerProductCategoriesMetricsHighlights._();

  factory InnerProductCategoriesMetricsHighlights([void updates(InnerProductCategoriesMetricsHighlightsBuilder b)]) = _$InnerProductCategoriesMetricsHighlights;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(InnerProductCategoriesMetricsHighlightsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<InnerProductCategoriesMetricsHighlights> get serializer => _$InnerProductCategoriesMetricsHighlightsSerializer();
}

class _$InnerProductCategoriesMetricsHighlightsSerializer implements PrimitiveSerializer<InnerProductCategoriesMetricsHighlights> {
  @override
  final Iterable<Type> types = const [InnerProductCategoriesMetricsHighlights, _$InnerProductCategoriesMetricsHighlights];

  @override
  final String wireName = r'InnerProductCategoriesMetricsHighlights';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    InnerProductCategoriesMetricsHighlights object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'pct_change_mom';
    yield serializers.serialize(
      object.pctChangeMom,
      specifiedType: const FullType(num),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    InnerProductCategoriesMetricsHighlights object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required InnerProductCategoriesMetricsHighlightsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pct_change_mom':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.pctChangeMom = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  InnerProductCategoriesMetricsHighlights deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = InnerProductCategoriesMetricsHighlightsBuilder();
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

