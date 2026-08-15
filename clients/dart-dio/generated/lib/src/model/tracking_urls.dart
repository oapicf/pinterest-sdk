//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'tracking_urls.g.dart';

/// Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
///
/// Properties:
/// * [audienceVerification] 
/// * [buyableButton] 
/// * [click] 
/// * [engagement] 
/// * [impression] 
@BuiltValue()
abstract class TrackingUrls implements Built<TrackingUrls, TrackingUrlsBuilder> {
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

  TrackingUrls._();

  factory TrackingUrls([void updates(TrackingUrlsBuilder b)]) = _$TrackingUrls;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TrackingUrlsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TrackingUrls> get serializer => _$TrackingUrlsSerializer();
}

class _$TrackingUrlsSerializer implements PrimitiveSerializer<TrackingUrls> {
  @override
  final Iterable<Type> types = const [TrackingUrls, _$TrackingUrls];

  @override
  final String wireName = r'TrackingUrls';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TrackingUrls object, {
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
    TrackingUrls object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TrackingUrlsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'audience_verification':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.audienceVerification.replace(valueDes);
          break;
        case r'buyable_button':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.buyableButton.replace(valueDes);
          break;
        case r'click':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.click.replace(valueDes);
          break;
        case r'engagement':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.engagement.replace(valueDes);
          break;
        case r'impression':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
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
  TrackingUrls deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TrackingUrlsBuilder();
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

