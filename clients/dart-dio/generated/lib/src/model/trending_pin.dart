//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'trending_pin.g.dart';

/// Pin image data for trending topics
///
/// Properties:
/// * [height] - Height of the pin image in pixels
/// * [id] - Unique identifier for the pin
/// * [src] - URL of the pin image
/// * [width] - Width of the pin image in pixels
@BuiltValue()
abstract class TrendingPin implements Built<TrendingPin, TrendingPinBuilder> {
  /// Height of the pin image in pixels
  @BuiltValueField(wireName: r'height')
  int get height;

  /// Unique identifier for the pin
  @BuiltValueField(wireName: r'id')
  String get id;

  /// URL of the pin image
  @BuiltValueField(wireName: r'src')
  String get src;

  /// Width of the pin image in pixels
  @BuiltValueField(wireName: r'width')
  int get width;

  TrendingPin._();

  factory TrendingPin([void updates(TrendingPinBuilder b)]) = _$TrendingPin;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TrendingPinBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TrendingPin> get serializer => _$TrendingPinSerializer();
}

class _$TrendingPinSerializer implements PrimitiveSerializer<TrendingPin> {
  @override
  final Iterable<Type> types = const [TrendingPin, _$TrendingPin];

  @override
  final String wireName = r'TrendingPin';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TrendingPin object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'height';
    yield serializers.serialize(
      object.height,
      specifiedType: const FullType(int),
    );
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'src';
    yield serializers.serialize(
      object.src,
      specifiedType: const FullType(String),
    );
    yield r'width';
    yield serializers.serialize(
      object.width,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    TrendingPin object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TrendingPinBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'height':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.height = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'src':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.src = valueDes;
          break;
        case r'width':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.width = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TrendingPin deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TrendingPinBuilder();
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

