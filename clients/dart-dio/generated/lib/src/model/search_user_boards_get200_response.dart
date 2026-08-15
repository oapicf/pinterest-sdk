//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/paginated.dart';
import 'package:openapi/src/model/board.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'search_user_boards_get200_response.g.dart';

/// SearchUserBoardsGet200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] - items
@BuiltValue()
abstract class SearchUserBoardsGet200Response implements Paginated, Built<SearchUserBoardsGet200Response, SearchUserBoardsGet200ResponseBuilder> {
  SearchUserBoardsGet200Response._();

  factory SearchUserBoardsGet200Response([void updates(SearchUserBoardsGet200ResponseBuilder b)]) = _$SearchUserBoardsGet200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SearchUserBoardsGet200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SearchUserBoardsGet200Response> get serializer => _$SearchUserBoardsGet200ResponseSerializer();
}

class _$SearchUserBoardsGet200ResponseSerializer implements PrimitiveSerializer<SearchUserBoardsGet200Response> {
  @override
  final Iterable<Type> types = const [SearchUserBoardsGet200Response, _$SearchUserBoardsGet200Response];

  @override
  final String wireName = r'SearchUserBoardsGet200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SearchUserBoardsGet200Response object, {
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
    SearchUserBoardsGet200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SearchUserBoardsGet200ResponseBuilder result,
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
  SearchUserBoardsGet200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SearchUserBoardsGet200ResponseBuilder();
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

