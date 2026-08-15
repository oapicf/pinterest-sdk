//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'quiz_pin_result.g.dart';

/// The result, and link out, based on the user’s choice.
///
/// Properties:
/// * [androidDeepLink] 
/// * [destinationUrl] 
/// * [iosDeepLink] 
/// * [organicPinId] 
/// * [resultId] 
@BuiltValue()
abstract class QuizPinResult implements Built<QuizPinResult, QuizPinResultBuilder> {
  @BuiltValueField(wireName: r'android_deep_link')
  String? get androidDeepLink;

  @BuiltValueField(wireName: r'destination_url')
  String? get destinationUrl;

  @BuiltValueField(wireName: r'ios_deep_link')
  String? get iosDeepLink;

  @BuiltValueField(wireName: r'organic_pin_id')
  String? get organicPinId;

  @BuiltValueField(wireName: r'result_id')
  num? get resultId;

  QuizPinResult._();

  factory QuizPinResult([void updates(QuizPinResultBuilder b)]) = _$QuizPinResult;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(QuizPinResultBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<QuizPinResult> get serializer => _$QuizPinResultSerializer();
}

class _$QuizPinResultSerializer implements PrimitiveSerializer<QuizPinResult> {
  @override
  final Iterable<Type> types = const [QuizPinResult, _$QuizPinResult];

  @override
  final String wireName = r'QuizPinResult';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    QuizPinResult object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.androidDeepLink != null) {
      yield r'android_deep_link';
      yield serializers.serialize(
        object.androidDeepLink,
        specifiedType: const FullType(String),
      );
    }
    if (object.destinationUrl != null) {
      yield r'destination_url';
      yield serializers.serialize(
        object.destinationUrl,
        specifiedType: const FullType(String),
      );
    }
    if (object.iosDeepLink != null) {
      yield r'ios_deep_link';
      yield serializers.serialize(
        object.iosDeepLink,
        specifiedType: const FullType(String),
      );
    }
    if (object.organicPinId != null) {
      yield r'organic_pin_id';
      yield serializers.serialize(
        object.organicPinId,
        specifiedType: const FullType(String),
      );
    }
    if (object.resultId != null) {
      yield r'result_id';
      yield serializers.serialize(
        object.resultId,
        specifiedType: const FullType(num),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    QuizPinResult object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required QuizPinResultBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'android_deep_link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.androidDeepLink = valueDes;
          break;
        case r'destination_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.destinationUrl = valueDes;
          break;
        case r'ios_deep_link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.iosDeepLink = valueDes;
          break;
        case r'organic_pin_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.organicPinId = valueDes;
          break;
        case r'result_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.resultId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  QuizPinResult deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = QuizPinResultBuilder();
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

