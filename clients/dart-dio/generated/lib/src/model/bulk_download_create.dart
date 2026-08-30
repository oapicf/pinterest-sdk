//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/bulk_output_format.dart';
import 'package:openapi/src/model/bulk_entity_type.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/bulk_download_campaign_filter.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bulk_download_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [campaignFilter] 
/// * [entityIds] - All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
/// * [entityTypes] - All entity types specified will be downloaded. Fewer types result in faster downloads.
/// * [outputFormat] 
/// * [updatedSince] - Unix UTC timestamp to retrieve all entities that have changed since this time.
@BuiltValue()
abstract class BulkDownloadCreate implements Built<BulkDownloadCreate, BulkDownloadCreateBuilder> {
  @BuiltValueField(wireName: r'campaign_filter')
  BulkDownloadCampaignFilter? get campaignFilter;

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

  BulkDownloadCreate._();

  factory BulkDownloadCreate([void updates(BulkDownloadCreateBuilder b)]) = _$BulkDownloadCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BulkDownloadCreateBuilder b) => b
      ..outputFormat = BulkOutputFormat.JSON;

  @BuiltValueSerializer(custom: true)
  static Serializer<BulkDownloadCreate> get serializer => _$BulkDownloadCreateSerializer();
}

class _$BulkDownloadCreateSerializer implements PrimitiveSerializer<BulkDownloadCreate> {
  @override
  final Iterable<Type> types = const [BulkDownloadCreate, _$BulkDownloadCreate];

  @override
  final String wireName = r'BulkDownloadCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BulkDownloadCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.campaignFilter != null) {
      yield r'campaign_filter';
      yield serializers.serialize(
        object.campaignFilter,
        specifiedType: const FullType(BulkDownloadCampaignFilter),
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
    BulkDownloadCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BulkDownloadCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'campaign_filter':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BulkDownloadCampaignFilter),
          ) as BulkDownloadCampaignFilter?;
          if (valueDes == null) continue;
          result.campaignFilter.replace(valueDes);
          break;
        case r'entity_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.entityIds.replace(valueDes);
          break;
        case r'entity_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(BulkEntityType)]),
          ) as BuiltList<BulkEntityType>?;
          if (valueDes == null) continue;
          result.entityTypes.replace(valueDes);
          break;
        case r'output_format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BulkOutputFormat),
          ) as BulkOutputFormat?;
          if (valueDes == null) continue;
          result.outputFormat = valueDes;
          break;
        case r'updated_since':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
  BulkDownloadCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BulkDownloadCreateBuilder();
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

