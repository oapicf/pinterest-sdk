//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ScheduleAgeBucketMultipliers {
  /// Returns a new [ScheduleAgeBucketMultipliers] instance.
  ScheduleAgeBucketMultipliers({
    this.AGE_BUCKET,
  });

  ScheduleAgeBucketMultipliersAGE_BUCKETEnum? AGE_BUCKET;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ScheduleAgeBucketMultipliers &&
    other.AGE_BUCKET == AGE_BUCKET;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (AGE_BUCKET == null ? 0 : AGE_BUCKET!.hashCode);

  @override
  String toString() => 'ScheduleAgeBucketMultipliers[AGE_BUCKET=$AGE_BUCKET]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.AGE_BUCKET != null) {
      json[r'AGE_BUCKET'] = this.AGE_BUCKET;
    } else {
      json[r'AGE_BUCKET'] = null;
    }
    return json;
  }

  /// Returns a new [ScheduleAgeBucketMultipliers] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ScheduleAgeBucketMultipliers? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ScheduleAgeBucketMultipliers(
        AGE_BUCKET: ScheduleAgeBucketMultipliersAGE_BUCKETEnum.fromJson(json[r'AGE_BUCKET']),
      );
    }
    return null;
  }

  static List<ScheduleAgeBucketMultipliers> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ScheduleAgeBucketMultipliers>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ScheduleAgeBucketMultipliers.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ScheduleAgeBucketMultipliers> mapFromJson(dynamic json) {
    final map = <String, ScheduleAgeBucketMultipliers>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ScheduleAgeBucketMultipliers.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ScheduleAgeBucketMultipliers-objects as value to a dart map
  static Map<String, List<ScheduleAgeBucketMultipliers>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ScheduleAgeBucketMultipliers>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ScheduleAgeBucketMultipliers.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


enum ScheduleAgeBucketMultipliersAGE_BUCKETEnum {
  n1824._(r'18-24'),
  n2534._(r'25-34'),
  n3544._(r'35-44'),
  n4549._(r'45-49'),
  n5054._(r'50-54'),
  n5564._(r'55-64'),
  n65plus._(r'65+'),
  ;

  /// Instantiate a new enum with the provided value.
  const ScheduleAgeBucketMultipliersAGE_BUCKETEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ScheduleAgeBucketMultipliersAGE_BUCKETEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ScheduleAgeBucketMultipliersAGE_BUCKETEnum? fromJson(dynamic value) => ScheduleAgeBucketMultipliersAGE_BUCKETEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ScheduleAgeBucketMultipliersAGE_BUCKETEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ScheduleAgeBucketMultipliersAGE_BUCKETEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ScheduleAgeBucketMultipliersAGE_BUCKETEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ScheduleAgeBucketMultipliersAGE_BUCKETEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ScheduleAgeBucketMultipliersAGE_BUCKETEnum] to String,
/// and [decode] dynamic data back to [ScheduleAgeBucketMultipliersAGE_BUCKETEnum].
class ScheduleAgeBucketMultipliersAGE_BUCKETEnumTypeTransformer {
  factory ScheduleAgeBucketMultipliersAGE_BUCKETEnumTypeTransformer() => _instance ??= const ScheduleAgeBucketMultipliersAGE_BUCKETEnumTypeTransformer._();

  const ScheduleAgeBucketMultipliersAGE_BUCKETEnumTypeTransformer._();

  String encode(ScheduleAgeBucketMultipliersAGE_BUCKETEnum data) => data._value;

  /// Returns the instance of [ScheduleAgeBucketMultipliersAGE_BUCKETEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ScheduleAgeBucketMultipliersAGE_BUCKETEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is ScheduleAgeBucketMultipliersAGE_BUCKETEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'18-24': return ScheduleAgeBucketMultipliersAGE_BUCKETEnum.n1824;
        case r'25-34': return ScheduleAgeBucketMultipliersAGE_BUCKETEnum.n2534;
        case r'35-44': return ScheduleAgeBucketMultipliersAGE_BUCKETEnum.n3544;
        case r'45-49': return ScheduleAgeBucketMultipliersAGE_BUCKETEnum.n4549;
        case r'50-54': return ScheduleAgeBucketMultipliersAGE_BUCKETEnum.n5054;
        case r'55-64': return ScheduleAgeBucketMultipliersAGE_BUCKETEnum.n5564;
        case r'65+': return ScheduleAgeBucketMultipliersAGE_BUCKETEnum.n65plus;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ScheduleAgeBucketMultipliersAGE_BUCKETEnumTypeTransformer? _instance;
}


