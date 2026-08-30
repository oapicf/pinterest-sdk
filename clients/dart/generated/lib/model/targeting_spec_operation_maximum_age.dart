//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TargetingSpecOperationMaximumAge {
  /// Returns a new [TargetingSpecOperationMaximumAge] instance.
  TargetingSpecOperationMaximumAge({
    required this.field,
    required this.operation,
    required this.value,
  });

  TargetingSpecOperationMaximumAgeFieldEnum field;

  TargetingSpecOperationMaximumAgeOperationEnum operation;

  String? value;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TargetingSpecOperationMaximumAge &&
    other.field == field &&
    other.operation == operation &&
    other.value == value;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (field.hashCode) +
    (operation.hashCode) +
    (value == null ? 0 : value!.hashCode);

  @override
  String toString() => 'TargetingSpecOperationMaximumAge[field=$field, operation=$operation, value=$value]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'field'] = this.field;
      json[r'operation'] = this.operation;
    if (this.value != null) {
      json[r'value'] = this.value;
    } else {
      json[r'value'] = null;
    }
    return json;
  }

  /// Returns a new [TargetingSpecOperationMaximumAge] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TargetingSpecOperationMaximumAge? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'field'), 'Required key "TargetingSpecOperationMaximumAge[field]" is missing from JSON.');
        assert(json[r'field'] != null, 'Required key "TargetingSpecOperationMaximumAge[field]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "TargetingSpecOperationMaximumAge[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "TargetingSpecOperationMaximumAge[operation]" has a null value in JSON.');
        assert(json.containsKey(r'value'), 'Required key "TargetingSpecOperationMaximumAge[value]" is missing from JSON.');
        return true;
      }());

      return TargetingSpecOperationMaximumAge(
        field: TargetingSpecOperationMaximumAgeFieldEnum.fromJson(json[r'field'])!,
        operation: TargetingSpecOperationMaximumAgeOperationEnum.fromJson(json[r'operation'])!,
        value: mapValueOfType<String>(json, r'value'),
      );
    }
    return null;
  }

  static List<TargetingSpecOperationMaximumAge> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationMaximumAge>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationMaximumAge.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TargetingSpecOperationMaximumAge> mapFromJson(dynamic json) {
    final map = <String, TargetingSpecOperationMaximumAge>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TargetingSpecOperationMaximumAge.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TargetingSpecOperationMaximumAge-objects as value to a dart map
  static Map<String, List<TargetingSpecOperationMaximumAge>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TargetingSpecOperationMaximumAge>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TargetingSpecOperationMaximumAge.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'field',
    'operation',
    'value',
  };
}


enum TargetingSpecOperationMaximumAgeFieldEnum {
  MAXIMUM_AGE._(r'MAXIMUM_AGE'),
  ;

  /// Instantiate a new enum with the provided value.
  const TargetingSpecOperationMaximumAgeFieldEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [TargetingSpecOperationMaximumAgeFieldEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static TargetingSpecOperationMaximumAgeFieldEnum? fromJson(dynamic value) => TargetingSpecOperationMaximumAgeFieldEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [TargetingSpecOperationMaximumAgeFieldEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<TargetingSpecOperationMaximumAgeFieldEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationMaximumAgeFieldEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationMaximumAgeFieldEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecOperationMaximumAgeFieldEnum] to String,
/// and [decode] dynamic data back to [TargetingSpecOperationMaximumAgeFieldEnum].
class TargetingSpecOperationMaximumAgeFieldEnumTypeTransformer {
  factory TargetingSpecOperationMaximumAgeFieldEnumTypeTransformer() => _instance ??= const TargetingSpecOperationMaximumAgeFieldEnumTypeTransformer._();

  const TargetingSpecOperationMaximumAgeFieldEnumTypeTransformer._();

  String encode(TargetingSpecOperationMaximumAgeFieldEnum data) => data._value;

  /// Returns the instance of [TargetingSpecOperationMaximumAgeFieldEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecOperationMaximumAgeFieldEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is TargetingSpecOperationMaximumAgeFieldEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'MAXIMUM_AGE': return TargetingSpecOperationMaximumAgeFieldEnum.MAXIMUM_AGE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static TargetingSpecOperationMaximumAgeFieldEnumTypeTransformer? _instance;
}



enum TargetingSpecOperationMaximumAgeOperationEnum {
  SET._(r'SET'),
  ;

  /// Instantiate a new enum with the provided value.
  const TargetingSpecOperationMaximumAgeOperationEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [TargetingSpecOperationMaximumAgeOperationEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static TargetingSpecOperationMaximumAgeOperationEnum? fromJson(dynamic value) => TargetingSpecOperationMaximumAgeOperationEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [TargetingSpecOperationMaximumAgeOperationEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<TargetingSpecOperationMaximumAgeOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationMaximumAgeOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationMaximumAgeOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecOperationMaximumAgeOperationEnum] to String,
/// and [decode] dynamic data back to [TargetingSpecOperationMaximumAgeOperationEnum].
class TargetingSpecOperationMaximumAgeOperationEnumTypeTransformer {
  factory TargetingSpecOperationMaximumAgeOperationEnumTypeTransformer() => _instance ??= const TargetingSpecOperationMaximumAgeOperationEnumTypeTransformer._();

  const TargetingSpecOperationMaximumAgeOperationEnumTypeTransformer._();

  String encode(TargetingSpecOperationMaximumAgeOperationEnum data) => data._value;

  /// Returns the instance of [TargetingSpecOperationMaximumAgeOperationEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecOperationMaximumAgeOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is TargetingSpecOperationMaximumAgeOperationEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'SET': return TargetingSpecOperationMaximumAgeOperationEnum.SET;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static TargetingSpecOperationMaximumAgeOperationEnumTypeTransformer? _instance;
}


