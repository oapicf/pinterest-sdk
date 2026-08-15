//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \"Out of Stock\".
class BatchOperation {
  /// Instantiate a new enum with the provided [value].
  const BatchOperation._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const UPDATE = BatchOperation._(r'UPDATE');
  static const UPSERT = BatchOperation._(r'UPSERT');
  static const CREATE = BatchOperation._(r'CREATE');
  static const DELETE_DISCONTINUED = BatchOperation._(r'DELETE_DISCONTINUED');
  static const DELETE = BatchOperation._(r'DELETE');

  /// List of all possible values in this [enum][BatchOperation].
  static const values = <BatchOperation>[
    UPDATE,
    UPSERT,
    CREATE,
    DELETE_DISCONTINUED,
    DELETE,
  ];

  static BatchOperation? fromJson(dynamic value) => BatchOperationTypeTransformer().decode(value);

  static List<BatchOperation> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BatchOperation>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BatchOperation.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BatchOperation] to String,
/// and [decode] dynamic data back to [BatchOperation].
class BatchOperationTypeTransformer {
  factory BatchOperationTypeTransformer() => _instance ??= const BatchOperationTypeTransformer._();

  const BatchOperationTypeTransformer._();

  String encode(BatchOperation data) => data.value;

  /// Decodes a [dynamic value][data] to a BatchOperation.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BatchOperation? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'UPDATE': return BatchOperation.UPDATE;
        case r'UPSERT': return BatchOperation.UPSERT;
        case r'CREATE': return BatchOperation.CREATE;
        case r'DELETE_DISCONTINUED': return BatchOperation.DELETE_DISCONTINUED;
        case r'DELETE': return BatchOperation.DELETE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [BatchOperationTypeTransformer] instance.
  static BatchOperationTypeTransformer? _instance;
}

