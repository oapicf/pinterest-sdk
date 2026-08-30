//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/app_type_multipliers.dart';
import 'package:openapi/src/model/frequency_multipliers.dart';
import 'package:openapi/src/model/gender_multipliers.dart';
import 'package:openapi/src/model/age_bucket_multipliers.dart';
import 'package:openapi/src/model/campaign_audience_multipliers.dart';
import 'package:openapi/src/model/freq_bid_multiplier_time_window.dart';
import 'package:openapi/src/model/placement_multipliers.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_bid_options_create.g.dart';

/// Object describing the campaign level bid multipliers for create operations.
///
/// Properties:
/// * [ageBucketMultipliers] - Age bucket multipliers for bid adjustments.
/// * [appTypeMultipliers] - App type multipliers for bid adjustments.
/// * [audienceMultipliers] - Audience multipliers for bid adjustments.
/// * [freqBidMultiplierTimeWindow] - The time window for frequency bid multipliers.
/// * [frequencyMultipliers] - Frequency multipliers for bid adjustments.
/// * [genderMultipliers] - Gender multipliers for bid adjustments.
/// * [placementMultipliers] - Placement multipliers for bid adjustments.
@BuiltValue()
abstract class CampaignBidOptionsCreate implements Built<CampaignBidOptionsCreate, CampaignBidOptionsCreateBuilder> {
  /// Age bucket multipliers for bid adjustments.
  @BuiltValueField(wireName: r'age_bucket_multipliers')
  AgeBucketMultipliers? get ageBucketMultipliers;

  /// App type multipliers for bid adjustments.
  @BuiltValueField(wireName: r'app_type_multipliers')
  AppTypeMultipliers? get appTypeMultipliers;

  /// Audience multipliers for bid adjustments.
  @BuiltValueField(wireName: r'audience_multipliers')
  CampaignAudienceMultipliers? get audienceMultipliers;

  /// The time window for frequency bid multipliers.
  @BuiltValueField(wireName: r'freq_bid_multiplier_time_window')
  FreqBidMultiplierTimeWindow? get freqBidMultiplierTimeWindow;
  // enum freqBidMultiplierTimeWindowEnum {  WEEK,  MONTH,  ,  };

  /// Frequency multipliers for bid adjustments.
  @BuiltValueField(wireName: r'frequency_multipliers')
  FrequencyMultipliers? get frequencyMultipliers;

  /// Gender multipliers for bid adjustments.
  @BuiltValueField(wireName: r'gender_multipliers')
  GenderMultipliers? get genderMultipliers;

  /// Placement multipliers for bid adjustments.
  @BuiltValueField(wireName: r'placement_multipliers')
  PlacementMultipliers? get placementMultipliers;

  CampaignBidOptionsCreate._();

  factory CampaignBidOptionsCreate([void updates(CampaignBidOptionsCreateBuilder b)]) = _$CampaignBidOptionsCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignBidOptionsCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignBidOptionsCreate> get serializer => _$CampaignBidOptionsCreateSerializer();
}

class _$CampaignBidOptionsCreateSerializer implements PrimitiveSerializer<CampaignBidOptionsCreate> {
  @override
  final Iterable<Type> types = const [CampaignBidOptionsCreate, _$CampaignBidOptionsCreate];

  @override
  final String wireName = r'CampaignBidOptionsCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignBidOptionsCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.ageBucketMultipliers != null) {
      yield r'age_bucket_multipliers';
      yield serializers.serialize(
        object.ageBucketMultipliers,
        specifiedType: const FullType.nullable(AgeBucketMultipliers),
      );
    }
    if (object.appTypeMultipliers != null) {
      yield r'app_type_multipliers';
      yield serializers.serialize(
        object.appTypeMultipliers,
        specifiedType: const FullType.nullable(AppTypeMultipliers),
      );
    }
    if (object.audienceMultipliers != null) {
      yield r'audience_multipliers';
      yield serializers.serialize(
        object.audienceMultipliers,
        specifiedType: const FullType(CampaignAudienceMultipliers),
      );
    }
    if (object.freqBidMultiplierTimeWindow != null) {
      yield r'freq_bid_multiplier_time_window';
      yield serializers.serialize(
        object.freqBidMultiplierTimeWindow,
        specifiedType: const FullType.nullable(FreqBidMultiplierTimeWindow),
      );
    }
    if (object.frequencyMultipliers != null) {
      yield r'frequency_multipliers';
      yield serializers.serialize(
        object.frequencyMultipliers,
        specifiedType: const FullType.nullable(FrequencyMultipliers),
      );
    }
    if (object.genderMultipliers != null) {
      yield r'gender_multipliers';
      yield serializers.serialize(
        object.genderMultipliers,
        specifiedType: const FullType.nullable(GenderMultipliers),
      );
    }
    if (object.placementMultipliers != null) {
      yield r'placement_multipliers';
      yield serializers.serialize(
        object.placementMultipliers,
        specifiedType: const FullType.nullable(PlacementMultipliers),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignBidOptionsCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignBidOptionsCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'age_bucket_multipliers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AgeBucketMultipliers),
          ) as AgeBucketMultipliers?;
          if (valueDes == null) continue;
          result.ageBucketMultipliers = valueDes;
          break;
        case r'app_type_multipliers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AppTypeMultipliers),
          ) as AppTypeMultipliers?;
          if (valueDes == null) continue;
          result.appTypeMultipliers = valueDes;
          break;
        case r'audience_multipliers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CampaignAudienceMultipliers),
          ) as CampaignAudienceMultipliers?;
          if (valueDes == null) continue;
          result.audienceMultipliers = valueDes;
          break;
        case r'freq_bid_multiplier_time_window':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(FreqBidMultiplierTimeWindow),
          ) as FreqBidMultiplierTimeWindow?;
          if (valueDes == null) continue;
          result.freqBidMultiplierTimeWindow = valueDes;
          break;
        case r'frequency_multipliers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(FrequencyMultipliers),
          ) as FrequencyMultipliers?;
          if (valueDes == null) continue;
          result.frequencyMultipliers = valueDes;
          break;
        case r'gender_multipliers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(GenderMultipliers),
          ) as GenderMultipliers?;
          if (valueDes == null) continue;
          result.genderMultipliers = valueDes;
          break;
        case r'placement_multipliers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PlacementMultipliers),
          ) as PlacementMultipliers?;
          if (valueDes == null) continue;
          result.placementMultipliers = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignBidOptionsCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignBidOptionsCreateBuilder();
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

