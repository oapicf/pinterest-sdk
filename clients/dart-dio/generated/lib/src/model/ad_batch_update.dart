//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ad_collections_header_type.dart';
import 'package:openapi/src/model/quiz_pin_data.dart';
import 'package:openapi/src/model/customizable_cta_type.dart';
import 'package:openapi/src/model/grid_click_type.dart';
import 'package:openapi/src/model/tracking_urls.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/entity_status.dart';
import 'package:openapi/src/model/disclosure_type.dart';
import 'package:openapi/src/model/creative_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_batch_update.g.dart';

/// AdBatchUpdate
///
/// Properties:
/// * [adGroupId] - ID of the ad group that contains the ad.
/// * [androidDeepLink] - Deep link URL for Android devices.
/// * [carouselAndroidDeepLinks] - Comma-separated deep links for the carousel pin on Android.
/// * [carouselDestinationUrls] - Comma-separated destination URLs for the carousel pin to promote.
/// * [carouselIosDeepLinks] - Comma-separated deep links for the carousel pin on iOS.
/// * [clickTrackingUrl] - Tracking url for the ad clicks.
/// * [collectionItemsDestinationUrlTemplate] - Destination URL template for all items within a collections drawer.
/// * [collectionsHeaderType] 
/// * [creativeType] 
/// * [customizableCtaType] 
/// * [destinationUrl] - Destination URL.
/// * [disclosureType] 
/// * [disclosureUrl] - URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
/// * [gridClickType] 
/// * [id] - The ID of this ad.
/// * [iosDeepLink] - Deep link URL for iOS devices.
/// * [isCarting] - Is the ad a carting/WTB ad?
/// * [isCollageAcceptedTerms] - Whether the advertiser has accepted the terms and conditions for collage ad.
/// * [isCollageSingleDestination] - Whether the collage ad has a single destination url override.
/// * [isPinDeleted] - Is original pin deleted?
/// * [isRemovable] - Is pin repinnable?
/// * [leadFormId] - Lead form ID for lead ad generation.
/// * [name] - Name of the ad - 255 chars max.
/// * [pinId] - Pin ID. This field may only be updated for draft ads.
/// * [quizPinData] - Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
/// * [status] 
/// * [trackingUrls] 
/// * [viewTrackingUrl] - Tracking URL for ad impressions.
@BuiltValue()
abstract class AdBatchUpdate implements Built<AdBatchUpdate, AdBatchUpdateBuilder> {
  /// ID of the ad group that contains the ad.
  @BuiltValueField(wireName: r'ad_group_id')
  String? get adGroupId;

  /// Deep link URL for Android devices.
  @BuiltValueField(wireName: r'android_deep_link')
  String? get androidDeepLink;

  /// Comma-separated deep links for the carousel pin on Android.
  @BuiltValueField(wireName: r'carousel_android_deep_links')
  BuiltList<String>? get carouselAndroidDeepLinks;

  /// Comma-separated destination URLs for the carousel pin to promote.
  @BuiltValueField(wireName: r'carousel_destination_urls')
  BuiltList<String>? get carouselDestinationUrls;

  /// Comma-separated deep links for the carousel pin on iOS.
  @BuiltValueField(wireName: r'carousel_ios_deep_links')
  BuiltList<String>? get carouselIosDeepLinks;

  /// Tracking url for the ad clicks.
  @BuiltValueField(wireName: r'click_tracking_url')
  String? get clickTrackingUrl;

  /// Destination URL template for all items within a collections drawer.
  @BuiltValueField(wireName: r'collection_items_destination_url_template')
  String? get collectionItemsDestinationUrlTemplate;

  @BuiltValueField(wireName: r'collections_header_type')
  AdCollectionsHeaderType? get collectionsHeaderType;
  // enum collectionsHeaderTypeEnum {  SHOP_THIS_COLLECTION,  EXPLORE_THIS_COLLECTION,  NO_HEADER,  ,  };

  @BuiltValueField(wireName: r'creative_type')
  CreativeType? get creativeType;
  // enum creativeTypeEnum {  REGULAR,  VIDEO,  SHOPPING,  CAROUSEL,  MAX_VIDEO,  SHOP_THE_PIN,  COLLECTION,  IDEA,  SHOWCASE,  QUIZ,  COLLAGE,  MAX_WIDTH_REGULAR_COLLECTION,  MAX_WIDTH_VIDEO_COLLECTION,  APP,  };

  @BuiltValueField(wireName: r'customizable_cta_type')
  CustomizableCTAType? get customizableCtaType;
  // enum customizableCtaTypeEnum {  GET_OFFER,  LEARN_MORE,  ORDER_NOW,  SHOP_NOW,  SIGN_UP,  SUBSCRIBE,  BUY_NOW,  CONTACT_US,  GET_QUOTE,  VISIT_SITE,  APPLY_NOW,  BOOK_NOW,  REQUEST_DEMO,  REGISTER_NOW,  FIND_A_DEALER,  ADD_TO_CART,  WATCH_NOW,  READ_MORE,  BUY_TICKETS,  DONATE_NOW,  DOWNLOAD,  EXPLORE_MORE,  FIND_A_LOCATION,  FIND_RETAILERS,  GET_DEAL,  GET_RECIPE,  GET_SHOWTIMES,  ON_SALE,  PLAY_GAME,  TRY_IT,  TAKE_A_PEEK,  ,  };

