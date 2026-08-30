//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The name of field that businesses are sorted by
enum BusinessMemberSortBy {
  FULL_NAME._(r'FULL_NAME'),
  BUSINESS_ROLES._(r'BUSINESS_ROLES'),
  CREATED_TIME._(r'CREATED_TIME'),
  ;

  /// Instantiate a new enum with the provided value.
  const BusinessMemberSortBy._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [BusinessMemberSortBy] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static BusinessMemberSortBy? fromJson(dynamic value) => BusinessMemberSortByTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [BusinessMemberSortBy]
  /// that were successfully decoded from the passed [JSON][json].
  static List<BusinessMemberSortBy> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BusinessMemberSortBy>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BusinessMemberSortBy.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BusinessMemberSortBy] to String,
/// and [decode] dynamic data back to [BusinessMemberSortBy].
class BusinessMemberSortByTypeTransformer {
  factory BusinessMemberSortByTypeTransformer() => _instance ??= const BusinessMemberSortByTypeTransformer._();

  const BusinessMemberSortByTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(BusinessMemberSortBy data) => data._value;

  /// Returns the instance of [BusinessMemberSortBy] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BusinessMemberSortBy? decode(dynamic data, {bool allowNull = true}) {
    if (data is BusinessMemberSortBy) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'FULL_NAME': return BusinessMemberSortBy.FULL_NAME;
        case r'BUSINESS_ROLES': return BusinessMemberSortBy.BUSINESS_ROLES;
        case r'CREATED_TIME': return BusinessMemberSortBy.CREATED_TIME;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static BusinessMemberSortByTypeTransformer? _instance;
}

