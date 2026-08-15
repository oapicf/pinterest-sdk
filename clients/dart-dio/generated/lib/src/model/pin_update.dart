//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/carousel_slot.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pin_update.g.dart';

/// Resource create or update operation model.
///
/// Properties:
/// * [altText] 
/// * [boardId] - The board to which this Pin belongs.
/// * [boardSectionId] - The board section to which this Pin belongs.
/// * [carouselSlots] - Carousel Pin slots data.
/// * [description] 
/// * [link] 
/// * [title] 
@BuiltValue()
abstract class PinUpdate implements Built<PinUpdate, PinUpdateBuilder> {
  @BuiltValueField(wireName: r'alt_text')
  String? get altText;

  /// The board to which this Pin belongs.
  @BuiltValueField(wireName: r'board_id')
  String? get boardId;

  /// The board section to which this Pin belongs.
  @BuiltValueField(wireName: r'board_section_id')
  String? get boardSectionId;

  /// Carousel Pin slots data.
  @BuiltValueField(wireName: r'carousel_slots')
  BuiltList<CarouselSlot>? get carouselSlots;

  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'link')
  String? get link;

  @BuiltValueField(wireName: r'title')
  String? get title;

  PinUpdate._();

  factory PinUpdate([void updates(PinUpdateBuilder b)]) = _$PinUpdate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinUpdateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinUpdate> get serializer => _$PinUpdateSerializer();
}

class _$PinUpdateSerializer implements PrimitiveSerializer<PinUpdate> {
  @override
  final Iterable<Type> types = const [PinUpdate, _$PinUpdate];

  @override
  final String wireName = r'PinUpdate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.altText != null) {
      yield r'alt_text';
      yield serializers.serialize(
        object.altText,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.boardId != null) {
      yield r'board_id';
      yield serializers.serialize(
        object.boardId,
        specifiedType: const FullType(String),
      );
    }
    if (object.boardSectionId != null) {
      yield r'board_section_id';
      yield serializers.serialize(
        object.boardSectionId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.carouselSlots != null) {
      yield r'carousel_slots';
      yield serializers.serialize(
        object.carouselSlots,
        specifiedType: const FullType(BuiltList, [FullType(CarouselSlot)]),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.link != null) {
      yield r'link';
      yield serializers.serialize(
        object.link,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.title != null) {
      yield r'title';
      yield serializers.serialize(
        object.title,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    PinUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinUpdateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'alt_text':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.altText = valueDes;
          break;
        case r'board_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.boardId = valueDes;
          break;
        case r'board_section_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.boardSectionId = valueDes;
          break;
        case r'carousel_slots':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CarouselSlot)]),
          ) as BuiltList<CarouselSlot>;
          result.carouselSlots.replace(valueDes);
          break;
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
  PinUpdate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinUpdateBuilder();
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

