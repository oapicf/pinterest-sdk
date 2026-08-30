//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'board_section_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [id] 
/// * [name] 
@BuiltValue()
abstract class BoardSectionCreate implements Built<BoardSectionCreate, BoardSectionCreateBuilder> {
  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  BoardSectionCreate._();

  factory BoardSectionCreate([void updates(BoardSectionCreateBuilder b)]) = _$BoardSectionCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BoardSectionCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BoardSectionCreate> get serializer => _$BoardSectionCreateSerializer();
}

class _$BoardSectionCreateSerializer implements PrimitiveSerializer<BoardSectionCreate> {
  @override
  final Iterable<Type> types = const [BoardSectionCreate, _$BoardSectionCreate];

  @override
  final String wireName = r'BoardSectionCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BoardSectionCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BoardSectionCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BoardSectionCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BoardSectionCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BoardSectionCreateBuilder();
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

