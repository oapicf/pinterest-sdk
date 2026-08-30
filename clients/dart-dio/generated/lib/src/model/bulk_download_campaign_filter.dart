//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/summary_status.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/conversion_objective_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bulk_download_campaign_filter.g.dart';

/// BulkDownloadCampaignFilter
///
/// Properties:
/// * [campaignStatus] 
/// * [endTime] - Unix UTC timestamp.
/// * [name] - Campaign name
/// * [objectiveType] 
/// * [startTime] - Unix UTC timestamp.
@BuiltValue()
abstract class BulkDownloadCampaignFilter implements Built<BulkDownloadCampaignFilter, BulkDownloadCampaignFilterBuilder> {
  @BuiltValueField(wireName: r'campaign_status')
  BuiltList<SummaryStatus>? get campaignStatus;

  /// Unix UTC timestamp.
  @BuiltValueField(wireName: r'end_time')
  String? get endTime;

  /// Campaign name
  @BuiltValueField(wireName: r'name')
  String? get name;

  @BuiltValueField(wireName: r'objective_type')
  BuiltList<ConversionObjectiveType>? get objectiveType;

  /// Unix UTC timestamp.
  @BuiltValueField(wireName: r'start_time')
  String? get startTime;

  BulkDownloadCampaignFilter._();

  factory BulkDownloadCampaignFilter([void updates(BulkDownloadCampaignFilterBuilder b)]) = _$BulkDownloadCampaignFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BulkDownloadCampaignFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BulkDownloadCampaignFilter> get serializer => _$BulkDownloadCampaignFilterSerializer();
}

class _$BulkDownloadCampaignFilterSerializer implements PrimitiveSerializer<BulkDownloadCampaignFilter> {
  @override
  final Iterable<Type> types = const [BulkDownloadCampaignFilter, _$BulkDownloadCampaignFilter];

  @override
  final String wireName = r'BulkDownloadCampaignFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BulkDownloadCampaignFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.campaignStatus != null) {
      yield r'campaign_status';
      yield serializers.serialize(
        object.campaignStatus,
        specifiedType: const FullType(BuiltList, [FullType(SummaryStatus)]),
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
        specifiedType: const FullType(BuiltList, [FullType(ConversionObjectiveType)]),
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
    BulkDownloadCampaignFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BulkDownloadCampaignFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'campaign_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(SummaryStatus)]),
          ) as BuiltList<SummaryStatus>?;
          if (valueDes == null) continue;
          result.campaignStatus.replace(valueDes);
          break;
        case r'end_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.endTime = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'objective_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(ConversionObjectiveType)]),
          ) as BuiltList<ConversionObjectiveType>?;
          if (valueDes == null) continue;
          result.objectiveType.replace(valueDes);
          break;
        case r'start_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
  BulkDownloadCampaignFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BulkDownloadCampaignFilterBuilder();
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

