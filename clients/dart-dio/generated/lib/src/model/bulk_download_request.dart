//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/bulk_output_format.dart';
import 'package:openapi/src/model/bulk_entity_type.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/bulk_download_request_campaign_filter.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bulk_download_request.g.dart';

/// Ad entities to get in bulk request.
///
/// Properties:
/// * [campaignFilter] 
/// * [entityIds] - All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
/// * [entityTypes] - All entity types specified will be downloaded. Fewer types result in faster downloads.
/// * [outputFormat] 
/// * [updatedSince] - Unix UTC timestamp to retrieve all entities that have changed since this time.
@BuiltValue()
abstract class BulkDownloadRequest implements Built<BulkDownloadRequest, BulkDownloadRequestBuilder> {
  @BuiltValueField(wireName: r'campaign_filter')
  BulkDownloadRequestCampaignFilter? get campaignFilter;

  /// All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
  @BuiltValueField(wireName: r'entity_ids')
  BuiltList<String>? get entityIds;

  /// All entity types specified will be downloaded. Fewer types result in faster downloads.
  @BuiltValueField(wireName: r'entity_types')
  BuiltList<BulkEntityType>? get entityTypes;

  @BuiltValueField(wireName: r'output_format')
  BulkOutputFormat? get outputFormat;
  // enum outputFormatEnum {  CSV,  JSON,  };

  /// Unix UTC timestamp to retrieve all entities that have changed since this time.
  @BuiltValueField(wireName: r'updated_since')
  String? get updatedSince;

  BulkDownloadRequest._();

  factory BulkDownloadRequest([void updates(BulkDownloadRequestBuilder b)]) = _$BulkDownloadRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BulkDownloadRequestBuilder b) => b
      ..outputFormat = 'JSON';

  @BuiltValueSerializer(custom: true)
  static Serializer<BulkDownloadRequest> get serializer => _$BulkDownloadRequestSerializer();
}

class _$BulkDownloadRequestSerializer implements PrimitiveSerializer<BulkDownloadRequest> {
  @override
  final Iterable<Type> types = const [BulkDownloadRequest, _$BulkDownloadRequest];

  @override
  final String wireName = r'BulkDownloadRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BulkDownloadRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.campaignFilter != null) {
      yield r'campaign_filter';
      yield serializers.serialize(
        object.campaignFilter,
        specifiedType: const FullType(BulkDownloadRequestCampaignFilter),
      );
    }
    if (object.entityIds != null) {
      yield r'entity_ids';
      yield serializers.serialize(
        object.entityIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.entityTypes != null) {
      yield r'entity_types';
      yield serializers.serialize(
        object.entityTypes,
        specifiedType: const FullType(BuiltList, [FullType(BulkEntityType)]),
      );
    }
    if (object.outputFormat != null) {
      yield r'output_format';
      yield serializers.serialize(
        object.outputFormat,
        specifiedType: const FullType(BulkOutputFormat),
      );
    }
    if (object.updatedSince != null) {
      yield r'updated_since';
      yield serializers.serialize(
        object.updatedSince,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BulkDownloadRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BulkDownloadRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'campaign_filter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BulkDownloadRequestCampaignFilter),
          ) as BulkDownloadRequestCampaignFilter;
          result.campaignFilter.replace(valueDes);
          break;
        case r'entity_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.entityIds.replace(valueDes);
          break;
        case r'entity_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(BulkEntityType)]),
          ) as BuiltList<BulkEntityType>;
          result.entityTypes.replace(valueDes);
          break;
        case r'output_format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BulkOutputFormat),
          ) as BulkOutputFormat;
          result.outputFormat = valueDes;
          break;
        case r'updated_since':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.updatedSince = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BulkDownloadRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BulkDownloadRequestBuilder();
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

