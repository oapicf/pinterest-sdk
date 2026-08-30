//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/optimization_goal_metadata.dart';
import 'package:openapi/src/model/targeting_spec_optimal.dart';
import 'package:openapi/src/model/ad_group_audience_sizing_creative_types.dart';
import 'package:openapi/src/model/ad_group_delivery_estimates_keywords_items.dart';
import 'package:openapi/src/model/placement_group_type.dart';
import 'package:openapi/src/model/optimization_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_group_delivery_estimates.g.dart';

/// Ad group configuration for delivery estimates.
///
/// Properties:
/// * [autoTargetingEnabled] 
/// * [creativeTypes] - Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
/// * [keywords] - Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
/// * [monthlyFrequencyCap] - Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.
/// * [optimizationGoalMetadata] 
/// * [optimizationType] - Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.
/// * [placementGroup] 
/// * [productGroupIds] - [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.
/// * [targetingSpec] 
@BuiltValue()
abstract class AdGroupDeliveryEstimates implements Built<AdGroupDeliveryEstimates, AdGroupDeliveryEstimatesBuilder> {
  @BuiltValueField(wireName: r'auto_targeting_enabled')
  bool? get autoTargetingEnabled;

  /// Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  @BuiltValueField(wireName: r'creative_types')
  BuiltList<AdGroupAudienceSizingCreativeTypes>? get creativeTypes;

  /// Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
  @BuiltValueField(wireName: r'keywords')
  BuiltList<AdGroupDeliveryEstimatesKeywordsItems>? get keywords;

  /// Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups.
  @BuiltValueField(wireName: r'monthly_frequency_cap')
  int? get monthlyFrequencyCap;

  @BuiltValueField(wireName: r'optimization_goal_metadata')
  OptimizationGoalMetadata? get optimizationGoalMetadata;

  /// Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise.
  @BuiltValueField(wireName: r'optimization_type')
  OptimizationType? get optimizationType;
  // enum optimizationTypeEnum {  CLICKTHROUGH,  IMPRESSION,  WEB_CONVERSION,  ROAS,  OUTBOUND_CLICK,  };

  @BuiltValueField(wireName: r'placement_group')
  PlacementGroupType? get placementGroup;
  // enum placementGroupEnum {  ALL,  SEARCH,  BROWSE,  OTHER,  };

  /// [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns.
  @BuiltValueField(wireName: r'product_group_ids')
  BuiltList<String>? get productGroupIds;

  @BuiltValueField(wireName: r'targeting_spec')
  TargetingSpecOptimal? get targetingSpec;

  AdGroupDeliveryEstimates._();

  factory AdGroupDeliveryEstimates([void updates(AdGroupDeliveryEstimatesBuilder b)]) = _$AdGroupDeliveryEstimates;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdGroupDeliveryEstimatesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdGroupDeliveryEstimates> get serializer => _$AdGroupDeliveryEstimatesSerializer();
}

class _$AdGroupDeliveryEstimatesSerializer implements PrimitiveSerializer<AdGroupDeliveryEstimates> {
  @override
  final Iterable<Type> types = const [AdGroupDeliveryEstimates, _$AdGroupDeliveryEstimates];

  @override
  final String wireName = r'AdGroupDeliveryEstimates';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdGroupDeliveryEstimates object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.autoTargetingEnabled != null) {
      yield r'auto_targeting_enabled';
      yield serializers.serialize(
        object.autoTargetingEnabled,
        specifiedType: const FullType(bool),
      );
    }
    if (object.creativeTypes != null) {
      yield r'creative_types';
      yield serializers.serialize(
        object.creativeTypes,
        specifiedType: const FullType(BuiltList, [FullType(AdGroupAudienceSizingCreativeTypes)]),
      );
    }
    if (object.keywords != null) {
      yield r'keywords';
      yield serializers.serialize(
        object.keywords,
        specifiedType: const FullType.nullable(BuiltList, [FullType(AdGroupDeliveryEstimatesKeywordsItems)]),
      );
    }
    if (object.monthlyFrequencyCap != null) {
      yield r'monthly_frequency_cap';
      yield serializers.serialize(
        object.monthlyFrequencyCap,
        specifiedType: const FullType(int),
      );
    }
    if (object.optimizationGoalMetadata != null) {
      yield r'optimization_goal_metadata';
      yield serializers.serialize(
        object.optimizationGoalMetadata,
        specifiedType: const FullType(OptimizationGoalMetadata),
      );
    }
    if (object.optimizationType != null) {
      yield r'optimization_type';
      yield serializers.serialize(
        object.optimizationType,
        specifiedType: const FullType(OptimizationType),
      );
    }
    if (object.placementGroup != null) {
      yield r'placement_group';
      yield serializers.serialize(
        object.placementGroup,
        specifiedType: const FullType(PlacementGroupType),
      );
    }
    if (object.productGroupIds != null) {
      yield r'product_group_ids';
      yield serializers.serialize(
        object.productGroupIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.targetingSpec != null) {
      yield r'targeting_spec';
      yield serializers.serialize(
        object.targetingSpec,
        specifiedType: const FullType(TargetingSpecOptimal),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdGroupDeliveryEstimates object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdGroupDeliveryEstimatesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'auto_targeting_enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.autoTargetingEnabled = valueDes;
          break;
        case r'creative_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AdGroupAudienceSizingCreativeTypes)]),
          ) as BuiltList<AdGroupAudienceSizingCreativeTypes>?;
          if (valueDes == null) continue;
          result.creativeTypes.replace(valueDes);
          break;
        case r'keywords':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AdGroupDeliveryEstimatesKeywordsItems)]),
          ) as BuiltList<AdGroupDeliveryEstimatesKeywordsItems>?;
          if (valueDes == null) continue;
          result.keywords.replace(valueDes);
          break;
        case r'monthly_frequency_cap':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.monthlyFrequencyCap = valueDes;
          break;
        case r'optimization_goal_metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(OptimizationGoalMetadata),
          ) as OptimizationGoalMetadata?;
          if (valueDes == null) continue;
          result.optimizationGoalMetadata.replace(valueDes);
          break;
        case r'optimization_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(OptimizationType),
          ) as OptimizationType?;
          if (valueDes == null) continue;
          result.optimizationType = valueDes;
          break;
        case r'placement_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PlacementGroupType),
          ) as PlacementGroupType?;
          if (valueDes == null) continue;
          result.placementGroup = valueDes;
          break;
        case r'product_group_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.productGroupIds.replace(valueDes);
          break;
        case r'targeting_spec':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TargetingSpecOptimal),
          ) as TargetingSpecOptimal?;
          if (valueDes == null) continue;
          result.targetingSpec.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdGroupDeliveryEstimates deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdGroupDeliveryEstimatesBuilder();
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

