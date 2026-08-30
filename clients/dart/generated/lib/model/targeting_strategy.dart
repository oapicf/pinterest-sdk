//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum TargetingStrategy {
  CHOOSE_YOUR_OWN._(r'CHOOSE_YOUR_OWN'),
  FIND_NEW_CUSTOMERS._(r'FIND_NEW_CUSTOMERS'),
  RECONNECT_WITH_USERS._(r'RECONNECT_WITH_USERS'),
  ;

  /// Instantiate a new enum with the provided value.
  const TargetingStrategy._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [TargetingStrategy] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static TargetingStrategy? fromJson(dynamic value) => TargetingStrategyTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [TargetingStrategy]
  /// that were successfully decoded from the passed [JSON][json].
  static List<TargetingStrategy> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingStrategy>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingStrategy.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingStrategy] to String,
/// and [decode] dynamic data back to [TargetingStrategy].
class TargetingStrategyTypeTransformer {
  factory TargetingStrategyTypeTransformer() => _instance ??= const TargetingStrategyTypeTransformer._();

  const TargetingStrategyTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(TargetingStrategy data) => data._value;

  /// Returns the instance of [TargetingStrategy] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingStrategy? decode(dynamic data, {bool allowNull = true}) {
    if (data is TargetingStrategy) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CHOOSE_YOUR_OWN': return TargetingStrategy.CHOOSE_YOUR_OWN;
        case r'FIND_NEW_CUSTOMERS': return TargetingStrategy.FIND_NEW_CUSTOMERS;
        case r'RECONNECT_WITH_USERS': return TargetingStrategy.RECONNECT_WITH_USERS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static TargetingStrategyTypeTransformer? _instance;
}

