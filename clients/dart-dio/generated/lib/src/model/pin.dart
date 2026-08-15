//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pin_media.dart';
import 'package:openapi/src/model/board_owner.dart';
import 'package:openapi/src/model/creative_type.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pin.g.dart';

/// Pin model containing properties related to a Pinterest Pin.
///
/// Properties:
/// * [altText] 
/// * [boardId] - The board to which this Pin belongs.
/// * [boardOwner] 
/// * [boardSectionId] - The board section to which this Pin belongs.
/// * [createdAt] 
/// * [creativeType] 
/// * [description] 
/// * [dominantColor] - Dominant pin color. Hex number, e.g. `#6E7874`.
/// * [hasBeenPromoted] - Whether the Pin has been promoted or not.
/// * [id] 
/// * [isOwner] - Whether the \"operation user_account\" is the Pin owner.
/// * [isStandard] - Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
/// * [link] 
/// * [media] 
/// * [parentPinId] - The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
/// * [pinMetrics] - Pin metrics with associated time intervals if any.
/// * [title] 
@BuiltValue()
abstract class Pin implements Built<Pin, PinBuilder> {
  @BuiltValueField(wireName: r'alt_text')
  String? get altText;

  /// The board to which this Pin belongs.
  @BuiltValueField(wireName: r'board_id')
  String? get boardId;

  @BuiltValueField(wireName: r'board_owner')
  BoardOwner? get boardOwner;

  /// The board section to which this Pin belongs.
  @BuiltValueField(wireName: r'board_section_id')
  String? get boardSectionId;

  @BuiltValueField(wireName: r'created_at')
  DateTime? get createdAt;

  @BuiltValueField(wireName: r'creative_type')
  CreativeType? get creativeType;
  // enum creativeTypeEnum {  REGULAR,  VIDEO,  SHOPPING,  CAROUSEL,  MAX_VIDEO,  SHOP_THE_PIN,  COLLECTION,  IDEA,  SHOWCASE,  QUIZ,  COLLAGE,  MAX_WIDTH_REGULAR_COLLECTION,  MAX_WIDTH_VIDEO_COLLECTION,  };

  @BuiltValueField(wireName: r'description')
  String? get description;

  /// Dominant pin color. Hex number, e.g. `#6E7874`.
  @BuiltValueField(wireName: r'dominant_color')
  String? get dominantColor;

  /// Whether the Pin has been promoted or not.
  @BuiltValueField(wireName: r'has_been_promoted')
  bool? get hasBeenPromoted;

  @BuiltValueField(wireName: r'id')
  String get id;

  /// Whether the \"operation user_account\" is the Pin owner.
  @BuiltValueField(wireName: r'is_owner')
  bool? get isOwner;

  /// Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
  @BuiltValueField(wireName: r'is_standard')
  bool? get isStandard;

  @BuiltValueField(wireName: r'link')
  String? get link;

  @BuiltValueField(wireName: r'media')
  PinMedia? get media;

  /// The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
  @BuiltValueField(wireName: r'parent_pin_id')
  String? get parentPinId;

  /// Pin metrics with associated time intervals if any.
  @BuiltValueField(wireName: r'pin_metrics')
  JsonObject? get pinMetrics;

  @BuiltValueField(wireName: r'title')
  String? get title;

  Pin._();

  factory Pin([void updates(PinBuilder b)]) = _$Pin;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Pin> get serializer => _$PinSerializer();
}

class _$PinSerializer implements PrimitiveSerializer<Pin> {
  @override
  final Iterable<Type> types = const [Pin, _$Pin];

  @override
  final String wireName = r'Pin';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Pin object, {
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
    if (object.boardOwner != null) {
      yield r'board_owner';
      yield serializers.serialize(
        object.boardOwner,
        specifiedType: const FullType(BoardOwner),
      );
    }
    if (object.boardSectionId != null) {
      yield r'board_section_id';
      yield serializers.serialize(
        object.boardSectionId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.createdAt != null) {
      yield r'created_at';
      yield serializers.serialize(
        object.createdAt,
        specifiedType: const FullType(DateTime),
      );
    }
    if (object.creativeType != null) {
      yield r'creative_type';
      yield serializers.serialize(
        object.creativeType,
        specifiedType: const FullType.nullable(CreativeType),
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
    if (object.hasBeenPromoted != null) {
      yield r'has_been_promoted';
      yield serializers.serialize(
        object.hasBeenPromoted,
        specifiedType: const FullType(bool),
      );
    }
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    if (object.isOwner != null) {
      yield r'is_owner';
      yield serializers.serialize(
        object.isOwner,
        specifiedType: const FullType(bool),
      );
    }
    if (object.isStandard != null) {
      yield r'is_standard';
      yield serializers.serialize(
        object.isStandard,
        specifiedType: const FullType(bool),
      );
    }
    if (object.link != null) {
      yield r'link';
      yield serializers.serialize(
        object.link,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.media != null) {
      yield r'media';
      yield serializers.serialize(
        object.media,
        specifiedType: const FullType(PinMedia),
      );
    }
    if (object.parentPinId != null) {
      yield r'parent_pin_id';
      yield serializers.serialize(
        object.parentPinId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.pinMetrics != null) {
      yield r'pin_metrics';
      yield serializers.serialize(
        object.pinMetrics,
        specifiedType: const FullType.nullable(JsonObject),
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
    Pin object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinBuilder result,
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
        case r'board_owner':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BoardOwner),
          ) as BoardOwner;
          result.boardOwner.replace(valueDes);
          break;
        case r'board_section_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.boardSectionId = valueDes;
          break;
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(DateTime),
          ) as DateTime;
          result.createdAt = valueDes;
          break;
        case r'creative_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CreativeType),
          ) as CreativeType?;
          if (valueDes == null) continue;
          result.creativeType = valueDes;
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
        case r'has_been_promoted':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.hasBeenPromoted = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'is_owner':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isOwner = valueDes;
          break;
        case r'is_standard':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isStandard = valueDes;
          break;
        case r'link':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.link = valueDes;
          break;
        case r'media':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PinMedia),
          ) as PinMedia;
          result.media.replace(valueDes);
          break;
        case r'parent_pin_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.parentPinId = valueDes;
          break;
        case r'pin_metrics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(JsonObject),
          ) as JsonObject?;
          if (valueDes == null) continue;
          result.pinMetrics = valueDes;
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
  Pin deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinBuilder();
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

