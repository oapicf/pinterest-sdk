//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_delete_hotel_item.dart';
import 'package:openapi/src/model/catalogs_update_hotel_item.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_updatable_hotel_attributes.dart';
import 'package:openapi/src/model/catalogs_create_hotel_item.dart';
import 'package:openapi/src/model/catalogs_upsert_hotel_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'catalogs_hotel_batch_item.g.dart';

/// Hotel batch item
///
/// Properties:
/// * [attributes] 
/// * [hotelId] - The catalog hotel id in the merchant namespace
/// * [operation] 
@BuiltValue()
abstract class CatalogsHotelBatchItem implements Built<CatalogsHotelBatchItem, CatalogsHotelBatchItemBuilder> {
  /// Any Of [CatalogsCreateHotelItem], [CatalogsDeleteHotelItem], [CatalogsUpdateHotelItem], [CatalogsUpsertHotelItem]
  AnyOf get anyOf;

  CatalogsHotelBatchItem._();

  factory CatalogsHotelBatchItem([void updates(CatalogsHotelBatchItemBuilder b)]) = _$CatalogsHotelBatchItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelBatchItemBuilder b) => b..operation=b.discriminatorValue;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelBatchItem> get serializer => _$CatalogsHotelBatchItemSerializer();
}

class _$CatalogsHotelBatchItemSerializer implements PrimitiveSerializer<CatalogsHotelBatchItem> {
  @override
  final Iterable<Type> types = const [CatalogsHotelBatchItem, _$CatalogsHotelBatchItem];

  @override
  final String wireName = r'CatalogsHotelBatchItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelBatchItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelBatchItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CatalogsHotelBatchItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelBatchItemBuilder();
    Object? anyOfDataSrc;
    return result.build();
  }
}

class CatalogsHotelBatchItemOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'DELETE')
  static const CatalogsHotelBatchItemOperationEnum DELETE = _$catalogsHotelBatchItemOperationEnum_DELETE;

  static Serializer<CatalogsHotelBatchItemOperationEnum> get serializer => _$catalogsHotelBatchItemOperationEnumSerializer;

  const CatalogsHotelBatchItemOperationEnum._(String name): super(name);

  static BuiltSet<CatalogsHotelBatchItemOperationEnum> get values => _$catalogsHotelBatchItemOperationEnumValues;
  static CatalogsHotelBatchItemOperationEnum valueOf(String name) => _$catalogsHotelBatchItemOperationEnumValueOf(name);
}

