//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_creative_assets_product_group_product_counts.g.dart';

/// Product counts for a Creative Assets CatalogsProductGroup
///
/// Properties:
/// * [appLinks] 
/// * [catalogType] 
/// * [images] 
/// * [total] 
/// * [videos] 
@BuiltValue()
abstract class CatalogsCreativeAssetsProductGroupProductCounts implements Built<CatalogsCreativeAssetsProductGroupProductCounts, CatalogsCreativeAssetsProductGroupProductCountsBuilder> {
  @BuiltValueField(wireName: r'app_links')
  num get appLinks;

  @BuiltValueField(wireName: r'catalog_type')
  CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  CREATIVE_ASSETS,  };

  @BuiltValueField(wireName: r'images')
  num get images;

  @BuiltValueField(wireName: r'total')
  num get total;

  @BuiltValueField(wireName: r'videos')
  num get videos;

  CatalogsCreativeAssetsProductGroupProductCounts._();

  factory CatalogsCreativeAssetsProductGroupProductCounts([void updates(CatalogsCreativeAssetsProductGroupProductCountsBuilder b)]) = _$CatalogsCreativeAssetsProductGroupProductCounts;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreativeAssetsProductGroupProductCountsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreativeAssetsProductGroupProductCounts> get serializer => _$CatalogsCreativeAssetsProductGroupProductCountsSerializer();
}

class _$CatalogsCreativeAssetsProductGroupProductCountsSerializer implements PrimitiveSerializer<CatalogsCreativeAssetsProductGroupProductCounts> {
  @override
  final Iterable<Type> types = const [CatalogsCreativeAssetsProductGroupProductCounts, _$CatalogsCreativeAssetsProductGroupProductCounts];

  @override
  final String wireName = r'CatalogsCreativeAssetsProductGroupProductCounts';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreativeAssetsProductGroupProductCounts object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'app_links';
    yield serializers.serialize(
      object.appLinks,
      specifiedType: const FullType(num),
    );
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum),
    );
    yield r'images';
    yield serializers.serialize(
      object.images,
      specifiedType: const FullType(num),
    );
    yield r'total';
    yield serializers.serialize(
      object.total,
      specifiedType: const FullType(num),
    );
    yield r'videos';
    yield serializers.serialize(
      object.videos,
      specifiedType: const FullType(num),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsCreativeAssetsProductGroupProductCounts object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsCreativeAssetsProductGroupProductCountsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'app_links':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.appLinks = valueDes;
          break;
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum),
          ) as CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'images':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.images = valueDes;
          break;
        case r'total':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.total = valueDes;
          break;
        case r'videos':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.videos = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsCreativeAssetsProductGroupProductCounts deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreativeAssetsProductGroupProductCountsBuilder();
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

class CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum CREATIVE_ASSETS = _$catalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum> get serializer => _$catalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnumSerializer;

  const CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum> get values => _$catalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnumValues;
  static CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum valueOf(String name) => _$catalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnumValueOf(name);
}

