//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TargetingSpecOperationAppType {
  /// Returns a new [TargetingSpecOperationAppType] instance.
  TargetingSpecOperationAppType({
    required this.field,
    required this.operation,
    this.values = const [],
  });

  TargetingSpecOperationAppTypeFieldEnum field;

  TargetingSpecListOperation operation;

  List<TargetingSpecAppType> values;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TargetingSpecOperationAppType &&
    other.field == field &&
    other.operation == operation &&
    _deepEquality.equals(other.values, values);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (field.hashCode) +
    (operation.hashCode) +
    (values.hashCode);

  @override
  String toString() => 'TargetingSpecOperationAppType[field=$field, operation=$operation, values=$values]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'field'] = this.field;
      json[r'operation'] = this.operation;
      json[r'values'] = this.values;
    return json;
  }

  /// Returns a new [TargetingSpecOperationAppType] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TargetingSpecOperationAppType? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'field'), 'Required key "TargetingSpecOperationAppType[field]" is missing from JSON.');
        assert(json[r'field'] != null, 'Required key "TargetingSpecOperationAppType[field]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "TargetingSpecOperationAppType[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "TargetingSpecOperationAppType[operation]" has a null value in JSON.');
        assert(json.containsKey(r'values'), 'Required key "TargetingSpecOperationAppType[values]" is missing from JSON.');
        assert(json[r'values'] != null, 'Required key "TargetingSpecOperationAppType[values]" has a null value in JSON.');
        return true;
      }());

      return TargetingSpecOperationAppType(
        field: TargetingSpecOperationAppTypeFieldEnum.fromJson(json[r'field'])!,
        operation: TargetingSpecListOperation.fromJson(json[r'operation'])!,
        values: TargetingSpecAppType.listFromJson(json[r'values']),
      );
    }
    return null;
  }

  static List<TargetingSpecOperationAppType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationAppType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationAppType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TargetingSpecOperationAppType> mapFromJson(dynamic json) {
    final map = <String, TargetingSpecOperationAppType>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TargetingSpecOperationAppType.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TargetingSpecOperationAppType-objects as value to a dart map
  static Map<String, List<TargetingSpecOperationAppType>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TargetingSpecOperationAppType>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TargetingSpecOperationAppType.listFromJson(entry.value, growable: growable,);
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


enum TargetingSpecOperationAppTypeFieldEnum {
  APPTYPE._(r'APPTYPE'),
  ;

  /// Instantiate a new enum with the provided value.
  const TargetingSpecOperationAppTypeFieldEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [TargetingSpecOperationAppTypeFieldEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static TargetingSpecOperationAppTypeFieldEnum? fromJson(dynamic value) => TargetingSpecOperationAppTypeFieldEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [TargetingSpecOperationAppTypeFieldEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<TargetingSpecOperationAppTypeFieldEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationAppTypeFieldEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationAppTypeFieldEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecOperationAppTypeFieldEnum] to String,
/// and [decode] dynamic data back to [TargetingSpecOperationAppTypeFieldEnum].
class TargetingSpecOperationAppTypeFieldEnumTypeTransformer {
  factory TargetingSpecOperationAppTypeFieldEnumTypeTransformer() => _instance ??= const TargetingSpecOperationAppTypeFieldEnumTypeTransformer._();

  const TargetingSpecOperationAppTypeFieldEnumTypeTransformer._();

  String encode(TargetingSpecOperationAppTypeFieldEnum data) => data._value;

  /// Returns the instance of [TargetingSpecOperationAppTypeFieldEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecOperationAppTypeFieldEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is TargetingSpecOperationAppTypeFieldEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'APPTYPE': return TargetingSpecOperationAppTypeFieldEnum.APPTYPE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static TargetingSpecOperationAppTypeFieldEnumTypeTransformer? _instance;
}


