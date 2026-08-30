//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The source of conversion events ingestion
enum CreationSource {
  ADS_API._(r'ADS_API'),
  ADS_MANAGER_REPORTING_PAGE._(r'ADS_MANAGER_REPORTING_PAGE'),
  ADS_MANAGER_REPORT_BUILDER._(r'ADS_MANAGER_REPORT_BUILDER'),
  ;

  /// Instantiate a new enum with the provided value.
  const CreationSource._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CreationSource] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CreationSource? fromJson(dynamic value) => CreationSourceTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CreationSource]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CreationSource> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreationSource>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreationSource.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreationSource] to String,
/// and [decode] dynamic data back to [CreationSource].
class CreationSourceTypeTransformer {
  factory CreationSourceTypeTransformer() => _instance ??= const CreationSourceTypeTransformer._();

  const CreationSourceTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(CreationSource data) => data._value;

  /// Returns the instance of [CreationSource] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreationSource? decode(dynamic data, {bool allowNull = true}) {
    if (data is CreationSource) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'ADS_API': return CreationSource.ADS_API;
        case r'ADS_MANAGER_REPORTING_PAGE': return CreationSource.ADS_MANAGER_REPORTING_PAGE;
        case r'ADS_MANAGER_REPORT_BUILDER': return CreationSource.ADS_MANAGER_REPORT_BUILDER;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CreationSourceTypeTransformer? _instance;
}

