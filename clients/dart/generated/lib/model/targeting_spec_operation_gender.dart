//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TargetingSpecOperationGender {
  /// Returns a new [TargetingSpecOperationGender] instance.
  TargetingSpecOperationGender({
    required this.field,
    required this.operation,
    this.values = const [],
  });

  TargetingSpecOperationGenderFieldEnum field;

  TargetingSpecOperationGenderOperationEnum operation;

  List<TargetingSpecGender>? values;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TargetingSpecOperationGender &&
    other.field == field &&
    other.operation == operation &&
    _deepEquality.equals(other.values, values);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (field.hashCode) +
    (operation.hashCode) +
    (values == null ? 0 : values!.hashCode);

  @override
  String toString() => 'TargetingSpecOperationGender[field=$field, operation=$operation, values=$values]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'field'] = this.field;
      json[r'operation'] = this.operation;
    if (this.values != null) {
      json[r'values'] = this.values;
    } else {
      json[r'values'] = null;
    }
    return json;
  }

  /// Returns a new [TargetingSpecOperationGender] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TargetingSpecOperationGender? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TargetingSpecOperationGender[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TargetingSpecOperationGender[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TargetingSpecOperationGender(
        field: TargetingSpecOperationGenderFieldEnum.fromJson(json[r'field'])!,
        operation: TargetingSpecOperationGenderOperationEnum.fromJson(json[r'operation'])!,
        values: TargetingSpecGender.listFromJson(json[r'values']),
      );
    }
    return null;
  }

  static List<TargetingSpecOperationGender> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationGender>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationGender.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TargetingSpecOperationGender> mapFromJson(dynamic json) {
    final map = <String, TargetingSpecOperationGender>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TargetingSpecOperationGender.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TargetingSpecOperationGender-objects as value to a dart map
  static Map<String, List<TargetingSpecOperationGender>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TargetingSpecOperationGender>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TargetingSpecOperationGender.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'field',
    'operation',
    'values',
  };
}


class TargetingSpecOperationGenderFieldEnum {
  /// Instantiate a new enum with the provided [value].
  const TargetingSpecOperationGenderFieldEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const GENDER = TargetingSpecOperationGenderFieldEnum._(r'GENDER');

  /// List of all possible values in this [enum][TargetingSpecOperationGenderFieldEnum].
  static const values = <TargetingSpecOperationGenderFieldEnum>[
    GENDER,
  ];

  static TargetingSpecOperationGenderFieldEnum? fromJson(dynamic value) => TargetingSpecOperationGenderFieldEnumTypeTransformer().decode(value);

  static List<TargetingSpecOperationGenderFieldEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationGenderFieldEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationGenderFieldEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecOperationGenderFieldEnum] to String,
/// and [decode] dynamic data back to [TargetingSpecOperationGenderFieldEnum].
class TargetingSpecOperationGenderFieldEnumTypeTransformer {
  factory TargetingSpecOperationGenderFieldEnumTypeTransformer() => _instance ??= const TargetingSpecOperationGenderFieldEnumTypeTransformer._();

  const TargetingSpecOperationGenderFieldEnumTypeTransformer._();

  String encode(TargetingSpecOperationGenderFieldEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TargetingSpecOperationGenderFieldEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecOperationGenderFieldEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'GENDER': return TargetingSpecOperationGenderFieldEnum.GENDER;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TargetingSpecOperationGenderFieldEnumTypeTransformer] instance.
  static TargetingSpecOperationGenderFieldEnumTypeTransformer? _instance;
}



class TargetingSpecOperationGenderOperationEnum {
  /// Instantiate a new enum with the provided [value].
  const TargetingSpecOperationGenderOperationEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const SET = TargetingSpecOperationGenderOperationEnum._(r'SET');
  static const ADD = TargetingSpecOperationGenderOperationEnum._(r'ADD');
  static const REMOVE = TargetingSpecOperationGenderOperationEnum._(r'REMOVE');

  /// List of all possible values in this [enum][TargetingSpecOperationGenderOperationEnum].
  static const values = <TargetingSpecOperationGenderOperationEnum>[
    SET,
    ADD,
    REMOVE,
  ];

  static TargetingSpecOperationGenderOperationEnum? fromJson(dynamic value) => TargetingSpecOperationGenderOperationEnumTypeTransformer().decode(value);

  static List<TargetingSpecOperationGenderOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationGenderOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationGenderOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecOperationGenderOperationEnum] to String,
/// and [decode] dynamic data back to [TargetingSpecOperationGenderOperationEnum].
class TargetingSpecOperationGenderOperationEnumTypeTransformer {
  factory TargetingSpecOperationGenderOperationEnumTypeTransformer() => _instance ??= const TargetingSpecOperationGenderOperationEnumTypeTransformer._();

  const TargetingSpecOperationGenderOperationEnumTypeTransformer._();

  String encode(TargetingSpecOperationGenderOperationEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TargetingSpecOperationGenderOperationEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecOperationGenderOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'SET': return TargetingSpecOperationGenderOperationEnum.SET;
        case r'ADD': return TargetingSpecOperationGenderOperationEnum.ADD;
        case r'REMOVE': return TargetingSpecOperationGenderOperationEnum.REMOVE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TargetingSpecOperationGenderOperationEnumTypeTransformer] instance.
  static TargetingSpecOperationGenderOperationEnumTypeTransformer? _instance;
}


