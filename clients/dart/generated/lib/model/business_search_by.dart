//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The names of fields that business accounts are searched by
enum BusinessSearchBy {
  FULL_NAME._(r'FULL_NAME'),
  USERNAME._(r'USERNAME'),
  BUSINESS_ID._(r'BUSINESS_ID'),
  EMAIL._(r'EMAIL'),
  ;

  /// Instantiate a new enum with the provided value.
  const BusinessSearchBy._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [BusinessSearchBy] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static BusinessSearchBy? fromJson(dynamic value) => BusinessSearchByTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [BusinessSearchBy]
  /// that were successfully decoded from the passed [JSON][json].
  static List<BusinessSearchBy> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BusinessSearchBy>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BusinessSearchBy.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BusinessSearchBy] to String,
/// and [decode] dynamic data back to [BusinessSearchBy].
class BusinessSearchByTypeTransformer {
  factory BusinessSearchByTypeTransformer() => _instance ??= const BusinessSearchByTypeTransformer._();

  const BusinessSearchByTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(BusinessSearchBy data) => data._value;

  /// Returns the instance of [BusinessSearchBy] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BusinessSearchBy? decode(dynamic data, {bool allowNull = true}) {
    if (data is BusinessSearchBy) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'FULL_NAME': return BusinessSearchBy.FULL_NAME;
        case r'USERNAME': return BusinessSearchBy.USERNAME;
        case r'BUSINESS_ID': return BusinessSearchBy.BUSINESS_ID;
        case r'EMAIL': return BusinessSearchBy.EMAIL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static BusinessSearchByTypeTransformer? _instance;
}

