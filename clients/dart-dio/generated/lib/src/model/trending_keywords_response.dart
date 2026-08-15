//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/trending_keyword.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'trending_keywords_response.g.dart';

/// TrendingKeywordsResponse
///
/// Properties:
/// * [trends] - The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend.
@BuiltValue()
abstract class TrendingKeywordsResponse implements Built<TrendingKeywordsResponse, TrendingKeywordsResponseBuilder> {
  /// The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend.
  @BuiltValueField(wireName: r'trends')
  BuiltList<TrendingKeyword>? get trends;

  TrendingKeywordsResponse._();

  factory TrendingKeywordsResponse([void updates(TrendingKeywordsResponseBuilder b)]) = _$TrendingKeywordsResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TrendingKeywordsResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TrendingKeywordsResponse> get serializer => _$TrendingKeywordsResponseSerializer();
}

class _$TrendingKeywordsResponseSerializer implements PrimitiveSerializer<TrendingKeywordsResponse> {
  @override
  final Iterable<Type> types = const [TrendingKeywordsResponse, _$TrendingKeywordsResponse];

  @override
  final String wireName = r'TrendingKeywordsResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TrendingKeywordsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.trends != null) {
      yield r'trends';
      yield serializers.serialize(
        object.trends,
        specifiedType: const FullType(BuiltList, [FullType(TrendingKeyword)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TrendingKeywordsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TrendingKeywordsResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'trends':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(TrendingKeyword)]),
          ) as BuiltList<TrendingKeyword>;
          result.trends.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TrendingKeywordsResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TrendingKeywordsResponseBuilder();
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

