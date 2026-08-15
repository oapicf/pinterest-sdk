//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/board_privacy.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'board_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [description] 
/// * [isAdsOnly] - If set to `true`, the board will be ad-only and can store ad-only Pins.
/// * [name] -      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
/// * [privacy] -     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`. 
@BuiltValue()
abstract class BoardCreate implements Built<BoardCreate, BoardCreateBuilder> {
  @BuiltValueField(wireName: r'description')
  String? get description;

  /// If set to `true`, the board will be ad-only and can store ad-only Pins.
  @BuiltValueField(wireName: r'is_ads_only')
  bool? get isAdsOnly;

  ///      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
  @BuiltValueField(wireName: r'name')
  String get name;

  ///     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`. 
  @BuiltValueField(wireName: r'privacy')
  BoardPrivacy? get privacy;
  // enum privacyEnum {  PUBLIC,  PROTECTED,  SECRET,  };

  BoardCreate._();

  factory BoardCreate([void updates(BoardCreateBuilder b)]) = _$BoardCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BoardCreateBuilder b) => b
      ..isAdsOnly = false
      ..privacy = BoardPrivacy.PUBLIC;

  @BuiltValueSerializer(custom: true)
  static Serializer<BoardCreate> get serializer => _$BoardCreateSerializer();
}

class _$BoardCreateSerializer implements PrimitiveSerializer<BoardCreate> {
  @override
  final Iterable<Type> types = const [BoardCreate, _$BoardCreate];

  @override
  final String wireName = r'BoardCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BoardCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.isAdsOnly != null) {
      yield r'is_ads_only';
      yield serializers.serialize(
        object.isAdsOnly,
        specifiedType: const FullType(bool),
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
        specifiedType: const FullType(BoardPrivacy),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BoardCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BoardCreateBuilder result,
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
        case r'is_ads_only':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isAdsOnly = valueDes;
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
            specifiedType: const FullType(BoardPrivacy),
          ) as BoardPrivacy;
          result.privacy = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BoardCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BoardCreateBuilder();
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

