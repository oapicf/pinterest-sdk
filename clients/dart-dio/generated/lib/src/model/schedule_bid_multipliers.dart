//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/bid_options_age_bucket_multipliers.dart';
import 'package:openapi/src/model/bid_options_audience_multipliers.dart';
import 'package:openapi/src/model/bid_options_app_type_multipliers.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/bid_options_placement_multipliers.dart';
import 'package:openapi/src/model/bid_options_gender_multipliers.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'schedule_bid_multipliers.g.dart';

/// The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.
///
/// Properties:
/// * [ageBucketMultipliers] 
/// * [appTypeMultipliers] 
/// * [audienceMultipliers] 
/// * [genderMultipliers] 
/// * [placementMultipliers] 
@BuiltValue()
abstract class ScheduleBidMultipliers implements Built<ScheduleBidMultipliers, ScheduleBidMultipliersBuilder> {
  @BuiltValueField(wireName: r'age_bucket_multipliers')
  BidOptionsAgeBucketMultipliers? get ageBucketMultipliers;

  @BuiltValueField(wireName: r'app_type_multipliers')
  BidOptionsAppTypeMultipliers? get appTypeMultipliers;

  @BuiltValueField(wireName: r'audience_multipliers')
  BuiltList<BidOptionsAudienceMultipliers>? get audienceMultipliers;

  @BuiltValueField(wireName: r'gender_multipliers')
  BidOptionsGenderMultipliers? get genderMultipliers;

  @BuiltValueField(wireName: r'placement_multipliers')
  BidOptionsPlacementMultipliers? get placementMultipliers;

  ScheduleBidMultipliers._();

  factory ScheduleBidMultipliers([void updates(ScheduleBidMultipliersBuilder b)]) = _$ScheduleBidMultipliers;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ScheduleBidMultipliersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ScheduleBidMultipliers> get serializer => _$ScheduleBidMultipliersSerializer();
}

class _$ScheduleBidMultipliersSerializer implements PrimitiveSerializer<ScheduleBidMultipliers> {
  @override
  final Iterable<Type> types = const [ScheduleBidMultipliers, _$ScheduleBidMultipliers];

  @override
  final String wireName = r'ScheduleBidMultipliers';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ScheduleBidMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.ageBucketMultipliers != null) {
      yield r'age_bucket_multipliers';
      yield serializers.serialize(
        object.ageBucketMultipliers,
        specifiedType: const FullType(BidOptionsAgeBucketMultipliers),
      );
    }
    if (object.appTypeMultipliers != null) {
      yield r'app_type_multipliers';
      yield serializers.serialize(
        object.appTypeMultipliers,
        specifiedType: const FullType(BidOptionsAppTypeMultipliers),
      );
    }
    if (object.audienceMultipliers != null) {
      yield r'audience_multipliers';
      yield serializers.serialize(
        object.audienceMultipliers,
        specifiedType: const FullType(BuiltList, [FullType(BidOptionsAudienceMultipliers)]),
      );
    }
    if (object.genderMultipliers != null) {
      yield r'gender_multipliers';
      yield serializers.serialize(
        object.genderMultipliers,
        specifiedType: const FullType(BidOptionsGenderMultipliers),
      );
    }
    if (object.placementMultipliers != null) {
      yield r'placement_multipliers';
      yield serializers.serialize(
        object.placementMultipliers,
        specifiedType: const FullType(BidOptionsPlacementMultipliers),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ScheduleBidMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ScheduleBidMultipliersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'age_bucket_multipliers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BidOptionsAgeBucketMultipliers),
          ) as BidOptionsAgeBucketMultipliers?;
          if (valueDes == null) continue;
          result.ageBucketMultipliers.replace(valueDes);
          break;
        case r'app_type_multipliers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BidOptionsAppTypeMultipliers),
          ) as BidOptionsAppTypeMultipliers?;
          if (valueDes == null) continue;
          result.appTypeMultipliers.replace(valueDes);
          break;
        case r'audience_multipliers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(BidOptionsAudienceMultipliers)]),
          ) as BuiltList<BidOptionsAudienceMultipliers>?;
          if (valueDes == null) continue;
          result.audienceMultipliers.replace(valueDes);
          break;
        case r'gender_multipliers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BidOptionsGenderMultipliers),
          ) as BidOptionsGenderMultipliers?;
          if (valueDes == null) continue;
          result.genderMultipliers.replace(valueDes);
          break;
        case r'placement_multipliers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BidOptionsPlacementMultipliers),
          ) as BidOptionsPlacementMultipliers?;
          if (valueDes == null) continue;
          result.placementMultipliers.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ScheduleBidMultipliers deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ScheduleBidMultipliersBuilder();
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

