//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/objective_type.dart';
import 'package:openapi/src/model/intended_promotion_type.dart';
import 'package:openapi/src/model/campaign_bid_options_update.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_update_request_all_of2.g.dart';

/// CampaignUpdateRequestAllOf2
///
/// Properties:
/// * [bidOptions] 
/// * [intendedPromotionType] 
/// * [isLtvOptimized] - Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
/// * [isPerformancePlus] - Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.
/// * [isTopOfSearch] - Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
/// * [objectiveType] 
@BuiltValue()
abstract class CampaignUpdateRequestAllOf2 implements Built<CampaignUpdateRequestAllOf2, CampaignUpdateRequestAllOf2Builder> {
  @BuiltValueField(wireName: r'bid_options')
  CampaignBidOptionsUpdate? get bidOptions;

  @BuiltValueField(wireName: r'intended_promotion_type')
  IntendedPromotionType? get intendedPromotionType;
  // enum intendedPromotionTypeEnum {  LEGACY,  STANDARD_AD,  CATALOG,  };

  /// Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
  @BuiltValueField(wireName: r'is_ltv_optimized')
  bool? get isLtvOptimized;

  /// Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.
  @BuiltValueField(wireName: r'is_performance_plus')
  bool? get isPerformancePlus;

  /// Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
  @BuiltValueField(wireName: r'is_top_of_search')
  bool? get isTopOfSearch;

  @BuiltValueField(wireName: r'objective_type')
  ObjectiveType? get objectiveType;
  // enum objectiveTypeEnum {  AWARENESS,  CONSIDERATION,  WEB_CONVERSION,  CATALOG_SALES,  VIDEO_COMPLETION,  SALES,  APP_INSTALL,  CTV_CONSIDERATION,  };

  CampaignUpdateRequestAllOf2._();

  factory CampaignUpdateRequestAllOf2([void updates(CampaignUpdateRequestAllOf2Builder b)]) = _$CampaignUpdateRequestAllOf2;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignUpdateRequestAllOf2Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignUpdateRequestAllOf2> get serializer => _$CampaignUpdateRequestAllOf2Serializer();
}

class _$CampaignUpdateRequestAllOf2Serializer implements PrimitiveSerializer<CampaignUpdateRequestAllOf2> {
  @override
  final Iterable<Type> types = const [CampaignUpdateRequestAllOf2, _$CampaignUpdateRequestAllOf2];

  @override
  final String wireName = r'CampaignUpdateRequestAllOf2';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignUpdateRequestAllOf2 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.bidOptions != null) {
      yield r'bid_options';
      yield serializers.serialize(
        object.bidOptions,
        specifiedType: const FullType.nullable(CampaignBidOptionsUpdate),
      );
    }
    if (object.intendedPromotionType != null) {
      yield r'intended_promotion_type';
      yield serializers.serialize(
        object.intendedPromotionType,
        specifiedType: const FullType(IntendedPromotionType),
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
    if (object.objectiveType != null) {
      yield r'objective_type';
      yield serializers.serialize(
        object.objectiveType,
        specifiedType: const FullType.nullable(ObjectiveType),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignUpdateRequestAllOf2 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignUpdateRequestAllOf2Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'bid_options':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CampaignBidOptionsUpdate),
          ) as CampaignBidOptionsUpdate?;
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
            specifiedType: const FullType.nullable(ObjectiveType),
          ) as ObjectiveType?;
          if (valueDes == null) continue;
          result.objectiveType = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignUpdateRequestAllOf2 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignUpdateRequestAllOf2Builder();
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

