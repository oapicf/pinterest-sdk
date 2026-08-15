//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/board.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'boards_list200_response.g.dart';

/// BoardsList200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class BoardsList200Response implements Built<BoardsList200Response, BoardsList200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<Board> get items;

  BoardsList200Response._();

  factory BoardsList200Response([void updates(BoardsList200ResponseBuilder b)]) = _$BoardsList200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BoardsList200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BoardsList200Response> get serializer => _$BoardsList200ResponseSerializer();
}

class _$BoardsList200ResponseSerializer implements PrimitiveSerializer<BoardsList200Response> {
  @override
  final Iterable<Type> types = const [BoardsList200Response, _$BoardsList200Response];

  @override
  final String wireName = r'BoardsList200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BoardsList200Response object, {
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
      specifiedType: const FullType(BuiltList, [FullType(Board)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BoardsList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BoardsList200ResponseBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(Board)]),
          ) as BuiltList<Board>;
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
  BoardsList200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BoardsList200ResponseBuilder();
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

