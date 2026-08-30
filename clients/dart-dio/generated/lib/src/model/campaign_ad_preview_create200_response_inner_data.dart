//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pinterest_lib_error.dart';
import 'package:openapi/src/model/campaign_ad_preview.dart';
import 'package:openapi/src/model/campaign_ad_preview_create200_response_inner_data_one_of.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'campaign_ad_preview_create200_response_inner_data.g.dart';

/// Created/updated resource on success or error details on failure
///
/// Properties:
/// * [adAccountId] - Advertiser ID for this preview.
/// * [adGroupId] - Ad group ID to create a preview record for.
/// * [clientId] - Client ID that created preview.
/// * [expiresAt] - Unix timestamp in milliseconds for preview expiration.
/// * [isActive] - Whether preview link is active.
/// * [pinId] - Pin ID for pin promotion preview.
/// * [pinPromotionId] - Pin promotion ID for this preview.
/// * [promotedProductGroupId] - Promoted product group ID for catalog previews.
/// * [url] - Campaign ad preview URL.
/// * [userId] - User ID that created preview.
/// * [uuid] - Pin promotion preview key.
/// * [exceptions] 
@BuiltValue()
abstract class CampaignAdPreviewCreate200ResponseInnerData implements Built<CampaignAdPreviewCreate200ResponseInnerData, CampaignAdPreviewCreate200ResponseInnerDataBuilder> {
  /// One Of [CampaignAdPreview], [CampaignAdPreviewCreate200ResponseInnerDataOneOf]
  OneOf get oneOf;

  CampaignAdPreviewCreate200ResponseInnerData._();

  factory CampaignAdPreviewCreate200ResponseInnerData([void updates(CampaignAdPreviewCreate200ResponseInnerDataBuilder b)]) = _$CampaignAdPreviewCreate200ResponseInnerData;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignAdPreviewCreate200ResponseInnerDataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignAdPreviewCreate200ResponseInnerData> get serializer => _$CampaignAdPreviewCreate200ResponseInnerDataSerializer();
}

class _$CampaignAdPreviewCreate200ResponseInnerDataSerializer implements PrimitiveSerializer<CampaignAdPreviewCreate200ResponseInnerData> {
  @override
  final Iterable<Type> types = const [CampaignAdPreviewCreate200ResponseInnerData, _$CampaignAdPreviewCreate200ResponseInnerData];

  @override
  final String wireName = r'CampaignAdPreviewCreate200ResponseInnerData';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignAdPreviewCreate200ResponseInnerData object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignAdPreviewCreate200ResponseInnerData object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CampaignAdPreviewCreate200ResponseInnerData deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignAdPreviewCreate200ResponseInnerDataBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(CampaignAdPreview), FullType(CampaignAdPreviewCreate200ResponseInnerDataOneOf), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

