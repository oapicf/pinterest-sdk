//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/board_media.dart';
import 'package:openapi/src/model/board_update_privacy.dart';
import 'package:openapi/src/model/board_base.dart';
import 'package:openapi/src/model/board_owner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'board_with_update_privacy.g.dart';

/// BoardWithUpdatePrivacy
///
/// Properties:
/// * [boardPinsModifiedAt] - Date and time of last board pins modified.
/// * [collaboratorCount] - Count of collaborators on the board.
/// * [createdAt] - Date and time of board creation.
/// * [description] 
/// * [followerCount] - Board follower count.
/// * [id] 
/// * [isAdsOnly] - If set to `true`, the board will be ad-only and can store ad-only Pins.
/// * [media] - Board media.
/// * [name] -     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
/// * [owner] 
/// * [pinCount] - Count of Pins on the board.
/// * [privacy] 
@BuiltValue()
abstract class BoardWithUpdatePrivacy implements BoardBase, Built<BoardWithUpdatePrivacy, BoardWithUpdatePrivacyBuilder> {
  @BuiltValueField(wireName: r'privacy')
  BoardUpdatePrivacy? get privacy;
  // enum privacyEnum {  PUBLIC,  SECRET,  };

  BoardWithUpdatePrivacy._();

  factory BoardWithUpdatePrivacy([void updates(BoardWithUpdatePrivacyBuilder b)]) = _$BoardWithUpdatePrivacy;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BoardWithUpdatePrivacyBuilder b) => b
      ..isAdsOnly = false;

  @BuiltValueSerializer(custom: true)
  static Serializer<BoardWithUpdatePrivacy> get serializer => _$BoardWithUpdatePrivacySerializer();
}

class _$BoardWithUpdatePrivacySerializer implements PrimitiveSerializer<BoardWithUpdatePrivacy> {
  @override
  final Iterable<Type> types = const [BoardWithUpdatePrivacy, _$BoardWithUpdatePrivacy];

  @override
  final String wireName = r'BoardWithUpdatePrivacy';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BoardWithUpdatePrivacy object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.owner != null) {
      yield r'owner';
      yield serializers.serialize(
        object.owner,
        specifiedType: const FullType(BoardOwner),
      );
    }
    if (object.createdAt != null) {
      yield r'created_at';
      yield serializers.serialize(
        object.createdAt,
        specifiedType: const FullType(DateTime),
      );
    }
    if (object.pinCount != null) {
      yield r'pin_count';
      yield serializers.serialize(
        object.pinCount,
        specifiedType: const FullType(int),
      );
    }
    if (object.collaboratorCount != null) {
      yield r'collaborator_count';
      yield serializers.serialize(
        object.collaboratorCount,
        specifiedType: const FullType(int),
      );
    }
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    if (object.privacy != null) {
      yield r'privacy';
      yield serializers.serialize(
        object.privacy,
        specifiedType: const FullType(BoardUpdatePrivacy),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    if (object.media != null) {
      yield r'media';
      yield serializers.serialize(
        object.media,
        specifiedType: const FullType(BoardMedia),
      );
    }
    if (object.boardPinsModifiedAt != null) {
      yield r'board_pins_modified_at';
      yield serializers.serialize(
        object.boardPinsModifiedAt,
        specifiedType: const FullType(DateTime),
      );
    }
    if (object.followerCount != null) {
      yield r'follower_count';
      yield serializers.serialize(
        object.followerCount,
        specifiedType: const FullType(int),
      );
    }
    if (object.isAdsOnly != null) {
      yield r'is_ads_only';
      yield serializers.serialize(
        object.isAdsOnly,
        specifiedType: const FullType(bool),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BoardWithUpdatePrivacy object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BoardWithUpdatePrivacyBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'owner':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BoardOwner),
          ) as BoardOwner?;
          if (valueDes == null) continue;
          result.owner.replace(valueDes);
          break;
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(DateTime),
          ) as DateTime?;
          if (valueDes == null) continue;
          result.createdAt = valueDes;
          break;
        case r'pin_count':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.pinCount = valueDes;
          break;
        case r'collaborator_count':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.collaboratorCount = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'privacy':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BoardUpdatePrivacy),
          ) as BoardUpdatePrivacy?;
          if (valueDes == null) continue;
          result.privacy = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'media':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BoardMedia),
          ) as BoardMedia?;
          if (valueDes == null) continue;
          result.media.replace(valueDes);
          break;
        case r'board_pins_modified_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(DateTime),
          ) as DateTime?;
          if (valueDes == null) continue;
          result.boardPinsModifiedAt = valueDes;
          break;
        case r'follower_count':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.followerCount = valueDes;
          break;
        case r'is_ads_only':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isAdsOnly = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BoardWithUpdatePrivacy deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BoardWithUpdatePrivacyBuilder();
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

