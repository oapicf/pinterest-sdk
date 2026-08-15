//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AudienceDefinitionScope {
  /// Returns a new [AudienceDefinitionScope] instance.
  AudienceDefinitionScope({
    this.scope,
  });

  AudienceDefinitionScopeScopeEnum? scope;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AudienceDefinitionScope &&
    other.scope == scope;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (scope == null ? 0 : scope!.hashCode);

  @override
  String toString() => 'AudienceDefinitionScope[scope=$scope]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.scope != null) {
      json[r'scope'] = this.scope;
    } else {
      json[r'scope'] = null;
    }
    return json;
  }

  /// Returns a new [AudienceDefinitionScope] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AudienceDefinitionScope? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AudienceDefinitionScope[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AudienceDefinitionScope[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AudienceDefinitionScope(
        scope: AudienceDefinitionScopeScopeEnum.fromJson(json[r'scope']),
      );
    }
    return null;
  }

  static List<AudienceDefinitionScope> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AudienceDefinitionScope>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AudienceDefinitionScope.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AudienceDefinitionScope> mapFromJson(dynamic json) {
    final map = <String, AudienceDefinitionScope>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AudienceDefinitionScope.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AudienceDefinitionScope-objects as value to a dart map
  static Map<String, List<AudienceDefinitionScope>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AudienceDefinitionScope>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AudienceDefinitionScope.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


class AudienceDefinitionScopeScopeEnum {
  /// Instantiate a new enum with the provided [value].
  const AudienceDefinitionScopeScopeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PARTNER = AudienceDefinitionScopeScopeEnum._(r'PARTNER');
  static const PINTEREST = AudienceDefinitionScopeScopeEnum._(r'PINTEREST');

  /// List of all possible values in this [enum][AudienceDefinitionScopeScopeEnum].
  static const values = <AudienceDefinitionScopeScopeEnum>[
    PARTNER,
    PINTEREST,
  ];

  static AudienceDefinitionScopeScopeEnum? fromJson(dynamic value) => AudienceDefinitionScopeScopeEnumTypeTransformer().decode(value);

  static List<AudienceDefinitionScopeScopeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AudienceDefinitionScopeScopeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AudienceDefinitionScopeScopeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AudienceDefinitionScopeScopeEnum] to String,
/// and [decode] dynamic data back to [AudienceDefinitionScopeScopeEnum].
class AudienceDefinitionScopeScopeEnumTypeTransformer {
  factory AudienceDefinitionScopeScopeEnumTypeTransformer() => _instance ??= const AudienceDefinitionScopeScopeEnumTypeTransformer._();

  const AudienceDefinitionScopeScopeEnumTypeTransformer._();

  String encode(AudienceDefinitionScopeScopeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AudienceDefinitionScopeScopeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AudienceDefinitionScopeScopeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'PARTNER': return AudienceDefinitionScopeScopeEnum.PARTNER;
        case r'PINTEREST': return AudienceDefinitionScopeScopeEnum.PINTEREST;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AudienceDefinitionScopeScopeEnumTypeTransformer] instance.
  static AudienceDefinitionScopeScopeEnumTypeTransformer? _instance;
}


