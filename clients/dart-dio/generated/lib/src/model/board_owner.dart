//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'board_owner.g.dart';

/// BoardOwner
///
/// Properties:
/// * [username] 
@BuiltValue()
abstract class BoardOwner implements Built<BoardOwner, BoardOwnerBuilder> {
  @BuiltValueField(wireName: r'username')
  String? get username;

  BoardOwner._();

  factory BoardOwner([void updates(BoardOwnerBuilder b)]) = _$BoardOwner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BoardOwnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BoardOwner> get serializer => _$BoardOwnerSerializer();
}

class _$BoardOwnerSerializer implements PrimitiveSerializer<BoardOwner> {
  @override
  final Iterable<Type> types = const [BoardOwner, _$BoardOwner];

  @override
  final String wireName = r'BoardOwner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BoardOwner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.username != null) {
      yield r'username';
      yield serializers.serialize(
        object.username,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BoardOwner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BoardOwnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'username':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.username = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BoardOwner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BoardOwnerBuilder();
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

