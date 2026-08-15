//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/app_type_multipliers.dart';
import 'package:openapi/src/model/campaign_bid_options.dart';
import 'package:openapi/src/model/campaign_audience_multipliers.dart';
import 'package:openapi/src/model/placement_multipliers.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_bid_options_create.g.dart';

/// Object describing the campaign level bid multipliers.
///
/// Properties:
/// * [appTypeMultipliers] 
/// * [audienceMultipliers] 
/// * [placementMultipliers] 
@BuiltValue()
abstract class CampaignBidOptionsCreate implements CampaignBidOptions, Built<CampaignBidOptionsCreate, CampaignBidOptionsCreateBuilder> {
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
    if (object.appTypeMultipliers != null) {
      yield r'app_type_multipliers';
      yield serializers.serialize(
        object.appTypeMultipliers,
        specifiedType: const FullType.nullable(AppTypeMultipliers),
      );
    }
    if (object.placementMultipliers != null) {
      yield r'placement_multipliers';
      yield serializers.serialize(
        object.placementMultipliers,
        specifiedType: const FullType.nullable(PlacementMultipliers),
      );
    }
    if (object.audienceMultipliers != null) {
      yield r'audience_multipliers';
      yield serializers.serialize(
        object.audienceMultipliers,
        specifiedType: const FullType(CampaignAudienceMultipliers),
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
        case r'app_type_multipliers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AppTypeMultipliers),
          ) as AppTypeMultipliers?;
          if (valueDes == null) continue;
          result.appTypeMultipliers = valueDes;
          break;
        case r'placement_multipliers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PlacementMultipliers),
          ) as PlacementMultipliers?;
          if (valueDes == null) continue;
          result.placementMultipliers = valueDes;
          break;
        case r'audience_multipliers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CampaignAudienceMultipliers),
          ) as CampaignAudienceMultipliers;
          result.audienceMultipliers = valueDes;
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

