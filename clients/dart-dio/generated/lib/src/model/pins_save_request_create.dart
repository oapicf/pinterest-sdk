//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pins_save_request_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [boardId] - Unique identifier of the board to which the pin will be saved.
/// * [boardSectionId] - Unique identifier of the board section to which the pin will be saved.
@BuiltValue()
abstract class PinsSaveRequestCreate implements Built<PinsSaveRequestCreate, PinsSaveRequestCreateBuilder> {
  /// Unique identifier of the board to which the pin will be saved.
  @BuiltValueField(wireName: r'board_id')
  String? get boardId;

  /// Unique identifier of the board section to which the pin will be saved.
  @BuiltValueField(wireName: r'board_section_id')
  String? get boardSectionId;

  PinsSaveRequestCreate._();

  factory PinsSaveRequestCreate([void updates(PinsSaveRequestCreateBuilder b)]) = _$PinsSaveRequestCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinsSaveRequestCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinsSaveRequestCreate> get serializer => _$PinsSaveRequestCreateSerializer();
}

class _$PinsSaveRequestCreateSerializer implements PrimitiveSerializer<PinsSaveRequestCreate> {
  @override
  final Iterable<Type> types = const [PinsSaveRequestCreate, _$PinsSaveRequestCreate];

  @override
  final String wireName = r'PinsSaveRequestCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinsSaveRequestCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.boardId != null) {
      yield r'board_id';
      yield serializers.serialize(
        object.boardId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.boardSectionId != null) {
      yield r'board_section_id';
      yield serializers.serialize(
        object.boardSectionId,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    PinsSaveRequestCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinsSaveRequestCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'board_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.boardId = valueDes;
          break;
        case r'board_section_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.boardSectionId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PinsSaveRequestCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinsSaveRequestCreateBuilder();
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

