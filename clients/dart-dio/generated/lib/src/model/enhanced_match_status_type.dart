//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'enhanced_match_status_type.g.dart';

class EnhancedMatchStatusType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'UNKNOWN')
  static const EnhancedMatchStatusType UNKNOWN = _$UNKNOWN;
  @BuiltValueEnumConst(wireName: r'NOT_VALIDATED')
  static const EnhancedMatchStatusType NOT_VALIDATED = _$NOT_VALIDATED;
  @BuiltValueEnumConst(wireName: r'VALIDATING_IN_PROGRESS')
  static const EnhancedMatchStatusType VALIDATING_IN_PROGRESS = _$VALIDATING_IN_PROGRESS;
  @BuiltValueEnumConst(wireName: r'VALIDATION_COMPLETE')
  static const EnhancedMatchStatusType VALIDATION_COMPLETE = _$VALIDATION_COMPLETE;

  static Serializer<EnhancedMatchStatusType> get serializer => _$enhancedMatchStatusTypeSerializer;

  const EnhancedMatchStatusType._(String name): super(name);

  static BuiltSet<EnhancedMatchStatusType> get values => _$values;
  static EnhancedMatchStatusType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class EnhancedMatchStatusTypeMixin = Object with _$EnhancedMatchStatusTypeMixin;

