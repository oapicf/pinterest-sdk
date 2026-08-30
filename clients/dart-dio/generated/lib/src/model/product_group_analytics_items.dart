//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/date.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_group_analytics_items.g.dart';

/// ProductGroupAnalyticsItems
///
/// Properties:
/// * [DATE] - Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
/// * [PRODUCT_GROUP_ID] - The ID of the product group that this metrics belongs to.
@BuiltValue()
abstract class ProductGroupAnalyticsItems implements Built<ProductGroupAnalyticsItems, ProductGroupAnalyticsItemsBuilder> {
  /// Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  @BuiltValueField(wireName: r'DATE')
  Date? get DATE;

  /// The ID of the product group that this metrics belongs to.
  @BuiltValueField(wireName: r'PRODUCT_GROUP_ID')
  String get PRODUCT_GROUP_ID;

  ProductGroupAnalyticsItems._();

  factory ProductGroupAnalyticsItems([void updates(ProductGroupAnalyticsItemsBuilder b)]) = _$ProductGroupAnalyticsItems;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProductGroupAnalyticsItemsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProductGroupAnalyticsItems> get serializer => _$ProductGroupAnalyticsItemsSerializer();
}

class _$ProductGroupAnalyticsItemsSerializer implements PrimitiveSerializer<ProductGroupAnalyticsItems> {
  @override
  final Iterable<Type> types = const [ProductGroupAnalyticsItems, _$ProductGroupAnalyticsItems];

  @override
  final String wireName = r'ProductGroupAnalyticsItems';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProductGroupAnalyticsItems object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.DATE != null) {
      yield r'DATE';
      yield serializers.serialize(
        object.DATE,
        specifiedType: const FullType(Date),
      );
    }
    yield r'PRODUCT_GROUP_ID';
    yield serializers.serialize(
      object.PRODUCT_GROUP_ID,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ProductGroupAnalyticsItems object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProductGroupAnalyticsItemsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'DATE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Date),
          ) as Date?;
          if (valueDes == null) continue;
          result.DATE = valueDes;
          break;
        case r'PRODUCT_GROUP_ID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.PRODUCT_GROUP_ID = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProductGroupAnalyticsItems deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProductGroupAnalyticsItemsBuilder();
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

