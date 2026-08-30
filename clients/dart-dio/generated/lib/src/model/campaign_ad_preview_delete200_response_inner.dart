//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/campaign_ad_preview_delete200_response_inner_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_ad_preview_delete200_response_inner.g.dart';

/// CampaignAdPreviewDelete200ResponseInner
///
/// Properties:
/// * [status] 
@BuiltValue()
abstract class CampaignAdPreviewDelete200ResponseInner implements Built<CampaignAdPreviewDelete200ResponseInner, CampaignAdPreviewDelete200ResponseInnerBuilder> {
  @BuiltValueField(wireName: r'status')
  CampaignAdPreviewDelete200ResponseInnerStatus get status;

  CampaignAdPreviewDelete200ResponseInner._();

  factory CampaignAdPreviewDelete200ResponseInner([void updates(CampaignAdPreviewDelete200ResponseInnerBuilder b)]) = _$CampaignAdPreviewDelete200ResponseInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignAdPreviewDelete200ResponseInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignAdPreviewDelete200ResponseInner> get serializer => _$CampaignAdPreviewDelete200ResponseInnerSerializer();
}

class _$CampaignAdPreviewDelete200ResponseInnerSerializer implements PrimitiveSerializer<CampaignAdPreviewDelete200ResponseInner> {
  @override
  final Iterable<Type> types = const [CampaignAdPreviewDelete200ResponseInner, _$CampaignAdPreviewDelete200ResponseInner];

  @override
  final String wireName = r'CampaignAdPreviewDelete200ResponseInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignAdPreviewDelete200ResponseInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'status';
    yield serializers.serialize(
      object.status,
      specifiedType: const FullType(CampaignAdPreviewDelete200ResponseInnerStatus),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignAdPreviewDelete200ResponseInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignAdPreviewDelete200ResponseInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CampaignAdPreviewDelete200ResponseInnerStatus),
          ) as CampaignAdPreviewDelete200ResponseInnerStatus;
          result.status.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignAdPreviewDelete200ResponseInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignAdPreviewDelete200ResponseInnerBuilder();
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