  /// Destination URL.
  @BuiltValueField(wireName: r'destination_url')
  String? get destinationUrl;

  @BuiltValueField(wireName: r'disclosure_type')
  DisclosureType? get disclosureType;
  // enum disclosureTypeEnum {  NO_DISCLOSURE,  PRESCRIBING_INFORMATION,  PRESCRIBING_INFORMATION_BOX_WARNING,  IMPORTANT_SAFETY_INFO,  MED_GUIDE,  PATIENT_INFORMATION,  ,  };

  /// URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
  @BuiltValueField(wireName: r'disclosure_url')
  String? get disclosureUrl;

  @BuiltValueField(wireName: r'grid_click_type')
  GridClickType? get gridClickType;
  // enum gridClickTypeEnum {  CLOSEUP,  DIRECT_TO_DESTINATION,  };

  /// The ID of this ad.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// Deep link URL for iOS devices.
  @BuiltValueField(wireName: r'ios_deep_link')
  String? get iosDeepLink;

  /// Is the ad a carting/WTB ad?
  @BuiltValueField(wireName: r'is_carting')
  bool? get isCarting;

  /// Whether the advertiser has accepted the terms and conditions for collage ad.
  @BuiltValueField(wireName: r'is_collage_accepted_terms')
  bool? get isCollageAcceptedTerms;

  /// Whether the collage ad has a single destination url override.
  @BuiltValueField(wireName: r'is_collage_single_destination')
  bool? get isCollageSingleDestination;

  /// Is original pin deleted?
  @BuiltValueField(wireName: r'is_pin_deleted')
  bool? get isPinDeleted;

  /// Is pin repinnable?
  @BuiltValueField(wireName: r'is_removable')
  bool? get isRemovable;

  /// Lead form ID for lead ad generation.
  @BuiltValueField(wireName: r'lead_form_id')
  String? get leadFormId;

  /// Name of the ad - 255 chars max.
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// Pin ID. This field may only be updated for draft ads.
  @BuiltValueField(wireName: r'pin_id')
  String? get pinId;

  /// Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
  @BuiltValueField(wireName: r'quiz_pin_data')
  QuizPinData? get quizPinData;

  @BuiltValueField(wireName: r'status')
  EntityStatus? get status;
  // enum statusEnum {  ACTIVE,  PAUSED,  ARCHIVED,  DRAFT,  DELETED_DRAFT,  };

  @BuiltValueField(wireName: r'tracking_urls')
  TrackingUrls? get trackingUrls;

  /// Tracking URL for ad impressions.
  @BuiltValueField(wireName: r'view_tracking_url')
  String? get viewTrackingUrl;

  AdBatchUpdate._();

  factory AdBatchUpdate([void updates(AdBatchUpdateBuilder b)]) = _$AdBatchUpdate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdBatchUpdateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdBatchUpdate> get serializer => _$AdBatchUpdateSerializer();
}

class _$AdBatchUpdateSerializer implements PrimitiveSerializer<AdBatchUpdate> {
  @override
  final Iterable<Type> types = const [AdBatchUpdate, _$AdBatchUpdate];

