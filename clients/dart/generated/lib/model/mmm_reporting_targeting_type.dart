//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Ad targeting types for MMM report
enum MMMReportingTargetingType {
  APPTYPE._(r'APPTYPE'),
  COUNTRY._(r'COUNTRY'),
  CREATIVE_TYPE._(r'CREATIVE_TYPE'),
  GENDER._(r'GENDER'),
  LOCATION._(r'LOCATION'),
  PLACEMENT._(r'PLACEMENT'),
  AUDIENCE_INCLUDE._(r'AUDIENCE_INCLUDE'),
  ;

  /// Instantiate a new enum with the provided value.
  const MMMReportingTargetingType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [MMMReportingTargetingType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static MMMReportingTargetingType? fromJson(dynamic value) => MMMReportingTargetingTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [MMMReportingTargetingType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<MMMReportingTargetingType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MMMReportingTargetingType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MMMReportingTargetingType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MMMReportingTargetingType] to String,
/// and [decode] dynamic data back to [MMMReportingTargetingType].
class MMMReportingTargetingTypeTypeTransformer {
  factory MMMReportingTargetingTypeTypeTransformer() => _instance ??= const MMMReportingTargetingTypeTypeTransformer._();

  const MMMReportingTargetingTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(MMMReportingTargetingType data) => data._value;

  /// Returns the instance of [MMMReportingTargetingType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MMMReportingTargetingType? decode(dynamic data, {bool allowNull = true}) {
    if (data is MMMReportingTargetingType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'APPTYPE': return MMMReportingTargetingType.APPTYPE;
        case r'COUNTRY': return MMMReportingTargetingType.COUNTRY;
        case r'CREATIVE_TYPE': return MMMReportingTargetingType.CREATIVE_TYPE;
        case r'GENDER': return MMMReportingTargetingType.GENDER;
        case r'LOCATION': return MMMReportingTargetingType.LOCATION;
        case r'PLACEMENT': return MMMReportingTargetingType.PLACEMENT;
        case r'AUDIENCE_INCLUDE': return MMMReportingTargetingType.AUDIENCE_INCLUDE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static MMMReportingTargetingTypeTypeTransformer? _instance;
}

