//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'lead_form_question_field_type.g.dart';

class LeadFormQuestionFieldType extends EnumClass {

  /// Lead form question field type
  @BuiltValueEnumConst(wireName: r'TEXT_FIELD')
  static const LeadFormQuestionFieldType TEXT_FIELD = _$TEXT_FIELD;
  /// Lead form question field type
  @BuiltValueEnumConst(wireName: r'TEXT_AREA')
  static const LeadFormQuestionFieldType TEXT_AREA = _$TEXT_AREA;
  /// Lead form question field type
  @BuiltValueEnumConst(wireName: r'RADIO_LIST')
  static const LeadFormQuestionFieldType RADIO_LIST = _$RADIO_LIST;
  /// Lead form question field type
  @BuiltValueEnumConst(wireName: r'CHECKBOX')
  static const LeadFormQuestionFieldType CHECKBOX = _$CHECKBOX;

  static Serializer<LeadFormQuestionFieldType> get serializer => _$leadFormQuestionFieldTypeSerializer;

  const LeadFormQuestionFieldType._(String name): super(name);

  static BuiltSet<LeadFormQuestionFieldType> get values => _$values;
  static LeadFormQuestionFieldType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class LeadFormQuestionFieldTypeMixin = Object with _$LeadFormQuestionFieldTypeMixin;

