//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'performance_plus_campaign_settings.g.dart';

/// Pinterest Performance+ campaign settings.
///
/// Properties:
/// * [boostProspectingAdGroupBid] - Whether to boost prospecting ad group bid.
/// * [pinnerListExclusions] - List of campaign-level exclusion pinner list IDs.
@BuiltValue()
abstract class PerformancePlusCampaignSettings implements Built<PerformancePlusCampaignSettings, PerformancePlusCampaignSettingsBuilder> {
  /// Whether to boost prospecting ad group bid.
  @BuiltValueField(wireName: r'boost_prospecting_ad_group_bid')
  bool? get boostProspectingAdGroupBid;

  /// List of campaign-level exclusion pinner list IDs.
  @BuiltValueField(wireName: r'pinner_list_exclusions')
  BuiltList<String>? get pinnerListExclusions;

  PerformancePlusCampaignSettings._();

  factory PerformancePlusCampaignSettings([void updates(PerformancePlusCampaignSettingsBuilder b)]) = _$PerformancePlusCampaignSettings;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PerformancePlusCampaignSettingsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PerformancePlusCampaignSettings> get serializer => _$PerformancePlusCampaignSettingsSerializer();
}

class _$PerformancePlusCampaignSettingsSerializer implements PrimitiveSerializer<PerformancePlusCampaignSettings> {
  @override
  final Iterable<Type> types = const [PerformancePlusCampaignSettings, _$PerformancePlusCampaignSettings];

  @override
  final String wireName = r'PerformancePlusCampaignSettings';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PerformancePlusCampaignSettings object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.boostProspectingAdGroupBid != null) {
      yield r'boost_prospecting_ad_group_bid';
      yield serializers.serialize(
        object.boostProspectingAdGroupBid,
        specifiedType: const FullType(bool),
      );
    }
    if (object.pinnerListExclusions != null) {
      yield r'pinner_list_exclusions';
      yield serializers.serialize(
        object.pinnerListExclusions,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    PerformancePlusCampaignSettings object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PerformancePlusCampaignSettingsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'boost_prospecting_ad_group_bid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.boostProspectingAdGroupBid = valueDes;
          break;
        case r'pinner_list_exclusions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.pinnerListExclusions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PerformancePlusCampaignSettings deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PerformancePlusCampaignSettingsBuilder();
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

