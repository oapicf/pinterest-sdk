//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TargetingSpecOperationList {
  /// Returns a new [TargetingSpecOperationList] instance.
  TargetingSpecOperationList({
    required this.field,
    required this.operation,
    this.values = const [],
  });

  String field;

  TargetingSpecOperationListOperationEnum operation;

  List<String>? values;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TargetingSpecOperationList &&
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
  String toString() => 'TargetingSpecOperationList[field=$field, operation=$operation, values=$values]';

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

  /// Returns a new [TargetingSpecOperationList] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TargetingSpecOperationList? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TargetingSpecOperationList[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TargetingSpecOperationList[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TargetingSpecOperationList(
        field: mapValueOfType<String>(json, r'field')!,
        operation: TargetingSpecOperationListOperationEnum.fromJson(json[r'operation'])!,
        values: json[r'values'] is Iterable
            ? (json[r'values'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<TargetingSpecOperationList> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationList>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationList.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TargetingSpecOperationList> mapFromJson(dynamic json) {
    final map = <String, TargetingSpecOperationList>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TargetingSpecOperationList.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TargetingSpecOperationList-objects as value to a dart map
  static Map<String, List<TargetingSpecOperationList>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TargetingSpecOperationList>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TargetingSpecOperationList.listFromJson(entry.value, growable: growable,);
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


class TargetingSpecOperationListOperationEnum {
  /// Instantiate a new enum with the provided [value].
  const TargetingSpecOperationListOperationEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const SET = TargetingSpecOperationListOperationEnum._(r'SET');
  static const ADD = TargetingSpecOperationListOperationEnum._(r'ADD');
  static const REMOVE = TargetingSpecOperationListOperationEnum._(r'REMOVE');

  /// List of all possible values in this [enum][TargetingSpecOperationListOperationEnum].
  static const values = <TargetingSpecOperationListOperationEnum>[
    SET,
    ADD,
    REMOVE,
  ];

  static TargetingSpecOperationListOperationEnum? fromJson(dynamic value) => TargetingSpecOperationListOperationEnumTypeTransformer().decode(value);

  static List<TargetingSpecOperationListOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationListOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationListOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecOperationListOperationEnum] to String,
/// and [decode] dynamic data back to [TargetingSpecOperationListOperationEnum].
class TargetingSpecOperationListOperationEnumTypeTransformer {
  factory TargetingSpecOperationListOperationEnumTypeTransformer() => _instance ??= const TargetingSpecOperationListOperationEnumTypeTransformer._();

  const TargetingSpecOperationListOperationEnumTypeTransformer._();

  String encode(TargetingSpecOperationListOperationEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TargetingSpecOperationListOperationEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecOperationListOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'SET': return TargetingSpecOperationListOperationEnum.SET;
        case r'ADD': return TargetingSpecOperationListOperationEnum.ADD;
        case r'REMOVE': return TargetingSpecOperationListOperationEnum.REMOVE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TargetingSpecOperationListOperationEnumTypeTransformer] instance.
  static TargetingSpecOperationListOperationEnumTypeTransformer? _instance;
}


