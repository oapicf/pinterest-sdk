//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/app_type_multipliers.dart';
import 'package:openapi/src/model/campaign_bid_options.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/campaign_audience_multipliers.dart';
import 'package:openapi/src/model/placement_multipliers.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_bid_options_update.g.dart';

/// Object describing an update to the campaign level bid multipliers.
///
/// Properties:
/// * [appTypeMultipliers] 
/// * [audienceMultipliers] 
/// * [placementMultipliers] 
/// * [updateMask] - List of fields to update, only the fields in the list will be updated.
@BuiltValue()
abstract class CampaignBidOptionsUpdate implements CampaignBidOptions, Built<CampaignBidOptionsUpdate, CampaignBidOptionsUpdateBuilder> {
  /// List of fields to update, only the fields in the list will be updated.
  @BuiltValueField(wireName: r'update_mask')
  BuiltList<CampaignBidOptionsUpdateUpdateMaskEnum> get updateMask;
  // enum updateMaskEnum {  AUDIENCE,  APP_TYPE,  PLACEMENT,  GENDER,  AGE_BUCKET,  };

  CampaignBidOptionsUpdate._();

  factory CampaignBidOptionsUpdate([void updates(CampaignBidOptionsUpdateBuilder b)]) = _$CampaignBidOptionsUpdate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignBidOptionsUpdateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignBidOptionsUpdate> get serializer => _$CampaignBidOptionsUpdateSerializer();
}

class _$CampaignBidOptionsUpdateSerializer implements PrimitiveSerializer<CampaignBidOptionsUpdate> {
  @override
  final Iterable<Type> types = const [CampaignBidOptionsUpdate, _$CampaignBidOptionsUpdate];

  @override
  final String wireName = r'CampaignBidOptionsUpdate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignBidOptionsUpdate object, {
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
    yield r'update_mask';
    yield serializers.serialize(
      object.updateMask,
      specifiedType: const FullType(BuiltList, [FullType(CampaignBidOptionsUpdateUpdateMaskEnum)]),
    );
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
    CampaignBidOptionsUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignBidOptionsUpdateBuilder result,
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
        case r'update_mask':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CampaignBidOptionsUpdateUpdateMaskEnum)]),
          ) as BuiltList<CampaignBidOptionsUpdateUpdateMaskEnum>;
          result.updateMask.replace(valueDes);
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
  CampaignBidOptionsUpdate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignBidOptionsUpdateBuilder();
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

class CampaignBidOptionsUpdateUpdateMaskEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'AUDIENCE')
  static const CampaignBidOptionsUpdateUpdateMaskEnum AUDIENCE = _$campaignBidOptionsUpdateUpdateMaskEnum_AUDIENCE;
  @BuiltValueEnumConst(wireName: r'APP_TYPE')
  static const CampaignBidOptionsUpdateUpdateMaskEnum APP_TYPE = _$campaignBidOptionsUpdateUpdateMaskEnum_APP_TYPE;
  @BuiltValueEnumConst(wireName: r'PLACEMENT')
  static const CampaignBidOptionsUpdateUpdateMaskEnum PLACEMENT = _$campaignBidOptionsUpdateUpdateMaskEnum_PLACEMENT;
  @BuiltValueEnumConst(wireName: r'GENDER')
  static const CampaignBidOptionsUpdateUpdateMaskEnum GENDER = _$campaignBidOptionsUpdateUpdateMaskEnum_GENDER;
  @BuiltValueEnumConst(wireName: r'AGE_BUCKET')
  static const CampaignBidOptionsUpdateUpdateMaskEnum AGE_BUCKET = _$campaignBidOptionsUpdateUpdateMaskEnum_AGE_BUCKET;

  static Serializer<CampaignBidOptionsUpdateUpdateMaskEnum> get serializer => _$campaignBidOptionsUpdateUpdateMaskEnumSerializer;

  const CampaignBidOptionsUpdateUpdateMaskEnum._(String name): super(name);

  static BuiltSet<CampaignBidOptionsUpdateUpdateMaskEnum> get values => _$campaignBidOptionsUpdateUpdateMaskEnumValues;
  static CampaignBidOptionsUpdateUpdateMaskEnum valueOf(String name) => _$campaignBidOptionsUpdateUpdateMaskEnumValueOf(name);
}

