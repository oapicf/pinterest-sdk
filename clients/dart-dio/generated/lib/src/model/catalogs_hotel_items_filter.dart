//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_items_filter.g.dart';

/// CatalogsHotelItemsFilter
///
/// Properties:
/// * [catalogId] - Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
/// * [catalogType] 
/// * [hotelIds] 
@BuiltValue()
abstract class CatalogsHotelItemsFilter implements Built<CatalogsHotelItemsFilter, CatalogsHotelItemsFilterBuilder> {
  /// Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
  @BuiltValueField(wireName: r'catalog_id')
  String? get catalogId;

  @BuiltValueField(wireName: r'catalog_type')
  CatalogsHotelItemsFilterCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  HOTEL,  };

  @BuiltValueField(wireName: r'hotel_ids')
  BuiltList<String> get hotelIds;

  CatalogsHotelItemsFilter._();

  factory CatalogsHotelItemsFilter([void updates(CatalogsHotelItemsFilterBuilder b)]) = _$CatalogsHotelItemsFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelItemsFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelItemsFilter> get serializer => _$CatalogsHotelItemsFilterSerializer();
}

class _$CatalogsHotelItemsFilterSerializer implements PrimitiveSerializer<CatalogsHotelItemsFilter> {
  @override
  final Iterable<Type> types = const [CatalogsHotelItemsFilter, _$CatalogsHotelItemsFilter];

  @override
  final String wireName = r'CatalogsHotelItemsFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelItemsFilter object, {
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
      specifiedType: const FullType(CatalogsHotelItemsFilterCatalogTypeEnum),
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
    CatalogsHotelItemsFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelItemsFilterBuilder result,
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
            specifiedType: const FullType(CatalogsHotelItemsFilterCatalogTypeEnum),
          ) as CatalogsHotelItemsFilterCatalogTypeEnum;
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
  CatalogsHotelItemsFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelItemsFilterBuilder();
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

class CatalogsHotelItemsFilterCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'HOTEL')
  static const CatalogsHotelItemsFilterCatalogTypeEnum HOTEL = _$catalogsHotelItemsFilterCatalogTypeEnum_HOTEL;

  static Serializer<CatalogsHotelItemsFilterCatalogTypeEnum> get serializer => _$catalogsHotelItemsFilterCatalogTypeEnumSerializer;

  const CatalogsHotelItemsFilterCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsHotelItemsFilterCatalogTypeEnum> get values => _$catalogsHotelItemsFilterCatalogTypeEnumValues;
  static CatalogsHotelItemsFilterCatalogTypeEnum valueOf(String name) => _$catalogsHotelItemsFilterCatalogTypeEnumValueOf(name);
}

