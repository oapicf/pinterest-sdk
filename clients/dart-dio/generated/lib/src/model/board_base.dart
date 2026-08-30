//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/board_media.dart';
import 'package:openapi/src/model/board_owner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'board_base.g.dart';

/// BoardBase
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
@BuiltValue(instantiable: false)
abstract class BoardBase  {
  /// Date and time of last board pins modified.
  @BuiltValueField(wireName: r'board_pins_modified_at')
  DateTime? get boardPinsModifiedAt;

  /// Count of collaborators on the board.
  @BuiltValueField(wireName: r'collaborator_count')
  int? get collaboratorCount;

  /// Date and time of board creation.
  @BuiltValueField(wireName: r'created_at')
  DateTime? get createdAt;

  @BuiltValueField(wireName: r'description')
  String? get description;

  /// Board follower count.
  @BuiltValueField(wireName: r'follower_count')
  int? get followerCount;

  @BuiltValueField(wireName: r'id')
  String get id;

  /// If set to `true`, the board will be ad-only and can store ad-only Pins.
  @BuiltValueField(wireName: r'is_ads_only')
  bool? get isAdsOnly;

  /// Board media.
  @BuiltValueField(wireName: r'media')
  BoardMedia? get media;

  ///     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'owner')
  BoardOwner? get owner;

  /// Count of Pins on the board.
  @BuiltValueField(wireName: r'pin_count')
  int? get pinCount;

  @BuiltValueSerializer(custom: true)
  static Serializer<BoardBase> get serializer => _$BoardBaseSerializer();
}

class _$BoardBaseSerializer implements PrimitiveSerializer<BoardBase> {
  @override
  final Iterable<Type> types = const [BoardBase];

  @override
  final String wireName = r'BoardBase';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BoardBase object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.boardPinsModifiedAt != null) {
      yield r'board_pins_modified_at';
      yield serializers.serialize(
        object.boardPinsModifiedAt,
        specifiedType: const FullType(DateTime),
      );
    }
    if (object.collaboratorCount != null) {
      yield r'collaborator_count';
      yield serializers.serialize(
        object.collaboratorCount,
        specifiedType: const FullType(int),
      );
    }
    if (object.createdAt != null) {
      yield r'created_at';
      yield serializers.serialize(
        object.createdAt,
        specifiedType: const FullType(DateTime),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.followerCount != null) {
      yield r'follower_count';
      yield serializers.serialize(
        object.followerCount,
        specifiedType: const FullType(int),
      );
    }
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    if (object.isAdsOnly != null) {
      yield r'is_ads_only';
      yield serializers.serialize(
        object.isAdsOnly,
        specifiedType: const FullType(bool),
      );
    }
    if (object.media != null) {
      yield r'media';
      yield serializers.serialize(
        object.media,
        specifiedType: const FullType(BoardMedia),
      );
    }
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    if (object.owner != null) {
      yield r'owner';
      yield serializers.serialize(
        object.owner,
        specifiedType: const FullType(BoardOwner),
      );
    }
    if (object.pinCount != null) {
      yield r'pin_count';
      yield serializers.serialize(
        object.pinCount,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BoardBase object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  BoardBase deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($BoardBase)) as $BoardBase;
  }
}

/// a concrete implementation of [BoardBase], since [BoardBase] is not instantiable
@BuiltValue(instantiable: true)
abstract class $BoardBase implements BoardBase, Built<$BoardBase, $BoardBaseBuilder> {
  $BoardBase._();

  factory $BoardBase([void Function($BoardBaseBuilder)? updates]) = _$$BoardBase;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($BoardBaseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$BoardBase> get serializer => _$$BoardBaseSerializer();
}

class _$$BoardBaseSerializer implements PrimitiveSerializer<$BoardBase> {
  @override
  final Iterable<Type> types = const [$BoardBase, _$$BoardBase];

  @override
  final String wireName = r'$BoardBase';

  @override
  Object serialize(
    Serializers serializers,
    $BoardBase object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(BoardBase))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BoardBaseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'board_pins_modified_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(DateTime),
          ) as DateTime?;
          if (valueDes == null) continue;
          result.boardPinsModifiedAt = valueDes;
          break;
        case r'collaborator_count':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.collaboratorCount = valueDes;
          break;
        case r'created_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(DateTime),
          ) as DateTime?;
          if (valueDes == null) continue;
          result.createdAt = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'follower_count':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.followerCount = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'is_ads_only':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isAdsOnly = valueDes;
          break;
        case r'media':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BoardMedia),
          ) as BoardMedia?;
          if (valueDes == null) continue;
          result.media.replace(valueDes);
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'owner':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BoardOwner),
          ) as BoardOwner?;
          if (valueDes == null) continue;
          result.owner.replace(valueDes);
          break;
        case r'pin_count':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.pinCount = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  $BoardBase deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $BoardBaseBuilder();
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

