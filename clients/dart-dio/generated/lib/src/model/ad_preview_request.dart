//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ad_preview_create_from_pin.dart';
import 'package:openapi/src/model/ad_preview_shopping.dart';
import 'package:openapi/src/model/customizable_cta_type.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ad_preview_create_from_image.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'ad_preview_request.g.dart';

/// AdPreviewRequest
///
/// Properties:
/// * [imageUrl] - Image URL.
/// * [title] - Title displayed below ad.
/// * [pinId] - Pin ID.
/// * [catalogProductGroupId] - Catalog Product Group Id.
/// * [creativeType] - Ad format of the shopping ad preview.
/// * [customizableCtaType] - Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
/// * [heroImageTitle] - Title displayed below ad.
/// * [heroImageUrl] - Hero image URL.
/// * [heroPinId] - Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
/// * [imageTag] - Multi image template tag.
/// * [itemId] - Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
/// * [preferredMediaType] - Preferred media type.
/// * [videoTag] - Multi video template tag, image_tag and video_tag are mutual exclusive.
@BuiltValue()
abstract class AdPreviewRequest implements Built<AdPreviewRequest, AdPreviewRequestBuilder> {
  /// One Of [AdPreviewCreateFromImage], [AdPreviewCreateFromPin], [AdPreviewShopping]
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
    final targetType = const FullType(OneOf, [FullType(AdPreviewCreateFromImage), FullType(AdPreviewCreateFromPin), FullType(AdPreviewShopping), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class AdPreviewRequestCreativeTypeEnum extends EnumClass {

  /// Ad format of the shopping ad preview.
  @BuiltValueEnumConst(wireName: r'SHOPPING')
  static const AdPreviewRequestCreativeTypeEnum SHOPPING = _$adPreviewRequestCreativeTypeEnum_SHOPPING;
  /// Ad format of the shopping ad preview.
  @BuiltValueEnumConst(wireName: r'CAROUSEL')
  static const AdPreviewRequestCreativeTypeEnum CAROUSEL = _$adPreviewRequestCreativeTypeEnum_CAROUSEL;
  /// Ad format of the shopping ad preview.
  @BuiltValueEnumConst(wireName: r'COLLECTION')
  static const AdPreviewRequestCreativeTypeEnum COLLECTION = _$adPreviewRequestCreativeTypeEnum_COLLECTION;
  /// Ad format of the shopping ad preview.
  @BuiltValueEnumConst(wireName: r'REGULAR')
  static const AdPreviewRequestCreativeTypeEnum REGULAR = _$adPreviewRequestCreativeTypeEnum_REGULAR;

  static Serializer<AdPreviewRequestCreativeTypeEnum> get serializer => _$adPreviewRequestCreativeTypeEnumSerializer;

  const AdPreviewRequestCreativeTypeEnum._(String name): super(name);

  static BuiltSet<AdPreviewRequestCreativeTypeEnum> get values => _$adPreviewRequestCreativeTypeEnumValues;
  static AdPreviewRequestCreativeTypeEnum valueOf(String name) => _$adPreviewRequestCreativeTypeEnumValueOf(name);
}

class AdPreviewRequestPreferredMediaTypeEnum extends EnumClass {

  /// Preferred media type.
  @BuiltValueEnumConst(wireName: r'VIDEO')
  static const AdPreviewRequestPreferredMediaTypeEnum VIDEO = _$adPreviewRequestPreferredMediaTypeEnum_VIDEO;
  /// Preferred media type.
  @BuiltValueEnumConst(wireName: r'IMAGE')
  static const AdPreviewRequestPreferredMediaTypeEnum IMAGE = _$adPreviewRequestPreferredMediaTypeEnum_IMAGE;

  static Serializer<AdPreviewRequestPreferredMediaTypeEnum> get serializer => _$adPreviewRequestPreferredMediaTypeEnumSerializer;

  const AdPreviewRequestPreferredMediaTypeEnum._(String name): super(name);

  static BuiltSet<AdPreviewRequestPreferredMediaTypeEnum> get values => _$adPreviewRequestPreferredMediaTypeEnumValues;
  static AdPreviewRequestPreferredMediaTypeEnum valueOf(String name) => _$adPreviewRequestPreferredMediaTypeEnumValueOf(name);
}

