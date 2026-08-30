//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/adgroup_placement_group_type.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ad_group_audience_sizing_keyword.dart';
import 'package:openapi/src/model/targeting_spec_optimal.dart';
import 'package:openapi/src/model/ad_group_audience_sizing_creative_types.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_group_audience_sizing_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [autoTargetingEnabled] - Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).
/// * [creativeTypes] - Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
/// * [keywords] - Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
/// * [placementGroup] - [Placement group](/docs/redoc/#section/Placement-group).
/// * [productGroupIds] - Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
/// * [targetingSpec] 
@BuiltValue()
abstract class AdGroupAudienceSizingCreate implements Built<AdGroupAudienceSizingCreate, AdGroupAudienceSizingCreateBuilder> {
  /// Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting).
  @BuiltValueField(wireName: r'auto_targeting_enabled')
  bool? get autoTargetingEnabled;

  /// Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  @BuiltValueField(wireName: r'creative_types')
  BuiltList<AdGroupAudienceSizingCreativeTypes>? get creativeTypes;

  /// Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
  @BuiltValueField(wireName: r'keywords')
  BuiltList<AdGroupAudienceSizingKeyword>? get keywords;

  /// [Placement group](/docs/redoc/#section/Placement-group).
  @BuiltValueField(wireName: r'placement_group')
  AdgroupPlacementGroupType? get placementGroup;
  // enum placementGroupEnum {  ALL,  SEARCH,  BROWSE,  OTHER,  };

  /// Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
  @BuiltValueField(wireName: r'product_group_ids')
  BuiltList<String>? get productGroupIds;

  @BuiltValueField(wireName: r'targeting_spec')
  TargetingSpecOptimal? get targetingSpec;

  AdGroupAudienceSizingCreate._();

  factory AdGroupAudienceSizingCreate([void updates(AdGroupAudienceSizingCreateBuilder b)]) = _$AdGroupAudienceSizingCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdGroupAudienceSizingCreateBuilder b) => b
      ..autoTargetingEnabled = true
      ..placementGroup = AdgroupPlacementGroupType.ALL;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdGroupAudienceSizingCreate> get serializer => _$AdGroupAudienceSizingCreateSerializer();
}

class _$AdGroupAudienceSizingCreateSerializer implements PrimitiveSerializer<AdGroupAudienceSizingCreate> {
  @override
  final Iterable<Type> types = const [AdGroupAudienceSizingCreate, _$AdGroupAudienceSizingCreate];

  @override
  final String wireName = r'AdGroupAudienceSizingCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdGroupAudienceSizingCreate object, {
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
        specifiedType: const FullType.nullable(BuiltList, [FullType(AdGroupAudienceSizingCreativeTypes)]),
      );
    }
    if (object.keywords != null) {
      yield r'keywords';
      yield serializers.serialize(
        object.keywords,
        specifiedType: const FullType.nullable(BuiltList, [FullType(AdGroupAudienceSizingKeyword)]),
      );
    }
    if (object.placementGroup != null) {
      yield r'placement_group';
      yield serializers.serialize(
        object.placementGroup,
        specifiedType: const FullType(AdgroupPlacementGroupType),
      );
    }
    if (object.productGroupIds != null) {
      yield r'product_group_ids';
      yield serializers.serialize(
        object.productGroupIds,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
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
    AdGroupAudienceSizingCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdGroupAudienceSizingCreateBuilder result,
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
            specifiedType: const FullType.nullable(BuiltList, [FullType(AdGroupAudienceSizingKeyword)]),
          ) as BuiltList<AdGroupAudienceSizingKeyword>?;
          if (valueDes == null) continue;
          result.keywords.replace(valueDes);
          break;
        case r'placement_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AdgroupPlacementGroupType),
          ) as AdgroupPlacementGroupType?;
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
  AdGroupAudienceSizingCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdGroupAudienceSizingCreateBuilder();
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

