//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/date.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_group_analytics_response_inner.g.dart';

/// ProductGroupAnalyticsResponseInner
///
/// Properties:
/// * [DATE] - Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
/// * [PRODUCT_GROUP_ID] - The ID of the product group that this metrics belongs to.
@BuiltValue()
abstract class ProductGroupAnalyticsResponseInner implements Built<ProductGroupAnalyticsResponseInner, ProductGroupAnalyticsResponseInnerBuilder> {
  /// Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  @BuiltValueField(wireName: r'DATE')
  Date? get DATE;

  /// The ID of the product group that this metrics belongs to.
  @BuiltValueField(wireName: r'PRODUCT_GROUP_ID')
  String get PRODUCT_GROUP_ID;

  ProductGroupAnalyticsResponseInner._();

  factory ProductGroupAnalyticsResponseInner([void updates(ProductGroupAnalyticsResponseInnerBuilder b)]) = _$ProductGroupAnalyticsResponseInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProductGroupAnalyticsResponseInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProductGroupAnalyticsResponseInner> get serializer => _$ProductGroupAnalyticsResponseInnerSerializer();
}

class _$ProductGroupAnalyticsResponseInnerSerializer implements PrimitiveSerializer<ProductGroupAnalyticsResponseInner> {
  @override
  final Iterable<Type> types = const [ProductGroupAnalyticsResponseInner, _$ProductGroupAnalyticsResponseInner];

  @override
  final String wireName = r'ProductGroupAnalyticsResponseInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProductGroupAnalyticsResponseInner object, {
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
    ProductGroupAnalyticsResponseInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProductGroupAnalyticsResponseInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'DATE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Date),
          ) as Date;
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
  ProductGroupAnalyticsResponseInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProductGroupAnalyticsResponseInnerBuilder();
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

