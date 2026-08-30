//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionDeletionRequestCreate {
  /// Returns a new [ConversionDeletionRequestCreate] instance.
  ConversionDeletionRequestCreate({
    required this.deletionTargets,
  });

  /// Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.
  ConversionDeletionRequestTargets deletionTargets;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionDeletionRequestCreate &&
    other.deletionTargets == deletionTargets;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (deletionTargets.hashCode);

  @override
  String toString() => 'ConversionDeletionRequestCreate[deletionTargets=$deletionTargets]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'deletion_targets'] = this.deletionTargets;
    return json;
  }

  /// Returns a new [ConversionDeletionRequestCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionDeletionRequestCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'deletion_targets'), 'Required key "ConversionDeletionRequestCreate[deletion_targets]" is missing from JSON.');
        assert(json[r'deletion_targets'] != null, 'Required key "ConversionDeletionRequestCreate[deletion_targets]" has a null value in JSON.');
        return true;
      }());

      return ConversionDeletionRequestCreate(
        deletionTargets: ConversionDeletionRequestTargets.fromJson(json[r'deletion_targets'])!,
      );
    }
    return null;
  }

  static List<ConversionDeletionRequestCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionDeletionRequestCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionDeletionRequestCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionDeletionRequestCreate> mapFromJson(dynamic json) {
    final map = <String, ConversionDeletionRequestCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionDeletionRequestCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionDeletionRequestCreate-objects as value to a dart map
  static Map<String, List<ConversionDeletionRequestCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionDeletionRequestCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionDeletionRequestCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'deletion_targets',
  };
}

