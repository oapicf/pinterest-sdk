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
class MMMReportingTargetingType {
  /// Instantiate a new enum with the provided [value].
  const MMMReportingTargetingType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const APPTYPE = MMMReportingTargetingType._(r'APPTYPE');
  static const COUNTRY = MMMReportingTargetingType._(r'COUNTRY');
  static const CREATIVE_TYPE = MMMReportingTargetingType._(r'CREATIVE_TYPE');
  static const GENDER = MMMReportingTargetingType._(r'GENDER');
  static const LOCATION = MMMReportingTargetingType._(r'LOCATION');

  /// List of all possible values in this [enum][MMMReportingTargetingType].
  static const values = <MMMReportingTargetingType>[
    APPTYPE,
    COUNTRY,
    CREATIVE_TYPE,
    GENDER,
    LOCATION,
  ];

  static MMMReportingTargetingType? fromJson(dynamic value) => MMMReportingTargetingTypeTypeTransformer().decode(value);

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

  String encode(MMMReportingTargetingType data) => data.value;

  /// Decodes a [dynamic value][data] to a MMMReportingTargetingType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MMMReportingTargetingType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'APPTYPE': return MMMReportingTargetingType.APPTYPE;
        case r'COUNTRY': return MMMReportingTargetingType.COUNTRY;
        case r'CREATIVE_TYPE': return MMMReportingTargetingType.CREATIVE_TYPE;
        case r'GENDER': return MMMReportingTargetingType.GENDER;
        case r'LOCATION': return MMMReportingTargetingType.LOCATION;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MMMReportingTargetingTypeTypeTransformer] instance.
  static MMMReportingTargetingTypeTypeTransformer? _instance;
}

