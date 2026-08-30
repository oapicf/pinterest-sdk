//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'board_section_update_with_required_body.g.dart';

/// Resource create or update operation model with required body fields (no OptionalProperties).
///
/// Properties:
/// * [id] 
/// * [name] 
@BuiltValue()
abstract class BoardSectionUpdateWithRequiredBody implements Built<BoardSectionUpdateWithRequiredBody, BoardSectionUpdateWithRequiredBodyBuilder> {
  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  BoardSectionUpdateWithRequiredBody._();

  factory BoardSectionUpdateWithRequiredBody([void updates(BoardSectionUpdateWithRequiredBodyBuilder b)]) = _$BoardSectionUpdateWithRequiredBody;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BoardSectionUpdateWithRequiredBodyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BoardSectionUpdateWithRequiredBody> get serializer => _$BoardSectionUpdateWithRequiredBodySerializer();
}

class _$BoardSectionUpdateWithRequiredBodySerializer implements PrimitiveSerializer<BoardSectionUpdateWithRequiredBody> {
  @override
  final Iterable<Type> types = const [BoardSectionUpdateWithRequiredBody, _$BoardSectionUpdateWithRequiredBody];

  @override
  final String wireName = r'BoardSectionUpdateWithRequiredBody';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BoardSectionUpdateWithRequiredBody object, {
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
    BoardSectionUpdateWithRequiredBody object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BoardSectionUpdateWithRequiredBodyBuilder result,
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
  BoardSectionUpdateWithRequiredBody deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BoardSectionUpdateWithRequiredBodyBuilder();
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

