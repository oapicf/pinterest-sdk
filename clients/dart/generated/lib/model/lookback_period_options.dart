//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Days in lookback window in the GET Conversion EQS response.
class LookbackPeriodOptions {
  /// Instantiate a new enum with the provided [value].
  const LookbackPeriodOptions._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const n1d = LookbackPeriodOptions._(r'1d');
  static const n14d = LookbackPeriodOptions._(r'14d');

  /// List of all possible values in this [enum][LookbackPeriodOptions].
  static const values = <LookbackPeriodOptions>[
    n1d,
    n14d,
  ];

  static LookbackPeriodOptions? fromJson(dynamic value) => LookbackPeriodOptionsTypeTransformer().decode(value);

  static List<LookbackPeriodOptions> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LookbackPeriodOptions>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LookbackPeriodOptions.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [LookbackPeriodOptions] to String,
/// and [decode] dynamic data back to [LookbackPeriodOptions].
class LookbackPeriodOptionsTypeTransformer {
  factory LookbackPeriodOptionsTypeTransformer() => _instance ??= const LookbackPeriodOptionsTypeTransformer._();

  const LookbackPeriodOptionsTypeTransformer._();

  String encode(LookbackPeriodOptions data) => data.value;

  /// Decodes a [dynamic value][data] to a LookbackPeriodOptions.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  LookbackPeriodOptions? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'1d': return LookbackPeriodOptions.n1d;
        case r'14d': return LookbackPeriodOptions.n14d;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [LookbackPeriodOptionsTypeTransformer] instance.
  static LookbackPeriodOptionsTypeTransformer? _instance;
}

