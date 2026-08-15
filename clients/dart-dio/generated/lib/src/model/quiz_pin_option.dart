//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'quiz_pin_option.g.dart';

///  This field contains multiple options to a quiz question.
///
/// Properties:
/// * [id] 
/// * [text] 
@BuiltValue()
abstract class QuizPinOption implements Built<QuizPinOption, QuizPinOptionBuilder> {
  @BuiltValueField(wireName: r'id')
  num? get id;

  @BuiltValueField(wireName: r'text')
  String? get text;

  QuizPinOption._();

  factory QuizPinOption([void updates(QuizPinOptionBuilder b)]) = _$QuizPinOption;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(QuizPinOptionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<QuizPinOption> get serializer => _$QuizPinOptionSerializer();
}

class _$QuizPinOptionSerializer implements PrimitiveSerializer<QuizPinOption> {
  @override
  final Iterable<Type> types = const [QuizPinOption, _$QuizPinOption];

  @override
  final String wireName = r'QuizPinOption';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    QuizPinOption object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(num),
      );
    }
    if (object.text != null) {
      yield r'text';
      yield serializers.serialize(
        object.text,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    QuizPinOption object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required QuizPinOptionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.id = valueDes;
          break;
        case r'text':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.text = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  QuizPinOption deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = QuizPinOptionBuilder();
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

