//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/product_category_region.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/interests_enum.dart';
import 'package:openapi/src/model/trending_topic.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'featured_trend.g.dart';

/// Featured trending topics for a specific interest and market
///
/// Properties:
/// * [interest] - The main interest category
/// * [market] - Market code (e.g., 'US', 'UK', etc.)
/// * [trends] - List of trending topics within this interest category
@BuiltValue()
abstract class FeaturedTrend implements Built<FeaturedTrend, FeaturedTrendBuilder> {
  /// The main interest category
  @BuiltValueField(wireName: r'interest')
  InterestsEnum get interest;
  // enum interestEnum {  ALL,  ANIMALS,  ARCHITECTURE,  ART,  BEAUTY,  DIY_AND_CRAFTS,  EDUCATION,  EVENT_PLANNING,  FASHION,  FOOD_AND_DRINKS,  GARDENING,  HEALTH,  HOME_DECOR,  PARENTING,  TRAVEL,  WEDDING,  };

  /// Market code (e.g., 'US', 'UK', etc.)
  @BuiltValueField(wireName: r'market')
  ProductCategoryRegion? get market;
  // enum marketEnum {  US,  GB+IE,  CA,  };

  /// List of trending topics within this interest category
  @BuiltValueField(wireName: r'trends')
  BuiltList<TrendingTopic>? get trends;

  FeaturedTrend._();

  factory FeaturedTrend([void updates(FeaturedTrendBuilder b)]) = _$FeaturedTrend;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FeaturedTrendBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FeaturedTrend> get serializer => _$FeaturedTrendSerializer();
}

class _$FeaturedTrendSerializer implements PrimitiveSerializer<FeaturedTrend> {
  @override
  final Iterable<Type> types = const [FeaturedTrend, _$FeaturedTrend];

  @override
  final String wireName = r'FeaturedTrend';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FeaturedTrend object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'interest';
    yield serializers.serialize(
      object.interest,
      specifiedType: const FullType(InterestsEnum),
    );
    if (object.market != null) {
      yield r'market';
      yield serializers.serialize(
        object.market,
        specifiedType: const FullType(ProductCategoryRegion),
      );
    }
    if (object.trends != null) {
      yield r'trends';
      yield serializers.serialize(
        object.trends,
        specifiedType: const FullType(BuiltList, [FullType(TrendingTopic)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    FeaturedTrend object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required FeaturedTrendBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'interest':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(InterestsEnum),
          ) as InterestsEnum;
          result.interest = valueDes;
          break;
        case r'market':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProductCategoryRegion),
          ) as ProductCategoryRegion;
          result.market = valueDes;
          break;
        case r'trends':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(TrendingTopic)]),
          ) as BuiltList<TrendingTopic>;
          result.trends.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  FeaturedTrend deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FeaturedTrendBuilder();
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

