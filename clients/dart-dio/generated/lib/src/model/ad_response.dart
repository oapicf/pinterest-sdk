//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/quiz_pin_data.dart';
import 'package:openapi/src/model/customizable_cta_type.dart';
import 'package:openapi/src/model/grid_click_type.dart';
import 'package:openapi/src/model/pin_promotion_summary_status.dart';
import 'package:openapi/src/model/tracking_urls.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/entity_status.dart';
import 'package:openapi/src/model/ad_pin_id.dart';
import 'package:openapi/src/model/disclosure_type.dart';
import 'package:openapi/src/model/creative_type.dart';
import 'package:openapi/src/model/ad_common.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_response.g.dart';

/// AdResponse
///
/// Properties:
/// * [adGroupId] - ID of the ad group that contains the ad.
/// * [androidDeepLink] - Deep link URL for Android devices.
/// * [carouselAndroidDeepLinks] - Comma-separated deep links for the carousel pin on Android.
/// * [carouselDestinationUrls] - Comma-separated destination URLs for the carousel pin to promote.
/// * [carouselIosDeepLinks] - Comma-separated deep links for the carousel pin on iOS.
/// * [clickTrackingUrl] - Tracking url for the ad clicks.
/// * [creativeType] 
/// * [customizableCtaType] 
/// * [destinationUrl] - Destination URL.
/// * [disclosureType] 
/// * [disclosureUrl] - URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
/// * [gridClickType] 
/// * [iosDeepLink] - Deep link URL for iOS devices.
/// * [isPinDeleted] - Is original pin deleted?
/// * [isRemovable] - Is pin repinnable?
/// * [leadFormId] - Lead form ID for lead ad generation.
/// * [name] - Name of the ad - 255 chars max.
/// * [quizPinData] - Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
/// * [status] 
/// * [trackingUrls] 
/// * [viewTrackingUrl] - Tracking URL for ad impressions.
/// * [pinId] - Pin ID.
/// * [adAccountId] - The ID of the advertiser that this ad belongs to.
/// * [campaignId] - ID of the ad campaign that contains this ad.
/// * [collectionItemsDestinationUrlTemplate] - Destination URL template for all items within a collections drawer.
/// * [createdTime] - Pin creation time. Unix timestamp in seconds.
/// * [id] - The ID of this ad.
/// * [rejectedReasons] - Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
/// * [rejectionLabels] - Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
/// * [reviewStatus] - Ad review status
/// * [summaryStatus] - Ad summary status
/// * [type] - Always \"ad\".
/// * [updatedTime] - Last update time. Unix timestamp in seconds.
@BuiltValue()
abstract class AdResponse implements AdCommon, AdPinId, Built<AdResponse, AdResponseBuilder> {
  /// Last update time. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'updated_time')
  int? get updatedTime;

  /// Ad summary status
  @BuiltValueField(wireName: r'summary_status')
  PinPromotionSummaryStatus? get summaryStatus;
  // enum summaryStatusEnum {  APPROVED,  PAUSED,  PENDING,  REJECTED,  ADVERTISER_DISABLED,  ARCHIVED,  DRAFT,  DELETED_DRAFT,  };

  /// Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
  @BuiltValueField(wireName: r'rejection_labels')
  BuiltList<String>? get rejectionLabels;

  /// The ID of the advertiser that this ad belongs to.
  @BuiltValueField(wireName: r'ad_account_id')
  String? get adAccountId;

  /// ID of the ad campaign that contains this ad.
  @BuiltValueField(wireName: r'campaign_id')
  String? get campaignId;

  /// Pin creation time. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'created_time')
  int? get createdTime;

  /// Ad review status
  @BuiltValueField(wireName: r'review_status')
  AdResponseReviewStatusEnum? get reviewStatus;
  // enum reviewStatusEnum {  OTHER,  PENDING,  REJECTED,  APPROVED,  };

  /// Destination URL template for all items within a collections drawer.
  @BuiltValueField(wireName: r'collection_items_destination_url_template')
  String? get collectionItemsDestinationUrlTemplate;

  /// The ID of this ad.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// Always \"ad\".
  @BuiltValueField(wireName: r'type')
  String? get type;

