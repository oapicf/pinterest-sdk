//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/board_update_privacy.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'board_with_update_privacy_update.g.dart';

/// Resource create or update operation model.
///
/// Properties:
/// * [description] 
/// * [name] -      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
/// * [privacy] 
@BuiltValue()
abstract class BoardWithUpdatePrivacyUpdate implements Built<BoardWithUpdatePrivacyUpdate, BoardWithUpdatePrivacyUpdateBuilder> {
  @BuiltValueField(wireName: r'description')
  String? get description;

  ///      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
  @BuiltValueField(wireName: r'name')
  String? get name;

  @BuiltValueField(wireName: r'privacy')
  BoardUpdatePrivacy? get privacy;
  // enum privacyEnum {  PUBLIC,  SECRET,  };

  BoardWithUpdatePrivacyUpdate._();

  factory BoardWithUpdatePrivacyUpdate([void updates(BoardWithUpdatePrivacyUpdateBuilder b)]) = _$BoardWithUpdatePrivacyUpdate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BoardWithUpdatePrivacyUpdateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BoardWithUpdatePrivacyUpdate> get serializer => _$BoardWithUpdatePrivacyUpdateSerializer();
}

class _$BoardWithUpdatePrivacyUpdateSerializer implements PrimitiveSerializer<BoardWithUpdatePrivacyUpdate> {
  @override
  final Iterable<Type> types = const [BoardWithUpdatePrivacyUpdate, _$BoardWithUpdatePrivacyUpdate];

  @override
  final String wireName = r'BoardWithUpdatePrivacyUpdate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BoardWithUpdatePrivacyUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.privacy != null) {
      yield r'privacy';
      yield serializers.serialize(
        object.privacy,
        specifiedType: const FullType(BoardUpdatePrivacy),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BoardWithUpdatePrivacyUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BoardWithUpdatePrivacyUpdateBuilder result,
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
            specifiedType: const FullType(BoardUpdatePrivacy),
          ) as BoardUpdatePrivacy;
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
  BoardWithUpdatePrivacyUpdate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BoardWithUpdatePrivacyUpdateBuilder();
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

