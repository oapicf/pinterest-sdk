//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/quiz_pin_result.dart';
import 'package:openapi/src/model/quiz_pin_question.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'quiz_pin_data.g.dart';

/// This field includes all quiz data including questions, options, and results.
///
/// Properties:
/// * [questions] 
/// * [results] 
/// * [tieBreakerCustomResult] 
/// * [tieBreakerType] - Quiz ad tie breaker type, default is RANDOM
@BuiltValue()
abstract class QuizPinData implements Built<QuizPinData, QuizPinDataBuilder> {
  @BuiltValueField(wireName: r'questions')
  BuiltList<QuizPinQuestion?>? get questions;

  @BuiltValueField(wireName: r'results')
  BuiltList<QuizPinResult?>? get results;

  @BuiltValueField(wireName: r'tie_breaker_custom_result')
  QuizPinResult? get tieBreakerCustomResult;

  /// Quiz ad tie breaker type, default is RANDOM
  @BuiltValueField(wireName: r'tie_breaker_type')
  QuizPinDataTieBreakerTypeEnum? get tieBreakerType;
  // enum tieBreakerTypeEnum {  RANDOM,  CUSTOM,  };

  QuizPinData._();

  factory QuizPinData([void updates(QuizPinDataBuilder b)]) = _$QuizPinData;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(QuizPinDataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<QuizPinData> get serializer => _$QuizPinDataSerializer();
}

class _$QuizPinDataSerializer implements PrimitiveSerializer<QuizPinData> {
  @override
  final Iterable<Type> types = const [QuizPinData, _$QuizPinData];

  @override
  final String wireName = r'QuizPinData';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    QuizPinData object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.questions != null) {
      yield r'questions';
      yield serializers.serialize(
        object.questions,
        specifiedType: const FullType(BuiltList, [FullType.nullable(QuizPinQuestion)]),
      );
    }
    if (object.results != null) {
      yield r'results';
      yield serializers.serialize(
        object.results,
        specifiedType: const FullType(BuiltList, [FullType.nullable(QuizPinResult)]),
      );
    }
    if (object.tieBreakerCustomResult != null) {
      yield r'tie_breaker_custom_result';
      yield serializers.serialize(
        object.tieBreakerCustomResult,
        specifiedType: const FullType.nullable(QuizPinResult),
      );
    }
    if (object.tieBreakerType != null) {
      yield r'tie_breaker_type';
      yield serializers.serialize(
        object.tieBreakerType,
        specifiedType: const FullType(QuizPinDataTieBreakerTypeEnum),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    QuizPinData object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required QuizPinDataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'questions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType.nullable(QuizPinQuestion)]),
          ) as BuiltList<QuizPinQuestion?>;
          result.questions.replace(valueDes);
          break;
        case r'results':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType.nullable(QuizPinResult)]),
          ) as BuiltList<QuizPinResult?>;
          result.results.replace(valueDes);
          break;
        case r'tie_breaker_custom_result':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(QuizPinResult),
          ) as QuizPinResult?;
          if (valueDes == null) continue;
          result.tieBreakerCustomResult.replace(valueDes);
          break;
        case r'tie_breaker_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(QuizPinDataTieBreakerTypeEnum),
          ) as QuizPinDataTieBreakerTypeEnum;
          result.tieBreakerType = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  QuizPinData deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = QuizPinDataBuilder();
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

class QuizPinDataTieBreakerTypeEnum extends EnumClass {

  /// Quiz ad tie breaker type, default is RANDOM
  @BuiltValueEnumConst(wireName: r'RANDOM')
  static const QuizPinDataTieBreakerTypeEnum RANDOM = _$quizPinDataTieBreakerTypeEnum_RANDOM;
  /// Quiz ad tie breaker type, default is RANDOM
  @BuiltValueEnumConst(wireName: r'CUSTOM')
  static const QuizPinDataTieBreakerTypeEnum CUSTOM = _$quizPinDataTieBreakerTypeEnum_CUSTOM;

  static Serializer<QuizPinDataTieBreakerTypeEnum> get serializer => _$quizPinDataTieBreakerTypeEnumSerializer;

  const QuizPinDataTieBreakerTypeEnum._(String name): super(name);

  static BuiltSet<QuizPinDataTieBreakerTypeEnum> get values => _$quizPinDataTieBreakerTypeEnumValues;
  static QuizPinDataTieBreakerTypeEnum valueOf(String name) => _$quizPinDataTieBreakerTypeEnumValueOf(name);
}

