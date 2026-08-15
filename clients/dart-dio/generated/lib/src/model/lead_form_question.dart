//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/lead_form_question_field_type.dart';
import 'package:openapi/src/model/lead_form_question_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'lead_form_question.g.dart';

/// LeadFormQuestion
///
/// Properties:
/// * [customQuestionFieldType] 
/// * [customQuestionLabel] - Question label for a custom question.
/// * [customQuestionOptions] - Question options for a custom question.
/// * [questionType] 
@BuiltValue()
abstract class LeadFormQuestion implements Built<LeadFormQuestion, LeadFormQuestionBuilder> {
  @BuiltValueField(wireName: r'custom_question_field_type')
  LeadFormQuestionFieldType? get customQuestionFieldType;
  // enum customQuestionFieldTypeEnum {  TEXT_FIELD,  TEXT_AREA,  RADIO_LIST,  CHECKBOX,  ,  };

  /// Question label for a custom question.
  @BuiltValueField(wireName: r'custom_question_label')
  String? get customQuestionLabel;

  /// Question options for a custom question.
  @BuiltValueField(wireName: r'custom_question_options')
  BuiltList<String>? get customQuestionOptions;

  @BuiltValueField(wireName: r'question_type')
  LeadFormQuestionType? get questionType;
  // enum questionTypeEnum {  CUSTOM,  FULL_NAME,  FIRST_NAME,  LAST_NAME,  EMAIL,  PHONE_NUMBER,  ZIP_CODE,  GENDER,  CITY,  COUNTRY,  STATE_PROVINCE,  ADDRESS,  DATE_OF_BIRTH,  AGE,  };

  LeadFormQuestion._();

  factory LeadFormQuestion([void updates(LeadFormQuestionBuilder b)]) = _$LeadFormQuestion;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LeadFormQuestionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LeadFormQuestion> get serializer => _$LeadFormQuestionSerializer();
}

class _$LeadFormQuestionSerializer implements PrimitiveSerializer<LeadFormQuestion> {
  @override
  final Iterable<Type> types = const [LeadFormQuestion, _$LeadFormQuestion];

  @override
  final String wireName = r'LeadFormQuestion';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LeadFormQuestion object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.customQuestionFieldType != null) {
      yield r'custom_question_field_type';
      yield serializers.serialize(
        object.customQuestionFieldType,
        specifiedType: const FullType.nullable(LeadFormQuestionFieldType),
      );
    }
    if (object.customQuestionLabel != null) {
      yield r'custom_question_label';
      yield serializers.serialize(
        object.customQuestionLabel,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.customQuestionOptions != null) {
      yield r'custom_question_options';
      yield serializers.serialize(
        object.customQuestionOptions,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
    if (object.questionType != null) {
      yield r'question_type';
      yield serializers.serialize(
        object.questionType,
        specifiedType: const FullType(LeadFormQuestionType),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    LeadFormQuestion object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LeadFormQuestionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'custom_question_field_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(LeadFormQuestionFieldType),
          ) as LeadFormQuestionFieldType?;
          if (valueDes == null) continue;
          result.customQuestionFieldType = valueDes;
          break;
        case r'custom_question_label':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.customQuestionLabel = valueDes;
          break;
        case r'custom_question_options':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.customQuestionOptions.replace(valueDes);
          break;
        case r'question_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(LeadFormQuestionType),
          ) as LeadFormQuestionType;
          result.questionType = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LeadFormQuestion deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LeadFormQuestionBuilder();
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

