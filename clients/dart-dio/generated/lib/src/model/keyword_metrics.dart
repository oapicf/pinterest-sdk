//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'keyword_metrics.g.dart';

/// Keyword metrics JSON
///
/// Properties:
/// * [keywordQueryVolume] - Keyword's search frequency. This value is based on keyword frequency in pepsi client response
@BuiltValue()
abstract class KeywordMetrics implements Built<KeywordMetrics, KeywordMetricsBuilder> {
  /// Keyword's search frequency. This value is based on keyword frequency in pepsi client response
  @BuiltValueField(wireName: r'keyword_query_volume')
  String? get keywordQueryVolume;

  KeywordMetrics._();

  factory KeywordMetrics([void updates(KeywordMetricsBuilder b)]) = _$KeywordMetrics;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(KeywordMetricsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<KeywordMetrics> get serializer => _$KeywordMetricsSerializer();
}

class _$KeywordMetricsSerializer implements PrimitiveSerializer<KeywordMetrics> {
  @override
  final Iterable<Type> types = const [KeywordMetrics, _$KeywordMetrics];

  @override
  final String wireName = r'KeywordMetrics';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    KeywordMetrics object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.keywordQueryVolume != null) {
      yield r'keyword_query_volume';
      yield serializers.serialize(
        object.keywordQueryVolume,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    KeywordMetrics object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required KeywordMetricsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'keyword_query_volume':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.keywordQueryVolume = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  KeywordMetrics deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = KeywordMetricsBuilder();
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

