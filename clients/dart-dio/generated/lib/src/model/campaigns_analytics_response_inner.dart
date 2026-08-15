//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/date.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaigns_analytics_response_inner.g.dart';

/// CampaignsAnalyticsResponseInner
///
/// Properties:
/// * [CAMPAIGN_ID] - The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
/// * [DATE] - Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
@BuiltValue()
abstract class CampaignsAnalyticsResponseInner implements Built<CampaignsAnalyticsResponseInner, CampaignsAnalyticsResponseInnerBuilder> {
  /// The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
  @BuiltValueField(wireName: r'CAMPAIGN_ID')
  String? get CAMPAIGN_ID;

  /// Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  @BuiltValueField(wireName: r'DATE')
  Date? get DATE;

  CampaignsAnalyticsResponseInner._();

  factory CampaignsAnalyticsResponseInner([void updates(CampaignsAnalyticsResponseInnerBuilder b)]) = _$CampaignsAnalyticsResponseInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignsAnalyticsResponseInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignsAnalyticsResponseInner> get serializer => _$CampaignsAnalyticsResponseInnerSerializer();
}

class _$CampaignsAnalyticsResponseInnerSerializer implements PrimitiveSerializer<CampaignsAnalyticsResponseInner> {
  @override
  final Iterable<Type> types = const [CampaignsAnalyticsResponseInner, _$CampaignsAnalyticsResponseInner];

  @override
  final String wireName = r'CampaignsAnalyticsResponseInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignsAnalyticsResponseInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.CAMPAIGN_ID != null) {
      yield r'CAMPAIGN_ID';
      yield serializers.serialize(
        object.CAMPAIGN_ID,
        specifiedType: const FullType(String),
      );
    }
    if (object.DATE != null) {
      yield r'DATE';
      yield serializers.serialize(
        object.DATE,
        specifiedType: const FullType(Date),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignsAnalyticsResponseInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignsAnalyticsResponseInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'CAMPAIGN_ID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.CAMPAIGN_ID = valueDes;
          break;
        case r'DATE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Date),
          ) as Date;
          result.DATE = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignsAnalyticsResponseInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignsAnalyticsResponseInnerBuilder();
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

