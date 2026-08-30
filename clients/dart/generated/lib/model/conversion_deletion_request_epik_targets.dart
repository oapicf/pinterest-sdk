//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionDeletionRequestEPIKTargets {
  /// Returns a new [ConversionDeletionRequestEPIKTargets] instance.
  ConversionDeletionRequestEPIKTargets({
    this.epiks = const [],
  });

  /// Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
  List<String> epiks;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionDeletionRequestEPIKTargets &&
    _deepEquality.equals(other.epiks, epiks);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (epiks.hashCode);

  @override
  String toString() => 'ConversionDeletionRequestEPIKTargets[epiks=$epiks]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'epiks'] = this.epiks;
    return json;
  }

  /// Returns a new [ConversionDeletionRequestEPIKTargets] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionDeletionRequestEPIKTargets? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'epiks'), 'Required key "ConversionDeletionRequestEPIKTargets[epiks]" is missing from JSON.');
        assert(json[r'epiks'] != null, 'Required key "ConversionDeletionRequestEPIKTargets[epiks]" has a null value in JSON.');
        return true;
      }());

      return ConversionDeletionRequestEPIKTargets(
        epiks: json[r'epiks'] is Iterable
            ? (json[r'epiks'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<ConversionDeletionRequestEPIKTargets> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionDeletionRequestEPIKTargets>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionDeletionRequestEPIKTargets.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionDeletionRequestEPIKTargets> mapFromJson(dynamic json) {
    final map = <String, ConversionDeletionRequestEPIKTargets>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionDeletionRequestEPIKTargets.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionDeletionRequestEPIKTargets-objects as value to a dart map
  static Map<String, List<ConversionDeletionRequestEPIKTargets>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionDeletionRequestEPIKTargets>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionDeletionRequestEPIKTargets.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'epiks',
  };
}

