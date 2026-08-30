//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_learning_mode_type.g.dart';

class ConversionLearningModeType extends EnumClass {

  /// oCPM learn mode.
  @BuiltValueEnumConst(wireName: r'NOT_ACTIVE')
  static const ConversionLearningModeType NOT_ACTIVE = _$NOT_ACTIVE;
  /// oCPM learn mode.
  @BuiltValueEnumConst(wireName: r'ACTIVE')
  static const ConversionLearningModeType ACTIVE = _$ACTIVE;

  static Serializer<ConversionLearningModeType> get serializer => _$conversionLearningModeTypeSerializer;

  const ConversionLearningModeType._(String name): super(name);

  static BuiltSet<ConversionLearningModeType> get values => _$values;
  static ConversionLearningModeType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ConversionLearningModeTypeMixin = Object with _$ConversionLearningModeTypeMixin;