  /// Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
  @BuiltValueField(wireName: r'rejected_reasons')
  BuiltList<AdResponseRejectedReasonsEnum>? get rejectedReasons;
  // enum rejectedReasonsEnum {  HASHTAGS,  PROMOTIONS_AND_PRICES,  TARGETING,  LANDING_PAGE,  CAPS_AND_SYMBOLS,  SHOCKING,  WEIGHT_LOSS,  PROHIBITED_PRODUCT,  AUTHENTICITY,  NUDITY,  CONFUSING_DESIGN,  URGENCY,  RATINGS,  APP,  ALCOHOL,  CONTESTS,  POLITICAL,  OTHER,  IMAGE,  NAR,  INCONSISTENT,  CLICKBAIT,  NO_DESCRIPTION,  LOW_QUALITY,  EXAGGERATED_CLAIMS,  PINTEREST_BRAND,  ALCOHOL_NO_SALE,  LANDING_PAGE_SPEED,  LANDING_PAGE_HARDWALL,  LANDING_PAGE_BROKEN,  LANDING_PAGE_QUALITY,  OUT_OF_STOCK,  IMAGE_LOW_QUALITY,  IMAGE_BUSY,  IMAGE_POORLY_EDITED,  IMAGE_BEFORE_AFTER,  UGC,  FAKE_BUTTONS,  WEAPONS,  SENSITIVE,  UNACCEPTABLE_BUSINESS,  SUSPICIOUS_CLAIMS,  PHARMA,  SUSPICIOUS_SUPPLEMENTS,  ILLEGAL_RECREATIONAL_DRUG,  LOW_QUALITY_LANDING_PAGE,  RESTRICTED_HEALTHCARE,  INCONSISTENT_LANG_FR,  };

  AdResponse._();

  factory AdResponse([void updates(AdResponseBuilder b)]) = _$AdResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdResponse> get serializer => _$AdResponseSerializer();
}

class _$AdResponseSerializer implements PrimitiveSerializer<AdResponse> {
  @override
  final Iterable<Type> types = const [AdResponse, _$AdResponse];

