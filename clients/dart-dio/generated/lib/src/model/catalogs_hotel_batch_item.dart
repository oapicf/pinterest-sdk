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
import 'package:one_of/one_of.dart';

part 'catalogs_hotel_batch_item.g.dart';

/// Hotel batch item
///
/// Properties:
/// * [attributes] 
/// * [hotelId] - The catalog hotel id in the merchant namespace
/// * [operation] 
@BuiltValue()
abstract class CatalogsHotelBatchItem implements Built<CatalogsHotelBatchItem, CatalogsHotelBatchItemBuilder> {
  /// One Of [CatalogsCreateHotelItem], [CatalogsDeleteHotelItem], [CatalogsUpdateHotelItem], [CatalogsUpsertHotelItem]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'operation';

  static const Map<String, Type> discriminatorMapping = {
    r'CREATE': CatalogsCreateHotelItem,
    r'DELETE': CatalogsDeleteHotelItem,
    r'UPDATE': CatalogsUpdateHotelItem,
    r'UPSERT': CatalogsUpsertHotelItem,
  };

  CatalogsHotelBatchItem._();

  factory CatalogsHotelBatchItem([void updates(CatalogsHotelBatchItemBuilder b)]) = _$CatalogsHotelBatchItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelBatchItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelBatchItem> get serializer => _$CatalogsHotelBatchItemSerializer();
}

extension CatalogsHotelBatchItemDiscriminatorExt on CatalogsHotelBatchItem {
    String? get discriminatorValue {
        if (this is CatalogsCreateHotelItem) {
            return r'CREATE';
        }
        if (this is CatalogsDeleteHotelItem) {
            return r'DELETE';
        }
        if (this is CatalogsUpdateHotelItem) {
            return r'UPDATE';
        }
        if (this is CatalogsUpsertHotelItem) {
            return r'UPSERT';
        }
        return null;
    }
}
extension CatalogsHotelBatchItemBuilderDiscriminatorExt on CatalogsHotelBatchItemBuilder {
    String? get discriminatorValue {
        if (this is CatalogsCreateHotelItemBuilder) {
            return r'CREATE';
        }
        if (this is CatalogsDeleteHotelItemBuilder) {
            return r'DELETE';
        }
        if (this is CatalogsUpdateHotelItemBuilder) {
            return r'UPDATE';
        }
        if (this is CatalogsUpsertHotelItemBuilder) {
            return r'UPSERT';
        }
        return null;
    }
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
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsHotelBatchItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelBatchItemBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsHotelBatchItem.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsCreateHotelItem, CatalogsDeleteHotelItem, CatalogsUpdateHotelItem, CatalogsUpsertHotelItem, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'CREATE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsCreateHotelItem),
        ) as CatalogsCreateHotelItem;
        oneOfType = CatalogsCreateHotelItem;
        break;
      case r'DELETE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsDeleteHotelItem),
        ) as CatalogsDeleteHotelItem;
        oneOfType = CatalogsDeleteHotelItem;
        break;
      case r'UPDATE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsUpdateHotelItem),
        ) as CatalogsUpdateHotelItem;
        oneOfType = CatalogsUpdateHotelItem;
        break;
      case r'UPSERT':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsUpsertHotelItem),
        ) as CatalogsUpsertHotelItem;
        oneOfType = CatalogsUpsertHotelItem;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
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

