//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Budget duration type for delivery estimates.
enum BudgetDurationType {
  FIXED_DAILY._(r'FIXED_DAILY'),
  FLEXIBLE_DAILY._(r'FLEXIBLE_DAILY'),
  LIFETIME._(r'LIFETIME'),
  ;

  /// Instantiate a new enum with the provided value.
  const BudgetDurationType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [BudgetDurationType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static BudgetDurationType? fromJson(dynamic value) => BudgetDurationTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [BudgetDurationType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<BudgetDurationType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BudgetDurationType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BudgetDurationType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BudgetDurationType] to String,
/// and [decode] dynamic data back to [BudgetDurationType].
class BudgetDurationTypeTypeTransformer {
  factory BudgetDurationTypeTypeTransformer() => _instance ??= const BudgetDurationTypeTypeTransformer._();

  const BudgetDurationTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(BudgetDurationType data) => data._value;

  /// Returns the instance of [BudgetDurationType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BudgetDurationType? decode(dynamic data, {bool allowNull = true}) {
    if (data is BudgetDurationType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'FIXED_DAILY': return BudgetDurationType.FIXED_DAILY;
        case r'FLEXIBLE_DAILY': return BudgetDurationType.FLEXIBLE_DAILY;
        case r'LIFETIME': return BudgetDurationType.LIFETIME;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static BudgetDurationTypeTypeTransformer? _instance;
}

