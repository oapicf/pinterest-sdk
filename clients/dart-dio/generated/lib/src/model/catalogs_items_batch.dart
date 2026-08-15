//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_creative_assets_items_batch.dart';
import 'package:openapi/src/model/catalogs_hotel_items_batch.dart';
import 'package:openapi/src/model/batch_operation_status.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_retail_items_batch.dart';
import 'package:openapi/src/model/catalogs_type.dart';
import 'package:openapi/src/model/creative_assets_processing_record.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_items_batch.g.dart';

/// Object describing the catalogs items batch
///
/// Properties:
/// * [catalogType] 
/// * [batchId] - Id of the catalogs items batch
/// * [completedTime] - Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
/// * [createdTime] - Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
/// * [items] - Array with the catalogs items processing records part of the catalogs items batch
/// * [status] 
@BuiltValue()
abstract class CatalogsItemsBatch implements Built<CatalogsItemsBatch, CatalogsItemsBatchBuilder> {
  /// One Of [CatalogsCreativeAssetsItemsBatch], [CatalogsHotelItemsBatch], [CatalogsRetailItemsBatch]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'catalog_type';

  static const Map<String, Type> discriminatorMapping = {
    r'CREATIVE_ASSETS': CatalogsCreativeAssetsItemsBatch,
    r'HOTEL': CatalogsHotelItemsBatch,
    r'RETAIL': CatalogsRetailItemsBatch,
  };

  CatalogsItemsBatch._();

  factory CatalogsItemsBatch([void updates(CatalogsItemsBatchBuilder b)]) = _$CatalogsItemsBatch;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsItemsBatchBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsItemsBatch> get serializer => _$CatalogsItemsBatchSerializer();
}

extension CatalogsItemsBatchDiscriminatorExt on CatalogsItemsBatch {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsItemsBatch) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelItemsBatch) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailItemsBatch) {
            return r'RETAIL';
        }
        return null;
    }
}
extension CatalogsItemsBatchBuilderDiscriminatorExt on CatalogsItemsBatchBuilder {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsItemsBatchBuilder) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelItemsBatchBuilder) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailItemsBatchBuilder) {
            return r'RETAIL';
        }
        return null;
    }
}

class _$CatalogsItemsBatchSerializer implements PrimitiveSerializer<CatalogsItemsBatch> {
  @override
  final Iterable<Type> types = const [CatalogsItemsBatch, _$CatalogsItemsBatch];

  @override
  final String wireName = r'CatalogsItemsBatch';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsItemsBatch object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsItemsBatch object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsItemsBatch deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsItemsBatchBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsItemsBatch.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsCreativeAssetsItemsBatch, CatalogsHotelItemsBatch, CatalogsRetailItemsBatch, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'CREATIVE_ASSETS':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsCreativeAssetsItemsBatch),
        ) as CatalogsCreativeAssetsItemsBatch;
        oneOfType = CatalogsCreativeAssetsItemsBatch;
        break;
      case r'HOTEL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsHotelItemsBatch),
        ) as CatalogsHotelItemsBatch;
        oneOfType = CatalogsHotelItemsBatch;
        break;
      case r'RETAIL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsRetailItemsBatch),
        ) as CatalogsRetailItemsBatch;
        oneOfType = CatalogsRetailItemsBatch;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

