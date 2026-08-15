//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bulk_reporting_job_status.g.dart';

class BulkReportingJobStatus extends EnumClass {

  /// Possible status for a bulk reporting job
  @BuiltValueEnumConst(wireName: r'DOES_NOT_EXIST')
  static const BulkReportingJobStatus DOES_NOT_EXIST = _$DOES_NOT_EXIST;
  /// Possible status for a bulk reporting job
  @BuiltValueEnumConst(wireName: r'FINISHED')
  static const BulkReportingJobStatus FINISHED = _$FINISHED;
  /// Possible status for a bulk reporting job
  @BuiltValueEnumConst(wireName: r'IN_PROGRESS')
  static const BulkReportingJobStatus IN_PROGRESS = _$IN_PROGRESS;
  /// Possible status for a bulk reporting job
  @BuiltValueEnumConst(wireName: r'EXPIRED')
  static const BulkReportingJobStatus EXPIRED = _$EXPIRED;
  /// Possible status for a bulk reporting job
  @BuiltValueEnumConst(wireName: r'FAILED')
  static const BulkReportingJobStatus FAILED = _$FAILED;
  /// Possible status for a bulk reporting job
  @BuiltValueEnumConst(wireName: r'CANCELLED')
  static const BulkReportingJobStatus CANCELLED = _$CANCELLED;

  static Serializer<BulkReportingJobStatus> get serializer => _$bulkReportingJobStatusSerializer;

  const BulkReportingJobStatus._(String name): super(name);

  static BuiltSet<BulkReportingJobStatus> get values => _$values;
  static BulkReportingJobStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BulkReportingJobStatusMixin = Object with _$BulkReportingJobStatusMixin;

