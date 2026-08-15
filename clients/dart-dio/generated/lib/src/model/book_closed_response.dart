//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'book_closed_response.g.dart';

/// Creation fields
///
/// Properties:
/// * [conversionMetricsReady] - Are conversion metrics ready?
/// * [nonConversionMetricsReady] - Are non-conversion metrics ready?
@BuiltValue()
abstract class BookClosedResponse implements Built<BookClosedResponse, BookClosedResponseBuilder> {
  /// Are conversion metrics ready?
  @BuiltValueField(wireName: r'conversion_metrics_ready')
  bool? get conversionMetricsReady;

  /// Are non-conversion metrics ready?
  @BuiltValueField(wireName: r'non_conversion_metrics_ready')
  bool? get nonConversionMetricsReady;

  BookClosedResponse._();

  factory BookClosedResponse([void updates(BookClosedResponseBuilder b)]) = _$BookClosedResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BookClosedResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BookClosedResponse> get serializer => _$BookClosedResponseSerializer();
}

class _$BookClosedResponseSerializer implements PrimitiveSerializer<BookClosedResponse> {
  @override
  final Iterable<Type> types = const [BookClosedResponse, _$BookClosedResponse];

  @override
  final String wireName = r'BookClosedResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BookClosedResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.conversionMetricsReady != null) {
      yield r'conversion_metrics_ready';
      yield serializers.serialize(
        object.conversionMetricsReady,
        specifiedType: const FullType(bool),
      );
    }
    if (object.nonConversionMetricsReady != null) {
      yield r'non_conversion_metrics_ready';
      yield serializers.serialize(
        object.nonConversionMetricsReady,
        specifiedType: const FullType(bool),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BookClosedResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BookClosedResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'conversion_metrics_ready':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.conversionMetricsReady = valueDes;
          break;
        case r'non_conversion_metrics_ready':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.nonConversionMetricsReady = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BookClosedResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BookClosedResponseBuilder();
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

