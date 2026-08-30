//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TargetingSpecOperationLocale {
  /// Returns a new [TargetingSpecOperationLocale] instance.
  TargetingSpecOperationLocale({
    required this.field,
    required this.operation,
    this.values = const [],
  });

  TargetingSpecOperationLocaleFieldEnum field;

  TargetingSpecListOperation operation;

  List<String> values;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TargetingSpecOperationLocale &&
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
  String toString() => 'TargetingSpecOperationLocale[field=$field, operation=$operation, values=$values]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'field'] = this.field;
      json[r'operation'] = this.operation;
      json[r'values'] = this.values;
    return json;
  }

  /// Returns a new [TargetingSpecOperationLocale] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TargetingSpecOperationLocale? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'field'), 'Required key "TargetingSpecOperationLocale[field]" is missing from JSON.');
        assert(json[r'field'] != null, 'Required key "TargetingSpecOperationLocale[field]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "TargetingSpecOperationLocale[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "TargetingSpecOperationLocale[operation]" has a null value in JSON.');
        assert(json.containsKey(r'values'), 'Required key "TargetingSpecOperationLocale[values]" is missing from JSON.');
        assert(json[r'values'] != null, 'Required key "TargetingSpecOperationLocale[values]" has a null value in JSON.');
        return true;
      }());

      return TargetingSpecOperationLocale(
        field: TargetingSpecOperationLocaleFieldEnum.fromJson(json[r'field'])!,
        operation: TargetingSpecListOperation.fromJson(json[r'operation'])!,
        values: json[r'values'] is Iterable
            ? (json[r'values'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<TargetingSpecOperationLocale> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationLocale>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationLocale.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TargetingSpecOperationLocale> mapFromJson(dynamic json) {
    final map = <String, TargetingSpecOperationLocale>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TargetingSpecOperationLocale.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TargetingSpecOperationLocale-objects as value to a dart map
  static Map<String, List<TargetingSpecOperationLocale>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TargetingSpecOperationLocale>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TargetingSpecOperationLocale.listFromJson(entry.value, growable: growable,);
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


enum TargetingSpecOperationLocaleFieldEnum {
  LOCALE._(r'LOCALE'),
  ;

  /// Instantiate a new enum with the provided value.
  const TargetingSpecOperationLocaleFieldEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [TargetingSpecOperationLocaleFieldEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static TargetingSpecOperationLocaleFieldEnum? fromJson(dynamic value) => TargetingSpecOperationLocaleFieldEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [TargetingSpecOperationLocaleFieldEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<TargetingSpecOperationLocaleFieldEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecOperationLocaleFieldEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecOperationLocaleFieldEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecOperationLocaleFieldEnum] to String,
/// and [decode] dynamic data back to [TargetingSpecOperationLocaleFieldEnum].
class TargetingSpecOperationLocaleFieldEnumTypeTransformer {
  factory TargetingSpecOperationLocaleFieldEnumTypeTransformer() => _instance ??= const TargetingSpecOperationLocaleFieldEnumTypeTransformer._();

  const TargetingSpecOperationLocaleFieldEnumTypeTransformer._();

  String encode(TargetingSpecOperationLocaleFieldEnum data) => data._value;

  /// Returns the instance of [TargetingSpecOperationLocaleFieldEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecOperationLocaleFieldEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is TargetingSpecOperationLocaleFieldEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'LOCALE': return TargetingSpecOperationLocaleFieldEnum.LOCALE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static TargetingSpecOperationLocaleFieldEnumTypeTransformer? _instance;
}


