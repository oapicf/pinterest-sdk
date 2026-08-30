//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'label_status.g.dart';

class LabelStatus extends EnumClass {

  /// Label status values.
  @BuiltValueEnumConst(wireName: r'ACTIVE')
  static const LabelStatus ACTIVE = _$ACTIVE;
  /// Label status values.
  @BuiltValueEnumConst(wireName: r'ARCHIVED')
  static const LabelStatus ARCHIVED = _$ARCHIVED;

  static Serializer<LabelStatus> get serializer => _$labelStatusSerializer;

  const LabelStatus._(String name): super(name);

  static BuiltSet<LabelStatus> get values => _$values;
  static LabelStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class LabelStatusMixin = Object with _$LabelStatusMixin;

