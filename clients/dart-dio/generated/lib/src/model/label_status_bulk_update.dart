//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'label_status_bulk_update.g.dart';

class LabelStatusBulkUpdate extends EnumClass {

  /// Set status to `ARCHIVED` to remove the label from the parent entity.
  @BuiltValueEnumConst(wireName: r'ARCHIVED')
  static const LabelStatusBulkUpdate ARCHIVED = _$ARCHIVED;

  static Serializer<LabelStatusBulkUpdate> get serializer => _$labelStatusBulkUpdateSerializer;

  const LabelStatusBulkUpdate._(String name): super(name);

  static BuiltSet<LabelStatusBulkUpdate> get values => _$values;
  static LabelStatusBulkUpdate valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class LabelStatusBulkUpdateMixin = Object with _$LabelStatusBulkUpdateMixin;

