//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'book_closed.g.dart';

/// BookClosed
///
/// Properties:
/// * [conversionMetricsReady] - Are conversion metrics ready?
/// * [nonConversionMetricsReady] - Are non-conversion metrics ready?
@BuiltValue()
abstract class BookClosed implements Built<BookClosed, BookClosedBuilder> {
  /// Are conversion metrics ready?
  @BuiltValueField(wireName: r'conversion_metrics_ready')
  bool get conversionMetricsReady;

  /// Are non-conversion metrics ready?
  @BuiltValueField(wireName: r'non_conversion_metrics_ready')
  bool get nonConversionMetricsReady;

  BookClosed._();

  factory BookClosed([void updates(BookClosedBuilder b)]) = _$BookClosed;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BookClosedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BookClosed> get serializer => _$BookClosedSerializer();
}

class _$BookClosedSerializer implements PrimitiveSerializer<BookClosed> {
  @override
  final Iterable<Type> types = const [BookClosed, _$BookClosed];

  @override
  final String wireName = r'BookClosed';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BookClosed object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'conversion_metrics_ready';
    yield serializers.serialize(
      object.conversionMetricsReady,
      specifiedType: const FullType(bool),
    );
    yield r'non_conversion_metrics_ready';
    yield serializers.serialize(
      object.nonConversionMetricsReady,
      specifiedType: const FullType(bool),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BookClosed object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BookClosedBuilder result,
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
  BookClosed deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BookClosedBuilder();
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

