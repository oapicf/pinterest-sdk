//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'label_type.g.dart';

class LabelType extends EnumClass {

  /// Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
  @BuiltValueEnumConst(wireName: r'BRAND')
  static const LabelType BRAND = _$BRAND;
  /// Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
  @BuiltValueEnumConst(wireName: r'CUSTOM')
  static const LabelType CUSTOM = _$CUSTOM;

  static Serializer<LabelType> get serializer => _$labelTypeSerializer;

  const LabelType._(String name): super(name);

  static BuiltSet<LabelType> get values => _$values;
  static LabelType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class LabelTypeMixin = Object with _$LabelTypeMixin;

