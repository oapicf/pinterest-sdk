//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
enum CatalogsStatus {
  ACTIVE._(r'ACTIVE'),
  INACTIVE._(r'INACTIVE'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsStatus._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsStatus] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsStatus? fromJson(dynamic value) => CatalogsStatusTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsStatus]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsStatus] to String,
/// and [decode] dynamic data back to [CatalogsStatus].
class CatalogsStatusTypeTransformer {
  factory CatalogsStatusTypeTransformer() => _instance ??= const CatalogsStatusTypeTransformer._();

  const CatalogsStatusTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(CatalogsStatus data) => data._value;

  /// Returns the instance of [CatalogsStatus] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsStatus) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'ACTIVE': return CatalogsStatus.ACTIVE;
        case r'INACTIVE': return CatalogsStatus.INACTIVE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsStatusTypeTransformer? _instance;
}

