//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_audience_multipliers.g.dart';

/// This represents a mapping from Audience ID to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified audience in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
///
/// Properties:
/// * [AUDIENCE_ID] 
@BuiltValue()
abstract class CampaignAudienceMultipliers implements Built<CampaignAudienceMultipliers, CampaignAudienceMultipliersBuilder> {
  @BuiltValueField(wireName: r'AUDIENCE_ID')
  String? get AUDIENCE_ID;

  CampaignAudienceMultipliers._();

  factory CampaignAudienceMultipliers([void updates(CampaignAudienceMultipliersBuilder b)]) = _$CampaignAudienceMultipliers;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignAudienceMultipliersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignAudienceMultipliers> get serializer => _$CampaignAudienceMultipliersSerializer();
}

class _$CampaignAudienceMultipliersSerializer implements PrimitiveSerializer<CampaignAudienceMultipliers> {
  @override
  final Iterable<Type> types = const [CampaignAudienceMultipliers, _$CampaignAudienceMultipliers];

  @override
  final String wireName = r'CampaignAudienceMultipliers';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignAudienceMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.AUDIENCE_ID != null) {
      yield r'AUDIENCE_ID';
      yield serializers.serialize(
        object.AUDIENCE_ID,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignAudienceMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignAudienceMultipliersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'AUDIENCE_ID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.AUDIENCE_ID = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignAudienceMultipliers deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignAudienceMultipliersBuilder();
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

