//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/quiz_pin_data.dart';
import 'package:openapi/src/model/customizable_cta_type.dart';
import 'package:openapi/src/model/grid_click_type.dart';
import 'package:openapi/src/model/tracking_urls.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/entity_status.dart';
import 'package:openapi/src/model/disclosure_type.dart';
import 'package:openapi/src/model/creative_type.dart';
import 'package:openapi/src/model/ad_common.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_update_request.g.dart';

/// AdUpdateRequest
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
/// * [id] - The ID of this ad.
/// * [pinId] - Pin ID. This field may only be updated for draft ads.
@BuiltValue()
abstract class AdUpdateRequest implements AdCommon, Built<AdUpdateRequest, AdUpdateRequestBuilder> {
  /// The ID of this ad.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// Pin ID. This field may only be updated for draft ads.
  @BuiltValueField(wireName: r'pin_id')
  String? get pinId;

  AdUpdateRequest._();

  factory AdUpdateRequest([void updates(AdUpdateRequestBuilder b)]) = _$AdUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdUpdateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdUpdateRequest> get serializer => _$AdUpdateRequestSerializer();
}

class _$AdUpdateRequestSerializer implements PrimitiveSerializer<AdUpdateRequest> {
  @override
  final Iterable<Type> types = const [AdUpdateRequest, _$AdUpdateRequest];

  @override
  final String wireName = r'AdUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.disclosureType != null) {
      yield r'disclosure_type';
      yield serializers.serialize(
        object.disclosureType,
        specifiedType: const FullType.nullable(DisclosureType),
      );
    }
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
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.destinationUrl != null) {
      yield r'destination_url';
      yield serializers.serialize(
        object.destinationUrl,
        specifiedType: const FullType.nullable(String),
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
    if (object.carouselAndroidDeepLinks != null) {
      yield r'carousel_android_deep_links';
      yield serializers.serialize(
        object.carouselAndroidDeepLinks,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
    if (object.leadFormId != null) {
      yield r'lead_form_id';
      yield serializers.serialize(
        object.leadFormId,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
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
    AdUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdUpdateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'disclosure_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(DisclosureType),
          ) as DisclosureType?;
          if (valueDes == null) continue;
          result.disclosureType = valueDes;
          break;
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
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pinId = valueDes;
          break;
        case r'destination_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.destinationUrl = valueDes;
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
        case r'carousel_android_deep_links':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.carouselAndroidDeepLinks.replace(valueDes);
          break;
        case r'lead_form_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.leadFormId = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
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
  AdUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdUpdateRequestBuilder();
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

