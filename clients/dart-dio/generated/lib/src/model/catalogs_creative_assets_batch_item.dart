//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_update_creative_assets_item.dart';
import 'package:openapi/src/model/catalogs_delete_creative_assets_item.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_updatable_creative_assets_attributes.dart';
import 'package:openapi/src/model/catalogs_upsert_creative_assets_item.dart';
import 'package:openapi/src/model/catalogs_create_creative_assets_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_creative_assets_batch_item.g.dart';

/// Creative assets batch item
///
/// Properties:
/// * [attributes] 
/// * [creativeAssetsId] - The catalog creative assets id in the merchant namespace
/// * [operation] 
@BuiltValue()
abstract class CatalogsCreativeAssetsBatchItem implements Built<CatalogsCreativeAssetsBatchItem, CatalogsCreativeAssetsBatchItemBuilder> {
  /// One Of [CatalogsCreateCreativeAssetsItem], [CatalogsDeleteCreativeAssetsItem], [CatalogsUpdateCreativeAssetsItem], [CatalogsUpsertCreativeAssetsItem]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'operation';

  static const Map<String, Type> discriminatorMapping = {
    r'CREATE': CatalogsCreateCreativeAssetsItem,
    r'DELETE': CatalogsDeleteCreativeAssetsItem,
    r'UPDATE': CatalogsUpdateCreativeAssetsItem,
    r'UPSERT': CatalogsUpsertCreativeAssetsItem,
  };

  CatalogsCreativeAssetsBatchItem._();

  factory CatalogsCreativeAssetsBatchItem([void updates(CatalogsCreativeAssetsBatchItemBuilder b)]) = _$CatalogsCreativeAssetsBatchItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreativeAssetsBatchItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreativeAssetsBatchItem> get serializer => _$CatalogsCreativeAssetsBatchItemSerializer();
}

extension CatalogsCreativeAssetsBatchItemDiscriminatorExt on CatalogsCreativeAssetsBatchItem {
    String? get discriminatorValue {
        if (this is CatalogsCreateCreativeAssetsItem) {
            return r'CREATE';
        }
        if (this is CatalogsDeleteCreativeAssetsItem) {
            return r'DELETE';
        }
        if (this is CatalogsUpdateCreativeAssetsItem) {
            return r'UPDATE';
        }
        if (this is CatalogsUpsertCreativeAssetsItem) {
            return r'UPSERT';
        }
        return null;
    }
}
extension CatalogsCreativeAssetsBatchItemBuilderDiscriminatorExt on CatalogsCreativeAssetsBatchItemBuilder {
    String? get discriminatorValue {
        if (this is CatalogsCreateCreativeAssetsItemBuilder) {
            return r'CREATE';
        }
        if (this is CatalogsDeleteCreativeAssetsItemBuilder) {
            return r'DELETE';
        }
        if (this is CatalogsUpdateCreativeAssetsItemBuilder) {
            return r'UPDATE';
        }
        if (this is CatalogsUpsertCreativeAssetsItemBuilder) {
            return r'UPSERT';
        }
        return null;
    }
}

class _$CatalogsCreativeAssetsBatchItemSerializer implements PrimitiveSerializer<CatalogsCreativeAssetsBatchItem> {
  @override
  final Iterable<Type> types = const [CatalogsCreativeAssetsBatchItem, _$CatalogsCreativeAssetsBatchItem];

  @override
  final String wireName = r'CatalogsCreativeAssetsBatchItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreativeAssetsBatchItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsCreativeAssetsBatchItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsCreativeAssetsBatchItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreativeAssetsBatchItemBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsCreativeAssetsBatchItem.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsCreateCreativeAssetsItem, CatalogsDeleteCreativeAssetsItem, CatalogsUpdateCreativeAssetsItem, CatalogsUpsertCreativeAssetsItem, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'CREATE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsCreateCreativeAssetsItem),
        ) as CatalogsCreateCreativeAssetsItem;
        oneOfType = CatalogsCreateCreativeAssetsItem;
        break;
      case r'DELETE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsDeleteCreativeAssetsItem),
        ) as CatalogsDeleteCreativeAssetsItem;
        oneOfType = CatalogsDeleteCreativeAssetsItem;
        break;
      case r'UPDATE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsUpdateCreativeAssetsItem),
        ) as CatalogsUpdateCreativeAssetsItem;
        oneOfType = CatalogsUpdateCreativeAssetsItem;
        break;
      case r'UPSERT':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsUpsertCreativeAssetsItem),
        ) as CatalogsUpsertCreativeAssetsItem;
        oneOfType = CatalogsUpsertCreativeAssetsItem;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

class CatalogsCreativeAssetsBatchItemOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'DELETE')
  static const CatalogsCreativeAssetsBatchItemOperationEnum DELETE = _$catalogsCreativeAssetsBatchItemOperationEnum_DELETE;

  static Serializer<CatalogsCreativeAssetsBatchItemOperationEnum> get serializer => _$catalogsCreativeAssetsBatchItemOperationEnumSerializer;

  const CatalogsCreativeAssetsBatchItemOperationEnum._(String name): super(name);

  static BuiltSet<CatalogsCreativeAssetsBatchItemOperationEnum> get values => _$catalogsCreativeAssetsBatchItemOperationEnumValues;
  static CatalogsCreativeAssetsBatchItemOperationEnum valueOf(String name) => _$catalogsCreativeAssetsBatchItemOperationEnumValueOf(name);
}

