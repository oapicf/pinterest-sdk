//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'nullable_label_type.g.dart';

class NullableLabelType extends EnumClass {

  /// Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
  @BuiltValueEnumConst(wireName: r'BRAND')
  static const NullableLabelType BRAND = _$BRAND;
  /// Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
  @BuiltValueEnumConst(wireName: r'CUSTOM')
  static const NullableLabelType CUSTOM = _$CUSTOM;

  static Serializer<NullableLabelType> get serializer => _$nullableLabelTypeSerializer;

  const NullableLabelType._(String name): super(name);

  static BuiltSet<NullableLabelType> get values => _$values;
  static NullableLabelType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class NullableLabelTypeMixin = Object with _$NullableLabelTypeMixin;

