//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pinterest_lib_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_ad_preview_create200_response_inner_data_one_of.g.dart';

/// CampaignAdPreviewCreate200ResponseInnerDataOneOf
///
/// Properties:
/// * [exceptions] 
@BuiltValue()
abstract class CampaignAdPreviewCreate200ResponseInnerDataOneOf implements Built<CampaignAdPreviewCreate200ResponseInnerDataOneOf, CampaignAdPreviewCreate200ResponseInnerDataOneOfBuilder> {
  @BuiltValueField(wireName: r'exceptions')
  PinterestLibError get exceptions;

  CampaignAdPreviewCreate200ResponseInnerDataOneOf._();

  factory CampaignAdPreviewCreate200ResponseInnerDataOneOf([void updates(CampaignAdPreviewCreate200ResponseInnerDataOneOfBuilder b)]) = _$CampaignAdPreviewCreate200ResponseInnerDataOneOf;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignAdPreviewCreate200ResponseInnerDataOneOfBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignAdPreviewCreate200ResponseInnerDataOneOf> get serializer => _$CampaignAdPreviewCreate200ResponseInnerDataOneOfSerializer();
}

class _$CampaignAdPreviewCreate200ResponseInnerDataOneOfSerializer implements PrimitiveSerializer<CampaignAdPreviewCreate200ResponseInnerDataOneOf> {
  @override
  final Iterable<Type> types = const [CampaignAdPreviewCreate200ResponseInnerDataOneOf, _$CampaignAdPreviewCreate200ResponseInnerDataOneOf];

  @override
  final String wireName = r'CampaignAdPreviewCreate200ResponseInnerDataOneOf';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignAdPreviewCreate200ResponseInnerDataOneOf object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'exceptions';
    yield serializers.serialize(
      object.exceptions,
      specifiedType: const FullType(PinterestLibError),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignAdPreviewCreate200ResponseInnerDataOneOf object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignAdPreviewCreate200ResponseInnerDataOneOfBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'exceptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PinterestLibError),
          ) as PinterestLibError;
          result.exceptions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignAdPreviewCreate200ResponseInnerDataOneOf deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignAdPreviewCreate200ResponseInnerDataOneOfBuilder();
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

