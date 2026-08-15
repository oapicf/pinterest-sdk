//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class CatalogsFeedProcessingStatus {
  /// Instantiate a new enum with the provided [value].
  const CatalogsFeedProcessingStatus._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const COMPLETED = CatalogsFeedProcessingStatus._(r'COMPLETED');
  static const FAILED = CatalogsFeedProcessingStatus._(r'FAILED');
  static const PROCESSING = CatalogsFeedProcessingStatus._(r'PROCESSING');

  /// List of all possible values in this [enum][CatalogsFeedProcessingStatus].
  static const values = <CatalogsFeedProcessingStatus>[
    COMPLETED,
    FAILED,
    PROCESSING,
  ];

  static CatalogsFeedProcessingStatus? fromJson(dynamic value) => CatalogsFeedProcessingStatusTypeTransformer().decode(value);

  static List<CatalogsFeedProcessingStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsFeedProcessingStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsFeedProcessingStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsFeedProcessingStatus] to String,
/// and [decode] dynamic data back to [CatalogsFeedProcessingStatus].
class CatalogsFeedProcessingStatusTypeTransformer {
  factory CatalogsFeedProcessingStatusTypeTransformer() => _instance ??= const CatalogsFeedProcessingStatusTypeTransformer._();

  const CatalogsFeedProcessingStatusTypeTransformer._();

  String encode(CatalogsFeedProcessingStatus data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsFeedProcessingStatus.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsFeedProcessingStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'COMPLETED': return CatalogsFeedProcessingStatus.COMPLETED;
        case r'FAILED': return CatalogsFeedProcessingStatus.FAILED;
        case r'PROCESSING': return CatalogsFeedProcessingStatus.PROCESSING;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsFeedProcessingStatusTypeTransformer] instance.
  static CatalogsFeedProcessingStatusTypeTransformer? _instance;
}

