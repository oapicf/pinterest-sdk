//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'nullable_label_status.g.dart';

class NullableLabelStatus extends EnumClass {

  /// The new status you want to give the label, either `ACTIVE` (in use) or no longer in use (`ARCHIVED`).
  @BuiltValueEnumConst(wireName: r'ACTIVE')
  static const NullableLabelStatus ACTIVE = _$ACTIVE;
  /// The new status you want to give the label, either `ACTIVE` (in use) or no longer in use (`ARCHIVED`).
  @BuiltValueEnumConst(wireName: r'ARCHIVED')
  static const NullableLabelStatus ARCHIVED = _$ARCHIVED;

  static Serializer<NullableLabelStatus> get serializer => _$nullableLabelStatusSerializer;

  const NullableLabelStatus._(String name): super(name);

  static BuiltSet<NullableLabelStatus> get values => _$values;
  static NullableLabelStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class NullableLabelStatusMixin = Object with _$NullableLabelStatusMixin;

