//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The status of the operation performed by the batch
class BatchOperationStatus {
  /// Instantiate a new enum with the provided [value].
  const BatchOperationStatus._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PROCESSING = BatchOperationStatus._(r'PROCESSING');
  static const COMPLETED = BatchOperationStatus._(r'COMPLETED');
  static const FAILED = BatchOperationStatus._(r'FAILED');

  /// List of all possible values in this [enum][BatchOperationStatus].
  static const values = <BatchOperationStatus>[
    PROCESSING,
    COMPLETED,
    FAILED,
  ];

  static BatchOperationStatus? fromJson(dynamic value) => BatchOperationStatusTypeTransformer().decode(value);

  static List<BatchOperationStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BatchOperationStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BatchOperationStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BatchOperationStatus] to String,
/// and [decode] dynamic data back to [BatchOperationStatus].
class BatchOperationStatusTypeTransformer {
  factory BatchOperationStatusTypeTransformer() => _instance ??= const BatchOperationStatusTypeTransformer._();

  const BatchOperationStatusTypeTransformer._();

  String encode(BatchOperationStatus data) => data.value;

  /// Decodes a [dynamic value][data] to a BatchOperationStatus.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BatchOperationStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'PROCESSING': return BatchOperationStatus.PROCESSING;
        case r'COMPLETED': return BatchOperationStatus.COMPLETED;
        case r'FAILED': return BatchOperationStatus.FAILED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [BatchOperationStatusTypeTransformer] instance.
  static BatchOperationStatusTypeTransformer? _instance;
}

