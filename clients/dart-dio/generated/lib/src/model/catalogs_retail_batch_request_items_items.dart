//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_create_retail_item.dart';
import 'package:openapi/src/model/catalogs_upsert_retail_item.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/update_mask_field_type.dart';
import 'package:openapi/src/model/item_attributes_request.dart';
import 'package:openapi/src/model/catalogs_update_retail_item.dart';
import 'package:openapi/src/model/catalogs_delete_retail_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_retail_batch_request_items_items.g.dart';

/// CatalogsRetailBatchRequestItemsItems
///
/// Properties:
/// * [attributes] 
/// * [itemId] - The catalog item id in the merchant namespace
/// * [operation] 
/// * [updateMask] - The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
/// * [lastUpdatedTime] - The millisecond timestamp when the item was lastly modified by the merchant.
@BuiltValue()
abstract class CatalogsRetailBatchRequestItemsItems implements Built<CatalogsRetailBatchRequestItemsItems, CatalogsRetailBatchRequestItemsItemsBuilder> {
  /// One Of [CatalogsCreateRetailItem], [CatalogsDeleteRetailItem], [CatalogsUpdateRetailItem], [CatalogsUpsertRetailItem]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'operation';

  static const Map<String, Type> discriminatorMapping = {
    r'CREATE': CatalogsCreateRetailItem,
    r'DELETE': CatalogsDeleteRetailItem,
    r'UPDATE': CatalogsUpdateRetailItem,
    r'UPSERT': CatalogsUpsertRetailItem,
  };

  CatalogsRetailBatchRequestItemsItems._();

  factory CatalogsRetailBatchRequestItemsItems([void updates(CatalogsRetailBatchRequestItemsItemsBuilder b)]) = _$CatalogsRetailBatchRequestItemsItems;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsRetailBatchRequestItemsItemsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsRetailBatchRequestItemsItems> get serializer => _$CatalogsRetailBatchRequestItemsItemsSerializer();
}

extension CatalogsRetailBatchRequestItemsItemsDiscriminatorExt on CatalogsRetailBatchRequestItemsItems {
    String? get discriminatorValue {
        if (this is CatalogsCreateRetailItem) {
            return r'CREATE';
        }
        if (this is CatalogsDeleteRetailItem) {
            return r'DELETE';
        }
        if (this is CatalogsUpdateRetailItem) {
            return r'UPDATE';
        }
        if (this is CatalogsUpsertRetailItem) {
            return r'UPSERT';
        }
        return null;
    }
}
extension CatalogsRetailBatchRequestItemsItemsBuilderDiscriminatorExt on CatalogsRetailBatchRequestItemsItemsBuilder {
    String? get discriminatorValue {
        if (this is CatalogsCreateRetailItemBuilder) {
            return r'CREATE';
        }
        if (this is CatalogsDeleteRetailItemBuilder) {
            return r'DELETE';
        }
        if (this is CatalogsUpdateRetailItemBuilder) {
            return r'UPDATE';
        }
        if (this is CatalogsUpsertRetailItemBuilder) {
            return r'UPSERT';
        }
        return null;
    }
}

class _$CatalogsRetailBatchRequestItemsItemsSerializer implements PrimitiveSerializer<CatalogsRetailBatchRequestItemsItems> {
  @override
  final Iterable<Type> types = const [CatalogsRetailBatchRequestItemsItems, _$CatalogsRetailBatchRequestItemsItems];

  @override
  final String wireName = r'CatalogsRetailBatchRequestItemsItems';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsRetailBatchRequestItemsItems object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsRetailBatchRequestItemsItems object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsRetailBatchRequestItemsItems deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsRetailBatchRequestItemsItemsBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsRetailBatchRequestItemsItems.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsCreateRetailItem, CatalogsDeleteRetailItem, CatalogsUpdateRetailItem, CatalogsUpsertRetailItem, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'CREATE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsCreateRetailItem),
        ) as CatalogsCreateRetailItem;
        oneOfType = CatalogsCreateRetailItem;
        break;
      case r'DELETE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsDeleteRetailItem),
        ) as CatalogsDeleteRetailItem;
        oneOfType = CatalogsDeleteRetailItem;
        break;
      case r'UPDATE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsUpdateRetailItem),
        ) as CatalogsUpdateRetailItem;
        oneOfType = CatalogsUpdateRetailItem;
        break;
      case r'UPSERT':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsUpsertRetailItem),
        ) as CatalogsUpsertRetailItem;
        oneOfType = CatalogsUpsertRetailItem;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

class CatalogsRetailBatchRequestItemsItemsOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'DELETE')
  static const CatalogsRetailBatchRequestItemsItemsOperationEnum DELETE = _$catalogsRetailBatchRequestItemsItemsOperationEnum_DELETE;

  static Serializer<CatalogsRetailBatchRequestItemsItemsOperationEnum> get serializer => _$catalogsRetailBatchRequestItemsItemsOperationEnumSerializer;

  const CatalogsRetailBatchRequestItemsItemsOperationEnum._(String name): super(name);

  static BuiltSet<CatalogsRetailBatchRequestItemsItemsOperationEnum> get values => _$catalogsRetailBatchRequestItemsItemsOperationEnumValues;
  static CatalogsRetailBatchRequestItemsItemsOperationEnum valueOf(String name) => _$catalogsRetailBatchRequestItemsItemsOperationEnumValueOf(name);
}

