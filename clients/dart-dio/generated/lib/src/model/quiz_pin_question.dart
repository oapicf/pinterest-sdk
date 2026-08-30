//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/quiz_pin_option.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'quiz_pin_question.g.dart';

/// A specific quiz inquiry.
///
/// Properties:
/// * [options] 
/// * [questionId] 
/// * [questionText] 
@BuiltValue()
abstract class QuizPinQuestion implements Built<QuizPinQuestion, QuizPinQuestionBuilder> {
  @BuiltValueField(wireName: r'options')
  BuiltList<QuizPinOption?>? get options;

  @BuiltValueField(wireName: r'question_id')
  num? get questionId;

  @BuiltValueField(wireName: r'question_text')
  String? get questionText;

  QuizPinQuestion._();

  factory QuizPinQuestion([void updates(QuizPinQuestionBuilder b)]) = _$QuizPinQuestion;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(QuizPinQuestionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<QuizPinQuestion> get serializer => _$QuizPinQuestionSerializer();
}

class _$QuizPinQuestionSerializer implements PrimitiveSerializer<QuizPinQuestion> {
  @override
  final Iterable<Type> types = const [QuizPinQuestion, _$QuizPinQuestion];

  @override
  final String wireName = r'QuizPinQuestion';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    QuizPinQuestion object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.options != null) {
      yield r'options';
      yield serializers.serialize(
        object.options,
        specifiedType: const FullType(BuiltList, [FullType.nullable(QuizPinOption)]),
      );
    }
    if (object.questionId != null) {
      yield r'question_id';
      yield serializers.serialize(
        object.questionId,
        specifiedType: const FullType(num),
      );
    }
    if (object.questionText != null) {
      yield r'question_text';
      yield serializers.serialize(
        object.questionText,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    QuizPinQuestion object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required QuizPinQuestionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'options':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType.nullable(QuizPinOption)]),
          ) as BuiltList<QuizPinOption?>?;
          if (valueDes == null) continue;
          result.options.replace(valueDes);
          break;
        case r'question_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.questionId = valueDes;
          break;
        case r'question_text':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.questionText = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  QuizPinQuestion deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = QuizPinQuestionBuilder();
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

