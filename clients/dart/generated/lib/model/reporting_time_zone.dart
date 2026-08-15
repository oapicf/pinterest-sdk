//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/) Specify the timezone to be applied for the reporting.
class ReportingTimeZone {
  /// Instantiate a new enum with the provided [value].
  const ReportingTimeZone._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PINTEREST_TIME_ZONE = ReportingTimeZone._(r'PINTEREST_TIME_ZONE');
  static const AD_ACCOUNT_TIME_ZONE = ReportingTimeZone._(r'AD_ACCOUNT_TIME_ZONE');

  /// List of all possible values in this [enum][ReportingTimeZone].
  static const values = <ReportingTimeZone>[
    PINTEREST_TIME_ZONE,
    AD_ACCOUNT_TIME_ZONE,
  ];

  static ReportingTimeZone? fromJson(dynamic value) => ReportingTimeZoneTypeTransformer().decode(value);

  static List<ReportingTimeZone> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ReportingTimeZone>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ReportingTimeZone.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ReportingTimeZone] to String,
/// and [decode] dynamic data back to [ReportingTimeZone].
class ReportingTimeZoneTypeTransformer {
  factory ReportingTimeZoneTypeTransformer() => _instance ??= const ReportingTimeZoneTypeTransformer._();

  const ReportingTimeZoneTypeTransformer._();

  String encode(ReportingTimeZone data) => data.value;

  /// Decodes a [dynamic value][data] to a ReportingTimeZone.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ReportingTimeZone? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'PINTEREST_TIME_ZONE': return ReportingTimeZone.PINTEREST_TIME_ZONE;
        case r'AD_ACCOUNT_TIME_ZONE': return ReportingTimeZone.AD_ACCOUNT_TIME_ZONE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ReportingTimeZoneTypeTransformer] instance.
  static ReportingTimeZoneTypeTransformer? _instance;
}

