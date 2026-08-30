//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pinterest_lib_error.dart';
import 'package:openapi/src/model/pinterest_lib_status204.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'campaign_ad_preview_delete200_response_inner_status.g.dart';

/// CampaignAdPreviewDelete200ResponseInnerStatus
///
/// Properties:
/// * [statusCode] 
/// * [code] 
/// * [message] 
@BuiltValue()
abstract class CampaignAdPreviewDelete200ResponseInnerStatus implements Built<CampaignAdPreviewDelete200ResponseInnerStatus, CampaignAdPreviewDelete200ResponseInnerStatusBuilder> {
  /// One Of [PinterestLibError], [PinterestLibStatus204]
  OneOf get oneOf;

  CampaignAdPreviewDelete200ResponseInnerStatus._();

  factory CampaignAdPreviewDelete200ResponseInnerStatus([void updates(CampaignAdPreviewDelete200ResponseInnerStatusBuilder b)]) = _$CampaignAdPreviewDelete200ResponseInnerStatus;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignAdPreviewDelete200ResponseInnerStatusBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignAdPreviewDelete200ResponseInnerStatus> get serializer => _$CampaignAdPreviewDelete200ResponseInnerStatusSerializer();
}

class _$CampaignAdPreviewDelete200ResponseInnerStatusSerializer implements PrimitiveSerializer<CampaignAdPreviewDelete200ResponseInnerStatus> {
  @override
  final Iterable<Type> types = const [CampaignAdPreviewDelete200ResponseInnerStatus, _$CampaignAdPreviewDelete200ResponseInnerStatus];

  @override
  final String wireName = r'CampaignAdPreviewDelete200ResponseInnerStatus';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignAdPreviewDelete200ResponseInnerStatus object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignAdPreviewDelete200ResponseInnerStatus object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CampaignAdPreviewDelete200ResponseInnerStatus deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignAdPreviewDelete200ResponseInnerStatusBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(PinterestLibStatus204), FullType(PinterestLibError), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'204')
  static const CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum n204 = _$campaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum_n204;

  static Serializer<CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum> get serializer => _$campaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnumSerializer;

  const CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum._(String name): super(name);

  static BuiltSet<CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum> get values => _$campaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnumValues;
  static CampaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnum valueOf(String name) => _$campaignAdPreviewDelete200ResponseInnerStatusStatusCodeEnumValueOf(name);
}

