//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/app_type_multipliers.dart';
import 'package:openapi/src/model/campaign_audience_multipliers.dart';
import 'package:openapi/src/model/placement_multipliers.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_bid_options.g.dart';

/// Object describing the campaign level bid multipliers.
///
/// Properties:
/// * [appTypeMultipliers] 
/// * [audienceMultipliers] 
/// * [placementMultipliers] 
@BuiltValue(instantiable: false)
abstract class CampaignBidOptions  {
  @BuiltValueField(wireName: r'app_type_multipliers')
  AppTypeMultipliers? get appTypeMultipliers;

  @BuiltValueField(wireName: r'audience_multipliers')
  CampaignAudienceMultipliers? get audienceMultipliers;

  @BuiltValueField(wireName: r'placement_multipliers')
  PlacementMultipliers? get placementMultipliers;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignBidOptions> get serializer => _$CampaignBidOptionsSerializer();
}

class _$CampaignBidOptionsSerializer implements PrimitiveSerializer<CampaignBidOptions> {
  @override
  final Iterable<Type> types = const [CampaignBidOptions];

  @override
  final String wireName = r'CampaignBidOptions';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignBidOptions object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    CampaignBidOptions object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  CampaignBidOptions deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($CampaignBidOptions)) as $CampaignBidOptions;
  }
}

/// a concrete implementation of [CampaignBidOptions], since [CampaignBidOptions] is not instantiable
@BuiltValue(instantiable: true)
abstract class $CampaignBidOptions implements CampaignBidOptions, Built<$CampaignBidOptions, $CampaignBidOptionsBuilder> {
  $CampaignBidOptions._();

  factory $CampaignBidOptions([void Function($CampaignBidOptionsBuilder)? updates]) = _$$CampaignBidOptions;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($CampaignBidOptionsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$CampaignBidOptions> get serializer => _$$CampaignBidOptionsSerializer();
}

class _$$CampaignBidOptionsSerializer implements PrimitiveSerializer<$CampaignBidOptions> {
  @override
  final Iterable<Type> types = const [$CampaignBidOptions, _$$CampaignBidOptions];

  @override
  final String wireName = r'$CampaignBidOptions';

  @override
  Object serialize(
    Serializers serializers,
    $CampaignBidOptions object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(CampaignBidOptions))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignBidOptionsBuilder result,
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
        case r'audience_multipliers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CampaignAudienceMultipliers),
          ) as CampaignAudienceMultipliers;
          result.audienceMultipliers = valueDes;
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
  $CampaignBidOptions deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $CampaignBidOptionsBuilder();
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

