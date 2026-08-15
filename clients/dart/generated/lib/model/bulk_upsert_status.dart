//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class BulkUpsertStatus {
  /// Instantiate a new enum with the provided [value].
  const BulkUpsertStatus._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const RUNNING = BulkUpsertStatus._(r'RUNNING');
  static const SUCCEEDED = BulkUpsertStatus._(r'SUCCEEDED');
  static const FAILED = BulkUpsertStatus._(r'FAILED');

  /// List of all possible values in this [enum][BulkUpsertStatus].
  static const values = <BulkUpsertStatus>[
    RUNNING,
    SUCCEEDED,
    FAILED,
  ];

  static BulkUpsertStatus? fromJson(dynamic value) => BulkUpsertStatusTypeTransformer().decode(value);

  static List<BulkUpsertStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BulkUpsertStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BulkUpsertStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BulkUpsertStatus] to String,
/// and [decode] dynamic data back to [BulkUpsertStatus].
class BulkUpsertStatusTypeTransformer {
  factory BulkUpsertStatusTypeTransformer() => _instance ??= const BulkUpsertStatusTypeTransformer._();

  const BulkUpsertStatusTypeTransformer._();

  String encode(BulkUpsertStatus data) => data.value;

  /// Decodes a [dynamic value][data] to a BulkUpsertStatus.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BulkUpsertStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'RUNNING': return BulkUpsertStatus.RUNNING;
        case r'SUCCEEDED': return BulkUpsertStatus.SUCCEEDED;
        case r'FAILED': return BulkUpsertStatus.FAILED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [BulkUpsertStatusTypeTransformer] instance.
  static BulkUpsertStatusTypeTransformer? _instance;
}

