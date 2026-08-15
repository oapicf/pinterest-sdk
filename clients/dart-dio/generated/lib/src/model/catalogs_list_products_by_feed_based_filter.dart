//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_filters.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_list_products_by_feed_based_filter.g.dart';

/// Request object to list products for a given feed_id and product group filter.
///
/// Properties:
/// * [feedId] - Catalog Feed id pertaining to the catalog product group filter.
/// * [filters] 
@BuiltValue()
abstract class CatalogsListProductsByFeedBasedFilter implements Built<CatalogsListProductsByFeedBasedFilter, CatalogsListProductsByFeedBasedFilterBuilder> {
  /// Catalog Feed id pertaining to the catalog product group filter.
  @BuiltValueField(wireName: r'feed_id')
  String get feedId;

  @BuiltValueField(wireName: r'filters')
  CatalogsProductGroupFilters get filters;

  CatalogsListProductsByFeedBasedFilter._();

  factory CatalogsListProductsByFeedBasedFilter([void updates(CatalogsListProductsByFeedBasedFilterBuilder b)]) = _$CatalogsListProductsByFeedBasedFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsListProductsByFeedBasedFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsListProductsByFeedBasedFilter> get serializer => _$CatalogsListProductsByFeedBasedFilterSerializer();
}

class _$CatalogsListProductsByFeedBasedFilterSerializer implements PrimitiveSerializer<CatalogsListProductsByFeedBasedFilter> {
  @override
  final Iterable<Type> types = const [CatalogsListProductsByFeedBasedFilter, _$CatalogsListProductsByFeedBasedFilter];

  @override
  final String wireName = r'CatalogsListProductsByFeedBasedFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsListProductsByFeedBasedFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'feed_id';
    yield serializers.serialize(
      object.feedId,
      specifiedType: const FullType(String),
    );
    yield r'filters';
    yield serializers.serialize(
      object.filters,
      specifiedType: const FullType(CatalogsProductGroupFilters),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsListProductsByFeedBasedFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsListProductsByFeedBasedFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'feed_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.feedId = valueDes;
          break;
        case r'filters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupFilters),
          ) as CatalogsProductGroupFilters;
          result.filters.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsListProductsByFeedBasedFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsListProductsByFeedBasedFilterBuilder();
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

