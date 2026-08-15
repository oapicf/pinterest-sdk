//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'non_draft_entity_status.g.dart';

class NonDraftEntityStatus extends EnumClass {

  /// Entity status
  @BuiltValueEnumConst(wireName: r'ACTIVE')
  static const NonDraftEntityStatus ACTIVE = _$ACTIVE;
  /// Entity status
  @BuiltValueEnumConst(wireName: r'PAUSED')
  static const NonDraftEntityStatus PAUSED = _$PAUSED;
  /// Entity status
  @BuiltValueEnumConst(wireName: r'ARCHIVED')
  static const NonDraftEntityStatus ARCHIVED = _$ARCHIVED;

  static Serializer<NonDraftEntityStatus> get serializer => _$nonDraftEntityStatusSerializer;

  const NonDraftEntityStatus._(String name): super(name);

  static BuiltSet<NonDraftEntityStatus> get values => _$values;
  static NonDraftEntityStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class NonDraftEntityStatusMixin = Object with _$NonDraftEntityStatusMixin;

