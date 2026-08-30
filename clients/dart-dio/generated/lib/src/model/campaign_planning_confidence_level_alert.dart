//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/campaign_planning_confidence_level_alert_reason.dart';
import 'package:openapi/src/model/campaign_planning_confidence_level_alert_severity.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_planning_confidence_level_alert.g.dart';

/// A confidence level alert for the delivery estimates provided in the response.
///
/// Properties:
/// * [description] - Human-readable context for debugging. Not intended for display to end users.
/// * [reason] - Reason for the confidence level alert.
/// * [severity] - Severity of the confidence level alert.
@BuiltValue()
abstract class CampaignPlanningConfidenceLevelAlert implements Built<CampaignPlanningConfidenceLevelAlert, CampaignPlanningConfidenceLevelAlertBuilder> {
  /// Human-readable context for debugging. Not intended for display to end users.
  @BuiltValueField(wireName: r'description')
  String? get description;

  /// Reason for the confidence level alert.
  @BuiltValueField(wireName: r'reason')
  CampaignPlanningConfidenceLevelAlertReason? get reason;
  // enum reasonEnum {  UNKNOWN,  OTHER,  ADVERTISER_HAS_NO_RECENT_CAMPAIGNS,  ADVERTISER_HAS_NO_RECENT_CONVERSIONS,  };

  /// Severity of the confidence level alert.
  @BuiltValueField(wireName: r'severity')
  CampaignPlanningConfidenceLevelAlertSeverity? get severity;
  // enum severityEnum {  UNKNOWN,  LOW_MILD,  LOW_MODERATE,  LOW_SEVERE,  };

  CampaignPlanningConfidenceLevelAlert._();

  factory CampaignPlanningConfidenceLevelAlert([void updates(CampaignPlanningConfidenceLevelAlertBuilder b)]) = _$CampaignPlanningConfidenceLevelAlert;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignPlanningConfidenceLevelAlertBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignPlanningConfidenceLevelAlert> get serializer => _$CampaignPlanningConfidenceLevelAlertSerializer();
}

class _$CampaignPlanningConfidenceLevelAlertSerializer implements PrimitiveSerializer<CampaignPlanningConfidenceLevelAlert> {
  @override
  final Iterable<Type> types = const [CampaignPlanningConfidenceLevelAlert, _$CampaignPlanningConfidenceLevelAlert];

  @override
  final String wireName = r'CampaignPlanningConfidenceLevelAlert';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignPlanningConfidenceLevelAlert object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.reason != null) {
      yield r'reason';
      yield serializers.serialize(
        object.reason,
        specifiedType: const FullType(CampaignPlanningConfidenceLevelAlertReason),
      );
    }
    if (object.severity != null) {
      yield r'severity';
      yield serializers.serialize(
        object.severity,
        specifiedType: const FullType(CampaignPlanningConfidenceLevelAlertSeverity),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignPlanningConfidenceLevelAlert object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignPlanningConfidenceLevelAlertBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'reason':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CampaignPlanningConfidenceLevelAlertReason),
          ) as CampaignPlanningConfidenceLevelAlertReason?;
          if (valueDes == null) continue;
          result.reason = valueDes;
          break;
        case r'severity':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CampaignPlanningConfidenceLevelAlertSeverity),
          ) as CampaignPlanningConfidenceLevelAlertSeverity?;
          if (valueDes == null) continue;
          result.severity = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignPlanningConfidenceLevelAlert deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignPlanningConfidenceLevelAlertBuilder();
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

