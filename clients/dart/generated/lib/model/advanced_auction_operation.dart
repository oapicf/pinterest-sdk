//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class AdvancedAuctionOperation {
  /// Instantiate a new enum with the provided [value].
  const AdvancedAuctionOperation._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const UPSERT = AdvancedAuctionOperation._(r'UPSERT');
  static const DELETE = AdvancedAuctionOperation._(r'DELETE');

  /// List of all possible values in this [enum][AdvancedAuctionOperation].
  static const values = <AdvancedAuctionOperation>[
    UPSERT,
    DELETE,
  ];

  static AdvancedAuctionOperation? fromJson(dynamic value) => AdvancedAuctionOperationTypeTransformer().decode(value);

  static List<AdvancedAuctionOperation> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdvancedAuctionOperation>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdvancedAuctionOperation.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdvancedAuctionOperation] to String,
/// and [decode] dynamic data back to [AdvancedAuctionOperation].
class AdvancedAuctionOperationTypeTransformer {
  factory AdvancedAuctionOperationTypeTransformer() => _instance ??= const AdvancedAuctionOperationTypeTransformer._();

  const AdvancedAuctionOperationTypeTransformer._();

  String encode(AdvancedAuctionOperation data) => data.value;

  /// Decodes a [dynamic value][data] to a AdvancedAuctionOperation.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdvancedAuctionOperation? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'UPSERT': return AdvancedAuctionOperation.UPSERT;
        case r'DELETE': return AdvancedAuctionOperation.DELETE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AdvancedAuctionOperationTypeTransformer] instance.
  static AdvancedAuctionOperationTypeTransformer? _instance;
}

