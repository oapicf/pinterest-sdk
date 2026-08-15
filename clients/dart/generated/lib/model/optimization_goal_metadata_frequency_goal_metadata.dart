//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OptimizationGoalMetadataFrequencyGoalMetadata {
  /// Returns a new [OptimizationGoalMetadataFrequencyGoalMetadata] instance.
  OptimizationGoalMetadataFrequencyGoalMetadata({
    this.frequency,
    this.timerange,
  });

  /// Frequency target can only be between 2 and 20
  ///
  /// Minimum value: 2
  /// Maximum value: 20
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? frequency;

  /// User entity counts time range
  OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum? timerange;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OptimizationGoalMetadataFrequencyGoalMetadata &&
    other.frequency == frequency &&
    other.timerange == timerange;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (frequency == null ? 0 : frequency!.hashCode) +
    (timerange == null ? 0 : timerange!.hashCode);

  @override
  String toString() => 'OptimizationGoalMetadataFrequencyGoalMetadata[frequency=$frequency, timerange=$timerange]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.frequency != null) {
      json[r'frequency'] = this.frequency;
    } else {
      json[r'frequency'] = null;
    }
    if (this.timerange != null) {
      json[r'timerange'] = this.timerange;
    } else {
      json[r'timerange'] = null;
    }
    return json;
  }

  /// Returns a new [OptimizationGoalMetadataFrequencyGoalMetadata] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OptimizationGoalMetadataFrequencyGoalMetadata? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OptimizationGoalMetadataFrequencyGoalMetadata[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OptimizationGoalMetadataFrequencyGoalMetadata[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OptimizationGoalMetadataFrequencyGoalMetadata(
        frequency: mapValueOfType<int>(json, r'frequency'),
        timerange: OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum.fromJson(json[r'timerange']),
      );
    }
    return null;
  }

  static List<OptimizationGoalMetadataFrequencyGoalMetadata> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OptimizationGoalMetadataFrequencyGoalMetadata>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OptimizationGoalMetadataFrequencyGoalMetadata.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OptimizationGoalMetadataFrequencyGoalMetadata> mapFromJson(dynamic json) {
    final map = <String, OptimizationGoalMetadataFrequencyGoalMetadata>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OptimizationGoalMetadataFrequencyGoalMetadata.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OptimizationGoalMetadataFrequencyGoalMetadata-objects as value to a dart map
  static Map<String, List<OptimizationGoalMetadataFrequencyGoalMetadata>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OptimizationGoalMetadataFrequencyGoalMetadata>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OptimizationGoalMetadataFrequencyGoalMetadata.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// User entity counts time range
class OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum {
  /// Instantiate a new enum with the provided [value].
  const OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const THIRTY_DAY = OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum._(r'THIRTY_DAY');
  static const DAY = OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum._(r'DAY');
  static const SEVEN_DAY = OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum._(r'SEVEN_DAY');
  static const TWENTY_MINUTE = OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum._(r'TWENTY_MINUTE');
  static const TEN_MINUTE = OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum._(r'TEN_MINUTE');
  static const TWENTY_FOUR_HOUR = OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum._(r'TWENTY_FOUR_HOUR');

  /// List of all possible values in this [enum][OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum].
  static const values = <OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum>[
    THIRTY_DAY,
    DAY,
    SEVEN_DAY,
    TWENTY_MINUTE,
    TEN_MINUTE,
    TWENTY_FOUR_HOUR,
  ];

  static OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum? fromJson(dynamic value) => OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnumTypeTransformer().decode(value);

  static List<OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum] to String,
/// and [decode] dynamic data back to [OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum].
class OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnumTypeTransformer {
  factory OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnumTypeTransformer() => _instance ??= const OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnumTypeTransformer._();

  const OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnumTypeTransformer._();

  String encode(OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'THIRTY_DAY': return OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum.THIRTY_DAY;
        case r'DAY': return OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum.DAY;
        case r'SEVEN_DAY': return OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum.SEVEN_DAY;
        case r'TWENTY_MINUTE': return OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum.TWENTY_MINUTE;
        case r'TEN_MINUTE': return OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum.TEN_MINUTE;
        case r'TWENTY_FOUR_HOUR': return OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum.TWENTY_FOUR_HOUR;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnumTypeTransformer] instance.
  static OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnumTypeTransformer? _instance;
}