  @override
  final String wireName = r'AdResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.iosDeepLink != null) {
      yield r'ios_deep_link';
      yield serializers.serialize(
        object.iosDeepLink,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.pinId != null) {
      yield r'pin_id';
      yield serializers.serialize(
        object.pinId,
        specifiedType: const FullType(String),
      );
    }
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(String),
      );
    }
    if (object.isPinDeleted != null) {
      yield r'is_pin_deleted';
      yield serializers.serialize(
        object.isPinDeleted,
        specifiedType: const FullType(bool),
      );
    }
    if (object.carouselIosDeepLinks != null) {
      yield r'carousel_ios_deep_links';
      yield serializers.serialize(
        object.carouselIosDeepLinks,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
    if (object.trackingUrls != null) {
      yield r'tracking_urls';
      yield serializers.serialize(
        object.trackingUrls,
        specifiedType: const FullType.nullable(TrackingUrls),
      );
    }
    if (object.rejectedReasons != null) {
      yield r'rejected_reasons';
      yield serializers.serialize(
        object.rejectedReasons,
        specifiedType: const FullType(BuiltList, [FullType(AdResponseRejectedReasonsEnum)]),
      );
    }
    if (object.adGroupId != null) {
      yield r'ad_group_id';
      yield serializers.serialize(
        object.adGroupId,
        specifiedType: const FullType(String),
      );
    }
    if (object.carouselDestinationUrls != null) {
      yield r'carousel_destination_urls';
      yield serializers.serialize(
        object.carouselDestinationUrls,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
    if (object.summaryStatus != null) {
      yield r'summary_status';
      yield serializers.serialize(
        object.summaryStatus,
        specifiedType: const FullType(PinPromotionSummaryStatus),
      );
    }
    if (object.customizableCtaType != null) {
      yield r'customizable_cta_type';
      yield serializers.serialize(
        object.customizableCtaType,
        specifiedType: const FullType.nullable(CustomizableCTAType),
      );
    }
    if (object.clickTrackingUrl != null) {
      yield r'click_tracking_url';
      yield serializers.serialize(
        object.clickTrackingUrl,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.viewTrackingUrl != null) {
      yield r'view_tracking_url';
      yield serializers.serialize(
        object.viewTrackingUrl,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.createdTime != null) {
      yield r'created_time';
      yield serializers.serialize(
        object.createdTime,
        specifiedType: const FullType(int),
      );
    }
    if (object.carouselAndroidDeepLinks != null) {
      yield r'carousel_android_deep_links';
      yield serializers.serialize(
        object.carouselAndroidDeepLinks,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.androidDeepLink != null) {
      yield r'android_deep_link';
      yield serializers.serialize(
        object.androidDeepLink,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.gridClickType != null) {
      yield r'grid_click_type';
      yield serializers.serialize(
        object.gridClickType,
        specifiedType: const FullType.nullable(GridClickType),
      );
    }
    if (object.updatedTime != null) {
      yield r'updated_time';
      yield serializers.serialize(
        object.updatedTime,
        specifiedType: const FullType(int),
      );
    }
    if (object.disclosureType != null) {
      yield r'disclosure_type';
      yield serializers.serialize(
        object.disclosureType,
        specifiedType: const FullType.nullable(DisclosureType),
      );
    }
    if (object.adAccountId != null) {
      yield r'ad_account_id';
      yield serializers.serialize(
        object.adAccountId,
        specifiedType: const FullType(String),
      );
    }
    if (object.campaignId != null) {
      yield r'campaign_id';
      yield serializers.serialize(
        object.campaignId,
        specifiedType: const FullType(String),
      );
    }
    if (object.destinationUrl != null) {
      yield r'destination_url';
      yield serializers.serialize(
        object.destinationUrl,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.rejectionLabels != null) {
      yield r'rejection_labels';
      yield serializers.serialize(
        object.rejectionLabels,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.creativeType != null) {
      yield r'creative_type';
      yield serializers.serialize(
        object.creativeType,
        specifiedType: const FullType(CreativeType),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.quizPinData != null) {
      yield r'quiz_pin_data';
      yield serializers.serialize(
        object.quizPinData,
        specifiedType: const FullType.nullable(QuizPinData),
      );
    }
    if (object.reviewStatus != null) {
      yield r'review_status';
      yield serializers.serialize(
        object.reviewStatus,
        specifiedType: const FullType(AdResponseReviewStatusEnum),
      );
    }
    if (object.leadFormId != null) {
      yield r'lead_form_id';
      yield serializers.serialize(
        object.leadFormId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.collectionItemsDestinationUrlTemplate != null) {
      yield r'collection_items_destination_url_template';
      yield serializers.serialize(
        object.collectionItemsDestinationUrlTemplate,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.disclosureUrl != null) {
      yield r'disclosure_url';
      yield serializers.serialize(
        object.disclosureUrl,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.isRemovable != null) {
      yield r'is_removable';
      yield serializers.serialize(
        object.isRemovable,
        specifiedType: const FullType(bool),
      );
    }
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
    AdResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ios_deep_link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.iosDeepLink = valueDes;
          break;
        case r'pin_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.pinId = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.type = valueDes;
          break;
        case r'is_pin_deleted':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isPinDeleted = valueDes;
          break;
        case r'carousel_ios_deep_links':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.carouselIosDeepLinks.replace(valueDes);
          break;
        case r'tracking_urls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TrackingUrls),
          ) as TrackingUrls?;
          if (valueDes == null) continue;
          result.trackingUrls.replace(valueDes);
          break;
        case r'rejected_reasons':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AdResponseRejectedReasonsEnum)]),
          ) as BuiltList<AdResponseRejectedReasonsEnum>;
          result.rejectedReasons.replace(valueDes);
          break;
        case r'ad_group_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adGroupId = valueDes;
          break;
        case r'carousel_destination_urls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.carouselDestinationUrls.replace(valueDes);
          break;
        case r'summary_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PinPromotionSummaryStatus),
          ) as PinPromotionSummaryStatus;
          result.summaryStatus = valueDes;
          break;
        case r'customizable_cta_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CustomizableCTAType),
          ) as CustomizableCTAType?;
          if (valueDes == null) continue;
          result.customizableCtaType = valueDes;
          break;
        case r'click_tracking_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.clickTrackingUrl = valueDes;
          break;
        case r'view_tracking_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.viewTrackingUrl = valueDes;
          break;
        case r'created_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.createdTime = valueDes;
          break;
        case r'carousel_android_deep_links':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.carouselAndroidDeepLinks.replace(valueDes);
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'android_deep_link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.androidDeepLink = valueDes;
          break;
        case r'grid_click_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(GridClickType),
          ) as GridClickType?;
          if (valueDes == null) continue;
          result.gridClickType = valueDes;
          break;
        case r'updated_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.updatedTime = valueDes;
          break;
        case r'disclosure_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(DisclosureType),
          ) as DisclosureType?;
          if (valueDes == null) continue;
          result.disclosureType = valueDes;
          break;
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adAccountId = valueDes;
          break;
        case r'campaign_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.campaignId = valueDes;
          break;
        case r'destination_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.destinationUrl = valueDes;
          break;
        case r'rejection_labels':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.rejectionLabels.replace(valueDes);
          break;
        case r'creative_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreativeType),
          ) as CreativeType;
          result.creativeType = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'quiz_pin_data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(QuizPinData),
          ) as QuizPinData?;
          if (valueDes == null) continue;
          result.quizPinData.replace(valueDes);
          break;
        case r'review_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AdResponseReviewStatusEnum),
          ) as AdResponseReviewStatusEnum;
          result.reviewStatus = valueDes;
          break;
        case r'lead_form_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.leadFormId = valueDes;
          break;
        case r'collection_items_destination_url_template':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.collectionItemsDestinationUrlTemplate = valueDes;
          break;
        case r'disclosure_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.disclosureUrl = valueDes;
          break;
        case r'is_removable':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isRemovable = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(EntityStatus),
          ) as EntityStatus;
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
  AdResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdResponseBuilder();
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

class AdResponseRejectedReasonsEnum extends EnumClass {

  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'HASHTAGS')
  static const AdResponseRejectedReasonsEnum HASHTAGS = _$adResponseRejectedReasonsEnum_HASHTAGS;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'PROMOTIONS_AND_PRICES')
  static const AdResponseRejectedReasonsEnum PROMOTIONS_AND_PRICES = _$adResponseRejectedReasonsEnum_PROMOTIONS_AND_PRICES;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'TARGETING')
  static const AdResponseRejectedReasonsEnum TARGETING = _$adResponseRejectedReasonsEnum_TARGETING;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'LANDING_PAGE')
  static const AdResponseRejectedReasonsEnum LANDING_PAGE = _$adResponseRejectedReasonsEnum_LANDING_PAGE;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'CAPS_AND_SYMBOLS')
  static const AdResponseRejectedReasonsEnum CAPS_AND_SYMBOLS = _$adResponseRejectedReasonsEnum_CAPS_AND_SYMBOLS;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'SHOCKING')
  static const AdResponseRejectedReasonsEnum SHOCKING = _$adResponseRejectedReasonsEnum_SHOCKING;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'WEIGHT_LOSS')
  static const AdResponseRejectedReasonsEnum WEIGHT_LOSS = _$adResponseRejectedReasonsEnum_WEIGHT_LOSS;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'PROHIBITED_PRODUCT')
  static const AdResponseRejectedReasonsEnum PROHIBITED_PRODUCT = _$adResponseRejectedReasonsEnum_PROHIBITED_PRODUCT;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'AUTHENTICITY')
  static const AdResponseRejectedReasonsEnum AUTHENTICITY = _$adResponseRejectedReasonsEnum_AUTHENTICITY;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'NUDITY')
  static const AdResponseRejectedReasonsEnum NUDITY = _$adResponseRejectedReasonsEnum_NUDITY;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'CONFUSING_DESIGN')
  static const AdResponseRejectedReasonsEnum CONFUSING_DESIGN = _$adResponseRejectedReasonsEnum_CONFUSING_DESIGN;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'URGENCY')
  static const AdResponseRejectedReasonsEnum URGENCY = _$adResponseRejectedReasonsEnum_URGENCY;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'RATINGS')
  static const AdResponseRejectedReasonsEnum RATINGS = _$adResponseRejectedReasonsEnum_RATINGS;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'APP')
  static const AdResponseRejectedReasonsEnum APP = _$adResponseRejectedReasonsEnum_APP;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'ALCOHOL')
  static const AdResponseRejectedReasonsEnum ALCOHOL = _$adResponseRejectedReasonsEnum_ALCOHOL;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'CONTESTS')
  static const AdResponseRejectedReasonsEnum CONTESTS = _$adResponseRejectedReasonsEnum_CONTESTS;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'POLITICAL')
  static const AdResponseRejectedReasonsEnum POLITICAL = _$adResponseRejectedReasonsEnum_POLITICAL;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'OTHER')
  static const AdResponseRejectedReasonsEnum OTHER = _$adResponseRejectedReasonsEnum_OTHER;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'IMAGE')
  static const AdResponseRejectedReasonsEnum IMAGE = _$adResponseRejectedReasonsEnum_IMAGE;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'NAR')
  static const AdResponseRejectedReasonsEnum NAR = _$adResponseRejectedReasonsEnum_NAR;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'INCONSISTENT')
  static const AdResponseRejectedReasonsEnum INCONSISTENT = _$adResponseRejectedReasonsEnum_INCONSISTENT;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'CLICKBAIT')
  static const AdResponseRejectedReasonsEnum CLICKBAIT = _$adResponseRejectedReasonsEnum_CLICKBAIT;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'NO_DESCRIPTION')
  static const AdResponseRejectedReasonsEnum NO_DESCRIPTION = _$adResponseRejectedReasonsEnum_NO_DESCRIPTION;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'LOW_QUALITY')
  static const AdResponseRejectedReasonsEnum LOW_QUALITY = _$adResponseRejectedReasonsEnum_LOW_QUALITY;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'EXAGGERATED_CLAIMS')
  static const AdResponseRejectedReasonsEnum EXAGGERATED_CLAIMS = _$adResponseRejectedReasonsEnum_EXAGGERATED_CLAIMS;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'PINTEREST_BRAND')
  static const AdResponseRejectedReasonsEnum PINTEREST_BRAND = _$adResponseRejectedReasonsEnum_PINTEREST_BRAND;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'ALCOHOL_NO_SALE')
  static const AdResponseRejectedReasonsEnum ALCOHOL_NO_SALE = _$adResponseRejectedReasonsEnum_ALCOHOL_NO_SALE;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'LANDING_PAGE_SPEED')
  static const AdResponseRejectedReasonsEnum LANDING_PAGE_SPEED = _$adResponseRejectedReasonsEnum_LANDING_PAGE_SPEED;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'LANDING_PAGE_HARDWALL')
  static const AdResponseRejectedReasonsEnum LANDING_PAGE_HARDWALL = _$adResponseRejectedReasonsEnum_LANDING_PAGE_HARDWALL;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'LANDING_PAGE_BROKEN')
  static const AdResponseRejectedReasonsEnum LANDING_PAGE_BROKEN = _$adResponseRejectedReasonsEnum_LANDING_PAGE_BROKEN;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'LANDING_PAGE_QUALITY')
  static const AdResponseRejectedReasonsEnum LANDING_PAGE_QUALITY = _$adResponseRejectedReasonsEnum_LANDING_PAGE_QUALITY;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'OUT_OF_STOCK')
  static const AdResponseRejectedReasonsEnum OUT_OF_STOCK = _$adResponseRejectedReasonsEnum_OUT_OF_STOCK;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'IMAGE_LOW_QUALITY')
  static const AdResponseRejectedReasonsEnum IMAGE_LOW_QUALITY = _$adResponseRejectedReasonsEnum_IMAGE_LOW_QUALITY;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'IMAGE_BUSY')
  static const AdResponseRejectedReasonsEnum IMAGE_BUSY = _$adResponseRejectedReasonsEnum_IMAGE_BUSY;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'IMAGE_POORLY_EDITED')
  static const AdResponseRejectedReasonsEnum IMAGE_POORLY_EDITED = _$adResponseRejectedReasonsEnum_IMAGE_POORLY_EDITED;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'IMAGE_BEFORE_AFTER')
  static const AdResponseRejectedReasonsEnum IMAGE_BEFORE_AFTER = _$adResponseRejectedReasonsEnum_IMAGE_BEFORE_AFTER;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'UGC')
  static const AdResponseRejectedReasonsEnum UGC = _$adResponseRejectedReasonsEnum_UGC;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'FAKE_BUTTONS')
  static const AdResponseRejectedReasonsEnum FAKE_BUTTONS = _$adResponseRejectedReasonsEnum_FAKE_BUTTONS;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'WEAPONS')
  static const AdResponseRejectedReasonsEnum WEAPONS = _$adResponseRejectedReasonsEnum_WEAPONS;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'SENSITIVE')
  static const AdResponseRejectedReasonsEnum SENSITIVE = _$adResponseRejectedReasonsEnum_SENSITIVE;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'UNACCEPTABLE_BUSINESS')
  static const AdResponseRejectedReasonsEnum UNACCEPTABLE_BUSINESS = _$adResponseRejectedReasonsEnum_UNACCEPTABLE_BUSINESS;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'SUSPICIOUS_CLAIMS')
  static const AdResponseRejectedReasonsEnum SUSPICIOUS_CLAIMS = _$adResponseRejectedReasonsEnum_SUSPICIOUS_CLAIMS;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'PHARMA')
  static const AdResponseRejectedReasonsEnum PHARMA = _$adResponseRejectedReasonsEnum_PHARMA;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'SUSPICIOUS_SUPPLEMENTS')
  static const AdResponseRejectedReasonsEnum SUSPICIOUS_SUPPLEMENTS = _$adResponseRejectedReasonsEnum_SUSPICIOUS_SUPPLEMENTS;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'ILLEGAL_RECREATIONAL_DRUG')
  static const AdResponseRejectedReasonsEnum ILLEGAL_RECREATIONAL_DRUG = _$adResponseRejectedReasonsEnum_ILLEGAL_RECREATIONAL_DRUG;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'LOW_QUALITY_LANDING_PAGE')
  static const AdResponseRejectedReasonsEnum LOW_QUALITY_LANDING_PAGE = _$adResponseRejectedReasonsEnum_LOW_QUALITY_LANDING_PAGE;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'RESTRICTED_HEALTHCARE')
  static const AdResponseRejectedReasonsEnum RESTRICTED_HEALTHCARE = _$adResponseRejectedReasonsEnum_RESTRICTED_HEALTHCARE;
  /// ad disapproval reasons
  @BuiltValueEnumConst(wireName: r'INCONSISTENT_LANG_FR')
  static const AdResponseRejectedReasonsEnum INCONSISTENT_LANG_FR = _$adResponseRejectedReasonsEnum_INCONSISTENT_LANG_FR;

  static Serializer<AdResponseRejectedReasonsEnum> get serializer => _$adResponseRejectedReasonsEnumSerializer;

  const AdResponseRejectedReasonsEnum._(String name): super(name);

  static BuiltSet<AdResponseRejectedReasonsEnum> get values => _$adResponseRejectedReasonsEnumValues;
  static AdResponseRejectedReasonsEnum valueOf(String name) => _$adResponseRejectedReasonsEnumValueOf(name);
}

