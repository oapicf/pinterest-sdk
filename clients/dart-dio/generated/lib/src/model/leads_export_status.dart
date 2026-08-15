//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'leads_export_status.g.dart';

class LeadsExportStatus extends EnumClass {

  /// Status of a leads export job
  @BuiltValueEnumConst(wireName: r'IN_PROGRESS')
  static const LeadsExportStatus IN_PROGRESS = _$IN_PROGRESS;
  /// Status of a leads export job
  @BuiltValueEnumConst(wireName: r'FINISHED')
  static const LeadsExportStatus FINISHED = _$FINISHED;
  /// Status of a leads export job
  @BuiltValueEnumConst(wireName: r'FAILED')
  static const LeadsExportStatus FAILED = _$FAILED;

  static Serializer<LeadsExportStatus> get serializer => _$leadsExportStatusSerializer;

  const LeadsExportStatus._(String name): super(name);

  static BuiltSet<LeadsExportStatus> get values => _$values;
  static LeadsExportStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class LeadsExportStatusMixin = Object with _$LeadsExportStatusMixin;

