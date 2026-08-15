//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'disclosure_type.g.dart';

class DisclosureType extends EnumClass {

  /// Type of information in the page referenced by `disclosure_url`, provided either by the Food and Drug Administration (FDA) or the manufacturer.
  @BuiltValueEnumConst(wireName: r'NO_DISCLOSURE')
  static const DisclosureType NO_DISCLOSURE = _$NO_DISCLOSURE;
  /// Type of information in the page referenced by `disclosure_url`, provided either by the Food and Drug Administration (FDA) or the manufacturer.
  @BuiltValueEnumConst(wireName: r'PRESCRIBING_INFORMATION')
  static const DisclosureType PRESCRIBING_INFORMATION = _$PRESCRIBING_INFORMATION;
  /// Type of information in the page referenced by `disclosure_url`, provided either by the Food and Drug Administration (FDA) or the manufacturer.
  @BuiltValueEnumConst(wireName: r'PRESCRIBING_INFORMATION_BOX_WARNING')
  static const DisclosureType PRESCRIBING_INFORMATION_BOX_WARNING = _$PRESCRIBING_INFORMATION_BOX_WARNING;
  /// Type of information in the page referenced by `disclosure_url`, provided either by the Food and Drug Administration (FDA) or the manufacturer.
  @BuiltValueEnumConst(wireName: r'IMPORTANT_SAFETY_INFO')
  static const DisclosureType IMPORTANT_SAFETY_INFO = _$IMPORTANT_SAFETY_INFO;
  /// Type of information in the page referenced by `disclosure_url`, provided either by the Food and Drug Administration (FDA) or the manufacturer.
  @BuiltValueEnumConst(wireName: r'MED_GUIDE')
  static const DisclosureType MED_GUIDE = _$MED_GUIDE;
  /// Type of information in the page referenced by `disclosure_url`, provided either by the Food and Drug Administration (FDA) or the manufacturer.
  @BuiltValueEnumConst(wireName: r'PATIENT_INFORMATION')
  static const DisclosureType PATIENT_INFORMATION = _$PATIENT_INFORMATION;

  static Serializer<DisclosureType> get serializer => _$disclosureTypeSerializer;

  const DisclosureType._(String name): super(name);

  static BuiltSet<DisclosureType> get values => _$values;
  static DisclosureType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class DisclosureTypeMixin = Object with _$DisclosureTypeMixin;

