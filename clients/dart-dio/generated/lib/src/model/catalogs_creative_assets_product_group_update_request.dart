//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_creative_assets_product_group_filters.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_creative_assets_product_group_update_request.g.dart';

/// Request object for updating a creative assets product group.
///
/// Properties:
/// * [catalogType] 
/// * [description] 
/// * [filters] 
/// * [name] 
@BuiltValue()
abstract class CatalogsCreativeAssetsProductGroupUpdateRequest implements Built<CatalogsCreativeAssetsProductGroupUpdateRequest, CatalogsCreativeAssetsProductGroupUpdateRequestBuilder> {
  @BuiltValueField(wireName: r'catalog_type')
  CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum? get catalogType;
  // enum catalogTypeEnum {  CREATIVE_ASSETS,  };

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'filters')
  CatalogsCreativeAssetsProductGroupFilters? get filters;

  @BuiltValueField(wireName: r'name')
  String? get name;

  CatalogsCreativeAssetsProductGroupUpdateRequest._();

  factory CatalogsCreativeAssetsProductGroupUpdateRequest([void updates(CatalogsCreativeAssetsProductGroupUpdateRequestBuilder b)]) = _$CatalogsCreativeAssetsProductGroupUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreativeAssetsProductGroupUpdateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreativeAssetsProductGroupUpdateRequest> get serializer => _$CatalogsCreativeAssetsProductGroupUpdateRequestSerializer();
}

class _$CatalogsCreativeAssetsProductGroupUpdateRequestSerializer implements PrimitiveSerializer<CatalogsCreativeAssetsProductGroupUpdateRequest> {
  @override
  final Iterable<Type> types = const [CatalogsCreativeAssetsProductGroupUpdateRequest, _$CatalogsCreativeAssetsProductGroupUpdateRequest];

  @override
  final String wireName = r'CatalogsCreativeAssetsProductGroupUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreativeAssetsProductGroupUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.catalogType != null) {
      yield r'catalog_type';
      yield serializers.serialize(
        object.catalogType,
        specifiedType: const FullType(CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.filters != null) {
      yield r'filters';
      yield serializers.serialize(
        object.filters,
        specifiedType: const FullType(CatalogsCreativeAssetsProductGroupFilters),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsCreativeAssetsProductGroupUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsCreativeAssetsProductGroupUpdateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum),
          ) as CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'filters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsCreativeAssetsProductGroupFilters),
          ) as CatalogsCreativeAssetsProductGroupFilters;
          result.filters.replace(valueDes);
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsCreativeAssetsProductGroupUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreativeAssetsProductGroupUpdateRequestBuilder();
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

class CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum CREATIVE_ASSETS = _$catalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum> get serializer => _$catalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnumSerializer;

  const CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum> get values => _$catalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnumValues;
  static CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum valueOf(String name) => _$catalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnumValueOf(name);
}

