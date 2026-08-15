//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/campaign_summary_status.dart';
import 'package:openapi/src/model/objective_type.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bulk_download_request_campaign_filter.g.dart';

/// BulkDownloadRequestCampaignFilter
///
/// Properties:
/// * [campaignStatus] 
/// * [endTime] - Unix UTC timestamp.
/// * [name] - Campaign name
/// * [objectiveType] 
/// * [startTime] - Unix UTC timestamp.
@BuiltValue()
abstract class BulkDownloadRequestCampaignFilter implements Built<BulkDownloadRequestCampaignFilter, BulkDownloadRequestCampaignFilterBuilder> {
  @BuiltValueField(wireName: r'campaign_status')
  BuiltList<CampaignSummaryStatus>? get campaignStatus;

  /// Unix UTC timestamp.
  @BuiltValueField(wireName: r'end_time')
  String? get endTime;

  /// Campaign name
  @BuiltValueField(wireName: r'name')
  String? get name;

  @BuiltValueField(wireName: r'objective_type')
  BuiltList<ObjectiveType>? get objectiveType;

  /// Unix UTC timestamp.
  @BuiltValueField(wireName: r'start_time')
  String? get startTime;

  BulkDownloadRequestCampaignFilter._();

  factory BulkDownloadRequestCampaignFilter([void updates(BulkDownloadRequestCampaignFilterBuilder b)]) = _$BulkDownloadRequestCampaignFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BulkDownloadRequestCampaignFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BulkDownloadRequestCampaignFilter> get serializer => _$BulkDownloadRequestCampaignFilterSerializer();
}

class _$BulkDownloadRequestCampaignFilterSerializer implements PrimitiveSerializer<BulkDownloadRequestCampaignFilter> {
  @override
  final Iterable<Type> types = const [BulkDownloadRequestCampaignFilter, _$BulkDownloadRequestCampaignFilter];

  @override
  final String wireName = r'BulkDownloadRequestCampaignFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BulkDownloadRequestCampaignFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.campaignStatus != null) {
      yield r'campaign_status';
      yield serializers.serialize(
        object.campaignStatus,
        specifiedType: const FullType(BuiltList, [FullType(CampaignSummaryStatus)]),
      );
    }
    if (object.endTime != null) {
      yield r'end_time';
      yield serializers.serialize(
        object.endTime,
        specifiedType: const FullType(String),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.objectiveType != null) {
      yield r'objective_type';
      yield serializers.serialize(
        object.objectiveType,
        specifiedType: const FullType(BuiltList, [FullType(ObjectiveType)]),
      );
    }
    if (object.startTime != null) {
      yield r'start_time';
      yield serializers.serialize(
        object.startTime,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BulkDownloadRequestCampaignFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BulkDownloadRequestCampaignFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'campaign_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CampaignSummaryStatus)]),
          ) as BuiltList<CampaignSummaryStatus>;
          result.campaignStatus.replace(valueDes);
          break;
        case r'end_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.endTime = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'objective_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ObjectiveType)]),
          ) as BuiltList<ObjectiveType>;
          result.objectiveType.replace(valueDes);
          break;
        case r'start_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.startTime = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BulkDownloadRequestCampaignFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BulkDownloadRequestCampaignFilterBuilder();
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

