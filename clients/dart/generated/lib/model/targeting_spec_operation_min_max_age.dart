//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TargetingSpecOperationMinMaxAge {
  /// Returns a new [TargetingSpecOperationMinMaxAge] instance.
  TargetingSpecOperationMinMaxAge({
    required this.field,
    required this.operation,
    required this.value,
  });

  TargetingSpecOperationMinMaxAgeFieldEnum field;

  TargetingSpecOperationMinMaxAgeOperationEnum operation;

  String? value;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TargetingSpecOperationMinMaxAge &&
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
  String toString() => 'TargetingSpecOperationMinMaxAge[field=$field, operation=$operation, value=$value]';

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

  /// Returns a new [TargetingSpecOperationMinMaxAge] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TargetingSpecOperationMinMaxAge? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TargetingSpecOperationMinMaxAge[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TargetingSpecOperationMinMaxAge[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TargetingSpecOperationMinMaxAge(
        field: TargetingSpecOperationMinMaxAgeFieldEnum.fromJson(json[r'field'])!,
        operation: TargetingSpecOperationMinMaxAgeOperationEnum.fromJson(json[r'operation'])!,
        value: mapValueOfType<String>(json, r'value'),
      );
    }
    return null;
  }

  static List<TargetingSpecOperationMinMaxAge> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationMinMaxAge>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationMinMaxAge.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TargetingSpecOperationMinMaxAge> mapFromJson(dynamic json) {
    final map = <String, TargetingSpecOperationMinMaxAge>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TargetingSpecOperationMinMaxAge.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TargetingSpecOperationMinMaxAge-objects as value to a dart map
  static Map<String, List<TargetingSpecOperationMinMaxAge>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TargetingSpecOperationMinMaxAge>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TargetingSpecOperationMinMaxAge.listFromJson(entry.value, growable: growable,);
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


class TargetingSpecOperationMinMaxAgeFieldEnum {
  /// Instantiate a new enum with the provided [value].
  const TargetingSpecOperationMinMaxAgeFieldEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const MINIMUM_AGE = TargetingSpecOperationMinMaxAgeFieldEnum._(r'MINIMUM_AGE');
  static const MAXIMUM_AGE = TargetingSpecOperationMinMaxAgeFieldEnum._(r'MAXIMUM_AGE');

  /// List of all possible values in this [enum][TargetingSpecOperationMinMaxAgeFieldEnum].
  static const values = <TargetingSpecOperationMinMaxAgeFieldEnum>[
    MINIMUM_AGE,
    MAXIMUM_AGE,
  ];

  static TargetingSpecOperationMinMaxAgeFieldEnum? fromJson(dynamic value) => TargetingSpecOperationMinMaxAgeFieldEnumTypeTransformer().decode(value);

  static List<TargetingSpecOperationMinMaxAgeFieldEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationMinMaxAgeFieldEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationMinMaxAgeFieldEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecOperationMinMaxAgeFieldEnum] to String,
/// and [decode] dynamic data back to [TargetingSpecOperationMinMaxAgeFieldEnum].
class TargetingSpecOperationMinMaxAgeFieldEnumTypeTransformer {
  factory TargetingSpecOperationMinMaxAgeFieldEnumTypeTransformer() => _instance ??= const TargetingSpecOperationMinMaxAgeFieldEnumTypeTransformer._();

  const TargetingSpecOperationMinMaxAgeFieldEnumTypeTransformer._();

  String encode(TargetingSpecOperationMinMaxAgeFieldEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TargetingSpecOperationMinMaxAgeFieldEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecOperationMinMaxAgeFieldEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'MINIMUM_AGE': return TargetingSpecOperationMinMaxAgeFieldEnum.MINIMUM_AGE;
        case r'MAXIMUM_AGE': return TargetingSpecOperationMinMaxAgeFieldEnum.MAXIMUM_AGE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TargetingSpecOperationMinMaxAgeFieldEnumTypeTransformer] instance.
  static TargetingSpecOperationMinMaxAgeFieldEnumTypeTransformer? _instance;
}



class TargetingSpecOperationMinMaxAgeOperationEnum {
  /// Instantiate a new enum with the provided [value].
  const TargetingSpecOperationMinMaxAgeOperationEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const SET = TargetingSpecOperationMinMaxAgeOperationEnum._(r'SET');

  /// List of all possible values in this [enum][TargetingSpecOperationMinMaxAgeOperationEnum].
  static const values = <TargetingSpecOperationMinMaxAgeOperationEnum>[
    SET,
  ];

  static TargetingSpecOperationMinMaxAgeOperationEnum? fromJson(dynamic value) => TargetingSpecOperationMinMaxAgeOperationEnumTypeTransformer().decode(value);

  static List<TargetingSpecOperationMinMaxAgeOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationMinMaxAgeOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationMinMaxAgeOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecOperationMinMaxAgeOperationEnum] to String,
/// and [decode] dynamic data back to [TargetingSpecOperationMinMaxAgeOperationEnum].
class TargetingSpecOperationMinMaxAgeOperationEnumTypeTransformer {
  factory TargetingSpecOperationMinMaxAgeOperationEnumTypeTransformer() => _instance ??= const TargetingSpecOperationMinMaxAgeOperationEnumTypeTransformer._();

  const TargetingSpecOperationMinMaxAgeOperationEnumTypeTransformer._();

  String encode(TargetingSpecOperationMinMaxAgeOperationEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TargetingSpecOperationMinMaxAgeOperationEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecOperationMinMaxAgeOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'SET': return TargetingSpecOperationMinMaxAgeOperationEnum.SET;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TargetingSpecOperationMinMaxAgeOperationEnumTypeTransformer] instance.
  static TargetingSpecOperationMinMaxAgeOperationEnumTypeTransformer? _instance;
}


