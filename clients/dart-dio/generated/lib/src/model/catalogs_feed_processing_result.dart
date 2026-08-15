//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_feed_ingestion_details.dart';
import 'package:openapi/src/model/catalogs_feed_processing_status.dart';
import 'package:openapi/src/model/catalogs_feed_product_counts.dart';
import 'package:openapi/src/model/catalogs_db_item.dart';
import 'package:openapi/src/model/catalogs_feed_validation_details.dart';
import 'package:openapi/src/model/catalogs_feed_video_counts.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_feed_processing_result.g.dart';

/// CatalogsFeedProcessingResult
///
/// Properties:
/// * [createdAt] 
/// * [id] 
/// * [updatedAt] 
/// * [ingestionDetails] 
/// * [productCounts] 
/// * [status] 
/// * [validationDetails] 
/// * [videoCounts] 
@BuiltValue()
abstract class CatalogsFeedProcessingResult implements CatalogsDbItem, Built<CatalogsFeedProcessingResult, CatalogsFeedProcessingResultBuilder> {
  @BuiltValueField(wireName: r'video_counts')
  CatalogsFeedVideoCounts? get videoCounts;

  @BuiltValueField(wireName: r'ingestion_details')
  CatalogsFeedIngestionDetails get ingestionDetails;

  @BuiltValueField(wireName: r'product_counts')
  CatalogsFeedProductCounts? get productCounts;

  @BuiltValueField(wireName: r'validation_details')
  CatalogsFeedValidationDetails get validationDetails;

  @BuiltValueField(wireName: r'status')
  CatalogsFeedProcessingStatus get status;
  // enum statusEnum {  COMPLETED,  FAILED,  PROCESSING,  };

  CatalogsFeedProcessingResult._();

  factory CatalogsFeedProcessingResult([void updates(CatalogsFeedProcessingResultBuilder b)]) = _$CatalogsFeedProcessingResult;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsFeedProcessingResultBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsFeedProcessingResult> get serializer => _$CatalogsFeedProcessingResultSerializer();
}

class _$CatalogsFeedProcessingResultSerializer implements PrimitiveSerializer<CatalogsFeedProcessingResult> {
  @override
  final Iterable<Type> types = const [CatalogsFeedProcessingResult, _$CatalogsFeedProcessingResult];

  @override
  final String wireName = r'CatalogsFeedProcessingResult';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsFeedProcessingResult object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'created_at';
    yield serializers.serialize(
      object.createdAt,
      specifiedType: const FullType(DateTime),
    );
    if (object.videoCounts != null) {
      yield r'video_counts';
      yield serializers.serialize(
        object.videoCounts,
        specifiedType: const FullType(CatalogsFeedVideoCounts),
      );
    }
    yield r'ingestion_details';
    yield serializers.serialize(
      object.ingestionDetails,
      specifiedType: const FullType(CatalogsFeedIngestionDetails),
    );
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'product_counts';
    yield object.productCounts == null ? null : serializers.serialize(
      object.productCounts,
      specifiedType: const FullType.nullable(CatalogsFeedProductCounts),
    );
    yield r'validation_details';
    yield serializers.serialize(
      object.validationDetails,
      specifiedType: const FullType(CatalogsFeedValidationDetails),
    );
    yield r'status';
    yield serializers.serialize(
      object.status,
      specifiedType: const FullType(CatalogsFeedProcessingStatus),
    );
    yield r'updated_at';
    yield serializers.serialize(
      object.updatedAt,
      specifiedType: const FullType(DateTime),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsFeedProcessingResult object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsFeedProcessingResultBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(DateTime),
          ) as DateTime;
          result.createdAt = valueDes;
          break;
        case r'video_counts':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsFeedVideoCounts),
          ) as CatalogsFeedVideoCounts;
          result.videoCounts.replace(valueDes);
          break;
        case r'ingestion_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsFeedIngestionDetails),
          ) as CatalogsFeedIngestionDetails;
          result.ingestionDetails.replace(valueDes);
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'product_counts':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CatalogsFeedProductCounts),
          ) as CatalogsFeedProductCounts?;
          if (valueDes == null) continue;
          result.productCounts.replace(valueDes);
          break;
        case r'validation_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsFeedValidationDetails),
          ) as CatalogsFeedValidationDetails;
          result.validationDetails.replace(valueDes);
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsFeedProcessingStatus),
          ) as CatalogsFeedProcessingStatus;
          result.status = valueDes;
          break;
        case r'updated_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(DateTime),
          ) as DateTime;
          result.updatedAt = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsFeedProcessingResult deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsFeedProcessingResultBuilder();
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

