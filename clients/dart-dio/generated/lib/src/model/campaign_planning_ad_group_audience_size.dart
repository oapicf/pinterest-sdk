//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_planning_ad_group_audience_size.g.dart';

/// Range audience size for an ad group.
///
/// Properties:
/// * [countLower] - Lower bound of the audience size estimate.
/// * [countUpper] - Upper bound of the audience size estimate.
@BuiltValue()
abstract class CampaignPlanningAdGroupAudienceSize implements Built<CampaignPlanningAdGroupAudienceSize, CampaignPlanningAdGroupAudienceSizeBuilder> {
  /// Lower bound of the audience size estimate.
  @BuiltValueField(wireName: r'count_lower')
  int? get countLower;

  /// Upper bound of the audience size estimate.
  @BuiltValueField(wireName: r'count_upper')
  int? get countUpper;

  CampaignPlanningAdGroupAudienceSize._();

  factory CampaignPlanningAdGroupAudienceSize([void updates(CampaignPlanningAdGroupAudienceSizeBuilder b)]) = _$CampaignPlanningAdGroupAudienceSize;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignPlanningAdGroupAudienceSizeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignPlanningAdGroupAudienceSize> get serializer => _$CampaignPlanningAdGroupAudienceSizeSerializer();
}

class _$CampaignPlanningAdGroupAudienceSizeSerializer implements PrimitiveSerializer<CampaignPlanningAdGroupAudienceSize> {
  @override
  final Iterable<Type> types = const [CampaignPlanningAdGroupAudienceSize, _$CampaignPlanningAdGroupAudienceSize];

  @override
  final String wireName = r'CampaignPlanningAdGroupAudienceSize';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignPlanningAdGroupAudienceSize object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.countLower != null) {
      yield r'count_lower';
      yield serializers.serialize(
        object.countLower,
        specifiedType: const FullType(int),
      );
    }
    if (object.countUpper != null) {
      yield r'count_upper';
      yield serializers.serialize(
        object.countUpper,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignPlanningAdGroupAudienceSize object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignPlanningAdGroupAudienceSizeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'count_lower':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.countLower = valueDes;
          break;
        case r'count_upper':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.countUpper = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignPlanningAdGroupAudienceSize deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignPlanningAdGroupAudienceSizeBuilder();
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

