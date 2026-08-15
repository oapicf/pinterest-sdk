//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/keyword_metrics.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'keyword_metrics_response.g.dart';

/// KeywordMetricsResponse
///
/// Properties:
/// * [keyword] - Keyword name, e.g., \"keyword\":\"fashion outfits\"
/// * [metrics] 
@BuiltValue()
abstract class KeywordMetricsResponse implements Built<KeywordMetricsResponse, KeywordMetricsResponseBuilder> {
  /// Keyword name, e.g., \"keyword\":\"fashion outfits\"
  @BuiltValueField(wireName: r'keyword')
  String? get keyword;

  @BuiltValueField(wireName: r'metrics')
  KeywordMetrics? get metrics;

  KeywordMetricsResponse._();

  factory KeywordMetricsResponse([void updates(KeywordMetricsResponseBuilder b)]) = _$KeywordMetricsResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(KeywordMetricsResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<KeywordMetricsResponse> get serializer => _$KeywordMetricsResponseSerializer();
}

class _$KeywordMetricsResponseSerializer implements PrimitiveSerializer<KeywordMetricsResponse> {
  @override
  final Iterable<Type> types = const [KeywordMetricsResponse, _$KeywordMetricsResponse];

  @override
  final String wireName = r'KeywordMetricsResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    KeywordMetricsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.keyword != null) {
      yield r'keyword';
      yield serializers.serialize(
        object.keyword,
        specifiedType: const FullType(String),
      );
    }
    if (object.metrics != null) {
      yield r'metrics';
      yield serializers.serialize(
        object.metrics,
        specifiedType: const FullType(KeywordMetrics),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    KeywordMetricsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required KeywordMetricsResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'keyword':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.keyword = valueDes;
          break;
        case r'metrics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(KeywordMetrics),
          ) as KeywordMetrics;
          result.metrics.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  KeywordMetricsResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = KeywordMetricsResponseBuilder();
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

