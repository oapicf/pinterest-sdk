//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_items_post_filter.g.dart';

/// CatalogsHotelItemsPostFilter
///
/// Properties:
/// * [catalogId] - Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
/// * [catalogType] 
/// * [hotelIds] 
@BuiltValue()
abstract class CatalogsHotelItemsPostFilter implements Built<CatalogsHotelItemsPostFilter, CatalogsHotelItemsPostFilterBuilder> {
  /// Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
  @BuiltValueField(wireName: r'catalog_id')
  String? get catalogId;

  @BuiltValueField(wireName: r'catalog_type')
  CatalogsHotelItemsPostFilterCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  HOTEL,  };

  @BuiltValueField(wireName: r'hotel_ids')
  BuiltList<String> get hotelIds;

  CatalogsHotelItemsPostFilter._();

  factory CatalogsHotelItemsPostFilter([void updates(CatalogsHotelItemsPostFilterBuilder b)]) = _$CatalogsHotelItemsPostFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelItemsPostFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelItemsPostFilter> get serializer => _$CatalogsHotelItemsPostFilterSerializer();
}

class _$CatalogsHotelItemsPostFilterSerializer implements PrimitiveSerializer<CatalogsHotelItemsPostFilter> {
  @override
  final Iterable<Type> types = const [CatalogsHotelItemsPostFilter, _$CatalogsHotelItemsPostFilter];

  @override
  final String wireName = r'CatalogsHotelItemsPostFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelItemsPostFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.catalogId != null) {
      yield r'catalog_id';
      yield serializers.serialize(
        object.catalogId,
        specifiedType: const FullType(String),
      );
    }
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsHotelItemsPostFilterCatalogTypeEnum),
    );
    yield r'hotel_ids';
    yield serializers.serialize(
      object.hotelIds,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelItemsPostFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelItemsPostFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.catalogId = valueDes;
          break;
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsHotelItemsPostFilterCatalogTypeEnum),
          ) as CatalogsHotelItemsPostFilterCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'hotel_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.hotelIds.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsHotelItemsPostFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelItemsPostFilterBuilder();
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

class CatalogsHotelItemsPostFilterCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'HOTEL')
  static const CatalogsHotelItemsPostFilterCatalogTypeEnum HOTEL = _$catalogsHotelItemsPostFilterCatalogTypeEnum_HOTEL;

  static Serializer<CatalogsHotelItemsPostFilterCatalogTypeEnum> get serializer => _$catalogsHotelItemsPostFilterCatalogTypeEnumSerializer;

  const CatalogsHotelItemsPostFilterCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsHotelItemsPostFilterCatalogTypeEnum> get values => _$catalogsHotelItemsPostFilterCatalogTypeEnumValues;
  static CatalogsHotelItemsPostFilterCatalogTypeEnum valueOf(String name) => _$catalogsHotelItemsPostFilterCatalogTypeEnumValueOf(name);
}

