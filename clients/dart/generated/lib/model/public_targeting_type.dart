//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Public ad targeting type with external names
enum PublicTargetingType {
  APPTYPE._(r'APPTYPE'),
  GENDER._(r'GENDER'),
  LOCALE._(r'LOCALE'),
  AGE_BUCKET._(r'AGE_BUCKET'),
  LOCATION._(r'LOCATION'),
  GEO._(r'GEO'),
  INTEREST._(r'INTEREST'),
  KEYWORD._(r'KEYWORD'),
  AUDIENCE_INCLUDE._(r'AUDIENCE_INCLUDE'),
  AUDIENCE_EXCLUDE._(r'AUDIENCE_EXCLUDE'),
  ;

  /// Instantiate a new enum with the provided value.
  const PublicTargetingType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [PublicTargetingType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static PublicTargetingType? fromJson(dynamic value) => PublicTargetingTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [PublicTargetingType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<PublicTargetingType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PublicTargetingType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PublicTargetingType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PublicTargetingType] to String,
/// and [decode] dynamic data back to [PublicTargetingType].
class PublicTargetingTypeTypeTransformer {
  factory PublicTargetingTypeTypeTransformer() => _instance ??= const PublicTargetingTypeTypeTransformer._();

  const PublicTargetingTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(PublicTargetingType data) => data._value;

  /// Returns the instance of [PublicTargetingType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PublicTargetingType? decode(dynamic data, {bool allowNull = true}) {
    if (data is PublicTargetingType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'APPTYPE': return PublicTargetingType.APPTYPE;
        case r'GENDER': return PublicTargetingType.GENDER;
        case r'LOCALE': return PublicTargetingType.LOCALE;
        case r'AGE_BUCKET': return PublicTargetingType.AGE_BUCKET;
        case r'LOCATION': return PublicTargetingType.LOCATION;
        case r'GEO': return PublicTargetingType.GEO;
        case r'INTEREST': return PublicTargetingType.INTEREST;
        case r'KEYWORD': return PublicTargetingType.KEYWORD;
        case r'AUDIENCE_INCLUDE': return PublicTargetingType.AUDIENCE_INCLUDE;
        case r'AUDIENCE_EXCLUDE': return PublicTargetingType.AUDIENCE_EXCLUDE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static PublicTargetingTypeTypeTransformer? _instance;
}

