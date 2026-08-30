//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'carousel_slot.g.dart';

/// CarouselSlot
///
/// Properties:
/// * [description] - Carousel Pin slot description.
/// * [link] - Carousel Pin slot link.
/// * [title] - Carousel Pin slot title.
@BuiltValue()
abstract class CarouselSlot implements Built<CarouselSlot, CarouselSlotBuilder> {
  /// Carousel Pin slot description.
  @BuiltValueField(wireName: r'description')
  String? get description;

  /// Carousel Pin slot link.
  @BuiltValueField(wireName: r'link')
  String? get link;

  /// Carousel Pin slot title.
  @BuiltValueField(wireName: r'title')
  String? get title;

  CarouselSlot._();

  factory CarouselSlot([void updates(CarouselSlotBuilder b)]) = _$CarouselSlot;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CarouselSlotBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CarouselSlot> get serializer => _$CarouselSlotSerializer();
}

class _$CarouselSlotSerializer implements PrimitiveSerializer<CarouselSlot> {
  @override
  final Iterable<Type> types = const [CarouselSlot, _$CarouselSlot];

  @override
  final String wireName = r'CarouselSlot';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CarouselSlot object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType(String),
      );
    }
    if (object.link != null) {
      yield r'link';
      yield serializers.serialize(
        object.link,
        specifiedType: const FullType(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CarouselSlot object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CarouselSlotBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.link = valueDes;
          break;
        case r'title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.title = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CarouselSlot deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CarouselSlotBuilder();
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

