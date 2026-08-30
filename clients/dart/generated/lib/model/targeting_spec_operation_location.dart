//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TargetingSpecOperationLocation {
  /// Returns a new [TargetingSpecOperationLocation] instance.
  TargetingSpecOperationLocation({
    required this.field,
    required this.operation,
    this.values = const [],
  });

  TargetingSpecOperationLocationFieldEnum field;

  TargetingSpecListOperation operation;

  List<String> values;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TargetingSpecOperationLocation &&
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
  String toString() => 'TargetingSpecOperationLocation[field=$field, operation=$operation, values=$values]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'field'] = this.field;
      json[r'operation'] = this.operation;
      json[r'values'] = this.values;
    return json;
  }

  /// Returns a new [TargetingSpecOperationLocation] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TargetingSpecOperationLocation? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'field'), 'Required key "TargetingSpecOperationLocation[field]" is missing from JSON.');
        assert(json[r'field'] != null, 'Required key "TargetingSpecOperationLocation[field]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "TargetingSpecOperationLocation[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "TargetingSpecOperationLocation[operation]" has a null value in JSON.');
        assert(json.containsKey(r'values'), 'Required key "TargetingSpecOperationLocation[values]" is missing from JSON.');
        assert(json[r'values'] != null, 'Required key "TargetingSpecOperationLocation[values]" has a null value in JSON.');
        return true;
      }());

      return TargetingSpecOperationLocation(
        field: TargetingSpecOperationLocationFieldEnum.fromJson(json[r'field'])!,
        operation: TargetingSpecListOperation.fromJson(json[r'operation'])!,
        values: json[r'values'] is Iterable
            ? (json[r'values'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<TargetingSpecOperationLocation> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationLocation>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationLocation.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TargetingSpecOperationLocation> mapFromJson(dynamic json) {
    final map = <String, TargetingSpecOperationLocation>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TargetingSpecOperationLocation.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TargetingSpecOperationLocation-objects as value to a dart map
  static Map<String, List<TargetingSpecOperationLocation>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TargetingSpecOperationLocation>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TargetingSpecOperationLocation.listFromJson(entry.value, growable: growable,);
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


enum TargetingSpecOperationLocationFieldEnum {
  LOCATION._(r'LOCATION'),
  ;

  /// Instantiate a new enum with the provided value.
  const TargetingSpecOperationLocationFieldEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [TargetingSpecOperationLocationFieldEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static TargetingSpecOperationLocationFieldEnum? fromJson(dynamic value) => TargetingSpecOperationLocationFieldEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [TargetingSpecOperationLocationFieldEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<TargetingSpecOperationLocationFieldEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationLocationFieldEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationLocationFieldEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecOperationLocationFieldEnum] to String,
/// and [decode] dynamic data back to [TargetingSpecOperationLocationFieldEnum].
class TargetingSpecOperationLocationFieldEnumTypeTransformer {
  factory TargetingSpecOperationLocationFieldEnumTypeTransformer() => _instance ??= const TargetingSpecOperationLocationFieldEnumTypeTransformer._();

  const TargetingSpecOperationLocationFieldEnumTypeTransformer._();

  String encode(TargetingSpecOperationLocationFieldEnum data) => data._value;

  /// Returns the instance of [TargetingSpecOperationLocationFieldEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecOperationLocationFieldEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is TargetingSpecOperationLocationFieldEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'LOCATION': return TargetingSpecOperationLocationFieldEnum.LOCATION;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static TargetingSpecOperationLocationFieldEnumTypeTransformer? _instance;
}


