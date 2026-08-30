//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pin_read.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'boards_list_pins200_response.g.dart';

/// BoardsListPins200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class BoardsListPins200Response implements Built<BoardsListPins200Response, BoardsListPins200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<PinRead> get items;

  BoardsListPins200Response._();

  factory BoardsListPins200Response([void updates(BoardsListPins200ResponseBuilder b)]) = _$BoardsListPins200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BoardsListPins200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BoardsListPins200Response> get serializer => _$BoardsListPins200ResponseSerializer();
}

class _$BoardsListPins200ResponseSerializer implements PrimitiveSerializer<BoardsListPins200Response> {
  @override
  final Iterable<Type> types = const [BoardsListPins200Response, _$BoardsListPins200Response];

  @override
  final String wireName = r'BoardsListPins200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BoardsListPins200Response object, {
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
      specifiedType: const FullType(BuiltList, [FullType(PinRead)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BoardsListPins200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BoardsListPins200ResponseBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(PinRead)]),
          ) as BuiltList<PinRead>;
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
  BoardsListPins200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BoardsListPins200ResponseBuilder();
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