class AdResponseReviewStatusEnum extends EnumClass {

  /// Ad review status
  @BuiltValueEnumConst(wireName: r'OTHER')
  static const AdResponseReviewStatusEnum OTHER = _$adResponseReviewStatusEnum_OTHER;
  /// Ad review status
  @BuiltValueEnumConst(wireName: r'PENDING')
  static const AdResponseReviewStatusEnum PENDING = _$adResponseReviewStatusEnum_PENDING;
  /// Ad review status
  @BuiltValueEnumConst(wireName: r'REJECTED')
  static const AdResponseReviewStatusEnum REJECTED = _$adResponseReviewStatusEnum_REJECTED;
  /// Ad review status
  @BuiltValueEnumConst(wireName: r'APPROVED')
  static const AdResponseReviewStatusEnum APPROVED = _$adResponseReviewStatusEnum_APPROVED;

  static Serializer<AdResponseReviewStatusEnum> get serializer => _$adResponseReviewStatusEnumSerializer;

  const AdResponseReviewStatusEnum._(String name): super(name);

  static BuiltSet<AdResponseReviewStatusEnum> get values => _$adResponseReviewStatusEnumValues;
  static AdResponseReviewStatusEnum valueOf(String name) => _$adResponseReviewStatusEnumValueOf(name);
}

