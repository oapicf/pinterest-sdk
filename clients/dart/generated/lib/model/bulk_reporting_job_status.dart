//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Possible status for a bulk reporting job
class BulkReportingJobStatus {
  /// Instantiate a new enum with the provided [value].
  const BulkReportingJobStatus._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const DOES_NOT_EXIST = BulkReportingJobStatus._(r'DOES_NOT_EXIST');
  static const FINISHED = BulkReportingJobStatus._(r'FINISHED');
  static const IN_PROGRESS = BulkReportingJobStatus._(r'IN_PROGRESS');
  static const EXPIRED = BulkReportingJobStatus._(r'EXPIRED');
  static const FAILED = BulkReportingJobStatus._(r'FAILED');
  static const CANCELLED = BulkReportingJobStatus._(r'CANCELLED');

  /// List of all possible values in this [enum][BulkReportingJobStatus].
  static const values = <BulkReportingJobStatus>[
    DOES_NOT_EXIST,
    FINISHED,
    IN_PROGRESS,
    EXPIRED,
    FAILED,
    CANCELLED,
  ];

  static BulkReportingJobStatus? fromJson(dynamic value) => BulkReportingJobStatusTypeTransformer().decode(value);

  static List<BulkReportingJobStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BulkReportingJobStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BulkReportingJobStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BulkReportingJobStatus] to String,
/// and [decode] dynamic data back to [BulkReportingJobStatus].
class BulkReportingJobStatusTypeTransformer {
  factory BulkReportingJobStatusTypeTransformer() => _instance ??= const BulkReportingJobStatusTypeTransformer._();

  const BulkReportingJobStatusTypeTransformer._();

  String encode(BulkReportingJobStatus data) => data.value;

  /// Decodes a [dynamic value][data] to a BulkReportingJobStatus.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BulkReportingJobStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'DOES_NOT_EXIST': return BulkReportingJobStatus.DOES_NOT_EXIST;
        case r'FINISHED': return BulkReportingJobStatus.FINISHED;
        case r'IN_PROGRESS': return BulkReportingJobStatus.IN_PROGRESS;
        case r'EXPIRED': return BulkReportingJobStatus.EXPIRED;
        case r'FAILED': return BulkReportingJobStatus.FAILED;
        case r'CANCELLED': return BulkReportingJobStatus.CANCELLED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [BulkReportingJobStatusTypeTransformer] instance.
  static BulkReportingJobStatusTypeTransformer? _instance;
}

