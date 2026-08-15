//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/keyword_metrics_response.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'keywords_metrics_array_response.g.dart';

/// KeywordsMetricsArrayResponse
///
/// Properties:
/// * [data] 
@BuiltValue()
abstract class KeywordsMetricsArrayResponse implements Built<KeywordsMetricsArrayResponse, KeywordsMetricsArrayResponseBuilder> {
  @BuiltValueField(wireName: r'data')
  BuiltList<KeywordMetricsResponse>? get data;

  KeywordsMetricsArrayResponse._();

  factory KeywordsMetricsArrayResponse([void updates(KeywordsMetricsArrayResponseBuilder b)]) = _$KeywordsMetricsArrayResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(KeywordsMetricsArrayResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<KeywordsMetricsArrayResponse> get serializer => _$KeywordsMetricsArrayResponseSerializer();
}

class _$KeywordsMetricsArrayResponseSerializer implements PrimitiveSerializer<KeywordsMetricsArrayResponse> {
  @override
  final Iterable<Type> types = const [KeywordsMetricsArrayResponse, _$KeywordsMetricsArrayResponse];

  @override
  final String wireName = r'KeywordsMetricsArrayResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    KeywordsMetricsArrayResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(BuiltList, [FullType(KeywordMetricsResponse)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    KeywordsMetricsArrayResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required KeywordsMetricsArrayResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(KeywordMetricsResponse)]),
          ) as BuiltList<KeywordMetricsResponse>;
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
  KeywordsMetricsArrayResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = KeywordsMetricsArrayResponseBuilder();
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

