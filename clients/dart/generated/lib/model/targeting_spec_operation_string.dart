//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TargetingSpecOperationString {
  /// Returns a new [TargetingSpecOperationString] instance.
  TargetingSpecOperationString({
    required this.field,
    required this.operation,
    required this.value,
  });

  String field;

  TargetingSpecOperationStringOperationEnum operation;

  String? value;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TargetingSpecOperationString &&
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
  String toString() => 'TargetingSpecOperationString[field=$field, operation=$operation, value=$value]';

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

  /// Returns a new [TargetingSpecOperationString] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TargetingSpecOperationString? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TargetingSpecOperationString[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TargetingSpecOperationString[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TargetingSpecOperationString(
        field: mapValueOfType<String>(json, r'field')!,
        operation: TargetingSpecOperationStringOperationEnum.fromJson(json[r'operation'])!,
        value: mapValueOfType<String>(json, r'value'),
      );
    }
    return null;
  }

  static List<TargetingSpecOperationString> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationString>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationString.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TargetingSpecOperationString> mapFromJson(dynamic json) {
    final map = <String, TargetingSpecOperationString>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TargetingSpecOperationString.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TargetingSpecOperationString-objects as value to a dart map
  static Map<String, List<TargetingSpecOperationString>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TargetingSpecOperationString>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TargetingSpecOperationString.listFromJson(entry.value, growable: growable,);
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


class TargetingSpecOperationStringOperationEnum {
  /// Instantiate a new enum with the provided [value].
  const TargetingSpecOperationStringOperationEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const SET = TargetingSpecOperationStringOperationEnum._(r'SET');

  /// List of all possible values in this [enum][TargetingSpecOperationStringOperationEnum].
  static const values = <TargetingSpecOperationStringOperationEnum>[
    SET,
  ];

  static TargetingSpecOperationStringOperationEnum? fromJson(dynamic value) => TargetingSpecOperationStringOperationEnumTypeTransformer().decode(value);

  static List<TargetingSpecOperationStringOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationStringOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationStringOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecOperationStringOperationEnum] to String,
/// and [decode] dynamic data back to [TargetingSpecOperationStringOperationEnum].
class TargetingSpecOperationStringOperationEnumTypeTransformer {
  factory TargetingSpecOperationStringOperationEnumTypeTransformer() => _instance ??= const TargetingSpecOperationStringOperationEnumTypeTransformer._();

  const TargetingSpecOperationStringOperationEnumTypeTransformer._();

  String encode(TargetingSpecOperationStringOperationEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TargetingSpecOperationStringOperationEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecOperationStringOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'SET': return TargetingSpecOperationStringOperationEnum.SET;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TargetingSpecOperationStringOperationEnumTypeTransformer] instance.
  static TargetingSpecOperationStringOperationEnumTypeTransformer? _instance;
}


