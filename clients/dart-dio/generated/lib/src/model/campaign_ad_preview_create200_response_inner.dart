//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/campaign_ad_preview_create200_response_inner_data.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_ad_preview_create200_response_inner.g.dart';

/// CampaignAdPreviewCreate200ResponseInner
///
/// Properties:
/// * [data] 
@BuiltValue()
abstract class CampaignAdPreviewCreate200ResponseInner implements Built<CampaignAdPreviewCreate200ResponseInner, CampaignAdPreviewCreate200ResponseInnerBuilder> {
  @BuiltValueField(wireName: r'data')
  CampaignAdPreviewCreate200ResponseInnerData get data;

  CampaignAdPreviewCreate200ResponseInner._();

  factory CampaignAdPreviewCreate200ResponseInner([void updates(CampaignAdPreviewCreate200ResponseInnerBuilder b)]) = _$CampaignAdPreviewCreate200ResponseInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignAdPreviewCreate200ResponseInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignAdPreviewCreate200ResponseInner> get serializer => _$CampaignAdPreviewCreate200ResponseInnerSerializer();
}

class _$CampaignAdPreviewCreate200ResponseInnerSerializer implements PrimitiveSerializer<CampaignAdPreviewCreate200ResponseInner> {
  @override
  final Iterable<Type> types = const [CampaignAdPreviewCreate200ResponseInner, _$CampaignAdPreviewCreate200ResponseInner];

  @override
  final String wireName = r'CampaignAdPreviewCreate200ResponseInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignAdPreviewCreate200ResponseInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(CampaignAdPreviewCreate200ResponseInnerData),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignAdPreviewCreate200ResponseInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignAdPreviewCreate200ResponseInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CampaignAdPreviewCreate200ResponseInnerData),
          ) as CampaignAdPreviewCreate200ResponseInnerData;
          result.data.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignAdPreviewCreate200ResponseInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignAdPreviewCreate200ResponseInnerBuilder();
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

