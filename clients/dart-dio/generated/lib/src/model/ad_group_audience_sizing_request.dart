//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ad_group_audience_sizing_request_keywords_inner.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec.dart';
import 'package:openapi/src/model/placement_group_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_group_audience_sizing_request.g.dart';

/// AdGroupAudienceSizingRequest
///
/// Properties:
/// * [autoTargetingEnabled] - Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
/// * [creativeTypes] - Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
/// * [keywords] - Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
/// * [placementGroup] - <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
/// * [productGroupIds] - Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
/// * [targetingSpec] 
@BuiltValue()
abstract class AdGroupAudienceSizingRequest implements Built<AdGroupAudienceSizingRequest, AdGroupAudienceSizingRequestBuilder> {
  /// Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
  @BuiltValueField(wireName: r'auto_targeting_enabled')
  bool? get autoTargetingEnabled;

  /// Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  @BuiltValueField(wireName: r'creative_types')
  BuiltList<AdGroupAudienceSizingRequestCreativeTypesEnum>? get creativeTypes;
  // enum creativeTypesEnum {  REGULAR,  VIDEO,  SHOPPING,  CAROUSEL,  MAX_VIDEO,  SHOP_THE_PIN,  COLLECTION,  IDEA,  };

  /// Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
  @BuiltValueField(wireName: r'keywords')
  BuiltList<AdGroupAudienceSizingRequestKeywordsInner>? get keywords;

  /// <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
  @BuiltValueField(wireName: r'placement_group')
  PlacementGroupType? get placementGroup;
  // enum placementGroupEnum {  ALL,  SEARCH,  BROWSE,  OTHER,  };

  /// Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
  @BuiltValueField(wireName: r'product_group_ids')
  BuiltList<String>? get productGroupIds;

  @BuiltValueField(wireName: r'targeting_spec')
  TargetingSpec? get targetingSpec;

  AdGroupAudienceSizingRequest._();

  factory AdGroupAudienceSizingRequest([void updates(AdGroupAudienceSizingRequestBuilder b)]) = _$AdGroupAudienceSizingRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdGroupAudienceSizingRequestBuilder b) => b
      ..autoTargetingEnabled = true
      ..placementGroup = 'ALL';

  @BuiltValueSerializer(custom: true)
  static Serializer<AdGroupAudienceSizingRequest> get serializer => _$AdGroupAudienceSizingRequestSerializer();
}

class _$AdGroupAudienceSizingRequestSerializer implements PrimitiveSerializer<AdGroupAudienceSizingRequest> {
  @override
  final Iterable<Type> types = const [AdGroupAudienceSizingRequest, _$AdGroupAudienceSizingRequest];

  @override
  final String wireName = r'AdGroupAudienceSizingRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdGroupAudienceSizingRequest object, {
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
        specifiedType: const FullType.nullable(BuiltList, [FullType(AdGroupAudienceSizingRequestCreativeTypesEnum)]),
      );
    }
    if (object.keywords != null) {
      yield r'keywords';
      yield serializers.serialize(
        object.keywords,
        specifiedType: const FullType.nullable(BuiltList, [FullType(AdGroupAudienceSizingRequestKeywordsInner)]),
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
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
    if (object.targetingSpec != null) {
      yield r'targeting_spec';
      yield serializers.serialize(
        object.targetingSpec,
        specifiedType: const FullType(TargetingSpec),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdGroupAudienceSizingRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdGroupAudienceSizingRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'auto_targeting_enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.autoTargetingEnabled = valueDes;
          break;
        case r'creative_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AdGroupAudienceSizingRequestCreativeTypesEnum)]),
          ) as BuiltList<AdGroupAudienceSizingRequestCreativeTypesEnum>?;
          if (valueDes == null) continue;
          result.creativeTypes.replace(valueDes);
          break;
        case r'keywords':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AdGroupAudienceSizingRequestKeywordsInner)]),
          ) as BuiltList<AdGroupAudienceSizingRequestKeywordsInner>?;
          if (valueDes == null) continue;
          result.keywords.replace(valueDes);
          break;
        case r'placement_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PlacementGroupType),
          ) as PlacementGroupType;
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
            specifiedType: const FullType(TargetingSpec),
          ) as TargetingSpec;
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
  AdGroupAudienceSizingRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdGroupAudienceSizingRequestBuilder();
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

class AdGroupAudienceSizingRequestCreativeTypesEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'REGULAR')
  static const AdGroupAudienceSizingRequestCreativeTypesEnum REGULAR = _$adGroupAudienceSizingRequestCreativeTypesEnum_REGULAR;
  @BuiltValueEnumConst(wireName: r'VIDEO')
  static const AdGroupAudienceSizingRequestCreativeTypesEnum VIDEO = _$adGroupAudienceSizingRequestCreativeTypesEnum_VIDEO;
  @BuiltValueEnumConst(wireName: r'SHOPPING')
  static const AdGroupAudienceSizingRequestCreativeTypesEnum SHOPPING = _$adGroupAudienceSizingRequestCreativeTypesEnum_SHOPPING;
  @BuiltValueEnumConst(wireName: r'CAROUSEL')
  static const AdGroupAudienceSizingRequestCreativeTypesEnum CAROUSEL = _$adGroupAudienceSizingRequestCreativeTypesEnum_CAROUSEL;
  @BuiltValueEnumConst(wireName: r'MAX_VIDEO')
  static const AdGroupAudienceSizingRequestCreativeTypesEnum MAX_VIDEO = _$adGroupAudienceSizingRequestCreativeTypesEnum_MAX_VIDEO;
  @BuiltValueEnumConst(wireName: r'SHOP_THE_PIN')
  static const AdGroupAudienceSizingRequestCreativeTypesEnum SHOP_THE_PIN = _$adGroupAudienceSizingRequestCreativeTypesEnum_SHOP_THE_PIN;
  @BuiltValueEnumConst(wireName: r'COLLECTION')
  static const AdGroupAudienceSizingRequestCreativeTypesEnum COLLECTION = _$adGroupAudienceSizingRequestCreativeTypesEnum_COLLECTION;
  @BuiltValueEnumConst(wireName: r'IDEA')
  static const AdGroupAudienceSizingRequestCreativeTypesEnum IDEA = _$adGroupAudienceSizingRequestCreativeTypesEnum_IDEA;

  static Serializer<AdGroupAudienceSizingRequestCreativeTypesEnum> get serializer => _$adGroupAudienceSizingRequestCreativeTypesEnumSerializer;

  const AdGroupAudienceSizingRequestCreativeTypesEnum._(String name): super(name);

  static BuiltSet<AdGroupAudienceSizingRequestCreativeTypesEnum> get values => _$adGroupAudienceSizingRequestCreativeTypesEnumValues;
  static AdGroupAudienceSizingRequestCreativeTypesEnum valueOf(String name) => _$adGroupAudienceSizingRequestCreativeTypesEnumValueOf(name);
}

