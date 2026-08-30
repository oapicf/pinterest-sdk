//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Whether to first sort the report by date or by ID
enum PrimarySort {
  BY_ID._(r'BY_ID'),
  BY_DATE._(r'BY_DATE'),
  ;

  /// Instantiate a new enum with the provided value.
  const PrimarySort._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [PrimarySort] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static PrimarySort? fromJson(dynamic value) => PrimarySortTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [PrimarySort]
  /// that were successfully decoded from the passed [JSON][json].
  static List<PrimarySort> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PrimarySort>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PrimarySort.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PrimarySort] to String,
/// and [decode] dynamic data back to [PrimarySort].
class PrimarySortTypeTransformer {
  factory PrimarySortTypeTransformer() => _instance ??= const PrimarySortTypeTransformer._();

  const PrimarySortTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(PrimarySort data) => data._value;

  /// Returns the instance of [PrimarySort] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PrimarySort? decode(dynamic data, {bool allowNull = true}) {
    if (data is PrimarySort) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'BY_ID': return PrimarySort.BY_ID;
        case r'BY_DATE': return PrimarySort.BY_DATE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static PrimarySortTypeTransformer? _instance;
}

