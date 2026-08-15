//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/paginated.dart';
import 'package:openapi/src/model/board.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'boards_user_follows_list200_response.g.dart';

/// BoardsUserFollowsList200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class BoardsUserFollowsList200Response implements Paginated, Built<BoardsUserFollowsList200Response, BoardsUserFollowsList200ResponseBuilder> {
  BoardsUserFollowsList200Response._();

  factory BoardsUserFollowsList200Response([void updates(BoardsUserFollowsList200ResponseBuilder b)]) = _$BoardsUserFollowsList200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BoardsUserFollowsList200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BoardsUserFollowsList200Response> get serializer => _$BoardsUserFollowsList200ResponseSerializer();
}

class _$BoardsUserFollowsList200ResponseSerializer implements PrimitiveSerializer<BoardsUserFollowsList200Response> {
  @override
  final Iterable<Type> types = const [BoardsUserFollowsList200Response, _$BoardsUserFollowsList200Response];

  @override
  final String wireName = r'BoardsUserFollowsList200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BoardsUserFollowsList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.bookmark != null) {
      yield r'bookmark';
      yield serializers.serialize(
        object.bookmark,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(JsonObject)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BoardsUserFollowsList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BoardsUserFollowsList200ResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'bookmark':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.bookmark = valueDes;
          break;
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(JsonObject)]),
          ) as BuiltList<JsonObject>;
          result.items.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BoardsUserFollowsList200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BoardsUserFollowsList200ResponseBuilder();
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

