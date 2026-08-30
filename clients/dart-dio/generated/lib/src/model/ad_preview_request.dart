//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ad_preview_shopping.dart';
import 'package:openapi/src/model/ad_preview_source_image.dart';
import 'package:openapi/src/model/customizable_cta_type.dart';
import 'package:openapi/src/model/ad_shopping_preview_creative_type.dart';
import 'package:openapi/src/model/ad_preview_source_pin_id.dart';
import 'package:openapi/src/model/base_preferred_media_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'ad_preview_request.g.dart';

/// AdPreviewRequest
///
/// Properties:
/// * [imageUrl] - Image URL.
/// * [promotionId] - Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
/// * [title] - Title displayed below ad.
/// * [creativeType] - Ad format of the shopping ad preview.
/// * [pinId] - Pin ID.
/// * [catalogProductGroupId] - Catalog Product Group Id.
/// * [customizableCtaType] - Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
/// * [heroImageTitle] - Title displayed below ad.
/// * [heroImageUrl] - Hero image URL.
/// * [heroPinId] - Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
/// * [imageTag] - Multi image template tag.
/// * [itemId] - Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
/// * [preferredMediaType] - Preferred media type.
/// * [showPromotion] - Include promotion data in preview when available on catalog item. Defaults to false.
/// * [videoTag] - Multi video template tag, image_tag and video_tag are mutual exclusive.
@BuiltValue()
abstract class AdPreviewRequest implements Built<AdPreviewRequest, AdPreviewRequestBuilder> {
  /// One Of [AdPreviewShopping], [AdPreviewSourceImage], [AdPreviewSourcePinId]
  OneOf get oneOf;

  AdPreviewRequest._();

  factory AdPreviewRequest([void updates(AdPreviewRequestBuilder b)]) = _$AdPreviewRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdPreviewRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdPreviewRequest> get serializer => _$AdPreviewRequestSerializer();
}

class _$AdPreviewRequestSerializer implements PrimitiveSerializer<AdPreviewRequest> {
  @override
  final Iterable<Type> types = const [AdPreviewRequest, _$AdPreviewRequest];

  @override
  final String wireName = r'AdPreviewRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdPreviewRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    AdPreviewRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  AdPreviewRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdPreviewRequestBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(AdPreviewSourceImage), FullType(AdPreviewSourcePinId), FullType(AdPreviewShopping), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

