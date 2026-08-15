//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_preview_url_response.g.dart';

/// AdPreviewURLResponse
///
/// Properties:
/// * [url] - 'Preview URL, expires in 7 days. Can be used in an iframe. For example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/ The preview object ID/key is the last param - 74667c814dd2b19'
@BuiltValue()
abstract class AdPreviewURLResponse implements Built<AdPreviewURLResponse, AdPreviewURLResponseBuilder> {
  /// 'Preview URL, expires in 7 days. Can be used in an iframe. For example: https://ads.pinterest.com/ad-preview/74667c814dd2b19/ The preview object ID/key is the last param - 74667c814dd2b19'
  @BuiltValueField(wireName: r'url')
  String? get url;

  AdPreviewURLResponse._();

  factory AdPreviewURLResponse([void updates(AdPreviewURLResponseBuilder b)]) = _$AdPreviewURLResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdPreviewURLResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdPreviewURLResponse> get serializer => _$AdPreviewURLResponseSerializer();
}

class _$AdPreviewURLResponseSerializer implements PrimitiveSerializer<AdPreviewURLResponse> {
  @override
  final Iterable<Type> types = const [AdPreviewURLResponse, _$AdPreviewURLResponse];

  @override
  final String wireName = r'AdPreviewURLResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdPreviewURLResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.url != null) {
      yield r'url';
      yield serializers.serialize(
        object.url,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdPreviewURLResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdPreviewURLResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.url = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdPreviewURLResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdPreviewURLResponseBuilder();
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

