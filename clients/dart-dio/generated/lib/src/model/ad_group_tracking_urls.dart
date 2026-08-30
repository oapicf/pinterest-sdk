//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_group_tracking_urls.g.dart';

///   Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).
///
/// Properties:
/// * [audienceVerification] 
/// * [buyableButton] 
/// * [click] 
/// * [engagement] 
/// * [impression] 
@BuiltValue()
abstract class AdGroupTrackingURLs implements Built<AdGroupTrackingURLs, AdGroupTrackingURLsBuilder> {
  @BuiltValueField(wireName: r'audience_verification')
  BuiltList<String>? get audienceVerification;

  @BuiltValueField(wireName: r'buyable_button')
  BuiltList<String>? get buyableButton;

  @BuiltValueField(wireName: r'click')
  BuiltList<String>? get click;

  @BuiltValueField(wireName: r'engagement')
  BuiltList<String>? get engagement;

  @BuiltValueField(wireName: r'impression')
  BuiltList<String>? get impression;

  AdGroupTrackingURLs._();

  factory AdGroupTrackingURLs([void updates(AdGroupTrackingURLsBuilder b)]) = _$AdGroupTrackingURLs;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdGroupTrackingURLsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdGroupTrackingURLs> get serializer => _$AdGroupTrackingURLsSerializer();
}

class _$AdGroupTrackingURLsSerializer implements PrimitiveSerializer<AdGroupTrackingURLs> {
  @override
  final Iterable<Type> types = const [AdGroupTrackingURLs, _$AdGroupTrackingURLs];

  @override
  final String wireName = r'AdGroupTrackingURLs';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdGroupTrackingURLs object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.audienceVerification != null) {
      yield r'audience_verification';
      yield serializers.serialize(
        object.audienceVerification,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.buyableButton != null) {
      yield r'buyable_button';
      yield serializers.serialize(
        object.buyableButton,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.click != null) {
      yield r'click';
      yield serializers.serialize(
        object.click,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.engagement != null) {
      yield r'engagement';
      yield serializers.serialize(
        object.engagement,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.impression != null) {
      yield r'impression';
      yield serializers.serialize(
        object.impression,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdGroupTrackingURLs object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdGroupTrackingURLsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'audience_verification':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.audienceVerification.replace(valueDes);
          break;
        case r'buyable_button':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.buyableButton.replace(valueDes);
          break;
        case r'click':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.click.replace(valueDes);
          break;
        case r'engagement':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.engagement.replace(valueDes);
          break;
        case r'impression':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.impression.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdGroupTrackingURLs deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdGroupTrackingURLsBuilder();
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

