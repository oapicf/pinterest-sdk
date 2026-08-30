//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/product_categories_engagement_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'trending_product_category.g.dart';

/// Trending shopping product category
///
/// Properties:
/// * [engagementType] - Engagement type
/// * [pctChangeMom] - Month-over-month change percentage
/// * [percentRelativeVolume] - Relative volume percentage
/// * [pinterestProductCategoryId] - Pinterest Product Category Id
/// * [productCategory] - Product Category Name
/// * [verticals] - Vertical name associated with the product category
@BuiltValue()
abstract class TrendingProductCategory implements Built<TrendingProductCategory, TrendingProductCategoryBuilder> {
  /// Engagement type
  @BuiltValueField(wireName: r'engagement_type')
  ProductCategoriesEngagementType get engagementType;
  // enum engagementTypeEnum {  ENGAGEMENT,  OUTBOUND_CLICK,  SAVE,  };

  /// Month-over-month change percentage
  @BuiltValueField(wireName: r'pct_change_mom')
  int get pctChangeMom;

  /// Relative volume percentage
  @BuiltValueField(wireName: r'percent_relative_volume')
  int get percentRelativeVolume;

  /// Pinterest Product Category Id
  @BuiltValueField(wireName: r'pinterest_product_category_id')
  int get pinterestProductCategoryId;

  /// Product Category Name
  @BuiltValueField(wireName: r'product_category')
  String get productCategory;

  /// Vertical name associated with the product category
  @BuiltValueField(wireName: r'verticals')
  BuiltList<String>? get verticals;

  TrendingProductCategory._();

  factory TrendingProductCategory([void updates(TrendingProductCategoryBuilder b)]) = _$TrendingProductCategory;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TrendingProductCategoryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TrendingProductCategory> get serializer => _$TrendingProductCategorySerializer();
}

class _$TrendingProductCategorySerializer implements PrimitiveSerializer<TrendingProductCategory> {
  @override
  final Iterable<Type> types = const [TrendingProductCategory, _$TrendingProductCategory];

  @override
  final String wireName = r'TrendingProductCategory';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TrendingProductCategory object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'engagement_type';
    yield serializers.serialize(
      object.engagementType,
      specifiedType: const FullType(ProductCategoriesEngagementType),
    );
    yield r'pct_change_mom';
    yield serializers.serialize(
      object.pctChangeMom,
      specifiedType: const FullType(int),
    );
    yield r'percent_relative_volume';
    yield serializers.serialize(
      object.percentRelativeVolume,
      specifiedType: const FullType(int),
    );
    yield r'pinterest_product_category_id';
    yield serializers.serialize(
      object.pinterestProductCategoryId,
      specifiedType: const FullType(int),
    );
    yield r'product_category';
    yield serializers.serialize(
      object.productCategory,
      specifiedType: const FullType(String),
    );
    if (object.verticals != null) {
      yield r'verticals';
      yield serializers.serialize(
        object.verticals,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TrendingProductCategory object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TrendingProductCategoryBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'engagement_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProductCategoriesEngagementType),
          ) as ProductCategoriesEngagementType;
          result.engagementType = valueDes;
          break;
        case r'pct_change_mom':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.pctChangeMom = valueDes;
          break;
        case r'percent_relative_volume':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.percentRelativeVolume = valueDes;
          break;
        case r'pinterest_product_category_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.pinterestProductCategoryId = valueDes;
          break;
        case r'product_category':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.productCategory = valueDes;
          break;
        case r'verticals':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.verticals.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TrendingProductCategory deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TrendingProductCategoryBuilder();
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

