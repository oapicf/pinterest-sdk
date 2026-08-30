//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_creative_assets_attributes.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pin.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_creative_assets_item_response.g.dart';

/// Object describing a creative assets item record
///
/// Properties:
/// * [attributes] 
/// * [catalogType] 
/// * [creativeAssetsId] - The catalog creative assets id in the merchant namespace
/// * [itemResponseKind] - Discriminator literal identifying this leaf inside an `ItemResponse` payload.
/// * [pins] - The pins mapped to the item
@BuiltValue()
abstract class CatalogsCreativeAssetsItemResponse implements Built<CatalogsCreativeAssetsItemResponse, CatalogsCreativeAssetsItemResponseBuilder> {
  @BuiltValueField(wireName: r'attributes')
  CatalogsCreativeAssetsAttributes? get attributes;

  @BuiltValueField(wireName: r'catalog_type')
  CatalogsCreativeAssetsItemResponseCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  CREATIVE_ASSETS,  };

  /// The catalog creative assets id in the merchant namespace
  @BuiltValueField(wireName: r'creative_assets_id')
  String? get creativeAssetsId;

  /// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
  @BuiltValueField(wireName: r'item_response_kind')
  CatalogsCreativeAssetsItemResponseItemResponseKindEnum get itemResponseKind;
  // enum itemResponseKindEnum {  creative_assets_item,  };

  /// The pins mapped to the item
  @BuiltValueField(wireName: r'pins')
  BuiltList<Pin>? get pins;

  CatalogsCreativeAssetsItemResponse._();

  factory CatalogsCreativeAssetsItemResponse([void updates(CatalogsCreativeAssetsItemResponseBuilder b)]) = _$CatalogsCreativeAssetsItemResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreativeAssetsItemResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreativeAssetsItemResponse> get serializer => _$CatalogsCreativeAssetsItemResponseSerializer();
}

class _$CatalogsCreativeAssetsItemResponseSerializer implements PrimitiveSerializer<CatalogsCreativeAssetsItemResponse> {
  @override
  final Iterable<Type> types = const [CatalogsCreativeAssetsItemResponse, _$CatalogsCreativeAssetsItemResponse];

  @override
  final String wireName = r'CatalogsCreativeAssetsItemResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreativeAssetsItemResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.attributes != null) {
      yield r'attributes';
      yield serializers.serialize(
        object.attributes,
        specifiedType: const FullType(CatalogsCreativeAssetsAttributes),
      );
    }
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsCreativeAssetsItemResponseCatalogTypeEnum),
    );
    if (object.creativeAssetsId != null) {
      yield r'creative_assets_id';
      yield serializers.serialize(
        object.creativeAssetsId,
        specifiedType: const FullType(String),
      );
    }
    yield r'item_response_kind';
    yield serializers.serialize(
      object.itemResponseKind,
      specifiedType: const FullType(CatalogsCreativeAssetsItemResponseItemResponseKindEnum),
    );
    if (object.pins != null) {
      yield r'pins';
      yield serializers.serialize(
        object.pins,
        specifiedType: const FullType.nullable(BuiltList, [FullType(Pin)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsCreativeAssetsItemResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsCreativeAssetsItemResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'attributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CatalogsCreativeAssetsAttributes),
          ) as CatalogsCreativeAssetsAttributes?;
          if (valueDes == null) continue;
          result.attributes.replace(valueDes);
          break;
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsCreativeAssetsItemResponseCatalogTypeEnum),
          ) as CatalogsCreativeAssetsItemResponseCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'creative_assets_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.creativeAssetsId = valueDes;
          break;
        case r'item_response_kind':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsCreativeAssetsItemResponseItemResponseKindEnum),
          ) as CatalogsCreativeAssetsItemResponseItemResponseKindEnum;
          result.itemResponseKind = valueDes;
          break;
        case r'pins':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(Pin)]),
          ) as BuiltList<Pin>?;
          if (valueDes == null) continue;
          result.pins.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsCreativeAssetsItemResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreativeAssetsItemResponseBuilder();
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

class CatalogsCreativeAssetsItemResponseCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsCreativeAssetsItemResponseCatalogTypeEnum CREATIVE_ASSETS = _$catalogsCreativeAssetsItemResponseCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsCreativeAssetsItemResponseCatalogTypeEnum> get serializer => _$catalogsCreativeAssetsItemResponseCatalogTypeEnumSerializer;

  const CatalogsCreativeAssetsItemResponseCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsCreativeAssetsItemResponseCatalogTypeEnum> get values => _$catalogsCreativeAssetsItemResponseCatalogTypeEnumValues;
  static CatalogsCreativeAssetsItemResponseCatalogTypeEnum valueOf(String name) => _$catalogsCreativeAssetsItemResponseCatalogTypeEnumValueOf(name);
}

class CatalogsCreativeAssetsItemResponseItemResponseKindEnum extends EnumClass {

  /// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
  @BuiltValueEnumConst(wireName: r'creative_assets_item')
  static const CatalogsCreativeAssetsItemResponseItemResponseKindEnum creativeAssetsItem = _$catalogsCreativeAssetsItemResponseItemResponseKindEnum_creativeAssetsItem;

  static Serializer<CatalogsCreativeAssetsItemResponseItemResponseKindEnum> get serializer => _$catalogsCreativeAssetsItemResponseItemResponseKindEnumSerializer;

  const CatalogsCreativeAssetsItemResponseItemResponseKindEnum._(String name): super(name);

  static BuiltSet<CatalogsCreativeAssetsItemResponseItemResponseKindEnum> get values => _$catalogsCreativeAssetsItemResponseItemResponseKindEnumValues;
  static CatalogsCreativeAssetsItemResponseItemResponseKindEnum valueOf(String name) => _$catalogsCreativeAssetsItemResponseItemResponseKindEnumValueOf(name);
}