  @override
  final String wireName = r'AdBatchUpdate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdBatchUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adGroupId != null) {
      yield r'ad_group_id';
      yield serializers.serialize(
        object.adGroupId,
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
    if (object.carouselAndroidDeepLinks != null) {
      yield r'carousel_android_deep_links';
      yield serializers.serialize(
        object.carouselAndroidDeepLinks,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
    if (object.carouselDestinationUrls != null) {
      yield r'carousel_destination_urls';
      yield serializers.serialize(
        object.carouselDestinationUrls,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
    if (object.carouselIosDeepLinks != null) {
      yield r'carousel_ios_deep_links';
      yield serializers.serialize(
        object.carouselIosDeepLinks,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
    if (object.clickTrackingUrl != null) {
      yield r'click_tracking_url';
      yield serializers.serialize(
        object.clickTrackingUrl,
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
    if (object.collectionsHeaderType != null) {
      yield r'collections_header_type';
      yield serializers.serialize(
        object.collectionsHeaderType,
        specifiedType: const FullType.nullable(AdCollectionsHeaderType),
      );
    }
    if (object.creativeType != null) {
      yield r'creative_type';
      yield serializers.serialize(
        object.creativeType,
        specifiedType: const FullType(CreativeType),
      );
    }
    if (object.customizableCtaType != null) {
      yield r'customizable_cta_type';
      yield serializers.serialize(
        object.customizableCtaType,
        specifiedType: const FullType.nullable(CustomizableCTAType),
      );
    }
    if (object.destinationUrl != null) {
      yield r'destination_url';
      yield serializers.serialize(
        object.destinationUrl,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.disclosureType != null) {
      yield r'disclosure_type';
      yield serializers.serialize(
        object.disclosureType,
        specifiedType: const FullType.nullable(DisclosureType),
      );
    }
    if (object.disclosureUrl != null) {
      yield r'disclosure_url';
      yield serializers.serialize(
        object.disclosureUrl,
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
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    if (object.iosDeepLink != null) {
      yield r'ios_deep_link';
      yield serializers.serialize(
        object.iosDeepLink,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.isCarting != null) {
      yield r'is_carting';
      yield serializers.serialize(
        object.isCarting,
        specifiedType: const FullType(bool),
      );
    }
    if (object.isCollageAcceptedTerms != null) {
      yield r'is_collage_accepted_terms';
      yield serializers.serialize(
        object.isCollageAcceptedTerms,
        specifiedType: const FullType(bool),
      );
    }
    if (object.isCollageSingleDestination != null) {
      yield r'is_collage_single_destination';
      yield serializers.serialize(
        object.isCollageSingleDestination,
        specifiedType: const FullType(bool),
      );
    }
    if (object.isPinDeleted != null) {
      yield r'is_pin_deleted';
      yield serializers.serialize(
        object.isPinDeleted,
        specifiedType: const FullType(bool),
      );
    }
    if (object.isRemovable != null) {
      yield r'is_removable';
      yield serializers.serialize(
        object.isRemovable,
        specifiedType: const FullType(bool),
      );
    }
    if (object.leadFormId != null) {
      yield r'lead_form_id';
      yield serializers.serialize(
        object.leadFormId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
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
    if (object.quizPinData != null) {
      yield r'quiz_pin_data';
      yield serializers.serialize(
        object.quizPinData,
        specifiedType: const FullType.nullable(QuizPinData),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(EntityStatus),
      );
    }
    if (object.trackingUrls != null) {
      yield r'tracking_urls';
      yield serializers.serialize(
        object.trackingUrls,
        specifiedType: const FullType.nullable(TrackingUrls),
      );
    }
    if (object.viewTrackingUrl != null) {
      yield r'view_tracking_url';
      yield serializers.serialize(
        object.viewTrackingUrl,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdBatchUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdBatchUpdateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_group_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.adGroupId = valueDes;
          break;
        case r'android_deep_link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.androidDeepLink = valueDes;
          break;
        case r'carousel_android_deep_links':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.carouselAndroidDeepLinks.replace(valueDes);
          break;
        case r'carousel_destination_urls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.carouselDestinationUrls.replace(valueDes);
          break;
        case r'carousel_ios_deep_links':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.carouselIosDeepLinks.replace(valueDes);
          break;
        case r'click_tracking_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.clickTrackingUrl = valueDes;
          break;
        case r'collection_items_destination_url_template':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.collectionItemsDestinationUrlTemplate = valueDes;
          break;
        case r'collections_header_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AdCollectionsHeaderType),
          ) as AdCollectionsHeaderType?;
          if (valueDes == null) continue;
          result.collectionsHeaderType = valueDes;
          break;
        case r'creative_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CreativeType),
          ) as CreativeType?;
          if (valueDes == null) continue;
          result.creativeType = valueDes;
          break;
        case r'customizable_cta_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CustomizableCTAType),
          ) as CustomizableCTAType?;
          if (valueDes == null) continue;
          result.customizableCtaType = valueDes;
          break;
        case r'destination_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.destinationUrl = valueDes;
          break;
        case r'disclosure_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(DisclosureType),
          ) as DisclosureType?;
          if (valueDes == null) continue;
          result.disclosureType = valueDes;
          break;
        case r'disclosure_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.disclosureUrl = valueDes;
          break;
        case r'grid_click_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(GridClickType),
          ) as GridClickType?;
          if (valueDes == null) continue;
          result.gridClickType = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'ios_deep_link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.iosDeepLink = valueDes;
          break;
        case r'is_carting':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isCarting = valueDes;
          break;
        case r'is_collage_accepted_terms':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isCollageAcceptedTerms = valueDes;
          break;
        case r'is_collage_single_destination':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isCollageSingleDestination = valueDes;
          break;
        case r'is_pin_deleted':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isPinDeleted = valueDes;
          break;
        case r'is_removable':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isRemovable = valueDes;
          break;
        case r'lead_form_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.leadFormId = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'pin_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pinId = valueDes;
          break;
        case r'quiz_pin_data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(QuizPinData),
          ) as QuizPinData?;
          if (valueDes == null) continue;
          result.quizPinData.replace(valueDes);
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(EntityStatus),
          ) as EntityStatus?;
          if (valueDes == null) continue;
          result.status = valueDes;
          break;
        case r'tracking_urls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TrackingUrls),
          ) as TrackingUrls?;
          if (valueDes == null) continue;
          result.trackingUrls.replace(valueDes);
          break;
        case r'view_tracking_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.viewTrackingUrl = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdBatchUpdate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdBatchUpdateBuilder();
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

