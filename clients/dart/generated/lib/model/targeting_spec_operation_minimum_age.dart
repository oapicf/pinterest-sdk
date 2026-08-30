//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TargetingSpecOperationMinimumAge {
  /// Returns a new [TargetingSpecOperationMinimumAge] instance.
  TargetingSpecOperationMinimumAge({
    required this.field,
    required this.operation,
    required this.value,
  });

  TargetingSpecOperationMinimumAgeFieldEnum field;

  TargetingSpecOperationMinimumAgeOperationEnum operation;

  String? value;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TargetingSpecOperationMinimumAge &&
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
  String toString() => 'TargetingSpecOperationMinimumAge[field=$field, operation=$operation, value=$value]';

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

  /// Returns a new [TargetingSpecOperationMinimumAge] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TargetingSpecOperationMinimumAge? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'field'), 'Required key "TargetingSpecOperationMinimumAge[field]" is missing from JSON.');
        assert(json[r'field'] != null, 'Required key "TargetingSpecOperationMinimumAge[field]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "TargetingSpecOperationMinimumAge[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "TargetingSpecOperationMinimumAge[operation]" has a null value in JSON.');
        assert(json.containsKey(r'value'), 'Required key "TargetingSpecOperationMinimumAge[value]" is missing from JSON.');
        return true;
      }());

      return TargetingSpecOperationMinimumAge(
        field: TargetingSpecOperationMinimumAgeFieldEnum.fromJson(json[r'field'])!,
        operation: TargetingSpecOperationMinimumAgeOperationEnum.fromJson(json[r'operation'])!,
        value: mapValueOfType<String>(json, r'value'),
      );
    }
    return null;
  }

  static List<TargetingSpecOperationMinimumAge> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationMinimumAge>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationMinimumAge.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TargetingSpecOperationMinimumAge> mapFromJson(dynamic json) {
    final map = <String, TargetingSpecOperationMinimumAge>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TargetingSpecOperationMinimumAge.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TargetingSpecOperationMinimumAge-objects as value to a dart map
  static Map<String, List<TargetingSpecOperationMinimumAge>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TargetingSpecOperationMinimumAge>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TargetingSpecOperationMinimumAge.listFromJson(entry.value, growable: growable,);
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


enum TargetingSpecOperationMinimumAgeFieldEnum {
  MINIMUM_AGE._(r'MINIMUM_AGE'),
  ;

  /// Instantiate a new enum with the provided value.
  const TargetingSpecOperationMinimumAgeFieldEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [TargetingSpecOperationMinimumAgeFieldEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static TargetingSpecOperationMinimumAgeFieldEnum? fromJson(dynamic value) => TargetingSpecOperationMinimumAgeFieldEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [TargetingSpecOperationMinimumAgeFieldEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<TargetingSpecOperationMinimumAgeFieldEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationMinimumAgeFieldEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationMinimumAgeFieldEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecOperationMinimumAgeFieldEnum] to String,
/// and [decode] dynamic data back to [TargetingSpecOperationMinimumAgeFieldEnum].
class TargetingSpecOperationMinimumAgeFieldEnumTypeTransformer {
  factory TargetingSpecOperationMinimumAgeFieldEnumTypeTransformer() => _instance ??= const TargetingSpecOperationMinimumAgeFieldEnumTypeTransformer._();

  const TargetingSpecOperationMinimumAgeFieldEnumTypeTransformer._();

  String encode(TargetingSpecOperationMinimumAgeFieldEnum data) => data._value;

  /// Returns the instance of [TargetingSpecOperationMinimumAgeFieldEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecOperationMinimumAgeFieldEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is TargetingSpecOperationMinimumAgeFieldEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'MINIMUM_AGE': return TargetingSpecOperationMinimumAgeFieldEnum.MINIMUM_AGE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static TargetingSpecOperationMinimumAgeFieldEnumTypeTransformer? _instance;
}



enum TargetingSpecOperationMinimumAgeOperationEnum {
  SET._(r'SET'),
  ;

  /// Instantiate a new enum with the provided value.
  const TargetingSpecOperationMinimumAgeOperationEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [TargetingSpecOperationMinimumAgeOperationEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static TargetingSpecOperationMinimumAgeOperationEnum? fromJson(dynamic value) => TargetingSpecOperationMinimumAgeOperationEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [TargetingSpecOperationMinimumAgeOperationEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<TargetingSpecOperationMinimumAgeOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationMinimumAgeOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationMinimumAgeOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecOperationMinimumAgeOperationEnum] to String,
/// and [decode] dynamic data back to [TargetingSpecOperationMinimumAgeOperationEnum].
class TargetingSpecOperationMinimumAgeOperationEnumTypeTransformer {
  factory TargetingSpecOperationMinimumAgeOperationEnumTypeTransformer() => _instance ??= const TargetingSpecOperationMinimumAgeOperationEnumTypeTransformer._();

  const TargetingSpecOperationMinimumAgeOperationEnumTypeTransformer._();

  String encode(TargetingSpecOperationMinimumAgeOperationEnum data) => data._value;

  /// Returns the instance of [TargetingSpecOperationMinimumAgeOperationEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecOperationMinimumAgeOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is TargetingSpecOperationMinimumAgeOperationEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'SET': return TargetingSpecOperationMinimumAgeOperationEnum.SET;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static TargetingSpecOperationMinimumAgeOperationEnumTypeTransformer? _instance;
}


