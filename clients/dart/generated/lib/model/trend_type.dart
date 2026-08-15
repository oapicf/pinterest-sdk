//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class TrendType {
  /// Instantiate a new enum with the provided [value].
  const TrendType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const growing = TrendType._(r'growing');
  static const monthly = TrendType._(r'monthly');
  static const yearly = TrendType._(r'yearly');
  static const seasonal = TrendType._(r'seasonal');

  /// List of all possible values in this [enum][TrendType].
  static const values = <TrendType>[
    growing,
    monthly,
    yearly,
    seasonal,
  ];

  static TrendType? fromJson(dynamic value) => TrendTypeTypeTransformer().decode(value);

  static List<TrendType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TrendType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TrendType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TrendType] to String,
/// and [decode] dynamic data back to [TrendType].
class TrendTypeTypeTransformer {
  factory TrendTypeTypeTransformer() => _instance ??= const TrendTypeTypeTransformer._();

  const TrendTypeTypeTransformer._();

  String encode(TrendType data) => data.value;

  /// Decodes a [dynamic value][data] to a TrendType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TrendType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'growing': return TrendType.growing;
        case r'monthly': return TrendType.monthly;
        case r'yearly': return TrendType.yearly;
        case r'seasonal': return TrendType.seasonal;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TrendTypeTypeTransformer] instance.
  static TrendTypeTypeTransformer? _instance;
}

