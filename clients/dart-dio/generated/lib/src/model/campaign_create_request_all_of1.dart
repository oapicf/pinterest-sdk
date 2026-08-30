//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/objective_type.dart';
import 'package:openapi/src/model/entity_status.dart';
import 'package:openapi/src/model/intended_promotion_type.dart';
import 'package:openapi/src/model/campaign_bid_options_create.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_create_request_all_of1.g.dart';

/// CampaignCreateRequestAllOf1
///
/// Properties:
/// * [bidOptions] 
/// * [intendedPromotionType] 
/// * [isAutomatedCampaign] - Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES
/// * [isCampaignBudgetOptimization] - Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
/// * [isFlexibleDailyBudgets] - Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
/// * [isLtvOptimized] - Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
/// * [isPerformancePlus] - Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.
/// * [isTopOfSearch] - <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a>  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: `CONSIDERATION` `WEB_CONVERSION` `CATALOG_SALES`  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your `true` or `false` selection of this campaign if you <a href=\"https://developer.pinterest.com/docs/api/v5/campaigns-update\" target=\"blank\">update it</a>.
/// * [objectiveType] 
/// * [status] 
@BuiltValue()
abstract class CampaignCreateRequestAllOf1 implements Built<CampaignCreateRequestAllOf1, CampaignCreateRequestAllOf1Builder> {
  @BuiltValueField(wireName: r'bid_options')
  CampaignBidOptionsCreate? get bidOptions;

  @BuiltValueField(wireName: r'intended_promotion_type')
  IntendedPromotionType? get intendedPromotionType;
  // enum intendedPromotionTypeEnum {  LEGACY,  STANDARD_AD,  CATALOG,  };

  /// Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES
  @BuiltValueField(wireName: r'is_automated_campaign')
  bool? get isAutomatedCampaign;

  /// Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
  @BuiltValueField(wireName: r'is_campaign_budget_optimization')
  bool? get isCampaignBudgetOptimization;

  /// Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
  @BuiltValueField(wireName: r'is_flexible_daily_budgets')
  bool? get isFlexibleDailyBudgets;

  /// Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
  @BuiltValueField(wireName: r'is_ltv_optimized')
  bool? get isLtvOptimized;

  /// Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.
  @BuiltValueField(wireName: r'is_performance_plus')
  bool? get isPerformancePlus;

  /// <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a>  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: `CONSIDERATION` `WEB_CONVERSION` `CATALOG_SALES`  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your `true` or `false` selection of this campaign if you <a href=\"https://developer.pinterest.com/docs/api/v5/campaigns-update\" target=\"blank\">update it</a>.
  @BuiltValueField(wireName: r'is_top_of_search')
  bool? get isTopOfSearch;

  @BuiltValueField(wireName: r'objective_type')
  ObjectiveType get objectiveType;
  // enum objectiveTypeEnum {  AWARENESS,  CONSIDERATION,  WEB_CONVERSION,  CATALOG_SALES,  VIDEO_COMPLETION,  SALES,  APP_INSTALL,  CTV_CONSIDERATION,  };

  @BuiltValueField(wireName: r'status')
  EntityStatus? get status;
  // enum statusEnum {  ACTIVE,  PAUSED,  ARCHIVED,  DRAFT,  DELETED_DRAFT,  };

  CampaignCreateRequestAllOf1._();

  factory CampaignCreateRequestAllOf1([void updates(CampaignCreateRequestAllOf1Builder b)]) = _$CampaignCreateRequestAllOf1;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignCreateRequestAllOf1Builder b) => b
      ..isAutomatedCampaign = false
      ..isCampaignBudgetOptimization = true
      ..isFlexibleDailyBudgets = false
      ..isPerformancePlus = false
      ..isTopOfSearch = false
      ..status = EntityStatus.ACTIVE;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignCreateRequestAllOf1> get serializer => _$CampaignCreateRequestAllOf1Serializer();
}

class _$CampaignCreateRequestAllOf1Serializer implements PrimitiveSerializer<CampaignCreateRequestAllOf1> {
  @override
  final Iterable<Type> types = const [CampaignCreateRequestAllOf1, _$CampaignCreateRequestAllOf1];

  @override
  final String wireName = r'CampaignCreateRequestAllOf1';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignCreateRequestAllOf1 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.bidOptions != null) {
      yield r'bid_options';
      yield serializers.serialize(
        object.bidOptions,
        specifiedType: const FullType.nullable(CampaignBidOptionsCreate),
      );
    }
    if (object.intendedPromotionType != null) {
      yield r'intended_promotion_type';
      yield serializers.serialize(
        object.intendedPromotionType,
        specifiedType: const FullType(IntendedPromotionType),
      );
    }
    if (object.isAutomatedCampaign != null) {
      yield r'is_automated_campaign';
      yield serializers.serialize(
        object.isAutomatedCampaign,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.isCampaignBudgetOptimization != null) {
      yield r'is_campaign_budget_optimization';
      yield serializers.serialize(
        object.isCampaignBudgetOptimization,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.isFlexibleDailyBudgets != null) {
      yield r'is_flexible_daily_budgets';
      yield serializers.serialize(
        object.isFlexibleDailyBudgets,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.isLtvOptimized != null) {
      yield r'is_ltv_optimized';
      yield serializers.serialize(
        object.isLtvOptimized,
        specifiedType: const FullType(bool),
      );
    }
    if (object.isPerformancePlus != null) {
      yield r'is_performance_plus';
      yield serializers.serialize(
        object.isPerformancePlus,
        specifiedType: const FullType(bool),
      );
    }
    if (object.isTopOfSearch != null) {
      yield r'is_top_of_search';
      yield serializers.serialize(
        object.isTopOfSearch,
        specifiedType: const FullType(bool),
      );
    }
    yield r'objective_type';
    yield serializers.serialize(
      object.objectiveType,
      specifiedType: const FullType(ObjectiveType),
    );
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(EntityStatus),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignCreateRequestAllOf1 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignCreateRequestAllOf1Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'bid_options':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CampaignBidOptionsCreate),
          ) as CampaignBidOptionsCreate?;
          if (valueDes == null) continue;
          result.bidOptions.replace(valueDes);
          break;
        case r'intended_promotion_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(IntendedPromotionType),
          ) as IntendedPromotionType?;
          if (valueDes == null) continue;
          result.intendedPromotionType = valueDes;
          break;
        case r'is_automated_campaign':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isAutomatedCampaign = valueDes;
          break;
        case r'is_campaign_budget_optimization':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isCampaignBudgetOptimization = valueDes;
          break;
        case r'is_flexible_daily_budgets':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isFlexibleDailyBudgets = valueDes;
          break;
        case r'is_ltv_optimized':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isLtvOptimized = valueDes;
          break;
        case r'is_performance_plus':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isPerformancePlus = valueDes;
          break;
        case r'is_top_of_search':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isTopOfSearch = valueDes;
          break;
        case r'objective_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ObjectiveType),
          ) as ObjectiveType;
          result.objectiveType = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(EntityStatus),
          ) as EntityStatus?;
          if (valueDes == null) continue;
          result.status = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignCreateRequestAllOf1 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignCreateRequestAllOf1Builder();
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

