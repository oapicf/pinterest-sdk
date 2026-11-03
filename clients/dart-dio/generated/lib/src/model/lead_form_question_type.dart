//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'lead_form_question_type.g.dart';

/// Lead form question type
class LeadFormQuestionType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CUSTOM')
  static const LeadFormQuestionType CUSTOM = _$CUSTOM;
  @BuiltValueEnumConst(wireName: r'FULL_NAME')
  static const LeadFormQuestionType FULL_NAME = _$FULL_NAME;
  @BuiltValueEnumConst(wireName: r'FIRST_NAME')
  static const LeadFormQuestionType FIRST_NAME = _$FIRST_NAME;
  @BuiltValueEnumConst(wireName: r'LAST_NAME')
  static const LeadFormQuestionType LAST_NAME = _$LAST_NAME;
  @BuiltValueEnumConst(wireName: r'EMAIL')
  static const LeadFormQuestionType EMAIL = _$EMAIL;
  @BuiltValueEnumConst(wireName: r'PHONE_NUMBER')
  static const LeadFormQuestionType PHONE_NUMBER = _$PHONE_NUMBER;
  @BuiltValueEnumConst(wireName: r'ZIP_CODE')
  static const LeadFormQuestionType ZIP_CODE = _$ZIP_CODE;
  @BuiltValueEnumConst(wireName: r'GENDER')
  static const LeadFormQuestionType GENDER = _$GENDER;
  @BuiltValueEnumConst(wireName: r'CITY')
  static const LeadFormQuestionType CITY = _$CITY;
  @BuiltValueEnumConst(wireName: r'COUNTRY')
  static const LeadFormQuestionType COUNTRY = _$COUNTRY;
  @BuiltValueEnumConst(wireName: r'STATE_PROVINCE')
  static const LeadFormQuestionType STATE_PROVINCE = _$STATE_PROVINCE;
  @BuiltValueEnumConst(wireName: r'ADDRESS')
  static const LeadFormQuestionType ADDRESS = _$ADDRESS;
  @BuiltValueEnumConst(wireName: r'DATE_OF_BIRTH')
  static const LeadFormQuestionType DATE_OF_BIRTH = _$DATE_OF_BIRTH;
  @BuiltValueEnumConst(wireName: r'AGE')
  static const LeadFormQuestionType AGE = _$AGE;

  static Serializer<LeadFormQuestionType> get serializer => _$leadFormQuestionTypeSerializer;

  const LeadFormQuestionType._(String name): super(name);

  static BuiltSet<LeadFormQuestionType> get values => _$values;
  static LeadFormQuestionType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class LeadFormQuestionTypeMixin = Object with _$LeadFormQuestionTypeMixin;

