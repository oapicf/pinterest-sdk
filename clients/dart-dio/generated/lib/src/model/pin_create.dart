//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pin_media_source.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pin_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [altText] 
/// * [boardId] - The board to which this Pin belongs.
/// * [boardSectionId] - The board section to which this Pin belongs.
/// * [description] 
/// * [dominantColor] - Dominant pin color. Hex number, e.g. `#6E7874`.
/// * [link] 
/// * [mediaSource] 
/// * [parentPinId] - The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
/// * [sponsorId] - The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta.
/// * [title] 
@BuiltValue()
abstract class PinCreate implements Built<PinCreate, PinCreateBuilder> {
  @BuiltValueField(wireName: r'alt_text')
  String? get altText;

  /// The board to which this Pin belongs.
  @BuiltValueField(wireName: r'board_id')
  String? get boardId;

  /// The board section to which this Pin belongs.
  @BuiltValueField(wireName: r'board_section_id')
  String? get boardSectionId;

  @BuiltValueField(wireName: r'description')
  String? get description;

  /// Dominant pin color. Hex number, e.g. `#6E7874`.
  @BuiltValueField(wireName: r'dominant_color')
  String? get dominantColor;

  @BuiltValueField(wireName: r'link')
  String? get link;

  @BuiltValueField(wireName: r'media_source')
  PinMediaSource? get mediaSource;

  /// The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
  @BuiltValueField(wireName: r'parent_pin_id')
  String? get parentPinId;

  /// The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta.
  @BuiltValueField(wireName: r'sponsor_id')
  String? get sponsorId;

  @BuiltValueField(wireName: r'title')
  String? get title;

  PinCreate._();

  factory PinCreate([void updates(PinCreateBuilder b)]) = _$PinCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinCreate> get serializer => _$PinCreateSerializer();
}

class _$PinCreateSerializer implements PrimitiveSerializer<PinCreate> {
  @override
  final Iterable<Type> types = const [PinCreate, _$PinCreate];

  @override
  final String wireName = r'PinCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinCreate object, {
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
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.dominantColor != null) {
      yield r'dominant_color';
      yield serializers.serialize(
        object.dominantColor,
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
    if (object.mediaSource != null) {
      yield r'media_source';
      yield serializers.serialize(
        object.mediaSource,
        specifiedType: const FullType(PinMediaSource),
      );
    }
    if (object.parentPinId != null) {
      yield r'parent_pin_id';
      yield serializers.serialize(
        object.parentPinId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.sponsorId != null) {
      yield r'sponsor_id';
      yield serializers.serialize(
        object.sponsorId,
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
    PinCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinCreateBuilder result,
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
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'dominant_color':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.dominantColor = valueDes;
          break;
        case r'link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.link = valueDes;
          break;
        case r'media_source':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PinMediaSource),
          ) as PinMediaSource;
          result.mediaSource.replace(valueDes);
          break;
        case r'parent_pin_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.parentPinId = valueDes;
          break;
        case r'sponsor_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.sponsorId = valueDes;
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
  PinCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinCreateBuilder();
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

