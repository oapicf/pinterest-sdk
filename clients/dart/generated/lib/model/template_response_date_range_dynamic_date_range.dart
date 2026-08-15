//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TemplateResponseDateRangeDynamicDateRange {
  /// Returns a new [TemplateResponseDateRangeDynamicDateRange] instance.
  TemplateResponseDateRangeDynamicDateRange({
    this.range,
    this.type,
  });

  /// The dynamic range type
  TemplateResponseDateRangeDynamicDateRangeRangeEnum? range;

  /// The date range type
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? type;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TemplateResponseDateRangeDynamicDateRange &&
    other.range == range &&
    other.type == type;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (range == null ? 0 : range!.hashCode) +
    (type == null ? 0 : type!.hashCode);

  @override
  String toString() => 'TemplateResponseDateRangeDynamicDateRange[range=$range, type=$type]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.range != null) {
      json[r'range'] = this.range;
    } else {
      json[r'range'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    return json;
  }

  /// Returns a new [TemplateResponseDateRangeDynamicDateRange] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TemplateResponseDateRangeDynamicDateRange? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TemplateResponseDateRangeDynamicDateRange[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TemplateResponseDateRangeDynamicDateRange[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TemplateResponseDateRangeDynamicDateRange(
        range: TemplateResponseDateRangeDynamicDateRangeRangeEnum.fromJson(json[r'range']),
        type: mapValueOfType<String>(json, r'type'),
      );
    }
    return null;
  }

  static List<TemplateResponseDateRangeDynamicDateRange> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TemplateResponseDateRangeDynamicDateRange>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TemplateResponseDateRangeDynamicDateRange.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TemplateResponseDateRangeDynamicDateRange> mapFromJson(dynamic json) {
    final map = <String, TemplateResponseDateRangeDynamicDateRange>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TemplateResponseDateRangeDynamicDateRange.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TemplateResponseDateRangeDynamicDateRange-objects as value to a dart map
  static Map<String, List<TemplateResponseDateRangeDynamicDateRange>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TemplateResponseDateRangeDynamicDateRange>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TemplateResponseDateRangeDynamicDateRange.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// The dynamic range type
class TemplateResponseDateRangeDynamicDateRangeRangeEnum {
  /// Instantiate a new enum with the provided [value].
  const TemplateResponseDateRangeDynamicDateRangeRangeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const YEAR_TO_DATE = TemplateResponseDateRangeDynamicDateRangeRangeEnum._(r'YEAR_TO_DATE');
  static const QUARTER_TO_DATE = TemplateResponseDateRangeDynamicDateRangeRangeEnum._(r'QUARTER_TO_DATE');
  static const MONTH_TO_DATE = TemplateResponseDateRangeDynamicDateRangeRangeEnum._(r'MONTH_TO_DATE');
  static const LAST_MONTH = TemplateResponseDateRangeDynamicDateRangeRangeEnum._(r'LAST_MONTH');
  static const LAST_QUARTER = TemplateResponseDateRangeDynamicDateRangeRangeEnum._(r'LAST_QUARTER');

  /// List of all possible values in this [enum][TemplateResponseDateRangeDynamicDateRangeRangeEnum].
  static const values = <TemplateResponseDateRangeDynamicDateRangeRangeEnum>[
    YEAR_TO_DATE,
    QUARTER_TO_DATE,
    MONTH_TO_DATE,
    LAST_MONTH,
    LAST_QUARTER,
  ];

  static TemplateResponseDateRangeDynamicDateRangeRangeEnum? fromJson(dynamic value) => TemplateResponseDateRangeDynamicDateRangeRangeEnumTypeTransformer().decode(value);

  static List<TemplateResponseDateRangeDynamicDateRangeRangeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TemplateResponseDateRangeDynamicDateRangeRangeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TemplateResponseDateRangeDynamicDateRangeRangeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TemplateResponseDateRangeDynamicDateRangeRangeEnum] to String,
/// and [decode] dynamic data back to [TemplateResponseDateRangeDynamicDateRangeRangeEnum].
class TemplateResponseDateRangeDynamicDateRangeRangeEnumTypeTransformer {
  factory TemplateResponseDateRangeDynamicDateRangeRangeEnumTypeTransformer() => _instance ??= const TemplateResponseDateRangeDynamicDateRangeRangeEnumTypeTransformer._();

  const TemplateResponseDateRangeDynamicDateRangeRangeEnumTypeTransformer._();

  String encode(TemplateResponseDateRangeDynamicDateRangeRangeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TemplateResponseDateRangeDynamicDateRangeRangeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TemplateResponseDateRangeDynamicDateRangeRangeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'YEAR_TO_DATE': return TemplateResponseDateRangeDynamicDateRangeRangeEnum.YEAR_TO_DATE;
        case r'QUARTER_TO_DATE': return TemplateResponseDateRangeDynamicDateRangeRangeEnum.QUARTER_TO_DATE;
        case r'MONTH_TO_DATE': return TemplateResponseDateRangeDynamicDateRangeRangeEnum.MONTH_TO_DATE;
        case r'LAST_MONTH': return TemplateResponseDateRangeDynamicDateRangeRangeEnum.LAST_MONTH;
        case r'LAST_QUARTER': return TemplateResponseDateRangeDynamicDateRangeRangeEnum.LAST_QUARTER;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TemplateResponseDateRangeDynamicDateRangeRangeEnumTypeTransformer] instance.
  static TemplateResponseDateRangeDynamicDateRangeRangeEnumTypeTransformer? _instance;
}


